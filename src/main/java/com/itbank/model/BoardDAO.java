package com.itbank.model;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.itbank.vo.BoardVO;

public interface BoardDAO {

	@Select("select * from board order by idx desc")
	List<BoardVO> selectAll();

	@Insert("insert into board(title, contents, nick, userid) values(#{title}, #{contents}, #{nick}, #{userid})")
	int insert(BoardVO input);

	@Delete("delete board where idx = #{idx}")
	int delete(int idx);

	@Select("select * from board where idx = #{idx}")
	BoardVO selectOne(int idx);

	@Update("update board " + 
			"set " + 
			"title = #{title}, " + 
			"nick = #{nick}, " + 
			"userid = #{userid}, " + 
			"contents = #{contents}" + 
			"where idx = #{idx}")
	int update(BoardVO input);

}
