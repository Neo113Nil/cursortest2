package gatewayprotocol.v1;

import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.RewardedOffersResponseKt;
import gatewayprotocol.v1.RewardedOffersResponseOuterClass;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RewardedOffersResponseKt.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\"\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000b*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, d2 = {"Lkotlin/Function1;", "Lgatewayprotocol/v1/RewardedOffersResponseKt$Dsl;", "", "block", "Lgatewayprotocol/v1/RewardedOffersResponseOuterClass$RewardedOffersResponse;", "-initializerewardedOffersResponse", "(Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/RewardedOffersResponseOuterClass$RewardedOffersResponse;", "rewardedOffersResponse", "copy", "(Lgatewayprotocol/v1/RewardedOffersResponseOuterClass$RewardedOffersResponse;Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/RewardedOffersResponseOuterClass$RewardedOffersResponse;", "Lgatewayprotocol/v1/RewardedOffersResponseOuterClass$RewardedOffersResponseOrBuilder;", "Lgatewayprotocol/v1/ErrorOuterClass$Error;", "getErrorOrNull", "(Lgatewayprotocol/v1/RewardedOffersResponseOuterClass$RewardedOffersResponseOrBuilder;)Lgatewayprotocol/v1/ErrorOuterClass$Error;", "errorOrNull", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RewardedOffersResponseKtKt {
    @NotNull
    /* renamed from: -initializerewardedOffersResponse, reason: not valid java name */
    public static final RewardedOffersResponseOuterClass.RewardedOffersResponse m7510initializerewardedOffersResponse(@NotNull Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        RewardedOffersResponseKt.Dsl.Companion companion = RewardedOffersResponseKt.Dsl.INSTANCE;
        RewardedOffersResponseOuterClass.RewardedOffersResponse.Builder newBuilder = RewardedOffersResponseOuterClass.RewardedOffersResponse.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
        RewardedOffersResponseKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    @NotNull
    public static final RewardedOffersResponseOuterClass.RewardedOffersResponse copy(@NotNull RewardedOffersResponseOuterClass.RewardedOffersResponse rewardedOffersResponse, @NotNull Function1 block) {
        Intrinsics.checkNotNullParameter(rewardedOffersResponse, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        RewardedOffersResponseKt.Dsl.Companion companion = RewardedOffersResponseKt.Dsl.INSTANCE;
        RewardedOffersResponseOuterClass.RewardedOffersResponse.Builder builder = rewardedOffersResponse.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        RewardedOffersResponseKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }

    @Nullable
    public static final ErrorOuterClass.Error getErrorOrNull(@NotNull RewardedOffersResponseOuterClass.RewardedOffersResponseOrBuilder rewardedOffersResponseOrBuilder) {
        Intrinsics.checkNotNullParameter(rewardedOffersResponseOrBuilder, "<this>");
        if (rewardedOffersResponseOrBuilder.hasError()) {
            return rewardedOffersResponseOrBuilder.getError();
        }
        return null;
    }
}
