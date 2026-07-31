package com.my.target;

import android.text.TextUtils;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class x5 {
    public String a;
    public int b;
    public int c;

    public static x5 a(mg mgVar) {
        return a.a(mgVar);
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    static class a {
        public static x5 a(mg mgVar) {
            if (mgVar == null) {
                return null;
            }
            x5 x5Var = new x5();
            x5Var.a = mgVar.d("url");
            int a = mgVar.a("width", -1);
            x5Var.b = a;
            if (a <= 0) {
                mgVar.b.a("width").c(3007, Integer.toString(x5Var.b));
            }
            int a2 = mgVar.a("height", -1);
            x5Var.c = a2;
            if (a2 <= 0) {
                mgVar.b.a("height").c(3007, Integer.toString(x5Var.c));
            }
            if (a(x5Var)) {
                return null;
            }
            return x5Var;
        }

        private static boolean a(x5 x5Var) {
            return TextUtils.isEmpty(x5Var.a) || x5Var.b <= 0 || x5Var.c <= 0;
        }
    }
}
