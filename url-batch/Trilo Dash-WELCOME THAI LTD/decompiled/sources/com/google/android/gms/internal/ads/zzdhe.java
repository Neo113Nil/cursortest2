package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzdhe {
    private final Set zza;
    private final Set zzb;
    private final Set zzc;
    private final Set zzd;
    private final Set zze;
    private final Set zzf;
    private final Set zzg;
    private final Set zzh;
    private final Set zzi;
    private final Set zzj;
    private final Set zzk;
    private final Set zzl;
    private final Set zzm;
    private final Set zzn;
    private final zzeys zzo;
    private zzdbu zzp;
    private zzeil zzq;

    /* synthetic */ zzdhe(zzdhc zzdhcVar, zzdhd zzdhdVar) {
        Set set;
        Set set2;
        Set set3;
        Set set4;
        Set set5;
        Set set6;
        Set set7;
        Set set8;
        Set set9;
        Set set10;
        Set set11;
        Set set12;
        zzeys zzeysVar;
        Set set13;
        Set set14;
        set = zzdhcVar.zzc;
        this.zza = set;
        set2 = zzdhcVar.zzd;
        this.zzb = set2;
        set3 = zzdhcVar.zzf;
        this.zzd = set3;
        set4 = zzdhcVar.zzg;
        this.zze = set4;
        set5 = zzdhcVar.zze;
        this.zzc = set5;
        set6 = zzdhcVar.zzh;
        this.zzf = set6;
        set7 = zzdhcVar.zza;
        this.zzg = set7;
        set8 = zzdhcVar.zzi;
        this.zzh = set8;
        set9 = zzdhcVar.zzl;
        this.zzi = set9;
        set10 = zzdhcVar.zzj;
        this.zzj = set10;
        set11 = zzdhcVar.zzk;
        this.zzk = set11;
        set12 = zzdhcVar.zzm;
        this.zzl = set12;
        zzeysVar = zzdhcVar.zzo;
        this.zzo = zzeysVar;
        set13 = zzdhcVar.zzn;
        this.zzm = set13;
        set14 = zzdhcVar.zzb;
        this.zzn = set14;
    }

    public final zzdbu zza(Set set) {
        if (this.zzp == null) {
            this.zzp = new zzdbu(set);
        }
        return this.zzp;
    }

    public final zzeil zzb(Clock clock, zzeim zzeimVar, zzefd zzefdVar, zzfig zzfigVar) {
        if (this.zzq == null) {
            this.zzq = new zzeil(clock, zzeimVar, zzefdVar, zzfigVar);
        }
        return this.zzq;
    }

    public final zzeys zzc() {
        return this.zzo;
    }

    public final Set zzd() {
        return this.zzm;
    }

    public final Set zze() {
        return this.zza;
    }

    public final Set zzf() {
        return this.zzh;
    }

    public final Set zzg() {
        return this.zzi;
    }

    public final Set zzh() {
        return this.zzd;
    }

    public final Set zzi() {
        return this.zzc;
    }

    public final Set zzj() {
        return this.zzf;
    }

    final Set zzk() {
        return this.zzg;
    }

    public final Set zzl() {
        return this.zzj;
    }

    public final Set zzm() {
        return this.zze;
    }

    public final Set zzn() {
        return this.zzl;
    }

    public final Set zzo() {
        return this.zzn;
    }

    public final Set zzp() {
        return this.zzk;
    }

    final Set zzq() {
        return this.zzb;
    }
}
