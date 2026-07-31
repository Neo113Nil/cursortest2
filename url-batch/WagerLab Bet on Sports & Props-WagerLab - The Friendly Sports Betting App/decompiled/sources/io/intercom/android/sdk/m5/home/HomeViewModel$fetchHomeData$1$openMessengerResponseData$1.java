package io.intercom.android.sdk.m5.home;

import androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder;
import io.intercom.android.sdk.m5.data.CommonRepository;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: HomeViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lio/intercom/android/sdk/models/OpenMessengerResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.home.HomeViewModel$fetchHomeData$1$openMessengerResponseData$1", f = "HomeViewModel.kt", i = {}, l = {AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class HomeViewModel$fetchHomeData$1$openMessengerResponseData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super OpenMessengerResponse>, Object> {
    int label;
    final /* synthetic */ HomeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeViewModel$fetchHomeData$1$openMessengerResponseData$1(HomeViewModel homeViewModel, Continuation<? super HomeViewModel$fetchHomeData$1$openMessengerResponseData$1> continuation) {
        super(2, continuation);
        this.this$0 = homeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeViewModel$fetchHomeData$1$openMessengerResponseData$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super OpenMessengerResponse> continuation) {
        return ((HomeViewModel$fetchHomeData$1$openMessengerResponseData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CommonRepository commonRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        commonRepository = this.this$0.commonRepository;
        this.label = 1;
        Object openMessenger = commonRepository.openMessenger(this);
        return openMessenger == coroutine_suspended ? coroutine_suspended : openMessenger;
    }
}
