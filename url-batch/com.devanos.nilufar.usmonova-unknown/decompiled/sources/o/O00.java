package o;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class O00 extends B1 implements InterfaceC0694aC {
    public final Context j;
    public final MenuC0825cC k;
    public C2002u5 l;
    public WeakReference m;
    public final /* synthetic */ P00 n;

    public O00(P00 p00, Context context, C2002u5 c2002u5) {
        this.n = p00;
        this.j = context;
        this.l = c2002u5;
        MenuC0825cC menuC0825cC = new MenuC0825cC(context);
        menuC0825cC.l = 1;
        this.k = menuC0825cC;
        menuC0825cC.e = this;
    }

    @Override // o.InterfaceC0694aC
    public final boolean C(MenuC0825cC menuC0825cC, MenuItem menuItem) {
        C2002u5 c2002u5 = this.l;
        if (c2002u5 != null) {
            return ((A1) c2002u5.i).i(this, menuItem);
        }
        return false;
    }

    @Override // o.InterfaceC0694aC
    public final void Q(MenuC0825cC menuC0825cC) {
        if (this.l == null) {
            return;
        }
        g();
        C2128w1 c2128w1 = this.n.f.k;
        if (c2128w1 != null) {
            c2128w1.l();
        }
    }

    @Override // o.B1
    public final void a() {
        P00 p00 = this.n;
        if (p00.i != this) {
            return;
        }
        if (p00.p) {
            p00.j = this;
            p00.k = this.l;
        } else {
            this.l.e(this);
        }
        this.l = null;
        p00.p(false);
        ActionBarContextView actionBarContextView = p00.f;
        if (actionBarContextView.r == null) {
            actionBarContextView.e();
        }
        p00.c.setHideOnContentScrollEnabled(p00.u);
        p00.i = null;
    }

    @Override // o.B1
    public final View b() {
        WeakReference weakReference = this.m;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // o.B1
    public final MenuC0825cC c() {
        return this.k;
    }

    @Override // o.B1
    public final MenuInflater d() {
        return new C1764qU(this.j);
    }

    @Override // o.B1
    public final CharSequence e() {
        return this.n.f.getSubtitle();
    }

    @Override // o.B1
    public final CharSequence f() {
        return this.n.f.getTitle();
    }

    @Override // o.B1
    public final void g() {
        if (this.n.i != this) {
            return;
        }
        MenuC0825cC menuC0825cC = this.k;
        menuC0825cC.w();
        try {
            this.l.v(this, menuC0825cC);
        } finally {
            menuC0825cC.v();
        }
    }

    @Override // o.B1
    public final boolean h() {
        return this.n.f.z;
    }

    @Override // o.B1
    public final void i(View view) {
        this.n.f.setCustomView(view);
        this.m = new WeakReference(view);
    }

    @Override // o.B1
    public final void j(int i) {
        k(this.n.a.getResources().getString(i));
    }

    @Override // o.B1
    public final void k(CharSequence charSequence) {
        this.n.f.setSubtitle(charSequence);
    }

    @Override // o.B1
    public final void l(int i) {
        m(this.n.a.getResources().getString(i));
    }

    @Override // o.B1
    public final void m(CharSequence charSequence) {
        this.n.f.setTitle(charSequence);
    }

    @Override // o.B1
    public final void n(boolean z) {
        this.i = z;
        this.n.f.setTitleOptional(z);
    }
}
