package io.bidmachine;

import androidx.annotation.NonNull;

/* loaded from: classes6.dex */
public interface ExpirationListener<T> {
    void onExpired(@NonNull T t);
}
