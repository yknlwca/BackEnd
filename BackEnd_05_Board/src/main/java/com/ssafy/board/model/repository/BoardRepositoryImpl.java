package com.ssafy.board.model.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ssafy.board.model.dto.Board;

// 싱글턴 관리
public class BoardRepositoryImpl implements BoardRepository {
	// DB와 연결되어 해당 로직을 호출

	private static BoardRepository repository = new BoardRepositoryImpl();

	// 메모리를 DB라 생각하고 처리
	private List<Board> list = new ArrayList<>(); // 리스트 관리
	private Map<Integer, Board> boards = new HashMap<>(); // 맵으로 관리

	private BoardRepositoryImpl() {
		boards.put(1, new Board("SSAFY 완벽가이드", "명균", "1학기 이수 하자"));

	}

	public static BoardRepository getInstance() {
		return repository;
	}

	@Override
	public List<Board> selectAll() {
//		return list;

//		return (List <Board>)boards.values();

		List<Board> tmp = new ArrayList<>();

		for (int i : boards.keySet()) {
			tmp.add(boards.get(i));
		}

		return tmp;

	}

	@Override
	public Board selectOne(int id) {

//		for (Board b : list) {
//			if(b.getId() == id)
//				return b;
//		}
		

		return boards.get(id);

	}

	@Override
	public void insertBoard(Board board) {
		boards.put(board.getId(), board); // ID를 Key로 저장
		list.add(board); // 리스트 저장 가능

	}

	@Override
	public void updateBoard(Board board) {
		boards.put(board.getId(), board);
	}

	@Override
	public void deleteBoard(int id) {
		boards.remove(id);

	}

	@Override
	public void updateViewCnt(int id) {
		Board b = boards.get(id);
		b.setViewCnt(b.getViewCnt() + 1);

	}

}
