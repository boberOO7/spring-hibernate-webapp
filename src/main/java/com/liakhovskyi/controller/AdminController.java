package com.liakhovskyi.controller;

import com.liakhovskyi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {


    @Autowired
    private UserService userService;

    @RequestMapping(value = "admin/manage-roles", method = RequestMethod.GET)
    public ModelAndView manageRoles(ModelAndView vm) {
        vm.addObject("roles", userService.getAllRoles());
        vm.addObject("users", userService.getAllUsers());
        vm.setViewName("admin");
        return vm;
    }

}
