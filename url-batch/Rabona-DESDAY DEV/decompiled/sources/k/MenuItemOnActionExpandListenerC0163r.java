package k;

import android.view.MenuItem;

/* renamed from: k.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemOnActionExpandListenerC0163r implements MenuItem.OnActionExpandListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f2742a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MenuItemC0165t f2743b;

    public MenuItemOnActionExpandListenerC0163r(MenuItemC0165t menuItemC0165t, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2743b = menuItemC0165t;
        this.f2742a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f2742a.onMenuItemActionCollapse(this.f2743b.g(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f2742a.onMenuItemActionExpand(this.f2743b.g(menuItem));
    }
}
