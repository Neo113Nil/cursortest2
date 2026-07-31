package com.mbridge.msdk.thrid.okhttp.internal.http;

import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.o;
import com.mbridge.msdk.thrid.okhttp.t;
import com.mbridge.msdk.thrid.okhttp.y;
import java.io.IOException;
import java.util.List;

/* compiled from: RealInterceptorChain.java */
/* loaded from: classes14.dex */
public final class g implements t.a {
    private final List<t> a;
    private final com.mbridge.msdk.thrid.okhttp.internal.connection.g b;
    private final c c;
    private final com.mbridge.msdk.thrid.okhttp.internal.connection.c d;
    private final int e;
    private final y f;
    private final com.mbridge.msdk.thrid.okhttp.d g;
    private final o h;
    private final int i;
    private final int j;
    private final int k;
    private int l;

    public g(List<t> list, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar, c cVar, com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar2, int i, y yVar, com.mbridge.msdk.thrid.okhttp.d dVar, o oVar, int i2, int i3, int i4) {
        this.a = list;
        this.d = cVar2;
        this.b = gVar;
        this.c = cVar;
        this.e = i;
        this.f = yVar;
        this.g = dVar;
        this.h = oVar;
        this.i = i2;
        this.j = i3;
        this.k = i4;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.t.a
    public int a() {
        return this.i;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.t.a
    public int b() {
        return this.j;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.t.a
    public int c() {
        return this.k;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.t.a
    public y d() {
        return this.f;
    }

    public com.mbridge.msdk.thrid.okhttp.d e() {
        return this.g;
    }

    public com.mbridge.msdk.thrid.okhttp.h f() {
        return this.d;
    }

    public o g() {
        return this.h;
    }

    public c h() {
        return this.c;
    }

    public com.mbridge.msdk.thrid.okhttp.internal.connection.g i() {
        return this.b;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.t.a
    public a0 a(y yVar) throws IOException {
        return a(yVar, this.b, this.c, this.d);
    }

    public a0 a(y yVar, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar, c cVar, com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar2) throws IOException {
        if (this.e < this.a.size()) {
            this.l++;
            if (this.c != null && !this.d.a(yVar.g())) {
                throw new IllegalStateException("network interceptor " + this.a.get(this.e - 1) + " must retain the same host and port");
            }
            if (this.c != null && this.l > 1) {
                throw new IllegalStateException("network interceptor " + this.a.get(this.e - 1) + " must call proceed() exactly once");
            }
            g gVar2 = new g(this.a, gVar, cVar, cVar2, this.e + 1, yVar, this.g, this.h, this.i, this.j, this.k);
            t tVar = this.a.get(this.e);
            a0 a = tVar.a(gVar2);
            if (cVar != null && this.e + 1 < this.a.size() && gVar2.l != 1) {
                throw new IllegalStateException("network interceptor " + tVar + " must call proceed() exactly once");
            }
            if (a != null) {
                if (a.d() != null) {
                    return a;
                }
                throw new IllegalStateException("interceptor " + tVar + " returned a response with no body");
            }
            throw new NullPointerException("interceptor " + tVar + " returned null");
        }
        throw new AssertionError();
    }
}
