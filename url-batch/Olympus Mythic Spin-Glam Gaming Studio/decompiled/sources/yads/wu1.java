package yads;

/* loaded from: classes15.dex */
public abstract class wu1 {
    public static xu1 a() {
        xu1 xu1Var;
        xu1 xu1Var2 = xu1.b;
        if (xu1Var2 != null) {
            return xu1Var2;
        }
        synchronized (xu1.c) {
            xu1Var = xu1.b;
            if (xu1Var == null) {
                xu1Var = new xu1();
                xu1.b = xu1Var;
            }
        }
        return xu1Var;
    }
}
