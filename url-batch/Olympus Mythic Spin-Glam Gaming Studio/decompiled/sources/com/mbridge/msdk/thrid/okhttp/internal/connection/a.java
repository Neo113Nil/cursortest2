package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.ironsource.C4701ic;
import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.t;
import com.mbridge.msdk.thrid.okhttp.v;
import com.mbridge.msdk.thrid.okhttp.y;
import java.io.IOException;

/* compiled from: ConnectInterceptor.java */
/* loaded from: classes4.dex */
public final class a implements t {
    public final v a;

    public a(v vVar) {
        this.a = vVar;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.t
    public a0 a(t.a aVar) throws IOException {
        com.mbridge.msdk.thrid.okhttp.internal.http.g gVar = (com.mbridge.msdk.thrid.okhttp.internal.http.g) aVar;
        y d = gVar.d();
        g i = gVar.i();
        return gVar.a(d, i, i.a(this.a, aVar, !d.e().equals(C4701ic.a)), i.c());
    }
}
