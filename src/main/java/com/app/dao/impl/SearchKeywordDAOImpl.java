package com.app.dao.impl;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;
import java.util.Map;

import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.app.dao.SearchKeywordDAO;
import com.app.domain.SearchResultEntity;
import com.app.utility.Utility;

@Component
public class SearchKeywordDAOImpl implements SearchKeywordDAO {

	@Override
	public List<SearchResultEntity> getKeywordStats(String keyword) {
		List<SearchResultEntity> searchResultEntity = new ArrayList<>();

		if (Utility.keywordMap.containsKey(keyword)) {
			Utility.keywordMap.put(keyword, Utility.keywordMap.get(keyword).intValue() + 1);

		} else {
			Utility.keywordMap.put(keyword, 1);
		}
		List<String> sortedKeywordList = Utility.keywordMap.entrySet().stream()
				.filter(k -> k.getKey().contains(keyword))
				.sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).map(e -> e.getKey()).limit(10)
				.collect(Collectors.toList());

		if (sortedKeywordList.size() > 0) {
			searchResultEntity = sortedKeywordList.stream().map(e -> {
				SearchResultEntity searchResult = new SearchResultEntity();
				searchResult.setKEYWORD(e);
				searchResult.setScore(Math.round((Utility.keywordMap.get(e).floatValue()
						/ (Utility.keywordMap.values().stream().mapToDouble(Integer::doubleValue).sum()))*100));
				return searchResult;
			}).collect(Collectors.toList());
		}
		return searchResultEntity;
	}

}
