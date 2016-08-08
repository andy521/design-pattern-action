package com.lianggzone.designpattern.cor.action.filter.action.filter;

import com.lianggzone.designpattern.cor.action.filter.action.model.Request;
import com.lianggzone.designpattern.cor.action.filter.action.model.Response;

/**
 * 敏感词过滤器
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年8月9日  v0.1</p><p>版本内容: 创建</p>
 */
public class SensitivityFilter implements Filter{

	@Override
	public void doFilter(Request request, Response response,
			FilterChain filterChain) {
		
		String requestStr = request.getRequestStr();
		System.out.println("SensitivityFilter -> request :" + requestStr);
		
		filterChain.doFilter(request, response, filterChain);
		
		String responseStr = response.getResponseStr();
		System.out.println("SensitivityFilter -> response :" + responseStr);
	}
}