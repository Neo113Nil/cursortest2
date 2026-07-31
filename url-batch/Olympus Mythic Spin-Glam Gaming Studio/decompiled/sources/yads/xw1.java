package yads;

import android.content.Context;
import android.util.AttributeSet;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class xw1 extends vb2 {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final mw1 k;
    public ho3 l;
    public final ax1 m;
    public cj1 n;

    public xw1(Context context, vn3 vn3Var, AttributeSet attributeSet) {
        super(context, vn3Var, attributeSet, 56);
        mw1 mw1Var = new mw1();
        this.k = mw1Var;
        this.l = go3.a;
        this.m = new ax1(this, mw1Var);
        this.n = new rz2();
    }

    public final void a(String str, dx1 dx1Var) {
        if (this.l instanceof go3) {
            this.l = new fo3(dx1Var);
            ax1 ax1Var = this.m;
            xw1 xw1Var = ax1Var.a;
            vh3 vh3Var = ax1Var.c;
            mw1 mw1Var = ax1Var.b;
            yw1 yw1Var = new yw1(ax1Var);
            lw1 lw1Var = new lw1(xw1Var, null, 254);
            xw1Var.setId(2);
            lw1Var.l = yw1Var;
            lw1Var.p = vh3Var;
            lw1Var.n = mw1Var;
            lw1Var.m = mw1Var;
            lw1Var.o = mw1Var;
            xw1Var.setHtmlWebViewListener(new ow1(lw1Var));
            lw1Var.b(str);
        }
    }

    @Override // yads.vb2
    public final void d() {
        this.m.d.a(MapsKt.emptyMap());
    }

    @Override // yads.vb2, yads.oo, android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        bj1 a = this.n.a(i, i2);
        super.onMeasure(a.a, a.b);
    }

    public final void setAspectRatio(float f) {
        this.n = new sk2(f);
    }

    public final void setClickListener(@NotNull av avVar) {
        this.m.h = avVar;
    }

    public final void setPreloadingState(@NotNull ho3 ho3Var) {
        this.l = ho3Var;
    }

    public final void a(String str, ww1 ww1Var) {
        n01 rnVar;
        if (this.l instanceof go3) {
            this.l = new fo3(ww1Var);
            ax1 ax1Var = this.m;
            ax1Var.e.getClass();
            boolean find = iw1.a.matcher(str).find();
            ax1Var.f.getClass();
            if (find) {
                rnVar = new nw1();
            } else {
                rnVar = new rn();
            }
            n01 n01Var = rnVar;
            vb2 vb2Var = ax1Var.a;
            gi3 gi3Var = ax1Var.c;
            mw1 mw1Var = ax1Var.b;
            n01Var.a(vb2Var, ax1Var, gi3Var, mw1Var, mw1Var, mw1Var).a(str);
        }
    }

    @Override // yads.vb2, yads.r01
    public final void a() {
        super.a();
        ho3 ho3Var = this.l;
        fo3 fo3Var = ho3Var instanceof fo3 ? (fo3) ho3Var : null;
        if (fo3Var != null) {
            ww1 ww1Var = fo3Var.a;
            if (ww1Var != null) {
                ww1Var.b();
            }
            this.l = eo3.a;
        }
    }

    @Override // yads.vb2, yads.r01
    public final void a(int i) {
        super.a(i);
        ho3 ho3Var = this.l;
        fo3 fo3Var = ho3Var instanceof fo3 ? (fo3) ho3Var : null;
        if (fo3Var != null) {
            ww1 ww1Var = fo3Var.a;
            if (ww1Var != null) {
                ww1Var.a();
            }
            stopLoading();
            this.l = go3.a;
        }
    }
}
