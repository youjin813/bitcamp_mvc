package com.kabank.mvc.command;

import java.util.List;

import com.kabank.mvc.domain.AccountBean;
import com.kabank.mvc.domain.AttendBean;
import com.kabank.mvc.domain.FoodBean;
import com.kabank.mvc.domain.LottoBean;
import com.kabank.mvc.domain.MemberBean;
import com.kabank.mvc.domain.MobileBean;

import lombok.Data;
@Data
public class ResultMap {
	protected MemberBean member;
	protected AccountBean account;
	protected AttendBean attend;
	protected LottoBean lotto;
	protected FoodBean food;
	protected MobileBean mobile;
	protected List<MemberBean> members;
	protected List<AccountBean> accounts;
	protected List<AttendBean> attends;
	protected List<LottoBean> lottos;
	protected List<FoodBean> foods;
	protected List<MobileBean> mobiles;
	protected boolean seccess;
	protected int count;
}
