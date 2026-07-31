package com.unity3d.ads.core.domain;

import android.content.Context;
import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAdsErrorKt;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.LoadResult;
import com.unity3d.ads.core.data.model.exception.InitializationException;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.AwaitInitialization;
import com.unity3d.ads.core.domain.GetInitializationState;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LegacyLoadUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/model/LoadResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.LegacyLoadUseCase$invoke$loadResult$1", f = "LegacyLoadUseCase.kt", l = {124, 142, 143}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class LegacyLoadUseCase$invoke$loadResult$1 extends SuspendLambda implements Function2 {
    final /* synthetic */ Context $context;
    final /* synthetic */ AdRequestOuterClass.BannerSize $gatewayBannerSize;
    final /* synthetic */ UnityAdsLoadOptions $loadOptions;
    final /* synthetic */ String $opportunityId;
    final /* synthetic */ String $placement;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ LegacyLoadUseCase this$0;

    /* compiled from: LegacyLoadUseCase.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InitializationState.values().length];
            try {
                iArr[InitializationState.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InitializationState.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InitializationState.NOT_INITIALIZED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InitializationState.INITIALIZING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LegacyLoadUseCase$invoke$loadResult$1(String str, LegacyLoadUseCase legacyLoadUseCase, Context context, String str2, AdRequestOuterClass.BannerSize bannerSize, UnityAdsLoadOptions unityAdsLoadOptions, Continuation continuation) {
        super(2, continuation);
        this.$opportunityId = str;
        this.this$0 = legacyLoadUseCase;
        this.$context = context;
        this.$placement = str2;
        this.$gatewayBannerSize = bannerSize;
        this.$loadOptions = unityAdsLoadOptions;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LegacyLoadUseCase$invoke$loadResult$1(this.$opportunityId, this.this$0, this.$context, this.$placement, this.$gatewayBannerSize, this.$loadOptions, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((LegacyLoadUseCase$invoke$loadResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d7  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AdRepository adRepository;
        String str;
        HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup;
        GetInitializationState getInitializationState;
        Load load;
        Object invoke;
        SessionRepository sessionRepository;
        LoadResult.Failure failure;
        AwaitInitialization awaitInitialization;
        Object invoke$default;
        ByteString byteString;
        HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup2;
        int i;
        Load load2;
        Object invoke2;
        SessionRepository sessionRepository2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
                invoke = obj;
                return (LoadResult) invoke;
            }
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                invoke2 = obj;
                return (LoadResult) invoke2;
            }
            HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup3 = (HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup) this.L$1;
            ByteString byteString2 = (ByteString) this.L$0;
            ResultKt.throwOnFailure(obj);
            headerBiddingAdMarkup2 = headerBiddingAdMarkup3;
            byteString = byteString2;
            invoke$default = obj;
            InitializationState initializationState = (InitializationState) invoke$default;
            i = initializationState != null ? -1 : WhenMappings.$EnumSwitchMapping$0[initializationState.ordinal()];
            if (i == 1) {
                if (i == 2) {
                    sessionRepository2 = this.this$0.sessionRepository;
                    InitializationException initializationError = sessionRepository2.getInitializationError();
                    if (initializationError != null) {
                        ErrorOuterClass.PublicErrorCode errorCode = initializationError.getErrorCode();
                        if (errorCode == null) {
                            errorCode = ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_UNSPECIFIED;
                        }
                        failure = new LoadResult.Failure(errorCode, initializationError.getMessage(), null, initializationError.getReason(), null, null, 52, null);
                        return failure;
                    }
                    return new LoadResult.Failure(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_NOT_INITIALIZED, UnityAdsErrorKt.MSG_BOLD_LOAD_FAIL_SDK_NOT_INITIALIZED, null, "not_initialized", null, null, 52, null);
                }
                return new LoadResult.Failure(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_TIMEOUT, UnityAdsErrorKt.MSG_BOLD_LOAD_FAIL_TIME_OUT, null, "timeout_initialization", null, null, 52, null);
            }
            load2 = this.this$0.load;
            Context context = this.$context;
            String str2 = this.$placement;
            if (str2 == null) {
                str2 = "";
            }
            AdRequestOuterClass.BannerSize bannerSize = this.$gatewayBannerSize;
            UnityAdsLoadOptions unityAdsLoadOptions = this.$loadOptions;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
            invoke2 = load2.invoke(context, str2, byteString, headerBiddingAdMarkup2, bannerSize, unityAdsLoadOptions, this);
            if (invoke2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            return (LoadResult) invoke2;
        }
        ResultKt.throwOnFailure(obj);
        UUID fromString = UUID.fromString(this.$opportunityId);
        Intrinsics.checkNotNullExpressionValue(fromString, "fromString(...)");
        ByteString byteString3 = ProtobufExtensionsKt.toByteString(fromString);
        this.this$0.opportunity = byteString3;
        adRepository = this.this$0.adRepository;
        if (adRepository.hasOpportunityId(byteString3)) {
            new LoadResult.Failure(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_UNSPECIFIED, LoadResult.MSG_OPPORTUNITY_ID_USED, null, "opportunity_id_used", null, null, 52, null);
        }
        LegacyLoadUseCase legacyLoadUseCase = this.this$0;
        str = legacyLoadUseCase.adMarkup;
        headerBiddingAdMarkup = legacyLoadUseCase.getHeaderBiddingAdMarkup(str);
        if (headerBiddingAdMarkup != null) {
            getInitializationState = this.this$0.getInitializationState;
            int i3 = WhenMappings.$EnumSwitchMapping$0[GetInitializationState.DefaultImpls.invoke$default(getInitializationState, false, 1, null).ordinal()];
            if (i3 == 1) {
                load = this.this$0.load;
                Context context2 = this.$context;
                String str3 = this.$placement;
                if (str3 == null) {
                    str3 = "";
                }
                AdRequestOuterClass.BannerSize bannerSize2 = this.$gatewayBannerSize;
                UnityAdsLoadOptions unityAdsLoadOptions2 = this.$loadOptions;
                this.label = 1;
                invoke = load.invoke(context2, str3, byteString3, headerBiddingAdMarkup, bannerSize2, unityAdsLoadOptions2, this);
                if (invoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return (LoadResult) invoke;
            }
            if (i3 == 2) {
                sessionRepository = this.this$0.sessionRepository;
                InitializationException initializationError2 = sessionRepository.getInitializationError();
                if (initializationError2 != null) {
                    ErrorOuterClass.PublicErrorCode errorCode2 = initializationError2.getErrorCode();
                    if (errorCode2 == null) {
                        errorCode2 = ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_UNSPECIFIED;
                    }
                    failure = new LoadResult.Failure(errorCode2, initializationError2.getMessage(), null, initializationError2.getReason(), null, null, 52, null);
                    return failure;
                }
                return new LoadResult.Failure(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_NOT_INITIALIZED, UnityAdsErrorKt.MSG_BOLD_LOAD_FAIL_SDK_NOT_INITIALIZED, null, "not_initialized", null, null, 52, null);
            }
            if (i3 == 3) {
                return new LoadResult.Failure(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_NOT_INITIALIZED, UnityAdsErrorKt.MSG_BOLD_LOAD_FAIL_SDK_NOT_INITIALIZED, null, "not_initialized", null, null, 52, null);
            }
            if (i3 == 4) {
                awaitInitialization = this.this$0.awaitInitialization;
                this.L$0 = byteString3;
                this.L$1 = headerBiddingAdMarkup;
                this.label = 2;
                invoke$default = AwaitInitialization.DefaultImpls.invoke$default(awaitInitialization, 0L, this, 1, null);
                if (invoke$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                byteString = byteString3;
                headerBiddingAdMarkup2 = headerBiddingAdMarkup;
                InitializationState initializationState2 = (InitializationState) invoke$default;
                if (initializationState2 != null) {
                }
                if (i == 1) {
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            ErrorOuterClass.PublicErrorCode publicErrorCode = ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_ADVIEWER;
            return new LoadResult.Failure(publicErrorCode, UnityAdsErrorKt.getLoadErrorMsg(publicErrorCode), null, "invalid_admarkup", null, null, 52, null);
        }
    }
}
