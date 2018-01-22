package com.kabank.mvc.service;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.ResultMap;
import com.kabank.mvc.domain.LottoBean;

public interface LottoService {

	public ResultMap findLottoById(Command cmd);
}
