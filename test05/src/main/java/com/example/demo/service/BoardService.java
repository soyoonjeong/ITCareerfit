package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import com.example.demo.repository.BoardRepository;
import com.example.demo.domain.Board;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BoardService {
    public final BoardRepository boardRepository;

    //등록
    public void register(Board board) {
    	System.out.println(board.getIdx());
    	boardRepository.save(board);
    }
    //목록
    public List<Board> list(){
    	return boardRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
    }
    //상세보기
    public Board detail(int idx) {
    	return boardRepository.findById(idx).orElse(null);
    }
    //수정
    public void update(Board board) {
    	boardRepository.save(board);
    }
    //삭제
    public void delete(int idx) {
    	boardRepository.deleteById(idx);
    }
}