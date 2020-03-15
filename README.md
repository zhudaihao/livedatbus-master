# livedatbus-master
能感知生命周期的EventBus，并且实现指定订阅者接收数据

使用
To get a Git project into your build:
gradle导入

Step 1. Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:
allprojects {
		repositories {
		
			...
			maven { url 'https://jitpack.io' }
			
		}
	}
  
  
  Step 2. Add the dependency
  dependencies {
  
	        implementation 'com.github.zhudaihao:livedatbus-master:1.0.1'
		
	}
  
  
  maven导入
  Step 1. Add the JitPack repository to your build file
  <repositories>
		<repository>
			
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		    
		</repository>
	</repositories>
  
  Step 2. Add the dependency
  
  	<dependency>
	
	    <groupId>com.github.zhudaihao</groupId>
	    <artifactId>livedatbus-master</artifactId>
	    <version>Tag</version>
	    
	</dependency>
  
  
  一行代码实现消息发送
   LiveDataBus.getDefault().withCreation("homebean", HomeBean.class).postValue(homeBean);
   
   一行代码实现消息的订阅
       //订阅
        LiveDataBus.getDefault().with("homebean", HomeBean.class).observe(this, new Observer<HomeBean>() {
            @Override
            public void onChanged(HomeBean homeBean) {
                //订阅结果回调
                button.setText(homeBean.getName());

            }
        });
   
  


具体详情 https://blog.csdn.net/qq_36237165/article/details/104878044
