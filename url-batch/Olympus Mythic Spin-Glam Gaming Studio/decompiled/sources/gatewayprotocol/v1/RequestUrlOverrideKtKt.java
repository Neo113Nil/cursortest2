package gatewayprotocol.v1;

import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.RequestUrlOverrideKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: RequestUrlOverrideKt.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"Lkotlin/Function1;", "Lgatewayprotocol/v1/RequestUrlOverrideKt$Dsl;", "", "block", "Lgatewayprotocol/v1/InitializationResponseOuterClass$RequestUrlOverride;", "-initializerequestUrlOverride", "(Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/InitializationResponseOuterClass$RequestUrlOverride;", "requestUrlOverride", "copy", "(Lgatewayprotocol/v1/InitializationResponseOuterClass$RequestUrlOverride;Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/InitializationResponseOuterClass$RequestUrlOverride;", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RequestUrlOverrideKtKt {
    @NotNull
    /* renamed from: -initializerequestUrlOverride, reason: not valid java name */
    public static final InitializationResponseOuterClass.RequestUrlOverride m7508initializerequestUrlOverride(@NotNull Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        RequestUrlOverrideKt.Dsl.Companion companion = RequestUrlOverrideKt.Dsl.INSTANCE;
        InitializationResponseOuterClass.RequestUrlOverride.Builder newBuilder = InitializationResponseOuterClass.RequestUrlOverride.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
        RequestUrlOverrideKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    @NotNull
    public static final InitializationResponseOuterClass.RequestUrlOverride copy(@NotNull InitializationResponseOuterClass.RequestUrlOverride requestUrlOverride, @NotNull Function1 block) {
        Intrinsics.checkNotNullParameter(requestUrlOverride, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        RequestUrlOverrideKt.Dsl.Companion companion = RequestUrlOverrideKt.Dsl.INSTANCE;
        InitializationResponseOuterClass.RequestUrlOverride.Builder builder = requestUrlOverride.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        RequestUrlOverrideKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
