package com.jcardoen.factory;

public class CdCreator implements ICreator{
    @Override
    public IItem createItem() {
        return new Cd();
    }
}
