package kosa.mapper; // kosa.mapper안에 꼭 있어야한다. (namespace때문)

import java.util.List;

import kosa.model.Board;
import kosa.model.Search;

public interface BoardMapper {
	int insertBoard(Board board);
//	List<Board> listBoard();
	List<Board> listBoard(Search search);
	Board showDetailBoard(int seq);
}
