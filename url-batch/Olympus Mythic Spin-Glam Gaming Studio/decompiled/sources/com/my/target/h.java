package com.my.target;

import android.content.Context;
import com.my.target.common.menu.Menu;
import com.my.target.common.menu.MenuAction;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes5.dex */
public final class h implements Menu {
    private String b;
    private WeakReference d;
    private final List a = new ArrayList();
    private WeakReference c = null;

    @Override // com.my.target.common.menu.Menu
    public void addAboutCompanyInfo(String str) {
        this.b = str;
    }

    @Override // com.my.target.common.menu.Menu
    public void addAction(MenuAction menuAction) {
        this.a.add(menuAction);
    }

    @Override // com.my.target.common.menu.Menu
    public void dismiss() {
        WeakReference weakReference = this.d;
        if (weakReference == null) {
            mi.a("AdChoicesOptionMenu: can't dismiss not existing view");
            return;
        }
        k kVar = (k) weakReference.get();
        if (kVar == null) {
            mi.a("AdChoicesOptionMenu: can't dismiss not existing or garbage-collected view");
        } else {
            kVar.a();
        }
    }

    @Override // com.my.target.common.menu.Menu
    public void present(Context context) {
        if (this.a.isEmpty()) {
            mi.a("AdChoicesOptionMenu: there are no actions, can't present.");
        } else {
            if (this.c == null) {
                mi.a("AdChoicesOptionMenu: there is no listener, can't present");
                return;
            }
            k kVar = new k(context, this.a, this.b, this.c);
            this.d = new WeakReference(kVar);
            kVar.b();
        }
    }

    @Override // com.my.target.common.menu.Menu
    public void setListener(Menu.Listener listener) {
        this.c = new WeakReference(listener);
    }
}
