package com.jphy.lottery.testcase.API.asynBet;

import com.jphy.lottery.APIHelper.BetAsynHelper;
import com.jphy.lottery.util.JdbcUtil;
import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import java.util.List;

/**
 * @author Lance
 * @Description PK10投注接口测试
 */
public class Bet_Asyn_002_PK10_Test {
    public static Logger logger = Logger.getLogger(Bet_Asyn_002_PK10_Test.class.getName());

    @Test(invocationCount = 12)
    public void orderBetting(ITestContext context) throws Exception {
        String filePath = "./src/test/resources/data/PK10BetDatas.xml";
        final int lotteryType = 1;

        List<String> numbers = JdbcUtil.queryNumbers(lotteryType);
        BetAsynHelper betAsynHelper = new BetAsynHelper(context, filePath, String.valueOf(lotteryType));
        for (int j = 19999; j < numbers.size(); j++) {
            betAsynHelper.betLottery(numbers.get(j));
        }
    }
}