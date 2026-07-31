package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import gatewayprotocol.v1.AdDataRefreshResponseOuterClass;
import gatewayprotocol.v1.CampaignMetadataOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AdDataRefreshResponseKt.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/AdDataRefreshResponseKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AdDataRefreshResponseKt {

    @NotNull
    public static final AdDataRefreshResponseKt INSTANCE = new AdDataRefreshResponseKt();

    private AdDataRefreshResponseKt() {
    }

    /* compiled from: AdDataRefreshResponseKt.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 72\u00020\u0001:\u00017B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0010J\u0006\u0010\u001b\u001a\u00020\u0010J\u0006\u0010\u001f\u001a\u00020\u0010J\u0006\u0010&\u001a\u00020\u0010J\u0006\u0010'\u001a\u00020(J\u0006\u00102\u001a\u00020\u0010J\u0006\u00103\u001a\u00020(R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR$\u0010\u001c\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u000eR$\u0010!\u001a\u00020 2\u0006\u0010\b\u001a\u00020 8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0017\u0010)\u001a\u0004\u0018\u00010 *\u00020\u00008F¢\u0006\u0006\u001a\u0004\b*\u0010+R$\u0010-\u001a\u00020,2\u0006\u0010\b\u001a\u00020,8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0017\u00104\u001a\u0004\u0018\u00010,*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b5\u00106¨\u00068"}, d2 = {"Lgatewayprotocol/v1/AdDataRefreshResponseKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/AdDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder;", "<init>", "(Lgatewayprotocol/v1/AdDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder;)V", "_build", "Lgatewayprotocol/v1/AdDataRefreshResponseOuterClass$AdDataRefreshResponse;", "value", "Lcom/google/protobuf/ByteString;", "adData", "getAdData", "()Lcom/google/protobuf/ByteString;", "setAdData", "(Lcom/google/protobuf/ByteString;)V", "clearAdData", "", "", "adDataVersion", "getAdDataVersion", "()I", "setAdDataVersion", "(I)V", "clearAdDataVersion", HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN, "getTrackingToken", "setTrackingToken", "clearTrackingToken", HandleInvocationsFromAdViewer.KEY_AD_DATA_REFRESH_TOKEN, "getAdDataRefreshToken", "setAdDataRefreshToken", "clearAdDataRefreshToken", "Lgatewayprotocol/v1/ErrorOuterClass$Error;", "error", "getError", "()Lgatewayprotocol/v1/ErrorOuterClass$Error;", "setError", "(Lgatewayprotocol/v1/ErrorOuterClass$Error;)V", "clearError", "hasError", "", "errorOrNull", "getErrorOrNull", "(Lgatewayprotocol/v1/AdDataRefreshResponseKt$Dsl;)Lgatewayprotocol/v1/ErrorOuterClass$Error;", "Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignMetadata;", "campaignMetadata", "getCampaignMetadata", "()Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignMetadata;", "setCampaignMetadata", "(Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignMetadata;)V", "clearCampaignMetadata", "hasCampaignMetadata", "campaignMetadataOrNull", "getCampaignMetadataOrNull", "(Lgatewayprotocol/v1/AdDataRefreshResponseKt$Dsl;)Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignMetadata;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder _builder;

        public /* synthetic */ Dsl(AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder builder) {
            this._builder = builder;
        }

        /* compiled from: AdDataRefreshResponseKt.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/AdDataRefreshResponseKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/AdDataRefreshResponseKt$Dsl;", "builder", "Lgatewayprotocol/v1/AdDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ AdDataRefreshResponseOuterClass.AdDataRefreshResponse _build() {
            AdDataRefreshResponseOuterClass.AdDataRefreshResponse build = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            return build;
        }

        @NotNull
        public final ByteString getAdData() {
            ByteString adData = this._builder.getAdData();
            Intrinsics.checkNotNullExpressionValue(adData, "getAdData(...)");
            return adData;
        }

        public final void setAdData(@NotNull ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAdData(value);
        }

        public final void clearAdData() {
            this._builder.clearAdData();
        }

        public final int getAdDataVersion() {
            return this._builder.getAdDataVersion();
        }

        public final void setAdDataVersion(int i) {
            this._builder.setAdDataVersion(i);
        }

        public final void clearAdDataVersion() {
            this._builder.clearAdDataVersion();
        }

        @NotNull
        public final ByteString getTrackingToken() {
            ByteString trackingToken = this._builder.getTrackingToken();
            Intrinsics.checkNotNullExpressionValue(trackingToken, "getTrackingToken(...)");
            return trackingToken;
        }

        public final void setTrackingToken(@NotNull ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setTrackingToken(value);
        }

        public final void clearTrackingToken() {
            this._builder.clearTrackingToken();
        }

        @NotNull
        public final ByteString getAdDataRefreshToken() {
            ByteString adDataRefreshToken = this._builder.getAdDataRefreshToken();
            Intrinsics.checkNotNullExpressionValue(adDataRefreshToken, "getAdDataRefreshToken(...)");
            return adDataRefreshToken;
        }

        public final void setAdDataRefreshToken(@NotNull ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAdDataRefreshToken(value);
        }

        public final void clearAdDataRefreshToken() {
            this._builder.clearAdDataRefreshToken();
        }

        @NotNull
        public final ErrorOuterClass.Error getError() {
            ErrorOuterClass.Error error = this._builder.getError();
            Intrinsics.checkNotNullExpressionValue(error, "getError(...)");
            return error;
        }

        public final void setError(@NotNull ErrorOuterClass.Error value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setError(value);
        }

        public final void clearError() {
            this._builder.clearError();
        }

        public final boolean hasError() {
            return this._builder.hasError();
        }

        @Nullable
        public final ErrorOuterClass.Error getErrorOrNull(@NotNull Dsl dsl) {
            Intrinsics.checkNotNullParameter(dsl, "<this>");
            return AdDataRefreshResponseKtKt.getErrorOrNull(dsl._builder);
        }

        @NotNull
        public final CampaignMetadataOuterClass.CampaignMetadata getCampaignMetadata() {
            CampaignMetadataOuterClass.CampaignMetadata campaignMetadata = this._builder.getCampaignMetadata();
            Intrinsics.checkNotNullExpressionValue(campaignMetadata, "getCampaignMetadata(...)");
            return campaignMetadata;
        }

        public final void setCampaignMetadata(@NotNull CampaignMetadataOuterClass.CampaignMetadata value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setCampaignMetadata(value);
        }

        public final void clearCampaignMetadata() {
            this._builder.clearCampaignMetadata();
        }

        public final boolean hasCampaignMetadata() {
            return this._builder.hasCampaignMetadata();
        }

        @Nullable
        public final CampaignMetadataOuterClass.CampaignMetadata getCampaignMetadataOrNull(@NotNull Dsl dsl) {
            Intrinsics.checkNotNullParameter(dsl, "<this>");
            return AdDataRefreshResponseKtKt.getCampaignMetadataOrNull(dsl._builder);
        }
    }
}
