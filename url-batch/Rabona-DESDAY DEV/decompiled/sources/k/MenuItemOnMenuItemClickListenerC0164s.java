package k;

import android.view.MenuItem;

/* renamed from: k.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC0164s implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f2744a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MenuItemC0165t f2745b;

    public MenuItemOnMenuItemClickListenerC0164s(MenuItemC0165t menuItemC0165t, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2745b = menuItemC0165t;
        this.f2744a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f2744a.onMenuItemClick(this.f2745b.g(menuItem));
    }
}
