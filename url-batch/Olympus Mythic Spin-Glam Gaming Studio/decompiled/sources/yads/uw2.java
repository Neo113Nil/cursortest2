package yads;

/* loaded from: classes5.dex */
public abstract class uw2 {
    public static vw2 a() {
        vw2 vw2Var;
        vw2 vw2Var2 = vw2.l;
        if (vw2Var2 != null) {
            return vw2Var2;
        }
        synchronized (vw2.k) {
            vw2Var = vw2.l;
            if (vw2Var == null) {
                vw2Var = new vw2();
                vw2.l = vw2Var;
            }
        }
        return vw2Var;
    }
}
