package g;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import j.AbstractC0148a;
import java.lang.ref.WeakReference;
import k.InterfaceC0166k;
import k.MenuC0168m;
import l.C0232k;

/* loaded from: classes.dex */
public final class J extends AbstractC0148a implements InterfaceC0166k {

    /* renamed from: c, reason: collision with root package name */
    public final Context f2264c;
    public final MenuC0168m d;

    /* renamed from: e, reason: collision with root package name */
    public B.j f2265e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f2266f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ K f2267g;

    public J(K k2, Context context, B.j jVar) {
        this.f2267g = k2;
        this.f2264c = context;
        this.f2265e = jVar;
        MenuC0168m menuC0168m = new MenuC0168m(context);
        menuC0168m.f2699l = 1;
        this.d = menuC0168m;
        menuC0168m.f2694e = this;
    }

    @Override // j.AbstractC0148a
    public final void a() {
        K k2 = this.f2267g;
        if (k2.f2278m != this) {
            return;
        }
        if (k2.f2285t) {
            k2.f2279n = this;
            k2.f2280o = this.f2265e;
        } else {
            this.f2265e.A(this);
        }
        this.f2265e = null;
        k2.b0(false);
        ActionBarContextView actionBarContextView = k2.f2275j;
        if (actionBarContextView.f1147k == null) {
            actionBarContextView.e();
        }
        k2.f2274g.setHideOnContentScrollEnabled(k2.f2290y);
        k2.f2278m = null;
    }

    @Override // j.AbstractC0148a
    public final View b() {
        WeakReference weakReference = this.f2266f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // j.AbstractC0148a
    public final MenuC0168m c() {
        return this.d;
    }

    @Override // j.AbstractC0148a
    public final MenuInflater d() {
        return new j.h(this.f2264c);
    }

    @Override // k.InterfaceC0166k
    public final void e(MenuC0168m menuC0168m) {
        if (this.f2265e == null) {
            return;
        }
        i();
        C0232k c0232k = this.f2267g.f2275j.d;
        if (c0232k != null) {
            c0232k.l();
        }
    }

    @Override // k.InterfaceC0166k
    public final boolean f(MenuC0168m menuC0168m, MenuItem menuItem) {
        B.j jVar = this.f2265e;
        if (jVar != null) {
            return ((T.u) jVar.f28b).p(this, menuItem);
        }
        return false;
    }

    @Override // j.AbstractC0148a
    public final CharSequence g() {
        return this.f2267g.f2275j.getSubtitle();
    }

    @Override // j.AbstractC0148a
    public final CharSequence h() {
        return this.f2267g.f2275j.getTitle();
    }

    @Override // j.AbstractC0148a
    public final void i() {
        if (this.f2267g.f2278m != this) {
            return;
        }
        MenuC0168m menuC0168m = this.d;
        menuC0168m.w();
        try {
            this.f2265e.C(this, menuC0168m);
        } finally {
            menuC0168m.v();
        }
    }

    @Override // j.AbstractC0148a
    public final boolean j() {
        return this.f2267g.f2275j.f1155s;
    }

    @Override // j.AbstractC0148a
    public final void k(View view) {
        this.f2267g.f2275j.setCustomView(view);
        this.f2266f = new WeakReference(view);
    }

    @Override // j.AbstractC0148a
    public final void l(int i) {
        m(this.f2267g.f2272e.getResources().getString(i));
    }

    @Override // j.AbstractC0148a
    public final void m(CharSequence charSequence) {
        this.f2267g.f2275j.setSubtitle(charSequence);
    }

    @Override // j.AbstractC0148a
    public final void n(int i) {
        o(this.f2267g.f2272e.getResources().getString(i));
    }

    @Override // j.AbstractC0148a
    public final void o(CharSequence charSequence) {
        this.f2267g.f2275j.setTitle(charSequence);
    }

    @Override // j.AbstractC0148a
    public final void p(boolean z2) {
        this.f2551b = z2;
        this.f2267g.f2275j.setTitleOptional(z2);
    }
}
