package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public class zzcp {
    public static final zzcp zza;

    @Deprecated
    public static final zzcp zzb;
    public static final zzl zzc;
    public final zzfrk zzA;
    public final zzfrm zzB;
    public final int zzd = Integer.MAX_VALUE;
    public final int zze = Integer.MAX_VALUE;
    public final int zzf = Integer.MAX_VALUE;
    public final int zzg = Integer.MAX_VALUE;
    public final int zzh = 0;
    public final int zzi = 0;
    public final int zzj = 0;
    public final int zzk = 0;
    public final int zzl;
    public final int zzm;
    public final boolean zzn;
    public final zzfrh zzo;
    public final int zzp;
    public final zzfrh zzq;
    public final int zzr;
    public final int zzs;
    public final int zzt;
    public final zzfrh zzu;
    public final zzfrh zzv;
    public final int zzw;
    public final boolean zzx;
    public final boolean zzy;
    public final boolean zzz;

    static {
        zzcp zzcpVar = new zzcp(new zzco());
        zza = zzcpVar;
        zzb = zzcpVar;
        zzc = new zzl() { // from class: com.google.android.gms.internal.ads.zzcn
        };
    }

    protected zzcp(zzco zzcoVar) {
        int i;
        int i2;
        boolean z;
        zzfrh zzfrhVar;
        zzfrh zzfrhVar2;
        zzfrh zzfrhVar3;
        zzfrh zzfrhVar4;
        int i3;
        HashMap hashMap;
        HashSet hashSet;
        i = zzcoVar.zze;
        this.zzl = i;
        i2 = zzcoVar.zzf;
        this.zzm = i2;
        z = zzcoVar.zzg;
        this.zzn = z;
        zzfrhVar = zzcoVar.zzh;
        this.zzo = zzfrhVar;
        this.zzp = 0;
        zzfrhVar2 = zzcoVar.zzi;
        this.zzq = zzfrhVar2;
        this.zzr = 0;
        this.zzs = Integer.MAX_VALUE;
        this.zzt = Integer.MAX_VALUE;
        zzfrhVar3 = zzcoVar.zzl;
        this.zzu = zzfrhVar3;
        zzfrhVar4 = zzcoVar.zzm;
        this.zzv = zzfrhVar4;
        i3 = zzcoVar.zzn;
        this.zzw = i3;
        this.zzx = false;
        this.zzy = false;
        this.zzz = false;
        hashMap = zzcoVar.zzo;
        this.zzA = zzfrk.zzc(hashMap);
        hashSet = zzcoVar.zzp;
        this.zzB = zzfrm.zzl(hashSet);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzcp zzcpVar = (zzcp) obj;
            if (this.zzn == zzcpVar.zzn && this.zzl == zzcpVar.zzl && this.zzm == zzcpVar.zzm && this.zzo.equals(zzcpVar.zzo) && this.zzq.equals(zzcpVar.zzq) && this.zzu.equals(zzcpVar.zzu) && this.zzv.equals(zzcpVar.zzv) && this.zzw == zzcpVar.zzw && this.zzA.equals(zzcpVar.zzA) && this.zzB.equals(zzcpVar.zzB)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.zzn ? 1 : 0) - 1048002209) * 31) + this.zzl) * 31) + this.zzm) * 31) + this.zzo.hashCode()) * 961) + this.zzq.hashCode()) * 961) + Integer.MAX_VALUE) * 31) + Integer.MAX_VALUE) * 31) + this.zzu.hashCode()) * 31) + this.zzv.hashCode()) * 31) + this.zzw) * 923521) + this.zzA.hashCode()) * 31) + this.zzB.hashCode();
    }
}
