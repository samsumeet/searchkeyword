package com.app.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.app.controller.SearchAPI;
import com.app.domain.SearchResultEntity;
import com.app.service.SearchService;

@Component
public class SearchAPIImpl implements SearchAPI {
	@Autowired
	private SearchService searchService;

	@Override
	public ResponseEntity<List<SearchResultEntity>> searchKeyword(String keyword) {
		return new ResponseEntity<List<SearchResultEntity>>(searchService.getKeywordStats(keyword), HttpStatus.OK);

	}

}
