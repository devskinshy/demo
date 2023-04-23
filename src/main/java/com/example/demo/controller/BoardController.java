package com.example.demo.controller;

import com.example.demo.dto.BoardDTO;
import com.example.demo.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class BoardController {
    BoardService boardService;

    @Autowired
    public BoardController(BoardService  boardService) {
        this.boardService = boardService;
    }

    @RequestMapping("/")
    public String Index(Model model) {
        ArrayList<BoardDTO> boards = boardService.getBoard();

        model.addAttribute("boards", boards);

        return "ssr/index";
    }

    @RequestMapping("/create")
    public String Create(Model model) {
        return "ssr/create";
    }

    @PostMapping("/submit")
    public String createSubmit(BoardDTO board, Model model) {
        try {
            boardService.createBoard(board);
        } catch (Exception e) {

        }

        return "redirect:/";
    }

    @GetMapping("/boards")
    public String Boards() {
        return "csr/index";
    }

    @GetMapping("/boards/create")
    public String BoardsCreate() {
        return "csr/create";
    }
}
