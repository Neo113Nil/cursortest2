package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class b30 extends o1 implements qs {
    public Context h;
    public ActionBarContextView i;
    public o4 j;
    public WeakReference k;
    public boolean l;
    public ss m;

    @Override // defpackage.o1
    public final void a() {
        if (this.l) {
            return;
        }
        this.l = true;
        this.j.D(this);
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
        return this.m;
    }

    @Override // defpackage.o1
    public final MenuInflater d() {
        return new a40(this.i.getContext());
    }

    @Override // defpackage.o1
    public final CharSequence e() {
        return this.i.getSubtitle();
    }

    @Override // defpackage.qs
    public final boolean f(ss ssVar, MenuItem menuItem) {
        return ((oe) this.j.g).u(this, menuItem);
    }

    @Override // defpackage.o1
    public final CharSequence g() {
        return this.i.getTitle();
    }

    @Override // defpackage.o1
    public final void h() {
        this.j.F(this, this.m);
    }

    @Override // defpackage.o1
    public final boolean i() {
        return this.i.x;
    }

    @Override // defpackage.o1
    public final void j(View view) {
        this.i.setCustomView(view);
        this.k = view != null ? new WeakReference(view) : null;
    }

    @Override // defpackage.o1
    public final void k(int i) {
        l(this.h.getString(i));
    }

    @Override // defpackage.o1
    public final void l(CharSequence charSequence) {
        this.i.setSubtitle(charSequence);
    }

    @Override // defpackage.o1
    public final void m(int i) {
        o(this.h.getString(i));
    }

    @Override // defpackage.qs
    public final void n(ss ssVar) {
        h();
        k1 k1Var = this.i.i;
        if (k1Var != null) {
            k1Var.n();
        }
    }

    @Override // defpackage.o1
    public final void o(CharSequence charSequence) {
        this.i.setTitle(charSequence);
    }

    @Override // defpackage.o1
    public final void p(boolean z) {
        this.g = z;
        this.i.setTitleOptional(z);
    }
}
