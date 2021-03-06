import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.awt.*;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Project name(项目名称)：MyBatis逆向工程
 * Package(包名): PACKAGE_NAME
 * Class(类名): GeneratorSqlmap
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/17
 * Time(创建时间)： 17:32
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class GeneratorSqlmap
{
    public void generator() throws Exception
    {
        System.out.println("正在生成...");
        List<String> warnings = new ArrayList<>();
        boolean overwrite = true;
        //获得配置文件的输入流
        InputStream resourceAsStream = GeneratorSqlmap.class.getClassLoader().getResourceAsStream("generatorConfig.xml");
        //类配置解析器
        ConfigurationParser configurationParser = new ConfigurationParser(warnings);
        Configuration parseConfiguration = configurationParser.parseConfiguration(resourceAsStream);
        DefaultShellCallback defaultShellCallback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(parseConfiguration, defaultShellCallback, warnings);
        myBatisGenerator.generate(null);
    }

    // 执行main方法以生成代码
    public static void main(String[] args)
    {
        try
        {
            GeneratorSqlmap generatorSqlmap = new GeneratorSqlmap();
            generatorSqlmap.generator();
            System.out.println("生成成功");
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Toolkit.getDefaultToolkit().beep();
        }
    }
}
