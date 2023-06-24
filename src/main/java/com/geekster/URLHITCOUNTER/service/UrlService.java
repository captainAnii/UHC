package com.geekster.URLHITCOUNTER.service;

import com.geekster.URLHITCOUNTER.model.UrlModel;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UrlService {


    static Map<String,Integer> map = new HashMap<>();
    public UrlModel getVisits(String username){
        int count = 1;
        if(map.containsKey(username)){
            count = map.get(username);
            map.put(username,++count);
        }
        else{
            map.put(username,1);
        }
        UrlModel urlModel = new UrlModel(username,count);
        return urlModel;
    }
}