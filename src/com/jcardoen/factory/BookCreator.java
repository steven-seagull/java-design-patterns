package com.jcardoen.factory;

public class BookCreator implements ICreator{
    @Override
    public IItem createItem() {
        return new Book();
    }
}
