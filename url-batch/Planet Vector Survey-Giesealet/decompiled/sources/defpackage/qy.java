package defpackage;

import android.os.Build;
import android.view.View;
import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class qy extends c11 implements Runnable, ua0, View.OnAttachStateChangeListener {
    public final i21 f;
    public boolean g;
    public boolean h;
    public d21 i;

    public qy(i21 i21Var) {
        super(!i21Var.r ? 1 : 0);
        this.f = i21Var;
    }

    @Override // defpackage.ua0
    public final d21 a(View view, d21 d21Var) {
        this.i = d21Var;
        i21 i21Var = this.f;
        yy0 yy0Var = i21Var.p;
        z11 z11Var = d21Var.a;
        yy0Var.f(ud0.s(z11Var.f(8)));
        if (this.g) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.h) {
            i21Var.q.f(ud0.s(z11Var.f(8)));
            i21.a(i21Var, d21Var);
        }
        return i21Var.r ? d21.b : d21Var;
    }

    @Override // defpackage.c11
    public final void b(l11 l11Var) {
        this.g = false;
        this.h = false;
        d21 d21Var = this.i;
        if (l11Var.a.b() != 0 && d21Var != null) {
            z11 z11Var = d21Var.a;
            i21 i21Var = this.f;
            i21Var.q.f(ud0.s(z11Var.f(8)));
            i21Var.p.f(ud0.s(z11Var.f(8)));
            i21.a(i21Var, d21Var);
        }
        this.i = null;
    }

    @Override // defpackage.c11
    public final void c(l11 l11Var) {
        this.g = true;
        this.h = true;
    }

    @Override // defpackage.c11
    public final d21 d(d21 d21Var, List list) {
        i21 i21Var = this.f;
        i21.a(i21Var, d21Var);
        return i21Var.r ? d21.b : d21Var;
    }

    @Override // defpackage.c11
    public final j3 e(l11 l11Var, j3 j3Var) {
        this.g = false;
        return j3Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.g) {
            this.g = false;
            this.h = false;
            d21 d21Var = this.i;
            if (d21Var != null) {
                i21 i21Var = this.f;
                i21Var.q.f(ud0.s(d21Var.a.f(8)));
                i21.a(i21Var, d21Var);
                this.i = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
