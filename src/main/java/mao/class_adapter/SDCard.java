package mao.class_adapter;

/**
 * Project name(项目名称)：java设计模式_适配器模式
 * Package(包名): mao.class_adapter
 * Interface(接口名): SDCard
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/15
 * Time(创建时间)： 21:09
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public interface SDCard
{
    /**
     * 读取SD卡
     *
     * @return String
     */
    String readSD();

    /**
     * 写入SD卡
     *
     * @param msg 写入的数据
     */
    void writeSD(String msg);

}
