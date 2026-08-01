package g;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import j.AbstractC0138a;
import java.lang.ref.WeakReference;
import k.InterfaceC0156k;
import k.MenuC0158m;
import l.C0243k;

/* loaded from: classes.dex */
public final class J extends AbstractC0138a implements InterfaceC0156k {

    /* renamed from: c, reason: collision with root package name */
    public final Context f2262c;
    public final MenuC0158m d;

    /* renamed from: e, reason: collision with root package name */
    public B.j f2263e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f2264f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ K f2265g;

    public J(K k2, Context context, B.j jVar) {
        this.f2265g = k2;
        this.f2262c = context;
        this.f2263e = jVar;
        MenuC0158m menuC0158m = new MenuC0158m(context);
        menuC0158m.f2696l = 1;
        this.d = menuC0158m;
        menuC0158m.f2691e = this;
    }

    @Override // j.AbstractC0138a
    public final void a() {
        K k2 = this.f2265g;
        if (k2.i != this) {
            return;
        }
        if (k2.f2280p) {
            k2.f2274j = this;
            k2.f2275k = this.f2263e;
        } else {
            this.f2263e.A(this);
        }
        this.f2263e = null;
        k2.d0(false);
        ActionBarContextView actionBarContextView = k2.f2272f;
        if (actionBarContextView.f1148k == null) {
            actionBarContextView.e();
        }
        k2.f2270c.setHideOnContentScrollEnabled(k2.f2285u);
        k2.i = null;
    }

    @Override // j.AbstractC0138a
    public final View b() {
        WeakReference weakReference = this.f2264f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // j.AbstractC0138a
    public final MenuC0158m c() {
        return this.d;
    }

    @Override // j.AbstractC0138a
    public final MenuInflater d() {
        return new j.h(this.f2262c);
    }

    @Override // k.InterfaceC0156k
    public final void e(MenuC0158m menuC0158m) {
        if (this.f2263e == null) {
            return;
        }
        i();
        C0243k c0243k = this.f2265g.f2272f.d;
        if (c0243k != null) {
            c0243k.l();
        }
    }

    @Override // k.InterfaceC0156k
    public final boolean f(MenuC0158m menuC0158m, MenuItem menuItem) {
        B.j jVar = this.f2263e;
        if (jVar != null) {
            return ((T.u) jVar.f30b).p(this, menuItem);
        }
        return false;
    }

    @Override // j.AbstractC0138a
    public final CharSequence g() {
        return this.f2265g.f2272f.getSubtitle();
    }

    @Override // j.AbstractC0138a
    public final CharSequence h() {
        return this.f2265g.f2272f.getTitle();
    }

    @Override // j.AbstractC0138a
    public final void i() {
        if (this.f2265g.i != this) {
            return;
        }
        MenuC0158m menuC0158m = this.d;
        menuC0158m.w();
        try {
            this.f2263e.C(this, menuC0158m);
        } finally {
            menuC0158m.v();
        }
    }

    @Override // j.AbstractC0138a
    public final boolean j() {
        return this.f2265g.f2272f.f1156s;
    }

    @Override // j.AbstractC0138a
    public final void k(View view) {
        this.f2265g.f2272f.setCustomView(view);
        this.f2264f = new WeakReference(view);
    }

    @Override // j.AbstractC0138a
    public final void l(int i) {
        m(this.f2265g.f2268a.getResources().getString(i));
    }

    @Override // j.AbstractC0138a
    public final void m(CharSequence charSequence) {
        this.f2265g.f2272f.setSubtitle(charSequence);
    }

    @Override // j.AbstractC0138a
    public final void n(int i) {
        o(this.f2265g.f2268a.getResources().getString(i));
    }

    @Override // j.AbstractC0138a
    public final void o(CharSequence charSequence) {
        this.f2265g.f2272f.setTitle(charSequence);
    }

    @Override // j.AbstractC0138a
    public final void p(boolean z2) {
        this.f2548b = z2;
        this.f2265g.f2272f.setTitleOptional(z2);
    }
}
