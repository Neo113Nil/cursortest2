package com.my.target;

import com.my.target.common.menu.MenuAction;
import com.my.target.common.models.ImageData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes15.dex */
public class e {
    private final ImageData a;
    private final String b;
    private List c;
    private List d;
    private String e;
    private c5 f;
    private d3 g;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public static class a {
        public final String a;
        public final String b;
        public final String c;
        public final boolean d;
        public final MenuAction e;

        private a(String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
            this.a = str3;
            this.b = str4;
            this.c = str5;
            this.d = z;
            this.e = new MenuAction(str, 0, str2, str6);
        }

        public static a a(String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
            return new a(str, str2, str3, str4, str5, str6, z);
        }
    }

    private e(ImageData imageData, String str) {
        this.a = imageData;
        this.b = str;
    }

    public static e a(ImageData imageData, String str) {
        return new e(imageData, str);
    }

    public List b() {
        return this.c;
    }

    public String c() {
        return this.b;
    }

    public d3 d() {
        return this.g;
    }

    public List e() {
        List list = this.d;
        if (list != null) {
            return list;
        }
        List a2 = a(this.c);
        this.d = a2;
        return a2;
    }

    public c5 f() {
        return this.f;
    }

    public ImageData g() {
        return this.a;
    }

    private static List a(List list) {
        if (list == null || list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(list.size() + 1);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((a) it.next()).e);
        }
        arrayList.add(new MenuAction("", 1, "cancel", null));
        return arrayList;
    }

    public void b(List list) {
        this.c = list;
        if (this.d != null) {
            this.d = a(list);
        }
    }

    public String a() {
        return this.e;
    }

    public void a(String str) {
        this.e = str;
    }

    public void a(c5 c5Var) {
        this.f = c5Var;
    }

    public void a(d3 d3Var) {
        this.g = d3Var;
    }

    public a a(MenuAction menuAction) {
        for (a aVar : this.c) {
            if (aVar.e == menuAction) {
                return aVar;
            }
        }
        return null;
    }
}
