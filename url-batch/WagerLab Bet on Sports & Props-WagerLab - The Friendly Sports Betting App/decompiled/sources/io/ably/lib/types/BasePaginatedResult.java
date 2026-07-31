package io.ably.lib.types;

import io.ably.lib.http.Http;

/* loaded from: classes7.dex */
public interface BasePaginatedResult<T> {
    Http.Request<BasePaginatedResult<T>> current();

    Http.Request<BasePaginatedResult<T>> first();

    boolean hasCurrent();

    boolean hasFirst();

    boolean hasNext();

    boolean isLast();

    T[] items();

    Http.Request<BasePaginatedResult<T>> next();
}
