package com.google.android.gms.internal.ads;

import org.apache.commons.io.IOUtils;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzfgx {
    private final zzfgw zza = new zzfgw();
    private int zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;

    zzfgx() {
    }

    public final zzfgw zza() {
        zzfgw zzfgwVar = this.zza;
        zzfgw clone = zzfgwVar.clone();
        zzfgwVar.zza = false;
        zzfgwVar.zzb = false;
        return clone;
    }

    public final String zzb() {
        return "\n\tPool does not exist: " + this.zzd + "\n\tNew pools created: " + this.zzb + "\n\tPools removed: " + this.zzc + "\n\tEntries added: " + this.zzf + "\n\tNo entries retrieved: " + this.zze + IOUtils.LINE_SEPARATOR_UNIX;
    }

    public final void zzc() {
        this.zzf++;
    }

    public final void zzd() {
        this.zzb++;
        this.zza.zza = true;
    }

    public final void zze() {
        this.zze++;
    }

    public final void zzf() {
        this.zzd++;
    }

    public final void zzg() {
        this.zzc++;
        this.zza.zzb = true;
    }
}
