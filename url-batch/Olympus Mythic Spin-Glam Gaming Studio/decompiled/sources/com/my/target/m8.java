package com.my.target;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import com.my.target.common.menu.MenuAction;
import com.my.target.e;
import com.my.target.g;
import com.my.target.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public final class m8 implements l8, i.a {
    private final e a;
    private final i b;
    private i c;
    private Map d;
    private g.a e;
    private g.b f;
    private final c5 g;
    private final d3 h;
    private final String i;

    public m8(e eVar, String str, Context context) {
        this.a = eVar;
        this.i = str;
        this.b = m9.a(context, this);
        this.g = eVar.f();
        this.h = eVar.d();
    }

    @Override // com.my.target.i.a
    public void a() {
        g.b bVar = this.f;
        if (bVar != null) {
            bVar.a();
        }
    }

    @Override // com.my.target.i.a
    public void b() {
        g.a aVar = this.e;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // com.my.target.l8
    public void c() {
        List b = this.a.b();
        if (b == null) {
            return;
        }
        List b2 = b(b);
        if (b2.isEmpty()) {
            return;
        }
        this.b.a(this.i, this.a.a(), null, null, null, b2);
    }

    @Override // com.my.target.i.a
    public void onActionClick(MenuAction menuAction) {
        g.a aVar;
        d3 d3Var;
        c5 c5Var;
        Map map = this.d;
        if (map == null) {
            return;
        }
        e.a aVar2 = (e.a) map.get(menuAction);
        if (aVar2 != null) {
            String str = aVar2.a;
            if (!TextUtils.isEmpty(str)) {
                wh.a(str);
            }
        }
        if (menuAction.type.equalsIgnoreCase("self::hide_options")) {
            this.c = new d5(this.b.a().getContext(), this);
            List a = a("hide");
            if (!a.isEmpty() && (c5Var = this.g) != null) {
                this.c.a(c5Var.d(), this.g.b(), this.g.c(), null, this.g.a(), a);
                this.b.dismiss();
            }
        } else if (menuAction.type.equalsIgnoreCase("self::complain_options")) {
            this.c = new e3(this.b.a().getContext(), this);
            List a2 = a("complain");
            if (!a2.isEmpty() && (d3Var = this.h) != null) {
                this.c.a(d3Var.c(), null, this.h.b(), null, this.h.a(), a2);
                this.b.dismiss();
            }
        } else if (menuAction.type.equalsIgnoreCase("copy")) {
            if (this.d != null) {
                if (aVar2 == null) {
                    return;
                }
                String str2 = aVar2.c;
                if (str2 != null) {
                    ((ClipboardManager) this.b.a().getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("copied id", str2));
                }
                g.b bVar = this.f;
                if (bVar != null) {
                    bVar.a();
                }
            }
        } else if (this.d != null) {
            if (aVar2 == null) {
                return;
            }
            String str3 = aVar2.b;
            if (!TextUtils.isEmpty(str3)) {
                a7.a(str3, this.b.a().getContext());
            }
            if (aVar2.e.type.equals("complain")) {
                qe qeVar = new qe(this.b.a().getContext(), this);
                d3 d3Var2 = this.h;
                if (d3Var2 != null) {
                    qeVar.a(d3Var2.c(), this.h.e(), this.h.f(), null, this.h.d(), null);
                }
            } else if (aVar2.d && (aVar = this.e) != null) {
                aVar.b();
            }
            i iVar = this.c;
            if (iVar != null) {
                iVar.dismiss();
            }
        }
        this.b.dismiss();
    }

    private List a(String str) {
        ArrayList arrayList = new ArrayList();
        if (this.a.b() != null) {
            if (this.d == null) {
                this.d = new HashMap();
            }
            this.d.clear();
            for (e.a aVar : this.a.b()) {
                if (aVar.e.type.equalsIgnoreCase(str)) {
                    arrayList.add(aVar.e);
                    this.d.put(aVar.e, aVar);
                }
            }
        }
        return arrayList;
    }

    private List b(List list) {
        ArrayList arrayList = new ArrayList();
        if (list.isEmpty()) {
            return arrayList;
        }
        if (this.d == null) {
            this.d = new HashMap();
        }
        this.d.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e.a aVar = (e.a) it.next();
            String str = aVar.e.type;
            if (!str.equalsIgnoreCase("hide") && !str.equalsIgnoreCase("complain")) {
                this.d.put(aVar.e, aVar);
                arrayList.add(aVar.e);
            }
        }
        a(arrayList);
        return arrayList;
    }

    private void a(List list) {
        list.add(new MenuAction("Это не интересно", 0, "self::hide_options", "hide"));
        list.add(new MenuAction("Жалоба", 0, "self::complain_options", "complain"));
    }

    @Override // com.my.target.l8
    public void a(g.a aVar) {
        this.e = aVar;
    }

    @Override // com.my.target.l8
    public void a(g.b bVar) {
        this.f = bVar;
    }
}
