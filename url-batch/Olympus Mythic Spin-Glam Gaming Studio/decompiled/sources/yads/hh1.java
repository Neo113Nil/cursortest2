package yads;

/* loaded from: classes6.dex */
public final class hh1 {
    public static final Object c = new Object();
    public final qv1 a;
    public final xu1 b;

    public hh1() {
        qv1 qv1Var;
        qv1 qv1Var2 = qv1.b;
        if (qv1Var2 == null) {
            synchronized (qv1.c) {
                qv1Var = qv1.b;
                if (qv1Var == null) {
                    qv1Var = new qv1();
                    qv1.b = qv1Var;
                }
            }
            qv1Var2 = qv1Var;
        }
        xu1 a = wu1.a();
        this.a = qv1Var2;
        this.b = a;
    }
}
