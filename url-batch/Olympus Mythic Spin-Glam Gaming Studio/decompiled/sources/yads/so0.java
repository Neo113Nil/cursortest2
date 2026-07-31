package yads;

import android.content.Context;

/* loaded from: classes14.dex */
public final class so0 {
    public static final Object c = new Object();
    public static volatile so0 d;
    public final ro0 a = new ro0();
    public lz2 b;

    public final br a(Context context) {
        lz2 lz2Var;
        synchronized (c) {
            lz2Var = this.b;
            if (lz2Var == null) {
                lz2Var = this.a.a(context);
                this.b = lz2Var;
            }
        }
        return lz2Var;
    }
}
