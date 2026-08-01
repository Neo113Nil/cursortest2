package j;

import U.v;
import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import k.InterfaceC0162k;
import k.MenuC0164m;
import l.C0218k;

/* loaded from: classes.dex */
public final class d extends AbstractC0144a implements InterfaceC0162k {

    /* renamed from: c, reason: collision with root package name */
    public Context f2629c;
    public ActionBarContextView d;

    /* renamed from: e, reason: collision with root package name */
    public B.j f2630e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f2631f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2632g;
    public MenuC0164m h;

    @Override // j.AbstractC0144a
    public final void a() {
        if (this.f2632g) {
            return;
        }
        this.f2632g = true;
        this.f2630e.D(this);
    }

    @Override // j.AbstractC0144a
    public final View b() {
        WeakReference weakReference = this.f2631f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // j.AbstractC0144a
    public final MenuC0164m c() {
        return this.h;
    }

    @Override // j.AbstractC0144a
    public final MenuInflater d() {
        return new h(this.d.getContext());
    }

    @Override // j.AbstractC0144a
    public final CharSequence e() {
        return this.d.getSubtitle();
    }

    @Override // j.AbstractC0144a
    public final CharSequence f() {
        return this.d.getTitle();
    }

    @Override // j.AbstractC0144a
    public final void g() {
        this.f2630e.E(this, this.h);
    }

    @Override // j.AbstractC0144a
    public final boolean h() {
        return this.d.f1300s;
    }

    @Override // j.AbstractC0144a
    public final void i(View view) {
        this.d.setCustomView(view);
        this.f2631f = view != null ? new WeakReference(view) : null;
    }

    @Override // j.AbstractC0144a
    public final void j(int i) {
        k(this.f2629c.getString(i));
    }

    @Override // j.AbstractC0144a
    public final void k(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override // j.AbstractC0144a
    public final void l(int i) {
        m(this.f2629c.getString(i));
    }

    @Override // j.AbstractC0144a
    public final void m(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override // j.AbstractC0144a
    public final void n(boolean z2) {
        this.f2623b = z2;
        this.d.setTitleOptional(z2);
    }

    @Override // k.InterfaceC0162k
    public final void p(MenuC0164m menuC0164m) {
        g();
        C0218k c0218k = this.d.d;
        if (c0218k != null) {
            c0218k.l();
        }
    }

    @Override // k.InterfaceC0162k
    public final boolean q(MenuC0164m menuC0164m, MenuItem menuItem) {
        return ((v) this.f2630e.f56b).k(this, menuItem);
    }
}
