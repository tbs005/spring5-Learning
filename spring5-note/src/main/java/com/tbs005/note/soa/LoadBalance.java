package com.tbs005.note.soa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/**
 * 负载均衡算法
 *
 */
public class LoadBalance {
	
	//服务器列表
	Map<String ,Integer> serverWeightMap = new HashMap<>();
	private static Integer  pos = 0;
	
	public LoadBalance(){
		//初始化服务器列表Map<IP,权重>
		serverWeightMap.put("192.168.1.1", 1);
		serverWeightMap.put("192.168.1.2", 1);
		serverWeightMap.put("192.168.1.3", 4);
		serverWeightMap.put("192.168.1.4", 1);
		serverWeightMap.put("192.168.1.5", 2);
		serverWeightMap.put("192.168.1.6", 1);
		serverWeightMap.put("192.168.1.7", 3);
		serverWeightMap.put("192.168.1.8", 1);
		serverWeightMap.put("192.168.1.9", 1);
	}
	
	/**
	 * 轮询(Round Robin)
	 * @return 服务器ip
	 */
	public String roundRobin() {
		//重新创建map，避免出现服务器上线和下线导致的并发问题
		Map<String, Integer> serverMap = new HashMap<>();
		serverMap.putAll(serverWeightMap);
		
		//取IP地址list
		Set<String> keySet = serverMap.keySet();
		List<String> keyList = new ArrayList<>();
		keyList.addAll(keySet);
		
		String server = null;
		
		synchronized (pos) {
			if(pos >= keySet.size()){
				pos = 0;
			}
			server = keyList.get(pos);
			pos++;
		}
		return server;
	}
	
	/**
	 * 随机(Random)
	 * @return 服务器ip
	 */
	public String random() {
		//重新创建map，避免出现服务器上线和下线导致的并发问题
		Map<String, Integer> serverMap = new HashMap<>();
		serverMap.putAll(serverWeightMap);
		
		//取IP地址list
		Set<String> keySet = serverMap.keySet();
		List<String> keyList = new ArrayList<>();
		keyList.addAll(keySet);
		
		Random random = new Random();
		
		int randomPos = random.nextInt(keyList.size());
		
		String server = keyList.get(randomPos);
		return server;
	}
	
	
}
