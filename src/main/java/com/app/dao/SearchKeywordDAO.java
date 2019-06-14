package com.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.app.domain.SearchResultEntity;

@Repository
public interface SearchKeywordDAO {
	List<SearchResultEntity> getKeywordStats(String keyword);
}
