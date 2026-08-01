package j;

import T.u;
import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import k.InterfaceC0166k;
import k.MenuC0168m;
import l.C0232k;

/* loaded from: classes.dex */
public final class d extends AbstractC0148a implements InterfaceC0166k {

    /* renamed from: c, reason: collision with root package name */
    public Context f2557c;
    public ActionBarContextView d;

    /* renamed from: e, reason: collision with root package name */
    public B.j f2558e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f2559f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2560g;
    public MenuC0168m h;

    @Override // j.AbstractC0148a
    public final void a() {
        if (this.f2560g) {
            return;
        }
        this.f2560g = true;
        this.f2558e.A(this);
    }

    @Override // j.AbstractC0148a
    public final View b() {
        WeakReference weakReference = this.f2559f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // j.AbstractC0148a
    public final MenuC0168m c() {
        return this.h;
    }

    @Override // j.AbstractC0148a
    public final MenuInflater d() {
        return new h(this.d.getContext());
    }

    @Override // k.InterfaceC0166k
    public final void e(MenuC0168m menuC0168m) {
        i();
        C0232k c0232k = this.d.d;
        if (c0232k != null) {
            c0232k.l();
        }
    }

    @Override // k.InterfaceC0166k
    public final boolean f(MenuC0168m menuC0168m, MenuItem menuItem) {
        return ((u) this.f2558e.f28b).p(this, menuItem);
    }

    @Override // j.AbstractC0148a
    public final CharSequence g() {
        return this.d.getSubtitle();
    }

    @Override // j.AbstractC0148a
    public final CharSequence h() {
        return this.d.getTitle();
    }

    @Override // j.AbstractC0148a
    public final void i() {
        this.f2558e.C(this, this.h);
    }

    @Override // j.AbstractC0148a
    public final boolean j() {
        return this.d.f1155s;
    }

    @Override // j.AbstractC0148a
    public final void k(View view) {
        this.d.setCustomView(view);
        this.f2559f = view != null ? new WeakReference(view) : null;
    }

    @Override // j.AbstractC0148a
    public final void l(int i) {
        m(this.f2557c.getString(i));
    }

    @Override // j.AbstractC0148a
    public final void m(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override // j.AbstractC0148a
    public final void n(int i) {
        o(this.f2557c.getString(i));
    }

    @Override // j.AbstractC0148a
    public final void o(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override // j.AbstractC0148a
    public final void p(boolean z2) {
        this.f2551b = z2;
        this.d.setTitleOptional(z2);
    }
}
