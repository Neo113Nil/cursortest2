package com.five_corp.ad.internal.context;

/* loaded from: classes3.dex */
public final class m implements com.five_corp.ad.internal.cache.m {
    public final j a;
    public final k b;
    public final com.five_corp.ad.internal.time.c c;
    public final Object d = new Object();
    public boolean e = false;
    public int f;

    public m(int i, j jVar, k kVar, com.five_corp.ad.internal.time.c cVar) {
        this.f = i;
        this.a = jVar;
        this.b = kVar;
        this.c = cVar;
    }

    @Override // com.five_corp.ad.internal.cache.m
    public final void a(com.five_corp.ad.internal.l lVar) {
        synchronized (this.d) {
            if (!this.e && this.f != 0) {
                this.e = true;
                if (this.c.b()) {
                    this.b.a(lVar);
                }
            }
        }
    }

    @Override // com.five_corp.ad.internal.cache.m
    public final void a(String str) {
        synchronized (this.d) {
            int i = this.f - 1;
            this.f = i;
            if (!this.e && i <= 0) {
                if (this.c.b()) {
                    this.a.a();
                }
            }
        }
    }
}
