package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: RequestRetryPolicyKt.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/RequestRetryPolicyKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RequestRetryPolicyKt {

    @NotNull
    public static final RequestRetryPolicyKt INSTANCE = new RequestRetryPolicyKt();

    private RequestRetryPolicyKt() {
    }

    /* compiled from: RequestRetryPolicyKt.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001+B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0010J\u0006\u0010\u0018\u001a\u00020\u0010J\u0006\u0010\u001f\u001a\u00020\u0010J\u0006\u0010#\u001a\u00020\u0010J\u0006\u0010*\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR$\u0010\u0015\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR$\u0010\u001a\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00198G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010 \u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00198G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR$\u0010%\u001a\u00020$2\u0006\u0010\b\u001a\u00020$8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lgatewayprotocol/v1/RequestRetryPolicyKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestRetryPolicy$Builder;", "<init>", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestRetryPolicy$Builder;)V", "_build", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestRetryPolicy;", "value", "", "maxDuration", "getMaxDuration", "()I", "setMaxDuration", "(I)V", "clearMaxDuration", "", "retryWaitBase", "getRetryWaitBase", "setRetryWaitBase", "clearRetryWaitBase", "retryMaxInterval", "getRetryMaxInterval", "setRetryMaxInterval", "clearRetryMaxInterval", "", "retryJitterPct", "getRetryJitterPct", "()F", "setRetryJitterPct", "(F)V", "clearRetryJitterPct", "retryScalingFactor", "getRetryScalingFactor", "setRetryScalingFactor", "clearRetryScalingFactor", "", "shouldStoreLocally", "getShouldStoreLocally", "()Z", "setShouldStoreLocally", "(Z)V", "clearShouldStoreLocally", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final NativeConfigurationOuterClass.RequestRetryPolicy.Builder _builder;

        public /* synthetic */ Dsl(NativeConfigurationOuterClass.RequestRetryPolicy.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(NativeConfigurationOuterClass.RequestRetryPolicy.Builder builder) {
            this._builder = builder;
        }

        /* compiled from: RequestRetryPolicyKt.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/RequestRetryPolicyKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/RequestRetryPolicyKt$Dsl;", "builder", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestRetryPolicy$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(NativeConfigurationOuterClass.RequestRetryPolicy.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ NativeConfigurationOuterClass.RequestRetryPolicy _build() {
            NativeConfigurationOuterClass.RequestRetryPolicy build = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            return build;
        }

        public final int getMaxDuration() {
            return this._builder.getMaxDuration();
        }

        public final void setMaxDuration(int i) {
            this._builder.setMaxDuration(i);
        }

        public final void clearMaxDuration() {
            this._builder.clearMaxDuration();
        }

        public final int getRetryWaitBase() {
            return this._builder.getRetryWaitBase();
        }

        public final void setRetryWaitBase(int i) {
            this._builder.setRetryWaitBase(i);
        }

        public final void clearRetryWaitBase() {
            this._builder.clearRetryWaitBase();
        }

        public final int getRetryMaxInterval() {
            return this._builder.getRetryMaxInterval();
        }

        public final void setRetryMaxInterval(int i) {
            this._builder.setRetryMaxInterval(i);
        }

        public final void clearRetryMaxInterval() {
            this._builder.clearRetryMaxInterval();
        }

        public final float getRetryJitterPct() {
            return this._builder.getRetryJitterPct();
        }

        public final void setRetryJitterPct(float f) {
            this._builder.setRetryJitterPct(f);
        }

        public final void clearRetryJitterPct() {
            this._builder.clearRetryJitterPct();
        }

        public final float getRetryScalingFactor() {
            return this._builder.getRetryScalingFactor();
        }

        public final void setRetryScalingFactor(float f) {
            this._builder.setRetryScalingFactor(f);
        }

        public final void clearRetryScalingFactor() {
            this._builder.clearRetryScalingFactor();
        }

        public final boolean getShouldStoreLocally() {
            return this._builder.getShouldStoreLocally();
        }

        public final void setShouldStoreLocally(boolean z) {
            this._builder.setShouldStoreLocally(z);
        }

        public final void clearShouldStoreLocally() {
            this._builder.clearShouldStoreLocally();
        }
    }
}
