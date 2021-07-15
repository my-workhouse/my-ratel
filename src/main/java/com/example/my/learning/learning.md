创建项目致git仓库:
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