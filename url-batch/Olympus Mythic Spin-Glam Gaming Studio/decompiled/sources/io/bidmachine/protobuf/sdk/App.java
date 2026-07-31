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
import com.explorestack.protobuf.LazyStringArrayList;
import com.explorestack.protobuf.LazyStringList;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.Parser;
import com.explorestack.protobuf.ProtocolStringList;
import com.explorestack.protobuf.SingleFieldBuilderV3;
import com.explorestack.protobuf.Timestamp;
import com.explorestack.protobuf.TimestampOrBuilder;
import com.explorestack.protobuf.UnknownFieldSet;
import com.explorestack.protobuf.adcom.Context;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes11.dex */
public final class App extends GeneratedMessageV3 implements AppOrBuilder {
    public static final int APP_NAME_FIELD_NUMBER = 1;
    public static final int APP_VER_FIELD_NUMBER = 2;
    public static final int FIRST_LAUNCH_TIME_FIELD_NUMBER = 5;
    public static final int FMWNAME_FIELD_NUMBER = 8;
    public static final int INSTALL_BEGIN_SERVER_TIMESTAMP_FIELD_NUMBER = 13;
    public static final int INSTALL_REFERRER_CLICK_SERVER_TIMESTAMP_FIELD_NUMBER = 12;
    public static final int INSTALL_REFERRER_CLICK_TIMESTAMP_FIELD_NUMBER = 10;
    public static final int INSTALL_REFERRER_URL_FIELD_NUMBER = 9;
    public static final int INSTALL_TIME_FIELD_NUMBER = 4;
    public static final int INSTALL_VERSION_FIELD_NUMBER = 14;
    public static final int IS_GOOGLE_PLAY_INSTANT_FIELD_NUMBER = 15;
    public static final int RELEASE_FIELD_NUMBER = 3;
    public static final int SDK_INSTALL_TIME_FIELD_NUMBER = 16;
    public static final int STORECAT_FIELD_NUMBER = 6;
    public static final int STORESUBCAT_FIELD_NUMBER = 7;
    private static final long serialVersionUID = 0;
    private volatile Object appName_;
    private volatile Object appVer_;
    private Timestamp firstLaunchTime_;
    private volatile Object fmwname_;
    private Timestamp installBeginServerTimestamp_;
    private Timestamp installReferrerClickServerTimestamp_;
    private Timestamp installReferrerClickTimestamp_;
    private volatile Object installReferrerUrl_;
    private Timestamp installTime_;
    private volatile Object installVersion_;
    private boolean isGooglePlayInstant_;
    private byte memoizedIsInitialized;
    private Context.App.Release release_;
    private Timestamp sdkInstallTime_;
    private volatile Object storecat_;
    private LazyStringList storesubcat_;
    private static final App DEFAULT_INSTANCE = new App();
    private static final Parser PARSER = new AbstractParser() { // from class: io.bidmachine.protobuf.sdk.App.1
        @Override // com.explorestack.protobuf.Parser
        public App parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new App(codedInputStream, extensionRegistryLite);
        }
    };

    private App(GeneratedMessageV3.Builder builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private App() {
        this.memoizedIsInitialized = (byte) -1;
        this.appName_ = "";
        this.appVer_ = "";
        this.storecat_ = "";
        this.storesubcat_ = LazyStringArrayList.EMPTY;
        this.fmwname_ = "";
        this.installReferrerUrl_ = "";
        this.installVersion_ = "";
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new App();
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private App(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        extensionRegistryLite.getClass();
        UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int readTag = codedInputStream.readTag();
                    switch (readTag) {
                        case 0:
                            z = true;
                        case 10:
                            this.appName_ = codedInputStream.readStringRequireUtf8();
                        case 18:
                            this.appVer_ = codedInputStream.readStringRequireUtf8();
                        case 26:
                            Context.App.Release release = this.release_;
                            Context.App.Release.Builder builder = release != null ? release.toBuilder() : null;
                            Context.App.Release release2 = (Context.App.Release) codedInputStream.readMessage(Context.App.Release.parser(), extensionRegistryLite);
                            this.release_ = release2;
                            if (builder != null) {
                                builder.mergeFrom(release2);
                                this.release_ = builder.buildPartial();
                            }
                        case 34:
                            Timestamp timestamp = this.installTime_;
                            Timestamp.Builder builder2 = timestamp != null ? timestamp.toBuilder() : null;
                            Timestamp timestamp2 = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                            this.installTime_ = timestamp2;
                            if (builder2 != null) {
                                builder2.mergeFrom(timestamp2);
                                this.installTime_ = builder2.buildPartial();
                            }
                        case 42:
                            Timestamp timestamp3 = this.firstLaunchTime_;
                            Timestamp.Builder builder3 = timestamp3 != null ? timestamp3.toBuilder() : null;
                            Timestamp timestamp4 = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                            this.firstLaunchTime_ = timestamp4;
                            if (builder3 != null) {
                                builder3.mergeFrom(timestamp4);
                                this.firstLaunchTime_ = builder3.buildPartial();
                            }
                        case 50:
                            this.storecat_ = codedInputStream.readStringRequireUtf8();
                        case 58:
                            String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                            z2 = z2;
                            if (!z2) {
                                this.storesubcat_ = new LazyStringArrayList();
                                z2 = true;
                            }
                            this.storesubcat_.add((LazyStringList) readStringRequireUtf8);
                        case 66:
                            this.fmwname_ = codedInputStream.readStringRequireUtf8();
                        case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
                            this.installReferrerUrl_ = codedInputStream.readStringRequireUtf8();
                        case 82:
                            Timestamp timestamp5 = this.installReferrerClickTimestamp_;
                            Timestamp.Builder builder4 = timestamp5 != null ? timestamp5.toBuilder() : null;
                            Timestamp timestamp6 = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                            this.installReferrerClickTimestamp_ = timestamp6;
                            if (builder4 != null) {
                                builder4.mergeFrom(timestamp6);
                                this.installReferrerClickTimestamp_ = builder4.buildPartial();
                            }
                        case 98:
                            Timestamp timestamp7 = this.installReferrerClickServerTimestamp_;
                            Timestamp.Builder builder5 = timestamp7 != null ? timestamp7.toBuilder() : null;
                            Timestamp timestamp8 = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                            this.installReferrerClickServerTimestamp_ = timestamp8;
                            if (builder5 != null) {
                                builder5.mergeFrom(timestamp8);
                                this.installReferrerClickServerTimestamp_ = builder5.buildPartial();
                            }
                        case 106:
                            Timestamp timestamp9 = this.installBeginServerTimestamp_;
                            Timestamp.Builder builder6 = timestamp9 != null ? timestamp9.toBuilder() : null;
                            Timestamp timestamp10 = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                            this.installBeginServerTimestamp_ = timestamp10;
                            if (builder6 != null) {
                                builder6.mergeFrom(timestamp10);
                                this.installBeginServerTimestamp_ = builder6.buildPartial();
                            }
                        case 114:
                            this.installVersion_ = codedInputStream.readStringRequireUtf8();
                        case 120:
                            this.isGooglePlayInstant_ = codedInputStream.readBool();
                        case 130:
                            Timestamp timestamp11 = this.sdkInstallTime_;
                            Timestamp.Builder builder7 = timestamp11 != null ? timestamp11.toBuilder() : null;
                            Timestamp timestamp12 = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                            this.sdkInstallTime_ = timestamp12;
                            if (builder7 != null) {
                                builder7.mergeFrom(timestamp12);
                                this.sdkInstallTime_ = builder7.buildPartial();
                            }
                        default:
                            if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                z = true;
                            }
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                }
            } catch (Throwable th) {
                if (z2) {
                    this.storesubcat_ = this.storesubcat_.getUnmodifiableView();
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if (z2) {
            this.storesubcat_ = this.storesubcat_.getUnmodifiableView();
        }
        this.unknownFields = newBuilder.build();
        makeExtensionsImmutable();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_App_descriptor;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_App_fieldAccessorTable.ensureFieldAccessorsInitialized(App.class, Builder.class);
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public String getAppName() {
        Object obj = this.appName_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.appName_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public ByteString getAppNameBytes() {
        Object obj = this.appName_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.appName_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public String getAppVer() {
        Object obj = this.appVer_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.appVer_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public ByteString getAppVerBytes() {
        Object obj = this.appVer_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.appVer_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public boolean hasRelease() {
        return this.release_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public Context.App.Release getRelease() {
        Context.App.Release release = this.release_;
        return release == null ? Context.App.Release.getDefaultInstance() : release;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public Context.App.ReleaseOrBuilder getReleaseOrBuilder() {
        return getRelease();
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public boolean hasInstallTime() {
        return this.installTime_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public Timestamp getInstallTime() {
        Timestamp timestamp = this.installTime_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public TimestampOrBuilder getInstallTimeOrBuilder() {
        return getInstallTime();
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public boolean hasFirstLaunchTime() {
        return this.firstLaunchTime_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public Timestamp getFirstLaunchTime() {
        Timestamp timestamp = this.firstLaunchTime_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public TimestampOrBuilder getFirstLaunchTimeOrBuilder() {
        return getFirstLaunchTime();
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public String getStorecat() {
        Object obj = this.storecat_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.storecat_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public ByteString getStorecatBytes() {
        Object obj = this.storecat_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.storecat_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public ProtocolStringList getStoresubcatList() {
        return this.storesubcat_;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public int getStoresubcatCount() {
        return this.storesubcat_.size();
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public String getStoresubcat(int i) {
        return (String) this.storesubcat_.get(i);
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public ByteString getStoresubcatBytes(int i) {
        return this.storesubcat_.getByteString(i);
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public String getFmwname() {
        Object obj = this.fmwname_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.fmwname_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public ByteString getFmwnameBytes() {
        Object obj = this.fmwname_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.fmwname_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public String getInstallReferrerUrl() {
        Object obj = this.installReferrerUrl_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.installReferrerUrl_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public ByteString getInstallReferrerUrlBytes() {
        Object obj = this.installReferrerUrl_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.installReferrerUrl_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public boolean hasInstallReferrerClickTimestamp() {
        return this.installReferrerClickTimestamp_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public Timestamp getInstallReferrerClickTimestamp() {
        Timestamp timestamp = this.installReferrerClickTimestamp_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public TimestampOrBuilder getInstallReferrerClickTimestampOrBuilder() {
        return getInstallReferrerClickTimestamp();
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public boolean hasInstallReferrerClickServerTimestamp() {
        return this.installReferrerClickServerTimestamp_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public Timestamp getInstallReferrerClickServerTimestamp() {
        Timestamp timestamp = this.installReferrerClickServerTimestamp_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public TimestampOrBuilder getInstallReferrerClickServerTimestampOrBuilder() {
        return getInstallReferrerClickServerTimestamp();
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public boolean hasInstallBeginServerTimestamp() {
        return this.installBeginServerTimestamp_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public Timestamp getInstallBeginServerTimestamp() {
        Timestamp timestamp = this.installBeginServerTimestamp_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public TimestampOrBuilder getInstallBeginServerTimestampOrBuilder() {
        return getInstallBeginServerTimestamp();
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public String getInstallVersion() {
        Object obj = this.installVersion_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.installVersion_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public ByteString getInstallVersionBytes() {
        Object obj = this.installVersion_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.installVersion_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public boolean getIsGooglePlayInstant() {
        return this.isGooglePlayInstant_;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public boolean hasSdkInstallTime() {
        return this.sdkInstallTime_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public Timestamp getSdkInstallTime() {
        Timestamp timestamp = this.sdkInstallTime_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public TimestampOrBuilder getSdkInstallTimeOrBuilder() {
        return getSdkInstallTime();
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
        if (!getAppNameBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.appName_);
        }
        if (!getAppVerBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.appVer_);
        }
        if (this.release_ != null) {
            codedOutputStream.writeMessage(3, getRelease());
        }
        if (this.installTime_ != null) {
            codedOutputStream.writeMessage(4, getInstallTime());
        }
        if (this.firstLaunchTime_ != null) {
            codedOutputStream.writeMessage(5, getFirstLaunchTime());
        }
        if (!getStorecatBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 6, this.storecat_);
        }
        for (int i = 0; i < this.storesubcat_.size(); i++) {
            GeneratedMessageV3.writeString(codedOutputStream, 7, this.storesubcat_.getRaw(i));
        }
        if (!getFmwnameBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 8, this.fmwname_);
        }
        if (!getInstallReferrerUrlBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 9, this.installReferrerUrl_);
        }
        if (this.installReferrerClickTimestamp_ != null) {
            codedOutputStream.writeMessage(10, getInstallReferrerClickTimestamp());
        }
        if (this.installReferrerClickServerTimestamp_ != null) {
            codedOutputStream.writeMessage(12, getInstallReferrerClickServerTimestamp());
        }
        if (this.installBeginServerTimestamp_ != null) {
            codedOutputStream.writeMessage(13, getInstallBeginServerTimestamp());
        }
        if (!getInstallVersionBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 14, this.installVersion_);
        }
        boolean z = this.isGooglePlayInstant_;
        if (z) {
            codedOutputStream.writeBool(15, z);
        }
        if (this.sdkInstallTime_ != null) {
            codedOutputStream.writeMessage(16, getSdkInstallTime());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int computeStringSize = !getAppNameBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.appName_) : 0;
        if (!getAppVerBytes().isEmpty()) {
            computeStringSize += GeneratedMessageV3.computeStringSize(2, this.appVer_);
        }
        if (this.release_ != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(3, getRelease());
        }
        if (this.installTime_ != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(4, getInstallTime());
        }
        if (this.firstLaunchTime_ != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(5, getFirstLaunchTime());
        }
        if (!getStorecatBytes().isEmpty()) {
            computeStringSize += GeneratedMessageV3.computeStringSize(6, this.storecat_);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.storesubcat_.size(); i3++) {
            i2 += GeneratedMessageV3.computeStringSizeNoTag(this.storesubcat_.getRaw(i3));
        }
        int size = computeStringSize + i2 + getStoresubcatList().size();
        if (!getFmwnameBytes().isEmpty()) {
            size += GeneratedMessageV3.computeStringSize(8, this.fmwname_);
        }
        if (!getInstallReferrerUrlBytes().isEmpty()) {
            size += GeneratedMessageV3.computeStringSize(9, this.installReferrerUrl_);
        }
        if (this.installReferrerClickTimestamp_ != null) {
            size += CodedOutputStream.computeMessageSize(10, getInstallReferrerClickTimestamp());
        }
        if (this.installReferrerClickServerTimestamp_ != null) {
            size += CodedOutputStream.computeMessageSize(12, getInstallReferrerClickServerTimestamp());
        }
        if (this.installBeginServerTimestamp_ != null) {
            size += CodedOutputStream.computeMessageSize(13, getInstallBeginServerTimestamp());
        }
        if (!getInstallVersionBytes().isEmpty()) {
            size += GeneratedMessageV3.computeStringSize(14, this.installVersion_);
        }
        boolean z = this.isGooglePlayInstant_;
        if (z) {
            size += CodedOutputStream.computeBoolSize(15, z);
        }
        if (this.sdkInstallTime_ != null) {
            size += CodedOutputStream.computeMessageSize(16, getSdkInstallTime());
        }
        int serializedSize = size + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof App)) {
            return super.equals(obj);
        }
        App app = (App) obj;
        if (!getAppName().equals(app.getAppName()) || !getAppVer().equals(app.getAppVer()) || hasRelease() != app.hasRelease()) {
            return false;
        }
        if ((hasRelease() && !getRelease().equals(app.getRelease())) || hasInstallTime() != app.hasInstallTime()) {
            return false;
        }
        if ((hasInstallTime() && !getInstallTime().equals(app.getInstallTime())) || hasFirstLaunchTime() != app.hasFirstLaunchTime()) {
            return false;
        }
        if ((hasFirstLaunchTime() && !getFirstLaunchTime().equals(app.getFirstLaunchTime())) || !getStorecat().equals(app.getStorecat()) || !getStoresubcatList().equals(app.getStoresubcatList()) || !getFmwname().equals(app.getFmwname()) || !getInstallReferrerUrl().equals(app.getInstallReferrerUrl()) || hasInstallReferrerClickTimestamp() != app.hasInstallReferrerClickTimestamp()) {
            return false;
        }
        if ((hasInstallReferrerClickTimestamp() && !getInstallReferrerClickTimestamp().equals(app.getInstallReferrerClickTimestamp())) || hasInstallReferrerClickServerTimestamp() != app.hasInstallReferrerClickServerTimestamp()) {
            return false;
        }
        if ((hasInstallReferrerClickServerTimestamp() && !getInstallReferrerClickServerTimestamp().equals(app.getInstallReferrerClickServerTimestamp())) || hasInstallBeginServerTimestamp() != app.hasInstallBeginServerTimestamp()) {
            return false;
        }
        if ((!hasInstallBeginServerTimestamp() || getInstallBeginServerTimestamp().equals(app.getInstallBeginServerTimestamp())) && getInstallVersion().equals(app.getInstallVersion()) && getIsGooglePlayInstant() == app.getIsGooglePlayInstant() && hasSdkInstallTime() == app.hasSdkInstallTime()) {
            return (!hasSdkInstallTime() || getSdkInstallTime().equals(app.getSdkInstallTime())) && this.unknownFields.equals(app.unknownFields);
        }
        return false;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getAppName().hashCode()) * 37) + 2) * 53) + getAppVer().hashCode();
        if (hasRelease()) {
            hashCode = (((hashCode * 37) + 3) * 53) + getRelease().hashCode();
        }
        if (hasInstallTime()) {
            hashCode = (((hashCode * 37) + 4) * 53) + getInstallTime().hashCode();
        }
        if (hasFirstLaunchTime()) {
            hashCode = (((hashCode * 37) + 5) * 53) + getFirstLaunchTime().hashCode();
        }
        int hashCode2 = (((hashCode * 37) + 6) * 53) + getStorecat().hashCode();
        if (getStoresubcatCount() > 0) {
            hashCode2 = (((hashCode2 * 37) + 7) * 53) + getStoresubcatList().hashCode();
        }
        int hashCode3 = (((((((hashCode2 * 37) + 8) * 53) + getFmwname().hashCode()) * 37) + 9) * 53) + getInstallReferrerUrl().hashCode();
        if (hasInstallReferrerClickTimestamp()) {
            hashCode3 = (((hashCode3 * 37) + 10) * 53) + getInstallReferrerClickTimestamp().hashCode();
        }
        if (hasInstallReferrerClickServerTimestamp()) {
            hashCode3 = (((hashCode3 * 37) + 12) * 53) + getInstallReferrerClickServerTimestamp().hashCode();
        }
        if (hasInstallBeginServerTimestamp()) {
            hashCode3 = (((hashCode3 * 37) + 13) * 53) + getInstallBeginServerTimestamp().hashCode();
        }
        int hashCode4 = (((((((hashCode3 * 37) + 14) * 53) + getInstallVersion().hashCode()) * 37) + 15) * 53) + Internal.hashBoolean(getIsGooglePlayInstant());
        if (hasSdkInstallTime()) {
            hashCode4 = (((hashCode4 * 37) + 16) * 53) + getSdkInstallTime().hashCode();
        }
        int hashCode5 = (hashCode4 * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode5;
        return hashCode5;
    }

    public static App parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (App) PARSER.parseFrom(byteBuffer);
    }

    public static App parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (App) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static App parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (App) PARSER.parseFrom(byteString);
    }

    public static App parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (App) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static App parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (App) PARSER.parseFrom(bArr);
    }

    public static App parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (App) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static App parseFrom(InputStream inputStream) throws IOException {
        return (App) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static App parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (App) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static App parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (App) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static App parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (App) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static App parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (App) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static App parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (App) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(App app) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(app);
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

    public static final class Builder extends GeneratedMessageV3.Builder implements AppOrBuilder {
        private Object appName_;
        private Object appVer_;
        private int bitField0_;
        private SingleFieldBuilderV3 firstLaunchTimeBuilder_;
        private Timestamp firstLaunchTime_;
        private Object fmwname_;
        private SingleFieldBuilderV3 installBeginServerTimestampBuilder_;
        private Timestamp installBeginServerTimestamp_;
        private SingleFieldBuilderV3 installReferrerClickServerTimestampBuilder_;
        private Timestamp installReferrerClickServerTimestamp_;
        private SingleFieldBuilderV3 installReferrerClickTimestampBuilder_;
        private Timestamp installReferrerClickTimestamp_;
        private Object installReferrerUrl_;
        private SingleFieldBuilderV3 installTimeBuilder_;
        private Timestamp installTime_;
        private Object installVersion_;
        private boolean isGooglePlayInstant_;
        private SingleFieldBuilderV3 releaseBuilder_;
        private Context.App.Release release_;
        private SingleFieldBuilderV3 sdkInstallTimeBuilder_;
        private Timestamp sdkInstallTime_;
        private Object storecat_;
        private LazyStringList storesubcat_;

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_App_descriptor;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_App_fieldAccessorTable.ensureFieldAccessorsInitialized(App.class, Builder.class);
        }

        private Builder() {
            this.appName_ = "";
            this.appVer_ = "";
            this.storecat_ = "";
            this.storesubcat_ = LazyStringArrayList.EMPTY;
            this.fmwname_ = "";
            this.installReferrerUrl_ = "";
            this.installVersion_ = "";
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.appName_ = "";
            this.appVer_ = "";
            this.storecat_ = "";
            this.storesubcat_ = LazyStringArrayList.EMPTY;
            this.fmwname_ = "";
            this.installReferrerUrl_ = "";
            this.installVersion_ = "";
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.appName_ = "";
            this.appVer_ = "";
            if (this.releaseBuilder_ == null) {
                this.release_ = null;
            } else {
                this.release_ = null;
                this.releaseBuilder_ = null;
            }
            if (this.installTimeBuilder_ == null) {
                this.installTime_ = null;
            } else {
                this.installTime_ = null;
                this.installTimeBuilder_ = null;
            }
            if (this.firstLaunchTimeBuilder_ == null) {
                this.firstLaunchTime_ = null;
            } else {
                this.firstLaunchTime_ = null;
                this.firstLaunchTimeBuilder_ = null;
            }
            this.storecat_ = "";
            this.storesubcat_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -2;
            this.fmwname_ = "";
            this.installReferrerUrl_ = "";
            if (this.installReferrerClickTimestampBuilder_ == null) {
                this.installReferrerClickTimestamp_ = null;
            } else {
                this.installReferrerClickTimestamp_ = null;
                this.installReferrerClickTimestampBuilder_ = null;
            }
            if (this.installReferrerClickServerTimestampBuilder_ == null) {
                this.installReferrerClickServerTimestamp_ = null;
            } else {
                this.installReferrerClickServerTimestamp_ = null;
                this.installReferrerClickServerTimestampBuilder_ = null;
            }
            if (this.installBeginServerTimestampBuilder_ == null) {
                this.installBeginServerTimestamp_ = null;
            } else {
                this.installBeginServerTimestamp_ = null;
                this.installBeginServerTimestampBuilder_ = null;
            }
            this.installVersion_ = "";
            this.isGooglePlayInstant_ = false;
            if (this.sdkInstallTimeBuilder_ == null) {
                this.sdkInstallTime_ = null;
            } else {
                this.sdkInstallTime_ = null;
                this.sdkInstallTimeBuilder_ = null;
            }
            return this;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_App_descriptor;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* renamed from: getDefaultInstanceForType */
        public App mo3244getDefaultInstanceForType() {
            return App.getDefaultInstance();
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public App build() {
            App buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public App buildPartial() {
            App app = new App(this);
            app.appName_ = this.appName_;
            app.appVer_ = this.appVer_;
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.releaseBuilder_;
            if (singleFieldBuilderV3 == null) {
                app.release_ = this.release_;
            } else {
                app.release_ = (Context.App.Release) singleFieldBuilderV3.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV32 = this.installTimeBuilder_;
            if (singleFieldBuilderV32 == null) {
                app.installTime_ = this.installTime_;
            } else {
                app.installTime_ = (Timestamp) singleFieldBuilderV32.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV33 = this.firstLaunchTimeBuilder_;
            if (singleFieldBuilderV33 == null) {
                app.firstLaunchTime_ = this.firstLaunchTime_;
            } else {
                app.firstLaunchTime_ = (Timestamp) singleFieldBuilderV33.build();
            }
            app.storecat_ = this.storecat_;
            if ((this.bitField0_ & 1) != 0) {
                this.storesubcat_ = this.storesubcat_.getUnmodifiableView();
                this.bitField0_ &= -2;
            }
            app.storesubcat_ = this.storesubcat_;
            app.fmwname_ = this.fmwname_;
            app.installReferrerUrl_ = this.installReferrerUrl_;
            SingleFieldBuilderV3 singleFieldBuilderV34 = this.installReferrerClickTimestampBuilder_;
            if (singleFieldBuilderV34 == null) {
                app.installReferrerClickTimestamp_ = this.installReferrerClickTimestamp_;
            } else {
                app.installReferrerClickTimestamp_ = (Timestamp) singleFieldBuilderV34.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV35 = this.installReferrerClickServerTimestampBuilder_;
            if (singleFieldBuilderV35 == null) {
                app.installReferrerClickServerTimestamp_ = this.installReferrerClickServerTimestamp_;
            } else {
                app.installReferrerClickServerTimestamp_ = (Timestamp) singleFieldBuilderV35.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV36 = this.installBeginServerTimestampBuilder_;
            if (singleFieldBuilderV36 == null) {
                app.installBeginServerTimestamp_ = this.installBeginServerTimestamp_;
            } else {
                app.installBeginServerTimestamp_ = (Timestamp) singleFieldBuilderV36.build();
            }
            app.installVersion_ = this.installVersion_;
            app.isGooglePlayInstant_ = this.isGooglePlayInstant_;
            SingleFieldBuilderV3 singleFieldBuilderV37 = this.sdkInstallTimeBuilder_;
            if (singleFieldBuilderV37 == null) {
                app.sdkInstallTime_ = this.sdkInstallTime_;
            } else {
                app.sdkInstallTime_ = (Timestamp) singleFieldBuilderV37.build();
            }
            onBuilt();
            return app;
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
            if (message instanceof App) {
                return mergeFrom((App) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(App app) {
            if (app == App.getDefaultInstance()) {
                return this;
            }
            if (!app.getAppName().isEmpty()) {
                this.appName_ = app.appName_;
                onChanged();
            }
            if (!app.getAppVer().isEmpty()) {
                this.appVer_ = app.appVer_;
                onChanged();
            }
            if (app.hasRelease()) {
                mergeRelease(app.getRelease());
            }
            if (app.hasInstallTime()) {
                mergeInstallTime(app.getInstallTime());
            }
            if (app.hasFirstLaunchTime()) {
                mergeFirstLaunchTime(app.getFirstLaunchTime());
            }
            if (!app.getStorecat().isEmpty()) {
                this.storecat_ = app.storecat_;
                onChanged();
            }
            if (!app.storesubcat_.isEmpty()) {
                if (this.storesubcat_.isEmpty()) {
                    this.storesubcat_ = app.storesubcat_;
                    this.bitField0_ &= -2;
                } else {
                    ensureStoresubcatIsMutable();
                    this.storesubcat_.addAll(app.storesubcat_);
                }
                onChanged();
            }
            if (!app.getFmwname().isEmpty()) {
                this.fmwname_ = app.fmwname_;
                onChanged();
            }
            if (!app.getInstallReferrerUrl().isEmpty()) {
                this.installReferrerUrl_ = app.installReferrerUrl_;
                onChanged();
            }
            if (app.hasInstallReferrerClickTimestamp()) {
                mergeInstallReferrerClickTimestamp(app.getInstallReferrerClickTimestamp());
            }
            if (app.hasInstallReferrerClickServerTimestamp()) {
                mergeInstallReferrerClickServerTimestamp(app.getInstallReferrerClickServerTimestamp());
            }
            if (app.hasInstallBeginServerTimestamp()) {
                mergeInstallBeginServerTimestamp(app.getInstallBeginServerTimestamp());
            }
            if (!app.getInstallVersion().isEmpty()) {
                this.installVersion_ = app.installVersion_;
                onChanged();
            }
            if (app.getIsGooglePlayInstant()) {
                setIsGooglePlayInstant(app.getIsGooglePlayInstant());
            }
            if (app.hasSdkInstallTime()) {
                mergeSdkInstallTime(app.getSdkInstallTime());
            }
            mergeUnknownFields(((GeneratedMessageV3) app).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            App app = null;
            try {
                try {
                    App app2 = (App) App.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (app2 != null) {
                        mergeFrom(app2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    App app3 = (App) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        app = app3;
                        if (app != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (app != null) {
                    mergeFrom(app);
                }
                throw th;
            }
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public String getAppName() {
            Object obj = this.appName_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.appName_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public ByteString getAppNameBytes() {
            Object obj = this.appName_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.appName_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setAppName(String str) {
            str.getClass();
            this.appName_ = str;
            onChanged();
            return this;
        }

        public Builder clearAppName() {
            this.appName_ = App.getDefaultInstance().getAppName();
            onChanged();
            return this;
        }

        public Builder setAppNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.appName_ = byteString;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public String getAppVer() {
            Object obj = this.appVer_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.appVer_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public ByteString getAppVerBytes() {
            Object obj = this.appVer_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.appVer_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setAppVer(String str) {
            str.getClass();
            this.appVer_ = str;
            onChanged();
            return this;
        }

        public Builder clearAppVer() {
            this.appVer_ = App.getDefaultInstance().getAppVer();
            onChanged();
            return this;
        }

        public Builder setAppVerBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.appVer_ = byteString;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public boolean hasRelease() {
            return (this.releaseBuilder_ == null && this.release_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public Context.App.Release getRelease() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.releaseBuilder_;
            if (singleFieldBuilderV3 == null) {
                Context.App.Release release = this.release_;
                return release == null ? Context.App.Release.getDefaultInstance() : release;
            }
            return (Context.App.Release) singleFieldBuilderV3.getMessage();
        }

        public Builder setRelease(Context.App.Release release) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.releaseBuilder_;
            if (singleFieldBuilderV3 == null) {
                release.getClass();
                this.release_ = release;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(release);
            }
            return this;
        }

        public Builder setRelease(Context.App.Release.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.releaseBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.release_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeRelease(Context.App.Release release) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.releaseBuilder_;
            if (singleFieldBuilderV3 == null) {
                Context.App.Release release2 = this.release_;
                if (release2 != null) {
                    this.release_ = Context.App.Release.newBuilder(release2).mergeFrom(release).buildPartial();
                } else {
                    this.release_ = release;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(release);
            }
            return this;
        }

        public Builder clearRelease() {
            if (this.releaseBuilder_ == null) {
                this.release_ = null;
                onChanged();
            } else {
                this.release_ = null;
                this.releaseBuilder_ = null;
            }
            return this;
        }

        public Context.App.Release.Builder getReleaseBuilder() {
            onChanged();
            return (Context.App.Release.Builder) getReleaseFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public Context.App.ReleaseOrBuilder getReleaseOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.releaseBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (Context.App.ReleaseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            Context.App.Release release = this.release_;
            return release == null ? Context.App.Release.getDefaultInstance() : release;
        }

        private SingleFieldBuilderV3 getReleaseFieldBuilder() {
            if (this.releaseBuilder_ == null) {
                this.releaseBuilder_ = new SingleFieldBuilderV3(getRelease(), getParentForChildren(), isClean());
                this.release_ = null;
            }
            return this.releaseBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public boolean hasInstallTime() {
            return (this.installTimeBuilder_ == null && this.installTime_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public Timestamp getInstallTime() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.installTimeBuilder_;
            if (singleFieldBuilderV3 == null) {
                Timestamp timestamp = this.installTime_;
                return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
            }
            return (Timestamp) singleFieldBuilderV3.getMessage();
        }

        public Builder setInstallTime(Timestamp timestamp) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.installTimeBuilder_;
            if (singleFieldBuilderV3 == null) {
                timestamp.getClass();
                this.installTime_ = timestamp;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(timestamp);
            }
            return this;
        }

        public Builder setInstallTime(Timestamp.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.installTimeBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.installTime_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeInstallTime(Timestamp timestamp) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.installTimeBuilder_;
            if (singleFieldBuilderV3 == null) {
                Timestamp timestamp2 = this.installTime_;
                if (timestamp2 != null) {
                    this.installTime_ = Timestamp.newBuilder(timestamp2).mergeFrom(timestamp).buildPartial();
                } else {
                    this.installTime_ = timestamp;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(timestamp);
            }
            return this;
        }

        public Builder clearInstallTime() {
            if (this.installTimeBuilder_ == null) {
                this.installTime_ = null;
                onChanged();
            } else {
                this.installTime_ = null;
                this.installTimeBuilder_ = null;
            }
            return this;
        }

        public Timestamp.Builder getInstallTimeBuilder() {
            onChanged();
            return (Timestamp.Builder) getInstallTimeFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public TimestampOrBuilder getInstallTimeOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.installTimeBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (TimestampOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            Timestamp timestamp = this.installTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        private SingleFieldBuilderV3 getInstallTimeFieldBuilder() {
            if (this.installTimeBuilder_ == null) {
                this.installTimeBuilder_ = new SingleFieldBuilderV3(getInstallTime(), getParentForChildren(), isClean());
                this.installTime_ = null;
            }
            return this.installTimeBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public boolean hasFirstLaunchTime() {
            return (this.firstLaunchTimeBuilder_ == null && this.firstLaunchTime_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public Timestamp getFirstLaunchTime() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.firstLaunchTimeBuilder_;
            if (singleFieldBuilderV3 == null) {
                Timestamp timestamp = this.firstLaunchTime_;
                return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
            }
            return (Timestamp) singleFieldBuilderV3.getMessage();
        }

        public Builder setFirstLaunchTime(Timestamp timestamp) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.firstLaunchTimeBuilder_;
            if (singleFieldBuilderV3 == null) {
                timestamp.getClass();
                this.firstLaunchTime_ = timestamp;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(timestamp);
            }
            return this;
        }

        public Builder setFirstLaunchTime(Timestamp.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.firstLaunchTimeBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.firstLaunchTime_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeFirstLaunchTime(Timestamp timestamp) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.firstLaunchTimeBuilder_;
            if (singleFieldBuilderV3 == null) {
                Timestamp timestamp2 = this.firstLaunchTime_;
                if (timestamp2 != null) {
                    this.firstLaunchTime_ = Timestamp.newBuilder(timestamp2).mergeFrom(timestamp).buildPartial();
                } else {
                    this.firstLaunchTime_ = timestamp;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(timestamp);
            }
            return this;
        }

        public Builder clearFirstLaunchTime() {
            if (this.firstLaunchTimeBuilder_ == null) {
                this.firstLaunchTime_ = null;
                onChanged();
            } else {
                this.firstLaunchTime_ = null;
                this.firstLaunchTimeBuilder_ = null;
            }
            return this;
        }

        public Timestamp.Builder getFirstLaunchTimeBuilder() {
            onChanged();
            return (Timestamp.Builder) getFirstLaunchTimeFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public TimestampOrBuilder getFirstLaunchTimeOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.firstLaunchTimeBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (TimestampOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            Timestamp timestamp = this.firstLaunchTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        private SingleFieldBuilderV3 getFirstLaunchTimeFieldBuilder() {
            if (this.firstLaunchTimeBuilder_ == null) {
                this.firstLaunchTimeBuilder_ = new SingleFieldBuilderV3(getFirstLaunchTime(), getParentForChildren(), isClean());
                this.firstLaunchTime_ = null;
            }
            return this.firstLaunchTimeBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public String getStorecat() {
            Object obj = this.storecat_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.storecat_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public ByteString getStorecatBytes() {
            Object obj = this.storecat_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.storecat_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setStorecat(String str) {
            str.getClass();
            this.storecat_ = str;
            onChanged();
            return this;
        }

        public Builder clearStorecat() {
            this.storecat_ = App.getDefaultInstance().getStorecat();
            onChanged();
            return this;
        }

        public Builder setStorecatBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.storecat_ = byteString;
            onChanged();
            return this;
        }

        private void ensureStoresubcatIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.storesubcat_ = new LazyStringArrayList(this.storesubcat_);
                this.bitField0_ |= 1;
            }
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public ProtocolStringList getStoresubcatList() {
            return this.storesubcat_.getUnmodifiableView();
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public int getStoresubcatCount() {
            return this.storesubcat_.size();
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public String getStoresubcat(int i) {
            return (String) this.storesubcat_.get(i);
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public ByteString getStoresubcatBytes(int i) {
            return this.storesubcat_.getByteString(i);
        }

        public Builder setStoresubcat(int i, String str) {
            str.getClass();
            ensureStoresubcatIsMutable();
            this.storesubcat_.set(i, str);
            onChanged();
            return this;
        }

        public Builder addStoresubcat(String str) {
            str.getClass();
            ensureStoresubcatIsMutable();
            this.storesubcat_.add((LazyStringList) str);
            onChanged();
            return this;
        }

        public Builder addAllStoresubcat(Iterable<String> iterable) {
            ensureStoresubcatIsMutable();
            AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.storesubcat_);
            onChanged();
            return this;
        }

        public Builder clearStoresubcat() {
            this.storesubcat_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder addStoresubcatBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            ensureStoresubcatIsMutable();
            this.storesubcat_.add(byteString);
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public String getFmwname() {
            Object obj = this.fmwname_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.fmwname_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public ByteString getFmwnameBytes() {
            Object obj = this.fmwname_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.fmwname_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setFmwname(String str) {
            str.getClass();
            this.fmwname_ = str;
            onChanged();
            return this;
        }

        public Builder clearFmwname() {
            this.fmwname_ = App.getDefaultInstance().getFmwname();
            onChanged();
            return this;
        }

        public Builder setFmwnameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.fmwname_ = byteString;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public String getInstallReferrerUrl() {
            Object obj = this.installReferrerUrl_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.installReferrerUrl_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public ByteString getInstallReferrerUrlBytes() {
            Object obj = this.installReferrerUrl_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.installReferrerUrl_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setInstallReferrerUrl(String str) {
            str.getClass();
            this.installReferrerUrl_ = str;
            onChanged();
            return this;
        }

        public Builder clearInstallReferrerUrl() {
            this.installReferrerUrl_ = App.getDefaultInstance().getInstallReferrerUrl();
            onChanged();
            return this;
        }

        public Builder setInstallReferrerUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.installReferrerUrl_ = byteString;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public boolean hasInstallReferrerClickTimestamp() {
            return (this.installReferrerClickTimestampBuilder_ == null && this.installReferrerClickTimestamp_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public Timestamp getInstallReferrerClickTimestamp() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.installReferrerClickTimestampBuilder_;
            if (singleFieldBuilderV3 == null) {
                Timestamp timestamp = this.installReferrerClickTimestamp_;
                return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
            }
            return (Timestamp) singleFieldBuilderV3.getMessage();
        }

        public Builder setInstallReferrerClickTimestamp(Timestamp timestamp) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.installReferrerClickTimestampBuilder_;
            if (singleFieldBuilderV3 == null) {
                timestamp.getClass();
                this.installReferrerClickTimestamp_ = timestamp;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(timestamp);
            }
            return this;
        }

        public Builder setInstallReferrerClickTimestamp(Timestamp.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.installReferrerClickTimestampBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.installReferrerClickTimestamp_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeInstallReferrerClickTimestamp(Timestamp timestamp) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.installReferrerClickTimestampBuilder_;
            if (singleFieldBuilderV3 == null) {
                Timestamp timestamp2 = this.installReferrerClickTimestamp_;
                if (timestamp2 != null) {
                    this.installReferrerClickTimestamp_ = Timestamp.newBuilder(timestamp2).mergeFrom(timestamp).buildPartial();
                } else {
                    this.installReferrerClickTimestamp_ = timestamp;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(timestamp);
            }
            return this;
        }

        public Builder clearInstallReferrerClickTimestamp() {
            if (this.installReferrerClickTimestampBuilder_ == null) {
                this.installReferrerClickTimestamp_ = null;
                onChanged();
            } else {
                this.installReferrerClickTimestamp_ = null;
                this.installReferrerClickTimestampBuilder_ = null;
            }
            return this;
        }

        public Timestamp.Builder getInstallReferrerClickTimestampBuilder() {
            onChanged();
            return (Timestamp.Builder) getInstallReferrerClickTimestampFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public TimestampOrBuilder getInstallReferrerClickTimestampOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.installReferrerClickTimestampBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (TimestampOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            Timestamp timestamp = this.installReferrerClickTimestamp_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        private SingleFieldBuilderV3 getInstallReferrerClickTimestampFieldBuilder() {
            if (this.installReferrerClickTimestampBuilder_ == null) {
                this.installReferrerClickTimestampBuilder_ = new SingleFieldBuilderV3(getInstallReferrerClickTimestamp(), getParentForChildren(), isClean());
                this.installReferrerClickTimestamp_ = null;
            }
            return this.installReferrerClickTimestampBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public boolean hasInstallReferrerClickServerTimestamp() {
            return (this.installReferrerClickServerTimestampBuilder_ == null && this.installReferrerClickServerTimestamp_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public Timestamp getInstallReferrerClickServerTimestamp() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.installReferrerClickServerTimestampBuilder_;
            if (singleFieldBuilderV3 == null) {
                Timestamp timestamp = this.installReferrerClickServerTimestamp_;
                return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
            }
            return (Timestamp) singleFieldBuilderV3.getMessage();
        }

        public Builder setInstallReferrerClickServerTimestamp(Timestamp timestamp) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.installReferrerClickServerTimestampBuilder_;
            if (singleFieldBuilderV3 == null) {
                timestamp.getClass();
                this.installReferrerClickServerTimestamp_ = timestamp;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(timestamp);
            }
            return this;
        }

        public Builder setInstallReferrerClickServerTimestamp(Timestamp.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.installReferrerClickServerTimestampBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.installReferrerClickServerTimestamp_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeInstallReferrerClickServerTimestamp(Timestamp timestamp) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.installReferrerClickServerTimestampBuilder_;
            if (singleFieldBuilderV3 == null) {
                Timestamp timestamp2 = this.installReferrerClickServerTimestamp_;
                if (timestamp2 != null) {
                    this.installReferrerClickServerTimestamp_ = Timestamp.newBuilder(timestamp2).mergeFrom(timestamp).buildPartial();
                } else {
                    this.installReferrerClickServerTimestamp_ = timestamp;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(timestamp);
            }
            return this;
        }

        public Builder clearInstallReferrerClickServerTimestamp() {
            if (this.installReferrerClickServerTimestampBuilder_ == null) {
                this.installReferrerClickServerTimestamp_ = null;
                onChanged();
            } else {
                this.installReferrerClickServerTimestamp_ = null;
                this.installReferrerClickServerTimestampBuilder_ = null;
            }
            return this;
        }

        public Timestamp.Builder getInstallReferrerClickServerTimestampBuilder() {
            onChanged();
            return (Timestamp.Builder) getInstallReferrerClickServerTimestampFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public TimestampOrBuilder getInstallReferrerClickServerTimestampOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.installReferrerClickServerTimestampBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (TimestampOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            Timestamp timestamp = this.installReferrerClickServerTimestamp_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        private SingleFieldBuilderV3 getInstallReferrerClickServerTimestampFieldBuilder() {
            if (this.installReferrerClickServerTimestampBuilder_ == null) {
                this.installReferrerClickServerTimestampBuilder_ = new SingleFieldBuilderV3(getInstallReferrerClickServerTimestamp(), getParentForChildren(), isClean());
                this.installReferrerClickServerTimestamp_ = null;
            }
            return this.installReferrerClickServerTimestampBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public boolean hasInstallBeginServerTimestamp() {
            return (this.installBeginServerTimestampBuilder_ == null && this.installBeginServerTimestamp_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public Timestamp getInstallBeginServerTimestamp() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.installBeginServerTimestampBuilder_;
            if (singleFieldBuilderV3 == null) {
                Timestamp timestamp = this.installBeginServerTimestamp_;
                return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
            }
            return (Timestamp) singleFieldBuilderV3.getMessage();
        }

        public Builder setInstallBeginServerTimestamp(Timestamp timestamp) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.installBeginServerTimestampBuilder_;
            if (singleFieldBuilderV3 == null) {
                timestamp.getClass();
                this.installBeginServerTimestamp_ = timestamp;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(timestamp);
            }
            return this;
        }

        public Builder setInstallBeginServerTimestamp(Timestamp.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.installBeginServerTimestampBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.installBeginServerTimestamp_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeInstallBeginServerTimestamp(Timestamp timestamp) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.installBeginServerTimestampBuilder_;
            if (singleFieldBuilderV3 == null) {
                Timestamp timestamp2 = this.installBeginServerTimestamp_;
                if (timestamp2 != null) {
                    this.installBeginServerTimestamp_ = Timestamp.newBuilder(timestamp2).mergeFrom(timestamp).buildPartial();
                } else {
                    this.installBeginServerTimestamp_ = timestamp;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(timestamp);
            }
            return this;
        }

        public Builder clearInstallBeginServerTimestamp() {
            if (this.installBeginServerTimestampBuilder_ == null) {
                this.installBeginServerTimestamp_ = null;
                onChanged();
            } else {
                this.installBeginServerTimestamp_ = null;
                this.installBeginServerTimestampBuilder_ = null;
            }
            return this;
        }

        public Timestamp.Builder getInstallBeginServerTimestampBuilder() {
            onChanged();
            return (Timestamp.Builder) getInstallBeginServerTimestampFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public TimestampOrBuilder getInstallBeginServerTimestampOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.installBeginServerTimestampBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (TimestampOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            Timestamp timestamp = this.installBeginServerTimestamp_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        private SingleFieldBuilderV3 getInstallBeginServerTimestampFieldBuilder() {
            if (this.installBeginServerTimestampBuilder_ == null) {
                this.installBeginServerTimestampBuilder_ = new SingleFieldBuilderV3(getInstallBeginServerTimestamp(), getParentForChildren(), isClean());
                this.installBeginServerTimestamp_ = null;
            }
            return this.installBeginServerTimestampBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public String getInstallVersion() {
            Object obj = this.installVersion_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.installVersion_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public ByteString getInstallVersionBytes() {
            Object obj = this.installVersion_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.installVersion_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setInstallVersion(String str) {
            str.getClass();
            this.installVersion_ = str;
            onChanged();
            return this;
        }

        public Builder clearInstallVersion() {
            this.installVersion_ = App.getDefaultInstance().getInstallVersion();
            onChanged();
            return this;
        }

        public Builder setInstallVersionBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.installVersion_ = byteString;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public boolean getIsGooglePlayInstant() {
            return this.isGooglePlayInstant_;
        }

        public Builder setIsGooglePlayInstant(boolean z) {
            this.isGooglePlayInstant_ = z;
            onChanged();
            return this;
        }

        public Builder clearIsGooglePlayInstant() {
            this.isGooglePlayInstant_ = false;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public boolean hasSdkInstallTime() {
            return (this.sdkInstallTimeBuilder_ == null && this.sdkInstallTime_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public Timestamp getSdkInstallTime() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.sdkInstallTimeBuilder_;
            if (singleFieldBuilderV3 == null) {
                Timestamp timestamp = this.sdkInstallTime_;
                return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
            }
            return (Timestamp) singleFieldBuilderV3.getMessage();
        }

        public Builder setSdkInstallTime(Timestamp timestamp) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.sdkInstallTimeBuilder_;
            if (singleFieldBuilderV3 == null) {
                timestamp.getClass();
                this.sdkInstallTime_ = timestamp;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(timestamp);
            }
            return this;
        }

        public Builder setSdkInstallTime(Timestamp.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.sdkInstallTimeBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.sdkInstallTime_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeSdkInstallTime(Timestamp timestamp) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.sdkInstallTimeBuilder_;
            if (singleFieldBuilderV3 == null) {
                Timestamp timestamp2 = this.sdkInstallTime_;
                if (timestamp2 != null) {
                    this.sdkInstallTime_ = Timestamp.newBuilder(timestamp2).mergeFrom(timestamp).buildPartial();
                } else {
                    this.sdkInstallTime_ = timestamp;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(timestamp);
            }
            return this;
        }

        public Builder clearSdkInstallTime() {
            if (this.sdkInstallTimeBuilder_ == null) {
                this.sdkInstallTime_ = null;
                onChanged();
            } else {
                this.sdkInstallTime_ = null;
                this.sdkInstallTimeBuilder_ = null;
            }
            return this;
        }

        public Timestamp.Builder getSdkInstallTimeBuilder() {
            onChanged();
            return (Timestamp.Builder) getSdkInstallTimeFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public TimestampOrBuilder getSdkInstallTimeOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.sdkInstallTimeBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (TimestampOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            Timestamp timestamp = this.sdkInstallTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        private SingleFieldBuilderV3 getSdkInstallTimeFieldBuilder() {
            if (this.sdkInstallTimeBuilder_ == null) {
                this.sdkInstallTimeBuilder_ = new SingleFieldBuilderV3(getSdkInstallTime(), getParentForChildren(), isClean());
                this.sdkInstallTime_ = null;
            }
            return this.sdkInstallTimeBuilder_;
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

    public static App getDefaultInstance() {
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
    public App mo3244getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
