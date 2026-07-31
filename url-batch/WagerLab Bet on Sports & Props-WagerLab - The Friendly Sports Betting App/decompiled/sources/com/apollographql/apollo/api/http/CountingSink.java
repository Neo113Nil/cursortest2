package com.apollographql.apollo.api.http;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.Sink;
import okio.Timeout;

/* compiled from: DefaultHttpRequestComposer.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\t\u0010\u000f\u001a\u00020\u000bH\u0096\u0001J\t\u0010\u0010\u001a\u00020\u000bH\u0096\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u0096\u0001R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/apollographql/apollo/api/http/CountingSink;", "Lokio/Sink;", "delegate", "<init>", "(Lokio/Sink;)V", "value", "", "bytesWritten", "getBytesWritten", "()J", "write", "", "source", "Lokio/Buffer;", "byteCount", "close", "flush", "timeout", "Lokio/Timeout;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class CountingSink implements Sink {
    private long bytesWritten;
    private final Sink delegate;

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() {
        this.delegate.flush();
    }

    @Override // okio.Sink
    /* renamed from: timeout */
    public Timeout getThis$0() {
        return this.delegate.getThis$0();
    }

    public CountingSink(Sink delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    public final long getBytesWritten() {
        return this.bytesWritten;
    }

    @Override // okio.Sink
    public void write(Buffer source, long byteCount) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.delegate.write(source, byteCount);
        this.bytesWritten += byteCount;
    }
}
