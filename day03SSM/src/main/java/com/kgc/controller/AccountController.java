package com.kgc.controller;

import com.kgc.domain.Account;
import com.kgc.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("account")
public class AccountController {

    @Autowired
    private IAccountService accountService;

    /**
     * 接收查询所有请求
     * @return
     */
    @RequestMapping("findAll")
    public ModelAndView findAll(){
        ModelAndView res = new ModelAndView();
        res.addObject("list",accountService.findAll());
        res.setViewName("list");
        return res;
    }

    /**
     * 接收保存（新增）账户的请求
     * 转发到展示全部账户信息
     * @return
     */
    @RequestMapping("saveAccount")
    public void saveAccount(HttpServletRequest request, HttpServletResponse response, Account account) throws IOException {
        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath()+"/account/findAll");
    }
}
