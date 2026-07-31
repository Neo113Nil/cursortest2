package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.safedk.android.analytics.brandsafety.m;
import gatewayprotocol.v1.CampaignMetadataOuterClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: CampaignMetadataKt.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/CampaignMetadataKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CampaignMetadataKt {

    @NotNull
    public static final CampaignMetadataKt INSTANCE = new CampaignMetadataKt();

    private CampaignMetadataKt() {
    }

    /* compiled from: CampaignMetadataKt.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u001c\n\u0002\b\u0012\b\u0007\u0018\u0000 42\u00020\u0001:\u000245B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0010J%\u0010\u001e\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00192\u0006\u0010\b\u001a\u00020\u001aH\u0007¢\u0006\u0002\b\u001fJ&\u0010 \u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00192\u0006\u0010\b\u001a\u00020\u001aH\u0087\n¢\u0006\u0002\b!J+\u0010\"\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00192\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001a0$H\u0007¢\u0006\u0002\b%J,\u0010 \u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00192\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001a0$H\u0087\n¢\u0006\u0002\b&J.\u0010'\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00192\u0006\u0010(\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u001aH\u0087\u0002¢\u0006\u0002\b)J\u001d\u0010*\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019H\u0007¢\u0006\u0002\b+J\u0006\u0010/\u001a\u00020\u0010J\u0006\u00103\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00198F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR$\u0010,\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010\f\"\u0004\b.\u0010\u000eR$\u00100\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b1\u0010\f\"\u0004\b2\u0010\u000e¨\u00066"}, d2 = {"Lgatewayprotocol/v1/CampaignMetadataKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignMetadata$Builder;", "<init>", "(Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignMetadata$Builder;)V", "_build", "Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignMetadata;", "value", "", "campaignStateDataVersion", "getCampaignStateDataVersion", "()I", "setCampaignStateDataVersion", "(I)V", "clearCampaignStateDataVersion", "", "Lcom/google/protobuf/ByteString;", "campaignStateData", "getCampaignStateData", "()Lcom/google/protobuf/ByteString;", "setCampaignStateData", "(Lcom/google/protobuf/ByteString;)V", "clearCampaignStateData", "assetsToCache", "Lcom/google/protobuf/kotlin/DslList;", "Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignAsset;", "Lgatewayprotocol/v1/CampaignMetadataKt$Dsl$AssetsToCacheProxy;", "getAssetsToCache", "()Lcom/google/protobuf/kotlin/DslList;", m.l, "addAssetsToCache", "plusAssign", "plusAssignAssetsToCache", "addAll", "values", "", "addAllAssetsToCache", "plusAssignAllAssetsToCache", "set", "index", "setAssetsToCache", "clear", "clearAssetsToCache", "adDataRefreshDelayMs", "getAdDataRefreshDelayMs", "setAdDataRefreshDelayMs", "clearAdDataRefreshDelayMs", "ttlSeconds", "getTtlSeconds", "setTtlSeconds", "clearTtlSeconds", "Companion", "AssetsToCacheProxy", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final CampaignMetadataOuterClass.CampaignMetadata.Builder _builder;

        public /* synthetic */ Dsl(CampaignMetadataOuterClass.CampaignMetadata.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(CampaignMetadataOuterClass.CampaignMetadata.Builder builder) {
            this._builder = builder;
        }

        /* compiled from: CampaignMetadataKt.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/CampaignMetadataKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/CampaignMetadataKt$Dsl;", "builder", "Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignMetadata$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(CampaignMetadataOuterClass.CampaignMetadata.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ CampaignMetadataOuterClass.CampaignMetadata _build() {
            CampaignMetadataOuterClass.CampaignMetadata build = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            return build;
        }

        public final int getCampaignStateDataVersion() {
            return this._builder.getCampaignStateDataVersion();
        }

        public final void setCampaignStateDataVersion(int i) {
            this._builder.setCampaignStateDataVersion(i);
        }

        public final void clearCampaignStateDataVersion() {
            this._builder.clearCampaignStateDataVersion();
        }

        @NotNull
        public final ByteString getCampaignStateData() {
            ByteString campaignStateData = this._builder.getCampaignStateData();
            Intrinsics.checkNotNullExpressionValue(campaignStateData, "getCampaignStateData(...)");
            return campaignStateData;
        }

        public final void setCampaignStateData(@NotNull ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setCampaignStateData(value);
        }

        public final void clearCampaignStateData() {
            this._builder.clearCampaignStateData();
        }

        /* compiled from: CampaignMetadataKt.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/CampaignMetadataKt$Dsl$AssetsToCacheProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "<init>", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class AssetsToCacheProxy extends DslProxy {
            private AssetsToCacheProxy() {
            }
        }

        public final /* synthetic */ DslList getAssetsToCache() {
            List<CampaignMetadataOuterClass.CampaignAsset> assetsToCacheList = this._builder.getAssetsToCacheList();
            Intrinsics.checkNotNullExpressionValue(assetsToCacheList, "getAssetsToCacheList(...)");
            return new DslList(assetsToCacheList);
        }

        public final /* synthetic */ void addAssetsToCache(DslList dslList, CampaignMetadataOuterClass.CampaignAsset value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.addAssetsToCache(value);
        }

        public final /* synthetic */ void plusAssignAssetsToCache(DslList<CampaignMetadataOuterClass.CampaignAsset, AssetsToCacheProxy> dslList, CampaignMetadataOuterClass.CampaignAsset value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            addAssetsToCache(dslList, value);
        }

        public final /* synthetic */ void addAllAssetsToCache(DslList dslList, Iterable values) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            this._builder.addAllAssetsToCache(values);
        }

        public final /* synthetic */ void plusAssignAllAssetsToCache(DslList<CampaignMetadataOuterClass.CampaignAsset, AssetsToCacheProxy> dslList, Iterable<CampaignMetadataOuterClass.CampaignAsset> values) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            addAllAssetsToCache(dslList, values);
        }

        public final /* synthetic */ void setAssetsToCache(DslList dslList, int i, CampaignMetadataOuterClass.CampaignAsset value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAssetsToCache(i, value);
        }

        public final /* synthetic */ void clearAssetsToCache(DslList dslList) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            this._builder.clearAssetsToCache();
        }

        public final int getAdDataRefreshDelayMs() {
            return this._builder.getAdDataRefreshDelayMs();
        }

        public final void setAdDataRefreshDelayMs(int i) {
            this._builder.setAdDataRefreshDelayMs(i);
        }

        public final void clearAdDataRefreshDelayMs() {
            this._builder.clearAdDataRefreshDelayMs();
        }

        public final int getTtlSeconds() {
            return this._builder.getTtlSeconds();
        }

        public final void setTtlSeconds(int i) {
            this._builder.setTtlSeconds(i);
        }

        public final void clearTtlSeconds() {
            this._builder.clearTtlSeconds();
        }
    }
}
