package com.apollographql.apollo;

import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.internal.ApolloClientListener;
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
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: Add missing generic type declarations: [D] */
/* compiled from: ApolloClient.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\n"}, d2 = {"<anonymous>", "", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/apollographql/apollo/api/ApolloResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.ApolloClient$executeAsFlowInternal$flow$1", f = "ApolloClient.kt", i = {}, l = {262}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class ApolloClient$executeAsFlowInternal$flow$1<D> extends SuspendLambda implements Function2<ProducerScope<? super ApolloResponse<D>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ ApolloRequest<D> $apolloRequest;
    final /* synthetic */ boolean $throwing;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ApolloClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ApolloClient$executeAsFlowInternal$flow$1(ApolloClient apolloClient, ApolloRequest<D> apolloRequest, boolean z, Continuation<? super ApolloClient$executeAsFlowInternal$flow$1> continuation) {
        super(2, continuation);
        this.this$0 = apolloClient;
        this.$apolloRequest = apolloRequest;
        this.$throwing = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ApolloClient$executeAsFlowInternal$flow$1 apolloClient$executeAsFlowInternal$flow$1 = new ApolloClient$executeAsFlowInternal$flow$1(this.this$0, this.$apolloRequest, this.$throwing, continuation);
        apolloClient$executeAsFlowInternal$flow$1.L$0 = obj;
        return apolloClient$executeAsFlowInternal$flow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super ApolloResponse<D>> producerScope, Continuation<? super Unit> continuation) {
        return ((ApolloClient$executeAsFlowInternal$flow$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list;
        List list2;
        ConcurrencyInfo concurrencyInfo;
        List list3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ProducerScope producerScope = (ProducerScope) this.L$0;
                list2 = this.this$0.listeners;
                ApolloRequest<D> apolloRequest = this.$apolloRequest;
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    ((ApolloClientListener) it.next()).requestStarted(apolloRequest);
                }
                concurrencyInfo = this.this$0.concurrencyInfo;
                this.label = 1;
                if (BuildersKt.withContext(concurrencyInfo.getDispatcher(), new AnonymousClass2(this.this$0, this.$apolloRequest, this.$throwing, producerScope, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            list3 = this.this$0.listeners;
            ApolloRequest<D> apolloRequest2 = this.$apolloRequest;
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                ((ApolloClientListener) it2.next()).requestCompleted(apolloRequest2);
            }
            return Unit.INSTANCE;
        } catch (Throwable th) {
            list = this.this$0.listeners;
            ApolloRequest<D> apolloRequest3 = this.$apolloRequest;
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                ((ApolloClientListener) it3.next()).requestCompleted(apolloRequest3);
            }
            throw th;
        }
    }

    /* compiled from: ApolloClient.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.apollographql.apollo.ApolloClient$executeAsFlowInternal$flow$1$2", f = "ApolloClient.kt", i = {}, l = {263}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.apollographql.apollo.ApolloClient$executeAsFlowInternal$flow$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ProducerScope<ApolloResponse<D>> $$this$channelFlow;
        final /* synthetic */ ApolloRequest<D> $apolloRequest;
        final /* synthetic */ boolean $throwing;
        int label;
        final /* synthetic */ ApolloClient this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(ApolloClient apolloClient, ApolloRequest<D> apolloRequest, boolean z, ProducerScope<? super ApolloResponse<D>> producerScope, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = apolloClient;
            this.$apolloRequest = apolloRequest;
            this.$throwing = z;
            this.$$this$channelFlow = producerScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$apolloRequest, this.$throwing, this.$$this$channelFlow, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow apolloResponses$apollo_runtime_release = this.this$0.apolloResponses$apollo_runtime_release(this.$apolloRequest, this.$throwing);
                final ProducerScope<ApolloResponse<D>> producerScope = this.$$this$channelFlow;
                this.label = 1;
                if (apolloResponses$apollo_runtime_release.collect(new FlowCollector() { // from class: com.apollographql.apollo.ApolloClient.executeAsFlowInternal.flow.1.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((ApolloResponse) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(ApolloResponse<D> apolloResponse, Continuation<? super Unit> continuation) {
                        Object send = producerScope.send(apolloResponse, continuation);
                        return send == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? send : Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }
}
