package kosa.mapper; // kosa.mapper�ȿ� �� �־���Ѵ�. (namespace����)

import java.util.List;

import kosa.model.Board;

public interface BoardMapper {
	int insertBoard(Board board);
	List<Board> listBoard();
	Board showDetailBoard(int seq);
}
