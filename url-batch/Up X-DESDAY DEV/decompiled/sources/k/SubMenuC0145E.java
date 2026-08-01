package k;

import X.V;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: k.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SubMenuC0145E extends MenuC0158m implements SubMenu {

    /* renamed from: A, reason: collision with root package name */
    public final C0160o f2606A;

    /* renamed from: z, reason: collision with root package name */
    public final MenuC0158m f2607z;

    public SubMenuC0145E(Context context, MenuC0158m menuC0158m, C0160o c0160o) {
        super(context);
        this.f2607z = menuC0158m;
        this.f2606A = c0160o;
    }

    @Override // k.MenuC0158m
    public final boolean d(C0160o c0160o) {
        return this.f2607z.d(c0160o);
    }

    @Override // k.MenuC0158m
    public final boolean e(MenuC0158m menuC0158m, MenuItem menuItem) {
        return super.e(menuC0158m, menuItem) || this.f2607z.e(menuC0158m, menuItem);
    }

    @Override // k.MenuC0158m
    public final boolean f(C0160o c0160o) {
        return this.f2607z.f(c0160o);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f2606A;
    }

    @Override // k.MenuC0158m
    public final String j() {
        C0160o c0160o = this.f2606A;
        int i = c0160o != null ? c0160o.f2693a : 0;
        if (i == 0) {
            return null;
        }
        return V.d("android:menu:actionviewstates:", i);
    }

    @Override // k.MenuC0158m
    public final MenuC0158m k() {
        return this.f2607z.k();
    }

    @Override // k.MenuC0158m
    public final boolean m() {
        return this.f2607z.m();
    }

    @Override // k.MenuC0158m
    public final boolean n() {
        return this.f2607z.n();
    }

    @Override // k.MenuC0158m
    public final boolean o() {
        return this.f2607z.o();
    }

    @Override // k.MenuC0158m, android.view.Menu
    public final void setGroupDividerEnabled(boolean z2) {
        this.f2607z.setGroupDividerEnabled(z2);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f2606A.setIcon(drawable);
        return this;
    }

    @Override // k.MenuC0158m, android.view.Menu
    public final void setQwertyMode(boolean z2) {
        this.f2607z.setQwertyMode(z2);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        u(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        u(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.f2606A.setIcon(i);
        return this;
    }
}
