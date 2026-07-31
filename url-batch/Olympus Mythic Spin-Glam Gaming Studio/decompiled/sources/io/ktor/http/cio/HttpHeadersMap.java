package io.ktor.http.cio;

import io.ktor.http.cio.internals.CharArrayBuilder;
import io.ktor.http.cio.internals.CharsKt;
import io.ktor.utils.io.pool.DefaultPool;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* compiled from: HttpHeadersMap.kt */
/* loaded from: classes3.dex */
public final class HttpHeadersMap {
    private final CharArrayBuilder builder;
    private int headerCapacity;
    private HeadersData headersData;
    private int size;

    public HttpHeadersMap(CharArrayBuilder builder) {
        DefaultPool defaultPool;
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.builder = builder;
        defaultPool = HttpHeadersMapKt.HeadersDataPool;
        this.headersData = (HeadersData) defaultPool.borrow();
    }

    private final boolean thresholdReached() {
        return ((double) this.size) >= ((double) this.headerCapacity) * 0.75d;
    }

    public final CharSequence get(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (this.size == 0) {
            return null;
        }
        int abs = Math.abs(CharsKt.hashCodeLowerCase$default(name, 0, 0, 3, null));
        int i = this.headerCapacity;
        while (true) {
            int i2 = abs % i;
            int i3 = i2 * 6;
            if (this.headersData.at(i3) == -1) {
                return null;
            }
            if (headerHasName(name, i3)) {
                return valueAtOffset(i3);
            }
            abs = i2 + 1;
            i = this.headerCapacity;
        }
    }

    public final Sequence offsets() {
        return this.headersData.headersStarts();
    }

    public final void put(int i, int i2, int i3, int i4) {
        int i5;
        if (thresholdReached()) {
            resize();
        }
        int abs = Math.abs(CharsKt.hashCodeLowerCase(this.builder, i, i2));
        CharSequence subSequence = this.builder.subSequence(i, i2);
        int i6 = abs % this.headerCapacity;
        int i7 = -1;
        while (true) {
            i5 = i6 * 6;
            if (this.headersData.at(i5) == -1) {
                break;
            }
            if (headerHasName(subSequence, i5)) {
                i7 = i6;
            }
            i6 = (i6 + 1) % this.headerCapacity;
        }
        this.headersData.set(i5, abs);
        this.headersData.set(i5 + 1, i);
        this.headersData.set(i5 + 2, i2);
        this.headersData.set(i5 + 3, i3);
        this.headersData.set(i5 + 4, i4);
        this.headersData.set(i5 + 5, -1);
        if (i7 != -1) {
            this.headersData.set((i7 * 6) + 5, i6);
        }
        this.size++;
    }

    private final void resize() {
        DefaultPool defaultPool;
        DefaultPool defaultPool2;
        int i = this.size;
        HeadersData headersData = this.headersData;
        this.size = 0;
        this.headerCapacity = (this.headerCapacity * 2) | 128;
        defaultPool = HttpHeadersMapKt.HeadersDataPool;
        HeadersData headersData2 = (HeadersData) defaultPool.borrow();
        headersData2.prepare((headersData.arraysCount() * 2) | 1);
        this.headersData = headersData2;
        Iterator it = headersData.headersStarts().iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            put(headersData.at(intValue + 1), headersData.at(intValue + 2), headersData.at(intValue + 3), headersData.at(intValue + 4));
        }
        defaultPool2 = HttpHeadersMapKt.HeadersDataPool;
        defaultPool2.recycle(headersData);
        if (i != this.size) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    private final boolean headerHasName(CharSequence charSequence, int i) {
        return CharsKt.equalsLowerCase(this.builder, this.headersData.at(i + 1), this.headersData.at(i + 2), charSequence);
    }

    public final CharSequence nameAtOffset(int i) {
        return this.builder.subSequence(this.headersData.at(i + 1), this.headersData.at(i + 2));
    }

    public final CharSequence valueAtOffset(int i) {
        return this.builder.subSequence(this.headersData.at(i + 3), this.headersData.at(i + 4));
    }

    public final void release() {
        DefaultPool defaultPool;
        DefaultPool defaultPool2;
        this.size = 0;
        this.headerCapacity = 0;
        defaultPool = HttpHeadersMapKt.HeadersDataPool;
        defaultPool.recycle(this.headersData);
        defaultPool2 = HttpHeadersMapKt.HeadersDataPool;
        this.headersData = (HeadersData) defaultPool2.borrow();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        HttpHeadersMapKt.dumpTo(this, "", sb);
        return sb.toString();
    }
}
