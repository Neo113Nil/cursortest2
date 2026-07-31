package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.ironsource.C4901tg;
import gatewayprotocol.v1.PrivacyUpdateRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: PrivacyUpdateRequestKt.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/PrivacyUpdateRequestKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PrivacyUpdateRequestKt {

    @NotNull
    public static final PrivacyUpdateRequestKt INSTANCE = new PrivacyUpdateRequestKt();

    private PrivacyUpdateRequestKt() {
    }

    /* compiled from: PrivacyUpdateRequestKt.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lgatewayprotocol/v1/PrivacyUpdateRequestKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest$Builder;", "<init>", "(Lgatewayprotocol/v1/PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest$Builder;)V", "_build", "Lgatewayprotocol/v1/PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest;", "value", "", "version", C4901tg.b, "()I", "setVersion", "(I)V", "clearVersion", "", "Lcom/google/protobuf/ByteString;", "content", "getContent", "()Lcom/google/protobuf/ByteString;", "setContent", "(Lcom/google/protobuf/ByteString;)V", "clearContent", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder _builder;

        public /* synthetic */ Dsl(PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder builder) {
            this._builder = builder;
        }

        /* compiled from: PrivacyUpdateRequestKt.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/PrivacyUpdateRequestKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/PrivacyUpdateRequestKt$Dsl;", "builder", "Lgatewayprotocol/v1/PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest _build() {
            PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest build = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            return build;
        }

        public final int getVersion() {
            return this._builder.getVersion();
        }

        public final void setVersion(int i) {
            this._builder.setVersion(i);
        }

        public final void clearVersion() {
            this._builder.clearVersion();
        }

        @NotNull
        public final ByteString getContent() {
            ByteString content = this._builder.getContent();
            Intrinsics.checkNotNullExpressionValue(content, "getContent(...)");
            return content;
        }

        public final void setContent(@NotNull ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setContent(value);
        }

        public final void clearContent() {
            this._builder.clearContent();
        }
    }
}
