package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcwa {
    private final Context zza;
    private final zzffg zzb;
    private final Bundle zzc;
    private final zzfey zzd;
    private final zzcvs zze;
    private final zzeey zzf;

    /* synthetic */ zzcwa(zzcvy zzcvyVar, zzcvz zzcvzVar) {
        Context context;
        zzffg zzffgVar;
        Bundle bundle;
        zzfey zzfeyVar;
        zzcvs zzcvsVar;
        zzeey zzeeyVar;
        context = zzcvyVar.zza;
        this.zza = context;
        zzffgVar = zzcvyVar.zzb;
        this.zzb = zzffgVar;
        bundle = zzcvyVar.zzc;
        this.zzc = bundle;
        zzfeyVar = zzcvyVar.zzd;
        this.zzd = zzfeyVar;
        zzcvsVar = zzcvyVar.zze;
        this.zze = zzcvsVar;
        zzeeyVar = zzcvyVar.zzf;
        this.zzf = zzeeyVar;
    }

    final Context zza(Context context) {
        return this.zza;
    }

    final Bundle zzb() {
        return this.zzc;
    }

    final zzcvs zzc() {
        return this.zze;
    }

    final zzcvy zzd() {
        zzcvy zzcvyVar = new zzcvy();
        zzcvyVar.zze(this.zza);
        zzcvyVar.zzi(this.zzb);
        zzcvyVar.zzf(this.zzc);
        zzcvyVar.zzg(this.zze);
        zzcvyVar.zzd(this.zzf);
        return zzcvyVar;
    }

    final zzeey zze(String str) {
        zzeey zzeeyVar = this.zzf;
        return zzeeyVar != null ? zzeeyVar : new zzeey(str);
    }

    final zzfey zzf() {
        return this.zzd;
    }

    final zzffg zzg() {
        return this.zzb;
    }
}
