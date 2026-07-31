package yads;

import android.content.Context;

/* loaded from: classes5.dex */
public abstract class gm implements iu {
    public final Context a;
    public final t8 b;

    public gm(Context context, t8 t8Var) {
        this.a = context;
        this.b = t8Var;
    }

    @Override // yads.iu
    public final synchronized boolean a() {
        return false;
    }

    public abstract void b();

    public void c() {
        b();
        getClass().toString();
        boolean z = ob1.a;
    }
}
