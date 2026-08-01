package k;

import X.V;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: k.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SubMenuC0155E extends MenuC0168m implements SubMenu {

    /* renamed from: A, reason: collision with root package name */
    public final C0170o f2631A;

    /* renamed from: z, reason: collision with root package name */
    public final MenuC0168m f2632z;

    public SubMenuC0155E(Context context, MenuC0168m menuC0168m, C0170o c0170o) {
        super(context);
        this.f2632z = menuC0168m;
        this.f2631A = c0170o;
    }

    @Override // k.MenuC0168m
    public final boolean d(C0170o c0170o) {
        return this.f2632z.d(c0170o);
    }

    @Override // k.MenuC0168m
    public final boolean e(MenuC0168m menuC0168m, MenuItem menuItem) {
        return super.e(menuC0168m, menuItem) || this.f2632z.e(menuC0168m, menuItem);
    }

    @Override // k.MenuC0168m
    public final boolean f(C0170o c0170o) {
        return this.f2632z.f(c0170o);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f2631A;
    }

    @Override // k.MenuC0168m
    public final String j() {
        C0170o c0170o = this.f2631A;
        int i = c0170o != null ? c0170o.f2718a : 0;
        if (i == 0) {
            return null;
        }
        return V.d("android:menu:actionviewstates:", i);
    }

    @Override // k.MenuC0168m
    public final MenuC0168m k() {
        return this.f2632z.k();
    }

    @Override // k.MenuC0168m
    public final boolean m() {
        return this.f2632z.m();
    }

    @Override // k.MenuC0168m
    public final boolean n() {
        return this.f2632z.n();
    }

    @Override // k.MenuC0168m
    public final boolean o() {
        return this.f2632z.o();
    }

    @Override // k.MenuC0168m, android.view.Menu
    public final void setGroupDividerEnabled(boolean z2) {
        this.f2632z.setGroupDividerEnabled(z2);
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
        this.f2631A.setIcon(drawable);
        return this;
    }

    @Override // k.MenuC0168m, android.view.Menu
    public final void setQwertyMode(boolean z2) {
        this.f2632z.setQwertyMode(z2);
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
        this.f2631A.setIcon(i);
        return this;
    }
}
