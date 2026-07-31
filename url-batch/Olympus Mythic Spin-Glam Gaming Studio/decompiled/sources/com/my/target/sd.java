package com.my.target;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class sd extends x {
    private final String b;
    private final ArrayList c = new ArrayList();
    private final ArrayList d = new ArrayList();
    private JSONObject e;
    private boolean f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;

    private sd(String str) {
        this.b = str;
    }

    public static sd b(String str) {
        return new sd(str);
    }

    public void a(JSONObject jSONObject) {
        this.e = jSONObject;
    }

    public List c() {
        return new ArrayList(this.c);
    }

    public String d() {
        return this.i;
    }

    public void e(String str) {
        this.h = str;
    }

    public String f() {
        return this.h;
    }

    public void g(String str) {
        this.j = str;
    }

    public void h(String str) {
        this.g = str;
    }

    public String i() {
        return this.b;
    }

    public JSONObject j() {
        return this.e;
    }

    public ArrayList k() {
        return this.d;
    }

    public String l() {
        return this.g;
    }

    public boolean m() {
        return this.f;
    }

    public void a(boolean z) {
        this.f = z;
    }

    public void c(String str) {
        this.i = str;
    }

    public void d(String str) {
        this.k = str;
    }

    public String e() {
        return this.k;
    }

    public void f(String str) {
        this.l = str;
    }

    public String g() {
        return this.l;
    }

    public String h() {
        return this.j;
    }

    public void a(md mdVar) {
        this.c.add(mdVar);
    }

    @Override // com.my.target.x
    public int a() {
        return this.c.size();
    }

    public String a(String str) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Pair pair = (Pair) obj;
            if (str.equals(pair.first)) {
                return (String) pair.second;
            }
        }
        return null;
    }
}
