package com.cjc.FuYongLei.Upcast;

public class RTTI {
    public static void main(String[] args) {
        useful[] u = {
                new useful(),
                new moreuseful()
        };
        u[0].f();
        u[1].g();

        //向下转型
        ((moreuseful)u[0]).u();//ClassCastException(类转型异常)
        ((moreuseful)u[1]).u();
    }
}
class useful{
    public void f(){}
    public void g(){}
}
class moreuseful extends useful{
    public void f(){}
    public void g(){}
    public void u(){}
}