package com.kabank.mvc.util;

import com.kabank.mvc.enums.DMLEnum;
import com.kabank.mvc.enums.MemberEnum;
import com.kabank.mvc.enums.ResultEnum;
import com.kabank.mvc.enums.TnameEnum;

public class MainTest {
	public static void main(String[] args) {
		for(Enums.MemberColumn c: Enums.MemberColumn.values()) {
			System.out.print(c+",");
		}
		StringBuffer buff = new StringBuffer(DMLEnum.SELECT.toString());
		System.out.println("기본 버프" +buff);

		buff.insert(6," "+MemberEnum.PROPERTIES.toString()).append(TnameEnum.MEMBER.toString()).append(" WHERE id = '%s' AND pass = '%s'");
		System.out.println("추가된 버프:" +buff);
	}

}


/*StringBuffer buffer = new StringBuffer(DMLEnum.INSERT.toString());
System.out.println("기본 버프" +buffer);
buffer.insert(11, " "+TnameEnum.MEMBER.toString()+" ("+MemberEnum.PROPERTIES.toString()+")").append(ResultEnum.PERCENT.getValue());
System.out.println("추가된 버프:" +buffer);**/

//StringBuffer buff = new StringBuffer(DMLEnum.SELECT.toString());
//System.out.println("기본 버프" +buff);
//buff.insert(11, " "+TnameEnum.MEMBER.toString());
//buff.insert(6, " "+MemberEnum.PROPERTIES.toString());
//System.out.println("추가된 버프:" +buff);

/*StringBuffer buffer = new StringBuffer(DMLEnum.INSERT.toString());
System.out.println("기본 버프" +buffer);
buffer.insert(11, " "+TnameEnum.MEMBER.toString());
buffer.insert(20,MemberEnum.PROPERTIES.toString());
System.out.println("추가된 버프:" +buffer);**/

/*StringBuffer buffer = new StringBuffer(DMLEnum.INSERT.toString());
		buffer.insert(11, " "+TnameEnum.MEMBER.toString()+" ("+MemberEnum.PROPERTIES.toString()+")");
		System.out.println("기본 버프" +buffer);
		System.out.println("추가된 버프:" +buffer);**/

/*StringBuffer buff = new StringBuffer(DMLEnum.SELECT.toString());
buff.insert(11, " "+MemberEnum.PROPERTIES.toString());
buff.insert(52, " "+TnameEnum.MEMBER.toString());
buff.append("WHERE id = '%s' AND pass = '%s'");**/