package com.apollographql.apollo.interceptor;

import kotlin.Metadata;

/* compiled from: RetryOnErrorInterceptor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/apollographql/apollo/interceptor/RetryException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class RetryException extends Exception {
    public static final RetryException INSTANCE = new RetryException();

    private RetryException() {
    }
}
