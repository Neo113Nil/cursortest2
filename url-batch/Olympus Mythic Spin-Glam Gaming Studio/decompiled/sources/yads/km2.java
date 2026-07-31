package yads;

/* loaded from: classes5.dex */
public final class km2 {
    public final lm2 a() {
        lm2 lm2Var = lm2.d;
        if (lm2Var == null) {
            synchronized (this) {
                lm2Var = lm2.d;
                if (lm2Var == null) {
                    lm2Var = new lm2();
                    lm2.d = lm2Var;
                }
            }
        }
        return lm2Var;
    }
}
