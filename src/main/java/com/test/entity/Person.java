package com.test.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/***************************************************************************
 * <pre>
 * 文件名称:  Person
 * 包   路   径：  com.test.entity
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
@Entity
public class Person {
    @Id
    @GeneratedValue
    private  Integer id;
    private String name;
    private Integer age;

    //必须要有构造函数
    public Person() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
