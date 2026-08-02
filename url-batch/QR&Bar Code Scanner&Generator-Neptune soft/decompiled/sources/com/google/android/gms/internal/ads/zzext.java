package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzext implements zzeve {
    private final zzcfy zza;
    private final boolean zzb;
    private final boolean zzc;
    private final ScheduledExecutorService zzd;
    private final zzfzq zze;
    private final String zzf;
    private final zzcfn zzg;

    zzext(zzcfy zzcfyVar, boolean z, boolean z2, zzcfn zzcfnVar, zzfzq zzfzqVar, String str, ScheduledExecutorService scheduledExecutorService, byte[] bArr) {
        this.zza = zzcfyVar;
        this.zzb = z;
        this.zzc = z2;
        this.zzg = zzcfnVar;
        this.zze = zzfzqVar;
        this.zzf = str;
        this.zzd = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final int zza() {
        return 50;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final zzfzp zzb() {
        return (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzgm)).booleanValue() && this.zzc) ? zzfzg.zzi(null) : !this.zzb ? zzfzg.zzi(null) : zzfzg.zzf(zzfzg.zzo(zzfzg.zzm(zzfzg.zzi(null), new zzfsm() { // from class: com.google.android.gms.internal.ads.zzexr
            @Override // com.google.android.gms.internal.ads.zzfsm
            public final Object apply(Object obj) {
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                return new zzexu(str);
            }
        }, this.zze), ((Long) zzblf.zzc.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzd), Exception.class, new zzfsm() { // from class: com.google.android.gms.internal.ads.zzexs
            @Override // com.google.android.gms.internal.ads.zzfsm
            public final Object apply(Object obj) {
                zzext.this.zzc((Exception) obj);
                return null;
            }
        }, this.zze);
    }

    final /* synthetic */ zzexu zzc(Exception exc) {
        this.zza.zzt(exc, "TrustlessTokenSignal");
        return null;
    }
}
