package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
public final class zzff implements zzdp {
    protected zzff() {
    }

    @Override // com.google.android.gms.internal.ads.zzdp
    public final long zza() {
        return System.currentTimeMillis();
    }

    @Override // com.google.android.gms.internal.ads.zzdp
    public final long zzb() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.internal.ads.zzdp
    public final long zzc() {
        return System.nanoTime();
    }

    @Override // com.google.android.gms.internal.ads.zzdp
    public final zzea zzd(Looper looper, @Nullable Handler.Callback callback) {
        return new zzfh(new Handler(looper, callback));
    }
}
