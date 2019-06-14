package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.SearchKeywordDAO;
import com.app.domain.SearchResultEntity;
import com.app.service.SearchService;

@Service
public class SearchServiceImpl implements SearchService{

	@Autowired
	private SearchKeywordDAO searchKeywordDAO;
	@Override
	public List<SearchResultEntity> getKeywordStats(String keyword) {
		return searchKeywordDAO.getKeywordStats(keyword);
	}

}
