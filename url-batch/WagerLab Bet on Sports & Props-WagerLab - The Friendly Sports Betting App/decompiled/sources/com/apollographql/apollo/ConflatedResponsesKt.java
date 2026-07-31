package com.apollographql.apollo;

import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.MutableExecutionOptions;
import com.apollographql.apollo.api.Operation;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConflatedResponses.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a%\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0005\".\u0010\u0000\u001a\u00020\u0004\"\b\b\u0000\u0010\u0006*\u00020\u0007*\b\u0012\u0004\u0012\u0002H\u00060\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"conflateFetchPolicyInterceptorResponses", "T", "Lcom/apollographql/apollo/api/MutableExecutionOptions;", "conflateResponses", "", "(Lcom/apollographql/apollo/api/MutableExecutionOptions;Z)Ljava/lang/Object;", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "Lcom/apollographql/apollo/api/ApolloRequest;", "getConflateFetchPolicyInterceptorResponses$annotations", "(Lcom/apollographql/apollo/api/ApolloRequest;)V", "getConflateFetchPolicyInterceptorResponses", "(Lcom/apollographql/apollo/api/ApolloRequest;)Z", "apollo-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ConflatedResponsesKt {
    public static /* synthetic */ void getConflateFetchPolicyInterceptorResponses$annotations(ApolloRequest apolloRequest) {
    }

    @Deprecated(message = "Handle each ApolloResponse.exception instead")
    public static final <T> T conflateFetchPolicyInterceptorResponses(MutableExecutionOptions<T> mutableExecutionOptions, boolean z) {
        Intrinsics.checkNotNullParameter(mutableExecutionOptions, "<this>");
        return mutableExecutionOptions.addExecutionContext(new ConflateResponsesContext(z));
    }

    public static final <D extends Operation.Data> boolean getConflateFetchPolicyInterceptorResponses(ApolloRequest<D> apolloRequest) {
        Intrinsics.checkNotNullParameter(apolloRequest, "<this>");
        ConflateResponsesContext conflateResponsesContext = (ConflateResponsesContext) apolloRequest.getExecutionContext().get(ConflateResponsesContext.INSTANCE);
        if (conflateResponsesContext != null) {
            return conflateResponsesContext.getConflateResponses();
        }
        return false;
    }
}
