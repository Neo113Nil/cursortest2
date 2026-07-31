package io.intercom.android.sdk.helpcenter.api;

import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.helpcenter.collections.HelpCenterCollection;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: HelpCenterApiWrapper.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterCollections$1", f = "HelpCenterApiWrapper.kt", i = {}, l = {23, 24}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class HelpCenterApiWrapper$fetchHelpCenterCollections$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CollectionRequestCallback $collectionRequestCallback;
    final /* synthetic */ MetricTracker $metricTracker;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HelpCenterApiWrapper$fetchHelpCenterCollections$1(MetricTracker metricTracker, CollectionRequestCallback collectionRequestCallback, Continuation<? super HelpCenterApiWrapper$fetchHelpCenterCollections$1> continuation) {
        super(2, continuation);
        this.$metricTracker = metricTracker;
        this.$collectionRequestCallback = collectionRequestCallback;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HelpCenterApiWrapper$fetchHelpCenterCollections$1(this.$metricTracker, this.$collectionRequestCallback, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HelpCenterApiWrapper$fetchHelpCenterCollections$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain(), new io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterCollections$1.AnonymousClass1((io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse) r8, r7.$metricTracker, r7.$collectionRequestCallback, null), r7) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r8 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.$metricTracker.requestedHelpCenterData(MetricTracker.Place.COLLECTION_LIST);
            this.label = 1;
            obj = HelpCenterApi.DefaultImpls.fetchCollections$default(Injector.get().getHelpCenterApi(), null, this, 1, null);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        this.label = 2;
    }

    /* compiled from: HelpCenterApiWrapper.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterCollections$1$1", f = "HelpCenterApiWrapper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterCollections$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CollectionRequestCallback $collectionRequestCallback;
        final /* synthetic */ NetworkResponse<List<HelpCenterCollection>> $fetchCollectionListResponse;
        final /* synthetic */ MetricTracker $metricTracker;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(NetworkResponse<? extends List<HelpCenterCollection>> networkResponse, MetricTracker metricTracker, CollectionRequestCallback collectionRequestCallback, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$fetchCollectionListResponse = networkResponse;
            this.$metricTracker = metricTracker;
            this.$collectionRequestCallback = collectionRequestCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$fetchCollectionListResponse, this.$metricTracker, this.$collectionRequestCallback, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            NetworkResponse<List<HelpCenterCollection>> networkResponse = this.$fetchCollectionListResponse;
            if (networkResponse instanceof NetworkResponse.ServerError) {
                this.$metricTracker.failedHelpCenter(MetricTracker.Object.HELP_CENTER_DATA_API, MetricTracker.Place.COLLECTION_LIST, String.valueOf(((NetworkResponse.ServerError) networkResponse).getCode()), false);
                this.$collectionRequestCallback.onError(((NetworkResponse.ServerError) this.$fetchCollectionListResponse).getCode());
            } else if ((networkResponse instanceof NetworkResponse.ClientError) || (networkResponse instanceof NetworkResponse.NetworkError)) {
                this.$metricTracker.failedHelpCenter(MetricTracker.Object.HELP_CENTER_DATA_API, MetricTracker.Place.COLLECTION_LIST, null, false);
                this.$collectionRequestCallback.onFailure();
            } else {
                if (!(networkResponse instanceof NetworkResponse.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.$collectionRequestCallback.onComplete((List) ((NetworkResponse.Success) networkResponse).getBody());
            }
            return Unit.INSTANCE;
        }
    }
}
