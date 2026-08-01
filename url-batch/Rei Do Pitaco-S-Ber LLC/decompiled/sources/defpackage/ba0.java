package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class ba0 extends o1 implements qs {
    public final Context h;
    public final ss i;
    public o4 j;
    public WeakReference k;
    public final /* synthetic */ ca0 l;

    public ba0(ca0 ca0Var, Context context, o4 o4Var) {
        this.l = ca0Var;
        this.h = context;
        this.j = o4Var;
        ss ssVar = new ss(context);
        ssVar.l = 1;
        this.i = ssVar;
        ssVar.e = this;
    }

    @Override // defpackage.o1
    public final void a() {
        ca0 ca0Var = this.l;
        if (ca0Var.i != this) {
            return;
        }
        if (ca0Var.p) {
            ca0Var.j = this;
            ca0Var.k = this.j;
        } else {
            this.j.D(this);
        }
        this.j = null;
        ca0Var.a(false);
        ActionBarContextView actionBarContextView = ca0Var.f;
        if (actionBarContextView.p == null) {
            actionBarContextView.e();
        }
        ca0Var.c.setHideOnContentScrollEnabled(ca0Var.u);
        ca0Var.i = null;
    }

    @Override // defpackage.o1
    public final View b() {
        WeakReference weakReference = this.k;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.o1
    public final ss c() {
        return this.i;
    }

    @Override // defpackage.o1
    public final MenuInflater d() {
        return new a40(this.h);
    }

    @Override // defpackage.o1
    public final CharSequence e() {
        return this.l.f.getSubtitle();
    }

    @Override // defpackage.qs
    public final boolean f(ss ssVar, MenuItem menuItem) {
        o4 o4Var = this.j;
        if (o4Var != null) {
            return ((oe) o4Var.g).u(this, menuItem);
        }
        return false;
    }

    @Override // defpackage.o1
    public final CharSequence g() {
        return this.l.f.getTitle();
    }

    @Override // defpackage.o1
    public final void h() {
        if (this.l.i != this) {
            return;
        }
        ss ssVar = this.i;
        ssVar.w();
        try {
            this.j.F(this, ssVar);
        } finally {
            ssVar.v();
        }
    }

    @Override // defpackage.o1
    public final boolean i() {
        return this.l.f.x;
    }

    @Override // defpackage.o1
    public final void j(View view) {
        this.l.f.setCustomView(view);
        this.k = new WeakReference(view);
    }

    @Override // defpackage.o1
    public final void k(int i) {
        l(this.l.a.getResources().getString(i));
    }

    @Override // defpackage.o1
    public final void l(CharSequence charSequence) {
        this.l.f.setSubtitle(charSequence);
    }

    @Override // defpackage.o1
    public final void m(int i) {
        o(this.l.a.getResources().getString(i));
    }

    @Override // defpackage.qs
    public final void n(ss ssVar) {
        if (this.j == null) {
            return;
        }
        h();
        k1 k1Var = this.l.f.i;
        if (k1Var != null) {
            k1Var.n();
        }
    }

    @Override // defpackage.o1
    public final void o(CharSequence charSequence) {
        this.l.f.setTitle(charSequence);
    }

    @Override // defpackage.o1
    public final void p(boolean z) {
        this.g = z;
        this.l.f.setTitleOptional(z);
    }
}
