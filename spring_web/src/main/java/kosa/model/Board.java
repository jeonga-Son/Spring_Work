package kosa.model;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

//JSR 303
public class Board {
	private int seq;
	
	@NotEmpty(message = "Á¦¸ñÀ» ¹Ýµå½Ã ÀÔ·ÂÇÏ¼¼¿ä.")
	@Size(min = 2, max = 5, message = "2~5ÀÚ ÀÔ·Â")
	private String title;
	
	@Pattern(regexp = "[0-9a-zA-Z°¡-ÆR]*", message = "Æ¯¼ö¹®ÀÚ ±ÝÁö")
	private String writer;
	
	private String content;
	private String regdate;
	private int hitcount;
	
	public Board() {}

	public Board(int seq, String title, String writer, String content, String regdate, int hitcount) {
		super();
		this.seq = seq;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.regdate = regdate;
		this.hitcount = hitcount;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public int getHitcount() {
		return hitcount;
	}

	public void setHitcount(int hitcount) {
		this.hitcount = hitcount;
	}

	@Override
	public String toString() {
		return "Board [seq=" + seq + ", title=" + title + ", writer=" + writer + ", content=" + content + ", regdate="
				+ regdate + ", hitcount=" + hitcount + "]";
	}
	
}
