package com.example.demo.controller;

import com.example.demo.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {
    BoardService boardService;

    @Autowired
    public BoardController(BoardService  boardService) {
        this.boardService = boardService;
    }

    @RequestMapping("/")
    public String Index(Model model) {
        String text = boardService.getBoard();
        model.addAttribute("text", text);
        return "index";
    }
}
