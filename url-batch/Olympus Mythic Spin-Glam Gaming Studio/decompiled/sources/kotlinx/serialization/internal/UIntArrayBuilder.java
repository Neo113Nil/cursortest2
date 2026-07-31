package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.UIntArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: PrimitiveArraysSerializers.kt */
/* loaded from: classes15.dex */
public final class UIntArrayBuilder extends PrimitiveArrayBuilder {
    private int[] buffer;
    private int position;

    public /* synthetic */ UIntArrayBuilder(int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(iArr);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public /* bridge */ /* synthetic */ Object build$kotlinx_serialization_core() {
        return UIntArray.m8060boximpl(m8266buildhP7Qyg$kotlinx_serialization_core());
    }

    private UIntArrayBuilder(int[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.buffer = bufferWithData;
        this.position = UIntArray.m8067getSizeimpl(bufferWithData);
        ensureCapacity$kotlinx_serialization_core(10);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public int getPosition$kotlinx_serialization_core() {
        return this.position;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public void ensureCapacity$kotlinx_serialization_core(int i) {
        if (UIntArray.m8067getSizeimpl(this.buffer) < i) {
            int[] iArr = this.buffer;
            int[] copyOf = Arrays.copyOf(iArr, RangesKt.coerceAtLeast(i, UIntArray.m8067getSizeimpl(iArr) * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.buffer = UIntArray.m8062constructorimpl(copyOf);
        }
    }

    /* renamed from: append-WZ4Q5Ns$kotlinx_serialization_core, reason: not valid java name */
    public final void m8265appendWZ4Q5Ns$kotlinx_serialization_core(int i) {
        PrimitiveArrayBuilder.ensureCapacity$kotlinx_serialization_core$default(this, 0, 1, null);
        int[] iArr = this.buffer;
        int position$kotlinx_serialization_core = getPosition$kotlinx_serialization_core();
        this.position = position$kotlinx_serialization_core + 1;
        UIntArray.m8071setVXSXFK8(iArr, position$kotlinx_serialization_core, i);
    }

    /* renamed from: build--hP7Qyg$kotlinx_serialization_core, reason: not valid java name */
    public int[] m8266buildhP7Qyg$kotlinx_serialization_core() {
        int[] copyOf = Arrays.copyOf(this.buffer, getPosition$kotlinx_serialization_core());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return UIntArray.m8062constructorimpl(copyOf);
    }
}
