package yads;

/* loaded from: classes4.dex */
public final class v4 {
    public final r02 a;
    public final u4 b;

    public v4(r02 r02Var) {
        u4 u4Var;
        u4 u4Var2 = u4.d;
        if (u4Var2 == null) {
            synchronized (u4.c) {
                u4Var = u4.d;
                if (u4Var == null) {
                    u4Var = new u4();
                    u4.d = u4Var;
                }
            }
            u4Var2 = u4Var;
        }
        this.a = r02Var;
        this.b = u4Var2;
    }
}
