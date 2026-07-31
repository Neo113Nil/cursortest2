package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public final class AudienceManagementRequestOuterClass {

    public interface AudienceManagementRequestOrBuilder extends MessageLiteOrBuilder {
        ByteString getAudienceManagementData();

        DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo();

        SessionCountersOuterClass.SessionCounters getSessionCounters();

        StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo();

        boolean hasDynamicDeviceInfo();

        boolean hasSessionCounters();

        boolean hasStaticDeviceInfo();
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    private AudienceManagementRequestOuterClass() {
    }

    public static final class AudienceManagementRequest extends GeneratedMessageLite<AudienceManagementRequest, Builder> implements AudienceManagementRequestOrBuilder {
        public static final int AUDIENCE_MANAGEMENT_DATA_FIELD_NUMBER = 4;
        private static final AudienceManagementRequest DEFAULT_INSTANCE;
        public static final int DYNAMIC_DEVICE_INFO_FIELD_NUMBER = 3;
        private static volatile Parser<AudienceManagementRequest> PARSER = null;
        public static final int SESSION_COUNTERS_FIELD_NUMBER = 1;
        public static final int STATIC_DEVICE_INFO_FIELD_NUMBER = 2;
        private ByteString audienceManagementData_ = ByteString.EMPTY;
        private int bitField0_;
        private DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo_;
        private SessionCountersOuterClass.SessionCounters sessionCounters_;
        private StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo_;

        private AudienceManagementRequest() {
        }

        @Override // gatewayprotocol.v1.AudienceManagementRequestOuterClass.AudienceManagementRequestOrBuilder
        public boolean hasSessionCounters() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // gatewayprotocol.v1.AudienceManagementRequestOuterClass.AudienceManagementRequestOrBuilder
        public SessionCountersOuterClass.SessionCounters getSessionCounters() {
            SessionCountersOuterClass.SessionCounters sessionCounters = this.sessionCounters_;
            return sessionCounters == null ? SessionCountersOuterClass.SessionCounters.getDefaultInstance() : sessionCounters;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters) {
            sessionCounters.getClass();
            this.sessionCounters_ = sessionCounters;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters) {
            sessionCounters.getClass();
            SessionCountersOuterClass.SessionCounters sessionCounters2 = this.sessionCounters_;
            if (sessionCounters2 != null && sessionCounters2 != SessionCountersOuterClass.SessionCounters.getDefaultInstance()) {
                this.sessionCounters_ = SessionCountersOuterClass.SessionCounters.newBuilder(this.sessionCounters_).mergeFrom((SessionCountersOuterClass.SessionCounters.Builder) sessionCounters).buildPartial();
            } else {
                this.sessionCounters_ = sessionCounters;
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionCounters() {
            this.sessionCounters_ = null;
            this.bitField0_ &= -2;
        }

        @Override // gatewayprotocol.v1.AudienceManagementRequestOuterClass.AudienceManagementRequestOrBuilder
        public boolean hasStaticDeviceInfo() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // gatewayprotocol.v1.AudienceManagementRequestOuterClass.AudienceManagementRequestOrBuilder
        public StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = this.staticDeviceInfo_;
            return staticDeviceInfo == null ? StaticDeviceInfoOuterClass.StaticDeviceInfo.getDefaultInstance() : staticDeviceInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.getClass();
            this.staticDeviceInfo_ = staticDeviceInfo;
            this.bitField0_ |= 2;
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
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStaticDeviceInfo() {
            this.staticDeviceInfo_ = null;
            this.bitField0_ &= -3;
        }

        @Override // gatewayprotocol.v1.AudienceManagementRequestOuterClass.AudienceManagementRequestOrBuilder
        public boolean hasDynamicDeviceInfo() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // gatewayprotocol.v1.AudienceManagementRequestOuterClass.AudienceManagementRequestOrBuilder
        public DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this.dynamicDeviceInfo_;
            return dynamicDeviceInfo == null ? DynamicDeviceInfoOuterClass.DynamicDeviceInfo.getDefaultInstance() : dynamicDeviceInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.getClass();
            this.dynamicDeviceInfo_ = dynamicDeviceInfo;
            this.bitField0_ |= 4;
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
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDynamicDeviceInfo() {
            this.dynamicDeviceInfo_ = null;
            this.bitField0_ &= -5;
        }

        @Override // gatewayprotocol.v1.AudienceManagementRequestOuterClass.AudienceManagementRequestOrBuilder
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

        public static AudienceManagementRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AudienceManagementRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static AudienceManagementRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AudienceManagementRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static AudienceManagementRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AudienceManagementRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AudienceManagementRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AudienceManagementRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AudienceManagementRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AudienceManagementRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AudienceManagementRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AudienceManagementRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AudienceManagementRequest parseFrom(InputStream inputStream) throws IOException {
            return (AudienceManagementRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AudienceManagementRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AudienceManagementRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AudienceManagementRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AudienceManagementRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AudienceManagementRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AudienceManagementRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AudienceManagementRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AudienceManagementRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AudienceManagementRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AudienceManagementRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(AudienceManagementRequest audienceManagementRequest) {
            return DEFAULT_INSTANCE.createBuilder(audienceManagementRequest);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<AudienceManagementRequest, Builder> implements AudienceManagementRequestOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(AudienceManagementRequest.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.AudienceManagementRequestOuterClass.AudienceManagementRequestOrBuilder
            public boolean hasSessionCounters() {
                return ((AudienceManagementRequest) this.instance).hasSessionCounters();
            }

            @Override // gatewayprotocol.v1.AudienceManagementRequestOuterClass.AudienceManagementRequestOrBuilder
            public SessionCountersOuterClass.SessionCounters getSessionCounters() {
                return ((AudienceManagementRequest) this.instance).getSessionCounters();
            }

            public Builder setSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters) {
                copyOnWrite();
                ((AudienceManagementRequest) this.instance).setSessionCounters(sessionCounters);
                return this;
            }

            public Builder setSessionCounters(SessionCountersOuterClass.SessionCounters.Builder builder) {
                copyOnWrite();
                ((AudienceManagementRequest) this.instance).setSessionCounters(builder.build());
                return this;
            }

            public Builder mergeSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters) {
                copyOnWrite();
                ((AudienceManagementRequest) this.instance).mergeSessionCounters(sessionCounters);
                return this;
            }

            public Builder clearSessionCounters() {
                copyOnWrite();
                ((AudienceManagementRequest) this.instance).clearSessionCounters();
                return this;
            }

            @Override // gatewayprotocol.v1.AudienceManagementRequestOuterClass.AudienceManagementRequestOrBuilder
            public boolean hasStaticDeviceInfo() {
                return ((AudienceManagementRequest) this.instance).hasStaticDeviceInfo();
            }

            @Override // gatewayprotocol.v1.AudienceManagementRequestOuterClass.AudienceManagementRequestOrBuilder
            public StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
                return ((AudienceManagementRequest) this.instance).getStaticDeviceInfo();
            }

            public Builder setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
                copyOnWrite();
                ((AudienceManagementRequest) this.instance).setStaticDeviceInfo(staticDeviceInfo);
                return this;
            }

            public Builder setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder) {
                copyOnWrite();
                ((AudienceManagementRequest) this.instance).setStaticDeviceInfo(builder.build());
                return this;
            }

            public Builder mergeStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
                copyOnWrite();
                ((AudienceManagementRequest) this.instance).mergeStaticDeviceInfo(staticDeviceInfo);
                return this;
            }

            public Builder clearStaticDeviceInfo() {
                copyOnWrite();
                ((AudienceManagementRequest) this.instance).clearStaticDeviceInfo();
                return this;
            }

            @Override // gatewayprotocol.v1.AudienceManagementRequestOuterClass.AudienceManagementRequestOrBuilder
            public boolean hasDynamicDeviceInfo() {
                return ((AudienceManagementRequest) this.instance).hasDynamicDeviceInfo();
            }

            @Override // gatewayprotocol.v1.AudienceManagementRequestOuterClass.AudienceManagementRequestOrBuilder
            public DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
                return ((AudienceManagementRequest) this.instance).getDynamicDeviceInfo();
            }

            public Builder setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
                copyOnWrite();
                ((AudienceManagementRequest) this.instance).setDynamicDeviceInfo(dynamicDeviceInfo);
                return this;
            }

            public Builder setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builder) {
                copyOnWrite();
                ((AudienceManagementRequest) this.instance).setDynamicDeviceInfo(builder.build());
                return this;
            }

            public Builder mergeDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
                copyOnWrite();
                ((AudienceManagementRequest) this.instance).mergeDynamicDeviceInfo(dynamicDeviceInfo);
                return this;
            }

            public Builder clearDynamicDeviceInfo() {
                copyOnWrite();
                ((AudienceManagementRequest) this.instance).clearDynamicDeviceInfo();
                return this;
            }

            @Override // gatewayprotocol.v1.AudienceManagementRequestOuterClass.AudienceManagementRequestOrBuilder
            public ByteString getAudienceManagementData() {
                return ((AudienceManagementRequest) this.instance).getAudienceManagementData();
            }

            public Builder setAudienceManagementData(ByteString byteString) {
                copyOnWrite();
                ((AudienceManagementRequest) this.instance).setAudienceManagementData(byteString);
                return this;
            }

            public Builder clearAudienceManagementData() {
                copyOnWrite();
                ((AudienceManagementRequest) this.instance).clearAudienceManagementData();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new AudienceManagementRequest();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\n", new Object[]{"bitField0_", "sessionCounters_", "staticDeviceInfo_", "dynamicDeviceInfo_", "audienceManagementData_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<AudienceManagementRequest> parser = PARSER;
                    if (parser == null) {
                        synchronized (AudienceManagementRequest.class) {
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
            AudienceManagementRequest audienceManagementRequest = new AudienceManagementRequest();
            DEFAULT_INSTANCE = audienceManagementRequest;
            GeneratedMessageLite.registerDefaultInstance(AudienceManagementRequest.class, audienceManagementRequest);
        }

        public static AudienceManagementRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<AudienceManagementRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* renamed from: gatewayprotocol.v1.AudienceManagementRequestOuterClass$1, reason: invalid class name */
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
