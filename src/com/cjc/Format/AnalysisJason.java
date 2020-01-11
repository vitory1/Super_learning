package com.cjc.Format;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class AnalysisJason {
    static String json = "{\"sites\":[{\"name\":\"蚂蚁课堂\",\"url\":\"www.itmayiedu.com\"},{\"name\":\"每特教育\",\"url\":\"http://meiteedu.com/\"}]}";

    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();
        JSONObject jsonStrObject = jsonObject.parseObject(json);
        JSONArray jsonArray = jsonStrObject.getJSONArray("sites");
        for (Object object: jsonArray) {
            JSONObject stObject = (JSONObject)object;
            String name = stObject.getString("name");
            String url = stObject.getString("url");
            System.out.println("name:"+name+"--->"+"url:"+url);
        }
    }
}
