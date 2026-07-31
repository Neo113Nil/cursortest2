package yads;

/* loaded from: classes5.dex */
public final class g2 {
    public final h2 a() {
        h2 h2Var = h2.c;
        if (h2Var == null) {
            synchronized (this) {
                h2Var = h2.c;
                if (h2Var == null) {
                    h2Var = new h2();
                    h2.c = h2Var;
                }
            }
        }
        return h2Var;
    }
}
