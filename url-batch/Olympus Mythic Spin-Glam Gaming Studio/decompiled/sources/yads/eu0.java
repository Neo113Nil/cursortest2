package yads;

import android.content.Context;
import kotlin.Unit;

/* loaded from: classes9.dex */
public final class eu0 {
    public final i5 a;
    public final y52 b;
    public final p72 c;
    public final Object d;

    public eu0(Context context, i5 i5Var) {
        y52 y52Var = new y52(context);
        p72 p72Var = new p72();
        this.a = i5Var;
        this.b = y52Var;
        this.c = p72Var;
        this.d = new Object();
    }

    public final void a() {
        synchronized (this.d) {
            this.b.a();
            Unit unit = Unit.INSTANCE;
        }
    }
}
