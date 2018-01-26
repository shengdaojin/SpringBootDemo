package com.test.service;

import com.test.dao.PersonRepository;
import com.test.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/***************************************************************************
 * <pre>
 * 文件名称:  PersonService
 * 包   路   径：  com.test.service
 * 版权所有:  中国国际电子商务中心  (C) 2018
 *</pre>
 *<pre>
 * 类描述:  
 * Revision : $ Revision: 1.1 $
 * 创建人： Andrew
 * 创建时间：2018/1/25 09:46  
 * 修改人：Andrew Sheng  
 * @author Andrew Sheng 
 * 修改时间：2018/1/25 09:46  
 * </pre>
 * <pre>
 *  1. 修改记录：
 *    -----------------------------------------------------------------------------------------------
 *              时间         |       修改人     |         修改的方法          |         修改描述
 *    -----------------------------------------------------------------------------------------------
 *                  		|                 |                           |
 *    -----------------------------------------------------------------------------------------------
 * </pre>
 ***************************************************************************/
@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    /**
     * 事务管理测试
     * 两条数据同时成功，或者同时不成功
     * 保证数据库数据的完整性和一致性
     */
    @Transactional
    public void insertTwo(){
        Person personA = new Person();
        personA.setName("秋雅");
        personA.setAge(19);
        personRepository.save(personA);

        System.out.print(1/0);

        Person personB = new Person();
        personB.setName("梦特娇");
        personB.setAge(25);
        personRepository.save(personB);
    }
}
