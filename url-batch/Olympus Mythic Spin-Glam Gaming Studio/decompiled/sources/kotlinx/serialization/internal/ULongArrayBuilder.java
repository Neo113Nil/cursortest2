package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.ULongArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: PrimitiveArraysSerializers.kt */
/* loaded from: classes4.dex */
public final class ULongArrayBuilder extends PrimitiveArrayBuilder {
    private long[] buffer;
    private int position;

    public /* synthetic */ ULongArrayBuilder(long[] jArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(jArr);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public /* bridge */ /* synthetic */ Object build$kotlinx_serialization_core() {
        return ULongArray.m8082boximpl(m8274buildY2RjT0g$kotlinx_serialization_core());
    }

    private ULongArrayBuilder(long[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.buffer = bufferWithData;
        this.position = ULongArray.m8089getSizeimpl(bufferWithData);
        ensureCapacity$kotlinx_serialization_core(10);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public int getPosition$kotlinx_serialization_core() {
        return this.position;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public void ensureCapacity$kotlinx_serialization_core(int i) {
        if (ULongArray.m8089getSizeimpl(this.buffer) < i) {
            long[] jArr = this.buffer;
            long[] copyOf = Arrays.copyOf(jArr, RangesKt.coerceAtLeast(i, ULongArray.m8089getSizeimpl(jArr) * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.buffer = ULongArray.m8084constructorimpl(copyOf);
        }
    }

    /* renamed from: append-VKZWuLQ$kotlinx_serialization_core, reason: not valid java name */
    public final void m8273appendVKZWuLQ$kotlinx_serialization_core(long j) {
        PrimitiveArrayBuilder.ensureCapacity$kotlinx_serialization_core$default(this, 0, 1, null);
        long[] jArr = this.buffer;
        int position$kotlinx_serialization_core = getPosition$kotlinx_serialization_core();
        this.position = position$kotlinx_serialization_core + 1;
        ULongArray.m8093setk8EXiF4(jArr, position$kotlinx_serialization_core, j);
    }

    /* renamed from: build-Y2RjT0g$kotlinx_serialization_core, reason: not valid java name */
    public long[] m8274buildY2RjT0g$kotlinx_serialization_core() {
        long[] copyOf = Arrays.copyOf(this.buffer, getPosition$kotlinx_serialization_core());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return ULongArray.m8084constructorimpl(copyOf);
    }
}
