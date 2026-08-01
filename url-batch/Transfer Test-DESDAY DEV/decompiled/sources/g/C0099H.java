package g;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import j.AbstractC0144a;
import java.lang.ref.WeakReference;
import k.InterfaceC0162k;
import k.MenuC0164m;
import l.C0218k;

/* renamed from: g.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0099H extends AbstractC0144a implements InterfaceC0162k {

    /* renamed from: c, reason: collision with root package name */
    public final Context f2178c;
    public final MenuC0164m d;

    /* renamed from: e, reason: collision with root package name */
    public B.j f2179e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f2180f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ I f2181g;

    public C0099H(I i, Context context, B.j jVar) {
        this.f2181g = i;
        this.f2178c = context;
        this.f2179e = jVar;
        MenuC0164m menuC0164m = new MenuC0164m(context);
        menuC0164m.f2764l = 1;
        this.d = menuC0164m;
        menuC0164m.f2759e = this;
    }

    @Override // j.AbstractC0144a
    public final void a() {
        I i = this.f2181g;
        if (i.i != this) {
            return;
        }
        if (i.f2196p) {
            i.f2190j = this;
            i.f2191k = this.f2179e;
        } else {
            this.f2179e.D(this);
        }
        this.f2179e = null;
        i.Z(false);
        ActionBarContextView actionBarContextView = i.f2188f;
        if (actionBarContextView.f1292k == null) {
            actionBarContextView.e();
        }
        i.f2186c.setHideOnContentScrollEnabled(i.f2201u);
        i.i = null;
    }

    @Override // j.AbstractC0144a
    public final View b() {
        WeakReference weakReference = this.f2180f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // j.AbstractC0144a
    public final MenuC0164m c() {
        return this.d;
    }

    @Override // j.AbstractC0144a
    public final MenuInflater d() {
        return new j.h(this.f2178c);
    }

    @Override // j.AbstractC0144a
    public final CharSequence e() {
        return this.f2181g.f2188f.getSubtitle();
    }

    @Override // j.AbstractC0144a
    public final CharSequence f() {
        return this.f2181g.f2188f.getTitle();
    }

    @Override // j.AbstractC0144a
    public final void g() {
        if (this.f2181g.i != this) {
            return;
        }
        MenuC0164m menuC0164m = this.d;
        menuC0164m.w();
        try {
            this.f2179e.E(this, menuC0164m);
        } finally {
            menuC0164m.v();
        }
    }

    @Override // j.AbstractC0144a
    public final boolean h() {
        return this.f2181g.f2188f.f1300s;
    }

    @Override // j.AbstractC0144a
    public final void i(View view) {
        this.f2181g.f2188f.setCustomView(view);
        this.f2180f = new WeakReference(view);
    }

    @Override // j.AbstractC0144a
    public final void j(int i) {
        k(this.f2181g.f2184a.getResources().getString(i));
    }

    @Override // j.AbstractC0144a
    public final void k(CharSequence charSequence) {
        this.f2181g.f2188f.setSubtitle(charSequence);
    }

    @Override // j.AbstractC0144a
    public final void l(int i) {
        m(this.f2181g.f2184a.getResources().getString(i));
    }

    @Override // j.AbstractC0144a
    public final void m(CharSequence charSequence) {
        this.f2181g.f2188f.setTitle(charSequence);
    }

    @Override // j.AbstractC0144a
    public final void n(boolean z2) {
        this.f2623b = z2;
        this.f2181g.f2188f.setTitleOptional(z2);
    }

    @Override // k.InterfaceC0162k
    public final void p(MenuC0164m menuC0164m) {
        if (this.f2179e == null) {
            return;
        }
        g();
        C0218k c0218k = this.f2181g.f2188f.d;
        if (c0218k != null) {
            c0218k.l();
        }
    }

    @Override // k.InterfaceC0162k
    public final boolean q(MenuC0164m menuC0164m, MenuItem menuItem) {
        B.j jVar = this.f2179e;
        if (jVar != null) {
            return ((U.v) jVar.f56b).k(this, menuItem);
        }
        return false;
    }
}
