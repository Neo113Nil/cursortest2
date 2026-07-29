package o;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* renamed from: o.cT, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0842cT extends B1 implements InterfaceC0694aC {
    public Context j;
    public ActionBarContextView k;
    public C2002u5 l;
    public WeakReference m;
    public boolean n;

    /* renamed from: o, reason: collision with root package name */
    public MenuC0825cC f149o;

    @Override // o.InterfaceC0694aC
    public final boolean C(MenuC0825cC menuC0825cC, MenuItem menuItem) {
        return ((A1) this.l.i).i(this, menuItem);
    }

    @Override // o.InterfaceC0694aC
    public final void Q(MenuC0825cC menuC0825cC) {
        g();
        C2128w1 c2128w1 = this.k.k;
        if (c2128w1 != null) {
            c2128w1.l();
        }
    }

    @Override // o.B1
    public final void a() {
        if (this.n) {
            return;
        }
        this.n = true;
        this.l.e(this);
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
        return this.f149o;
    }

    @Override // o.B1
    public final MenuInflater d() {
        return new C1764qU(this.k.getContext());
    }

    @Override // o.B1
    public final CharSequence e() {
        return this.k.getSubtitle();
    }

    @Override // o.B1
    public final CharSequence f() {
        return this.k.getTitle();
    }

    @Override // o.B1
    public final void g() {
        this.l.v(this, this.f149o);
    }

    @Override // o.B1
    public final boolean h() {
        return this.k.z;
    }

    @Override // o.B1
    public final void i(View view) {
        this.k.setCustomView(view);
        this.m = view != null ? new WeakReference(view) : null;
    }

    @Override // o.B1
    public final void j(int i) {
        k(this.j.getString(i));
    }

    @Override // o.B1
    public final void k(CharSequence charSequence) {
        this.k.setSubtitle(charSequence);
    }

    @Override // o.B1
    public final void l(int i) {
        m(this.j.getString(i));
    }

    @Override // o.B1
    public final void m(CharSequence charSequence) {
        this.k.setTitle(charSequence);
    }

    @Override // o.B1
    public final void n(boolean z) {
        this.i = z;
        this.k.setTitleOptional(z);
    }
}
