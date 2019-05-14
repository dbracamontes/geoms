package com.bracamod.geo.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.IndexQuery;
import org.springframework.stereotype.Service;

@Service
public class IndexService {

    private  static  final  String INDEX_NAME = "geo_index";
    private  static  final  String STATE_INDEX_TYPE = "state_type";
	
	@Autowired
	ElasticsearchTemplate elasticSearchTemplate;
	
	public void builkIndex() {
		if(elasticSearchTemplate.indexExists(INDEX_NAME)) {
			elasticSearchTemplate.createIndex(INDEX_NAME);
		}
		
		List<IndexQuery> queries = new ArrayList<>();
	}
	
}
