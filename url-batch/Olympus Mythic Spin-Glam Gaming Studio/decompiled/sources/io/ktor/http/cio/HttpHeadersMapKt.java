package io.ktor.http.cio;

import io.ktor.utils.io.pool.DefaultPool;
import java.util.Iterator;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HttpHeadersMap.kt */
/* loaded from: classes3.dex */
public abstract class HttpHeadersMapKt {
    private static final DefaultPool IntArrayPool = new DefaultPool() { // from class: io.ktor.http.cio.HttpHeadersMapKt$IntArrayPool$1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.ktor.utils.io.pool.DefaultPool
        public int[] produceInstance() {
            int[] iArr = new int[768];
            for (int i = 0; i < 768; i++) {
                iArr[i] = -1;
            }
            return iArr;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.ktor.utils.io.pool.DefaultPool
        public int[] clearInstance(int[] instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            ArraysKt.fill$default(instance, -1, 0, 0, 6, (Object) null);
            return (int[]) super.clearInstance((Object) instance);
        }
    };
    private static final DefaultPool HeadersDataPool = new DefaultPool() { // from class: io.ktor.http.cio.HttpHeadersMapKt$HeadersDataPool$1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.ktor.utils.io.pool.DefaultPool
        public HeadersData produceInstance() {
            return new HeadersData();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.ktor.utils.io.pool.DefaultPool
        public HeadersData clearInstance(HeadersData instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            instance.release();
            return (HeadersData) super.clearInstance((Object) instance);
        }
    };

    public static final void dumpTo(HttpHeadersMap httpHeadersMap, String indent, Appendable out) {
        Intrinsics.checkNotNullParameter(httpHeadersMap, "<this>");
        Intrinsics.checkNotNullParameter(indent, "indent");
        Intrinsics.checkNotNullParameter(out, "out");
        Iterator it = httpHeadersMap.offsets().iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            out.append(indent);
            out.append(httpHeadersMap.nameAtOffset(intValue));
            out.append(" => ");
            out.append(httpHeadersMap.valueAtOffset(intValue));
            out.append("\n");
        }
    }
}
