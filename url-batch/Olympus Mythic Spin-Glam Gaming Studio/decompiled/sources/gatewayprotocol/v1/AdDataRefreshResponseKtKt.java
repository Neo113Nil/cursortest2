package gatewayprotocol.v1;

import gatewayprotocol.v1.AdDataRefreshResponseKt;
import gatewayprotocol.v1.AdDataRefreshResponseOuterClass;
import gatewayprotocol.v1.CampaignMetadataOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AdDataRefreshResponseKt.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\"\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000b*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u000f*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"Lkotlin/Function1;", "Lgatewayprotocol/v1/AdDataRefreshResponseKt$Dsl;", "", "block", "Lgatewayprotocol/v1/AdDataRefreshResponseOuterClass$AdDataRefreshResponse;", "-initializeadDataRefreshResponse", "(Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/AdDataRefreshResponseOuterClass$AdDataRefreshResponse;", "adDataRefreshResponse", "copy", "(Lgatewayprotocol/v1/AdDataRefreshResponseOuterClass$AdDataRefreshResponse;Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/AdDataRefreshResponseOuterClass$AdDataRefreshResponse;", "Lgatewayprotocol/v1/AdDataRefreshResponseOuterClass$AdDataRefreshResponseOrBuilder;", "Lgatewayprotocol/v1/ErrorOuterClass$Error;", "getErrorOrNull", "(Lgatewayprotocol/v1/AdDataRefreshResponseOuterClass$AdDataRefreshResponseOrBuilder;)Lgatewayprotocol/v1/ErrorOuterClass$Error;", "errorOrNull", "Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignMetadata;", "getCampaignMetadataOrNull", "(Lgatewayprotocol/v1/AdDataRefreshResponseOuterClass$AdDataRefreshResponseOrBuilder;)Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignMetadata;", "campaignMetadataOrNull", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AdDataRefreshResponseKtKt {
    @NotNull
    /* renamed from: -initializeadDataRefreshResponse, reason: not valid java name */
    public static final AdDataRefreshResponseOuterClass.AdDataRefreshResponse m7450initializeadDataRefreshResponse(@NotNull Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        AdDataRefreshResponseKt.Dsl.Companion companion = AdDataRefreshResponseKt.Dsl.INSTANCE;
        AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder newBuilder = AdDataRefreshResponseOuterClass.AdDataRefreshResponse.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
        AdDataRefreshResponseKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    @NotNull
    public static final AdDataRefreshResponseOuterClass.AdDataRefreshResponse copy(@NotNull AdDataRefreshResponseOuterClass.AdDataRefreshResponse adDataRefreshResponse, @NotNull Function1 block) {
        Intrinsics.checkNotNullParameter(adDataRefreshResponse, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        AdDataRefreshResponseKt.Dsl.Companion companion = AdDataRefreshResponseKt.Dsl.INSTANCE;
        AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder builder = adDataRefreshResponse.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        AdDataRefreshResponseKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }

    @Nullable
    public static final ErrorOuterClass.Error getErrorOrNull(@NotNull AdDataRefreshResponseOuterClass.AdDataRefreshResponseOrBuilder adDataRefreshResponseOrBuilder) {
        Intrinsics.checkNotNullParameter(adDataRefreshResponseOrBuilder, "<this>");
        if (adDataRefreshResponseOrBuilder.hasError()) {
            return adDataRefreshResponseOrBuilder.getError();
        }
        return null;
    }

    @Nullable
    public static final CampaignMetadataOuterClass.CampaignMetadata getCampaignMetadataOrNull(@NotNull AdDataRefreshResponseOuterClass.AdDataRefreshResponseOrBuilder adDataRefreshResponseOrBuilder) {
        Intrinsics.checkNotNullParameter(adDataRefreshResponseOrBuilder, "<this>");
        if (adDataRefreshResponseOrBuilder.hasCampaignMetadata()) {
            return adDataRefreshResponseOrBuilder.getCampaignMetadata();
        }
        return null;
    }
}
