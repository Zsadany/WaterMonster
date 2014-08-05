package org.wmonster.wshop.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

public class ProductDao {

	@Autowired
	MongoTemplate template;

}
