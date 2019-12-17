package com.example.designpattern.composite;

/**
 * @author ynx
 * @version V1.0
 * @date 2019-12-17
 * @modified_date 2019-12-17
 */
public interface Component {
    void add(Component c);
    void remove(Component c);
    Component getChild(int i);
    void operation();
}
