package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class o40 extends oo {
    public final /* synthetic */ Context o;
    public final /* synthetic */ TextPaint p;
    public final /* synthetic */ oo q;
    public final /* synthetic */ p40 r;

    public o40(p40 p40Var, Context context, TextPaint textPaint, oo ooVar) {
        this.r = p40Var;
        this.o = context;
        this.p = textPaint;
        this.q = ooVar;
    }

    @Override // defpackage.oo
    public final void B(int i) {
        this.q.B(i);
    }

    @Override // defpackage.oo
    public final void D(Typeface typeface, boolean z) {
        this.r.f(this.o, this.p, typeface);
        this.q.D(typeface, z);
    }
}
