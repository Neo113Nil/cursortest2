package io.ably.lib.http;

import io.ably.lib.http.HttpCore;
import io.ably.lib.types.AsyncPaginatedResult;
import io.ably.lib.types.Callback;
import io.ably.lib.types.Param;

/* loaded from: classes7.dex */
public class AsyncPaginatedQuery<T> {
    private final BasePaginatedQuery<T> base;

    public AsyncPaginatedQuery(Http http, String str, Param[] paramArr, Param[] paramArr2, HttpCore.BodyHandler<T> bodyHandler) {
        this(http, str, paramArr, paramArr2, null, bodyHandler);
    }

    public AsyncPaginatedQuery(Http http, String str, Param[] paramArr, Param[] paramArr2, HttpCore.RequestBody requestBody, HttpCore.BodyHandler<T> bodyHandler) {
        this.base = new BasePaginatedQuery<>(http, str, paramArr, paramArr2, requestBody, bodyHandler);
    }

    public void get(Callback<AsyncPaginatedResult<T>> callback) {
        this.base.get().async(callback);
    }
}
