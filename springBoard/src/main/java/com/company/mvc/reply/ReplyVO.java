package com.company.mvc.reply;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
public class ReplyVO {
	private Long rno;
	private Long bno;
	
	private String reply;
	//@JsonAlias(value = "writer") //필드명 변경할 때 사용
	private String replyer;
	@JsonFormat(pattern ="yyyy-MM-dd")
	private Date replyDate;
	@JsonIgnore //updateDate필드는 빠짐
	private Date updateDate;
}
