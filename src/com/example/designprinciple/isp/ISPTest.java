package com.example.designprinciple.isp;

/**
 * 接口隔离原则
 *
 * @author ynx
 * @version V1.0
 * @copyright ynx
 * @date 2019-10-12
 * @modified_date 2019-10-12
 */
public class ISPTest {
    public static void main(String[] args) {
        InputModule input = StuScoreList.getInputModule();
        CountModule count = StuScoreList.getCountModule();
        PrintModule print = StuScoreList.getPrintModule();
        input.insert();
        count.countTotalScore();
        print.printStuInfo();
    }
}

//输入模块接口
interface InputModule {
    void insert();

    void delete();

    void modify();
}

//统计模块接口
interface CountModule {
    void countTotalScore();

    void countAverage();
}

//打印模块接口
interface PrintModule {
    void printStuInfo();

    void queryStuInfo();
}

//实现类
class StuScoreList implements InputModule, CountModule, PrintModule {
    private StuScoreList() {
    }

    public static InputModule getInputModule() {
        return new StuScoreList();
    }

    public static CountModule getCountModule() {
        return new StuScoreList();
    }

    public static PrintModule getPrintModule() {
        return new StuScoreList();
    }

    @Override
    public void insert() {
        System.out.println("输入模块的insert()方法被调用！");
    }

    @Override
    public void delete() {
        System.out.println("输入模块的delete()方法被调用！");
    }

    @Override
    public void modify() {
        System.out.println("输入模块的modify()方法被调用！");
    }

    @Override
    public void countTotalScore() {
        System.out.println("统计模块的countTotalScore()方法被调用！");
    }

    @Override
    public void countAverage() {
        System.out.println("统计模块的countAverage()方法被调用！");
    }

    @Override
    public void printStuInfo() {
        System.out.println("打印模块的printStuInfo()方法被调用！");
    }

    @Override
    public void queryStuInfo() {
        System.out.println("打印模块的queryStuInfo()方法被调用！");
    }
}
