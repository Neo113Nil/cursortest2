package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzdqo {

    @Nullable
    private zzbms zza;

    public zzdqo(zzdpz zzdpzVar) {
        this.zza = zzdpzVar;
    }

    @Nullable
    public final synchronized zzbms zza() {
        return this.zza;
    }

    public final synchronized void zzb(@Nullable zzbms zzbmsVar) {
        this.zza = zzbmsVar;
    }
}
