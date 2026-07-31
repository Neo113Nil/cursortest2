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
public final class AudienceManagementResponseOuterClass {

    public interface AudienceManagementResponseOrBuilder extends MessageLiteOrBuilder {
        ByteString getAudienceManagementData();

        ErrorOuterClass.Error getError();

        boolean hasError();
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    private AudienceManagementResponseOuterClass() {
    }

    public static final class AudienceManagementResponse extends GeneratedMessageLite<AudienceManagementResponse, Builder> implements AudienceManagementResponseOrBuilder {
        public static final int AUDIENCE_MANAGEMENT_DATA_FIELD_NUMBER = 1;
        private static final AudienceManagementResponse DEFAULT_INSTANCE;
        public static final int ERROR_FIELD_NUMBER = 2;
        private static volatile Parser<AudienceManagementResponse> PARSER;
        private ByteString audienceManagementData_ = ByteString.EMPTY;
        private int bitField0_;
        private ErrorOuterClass.Error error_;

        private AudienceManagementResponse() {
        }

        @Override // gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponseOrBuilder
        public ByteString getAudienceManagementData() {
            return this.audienceManagementData_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAudienceManagementData(ByteString byteString) {
            byteString.getClass();
            this.audienceManagementData_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAudienceManagementData() {
            this.audienceManagementData_ = getDefaultInstance().getAudienceManagementData();
        }

        @Override // gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponseOrBuilder
        public boolean hasError() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponseOrBuilder
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

        public static AudienceManagementResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AudienceManagementResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static AudienceManagementResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AudienceManagementResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static AudienceManagementResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AudienceManagementResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AudienceManagementResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AudienceManagementResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AudienceManagementResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AudienceManagementResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AudienceManagementResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AudienceManagementResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AudienceManagementResponse parseFrom(InputStream inputStream) throws IOException {
            return (AudienceManagementResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AudienceManagementResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AudienceManagementResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AudienceManagementResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AudienceManagementResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AudienceManagementResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AudienceManagementResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AudienceManagementResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AudienceManagementResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AudienceManagementResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AudienceManagementResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(AudienceManagementResponse audienceManagementResponse) {
            return DEFAULT_INSTANCE.createBuilder(audienceManagementResponse);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<AudienceManagementResponse, Builder> implements AudienceManagementResponseOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(AudienceManagementResponse.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponseOrBuilder
            public ByteString getAudienceManagementData() {
                return ((AudienceManagementResponse) this.instance).getAudienceManagementData();
            }

            public Builder setAudienceManagementData(ByteString byteString) {
                copyOnWrite();
                ((AudienceManagementResponse) this.instance).setAudienceManagementData(byteString);
                return this;
            }

            public Builder clearAudienceManagementData() {
                copyOnWrite();
                ((AudienceManagementResponse) this.instance).clearAudienceManagementData();
                return this;
            }

            @Override // gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponseOrBuilder
            public boolean hasError() {
                return ((AudienceManagementResponse) this.instance).hasError();
            }

            @Override // gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponseOrBuilder
            public ErrorOuterClass.Error getError() {
                return ((AudienceManagementResponse) this.instance).getError();
            }

            public Builder setError(ErrorOuterClass.Error error) {
                copyOnWrite();
                ((AudienceManagementResponse) this.instance).setError(error);
                return this;
            }

            public Builder setError(ErrorOuterClass.Error.Builder builder) {
                copyOnWrite();
                ((AudienceManagementResponse) this.instance).setError(builder.build());
                return this;
            }

            public Builder mergeError(ErrorOuterClass.Error error) {
                copyOnWrite();
                ((AudienceManagementResponse) this.instance).mergeError(error);
                return this;
            }

            public Builder clearError() {
                copyOnWrite();
                ((AudienceManagementResponse) this.instance).clearError();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new AudienceManagementResponse();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002ဉ\u0000", new Object[]{"bitField0_", "audienceManagementData_", "error_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<AudienceManagementResponse> parser = PARSER;
                    if (parser == null) {
                        synchronized (AudienceManagementResponse.class) {
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
            AudienceManagementResponse audienceManagementResponse = new AudienceManagementResponse();
            DEFAULT_INSTANCE = audienceManagementResponse;
            GeneratedMessageLite.registerDefaultInstance(AudienceManagementResponse.class, audienceManagementResponse);
        }

        public static AudienceManagementResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<AudienceManagementResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* renamed from: gatewayprotocol.v1.AudienceManagementResponseOuterClass$1, reason: invalid class name */
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
