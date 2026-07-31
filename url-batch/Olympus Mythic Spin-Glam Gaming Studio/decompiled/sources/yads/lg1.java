package yads;

/* loaded from: classes3.dex */
public abstract class lg1 {
    public static mg1 a() {
        mg1 mg1Var;
        mg1 mg1Var2 = mg1.e;
        if (mg1Var2 != null) {
            return mg1Var2;
        }
        synchronized (mg1.d) {
            mg1Var = mg1.e;
            if (mg1Var == null) {
                mg1Var = new mg1();
                mg1.e = mg1Var;
            }
        }
        return mg1Var;
    }
}
