package patterns.practices.lec01;

import patterns.interfaces.Iterator;

public class BookShelfIterator implements Iterator{

    private BookShelf BookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.BookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if(index < BookShelf.getLength()) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public Object next() {
        Book book = BookShelf.getBookAt(index);
        index++;
        return book;
    }
    
}