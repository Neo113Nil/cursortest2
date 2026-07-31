package yads;

/* loaded from: classes4.dex */
public abstract class yo2 {
    public static zo2 a() {
        zo2 zo2Var;
        zo2 zo2Var2 = zo2.b;
        if (zo2Var2 != null) {
            return zo2Var2;
        }
        synchronized (zo2.a) {
            zo2Var = zo2.b;
            if (zo2Var == null) {
                zo2Var = new zo2();
                zo2.b = zo2Var;
            }
        }
        return zo2Var;
    }
}
