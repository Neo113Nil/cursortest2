package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzapy implements zzfow {
    private final zzfmz zza;
    private final zzfnq zzb;
    private final zzaql zzc;
    private final zzapx zzd;
    private final zzapi zze;
    private final zzaqn zzf;

    zzapy(zzfmz zzfmzVar, zzfnq zzfnqVar, zzaql zzaqlVar, zzapx zzapxVar, zzapi zzapiVar, zzaqn zzaqnVar) {
        this.zza = zzfmzVar;
        this.zzb = zzfnqVar;
        this.zzc = zzaqlVar;
        this.zzd = zzapxVar;
        this.zze = zzapiVar;
        this.zzf = zzaqnVar;
    }

    private final Map zze() {
        HashMap hashMap = new HashMap();
        zzana zzb = this.zzb.zzb();
        hashMap.put("v", this.zza.zzb());
        hashMap.put("gms", Boolean.valueOf(this.zza.zzc()));
        hashMap.put("int", zzb.zzh());
        hashMap.put("up", Boolean.valueOf(this.zzd.zza()));
        hashMap.put("t", new Throwable());
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzfow
    public final Map zza() {
        Map zze = zze();
        zze.put("lts", Long.valueOf(this.zzc.zza()));
        return zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfow
    public final Map zzb() {
        Map zze = zze();
        zzana zza = this.zzb.zza();
        zze.put("gai", Boolean.valueOf(this.zza.zzd()));
        zze.put("did", zza.zzg());
        zze.put("dst", Integer.valueOf(zza.zzal() - 1));
        zze.put("doo", Boolean.valueOf(zza.zzai()));
        zzapi zzapiVar = this.zze;
        if (zzapiVar != null) {
            zze.put("nt", Long.valueOf(zzapiVar.zza()));
        }
        zzaqn zzaqnVar = this.zzf;
        if (zzaqnVar != null) {
            zze.put("vs", Long.valueOf(zzaqnVar.zzc()));
            zze.put("vf", Long.valueOf(this.zzf.zzb()));
        }
        return zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfow
    public final Map zzc() {
        return zze();
    }

    final void zzd(View view) {
        this.zzc.zzd(view);
    }
}
