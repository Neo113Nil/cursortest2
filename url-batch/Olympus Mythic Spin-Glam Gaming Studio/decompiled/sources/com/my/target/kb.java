package com.my.target;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public final class kb {
    private final String a;
    private final String b;
    private final String c;
    private String f;
    private x g;
    private final HashMap e = new HashMap();
    private int h = 10000;
    private float i = 0.0f;
    private final th d = th.a(w0.d, (sh) null);

    private kb(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public static kb a(String str, String str2, String str3) {
        return new kb(str, str2, str3);
    }

    public String b() {
        return this.a;
    }

    public Map c() {
        return new HashMap(this.e);
    }

    public String d() {
        return this.f;
    }

    public String e() {
        return this.b;
    }

    public float f() {
        return this.i;
    }

    public x g() {
        return this.g;
    }

    public th h() {
        return this.d;
    }

    public int i() {
        return this.h;
    }

    public boolean j() {
        return "myTarget".equals(this.a);
    }

    public String a() {
        return this.c;
    }

    public void a(String str) {
        this.f = str;
    }

    public void a(int i) {
        this.h = i;
    }

    public void a(float f) {
        this.i = f;
    }

    public void a(x xVar) {
        this.g = xVar;
    }

    public void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str2 == null) {
            this.e.remove(str);
        } else {
            this.e.put(str, str2);
        }
    }
}
