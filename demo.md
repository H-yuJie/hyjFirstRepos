# IDEA
支持直接编辑md文件

# git步骤
+ `ssh-keygen`
    + 生成ssh key，添加到github，这台电脑就有了编辑GitHub仓库的权限
  > 你这个idea有点问题，以后手动git就行
+ `git init`
  + 初始化当前目录为git仓库
  + 这个命令运行之后会再在当前目录新建.git隐藏文件
+ `git remote add origin git@githubxxxxxx`
  + `origin`可以换别的
  + git@githubxxx会在新建的仓库显示
+ `git add .` 把当前目录加到git
+ `git commit -m "xxxx"`
  提交git
+ `git push origin master`
origin看你命名的是什么，master是分支
  
以后更新git
只用：
git add .
git commit -m "xxx"  # xxx是更新的信息，刚才填的是first commit，可以随便填
git push origin master
这个里面的一些标题啥的在哪里看啊