package com.google.protobuf;

import com.google.protobuf.FloatValue;
import com.google.protobuf.FloatValueKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: FloatValueKt.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"Lkotlin/Function1;", "Lcom/google/protobuf/FloatValueKt$Dsl;", "", "block", "Lcom/google/protobuf/FloatValue;", "-initializefloatValue", "(Lkotlin/jvm/functions/Function1;)Lcom/google/protobuf/FloatValue;", "floatValue", "copy", "(Lcom/google/protobuf/FloatValue;Lkotlin/jvm/functions/Function1;)Lcom/google/protobuf/FloatValue;", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FloatValueKtKt {
    @NotNull
    /* renamed from: -initializefloatValue, reason: not valid java name */
    public static final FloatValue m3745initializefloatValue(@NotNull Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        FloatValueKt.Dsl.Companion companion = FloatValueKt.Dsl.INSTANCE;
        FloatValue.Builder newBuilder = FloatValue.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
        FloatValueKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    @NotNull
    public static final FloatValue copy(@NotNull FloatValue floatValue, @NotNull Function1 block) {
        Intrinsics.checkNotNullParameter(floatValue, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        FloatValueKt.Dsl.Companion companion = FloatValueKt.Dsl.INSTANCE;
        FloatValue.Builder builder = floatValue.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        FloatValueKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
