package com.young.y1;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.young.y1.board.BoardCrudRepository;
import com.young.y1.board.BoardVO;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardRepositoryTest {

	@Autowired
	private  BoardCrudRepository  boardRepo;
	
	//@Test
	public  void  testInsertBoard() {
		
		for(int i = 1; i <= 10; i++){
			BoardVO board = new BoardVO();
			board.setTitle("첫번째 게시글"+i);
			board.setWriter("영심이"+i);
			board.setContent("JPA 테스트"+i);
			board.setCreateDate(new Date());
			board.setCnt(1L);
			boardRepo.save(board);
		}
		
	}
}