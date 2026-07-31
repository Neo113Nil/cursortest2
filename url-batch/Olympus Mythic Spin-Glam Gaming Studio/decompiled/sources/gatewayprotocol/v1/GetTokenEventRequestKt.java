package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.GetTokenEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: GetTokenEventRequestKt.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/GetTokenEventRequestKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GetTokenEventRequestKt {

    @NotNull
    public static final GetTokenEventRequestKt INSTANCE = new GetTokenEventRequestKt();

    private GetTokenEventRequestKt() {
    }

    /* compiled from: GetTokenEventRequestKt.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0016\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0012J\u0006\u0010\u001b\u001a\u00020\u0010J\u0006\u0010\u001c\u001a\u00020\u0012J\u0006\u0010 \u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0013\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u000eR$\u0010\u0018\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR$\u0010\u001d\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\f\"\u0004\b\u001f\u0010\u000e¨\u0006\""}, d2 = {"Lgatewayprotocol/v1/GetTokenEventRequestKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/GetTokenEventRequestOuterClass$GetTokenEventRequest$Builder;", "<init>", "(Lgatewayprotocol/v1/GetTokenEventRequestOuterClass$GetTokenEventRequest$Builder;)V", "_build", "Lgatewayprotocol/v1/GetTokenEventRequestOuterClass$GetTokenEventRequest;", "value", "Lcom/google/protobuf/ByteString;", "rewarded", "getRewarded", "()Lcom/google/protobuf/ByteString;", "setRewarded", "(Lcom/google/protobuf/ByteString;)V", "clearRewarded", "", "hasRewarded", "", "interstitial", "getInterstitial", "setInterstitial", "clearInterstitial", "hasInterstitial", "banner", "getBanner", "setBanner", "clearBanner", "hasBanner", "tokenId", "getTokenId", "setTokenId", "clearTokenId", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder _builder;

        public /* synthetic */ Dsl(GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder builder) {
            this._builder = builder;
        }

        /* compiled from: GetTokenEventRequestKt.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/GetTokenEventRequestKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/GetTokenEventRequestKt$Dsl;", "builder", "Lgatewayprotocol/v1/GetTokenEventRequestOuterClass$GetTokenEventRequest$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ GetTokenEventRequestOuterClass.GetTokenEventRequest _build() {
            GetTokenEventRequestOuterClass.GetTokenEventRequest build = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            return build;
        }

        @NotNull
        public final ByteString getRewarded() {
            ByteString rewarded = this._builder.getRewarded();
            Intrinsics.checkNotNullExpressionValue(rewarded, "getRewarded(...)");
            return rewarded;
        }

        public final void setRewarded(@NotNull ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setRewarded(value);
        }

        public final void clearRewarded() {
            this._builder.clearRewarded();
        }

        public final boolean hasRewarded() {
            return this._builder.hasRewarded();
        }

        @NotNull
        public final ByteString getInterstitial() {
            ByteString interstitial = this._builder.getInterstitial();
            Intrinsics.checkNotNullExpressionValue(interstitial, "getInterstitial(...)");
            return interstitial;
        }

        public final void setInterstitial(@NotNull ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setInterstitial(value);
        }

        public final void clearInterstitial() {
            this._builder.clearInterstitial();
        }

        public final boolean hasInterstitial() {
            return this._builder.hasInterstitial();
        }

        @NotNull
        public final ByteString getBanner() {
            ByteString banner = this._builder.getBanner();
            Intrinsics.checkNotNullExpressionValue(banner, "getBanner(...)");
            return banner;
        }

        public final void setBanner(@NotNull ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setBanner(value);
        }

        public final void clearBanner() {
            this._builder.clearBanner();
        }

        public final boolean hasBanner() {
            return this._builder.hasBanner();
        }

        @NotNull
        public final ByteString getTokenId() {
            ByteString tokenId = this._builder.getTokenId();
            Intrinsics.checkNotNullExpressionValue(tokenId, "getTokenId(...)");
            return tokenId;
        }

        public final void setTokenId(@NotNull ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setTokenId(value);
        }

        public final void clearTokenId() {
            this._builder.clearTokenId();
        }
    }
}
