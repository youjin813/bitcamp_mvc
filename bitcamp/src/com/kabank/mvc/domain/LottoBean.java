package com.kabank.mvc.domain;

import lombok.Data;

@Data
public class LottoBean {
	private String lottoNum;

	public String getLottoNum() {
		return lottoNum;
	}

	public void setLottoNum(String lottoNum) {
		this.lottoNum = lottoNum;
	}

}
