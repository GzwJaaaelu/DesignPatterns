package com.jaaaelu.gzw.design.patterns.iteratorAndCombinationPattern.demo.combination;

import java.util.Iterator;

/**
 * 所有的组件都必须实现 MenuComponent 接口；然而，叶节点（菜单项）和组合节点（菜单）角色不同，所以有些方法可能并不适合某
 * 种节点。面对这种情况，有时候，你最好是抛出运行异常
 *
 * 所以 MenuComponent 对每个方法都提供了默认的实现
 */
public abstract class MenuComponent {

    public void add(MenuComponent component) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent component) {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChile(int i) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }

    public Iterator<MenuComponent> createIterator() {
        throw new UnsupportedOperationException();
    }
}
