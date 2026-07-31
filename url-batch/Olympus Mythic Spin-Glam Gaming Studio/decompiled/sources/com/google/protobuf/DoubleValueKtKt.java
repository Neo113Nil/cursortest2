package com.google.protobuf;

import com.google.protobuf.DoubleValue;
import com.google.protobuf.DoubleValueKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DoubleValueKt.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"Lkotlin/Function1;", "Lcom/google/protobuf/DoubleValueKt$Dsl;", "", "block", "Lcom/google/protobuf/DoubleValue;", "-initializedoubleValue", "(Lkotlin/jvm/functions/Function1;)Lcom/google/protobuf/DoubleValue;", "doubleValue", "copy", "(Lcom/google/protobuf/DoubleValue;Lkotlin/jvm/functions/Function1;)Lcom/google/protobuf/DoubleValue;", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DoubleValueKtKt {
    @NotNull
    /* renamed from: -initializedoubleValue, reason: not valid java name */
    public static final DoubleValue m3737initializedoubleValue(@NotNull Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        DoubleValueKt.Dsl.Companion companion = DoubleValueKt.Dsl.INSTANCE;
        DoubleValue.Builder newBuilder = DoubleValue.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
        DoubleValueKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    @NotNull
    public static final DoubleValue copy(@NotNull DoubleValue doubleValue, @NotNull Function1 block) {
        Intrinsics.checkNotNullParameter(doubleValue, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        DoubleValueKt.Dsl.Companion companion = DoubleValueKt.Dsl.INSTANCE;
        DoubleValue.Builder builder = doubleValue.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        DoubleValueKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
