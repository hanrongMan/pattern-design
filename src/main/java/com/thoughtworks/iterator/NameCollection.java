package com.thoughtworks.iterator;

public class NameCollection implements Container {
   private String names[];

   public NameCollection(String[] names) {
      this.names = names;
   }

   @Override
   public Iterator getIterator() {
      return new NameIterator();
   }
 
   private class NameIterator implements Iterator {
      int index;
      @Override
      public boolean hasNext() {
         if(index < names.length){
            return true;
         }
         return false;
      }
 
      @Override
      public Object next() {
         if(this.hasNext()){
            return names[index++];
         }
         return null;
      }     
   }
}