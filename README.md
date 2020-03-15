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
	        implementation 'com.github.zhudaihao:livedatbus-master:Tag'
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
  
  


原理：https://mp.csdn.net/console/editor/html/102547165
