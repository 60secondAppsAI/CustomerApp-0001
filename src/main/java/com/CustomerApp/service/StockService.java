package com.CustomerApp.service;

import java.util.List;
import java.util.Date;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.CustomerApp.domain.Stock;
import com.CustomerApp.dto.StockDTO;
import com.CustomerApp.dto.StockSearchDTO;
import com.CustomerApp.dto.StockPageDTO;
import com.CustomerApp.dto.StockConvertCriteriaDTO;
import com.CustomerApp.service.GenericService;
import com.CustomerApp.dto.common.RequestDTO;
import com.CustomerApp.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface StockService extends GenericService<Stock, Integer> {

	List<Stock> findAll();

	ResultDTO addStock(StockDTO stockDTO, RequestDTO requestDTO);

	ResultDTO updateStock(StockDTO stockDTO, RequestDTO requestDTO);

    Page<Stock> getAllStocks(Pageable pageable);

    Page<Stock> getAllStocks(Specification<Stock> spec, Pageable pageable);

	ResponseEntity<StockPageDTO> getStocks(StockSearchDTO stockSearchDTO);
	
	List<StockDTO> convertStocksToStockDTOs(List<Stock> stocks, StockConvertCriteriaDTO convertCriteria);

	StockDTO getStockDTOById(Integer stockId);



	
}
