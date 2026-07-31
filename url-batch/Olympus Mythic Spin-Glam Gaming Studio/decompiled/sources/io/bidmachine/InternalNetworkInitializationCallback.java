package io.bidmachine;

import androidx.annotation.NonNull;

/* loaded from: classes5.dex */
public interface InternalNetworkInitializationCallback {
    void onFail(@NonNull NetworkAdapter networkAdapter, @NonNull String str);

    void onSuccess(@NonNull NetworkAdapter networkAdapter);
}
