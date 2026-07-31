package io.grpc.protobuf.lite;

import com.google.common.base.Preconditions;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import io.grpc.KnownLength;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import io.grpc.Status;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public final class ProtoLiteUtils {
    private static final int BUF_SIZE = 8192;
    static final int DEFAULT_MAX_MESSAGE_SIZE = 4194304;
    static volatile ExtensionRegistryLite globalRegistry = ExtensionRegistryLite.getEmptyRegistry();

    public static void setExtensionRegistry(ExtensionRegistryLite extensionRegistryLite) {
        globalRegistry = (ExtensionRegistryLite) Preconditions.checkNotNull(extensionRegistryLite, "newRegistry");
    }

    public static <T extends MessageLite> MethodDescriptor.Marshaller<T> marshaller(T t) {
        return new MessageMarshaller(t, -1);
    }

    public static <T extends MessageLite> MethodDescriptor.Marshaller<T> marshallerWithRecursionLimit(T t, int i) {
        return new MessageMarshaller(t, i);
    }

    public static <T extends MessageLite> Metadata.BinaryMarshaller<T> metadataMarshaller(T t) {
        return new MetadataMarshaller(t);
    }

    static long copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        Preconditions.checkNotNull(inputStream, "inputStream cannot be null!");
        Preconditions.checkNotNull(outputStream, "outputStream cannot be null!");
        byte[] bArr = new byte[8192];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += read;
        }
    }

    private ProtoLiteUtils() {
    }

    private static final class MessageMarshaller<T extends MessageLite> implements MethodDescriptor.PrototypeMarshaller<T> {
        private static final ThreadLocal<Reference<byte[]>> bufs = new ThreadLocal<>();
        private final T defaultInstance;
        private final Parser<T> parser;
        private final int recursionLimit;

        MessageMarshaller(T t, int i) {
            this.defaultInstance = (T) Preconditions.checkNotNull(t, "defaultInstance cannot be null");
            this.parser = (Parser<T>) t.getParserForType();
            this.recursionLimit = i;
        }

        @Override // io.grpc.MethodDescriptor.ReflectableMarshaller
        public Class<T> getMessageClass() {
            return (Class<T>) this.defaultInstance.getClass();
        }

        @Override // io.grpc.MethodDescriptor.PrototypeMarshaller
        public T getMessagePrototype() {
            return this.defaultInstance;
        }

        @Override // io.grpc.MethodDescriptor.Marshaller
        public InputStream stream(T t) {
            return new ProtoInputStream(t, this.parser);
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0096  */
        @Override // io.grpc.MethodDescriptor.Marshaller
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public T parse(InputStream inputStream) {
            CodedInputStream codedInputStream;
            int i;
            byte[] bArr;
            if ((inputStream instanceof ProtoInputStream) && ((ProtoInputStream) inputStream).parser() == this.parser) {
                try {
                    return (T) ((ProtoInputStream) inputStream).message();
                } catch (IllegalStateException unused) {
                }
            }
            try {
                try {
                    if (inputStream instanceof KnownLength) {
                        int available = inputStream.available();
                        if (available > 0 && available <= 4194304) {
                            ThreadLocal<Reference<byte[]>> threadLocal = bufs;
                            Reference<byte[]> reference = threadLocal.get();
                            if (reference == null || (bArr = reference.get()) == null || bArr.length < available) {
                                bArr = new byte[available];
                                threadLocal.set(new WeakReference(bArr));
                            }
                            int i2 = available;
                            while (i2 > 0) {
                                int read = inputStream.read(bArr, available - i2, i2);
                                if (read == -1) {
                                    break;
                                }
                                i2 -= read;
                            }
                            if (i2 != 0) {
                                throw new RuntimeException("size inaccurate: " + available + " != " + (available - i2));
                            }
                            codedInputStream = CodedInputStream.newInstance(bArr, 0, available);
                            if (codedInputStream == null) {
                                codedInputStream = CodedInputStream.newInstance(inputStream);
                            }
                            codedInputStream.setSizeLimit(Integer.MAX_VALUE);
                            i = this.recursionLimit;
                            if (i >= 0) {
                                codedInputStream.setRecursionLimit(i);
                            }
                            return parseFrom(codedInputStream);
                        }
                        if (available == 0) {
                            return this.defaultInstance;
                        }
                    }
                    return parseFrom(codedInputStream);
                } catch (InvalidProtocolBufferException e) {
                    throw Status.INTERNAL.withDescription("Invalid protobuf byte sequence").withCause(e).asRuntimeException();
                }
                codedInputStream = null;
                if (codedInputStream == null) {
                }
                codedInputStream.setSizeLimit(Integer.MAX_VALUE);
                i = this.recursionLimit;
                if (i >= 0) {
                }
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }

        private T parseFrom(CodedInputStream codedInputStream) throws InvalidProtocolBufferException {
            T parseFrom = this.parser.parseFrom(codedInputStream, ProtoLiteUtils.globalRegistry);
            try {
                codedInputStream.checkLastTagWas(0);
                return parseFrom;
            } catch (InvalidProtocolBufferException e) {
                e.setUnfinishedMessage(parseFrom);
                throw e;
            }
        }
    }

    private static final class MetadataMarshaller<T extends MessageLite> implements Metadata.BinaryMarshaller<T> {
        private final T defaultInstance;

        MetadataMarshaller(T t) {
            this.defaultInstance = t;
        }

        @Override // io.grpc.Metadata.BinaryMarshaller
        public byte[] toBytes(T t) {
            return t.toByteArray();
        }

        @Override // io.grpc.Metadata.BinaryMarshaller
        public T parseBytes(byte[] bArr) {
            try {
                return (T) this.defaultInstance.getParserForType().parseFrom(bArr, ProtoLiteUtils.globalRegistry);
            } catch (InvalidProtocolBufferException e) {
                throw new IllegalArgumentException(e);
            }
        }
    }
}
