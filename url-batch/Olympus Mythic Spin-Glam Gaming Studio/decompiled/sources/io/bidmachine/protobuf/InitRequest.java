package io.bidmachine.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.AbstractMessageLite;
import com.explorestack.protobuf.AbstractParser;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.CodedInputStream;
import com.explorestack.protobuf.CodedOutputStream;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.ExtensionRegistryLite;
import com.explorestack.protobuf.GeneratedMessageV3;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Parser;
import com.explorestack.protobuf.RepeatedFieldBuilderV3;
import com.explorestack.protobuf.SingleFieldBuilderV3;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.StringValueOrBuilder;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.StructOrBuilder;
import com.explorestack.protobuf.Timestamp;
import com.explorestack.protobuf.TimestampOrBuilder;
import com.explorestack.protobuf.UnknownFieldSet;
import com.explorestack.protobuf.adcom.ConnectionType;
import com.explorestack.protobuf.adcom.Context;
import com.explorestack.protobuf.adcom.ContextOrBuilder;
import com.explorestack.protobuf.adcom.DeviceType;
import com.explorestack.protobuf.adcom.OS;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class InitRequest extends GeneratedMessageV3 implements InitRequestOrBuilder {
    public static final int ANDROID_FIELD_NUMBER = 20;
    public static final int APP_VER_FIELD_NUMBER = 13;
    public static final int BM_IFV_FIELD_NUMBER = 12;
    public static final int BUNDLE_FIELD_NUMBER = 2;
    public static final int CONTEXT_FIELD_NUMBER = 19;
    public static final int CONTYPE_FIELD_NUMBER = 10;
    public static final int DEVICE_TYPE_FIELD_NUMBER = 9;
    public static final int EXT_FIELD_NUMBER = 15;
    public static final int GEO_FIELD_NUMBER = 5;
    public static final int HWV_FIELD_NUMBER = 18;
    public static final int IFA_FIELD_NUMBER = 8;
    public static final int IFV_FIELD_NUMBER = 11;
    public static final int IOS_FIELD_NUMBER = 21;
    public static final int MAKE_FIELD_NUMBER = 16;
    public static final int MODEL_FIELD_NUMBER = 17;
    public static final int OSV_FIELD_NUMBER = 4;
    public static final int OS_FIELD_NUMBER = 3;
    public static final int SDKVER_FIELD_NUMBER = 7;
    public static final int SDK_FIELD_NUMBER = 6;
    public static final int SELLER_ID_FIELD_NUMBER = 1;
    public static final int SESSION_ID_FIELD_NUMBER = 14;
    private static final long serialVersionUID = 0;
    private volatile Object appVer_;
    private volatile Object bmIfv_;
    private volatile Object bundle_;
    private Context context_;
    private int contype_;
    private int deviceType_;
    private Struct ext_;
    private Context.Geo geo_;
    private volatile Object hwv_;
    private volatile Object ifa_;
    private volatile Object ifv_;
    private volatile Object make_;
    private byte memoizedIsInitialized;
    private volatile Object model_;
    private int os_;
    private volatile Object osv_;
    private int platformDataCase_;
    private Object platformData_;
    private volatile Object sdk_;
    private volatile Object sdkver_;
    private volatile Object sellerId_;
    private volatile Object sessionId_;
    private static final InitRequest DEFAULT_INSTANCE = new InitRequest();
    private static final Parser PARSER = new AbstractParser() { // from class: io.bidmachine.protobuf.InitRequest.1
        @Override // com.explorestack.protobuf.Parser
        public InitRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new InitRequest(codedInputStream, extensionRegistryLite);
        }
    };

    public interface AndroidPlatformDataOrBuilder extends MessageOrBuilder {
        AndroidPlatformData.ContentProviderStartupMetrics getContentProviderStartupMetrics(int i);

        int getContentProviderStartupMetricsCount();

        List<AndroidPlatformData.ContentProviderStartupMetrics> getContentProviderStartupMetricsList();

        AndroidPlatformData.ContentProviderStartupMetricsOrBuilder getContentProviderStartupMetricsOrBuilder(int i);

        List<? extends AndroidPlatformData.ContentProviderStartupMetricsOrBuilder> getContentProviderStartupMetricsOrBuilderList();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo3244getDefaultInstanceForType();

        String getKotlinVersion();

        ByteString getKotlinVersionBytes();

        int getMinApiLevel();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public interface iOSPlatformDataOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo3244getDefaultInstanceForType();

        StringValue getMinOsVersion();

        StringValueOrBuilder getMinOsVersionOrBuilder();

        OSExecutionEnvironment getOsExecutionEnv();

        int getOsExecutionEnvValue();

        boolean hasMinOsVersion();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    private InitRequest(GeneratedMessageV3.Builder builder) {
        super(builder);
        this.platformDataCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    private InitRequest() {
        this.platformDataCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
        this.sellerId_ = "";
        this.bundle_ = "";
        this.os_ = 0;
        this.osv_ = "";
        this.sdk_ = "";
        this.sdkver_ = "";
        this.ifa_ = "";
        this.ifv_ = "";
        this.bmIfv_ = "";
        this.deviceType_ = 0;
        this.contype_ = 0;
        this.appVer_ = "";
        this.sessionId_ = "";
        this.make_ = "";
        this.model_ = "";
        this.hwv_ = "";
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new InitRequest();
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private InitRequest(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        extensionRegistryLite.getClass();
        UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int readTag = codedInputStream.readTag();
                    switch (readTag) {
                        case 0:
                            z = true;
                        case 10:
                            this.sellerId_ = codedInputStream.readStringRequireUtf8();
                        case 18:
                            this.bundle_ = codedInputStream.readStringRequireUtf8();
                        case 24:
                            this.os_ = codedInputStream.readEnum();
                        case 34:
                            this.osv_ = codedInputStream.readStringRequireUtf8();
                        case 42:
                            Context.Geo geo = this.geo_;
                            Context.Geo.Builder builder = geo != null ? geo.toBuilder() : null;
                            Context.Geo geo2 = (Context.Geo) codedInputStream.readMessage(Context.Geo.parser(), extensionRegistryLite);
                            this.geo_ = geo2;
                            if (builder != null) {
                                builder.mergeFrom(geo2);
                                this.geo_ = builder.buildPartial();
                            }
                        case 50:
                            this.sdk_ = codedInputStream.readStringRequireUtf8();
                        case 58:
                            this.sdkver_ = codedInputStream.readStringRequireUtf8();
                        case 66:
                            this.ifa_ = codedInputStream.readStringRequireUtf8();
                        case TokenParametersOuterClass$TokenParameters.MEDIAMUTED_FIELD_NUMBER /* 72 */:
                            this.deviceType_ = codedInputStream.readEnum();
                        case 80:
                            this.contype_ = codedInputStream.readEnum();
                        case 90:
                            this.ifv_ = codedInputStream.readStringRequireUtf8();
                        case 98:
                            this.bmIfv_ = codedInputStream.readStringRequireUtf8();
                        case 106:
                            this.appVer_ = codedInputStream.readStringRequireUtf8();
                        case 114:
                            this.sessionId_ = codedInputStream.readStringRequireUtf8();
                        case INVALID_ADS_ENDPOINT_VALUE:
                            Struct struct = this.ext_;
                            Struct.Builder builder2 = struct != null ? struct.toBuilder() : null;
                            Struct struct2 = (Struct) codedInputStream.readMessage(Struct.parser(), extensionRegistryLite);
                            this.ext_ = struct2;
                            if (builder2 != null) {
                                builder2.mergeFrom(struct2);
                                this.ext_ = builder2.buildPartial();
                            }
                        case 130:
                            this.make_ = codedInputStream.readStringRequireUtf8();
                        case 138:
                            this.model_ = codedInputStream.readStringRequireUtf8();
                        case 146:
                            this.hwv_ = codedInputStream.readStringRequireUtf8();
                        case 154:
                            Context context = this.context_;
                            Context.Builder builder3 = context != null ? context.toBuilder() : null;
                            Context context2 = (Context) codedInputStream.readMessage(Context.parser(), extensionRegistryLite);
                            this.context_ = context2;
                            if (builder3 != null) {
                                builder3.mergeFrom(context2);
                                this.context_ = builder3.buildPartial();
                            }
                        case 162:
                            AndroidPlatformData.Builder builder4 = this.platformDataCase_ == 20 ? ((AndroidPlatformData) this.platformData_).toBuilder() : null;
                            MessageLite readMessage = codedInputStream.readMessage(AndroidPlatformData.parser(), extensionRegistryLite);
                            this.platformData_ = readMessage;
                            if (builder4 != null) {
                                builder4.mergeFrom((AndroidPlatformData) readMessage);
                                this.platformData_ = builder4.buildPartial();
                            }
                            this.platformDataCase_ = 20;
                        case 170:
                            iOSPlatformData.Builder builder5 = this.platformDataCase_ == 21 ? ((iOSPlatformData) this.platformData_).toBuilder() : null;
                            MessageLite readMessage2 = codedInputStream.readMessage(iOSPlatformData.parser(), extensionRegistryLite);
                            this.platformData_ = readMessage2;
                            if (builder5 != null) {
                                builder5.mergeFrom((iOSPlatformData) readMessage2);
                                this.platformData_ = builder5.buildPartial();
                            }
                            this.platformDataCase_ = 21;
                        default:
                            if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                z = true;
                            }
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                }
            } catch (Throwable th) {
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        this.unknownFields = newBuilder.build();
        makeExtensionsImmutable();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return InitProto.internal_static_bidmachine_protobuf_InitRequest_descriptor;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return InitProto.internal_static_bidmachine_protobuf_InitRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(InitRequest.class, Builder.class);
    }

    public static final class AndroidPlatformData extends GeneratedMessageV3 implements AndroidPlatformDataOrBuilder {
        public static final int CONTENT_PROVIDER_STARTUP_METRICS_FIELD_NUMBER = 3;
        public static final int KOTLIN_VERSION_FIELD_NUMBER = 2;
        public static final int MIN_API_LEVEL_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private List<ContentProviderStartupMetrics> contentProviderStartupMetrics_;
        private volatile Object kotlinVersion_;
        private byte memoizedIsInitialized;
        private int minApiLevel_;
        private static final AndroidPlatformData DEFAULT_INSTANCE = new AndroidPlatformData();
        private static final Parser PARSER = new AbstractParser() { // from class: io.bidmachine.protobuf.InitRequest.AndroidPlatformData.1
            @Override // com.explorestack.protobuf.Parser
            public AndroidPlatformData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new AndroidPlatformData(codedInputStream, extensionRegistryLite);
            }
        };

        public interface ContentProviderStartupMetricsOrBuilder extends MessageOrBuilder {
            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* renamed from: getDefaultInstanceForType */
            /* synthetic */ MessageLite mo3244getDefaultInstanceForType();

            boolean getInitCompleted();

            long getInitDuration();

            Timestamp getStartInitTime();

            TimestampOrBuilder getStartInitTimeOrBuilder();

            boolean hasStartInitTime();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        private AndroidPlatformData(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        private AndroidPlatformData() {
            this.memoizedIsInitialized = (byte) -1;
            this.kotlinVersion_ = "";
            this.contentProviderStartupMetrics_ = Collections.emptyList();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new AndroidPlatformData();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private AndroidPlatformData(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            extensionRegistryLite.getClass();
            UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 8) {
                                    this.minApiLevel_ = codedInputStream.readUInt32();
                                } else if (readTag == 18) {
                                    this.kotlinVersion_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 26) {
                                    if (!z2) {
                                        this.contentProviderStartupMetrics_ = new ArrayList();
                                        z2 = true;
                                    }
                                    this.contentProviderStartupMetrics_.add(codedInputStream.readMessage(ContentProviderStartupMetrics.parser(), extensionRegistryLite));
                                } else if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.setUnfinishedMessage(this);
                        }
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if (z2) {
                        this.contentProviderStartupMetrics_ = Collections.unmodifiableList(this.contentProviderStartupMetrics_);
                    }
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2) {
                this.contentProviderStartupMetrics_ = Collections.unmodifiableList(this.contentProviderStartupMetrics_);
            }
            this.unknownFields = newBuilder.build();
            makeExtensionsImmutable();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return InitProto.internal_static_bidmachine_protobuf_InitRequest_AndroidPlatformData_descriptor;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return InitProto.internal_static_bidmachine_protobuf_InitRequest_AndroidPlatformData_fieldAccessorTable.ensureFieldAccessorsInitialized(AndroidPlatformData.class, Builder.class);
        }

        public static final class ContentProviderStartupMetrics extends GeneratedMessageV3 implements ContentProviderStartupMetricsOrBuilder {
            public static final int INIT_COMPLETED_FIELD_NUMBER = 3;
            public static final int INIT_DURATION_FIELD_NUMBER = 2;
            public static final int START_INIT_TIME_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private boolean initCompleted_;
            private long initDuration_;
            private byte memoizedIsInitialized;
            private Timestamp startInitTime_;
            private static final ContentProviderStartupMetrics DEFAULT_INSTANCE = new ContentProviderStartupMetrics();
            private static final Parser PARSER = new AbstractParser() { // from class: io.bidmachine.protobuf.InitRequest.AndroidPlatformData.ContentProviderStartupMetrics.1
                @Override // com.explorestack.protobuf.Parser
                public ContentProviderStartupMetrics parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new ContentProviderStartupMetrics(codedInputStream, extensionRegistryLite);
                }
            };

            private ContentProviderStartupMetrics(GeneratedMessageV3.Builder builder) {
                super(builder);
                this.memoizedIsInitialized = (byte) -1;
            }

            private ContentProviderStartupMetrics() {
                this.memoizedIsInitialized = (byte) -1;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3
            protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new ContentProviderStartupMetrics();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
            public final UnknownFieldSet getUnknownFields() {
                return this.unknownFields;
            }

            private ContentProviderStartupMetrics(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                this();
                extensionRegistryLite.getClass();
                UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    Timestamp timestamp = this.startInitTime_;
                                    Timestamp.Builder builder = timestamp != null ? timestamp.toBuilder() : null;
                                    Timestamp timestamp2 = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                    this.startInitTime_ = timestamp2;
                                    if (builder != null) {
                                        builder.mergeFrom(timestamp2);
                                        this.startInitTime_ = builder.buildPartial();
                                    }
                                } else if (readTag == 16) {
                                    this.initDuration_ = codedInputStream.readUInt64();
                                } else if (readTag == 24) {
                                    this.initCompleted_ = codedInputStream.readBool();
                                } else if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.setUnfinishedMessage(this);
                        } catch (IOException e2) {
                            throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                        }
                    } catch (Throwable th) {
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return InitProto.internal_static_bidmachine_protobuf_InitRequest_AndroidPlatformData_ContentProviderStartupMetrics_descriptor;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return InitProto.internal_static_bidmachine_protobuf_InitRequest_AndroidPlatformData_ContentProviderStartupMetrics_fieldAccessorTable.ensureFieldAccessorsInitialized(ContentProviderStartupMetrics.class, Builder.class);
            }

            @Override // io.bidmachine.protobuf.InitRequest.AndroidPlatformData.ContentProviderStartupMetricsOrBuilder
            public boolean hasStartInitTime() {
                return this.startInitTime_ != null;
            }

            @Override // io.bidmachine.protobuf.InitRequest.AndroidPlatformData.ContentProviderStartupMetricsOrBuilder
            public Timestamp getStartInitTime() {
                Timestamp timestamp = this.startInitTime_;
                return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
            }

            @Override // io.bidmachine.protobuf.InitRequest.AndroidPlatformData.ContentProviderStartupMetricsOrBuilder
            public TimestampOrBuilder getStartInitTimeOrBuilder() {
                return getStartInitTime();
            }

            @Override // io.bidmachine.protobuf.InitRequest.AndroidPlatformData.ContentProviderStartupMetricsOrBuilder
            public long getInitDuration() {
                return this.initDuration_;
            }

            @Override // io.bidmachine.protobuf.InitRequest.AndroidPlatformData.ContentProviderStartupMetricsOrBuilder
            public boolean getInitCompleted() {
                return this.initCompleted_;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                byte b = this.memoizedIsInitialized;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if (this.startInitTime_ != null) {
                    codedOutputStream.writeMessage(1, getStartInitTime());
                }
                long j = this.initDuration_;
                if (j != 0) {
                    codedOutputStream.writeUInt64(2, j);
                }
                boolean z = this.initCompleted_;
                if (z) {
                    codedOutputStream.writeBool(3, z);
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int computeMessageSize = this.startInitTime_ != null ? CodedOutputStream.computeMessageSize(1, getStartInitTime()) : 0;
                long j = this.initDuration_;
                if (j != 0) {
                    computeMessageSize += CodedOutputStream.computeUInt64Size(2, j);
                }
                boolean z = this.initCompleted_;
                if (z) {
                    computeMessageSize += CodedOutputStream.computeBoolSize(3, z);
                }
                int serializedSize = computeMessageSize + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof ContentProviderStartupMetrics)) {
                    return super.equals(obj);
                }
                ContentProviderStartupMetrics contentProviderStartupMetrics = (ContentProviderStartupMetrics) obj;
                if (hasStartInitTime() != contentProviderStartupMetrics.hasStartInitTime()) {
                    return false;
                }
                return (!hasStartInitTime() || getStartInitTime().equals(contentProviderStartupMetrics.getStartInitTime())) && getInitDuration() == contentProviderStartupMetrics.getInitDuration() && getInitCompleted() == contentProviderStartupMetrics.getInitCompleted() && this.unknownFields.equals(contentProviderStartupMetrics.unknownFields);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i = this.memoizedHashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = 779 + getDescriptor().hashCode();
                if (hasStartInitTime()) {
                    hashCode = (((hashCode * 37) + 1) * 53) + getStartInitTime().hashCode();
                }
                int hashLong = (((((((((hashCode * 37) + 2) * 53) + Internal.hashLong(getInitDuration())) * 37) + 3) * 53) + Internal.hashBoolean(getInitCompleted())) * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = hashLong;
                return hashLong;
            }

            public static ContentProviderStartupMetrics parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (ContentProviderStartupMetrics) PARSER.parseFrom(byteBuffer);
            }

            public static ContentProviderStartupMetrics parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (ContentProviderStartupMetrics) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static ContentProviderStartupMetrics parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (ContentProviderStartupMetrics) PARSER.parseFrom(byteString);
            }

            public static ContentProviderStartupMetrics parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (ContentProviderStartupMetrics) PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            public static ContentProviderStartupMetrics parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (ContentProviderStartupMetrics) PARSER.parseFrom(bArr);
            }

            public static ContentProviderStartupMetrics parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (ContentProviderStartupMetrics) PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static ContentProviderStartupMetrics parseFrom(InputStream inputStream) throws IOException {
                return (ContentProviderStartupMetrics) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
            }

            public static ContentProviderStartupMetrics parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (ContentProviderStartupMetrics) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static ContentProviderStartupMetrics parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (ContentProviderStartupMetrics) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static ContentProviderStartupMetrics parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (ContentProviderStartupMetrics) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static ContentProviderStartupMetrics parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (ContentProviderStartupMetrics) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
            }

            public static ContentProviderStartupMetrics parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (ContentProviderStartupMetrics) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Builder newBuilder(ContentProviderStartupMetrics contentProviderStartupMetrics) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(contentProviderStartupMetrics);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.explorestack.protobuf.GeneratedMessageV3
            public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static final class Builder extends GeneratedMessageV3.Builder implements ContentProviderStartupMetricsOrBuilder {
                private boolean initCompleted_;
                private long initDuration_;
                private SingleFieldBuilderV3 startInitTimeBuilder_;
                private Timestamp startInitTime_;

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return InitProto.internal_static_bidmachine_protobuf_InitRequest_AndroidPlatformData_ContentProviderStartupMetrics_descriptor;
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
                protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return InitProto.internal_static_bidmachine_protobuf_InitRequest_AndroidPlatformData_ContentProviderStartupMetrics_fieldAccessorTable.ensureFieldAccessorsInitialized(ContentProviderStartupMetrics.class, Builder.class);
                }

                private Builder() {
                    maybeForceBuilderInitialization();
                }

                private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    maybeForceBuilderInitialization();
                }

                private void maybeForceBuilderInitialization() {
                    boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    if (this.startInitTimeBuilder_ == null) {
                        this.startInitTime_ = null;
                    } else {
                        this.startInitTime_ = null;
                        this.startInitTimeBuilder_ = null;
                    }
                    this.initDuration_ = 0L;
                    this.initCompleted_ = false;
                    return this;
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return InitProto.internal_static_bidmachine_protobuf_InitRequest_AndroidPlatformData_ContentProviderStartupMetrics_descriptor;
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                /* renamed from: getDefaultInstanceForType */
                public ContentProviderStartupMetrics mo3244getDefaultInstanceForType() {
                    return ContentProviderStartupMetrics.getDefaultInstance();
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public ContentProviderStartupMetrics build() {
                    ContentProviderStartupMetrics buildPartial = buildPartial();
                    if (buildPartial.isInitialized()) {
                        return buildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public ContentProviderStartupMetrics buildPartial() {
                    ContentProviderStartupMetrics contentProviderStartupMetrics = new ContentProviderStartupMetrics(this);
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.startInitTimeBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        contentProviderStartupMetrics.startInitTime_ = this.startInitTime_;
                    } else {
                        contentProviderStartupMetrics.startInitTime_ = (Timestamp) singleFieldBuilderV3.build();
                    }
                    contentProviderStartupMetrics.initDuration_ = this.initDuration_;
                    contentProviderStartupMetrics.initCompleted_ = this.initCompleted_;
                    onBuilt();
                    return contentProviderStartupMetrics;
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder
                /* renamed from: clone */
                public Builder mo3223clone() {
                    return (Builder) super.mo3223clone();
                }

                @Override // com.explorestack.protobuf.Message.Builder
                public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.setField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (Builder) super.clearOneof(oneofDescriptor);
                }

                @Override // com.explorestack.protobuf.Message.Builder
                public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                    return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
                }

                @Override // com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof ContentProviderStartupMetrics) {
                        return mergeFrom((ContentProviderStartupMetrics) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(ContentProviderStartupMetrics contentProviderStartupMetrics) {
                    if (contentProviderStartupMetrics == ContentProviderStartupMetrics.getDefaultInstance()) {
                        return this;
                    }
                    if (contentProviderStartupMetrics.hasStartInitTime()) {
                        mergeStartInitTime(contentProviderStartupMetrics.getStartInitTime());
                    }
                    if (contentProviderStartupMetrics.getInitDuration() != 0) {
                        setInitDuration(contentProviderStartupMetrics.getInitDuration());
                    }
                    if (contentProviderStartupMetrics.getInitCompleted()) {
                        setInitCompleted(contentProviderStartupMetrics.getInitCompleted());
                    }
                    mergeUnknownFields(((GeneratedMessageV3) contentProviderStartupMetrics).unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    ContentProviderStartupMetrics contentProviderStartupMetrics = null;
                    try {
                        try {
                            ContentProviderStartupMetrics contentProviderStartupMetrics2 = (ContentProviderStartupMetrics) ContentProviderStartupMetrics.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                            if (contentProviderStartupMetrics2 != null) {
                                mergeFrom(contentProviderStartupMetrics2);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e) {
                            ContentProviderStartupMetrics contentProviderStartupMetrics3 = (ContentProviderStartupMetrics) e.getUnfinishedMessage();
                            try {
                                throw e.unwrapIOException();
                            } catch (Throwable th) {
                                th = th;
                                contentProviderStartupMetrics = contentProviderStartupMetrics3;
                                if (contentProviderStartupMetrics != null) {
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (contentProviderStartupMetrics != null) {
                            mergeFrom(contentProviderStartupMetrics);
                        }
                        throw th;
                    }
                }

                @Override // io.bidmachine.protobuf.InitRequest.AndroidPlatformData.ContentProviderStartupMetricsOrBuilder
                public boolean hasStartInitTime() {
                    return (this.startInitTimeBuilder_ == null && this.startInitTime_ == null) ? false : true;
                }

                @Override // io.bidmachine.protobuf.InitRequest.AndroidPlatformData.ContentProviderStartupMetricsOrBuilder
                public Timestamp getStartInitTime() {
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.startInitTimeBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        Timestamp timestamp = this.startInitTime_;
                        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
                    }
                    return (Timestamp) singleFieldBuilderV3.getMessage();
                }

                public Builder setStartInitTime(Timestamp timestamp) {
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.startInitTimeBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        timestamp.getClass();
                        this.startInitTime_ = timestamp;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(timestamp);
                    }
                    return this;
                }

                public Builder setStartInitTime(Timestamp.Builder builder) {
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.startInitTimeBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        this.startInitTime_ = builder.build();
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(builder.build());
                    }
                    return this;
                }

                public Builder mergeStartInitTime(Timestamp timestamp) {
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.startInitTimeBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        Timestamp timestamp2 = this.startInitTime_;
                        if (timestamp2 != null) {
                            this.startInitTime_ = Timestamp.newBuilder(timestamp2).mergeFrom(timestamp).buildPartial();
                        } else {
                            this.startInitTime_ = timestamp;
                        }
                        onChanged();
                    } else {
                        singleFieldBuilderV3.mergeFrom(timestamp);
                    }
                    return this;
                }

                public Builder clearStartInitTime() {
                    if (this.startInitTimeBuilder_ == null) {
                        this.startInitTime_ = null;
                        onChanged();
                    } else {
                        this.startInitTime_ = null;
                        this.startInitTimeBuilder_ = null;
                    }
                    return this;
                }

                public Timestamp.Builder getStartInitTimeBuilder() {
                    onChanged();
                    return (Timestamp.Builder) getStartInitTimeFieldBuilder().getBuilder();
                }

                @Override // io.bidmachine.protobuf.InitRequest.AndroidPlatformData.ContentProviderStartupMetricsOrBuilder
                public TimestampOrBuilder getStartInitTimeOrBuilder() {
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.startInitTimeBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return (TimestampOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                    }
                    Timestamp timestamp = this.startInitTime_;
                    return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
                }

                private SingleFieldBuilderV3 getStartInitTimeFieldBuilder() {
                    if (this.startInitTimeBuilder_ == null) {
                        this.startInitTimeBuilder_ = new SingleFieldBuilderV3(getStartInitTime(), getParentForChildren(), isClean());
                        this.startInitTime_ = null;
                    }
                    return this.startInitTimeBuilder_;
                }

                @Override // io.bidmachine.protobuf.InitRequest.AndroidPlatformData.ContentProviderStartupMetricsOrBuilder
                public long getInitDuration() {
                    return this.initDuration_;
                }

                public Builder setInitDuration(long j) {
                    this.initDuration_ = j;
                    onChanged();
                    return this;
                }

                public Builder clearInitDuration() {
                    this.initDuration_ = 0L;
                    onChanged();
                    return this;
                }

                @Override // io.bidmachine.protobuf.InitRequest.AndroidPlatformData.ContentProviderStartupMetricsOrBuilder
                public boolean getInitCompleted() {
                    return this.initCompleted_;
                }

                public Builder setInitCompleted(boolean z) {
                    this.initCompleted_ = z;
                    onChanged();
                    return this;
                }

                public Builder clearInitCompleted() {
                    this.initCompleted_ = false;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.Message.Builder
                public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (Builder) super.setUnknownFields(unknownFieldSet);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (Builder) super.mergeUnknownFields(unknownFieldSet);
                }
            }

            public static ContentProviderStartupMetrics getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Parser getParserForType() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            /* renamed from: getDefaultInstanceForType */
            public ContentProviderStartupMetrics mo3244getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }
        }

        @Override // io.bidmachine.protobuf.InitRequest.AndroidPlatformDataOrBuilder
        public int getMinApiLevel() {
            return this.minApiLevel_;
        }

        @Override // io.bidmachine.protobuf.InitRequest.AndroidPlatformDataOrBuilder
        public String getKotlinVersion() {
            Object obj = this.kotlinVersion_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.kotlinVersion_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.InitRequest.AndroidPlatformDataOrBuilder
        public ByteString getKotlinVersionBytes() {
            Object obj = this.kotlinVersion_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.kotlinVersion_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // io.bidmachine.protobuf.InitRequest.AndroidPlatformDataOrBuilder
        public List<ContentProviderStartupMetrics> getContentProviderStartupMetricsList() {
            return this.contentProviderStartupMetrics_;
        }

        @Override // io.bidmachine.protobuf.InitRequest.AndroidPlatformDataOrBuilder
        public List<? extends ContentProviderStartupMetricsOrBuilder> getContentProviderStartupMetricsOrBuilderList() {
            return this.contentProviderStartupMetrics_;
        }

        @Override // io.bidmachine.protobuf.InitRequest.AndroidPlatformDataOrBuilder
        public int getContentProviderStartupMetricsCount() {
            return this.contentProviderStartupMetrics_.size();
        }

        @Override // io.bidmachine.protobuf.InitRequest.AndroidPlatformDataOrBuilder
        public ContentProviderStartupMetrics getContentProviderStartupMetrics(int i) {
            return this.contentProviderStartupMetrics_.get(i);
        }

        @Override // io.bidmachine.protobuf.InitRequest.AndroidPlatformDataOrBuilder
        public ContentProviderStartupMetricsOrBuilder getContentProviderStartupMetricsOrBuilder(int i) {
            return this.contentProviderStartupMetrics_.get(i);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.minApiLevel_;
            if (i != 0) {
                codedOutputStream.writeUInt32(1, i);
            }
            if (!getKotlinVersionBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.kotlinVersion_);
            }
            for (int i2 = 0; i2 < this.contentProviderStartupMetrics_.size(); i2++) {
                codedOutputStream.writeMessage(3, this.contentProviderStartupMetrics_.get(i2));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.minApiLevel_;
            int computeUInt32Size = i2 != 0 ? CodedOutputStream.computeUInt32Size(1, i2) : 0;
            if (!getKotlinVersionBytes().isEmpty()) {
                computeUInt32Size += GeneratedMessageV3.computeStringSize(2, this.kotlinVersion_);
            }
            for (int i3 = 0; i3 < this.contentProviderStartupMetrics_.size(); i3++) {
                computeUInt32Size += CodedOutputStream.computeMessageSize(3, this.contentProviderStartupMetrics_.get(i3));
            }
            int serializedSize = computeUInt32Size + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AndroidPlatformData)) {
                return super.equals(obj);
            }
            AndroidPlatformData androidPlatformData = (AndroidPlatformData) obj;
            return getMinApiLevel() == androidPlatformData.getMinApiLevel() && getKotlinVersion().equals(androidPlatformData.getKotlinVersion()) && getContentProviderStartupMetricsList().equals(androidPlatformData.getContentProviderStartupMetricsList()) && this.unknownFields.equals(androidPlatformData.unknownFields);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getMinApiLevel()) * 37) + 2) * 53) + getKotlinVersion().hashCode();
            if (getContentProviderStartupMetricsCount() > 0) {
                hashCode = (((hashCode * 37) + 3) * 53) + getContentProviderStartupMetricsList().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public static AndroidPlatformData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AndroidPlatformData) PARSER.parseFrom(byteBuffer);
        }

        public static AndroidPlatformData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AndroidPlatformData) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static AndroidPlatformData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AndroidPlatformData) PARSER.parseFrom(byteString);
        }

        public static AndroidPlatformData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AndroidPlatformData) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AndroidPlatformData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AndroidPlatformData) PARSER.parseFrom(bArr);
        }

        public static AndroidPlatformData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AndroidPlatformData) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static AndroidPlatformData parseFrom(InputStream inputStream) throws IOException {
            return (AndroidPlatformData) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static AndroidPlatformData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AndroidPlatformData) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AndroidPlatformData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AndroidPlatformData) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AndroidPlatformData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AndroidPlatformData) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AndroidPlatformData parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AndroidPlatformData) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static AndroidPlatformData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AndroidPlatformData) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(AndroidPlatformData androidPlatformData) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(androidPlatformData);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder implements AndroidPlatformDataOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3 contentProviderStartupMetricsBuilder_;
            private List<ContentProviderStartupMetrics> contentProviderStartupMetrics_;
            private Object kotlinVersion_;
            private int minApiLevel_;

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return InitProto.internal_static_bidmachine_protobuf_InitRequest_AndroidPlatformData_descriptor;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return InitProto.internal_static_bidmachine_protobuf_InitRequest_AndroidPlatformData_fieldAccessorTable.ensureFieldAccessorsInitialized(AndroidPlatformData.class, Builder.class);
            }

            private Builder() {
                this.kotlinVersion_ = "";
                this.contentProviderStartupMetrics_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.kotlinVersion_ = "";
                this.contentProviderStartupMetrics_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getContentProviderStartupMetricsFieldBuilder();
                }
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.minApiLevel_ = 0;
                this.kotlinVersion_ = "";
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.contentProviderStartupMetricsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.contentProviderStartupMetrics_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return InitProto.internal_static_bidmachine_protobuf_InitRequest_AndroidPlatformData_descriptor;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* renamed from: getDefaultInstanceForType */
            public AndroidPlatformData mo3244getDefaultInstanceForType() {
                return AndroidPlatformData.getDefaultInstance();
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public AndroidPlatformData build() {
                AndroidPlatformData buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public AndroidPlatformData buildPartial() {
                AndroidPlatformData androidPlatformData = new AndroidPlatformData(this);
                androidPlatformData.minApiLevel_ = this.minApiLevel_;
                androidPlatformData.kotlinVersion_ = this.kotlinVersion_;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.contentProviderStartupMetricsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    androidPlatformData.contentProviderStartupMetrics_ = repeatedFieldBuilderV3.build();
                } else {
                    if ((this.bitField0_ & 1) != 0) {
                        this.contentProviderStartupMetrics_ = Collections.unmodifiableList(this.contentProviderStartupMetrics_);
                        this.bitField0_ &= -2;
                    }
                    androidPlatformData.contentProviderStartupMetrics_ = this.contentProviderStartupMetrics_;
                }
                onBuilt();
                return androidPlatformData;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* renamed from: clone */
            public Builder mo3223clone() {
                return (Builder) super.mo3223clone();
            }

            @Override // com.explorestack.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.explorestack.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            @Override // com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AndroidPlatformData) {
                    return mergeFrom((AndroidPlatformData) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AndroidPlatformData androidPlatformData) {
                if (androidPlatformData == AndroidPlatformData.getDefaultInstance()) {
                    return this;
                }
                if (androidPlatformData.getMinApiLevel() != 0) {
                    setMinApiLevel(androidPlatformData.getMinApiLevel());
                }
                if (!androidPlatformData.getKotlinVersion().isEmpty()) {
                    this.kotlinVersion_ = androidPlatformData.kotlinVersion_;
                    onChanged();
                }
                if (this.contentProviderStartupMetricsBuilder_ == null) {
                    if (!androidPlatformData.contentProviderStartupMetrics_.isEmpty()) {
                        if (this.contentProviderStartupMetrics_.isEmpty()) {
                            this.contentProviderStartupMetrics_ = androidPlatformData.contentProviderStartupMetrics_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureContentProviderStartupMetricsIsMutable();
                            this.contentProviderStartupMetrics_.addAll(androidPlatformData.contentProviderStartupMetrics_);
                        }
                        onChanged();
                    }
                } else if (!androidPlatformData.contentProviderStartupMetrics_.isEmpty()) {
                    if (!this.contentProviderStartupMetricsBuilder_.isEmpty()) {
                        this.contentProviderStartupMetricsBuilder_.addAllMessages(androidPlatformData.contentProviderStartupMetrics_);
                    } else {
                        this.contentProviderStartupMetricsBuilder_.dispose();
                        this.contentProviderStartupMetricsBuilder_ = null;
                        this.contentProviderStartupMetrics_ = androidPlatformData.contentProviderStartupMetrics_;
                        this.bitField0_ &= -2;
                        this.contentProviderStartupMetricsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getContentProviderStartupMetricsFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((GeneratedMessageV3) androidPlatformData).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                AndroidPlatformData androidPlatformData = null;
                try {
                    try {
                        AndroidPlatformData androidPlatformData2 = (AndroidPlatformData) AndroidPlatformData.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (androidPlatformData2 != null) {
                            mergeFrom(androidPlatformData2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        AndroidPlatformData androidPlatformData3 = (AndroidPlatformData) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            androidPlatformData = androidPlatformData3;
                            if (androidPlatformData != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (androidPlatformData != null) {
                        mergeFrom(androidPlatformData);
                    }
                    throw th;
                }
            }

            @Override // io.bidmachine.protobuf.InitRequest.AndroidPlatformDataOrBuilder
            public int getMinApiLevel() {
                return this.minApiLevel_;
            }

            public Builder setMinApiLevel(int i) {
                this.minApiLevel_ = i;
                onChanged();
                return this;
            }

            public Builder clearMinApiLevel() {
                this.minApiLevel_ = 0;
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.InitRequest.AndroidPlatformDataOrBuilder
            public String getKotlinVersion() {
                Object obj = this.kotlinVersion_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.kotlinVersion_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // io.bidmachine.protobuf.InitRequest.AndroidPlatformDataOrBuilder
            public ByteString getKotlinVersionBytes() {
                Object obj = this.kotlinVersion_;
                if (obj instanceof String) {
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.kotlinVersion_ = copyFromUtf8;
                    return copyFromUtf8;
                }
                return (ByteString) obj;
            }

            public Builder setKotlinVersion(String str) {
                str.getClass();
                this.kotlinVersion_ = str;
                onChanged();
                return this;
            }

            public Builder clearKotlinVersion() {
                this.kotlinVersion_ = AndroidPlatformData.getDefaultInstance().getKotlinVersion();
                onChanged();
                return this;
            }

            public Builder setKotlinVersionBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.kotlinVersion_ = byteString;
                onChanged();
                return this;
            }

            private void ensureContentProviderStartupMetricsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.contentProviderStartupMetrics_ = new ArrayList(this.contentProviderStartupMetrics_);
                    this.bitField0_ |= 1;
                }
            }

            @Override // io.bidmachine.protobuf.InitRequest.AndroidPlatformDataOrBuilder
            public List<ContentProviderStartupMetrics> getContentProviderStartupMetricsList() {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.contentProviderStartupMetricsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return Collections.unmodifiableList(this.contentProviderStartupMetrics_);
                }
                return repeatedFieldBuilderV3.getMessageList();
            }

            @Override // io.bidmachine.protobuf.InitRequest.AndroidPlatformDataOrBuilder
            public int getContentProviderStartupMetricsCount() {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.contentProviderStartupMetricsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.contentProviderStartupMetrics_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            @Override // io.bidmachine.protobuf.InitRequest.AndroidPlatformDataOrBuilder
            public ContentProviderStartupMetrics getContentProviderStartupMetrics(int i) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.contentProviderStartupMetricsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.contentProviderStartupMetrics_.get(i);
                }
                return (ContentProviderStartupMetrics) repeatedFieldBuilderV3.getMessage(i);
            }

            public Builder setContentProviderStartupMetrics(int i, ContentProviderStartupMetrics contentProviderStartupMetrics) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.contentProviderStartupMetricsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    contentProviderStartupMetrics.getClass();
                    ensureContentProviderStartupMetricsIsMutable();
                    this.contentProviderStartupMetrics_.set(i, contentProviderStartupMetrics);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, contentProviderStartupMetrics);
                }
                return this;
            }

            public Builder setContentProviderStartupMetrics(int i, ContentProviderStartupMetrics.Builder builder) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.contentProviderStartupMetricsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureContentProviderStartupMetricsIsMutable();
                    this.contentProviderStartupMetrics_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder addContentProviderStartupMetrics(ContentProviderStartupMetrics contentProviderStartupMetrics) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.contentProviderStartupMetricsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    contentProviderStartupMetrics.getClass();
                    ensureContentProviderStartupMetricsIsMutable();
                    this.contentProviderStartupMetrics_.add(contentProviderStartupMetrics);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(contentProviderStartupMetrics);
                }
                return this;
            }

            public Builder addContentProviderStartupMetrics(int i, ContentProviderStartupMetrics contentProviderStartupMetrics) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.contentProviderStartupMetricsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    contentProviderStartupMetrics.getClass();
                    ensureContentProviderStartupMetricsIsMutable();
                    this.contentProviderStartupMetrics_.add(i, contentProviderStartupMetrics);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, contentProviderStartupMetrics);
                }
                return this;
            }

            public Builder addContentProviderStartupMetrics(ContentProviderStartupMetrics.Builder builder) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.contentProviderStartupMetricsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureContentProviderStartupMetricsIsMutable();
                    this.contentProviderStartupMetrics_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                }
                return this;
            }

            public Builder addContentProviderStartupMetrics(int i, ContentProviderStartupMetrics.Builder builder) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.contentProviderStartupMetricsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureContentProviderStartupMetricsIsMutable();
                    this.contentProviderStartupMetrics_.add(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, builder.build());
                }
                return this;
            }

            public Builder addAllContentProviderStartupMetrics(Iterable<? extends ContentProviderStartupMetrics> iterable) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.contentProviderStartupMetricsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureContentProviderStartupMetricsIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.contentProviderStartupMetrics_);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                }
                return this;
            }

            public Builder clearContentProviderStartupMetrics() {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.contentProviderStartupMetricsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.contentProviderStartupMetrics_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Builder removeContentProviderStartupMetrics(int i) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.contentProviderStartupMetricsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureContentProviderStartupMetricsIsMutable();
                    this.contentProviderStartupMetrics_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.remove(i);
                }
                return this;
            }

            public ContentProviderStartupMetrics.Builder getContentProviderStartupMetricsBuilder(int i) {
                return (ContentProviderStartupMetrics.Builder) getContentProviderStartupMetricsFieldBuilder().getBuilder(i);
            }

            @Override // io.bidmachine.protobuf.InitRequest.AndroidPlatformDataOrBuilder
            public ContentProviderStartupMetricsOrBuilder getContentProviderStartupMetricsOrBuilder(int i) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.contentProviderStartupMetricsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.contentProviderStartupMetrics_.get(i);
                }
                return (ContentProviderStartupMetricsOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i);
            }

            @Override // io.bidmachine.protobuf.InitRequest.AndroidPlatformDataOrBuilder
            public List<? extends ContentProviderStartupMetricsOrBuilder> getContentProviderStartupMetricsOrBuilderList() {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.contentProviderStartupMetricsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    return repeatedFieldBuilderV3.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.contentProviderStartupMetrics_);
            }

            public ContentProviderStartupMetrics.Builder addContentProviderStartupMetricsBuilder() {
                return (ContentProviderStartupMetrics.Builder) getContentProviderStartupMetricsFieldBuilder().addBuilder(ContentProviderStartupMetrics.getDefaultInstance());
            }

            public ContentProviderStartupMetrics.Builder addContentProviderStartupMetricsBuilder(int i) {
                return (ContentProviderStartupMetrics.Builder) getContentProviderStartupMetricsFieldBuilder().addBuilder(i, ContentProviderStartupMetrics.getDefaultInstance());
            }

            public List<ContentProviderStartupMetrics.Builder> getContentProviderStartupMetricsBuilderList() {
                return getContentProviderStartupMetricsFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3 getContentProviderStartupMetricsFieldBuilder() {
                if (this.contentProviderStartupMetricsBuilder_ == null) {
                    this.contentProviderStartupMetricsBuilder_ = new RepeatedFieldBuilderV3(this.contentProviderStartupMetrics_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.contentProviderStartupMetrics_ = null;
                }
                return this.contentProviderStartupMetricsBuilder_;
            }

            @Override // com.explorestack.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        public static AndroidPlatformData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Parser getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* renamed from: getDefaultInstanceForType */
        public AndroidPlatformData mo3244getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class iOSPlatformData extends GeneratedMessageV3 implements iOSPlatformDataOrBuilder {
        public static final int MIN_OS_VERSION_FIELD_NUMBER = 1;
        public static final int OS_EXECUTION_ENV_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private StringValue minOsVersion_;
        private int osExecutionEnv_;
        private static final iOSPlatformData DEFAULT_INSTANCE = new iOSPlatformData();
        private static final Parser PARSER = new AbstractParser() { // from class: io.bidmachine.protobuf.InitRequest.iOSPlatformData.1
            @Override // com.explorestack.protobuf.Parser
            public iOSPlatformData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new iOSPlatformData(codedInputStream, extensionRegistryLite);
            }
        };

        private iOSPlatformData(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        private iOSPlatformData() {
            this.memoizedIsInitialized = (byte) -1;
            this.osExecutionEnv_ = 0;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new iOSPlatformData();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private iOSPlatformData(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            extensionRegistryLite.getClass();
            UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                StringValue stringValue = this.minOsVersion_;
                                StringValue.Builder builder = stringValue != null ? stringValue.toBuilder() : null;
                                StringValue stringValue2 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                                this.minOsVersion_ = stringValue2;
                                if (builder != null) {
                                    builder.mergeFrom(stringValue2);
                                    this.minOsVersion_ = builder.buildPartial();
                                }
                            } else if (readTag == 16) {
                                this.osExecutionEnv_ = codedInputStream.readEnum();
                            } else if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            this.unknownFields = newBuilder.build();
            makeExtensionsImmutable();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return InitProto.internal_static_bidmachine_protobuf_InitRequest_iOSPlatformData_descriptor;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return InitProto.internal_static_bidmachine_protobuf_InitRequest_iOSPlatformData_fieldAccessorTable.ensureFieldAccessorsInitialized(iOSPlatformData.class, Builder.class);
        }

        @Override // io.bidmachine.protobuf.InitRequest.iOSPlatformDataOrBuilder
        public boolean hasMinOsVersion() {
            return this.minOsVersion_ != null;
        }

        @Override // io.bidmachine.protobuf.InitRequest.iOSPlatformDataOrBuilder
        public StringValue getMinOsVersion() {
            StringValue stringValue = this.minOsVersion_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // io.bidmachine.protobuf.InitRequest.iOSPlatformDataOrBuilder
        public StringValueOrBuilder getMinOsVersionOrBuilder() {
            return getMinOsVersion();
        }

        @Override // io.bidmachine.protobuf.InitRequest.iOSPlatformDataOrBuilder
        public int getOsExecutionEnvValue() {
            return this.osExecutionEnv_;
        }

        @Override // io.bidmachine.protobuf.InitRequest.iOSPlatformDataOrBuilder
        public OSExecutionEnvironment getOsExecutionEnv() {
            OSExecutionEnvironment valueOf = OSExecutionEnvironment.valueOf(this.osExecutionEnv_);
            return valueOf == null ? OSExecutionEnvironment.UNRECOGNIZED : valueOf;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.minOsVersion_ != null) {
                codedOutputStream.writeMessage(1, getMinOsVersion());
            }
            if (this.osExecutionEnv_ != OSExecutionEnvironment.OS_EXECUTION_ENVIRONMENT_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(2, this.osExecutionEnv_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int computeMessageSize = this.minOsVersion_ != null ? CodedOutputStream.computeMessageSize(1, getMinOsVersion()) : 0;
            if (this.osExecutionEnv_ != OSExecutionEnvironment.OS_EXECUTION_ENVIRONMENT_UNKNOWN.getNumber()) {
                computeMessageSize += CodedOutputStream.computeEnumSize(2, this.osExecutionEnv_);
            }
            int serializedSize = computeMessageSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof iOSPlatformData)) {
                return super.equals(obj);
            }
            iOSPlatformData iosplatformdata = (iOSPlatformData) obj;
            if (hasMinOsVersion() != iosplatformdata.hasMinOsVersion()) {
                return false;
            }
            return (!hasMinOsVersion() || getMinOsVersion().equals(iosplatformdata.getMinOsVersion())) && this.osExecutionEnv_ == iosplatformdata.osExecutionEnv_ && this.unknownFields.equals(iosplatformdata.unknownFields);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = 779 + getDescriptor().hashCode();
            if (hasMinOsVersion()) {
                hashCode = (((hashCode * 37) + 1) * 53) + getMinOsVersion().hashCode();
            }
            int hashCode2 = (((((hashCode * 37) + 2) * 53) + this.osExecutionEnv_) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public static iOSPlatformData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (iOSPlatformData) PARSER.parseFrom(byteBuffer);
        }

        public static iOSPlatformData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (iOSPlatformData) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static iOSPlatformData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (iOSPlatformData) PARSER.parseFrom(byteString);
        }

        public static iOSPlatformData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (iOSPlatformData) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static iOSPlatformData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (iOSPlatformData) PARSER.parseFrom(bArr);
        }

        public static iOSPlatformData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (iOSPlatformData) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static iOSPlatformData parseFrom(InputStream inputStream) throws IOException {
            return (iOSPlatformData) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static iOSPlatformData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (iOSPlatformData) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static iOSPlatformData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (iOSPlatformData) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static iOSPlatformData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (iOSPlatformData) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static iOSPlatformData parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (iOSPlatformData) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static iOSPlatformData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (iOSPlatformData) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(iOSPlatformData iosplatformdata) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(iosplatformdata);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder implements iOSPlatformDataOrBuilder {
            private SingleFieldBuilderV3 minOsVersionBuilder_;
            private StringValue minOsVersion_;
            private int osExecutionEnv_;

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return InitProto.internal_static_bidmachine_protobuf_InitRequest_iOSPlatformData_descriptor;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return InitProto.internal_static_bidmachine_protobuf_InitRequest_iOSPlatformData_fieldAccessorTable.ensureFieldAccessorsInitialized(iOSPlatformData.class, Builder.class);
            }

            private Builder() {
                this.osExecutionEnv_ = 0;
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.osExecutionEnv_ = 0;
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                if (this.minOsVersionBuilder_ == null) {
                    this.minOsVersion_ = null;
                } else {
                    this.minOsVersion_ = null;
                    this.minOsVersionBuilder_ = null;
                }
                this.osExecutionEnv_ = 0;
                return this;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return InitProto.internal_static_bidmachine_protobuf_InitRequest_iOSPlatformData_descriptor;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* renamed from: getDefaultInstanceForType */
            public iOSPlatformData mo3244getDefaultInstanceForType() {
                return iOSPlatformData.getDefaultInstance();
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public iOSPlatformData build() {
                iOSPlatformData buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public iOSPlatformData buildPartial() {
                iOSPlatformData iosplatformdata = new iOSPlatformData(this);
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.minOsVersionBuilder_;
                if (singleFieldBuilderV3 == null) {
                    iosplatformdata.minOsVersion_ = this.minOsVersion_;
                } else {
                    iosplatformdata.minOsVersion_ = (StringValue) singleFieldBuilderV3.build();
                }
                iosplatformdata.osExecutionEnv_ = this.osExecutionEnv_;
                onBuilt();
                return iosplatformdata;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* renamed from: clone */
            public Builder mo3223clone() {
                return (Builder) super.mo3223clone();
            }

            @Override // com.explorestack.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.explorestack.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            @Override // com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof iOSPlatformData) {
                    return mergeFrom((iOSPlatformData) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(iOSPlatformData iosplatformdata) {
                if (iosplatformdata == iOSPlatformData.getDefaultInstance()) {
                    return this;
                }
                if (iosplatformdata.hasMinOsVersion()) {
                    mergeMinOsVersion(iosplatformdata.getMinOsVersion());
                }
                if (iosplatformdata.osExecutionEnv_ != 0) {
                    setOsExecutionEnvValue(iosplatformdata.getOsExecutionEnvValue());
                }
                mergeUnknownFields(((GeneratedMessageV3) iosplatformdata).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                iOSPlatformData iosplatformdata = null;
                try {
                    try {
                        iOSPlatformData iosplatformdata2 = (iOSPlatformData) iOSPlatformData.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (iosplatformdata2 != null) {
                            mergeFrom(iosplatformdata2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        iOSPlatformData iosplatformdata3 = (iOSPlatformData) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            iosplatformdata = iosplatformdata3;
                            if (iosplatformdata != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (iosplatformdata != null) {
                        mergeFrom(iosplatformdata);
                    }
                    throw th;
                }
            }

            @Override // io.bidmachine.protobuf.InitRequest.iOSPlatformDataOrBuilder
            public boolean hasMinOsVersion() {
                return (this.minOsVersionBuilder_ == null && this.minOsVersion_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.InitRequest.iOSPlatformDataOrBuilder
            public StringValue getMinOsVersion() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.minOsVersionBuilder_;
                if (singleFieldBuilderV3 == null) {
                    StringValue stringValue = this.minOsVersion_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }
                return (StringValue) singleFieldBuilderV3.getMessage();
            }

            public Builder setMinOsVersion(StringValue stringValue) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.minOsVersionBuilder_;
                if (singleFieldBuilderV3 == null) {
                    stringValue.getClass();
                    this.minOsVersion_ = stringValue;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(stringValue);
                }
                return this;
            }

            public Builder setMinOsVersion(StringValue.Builder builder) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.minOsVersionBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.minOsVersion_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder mergeMinOsVersion(StringValue stringValue) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.minOsVersionBuilder_;
                if (singleFieldBuilderV3 == null) {
                    StringValue stringValue2 = this.minOsVersion_;
                    if (stringValue2 != null) {
                        this.minOsVersion_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                    } else {
                        this.minOsVersion_ = stringValue;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(stringValue);
                }
                return this;
            }

            public Builder clearMinOsVersion() {
                if (this.minOsVersionBuilder_ == null) {
                    this.minOsVersion_ = null;
                    onChanged();
                } else {
                    this.minOsVersion_ = null;
                    this.minOsVersionBuilder_ = null;
                }
                return this;
            }

            public StringValue.Builder getMinOsVersionBuilder() {
                onChanged();
                return (StringValue.Builder) getMinOsVersionFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.InitRequest.iOSPlatformDataOrBuilder
            public StringValueOrBuilder getMinOsVersionOrBuilder() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.minOsVersionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StringValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StringValue stringValue = this.minOsVersion_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            private SingleFieldBuilderV3 getMinOsVersionFieldBuilder() {
                if (this.minOsVersionBuilder_ == null) {
                    this.minOsVersionBuilder_ = new SingleFieldBuilderV3(getMinOsVersion(), getParentForChildren(), isClean());
                    this.minOsVersion_ = null;
                }
                return this.minOsVersionBuilder_;
            }

            @Override // io.bidmachine.protobuf.InitRequest.iOSPlatformDataOrBuilder
            public int getOsExecutionEnvValue() {
                return this.osExecutionEnv_;
            }

            public Builder setOsExecutionEnvValue(int i) {
                this.osExecutionEnv_ = i;
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.InitRequest.iOSPlatformDataOrBuilder
            public OSExecutionEnvironment getOsExecutionEnv() {
                OSExecutionEnvironment valueOf = OSExecutionEnvironment.valueOf(this.osExecutionEnv_);
                return valueOf == null ? OSExecutionEnvironment.UNRECOGNIZED : valueOf;
            }

            public Builder setOsExecutionEnv(OSExecutionEnvironment oSExecutionEnvironment) {
                oSExecutionEnvironment.getClass();
                this.osExecutionEnv_ = oSExecutionEnvironment.getNumber();
                onChanged();
                return this;
            }

            public Builder clearOsExecutionEnv() {
                this.osExecutionEnv_ = 0;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        public static iOSPlatformData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Parser getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* renamed from: getDefaultInstanceForType */
        public iOSPlatformData mo3244getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public enum PlatformDataCase implements Internal.EnumLite {
        ANDROID(20),
        IOS(21),
        PLATFORMDATA_NOT_SET(0);

        private final int value;

        PlatformDataCase(int i) {
            this.value = i;
        }

        @Deprecated
        public static PlatformDataCase valueOf(int i) {
            return forNumber(i);
        }

        public static PlatformDataCase forNumber(int i) {
            if (i == 0) {
                return PLATFORMDATA_NOT_SET;
            }
            if (i == 20) {
                return ANDROID;
            }
            if (i != 21) {
                return null;
            }
            return IOS;
        }

        @Override // com.explorestack.protobuf.Internal.EnumLite
        public int getNumber() {
            return this.value;
        }
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public PlatformDataCase getPlatformDataCase() {
        return PlatformDataCase.forNumber(this.platformDataCase_);
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public String getSellerId() {
        Object obj = this.sellerId_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.sellerId_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public ByteString getSellerIdBytes() {
        Object obj = this.sellerId_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sellerId_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public String getBundle() {
        Object obj = this.bundle_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.bundle_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public ByteString getBundleBytes() {
        Object obj = this.bundle_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.bundle_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public int getOsValue() {
        return this.os_;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public OS getOs() {
        OS valueOf = OS.valueOf(this.os_);
        return valueOf == null ? OS.UNRECOGNIZED : valueOf;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public String getOsv() {
        Object obj = this.osv_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.osv_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public ByteString getOsvBytes() {
        Object obj = this.osv_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.osv_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public boolean hasGeo() {
        return this.geo_ != null;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public Context.Geo getGeo() {
        Context.Geo geo = this.geo_;
        return geo == null ? Context.Geo.getDefaultInstance() : geo;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public Context.GeoOrBuilder getGeoOrBuilder() {
        return getGeo();
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public String getSdk() {
        Object obj = this.sdk_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.sdk_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public ByteString getSdkBytes() {
        Object obj = this.sdk_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sdk_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public String getSdkver() {
        Object obj = this.sdkver_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.sdkver_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public ByteString getSdkverBytes() {
        Object obj = this.sdkver_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sdkver_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public String getIfa() {
        Object obj = this.ifa_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.ifa_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public ByteString getIfaBytes() {
        Object obj = this.ifa_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ifa_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public String getIfv() {
        Object obj = this.ifv_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.ifv_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public ByteString getIfvBytes() {
        Object obj = this.ifv_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ifv_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public String getBmIfv() {
        Object obj = this.bmIfv_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.bmIfv_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public ByteString getBmIfvBytes() {
        Object obj = this.bmIfv_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.bmIfv_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public int getDeviceTypeValue() {
        return this.deviceType_;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public DeviceType getDeviceType() {
        DeviceType valueOf = DeviceType.valueOf(this.deviceType_);
        return valueOf == null ? DeviceType.UNRECOGNIZED : valueOf;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public int getContypeValue() {
        return this.contype_;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public ConnectionType getContype() {
        ConnectionType valueOf = ConnectionType.valueOf(this.contype_);
        return valueOf == null ? ConnectionType.UNRECOGNIZED : valueOf;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public String getAppVer() {
        Object obj = this.appVer_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.appVer_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public ByteString getAppVerBytes() {
        Object obj = this.appVer_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.appVer_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public String getSessionId() {
        Object obj = this.sessionId_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.sessionId_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public ByteString getSessionIdBytes() {
        Object obj = this.sessionId_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sessionId_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public boolean hasExt() {
        return this.ext_ != null;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public Struct getExt() {
        Struct struct = this.ext_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public StructOrBuilder getExtOrBuilder() {
        return getExt();
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public String getMake() {
        Object obj = this.make_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.make_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public ByteString getMakeBytes() {
        Object obj = this.make_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.make_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public String getModel() {
        Object obj = this.model_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.model_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public ByteString getModelBytes() {
        Object obj = this.model_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.model_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public String getHwv() {
        Object obj = this.hwv_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.hwv_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public ByteString getHwvBytes() {
        Object obj = this.hwv_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.hwv_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public boolean hasContext() {
        return this.context_ != null;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public Context getContext() {
        Context context = this.context_;
        return context == null ? Context.getDefaultInstance() : context;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public ContextOrBuilder getContextOrBuilder() {
        return getContext();
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public boolean hasAndroid() {
        return this.platformDataCase_ == 20;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public AndroidPlatformData getAndroid() {
        if (this.platformDataCase_ == 20) {
            return (AndroidPlatformData) this.platformData_;
        }
        return AndroidPlatformData.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public AndroidPlatformDataOrBuilder getAndroidOrBuilder() {
        if (this.platformDataCase_ == 20) {
            return (AndroidPlatformData) this.platformData_;
        }
        return AndroidPlatformData.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public boolean hasIos() {
        return this.platformDataCase_ == 21;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public iOSPlatformData getIos() {
        if (this.platformDataCase_ == 21) {
            return (iOSPlatformData) this.platformData_;
        }
        return iOSPlatformData.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public iOSPlatformDataOrBuilder getIosOrBuilder() {
        if (this.platformDataCase_ == 21) {
            return (iOSPlatformData) this.platformData_;
        }
        return iOSPlatformData.getDefaultInstance();
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b = this.memoizedIsInitialized;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!getSellerIdBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.sellerId_);
        }
        if (!getBundleBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.bundle_);
        }
        if (this.os_ != OS.OS_INVALID.getNumber()) {
            codedOutputStream.writeEnum(3, this.os_);
        }
        if (!getOsvBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 4, this.osv_);
        }
        if (this.geo_ != null) {
            codedOutputStream.writeMessage(5, getGeo());
        }
        if (!getSdkBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 6, this.sdk_);
        }
        if (!getSdkverBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 7, this.sdkver_);
        }
        if (!getIfaBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 8, this.ifa_);
        }
        if (this.deviceType_ != DeviceType.DEVICE_TYPE_INVALID.getNumber()) {
            codedOutputStream.writeEnum(9, this.deviceType_);
        }
        if (this.contype_ != ConnectionType.CONNECTION_TYPE_INVALID.getNumber()) {
            codedOutputStream.writeEnum(10, this.contype_);
        }
        if (!getIfvBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 11, this.ifv_);
        }
        if (!getBmIfvBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 12, this.bmIfv_);
        }
        if (!getAppVerBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 13, this.appVer_);
        }
        if (!getSessionIdBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 14, this.sessionId_);
        }
        if (this.ext_ != null) {
            codedOutputStream.writeMessage(15, getExt());
        }
        if (!getMakeBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 16, this.make_);
        }
        if (!getModelBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 17, this.model_);
        }
        if (!getHwvBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 18, this.hwv_);
        }
        if (this.context_ != null) {
            codedOutputStream.writeMessage(19, getContext());
        }
        if (this.platformDataCase_ == 20) {
            codedOutputStream.writeMessage(20, (AndroidPlatformData) this.platformData_);
        }
        if (this.platformDataCase_ == 21) {
            codedOutputStream.writeMessage(21, (iOSPlatformData) this.platformData_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int computeStringSize = !getSellerIdBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.sellerId_) : 0;
        if (!getBundleBytes().isEmpty()) {
            computeStringSize += GeneratedMessageV3.computeStringSize(2, this.bundle_);
        }
        if (this.os_ != OS.OS_INVALID.getNumber()) {
            computeStringSize += CodedOutputStream.computeEnumSize(3, this.os_);
        }
        if (!getOsvBytes().isEmpty()) {
            computeStringSize += GeneratedMessageV3.computeStringSize(4, this.osv_);
        }
        if (this.geo_ != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(5, getGeo());
        }
        if (!getSdkBytes().isEmpty()) {
            computeStringSize += GeneratedMessageV3.computeStringSize(6, this.sdk_);
        }
        if (!getSdkverBytes().isEmpty()) {
            computeStringSize += GeneratedMessageV3.computeStringSize(7, this.sdkver_);
        }
        if (!getIfaBytes().isEmpty()) {
            computeStringSize += GeneratedMessageV3.computeStringSize(8, this.ifa_);
        }
        if (this.deviceType_ != DeviceType.DEVICE_TYPE_INVALID.getNumber()) {
            computeStringSize += CodedOutputStream.computeEnumSize(9, this.deviceType_);
        }
        if (this.contype_ != ConnectionType.CONNECTION_TYPE_INVALID.getNumber()) {
            computeStringSize += CodedOutputStream.computeEnumSize(10, this.contype_);
        }
        if (!getIfvBytes().isEmpty()) {
            computeStringSize += GeneratedMessageV3.computeStringSize(11, this.ifv_);
        }
        if (!getBmIfvBytes().isEmpty()) {
            computeStringSize += GeneratedMessageV3.computeStringSize(12, this.bmIfv_);
        }
        if (!getAppVerBytes().isEmpty()) {
            computeStringSize += GeneratedMessageV3.computeStringSize(13, this.appVer_);
        }
        if (!getSessionIdBytes().isEmpty()) {
            computeStringSize += GeneratedMessageV3.computeStringSize(14, this.sessionId_);
        }
        if (this.ext_ != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(15, getExt());
        }
        if (!getMakeBytes().isEmpty()) {
            computeStringSize += GeneratedMessageV3.computeStringSize(16, this.make_);
        }
        if (!getModelBytes().isEmpty()) {
            computeStringSize += GeneratedMessageV3.computeStringSize(17, this.model_);
        }
        if (!getHwvBytes().isEmpty()) {
            computeStringSize += GeneratedMessageV3.computeStringSize(18, this.hwv_);
        }
        if (this.context_ != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(19, getContext());
        }
        if (this.platformDataCase_ == 20) {
            computeStringSize += CodedOutputStream.computeMessageSize(20, (AndroidPlatformData) this.platformData_);
        }
        if (this.platformDataCase_ == 21) {
            computeStringSize += CodedOutputStream.computeMessageSize(21, (iOSPlatformData) this.platformData_);
        }
        int serializedSize = computeStringSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InitRequest)) {
            return super.equals(obj);
        }
        InitRequest initRequest = (InitRequest) obj;
        if (!getSellerId().equals(initRequest.getSellerId()) || !getBundle().equals(initRequest.getBundle()) || this.os_ != initRequest.os_ || !getOsv().equals(initRequest.getOsv()) || hasGeo() != initRequest.hasGeo()) {
            return false;
        }
        if ((hasGeo() && !getGeo().equals(initRequest.getGeo())) || !getSdk().equals(initRequest.getSdk()) || !getSdkver().equals(initRequest.getSdkver()) || !getIfa().equals(initRequest.getIfa()) || !getIfv().equals(initRequest.getIfv()) || !getBmIfv().equals(initRequest.getBmIfv()) || this.deviceType_ != initRequest.deviceType_ || this.contype_ != initRequest.contype_ || !getAppVer().equals(initRequest.getAppVer()) || !getSessionId().equals(initRequest.getSessionId()) || hasExt() != initRequest.hasExt()) {
            return false;
        }
        if ((hasExt() && !getExt().equals(initRequest.getExt())) || !getMake().equals(initRequest.getMake()) || !getModel().equals(initRequest.getModel()) || !getHwv().equals(initRequest.getHwv()) || hasContext() != initRequest.hasContext()) {
            return false;
        }
        if ((hasContext() && !getContext().equals(initRequest.getContext())) || !getPlatformDataCase().equals(initRequest.getPlatformDataCase())) {
            return false;
        }
        int i = this.platformDataCase_;
        if (i == 20) {
            if (!getAndroid().equals(initRequest.getAndroid())) {
                return false;
            }
        } else if (i == 21 && !getIos().equals(initRequest.getIos())) {
            return false;
        }
        return this.unknownFields.equals(initRequest.unknownFields);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i;
        int hashCode;
        int i2 = this.memoizedHashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode2 = ((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getSellerId().hashCode()) * 37) + 2) * 53) + getBundle().hashCode()) * 37) + 3) * 53) + this.os_) * 37) + 4) * 53) + getOsv().hashCode();
        if (hasGeo()) {
            hashCode2 = (((hashCode2 * 37) + 5) * 53) + getGeo().hashCode();
        }
        int hashCode3 = (((((((((((((((((((((((((((((((((((hashCode2 * 37) + 6) * 53) + getSdk().hashCode()) * 37) + 7) * 53) + getSdkver().hashCode()) * 37) + 8) * 53) + getIfa().hashCode()) * 37) + 11) * 53) + getIfv().hashCode()) * 37) + 12) * 53) + getBmIfv().hashCode()) * 37) + 9) * 53) + this.deviceType_) * 37) + 10) * 53) + this.contype_) * 37) + 13) * 53) + getAppVer().hashCode()) * 37) + 14) * 53) + getSessionId().hashCode();
        if (hasExt()) {
            hashCode3 = (((hashCode3 * 37) + 15) * 53) + getExt().hashCode();
        }
        int hashCode4 = (((((((((((hashCode3 * 37) + 16) * 53) + getMake().hashCode()) * 37) + 17) * 53) + getModel().hashCode()) * 37) + 18) * 53) + getHwv().hashCode();
        if (hasContext()) {
            hashCode4 = (((hashCode4 * 37) + 19) * 53) + getContext().hashCode();
        }
        int i3 = this.platformDataCase_;
        if (i3 == 20) {
            i = ((hashCode4 * 37) + 20) * 53;
            hashCode = getAndroid().hashCode();
        } else {
            if (i3 == 21) {
                i = ((hashCode4 * 37) + 21) * 53;
                hashCode = getIos().hashCode();
            }
            int hashCode5 = (hashCode4 * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode5;
            return hashCode5;
        }
        hashCode4 = i + hashCode;
        int hashCode52 = (hashCode4 * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode52;
        return hashCode52;
    }

    public static InitRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (InitRequest) PARSER.parseFrom(byteBuffer);
    }

    public static InitRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (InitRequest) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static InitRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (InitRequest) PARSER.parseFrom(byteString);
    }

    public static InitRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (InitRequest) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static InitRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (InitRequest) PARSER.parseFrom(bArr);
    }

    public static InitRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (InitRequest) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static InitRequest parseFrom(InputStream inputStream) throws IOException {
        return (InitRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static InitRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (InitRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static InitRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (InitRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static InitRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (InitRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static InitRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (InitRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static InitRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (InitRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(InitRequest initRequest) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(initRequest);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.GeneratedMessageV3
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static final class Builder extends GeneratedMessageV3.Builder implements InitRequestOrBuilder {
        private SingleFieldBuilderV3 androidBuilder_;
        private Object appVer_;
        private Object bmIfv_;
        private Object bundle_;
        private SingleFieldBuilderV3 contextBuilder_;
        private Context context_;
        private int contype_;
        private int deviceType_;
        private SingleFieldBuilderV3 extBuilder_;
        private Struct ext_;
        private SingleFieldBuilderV3 geoBuilder_;
        private Context.Geo geo_;
        private Object hwv_;
        private Object ifa_;
        private Object ifv_;
        private SingleFieldBuilderV3 iosBuilder_;
        private Object make_;
        private Object model_;
        private int os_;
        private Object osv_;
        private int platformDataCase_;
        private Object platformData_;
        private Object sdk_;
        private Object sdkver_;
        private Object sellerId_;
        private Object sessionId_;

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return InitProto.internal_static_bidmachine_protobuf_InitRequest_descriptor;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return InitProto.internal_static_bidmachine_protobuf_InitRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(InitRequest.class, Builder.class);
        }

        private Builder() {
            this.platformDataCase_ = 0;
            this.sellerId_ = "";
            this.bundle_ = "";
            this.os_ = 0;
            this.osv_ = "";
            this.sdk_ = "";
            this.sdkver_ = "";
            this.ifa_ = "";
            this.ifv_ = "";
            this.bmIfv_ = "";
            this.deviceType_ = 0;
            this.contype_ = 0;
            this.appVer_ = "";
            this.sessionId_ = "";
            this.make_ = "";
            this.model_ = "";
            this.hwv_ = "";
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.platformDataCase_ = 0;
            this.sellerId_ = "";
            this.bundle_ = "";
            this.os_ = 0;
            this.osv_ = "";
            this.sdk_ = "";
            this.sdkver_ = "";
            this.ifa_ = "";
            this.ifv_ = "";
            this.bmIfv_ = "";
            this.deviceType_ = 0;
            this.contype_ = 0;
            this.appVer_ = "";
            this.sessionId_ = "";
            this.make_ = "";
            this.model_ = "";
            this.hwv_ = "";
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.sellerId_ = "";
            this.bundle_ = "";
            this.os_ = 0;
            this.osv_ = "";
            if (this.geoBuilder_ == null) {
                this.geo_ = null;
            } else {
                this.geo_ = null;
                this.geoBuilder_ = null;
            }
            this.sdk_ = "";
            this.sdkver_ = "";
            this.ifa_ = "";
            this.ifv_ = "";
            this.bmIfv_ = "";
            this.deviceType_ = 0;
            this.contype_ = 0;
            this.appVer_ = "";
            this.sessionId_ = "";
            if (this.extBuilder_ == null) {
                this.ext_ = null;
            } else {
                this.ext_ = null;
                this.extBuilder_ = null;
            }
            this.make_ = "";
            this.model_ = "";
            this.hwv_ = "";
            if (this.contextBuilder_ == null) {
                this.context_ = null;
            } else {
                this.context_ = null;
                this.contextBuilder_ = null;
            }
            this.platformDataCase_ = 0;
            this.platformData_ = null;
            return this;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return InitProto.internal_static_bidmachine_protobuf_InitRequest_descriptor;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* renamed from: getDefaultInstanceForType */
        public InitRequest mo3244getDefaultInstanceForType() {
            return InitRequest.getDefaultInstance();
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public InitRequest build() {
            InitRequest buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public InitRequest buildPartial() {
            InitRequest initRequest = new InitRequest(this);
            initRequest.sellerId_ = this.sellerId_;
            initRequest.bundle_ = this.bundle_;
            initRequest.os_ = this.os_;
            initRequest.osv_ = this.osv_;
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.geoBuilder_;
            if (singleFieldBuilderV3 == null) {
                initRequest.geo_ = this.geo_;
            } else {
                initRequest.geo_ = (Context.Geo) singleFieldBuilderV3.build();
            }
            initRequest.sdk_ = this.sdk_;
            initRequest.sdkver_ = this.sdkver_;
            initRequest.ifa_ = this.ifa_;
            initRequest.ifv_ = this.ifv_;
            initRequest.bmIfv_ = this.bmIfv_;
            initRequest.deviceType_ = this.deviceType_;
            initRequest.contype_ = this.contype_;
            initRequest.appVer_ = this.appVer_;
            initRequest.sessionId_ = this.sessionId_;
            SingleFieldBuilderV3 singleFieldBuilderV32 = this.extBuilder_;
            if (singleFieldBuilderV32 == null) {
                initRequest.ext_ = this.ext_;
            } else {
                initRequest.ext_ = (Struct) singleFieldBuilderV32.build();
            }
            initRequest.make_ = this.make_;
            initRequest.model_ = this.model_;
            initRequest.hwv_ = this.hwv_;
            SingleFieldBuilderV3 singleFieldBuilderV33 = this.contextBuilder_;
            if (singleFieldBuilderV33 == null) {
                initRequest.context_ = this.context_;
            } else {
                initRequest.context_ = (Context) singleFieldBuilderV33.build();
            }
            if (this.platformDataCase_ == 20) {
                SingleFieldBuilderV3 singleFieldBuilderV34 = this.androidBuilder_;
                if (singleFieldBuilderV34 == null) {
                    initRequest.platformData_ = this.platformData_;
                } else {
                    initRequest.platformData_ = singleFieldBuilderV34.build();
                }
            }
            if (this.platformDataCase_ == 21) {
                SingleFieldBuilderV3 singleFieldBuilderV35 = this.iosBuilder_;
                if (singleFieldBuilderV35 == null) {
                    initRequest.platformData_ = this.platformData_;
                } else {
                    initRequest.platformData_ = singleFieldBuilderV35.build();
                }
            }
            initRequest.platformDataCase_ = this.platformDataCase_;
            onBuilt();
            return initRequest;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder
        /* renamed from: clone */
        public Builder mo3223clone() {
            return (Builder) super.mo3223clone();
        }

        @Override // com.explorestack.protobuf.Message.Builder
        public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.setField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (Builder) super.clearOneof(oneofDescriptor);
        }

        @Override // com.explorestack.protobuf.Message.Builder
        public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
            return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
        }

        @Override // com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof InitRequest) {
                return mergeFrom((InitRequest) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(InitRequest initRequest) {
            if (initRequest == InitRequest.getDefaultInstance()) {
                return this;
            }
            if (!initRequest.getSellerId().isEmpty()) {
                this.sellerId_ = initRequest.sellerId_;
                onChanged();
            }
            if (!initRequest.getBundle().isEmpty()) {
                this.bundle_ = initRequest.bundle_;
                onChanged();
            }
            if (initRequest.os_ != 0) {
                setOsValue(initRequest.getOsValue());
            }
            if (!initRequest.getOsv().isEmpty()) {
                this.osv_ = initRequest.osv_;
                onChanged();
            }
            if (initRequest.hasGeo()) {
                mergeGeo(initRequest.getGeo());
            }
            if (!initRequest.getSdk().isEmpty()) {
                this.sdk_ = initRequest.sdk_;
                onChanged();
            }
            if (!initRequest.getSdkver().isEmpty()) {
                this.sdkver_ = initRequest.sdkver_;
                onChanged();
            }
            if (!initRequest.getIfa().isEmpty()) {
                this.ifa_ = initRequest.ifa_;
                onChanged();
            }
            if (!initRequest.getIfv().isEmpty()) {
                this.ifv_ = initRequest.ifv_;
                onChanged();
            }
            if (!initRequest.getBmIfv().isEmpty()) {
                this.bmIfv_ = initRequest.bmIfv_;
                onChanged();
            }
            if (initRequest.deviceType_ != 0) {
                setDeviceTypeValue(initRequest.getDeviceTypeValue());
            }
            if (initRequest.contype_ != 0) {
                setContypeValue(initRequest.getContypeValue());
            }
            if (!initRequest.getAppVer().isEmpty()) {
                this.appVer_ = initRequest.appVer_;
                onChanged();
            }
            if (!initRequest.getSessionId().isEmpty()) {
                this.sessionId_ = initRequest.sessionId_;
                onChanged();
            }
            if (initRequest.hasExt()) {
                mergeExt(initRequest.getExt());
            }
            if (!initRequest.getMake().isEmpty()) {
                this.make_ = initRequest.make_;
                onChanged();
            }
            if (!initRequest.getModel().isEmpty()) {
                this.model_ = initRequest.model_;
                onChanged();
            }
            if (!initRequest.getHwv().isEmpty()) {
                this.hwv_ = initRequest.hwv_;
                onChanged();
            }
            if (initRequest.hasContext()) {
                mergeContext(initRequest.getContext());
            }
            int i = AnonymousClass2.$SwitchMap$io$bidmachine$protobuf$InitRequest$PlatformDataCase[initRequest.getPlatformDataCase().ordinal()];
            if (i == 1) {
                mergeAndroid(initRequest.getAndroid());
            } else if (i == 2) {
                mergeIos(initRequest.getIos());
            }
            mergeUnknownFields(((GeneratedMessageV3) initRequest).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            InitRequest initRequest = null;
            try {
                try {
                    InitRequest initRequest2 = (InitRequest) InitRequest.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (initRequest2 != null) {
                        mergeFrom(initRequest2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    InitRequest initRequest3 = (InitRequest) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        initRequest = initRequest3;
                        if (initRequest != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (initRequest != null) {
                    mergeFrom(initRequest);
                }
                throw th;
            }
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public PlatformDataCase getPlatformDataCase() {
            return PlatformDataCase.forNumber(this.platformDataCase_);
        }

        public Builder clearPlatformData() {
            this.platformDataCase_ = 0;
            this.platformData_ = null;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public String getSellerId() {
            Object obj = this.sellerId_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.sellerId_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public ByteString getSellerIdBytes() {
            Object obj = this.sellerId_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.sellerId_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setSellerId(String str) {
            str.getClass();
            this.sellerId_ = str;
            onChanged();
            return this;
        }

        public Builder clearSellerId() {
            this.sellerId_ = InitRequest.getDefaultInstance().getSellerId();
            onChanged();
            return this;
        }

        public Builder setSellerIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.sellerId_ = byteString;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public String getBundle() {
            Object obj = this.bundle_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.bundle_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public ByteString getBundleBytes() {
            Object obj = this.bundle_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.bundle_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setBundle(String str) {
            str.getClass();
            this.bundle_ = str;
            onChanged();
            return this;
        }

        public Builder clearBundle() {
            this.bundle_ = InitRequest.getDefaultInstance().getBundle();
            onChanged();
            return this;
        }

        public Builder setBundleBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.bundle_ = byteString;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public int getOsValue() {
            return this.os_;
        }

        public Builder setOsValue(int i) {
            this.os_ = i;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public OS getOs() {
            OS valueOf = OS.valueOf(this.os_);
            return valueOf == null ? OS.UNRECOGNIZED : valueOf;
        }

        public Builder setOs(OS os) {
            os.getClass();
            this.os_ = os.getNumber();
            onChanged();
            return this;
        }

        public Builder clearOs() {
            this.os_ = 0;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public String getOsv() {
            Object obj = this.osv_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.osv_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public ByteString getOsvBytes() {
            Object obj = this.osv_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.osv_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setOsv(String str) {
            str.getClass();
            this.osv_ = str;
            onChanged();
            return this;
        }

        public Builder clearOsv() {
            this.osv_ = InitRequest.getDefaultInstance().getOsv();
            onChanged();
            return this;
        }

        public Builder setOsvBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.osv_ = byteString;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public boolean hasGeo() {
            return (this.geoBuilder_ == null && this.geo_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public Context.Geo getGeo() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.geoBuilder_;
            if (singleFieldBuilderV3 == null) {
                Context.Geo geo = this.geo_;
                return geo == null ? Context.Geo.getDefaultInstance() : geo;
            }
            return (Context.Geo) singleFieldBuilderV3.getMessage();
        }

        public Builder setGeo(Context.Geo geo) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.geoBuilder_;
            if (singleFieldBuilderV3 == null) {
                geo.getClass();
                this.geo_ = geo;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(geo);
            }
            return this;
        }

        public Builder setGeo(Context.Geo.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.geoBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.geo_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeGeo(Context.Geo geo) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.geoBuilder_;
            if (singleFieldBuilderV3 == null) {
                Context.Geo geo2 = this.geo_;
                if (geo2 != null) {
                    this.geo_ = Context.Geo.newBuilder(geo2).mergeFrom(geo).buildPartial();
                } else {
                    this.geo_ = geo;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(geo);
            }
            return this;
        }

        public Builder clearGeo() {
            if (this.geoBuilder_ == null) {
                this.geo_ = null;
                onChanged();
            } else {
                this.geo_ = null;
                this.geoBuilder_ = null;
            }
            return this;
        }

        public Context.Geo.Builder getGeoBuilder() {
            onChanged();
            return (Context.Geo.Builder) getGeoFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public Context.GeoOrBuilder getGeoOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.geoBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (Context.GeoOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            Context.Geo geo = this.geo_;
            return geo == null ? Context.Geo.getDefaultInstance() : geo;
        }

        private SingleFieldBuilderV3 getGeoFieldBuilder() {
            if (this.geoBuilder_ == null) {
                this.geoBuilder_ = new SingleFieldBuilderV3(getGeo(), getParentForChildren(), isClean());
                this.geo_ = null;
            }
            return this.geoBuilder_;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public String getSdk() {
            Object obj = this.sdk_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.sdk_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public ByteString getSdkBytes() {
            Object obj = this.sdk_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.sdk_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setSdk(String str) {
            str.getClass();
            this.sdk_ = str;
            onChanged();
            return this;
        }

        public Builder clearSdk() {
            this.sdk_ = InitRequest.getDefaultInstance().getSdk();
            onChanged();
            return this;
        }

        public Builder setSdkBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.sdk_ = byteString;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public String getSdkver() {
            Object obj = this.sdkver_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.sdkver_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public ByteString getSdkverBytes() {
            Object obj = this.sdkver_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.sdkver_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setSdkver(String str) {
            str.getClass();
            this.sdkver_ = str;
            onChanged();
            return this;
        }

        public Builder clearSdkver() {
            this.sdkver_ = InitRequest.getDefaultInstance().getSdkver();
            onChanged();
            return this;
        }

        public Builder setSdkverBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.sdkver_ = byteString;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public String getIfa() {
            Object obj = this.ifa_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.ifa_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public ByteString getIfaBytes() {
            Object obj = this.ifa_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.ifa_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setIfa(String str) {
            str.getClass();
            this.ifa_ = str;
            onChanged();
            return this;
        }

        public Builder clearIfa() {
            this.ifa_ = InitRequest.getDefaultInstance().getIfa();
            onChanged();
            return this;
        }

        public Builder setIfaBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.ifa_ = byteString;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public String getIfv() {
            Object obj = this.ifv_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.ifv_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public ByteString getIfvBytes() {
            Object obj = this.ifv_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.ifv_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setIfv(String str) {
            str.getClass();
            this.ifv_ = str;
            onChanged();
            return this;
        }

        public Builder clearIfv() {
            this.ifv_ = InitRequest.getDefaultInstance().getIfv();
            onChanged();
            return this;
        }

        public Builder setIfvBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.ifv_ = byteString;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public String getBmIfv() {
            Object obj = this.bmIfv_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.bmIfv_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public ByteString getBmIfvBytes() {
            Object obj = this.bmIfv_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.bmIfv_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setBmIfv(String str) {
            str.getClass();
            this.bmIfv_ = str;
            onChanged();
            return this;
        }

        public Builder clearBmIfv() {
            this.bmIfv_ = InitRequest.getDefaultInstance().getBmIfv();
            onChanged();
            return this;
        }

        public Builder setBmIfvBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.bmIfv_ = byteString;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public int getDeviceTypeValue() {
            return this.deviceType_;
        }

        public Builder setDeviceTypeValue(int i) {
            this.deviceType_ = i;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public DeviceType getDeviceType() {
            DeviceType valueOf = DeviceType.valueOf(this.deviceType_);
            return valueOf == null ? DeviceType.UNRECOGNIZED : valueOf;
        }

        public Builder setDeviceType(DeviceType deviceType) {
            deviceType.getClass();
            this.deviceType_ = deviceType.getNumber();
            onChanged();
            return this;
        }

        public Builder clearDeviceType() {
            this.deviceType_ = 0;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public int getContypeValue() {
            return this.contype_;
        }

        public Builder setContypeValue(int i) {
            this.contype_ = i;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public ConnectionType getContype() {
            ConnectionType valueOf = ConnectionType.valueOf(this.contype_);
            return valueOf == null ? ConnectionType.UNRECOGNIZED : valueOf;
        }

        public Builder setContype(ConnectionType connectionType) {
            connectionType.getClass();
            this.contype_ = connectionType.getNumber();
            onChanged();
            return this;
        }

        public Builder clearContype() {
            this.contype_ = 0;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public String getAppVer() {
            Object obj = this.appVer_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.appVer_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public ByteString getAppVerBytes() {
            Object obj = this.appVer_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.appVer_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setAppVer(String str) {
            str.getClass();
            this.appVer_ = str;
            onChanged();
            return this;
        }

        public Builder clearAppVer() {
            this.appVer_ = InitRequest.getDefaultInstance().getAppVer();
            onChanged();
            return this;
        }

        public Builder setAppVerBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.appVer_ = byteString;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public String getSessionId() {
            Object obj = this.sessionId_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.sessionId_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public ByteString getSessionIdBytes() {
            Object obj = this.sessionId_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.sessionId_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setSessionId(String str) {
            str.getClass();
            this.sessionId_ = str;
            onChanged();
            return this;
        }

        public Builder clearSessionId() {
            this.sessionId_ = InitRequest.getDefaultInstance().getSessionId();
            onChanged();
            return this;
        }

        public Builder setSessionIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.sessionId_ = byteString;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public boolean hasExt() {
            return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public Struct getExt() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.extBuilder_;
            if (singleFieldBuilderV3 == null) {
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }
            return (Struct) singleFieldBuilderV3.getMessage();
        }

        public Builder setExt(Struct struct) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.extBuilder_;
            if (singleFieldBuilderV3 == null) {
                struct.getClass();
                this.ext_ = struct;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(struct);
            }
            return this;
        }

        public Builder setExt(Struct.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.extBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.ext_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeExt(Struct struct) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.extBuilder_;
            if (singleFieldBuilderV3 == null) {
                Struct struct2 = this.ext_;
                if (struct2 != null) {
                    this.ext_ = Struct.newBuilder(struct2).mergeFrom(struct).buildPartial();
                } else {
                    this.ext_ = struct;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(struct);
            }
            return this;
        }

        public Builder clearExt() {
            if (this.extBuilder_ == null) {
                this.ext_ = null;
                onChanged();
            } else {
                this.ext_ = null;
                this.extBuilder_ = null;
            }
            return this;
        }

        public Struct.Builder getExtBuilder() {
            onChanged();
            return (Struct.Builder) getExtFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public StructOrBuilder getExtOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.extBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StructOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        private SingleFieldBuilderV3 getExtFieldBuilder() {
            if (this.extBuilder_ == null) {
                this.extBuilder_ = new SingleFieldBuilderV3(getExt(), getParentForChildren(), isClean());
                this.ext_ = null;
            }
            return this.extBuilder_;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public String getMake() {
            Object obj = this.make_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.make_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public ByteString getMakeBytes() {
            Object obj = this.make_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.make_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setMake(String str) {
            str.getClass();
            this.make_ = str;
            onChanged();
            return this;
        }

        public Builder clearMake() {
            this.make_ = InitRequest.getDefaultInstance().getMake();
            onChanged();
            return this;
        }

        public Builder setMakeBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.make_ = byteString;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public String getModel() {
            Object obj = this.model_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.model_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public ByteString getModelBytes() {
            Object obj = this.model_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.model_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setModel(String str) {
            str.getClass();
            this.model_ = str;
            onChanged();
            return this;
        }

        public Builder clearModel() {
            this.model_ = InitRequest.getDefaultInstance().getModel();
            onChanged();
            return this;
        }

        public Builder setModelBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.model_ = byteString;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public String getHwv() {
            Object obj = this.hwv_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.hwv_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public ByteString getHwvBytes() {
            Object obj = this.hwv_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.hwv_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setHwv(String str) {
            str.getClass();
            this.hwv_ = str;
            onChanged();
            return this;
        }

        public Builder clearHwv() {
            this.hwv_ = InitRequest.getDefaultInstance().getHwv();
            onChanged();
            return this;
        }

        public Builder setHwvBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.hwv_ = byteString;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public boolean hasContext() {
            return (this.contextBuilder_ == null && this.context_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public Context getContext() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.contextBuilder_;
            if (singleFieldBuilderV3 == null) {
                Context context = this.context_;
                return context == null ? Context.getDefaultInstance() : context;
            }
            return (Context) singleFieldBuilderV3.getMessage();
        }

        public Builder setContext(Context context) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.contextBuilder_;
            if (singleFieldBuilderV3 == null) {
                context.getClass();
                this.context_ = context;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(context);
            }
            return this;
        }

        public Builder setContext(Context.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.contextBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.context_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeContext(Context context) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.contextBuilder_;
            if (singleFieldBuilderV3 == null) {
                Context context2 = this.context_;
                if (context2 != null) {
                    this.context_ = Context.newBuilder(context2).mergeFrom(context).buildPartial();
                } else {
                    this.context_ = context;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(context);
            }
            return this;
        }

        public Builder clearContext() {
            if (this.contextBuilder_ == null) {
                this.context_ = null;
                onChanged();
            } else {
                this.context_ = null;
                this.contextBuilder_ = null;
            }
            return this;
        }

        public Context.Builder getContextBuilder() {
            onChanged();
            return (Context.Builder) getContextFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public ContextOrBuilder getContextOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.contextBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (ContextOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            Context context = this.context_;
            return context == null ? Context.getDefaultInstance() : context;
        }

        private SingleFieldBuilderV3 getContextFieldBuilder() {
            if (this.contextBuilder_ == null) {
                this.contextBuilder_ = new SingleFieldBuilderV3(getContext(), getParentForChildren(), isClean());
                this.context_ = null;
            }
            return this.contextBuilder_;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public boolean hasAndroid() {
            return this.platformDataCase_ == 20;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public AndroidPlatformData getAndroid() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.androidBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.platformDataCase_ == 20) {
                    return (AndroidPlatformData) this.platformData_;
                }
                return AndroidPlatformData.getDefaultInstance();
            }
            if (this.platformDataCase_ == 20) {
                return (AndroidPlatformData) singleFieldBuilderV3.getMessage();
            }
            return AndroidPlatformData.getDefaultInstance();
        }

        public Builder setAndroid(AndroidPlatformData androidPlatformData) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.androidBuilder_;
            if (singleFieldBuilderV3 == null) {
                androidPlatformData.getClass();
                this.platformData_ = androidPlatformData;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(androidPlatformData);
            }
            this.platformDataCase_ = 20;
            return this;
        }

        public Builder setAndroid(AndroidPlatformData.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.androidBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.platformData_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.platformDataCase_ = 20;
            return this;
        }

        public Builder mergeAndroid(AndroidPlatformData androidPlatformData) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.androidBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.platformDataCase_ == 20 && this.platformData_ != AndroidPlatformData.getDefaultInstance()) {
                    this.platformData_ = AndroidPlatformData.newBuilder((AndroidPlatformData) this.platformData_).mergeFrom(androidPlatformData).buildPartial();
                } else {
                    this.platformData_ = androidPlatformData;
                }
                onChanged();
            } else {
                if (this.platformDataCase_ == 20) {
                    singleFieldBuilderV3.mergeFrom(androidPlatformData);
                }
                this.androidBuilder_.setMessage(androidPlatformData);
            }
            this.platformDataCase_ = 20;
            return this;
        }

        public Builder clearAndroid() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.androidBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.platformDataCase_ == 20) {
                    this.platformDataCase_ = 0;
                    this.platformData_ = null;
                    onChanged();
                }
            } else {
                if (this.platformDataCase_ == 20) {
                    this.platformDataCase_ = 0;
                    this.platformData_ = null;
                }
                singleFieldBuilderV3.clear();
            }
            return this;
        }

        public AndroidPlatformData.Builder getAndroidBuilder() {
            return (AndroidPlatformData.Builder) getAndroidFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public AndroidPlatformDataOrBuilder getAndroidOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3;
            int i = this.platformDataCase_;
            if (i == 20 && (singleFieldBuilderV3 = this.androidBuilder_) != null) {
                return (AndroidPlatformDataOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            if (i == 20) {
                return (AndroidPlatformData) this.platformData_;
            }
            return AndroidPlatformData.getDefaultInstance();
        }

        private SingleFieldBuilderV3 getAndroidFieldBuilder() {
            if (this.androidBuilder_ == null) {
                if (this.platformDataCase_ != 20) {
                    this.platformData_ = AndroidPlatformData.getDefaultInstance();
                }
                this.androidBuilder_ = new SingleFieldBuilderV3((AndroidPlatformData) this.platformData_, getParentForChildren(), isClean());
                this.platformData_ = null;
            }
            this.platformDataCase_ = 20;
            onChanged();
            return this.androidBuilder_;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public boolean hasIos() {
            return this.platformDataCase_ == 21;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public iOSPlatformData getIos() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.iosBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.platformDataCase_ == 21) {
                    return (iOSPlatformData) this.platformData_;
                }
                return iOSPlatformData.getDefaultInstance();
            }
            if (this.platformDataCase_ == 21) {
                return (iOSPlatformData) singleFieldBuilderV3.getMessage();
            }
            return iOSPlatformData.getDefaultInstance();
        }

        public Builder setIos(iOSPlatformData iosplatformdata) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.iosBuilder_;
            if (singleFieldBuilderV3 == null) {
                iosplatformdata.getClass();
                this.platformData_ = iosplatformdata;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(iosplatformdata);
            }
            this.platformDataCase_ = 21;
            return this;
        }

        public Builder setIos(iOSPlatformData.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.iosBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.platformData_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.platformDataCase_ = 21;
            return this;
        }

        public Builder mergeIos(iOSPlatformData iosplatformdata) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.iosBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.platformDataCase_ == 21 && this.platformData_ != iOSPlatformData.getDefaultInstance()) {
                    this.platformData_ = iOSPlatformData.newBuilder((iOSPlatformData) this.platformData_).mergeFrom(iosplatformdata).buildPartial();
                } else {
                    this.platformData_ = iosplatformdata;
                }
                onChanged();
            } else {
                if (this.platformDataCase_ == 21) {
                    singleFieldBuilderV3.mergeFrom(iosplatformdata);
                }
                this.iosBuilder_.setMessage(iosplatformdata);
            }
            this.platformDataCase_ = 21;
            return this;
        }

        public Builder clearIos() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.iosBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.platformDataCase_ == 21) {
                    this.platformDataCase_ = 0;
                    this.platformData_ = null;
                    onChanged();
                }
            } else {
                if (this.platformDataCase_ == 21) {
                    this.platformDataCase_ = 0;
                    this.platformData_ = null;
                }
                singleFieldBuilderV3.clear();
            }
            return this;
        }

        public iOSPlatformData.Builder getIosBuilder() {
            return (iOSPlatformData.Builder) getIosFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public iOSPlatformDataOrBuilder getIosOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3;
            int i = this.platformDataCase_;
            if (i == 21 && (singleFieldBuilderV3 = this.iosBuilder_) != null) {
                return (iOSPlatformDataOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            if (i == 21) {
                return (iOSPlatformData) this.platformData_;
            }
            return iOSPlatformData.getDefaultInstance();
        }

        private SingleFieldBuilderV3 getIosFieldBuilder() {
            if (this.iosBuilder_ == null) {
                if (this.platformDataCase_ != 21) {
                    this.platformData_ = iOSPlatformData.getDefaultInstance();
                }
                this.iosBuilder_ = new SingleFieldBuilderV3((iOSPlatformData) this.platformData_, getParentForChildren(), isClean());
                this.platformData_ = null;
            }
            this.platformDataCase_ = 21;
            onChanged();
            return this.iosBuilder_;
        }

        @Override // com.explorestack.protobuf.Message.Builder
        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFields(unknownFieldSet);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }
    }

    /* renamed from: io.bidmachine.protobuf.InitRequest$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$io$bidmachine$protobuf$InitRequest$PlatformDataCase;

        static {
            int[] iArr = new int[PlatformDataCase.values().length];
            $SwitchMap$io$bidmachine$protobuf$InitRequest$PlatformDataCase = iArr;
            try {
                iArr[PlatformDataCase.ANDROID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$InitRequest$PlatformDataCase[PlatformDataCase.IOS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$InitRequest$PlatformDataCase[PlatformDataCase.PLATFORMDATA_NOT_SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static InitRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Parser getParserForType() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* renamed from: getDefaultInstanceForType */
    public InitRequest mo3244getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
