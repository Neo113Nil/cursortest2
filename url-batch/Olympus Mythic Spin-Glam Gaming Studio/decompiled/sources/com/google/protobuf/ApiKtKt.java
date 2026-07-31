package com.google.protobuf;

import com.google.protobuf.Api;
import com.google.protobuf.ApiKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ApiKt.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\"\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000b*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, d2 = {"Lkotlin/Function1;", "Lcom/google/protobuf/ApiKt$Dsl;", "", "block", "Lcom/google/protobuf/Api;", "-initializeapi", "(Lkotlin/jvm/functions/Function1;)Lcom/google/protobuf/Api;", "api", "copy", "(Lcom/google/protobuf/Api;Lkotlin/jvm/functions/Function1;)Lcom/google/protobuf/Api;", "Lcom/google/protobuf/ApiOrBuilder;", "Lcom/google/protobuf/SourceContext;", "getSourceContextOrNull", "(Lcom/google/protobuf/ApiOrBuilder;)Lcom/google/protobuf/SourceContext;", "sourceContextOrNull", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ApiKtKt {
    @NotNull
    /* renamed from: -initializeapi, reason: not valid java name */
    public static final Api m3734initializeapi(@NotNull Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        ApiKt.Dsl.Companion companion = ApiKt.Dsl.INSTANCE;
        Api.Builder newBuilder = Api.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
        ApiKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    @NotNull
    public static final Api copy(@NotNull Api api, @NotNull Function1 block) {
        Intrinsics.checkNotNullParameter(api, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        ApiKt.Dsl.Companion companion = ApiKt.Dsl.INSTANCE;
        Api.Builder builder = api.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        ApiKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }

    @Nullable
    public static final SourceContext getSourceContextOrNull(@NotNull ApiOrBuilder apiOrBuilder) {
        Intrinsics.checkNotNullParameter(apiOrBuilder, "<this>");
        if (apiOrBuilder.hasSourceContext()) {
            return apiOrBuilder.getSourceContext();
        }
        return null;
    }
}
