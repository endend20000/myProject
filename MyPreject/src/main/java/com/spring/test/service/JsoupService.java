package com.spring.test.service;

import java.util.List;
import java.util.Map;

import com.spring.common.model.BaseResult;

public interface JsoupService {
	List<Map<String,Object>> data(String page,String rows,String keyword) throws Exception;
	BaseResult  torrent(String url,String type) throws Exception;
}
