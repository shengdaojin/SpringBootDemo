package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/***************************************************************************
 * <pre>
 * 文件名称:  HelloController
 * 包   路   径：  com.test
 *</pre>
 *<pre>
 * 类描述:  
 * Revision : $ Revision: 1.1 $
 * 创建人： Andrew
 * 创建时间：2018/1/25 09:35  
 * 修改人：Andrew Sheng  
 * @author Andrew Sheng 
 * 修改时间：2018/1/25 09:35  
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
@Controller
public class HelloController {
    @RequestMapping("/index")
    public String index(){
        return "welcome";
    }
}
