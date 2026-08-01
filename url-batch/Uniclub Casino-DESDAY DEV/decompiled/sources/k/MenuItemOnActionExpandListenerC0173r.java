package k;

import android.view.MenuItem;

/* renamed from: k.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemOnActionExpandListenerC0173r implements MenuItem.OnActionExpandListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f2745a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MenuItemC0175t f2746b;

    public MenuItemOnActionExpandListenerC0173r(MenuItemC0175t menuItemC0175t, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2746b = menuItemC0175t;
        this.f2745a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f2745a.onMenuItemActionCollapse(this.f2746b.g(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f2745a.onMenuItemActionExpand(this.f2746b.g(menuItem));
    }
}
