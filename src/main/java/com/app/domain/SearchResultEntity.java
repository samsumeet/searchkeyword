package com.app.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SearchResultEntity {

	private String KEYWORD;
	private long score;
}
