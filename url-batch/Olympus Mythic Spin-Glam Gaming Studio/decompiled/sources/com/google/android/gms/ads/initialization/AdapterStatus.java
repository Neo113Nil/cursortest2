package com.google.android.gms.ads.initialization;

import androidx.annotation.NonNull;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes12.dex */
public interface AdapterStatus {

    /* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
    public enum State {
        NOT_READY,
        READY
    }

    @NonNull
    String getDescription();

    @NonNull
    State getInitializationState();

    int getLatency();
}
