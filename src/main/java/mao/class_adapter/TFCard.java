package mao.class_adapter;

/**
 * Project name(项目名称)：java设计模式_适配器模式
 * Package(包名): mao.class_adapter
 * Interface(接口名): TFCard
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/15
 * Time(创建时间)： 21:15
 * Version(版本): 1.0
 * Description(描述)： TF卡接口
 */

public interface TFCard
{
    /**
     * 读取TF卡
     *
     * @return String
     */
    String readTF();

    /**
     * 写入TF卡
     *
     * @param msg 数据
     */
    void writeTF(String msg);

}
