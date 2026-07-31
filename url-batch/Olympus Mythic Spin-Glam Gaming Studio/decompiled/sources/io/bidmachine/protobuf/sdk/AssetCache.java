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
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Parser;
import com.explorestack.protobuf.RepeatedFieldBuilderV3;
import com.explorestack.protobuf.SingleFieldBuilderV3;
import com.explorestack.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class AssetCache extends GeneratedMessageV3 implements AssetCacheOrBuilder {
    private static final AssetCache DEFAULT_INSTANCE = new AssetCache();
    private static final Parser PARSER = new AbstractParser() { // from class: io.bidmachine.protobuf.sdk.AssetCache.1
        @Override // com.explorestack.protobuf.Parser
        public AssetCache parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new AssetCache(codedInputStream, extensionRegistryLite);
        }
    };
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;

    public interface CleanConfigurationOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo3244getDefaultInstanceForType();

        boolean getTriggerOnCaching();

        boolean getTriggerOnDiskIssue();

        boolean getTriggerOnStartup();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public interface ConfigurationOrBuilder extends MessageOrBuilder {
        CleanConfiguration getCleanConfiguration();

        CleanConfigurationOrBuilder getCleanConfigurationOrBuilder();

        ConnectionConfiguration getConnectionConfiguration();

        ConnectionConfigurationOrBuilder getConnectionConfigurationOrBuilder();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo3244getDefaultInstanceForType();

        PolicyConfiguration getPolicyConfiguration();

        PolicyConfigurationOrBuilder getPolicyConfigurationOrBuilder();

        boolean hasCleanConfiguration();

        boolean hasConnectionConfiguration();

        boolean hasPolicyConfiguration();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public interface ConnectionConfigurationOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo3244getDefaultInstanceForType();

        long getDownloadRequestTimeoutMs();

        long getHeadRequestTimeoutMs();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public interface DownloadPolicyOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo3244getDefaultInstanceForType();

        PolicyLimit getMaxFileSizeBytes();

        PolicyLimitOrBuilder getMaxFileSizeBytesOrBuilder();

        PolicyLimit getMaxPingTimeMs();

        PolicyLimitOrBuilder getMaxPingTimeMsOrBuilder();

        boolean hasMaxFileSizeBytes();

        boolean hasMaxPingTimeMs();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public interface EvictionPolicyOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo3244getDefaultInstanceForType();

        double getMaxDiskAppliedPercent();

        PolicyLimit getMaxImageSizeBytes();

        PolicyLimitOrBuilder getMaxImageSizeBytesOrBuilder();

        PolicyLimit getMaxTtlSeconds();

        PolicyLimitOrBuilder getMaxTtlSecondsOrBuilder();

        PolicyLimit getMaxVideoSizeBytes();

        PolicyLimitOrBuilder getMaxVideoSizeBytesOrBuilder();

        double getMinDiskAppliedPercent();

        PolicyLimit getMinFrequency();

        PolicyLimitOrBuilder getMinFrequencyOrBuilder();

        double getScore();

        boolean hasMaxImageSizeBytes();

        boolean hasMaxTtlSeconds();

        boolean hasMaxVideoSizeBytes();

        boolean hasMinFrequency();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public interface PolicyConfigurationOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo3244getDefaultInstanceForType();

        DownloadPolicy getDownloadPolicy();

        DownloadPolicyOrBuilder getDownloadPolicyOrBuilder();

        EvictionPolicy getEvictionPolicies(int i);

        int getEvictionPoliciesCount();

        List<EvictionPolicy> getEvictionPoliciesList();

        EvictionPolicyOrBuilder getEvictionPoliciesOrBuilder(int i);

        List<? extends EvictionPolicyOrBuilder> getEvictionPoliciesOrBuilderList();

        boolean hasDownloadPolicy();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public interface PolicyLimitOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo3244getDefaultInstanceForType();

        long getThreshold();

        double getWeight();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    private AssetCache(GeneratedMessageV3.Builder builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private AssetCache() {
        this.memoizedIsInitialized = (byte) -1;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new AssetCache();
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private AssetCache(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        extensionRegistryLite.getClass();
        UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag == 0 || !parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                        z = true;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                }
            } finally {
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
            }
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_descriptor;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_fieldAccessorTable.ensureFieldAccessorsInitialized(AssetCache.class, Builder.class);
    }

    public static final class Configuration extends GeneratedMessageV3 implements ConfigurationOrBuilder {
        public static final int CLEAN_CONFIGURATION_FIELD_NUMBER = 1;
        public static final int CONNECTION_CONFIGURATION_FIELD_NUMBER = 2;
        private static final Configuration DEFAULT_INSTANCE = new Configuration();
        private static final Parser PARSER = new AbstractParser() { // from class: io.bidmachine.protobuf.sdk.AssetCache.Configuration.1
            @Override // com.explorestack.protobuf.Parser
            public Configuration parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Configuration(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int POLICY_CONFIGURATION_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private CleanConfiguration cleanConfiguration_;
        private ConnectionConfiguration connectionConfiguration_;
        private byte memoizedIsInitialized;
        private PolicyConfiguration policyConfiguration_;

        private Configuration(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        private Configuration() {
            this.memoizedIsInitialized = (byte) -1;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Configuration();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private Configuration(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            extensionRegistryLite.getClass();
            UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    CleanConfiguration cleanConfiguration = this.cleanConfiguration_;
                                    CleanConfiguration.Builder builder = cleanConfiguration != null ? cleanConfiguration.toBuilder() : null;
                                    CleanConfiguration cleanConfiguration2 = (CleanConfiguration) codedInputStream.readMessage(CleanConfiguration.parser(), extensionRegistryLite);
                                    this.cleanConfiguration_ = cleanConfiguration2;
                                    if (builder != null) {
                                        builder.mergeFrom(cleanConfiguration2);
                                        this.cleanConfiguration_ = builder.buildPartial();
                                    }
                                } else if (readTag == 18) {
                                    ConnectionConfiguration connectionConfiguration = this.connectionConfiguration_;
                                    ConnectionConfiguration.Builder builder2 = connectionConfiguration != null ? connectionConfiguration.toBuilder() : null;
                                    ConnectionConfiguration connectionConfiguration2 = (ConnectionConfiguration) codedInputStream.readMessage(ConnectionConfiguration.parser(), extensionRegistryLite);
                                    this.connectionConfiguration_ = connectionConfiguration2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(connectionConfiguration2);
                                        this.connectionConfiguration_ = builder2.buildPartial();
                                    }
                                } else if (readTag == 26) {
                                    PolicyConfiguration policyConfiguration = this.policyConfiguration_;
                                    PolicyConfiguration.Builder builder3 = policyConfiguration != null ? policyConfiguration.toBuilder() : null;
                                    PolicyConfiguration policyConfiguration2 = (PolicyConfiguration) codedInputStream.readMessage(PolicyConfiguration.parser(), extensionRegistryLite);
                                    this.policyConfiguration_ = policyConfiguration2;
                                    if (builder3 != null) {
                                        builder3.mergeFrom(policyConfiguration2);
                                        this.policyConfiguration_ = builder3.buildPartial();
                                    }
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
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            this.unknownFields = newBuilder.build();
            makeExtensionsImmutable();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_Configuration_descriptor;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_Configuration_fieldAccessorTable.ensureFieldAccessorsInitialized(Configuration.class, Builder.class);
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.ConfigurationOrBuilder
        public boolean hasCleanConfiguration() {
            return this.cleanConfiguration_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.ConfigurationOrBuilder
        public CleanConfiguration getCleanConfiguration() {
            CleanConfiguration cleanConfiguration = this.cleanConfiguration_;
            return cleanConfiguration == null ? CleanConfiguration.getDefaultInstance() : cleanConfiguration;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.ConfigurationOrBuilder
        public CleanConfigurationOrBuilder getCleanConfigurationOrBuilder() {
            return getCleanConfiguration();
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.ConfigurationOrBuilder
        public boolean hasConnectionConfiguration() {
            return this.connectionConfiguration_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.ConfigurationOrBuilder
        public ConnectionConfiguration getConnectionConfiguration() {
            ConnectionConfiguration connectionConfiguration = this.connectionConfiguration_;
            return connectionConfiguration == null ? ConnectionConfiguration.getDefaultInstance() : connectionConfiguration;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.ConfigurationOrBuilder
        public ConnectionConfigurationOrBuilder getConnectionConfigurationOrBuilder() {
            return getConnectionConfiguration();
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.ConfigurationOrBuilder
        public boolean hasPolicyConfiguration() {
            return this.policyConfiguration_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.ConfigurationOrBuilder
        public PolicyConfiguration getPolicyConfiguration() {
            PolicyConfiguration policyConfiguration = this.policyConfiguration_;
            return policyConfiguration == null ? PolicyConfiguration.getDefaultInstance() : policyConfiguration;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.ConfigurationOrBuilder
        public PolicyConfigurationOrBuilder getPolicyConfigurationOrBuilder() {
            return getPolicyConfiguration();
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
            if (this.cleanConfiguration_ != null) {
                codedOutputStream.writeMessage(1, getCleanConfiguration());
            }
            if (this.connectionConfiguration_ != null) {
                codedOutputStream.writeMessage(2, getConnectionConfiguration());
            }
            if (this.policyConfiguration_ != null) {
                codedOutputStream.writeMessage(3, getPolicyConfiguration());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int computeMessageSize = this.cleanConfiguration_ != null ? CodedOutputStream.computeMessageSize(1, getCleanConfiguration()) : 0;
            if (this.connectionConfiguration_ != null) {
                computeMessageSize += CodedOutputStream.computeMessageSize(2, getConnectionConfiguration());
            }
            if (this.policyConfiguration_ != null) {
                computeMessageSize += CodedOutputStream.computeMessageSize(3, getPolicyConfiguration());
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
            if (!(obj instanceof Configuration)) {
                return super.equals(obj);
            }
            Configuration configuration = (Configuration) obj;
            if (hasCleanConfiguration() != configuration.hasCleanConfiguration()) {
                return false;
            }
            if ((hasCleanConfiguration() && !getCleanConfiguration().equals(configuration.getCleanConfiguration())) || hasConnectionConfiguration() != configuration.hasConnectionConfiguration()) {
                return false;
            }
            if ((!hasConnectionConfiguration() || getConnectionConfiguration().equals(configuration.getConnectionConfiguration())) && hasPolicyConfiguration() == configuration.hasPolicyConfiguration()) {
                return (!hasPolicyConfiguration() || getPolicyConfiguration().equals(configuration.getPolicyConfiguration())) && this.unknownFields.equals(configuration.unknownFields);
            }
            return false;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = 779 + getDescriptor().hashCode();
            if (hasCleanConfiguration()) {
                hashCode = (((hashCode * 37) + 1) * 53) + getCleanConfiguration().hashCode();
            }
            if (hasConnectionConfiguration()) {
                hashCode = (((hashCode * 37) + 2) * 53) + getConnectionConfiguration().hashCode();
            }
            if (hasPolicyConfiguration()) {
                hashCode = (((hashCode * 37) + 3) * 53) + getPolicyConfiguration().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public static Configuration parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Configuration) PARSER.parseFrom(byteBuffer);
        }

        public static Configuration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Configuration) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Configuration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Configuration) PARSER.parseFrom(byteString);
        }

        public static Configuration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Configuration) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Configuration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Configuration) PARSER.parseFrom(bArr);
        }

        public static Configuration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Configuration) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Configuration parseFrom(InputStream inputStream) throws IOException {
            return (Configuration) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Configuration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Configuration) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Configuration parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Configuration) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Configuration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Configuration) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Configuration parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Configuration) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Configuration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Configuration) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(Configuration configuration) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(configuration);
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

        public static final class Builder extends GeneratedMessageV3.Builder implements ConfigurationOrBuilder {
            private SingleFieldBuilderV3 cleanConfigurationBuilder_;
            private CleanConfiguration cleanConfiguration_;
            private SingleFieldBuilderV3 connectionConfigurationBuilder_;
            private ConnectionConfiguration connectionConfiguration_;
            private SingleFieldBuilderV3 policyConfigurationBuilder_;
            private PolicyConfiguration policyConfiguration_;

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_Configuration_descriptor;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_Configuration_fieldAccessorTable.ensureFieldAccessorsInitialized(Configuration.class, Builder.class);
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
                if (this.cleanConfigurationBuilder_ == null) {
                    this.cleanConfiguration_ = null;
                } else {
                    this.cleanConfiguration_ = null;
                    this.cleanConfigurationBuilder_ = null;
                }
                if (this.connectionConfigurationBuilder_ == null) {
                    this.connectionConfiguration_ = null;
                } else {
                    this.connectionConfiguration_ = null;
                    this.connectionConfigurationBuilder_ = null;
                }
                if (this.policyConfigurationBuilder_ == null) {
                    this.policyConfiguration_ = null;
                } else {
                    this.policyConfiguration_ = null;
                    this.policyConfigurationBuilder_ = null;
                }
                return this;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_Configuration_descriptor;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* renamed from: getDefaultInstanceForType */
            public Configuration mo3244getDefaultInstanceForType() {
                return Configuration.getDefaultInstance();
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Configuration build() {
                Configuration buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Configuration buildPartial() {
                Configuration configuration = new Configuration(this);
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.cleanConfigurationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    configuration.cleanConfiguration_ = this.cleanConfiguration_;
                } else {
                    configuration.cleanConfiguration_ = (CleanConfiguration) singleFieldBuilderV3.build();
                }
                SingleFieldBuilderV3 singleFieldBuilderV32 = this.connectionConfigurationBuilder_;
                if (singleFieldBuilderV32 == null) {
                    configuration.connectionConfiguration_ = this.connectionConfiguration_;
                } else {
                    configuration.connectionConfiguration_ = (ConnectionConfiguration) singleFieldBuilderV32.build();
                }
                SingleFieldBuilderV3 singleFieldBuilderV33 = this.policyConfigurationBuilder_;
                if (singleFieldBuilderV33 == null) {
                    configuration.policyConfiguration_ = this.policyConfiguration_;
                } else {
                    configuration.policyConfiguration_ = (PolicyConfiguration) singleFieldBuilderV33.build();
                }
                onBuilt();
                return configuration;
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
                if (message instanceof Configuration) {
                    return mergeFrom((Configuration) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Configuration configuration) {
                if (configuration == Configuration.getDefaultInstance()) {
                    return this;
                }
                if (configuration.hasCleanConfiguration()) {
                    mergeCleanConfiguration(configuration.getCleanConfiguration());
                }
                if (configuration.hasConnectionConfiguration()) {
                    mergeConnectionConfiguration(configuration.getConnectionConfiguration());
                }
                if (configuration.hasPolicyConfiguration()) {
                    mergePolicyConfiguration(configuration.getPolicyConfiguration());
                }
                mergeUnknownFields(((GeneratedMessageV3) configuration).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                Configuration configuration = null;
                try {
                    try {
                        Configuration configuration2 = (Configuration) Configuration.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (configuration2 != null) {
                            mergeFrom(configuration2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Configuration configuration3 = (Configuration) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            configuration = configuration3;
                            if (configuration != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (configuration != null) {
                        mergeFrom(configuration);
                    }
                    throw th;
                }
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.ConfigurationOrBuilder
            public boolean hasCleanConfiguration() {
                return (this.cleanConfigurationBuilder_ == null && this.cleanConfiguration_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.ConfigurationOrBuilder
            public CleanConfiguration getCleanConfiguration() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.cleanConfigurationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    CleanConfiguration cleanConfiguration = this.cleanConfiguration_;
                    return cleanConfiguration == null ? CleanConfiguration.getDefaultInstance() : cleanConfiguration;
                }
                return (CleanConfiguration) singleFieldBuilderV3.getMessage();
            }

            public Builder setCleanConfiguration(CleanConfiguration cleanConfiguration) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.cleanConfigurationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    cleanConfiguration.getClass();
                    this.cleanConfiguration_ = cleanConfiguration;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(cleanConfiguration);
                }
                return this;
            }

            public Builder setCleanConfiguration(CleanConfiguration.Builder builder) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.cleanConfigurationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.cleanConfiguration_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder mergeCleanConfiguration(CleanConfiguration cleanConfiguration) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.cleanConfigurationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    CleanConfiguration cleanConfiguration2 = this.cleanConfiguration_;
                    if (cleanConfiguration2 != null) {
                        this.cleanConfiguration_ = CleanConfiguration.newBuilder(cleanConfiguration2).mergeFrom(cleanConfiguration).buildPartial();
                    } else {
                        this.cleanConfiguration_ = cleanConfiguration;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(cleanConfiguration);
                }
                return this;
            }

            public Builder clearCleanConfiguration() {
                if (this.cleanConfigurationBuilder_ == null) {
                    this.cleanConfiguration_ = null;
                    onChanged();
                } else {
                    this.cleanConfiguration_ = null;
                    this.cleanConfigurationBuilder_ = null;
                }
                return this;
            }

            public CleanConfiguration.Builder getCleanConfigurationBuilder() {
                onChanged();
                return (CleanConfiguration.Builder) getCleanConfigurationFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.ConfigurationOrBuilder
            public CleanConfigurationOrBuilder getCleanConfigurationOrBuilder() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.cleanConfigurationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CleanConfigurationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                CleanConfiguration cleanConfiguration = this.cleanConfiguration_;
                return cleanConfiguration == null ? CleanConfiguration.getDefaultInstance() : cleanConfiguration;
            }

            private SingleFieldBuilderV3 getCleanConfigurationFieldBuilder() {
                if (this.cleanConfigurationBuilder_ == null) {
                    this.cleanConfigurationBuilder_ = new SingleFieldBuilderV3(getCleanConfiguration(), getParentForChildren(), isClean());
                    this.cleanConfiguration_ = null;
                }
                return this.cleanConfigurationBuilder_;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.ConfigurationOrBuilder
            public boolean hasConnectionConfiguration() {
                return (this.connectionConfigurationBuilder_ == null && this.connectionConfiguration_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.ConfigurationOrBuilder
            public ConnectionConfiguration getConnectionConfiguration() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.connectionConfigurationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    ConnectionConfiguration connectionConfiguration = this.connectionConfiguration_;
                    return connectionConfiguration == null ? ConnectionConfiguration.getDefaultInstance() : connectionConfiguration;
                }
                return (ConnectionConfiguration) singleFieldBuilderV3.getMessage();
            }

            public Builder setConnectionConfiguration(ConnectionConfiguration connectionConfiguration) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.connectionConfigurationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    connectionConfiguration.getClass();
                    this.connectionConfiguration_ = connectionConfiguration;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(connectionConfiguration);
                }
                return this;
            }

            public Builder setConnectionConfiguration(ConnectionConfiguration.Builder builder) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.connectionConfigurationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.connectionConfiguration_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder mergeConnectionConfiguration(ConnectionConfiguration connectionConfiguration) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.connectionConfigurationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    ConnectionConfiguration connectionConfiguration2 = this.connectionConfiguration_;
                    if (connectionConfiguration2 != null) {
                        this.connectionConfiguration_ = ConnectionConfiguration.newBuilder(connectionConfiguration2).mergeFrom(connectionConfiguration).buildPartial();
                    } else {
                        this.connectionConfiguration_ = connectionConfiguration;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(connectionConfiguration);
                }
                return this;
            }

            public Builder clearConnectionConfiguration() {
                if (this.connectionConfigurationBuilder_ == null) {
                    this.connectionConfiguration_ = null;
                    onChanged();
                } else {
                    this.connectionConfiguration_ = null;
                    this.connectionConfigurationBuilder_ = null;
                }
                return this;
            }

            public ConnectionConfiguration.Builder getConnectionConfigurationBuilder() {
                onChanged();
                return (ConnectionConfiguration.Builder) getConnectionConfigurationFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.ConfigurationOrBuilder
            public ConnectionConfigurationOrBuilder getConnectionConfigurationOrBuilder() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.connectionConfigurationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConnectionConfigurationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConnectionConfiguration connectionConfiguration = this.connectionConfiguration_;
                return connectionConfiguration == null ? ConnectionConfiguration.getDefaultInstance() : connectionConfiguration;
            }

            private SingleFieldBuilderV3 getConnectionConfigurationFieldBuilder() {
                if (this.connectionConfigurationBuilder_ == null) {
                    this.connectionConfigurationBuilder_ = new SingleFieldBuilderV3(getConnectionConfiguration(), getParentForChildren(), isClean());
                    this.connectionConfiguration_ = null;
                }
                return this.connectionConfigurationBuilder_;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.ConfigurationOrBuilder
            public boolean hasPolicyConfiguration() {
                return (this.policyConfigurationBuilder_ == null && this.policyConfiguration_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.ConfigurationOrBuilder
            public PolicyConfiguration getPolicyConfiguration() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.policyConfigurationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    PolicyConfiguration policyConfiguration = this.policyConfiguration_;
                    return policyConfiguration == null ? PolicyConfiguration.getDefaultInstance() : policyConfiguration;
                }
                return (PolicyConfiguration) singleFieldBuilderV3.getMessage();
            }

            public Builder setPolicyConfiguration(PolicyConfiguration policyConfiguration) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.policyConfigurationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    policyConfiguration.getClass();
                    this.policyConfiguration_ = policyConfiguration;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(policyConfiguration);
                }
                return this;
            }

            public Builder setPolicyConfiguration(PolicyConfiguration.Builder builder) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.policyConfigurationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.policyConfiguration_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder mergePolicyConfiguration(PolicyConfiguration policyConfiguration) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.policyConfigurationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    PolicyConfiguration policyConfiguration2 = this.policyConfiguration_;
                    if (policyConfiguration2 != null) {
                        this.policyConfiguration_ = PolicyConfiguration.newBuilder(policyConfiguration2).mergeFrom(policyConfiguration).buildPartial();
                    } else {
                        this.policyConfiguration_ = policyConfiguration;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(policyConfiguration);
                }
                return this;
            }

            public Builder clearPolicyConfiguration() {
                if (this.policyConfigurationBuilder_ == null) {
                    this.policyConfiguration_ = null;
                    onChanged();
                } else {
                    this.policyConfiguration_ = null;
                    this.policyConfigurationBuilder_ = null;
                }
                return this;
            }

            public PolicyConfiguration.Builder getPolicyConfigurationBuilder() {
                onChanged();
                return (PolicyConfiguration.Builder) getPolicyConfigurationFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.ConfigurationOrBuilder
            public PolicyConfigurationOrBuilder getPolicyConfigurationOrBuilder() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.policyConfigurationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PolicyConfigurationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                PolicyConfiguration policyConfiguration = this.policyConfiguration_;
                return policyConfiguration == null ? PolicyConfiguration.getDefaultInstance() : policyConfiguration;
            }

            private SingleFieldBuilderV3 getPolicyConfigurationFieldBuilder() {
                if (this.policyConfigurationBuilder_ == null) {
                    this.policyConfigurationBuilder_ = new SingleFieldBuilderV3(getPolicyConfiguration(), getParentForChildren(), isClean());
                    this.policyConfiguration_ = null;
                }
                return this.policyConfigurationBuilder_;
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

        public static Configuration getDefaultInstance() {
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
        public Configuration mo3244getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class CleanConfiguration extends GeneratedMessageV3 implements CleanConfigurationOrBuilder {
        private static final CleanConfiguration DEFAULT_INSTANCE = new CleanConfiguration();
        private static final Parser PARSER = new AbstractParser() { // from class: io.bidmachine.protobuf.sdk.AssetCache.CleanConfiguration.1
            @Override // com.explorestack.protobuf.Parser
            public CleanConfiguration parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new CleanConfiguration(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int TRIGGER_ON_CACHING_FIELD_NUMBER = 2;
        public static final int TRIGGER_ON_DISK_ISSUE_FIELD_NUMBER = 3;
        public static final int TRIGGER_ON_STARTUP_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private boolean triggerOnCaching_;
        private boolean triggerOnDiskIssue_;
        private boolean triggerOnStartup_;

        private CleanConfiguration(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        private CleanConfiguration() {
            this.memoizedIsInitialized = (byte) -1;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new CleanConfiguration();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private CleanConfiguration(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.triggerOnStartup_ = codedInputStream.readBool();
                            } else if (readTag == 16) {
                                this.triggerOnCaching_ = codedInputStream.readBool();
                            } else if (readTag == 24) {
                                this.triggerOnDiskIssue_ = codedInputStream.readBool();
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
            return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_CleanConfiguration_descriptor;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_CleanConfiguration_fieldAccessorTable.ensureFieldAccessorsInitialized(CleanConfiguration.class, Builder.class);
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.CleanConfigurationOrBuilder
        public boolean getTriggerOnStartup() {
            return this.triggerOnStartup_;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.CleanConfigurationOrBuilder
        public boolean getTriggerOnCaching() {
            return this.triggerOnCaching_;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.CleanConfigurationOrBuilder
        public boolean getTriggerOnDiskIssue() {
            return this.triggerOnDiskIssue_;
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
            boolean z = this.triggerOnStartup_;
            if (z) {
                codedOutputStream.writeBool(1, z);
            }
            boolean z2 = this.triggerOnCaching_;
            if (z2) {
                codedOutputStream.writeBool(2, z2);
            }
            boolean z3 = this.triggerOnDiskIssue_;
            if (z3) {
                codedOutputStream.writeBool(3, z3);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            boolean z = this.triggerOnStartup_;
            int computeBoolSize = z ? CodedOutputStream.computeBoolSize(1, z) : 0;
            boolean z2 = this.triggerOnCaching_;
            if (z2) {
                computeBoolSize += CodedOutputStream.computeBoolSize(2, z2);
            }
            boolean z3 = this.triggerOnDiskIssue_;
            if (z3) {
                computeBoolSize += CodedOutputStream.computeBoolSize(3, z3);
            }
            int serializedSize = computeBoolSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CleanConfiguration)) {
                return super.equals(obj);
            }
            CleanConfiguration cleanConfiguration = (CleanConfiguration) obj;
            return getTriggerOnStartup() == cleanConfiguration.getTriggerOnStartup() && getTriggerOnCaching() == cleanConfiguration.getTriggerOnCaching() && getTriggerOnDiskIssue() == cleanConfiguration.getTriggerOnDiskIssue() && this.unknownFields.equals(cleanConfiguration.unknownFields);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = ((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Internal.hashBoolean(getTriggerOnStartup())) * 37) + 2) * 53) + Internal.hashBoolean(getTriggerOnCaching())) * 37) + 3) * 53) + Internal.hashBoolean(getTriggerOnDiskIssue())) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        public static CleanConfiguration parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CleanConfiguration) PARSER.parseFrom(byteBuffer);
        }

        public static CleanConfiguration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CleanConfiguration) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static CleanConfiguration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CleanConfiguration) PARSER.parseFrom(byteString);
        }

        public static CleanConfiguration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CleanConfiguration) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CleanConfiguration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CleanConfiguration) PARSER.parseFrom(bArr);
        }

        public static CleanConfiguration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CleanConfiguration) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CleanConfiguration parseFrom(InputStream inputStream) throws IOException {
            return (CleanConfiguration) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CleanConfiguration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CleanConfiguration) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CleanConfiguration parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CleanConfiguration) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CleanConfiguration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CleanConfiguration) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CleanConfiguration parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CleanConfiguration) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CleanConfiguration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CleanConfiguration) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(CleanConfiguration cleanConfiguration) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(cleanConfiguration);
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

        public static final class Builder extends GeneratedMessageV3.Builder implements CleanConfigurationOrBuilder {
            private boolean triggerOnCaching_;
            private boolean triggerOnDiskIssue_;
            private boolean triggerOnStartup_;

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_CleanConfiguration_descriptor;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_CleanConfiguration_fieldAccessorTable.ensureFieldAccessorsInitialized(CleanConfiguration.class, Builder.class);
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
                this.triggerOnStartup_ = false;
                this.triggerOnCaching_ = false;
                this.triggerOnDiskIssue_ = false;
                return this;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_CleanConfiguration_descriptor;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* renamed from: getDefaultInstanceForType */
            public CleanConfiguration mo3244getDefaultInstanceForType() {
                return CleanConfiguration.getDefaultInstance();
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public CleanConfiguration build() {
                CleanConfiguration buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public CleanConfiguration buildPartial() {
                CleanConfiguration cleanConfiguration = new CleanConfiguration(this);
                cleanConfiguration.triggerOnStartup_ = this.triggerOnStartup_;
                cleanConfiguration.triggerOnCaching_ = this.triggerOnCaching_;
                cleanConfiguration.triggerOnDiskIssue_ = this.triggerOnDiskIssue_;
                onBuilt();
                return cleanConfiguration;
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
                if (message instanceof CleanConfiguration) {
                    return mergeFrom((CleanConfiguration) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CleanConfiguration cleanConfiguration) {
                if (cleanConfiguration == CleanConfiguration.getDefaultInstance()) {
                    return this;
                }
                if (cleanConfiguration.getTriggerOnStartup()) {
                    setTriggerOnStartup(cleanConfiguration.getTriggerOnStartup());
                }
                if (cleanConfiguration.getTriggerOnCaching()) {
                    setTriggerOnCaching(cleanConfiguration.getTriggerOnCaching());
                }
                if (cleanConfiguration.getTriggerOnDiskIssue()) {
                    setTriggerOnDiskIssue(cleanConfiguration.getTriggerOnDiskIssue());
                }
                mergeUnknownFields(((GeneratedMessageV3) cleanConfiguration).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                CleanConfiguration cleanConfiguration = null;
                try {
                    try {
                        CleanConfiguration cleanConfiguration2 = (CleanConfiguration) CleanConfiguration.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (cleanConfiguration2 != null) {
                            mergeFrom(cleanConfiguration2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        CleanConfiguration cleanConfiguration3 = (CleanConfiguration) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            cleanConfiguration = cleanConfiguration3;
                            if (cleanConfiguration != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (cleanConfiguration != null) {
                        mergeFrom(cleanConfiguration);
                    }
                    throw th;
                }
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.CleanConfigurationOrBuilder
            public boolean getTriggerOnStartup() {
                return this.triggerOnStartup_;
            }

            public Builder setTriggerOnStartup(boolean z) {
                this.triggerOnStartup_ = z;
                onChanged();
                return this;
            }

            public Builder clearTriggerOnStartup() {
                this.triggerOnStartup_ = false;
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.CleanConfigurationOrBuilder
            public boolean getTriggerOnCaching() {
                return this.triggerOnCaching_;
            }

            public Builder setTriggerOnCaching(boolean z) {
                this.triggerOnCaching_ = z;
                onChanged();
                return this;
            }

            public Builder clearTriggerOnCaching() {
                this.triggerOnCaching_ = false;
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.CleanConfigurationOrBuilder
            public boolean getTriggerOnDiskIssue() {
                return this.triggerOnDiskIssue_;
            }

            public Builder setTriggerOnDiskIssue(boolean z) {
                this.triggerOnDiskIssue_ = z;
                onChanged();
                return this;
            }

            public Builder clearTriggerOnDiskIssue() {
                this.triggerOnDiskIssue_ = false;
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

        public static CleanConfiguration getDefaultInstance() {
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
        public CleanConfiguration mo3244getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class ConnectionConfiguration extends GeneratedMessageV3 implements ConnectionConfigurationOrBuilder {
        public static final int DOWNLOAD_REQUEST_TIMEOUT_MS_FIELD_NUMBER = 2;
        public static final int HEAD_REQUEST_TIMEOUT_MS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private long downloadRequestTimeoutMs_;
        private long headRequestTimeoutMs_;
        private byte memoizedIsInitialized;
        private static final ConnectionConfiguration DEFAULT_INSTANCE = new ConnectionConfiguration();
        private static final Parser PARSER = new AbstractParser() { // from class: io.bidmachine.protobuf.sdk.AssetCache.ConnectionConfiguration.1
            @Override // com.explorestack.protobuf.Parser
            public ConnectionConfiguration parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new ConnectionConfiguration(codedInputStream, extensionRegistryLite);
            }
        };

        private ConnectionConfiguration(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        private ConnectionConfiguration() {
            this.memoizedIsInitialized = (byte) -1;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new ConnectionConfiguration();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private ConnectionConfiguration(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.headRequestTimeoutMs_ = codedInputStream.readInt64();
                            } else if (readTag == 16) {
                                this.downloadRequestTimeoutMs_ = codedInputStream.readInt64();
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
            return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_ConnectionConfiguration_descriptor;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_ConnectionConfiguration_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectionConfiguration.class, Builder.class);
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.ConnectionConfigurationOrBuilder
        public long getHeadRequestTimeoutMs() {
            return this.headRequestTimeoutMs_;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.ConnectionConfigurationOrBuilder
        public long getDownloadRequestTimeoutMs() {
            return this.downloadRequestTimeoutMs_;
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
            long j = this.headRequestTimeoutMs_;
            if (j != 0) {
                codedOutputStream.writeInt64(1, j);
            }
            long j2 = this.downloadRequestTimeoutMs_;
            if (j2 != 0) {
                codedOutputStream.writeInt64(2, j2);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            long j = this.headRequestTimeoutMs_;
            int computeInt64Size = j != 0 ? CodedOutputStream.computeInt64Size(1, j) : 0;
            long j2 = this.downloadRequestTimeoutMs_;
            if (j2 != 0) {
                computeInt64Size += CodedOutputStream.computeInt64Size(2, j2);
            }
            int serializedSize = computeInt64Size + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConnectionConfiguration)) {
                return super.equals(obj);
            }
            ConnectionConfiguration connectionConfiguration = (ConnectionConfiguration) obj;
            return getHeadRequestTimeoutMs() == connectionConfiguration.getHeadRequestTimeoutMs() && getDownloadRequestTimeoutMs() == connectionConfiguration.getDownloadRequestTimeoutMs() && this.unknownFields.equals(connectionConfiguration.unknownFields);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Internal.hashLong(getHeadRequestTimeoutMs())) * 37) + 2) * 53) + Internal.hashLong(getDownloadRequestTimeoutMs())) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        public static ConnectionConfiguration parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ConnectionConfiguration) PARSER.parseFrom(byteBuffer);
        }

        public static ConnectionConfiguration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ConnectionConfiguration) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static ConnectionConfiguration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ConnectionConfiguration) PARSER.parseFrom(byteString);
        }

        public static ConnectionConfiguration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ConnectionConfiguration) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ConnectionConfiguration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ConnectionConfiguration) PARSER.parseFrom(bArr);
        }

        public static ConnectionConfiguration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ConnectionConfiguration) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ConnectionConfiguration parseFrom(InputStream inputStream) throws IOException {
            return (ConnectionConfiguration) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ConnectionConfiguration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ConnectionConfiguration) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectionConfiguration parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ConnectionConfiguration) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConnectionConfiguration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ConnectionConfiguration) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectionConfiguration parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ConnectionConfiguration) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ConnectionConfiguration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ConnectionConfiguration) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(ConnectionConfiguration connectionConfiguration) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(connectionConfiguration);
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

        public static final class Builder extends GeneratedMessageV3.Builder implements ConnectionConfigurationOrBuilder {
            private long downloadRequestTimeoutMs_;
            private long headRequestTimeoutMs_;

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_ConnectionConfiguration_descriptor;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_ConnectionConfiguration_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectionConfiguration.class, Builder.class);
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
                this.headRequestTimeoutMs_ = 0L;
                this.downloadRequestTimeoutMs_ = 0L;
                return this;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_ConnectionConfiguration_descriptor;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* renamed from: getDefaultInstanceForType */
            public ConnectionConfiguration mo3244getDefaultInstanceForType() {
                return ConnectionConfiguration.getDefaultInstance();
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public ConnectionConfiguration build() {
                ConnectionConfiguration buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public ConnectionConfiguration buildPartial() {
                ConnectionConfiguration connectionConfiguration = new ConnectionConfiguration(this);
                connectionConfiguration.headRequestTimeoutMs_ = this.headRequestTimeoutMs_;
                connectionConfiguration.downloadRequestTimeoutMs_ = this.downloadRequestTimeoutMs_;
                onBuilt();
                return connectionConfiguration;
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
                if (message instanceof ConnectionConfiguration) {
                    return mergeFrom((ConnectionConfiguration) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ConnectionConfiguration connectionConfiguration) {
                if (connectionConfiguration == ConnectionConfiguration.getDefaultInstance()) {
                    return this;
                }
                if (connectionConfiguration.getHeadRequestTimeoutMs() != 0) {
                    setHeadRequestTimeoutMs(connectionConfiguration.getHeadRequestTimeoutMs());
                }
                if (connectionConfiguration.getDownloadRequestTimeoutMs() != 0) {
                    setDownloadRequestTimeoutMs(connectionConfiguration.getDownloadRequestTimeoutMs());
                }
                mergeUnknownFields(((GeneratedMessageV3) connectionConfiguration).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                ConnectionConfiguration connectionConfiguration = null;
                try {
                    try {
                        ConnectionConfiguration connectionConfiguration2 = (ConnectionConfiguration) ConnectionConfiguration.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (connectionConfiguration2 != null) {
                            mergeFrom(connectionConfiguration2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        ConnectionConfiguration connectionConfiguration3 = (ConnectionConfiguration) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            connectionConfiguration = connectionConfiguration3;
                            if (connectionConfiguration != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (connectionConfiguration != null) {
                        mergeFrom(connectionConfiguration);
                    }
                    throw th;
                }
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.ConnectionConfigurationOrBuilder
            public long getHeadRequestTimeoutMs() {
                return this.headRequestTimeoutMs_;
            }

            public Builder setHeadRequestTimeoutMs(long j) {
                this.headRequestTimeoutMs_ = j;
                onChanged();
                return this;
            }

            public Builder clearHeadRequestTimeoutMs() {
                this.headRequestTimeoutMs_ = 0L;
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.ConnectionConfigurationOrBuilder
            public long getDownloadRequestTimeoutMs() {
                return this.downloadRequestTimeoutMs_;
            }

            public Builder setDownloadRequestTimeoutMs(long j) {
                this.downloadRequestTimeoutMs_ = j;
                onChanged();
                return this;
            }

            public Builder clearDownloadRequestTimeoutMs() {
                this.downloadRequestTimeoutMs_ = 0L;
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

        public static ConnectionConfiguration getDefaultInstance() {
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
        public ConnectionConfiguration mo3244getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class PolicyConfiguration extends GeneratedMessageV3 implements PolicyConfigurationOrBuilder {
        public static final int DOWNLOAD_POLICY_FIELD_NUMBER = 1;
        public static final int EVICTION_POLICIES_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private DownloadPolicy downloadPolicy_;
        private List<EvictionPolicy> evictionPolicies_;
        private byte memoizedIsInitialized;
        private static final PolicyConfiguration DEFAULT_INSTANCE = new PolicyConfiguration();
        private static final Parser PARSER = new AbstractParser() { // from class: io.bidmachine.protobuf.sdk.AssetCache.PolicyConfiguration.1
            @Override // com.explorestack.protobuf.Parser
            public PolicyConfiguration parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new PolicyConfiguration(codedInputStream, extensionRegistryLite);
            }
        };

        private PolicyConfiguration(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        private PolicyConfiguration() {
            this.memoizedIsInitialized = (byte) -1;
            this.evictionPolicies_ = Collections.emptyList();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new PolicyConfiguration();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private PolicyConfiguration(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                            if (readTag == 10) {
                                DownloadPolicy downloadPolicy = this.downloadPolicy_;
                                DownloadPolicy.Builder builder = downloadPolicy != null ? downloadPolicy.toBuilder() : null;
                                DownloadPolicy downloadPolicy2 = (DownloadPolicy) codedInputStream.readMessage(DownloadPolicy.parser(), extensionRegistryLite);
                                this.downloadPolicy_ = downloadPolicy2;
                                if (builder != null) {
                                    builder.mergeFrom(downloadPolicy2);
                                    this.downloadPolicy_ = builder.buildPartial();
                                }
                            } else if (readTag == 18) {
                                if (!z2) {
                                    this.evictionPolicies_ = new ArrayList();
                                    z2 = true;
                                }
                                this.evictionPolicies_.add(codedInputStream.readMessage(EvictionPolicy.parser(), extensionRegistryLite));
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
                        this.evictionPolicies_ = Collections.unmodifiableList(this.evictionPolicies_);
                    }
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2) {
                this.evictionPolicies_ = Collections.unmodifiableList(this.evictionPolicies_);
            }
            this.unknownFields = newBuilder.build();
            makeExtensionsImmutable();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_PolicyConfiguration_descriptor;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_PolicyConfiguration_fieldAccessorTable.ensureFieldAccessorsInitialized(PolicyConfiguration.class, Builder.class);
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyConfigurationOrBuilder
        public boolean hasDownloadPolicy() {
            return this.downloadPolicy_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyConfigurationOrBuilder
        public DownloadPolicy getDownloadPolicy() {
            DownloadPolicy downloadPolicy = this.downloadPolicy_;
            return downloadPolicy == null ? DownloadPolicy.getDefaultInstance() : downloadPolicy;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyConfigurationOrBuilder
        public DownloadPolicyOrBuilder getDownloadPolicyOrBuilder() {
            return getDownloadPolicy();
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyConfigurationOrBuilder
        public List<EvictionPolicy> getEvictionPoliciesList() {
            return this.evictionPolicies_;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyConfigurationOrBuilder
        public List<? extends EvictionPolicyOrBuilder> getEvictionPoliciesOrBuilderList() {
            return this.evictionPolicies_;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyConfigurationOrBuilder
        public int getEvictionPoliciesCount() {
            return this.evictionPolicies_.size();
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyConfigurationOrBuilder
        public EvictionPolicy getEvictionPolicies(int i) {
            return this.evictionPolicies_.get(i);
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyConfigurationOrBuilder
        public EvictionPolicyOrBuilder getEvictionPoliciesOrBuilder(int i) {
            return this.evictionPolicies_.get(i);
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
            if (this.downloadPolicy_ != null) {
                codedOutputStream.writeMessage(1, getDownloadPolicy());
            }
            for (int i = 0; i < this.evictionPolicies_.size(); i++) {
                codedOutputStream.writeMessage(2, this.evictionPolicies_.get(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int computeMessageSize = this.downloadPolicy_ != null ? CodedOutputStream.computeMessageSize(1, getDownloadPolicy()) : 0;
            for (int i2 = 0; i2 < this.evictionPolicies_.size(); i2++) {
                computeMessageSize += CodedOutputStream.computeMessageSize(2, this.evictionPolicies_.get(i2));
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
            if (!(obj instanceof PolicyConfiguration)) {
                return super.equals(obj);
            }
            PolicyConfiguration policyConfiguration = (PolicyConfiguration) obj;
            if (hasDownloadPolicy() != policyConfiguration.hasDownloadPolicy()) {
                return false;
            }
            return (!hasDownloadPolicy() || getDownloadPolicy().equals(policyConfiguration.getDownloadPolicy())) && getEvictionPoliciesList().equals(policyConfiguration.getEvictionPoliciesList()) && this.unknownFields.equals(policyConfiguration.unknownFields);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = 779 + getDescriptor().hashCode();
            if (hasDownloadPolicy()) {
                hashCode = (((hashCode * 37) + 1) * 53) + getDownloadPolicy().hashCode();
            }
            if (getEvictionPoliciesCount() > 0) {
                hashCode = (((hashCode * 37) + 2) * 53) + getEvictionPoliciesList().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public static PolicyConfiguration parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (PolicyConfiguration) PARSER.parseFrom(byteBuffer);
        }

        public static PolicyConfiguration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PolicyConfiguration) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static PolicyConfiguration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (PolicyConfiguration) PARSER.parseFrom(byteString);
        }

        public static PolicyConfiguration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PolicyConfiguration) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static PolicyConfiguration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (PolicyConfiguration) PARSER.parseFrom(bArr);
        }

        public static PolicyConfiguration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PolicyConfiguration) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static PolicyConfiguration parseFrom(InputStream inputStream) throws IOException {
            return (PolicyConfiguration) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static PolicyConfiguration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PolicyConfiguration) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PolicyConfiguration parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (PolicyConfiguration) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static PolicyConfiguration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PolicyConfiguration) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PolicyConfiguration parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (PolicyConfiguration) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static PolicyConfiguration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PolicyConfiguration) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(PolicyConfiguration policyConfiguration) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(policyConfiguration);
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

        public static final class Builder extends GeneratedMessageV3.Builder implements PolicyConfigurationOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3 downloadPolicyBuilder_;
            private DownloadPolicy downloadPolicy_;
            private RepeatedFieldBuilderV3 evictionPoliciesBuilder_;
            private List<EvictionPolicy> evictionPolicies_;

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_PolicyConfiguration_descriptor;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_PolicyConfiguration_fieldAccessorTable.ensureFieldAccessorsInitialized(PolicyConfiguration.class, Builder.class);
            }

            private Builder() {
                this.evictionPolicies_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.evictionPolicies_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getEvictionPoliciesFieldBuilder();
                }
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                if (this.downloadPolicyBuilder_ == null) {
                    this.downloadPolicy_ = null;
                } else {
                    this.downloadPolicy_ = null;
                    this.downloadPolicyBuilder_ = null;
                }
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.evictionPoliciesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.evictionPolicies_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_PolicyConfiguration_descriptor;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* renamed from: getDefaultInstanceForType */
            public PolicyConfiguration mo3244getDefaultInstanceForType() {
                return PolicyConfiguration.getDefaultInstance();
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public PolicyConfiguration build() {
                PolicyConfiguration buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public PolicyConfiguration buildPartial() {
                PolicyConfiguration policyConfiguration = new PolicyConfiguration(this);
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.downloadPolicyBuilder_;
                if (singleFieldBuilderV3 == null) {
                    policyConfiguration.downloadPolicy_ = this.downloadPolicy_;
                } else {
                    policyConfiguration.downloadPolicy_ = (DownloadPolicy) singleFieldBuilderV3.build();
                }
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.evictionPoliciesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    policyConfiguration.evictionPolicies_ = repeatedFieldBuilderV3.build();
                } else {
                    if ((this.bitField0_ & 1) != 0) {
                        this.evictionPolicies_ = Collections.unmodifiableList(this.evictionPolicies_);
                        this.bitField0_ &= -2;
                    }
                    policyConfiguration.evictionPolicies_ = this.evictionPolicies_;
                }
                onBuilt();
                return policyConfiguration;
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
                if (message instanceof PolicyConfiguration) {
                    return mergeFrom((PolicyConfiguration) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(PolicyConfiguration policyConfiguration) {
                if (policyConfiguration == PolicyConfiguration.getDefaultInstance()) {
                    return this;
                }
                if (policyConfiguration.hasDownloadPolicy()) {
                    mergeDownloadPolicy(policyConfiguration.getDownloadPolicy());
                }
                if (this.evictionPoliciesBuilder_ == null) {
                    if (!policyConfiguration.evictionPolicies_.isEmpty()) {
                        if (this.evictionPolicies_.isEmpty()) {
                            this.evictionPolicies_ = policyConfiguration.evictionPolicies_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureEvictionPoliciesIsMutable();
                            this.evictionPolicies_.addAll(policyConfiguration.evictionPolicies_);
                        }
                        onChanged();
                    }
                } else if (!policyConfiguration.evictionPolicies_.isEmpty()) {
                    if (!this.evictionPoliciesBuilder_.isEmpty()) {
                        this.evictionPoliciesBuilder_.addAllMessages(policyConfiguration.evictionPolicies_);
                    } else {
                        this.evictionPoliciesBuilder_.dispose();
                        this.evictionPoliciesBuilder_ = null;
                        this.evictionPolicies_ = policyConfiguration.evictionPolicies_;
                        this.bitField0_ &= -2;
                        this.evictionPoliciesBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getEvictionPoliciesFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((GeneratedMessageV3) policyConfiguration).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                PolicyConfiguration policyConfiguration = null;
                try {
                    try {
                        PolicyConfiguration policyConfiguration2 = (PolicyConfiguration) PolicyConfiguration.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (policyConfiguration2 != null) {
                            mergeFrom(policyConfiguration2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        PolicyConfiguration policyConfiguration3 = (PolicyConfiguration) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            policyConfiguration = policyConfiguration3;
                            if (policyConfiguration != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (policyConfiguration != null) {
                        mergeFrom(policyConfiguration);
                    }
                    throw th;
                }
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyConfigurationOrBuilder
            public boolean hasDownloadPolicy() {
                return (this.downloadPolicyBuilder_ == null && this.downloadPolicy_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyConfigurationOrBuilder
            public DownloadPolicy getDownloadPolicy() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.downloadPolicyBuilder_;
                if (singleFieldBuilderV3 == null) {
                    DownloadPolicy downloadPolicy = this.downloadPolicy_;
                    return downloadPolicy == null ? DownloadPolicy.getDefaultInstance() : downloadPolicy;
                }
                return (DownloadPolicy) singleFieldBuilderV3.getMessage();
            }

            public Builder setDownloadPolicy(DownloadPolicy downloadPolicy) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.downloadPolicyBuilder_;
                if (singleFieldBuilderV3 == null) {
                    downloadPolicy.getClass();
                    this.downloadPolicy_ = downloadPolicy;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(downloadPolicy);
                }
                return this;
            }

            public Builder setDownloadPolicy(DownloadPolicy.Builder builder) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.downloadPolicyBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.downloadPolicy_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder mergeDownloadPolicy(DownloadPolicy downloadPolicy) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.downloadPolicyBuilder_;
                if (singleFieldBuilderV3 == null) {
                    DownloadPolicy downloadPolicy2 = this.downloadPolicy_;
                    if (downloadPolicy2 != null) {
                        this.downloadPolicy_ = DownloadPolicy.newBuilder(downloadPolicy2).mergeFrom(downloadPolicy).buildPartial();
                    } else {
                        this.downloadPolicy_ = downloadPolicy;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(downloadPolicy);
                }
                return this;
            }

            public Builder clearDownloadPolicy() {
                if (this.downloadPolicyBuilder_ == null) {
                    this.downloadPolicy_ = null;
                    onChanged();
                } else {
                    this.downloadPolicy_ = null;
                    this.downloadPolicyBuilder_ = null;
                }
                return this;
            }

            public DownloadPolicy.Builder getDownloadPolicyBuilder() {
                onChanged();
                return (DownloadPolicy.Builder) getDownloadPolicyFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyConfigurationOrBuilder
            public DownloadPolicyOrBuilder getDownloadPolicyOrBuilder() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.downloadPolicyBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DownloadPolicyOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DownloadPolicy downloadPolicy = this.downloadPolicy_;
                return downloadPolicy == null ? DownloadPolicy.getDefaultInstance() : downloadPolicy;
            }

            private SingleFieldBuilderV3 getDownloadPolicyFieldBuilder() {
                if (this.downloadPolicyBuilder_ == null) {
                    this.downloadPolicyBuilder_ = new SingleFieldBuilderV3(getDownloadPolicy(), getParentForChildren(), isClean());
                    this.downloadPolicy_ = null;
                }
                return this.downloadPolicyBuilder_;
            }

            private void ensureEvictionPoliciesIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.evictionPolicies_ = new ArrayList(this.evictionPolicies_);
                    this.bitField0_ |= 1;
                }
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyConfigurationOrBuilder
            public List<EvictionPolicy> getEvictionPoliciesList() {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.evictionPoliciesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return Collections.unmodifiableList(this.evictionPolicies_);
                }
                return repeatedFieldBuilderV3.getMessageList();
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyConfigurationOrBuilder
            public int getEvictionPoliciesCount() {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.evictionPoliciesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.evictionPolicies_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyConfigurationOrBuilder
            public EvictionPolicy getEvictionPolicies(int i) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.evictionPoliciesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.evictionPolicies_.get(i);
                }
                return (EvictionPolicy) repeatedFieldBuilderV3.getMessage(i);
            }

            public Builder setEvictionPolicies(int i, EvictionPolicy evictionPolicy) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.evictionPoliciesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    evictionPolicy.getClass();
                    ensureEvictionPoliciesIsMutable();
                    this.evictionPolicies_.set(i, evictionPolicy);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, evictionPolicy);
                }
                return this;
            }

            public Builder setEvictionPolicies(int i, EvictionPolicy.Builder builder) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.evictionPoliciesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureEvictionPoliciesIsMutable();
                    this.evictionPolicies_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder addEvictionPolicies(EvictionPolicy evictionPolicy) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.evictionPoliciesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    evictionPolicy.getClass();
                    ensureEvictionPoliciesIsMutable();
                    this.evictionPolicies_.add(evictionPolicy);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(evictionPolicy);
                }
                return this;
            }

            public Builder addEvictionPolicies(int i, EvictionPolicy evictionPolicy) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.evictionPoliciesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    evictionPolicy.getClass();
                    ensureEvictionPoliciesIsMutable();
                    this.evictionPolicies_.add(i, evictionPolicy);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, evictionPolicy);
                }
                return this;
            }

            public Builder addEvictionPolicies(EvictionPolicy.Builder builder) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.evictionPoliciesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureEvictionPoliciesIsMutable();
                    this.evictionPolicies_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                }
                return this;
            }

            public Builder addEvictionPolicies(int i, EvictionPolicy.Builder builder) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.evictionPoliciesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureEvictionPoliciesIsMutable();
                    this.evictionPolicies_.add(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, builder.build());
                }
                return this;
            }

            public Builder addAllEvictionPolicies(Iterable<? extends EvictionPolicy> iterable) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.evictionPoliciesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureEvictionPoliciesIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.evictionPolicies_);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                }
                return this;
            }

            public Builder clearEvictionPolicies() {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.evictionPoliciesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.evictionPolicies_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Builder removeEvictionPolicies(int i) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.evictionPoliciesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureEvictionPoliciesIsMutable();
                    this.evictionPolicies_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.remove(i);
                }
                return this;
            }

            public EvictionPolicy.Builder getEvictionPoliciesBuilder(int i) {
                return (EvictionPolicy.Builder) getEvictionPoliciesFieldBuilder().getBuilder(i);
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyConfigurationOrBuilder
            public EvictionPolicyOrBuilder getEvictionPoliciesOrBuilder(int i) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.evictionPoliciesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.evictionPolicies_.get(i);
                }
                return (EvictionPolicyOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i);
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyConfigurationOrBuilder
            public List<? extends EvictionPolicyOrBuilder> getEvictionPoliciesOrBuilderList() {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.evictionPoliciesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    return repeatedFieldBuilderV3.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.evictionPolicies_);
            }

            public EvictionPolicy.Builder addEvictionPoliciesBuilder() {
                return (EvictionPolicy.Builder) getEvictionPoliciesFieldBuilder().addBuilder(EvictionPolicy.getDefaultInstance());
            }

            public EvictionPolicy.Builder addEvictionPoliciesBuilder(int i) {
                return (EvictionPolicy.Builder) getEvictionPoliciesFieldBuilder().addBuilder(i, EvictionPolicy.getDefaultInstance());
            }

            public List<EvictionPolicy.Builder> getEvictionPoliciesBuilderList() {
                return getEvictionPoliciesFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3 getEvictionPoliciesFieldBuilder() {
                if (this.evictionPoliciesBuilder_ == null) {
                    this.evictionPoliciesBuilder_ = new RepeatedFieldBuilderV3(this.evictionPolicies_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.evictionPolicies_ = null;
                }
                return this.evictionPoliciesBuilder_;
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

        public static PolicyConfiguration getDefaultInstance() {
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
        public PolicyConfiguration mo3244getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class EvictionPolicy extends GeneratedMessageV3 implements EvictionPolicyOrBuilder {
        public static final int MAX_DISK_APPLIED_PERCENT_FIELD_NUMBER = 3;
        public static final int MAX_IMAGE_SIZE_BYTES_FIELD_NUMBER = 6;
        public static final int MAX_TTL_SECONDS_FIELD_NUMBER = 4;
        public static final int MAX_VIDEO_SIZE_BYTES_FIELD_NUMBER = 7;
        public static final int MIN_DISK_APPLIED_PERCENT_FIELD_NUMBER = 2;
        public static final int MIN_FREQUENCY_FIELD_NUMBER = 5;
        public static final int SCORE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private double maxDiskAppliedPercent_;
        private PolicyLimit maxImageSizeBytes_;
        private PolicyLimit maxTtlSeconds_;
        private PolicyLimit maxVideoSizeBytes_;
        private byte memoizedIsInitialized;
        private double minDiskAppliedPercent_;
        private PolicyLimit minFrequency_;
        private double score_;
        private static final EvictionPolicy DEFAULT_INSTANCE = new EvictionPolicy();
        private static final Parser PARSER = new AbstractParser() { // from class: io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicy.1
            @Override // com.explorestack.protobuf.Parser
            public EvictionPolicy parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new EvictionPolicy(codedInputStream, extensionRegistryLite);
            }
        };

        private EvictionPolicy(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        private EvictionPolicy() {
            this.memoizedIsInitialized = (byte) -1;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new EvictionPolicy();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private EvictionPolicy(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            PolicyLimit.Builder builder;
            extensionRegistryLite.getClass();
            UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 9) {
                                this.score_ = codedInputStream.readDouble();
                            } else if (readTag == 17) {
                                this.minDiskAppliedPercent_ = codedInputStream.readDouble();
                            } else if (readTag != 25) {
                                if (readTag == 34) {
                                    PolicyLimit policyLimit = this.maxTtlSeconds_;
                                    builder = policyLimit != null ? policyLimit.toBuilder() : null;
                                    PolicyLimit policyLimit2 = (PolicyLimit) codedInputStream.readMessage(PolicyLimit.parser(), extensionRegistryLite);
                                    this.maxTtlSeconds_ = policyLimit2;
                                    if (builder != null) {
                                        builder.mergeFrom(policyLimit2);
                                        this.maxTtlSeconds_ = builder.buildPartial();
                                    }
                                } else if (readTag == 42) {
                                    PolicyLimit policyLimit3 = this.minFrequency_;
                                    builder = policyLimit3 != null ? policyLimit3.toBuilder() : null;
                                    PolicyLimit policyLimit4 = (PolicyLimit) codedInputStream.readMessage(PolicyLimit.parser(), extensionRegistryLite);
                                    this.minFrequency_ = policyLimit4;
                                    if (builder != null) {
                                        builder.mergeFrom(policyLimit4);
                                        this.minFrequency_ = builder.buildPartial();
                                    }
                                } else if (readTag == 50) {
                                    PolicyLimit policyLimit5 = this.maxImageSizeBytes_;
                                    builder = policyLimit5 != null ? policyLimit5.toBuilder() : null;
                                    PolicyLimit policyLimit6 = (PolicyLimit) codedInputStream.readMessage(PolicyLimit.parser(), extensionRegistryLite);
                                    this.maxImageSizeBytes_ = policyLimit6;
                                    if (builder != null) {
                                        builder.mergeFrom(policyLimit6);
                                        this.maxImageSizeBytes_ = builder.buildPartial();
                                    }
                                } else if (readTag == 58) {
                                    PolicyLimit policyLimit7 = this.maxVideoSizeBytes_;
                                    builder = policyLimit7 != null ? policyLimit7.toBuilder() : null;
                                    PolicyLimit policyLimit8 = (PolicyLimit) codedInputStream.readMessage(PolicyLimit.parser(), extensionRegistryLite);
                                    this.maxVideoSizeBytes_ = policyLimit8;
                                    if (builder != null) {
                                        builder.mergeFrom(policyLimit8);
                                        this.maxVideoSizeBytes_ = builder.buildPartial();
                                    }
                                } else if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                }
                            } else {
                                this.maxDiskAppliedPercent_ = codedInputStream.readDouble();
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
            return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_EvictionPolicy_descriptor;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_EvictionPolicy_fieldAccessorTable.ensureFieldAccessorsInitialized(EvictionPolicy.class, Builder.class);
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
        public double getScore() {
            return this.score_;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
        public double getMinDiskAppliedPercent() {
            return this.minDiskAppliedPercent_;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
        public double getMaxDiskAppliedPercent() {
            return this.maxDiskAppliedPercent_;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
        public boolean hasMaxTtlSeconds() {
            return this.maxTtlSeconds_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
        public PolicyLimit getMaxTtlSeconds() {
            PolicyLimit policyLimit = this.maxTtlSeconds_;
            return policyLimit == null ? PolicyLimit.getDefaultInstance() : policyLimit;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
        public PolicyLimitOrBuilder getMaxTtlSecondsOrBuilder() {
            return getMaxTtlSeconds();
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
        public boolean hasMinFrequency() {
            return this.minFrequency_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
        public PolicyLimit getMinFrequency() {
            PolicyLimit policyLimit = this.minFrequency_;
            return policyLimit == null ? PolicyLimit.getDefaultInstance() : policyLimit;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
        public PolicyLimitOrBuilder getMinFrequencyOrBuilder() {
            return getMinFrequency();
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
        public boolean hasMaxImageSizeBytes() {
            return this.maxImageSizeBytes_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
        public PolicyLimit getMaxImageSizeBytes() {
            PolicyLimit policyLimit = this.maxImageSizeBytes_;
            return policyLimit == null ? PolicyLimit.getDefaultInstance() : policyLimit;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
        public PolicyLimitOrBuilder getMaxImageSizeBytesOrBuilder() {
            return getMaxImageSizeBytes();
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
        public boolean hasMaxVideoSizeBytes() {
            return this.maxVideoSizeBytes_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
        public PolicyLimit getMaxVideoSizeBytes() {
            PolicyLimit policyLimit = this.maxVideoSizeBytes_;
            return policyLimit == null ? PolicyLimit.getDefaultInstance() : policyLimit;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
        public PolicyLimitOrBuilder getMaxVideoSizeBytesOrBuilder() {
            return getMaxVideoSizeBytes();
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
            double d = this.score_;
            if (d != 0.0d) {
                codedOutputStream.writeDouble(1, d);
            }
            double d2 = this.minDiskAppliedPercent_;
            if (d2 != 0.0d) {
                codedOutputStream.writeDouble(2, d2);
            }
            double d3 = this.maxDiskAppliedPercent_;
            if (d3 != 0.0d) {
                codedOutputStream.writeDouble(3, d3);
            }
            if (this.maxTtlSeconds_ != null) {
                codedOutputStream.writeMessage(4, getMaxTtlSeconds());
            }
            if (this.minFrequency_ != null) {
                codedOutputStream.writeMessage(5, getMinFrequency());
            }
            if (this.maxImageSizeBytes_ != null) {
                codedOutputStream.writeMessage(6, getMaxImageSizeBytes());
            }
            if (this.maxVideoSizeBytes_ != null) {
                codedOutputStream.writeMessage(7, getMaxVideoSizeBytes());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            double d = this.score_;
            int computeDoubleSize = d != 0.0d ? CodedOutputStream.computeDoubleSize(1, d) : 0;
            double d2 = this.minDiskAppliedPercent_;
            if (d2 != 0.0d) {
                computeDoubleSize += CodedOutputStream.computeDoubleSize(2, d2);
            }
            double d3 = this.maxDiskAppliedPercent_;
            if (d3 != 0.0d) {
                computeDoubleSize += CodedOutputStream.computeDoubleSize(3, d3);
            }
            if (this.maxTtlSeconds_ != null) {
                computeDoubleSize += CodedOutputStream.computeMessageSize(4, getMaxTtlSeconds());
            }
            if (this.minFrequency_ != null) {
                computeDoubleSize += CodedOutputStream.computeMessageSize(5, getMinFrequency());
            }
            if (this.maxImageSizeBytes_ != null) {
                computeDoubleSize += CodedOutputStream.computeMessageSize(6, getMaxImageSizeBytes());
            }
            if (this.maxVideoSizeBytes_ != null) {
                computeDoubleSize += CodedOutputStream.computeMessageSize(7, getMaxVideoSizeBytes());
            }
            int serializedSize = computeDoubleSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EvictionPolicy)) {
                return super.equals(obj);
            }
            EvictionPolicy evictionPolicy = (EvictionPolicy) obj;
            if (Double.doubleToLongBits(getScore()) != Double.doubleToLongBits(evictionPolicy.getScore()) || Double.doubleToLongBits(getMinDiskAppliedPercent()) != Double.doubleToLongBits(evictionPolicy.getMinDiskAppliedPercent()) || Double.doubleToLongBits(getMaxDiskAppliedPercent()) != Double.doubleToLongBits(evictionPolicy.getMaxDiskAppliedPercent()) || hasMaxTtlSeconds() != evictionPolicy.hasMaxTtlSeconds()) {
                return false;
            }
            if ((hasMaxTtlSeconds() && !getMaxTtlSeconds().equals(evictionPolicy.getMaxTtlSeconds())) || hasMinFrequency() != evictionPolicy.hasMinFrequency()) {
                return false;
            }
            if ((hasMinFrequency() && !getMinFrequency().equals(evictionPolicy.getMinFrequency())) || hasMaxImageSizeBytes() != evictionPolicy.hasMaxImageSizeBytes()) {
                return false;
            }
            if ((!hasMaxImageSizeBytes() || getMaxImageSizeBytes().equals(evictionPolicy.getMaxImageSizeBytes())) && hasMaxVideoSizeBytes() == evictionPolicy.hasMaxVideoSizeBytes()) {
                return (!hasMaxVideoSizeBytes() || getMaxVideoSizeBytes().equals(evictionPolicy.getMaxVideoSizeBytes())) && this.unknownFields.equals(evictionPolicy.unknownFields);
            }
            return false;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = ((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Internal.hashLong(Double.doubleToLongBits(getScore()))) * 37) + 2) * 53) + Internal.hashLong(Double.doubleToLongBits(getMinDiskAppliedPercent()))) * 37) + 3) * 53) + Internal.hashLong(Double.doubleToLongBits(getMaxDiskAppliedPercent()));
            if (hasMaxTtlSeconds()) {
                hashCode = (((hashCode * 37) + 4) * 53) + getMaxTtlSeconds().hashCode();
            }
            if (hasMinFrequency()) {
                hashCode = (((hashCode * 37) + 5) * 53) + getMinFrequency().hashCode();
            }
            if (hasMaxImageSizeBytes()) {
                hashCode = (((hashCode * 37) + 6) * 53) + getMaxImageSizeBytes().hashCode();
            }
            if (hasMaxVideoSizeBytes()) {
                hashCode = (((hashCode * 37) + 7) * 53) + getMaxVideoSizeBytes().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public static EvictionPolicy parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (EvictionPolicy) PARSER.parseFrom(byteBuffer);
        }

        public static EvictionPolicy parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (EvictionPolicy) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static EvictionPolicy parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (EvictionPolicy) PARSER.parseFrom(byteString);
        }

        public static EvictionPolicy parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (EvictionPolicy) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static EvictionPolicy parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (EvictionPolicy) PARSER.parseFrom(bArr);
        }

        public static EvictionPolicy parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (EvictionPolicy) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static EvictionPolicy parseFrom(InputStream inputStream) throws IOException {
            return (EvictionPolicy) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static EvictionPolicy parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EvictionPolicy) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EvictionPolicy parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (EvictionPolicy) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EvictionPolicy parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EvictionPolicy) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EvictionPolicy parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (EvictionPolicy) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static EvictionPolicy parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EvictionPolicy) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(EvictionPolicy evictionPolicy) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(evictionPolicy);
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

        public static final class Builder extends GeneratedMessageV3.Builder implements EvictionPolicyOrBuilder {
            private double maxDiskAppliedPercent_;
            private SingleFieldBuilderV3 maxImageSizeBytesBuilder_;
            private PolicyLimit maxImageSizeBytes_;
            private SingleFieldBuilderV3 maxTtlSecondsBuilder_;
            private PolicyLimit maxTtlSeconds_;
            private SingleFieldBuilderV3 maxVideoSizeBytesBuilder_;
            private PolicyLimit maxVideoSizeBytes_;
            private double minDiskAppliedPercent_;
            private SingleFieldBuilderV3 minFrequencyBuilder_;
            private PolicyLimit minFrequency_;
            private double score_;

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_EvictionPolicy_descriptor;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_EvictionPolicy_fieldAccessorTable.ensureFieldAccessorsInitialized(EvictionPolicy.class, Builder.class);
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
                this.score_ = 0.0d;
                this.minDiskAppliedPercent_ = 0.0d;
                this.maxDiskAppliedPercent_ = 0.0d;
                if (this.maxTtlSecondsBuilder_ == null) {
                    this.maxTtlSeconds_ = null;
                } else {
                    this.maxTtlSeconds_ = null;
                    this.maxTtlSecondsBuilder_ = null;
                }
                if (this.minFrequencyBuilder_ == null) {
                    this.minFrequency_ = null;
                } else {
                    this.minFrequency_ = null;
                    this.minFrequencyBuilder_ = null;
                }
                if (this.maxImageSizeBytesBuilder_ == null) {
                    this.maxImageSizeBytes_ = null;
                } else {
                    this.maxImageSizeBytes_ = null;
                    this.maxImageSizeBytesBuilder_ = null;
                }
                if (this.maxVideoSizeBytesBuilder_ == null) {
                    this.maxVideoSizeBytes_ = null;
                } else {
                    this.maxVideoSizeBytes_ = null;
                    this.maxVideoSizeBytesBuilder_ = null;
                }
                return this;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_EvictionPolicy_descriptor;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* renamed from: getDefaultInstanceForType */
            public EvictionPolicy mo3244getDefaultInstanceForType() {
                return EvictionPolicy.getDefaultInstance();
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public EvictionPolicy build() {
                EvictionPolicy buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public EvictionPolicy buildPartial() {
                EvictionPolicy evictionPolicy = new EvictionPolicy(this);
                evictionPolicy.score_ = this.score_;
                evictionPolicy.minDiskAppliedPercent_ = this.minDiskAppliedPercent_;
                evictionPolicy.maxDiskAppliedPercent_ = this.maxDiskAppliedPercent_;
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.maxTtlSecondsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    evictionPolicy.maxTtlSeconds_ = this.maxTtlSeconds_;
                } else {
                    evictionPolicy.maxTtlSeconds_ = (PolicyLimit) singleFieldBuilderV3.build();
                }
                SingleFieldBuilderV3 singleFieldBuilderV32 = this.minFrequencyBuilder_;
                if (singleFieldBuilderV32 == null) {
                    evictionPolicy.minFrequency_ = this.minFrequency_;
                } else {
                    evictionPolicy.minFrequency_ = (PolicyLimit) singleFieldBuilderV32.build();
                }
                SingleFieldBuilderV3 singleFieldBuilderV33 = this.maxImageSizeBytesBuilder_;
                if (singleFieldBuilderV33 == null) {
                    evictionPolicy.maxImageSizeBytes_ = this.maxImageSizeBytes_;
                } else {
                    evictionPolicy.maxImageSizeBytes_ = (PolicyLimit) singleFieldBuilderV33.build();
                }
                SingleFieldBuilderV3 singleFieldBuilderV34 = this.maxVideoSizeBytesBuilder_;
                if (singleFieldBuilderV34 == null) {
                    evictionPolicy.maxVideoSizeBytes_ = this.maxVideoSizeBytes_;
                } else {
                    evictionPolicy.maxVideoSizeBytes_ = (PolicyLimit) singleFieldBuilderV34.build();
                }
                onBuilt();
                return evictionPolicy;
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
                if (message instanceof EvictionPolicy) {
                    return mergeFrom((EvictionPolicy) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(EvictionPolicy evictionPolicy) {
                if (evictionPolicy == EvictionPolicy.getDefaultInstance()) {
                    return this;
                }
                if (evictionPolicy.getScore() != 0.0d) {
                    setScore(evictionPolicy.getScore());
                }
                if (evictionPolicy.getMinDiskAppliedPercent() != 0.0d) {
                    setMinDiskAppliedPercent(evictionPolicy.getMinDiskAppliedPercent());
                }
                if (evictionPolicy.getMaxDiskAppliedPercent() != 0.0d) {
                    setMaxDiskAppliedPercent(evictionPolicy.getMaxDiskAppliedPercent());
                }
                if (evictionPolicy.hasMaxTtlSeconds()) {
                    mergeMaxTtlSeconds(evictionPolicy.getMaxTtlSeconds());
                }
                if (evictionPolicy.hasMinFrequency()) {
                    mergeMinFrequency(evictionPolicy.getMinFrequency());
                }
                if (evictionPolicy.hasMaxImageSizeBytes()) {
                    mergeMaxImageSizeBytes(evictionPolicy.getMaxImageSizeBytes());
                }
                if (evictionPolicy.hasMaxVideoSizeBytes()) {
                    mergeMaxVideoSizeBytes(evictionPolicy.getMaxVideoSizeBytes());
                }
                mergeUnknownFields(((GeneratedMessageV3) evictionPolicy).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                EvictionPolicy evictionPolicy = null;
                try {
                    try {
                        EvictionPolicy evictionPolicy2 = (EvictionPolicy) EvictionPolicy.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (evictionPolicy2 != null) {
                            mergeFrom(evictionPolicy2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        EvictionPolicy evictionPolicy3 = (EvictionPolicy) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            evictionPolicy = evictionPolicy3;
                            if (evictionPolicy != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (evictionPolicy != null) {
                        mergeFrom(evictionPolicy);
                    }
                    throw th;
                }
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
            public double getScore() {
                return this.score_;
            }

            public Builder setScore(double d) {
                this.score_ = d;
                onChanged();
                return this;
            }

            public Builder clearScore() {
                this.score_ = 0.0d;
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
            public double getMinDiskAppliedPercent() {
                return this.minDiskAppliedPercent_;
            }

            public Builder setMinDiskAppliedPercent(double d) {
                this.minDiskAppliedPercent_ = d;
                onChanged();
                return this;
            }

            public Builder clearMinDiskAppliedPercent() {
                this.minDiskAppliedPercent_ = 0.0d;
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
            public double getMaxDiskAppliedPercent() {
                return this.maxDiskAppliedPercent_;
            }

            public Builder setMaxDiskAppliedPercent(double d) {
                this.maxDiskAppliedPercent_ = d;
                onChanged();
                return this;
            }

            public Builder clearMaxDiskAppliedPercent() {
                this.maxDiskAppliedPercent_ = 0.0d;
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
            public boolean hasMaxTtlSeconds() {
                return (this.maxTtlSecondsBuilder_ == null && this.maxTtlSeconds_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
            public PolicyLimit getMaxTtlSeconds() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.maxTtlSecondsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    PolicyLimit policyLimit = this.maxTtlSeconds_;
                    return policyLimit == null ? PolicyLimit.getDefaultInstance() : policyLimit;
                }
                return (PolicyLimit) singleFieldBuilderV3.getMessage();
            }

            public Builder setMaxTtlSeconds(PolicyLimit policyLimit) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.maxTtlSecondsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    policyLimit.getClass();
                    this.maxTtlSeconds_ = policyLimit;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(policyLimit);
                }
                return this;
            }

            public Builder setMaxTtlSeconds(PolicyLimit.Builder builder) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.maxTtlSecondsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.maxTtlSeconds_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder mergeMaxTtlSeconds(PolicyLimit policyLimit) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.maxTtlSecondsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    PolicyLimit policyLimit2 = this.maxTtlSeconds_;
                    if (policyLimit2 != null) {
                        this.maxTtlSeconds_ = PolicyLimit.newBuilder(policyLimit2).mergeFrom(policyLimit).buildPartial();
                    } else {
                        this.maxTtlSeconds_ = policyLimit;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(policyLimit);
                }
                return this;
            }

            public Builder clearMaxTtlSeconds() {
                if (this.maxTtlSecondsBuilder_ == null) {
                    this.maxTtlSeconds_ = null;
                    onChanged();
                } else {
                    this.maxTtlSeconds_ = null;
                    this.maxTtlSecondsBuilder_ = null;
                }
                return this;
            }

            public PolicyLimit.Builder getMaxTtlSecondsBuilder() {
                onChanged();
                return (PolicyLimit.Builder) getMaxTtlSecondsFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
            public PolicyLimitOrBuilder getMaxTtlSecondsOrBuilder() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.maxTtlSecondsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PolicyLimitOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                PolicyLimit policyLimit = this.maxTtlSeconds_;
                return policyLimit == null ? PolicyLimit.getDefaultInstance() : policyLimit;
            }

            private SingleFieldBuilderV3 getMaxTtlSecondsFieldBuilder() {
                if (this.maxTtlSecondsBuilder_ == null) {
                    this.maxTtlSecondsBuilder_ = new SingleFieldBuilderV3(getMaxTtlSeconds(), getParentForChildren(), isClean());
                    this.maxTtlSeconds_ = null;
                }
                return this.maxTtlSecondsBuilder_;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
            public boolean hasMinFrequency() {
                return (this.minFrequencyBuilder_ == null && this.minFrequency_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
            public PolicyLimit getMinFrequency() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.minFrequencyBuilder_;
                if (singleFieldBuilderV3 == null) {
                    PolicyLimit policyLimit = this.minFrequency_;
                    return policyLimit == null ? PolicyLimit.getDefaultInstance() : policyLimit;
                }
                return (PolicyLimit) singleFieldBuilderV3.getMessage();
            }

            public Builder setMinFrequency(PolicyLimit policyLimit) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.minFrequencyBuilder_;
                if (singleFieldBuilderV3 == null) {
                    policyLimit.getClass();
                    this.minFrequency_ = policyLimit;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(policyLimit);
                }
                return this;
            }

            public Builder setMinFrequency(PolicyLimit.Builder builder) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.minFrequencyBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.minFrequency_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder mergeMinFrequency(PolicyLimit policyLimit) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.minFrequencyBuilder_;
                if (singleFieldBuilderV3 == null) {
                    PolicyLimit policyLimit2 = this.minFrequency_;
                    if (policyLimit2 != null) {
                        this.minFrequency_ = PolicyLimit.newBuilder(policyLimit2).mergeFrom(policyLimit).buildPartial();
                    } else {
                        this.minFrequency_ = policyLimit;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(policyLimit);
                }
                return this;
            }

            public Builder clearMinFrequency() {
                if (this.minFrequencyBuilder_ == null) {
                    this.minFrequency_ = null;
                    onChanged();
                } else {
                    this.minFrequency_ = null;
                    this.minFrequencyBuilder_ = null;
                }
                return this;
            }

            public PolicyLimit.Builder getMinFrequencyBuilder() {
                onChanged();
                return (PolicyLimit.Builder) getMinFrequencyFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
            public PolicyLimitOrBuilder getMinFrequencyOrBuilder() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.minFrequencyBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PolicyLimitOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                PolicyLimit policyLimit = this.minFrequency_;
                return policyLimit == null ? PolicyLimit.getDefaultInstance() : policyLimit;
            }

            private SingleFieldBuilderV3 getMinFrequencyFieldBuilder() {
                if (this.minFrequencyBuilder_ == null) {
                    this.minFrequencyBuilder_ = new SingleFieldBuilderV3(getMinFrequency(), getParentForChildren(), isClean());
                    this.minFrequency_ = null;
                }
                return this.minFrequencyBuilder_;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
            public boolean hasMaxImageSizeBytes() {
                return (this.maxImageSizeBytesBuilder_ == null && this.maxImageSizeBytes_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
            public PolicyLimit getMaxImageSizeBytes() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.maxImageSizeBytesBuilder_;
                if (singleFieldBuilderV3 == null) {
                    PolicyLimit policyLimit = this.maxImageSizeBytes_;
                    return policyLimit == null ? PolicyLimit.getDefaultInstance() : policyLimit;
                }
                return (PolicyLimit) singleFieldBuilderV3.getMessage();
            }

            public Builder setMaxImageSizeBytes(PolicyLimit policyLimit) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.maxImageSizeBytesBuilder_;
                if (singleFieldBuilderV3 == null) {
                    policyLimit.getClass();
                    this.maxImageSizeBytes_ = policyLimit;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(policyLimit);
                }
                return this;
            }

            public Builder setMaxImageSizeBytes(PolicyLimit.Builder builder) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.maxImageSizeBytesBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.maxImageSizeBytes_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder mergeMaxImageSizeBytes(PolicyLimit policyLimit) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.maxImageSizeBytesBuilder_;
                if (singleFieldBuilderV3 == null) {
                    PolicyLimit policyLimit2 = this.maxImageSizeBytes_;
                    if (policyLimit2 != null) {
                        this.maxImageSizeBytes_ = PolicyLimit.newBuilder(policyLimit2).mergeFrom(policyLimit).buildPartial();
                    } else {
                        this.maxImageSizeBytes_ = policyLimit;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(policyLimit);
                }
                return this;
            }

            public Builder clearMaxImageSizeBytes() {
                if (this.maxImageSizeBytesBuilder_ == null) {
                    this.maxImageSizeBytes_ = null;
                    onChanged();
                } else {
                    this.maxImageSizeBytes_ = null;
                    this.maxImageSizeBytesBuilder_ = null;
                }
                return this;
            }

            public PolicyLimit.Builder getMaxImageSizeBytesBuilder() {
                onChanged();
                return (PolicyLimit.Builder) getMaxImageSizeBytesFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
            public PolicyLimitOrBuilder getMaxImageSizeBytesOrBuilder() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.maxImageSizeBytesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PolicyLimitOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                PolicyLimit policyLimit = this.maxImageSizeBytes_;
                return policyLimit == null ? PolicyLimit.getDefaultInstance() : policyLimit;
            }

            private SingleFieldBuilderV3 getMaxImageSizeBytesFieldBuilder() {
                if (this.maxImageSizeBytesBuilder_ == null) {
                    this.maxImageSizeBytesBuilder_ = new SingleFieldBuilderV3(getMaxImageSizeBytes(), getParentForChildren(), isClean());
                    this.maxImageSizeBytes_ = null;
                }
                return this.maxImageSizeBytesBuilder_;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
            public boolean hasMaxVideoSizeBytes() {
                return (this.maxVideoSizeBytesBuilder_ == null && this.maxVideoSizeBytes_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
            public PolicyLimit getMaxVideoSizeBytes() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.maxVideoSizeBytesBuilder_;
                if (singleFieldBuilderV3 == null) {
                    PolicyLimit policyLimit = this.maxVideoSizeBytes_;
                    return policyLimit == null ? PolicyLimit.getDefaultInstance() : policyLimit;
                }
                return (PolicyLimit) singleFieldBuilderV3.getMessage();
            }

            public Builder setMaxVideoSizeBytes(PolicyLimit policyLimit) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.maxVideoSizeBytesBuilder_;
                if (singleFieldBuilderV3 == null) {
                    policyLimit.getClass();
                    this.maxVideoSizeBytes_ = policyLimit;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(policyLimit);
                }
                return this;
            }

            public Builder setMaxVideoSizeBytes(PolicyLimit.Builder builder) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.maxVideoSizeBytesBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.maxVideoSizeBytes_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder mergeMaxVideoSizeBytes(PolicyLimit policyLimit) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.maxVideoSizeBytesBuilder_;
                if (singleFieldBuilderV3 == null) {
                    PolicyLimit policyLimit2 = this.maxVideoSizeBytes_;
                    if (policyLimit2 != null) {
                        this.maxVideoSizeBytes_ = PolicyLimit.newBuilder(policyLimit2).mergeFrom(policyLimit).buildPartial();
                    } else {
                        this.maxVideoSizeBytes_ = policyLimit;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(policyLimit);
                }
                return this;
            }

            public Builder clearMaxVideoSizeBytes() {
                if (this.maxVideoSizeBytesBuilder_ == null) {
                    this.maxVideoSizeBytes_ = null;
                    onChanged();
                } else {
                    this.maxVideoSizeBytes_ = null;
                    this.maxVideoSizeBytesBuilder_ = null;
                }
                return this;
            }

            public PolicyLimit.Builder getMaxVideoSizeBytesBuilder() {
                onChanged();
                return (PolicyLimit.Builder) getMaxVideoSizeBytesFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
            public PolicyLimitOrBuilder getMaxVideoSizeBytesOrBuilder() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.maxVideoSizeBytesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PolicyLimitOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                PolicyLimit policyLimit = this.maxVideoSizeBytes_;
                return policyLimit == null ? PolicyLimit.getDefaultInstance() : policyLimit;
            }

            private SingleFieldBuilderV3 getMaxVideoSizeBytesFieldBuilder() {
                if (this.maxVideoSizeBytesBuilder_ == null) {
                    this.maxVideoSizeBytesBuilder_ = new SingleFieldBuilderV3(getMaxVideoSizeBytes(), getParentForChildren(), isClean());
                    this.maxVideoSizeBytes_ = null;
                }
                return this.maxVideoSizeBytesBuilder_;
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

        public static EvictionPolicy getDefaultInstance() {
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
        public EvictionPolicy mo3244getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class DownloadPolicy extends GeneratedMessageV3 implements DownloadPolicyOrBuilder {
        public static final int MAX_FILE_SIZE_BYTES_FIELD_NUMBER = 2;
        public static final int MAX_PING_TIME_MS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private PolicyLimit maxFileSizeBytes_;
        private PolicyLimit maxPingTimeMs_;
        private byte memoizedIsInitialized;
        private static final DownloadPolicy DEFAULT_INSTANCE = new DownloadPolicy();
        private static final Parser PARSER = new AbstractParser() { // from class: io.bidmachine.protobuf.sdk.AssetCache.DownloadPolicy.1
            @Override // com.explorestack.protobuf.Parser
            public DownloadPolicy parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new DownloadPolicy(codedInputStream, extensionRegistryLite);
            }
        };

        private DownloadPolicy(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        private DownloadPolicy() {
            this.memoizedIsInitialized = (byte) -1;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new DownloadPolicy();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private DownloadPolicy(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            PolicyLimit.Builder builder;
            extensionRegistryLite.getClass();
            UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                PolicyLimit policyLimit = this.maxPingTimeMs_;
                                builder = policyLimit != null ? policyLimit.toBuilder() : null;
                                PolicyLimit policyLimit2 = (PolicyLimit) codedInputStream.readMessage(PolicyLimit.parser(), extensionRegistryLite);
                                this.maxPingTimeMs_ = policyLimit2;
                                if (builder != null) {
                                    builder.mergeFrom(policyLimit2);
                                    this.maxPingTimeMs_ = builder.buildPartial();
                                }
                            } else if (readTag == 18) {
                                PolicyLimit policyLimit3 = this.maxFileSizeBytes_;
                                builder = policyLimit3 != null ? policyLimit3.toBuilder() : null;
                                PolicyLimit policyLimit4 = (PolicyLimit) codedInputStream.readMessage(PolicyLimit.parser(), extensionRegistryLite);
                                this.maxFileSizeBytes_ = policyLimit4;
                                if (builder != null) {
                                    builder.mergeFrom(policyLimit4);
                                    this.maxFileSizeBytes_ = builder.buildPartial();
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
            return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_DownloadPolicy_descriptor;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_DownloadPolicy_fieldAccessorTable.ensureFieldAccessorsInitialized(DownloadPolicy.class, Builder.class);
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.DownloadPolicyOrBuilder
        public boolean hasMaxPingTimeMs() {
            return this.maxPingTimeMs_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.DownloadPolicyOrBuilder
        public PolicyLimit getMaxPingTimeMs() {
            PolicyLimit policyLimit = this.maxPingTimeMs_;
            return policyLimit == null ? PolicyLimit.getDefaultInstance() : policyLimit;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.DownloadPolicyOrBuilder
        public PolicyLimitOrBuilder getMaxPingTimeMsOrBuilder() {
            return getMaxPingTimeMs();
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.DownloadPolicyOrBuilder
        public boolean hasMaxFileSizeBytes() {
            return this.maxFileSizeBytes_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.DownloadPolicyOrBuilder
        public PolicyLimit getMaxFileSizeBytes() {
            PolicyLimit policyLimit = this.maxFileSizeBytes_;
            return policyLimit == null ? PolicyLimit.getDefaultInstance() : policyLimit;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.DownloadPolicyOrBuilder
        public PolicyLimitOrBuilder getMaxFileSizeBytesOrBuilder() {
            return getMaxFileSizeBytes();
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
            if (this.maxPingTimeMs_ != null) {
                codedOutputStream.writeMessage(1, getMaxPingTimeMs());
            }
            if (this.maxFileSizeBytes_ != null) {
                codedOutputStream.writeMessage(2, getMaxFileSizeBytes());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int computeMessageSize = this.maxPingTimeMs_ != null ? CodedOutputStream.computeMessageSize(1, getMaxPingTimeMs()) : 0;
            if (this.maxFileSizeBytes_ != null) {
                computeMessageSize += CodedOutputStream.computeMessageSize(2, getMaxFileSizeBytes());
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
            if (!(obj instanceof DownloadPolicy)) {
                return super.equals(obj);
            }
            DownloadPolicy downloadPolicy = (DownloadPolicy) obj;
            if (hasMaxPingTimeMs() != downloadPolicy.hasMaxPingTimeMs()) {
                return false;
            }
            if ((!hasMaxPingTimeMs() || getMaxPingTimeMs().equals(downloadPolicy.getMaxPingTimeMs())) && hasMaxFileSizeBytes() == downloadPolicy.hasMaxFileSizeBytes()) {
                return (!hasMaxFileSizeBytes() || getMaxFileSizeBytes().equals(downloadPolicy.getMaxFileSizeBytes())) && this.unknownFields.equals(downloadPolicy.unknownFields);
            }
            return false;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = 779 + getDescriptor().hashCode();
            if (hasMaxPingTimeMs()) {
                hashCode = (((hashCode * 37) + 1) * 53) + getMaxPingTimeMs().hashCode();
            }
            if (hasMaxFileSizeBytes()) {
                hashCode = (((hashCode * 37) + 2) * 53) + getMaxFileSizeBytes().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public static DownloadPolicy parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DownloadPolicy) PARSER.parseFrom(byteBuffer);
        }

        public static DownloadPolicy parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DownloadPolicy) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static DownloadPolicy parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DownloadPolicy) PARSER.parseFrom(byteString);
        }

        public static DownloadPolicy parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DownloadPolicy) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DownloadPolicy parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DownloadPolicy) PARSER.parseFrom(bArr);
        }

        public static DownloadPolicy parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DownloadPolicy) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DownloadPolicy parseFrom(InputStream inputStream) throws IOException {
            return (DownloadPolicy) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DownloadPolicy parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DownloadPolicy) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DownloadPolicy parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DownloadPolicy) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DownloadPolicy parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DownloadPolicy) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DownloadPolicy parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (DownloadPolicy) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DownloadPolicy parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DownloadPolicy) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(DownloadPolicy downloadPolicy) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(downloadPolicy);
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

        public static final class Builder extends GeneratedMessageV3.Builder implements DownloadPolicyOrBuilder {
            private SingleFieldBuilderV3 maxFileSizeBytesBuilder_;
            private PolicyLimit maxFileSizeBytes_;
            private SingleFieldBuilderV3 maxPingTimeMsBuilder_;
            private PolicyLimit maxPingTimeMs_;

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_DownloadPolicy_descriptor;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_DownloadPolicy_fieldAccessorTable.ensureFieldAccessorsInitialized(DownloadPolicy.class, Builder.class);
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
                if (this.maxPingTimeMsBuilder_ == null) {
                    this.maxPingTimeMs_ = null;
                } else {
                    this.maxPingTimeMs_ = null;
                    this.maxPingTimeMsBuilder_ = null;
                }
                if (this.maxFileSizeBytesBuilder_ == null) {
                    this.maxFileSizeBytes_ = null;
                } else {
                    this.maxFileSizeBytes_ = null;
                    this.maxFileSizeBytesBuilder_ = null;
                }
                return this;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_DownloadPolicy_descriptor;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* renamed from: getDefaultInstanceForType */
            public DownloadPolicy mo3244getDefaultInstanceForType() {
                return DownloadPolicy.getDefaultInstance();
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public DownloadPolicy build() {
                DownloadPolicy buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public DownloadPolicy buildPartial() {
                DownloadPolicy downloadPolicy = new DownloadPolicy(this);
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.maxPingTimeMsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    downloadPolicy.maxPingTimeMs_ = this.maxPingTimeMs_;
                } else {
                    downloadPolicy.maxPingTimeMs_ = (PolicyLimit) singleFieldBuilderV3.build();
                }
                SingleFieldBuilderV3 singleFieldBuilderV32 = this.maxFileSizeBytesBuilder_;
                if (singleFieldBuilderV32 == null) {
                    downloadPolicy.maxFileSizeBytes_ = this.maxFileSizeBytes_;
                } else {
                    downloadPolicy.maxFileSizeBytes_ = (PolicyLimit) singleFieldBuilderV32.build();
                }
                onBuilt();
                return downloadPolicy;
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
                if (message instanceof DownloadPolicy) {
                    return mergeFrom((DownloadPolicy) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DownloadPolicy downloadPolicy) {
                if (downloadPolicy == DownloadPolicy.getDefaultInstance()) {
                    return this;
                }
                if (downloadPolicy.hasMaxPingTimeMs()) {
                    mergeMaxPingTimeMs(downloadPolicy.getMaxPingTimeMs());
                }
                if (downloadPolicy.hasMaxFileSizeBytes()) {
                    mergeMaxFileSizeBytes(downloadPolicy.getMaxFileSizeBytes());
                }
                mergeUnknownFields(((GeneratedMessageV3) downloadPolicy).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                DownloadPolicy downloadPolicy = null;
                try {
                    try {
                        DownloadPolicy downloadPolicy2 = (DownloadPolicy) DownloadPolicy.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (downloadPolicy2 != null) {
                            mergeFrom(downloadPolicy2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        DownloadPolicy downloadPolicy3 = (DownloadPolicy) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            downloadPolicy = downloadPolicy3;
                            if (downloadPolicy != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (downloadPolicy != null) {
                        mergeFrom(downloadPolicy);
                    }
                    throw th;
                }
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.DownloadPolicyOrBuilder
            public boolean hasMaxPingTimeMs() {
                return (this.maxPingTimeMsBuilder_ == null && this.maxPingTimeMs_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.DownloadPolicyOrBuilder
            public PolicyLimit getMaxPingTimeMs() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.maxPingTimeMsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    PolicyLimit policyLimit = this.maxPingTimeMs_;
                    return policyLimit == null ? PolicyLimit.getDefaultInstance() : policyLimit;
                }
                return (PolicyLimit) singleFieldBuilderV3.getMessage();
            }

            public Builder setMaxPingTimeMs(PolicyLimit policyLimit) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.maxPingTimeMsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    policyLimit.getClass();
                    this.maxPingTimeMs_ = policyLimit;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(policyLimit);
                }
                return this;
            }

            public Builder setMaxPingTimeMs(PolicyLimit.Builder builder) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.maxPingTimeMsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.maxPingTimeMs_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder mergeMaxPingTimeMs(PolicyLimit policyLimit) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.maxPingTimeMsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    PolicyLimit policyLimit2 = this.maxPingTimeMs_;
                    if (policyLimit2 != null) {
                        this.maxPingTimeMs_ = PolicyLimit.newBuilder(policyLimit2).mergeFrom(policyLimit).buildPartial();
                    } else {
                        this.maxPingTimeMs_ = policyLimit;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(policyLimit);
                }
                return this;
            }

            public Builder clearMaxPingTimeMs() {
                if (this.maxPingTimeMsBuilder_ == null) {
                    this.maxPingTimeMs_ = null;
                    onChanged();
                } else {
                    this.maxPingTimeMs_ = null;
                    this.maxPingTimeMsBuilder_ = null;
                }
                return this;
            }

            public PolicyLimit.Builder getMaxPingTimeMsBuilder() {
                onChanged();
                return (PolicyLimit.Builder) getMaxPingTimeMsFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.DownloadPolicyOrBuilder
            public PolicyLimitOrBuilder getMaxPingTimeMsOrBuilder() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.maxPingTimeMsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PolicyLimitOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                PolicyLimit policyLimit = this.maxPingTimeMs_;
                return policyLimit == null ? PolicyLimit.getDefaultInstance() : policyLimit;
            }

            private SingleFieldBuilderV3 getMaxPingTimeMsFieldBuilder() {
                if (this.maxPingTimeMsBuilder_ == null) {
                    this.maxPingTimeMsBuilder_ = new SingleFieldBuilderV3(getMaxPingTimeMs(), getParentForChildren(), isClean());
                    this.maxPingTimeMs_ = null;
                }
                return this.maxPingTimeMsBuilder_;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.DownloadPolicyOrBuilder
            public boolean hasMaxFileSizeBytes() {
                return (this.maxFileSizeBytesBuilder_ == null && this.maxFileSizeBytes_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.DownloadPolicyOrBuilder
            public PolicyLimit getMaxFileSizeBytes() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.maxFileSizeBytesBuilder_;
                if (singleFieldBuilderV3 == null) {
                    PolicyLimit policyLimit = this.maxFileSizeBytes_;
                    return policyLimit == null ? PolicyLimit.getDefaultInstance() : policyLimit;
                }
                return (PolicyLimit) singleFieldBuilderV3.getMessage();
            }

            public Builder setMaxFileSizeBytes(PolicyLimit policyLimit) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.maxFileSizeBytesBuilder_;
                if (singleFieldBuilderV3 == null) {
                    policyLimit.getClass();
                    this.maxFileSizeBytes_ = policyLimit;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(policyLimit);
                }
                return this;
            }

            public Builder setMaxFileSizeBytes(PolicyLimit.Builder builder) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.maxFileSizeBytesBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.maxFileSizeBytes_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder mergeMaxFileSizeBytes(PolicyLimit policyLimit) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.maxFileSizeBytesBuilder_;
                if (singleFieldBuilderV3 == null) {
                    PolicyLimit policyLimit2 = this.maxFileSizeBytes_;
                    if (policyLimit2 != null) {
                        this.maxFileSizeBytes_ = PolicyLimit.newBuilder(policyLimit2).mergeFrom(policyLimit).buildPartial();
                    } else {
                        this.maxFileSizeBytes_ = policyLimit;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(policyLimit);
                }
                return this;
            }

            public Builder clearMaxFileSizeBytes() {
                if (this.maxFileSizeBytesBuilder_ == null) {
                    this.maxFileSizeBytes_ = null;
                    onChanged();
                } else {
                    this.maxFileSizeBytes_ = null;
                    this.maxFileSizeBytesBuilder_ = null;
                }
                return this;
            }

            public PolicyLimit.Builder getMaxFileSizeBytesBuilder() {
                onChanged();
                return (PolicyLimit.Builder) getMaxFileSizeBytesFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.DownloadPolicyOrBuilder
            public PolicyLimitOrBuilder getMaxFileSizeBytesOrBuilder() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.maxFileSizeBytesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PolicyLimitOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                PolicyLimit policyLimit = this.maxFileSizeBytes_;
                return policyLimit == null ? PolicyLimit.getDefaultInstance() : policyLimit;
            }

            private SingleFieldBuilderV3 getMaxFileSizeBytesFieldBuilder() {
                if (this.maxFileSizeBytesBuilder_ == null) {
                    this.maxFileSizeBytesBuilder_ = new SingleFieldBuilderV3(getMaxFileSizeBytes(), getParentForChildren(), isClean());
                    this.maxFileSizeBytes_ = null;
                }
                return this.maxFileSizeBytesBuilder_;
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

        public static DownloadPolicy getDefaultInstance() {
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
        public DownloadPolicy mo3244getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class PolicyLimit extends GeneratedMessageV3 implements PolicyLimitOrBuilder {
        private static final PolicyLimit DEFAULT_INSTANCE = new PolicyLimit();
        private static final Parser PARSER = new AbstractParser() { // from class: io.bidmachine.protobuf.sdk.AssetCache.PolicyLimit.1
            @Override // com.explorestack.protobuf.Parser
            public PolicyLimit parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new PolicyLimit(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int THRESHOLD_FIELD_NUMBER = 1;
        public static final int WEIGHT_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private long threshold_;
        private double weight_;

        private PolicyLimit(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        private PolicyLimit() {
            this.memoizedIsInitialized = (byte) -1;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new PolicyLimit();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private PolicyLimit(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.threshold_ = codedInputStream.readInt64();
                            } else if (readTag == 17) {
                                this.weight_ = codedInputStream.readDouble();
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
            return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_PolicyLimit_descriptor;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_PolicyLimit_fieldAccessorTable.ensureFieldAccessorsInitialized(PolicyLimit.class, Builder.class);
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyLimitOrBuilder
        public long getThreshold() {
            return this.threshold_;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyLimitOrBuilder
        public double getWeight() {
            return this.weight_;
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
            long j = this.threshold_;
            if (j != 0) {
                codedOutputStream.writeInt64(1, j);
            }
            double d = this.weight_;
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
            long j = this.threshold_;
            int computeInt64Size = j != 0 ? CodedOutputStream.computeInt64Size(1, j) : 0;
            double d = this.weight_;
            if (d != 0.0d) {
                computeInt64Size += CodedOutputStream.computeDoubleSize(2, d);
            }
            int serializedSize = computeInt64Size + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PolicyLimit)) {
                return super.equals(obj);
            }
            PolicyLimit policyLimit = (PolicyLimit) obj;
            return getThreshold() == policyLimit.getThreshold() && Double.doubleToLongBits(getWeight()) == Double.doubleToLongBits(policyLimit.getWeight()) && this.unknownFields.equals(policyLimit.unknownFields);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Internal.hashLong(getThreshold())) * 37) + 2) * 53) + Internal.hashLong(Double.doubleToLongBits(getWeight()))) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        public static PolicyLimit parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (PolicyLimit) PARSER.parseFrom(byteBuffer);
        }

        public static PolicyLimit parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PolicyLimit) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static PolicyLimit parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (PolicyLimit) PARSER.parseFrom(byteString);
        }

        public static PolicyLimit parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PolicyLimit) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static PolicyLimit parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (PolicyLimit) PARSER.parseFrom(bArr);
        }

        public static PolicyLimit parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PolicyLimit) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static PolicyLimit parseFrom(InputStream inputStream) throws IOException {
            return (PolicyLimit) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static PolicyLimit parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PolicyLimit) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PolicyLimit parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (PolicyLimit) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static PolicyLimit parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PolicyLimit) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PolicyLimit parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (PolicyLimit) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static PolicyLimit parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PolicyLimit) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(PolicyLimit policyLimit) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(policyLimit);
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

        public static final class Builder extends GeneratedMessageV3.Builder implements PolicyLimitOrBuilder {
            private long threshold_;
            private double weight_;

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_PolicyLimit_descriptor;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_PolicyLimit_fieldAccessorTable.ensureFieldAccessorsInitialized(PolicyLimit.class, Builder.class);
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
                this.threshold_ = 0L;
                this.weight_ = 0.0d;
                return this;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_PolicyLimit_descriptor;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* renamed from: getDefaultInstanceForType */
            public PolicyLimit mo3244getDefaultInstanceForType() {
                return PolicyLimit.getDefaultInstance();
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public PolicyLimit build() {
                PolicyLimit buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public PolicyLimit buildPartial() {
                PolicyLimit policyLimit = new PolicyLimit(this);
                policyLimit.threshold_ = this.threshold_;
                policyLimit.weight_ = this.weight_;
                onBuilt();
                return policyLimit;
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
                if (message instanceof PolicyLimit) {
                    return mergeFrom((PolicyLimit) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(PolicyLimit policyLimit) {
                if (policyLimit == PolicyLimit.getDefaultInstance()) {
                    return this;
                }
                if (policyLimit.getThreshold() != 0) {
                    setThreshold(policyLimit.getThreshold());
                }
                if (policyLimit.getWeight() != 0.0d) {
                    setWeight(policyLimit.getWeight());
                }
                mergeUnknownFields(((GeneratedMessageV3) policyLimit).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                PolicyLimit policyLimit = null;
                try {
                    try {
                        PolicyLimit policyLimit2 = (PolicyLimit) PolicyLimit.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (policyLimit2 != null) {
                            mergeFrom(policyLimit2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        PolicyLimit policyLimit3 = (PolicyLimit) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            policyLimit = policyLimit3;
                            if (policyLimit != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (policyLimit != null) {
                        mergeFrom(policyLimit);
                    }
                    throw th;
                }
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyLimitOrBuilder
            public long getThreshold() {
                return this.threshold_;
            }

            public Builder setThreshold(long j) {
                this.threshold_ = j;
                onChanged();
                return this;
            }

            public Builder clearThreshold() {
                this.threshold_ = 0L;
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyLimitOrBuilder
            public double getWeight() {
                return this.weight_;
            }

            public Builder setWeight(double d) {
                this.weight_ = d;
                onChanged();
                return this;
            }

            public Builder clearWeight() {
                this.weight_ = 0.0d;
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

        public static PolicyLimit getDefaultInstance() {
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
        public PolicyLimit mo3244getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
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
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int serializedSize = this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AssetCache) {
            return this.unknownFields.equals(((AssetCache) obj).unknownFields);
        }
        return super.equals(obj);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = ((779 + getDescriptor().hashCode()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    public static AssetCache parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AssetCache) PARSER.parseFrom(byteBuffer);
    }

    public static AssetCache parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AssetCache) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static AssetCache parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AssetCache) PARSER.parseFrom(byteString);
    }

    public static AssetCache parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AssetCache) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static AssetCache parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AssetCache) PARSER.parseFrom(bArr);
    }

    public static AssetCache parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AssetCache) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static AssetCache parseFrom(InputStream inputStream) throws IOException {
        return (AssetCache) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static AssetCache parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AssetCache) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static AssetCache parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AssetCache) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static AssetCache parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AssetCache) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static AssetCache parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AssetCache) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static AssetCache parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AssetCache) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(AssetCache assetCache) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(assetCache);
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

    public static final class Builder extends GeneratedMessageV3.Builder implements AssetCacheOrBuilder {
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_descriptor;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_fieldAccessorTable.ensureFieldAccessorsInitialized(AssetCache.class, Builder.class);
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
            return this;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_descriptor;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* renamed from: getDefaultInstanceForType */
        public AssetCache mo3244getDefaultInstanceForType() {
            return AssetCache.getDefaultInstance();
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public AssetCache build() {
            AssetCache buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public AssetCache buildPartial() {
            AssetCache assetCache = new AssetCache(this);
            onBuilt();
            return assetCache;
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
            if (message instanceof AssetCache) {
                return mergeFrom((AssetCache) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(AssetCache assetCache) {
            if (assetCache == AssetCache.getDefaultInstance()) {
                return this;
            }
            mergeUnknownFields(((GeneratedMessageV3) assetCache).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            AssetCache assetCache = null;
            try {
                try {
                    AssetCache assetCache2 = (AssetCache) AssetCache.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (assetCache2 != null) {
                        mergeFrom(assetCache2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    AssetCache assetCache3 = (AssetCache) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        assetCache = assetCache3;
                        if (assetCache != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (assetCache != null) {
                    mergeFrom(assetCache);
                }
                throw th;
            }
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

    public static AssetCache getDefaultInstance() {
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
    public AssetCache mo3244getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
