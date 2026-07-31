package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.AbstractMessage;
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

/* loaded from: classes11.dex */
public final class Measurement extends GeneratedMessageV3 implements MeasurementOrBuilder {
    public static final int COUNT_FIELD_NUMBER = 1;
    public static final int FAILURE_TIMEOUT_MS_FIELD_NUMBER = 4;
    public static final int INTERVAL_MS_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private int count_;
    private int failureTimeoutMs_;
    private int intervalMs_;
    private byte memoizedIsInitialized;
    private static final Measurement DEFAULT_INSTANCE = new Measurement();
    private static final Parser PARSER = new AbstractParser() { // from class: io.bidmachine.protobuf.sdk.Measurement.1
        @Override // com.explorestack.protobuf.Parser
        public Measurement parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new Measurement(codedInputStream, extensionRegistryLite);
        }
    };

    private Measurement(GeneratedMessageV3.Builder builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private Measurement() {
        this.memoizedIsInitialized = (byte) -1;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new Measurement();
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private Measurement(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                            this.count_ = codedInputStream.readUInt32();
                        } else if (readTag == 16) {
                            this.intervalMs_ = codedInputStream.readUInt32();
                        } else if (readTag == 32) {
                            this.bitField0_ |= 1;
                            this.failureTimeoutMs_ = codedInputStream.readUInt32();
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
        return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_Measurement_descriptor;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_Measurement_fieldAccessorTable.ensureFieldAccessorsInitialized(Measurement.class, Builder.class);
    }

    @Override // io.bidmachine.protobuf.sdk.MeasurementOrBuilder
    public int getCount() {
        return this.count_;
    }

    @Override // io.bidmachine.protobuf.sdk.MeasurementOrBuilder
    public int getIntervalMs() {
        return this.intervalMs_;
    }

    @Override // io.bidmachine.protobuf.sdk.MeasurementOrBuilder
    public boolean hasFailureTimeoutMs() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // io.bidmachine.protobuf.sdk.MeasurementOrBuilder
    public int getFailureTimeoutMs() {
        return this.failureTimeoutMs_;
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
        int i = this.count_;
        if (i != 0) {
            codedOutputStream.writeUInt32(1, i);
        }
        int i2 = this.intervalMs_;
        if (i2 != 0) {
            codedOutputStream.writeUInt32(2, i2);
        }
        if ((this.bitField0_ & 1) != 0) {
            codedOutputStream.writeUInt32(4, this.failureTimeoutMs_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = this.count_;
        int computeUInt32Size = i2 != 0 ? CodedOutputStream.computeUInt32Size(1, i2) : 0;
        int i3 = this.intervalMs_;
        if (i3 != 0) {
            computeUInt32Size += CodedOutputStream.computeUInt32Size(2, i3);
        }
        if ((1 & this.bitField0_) != 0) {
            computeUInt32Size += CodedOutputStream.computeUInt32Size(4, this.failureTimeoutMs_);
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
        if (!(obj instanceof Measurement)) {
            return super.equals(obj);
        }
        Measurement measurement = (Measurement) obj;
        if (getCount() == measurement.getCount() && getIntervalMs() == measurement.getIntervalMs() && hasFailureTimeoutMs() == measurement.hasFailureTimeoutMs()) {
            return (!hasFailureTimeoutMs() || getFailureTimeoutMs() == measurement.getFailureTimeoutMs()) && this.unknownFields.equals(measurement.unknownFields);
        }
        return false;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getCount()) * 37) + 2) * 53) + getIntervalMs();
        if (hasFailureTimeoutMs()) {
            hashCode = (((hashCode * 37) + 4) * 53) + getFailureTimeoutMs();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public static Measurement parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Measurement) PARSER.parseFrom(byteBuffer);
    }

    public static Measurement parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Measurement) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static Measurement parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Measurement) PARSER.parseFrom(byteString);
    }

    public static Measurement parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Measurement) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static Measurement parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Measurement) PARSER.parseFrom(bArr);
    }

    public static Measurement parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Measurement) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static Measurement parseFrom(InputStream inputStream) throws IOException {
        return (Measurement) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static Measurement parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Measurement) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Measurement parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Measurement) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Measurement parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Measurement) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Measurement parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Measurement) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static Measurement parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Measurement) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Measurement measurement) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(measurement);
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

    public static final class Builder extends GeneratedMessageV3.Builder implements MeasurementOrBuilder {
        private int bitField0_;
        private int count_;
        private int failureTimeoutMs_;
        private int intervalMs_;

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_Measurement_descriptor;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_Measurement_fieldAccessorTable.ensureFieldAccessorsInitialized(Measurement.class, Builder.class);
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
            this.count_ = 0;
            this.intervalMs_ = 0;
            this.failureTimeoutMs_ = 0;
            this.bitField0_ &= -2;
            return this;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_Measurement_descriptor;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* renamed from: getDefaultInstanceForType */
        public Measurement mo3244getDefaultInstanceForType() {
            return Measurement.getDefaultInstance();
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Measurement build() {
            Measurement buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Measurement buildPartial() {
            Measurement measurement = new Measurement(this);
            int i = this.bitField0_;
            measurement.count_ = this.count_;
            measurement.intervalMs_ = this.intervalMs_;
            int i2 = 1;
            if ((i & 1) != 0) {
                measurement.failureTimeoutMs_ = this.failureTimeoutMs_;
            } else {
                i2 = 0;
            }
            measurement.bitField0_ = i2;
            onBuilt();
            return measurement;
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
            if (message instanceof Measurement) {
                return mergeFrom((Measurement) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Measurement measurement) {
            if (measurement == Measurement.getDefaultInstance()) {
                return this;
            }
            if (measurement.getCount() != 0) {
                setCount(measurement.getCount());
            }
            if (measurement.getIntervalMs() != 0) {
                setIntervalMs(measurement.getIntervalMs());
            }
            if (measurement.hasFailureTimeoutMs()) {
                setFailureTimeoutMs(measurement.getFailureTimeoutMs());
            }
            mergeUnknownFields(((GeneratedMessageV3) measurement).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            Measurement measurement = null;
            try {
                try {
                    Measurement measurement2 = (Measurement) Measurement.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (measurement2 != null) {
                        mergeFrom(measurement2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    Measurement measurement3 = (Measurement) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        measurement = measurement3;
                        if (measurement != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (measurement != null) {
                    mergeFrom(measurement);
                }
                throw th;
            }
        }

        @Override // io.bidmachine.protobuf.sdk.MeasurementOrBuilder
        public int getCount() {
            return this.count_;
        }

        public Builder setCount(int i) {
            this.count_ = i;
            onChanged();
            return this;
        }

        public Builder clearCount() {
            this.count_ = 0;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.sdk.MeasurementOrBuilder
        public int getIntervalMs() {
            return this.intervalMs_;
        }

        public Builder setIntervalMs(int i) {
            this.intervalMs_ = i;
            onChanged();
            return this;
        }

        public Builder clearIntervalMs() {
            this.intervalMs_ = 0;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.sdk.MeasurementOrBuilder
        public boolean hasFailureTimeoutMs() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // io.bidmachine.protobuf.sdk.MeasurementOrBuilder
        public int getFailureTimeoutMs() {
            return this.failureTimeoutMs_;
        }

        public Builder setFailureTimeoutMs(int i) {
            this.bitField0_ |= 1;
            this.failureTimeoutMs_ = i;
            onChanged();
            return this;
        }

        public Builder clearFailureTimeoutMs() {
            this.bitField0_ &= -2;
            this.failureTimeoutMs_ = 0;
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

    public static Measurement getDefaultInstance() {
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
    public Measurement mo3244getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
