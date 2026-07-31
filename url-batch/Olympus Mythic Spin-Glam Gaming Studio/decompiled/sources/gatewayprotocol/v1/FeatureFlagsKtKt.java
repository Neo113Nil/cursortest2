package gatewayprotocol.v1;

import gatewayprotocol.v1.FeatureFlagsKt;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: FeatureFlagsKt.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"Lkotlin/Function1;", "Lgatewayprotocol/v1/FeatureFlagsKt$Dsl;", "", "block", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags;", "-initializefeatureFlags", "(Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags;", "featureFlags", "copy", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags;Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags;", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FeatureFlagsKtKt {
    @NotNull
    /* renamed from: -initializefeatureFlags, reason: not valid java name */
    public static final NativeConfigurationOuterClass.FeatureFlags m7480initializefeatureFlags(@NotNull Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        FeatureFlagsKt.Dsl.Companion companion = FeatureFlagsKt.Dsl.INSTANCE;
        NativeConfigurationOuterClass.FeatureFlags.Builder newBuilder = NativeConfigurationOuterClass.FeatureFlags.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
        FeatureFlagsKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    @NotNull
    public static final NativeConfigurationOuterClass.FeatureFlags copy(@NotNull NativeConfigurationOuterClass.FeatureFlags featureFlags, @NotNull Function1 block) {
        Intrinsics.checkNotNullParameter(featureFlags, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        FeatureFlagsKt.Dsl.Companion companion = FeatureFlagsKt.Dsl.INSTANCE;
        NativeConfigurationOuterClass.FeatureFlags.Builder builder = featureFlags.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        FeatureFlagsKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
