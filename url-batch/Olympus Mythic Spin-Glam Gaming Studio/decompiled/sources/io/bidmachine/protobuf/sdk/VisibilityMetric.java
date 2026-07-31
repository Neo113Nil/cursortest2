package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.AbstractMessage;
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
import com.explorestack.protobuf.Parser;
import com.explorestack.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes11.dex */
public final class VisibilityMetric extends GeneratedMessageV3 implements VisibilityMetricOrBuilder {
    public static final int MIN_VISIBLE_PERCENTAGE_FIELD_NUMBER = 2;
    public static final int SCOPE_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private double minVisiblePercentage_;
    private int scope_;
    private static final VisibilityMetric DEFAULT_INSTANCE = new VisibilityMetric();
    private static final Parser PARSER = new AbstractParser() { // from class: io.bidmachine.protobuf.sdk.VisibilityMetric.1
        @Override // com.explorestack.protobuf.Parser
        public VisibilityMetric parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new VisibilityMetric(codedInputStream, extensionRegistryLite);
        }
    };

    private VisibilityMetric(GeneratedMessageV3.Builder builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private VisibilityMetric() {
        this.memoizedIsInitialized = (byte) -1;
        this.scope_ = 0;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new VisibilityMetric();
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private VisibilityMetric(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                            this.scope_ = codedInputStream.readEnum();
                        } else if (readTag == 17) {
                            this.minVisiblePercentage_ = codedInputStream.readDouble();
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
        return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_VisibilityMetric_descriptor;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_VisibilityMetric_fieldAccessorTable.ensureFieldAccessorsInitialized(VisibilityMetric.class, Builder.class);
    }

    public enum VisibilityScope implements Internal.EnumLite {
        PARENT_VIEW(0),
        SCREEN(1),
        SAFE_AREA(2),
        UNRECOGNIZED(-1);

        public static final int PARENT_VIEW_VALUE = 0;
        public static final int SAFE_AREA_VALUE = 2;
        public static final int SCREEN_VALUE = 1;
        private final int value;
        private static final Internal.EnumLiteMap internalValueMap = new Internal.EnumLiteMap() { // from class: io.bidmachine.protobuf.sdk.VisibilityMetric.VisibilityScope.1
            public VisibilityScope findValueByNumber(int i) {
                return VisibilityScope.forNumber(i);
            }
        };
        private static final VisibilityScope[] VALUES = values();

        @Override // com.explorestack.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @Deprecated
        public static VisibilityScope valueOf(int i) {
            return forNumber(i);
        }

        public static VisibilityScope forNumber(int i) {
            if (i == 0) {
                return PARENT_VIEW;
            }
            if (i == 1) {
                return SCREEN;
            }
            if (i != 2) {
                return null;
            }
            return SAFE_AREA;
        }

        public static Internal.EnumLiteMap internalGetValueMap() {
            return internalValueMap;
        }

        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == UNRECOGNIZED) {
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(ordinal());
        }

        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return VisibilityMetric.getDescriptor().getEnumTypes().get(0);
        }

        public static VisibilityScope valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }

        VisibilityScope(int i) {
            this.value = i;
        }
    }

    @Override // io.bidmachine.protobuf.sdk.VisibilityMetricOrBuilder
    public int getScopeValue() {
        return this.scope_;
    }

    @Override // io.bidmachine.protobuf.sdk.VisibilityMetricOrBuilder
    public VisibilityScope getScope() {
        VisibilityScope valueOf = VisibilityScope.valueOf(this.scope_);
        return valueOf == null ? VisibilityScope.UNRECOGNIZED : valueOf;
    }

    @Override // io.bidmachine.protobuf.sdk.VisibilityMetricOrBuilder
    public double getMinVisiblePercentage() {
        return this.minVisiblePercentage_;
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
        if (this.scope_ != VisibilityScope.PARENT_VIEW.getNumber()) {
            codedOutputStream.writeEnum(1, this.scope_);
        }
        double d = this.minVisiblePercentage_;
        if (d != 0.0d) {
            codedOutputStream.writeDouble(2, d);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int computeEnumSize = this.scope_ != VisibilityScope.PARENT_VIEW.getNumber() ? CodedOutputStream.computeEnumSize(1, this.scope_) : 0;
        double d = this.minVisiblePercentage_;
        if (d != 0.0d) {
            computeEnumSize += CodedOutputStream.computeDoubleSize(2, d);
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
        if (!(obj instanceof VisibilityMetric)) {
            return super.equals(obj);
        }
        VisibilityMetric visibilityMetric = (VisibilityMetric) obj;
        return this.scope_ == visibilityMetric.scope_ && Double.doubleToLongBits(getMinVisiblePercentage()) == Double.doubleToLongBits(visibilityMetric.getMinVisiblePercentage()) && this.unknownFields.equals(visibilityMetric.unknownFields);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.scope_) * 37) + 2) * 53) + Internal.hashLong(Double.doubleToLongBits(getMinVisiblePercentage()))) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    public static VisibilityMetric parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (VisibilityMetric) PARSER.parseFrom(byteBuffer);
    }

    public static VisibilityMetric parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VisibilityMetric) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static VisibilityMetric parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (VisibilityMetric) PARSER.parseFrom(byteString);
    }

    public static VisibilityMetric parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VisibilityMetric) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static VisibilityMetric parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (VisibilityMetric) PARSER.parseFrom(bArr);
    }

    public static VisibilityMetric parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VisibilityMetric) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static VisibilityMetric parseFrom(InputStream inputStream) throws IOException {
        return (VisibilityMetric) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static VisibilityMetric parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VisibilityMetric) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static VisibilityMetric parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (VisibilityMetric) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static VisibilityMetric parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VisibilityMetric) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static VisibilityMetric parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (VisibilityMetric) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static VisibilityMetric parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VisibilityMetric) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(VisibilityMetric visibilityMetric) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(visibilityMetric);
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

    public static final class Builder extends GeneratedMessageV3.Builder implements VisibilityMetricOrBuilder {
        private double minVisiblePercentage_;
        private int scope_;

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_VisibilityMetric_descriptor;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_VisibilityMetric_fieldAccessorTable.ensureFieldAccessorsInitialized(VisibilityMetric.class, Builder.class);
        }

        private Builder() {
            this.scope_ = 0;
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.scope_ = 0;
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.scope_ = 0;
            this.minVisiblePercentage_ = 0.0d;
            return this;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_VisibilityMetric_descriptor;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* renamed from: getDefaultInstanceForType */
        public VisibilityMetric mo3244getDefaultInstanceForType() {
            return VisibilityMetric.getDefaultInstance();
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public VisibilityMetric build() {
            VisibilityMetric buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public VisibilityMetric buildPartial() {
            VisibilityMetric visibilityMetric = new VisibilityMetric(this);
            visibilityMetric.scope_ = this.scope_;
            visibilityMetric.minVisiblePercentage_ = this.minVisiblePercentage_;
            onBuilt();
            return visibilityMetric;
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
            if (message instanceof VisibilityMetric) {
                return mergeFrom((VisibilityMetric) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(VisibilityMetric visibilityMetric) {
            if (visibilityMetric == VisibilityMetric.getDefaultInstance()) {
                return this;
            }
            if (visibilityMetric.scope_ != 0) {
                setScopeValue(visibilityMetric.getScopeValue());
            }
            if (visibilityMetric.getMinVisiblePercentage() != 0.0d) {
                setMinVisiblePercentage(visibilityMetric.getMinVisiblePercentage());
            }
            mergeUnknownFields(((GeneratedMessageV3) visibilityMetric).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            VisibilityMetric visibilityMetric = null;
            try {
                try {
                    VisibilityMetric visibilityMetric2 = (VisibilityMetric) VisibilityMetric.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (visibilityMetric2 != null) {
                        mergeFrom(visibilityMetric2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    VisibilityMetric visibilityMetric3 = (VisibilityMetric) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        visibilityMetric = visibilityMetric3;
                        if (visibilityMetric != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (visibilityMetric != null) {
                    mergeFrom(visibilityMetric);
                }
                throw th;
            }
        }

        @Override // io.bidmachine.protobuf.sdk.VisibilityMetricOrBuilder
        public int getScopeValue() {
            return this.scope_;
        }

        public Builder setScopeValue(int i) {
            this.scope_ = i;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.sdk.VisibilityMetricOrBuilder
        public VisibilityScope getScope() {
            VisibilityScope valueOf = VisibilityScope.valueOf(this.scope_);
            return valueOf == null ? VisibilityScope.UNRECOGNIZED : valueOf;
        }

        public Builder setScope(VisibilityScope visibilityScope) {
            visibilityScope.getClass();
            this.scope_ = visibilityScope.getNumber();
            onChanged();
            return this;
        }

        public Builder clearScope() {
            this.scope_ = 0;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.sdk.VisibilityMetricOrBuilder
        public double getMinVisiblePercentage() {
            return this.minVisiblePercentage_;
        }

        public Builder setMinVisiblePercentage(double d) {
            this.minVisiblePercentage_ = d;
            onChanged();
            return this;
        }

        public Builder clearMinVisiblePercentage() {
            this.minVisiblePercentage_ = 0.0d;
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

    public static VisibilityMetric getDefaultInstance() {
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
    public VisibilityMetric mo3244getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
