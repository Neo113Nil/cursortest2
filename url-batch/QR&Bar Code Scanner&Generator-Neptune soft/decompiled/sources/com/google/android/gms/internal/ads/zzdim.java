package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdim {
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
    private final zzfaw zzo;
    private zzddc zzp;
    private zzeko zzq;

    /* synthetic */ zzdim(zzdik zzdikVar, zzdil zzdilVar) {
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
        zzfaw zzfawVar;
        Set set13;
        Set set14;
        set = zzdikVar.zzc;
        this.zza = set;
        set2 = zzdikVar.zzd;
        this.zzb = set2;
        set3 = zzdikVar.zzf;
        this.zzd = set3;
        set4 = zzdikVar.zzg;
        this.zze = set4;
        set5 = zzdikVar.zze;
        this.zzc = set5;
        set6 = zzdikVar.zzh;
        this.zzf = set6;
        set7 = zzdikVar.zza;
        this.zzg = set7;
        set8 = zzdikVar.zzi;
        this.zzh = set8;
        set9 = zzdikVar.zzl;
        this.zzi = set9;
        set10 = zzdikVar.zzj;
        this.zzj = set10;
        set11 = zzdikVar.zzk;
        this.zzk = set11;
        set12 = zzdikVar.zzm;
        this.zzl = set12;
        zzfawVar = zzdikVar.zzo;
        this.zzo = zzfawVar;
        set13 = zzdikVar.zzn;
        this.zzm = set13;
        set14 = zzdikVar.zzb;
        this.zzn = set14;
    }

    public final zzddc zza(Set set) {
        if (this.zzp == null) {
            this.zzp = new zzddc(set);
        }
        return this.zzp;
    }

    public final zzeko zzb(Clock clock, zzekp zzekpVar, zzehh zzehhVar, zzfkm zzfkmVar) {
        if (this.zzq == null) {
            this.zzq = new zzeko(clock, zzekpVar, zzehhVar, zzfkmVar);
        }
        return this.zzq;
    }

    public final zzfaw zzc() {
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
