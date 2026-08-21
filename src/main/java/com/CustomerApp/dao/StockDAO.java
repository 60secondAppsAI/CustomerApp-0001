package com.CustomerApp.dao;

import java.util.List;
import java.util.Date;

import com.CustomerApp.dao.GenericDAO;
import com.CustomerApp.domain.Stock;




import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.transaction.annotation.Transactional;

public interface StockDAO extends GenericDAO<Stock, Integer> {
  
	List<Stock> findAll();
	


}

