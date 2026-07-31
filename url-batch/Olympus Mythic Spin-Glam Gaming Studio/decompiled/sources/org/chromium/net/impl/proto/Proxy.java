package org.chromium.net.impl.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
public final class Proxy extends GeneratedMessageLite<Proxy, Builder> implements ProxyOrBuilder {
    private static final Proxy DEFAULT_INSTANCE;
    public static final int HOST_FIELD_NUMBER = 2;
    private static volatile Parser<Proxy> PARSER = null;
    public static final int PORT_FIELD_NUMBER = 3;
    public static final int SCHEME_FIELD_NUMBER = 1;
    private int bitField0_;
    private String host_ = "";
    private int port_;
    private int scheme_;

    private Proxy() {
    }

    @Override // org.chromium.net.impl.proto.ProxyOrBuilder
    public boolean hasScheme() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // org.chromium.net.impl.proto.ProxyOrBuilder
    public ProxyScheme getScheme() {
        ProxyScheme forNumber = ProxyScheme.forNumber(this.scheme_);
        return forNumber == null ? ProxyScheme.DIRECT : forNumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScheme(ProxyScheme proxyScheme) {
        this.scheme_ = proxyScheme.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScheme() {
        this.bitField0_ &= -2;
        this.scheme_ = 0;
    }

    @Override // org.chromium.net.impl.proto.ProxyOrBuilder
    public boolean hasHost() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // org.chromium.net.impl.proto.ProxyOrBuilder
    public String getHost() {
        return this.host_;
    }

    @Override // org.chromium.net.impl.proto.ProxyOrBuilder
    public ByteString getHostBytes() {
        return ByteString.copyFromUtf8(this.host_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHost(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.host_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHost() {
        this.bitField0_ &= -3;
        this.host_ = getDefaultInstance().getHost();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHostBytes(ByteString byteString) {
        this.host_ = byteString.toStringUtf8();
        this.bitField0_ |= 2;
    }

    @Override // org.chromium.net.impl.proto.ProxyOrBuilder
    public boolean hasPort() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // org.chromium.net.impl.proto.ProxyOrBuilder
    public int getPort() {
        return this.port_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPort(int i) {
        this.bitField0_ |= 4;
        this.port_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPort() {
        this.bitField0_ &= -5;
        this.port_ = 0;
    }

    public static Proxy parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Proxy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Proxy parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proxy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Proxy parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Proxy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Proxy parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proxy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Proxy parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Proxy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Proxy parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proxy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Proxy parseFrom(InputStream inputStream) throws IOException {
        return (Proxy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Proxy parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proxy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Proxy parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Proxy) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Proxy parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proxy) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Proxy parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Proxy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Proxy parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proxy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Proxy proxy) {
        return DEFAULT_INSTANCE.createBuilder(proxy);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Proxy, Builder> implements ProxyOrBuilder {
        private Builder() {
            super(Proxy.DEFAULT_INSTANCE);
        }

        @Override // org.chromium.net.impl.proto.ProxyOrBuilder
        public boolean hasScheme() {
            return ((Proxy) this.instance).hasScheme();
        }

        @Override // org.chromium.net.impl.proto.ProxyOrBuilder
        public ProxyScheme getScheme() {
            return ((Proxy) this.instance).getScheme();
        }

        public Builder setScheme(ProxyScheme proxyScheme) {
            copyOnWrite();
            ((Proxy) this.instance).setScheme(proxyScheme);
            return this;
        }

        public Builder clearScheme() {
            copyOnWrite();
            ((Proxy) this.instance).clearScheme();
            return this;
        }

        @Override // org.chromium.net.impl.proto.ProxyOrBuilder
        public boolean hasHost() {
            return ((Proxy) this.instance).hasHost();
        }

        @Override // org.chromium.net.impl.proto.ProxyOrBuilder
        public String getHost() {
            return ((Proxy) this.instance).getHost();
        }

        @Override // org.chromium.net.impl.proto.ProxyOrBuilder
        public ByteString getHostBytes() {
            return ((Proxy) this.instance).getHostBytes();
        }

        public Builder setHost(String str) {
            copyOnWrite();
            ((Proxy) this.instance).setHost(str);
            return this;
        }

        public Builder clearHost() {
            copyOnWrite();
            ((Proxy) this.instance).clearHost();
            return this;
        }

        public Builder setHostBytes(ByteString byteString) {
            copyOnWrite();
            ((Proxy) this.instance).setHostBytes(byteString);
            return this;
        }

        @Override // org.chromium.net.impl.proto.ProxyOrBuilder
        public boolean hasPort() {
            return ((Proxy) this.instance).hasPort();
        }

        @Override // org.chromium.net.impl.proto.ProxyOrBuilder
        public int getPort() {
            return ((Proxy) this.instance).getPort();
        }

        public Builder setPort(int i) {
            copyOnWrite();
            ((Proxy) this.instance).setPort(i);
            return this;
        }

        public Builder clearPort() {
            copyOnWrite();
            ((Proxy) this.instance).clearPort();
            return this;
        }
    }

    /* renamed from: org.chromium.net.impl.proto.Proxy$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new Proxy();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003င\u0002", new Object[]{"bitField0_", "scheme_", ProxyScheme.internalGetVerifier(), "host_", "port_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Proxy> parser = PARSER;
                if (parser == null) {
                    synchronized (Proxy.class) {
                        try {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
                        } finally {
                        }
                    }
                }
                return parser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        Proxy proxy = new Proxy();
        DEFAULT_INSTANCE = proxy;
        GeneratedMessageLite.registerDefaultInstance(Proxy.class, proxy);
    }

    public static Proxy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Proxy> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
