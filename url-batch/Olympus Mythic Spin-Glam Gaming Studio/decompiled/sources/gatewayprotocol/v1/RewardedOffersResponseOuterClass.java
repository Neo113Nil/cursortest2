package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import gatewayprotocol.v1.ErrorOuterClass;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
public final class RewardedOffersResponseOuterClass {

    public interface RewardedOffersResponseOrBuilder extends MessageLiteOrBuilder {
        ErrorOuterClass.Error getError();

        ByteString getRewardedOffers();

        int getRewardedOffersVersion();

        boolean hasError();
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    private RewardedOffersResponseOuterClass() {
    }

    public static final class RewardedOffersResponse extends GeneratedMessageLite<RewardedOffersResponse, Builder> implements RewardedOffersResponseOrBuilder {
        private static final RewardedOffersResponse DEFAULT_INSTANCE;
        public static final int ERROR_FIELD_NUMBER = 3;
        private static volatile Parser<RewardedOffersResponse> PARSER = null;
        public static final int REWARDED_OFFERS_FIELD_NUMBER = 1;
        public static final int REWARDED_OFFERS_VERSION_FIELD_NUMBER = 2;
        private int bitField0_;
        private ErrorOuterClass.Error error_;
        private int rewardedOffersVersion_;
        private ByteString rewardedOffers_ = ByteString.EMPTY;

        private RewardedOffersResponse() {
        }

        @Override // gatewayprotocol.v1.RewardedOffersResponseOuterClass.RewardedOffersResponseOrBuilder
        public ByteString getRewardedOffers() {
            return this.rewardedOffers_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRewardedOffers(ByteString byteString) {
            byteString.getClass();
            this.rewardedOffers_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRewardedOffers() {
            this.rewardedOffers_ = getDefaultInstance().getRewardedOffers();
        }

        @Override // gatewayprotocol.v1.RewardedOffersResponseOuterClass.RewardedOffersResponseOrBuilder
        public int getRewardedOffersVersion() {
            return this.rewardedOffersVersion_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRewardedOffersVersion(int i) {
            this.rewardedOffersVersion_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRewardedOffersVersion() {
            this.rewardedOffersVersion_ = 0;
        }

        @Override // gatewayprotocol.v1.RewardedOffersResponseOuterClass.RewardedOffersResponseOrBuilder
        public boolean hasError() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // gatewayprotocol.v1.RewardedOffersResponseOuterClass.RewardedOffersResponseOrBuilder
        public ErrorOuterClass.Error getError() {
            ErrorOuterClass.Error error = this.error_;
            return error == null ? ErrorOuterClass.Error.getDefaultInstance() : error;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setError(ErrorOuterClass.Error error) {
            error.getClass();
            this.error_ = error;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeError(ErrorOuterClass.Error error) {
            error.getClass();
            ErrorOuterClass.Error error2 = this.error_;
            if (error2 != null && error2 != ErrorOuterClass.Error.getDefaultInstance()) {
                this.error_ = ErrorOuterClass.Error.newBuilder(this.error_).mergeFrom((ErrorOuterClass.Error.Builder) error).buildPartial();
            } else {
                this.error_ = error;
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearError() {
            this.error_ = null;
            this.bitField0_ &= -2;
        }

        public static RewardedOffersResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (RewardedOffersResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static RewardedOffersResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RewardedOffersResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static RewardedOffersResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (RewardedOffersResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static RewardedOffersResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RewardedOffersResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static RewardedOffersResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (RewardedOffersResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RewardedOffersResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RewardedOffersResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static RewardedOffersResponse parseFrom(InputStream inputStream) throws IOException {
            return (RewardedOffersResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RewardedOffersResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RewardedOffersResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RewardedOffersResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (RewardedOffersResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RewardedOffersResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RewardedOffersResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RewardedOffersResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (RewardedOffersResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static RewardedOffersResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RewardedOffersResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(RewardedOffersResponse rewardedOffersResponse) {
            return DEFAULT_INSTANCE.createBuilder(rewardedOffersResponse);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<RewardedOffersResponse, Builder> implements RewardedOffersResponseOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(RewardedOffersResponse.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.RewardedOffersResponseOuterClass.RewardedOffersResponseOrBuilder
            public ByteString getRewardedOffers() {
                return ((RewardedOffersResponse) this.instance).getRewardedOffers();
            }

            public Builder setRewardedOffers(ByteString byteString) {
                copyOnWrite();
                ((RewardedOffersResponse) this.instance).setRewardedOffers(byteString);
                return this;
            }

            public Builder clearRewardedOffers() {
                copyOnWrite();
                ((RewardedOffersResponse) this.instance).clearRewardedOffers();
                return this;
            }

            @Override // gatewayprotocol.v1.RewardedOffersResponseOuterClass.RewardedOffersResponseOrBuilder
            public int getRewardedOffersVersion() {
                return ((RewardedOffersResponse) this.instance).getRewardedOffersVersion();
            }

            public Builder setRewardedOffersVersion(int i) {
                copyOnWrite();
                ((RewardedOffersResponse) this.instance).setRewardedOffersVersion(i);
                return this;
            }

            public Builder clearRewardedOffersVersion() {
                copyOnWrite();
                ((RewardedOffersResponse) this.instance).clearRewardedOffersVersion();
                return this;
            }

            @Override // gatewayprotocol.v1.RewardedOffersResponseOuterClass.RewardedOffersResponseOrBuilder
            public boolean hasError() {
                return ((RewardedOffersResponse) this.instance).hasError();
            }

            @Override // gatewayprotocol.v1.RewardedOffersResponseOuterClass.RewardedOffersResponseOrBuilder
            public ErrorOuterClass.Error getError() {
                return ((RewardedOffersResponse) this.instance).getError();
            }

            public Builder setError(ErrorOuterClass.Error error) {
                copyOnWrite();
                ((RewardedOffersResponse) this.instance).setError(error);
                return this;
            }

            public Builder setError(ErrorOuterClass.Error.Builder builder) {
                copyOnWrite();
                ((RewardedOffersResponse) this.instance).setError(builder.build());
                return this;
            }

            public Builder mergeError(ErrorOuterClass.Error error) {
                copyOnWrite();
                ((RewardedOffersResponse) this.instance).mergeError(error);
                return this;
            }

            public Builder clearError() {
                copyOnWrite();
                ((RewardedOffersResponse) this.instance).clearError();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new RewardedOffersResponse();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002\u0004\u0003ဉ\u0000", new Object[]{"bitField0_", "rewardedOffers_", "rewardedOffersVersion_", "error_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<RewardedOffersResponse> parser = PARSER;
                    if (parser == null) {
                        synchronized (RewardedOffersResponse.class) {
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
            RewardedOffersResponse rewardedOffersResponse = new RewardedOffersResponse();
            DEFAULT_INSTANCE = rewardedOffersResponse;
            GeneratedMessageLite.registerDefaultInstance(RewardedOffersResponse.class, rewardedOffersResponse);
        }

        public static RewardedOffersResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<RewardedOffersResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* renamed from: gatewayprotocol.v1.RewardedOffersResponseOuterClass$1, reason: invalid class name */
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
}
