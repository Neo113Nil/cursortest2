package com.google.android.gms.internal.ads;

import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzgtm {

    @NotNull
    private final Mutex zza = MutexKt.Mutex$default(false, 1, null);

    @NotNull
    public final Mutex zza() {
        return this.zza;
    }
}
