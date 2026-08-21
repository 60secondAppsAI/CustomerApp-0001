package com.CustomerApp.dto;

import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class BrowseStockDTO {

	private Integer ownerId;

	private Integer stockId;

	private Integer stockStatus;
	
	private Integer nextOrPrevious;
}

