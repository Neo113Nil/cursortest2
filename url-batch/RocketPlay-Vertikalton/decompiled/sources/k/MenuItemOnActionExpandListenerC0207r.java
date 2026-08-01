package k;

import android.view.MenuItem;

/* renamed from: k.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemOnActionExpandListenerC0207r implements MenuItem.OnActionExpandListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f3241a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MenuItemC0209t f3242b;

    public MenuItemOnActionExpandListenerC0207r(MenuItemC0209t menuItemC0209t, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f3242b = menuItemC0209t;
        this.f3241a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f3241a.onMenuItemActionCollapse(this.f3242b.g(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f3241a.onMenuItemActionExpand(this.f3242b.g(menuItem));
    }
}
