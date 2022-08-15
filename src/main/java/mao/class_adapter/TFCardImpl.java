package mao.class_adapter;

/**
 * Project name(项目名称)：java设计模式_适配器模式
 * Package(包名): mao.class_adapter
 * Class(类名): TFCardImpl
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/15
 * Time(创建时间)： 21:16
 * Version(版本): 1.0
 * Description(描述)： TF卡实现类
 */

public class TFCardImpl implements TFCard
{

    @Override
    public String readTF()
    {
        return "读取TF卡";
    }

    @Override
    public void writeTF(String msg)
    {
        System.out.println("写入TF卡：" + msg);
    }
}
