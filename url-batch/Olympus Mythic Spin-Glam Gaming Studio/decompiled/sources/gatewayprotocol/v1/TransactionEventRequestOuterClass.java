package gatewayprotocol.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class TransactionEventRequestOuterClass {

    public interface TransactionDataOrBuilder extends MessageLiteOrBuilder {
        ByteString getEventId();

        String getJwsRepresentation();

        ByteString getJwsRepresentationBytes();

        String getProduct();

        ByteString getProductBytes();

        String getProductId();

        ByteString getProductIdBytes();

        @Deprecated
        String getReceipt();

        @Deprecated
        ByteString getReceiptBytes();

        String getSignature();

        ByteString getSignatureBytes();

        Timestamp getTimestamp();

        String getTransaction();

        ByteString getTransactionBytes();

        String getTransactionId();

        ByteString getTransactionIdBytes();

        TransactionState getTransactionState();

        int getTransactionStateValue();

        boolean hasJwsRepresentation();

        @Deprecated
        boolean hasReceipt();

        boolean hasSignature();

        boolean hasTimestamp();
    }

    public interface TransactionEventRequestOrBuilder extends MessageLiteOrBuilder {
        StoreType getAppStore();

        int getAppStoreValue();

        String getCustomStore();

        ByteString getCustomStoreBytes();

        DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo();

        String getGooglePlayBillingLibraryVersion();

        ByteString getGooglePlayBillingLibraryVersionBytes();

        TransactionOrigin getOrigin();

        int getOriginValue();

        ByteString getReceipt();

        StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo();

        StoreKitVersion getStoreKitVersion();

        int getStoreKitVersionValue();

        TransactionData getTransactionData(int i);

        int getTransactionDataCount();

        List<TransactionData> getTransactionDataList();

        boolean hasDynamicDeviceInfo();

        boolean hasReceipt();

        boolean hasStaticDeviceInfo();
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    private TransactionEventRequestOuterClass() {
    }

    public enum StoreType implements Internal.EnumLite {
        STORE_TYPE_UNSPECIFIED(0),
        STORE_TYPE_CUSTOM(1),
        STORE_TYPE_APPLE_APP_STORE(2),
        STORE_TYPE_GOOGLE_PLAY(3),
        UNRECOGNIZED(-1);

        public static final int STORE_TYPE_APPLE_APP_STORE_VALUE = 2;
        public static final int STORE_TYPE_CUSTOM_VALUE = 1;
        public static final int STORE_TYPE_GOOGLE_PLAY_VALUE = 3;
        public static final int STORE_TYPE_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap<StoreType> internalValueMap = new Internal.EnumLiteMap() { // from class: gatewayprotocol.v1.TransactionEventRequestOuterClass.StoreType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public StoreType findValueByNumber(int i) {
                return StoreType.forNumber(i);
            }
        };
        private final int value;

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @Deprecated
        public static StoreType valueOf(int i) {
            return forNumber(i);
        }

        public static StoreType forNumber(int i) {
            if (i == 0) {
                return STORE_TYPE_UNSPECIFIED;
            }
            if (i == 1) {
                return STORE_TYPE_CUSTOM;
            }
            if (i == 2) {
                return STORE_TYPE_APPLE_APP_STORE;
            }
            if (i != 3) {
                return null;
            }
            return STORE_TYPE_GOOGLE_PLAY;
        }

        public static Internal.EnumLiteMap<StoreType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return StoreTypeVerifier.INSTANCE;
        }

        private static final class StoreTypeVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new StoreTypeVerifier();

            private StoreTypeVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return StoreType.forNumber(i) != null;
            }
        }

        StoreType(int i) {
            this.value = i;
        }
    }

    public enum StoreKitVersion implements Internal.EnumLite {
        STORE_KIT_VERSION_UNSPECIFIED(0),
        STORE_KIT_VERSION_1(1),
        STORE_KIT_VERSION_2(2),
        UNRECOGNIZED(-1);

        public static final int STORE_KIT_VERSION_1_VALUE = 1;
        public static final int STORE_KIT_VERSION_2_VALUE = 2;
        public static final int STORE_KIT_VERSION_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap<StoreKitVersion> internalValueMap = new Internal.EnumLiteMap() { // from class: gatewayprotocol.v1.TransactionEventRequestOuterClass.StoreKitVersion.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public StoreKitVersion findValueByNumber(int i) {
                return StoreKitVersion.forNumber(i);
            }
        };
        private final int value;

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @Deprecated
        public static StoreKitVersion valueOf(int i) {
            return forNumber(i);
        }

        public static StoreKitVersion forNumber(int i) {
            if (i == 0) {
                return STORE_KIT_VERSION_UNSPECIFIED;
            }
            if (i == 1) {
                return STORE_KIT_VERSION_1;
            }
            if (i != 2) {
                return null;
            }
            return STORE_KIT_VERSION_2;
        }

        public static Internal.EnumLiteMap<StoreKitVersion> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return StoreKitVersionVerifier.INSTANCE;
        }

        private static final class StoreKitVersionVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new StoreKitVersionVerifier();

            private StoreKitVersionVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return StoreKitVersion.forNumber(i) != null;
            }
        }

        StoreKitVersion(int i) {
            this.value = i;
        }
    }

    public enum TransactionState implements Internal.EnumLite {
        TRANSACTION_STATE_UNSPECIFIED(0),
        TRANSACTION_STATE_PENDING(1),
        TRANSACTION_STATE_PURCHASED(2),
        TRANSACTION_STATE_FAILED(3),
        TRANSACTION_STATE_RESTORED(4),
        TRANSACTION_STATE_DEFERRED(5),
        TRANSACTION_STATE_CANCELED(6),
        UNRECOGNIZED(-1);

        public static final int TRANSACTION_STATE_CANCELED_VALUE = 6;
        public static final int TRANSACTION_STATE_DEFERRED_VALUE = 5;
        public static final int TRANSACTION_STATE_FAILED_VALUE = 3;
        public static final int TRANSACTION_STATE_PENDING_VALUE = 1;
        public static final int TRANSACTION_STATE_PURCHASED_VALUE = 2;
        public static final int TRANSACTION_STATE_RESTORED_VALUE = 4;
        public static final int TRANSACTION_STATE_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap<TransactionState> internalValueMap = new Internal.EnumLiteMap() { // from class: gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionState.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public TransactionState findValueByNumber(int i) {
                return TransactionState.forNumber(i);
            }
        };
        private final int value;

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @Deprecated
        public static TransactionState valueOf(int i) {
            return forNumber(i);
        }

        public static TransactionState forNumber(int i) {
            switch (i) {
                case 0:
                    return TRANSACTION_STATE_UNSPECIFIED;
                case 1:
                    return TRANSACTION_STATE_PENDING;
                case 2:
                    return TRANSACTION_STATE_PURCHASED;
                case 3:
                    return TRANSACTION_STATE_FAILED;
                case 4:
                    return TRANSACTION_STATE_RESTORED;
                case 5:
                    return TRANSACTION_STATE_DEFERRED;
                case 6:
                    return TRANSACTION_STATE_CANCELED;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap<TransactionState> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return TransactionStateVerifier.INSTANCE;
        }

        private static final class TransactionStateVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new TransactionStateVerifier();

            private TransactionStateVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return TransactionState.forNumber(i) != null;
            }
        }

        TransactionState(int i) {
            this.value = i;
        }
    }

    public enum TransactionOrigin implements Internal.EnumLite {
        TRANSACTION_ORIGIN_UNSPECIFIED(0),
        TRANSACTION_ORIGIN_LIVE_UPDATE(1),
        TRANSACTION_ORIGIN_HISTORICAL(2),
        TRANSACTION_ORIGIN_IAP_PLUGIN(3),
        UNRECOGNIZED(-1);

        public static final int TRANSACTION_ORIGIN_HISTORICAL_VALUE = 2;
        public static final int TRANSACTION_ORIGIN_IAP_PLUGIN_VALUE = 3;
        public static final int TRANSACTION_ORIGIN_LIVE_UPDATE_VALUE = 1;
        public static final int TRANSACTION_ORIGIN_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap<TransactionOrigin> internalValueMap = new Internal.EnumLiteMap() { // from class: gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionOrigin.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public TransactionOrigin findValueByNumber(int i) {
                return TransactionOrigin.forNumber(i);
            }
        };
        private final int value;

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @Deprecated
        public static TransactionOrigin valueOf(int i) {
            return forNumber(i);
        }

        public static TransactionOrigin forNumber(int i) {
            if (i == 0) {
                return TRANSACTION_ORIGIN_UNSPECIFIED;
            }
            if (i == 1) {
                return TRANSACTION_ORIGIN_LIVE_UPDATE;
            }
            if (i == 2) {
                return TRANSACTION_ORIGIN_HISTORICAL;
            }
            if (i != 3) {
                return null;
            }
            return TRANSACTION_ORIGIN_IAP_PLUGIN;
        }

        public static Internal.EnumLiteMap<TransactionOrigin> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return TransactionOriginVerifier.INSTANCE;
        }

        private static final class TransactionOriginVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new TransactionOriginVerifier();

            private TransactionOriginVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return TransactionOrigin.forNumber(i) != null;
            }
        }

        TransactionOrigin(int i) {
            this.value = i;
        }
    }

    public static final class TransactionData extends GeneratedMessageLite<TransactionData, Builder> implements TransactionDataOrBuilder {
        private static final TransactionData DEFAULT_INSTANCE;
        public static final int EVENT_ID_FIELD_NUMBER = 3;
        public static final int JWS_REPRESENTATION_FIELD_NUMBER = 9;
        private static volatile Parser<TransactionData> PARSER = null;
        public static final int PRODUCT_FIELD_NUMBER = 5;
        public static final int PRODUCT_ID_FIELD_NUMBER = 2;
        public static final int RECEIPT_FIELD_NUMBER = 7;
        public static final int SIGNATURE_FIELD_NUMBER = 10;
        public static final int TIMESTAMP_FIELD_NUMBER = 1;
        public static final int TRANSACTION_FIELD_NUMBER = 6;
        public static final int TRANSACTION_ID_FIELD_NUMBER = 4;
        public static final int TRANSACTION_STATE_FIELD_NUMBER = 8;
        private int bitField0_;
        private Timestamp timestamp_;
        private int transactionState_;
        private String productId_ = "";
        private ByteString eventId_ = ByteString.EMPTY;
        private String transactionId_ = "";
        private String product_ = "";
        private String transaction_ = "";
        private String receipt_ = "";
        private String jwsRepresentation_ = "";
        private String signature_ = "";

        private TransactionData() {
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
        public boolean hasTimestamp() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
        public Timestamp getTimestamp() {
            Timestamp timestamp = this.timestamp_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimestamp(Timestamp timestamp) {
            timestamp.getClass();
            this.timestamp_ = timestamp;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTimestamp(Timestamp timestamp) {
            timestamp.getClass();
            Timestamp timestamp2 = this.timestamp_;
            if (timestamp2 != null && timestamp2 != Timestamp.getDefaultInstance()) {
                this.timestamp_ = Timestamp.newBuilder(this.timestamp_).mergeFrom((Timestamp.Builder) timestamp).buildPartial();
            } else {
                this.timestamp_ = timestamp;
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimestamp() {
            this.timestamp_ = null;
            this.bitField0_ &= -2;
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
        public String getProductId() {
            return this.productId_;
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
        public ByteString getProductIdBytes() {
            return ByteString.copyFromUtf8(this.productId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProductId(String str) {
            str.getClass();
            this.productId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearProductId() {
            this.productId_ = getDefaultInstance().getProductId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProductIdBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.productId_ = byteString.toStringUtf8();
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
        public ByteString getEventId() {
            return this.eventId_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventId(ByteString byteString) {
            byteString.getClass();
            this.eventId_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEventId() {
            this.eventId_ = getDefaultInstance().getEventId();
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
        public String getTransactionId() {
            return this.transactionId_;
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
        public ByteString getTransactionIdBytes() {
            return ByteString.copyFromUtf8(this.transactionId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTransactionId(String str) {
            str.getClass();
            this.transactionId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTransactionId() {
            this.transactionId_ = getDefaultInstance().getTransactionId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTransactionIdBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.transactionId_ = byteString.toStringUtf8();
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
        public String getProduct() {
            return this.product_;
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
        public ByteString getProductBytes() {
            return ByteString.copyFromUtf8(this.product_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProduct(String str) {
            str.getClass();
            this.product_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearProduct() {
            this.product_ = getDefaultInstance().getProduct();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProductBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.product_ = byteString.toStringUtf8();
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
        public String getTransaction() {
            return this.transaction_;
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
        public ByteString getTransactionBytes() {
            return ByteString.copyFromUtf8(this.transaction_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTransaction(String str) {
            str.getClass();
            this.transaction_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTransaction() {
            this.transaction_ = getDefaultInstance().getTransaction();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTransactionBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.transaction_ = byteString.toStringUtf8();
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
        @Deprecated
        public boolean hasReceipt() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
        @Deprecated
        public String getReceipt() {
            return this.receipt_;
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
        @Deprecated
        public ByteString getReceiptBytes() {
            return ByteString.copyFromUtf8(this.receipt_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReceipt(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.receipt_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReceipt() {
            this.bitField0_ &= -3;
            this.receipt_ = getDefaultInstance().getReceipt();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReceiptBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.receipt_ = byteString.toStringUtf8();
            this.bitField0_ |= 2;
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
        public int getTransactionStateValue() {
            return this.transactionState_;
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
        public TransactionState getTransactionState() {
            TransactionState forNumber = TransactionState.forNumber(this.transactionState_);
            return forNumber == null ? TransactionState.UNRECOGNIZED : forNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTransactionStateValue(int i) {
            this.transactionState_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTransactionState(TransactionState transactionState) {
            this.transactionState_ = transactionState.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTransactionState() {
            this.transactionState_ = 0;
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
        public boolean hasJwsRepresentation() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
        public String getJwsRepresentation() {
            return this.jwsRepresentation_;
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
        public ByteString getJwsRepresentationBytes() {
            return ByteString.copyFromUtf8(this.jwsRepresentation_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJwsRepresentation(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.jwsRepresentation_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearJwsRepresentation() {
            this.bitField0_ &= -5;
            this.jwsRepresentation_ = getDefaultInstance().getJwsRepresentation();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJwsRepresentationBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.jwsRepresentation_ = byteString.toStringUtf8();
            this.bitField0_ |= 4;
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
        public boolean hasSignature() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
        public String getSignature() {
            return this.signature_;
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
        public ByteString getSignatureBytes() {
            return ByteString.copyFromUtf8(this.signature_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSignature(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.signature_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSignature() {
            this.bitField0_ &= -9;
            this.signature_ = getDefaultInstance().getSignature();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSignatureBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.signature_ = byteString.toStringUtf8();
            this.bitField0_ |= 8;
        }

        public static TransactionData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TransactionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static TransactionData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TransactionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static TransactionData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TransactionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TransactionData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TransactionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static TransactionData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TransactionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TransactionData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TransactionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static TransactionData parseFrom(InputStream inputStream) throws IOException {
            return (TransactionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TransactionData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TransactionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static TransactionData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TransactionData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TransactionData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TransactionData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static TransactionData parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (TransactionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static TransactionData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TransactionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(TransactionData transactionData) {
            return DEFAULT_INSTANCE.createBuilder(transactionData);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<TransactionData, Builder> implements TransactionDataOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(TransactionData.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
            public boolean hasTimestamp() {
                return ((TransactionData) this.instance).hasTimestamp();
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
            public Timestamp getTimestamp() {
                return ((TransactionData) this.instance).getTimestamp();
            }

            public Builder setTimestamp(Timestamp timestamp) {
                copyOnWrite();
                ((TransactionData) this.instance).setTimestamp(timestamp);
                return this;
            }

            public Builder setTimestamp(Timestamp.Builder builder) {
                copyOnWrite();
                ((TransactionData) this.instance).setTimestamp(builder.build());
                return this;
            }

            public Builder mergeTimestamp(Timestamp timestamp) {
                copyOnWrite();
                ((TransactionData) this.instance).mergeTimestamp(timestamp);
                return this;
            }

            public Builder clearTimestamp() {
                copyOnWrite();
                ((TransactionData) this.instance).clearTimestamp();
                return this;
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
            public String getProductId() {
                return ((TransactionData) this.instance).getProductId();
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
            public ByteString getProductIdBytes() {
                return ((TransactionData) this.instance).getProductIdBytes();
            }

            public Builder setProductId(String str) {
                copyOnWrite();
                ((TransactionData) this.instance).setProductId(str);
                return this;
            }

            public Builder clearProductId() {
                copyOnWrite();
                ((TransactionData) this.instance).clearProductId();
                return this;
            }

            public Builder setProductIdBytes(ByteString byteString) {
                copyOnWrite();
                ((TransactionData) this.instance).setProductIdBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
            public ByteString getEventId() {
                return ((TransactionData) this.instance).getEventId();
            }

            public Builder setEventId(ByteString byteString) {
                copyOnWrite();
                ((TransactionData) this.instance).setEventId(byteString);
                return this;
            }

            public Builder clearEventId() {
                copyOnWrite();
                ((TransactionData) this.instance).clearEventId();
                return this;
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
            public String getTransactionId() {
                return ((TransactionData) this.instance).getTransactionId();
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
            public ByteString getTransactionIdBytes() {
                return ((TransactionData) this.instance).getTransactionIdBytes();
            }

            public Builder setTransactionId(String str) {
                copyOnWrite();
                ((TransactionData) this.instance).setTransactionId(str);
                return this;
            }

            public Builder clearTransactionId() {
                copyOnWrite();
                ((TransactionData) this.instance).clearTransactionId();
                return this;
            }

            public Builder setTransactionIdBytes(ByteString byteString) {
                copyOnWrite();
                ((TransactionData) this.instance).setTransactionIdBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
            public String getProduct() {
                return ((TransactionData) this.instance).getProduct();
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
            public ByteString getProductBytes() {
                return ((TransactionData) this.instance).getProductBytes();
            }

            public Builder setProduct(String str) {
                copyOnWrite();
                ((TransactionData) this.instance).setProduct(str);
                return this;
            }

            public Builder clearProduct() {
                copyOnWrite();
                ((TransactionData) this.instance).clearProduct();
                return this;
            }

            public Builder setProductBytes(ByteString byteString) {
                copyOnWrite();
                ((TransactionData) this.instance).setProductBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
            public String getTransaction() {
                return ((TransactionData) this.instance).getTransaction();
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
            public ByteString getTransactionBytes() {
                return ((TransactionData) this.instance).getTransactionBytes();
            }

            public Builder setTransaction(String str) {
                copyOnWrite();
                ((TransactionData) this.instance).setTransaction(str);
                return this;
            }

            public Builder clearTransaction() {
                copyOnWrite();
                ((TransactionData) this.instance).clearTransaction();
                return this;
            }

            public Builder setTransactionBytes(ByteString byteString) {
                copyOnWrite();
                ((TransactionData) this.instance).setTransactionBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
            @Deprecated
            public boolean hasReceipt() {
                return ((TransactionData) this.instance).hasReceipt();
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
            @Deprecated
            public String getReceipt() {
                return ((TransactionData) this.instance).getReceipt();
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
            @Deprecated
            public ByteString getReceiptBytes() {
                return ((TransactionData) this.instance).getReceiptBytes();
            }

            @Deprecated
            public Builder setReceipt(String str) {
                copyOnWrite();
                ((TransactionData) this.instance).setReceipt(str);
                return this;
            }

            @Deprecated
            public Builder clearReceipt() {
                copyOnWrite();
                ((TransactionData) this.instance).clearReceipt();
                return this;
            }

            @Deprecated
            public Builder setReceiptBytes(ByteString byteString) {
                copyOnWrite();
                ((TransactionData) this.instance).setReceiptBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
            public int getTransactionStateValue() {
                return ((TransactionData) this.instance).getTransactionStateValue();
            }

            public Builder setTransactionStateValue(int i) {
                copyOnWrite();
                ((TransactionData) this.instance).setTransactionStateValue(i);
                return this;
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
            public TransactionState getTransactionState() {
                return ((TransactionData) this.instance).getTransactionState();
            }

            public Builder setTransactionState(TransactionState transactionState) {
                copyOnWrite();
                ((TransactionData) this.instance).setTransactionState(transactionState);
                return this;
            }

            public Builder clearTransactionState() {
                copyOnWrite();
                ((TransactionData) this.instance).clearTransactionState();
                return this;
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
            public boolean hasJwsRepresentation() {
                return ((TransactionData) this.instance).hasJwsRepresentation();
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
            public String getJwsRepresentation() {
                return ((TransactionData) this.instance).getJwsRepresentation();
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
            public ByteString getJwsRepresentationBytes() {
                return ((TransactionData) this.instance).getJwsRepresentationBytes();
            }

            public Builder setJwsRepresentation(String str) {
                copyOnWrite();
                ((TransactionData) this.instance).setJwsRepresentation(str);
                return this;
            }

            public Builder clearJwsRepresentation() {
                copyOnWrite();
                ((TransactionData) this.instance).clearJwsRepresentation();
                return this;
            }

            public Builder setJwsRepresentationBytes(ByteString byteString) {
                copyOnWrite();
                ((TransactionData) this.instance).setJwsRepresentationBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
            public boolean hasSignature() {
                return ((TransactionData) this.instance).hasSignature();
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
            public String getSignature() {
                return ((TransactionData) this.instance).getSignature();
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
            public ByteString getSignatureBytes() {
                return ((TransactionData) this.instance).getSignatureBytes();
            }

            public Builder setSignature(String str) {
                copyOnWrite();
                ((TransactionData) this.instance).setSignature(str);
                return this;
            }

            public Builder clearSignature() {
                copyOnWrite();
                ((TransactionData) this.instance).clearSignature();
                return this;
            }

            public Builder setSignatureBytes(ByteString byteString) {
                copyOnWrite();
                ((TransactionData) this.instance).setSignatureBytes(byteString);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new TransactionData();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003\n\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007ለ\u0001\b\f\tለ\u0002\nለ\u0003", new Object[]{"bitField0_", "timestamp_", "productId_", "eventId_", "transactionId_", "product_", "transaction_", "receipt_", "transactionState_", "jwsRepresentation_", "signature_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<TransactionData> parser = PARSER;
                    if (parser == null) {
                        synchronized (TransactionData.class) {
                            try {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
                            } finally {
                            }
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            TransactionData transactionData = new TransactionData();
            DEFAULT_INSTANCE = transactionData;
            GeneratedMessageLite.registerDefaultInstance(TransactionData.class, transactionData);
        }

        public static TransactionData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<TransactionData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* renamed from: gatewayprotocol.v1.TransactionEventRequestOuterClass$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class TransactionEventRequest extends GeneratedMessageLite<TransactionEventRequest, Builder> implements TransactionEventRequestOrBuilder {
        public static final int APP_STORE_FIELD_NUMBER = 3;
        public static final int CUSTOM_STORE_FIELD_NUMBER = 4;
        private static final TransactionEventRequest DEFAULT_INSTANCE;
        public static final int DYNAMIC_DEVICE_INFO_FIELD_NUMBER = 2;
        public static final int GOOGLE_PLAY_BILLING_LIBRARY_VERSION_FIELD_NUMBER = 8;
        public static final int ORIGIN_FIELD_NUMBER = 6;
        private static volatile Parser<TransactionEventRequest> PARSER = null;
        public static final int RECEIPT_FIELD_NUMBER = 9;
        public static final int STATIC_DEVICE_INFO_FIELD_NUMBER = 1;
        public static final int STORE_KIT_VERSION_FIELD_NUMBER = 7;
        public static final int TRANSACTION_DATA_FIELD_NUMBER = 5;
        private int appStore_;
        private int bitField0_;
        private DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo_;
        private int origin_;
        private StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo_;
        private int storeKitVersion_;
        private String customStore_ = "";
        private Internal.ProtobufList<TransactionData> transactionData_ = GeneratedMessageLite.emptyProtobufList();
        private String googlePlayBillingLibraryVersion_ = "";
        private ByteString receipt_ = ByteString.EMPTY;

        private TransactionEventRequest() {
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
        public boolean hasStaticDeviceInfo() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
        public StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = this.staticDeviceInfo_;
            return staticDeviceInfo == null ? StaticDeviceInfoOuterClass.StaticDeviceInfo.getDefaultInstance() : staticDeviceInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.getClass();
            this.staticDeviceInfo_ = staticDeviceInfo;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.getClass();
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo2 = this.staticDeviceInfo_;
            if (staticDeviceInfo2 != null && staticDeviceInfo2 != StaticDeviceInfoOuterClass.StaticDeviceInfo.getDefaultInstance()) {
                this.staticDeviceInfo_ = StaticDeviceInfoOuterClass.StaticDeviceInfo.newBuilder(this.staticDeviceInfo_).mergeFrom((StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder) staticDeviceInfo).buildPartial();
            } else {
                this.staticDeviceInfo_ = staticDeviceInfo;
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStaticDeviceInfo() {
            this.staticDeviceInfo_ = null;
            this.bitField0_ &= -2;
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
        public boolean hasDynamicDeviceInfo() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
        public DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this.dynamicDeviceInfo_;
            return dynamicDeviceInfo == null ? DynamicDeviceInfoOuterClass.DynamicDeviceInfo.getDefaultInstance() : dynamicDeviceInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.getClass();
            this.dynamicDeviceInfo_ = dynamicDeviceInfo;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.getClass();
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo2 = this.dynamicDeviceInfo_;
            if (dynamicDeviceInfo2 != null && dynamicDeviceInfo2 != DynamicDeviceInfoOuterClass.DynamicDeviceInfo.getDefaultInstance()) {
                this.dynamicDeviceInfo_ = DynamicDeviceInfoOuterClass.DynamicDeviceInfo.newBuilder(this.dynamicDeviceInfo_).mergeFrom((DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder) dynamicDeviceInfo).buildPartial();
            } else {
                this.dynamicDeviceInfo_ = dynamicDeviceInfo;
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDynamicDeviceInfo() {
            this.dynamicDeviceInfo_ = null;
            this.bitField0_ &= -3;
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
        public int getAppStoreValue() {
            return this.appStore_;
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
        public StoreType getAppStore() {
            StoreType forNumber = StoreType.forNumber(this.appStore_);
            return forNumber == null ? StoreType.UNRECOGNIZED : forNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppStoreValue(int i) {
            this.appStore_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppStore(StoreType storeType) {
            this.appStore_ = storeType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppStore() {
            this.appStore_ = 0;
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
        public String getCustomStore() {
            return this.customStore_;
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
        public ByteString getCustomStoreBytes() {
            return ByteString.copyFromUtf8(this.customStore_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCustomStore(String str) {
            str.getClass();
            this.customStore_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCustomStore() {
            this.customStore_ = getDefaultInstance().getCustomStore();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCustomStoreBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.customStore_ = byteString.toStringUtf8();
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
        public List<TransactionData> getTransactionDataList() {
            return this.transactionData_;
        }

        public List<? extends TransactionDataOrBuilder> getTransactionDataOrBuilderList() {
            return this.transactionData_;
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
        public int getTransactionDataCount() {
            return this.transactionData_.size();
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
        public TransactionData getTransactionData(int i) {
            return this.transactionData_.get(i);
        }

        public TransactionDataOrBuilder getTransactionDataOrBuilder(int i) {
            return this.transactionData_.get(i);
        }

        private void ensureTransactionDataIsMutable() {
            Internal.ProtobufList<TransactionData> protobufList = this.transactionData_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.transactionData_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTransactionData(int i, TransactionData transactionData) {
            transactionData.getClass();
            ensureTransactionDataIsMutable();
            this.transactionData_.set(i, transactionData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTransactionData(TransactionData transactionData) {
            transactionData.getClass();
            ensureTransactionDataIsMutable();
            this.transactionData_.add(transactionData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTransactionData(int i, TransactionData transactionData) {
            transactionData.getClass();
            ensureTransactionDataIsMutable();
            this.transactionData_.add(i, transactionData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllTransactionData(Iterable<? extends TransactionData> iterable) {
            ensureTransactionDataIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.transactionData_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTransactionData() {
            this.transactionData_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeTransactionData(int i) {
            ensureTransactionDataIsMutable();
            this.transactionData_.remove(i);
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
        public int getOriginValue() {
            return this.origin_;
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
        public TransactionOrigin getOrigin() {
            TransactionOrigin forNumber = TransactionOrigin.forNumber(this.origin_);
            return forNumber == null ? TransactionOrigin.UNRECOGNIZED : forNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOriginValue(int i) {
            this.origin_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOrigin(TransactionOrigin transactionOrigin) {
            this.origin_ = transactionOrigin.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOrigin() {
            this.origin_ = 0;
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
        public int getStoreKitVersionValue() {
            return this.storeKitVersion_;
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
        public StoreKitVersion getStoreKitVersion() {
            StoreKitVersion forNumber = StoreKitVersion.forNumber(this.storeKitVersion_);
            return forNumber == null ? StoreKitVersion.UNRECOGNIZED : forNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStoreKitVersionValue(int i) {
            this.storeKitVersion_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStoreKitVersion(StoreKitVersion storeKitVersion) {
            this.storeKitVersion_ = storeKitVersion.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStoreKitVersion() {
            this.storeKitVersion_ = 0;
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
        public String getGooglePlayBillingLibraryVersion() {
            return this.googlePlayBillingLibraryVersion_;
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
        public ByteString getGooglePlayBillingLibraryVersionBytes() {
            return ByteString.copyFromUtf8(this.googlePlayBillingLibraryVersion_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGooglePlayBillingLibraryVersion(String str) {
            str.getClass();
            this.googlePlayBillingLibraryVersion_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGooglePlayBillingLibraryVersion() {
            this.googlePlayBillingLibraryVersion_ = getDefaultInstance().getGooglePlayBillingLibraryVersion();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGooglePlayBillingLibraryVersionBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.googlePlayBillingLibraryVersion_ = byteString.toStringUtf8();
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
        public boolean hasReceipt() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
        public ByteString getReceipt() {
            return this.receipt_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReceipt(ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 4;
            this.receipt_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReceipt() {
            this.bitField0_ &= -5;
            this.receipt_ = getDefaultInstance().getReceipt();
        }

        public static TransactionEventRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TransactionEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static TransactionEventRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TransactionEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static TransactionEventRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TransactionEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TransactionEventRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TransactionEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static TransactionEventRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TransactionEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TransactionEventRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TransactionEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static TransactionEventRequest parseFrom(InputStream inputStream) throws IOException {
            return (TransactionEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TransactionEventRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TransactionEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static TransactionEventRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TransactionEventRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TransactionEventRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TransactionEventRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static TransactionEventRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (TransactionEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static TransactionEventRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TransactionEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(TransactionEventRequest transactionEventRequest) {
            return DEFAULT_INSTANCE.createBuilder(transactionEventRequest);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<TransactionEventRequest, Builder> implements TransactionEventRequestOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(TransactionEventRequest.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
            public boolean hasStaticDeviceInfo() {
                return ((TransactionEventRequest) this.instance).hasStaticDeviceInfo();
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
            public StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
                return ((TransactionEventRequest) this.instance).getStaticDeviceInfo();
            }

            public Builder setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
                copyOnWrite();
                ((TransactionEventRequest) this.instance).setStaticDeviceInfo(staticDeviceInfo);
                return this;
            }

            public Builder setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder) {
                copyOnWrite();
                ((TransactionEventRequest) this.instance).setStaticDeviceInfo(builder.build());
                return this;
            }

            public Builder mergeStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
                copyOnWrite();
                ((TransactionEventRequest) this.instance).mergeStaticDeviceInfo(staticDeviceInfo);
                return this;
            }

            public Builder clearStaticDeviceInfo() {
                copyOnWrite();
                ((TransactionEventRequest) this.instance).clearStaticDeviceInfo();
                return this;
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
            public boolean hasDynamicDeviceInfo() {
                return ((TransactionEventRequest) this.instance).hasDynamicDeviceInfo();
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
            public DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
                return ((TransactionEventRequest) this.instance).getDynamicDeviceInfo();
            }

            public Builder setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
                copyOnWrite();
                ((TransactionEventRequest) this.instance).setDynamicDeviceInfo(dynamicDeviceInfo);
                return this;
            }

            public Builder setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builder) {
                copyOnWrite();
                ((TransactionEventRequest) this.instance).setDynamicDeviceInfo(builder.build());
                return this;
            }

            public Builder mergeDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
                copyOnWrite();
                ((TransactionEventRequest) this.instance).mergeDynamicDeviceInfo(dynamicDeviceInfo);
                return this;
            }

            public Builder clearDynamicDeviceInfo() {
                copyOnWrite();
                ((TransactionEventRequest) this.instance).clearDynamicDeviceInfo();
                return this;
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
            public int getAppStoreValue() {
                return ((TransactionEventRequest) this.instance).getAppStoreValue();
            }

            public Builder setAppStoreValue(int i) {
                copyOnWrite();
                ((TransactionEventRequest) this.instance).setAppStoreValue(i);
                return this;
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
            public StoreType getAppStore() {
                return ((TransactionEventRequest) this.instance).getAppStore();
            }

            public Builder setAppStore(StoreType storeType) {
                copyOnWrite();
                ((TransactionEventRequest) this.instance).setAppStore(storeType);
                return this;
            }

            public Builder clearAppStore() {
                copyOnWrite();
                ((TransactionEventRequest) this.instance).clearAppStore();
                return this;
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
            public String getCustomStore() {
                return ((TransactionEventRequest) this.instance).getCustomStore();
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
            public ByteString getCustomStoreBytes() {
                return ((TransactionEventRequest) this.instance).getCustomStoreBytes();
            }

            public Builder setCustomStore(String str) {
                copyOnWrite();
                ((TransactionEventRequest) this.instance).setCustomStore(str);
                return this;
            }

            public Builder clearCustomStore() {
                copyOnWrite();
                ((TransactionEventRequest) this.instance).clearCustomStore();
                return this;
            }

            public Builder setCustomStoreBytes(ByteString byteString) {
                copyOnWrite();
                ((TransactionEventRequest) this.instance).setCustomStoreBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
            public List<TransactionData> getTransactionDataList() {
                return Collections.unmodifiableList(((TransactionEventRequest) this.instance).getTransactionDataList());
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
            public int getTransactionDataCount() {
                return ((TransactionEventRequest) this.instance).getTransactionDataCount();
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
            public TransactionData getTransactionData(int i) {
                return ((TransactionEventRequest) this.instance).getTransactionData(i);
            }

            public Builder setTransactionData(int i, TransactionData transactionData) {
                copyOnWrite();
                ((TransactionEventRequest) this.instance).setTransactionData(i, transactionData);
                return this;
            }

            public Builder setTransactionData(int i, TransactionData.Builder builder) {
                copyOnWrite();
                ((TransactionEventRequest) this.instance).setTransactionData(i, builder.build());
                return this;
            }

            public Builder addTransactionData(TransactionData transactionData) {
                copyOnWrite();
                ((TransactionEventRequest) this.instance).addTransactionData(transactionData);
                return this;
            }

            public Builder addTransactionData(int i, TransactionData transactionData) {
                copyOnWrite();
                ((TransactionEventRequest) this.instance).addTransactionData(i, transactionData);
                return this;
            }

            public Builder addTransactionData(TransactionData.Builder builder) {
                copyOnWrite();
                ((TransactionEventRequest) this.instance).addTransactionData(builder.build());
                return this;
            }

            public Builder addTransactionData(int i, TransactionData.Builder builder) {
                copyOnWrite();
                ((TransactionEventRequest) this.instance).addTransactionData(i, builder.build());
                return this;
            }

            public Builder addAllTransactionData(Iterable<? extends TransactionData> iterable) {
                copyOnWrite();
                ((TransactionEventRequest) this.instance).addAllTransactionData(iterable);
                return this;
            }

            public Builder clearTransactionData() {
                copyOnWrite();
                ((TransactionEventRequest) this.instance).clearTransactionData();
                return this;
            }

            public Builder removeTransactionData(int i) {
                copyOnWrite();
                ((TransactionEventRequest) this.instance).removeTransactionData(i);
                return this;
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
            public int getOriginValue() {
                return ((TransactionEventRequest) this.instance).getOriginValue();
            }

            public Builder setOriginValue(int i) {
                copyOnWrite();
                ((TransactionEventRequest) this.instance).setOriginValue(i);
                return this;
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
            public TransactionOrigin getOrigin() {
                return ((TransactionEventRequest) this.instance).getOrigin();
            }

            public Builder setOrigin(TransactionOrigin transactionOrigin) {
                copyOnWrite();
                ((TransactionEventRequest) this.instance).setOrigin(transactionOrigin);
                return this;
            }

            public Builder clearOrigin() {
                copyOnWrite();
                ((TransactionEventRequest) this.instance).clearOrigin();
                return this;
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
            public int getStoreKitVersionValue() {
                return ((TransactionEventRequest) this.instance).getStoreKitVersionValue();
            }

            public Builder setStoreKitVersionValue(int i) {
                copyOnWrite();
                ((TransactionEventRequest) this.instance).setStoreKitVersionValue(i);
                return this;
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
            public StoreKitVersion getStoreKitVersion() {
                return ((TransactionEventRequest) this.instance).getStoreKitVersion();
            }

            public Builder setStoreKitVersion(StoreKitVersion storeKitVersion) {
                copyOnWrite();
                ((TransactionEventRequest) this.instance).setStoreKitVersion(storeKitVersion);
                return this;
            }

            public Builder clearStoreKitVersion() {
                copyOnWrite();
                ((TransactionEventRequest) this.instance).clearStoreKitVersion();
                return this;
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
            public String getGooglePlayBillingLibraryVersion() {
                return ((TransactionEventRequest) this.instance).getGooglePlayBillingLibraryVersion();
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
            public ByteString getGooglePlayBillingLibraryVersionBytes() {
                return ((TransactionEventRequest) this.instance).getGooglePlayBillingLibraryVersionBytes();
            }

            public Builder setGooglePlayBillingLibraryVersion(String str) {
                copyOnWrite();
                ((TransactionEventRequest) this.instance).setGooglePlayBillingLibraryVersion(str);
                return this;
            }

            public Builder clearGooglePlayBillingLibraryVersion() {
                copyOnWrite();
                ((TransactionEventRequest) this.instance).clearGooglePlayBillingLibraryVersion();
                return this;
            }

            public Builder setGooglePlayBillingLibraryVersionBytes(ByteString byteString) {
                copyOnWrite();
                ((TransactionEventRequest) this.instance).setGooglePlayBillingLibraryVersionBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
            public boolean hasReceipt() {
                return ((TransactionEventRequest) this.instance).hasReceipt();
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
            public ByteString getReceipt() {
                return ((TransactionEventRequest) this.instance).getReceipt();
            }

            public Builder setReceipt(ByteString byteString) {
                copyOnWrite();
                ((TransactionEventRequest) this.instance).setReceipt(byteString);
                return this;
            }

            public Builder clearReceipt() {
                copyOnWrite();
                ((TransactionEventRequest) this.instance).clearReceipt();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new TransactionEventRequest();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f\u0004Ȉ\u0005\u001b\u0006\f\u0007\f\bȈ\tည\u0002", new Object[]{"bitField0_", "staticDeviceInfo_", "dynamicDeviceInfo_", "appStore_", "customStore_", "transactionData_", TransactionData.class, "origin_", "storeKitVersion_", "googlePlayBillingLibraryVersion_", "receipt_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<TransactionEventRequest> parser = PARSER;
                    if (parser == null) {
                        synchronized (TransactionEventRequest.class) {
                            try {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
                            } finally {
                            }
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            TransactionEventRequest transactionEventRequest = new TransactionEventRequest();
            DEFAULT_INSTANCE = transactionEventRequest;
            GeneratedMessageLite.registerDefaultInstance(TransactionEventRequest.class, transactionEventRequest);
        }

        public static TransactionEventRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<TransactionEventRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }
}
