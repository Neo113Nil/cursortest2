package io.bidmachine.protobuf.rendering;

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
import io.bidmachine.protobuf.rendering.Rendering;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes12.dex */
public final class RenderingTaskPermission extends GeneratedMessageV3 implements RenderingTaskPermissionOrBuilder {
    private static final RenderingTaskPermission DEFAULT_INSTANCE = new RenderingTaskPermission();
    private static final Parser PARSER = new AbstractParser() { // from class: io.bidmachine.protobuf.rendering.RenderingTaskPermission.1
        @Override // com.explorestack.protobuf.Parser
        public RenderingTaskPermission parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new RenderingTaskPermission(codedInputStream, extensionRegistryLite);
        }
    };
    public static final int REQUEST_FIELD_NUMBER = 1;
    public static final int RESPONSE_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private int payloadOneofCase_;
    private Object payloadOneof_;

    public interface RequestOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo3244getDefaultInstanceForType();

        Rendering.Phase.Event.EventName getEventName();

        int getEventNameValue();

        String getEventSource();

        ByteString getEventSourceBytes();

        Rendering.Phase.Event.Task getEventTasks(int i);

        int getEventTasksCount();

        List<Rendering.Phase.Event.Task> getEventTasksList();

        Rendering.Phase.Event.TaskOrBuilder getEventTasksOrBuilder(int i);

        List<? extends Rendering.Phase.Event.TaskOrBuilder> getEventTasksOrBuilderList();

        String getEventValue();

        ByteString getEventValueBytes();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public interface ResponseOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo3244getDefaultInstanceForType();

        Rendering.Phase.Event.Task getEventTasks(int i);

        int getEventTasksCount();

        List<Rendering.Phase.Event.Task> getEventTasksList();

        Rendering.Phase.Event.TaskOrBuilder getEventTasksOrBuilder(int i);

        List<? extends Rendering.Phase.Event.TaskOrBuilder> getEventTasksOrBuilderList();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    private RenderingTaskPermission(GeneratedMessageV3.Builder builder) {
        super(builder);
        this.payloadOneofCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    private RenderingTaskPermission() {
        this.payloadOneofCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new RenderingTaskPermission();
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private RenderingTaskPermission(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                            Request.Builder builder = this.payloadOneofCase_ == 1 ? ((Request) this.payloadOneof_).toBuilder() : null;
                            MessageLite readMessage = codedInputStream.readMessage(Request.parser(), extensionRegistryLite);
                            this.payloadOneof_ = readMessage;
                            if (builder != null) {
                                builder.mergeFrom((Request) readMessage);
                                this.payloadOneof_ = builder.buildPartial();
                            }
                            this.payloadOneofCase_ = 1;
                        } else if (readTag == 18) {
                            Response.Builder builder2 = this.payloadOneofCase_ == 2 ? ((Response) this.payloadOneof_).toBuilder() : null;
                            MessageLite readMessage2 = codedInputStream.readMessage(Response.parser(), extensionRegistryLite);
                            this.payloadOneof_ = readMessage2;
                            if (builder2 != null) {
                                builder2.mergeFrom((Response) readMessage2);
                                this.payloadOneof_ = builder2.buildPartial();
                            }
                            this.payloadOneofCase_ = 2;
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
        return TaskPermissionProto.internal_static_bidmachine_protobuf_RenderingTaskPermission_descriptor;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return TaskPermissionProto.internal_static_bidmachine_protobuf_RenderingTaskPermission_fieldAccessorTable.ensureFieldAccessorsInitialized(RenderingTaskPermission.class, Builder.class);
    }

    public static final class Request extends GeneratedMessageV3 implements RequestOrBuilder {
        public static final int EVENT_NAME_FIELD_NUMBER = 1;
        public static final int EVENT_SOURCE_FIELD_NUMBER = 2;
        public static final int EVENT_TASKS_FIELD_NUMBER = 4;
        public static final int EVENT_VALUE_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int eventName_;
        private volatile Object eventSource_;
        private List<Rendering.Phase.Event.Task> eventTasks_;
        private volatile Object eventValue_;
        private byte memoizedIsInitialized;
        private static final Request DEFAULT_INSTANCE = new Request();
        private static final Parser PARSER = new AbstractParser() { // from class: io.bidmachine.protobuf.rendering.RenderingTaskPermission.Request.1
            @Override // com.explorestack.protobuf.Parser
            public Request parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Request(codedInputStream, extensionRegistryLite);
            }
        };

        private Request(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        private Request() {
            this.memoizedIsInitialized = (byte) -1;
            this.eventName_ = 0;
            this.eventSource_ = "";
            this.eventValue_ = "";
            this.eventTasks_ = Collections.emptyList();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Request();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Request(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.eventName_ = codedInputStream.readEnum();
                            } else if (readTag == 18) {
                                this.eventSource_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 26) {
                                this.eventValue_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 34) {
                                if (!z2) {
                                    this.eventTasks_ = new ArrayList();
                                    z2 = true;
                                }
                                this.eventTasks_.add(codedInputStream.readMessage(Rendering.Phase.Event.Task.parser(), extensionRegistryLite));
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
                        this.eventTasks_ = Collections.unmodifiableList(this.eventTasks_);
                    }
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2) {
                this.eventTasks_ = Collections.unmodifiableList(this.eventTasks_);
            }
            this.unknownFields = newBuilder.build();
            makeExtensionsImmutable();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return TaskPermissionProto.internal_static_bidmachine_protobuf_RenderingTaskPermission_Request_descriptor;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TaskPermissionProto.internal_static_bidmachine_protobuf_RenderingTaskPermission_Request_fieldAccessorTable.ensureFieldAccessorsInitialized(Request.class, Builder.class);
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.RequestOrBuilder
        public int getEventNameValue() {
            return this.eventName_;
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.RequestOrBuilder
        public Rendering.Phase.Event.EventName getEventName() {
            Rendering.Phase.Event.EventName valueOf = Rendering.Phase.Event.EventName.valueOf(this.eventName_);
            return valueOf == null ? Rendering.Phase.Event.EventName.UNRECOGNIZED : valueOf;
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.RequestOrBuilder
        public String getEventSource() {
            Object obj = this.eventSource_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.eventSource_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.RequestOrBuilder
        public ByteString getEventSourceBytes() {
            Object obj = this.eventSource_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.eventSource_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.RequestOrBuilder
        public String getEventValue() {
            Object obj = this.eventValue_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.eventValue_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.RequestOrBuilder
        public ByteString getEventValueBytes() {
            Object obj = this.eventValue_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.eventValue_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.RequestOrBuilder
        public List<Rendering.Phase.Event.Task> getEventTasksList() {
            return this.eventTasks_;
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.RequestOrBuilder
        public List<? extends Rendering.Phase.Event.TaskOrBuilder> getEventTasksOrBuilderList() {
            return this.eventTasks_;
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.RequestOrBuilder
        public int getEventTasksCount() {
            return this.eventTasks_.size();
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.RequestOrBuilder
        public Rendering.Phase.Event.Task getEventTasks(int i) {
            return this.eventTasks_.get(i);
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.RequestOrBuilder
        public Rendering.Phase.Event.TaskOrBuilder getEventTasksOrBuilder(int i) {
            return this.eventTasks_.get(i);
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
            if (this.eventName_ != Rendering.Phase.Event.EventName.EVENT_NAME_INVALID.getNumber()) {
                codedOutputStream.writeEnum(1, this.eventName_);
            }
            if (!getEventSourceBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.eventSource_);
            }
            if (!getEventValueBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.eventValue_);
            }
            for (int i = 0; i < this.eventTasks_.size(); i++) {
                codedOutputStream.writeMessage(4, this.eventTasks_.get(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int computeEnumSize = this.eventName_ != Rendering.Phase.Event.EventName.EVENT_NAME_INVALID.getNumber() ? CodedOutputStream.computeEnumSize(1, this.eventName_) : 0;
            if (!getEventSourceBytes().isEmpty()) {
                computeEnumSize += GeneratedMessageV3.computeStringSize(2, this.eventSource_);
            }
            if (!getEventValueBytes().isEmpty()) {
                computeEnumSize += GeneratedMessageV3.computeStringSize(3, this.eventValue_);
            }
            for (int i2 = 0; i2 < this.eventTasks_.size(); i2++) {
                computeEnumSize += CodedOutputStream.computeMessageSize(4, this.eventTasks_.get(i2));
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
            if (!(obj instanceof Request)) {
                return super.equals(obj);
            }
            Request request = (Request) obj;
            return this.eventName_ == request.eventName_ && getEventSource().equals(request.getEventSource()) && getEventValue().equals(request.getEventValue()) && getEventTasksList().equals(request.getEventTasksList()) && this.unknownFields.equals(request.unknownFields);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = ((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.eventName_) * 37) + 2) * 53) + getEventSource().hashCode()) * 37) + 3) * 53) + getEventValue().hashCode();
            if (getEventTasksCount() > 0) {
                hashCode = (((hashCode * 37) + 4) * 53) + getEventTasksList().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public static Request parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Request) PARSER.parseFrom(byteBuffer);
        }

        public static Request parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Request) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Request parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Request) PARSER.parseFrom(byteString);
        }

        public static Request parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Request) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Request parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Request) PARSER.parseFrom(bArr);
        }

        public static Request parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Request) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Request parseFrom(InputStream inputStream) throws IOException {
            return (Request) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Request parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Request) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Request parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Request) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Request parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Request) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Request parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Request) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Request parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Request) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(Request request) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(request);
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

        public static final class Builder extends GeneratedMessageV3.Builder implements RequestOrBuilder {
            private int bitField0_;
            private int eventName_;
            private Object eventSource_;
            private RepeatedFieldBuilderV3 eventTasksBuilder_;
            private List<Rendering.Phase.Event.Task> eventTasks_;
            private Object eventValue_;

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return TaskPermissionProto.internal_static_bidmachine_protobuf_RenderingTaskPermission_Request_descriptor;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return TaskPermissionProto.internal_static_bidmachine_protobuf_RenderingTaskPermission_Request_fieldAccessorTable.ensureFieldAccessorsInitialized(Request.class, Builder.class);
            }

            private Builder() {
                this.eventName_ = 0;
                this.eventSource_ = "";
                this.eventValue_ = "";
                this.eventTasks_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.eventName_ = 0;
                this.eventSource_ = "";
                this.eventValue_ = "";
                this.eventTasks_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getEventTasksFieldBuilder();
                }
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.eventName_ = 0;
                this.eventSource_ = "";
                this.eventValue_ = "";
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.eventTasksBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.eventTasks_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return TaskPermissionProto.internal_static_bidmachine_protobuf_RenderingTaskPermission_Request_descriptor;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* renamed from: getDefaultInstanceForType */
            public Request mo3244getDefaultInstanceForType() {
                return Request.getDefaultInstance();
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Request build() {
                Request buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Request buildPartial() {
                Request request = new Request(this);
                request.eventName_ = this.eventName_;
                request.eventSource_ = this.eventSource_;
                request.eventValue_ = this.eventValue_;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.eventTasksBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    request.eventTasks_ = repeatedFieldBuilderV3.build();
                } else {
                    if ((this.bitField0_ & 1) != 0) {
                        this.eventTasks_ = Collections.unmodifiableList(this.eventTasks_);
                        this.bitField0_ &= -2;
                    }
                    request.eventTasks_ = this.eventTasks_;
                }
                onBuilt();
                return request;
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
                if (message instanceof Request) {
                    return mergeFrom((Request) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Request request) {
                if (request == Request.getDefaultInstance()) {
                    return this;
                }
                if (request.eventName_ != 0) {
                    setEventNameValue(request.getEventNameValue());
                }
                if (!request.getEventSource().isEmpty()) {
                    this.eventSource_ = request.eventSource_;
                    onChanged();
                }
                if (!request.getEventValue().isEmpty()) {
                    this.eventValue_ = request.eventValue_;
                    onChanged();
                }
                if (this.eventTasksBuilder_ == null) {
                    if (!request.eventTasks_.isEmpty()) {
                        if (this.eventTasks_.isEmpty()) {
                            this.eventTasks_ = request.eventTasks_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureEventTasksIsMutable();
                            this.eventTasks_.addAll(request.eventTasks_);
                        }
                        onChanged();
                    }
                } else if (!request.eventTasks_.isEmpty()) {
                    if (!this.eventTasksBuilder_.isEmpty()) {
                        this.eventTasksBuilder_.addAllMessages(request.eventTasks_);
                    } else {
                        this.eventTasksBuilder_.dispose();
                        this.eventTasksBuilder_ = null;
                        this.eventTasks_ = request.eventTasks_;
                        this.bitField0_ &= -2;
                        this.eventTasksBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getEventTasksFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((GeneratedMessageV3) request).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                Request request = null;
                try {
                    try {
                        Request request2 = (Request) Request.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (request2 != null) {
                            mergeFrom(request2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Request request3 = (Request) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            request = request3;
                            if (request != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (request != null) {
                        mergeFrom(request);
                    }
                    throw th;
                }
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.RequestOrBuilder
            public int getEventNameValue() {
                return this.eventName_;
            }

            public Builder setEventNameValue(int i) {
                this.eventName_ = i;
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.RequestOrBuilder
            public Rendering.Phase.Event.EventName getEventName() {
                Rendering.Phase.Event.EventName valueOf = Rendering.Phase.Event.EventName.valueOf(this.eventName_);
                return valueOf == null ? Rendering.Phase.Event.EventName.UNRECOGNIZED : valueOf;
            }

            public Builder setEventName(Rendering.Phase.Event.EventName eventName) {
                eventName.getClass();
                this.eventName_ = eventName.getNumber();
                onChanged();
                return this;
            }

            public Builder clearEventName() {
                this.eventName_ = 0;
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.RequestOrBuilder
            public String getEventSource() {
                Object obj = this.eventSource_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.eventSource_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.RequestOrBuilder
            public ByteString getEventSourceBytes() {
                Object obj = this.eventSource_;
                if (obj instanceof String) {
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.eventSource_ = copyFromUtf8;
                    return copyFromUtf8;
                }
                return (ByteString) obj;
            }

            public Builder setEventSource(String str) {
                str.getClass();
                this.eventSource_ = str;
                onChanged();
                return this;
            }

            public Builder clearEventSource() {
                this.eventSource_ = Request.getDefaultInstance().getEventSource();
                onChanged();
                return this;
            }

            public Builder setEventSourceBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.eventSource_ = byteString;
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.RequestOrBuilder
            public String getEventValue() {
                Object obj = this.eventValue_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.eventValue_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.RequestOrBuilder
            public ByteString getEventValueBytes() {
                Object obj = this.eventValue_;
                if (obj instanceof String) {
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.eventValue_ = copyFromUtf8;
                    return copyFromUtf8;
                }
                return (ByteString) obj;
            }

            public Builder setEventValue(String str) {
                str.getClass();
                this.eventValue_ = str;
                onChanged();
                return this;
            }

            public Builder clearEventValue() {
                this.eventValue_ = Request.getDefaultInstance().getEventValue();
                onChanged();
                return this;
            }

            public Builder setEventValueBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.eventValue_ = byteString;
                onChanged();
                return this;
            }

            private void ensureEventTasksIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.eventTasks_ = new ArrayList(this.eventTasks_);
                    this.bitField0_ |= 1;
                }
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.RequestOrBuilder
            public List<Rendering.Phase.Event.Task> getEventTasksList() {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.eventTasksBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return Collections.unmodifiableList(this.eventTasks_);
                }
                return repeatedFieldBuilderV3.getMessageList();
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.RequestOrBuilder
            public int getEventTasksCount() {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.eventTasksBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.eventTasks_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.RequestOrBuilder
            public Rendering.Phase.Event.Task getEventTasks(int i) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.eventTasksBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.eventTasks_.get(i);
                }
                return (Rendering.Phase.Event.Task) repeatedFieldBuilderV3.getMessage(i);
            }

            public Builder setEventTasks(int i, Rendering.Phase.Event.Task task) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.eventTasksBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    task.getClass();
                    ensureEventTasksIsMutable();
                    this.eventTasks_.set(i, task);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, task);
                }
                return this;
            }

            public Builder setEventTasks(int i, Rendering.Phase.Event.Task.Builder builder) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.eventTasksBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureEventTasksIsMutable();
                    this.eventTasks_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder addEventTasks(Rendering.Phase.Event.Task task) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.eventTasksBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    task.getClass();
                    ensureEventTasksIsMutable();
                    this.eventTasks_.add(task);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(task);
                }
                return this;
            }

            public Builder addEventTasks(int i, Rendering.Phase.Event.Task task) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.eventTasksBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    task.getClass();
                    ensureEventTasksIsMutable();
                    this.eventTasks_.add(i, task);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, task);
                }
                return this;
            }

            public Builder addEventTasks(Rendering.Phase.Event.Task.Builder builder) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.eventTasksBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureEventTasksIsMutable();
                    this.eventTasks_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                }
                return this;
            }

            public Builder addEventTasks(int i, Rendering.Phase.Event.Task.Builder builder) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.eventTasksBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureEventTasksIsMutable();
                    this.eventTasks_.add(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, builder.build());
                }
                return this;
            }

            public Builder addAllEventTasks(Iterable<? extends Rendering.Phase.Event.Task> iterable) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.eventTasksBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureEventTasksIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.eventTasks_);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                }
                return this;
            }

            public Builder clearEventTasks() {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.eventTasksBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.eventTasks_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Builder removeEventTasks(int i) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.eventTasksBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureEventTasksIsMutable();
                    this.eventTasks_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.remove(i);
                }
                return this;
            }

            public Rendering.Phase.Event.Task.Builder getEventTasksBuilder(int i) {
                return (Rendering.Phase.Event.Task.Builder) getEventTasksFieldBuilder().getBuilder(i);
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.RequestOrBuilder
            public Rendering.Phase.Event.TaskOrBuilder getEventTasksOrBuilder(int i) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.eventTasksBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.eventTasks_.get(i);
                }
                return (Rendering.Phase.Event.TaskOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i);
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.RequestOrBuilder
            public List<? extends Rendering.Phase.Event.TaskOrBuilder> getEventTasksOrBuilderList() {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.eventTasksBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    return repeatedFieldBuilderV3.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.eventTasks_);
            }

            public Rendering.Phase.Event.Task.Builder addEventTasksBuilder() {
                return (Rendering.Phase.Event.Task.Builder) getEventTasksFieldBuilder().addBuilder(Rendering.Phase.Event.Task.getDefaultInstance());
            }

            public Rendering.Phase.Event.Task.Builder addEventTasksBuilder(int i) {
                return (Rendering.Phase.Event.Task.Builder) getEventTasksFieldBuilder().addBuilder(i, Rendering.Phase.Event.Task.getDefaultInstance());
            }

            public List<Rendering.Phase.Event.Task.Builder> getEventTasksBuilderList() {
                return getEventTasksFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3 getEventTasksFieldBuilder() {
                if (this.eventTasksBuilder_ == null) {
                    this.eventTasksBuilder_ = new RepeatedFieldBuilderV3(this.eventTasks_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.eventTasks_ = null;
                }
                return this.eventTasksBuilder_;
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

        public static Request getDefaultInstance() {
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
        public Request mo3244getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class Response extends GeneratedMessageV3 implements ResponseOrBuilder {
        public static final int EVENT_TASKS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private List<Rendering.Phase.Event.Task> eventTasks_;
        private byte memoizedIsInitialized;
        private static final Response DEFAULT_INSTANCE = new Response();
        private static final Parser PARSER = new AbstractParser() { // from class: io.bidmachine.protobuf.rendering.RenderingTaskPermission.Response.1
            @Override // com.explorestack.protobuf.Parser
            public Response parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Response(codedInputStream, extensionRegistryLite);
            }
        };

        private Response(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        private Response() {
            this.memoizedIsInitialized = (byte) -1;
            this.eventTasks_ = Collections.emptyList();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Response();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Response(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                        this.eventTasks_ = new ArrayList();
                                        z2 = true;
                                    }
                                    this.eventTasks_.add(codedInputStream.readMessage(Rendering.Phase.Event.Task.parser(), extensionRegistryLite));
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
                        this.eventTasks_ = Collections.unmodifiableList(this.eventTasks_);
                    }
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2) {
                this.eventTasks_ = Collections.unmodifiableList(this.eventTasks_);
            }
            this.unknownFields = newBuilder.build();
            makeExtensionsImmutable();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return TaskPermissionProto.internal_static_bidmachine_protobuf_RenderingTaskPermission_Response_descriptor;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TaskPermissionProto.internal_static_bidmachine_protobuf_RenderingTaskPermission_Response_fieldAccessorTable.ensureFieldAccessorsInitialized(Response.class, Builder.class);
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.ResponseOrBuilder
        public List<Rendering.Phase.Event.Task> getEventTasksList() {
            return this.eventTasks_;
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.ResponseOrBuilder
        public List<? extends Rendering.Phase.Event.TaskOrBuilder> getEventTasksOrBuilderList() {
            return this.eventTasks_;
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.ResponseOrBuilder
        public int getEventTasksCount() {
            return this.eventTasks_.size();
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.ResponseOrBuilder
        public Rendering.Phase.Event.Task getEventTasks(int i) {
            return this.eventTasks_.get(i);
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.ResponseOrBuilder
        public Rendering.Phase.Event.TaskOrBuilder getEventTasksOrBuilder(int i) {
            return this.eventTasks_.get(i);
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
            for (int i = 0; i < this.eventTasks_.size(); i++) {
                codedOutputStream.writeMessage(1, this.eventTasks_.get(i));
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
            for (int i3 = 0; i3 < this.eventTasks_.size(); i3++) {
                i2 += CodedOutputStream.computeMessageSize(1, this.eventTasks_.get(i3));
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
            if (!(obj instanceof Response)) {
                return super.equals(obj);
            }
            Response response = (Response) obj;
            return getEventTasksList().equals(response.getEventTasksList()) && this.unknownFields.equals(response.unknownFields);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = 779 + getDescriptor().hashCode();
            if (getEventTasksCount() > 0) {
                hashCode = (((hashCode * 37) + 1) * 53) + getEventTasksList().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public static Response parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Response) PARSER.parseFrom(byteBuffer);
        }

        public static Response parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Response) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Response parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Response) PARSER.parseFrom(byteString);
        }

        public static Response parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Response) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Response parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Response) PARSER.parseFrom(bArr);
        }

        public static Response parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Response) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Response parseFrom(InputStream inputStream) throws IOException {
            return (Response) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Response parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Response) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Response parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Response) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Response parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Response) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Response parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Response) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Response parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Response) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(Response response) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(response);
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

        public static final class Builder extends GeneratedMessageV3.Builder implements ResponseOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3 eventTasksBuilder_;
            private List<Rendering.Phase.Event.Task> eventTasks_;

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return TaskPermissionProto.internal_static_bidmachine_protobuf_RenderingTaskPermission_Response_descriptor;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return TaskPermissionProto.internal_static_bidmachine_protobuf_RenderingTaskPermission_Response_fieldAccessorTable.ensureFieldAccessorsInitialized(Response.class, Builder.class);
            }

            private Builder() {
                this.eventTasks_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.eventTasks_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getEventTasksFieldBuilder();
                }
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.eventTasksBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.eventTasks_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return TaskPermissionProto.internal_static_bidmachine_protobuf_RenderingTaskPermission_Response_descriptor;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* renamed from: getDefaultInstanceForType */
            public Response mo3244getDefaultInstanceForType() {
                return Response.getDefaultInstance();
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Response build() {
                Response buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Response buildPartial() {
                Response response = new Response(this);
                int i = this.bitField0_;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.eventTasksBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    if ((i & 1) != 0) {
                        this.eventTasks_ = Collections.unmodifiableList(this.eventTasks_);
                        this.bitField0_ &= -2;
                    }
                    response.eventTasks_ = this.eventTasks_;
                } else {
                    response.eventTasks_ = repeatedFieldBuilderV3.build();
                }
                onBuilt();
                return response;
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
                if (message instanceof Response) {
                    return mergeFrom((Response) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Response response) {
                if (response == Response.getDefaultInstance()) {
                    return this;
                }
                if (this.eventTasksBuilder_ == null) {
                    if (!response.eventTasks_.isEmpty()) {
                        if (this.eventTasks_.isEmpty()) {
                            this.eventTasks_ = response.eventTasks_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureEventTasksIsMutable();
                            this.eventTasks_.addAll(response.eventTasks_);
                        }
                        onChanged();
                    }
                } else if (!response.eventTasks_.isEmpty()) {
                    if (!this.eventTasksBuilder_.isEmpty()) {
                        this.eventTasksBuilder_.addAllMessages(response.eventTasks_);
                    } else {
                        this.eventTasksBuilder_.dispose();
                        this.eventTasksBuilder_ = null;
                        this.eventTasks_ = response.eventTasks_;
                        this.bitField0_ &= -2;
                        this.eventTasksBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getEventTasksFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((GeneratedMessageV3) response).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                Response response = null;
                try {
                    try {
                        Response response2 = (Response) Response.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (response2 != null) {
                            mergeFrom(response2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Response response3 = (Response) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            response = response3;
                            if (response != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (response != null) {
                        mergeFrom(response);
                    }
                    throw th;
                }
            }

            private void ensureEventTasksIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.eventTasks_ = new ArrayList(this.eventTasks_);
                    this.bitField0_ |= 1;
                }
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.ResponseOrBuilder
            public List<Rendering.Phase.Event.Task> getEventTasksList() {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.eventTasksBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return Collections.unmodifiableList(this.eventTasks_);
                }
                return repeatedFieldBuilderV3.getMessageList();
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.ResponseOrBuilder
            public int getEventTasksCount() {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.eventTasksBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.eventTasks_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.ResponseOrBuilder
            public Rendering.Phase.Event.Task getEventTasks(int i) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.eventTasksBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.eventTasks_.get(i);
                }
                return (Rendering.Phase.Event.Task) repeatedFieldBuilderV3.getMessage(i);
            }

            public Builder setEventTasks(int i, Rendering.Phase.Event.Task task) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.eventTasksBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    task.getClass();
                    ensureEventTasksIsMutable();
                    this.eventTasks_.set(i, task);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, task);
                }
                return this;
            }

            public Builder setEventTasks(int i, Rendering.Phase.Event.Task.Builder builder) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.eventTasksBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureEventTasksIsMutable();
                    this.eventTasks_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder addEventTasks(Rendering.Phase.Event.Task task) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.eventTasksBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    task.getClass();
                    ensureEventTasksIsMutable();
                    this.eventTasks_.add(task);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(task);
                }
                return this;
            }

            public Builder addEventTasks(int i, Rendering.Phase.Event.Task task) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.eventTasksBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    task.getClass();
                    ensureEventTasksIsMutable();
                    this.eventTasks_.add(i, task);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, task);
                }
                return this;
            }

            public Builder addEventTasks(Rendering.Phase.Event.Task.Builder builder) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.eventTasksBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureEventTasksIsMutable();
                    this.eventTasks_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                }
                return this;
            }

            public Builder addEventTasks(int i, Rendering.Phase.Event.Task.Builder builder) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.eventTasksBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureEventTasksIsMutable();
                    this.eventTasks_.add(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, builder.build());
                }
                return this;
            }

            public Builder addAllEventTasks(Iterable<? extends Rendering.Phase.Event.Task> iterable) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.eventTasksBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureEventTasksIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.eventTasks_);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                }
                return this;
            }

            public Builder clearEventTasks() {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.eventTasksBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.eventTasks_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Builder removeEventTasks(int i) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.eventTasksBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureEventTasksIsMutable();
                    this.eventTasks_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.remove(i);
                }
                return this;
            }

            public Rendering.Phase.Event.Task.Builder getEventTasksBuilder(int i) {
                return (Rendering.Phase.Event.Task.Builder) getEventTasksFieldBuilder().getBuilder(i);
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.ResponseOrBuilder
            public Rendering.Phase.Event.TaskOrBuilder getEventTasksOrBuilder(int i) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.eventTasksBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.eventTasks_.get(i);
                }
                return (Rendering.Phase.Event.TaskOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i);
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.ResponseOrBuilder
            public List<? extends Rendering.Phase.Event.TaskOrBuilder> getEventTasksOrBuilderList() {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.eventTasksBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    return repeatedFieldBuilderV3.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.eventTasks_);
            }

            public Rendering.Phase.Event.Task.Builder addEventTasksBuilder() {
                return (Rendering.Phase.Event.Task.Builder) getEventTasksFieldBuilder().addBuilder(Rendering.Phase.Event.Task.getDefaultInstance());
            }

            public Rendering.Phase.Event.Task.Builder addEventTasksBuilder(int i) {
                return (Rendering.Phase.Event.Task.Builder) getEventTasksFieldBuilder().addBuilder(i, Rendering.Phase.Event.Task.getDefaultInstance());
            }

            public List<Rendering.Phase.Event.Task.Builder> getEventTasksBuilderList() {
                return getEventTasksFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3 getEventTasksFieldBuilder() {
                if (this.eventTasksBuilder_ == null) {
                    this.eventTasksBuilder_ = new RepeatedFieldBuilderV3(this.eventTasks_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.eventTasks_ = null;
                }
                return this.eventTasksBuilder_;
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

        public static Response getDefaultInstance() {
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
        public Response mo3244getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public enum PayloadOneofCase implements Internal.EnumLite {
        REQUEST(1),
        RESPONSE(2),
        PAYLOADONEOF_NOT_SET(0);

        private final int value;

        PayloadOneofCase(int i) {
            this.value = i;
        }

        @Deprecated
        public static PayloadOneofCase valueOf(int i) {
            return forNumber(i);
        }

        public static PayloadOneofCase forNumber(int i) {
            if (i == 0) {
                return PAYLOADONEOF_NOT_SET;
            }
            if (i == 1) {
                return REQUEST;
            }
            if (i != 2) {
                return null;
            }
            return RESPONSE;
        }

        @Override // com.explorestack.protobuf.Internal.EnumLite
        public int getNumber() {
            return this.value;
        }
    }

    @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermissionOrBuilder
    public PayloadOneofCase getPayloadOneofCase() {
        return PayloadOneofCase.forNumber(this.payloadOneofCase_);
    }

    @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermissionOrBuilder
    public boolean hasRequest() {
        return this.payloadOneofCase_ == 1;
    }

    @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermissionOrBuilder
    public Request getRequest() {
        if (this.payloadOneofCase_ == 1) {
            return (Request) this.payloadOneof_;
        }
        return Request.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermissionOrBuilder
    public RequestOrBuilder getRequestOrBuilder() {
        if (this.payloadOneofCase_ == 1) {
            return (Request) this.payloadOneof_;
        }
        return Request.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermissionOrBuilder
    public boolean hasResponse() {
        return this.payloadOneofCase_ == 2;
    }

    @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermissionOrBuilder
    public Response getResponse() {
        if (this.payloadOneofCase_ == 2) {
            return (Response) this.payloadOneof_;
        }
        return Response.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermissionOrBuilder
    public ResponseOrBuilder getResponseOrBuilder() {
        if (this.payloadOneofCase_ == 2) {
            return (Response) this.payloadOneof_;
        }
        return Response.getDefaultInstance();
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
        if (this.payloadOneofCase_ == 1) {
            codedOutputStream.writeMessage(1, (Request) this.payloadOneof_);
        }
        if (this.payloadOneofCase_ == 2) {
            codedOutputStream.writeMessage(2, (Response) this.payloadOneof_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int computeMessageSize = this.payloadOneofCase_ == 1 ? CodedOutputStream.computeMessageSize(1, (Request) this.payloadOneof_) : 0;
        if (this.payloadOneofCase_ == 2) {
            computeMessageSize += CodedOutputStream.computeMessageSize(2, (Response) this.payloadOneof_);
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
        if (!(obj instanceof RenderingTaskPermission)) {
            return super.equals(obj);
        }
        RenderingTaskPermission renderingTaskPermission = (RenderingTaskPermission) obj;
        if (!getPayloadOneofCase().equals(renderingTaskPermission.getPayloadOneofCase())) {
            return false;
        }
        int i = this.payloadOneofCase_;
        if (i == 1) {
            if (!getRequest().equals(renderingTaskPermission.getRequest())) {
                return false;
            }
        } else if (i == 2 && !getResponse().equals(renderingTaskPermission.getResponse())) {
            return false;
        }
        return this.unknownFields.equals(renderingTaskPermission.unknownFields);
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
        int i3 = this.payloadOneofCase_;
        if (i3 == 1) {
            i = ((hashCode2 * 37) + 1) * 53;
            hashCode = getRequest().hashCode();
        } else {
            if (i3 == 2) {
                i = ((hashCode2 * 37) + 2) * 53;
                hashCode = getResponse().hashCode();
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

    public static RenderingTaskPermission parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RenderingTaskPermission) PARSER.parseFrom(byteBuffer);
    }

    public static RenderingTaskPermission parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RenderingTaskPermission) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static RenderingTaskPermission parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RenderingTaskPermission) PARSER.parseFrom(byteString);
    }

    public static RenderingTaskPermission parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RenderingTaskPermission) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static RenderingTaskPermission parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RenderingTaskPermission) PARSER.parseFrom(bArr);
    }

    public static RenderingTaskPermission parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RenderingTaskPermission) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static RenderingTaskPermission parseFrom(InputStream inputStream) throws IOException {
        return (RenderingTaskPermission) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static RenderingTaskPermission parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RenderingTaskPermission) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static RenderingTaskPermission parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RenderingTaskPermission) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static RenderingTaskPermission parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RenderingTaskPermission) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static RenderingTaskPermission parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RenderingTaskPermission) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static RenderingTaskPermission parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RenderingTaskPermission) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(RenderingTaskPermission renderingTaskPermission) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(renderingTaskPermission);
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

    public static final class Builder extends GeneratedMessageV3.Builder implements RenderingTaskPermissionOrBuilder {
        private int payloadOneofCase_;
        private Object payloadOneof_;
        private SingleFieldBuilderV3 requestBuilder_;
        private SingleFieldBuilderV3 responseBuilder_;

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return TaskPermissionProto.internal_static_bidmachine_protobuf_RenderingTaskPermission_descriptor;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TaskPermissionProto.internal_static_bidmachine_protobuf_RenderingTaskPermission_fieldAccessorTable.ensureFieldAccessorsInitialized(RenderingTaskPermission.class, Builder.class);
        }

        private Builder() {
            this.payloadOneofCase_ = 0;
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.payloadOneofCase_ = 0;
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.payloadOneofCase_ = 0;
            this.payloadOneof_ = null;
            return this;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return TaskPermissionProto.internal_static_bidmachine_protobuf_RenderingTaskPermission_descriptor;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* renamed from: getDefaultInstanceForType */
        public RenderingTaskPermission mo3244getDefaultInstanceForType() {
            return RenderingTaskPermission.getDefaultInstance();
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public RenderingTaskPermission build() {
            RenderingTaskPermission buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public RenderingTaskPermission buildPartial() {
            RenderingTaskPermission renderingTaskPermission = new RenderingTaskPermission(this);
            if (this.payloadOneofCase_ == 1) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.requestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    renderingTaskPermission.payloadOneof_ = this.payloadOneof_;
                } else {
                    renderingTaskPermission.payloadOneof_ = singleFieldBuilderV3.build();
                }
            }
            if (this.payloadOneofCase_ == 2) {
                SingleFieldBuilderV3 singleFieldBuilderV32 = this.responseBuilder_;
                if (singleFieldBuilderV32 == null) {
                    renderingTaskPermission.payloadOneof_ = this.payloadOneof_;
                } else {
                    renderingTaskPermission.payloadOneof_ = singleFieldBuilderV32.build();
                }
            }
            renderingTaskPermission.payloadOneofCase_ = this.payloadOneofCase_;
            onBuilt();
            return renderingTaskPermission;
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
            if (message instanceof RenderingTaskPermission) {
                return mergeFrom((RenderingTaskPermission) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(RenderingTaskPermission renderingTaskPermission) {
            if (renderingTaskPermission == RenderingTaskPermission.getDefaultInstance()) {
                return this;
            }
            int i = AnonymousClass2.$SwitchMap$io$bidmachine$protobuf$rendering$RenderingTaskPermission$PayloadOneofCase[renderingTaskPermission.getPayloadOneofCase().ordinal()];
            if (i == 1) {
                mergeRequest(renderingTaskPermission.getRequest());
            } else if (i == 2) {
                mergeResponse(renderingTaskPermission.getResponse());
            }
            mergeUnknownFields(((GeneratedMessageV3) renderingTaskPermission).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            RenderingTaskPermission renderingTaskPermission = null;
            try {
                try {
                    RenderingTaskPermission renderingTaskPermission2 = (RenderingTaskPermission) RenderingTaskPermission.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (renderingTaskPermission2 != null) {
                        mergeFrom(renderingTaskPermission2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    RenderingTaskPermission renderingTaskPermission3 = (RenderingTaskPermission) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        renderingTaskPermission = renderingTaskPermission3;
                        if (renderingTaskPermission != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (renderingTaskPermission != null) {
                    mergeFrom(renderingTaskPermission);
                }
                throw th;
            }
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermissionOrBuilder
        public PayloadOneofCase getPayloadOneofCase() {
            return PayloadOneofCase.forNumber(this.payloadOneofCase_);
        }

        public Builder clearPayloadOneof() {
            this.payloadOneofCase_ = 0;
            this.payloadOneof_ = null;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermissionOrBuilder
        public boolean hasRequest() {
            return this.payloadOneofCase_ == 1;
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermissionOrBuilder
        public Request getRequest() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.requestBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.payloadOneofCase_ == 1) {
                    return (Request) this.payloadOneof_;
                }
                return Request.getDefaultInstance();
            }
            if (this.payloadOneofCase_ == 1) {
                return (Request) singleFieldBuilderV3.getMessage();
            }
            return Request.getDefaultInstance();
        }

        public Builder setRequest(Request request) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.requestBuilder_;
            if (singleFieldBuilderV3 == null) {
                request.getClass();
                this.payloadOneof_ = request;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(request);
            }
            this.payloadOneofCase_ = 1;
            return this;
        }

        public Builder setRequest(Request.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.requestBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.payloadOneof_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.payloadOneofCase_ = 1;
            return this;
        }

        public Builder mergeRequest(Request request) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.requestBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.payloadOneofCase_ == 1 && this.payloadOneof_ != Request.getDefaultInstance()) {
                    this.payloadOneof_ = Request.newBuilder((Request) this.payloadOneof_).mergeFrom(request).buildPartial();
                } else {
                    this.payloadOneof_ = request;
                }
                onChanged();
            } else {
                if (this.payloadOneofCase_ == 1) {
                    singleFieldBuilderV3.mergeFrom(request);
                }
                this.requestBuilder_.setMessage(request);
            }
            this.payloadOneofCase_ = 1;
            return this;
        }

        public Builder clearRequest() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.requestBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.payloadOneofCase_ == 1) {
                    this.payloadOneofCase_ = 0;
                    this.payloadOneof_ = null;
                    onChanged();
                }
            } else {
                if (this.payloadOneofCase_ == 1) {
                    this.payloadOneofCase_ = 0;
                    this.payloadOneof_ = null;
                }
                singleFieldBuilderV3.clear();
            }
            return this;
        }

        public Request.Builder getRequestBuilder() {
            return (Request.Builder) getRequestFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermissionOrBuilder
        public RequestOrBuilder getRequestOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3;
            int i = this.payloadOneofCase_;
            if (i == 1 && (singleFieldBuilderV3 = this.requestBuilder_) != null) {
                return (RequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            if (i == 1) {
                return (Request) this.payloadOneof_;
            }
            return Request.getDefaultInstance();
        }

        private SingleFieldBuilderV3 getRequestFieldBuilder() {
            if (this.requestBuilder_ == null) {
                if (this.payloadOneofCase_ != 1) {
                    this.payloadOneof_ = Request.getDefaultInstance();
                }
                this.requestBuilder_ = new SingleFieldBuilderV3((Request) this.payloadOneof_, getParentForChildren(), isClean());
                this.payloadOneof_ = null;
            }
            this.payloadOneofCase_ = 1;
            onChanged();
            return this.requestBuilder_;
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermissionOrBuilder
        public boolean hasResponse() {
            return this.payloadOneofCase_ == 2;
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermissionOrBuilder
        public Response getResponse() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.responseBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.payloadOneofCase_ == 2) {
                    return (Response) this.payloadOneof_;
                }
                return Response.getDefaultInstance();
            }
            if (this.payloadOneofCase_ == 2) {
                return (Response) singleFieldBuilderV3.getMessage();
            }
            return Response.getDefaultInstance();
        }

        public Builder setResponse(Response response) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.responseBuilder_;
            if (singleFieldBuilderV3 == null) {
                response.getClass();
                this.payloadOneof_ = response;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(response);
            }
            this.payloadOneofCase_ = 2;
            return this;
        }

        public Builder setResponse(Response.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.responseBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.payloadOneof_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.payloadOneofCase_ = 2;
            return this;
        }

        public Builder mergeResponse(Response response) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.responseBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.payloadOneofCase_ == 2 && this.payloadOneof_ != Response.getDefaultInstance()) {
                    this.payloadOneof_ = Response.newBuilder((Response) this.payloadOneof_).mergeFrom(response).buildPartial();
                } else {
                    this.payloadOneof_ = response;
                }
                onChanged();
            } else {
                if (this.payloadOneofCase_ == 2) {
                    singleFieldBuilderV3.mergeFrom(response);
                }
                this.responseBuilder_.setMessage(response);
            }
            this.payloadOneofCase_ = 2;
            return this;
        }

        public Builder clearResponse() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.responseBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.payloadOneofCase_ == 2) {
                    this.payloadOneofCase_ = 0;
                    this.payloadOneof_ = null;
                    onChanged();
                }
            } else {
                if (this.payloadOneofCase_ == 2) {
                    this.payloadOneofCase_ = 0;
                    this.payloadOneof_ = null;
                }
                singleFieldBuilderV3.clear();
            }
            return this;
        }

        public Response.Builder getResponseBuilder() {
            return (Response.Builder) getResponseFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermissionOrBuilder
        public ResponseOrBuilder getResponseOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3;
            int i = this.payloadOneofCase_;
            if (i == 2 && (singleFieldBuilderV3 = this.responseBuilder_) != null) {
                return (ResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            if (i == 2) {
                return (Response) this.payloadOneof_;
            }
            return Response.getDefaultInstance();
        }

        private SingleFieldBuilderV3 getResponseFieldBuilder() {
            if (this.responseBuilder_ == null) {
                if (this.payloadOneofCase_ != 2) {
                    this.payloadOneof_ = Response.getDefaultInstance();
                }
                this.responseBuilder_ = new SingleFieldBuilderV3((Response) this.payloadOneof_, getParentForChildren(), isClean());
                this.payloadOneof_ = null;
            }
            this.payloadOneofCase_ = 2;
            onChanged();
            return this.responseBuilder_;
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

    /* renamed from: io.bidmachine.protobuf.rendering.RenderingTaskPermission$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$io$bidmachine$protobuf$rendering$RenderingTaskPermission$PayloadOneofCase;

        static {
            int[] iArr = new int[PayloadOneofCase.values().length];
            $SwitchMap$io$bidmachine$protobuf$rendering$RenderingTaskPermission$PayloadOneofCase = iArr;
            try {
                iArr[PayloadOneofCase.REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$rendering$RenderingTaskPermission$PayloadOneofCase[PayloadOneofCase.RESPONSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$rendering$RenderingTaskPermission$PayloadOneofCase[PayloadOneofCase.PAYLOADONEOF_NOT_SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static RenderingTaskPermission getDefaultInstance() {
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
    public RenderingTaskPermission mo3244getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
