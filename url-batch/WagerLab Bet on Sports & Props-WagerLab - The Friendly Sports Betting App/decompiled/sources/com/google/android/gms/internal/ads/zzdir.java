package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzdir {
    private zzbft zza;

    public zzdir(zzdic zzdicVar) {
        this.zza = zzdicVar;
    }

    public final synchronized zzbft zza() {
        return this.zza;
    }

    public final synchronized void zzb(zzbft zzbftVar) {
        this.zza = zzbftVar;
    }
}
