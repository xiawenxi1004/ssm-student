

<p>

**jdk1.8**

**tomcat 8.5**

**eclipse oxygen**

**mysql**

**spring  springmvc mybatis**

表有两个都是放在名为 ssm的数据库下 建表前先建数据库 

*这个并没有使用maven 当时并不怎么了解maven是个什么东西 只知道能下jar包  所有的jar包都是通过另一个maven小项目从主仓库下载到本地仓库，再复制到这里的*

* 默认登录后显示所有用户的界面并不是分页 stuManage.jsp 只有个空架子
* stuManage2.jsp才是分页的  当时一开始做的并不是分页的 后来想改成分页 又怕改坏了 别直接复制了一份，在stuManage2.jsp上修改，如果想要默认显示就是stuManage2.jsp 修改控制器LoginController即可  
* ​                        //return("/selectAll.do");
  			return("redirect:/listStudent.do");


* 分页目前有些问题 为第一页或最后一页时 ，上一页的（下一页的）超链接并不会自动隐藏
* 如需实现分页请参考其他大佬的

</p>

<h1>以上纯属测试如何使用github</h1>