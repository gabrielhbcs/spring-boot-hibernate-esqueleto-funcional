package com.uff.br.controllers;

import com.uff.br.DAO.AuthDAO;
import com.uff.br.entities.Auth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/demo")
public class AuthController {
    @Autowired
    private AuthDAO authDAO;

    @PostMapping(path="/add")
    public @ResponseBody String addNewUser (@RequestParam String name
            , @RequestParam String email) {

        Auth n = new Auth();
        n.setEmail(name);
        n.setSenha(email);
        authDAO.save(n);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Auth> getAllUsers() {
        return authDAO.findAll();
    }
}