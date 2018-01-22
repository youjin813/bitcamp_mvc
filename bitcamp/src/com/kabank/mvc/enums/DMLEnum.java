package com.kabank.mvc.enums;

public enum DMLEnum {
	COUNT{
		@Override
		public String toString() {
			return "SELECT COUNT (*) AS count FROM ";
		}
	},
	SELECT{
		@Override
		public String toString() {
			return "SELECT FROM ";
		}
	},
	INSERT{
		@Override
		public String toString() {
			return "INSERT INTO VALUES";
		}
	},
	UPDATEPASS{
		@Override
		public String toString() {
			return "UPDATE MEMBER SET pass = '@' WHERE id = '$'";
		}
	},
	DELETE{
		@Override
		public String toString() {
			return "DELETE FROM Member WHERE id = '@'";
		}
	},
	CREATEACCOUNT{
		@Override
		public String toString() {	  
			return "INSERT INTO Bank ( customer_num,account_num,money,id ) VALUES ( customer_num.nextval,'%s','%s','%s' )";
		}
	},
	OPENNUMBER{
		@Override
		public String toString() {
			return "INSERT INTO Mobile ( customer_num,phone_num,reg_date,telecom,id ) VALUES ( customer_num.nextval,'%s',sysdate,'%s','%s')";
		}
	}
	
}
