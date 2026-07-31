package com.my.target;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import com.my.target.common.menu.Menu;
import com.my.target.common.menu.MenuAction;
import com.my.target.common.menu.MenuFactory;
import com.my.target.e;
import com.my.target.g;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes5.dex */
public final class f implements Menu.Listener {
    private final e a;
    private final MenuFactory b;
    private Menu c;
    private g.a d;
    private WeakReference e;

    private f(e eVar, MenuFactory menuFactory) {
        this.a = eVar;
        this.b = menuFactory;
    }

    public static f a(e eVar, MenuFactory menuFactory) {
        return new f(eVar, menuFactory);
    }

    public boolean b() {
        return this.c != null;
    }

    @Override // com.my.target.common.menu.Menu.Listener
    public void onActionClick(MenuAction menuAction) {
        g.a aVar;
        if (menuAction.style == 1) {
            a();
            return;
        }
        WeakReference weakReference = this.e;
        if (weakReference == null) {
            mi.a("AdChoicesOptionsController: there is no context, can't process action click");
            return;
        }
        Context context = (Context) weakReference.get();
        if (context == null) {
            mi.a("AdChoicesOptionsController: there is no context, can't process action click");
            return;
        }
        if (this.a.e().isEmpty()) {
            mi.a("AdChoicesOptionsController: there are no menuActions, can't process action click");
            return;
        }
        e.a a = this.a.a(menuAction);
        if (a == null) {
            mi.a("AdChoicesOptionsController: can't obtain option by menu action.");
            return;
        }
        String str = a.a;
        if (!TextUtils.isEmpty(str)) {
            wh.a(str);
        }
        if (a.e.type.equals("copy")) {
            String str2 = a.c;
            if (str2 != null) {
                ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("copied id", str2));
            }
            a();
            return;
        }
        String str3 = a.b;
        if (!TextUtils.isEmpty(str3)) {
            a7.a(str3, context);
        }
        if (a.d && (aVar = this.d) != null) {
            aVar.b();
        }
        a();
    }

    public void a(Context context) {
        List e = this.a.e();
        if (e.isEmpty()) {
            return;
        }
        Menu createMenu = this.b.createMenu();
        this.c = createMenu;
        this.e = new WeakReference(context);
        if (this.a.a() != null) {
            try {
                createMenu.addAboutCompanyInfo(this.a.a());
            } catch (Throwable th) {
                if (!(th instanceof AbstractMethodError) || th.getStackTrace().length != new Exception().getStackTrace().length) {
                    mi.b("Unexpected exception: " + th.getMessage());
                }
            }
        }
        Iterator it = e.iterator();
        while (it.hasNext()) {
            createMenu.addAction((MenuAction) it.next());
        }
        createMenu.setListener(this);
        createMenu.present(context);
    }

    public void a(g.a aVar) {
        this.d = aVar;
    }

    private void a() {
        Menu menu = this.c;
        if (menu == null) {
            return;
        }
        menu.dismiss();
        this.c = null;
    }
}
