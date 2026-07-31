package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.UShortArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: PrimitiveArraysSerializers.kt */
/* loaded from: classes15.dex */
public final class UShortArrayBuilder extends PrimitiveArrayBuilder {
    private short[] buffer;
    private int position;

    public /* synthetic */ UShortArrayBuilder(short[] sArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(sArr);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public /* bridge */ /* synthetic */ Object build$kotlinx_serialization_core() {
        return UShortArray.m8104boximpl(m8282buildamswpOA$kotlinx_serialization_core());
    }

    private UShortArrayBuilder(short[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.buffer = bufferWithData;
        this.position = UShortArray.m8111getSizeimpl(bufferWithData);
        ensureCapacity$kotlinx_serialization_core(10);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public int getPosition$kotlinx_serialization_core() {
        return this.position;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public void ensureCapacity$kotlinx_serialization_core(int i) {
        if (UShortArray.m8111getSizeimpl(this.buffer) < i) {
            short[] sArr = this.buffer;
            short[] copyOf = Arrays.copyOf(sArr, RangesKt.coerceAtLeast(i, UShortArray.m8111getSizeimpl(sArr) * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.buffer = UShortArray.m8106constructorimpl(copyOf);
        }
    }

    /* renamed from: append-xj2QHRw$kotlinx_serialization_core, reason: not valid java name */
    public final void m8281appendxj2QHRw$kotlinx_serialization_core(short s) {
        PrimitiveArrayBuilder.ensureCapacity$kotlinx_serialization_core$default(this, 0, 1, null);
        short[] sArr = this.buffer;
        int position$kotlinx_serialization_core = getPosition$kotlinx_serialization_core();
        this.position = position$kotlinx_serialization_core + 1;
        UShortArray.m8115set01HTLdE(sArr, position$kotlinx_serialization_core, s);
    }

    /* renamed from: build-amswpOA$kotlinx_serialization_core, reason: not valid java name */
    public short[] m8282buildamswpOA$kotlinx_serialization_core() {
        short[] copyOf = Arrays.copyOf(this.buffer, getPosition$kotlinx_serialization_core());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return UShortArray.m8106constructorimpl(copyOf);
    }
}
