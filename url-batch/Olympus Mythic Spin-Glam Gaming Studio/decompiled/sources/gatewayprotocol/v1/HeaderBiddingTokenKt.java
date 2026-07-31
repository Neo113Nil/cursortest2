package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.CampaignStateOuterClass;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;
import gatewayprotocol.v1.InitializationDataOuterClass;
import gatewayprotocol.v1.MediationInfoOuterClass;
import gatewayprotocol.v1.PiiOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import gatewayprotocol.v1.TestDataOuterClass;
import gatewayprotocol.v1.TimestampsOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HeaderBiddingTokenKt.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/HeaderBiddingTokenKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class HeaderBiddingTokenKt {

    @NotNull
    public static final HeaderBiddingTokenKt INSTANCE = new HeaderBiddingTokenKt();

    private HeaderBiddingTokenKt() {
    }

    /* compiled from: HeaderBiddingTokenKt.kt */
    @Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u0000 Ù\u00012\u00020\u0001:\u0004Ù\u0001Ú\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0010J\u0006\u0010\u001b\u001a\u00020\u0010J\u0006\u0010\"\u001a\u00020\u0010J\u0006\u0010#\u001a\u00020$J\u0006\u0010+\u001a\u00020\u0010J\u0006\u0010,\u001a\u00020$J\u0006\u00103\u001a\u00020\u0010J\u0006\u00104\u001a\u00020$J\u0006\u0010;\u001a\u00020\u0010J\u0006\u0010<\u001a\u00020$J\u0006\u0010C\u001a\u00020\u0010J\u0006\u0010D\u001a\u00020$J\u0006\u0010K\u001a\u00020\u0010J\u0006\u0010L\u001a\u00020$J\u0006\u0010V\u001a\u00020\u0010J\u0006\u0010W\u001a\u00020$J\u0006\u0010[\u001a\u00020\u0010J\u0006\u0010\\\u001a\u00020$J\u0006\u0010b\u001a\u00020\u0010J\u0006\u0010c\u001a\u00020$J\u0006\u0010j\u001a\u00020\u0010J\u0006\u0010k\u001a\u00020$J\u0006\u0010u\u001a\u00020\u0010J\u0006\u0010v\u001a\u00020$J\u0007\u0010\u0083\u0001\u001a\u00020\u0010J\u0007\u0010\u0084\u0001\u001a\u00020$J\u0007\u0010\u008b\u0001\u001a\u00020\u0010J\u0007\u0010\u008c\u0001\u001a\u00020$J\u0007\u0010\u0096\u0001\u001a\u00020\u0010J\u0007\u0010\u0097\u0001\u001a\u00020$J\u0007\u0010\u009e\u0001\u001a\u00020\u0010J\u0007\u0010\u009f\u0001\u001a\u00020$J<\u0010¦\u0001\u001a\u00020\u0010*\u0018\u0012\u0005\u0012\u00030¢\u0001\u0012\u0005\u0012\u00030¢\u0001\u0012\u0005\u0012\u00030£\u00010¡\u00012\b\u0010§\u0001\u001a\u00030¢\u00012\u0007\u0010\b\u001a\u00030¢\u0001H\u0007¢\u0006\u0003\b¨\u0001J=\u0010©\u0001\u001a\u00020\u0010*\u0018\u0012\u0005\u0012\u00030¢\u0001\u0012\u0005\u0012\u00030¢\u0001\u0012\u0005\u0012\u00030£\u00010¡\u00012\b\u0010§\u0001\u001a\u00030¢\u00012\u0007\u0010\b\u001a\u00030¢\u0001H\u0087\n¢\u0006\u0003\bª\u0001J3\u0010«\u0001\u001a\u00020\u0010*\u0018\u0012\u0005\u0012\u00030¢\u0001\u0012\u0005\u0012\u00030¢\u0001\u0012\u0005\u0012\u00030£\u00010¡\u00012\b\u0010§\u0001\u001a\u00030¢\u0001H\u0007¢\u0006\u0003\b¬\u0001JA\u0010\u00ad\u0001\u001a\u00020\u0010*\u0018\u0012\u0005\u0012\u00030¢\u0001\u0012\u0005\u0012\u00030¢\u0001\u0012\u0005\u0012\u00030£\u00010¡\u00012\u0016\u0010®\u0001\u001a\u0011\u0012\u0005\u0012\u00030¢\u0001\u0012\u0005\u0012\u00030¢\u00010¯\u0001H\u0007¢\u0006\u0003\b°\u0001J)\u0010±\u0001\u001a\u00020\u0010*\u0018\u0012\u0005\u0012\u00030¢\u0001\u0012\u0005\u0012\u00030¢\u0001\u0012\u0005\u0012\u00030£\u00010¡\u0001H\u0007¢\u0006\u0003\b²\u0001J\u0007\u0010¹\u0001\u001a\u00020\u0010J\u0007\u0010º\u0001\u001a\u00020$J\u0007\u0010Ã\u0001\u001a\u00020\u0010J\u0007\u0010Ê\u0001\u001a\u00020\u0010J\u0007\u0010Ë\u0001\u001a\u00020$J\u0007\u0010Ò\u0001\u001a\u00020\u0010J\u0007\u0010Ó\u0001\u001a\u00020$J\u0007\u0010×\u0001\u001a\u00020\u0010J\u0007\u0010Ø\u0001\u001a\u00020$R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR$\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\u001c8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010&\u001a\u00020%2\u0006\u0010\b\u001a\u00020%8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010.\u001a\u00020-2\u0006\u0010\b\u001a\u00020-8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u00106\u001a\u0002052\u0006\u0010\b\u001a\u0002058G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010>\u001a\u00020=2\u0006\u0010\b\u001a\u00020=8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010F\u001a\u00020E2\u0006\u0010\b\u001a\u00020E8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u0017\u0010M\u001a\u0004\u0018\u00010E*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bN\u0010OR$\u0010Q\u001a\u00020P2\u0006\u0010\b\u001a\u00020P8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR$\u0010X\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bY\u0010\f\"\u0004\bZ\u0010\u000eR$\u0010]\u001a\u00020$2\u0006\u0010\b\u001a\u00020$8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR$\u0010e\u001a\u00020d2\u0006\u0010\b\u001a\u00020d8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\u0017\u0010l\u001a\u0004\u0018\u00010d*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bm\u0010nR$\u0010p\u001a\u00020o2\u0006\u0010\b\u001a\u00020o8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\u0017\u0010w\u001a\u0004\u0018\u00010o*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bx\u0010yR$\u0010{\u001a\u00020z2\u0006\u0010\b\u001a\u00020z8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR'\u0010\u0080\u0001\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0081\u0001\u0010\u0014\"\u0005\b\u0082\u0001\u0010\u0016R+\u0010\u0086\u0001\u001a\u00030\u0085\u00012\u0007\u0010\b\u001a\u00030\u0085\u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001b\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u0085\u0001*\u00020\u00008F¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R+\u0010\u0091\u0001\u001a\u00030\u0090\u00012\u0007\u0010\b\u001a\u00030\u0090\u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001b\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0090\u0001*\u00020\u00008F¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R'\u0010\u009b\u0001\u001a\u00020$2\u0006\u0010\b\u001a\u00020$8G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u009c\u0001\u0010_\"\u0005\b\u009d\u0001\u0010aR*\u0010 \u0001\u001a\u0018\u0012\u0005\u0012\u00030¢\u0001\u0012\u0005\u0012\u00030¢\u0001\u0012\u0005\u0012\u00030£\u00010¡\u00018G¢\u0006\b\u001a\u0006\b¤\u0001\u0010¥\u0001R+\u0010´\u0001\u001a\u00030³\u00012\u0007\u0010\b\u001a\u00030³\u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\bµ\u0001\u0010¶\u0001\"\u0006\b·\u0001\u0010¸\u0001R\u001b\u0010»\u0001\u001a\u0005\u0018\u00010³\u0001*\u00020\u00008F¢\u0006\b\u001a\u0006\b¼\u0001\u0010½\u0001R+\u0010¾\u0001\u001a\u00030¢\u00012\u0007\u0010\b\u001a\u00030¢\u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b¿\u0001\u0010À\u0001\"\u0006\bÁ\u0001\u0010Â\u0001R+\u0010Å\u0001\u001a\u00030Ä\u00012\u0007\u0010\b\u001a\u00030Ä\u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÆ\u0001\u0010Ç\u0001\"\u0006\bÈ\u0001\u0010É\u0001R\u001b\u0010Ì\u0001\u001a\u0005\u0018\u00010Ä\u0001*\u00020\u00008F¢\u0006\b\u001a\u0006\bÍ\u0001\u0010Î\u0001R+\u0010Ï\u0001\u001a\u00030¢\u00012\u0007\u0010\b\u001a\u00030¢\u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÐ\u0001\u0010À\u0001\"\u0006\bÑ\u0001\u0010Â\u0001R+\u0010Ô\u0001\u001a\u00030¢\u00012\u0007\u0010\b\u001a\u00030¢\u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÕ\u0001\u0010À\u0001\"\u0006\bÖ\u0001\u0010Â\u0001¨\u0006Û\u0001"}, d2 = {"Lgatewayprotocol/v1/HeaderBiddingTokenKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder;", "<init>", "(Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder;)V", "_build", "Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$HeaderBiddingToken;", "value", "Lcom/google/protobuf/ByteString;", "tokenId", "getTokenId", "()Lcom/google/protobuf/ByteString;", "setTokenId", "(Lcom/google/protobuf/ByteString;)V", "clearTokenId", "", "", "tokenNumber", "getTokenNumber", "()I", "setTokenNumber", "(I)V", "clearTokenNumber", "sessionToken", "getSessionToken", "setSessionToken", "clearSessionToken", "Lgatewayprotocol/v1/ClientInfoOuterClass$ClientInfo;", "clientInfo", "getClientInfo", "()Lgatewayprotocol/v1/ClientInfoOuterClass$ClientInfo;", "setClientInfo", "(Lgatewayprotocol/v1/ClientInfoOuterClass$ClientInfo;)V", "clearClientInfo", "hasClientInfo", "", "Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "timestamps", "getTimestamps", "()Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "setTimestamps", "(Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;)V", "clearTimestamps", "hasTimestamps", "Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "sessionCounters", "getSessionCounters", "()Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "setSessionCounters", "(Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;)V", "clearSessionCounters", "hasSessionCounters", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "staticDeviceInfo", "getStaticDeviceInfo", "()Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "setStaticDeviceInfo", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;)V", "clearStaticDeviceInfo", "hasStaticDeviceInfo", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "dynamicDeviceInfo", "getDynamicDeviceInfo", "()Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "setDynamicDeviceInfo", "(Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;)V", "clearDynamicDeviceInfo", "hasDynamicDeviceInfo", "Lgatewayprotocol/v1/PiiOuterClass$Pii;", "pii", "getPii", "()Lgatewayprotocol/v1/PiiOuterClass$Pii;", "setPii", "(Lgatewayprotocol/v1/PiiOuterClass$Pii;)V", "clearPii", "hasPii", "piiOrNull", "getPiiOrNull", "(Lgatewayprotocol/v1/HeaderBiddingTokenKt$Dsl;)Lgatewayprotocol/v1/PiiOuterClass$Pii;", "Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState;", "campaignState", "getCampaignState", "()Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState;", "setCampaignState", "(Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState;)V", "clearCampaignState", "hasCampaignState", "tcf", "getTcf", "setTcf", "clearTcf", "hasTcf", "scarSignalsCollected", "getScarSignalsCollected", "()Z", "setScarSignalsCollected", "(Z)V", "clearScarSignalsCollected", "hasScarSignalsCollected", "Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;", "limitedSessionToken", "getLimitedSessionToken", "()Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;", "setLimitedSessionToken", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;)V", "clearLimitedSessionToken", "hasLimitedSessionToken", "limitedSessionTokenOrNull", "getLimitedSessionTokenOrNull", "(Lgatewayprotocol/v1/HeaderBiddingTokenKt$Dsl;)Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;", "Lgatewayprotocol/v1/InitializationDataOuterClass$InitializationData;", "initializationData", "getInitializationData", "()Lgatewayprotocol/v1/InitializationDataOuterClass$InitializationData;", "setInitializationData", "(Lgatewayprotocol/v1/InitializationDataOuterClass$InitializationData;)V", "clearInitializationData", "hasInitializationData", "initializationDataOrNull", "getInitializationDataOrNull", "(Lgatewayprotocol/v1/HeaderBiddingTokenKt$Dsl;)Lgatewayprotocol/v1/InitializationDataOuterClass$InitializationData;", "Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "adFormat", "getAdFormat", "()Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "setAdFormat", "(Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;)V", "adFormatValue", "getAdFormatValue", "setAdFormatValue", "clearAdFormat", "hasAdFormat", "Lgatewayprotocol/v1/TestDataOuterClass$TestData;", "testData", "getTestData", "()Lgatewayprotocol/v1/TestDataOuterClass$TestData;", "setTestData", "(Lgatewayprotocol/v1/TestDataOuterClass$TestData;)V", "clearTestData", "hasTestData", "testDataOrNull", "getTestDataOrNull", "(Lgatewayprotocol/v1/HeaderBiddingTokenKt$Dsl;)Lgatewayprotocol/v1/TestDataOuterClass$TestData;", "Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$TokenCounters;", "tokenCounters", "getTokenCounters", "()Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$TokenCounters;", "setTokenCounters", "(Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$TokenCounters;)V", "clearTokenCounters", "hasTokenCounters", "tokenCountersOrNull", "getTokenCountersOrNull", "(Lgatewayprotocol/v1/HeaderBiddingTokenKt$Dsl;)Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$TokenCounters;", "offerwallEnabled", "getOfferwallEnabled", "setOfferwallEnabled", "clearOfferwallEnabled", "hasOfferwallEnabled", "extras", "Lcom/google/protobuf/kotlin/DslMap;", "", "Lgatewayprotocol/v1/HeaderBiddingTokenKt$Dsl$ExtrasProxy;", "getExtrasMap", "()Lcom/google/protobuf/kotlin/DslMap;", "put", "key", "putExtras", "set", "setExtras", "remove", "removeExtras", "putAll", "map", "", "putAllExtras", "clear", "clearExtras", "Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;", "mediationInfo", "getMediationInfo", "()Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;", "setMediationInfo", "(Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;)V", "clearMediationInfo", "hasMediationInfo", "mediationInfoOrNull", "getMediationInfoOrNull", "(Lgatewayprotocol/v1/HeaderBiddingTokenKt$Dsl;)Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;", "placementId", "getPlacementId", "()Ljava/lang/String;", "setPlacementId", "(Ljava/lang/String;)V", "clearPlacementId", "Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;", "bannerSize", "getBannerSize", "()Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;", "setBannerSize", "(Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;)V", "clearBannerSize", "hasBannerSize", "bannerSizeOrNull", "getBannerSizeOrNull", "(Lgatewayprotocol/v1/HeaderBiddingTokenKt$Dsl;)Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;", "mediationAdUnitId", "getMediationAdUnitId", "setMediationAdUnitId", "clearMediationAdUnitId", "hasMediationAdUnitId", "externalUserIdentifier", "getExternalUserIdentifier", "setExternalUserIdentifier", "clearExternalUserIdentifier", "hasExternalUserIdentifier", "Companion", "ExtrasProxy", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder _builder;

        public /* synthetic */ Dsl(HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder builder) {
            this._builder = builder;
        }

        /* compiled from: HeaderBiddingTokenKt.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/HeaderBiddingTokenKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/HeaderBiddingTokenKt$Dsl;", "builder", "Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ HeaderBiddingTokenOuterClass.HeaderBiddingToken _build() {
            HeaderBiddingTokenOuterClass.HeaderBiddingToken build = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            return build;
        }

        @NotNull
        public final ByteString getTokenId() {
            ByteString tokenId = this._builder.getTokenId();
            Intrinsics.checkNotNullExpressionValue(tokenId, "getTokenId(...)");
            return tokenId;
        }

        public final void setTokenId(@NotNull ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setTokenId(value);
        }

        public final void clearTokenId() {
            this._builder.clearTokenId();
        }

        public final int getTokenNumber() {
            return this._builder.getTokenNumber();
        }

        public final void setTokenNumber(int i) {
            this._builder.setTokenNumber(i);
        }

        public final void clearTokenNumber() {
            this._builder.clearTokenNumber();
        }

        @NotNull
        public final ByteString getSessionToken() {
            ByteString sessionToken = this._builder.getSessionToken();
            Intrinsics.checkNotNullExpressionValue(sessionToken, "getSessionToken(...)");
            return sessionToken;
        }

        public final void setSessionToken(@NotNull ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setSessionToken(value);
        }

        public final void clearSessionToken() {
            this._builder.clearSessionToken();
        }

        @NotNull
        public final ClientInfoOuterClass.ClientInfo getClientInfo() {
            ClientInfoOuterClass.ClientInfo clientInfo = this._builder.getClientInfo();
            Intrinsics.checkNotNullExpressionValue(clientInfo, "getClientInfo(...)");
            return clientInfo;
        }

        public final void setClientInfo(@NotNull ClientInfoOuterClass.ClientInfo value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setClientInfo(value);
        }

        public final void clearClientInfo() {
            this._builder.clearClientInfo();
        }

        public final boolean hasClientInfo() {
            return this._builder.hasClientInfo();
        }

        @NotNull
        public final TimestampsOuterClass.Timestamps getTimestamps() {
            TimestampsOuterClass.Timestamps timestamps = this._builder.getTimestamps();
            Intrinsics.checkNotNullExpressionValue(timestamps, "getTimestamps(...)");
            return timestamps;
        }

        public final void setTimestamps(@NotNull TimestampsOuterClass.Timestamps value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setTimestamps(value);
        }

        public final void clearTimestamps() {
            this._builder.clearTimestamps();
        }

        public final boolean hasTimestamps() {
            return this._builder.hasTimestamps();
        }

        @NotNull
        public final SessionCountersOuterClass.SessionCounters getSessionCounters() {
            SessionCountersOuterClass.SessionCounters sessionCounters = this._builder.getSessionCounters();
            Intrinsics.checkNotNullExpressionValue(sessionCounters, "getSessionCounters(...)");
            return sessionCounters;
        }

        public final void setSessionCounters(@NotNull SessionCountersOuterClass.SessionCounters value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setSessionCounters(value);
        }

        public final void clearSessionCounters() {
            this._builder.clearSessionCounters();
        }

        public final boolean hasSessionCounters() {
            return this._builder.hasSessionCounters();
        }

        @NotNull
        public final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = this._builder.getStaticDeviceInfo();
            Intrinsics.checkNotNullExpressionValue(staticDeviceInfo, "getStaticDeviceInfo(...)");
            return staticDeviceInfo;
        }

        public final void setStaticDeviceInfo(@NotNull StaticDeviceInfoOuterClass.StaticDeviceInfo value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setStaticDeviceInfo(value);
        }

        public final void clearStaticDeviceInfo() {
            this._builder.clearStaticDeviceInfo();
        }

        public final boolean hasStaticDeviceInfo() {
            return this._builder.hasStaticDeviceInfo();
        }

        @NotNull
        public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this._builder.getDynamicDeviceInfo();
            Intrinsics.checkNotNullExpressionValue(dynamicDeviceInfo, "getDynamicDeviceInfo(...)");
            return dynamicDeviceInfo;
        }

        public final void setDynamicDeviceInfo(@NotNull DynamicDeviceInfoOuterClass.DynamicDeviceInfo value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setDynamicDeviceInfo(value);
        }

        public final void clearDynamicDeviceInfo() {
            this._builder.clearDynamicDeviceInfo();
        }

        public final boolean hasDynamicDeviceInfo() {
            return this._builder.hasDynamicDeviceInfo();
        }

        @NotNull
        public final PiiOuterClass.Pii getPii() {
            PiiOuterClass.Pii pii = this._builder.getPii();
            Intrinsics.checkNotNullExpressionValue(pii, "getPii(...)");
            return pii;
        }

        public final void setPii(@NotNull PiiOuterClass.Pii value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setPii(value);
        }

        public final void clearPii() {
            this._builder.clearPii();
        }

        public final boolean hasPii() {
            return this._builder.hasPii();
        }

        @Nullable
        public final PiiOuterClass.Pii getPiiOrNull(@NotNull Dsl dsl) {
            Intrinsics.checkNotNullParameter(dsl, "<this>");
            return HeaderBiddingTokenKtKt.getPiiOrNull(dsl._builder);
        }

        @NotNull
        public final CampaignStateOuterClass.CampaignState getCampaignState() {
            CampaignStateOuterClass.CampaignState campaignState = this._builder.getCampaignState();
            Intrinsics.checkNotNullExpressionValue(campaignState, "getCampaignState(...)");
            return campaignState;
        }

        public final void setCampaignState(@NotNull CampaignStateOuterClass.CampaignState value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setCampaignState(value);
        }

        public final void clearCampaignState() {
            this._builder.clearCampaignState();
        }

        public final boolean hasCampaignState() {
            return this._builder.hasCampaignState();
        }

        @NotNull
        public final ByteString getTcf() {
            ByteString tcf = this._builder.getTcf();
            Intrinsics.checkNotNullExpressionValue(tcf, "getTcf(...)");
            return tcf;
        }

        public final void setTcf(@NotNull ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setTcf(value);
        }

        public final void clearTcf() {
            this._builder.clearTcf();
        }

        public final boolean hasTcf() {
            return this._builder.hasTcf();
        }

        public final boolean getScarSignalsCollected() {
            return this._builder.getScarSignalsCollected();
        }

        public final void setScarSignalsCollected(boolean z) {
            this._builder.setScarSignalsCollected(z);
        }

        public final void clearScarSignalsCollected() {
            this._builder.clearScarSignalsCollected();
        }

        public final boolean hasScarSignalsCollected() {
            return this._builder.hasScarSignalsCollected();
        }

        @NotNull
        public final UniversalRequestOuterClass.LimitedSessionToken getLimitedSessionToken() {
            UniversalRequestOuterClass.LimitedSessionToken limitedSessionToken = this._builder.getLimitedSessionToken();
            Intrinsics.checkNotNullExpressionValue(limitedSessionToken, "getLimitedSessionToken(...)");
            return limitedSessionToken;
        }

        public final void setLimitedSessionToken(@NotNull UniversalRequestOuterClass.LimitedSessionToken value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setLimitedSessionToken(value);
        }

        public final void clearLimitedSessionToken() {
            this._builder.clearLimitedSessionToken();
        }

        public final boolean hasLimitedSessionToken() {
            return this._builder.hasLimitedSessionToken();
        }

        @Nullable
        public final UniversalRequestOuterClass.LimitedSessionToken getLimitedSessionTokenOrNull(@NotNull Dsl dsl) {
            Intrinsics.checkNotNullParameter(dsl, "<this>");
            return HeaderBiddingTokenKtKt.getLimitedSessionTokenOrNull(dsl._builder);
        }

        @NotNull
        public final InitializationDataOuterClass.InitializationData getInitializationData() {
            InitializationDataOuterClass.InitializationData initializationData = this._builder.getInitializationData();
            Intrinsics.checkNotNullExpressionValue(initializationData, "getInitializationData(...)");
            return initializationData;
        }

        public final void setInitializationData(@NotNull InitializationDataOuterClass.InitializationData value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setInitializationData(value);
        }

        public final void clearInitializationData() {
            this._builder.clearInitializationData();
        }

        public final boolean hasInitializationData() {
            return this._builder.hasInitializationData();
        }

        @Nullable
        public final InitializationDataOuterClass.InitializationData getInitializationDataOrNull(@NotNull Dsl dsl) {
            Intrinsics.checkNotNullParameter(dsl, "<this>");
            return HeaderBiddingTokenKtKt.getInitializationDataOrNull(dsl._builder);
        }

        @NotNull
        public final AdFormatOuterClass.AdFormat getAdFormat() {
            AdFormatOuterClass.AdFormat adFormat = this._builder.getAdFormat();
            Intrinsics.checkNotNullExpressionValue(adFormat, "getAdFormat(...)");
            return adFormat;
        }

        public final void setAdFormat(@NotNull AdFormatOuterClass.AdFormat value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAdFormat(value);
        }

        public final int getAdFormatValue() {
            return this._builder.getAdFormatValue();
        }

        public final void setAdFormatValue(int i) {
            this._builder.setAdFormatValue(i);
        }

        public final void clearAdFormat() {
            this._builder.clearAdFormat();
        }

        public final boolean hasAdFormat() {
            return this._builder.hasAdFormat();
        }

        @NotNull
        public final TestDataOuterClass.TestData getTestData() {
            TestDataOuterClass.TestData testData = this._builder.getTestData();
            Intrinsics.checkNotNullExpressionValue(testData, "getTestData(...)");
            return testData;
        }

        public final void setTestData(@NotNull TestDataOuterClass.TestData value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setTestData(value);
        }

        public final void clearTestData() {
            this._builder.clearTestData();
        }

        public final boolean hasTestData() {
            return this._builder.hasTestData();
        }

        @Nullable
        public final TestDataOuterClass.TestData getTestDataOrNull(@NotNull Dsl dsl) {
            Intrinsics.checkNotNullParameter(dsl, "<this>");
            return HeaderBiddingTokenKtKt.getTestDataOrNull(dsl._builder);
        }

        @NotNull
        public final HeaderBiddingTokenOuterClass.TokenCounters getTokenCounters() {
            HeaderBiddingTokenOuterClass.TokenCounters tokenCounters = this._builder.getTokenCounters();
            Intrinsics.checkNotNullExpressionValue(tokenCounters, "getTokenCounters(...)");
            return tokenCounters;
        }

        public final void setTokenCounters(@NotNull HeaderBiddingTokenOuterClass.TokenCounters value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setTokenCounters(value);
        }

        public final void clearTokenCounters() {
            this._builder.clearTokenCounters();
        }

        public final boolean hasTokenCounters() {
            return this._builder.hasTokenCounters();
        }

        @Nullable
        public final HeaderBiddingTokenOuterClass.TokenCounters getTokenCountersOrNull(@NotNull Dsl dsl) {
            Intrinsics.checkNotNullParameter(dsl, "<this>");
            return HeaderBiddingTokenKtKt.getTokenCountersOrNull(dsl._builder);
        }

        public final boolean getOfferwallEnabled() {
            return this._builder.getOfferwallEnabled();
        }

        public final void setOfferwallEnabled(boolean z) {
            this._builder.setOfferwallEnabled(z);
        }

        public final void clearOfferwallEnabled() {
            this._builder.clearOfferwallEnabled();
        }

        public final boolean hasOfferwallEnabled() {
            return this._builder.hasOfferwallEnabled();
        }

        /* compiled from: HeaderBiddingTokenKt.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/HeaderBiddingTokenKt$Dsl$ExtrasProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "<init>", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ExtrasProxy extends DslProxy {
            private ExtrasProxy() {
            }
        }

        public final /* synthetic */ DslMap getExtrasMap() {
            Map<String, String> extrasMap = this._builder.getExtrasMap();
            Intrinsics.checkNotNullExpressionValue(extrasMap, "getExtrasMap(...)");
            return new DslMap(extrasMap);
        }

        public final void putExtras(@NotNull DslMap<String, String, ExtrasProxy> dslMap, @NotNull String key, @NotNull String value) {
            Intrinsics.checkNotNullParameter(dslMap, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.putExtras(key, value);
        }

        public final /* synthetic */ void setExtras(DslMap<String, String, ExtrasProxy> dslMap, String key, String value) {
            Intrinsics.checkNotNullParameter(dslMap, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            putExtras(dslMap, key, value);
        }

        public final /* synthetic */ void removeExtras(DslMap dslMap, String key) {
            Intrinsics.checkNotNullParameter(dslMap, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            this._builder.removeExtras(key);
        }

        public final /* synthetic */ void putAllExtras(DslMap dslMap, Map map) {
            Intrinsics.checkNotNullParameter(dslMap, "<this>");
            Intrinsics.checkNotNullParameter(map, "map");
            this._builder.putAllExtras(map);
        }

        public final /* synthetic */ void clearExtras(DslMap dslMap) {
            Intrinsics.checkNotNullParameter(dslMap, "<this>");
            this._builder.clearExtras();
        }

        @NotNull
        public final MediationInfoOuterClass.MediationInfo getMediationInfo() {
            MediationInfoOuterClass.MediationInfo mediationInfo = this._builder.getMediationInfo();
            Intrinsics.checkNotNullExpressionValue(mediationInfo, "getMediationInfo(...)");
            return mediationInfo;
        }

        public final void setMediationInfo(@NotNull MediationInfoOuterClass.MediationInfo value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setMediationInfo(value);
        }

        public final void clearMediationInfo() {
            this._builder.clearMediationInfo();
        }

        public final boolean hasMediationInfo() {
            return this._builder.hasMediationInfo();
        }

        @Nullable
        public final MediationInfoOuterClass.MediationInfo getMediationInfoOrNull(@NotNull Dsl dsl) {
            Intrinsics.checkNotNullParameter(dsl, "<this>");
            return HeaderBiddingTokenKtKt.getMediationInfoOrNull(dsl._builder);
        }

        @NotNull
        public final String getPlacementId() {
            String placementId = this._builder.getPlacementId();
            Intrinsics.checkNotNullExpressionValue(placementId, "getPlacementId(...)");
            return placementId;
        }

        public final void setPlacementId(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setPlacementId(value);
        }

        public final void clearPlacementId() {
            this._builder.clearPlacementId();
        }

        @NotNull
        public final AdRequestOuterClass.BannerSize getBannerSize() {
            AdRequestOuterClass.BannerSize bannerSize = this._builder.getBannerSize();
            Intrinsics.checkNotNullExpressionValue(bannerSize, "getBannerSize(...)");
            return bannerSize;
        }

        public final void setBannerSize(@NotNull AdRequestOuterClass.BannerSize value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setBannerSize(value);
        }

        public final void clearBannerSize() {
            this._builder.clearBannerSize();
        }

        public final boolean hasBannerSize() {
            return this._builder.hasBannerSize();
        }

        @Nullable
        public final AdRequestOuterClass.BannerSize getBannerSizeOrNull(@NotNull Dsl dsl) {
            Intrinsics.checkNotNullParameter(dsl, "<this>");
            return HeaderBiddingTokenKtKt.getBannerSizeOrNull(dsl._builder);
        }

        @NotNull
        public final String getMediationAdUnitId() {
            String mediationAdUnitId = this._builder.getMediationAdUnitId();
            Intrinsics.checkNotNullExpressionValue(mediationAdUnitId, "getMediationAdUnitId(...)");
            return mediationAdUnitId;
        }

        public final void setMediationAdUnitId(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setMediationAdUnitId(value);
        }

        public final void clearMediationAdUnitId() {
            this._builder.clearMediationAdUnitId();
        }

        public final boolean hasMediationAdUnitId() {
            return this._builder.hasMediationAdUnitId();
        }

        @NotNull
        public final String getExternalUserIdentifier() {
            String externalUserIdentifier = this._builder.getExternalUserIdentifier();
            Intrinsics.checkNotNullExpressionValue(externalUserIdentifier, "getExternalUserIdentifier(...)");
            return externalUserIdentifier;
        }

        public final void setExternalUserIdentifier(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setExternalUserIdentifier(value);
        }

        public final void clearExternalUserIdentifier() {
            this._builder.clearExternalUserIdentifier();
        }

        public final boolean hasExternalUserIdentifier() {
            return this._builder.hasExternalUserIdentifier();
        }
    }
}
