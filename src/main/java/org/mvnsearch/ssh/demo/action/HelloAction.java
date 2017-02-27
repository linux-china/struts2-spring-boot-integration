package org.mvnsearch.ssh.demo.action;

import com.opensymphony.xwork2.ActionSupport;
import org.mvnsearch.ssh.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class HelloAction extends ActionSupport {

    @Autowired
    private UserService userService;

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }


}