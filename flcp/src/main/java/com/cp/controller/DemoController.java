package com.cp.controller;

import com.alibaba.fastjson.JSONObject;
import com.cp.bean.NumColor;
import com.cp.dao.NumColorMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


    @Autowired
    private NumColorMapper mapper;

    @RequestMapping("/demo")
    public void init(){

        String[] wuxings = {"金","木","水","火","土"};
        String[] colors = {"红","蓝","绿"};

        for (int i = 1; i < 50; i++) {

            NumColor bean = new NumColor();

            bean.setNum((i)+"");

            if(i%6 == 1 || i%6 == 2){
                bean.setColor(colors[0]);
                bean.setColorDesc(colors[0]);

            }
            if(i%6 == 3 || i%6 == 4){
                bean.setColor(colors[1]);
                bean.setColorDesc(colors[1]);

            }
            if(i%6 == 5 || i%6 == 0){
                bean.setColor(colors[2]);
                bean.setColorDesc(colors[2]);

            }

            if(i == 6|| i==7 ||i==20||i==21
                 ||
                    i == 28|| i==29 ||i==36||i==37
                    ){
                bean.setWuxing(wuxings[0]);
            }


            if(i == 2|| i==3 ||i==10||i==11
                 ||
                    i == 18|| i==19 ||i==32||i==33

                    ||
                    i == 40|| i==41 ||i==48||i==49
                    ){
                bean.setWuxing(wuxings[1]);
            }

            if(i == 8|| i==9 ||i==16||i==17
                 ||
                    i == 24|| i==25 ||i==38||i==39   ||i==46||i==47
                    ){
                bean.setWuxing(wuxings[2]);
            }

            if(i == 4|| i==5 ||i==12||i==13
                 ||
                    i == 26|| i==27 ||i==34||i==35   ||i==42||i==43
                    ){
                bean.setWuxing(wuxings[3]);
            }
            if(i == 1|| i==14 ||i==15||i==22
                 ||
                    i == 23|| i==30 ||i==31||i==44   ||i==45
                    ){
                bean.setWuxing(wuxings[4]);
            }

            mapper.insertSelective(bean);
        }

    }
}
