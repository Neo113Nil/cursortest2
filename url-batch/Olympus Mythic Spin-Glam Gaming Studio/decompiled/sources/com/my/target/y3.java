package com.my.target;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes3.dex */
public class y3 {
    public int a;
    public String b;
    public String c;
    public int d;
    public final List e = new ArrayList();

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public static class a {
        public String a;
        public int b;
        public x5 c;
    }

    public static y3 a(mg mgVar) {
        return b.a(mgVar);
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    static class b {
        public static y3 a(mg mgVar) {
            if (mgVar == null) {
                return null;
            }
            y3 y3Var = new y3();
            y3Var.a = mgVar.a("id", -1);
            y3Var.d = mgVar.a("percent", -1);
            y3Var.b = mgVar.d("alias");
            y3Var.c = mgVar.d("text");
            y3Var.e.addAll(a(mgVar.b("images")));
            if (a(y3Var)) {
                return null;
            }
            return y3Var;
        }

        private static a b(mg mgVar) {
            a aVar = new a();
            String d = mgVar.d("type");
            aVar.a = d;
            if (d != null && !d.equals("portrait") && !d.equals("landscape")) {
                mgVar.b.c(3007, aVar.a);
                aVar.a = null;
            }
            aVar.b = mgVar.a("minHeight", -1);
            aVar.c = x5.a(mgVar.c("image"));
            if (a(aVar)) {
                return null;
            }
            return aVar;
        }

        private static boolean a(y3 y3Var) {
            return y3Var.a == -1 || y3Var.d == -1 || TextUtils.isEmpty(y3Var.b) || TextUtils.isEmpty(y3Var.c);
        }

        private static List a(lg lgVar) {
            a b;
            ArrayList arrayList = new ArrayList();
            if (lgVar != null) {
                for (int i = 0; i < lgVar.a(); i++) {
                    mg a = lgVar.a(i);
                    if (a != null && (b = b(a)) != null) {
                        arrayList.add(b);
                    }
                }
            }
            return arrayList;
        }

        private static boolean a(a aVar) {
            return aVar.a == null || aVar.b <= 0 || aVar.c == null;
        }
    }
}
