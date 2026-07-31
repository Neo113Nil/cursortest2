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
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.StringValueOrBuilder;
import com.explorestack.protobuf.UnknownFieldSet;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.pubmatic.sdk.common.POBCommonConstants;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public final class MaskedSignals extends GeneratedMessageV3 implements MaskedSignalsOrBuilder {
    public static final int ACCESS_FIELD_NUMBER = 39;
    public static final int ACCURACY_FIELD_NUMBER = 12;
    public static final int ATTS_FIELD_NUMBER = 44;
    public static final int BATTERYLEVEL_FIELD_NUMBER = 30;
    public static final int BUYERUID_FIELD_NUMBER = 5;
    public static final int CARRIER_FIELD_NUMBER = 7;
    public static final int CPUNAME_FIELD_NUMBER = 40;
    public static final int CPUVENDOR_FIELD_NUMBER = 41;
    public static final int DEVICENAME_FIELD_NUMBER = 34;
    public static final int DEVICE_CITY_FIELD_NUMBER = 16;
    public static final int DEVICE_LAT_FIELD_NUMBER = 10;
    public static final int DEVICE_LON_FIELD_NUMBER = 11;
    public static final int DEVICE_ZIP_FIELD_NUMBER = 14;
    public static final int DISKSPACE_FIELD_NUMBER = 26;
    public static final int EXTERNAL_USER_IDS_FIELD_NUMBER = 6;
    public static final int FREEMEM_FIELD_NUMBER = 29;
    public static final int GENDER_FIELD_NUMBER = 46;
    public static final int GPUNAME_FIELD_NUMBER = 42;
    public static final int GPUVENDOR_FIELD_NUMBER = 43;
    public static final int HEADSETNAME_FIELD_NUMBER = 32;
    public static final int HWV_FIELD_NUMBER = 22;
    public static final int IFA_FIELD_NUMBER = 1;
    public static final int IFV_FIELD_NUMBER = 3;
    public static final int INPUTLANGUAGE_FIELD_NUMBER = 38;
    public static final int KEYWORDS_FIELD_NUMBER = 47;
    public static final int LASTBOOTUP_FIELD_NUMBER = 35;
    public static final int LASTBOOTUP_V2_FIELD_NUMBER = 36;
    public static final int LASTFIX_FIELD_NUMBER = 13;
    public static final int LMT_FIELD_NUMBER = 2;
    public static final int MCCMNC_FIELD_NUMBER = 8;
    public static final int METRO_FIELD_NUMBER = 15;
    public static final int MODEL_FIELD_NUMBER = 21;
    public static final int PPI_FIELD_NUMBER = 23;
    public static final int PXRATIO_FIELD_NUMBER = 24;
    public static final int SCREENBRIGHT_FIELD_NUMBER = 31;
    public static final int SIM_CARRIER_FIELD_NUMBER = 9;
    public static final int TIME_FIELD_NUMBER = 37;
    public static final int TOTALDISK_FIELD_NUMBER = 27;
    public static final int TOTALMEM_FIELD_NUMBER = 28;
    public static final int UA_FIELD_NUMBER = 25;
    public static final int USER_CITY_FIELD_NUMBER = 20;
    public static final int USER_ID_FIELD_NUMBER = 4;
    public static final int USER_LAT_FIELD_NUMBER = 17;
    public static final int USER_LON_FIELD_NUMBER = 18;
    public static final int USER_ZIP_FIELD_NUMBER = 19;
    public static final int VOLUME_LEVEL_FIELD_NUMBER = 33;
    public static final int YOB_FIELD_NUMBER = 45;
    private static final long serialVersionUID = 0;
    private StringValue access_;
    private StringValue accuracy_;
    private StringValue atts_;
    private StringValue batterylevel_;
    private StringValue buyeruid_;
    private StringValue carrier_;
    private StringValue cpuname_;
    private StringValue cpuvendor_;
    private StringValue deviceCity_;
    private StringValue deviceLat_;
    private StringValue deviceLon_;
    private StringValue deviceZip_;
    private StringValue devicename_;
    private StringValue diskspace_;
    private StringValue externalUserIds_;
    private StringValue freemem_;
    private StringValue gender_;
    private StringValue gpuname_;
    private StringValue gpuvendor_;
    private StringValue headsetname_;
    private StringValue hwv_;
    private StringValue ifa_;
    private StringValue ifv_;
    private StringValue inputlanguage_;
    private StringValue keywords_;
    private StringValue lastbootupV2_;
    private StringValue lastbootup_;
    private StringValue lastfix_;
    private StringValue lmt_;
    private StringValue mccmnc_;
    private byte memoizedIsInitialized;
    private StringValue metro_;
    private StringValue model_;
    private StringValue ppi_;
    private StringValue pxratio_;
    private StringValue screenbright_;
    private StringValue simCarrier_;
    private StringValue time_;
    private StringValue totaldisk_;
    private StringValue totalmem_;
    private StringValue ua_;
    private StringValue userCity_;
    private StringValue userId_;
    private StringValue userLat_;
    private StringValue userLon_;
    private StringValue userZip_;
    private StringValue volumeLevel_;
    private StringValue yob_;
    private static final MaskedSignals DEFAULT_INSTANCE = new MaskedSignals();
    private static final Parser PARSER = new AbstractParser() { // from class: io.bidmachine.protobuf.sdk.MaskedSignals.1
        @Override // com.explorestack.protobuf.Parser
        public MaskedSignals parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new MaskedSignals(codedInputStream, extensionRegistryLite);
        }
    };

    private MaskedSignals(GeneratedMessageV3.Builder builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private MaskedSignals() {
        this.memoizedIsInitialized = (byte) -1;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new MaskedSignals();
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private MaskedSignals(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        StringValue.Builder builder;
        extensionRegistryLite.getClass();
        UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int readTag = codedInputStream.readTag();
                    switch (readTag) {
                        case 0:
                            z = true;
                        case 10:
                            StringValue stringValue = this.ifa_;
                            builder = stringValue != null ? stringValue.toBuilder() : null;
                            StringValue stringValue2 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                            this.ifa_ = stringValue2;
                            if (builder != null) {
                                builder.mergeFrom(stringValue2);
                                this.ifa_ = builder.buildPartial();
                            }
                        case 18:
                            StringValue stringValue3 = this.lmt_;
                            builder = stringValue3 != null ? stringValue3.toBuilder() : null;
                            StringValue stringValue4 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                            this.lmt_ = stringValue4;
                            if (builder != null) {
                                builder.mergeFrom(stringValue4);
                                this.lmt_ = builder.buildPartial();
                            }
                        case 26:
                            StringValue stringValue5 = this.ifv_;
                            builder = stringValue5 != null ? stringValue5.toBuilder() : null;
                            StringValue stringValue6 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                            this.ifv_ = stringValue6;
                            if (builder != null) {
                                builder.mergeFrom(stringValue6);
                                this.ifv_ = builder.buildPartial();
                            }
                        case 34:
                            StringValue stringValue7 = this.userId_;
                            builder = stringValue7 != null ? stringValue7.toBuilder() : null;
                            StringValue stringValue8 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                            this.userId_ = stringValue8;
                            if (builder != null) {
                                builder.mergeFrom(stringValue8);
                                this.userId_ = builder.buildPartial();
                            }
                        case 42:
                            StringValue stringValue9 = this.buyeruid_;
                            builder = stringValue9 != null ? stringValue9.toBuilder() : null;
                            StringValue stringValue10 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                            this.buyeruid_ = stringValue10;
                            if (builder != null) {
                                builder.mergeFrom(stringValue10);
                                this.buyeruid_ = builder.buildPartial();
                            }
                        case 50:
                            StringValue stringValue11 = this.externalUserIds_;
                            builder = stringValue11 != null ? stringValue11.toBuilder() : null;
                            StringValue stringValue12 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                            this.externalUserIds_ = stringValue12;
                            if (builder != null) {
                                builder.mergeFrom(stringValue12);
                                this.externalUserIds_ = builder.buildPartial();
                            }
                        case 58:
                            StringValue stringValue13 = this.carrier_;
                            builder = stringValue13 != null ? stringValue13.toBuilder() : null;
                            StringValue stringValue14 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                            this.carrier_ = stringValue14;
                            if (builder != null) {
                                builder.mergeFrom(stringValue14);
                                this.carrier_ = builder.buildPartial();
                            }
                        case 66:
                            StringValue stringValue15 = this.mccmnc_;
                            builder = stringValue15 != null ? stringValue15.toBuilder() : null;
                            StringValue stringValue16 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                            this.mccmnc_ = stringValue16;
                            if (builder != null) {
                                builder.mergeFrom(stringValue16);
                                this.mccmnc_ = builder.buildPartial();
                            }
                        case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
                            StringValue stringValue17 = this.simCarrier_;
                            builder = stringValue17 != null ? stringValue17.toBuilder() : null;
                            StringValue stringValue18 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                            this.simCarrier_ = stringValue18;
                            if (builder != null) {
                                builder.mergeFrom(stringValue18);
                                this.simCarrier_ = builder.buildPartial();
                            }
                        case 82:
                            StringValue stringValue19 = this.deviceLat_;
                            builder = stringValue19 != null ? stringValue19.toBuilder() : null;
                            StringValue stringValue20 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                            this.deviceLat_ = stringValue20;
                            if (builder != null) {
                                builder.mergeFrom(stringValue20);
                                this.deviceLat_ = builder.buildPartial();
                            }
                        case 90:
                            StringValue stringValue21 = this.deviceLon_;
                            builder = stringValue21 != null ? stringValue21.toBuilder() : null;
                            StringValue stringValue22 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                            this.deviceLon_ = stringValue22;
                            if (builder != null) {
                                builder.mergeFrom(stringValue22);
                                this.deviceLon_ = builder.buildPartial();
                            }
                        case 98:
                            StringValue stringValue23 = this.accuracy_;
                            builder = stringValue23 != null ? stringValue23.toBuilder() : null;
                            StringValue stringValue24 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                            this.accuracy_ = stringValue24;
                            if (builder != null) {
                                builder.mergeFrom(stringValue24);
                                this.accuracy_ = builder.buildPartial();
                            }
                        case 106:
                            StringValue stringValue25 = this.lastfix_;
                            builder = stringValue25 != null ? stringValue25.toBuilder() : null;
                            StringValue stringValue26 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                            this.lastfix_ = stringValue26;
                            if (builder != null) {
                                builder.mergeFrom(stringValue26);
                                this.lastfix_ = builder.buildPartial();
                            }
                        case 114:
                            StringValue stringValue27 = this.deviceZip_;
                            builder = stringValue27 != null ? stringValue27.toBuilder() : null;
                            StringValue stringValue28 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                            this.deviceZip_ = stringValue28;
                            if (builder != null) {
                                builder.mergeFrom(stringValue28);
                                this.deviceZip_ = builder.buildPartial();
                            }
                        case INVALID_ADS_ENDPOINT_VALUE:
                            StringValue stringValue29 = this.metro_;
                            builder = stringValue29 != null ? stringValue29.toBuilder() : null;
                            StringValue stringValue30 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                            this.metro_ = stringValue30;
                            if (builder != null) {
                                builder.mergeFrom(stringValue30);
                                this.metro_ = builder.buildPartial();
                            }
                        case 130:
                            StringValue stringValue31 = this.deviceCity_;
                            builder = stringValue31 != null ? stringValue31.toBuilder() : null;
                            StringValue stringValue32 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                            this.deviceCity_ = stringValue32;
                            if (builder != null) {
                                builder.mergeFrom(stringValue32);
                                this.deviceCity_ = builder.buildPartial();
                            }
                        case 138:
                            StringValue stringValue33 = this.userLat_;
                            builder = stringValue33 != null ? stringValue33.toBuilder() : null;
                            StringValue stringValue34 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                            this.userLat_ = stringValue34;
                            if (builder != null) {
                                builder.mergeFrom(stringValue34);
                                this.userLat_ = builder.buildPartial();
                            }
                        case 146:
                            StringValue stringValue35 = this.userLon_;
                            builder = stringValue35 != null ? stringValue35.toBuilder() : null;
                            StringValue stringValue36 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                            this.userLon_ = stringValue36;
                            if (builder != null) {
                                builder.mergeFrom(stringValue36);
                                this.userLon_ = builder.buildPartial();
                            }
                        case 154:
                            StringValue stringValue37 = this.userZip_;
                            builder = stringValue37 != null ? stringValue37.toBuilder() : null;
                            StringValue stringValue38 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                            this.userZip_ = stringValue38;
                            if (builder != null) {
                                builder.mergeFrom(stringValue38);
                                this.userZip_ = builder.buildPartial();
                            }
                        case 162:
                            StringValue stringValue39 = this.userCity_;
                            builder = stringValue39 != null ? stringValue39.toBuilder() : null;
                            StringValue stringValue40 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                            this.userCity_ = stringValue40;
                            if (builder != null) {
                                builder.mergeFrom(stringValue40);
                                this.userCity_ = builder.buildPartial();
                            }
                        case 170:
                            StringValue stringValue41 = this.model_;
                            builder = stringValue41 != null ? stringValue41.toBuilder() : null;
                            StringValue stringValue42 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                            this.model_ = stringValue42;
                            if (builder != null) {
                                builder.mergeFrom(stringValue42);
                                this.model_ = builder.buildPartial();
                            }
                        case 178:
                            StringValue stringValue43 = this.hwv_;
                            builder = stringValue43 != null ? stringValue43.toBuilder() : null;
                            StringValue stringValue44 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                            this.hwv_ = stringValue44;
                            if (builder != null) {
                                builder.mergeFrom(stringValue44);
                                this.hwv_ = builder.buildPartial();
                            }
                        case 186:
                            StringValue stringValue45 = this.ppi_;
                            builder = stringValue45 != null ? stringValue45.toBuilder() : null;
                            StringValue stringValue46 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                            this.ppi_ = stringValue46;
                            if (builder != null) {
                                builder.mergeFrom(stringValue46);
                                this.ppi_ = builder.buildPartial();
                            }
                        case 194:
                            StringValue stringValue47 = this.pxratio_;
                            builder = stringValue47 != null ? stringValue47.toBuilder() : null;
                            StringValue stringValue48 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                            this.pxratio_ = stringValue48;
                            if (builder != null) {
                                builder.mergeFrom(stringValue48);
                                this.pxratio_ = builder.buildPartial();
                            }
                        case 202:
                            StringValue stringValue49 = this.ua_;
                            builder = stringValue49 != null ? stringValue49.toBuilder() : null;
                            StringValue stringValue50 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                            this.ua_ = stringValue50;
                            if (builder != null) {
                                builder.mergeFrom(stringValue50);
                                this.ua_ = builder.buildPartial();
                            }
                        case 210:
                            StringValue stringValue51 = this.diskspace_;
                            builder = stringValue51 != null ? stringValue51.toBuilder() : null;
                            StringValue stringValue52 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                            this.diskspace_ = stringValue52;
                            if (builder != null) {
                                builder.mergeFrom(stringValue52);
                                this.diskspace_ = builder.buildPartial();
                            }
                        case MRAID_JS_DOES_NOT_EXIST_VALUE:
                            StringValue stringValue53 = this.totaldisk_;
                            builder = stringValue53 != null ? stringValue53.toBuilder() : null;
                            StringValue stringValue54 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                            this.totaldisk_ = stringValue54;
                            if (builder != null) {
                                builder.mergeFrom(stringValue54);
                                this.totaldisk_ = builder.buildPartial();
                            }
                        case PRIVACY_ICON_FALLBACK_ERROR_VALUE:
                            StringValue stringValue55 = this.totalmem_;
                            builder = stringValue55 != null ? stringValue55.toBuilder() : null;
                            StringValue stringValue56 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                            this.totalmem_ = stringValue56;
                            if (builder != null) {
                                builder.mergeFrom(stringValue56);
                                this.totalmem_ = builder.buildPartial();
                            }
                        case 234:
                            StringValue stringValue57 = this.freemem_;
                            builder = stringValue57 != null ? stringValue57.toBuilder() : null;
                            StringValue stringValue58 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                            this.freemem_ = stringValue58;
                            if (builder != null) {
                                builder.mergeFrom(stringValue58);
                                this.freemem_ = builder.buildPartial();
                            }
                        case 242:
                            StringValue stringValue59 = this.batterylevel_;
                            builder = stringValue59 != null ? stringValue59.toBuilder() : null;
                            StringValue stringValue60 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                            this.batterylevel_ = stringValue60;
                            if (builder != null) {
                                builder.mergeFrom(stringValue60);
                                this.batterylevel_ = builder.buildPartial();
                            }
                        case POBCommonConstants.DEFAULT_MIN_BITRATE /* 250 */:
                            StringValue stringValue61 = this.screenbright_;
                            builder = stringValue61 != null ? stringValue61.toBuilder() : null;
                            StringValue stringValue62 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                            this.screenbright_ = stringValue62;
                            if (builder != null) {
                                builder.mergeFrom(stringValue62);
                                this.screenbright_ = builder.buildPartial();
                            }
                        case 258:
                            StringValue stringValue63 = this.headsetname_;
                            builder = stringValue63 != null ? stringValue63.toBuilder() : null;
                            StringValue stringValue64 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                            this.headsetname_ = stringValue64;
                            if (builder != null) {
                                builder.mergeFrom(stringValue64);
                                this.headsetname_ = builder.buildPartial();
                            }
                        case 266:
                            StringValue stringValue65 = this.volumeLevel_;
                            builder = stringValue65 != null ? stringValue65.toBuilder() : null;
                            StringValue stringValue66 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                            this.volumeLevel_ = stringValue66;
                            if (builder != null) {
                                builder.mergeFrom(stringValue66);
                                this.volumeLevel_ = builder.buildPartial();
                            }
                        case 274:
                            StringValue stringValue67 = this.devicename_;
                            builder = stringValue67 != null ? stringValue67.toBuilder() : null;
                            StringValue stringValue68 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                            this.devicename_ = stringValue68;
                            if (builder != null) {
                                builder.mergeFrom(stringValue68);
                                this.devicename_ = builder.buildPartial();
                            }
                        case 282:
                            StringValue stringValue69 = this.lastbootup_;
                            builder = stringValue69 != null ? stringValue69.toBuilder() : null;
                            StringValue stringValue70 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                            this.lastbootup_ = stringValue70;
                            if (builder != null) {
                                builder.mergeFrom(stringValue70);
                                this.lastbootup_ = builder.buildPartial();
                            }
                        case 290:
                            StringValue stringValue71 = this.lastbootupV2_;
                            builder = stringValue71 != null ? stringValue71.toBuilder() : null;
                            StringValue stringValue72 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                            this.lastbootupV2_ = stringValue72;
                            if (builder != null) {
                                builder.mergeFrom(stringValue72);
                                this.lastbootupV2_ = builder.buildPartial();
                            }
                        case 298:
                            StringValue stringValue73 = this.time_;
                            builder = stringValue73 != null ? stringValue73.toBuilder() : null;
                            StringValue stringValue74 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                            this.time_ = stringValue74;
                            if (builder != null) {
                                builder.mergeFrom(stringValue74);
                                this.time_ = builder.buildPartial();
                            }
                        case 306:
                            StringValue stringValue75 = this.inputlanguage_;
                            builder = stringValue75 != null ? stringValue75.toBuilder() : null;
                            StringValue stringValue76 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                            this.inputlanguage_ = stringValue76;
                            if (builder != null) {
                                builder.mergeFrom(stringValue76);
                                this.inputlanguage_ = builder.buildPartial();
                            }
                        case LINK_COMMAND_OPEN_FAILED_VALUE:
                            StringValue stringValue77 = this.access_;
                            builder = stringValue77 != null ? stringValue77.toBuilder() : null;
                            StringValue stringValue78 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                            this.access_ = stringValue78;
                            if (builder != null) {
                                builder.mergeFrom(stringValue78);
                                this.access_ = builder.buildPartial();
                            }
                        case MRAID_UNRECOGNIZED_COMMAND_VALUE:
                            StringValue stringValue79 = this.cpuname_;
                            builder = stringValue79 != null ? stringValue79.toBuilder() : null;
                            StringValue stringValue80 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                            this.cpuname_ = stringValue80;
                            if (builder != null) {
                                builder.mergeFrom(stringValue80);
                                this.cpuname_ = builder.buildPartial();
                            }
                        case 330:
                            StringValue stringValue81 = this.cpuvendor_;
                            builder = stringValue81 != null ? stringValue81.toBuilder() : null;
                            StringValue stringValue82 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                            this.cpuvendor_ = stringValue82;
                            if (builder != null) {
                                builder.mergeFrom(stringValue82);
                                this.cpuvendor_ = builder.buildPartial();
                            }
                        case 338:
                            StringValue stringValue83 = this.gpuname_;
                            builder = stringValue83 != null ? stringValue83.toBuilder() : null;
                            StringValue stringValue84 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                            this.gpuname_ = stringValue84;
                            if (builder != null) {
                                builder.mergeFrom(stringValue84);
                                this.gpuname_ = builder.buildPartial();
                            }
                        case 346:
                            StringValue stringValue85 = this.gpuvendor_;
                            builder = stringValue85 != null ? stringValue85.toBuilder() : null;
                            StringValue stringValue86 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                            this.gpuvendor_ = stringValue86;
                            if (builder != null) {
                                builder.mergeFrom(stringValue86);
                                this.gpuvendor_ = builder.buildPartial();
                            }
                        case 354:
                            StringValue stringValue87 = this.atts_;
                            builder = stringValue87 != null ? stringValue87.toBuilder() : null;
                            StringValue stringValue88 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                            this.atts_ = stringValue88;
                            if (builder != null) {
                                builder.mergeFrom(stringValue88);
                                this.atts_ = builder.buildPartial();
                            }
                        case 362:
                            StringValue stringValue89 = this.yob_;
                            builder = stringValue89 != null ? stringValue89.toBuilder() : null;
                            StringValue stringValue90 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                            this.yob_ = stringValue90;
                            if (builder != null) {
                                builder.mergeFrom(stringValue90);
                                this.yob_ = builder.buildPartial();
                            }
                        case 370:
                            StringValue stringValue91 = this.gender_;
                            builder = stringValue91 != null ? stringValue91.toBuilder() : null;
                            StringValue stringValue92 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                            this.gender_ = stringValue92;
                            if (builder != null) {
                                builder.mergeFrom(stringValue92);
                                this.gender_ = builder.buildPartial();
                            }
                        case 378:
                            StringValue stringValue93 = this.keywords_;
                            builder = stringValue93 != null ? stringValue93.toBuilder() : null;
                            StringValue stringValue94 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                            this.keywords_ = stringValue94;
                            if (builder != null) {
                                builder.mergeFrom(stringValue94);
                                this.keywords_ = builder.buildPartial();
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
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        this.unknownFields = newBuilder.build();
        makeExtensionsImmutable();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_MaskedSignals_descriptor;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_MaskedSignals_fieldAccessorTable.ensureFieldAccessorsInitialized(MaskedSignals.class, Builder.class);
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public boolean hasIfa() {
        return this.ifa_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValue getIfa() {
        StringValue stringValue = this.ifa_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValueOrBuilder getIfaOrBuilder() {
        return getIfa();
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public boolean hasLmt() {
        return this.lmt_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValue getLmt() {
        StringValue stringValue = this.lmt_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValueOrBuilder getLmtOrBuilder() {
        return getLmt();
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public boolean hasIfv() {
        return this.ifv_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValue getIfv() {
        StringValue stringValue = this.ifv_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValueOrBuilder getIfvOrBuilder() {
        return getIfv();
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public boolean hasUserId() {
        return this.userId_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValue getUserId() {
        StringValue stringValue = this.userId_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValueOrBuilder getUserIdOrBuilder() {
        return getUserId();
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public boolean hasBuyeruid() {
        return this.buyeruid_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValue getBuyeruid() {
        StringValue stringValue = this.buyeruid_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValueOrBuilder getBuyeruidOrBuilder() {
        return getBuyeruid();
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public boolean hasExternalUserIds() {
        return this.externalUserIds_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValue getExternalUserIds() {
        StringValue stringValue = this.externalUserIds_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValueOrBuilder getExternalUserIdsOrBuilder() {
        return getExternalUserIds();
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public boolean hasCarrier() {
        return this.carrier_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValue getCarrier() {
        StringValue stringValue = this.carrier_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValueOrBuilder getCarrierOrBuilder() {
        return getCarrier();
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public boolean hasMccmnc() {
        return this.mccmnc_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValue getMccmnc() {
        StringValue stringValue = this.mccmnc_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValueOrBuilder getMccmncOrBuilder() {
        return getMccmnc();
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public boolean hasSimCarrier() {
        return this.simCarrier_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValue getSimCarrier() {
        StringValue stringValue = this.simCarrier_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValueOrBuilder getSimCarrierOrBuilder() {
        return getSimCarrier();
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public boolean hasDeviceLat() {
        return this.deviceLat_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValue getDeviceLat() {
        StringValue stringValue = this.deviceLat_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValueOrBuilder getDeviceLatOrBuilder() {
        return getDeviceLat();
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public boolean hasDeviceLon() {
        return this.deviceLon_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValue getDeviceLon() {
        StringValue stringValue = this.deviceLon_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValueOrBuilder getDeviceLonOrBuilder() {
        return getDeviceLon();
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public boolean hasAccuracy() {
        return this.accuracy_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValue getAccuracy() {
        StringValue stringValue = this.accuracy_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValueOrBuilder getAccuracyOrBuilder() {
        return getAccuracy();
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public boolean hasLastfix() {
        return this.lastfix_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValue getLastfix() {
        StringValue stringValue = this.lastfix_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValueOrBuilder getLastfixOrBuilder() {
        return getLastfix();
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public boolean hasDeviceZip() {
        return this.deviceZip_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValue getDeviceZip() {
        StringValue stringValue = this.deviceZip_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValueOrBuilder getDeviceZipOrBuilder() {
        return getDeviceZip();
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public boolean hasMetro() {
        return this.metro_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValue getMetro() {
        StringValue stringValue = this.metro_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValueOrBuilder getMetroOrBuilder() {
        return getMetro();
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public boolean hasDeviceCity() {
        return this.deviceCity_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValue getDeviceCity() {
        StringValue stringValue = this.deviceCity_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValueOrBuilder getDeviceCityOrBuilder() {
        return getDeviceCity();
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public boolean hasUserLat() {
        return this.userLat_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValue getUserLat() {
        StringValue stringValue = this.userLat_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValueOrBuilder getUserLatOrBuilder() {
        return getUserLat();
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public boolean hasUserLon() {
        return this.userLon_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValue getUserLon() {
        StringValue stringValue = this.userLon_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValueOrBuilder getUserLonOrBuilder() {
        return getUserLon();
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public boolean hasUserZip() {
        return this.userZip_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValue getUserZip() {
        StringValue stringValue = this.userZip_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValueOrBuilder getUserZipOrBuilder() {
        return getUserZip();
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public boolean hasUserCity() {
        return this.userCity_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValue getUserCity() {
        StringValue stringValue = this.userCity_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValueOrBuilder getUserCityOrBuilder() {
        return getUserCity();
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public boolean hasModel() {
        return this.model_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValue getModel() {
        StringValue stringValue = this.model_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValueOrBuilder getModelOrBuilder() {
        return getModel();
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public boolean hasHwv() {
        return this.hwv_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValue getHwv() {
        StringValue stringValue = this.hwv_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValueOrBuilder getHwvOrBuilder() {
        return getHwv();
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public boolean hasPpi() {
        return this.ppi_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValue getPpi() {
        StringValue stringValue = this.ppi_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValueOrBuilder getPpiOrBuilder() {
        return getPpi();
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public boolean hasPxratio() {
        return this.pxratio_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValue getPxratio() {
        StringValue stringValue = this.pxratio_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValueOrBuilder getPxratioOrBuilder() {
        return getPxratio();
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public boolean hasUa() {
        return this.ua_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValue getUa() {
        StringValue stringValue = this.ua_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValueOrBuilder getUaOrBuilder() {
        return getUa();
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public boolean hasDiskspace() {
        return this.diskspace_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValue getDiskspace() {
        StringValue stringValue = this.diskspace_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValueOrBuilder getDiskspaceOrBuilder() {
        return getDiskspace();
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public boolean hasTotaldisk() {
        return this.totaldisk_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValue getTotaldisk() {
        StringValue stringValue = this.totaldisk_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValueOrBuilder getTotaldiskOrBuilder() {
        return getTotaldisk();
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public boolean hasTotalmem() {
        return this.totalmem_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValue getTotalmem() {
        StringValue stringValue = this.totalmem_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValueOrBuilder getTotalmemOrBuilder() {
        return getTotalmem();
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public boolean hasFreemem() {
        return this.freemem_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValue getFreemem() {
        StringValue stringValue = this.freemem_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValueOrBuilder getFreememOrBuilder() {
        return getFreemem();
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public boolean hasBatterylevel() {
        return this.batterylevel_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValue getBatterylevel() {
        StringValue stringValue = this.batterylevel_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValueOrBuilder getBatterylevelOrBuilder() {
        return getBatterylevel();
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public boolean hasScreenbright() {
        return this.screenbright_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValue getScreenbright() {
        StringValue stringValue = this.screenbright_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValueOrBuilder getScreenbrightOrBuilder() {
        return getScreenbright();
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public boolean hasHeadsetname() {
        return this.headsetname_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValue getHeadsetname() {
        StringValue stringValue = this.headsetname_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValueOrBuilder getHeadsetnameOrBuilder() {
        return getHeadsetname();
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public boolean hasVolumeLevel() {
        return this.volumeLevel_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValue getVolumeLevel() {
        StringValue stringValue = this.volumeLevel_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValueOrBuilder getVolumeLevelOrBuilder() {
        return getVolumeLevel();
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public boolean hasDevicename() {
        return this.devicename_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValue getDevicename() {
        StringValue stringValue = this.devicename_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValueOrBuilder getDevicenameOrBuilder() {
        return getDevicename();
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public boolean hasLastbootup() {
        return this.lastbootup_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValue getLastbootup() {
        StringValue stringValue = this.lastbootup_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValueOrBuilder getLastbootupOrBuilder() {
        return getLastbootup();
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public boolean hasLastbootupV2() {
        return this.lastbootupV2_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValue getLastbootupV2() {
        StringValue stringValue = this.lastbootupV2_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValueOrBuilder getLastbootupV2OrBuilder() {
        return getLastbootupV2();
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public boolean hasTime() {
        return this.time_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValue getTime() {
        StringValue stringValue = this.time_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValueOrBuilder getTimeOrBuilder() {
        return getTime();
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public boolean hasInputlanguage() {
        return this.inputlanguage_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValue getInputlanguage() {
        StringValue stringValue = this.inputlanguage_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValueOrBuilder getInputlanguageOrBuilder() {
        return getInputlanguage();
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public boolean hasAccess() {
        return this.access_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValue getAccess() {
        StringValue stringValue = this.access_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValueOrBuilder getAccessOrBuilder() {
        return getAccess();
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public boolean hasCpuname() {
        return this.cpuname_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValue getCpuname() {
        StringValue stringValue = this.cpuname_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValueOrBuilder getCpunameOrBuilder() {
        return getCpuname();
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public boolean hasCpuvendor() {
        return this.cpuvendor_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValue getCpuvendor() {
        StringValue stringValue = this.cpuvendor_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValueOrBuilder getCpuvendorOrBuilder() {
        return getCpuvendor();
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public boolean hasGpuname() {
        return this.gpuname_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValue getGpuname() {
        StringValue stringValue = this.gpuname_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValueOrBuilder getGpunameOrBuilder() {
        return getGpuname();
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public boolean hasGpuvendor() {
        return this.gpuvendor_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValue getGpuvendor() {
        StringValue stringValue = this.gpuvendor_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValueOrBuilder getGpuvendorOrBuilder() {
        return getGpuvendor();
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public boolean hasAtts() {
        return this.atts_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValue getAtts() {
        StringValue stringValue = this.atts_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValueOrBuilder getAttsOrBuilder() {
        return getAtts();
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public boolean hasYob() {
        return this.yob_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValue getYob() {
        StringValue stringValue = this.yob_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValueOrBuilder getYobOrBuilder() {
        return getYob();
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public boolean hasGender() {
        return this.gender_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValue getGender() {
        StringValue stringValue = this.gender_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValueOrBuilder getGenderOrBuilder() {
        return getGender();
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public boolean hasKeywords() {
        return this.keywords_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValue getKeywords() {
        StringValue stringValue = this.keywords_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
    public StringValueOrBuilder getKeywordsOrBuilder() {
        return getKeywords();
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
        if (this.ifa_ != null) {
            codedOutputStream.writeMessage(1, getIfa());
        }
        if (this.lmt_ != null) {
            codedOutputStream.writeMessage(2, getLmt());
        }
        if (this.ifv_ != null) {
            codedOutputStream.writeMessage(3, getIfv());
        }
        if (this.userId_ != null) {
            codedOutputStream.writeMessage(4, getUserId());
        }
        if (this.buyeruid_ != null) {
            codedOutputStream.writeMessage(5, getBuyeruid());
        }
        if (this.externalUserIds_ != null) {
            codedOutputStream.writeMessage(6, getExternalUserIds());
        }
        if (this.carrier_ != null) {
            codedOutputStream.writeMessage(7, getCarrier());
        }
        if (this.mccmnc_ != null) {
            codedOutputStream.writeMessage(8, getMccmnc());
        }
        if (this.simCarrier_ != null) {
            codedOutputStream.writeMessage(9, getSimCarrier());
        }
        if (this.deviceLat_ != null) {
            codedOutputStream.writeMessage(10, getDeviceLat());
        }
        if (this.deviceLon_ != null) {
            codedOutputStream.writeMessage(11, getDeviceLon());
        }
        if (this.accuracy_ != null) {
            codedOutputStream.writeMessage(12, getAccuracy());
        }
        if (this.lastfix_ != null) {
            codedOutputStream.writeMessage(13, getLastfix());
        }
        if (this.deviceZip_ != null) {
            codedOutputStream.writeMessage(14, getDeviceZip());
        }
        if (this.metro_ != null) {
            codedOutputStream.writeMessage(15, getMetro());
        }
        if (this.deviceCity_ != null) {
            codedOutputStream.writeMessage(16, getDeviceCity());
        }
        if (this.userLat_ != null) {
            codedOutputStream.writeMessage(17, getUserLat());
        }
        if (this.userLon_ != null) {
            codedOutputStream.writeMessage(18, getUserLon());
        }
        if (this.userZip_ != null) {
            codedOutputStream.writeMessage(19, getUserZip());
        }
        if (this.userCity_ != null) {
            codedOutputStream.writeMessage(20, getUserCity());
        }
        if (this.model_ != null) {
            codedOutputStream.writeMessage(21, getModel());
        }
        if (this.hwv_ != null) {
            codedOutputStream.writeMessage(22, getHwv());
        }
        if (this.ppi_ != null) {
            codedOutputStream.writeMessage(23, getPpi());
        }
        if (this.pxratio_ != null) {
            codedOutputStream.writeMessage(24, getPxratio());
        }
        if (this.ua_ != null) {
            codedOutputStream.writeMessage(25, getUa());
        }
        if (this.diskspace_ != null) {
            codedOutputStream.writeMessage(26, getDiskspace());
        }
        if (this.totaldisk_ != null) {
            codedOutputStream.writeMessage(27, getTotaldisk());
        }
        if (this.totalmem_ != null) {
            codedOutputStream.writeMessage(28, getTotalmem());
        }
        if (this.freemem_ != null) {
            codedOutputStream.writeMessage(29, getFreemem());
        }
        if (this.batterylevel_ != null) {
            codedOutputStream.writeMessage(30, getBatterylevel());
        }
        if (this.screenbright_ != null) {
            codedOutputStream.writeMessage(31, getScreenbright());
        }
        if (this.headsetname_ != null) {
            codedOutputStream.writeMessage(32, getHeadsetname());
        }
        if (this.volumeLevel_ != null) {
            codedOutputStream.writeMessage(33, getVolumeLevel());
        }
        if (this.devicename_ != null) {
            codedOutputStream.writeMessage(34, getDevicename());
        }
        if (this.lastbootup_ != null) {
            codedOutputStream.writeMessage(35, getLastbootup());
        }
        if (this.lastbootupV2_ != null) {
            codedOutputStream.writeMessage(36, getLastbootupV2());
        }
        if (this.time_ != null) {
            codedOutputStream.writeMessage(37, getTime());
        }
        if (this.inputlanguage_ != null) {
            codedOutputStream.writeMessage(38, getInputlanguage());
        }
        if (this.access_ != null) {
            codedOutputStream.writeMessage(39, getAccess());
        }
        if (this.cpuname_ != null) {
            codedOutputStream.writeMessage(40, getCpuname());
        }
        if (this.cpuvendor_ != null) {
            codedOutputStream.writeMessage(41, getCpuvendor());
        }
        if (this.gpuname_ != null) {
            codedOutputStream.writeMessage(42, getGpuname());
        }
        if (this.gpuvendor_ != null) {
            codedOutputStream.writeMessage(43, getGpuvendor());
        }
        if (this.atts_ != null) {
            codedOutputStream.writeMessage(44, getAtts());
        }
        if (this.yob_ != null) {
            codedOutputStream.writeMessage(45, getYob());
        }
        if (this.gender_ != null) {
            codedOutputStream.writeMessage(46, getGender());
        }
        if (this.keywords_ != null) {
            codedOutputStream.writeMessage(47, getKeywords());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int computeMessageSize = this.ifa_ != null ? CodedOutputStream.computeMessageSize(1, getIfa()) : 0;
        if (this.lmt_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(2, getLmt());
        }
        if (this.ifv_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(3, getIfv());
        }
        if (this.userId_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(4, getUserId());
        }
        if (this.buyeruid_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(5, getBuyeruid());
        }
        if (this.externalUserIds_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(6, getExternalUserIds());
        }
        if (this.carrier_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(7, getCarrier());
        }
        if (this.mccmnc_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(8, getMccmnc());
        }
        if (this.simCarrier_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(9, getSimCarrier());
        }
        if (this.deviceLat_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(10, getDeviceLat());
        }
        if (this.deviceLon_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(11, getDeviceLon());
        }
        if (this.accuracy_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(12, getAccuracy());
        }
        if (this.lastfix_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(13, getLastfix());
        }
        if (this.deviceZip_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(14, getDeviceZip());
        }
        if (this.metro_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(15, getMetro());
        }
        if (this.deviceCity_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(16, getDeviceCity());
        }
        if (this.userLat_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(17, getUserLat());
        }
        if (this.userLon_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(18, getUserLon());
        }
        if (this.userZip_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(19, getUserZip());
        }
        if (this.userCity_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(20, getUserCity());
        }
        if (this.model_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(21, getModel());
        }
        if (this.hwv_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(22, getHwv());
        }
        if (this.ppi_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(23, getPpi());
        }
        if (this.pxratio_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(24, getPxratio());
        }
        if (this.ua_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(25, getUa());
        }
        if (this.diskspace_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(26, getDiskspace());
        }
        if (this.totaldisk_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(27, getTotaldisk());
        }
        if (this.totalmem_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(28, getTotalmem());
        }
        if (this.freemem_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(29, getFreemem());
        }
        if (this.batterylevel_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(30, getBatterylevel());
        }
        if (this.screenbright_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(31, getScreenbright());
        }
        if (this.headsetname_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(32, getHeadsetname());
        }
        if (this.volumeLevel_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(33, getVolumeLevel());
        }
        if (this.devicename_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(34, getDevicename());
        }
        if (this.lastbootup_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(35, getLastbootup());
        }
        if (this.lastbootupV2_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(36, getLastbootupV2());
        }
        if (this.time_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(37, getTime());
        }
        if (this.inputlanguage_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(38, getInputlanguage());
        }
        if (this.access_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(39, getAccess());
        }
        if (this.cpuname_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(40, getCpuname());
        }
        if (this.cpuvendor_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(41, getCpuvendor());
        }
        if (this.gpuname_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(42, getGpuname());
        }
        if (this.gpuvendor_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(43, getGpuvendor());
        }
        if (this.atts_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(44, getAtts());
        }
        if (this.yob_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(45, getYob());
        }
        if (this.gender_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(46, getGender());
        }
        if (this.keywords_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(47, getKeywords());
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
        if (!(obj instanceof MaskedSignals)) {
            return super.equals(obj);
        }
        MaskedSignals maskedSignals = (MaskedSignals) obj;
        if (hasIfa() != maskedSignals.hasIfa()) {
            return false;
        }
        if ((hasIfa() && !getIfa().equals(maskedSignals.getIfa())) || hasLmt() != maskedSignals.hasLmt()) {
            return false;
        }
        if ((hasLmt() && !getLmt().equals(maskedSignals.getLmt())) || hasIfv() != maskedSignals.hasIfv()) {
            return false;
        }
        if ((hasIfv() && !getIfv().equals(maskedSignals.getIfv())) || hasUserId() != maskedSignals.hasUserId()) {
            return false;
        }
        if ((hasUserId() && !getUserId().equals(maskedSignals.getUserId())) || hasBuyeruid() != maskedSignals.hasBuyeruid()) {
            return false;
        }
        if ((hasBuyeruid() && !getBuyeruid().equals(maskedSignals.getBuyeruid())) || hasExternalUserIds() != maskedSignals.hasExternalUserIds()) {
            return false;
        }
        if ((hasExternalUserIds() && !getExternalUserIds().equals(maskedSignals.getExternalUserIds())) || hasCarrier() != maskedSignals.hasCarrier()) {
            return false;
        }
        if ((hasCarrier() && !getCarrier().equals(maskedSignals.getCarrier())) || hasMccmnc() != maskedSignals.hasMccmnc()) {
            return false;
        }
        if ((hasMccmnc() && !getMccmnc().equals(maskedSignals.getMccmnc())) || hasSimCarrier() != maskedSignals.hasSimCarrier()) {
            return false;
        }
        if ((hasSimCarrier() && !getSimCarrier().equals(maskedSignals.getSimCarrier())) || hasDeviceLat() != maskedSignals.hasDeviceLat()) {
            return false;
        }
        if ((hasDeviceLat() && !getDeviceLat().equals(maskedSignals.getDeviceLat())) || hasDeviceLon() != maskedSignals.hasDeviceLon()) {
            return false;
        }
        if ((hasDeviceLon() && !getDeviceLon().equals(maskedSignals.getDeviceLon())) || hasAccuracy() != maskedSignals.hasAccuracy()) {
            return false;
        }
        if ((hasAccuracy() && !getAccuracy().equals(maskedSignals.getAccuracy())) || hasLastfix() != maskedSignals.hasLastfix()) {
            return false;
        }
        if ((hasLastfix() && !getLastfix().equals(maskedSignals.getLastfix())) || hasDeviceZip() != maskedSignals.hasDeviceZip()) {
            return false;
        }
        if ((hasDeviceZip() && !getDeviceZip().equals(maskedSignals.getDeviceZip())) || hasMetro() != maskedSignals.hasMetro()) {
            return false;
        }
        if ((hasMetro() && !getMetro().equals(maskedSignals.getMetro())) || hasDeviceCity() != maskedSignals.hasDeviceCity()) {
            return false;
        }
        if ((hasDeviceCity() && !getDeviceCity().equals(maskedSignals.getDeviceCity())) || hasUserLat() != maskedSignals.hasUserLat()) {
            return false;
        }
        if ((hasUserLat() && !getUserLat().equals(maskedSignals.getUserLat())) || hasUserLon() != maskedSignals.hasUserLon()) {
            return false;
        }
        if ((hasUserLon() && !getUserLon().equals(maskedSignals.getUserLon())) || hasUserZip() != maskedSignals.hasUserZip()) {
            return false;
        }
        if ((hasUserZip() && !getUserZip().equals(maskedSignals.getUserZip())) || hasUserCity() != maskedSignals.hasUserCity()) {
            return false;
        }
        if ((hasUserCity() && !getUserCity().equals(maskedSignals.getUserCity())) || hasModel() != maskedSignals.hasModel()) {
            return false;
        }
        if ((hasModel() && !getModel().equals(maskedSignals.getModel())) || hasHwv() != maskedSignals.hasHwv()) {
            return false;
        }
        if ((hasHwv() && !getHwv().equals(maskedSignals.getHwv())) || hasPpi() != maskedSignals.hasPpi()) {
            return false;
        }
        if ((hasPpi() && !getPpi().equals(maskedSignals.getPpi())) || hasPxratio() != maskedSignals.hasPxratio()) {
            return false;
        }
        if ((hasPxratio() && !getPxratio().equals(maskedSignals.getPxratio())) || hasUa() != maskedSignals.hasUa()) {
            return false;
        }
        if ((hasUa() && !getUa().equals(maskedSignals.getUa())) || hasDiskspace() != maskedSignals.hasDiskspace()) {
            return false;
        }
        if ((hasDiskspace() && !getDiskspace().equals(maskedSignals.getDiskspace())) || hasTotaldisk() != maskedSignals.hasTotaldisk()) {
            return false;
        }
        if ((hasTotaldisk() && !getTotaldisk().equals(maskedSignals.getTotaldisk())) || hasTotalmem() != maskedSignals.hasTotalmem()) {
            return false;
        }
        if ((hasTotalmem() && !getTotalmem().equals(maskedSignals.getTotalmem())) || hasFreemem() != maskedSignals.hasFreemem()) {
            return false;
        }
        if ((hasFreemem() && !getFreemem().equals(maskedSignals.getFreemem())) || hasBatterylevel() != maskedSignals.hasBatterylevel()) {
            return false;
        }
        if ((hasBatterylevel() && !getBatterylevel().equals(maskedSignals.getBatterylevel())) || hasScreenbright() != maskedSignals.hasScreenbright()) {
            return false;
        }
        if ((hasScreenbright() && !getScreenbright().equals(maskedSignals.getScreenbright())) || hasHeadsetname() != maskedSignals.hasHeadsetname()) {
            return false;
        }
        if ((hasHeadsetname() && !getHeadsetname().equals(maskedSignals.getHeadsetname())) || hasVolumeLevel() != maskedSignals.hasVolumeLevel()) {
            return false;
        }
        if ((hasVolumeLevel() && !getVolumeLevel().equals(maskedSignals.getVolumeLevel())) || hasDevicename() != maskedSignals.hasDevicename()) {
            return false;
        }
        if ((hasDevicename() && !getDevicename().equals(maskedSignals.getDevicename())) || hasLastbootup() != maskedSignals.hasLastbootup()) {
            return false;
        }
        if ((hasLastbootup() && !getLastbootup().equals(maskedSignals.getLastbootup())) || hasLastbootupV2() != maskedSignals.hasLastbootupV2()) {
            return false;
        }
        if ((hasLastbootupV2() && !getLastbootupV2().equals(maskedSignals.getLastbootupV2())) || hasTime() != maskedSignals.hasTime()) {
            return false;
        }
        if ((hasTime() && !getTime().equals(maskedSignals.getTime())) || hasInputlanguage() != maskedSignals.hasInputlanguage()) {
            return false;
        }
        if ((hasInputlanguage() && !getInputlanguage().equals(maskedSignals.getInputlanguage())) || hasAccess() != maskedSignals.hasAccess()) {
            return false;
        }
        if ((hasAccess() && !getAccess().equals(maskedSignals.getAccess())) || hasCpuname() != maskedSignals.hasCpuname()) {
            return false;
        }
        if ((hasCpuname() && !getCpuname().equals(maskedSignals.getCpuname())) || hasCpuvendor() != maskedSignals.hasCpuvendor()) {
            return false;
        }
        if ((hasCpuvendor() && !getCpuvendor().equals(maskedSignals.getCpuvendor())) || hasGpuname() != maskedSignals.hasGpuname()) {
            return false;
        }
        if ((hasGpuname() && !getGpuname().equals(maskedSignals.getGpuname())) || hasGpuvendor() != maskedSignals.hasGpuvendor()) {
            return false;
        }
        if ((hasGpuvendor() && !getGpuvendor().equals(maskedSignals.getGpuvendor())) || hasAtts() != maskedSignals.hasAtts()) {
            return false;
        }
        if ((hasAtts() && !getAtts().equals(maskedSignals.getAtts())) || hasYob() != maskedSignals.hasYob()) {
            return false;
        }
        if ((hasYob() && !getYob().equals(maskedSignals.getYob())) || hasGender() != maskedSignals.hasGender()) {
            return false;
        }
        if ((!hasGender() || getGender().equals(maskedSignals.getGender())) && hasKeywords() == maskedSignals.hasKeywords()) {
            return (!hasKeywords() || getKeywords().equals(maskedSignals.getKeywords())) && this.unknownFields.equals(maskedSignals.unknownFields);
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
        if (hasIfa()) {
            hashCode = (((hashCode * 37) + 1) * 53) + getIfa().hashCode();
        }
        if (hasLmt()) {
            hashCode = (((hashCode * 37) + 2) * 53) + getLmt().hashCode();
        }
        if (hasIfv()) {
            hashCode = (((hashCode * 37) + 3) * 53) + getIfv().hashCode();
        }
        if (hasUserId()) {
            hashCode = (((hashCode * 37) + 4) * 53) + getUserId().hashCode();
        }
        if (hasBuyeruid()) {
            hashCode = (((hashCode * 37) + 5) * 53) + getBuyeruid().hashCode();
        }
        if (hasExternalUserIds()) {
            hashCode = (((hashCode * 37) + 6) * 53) + getExternalUserIds().hashCode();
        }
        if (hasCarrier()) {
            hashCode = (((hashCode * 37) + 7) * 53) + getCarrier().hashCode();
        }
        if (hasMccmnc()) {
            hashCode = (((hashCode * 37) + 8) * 53) + getMccmnc().hashCode();
        }
        if (hasSimCarrier()) {
            hashCode = (((hashCode * 37) + 9) * 53) + getSimCarrier().hashCode();
        }
        if (hasDeviceLat()) {
            hashCode = (((hashCode * 37) + 10) * 53) + getDeviceLat().hashCode();
        }
        if (hasDeviceLon()) {
            hashCode = (((hashCode * 37) + 11) * 53) + getDeviceLon().hashCode();
        }
        if (hasAccuracy()) {
            hashCode = (((hashCode * 37) + 12) * 53) + getAccuracy().hashCode();
        }
        if (hasLastfix()) {
            hashCode = (((hashCode * 37) + 13) * 53) + getLastfix().hashCode();
        }
        if (hasDeviceZip()) {
            hashCode = (((hashCode * 37) + 14) * 53) + getDeviceZip().hashCode();
        }
        if (hasMetro()) {
            hashCode = (((hashCode * 37) + 15) * 53) + getMetro().hashCode();
        }
        if (hasDeviceCity()) {
            hashCode = (((hashCode * 37) + 16) * 53) + getDeviceCity().hashCode();
        }
        if (hasUserLat()) {
            hashCode = (((hashCode * 37) + 17) * 53) + getUserLat().hashCode();
        }
        if (hasUserLon()) {
            hashCode = (((hashCode * 37) + 18) * 53) + getUserLon().hashCode();
        }
        if (hasUserZip()) {
            hashCode = (((hashCode * 37) + 19) * 53) + getUserZip().hashCode();
        }
        if (hasUserCity()) {
            hashCode = (((hashCode * 37) + 20) * 53) + getUserCity().hashCode();
        }
        if (hasModel()) {
            hashCode = (((hashCode * 37) + 21) * 53) + getModel().hashCode();
        }
        if (hasHwv()) {
            hashCode = (((hashCode * 37) + 22) * 53) + getHwv().hashCode();
        }
        if (hasPpi()) {
            hashCode = (((hashCode * 37) + 23) * 53) + getPpi().hashCode();
        }
        if (hasPxratio()) {
            hashCode = (((hashCode * 37) + 24) * 53) + getPxratio().hashCode();
        }
        if (hasUa()) {
            hashCode = (((hashCode * 37) + 25) * 53) + getUa().hashCode();
        }
        if (hasDiskspace()) {
            hashCode = (((hashCode * 37) + 26) * 53) + getDiskspace().hashCode();
        }
        if (hasTotaldisk()) {
            hashCode = (((hashCode * 37) + 27) * 53) + getTotaldisk().hashCode();
        }
        if (hasTotalmem()) {
            hashCode = (((hashCode * 37) + 28) * 53) + getTotalmem().hashCode();
        }
        if (hasFreemem()) {
            hashCode = (((hashCode * 37) + 29) * 53) + getFreemem().hashCode();
        }
        if (hasBatterylevel()) {
            hashCode = (((hashCode * 37) + 30) * 53) + getBatterylevel().hashCode();
        }
        if (hasScreenbright()) {
            hashCode = (((hashCode * 37) + 31) * 53) + getScreenbright().hashCode();
        }
        if (hasHeadsetname()) {
            hashCode = (((hashCode * 37) + 32) * 53) + getHeadsetname().hashCode();
        }
        if (hasVolumeLevel()) {
            hashCode = (((hashCode * 37) + 33) * 53) + getVolumeLevel().hashCode();
        }
        if (hasDevicename()) {
            hashCode = (((hashCode * 37) + 34) * 53) + getDevicename().hashCode();
        }
        if (hasLastbootup()) {
            hashCode = (((hashCode * 37) + 35) * 53) + getLastbootup().hashCode();
        }
        if (hasLastbootupV2()) {
            hashCode = (((hashCode * 37) + 36) * 53) + getLastbootupV2().hashCode();
        }
        if (hasTime()) {
            hashCode = (((hashCode * 37) + 37) * 53) + getTime().hashCode();
        }
        if (hasInputlanguage()) {
            hashCode = (((hashCode * 37) + 38) * 53) + getInputlanguage().hashCode();
        }
        if (hasAccess()) {
            hashCode = (((hashCode * 37) + 39) * 53) + getAccess().hashCode();
        }
        if (hasCpuname()) {
            hashCode = (((hashCode * 37) + 40) * 53) + getCpuname().hashCode();
        }
        if (hasCpuvendor()) {
            hashCode = (((hashCode * 37) + 41) * 53) + getCpuvendor().hashCode();
        }
        if (hasGpuname()) {
            hashCode = (((hashCode * 37) + 42) * 53) + getGpuname().hashCode();
        }
        if (hasGpuvendor()) {
            hashCode = (((hashCode * 37) + 43) * 53) + getGpuvendor().hashCode();
        }
        if (hasAtts()) {
            hashCode = (((hashCode * 37) + 44) * 53) + getAtts().hashCode();
        }
        if (hasYob()) {
            hashCode = (((hashCode * 37) + 45) * 53) + getYob().hashCode();
        }
        if (hasGender()) {
            hashCode = (((hashCode * 37) + 46) * 53) + getGender().hashCode();
        }
        if (hasKeywords()) {
            hashCode = (((hashCode * 37) + 47) * 53) + getKeywords().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public static MaskedSignals parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MaskedSignals) PARSER.parseFrom(byteBuffer);
    }

    public static MaskedSignals parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MaskedSignals) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static MaskedSignals parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MaskedSignals) PARSER.parseFrom(byteString);
    }

    public static MaskedSignals parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MaskedSignals) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static MaskedSignals parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MaskedSignals) PARSER.parseFrom(bArr);
    }

    public static MaskedSignals parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MaskedSignals) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static MaskedSignals parseFrom(InputStream inputStream) throws IOException {
        return (MaskedSignals) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static MaskedSignals parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MaskedSignals) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static MaskedSignals parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MaskedSignals) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static MaskedSignals parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MaskedSignals) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static MaskedSignals parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MaskedSignals) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static MaskedSignals parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MaskedSignals) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(MaskedSignals maskedSignals) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(maskedSignals);
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

    public static final class Builder extends GeneratedMessageV3.Builder implements MaskedSignalsOrBuilder {
        private SingleFieldBuilderV3 accessBuilder_;
        private StringValue access_;
        private SingleFieldBuilderV3 accuracyBuilder_;
        private StringValue accuracy_;
        private SingleFieldBuilderV3 attsBuilder_;
        private StringValue atts_;
        private SingleFieldBuilderV3 batterylevelBuilder_;
        private StringValue batterylevel_;
        private SingleFieldBuilderV3 buyeruidBuilder_;
        private StringValue buyeruid_;
        private SingleFieldBuilderV3 carrierBuilder_;
        private StringValue carrier_;
        private SingleFieldBuilderV3 cpunameBuilder_;
        private StringValue cpuname_;
        private SingleFieldBuilderV3 cpuvendorBuilder_;
        private StringValue cpuvendor_;
        private SingleFieldBuilderV3 deviceCityBuilder_;
        private StringValue deviceCity_;
        private SingleFieldBuilderV3 deviceLatBuilder_;
        private StringValue deviceLat_;
        private SingleFieldBuilderV3 deviceLonBuilder_;
        private StringValue deviceLon_;
        private SingleFieldBuilderV3 deviceZipBuilder_;
        private StringValue deviceZip_;
        private SingleFieldBuilderV3 devicenameBuilder_;
        private StringValue devicename_;
        private SingleFieldBuilderV3 diskspaceBuilder_;
        private StringValue diskspace_;
        private SingleFieldBuilderV3 externalUserIdsBuilder_;
        private StringValue externalUserIds_;
        private SingleFieldBuilderV3 freememBuilder_;
        private StringValue freemem_;
        private SingleFieldBuilderV3 genderBuilder_;
        private StringValue gender_;
        private SingleFieldBuilderV3 gpunameBuilder_;
        private StringValue gpuname_;
        private SingleFieldBuilderV3 gpuvendorBuilder_;
        private StringValue gpuvendor_;
        private SingleFieldBuilderV3 headsetnameBuilder_;
        private StringValue headsetname_;
        private SingleFieldBuilderV3 hwvBuilder_;
        private StringValue hwv_;
        private SingleFieldBuilderV3 ifaBuilder_;
        private StringValue ifa_;
        private SingleFieldBuilderV3 ifvBuilder_;
        private StringValue ifv_;
        private SingleFieldBuilderV3 inputlanguageBuilder_;
        private StringValue inputlanguage_;
        private SingleFieldBuilderV3 keywordsBuilder_;
        private StringValue keywords_;
        private SingleFieldBuilderV3 lastbootupBuilder_;
        private SingleFieldBuilderV3 lastbootupV2Builder_;
        private StringValue lastbootupV2_;
        private StringValue lastbootup_;
        private SingleFieldBuilderV3 lastfixBuilder_;
        private StringValue lastfix_;
        private SingleFieldBuilderV3 lmtBuilder_;
        private StringValue lmt_;
        private SingleFieldBuilderV3 mccmncBuilder_;
        private StringValue mccmnc_;
        private SingleFieldBuilderV3 metroBuilder_;
        private StringValue metro_;
        private SingleFieldBuilderV3 modelBuilder_;
        private StringValue model_;
        private SingleFieldBuilderV3 ppiBuilder_;
        private StringValue ppi_;
        private SingleFieldBuilderV3 pxratioBuilder_;
        private StringValue pxratio_;
        private SingleFieldBuilderV3 screenbrightBuilder_;
        private StringValue screenbright_;
        private SingleFieldBuilderV3 simCarrierBuilder_;
        private StringValue simCarrier_;
        private SingleFieldBuilderV3 timeBuilder_;
        private StringValue time_;
        private SingleFieldBuilderV3 totaldiskBuilder_;
        private StringValue totaldisk_;
        private SingleFieldBuilderV3 totalmemBuilder_;
        private StringValue totalmem_;
        private SingleFieldBuilderV3 uaBuilder_;
        private StringValue ua_;
        private SingleFieldBuilderV3 userCityBuilder_;
        private StringValue userCity_;
        private SingleFieldBuilderV3 userIdBuilder_;
        private StringValue userId_;
        private SingleFieldBuilderV3 userLatBuilder_;
        private StringValue userLat_;
        private SingleFieldBuilderV3 userLonBuilder_;
        private StringValue userLon_;
        private SingleFieldBuilderV3 userZipBuilder_;
        private StringValue userZip_;
        private SingleFieldBuilderV3 volumeLevelBuilder_;
        private StringValue volumeLevel_;
        private SingleFieldBuilderV3 yobBuilder_;
        private StringValue yob_;

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_MaskedSignals_descriptor;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_MaskedSignals_fieldAccessorTable.ensureFieldAccessorsInitialized(MaskedSignals.class, Builder.class);
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
            if (this.ifaBuilder_ == null) {
                this.ifa_ = null;
            } else {
                this.ifa_ = null;
                this.ifaBuilder_ = null;
            }
            if (this.lmtBuilder_ == null) {
                this.lmt_ = null;
            } else {
                this.lmt_ = null;
                this.lmtBuilder_ = null;
            }
            if (this.ifvBuilder_ == null) {
                this.ifv_ = null;
            } else {
                this.ifv_ = null;
                this.ifvBuilder_ = null;
            }
            if (this.userIdBuilder_ == null) {
                this.userId_ = null;
            } else {
                this.userId_ = null;
                this.userIdBuilder_ = null;
            }
            if (this.buyeruidBuilder_ == null) {
                this.buyeruid_ = null;
            } else {
                this.buyeruid_ = null;
                this.buyeruidBuilder_ = null;
            }
            if (this.externalUserIdsBuilder_ == null) {
                this.externalUserIds_ = null;
            } else {
                this.externalUserIds_ = null;
                this.externalUserIdsBuilder_ = null;
            }
            if (this.carrierBuilder_ == null) {
                this.carrier_ = null;
            } else {
                this.carrier_ = null;
                this.carrierBuilder_ = null;
            }
            if (this.mccmncBuilder_ == null) {
                this.mccmnc_ = null;
            } else {
                this.mccmnc_ = null;
                this.mccmncBuilder_ = null;
            }
            if (this.simCarrierBuilder_ == null) {
                this.simCarrier_ = null;
            } else {
                this.simCarrier_ = null;
                this.simCarrierBuilder_ = null;
            }
            if (this.deviceLatBuilder_ == null) {
                this.deviceLat_ = null;
            } else {
                this.deviceLat_ = null;
                this.deviceLatBuilder_ = null;
            }
            if (this.deviceLonBuilder_ == null) {
                this.deviceLon_ = null;
            } else {
                this.deviceLon_ = null;
                this.deviceLonBuilder_ = null;
            }
            if (this.accuracyBuilder_ == null) {
                this.accuracy_ = null;
            } else {
                this.accuracy_ = null;
                this.accuracyBuilder_ = null;
            }
            if (this.lastfixBuilder_ == null) {
                this.lastfix_ = null;
            } else {
                this.lastfix_ = null;
                this.lastfixBuilder_ = null;
            }
            if (this.deviceZipBuilder_ == null) {
                this.deviceZip_ = null;
            } else {
                this.deviceZip_ = null;
                this.deviceZipBuilder_ = null;
            }
            if (this.metroBuilder_ == null) {
                this.metro_ = null;
            } else {
                this.metro_ = null;
                this.metroBuilder_ = null;
            }
            if (this.deviceCityBuilder_ == null) {
                this.deviceCity_ = null;
            } else {
                this.deviceCity_ = null;
                this.deviceCityBuilder_ = null;
            }
            if (this.userLatBuilder_ == null) {
                this.userLat_ = null;
            } else {
                this.userLat_ = null;
                this.userLatBuilder_ = null;
            }
            if (this.userLonBuilder_ == null) {
                this.userLon_ = null;
            } else {
                this.userLon_ = null;
                this.userLonBuilder_ = null;
            }
            if (this.userZipBuilder_ == null) {
                this.userZip_ = null;
            } else {
                this.userZip_ = null;
                this.userZipBuilder_ = null;
            }
            if (this.userCityBuilder_ == null) {
                this.userCity_ = null;
            } else {
                this.userCity_ = null;
                this.userCityBuilder_ = null;
            }
            if (this.modelBuilder_ == null) {
                this.model_ = null;
            } else {
                this.model_ = null;
                this.modelBuilder_ = null;
            }
            if (this.hwvBuilder_ == null) {
                this.hwv_ = null;
            } else {
                this.hwv_ = null;
                this.hwvBuilder_ = null;
            }
            if (this.ppiBuilder_ == null) {
                this.ppi_ = null;
            } else {
                this.ppi_ = null;
                this.ppiBuilder_ = null;
            }
            if (this.pxratioBuilder_ == null) {
                this.pxratio_ = null;
            } else {
                this.pxratio_ = null;
                this.pxratioBuilder_ = null;
            }
            if (this.uaBuilder_ == null) {
                this.ua_ = null;
            } else {
                this.ua_ = null;
                this.uaBuilder_ = null;
            }
            if (this.diskspaceBuilder_ == null) {
                this.diskspace_ = null;
            } else {
                this.diskspace_ = null;
                this.diskspaceBuilder_ = null;
            }
            if (this.totaldiskBuilder_ == null) {
                this.totaldisk_ = null;
            } else {
                this.totaldisk_ = null;
                this.totaldiskBuilder_ = null;
            }
            if (this.totalmemBuilder_ == null) {
                this.totalmem_ = null;
            } else {
                this.totalmem_ = null;
                this.totalmemBuilder_ = null;
            }
            if (this.freememBuilder_ == null) {
                this.freemem_ = null;
            } else {
                this.freemem_ = null;
                this.freememBuilder_ = null;
            }
            if (this.batterylevelBuilder_ == null) {
                this.batterylevel_ = null;
            } else {
                this.batterylevel_ = null;
                this.batterylevelBuilder_ = null;
            }
            if (this.screenbrightBuilder_ == null) {
                this.screenbright_ = null;
            } else {
                this.screenbright_ = null;
                this.screenbrightBuilder_ = null;
            }
            if (this.headsetnameBuilder_ == null) {
                this.headsetname_ = null;
            } else {
                this.headsetname_ = null;
                this.headsetnameBuilder_ = null;
            }
            if (this.volumeLevelBuilder_ == null) {
                this.volumeLevel_ = null;
            } else {
                this.volumeLevel_ = null;
                this.volumeLevelBuilder_ = null;
            }
            if (this.devicenameBuilder_ == null) {
                this.devicename_ = null;
            } else {
                this.devicename_ = null;
                this.devicenameBuilder_ = null;
            }
            if (this.lastbootupBuilder_ == null) {
                this.lastbootup_ = null;
            } else {
                this.lastbootup_ = null;
                this.lastbootupBuilder_ = null;
            }
            if (this.lastbootupV2Builder_ == null) {
                this.lastbootupV2_ = null;
            } else {
                this.lastbootupV2_ = null;
                this.lastbootupV2Builder_ = null;
            }
            if (this.timeBuilder_ == null) {
                this.time_ = null;
            } else {
                this.time_ = null;
                this.timeBuilder_ = null;
            }
            if (this.inputlanguageBuilder_ == null) {
                this.inputlanguage_ = null;
            } else {
                this.inputlanguage_ = null;
                this.inputlanguageBuilder_ = null;
            }
            if (this.accessBuilder_ == null) {
                this.access_ = null;
            } else {
                this.access_ = null;
                this.accessBuilder_ = null;
            }
            if (this.cpunameBuilder_ == null) {
                this.cpuname_ = null;
            } else {
                this.cpuname_ = null;
                this.cpunameBuilder_ = null;
            }
            if (this.cpuvendorBuilder_ == null) {
                this.cpuvendor_ = null;
            } else {
                this.cpuvendor_ = null;
                this.cpuvendorBuilder_ = null;
            }
            if (this.gpunameBuilder_ == null) {
                this.gpuname_ = null;
            } else {
                this.gpuname_ = null;
                this.gpunameBuilder_ = null;
            }
            if (this.gpuvendorBuilder_ == null) {
                this.gpuvendor_ = null;
            } else {
                this.gpuvendor_ = null;
                this.gpuvendorBuilder_ = null;
            }
            if (this.attsBuilder_ == null) {
                this.atts_ = null;
            } else {
                this.atts_ = null;
                this.attsBuilder_ = null;
            }
            if (this.yobBuilder_ == null) {
                this.yob_ = null;
            } else {
                this.yob_ = null;
                this.yobBuilder_ = null;
            }
            if (this.genderBuilder_ == null) {
                this.gender_ = null;
            } else {
                this.gender_ = null;
                this.genderBuilder_ = null;
            }
            if (this.keywordsBuilder_ == null) {
                this.keywords_ = null;
            } else {
                this.keywords_ = null;
                this.keywordsBuilder_ = null;
            }
            return this;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_MaskedSignals_descriptor;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* renamed from: getDefaultInstanceForType */
        public MaskedSignals mo3244getDefaultInstanceForType() {
            return MaskedSignals.getDefaultInstance();
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public MaskedSignals build() {
            MaskedSignals buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public MaskedSignals buildPartial() {
            MaskedSignals maskedSignals = new MaskedSignals(this);
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.ifaBuilder_;
            if (singleFieldBuilderV3 == null) {
                maskedSignals.ifa_ = this.ifa_;
            } else {
                maskedSignals.ifa_ = (StringValue) singleFieldBuilderV3.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV32 = this.lmtBuilder_;
            if (singleFieldBuilderV32 == null) {
                maskedSignals.lmt_ = this.lmt_;
            } else {
                maskedSignals.lmt_ = (StringValue) singleFieldBuilderV32.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV33 = this.ifvBuilder_;
            if (singleFieldBuilderV33 == null) {
                maskedSignals.ifv_ = this.ifv_;
            } else {
                maskedSignals.ifv_ = (StringValue) singleFieldBuilderV33.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV34 = this.userIdBuilder_;
            if (singleFieldBuilderV34 == null) {
                maskedSignals.userId_ = this.userId_;
            } else {
                maskedSignals.userId_ = (StringValue) singleFieldBuilderV34.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV35 = this.buyeruidBuilder_;
            if (singleFieldBuilderV35 == null) {
                maskedSignals.buyeruid_ = this.buyeruid_;
            } else {
                maskedSignals.buyeruid_ = (StringValue) singleFieldBuilderV35.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV36 = this.externalUserIdsBuilder_;
            if (singleFieldBuilderV36 == null) {
                maskedSignals.externalUserIds_ = this.externalUserIds_;
            } else {
                maskedSignals.externalUserIds_ = (StringValue) singleFieldBuilderV36.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV37 = this.carrierBuilder_;
            if (singleFieldBuilderV37 == null) {
                maskedSignals.carrier_ = this.carrier_;
            } else {
                maskedSignals.carrier_ = (StringValue) singleFieldBuilderV37.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV38 = this.mccmncBuilder_;
            if (singleFieldBuilderV38 == null) {
                maskedSignals.mccmnc_ = this.mccmnc_;
            } else {
                maskedSignals.mccmnc_ = (StringValue) singleFieldBuilderV38.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV39 = this.simCarrierBuilder_;
            if (singleFieldBuilderV39 == null) {
                maskedSignals.simCarrier_ = this.simCarrier_;
            } else {
                maskedSignals.simCarrier_ = (StringValue) singleFieldBuilderV39.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV310 = this.deviceLatBuilder_;
            if (singleFieldBuilderV310 == null) {
                maskedSignals.deviceLat_ = this.deviceLat_;
            } else {
                maskedSignals.deviceLat_ = (StringValue) singleFieldBuilderV310.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV311 = this.deviceLonBuilder_;
            if (singleFieldBuilderV311 == null) {
                maskedSignals.deviceLon_ = this.deviceLon_;
            } else {
                maskedSignals.deviceLon_ = (StringValue) singleFieldBuilderV311.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV312 = this.accuracyBuilder_;
            if (singleFieldBuilderV312 == null) {
                maskedSignals.accuracy_ = this.accuracy_;
            } else {
                maskedSignals.accuracy_ = (StringValue) singleFieldBuilderV312.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV313 = this.lastfixBuilder_;
            if (singleFieldBuilderV313 == null) {
                maskedSignals.lastfix_ = this.lastfix_;
            } else {
                maskedSignals.lastfix_ = (StringValue) singleFieldBuilderV313.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV314 = this.deviceZipBuilder_;
            if (singleFieldBuilderV314 == null) {
                maskedSignals.deviceZip_ = this.deviceZip_;
            } else {
                maskedSignals.deviceZip_ = (StringValue) singleFieldBuilderV314.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV315 = this.metroBuilder_;
            if (singleFieldBuilderV315 == null) {
                maskedSignals.metro_ = this.metro_;
            } else {
                maskedSignals.metro_ = (StringValue) singleFieldBuilderV315.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV316 = this.deviceCityBuilder_;
            if (singleFieldBuilderV316 == null) {
                maskedSignals.deviceCity_ = this.deviceCity_;
            } else {
                maskedSignals.deviceCity_ = (StringValue) singleFieldBuilderV316.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV317 = this.userLatBuilder_;
            if (singleFieldBuilderV317 == null) {
                maskedSignals.userLat_ = this.userLat_;
            } else {
                maskedSignals.userLat_ = (StringValue) singleFieldBuilderV317.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV318 = this.userLonBuilder_;
            if (singleFieldBuilderV318 == null) {
                maskedSignals.userLon_ = this.userLon_;
            } else {
                maskedSignals.userLon_ = (StringValue) singleFieldBuilderV318.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV319 = this.userZipBuilder_;
            if (singleFieldBuilderV319 == null) {
                maskedSignals.userZip_ = this.userZip_;
            } else {
                maskedSignals.userZip_ = (StringValue) singleFieldBuilderV319.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV320 = this.userCityBuilder_;
            if (singleFieldBuilderV320 == null) {
                maskedSignals.userCity_ = this.userCity_;
            } else {
                maskedSignals.userCity_ = (StringValue) singleFieldBuilderV320.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV321 = this.modelBuilder_;
            if (singleFieldBuilderV321 == null) {
                maskedSignals.model_ = this.model_;
            } else {
                maskedSignals.model_ = (StringValue) singleFieldBuilderV321.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV322 = this.hwvBuilder_;
            if (singleFieldBuilderV322 == null) {
                maskedSignals.hwv_ = this.hwv_;
            } else {
                maskedSignals.hwv_ = (StringValue) singleFieldBuilderV322.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV323 = this.ppiBuilder_;
            if (singleFieldBuilderV323 == null) {
                maskedSignals.ppi_ = this.ppi_;
            } else {
                maskedSignals.ppi_ = (StringValue) singleFieldBuilderV323.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV324 = this.pxratioBuilder_;
            if (singleFieldBuilderV324 == null) {
                maskedSignals.pxratio_ = this.pxratio_;
            } else {
                maskedSignals.pxratio_ = (StringValue) singleFieldBuilderV324.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV325 = this.uaBuilder_;
            if (singleFieldBuilderV325 == null) {
                maskedSignals.ua_ = this.ua_;
            } else {
                maskedSignals.ua_ = (StringValue) singleFieldBuilderV325.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV326 = this.diskspaceBuilder_;
            if (singleFieldBuilderV326 == null) {
                maskedSignals.diskspace_ = this.diskspace_;
            } else {
                maskedSignals.diskspace_ = (StringValue) singleFieldBuilderV326.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV327 = this.totaldiskBuilder_;
            if (singleFieldBuilderV327 == null) {
                maskedSignals.totaldisk_ = this.totaldisk_;
            } else {
                maskedSignals.totaldisk_ = (StringValue) singleFieldBuilderV327.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV328 = this.totalmemBuilder_;
            if (singleFieldBuilderV328 == null) {
                maskedSignals.totalmem_ = this.totalmem_;
            } else {
                maskedSignals.totalmem_ = (StringValue) singleFieldBuilderV328.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV329 = this.freememBuilder_;
            if (singleFieldBuilderV329 == null) {
                maskedSignals.freemem_ = this.freemem_;
            } else {
                maskedSignals.freemem_ = (StringValue) singleFieldBuilderV329.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV330 = this.batterylevelBuilder_;
            if (singleFieldBuilderV330 == null) {
                maskedSignals.batterylevel_ = this.batterylevel_;
            } else {
                maskedSignals.batterylevel_ = (StringValue) singleFieldBuilderV330.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV331 = this.screenbrightBuilder_;
            if (singleFieldBuilderV331 == null) {
                maskedSignals.screenbright_ = this.screenbright_;
            } else {
                maskedSignals.screenbright_ = (StringValue) singleFieldBuilderV331.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV332 = this.headsetnameBuilder_;
            if (singleFieldBuilderV332 == null) {
                maskedSignals.headsetname_ = this.headsetname_;
            } else {
                maskedSignals.headsetname_ = (StringValue) singleFieldBuilderV332.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV333 = this.volumeLevelBuilder_;
            if (singleFieldBuilderV333 == null) {
                maskedSignals.volumeLevel_ = this.volumeLevel_;
            } else {
                maskedSignals.volumeLevel_ = (StringValue) singleFieldBuilderV333.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV334 = this.devicenameBuilder_;
            if (singleFieldBuilderV334 == null) {
                maskedSignals.devicename_ = this.devicename_;
            } else {
                maskedSignals.devicename_ = (StringValue) singleFieldBuilderV334.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV335 = this.lastbootupBuilder_;
            if (singleFieldBuilderV335 == null) {
                maskedSignals.lastbootup_ = this.lastbootup_;
            } else {
                maskedSignals.lastbootup_ = (StringValue) singleFieldBuilderV335.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV336 = this.lastbootupV2Builder_;
            if (singleFieldBuilderV336 == null) {
                maskedSignals.lastbootupV2_ = this.lastbootupV2_;
            } else {
                maskedSignals.lastbootupV2_ = (StringValue) singleFieldBuilderV336.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV337 = this.timeBuilder_;
            if (singleFieldBuilderV337 == null) {
                maskedSignals.time_ = this.time_;
            } else {
                maskedSignals.time_ = (StringValue) singleFieldBuilderV337.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV338 = this.inputlanguageBuilder_;
            if (singleFieldBuilderV338 == null) {
                maskedSignals.inputlanguage_ = this.inputlanguage_;
            } else {
                maskedSignals.inputlanguage_ = (StringValue) singleFieldBuilderV338.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV339 = this.accessBuilder_;
            if (singleFieldBuilderV339 == null) {
                maskedSignals.access_ = this.access_;
            } else {
                maskedSignals.access_ = (StringValue) singleFieldBuilderV339.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV340 = this.cpunameBuilder_;
            if (singleFieldBuilderV340 == null) {
                maskedSignals.cpuname_ = this.cpuname_;
            } else {
                maskedSignals.cpuname_ = (StringValue) singleFieldBuilderV340.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV341 = this.cpuvendorBuilder_;
            if (singleFieldBuilderV341 == null) {
                maskedSignals.cpuvendor_ = this.cpuvendor_;
            } else {
                maskedSignals.cpuvendor_ = (StringValue) singleFieldBuilderV341.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV342 = this.gpunameBuilder_;
            if (singleFieldBuilderV342 == null) {
                maskedSignals.gpuname_ = this.gpuname_;
            } else {
                maskedSignals.gpuname_ = (StringValue) singleFieldBuilderV342.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV343 = this.gpuvendorBuilder_;
            if (singleFieldBuilderV343 == null) {
                maskedSignals.gpuvendor_ = this.gpuvendor_;
            } else {
                maskedSignals.gpuvendor_ = (StringValue) singleFieldBuilderV343.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV344 = this.attsBuilder_;
            if (singleFieldBuilderV344 == null) {
                maskedSignals.atts_ = this.atts_;
            } else {
                maskedSignals.atts_ = (StringValue) singleFieldBuilderV344.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV345 = this.yobBuilder_;
            if (singleFieldBuilderV345 == null) {
                maskedSignals.yob_ = this.yob_;
            } else {
                maskedSignals.yob_ = (StringValue) singleFieldBuilderV345.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV346 = this.genderBuilder_;
            if (singleFieldBuilderV346 == null) {
                maskedSignals.gender_ = this.gender_;
            } else {
                maskedSignals.gender_ = (StringValue) singleFieldBuilderV346.build();
            }
            SingleFieldBuilderV3 singleFieldBuilderV347 = this.keywordsBuilder_;
            if (singleFieldBuilderV347 == null) {
                maskedSignals.keywords_ = this.keywords_;
            } else {
                maskedSignals.keywords_ = (StringValue) singleFieldBuilderV347.build();
            }
            onBuilt();
            return maskedSignals;
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
            if (message instanceof MaskedSignals) {
                return mergeFrom((MaskedSignals) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(MaskedSignals maskedSignals) {
            if (maskedSignals == MaskedSignals.getDefaultInstance()) {
                return this;
            }
            if (maskedSignals.hasIfa()) {
                mergeIfa(maskedSignals.getIfa());
            }
            if (maskedSignals.hasLmt()) {
                mergeLmt(maskedSignals.getLmt());
            }
            if (maskedSignals.hasIfv()) {
                mergeIfv(maskedSignals.getIfv());
            }
            if (maskedSignals.hasUserId()) {
                mergeUserId(maskedSignals.getUserId());
            }
            if (maskedSignals.hasBuyeruid()) {
                mergeBuyeruid(maskedSignals.getBuyeruid());
            }
            if (maskedSignals.hasExternalUserIds()) {
                mergeExternalUserIds(maskedSignals.getExternalUserIds());
            }
            if (maskedSignals.hasCarrier()) {
                mergeCarrier(maskedSignals.getCarrier());
            }
            if (maskedSignals.hasMccmnc()) {
                mergeMccmnc(maskedSignals.getMccmnc());
            }
            if (maskedSignals.hasSimCarrier()) {
                mergeSimCarrier(maskedSignals.getSimCarrier());
            }
            if (maskedSignals.hasDeviceLat()) {
                mergeDeviceLat(maskedSignals.getDeviceLat());
            }
            if (maskedSignals.hasDeviceLon()) {
                mergeDeviceLon(maskedSignals.getDeviceLon());
            }
            if (maskedSignals.hasAccuracy()) {
                mergeAccuracy(maskedSignals.getAccuracy());
            }
            if (maskedSignals.hasLastfix()) {
                mergeLastfix(maskedSignals.getLastfix());
            }
            if (maskedSignals.hasDeviceZip()) {
                mergeDeviceZip(maskedSignals.getDeviceZip());
            }
            if (maskedSignals.hasMetro()) {
                mergeMetro(maskedSignals.getMetro());
            }
            if (maskedSignals.hasDeviceCity()) {
                mergeDeviceCity(maskedSignals.getDeviceCity());
            }
            if (maskedSignals.hasUserLat()) {
                mergeUserLat(maskedSignals.getUserLat());
            }
            if (maskedSignals.hasUserLon()) {
                mergeUserLon(maskedSignals.getUserLon());
            }
            if (maskedSignals.hasUserZip()) {
                mergeUserZip(maskedSignals.getUserZip());
            }
            if (maskedSignals.hasUserCity()) {
                mergeUserCity(maskedSignals.getUserCity());
            }
            if (maskedSignals.hasModel()) {
                mergeModel(maskedSignals.getModel());
            }
            if (maskedSignals.hasHwv()) {
                mergeHwv(maskedSignals.getHwv());
            }
            if (maskedSignals.hasPpi()) {
                mergePpi(maskedSignals.getPpi());
            }
            if (maskedSignals.hasPxratio()) {
                mergePxratio(maskedSignals.getPxratio());
            }
            if (maskedSignals.hasUa()) {
                mergeUa(maskedSignals.getUa());
            }
            if (maskedSignals.hasDiskspace()) {
                mergeDiskspace(maskedSignals.getDiskspace());
            }
            if (maskedSignals.hasTotaldisk()) {
                mergeTotaldisk(maskedSignals.getTotaldisk());
            }
            if (maskedSignals.hasTotalmem()) {
                mergeTotalmem(maskedSignals.getTotalmem());
            }
            if (maskedSignals.hasFreemem()) {
                mergeFreemem(maskedSignals.getFreemem());
            }
            if (maskedSignals.hasBatterylevel()) {
                mergeBatterylevel(maskedSignals.getBatterylevel());
            }
            if (maskedSignals.hasScreenbright()) {
                mergeScreenbright(maskedSignals.getScreenbright());
            }
            if (maskedSignals.hasHeadsetname()) {
                mergeHeadsetname(maskedSignals.getHeadsetname());
            }
            if (maskedSignals.hasVolumeLevel()) {
                mergeVolumeLevel(maskedSignals.getVolumeLevel());
            }
            if (maskedSignals.hasDevicename()) {
                mergeDevicename(maskedSignals.getDevicename());
            }
            if (maskedSignals.hasLastbootup()) {
                mergeLastbootup(maskedSignals.getLastbootup());
            }
            if (maskedSignals.hasLastbootupV2()) {
                mergeLastbootupV2(maskedSignals.getLastbootupV2());
            }
            if (maskedSignals.hasTime()) {
                mergeTime(maskedSignals.getTime());
            }
            if (maskedSignals.hasInputlanguage()) {
                mergeInputlanguage(maskedSignals.getInputlanguage());
            }
            if (maskedSignals.hasAccess()) {
                mergeAccess(maskedSignals.getAccess());
            }
            if (maskedSignals.hasCpuname()) {
                mergeCpuname(maskedSignals.getCpuname());
            }
            if (maskedSignals.hasCpuvendor()) {
                mergeCpuvendor(maskedSignals.getCpuvendor());
            }
            if (maskedSignals.hasGpuname()) {
                mergeGpuname(maskedSignals.getGpuname());
            }
            if (maskedSignals.hasGpuvendor()) {
                mergeGpuvendor(maskedSignals.getGpuvendor());
            }
            if (maskedSignals.hasAtts()) {
                mergeAtts(maskedSignals.getAtts());
            }
            if (maskedSignals.hasYob()) {
                mergeYob(maskedSignals.getYob());
            }
            if (maskedSignals.hasGender()) {
                mergeGender(maskedSignals.getGender());
            }
            if (maskedSignals.hasKeywords()) {
                mergeKeywords(maskedSignals.getKeywords());
            }
            mergeUnknownFields(((GeneratedMessageV3) maskedSignals).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            MaskedSignals maskedSignals = null;
            try {
                try {
                    MaskedSignals maskedSignals2 = (MaskedSignals) MaskedSignals.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (maskedSignals2 != null) {
                        mergeFrom(maskedSignals2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    MaskedSignals maskedSignals3 = (MaskedSignals) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        maskedSignals = maskedSignals3;
                        if (maskedSignals != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (maskedSignals != null) {
                    mergeFrom(maskedSignals);
                }
                throw th;
            }
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public boolean hasIfa() {
            return (this.ifaBuilder_ == null && this.ifa_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValue getIfa() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.ifaBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue = this.ifa_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }
            return (StringValue) singleFieldBuilderV3.getMessage();
        }

        public Builder setIfa(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.ifaBuilder_;
            if (singleFieldBuilderV3 == null) {
                stringValue.getClass();
                this.ifa_ = stringValue;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(stringValue);
            }
            return this;
        }

        public Builder setIfa(StringValue.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.ifaBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.ifa_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeIfa(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.ifaBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue2 = this.ifa_;
                if (stringValue2 != null) {
                    this.ifa_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.ifa_ = stringValue;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(stringValue);
            }
            return this;
        }

        public Builder clearIfa() {
            if (this.ifaBuilder_ == null) {
                this.ifa_ = null;
                onChanged();
            } else {
                this.ifa_ = null;
                this.ifaBuilder_ = null;
            }
            return this;
        }

        public StringValue.Builder getIfaBuilder() {
            onChanged();
            return (StringValue.Builder) getIfaFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValueOrBuilder getIfaOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.ifaBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StringValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            StringValue stringValue = this.ifa_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        private SingleFieldBuilderV3 getIfaFieldBuilder() {
            if (this.ifaBuilder_ == null) {
                this.ifaBuilder_ = new SingleFieldBuilderV3(getIfa(), getParentForChildren(), isClean());
                this.ifa_ = null;
            }
            return this.ifaBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public boolean hasLmt() {
            return (this.lmtBuilder_ == null && this.lmt_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValue getLmt() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.lmtBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue = this.lmt_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }
            return (StringValue) singleFieldBuilderV3.getMessage();
        }

        public Builder setLmt(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.lmtBuilder_;
            if (singleFieldBuilderV3 == null) {
                stringValue.getClass();
                this.lmt_ = stringValue;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(stringValue);
            }
            return this;
        }

        public Builder setLmt(StringValue.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.lmtBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.lmt_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeLmt(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.lmtBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue2 = this.lmt_;
                if (stringValue2 != null) {
                    this.lmt_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.lmt_ = stringValue;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(stringValue);
            }
            return this;
        }

        public Builder clearLmt() {
            if (this.lmtBuilder_ == null) {
                this.lmt_ = null;
                onChanged();
            } else {
                this.lmt_ = null;
                this.lmtBuilder_ = null;
            }
            return this;
        }

        public StringValue.Builder getLmtBuilder() {
            onChanged();
            return (StringValue.Builder) getLmtFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValueOrBuilder getLmtOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.lmtBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StringValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            StringValue stringValue = this.lmt_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        private SingleFieldBuilderV3 getLmtFieldBuilder() {
            if (this.lmtBuilder_ == null) {
                this.lmtBuilder_ = new SingleFieldBuilderV3(getLmt(), getParentForChildren(), isClean());
                this.lmt_ = null;
            }
            return this.lmtBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public boolean hasIfv() {
            return (this.ifvBuilder_ == null && this.ifv_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValue getIfv() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.ifvBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue = this.ifv_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }
            return (StringValue) singleFieldBuilderV3.getMessage();
        }

        public Builder setIfv(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.ifvBuilder_;
            if (singleFieldBuilderV3 == null) {
                stringValue.getClass();
                this.ifv_ = stringValue;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(stringValue);
            }
            return this;
        }

        public Builder setIfv(StringValue.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.ifvBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.ifv_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeIfv(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.ifvBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue2 = this.ifv_;
                if (stringValue2 != null) {
                    this.ifv_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.ifv_ = stringValue;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(stringValue);
            }
            return this;
        }

        public Builder clearIfv() {
            if (this.ifvBuilder_ == null) {
                this.ifv_ = null;
                onChanged();
            } else {
                this.ifv_ = null;
                this.ifvBuilder_ = null;
            }
            return this;
        }

        public StringValue.Builder getIfvBuilder() {
            onChanged();
            return (StringValue.Builder) getIfvFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValueOrBuilder getIfvOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.ifvBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StringValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            StringValue stringValue = this.ifv_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        private SingleFieldBuilderV3 getIfvFieldBuilder() {
            if (this.ifvBuilder_ == null) {
                this.ifvBuilder_ = new SingleFieldBuilderV3(getIfv(), getParentForChildren(), isClean());
                this.ifv_ = null;
            }
            return this.ifvBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public boolean hasUserId() {
            return (this.userIdBuilder_ == null && this.userId_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValue getUserId() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.userIdBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue = this.userId_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }
            return (StringValue) singleFieldBuilderV3.getMessage();
        }

        public Builder setUserId(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.userIdBuilder_;
            if (singleFieldBuilderV3 == null) {
                stringValue.getClass();
                this.userId_ = stringValue;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(stringValue);
            }
            return this;
        }

        public Builder setUserId(StringValue.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.userIdBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.userId_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeUserId(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.userIdBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue2 = this.userId_;
                if (stringValue2 != null) {
                    this.userId_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.userId_ = stringValue;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(stringValue);
            }
            return this;
        }

        public Builder clearUserId() {
            if (this.userIdBuilder_ == null) {
                this.userId_ = null;
                onChanged();
            } else {
                this.userId_ = null;
                this.userIdBuilder_ = null;
            }
            return this;
        }

        public StringValue.Builder getUserIdBuilder() {
            onChanged();
            return (StringValue.Builder) getUserIdFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValueOrBuilder getUserIdOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.userIdBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StringValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            StringValue stringValue = this.userId_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        private SingleFieldBuilderV3 getUserIdFieldBuilder() {
            if (this.userIdBuilder_ == null) {
                this.userIdBuilder_ = new SingleFieldBuilderV3(getUserId(), getParentForChildren(), isClean());
                this.userId_ = null;
            }
            return this.userIdBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public boolean hasBuyeruid() {
            return (this.buyeruidBuilder_ == null && this.buyeruid_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValue getBuyeruid() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.buyeruidBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue = this.buyeruid_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }
            return (StringValue) singleFieldBuilderV3.getMessage();
        }

        public Builder setBuyeruid(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.buyeruidBuilder_;
            if (singleFieldBuilderV3 == null) {
                stringValue.getClass();
                this.buyeruid_ = stringValue;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(stringValue);
            }
            return this;
        }

        public Builder setBuyeruid(StringValue.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.buyeruidBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.buyeruid_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeBuyeruid(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.buyeruidBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue2 = this.buyeruid_;
                if (stringValue2 != null) {
                    this.buyeruid_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.buyeruid_ = stringValue;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(stringValue);
            }
            return this;
        }

        public Builder clearBuyeruid() {
            if (this.buyeruidBuilder_ == null) {
                this.buyeruid_ = null;
                onChanged();
            } else {
                this.buyeruid_ = null;
                this.buyeruidBuilder_ = null;
            }
            return this;
        }

        public StringValue.Builder getBuyeruidBuilder() {
            onChanged();
            return (StringValue.Builder) getBuyeruidFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValueOrBuilder getBuyeruidOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.buyeruidBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StringValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            StringValue stringValue = this.buyeruid_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        private SingleFieldBuilderV3 getBuyeruidFieldBuilder() {
            if (this.buyeruidBuilder_ == null) {
                this.buyeruidBuilder_ = new SingleFieldBuilderV3(getBuyeruid(), getParentForChildren(), isClean());
                this.buyeruid_ = null;
            }
            return this.buyeruidBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public boolean hasExternalUserIds() {
            return (this.externalUserIdsBuilder_ == null && this.externalUserIds_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValue getExternalUserIds() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.externalUserIdsBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue = this.externalUserIds_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }
            return (StringValue) singleFieldBuilderV3.getMessage();
        }

        public Builder setExternalUserIds(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.externalUserIdsBuilder_;
            if (singleFieldBuilderV3 == null) {
                stringValue.getClass();
                this.externalUserIds_ = stringValue;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(stringValue);
            }
            return this;
        }

        public Builder setExternalUserIds(StringValue.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.externalUserIdsBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.externalUserIds_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeExternalUserIds(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.externalUserIdsBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue2 = this.externalUserIds_;
                if (stringValue2 != null) {
                    this.externalUserIds_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.externalUserIds_ = stringValue;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(stringValue);
            }
            return this;
        }

        public Builder clearExternalUserIds() {
            if (this.externalUserIdsBuilder_ == null) {
                this.externalUserIds_ = null;
                onChanged();
            } else {
                this.externalUserIds_ = null;
                this.externalUserIdsBuilder_ = null;
            }
            return this;
        }

        public StringValue.Builder getExternalUserIdsBuilder() {
            onChanged();
            return (StringValue.Builder) getExternalUserIdsFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValueOrBuilder getExternalUserIdsOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.externalUserIdsBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StringValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            StringValue stringValue = this.externalUserIds_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        private SingleFieldBuilderV3 getExternalUserIdsFieldBuilder() {
            if (this.externalUserIdsBuilder_ == null) {
                this.externalUserIdsBuilder_ = new SingleFieldBuilderV3(getExternalUserIds(), getParentForChildren(), isClean());
                this.externalUserIds_ = null;
            }
            return this.externalUserIdsBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public boolean hasCarrier() {
            return (this.carrierBuilder_ == null && this.carrier_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValue getCarrier() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.carrierBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue = this.carrier_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }
            return (StringValue) singleFieldBuilderV3.getMessage();
        }

        public Builder setCarrier(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.carrierBuilder_;
            if (singleFieldBuilderV3 == null) {
                stringValue.getClass();
                this.carrier_ = stringValue;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(stringValue);
            }
            return this;
        }

        public Builder setCarrier(StringValue.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.carrierBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.carrier_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeCarrier(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.carrierBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue2 = this.carrier_;
                if (stringValue2 != null) {
                    this.carrier_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.carrier_ = stringValue;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(stringValue);
            }
            return this;
        }

        public Builder clearCarrier() {
            if (this.carrierBuilder_ == null) {
                this.carrier_ = null;
                onChanged();
            } else {
                this.carrier_ = null;
                this.carrierBuilder_ = null;
            }
            return this;
        }

        public StringValue.Builder getCarrierBuilder() {
            onChanged();
            return (StringValue.Builder) getCarrierFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValueOrBuilder getCarrierOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.carrierBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StringValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            StringValue stringValue = this.carrier_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        private SingleFieldBuilderV3 getCarrierFieldBuilder() {
            if (this.carrierBuilder_ == null) {
                this.carrierBuilder_ = new SingleFieldBuilderV3(getCarrier(), getParentForChildren(), isClean());
                this.carrier_ = null;
            }
            return this.carrierBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public boolean hasMccmnc() {
            return (this.mccmncBuilder_ == null && this.mccmnc_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValue getMccmnc() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.mccmncBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue = this.mccmnc_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }
            return (StringValue) singleFieldBuilderV3.getMessage();
        }

        public Builder setMccmnc(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.mccmncBuilder_;
            if (singleFieldBuilderV3 == null) {
                stringValue.getClass();
                this.mccmnc_ = stringValue;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(stringValue);
            }
            return this;
        }

        public Builder setMccmnc(StringValue.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.mccmncBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.mccmnc_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeMccmnc(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.mccmncBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue2 = this.mccmnc_;
                if (stringValue2 != null) {
                    this.mccmnc_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.mccmnc_ = stringValue;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(stringValue);
            }
            return this;
        }

        public Builder clearMccmnc() {
            if (this.mccmncBuilder_ == null) {
                this.mccmnc_ = null;
                onChanged();
            } else {
                this.mccmnc_ = null;
                this.mccmncBuilder_ = null;
            }
            return this;
        }

        public StringValue.Builder getMccmncBuilder() {
            onChanged();
            return (StringValue.Builder) getMccmncFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValueOrBuilder getMccmncOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.mccmncBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StringValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            StringValue stringValue = this.mccmnc_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        private SingleFieldBuilderV3 getMccmncFieldBuilder() {
            if (this.mccmncBuilder_ == null) {
                this.mccmncBuilder_ = new SingleFieldBuilderV3(getMccmnc(), getParentForChildren(), isClean());
                this.mccmnc_ = null;
            }
            return this.mccmncBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public boolean hasSimCarrier() {
            return (this.simCarrierBuilder_ == null && this.simCarrier_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValue getSimCarrier() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.simCarrierBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue = this.simCarrier_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }
            return (StringValue) singleFieldBuilderV3.getMessage();
        }

        public Builder setSimCarrier(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.simCarrierBuilder_;
            if (singleFieldBuilderV3 == null) {
                stringValue.getClass();
                this.simCarrier_ = stringValue;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(stringValue);
            }
            return this;
        }

        public Builder setSimCarrier(StringValue.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.simCarrierBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.simCarrier_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeSimCarrier(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.simCarrierBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue2 = this.simCarrier_;
                if (stringValue2 != null) {
                    this.simCarrier_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.simCarrier_ = stringValue;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(stringValue);
            }
            return this;
        }

        public Builder clearSimCarrier() {
            if (this.simCarrierBuilder_ == null) {
                this.simCarrier_ = null;
                onChanged();
            } else {
                this.simCarrier_ = null;
                this.simCarrierBuilder_ = null;
            }
            return this;
        }

        public StringValue.Builder getSimCarrierBuilder() {
            onChanged();
            return (StringValue.Builder) getSimCarrierFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValueOrBuilder getSimCarrierOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.simCarrierBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StringValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            StringValue stringValue = this.simCarrier_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        private SingleFieldBuilderV3 getSimCarrierFieldBuilder() {
            if (this.simCarrierBuilder_ == null) {
                this.simCarrierBuilder_ = new SingleFieldBuilderV3(getSimCarrier(), getParentForChildren(), isClean());
                this.simCarrier_ = null;
            }
            return this.simCarrierBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public boolean hasDeviceLat() {
            return (this.deviceLatBuilder_ == null && this.deviceLat_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValue getDeviceLat() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.deviceLatBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue = this.deviceLat_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }
            return (StringValue) singleFieldBuilderV3.getMessage();
        }

        public Builder setDeviceLat(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.deviceLatBuilder_;
            if (singleFieldBuilderV3 == null) {
                stringValue.getClass();
                this.deviceLat_ = stringValue;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(stringValue);
            }
            return this;
        }

        public Builder setDeviceLat(StringValue.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.deviceLatBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.deviceLat_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeDeviceLat(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.deviceLatBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue2 = this.deviceLat_;
                if (stringValue2 != null) {
                    this.deviceLat_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.deviceLat_ = stringValue;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(stringValue);
            }
            return this;
        }

        public Builder clearDeviceLat() {
            if (this.deviceLatBuilder_ == null) {
                this.deviceLat_ = null;
                onChanged();
            } else {
                this.deviceLat_ = null;
                this.deviceLatBuilder_ = null;
            }
            return this;
        }

        public StringValue.Builder getDeviceLatBuilder() {
            onChanged();
            return (StringValue.Builder) getDeviceLatFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValueOrBuilder getDeviceLatOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.deviceLatBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StringValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            StringValue stringValue = this.deviceLat_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        private SingleFieldBuilderV3 getDeviceLatFieldBuilder() {
            if (this.deviceLatBuilder_ == null) {
                this.deviceLatBuilder_ = new SingleFieldBuilderV3(getDeviceLat(), getParentForChildren(), isClean());
                this.deviceLat_ = null;
            }
            return this.deviceLatBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public boolean hasDeviceLon() {
            return (this.deviceLonBuilder_ == null && this.deviceLon_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValue getDeviceLon() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.deviceLonBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue = this.deviceLon_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }
            return (StringValue) singleFieldBuilderV3.getMessage();
        }

        public Builder setDeviceLon(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.deviceLonBuilder_;
            if (singleFieldBuilderV3 == null) {
                stringValue.getClass();
                this.deviceLon_ = stringValue;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(stringValue);
            }
            return this;
        }

        public Builder setDeviceLon(StringValue.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.deviceLonBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.deviceLon_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeDeviceLon(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.deviceLonBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue2 = this.deviceLon_;
                if (stringValue2 != null) {
                    this.deviceLon_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.deviceLon_ = stringValue;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(stringValue);
            }
            return this;
        }

        public Builder clearDeviceLon() {
            if (this.deviceLonBuilder_ == null) {
                this.deviceLon_ = null;
                onChanged();
            } else {
                this.deviceLon_ = null;
                this.deviceLonBuilder_ = null;
            }
            return this;
        }

        public StringValue.Builder getDeviceLonBuilder() {
            onChanged();
            return (StringValue.Builder) getDeviceLonFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValueOrBuilder getDeviceLonOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.deviceLonBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StringValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            StringValue stringValue = this.deviceLon_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        private SingleFieldBuilderV3 getDeviceLonFieldBuilder() {
            if (this.deviceLonBuilder_ == null) {
                this.deviceLonBuilder_ = new SingleFieldBuilderV3(getDeviceLon(), getParentForChildren(), isClean());
                this.deviceLon_ = null;
            }
            return this.deviceLonBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public boolean hasAccuracy() {
            return (this.accuracyBuilder_ == null && this.accuracy_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValue getAccuracy() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.accuracyBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue = this.accuracy_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }
            return (StringValue) singleFieldBuilderV3.getMessage();
        }

        public Builder setAccuracy(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.accuracyBuilder_;
            if (singleFieldBuilderV3 == null) {
                stringValue.getClass();
                this.accuracy_ = stringValue;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(stringValue);
            }
            return this;
        }

        public Builder setAccuracy(StringValue.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.accuracyBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.accuracy_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeAccuracy(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.accuracyBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue2 = this.accuracy_;
                if (stringValue2 != null) {
                    this.accuracy_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.accuracy_ = stringValue;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(stringValue);
            }
            return this;
        }

        public Builder clearAccuracy() {
            if (this.accuracyBuilder_ == null) {
                this.accuracy_ = null;
                onChanged();
            } else {
                this.accuracy_ = null;
                this.accuracyBuilder_ = null;
            }
            return this;
        }

        public StringValue.Builder getAccuracyBuilder() {
            onChanged();
            return (StringValue.Builder) getAccuracyFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValueOrBuilder getAccuracyOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.accuracyBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StringValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            StringValue stringValue = this.accuracy_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        private SingleFieldBuilderV3 getAccuracyFieldBuilder() {
            if (this.accuracyBuilder_ == null) {
                this.accuracyBuilder_ = new SingleFieldBuilderV3(getAccuracy(), getParentForChildren(), isClean());
                this.accuracy_ = null;
            }
            return this.accuracyBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public boolean hasLastfix() {
            return (this.lastfixBuilder_ == null && this.lastfix_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValue getLastfix() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.lastfixBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue = this.lastfix_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }
            return (StringValue) singleFieldBuilderV3.getMessage();
        }

        public Builder setLastfix(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.lastfixBuilder_;
            if (singleFieldBuilderV3 == null) {
                stringValue.getClass();
                this.lastfix_ = stringValue;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(stringValue);
            }
            return this;
        }

        public Builder setLastfix(StringValue.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.lastfixBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.lastfix_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeLastfix(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.lastfixBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue2 = this.lastfix_;
                if (stringValue2 != null) {
                    this.lastfix_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.lastfix_ = stringValue;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(stringValue);
            }
            return this;
        }

        public Builder clearLastfix() {
            if (this.lastfixBuilder_ == null) {
                this.lastfix_ = null;
                onChanged();
            } else {
                this.lastfix_ = null;
                this.lastfixBuilder_ = null;
            }
            return this;
        }

        public StringValue.Builder getLastfixBuilder() {
            onChanged();
            return (StringValue.Builder) getLastfixFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValueOrBuilder getLastfixOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.lastfixBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StringValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            StringValue stringValue = this.lastfix_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        private SingleFieldBuilderV3 getLastfixFieldBuilder() {
            if (this.lastfixBuilder_ == null) {
                this.lastfixBuilder_ = new SingleFieldBuilderV3(getLastfix(), getParentForChildren(), isClean());
                this.lastfix_ = null;
            }
            return this.lastfixBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public boolean hasDeviceZip() {
            return (this.deviceZipBuilder_ == null && this.deviceZip_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValue getDeviceZip() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.deviceZipBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue = this.deviceZip_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }
            return (StringValue) singleFieldBuilderV3.getMessage();
        }

        public Builder setDeviceZip(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.deviceZipBuilder_;
            if (singleFieldBuilderV3 == null) {
                stringValue.getClass();
                this.deviceZip_ = stringValue;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(stringValue);
            }
            return this;
        }

        public Builder setDeviceZip(StringValue.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.deviceZipBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.deviceZip_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeDeviceZip(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.deviceZipBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue2 = this.deviceZip_;
                if (stringValue2 != null) {
                    this.deviceZip_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.deviceZip_ = stringValue;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(stringValue);
            }
            return this;
        }

        public Builder clearDeviceZip() {
            if (this.deviceZipBuilder_ == null) {
                this.deviceZip_ = null;
                onChanged();
            } else {
                this.deviceZip_ = null;
                this.deviceZipBuilder_ = null;
            }
            return this;
        }

        public StringValue.Builder getDeviceZipBuilder() {
            onChanged();
            return (StringValue.Builder) getDeviceZipFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValueOrBuilder getDeviceZipOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.deviceZipBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StringValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            StringValue stringValue = this.deviceZip_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        private SingleFieldBuilderV3 getDeviceZipFieldBuilder() {
            if (this.deviceZipBuilder_ == null) {
                this.deviceZipBuilder_ = new SingleFieldBuilderV3(getDeviceZip(), getParentForChildren(), isClean());
                this.deviceZip_ = null;
            }
            return this.deviceZipBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public boolean hasMetro() {
            return (this.metroBuilder_ == null && this.metro_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValue getMetro() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.metroBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue = this.metro_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }
            return (StringValue) singleFieldBuilderV3.getMessage();
        }

        public Builder setMetro(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.metroBuilder_;
            if (singleFieldBuilderV3 == null) {
                stringValue.getClass();
                this.metro_ = stringValue;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(stringValue);
            }
            return this;
        }

        public Builder setMetro(StringValue.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.metroBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.metro_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeMetro(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.metroBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue2 = this.metro_;
                if (stringValue2 != null) {
                    this.metro_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.metro_ = stringValue;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(stringValue);
            }
            return this;
        }

        public Builder clearMetro() {
            if (this.metroBuilder_ == null) {
                this.metro_ = null;
                onChanged();
            } else {
                this.metro_ = null;
                this.metroBuilder_ = null;
            }
            return this;
        }

        public StringValue.Builder getMetroBuilder() {
            onChanged();
            return (StringValue.Builder) getMetroFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValueOrBuilder getMetroOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.metroBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StringValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            StringValue stringValue = this.metro_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        private SingleFieldBuilderV3 getMetroFieldBuilder() {
            if (this.metroBuilder_ == null) {
                this.metroBuilder_ = new SingleFieldBuilderV3(getMetro(), getParentForChildren(), isClean());
                this.metro_ = null;
            }
            return this.metroBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public boolean hasDeviceCity() {
            return (this.deviceCityBuilder_ == null && this.deviceCity_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValue getDeviceCity() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.deviceCityBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue = this.deviceCity_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }
            return (StringValue) singleFieldBuilderV3.getMessage();
        }

        public Builder setDeviceCity(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.deviceCityBuilder_;
            if (singleFieldBuilderV3 == null) {
                stringValue.getClass();
                this.deviceCity_ = stringValue;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(stringValue);
            }
            return this;
        }

        public Builder setDeviceCity(StringValue.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.deviceCityBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.deviceCity_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeDeviceCity(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.deviceCityBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue2 = this.deviceCity_;
                if (stringValue2 != null) {
                    this.deviceCity_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.deviceCity_ = stringValue;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(stringValue);
            }
            return this;
        }

        public Builder clearDeviceCity() {
            if (this.deviceCityBuilder_ == null) {
                this.deviceCity_ = null;
                onChanged();
            } else {
                this.deviceCity_ = null;
                this.deviceCityBuilder_ = null;
            }
            return this;
        }

        public StringValue.Builder getDeviceCityBuilder() {
            onChanged();
            return (StringValue.Builder) getDeviceCityFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValueOrBuilder getDeviceCityOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.deviceCityBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StringValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            StringValue stringValue = this.deviceCity_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        private SingleFieldBuilderV3 getDeviceCityFieldBuilder() {
            if (this.deviceCityBuilder_ == null) {
                this.deviceCityBuilder_ = new SingleFieldBuilderV3(getDeviceCity(), getParentForChildren(), isClean());
                this.deviceCity_ = null;
            }
            return this.deviceCityBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public boolean hasUserLat() {
            return (this.userLatBuilder_ == null && this.userLat_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValue getUserLat() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.userLatBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue = this.userLat_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }
            return (StringValue) singleFieldBuilderV3.getMessage();
        }

        public Builder setUserLat(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.userLatBuilder_;
            if (singleFieldBuilderV3 == null) {
                stringValue.getClass();
                this.userLat_ = stringValue;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(stringValue);
            }
            return this;
        }

        public Builder setUserLat(StringValue.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.userLatBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.userLat_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeUserLat(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.userLatBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue2 = this.userLat_;
                if (stringValue2 != null) {
                    this.userLat_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.userLat_ = stringValue;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(stringValue);
            }
            return this;
        }

        public Builder clearUserLat() {
            if (this.userLatBuilder_ == null) {
                this.userLat_ = null;
                onChanged();
            } else {
                this.userLat_ = null;
                this.userLatBuilder_ = null;
            }
            return this;
        }

        public StringValue.Builder getUserLatBuilder() {
            onChanged();
            return (StringValue.Builder) getUserLatFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValueOrBuilder getUserLatOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.userLatBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StringValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            StringValue stringValue = this.userLat_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        private SingleFieldBuilderV3 getUserLatFieldBuilder() {
            if (this.userLatBuilder_ == null) {
                this.userLatBuilder_ = new SingleFieldBuilderV3(getUserLat(), getParentForChildren(), isClean());
                this.userLat_ = null;
            }
            return this.userLatBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public boolean hasUserLon() {
            return (this.userLonBuilder_ == null && this.userLon_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValue getUserLon() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.userLonBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue = this.userLon_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }
            return (StringValue) singleFieldBuilderV3.getMessage();
        }

        public Builder setUserLon(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.userLonBuilder_;
            if (singleFieldBuilderV3 == null) {
                stringValue.getClass();
                this.userLon_ = stringValue;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(stringValue);
            }
            return this;
        }

        public Builder setUserLon(StringValue.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.userLonBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.userLon_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeUserLon(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.userLonBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue2 = this.userLon_;
                if (stringValue2 != null) {
                    this.userLon_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.userLon_ = stringValue;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(stringValue);
            }
            return this;
        }

        public Builder clearUserLon() {
            if (this.userLonBuilder_ == null) {
                this.userLon_ = null;
                onChanged();
            } else {
                this.userLon_ = null;
                this.userLonBuilder_ = null;
            }
            return this;
        }

        public StringValue.Builder getUserLonBuilder() {
            onChanged();
            return (StringValue.Builder) getUserLonFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValueOrBuilder getUserLonOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.userLonBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StringValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            StringValue stringValue = this.userLon_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        private SingleFieldBuilderV3 getUserLonFieldBuilder() {
            if (this.userLonBuilder_ == null) {
                this.userLonBuilder_ = new SingleFieldBuilderV3(getUserLon(), getParentForChildren(), isClean());
                this.userLon_ = null;
            }
            return this.userLonBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public boolean hasUserZip() {
            return (this.userZipBuilder_ == null && this.userZip_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValue getUserZip() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.userZipBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue = this.userZip_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }
            return (StringValue) singleFieldBuilderV3.getMessage();
        }

        public Builder setUserZip(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.userZipBuilder_;
            if (singleFieldBuilderV3 == null) {
                stringValue.getClass();
                this.userZip_ = stringValue;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(stringValue);
            }
            return this;
        }

        public Builder setUserZip(StringValue.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.userZipBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.userZip_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeUserZip(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.userZipBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue2 = this.userZip_;
                if (stringValue2 != null) {
                    this.userZip_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.userZip_ = stringValue;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(stringValue);
            }
            return this;
        }

        public Builder clearUserZip() {
            if (this.userZipBuilder_ == null) {
                this.userZip_ = null;
                onChanged();
            } else {
                this.userZip_ = null;
                this.userZipBuilder_ = null;
            }
            return this;
        }

        public StringValue.Builder getUserZipBuilder() {
            onChanged();
            return (StringValue.Builder) getUserZipFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValueOrBuilder getUserZipOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.userZipBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StringValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            StringValue stringValue = this.userZip_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        private SingleFieldBuilderV3 getUserZipFieldBuilder() {
            if (this.userZipBuilder_ == null) {
                this.userZipBuilder_ = new SingleFieldBuilderV3(getUserZip(), getParentForChildren(), isClean());
                this.userZip_ = null;
            }
            return this.userZipBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public boolean hasUserCity() {
            return (this.userCityBuilder_ == null && this.userCity_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValue getUserCity() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.userCityBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue = this.userCity_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }
            return (StringValue) singleFieldBuilderV3.getMessage();
        }

        public Builder setUserCity(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.userCityBuilder_;
            if (singleFieldBuilderV3 == null) {
                stringValue.getClass();
                this.userCity_ = stringValue;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(stringValue);
            }
            return this;
        }

        public Builder setUserCity(StringValue.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.userCityBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.userCity_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeUserCity(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.userCityBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue2 = this.userCity_;
                if (stringValue2 != null) {
                    this.userCity_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.userCity_ = stringValue;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(stringValue);
            }
            return this;
        }

        public Builder clearUserCity() {
            if (this.userCityBuilder_ == null) {
                this.userCity_ = null;
                onChanged();
            } else {
                this.userCity_ = null;
                this.userCityBuilder_ = null;
            }
            return this;
        }

        public StringValue.Builder getUserCityBuilder() {
            onChanged();
            return (StringValue.Builder) getUserCityFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValueOrBuilder getUserCityOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.userCityBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StringValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            StringValue stringValue = this.userCity_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        private SingleFieldBuilderV3 getUserCityFieldBuilder() {
            if (this.userCityBuilder_ == null) {
                this.userCityBuilder_ = new SingleFieldBuilderV3(getUserCity(), getParentForChildren(), isClean());
                this.userCity_ = null;
            }
            return this.userCityBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public boolean hasModel() {
            return (this.modelBuilder_ == null && this.model_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValue getModel() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.modelBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue = this.model_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }
            return (StringValue) singleFieldBuilderV3.getMessage();
        }

        public Builder setModel(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.modelBuilder_;
            if (singleFieldBuilderV3 == null) {
                stringValue.getClass();
                this.model_ = stringValue;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(stringValue);
            }
            return this;
        }

        public Builder setModel(StringValue.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.modelBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.model_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeModel(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.modelBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue2 = this.model_;
                if (stringValue2 != null) {
                    this.model_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.model_ = stringValue;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(stringValue);
            }
            return this;
        }

        public Builder clearModel() {
            if (this.modelBuilder_ == null) {
                this.model_ = null;
                onChanged();
            } else {
                this.model_ = null;
                this.modelBuilder_ = null;
            }
            return this;
        }

        public StringValue.Builder getModelBuilder() {
            onChanged();
            return (StringValue.Builder) getModelFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValueOrBuilder getModelOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.modelBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StringValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            StringValue stringValue = this.model_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        private SingleFieldBuilderV3 getModelFieldBuilder() {
            if (this.modelBuilder_ == null) {
                this.modelBuilder_ = new SingleFieldBuilderV3(getModel(), getParentForChildren(), isClean());
                this.model_ = null;
            }
            return this.modelBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public boolean hasHwv() {
            return (this.hwvBuilder_ == null && this.hwv_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValue getHwv() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.hwvBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue = this.hwv_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }
            return (StringValue) singleFieldBuilderV3.getMessage();
        }

        public Builder setHwv(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.hwvBuilder_;
            if (singleFieldBuilderV3 == null) {
                stringValue.getClass();
                this.hwv_ = stringValue;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(stringValue);
            }
            return this;
        }

        public Builder setHwv(StringValue.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.hwvBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.hwv_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeHwv(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.hwvBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue2 = this.hwv_;
                if (stringValue2 != null) {
                    this.hwv_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.hwv_ = stringValue;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(stringValue);
            }
            return this;
        }

        public Builder clearHwv() {
            if (this.hwvBuilder_ == null) {
                this.hwv_ = null;
                onChanged();
            } else {
                this.hwv_ = null;
                this.hwvBuilder_ = null;
            }
            return this;
        }

        public StringValue.Builder getHwvBuilder() {
            onChanged();
            return (StringValue.Builder) getHwvFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValueOrBuilder getHwvOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.hwvBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StringValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            StringValue stringValue = this.hwv_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        private SingleFieldBuilderV3 getHwvFieldBuilder() {
            if (this.hwvBuilder_ == null) {
                this.hwvBuilder_ = new SingleFieldBuilderV3(getHwv(), getParentForChildren(), isClean());
                this.hwv_ = null;
            }
            return this.hwvBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public boolean hasPpi() {
            return (this.ppiBuilder_ == null && this.ppi_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValue getPpi() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.ppiBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue = this.ppi_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }
            return (StringValue) singleFieldBuilderV3.getMessage();
        }

        public Builder setPpi(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.ppiBuilder_;
            if (singleFieldBuilderV3 == null) {
                stringValue.getClass();
                this.ppi_ = stringValue;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(stringValue);
            }
            return this;
        }

        public Builder setPpi(StringValue.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.ppiBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.ppi_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergePpi(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.ppiBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue2 = this.ppi_;
                if (stringValue2 != null) {
                    this.ppi_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.ppi_ = stringValue;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(stringValue);
            }
            return this;
        }

        public Builder clearPpi() {
            if (this.ppiBuilder_ == null) {
                this.ppi_ = null;
                onChanged();
            } else {
                this.ppi_ = null;
                this.ppiBuilder_ = null;
            }
            return this;
        }

        public StringValue.Builder getPpiBuilder() {
            onChanged();
            return (StringValue.Builder) getPpiFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValueOrBuilder getPpiOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.ppiBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StringValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            StringValue stringValue = this.ppi_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        private SingleFieldBuilderV3 getPpiFieldBuilder() {
            if (this.ppiBuilder_ == null) {
                this.ppiBuilder_ = new SingleFieldBuilderV3(getPpi(), getParentForChildren(), isClean());
                this.ppi_ = null;
            }
            return this.ppiBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public boolean hasPxratio() {
            return (this.pxratioBuilder_ == null && this.pxratio_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValue getPxratio() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.pxratioBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue = this.pxratio_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }
            return (StringValue) singleFieldBuilderV3.getMessage();
        }

        public Builder setPxratio(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.pxratioBuilder_;
            if (singleFieldBuilderV3 == null) {
                stringValue.getClass();
                this.pxratio_ = stringValue;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(stringValue);
            }
            return this;
        }

        public Builder setPxratio(StringValue.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.pxratioBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.pxratio_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergePxratio(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.pxratioBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue2 = this.pxratio_;
                if (stringValue2 != null) {
                    this.pxratio_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.pxratio_ = stringValue;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(stringValue);
            }
            return this;
        }

        public Builder clearPxratio() {
            if (this.pxratioBuilder_ == null) {
                this.pxratio_ = null;
                onChanged();
            } else {
                this.pxratio_ = null;
                this.pxratioBuilder_ = null;
            }
            return this;
        }

        public StringValue.Builder getPxratioBuilder() {
            onChanged();
            return (StringValue.Builder) getPxratioFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValueOrBuilder getPxratioOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.pxratioBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StringValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            StringValue stringValue = this.pxratio_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        private SingleFieldBuilderV3 getPxratioFieldBuilder() {
            if (this.pxratioBuilder_ == null) {
                this.pxratioBuilder_ = new SingleFieldBuilderV3(getPxratio(), getParentForChildren(), isClean());
                this.pxratio_ = null;
            }
            return this.pxratioBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public boolean hasUa() {
            return (this.uaBuilder_ == null && this.ua_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValue getUa() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.uaBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue = this.ua_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }
            return (StringValue) singleFieldBuilderV3.getMessage();
        }

        public Builder setUa(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.uaBuilder_;
            if (singleFieldBuilderV3 == null) {
                stringValue.getClass();
                this.ua_ = stringValue;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(stringValue);
            }
            return this;
        }

        public Builder setUa(StringValue.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.uaBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.ua_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeUa(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.uaBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue2 = this.ua_;
                if (stringValue2 != null) {
                    this.ua_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.ua_ = stringValue;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(stringValue);
            }
            return this;
        }

        public Builder clearUa() {
            if (this.uaBuilder_ == null) {
                this.ua_ = null;
                onChanged();
            } else {
                this.ua_ = null;
                this.uaBuilder_ = null;
            }
            return this;
        }

        public StringValue.Builder getUaBuilder() {
            onChanged();
            return (StringValue.Builder) getUaFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValueOrBuilder getUaOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.uaBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StringValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            StringValue stringValue = this.ua_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        private SingleFieldBuilderV3 getUaFieldBuilder() {
            if (this.uaBuilder_ == null) {
                this.uaBuilder_ = new SingleFieldBuilderV3(getUa(), getParentForChildren(), isClean());
                this.ua_ = null;
            }
            return this.uaBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public boolean hasDiskspace() {
            return (this.diskspaceBuilder_ == null && this.diskspace_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValue getDiskspace() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.diskspaceBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue = this.diskspace_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }
            return (StringValue) singleFieldBuilderV3.getMessage();
        }

        public Builder setDiskspace(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.diskspaceBuilder_;
            if (singleFieldBuilderV3 == null) {
                stringValue.getClass();
                this.diskspace_ = stringValue;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(stringValue);
            }
            return this;
        }

        public Builder setDiskspace(StringValue.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.diskspaceBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.diskspace_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeDiskspace(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.diskspaceBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue2 = this.diskspace_;
                if (stringValue2 != null) {
                    this.diskspace_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.diskspace_ = stringValue;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(stringValue);
            }
            return this;
        }

        public Builder clearDiskspace() {
            if (this.diskspaceBuilder_ == null) {
                this.diskspace_ = null;
                onChanged();
            } else {
                this.diskspace_ = null;
                this.diskspaceBuilder_ = null;
            }
            return this;
        }

        public StringValue.Builder getDiskspaceBuilder() {
            onChanged();
            return (StringValue.Builder) getDiskspaceFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValueOrBuilder getDiskspaceOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.diskspaceBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StringValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            StringValue stringValue = this.diskspace_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        private SingleFieldBuilderV3 getDiskspaceFieldBuilder() {
            if (this.diskspaceBuilder_ == null) {
                this.diskspaceBuilder_ = new SingleFieldBuilderV3(getDiskspace(), getParentForChildren(), isClean());
                this.diskspace_ = null;
            }
            return this.diskspaceBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public boolean hasTotaldisk() {
            return (this.totaldiskBuilder_ == null && this.totaldisk_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValue getTotaldisk() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.totaldiskBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue = this.totaldisk_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }
            return (StringValue) singleFieldBuilderV3.getMessage();
        }

        public Builder setTotaldisk(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.totaldiskBuilder_;
            if (singleFieldBuilderV3 == null) {
                stringValue.getClass();
                this.totaldisk_ = stringValue;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(stringValue);
            }
            return this;
        }

        public Builder setTotaldisk(StringValue.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.totaldiskBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.totaldisk_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeTotaldisk(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.totaldiskBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue2 = this.totaldisk_;
                if (stringValue2 != null) {
                    this.totaldisk_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.totaldisk_ = stringValue;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(stringValue);
            }
            return this;
        }

        public Builder clearTotaldisk() {
            if (this.totaldiskBuilder_ == null) {
                this.totaldisk_ = null;
                onChanged();
            } else {
                this.totaldisk_ = null;
                this.totaldiskBuilder_ = null;
            }
            return this;
        }

        public StringValue.Builder getTotaldiskBuilder() {
            onChanged();
            return (StringValue.Builder) getTotaldiskFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValueOrBuilder getTotaldiskOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.totaldiskBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StringValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            StringValue stringValue = this.totaldisk_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        private SingleFieldBuilderV3 getTotaldiskFieldBuilder() {
            if (this.totaldiskBuilder_ == null) {
                this.totaldiskBuilder_ = new SingleFieldBuilderV3(getTotaldisk(), getParentForChildren(), isClean());
                this.totaldisk_ = null;
            }
            return this.totaldiskBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public boolean hasTotalmem() {
            return (this.totalmemBuilder_ == null && this.totalmem_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValue getTotalmem() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.totalmemBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue = this.totalmem_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }
            return (StringValue) singleFieldBuilderV3.getMessage();
        }

        public Builder setTotalmem(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.totalmemBuilder_;
            if (singleFieldBuilderV3 == null) {
                stringValue.getClass();
                this.totalmem_ = stringValue;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(stringValue);
            }
            return this;
        }

        public Builder setTotalmem(StringValue.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.totalmemBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.totalmem_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeTotalmem(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.totalmemBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue2 = this.totalmem_;
                if (stringValue2 != null) {
                    this.totalmem_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.totalmem_ = stringValue;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(stringValue);
            }
            return this;
        }

        public Builder clearTotalmem() {
            if (this.totalmemBuilder_ == null) {
                this.totalmem_ = null;
                onChanged();
            } else {
                this.totalmem_ = null;
                this.totalmemBuilder_ = null;
            }
            return this;
        }

        public StringValue.Builder getTotalmemBuilder() {
            onChanged();
            return (StringValue.Builder) getTotalmemFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValueOrBuilder getTotalmemOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.totalmemBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StringValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            StringValue stringValue = this.totalmem_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        private SingleFieldBuilderV3 getTotalmemFieldBuilder() {
            if (this.totalmemBuilder_ == null) {
                this.totalmemBuilder_ = new SingleFieldBuilderV3(getTotalmem(), getParentForChildren(), isClean());
                this.totalmem_ = null;
            }
            return this.totalmemBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public boolean hasFreemem() {
            return (this.freememBuilder_ == null && this.freemem_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValue getFreemem() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.freememBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue = this.freemem_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }
            return (StringValue) singleFieldBuilderV3.getMessage();
        }

        public Builder setFreemem(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.freememBuilder_;
            if (singleFieldBuilderV3 == null) {
                stringValue.getClass();
                this.freemem_ = stringValue;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(stringValue);
            }
            return this;
        }

        public Builder setFreemem(StringValue.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.freememBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.freemem_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeFreemem(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.freememBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue2 = this.freemem_;
                if (stringValue2 != null) {
                    this.freemem_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.freemem_ = stringValue;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(stringValue);
            }
            return this;
        }

        public Builder clearFreemem() {
            if (this.freememBuilder_ == null) {
                this.freemem_ = null;
                onChanged();
            } else {
                this.freemem_ = null;
                this.freememBuilder_ = null;
            }
            return this;
        }

        public StringValue.Builder getFreememBuilder() {
            onChanged();
            return (StringValue.Builder) getFreememFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValueOrBuilder getFreememOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.freememBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StringValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            StringValue stringValue = this.freemem_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        private SingleFieldBuilderV3 getFreememFieldBuilder() {
            if (this.freememBuilder_ == null) {
                this.freememBuilder_ = new SingleFieldBuilderV3(getFreemem(), getParentForChildren(), isClean());
                this.freemem_ = null;
            }
            return this.freememBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public boolean hasBatterylevel() {
            return (this.batterylevelBuilder_ == null && this.batterylevel_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValue getBatterylevel() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.batterylevelBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue = this.batterylevel_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }
            return (StringValue) singleFieldBuilderV3.getMessage();
        }

        public Builder setBatterylevel(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.batterylevelBuilder_;
            if (singleFieldBuilderV3 == null) {
                stringValue.getClass();
                this.batterylevel_ = stringValue;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(stringValue);
            }
            return this;
        }

        public Builder setBatterylevel(StringValue.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.batterylevelBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.batterylevel_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeBatterylevel(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.batterylevelBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue2 = this.batterylevel_;
                if (stringValue2 != null) {
                    this.batterylevel_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.batterylevel_ = stringValue;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(stringValue);
            }
            return this;
        }

        public Builder clearBatterylevel() {
            if (this.batterylevelBuilder_ == null) {
                this.batterylevel_ = null;
                onChanged();
            } else {
                this.batterylevel_ = null;
                this.batterylevelBuilder_ = null;
            }
            return this;
        }

        public StringValue.Builder getBatterylevelBuilder() {
            onChanged();
            return (StringValue.Builder) getBatterylevelFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValueOrBuilder getBatterylevelOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.batterylevelBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StringValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            StringValue stringValue = this.batterylevel_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        private SingleFieldBuilderV3 getBatterylevelFieldBuilder() {
            if (this.batterylevelBuilder_ == null) {
                this.batterylevelBuilder_ = new SingleFieldBuilderV3(getBatterylevel(), getParentForChildren(), isClean());
                this.batterylevel_ = null;
            }
            return this.batterylevelBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public boolean hasScreenbright() {
            return (this.screenbrightBuilder_ == null && this.screenbright_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValue getScreenbright() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.screenbrightBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue = this.screenbright_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }
            return (StringValue) singleFieldBuilderV3.getMessage();
        }

        public Builder setScreenbright(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.screenbrightBuilder_;
            if (singleFieldBuilderV3 == null) {
                stringValue.getClass();
                this.screenbright_ = stringValue;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(stringValue);
            }
            return this;
        }

        public Builder setScreenbright(StringValue.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.screenbrightBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.screenbright_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeScreenbright(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.screenbrightBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue2 = this.screenbright_;
                if (stringValue2 != null) {
                    this.screenbright_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.screenbright_ = stringValue;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(stringValue);
            }
            return this;
        }

        public Builder clearScreenbright() {
            if (this.screenbrightBuilder_ == null) {
                this.screenbright_ = null;
                onChanged();
            } else {
                this.screenbright_ = null;
                this.screenbrightBuilder_ = null;
            }
            return this;
        }

        public StringValue.Builder getScreenbrightBuilder() {
            onChanged();
            return (StringValue.Builder) getScreenbrightFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValueOrBuilder getScreenbrightOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.screenbrightBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StringValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            StringValue stringValue = this.screenbright_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        private SingleFieldBuilderV3 getScreenbrightFieldBuilder() {
            if (this.screenbrightBuilder_ == null) {
                this.screenbrightBuilder_ = new SingleFieldBuilderV3(getScreenbright(), getParentForChildren(), isClean());
                this.screenbright_ = null;
            }
            return this.screenbrightBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public boolean hasHeadsetname() {
            return (this.headsetnameBuilder_ == null && this.headsetname_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValue getHeadsetname() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.headsetnameBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue = this.headsetname_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }
            return (StringValue) singleFieldBuilderV3.getMessage();
        }

        public Builder setHeadsetname(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.headsetnameBuilder_;
            if (singleFieldBuilderV3 == null) {
                stringValue.getClass();
                this.headsetname_ = stringValue;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(stringValue);
            }
            return this;
        }

        public Builder setHeadsetname(StringValue.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.headsetnameBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.headsetname_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeHeadsetname(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.headsetnameBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue2 = this.headsetname_;
                if (stringValue2 != null) {
                    this.headsetname_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.headsetname_ = stringValue;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(stringValue);
            }
            return this;
        }

        public Builder clearHeadsetname() {
            if (this.headsetnameBuilder_ == null) {
                this.headsetname_ = null;
                onChanged();
            } else {
                this.headsetname_ = null;
                this.headsetnameBuilder_ = null;
            }
            return this;
        }

        public StringValue.Builder getHeadsetnameBuilder() {
            onChanged();
            return (StringValue.Builder) getHeadsetnameFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValueOrBuilder getHeadsetnameOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.headsetnameBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StringValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            StringValue stringValue = this.headsetname_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        private SingleFieldBuilderV3 getHeadsetnameFieldBuilder() {
            if (this.headsetnameBuilder_ == null) {
                this.headsetnameBuilder_ = new SingleFieldBuilderV3(getHeadsetname(), getParentForChildren(), isClean());
                this.headsetname_ = null;
            }
            return this.headsetnameBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public boolean hasVolumeLevel() {
            return (this.volumeLevelBuilder_ == null && this.volumeLevel_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValue getVolumeLevel() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.volumeLevelBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue = this.volumeLevel_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }
            return (StringValue) singleFieldBuilderV3.getMessage();
        }

        public Builder setVolumeLevel(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.volumeLevelBuilder_;
            if (singleFieldBuilderV3 == null) {
                stringValue.getClass();
                this.volumeLevel_ = stringValue;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(stringValue);
            }
            return this;
        }

        public Builder setVolumeLevel(StringValue.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.volumeLevelBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.volumeLevel_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeVolumeLevel(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.volumeLevelBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue2 = this.volumeLevel_;
                if (stringValue2 != null) {
                    this.volumeLevel_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.volumeLevel_ = stringValue;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(stringValue);
            }
            return this;
        }

        public Builder clearVolumeLevel() {
            if (this.volumeLevelBuilder_ == null) {
                this.volumeLevel_ = null;
                onChanged();
            } else {
                this.volumeLevel_ = null;
                this.volumeLevelBuilder_ = null;
            }
            return this;
        }

        public StringValue.Builder getVolumeLevelBuilder() {
            onChanged();
            return (StringValue.Builder) getVolumeLevelFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValueOrBuilder getVolumeLevelOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.volumeLevelBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StringValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            StringValue stringValue = this.volumeLevel_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        private SingleFieldBuilderV3 getVolumeLevelFieldBuilder() {
            if (this.volumeLevelBuilder_ == null) {
                this.volumeLevelBuilder_ = new SingleFieldBuilderV3(getVolumeLevel(), getParentForChildren(), isClean());
                this.volumeLevel_ = null;
            }
            return this.volumeLevelBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public boolean hasDevicename() {
            return (this.devicenameBuilder_ == null && this.devicename_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValue getDevicename() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.devicenameBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue = this.devicename_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }
            return (StringValue) singleFieldBuilderV3.getMessage();
        }

        public Builder setDevicename(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.devicenameBuilder_;
            if (singleFieldBuilderV3 == null) {
                stringValue.getClass();
                this.devicename_ = stringValue;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(stringValue);
            }
            return this;
        }

        public Builder setDevicename(StringValue.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.devicenameBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.devicename_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeDevicename(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.devicenameBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue2 = this.devicename_;
                if (stringValue2 != null) {
                    this.devicename_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.devicename_ = stringValue;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(stringValue);
            }
            return this;
        }

        public Builder clearDevicename() {
            if (this.devicenameBuilder_ == null) {
                this.devicename_ = null;
                onChanged();
            } else {
                this.devicename_ = null;
                this.devicenameBuilder_ = null;
            }
            return this;
        }

        public StringValue.Builder getDevicenameBuilder() {
            onChanged();
            return (StringValue.Builder) getDevicenameFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValueOrBuilder getDevicenameOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.devicenameBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StringValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            StringValue stringValue = this.devicename_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        private SingleFieldBuilderV3 getDevicenameFieldBuilder() {
            if (this.devicenameBuilder_ == null) {
                this.devicenameBuilder_ = new SingleFieldBuilderV3(getDevicename(), getParentForChildren(), isClean());
                this.devicename_ = null;
            }
            return this.devicenameBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public boolean hasLastbootup() {
            return (this.lastbootupBuilder_ == null && this.lastbootup_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValue getLastbootup() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.lastbootupBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue = this.lastbootup_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }
            return (StringValue) singleFieldBuilderV3.getMessage();
        }

        public Builder setLastbootup(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.lastbootupBuilder_;
            if (singleFieldBuilderV3 == null) {
                stringValue.getClass();
                this.lastbootup_ = stringValue;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(stringValue);
            }
            return this;
        }

        public Builder setLastbootup(StringValue.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.lastbootupBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.lastbootup_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeLastbootup(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.lastbootupBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue2 = this.lastbootup_;
                if (stringValue2 != null) {
                    this.lastbootup_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.lastbootup_ = stringValue;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(stringValue);
            }
            return this;
        }

        public Builder clearLastbootup() {
            if (this.lastbootupBuilder_ == null) {
                this.lastbootup_ = null;
                onChanged();
            } else {
                this.lastbootup_ = null;
                this.lastbootupBuilder_ = null;
            }
            return this;
        }

        public StringValue.Builder getLastbootupBuilder() {
            onChanged();
            return (StringValue.Builder) getLastbootupFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValueOrBuilder getLastbootupOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.lastbootupBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StringValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            StringValue stringValue = this.lastbootup_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        private SingleFieldBuilderV3 getLastbootupFieldBuilder() {
            if (this.lastbootupBuilder_ == null) {
                this.lastbootupBuilder_ = new SingleFieldBuilderV3(getLastbootup(), getParentForChildren(), isClean());
                this.lastbootup_ = null;
            }
            return this.lastbootupBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public boolean hasLastbootupV2() {
            return (this.lastbootupV2Builder_ == null && this.lastbootupV2_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValue getLastbootupV2() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.lastbootupV2Builder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue = this.lastbootupV2_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }
            return (StringValue) singleFieldBuilderV3.getMessage();
        }

        public Builder setLastbootupV2(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.lastbootupV2Builder_;
            if (singleFieldBuilderV3 == null) {
                stringValue.getClass();
                this.lastbootupV2_ = stringValue;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(stringValue);
            }
            return this;
        }

        public Builder setLastbootupV2(StringValue.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.lastbootupV2Builder_;
            if (singleFieldBuilderV3 == null) {
                this.lastbootupV2_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeLastbootupV2(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.lastbootupV2Builder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue2 = this.lastbootupV2_;
                if (stringValue2 != null) {
                    this.lastbootupV2_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.lastbootupV2_ = stringValue;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(stringValue);
            }
            return this;
        }

        public Builder clearLastbootupV2() {
            if (this.lastbootupV2Builder_ == null) {
                this.lastbootupV2_ = null;
                onChanged();
            } else {
                this.lastbootupV2_ = null;
                this.lastbootupV2Builder_ = null;
            }
            return this;
        }

        public StringValue.Builder getLastbootupV2Builder() {
            onChanged();
            return (StringValue.Builder) getLastbootupV2FieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValueOrBuilder getLastbootupV2OrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.lastbootupV2Builder_;
            if (singleFieldBuilderV3 != null) {
                return (StringValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            StringValue stringValue = this.lastbootupV2_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        private SingleFieldBuilderV3 getLastbootupV2FieldBuilder() {
            if (this.lastbootupV2Builder_ == null) {
                this.lastbootupV2Builder_ = new SingleFieldBuilderV3(getLastbootupV2(), getParentForChildren(), isClean());
                this.lastbootupV2_ = null;
            }
            return this.lastbootupV2Builder_;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public boolean hasTime() {
            return (this.timeBuilder_ == null && this.time_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValue getTime() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.timeBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue = this.time_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }
            return (StringValue) singleFieldBuilderV3.getMessage();
        }

        public Builder setTime(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.timeBuilder_;
            if (singleFieldBuilderV3 == null) {
                stringValue.getClass();
                this.time_ = stringValue;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(stringValue);
            }
            return this;
        }

        public Builder setTime(StringValue.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.timeBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.time_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeTime(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.timeBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue2 = this.time_;
                if (stringValue2 != null) {
                    this.time_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.time_ = stringValue;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(stringValue);
            }
            return this;
        }

        public Builder clearTime() {
            if (this.timeBuilder_ == null) {
                this.time_ = null;
                onChanged();
            } else {
                this.time_ = null;
                this.timeBuilder_ = null;
            }
            return this;
        }

        public StringValue.Builder getTimeBuilder() {
            onChanged();
            return (StringValue.Builder) getTimeFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValueOrBuilder getTimeOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.timeBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StringValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            StringValue stringValue = this.time_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        private SingleFieldBuilderV3 getTimeFieldBuilder() {
            if (this.timeBuilder_ == null) {
                this.timeBuilder_ = new SingleFieldBuilderV3(getTime(), getParentForChildren(), isClean());
                this.time_ = null;
            }
            return this.timeBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public boolean hasInputlanguage() {
            return (this.inputlanguageBuilder_ == null && this.inputlanguage_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValue getInputlanguage() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.inputlanguageBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue = this.inputlanguage_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }
            return (StringValue) singleFieldBuilderV3.getMessage();
        }

        public Builder setInputlanguage(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.inputlanguageBuilder_;
            if (singleFieldBuilderV3 == null) {
                stringValue.getClass();
                this.inputlanguage_ = stringValue;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(stringValue);
            }
            return this;
        }

        public Builder setInputlanguage(StringValue.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.inputlanguageBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.inputlanguage_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeInputlanguage(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.inputlanguageBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue2 = this.inputlanguage_;
                if (stringValue2 != null) {
                    this.inputlanguage_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.inputlanguage_ = stringValue;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(stringValue);
            }
            return this;
        }

        public Builder clearInputlanguage() {
            if (this.inputlanguageBuilder_ == null) {
                this.inputlanguage_ = null;
                onChanged();
            } else {
                this.inputlanguage_ = null;
                this.inputlanguageBuilder_ = null;
            }
            return this;
        }

        public StringValue.Builder getInputlanguageBuilder() {
            onChanged();
            return (StringValue.Builder) getInputlanguageFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValueOrBuilder getInputlanguageOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.inputlanguageBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StringValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            StringValue stringValue = this.inputlanguage_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        private SingleFieldBuilderV3 getInputlanguageFieldBuilder() {
            if (this.inputlanguageBuilder_ == null) {
                this.inputlanguageBuilder_ = new SingleFieldBuilderV3(getInputlanguage(), getParentForChildren(), isClean());
                this.inputlanguage_ = null;
            }
            return this.inputlanguageBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public boolean hasAccess() {
            return (this.accessBuilder_ == null && this.access_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValue getAccess() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.accessBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue = this.access_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }
            return (StringValue) singleFieldBuilderV3.getMessage();
        }

        public Builder setAccess(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.accessBuilder_;
            if (singleFieldBuilderV3 == null) {
                stringValue.getClass();
                this.access_ = stringValue;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(stringValue);
            }
            return this;
        }

        public Builder setAccess(StringValue.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.accessBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.access_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeAccess(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.accessBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue2 = this.access_;
                if (stringValue2 != null) {
                    this.access_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.access_ = stringValue;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(stringValue);
            }
            return this;
        }

        public Builder clearAccess() {
            if (this.accessBuilder_ == null) {
                this.access_ = null;
                onChanged();
            } else {
                this.access_ = null;
                this.accessBuilder_ = null;
            }
            return this;
        }

        public StringValue.Builder getAccessBuilder() {
            onChanged();
            return (StringValue.Builder) getAccessFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValueOrBuilder getAccessOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.accessBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StringValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            StringValue stringValue = this.access_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        private SingleFieldBuilderV3 getAccessFieldBuilder() {
            if (this.accessBuilder_ == null) {
                this.accessBuilder_ = new SingleFieldBuilderV3(getAccess(), getParentForChildren(), isClean());
                this.access_ = null;
            }
            return this.accessBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public boolean hasCpuname() {
            return (this.cpunameBuilder_ == null && this.cpuname_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValue getCpuname() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.cpunameBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue = this.cpuname_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }
            return (StringValue) singleFieldBuilderV3.getMessage();
        }

        public Builder setCpuname(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.cpunameBuilder_;
            if (singleFieldBuilderV3 == null) {
                stringValue.getClass();
                this.cpuname_ = stringValue;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(stringValue);
            }
            return this;
        }

        public Builder setCpuname(StringValue.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.cpunameBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.cpuname_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeCpuname(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.cpunameBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue2 = this.cpuname_;
                if (stringValue2 != null) {
                    this.cpuname_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.cpuname_ = stringValue;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(stringValue);
            }
            return this;
        }

        public Builder clearCpuname() {
            if (this.cpunameBuilder_ == null) {
                this.cpuname_ = null;
                onChanged();
            } else {
                this.cpuname_ = null;
                this.cpunameBuilder_ = null;
            }
            return this;
        }

        public StringValue.Builder getCpunameBuilder() {
            onChanged();
            return (StringValue.Builder) getCpunameFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValueOrBuilder getCpunameOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.cpunameBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StringValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            StringValue stringValue = this.cpuname_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        private SingleFieldBuilderV3 getCpunameFieldBuilder() {
            if (this.cpunameBuilder_ == null) {
                this.cpunameBuilder_ = new SingleFieldBuilderV3(getCpuname(), getParentForChildren(), isClean());
                this.cpuname_ = null;
            }
            return this.cpunameBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public boolean hasCpuvendor() {
            return (this.cpuvendorBuilder_ == null && this.cpuvendor_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValue getCpuvendor() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.cpuvendorBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue = this.cpuvendor_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }
            return (StringValue) singleFieldBuilderV3.getMessage();
        }

        public Builder setCpuvendor(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.cpuvendorBuilder_;
            if (singleFieldBuilderV3 == null) {
                stringValue.getClass();
                this.cpuvendor_ = stringValue;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(stringValue);
            }
            return this;
        }

        public Builder setCpuvendor(StringValue.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.cpuvendorBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.cpuvendor_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeCpuvendor(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.cpuvendorBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue2 = this.cpuvendor_;
                if (stringValue2 != null) {
                    this.cpuvendor_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.cpuvendor_ = stringValue;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(stringValue);
            }
            return this;
        }

        public Builder clearCpuvendor() {
            if (this.cpuvendorBuilder_ == null) {
                this.cpuvendor_ = null;
                onChanged();
            } else {
                this.cpuvendor_ = null;
                this.cpuvendorBuilder_ = null;
            }
            return this;
        }

        public StringValue.Builder getCpuvendorBuilder() {
            onChanged();
            return (StringValue.Builder) getCpuvendorFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValueOrBuilder getCpuvendorOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.cpuvendorBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StringValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            StringValue stringValue = this.cpuvendor_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        private SingleFieldBuilderV3 getCpuvendorFieldBuilder() {
            if (this.cpuvendorBuilder_ == null) {
                this.cpuvendorBuilder_ = new SingleFieldBuilderV3(getCpuvendor(), getParentForChildren(), isClean());
                this.cpuvendor_ = null;
            }
            return this.cpuvendorBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public boolean hasGpuname() {
            return (this.gpunameBuilder_ == null && this.gpuname_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValue getGpuname() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.gpunameBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue = this.gpuname_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }
            return (StringValue) singleFieldBuilderV3.getMessage();
        }

        public Builder setGpuname(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.gpunameBuilder_;
            if (singleFieldBuilderV3 == null) {
                stringValue.getClass();
                this.gpuname_ = stringValue;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(stringValue);
            }
            return this;
        }

        public Builder setGpuname(StringValue.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.gpunameBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.gpuname_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeGpuname(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.gpunameBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue2 = this.gpuname_;
                if (stringValue2 != null) {
                    this.gpuname_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.gpuname_ = stringValue;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(stringValue);
            }
            return this;
        }

        public Builder clearGpuname() {
            if (this.gpunameBuilder_ == null) {
                this.gpuname_ = null;
                onChanged();
            } else {
                this.gpuname_ = null;
                this.gpunameBuilder_ = null;
            }
            return this;
        }

        public StringValue.Builder getGpunameBuilder() {
            onChanged();
            return (StringValue.Builder) getGpunameFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValueOrBuilder getGpunameOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.gpunameBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StringValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            StringValue stringValue = this.gpuname_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        private SingleFieldBuilderV3 getGpunameFieldBuilder() {
            if (this.gpunameBuilder_ == null) {
                this.gpunameBuilder_ = new SingleFieldBuilderV3(getGpuname(), getParentForChildren(), isClean());
                this.gpuname_ = null;
            }
            return this.gpunameBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public boolean hasGpuvendor() {
            return (this.gpuvendorBuilder_ == null && this.gpuvendor_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValue getGpuvendor() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.gpuvendorBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue = this.gpuvendor_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }
            return (StringValue) singleFieldBuilderV3.getMessage();
        }

        public Builder setGpuvendor(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.gpuvendorBuilder_;
            if (singleFieldBuilderV3 == null) {
                stringValue.getClass();
                this.gpuvendor_ = stringValue;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(stringValue);
            }
            return this;
        }

        public Builder setGpuvendor(StringValue.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.gpuvendorBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.gpuvendor_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeGpuvendor(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.gpuvendorBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue2 = this.gpuvendor_;
                if (stringValue2 != null) {
                    this.gpuvendor_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.gpuvendor_ = stringValue;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(stringValue);
            }
            return this;
        }

        public Builder clearGpuvendor() {
            if (this.gpuvendorBuilder_ == null) {
                this.gpuvendor_ = null;
                onChanged();
            } else {
                this.gpuvendor_ = null;
                this.gpuvendorBuilder_ = null;
            }
            return this;
        }

        public StringValue.Builder getGpuvendorBuilder() {
            onChanged();
            return (StringValue.Builder) getGpuvendorFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValueOrBuilder getGpuvendorOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.gpuvendorBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StringValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            StringValue stringValue = this.gpuvendor_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        private SingleFieldBuilderV3 getGpuvendorFieldBuilder() {
            if (this.gpuvendorBuilder_ == null) {
                this.gpuvendorBuilder_ = new SingleFieldBuilderV3(getGpuvendor(), getParentForChildren(), isClean());
                this.gpuvendor_ = null;
            }
            return this.gpuvendorBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public boolean hasAtts() {
            return (this.attsBuilder_ == null && this.atts_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValue getAtts() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.attsBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue = this.atts_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }
            return (StringValue) singleFieldBuilderV3.getMessage();
        }

        public Builder setAtts(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.attsBuilder_;
            if (singleFieldBuilderV3 == null) {
                stringValue.getClass();
                this.atts_ = stringValue;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(stringValue);
            }
            return this;
        }

        public Builder setAtts(StringValue.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.attsBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.atts_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeAtts(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.attsBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue2 = this.atts_;
                if (stringValue2 != null) {
                    this.atts_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.atts_ = stringValue;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(stringValue);
            }
            return this;
        }

        public Builder clearAtts() {
            if (this.attsBuilder_ == null) {
                this.atts_ = null;
                onChanged();
            } else {
                this.atts_ = null;
                this.attsBuilder_ = null;
            }
            return this;
        }

        public StringValue.Builder getAttsBuilder() {
            onChanged();
            return (StringValue.Builder) getAttsFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValueOrBuilder getAttsOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.attsBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StringValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            StringValue stringValue = this.atts_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        private SingleFieldBuilderV3 getAttsFieldBuilder() {
            if (this.attsBuilder_ == null) {
                this.attsBuilder_ = new SingleFieldBuilderV3(getAtts(), getParentForChildren(), isClean());
                this.atts_ = null;
            }
            return this.attsBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public boolean hasYob() {
            return (this.yobBuilder_ == null && this.yob_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValue getYob() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.yobBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue = this.yob_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }
            return (StringValue) singleFieldBuilderV3.getMessage();
        }

        public Builder setYob(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.yobBuilder_;
            if (singleFieldBuilderV3 == null) {
                stringValue.getClass();
                this.yob_ = stringValue;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(stringValue);
            }
            return this;
        }

        public Builder setYob(StringValue.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.yobBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.yob_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeYob(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.yobBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue2 = this.yob_;
                if (stringValue2 != null) {
                    this.yob_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.yob_ = stringValue;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(stringValue);
            }
            return this;
        }

        public Builder clearYob() {
            if (this.yobBuilder_ == null) {
                this.yob_ = null;
                onChanged();
            } else {
                this.yob_ = null;
                this.yobBuilder_ = null;
            }
            return this;
        }

        public StringValue.Builder getYobBuilder() {
            onChanged();
            return (StringValue.Builder) getYobFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValueOrBuilder getYobOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.yobBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StringValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            StringValue stringValue = this.yob_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        private SingleFieldBuilderV3 getYobFieldBuilder() {
            if (this.yobBuilder_ == null) {
                this.yobBuilder_ = new SingleFieldBuilderV3(getYob(), getParentForChildren(), isClean());
                this.yob_ = null;
            }
            return this.yobBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public boolean hasGender() {
            return (this.genderBuilder_ == null && this.gender_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValue getGender() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.genderBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue = this.gender_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }
            return (StringValue) singleFieldBuilderV3.getMessage();
        }

        public Builder setGender(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.genderBuilder_;
            if (singleFieldBuilderV3 == null) {
                stringValue.getClass();
                this.gender_ = stringValue;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(stringValue);
            }
            return this;
        }

        public Builder setGender(StringValue.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.genderBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.gender_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeGender(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.genderBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue2 = this.gender_;
                if (stringValue2 != null) {
                    this.gender_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.gender_ = stringValue;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(stringValue);
            }
            return this;
        }

        public Builder clearGender() {
            if (this.genderBuilder_ == null) {
                this.gender_ = null;
                onChanged();
            } else {
                this.gender_ = null;
                this.genderBuilder_ = null;
            }
            return this;
        }

        public StringValue.Builder getGenderBuilder() {
            onChanged();
            return (StringValue.Builder) getGenderFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValueOrBuilder getGenderOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.genderBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StringValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            StringValue stringValue = this.gender_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        private SingleFieldBuilderV3 getGenderFieldBuilder() {
            if (this.genderBuilder_ == null) {
                this.genderBuilder_ = new SingleFieldBuilderV3(getGender(), getParentForChildren(), isClean());
                this.gender_ = null;
            }
            return this.genderBuilder_;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public boolean hasKeywords() {
            return (this.keywordsBuilder_ == null && this.keywords_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValue getKeywords() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.keywordsBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue = this.keywords_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }
            return (StringValue) singleFieldBuilderV3.getMessage();
        }

        public Builder setKeywords(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.keywordsBuilder_;
            if (singleFieldBuilderV3 == null) {
                stringValue.getClass();
                this.keywords_ = stringValue;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(stringValue);
            }
            return this;
        }

        public Builder setKeywords(StringValue.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.keywordsBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.keywords_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeKeywords(StringValue stringValue) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.keywordsBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue2 = this.keywords_;
                if (stringValue2 != null) {
                    this.keywords_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.keywords_ = stringValue;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(stringValue);
            }
            return this;
        }

        public Builder clearKeywords() {
            if (this.keywordsBuilder_ == null) {
                this.keywords_ = null;
                onChanged();
            } else {
                this.keywords_ = null;
                this.keywordsBuilder_ = null;
            }
            return this;
        }

        public StringValue.Builder getKeywordsBuilder() {
            onChanged();
            return (StringValue.Builder) getKeywordsFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.MaskedSignalsOrBuilder
        public StringValueOrBuilder getKeywordsOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.keywordsBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StringValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            StringValue stringValue = this.keywords_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        private SingleFieldBuilderV3 getKeywordsFieldBuilder() {
            if (this.keywordsBuilder_ == null) {
                this.keywordsBuilder_ = new SingleFieldBuilderV3(getKeywords(), getParentForChildren(), isClean());
                this.keywords_ = null;
            }
            return this.keywordsBuilder_;
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

    public static MaskedSignals getDefaultInstance() {
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
    public MaskedSignals mo3244getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
