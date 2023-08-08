package com.young.y1.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	BoardCrudRepository service; 
	
	@Override
	public BoardVO getBoard(BoardVO vo) {
		Long k = vo.getSeq();
		return service.findById(k).get();
	}

	@Override
	public void cnt(BoardVO vo) {
		Long k = vo.getSeq();
		vo = service.findById(k).get();
		vo.setCnt(vo.getCnt()+1);
		service.save(vo);
	}

}
