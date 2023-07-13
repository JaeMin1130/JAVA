package com.rubypaper.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder // 빌드 패턴 이용 가능
public class BoardVO {
	private int seq;
	private String title;
	private String writer;
	private String content;
	private final Date createDate = new Date();
	private int cnt = 0;
}
