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
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.Parser;
import com.explorestack.protobuf.SingleFieldBuilderV3;
import com.explorestack.protobuf.UnknownFieldSet;
import io.bidmachine.protobuf.sdk.GeometryMetric;
import io.bidmachine.protobuf.sdk.LifecycleMetric;
import io.bidmachine.protobuf.sdk.OverlapMetric;
import io.bidmachine.protobuf.sdk.VisibilityMetric;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class MetricRequirement extends GeneratedMessageV3 implements MetricRequirementOrBuilder {
    public static final int GEOMETRY_FIELD_NUMBER = 5;
    public static final int LIFECYCLE_FIELD_NUMBER = 7;
    public static final int MEASUREMENT_INDEX_FIELD_NUMBER = 1;
    public static final int OVERLAP_FIELD_NUMBER = 8;
    public static final int VISIBILITY_FIELD_NUMBER = 6;
    private static final long serialVersionUID = 0;
    private int measurementIndex_;
    private byte memoizedIsInitialized;
    private int metricCase_;
    private Object metric_;
    private static final MetricRequirement DEFAULT_INSTANCE = new MetricRequirement();
    private static final Parser PARSER = new AbstractParser() { // from class: io.bidmachine.protobuf.sdk.MetricRequirement.1
        @Override // com.explorestack.protobuf.Parser
        public MetricRequirement parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new MetricRequirement(codedInputStream, extensionRegistryLite);
        }
    };

    private MetricRequirement(GeneratedMessageV3.Builder builder) {
        super(builder);
        this.metricCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    private MetricRequirement() {
        this.metricCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new MetricRequirement();
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private MetricRequirement(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        extensionRegistryLite.getClass();
        UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag != 8) {
                            if (readTag == 42) {
                                GeometryMetric.Builder builder = this.metricCase_ == 5 ? ((GeometryMetric) this.metric_).toBuilder() : null;
                                MessageLite readMessage = codedInputStream.readMessage(GeometryMetric.parser(), extensionRegistryLite);
                                this.metric_ = readMessage;
                                if (builder != null) {
                                    builder.mergeFrom((GeometryMetric) readMessage);
                                    this.metric_ = builder.buildPartial();
                                }
                                this.metricCase_ = 5;
                            } else if (readTag == 50) {
                                VisibilityMetric.Builder builder2 = this.metricCase_ == 6 ? ((VisibilityMetric) this.metric_).toBuilder() : null;
                                MessageLite readMessage2 = codedInputStream.readMessage(VisibilityMetric.parser(), extensionRegistryLite);
                                this.metric_ = readMessage2;
                                if (builder2 != null) {
                                    builder2.mergeFrom((VisibilityMetric) readMessage2);
                                    this.metric_ = builder2.buildPartial();
                                }
                                this.metricCase_ = 6;
                            } else if (readTag == 58) {
                                LifecycleMetric.Builder builder3 = this.metricCase_ == 7 ? ((LifecycleMetric) this.metric_).toBuilder() : null;
                                MessageLite readMessage3 = codedInputStream.readMessage(LifecycleMetric.parser(), extensionRegistryLite);
                                this.metric_ = readMessage3;
                                if (builder3 != null) {
                                    builder3.mergeFrom((LifecycleMetric) readMessage3);
                                    this.metric_ = builder3.buildPartial();
                                }
                                this.metricCase_ = 7;
                            } else if (readTag == 66) {
                                OverlapMetric.Builder builder4 = this.metricCase_ == 8 ? ((OverlapMetric) this.metric_).toBuilder() : null;
                                MessageLite readMessage4 = codedInputStream.readMessage(OverlapMetric.parser(), extensionRegistryLite);
                                this.metric_ = readMessage4;
                                if (builder4 != null) {
                                    builder4.mergeFrom((OverlapMetric) readMessage4);
                                    this.metric_ = builder4.buildPartial();
                                }
                                this.metricCase_ = 8;
                            } else if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                            }
                        } else {
                            this.measurementIndex_ = codedInputStream.readUInt32();
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
        return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_MetricRequirement_descriptor;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_MetricRequirement_fieldAccessorTable.ensureFieldAccessorsInitialized(MetricRequirement.class, Builder.class);
    }

    public enum MetricCase implements Internal.EnumLite {
        GEOMETRY(5),
        VISIBILITY(6),
        LIFECYCLE(7),
        OVERLAP(8),
        METRIC_NOT_SET(0);

        private final int value;

        MetricCase(int i) {
            this.value = i;
        }

        @Deprecated
        public static MetricCase valueOf(int i) {
            return forNumber(i);
        }

        public static MetricCase forNumber(int i) {
            if (i == 0) {
                return METRIC_NOT_SET;
            }
            if (i == 5) {
                return GEOMETRY;
            }
            if (i == 6) {
                return VISIBILITY;
            }
            if (i == 7) {
                return LIFECYCLE;
            }
            if (i != 8) {
                return null;
            }
            return OVERLAP;
        }

        @Override // com.explorestack.protobuf.Internal.EnumLite
        public int getNumber() {
            return this.value;
        }
    }

    @Override // io.bidmachine.protobuf.sdk.MetricRequirementOrBuilder
    public MetricCase getMetricCase() {
        return MetricCase.forNumber(this.metricCase_);
    }

    @Override // io.bidmachine.protobuf.sdk.MetricRequirementOrBuilder
    public int getMeasurementIndex() {
        return this.measurementIndex_;
    }

    @Override // io.bidmachine.protobuf.sdk.MetricRequirementOrBuilder
    public boolean hasGeometry() {
        return this.metricCase_ == 5;
    }

    @Override // io.bidmachine.protobuf.sdk.MetricRequirementOrBuilder
    public GeometryMetric getGeometry() {
        if (this.metricCase_ == 5) {
            return (GeometryMetric) this.metric_;
        }
        return GeometryMetric.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.sdk.MetricRequirementOrBuilder
    public GeometryMetricOrBuilder getGeometryOrBuilder() {
        if (this.metricCase_ == 5) {
            return (GeometryMetric) this.metric_;
        }
        return GeometryMetric.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.sdk.MetricRequirementOrBuilder
    public boolean hasVisibility() {
        return this.metricCase_ == 6;
    }

    @Override // io.bidmachine.protobuf.sdk.MetricRequirementOrBuilder
    public VisibilityMetric getVisibility() {
        if (this.metricCase_ == 6) {
            return (VisibilityMetric) this.metric_;
        }
        return VisibilityMetric.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.sdk.MetricRequirementOrBuilder
    public VisibilityMetricOrBuilder getVisibilityOrBuilder() {
        if (this.metricCase_ == 6) {
            return (VisibilityMetric) this.metric_;
        }
        return VisibilityMetric.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.sdk.MetricRequirementOrBuilder
    public boolean hasLifecycle() {
        return this.metricCase_ == 7;
    }

    @Override // io.bidmachine.protobuf.sdk.MetricRequirementOrBuilder
    public LifecycleMetric getLifecycle() {
        if (this.metricCase_ == 7) {
            return (LifecycleMetric) this.metric_;
        }
        return LifecycleMetric.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.sdk.MetricRequirementOrBuilder
    public LifecycleMetricOrBuilder getLifecycleOrBuilder() {
        if (this.metricCase_ == 7) {
            return (LifecycleMetric) this.metric_;
        }
        return LifecycleMetric.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.sdk.MetricRequirementOrBuilder
    public boolean hasOverlap() {
        return this.metricCase_ == 8;
    }

    @Override // io.bidmachine.protobuf.sdk.MetricRequirementOrBuilder
    public OverlapMetric getOverlap() {
        if (this.metricCase_ == 8) {
            return (OverlapMetric) this.metric_;
        }
        return OverlapMetric.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.sdk.MetricRequirementOrBuilder
    public OverlapMetricOrBuilder getOverlapOrBuilder() {
        if (this.metricCase_ == 8) {
            return (OverlapMetric) this.metric_;
        }
        return OverlapMetric.getDefaultInstance();
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
        int i = this.measurementIndex_;
        if (i != 0) {
            codedOutputStream.writeUInt32(1, i);
        }
        if (this.metricCase_ == 5) {
            codedOutputStream.writeMessage(5, (GeometryMetric) this.metric_);
        }
        if (this.metricCase_ == 6) {
            codedOutputStream.writeMessage(6, (VisibilityMetric) this.metric_);
        }
        if (this.metricCase_ == 7) {
            codedOutputStream.writeMessage(7, (LifecycleMetric) this.metric_);
        }
        if (this.metricCase_ == 8) {
            codedOutputStream.writeMessage(8, (OverlapMetric) this.metric_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = this.measurementIndex_;
        int computeUInt32Size = i2 != 0 ? CodedOutputStream.computeUInt32Size(1, i2) : 0;
        if (this.metricCase_ == 5) {
            computeUInt32Size += CodedOutputStream.computeMessageSize(5, (GeometryMetric) this.metric_);
        }
        if (this.metricCase_ == 6) {
            computeUInt32Size += CodedOutputStream.computeMessageSize(6, (VisibilityMetric) this.metric_);
        }
        if (this.metricCase_ == 7) {
            computeUInt32Size += CodedOutputStream.computeMessageSize(7, (LifecycleMetric) this.metric_);
        }
        if (this.metricCase_ == 8) {
            computeUInt32Size += CodedOutputStream.computeMessageSize(8, (OverlapMetric) this.metric_);
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
        if (!(obj instanceof MetricRequirement)) {
            return super.equals(obj);
        }
        MetricRequirement metricRequirement = (MetricRequirement) obj;
        if (getMeasurementIndex() != metricRequirement.getMeasurementIndex() || !getMetricCase().equals(metricRequirement.getMetricCase())) {
            return false;
        }
        int i = this.metricCase_;
        if (i != 5) {
            if (i != 6) {
                if (i == 7) {
                    if (!getLifecycle().equals(metricRequirement.getLifecycle())) {
                        return false;
                    }
                } else if (i == 8 && !getOverlap().equals(metricRequirement.getOverlap())) {
                    return false;
                }
            } else if (!getVisibility().equals(metricRequirement.getVisibility())) {
                return false;
            }
        } else if (!getGeometry().equals(metricRequirement.getGeometry())) {
            return false;
        }
        return this.unknownFields.equals(metricRequirement.unknownFields);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i;
        int hashCode;
        int i2 = this.memoizedHashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode2 = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getMeasurementIndex();
        int i3 = this.metricCase_;
        if (i3 == 5) {
            i = ((hashCode2 * 37) + 5) * 53;
            hashCode = getGeometry().hashCode();
        } else if (i3 == 6) {
            i = ((hashCode2 * 37) + 6) * 53;
            hashCode = getVisibility().hashCode();
        } else if (i3 == 7) {
            i = ((hashCode2 * 37) + 7) * 53;
            hashCode = getLifecycle().hashCode();
        } else {
            if (i3 == 8) {
                i = ((hashCode2 * 37) + 8) * 53;
                hashCode = getOverlap().hashCode();
            }
            int hashCode3 = (hashCode2 * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode3;
            return hashCode3;
        }
        hashCode2 = i + hashCode;
        int hashCode32 = (hashCode2 * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode32;
        return hashCode32;
    }

    public static MetricRequirement parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MetricRequirement) PARSER.parseFrom(byteBuffer);
    }

    public static MetricRequirement parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MetricRequirement) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static MetricRequirement parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MetricRequirement) PARSER.parseFrom(byteString);
    }

    public static MetricRequirement parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MetricRequirement) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static MetricRequirement parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MetricRequirement) PARSER.parseFrom(bArr);
    }

    public static MetricRequirement parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MetricRequirement) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static MetricRequirement parseFrom(InputStream inputStream) throws IOException {
        return (MetricRequirement) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static MetricRequirement parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MetricRequirement) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static MetricRequirement parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MetricRequirement) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static MetricRequirement parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MetricRequirement) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static MetricRequirement parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MetricRequirement) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static MetricRequirement parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MetricRequirement) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(MetricRequirement metricRequirement) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(metricRequirement);
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

    public static final class Builder extends GeneratedMessageV3.Builder implements MetricRequirementOrBuilder {
        private SingleFieldBuilderV3 geometryBuilder_;
        private SingleFieldBuilderV3 lifecycleBuilder_;
        private int measurementIndex_;
        private int metricCase_;
        private Object metric_;
        private SingleFieldBuilderV3 overlapBuilder_;
        private SingleFieldBuilderV3 visibilityBuilder_;

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_MetricRequirement_descriptor;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_MetricRequirement_fieldAccessorTable.ensureFieldAccessorsInitialized(MetricRequirement.class, Builder.class);
        }

        private Builder() {
            this.metricCase_ = 0;
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.metricCase_ = 0;
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.measurementIndex_ = 0;
            this.metricCase_ = 0;
            this.metric_ = null;
            return this;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_MetricRequirement_descriptor;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* renamed from: getDefaultInstanceForType */
        public MetricRequirement mo3244getDefaultInstanceForType() {
            return MetricRequirement.getDefaultInstance();
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public MetricRequirement build() {
            MetricRequirement buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public MetricRequirement buildPartial() {
            MetricRequirement metricRequirement = new MetricRequirement(this);
            metricRequirement.measurementIndex_ = this.measurementIndex_;
            if (this.metricCase_ == 5) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.geometryBuilder_;
                if (singleFieldBuilderV3 == null) {
                    metricRequirement.metric_ = this.metric_;
                } else {
                    metricRequirement.metric_ = singleFieldBuilderV3.build();
                }
            }
            if (this.metricCase_ == 6) {
                SingleFieldBuilderV3 singleFieldBuilderV32 = this.visibilityBuilder_;
                if (singleFieldBuilderV32 == null) {
                    metricRequirement.metric_ = this.metric_;
                } else {
                    metricRequirement.metric_ = singleFieldBuilderV32.build();
                }
            }
            if (this.metricCase_ == 7) {
                SingleFieldBuilderV3 singleFieldBuilderV33 = this.lifecycleBuilder_;
                if (singleFieldBuilderV33 == null) {
                    metricRequirement.metric_ = this.metric_;
                } else {
                    metricRequirement.metric_ = singleFieldBuilderV33.build();
                }
            }
            if (this.metricCase_ == 8) {
                SingleFieldBuilderV3 singleFieldBuilderV34 = this.overlapBuilder_;
                if (singleFieldBuilderV34 == null) {
                    metricRequirement.metric_ = this.metric_;
                } else {
                    metricRequirement.metric_ = singleFieldBuilderV34.build();
                }
            }
            metricRequirement.metricCase_ = this.metricCase_;
            onBuilt();
            return metricRequirement;
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
            if (message instanceof MetricRequirement) {
                return mergeFrom((MetricRequirement) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(MetricRequirement metricRequirement) {
            if (metricRequirement == MetricRequirement.getDefaultInstance()) {
                return this;
            }
            if (metricRequirement.getMeasurementIndex() != 0) {
                setMeasurementIndex(metricRequirement.getMeasurementIndex());
            }
            int i = AnonymousClass2.$SwitchMap$io$bidmachine$protobuf$sdk$MetricRequirement$MetricCase[metricRequirement.getMetricCase().ordinal()];
            if (i == 1) {
                mergeGeometry(metricRequirement.getGeometry());
            } else if (i == 2) {
                mergeVisibility(metricRequirement.getVisibility());
            } else if (i == 3) {
                mergeLifecycle(metricRequirement.getLifecycle());
            } else if (i == 4) {
                mergeOverlap(metricRequirement.getOverlap());
            }
            mergeUnknownFields(((GeneratedMessageV3) metricRequirement).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            MetricRequirement metricRequirement = null;
            try {
                try {
                    MetricRequirement metricRequirement2 = (MetricRequirement) MetricRequirement.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (metricRequirement2 != null) {
                        mergeFrom(metricRequirement2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    MetricRequirement metricRequirement3 = (MetricRequirement) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        metricRequirement = metricRequirement3;
                        if (metricRequirement != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (metricRequirement != null) {
                    mergeFrom(metricRequirement);
                }
                throw th;
            }
        }

        @Override // io.bidmachine.protobuf.sdk.MetricRequirementOrBuilder
        public MetricCase getMetricCase() {
            return MetricCase.forNumber(this.metricCase_);
        }

        public Builder clearMetric() {
            this.metricCase_ = 0;
            this.metric_ = null;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.sdk.MetricRequirementOrBuilder
        public int getMeasurementIndex() {
            return this.measurementIndex_;
        }

        public Builder setMeasurementIndex(int i) {
            this.measurementIndex_ = i;
            onChanged();
            return this;
        }

        public Builder clearMeasurementIndex() {
            this.measurementIndex_ = 0;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.sdk.MetricRequirementOrBuilder
        public boolean hasGeometry() {
            return this.metricCase_ == 5;
        }

        @Override // io.bidmachine.protobuf.sdk.MetricRequirementOrBuilder
        public GeometryMetric getGeometry() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.geometryBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.metricCase_ == 5) {
                    return (GeometryMetric) this.metric_;
                }
                return GeometryMetric.getDefaultInstance();
            }
            if (this.metricCase_ == 5) {
                return (GeometryMetric) singleFieldBuilderV3.getMessage();
            }
            return GeometryMetric.getDefaultInstance();
        }

        public Builder setGeometry(GeometryMetric geometryMetric) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.geometryBuilder_;
            if (singleFieldBuilderV3 == null) {
                geometryMetric.getClass();
                this.metric_ = geometryMetric;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(geometryMetric);
            }
            this.metricCase_ = 5;
            return this;
        }

        public Builder setGeometry(GeometryMetric.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.geometryBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.metric_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.metricCase_ = 5;
            return this;
        }

        public Builder mergeGeometry(GeometryMetric geometryMetric) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.geometryBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.metricCase_ == 5 && this.metric_ != GeometryMetric.getDefaultInstance()) {
                    this.metric_ = GeometryMetric.newBuilder((GeometryMetric) this.metric_).mergeFrom(geometryMetric).buildPartial();
                } else {
                    this.metric_ = geometryMetric;
                }
                onChanged();
            } else {
                if (this.metricCase_ == 5) {
                    singleFieldBuilderV3.mergeFrom(geometryMetric);
                }
                this.geometryBuilder_.setMessage(geometryMetric);
            }
            this.metricCase_ = 5;
            return this;
        }

        public Builder clearGeometry() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.geometryBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.metricCase_ == 5) {
                    this.metricCase_ = 0;
                    this.metric_ = null;
                    onChanged();
                }
            } else {
                if (this.metricCase_ == 5) {
                    this.metricCase_ = 0;
                    this.metric_ = null;
                }
                singleFieldBuilderV3.clear();
            }
            return this;
        }

        public GeometryMetric.Builder getGeometryBuilder() {
            return (GeometryMetric.Builder) getGeometryFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.MetricRequirementOrBuilder
        public GeometryMetricOrBuilder getGeometryOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3;
            int i = this.metricCase_;
            if (i == 5 && (singleFieldBuilderV3 = this.geometryBuilder_) != null) {
                return (GeometryMetricOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            if (i == 5) {
                return (GeometryMetric) this.metric_;
            }
            return GeometryMetric.getDefaultInstance();
        }

        private SingleFieldBuilderV3 getGeometryFieldBuilder() {
            if (this.geometryBuilder_ == null) {
                if (this.metricCase_ != 5) {
                    this.metric_ = GeometryMetric.getDefaultInstance();
                }
                this.geometryBuilder_ = new SingleFieldBuilderV3((GeometryMetric) this.metric_, getParentForChildren(), isClean());
                this.metric_ = null;
            }
            this.metricCase_ = 5;
            onChanged();
            return this.geometryBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.MetricRequirementOrBuilder
        public boolean hasVisibility() {
            return this.metricCase_ == 6;
        }

        @Override // io.bidmachine.protobuf.sdk.MetricRequirementOrBuilder
        public VisibilityMetric getVisibility() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.visibilityBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.metricCase_ == 6) {
                    return (VisibilityMetric) this.metric_;
                }
                return VisibilityMetric.getDefaultInstance();
            }
            if (this.metricCase_ == 6) {
                return (VisibilityMetric) singleFieldBuilderV3.getMessage();
            }
            return VisibilityMetric.getDefaultInstance();
        }

        public Builder setVisibility(VisibilityMetric visibilityMetric) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.visibilityBuilder_;
            if (singleFieldBuilderV3 == null) {
                visibilityMetric.getClass();
                this.metric_ = visibilityMetric;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(visibilityMetric);
            }
            this.metricCase_ = 6;
            return this;
        }

        public Builder setVisibility(VisibilityMetric.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.visibilityBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.metric_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.metricCase_ = 6;
            return this;
        }

        public Builder mergeVisibility(VisibilityMetric visibilityMetric) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.visibilityBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.metricCase_ == 6 && this.metric_ != VisibilityMetric.getDefaultInstance()) {
                    this.metric_ = VisibilityMetric.newBuilder((VisibilityMetric) this.metric_).mergeFrom(visibilityMetric).buildPartial();
                } else {
                    this.metric_ = visibilityMetric;
                }
                onChanged();
            } else {
                if (this.metricCase_ == 6) {
                    singleFieldBuilderV3.mergeFrom(visibilityMetric);
                }
                this.visibilityBuilder_.setMessage(visibilityMetric);
            }
            this.metricCase_ = 6;
            return this;
        }

        public Builder clearVisibility() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.visibilityBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.metricCase_ == 6) {
                    this.metricCase_ = 0;
                    this.metric_ = null;
                    onChanged();
                }
            } else {
                if (this.metricCase_ == 6) {
                    this.metricCase_ = 0;
                    this.metric_ = null;
                }
                singleFieldBuilderV3.clear();
            }
            return this;
        }

        public VisibilityMetric.Builder getVisibilityBuilder() {
            return (VisibilityMetric.Builder) getVisibilityFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.MetricRequirementOrBuilder
        public VisibilityMetricOrBuilder getVisibilityOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3;
            int i = this.metricCase_;
            if (i == 6 && (singleFieldBuilderV3 = this.visibilityBuilder_) != null) {
                return (VisibilityMetricOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            if (i == 6) {
                return (VisibilityMetric) this.metric_;
            }
            return VisibilityMetric.getDefaultInstance();
        }

        private SingleFieldBuilderV3 getVisibilityFieldBuilder() {
            if (this.visibilityBuilder_ == null) {
                if (this.metricCase_ != 6) {
                    this.metric_ = VisibilityMetric.getDefaultInstance();
                }
                this.visibilityBuilder_ = new SingleFieldBuilderV3((VisibilityMetric) this.metric_, getParentForChildren(), isClean());
                this.metric_ = null;
            }
            this.metricCase_ = 6;
            onChanged();
            return this.visibilityBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.MetricRequirementOrBuilder
        public boolean hasLifecycle() {
            return this.metricCase_ == 7;
        }

        @Override // io.bidmachine.protobuf.sdk.MetricRequirementOrBuilder
        public LifecycleMetric getLifecycle() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.lifecycleBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.metricCase_ == 7) {
                    return (LifecycleMetric) this.metric_;
                }
                return LifecycleMetric.getDefaultInstance();
            }
            if (this.metricCase_ == 7) {
                return (LifecycleMetric) singleFieldBuilderV3.getMessage();
            }
            return LifecycleMetric.getDefaultInstance();
        }

        public Builder setLifecycle(LifecycleMetric lifecycleMetric) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.lifecycleBuilder_;
            if (singleFieldBuilderV3 == null) {
                lifecycleMetric.getClass();
                this.metric_ = lifecycleMetric;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(lifecycleMetric);
            }
            this.metricCase_ = 7;
            return this;
        }

        public Builder setLifecycle(LifecycleMetric.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.lifecycleBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.metric_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.metricCase_ = 7;
            return this;
        }

        public Builder mergeLifecycle(LifecycleMetric lifecycleMetric) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.lifecycleBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.metricCase_ == 7 && this.metric_ != LifecycleMetric.getDefaultInstance()) {
                    this.metric_ = LifecycleMetric.newBuilder((LifecycleMetric) this.metric_).mergeFrom(lifecycleMetric).buildPartial();
                } else {
                    this.metric_ = lifecycleMetric;
                }
                onChanged();
            } else {
                if (this.metricCase_ == 7) {
                    singleFieldBuilderV3.mergeFrom(lifecycleMetric);
                }
                this.lifecycleBuilder_.setMessage(lifecycleMetric);
            }
            this.metricCase_ = 7;
            return this;
        }

        public Builder clearLifecycle() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.lifecycleBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.metricCase_ == 7) {
                    this.metricCase_ = 0;
                    this.metric_ = null;
                    onChanged();
                }
            } else {
                if (this.metricCase_ == 7) {
                    this.metricCase_ = 0;
                    this.metric_ = null;
                }
                singleFieldBuilderV3.clear();
            }
            return this;
        }

        public LifecycleMetric.Builder getLifecycleBuilder() {
            return (LifecycleMetric.Builder) getLifecycleFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.MetricRequirementOrBuilder
        public LifecycleMetricOrBuilder getLifecycleOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3;
            int i = this.metricCase_;
            if (i == 7 && (singleFieldBuilderV3 = this.lifecycleBuilder_) != null) {
                return (LifecycleMetricOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            if (i == 7) {
                return (LifecycleMetric) this.metric_;
            }
            return LifecycleMetric.getDefaultInstance();
        }

        private SingleFieldBuilderV3 getLifecycleFieldBuilder() {
            if (this.lifecycleBuilder_ == null) {
                if (this.metricCase_ != 7) {
                    this.metric_ = LifecycleMetric.getDefaultInstance();
                }
                this.lifecycleBuilder_ = new SingleFieldBuilderV3((LifecycleMetric) this.metric_, getParentForChildren(), isClean());
                this.metric_ = null;
            }
            this.metricCase_ = 7;
            onChanged();
            return this.lifecycleBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.MetricRequirementOrBuilder
        public boolean hasOverlap() {
            return this.metricCase_ == 8;
        }

        @Override // io.bidmachine.protobuf.sdk.MetricRequirementOrBuilder
        public OverlapMetric getOverlap() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.overlapBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.metricCase_ == 8) {
                    return (OverlapMetric) this.metric_;
                }
                return OverlapMetric.getDefaultInstance();
            }
            if (this.metricCase_ == 8) {
                return (OverlapMetric) singleFieldBuilderV3.getMessage();
            }
            return OverlapMetric.getDefaultInstance();
        }

        public Builder setOverlap(OverlapMetric overlapMetric) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.overlapBuilder_;
            if (singleFieldBuilderV3 == null) {
                overlapMetric.getClass();
                this.metric_ = overlapMetric;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(overlapMetric);
            }
            this.metricCase_ = 8;
            return this;
        }

        public Builder setOverlap(OverlapMetric.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.overlapBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.metric_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.metricCase_ = 8;
            return this;
        }

        public Builder mergeOverlap(OverlapMetric overlapMetric) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.overlapBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.metricCase_ == 8 && this.metric_ != OverlapMetric.getDefaultInstance()) {
                    this.metric_ = OverlapMetric.newBuilder((OverlapMetric) this.metric_).mergeFrom(overlapMetric).buildPartial();
                } else {
                    this.metric_ = overlapMetric;
                }
                onChanged();
            } else {
                if (this.metricCase_ == 8) {
                    singleFieldBuilderV3.mergeFrom(overlapMetric);
                }
                this.overlapBuilder_.setMessage(overlapMetric);
            }
            this.metricCase_ = 8;
            return this;
        }

        public Builder clearOverlap() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.overlapBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.metricCase_ == 8) {
                    this.metricCase_ = 0;
                    this.metric_ = null;
                    onChanged();
                }
            } else {
                if (this.metricCase_ == 8) {
                    this.metricCase_ = 0;
                    this.metric_ = null;
                }
                singleFieldBuilderV3.clear();
            }
            return this;
        }

        public OverlapMetric.Builder getOverlapBuilder() {
            return (OverlapMetric.Builder) getOverlapFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.MetricRequirementOrBuilder
        public OverlapMetricOrBuilder getOverlapOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3;
            int i = this.metricCase_;
            if (i == 8 && (singleFieldBuilderV3 = this.overlapBuilder_) != null) {
                return (OverlapMetricOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            if (i == 8) {
                return (OverlapMetric) this.metric_;
            }
            return OverlapMetric.getDefaultInstance();
        }

        private SingleFieldBuilderV3 getOverlapFieldBuilder() {
            if (this.overlapBuilder_ == null) {
                if (this.metricCase_ != 8) {
                    this.metric_ = OverlapMetric.getDefaultInstance();
                }
                this.overlapBuilder_ = new SingleFieldBuilderV3((OverlapMetric) this.metric_, getParentForChildren(), isClean());
                this.metric_ = null;
            }
            this.metricCase_ = 8;
            onChanged();
            return this.overlapBuilder_;
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

    /* renamed from: io.bidmachine.protobuf.sdk.MetricRequirement$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$io$bidmachine$protobuf$sdk$MetricRequirement$MetricCase;

        static {
            int[] iArr = new int[MetricCase.values().length];
            $SwitchMap$io$bidmachine$protobuf$sdk$MetricRequirement$MetricCase = iArr;
            try {
                iArr[MetricCase.GEOMETRY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$sdk$MetricRequirement$MetricCase[MetricCase.VISIBILITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$sdk$MetricRequirement$MetricCase[MetricCase.LIFECYCLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$sdk$MetricRequirement$MetricCase[MetricCase.OVERLAP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$sdk$MetricRequirement$MetricCase[MetricCase.METRIC_NOT_SET.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static MetricRequirement getDefaultInstance() {
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
    public MetricRequirement mo3244getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
