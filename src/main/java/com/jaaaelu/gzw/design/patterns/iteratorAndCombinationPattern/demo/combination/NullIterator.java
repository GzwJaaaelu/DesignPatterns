package com.jaaaelu.gzw.design.patterns.iteratorAndCombinationPattern.demo.combination;

import java.util.Iterator;
import java.util.Stack;

public class NullIterator implements Iterator<MenuComponent> {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public MenuComponent next() {
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
