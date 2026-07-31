package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import android.os.Build;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzqj {
    public static final zzqj zza;
    public final String zzb;

    @Nullable
    private final zzqi zzc;

    static {
        new zzqj("");
        zza = new zzqj("preload");
    }

    public zzqj(String str) {
        this.zzb = str;
        this.zzc = Build.VERSION.SDK_INT >= 31 ? new zzqi() : null;
    }

    @RequiresApi
    public final synchronized LogSessionId zza() {
        zzqi zzqiVar;
        zzqiVar = this.zzc;
        if (zzqiVar == null) {
            throw null;
        }
        return zzqiVar.zza;
    }

    @RequiresApi
    public final synchronized void zzb(LogSessionId logSessionId) {
        LogSessionId logSessionId2;
        boolean equals;
        zzqi zzqiVar = this.zzc;
        if (zzqiVar == null) {
            throw null;
        }
        LogSessionId logSessionId3 = zzqiVar.zza;
        logSessionId2 = LogSessionId.LOG_SESSION_ID_NONE;
        equals = logSessionId3.equals(logSessionId2);
        zzguk.zzi(equals);
        zzqiVar.zza = logSessionId;
    }
}
