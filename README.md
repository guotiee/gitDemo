# gitDemo
2019年从svn切换到git做版本管理，建立此 git demo 项目, 用来练习git的使用

总结：
1、GIT 是一个分布式的版本管理系统
    1、分布式相对于集中式（SVN），每个机器都有一个库（本地库）
    2、远端库，pull(拉取）从远端库下载，push(推送）把本地库推送到远端库;不明白的一个问题，既然是分布库，那远端库怎么理解？
      远端是指集中的服务器代码，所有的本地库从远端拉取，并将修改推送到远端。
    3、update,delete,add 和commit是针对本地库的操作，本地库的操作还需要push到远端库
    4、分支的建立和合并是针对本地库，最终需要推送到远端库起作用，推送之前要拉取，这个时候	如果有冲突要解决冲突。

2、sourceTree是Git的一个GUI工具

3、问题：

    1、如何下载一个远程库？
        1、使用git命令行：
        2、sourceTree:  
            新建仓库-从url克隆：比如 url:http://github.com/guoart/gitDemo.git
    2、如何切换不同的分支
        1、git命令：
        2、sourceTree:拉取
    3、如何查看一个文件的所有日志？
        1、git命令行： git  log fileName
        2、sourceTree:查看历史

    4、分支的创建和合并？
        4.1、rebase命令：
        4.2、merge和rebase的区别

    5、git工作流程
      5.1、master分支
      5.2、develop分支
      5.3、feature分支
      5.4、hotFix分支
  

updateInDevelop
updateModule
