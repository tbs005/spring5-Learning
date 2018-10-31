package com.tbs005.note.db;

public class OptimisticLock {
	
	
	public void optimisticLock(){
		int tryTimes = 5;//重试次数
		if(tryTimes>0){
			String select = "SELECT stock,version FROM item WHERE item_id = 1";//
			boolean productExist = true; 
			int version = 1;
			int stock = 1; 
			if(productExist){//如果商品存在
				if(stock>0){//如果库存够扣减
					String update = "UPDATE item SET version = version + 1,stock = stock -1 WHERE item_id = 1 AND version = ' + version + '";
					boolean updateSuccess = false;//如果扣减库存失败
					if(updateSuccess){
						/* version 不一致时尝试重试 */
						optimisticLock();
					}else{
						//扣减库存成功逻辑
					}
				}else{
					//指定商品已售罄
				}
			}
		}
	}

}
