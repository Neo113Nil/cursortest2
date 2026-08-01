package k;

import E1.AbstractC0001b;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: k.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SubMenuC0189E extends MenuC0202m implements SubMenu {

    /* renamed from: A, reason: collision with root package name */
    public final C0204o f3127A;

    /* renamed from: z, reason: collision with root package name */
    public final MenuC0202m f3128z;

    public SubMenuC0189E(Context context, MenuC0202m menuC0202m, C0204o c0204o) {
        super(context);
        this.f3128z = menuC0202m;
        this.f3127A = c0204o;
    }

    @Override // k.MenuC0202m
    public final boolean d(C0204o c0204o) {
        return this.f3128z.d(c0204o);
    }

    @Override // k.MenuC0202m
    public final boolean e(MenuC0202m menuC0202m, MenuItem menuItem) {
        return super.e(menuC0202m, menuItem) || this.f3128z.e(menuC0202m, menuItem);
    }

    @Override // k.MenuC0202m
    public final boolean f(C0204o c0204o) {
        return this.f3128z.f(c0204o);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f3127A;
    }

    @Override // k.MenuC0202m
    public final String j() {
        C0204o c0204o = this.f3127A;
        int i = c0204o != null ? c0204o.f3214a : 0;
        if (i == 0) {
            return null;
        }
        return AbstractC0001b.f("android:menu:actionviewstates:", i);
    }

    @Override // k.MenuC0202m
    public final MenuC0202m k() {
        return this.f3128z.k();
    }

    @Override // k.MenuC0202m
    public final boolean m() {
        return this.f3128z.m();
    }

    @Override // k.MenuC0202m
    public final boolean n() {
        return this.f3128z.n();
    }

    @Override // k.MenuC0202m
    public final boolean o() {
        return this.f3128z.o();
    }

    @Override // k.MenuC0202m, android.view.Menu
    public final void setGroupDividerEnabled(boolean z2) {
        this.f3128z.setGroupDividerEnabled(z2);
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
        this.f3127A.setIcon(drawable);
        return this;
    }

    @Override // k.MenuC0202m, android.view.Menu
    public final void setQwertyMode(boolean z2) {
        this.f3128z.setQwertyMode(z2);
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
        this.f3127A.setIcon(i);
        return this;
    }
}
