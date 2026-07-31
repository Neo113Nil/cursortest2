package io.intercom.android.sdk.m5.home;

import io.intercom.android.sdk.m5.data.CommonRepository;
import io.intercom.android.sdk.m5.home.states.HomeUiEffects;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* compiled from: HomeViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.home.HomeViewModel$handleOpening$2", f = "HomeViewModel.kt", i = {}, l = {91, 98}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class HomeViewModel$handleOpening$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ HomeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeViewModel$handleOpening$2(HomeViewModel homeViewModel, Continuation<? super HomeViewModel$handleOpening$2> continuation) {
        super(2, continuation);
        this.this$0 = homeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeViewModel$handleOpening$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HomeViewModel$handleOpening$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
    
        if (r1.emit(r4, r5) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0030, code lost:
    
        if (r6 == r0) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CommonRepository commonRepository;
        List<String> emptyList;
        MutableSharedFlow mutableSharedFlow;
        HomeUiEffects homeUiEffects;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            commonRepository = this.this$0.commonRepository;
            this.label = 1;
            obj = commonRepository.openMessenger(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.hasConversationScreenOpenedDirectlyFromHome = true;
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        OpenMessengerResponse openMessengerResponse = (OpenMessengerResponse) obj;
        if (openMessengerResponse == null || (emptyList = openMessengerResponse.getOpenInboundConversations()) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        this.this$0.fetchHomeData();
        mutableSharedFlow = this.this$0._effect;
        if (!emptyList.isEmpty()) {
            homeUiEffects = new HomeUiEffects.NavigateToConversation((String) CollectionsKt.first((List) emptyList));
        } else {
            homeUiEffects = HomeUiEffects.NavigateToNewConversation.INSTANCE;
        }
        this.label = 2;
    }
}
