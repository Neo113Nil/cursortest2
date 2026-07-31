package gatewayprotocol.v1;

import com.applovin.sdk.AppLovinEventTypes;
import com.google.protobuf.ByteString;
import com.google.protobuf.Timestamp;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: TransactionDataKt.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/TransactionDataKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TransactionDataKt {

    @NotNull
    public static final TransactionDataKt INSTANCE = new TransactionDataKt();

    private TransactionDataKt() {
    }

    /* compiled from: TransactionDataKt.kt */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0012\b\u0007\u0018\u0000 K2\u00020\u0001:\u0001KB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0019\u001a\u00020\u0010J\u0006\u0010 \u001a\u00020\u0010J\u0006\u0010$\u001a\u00020\u0010J\u0006\u0010(\u001a\u00020\u0010J\u0006\u0010,\u001a\u00020\u0010J\u0006\u00102\u001a\u00020\u0010J\u0006\u00103\u001a\u00020\u0012J\u0006\u0010@\u001a\u00020\u0010J\u0006\u0010D\u001a\u00020\u0010J\u0006\u0010E\u001a\u00020\u0012J\u0006\u0010I\u001a\u00020\u0010J\u0006\u0010J\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00138G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\u001a8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010!\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00138G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u0016\"\u0004\b#\u0010\u0018R$\u0010%\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00138G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010\u0016\"\u0004\b'\u0010\u0018R$\u0010)\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00138G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010\u0016\"\u0004\b+\u0010\u0018R*\u0010-\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00138G@GX\u0087\u000e¢\u0006\u0012\u0012\u0004\b.\u0010/\u001a\u0004\b0\u0010\u0016\"\u0004\b1\u0010\u0018R$\u00105\u001a\u0002042\u0006\u0010\b\u001a\u0002048G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010;\u001a\u00020:2\u0006\u0010\b\u001a\u00020:8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010A\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00138G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bB\u0010\u0016\"\u0004\bC\u0010\u0018R$\u0010F\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00138G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bG\u0010\u0016\"\u0004\bH\u0010\u0018¨\u0006L"}, d2 = {"Lgatewayprotocol/v1/TransactionDataKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionData$Builder;", "<init>", "(Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionData$Builder;)V", "_build", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionData;", "value", "Lcom/google/protobuf/Timestamp;", "timestamp", "getTimestamp", "()Lcom/google/protobuf/Timestamp;", "setTimestamp", "(Lcom/google/protobuf/Timestamp;)V", "clearTimestamp", "", "hasTimestamp", "", "", InAppPurchaseMetaData.KEY_PRODUCT_ID, "getProductId", "()Ljava/lang/String;", "setProductId", "(Ljava/lang/String;)V", "clearProductId", "Lcom/google/protobuf/ByteString;", "eventId", "getEventId", "()Lcom/google/protobuf/ByteString;", "setEventId", "(Lcom/google/protobuf/ByteString;)V", "clearEventId", "transactionId", "getTransactionId", "setTransactionId", "clearTransactionId", AppLovinEventTypes.USER_VIEWED_PRODUCT, "getProduct", "setProduct", "clearProduct", "transaction", "getTransaction", "setTransaction", "clearTransaction", "receipt", "getReceipt$annotations", "()V", "getReceipt", "setReceipt", "clearReceipt", "hasReceipt", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionState;", "transactionState", "getTransactionState", "()Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionState;", "setTransactionState", "(Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionState;)V", "", "transactionStateValue", "getTransactionStateValue", "()I", "setTransactionStateValue", "(I)V", "clearTransactionState", "jwsRepresentation", "getJwsRepresentation", "setJwsRepresentation", "clearJwsRepresentation", "hasJwsRepresentation", InAppPurchaseMetaData.KEY_SIGNATURE, "getSignature", "setSignature", "clearSignature", "hasSignature", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final TransactionEventRequestOuterClass.TransactionData.Builder _builder;

        public /* synthetic */ Dsl(TransactionEventRequestOuterClass.TransactionData.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        @Deprecated
        public static /* synthetic */ void getReceipt$annotations() {
        }

        private Dsl(TransactionEventRequestOuterClass.TransactionData.Builder builder) {
            this._builder = builder;
        }

        /* compiled from: TransactionDataKt.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/TransactionDataKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/TransactionDataKt$Dsl;", "builder", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionData$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(TransactionEventRequestOuterClass.TransactionData.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ TransactionEventRequestOuterClass.TransactionData _build() {
            TransactionEventRequestOuterClass.TransactionData build = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            return build;
        }

        @NotNull
        public final Timestamp getTimestamp() {
            Timestamp timestamp = this._builder.getTimestamp();
            Intrinsics.checkNotNullExpressionValue(timestamp, "getTimestamp(...)");
            return timestamp;
        }

        public final void setTimestamp(@NotNull Timestamp value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setTimestamp(value);
        }

        public final void clearTimestamp() {
            this._builder.clearTimestamp();
        }

        public final boolean hasTimestamp() {
            return this._builder.hasTimestamp();
        }

        @NotNull
        public final String getProductId() {
            String productId = this._builder.getProductId();
            Intrinsics.checkNotNullExpressionValue(productId, "getProductId(...)");
            return productId;
        }

        public final void setProductId(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setProductId(value);
        }

        public final void clearProductId() {
            this._builder.clearProductId();
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

        @NotNull
        public final String getTransactionId() {
            String transactionId = this._builder.getTransactionId();
            Intrinsics.checkNotNullExpressionValue(transactionId, "getTransactionId(...)");
            return transactionId;
        }

        public final void setTransactionId(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setTransactionId(value);
        }

        public final void clearTransactionId() {
            this._builder.clearTransactionId();
        }

        @NotNull
        public final String getProduct() {
            String product = this._builder.getProduct();
            Intrinsics.checkNotNullExpressionValue(product, "getProduct(...)");
            return product;
        }

        public final void setProduct(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setProduct(value);
        }

        public final void clearProduct() {
            this._builder.clearProduct();
        }

        @NotNull
        public final String getTransaction() {
            String transaction = this._builder.getTransaction();
            Intrinsics.checkNotNullExpressionValue(transaction, "getTransaction(...)");
            return transaction;
        }

        public final void setTransaction(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setTransaction(value);
        }

        public final void clearTransaction() {
            this._builder.clearTransaction();
        }

        @NotNull
        public final String getReceipt() {
            String receipt = this._builder.getReceipt();
            Intrinsics.checkNotNullExpressionValue(receipt, "getReceipt(...)");
            return receipt;
        }

        public final void setReceipt(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setReceipt(value);
        }

        public final void clearReceipt() {
            this._builder.clearReceipt();
        }

        public final boolean hasReceipt() {
            return this._builder.hasReceipt();
        }

        @NotNull
        public final TransactionEventRequestOuterClass.TransactionState getTransactionState() {
            TransactionEventRequestOuterClass.TransactionState transactionState = this._builder.getTransactionState();
            Intrinsics.checkNotNullExpressionValue(transactionState, "getTransactionState(...)");
            return transactionState;
        }

        public final void setTransactionState(@NotNull TransactionEventRequestOuterClass.TransactionState value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setTransactionState(value);
        }

        public final int getTransactionStateValue() {
            return this._builder.getTransactionStateValue();
        }

        public final void setTransactionStateValue(int i) {
            this._builder.setTransactionStateValue(i);
        }

        public final void clearTransactionState() {
            this._builder.clearTransactionState();
        }

        @NotNull
        public final String getJwsRepresentation() {
            String jwsRepresentation = this._builder.getJwsRepresentation();
            Intrinsics.checkNotNullExpressionValue(jwsRepresentation, "getJwsRepresentation(...)");
            return jwsRepresentation;
        }

        public final void setJwsRepresentation(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setJwsRepresentation(value);
        }

        public final void clearJwsRepresentation() {
            this._builder.clearJwsRepresentation();
        }

        public final boolean hasJwsRepresentation() {
            return this._builder.hasJwsRepresentation();
        }

        @NotNull
        public final String getSignature() {
            String signature = this._builder.getSignature();
            Intrinsics.checkNotNullExpressionValue(signature, "getSignature(...)");
            return signature;
        }

        public final void setSignature(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setSignature(value);
        }

        public final void clearSignature() {
            this._builder.clearSignature();
        }

        public final boolean hasSignature() {
            return this._builder.hasSignature();
        }
    }
}
