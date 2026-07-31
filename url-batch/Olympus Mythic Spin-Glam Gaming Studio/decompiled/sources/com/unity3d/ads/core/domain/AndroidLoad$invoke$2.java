package com.unity3d.ads.core.domain;

import android.content.Context;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.ads.UnityAdsErrorKt;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.LoadConfigurationInternal;
import com.unity3d.ads.core.data.model.LoadResult;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ErrorExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.AdPlayerConfigResponseOuterClass;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.AdResponseKt;
import gatewayprotocol.v1.AdResponseOuterClass;
import gatewayprotocol.v1.CampaignMetadataOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import gatewayprotocol.v1.WebviewConfiguration;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationUnit;
import kotlin.time.TimeSource$Monotonic;
import kotlin.time.TimedValue;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AndroidLoad.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/model/LoadResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidLoad$invoke$2", f = "AndroidLoad.kt", l = {97, 101, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, 164}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class AndroidLoad$invoke$2 extends SuspendLambda implements Function2 {
    final /* synthetic */ AdRequestOuterClass.BannerSize $bannerSize;
    final /* synthetic */ Context $context;
    final /* synthetic */ HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup $headerBiddingAdMarkup;
    final /* synthetic */ UnityAdsLoadOptions $loadOptions;
    final /* synthetic */ ByteString $opportunityId;
    final /* synthetic */ String $placement;
    int I$0;
    int I$1;
    long J$0;
    long J$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    final /* synthetic */ AndroidLoad this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidLoad$invoke$2(AdRequestOuterClass.BannerSize bannerSize, AndroidLoad androidLoad, HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup, ByteString byteString, String str, UnityAdsLoadOptions unityAdsLoadOptions, Context context, Continuation continuation) {
        super(2, continuation);
        this.$bannerSize = bannerSize;
        this.this$0 = androidLoad;
        this.$headerBiddingAdMarkup = headerBiddingAdMarkup;
        this.$opportunityId = byteString;
        this.$placement = str;
        this.$loadOptions = unityAdsLoadOptions;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AndroidLoad$invoke$2 androidLoad$invoke$2 = new AndroidLoad$invoke$2(this.$bannerSize, this.this$0, this.$headerBiddingAdMarkup, this.$opportunityId, this.$placement, this.$loadOptions, this.$context, continuation);
        androidLoad$invoke$2.L$0 = obj;
        return androidLoad$invoke$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AndroidLoad$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(1:(1:(4:(1:(1:(4:8|9|10|11)(2:42|43))(13:44|45|46|47|48|49|50|51|52|(1:54)(1:91)|55|56|(7:58|(6:60|(1:62)|63|64|(2:20|(1:22)(2:23|(2:25|(1:27))(2:28|29)))|31)|65|63|64|(0)|31)(14:66|(1:68)|69|(1:71)|72|73|74|75|(1:77)|78|79|80|81|(1:83)(1:84))))(22:107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|(1:129)(10:130|48|49|50|51|52|(0)(0)|55|56|(0)(0)))|39|(0)|31)(20:155|156|157|158|159|160|161|162|163|(1:165)(1:169)|166|167|74|75|(0)|78|79|80|81|(0)(0)))(24:186|187|188|189|190|191|192|193|194|195|196|197|198|199|200|201|202|203|204|205|206|207|208|(1:210)(17:211|159|160|161|162|163|(0)(0)|166|167|74|75|(0)|78|79|80|81|(0)(0))))(7:234|(1:236)(1:309)|237|238|239|240|(3:242|(0)|31)(9:(1:244)(1:304)|245|246|(2:248|249)(1:302)|(10:281|282|283|284|285|286|287|288|289|(1:291)(21:292|190|191|192|193|194|195|196|197|198|199|200|201|202|203|204|205|206|207|208|(0)(0)))(12:251|252|253|(3:273|274|275)(1:255)|256|257|258|259|260|261|262|(1:264)(19:265|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|(0)(0)))|103|39|(0)|31))|12|13|(2:15|(1:17)(1:32))(2:33|(2:35|36))|18|(0)|31|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0706, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x04ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0750  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x05a5 A[Catch: UnityAdsNetworkException -> 0x05c8, TRY_ENTER, TryCatch #34 {UnityAdsNetworkException -> 0x05c8, blocks: (B:52:0x054a, B:55:0x0575, B:58:0x05a5, B:60:0x05be, B:64:0x05cf, B:66:0x05f6, B:68:0x0669, B:69:0x0673, B:71:0x0680, B:72:0x0691), top: B:51:0x054a }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x05f6 A[Catch: UnityAdsNetworkException -> 0x05c8, TryCatch #34 {UnityAdsNetworkException -> 0x05c8, blocks: (B:52:0x054a, B:55:0x0575, B:58:0x05a5, B:60:0x05be, B:64:0x05cf, B:66:0x05f6, B:68:0x0669, B:69:0x0673, B:71:0x0680, B:72:0x0691), top: B:51:0x054a }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x06db A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0573  */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v41, types: [int] */
    /* JADX WARN: Type inference failed for: r3v44, types: [int] */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v48, types: [int] */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        long m8186markNowz9LOYto;
        String str;
        long j;
        boolean z2;
        AndroidLoad androidLoad;
        ?? r3;
        AndroidLoad androidLoad2;
        SessionRepository sessionRepository;
        long j2;
        String str2;
        String str3;
        AdObject tmpAdObject;
        Object obj2;
        HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup;
        int i;
        GetAdRequest getAdRequest;
        LoadConfigurationInternal loadConfigurationInternal;
        Object invoke;
        Object obj3;
        UnityAdsLoadOptions unityAdsLoadOptions;
        String str4;
        AdObject adObject;
        Context context;
        ByteString byteString;
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType;
        int i2;
        int i3;
        AndroidLoad androidLoad3;
        long j3;
        boolean z3;
        GetAdPlayerConfigRequest getAdPlayerConfigRequest;
        ByteString configurationToken;
        AdFormatOuterClass.AdFormat adFormat;
        LoadConfigurationInternal loadConfigurationInternal2;
        HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup2;
        Object obj4;
        Object invoke2;
        HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup3;
        String str5;
        int i4;
        Context context2;
        ByteString byteString2;
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType2;
        UnityAdsLoadOptions unityAdsLoadOptions2;
        int i5;
        long j4;
        AdObject adObject2;
        ValidateExtrasSize validateExtrasSize;
        Object failure;
        int i6;
        GetRequestPolicy getRequestPolicy;
        int i7;
        long m8186markNowz9LOYto2;
        String str6;
        UnityAdsLoadOptions unityAdsLoadOptions3;
        Context context3;
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType3;
        Object obj5;
        AdObject adObject3;
        ByteString byteString3;
        long j5;
        int i8;
        AdObject adObject4;
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType4;
        String str7;
        GatewayClient gatewayClient;
        ByteString byteString4;
        Object obj6;
        Object request$default;
        long j6;
        Context context4;
        UnityAdsLoadOptions unityAdsLoadOptions4;
        AndroidLoad androidLoad4;
        Object m8023constructorimpl;
        AdObject adObject5;
        SendDiagnosticEvent sendDiagnosticEvent;
        long j7;
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType5;
        Context context5;
        UnityAdsLoadOptions unityAdsLoadOptions5;
        int i9;
        AdResponseOuterClass.AdResponse adResponse;
        Object obj7;
        String str8;
        ByteString byteString5;
        GetRequestPolicy getRequestPolicy2;
        long j8;
        long m8186markNowz9LOYto3;
        ByteString byteString6;
        String str9;
        UnityAdsLoadOptions unityAdsLoadOptions6;
        Context context6;
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType6;
        HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup4;
        AdObject adObject6;
        long j9;
        UnityAdsLoadOptions unityAdsLoadOptions7;
        HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup5;
        ByteString byteString7;
        String str10;
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType7;
        GatewayClient gatewayClient2;
        HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup6;
        AdObject adObject7;
        Object obj8;
        Object request$default2;
        int i10;
        int i11;
        long j10;
        Object m8023constructorimpl2;
        AdObject adObject8;
        long j11;
        HandleGatewayAdResponse handleGatewayAdResponse;
        Object obj9;
        Object invoke3;
        SendDiagnosticEvent sendDiagnosticEvent2;
        UniversalResponseOuterClass.UniversalResponse universalResponse;
        String str11;
        SessionRepository sessionRepository2;
        SessionRepository sessionRepository3;
        boolean isCachePhaseFailure;
        SessionRepository sessionRepository4;
        SessionRepository sessionRepository5;
        Object obj10;
        AdRepository adRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            z = this.$bannerSize != null;
            m8186markNowz9LOYto = TimeSource$Monotonic.INSTANCE.m8186markNowz9LOYto();
            AndroidLoad androidLoad5 = this.this$0;
            HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup7 = this.$headerBiddingAdMarkup;
            ByteString byteString8 = this.$opportunityId;
            String str12 = this.$placement;
            UnityAdsLoadOptions unityAdsLoadOptions8 = this.$loadOptions;
            AdRequestOuterClass.BannerSize bannerSize = this.$bannerSize;
            str = "native_load_config_failure_time";
            Context context7 = this.$context;
            try {
                sessionRepository = androidLoad5.sessionRepository;
                try {
                } catch (UnityAdsNetworkException e) {
                    e = e;
                    j2 = m8186markNowz9LOYto;
                    r3 = z ? 1 : 0;
                    androidLoad2 = androidLoad5;
                }
            } catch (UnityAdsNetworkException e2) {
                e = e2;
                j = m8186markNowz9LOYto;
                z2 = z ? 1 : 0;
            }
            if (!sessionRepository.isSdkInitialized()) {
                failure = new LoadResult.Failure(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_NOT_INITIALIZED, UnityAdsErrorKt.MSG_BOLD_LOAD_FAIL_SDK_NOT_INITIALIZED, null, "not_initialized", null, null, 52, null);
                if (!z) {
                }
                return failure;
            }
            DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType8 = z ? DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_BANNER : DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_FULLSCREEN;
            boolean isEmpty = headerBiddingAdMarkup7.getAdData().isEmpty();
            str2 = "native_load_config_success_time";
            int i13 = !isEmpty ? 1 : 0;
            str3 = "getAdData(...)";
            tmpAdObject = androidLoad5.getTmpAdObject(byteString8, str12, !isEmpty, diagnosticAdType8, unityAdsLoadOptions8);
            LoadConfigurationInternal loadConfigurationInternal3 = unityAdsLoadOptions8.loadConfiguration;
            if (loadConfigurationInternal3 != null) {
                headerBiddingAdMarkup = headerBiddingAdMarkup7;
                validateExtrasSize = androidLoad5.validateExtrasSize;
                obj2 = coroutine_suspended;
                validateExtrasSize.invoke(loadConfigurationInternal3.getExtras(), "load", tmpAdObject);
                Unit unit = Unit.INSTANCE;
            } else {
                obj2 = coroutine_suspended;
                headerBiddingAdMarkup = headerBiddingAdMarkup7;
            }
            if (isEmpty) {
                try {
                    androidLoad5.incrementLoadRequestCount(z);
                    getAdRequest = androidLoad5.getAdRequest;
                    loadConfigurationInternal = unityAdsLoadOptions8.loadConfiguration;
                    this.L$0 = androidLoad5;
                    this.L$1 = byteString8;
                    this.L$2 = str12;
                    this.L$3 = unityAdsLoadOptions8;
                    this.L$4 = context7;
                    this.L$5 = coroutineScope;
                    this.L$6 = diagnosticAdType8;
                    this.L$7 = tmpAdObject;
                    this.I$0 = z ? 1 : 0;
                    this.J$0 = m8186markNowz9LOYto;
                    this.I$1 = i13;
                    i = z ? 1 : 0;
                    try {
                        this.label = 1;
                        j = m8186markNowz9LOYto;
                    } catch (UnityAdsNetworkException e3) {
                        e = e3;
                        j = m8186markNowz9LOYto;
                    }
                } catch (UnityAdsNetworkException e4) {
                    e = e4;
                    j = m8186markNowz9LOYto;
                    i = z ? 1 : 0;
                }
                try {
                    invoke = getAdRequest.invoke(str12, byteString8, bannerSize, loadConfigurationInternal, this);
                    obj3 = obj2;
                    if (invoke == obj3) {
                        return obj3;
                    }
                    unityAdsLoadOptions = unityAdsLoadOptions8;
                    str4 = str12;
                    adObject = tmpAdObject;
                    context = context7;
                    byteString = byteString8;
                    diagnosticAdType = diagnosticAdType8;
                    i2 = i13;
                    i3 = i;
                    androidLoad3 = androidLoad5;
                    j3 = j;
                    UniversalRequestOuterClass.UniversalRequest universalRequest = (UniversalRequestOuterClass.UniversalRequest) invoke;
                    getRequestPolicy = androidLoad3.getRequestPolicy;
                    RequestPolicy invoke4 = getRequestPolicy.invoke();
                    i7 = i3;
                    m8186markNowz9LOYto2 = TimeSource$Monotonic.INSTANCE.m8186markNowz9LOYto();
                    Result.Companion companion = Result.INSTANCE;
                    gatewayClient = androidLoad3.gatewayClient;
                    OperationType operationType = OperationType.LOAD;
                    this.L$0 = androidLoad3;
                    this.L$1 = byteString;
                    this.L$2 = str4;
                    this.L$3 = unityAdsLoadOptions;
                    this.L$4 = context;
                    this.L$5 = diagnosticAdType;
                    this.L$6 = adObject;
                    byteString4 = byteString;
                    this.L$7 = null;
                    this.I$0 = i7;
                    this.J$0 = j3;
                    this.I$1 = i2;
                    this.J$1 = m8186markNowz9LOYto2;
                    i7 = i7;
                    this.label = 2;
                    i6 = i7;
                    byteString3 = byteString4;
                    str6 = str4;
                    unityAdsLoadOptions3 = unityAdsLoadOptions;
                    context3 = context;
                    diagnosticAdType3 = diagnosticAdType;
                    obj6 = obj3;
                    adObject3 = adObject;
                    z3 = true;
                    request$default = GatewayClient.DefaultImpls.request$default(gatewayClient, null, universalRequest, invoke4, operationType, this, 1, null);
                    obj5 = obj6;
                    if (request$default != obj5) {
                    }
                } catch (UnityAdsNetworkException e5) {
                    e = e5;
                    r3 = i;
                    androidLoad2 = androidLoad5;
                    j2 = j;
                    failure = androidLoad2.handleGatewayException(e);
                    m8186markNowz9LOYto = j2;
                    z = r3;
                    if (!z) {
                    }
                    return failure;
                }
            } else {
                j = m8186markNowz9LOYto;
                z2 = z ? 1 : 0;
                Object obj11 = obj2;
                z3 = true;
                try {
                    androidLoad5.incrementLoadRequestAdmCount(z2);
                    getAdPlayerConfigRequest = androidLoad5.getAdPlayerConfigRequest;
                    configurationToken = headerBiddingAdMarkup.getConfigurationToken();
                    Intrinsics.checkNotNullExpressionValue(configurationToken, "getConfigurationToken(...)");
                    if (bannerSize != null) {
                        try {
                            adFormat = AdFormatOuterClass.AdFormat.AD_FORMAT_BANNER;
                        } catch (UnityAdsNetworkException e6) {
                            e = e6;
                            androidLoad2 = androidLoad5;
                            r3 = z2 ? 1 : 0;
                        }
                    } else {
                        adFormat = null;
                    }
                    loadConfigurationInternal2 = unityAdsLoadOptions8.loadConfiguration;
                    this.L$0 = androidLoad5;
                    headerBiddingAdMarkup2 = headerBiddingAdMarkup;
                    this.L$1 = headerBiddingAdMarkup2;
                    this.L$2 = byteString8;
                    this.L$3 = str12;
                    this.L$4 = unityAdsLoadOptions8;
                    this.L$5 = context7;
                    this.L$6 = coroutineScope;
                    this.L$7 = diagnosticAdType8;
                    this.L$8 = tmpAdObject;
                    this.I$0 = z2 ? 1 : 0;
                    androidLoad = androidLoad5;
                    try {
                        this.J$0 = j;
                        this.I$1 = i13;
                        this.label = 3;
                        j = j;
                        obj4 = obj11;
                    } catch (UnityAdsNetworkException e7) {
                        e = e7;
                        j = j;
                    }
                } catch (UnityAdsNetworkException e8) {
                    e = e8;
                    androidLoad = androidLoad5;
                    r3 = z2;
                    androidLoad2 = androidLoad;
                    j2 = j;
                    failure = androidLoad2.handleGatewayException(e);
                    m8186markNowz9LOYto = j2;
                    z = r3;
                    if (!z) {
                    }
                    return failure;
                }
                try {
                    invoke2 = getAdPlayerConfigRequest.invoke(str12, byteString8, configurationToken, adFormat, loadConfigurationInternal2, this);
                    if (invoke2 == obj4) {
                        return obj4;
                    }
                    headerBiddingAdMarkup3 = headerBiddingAdMarkup2;
                    str5 = str12;
                    i4 = z2 ? 1 : 0;
                    context2 = context7;
                    byteString2 = byteString8;
                    diagnosticAdType2 = diagnosticAdType8;
                    androidLoad3 = androidLoad;
                    unityAdsLoadOptions2 = unityAdsLoadOptions8;
                    i5 = i13;
                    j4 = j;
                    adObject2 = tmpAdObject;
                    UniversalRequestOuterClass.UniversalRequest universalRequest2 = (UniversalRequestOuterClass.UniversalRequest) invoke2;
                    getRequestPolicy2 = androidLoad3.getRequestPolicy;
                    RequestPolicy invoke5 = getRequestPolicy2.invoke();
                    j8 = j4;
                    m8186markNowz9LOYto3 = TimeSource$Monotonic.INSTANCE.m8186markNowz9LOYto();
                    Result.Companion companion2 = Result.INSTANCE;
                    gatewayClient2 = androidLoad3.gatewayClient;
                    OperationType operationType2 = OperationType.LOAD_HEADER_BIDDING;
                    this.L$0 = androidLoad3;
                    this.L$1 = headerBiddingAdMarkup3;
                    this.L$2 = byteString2;
                    this.L$3 = str5;
                    this.L$4 = unityAdsLoadOptions2;
                    this.L$5 = context2;
                    this.L$6 = diagnosticAdType2;
                    this.L$7 = adObject2;
                    headerBiddingAdMarkup6 = headerBiddingAdMarkup3;
                    this.L$8 = null;
                    this.I$0 = i4;
                    adObject7 = adObject2;
                    obj8 = obj4;
                    this.J$0 = j8;
                    this.I$1 = i5;
                    this.J$1 = m8186markNowz9LOYto3;
                    this.label = 4;
                    headerBiddingAdMarkup4 = headerBiddingAdMarkup6;
                    byteString6 = byteString2;
                    str9 = str5;
                    unityAdsLoadOptions6 = unityAdsLoadOptions2;
                    context6 = context2;
                    diagnosticAdType6 = diagnosticAdType2;
                    j = j8;
                    adObject6 = adObject7;
                    request$default2 = GatewayClient.DefaultImpls.request$default(gatewayClient2, null, universalRequest2, invoke5, operationType2, this, 1, null);
                    obj7 = obj8;
                    if (request$default2 != obj7) {
                    }
                } catch (UnityAdsNetworkException e9) {
                    e = e9;
                    r3 = z2;
                    androidLoad2 = androidLoad;
                    j2 = j;
                    failure = androidLoad2.handleGatewayException(e);
                    m8186markNowz9LOYto = j2;
                    z = r3;
                    if (!z) {
                    }
                    return failure;
                }
            }
            j2 = j;
            failure = androidLoad2.handleGatewayException(e);
            m8186markNowz9LOYto = j2;
            z = r3;
            if (!z) {
            }
            return failure;
        }
        if (i12 == 1) {
            int i14 = this.I$1;
            j2 = this.J$0;
            r3 = this.I$0;
            AdObject adObject9 = (AdObject) this.L$7;
            DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType9 = (DiagnosticEventRequestOuterClass.DiagnosticAdType) this.L$6;
            Context context8 = (Context) this.L$4;
            UnityAdsLoadOptions unityAdsLoadOptions9 = (UnityAdsLoadOptions) this.L$3;
            String str13 = (String) this.L$2;
            ByteString byteString9 = (ByteString) this.L$1;
            androidLoad3 = (AndroidLoad) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                obj3 = coroutine_suspended;
                str = "native_load_config_failure_time";
                str2 = "native_load_config_success_time";
                i2 = i14;
                i3 = r3;
                str4 = str13;
                invoke = obj;
                byteString = byteString9;
                j3 = j2;
                adObject = adObject9;
                unityAdsLoadOptions = unityAdsLoadOptions9;
                diagnosticAdType = diagnosticAdType9;
                context = context8;
                try {
                    UniversalRequestOuterClass.UniversalRequest universalRequest3 = (UniversalRequestOuterClass.UniversalRequest) invoke;
                    getRequestPolicy = androidLoad3.getRequestPolicy;
                    RequestPolicy invoke42 = getRequestPolicy.invoke();
                    i7 = i3;
                } catch (UnityAdsNetworkException e10) {
                    e = e10;
                    i6 = i3;
                }
                try {
                    m8186markNowz9LOYto2 = TimeSource$Monotonic.INSTANCE.m8186markNowz9LOYto();
                    try {
                        Result.Companion companion3 = Result.INSTANCE;
                        gatewayClient = androidLoad3.gatewayClient;
                        OperationType operationType3 = OperationType.LOAD;
                        this.L$0 = androidLoad3;
                        this.L$1 = byteString;
                        this.L$2 = str4;
                        this.L$3 = unityAdsLoadOptions;
                        this.L$4 = context;
                        this.L$5 = diagnosticAdType;
                        this.L$6 = adObject;
                        byteString4 = byteString;
                        try {
                            this.L$7 = null;
                            try {
                                this.I$0 = i7;
                                this.J$0 = j3;
                                this.I$1 = i2;
                                this.J$1 = m8186markNowz9LOYto2;
                                i7 = i7;
                                this.label = 2;
                                i6 = i7;
                                byteString3 = byteString4;
                                str6 = str4;
                                unityAdsLoadOptions3 = unityAdsLoadOptions;
                                context3 = context;
                                diagnosticAdType3 = diagnosticAdType;
                                obj6 = obj3;
                                adObject3 = adObject;
                                z3 = true;
                            } catch (Throwable th) {
                                th = th;
                                str6 = str4;
                                unityAdsLoadOptions3 = unityAdsLoadOptions;
                                context3 = context;
                                diagnosticAdType3 = diagnosticAdType;
                                obj5 = obj3;
                                adObject3 = adObject;
                                byteString3 = byteString4;
                                z3 = true;
                                i6 = i7;
                            }
                            try {
                                request$default = GatewayClient.DefaultImpls.request$default(gatewayClient, null, universalRequest3, invoke42, operationType3, this, 1, null);
                                obj5 = obj6;
                            } catch (Throwable th2) {
                                th = th2;
                                obj5 = obj6;
                                j5 = m8186markNowz9LOYto2;
                                i8 = i2;
                                androidLoad2 = androidLoad3;
                                adObject4 = adObject3;
                                diagnosticAdType4 = diagnosticAdType3;
                                str7 = str6;
                                Result.Companion companion4 = Result.INSTANCE;
                                m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
                                androidLoad4 = androidLoad2;
                                adObject5 = adObject4;
                                j6 = j3;
                                context4 = context3;
                                unityAdsLoadOptions4 = unityAdsLoadOptions3;
                                TimedValue timedValue = new TimedValue(Result.m8022boximpl(m8023constructorimpl), TimeSource$Monotonic.ValueTimeMark.m8189elapsedNowUwyO8pc(j5), null);
                                Object value = ((Result) timedValue.component1()).getValue();
                                long m8198component2UwyO8pc = timedValue.m8198component2UwyO8pc();
                                sendDiagnosticEvent = androidLoad4.sendDiagnosticEvent;
                                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, Result.m8029isSuccessimpl(value) ? str2 : str, Boxing.boxDouble(Duration.m8166toDoubleimpl(m8198component2UwyO8pc, DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject5, (Integer) null, (ByteString) null, 108, (Object) null);
                                Object value2 = ((Result) timedValue.getValue()).getValue();
                                ResultKt.throwOnFailure(value2);
                                j7 = j6;
                                diagnosticAdType5 = diagnosticAdType4;
                                context5 = context4;
                                unityAdsLoadOptions5 = unityAdsLoadOptions4;
                                i9 = i6;
                                adResponse = ((UniversalResponseOuterClass.UniversalResponse) value2).getPayload().getAdResponse();
                                obj7 = obj5;
                                str8 = str7;
                                byteString5 = byteString3;
                                androidLoad3 = androidLoad4;
                                handleGatewayAdResponse = androidLoad3.handleGatewayAdResponse;
                                Intrinsics.checkNotNull(adResponse);
                                if (i8 != 0) {
                                }
                                this.L$0 = androidLoad3;
                                this.L$1 = byteString5;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.L$4 = null;
                                this.L$5 = null;
                                this.L$6 = null;
                                this.L$7 = null;
                                this.L$8 = null;
                                this.I$0 = i9;
                                this.J$0 = j7;
                                this.label = 5;
                                obj9 = obj7;
                                boolean z4 = r16;
                                j11 = j7;
                                invoke3 = handleGatewayAdResponse.invoke(unityAdsLoadOptions5, byteString5, adResponse, context5, str8, diagnosticAdType5, z4, false, this);
                                if (invoke3 != obj9) {
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            str6 = str4;
                            unityAdsLoadOptions3 = unityAdsLoadOptions;
                            context3 = context;
                            diagnosticAdType3 = diagnosticAdType;
                            obj5 = obj3;
                            adObject3 = adObject;
                            z3 = true;
                            i6 = i7;
                            byteString3 = byteString4;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        str6 = str4;
                        unityAdsLoadOptions3 = unityAdsLoadOptions;
                        context3 = context;
                        diagnosticAdType3 = diagnosticAdType;
                        obj5 = obj3;
                        adObject3 = adObject;
                        i6 = i7;
                        z3 = true;
                        byteString3 = byteString;
                    }
                    if (request$default != obj5) {
                        return obj5;
                    }
                    j6 = j3;
                    j5 = m8186markNowz9LOYto2;
                    i8 = i2;
                    context4 = context3;
                    adObject4 = adObject3;
                    diagnosticAdType4 = diagnosticAdType3;
                    unityAdsLoadOptions4 = unityAdsLoadOptions3;
                    androidLoad4 = androidLoad3;
                    str7 = str6;
                    m8023constructorimpl = Result.m8023constructorimpl((UniversalResponseOuterClass.UniversalResponse) request$default);
                    adObject5 = adObject4;
                    TimedValue timedValue2 = new TimedValue(Result.m8022boximpl(m8023constructorimpl), TimeSource$Monotonic.ValueTimeMark.m8189elapsedNowUwyO8pc(j5), null);
                    Object value3 = ((Result) timedValue2.component1()).getValue();
                    long m8198component2UwyO8pc2 = timedValue2.m8198component2UwyO8pc();
                    sendDiagnosticEvent = androidLoad4.sendDiagnosticEvent;
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, Result.m8029isSuccessimpl(value3) ? str2 : str, Boxing.boxDouble(Duration.m8166toDoubleimpl(m8198component2UwyO8pc2, DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject5, (Integer) null, (ByteString) null, 108, (Object) null);
                    Object value22 = ((Result) timedValue2.getValue()).getValue();
                    ResultKt.throwOnFailure(value22);
                    j7 = j6;
                    diagnosticAdType5 = diagnosticAdType4;
                    context5 = context4;
                    unityAdsLoadOptions5 = unityAdsLoadOptions4;
                    i9 = i6;
                    adResponse = ((UniversalResponseOuterClass.UniversalResponse) value22).getPayload().getAdResponse();
                    obj7 = obj5;
                    str8 = str7;
                    byteString5 = byteString3;
                    androidLoad3 = androidLoad4;
                    handleGatewayAdResponse = androidLoad3.handleGatewayAdResponse;
                    Intrinsics.checkNotNull(adResponse);
                    if (i8 != 0) {
                    }
                    this.L$0 = androidLoad3;
                    this.L$1 = byteString5;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.L$8 = null;
                    this.I$0 = i9;
                    this.J$0 = j7;
                    this.label = 5;
                    obj9 = obj7;
                    boolean z42 = r16;
                    j11 = j7;
                    invoke3 = handleGatewayAdResponse.invoke(unityAdsLoadOptions5, byteString5, adResponse, context5, str8, diagnosticAdType5, z42, false, this);
                    if (invoke3 != obj9) {
                    }
                } catch (UnityAdsNetworkException e11) {
                    e = e11;
                    i6 = i7;
                    j2 = j3;
                    androidLoad2 = androidLoad3;
                    r3 = i6;
                    failure = androidLoad2.handleGatewayException(e);
                    m8186markNowz9LOYto = j2;
                    z = r3;
                    if (!z) {
                    }
                    return failure;
                }
            } catch (UnityAdsNetworkException e12) {
                e = e12;
                androidLoad2 = androidLoad3;
                failure = androidLoad2.handleGatewayException(e);
                m8186markNowz9LOYto = j2;
                z = r3;
                if (!z) {
                }
                return failure;
            }
        } else {
            if (i12 != 2) {
                if (i12 == 3) {
                    int i15 = this.I$1;
                    j2 = this.J$0;
                    r3 = this.I$0;
                    AdObject adObject10 = (AdObject) this.L$8;
                    DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType10 = (DiagnosticEventRequestOuterClass.DiagnosticAdType) this.L$7;
                    Context context9 = (Context) this.L$5;
                    UnityAdsLoadOptions unityAdsLoadOptions10 = (UnityAdsLoadOptions) this.L$4;
                    String str14 = (String) this.L$3;
                    ByteString byteString10 = (ByteString) this.L$2;
                    HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup8 = (HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup) this.L$1;
                    AndroidLoad androidLoad6 = (AndroidLoad) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        str3 = "getAdData(...)";
                        str = "native_load_config_failure_time";
                        str2 = "native_load_config_success_time";
                        i5 = i15;
                        z3 = true;
                        i4 = r3;
                        byteString2 = byteString10;
                        adObject2 = adObject10;
                        str5 = str14;
                        androidLoad3 = androidLoad6;
                        invoke2 = obj;
                        headerBiddingAdMarkup3 = headerBiddingAdMarkup8;
                        obj4 = coroutine_suspended;
                        j4 = j2;
                        diagnosticAdType2 = diagnosticAdType10;
                        unityAdsLoadOptions2 = unityAdsLoadOptions10;
                        context2 = context9;
                        try {
                            UniversalRequestOuterClass.UniversalRequest universalRequest22 = (UniversalRequestOuterClass.UniversalRequest) invoke2;
                            getRequestPolicy2 = androidLoad3.getRequestPolicy;
                            RequestPolicy invoke52 = getRequestPolicy2.invoke();
                            j8 = j4;
                        } catch (UnityAdsNetworkException e13) {
                            e = e13;
                            j = j4;
                        }
                    } catch (UnityAdsNetworkException e14) {
                        e = e14;
                        androidLoad2 = androidLoad6;
                    }
                    try {
                        m8186markNowz9LOYto3 = TimeSource$Monotonic.INSTANCE.m8186markNowz9LOYto();
                        try {
                            Result.Companion companion22 = Result.INSTANCE;
                            gatewayClient2 = androidLoad3.gatewayClient;
                            OperationType operationType22 = OperationType.LOAD_HEADER_BIDDING;
                            this.L$0 = androidLoad3;
                            this.L$1 = headerBiddingAdMarkup3;
                            this.L$2 = byteString2;
                            this.L$3 = str5;
                            this.L$4 = unityAdsLoadOptions2;
                            this.L$5 = context2;
                            this.L$6 = diagnosticAdType2;
                            this.L$7 = adObject2;
                            headerBiddingAdMarkup6 = headerBiddingAdMarkup3;
                        } catch (Throwable th5) {
                            th = th5;
                            byteString6 = byteString2;
                            str9 = str5;
                            unityAdsLoadOptions6 = unityAdsLoadOptions2;
                            context6 = context2;
                            diagnosticAdType6 = diagnosticAdType2;
                            j = j8;
                            headerBiddingAdMarkup4 = headerBiddingAdMarkup3;
                        }
                        try {
                            this.L$8 = null;
                            this.I$0 = i4;
                            adObject7 = adObject2;
                            obj8 = obj4;
                            try {
                                this.J$0 = j8;
                                this.I$1 = i5;
                                this.J$1 = m8186markNowz9LOYto3;
                                this.label = 4;
                                headerBiddingAdMarkup4 = headerBiddingAdMarkup6;
                                byteString6 = byteString2;
                                str9 = str5;
                                unityAdsLoadOptions6 = unityAdsLoadOptions2;
                                context6 = context2;
                                diagnosticAdType6 = diagnosticAdType2;
                                j = j8;
                                adObject6 = adObject7;
                                try {
                                    request$default2 = GatewayClient.DefaultImpls.request$default(gatewayClient2, null, universalRequest22, invoke52, operationType22, this, 1, null);
                                    obj7 = obj8;
                                } catch (Throwable th6) {
                                    th = th6;
                                    obj7 = obj8;
                                    r3 = i4;
                                    j9 = m8186markNowz9LOYto3;
                                    androidLoad2 = androidLoad3;
                                    unityAdsLoadOptions7 = unityAdsLoadOptions6;
                                    headerBiddingAdMarkup5 = headerBiddingAdMarkup4;
                                    byteString7 = byteString6;
                                    str10 = str9;
                                    diagnosticAdType7 = diagnosticAdType6;
                                    Result.Companion companion5 = Result.INSTANCE;
                                    m8023constructorimpl2 = Result.m8023constructorimpl(ResultKt.createFailure(th));
                                    androidLoad3 = androidLoad2;
                                    adObject8 = adObject6;
                                    j10 = j;
                                    r3 = r3;
                                    TimedValue timedValue3 = new TimedValue(Result.m8022boximpl(m8023constructorimpl2), TimeSource$Monotonic.ValueTimeMark.m8189elapsedNowUwyO8pc(j9), null);
                                    Object value4 = ((Result) timedValue3.component1()).getValue();
                                    long m8198component2UwyO8pc3 = timedValue3.m8198component2UwyO8pc();
                                    sendDiagnosticEvent2 = androidLoad3.sendDiagnosticEvent;
                                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, !Result.m8029isSuccessimpl(value4) ? str2 : str, Boxing.boxDouble(Duration.m8166toDoubleimpl(m8198component2UwyO8pc3, DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject8, (Integer) null, (ByteString) null, 108, (Object) null);
                                    Object value5 = ((Result) timedValue3.getValue()).getValue();
                                    ResultKt.throwOnFailure(value5);
                                    universalResponse = (UniversalResponseOuterClass.UniversalResponse) value5;
                                    if (!universalResponse.hasError()) {
                                    }
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                str9 = str5;
                                unityAdsLoadOptions6 = unityAdsLoadOptions2;
                                context6 = context2;
                                diagnosticAdType6 = diagnosticAdType2;
                                j = j8;
                                headerBiddingAdMarkup4 = headerBiddingAdMarkup6;
                                adObject6 = adObject7;
                                obj7 = obj8;
                                byteString6 = byteString2;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            str9 = str5;
                            unityAdsLoadOptions6 = unityAdsLoadOptions2;
                            context6 = context2;
                            diagnosticAdType6 = diagnosticAdType2;
                            j = j8;
                            headerBiddingAdMarkup4 = headerBiddingAdMarkup6;
                            byteString6 = byteString2;
                            Object obj12 = obj4;
                            adObject6 = adObject2;
                            obj7 = obj12;
                            r3 = i4;
                            j9 = m8186markNowz9LOYto3;
                            androidLoad2 = androidLoad3;
                            unityAdsLoadOptions7 = unityAdsLoadOptions6;
                            headerBiddingAdMarkup5 = headerBiddingAdMarkup4;
                            byteString7 = byteString6;
                            str10 = str9;
                            diagnosticAdType7 = diagnosticAdType6;
                            Result.Companion companion52 = Result.INSTANCE;
                            m8023constructorimpl2 = Result.m8023constructorimpl(ResultKt.createFailure(th));
                            androidLoad3 = androidLoad2;
                            adObject8 = adObject6;
                            j10 = j;
                            r3 = r3;
                            TimedValue timedValue32 = new TimedValue(Result.m8022boximpl(m8023constructorimpl2), TimeSource$Monotonic.ValueTimeMark.m8189elapsedNowUwyO8pc(j9), null);
                            Object value42 = ((Result) timedValue32.component1()).getValue();
                            long m8198component2UwyO8pc32 = timedValue32.m8198component2UwyO8pc();
                            sendDiagnosticEvent2 = androidLoad3.sendDiagnosticEvent;
                            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, !Result.m8029isSuccessimpl(value42) ? str2 : str, Boxing.boxDouble(Duration.m8166toDoubleimpl(m8198component2UwyO8pc32, DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject8, (Integer) null, (ByteString) null, 108, (Object) null);
                            Object value52 = ((Result) timedValue32.getValue()).getValue();
                            ResultKt.throwOnFailure(value52);
                            universalResponse = (UniversalResponseOuterClass.UniversalResponse) value52;
                            if (!universalResponse.hasError()) {
                            }
                        }
                        if (request$default2 != obj7) {
                            return obj7;
                        }
                        i10 = i4;
                        j9 = m8186markNowz9LOYto3;
                        i11 = i5;
                        unityAdsLoadOptions7 = unityAdsLoadOptions6;
                        headerBiddingAdMarkup5 = headerBiddingAdMarkup4;
                        byteString7 = byteString6;
                        str10 = str9;
                        diagnosticAdType7 = diagnosticAdType6;
                        j10 = j;
                        m8023constructorimpl2 = Result.m8023constructorimpl((UniversalResponseOuterClass.UniversalResponse) request$default2);
                        i5 = i11;
                        r3 = i10;
                        adObject8 = adObject6;
                        TimedValue timedValue322 = new TimedValue(Result.m8022boximpl(m8023constructorimpl2), TimeSource$Monotonic.ValueTimeMark.m8189elapsedNowUwyO8pc(j9), null);
                        Object value422 = ((Result) timedValue322.component1()).getValue();
                        long m8198component2UwyO8pc322 = timedValue322.m8198component2UwyO8pc();
                        sendDiagnosticEvent2 = androidLoad3.sendDiagnosticEvent;
                        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, !Result.m8029isSuccessimpl(value422) ? str2 : str, Boxing.boxDouble(Duration.m8166toDoubleimpl(m8198component2UwyO8pc322, DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject8, (Integer) null, (ByteString) null, 108, (Object) null);
                        Object value522 = ((Result) timedValue322.getValue()).getValue();
                        ResultKt.throwOnFailure(value522);
                        universalResponse = (UniversalResponseOuterClass.UniversalResponse) value522;
                        if (!universalResponse.hasError()) {
                        }
                    } catch (UnityAdsNetworkException e15) {
                        e = e15;
                        j = j8;
                        r3 = i4;
                        androidLoad2 = androidLoad3;
                        j2 = j;
                        failure = androidLoad2.handleGatewayException(e);
                        m8186markNowz9LOYto = j2;
                        z = r3;
                        if (!z) {
                        }
                        return failure;
                    }
                } else if (i12 == 4) {
                    j9 = this.J$1;
                    i11 = this.I$1;
                    j10 = this.J$0;
                    i10 = this.I$0;
                    AdObject adObject11 = (AdObject) this.L$7;
                    diagnosticAdType7 = (DiagnosticEventRequestOuterClass.DiagnosticAdType) this.L$6;
                    Context context10 = (Context) this.L$5;
                    unityAdsLoadOptions7 = (UnityAdsLoadOptions) this.L$4;
                    str10 = (String) this.L$3;
                    byteString7 = (ByteString) this.L$2;
                    HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup9 = (HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup) this.L$1;
                    AndroidLoad androidLoad7 = (AndroidLoad) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        request$default2 = obj;
                        z3 = true;
                        str3 = "getAdData(...)";
                        str = "native_load_config_failure_time";
                        str2 = "native_load_config_success_time";
                        headerBiddingAdMarkup5 = headerBiddingAdMarkup9;
                        androidLoad3 = androidLoad7;
                        adObject6 = adObject11;
                        obj7 = coroutine_suspended;
                        context6 = context10;
                        try {
                            m8023constructorimpl2 = Result.m8023constructorimpl((UniversalResponseOuterClass.UniversalResponse) request$default2);
                            i5 = i11;
                            r3 = i10;
                            adObject8 = adObject6;
                        } catch (Throwable th9) {
                            th = th9;
                            i5 = i11;
                            j = j10;
                            r3 = i10;
                            androidLoad2 = androidLoad3;
                            try {
                                Result.Companion companion522 = Result.INSTANCE;
                                m8023constructorimpl2 = Result.m8023constructorimpl(ResultKt.createFailure(th));
                                androidLoad3 = androidLoad2;
                                adObject8 = adObject6;
                                j10 = j;
                                r3 = r3;
                                TimedValue timedValue3222 = new TimedValue(Result.m8022boximpl(m8023constructorimpl2), TimeSource$Monotonic.ValueTimeMark.m8189elapsedNowUwyO8pc(j9), null);
                                Object value4222 = ((Result) timedValue3222.component1()).getValue();
                                long m8198component2UwyO8pc3222 = timedValue3222.m8198component2UwyO8pc();
                                sendDiagnosticEvent2 = androidLoad3.sendDiagnosticEvent;
                                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, !Result.m8029isSuccessimpl(value4222) ? str2 : str, Boxing.boxDouble(Duration.m8166toDoubleimpl(m8198component2UwyO8pc3222, DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject8, (Integer) null, (ByteString) null, 108, (Object) null);
                                Object value5222 = ((Result) timedValue3222.getValue()).getValue();
                                ResultKt.throwOnFailure(value5222);
                                universalResponse = (UniversalResponseOuterClass.UniversalResponse) value5222;
                                if (!universalResponse.hasError()) {
                                }
                            } catch (UnityAdsNetworkException e16) {
                                e = e16;
                            }
                        }
                    } catch (Throwable th10) {
                        th = th10;
                        j = j10;
                        z3 = true;
                        str3 = "getAdData(...)";
                        str = "native_load_config_failure_time";
                        str2 = "native_load_config_success_time";
                        headerBiddingAdMarkup5 = headerBiddingAdMarkup9;
                        androidLoad2 = androidLoad7;
                        i5 = i11;
                        r3 = i10;
                        adObject6 = adObject11;
                        obj7 = coroutine_suspended;
                        context6 = context10;
                        Result.Companion companion5222 = Result.INSTANCE;
                        m8023constructorimpl2 = Result.m8023constructorimpl(ResultKt.createFailure(th));
                        androidLoad3 = androidLoad2;
                        adObject8 = adObject6;
                        j10 = j;
                        r3 = r3;
                        TimedValue timedValue32222 = new TimedValue(Result.m8022boximpl(m8023constructorimpl2), TimeSource$Monotonic.ValueTimeMark.m8189elapsedNowUwyO8pc(j9), null);
                        Object value42222 = ((Result) timedValue32222.component1()).getValue();
                        long m8198component2UwyO8pc32222 = timedValue32222.m8198component2UwyO8pc();
                        sendDiagnosticEvent2 = androidLoad3.sendDiagnosticEvent;
                        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, !Result.m8029isSuccessimpl(value42222) ? str2 : str, Boxing.boxDouble(Duration.m8166toDoubleimpl(m8198component2UwyO8pc32222, DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject8, (Integer) null, (ByteString) null, 108, (Object) null);
                        Object value52222 = ((Result) timedValue32222.getValue()).getValue();
                        ResultKt.throwOnFailure(value52222);
                        universalResponse = (UniversalResponseOuterClass.UniversalResponse) value52222;
                        if (!universalResponse.hasError()) {
                        }
                    }
                    try {
                        TimedValue timedValue322222 = new TimedValue(Result.m8022boximpl(m8023constructorimpl2), TimeSource$Monotonic.ValueTimeMark.m8189elapsedNowUwyO8pc(j9), null);
                        Object value422222 = ((Result) timedValue322222.component1()).getValue();
                        long m8198component2UwyO8pc322222 = timedValue322222.m8198component2UwyO8pc();
                        sendDiagnosticEvent2 = androidLoad3.sendDiagnosticEvent;
                        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, !Result.m8029isSuccessimpl(value422222) ? str2 : str, Boxing.boxDouble(Duration.m8166toDoubleimpl(m8198component2UwyO8pc322222, DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject8, (Integer) null, (ByteString) null, 108, (Object) null);
                        Object value522222 = ((Result) timedValue322222.getValue()).getValue();
                        ResultKt.throwOnFailure(value522222);
                        universalResponse = (UniversalResponseOuterClass.UniversalResponse) value522222;
                    } catch (UnityAdsNetworkException e17) {
                        e = e17;
                        j2 = j10;
                        androidLoad2 = androidLoad3;
                        failure = androidLoad2.handleGatewayException(e);
                        m8186markNowz9LOYto = j2;
                        z = r3;
                        if (!z) {
                        }
                        return failure;
                    }
                    if (!universalResponse.hasError()) {
                        ErrorOuterClass.PublicErrorCode errorCode = universalResponse.getError().getErrorCode();
                        Intrinsics.checkNotNullExpressionValue(errorCode, "getErrorCode(...)");
                        ErrorOuterClass.PublicErrorCode errorCode2 = universalResponse.getError().getErrorCode();
                        if (errorCode2 != null) {
                            str11 = UnityAdsErrorKt.getLoadErrorMsg(errorCode2);
                            if (str11 == null) {
                            }
                            String str15 = str11;
                            String errorText = universalResponse.getError().getErrorText();
                            ErrorOuterClass.Error error = universalResponse.getError();
                            Intrinsics.checkNotNullExpressionValue(error, "getError(...)");
                            failure = new LoadResult.Failure(errorCode, str15, null, "gateway", errorText, ErrorExtensionsKt.getErrorTokenOrNull(error), 4, null);
                            z = r3;
                            m8186markNowz9LOYto = j10;
                            if (!z) {
                                sessionRepository2 = this.this$0.sessionRepository;
                                sessionRepository2.setLastLoadLatency((int) TimeExtensionsKt.elapsedMillis(TimeSource$Monotonic.ValueTimeMark.m8187boximpl(m8186markNowz9LOYto)));
                                if (failure instanceof LoadResult.Success) {
                                    sessionRepository5 = this.this$0.sessionRepository;
                                    sessionRepository5.incrementSuccessCount();
                                } else {
                                    if (!(failure instanceof LoadResult.Failure)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    sessionRepository3 = this.this$0.sessionRepository;
                                    sessionRepository3.incrementAllErrorsCount();
                                    isCachePhaseFailure = this.this$0.isCachePhaseFailure((LoadResult.Failure) failure);
                                    if (isCachePhaseFailure) {
                                        sessionRepository4 = this.this$0.sessionRepository;
                                        sessionRepository4.incrementCacheTimeoutErrorsCount();
                                    }
                                }
                            }
                            return failure;
                        }
                        str11 = UnityAdsConstants.Messages.MSG_INTERNAL_ERROR;
                        String str152 = str11;
                        String errorText2 = universalResponse.getError().getErrorText();
                        ErrorOuterClass.Error error2 = universalResponse.getError();
                        Intrinsics.checkNotNullExpressionValue(error2, "getError(...)");
                        failure = new LoadResult.Failure(errorCode, str152, null, "gateway", errorText2, ErrorExtensionsKt.getErrorTokenOrNull(error2), 4, null);
                        z = r3;
                        m8186markNowz9LOYto = j10;
                        if (!z) {
                        }
                        return failure;
                    }
                    AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse adPlayerConfigResponse = universalResponse.getPayload().getAdPlayerConfigResponse();
                    AdResponseKt.Dsl.Companion companion6 = AdResponseKt.Dsl.INSTANCE;
                    AdResponseOuterClass.AdResponse.Builder newBuilder = AdResponseOuterClass.AdResponse.newBuilder();
                    Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
                    AdResponseKt.Dsl _create = companion6._create(newBuilder);
                    ByteString adData = headerBiddingAdMarkup5.getAdData();
                    String str16 = str3;
                    Intrinsics.checkNotNullExpressionValue(adData, str16);
                    _create.setAdData(adData);
                    _create.setAdDataVersion(headerBiddingAdMarkup5.getAdDataVersion());
                    ByteString trackingToken = adPlayerConfigResponse.getTrackingToken();
                    Intrinsics.checkNotNullExpressionValue(trackingToken, "getTrackingToken(...)");
                    _create.setTrackingToken(trackingToken);
                    ByteString impressionConfiguration = adPlayerConfigResponse.getImpressionConfiguration();
                    Intrinsics.checkNotNullExpressionValue(impressionConfiguration, "getImpressionConfiguration(...)");
                    _create.setImpressionConfiguration(impressionConfiguration);
                    _create.setImpressionConfigurationVersion(adPlayerConfigResponse.getImpressionConfigurationVersion());
                    WebviewConfiguration.WebViewConfiguration webviewConfiguration = adPlayerConfigResponse.getWebviewConfiguration();
                    Intrinsics.checkNotNullExpressionValue(webviewConfiguration, "getWebviewConfiguration(...)");
                    _create.setWebviewConfiguration(webviewConfiguration);
                    ByteString adDataRefreshToken = adPlayerConfigResponse.getAdDataRefreshToken();
                    Intrinsics.checkNotNullExpressionValue(adDataRefreshToken, "getAdDataRefreshToken(...)");
                    _create.setAdDataRefreshToken(adDataRefreshToken);
                    CampaignMetadataOuterClass.CampaignMetadata campaignMetadata = adPlayerConfigResponse.getCampaignMetadata();
                    Intrinsics.checkNotNullExpressionValue(campaignMetadata, "getCampaignMetadata(...)");
                    _create.setCampaignMetadata(campaignMetadata);
                    if (adPlayerConfigResponse.hasError()) {
                        ErrorOuterClass.Error error3 = adPlayerConfigResponse.getError();
                        Intrinsics.checkNotNullExpressionValue(error3, "getError(...)");
                        _create.setError(error3);
                    }
                    ByteString adData2 = adPlayerConfigResponse.getAdData();
                    Intrinsics.checkNotNullExpressionValue(adData2, str16);
                    if (ByteStringsKt.isNotEmpty(adData2)) {
                        ByteString adData3 = adPlayerConfigResponse.getAdData();
                        Intrinsics.checkNotNullExpressionValue(adData3, str16);
                        _create.setAdData(adData3);
                        _create.setAdDataVersion(adPlayerConfigResponse.getAdDataVersion());
                    }
                    j7 = j10;
                    diagnosticAdType5 = diagnosticAdType7;
                    unityAdsLoadOptions5 = unityAdsLoadOptions7;
                    str8 = str10;
                    context5 = context6;
                    adResponse = _create._build();
                    byteString5 = byteString7;
                    int i16 = i5;
                    i9 = r3;
                    i8 = i16;
                    try {
                        handleGatewayAdResponse = androidLoad3.handleGatewayAdResponse;
                        Intrinsics.checkNotNull(adResponse);
                        boolean z5 = i8 != 0 ? z3 : false;
                        this.L$0 = androidLoad3;
                        this.L$1 = byteString5;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.L$6 = null;
                        this.L$7 = null;
                        this.L$8 = null;
                        this.I$0 = i9;
                        this.J$0 = j7;
                        this.label = 5;
                        obj9 = obj7;
                        boolean z422 = z5;
                        j11 = j7;
                    } catch (UnityAdsNetworkException e18) {
                        e = e18;
                        j11 = j7;
                    }
                    try {
                        invoke3 = handleGatewayAdResponse.invoke(unityAdsLoadOptions5, byteString5, adResponse, context5, str8, diagnosticAdType5, z422, false, this);
                        if (invoke3 != obj9) {
                            return obj9;
                        }
                        r3 = i9;
                        androidLoad2 = androidLoad3;
                    } catch (UnityAdsNetworkException e19) {
                        e = e19;
                        r3 = i9;
                        androidLoad2 = androidLoad3;
                        j2 = j11;
                        failure = androidLoad2.handleGatewayException(e);
                        m8186markNowz9LOYto = j2;
                        z = r3;
                        if (!z) {
                        }
                        return failure;
                    }
                } else {
                    if (i12 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j2 = this.J$0;
                    r3 = this.I$0;
                    byteString5 = (ByteString) this.L$1;
                    androidLoad2 = (AndroidLoad) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        j11 = j2;
                        invoke3 = obj;
                        r3 = r3;
                    } catch (UnityAdsNetworkException e20) {
                        e = e20;
                    }
                }
                failure = androidLoad2.handleGatewayException(e);
                m8186markNowz9LOYto = j2;
                z = r3;
                if (!z) {
                }
                return failure;
            }
            j5 = this.J$1;
            i8 = this.I$1;
            j6 = this.J$0;
            int i17 = this.I$0;
            adObject4 = (AdObject) this.L$6;
            diagnosticAdType4 = (DiagnosticEventRequestOuterClass.DiagnosticAdType) this.L$5;
            context4 = (Context) this.L$4;
            unityAdsLoadOptions4 = (UnityAdsLoadOptions) this.L$3;
            str7 = (String) this.L$2;
            byteString3 = (ByteString) this.L$1;
            androidLoad4 = (AndroidLoad) this.L$0;
            try {
                try {
                    ResultKt.throwOnFailure(obj);
                    request$default = obj;
                    i6 = i17;
                    obj5 = coroutine_suspended;
                    str = "native_load_config_failure_time";
                    str2 = "native_load_config_success_time";
                    z3 = true;
                    try {
                        m8023constructorimpl = Result.m8023constructorimpl((UniversalResponseOuterClass.UniversalResponse) request$default);
                        adObject5 = adObject4;
                    } catch (Throwable th11) {
                        th = th11;
                        context3 = context4;
                        unityAdsLoadOptions3 = unityAdsLoadOptions4;
                        j3 = j6;
                        androidLoad2 = androidLoad4;
                        try {
                            Result.Companion companion42 = Result.INSTANCE;
                            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
                            androidLoad4 = androidLoad2;
                            adObject5 = adObject4;
                            j6 = j3;
                            context4 = context3;
                            unityAdsLoadOptions4 = unityAdsLoadOptions3;
                            TimedValue timedValue22 = new TimedValue(Result.m8022boximpl(m8023constructorimpl), TimeSource$Monotonic.ValueTimeMark.m8189elapsedNowUwyO8pc(j5), null);
                            Object value32 = ((Result) timedValue22.component1()).getValue();
                            long m8198component2UwyO8pc22 = timedValue22.m8198component2UwyO8pc();
                            sendDiagnosticEvent = androidLoad4.sendDiagnosticEvent;
                            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, Result.m8029isSuccessimpl(value32) ? str2 : str, Boxing.boxDouble(Duration.m8166toDoubleimpl(m8198component2UwyO8pc22, DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject5, (Integer) null, (ByteString) null, 108, (Object) null);
                            Object value222 = ((Result) timedValue22.getValue()).getValue();
                            ResultKt.throwOnFailure(value222);
                            j7 = j6;
                            diagnosticAdType5 = diagnosticAdType4;
                            context5 = context4;
                            unityAdsLoadOptions5 = unityAdsLoadOptions4;
                            i9 = i6;
                            adResponse = ((UniversalResponseOuterClass.UniversalResponse) value222).getPayload().getAdResponse();
                            obj7 = obj5;
                            str8 = str7;
                            byteString5 = byteString3;
                            androidLoad3 = androidLoad4;
                            handleGatewayAdResponse = androidLoad3.handleGatewayAdResponse;
                            Intrinsics.checkNotNull(adResponse);
                            if (i8 != 0) {
                            }
                            this.L$0 = androidLoad3;
                            this.L$1 = byteString5;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.L$5 = null;
                            this.L$6 = null;
                            this.L$7 = null;
                            this.L$8 = null;
                            this.I$0 = i9;
                            this.J$0 = j7;
                            this.label = 5;
                            obj9 = obj7;
                            boolean z4222 = z5;
                            j11 = j7;
                            invoke3 = handleGatewayAdResponse.invoke(unityAdsLoadOptions5, byteString5, adResponse, context5, str8, diagnosticAdType5, z4222, false, this);
                            if (invoke3 != obj9) {
                            }
                        } catch (UnityAdsNetworkException e21) {
                            e = e21;
                            j2 = j3;
                            r3 = i6;
                            failure = androidLoad2.handleGatewayException(e);
                            m8186markNowz9LOYto = j2;
                            z = r3;
                            if (!z) {
                            }
                            return failure;
                        }
                    }
                } catch (Throwable th12) {
                    th = th12;
                    i6 = i17;
                    context3 = context4;
                    unityAdsLoadOptions3 = unityAdsLoadOptions4;
                    obj5 = coroutine_suspended;
                    str = "native_load_config_failure_time";
                    str2 = "native_load_config_success_time";
                    z3 = true;
                    j3 = j6;
                    androidLoad2 = androidLoad4;
                    Result.Companion companion422 = Result.INSTANCE;
                    m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
                    androidLoad4 = androidLoad2;
                    adObject5 = adObject4;
                    j6 = j3;
                    context4 = context3;
                    unityAdsLoadOptions4 = unityAdsLoadOptions3;
                    TimedValue timedValue222 = new TimedValue(Result.m8022boximpl(m8023constructorimpl), TimeSource$Monotonic.ValueTimeMark.m8189elapsedNowUwyO8pc(j5), null);
                    Object value322 = ((Result) timedValue222.component1()).getValue();
                    long m8198component2UwyO8pc222 = timedValue222.m8198component2UwyO8pc();
                    sendDiagnosticEvent = androidLoad4.sendDiagnosticEvent;
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, Result.m8029isSuccessimpl(value322) ? str2 : str, Boxing.boxDouble(Duration.m8166toDoubleimpl(m8198component2UwyO8pc222, DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject5, (Integer) null, (ByteString) null, 108, (Object) null);
                    Object value2222 = ((Result) timedValue222.getValue()).getValue();
                    ResultKt.throwOnFailure(value2222);
                    j7 = j6;
                    diagnosticAdType5 = diagnosticAdType4;
                    context5 = context4;
                    unityAdsLoadOptions5 = unityAdsLoadOptions4;
                    i9 = i6;
                    adResponse = ((UniversalResponseOuterClass.UniversalResponse) value2222).getPayload().getAdResponse();
                    obj7 = obj5;
                    str8 = str7;
                    byteString5 = byteString3;
                    androidLoad3 = androidLoad4;
                    handleGatewayAdResponse = androidLoad3.handleGatewayAdResponse;
                    Intrinsics.checkNotNull(adResponse);
                    if (i8 != 0) {
                    }
                    this.L$0 = androidLoad3;
                    this.L$1 = byteString5;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.L$8 = null;
                    this.I$0 = i9;
                    this.J$0 = j7;
                    this.label = 5;
                    obj9 = obj7;
                    boolean z42222 = z5;
                    j11 = j7;
                    invoke3 = handleGatewayAdResponse.invoke(unityAdsLoadOptions5, byteString5, adResponse, context5, str8, diagnosticAdType5, z42222, false, this);
                    if (invoke3 != obj9) {
                    }
                }
                TimedValue timedValue2222 = new TimedValue(Result.m8022boximpl(m8023constructorimpl), TimeSource$Monotonic.ValueTimeMark.m8189elapsedNowUwyO8pc(j5), null);
                Object value3222 = ((Result) timedValue2222.component1()).getValue();
                long m8198component2UwyO8pc2222 = timedValue2222.m8198component2UwyO8pc();
                sendDiagnosticEvent = androidLoad4.sendDiagnosticEvent;
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, Result.m8029isSuccessimpl(value3222) ? str2 : str, Boxing.boxDouble(Duration.m8166toDoubleimpl(m8198component2UwyO8pc2222, DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject5, (Integer) null, (ByteString) null, 108, (Object) null);
                Object value22222 = ((Result) timedValue2222.getValue()).getValue();
                ResultKt.throwOnFailure(value22222);
                j7 = j6;
                diagnosticAdType5 = diagnosticAdType4;
                context5 = context4;
                unityAdsLoadOptions5 = unityAdsLoadOptions4;
                i9 = i6;
                adResponse = ((UniversalResponseOuterClass.UniversalResponse) value22222).getPayload().getAdResponse();
                obj7 = obj5;
                str8 = str7;
                byteString5 = byteString3;
                androidLoad3 = androidLoad4;
                handleGatewayAdResponse = androidLoad3.handleGatewayAdResponse;
                Intrinsics.checkNotNull(adResponse);
                if (i8 != 0) {
                }
                this.L$0 = androidLoad3;
                this.L$1 = byteString5;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.I$0 = i9;
                this.J$0 = j7;
                this.label = 5;
                obj9 = obj7;
                boolean z422222 = z5;
                j11 = j7;
                invoke3 = handleGatewayAdResponse.invoke(unityAdsLoadOptions5, byteString5, adResponse, context5, str8, diagnosticAdType5, z422222, false, this);
                if (invoke3 != obj9) {
                }
            } catch (UnityAdsNetworkException e22) {
                e = e22;
                j2 = j6;
                androidLoad2 = androidLoad4;
                r3 = i6;
                failure = androidLoad2.handleGatewayException(e);
                m8186markNowz9LOYto = j2;
                z = r3;
                if (!z) {
                }
                return failure;
            }
        }
        Object obj13 = (LoadResult) invoke3;
        if (obj13 instanceof LoadResult.Success) {
            adRepository = androidLoad2.adRepository;
            AdObject ad = adRepository.getAd(byteString5);
            obj10 = ad == null ? new LoadResult.Failure(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_UNSPECIFIED, LoadResult.MSG_AD_OBJECT, null, "ad_object_not_found", null, null, 52, null) : new LoadResult.Success(ad);
        } else {
            boolean z6 = obj13 instanceof LoadResult.Failure;
            obj10 = obj13;
            if (!z6) {
                throw new NoWhenBranchMatchedException();
            }
        }
        failure = obj10;
        z = r3;
        m8186markNowz9LOYto = j11;
        if (!z) {
        }
        return failure;
    }
}
