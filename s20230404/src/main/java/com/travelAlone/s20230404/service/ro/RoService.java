package com.travelAlone.s20230404.service.ro;

import java.util.List;

import com.travelAlone.s20230404.model.Board;
import com.travelAlone.s20230404.model.BodImg;
import com.travelAlone.s20230404.model.dto.ro.BoardWriteRequestDto;
import org.springframework.web.multipart.MultipartFile;

public interface RoService {

	int 				boardAllCnt();
	List<Board> 		listAllBoard(Board board);
	int 				boardCnt(Board board);
	List<Board> 		listBoard(Board board);
	int 				veiwCount(int board_id);
	List<Board> 		detailBoard(long board_id);
	int 				insertBoard(BoardWriteRequestDto requestDto, List<MultipartFile> files) throws Exception;
	int 				insertReBoard(Board board);
	int 				deleteBoard(long board_id);
	void				deleteReBoard(Board board);
	int					updateReBoard(Board board);
	int 				updateBoard(Board board, List<MultipartFile> imgFiles);
	int 				deleteImgBoard(BodImg bodImg);
	List<BodImg> 		listImgBoard(long board_id);
	
}
