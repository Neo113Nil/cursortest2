package yads;

import android.content.Context;

/* loaded from: classes4.dex */
public abstract class ky2 {
    public static final Object a = new Object();
    public static volatile ly2 b;

    public static ly2 a(Context context) {
        ly2 ly2Var;
        ly2 ly2Var2 = b;
        if (ly2Var2 != null) {
            return ly2Var2;
        }
        synchronized (a) {
            ly2Var = b;
            if (ly2Var == null) {
                ly2Var = new ly2(sg1.a(context, "YadPreferenceFile"));
                b = ly2Var;
            }
        }
        return ly2Var;
    }
}
