/**
 * Copyright 2010 ASTO.
 * All right reserved.
 * Created on 2010-2-7
 */
package com.ast.ast1949.price.servlet;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

import com.ast.ast1949.service.auth.ParamService;
import com.ast.ast1949.service.facade.CategoryFacade;
import com.ast.ast1949.service.facade.CategoryProductsFacade;
import com.ast.ast1949.service.facade.MemberRuleFacade;
import com.ast.ast1949.service.products.CategoryProductsService;
import com.ast.ast1949.service.site.CategoryService;
import com.ast.ast1949.service.site.MemberRuleService;
import com.zz91.util.cache.MemcachedUtils;
import com.zz91.util.log.LogUtil;
import com.zz91.util.param.ParamUtils;
import com.zz91.util.search.SearchEngineUtils;
import com.zz91.util.seo.SeoUtil;
import com.zz91.util.tags.TagsUtils;

/**
 * @author Mays (x03570227@gmail.com)
 *
 */

public class InitSystem {

//	private static Logger LOG = Logger.getLogger(InitSystem.class);
	final static String WEB_PROP = "web.properties";
	@Autowired
	private ParamService paramService;
	@Autowired
	private CategoryService categoryService;
	@Autowired
	private CategoryProductsService categoryProductsService;
	@Resource
	private MemberRuleService memberRuleService;
	
	public void initSystem() {
		
		MemcachedUtils.getInstance().init(WEB_PROP);
		
		//初始化系统配置
		ParamUtils.getInstance().init(paramService.queryUsefulParam(), "memcached");
		
		//初始化系统类别库
		CategoryFacade.getInstance().init(categoryService.queryCategoryList(),null);
		
		//初始化类别code
		CategoryProductsFacade.getInstance().init(categoryProductsService.queryAllCategoryProducts(), null);
		
		//初始化规则
		MemberRuleFacade.getInstance().init(memberRuleService.queryMemberRuleList(), null);
		
		SeoUtil.getInstance().init();
		
		TagsUtils.getInstance().init(WEB_PROP);
		
		// 康总搜索引擎
		SearchEngineUtils.getInstance().init(WEB_PROP);
		
		// 日志系统初始化
		LogUtil.getInstance().init(WEB_PROP);
	}

	
	public void destroySystem() {
	}

//	public void initBaseConfig() {
//		LOG.info(">>>>>>>>Init system properties cache start...");
//		InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("web.properties");
//		Properties p = new Properties();
//
//		try {
//			p.load(inputStream);
//		} catch (IOException e1) {
//			LOG.error("error read web.properties", e1);
//		}
//
//		String tmp = null;
//		for (Object key : p.keySet()) {
//			tmp = String.valueOf(key);
//			if (tmp != null && tmp.startsWith("baseConfig.")) {
//				MemcachedUtils.getInstance().getClient().set(String.valueOf(key), 0, String.valueOf(p.get(key)));
//			}
//		}
//
//		LOG.info(">>>>>>>>Init system properties cache end...");
//	}

}
