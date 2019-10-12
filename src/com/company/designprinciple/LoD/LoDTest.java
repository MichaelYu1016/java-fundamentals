package com.company.designprinciple.LoD;

/**
 * 迪米特法则
 *
 * @author ynx
 * @version V1.0
 * @copyright ynx
 * @date 2019-10-12
 * @modified_date 2019-10-12
 */
public class LoDTest
{
    public static void main(String[] args)
    {
        Agent agent=new Agent();
        agent.setSinger(new Singer("林志炫"));
        agent.setFans(new Fans("粉丝"));
        agent.setCompany(new Company("中国传媒有限公司"));
        agent.meeting();
        agent.business();
    }
}
//经纪人
class Agent
{
    private Singer mySinger;
    private Fans myFans;
    private Company myCompany;
    public void setSinger(Singer mySinger)
    {
        this.mySinger=mySinger;
    }
    public void setFans(Fans myFans)
    {
        this.myFans=myFans;
    }
    public void setCompany(Company myCompany)
    {
        this.myCompany=myCompany;
    }
    public void meeting()
    {
        System.out.println(myFans.getName()+"与歌手"+mySinger.getName()+"见面了。");
    }
    public void business()
    {
        System.out.println(myCompany.getName()+"与歌手"+mySinger.getName()+"洽淡业务。");
    }
}
//歌手
class Singer
{
    private String name;
    Singer(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
}
//粉丝
class Fans
{
    private String name;
    Fans(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
}
//媒体公司
class Company
{
    private String name;
    Company(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
}
