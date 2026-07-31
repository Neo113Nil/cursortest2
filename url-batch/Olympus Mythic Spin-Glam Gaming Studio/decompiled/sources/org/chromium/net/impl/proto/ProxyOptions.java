package org.chromium.net.impl.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import org.chromium.net.impl.proto.Proxy;

/* loaded from: classes15.dex */
public final class ProxyOptions extends GeneratedMessageLite<ProxyOptions, Builder> implements ProxyOptionsOrBuilder {
    private static final ProxyOptions DEFAULT_INSTANCE;
    private static volatile Parser<ProxyOptions> PARSER = null;
    public static final int PROXIES_FIELD_NUMBER = 1;
    private Internal.ProtobufList<Proxy> proxies_ = GeneratedMessageLite.emptyProtobufList();

    private ProxyOptions() {
    }

    @Override // org.chromium.net.impl.proto.ProxyOptionsOrBuilder
    public List<Proxy> getProxiesList() {
        return this.proxies_;
    }

    public List<? extends ProxyOrBuilder> getProxiesOrBuilderList() {
        return this.proxies_;
    }

    @Override // org.chromium.net.impl.proto.ProxyOptionsOrBuilder
    public int getProxiesCount() {
        return this.proxies_.size();
    }

    @Override // org.chromium.net.impl.proto.ProxyOptionsOrBuilder
    public Proxy getProxies(int i) {
        return this.proxies_.get(i);
    }

    public ProxyOrBuilder getProxiesOrBuilder(int i) {
        return this.proxies_.get(i);
    }

    private void ensureProxiesIsMutable() {
        Internal.ProtobufList<Proxy> protobufList = this.proxies_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.proxies_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProxies(int i, Proxy proxy) {
        proxy.getClass();
        ensureProxiesIsMutable();
        this.proxies_.set(i, proxy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProxies(Proxy proxy) {
        proxy.getClass();
        ensureProxiesIsMutable();
        this.proxies_.add(proxy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProxies(int i, Proxy proxy) {
        proxy.getClass();
        ensureProxiesIsMutable();
        this.proxies_.add(i, proxy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllProxies(Iterable<? extends Proxy> iterable) {
        ensureProxiesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.proxies_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProxies() {
        this.proxies_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeProxies(int i) {
        ensureProxiesIsMutable();
        this.proxies_.remove(i);
    }

    public static ProxyOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ProxyOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ProxyOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ProxyOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ProxyOptions parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ProxyOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ProxyOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ProxyOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ProxyOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ProxyOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ProxyOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ProxyOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ProxyOptions parseFrom(InputStream inputStream) throws IOException {
        return (ProxyOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ProxyOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ProxyOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ProxyOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ProxyOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ProxyOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ProxyOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ProxyOptions parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ProxyOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ProxyOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ProxyOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(ProxyOptions proxyOptions) {
        return DEFAULT_INSTANCE.createBuilder(proxyOptions);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<ProxyOptions, Builder> implements ProxyOptionsOrBuilder {
        private Builder() {
            super(ProxyOptions.DEFAULT_INSTANCE);
        }

        @Override // org.chromium.net.impl.proto.ProxyOptionsOrBuilder
        public List<Proxy> getProxiesList() {
            return Collections.unmodifiableList(((ProxyOptions) this.instance).getProxiesList());
        }

        @Override // org.chromium.net.impl.proto.ProxyOptionsOrBuilder
        public int getProxiesCount() {
            return ((ProxyOptions) this.instance).getProxiesCount();
        }

        @Override // org.chromium.net.impl.proto.ProxyOptionsOrBuilder
        public Proxy getProxies(int i) {
            return ((ProxyOptions) this.instance).getProxies(i);
        }

        public Builder setProxies(int i, Proxy proxy) {
            copyOnWrite();
            ((ProxyOptions) this.instance).setProxies(i, proxy);
            return this;
        }

        public Builder setProxies(int i, Proxy.Builder builder) {
            copyOnWrite();
            ((ProxyOptions) this.instance).setProxies(i, builder.build());
            return this;
        }

        public Builder addProxies(Proxy proxy) {
            copyOnWrite();
            ((ProxyOptions) this.instance).addProxies(proxy);
            return this;
        }

        public Builder addProxies(int i, Proxy proxy) {
            copyOnWrite();
            ((ProxyOptions) this.instance).addProxies(i, proxy);
            return this;
        }

        public Builder addProxies(Proxy.Builder builder) {
            copyOnWrite();
            ((ProxyOptions) this.instance).addProxies(builder.build());
            return this;
        }

        public Builder addProxies(int i, Proxy.Builder builder) {
            copyOnWrite();
            ((ProxyOptions) this.instance).addProxies(i, builder.build());
            return this;
        }

        public Builder addAllProxies(Iterable<? extends Proxy> iterable) {
            copyOnWrite();
            ((ProxyOptions) this.instance).addAllProxies(iterable);
            return this;
        }

        public Builder clearProxies() {
            copyOnWrite();
            ((ProxyOptions) this.instance).clearProxies();
            return this;
        }

        public Builder removeProxies(int i) {
            copyOnWrite();
            ((ProxyOptions) this.instance).removeProxies(i);
            return this;
        }
    }

    /* renamed from: org.chromium.net.impl.proto.ProxyOptions$1, reason: invalid class name */
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
                return new ProxyOptions();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"proxies_", Proxy.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ProxyOptions> parser = PARSER;
                if (parser == null) {
                    synchronized (ProxyOptions.class) {
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
        ProxyOptions proxyOptions = new ProxyOptions();
        DEFAULT_INSTANCE = proxyOptions;
        GeneratedMessageLite.registerDefaultInstance(ProxyOptions.class, proxyOptions);
    }

    public static ProxyOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<ProxyOptions> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
