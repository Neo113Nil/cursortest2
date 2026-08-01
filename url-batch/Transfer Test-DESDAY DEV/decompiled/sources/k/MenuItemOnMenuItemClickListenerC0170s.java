package k;

import android.view.MenuItem;

/* renamed from: k.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC0170s implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f2812a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MenuItemC0171t f2813b;

    public MenuItemOnMenuItemClickListenerC0170s(MenuItemC0171t menuItemC0171t, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2813b = menuItemC0171t;
        this.f2812a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f2812a.onMenuItemClick(this.f2813b.g(menuItem));
    }
}
