package com.mbridge.msdk.thrid.okio;

import java.io.IOException;

/* compiled from: ForwardingSink.java */
/* loaded from: classes4.dex */
public abstract class g implements r {
    private final r a;

    public g(r rVar) {
        if (rVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.a = rVar;
    }

    @Override // com.mbridge.msdk.thrid.okio.r
    public void a(c cVar, long j) throws IOException {
        this.a.a(cVar, j);
    }

    @Override // com.mbridge.msdk.thrid.okio.r
    public t b() {
        return this.a.b();
    }

    @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a.close();
    }

    @Override // com.mbridge.msdk.thrid.okio.r, java.io.Flushable
    public void flush() throws IOException {
        this.a.flush();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.a.toString() + ")";
    }
}
