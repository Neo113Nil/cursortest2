package com.mbridge.msdk.tracker;

import java.io.Serializable;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: Event.java */
/* loaded from: classes13.dex */
public class e implements Serializable {
    private String a;
    private JSONObject d;
    private h i;
    private int b = 0;
    private int c = 0;
    private long g = 0;
    private long h = 604800000;
    private boolean j = false;
    private boolean k = false;
    private long f = System.currentTimeMillis();
    private String e = UUID.randomUUID().toString();

    public e(String str) {
        this.a = str;
    }

    public void a(int i) {
        this.c = i;
    }

    public void b(int i) {
        this.b = i;
    }

    public void c(long j) {
        this.f = j;
    }

    public long d() {
        return this.g;
    }

    public String g() {
        return this.a;
    }

    public int h() {
        return this.c;
    }

    public JSONObject i() {
        JSONObject jSONObject = this.d;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        this.d = jSONObject2;
        return jSONObject2;
    }

    public h j() {
        return this.i;
    }

    public long k() {
        return this.h;
    }

    public long l() {
        return this.f;
    }

    public int m() {
        return this.b;
    }

    public String n() {
        return this.e;
    }

    public boolean o() {
        return this.k;
    }

    public boolean p() {
        return this.j;
    }

    public void a(JSONObject jSONObject) {
        this.d = jSONObject;
    }

    void b(long j) {
        this.h = j;
    }

    void a(String str) {
        this.e = str;
    }

    public void a(long j) {
        this.g = j;
    }

    public void a(h hVar) {
        this.i = hVar;
    }

    public void a(boolean z) {
        this.k = z;
    }
}
