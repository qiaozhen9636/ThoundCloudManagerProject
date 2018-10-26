/**
 * Copyright (C), 2018-2018, XXX有限公司
 * FileName: TestContants
 * Author:   Administrator
 * Date:     2018/10/24 20:32
 * Description: 常量类的测试类
 * History:
 * <author>          <time>          <version>          <desc>
 * qiaozhen         修改时间          版本号             描述
 */

import com.github.qiaozhen9636.thoundcloudmanager.indexModule.webContotlor.contant.Contant;
import com.github.qiaozhen9636.thoundcloudmanager.indexModule.webContotlor.contant.ErrorCodes;
import org.junit.Test;

/**
 * 〈一句话功能简述〉<br> 
 * 〈常量类的测试类〉
 *
 * @author Administrator
 * @create 2018/10/24
 * @since 1.0.0
 */

public class TestContants {
    @Test
    public void TestBase() throws NoSuchFieldException {
        Contant contant = new ErrorCodes();
        System.out.println(contant.searchName(200));
    }
}
