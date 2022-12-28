package com.axelor.order.web;

import java.util.HashMap;
import java.util.Map;

import com.axelor.i18n.I18n;
import com.axelor.rpc.ActionRequest;
import com.axelor.rpc.ActionResponse;
import com.beust.jcommander.internal.Lists;

public class SomeController {

	public void SomeMethod(ActionRequest actionRequest,ActionResponse actionResponse) {
		
		Map<String , Object> map= new HashMap<>();
		map.put("first", 100);
		map.put("percent", "50%");
		map.put("tag", I18n.get("Weekly"));
		map.put("tagcss", "label-warning");
		map.put("up", true);
		actionResponse.setData(Lists.newArrayList(map));
	}
}
