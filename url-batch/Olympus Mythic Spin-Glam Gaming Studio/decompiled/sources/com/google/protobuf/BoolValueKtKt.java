package com.google.protobuf;

import com.google.protobuf.BoolValue;
import com.google.protobuf.BoolValueKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: BoolValueKt.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"Lkotlin/Function1;", "Lcom/google/protobuf/BoolValueKt$Dsl;", "", "block", "Lcom/google/protobuf/BoolValue;", "-initializeboolValue", "(Lkotlin/jvm/functions/Function1;)Lcom/google/protobuf/BoolValue;", "boolValue", "copy", "(Lcom/google/protobuf/BoolValue;Lkotlin/jvm/functions/Function1;)Lcom/google/protobuf/BoolValue;", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BoolValueKtKt {
    @NotNull
    /* renamed from: -initializeboolValue, reason: not valid java name */
    public static final BoolValue m3735initializeboolValue(@NotNull Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        BoolValueKt.Dsl.Companion companion = BoolValueKt.Dsl.INSTANCE;
        BoolValue.Builder newBuilder = BoolValue.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
        BoolValueKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    @NotNull
    public static final BoolValue copy(@NotNull BoolValue boolValue, @NotNull Function1 block) {
        Intrinsics.checkNotNullParameter(boolValue, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        BoolValueKt.Dsl.Companion companion = BoolValueKt.Dsl.INSTANCE;
        BoolValue.Builder builder = boolValue.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        BoolValueKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
