package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfje implements zzfir {
    private final zzfjb zza;
    private final zzfiz zzb;

    public zzfje(zzfjb zzfjbVar, zzfiz zzfizVar) {
        this.zza = zzfjbVar;
        this.zzb = zzfizVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfir
    public final String zza(zzfiq zzfiqVar) {
        zzfjb zzfjbVar = this.zza;
        Map zzj = zzfiqVar.zzj();
        this.zzb.zza(zzj);
        return zzfjbVar.zza(zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzfir
    public final void zzb(zzfiq zzfiqVar) {
    }
}
