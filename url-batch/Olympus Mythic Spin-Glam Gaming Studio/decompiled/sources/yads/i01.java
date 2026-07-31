package yads;

import android.content.Context;

/* loaded from: classes4.dex */
public abstract class i01 extends gm implements x3 {
    public final x8 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i01(Context context, t8 t8Var) {
        super(context, t8Var);
        x8 x8Var = new x8();
        this.c = x8Var;
        x8Var.a(this);
    }

    @Override // yads.gm
    public final synchronized void b() {
        this.c.a(null);
    }
}
