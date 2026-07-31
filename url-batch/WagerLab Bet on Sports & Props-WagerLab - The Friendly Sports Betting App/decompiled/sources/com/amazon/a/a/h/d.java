package com.amazon.a.a.h;

/* compiled from: MetricsManagerImpl.java */
/* loaded from: classes3.dex */
public class d implements c {

    /* renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f522a = new com.amazon.a.a.o.c("MetricsManagerImpl");
    private b b = new b();

    @Override // com.amazon.a.a.h.c
    public synchronized void a(a aVar) {
        if (com.amazon.a.a.o.c.f599a) {
            f522a.a("Recording Metric: " + aVar);
        }
        this.b.a(aVar);
    }

    @Override // com.amazon.a.a.h.c
    public synchronized b a() {
        if (this.b.a()) {
            return this.b;
        }
        b bVar = this.b;
        this.b = new b();
        return bVar;
    }
}
