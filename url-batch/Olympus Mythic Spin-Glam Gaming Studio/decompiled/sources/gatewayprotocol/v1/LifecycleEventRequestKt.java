package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.LifecycleEventRequestOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: LifecycleEventRequestKt.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/LifecycleEventRequestKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LifecycleEventRequestKt {

    @NotNull
    public static final LifecycleEventRequestKt INSTANCE = new LifecycleEventRequestKt();

    private LifecycleEventRequestKt() {
    }

    /* compiled from: LifecycleEventRequestKt.kt */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 /2\u00020\u0001:\u0001/B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0019\u001a\u00020\u0010J\u0006\u0010\u001a\u001a\u00020\u0012J\u0006\u0010'\u001a\u00020\u0010J\u0006\u0010.\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00138G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\"\u001a\u00020!2\u0006\u0010\b\u001a\u00020!8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010)\u001a\u00020(2\u0006\u0010\b\u001a\u00020(8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u00060"}, d2 = {"Lgatewayprotocol/v1/LifecycleEventRequestKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/LifecycleEventRequestOuterClass$LifecycleEventRequest$Builder;", "<init>", "(Lgatewayprotocol/v1/LifecycleEventRequestOuterClass$LifecycleEventRequest$Builder;)V", "_build", "Lgatewayprotocol/v1/LifecycleEventRequestOuterClass$LifecycleEventRequest;", "value", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "staticDeviceInfo", "getStaticDeviceInfo", "()Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "setStaticDeviceInfo", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;)V", "clearStaticDeviceInfo", "", "hasStaticDeviceInfo", "", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "dynamicDeviceInfo", "getDynamicDeviceInfo", "()Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "setDynamicDeviceInfo", "(Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;)V", "clearDynamicDeviceInfo", "hasDynamicDeviceInfo", "Lgatewayprotocol/v1/LifecycleEventRequestOuterClass$LifecycleEventType;", "lifecycleEventType", "getLifecycleEventType", "()Lgatewayprotocol/v1/LifecycleEventRequestOuterClass$LifecycleEventType;", "setLifecycleEventType", "(Lgatewayprotocol/v1/LifecycleEventRequestOuterClass$LifecycleEventType;)V", "", "lifecycleEventTypeValue", "getLifecycleEventTypeValue", "()I", "setLifecycleEventTypeValue", "(I)V", "clearLifecycleEventType", "Lcom/google/protobuf/ByteString;", "eventId", "getEventId", "()Lcom/google/protobuf/ByteString;", "setEventId", "(Lcom/google/protobuf/ByteString;)V", "clearEventId", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final LifecycleEventRequestOuterClass.LifecycleEventRequest.Builder _builder;

        public /* synthetic */ Dsl(LifecycleEventRequestOuterClass.LifecycleEventRequest.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(LifecycleEventRequestOuterClass.LifecycleEventRequest.Builder builder) {
            this._builder = builder;
        }

        /* compiled from: LifecycleEventRequestKt.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/LifecycleEventRequestKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/LifecycleEventRequestKt$Dsl;", "builder", "Lgatewayprotocol/v1/LifecycleEventRequestOuterClass$LifecycleEventRequest$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(LifecycleEventRequestOuterClass.LifecycleEventRequest.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ LifecycleEventRequestOuterClass.LifecycleEventRequest _build() {
            LifecycleEventRequestOuterClass.LifecycleEventRequest build = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            return build;
        }

        @NotNull
        public final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = this._builder.getStaticDeviceInfo();
            Intrinsics.checkNotNullExpressionValue(staticDeviceInfo, "getStaticDeviceInfo(...)");
            return staticDeviceInfo;
        }

        public final void setStaticDeviceInfo(@NotNull StaticDeviceInfoOuterClass.StaticDeviceInfo value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setStaticDeviceInfo(value);
        }

        public final void clearStaticDeviceInfo() {
            this._builder.clearStaticDeviceInfo();
        }

        public final boolean hasStaticDeviceInfo() {
            return this._builder.hasStaticDeviceInfo();
        }

        @NotNull
        public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this._builder.getDynamicDeviceInfo();
            Intrinsics.checkNotNullExpressionValue(dynamicDeviceInfo, "getDynamicDeviceInfo(...)");
            return dynamicDeviceInfo;
        }

        public final void setDynamicDeviceInfo(@NotNull DynamicDeviceInfoOuterClass.DynamicDeviceInfo value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setDynamicDeviceInfo(value);
        }

        public final void clearDynamicDeviceInfo() {
            this._builder.clearDynamicDeviceInfo();
        }

        public final boolean hasDynamicDeviceInfo() {
            return this._builder.hasDynamicDeviceInfo();
        }

        @NotNull
        public final LifecycleEventRequestOuterClass.LifecycleEventType getLifecycleEventType() {
            LifecycleEventRequestOuterClass.LifecycleEventType lifecycleEventType = this._builder.getLifecycleEventType();
            Intrinsics.checkNotNullExpressionValue(lifecycleEventType, "getLifecycleEventType(...)");
            return lifecycleEventType;
        }

        public final void setLifecycleEventType(@NotNull LifecycleEventRequestOuterClass.LifecycleEventType value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setLifecycleEventType(value);
        }

        public final int getLifecycleEventTypeValue() {
            return this._builder.getLifecycleEventTypeValue();
        }

        public final void setLifecycleEventTypeValue(int i) {
            this._builder.setLifecycleEventTypeValue(i);
        }

        public final void clearLifecycleEventType() {
            this._builder.clearLifecycleEventType();
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
    }
}
