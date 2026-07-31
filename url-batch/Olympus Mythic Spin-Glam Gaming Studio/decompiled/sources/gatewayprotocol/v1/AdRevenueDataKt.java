package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.AdRevenueEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AdRevenueDataKt.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/AdRevenueDataKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AdRevenueDataKt {

    @NotNull
    public static final AdRevenueDataKt INSTANCE = new AdRevenueDataKt();

    private AdRevenueDataKt() {
    }

    /* compiled from: AdRevenueDataKt.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000 >2\u00020\u0001:\u0001>B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0010J\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010 \u001a\u00020\u0010J\u0006\u0010!\u001a\u00020\u0019J\u0006\u0010%\u001a\u00020\u0010J\u0006\u0010&\u001a\u00020\u0019J\u0006\u0010*\u001a\u00020\u0010J\u0006\u0010+\u001a\u00020\u0019J\u0006\u0010/\u001a\u00020\u0010J\u0006\u00100\u001a\u00020\u0019J\u0006\u0010=\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\u001a8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010\"\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\u001a8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010\u001d\"\u0004\b$\u0010\u001fR$\u0010'\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\u001a8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010\u001d\"\u0004\b)\u0010\u001fR$\u0010,\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\u001a8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010\u001d\"\u0004\b.\u0010\u001fR$\u00102\u001a\u0002012\u0006\u0010\b\u001a\u0002018G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u00108\u001a\u0002072\u0006\u0010\b\u001a\u0002078G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<¨\u0006?"}, d2 = {"Lgatewayprotocol/v1/AdRevenueDataKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueData$Builder;", "<init>", "(Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueData$Builder;)V", "_build", "Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueData;", "value", "Lcom/google/protobuf/ByteString;", "eventId", "getEventId", "()Lcom/google/protobuf/ByteString;", "setEventId", "(Lcom/google/protobuf/ByteString;)V", "clearEventId", "", "", "revenue", "getRevenue", "()D", "setRevenue", "(D)V", "clearRevenue", "hasRevenue", "", "", "countryCode", "getCountryCode", "()Ljava/lang/String;", "setCountryCode", "(Ljava/lang/String;)V", "clearCountryCode", "hasCountryCode", "networkName", "getNetworkName", "setNetworkName", "clearNetworkName", "hasNetworkName", "adUnitId", "getAdUnitId", "setAdUnitId", "clearAdUnitId", "hasAdUnitId", "thirdPartyAdPlacementId", "getThirdPartyAdPlacementId", "setThirdPartyAdPlacementId", "clearThirdPartyAdPlacementId", "hasThirdPartyAdPlacementId", "Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "adFormat", "getAdFormat", "()Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "setAdFormat", "(Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;)V", "", "adFormatValue", "getAdFormatValue", "()I", "setAdFormatValue", "(I)V", "clearAdFormat", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final AdRevenueEventRequestOuterClass.AdRevenueData.Builder _builder;

        public /* synthetic */ Dsl(AdRevenueEventRequestOuterClass.AdRevenueData.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(AdRevenueEventRequestOuterClass.AdRevenueData.Builder builder) {
            this._builder = builder;
        }

        /* compiled from: AdRevenueDataKt.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/AdRevenueDataKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/AdRevenueDataKt$Dsl;", "builder", "Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueData$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(AdRevenueEventRequestOuterClass.AdRevenueData.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ AdRevenueEventRequestOuterClass.AdRevenueData _build() {
            AdRevenueEventRequestOuterClass.AdRevenueData build = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            return build;
        }

        @NotNull
        public final ByteString getEventId() {
            ByteString eventId = this._builder.getEventId();
            Intrinsics.checkNotNullExpressionValue(eventId, "getEventId(...)");
            return eventId;
        }

        public final void setEventId(@NotNull ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setEventId(value);
        }

        public final void clearEventId() {
            this._builder.clearEventId();
        }

        public final double getRevenue() {
            return this._builder.getRevenue();
        }

        public final void setRevenue(double d) {
            this._builder.setRevenue(d);
        }

        public final void clearRevenue() {
            this._builder.clearRevenue();
        }

        public final boolean hasRevenue() {
            return this._builder.hasRevenue();
        }

        @NotNull
        public final String getCountryCode() {
            String countryCode = this._builder.getCountryCode();
            Intrinsics.checkNotNullExpressionValue(countryCode, "getCountryCode(...)");
            return countryCode;
        }

        public final void setCountryCode(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setCountryCode(value);
        }

        public final void clearCountryCode() {
            this._builder.clearCountryCode();
        }

        public final boolean hasCountryCode() {
            return this._builder.hasCountryCode();
        }

        @NotNull
        public final String getNetworkName() {
            String networkName = this._builder.getNetworkName();
            Intrinsics.checkNotNullExpressionValue(networkName, "getNetworkName(...)");
            return networkName;
        }

        public final void setNetworkName(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setNetworkName(value);
        }

        public final void clearNetworkName() {
            this._builder.clearNetworkName();
        }

        public final boolean hasNetworkName() {
            return this._builder.hasNetworkName();
        }

        @NotNull
        public final String getAdUnitId() {
            String adUnitId = this._builder.getAdUnitId();
            Intrinsics.checkNotNullExpressionValue(adUnitId, "getAdUnitId(...)");
            return adUnitId;
        }

        public final void setAdUnitId(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAdUnitId(value);
        }

        public final void clearAdUnitId() {
            this._builder.clearAdUnitId();
        }

        public final boolean hasAdUnitId() {
            return this._builder.hasAdUnitId();
        }

        @NotNull
        public final String getThirdPartyAdPlacementId() {
            String thirdPartyAdPlacementId = this._builder.getThirdPartyAdPlacementId();
            Intrinsics.checkNotNullExpressionValue(thirdPartyAdPlacementId, "getThirdPartyAdPlacementId(...)");
            return thirdPartyAdPlacementId;
        }

        public final void setThirdPartyAdPlacementId(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setThirdPartyAdPlacementId(value);
        }

        public final void clearThirdPartyAdPlacementId() {
            this._builder.clearThirdPartyAdPlacementId();
        }

        public final boolean hasThirdPartyAdPlacementId() {
            return this._builder.hasThirdPartyAdPlacementId();
        }

        @NotNull
        public final AdFormatOuterClass.AdFormat getAdFormat() {
            AdFormatOuterClass.AdFormat adFormat = this._builder.getAdFormat();
            Intrinsics.checkNotNullExpressionValue(adFormat, "getAdFormat(...)");
            return adFormat;
        }

        public final void setAdFormat(@NotNull AdFormatOuterClass.AdFormat value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAdFormat(value);
        }

        public final int getAdFormatValue() {
            return this._builder.getAdFormatValue();
        }

        public final void setAdFormatValue(int i) {
            this._builder.setAdFormatValue(i);
        }

        public final void clearAdFormat() {
            this._builder.clearAdFormat();
        }
    }
}
