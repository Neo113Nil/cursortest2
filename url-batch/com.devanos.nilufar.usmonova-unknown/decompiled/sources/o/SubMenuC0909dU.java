package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: o.dU, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SubMenuC0909dU extends MenuC0825cC implements SubMenu {
    public final C1284jC A;
    public final MenuC0825cC z;

    public SubMenuC0909dU(Context context, MenuC0825cC menuC0825cC, C1284jC c1284jC) {
        super(context);
        this.z = menuC0825cC;
        this.A = c1284jC;
    }

    @Override // o.MenuC0825cC
    public final boolean d(C1284jC c1284jC) {
        return this.z.d(c1284jC);
    }

    @Override // o.MenuC0825cC
    public final boolean e(MenuC0825cC menuC0825cC, MenuItem menuItem) {
        return super.e(menuC0825cC, menuItem) || this.z.e(menuC0825cC, menuItem);
    }

    @Override // o.MenuC0825cC
    public final boolean f(C1284jC c1284jC) {
        return this.z.f(c1284jC);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // o.MenuC0825cC
    public final String j() {
        C1284jC c1284jC = this.A;
        int i = c1284jC != null ? c1284jC.a : 0;
        if (i == 0) {
            return null;
        }
        return AbstractC2188wx.g(i, "android:menu:actionviewstates:");
    }

    @Override // o.MenuC0825cC
    public final MenuC0825cC k() {
        return this.z.k();
    }

    @Override // o.MenuC0825cC
    public final boolean m() {
        return this.z.m();
    }

    @Override // o.MenuC0825cC
    public final boolean n() {
        return this.z.n();
    }

    @Override // o.MenuC0825cC
    public final boolean o() {
        return this.z.o();
    }

    @Override // o.MenuC0825cC, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.z.setGroupDividerEnabled(z);
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
        this.A.setIcon(drawable);
        return this;
    }

    @Override // o.MenuC0825cC, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.z.setQwertyMode(z);
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
        this.A.setIcon(i);
        return this;
    }
}
