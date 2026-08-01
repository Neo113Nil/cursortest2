package j;

import U.v;
import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import k.InterfaceC0200k;
import k.MenuC0202m;
import l.C0259k;

/* loaded from: classes.dex */
public final class d extends AbstractC0175a implements InterfaceC0200k {

    /* renamed from: c, reason: collision with root package name */
    public Context f3060c;
    public ActionBarContextView d;

    /* renamed from: e, reason: collision with root package name */
    public B.j f3061e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f3062f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3063g;
    public MenuC0202m h;

    @Override // j.AbstractC0175a
    public final void a() {
        if (this.f3063g) {
            return;
        }
        this.f3063g = true;
        this.f3061e.D(this);
    }

    @Override // j.AbstractC0175a
    public final View b() {
        WeakReference weakReference = this.f3062f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // j.AbstractC0175a
    public final MenuC0202m c() {
        return this.h;
    }

    @Override // j.AbstractC0175a
    public final MenuInflater d() {
        return new h(this.d.getContext());
    }

    @Override // k.InterfaceC0200k
    public final void e(MenuC0202m menuC0202m) {
        i();
        C0259k c0259k = this.d.d;
        if (c0259k != null) {
            c0259k.l();
        }
    }

    @Override // k.InterfaceC0200k
    public final boolean f(MenuC0202m menuC0202m, MenuItem menuItem) {
        return ((v) this.f3061e.f72b).p(this, menuItem);
    }

    @Override // j.AbstractC0175a
    public final CharSequence g() {
        return this.d.getSubtitle();
    }

    @Override // j.AbstractC0175a
    public final CharSequence h() {
        return this.d.getTitle();
    }

    @Override // j.AbstractC0175a
    public final void i() {
        this.f3061e.F(this, this.h);
    }

    @Override // j.AbstractC0175a
    public final boolean j() {
        return this.d.f1689s;
    }

    @Override // j.AbstractC0175a
    public final void k(View view) {
        this.d.setCustomView(view);
        this.f3062f = view != null ? new WeakReference(view) : null;
    }

    @Override // j.AbstractC0175a
    public final void l(int i) {
        m(this.f3060c.getString(i));
    }

    @Override // j.AbstractC0175a
    public final void m(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override // j.AbstractC0175a
    public final void n(int i) {
        o(this.f3060c.getString(i));
    }

    @Override // j.AbstractC0175a
    public final void o(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override // j.AbstractC0175a
    public final void p(boolean z2) {
        this.f3054b = z2;
        this.d.setTitleOptional(z2);
    }
}
