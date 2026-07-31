package yads;

import android.content.Context;

/* loaded from: classes9.dex */
public final class jb1 implements ib1 {
    public final fl a;

    public jb1(fl flVar) {
        this.a = flVar;
    }

    @Override // yads.ib1
    public final void a(Context context, hb1 hb1Var) {
    }

    @Override // yads.ib1
    public final void onAttachedToWindow() {
        int i = oa.$r8$clinit;
        if (oa.a(this.a)) {
            return;
        }
        this.a.h();
    }

    @Override // yads.ib1
    public final void onDetachedFromWindow() {
        int i = oa.$r8$clinit;
        if (oa.a(this.a)) {
            return;
        }
        this.a.i();
    }
}
