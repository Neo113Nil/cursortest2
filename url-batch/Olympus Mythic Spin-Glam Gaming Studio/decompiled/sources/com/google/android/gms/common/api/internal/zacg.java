package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;

/* compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* loaded from: classes10.dex */
public final class zacg {
    public final RegisterListenerMethod zaa;
    public final UnregisterListenerMethod zab;
    public final Runnable zac;

    public zacg(@NonNull RegisterListenerMethod registerListenerMethod, @NonNull UnregisterListenerMethod unregisterListenerMethod, @NonNull Runnable runnable) {
        this.zaa = registerListenerMethod;
        this.zab = unregisterListenerMethod;
        this.zac = runnable;
    }
}
