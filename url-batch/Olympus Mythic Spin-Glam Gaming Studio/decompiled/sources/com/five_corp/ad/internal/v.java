package com.five_corp.ad.internal;

/* loaded from: classes3.dex */
public final class v implements com.five_corp.ad.internal.hub.global.d, com.five_corp.ad.internal.hub.global.c, com.five_corp.ad.internal.hub.global.f {
    public static final /* synthetic */ int h = 0;
    public final t a;
    public final com.five_corp.ad.internal.http.d b;
    public final com.five_corp.ad.internal.bgtask.b c;
    public final com.five_corp.ad.internal.hub.global.b d;
    public final Object e = new Object();
    public int f = 6;
    public com.five_corp.ad.internal.tracking_data.d g;

    static {
        v.class.toString();
    }

    public v(t tVar, com.five_corp.ad.internal.http.d dVar, com.five_corp.ad.internal.bgtask.b bVar, com.five_corp.ad.internal.hub.global.b bVar2) {
        this.a = tVar;
        this.b = dVar;
        this.c = bVar;
        this.d = bVar2;
    }

    @Override // com.five_corp.ad.internal.hub.global.d
    public final void a(com.five_corp.ad.internal.cache.r rVar) {
        synchronized (this.e) {
            this.f = rVar.a.g;
        }
    }

    @Override // com.five_corp.ad.internal.hub.global.f
    public final void a(com.five_corp.ad.internal.tracking_data.d dVar) {
        synchronized (this.e) {
            this.g = dVar;
        }
    }
}
