Mysql乐观锁实现

```java 
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
	
mysql官方文档
https://dev.mysql.com/doc/

查看mysql队列中等待拿锁的线程
SELECT * FROM information_schema.INNODB_TRX WHERE trx_state='LOCK_WAIT'

查看mysql正在进行的查询
如果有 SUPER 权限，则可以看到全部的线程，否则，只能看到自己发起的线程（这是指，当前对应的 MySQL 帐户运行的线程）
show processlist
1.进入 mysql/bin 目录下输入 mysqladmin processlist;
2. 启动 mysql ，输入 show processlist;
杀死进程：kill id

mysql的配置文件 my.ini 中最后添加，可以查看到mysql执行的所有SQL
log=d:/mysql/data/log.txt

打开mysql慢查询日志
