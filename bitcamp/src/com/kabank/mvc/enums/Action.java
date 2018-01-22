package com.kabank.mvc.enums;

public enum Action {
	MOVE,ADD,LOGIN,JOIN,SEARCH,CHANGE_PASS,DELETE,LOGOUT,CREATE_ACCOUNT,OPEN_PHONE,MYPAGE,
	VIEW{
		@Override
		public String toString() {
			return "/WEB-INF/view/";
		}
	},
	EXTENSION{
		@Override
		public String toString() {
			return ".jsp";
		}
	},
	SEPARATOR{
		@Override
		public String toString() {
			return "/";
		}
	}
}
