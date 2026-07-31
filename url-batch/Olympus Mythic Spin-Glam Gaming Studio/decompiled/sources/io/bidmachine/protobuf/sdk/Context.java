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
import com.explorestack.protobuf.SingleFieldBuilderV3;
import com.explorestack.protobuf.UnknownFieldSet;
import io.bidmachine.protobuf.sdk.App;
import io.bidmachine.protobuf.sdk.Device;
import io.bidmachine.protobuf.sdk.Regs;
import io.bidmachine.protobuf.sdk.SDK;
import io.bidmachine.protobuf.sdk.Session;
import io.bidmachine.protobuf.sdk.User;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes15.dex */
public final class Context extends GeneratedMessageV3 implements ContextOrBuilder {
    public static final int APP_FIELD_NUMBER = 2;
    public static final int DEVICE_FIELD_NUMBER = 4;
    public static final int REGS_FIELD_NUMBER = 6;
    public static final int SDK_FIELD_NUMBER = 1;
    public static final int SESSION_FIELD_NUMBER = 5;
    public static final int USER_FIELD_NUMBER = 3;
    private static final long serialVersionUID = 0;
    private App app_;
    private Device device_;
    private byte memoizedIsInitialized;
    private Regs regs_;
    private SDK sdk_;
    private Session session_;
    private User user_;
    private static final Context DEFAULT_INSTANCE = new Context();
    private static final Parser PARSER = new AbstractParser() { // from class: io.bidmachine.protobuf.sdk.Context.1
        @Override // com.explorestack.protobuf.Parser
        public Context parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new Context(codedInputStream, extensionRegistryLite);
        }
    };

    private Context(GeneratedMessageV3.Builder builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private Context() {
        this.memoizedIsInitialized = (byte) -1;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new Context();
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private Context(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                            SDK sdk = this.sdk_;
                            SDK.Builder builder = sdk != null ? sdk.toBuilder() : null;
                            SDK sdk2 = (SDK) codedInputStream.readMessage(SDK.parser(), extensionRegistryLite);
                            this.sdk_ = sdk2;
                            if (builder != null) {
                                builder.mergeFrom(sdk2);
                                this.sdk_ = builder.buildPartial();
                            }
                        } else if (readTag == 18) {
                            App app = this.app_;
                            App.Builder builder2 = app != null ? app.toBuilder() : null;
                            App app2 = (App) codedInputStream.readMessage(App.parser(), extensionRegistryLite);
                            this.app_ = app2;
                            if (builder2 != null) {
                                builder2.mergeFrom(app2);
                                this.app_ = builder2.buildPartial();
                            }
                        } else if (readTag == 26) {
                            User user = this.user_;
                            User.Builder builder3 = user != null ? user.toBuilder() : null;
                            User user2 = (User) codedInputStream.readMessage(User.parser(), extensionRegistryLite);
                            this.user_ = user2;
                            if (builder3 != null) {
                                builder3.mergeFrom(user2);
                                this.user_ = builder3.buildPartial();
                            }
                        } else if (readTag == 34) {
                            Device device = this.device_;
                            Device.Builder builder4 = device != null ? device.toBuilder() : null;
                            Device device2 = (Device) codedInputStream.readMessage(Device.parser(), extensionRegistryLite);
                            this.device_ = device2;
                            if (builder4 != null) {
                                builder4.mergeFrom(device2);
                                this.device_ = builder4.buildPartial();
                            }
                        } else if (readTag == 42) {
                            Session session = this.session_;
                            Session.Builder builder5 = session != null ? session.toBuilder() : null;
                            Session session2 = (Session) codedInputStream.readMessage(Session.parser(), extensionRegistryLite);
                            this.session_ = session2;
                            if (builder5 != null) {
                                builder5.mergeFrom(session2);
                                this.session_ = builder5.buildPartial();
                            }
                        } else if (readTag == 50) {
                            Regs regs = this.regs_;
                            Regs.Builder builder6 = regs != null ? regs.toBuilder() : null;
                            Regs regs2 = (Regs) codedInputStream.readMessage(Regs.parser(), extensionRegistryLite);
                            this.regs_ = regs2;
                            if (builder6 != null) {
                                builder6.mergeFrom(regs2);
                                this.regs_ = builder6.buildPartial();
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
        return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Context_descriptor;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Context_fieldAccessorTable.ensureFieldAccessorsInitialized(Context.class, Builder.class);
    }

    @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
    public boolean hasSdk() {
        return this.sdk_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
    public SDK getSdk() {
        SDK sdk = this.sdk_;
        return sdk == null ? SDK.getDefaultInstance() : sdk;
    }

    @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
    public SDKOrBuilder getSdkOrBuilder() {
        return getSdk();
    }

    @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
    public boolean hasApp() {
        return this.app_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
    public App getApp() {
        App app = this.app_;
        return app == null ? App.getDefaultInstance() : app;
    }

    @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
    public AppOrBuilder getAppOrBuilder() {
        return getApp();
    }

    @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
    public boolean hasUser() {
        return this.user_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
    public User getUser() {
        User user = this.user_;
        return user == null ? User.getDefaultInstance() : user;
    }

    @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
    public UserOrBuilder getUserOrBuilder() {
        return getUser();
    }

    @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
    public boolean hasDevice() {
        return this.device_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
    public Device getDevice() {
        Device device = this.device_;
        return device == null ? Device.getDefaultInstance() : device;
    }

    @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
    public DeviceOrBuilder getDeviceOrBuilder() {
        return getDevice();
    }

    @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
    public boolean hasSession() {
        return this.session_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
    public Session getSession() {
        Session session = this.session_;
        return session == null ? Session.getDefaultInstance() : session;
    }

    @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
    public SessionOrBuilder getSessionOrBuilder() {
        return getSession();
    }

    @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
    public boolean hasRegs() {
        return this.regs_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
    public Regs getRegs() {
        Regs regs = this.regs_;
        return regs == null ? Regs.getDefaultInstance() : regs;
    }

    @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
    public RegsOrBuilder getRegsOrBuilder() {
        return getRegs();
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
        if (this.sdk_ != null) {
            codedOutputStream.writeMessage(1, getSdk());
        }
        if (this.app_ != null) {
            codedOutputStream.writeMessage(2, getApp());
        }
        if (this.user_ != null) {
            codedOutputStream.writeMessage(3, getUser());
        }
        if (this.device_ != null) {
            codedOutputStream.writeMessage(4, getDevice());
        }
        if (this.session_ != null) {
            codedOutputStream.writeMessage(5, getSession());
        }
        if (this.regs_ != null) {
            codedOutputStream.writeMessage(6, getRegs());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int computeMessageSize = this.sdk_ != null ? CodedOutputStream.computeMessageSize(1, getSdk()) : 0;
        if (this.app_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(2, getApp());
        }
        if (this.user_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(3, getUser());
        }
        if (this.device_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(4, getDevice());
        }
        if (this.session_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(5, getSession());
        }
        if (this.regs_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(6, getRegs());
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
        if (!(obj instanceof Context)) {
            return super.equals(obj);
        }
        Context context = (Context) obj;
        if (hasSdk() != context.hasSdk()) {
            return false;
        }
        if ((hasSdk() && !getSdk().equals(context.getSdk())) || hasApp() != context.hasApp()) {
            return false;
        }
        if ((hasApp() && !getApp().equals(context.getApp())) || hasUser() != context.hasUser()) {
            return false;
        }
        if ((hasUser() && !getUser().equals(context.getUser())) || hasDevice() != context.hasDevice()) {
            return false;
        }
        if ((hasDevice() && !getDevice().equals(context.getDevice())) || hasSession() != context.hasSession()) {
            return false;
        }
        if ((!hasSession() || getSession().equals(context.getSession())) && hasRegs() == context.hasRegs()) {
            return (!hasRegs() || getRegs().equals(context.getRegs())) && this.unknownFields.equals(context.unknownFields);
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
        if (hasSdk()) {
            hashCode = (((hashCode * 37) + 1) * 53) + getSdk().hashCode();
        }
        if (hasApp()) {
            hashCode = (((hashCode * 37) + 2) * 53) + getApp().hashCode();
        }
        if (hasUser()) {
            hashCode = (((hashCode * 37) + 3) * 53) + getUser().hashCode();
        }
        if (hasDevice()) {
            hashCode = (((hashCode * 37) + 4) * 53) + getDevice().hashCode();
        }
        if (hasSession()) {
            hashCode = (((hashCode * 37) + 5) * 53) + getSession().hashCode();
        }
        if (hasRegs()) {
            hashCode = (((hashCode * 37) + 6) * 53) + getRegs().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public static Context parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Context) PARSER.parseFrom(byteBuffer);
    }

    public static Context parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Context) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static Context parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Context) PARSER.parseFrom(byteString);
    }

    public static Context parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Context) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static Context parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Context) PARSER.parseFrom(bArr);
    }

    public static Context parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Context) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static Context parseFrom(InputStream inputStream) throws IOException {
        return (Context) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static Context parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Context) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Context parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Context) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Context parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Context) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Context parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Context) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static Context parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Context) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Context context) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(context);
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

    public static final class Builder extends GeneratedMessageV3.Builder implements ContextOrBuilder {
        private SingleFieldBuilderV3 appBuilder_;
        private App app_;
        private SingleFieldBuilderV3 deviceBuilder_;
        private Device device_;
        private SingleFieldBuilderV3 regsBuilder_;
        private Regs regs_;
        private SingleFieldBuilderV3 sdkBuilder_;
        private SDK sdk_;
        private SingleFieldBuilderV3 sessionBuilder_;
        private Session session_;
        private SingleFieldBuilderV3 userBuilder_;
        private User user_;

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Context_descriptor;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Context_fieldAccessorTable.ensureFieldAccessorsInitialized(Context.class, Builder.class);
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
            if (this.sdkBuilder_ == null) {
                this.sdk_ = null;
            } else {
                this.sdk_ = null;
                this.sdkBuilder_ = null;
            }
            if (this.appBuilder_ == null) {
                this.app_ = null;
            } else {
                this.app_ = null;
                this.appBuilder_ = null;
            }
            if (this.userBuilder_ == null) {
                this.user_ = null;
            } else {
                this.user_ = null;
                this.userBuilder_ = null;
            }
            if (this.deviceBuilder_ == null) {
                this.device_ = null;
            } else {
                this.device_ = null;
                this.deviceBuilder_ = null;
            }
            if (this.sessionBuilder_ == null) {
                this.session_ = null;
            } else {
                this.session_ = null;
                this.sessionBuilder_ = null;
            }
            if (this.regsBuilder_ == null) {
                this.regs_ = null;
            } else {
                this.regs_ = null;
                this.regsBuilder_ = null;
            }
            return this;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Context_descriptor;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* renamed from: getDefaultInstanceForType */
        public Context mo3244getDefaultInstanceForType() {
            return Context.getDefaultInstance();
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Context build() {
            Context buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Context buildPartial() {
            Context context = new Context(this);
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.sdkBuilder_;
            if (singleFieldBuilderV3 == null) {
                context.sdk_ = this.sdk_;
            } else {
                context.sdk_ = (SDK) singleFieldBuilderV3.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV32 = this.appBuilder_;
            if (singleFieldBuilderV32 == null) {
                context.app_ = this.app_;
            } else {
                context.app_ = (App) singleFieldBuilderV32.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV33 = this.userBuilder_;
            if (singleFieldBuilderV33 == null) {
                context.user_ = this.user_;
            } else {
                context.user_ = (User) singleFieldBuilderV33.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV34 = this.deviceBuilder_;
            if (singleFieldBuilderV34 == null) {
                context.device_ = this.device_;
            } else {
                context.device_ = (Device) singleFieldBuilderV34.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV35 = this.sessionBuilder_;
            if (singleFieldBuilderV35 == null) {
                context.session_ = this.session_;
            } else {
                context.session_ = (Session) singleFieldBuilderV35.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV36 = this.regsBuilder_;
            if (singleFieldBuilderV36 == null) {
                context.regs_ = this.regs_;
            } else {
                context.regs_ = (Regs) singleFieldBuilderV36.build();
            }
            onBuilt();
            return context;
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
            if (message instanceof Context) {
                return mergeFrom((Context) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Context context) {
            if (context == Context.getDefaultInstance()) {
                return this;
            }
            if (context.hasSdk()) {
                mergeSdk(context.getSdk());
            }
            if (context.hasApp()) {
                mergeApp(context.getApp());
            }
            if (context.hasUser()) {
                mergeUser(context.getUser());
            }
            if (context.hasDevice()) {
                mergeDevice(context.getDevice());
            }
            if (context.hasSession()) {
                mergeSession(context.getSession());
            }
            if (context.hasRegs()) {
                mergeRegs(context.getRegs());
            }
            mergeUnknownFields(((GeneratedMessageV3) context).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            Context context = null;
            try {
                try {
                    Context context2 = (Context) Context.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (context2 != null) {
                        mergeFrom(context2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    Context context3 = (Context) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        context = context3;
                        if (context != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (context != null) {
                    mergeFrom(context);
                }
                throw th;
            }
        }

        @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
        public boolean hasSdk() {
            return (this.sdkBuilder_ == null && this.sdk_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
        public SDK getSdk() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.sdkBuilder_;
            if (singleFieldBuilderV3 == null) {
                SDK sdk = this.sdk_;
                return sdk == null ? SDK.getDefaultInstance() : sdk;
            }
            return (SDK) singleFieldBuilderV3.getMessage();
        }

        public Builder setSdk(SDK sdk) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.sdkBuilder_;
            if (singleFieldBuilderV3 == null) {
                sdk.getClass();
                this.sdk_ = sdk;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(sdk);
            }
            return this;
        }

        public Builder setSdk(SDK.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.sdkBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.sdk_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeSdk(SDK sdk) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.sdkBuilder_;
            if (singleFieldBuilderV3 == null) {
                SDK sdk2 = this.sdk_;
                if (sdk2 != null) {
                    this.sdk_ = SDK.newBuilder(sdk2).mergeFrom(sdk).buildPartial();
                } else {
                    this.sdk_ = sdk;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(sdk);
            }
            return this;
        }

        public Builder clearSdk() {
            if (this.sdkBuilder_ == null) {
                this.sdk_ = null;
                onChanged();
            } else {
                this.sdk_ = null;
                this.sdkBuilder_ = null;
            }
            return this;
        }

        public SDK.Builder getSdkBuilder() {
            onChanged();
            return (SDK.Builder) getSdkFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
        public SDKOrBuilder getSdkOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.sdkBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (SDKOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            SDK sdk = this.sdk_;
            return sdk == null ? SDK.getDefaultInstance() : sdk;
        }

        private SingleFieldBuilderV3 getSdkFieldBuilder() {
            if (this.sdkBuilder_ == null) {
                this.sdkBuilder_ = new SingleFieldBuilderV3(getSdk(), getParentForChildren(), isClean());
                this.sdk_ = null;
            }
            return this.sdkBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
        public boolean hasApp() {
            return (this.appBuilder_ == null && this.app_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
        public App getApp() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.appBuilder_;
            if (singleFieldBuilderV3 == null) {
                App app = this.app_;
                return app == null ? App.getDefaultInstance() : app;
            }
            return (App) singleFieldBuilderV3.getMessage();
        }

        public Builder setApp(App app) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.appBuilder_;
            if (singleFieldBuilderV3 == null) {
                app.getClass();
                this.app_ = app;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(app);
            }
            return this;
        }

        public Builder setApp(App.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.appBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.app_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeApp(App app) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.appBuilder_;
            if (singleFieldBuilderV3 == null) {
                App app2 = this.app_;
                if (app2 != null) {
                    this.app_ = App.newBuilder(app2).mergeFrom(app).buildPartial();
                } else {
                    this.app_ = app;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(app);
            }
            return this;
        }

        public Builder clearApp() {
            if (this.appBuilder_ == null) {
                this.app_ = null;
                onChanged();
            } else {
                this.app_ = null;
                this.appBuilder_ = null;
            }
            return this;
        }

        public App.Builder getAppBuilder() {
            onChanged();
            return (App.Builder) getAppFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
        public AppOrBuilder getAppOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.appBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (AppOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            App app = this.app_;
            return app == null ? App.getDefaultInstance() : app;
        }

        private SingleFieldBuilderV3 getAppFieldBuilder() {
            if (this.appBuilder_ == null) {
                this.appBuilder_ = new SingleFieldBuilderV3(getApp(), getParentForChildren(), isClean());
                this.app_ = null;
            }
            return this.appBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
        public boolean hasUser() {
            return (this.userBuilder_ == null && this.user_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
        public User getUser() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.userBuilder_;
            if (singleFieldBuilderV3 == null) {
                User user = this.user_;
                return user == null ? User.getDefaultInstance() : user;
            }
            return (User) singleFieldBuilderV3.getMessage();
        }

        public Builder setUser(User user) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.userBuilder_;
            if (singleFieldBuilderV3 == null) {
                user.getClass();
                this.user_ = user;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(user);
            }
            return this;
        }

        public Builder setUser(User.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.userBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.user_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeUser(User user) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.userBuilder_;
            if (singleFieldBuilderV3 == null) {
                User user2 = this.user_;
                if (user2 != null) {
                    this.user_ = User.newBuilder(user2).mergeFrom(user).buildPartial();
                } else {
                    this.user_ = user;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(user);
            }
            return this;
        }

        public Builder clearUser() {
            if (this.userBuilder_ == null) {
                this.user_ = null;
                onChanged();
            } else {
                this.user_ = null;
                this.userBuilder_ = null;
            }
            return this;
        }

        public User.Builder getUserBuilder() {
            onChanged();
            return (User.Builder) getUserFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
        public UserOrBuilder getUserOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.userBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (UserOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            User user = this.user_;
            return user == null ? User.getDefaultInstance() : user;
        }

        private SingleFieldBuilderV3 getUserFieldBuilder() {
            if (this.userBuilder_ == null) {
                this.userBuilder_ = new SingleFieldBuilderV3(getUser(), getParentForChildren(), isClean());
                this.user_ = null;
            }
            return this.userBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
        public boolean hasDevice() {
            return (this.deviceBuilder_ == null && this.device_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
        public Device getDevice() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.deviceBuilder_;
            if (singleFieldBuilderV3 == null) {
                Device device = this.device_;
                return device == null ? Device.getDefaultInstance() : device;
            }
            return (Device) singleFieldBuilderV3.getMessage();
        }

        public Builder setDevice(Device device) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.deviceBuilder_;
            if (singleFieldBuilderV3 == null) {
                device.getClass();
                this.device_ = device;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(device);
            }
            return this;
        }

        public Builder setDevice(Device.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.deviceBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.device_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeDevice(Device device) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.deviceBuilder_;
            if (singleFieldBuilderV3 == null) {
                Device device2 = this.device_;
                if (device2 != null) {
                    this.device_ = Device.newBuilder(device2).mergeFrom(device).buildPartial();
                } else {
                    this.device_ = device;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(device);
            }
            return this;
        }

        public Builder clearDevice() {
            if (this.deviceBuilder_ == null) {
                this.device_ = null;
                onChanged();
            } else {
                this.device_ = null;
                this.deviceBuilder_ = null;
            }
            return this;
        }

        public Device.Builder getDeviceBuilder() {
            onChanged();
            return (Device.Builder) getDeviceFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
        public DeviceOrBuilder getDeviceOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.deviceBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (DeviceOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            Device device = this.device_;
            return device == null ? Device.getDefaultInstance() : device;
        }

        private SingleFieldBuilderV3 getDeviceFieldBuilder() {
            if (this.deviceBuilder_ == null) {
                this.deviceBuilder_ = new SingleFieldBuilderV3(getDevice(), getParentForChildren(), isClean());
                this.device_ = null;
            }
            return this.deviceBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
        public boolean hasSession() {
            return (this.sessionBuilder_ == null && this.session_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
        public Session getSession() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.sessionBuilder_;
            if (singleFieldBuilderV3 == null) {
                Session session = this.session_;
                return session == null ? Session.getDefaultInstance() : session;
            }
            return (Session) singleFieldBuilderV3.getMessage();
        }

        public Builder setSession(Session session) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.sessionBuilder_;
            if (singleFieldBuilderV3 == null) {
                session.getClass();
                this.session_ = session;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(session);
            }
            return this;
        }

        public Builder setSession(Session.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.sessionBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.session_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeSession(Session session) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.sessionBuilder_;
            if (singleFieldBuilderV3 == null) {
                Session session2 = this.session_;
                if (session2 != null) {
                    this.session_ = Session.newBuilder(session2).mergeFrom(session).buildPartial();
                } else {
                    this.session_ = session;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(session);
            }
            return this;
        }

        public Builder clearSession() {
            if (this.sessionBuilder_ == null) {
                this.session_ = null;
                onChanged();
            } else {
                this.session_ = null;
                this.sessionBuilder_ = null;
            }
            return this;
        }

        public Session.Builder getSessionBuilder() {
            onChanged();
            return (Session.Builder) getSessionFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
        public SessionOrBuilder getSessionOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.sessionBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (SessionOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            Session session = this.session_;
            return session == null ? Session.getDefaultInstance() : session;
        }

        private SingleFieldBuilderV3 getSessionFieldBuilder() {
            if (this.sessionBuilder_ == null) {
                this.sessionBuilder_ = new SingleFieldBuilderV3(getSession(), getParentForChildren(), isClean());
                this.session_ = null;
            }
            return this.sessionBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
        public boolean hasRegs() {
            return (this.regsBuilder_ == null && this.regs_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
        public Regs getRegs() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.regsBuilder_;
            if (singleFieldBuilderV3 == null) {
                Regs regs = this.regs_;
                return regs == null ? Regs.getDefaultInstance() : regs;
            }
            return (Regs) singleFieldBuilderV3.getMessage();
        }

        public Builder setRegs(Regs regs) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.regsBuilder_;
            if (singleFieldBuilderV3 == null) {
                regs.getClass();
                this.regs_ = regs;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(regs);
            }
            return this;
        }

        public Builder setRegs(Regs.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.regsBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.regs_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeRegs(Regs regs) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.regsBuilder_;
            if (singleFieldBuilderV3 == null) {
                Regs regs2 = this.regs_;
                if (regs2 != null) {
                    this.regs_ = Regs.newBuilder(regs2).mergeFrom(regs).buildPartial();
                } else {
                    this.regs_ = regs;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(regs);
            }
            return this;
        }

        public Builder clearRegs() {
            if (this.regsBuilder_ == null) {
                this.regs_ = null;
                onChanged();
            } else {
                this.regs_ = null;
                this.regsBuilder_ = null;
            }
            return this;
        }

        public Regs.Builder getRegsBuilder() {
            onChanged();
            return (Regs.Builder) getRegsFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
        public RegsOrBuilder getRegsOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.regsBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (RegsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            Regs regs = this.regs_;
            return regs == null ? Regs.getDefaultInstance() : regs;
        }

        private SingleFieldBuilderV3 getRegsFieldBuilder() {
            if (this.regsBuilder_ == null) {
                this.regsBuilder_ = new SingleFieldBuilderV3(getRegs(), getParentForChildren(), isClean());
                this.regs_ = null;
            }
            return this.regsBuilder_;
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

    public static Context getDefaultInstance() {
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
    public Context mo3244getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
