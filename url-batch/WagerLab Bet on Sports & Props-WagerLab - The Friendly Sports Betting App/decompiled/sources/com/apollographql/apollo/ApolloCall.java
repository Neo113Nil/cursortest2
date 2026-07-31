package com.apollographql.apollo;

import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.ExecutionContext;
import com.apollographql.apollo.api.MutableExecutionOptions;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.Operation.Data;
import com.apollographql.apollo.api.http.HttpHeader;
import com.apollographql.apollo.api.http.HttpMethod;
import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.exception.DefaultApolloException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt__CollectionKt;

/* compiled from: ApolloCall.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00000\u0003B\u001f\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\b\u0010\tB\u001f\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\b\u0010\fJ\u001b\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010.\u001a\u0004\u0018\u00010\u001a¢\u0006\u0002\u00101J\u0016\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$H\u0016J\u001e\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000205H\u0016J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0002\u00101J\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0002\u00101J\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0002\u00101J\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010!\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0002\u00101J\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010*\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0002\u00101J\u001b\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010(\u001a\u0004\u0018\u00010\u001a¢\u0006\u0002\u00101J\f\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\u0012\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000:09J\u0014\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000:09H\u0007J\u0014\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00000:H\u0087@¢\u0006\u0002\u0010=J\u0014\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000:H\u0086@¢\u0006\u0002\u0010=J(\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000:2\u0012\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000:09H\u0082@¢\u0006\u0002\u0010AR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001cR\u0016\u0010!\u001a\u0004\u0018\u00010\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u001cR\u001c\u0010#\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0013\u0010(\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b)\u0010\u001cR\u001c\u0010*\u001a\u0004\u0018\u00010\u001a8FX\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010,\u001a\u0004\b-\u0010\u001cR\u001c\u0010.\u001a\u0004\u0018\u00010\u001a8FX\u0087\u0004¢\u0006\f\u0012\u0004\b/\u0010,\u001a\u0004\b0\u0010\u001c¨\u0006B"}, d2 = {"Lcom/apollographql/apollo/ApolloCall;", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "Lcom/apollographql/apollo/api/MutableExecutionOptions;", "apolloClient", "Lcom/apollographql/apollo/ApolloClient;", "requestBuilder", "Lcom/apollographql/apollo/api/ApolloRequest$Builder;", "<init>", "(Lcom/apollographql/apollo/ApolloClient;Lcom/apollographql/apollo/api/ApolloRequest$Builder;)V", "operation", "Lcom/apollographql/apollo/api/Operation;", "(Lcom/apollographql/apollo/ApolloClient;Lcom/apollographql/apollo/api/Operation;)V", "getApolloClient$apollo_runtime_release", "()Lcom/apollographql/apollo/ApolloClient;", "getOperation", "()Lcom/apollographql/apollo/api/Operation;", "executionContext", "Lcom/apollographql/apollo/api/ExecutionContext;", "getExecutionContext", "()Lcom/apollographql/apollo/api/ExecutionContext;", "httpMethod", "Lcom/apollographql/apollo/api/http/HttpMethod;", "getHttpMethod", "()Lcom/apollographql/apollo/api/http/HttpMethod;", "sendApqExtensions", "", "getSendApqExtensions", "()Ljava/lang/Boolean;", "sendDocument", "getSendDocument", "enableAutoPersistedQueries", "getEnableAutoPersistedQueries", "canBeBatched", "getCanBeBatched", "httpHeaders", "", "Lcom/apollographql/apollo/api/http/HttpHeader;", "getHttpHeaders", "()Ljava/util/List;", "ignoreApolloClientHttpHeaders", "getIgnoreApolloClientHttpHeaders", "retryOnError", "getRetryOnError$annotations", "()V", "getRetryOnError", "failFastIfOffline", "getFailFastIfOffline$annotations", "getFailFastIfOffline", "(Ljava/lang/Boolean;)Lcom/apollographql/apollo/ApolloCall;", "addExecutionContext", "addHttpHeader", "name", "", "value", "copy", "toFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/apollographql/apollo/api/ApolloResponse;", "toFlowV3", "executeV3", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "execute", "singleSuccessOrException", "flow", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ApolloCall<D extends Operation.Data> implements MutableExecutionOptions<ApolloCall<D>> {
    private final ApolloClient apolloClient;
    private final ApolloRequest.Builder<D> requestBuilder;

    public static /* synthetic */ void getFailFastIfOffline$annotations() {
    }

    public static /* synthetic */ void getRetryOnError$annotations() {
    }

    public ApolloCall(ApolloClient apolloClient, ApolloRequest.Builder<D> requestBuilder) {
        Intrinsics.checkNotNullParameter(apolloClient, "apolloClient");
        Intrinsics.checkNotNullParameter(requestBuilder, "requestBuilder");
        this.apolloClient = apolloClient;
        this.requestBuilder = requestBuilder;
    }

    @Override // com.apollographql.apollo.api.MutableExecutionOptions
    public /* bridge */ /* synthetic */ Object httpHeaders(List list) {
        return httpHeaders((List<HttpHeader>) list);
    }

    /* renamed from: getApolloClient$apollo_runtime_release, reason: from getter */
    public final ApolloClient getApolloClient() {
        return this.apolloClient;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ApolloCall(ApolloClient apolloClient, Operation<D> operation) {
        this(apolloClient, new ApolloRequest.Builder(operation));
        Intrinsics.checkNotNullParameter(apolloClient, "apolloClient");
        Intrinsics.checkNotNullParameter(operation, "operation");
    }

    public final Operation<D> getOperation() {
        return this.requestBuilder.getOperation();
    }

    @Override // com.apollographql.apollo.api.ExecutionOptions
    public ExecutionContext getExecutionContext() {
        return this.requestBuilder.getExecutionContext();
    }

    @Override // com.apollographql.apollo.api.ExecutionOptions
    public HttpMethod getHttpMethod() {
        return this.requestBuilder.getHttpMethod();
    }

    @Override // com.apollographql.apollo.api.ExecutionOptions
    public Boolean getSendApqExtensions() {
        return this.requestBuilder.getSendApqExtensions();
    }

    @Override // com.apollographql.apollo.api.ExecutionOptions
    public Boolean getSendDocument() {
        return this.requestBuilder.getSendDocument();
    }

    @Override // com.apollographql.apollo.api.ExecutionOptions
    public Boolean getEnableAutoPersistedQueries() {
        return this.requestBuilder.getEnableAutoPersistedQueries();
    }

    @Override // com.apollographql.apollo.api.ExecutionOptions
    public Boolean getCanBeBatched() {
        return this.requestBuilder.getCanBeBatched();
    }

    @Override // com.apollographql.apollo.api.ExecutionOptions
    public List<HttpHeader> getHttpHeaders() {
        return this.requestBuilder.getHttpHeaders();
    }

    public final Boolean getIgnoreApolloClientHttpHeaders() {
        return this.requestBuilder.getIgnoreApolloClientHttpHeaders();
    }

    public final Boolean getRetryOnError() {
        return this.requestBuilder.getRetryOnError();
    }

    public final Boolean getFailFastIfOffline() {
        return this.requestBuilder.getFailFastIfOffline();
    }

    public final ApolloCall<D> failFastIfOffline(Boolean failFastIfOffline) {
        this.requestBuilder.failFastIfOffline(failFastIfOffline);
        return this;
    }

    @Override // com.apollographql.apollo.api.MutableExecutionOptions
    public ApolloCall<D> addExecutionContext(ExecutionContext executionContext) {
        Intrinsics.checkNotNullParameter(executionContext, "executionContext");
        this.requestBuilder.addExecutionContext(executionContext);
        return this;
    }

    @Override // com.apollographql.apollo.api.MutableExecutionOptions
    public ApolloCall<D> httpMethod(HttpMethod httpMethod) {
        this.requestBuilder.httpMethod(httpMethod);
        return this;
    }

    @Override // com.apollographql.apollo.api.MutableExecutionOptions
    public ApolloCall<D> httpHeaders(List<HttpHeader> httpHeaders) {
        this.requestBuilder.httpHeaders(httpHeaders);
        return this;
    }

    @Override // com.apollographql.apollo.api.MutableExecutionOptions
    public ApolloCall<D> addHttpHeader(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.requestBuilder.addHttpHeader(name, value);
        return this;
    }

    @Override // com.apollographql.apollo.api.MutableExecutionOptions
    public ApolloCall<D> sendApqExtensions(Boolean sendApqExtensions) {
        this.requestBuilder.sendApqExtensions(sendApqExtensions);
        return this;
    }

    @Override // com.apollographql.apollo.api.MutableExecutionOptions
    public ApolloCall<D> sendDocument(Boolean sendDocument) {
        this.requestBuilder.sendDocument(sendDocument);
        return this;
    }

    @Override // com.apollographql.apollo.api.MutableExecutionOptions
    public ApolloCall<D> enableAutoPersistedQueries(Boolean enableAutoPersistedQueries) {
        this.requestBuilder.enableAutoPersistedQueries(enableAutoPersistedQueries);
        return this;
    }

    @Override // com.apollographql.apollo.api.MutableExecutionOptions
    public ApolloCall<D> canBeBatched(Boolean canBeBatched) {
        this.requestBuilder.canBeBatched(canBeBatched);
        return this;
    }

    public final ApolloCall<D> retryOnError(Boolean retryOnError) {
        this.requestBuilder.retryOnError(retryOnError);
        return this;
    }

    public final ApolloCall<D> ignoreApolloClientHttpHeaders(Boolean ignoreApolloClientHttpHeaders) {
        this.requestBuilder.ignoreApolloClientHttpHeaders(ignoreApolloClientHttpHeaders);
        return this;
    }

    public final ApolloCall<D> copy() {
        return new ApolloCall<>(this.apolloClient, this.requestBuilder.build().newBuilder());
    }

    public final Flow<ApolloResponse<D>> toFlow() {
        return this.apolloClient.executeAsFlowInternal$apollo_runtime_release(this.requestBuilder.build(), false);
    }

    @Deprecated(message = "Use toFlow() and handle ApolloResponse.exception instead")
    public final Flow<ApolloResponse<D>> toFlowV3() {
        return ((ApolloCall) ConflatedResponsesKt.conflateFetchPolicyInterceptorResponses(this, true)).apolloClient.executeAsFlowInternal$apollo_runtime_release(this.requestBuilder.build(), true);
    }

    @Deprecated(message = "Use execute() and handle ApolloResponse.exception instead")
    public final Object executeV3(Continuation<? super ApolloResponse<D>> continuation) {
        return singleSuccessOrException(toFlowV3(), continuation);
    }

    public final Object execute(Continuation<? super ApolloResponse<D>> continuation) {
        return singleSuccessOrException(toFlow(), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object singleSuccessOrException(Flow<ApolloResponse<D>> flow, Continuation<? super ApolloResponse<D>> continuation) {
        ApolloCall$singleSuccessOrException$1 apolloCall$singleSuccessOrException$1;
        int i;
        int size;
        if (continuation instanceof ApolloCall$singleSuccessOrException$1) {
            apolloCall$singleSuccessOrException$1 = (ApolloCall$singleSuccessOrException$1) continuation;
            if ((apolloCall$singleSuccessOrException$1.label & Integer.MIN_VALUE) != 0) {
                apolloCall$singleSuccessOrException$1.label -= Integer.MIN_VALUE;
                Object obj = apolloCall$singleSuccessOrException$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = apolloCall$singleSuccessOrException$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    apolloCall$singleSuccessOrException$1.label = 1;
                    obj = FlowKt__CollectionKt.toList$default(flow, null, apolloCall$singleSuccessOrException$1, 1, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : (List) obj) {
                    if (((ApolloResponse) obj2).exception != null) {
                        arrayList.add(obj2);
                    } else {
                        arrayList2.add(obj2);
                    }
                }
                Pair pair = new Pair(arrayList, arrayList2);
                List list = (List) pair.component1();
                List list2 = (List) pair.component2();
                size = list2.size();
                if (size == 0) {
                    if (size == 1) {
                        return (ApolloResponse) CollectionsKt.first(list2);
                    }
                    throw new DefaultApolloException("The operation returned multiple items, use .toFlow() instead of .execute()", null, 2, null);
                }
                int size2 = list.size();
                if (size2 == 0) {
                    throw new DefaultApolloException("The operation did not emit any item, check your interceptor chain", null, 2, null);
                }
                if (size2 == 1) {
                    return (ApolloResponse) CollectionsKt.first(list);
                }
                ApolloResponse apolloResponse = (ApolloResponse) CollectionsKt.first(list);
                ApolloResponse.Builder<D> newBuilder = apolloResponse.newBuilder();
                List drop = CollectionsKt.drop(list, 1);
                ApolloException apolloException = apolloResponse.exception;
                Intrinsics.checkNotNull(apolloException);
                Iterator it = drop.iterator();
                while (it.hasNext()) {
                    ApolloException apolloException2 = ((ApolloResponse) it.next()).exception;
                    Intrinsics.checkNotNull(apolloException2);
                    ExceptionsKt.addSuppressed(apolloException, apolloException2);
                }
                return newBuilder.exception(apolloException).build();
            }
        }
        apolloCall$singleSuccessOrException$1 = new ApolloCall$singleSuccessOrException$1(this, continuation);
        Object obj3 = apolloCall$singleSuccessOrException$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = apolloCall$singleSuccessOrException$1.label;
        if (i != 0) {
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList22 = new ArrayList();
        while (r7.hasNext()) {
        }
        Pair pair2 = new Pair(arrayList3, arrayList22);
        List list3 = (List) pair2.component1();
        List list22 = (List) pair2.component2();
        size = list22.size();
        if (size == 0) {
        }
    }
}
