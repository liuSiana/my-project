package com.lemon.test;

import org.apache.http.Header;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.SortingFocusTraversalPolicy;
public class Aaa {
	@Test
	public static void f1() throws IOException{
		 //1:url��ַ
        String  url="http://dealer.api.pre.singulato.com/api/workorders/follows";

        //2������ʽ
        HttpPost post=new HttpPost(url);

        Map<String,String> headers = new HashMap<String,String>();
        headers.put("Authorization","b4e0b707bbaac75b8909e127e72a4f8b");

        //3:�������
        List<NameValuePair> parameters=new ArrayList<NameValuePair>();
        parameters.add(new BasicNameValuePair("customer_id","9993c1401a0411e9b1f30fb8a53ef3db"));
        parameters.add(new BasicNameValuePair("first_category","invitation"));
        parameters.add(new BasicNameValuePair("follow_type","wechat"));
        parameters.add(new BasicNameValuePair("content","���Ը����ƻ�"));
        parameters.add(new BasicNameValuePair("plan_time","2019-04-20 00:00:00"));
        parameters.add(new BasicNameValuePair("status","unprocessed"));
        
        post.setEntity(new UrlEncodedFormEntity(parameters));
        for (String key : headers.keySet()) {

        	post.setHeader(key, headers.get(key));
        	}

        //4������
        CloseableHttpClient httpClient=HttpClients.createDefault();
        CloseableHttpResponse response=httpClient.execute(post);
        String result=EntityUtils.toString(response.getEntity());

        //5:������
        System.out.println(result);
	}
}
