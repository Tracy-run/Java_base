package java_base.demo.io.buffered;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BufferedInputStreamTest {

    public static final int SIZE=1024;

    public static void main1() throws Exception{

        File f = new File("xxxx");
        FileInputStream fis = new FileInputStream(f);
        BufferedInputStream bis = new BufferedInputStream(fis, 4096);
        int bisLength = bis.available();
        byte[] byteA = new byte[2048];
        int read = 0;
        StringBuffer strbuffer = new StringBuffer();
        if ((read = bis.read(byteA)) != -1) {
            strbuffer.append(new String(byteA, 0, read));
            System.out.println("每次读取字节数量:" + read);
            System.out.println("文件中剩余字节数:" + fis.available());
        }

        System.out.println(String.format("文件的大小:%d,缓冲区读取流返回的大小:%d", f.length(), bisLength));
        System.out.println("文件的内容："+strbuffer.toString());
        System.out.println("字符串长度:"+strbuffer.toString().length());

        char[] cTmp=strbuffer.toString().toCharArray();
        System.out.println("字符串->字符数组长度:"+cTmp.length);
    }

    public static void main(String[] args){
        //变量声明
        File f=null;
        InputStream input=null;
        BufferedInputStream bis=null;
        StringBuilder strBuild=null;
        SimpleDateFormat sdf=null;
        Date d=null;
        long start=0L;
        long end=0L;

        try{
            sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

            strBuild=new StringBuilder();
            start=System.currentTimeMillis();
            d=new Date();
            if(d!=null){
                d.setTime(start);
            }
            System.out.println("程序开始执行时间:"+sdf.format(d));

            f=new File("d:"+File.separator+"demo.txt");
            input=new FileInputStream(f);
            // 指定文件带缓冲区的读取流且指定缓冲区大小为2KB
            bis=new BufferedInputStream(input,2*SIZE);
            int bisLength=bis.available();
            int readLength=0;
            byte[] byteArray=new byte[SIZE];
            int tmp=0;
            while((tmp=bis.read(byteArray))!=-1){
                strBuild.append(new String(byteArray,0,tmp));
                System.out.println("每次读取字节数量:"+tmp);
                System.out.println("文件中剩余字节数:"+input.available());
            }

            System.out.println(String.format("文件的大小:%d,缓冲区读取流返回的大小:%d",f.length(),bisLength));
            System.out.println("文件的内容："+strBuild.toString());
            System.out.println("字符串长度:"+strBuild.toString().length());
            char[] cTmp=strBuild.toString().toCharArray();
            System.out.println("字符串->字符数组长度:"+cTmp.length);

            end=System.currentTimeMillis();
            d=new Date();
            if(d!=null){
                d.setTime(end);
            }
            System.out.println("程序执行的结束时间:"+sdf.format(d));
            System.out.println("<-------------******************---------------->");
            System.out.println("程序执行时间(ms):"+(end-start)+"毫秒");

        }catch(FileNotFoundException ex){
            ex.printStackTrace();
        }catch(IOException ex){
            ex.printStackTrace();
        }finally{
            try{
                if(input!=null){
                    input.close();
                }
                if(bis!=null){
                    bis.close();
                }
            }catch(IOException ex){
                ex.printStackTrace();
            }
        }
    }
}