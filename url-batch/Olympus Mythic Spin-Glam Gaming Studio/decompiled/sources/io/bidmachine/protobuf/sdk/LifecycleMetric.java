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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class LifecycleMetric extends GeneratedMessageV3 implements LifecycleMetricOrBuilder {
    public static final int REQUIRED_STATES_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private int requiredStatesMemoizedSerializedSize;
    private List<Integer> requiredStates_;
    private static final Internal.ListAdapter.Converter requiredStates_converter_ = new Internal.ListAdapter.Converter() { // from class: io.bidmachine.protobuf.sdk.LifecycleMetric.1
        @Override // com.explorestack.protobuf.Internal.ListAdapter.Converter
        public LifecycleState convert(Integer num) {
            LifecycleState valueOf = LifecycleState.valueOf(num.intValue());
            return valueOf == null ? LifecycleState.UNRECOGNIZED : valueOf;
        }
    };
    private static final LifecycleMetric DEFAULT_INSTANCE = new LifecycleMetric();
    private static final Parser PARSER = new AbstractParser() { // from class: io.bidmachine.protobuf.sdk.LifecycleMetric.2
        @Override // com.explorestack.protobuf.Parser
        public LifecycleMetric parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new LifecycleMetric(codedInputStream, extensionRegistryLite);
        }
    };

    private LifecycleMetric(GeneratedMessageV3.Builder builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private LifecycleMetric() {
        this.memoizedIsInitialized = (byte) -1;
        this.requiredStates_ = Collections.emptyList();
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new LifecycleMetric();
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private LifecycleMetric(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                            int readEnum = codedInputStream.readEnum();
                            if (!z2) {
                                this.requiredStates_ = new ArrayList();
                                z2 = true;
                            }
                            this.requiredStates_.add(Integer.valueOf(readEnum));
                        } else if (readTag == 10) {
                            int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                            while (codedInputStream.getBytesUntilLimit() > 0) {
                                int readEnum2 = codedInputStream.readEnum();
                                if (!z2) {
                                    this.requiredStates_ = new ArrayList();
                                    z2 = true;
                                }
                                this.requiredStates_.add(Integer.valueOf(readEnum2));
                            }
                            codedInputStream.popLimit(pushLimit);
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
                    this.requiredStates_ = Collections.unmodifiableList(this.requiredStates_);
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if (z2) {
            this.requiredStates_ = Collections.unmodifiableList(this.requiredStates_);
        }
        this.unknownFields = newBuilder.build();
        makeExtensionsImmutable();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_LifecycleMetric_descriptor;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_LifecycleMetric_fieldAccessorTable.ensureFieldAccessorsInitialized(LifecycleMetric.class, Builder.class);
    }

    public enum LifecycleState implements Internal.EnumLite {
        FOREGROUND(0),
        HAS_WINDOW_FOCUS(1),
        VIEW_APPEARED(2),
        UNRECOGNIZED(-1);

        public static final int FOREGROUND_VALUE = 0;
        public static final int HAS_WINDOW_FOCUS_VALUE = 1;
        public static final int VIEW_APPEARED_VALUE = 2;
        private final int value;
        private static final Internal.EnumLiteMap internalValueMap = new Internal.EnumLiteMap() { // from class: io.bidmachine.protobuf.sdk.LifecycleMetric.LifecycleState.1
            public LifecycleState findValueByNumber(int i) {
                return LifecycleState.forNumber(i);
            }
        };
        private static final LifecycleState[] VALUES = values();

        @Override // com.explorestack.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @Deprecated
        public static LifecycleState valueOf(int i) {
            return forNumber(i);
        }

        public static LifecycleState forNumber(int i) {
            if (i == 0) {
                return FOREGROUND;
            }
            if (i == 1) {
                return HAS_WINDOW_FOCUS;
            }
            if (i != 2) {
                return null;
            }
            return VIEW_APPEARED;
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
            return LifecycleMetric.getDescriptor().getEnumTypes().get(0);
        }

        public static LifecycleState valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }

        LifecycleState(int i) {
            this.value = i;
        }
    }

    @Override // io.bidmachine.protobuf.sdk.LifecycleMetricOrBuilder
    public List<LifecycleState> getRequiredStatesList() {
        return new Internal.ListAdapter(this.requiredStates_, requiredStates_converter_);
    }

    @Override // io.bidmachine.protobuf.sdk.LifecycleMetricOrBuilder
    public int getRequiredStatesCount() {
        return this.requiredStates_.size();
    }

    @Override // io.bidmachine.protobuf.sdk.LifecycleMetricOrBuilder
    public LifecycleState getRequiredStates(int i) {
        return (LifecycleState) requiredStates_converter_.convert(this.requiredStates_.get(i));
    }

    @Override // io.bidmachine.protobuf.sdk.LifecycleMetricOrBuilder
    public List<Integer> getRequiredStatesValueList() {
        return this.requiredStates_;
    }

    @Override // io.bidmachine.protobuf.sdk.LifecycleMetricOrBuilder
    public int getRequiredStatesValue(int i) {
        return this.requiredStates_.get(i).intValue();
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
        getSerializedSize();
        if (getRequiredStatesList().size() > 0) {
            codedOutputStream.writeUInt32NoTag(10);
            codedOutputStream.writeUInt32NoTag(this.requiredStatesMemoizedSerializedSize);
        }
        for (int i = 0; i < this.requiredStates_.size(); i++) {
            codedOutputStream.writeEnumNoTag(this.requiredStates_.get(i).intValue());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.requiredStates_.size(); i3++) {
            i2 += CodedOutputStream.computeEnumSizeNoTag(this.requiredStates_.get(i3).intValue());
        }
        int computeUInt32SizeNoTag = !getRequiredStatesList().isEmpty() ? i2 + 1 + CodedOutputStream.computeUInt32SizeNoTag(i2) : i2;
        this.requiredStatesMemoizedSerializedSize = i2;
        int serializedSize = computeUInt32SizeNoTag + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LifecycleMetric)) {
            return super.equals(obj);
        }
        LifecycleMetric lifecycleMetric = (LifecycleMetric) obj;
        return this.requiredStates_.equals(lifecycleMetric.requiredStates_) && this.unknownFields.equals(lifecycleMetric.unknownFields);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = 779 + getDescriptor().hashCode();
        if (getRequiredStatesCount() > 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + this.requiredStates_.hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public static LifecycleMetric parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LifecycleMetric) PARSER.parseFrom(byteBuffer);
    }

    public static LifecycleMetric parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LifecycleMetric) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static LifecycleMetric parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (LifecycleMetric) PARSER.parseFrom(byteString);
    }

    public static LifecycleMetric parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LifecycleMetric) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static LifecycleMetric parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (LifecycleMetric) PARSER.parseFrom(bArr);
    }

    public static LifecycleMetric parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LifecycleMetric) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static LifecycleMetric parseFrom(InputStream inputStream) throws IOException {
        return (LifecycleMetric) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static LifecycleMetric parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LifecycleMetric) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static LifecycleMetric parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LifecycleMetric) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static LifecycleMetric parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LifecycleMetric) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static LifecycleMetric parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (LifecycleMetric) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static LifecycleMetric parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LifecycleMetric) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(LifecycleMetric lifecycleMetric) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(lifecycleMetric);
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

    public static final class Builder extends GeneratedMessageV3.Builder implements LifecycleMetricOrBuilder {
        private int bitField0_;
        private List<Integer> requiredStates_;

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_LifecycleMetric_descriptor;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_LifecycleMetric_fieldAccessorTable.ensureFieldAccessorsInitialized(LifecycleMetric.class, Builder.class);
        }

        private Builder() {
            this.requiredStates_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.requiredStates_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.requiredStates_ = Collections.emptyList();
            this.bitField0_ &= -2;
            return this;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_LifecycleMetric_descriptor;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* renamed from: getDefaultInstanceForType */
        public LifecycleMetric mo3244getDefaultInstanceForType() {
            return LifecycleMetric.getDefaultInstance();
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public LifecycleMetric build() {
            LifecycleMetric buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public LifecycleMetric buildPartial() {
            LifecycleMetric lifecycleMetric = new LifecycleMetric(this);
            if ((this.bitField0_ & 1) != 0) {
                this.requiredStates_ = Collections.unmodifiableList(this.requiredStates_);
                this.bitField0_ &= -2;
            }
            lifecycleMetric.requiredStates_ = this.requiredStates_;
            onBuilt();
            return lifecycleMetric;
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
            if (message instanceof LifecycleMetric) {
                return mergeFrom((LifecycleMetric) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(LifecycleMetric lifecycleMetric) {
            if (lifecycleMetric == LifecycleMetric.getDefaultInstance()) {
                return this;
            }
            if (!lifecycleMetric.requiredStates_.isEmpty()) {
                if (this.requiredStates_.isEmpty()) {
                    this.requiredStates_ = lifecycleMetric.requiredStates_;
                    this.bitField0_ &= -2;
                } else {
                    ensureRequiredStatesIsMutable();
                    this.requiredStates_.addAll(lifecycleMetric.requiredStates_);
                }
                onChanged();
            }
            mergeUnknownFields(((GeneratedMessageV3) lifecycleMetric).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            LifecycleMetric lifecycleMetric = null;
            try {
                try {
                    LifecycleMetric lifecycleMetric2 = (LifecycleMetric) LifecycleMetric.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (lifecycleMetric2 != null) {
                        mergeFrom(lifecycleMetric2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    LifecycleMetric lifecycleMetric3 = (LifecycleMetric) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        lifecycleMetric = lifecycleMetric3;
                        if (lifecycleMetric != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (lifecycleMetric != null) {
                    mergeFrom(lifecycleMetric);
                }
                throw th;
            }
        }

        private void ensureRequiredStatesIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.requiredStates_ = new ArrayList(this.requiredStates_);
                this.bitField0_ |= 1;
            }
        }

        @Override // io.bidmachine.protobuf.sdk.LifecycleMetricOrBuilder
        public List<LifecycleState> getRequiredStatesList() {
            return new Internal.ListAdapter(this.requiredStates_, LifecycleMetric.requiredStates_converter_);
        }

        @Override // io.bidmachine.protobuf.sdk.LifecycleMetricOrBuilder
        public int getRequiredStatesCount() {
            return this.requiredStates_.size();
        }

        @Override // io.bidmachine.protobuf.sdk.LifecycleMetricOrBuilder
        public LifecycleState getRequiredStates(int i) {
            return (LifecycleState) LifecycleMetric.requiredStates_converter_.convert(this.requiredStates_.get(i));
        }

        public Builder setRequiredStates(int i, LifecycleState lifecycleState) {
            lifecycleState.getClass();
            ensureRequiredStatesIsMutable();
            this.requiredStates_.set(i, Integer.valueOf(lifecycleState.getNumber()));
            onChanged();
            return this;
        }

        public Builder addRequiredStates(LifecycleState lifecycleState) {
            lifecycleState.getClass();
            ensureRequiredStatesIsMutable();
            this.requiredStates_.add(Integer.valueOf(lifecycleState.getNumber()));
            onChanged();
            return this;
        }

        public Builder addAllRequiredStates(Iterable<? extends LifecycleState> iterable) {
            ensureRequiredStatesIsMutable();
            Iterator<? extends LifecycleState> it = iterable.iterator();
            while (it.hasNext()) {
                this.requiredStates_.add(Integer.valueOf(it.next().getNumber()));
            }
            onChanged();
            return this;
        }

        public Builder clearRequiredStates() {
            this.requiredStates_ = Collections.emptyList();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.sdk.LifecycleMetricOrBuilder
        public List<Integer> getRequiredStatesValueList() {
            return Collections.unmodifiableList(this.requiredStates_);
        }

        @Override // io.bidmachine.protobuf.sdk.LifecycleMetricOrBuilder
        public int getRequiredStatesValue(int i) {
            return this.requiredStates_.get(i).intValue();
        }

        public Builder setRequiredStatesValue(int i, int i2) {
            ensureRequiredStatesIsMutable();
            this.requiredStates_.set(i, Integer.valueOf(i2));
            onChanged();
            return this;
        }

        public Builder addRequiredStatesValue(int i) {
            ensureRequiredStatesIsMutable();
            this.requiredStates_.add(Integer.valueOf(i));
            onChanged();
            return this;
        }

        public Builder addAllRequiredStatesValue(Iterable<Integer> iterable) {
            ensureRequiredStatesIsMutable();
            for (Integer num : iterable) {
                num.intValue();
                this.requiredStates_.add(num);
            }
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

    public static LifecycleMetric getDefaultInstance() {
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
    public LifecycleMetric mo3244getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
