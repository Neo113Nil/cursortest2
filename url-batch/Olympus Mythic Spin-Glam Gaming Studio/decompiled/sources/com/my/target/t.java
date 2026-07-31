package com.my.target;

import android.text.TextUtils;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes5.dex */
public final class t {
    public static final t k = new t("", null, -1, 999, 0, vb.a());
    private static final Set l;
    private static volatile boolean m;
    public final String a;
    public final String b;
    public final int c;
    public final Integer d;
    public final int e;
    public final wb f;
    private int g;
    private String h;
    private boolean i = false;
    private volatile int j = m ? 1 : 0;

    static {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        l = treeSet;
        treeSet.add("com.vkontakte.android");
        treeSet.add("ru.mail.mailapp");
        treeSet.add("ru.ok.messages");
        treeSet.add("ru.ok.android");
        treeSet.add("ru.ok.android.debug");
        treeSet.add("ru.vk.store");
        treeSet.add("ru.vk.store.qa");
        treeSet.add("com.vk.tv");
        treeSet.add("com.vk.vkvideo");
        treeSet.add("com.vk.clips");
        m = false;
    }

    public t(String str, String str2, Integer num, int i, int i2, wb wbVar) {
        this.a = str;
        this.b = str2;
        this.d = num;
        this.c = i;
        this.e = i2;
        this.f = wbVar;
    }

    public static t a(String str, int i, int i2, wb wbVar) {
        return new t(str, null, Integer.valueOf(i), i2, 0, wbVar);
    }

    public int b() {
        return this.g;
    }

    public void c(final boolean z) {
        if (this.j == 0) {
            this.f.a(this, z, new Runnable() { // from class: com.my.target.t$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    t.this.a(z);
                }
            });
        }
    }

    public String d() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (obj != null && t.class == obj.getClass()) {
            t tVar = (t) obj;
            if (this.c == tVar.c && this.e == tVar.e && this.g == tVar.g && Objects.equals(this.h, tVar.h) && Objects.equals(this.a, tVar.a) && Objects.equals(this.b, tVar.b) && Objects.equals(this.d, tVar.d) && Objects.equals(this.f, tVar.f)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.a, this.b, Integer.valueOf(this.c), this.d, Integer.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h);
    }

    public void b(boolean z) {
        this.i = z;
    }

    public static t a(String str, String str2, int i, wb wbVar) {
        return new t(str, str2, -1, i, 1, wbVar);
    }

    public void b(int i, int i2) {
        a(i, 3, i2, (String) null);
    }

    public void b(int i, int i2, String str) {
        a(i, 3, i2, str);
    }

    public static t a(String str, int i, wb wbVar) {
        return new t(str, null, -1, i, 2, wbVar);
    }

    public static t a(String str, t tVar) {
        t tVar2 = new t(str, null, tVar.d, tVar.c, tVar.e, tVar.f);
        tVar2.g = tVar.g;
        tVar2.h = tVar.h;
        return tVar2;
    }

    public static void a(u3 u3Var) {
        m = (!TextUtils.isEmpty(u3Var.i) && u3Var.i.startsWith("com.my.targetdemo5.")) || l.contains(u3Var.i);
    }

    public boolean c() {
        return this.i;
    }

    public void c(int i, int i2) {
        a(i, 1, i2, (String) null);
    }

    public void c(int i, int i2, String str) {
        a(i, 1, i2, str);
    }

    public w0 a(u0 u0Var) {
        return new w0(this, u0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z) {
        if (this.j == 0) {
            this.j = z ? 1 : 2;
        }
    }

    public int a() {
        return this.j;
    }

    public void a(int i) {
        this.g = i;
    }

    public void a(String str) {
        this.h = str;
    }

    public void a(int i, int i2) {
        a(i, 0, i2, (String) null);
    }

    public void a(int i, int i2, String str) {
        a(i, 0, i2, str);
    }

    private void a(int i, int i2, int i3, String str) {
        a(i, i2, i3, str, null);
    }

    private void a(int i, int i2, int i3, String str, String str2) {
        this.f.a(this, i, i2, i3, str, str2);
    }
}
