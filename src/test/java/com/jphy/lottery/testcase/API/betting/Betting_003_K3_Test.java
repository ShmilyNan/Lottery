package com.jphy.lottery.testcase.API.betting;

import com.jphy.lottery.APIHelper.BetAPIHelper;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

/**
 * @author Lance
 * @Description 时时彩投注接口测试
 * */
public class Betting_003_K3_Test {

	@Test
	public void orderBetting(ITestContext context) {
		String filePath = "./src/test/resources/res/K3BetDatas.xml";
		BetAPIHelper betAPIHelper = new BetAPIHelper(context,filePath,"8","2","2,6,5");
		betAPIHelper.betAndOpenLottery();
	}
}