package com.example.demo.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.admin.IAdminRepository;

@RestController @RequestMapping("/connexion/admin")
public class ControlAdmin {

	IAdminRepository iAdminRepository;
}
