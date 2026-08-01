package k;

import android.view.MenuItem;

/* renamed from: k.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC0174s implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f2747a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MenuItemC0175t f2748b;

    public MenuItemOnMenuItemClickListenerC0174s(MenuItemC0175t menuItemC0175t, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2748b = menuItemC0175t;
        this.f2747a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f2747a.onMenuItemClick(this.f2748b.g(menuItem));
    }
}
