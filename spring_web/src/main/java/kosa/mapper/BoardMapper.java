package kosa.mapper; // kosa.mapper안에 꼭 있어야한다. (namespace때문)

import java.util.List;

import kosa.model.Board;

public interface BoardMapper {
	int insertBoard(Board board);
	List<Board> listBoard();
	Board showDetailBoard(int seq);
}
