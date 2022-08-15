package mao.object_adapter;

/**
 * Project name(项目名称)：java设计模式_适配器模式
 * Package(包名): mao.object_adapter
 * Class(类名): Test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/15
 * Time(创建时间)： 21:33
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test
{
    public static void main(String[] args)
    {
        Computer computer = new Computer();
        SDCard sdCard = new SDCardImpl();
        System.out.println(computer.readSD(sdCard));
        computer.writeSD(sdCard, "hello");

        SDAdapterTF sdAdapterTF = new SDAdapterTF(new TFCardImpl());
        System.out.println(computer.readSD(sdAdapterTF));
        computer.writeSD(sdAdapterTF, "hello");
    }
}
