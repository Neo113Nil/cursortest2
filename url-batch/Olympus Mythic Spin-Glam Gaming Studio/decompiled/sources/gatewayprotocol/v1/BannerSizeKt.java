package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.AdRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: BannerSizeKt.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/BannerSizeKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BannerSizeKt {

    @NotNull
    public static final BannerSizeKt INSTANCE = new BannerSizeKt();

    private BannerSizeKt() {
    }

    /* compiled from: BannerSizeKt.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000e¨\u0006\u0016"}, d2 = {"Lgatewayprotocol/v1/BannerSizeKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize$Builder;", "<init>", "(Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize$Builder;)V", "_build", "Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;", "value", "", "width", "getWidth", "()I", "setWidth", "(I)V", "clearWidth", "", "height", "getHeight", "setHeight", "clearHeight", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final AdRequestOuterClass.BannerSize.Builder _builder;

        public /* synthetic */ Dsl(AdRequestOuterClass.BannerSize.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(AdRequestOuterClass.BannerSize.Builder builder) {
            this._builder = builder;
        }

        /* compiled from: BannerSizeKt.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/BannerSizeKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/BannerSizeKt$Dsl;", "builder", "Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(AdRequestOuterClass.BannerSize.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ AdRequestOuterClass.BannerSize _build() {
            AdRequestOuterClass.BannerSize build = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            return build;
        }

        public final int getWidth() {
            return this._builder.getWidth();
        }

        public final void setWidth(int i) {
            this._builder.setWidth(i);
        }

        public final void clearWidth() {
            this._builder.clearWidth();
        }

        public final int getHeight() {
            return this._builder.getHeight();
        }

        public final void setHeight(int i) {
            this._builder.setHeight(i);
        }

        public final void clearHeight() {
            this._builder.clearHeight();
        }
    }
}
