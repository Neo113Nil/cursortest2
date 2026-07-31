package com.mbridge.msdk.thrid.okhttp.internal.http;

import com.ironsource.B5;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.l;
import com.mbridge.msdk.thrid.okhttp.t;
import com.mbridge.msdk.thrid.okhttp.u;
import com.mbridge.msdk.thrid.okhttp.y;
import com.mbridge.msdk.thrid.okhttp.z;
import io.bidmachine.util.network.NetworkUtils;
import java.io.IOException;
import java.util.List;

/* compiled from: BridgeInterceptor.java */
/* loaded from: classes14.dex */
public final class a implements t {
    private final l a;

    public a(l lVar) {
        this.a = lVar;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.t
    public a0 a(t.a aVar) throws IOException {
        y d = aVar.d();
        y.a f = d.f();
        z a = d.a();
        if (a != null) {
            u b = a.b();
            if (b != null) {
                f.b("Content-Type", b.toString());
            }
            long a2 = a.a();
            if (a2 != -1) {
                f.b(NetworkUtils.HEADER_CONTENT_LENGTH, Long.toString(a2));
                f.a("Transfer-Encoding");
            } else {
                f.b("Transfer-Encoding", "chunked");
                f.a(NetworkUtils.HEADER_CONTENT_LENGTH);
            }
        }
        boolean z = false;
        if (d.a("Host") == null) {
            f.b("Host", com.mbridge.msdk.thrid.okhttp.internal.c.a(d.g(), false));
        }
        if (d.a("Connection") == null) {
            f.b("Connection", "Keep-Alive");
        }
        if (d.a("Accept-Encoding") == null && d.a(Command.HTTP_HEADER_RANGE) == null) {
            f.b("Accept-Encoding", "gzip");
            z = true;
        }
        List<com.mbridge.msdk.thrid.okhttp.k> a3 = this.a.a(d.g());
        if (!a3.isEmpty()) {
            f.b("Cookie", a(a3));
        }
        if (d.a("User-Agent") == null) {
            f.b("User-Agent", com.mbridge.msdk.thrid.okhttp.internal.d.a());
        }
        a0 a4 = aVar.a(f.a());
        e.a(this.a, d.g(), a4.m());
        a0.a a5 = a4.p().a(d);
        if (z && "gzip".equalsIgnoreCase(a4.b("Content-Encoding")) && e.b(a4)) {
            com.mbridge.msdk.thrid.okio.j jVar = new com.mbridge.msdk.thrid.okio.j(a4.d().m());
            a5.a(a4.m().a().b("Content-Encoding").b(NetworkUtils.HEADER_CONTENT_LENGTH).a());
            a5.a(new h(a4.b("Content-Type"), -1L, com.mbridge.msdk.thrid.okio.l.a(jVar)));
        }
        return a5.a();
    }

    private String a(List<com.mbridge.msdk.thrid.okhttp.k> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append("; ");
            }
            com.mbridge.msdk.thrid.okhttp.k kVar = list.get(i);
            sb.append(kVar.a());
            sb.append(B5.U);
            sb.append(kVar.b());
        }
        return sb.toString();
    }
}
