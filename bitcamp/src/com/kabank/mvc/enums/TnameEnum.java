package com.kabank.mvc.enums;

public enum TnameEnum {
	MEMBER,ATTEND,tab,
	TNAMES{
		@Override
		public String toString() {
			return MEMBER+","+ATTEND;
		}
	}
}
