package io.bidmachine.protobuf.sdk;

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
import com.explorestack.protobuf.Parser;
import com.explorestack.protobuf.RepeatedFieldBuilderV3;
import com.explorestack.protobuf.SingleFieldBuilderV3;
import com.explorestack.protobuf.UnknownFieldSet;
import io.bidmachine.protobuf.sdk.Measurement;
import io.bidmachine.protobuf.sdk.MetricRequirement;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes9.dex */
public final class ViewabilityRule extends GeneratedMessageV3 implements ViewabilityRuleOrBuilder {
    public static final int BILLABLE_FIELD_NUMBER = 2;
    public static final int EVENT_FIELD_NUMBER = 1;
    public static final int MEASUREMENT_FIELD_NUMBER = 3;
    public static final int REQUIRED_METRICS_FIELD_NUMBER = 5;
    private static final long serialVersionUID = 0;
    private boolean billable_;
    private int event_;
    private Measurement measurement_;
    private byte memoizedIsInitialized;
    private List<MetricRequirement> requiredMetrics_;
    private static final ViewabilityRule DEFAULT_INSTANCE = new ViewabilityRule();
    private static final Parser PARSER = new AbstractParser() { // from class: io.bidmachine.protobuf.sdk.ViewabilityRule.1
        @Override // com.explorestack.protobuf.Parser
        public ViewabilityRule parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new ViewabilityRule(codedInputStream, extensionRegistryLite);
        }
    };

    private ViewabilityRule(GeneratedMessageV3.Builder builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private ViewabilityRule() {
        this.memoizedIsInitialized = (byte) -1;
        this.requiredMetrics_ = Collections.emptyList();
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new ViewabilityRule();
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ViewabilityRule(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
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
                            this.event_ = codedInputStream.readUInt32();
                        } else if (readTag == 16) {
                            this.billable_ = codedInputStream.readBool();
                        } else if (readTag == 26) {
                            Measurement measurement = this.measurement_;
                            Measurement.Builder builder = measurement != null ? measurement.toBuilder() : null;
                            Measurement measurement2 = (Measurement) codedInputStream.readMessage(Measurement.parser(), extensionRegistryLite);
                            this.measurement_ = measurement2;
                            if (builder != null) {
                                builder.mergeFrom(measurement2);
                                this.measurement_ = builder.buildPartial();
                            }
                        } else if (readTag == 42) {
                            if (!z2) {
                                this.requiredMetrics_ = new ArrayList();
                                z2 = true;
                            }
                            this.requiredMetrics_.add(codedInputStream.readMessage(MetricRequirement.parser(), extensionRegistryLite));
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
                if (z2) {
                    this.requiredMetrics_ = Collections.unmodifiableList(this.requiredMetrics_);
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if (z2) {
            this.requiredMetrics_ = Collections.unmodifiableList(this.requiredMetrics_);
        }
        this.unknownFields = newBuilder.build();
        makeExtensionsImmutable();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_ViewabilityRule_descriptor;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_ViewabilityRule_fieldAccessorTable.ensureFieldAccessorsInitialized(ViewabilityRule.class, Builder.class);
    }

    @Override // io.bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
    public int getEvent() {
        return this.event_;
    }

    @Override // io.bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
    public boolean getBillable() {
        return this.billable_;
    }

    @Override // io.bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
    public boolean hasMeasurement() {
        return this.measurement_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
    public Measurement getMeasurement() {
        Measurement measurement = this.measurement_;
        return measurement == null ? Measurement.getDefaultInstance() : measurement;
    }

    @Override // io.bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
    public MeasurementOrBuilder getMeasurementOrBuilder() {
        return getMeasurement();
    }

    @Override // io.bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
    public List<MetricRequirement> getRequiredMetricsList() {
        return this.requiredMetrics_;
    }

    @Override // io.bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
    public List<? extends MetricRequirementOrBuilder> getRequiredMetricsOrBuilderList() {
        return this.requiredMetrics_;
    }

    @Override // io.bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
    public int getRequiredMetricsCount() {
        return this.requiredMetrics_.size();
    }

    @Override // io.bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
    public MetricRequirement getRequiredMetrics(int i) {
        return this.requiredMetrics_.get(i);
    }

    @Override // io.bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
    public MetricRequirementOrBuilder getRequiredMetricsOrBuilder(int i) {
        return this.requiredMetrics_.get(i);
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
        int i = this.event_;
        if (i != 0) {
            codedOutputStream.writeUInt32(1, i);
        }
        boolean z = this.billable_;
        if (z) {
            codedOutputStream.writeBool(2, z);
        }
        if (this.measurement_ != null) {
            codedOutputStream.writeMessage(3, getMeasurement());
        }
        for (int i2 = 0; i2 < this.requiredMetrics_.size(); i2++) {
            codedOutputStream.writeMessage(5, this.requiredMetrics_.get(i2));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = this.event_;
        int computeUInt32Size = i2 != 0 ? CodedOutputStream.computeUInt32Size(1, i2) : 0;
        boolean z = this.billable_;
        if (z) {
            computeUInt32Size += CodedOutputStream.computeBoolSize(2, z);
        }
        if (this.measurement_ != null) {
            computeUInt32Size += CodedOutputStream.computeMessageSize(3, getMeasurement());
        }
        for (int i3 = 0; i3 < this.requiredMetrics_.size(); i3++) {
            computeUInt32Size += CodedOutputStream.computeMessageSize(5, this.requiredMetrics_.get(i3));
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
        if (!(obj instanceof ViewabilityRule)) {
            return super.equals(obj);
        }
        ViewabilityRule viewabilityRule = (ViewabilityRule) obj;
        if (getEvent() == viewabilityRule.getEvent() && getBillable() == viewabilityRule.getBillable() && hasMeasurement() == viewabilityRule.hasMeasurement()) {
            return (!hasMeasurement() || getMeasurement().equals(viewabilityRule.getMeasurement())) && getRequiredMetricsList().equals(viewabilityRule.getRequiredMetricsList()) && this.unknownFields.equals(viewabilityRule.unknownFields);
        }
        return false;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getEvent()) * 37) + 2) * 53) + Internal.hashBoolean(getBillable());
        if (hasMeasurement()) {
            hashCode = (((hashCode * 37) + 3) * 53) + getMeasurement().hashCode();
        }
        if (getRequiredMetricsCount() > 0) {
            hashCode = (((hashCode * 37) + 5) * 53) + getRequiredMetricsList().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public static ViewabilityRule parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ViewabilityRule) PARSER.parseFrom(byteBuffer);
    }

    public static ViewabilityRule parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewabilityRule) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ViewabilityRule parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ViewabilityRule) PARSER.parseFrom(byteString);
    }

    public static ViewabilityRule parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewabilityRule) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static ViewabilityRule parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ViewabilityRule) PARSER.parseFrom(bArr);
    }

    public static ViewabilityRule parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewabilityRule) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static ViewabilityRule parseFrom(InputStream inputStream) throws IOException {
        return (ViewabilityRule) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static ViewabilityRule parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewabilityRule) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static ViewabilityRule parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ViewabilityRule) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static ViewabilityRule parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewabilityRule) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static ViewabilityRule parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ViewabilityRule) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static ViewabilityRule parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewabilityRule) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(ViewabilityRule viewabilityRule) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(viewabilityRule);
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

    public static final class Builder extends GeneratedMessageV3.Builder implements ViewabilityRuleOrBuilder {
        private boolean billable_;
        private int bitField0_;
        private int event_;
        private SingleFieldBuilderV3 measurementBuilder_;
        private Measurement measurement_;
        private RepeatedFieldBuilderV3 requiredMetricsBuilder_;
        private List<MetricRequirement> requiredMetrics_;

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_ViewabilityRule_descriptor;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_ViewabilityRule_fieldAccessorTable.ensureFieldAccessorsInitialized(ViewabilityRule.class, Builder.class);
        }

        private Builder() {
            this.requiredMetrics_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.requiredMetrics_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                getRequiredMetricsFieldBuilder();
            }
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.event_ = 0;
            this.billable_ = false;
            if (this.measurementBuilder_ == null) {
                this.measurement_ = null;
            } else {
                this.measurement_ = null;
                this.measurementBuilder_ = null;
            }
            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.requiredMetricsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.requiredMetrics_ = Collections.emptyList();
                this.bitField0_ &= -2;
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_ViewabilityRule_descriptor;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* renamed from: getDefaultInstanceForType */
        public ViewabilityRule mo3244getDefaultInstanceForType() {
            return ViewabilityRule.getDefaultInstance();
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public ViewabilityRule build() {
            ViewabilityRule buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public ViewabilityRule buildPartial() {
            ViewabilityRule viewabilityRule = new ViewabilityRule(this);
            viewabilityRule.event_ = this.event_;
            viewabilityRule.billable_ = this.billable_;
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.measurementBuilder_;
            if (singleFieldBuilderV3 == null) {
                viewabilityRule.measurement_ = this.measurement_;
            } else {
                viewabilityRule.measurement_ = (Measurement) singleFieldBuilderV3.build();
            }
            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.requiredMetricsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                viewabilityRule.requiredMetrics_ = repeatedFieldBuilderV3.build();
            } else {
                if ((this.bitField0_ & 1) != 0) {
                    this.requiredMetrics_ = Collections.unmodifiableList(this.requiredMetrics_);
                    this.bitField0_ &= -2;
                }
                viewabilityRule.requiredMetrics_ = this.requiredMetrics_;
            }
            onBuilt();
            return viewabilityRule;
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
            if (message instanceof ViewabilityRule) {
                return mergeFrom((ViewabilityRule) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(ViewabilityRule viewabilityRule) {
            if (viewabilityRule == ViewabilityRule.getDefaultInstance()) {
                return this;
            }
            if (viewabilityRule.getEvent() != 0) {
                setEvent(viewabilityRule.getEvent());
            }
            if (viewabilityRule.getBillable()) {
                setBillable(viewabilityRule.getBillable());
            }
            if (viewabilityRule.hasMeasurement()) {
                mergeMeasurement(viewabilityRule.getMeasurement());
            }
            if (this.requiredMetricsBuilder_ == null) {
                if (!viewabilityRule.requiredMetrics_.isEmpty()) {
                    if (this.requiredMetrics_.isEmpty()) {
                        this.requiredMetrics_ = viewabilityRule.requiredMetrics_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureRequiredMetricsIsMutable();
                        this.requiredMetrics_.addAll(viewabilityRule.requiredMetrics_);
                    }
                    onChanged();
                }
            } else if (!viewabilityRule.requiredMetrics_.isEmpty()) {
                if (!this.requiredMetricsBuilder_.isEmpty()) {
                    this.requiredMetricsBuilder_.addAllMessages(viewabilityRule.requiredMetrics_);
                } else {
                    this.requiredMetricsBuilder_.dispose();
                    this.requiredMetricsBuilder_ = null;
                    this.requiredMetrics_ = viewabilityRule.requiredMetrics_;
                    this.bitField0_ &= -2;
                    this.requiredMetricsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getRequiredMetricsFieldBuilder() : null;
                }
            }
            mergeUnknownFields(((GeneratedMessageV3) viewabilityRule).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            ViewabilityRule viewabilityRule = null;
            try {
                try {
                    ViewabilityRule viewabilityRule2 = (ViewabilityRule) ViewabilityRule.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (viewabilityRule2 != null) {
                        mergeFrom(viewabilityRule2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    ViewabilityRule viewabilityRule3 = (ViewabilityRule) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        viewabilityRule = viewabilityRule3;
                        if (viewabilityRule != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (viewabilityRule != null) {
                    mergeFrom(viewabilityRule);
                }
                throw th;
            }
        }

        @Override // io.bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
        public int getEvent() {
            return this.event_;
        }

        public Builder setEvent(int i) {
            this.event_ = i;
            onChanged();
            return this;
        }

        public Builder clearEvent() {
            this.event_ = 0;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
        public boolean getBillable() {
            return this.billable_;
        }

        public Builder setBillable(boolean z) {
            this.billable_ = z;
            onChanged();
            return this;
        }

        public Builder clearBillable() {
            this.billable_ = false;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
        public boolean hasMeasurement() {
            return (this.measurementBuilder_ == null && this.measurement_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
        public Measurement getMeasurement() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.measurementBuilder_;
            if (singleFieldBuilderV3 == null) {
                Measurement measurement = this.measurement_;
                return measurement == null ? Measurement.getDefaultInstance() : measurement;
            }
            return (Measurement) singleFieldBuilderV3.getMessage();
        }

        public Builder setMeasurement(Measurement measurement) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.measurementBuilder_;
            if (singleFieldBuilderV3 == null) {
                measurement.getClass();
                this.measurement_ = measurement;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(measurement);
            }
            return this;
        }

        public Builder setMeasurement(Measurement.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.measurementBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.measurement_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeMeasurement(Measurement measurement) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.measurementBuilder_;
            if (singleFieldBuilderV3 == null) {
                Measurement measurement2 = this.measurement_;
                if (measurement2 != null) {
                    this.measurement_ = Measurement.newBuilder(measurement2).mergeFrom(measurement).buildPartial();
                } else {
                    this.measurement_ = measurement;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(measurement);
            }
            return this;
        }

        public Builder clearMeasurement() {
            if (this.measurementBuilder_ == null) {
                this.measurement_ = null;
                onChanged();
            } else {
                this.measurement_ = null;
                this.measurementBuilder_ = null;
            }
            return this;
        }

        public Measurement.Builder getMeasurementBuilder() {
            onChanged();
            return (Measurement.Builder) getMeasurementFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
        public MeasurementOrBuilder getMeasurementOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.measurementBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (MeasurementOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            Measurement measurement = this.measurement_;
            return measurement == null ? Measurement.getDefaultInstance() : measurement;
        }

        private SingleFieldBuilderV3 getMeasurementFieldBuilder() {
            if (this.measurementBuilder_ == null) {
                this.measurementBuilder_ = new SingleFieldBuilderV3(getMeasurement(), getParentForChildren(), isClean());
                this.measurement_ = null;
            }
            return this.measurementBuilder_;
        }

        private void ensureRequiredMetricsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.requiredMetrics_ = new ArrayList(this.requiredMetrics_);
                this.bitField0_ |= 1;
            }
        }

        @Override // io.bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
        public List<MetricRequirement> getRequiredMetricsList() {
            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.requiredMetricsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.requiredMetrics_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        @Override // io.bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
        public int getRequiredMetricsCount() {
            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.requiredMetricsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.requiredMetrics_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        @Override // io.bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
        public MetricRequirement getRequiredMetrics(int i) {
            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.requiredMetricsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.requiredMetrics_.get(i);
            }
            return (MetricRequirement) repeatedFieldBuilderV3.getMessage(i);
        }

        public Builder setRequiredMetrics(int i, MetricRequirement metricRequirement) {
            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.requiredMetricsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                metricRequirement.getClass();
                ensureRequiredMetricsIsMutable();
                this.requiredMetrics_.set(i, metricRequirement);
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, metricRequirement);
            }
            return this;
        }

        public Builder setRequiredMetrics(int i, MetricRequirement.Builder builder) {
            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.requiredMetricsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureRequiredMetricsIsMutable();
                this.requiredMetrics_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addRequiredMetrics(MetricRequirement metricRequirement) {
            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.requiredMetricsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                metricRequirement.getClass();
                ensureRequiredMetricsIsMutable();
                this.requiredMetrics_.add(metricRequirement);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(metricRequirement);
            }
            return this;
        }

        public Builder addRequiredMetrics(int i, MetricRequirement metricRequirement) {
            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.requiredMetricsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                metricRequirement.getClass();
                ensureRequiredMetricsIsMutable();
                this.requiredMetrics_.add(i, metricRequirement);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, metricRequirement);
            }
            return this;
        }

        public Builder addRequiredMetrics(MetricRequirement.Builder builder) {
            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.requiredMetricsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureRequiredMetricsIsMutable();
                this.requiredMetrics_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addRequiredMetrics(int i, MetricRequirement.Builder builder) {
            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.requiredMetricsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureRequiredMetricsIsMutable();
                this.requiredMetrics_.add(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllRequiredMetrics(Iterable<? extends MetricRequirement> iterable) {
            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.requiredMetricsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureRequiredMetricsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.requiredMetrics_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearRequiredMetrics() {
            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.requiredMetricsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.requiredMetrics_ = Collections.emptyList();
                this.bitField0_ &= -2;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder removeRequiredMetrics(int i) {
            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.requiredMetricsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureRequiredMetricsIsMutable();
                this.requiredMetrics_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i);
            }
            return this;
        }

        public MetricRequirement.Builder getRequiredMetricsBuilder(int i) {
            return (MetricRequirement.Builder) getRequiredMetricsFieldBuilder().getBuilder(i);
        }

        @Override // io.bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
        public MetricRequirementOrBuilder getRequiredMetricsOrBuilder(int i) {
            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.requiredMetricsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.requiredMetrics_.get(i);
            }
            return (MetricRequirementOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        @Override // io.bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
        public List<? extends MetricRequirementOrBuilder> getRequiredMetricsOrBuilderList() {
            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.requiredMetricsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.requiredMetrics_);
        }

        public MetricRequirement.Builder addRequiredMetricsBuilder() {
            return (MetricRequirement.Builder) getRequiredMetricsFieldBuilder().addBuilder(MetricRequirement.getDefaultInstance());
        }

        public MetricRequirement.Builder addRequiredMetricsBuilder(int i) {
            return (MetricRequirement.Builder) getRequiredMetricsFieldBuilder().addBuilder(i, MetricRequirement.getDefaultInstance());
        }

        public List<MetricRequirement.Builder> getRequiredMetricsBuilderList() {
            return getRequiredMetricsFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3 getRequiredMetricsFieldBuilder() {
            if (this.requiredMetricsBuilder_ == null) {
                this.requiredMetricsBuilder_ = new RepeatedFieldBuilderV3(this.requiredMetrics_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.requiredMetrics_ = null;
            }
            return this.requiredMetricsBuilder_;
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

    public static ViewabilityRule getDefaultInstance() {
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
    public ViewabilityRule mo3244getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
