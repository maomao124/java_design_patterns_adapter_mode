package mao.class_adapter;

/**
 * Project name(项目名称)：java设计模式_适配器模式
 * Package(包名): mao.class_adapter
 * Class(类名): SDAdapterTF
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/15
 * Time(创建时间)： 21:17
 * Version(版本): 1.0
 * Description(描述)： 适配器类（SD兼容TF）
 */

public class SDAdapterTF extends TFCardImpl implements SDCard
{

    @Override
    public String readSD()
    {
        return this.readTF();
    }

    @Override
    public void writeSD(String msg)
    {
        this.writeTF(msg);
    }
}
