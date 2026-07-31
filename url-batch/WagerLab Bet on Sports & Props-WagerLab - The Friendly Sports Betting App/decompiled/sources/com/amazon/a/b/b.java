package com.amazon.a.b;

import java.util.Date;

/* compiled from: ContentLicense.java */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f613a;
    private final String b;
    private final String c;
    private final Date d;
    private final String e;

    public b(com.amazon.a.a.o.b.f fVar) throws com.amazon.a.a.o.b.a.b {
        this.f613a = a("checksum", fVar);
        this.b = a("customerId", fVar);
        this.c = a("deviceId", fVar);
        this.e = a("packageName", fVar);
        this.d = b("expiration", fVar);
    }

    private String a(String str, com.amazon.a.a.o.b.f fVar) throws com.amazon.a.a.o.b.a.b {
        String a2 = fVar.a(str);
        if (com.amazon.a.a.o.e.a(a2)) {
            throw com.amazon.a.a.o.b.a.b.a(str);
        }
        return a2;
    }

    private Date b(String str, com.amazon.a.a.o.b.f fVar) throws com.amazon.a.a.o.b.a.b {
        String a2 = a(str, fVar);
        try {
            return new Date(Long.parseLong(a2));
        } catch (NumberFormatException unused) {
            throw com.amazon.a.a.o.b.a.b.a(str, a2);
        }
    }

    public String a() {
        return this.f613a;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public Date d() {
        return this.d;
    }

    public String e() {
        return this.e;
    }
}
