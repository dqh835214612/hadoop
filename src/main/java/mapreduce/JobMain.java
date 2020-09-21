package mapreduce;

import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.util.Tool;

public class JobMain extends Configured implements Tool {

    //该方法用于指定一个job任务
    @Override
    public int run(String[] strings) throws Exception {
        //1:创建一个job任务对象

        //如果打包运行出错，则需要加该配置

        //2:配置job任务对象(八个步骤)

        //第一步:指定文件的读取方式和读取路径

        //第二步:指定Map阶段的处理方式和数据类型

        //设置Map阶段K2的类型

        //设置Map阶段V2的类型

        //第三，四，五，六 采用默认的方式

        //第七步：指定Reduce阶段的处理方式和数据类型

        //设置K3的类型

        //设置V3的类型

        //第八步: 设置输出类型

        //设置输出的路径

        //获取FileSystem

        //判断目录是否存在
        return 0;
    }
}
