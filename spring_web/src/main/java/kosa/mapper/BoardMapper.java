package kosa.mapper; // kosa.mapper�ȿ� �� �־���Ѵ�. (namespace����)

import java.util.List;

import kosa.model.Board;
import kosa.model.Search;

public interface BoardMapper {
	int insertBoard(Board board);
//	List<Board> listBoard();
	List<Board> listBoard(Search search);
	Board showDetailBoard(int seq);
}
