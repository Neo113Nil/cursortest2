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
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.Parser;
import com.explorestack.protobuf.RepeatedFieldBuilderV3;
import com.explorestack.protobuf.UnknownFieldSet;
import io.bidmachine.protobuf.sdk.ViewabilityRule;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes9.dex */
public final class ViewabilityConfiguration extends GeneratedMessageV3 implements ViewabilityConfigurationOrBuilder {
    private static final ViewabilityConfiguration DEFAULT_INSTANCE = new ViewabilityConfiguration();
    private static final Parser PARSER = new AbstractParser() { // from class: io.bidmachine.protobuf.sdk.ViewabilityConfiguration.1
        @Override // com.explorestack.protobuf.Parser
        public ViewabilityConfiguration parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new ViewabilityConfiguration(codedInputStream, extensionRegistryLite);
        }
    };
    public static final int RULES_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private List<ViewabilityRule> rules_;

    private ViewabilityConfiguration(GeneratedMessageV3.Builder builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private ViewabilityConfiguration() {
        this.memoizedIsInitialized = (byte) -1;
        this.rules_ = Collections.emptyList();
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new ViewabilityConfiguration();
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ViewabilityConfiguration(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                            if (readTag == 10) {
                                if (!z2) {
                                    this.rules_ = new ArrayList();
                                    z2 = true;
                                }
                                this.rules_.add(codedInputStream.readMessage(ViewabilityRule.parser(), extensionRegistryLite));
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
                    this.rules_ = Collections.unmodifiableList(this.rules_);
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if (z2) {
            this.rules_ = Collections.unmodifiableList(this.rules_);
        }
        this.unknownFields = newBuilder.build();
        makeExtensionsImmutable();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_ViewabilityConfiguration_descriptor;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_ViewabilityConfiguration_fieldAccessorTable.ensureFieldAccessorsInitialized(ViewabilityConfiguration.class, Builder.class);
    }

    @Override // io.bidmachine.protobuf.sdk.ViewabilityConfigurationOrBuilder
    public List<ViewabilityRule> getRulesList() {
        return this.rules_;
    }

    @Override // io.bidmachine.protobuf.sdk.ViewabilityConfigurationOrBuilder
    public List<? extends ViewabilityRuleOrBuilder> getRulesOrBuilderList() {
        return this.rules_;
    }

    @Override // io.bidmachine.protobuf.sdk.ViewabilityConfigurationOrBuilder
    public int getRulesCount() {
        return this.rules_.size();
    }

    @Override // io.bidmachine.protobuf.sdk.ViewabilityConfigurationOrBuilder
    public ViewabilityRule getRules(int i) {
        return this.rules_.get(i);
    }

    @Override // io.bidmachine.protobuf.sdk.ViewabilityConfigurationOrBuilder
    public ViewabilityRuleOrBuilder getRulesOrBuilder(int i) {
        return this.rules_.get(i);
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
        for (int i = 0; i < this.rules_.size(); i++) {
            codedOutputStream.writeMessage(1, this.rules_.get(i));
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
        for (int i3 = 0; i3 < this.rules_.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(1, this.rules_.get(i3));
        }
        int serializedSize = i2 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ViewabilityConfiguration)) {
            return super.equals(obj);
        }
        ViewabilityConfiguration viewabilityConfiguration = (ViewabilityConfiguration) obj;
        return getRulesList().equals(viewabilityConfiguration.getRulesList()) && this.unknownFields.equals(viewabilityConfiguration.unknownFields);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = 779 + getDescriptor().hashCode();
        if (getRulesCount() > 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + getRulesList().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public static ViewabilityConfiguration parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ViewabilityConfiguration) PARSER.parseFrom(byteBuffer);
    }

    public static ViewabilityConfiguration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewabilityConfiguration) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ViewabilityConfiguration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ViewabilityConfiguration) PARSER.parseFrom(byteString);
    }

    public static ViewabilityConfiguration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewabilityConfiguration) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static ViewabilityConfiguration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ViewabilityConfiguration) PARSER.parseFrom(bArr);
    }

    public static ViewabilityConfiguration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewabilityConfiguration) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static ViewabilityConfiguration parseFrom(InputStream inputStream) throws IOException {
        return (ViewabilityConfiguration) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static ViewabilityConfiguration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewabilityConfiguration) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static ViewabilityConfiguration parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ViewabilityConfiguration) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static ViewabilityConfiguration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewabilityConfiguration) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static ViewabilityConfiguration parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ViewabilityConfiguration) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static ViewabilityConfiguration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewabilityConfiguration) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(ViewabilityConfiguration viewabilityConfiguration) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(viewabilityConfiguration);
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

    public static final class Builder extends GeneratedMessageV3.Builder implements ViewabilityConfigurationOrBuilder {
        private int bitField0_;
        private RepeatedFieldBuilderV3 rulesBuilder_;
        private List<ViewabilityRule> rules_;

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_ViewabilityConfiguration_descriptor;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_ViewabilityConfiguration_fieldAccessorTable.ensureFieldAccessorsInitialized(ViewabilityConfiguration.class, Builder.class);
        }

        private Builder() {
            this.rules_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.rules_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                getRulesFieldBuilder();
            }
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.rulesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.rules_ = Collections.emptyList();
                this.bitField0_ &= -2;
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_ViewabilityConfiguration_descriptor;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* renamed from: getDefaultInstanceForType */
        public ViewabilityConfiguration mo3244getDefaultInstanceForType() {
            return ViewabilityConfiguration.getDefaultInstance();
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public ViewabilityConfiguration build() {
            ViewabilityConfiguration buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public ViewabilityConfiguration buildPartial() {
            ViewabilityConfiguration viewabilityConfiguration = new ViewabilityConfiguration(this);
            int i = this.bitField0_;
            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.rulesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                if ((i & 1) != 0) {
                    this.rules_ = Collections.unmodifiableList(this.rules_);
                    this.bitField0_ &= -2;
                }
                viewabilityConfiguration.rules_ = this.rules_;
            } else {
                viewabilityConfiguration.rules_ = repeatedFieldBuilderV3.build();
            }
            onBuilt();
            return viewabilityConfiguration;
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
            if (message instanceof ViewabilityConfiguration) {
                return mergeFrom((ViewabilityConfiguration) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(ViewabilityConfiguration viewabilityConfiguration) {
            if (viewabilityConfiguration == ViewabilityConfiguration.getDefaultInstance()) {
                return this;
            }
            if (this.rulesBuilder_ == null) {
                if (!viewabilityConfiguration.rules_.isEmpty()) {
                    if (this.rules_.isEmpty()) {
                        this.rules_ = viewabilityConfiguration.rules_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureRulesIsMutable();
                        this.rules_.addAll(viewabilityConfiguration.rules_);
                    }
                    onChanged();
                }
            } else if (!viewabilityConfiguration.rules_.isEmpty()) {
                if (!this.rulesBuilder_.isEmpty()) {
                    this.rulesBuilder_.addAllMessages(viewabilityConfiguration.rules_);
                } else {
                    this.rulesBuilder_.dispose();
                    this.rulesBuilder_ = null;
                    this.rules_ = viewabilityConfiguration.rules_;
                    this.bitField0_ &= -2;
                    this.rulesBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getRulesFieldBuilder() : null;
                }
            }
            mergeUnknownFields(((GeneratedMessageV3) viewabilityConfiguration).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            ViewabilityConfiguration viewabilityConfiguration = null;
            try {
                try {
                    ViewabilityConfiguration viewabilityConfiguration2 = (ViewabilityConfiguration) ViewabilityConfiguration.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (viewabilityConfiguration2 != null) {
                        mergeFrom(viewabilityConfiguration2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    ViewabilityConfiguration viewabilityConfiguration3 = (ViewabilityConfiguration) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        viewabilityConfiguration = viewabilityConfiguration3;
                        if (viewabilityConfiguration != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (viewabilityConfiguration != null) {
                    mergeFrom(viewabilityConfiguration);
                }
                throw th;
            }
        }

        private void ensureRulesIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.rules_ = new ArrayList(this.rules_);
                this.bitField0_ |= 1;
            }
        }

        @Override // io.bidmachine.protobuf.sdk.ViewabilityConfigurationOrBuilder
        public List<ViewabilityRule> getRulesList() {
            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.rulesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.rules_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        @Override // io.bidmachine.protobuf.sdk.ViewabilityConfigurationOrBuilder
        public int getRulesCount() {
            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.rulesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.rules_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        @Override // io.bidmachine.protobuf.sdk.ViewabilityConfigurationOrBuilder
        public ViewabilityRule getRules(int i) {
            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.rulesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.rules_.get(i);
            }
            return (ViewabilityRule) repeatedFieldBuilderV3.getMessage(i);
        }

        public Builder setRules(int i, ViewabilityRule viewabilityRule) {
            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.rulesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                viewabilityRule.getClass();
                ensureRulesIsMutable();
                this.rules_.set(i, viewabilityRule);
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, viewabilityRule);
            }
            return this;
        }

        public Builder setRules(int i, ViewabilityRule.Builder builder) {
            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.rulesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureRulesIsMutable();
                this.rules_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addRules(ViewabilityRule viewabilityRule) {
            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.rulesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                viewabilityRule.getClass();
                ensureRulesIsMutable();
                this.rules_.add(viewabilityRule);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(viewabilityRule);
            }
            return this;
        }

        public Builder addRules(int i, ViewabilityRule viewabilityRule) {
            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.rulesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                viewabilityRule.getClass();
                ensureRulesIsMutable();
                this.rules_.add(i, viewabilityRule);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, viewabilityRule);
            }
            return this;
        }

        public Builder addRules(ViewabilityRule.Builder builder) {
            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.rulesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureRulesIsMutable();
                this.rules_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addRules(int i, ViewabilityRule.Builder builder) {
            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.rulesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureRulesIsMutable();
                this.rules_.add(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllRules(Iterable<? extends ViewabilityRule> iterable) {
            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.rulesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureRulesIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.rules_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearRules() {
            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.rulesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.rules_ = Collections.emptyList();
                this.bitField0_ &= -2;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder removeRules(int i) {
            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.rulesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureRulesIsMutable();
                this.rules_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i);
            }
            return this;
        }

        public ViewabilityRule.Builder getRulesBuilder(int i) {
            return (ViewabilityRule.Builder) getRulesFieldBuilder().getBuilder(i);
        }

        @Override // io.bidmachine.protobuf.sdk.ViewabilityConfigurationOrBuilder
        public ViewabilityRuleOrBuilder getRulesOrBuilder(int i) {
            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.rulesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.rules_.get(i);
            }
            return (ViewabilityRuleOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        @Override // io.bidmachine.protobuf.sdk.ViewabilityConfigurationOrBuilder
        public List<? extends ViewabilityRuleOrBuilder> getRulesOrBuilderList() {
            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.rulesBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.rules_);
        }

        public ViewabilityRule.Builder addRulesBuilder() {
            return (ViewabilityRule.Builder) getRulesFieldBuilder().addBuilder(ViewabilityRule.getDefaultInstance());
        }

        public ViewabilityRule.Builder addRulesBuilder(int i) {
            return (ViewabilityRule.Builder) getRulesFieldBuilder().addBuilder(i, ViewabilityRule.getDefaultInstance());
        }

        public List<ViewabilityRule.Builder> getRulesBuilderList() {
            return getRulesFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3 getRulesFieldBuilder() {
            if (this.rulesBuilder_ == null) {
                this.rulesBuilder_ = new RepeatedFieldBuilderV3(this.rules_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.rules_ = null;
            }
            return this.rulesBuilder_;
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

    public static ViewabilityConfiguration getDefaultInstance() {
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
    public ViewabilityConfiguration mo3244getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
