package gatewayprotocol.v1;

import gatewayprotocol.v1.AdPlayerConfigResponseKt;
import gatewayprotocol.v1.AdPlayerConfigResponseOuterClass;
import gatewayprotocol.v1.CampaignMetadataOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.WebviewConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AdPlayerConfigResponseKt.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\"\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000b*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u000f*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u0013*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0017"}, d2 = {"Lkotlin/Function1;", "Lgatewayprotocol/v1/AdPlayerConfigResponseKt$Dsl;", "", "block", "Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse;", "-initializeadPlayerConfigResponse", "(Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse;", "adPlayerConfigResponse", "copy", "(Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse;Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse;", "Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponseOrBuilder;", "Lgatewayprotocol/v1/WebviewConfiguration$WebViewConfiguration;", "getWebviewConfigurationOrNull", "(Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponseOrBuilder;)Lgatewayprotocol/v1/WebviewConfiguration$WebViewConfiguration;", "webviewConfigurationOrNull", "Lgatewayprotocol/v1/ErrorOuterClass$Error;", "getErrorOrNull", "(Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponseOrBuilder;)Lgatewayprotocol/v1/ErrorOuterClass$Error;", "errorOrNull", "Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignMetadata;", "getCampaignMetadataOrNull", "(Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponseOrBuilder;)Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignMetadata;", "campaignMetadataOrNull", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AdPlayerConfigResponseKtKt {
    @NotNull
    /* renamed from: -initializeadPlayerConfigResponse, reason: not valid java name */
    public static final AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse m7453initializeadPlayerConfigResponse(@NotNull Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        AdPlayerConfigResponseKt.Dsl.Companion companion = AdPlayerConfigResponseKt.Dsl.INSTANCE;
        AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse.Builder newBuilder = AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
        AdPlayerConfigResponseKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    @NotNull
    public static final AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse copy(@NotNull AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse adPlayerConfigResponse, @NotNull Function1 block) {
        Intrinsics.checkNotNullParameter(adPlayerConfigResponse, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        AdPlayerConfigResponseKt.Dsl.Companion companion = AdPlayerConfigResponseKt.Dsl.INSTANCE;
        AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse.Builder builder = adPlayerConfigResponse.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        AdPlayerConfigResponseKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }

    @Nullable
    public static final WebviewConfiguration.WebViewConfiguration getWebviewConfigurationOrNull(@NotNull AdPlayerConfigResponseOuterClass.AdPlayerConfigResponseOrBuilder adPlayerConfigResponseOrBuilder) {
        Intrinsics.checkNotNullParameter(adPlayerConfigResponseOrBuilder, "<this>");
        if (adPlayerConfigResponseOrBuilder.hasWebviewConfiguration()) {
            return adPlayerConfigResponseOrBuilder.getWebviewConfiguration();
        }
        return null;
    }

    @Nullable
    public static final ErrorOuterClass.Error getErrorOrNull(@NotNull AdPlayerConfigResponseOuterClass.AdPlayerConfigResponseOrBuilder adPlayerConfigResponseOrBuilder) {
        Intrinsics.checkNotNullParameter(adPlayerConfigResponseOrBuilder, "<this>");
        if (adPlayerConfigResponseOrBuilder.hasError()) {
            return adPlayerConfigResponseOrBuilder.getError();
        }
        return null;
    }

    @Nullable
    public static final CampaignMetadataOuterClass.CampaignMetadata getCampaignMetadataOrNull(@NotNull AdPlayerConfigResponseOuterClass.AdPlayerConfigResponseOrBuilder adPlayerConfigResponseOrBuilder) {
        Intrinsics.checkNotNullParameter(adPlayerConfigResponseOrBuilder, "<this>");
        if (adPlayerConfigResponseOrBuilder.hasCampaignMetadata()) {
            return adPlayerConfigResponseOrBuilder.getCampaignMetadata();
        }
        return null;
    }
}
