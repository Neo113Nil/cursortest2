package o;

import android.view.MenuItem;

/* renamed from: o.mC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemOnActionExpandListenerC1482mC implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener a;
    public final /* synthetic */ MenuItemC1548nC b;

    public MenuItemOnActionExpandListenerC1482mC(MenuItemC1548nC menuItemC1548nC, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.b = menuItemC1548nC;
        this.a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.a.onMenuItemActionCollapse(this.b.g(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.a.onMenuItemActionExpand(this.b.g(menuItem));
    }
}
