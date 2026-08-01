package k;

import android.view.MenuItem;

/* renamed from: k.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemOnActionExpandListenerC0162r implements MenuItem.OnActionExpandListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f2736a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MenuItemC0164t f2737b;

    public MenuItemOnActionExpandListenerC0162r(MenuItemC0164t menuItemC0164t, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2737b = menuItemC0164t;
        this.f2736a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f2736a.onMenuItemActionCollapse(this.f2737b.g(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f2736a.onMenuItemActionExpand(this.f2737b.g(menuItem));
    }
}
