package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.AbstractMessageLite;
import com.explorestack.protobuf.AbstractParser;
import com.explorestack.protobuf.BoolValue;
import com.explorestack.protobuf.BoolValueOrBuilder;
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
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.StringValueOrBuilder;
import com.explorestack.protobuf.UnknownFieldSet;
import io.bidmachine.protobuf.sdk.MaskedSignals;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class Regs extends GeneratedMessageV3 implements RegsOrBuilder {
    public static final int CMP_FIELD_NUMBER = 2;
    public static final int MASKED_SIGNALS_FIELD_NUMBER = 5;
    public static final int PERSISTED_MODE_FIELD_NUMBER = 4;
    public static final int PUB_FIELD_NUMBER = 1;
    public static final int RESTRICTION_KINDS_FIELD_NUMBER = 3;
    private static final long serialVersionUID = 0;
    private CMP cmp_;
    private MaskedSignals maskedSignals_;
    private byte memoizedIsInitialized;
    private int persistedMode_;
    private Pub pub_;
    private int restrictionKindsMemoizedSerializedSize;
    private List<Integer> restrictionKinds_;
    private static final Internal.ListAdapter.Converter restrictionKinds_converter_ = new Internal.ListAdapter.Converter() { // from class: io.bidmachine.protobuf.sdk.Regs.1
        @Override // com.explorestack.protobuf.Internal.ListAdapter.Converter
        public RestrictionKind convert(Integer num) {
            RestrictionKind valueOf = RestrictionKind.valueOf(num.intValue());
            return valueOf == null ? RestrictionKind.UNRECOGNIZED : valueOf;
        }
    };
    private static final Regs DEFAULT_INSTANCE = new Regs();
    private static final Parser PARSER = new AbstractParser() { // from class: io.bidmachine.protobuf.sdk.Regs.2
        @Override // com.explorestack.protobuf.Parser
        public Regs parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new Regs(codedInputStream, extensionRegistryLite);
        }
    };

    public interface CMPOrBuilder extends MessageOrBuilder {
        StringValue getCcpa();

        StringValueOrBuilder getCcpaOrBuilder();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo3244getDefaultInstanceForType();

        StringValue getGpp();

        StringValueOrBuilder getGppOrBuilder();

        int getGppSid(int i);

        int getGppSidCount();

        List<Integer> getGppSidList();

        StringValue getTcfV1String();

        StringValueOrBuilder getTcfV1StringOrBuilder();

        BoolValue getTcfV1Zone();

        BoolValueOrBuilder getTcfV1ZoneOrBuilder();

        StringValue getTcfV2String();

        StringValueOrBuilder getTcfV2StringOrBuilder();

        BoolValue getTcfV2Zone();

        BoolValueOrBuilder getTcfV2ZoneOrBuilder();

        boolean hasCcpa();

        boolean hasGpp();

        boolean hasTcfV1String();

        boolean hasTcfV1Zone();

        boolean hasTcfV2String();

        boolean hasTcfV2Zone();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public interface PubOrBuilder extends MessageOrBuilder {
        StringValue getCcpa();

        StringValueOrBuilder getCcpaOrBuilder();

        StringValue getConsentString();

        StringValueOrBuilder getConsentStringOrBuilder();

        BoolValue getCoppa();

        BoolValueOrBuilder getCoppaOrBuilder();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo3244getDefaultInstanceForType();

        BoolValue getGdprConsent();

        BoolValueOrBuilder getGdprConsentOrBuilder();

        BoolValue getGdprZone();

        BoolValueOrBuilder getGdprZoneOrBuilder();

        StringValue getGpp();

        StringValueOrBuilder getGppOrBuilder();

        int getGppSid(int i);

        int getGppSidCount();

        List<Integer> getGppSidList();

        BoolValue getNonPersonalized();

        BoolValueOrBuilder getNonPersonalizedOrBuilder();

        boolean hasCcpa();

        boolean hasConsentString();

        boolean hasCoppa();

        boolean hasGdprConsent();

        boolean hasGdprZone();

        boolean hasGpp();

        boolean hasNonPersonalized();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    private Regs(GeneratedMessageV3.Builder builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private Regs() {
        this.memoizedIsInitialized = (byte) -1;
        this.restrictionKinds_ = Collections.emptyList();
        this.persistedMode_ = 0;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new Regs();
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private Regs(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                            Pub pub = this.pub_;
                            Pub.Builder builder = pub != null ? pub.toBuilder() : null;
                            Pub pub2 = (Pub) codedInputStream.readMessage(Pub.parser(), extensionRegistryLite);
                            this.pub_ = pub2;
                            if (builder != null) {
                                builder.mergeFrom(pub2);
                                this.pub_ = builder.buildPartial();
                            }
                        } else if (readTag == 18) {
                            CMP cmp = this.cmp_;
                            CMP.Builder builder2 = cmp != null ? cmp.toBuilder() : null;
                            CMP cmp2 = (CMP) codedInputStream.readMessage(CMP.parser(), extensionRegistryLite);
                            this.cmp_ = cmp2;
                            if (builder2 != null) {
                                builder2.mergeFrom(cmp2);
                                this.cmp_ = builder2.buildPartial();
                            }
                        } else if (readTag == 24) {
                            int readEnum = codedInputStream.readEnum();
                            z2 = z2;
                            if (!z2) {
                                this.restrictionKinds_ = new ArrayList();
                                z2 = true;
                            }
                            this.restrictionKinds_.add(Integer.valueOf(readEnum));
                        } else if (readTag == 26) {
                            int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                            z2 = z2;
                            while (codedInputStream.getBytesUntilLimit() > 0) {
                                int readEnum2 = codedInputStream.readEnum();
                                if (!z2) {
                                    this.restrictionKinds_ = new ArrayList();
                                    z2 = true;
                                }
                                this.restrictionKinds_.add(Integer.valueOf(readEnum2));
                                z2 = z2;
                            }
                            codedInputStream.popLimit(pushLimit);
                        } else if (readTag == 32) {
                            this.persistedMode_ = codedInputStream.readEnum();
                        } else if (readTag == 42) {
                            MaskedSignals maskedSignals = this.maskedSignals_;
                            MaskedSignals.Builder builder3 = maskedSignals != null ? maskedSignals.toBuilder() : null;
                            MaskedSignals maskedSignals2 = (MaskedSignals) codedInputStream.readMessage(MaskedSignals.parser(), extensionRegistryLite);
                            this.maskedSignals_ = maskedSignals2;
                            if (builder3 != null) {
                                builder3.mergeFrom(maskedSignals2);
                                this.maskedSignals_ = builder3.buildPartial();
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
                if (z2) {
                    this.restrictionKinds_ = Collections.unmodifiableList(this.restrictionKinds_);
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if (z2) {
            this.restrictionKinds_ = Collections.unmodifiableList(this.restrictionKinds_);
        }
        this.unknownFields = newBuilder.build();
        makeExtensionsImmutable();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Regs_descriptor;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Regs_fieldAccessorTable.ensureFieldAccessorsInitialized(Regs.class, Builder.class);
    }

    public static final class Pub extends GeneratedMessageV3 implements PubOrBuilder {
        public static final int CCPA_FIELD_NUMBER = 5;
        public static final int CONSENT_STRING_FIELD_NUMBER = 4;
        public static final int COPPA_FIELD_NUMBER = 1;
        public static final int GDPR_CONSENT_FIELD_NUMBER = 3;
        public static final int GDPR_ZONE_FIELD_NUMBER = 2;
        public static final int GPP_FIELD_NUMBER = 6;
        public static final int GPP_SID_FIELD_NUMBER = 7;
        public static final int NON_PERSONALIZED_FIELD_NUMBER = 8;
        private static final long serialVersionUID = 0;
        private StringValue ccpa_;
        private StringValue consentString_;
        private BoolValue coppa_;
        private BoolValue gdprConsent_;
        private BoolValue gdprZone_;
        private int gppSidMemoizedSerializedSize;
        private Internal.IntList gppSid_;
        private StringValue gpp_;
        private byte memoizedIsInitialized;
        private BoolValue nonPersonalized_;
        private static final Pub DEFAULT_INSTANCE = new Pub();
        private static final Parser PARSER = new AbstractParser() { // from class: io.bidmachine.protobuf.sdk.Regs.Pub.1
            @Override // com.explorestack.protobuf.Parser
            public Pub parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Pub(codedInputStream, extensionRegistryLite);
            }
        };

        private Pub(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.gppSidMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
        }

        private Pub() {
            this.gppSidMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.gppSid_ = GeneratedMessageV3.emptyIntList();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Pub();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private Pub(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                BoolValue boolValue = this.coppa_;
                                BoolValue.Builder builder = boolValue != null ? boolValue.toBuilder() : null;
                                BoolValue boolValue2 = (BoolValue) codedInputStream.readMessage(BoolValue.parser(), extensionRegistryLite);
                                this.coppa_ = boolValue2;
                                if (builder != null) {
                                    builder.mergeFrom(boolValue2);
                                    this.coppa_ = builder.buildPartial();
                                }
                            } else if (readTag == 18) {
                                BoolValue boolValue3 = this.gdprZone_;
                                BoolValue.Builder builder2 = boolValue3 != null ? boolValue3.toBuilder() : null;
                                BoolValue boolValue4 = (BoolValue) codedInputStream.readMessage(BoolValue.parser(), extensionRegistryLite);
                                this.gdprZone_ = boolValue4;
                                if (builder2 != null) {
                                    builder2.mergeFrom(boolValue4);
                                    this.gdprZone_ = builder2.buildPartial();
                                }
                            } else if (readTag == 26) {
                                BoolValue boolValue5 = this.gdprConsent_;
                                BoolValue.Builder builder3 = boolValue5 != null ? boolValue5.toBuilder() : null;
                                BoolValue boolValue6 = (BoolValue) codedInputStream.readMessage(BoolValue.parser(), extensionRegistryLite);
                                this.gdprConsent_ = boolValue6;
                                if (builder3 != null) {
                                    builder3.mergeFrom(boolValue6);
                                    this.gdprConsent_ = builder3.buildPartial();
                                }
                            } else if (readTag == 34) {
                                StringValue stringValue = this.consentString_;
                                StringValue.Builder builder4 = stringValue != null ? stringValue.toBuilder() : null;
                                StringValue stringValue2 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                                this.consentString_ = stringValue2;
                                if (builder4 != null) {
                                    builder4.mergeFrom(stringValue2);
                                    this.consentString_ = builder4.buildPartial();
                                }
                            } else if (readTag == 42) {
                                StringValue stringValue3 = this.ccpa_;
                                StringValue.Builder builder5 = stringValue3 != null ? stringValue3.toBuilder() : null;
                                StringValue stringValue4 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                                this.ccpa_ = stringValue4;
                                if (builder5 != null) {
                                    builder5.mergeFrom(stringValue4);
                                    this.ccpa_ = builder5.buildPartial();
                                }
                            } else if (readTag == 50) {
                                StringValue stringValue5 = this.gpp_;
                                StringValue.Builder builder6 = stringValue5 != null ? stringValue5.toBuilder() : null;
                                StringValue stringValue6 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                                this.gpp_ = stringValue6;
                                if (builder6 != null) {
                                    builder6.mergeFrom(stringValue6);
                                    this.gpp_ = builder6.buildPartial();
                                }
                            } else if (readTag == 56) {
                                if (!z2) {
                                    this.gppSid_ = GeneratedMessageV3.newIntList();
                                    z2 = true;
                                }
                                this.gppSid_.addInt(codedInputStream.readUInt32());
                            } else if (readTag == 58) {
                                int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                z2 = z2;
                                if (!z2) {
                                    z2 = z2;
                                    if (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.gppSid_ = GeneratedMessageV3.newIntList();
                                        z2 = true;
                                    }
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.gppSid_.addInt(codedInputStream.readUInt32());
                                }
                                codedInputStream.popLimit(pushLimit);
                            } else if (readTag == 66) {
                                BoolValue boolValue7 = this.nonPersonalized_;
                                BoolValue.Builder builder7 = boolValue7 != null ? boolValue7.toBuilder() : null;
                                BoolValue boolValue8 = (BoolValue) codedInputStream.readMessage(BoolValue.parser(), extensionRegistryLite);
                                this.nonPersonalized_ = boolValue8;
                                if (builder7 != null) {
                                    builder7.mergeFrom(boolValue8);
                                    this.nonPersonalized_ = builder7.buildPartial();
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
                    if (z2) {
                        this.gppSid_.makeImmutable();
                    }
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2) {
                this.gppSid_.makeImmutable();
            }
            this.unknownFields = newBuilder.build();
            makeExtensionsImmutable();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Regs_Pub_descriptor;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Regs_Pub_fieldAccessorTable.ensureFieldAccessorsInitialized(Pub.class, Builder.class);
        }

        @Override // io.bidmachine.protobuf.sdk.Regs.PubOrBuilder
        public boolean hasCoppa() {
            return this.coppa_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.Regs.PubOrBuilder
        public BoolValue getCoppa() {
            BoolValue boolValue = this.coppa_;
            return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
        }

        @Override // io.bidmachine.protobuf.sdk.Regs.PubOrBuilder
        public BoolValueOrBuilder getCoppaOrBuilder() {
            return getCoppa();
        }

        @Override // io.bidmachine.protobuf.sdk.Regs.PubOrBuilder
        public boolean hasGdprZone() {
            return this.gdprZone_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.Regs.PubOrBuilder
        public BoolValue getGdprZone() {
            BoolValue boolValue = this.gdprZone_;
            return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
        }

        @Override // io.bidmachine.protobuf.sdk.Regs.PubOrBuilder
        public BoolValueOrBuilder getGdprZoneOrBuilder() {
            return getGdprZone();
        }

        @Override // io.bidmachine.protobuf.sdk.Regs.PubOrBuilder
        public boolean hasGdprConsent() {
            return this.gdprConsent_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.Regs.PubOrBuilder
        public BoolValue getGdprConsent() {
            BoolValue boolValue = this.gdprConsent_;
            return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
        }

        @Override // io.bidmachine.protobuf.sdk.Regs.PubOrBuilder
        public BoolValueOrBuilder getGdprConsentOrBuilder() {
            return getGdprConsent();
        }

        @Override // io.bidmachine.protobuf.sdk.Regs.PubOrBuilder
        public boolean hasConsentString() {
            return this.consentString_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.Regs.PubOrBuilder
        public StringValue getConsentString() {
            StringValue stringValue = this.consentString_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // io.bidmachine.protobuf.sdk.Regs.PubOrBuilder
        public StringValueOrBuilder getConsentStringOrBuilder() {
            return getConsentString();
        }

        @Override // io.bidmachine.protobuf.sdk.Regs.PubOrBuilder
        public boolean hasCcpa() {
            return this.ccpa_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.Regs.PubOrBuilder
        public StringValue getCcpa() {
            StringValue stringValue = this.ccpa_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // io.bidmachine.protobuf.sdk.Regs.PubOrBuilder
        public StringValueOrBuilder getCcpaOrBuilder() {
            return getCcpa();
        }

        @Override // io.bidmachine.protobuf.sdk.Regs.PubOrBuilder
        public boolean hasGpp() {
            return this.gpp_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.Regs.PubOrBuilder
        public StringValue getGpp() {
            StringValue stringValue = this.gpp_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // io.bidmachine.protobuf.sdk.Regs.PubOrBuilder
        public StringValueOrBuilder getGppOrBuilder() {
            return getGpp();
        }

        @Override // io.bidmachine.protobuf.sdk.Regs.PubOrBuilder
        public List<Integer> getGppSidList() {
            return this.gppSid_;
        }

        @Override // io.bidmachine.protobuf.sdk.Regs.PubOrBuilder
        public int getGppSidCount() {
            return this.gppSid_.size();
        }

        @Override // io.bidmachine.protobuf.sdk.Regs.PubOrBuilder
        public int getGppSid(int i) {
            return this.gppSid_.getInt(i);
        }

        @Override // io.bidmachine.protobuf.sdk.Regs.PubOrBuilder
        public boolean hasNonPersonalized() {
            return this.nonPersonalized_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.Regs.PubOrBuilder
        public BoolValue getNonPersonalized() {
            BoolValue boolValue = this.nonPersonalized_;
            return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
        }

        @Override // io.bidmachine.protobuf.sdk.Regs.PubOrBuilder
        public BoolValueOrBuilder getNonPersonalizedOrBuilder() {
            return getNonPersonalized();
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
            getSerializedSize();
            if (this.coppa_ != null) {
                codedOutputStream.writeMessage(1, getCoppa());
            }
            if (this.gdprZone_ != null) {
                codedOutputStream.writeMessage(2, getGdprZone());
            }
            if (this.gdprConsent_ != null) {
                codedOutputStream.writeMessage(3, getGdprConsent());
            }
            if (this.consentString_ != null) {
                codedOutputStream.writeMessage(4, getConsentString());
            }
            if (this.ccpa_ != null) {
                codedOutputStream.writeMessage(5, getCcpa());
            }
            if (this.gpp_ != null) {
                codedOutputStream.writeMessage(6, getGpp());
            }
            if (getGppSidList().size() > 0) {
                codedOutputStream.writeUInt32NoTag(58);
                codedOutputStream.writeUInt32NoTag(this.gppSidMemoizedSerializedSize);
            }
            for (int i = 0; i < this.gppSid_.size(); i++) {
                codedOutputStream.writeUInt32NoTag(this.gppSid_.getInt(i));
            }
            if (this.nonPersonalized_ != null) {
                codedOutputStream.writeMessage(8, getNonPersonalized());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int computeMessageSize = this.coppa_ != null ? CodedOutputStream.computeMessageSize(1, getCoppa()) : 0;
            if (this.gdprZone_ != null) {
                computeMessageSize += CodedOutputStream.computeMessageSize(2, getGdprZone());
            }
            if (this.gdprConsent_ != null) {
                computeMessageSize += CodedOutputStream.computeMessageSize(3, getGdprConsent());
            }
            if (this.consentString_ != null) {
                computeMessageSize += CodedOutputStream.computeMessageSize(4, getConsentString());
            }
            if (this.ccpa_ != null) {
                computeMessageSize += CodedOutputStream.computeMessageSize(5, getCcpa());
            }
            if (this.gpp_ != null) {
                computeMessageSize += CodedOutputStream.computeMessageSize(6, getGpp());
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.gppSid_.size(); i3++) {
                i2 += CodedOutputStream.computeUInt32SizeNoTag(this.gppSid_.getInt(i3));
            }
            int i4 = computeMessageSize + i2;
            if (!getGppSidList().isEmpty()) {
                i4 = i4 + 1 + CodedOutputStream.computeInt32SizeNoTag(i2);
            }
            this.gppSidMemoizedSerializedSize = i2;
            if (this.nonPersonalized_ != null) {
                i4 += CodedOutputStream.computeMessageSize(8, getNonPersonalized());
            }
            int serializedSize = i4 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Pub)) {
                return super.equals(obj);
            }
            Pub pub = (Pub) obj;
            if (hasCoppa() != pub.hasCoppa()) {
                return false;
            }
            if ((hasCoppa() && !getCoppa().equals(pub.getCoppa())) || hasGdprZone() != pub.hasGdprZone()) {
                return false;
            }
            if ((hasGdprZone() && !getGdprZone().equals(pub.getGdprZone())) || hasGdprConsent() != pub.hasGdprConsent()) {
                return false;
            }
            if ((hasGdprConsent() && !getGdprConsent().equals(pub.getGdprConsent())) || hasConsentString() != pub.hasConsentString()) {
                return false;
            }
            if ((hasConsentString() && !getConsentString().equals(pub.getConsentString())) || hasCcpa() != pub.hasCcpa()) {
                return false;
            }
            if ((hasCcpa() && !getCcpa().equals(pub.getCcpa())) || hasGpp() != pub.hasGpp()) {
                return false;
            }
            if ((!hasGpp() || getGpp().equals(pub.getGpp())) && getGppSidList().equals(pub.getGppSidList()) && hasNonPersonalized() == pub.hasNonPersonalized()) {
                return (!hasNonPersonalized() || getNonPersonalized().equals(pub.getNonPersonalized())) && this.unknownFields.equals(pub.unknownFields);
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
            if (hasCoppa()) {
                hashCode = (((hashCode * 37) + 1) * 53) + getCoppa().hashCode();
            }
            if (hasGdprZone()) {
                hashCode = (((hashCode * 37) + 2) * 53) + getGdprZone().hashCode();
            }
            if (hasGdprConsent()) {
                hashCode = (((hashCode * 37) + 3) * 53) + getGdprConsent().hashCode();
            }
            if (hasConsentString()) {
                hashCode = (((hashCode * 37) + 4) * 53) + getConsentString().hashCode();
            }
            if (hasCcpa()) {
                hashCode = (((hashCode * 37) + 5) * 53) + getCcpa().hashCode();
            }
            if (hasGpp()) {
                hashCode = (((hashCode * 37) + 6) * 53) + getGpp().hashCode();
            }
            if (getGppSidCount() > 0) {
                hashCode = (((hashCode * 37) + 7) * 53) + getGppSidList().hashCode();
            }
            if (hasNonPersonalized()) {
                hashCode = (((hashCode * 37) + 8) * 53) + getNonPersonalized().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public static Pub parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Pub) PARSER.parseFrom(byteBuffer);
        }

        public static Pub parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Pub) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Pub parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Pub) PARSER.parseFrom(byteString);
        }

        public static Pub parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Pub) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Pub parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Pub) PARSER.parseFrom(bArr);
        }

        public static Pub parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Pub) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Pub parseFrom(InputStream inputStream) throws IOException {
            return (Pub) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Pub parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Pub) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Pub parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Pub) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Pub parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Pub) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Pub parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Pub) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Pub parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Pub) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(Pub pub) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(pub);
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

        public static final class Builder extends GeneratedMessageV3.Builder implements PubOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3 ccpaBuilder_;
            private StringValue ccpa_;
            private SingleFieldBuilderV3 consentStringBuilder_;
            private StringValue consentString_;
            private SingleFieldBuilderV3 coppaBuilder_;
            private BoolValue coppa_;
            private SingleFieldBuilderV3 gdprConsentBuilder_;
            private BoolValue gdprConsent_;
            private SingleFieldBuilderV3 gdprZoneBuilder_;
            private BoolValue gdprZone_;
            private SingleFieldBuilderV3 gppBuilder_;
            private Internal.IntList gppSid_;
            private StringValue gpp_;
            private SingleFieldBuilderV3 nonPersonalizedBuilder_;
            private BoolValue nonPersonalized_;

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Regs_Pub_descriptor;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Regs_Pub_fieldAccessorTable.ensureFieldAccessorsInitialized(Pub.class, Builder.class);
            }

            private Builder() {
                this.gppSid_ = GeneratedMessageV3.emptyIntList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.gppSid_ = GeneratedMessageV3.emptyIntList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                if (this.coppaBuilder_ == null) {
                    this.coppa_ = null;
                } else {
                    this.coppa_ = null;
                    this.coppaBuilder_ = null;
                }
                if (this.gdprZoneBuilder_ == null) {
                    this.gdprZone_ = null;
                } else {
                    this.gdprZone_ = null;
                    this.gdprZoneBuilder_ = null;
                }
                if (this.gdprConsentBuilder_ == null) {
                    this.gdprConsent_ = null;
                } else {
                    this.gdprConsent_ = null;
                    this.gdprConsentBuilder_ = null;
                }
                if (this.consentStringBuilder_ == null) {
                    this.consentString_ = null;
                } else {
                    this.consentString_ = null;
                    this.consentStringBuilder_ = null;
                }
                if (this.ccpaBuilder_ == null) {
                    this.ccpa_ = null;
                } else {
                    this.ccpa_ = null;
                    this.ccpaBuilder_ = null;
                }
                if (this.gppBuilder_ == null) {
                    this.gpp_ = null;
                } else {
                    this.gpp_ = null;
                    this.gppBuilder_ = null;
                }
                this.gppSid_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= -2;
                if (this.nonPersonalizedBuilder_ == null) {
                    this.nonPersonalized_ = null;
                } else {
                    this.nonPersonalized_ = null;
                    this.nonPersonalizedBuilder_ = null;
                }
                return this;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Regs_Pub_descriptor;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* renamed from: getDefaultInstanceForType */
            public Pub mo3244getDefaultInstanceForType() {
                return Pub.getDefaultInstance();
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Pub build() {
                Pub buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Pub buildPartial() {
                Pub pub = new Pub(this);
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.coppaBuilder_;
                if (singleFieldBuilderV3 == null) {
                    pub.coppa_ = this.coppa_;
                } else {
                    pub.coppa_ = (BoolValue) singleFieldBuilderV3.build();
                }
                SingleFieldBuilderV3 singleFieldBuilderV32 = this.gdprZoneBuilder_;
                if (singleFieldBuilderV32 == null) {
                    pub.gdprZone_ = this.gdprZone_;
                } else {
                    pub.gdprZone_ = (BoolValue) singleFieldBuilderV32.build();
                }
                SingleFieldBuilderV3 singleFieldBuilderV33 = this.gdprConsentBuilder_;
                if (singleFieldBuilderV33 == null) {
                    pub.gdprConsent_ = this.gdprConsent_;
                } else {
                    pub.gdprConsent_ = (BoolValue) singleFieldBuilderV33.build();
                }
                SingleFieldBuilderV3 singleFieldBuilderV34 = this.consentStringBuilder_;
                if (singleFieldBuilderV34 == null) {
                    pub.consentString_ = this.consentString_;
                } else {
                    pub.consentString_ = (StringValue) singleFieldBuilderV34.build();
                }
                SingleFieldBuilderV3 singleFieldBuilderV35 = this.ccpaBuilder_;
                if (singleFieldBuilderV35 == null) {
                    pub.ccpa_ = this.ccpa_;
                } else {
                    pub.ccpa_ = (StringValue) singleFieldBuilderV35.build();
                }
                SingleFieldBuilderV3 singleFieldBuilderV36 = this.gppBuilder_;
                if (singleFieldBuilderV36 == null) {
                    pub.gpp_ = this.gpp_;
                } else {
                    pub.gpp_ = (StringValue) singleFieldBuilderV36.build();
                }
                if ((this.bitField0_ & 1) != 0) {
                    this.gppSid_.makeImmutable();
                    this.bitField0_ &= -2;
                }
                pub.gppSid_ = this.gppSid_;
                SingleFieldBuilderV3 singleFieldBuilderV37 = this.nonPersonalizedBuilder_;
                if (singleFieldBuilderV37 == null) {
                    pub.nonPersonalized_ = this.nonPersonalized_;
                } else {
                    pub.nonPersonalized_ = (BoolValue) singleFieldBuilderV37.build();
                }
                onBuilt();
                return pub;
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
                if (message instanceof Pub) {
                    return mergeFrom((Pub) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Pub pub) {
                if (pub == Pub.getDefaultInstance()) {
                    return this;
                }
                if (pub.hasCoppa()) {
                    mergeCoppa(pub.getCoppa());
                }
                if (pub.hasGdprZone()) {
                    mergeGdprZone(pub.getGdprZone());
                }
                if (pub.hasGdprConsent()) {
                    mergeGdprConsent(pub.getGdprConsent());
                }
                if (pub.hasConsentString()) {
                    mergeConsentString(pub.getConsentString());
                }
                if (pub.hasCcpa()) {
                    mergeCcpa(pub.getCcpa());
                }
                if (pub.hasGpp()) {
                    mergeGpp(pub.getGpp());
                }
                if (!pub.gppSid_.isEmpty()) {
                    if (this.gppSid_.isEmpty()) {
                        this.gppSid_ = pub.gppSid_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureGppSidIsMutable();
                        this.gppSid_.addAll(pub.gppSid_);
                    }
                    onChanged();
                }
                if (pub.hasNonPersonalized()) {
                    mergeNonPersonalized(pub.getNonPersonalized());
                }
                mergeUnknownFields(((GeneratedMessageV3) pub).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                Pub pub = null;
                try {
                    try {
                        Pub pub2 = (Pub) Pub.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (pub2 != null) {
                            mergeFrom(pub2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Pub pub3 = (Pub) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            pub = pub3;
                            if (pub != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (pub != null) {
                        mergeFrom(pub);
                    }
                    throw th;
                }
            }

            @Override // io.bidmachine.protobuf.sdk.Regs.PubOrBuilder
            public boolean hasCoppa() {
                return (this.coppaBuilder_ == null && this.coppa_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.Regs.PubOrBuilder
            public BoolValue getCoppa() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.coppaBuilder_;
                if (singleFieldBuilderV3 == null) {
                    BoolValue boolValue = this.coppa_;
                    return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
                }
                return (BoolValue) singleFieldBuilderV3.getMessage();
            }

            public Builder setCoppa(BoolValue boolValue) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.coppaBuilder_;
                if (singleFieldBuilderV3 == null) {
                    boolValue.getClass();
                    this.coppa_ = boolValue;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(boolValue);
                }
                return this;
            }

            public Builder setCoppa(BoolValue.Builder builder) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.coppaBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.coppa_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder mergeCoppa(BoolValue boolValue) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.coppaBuilder_;
                if (singleFieldBuilderV3 == null) {
                    BoolValue boolValue2 = this.coppa_;
                    if (boolValue2 != null) {
                        this.coppa_ = BoolValue.newBuilder(boolValue2).mergeFrom(boolValue).buildPartial();
                    } else {
                        this.coppa_ = boolValue;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(boolValue);
                }
                return this;
            }

            public Builder clearCoppa() {
                if (this.coppaBuilder_ == null) {
                    this.coppa_ = null;
                    onChanged();
                } else {
                    this.coppa_ = null;
                    this.coppaBuilder_ = null;
                }
                return this;
            }

            public BoolValue.Builder getCoppaBuilder() {
                onChanged();
                return (BoolValue.Builder) getCoppaFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.sdk.Regs.PubOrBuilder
            public BoolValueOrBuilder getCoppaOrBuilder() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.coppaBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (BoolValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                BoolValue boolValue = this.coppa_;
                return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
            }

            private SingleFieldBuilderV3 getCoppaFieldBuilder() {
                if (this.coppaBuilder_ == null) {
                    this.coppaBuilder_ = new SingleFieldBuilderV3(getCoppa(), getParentForChildren(), isClean());
                    this.coppa_ = null;
                }
                return this.coppaBuilder_;
            }

            @Override // io.bidmachine.protobuf.sdk.Regs.PubOrBuilder
            public boolean hasGdprZone() {
                return (this.gdprZoneBuilder_ == null && this.gdprZone_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.Regs.PubOrBuilder
            public BoolValue getGdprZone() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.gdprZoneBuilder_;
                if (singleFieldBuilderV3 == null) {
                    BoolValue boolValue = this.gdprZone_;
                    return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
                }
                return (BoolValue) singleFieldBuilderV3.getMessage();
            }

            public Builder setGdprZone(BoolValue boolValue) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.gdprZoneBuilder_;
                if (singleFieldBuilderV3 == null) {
                    boolValue.getClass();
                    this.gdprZone_ = boolValue;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(boolValue);
                }
                return this;
            }

            public Builder setGdprZone(BoolValue.Builder builder) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.gdprZoneBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.gdprZone_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder mergeGdprZone(BoolValue boolValue) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.gdprZoneBuilder_;
                if (singleFieldBuilderV3 == null) {
                    BoolValue boolValue2 = this.gdprZone_;
                    if (boolValue2 != null) {
                        this.gdprZone_ = BoolValue.newBuilder(boolValue2).mergeFrom(boolValue).buildPartial();
                    } else {
                        this.gdprZone_ = boolValue;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(boolValue);
                }
                return this;
            }

            public Builder clearGdprZone() {
                if (this.gdprZoneBuilder_ == null) {
                    this.gdprZone_ = null;
                    onChanged();
                } else {
                    this.gdprZone_ = null;
                    this.gdprZoneBuilder_ = null;
                }
                return this;
            }

            public BoolValue.Builder getGdprZoneBuilder() {
                onChanged();
                return (BoolValue.Builder) getGdprZoneFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.sdk.Regs.PubOrBuilder
            public BoolValueOrBuilder getGdprZoneOrBuilder() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.gdprZoneBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (BoolValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                BoolValue boolValue = this.gdprZone_;
                return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
            }

            private SingleFieldBuilderV3 getGdprZoneFieldBuilder() {
                if (this.gdprZoneBuilder_ == null) {
                    this.gdprZoneBuilder_ = new SingleFieldBuilderV3(getGdprZone(), getParentForChildren(), isClean());
                    this.gdprZone_ = null;
                }
                return this.gdprZoneBuilder_;
            }

            @Override // io.bidmachine.protobuf.sdk.Regs.PubOrBuilder
            public boolean hasGdprConsent() {
                return (this.gdprConsentBuilder_ == null && this.gdprConsent_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.Regs.PubOrBuilder
            public BoolValue getGdprConsent() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.gdprConsentBuilder_;
                if (singleFieldBuilderV3 == null) {
                    BoolValue boolValue = this.gdprConsent_;
                    return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
                }
                return (BoolValue) singleFieldBuilderV3.getMessage();
            }

            public Builder setGdprConsent(BoolValue boolValue) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.gdprConsentBuilder_;
                if (singleFieldBuilderV3 == null) {
                    boolValue.getClass();
                    this.gdprConsent_ = boolValue;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(boolValue);
                }
                return this;
            }

            public Builder setGdprConsent(BoolValue.Builder builder) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.gdprConsentBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.gdprConsent_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder mergeGdprConsent(BoolValue boolValue) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.gdprConsentBuilder_;
                if (singleFieldBuilderV3 == null) {
                    BoolValue boolValue2 = this.gdprConsent_;
                    if (boolValue2 != null) {
                        this.gdprConsent_ = BoolValue.newBuilder(boolValue2).mergeFrom(boolValue).buildPartial();
                    } else {
                        this.gdprConsent_ = boolValue;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(boolValue);
                }
                return this;
            }

            public Builder clearGdprConsent() {
                if (this.gdprConsentBuilder_ == null) {
                    this.gdprConsent_ = null;
                    onChanged();
                } else {
                    this.gdprConsent_ = null;
                    this.gdprConsentBuilder_ = null;
                }
                return this;
            }

            public BoolValue.Builder getGdprConsentBuilder() {
                onChanged();
                return (BoolValue.Builder) getGdprConsentFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.sdk.Regs.PubOrBuilder
            public BoolValueOrBuilder getGdprConsentOrBuilder() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.gdprConsentBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (BoolValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                BoolValue boolValue = this.gdprConsent_;
                return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
            }

            private SingleFieldBuilderV3 getGdprConsentFieldBuilder() {
                if (this.gdprConsentBuilder_ == null) {
                    this.gdprConsentBuilder_ = new SingleFieldBuilderV3(getGdprConsent(), getParentForChildren(), isClean());
                    this.gdprConsent_ = null;
                }
                return this.gdprConsentBuilder_;
            }

            @Override // io.bidmachine.protobuf.sdk.Regs.PubOrBuilder
            public boolean hasConsentString() {
                return (this.consentStringBuilder_ == null && this.consentString_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.Regs.PubOrBuilder
            public StringValue getConsentString() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.consentStringBuilder_;
                if (singleFieldBuilderV3 == null) {
                    StringValue stringValue = this.consentString_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }
                return (StringValue) singleFieldBuilderV3.getMessage();
            }

            public Builder setConsentString(StringValue stringValue) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.consentStringBuilder_;
                if (singleFieldBuilderV3 == null) {
                    stringValue.getClass();
                    this.consentString_ = stringValue;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(stringValue);
                }
                return this;
            }

            public Builder setConsentString(StringValue.Builder builder) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.consentStringBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.consentString_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder mergeConsentString(StringValue stringValue) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.consentStringBuilder_;
                if (singleFieldBuilderV3 == null) {
                    StringValue stringValue2 = this.consentString_;
                    if (stringValue2 != null) {
                        this.consentString_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                    } else {
                        this.consentString_ = stringValue;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(stringValue);
                }
                return this;
            }

            public Builder clearConsentString() {
                if (this.consentStringBuilder_ == null) {
                    this.consentString_ = null;
                    onChanged();
                } else {
                    this.consentString_ = null;
                    this.consentStringBuilder_ = null;
                }
                return this;
            }

            public StringValue.Builder getConsentStringBuilder() {
                onChanged();
                return (StringValue.Builder) getConsentStringFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.sdk.Regs.PubOrBuilder
            public StringValueOrBuilder getConsentStringOrBuilder() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.consentStringBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StringValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StringValue stringValue = this.consentString_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            private SingleFieldBuilderV3 getConsentStringFieldBuilder() {
                if (this.consentStringBuilder_ == null) {
                    this.consentStringBuilder_ = new SingleFieldBuilderV3(getConsentString(), getParentForChildren(), isClean());
                    this.consentString_ = null;
                }
                return this.consentStringBuilder_;
            }

            @Override // io.bidmachine.protobuf.sdk.Regs.PubOrBuilder
            public boolean hasCcpa() {
                return (this.ccpaBuilder_ == null && this.ccpa_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.Regs.PubOrBuilder
            public StringValue getCcpa() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.ccpaBuilder_;
                if (singleFieldBuilderV3 == null) {
                    StringValue stringValue = this.ccpa_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }
                return (StringValue) singleFieldBuilderV3.getMessage();
            }

            public Builder setCcpa(StringValue stringValue) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.ccpaBuilder_;
                if (singleFieldBuilderV3 == null) {
                    stringValue.getClass();
                    this.ccpa_ = stringValue;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(stringValue);
                }
                return this;
            }

            public Builder setCcpa(StringValue.Builder builder) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.ccpaBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.ccpa_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder mergeCcpa(StringValue stringValue) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.ccpaBuilder_;
                if (singleFieldBuilderV3 == null) {
                    StringValue stringValue2 = this.ccpa_;
                    if (stringValue2 != null) {
                        this.ccpa_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                    } else {
                        this.ccpa_ = stringValue;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(stringValue);
                }
                return this;
            }

            public Builder clearCcpa() {
                if (this.ccpaBuilder_ == null) {
                    this.ccpa_ = null;
                    onChanged();
                } else {
                    this.ccpa_ = null;
                    this.ccpaBuilder_ = null;
                }
                return this;
            }

            public StringValue.Builder getCcpaBuilder() {
                onChanged();
                return (StringValue.Builder) getCcpaFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.sdk.Regs.PubOrBuilder
            public StringValueOrBuilder getCcpaOrBuilder() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.ccpaBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StringValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StringValue stringValue = this.ccpa_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            private SingleFieldBuilderV3 getCcpaFieldBuilder() {
                if (this.ccpaBuilder_ == null) {
                    this.ccpaBuilder_ = new SingleFieldBuilderV3(getCcpa(), getParentForChildren(), isClean());
                    this.ccpa_ = null;
                }
                return this.ccpaBuilder_;
            }

            @Override // io.bidmachine.protobuf.sdk.Regs.PubOrBuilder
            public boolean hasGpp() {
                return (this.gppBuilder_ == null && this.gpp_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.Regs.PubOrBuilder
            public StringValue getGpp() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.gppBuilder_;
                if (singleFieldBuilderV3 == null) {
                    StringValue stringValue = this.gpp_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }
                return (StringValue) singleFieldBuilderV3.getMessage();
            }

            public Builder setGpp(StringValue stringValue) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.gppBuilder_;
                if (singleFieldBuilderV3 == null) {
                    stringValue.getClass();
                    this.gpp_ = stringValue;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(stringValue);
                }
                return this;
            }

            public Builder setGpp(StringValue.Builder builder) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.gppBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.gpp_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder mergeGpp(StringValue stringValue) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.gppBuilder_;
                if (singleFieldBuilderV3 == null) {
                    StringValue stringValue2 = this.gpp_;
                    if (stringValue2 != null) {
                        this.gpp_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                    } else {
                        this.gpp_ = stringValue;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(stringValue);
                }
                return this;
            }

            public Builder clearGpp() {
                if (this.gppBuilder_ == null) {
                    this.gpp_ = null;
                    onChanged();
                } else {
                    this.gpp_ = null;
                    this.gppBuilder_ = null;
                }
                return this;
            }

            public StringValue.Builder getGppBuilder() {
                onChanged();
                return (StringValue.Builder) getGppFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.sdk.Regs.PubOrBuilder
            public StringValueOrBuilder getGppOrBuilder() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.gppBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StringValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StringValue stringValue = this.gpp_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            private SingleFieldBuilderV3 getGppFieldBuilder() {
                if (this.gppBuilder_ == null) {
                    this.gppBuilder_ = new SingleFieldBuilderV3(getGpp(), getParentForChildren(), isClean());
                    this.gpp_ = null;
                }
                return this.gppBuilder_;
            }

            private void ensureGppSidIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.gppSid_ = GeneratedMessageV3.mutableCopy(this.gppSid_);
                    this.bitField0_ |= 1;
                }
            }

            @Override // io.bidmachine.protobuf.sdk.Regs.PubOrBuilder
            public List<Integer> getGppSidList() {
                return (this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.gppSid_) : this.gppSid_;
            }

            @Override // io.bidmachine.protobuf.sdk.Regs.PubOrBuilder
            public int getGppSidCount() {
                return this.gppSid_.size();
            }

            @Override // io.bidmachine.protobuf.sdk.Regs.PubOrBuilder
            public int getGppSid(int i) {
                return this.gppSid_.getInt(i);
            }

            public Builder setGppSid(int i, int i2) {
                ensureGppSidIsMutable();
                this.gppSid_.setInt(i, i2);
                onChanged();
                return this;
            }

            public Builder addGppSid(int i) {
                ensureGppSidIsMutable();
                this.gppSid_.addInt(i);
                onChanged();
                return this;
            }

            public Builder addAllGppSid(Iterable<? extends Integer> iterable) {
                ensureGppSidIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.gppSid_);
                onChanged();
                return this;
            }

            public Builder clearGppSid() {
                this.gppSid_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.sdk.Regs.PubOrBuilder
            public boolean hasNonPersonalized() {
                return (this.nonPersonalizedBuilder_ == null && this.nonPersonalized_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.Regs.PubOrBuilder
            public BoolValue getNonPersonalized() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.nonPersonalizedBuilder_;
                if (singleFieldBuilderV3 == null) {
                    BoolValue boolValue = this.nonPersonalized_;
                    return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
                }
                return (BoolValue) singleFieldBuilderV3.getMessage();
            }

            public Builder setNonPersonalized(BoolValue boolValue) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.nonPersonalizedBuilder_;
                if (singleFieldBuilderV3 == null) {
                    boolValue.getClass();
                    this.nonPersonalized_ = boolValue;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(boolValue);
                }
                return this;
            }

            public Builder setNonPersonalized(BoolValue.Builder builder) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.nonPersonalizedBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.nonPersonalized_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder mergeNonPersonalized(BoolValue boolValue) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.nonPersonalizedBuilder_;
                if (singleFieldBuilderV3 == null) {
                    BoolValue boolValue2 = this.nonPersonalized_;
                    if (boolValue2 != null) {
                        this.nonPersonalized_ = BoolValue.newBuilder(boolValue2).mergeFrom(boolValue).buildPartial();
                    } else {
                        this.nonPersonalized_ = boolValue;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(boolValue);
                }
                return this;
            }

            public Builder clearNonPersonalized() {
                if (this.nonPersonalizedBuilder_ == null) {
                    this.nonPersonalized_ = null;
                    onChanged();
                } else {
                    this.nonPersonalized_ = null;
                    this.nonPersonalizedBuilder_ = null;
                }
                return this;
            }

            public BoolValue.Builder getNonPersonalizedBuilder() {
                onChanged();
                return (BoolValue.Builder) getNonPersonalizedFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.sdk.Regs.PubOrBuilder
            public BoolValueOrBuilder getNonPersonalizedOrBuilder() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.nonPersonalizedBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (BoolValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                BoolValue boolValue = this.nonPersonalized_;
                return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
            }

            private SingleFieldBuilderV3 getNonPersonalizedFieldBuilder() {
                if (this.nonPersonalizedBuilder_ == null) {
                    this.nonPersonalizedBuilder_ = new SingleFieldBuilderV3(getNonPersonalized(), getParentForChildren(), isClean());
                    this.nonPersonalized_ = null;
                }
                return this.nonPersonalizedBuilder_;
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

        public static Pub getDefaultInstance() {
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
        public Pub mo3244getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class CMP extends GeneratedMessageV3 implements CMPOrBuilder {
        public static final int CCPA_FIELD_NUMBER = 5;
        public static final int GPP_FIELD_NUMBER = 6;
        public static final int GPP_SID_FIELD_NUMBER = 7;
        public static final int TCF_V1_STRING_FIELD_NUMBER = 1;
        public static final int TCF_V1_ZONE_FIELD_NUMBER = 2;
        public static final int TCF_V2_STRING_FIELD_NUMBER = 3;
        public static final int TCF_V2_ZONE_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private StringValue ccpa_;
        private int gppSidMemoizedSerializedSize;
        private Internal.IntList gppSid_;
        private StringValue gpp_;
        private byte memoizedIsInitialized;
        private StringValue tcfV1String_;
        private BoolValue tcfV1Zone_;
        private StringValue tcfV2String_;
        private BoolValue tcfV2Zone_;
        private static final CMP DEFAULT_INSTANCE = new CMP();
        private static final Parser PARSER = new AbstractParser() { // from class: io.bidmachine.protobuf.sdk.Regs.CMP.1
            @Override // com.explorestack.protobuf.Parser
            public CMP parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new CMP(codedInputStream, extensionRegistryLite);
            }
        };

        private CMP(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.gppSidMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
        }

        private CMP() {
            this.gppSidMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.gppSid_ = GeneratedMessageV3.emptyIntList();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new CMP();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private CMP(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                StringValue stringValue = this.tcfV1String_;
                                StringValue.Builder builder = stringValue != null ? stringValue.toBuilder() : null;
                                StringValue stringValue2 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                                this.tcfV1String_ = stringValue2;
                                if (builder != null) {
                                    builder.mergeFrom(stringValue2);
                                    this.tcfV1String_ = builder.buildPartial();
                                }
                            } else if (readTag == 18) {
                                BoolValue boolValue = this.tcfV1Zone_;
                                BoolValue.Builder builder2 = boolValue != null ? boolValue.toBuilder() : null;
                                BoolValue boolValue2 = (BoolValue) codedInputStream.readMessage(BoolValue.parser(), extensionRegistryLite);
                                this.tcfV1Zone_ = boolValue2;
                                if (builder2 != null) {
                                    builder2.mergeFrom(boolValue2);
                                    this.tcfV1Zone_ = builder2.buildPartial();
                                }
                            } else if (readTag == 26) {
                                StringValue stringValue3 = this.tcfV2String_;
                                StringValue.Builder builder3 = stringValue3 != null ? stringValue3.toBuilder() : null;
                                StringValue stringValue4 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                                this.tcfV2String_ = stringValue4;
                                if (builder3 != null) {
                                    builder3.mergeFrom(stringValue4);
                                    this.tcfV2String_ = builder3.buildPartial();
                                }
                            } else if (readTag == 34) {
                                BoolValue boolValue3 = this.tcfV2Zone_;
                                BoolValue.Builder builder4 = boolValue3 != null ? boolValue3.toBuilder() : null;
                                BoolValue boolValue4 = (BoolValue) codedInputStream.readMessage(BoolValue.parser(), extensionRegistryLite);
                                this.tcfV2Zone_ = boolValue4;
                                if (builder4 != null) {
                                    builder4.mergeFrom(boolValue4);
                                    this.tcfV2Zone_ = builder4.buildPartial();
                                }
                            } else if (readTag == 42) {
                                StringValue stringValue5 = this.ccpa_;
                                StringValue.Builder builder5 = stringValue5 != null ? stringValue5.toBuilder() : null;
                                StringValue stringValue6 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                                this.ccpa_ = stringValue6;
                                if (builder5 != null) {
                                    builder5.mergeFrom(stringValue6);
                                    this.ccpa_ = builder5.buildPartial();
                                }
                            } else if (readTag == 50) {
                                StringValue stringValue7 = this.gpp_;
                                StringValue.Builder builder6 = stringValue7 != null ? stringValue7.toBuilder() : null;
                                StringValue stringValue8 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                                this.gpp_ = stringValue8;
                                if (builder6 != null) {
                                    builder6.mergeFrom(stringValue8);
                                    this.gpp_ = builder6.buildPartial();
                                }
                            } else if (readTag == 56) {
                                if (!z2) {
                                    this.gppSid_ = GeneratedMessageV3.newIntList();
                                    z2 = true;
                                }
                                this.gppSid_.addInt(codedInputStream.readUInt32());
                            } else if (readTag == 58) {
                                int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                z2 = z2;
                                if (!z2) {
                                    z2 = z2;
                                    if (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.gppSid_ = GeneratedMessageV3.newIntList();
                                        z2 = true;
                                    }
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.gppSid_.addInt(codedInputStream.readUInt32());
                                }
                                codedInputStream.popLimit(pushLimit);
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
                        this.gppSid_.makeImmutable();
                    }
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2) {
                this.gppSid_.makeImmutable();
            }
            this.unknownFields = newBuilder.build();
            makeExtensionsImmutable();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Regs_CMP_descriptor;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Regs_CMP_fieldAccessorTable.ensureFieldAccessorsInitialized(CMP.class, Builder.class);
        }

        @Override // io.bidmachine.protobuf.sdk.Regs.CMPOrBuilder
        public boolean hasTcfV1String() {
            return this.tcfV1String_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.Regs.CMPOrBuilder
        public StringValue getTcfV1String() {
            StringValue stringValue = this.tcfV1String_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // io.bidmachine.protobuf.sdk.Regs.CMPOrBuilder
        public StringValueOrBuilder getTcfV1StringOrBuilder() {
            return getTcfV1String();
        }

        @Override // io.bidmachine.protobuf.sdk.Regs.CMPOrBuilder
        public boolean hasTcfV1Zone() {
            return this.tcfV1Zone_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.Regs.CMPOrBuilder
        public BoolValue getTcfV1Zone() {
            BoolValue boolValue = this.tcfV1Zone_;
            return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
        }

        @Override // io.bidmachine.protobuf.sdk.Regs.CMPOrBuilder
        public BoolValueOrBuilder getTcfV1ZoneOrBuilder() {
            return getTcfV1Zone();
        }

        @Override // io.bidmachine.protobuf.sdk.Regs.CMPOrBuilder
        public boolean hasTcfV2String() {
            return this.tcfV2String_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.Regs.CMPOrBuilder
        public StringValue getTcfV2String() {
            StringValue stringValue = this.tcfV2String_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // io.bidmachine.protobuf.sdk.Regs.CMPOrBuilder
        public StringValueOrBuilder getTcfV2StringOrBuilder() {
            return getTcfV2String();
        }

        @Override // io.bidmachine.protobuf.sdk.Regs.CMPOrBuilder
        public boolean hasTcfV2Zone() {
            return this.tcfV2Zone_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.Regs.CMPOrBuilder
        public BoolValue getTcfV2Zone() {
            BoolValue boolValue = this.tcfV2Zone_;
            return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
        }

        @Override // io.bidmachine.protobuf.sdk.Regs.CMPOrBuilder
        public BoolValueOrBuilder getTcfV2ZoneOrBuilder() {
            return getTcfV2Zone();
        }

        @Override // io.bidmachine.protobuf.sdk.Regs.CMPOrBuilder
        public boolean hasCcpa() {
            return this.ccpa_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.Regs.CMPOrBuilder
        public StringValue getCcpa() {
            StringValue stringValue = this.ccpa_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // io.bidmachine.protobuf.sdk.Regs.CMPOrBuilder
        public StringValueOrBuilder getCcpaOrBuilder() {
            return getCcpa();
        }

        @Override // io.bidmachine.protobuf.sdk.Regs.CMPOrBuilder
        public boolean hasGpp() {
            return this.gpp_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.Regs.CMPOrBuilder
        public StringValue getGpp() {
            StringValue stringValue = this.gpp_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // io.bidmachine.protobuf.sdk.Regs.CMPOrBuilder
        public StringValueOrBuilder getGppOrBuilder() {
            return getGpp();
        }

        @Override // io.bidmachine.protobuf.sdk.Regs.CMPOrBuilder
        public List<Integer> getGppSidList() {
            return this.gppSid_;
        }

        @Override // io.bidmachine.protobuf.sdk.Regs.CMPOrBuilder
        public int getGppSidCount() {
            return this.gppSid_.size();
        }

        @Override // io.bidmachine.protobuf.sdk.Regs.CMPOrBuilder
        public int getGppSid(int i) {
            return this.gppSid_.getInt(i);
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
            getSerializedSize();
            if (this.tcfV1String_ != null) {
                codedOutputStream.writeMessage(1, getTcfV1String());
            }
            if (this.tcfV1Zone_ != null) {
                codedOutputStream.writeMessage(2, getTcfV1Zone());
            }
            if (this.tcfV2String_ != null) {
                codedOutputStream.writeMessage(3, getTcfV2String());
            }
            if (this.tcfV2Zone_ != null) {
                codedOutputStream.writeMessage(4, getTcfV2Zone());
            }
            if (this.ccpa_ != null) {
                codedOutputStream.writeMessage(5, getCcpa());
            }
            if (this.gpp_ != null) {
                codedOutputStream.writeMessage(6, getGpp());
            }
            if (getGppSidList().size() > 0) {
                codedOutputStream.writeUInt32NoTag(58);
                codedOutputStream.writeUInt32NoTag(this.gppSidMemoizedSerializedSize);
            }
            for (int i = 0; i < this.gppSid_.size(); i++) {
                codedOutputStream.writeUInt32NoTag(this.gppSid_.getInt(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int computeMessageSize = this.tcfV1String_ != null ? CodedOutputStream.computeMessageSize(1, getTcfV1String()) : 0;
            if (this.tcfV1Zone_ != null) {
                computeMessageSize += CodedOutputStream.computeMessageSize(2, getTcfV1Zone());
            }
            if (this.tcfV2String_ != null) {
                computeMessageSize += CodedOutputStream.computeMessageSize(3, getTcfV2String());
            }
            if (this.tcfV2Zone_ != null) {
                computeMessageSize += CodedOutputStream.computeMessageSize(4, getTcfV2Zone());
            }
            if (this.ccpa_ != null) {
                computeMessageSize += CodedOutputStream.computeMessageSize(5, getCcpa());
            }
            if (this.gpp_ != null) {
                computeMessageSize += CodedOutputStream.computeMessageSize(6, getGpp());
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.gppSid_.size(); i3++) {
                i2 += CodedOutputStream.computeUInt32SizeNoTag(this.gppSid_.getInt(i3));
            }
            int i4 = computeMessageSize + i2;
            if (!getGppSidList().isEmpty()) {
                i4 = i4 + 1 + CodedOutputStream.computeInt32SizeNoTag(i2);
            }
            this.gppSidMemoizedSerializedSize = i2;
            int serializedSize = i4 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CMP)) {
                return super.equals(obj);
            }
            CMP cmp = (CMP) obj;
            if (hasTcfV1String() != cmp.hasTcfV1String()) {
                return false;
            }
            if ((hasTcfV1String() && !getTcfV1String().equals(cmp.getTcfV1String())) || hasTcfV1Zone() != cmp.hasTcfV1Zone()) {
                return false;
            }
            if ((hasTcfV1Zone() && !getTcfV1Zone().equals(cmp.getTcfV1Zone())) || hasTcfV2String() != cmp.hasTcfV2String()) {
                return false;
            }
            if ((hasTcfV2String() && !getTcfV2String().equals(cmp.getTcfV2String())) || hasTcfV2Zone() != cmp.hasTcfV2Zone()) {
                return false;
            }
            if ((hasTcfV2Zone() && !getTcfV2Zone().equals(cmp.getTcfV2Zone())) || hasCcpa() != cmp.hasCcpa()) {
                return false;
            }
            if ((!hasCcpa() || getCcpa().equals(cmp.getCcpa())) && hasGpp() == cmp.hasGpp()) {
                return (!hasGpp() || getGpp().equals(cmp.getGpp())) && getGppSidList().equals(cmp.getGppSidList()) && this.unknownFields.equals(cmp.unknownFields);
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
            if (hasTcfV1String()) {
                hashCode = (((hashCode * 37) + 1) * 53) + getTcfV1String().hashCode();
            }
            if (hasTcfV1Zone()) {
                hashCode = (((hashCode * 37) + 2) * 53) + getTcfV1Zone().hashCode();
            }
            if (hasTcfV2String()) {
                hashCode = (((hashCode * 37) + 3) * 53) + getTcfV2String().hashCode();
            }
            if (hasTcfV2Zone()) {
                hashCode = (((hashCode * 37) + 4) * 53) + getTcfV2Zone().hashCode();
            }
            if (hasCcpa()) {
                hashCode = (((hashCode * 37) + 5) * 53) + getCcpa().hashCode();
            }
            if (hasGpp()) {
                hashCode = (((hashCode * 37) + 6) * 53) + getGpp().hashCode();
            }
            if (getGppSidCount() > 0) {
                hashCode = (((hashCode * 37) + 7) * 53) + getGppSidList().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public static CMP parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CMP) PARSER.parseFrom(byteBuffer);
        }

        public static CMP parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CMP) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static CMP parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CMP) PARSER.parseFrom(byteString);
        }

        public static CMP parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CMP) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CMP parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CMP) PARSER.parseFrom(bArr);
        }

        public static CMP parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CMP) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CMP parseFrom(InputStream inputStream) throws IOException {
            return (CMP) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CMP parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CMP) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CMP parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CMP) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CMP parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CMP) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CMP parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CMP) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CMP parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CMP) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(CMP cmp) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(cmp);
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

        public static final class Builder extends GeneratedMessageV3.Builder implements CMPOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3 ccpaBuilder_;
            private StringValue ccpa_;
            private SingleFieldBuilderV3 gppBuilder_;
            private Internal.IntList gppSid_;
            private StringValue gpp_;
            private SingleFieldBuilderV3 tcfV1StringBuilder_;
            private StringValue tcfV1String_;
            private SingleFieldBuilderV3 tcfV1ZoneBuilder_;
            private BoolValue tcfV1Zone_;
            private SingleFieldBuilderV3 tcfV2StringBuilder_;
            private StringValue tcfV2String_;
            private SingleFieldBuilderV3 tcfV2ZoneBuilder_;
            private BoolValue tcfV2Zone_;

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Regs_CMP_descriptor;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Regs_CMP_fieldAccessorTable.ensureFieldAccessorsInitialized(CMP.class, Builder.class);
            }

            private Builder() {
                this.gppSid_ = GeneratedMessageV3.emptyIntList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.gppSid_ = GeneratedMessageV3.emptyIntList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                if (this.tcfV1StringBuilder_ == null) {
                    this.tcfV1String_ = null;
                } else {
                    this.tcfV1String_ = null;
                    this.tcfV1StringBuilder_ = null;
                }
                if (this.tcfV1ZoneBuilder_ == null) {
                    this.tcfV1Zone_ = null;
                } else {
                    this.tcfV1Zone_ = null;
                    this.tcfV1ZoneBuilder_ = null;
                }
                if (this.tcfV2StringBuilder_ == null) {
                    this.tcfV2String_ = null;
                } else {
                    this.tcfV2String_ = null;
                    this.tcfV2StringBuilder_ = null;
                }
                if (this.tcfV2ZoneBuilder_ == null) {
                    this.tcfV2Zone_ = null;
                } else {
                    this.tcfV2Zone_ = null;
                    this.tcfV2ZoneBuilder_ = null;
                }
                if (this.ccpaBuilder_ == null) {
                    this.ccpa_ = null;
                } else {
                    this.ccpa_ = null;
                    this.ccpaBuilder_ = null;
                }
                if (this.gppBuilder_ == null) {
                    this.gpp_ = null;
                } else {
                    this.gpp_ = null;
                    this.gppBuilder_ = null;
                }
                this.gppSid_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= -2;
                return this;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Regs_CMP_descriptor;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* renamed from: getDefaultInstanceForType */
            public CMP mo3244getDefaultInstanceForType() {
                return CMP.getDefaultInstance();
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public CMP build() {
                CMP buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public CMP buildPartial() {
                CMP cmp = new CMP(this);
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.tcfV1StringBuilder_;
                if (singleFieldBuilderV3 == null) {
                    cmp.tcfV1String_ = this.tcfV1String_;
                } else {
                    cmp.tcfV1String_ = (StringValue) singleFieldBuilderV3.build();
                }
                SingleFieldBuilderV3 singleFieldBuilderV32 = this.tcfV1ZoneBuilder_;
                if (singleFieldBuilderV32 == null) {
                    cmp.tcfV1Zone_ = this.tcfV1Zone_;
                } else {
                    cmp.tcfV1Zone_ = (BoolValue) singleFieldBuilderV32.build();
                }
                SingleFieldBuilderV3 singleFieldBuilderV33 = this.tcfV2StringBuilder_;
                if (singleFieldBuilderV33 == null) {
                    cmp.tcfV2String_ = this.tcfV2String_;
                } else {
                    cmp.tcfV2String_ = (StringValue) singleFieldBuilderV33.build();
                }
                SingleFieldBuilderV3 singleFieldBuilderV34 = this.tcfV2ZoneBuilder_;
                if (singleFieldBuilderV34 == null) {
                    cmp.tcfV2Zone_ = this.tcfV2Zone_;
                } else {
                    cmp.tcfV2Zone_ = (BoolValue) singleFieldBuilderV34.build();
                }
                SingleFieldBuilderV3 singleFieldBuilderV35 = this.ccpaBuilder_;
                if (singleFieldBuilderV35 == null) {
                    cmp.ccpa_ = this.ccpa_;
                } else {
                    cmp.ccpa_ = (StringValue) singleFieldBuilderV35.build();
                }
                SingleFieldBuilderV3 singleFieldBuilderV36 = this.gppBuilder_;
                if (singleFieldBuilderV36 == null) {
                    cmp.gpp_ = this.gpp_;
                } else {
                    cmp.gpp_ = (StringValue) singleFieldBuilderV36.build();
                }
                if ((this.bitField0_ & 1) != 0) {
                    this.gppSid_.makeImmutable();
                    this.bitField0_ &= -2;
                }
                cmp.gppSid_ = this.gppSid_;
                onBuilt();
                return cmp;
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
                if (message instanceof CMP) {
                    return mergeFrom((CMP) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CMP cmp) {
                if (cmp == CMP.getDefaultInstance()) {
                    return this;
                }
                if (cmp.hasTcfV1String()) {
                    mergeTcfV1String(cmp.getTcfV1String());
                }
                if (cmp.hasTcfV1Zone()) {
                    mergeTcfV1Zone(cmp.getTcfV1Zone());
                }
                if (cmp.hasTcfV2String()) {
                    mergeTcfV2String(cmp.getTcfV2String());
                }
                if (cmp.hasTcfV2Zone()) {
                    mergeTcfV2Zone(cmp.getTcfV2Zone());
                }
                if (cmp.hasCcpa()) {
                    mergeCcpa(cmp.getCcpa());
                }
                if (cmp.hasGpp()) {
                    mergeGpp(cmp.getGpp());
                }
                if (!cmp.gppSid_.isEmpty()) {
                    if (this.gppSid_.isEmpty()) {
                        this.gppSid_ = cmp.gppSid_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureGppSidIsMutable();
                        this.gppSid_.addAll(cmp.gppSid_);
                    }
                    onChanged();
                }
                mergeUnknownFields(((GeneratedMessageV3) cmp).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                CMP cmp = null;
                try {
                    try {
                        CMP cmp2 = (CMP) CMP.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (cmp2 != null) {
                            mergeFrom(cmp2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        CMP cmp3 = (CMP) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            cmp = cmp3;
                            if (cmp != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (cmp != null) {
                        mergeFrom(cmp);
                    }
                    throw th;
                }
            }

            @Override // io.bidmachine.protobuf.sdk.Regs.CMPOrBuilder
            public boolean hasTcfV1String() {
                return (this.tcfV1StringBuilder_ == null && this.tcfV1String_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.Regs.CMPOrBuilder
            public StringValue getTcfV1String() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.tcfV1StringBuilder_;
                if (singleFieldBuilderV3 == null) {
                    StringValue stringValue = this.tcfV1String_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }
                return (StringValue) singleFieldBuilderV3.getMessage();
            }

            public Builder setTcfV1String(StringValue stringValue) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.tcfV1StringBuilder_;
                if (singleFieldBuilderV3 == null) {
                    stringValue.getClass();
                    this.tcfV1String_ = stringValue;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(stringValue);
                }
                return this;
            }

            public Builder setTcfV1String(StringValue.Builder builder) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.tcfV1StringBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.tcfV1String_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder mergeTcfV1String(StringValue stringValue) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.tcfV1StringBuilder_;
                if (singleFieldBuilderV3 == null) {
                    StringValue stringValue2 = this.tcfV1String_;
                    if (stringValue2 != null) {
                        this.tcfV1String_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                    } else {
                        this.tcfV1String_ = stringValue;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(stringValue);
                }
                return this;
            }

            public Builder clearTcfV1String() {
                if (this.tcfV1StringBuilder_ == null) {
                    this.tcfV1String_ = null;
                    onChanged();
                } else {
                    this.tcfV1String_ = null;
                    this.tcfV1StringBuilder_ = null;
                }
                return this;
            }

            public StringValue.Builder getTcfV1StringBuilder() {
                onChanged();
                return (StringValue.Builder) getTcfV1StringFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.sdk.Regs.CMPOrBuilder
            public StringValueOrBuilder getTcfV1StringOrBuilder() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.tcfV1StringBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StringValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StringValue stringValue = this.tcfV1String_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            private SingleFieldBuilderV3 getTcfV1StringFieldBuilder() {
                if (this.tcfV1StringBuilder_ == null) {
                    this.tcfV1StringBuilder_ = new SingleFieldBuilderV3(getTcfV1String(), getParentForChildren(), isClean());
                    this.tcfV1String_ = null;
                }
                return this.tcfV1StringBuilder_;
            }

            @Override // io.bidmachine.protobuf.sdk.Regs.CMPOrBuilder
            public boolean hasTcfV1Zone() {
                return (this.tcfV1ZoneBuilder_ == null && this.tcfV1Zone_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.Regs.CMPOrBuilder
            public BoolValue getTcfV1Zone() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.tcfV1ZoneBuilder_;
                if (singleFieldBuilderV3 == null) {
                    BoolValue boolValue = this.tcfV1Zone_;
                    return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
                }
                return (BoolValue) singleFieldBuilderV3.getMessage();
            }

            public Builder setTcfV1Zone(BoolValue boolValue) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.tcfV1ZoneBuilder_;
                if (singleFieldBuilderV3 == null) {
                    boolValue.getClass();
                    this.tcfV1Zone_ = boolValue;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(boolValue);
                }
                return this;
            }

            public Builder setTcfV1Zone(BoolValue.Builder builder) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.tcfV1ZoneBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.tcfV1Zone_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder mergeTcfV1Zone(BoolValue boolValue) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.tcfV1ZoneBuilder_;
                if (singleFieldBuilderV3 == null) {
                    BoolValue boolValue2 = this.tcfV1Zone_;
                    if (boolValue2 != null) {
                        this.tcfV1Zone_ = BoolValue.newBuilder(boolValue2).mergeFrom(boolValue).buildPartial();
                    } else {
                        this.tcfV1Zone_ = boolValue;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(boolValue);
                }
                return this;
            }

            public Builder clearTcfV1Zone() {
                if (this.tcfV1ZoneBuilder_ == null) {
                    this.tcfV1Zone_ = null;
                    onChanged();
                } else {
                    this.tcfV1Zone_ = null;
                    this.tcfV1ZoneBuilder_ = null;
                }
                return this;
            }

            public BoolValue.Builder getTcfV1ZoneBuilder() {
                onChanged();
                return (BoolValue.Builder) getTcfV1ZoneFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.sdk.Regs.CMPOrBuilder
            public BoolValueOrBuilder getTcfV1ZoneOrBuilder() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.tcfV1ZoneBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (BoolValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                BoolValue boolValue = this.tcfV1Zone_;
                return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
            }

            private SingleFieldBuilderV3 getTcfV1ZoneFieldBuilder() {
                if (this.tcfV1ZoneBuilder_ == null) {
                    this.tcfV1ZoneBuilder_ = new SingleFieldBuilderV3(getTcfV1Zone(), getParentForChildren(), isClean());
                    this.tcfV1Zone_ = null;
                }
                return this.tcfV1ZoneBuilder_;
            }

            @Override // io.bidmachine.protobuf.sdk.Regs.CMPOrBuilder
            public boolean hasTcfV2String() {
                return (this.tcfV2StringBuilder_ == null && this.tcfV2String_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.Regs.CMPOrBuilder
            public StringValue getTcfV2String() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.tcfV2StringBuilder_;
                if (singleFieldBuilderV3 == null) {
                    StringValue stringValue = this.tcfV2String_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }
                return (StringValue) singleFieldBuilderV3.getMessage();
            }

            public Builder setTcfV2String(StringValue stringValue) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.tcfV2StringBuilder_;
                if (singleFieldBuilderV3 == null) {
                    stringValue.getClass();
                    this.tcfV2String_ = stringValue;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(stringValue);
                }
                return this;
            }

            public Builder setTcfV2String(StringValue.Builder builder) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.tcfV2StringBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.tcfV2String_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder mergeTcfV2String(StringValue stringValue) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.tcfV2StringBuilder_;
                if (singleFieldBuilderV3 == null) {
                    StringValue stringValue2 = this.tcfV2String_;
                    if (stringValue2 != null) {
                        this.tcfV2String_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                    } else {
                        this.tcfV2String_ = stringValue;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(stringValue);
                }
                return this;
            }

            public Builder clearTcfV2String() {
                if (this.tcfV2StringBuilder_ == null) {
                    this.tcfV2String_ = null;
                    onChanged();
                } else {
                    this.tcfV2String_ = null;
                    this.tcfV2StringBuilder_ = null;
                }
                return this;
            }

            public StringValue.Builder getTcfV2StringBuilder() {
                onChanged();
                return (StringValue.Builder) getTcfV2StringFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.sdk.Regs.CMPOrBuilder
            public StringValueOrBuilder getTcfV2StringOrBuilder() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.tcfV2StringBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StringValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StringValue stringValue = this.tcfV2String_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            private SingleFieldBuilderV3 getTcfV2StringFieldBuilder() {
                if (this.tcfV2StringBuilder_ == null) {
                    this.tcfV2StringBuilder_ = new SingleFieldBuilderV3(getTcfV2String(), getParentForChildren(), isClean());
                    this.tcfV2String_ = null;
                }
                return this.tcfV2StringBuilder_;
            }

            @Override // io.bidmachine.protobuf.sdk.Regs.CMPOrBuilder
            public boolean hasTcfV2Zone() {
                return (this.tcfV2ZoneBuilder_ == null && this.tcfV2Zone_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.Regs.CMPOrBuilder
            public BoolValue getTcfV2Zone() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.tcfV2ZoneBuilder_;
                if (singleFieldBuilderV3 == null) {
                    BoolValue boolValue = this.tcfV2Zone_;
                    return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
                }
                return (BoolValue) singleFieldBuilderV3.getMessage();
            }

            public Builder setTcfV2Zone(BoolValue boolValue) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.tcfV2ZoneBuilder_;
                if (singleFieldBuilderV3 == null) {
                    boolValue.getClass();
                    this.tcfV2Zone_ = boolValue;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(boolValue);
                }
                return this;
            }

            public Builder setTcfV2Zone(BoolValue.Builder builder) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.tcfV2ZoneBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.tcfV2Zone_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder mergeTcfV2Zone(BoolValue boolValue) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.tcfV2ZoneBuilder_;
                if (singleFieldBuilderV3 == null) {
                    BoolValue boolValue2 = this.tcfV2Zone_;
                    if (boolValue2 != null) {
                        this.tcfV2Zone_ = BoolValue.newBuilder(boolValue2).mergeFrom(boolValue).buildPartial();
                    } else {
                        this.tcfV2Zone_ = boolValue;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(boolValue);
                }
                return this;
            }

            public Builder clearTcfV2Zone() {
                if (this.tcfV2ZoneBuilder_ == null) {
                    this.tcfV2Zone_ = null;
                    onChanged();
                } else {
                    this.tcfV2Zone_ = null;
                    this.tcfV2ZoneBuilder_ = null;
                }
                return this;
            }

            public BoolValue.Builder getTcfV2ZoneBuilder() {
                onChanged();
                return (BoolValue.Builder) getTcfV2ZoneFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.sdk.Regs.CMPOrBuilder
            public BoolValueOrBuilder getTcfV2ZoneOrBuilder() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.tcfV2ZoneBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (BoolValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                BoolValue boolValue = this.tcfV2Zone_;
                return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
            }

            private SingleFieldBuilderV3 getTcfV2ZoneFieldBuilder() {
                if (this.tcfV2ZoneBuilder_ == null) {
                    this.tcfV2ZoneBuilder_ = new SingleFieldBuilderV3(getTcfV2Zone(), getParentForChildren(), isClean());
                    this.tcfV2Zone_ = null;
                }
                return this.tcfV2ZoneBuilder_;
            }

            @Override // io.bidmachine.protobuf.sdk.Regs.CMPOrBuilder
            public boolean hasCcpa() {
                return (this.ccpaBuilder_ == null && this.ccpa_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.Regs.CMPOrBuilder
            public StringValue getCcpa() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.ccpaBuilder_;
                if (singleFieldBuilderV3 == null) {
                    StringValue stringValue = this.ccpa_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }
                return (StringValue) singleFieldBuilderV3.getMessage();
            }

            public Builder setCcpa(StringValue stringValue) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.ccpaBuilder_;
                if (singleFieldBuilderV3 == null) {
                    stringValue.getClass();
                    this.ccpa_ = stringValue;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(stringValue);
                }
                return this;
            }

            public Builder setCcpa(StringValue.Builder builder) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.ccpaBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.ccpa_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder mergeCcpa(StringValue stringValue) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.ccpaBuilder_;
                if (singleFieldBuilderV3 == null) {
                    StringValue stringValue2 = this.ccpa_;
                    if (stringValue2 != null) {
                        this.ccpa_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                    } else {
                        this.ccpa_ = stringValue;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(stringValue);
                }
                return this;
            }

            public Builder clearCcpa() {
                if (this.ccpaBuilder_ == null) {
                    this.ccpa_ = null;
                    onChanged();
                } else {
                    this.ccpa_ = null;
                    this.ccpaBuilder_ = null;
                }
                return this;
            }

            public StringValue.Builder getCcpaBuilder() {
                onChanged();
                return (StringValue.Builder) getCcpaFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.sdk.Regs.CMPOrBuilder
            public StringValueOrBuilder getCcpaOrBuilder() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.ccpaBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StringValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StringValue stringValue = this.ccpa_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            private SingleFieldBuilderV3 getCcpaFieldBuilder() {
                if (this.ccpaBuilder_ == null) {
                    this.ccpaBuilder_ = new SingleFieldBuilderV3(getCcpa(), getParentForChildren(), isClean());
                    this.ccpa_ = null;
                }
                return this.ccpaBuilder_;
            }

            @Override // io.bidmachine.protobuf.sdk.Regs.CMPOrBuilder
            public boolean hasGpp() {
                return (this.gppBuilder_ == null && this.gpp_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.Regs.CMPOrBuilder
            public StringValue getGpp() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.gppBuilder_;
                if (singleFieldBuilderV3 == null) {
                    StringValue stringValue = this.gpp_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }
                return (StringValue) singleFieldBuilderV3.getMessage();
            }

            public Builder setGpp(StringValue stringValue) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.gppBuilder_;
                if (singleFieldBuilderV3 == null) {
                    stringValue.getClass();
                    this.gpp_ = stringValue;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(stringValue);
                }
                return this;
            }

            public Builder setGpp(StringValue.Builder builder) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.gppBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.gpp_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder mergeGpp(StringValue stringValue) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.gppBuilder_;
                if (singleFieldBuilderV3 == null) {
                    StringValue stringValue2 = this.gpp_;
                    if (stringValue2 != null) {
                        this.gpp_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                    } else {
                        this.gpp_ = stringValue;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(stringValue);
                }
                return this;
            }

            public Builder clearGpp() {
                if (this.gppBuilder_ == null) {
                    this.gpp_ = null;
                    onChanged();
                } else {
                    this.gpp_ = null;
                    this.gppBuilder_ = null;
                }
                return this;
            }

            public StringValue.Builder getGppBuilder() {
                onChanged();
                return (StringValue.Builder) getGppFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.sdk.Regs.CMPOrBuilder
            public StringValueOrBuilder getGppOrBuilder() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.gppBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StringValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StringValue stringValue = this.gpp_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            private SingleFieldBuilderV3 getGppFieldBuilder() {
                if (this.gppBuilder_ == null) {
                    this.gppBuilder_ = new SingleFieldBuilderV3(getGpp(), getParentForChildren(), isClean());
                    this.gpp_ = null;
                }
                return this.gppBuilder_;
            }

            private void ensureGppSidIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.gppSid_ = GeneratedMessageV3.mutableCopy(this.gppSid_);
                    this.bitField0_ |= 1;
                }
            }

            @Override // io.bidmachine.protobuf.sdk.Regs.CMPOrBuilder
            public List<Integer> getGppSidList() {
                return (this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.gppSid_) : this.gppSid_;
            }

            @Override // io.bidmachine.protobuf.sdk.Regs.CMPOrBuilder
            public int getGppSidCount() {
                return this.gppSid_.size();
            }

            @Override // io.bidmachine.protobuf.sdk.Regs.CMPOrBuilder
            public int getGppSid(int i) {
                return this.gppSid_.getInt(i);
            }

            public Builder setGppSid(int i, int i2) {
                ensureGppSidIsMutable();
                this.gppSid_.setInt(i, i2);
                onChanged();
                return this;
            }

            public Builder addGppSid(int i) {
                ensureGppSidIsMutable();
                this.gppSid_.addInt(i);
                onChanged();
                return this;
            }

            public Builder addAllGppSid(Iterable<? extends Integer> iterable) {
                ensureGppSidIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.gppSid_);
                onChanged();
                return this;
            }

            public Builder clearGppSid() {
                this.gppSid_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= -2;
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

        public static CMP getDefaultInstance() {
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
        public CMP mo3244getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    @Override // io.bidmachine.protobuf.sdk.RegsOrBuilder
    public boolean hasPub() {
        return this.pub_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.RegsOrBuilder
    public Pub getPub() {
        Pub pub = this.pub_;
        return pub == null ? Pub.getDefaultInstance() : pub;
    }

    @Override // io.bidmachine.protobuf.sdk.RegsOrBuilder
    public PubOrBuilder getPubOrBuilder() {
        return getPub();
    }

    @Override // io.bidmachine.protobuf.sdk.RegsOrBuilder
    public boolean hasCmp() {
        return this.cmp_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.RegsOrBuilder
    public CMP getCmp() {
        CMP cmp = this.cmp_;
        return cmp == null ? CMP.getDefaultInstance() : cmp;
    }

    @Override // io.bidmachine.protobuf.sdk.RegsOrBuilder
    public CMPOrBuilder getCmpOrBuilder() {
        return getCmp();
    }

    @Override // io.bidmachine.protobuf.sdk.RegsOrBuilder
    public List<RestrictionKind> getRestrictionKindsList() {
        return new Internal.ListAdapter(this.restrictionKinds_, restrictionKinds_converter_);
    }

    @Override // io.bidmachine.protobuf.sdk.RegsOrBuilder
    public int getRestrictionKindsCount() {
        return this.restrictionKinds_.size();
    }

    @Override // io.bidmachine.protobuf.sdk.RegsOrBuilder
    public RestrictionKind getRestrictionKinds(int i) {
        return (RestrictionKind) restrictionKinds_converter_.convert(this.restrictionKinds_.get(i));
    }

    @Override // io.bidmachine.protobuf.sdk.RegsOrBuilder
    public List<Integer> getRestrictionKindsValueList() {
        return this.restrictionKinds_;
    }

    @Override // io.bidmachine.protobuf.sdk.RegsOrBuilder
    public int getRestrictionKindsValue(int i) {
        return this.restrictionKinds_.get(i).intValue();
    }

    @Override // io.bidmachine.protobuf.sdk.RegsOrBuilder
    public int getPersistedModeValue() {
        return this.persistedMode_;
    }

    @Override // io.bidmachine.protobuf.sdk.RegsOrBuilder
    public RestrictionMode getPersistedMode() {
        RestrictionMode valueOf = RestrictionMode.valueOf(this.persistedMode_);
        return valueOf == null ? RestrictionMode.UNRECOGNIZED : valueOf;
    }

    @Override // io.bidmachine.protobuf.sdk.RegsOrBuilder
    public boolean hasMaskedSignals() {
        return this.maskedSignals_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.RegsOrBuilder
    public MaskedSignals getMaskedSignals() {
        MaskedSignals maskedSignals = this.maskedSignals_;
        return maskedSignals == null ? MaskedSignals.getDefaultInstance() : maskedSignals;
    }

    @Override // io.bidmachine.protobuf.sdk.RegsOrBuilder
    public MaskedSignalsOrBuilder getMaskedSignalsOrBuilder() {
        return getMaskedSignals();
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
        getSerializedSize();
        if (this.pub_ != null) {
            codedOutputStream.writeMessage(1, getPub());
        }
        if (this.cmp_ != null) {
            codedOutputStream.writeMessage(2, getCmp());
        }
        if (getRestrictionKindsList().size() > 0) {
            codedOutputStream.writeUInt32NoTag(26);
            codedOutputStream.writeUInt32NoTag(this.restrictionKindsMemoizedSerializedSize);
        }
        for (int i = 0; i < this.restrictionKinds_.size(); i++) {
            codedOutputStream.writeEnumNoTag(this.restrictionKinds_.get(i).intValue());
        }
        if (this.persistedMode_ != RestrictionMode.RESTRICTION_MODE_STRICT.getNumber()) {
            codedOutputStream.writeEnum(4, this.persistedMode_);
        }
        if (this.maskedSignals_ != null) {
            codedOutputStream.writeMessage(5, getMaskedSignals());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int computeMessageSize = this.pub_ != null ? CodedOutputStream.computeMessageSize(1, getPub()) : 0;
        if (this.cmp_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(2, getCmp());
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.restrictionKinds_.size(); i3++) {
            i2 += CodedOutputStream.computeEnumSizeNoTag(this.restrictionKinds_.get(i3).intValue());
        }
        int i4 = computeMessageSize + i2;
        if (!getRestrictionKindsList().isEmpty()) {
            i4 = i4 + 1 + CodedOutputStream.computeUInt32SizeNoTag(i2);
        }
        this.restrictionKindsMemoizedSerializedSize = i2;
        if (this.persistedMode_ != RestrictionMode.RESTRICTION_MODE_STRICT.getNumber()) {
            i4 += CodedOutputStream.computeEnumSize(4, this.persistedMode_);
        }
        if (this.maskedSignals_ != null) {
            i4 += CodedOutputStream.computeMessageSize(5, getMaskedSignals());
        }
        int serializedSize = i4 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Regs)) {
            return super.equals(obj);
        }
        Regs regs = (Regs) obj;
        if (hasPub() != regs.hasPub()) {
            return false;
        }
        if ((hasPub() && !getPub().equals(regs.getPub())) || hasCmp() != regs.hasCmp()) {
            return false;
        }
        if ((!hasCmp() || getCmp().equals(regs.getCmp())) && this.restrictionKinds_.equals(regs.restrictionKinds_) && this.persistedMode_ == regs.persistedMode_ && hasMaskedSignals() == regs.hasMaskedSignals()) {
            return (!hasMaskedSignals() || getMaskedSignals().equals(regs.getMaskedSignals())) && this.unknownFields.equals(regs.unknownFields);
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
        if (hasPub()) {
            hashCode = (((hashCode * 37) + 1) * 53) + getPub().hashCode();
        }
        if (hasCmp()) {
            hashCode = (((hashCode * 37) + 2) * 53) + getCmp().hashCode();
        }
        if (getRestrictionKindsCount() > 0) {
            hashCode = (((hashCode * 37) + 3) * 53) + this.restrictionKinds_.hashCode();
        }
        int i2 = (((hashCode * 37) + 4) * 53) + this.persistedMode_;
        if (hasMaskedSignals()) {
            i2 = (((i2 * 37) + 5) * 53) + getMaskedSignals().hashCode();
        }
        int hashCode2 = (i2 * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public static Regs parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Regs) PARSER.parseFrom(byteBuffer);
    }

    public static Regs parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Regs) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static Regs parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Regs) PARSER.parseFrom(byteString);
    }

    public static Regs parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Regs) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static Regs parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Regs) PARSER.parseFrom(bArr);
    }

    public static Regs parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Regs) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static Regs parseFrom(InputStream inputStream) throws IOException {
        return (Regs) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static Regs parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Regs) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Regs parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Regs) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Regs parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Regs) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Regs parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Regs) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static Regs parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Regs) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Regs regs) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(regs);
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

    public static final class Builder extends GeneratedMessageV3.Builder implements RegsOrBuilder {
        private int bitField0_;
        private SingleFieldBuilderV3 cmpBuilder_;
        private CMP cmp_;
        private SingleFieldBuilderV3 maskedSignalsBuilder_;
        private MaskedSignals maskedSignals_;
        private int persistedMode_;
        private SingleFieldBuilderV3 pubBuilder_;
        private Pub pub_;
        private List<Integer> restrictionKinds_;

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Regs_descriptor;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Regs_fieldAccessorTable.ensureFieldAccessorsInitialized(Regs.class, Builder.class);
        }

        private Builder() {
            this.restrictionKinds_ = Collections.emptyList();
            this.persistedMode_ = 0;
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.restrictionKinds_ = Collections.emptyList();
            this.persistedMode_ = 0;
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            if (this.pubBuilder_ == null) {
                this.pub_ = null;
            } else {
                this.pub_ = null;
                this.pubBuilder_ = null;
            }
            if (this.cmpBuilder_ == null) {
                this.cmp_ = null;
            } else {
                this.cmp_ = null;
                this.cmpBuilder_ = null;
            }
            this.restrictionKinds_ = Collections.emptyList();
            this.bitField0_ &= -2;
            this.persistedMode_ = 0;
            if (this.maskedSignalsBuilder_ == null) {
                this.maskedSignals_ = null;
            } else {
                this.maskedSignals_ = null;
                this.maskedSignalsBuilder_ = null;
            }
            return this;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Regs_descriptor;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* renamed from: getDefaultInstanceForType */
        public Regs mo3244getDefaultInstanceForType() {
            return Regs.getDefaultInstance();
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Regs build() {
            Regs buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Regs buildPartial() {
            Regs regs = new Regs(this);
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.pubBuilder_;
            if (singleFieldBuilderV3 == null) {
                regs.pub_ = this.pub_;
            } else {
                regs.pub_ = (Pub) singleFieldBuilderV3.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV32 = this.cmpBuilder_;
            if (singleFieldBuilderV32 == null) {
                regs.cmp_ = this.cmp_;
            } else {
                regs.cmp_ = (CMP) singleFieldBuilderV32.build();
            }
            if ((this.bitField0_ & 1) != 0) {
                this.restrictionKinds_ = Collections.unmodifiableList(this.restrictionKinds_);
                this.bitField0_ &= -2;
            }
            regs.restrictionKinds_ = this.restrictionKinds_;
            regs.persistedMode_ = this.persistedMode_;
            SingleFieldBuilderV3 singleFieldBuilderV33 = this.maskedSignalsBuilder_;
            if (singleFieldBuilderV33 == null) {
                regs.maskedSignals_ = this.maskedSignals_;
            } else {
                regs.maskedSignals_ = (MaskedSignals) singleFieldBuilderV33.build();
            }
            onBuilt();
            return regs;
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
            if (message instanceof Regs) {
                return mergeFrom((Regs) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Regs regs) {
            if (regs == Regs.getDefaultInstance()) {
                return this;
            }
            if (regs.hasPub()) {
                mergePub(regs.getPub());
            }
            if (regs.hasCmp()) {
                mergeCmp(regs.getCmp());
            }
            if (!regs.restrictionKinds_.isEmpty()) {
                if (this.restrictionKinds_.isEmpty()) {
                    this.restrictionKinds_ = regs.restrictionKinds_;
                    this.bitField0_ &= -2;
                } else {
                    ensureRestrictionKindsIsMutable();
                    this.restrictionKinds_.addAll(regs.restrictionKinds_);
                }
                onChanged();
            }
            if (regs.persistedMode_ != 0) {
                setPersistedModeValue(regs.getPersistedModeValue());
            }
            if (regs.hasMaskedSignals()) {
                mergeMaskedSignals(regs.getMaskedSignals());
            }
            mergeUnknownFields(((GeneratedMessageV3) regs).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            Regs regs = null;
            try {
                try {
                    Regs regs2 = (Regs) Regs.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (regs2 != null) {
                        mergeFrom(regs2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    Regs regs3 = (Regs) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        regs = regs3;
                        if (regs != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (regs != null) {
                    mergeFrom(regs);
                }
                throw th;
            }
        }

        @Override // io.bidmachine.protobuf.sdk.RegsOrBuilder
        public boolean hasPub() {
            return (this.pubBuilder_ == null && this.pub_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.RegsOrBuilder
        public Pub getPub() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.pubBuilder_;
            if (singleFieldBuilderV3 == null) {
                Pub pub = this.pub_;
                return pub == null ? Pub.getDefaultInstance() : pub;
            }
            return (Pub) singleFieldBuilderV3.getMessage();
        }

        public Builder setPub(Pub pub) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.pubBuilder_;
            if (singleFieldBuilderV3 == null) {
                pub.getClass();
                this.pub_ = pub;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(pub);
            }
            return this;
        }

        public Builder setPub(Pub.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.pubBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.pub_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergePub(Pub pub) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.pubBuilder_;
            if (singleFieldBuilderV3 == null) {
                Pub pub2 = this.pub_;
                if (pub2 != null) {
                    this.pub_ = Pub.newBuilder(pub2).mergeFrom(pub).buildPartial();
                } else {
                    this.pub_ = pub;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(pub);
            }
            return this;
        }

        public Builder clearPub() {
            if (this.pubBuilder_ == null) {
                this.pub_ = null;
                onChanged();
            } else {
                this.pub_ = null;
                this.pubBuilder_ = null;
            }
            return this;
        }

        public Pub.Builder getPubBuilder() {
            onChanged();
            return (Pub.Builder) getPubFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.RegsOrBuilder
        public PubOrBuilder getPubOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.pubBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (PubOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            Pub pub = this.pub_;
            return pub == null ? Pub.getDefaultInstance() : pub;
        }

        private SingleFieldBuilderV3 getPubFieldBuilder() {
            if (this.pubBuilder_ == null) {
                this.pubBuilder_ = new SingleFieldBuilderV3(getPub(), getParentForChildren(), isClean());
                this.pub_ = null;
            }
            return this.pubBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.RegsOrBuilder
        public boolean hasCmp() {
            return (this.cmpBuilder_ == null && this.cmp_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.RegsOrBuilder
        public CMP getCmp() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.cmpBuilder_;
            if (singleFieldBuilderV3 == null) {
                CMP cmp = this.cmp_;
                return cmp == null ? CMP.getDefaultInstance() : cmp;
            }
            return (CMP) singleFieldBuilderV3.getMessage();
        }

        public Builder setCmp(CMP cmp) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.cmpBuilder_;
            if (singleFieldBuilderV3 == null) {
                cmp.getClass();
                this.cmp_ = cmp;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(cmp);
            }
            return this;
        }

        public Builder setCmp(CMP.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.cmpBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.cmp_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeCmp(CMP cmp) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.cmpBuilder_;
            if (singleFieldBuilderV3 == null) {
                CMP cmp2 = this.cmp_;
                if (cmp2 != null) {
                    this.cmp_ = CMP.newBuilder(cmp2).mergeFrom(cmp).buildPartial();
                } else {
                    this.cmp_ = cmp;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(cmp);
            }
            return this;
        }

        public Builder clearCmp() {
            if (this.cmpBuilder_ == null) {
                this.cmp_ = null;
                onChanged();
            } else {
                this.cmp_ = null;
                this.cmpBuilder_ = null;
            }
            return this;
        }

        public CMP.Builder getCmpBuilder() {
            onChanged();
            return (CMP.Builder) getCmpFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.RegsOrBuilder
        public CMPOrBuilder getCmpOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.cmpBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (CMPOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            CMP cmp = this.cmp_;
            return cmp == null ? CMP.getDefaultInstance() : cmp;
        }

        private SingleFieldBuilderV3 getCmpFieldBuilder() {
            if (this.cmpBuilder_ == null) {
                this.cmpBuilder_ = new SingleFieldBuilderV3(getCmp(), getParentForChildren(), isClean());
                this.cmp_ = null;
            }
            return this.cmpBuilder_;
        }

        private void ensureRestrictionKindsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.restrictionKinds_ = new ArrayList(this.restrictionKinds_);
                this.bitField0_ |= 1;
            }
        }

        @Override // io.bidmachine.protobuf.sdk.RegsOrBuilder
        public List<RestrictionKind> getRestrictionKindsList() {
            return new Internal.ListAdapter(this.restrictionKinds_, Regs.restrictionKinds_converter_);
        }

        @Override // io.bidmachine.protobuf.sdk.RegsOrBuilder
        public int getRestrictionKindsCount() {
            return this.restrictionKinds_.size();
        }

        @Override // io.bidmachine.protobuf.sdk.RegsOrBuilder
        public RestrictionKind getRestrictionKinds(int i) {
            return (RestrictionKind) Regs.restrictionKinds_converter_.convert(this.restrictionKinds_.get(i));
        }

        public Builder setRestrictionKinds(int i, RestrictionKind restrictionKind) {
            restrictionKind.getClass();
            ensureRestrictionKindsIsMutable();
            this.restrictionKinds_.set(i, Integer.valueOf(restrictionKind.getNumber()));
            onChanged();
            return this;
        }

        public Builder addRestrictionKinds(RestrictionKind restrictionKind) {
            restrictionKind.getClass();
            ensureRestrictionKindsIsMutable();
            this.restrictionKinds_.add(Integer.valueOf(restrictionKind.getNumber()));
            onChanged();
            return this;
        }

        public Builder addAllRestrictionKinds(Iterable<? extends RestrictionKind> iterable) {
            ensureRestrictionKindsIsMutable();
            Iterator<? extends RestrictionKind> it = iterable.iterator();
            while (it.hasNext()) {
                this.restrictionKinds_.add(Integer.valueOf(it.next().getNumber()));
            }
            onChanged();
            return this;
        }

        public Builder clearRestrictionKinds() {
            this.restrictionKinds_ = Collections.emptyList();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.sdk.RegsOrBuilder
        public List<Integer> getRestrictionKindsValueList() {
            return Collections.unmodifiableList(this.restrictionKinds_);
        }

        @Override // io.bidmachine.protobuf.sdk.RegsOrBuilder
        public int getRestrictionKindsValue(int i) {
            return this.restrictionKinds_.get(i).intValue();
        }

        public Builder setRestrictionKindsValue(int i, int i2) {
            ensureRestrictionKindsIsMutable();
            this.restrictionKinds_.set(i, Integer.valueOf(i2));
            onChanged();
            return this;
        }

        public Builder addRestrictionKindsValue(int i) {
            ensureRestrictionKindsIsMutable();
            this.restrictionKinds_.add(Integer.valueOf(i));
            onChanged();
            return this;
        }

        public Builder addAllRestrictionKindsValue(Iterable<Integer> iterable) {
            ensureRestrictionKindsIsMutable();
            for (Integer num : iterable) {
                num.intValue();
                this.restrictionKinds_.add(num);
            }
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.sdk.RegsOrBuilder
        public int getPersistedModeValue() {
            return this.persistedMode_;
        }

        public Builder setPersistedModeValue(int i) {
            this.persistedMode_ = i;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.sdk.RegsOrBuilder
        public RestrictionMode getPersistedMode() {
            RestrictionMode valueOf = RestrictionMode.valueOf(this.persistedMode_);
            return valueOf == null ? RestrictionMode.UNRECOGNIZED : valueOf;
        }

        public Builder setPersistedMode(RestrictionMode restrictionMode) {
            restrictionMode.getClass();
            this.persistedMode_ = restrictionMode.getNumber();
            onChanged();
            return this;
        }

        public Builder clearPersistedMode() {
            this.persistedMode_ = 0;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.sdk.RegsOrBuilder
        public boolean hasMaskedSignals() {
            return (this.maskedSignalsBuilder_ == null && this.maskedSignals_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.RegsOrBuilder
        public MaskedSignals getMaskedSignals() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.maskedSignalsBuilder_;
            if (singleFieldBuilderV3 == null) {
                MaskedSignals maskedSignals = this.maskedSignals_;
                return maskedSignals == null ? MaskedSignals.getDefaultInstance() : maskedSignals;
            }
            return (MaskedSignals) singleFieldBuilderV3.getMessage();
        }

        public Builder setMaskedSignals(MaskedSignals maskedSignals) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.maskedSignalsBuilder_;
            if (singleFieldBuilderV3 == null) {
                maskedSignals.getClass();
                this.maskedSignals_ = maskedSignals;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(maskedSignals);
            }
            return this;
        }

        public Builder setMaskedSignals(MaskedSignals.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.maskedSignalsBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.maskedSignals_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeMaskedSignals(MaskedSignals maskedSignals) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.maskedSignalsBuilder_;
            if (singleFieldBuilderV3 == null) {
                MaskedSignals maskedSignals2 = this.maskedSignals_;
                if (maskedSignals2 != null) {
                    this.maskedSignals_ = MaskedSignals.newBuilder(maskedSignals2).mergeFrom(maskedSignals).buildPartial();
                } else {
                    this.maskedSignals_ = maskedSignals;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(maskedSignals);
            }
            return this;
        }

        public Builder clearMaskedSignals() {
            if (this.maskedSignalsBuilder_ == null) {
                this.maskedSignals_ = null;
                onChanged();
            } else {
                this.maskedSignals_ = null;
                this.maskedSignalsBuilder_ = null;
            }
            return this;
        }

        public MaskedSignals.Builder getMaskedSignalsBuilder() {
            onChanged();
            return (MaskedSignals.Builder) getMaskedSignalsFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.RegsOrBuilder
        public MaskedSignalsOrBuilder getMaskedSignalsOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.maskedSignalsBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (MaskedSignalsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            MaskedSignals maskedSignals = this.maskedSignals_;
            return maskedSignals == null ? MaskedSignals.getDefaultInstance() : maskedSignals;
        }

        private SingleFieldBuilderV3 getMaskedSignalsFieldBuilder() {
            if (this.maskedSignalsBuilder_ == null) {
                this.maskedSignalsBuilder_ = new SingleFieldBuilderV3(getMaskedSignals(), getParentForChildren(), isClean());
                this.maskedSignals_ = null;
            }
            return this.maskedSignalsBuilder_;
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

    public static Regs getDefaultInstance() {
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
    public Regs mo3244getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
