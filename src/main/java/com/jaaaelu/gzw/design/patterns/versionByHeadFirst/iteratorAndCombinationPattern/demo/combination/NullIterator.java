package com.jaaaelu.gzw.design.patterns.versionByHeadFirst.iteratorAndCombinationPattern.demo.combination;

import java.util.Iterator;

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
