package com.my.target;

import android.content.Context;
import android.content.SharedPreferences;
import com.ironsource.O6;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class ve {
    private static volatile ve b;
    private final SharedPreferences a;

    private ve(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public static ve a(Context context) {
        ve veVar;
        ve veVar2 = b;
        if (veVar2 != null) {
            return veVar2;
        }
        synchronized (ve.class) {
            try {
                veVar = b;
                if (veVar == null) {
                    b = new ve(context.getSharedPreferences("mytarget_prefs", 0));
                    veVar = b;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return veVar;
    }

    public int b() {
        return a("asis");
    }

    public void c(String str) {
        a(O6.M0, str);
    }

    public void d(String str) {
        a("hoaid", str);
    }

    public String e() {
        return b("hoaid");
    }

    public String f() {
        return b("hosts");
    }

    public String g() {
        return b("instanceId");
    }

    public void b(int i) {
        a("sdk_flags", i);
    }

    public int c() {
        return a("sdk_flags");
    }

    public String d() {
        return b("hlimit");
    }

    public void e(String str) {
        a("hlimit", str);
    }

    public void f(String str) {
        a("hosts", str);
    }

    public void g(String str) {
        a("instanceId", str);
    }

    private String b(String str) {
        try {
            String string = this.a.getString(str, null);
            return string != null ? string : "";
        } catch (Throwable th) {
            mi.c("PrefsCache exception - " + th);
            return "";
        }
    }

    public String a() {
        return b(O6.M0);
    }

    public void a(int i) {
        a("asis", i);
    }

    private int a(String str) {
        try {
            return this.a.getInt(str, -1);
        } catch (Throwable th) {
            mi.c("PrefsCache exception - " + th);
            return 0;
        }
    }

    private void a(String str, String str2) {
        try {
            SharedPreferences.Editor edit = this.a.edit();
            edit.putString(str, str2);
            edit.commit();
        } catch (Throwable th) {
            mi.c("PrefsCache exception - " + th);
        }
    }

    private void a(String str, int i) {
        try {
            SharedPreferences.Editor edit = this.a.edit();
            edit.putInt(str, i);
            edit.commit();
        } catch (Throwable th) {
            mi.c("PrefsCache exception - " + th);
        }
    }
}
