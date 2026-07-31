package io.intercom.android.sdk.helpcenter.api;

import io.ably.lib.util.Log;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.helpcenter.sections.HelpCenterCollectionContent;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.metrics.MetricTracker;
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
@DebugMetadata(c = "io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterCollection$1", f = "HelpCenterApiWrapper.kt", i = {}, l = {98, Log.NONE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class HelpCenterApiWrapper$fetchHelpCenterCollection$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CollectionContentRequestCallback $collectionContentRequestCallback;
    final /* synthetic */ String $collectionId;
    final /* synthetic */ MetricTracker $metricTracker;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HelpCenterApiWrapper$fetchHelpCenterCollection$1(MetricTracker metricTracker, String str, CollectionContentRequestCallback collectionContentRequestCallback, Continuation<? super HelpCenterApiWrapper$fetchHelpCenterCollection$1> continuation) {
        super(2, continuation);
        this.$metricTracker = metricTracker;
        this.$collectionId = str;
        this.$collectionContentRequestCallback = collectionContentRequestCallback;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HelpCenterApiWrapper$fetchHelpCenterCollection$1(this.$metricTracker, this.$collectionId, this.$collectionContentRequestCallback, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HelpCenterApiWrapper$fetchHelpCenterCollection$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005e, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain(), new io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterCollection$1.AnonymousClass1((io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse) r11, r10.$metricTracker, r10.$collectionContentRequestCallback, null), r10) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r11 == r0) goto L15;
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
            this.$metricTracker.requestedHelpCenterData(MetricTracker.Place.ARTICLE_LIST);
            this.label = 1;
            obj = HelpCenterApi.DefaultImpls.fetchCollectionDetails$default(Injector.get().getHelpCenterApi(), this.$collectionId, null, this, 2, null);
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
    @DebugMetadata(c = "io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterCollection$1$1", f = "HelpCenterApiWrapper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterCollection$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CollectionContentRequestCallback $collectionContentRequestCallback;
        final /* synthetic */ NetworkResponse<HelpCenterCollectionContent> $fetchSectionsListResponse;
        final /* synthetic */ MetricTracker $metricTracker;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(NetworkResponse<HelpCenterCollectionContent> networkResponse, MetricTracker metricTracker, CollectionContentRequestCallback collectionContentRequestCallback, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$fetchSectionsListResponse = networkResponse;
            this.$metricTracker = metricTracker;
            this.$collectionContentRequestCallback = collectionContentRequestCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$fetchSectionsListResponse, this.$metricTracker, this.$collectionContentRequestCallback, continuation);
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
            NetworkResponse<HelpCenterCollectionContent> networkResponse = this.$fetchSectionsListResponse;
            if (networkResponse instanceof NetworkResponse.ServerError) {
                this.$metricTracker.failedHelpCenter(MetricTracker.Object.HELP_CENTER_DATA_API, MetricTracker.Place.ARTICLE_LIST, String.valueOf(((NetworkResponse.ServerError) networkResponse).getCode()), false);
                this.$collectionContentRequestCallback.onError(((NetworkResponse.ServerError) this.$fetchSectionsListResponse).getCode());
            } else if ((networkResponse instanceof NetworkResponse.ClientError) || (networkResponse instanceof NetworkResponse.NetworkError)) {
                this.$metricTracker.failedHelpCenter(MetricTracker.Object.HELP_CENTER_DATA_API, MetricTracker.Place.ARTICLE_LIST, null, false);
                this.$collectionContentRequestCallback.onFailure();
            } else {
                if (!(networkResponse instanceof NetworkResponse.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.$collectionContentRequestCallback.onComplete((HelpCenterCollectionContent) ((NetworkResponse.Success) networkResponse).getBody());
            }
            return Unit.INSTANCE;
        }
    }
}
