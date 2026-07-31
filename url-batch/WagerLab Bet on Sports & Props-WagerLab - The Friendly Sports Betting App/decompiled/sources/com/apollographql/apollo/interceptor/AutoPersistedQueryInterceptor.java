package com.apollographql.apollo.interceptor;

import com.apollographql.apollo.AutoPersistedQueryInfo;
import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.Error;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.http.HttpMethod;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: AutoPersistedQueryInterceptor.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J4\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\t0\b\"\b\b\u0000\u0010\n*\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\n0\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J*\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\b\b\u0000\u0010\n*\u00020\u000b*\b\u0012\u0004\u0012\u0002H\n0\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0013\u001a\u00020\u00122\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015H\u0002J\u0018\u0010\u0017\u001a\u00020\u00122\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/apollographql/apollo/interceptor/AutoPersistedQueryInterceptor;", "Lcom/apollographql/apollo/interceptor/ApolloInterceptor;", "httpMethodForHashedQueries", "Lcom/apollographql/apollo/api/http/HttpMethod;", "httpMethodForDocumentQueries", "<init>", "(Lcom/apollographql/apollo/api/http/HttpMethod;Lcom/apollographql/apollo/api/http/HttpMethod;)V", "intercept", "Lkotlinx/coroutines/flow/Flow;", "Lcom/apollographql/apollo/api/ApolloResponse;", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "request", "Lcom/apollographql/apollo/api/ApolloRequest;", "chain", "Lcom/apollographql/apollo/interceptor/ApolloInterceptorChain;", "withAutoPersistedQueryInfo", "hit", "", "isPersistedQueryNotFound", "errors", "", "Lcom/apollographql/apollo/api/Error;", "isPersistedQueryNotSupported", "Companion", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AutoPersistedQueryInterceptor implements ApolloInterceptor {
    public static final String PROTOCOL_NEGOTIATION_ERROR_NOT_SUPPORTED = "PersistedQueryNotSupported";
    public static final String PROTOCOL_NEGOTIATION_ERROR_QUERY_NOT_FOUND = "PersistedQueryNotFound";
    private final HttpMethod httpMethodForDocumentQueries;
    private final HttpMethod httpMethodForHashedQueries;

    public AutoPersistedQueryInterceptor(HttpMethod httpMethodForHashedQueries, HttpMethod httpMethodForDocumentQueries) {
        Intrinsics.checkNotNullParameter(httpMethodForHashedQueries, "httpMethodForHashedQueries");
        Intrinsics.checkNotNullParameter(httpMethodForDocumentQueries, "httpMethodForDocumentQueries");
        this.httpMethodForHashedQueries = httpMethodForHashedQueries;
        this.httpMethodForDocumentQueries = httpMethodForDocumentQueries;
    }

    @Override // com.apollographql.apollo.interceptor.ApolloInterceptor
    public <D extends Operation.Data> Flow<ApolloResponse<D>> intercept(ApolloRequest<D> request, ApolloInterceptorChain chain) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Boolean enableAutoPersistedQueries = request.getEnableAutoPersistedQueries();
        if (!(enableAutoPersistedQueries != null ? enableAutoPersistedQueries.booleanValue() : true)) {
            return chain.proceed(request);
        }
        boolean z = request.getOperation() instanceof Mutation;
        return FlowKt.flow(new AutoPersistedQueryInterceptor$intercept$1(chain, request.newBuilder().httpMethod(z ? HttpMethod.Post : this.httpMethodForHashedQueries).sendDocument((Boolean) false).sendApqExtensions((Boolean) true).build(), this, z, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <D extends Operation.Data> ApolloResponse<D> withAutoPersistedQueryInfo(ApolloResponse<D> apolloResponse, boolean z) {
        return apolloResponse.newBuilder().addExecutionContext(new AutoPersistedQueryInfo(z)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isPersistedQueryNotFound(List<Error> errors) {
        if (errors != null) {
            List<Error> list = errors;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (StringsKt.equals(((Error) it.next()).getMessage(), PROTOCOL_NEGOTIATION_ERROR_QUERY_NOT_FOUND, true)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isPersistedQueryNotSupported(List<Error> errors) {
        if (errors != null) {
            List<Error> list = errors;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (StringsKt.equals(((Error) it.next()).getMessage(), PROTOCOL_NEGOTIATION_ERROR_NOT_SUPPORTED, true)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
