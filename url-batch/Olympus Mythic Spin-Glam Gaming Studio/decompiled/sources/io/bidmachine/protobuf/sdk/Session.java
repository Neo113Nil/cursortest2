package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.AbstractMessageLite;
import com.explorestack.protobuf.AbstractParser;
import com.explorestack.protobuf.BoolValue;
import com.explorestack.protobuf.BoolValueOrBuilder;
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
import com.explorestack.protobuf.UnknownFieldSet;
import io.bidmachine.protobuf.sdk.ContextualData;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes9.dex */
public final class Session extends GeneratedMessageV3 implements SessionOrBuilder {
    public static final int CONTEXT_FIELD_NUMBER = 2;
    private static final Session DEFAULT_INSTANCE = new Session();
    private static final Parser PARSER = new AbstractParser() { // from class: io.bidmachine.protobuf.sdk.Session.1
        @Override // com.explorestack.protobuf.Parser
        public Session parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new Session(codedInputStream, extensionRegistryLite);
        }
    };
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private Context context_;
    private byte memoizedIsInitialized;
    private volatile Object sessionId_;

    public interface ContextOrBuilder extends MessageOrBuilder {
        ContextualData getData(int i);

        int getDataCount();

        List<ContextualData> getDataList();

        ContextualDataOrBuilder getDataOrBuilder(int i);

        List<? extends ContextualDataOrBuilder> getDataOrBuilderList();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo3244getDefaultInstanceForType();

        BoolValue getIaa();

        BoolValueOrBuilder getIaaOrBuilder();

        BoolValue getIap();

        BoolValueOrBuilder getIapOrBuilder();

        long getLastSessionDuration();

        int getRetention();

        int getSc();

        long getSessionduration();

        boolean hasIaa();

        boolean hasIap();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    private Session(GeneratedMessageV3.Builder builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private Session() {
        this.memoizedIsInitialized = (byte) -1;
        this.sessionId_ = "";
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new Session();
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private Session(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                            this.sessionId_ = codedInputStream.readStringRequireUtf8();
                        } else if (readTag == 18) {
                            Context context = this.context_;
                            Context.Builder builder = context != null ? context.toBuilder() : null;
                            Context context2 = (Context) codedInputStream.readMessage(Context.parser(), extensionRegistryLite);
                            this.context_ = context2;
                            if (builder != null) {
                                builder.mergeFrom(context2);
                                this.context_ = builder.buildPartial();
                            }
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
        return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Session_descriptor;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Session_fieldAccessorTable.ensureFieldAccessorsInitialized(Session.class, Builder.class);
    }

    public static final class Context extends GeneratedMessageV3 implements ContextOrBuilder {
        public static final int DATA_FIELD_NUMBER = 4;
        public static final int IAA_FIELD_NUMBER = 7;
        public static final int IAP_FIELD_NUMBER = 6;
        public static final int LAST_SESSION_DURATION_FIELD_NUMBER = 5;
        public static final int RETENTION_FIELD_NUMBER = 3;
        public static final int SC_FIELD_NUMBER = 2;
        public static final int SESSIONDURATION_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private List<ContextualData> data_;
        private BoolValue iaa_;
        private BoolValue iap_;
        private long lastSessionDuration_;
        private byte memoizedIsInitialized;
        private int retention_;
        private int sc_;
        private long sessionduration_;
        private static final Context DEFAULT_INSTANCE = new Context();
        private static final Parser PARSER = new AbstractParser() { // from class: io.bidmachine.protobuf.sdk.Session.Context.1
            @Override // com.explorestack.protobuf.Parser
            public Context parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Context(codedInputStream, extensionRegistryLite);
            }
        };

        private Context(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        private Context() {
            this.memoizedIsInitialized = (byte) -1;
            this.data_ = Collections.emptyList();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Context();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Context(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            BoolValue.Builder builder;
            extensionRegistryLite.getClass();
            UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                this.sessionduration_ = codedInputStream.readUInt64();
                            } else if (readTag == 16) {
                                this.sc_ = codedInputStream.readUInt32();
                            } else if (readTag == 24) {
                                this.retention_ = codedInputStream.readUInt32();
                            } else if (readTag == 34) {
                                if (!z2) {
                                    this.data_ = new ArrayList();
                                    z2 = true;
                                }
                                this.data_.add(codedInputStream.readMessage(ContextualData.parser(), extensionRegistryLite));
                            } else if (readTag != 40) {
                                if (readTag == 50) {
                                    BoolValue boolValue = this.iap_;
                                    builder = boolValue != null ? boolValue.toBuilder() : null;
                                    BoolValue boolValue2 = (BoolValue) codedInputStream.readMessage(BoolValue.parser(), extensionRegistryLite);
                                    this.iap_ = boolValue2;
                                    if (builder != null) {
                                        builder.mergeFrom(boolValue2);
                                        this.iap_ = builder.buildPartial();
                                    }
                                } else if (readTag == 58) {
                                    BoolValue boolValue3 = this.iaa_;
                                    builder = boolValue3 != null ? boolValue3.toBuilder() : null;
                                    BoolValue boolValue4 = (BoolValue) codedInputStream.readMessage(BoolValue.parser(), extensionRegistryLite);
                                    this.iaa_ = boolValue4;
                                    if (builder != null) {
                                        builder.mergeFrom(boolValue4);
                                        this.iaa_ = builder.buildPartial();
                                    }
                                } else if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                }
                            } else {
                                this.lastSessionDuration_ = codedInputStream.readUInt64();
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if (z2) {
                        this.data_ = Collections.unmodifiableList(this.data_);
                    }
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2) {
                this.data_ = Collections.unmodifiableList(this.data_);
            }
            this.unknownFields = newBuilder.build();
            makeExtensionsImmutable();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Session_Context_descriptor;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Session_Context_fieldAccessorTable.ensureFieldAccessorsInitialized(Context.class, Builder.class);
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public long getSessionduration() {
            return this.sessionduration_;
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public int getSc() {
            return this.sc_;
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public int getRetention() {
            return this.retention_;
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public List<ContextualData> getDataList() {
            return this.data_;
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public List<? extends ContextualDataOrBuilder> getDataOrBuilderList() {
            return this.data_;
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public int getDataCount() {
            return this.data_.size();
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public ContextualData getData(int i) {
            return this.data_.get(i);
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public ContextualDataOrBuilder getDataOrBuilder(int i) {
            return this.data_.get(i);
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public long getLastSessionDuration() {
            return this.lastSessionDuration_;
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public boolean hasIap() {
            return this.iap_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public BoolValue getIap() {
            BoolValue boolValue = this.iap_;
            return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public BoolValueOrBuilder getIapOrBuilder() {
            return getIap();
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public boolean hasIaa() {
            return this.iaa_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public BoolValue getIaa() {
            BoolValue boolValue = this.iaa_;
            return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public BoolValueOrBuilder getIaaOrBuilder() {
            return getIaa();
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
            long j = this.sessionduration_;
            if (j != 0) {
                codedOutputStream.writeUInt64(1, j);
            }
            int i = this.sc_;
            if (i != 0) {
                codedOutputStream.writeUInt32(2, i);
            }
            int i2 = this.retention_;
            if (i2 != 0) {
                codedOutputStream.writeUInt32(3, i2);
            }
            for (int i3 = 0; i3 < this.data_.size(); i3++) {
                codedOutputStream.writeMessage(4, this.data_.get(i3));
            }
            long j2 = this.lastSessionDuration_;
            if (j2 != 0) {
                codedOutputStream.writeUInt64(5, j2);
            }
            if (this.iap_ != null) {
                codedOutputStream.writeMessage(6, getIap());
            }
            if (this.iaa_ != null) {
                codedOutputStream.writeMessage(7, getIaa());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            long j = this.sessionduration_;
            int computeUInt64Size = j != 0 ? CodedOutputStream.computeUInt64Size(1, j) : 0;
            int i2 = this.sc_;
            if (i2 != 0) {
                computeUInt64Size += CodedOutputStream.computeUInt32Size(2, i2);
            }
            int i3 = this.retention_;
            if (i3 != 0) {
                computeUInt64Size += CodedOutputStream.computeUInt32Size(3, i3);
            }
            for (int i4 = 0; i4 < this.data_.size(); i4++) {
                computeUInt64Size += CodedOutputStream.computeMessageSize(4, this.data_.get(i4));
            }
            long j2 = this.lastSessionDuration_;
            if (j2 != 0) {
                computeUInt64Size += CodedOutputStream.computeUInt64Size(5, j2);
            }
            if (this.iap_ != null) {
                computeUInt64Size += CodedOutputStream.computeMessageSize(6, getIap());
            }
            if (this.iaa_ != null) {
                computeUInt64Size += CodedOutputStream.computeMessageSize(7, getIaa());
            }
            int serializedSize = computeUInt64Size + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Context)) {
                return super.equals(obj);
            }
            Context context = (Context) obj;
            if (getSessionduration() != context.getSessionduration() || getSc() != context.getSc() || getRetention() != context.getRetention() || !getDataList().equals(context.getDataList()) || getLastSessionDuration() != context.getLastSessionDuration() || hasIap() != context.hasIap()) {
                return false;
            }
            if ((!hasIap() || getIap().equals(context.getIap())) && hasIaa() == context.hasIaa()) {
                return (!hasIaa() || getIaa().equals(context.getIaa())) && this.unknownFields.equals(context.unknownFields);
            }
            return false;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = ((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Internal.hashLong(getSessionduration())) * 37) + 2) * 53) + getSc()) * 37) + 3) * 53) + getRetention();
            if (getDataCount() > 0) {
                hashCode = (((hashCode * 37) + 4) * 53) + getDataList().hashCode();
            }
            int hashLong = (((hashCode * 37) + 5) * 53) + Internal.hashLong(getLastSessionDuration());
            if (hasIap()) {
                hashLong = (((hashLong * 37) + 6) * 53) + getIap().hashCode();
            }
            if (hasIaa()) {
                hashLong = (((hashLong * 37) + 7) * 53) + getIaa().hashCode();
            }
            int hashCode2 = (hashLong * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public static Context parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Context) PARSER.parseFrom(byteBuffer);
        }

        public static Context parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Context) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Context parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Context) PARSER.parseFrom(byteString);
        }

        public static Context parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Context) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Context parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Context) PARSER.parseFrom(bArr);
        }

        public static Context parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Context) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Context parseFrom(InputStream inputStream) throws IOException {
            return (Context) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Context parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Context) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Context parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Context) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Context parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Context) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Context parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Context) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Context parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Context) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(Context context) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(context);
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

        public static final class Builder extends GeneratedMessageV3.Builder implements ContextOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3 dataBuilder_;
            private List<ContextualData> data_;
            private SingleFieldBuilderV3 iaaBuilder_;
            private BoolValue iaa_;
            private SingleFieldBuilderV3 iapBuilder_;
            private BoolValue iap_;
            private long lastSessionDuration_;
            private int retention_;
            private int sc_;
            private long sessionduration_;

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Session_Context_descriptor;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Session_Context_fieldAccessorTable.ensureFieldAccessorsInitialized(Context.class, Builder.class);
            }

            private Builder() {
                this.data_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.data_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getDataFieldBuilder();
                }
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.sessionduration_ = 0L;
                this.sc_ = 0;
                this.retention_ = 0;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.data_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                this.lastSessionDuration_ = 0L;
                if (this.iapBuilder_ == null) {
                    this.iap_ = null;
                } else {
                    this.iap_ = null;
                    this.iapBuilder_ = null;
                }
                if (this.iaaBuilder_ == null) {
                    this.iaa_ = null;
                } else {
                    this.iaa_ = null;
                    this.iaaBuilder_ = null;
                }
                return this;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Session_Context_descriptor;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* renamed from: getDefaultInstanceForType */
            public Context mo3244getDefaultInstanceForType() {
                return Context.getDefaultInstance();
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Context build() {
                Context buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Context buildPartial() {
                Context context = new Context(this);
                context.sessionduration_ = this.sessionduration_;
                context.sc_ = this.sc_;
                context.retention_ = this.retention_;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    context.data_ = repeatedFieldBuilderV3.build();
                } else {
                    if ((this.bitField0_ & 1) != 0) {
                        this.data_ = Collections.unmodifiableList(this.data_);
                        this.bitField0_ &= -2;
                    }
                    context.data_ = this.data_;
                }
                context.lastSessionDuration_ = this.lastSessionDuration_;
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.iapBuilder_;
                if (singleFieldBuilderV3 == null) {
                    context.iap_ = this.iap_;
                } else {
                    context.iap_ = (BoolValue) singleFieldBuilderV3.build();
                }
                SingleFieldBuilderV3 singleFieldBuilderV32 = this.iaaBuilder_;
                if (singleFieldBuilderV32 == null) {
                    context.iaa_ = this.iaa_;
                } else {
                    context.iaa_ = (BoolValue) singleFieldBuilderV32.build();
                }
                onBuilt();
                return context;
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
                if (message instanceof Context) {
                    return mergeFrom((Context) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Context context) {
                if (context == Context.getDefaultInstance()) {
                    return this;
                }
                if (context.getSessionduration() != 0) {
                    setSessionduration(context.getSessionduration());
                }
                if (context.getSc() != 0) {
                    setSc(context.getSc());
                }
                if (context.getRetention() != 0) {
                    setRetention(context.getRetention());
                }
                if (this.dataBuilder_ == null) {
                    if (!context.data_.isEmpty()) {
                        if (this.data_.isEmpty()) {
                            this.data_ = context.data_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureDataIsMutable();
                            this.data_.addAll(context.data_);
                        }
                        onChanged();
                    }
                } else if (!context.data_.isEmpty()) {
                    if (!this.dataBuilder_.isEmpty()) {
                        this.dataBuilder_.addAllMessages(context.data_);
                    } else {
                        this.dataBuilder_.dispose();
                        this.dataBuilder_ = null;
                        this.data_ = context.data_;
                        this.bitField0_ &= -2;
                        this.dataBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getDataFieldBuilder() : null;
                    }
                }
                if (context.getLastSessionDuration() != 0) {
                    setLastSessionDuration(context.getLastSessionDuration());
                }
                if (context.hasIap()) {
                    mergeIap(context.getIap());
                }
                if (context.hasIaa()) {
                    mergeIaa(context.getIaa());
                }
                mergeUnknownFields(((GeneratedMessageV3) context).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                Context context = null;
                try {
                    try {
                        Context context2 = (Context) Context.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (context2 != null) {
                            mergeFrom(context2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Context context3 = (Context) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            context = context3;
                            if (context != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (context != null) {
                        mergeFrom(context);
                    }
                    throw th;
                }
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public long getSessionduration() {
                return this.sessionduration_;
            }

            public Builder setSessionduration(long j) {
                this.sessionduration_ = j;
                onChanged();
                return this;
            }

            public Builder clearSessionduration() {
                this.sessionduration_ = 0L;
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public int getSc() {
                return this.sc_;
            }

            public Builder setSc(int i) {
                this.sc_ = i;
                onChanged();
                return this;
            }

            public Builder clearSc() {
                this.sc_ = 0;
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public int getRetention() {
                return this.retention_;
            }

            public Builder setRetention(int i) {
                this.retention_ = i;
                onChanged();
                return this;
            }

            public Builder clearRetention() {
                this.retention_ = 0;
                onChanged();
                return this;
            }

            private void ensureDataIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.data_ = new ArrayList(this.data_);
                    this.bitField0_ |= 1;
                }
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public List<ContextualData> getDataList() {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return Collections.unmodifiableList(this.data_);
                }
                return repeatedFieldBuilderV3.getMessageList();
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public int getDataCount() {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.data_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public ContextualData getData(int i) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.data_.get(i);
                }
                return (ContextualData) repeatedFieldBuilderV3.getMessage(i);
            }

            public Builder setData(int i, ContextualData contextualData) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    contextualData.getClass();
                    ensureDataIsMutable();
                    this.data_.set(i, contextualData);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, contextualData);
                }
                return this;
            }

            public Builder setData(int i, ContextualData.Builder builder) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureDataIsMutable();
                    this.data_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder addData(ContextualData contextualData) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    contextualData.getClass();
                    ensureDataIsMutable();
                    this.data_.add(contextualData);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(contextualData);
                }
                return this;
            }

            public Builder addData(int i, ContextualData contextualData) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    contextualData.getClass();
                    ensureDataIsMutable();
                    this.data_.add(i, contextualData);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, contextualData);
                }
                return this;
            }

            public Builder addData(ContextualData.Builder builder) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureDataIsMutable();
                    this.data_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                }
                return this;
            }

            public Builder addData(int i, ContextualData.Builder builder) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureDataIsMutable();
                    this.data_.add(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, builder.build());
                }
                return this;
            }

            public Builder addAllData(Iterable<? extends ContextualData> iterable) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureDataIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.data_);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                }
                return this;
            }

            public Builder clearData() {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.data_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Builder removeData(int i) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureDataIsMutable();
                    this.data_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.remove(i);
                }
                return this;
            }

            public ContextualData.Builder getDataBuilder(int i) {
                return (ContextualData.Builder) getDataFieldBuilder().getBuilder(i);
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public ContextualDataOrBuilder getDataOrBuilder(int i) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.data_.get(i);
                }
                return (ContextualDataOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i);
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public List<? extends ContextualDataOrBuilder> getDataOrBuilderList() {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    return repeatedFieldBuilderV3.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.data_);
            }

            public ContextualData.Builder addDataBuilder() {
                return (ContextualData.Builder) getDataFieldBuilder().addBuilder(ContextualData.getDefaultInstance());
            }

            public ContextualData.Builder addDataBuilder(int i) {
                return (ContextualData.Builder) getDataFieldBuilder().addBuilder(i, ContextualData.getDefaultInstance());
            }

            public List<ContextualData.Builder> getDataBuilderList() {
                return getDataFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3 getDataFieldBuilder() {
                if (this.dataBuilder_ == null) {
                    this.dataBuilder_ = new RepeatedFieldBuilderV3(this.data_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.data_ = null;
                }
                return this.dataBuilder_;
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public long getLastSessionDuration() {
                return this.lastSessionDuration_;
            }

            public Builder setLastSessionDuration(long j) {
                this.lastSessionDuration_ = j;
                onChanged();
                return this;
            }

            public Builder clearLastSessionDuration() {
                this.lastSessionDuration_ = 0L;
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public boolean hasIap() {
                return (this.iapBuilder_ == null && this.iap_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public BoolValue getIap() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.iapBuilder_;
                if (singleFieldBuilderV3 == null) {
                    BoolValue boolValue = this.iap_;
                    return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
                }
                return (BoolValue) singleFieldBuilderV3.getMessage();
            }

            public Builder setIap(BoolValue boolValue) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.iapBuilder_;
                if (singleFieldBuilderV3 == null) {
                    boolValue.getClass();
                    this.iap_ = boolValue;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(boolValue);
                }
                return this;
            }

            public Builder setIap(BoolValue.Builder builder) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.iapBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.iap_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder mergeIap(BoolValue boolValue) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.iapBuilder_;
                if (singleFieldBuilderV3 == null) {
                    BoolValue boolValue2 = this.iap_;
                    if (boolValue2 != null) {
                        this.iap_ = BoolValue.newBuilder(boolValue2).mergeFrom(boolValue).buildPartial();
                    } else {
                        this.iap_ = boolValue;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(boolValue);
                }
                return this;
            }

            public Builder clearIap() {
                if (this.iapBuilder_ == null) {
                    this.iap_ = null;
                    onChanged();
                } else {
                    this.iap_ = null;
                    this.iapBuilder_ = null;
                }
                return this;
            }

            public BoolValue.Builder getIapBuilder() {
                onChanged();
                return (BoolValue.Builder) getIapFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public BoolValueOrBuilder getIapOrBuilder() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.iapBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (BoolValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                BoolValue boolValue = this.iap_;
                return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
            }

            private SingleFieldBuilderV3 getIapFieldBuilder() {
                if (this.iapBuilder_ == null) {
                    this.iapBuilder_ = new SingleFieldBuilderV3(getIap(), getParentForChildren(), isClean());
                    this.iap_ = null;
                }
                return this.iapBuilder_;
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public boolean hasIaa() {
                return (this.iaaBuilder_ == null && this.iaa_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public BoolValue getIaa() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.iaaBuilder_;
                if (singleFieldBuilderV3 == null) {
                    BoolValue boolValue = this.iaa_;
                    return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
                }
                return (BoolValue) singleFieldBuilderV3.getMessage();
            }

            public Builder setIaa(BoolValue boolValue) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.iaaBuilder_;
                if (singleFieldBuilderV3 == null) {
                    boolValue.getClass();
                    this.iaa_ = boolValue;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(boolValue);
                }
                return this;
            }

            public Builder setIaa(BoolValue.Builder builder) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.iaaBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.iaa_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder mergeIaa(BoolValue boolValue) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.iaaBuilder_;
                if (singleFieldBuilderV3 == null) {
                    BoolValue boolValue2 = this.iaa_;
                    if (boolValue2 != null) {
                        this.iaa_ = BoolValue.newBuilder(boolValue2).mergeFrom(boolValue).buildPartial();
                    } else {
                        this.iaa_ = boolValue;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(boolValue);
                }
                return this;
            }

            public Builder clearIaa() {
                if (this.iaaBuilder_ == null) {
                    this.iaa_ = null;
                    onChanged();
                } else {
                    this.iaa_ = null;
                    this.iaaBuilder_ = null;
                }
                return this;
            }

            public BoolValue.Builder getIaaBuilder() {
                onChanged();
                return (BoolValue.Builder) getIaaFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public BoolValueOrBuilder getIaaOrBuilder() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.iaaBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (BoolValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                BoolValue boolValue = this.iaa_;
                return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
            }

            private SingleFieldBuilderV3 getIaaFieldBuilder() {
                if (this.iaaBuilder_ == null) {
                    this.iaaBuilder_ = new SingleFieldBuilderV3(getIaa(), getParentForChildren(), isClean());
                    this.iaa_ = null;
                }
                return this.iaaBuilder_;
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

        public static Context getDefaultInstance() {
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
        public Context mo3244getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    @Override // io.bidmachine.protobuf.sdk.SessionOrBuilder
    public String getSessionId() {
        Object obj = this.sessionId_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.sessionId_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.SessionOrBuilder
    public ByteString getSessionIdBytes() {
        Object obj = this.sessionId_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sessionId_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // io.bidmachine.protobuf.sdk.SessionOrBuilder
    public boolean hasContext() {
        return this.context_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.SessionOrBuilder
    public Context getContext() {
        Context context = this.context_;
        return context == null ? Context.getDefaultInstance() : context;
    }

    @Override // io.bidmachine.protobuf.sdk.SessionOrBuilder
    public ContextOrBuilder getContextOrBuilder() {
        return getContext();
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
        if (!getSessionIdBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.sessionId_);
        }
        if (this.context_ != null) {
            codedOutputStream.writeMessage(2, getContext());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int computeStringSize = !getSessionIdBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.sessionId_) : 0;
        if (this.context_ != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(2, getContext());
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
        if (!(obj instanceof Session)) {
            return super.equals(obj);
        }
        Session session = (Session) obj;
        if (getSessionId().equals(session.getSessionId()) && hasContext() == session.hasContext()) {
            return (!hasContext() || getContext().equals(session.getContext())) && this.unknownFields.equals(session.unknownFields);
        }
        return false;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getSessionId().hashCode();
        if (hasContext()) {
            hashCode = (((hashCode * 37) + 2) * 53) + getContext().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public static Session parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Session) PARSER.parseFrom(byteBuffer);
    }

    public static Session parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Session) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static Session parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Session) PARSER.parseFrom(byteString);
    }

    public static Session parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Session) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static Session parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Session) PARSER.parseFrom(bArr);
    }

    public static Session parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Session) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static Session parseFrom(InputStream inputStream) throws IOException {
        return (Session) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static Session parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Session) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Session parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Session) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Session parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Session) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Session parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Session) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static Session parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Session) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Session session) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(session);
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

    public static final class Builder extends GeneratedMessageV3.Builder implements SessionOrBuilder {
        private SingleFieldBuilderV3 contextBuilder_;
        private Context context_;
        private Object sessionId_;

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Session_descriptor;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Session_fieldAccessorTable.ensureFieldAccessorsInitialized(Session.class, Builder.class);
        }

        private Builder() {
            this.sessionId_ = "";
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.sessionId_ = "";
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.sessionId_ = "";
            if (this.contextBuilder_ == null) {
                this.context_ = null;
            } else {
                this.context_ = null;
                this.contextBuilder_ = null;
            }
            return this;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Session_descriptor;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* renamed from: getDefaultInstanceForType */
        public Session mo3244getDefaultInstanceForType() {
            return Session.getDefaultInstance();
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Session build() {
            Session buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Session buildPartial() {
            Session session = new Session(this);
            session.sessionId_ = this.sessionId_;
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.contextBuilder_;
            if (singleFieldBuilderV3 == null) {
                session.context_ = this.context_;
            } else {
                session.context_ = (Context) singleFieldBuilderV3.build();
            }
            onBuilt();
            return session;
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
            if (message instanceof Session) {
                return mergeFrom((Session) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Session session) {
            if (session == Session.getDefaultInstance()) {
                return this;
            }
            if (!session.getSessionId().isEmpty()) {
                this.sessionId_ = session.sessionId_;
                onChanged();
            }
            if (session.hasContext()) {
                mergeContext(session.getContext());
            }
            mergeUnknownFields(((GeneratedMessageV3) session).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            Session session = null;
            try {
                try {
                    Session session2 = (Session) Session.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (session2 != null) {
                        mergeFrom(session2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    Session session3 = (Session) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        session = session3;
                        if (session != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (session != null) {
                    mergeFrom(session);
                }
                throw th;
            }
        }

        @Override // io.bidmachine.protobuf.sdk.SessionOrBuilder
        public String getSessionId() {
            Object obj = this.sessionId_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.sessionId_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // io.bidmachine.protobuf.sdk.SessionOrBuilder
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
            this.sessionId_ = Session.getDefaultInstance().getSessionId();
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

        @Override // io.bidmachine.protobuf.sdk.SessionOrBuilder
        public boolean hasContext() {
            return (this.contextBuilder_ == null && this.context_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.SessionOrBuilder
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

        @Override // io.bidmachine.protobuf.sdk.SessionOrBuilder
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

        @Override // com.explorestack.protobuf.Message.Builder
        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFields(unknownFieldSet);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }
    }

    public static Session getDefaultInstance() {
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
    public Session mo3244getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
