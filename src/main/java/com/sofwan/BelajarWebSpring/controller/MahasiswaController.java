package com.sofwan.BelajarWebSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MahasiswaController {
    @RequestMapping("/mahasiswa")
    public String MahasiswaList(){

        return "mahasiswa";
    }
}
