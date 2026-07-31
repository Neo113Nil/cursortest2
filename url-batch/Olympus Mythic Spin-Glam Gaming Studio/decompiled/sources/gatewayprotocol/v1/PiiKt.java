package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.PiiOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: PiiKt.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/PiiKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PiiKt {

    @NotNull
    public static final PiiKt INSTANCE = new PiiKt();

    private PiiKt() {
    }

    /* compiled from: PiiKt.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0010J\u0006\u0010\u0018\u001a\u00020\u0010J\u0006\u0010\u001f\u001a\u00020\u0010J\u0006\u0010 \u001a\u00020!J\u0006\u0010%\u001a\u00020\u0010J\u0006\u0010&\u001a\u00020!R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR$\u0010\u0015\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR$\u0010\u001a\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00198G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\"\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00198G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001e¨\u0006("}, d2 = {"Lgatewayprotocol/v1/PiiKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/PiiOuterClass$Pii$Builder;", "<init>", "(Lgatewayprotocol/v1/PiiOuterClass$Pii$Builder;)V", "_build", "Lgatewayprotocol/v1/PiiOuterClass$Pii;", "value", "Lcom/google/protobuf/ByteString;", "advertisingId", "getAdvertisingId", "()Lcom/google/protobuf/ByteString;", "setAdvertisingId", "(Lcom/google/protobuf/ByteString;)V", "clearAdvertisingId", "", "vendorId", "getVendorId", "setVendorId", "clearVendorId", "openAdvertisingTrackingId", "getOpenAdvertisingTrackingId", "setOpenAdvertisingTrackingId", "clearOpenAdvertisingTrackingId", "", "fid", "getFid", "()Ljava/lang/String;", "setFid", "(Ljava/lang/String;)V", "clearFid", "hasFid", "", "appsetId", "getAppsetId", "setAppsetId", "clearAppsetId", "hasAppsetId", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final PiiOuterClass.Pii.Builder _builder;

        public /* synthetic */ Dsl(PiiOuterClass.Pii.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(PiiOuterClass.Pii.Builder builder) {
            this._builder = builder;
        }

        /* compiled from: PiiKt.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/PiiKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/PiiKt$Dsl;", "builder", "Lgatewayprotocol/v1/PiiOuterClass$Pii$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(PiiOuterClass.Pii.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ PiiOuterClass.Pii _build() {
            PiiOuterClass.Pii build = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            return build;
        }

        @NotNull
        public final ByteString getAdvertisingId() {
            ByteString advertisingId = this._builder.getAdvertisingId();
            Intrinsics.checkNotNullExpressionValue(advertisingId, "getAdvertisingId(...)");
            return advertisingId;
        }

        public final void setAdvertisingId(@NotNull ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAdvertisingId(value);
        }

        public final void clearAdvertisingId() {
            this._builder.clearAdvertisingId();
        }

        @NotNull
        public final ByteString getVendorId() {
            ByteString vendorId = this._builder.getVendorId();
            Intrinsics.checkNotNullExpressionValue(vendorId, "getVendorId(...)");
            return vendorId;
        }

        public final void setVendorId(@NotNull ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setVendorId(value);
        }

        public final void clearVendorId() {
            this._builder.clearVendorId();
        }

        @NotNull
        public final ByteString getOpenAdvertisingTrackingId() {
            ByteString openAdvertisingTrackingId = this._builder.getOpenAdvertisingTrackingId();
            Intrinsics.checkNotNullExpressionValue(openAdvertisingTrackingId, "getOpenAdvertisingTrackingId(...)");
            return openAdvertisingTrackingId;
        }

        public final void setOpenAdvertisingTrackingId(@NotNull ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setOpenAdvertisingTrackingId(value);
        }

        public final void clearOpenAdvertisingTrackingId() {
            this._builder.clearOpenAdvertisingTrackingId();
        }

        @NotNull
        public final String getFid() {
            String fid = this._builder.getFid();
            Intrinsics.checkNotNullExpressionValue(fid, "getFid(...)");
            return fid;
        }

        public final void setFid(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setFid(value);
        }

        public final void clearFid() {
            this._builder.clearFid();
        }

        public final boolean hasFid() {
            return this._builder.hasFid();
        }

        @NotNull
        public final String getAppsetId() {
            String appsetId = this._builder.getAppsetId();
            Intrinsics.checkNotNullExpressionValue(appsetId, "getAppsetId(...)");
            return appsetId;
        }

        public final void setAppsetId(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAppsetId(value);
        }

        public final void clearAppsetId() {
            this._builder.clearAppsetId();
        }

        public final boolean hasAppsetId() {
            return this._builder.hasAppsetId();
        }
    }
}
