package yads;

import android.content.Context;

/* loaded from: classes5.dex */
public final class ki3 {
    public final li3 a(Context context) {
        li3 li3Var = li3.d;
        if (li3Var == null) {
            synchronized (this) {
                li3Var = li3.d;
                if (li3Var == null) {
                    li3Var = new li3(context);
                    li3.d = li3Var;
                }
            }
        }
        return li3Var;
    }
}
