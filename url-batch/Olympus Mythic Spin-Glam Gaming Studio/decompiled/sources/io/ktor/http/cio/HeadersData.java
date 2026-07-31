package io.ktor.http.cio;

import io.ktor.utils.io.pool.DefaultPool;
import java.util.ArrayList;
import java.util.List;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: HttpHeadersMap.kt */
/* loaded from: classes6.dex */
final class HeadersData {
    private List arrays = new ArrayList();

    public final int arraysCount() {
        return this.arrays.size();
    }

    public final void prepare(int i) {
        DefaultPool defaultPool;
        for (int i2 = 0; i2 < i; i2++) {
            List list = this.arrays;
            defaultPool = HttpHeadersMapKt.IntArrayPool;
            list.add(defaultPool.borrow());
        }
    }

    public final int at(int i) {
        return ((int[]) this.arrays.get(i / 768))[i % 768];
    }

    public final void set(int i, int i2) {
        ((int[]) this.arrays.get(i / 768))[i % 768] = i2;
    }

    public final Sequence headersStarts() {
        return SequencesKt.sequence(new HeadersData$headersStarts$1(this, null));
    }

    public final void release() {
        DefaultPool defaultPool;
        for (int[] iArr : this.arrays) {
            defaultPool = HttpHeadersMapKt.IntArrayPool;
            defaultPool.recycle(iArr);
        }
        this.arrays.clear();
    }
}
