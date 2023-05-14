package com.example.demo.controller;

import com.example.demo.dto.BoardDTO;
import com.example.demo.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;

@RequestMapping("/api/boards")
@RestController
public class BoardAPIController {
    BoardService boardService;

    @Autowired
    public BoardAPIController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping("/")
    public ArrayList<BoardDTO> Index() {
        ArrayList<BoardDTO> boards = boardService.getBoard();
        System.out.println(boards);

        return boards;
    }

    @PostMapping("/") // post /api/board/
    public void Create(@RequestBody BoardDTO board) {

        System.out.println("test");
        System.out.println(board);

        boardService.createBoard(board);
    }
}
