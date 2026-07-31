package com.apollographql.apollo.api;

import com.apollographql.apollo.api.http.HttpHeader;
import com.apollographql.apollo.api.http.HttpMethod;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ExecutionOptions.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0005H&¢\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\u00028\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&¢\u0006\u0002\u0010\tJ\u001d\u0010\n\u001a\u00028\u00002\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH&¢\u0006\u0002\u0010\rJ\u001d\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0002\u0010\u0012J\u0017\u0010\u0013\u001a\u00028\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H&¢\u0006\u0002\u0010\u0015J\u0017\u0010\u0016\u001a\u00028\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014H&¢\u0006\u0002\u0010\u0015J\u0017\u0010\u0017\u001a\u00028\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0014H&¢\u0006\u0002\u0010\u0015J\u0017\u0010\u0018\u001a\u00028\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0014H&¢\u0006\u0002\u0010\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/api/MutableExecutionOptions;", "T", "Lcom/apollographql/apollo/api/ExecutionOptions;", "addExecutionContext", "executionContext", "Lcom/apollographql/apollo/api/ExecutionContext;", "(Lcom/apollographql/apollo/api/ExecutionContext;)Ljava/lang/Object;", "httpMethod", "Lcom/apollographql/apollo/api/http/HttpMethod;", "(Lcom/apollographql/apollo/api/http/HttpMethod;)Ljava/lang/Object;", "httpHeaders", "", "Lcom/apollographql/apollo/api/http/HttpHeader;", "(Ljava/util/List;)Ljava/lang/Object;", "addHttpHeader", "name", "", "value", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "sendApqExtensions", "", "(Ljava/lang/Boolean;)Ljava/lang/Object;", "sendDocument", "enableAutoPersistedQueries", "canBeBatched", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface MutableExecutionOptions<T> extends ExecutionOptions {
    T addExecutionContext(ExecutionContext executionContext);

    T addHttpHeader(String name, String value);

    T canBeBatched(Boolean canBeBatched);

    T enableAutoPersistedQueries(Boolean enableAutoPersistedQueries);

    T httpHeaders(List<HttpHeader> httpHeaders);

    T httpMethod(HttpMethod httpMethod);

    T sendApqExtensions(Boolean sendApqExtensions);

    T sendDocument(Boolean sendDocument);
}
