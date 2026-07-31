package io.bidmachine.protobuf.analytics.events;

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
import com.explorestack.protobuf.SingleFieldBuilderV3;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.StringValueOrBuilder;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.StructOrBuilder;
import com.explorestack.protobuf.Timestamp;
import com.explorestack.protobuf.TimestampOrBuilder;
import com.explorestack.protobuf.UnknownFieldSet;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import io.bidmachine.protobuf.sdk.Error;
import io.bidmachine.protobuf.sdk.ErrorOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
public final class SDKEvent extends GeneratedMessageV3 implements SDKEventOrBuilder {
    public static final int ACTION_FIELD_NUMBER = 1;
    public static final int AD_TYPE_FIELD_NUMBER = 6;
    public static final int BILLABLE_FIELD_NUMBER = 10;
    public static final int CONTEXT_FIELD_NUMBER = 2;
    public static final int CUSTOM_PARAMS_FIELD_NUMBER = 9;
    public static final int ERROR_FIELD_NUMBER = 8;
    public static final int FINISH_TIME_FIELD_NUMBER = 5;
    public static final int NETWORK_FIELD_NUMBER = 3;
    public static final int PRICE_FIELD_NUMBER = 7;
    public static final int START_TIME_FIELD_NUMBER = 4;
    private static final long serialVersionUID = 0;
    private int action_;
    private StringValue adType_;
    private boolean billable_;
    private int bitField0_;
    private volatile Object context_;
    private Struct customParams_;
    private Error error_;
    private Timestamp finishTime_;
    private byte memoizedIsInitialized;
    private StringValue network_;
    private double price_;
    private Timestamp startTime_;
    private static final SDKEvent DEFAULT_INSTANCE = new SDKEvent();
    private static final Parser PARSER = new AbstractParser() { // from class: io.bidmachine.protobuf.analytics.events.SDKEvent.1
        @Override // com.explorestack.protobuf.Parser
        public SDKEvent parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new SDKEvent(codedInputStream, extensionRegistryLite);
        }
    };

    private SDKEvent(GeneratedMessageV3.Builder builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private SDKEvent() {
        this.memoizedIsInitialized = (byte) -1;
        this.context_ = "";
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new SDKEvent();
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private SDKEvent(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                        case 8:
                            this.action_ = codedInputStream.readUInt32();
                        case 18:
                            this.context_ = codedInputStream.readStringRequireUtf8();
                        case 26:
                            StringValue stringValue = this.network_;
                            StringValue.Builder builder = stringValue != null ? stringValue.toBuilder() : null;
                            StringValue stringValue2 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                            this.network_ = stringValue2;
                            if (builder != null) {
                                builder.mergeFrom(stringValue2);
                                this.network_ = builder.buildPartial();
                            }
                        case 34:
                            Timestamp timestamp = this.startTime_;
                            Timestamp.Builder builder2 = timestamp != null ? timestamp.toBuilder() : null;
                            Timestamp timestamp2 = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                            this.startTime_ = timestamp2;
                            if (builder2 != null) {
                                builder2.mergeFrom(timestamp2);
                                this.startTime_ = builder2.buildPartial();
                            }
                        case 42:
                            Timestamp timestamp3 = this.finishTime_;
                            Timestamp.Builder builder3 = timestamp3 != null ? timestamp3.toBuilder() : null;
                            Timestamp timestamp4 = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                            this.finishTime_ = timestamp4;
                            if (builder3 != null) {
                                builder3.mergeFrom(timestamp4);
                                this.finishTime_ = builder3.buildPartial();
                            }
                        case 50:
                            StringValue stringValue3 = this.adType_;
                            StringValue.Builder builder4 = stringValue3 != null ? stringValue3.toBuilder() : null;
                            StringValue stringValue4 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                            this.adType_ = stringValue4;
                            if (builder4 != null) {
                                builder4.mergeFrom(stringValue4);
                                this.adType_ = builder4.buildPartial();
                            }
                        case 57:
                            this.price_ = codedInputStream.readDouble();
                        case 66:
                            Error error = this.error_;
                            Error.Builder builder5 = error != null ? error.toBuilder() : null;
                            Error error2 = (Error) codedInputStream.readMessage(Error.parser(), extensionRegistryLite);
                            this.error_ = error2;
                            if (builder5 != null) {
                                builder5.mergeFrom(error2);
                                this.error_ = builder5.buildPartial();
                            }
                        case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
                            Struct struct = this.customParams_;
                            Struct.Builder builder6 = struct != null ? struct.toBuilder() : null;
                            Struct struct2 = (Struct) codedInputStream.readMessage(Struct.parser(), extensionRegistryLite);
                            this.customParams_ = struct2;
                            if (builder6 != null) {
                                builder6.mergeFrom(struct2);
                                this.customParams_ = builder6.buildPartial();
                            }
                        case 80:
                            this.bitField0_ |= 1;
                            this.billable_ = codedInputStream.readBool();
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
        return EventsProto.internal_static_bidmachine_protobuf_analytics_events_SDKEvent_descriptor;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return EventsProto.internal_static_bidmachine_protobuf_analytics_events_SDKEvent_fieldAccessorTable.ensureFieldAccessorsInitialized(SDKEvent.class, Builder.class);
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public int getAction() {
        return this.action_;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public String getContext() {
        Object obj = this.context_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.context_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public ByteString getContextBytes() {
        Object obj = this.context_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.context_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public boolean hasNetwork() {
        return this.network_ != null;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public StringValue getNetwork() {
        StringValue stringValue = this.network_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public StringValueOrBuilder getNetworkOrBuilder() {
        return getNetwork();
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public boolean hasStartTime() {
        return this.startTime_ != null;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public Timestamp getStartTime() {
        Timestamp timestamp = this.startTime_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public TimestampOrBuilder getStartTimeOrBuilder() {
        return getStartTime();
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public boolean hasFinishTime() {
        return this.finishTime_ != null;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public Timestamp getFinishTime() {
        Timestamp timestamp = this.finishTime_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public TimestampOrBuilder getFinishTimeOrBuilder() {
        return getFinishTime();
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public boolean hasAdType() {
        return this.adType_ != null;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public StringValue getAdType() {
        StringValue stringValue = this.adType_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public StringValueOrBuilder getAdTypeOrBuilder() {
        return getAdType();
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public double getPrice() {
        return this.price_;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public boolean hasError() {
        return this.error_ != null;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public Error getError() {
        Error error = this.error_;
        return error == null ? Error.getDefaultInstance() : error;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public ErrorOrBuilder getErrorOrBuilder() {
        return getError();
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public boolean hasCustomParams() {
        return this.customParams_ != null;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public Struct getCustomParams() {
        Struct struct = this.customParams_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public StructOrBuilder getCustomParamsOrBuilder() {
        return getCustomParams();
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public boolean hasBillable() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public boolean getBillable() {
        return this.billable_;
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
        int i = this.action_;
        if (i != 0) {
            codedOutputStream.writeUInt32(1, i);
        }
        if (!getContextBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.context_);
        }
        if (this.network_ != null) {
            codedOutputStream.writeMessage(3, getNetwork());
        }
        if (this.startTime_ != null) {
            codedOutputStream.writeMessage(4, getStartTime());
        }
        if (this.finishTime_ != null) {
            codedOutputStream.writeMessage(5, getFinishTime());
        }
        if (this.adType_ != null) {
            codedOutputStream.writeMessage(6, getAdType());
        }
        double d = this.price_;
        if (d != 0.0d) {
            codedOutputStream.writeDouble(7, d);
        }
        if (this.error_ != null) {
            codedOutputStream.writeMessage(8, getError());
        }
        if (this.customParams_ != null) {
            codedOutputStream.writeMessage(9, getCustomParams());
        }
        if ((this.bitField0_ & 1) != 0) {
            codedOutputStream.writeBool(10, this.billable_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = this.action_;
        int computeUInt32Size = i2 != 0 ? CodedOutputStream.computeUInt32Size(1, i2) : 0;
        if (!getContextBytes().isEmpty()) {
            computeUInt32Size += GeneratedMessageV3.computeStringSize(2, this.context_);
        }
        if (this.network_ != null) {
            computeUInt32Size += CodedOutputStream.computeMessageSize(3, getNetwork());
        }
        if (this.startTime_ != null) {
            computeUInt32Size += CodedOutputStream.computeMessageSize(4, getStartTime());
        }
        if (this.finishTime_ != null) {
            computeUInt32Size += CodedOutputStream.computeMessageSize(5, getFinishTime());
        }
        if (this.adType_ != null) {
            computeUInt32Size += CodedOutputStream.computeMessageSize(6, getAdType());
        }
        double d = this.price_;
        if (d != 0.0d) {
            computeUInt32Size += CodedOutputStream.computeDoubleSize(7, d);
        }
        if (this.error_ != null) {
            computeUInt32Size += CodedOutputStream.computeMessageSize(8, getError());
        }
        if (this.customParams_ != null) {
            computeUInt32Size += CodedOutputStream.computeMessageSize(9, getCustomParams());
        }
        if ((1 & this.bitField0_) != 0) {
            computeUInt32Size += CodedOutputStream.computeBoolSize(10, this.billable_);
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
        if (!(obj instanceof SDKEvent)) {
            return super.equals(obj);
        }
        SDKEvent sDKEvent = (SDKEvent) obj;
        if (getAction() != sDKEvent.getAction() || !getContext().equals(sDKEvent.getContext()) || hasNetwork() != sDKEvent.hasNetwork()) {
            return false;
        }
        if ((hasNetwork() && !getNetwork().equals(sDKEvent.getNetwork())) || hasStartTime() != sDKEvent.hasStartTime()) {
            return false;
        }
        if ((hasStartTime() && !getStartTime().equals(sDKEvent.getStartTime())) || hasFinishTime() != sDKEvent.hasFinishTime()) {
            return false;
        }
        if ((hasFinishTime() && !getFinishTime().equals(sDKEvent.getFinishTime())) || hasAdType() != sDKEvent.hasAdType()) {
            return false;
        }
        if ((hasAdType() && !getAdType().equals(sDKEvent.getAdType())) || Double.doubleToLongBits(getPrice()) != Double.doubleToLongBits(sDKEvent.getPrice()) || hasError() != sDKEvent.hasError()) {
            return false;
        }
        if ((hasError() && !getError().equals(sDKEvent.getError())) || hasCustomParams() != sDKEvent.hasCustomParams()) {
            return false;
        }
        if ((!hasCustomParams() || getCustomParams().equals(sDKEvent.getCustomParams())) && hasBillable() == sDKEvent.hasBillable()) {
            return (!hasBillable() || getBillable() == sDKEvent.getBillable()) && this.unknownFields.equals(sDKEvent.unknownFields);
        }
        return false;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getAction()) * 37) + 2) * 53) + getContext().hashCode();
        if (hasNetwork()) {
            hashCode = (((hashCode * 37) + 3) * 53) + getNetwork().hashCode();
        }
        if (hasStartTime()) {
            hashCode = (((hashCode * 37) + 4) * 53) + getStartTime().hashCode();
        }
        if (hasFinishTime()) {
            hashCode = (((hashCode * 37) + 5) * 53) + getFinishTime().hashCode();
        }
        if (hasAdType()) {
            hashCode = (((hashCode * 37) + 6) * 53) + getAdType().hashCode();
        }
        int hashLong = (((hashCode * 37) + 7) * 53) + Internal.hashLong(Double.doubleToLongBits(getPrice()));
        if (hasError()) {
            hashLong = (((hashLong * 37) + 8) * 53) + getError().hashCode();
        }
        if (hasCustomParams()) {
            hashLong = (((hashLong * 37) + 9) * 53) + getCustomParams().hashCode();
        }
        if (hasBillable()) {
            hashLong = (((hashLong * 37) + 10) * 53) + Internal.hashBoolean(getBillable());
        }
        int hashCode2 = (hashLong * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public static SDKEvent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SDKEvent) PARSER.parseFrom(byteBuffer);
    }

    public static SDKEvent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SDKEvent) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static SDKEvent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SDKEvent) PARSER.parseFrom(byteString);
    }

    public static SDKEvent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SDKEvent) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static SDKEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SDKEvent) PARSER.parseFrom(bArr);
    }

    public static SDKEvent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SDKEvent) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static SDKEvent parseFrom(InputStream inputStream) throws IOException {
        return (SDKEvent) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static SDKEvent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SDKEvent) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static SDKEvent parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SDKEvent) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static SDKEvent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SDKEvent) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static SDKEvent parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SDKEvent) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static SDKEvent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SDKEvent) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(SDKEvent sDKEvent) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(sDKEvent);
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

    public static final class Builder extends GeneratedMessageV3.Builder implements SDKEventOrBuilder {
        private int action_;
        private SingleFieldBuilderV3 adTypeBuilder_;
        private StringValue adType_;
        private boolean billable_;
        private int bitField0_;
        private Object context_;
        private SingleFieldBuilderV3 customParamsBuilder_;
        private Struct customParams_;
        private SingleFieldBuilderV3 errorBuilder_;
        private Error error_;
        private SingleFieldBuilderV3 finishTimeBuilder_;
        private Timestamp finishTime_;
        private SingleFieldBuilderV3 networkBuilder_;
        private StringValue network_;
        private double price_;
        private SingleFieldBuilderV3 startTimeBuilder_;
        private Timestamp startTime_;

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EventsProto.internal_static_bidmachine_protobuf_analytics_events_SDKEvent_descriptor;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EventsProto.internal_static_bidmachine_protobuf_analytics_events_SDKEvent_fieldAccessorTable.ensureFieldAccessorsInitialized(SDKEvent.class, Builder.class);
        }

        private Builder() {
            this.context_ = "";
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.context_ = "";
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.action_ = 0;
            this.context_ = "";
            if (this.networkBuilder_ == null) {
                this.network_ = null;
            } else {
                this.network_ = null;
                this.networkBuilder_ = null;
            }
            if (this.startTimeBuilder_ == null) {
                this.startTime_ = null;
            } else {
                this.startTime_ = null;
                this.startTimeBuilder_ = null;
            }
            if (this.finishTimeBuilder_ == null) {
                this.finishTime_ = null;
            } else {
                this.finishTime_ = null;
                this.finishTimeBuilder_ = null;
            }
            if (this.adTypeBuilder_ == null) {
                this.adType_ = null;
            } else {
                this.adType_ = null;
                this.adTypeBuilder_ = null;
            }
            this.price_ = 0.0d;
            if (this.errorBuilder_ == null) {
                this.error_ = null;
            } else {
                this.error_ = null;
                this.errorBuilder_ = null;
            }
            if (this.customParamsBuilder_ == null) {
                this.customParams_ = null;
            } else {
                this.customParams_ = null;
                this.customParamsBuilder_ = null;
            }
            this.billable_ = false;
            this.bitField0_ &= -2;
            return this;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return EventsProto.internal_static_bidmachine_protobuf_analytics_events_SDKEvent_descriptor;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* renamed from: getDefaultInstanceForType */
        public SDKEvent mo3244getDefaultInstanceForType() {
            return SDKEvent.getDefaultInstance();
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public SDKEvent build() {
            SDKEvent buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public SDKEvent buildPartial() {
            SDKEvent sDKEvent = new SDKEvent(this);
            int i = this.bitField0_;
            sDKEvent.action_ = this.action_;
            sDKEvent.context_ = this.context_;
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.networkBuilder_;
            if (singleFieldBuilderV3 == null) {
                sDKEvent.network_ = this.network_;
            } else {
                sDKEvent.network_ = (StringValue) singleFieldBuilderV3.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV32 = this.startTimeBuilder_;
            if (singleFieldBuilderV32 == null) {
                sDKEvent.startTime_ = this.startTime_;
            } else {
                sDKEvent.startTime_ = (Timestamp) singleFieldBuilderV32.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV33 = this.finishTimeBuilder_;
            if (singleFieldBuilderV33 == null) {
                sDKEvent.finishTime_ = this.finishTime_;
            } else {
                sDKEvent.finishTime_ = (Timestamp) singleFieldBuilderV33.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV34 = this.adTypeBuilder_;
            if (singleFieldBuilderV34 == null) {
                sDKEvent.adType_ = this.adType_;
            } else {
                sDKEvent.adType_ = (StringValue) singleFieldBuilderV34.build();
            }
            sDKEvent.price_ = this.price_;
            SingleFieldBuilderV3 singleFieldBuilderV35 = this.errorBuilder_;
            if (singleFieldBuilderV35 == null) {
                sDKEvent.error_ = this.error_;
            } else {
                sDKEvent.error_ = (Error) singleFieldBuilderV35.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV36 = this.customParamsBuilder_;
            if (singleFieldBuilderV36 == null) {
                sDKEvent.customParams_ = this.customParams_;
            } else {
                sDKEvent.customParams_ = (Struct) singleFieldBuilderV36.build();
            }
            int i2 = 1;
            if ((i & 1) != 0) {
                sDKEvent.billable_ = this.billable_;
            } else {
                i2 = 0;
            }
            sDKEvent.bitField0_ = i2;
            onBuilt();
            return sDKEvent;
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
            if (message instanceof SDKEvent) {
                return mergeFrom((SDKEvent) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(SDKEvent sDKEvent) {
            if (sDKEvent == SDKEvent.getDefaultInstance()) {
                return this;
            }
            if (sDKEvent.getAction() != 0) {
                setAction(sDKEvent.getAction());
            }
            if (!sDKEvent.getContext().isEmpty()) {
                this.context_ = sDKEvent.context_;
                onChanged();
            }
            if (sDKEvent.hasNetwork()) {
                mergeNetwork(sDKEvent.getNetwork());
            }
            if (sDKEvent.hasStartTime()) {
                mergeStartTime(sDKEvent.getStartTime());
            }
            if (sDKEvent.hasFinishTime()) {
                mergeFinishTime(sDKEvent.getFinishTime());
            }
            if (sDKEvent.hasAdType()) {
                mergeAdType(sDKEvent.getAdType());
            }
            if (sDKEvent.getPrice() != 0.0d) {
                setPrice(sDKEvent.getPrice());
            }
            if (sDKEvent.hasError()) {
                mergeError(sDKEvent.getError());
            }
            if (sDKEvent.hasCustomParams()) {
                mergeCustomParams(sDKEvent.getCustomParams());
            }
            if (sDKEvent.hasBillable()) {
                setBillable(sDKEvent.getBillable());
            }
            mergeUnknownFields(((GeneratedMessageV3) sDKEvent).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            SDKEvent sDKEvent = null;
            try {
                try {
                    SDKEvent sDKEvent2 = (SDKEvent) SDKEvent.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (sDKEvent2 != null) {
                        mergeFrom(sDKEvent2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    SDKEvent sDKEvent3 = (SDKEvent) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        sDKEvent = sDKEvent3;
                        if (sDKEvent != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (sDKEvent != null) {
                    mergeFrom(sDKEvent);
                }
                throw th;
            }
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public int getAction() {
            return this.action_;
        }

        public Builder setAction(int i) {
            this.action_ = i;
            onChanged();
            return this;
        }

        public Builder clearAction() {
            this.action_ = 0;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public String getContext() {
            Object obj = this.context_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.context_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public ByteString getContextBytes() {
            Object obj = this.context_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.context_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setContext(String str) {
            str.getClass();
            this.context_ = str;
            onChanged();
            return this;
        }

        public Builder clearContext() {
            this.context_ = SDKEvent.getDefaultInstance().getContext();
            onChanged();
            return this;
        }

        public Builder setContextBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.context_ = byteString;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public boolean hasNetwork() {
            return (this.networkBuilder_ == null && this.network_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public StringValue getNetwork() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.networkBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue = this.network_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }
            return (StringValue) singleFieldBuilderV3.getMessage();
        }

        public Builder setNetwork(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.networkBuilder_;
            if (singleFieldBuilderV3 == null) {
                stringValue.getClass();
                this.network_ = stringValue;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(stringValue);
            }
            return this;
        }

        public Builder setNetwork(StringValue.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.networkBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.network_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeNetwork(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.networkBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue2 = this.network_;
                if (stringValue2 != null) {
                    this.network_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.network_ = stringValue;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(stringValue);
            }
            return this;
        }

        public Builder clearNetwork() {
            if (this.networkBuilder_ == null) {
                this.network_ = null;
                onChanged();
            } else {
                this.network_ = null;
                this.networkBuilder_ = null;
            }
            return this;
        }

        public StringValue.Builder getNetworkBuilder() {
            onChanged();
            return (StringValue.Builder) getNetworkFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public StringValueOrBuilder getNetworkOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.networkBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StringValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            StringValue stringValue = this.network_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        private SingleFieldBuilderV3 getNetworkFieldBuilder() {
            if (this.networkBuilder_ == null) {
                this.networkBuilder_ = new SingleFieldBuilderV3(getNetwork(), getParentForChildren(), isClean());
                this.network_ = null;
            }
            return this.networkBuilder_;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public boolean hasStartTime() {
            return (this.startTimeBuilder_ == null && this.startTime_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public Timestamp getStartTime() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.startTimeBuilder_;
            if (singleFieldBuilderV3 == null) {
                Timestamp timestamp = this.startTime_;
                return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
            }
            return (Timestamp) singleFieldBuilderV3.getMessage();
        }

        public Builder setStartTime(Timestamp timestamp) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.startTimeBuilder_;
            if (singleFieldBuilderV3 == null) {
                timestamp.getClass();
                this.startTime_ = timestamp;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(timestamp);
            }
            return this;
        }

        public Builder setStartTime(Timestamp.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.startTimeBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.startTime_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeStartTime(Timestamp timestamp) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.startTimeBuilder_;
            if (singleFieldBuilderV3 == null) {
                Timestamp timestamp2 = this.startTime_;
                if (timestamp2 != null) {
                    this.startTime_ = Timestamp.newBuilder(timestamp2).mergeFrom(timestamp).buildPartial();
                } else {
                    this.startTime_ = timestamp;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(timestamp);
            }
            return this;
        }

        public Builder clearStartTime() {
            if (this.startTimeBuilder_ == null) {
                this.startTime_ = null;
                onChanged();
            } else {
                this.startTime_ = null;
                this.startTimeBuilder_ = null;
            }
            return this;
        }

        public Timestamp.Builder getStartTimeBuilder() {
            onChanged();
            return (Timestamp.Builder) getStartTimeFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public TimestampOrBuilder getStartTimeOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.startTimeBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (TimestampOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            Timestamp timestamp = this.startTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        private SingleFieldBuilderV3 getStartTimeFieldBuilder() {
            if (this.startTimeBuilder_ == null) {
                this.startTimeBuilder_ = new SingleFieldBuilderV3(getStartTime(), getParentForChildren(), isClean());
                this.startTime_ = null;
            }
            return this.startTimeBuilder_;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public boolean hasFinishTime() {
            return (this.finishTimeBuilder_ == null && this.finishTime_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public Timestamp getFinishTime() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.finishTimeBuilder_;
            if (singleFieldBuilderV3 == null) {
                Timestamp timestamp = this.finishTime_;
                return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
            }
            return (Timestamp) singleFieldBuilderV3.getMessage();
        }

        public Builder setFinishTime(Timestamp timestamp) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.finishTimeBuilder_;
            if (singleFieldBuilderV3 == null) {
                timestamp.getClass();
                this.finishTime_ = timestamp;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(timestamp);
            }
            return this;
        }

        public Builder setFinishTime(Timestamp.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.finishTimeBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.finishTime_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeFinishTime(Timestamp timestamp) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.finishTimeBuilder_;
            if (singleFieldBuilderV3 == null) {
                Timestamp timestamp2 = this.finishTime_;
                if (timestamp2 != null) {
                    this.finishTime_ = Timestamp.newBuilder(timestamp2).mergeFrom(timestamp).buildPartial();
                } else {
                    this.finishTime_ = timestamp;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(timestamp);
            }
            return this;
        }

        public Builder clearFinishTime() {
            if (this.finishTimeBuilder_ == null) {
                this.finishTime_ = null;
                onChanged();
            } else {
                this.finishTime_ = null;
                this.finishTimeBuilder_ = null;
            }
            return this;
        }

        public Timestamp.Builder getFinishTimeBuilder() {
            onChanged();
            return (Timestamp.Builder) getFinishTimeFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public TimestampOrBuilder getFinishTimeOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.finishTimeBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (TimestampOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            Timestamp timestamp = this.finishTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        private SingleFieldBuilderV3 getFinishTimeFieldBuilder() {
            if (this.finishTimeBuilder_ == null) {
                this.finishTimeBuilder_ = new SingleFieldBuilderV3(getFinishTime(), getParentForChildren(), isClean());
                this.finishTime_ = null;
            }
            return this.finishTimeBuilder_;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public boolean hasAdType() {
            return (this.adTypeBuilder_ == null && this.adType_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public StringValue getAdType() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.adTypeBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue = this.adType_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }
            return (StringValue) singleFieldBuilderV3.getMessage();
        }

        public Builder setAdType(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.adTypeBuilder_;
            if (singleFieldBuilderV3 == null) {
                stringValue.getClass();
                this.adType_ = stringValue;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(stringValue);
            }
            return this;
        }

        public Builder setAdType(StringValue.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.adTypeBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.adType_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeAdType(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.adTypeBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue2 = this.adType_;
                if (stringValue2 != null) {
                    this.adType_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.adType_ = stringValue;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(stringValue);
            }
            return this;
        }

        public Builder clearAdType() {
            if (this.adTypeBuilder_ == null) {
                this.adType_ = null;
                onChanged();
            } else {
                this.adType_ = null;
                this.adTypeBuilder_ = null;
            }
            return this;
        }

        public StringValue.Builder getAdTypeBuilder() {
            onChanged();
            return (StringValue.Builder) getAdTypeFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public StringValueOrBuilder getAdTypeOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.adTypeBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StringValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            StringValue stringValue = this.adType_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        private SingleFieldBuilderV3 getAdTypeFieldBuilder() {
            if (this.adTypeBuilder_ == null) {
                this.adTypeBuilder_ = new SingleFieldBuilderV3(getAdType(), getParentForChildren(), isClean());
                this.adType_ = null;
            }
            return this.adTypeBuilder_;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public double getPrice() {
            return this.price_;
        }

        public Builder setPrice(double d) {
            this.price_ = d;
            onChanged();
            return this;
        }

        public Builder clearPrice() {
            this.price_ = 0.0d;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public boolean hasError() {
            return (this.errorBuilder_ == null && this.error_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public Error getError() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.errorBuilder_;
            if (singleFieldBuilderV3 == null) {
                Error error = this.error_;
                return error == null ? Error.getDefaultInstance() : error;
            }
            return (Error) singleFieldBuilderV3.getMessage();
        }

        public Builder setError(Error error) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.errorBuilder_;
            if (singleFieldBuilderV3 == null) {
                error.getClass();
                this.error_ = error;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(error);
            }
            return this;
        }

        public Builder setError(Error.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.errorBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.error_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeError(Error error) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.errorBuilder_;
            if (singleFieldBuilderV3 == null) {
                Error error2 = this.error_;
                if (error2 != null) {
                    this.error_ = Error.newBuilder(error2).mergeFrom(error).buildPartial();
                } else {
                    this.error_ = error;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(error);
            }
            return this;
        }

        public Builder clearError() {
            if (this.errorBuilder_ == null) {
                this.error_ = null;
                onChanged();
            } else {
                this.error_ = null;
                this.errorBuilder_ = null;
            }
            return this;
        }

        public Error.Builder getErrorBuilder() {
            onChanged();
            return (Error.Builder) getErrorFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public ErrorOrBuilder getErrorOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.errorBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (ErrorOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            Error error = this.error_;
            return error == null ? Error.getDefaultInstance() : error;
        }

        private SingleFieldBuilderV3 getErrorFieldBuilder() {
            if (this.errorBuilder_ == null) {
                this.errorBuilder_ = new SingleFieldBuilderV3(getError(), getParentForChildren(), isClean());
                this.error_ = null;
            }
            return this.errorBuilder_;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public boolean hasCustomParams() {
            return (this.customParamsBuilder_ == null && this.customParams_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public Struct getCustomParams() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.customParamsBuilder_;
            if (singleFieldBuilderV3 == null) {
                Struct struct = this.customParams_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }
            return (Struct) singleFieldBuilderV3.getMessage();
        }

        public Builder setCustomParams(Struct struct) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.customParamsBuilder_;
            if (singleFieldBuilderV3 == null) {
                struct.getClass();
                this.customParams_ = struct;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(struct);
            }
            return this;
        }

        public Builder setCustomParams(Struct.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.customParamsBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.customParams_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeCustomParams(Struct struct) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.customParamsBuilder_;
            if (singleFieldBuilderV3 == null) {
                Struct struct2 = this.customParams_;
                if (struct2 != null) {
                    this.customParams_ = Struct.newBuilder(struct2).mergeFrom(struct).buildPartial();
                } else {
                    this.customParams_ = struct;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(struct);
            }
            return this;
        }

        public Builder clearCustomParams() {
            if (this.customParamsBuilder_ == null) {
                this.customParams_ = null;
                onChanged();
            } else {
                this.customParams_ = null;
                this.customParamsBuilder_ = null;
            }
            return this;
        }

        public Struct.Builder getCustomParamsBuilder() {
            onChanged();
            return (Struct.Builder) getCustomParamsFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public StructOrBuilder getCustomParamsOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.customParamsBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StructOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            Struct struct = this.customParams_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        private SingleFieldBuilderV3 getCustomParamsFieldBuilder() {
            if (this.customParamsBuilder_ == null) {
                this.customParamsBuilder_ = new SingleFieldBuilderV3(getCustomParams(), getParentForChildren(), isClean());
                this.customParams_ = null;
            }
            return this.customParamsBuilder_;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public boolean hasBillable() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public boolean getBillable() {
            return this.billable_;
        }

        public Builder setBillable(boolean z) {
            this.bitField0_ |= 1;
            this.billable_ = z;
            onChanged();
            return this;
        }

        public Builder clearBillable() {
            this.bitField0_ &= -2;
            this.billable_ = false;
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

    public static SDKEvent getDefaultInstance() {
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
    public SDKEvent mo3244getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
