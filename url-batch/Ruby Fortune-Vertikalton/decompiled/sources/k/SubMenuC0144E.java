package k;

import X.V;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: k.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SubMenuC0144E extends MenuC0157m implements SubMenu {

    /* renamed from: A, reason: collision with root package name */
    public final C0159o f2622A;

    /* renamed from: z, reason: collision with root package name */
    public final MenuC0157m f2623z;

    public SubMenuC0144E(Context context, MenuC0157m menuC0157m, C0159o c0159o) {
        super(context);
        this.f2623z = menuC0157m;
        this.f2622A = c0159o;
    }

    @Override // k.MenuC0157m
    public final boolean d(C0159o c0159o) {
        return this.f2623z.d(c0159o);
    }

    @Override // k.MenuC0157m
    public final boolean e(MenuC0157m menuC0157m, MenuItem menuItem) {
        return super.e(menuC0157m, menuItem) || this.f2623z.e(menuC0157m, menuItem);
    }

    @Override // k.MenuC0157m
    public final boolean f(C0159o c0159o) {
        return this.f2623z.f(c0159o);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f2622A;
    }

    @Override // k.MenuC0157m
    public final String j() {
        C0159o c0159o = this.f2622A;
        int i = c0159o != null ? c0159o.f2709a : 0;
        if (i == 0) {
            return null;
        }
        return V.d("android:menu:actionviewstates:", i);
    }

    @Override // k.MenuC0157m
    public final MenuC0157m k() {
        return this.f2623z.k();
    }

    @Override // k.MenuC0157m
    public final boolean m() {
        return this.f2623z.m();
    }

    @Override // k.MenuC0157m
    public final boolean n() {
        return this.f2623z.n();
    }

    @Override // k.MenuC0157m
    public final boolean o() {
        return this.f2623z.o();
    }

    @Override // k.MenuC0157m, android.view.Menu
    public final void setGroupDividerEnabled(boolean z2) {
        this.f2623z.setGroupDividerEnabled(z2);
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
        this.f2622A.setIcon(drawable);
        return this;
    }

    @Override // k.MenuC0157m, android.view.Menu
    public final void setQwertyMode(boolean z2) {
        this.f2623z.setQwertyMode(z2);
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
        this.f2622A.setIcon(i);
        return this;
    }
}
