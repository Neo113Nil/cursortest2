package com.inmobi.media;

import java.io.Closeable;
import java.io.InputStream;

/* loaded from: classes11.dex */
public final class O5 implements Closeable {
    public final InputStream[] a;

    public O5(InputStream[] inputStreamArr) {
        this.a = inputStreamArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        for (InputStream inputStream : this.a) {
            Al.a(inputStream);
        }
    }
}
