package com.test.controller;

import com.test.dao.PersonRepository;
import com.test.entity.Person;
import com.test.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/***************************************************************************
 * <pre>
 * 文件名称:  PersonController
 * 包   路   径：  com.test.controller
 *</pre>
 *<pre>
 * 类描述:  
 * Revision : $ Revision: 1.1 $
 * 创建人： Andrew
 * 创建时间：2018/1/25 09:49  
 * 修改人：Andrew Sheng  
 * @author Andrew Sheng 
 * 修改时间：2018/1/25 09:49  
 * </pre>
 * <pre>
 *  1. 修改记录：
 *    -----------------------------------------------------------------------------------------------
 *              时间         |       修改人     |         修改的方法          |         修改描述
 *    -----------------------------------------------------------------------------------------------
 *                  		|                 |                           |
 *    -----------------------------------------------------------------------------------------------
 * </pre>
 ***************************************************************************/@RestController
public class PersonController {
    @Autowired
    PersonRepository personRepository;
    @GetMapping(value = "/person")
    private List<Person> personList() {
        return personRepository.findAll();
    }

    /**
     * 添加一个人员
     *
     * @param name
     * @param age
     * @return
     */
    @PostMapping(value = "/person")
    public Person personAdd(@RequestParam("name") String name,
                            @RequestParam("age") Integer age) {
        Person person = new Person();
        person.setName(name);
        person.setAge(age);

        return personRepository.save(person);
    }

    /**
     * 查询一个人员
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/person/{id}")
    public Person personFindOne(@PathVariable("id") Integer id) {
        return personRepository.findOne(id);
    }

    /**
     * 删除一个人员
     *
     * @param id
     */
    @DeleteMapping(value = "/person/{id}")
    public void personDelete(@PathVariable("id") Integer id) {
        personRepository.delete(id);
    }

    /**
     * 更新一个人员
     *
     * @param id
     * @param name
     * @param age
     * @return
     */
    @PutMapping(value = "/person/{id}")
    public Person personUpdate(@PathVariable("id") Integer id,
                               @RequestParam("name") String name,
                               @RequestParam("age") Integer age) {
        Person person = new Person();
        person.setId(id);
        person.setName(name);
        person.setAge(age);
        return personRepository.save(person);
    }

    /**
     * 通过年龄来查询
     * @param age
     * @return
     */
    @GetMapping(value = "/person/age/{age}")
    public List<Person> personListByAge(@PathVariable("age") Integer age) {
        return personRepository.findByAge(age);
    }


    @Autowired
    private PersonService personService;

    /**
     * 事务测试
     */
    @PostMapping("/person/two")
    public void personTwo(){
        personService.insertTwo();
    }
}
