package g;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import j.AbstractC0175a;
import java.lang.ref.WeakReference;
import k.InterfaceC0200k;
import k.MenuC0202m;
import l.C0259k;

/* loaded from: classes.dex */
public final class I extends AbstractC0175a implements InterfaceC0200k {

    /* renamed from: c, reason: collision with root package name */
    public final Context f2601c;
    public final MenuC0202m d;

    /* renamed from: e, reason: collision with root package name */
    public B.j f2602e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f2603f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ J f2604g;

    public I(J j2, Context context, B.j jVar) {
        this.f2604g = j2;
        this.f2601c = context;
        this.f2602e = jVar;
        MenuC0202m menuC0202m = new MenuC0202m(context);
        menuC0202m.f3195l = 1;
        this.d = menuC0202m;
        menuC0202m.f3190e = this;
    }

    @Override // j.AbstractC0175a
    public final void a() {
        J j2 = this.f2604g;
        if (j2.f2613l != this) {
            return;
        }
        if (j2.f2620s) {
            j2.f2614m = this;
            j2.f2615n = this.f2602e;
        } else {
            this.f2602e.D(this);
        }
        this.f2602e = null;
        j2.w(false);
        ActionBarContextView actionBarContextView = j2.i;
        if (actionBarContextView.f1681k == null) {
            actionBarContextView.e();
        }
        j2.f2609f.setHideOnContentScrollEnabled(j2.f2625x);
        j2.f2613l = null;
    }

    @Override // j.AbstractC0175a
    public final View b() {
        WeakReference weakReference = this.f2603f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // j.AbstractC0175a
    public final MenuC0202m c() {
        return this.d;
    }

    @Override // j.AbstractC0175a
    public final MenuInflater d() {
        return new j.h(this.f2601c);
    }

    @Override // k.InterfaceC0200k
    public final void e(MenuC0202m menuC0202m) {
        if (this.f2602e == null) {
            return;
        }
        i();
        C0259k c0259k = this.f2604g.i.d;
        if (c0259k != null) {
            c0259k.l();
        }
    }

    @Override // k.InterfaceC0200k
    public final boolean f(MenuC0202m menuC0202m, MenuItem menuItem) {
        B.j jVar = this.f2602e;
        if (jVar != null) {
            return ((U.v) jVar.f72b).p(this, menuItem);
        }
        return false;
    }

    @Override // j.AbstractC0175a
    public final CharSequence g() {
        return this.f2604g.i.getSubtitle();
    }

    @Override // j.AbstractC0175a
    public final CharSequence h() {
        return this.f2604g.i.getTitle();
    }

    @Override // j.AbstractC0175a
    public final void i() {
        if (this.f2604g.f2613l != this) {
            return;
        }
        MenuC0202m menuC0202m = this.d;
        menuC0202m.w();
        try {
            this.f2602e.F(this, menuC0202m);
        } finally {
            menuC0202m.v();
        }
    }

    @Override // j.AbstractC0175a
    public final boolean j() {
        return this.f2604g.i.f1689s;
    }

    @Override // j.AbstractC0175a
    public final void k(View view) {
        this.f2604g.i.setCustomView(view);
        this.f2603f = new WeakReference(view);
    }

    @Override // j.AbstractC0175a
    public final void l(int i) {
        m(this.f2604g.d.getResources().getString(i));
    }

    @Override // j.AbstractC0175a
    public final void m(CharSequence charSequence) {
        this.f2604g.i.setSubtitle(charSequence);
    }

    @Override // j.AbstractC0175a
    public final void n(int i) {
        o(this.f2604g.d.getResources().getString(i));
    }

    @Override // j.AbstractC0175a
    public final void o(CharSequence charSequence) {
        this.f2604g.i.setTitle(charSequence);
    }

    @Override // j.AbstractC0175a
    public final void p(boolean z2) {
        this.f3054b = z2;
        this.f2604g.i.setTitleOptional(z2);
    }
}
