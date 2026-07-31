package yads;

/* loaded from: classes4.dex */
public abstract class x1 {
    public static y1 a() {
        y1 y1Var;
        y1 y1Var2 = y1.c;
        if (y1Var2 != null) {
            return y1Var2;
        }
        synchronized (y1.b) {
            y1Var = y1.c;
            if (y1Var == null) {
                y1Var = new y1();
                y1.c = y1Var;
            }
        }
        return y1Var;
    }
}
