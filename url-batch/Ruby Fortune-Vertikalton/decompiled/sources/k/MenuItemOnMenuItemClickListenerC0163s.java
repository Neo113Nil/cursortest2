package k;

import android.view.MenuItem;

/* renamed from: k.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC0163s implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f2738a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MenuItemC0164t f2739b;

    public MenuItemOnMenuItemClickListenerC0163s(MenuItemC0164t menuItemC0164t, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2739b = menuItemC0164t;
        this.f2738a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f2738a.onMenuItemClick(this.f2739b.g(menuItem));
    }
}
