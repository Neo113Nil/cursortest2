package com.five_corp.ad.internal.bgtask;

import com.ironsource.C4701ic;

/* loaded from: classes5.dex */
public final class k extends n {
    public final String c;
    public final String d;
    public final com.five_corp.ad.internal.http.d e;

    public k(String str, String str2, com.five_corp.ad.internal.http.d dVar) {
        super(2);
        this.c = str;
        this.d = str2;
        this.e = dVar;
    }

    @Override // com.five_corp.ad.internal.bgtask.n
    public final boolean c() {
        com.five_corp.ad.internal.util.b a = this.e.a(this.c, C4701ic.a, null, null, this.d);
        return a.a && ((com.five_corp.ad.internal.http.c) a.c).a == 200;
    }
}
