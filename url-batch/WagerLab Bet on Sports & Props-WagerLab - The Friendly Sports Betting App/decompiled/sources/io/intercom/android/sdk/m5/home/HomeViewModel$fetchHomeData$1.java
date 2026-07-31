package io.intercom.android.sdk.m5.home;

import androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.m5.home.data.HomeV2Response;
import io.intercom.android.sdk.m5.home.states.HomeClientState;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: HomeViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.home.HomeViewModel$fetchHomeData$1", f = "HomeViewModel.kt", i = {0, 1}, l = {115, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID}, m = "invokeSuspend", n = {"$this$launch", "homeResponse"}, s = {"L$0", "L$0"})
/* loaded from: classes8.dex */
final class HomeViewModel$fetchHomeData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HomeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeViewModel$fetchHomeData$1(HomeViewModel homeViewModel, Continuation<? super HomeViewModel$fetchHomeData$1> continuation) {
        super(2, continuation);
        this.this$0 = homeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        HomeViewModel$fetchHomeData$1 homeViewModel$fetchHomeData$1 = new HomeViewModel$fetchHomeData$1(this.this$0, continuation);
        homeViewModel$fetchHomeData$1.L$0 = obj;
        return homeViewModel$fetchHomeData$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HomeViewModel$fetchHomeData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0098  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Deferred async$default;
        CoroutineScope coroutineScope;
        Deferred async$default2;
        NetworkResponse networkResponse;
        OpenMessengerResponse openMessengerResponse;
        MutableStateFlow mutableStateFlow;
        Object value;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, new HomeViewModel$fetchHomeData$1$homeResponse$1(this.this$0, null), 3, null);
            this.L$0 = coroutineScope2;
            this.label = 1;
            obj = async$default.await(this);
            if (obj != coroutine_suspended) {
                coroutineScope = coroutineScope2;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            NetworkResponse networkResponse2 = (NetworkResponse) this.L$0;
            ResultKt.throwOnFailure(obj);
            networkResponse = networkResponse2;
            openMessengerResponse = (OpenMessengerResponse) obj;
            mutableStateFlow = this.this$0.clientState;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, HomeClientState.copy$default((HomeClientState) value, networkResponse, openMessengerResponse, false, 4, null)));
            if (networkResponse instanceof NetworkResponse.Success) {
                List<HomeCards> cards = ((HomeV2Response) ((NetworkResponse.Success) networkResponse).getBody()).getCards();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : cards) {
                    if (obj2 instanceof HomeCards.HomeRecentConversationData) {
                        arrayList.add(obj2);
                    }
                }
                HomeViewModel homeViewModel = this.this$0;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    homeViewModel.intercomDataLayer.addConversations(((HomeCards.HomeRecentConversationData) it.next()).getConversations());
                }
            }
            return Unit.INSTANCE;
        }
        CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
        ResultKt.throwOnFailure(obj);
        coroutineScope = coroutineScope3;
        NetworkResponse networkResponse3 = (NetworkResponse) obj;
        async$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new HomeViewModel$fetchHomeData$1$openMessengerResponseData$1(this.this$0, null), 3, null);
        this.L$0 = networkResponse3;
        this.label = 2;
        Object await = async$default2.await(this);
        if (await != coroutine_suspended) {
            networkResponse = networkResponse3;
            obj = await;
            openMessengerResponse = (OpenMessengerResponse) obj;
            mutableStateFlow = this.this$0.clientState;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, HomeClientState.copy$default((HomeClientState) value, networkResponse, openMessengerResponse, false, 4, null)));
            if (networkResponse instanceof NetworkResponse.Success) {
            }
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }
}
