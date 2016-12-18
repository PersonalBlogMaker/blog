package com.xyz.blog.sys.controller;

import java.io.IOException;
import java.util.Date;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.sf.ehcache.Cache;
import net.sf.ehcache.Element;


@RequestMapping("/utils")
@RestController
public class UtilsController {
	
	@Autowired
	private EhCacheCacheManager cacheManager;
	
	@RequestMapping(value="/getData",method=RequestMethod.GET)
	public String getData() throws IOException{
		Cache cache = cacheManager.getCacheManager().getCache("simpleCache");
			//过期键并不删除
		if(cache.get("wangyiyunyinyue") == null){
			String params = "Ds6JfPZ0UFYcrbfoxLWRHOv+XfH86fMcW7zaBE5GUGTLZ4oKj/my3C0lIxe3MHAz3gIJ5H1WFCdC1zLdwf980mLeGGkDxm7U0x+3hgNEkr41Y6O6ZBJoTs7UC+uqJVlIud3uvCwI/21hY75EFIgRjsS2ZEI8AjGAr0ceAZglVwXXdwIN2kjDFKWBQwdeMxG16wMXKLWLu/i4WVlc5aK9X9EuWNaJCDvi7h5MEGBAdzc=";
			String encSecKey = "3ca7cfc13f2d4022a8b68aa0e6f1d480086db0ae821c144aac4ce06cb7ae82f776170a6b2201bb54c5cb59a374a0572188366a97045179352482d3f740b428ed9102e6968b5bf6ecdfb23e467489fa66808f34ceffdd6c880078be48c56d9d5ee17e7ce3b0391cb87b5d8dc6b1f575c0df8affbbfbf32cb8b04e9182577a279d";
			// 获取
			Document doc = Jsoup.connect("http://music.163.com/weapi/playlist/detail/").cookie("appver", "1.5.0.75771")
					.header("Referer", "http://music.163.com/").data("params", params).data("encSecKey", encSecKey)
					.ignoreContentType(true).post();
			Elements body = doc.getElementsByTag("body");
			//把返回结果放入缓存
			Element element = new Element("wangyiyunyinyue", body.text());
			//缓存15分钟
			element.setTimeToLive(900);
			cache.put(element);
		}
		return (String)cache.get("wangyiyunyinyue").getObjectValue();
	}
	
}
