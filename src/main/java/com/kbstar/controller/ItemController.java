package com.kbstar.controller;

import com.github.pagehelper.PageInfo;
import com.kbstar.dto.Item;
import com.kbstar.service.ItemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@Slf4j
@RestController //ajax 통신을 위해서는 레스트 컨트롤러가 필요함
@RequestMapping("/item")
public class ItemController {

    @Autowired
    ItemService itemService;

    String dir = "item/";

    @RequestMapping("")
    public String main(Model model){
        model.addAttribute("left",dir+"left");
        model.addAttribute("center",dir+"center");
        return "index";
    }

    @RequestMapping("/add")
    public String add(Model model){
        model.addAttribute("left",dir+"left");
        model.addAttribute("center",dir+"add");
        return "index";
    }

    @RequestMapping("/top")
    public String top(@RequestParam(required = false, defaultValue = "1") int pageNo, Integer cateNo, Model model) throws Exception {
        int cateNum = 100;
        log.info("cateNo={}", cateNo);

        PageInfo<List<Item>> p  = new PageInfo<>(itemService.getTopcate(pageNo, cateNo), 5); // 5:하단 네비게이션 개수
//        PageInfo<List<Item>> p  = new PageInfo<>(itemService.getTopcate(pageNo, cateNo), 5); // 5:하단 네비게이션 개수

        model.addAttribute("target","item");
        model.addAttribute("uri","top");
        model.addAttribute("cpage",p);
        model.addAttribute("left",dir+"topleft");
        model.addAttribute("center",dir+"center");
        return "index";
    }

}
