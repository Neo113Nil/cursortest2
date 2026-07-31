package com.apollographql.apollo.network.http;

import androidx.media3.extractor.ts.TsExtractor;
import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.http.HttpRequest;
import com.apollographql.apollo.api.http.HttpResponse;
import com.apollographql.apollo.internal.MultipartKt;
import com.apollographql.apollo.mpp.UtilsKt;
import com.apollographql.apollo.network.http.HttpNetworkTransport;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: Add missing generic type declarations: [D] */
/* compiled from: HttpNetworkTransport.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\n"}, d2 = {"<anonymous>", "", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/apollographql/apollo/api/ApolloResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.network.http.HttpNetworkTransport$execute$1", f = "HttpNetworkTransport.kt", i = {0, 0}, l = {TsExtractor.TS_SYNC_BYTE, 107}, m = "invokeSuspend", n = {"$this$flow", "millisStart"}, s = {"L$0", "J$0"})
/* loaded from: classes3.dex */
final class HttpNetworkTransport$execute$1<D> extends SuspendLambda implements Function2<FlowCollector<? super ApolloResponse<D>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ CustomScalarAdapters $customScalarAdapters;
    final /* synthetic */ HttpRequest $httpRequest;
    final /* synthetic */ ApolloRequest<D> $request;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HttpNetworkTransport this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpNetworkTransport$execute$1(HttpNetworkTransport httpNetworkTransport, HttpRequest httpRequest, ApolloRequest<D> apolloRequest, CustomScalarAdapters customScalarAdapters, Continuation<? super HttpNetworkTransport$execute$1> continuation) {
        super(2, continuation);
        this.this$0 = httpNetworkTransport;
        this.$httpRequest = httpRequest;
        this.$request = apolloRequest;
        this.$customScalarAdapters = customScalarAdapters;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        HttpNetworkTransport$execute$1 httpNetworkTransport$execute$1 = new HttpNetworkTransport$execute$1(this.this$0, this.$httpRequest, this.$request, this.$customScalarAdapters, continuation);
        httpNetworkTransport$execute$1.L$0 = obj;
        return httpNetworkTransport$execute$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super ApolloResponse<D>> flowCollector, Continuation<? super Unit> continuation) {
        return ((HttpNetworkTransport$execute$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e1, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.emitAll(r3, new com.apollographql.apollo.network.http.HttpNetworkTransport$execute$1$invokeSuspend$$inlined$map$1<>(r8, r9, r10, r11, r12), r14) != r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long currentTimeMillis;
        FlowCollector flowCollector;
        HttpNetworkTransport.EngineInterceptor engineInterceptor;
        Throwable th;
        final HttpResponse httpResponse;
        Flow errorResponse;
        ApolloResponse errorResponse2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector2 = (FlowCollector) this.L$0;
            currentTimeMillis = UtilsKt.currentTimeMillis();
            try {
                List<HttpInterceptor> interceptors = this.this$0.getInterceptors();
                engineInterceptor = this.this$0.engineInterceptor;
                this.L$0 = flowCollector2;
                this.J$0 = currentTimeMillis;
                this.label = 1;
                Object proceed = new DefaultHttpInterceptorChain(CollectionsKt.plus((Collection<? extends HttpNetworkTransport.EngineInterceptor>) interceptors, engineInterceptor), 0).proceed(this.$httpRequest, this);
                if (proceed != coroutine_suspended) {
                    flowCollector = flowCollector2;
                    obj = proceed;
                }
            } catch (Throwable th2) {
                th = th2;
                flowCollector = flowCollector2;
                th = th;
                if (!(th instanceof CancellationException)) {
                    throw th;
                }
                httpResponse = null;
                final long j = currentTimeMillis;
                if (httpResponse != null) {
                }
                final Flow flow = errorResponse;
                final HttpNetworkTransport httpNetworkTransport = this.this$0;
                final ApolloRequest<D> apolloRequest = this.$request;
                this.L$0 = null;
                this.label = 2;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        currentTimeMillis = this.J$0;
        flowCollector = (FlowCollector) this.L$0;
        try {
            ResultKt.throwOnFailure(obj);
        } catch (Throwable th3) {
            th = th3;
            th = th;
            if (!(th instanceof CancellationException)) {
            }
        }
        httpResponse = (HttpResponse) obj;
        th = null;
        final long j2 = currentTimeMillis;
        if (httpResponse != null) {
            HttpNetworkTransport httpNetworkTransport2 = this.this$0;
            Operation<D> operation = this.$request.getOperation();
            Intrinsics.checkNotNull(th);
            errorResponse2 = httpNetworkTransport2.errorResponse(operation, th);
            errorResponse = FlowKt.flowOf(errorResponse2);
        } else {
            int statusCode = httpResponse.getStatusCode();
            if ((200 > statusCode || statusCode >= 300) && !MultipartKt.isGraphQLResponse(httpResponse)) {
                errorResponse = this.this$0.errorResponse(this.$request.getOperation(), httpResponse);
            } else {
                errorResponse = MultipartKt.isMultipart(httpResponse) ? this.this$0.multipleResponses(this.$request.getOperation(), this.$customScalarAdapters, httpResponse) : this.this$0.singleResponse(this.$request.getOperation(), this.$customScalarAdapters, httpResponse);
            }
        }
        final Flow flow2 = errorResponse;
        final HttpNetworkTransport httpNetworkTransport3 = this.this$0;
        final ApolloRequest<D> apolloRequest2 = this.$request;
        this.L$0 = null;
        this.label = 2;
    }
}
