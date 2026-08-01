package defpackage;

import android.view.MenuItem;
import android.view.SubMenu;
import java.util.ArrayList;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class du {
    public final ss a;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public final ArrayList b = new ArrayList();

    public du(ss ssVar) {
        this.a = ssVar;
        b();
    }

    public final MenuItem a(int i) {
        return (MenuItem) this.b.get(i);
    }

    public final void b() {
        ArrayList arrayList = this.b;
        arrayList.clear();
        this.c = 0;
        this.d = 0;
        this.e = 0;
        int i = 0;
        while (true) {
            ss ssVar = this.a;
            if (i >= ssVar.f.size()) {
                break;
            }
            MenuItem item = ssVar.getItem(i);
            if (item.hasSubMenu()) {
                if (!arrayList.isEmpty() && !(arrayList.get(arrayList.size() - 1) instanceof sf) && item.isVisible()) {
                    arrayList.add(new sf());
                }
                arrayList.add(item);
                SubMenu subMenu = item.getSubMenu();
                for (int i2 = 0; i2 < subMenu.size(); i2++) {
                    MenuItem item2 = subMenu.getItem(i2);
                    if (!item.isVisible()) {
                        item2.setVisible(false);
                    }
                    arrayList.add(item2);
                    this.c++;
                    if (item2.isVisible()) {
                        this.d++;
                    }
                }
                arrayList.add(new sf());
            } else {
                arrayList.add(item);
                this.c++;
                if (item.isVisible()) {
                    this.d++;
                    this.e++;
                }
            }
            i++;
        }
        if (arrayList.isEmpty() || !(arrayList.get(arrayList.size() - 1) instanceof sf)) {
            return;
        }
        arrayList.remove(arrayList.size() - 1);
    }
}
