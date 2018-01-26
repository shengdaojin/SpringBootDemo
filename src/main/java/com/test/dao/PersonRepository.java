package com.test.dao;

import com.test.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/***************************************************************************
 * <pre>
 * 文件名称:  PersonRepository
 * 包   路   径：  com.test.dao
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
public interface PersonRepository extends JpaRepository<Person,Integer> {
    /**
     *  通过年龄来查询
     *  方法名固定findByAge
     * @param age
     * @return
     */
    public List<Person> findByAge(Integer age);
}
