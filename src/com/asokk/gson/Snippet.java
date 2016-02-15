package com.asokk.gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Snippet {
	public static void main(String[] args) throws JSONException {
	    String str = "[{\"name\":\"name1\",\"url\":\"url1\"},{\"name\":\"name2\",\"url\":\"url2\"}]";
	    
	    String role ="[{\"name\":\"ashok\",\"url\":\"jeypore\"},{\"name\":\"mihir\",\"url\":\"indravati\"}]";
	
	    JSONArray jsonarray = new JSONArray(role);
	
	
	    for(int i=0; i<jsonarray.length(); i++){
	    	
	    	System.out.println(jsonarray.length());
	    	
	        JSONObject obj = jsonarray.getJSONObject(i);
	
	        String name = obj.getString("name");
	        String url = obj.getString("url");
	
	        System.out.println(name);
	        System.out.println(url);
	    }   
	}   
}

