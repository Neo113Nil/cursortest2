package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
public final class zzdi {

    @Nullable
    private static Executor zza;

    public static synchronized Executor zza() {
        Executor executor;
        synchronized (zzdi.class) {
            try {
                if (zza == null) {
                    zza = zzfm.zzg("ExoPlayer:BackgroundExecutor");
                }
                executor = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return executor;
    }
}
