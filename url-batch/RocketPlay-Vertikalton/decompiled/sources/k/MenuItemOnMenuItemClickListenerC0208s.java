package k;

import android.view.MenuItem;

/* renamed from: k.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC0208s implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f3243a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MenuItemC0209t f3244b;

    public MenuItemOnMenuItemClickListenerC0208s(MenuItemC0209t menuItemC0209t, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f3244b = menuItemC0209t;
        this.f3243a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f3243a.onMenuItemClick(this.f3244b.g(menuItem));
    }
}
