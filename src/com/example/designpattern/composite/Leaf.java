package com.example.designpattern.composite;

/**
 * 叶子节点
 * @author ynx
 * @version V1.0
 * @date 2019-12-17
 * @modified_date 2019-12-17
 */
public class Leaf implements Component {
    private String name;

    public Leaf(String name)
    {
        this.name=name;
    }

    @Override
    public void add(Component c) {

    }

    @Override
    public void remove(Component c) {

    }

    @Override
    public Component getChild(int i) {
        return null;
    }

    @Override
    public void operation() {
        System.out.println("树叶"+name+"：被访问！");
    }
}
