package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.CampaignStateOuterClass;
import gatewayprotocol.v1.TimestampsOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CampaignKt.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/CampaignKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CampaignKt {

    @NotNull
    public static final CampaignKt INSTANCE = new CampaignKt();

    private CampaignKt() {
    }

    /* compiled from: CampaignKt.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u0000 42\u00020\u0001:\u00014B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0010J\u0006\u0010\u001e\u001a\u00020\u0010J\u0006\u0010\"\u001a\u00020\u0010J\u0006\u0010)\u001a\u00020\u0010J\u0006\u0010*\u001a\u00020+J\u0006\u0010/\u001a\u00020\u0010J\u0006\u00100\u001a\u00020+R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\u00188G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001f\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010\u0014\"\u0004\b!\u0010\u0016R$\u0010$\u001a\u00020#2\u0006\u0010\b\u001a\u00020#8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010,\u001a\u00020#2\u0006\u0010\b\u001a\u00020#8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010&\"\u0004\b.\u0010(R\u0017\u00101\u001a\u0004\u0018\u00010#*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Lgatewayprotocol/v1/CampaignKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/CampaignStateOuterClass$Campaign$Builder;", "<init>", "(Lgatewayprotocol/v1/CampaignStateOuterClass$Campaign$Builder;)V", "_build", "Lgatewayprotocol/v1/CampaignStateOuterClass$Campaign;", "value", "", "dataVersion", "getDataVersion", "()I", "setDataVersion", "(I)V", "clearDataVersion", "", "Lcom/google/protobuf/ByteString;", "data", "getData", "()Lcom/google/protobuf/ByteString;", "setData", "(Lcom/google/protobuf/ByteString;)V", "clearData", "", "placementId", "getPlacementId", "()Ljava/lang/String;", "setPlacementId", "(Ljava/lang/String;)V", "clearPlacementId", "impressionOpportunityId", "getImpressionOpportunityId", "setImpressionOpportunityId", "clearImpressionOpportunityId", "Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "loadTimestamp", "getLoadTimestamp", "()Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "setLoadTimestamp", "(Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;)V", "clearLoadTimestamp", "hasLoadTimestamp", "", "showTimestamp", "getShowTimestamp", "setShowTimestamp", "clearShowTimestamp", "hasShowTimestamp", "showTimestampOrNull", "getShowTimestampOrNull", "(Lgatewayprotocol/v1/CampaignKt$Dsl;)Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final CampaignStateOuterClass.Campaign.Builder _builder;

        public /* synthetic */ Dsl(CampaignStateOuterClass.Campaign.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(CampaignStateOuterClass.Campaign.Builder builder) {
            this._builder = builder;
        }

        /* compiled from: CampaignKt.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/CampaignKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/CampaignKt$Dsl;", "builder", "Lgatewayprotocol/v1/CampaignStateOuterClass$Campaign$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(CampaignStateOuterClass.Campaign.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ CampaignStateOuterClass.Campaign _build() {
            CampaignStateOuterClass.Campaign build = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            return build;
        }

        public final int getDataVersion() {
            return this._builder.getDataVersion();
        }

        public final void setDataVersion(int i) {
            this._builder.setDataVersion(i);
        }

        public final void clearDataVersion() {
            this._builder.clearDataVersion();
        }

        @NotNull
        public final ByteString getData() {
            ByteString data = this._builder.getData();
            Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
            return data;
        }

        public final void setData(@NotNull ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setData(value);
        }

        public final void clearData() {
            this._builder.clearData();
        }

        @NotNull
        public final String getPlacementId() {
            String placementId = this._builder.getPlacementId();
            Intrinsics.checkNotNullExpressionValue(placementId, "getPlacementId(...)");
            return placementId;
        }

        public final void setPlacementId(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setPlacementId(value);
        }

        public final void clearPlacementId() {
            this._builder.clearPlacementId();
        }

        @NotNull
        public final ByteString getImpressionOpportunityId() {
            ByteString impressionOpportunityId = this._builder.getImpressionOpportunityId();
            Intrinsics.checkNotNullExpressionValue(impressionOpportunityId, "getImpressionOpportunityId(...)");
            return impressionOpportunityId;
        }

        public final void setImpressionOpportunityId(@NotNull ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setImpressionOpportunityId(value);
        }

        public final void clearImpressionOpportunityId() {
            this._builder.clearImpressionOpportunityId();
        }

        @NotNull
        public final TimestampsOuterClass.Timestamps getLoadTimestamp() {
            TimestampsOuterClass.Timestamps loadTimestamp = this._builder.getLoadTimestamp();
            Intrinsics.checkNotNullExpressionValue(loadTimestamp, "getLoadTimestamp(...)");
            return loadTimestamp;
        }

        public final void setLoadTimestamp(@NotNull TimestampsOuterClass.Timestamps value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setLoadTimestamp(value);
        }

        public final void clearLoadTimestamp() {
            this._builder.clearLoadTimestamp();
        }

        public final boolean hasLoadTimestamp() {
            return this._builder.hasLoadTimestamp();
        }

        @NotNull
        public final TimestampsOuterClass.Timestamps getShowTimestamp() {
            TimestampsOuterClass.Timestamps showTimestamp = this._builder.getShowTimestamp();
            Intrinsics.checkNotNullExpressionValue(showTimestamp, "getShowTimestamp(...)");
            return showTimestamp;
        }

        public final void setShowTimestamp(@NotNull TimestampsOuterClass.Timestamps value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setShowTimestamp(value);
        }

        public final void clearShowTimestamp() {
            this._builder.clearShowTimestamp();
        }

        public final boolean hasShowTimestamp() {
            return this._builder.hasShowTimestamp();
        }

        @Nullable
        public final TimestampsOuterClass.Timestamps getShowTimestampOrNull(@NotNull Dsl dsl) {
            Intrinsics.checkNotNullParameter(dsl, "<this>");
            return CampaignKtKt.getShowTimestampOrNull(dsl._builder);
        }
    }
}
