public class demo {
    private int age;
    private String name;

    public static void main(String[] args) {//main方法生成快捷键main回车，或psvm回车
        System.out.println("hello gouzi");//打印输出快捷键 sout
    }

    //快速插入 alt+insert

    public demo(int age, String name) {//生成构造方法
        this.age = age;
        this.name = name;
    }

    //运行当前窗口程序ctrl+shift + F10
    //代码编辑区最大化ctrl+shift + F12
    //alt+1 打开侧边栏第一项
    //方向上下键选择，方向右打开，方向左关闭
//    ctrl+/快速注释一行
    //ctrl + alt + L美化代码

    //idea集成了git，等它安好

    //生成setter and getter
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
