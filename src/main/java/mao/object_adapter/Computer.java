package mao.object_adapter;

/**
 * Project name(项目名称)：java设计模式_适配器模式
 * Package(包名): mao.object_adapter
 * Class(类名): Computer
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/15
 * Time(创建时间)： 21:30
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Computer
{
    public String readSD(SDCard sdCard)
    {
        if (sdCard == null)
        {
            throw new NullPointerException("sd card is null!");
        }
        return sdCard.readSD();
    }

    public void writeSD(SDCard sdCard, String msg)
    {
        if (sdCard == null)
        {
            throw new NullPointerException("sd card is null!");
        }
        sdCard.writeSD(msg);
    }
}
