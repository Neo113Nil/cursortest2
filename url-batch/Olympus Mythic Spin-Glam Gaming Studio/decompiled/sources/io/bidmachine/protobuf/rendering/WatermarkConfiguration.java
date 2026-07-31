package io.bidmachine.protobuf.rendering;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.AbstractMessageLite;
import com.explorestack.protobuf.AbstractParser;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.CodedInputStream;
import com.explorestack.protobuf.CodedOutputStream;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.ExtensionRegistryLite;
import com.explorestack.protobuf.GeneratedMessageV3;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.Parser;
import com.explorestack.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes13.dex */
public final class WatermarkConfiguration extends GeneratedMessageV3 implements WatermarkConfigurationOrBuilder {
    public static final int ALGORITHM_FIELD_NUMBER = 1;
    public static final int BASE_COLOR_RGB_FIELD_NUMBER = 3;
    public static final int LOCATION_FIELD_NUMBER = 4;
    public static final int PAYLOAD_TYPE_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private int algorithm_;
    private volatile Object baseColorRgb_;
    private int location_;
    private byte memoizedIsInitialized;
    private int payloadType_;
    private static final WatermarkConfiguration DEFAULT_INSTANCE = new WatermarkConfiguration();
    private static final Parser PARSER = new AbstractParser() { // from class: io.bidmachine.protobuf.rendering.WatermarkConfiguration.1
        @Override // com.explorestack.protobuf.Parser
        public WatermarkConfiguration parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new WatermarkConfiguration(codedInputStream, extensionRegistryLite);
        }
    };

    private WatermarkConfiguration(GeneratedMessageV3.Builder builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private WatermarkConfiguration() {
        this.memoizedIsInitialized = (byte) -1;
        this.algorithm_ = 0;
        this.payloadType_ = 0;
        this.baseColorRgb_ = "";
        this.location_ = 0;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new WatermarkConfiguration();
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private WatermarkConfiguration(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        extensionRegistryLite.getClass();
        UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 8) {
                            this.algorithm_ = codedInputStream.readEnum();
                        } else if (readTag == 16) {
                            this.payloadType_ = codedInputStream.readEnum();
                        } else if (readTag == 26) {
                            this.baseColorRgb_ = codedInputStream.readStringRequireUtf8();
                        } else if (readTag == 32) {
                            this.location_ = codedInputStream.readEnum();
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
        return RenderingProto.internal_static_bidmachine_protobuf_WatermarkConfiguration_descriptor;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return RenderingProto.internal_static_bidmachine_protobuf_WatermarkConfiguration_fieldAccessorTable.ensureFieldAccessorsInitialized(WatermarkConfiguration.class, Builder.class);
    }

    @Override // io.bidmachine.protobuf.rendering.WatermarkConfigurationOrBuilder
    public int getAlgorithmValue() {
        return this.algorithm_;
    }

    @Override // io.bidmachine.protobuf.rendering.WatermarkConfigurationOrBuilder
    public WatermarkAlgorithm getAlgorithm() {
        WatermarkAlgorithm valueOf = WatermarkAlgorithm.valueOf(this.algorithm_);
        return valueOf == null ? WatermarkAlgorithm.UNRECOGNIZED : valueOf;
    }

    @Override // io.bidmachine.protobuf.rendering.WatermarkConfigurationOrBuilder
    public int getPayloadTypeValue() {
        return this.payloadType_;
    }

    @Override // io.bidmachine.protobuf.rendering.WatermarkConfigurationOrBuilder
    public WatermarkPayloadType getPayloadType() {
        WatermarkPayloadType valueOf = WatermarkPayloadType.valueOf(this.payloadType_);
        return valueOf == null ? WatermarkPayloadType.UNRECOGNIZED : valueOf;
    }

    @Override // io.bidmachine.protobuf.rendering.WatermarkConfigurationOrBuilder
    public String getBaseColorRgb() {
        Object obj = this.baseColorRgb_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.baseColorRgb_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.rendering.WatermarkConfigurationOrBuilder
    public ByteString getBaseColorRgbBytes() {
        Object obj = this.baseColorRgb_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.baseColorRgb_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // io.bidmachine.protobuf.rendering.WatermarkConfigurationOrBuilder
    public int getLocationValue() {
        return this.location_;
    }

    @Override // io.bidmachine.protobuf.rendering.WatermarkConfigurationOrBuilder
    public WatermarkLocation getLocation() {
        WatermarkLocation valueOf = WatermarkLocation.valueOf(this.location_);
        return valueOf == null ? WatermarkLocation.UNRECOGNIZED : valueOf;
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
        if (this.algorithm_ != WatermarkAlgorithm.WM_ALGO_UNSPECIFIED.getNumber()) {
            codedOutputStream.writeEnum(1, this.algorithm_);
        }
        if (this.payloadType_ != WatermarkPayloadType.WM_PAYLOAD_UNSPECIFIED.getNumber()) {
            codedOutputStream.writeEnum(2, this.payloadType_);
        }
        if (!getBaseColorRgbBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.baseColorRgb_);
        }
        if (this.location_ != WatermarkLocation.WM_LOCATION_UNSPECIFIED.getNumber()) {
            codedOutputStream.writeEnum(4, this.location_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int computeEnumSize = this.algorithm_ != WatermarkAlgorithm.WM_ALGO_UNSPECIFIED.getNumber() ? CodedOutputStream.computeEnumSize(1, this.algorithm_) : 0;
        if (this.payloadType_ != WatermarkPayloadType.WM_PAYLOAD_UNSPECIFIED.getNumber()) {
            computeEnumSize += CodedOutputStream.computeEnumSize(2, this.payloadType_);
        }
        if (!getBaseColorRgbBytes().isEmpty()) {
            computeEnumSize += GeneratedMessageV3.computeStringSize(3, this.baseColorRgb_);
        }
        if (this.location_ != WatermarkLocation.WM_LOCATION_UNSPECIFIED.getNumber()) {
            computeEnumSize += CodedOutputStream.computeEnumSize(4, this.location_);
        }
        int serializedSize = computeEnumSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WatermarkConfiguration)) {
            return super.equals(obj);
        }
        WatermarkConfiguration watermarkConfiguration = (WatermarkConfiguration) obj;
        return this.algorithm_ == watermarkConfiguration.algorithm_ && this.payloadType_ == watermarkConfiguration.payloadType_ && getBaseColorRgb().equals(watermarkConfiguration.getBaseColorRgb()) && this.location_ == watermarkConfiguration.location_ && this.unknownFields.equals(watermarkConfiguration.unknownFields);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.algorithm_) * 37) + 2) * 53) + this.payloadType_) * 37) + 3) * 53) + getBaseColorRgb().hashCode()) * 37) + 4) * 53) + this.location_) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    public static WatermarkConfiguration parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WatermarkConfiguration) PARSER.parseFrom(byteBuffer);
    }

    public static WatermarkConfiguration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WatermarkConfiguration) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static WatermarkConfiguration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WatermarkConfiguration) PARSER.parseFrom(byteString);
    }

    public static WatermarkConfiguration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WatermarkConfiguration) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static WatermarkConfiguration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WatermarkConfiguration) PARSER.parseFrom(bArr);
    }

    public static WatermarkConfiguration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WatermarkConfiguration) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static WatermarkConfiguration parseFrom(InputStream inputStream) throws IOException {
        return (WatermarkConfiguration) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static WatermarkConfiguration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WatermarkConfiguration) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static WatermarkConfiguration parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WatermarkConfiguration) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static WatermarkConfiguration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WatermarkConfiguration) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static WatermarkConfiguration parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WatermarkConfiguration) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static WatermarkConfiguration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WatermarkConfiguration) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(WatermarkConfiguration watermarkConfiguration) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(watermarkConfiguration);
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

    public static final class Builder extends GeneratedMessageV3.Builder implements WatermarkConfigurationOrBuilder {
        private int algorithm_;
        private Object baseColorRgb_;
        private int location_;
        private int payloadType_;

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return RenderingProto.internal_static_bidmachine_protobuf_WatermarkConfiguration_descriptor;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RenderingProto.internal_static_bidmachine_protobuf_WatermarkConfiguration_fieldAccessorTable.ensureFieldAccessorsInitialized(WatermarkConfiguration.class, Builder.class);
        }

        private Builder() {
            this.algorithm_ = 0;
            this.payloadType_ = 0;
            this.baseColorRgb_ = "";
            this.location_ = 0;
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.algorithm_ = 0;
            this.payloadType_ = 0;
            this.baseColorRgb_ = "";
            this.location_ = 0;
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.algorithm_ = 0;
            this.payloadType_ = 0;
            this.baseColorRgb_ = "";
            this.location_ = 0;
            return this;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return RenderingProto.internal_static_bidmachine_protobuf_WatermarkConfiguration_descriptor;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* renamed from: getDefaultInstanceForType */
        public WatermarkConfiguration mo3244getDefaultInstanceForType() {
            return WatermarkConfiguration.getDefaultInstance();
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public WatermarkConfiguration build() {
            WatermarkConfiguration buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public WatermarkConfiguration buildPartial() {
            WatermarkConfiguration watermarkConfiguration = new WatermarkConfiguration(this);
            watermarkConfiguration.algorithm_ = this.algorithm_;
            watermarkConfiguration.payloadType_ = this.payloadType_;
            watermarkConfiguration.baseColorRgb_ = this.baseColorRgb_;
            watermarkConfiguration.location_ = this.location_;
            onBuilt();
            return watermarkConfiguration;
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
            if (message instanceof WatermarkConfiguration) {
                return mergeFrom((WatermarkConfiguration) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(WatermarkConfiguration watermarkConfiguration) {
            if (watermarkConfiguration == WatermarkConfiguration.getDefaultInstance()) {
                return this;
            }
            if (watermarkConfiguration.algorithm_ != 0) {
                setAlgorithmValue(watermarkConfiguration.getAlgorithmValue());
            }
            if (watermarkConfiguration.payloadType_ != 0) {
                setPayloadTypeValue(watermarkConfiguration.getPayloadTypeValue());
            }
            if (!watermarkConfiguration.getBaseColorRgb().isEmpty()) {
                this.baseColorRgb_ = watermarkConfiguration.baseColorRgb_;
                onChanged();
            }
            if (watermarkConfiguration.location_ != 0) {
                setLocationValue(watermarkConfiguration.getLocationValue());
            }
            mergeUnknownFields(((GeneratedMessageV3) watermarkConfiguration).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            WatermarkConfiguration watermarkConfiguration = null;
            try {
                try {
                    WatermarkConfiguration watermarkConfiguration2 = (WatermarkConfiguration) WatermarkConfiguration.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (watermarkConfiguration2 != null) {
                        mergeFrom(watermarkConfiguration2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    WatermarkConfiguration watermarkConfiguration3 = (WatermarkConfiguration) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        watermarkConfiguration = watermarkConfiguration3;
                        if (watermarkConfiguration != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (watermarkConfiguration != null) {
                    mergeFrom(watermarkConfiguration);
                }
                throw th;
            }
        }

        @Override // io.bidmachine.protobuf.rendering.WatermarkConfigurationOrBuilder
        public int getAlgorithmValue() {
            return this.algorithm_;
        }

        public Builder setAlgorithmValue(int i) {
            this.algorithm_ = i;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.rendering.WatermarkConfigurationOrBuilder
        public WatermarkAlgorithm getAlgorithm() {
            WatermarkAlgorithm valueOf = WatermarkAlgorithm.valueOf(this.algorithm_);
            return valueOf == null ? WatermarkAlgorithm.UNRECOGNIZED : valueOf;
        }

        public Builder setAlgorithm(WatermarkAlgorithm watermarkAlgorithm) {
            watermarkAlgorithm.getClass();
            this.algorithm_ = watermarkAlgorithm.getNumber();
            onChanged();
            return this;
        }

        public Builder clearAlgorithm() {
            this.algorithm_ = 0;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.rendering.WatermarkConfigurationOrBuilder
        public int getPayloadTypeValue() {
            return this.payloadType_;
        }

        public Builder setPayloadTypeValue(int i) {
            this.payloadType_ = i;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.rendering.WatermarkConfigurationOrBuilder
        public WatermarkPayloadType getPayloadType() {
            WatermarkPayloadType valueOf = WatermarkPayloadType.valueOf(this.payloadType_);
            return valueOf == null ? WatermarkPayloadType.UNRECOGNIZED : valueOf;
        }

        public Builder setPayloadType(WatermarkPayloadType watermarkPayloadType) {
            watermarkPayloadType.getClass();
            this.payloadType_ = watermarkPayloadType.getNumber();
            onChanged();
            return this;
        }

        public Builder clearPayloadType() {
            this.payloadType_ = 0;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.rendering.WatermarkConfigurationOrBuilder
        public String getBaseColorRgb() {
            Object obj = this.baseColorRgb_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.baseColorRgb_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // io.bidmachine.protobuf.rendering.WatermarkConfigurationOrBuilder
        public ByteString getBaseColorRgbBytes() {
            Object obj = this.baseColorRgb_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.baseColorRgb_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setBaseColorRgb(String str) {
            str.getClass();
            this.baseColorRgb_ = str;
            onChanged();
            return this;
        }

        public Builder clearBaseColorRgb() {
            this.baseColorRgb_ = WatermarkConfiguration.getDefaultInstance().getBaseColorRgb();
            onChanged();
            return this;
        }

        public Builder setBaseColorRgbBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.baseColorRgb_ = byteString;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.rendering.WatermarkConfigurationOrBuilder
        public int getLocationValue() {
            return this.location_;
        }

        public Builder setLocationValue(int i) {
            this.location_ = i;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.rendering.WatermarkConfigurationOrBuilder
        public WatermarkLocation getLocation() {
            WatermarkLocation valueOf = WatermarkLocation.valueOf(this.location_);
            return valueOf == null ? WatermarkLocation.UNRECOGNIZED : valueOf;
        }

        public Builder setLocation(WatermarkLocation watermarkLocation) {
            watermarkLocation.getClass();
            this.location_ = watermarkLocation.getNumber();
            onChanged();
            return this;
        }

        public Builder clearLocation() {
            this.location_ = 0;
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

    public static WatermarkConfiguration getDefaultInstance() {
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
    public WatermarkConfiguration mo3244getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
