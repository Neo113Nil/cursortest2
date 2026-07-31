package io.ably.lib.objects;

import io.ably.lib.types.AblyException;

/* loaded from: classes7.dex */
public interface ObjectsCallback<T> {
    void onError(AblyException ablyException);

    void onSuccess(T t);
}
