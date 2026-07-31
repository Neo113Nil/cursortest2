package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzcv {
    private static Executor zza;

    public static synchronized Executor zza() {
        Executor executor;
        synchronized (zzcv.class) {
            if (zza == null) {
                zza = zzeo.zzf("ExoPlayer:BackgroundExecutor");
            }
            executor = zza;
        }
        return executor;
    }
}
