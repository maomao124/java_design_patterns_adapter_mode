package mao.object_adapter;

/**
 * Project name(项目名称)：java设计模式_适配器模式
 * Package(包名): mao.object_adapter
 * Class(类名): SDAdapterTF
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/15
 * Time(创建时间)： 21:30
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class SDAdapterTF implements SDCard
{
    private final TFCard tfCard;

    public SDAdapterTF(TFCard tfCard)
    {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD()
    {
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg)
    {
        tfCard.writeTF(msg);
    }
}
