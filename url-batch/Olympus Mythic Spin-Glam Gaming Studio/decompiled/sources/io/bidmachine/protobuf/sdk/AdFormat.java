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
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Parser;
import com.explorestack.protobuf.SingleFieldBuilderV3;
import com.explorestack.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
public final class AdFormat extends GeneratedMessageV3 implements AdFormatOrBuilder {
    public static final int BANNER_FIELD_NUMBER = 1;
    public static final int INTERSTITIAL_FIELD_NUMBER = 4;
    public static final int NATIVE_FIELD_NUMBER = 2;
    public static final int REWARDED_FIELD_NUMBER = 3;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private int specCase_;
    private Object spec_;
    private static final AdFormat DEFAULT_INSTANCE = new AdFormat();
    private static final Parser PARSER = new AbstractParser() { // from class: io.bidmachine.protobuf.sdk.AdFormat.1
        @Override // com.explorestack.protobuf.Parser
        public AdFormat parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new AdFormat(codedInputStream, extensionRegistryLite);
        }
    };

    public interface BannerOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo3244getDefaultInstanceForType();

        int getHeight();

        boolean getIsAdaptive();

        int getWidth();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public interface InterstitialOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo3244getDefaultInstanceForType();

        boolean getHasBanner();

        boolean getHasVideo();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public interface NativeOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo3244getDefaultInstanceForType();

        boolean getHasIcon();

        boolean getHasImage();

        boolean getHasVideo();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public interface RewardedOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo3244getDefaultInstanceForType();

        boolean getHasBanner();

        boolean getHasVideo();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    private AdFormat(GeneratedMessageV3.Builder builder) {
        super(builder);
        this.specCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    private AdFormat() {
        this.specCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new AdFormat();
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private AdFormat(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                            Banner.Builder builder = this.specCase_ == 1 ? ((Banner) this.spec_).toBuilder() : null;
                            MessageLite readMessage = codedInputStream.readMessage(Banner.parser(), extensionRegistryLite);
                            this.spec_ = readMessage;
                            if (builder != null) {
                                builder.mergeFrom((Banner) readMessage);
                                this.spec_ = builder.buildPartial();
                            }
                            this.specCase_ = 1;
                        } else if (readTag == 18) {
                            Native.Builder builder2 = this.specCase_ == 2 ? ((Native) this.spec_).toBuilder() : null;
                            MessageLite readMessage2 = codedInputStream.readMessage(Native.parser(), extensionRegistryLite);
                            this.spec_ = readMessage2;
                            if (builder2 != null) {
                                builder2.mergeFrom((Native) readMessage2);
                                this.spec_ = builder2.buildPartial();
                            }
                            this.specCase_ = 2;
                        } else if (readTag == 26) {
                            Rewarded.Builder builder3 = this.specCase_ == 3 ? ((Rewarded) this.spec_).toBuilder() : null;
                            MessageLite readMessage3 = codedInputStream.readMessage(Rewarded.parser(), extensionRegistryLite);
                            this.spec_ = readMessage3;
                            if (builder3 != null) {
                                builder3.mergeFrom((Rewarded) readMessage3);
                                this.spec_ = builder3.buildPartial();
                            }
                            this.specCase_ = 3;
                        } else if (readTag == 34) {
                            Interstitial.Builder builder4 = this.specCase_ == 4 ? ((Interstitial) this.spec_).toBuilder() : null;
                            MessageLite readMessage4 = codedInputStream.readMessage(Interstitial.parser(), extensionRegistryLite);
                            this.spec_ = readMessage4;
                            if (builder4 != null) {
                                builder4.mergeFrom((Interstitial) readMessage4);
                                this.spec_ = builder4.buildPartial();
                            }
                            this.specCase_ = 4;
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
        return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_descriptor;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_fieldAccessorTable.ensureFieldAccessorsInitialized(AdFormat.class, Builder.class);
    }

    public static final class Banner extends GeneratedMessageV3 implements BannerOrBuilder {
        public static final int HEIGHT_FIELD_NUMBER = 2;
        public static final int IS_ADAPTIVE_FIELD_NUMBER = 3;
        public static final int WIDTH_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int height_;
        private boolean isAdaptive_;
        private byte memoizedIsInitialized;
        private int width_;
        private static final Banner DEFAULT_INSTANCE = new Banner();
        private static final Parser PARSER = new AbstractParser() { // from class: io.bidmachine.protobuf.sdk.AdFormat.Banner.1
            @Override // com.explorestack.protobuf.Parser
            public Banner parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Banner(codedInputStream, extensionRegistryLite);
            }
        };

        private Banner(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        private Banner() {
            this.memoizedIsInitialized = (byte) -1;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Banner();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private Banner(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.width_ = codedInputStream.readUInt32();
                            } else if (readTag == 16) {
                                this.height_ = codedInputStream.readUInt32();
                            } else if (readTag == 24) {
                                this.isAdaptive_ = codedInputStream.readBool();
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
            return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Banner_descriptor;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Banner_fieldAccessorTable.ensureFieldAccessorsInitialized(Banner.class, Builder.class);
        }

        @Override // io.bidmachine.protobuf.sdk.AdFormat.BannerOrBuilder
        public int getWidth() {
            return this.width_;
        }

        @Override // io.bidmachine.protobuf.sdk.AdFormat.BannerOrBuilder
        public int getHeight() {
            return this.height_;
        }

        @Override // io.bidmachine.protobuf.sdk.AdFormat.BannerOrBuilder
        public boolean getIsAdaptive() {
            return this.isAdaptive_;
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
            int i = this.width_;
            if (i != 0) {
                codedOutputStream.writeUInt32(1, i);
            }
            int i2 = this.height_;
            if (i2 != 0) {
                codedOutputStream.writeUInt32(2, i2);
            }
            boolean z = this.isAdaptive_;
            if (z) {
                codedOutputStream.writeBool(3, z);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.width_;
            int computeUInt32Size = i2 != 0 ? CodedOutputStream.computeUInt32Size(1, i2) : 0;
            int i3 = this.height_;
            if (i3 != 0) {
                computeUInt32Size += CodedOutputStream.computeUInt32Size(2, i3);
            }
            boolean z = this.isAdaptive_;
            if (z) {
                computeUInt32Size += CodedOutputStream.computeBoolSize(3, z);
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
            if (!(obj instanceof Banner)) {
                return super.equals(obj);
            }
            Banner banner = (Banner) obj;
            return getWidth() == banner.getWidth() && getHeight() == banner.getHeight() && getIsAdaptive() == banner.getIsAdaptive() && this.unknownFields.equals(banner.unknownFields);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = ((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getWidth()) * 37) + 2) * 53) + getHeight()) * 37) + 3) * 53) + Internal.hashBoolean(getIsAdaptive())) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        public static Banner parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Banner) PARSER.parseFrom(byteBuffer);
        }

        public static Banner parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Banner) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Banner parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Banner) PARSER.parseFrom(byteString);
        }

        public static Banner parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Banner) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Banner parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Banner) PARSER.parseFrom(bArr);
        }

        public static Banner parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Banner) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Banner parseFrom(InputStream inputStream) throws IOException {
            return (Banner) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Banner parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Banner) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Banner parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Banner) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Banner parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Banner) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Banner parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Banner) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Banner parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Banner) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(Banner banner) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(banner);
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

        public static final class Builder extends GeneratedMessageV3.Builder implements BannerOrBuilder {
            private int height_;
            private boolean isAdaptive_;
            private int width_;

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Banner_descriptor;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Banner_fieldAccessorTable.ensureFieldAccessorsInitialized(Banner.class, Builder.class);
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
                this.width_ = 0;
                this.height_ = 0;
                this.isAdaptive_ = false;
                return this;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Banner_descriptor;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* renamed from: getDefaultInstanceForType */
            public Banner mo3244getDefaultInstanceForType() {
                return Banner.getDefaultInstance();
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Banner build() {
                Banner buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Banner buildPartial() {
                Banner banner = new Banner(this);
                banner.width_ = this.width_;
                banner.height_ = this.height_;
                banner.isAdaptive_ = this.isAdaptive_;
                onBuilt();
                return banner;
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
                if (message instanceof Banner) {
                    return mergeFrom((Banner) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Banner banner) {
                if (banner == Banner.getDefaultInstance()) {
                    return this;
                }
                if (banner.getWidth() != 0) {
                    setWidth(banner.getWidth());
                }
                if (banner.getHeight() != 0) {
                    setHeight(banner.getHeight());
                }
                if (banner.getIsAdaptive()) {
                    setIsAdaptive(banner.getIsAdaptive());
                }
                mergeUnknownFields(((GeneratedMessageV3) banner).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                Banner banner = null;
                try {
                    try {
                        Banner banner2 = (Banner) Banner.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (banner2 != null) {
                            mergeFrom(banner2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Banner banner3 = (Banner) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            banner = banner3;
                            if (banner != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (banner != null) {
                        mergeFrom(banner);
                    }
                    throw th;
                }
            }

            @Override // io.bidmachine.protobuf.sdk.AdFormat.BannerOrBuilder
            public int getWidth() {
                return this.width_;
            }

            public Builder setWidth(int i) {
                this.width_ = i;
                onChanged();
                return this;
            }

            public Builder clearWidth() {
                this.width_ = 0;
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.sdk.AdFormat.BannerOrBuilder
            public int getHeight() {
                return this.height_;
            }

            public Builder setHeight(int i) {
                this.height_ = i;
                onChanged();
                return this;
            }

            public Builder clearHeight() {
                this.height_ = 0;
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.sdk.AdFormat.BannerOrBuilder
            public boolean getIsAdaptive() {
                return this.isAdaptive_;
            }

            public Builder setIsAdaptive(boolean z) {
                this.isAdaptive_ = z;
                onChanged();
                return this;
            }

            public Builder clearIsAdaptive() {
                this.isAdaptive_ = false;
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

        public static Banner getDefaultInstance() {
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
        public Banner mo3244getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class Native extends GeneratedMessageV3 implements NativeOrBuilder {
        public static final int HAS_ICON_FIELD_NUMBER = 1;
        public static final int HAS_IMAGE_FIELD_NUMBER = 2;
        public static final int HAS_VIDEO_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private boolean hasIcon_;
        private boolean hasImage_;
        private boolean hasVideo_;
        private byte memoizedIsInitialized;
        private static final Native DEFAULT_INSTANCE = new Native();
        private static final Parser PARSER = new AbstractParser() { // from class: io.bidmachine.protobuf.sdk.AdFormat.Native.1
            @Override // com.explorestack.protobuf.Parser
            public Native parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Native(codedInputStream, extensionRegistryLite);
            }
        };

        private Native(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        private Native() {
            this.memoizedIsInitialized = (byte) -1;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Native();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private Native(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.hasIcon_ = codedInputStream.readBool();
                            } else if (readTag == 16) {
                                this.hasImage_ = codedInputStream.readBool();
                            } else if (readTag == 24) {
                                this.hasVideo_ = codedInputStream.readBool();
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
            return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Native_descriptor;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Native_fieldAccessorTable.ensureFieldAccessorsInitialized(Native.class, Builder.class);
        }

        @Override // io.bidmachine.protobuf.sdk.AdFormat.NativeOrBuilder
        public boolean getHasIcon() {
            return this.hasIcon_;
        }

        @Override // io.bidmachine.protobuf.sdk.AdFormat.NativeOrBuilder
        public boolean getHasImage() {
            return this.hasImage_;
        }

        @Override // io.bidmachine.protobuf.sdk.AdFormat.NativeOrBuilder
        public boolean getHasVideo() {
            return this.hasVideo_;
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
            boolean z = this.hasIcon_;
            if (z) {
                codedOutputStream.writeBool(1, z);
            }
            boolean z2 = this.hasImage_;
            if (z2) {
                codedOutputStream.writeBool(2, z2);
            }
            boolean z3 = this.hasVideo_;
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
            boolean z = this.hasIcon_;
            int computeBoolSize = z ? CodedOutputStream.computeBoolSize(1, z) : 0;
            boolean z2 = this.hasImage_;
            if (z2) {
                computeBoolSize += CodedOutputStream.computeBoolSize(2, z2);
            }
            boolean z3 = this.hasVideo_;
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
            if (!(obj instanceof Native)) {
                return super.equals(obj);
            }
            Native r5 = (Native) obj;
            return getHasIcon() == r5.getHasIcon() && getHasImage() == r5.getHasImage() && getHasVideo() == r5.getHasVideo() && this.unknownFields.equals(r5.unknownFields);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = ((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Internal.hashBoolean(getHasIcon())) * 37) + 2) * 53) + Internal.hashBoolean(getHasImage())) * 37) + 3) * 53) + Internal.hashBoolean(getHasVideo())) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        public static Native parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Native) PARSER.parseFrom(byteBuffer);
        }

        public static Native parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Native) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Native parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Native) PARSER.parseFrom(byteString);
        }

        public static Native parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Native) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Native parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Native) PARSER.parseFrom(bArr);
        }

        public static Native parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Native) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Native parseFrom(InputStream inputStream) throws IOException {
            return (Native) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Native parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Native) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Native parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Native) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Native parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Native) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Native parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Native) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Native parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Native) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(Native r1) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(r1);
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

        public static final class Builder extends GeneratedMessageV3.Builder implements NativeOrBuilder {
            private boolean hasIcon_;
            private boolean hasImage_;
            private boolean hasVideo_;

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Native_descriptor;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Native_fieldAccessorTable.ensureFieldAccessorsInitialized(Native.class, Builder.class);
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
                this.hasIcon_ = false;
                this.hasImage_ = false;
                this.hasVideo_ = false;
                return this;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Native_descriptor;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* renamed from: getDefaultInstanceForType */
            public Native mo3244getDefaultInstanceForType() {
                return Native.getDefaultInstance();
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Native build() {
                Native buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Native buildPartial() {
                Native r0 = new Native(this);
                r0.hasIcon_ = this.hasIcon_;
                r0.hasImage_ = this.hasImage_;
                r0.hasVideo_ = this.hasVideo_;
                onBuilt();
                return r0;
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
                if (message instanceof Native) {
                    return mergeFrom((Native) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Native r2) {
                if (r2 == Native.getDefaultInstance()) {
                    return this;
                }
                if (r2.getHasIcon()) {
                    setHasIcon(r2.getHasIcon());
                }
                if (r2.getHasImage()) {
                    setHasImage(r2.getHasImage());
                }
                if (r2.getHasVideo()) {
                    setHasVideo(r2.getHasVideo());
                }
                mergeUnknownFields(((GeneratedMessageV3) r2).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                Native r0 = null;
                try {
                    try {
                        Native r3 = (Native) Native.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (r3 != null) {
                            mergeFrom(r3);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Native r4 = (Native) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            r0 = r4;
                            if (r0 != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (r0 != null) {
                        mergeFrom(r0);
                    }
                    throw th;
                }
            }

            @Override // io.bidmachine.protobuf.sdk.AdFormat.NativeOrBuilder
            public boolean getHasIcon() {
                return this.hasIcon_;
            }

            public Builder setHasIcon(boolean z) {
                this.hasIcon_ = z;
                onChanged();
                return this;
            }

            public Builder clearHasIcon() {
                this.hasIcon_ = false;
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.sdk.AdFormat.NativeOrBuilder
            public boolean getHasImage() {
                return this.hasImage_;
            }

            public Builder setHasImage(boolean z) {
                this.hasImage_ = z;
                onChanged();
                return this;
            }

            public Builder clearHasImage() {
                this.hasImage_ = false;
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.sdk.AdFormat.NativeOrBuilder
            public boolean getHasVideo() {
                return this.hasVideo_;
            }

            public Builder setHasVideo(boolean z) {
                this.hasVideo_ = z;
                onChanged();
                return this;
            }

            public Builder clearHasVideo() {
                this.hasVideo_ = false;
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

        public static Native getDefaultInstance() {
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
        public Native mo3244getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class Rewarded extends GeneratedMessageV3 implements RewardedOrBuilder {
        public static final int HAS_BANNER_FIELD_NUMBER = 1;
        public static final int HAS_VIDEO_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private boolean hasBanner_;
        private boolean hasVideo_;
        private byte memoizedIsInitialized;
        private static final Rewarded DEFAULT_INSTANCE = new Rewarded();
        private static final Parser PARSER = new AbstractParser() { // from class: io.bidmachine.protobuf.sdk.AdFormat.Rewarded.1
            @Override // com.explorestack.protobuf.Parser
            public Rewarded parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Rewarded(codedInputStream, extensionRegistryLite);
            }
        };

        private Rewarded(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        private Rewarded() {
            this.memoizedIsInitialized = (byte) -1;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Rewarded();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private Rewarded(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.hasBanner_ = codedInputStream.readBool();
                            } else if (readTag == 16) {
                                this.hasVideo_ = codedInputStream.readBool();
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
            return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Rewarded_descriptor;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Rewarded_fieldAccessorTable.ensureFieldAccessorsInitialized(Rewarded.class, Builder.class);
        }

        @Override // io.bidmachine.protobuf.sdk.AdFormat.RewardedOrBuilder
        public boolean getHasBanner() {
            return this.hasBanner_;
        }

        @Override // io.bidmachine.protobuf.sdk.AdFormat.RewardedOrBuilder
        public boolean getHasVideo() {
            return this.hasVideo_;
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
            boolean z = this.hasBanner_;
            if (z) {
                codedOutputStream.writeBool(1, z);
            }
            boolean z2 = this.hasVideo_;
            if (z2) {
                codedOutputStream.writeBool(2, z2);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            boolean z = this.hasBanner_;
            int computeBoolSize = z ? CodedOutputStream.computeBoolSize(1, z) : 0;
            boolean z2 = this.hasVideo_;
            if (z2) {
                computeBoolSize += CodedOutputStream.computeBoolSize(2, z2);
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
            if (!(obj instanceof Rewarded)) {
                return super.equals(obj);
            }
            Rewarded rewarded = (Rewarded) obj;
            return getHasBanner() == rewarded.getHasBanner() && getHasVideo() == rewarded.getHasVideo() && this.unknownFields.equals(rewarded.unknownFields);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Internal.hashBoolean(getHasBanner())) * 37) + 2) * 53) + Internal.hashBoolean(getHasVideo())) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        public static Rewarded parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Rewarded) PARSER.parseFrom(byteBuffer);
        }

        public static Rewarded parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Rewarded) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Rewarded parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Rewarded) PARSER.parseFrom(byteString);
        }

        public static Rewarded parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Rewarded) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Rewarded parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Rewarded) PARSER.parseFrom(bArr);
        }

        public static Rewarded parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Rewarded) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Rewarded parseFrom(InputStream inputStream) throws IOException {
            return (Rewarded) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Rewarded parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Rewarded) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Rewarded parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Rewarded) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Rewarded parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Rewarded) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Rewarded parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Rewarded) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Rewarded parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Rewarded) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(Rewarded rewarded) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(rewarded);
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

        public static final class Builder extends GeneratedMessageV3.Builder implements RewardedOrBuilder {
            private boolean hasBanner_;
            private boolean hasVideo_;

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Rewarded_descriptor;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Rewarded_fieldAccessorTable.ensureFieldAccessorsInitialized(Rewarded.class, Builder.class);
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
                this.hasBanner_ = false;
                this.hasVideo_ = false;
                return this;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Rewarded_descriptor;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* renamed from: getDefaultInstanceForType */
            public Rewarded mo3244getDefaultInstanceForType() {
                return Rewarded.getDefaultInstance();
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Rewarded build() {
                Rewarded buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Rewarded buildPartial() {
                Rewarded rewarded = new Rewarded(this);
                rewarded.hasBanner_ = this.hasBanner_;
                rewarded.hasVideo_ = this.hasVideo_;
                onBuilt();
                return rewarded;
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
                if (message instanceof Rewarded) {
                    return mergeFrom((Rewarded) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Rewarded rewarded) {
                if (rewarded == Rewarded.getDefaultInstance()) {
                    return this;
                }
                if (rewarded.getHasBanner()) {
                    setHasBanner(rewarded.getHasBanner());
                }
                if (rewarded.getHasVideo()) {
                    setHasVideo(rewarded.getHasVideo());
                }
                mergeUnknownFields(((GeneratedMessageV3) rewarded).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                Rewarded rewarded = null;
                try {
                    try {
                        Rewarded rewarded2 = (Rewarded) Rewarded.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (rewarded2 != null) {
                            mergeFrom(rewarded2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Rewarded rewarded3 = (Rewarded) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            rewarded = rewarded3;
                            if (rewarded != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (rewarded != null) {
                        mergeFrom(rewarded);
                    }
                    throw th;
                }
            }

            @Override // io.bidmachine.protobuf.sdk.AdFormat.RewardedOrBuilder
            public boolean getHasBanner() {
                return this.hasBanner_;
            }

            public Builder setHasBanner(boolean z) {
                this.hasBanner_ = z;
                onChanged();
                return this;
            }

            public Builder clearHasBanner() {
                this.hasBanner_ = false;
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.sdk.AdFormat.RewardedOrBuilder
            public boolean getHasVideo() {
                return this.hasVideo_;
            }

            public Builder setHasVideo(boolean z) {
                this.hasVideo_ = z;
                onChanged();
                return this;
            }

            public Builder clearHasVideo() {
                this.hasVideo_ = false;
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

        public static Rewarded getDefaultInstance() {
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
        public Rewarded mo3244getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class Interstitial extends GeneratedMessageV3 implements InterstitialOrBuilder {
        public static final int HAS_BANNER_FIELD_NUMBER = 1;
        public static final int HAS_VIDEO_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private boolean hasBanner_;
        private boolean hasVideo_;
        private byte memoizedIsInitialized;
        private static final Interstitial DEFAULT_INSTANCE = new Interstitial();
        private static final Parser PARSER = new AbstractParser() { // from class: io.bidmachine.protobuf.sdk.AdFormat.Interstitial.1
            @Override // com.explorestack.protobuf.Parser
            public Interstitial parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Interstitial(codedInputStream, extensionRegistryLite);
            }
        };

        private Interstitial(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        private Interstitial() {
            this.memoizedIsInitialized = (byte) -1;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Interstitial();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private Interstitial(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.hasBanner_ = codedInputStream.readBool();
                            } else if (readTag == 16) {
                                this.hasVideo_ = codedInputStream.readBool();
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
            return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Interstitial_descriptor;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Interstitial_fieldAccessorTable.ensureFieldAccessorsInitialized(Interstitial.class, Builder.class);
        }

        @Override // io.bidmachine.protobuf.sdk.AdFormat.InterstitialOrBuilder
        public boolean getHasBanner() {
            return this.hasBanner_;
        }

        @Override // io.bidmachine.protobuf.sdk.AdFormat.InterstitialOrBuilder
        public boolean getHasVideo() {
            return this.hasVideo_;
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
            boolean z = this.hasBanner_;
            if (z) {
                codedOutputStream.writeBool(1, z);
            }
            boolean z2 = this.hasVideo_;
            if (z2) {
                codedOutputStream.writeBool(2, z2);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            boolean z = this.hasBanner_;
            int computeBoolSize = z ? CodedOutputStream.computeBoolSize(1, z) : 0;
            boolean z2 = this.hasVideo_;
            if (z2) {
                computeBoolSize += CodedOutputStream.computeBoolSize(2, z2);
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
            if (!(obj instanceof Interstitial)) {
                return super.equals(obj);
            }
            Interstitial interstitial = (Interstitial) obj;
            return getHasBanner() == interstitial.getHasBanner() && getHasVideo() == interstitial.getHasVideo() && this.unknownFields.equals(interstitial.unknownFields);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Internal.hashBoolean(getHasBanner())) * 37) + 2) * 53) + Internal.hashBoolean(getHasVideo())) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        public static Interstitial parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Interstitial) PARSER.parseFrom(byteBuffer);
        }

        public static Interstitial parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Interstitial) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Interstitial parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Interstitial) PARSER.parseFrom(byteString);
        }

        public static Interstitial parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Interstitial) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Interstitial parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Interstitial) PARSER.parseFrom(bArr);
        }

        public static Interstitial parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Interstitial) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Interstitial parseFrom(InputStream inputStream) throws IOException {
            return (Interstitial) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Interstitial parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Interstitial) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Interstitial parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Interstitial) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Interstitial parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Interstitial) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Interstitial parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Interstitial) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Interstitial parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Interstitial) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(Interstitial interstitial) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(interstitial);
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

        public static final class Builder extends GeneratedMessageV3.Builder implements InterstitialOrBuilder {
            private boolean hasBanner_;
            private boolean hasVideo_;

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Interstitial_descriptor;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Interstitial_fieldAccessorTable.ensureFieldAccessorsInitialized(Interstitial.class, Builder.class);
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
                this.hasBanner_ = false;
                this.hasVideo_ = false;
                return this;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Interstitial_descriptor;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* renamed from: getDefaultInstanceForType */
            public Interstitial mo3244getDefaultInstanceForType() {
                return Interstitial.getDefaultInstance();
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Interstitial build() {
                Interstitial buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Interstitial buildPartial() {
                Interstitial interstitial = new Interstitial(this);
                interstitial.hasBanner_ = this.hasBanner_;
                interstitial.hasVideo_ = this.hasVideo_;
                onBuilt();
                return interstitial;
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
                if (message instanceof Interstitial) {
                    return mergeFrom((Interstitial) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Interstitial interstitial) {
                if (interstitial == Interstitial.getDefaultInstance()) {
                    return this;
                }
                if (interstitial.getHasBanner()) {
                    setHasBanner(interstitial.getHasBanner());
                }
                if (interstitial.getHasVideo()) {
                    setHasVideo(interstitial.getHasVideo());
                }
                mergeUnknownFields(((GeneratedMessageV3) interstitial).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                Interstitial interstitial = null;
                try {
                    try {
                        Interstitial interstitial2 = (Interstitial) Interstitial.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (interstitial2 != null) {
                            mergeFrom(interstitial2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Interstitial interstitial3 = (Interstitial) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            interstitial = interstitial3;
                            if (interstitial != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (interstitial != null) {
                        mergeFrom(interstitial);
                    }
                    throw th;
                }
            }

            @Override // io.bidmachine.protobuf.sdk.AdFormat.InterstitialOrBuilder
            public boolean getHasBanner() {
                return this.hasBanner_;
            }

            public Builder setHasBanner(boolean z) {
                this.hasBanner_ = z;
                onChanged();
                return this;
            }

            public Builder clearHasBanner() {
                this.hasBanner_ = false;
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.sdk.AdFormat.InterstitialOrBuilder
            public boolean getHasVideo() {
                return this.hasVideo_;
            }

            public Builder setHasVideo(boolean z) {
                this.hasVideo_ = z;
                onChanged();
                return this;
            }

            public Builder clearHasVideo() {
                this.hasVideo_ = false;
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

        public static Interstitial getDefaultInstance() {
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
        public Interstitial mo3244getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public enum SpecCase implements Internal.EnumLite {
        BANNER(1),
        NATIVE(2),
        REWARDED(3),
        INTERSTITIAL(4),
        SPEC_NOT_SET(0);

        private final int value;

        SpecCase(int i) {
            this.value = i;
        }

        @Deprecated
        public static SpecCase valueOf(int i) {
            return forNumber(i);
        }

        public static SpecCase forNumber(int i) {
            if (i == 0) {
                return SPEC_NOT_SET;
            }
            if (i == 1) {
                return BANNER;
            }
            if (i == 2) {
                return NATIVE;
            }
            if (i == 3) {
                return REWARDED;
            }
            if (i != 4) {
                return null;
            }
            return INTERSTITIAL;
        }

        @Override // com.explorestack.protobuf.Internal.EnumLite
        public int getNumber() {
            return this.value;
        }
    }

    @Override // io.bidmachine.protobuf.sdk.AdFormatOrBuilder
    public SpecCase getSpecCase() {
        return SpecCase.forNumber(this.specCase_);
    }

    @Override // io.bidmachine.protobuf.sdk.AdFormatOrBuilder
    public boolean hasBanner() {
        return this.specCase_ == 1;
    }

    @Override // io.bidmachine.protobuf.sdk.AdFormatOrBuilder
    public Banner getBanner() {
        if (this.specCase_ == 1) {
            return (Banner) this.spec_;
        }
        return Banner.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.sdk.AdFormatOrBuilder
    public BannerOrBuilder getBannerOrBuilder() {
        if (this.specCase_ == 1) {
            return (Banner) this.spec_;
        }
        return Banner.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.sdk.AdFormatOrBuilder
    public boolean hasNative() {
        return this.specCase_ == 2;
    }

    @Override // io.bidmachine.protobuf.sdk.AdFormatOrBuilder
    public Native getNative() {
        if (this.specCase_ == 2) {
            return (Native) this.spec_;
        }
        return Native.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.sdk.AdFormatOrBuilder
    public NativeOrBuilder getNativeOrBuilder() {
        if (this.specCase_ == 2) {
            return (Native) this.spec_;
        }
        return Native.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.sdk.AdFormatOrBuilder
    public boolean hasRewarded() {
        return this.specCase_ == 3;
    }

    @Override // io.bidmachine.protobuf.sdk.AdFormatOrBuilder
    public Rewarded getRewarded() {
        if (this.specCase_ == 3) {
            return (Rewarded) this.spec_;
        }
        return Rewarded.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.sdk.AdFormatOrBuilder
    public RewardedOrBuilder getRewardedOrBuilder() {
        if (this.specCase_ == 3) {
            return (Rewarded) this.spec_;
        }
        return Rewarded.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.sdk.AdFormatOrBuilder
    public boolean hasInterstitial() {
        return this.specCase_ == 4;
    }

    @Override // io.bidmachine.protobuf.sdk.AdFormatOrBuilder
    public Interstitial getInterstitial() {
        if (this.specCase_ == 4) {
            return (Interstitial) this.spec_;
        }
        return Interstitial.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.sdk.AdFormatOrBuilder
    public InterstitialOrBuilder getInterstitialOrBuilder() {
        if (this.specCase_ == 4) {
            return (Interstitial) this.spec_;
        }
        return Interstitial.getDefaultInstance();
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
        if (this.specCase_ == 1) {
            codedOutputStream.writeMessage(1, (Banner) this.spec_);
        }
        if (this.specCase_ == 2) {
            codedOutputStream.writeMessage(2, (Native) this.spec_);
        }
        if (this.specCase_ == 3) {
            codedOutputStream.writeMessage(3, (Rewarded) this.spec_);
        }
        if (this.specCase_ == 4) {
            codedOutputStream.writeMessage(4, (Interstitial) this.spec_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int computeMessageSize = this.specCase_ == 1 ? CodedOutputStream.computeMessageSize(1, (Banner) this.spec_) : 0;
        if (this.specCase_ == 2) {
            computeMessageSize += CodedOutputStream.computeMessageSize(2, (Native) this.spec_);
        }
        if (this.specCase_ == 3) {
            computeMessageSize += CodedOutputStream.computeMessageSize(3, (Rewarded) this.spec_);
        }
        if (this.specCase_ == 4) {
            computeMessageSize += CodedOutputStream.computeMessageSize(4, (Interstitial) this.spec_);
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
        if (!(obj instanceof AdFormat)) {
            return super.equals(obj);
        }
        AdFormat adFormat = (AdFormat) obj;
        if (!getSpecCase().equals(adFormat.getSpecCase())) {
            return false;
        }
        int i = this.specCase_;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    if (!getRewarded().equals(adFormat.getRewarded())) {
                        return false;
                    }
                } else if (i == 4 && !getInterstitial().equals(adFormat.getInterstitial())) {
                    return false;
                }
            } else if (!getNative().equals(adFormat.getNative())) {
                return false;
            }
        } else if (!getBanner().equals(adFormat.getBanner())) {
            return false;
        }
        return this.unknownFields.equals(adFormat.unknownFields);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i;
        int hashCode;
        int i2 = this.memoizedHashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode2 = 779 + getDescriptor().hashCode();
        int i3 = this.specCase_;
        if (i3 == 1) {
            i = ((hashCode2 * 37) + 1) * 53;
            hashCode = getBanner().hashCode();
        } else if (i3 == 2) {
            i = ((hashCode2 * 37) + 2) * 53;
            hashCode = getNative().hashCode();
        } else if (i3 == 3) {
            i = ((hashCode2 * 37) + 3) * 53;
            hashCode = getRewarded().hashCode();
        } else {
            if (i3 == 4) {
                i = ((hashCode2 * 37) + 4) * 53;
                hashCode = getInterstitial().hashCode();
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

    public static AdFormat parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AdFormat) PARSER.parseFrom(byteBuffer);
    }

    public static AdFormat parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AdFormat) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static AdFormat parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AdFormat) PARSER.parseFrom(byteString);
    }

    public static AdFormat parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AdFormat) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static AdFormat parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AdFormat) PARSER.parseFrom(bArr);
    }

    public static AdFormat parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AdFormat) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static AdFormat parseFrom(InputStream inputStream) throws IOException {
        return (AdFormat) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static AdFormat parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AdFormat) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static AdFormat parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AdFormat) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static AdFormat parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AdFormat) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static AdFormat parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AdFormat) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static AdFormat parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AdFormat) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(AdFormat adFormat) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(adFormat);
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

    public static final class Builder extends GeneratedMessageV3.Builder implements AdFormatOrBuilder {
        private SingleFieldBuilderV3 bannerBuilder_;
        private SingleFieldBuilderV3 interstitialBuilder_;
        private SingleFieldBuilderV3 nativeBuilder_;
        private SingleFieldBuilderV3 rewardedBuilder_;
        private int specCase_;
        private Object spec_;

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_descriptor;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_fieldAccessorTable.ensureFieldAccessorsInitialized(AdFormat.class, Builder.class);
        }

        private Builder() {
            this.specCase_ = 0;
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.specCase_ = 0;
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.specCase_ = 0;
            this.spec_ = null;
            return this;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_descriptor;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* renamed from: getDefaultInstanceForType */
        public AdFormat mo3244getDefaultInstanceForType() {
            return AdFormat.getDefaultInstance();
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public AdFormat build() {
            AdFormat buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public AdFormat buildPartial() {
            AdFormat adFormat = new AdFormat(this);
            if (this.specCase_ == 1) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.bannerBuilder_;
                if (singleFieldBuilderV3 == null) {
                    adFormat.spec_ = this.spec_;
                } else {
                    adFormat.spec_ = singleFieldBuilderV3.build();
                }
            }
            if (this.specCase_ == 2) {
                SingleFieldBuilderV3 singleFieldBuilderV32 = this.nativeBuilder_;
                if (singleFieldBuilderV32 == null) {
                    adFormat.spec_ = this.spec_;
                } else {
                    adFormat.spec_ = singleFieldBuilderV32.build();
                }
            }
            if (this.specCase_ == 3) {
                SingleFieldBuilderV3 singleFieldBuilderV33 = this.rewardedBuilder_;
                if (singleFieldBuilderV33 == null) {
                    adFormat.spec_ = this.spec_;
                } else {
                    adFormat.spec_ = singleFieldBuilderV33.build();
                }
            }
            if (this.specCase_ == 4) {
                SingleFieldBuilderV3 singleFieldBuilderV34 = this.interstitialBuilder_;
                if (singleFieldBuilderV34 == null) {
                    adFormat.spec_ = this.spec_;
                } else {
                    adFormat.spec_ = singleFieldBuilderV34.build();
                }
            }
            adFormat.specCase_ = this.specCase_;
            onBuilt();
            return adFormat;
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
            if (message instanceof AdFormat) {
                return mergeFrom((AdFormat) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(AdFormat adFormat) {
            if (adFormat == AdFormat.getDefaultInstance()) {
                return this;
            }
            int i = AnonymousClass2.$SwitchMap$io$bidmachine$protobuf$sdk$AdFormat$SpecCase[adFormat.getSpecCase().ordinal()];
            if (i == 1) {
                mergeBanner(adFormat.getBanner());
            } else if (i == 2) {
                mergeNative(adFormat.getNative());
            } else if (i == 3) {
                mergeRewarded(adFormat.getRewarded());
            } else if (i == 4) {
                mergeInterstitial(adFormat.getInterstitial());
            }
            mergeUnknownFields(((GeneratedMessageV3) adFormat).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            AdFormat adFormat = null;
            try {
                try {
                    AdFormat adFormat2 = (AdFormat) AdFormat.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (adFormat2 != null) {
                        mergeFrom(adFormat2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    AdFormat adFormat3 = (AdFormat) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        adFormat = adFormat3;
                        if (adFormat != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (adFormat != null) {
                    mergeFrom(adFormat);
                }
                throw th;
            }
        }

        @Override // io.bidmachine.protobuf.sdk.AdFormatOrBuilder
        public SpecCase getSpecCase() {
            return SpecCase.forNumber(this.specCase_);
        }

        public Builder clearSpec() {
            this.specCase_ = 0;
            this.spec_ = null;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.sdk.AdFormatOrBuilder
        public boolean hasBanner() {
            return this.specCase_ == 1;
        }

        @Override // io.bidmachine.protobuf.sdk.AdFormatOrBuilder
        public Banner getBanner() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.bannerBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.specCase_ == 1) {
                    return (Banner) this.spec_;
                }
                return Banner.getDefaultInstance();
            }
            if (this.specCase_ == 1) {
                return (Banner) singleFieldBuilderV3.getMessage();
            }
            return Banner.getDefaultInstance();
        }

        public Builder setBanner(Banner banner) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.bannerBuilder_;
            if (singleFieldBuilderV3 == null) {
                banner.getClass();
                this.spec_ = banner;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(banner);
            }
            this.specCase_ = 1;
            return this;
        }

        public Builder setBanner(Banner.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.bannerBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.spec_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.specCase_ = 1;
            return this;
        }

        public Builder mergeBanner(Banner banner) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.bannerBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.specCase_ == 1 && this.spec_ != Banner.getDefaultInstance()) {
                    this.spec_ = Banner.newBuilder((Banner) this.spec_).mergeFrom(banner).buildPartial();
                } else {
                    this.spec_ = banner;
                }
                onChanged();
            } else {
                if (this.specCase_ == 1) {
                    singleFieldBuilderV3.mergeFrom(banner);
                }
                this.bannerBuilder_.setMessage(banner);
            }
            this.specCase_ = 1;
            return this;
        }

        public Builder clearBanner() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.bannerBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.specCase_ == 1) {
                    this.specCase_ = 0;
                    this.spec_ = null;
                    onChanged();
                }
            } else {
                if (this.specCase_ == 1) {
                    this.specCase_ = 0;
                    this.spec_ = null;
                }
                singleFieldBuilderV3.clear();
            }
            return this;
        }

        public Banner.Builder getBannerBuilder() {
            return (Banner.Builder) getBannerFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.AdFormatOrBuilder
        public BannerOrBuilder getBannerOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3;
            int i = this.specCase_;
            if (i == 1 && (singleFieldBuilderV3 = this.bannerBuilder_) != null) {
                return (BannerOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            if (i == 1) {
                return (Banner) this.spec_;
            }
            return Banner.getDefaultInstance();
        }

        private SingleFieldBuilderV3 getBannerFieldBuilder() {
            if (this.bannerBuilder_ == null) {
                if (this.specCase_ != 1) {
                    this.spec_ = Banner.getDefaultInstance();
                }
                this.bannerBuilder_ = new SingleFieldBuilderV3((Banner) this.spec_, getParentForChildren(), isClean());
                this.spec_ = null;
            }
            this.specCase_ = 1;
            onChanged();
            return this.bannerBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.AdFormatOrBuilder
        public boolean hasNative() {
            return this.specCase_ == 2;
        }

        @Override // io.bidmachine.protobuf.sdk.AdFormatOrBuilder
        public Native getNative() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.nativeBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.specCase_ == 2) {
                    return (Native) this.spec_;
                }
                return Native.getDefaultInstance();
            }
            if (this.specCase_ == 2) {
                return (Native) singleFieldBuilderV3.getMessage();
            }
            return Native.getDefaultInstance();
        }

        public Builder setNative(Native r2) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.nativeBuilder_;
            if (singleFieldBuilderV3 == null) {
                r2.getClass();
                this.spec_ = r2;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(r2);
            }
            this.specCase_ = 2;
            return this;
        }

        public Builder setNative(Native.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.nativeBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.spec_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.specCase_ = 2;
            return this;
        }

        public Builder mergeNative(Native r4) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.nativeBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.specCase_ == 2 && this.spec_ != Native.getDefaultInstance()) {
                    this.spec_ = Native.newBuilder((Native) this.spec_).mergeFrom(r4).buildPartial();
                } else {
                    this.spec_ = r4;
                }
                onChanged();
            } else {
                if (this.specCase_ == 2) {
                    singleFieldBuilderV3.mergeFrom(r4);
                }
                this.nativeBuilder_.setMessage(r4);
            }
            this.specCase_ = 2;
            return this;
        }

        public Builder clearNative() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.nativeBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.specCase_ == 2) {
                    this.specCase_ = 0;
                    this.spec_ = null;
                    onChanged();
                }
            } else {
                if (this.specCase_ == 2) {
                    this.specCase_ = 0;
                    this.spec_ = null;
                }
                singleFieldBuilderV3.clear();
            }
            return this;
        }

        public Native.Builder getNativeBuilder() {
            return (Native.Builder) getNativeFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.AdFormatOrBuilder
        public NativeOrBuilder getNativeOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3;
            int i = this.specCase_;
            if (i == 2 && (singleFieldBuilderV3 = this.nativeBuilder_) != null) {
                return (NativeOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            if (i == 2) {
                return (Native) this.spec_;
            }
            return Native.getDefaultInstance();
        }

        private SingleFieldBuilderV3 getNativeFieldBuilder() {
            if (this.nativeBuilder_ == null) {
                if (this.specCase_ != 2) {
                    this.spec_ = Native.getDefaultInstance();
                }
                this.nativeBuilder_ = new SingleFieldBuilderV3((Native) this.spec_, getParentForChildren(), isClean());
                this.spec_ = null;
            }
            this.specCase_ = 2;
            onChanged();
            return this.nativeBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.AdFormatOrBuilder
        public boolean hasRewarded() {
            return this.specCase_ == 3;
        }

        @Override // io.bidmachine.protobuf.sdk.AdFormatOrBuilder
        public Rewarded getRewarded() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.rewardedBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.specCase_ == 3) {
                    return (Rewarded) this.spec_;
                }
                return Rewarded.getDefaultInstance();
            }
            if (this.specCase_ == 3) {
                return (Rewarded) singleFieldBuilderV3.getMessage();
            }
            return Rewarded.getDefaultInstance();
        }

        public Builder setRewarded(Rewarded rewarded) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.rewardedBuilder_;
            if (singleFieldBuilderV3 == null) {
                rewarded.getClass();
                this.spec_ = rewarded;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(rewarded);
            }
            this.specCase_ = 3;
            return this;
        }

        public Builder setRewarded(Rewarded.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.rewardedBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.spec_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.specCase_ = 3;
            return this;
        }

        public Builder mergeRewarded(Rewarded rewarded) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.rewardedBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.specCase_ == 3 && this.spec_ != Rewarded.getDefaultInstance()) {
                    this.spec_ = Rewarded.newBuilder((Rewarded) this.spec_).mergeFrom(rewarded).buildPartial();
                } else {
                    this.spec_ = rewarded;
                }
                onChanged();
            } else {
                if (this.specCase_ == 3) {
                    singleFieldBuilderV3.mergeFrom(rewarded);
                }
                this.rewardedBuilder_.setMessage(rewarded);
            }
            this.specCase_ = 3;
            return this;
        }

        public Builder clearRewarded() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.rewardedBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.specCase_ == 3) {
                    this.specCase_ = 0;
                    this.spec_ = null;
                    onChanged();
                }
            } else {
                if (this.specCase_ == 3) {
                    this.specCase_ = 0;
                    this.spec_ = null;
                }
                singleFieldBuilderV3.clear();
            }
            return this;
        }

        public Rewarded.Builder getRewardedBuilder() {
            return (Rewarded.Builder) getRewardedFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.AdFormatOrBuilder
        public RewardedOrBuilder getRewardedOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3;
            int i = this.specCase_;
            if (i == 3 && (singleFieldBuilderV3 = this.rewardedBuilder_) != null) {
                return (RewardedOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            if (i == 3) {
                return (Rewarded) this.spec_;
            }
            return Rewarded.getDefaultInstance();
        }

        private SingleFieldBuilderV3 getRewardedFieldBuilder() {
            if (this.rewardedBuilder_ == null) {
                if (this.specCase_ != 3) {
                    this.spec_ = Rewarded.getDefaultInstance();
                }
                this.rewardedBuilder_ = new SingleFieldBuilderV3((Rewarded) this.spec_, getParentForChildren(), isClean());
                this.spec_ = null;
            }
            this.specCase_ = 3;
            onChanged();
            return this.rewardedBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.AdFormatOrBuilder
        public boolean hasInterstitial() {
            return this.specCase_ == 4;
        }

        @Override // io.bidmachine.protobuf.sdk.AdFormatOrBuilder
        public Interstitial getInterstitial() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.interstitialBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.specCase_ == 4) {
                    return (Interstitial) this.spec_;
                }
                return Interstitial.getDefaultInstance();
            }
            if (this.specCase_ == 4) {
                return (Interstitial) singleFieldBuilderV3.getMessage();
            }
            return Interstitial.getDefaultInstance();
        }

        public Builder setInterstitial(Interstitial interstitial) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.interstitialBuilder_;
            if (singleFieldBuilderV3 == null) {
                interstitial.getClass();
                this.spec_ = interstitial;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(interstitial);
            }
            this.specCase_ = 4;
            return this;
        }

        public Builder setInterstitial(Interstitial.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.interstitialBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.spec_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.specCase_ = 4;
            return this;
        }

        public Builder mergeInterstitial(Interstitial interstitial) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.interstitialBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.specCase_ == 4 && this.spec_ != Interstitial.getDefaultInstance()) {
                    this.spec_ = Interstitial.newBuilder((Interstitial) this.spec_).mergeFrom(interstitial).buildPartial();
                } else {
                    this.spec_ = interstitial;
                }
                onChanged();
            } else {
                if (this.specCase_ == 4) {
                    singleFieldBuilderV3.mergeFrom(interstitial);
                }
                this.interstitialBuilder_.setMessage(interstitial);
            }
            this.specCase_ = 4;
            return this;
        }

        public Builder clearInterstitial() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.interstitialBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.specCase_ == 4) {
                    this.specCase_ = 0;
                    this.spec_ = null;
                    onChanged();
                }
            } else {
                if (this.specCase_ == 4) {
                    this.specCase_ = 0;
                    this.spec_ = null;
                }
                singleFieldBuilderV3.clear();
            }
            return this;
        }

        public Interstitial.Builder getInterstitialBuilder() {
            return (Interstitial.Builder) getInterstitialFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.AdFormatOrBuilder
        public InterstitialOrBuilder getInterstitialOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3;
            int i = this.specCase_;
            if (i == 4 && (singleFieldBuilderV3 = this.interstitialBuilder_) != null) {
                return (InterstitialOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            if (i == 4) {
                return (Interstitial) this.spec_;
            }
            return Interstitial.getDefaultInstance();
        }

        private SingleFieldBuilderV3 getInterstitialFieldBuilder() {
            if (this.interstitialBuilder_ == null) {
                if (this.specCase_ != 4) {
                    this.spec_ = Interstitial.getDefaultInstance();
                }
                this.interstitialBuilder_ = new SingleFieldBuilderV3((Interstitial) this.spec_, getParentForChildren(), isClean());
                this.spec_ = null;
            }
            this.specCase_ = 4;
            onChanged();
            return this.interstitialBuilder_;
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

    /* renamed from: io.bidmachine.protobuf.sdk.AdFormat$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$io$bidmachine$protobuf$sdk$AdFormat$SpecCase;

        static {
            int[] iArr = new int[SpecCase.values().length];
            $SwitchMap$io$bidmachine$protobuf$sdk$AdFormat$SpecCase = iArr;
            try {
                iArr[SpecCase.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$sdk$AdFormat$SpecCase[SpecCase.NATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$sdk$AdFormat$SpecCase[SpecCase.REWARDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$sdk$AdFormat$SpecCase[SpecCase.INTERSTITIAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$sdk$AdFormat$SpecCase[SpecCase.SPEC_NOT_SET.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static AdFormat getDefaultInstance() {
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
    public AdFormat mo3244getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
