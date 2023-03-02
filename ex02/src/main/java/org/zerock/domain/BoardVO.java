package org.zerock.domain;

import java.util.Date;

import lombok.Data;

@Data // lombok에서 사용할 수 있는 set, get 메소드 자동으로 생성
public class BoardVO {

  private Long bno;
  private String title;
  private String content;
  private String writer;
  private Date regdate;
  private Date updateDate;
}
