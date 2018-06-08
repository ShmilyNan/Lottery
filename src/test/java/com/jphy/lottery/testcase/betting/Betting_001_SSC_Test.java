package com.jphy.lottery.testcase.betting;

import com.jphy.lottery.APIHelper.BetAPIHelper;
import org.testng.ITestContext;
import org.testng.annotations.Test;

/**
 * @author Lance
 * @Description 时时彩投注接口测试
 * */
public class Betting_001_SSC_Test {

	@Test
	public void orderBetting(ITestContext context) {
		BetAPIHelper betAPIHelper = new BetAPIHelper(context,"./src/test/resources/res/SSCBetDatas.xml");
		betAPIHelper.checkReturnData();
	}
}
