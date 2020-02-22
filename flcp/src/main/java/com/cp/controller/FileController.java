package com.cp.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.*;

@Controller
public class FileController {

    @Value("${pic}")
    public String picBasePath;


    @RequestMapping("/file/upload")
    public void getPic1(String filePath, HttpServletResponse response){
        System.out.println(picBasePath);
        File srcFile = new File(filePath);
            try {
                InputStream in = new FileInputStream(picBasePath+srcFile);
                byte[] bytes = new byte[1024];
                int len = -1;
                OutputStream os= response.getOutputStream();
                while((len=in.read(bytes))!=-1)
                {
                    os.write(bytes, 0, len);
                }
                in.close();
                os.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }


}
