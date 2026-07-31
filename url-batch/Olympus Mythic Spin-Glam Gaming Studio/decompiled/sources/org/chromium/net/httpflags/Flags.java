package org.chromium.net.httpflags;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes15.dex */
public final class Flags extends GeneratedMessageLite<Flags, Builder> implements FlagsOrBuilder {
    private static final Flags DEFAULT_INSTANCE;
    public static final int FLAGS_FIELD_NUMBER = 1;
    private static volatile Parser<Flags> PARSER;
    private MapFieldLite<String, FlagValue> flags_ = MapFieldLite.emptyMapField();

    private Flags() {
    }

    private static final class FlagsDefaultEntryHolder {
        static final MapEntryLite<String, FlagValue> defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, FlagValue.getDefaultInstance());

        private FlagsDefaultEntryHolder() {
        }
    }

    private MapFieldLite<String, FlagValue> internalGetFlags() {
        return this.flags_;
    }

    private MapFieldLite<String, FlagValue> internalGetMutableFlags() {
        if (!this.flags_.isMutable()) {
            this.flags_ = this.flags_.mutableCopy();
        }
        return this.flags_;
    }

    @Override // org.chromium.net.httpflags.FlagsOrBuilder
    public int getFlagsCount() {
        return internalGetFlags().size();
    }

    @Override // org.chromium.net.httpflags.FlagsOrBuilder
    public boolean containsFlags(String str) {
        str.getClass();
        return internalGetFlags().containsKey(str);
    }

    @Override // org.chromium.net.httpflags.FlagsOrBuilder
    @Deprecated
    public Map<String, FlagValue> getFlags() {
        return getFlagsMap();
    }

    @Override // org.chromium.net.httpflags.FlagsOrBuilder
    public Map<String, FlagValue> getFlagsMap() {
        return Collections.unmodifiableMap(internalGetFlags());
    }

    @Override // org.chromium.net.httpflags.FlagsOrBuilder
    public FlagValue getFlagsOrDefault(String str, FlagValue flagValue) {
        str.getClass();
        MapFieldLite<String, FlagValue> internalGetFlags = internalGetFlags();
        return internalGetFlags.containsKey(str) ? internalGetFlags.get(str) : flagValue;
    }

    @Override // org.chromium.net.httpflags.FlagsOrBuilder
    public FlagValue getFlagsOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, FlagValue> internalGetFlags = internalGetFlags();
        if (!internalGetFlags.containsKey(str)) {
            throw new IllegalArgumentException();
        }
        return internalGetFlags.get(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, FlagValue> getMutableFlagsMap() {
        return internalGetMutableFlags();
    }

    public static Flags parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Flags) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Flags parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Flags) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Flags parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Flags) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Flags parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Flags) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Flags parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Flags) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Flags parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Flags) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Flags parseFrom(InputStream inputStream) throws IOException {
        return (Flags) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Flags parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Flags) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Flags parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Flags) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Flags parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Flags) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Flags parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Flags) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Flags parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Flags) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Flags flags) {
        return DEFAULT_INSTANCE.createBuilder(flags);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Flags, Builder> implements FlagsOrBuilder {
        private Builder() {
            super(Flags.DEFAULT_INSTANCE);
        }

        @Override // org.chromium.net.httpflags.FlagsOrBuilder
        public int getFlagsCount() {
            return ((Flags) this.instance).getFlagsMap().size();
        }

        @Override // org.chromium.net.httpflags.FlagsOrBuilder
        public boolean containsFlags(String str) {
            str.getClass();
            return ((Flags) this.instance).getFlagsMap().containsKey(str);
        }

        public Builder clearFlags() {
            copyOnWrite();
            ((Flags) this.instance).getMutableFlagsMap().clear();
            return this;
        }

        public Builder removeFlags(String str) {
            str.getClass();
            copyOnWrite();
            ((Flags) this.instance).getMutableFlagsMap().remove(str);
            return this;
        }

        @Override // org.chromium.net.httpflags.FlagsOrBuilder
        @Deprecated
        public Map<String, FlagValue> getFlags() {
            return getFlagsMap();
        }

        @Override // org.chromium.net.httpflags.FlagsOrBuilder
        public Map<String, FlagValue> getFlagsMap() {
            return Collections.unmodifiableMap(((Flags) this.instance).getFlagsMap());
        }

        @Override // org.chromium.net.httpflags.FlagsOrBuilder
        public FlagValue getFlagsOrDefault(String str, FlagValue flagValue) {
            str.getClass();
            Map<String, FlagValue> flagsMap = ((Flags) this.instance).getFlagsMap();
            return flagsMap.containsKey(str) ? flagsMap.get(str) : flagValue;
        }

        @Override // org.chromium.net.httpflags.FlagsOrBuilder
        public FlagValue getFlagsOrThrow(String str) {
            str.getClass();
            Map<String, FlagValue> flagsMap = ((Flags) this.instance).getFlagsMap();
            if (!flagsMap.containsKey(str)) {
                throw new IllegalArgumentException();
            }
            return flagsMap.get(str);
        }

        public Builder putFlags(String str, FlagValue flagValue) {
            str.getClass();
            flagValue.getClass();
            copyOnWrite();
            ((Flags) this.instance).getMutableFlagsMap().put(str, flagValue);
            return this;
        }

        public Builder putAllFlags(Map<String, FlagValue> map) {
            copyOnWrite();
            ((Flags) this.instance).getMutableFlagsMap().putAll(map);
            return this;
        }
    }

    /* renamed from: org.chromium.net.httpflags.Flags$1, reason: invalid class name */
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
                return new Flags();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"flags_", FlagsDefaultEntryHolder.defaultEntry});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Flags> parser = PARSER;
                if (parser == null) {
                    synchronized (Flags.class) {
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
        Flags flags = new Flags();
        DEFAULT_INSTANCE = flags;
        GeneratedMessageLite.registerDefaultInstance(Flags.class, flags);
    }

    public static Flags getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Flags> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
