package yads;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes3.dex */
public abstract class c11 {
    public static final void a(Context context, HashMap hashMap) {
        vw2 vw2Var;
        vw2 vw2Var2 = vw2.l;
        if (vw2Var2 == null) {
            synchronized (vw2.k) {
                vw2Var = vw2.l;
                if (vw2Var == null) {
                    vw2Var = new vw2();
                    vw2.l = vw2Var;
                }
            }
            vw2Var2 = vw2Var;
        }
        bu2 a = vw2Var2.a(context);
        if (a == null || !a.B) {
            return;
        }
        a11 a11Var = a11.c;
        hashMap.put("encrypted-request", "1");
    }
}
