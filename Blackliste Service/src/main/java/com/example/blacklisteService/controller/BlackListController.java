package com.example.blacklisteService.controller;

import com.example.blacklisteService.BlackListService.BlackListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/blacklist")
public class BlackListController {
    @Autowired
    BlackListService blackListService;
    @RequestMapping(value = "/{cin}", method = RequestMethod.GET)

    public boolean verifier(@PathVariable("cin") Long cin)
    {
        return  blackListService.getIsInBlackList(cin);
    }
}
