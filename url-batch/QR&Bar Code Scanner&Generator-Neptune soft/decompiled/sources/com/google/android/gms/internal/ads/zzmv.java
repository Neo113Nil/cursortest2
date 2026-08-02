package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzmv implements zzmz {
    public static final zzftn zza = new zzftn() { // from class: com.google.android.gms.internal.ads.zzmt
        @Override // com.google.android.gms.internal.ads.zzftn
        public final Object zza() {
            String zzl;
            zzl = zzmv.zzl();
            return zzl;
        }
    };
    private static final Random zzb = new Random();
    private final zzcm zzc;
    private final zzck zzd;
    private final HashMap zze;
    private final zzftn zzf;
    private zzmy zzg;
    private zzcn zzh;
    private String zzi;

    public zzmv() {
        throw null;
    }

    private final zzmu zzk(int i, zzsi zzsiVar) {
        zzmu zzmuVar = null;
        long j = Long.MAX_VALUE;
        for (zzmu zzmuVar2 : this.zze.values()) {
            zzmuVar2.zzg(i, zzsiVar);
            if (zzmuVar2.zzj(i, zzsiVar)) {
                long j2 = zzmuVar2.zzd;
                if (j2 == -1 || j2 < j) {
                    zzmuVar = zzmuVar2;
                    j = j2;
                } else if (j2 == j) {
                    int i2 = zzen.zza;
                    if (zzmuVar.zze != null && zzmuVar2.zze != null) {
                        zzmuVar = zzmuVar2;
                    }
                }
            }
        }
        if (zzmuVar != null) {
            return zzmuVar;
        }
        String zzl = zzl();
        zzmu zzmuVar3 = new zzmu(this, zzl, i, zzsiVar);
        this.zze.put(zzl, zzmuVar3);
        return zzmuVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzl() {
        byte[] bArr = new byte[12];
        zzb.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    @RequiresNonNull({ServiceSpecificExtraArgs.CastExtraArgs.LISTENER})
    private final void zzm(zzkp zzkpVar) {
        if (zzkpVar.zzb.zzo()) {
            this.zzi = null;
            return;
        }
        zzmu zzmuVar = (zzmu) this.zze.get(this.zzi);
        zzmu zzk = zzk(zzkpVar.zzc, zzkpVar.zzd);
        this.zzi = zzk.zzb;
        zzh(zzkpVar);
        zzsi zzsiVar = zzkpVar.zzd;
        if (zzsiVar == null || !zzsiVar.zzb()) {
            return;
        }
        if (zzmuVar != null && zzmuVar.zzd == zzkpVar.zzd.zzd && zzmuVar.zze != null && zzmuVar.zze.zzb == zzkpVar.zzd.zzb && zzmuVar.zze.zzc == zzkpVar.zzd.zzc) {
            return;
        }
        zzsi zzsiVar2 = zzkpVar.zzd;
        String unused = zzk(zzkpVar.zzc, new zzsi(zzsiVar2.zza, zzsiVar2.zzd)).zzb;
        String unused2 = zzk.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final synchronized String zzd() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final synchronized String zze(zzcn zzcnVar, zzsi zzsiVar) {
        return zzk(zzcnVar.zzn(zzsiVar.zza, this.zzd).zzd, zzsiVar).zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final synchronized void zzf(zzkp zzkpVar) {
        zzmy zzmyVar;
        this.zzi = null;
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzmu zzmuVar = (zzmu) it.next();
            it.remove();
            if (zzmuVar.zzf && (zzmyVar = this.zzg) != null) {
                zzmyVar.zzd(zzkpVar, zzmuVar.zzb, false);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final void zzg(zzmy zzmyVar) {
        this.zzg = zzmyVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        if (r10.zzd.zzd < r0.zzd) goto L20;
     */
    @Override // com.google.android.gms.internal.ads.zzmz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzh(zzkp zzkpVar) {
        Objects.requireNonNull(this.zzg);
        if (zzkpVar.zzb.zzo()) {
            return;
        }
        zzmu zzmuVar = (zzmu) this.zze.get(this.zzi);
        if (zzkpVar.zzd != null && zzmuVar != null) {
            if (zzmuVar.zzd == -1) {
                if (zzmuVar.zzc == zzkpVar.zzc) {
                }
                return;
            }
        }
        zzmu zzk = zzk(zzkpVar.zzc, zzkpVar.zzd);
        if (this.zzi == null) {
            this.zzi = zzk.zzb;
        }
        zzsi zzsiVar = zzkpVar.zzd;
        if (zzsiVar != null && zzsiVar.zzb()) {
            zzmu zzk2 = zzk(zzkpVar.zzc, new zzsi(zzsiVar.zza, zzsiVar.zzd, zzsiVar.zzb));
            if (!zzk2.zzf) {
                zzk2.zzf = true;
                zzkpVar.zzb.zzn(zzkpVar.zzd.zza, this.zzd);
                this.zzd.zzh(zzkpVar.zzd.zzb);
                Math.max(0L, zzen.zzz(0L) + zzen.zzz(0L));
                String unused = zzk2.zzb;
            }
        }
        if (!zzk.zzf) {
            zzk.zzf = true;
            String unused2 = zzk.zzb;
        }
        if (!zzk.zzb.equals(this.zzi) || zzk.zzg) {
            return;
        }
        zzk.zzg = true;
        this.zzg.zzc(zzkpVar, zzk.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final synchronized void zzi(zzkp zzkpVar, int i) {
        Objects.requireNonNull(this.zzg);
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzmu zzmuVar = (zzmu) it.next();
            if (zzmuVar.zzk(zzkpVar)) {
                it.remove();
                if (zzmuVar.zzf) {
                    boolean equals = zzmuVar.zzb.equals(this.zzi);
                    boolean z = false;
                    if (i == 0 && equals && zzmuVar.zzg) {
                        z = true;
                    }
                    if (equals) {
                        this.zzi = null;
                    }
                    this.zzg.zzd(zzkpVar, zzmuVar.zzb, z);
                }
            }
        }
        zzm(zzkpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final synchronized void zzj(zzkp zzkpVar) {
        Objects.requireNonNull(this.zzg);
        zzcn zzcnVar = this.zzh;
        this.zzh = zzkpVar.zzb;
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzmu zzmuVar = (zzmu) it.next();
            if (!zzmuVar.zzl(zzcnVar, this.zzh) || zzmuVar.zzk(zzkpVar)) {
                it.remove();
                if (zzmuVar.zzf) {
                    if (zzmuVar.zzb.equals(this.zzi)) {
                        this.zzi = null;
                    }
                    this.zzg.zzd(zzkpVar, zzmuVar.zzb, false);
                }
            }
        }
        zzm(zzkpVar);
    }

    public zzmv(zzftn zzftnVar) {
        this.zzf = zzftnVar;
        this.zzc = new zzcm();
        this.zzd = new zzck();
        this.zze = new HashMap();
        this.zzh = zzcn.zza;
    }
}
