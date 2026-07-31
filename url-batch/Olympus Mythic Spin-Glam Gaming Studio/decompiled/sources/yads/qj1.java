package yads;

import android.content.Context;
import kotlin.math.MathKt;

/* loaded from: classes5.dex */
public final class qj1 implements ig0 {
    public final int a;
    public final kj1 b;

    public qj1(w00 w00Var, int i) {
        kj1 kj1Var = new kj1(w00Var);
        this.a = i;
        this.b = kj1Var;
    }

    @Override // yads.ig0
    public final boolean a(Context context) {
        int c = hl3.c(context);
        int e = hl3.e(context);
        Float a = this.b.a();
        return e - (a != null ? MathKt.roundToInt(a.floatValue() * ((float) c)) : 0) >= this.a;
    }
}
