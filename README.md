## 背景
#### “码农酒店”世界时钟产品特性
作为一位酒店大堂服务人员，我发现在大堂的城市时钟不准时。我想用设置自己手机时间的方法，自动统一调整这些城市时钟时间，来避免逐一根据时差调整这些时钟的繁琐工作，系统特性具体包括：
REQ1: ”码农酒店”大堂里有5个时钟，分别显示北京、伦敦、莫斯科、悉尼和纽约的时间
REQ2: 伦敦与UTC时间一致，北京比UTC时间早8小时，莫斯科比UTC时间早4小时，悉尼比UTC时间早10小时，纽约比UTC时间晚5小时
REQ3: 将酒店大堂服务员的智能手机时间设置为北京时间
REQ4: 若大堂墙壁上所有城市的时钟都或多或少有些走时不准，需要调整时间时，只需调准服务员手机的时间，那么墙上5个城市的时钟时间都能够相应地自动调整准确


## 环境配置 (mac)

#### JDK

terminal > java -version
java version "1.8.0_221"
Java(TM) SE Runtime Environment (build 1.8.0_221-b11)
Java HotSpot(TM) 64-Bit Server VM (build 25.221-b11, mixed mode)

#### junit@1.4.9
terminal> npm install junit

#### IDE
IntelliJ IDEA 

#### 导入外部库
使用 IntelliJ IDEA 打开项目
打开lib文件夹，对文件夹中三个文件依次右键=>Add as Library


#### 代码结构


#####单元测试详情见 report.pdf