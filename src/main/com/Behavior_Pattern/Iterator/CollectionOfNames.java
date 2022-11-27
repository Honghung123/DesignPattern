package main.com.Behavior_Pattern.Iterator;

public class CollectionOfNames implements Container {
    private String name[] = { "Hong Hung", "Huy Hoang", "Hong Dieu",
     "Nguyen Hue", "Hoai Thuong" };

    @Override
    public Iterator getIterator() {
        return new CollectionofNamesIterate();
    }

    private class CollectionofNamesIterate implements Iterator {
        private int i;

        @Override
        public boolean hasNext() { 
            return (i < name.length);
        }

        @Override
        public Object next() {
            System.out.println("Variable i: " + i + "  of the length " + name.length);
            if (this.hasNext()) {
                return name[i++];
            }
            return null;
        }
         
    }
}
