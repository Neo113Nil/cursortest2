package j;

import T.u;
import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import k.InterfaceC0156k;
import k.MenuC0158m;
import l.C0243k;

/* loaded from: classes.dex */
public final class d extends AbstractC0138a implements InterfaceC0156k {

    /* renamed from: c, reason: collision with root package name */
    public Context f2532c;
    public ActionBarContextView d;

    /* renamed from: e, reason: collision with root package name */
    public B.j f2533e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f2534f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2535g;
    public MenuC0158m h;

    @Override // j.AbstractC0138a
    public final void a() {
        if (this.f2535g) {
            return;
        }
        this.f2535g = true;
        this.f2533e.A(this);
    }

    @Override // j.AbstractC0138a
    public final View b() {
        WeakReference weakReference = this.f2534f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // j.AbstractC0138a
    public final MenuC0158m c() {
        return this.h;
    }

    @Override // j.AbstractC0138a
    public final MenuInflater d() {
        return new h(this.d.getContext());
    }

    @Override // k.InterfaceC0156k
    public final void e(MenuC0158m menuC0158m) {
        i();
        C0243k c0243k = this.d.d;
        if (c0243k != null) {
            c0243k.l();
        }
    }

    @Override // k.InterfaceC0156k
    public final boolean f(MenuC0158m menuC0158m, MenuItem menuItem) {
        return ((u) this.f2533e.f30b).p(this, menuItem);
    }

    @Override // j.AbstractC0138a
    public final CharSequence g() {
        return this.d.getSubtitle();
    }

    @Override // j.AbstractC0138a
    public final CharSequence h() {
        return this.d.getTitle();
    }

    @Override // j.AbstractC0138a
    public final void i() {
        this.f2533e.C(this, this.h);
    }

    @Override // j.AbstractC0138a
    public final boolean j() {
        return this.d.f1153s;
    }

    @Override // j.AbstractC0138a
    public final void k(View view) {
        this.d.setCustomView(view);
        this.f2534f = view != null ? new WeakReference(view) : null;
    }

    @Override // j.AbstractC0138a
    public final void l(int i) {
        m(this.f2532c.getString(i));
    }

    @Override // j.AbstractC0138a
    public final void m(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override // j.AbstractC0138a
    public final void n(int i) {
        o(this.f2532c.getString(i));
    }

    @Override // j.AbstractC0138a
    public final void o(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override // j.AbstractC0138a
    public final void p(boolean z2) {
        this.f2526b = z2;
        this.d.setTitleOptional(z2);
    }
}
