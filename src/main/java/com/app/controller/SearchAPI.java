package com.app.controller;



import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.domain.SearchResultEntity;

@RestController

public interface SearchAPI {

	@GetMapping(value = "/estimate", produces = { MediaType.APPLICATION_JSON_VALUE })
	ResponseEntity<List<SearchResultEntity>> searchKeyword(@RequestParam("keyword") String keyword);
}
