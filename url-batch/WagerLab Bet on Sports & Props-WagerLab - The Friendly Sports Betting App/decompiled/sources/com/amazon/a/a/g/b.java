package com.amazon.a.a.g;

/* compiled from: KiwiLogHandler.java */
/* loaded from: classes3.dex */
public class b implements c {

    /* renamed from: a, reason: collision with root package name */
    private static com.amazon.a.a.o.c f518a = new com.amazon.a.a.o.c("Appstore SDK - Production Mode");

    @Override // com.amazon.a.a.g.c
    public boolean a() {
        return com.amazon.a.a.o.c.f599a;
    }

    @Override // com.amazon.a.a.g.c
    public boolean b() {
        return com.amazon.a.a.o.c.b;
    }

    @Override // com.amazon.a.a.g.c
    public boolean c() {
        return com.amazon.a.a.o.c.b();
    }

    @Override // com.amazon.a.a.g.c
    public void a(String str, String str2) {
        f518a.a(d(str, str2));
    }

    @Override // com.amazon.a.a.g.c
    public void b(String str, String str2) {
        f518a.b(d(str, str2));
    }

    @Override // com.amazon.a.a.g.c
    public void c(String str, String str2) {
        f518a.c(d(str, str2));
    }

    private static String d(String str, String str2) {
        return str + ": " + str2;
    }
}
