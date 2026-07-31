package com.five_corp.ad.internal.soundstate;

import com.five_corp.ad.internal.cache.r;

/* loaded from: classes4.dex */
public final class e implements com.five_corp.ad.internal.hub.global.d {
    public final Object a = new Object();
    public final com.five_corp.ad.internal.hub.global.b b;
    public d c;

    public e(int i, com.five_corp.ad.internal.media_config.a aVar, com.five_corp.ad.internal.hub.global.b bVar) {
        this.c = new d(i, aVar.b ? 2 : 3);
        this.b = bVar;
    }

    public final d a() {
        d dVar;
        synchronized (this.a) {
            dVar = this.c;
        }
        return dVar;
    }

    @Override // com.five_corp.ad.internal.hub.global.d
    public final void a(r rVar) {
        int i = rVar.a.b ? 2 : 3;
        synchronized (this.a) {
            this.c = new d(this.c.a, i);
        }
    }
}
