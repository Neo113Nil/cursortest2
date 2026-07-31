package gatewayprotocol.v1;

import gatewayprotocol.v1.CachedAssetsConfigurationKt;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: CachedAssetsConfigurationKt.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"Lkotlin/Function1;", "Lgatewayprotocol/v1/CachedAssetsConfigurationKt$Dsl;", "", "block", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$CachedAssetsConfiguration;", "-initializecachedAssetsConfiguration", "(Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/NativeConfigurationOuterClass$CachedAssetsConfiguration;", "cachedAssetsConfiguration", "copy", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$CachedAssetsConfiguration;Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/NativeConfigurationOuterClass$CachedAssetsConfiguration;", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CachedAssetsConfigurationKtKt {
    @NotNull
    /* renamed from: -initializecachedAssetsConfiguration, reason: not valid java name */
    public static final NativeConfigurationOuterClass.CachedAssetsConfiguration m7462initializecachedAssetsConfiguration(@NotNull Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        CachedAssetsConfigurationKt.Dsl.Companion companion = CachedAssetsConfigurationKt.Dsl.INSTANCE;
        NativeConfigurationOuterClass.CachedAssetsConfiguration.Builder newBuilder = NativeConfigurationOuterClass.CachedAssetsConfiguration.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
        CachedAssetsConfigurationKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    @NotNull
    public static final NativeConfigurationOuterClass.CachedAssetsConfiguration copy(@NotNull NativeConfigurationOuterClass.CachedAssetsConfiguration cachedAssetsConfiguration, @NotNull Function1 block) {
        Intrinsics.checkNotNullParameter(cachedAssetsConfiguration, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        CachedAssetsConfigurationKt.Dsl.Companion companion = CachedAssetsConfigurationKt.Dsl.INSTANCE;
        NativeConfigurationOuterClass.CachedAssetsConfiguration.Builder builder = cachedAssetsConfiguration.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        CachedAssetsConfigurationKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
