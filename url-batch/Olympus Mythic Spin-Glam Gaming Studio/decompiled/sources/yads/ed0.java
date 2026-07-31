package yads;

import android.content.Context;

/* loaded from: classes12.dex */
public final class ed0 implements p30 {
    public final Context a;
    public final p30 b;

    public ed0(Context context) {
        wd0 wd0Var = new wd0();
        this.a = context.getApplicationContext();
        this.b = wd0Var;
    }

    @Override // yads.p30
    public final q30 a() {
        return new fd0(this.a, this.b.a());
    }

    public ed0(Context context, zu2 zu2Var) {
        this.a = context.getApplicationContext();
        this.b = zu2Var;
    }
}
