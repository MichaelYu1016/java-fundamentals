package com.company.designpattern.prototype;

/**
 * 使用原型模式创建奖状
 * @author ynx
 * @version V1.0
 * @date 2019-12-13
 * @modified_date 2019-12-13
 */
public class PrototypeCitation
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        Citation obj1=new Citation("张三","同学：在2019学年第一学期中表现优秀，被评为三好学生。","XXXX大学");
        obj1.display();
        Citation obj2=(Citation) obj1.clone();
        obj2.setName("李四");
        obj2.display();
    }
}
/**奖状类*/
class Citation implements Cloneable
{
    String name;
    String info;
    String college;
    Citation(String name, String info, String college)
    {
        this.name=name;
        this.info=info;
        this.college=college;
        System.out.println("奖状创建成功！");
    }
    void setName(String name)
    {
        this.name=name;
    }
    String getName()
    {
        return(this.name);
    }
    void display()
    {
        System.out.println(name+info+college);
    }
    @Override
    public Object clone() throws CloneNotSupportedException
    {
        System.out.println("奖状拷贝成功！");
        return (Citation)super.clone();
    }
}
