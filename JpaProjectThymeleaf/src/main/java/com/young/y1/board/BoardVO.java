package com.young.y1.board;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Data
@Entity
@Table(name="T0808")
public class BoardVO {
	@Id  // 기본키
	@GeneratedValue  // 자동증가 
	private  Long  seq;
	private  String  title;  // nullable = false 값 필수 입력 (기본: false )
	private  String writer;
	private  String content;
	// @Temporal 는 날짜 데이터를 매핑할때 사용
	@Temporal(value = TemporalType.TIMESTAMP)
	private  Date CreateDate;
	private  Long cnt;
}