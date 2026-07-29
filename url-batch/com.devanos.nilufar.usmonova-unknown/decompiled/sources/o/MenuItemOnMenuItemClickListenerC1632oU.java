package o;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* renamed from: o.oU, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC1632oU implements MenuItem.OnMenuItemClickListener {
    public static final Class[] d = {MenuItem.class};
    public final /* synthetic */ int a = 0;
    public Object b;
    public Object c;

    public /* synthetic */ MenuItemOnMenuItemClickListenerC1632oU() {
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        switch (this.a) {
            case 0:
                Object obj = this.b;
                Method method = (Method) this.c;
                try {
                    if (method.getReturnType() == Boolean.TYPE) {
                        return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                    }
                    method.invoke(obj, menuItem);
                    return true;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            default:
                return ((MenuItem.OnMenuItemClickListener) this.b).onMenuItemClick(((MenuItemC1548nC) this.c).g(menuItem));
        }
    }

    public MenuItemOnMenuItemClickListenerC1632oU(MenuItemC1548nC menuItemC1548nC, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.c = menuItemC1548nC;
        this.b = onMenuItemClickListener;
    }
}
