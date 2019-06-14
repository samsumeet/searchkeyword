package com.app.service;

import java.util.List;

import com.app.domain.SearchResultEntity;

public interface SearchService {
	public List<SearchResultEntity> getKeywordStats(String keyword);
}
