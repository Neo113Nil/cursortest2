package yads;

/* loaded from: classes3.dex */
public abstract class le1 {
    public static me1 a() {
        me1 me1Var;
        me1 me1Var2 = me1.c;
        if (me1Var2 != null) {
            return me1Var2;
        }
        synchronized (me1.b) {
            me1Var = me1.c;
            if (me1Var == null) {
                me1Var = new me1();
                me1.c = me1Var;
            }
        }
        return me1Var;
    }
}
