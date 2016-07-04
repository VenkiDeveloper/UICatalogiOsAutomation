package com.atmecs.appium.uicatalog.util;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONObjectUtil {
	PropertyUtil propertyUtil = new PropertyUtil();
	public String getObject(String key){
		String jsonObjectString = propertyUtil.getProperty("ios.defaultOsType");
		JSONArray jsonArray = new JSONArray(jsonObjectString);
		JSONObject jsonObject = jsonArray.getJSONObject(0);
		return jsonObject.getJSONObject("device").getString(key);
	}
}
