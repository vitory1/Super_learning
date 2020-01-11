package com.cjc.InnerClass;

public class Sequence {
    Object[] s ;
    private int next = 0 ;
    public Sequence(int size){
        s = new Object[size];
    }
    public void add(Object x){
        if (next<s.length){
        s[next++] = x ;
        }
    }
    private class SequenceSelector implements Selector{
        private int i = 0 ;
        @Override
        public boolean end() {
            return i==s.length;
        }

        @Override
        public Object current() {
            return s[i];
        }

        @Override
        public void next() {
            if (i<s.length){
                i++;
            }
        }
    }
    public Selector selectorFactory(){
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i=0;i<10;i++){
            sequence.add(Integer.toString(i));
        }
        Selector ss = sequence.selectorFactory();
        while (!ss.end()){
            System.out.println(ss.current()+" ");
            ss.next();
        }
    }
}
