package java_base.demo.io.buffered;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class BufferedOutputStreamTest {

    //将读取到的信息输出到指定的文件
    public static  void main(String [] args)throws Exception{
        File f = new File("xxx");
        FileOutputStream outs = new FileOutputStream(f, false);
        BufferedOutputStream bos = new BufferedOutputStream(outs, 4096);
        StringBuffer sb = new StringBuffer();
        for(int a=0;a<100;a++){
            //todo
            sb.append("");
        }

        bos.write(sb.toString().getBytes("utf-8"));

    }

}
