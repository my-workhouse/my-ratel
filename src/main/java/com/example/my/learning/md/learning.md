**创建项目致git仓库**
```
1.安装git,初始化，把本地目录变成git本地仓库 git init 
2.配置基本信息 git config --global user.email "you@example.com"
            git config --global user.name "Your Name"
3.码云上新建一个仓库，并复制其地址，例如 “ https://gitee.com/okwufeng/vuex-demo.git ”
然后执行如下命令将本地仓库与码云上的远程仓库关联起来 
git remote add origin https://gitee.com/okwufeng/vuex-demo.git
4.提交文件到git仓库
git add .     //添加目录下所有发生改变的文件
git commit -m '注释信息'           //注释信息一定要写，方便标记
git push -u origin master
```


**固定linux IP地址**
```
#类型
TYPE="Ethernet"

PROXY_METHOD="none"

BROWSER_ONLY="no"

#是否启动DHCP：none为禁用DHCP；static为使用静态ip地址；设置DHCP为使用DHCP服务
#如果要设定多网口绑定bond的时候，必须设成none
BOOTPROTO="static"

#就是default route，是否把这个网卡设置为ipv4默认路由
DEFROUTE="yes"

# 如果ipv4配置失败禁用设备
IPV4_FAILURE_FATAL="no"

#是否使用IPV6地址：yes为使用；no为禁用
IPV6INIT="yes"

IPV6_AUTOCONF="yes"

#就是default route，是否把这个网卡设置为ipv6默认路由
IPV6_DEFROUTE="yes"

# 如果ipv6配置失败禁用设备
IPV6_FAILURE_FATAL="no"

IPV6_ADDR_GEN_MODE="stable-privacy"

#网络连接的名字
NAME="eth0"

#唯一标识
UUID="cd5aceb5-70fb-4ec5-a58a-1eb65c58b836"

# 网卡名称
#设备名，不要自己乱改，和文件ifcfg-** 里的**要一致
#一般不需要修改
DEVICE="eth0"

#启动或者重启网络时是否启动该设备：yes是启用；no是禁用
ONBOOT="yes"

#添加如下配置信息
DNS1=192.168.0.1          #NDS
IPADDR=172.19.48.0      #IP地址
GATEWAY=192.168.1.1       #网关
PREFIX=24                     #centos子网掩码长度：24--> 255.255.255.0

# 子网掩码 RedHat，不同版本的Linux的配置是不一样的
# NETMASK=255.255.255.0

# 地址 ipv6 配置信息，如果不使用ipv6 可以不用配置
IPV6_PEERDNS=yes
IPV6_PEERROUTES=yes
IPV6_PRIVACY=no 
```

**linux 开放端口**
```
1.新增8080端口 

firewall-cmd --add-port=8080/tcp --permanent
2. 移除8080端口

firewall-cmd --permanent --remove-port=8080/tcp
3.重启防火墙使其生效

firewall-cmd --reload
```