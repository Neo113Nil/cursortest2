package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzmp implements zzmt {
    public static final zzfph zza = new zzfph() { // from class: com.google.android.gms.internal.ads.zzmn
        @Override // com.google.android.gms.internal.ads.zzfph
        public final Object zza() {
            String zzl;
            zzl = zzmp.zzl();
            return zzl;
        }
    };
    private static final Random zzb = new Random();
    private final zzch zzc;
    private final zzcf zzd;
    private final HashMap zze;
    private final zzfph zzf;
    private zzms zzg;
    private zzci zzh;
    private String zzi;

    public zzmp() {
        throw null;
    }

    private final zzmo zzk(int i, zzsb zzsbVar) {
        zzmo zzmoVar = null;
        long j = Long.MAX_VALUE;
        for (zzmo zzmoVar2 : this.zze.values()) {
            zzmoVar2.zzg(i, zzsbVar);
            if (zzmoVar2.zzj(i, zzsbVar)) {
                long j2 = zzmoVar2.zzd;
                if (j2 == -1 || j2 < j) {
                    zzmoVar = zzmoVar2;
                    j = j2;
                } else if (j2 == j) {
                    int i2 = zzeg.zza;
                    if (zzmoVar.zze != null && zzmoVar2.zze != null) {
                        zzmoVar = zzmoVar2;
                    }
                }
            }
        }
        if (zzmoVar != null) {
            return zzmoVar;
        }
        String zzl = zzl();
        zzmo zzmoVar3 = new zzmo(this, zzl, i, zzsbVar);
        this.zze.put(zzl, zzmoVar3);
        return zzmoVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzl() {
        byte[] bArr = new byte[12];
        zzb.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    @RequiresNonNull({ServiceSpecificExtraArgs.CastExtraArgs.LISTENER})
    private final void zzm(zzkj zzkjVar) {
        if (zzkjVar.zzb.zzo()) {
            this.zzi = null;
            return;
        }
        zzmo zzmoVar = (zzmo) this.zze.get(this.zzi);
        zzmo zzk = zzk(zzkjVar.zzc, zzkjVar.zzd);
        this.zzi = zzk.zzb;
        zzh(zzkjVar);
        zzsb zzsbVar = zzkjVar.zzd;
        if (zzsbVar == null || !zzsbVar.zzb()) {
            return;
        }
        if (zzmoVar != null && zzmoVar.zzd == zzkjVar.zzd.zzd && zzmoVar.zze != null && zzmoVar.zze.zzb == zzkjVar.zzd.zzb && zzmoVar.zze.zzc == zzkjVar.zzd.zzc) {
            return;
        }
        zzsb zzsbVar2 = zzkjVar.zzd;
        String unused = zzk(zzkjVar.zzc, new zzsb(zzsbVar2.zza, zzsbVar2.zzd)).zzb;
        String unused2 = zzk.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzmt
    public final synchronized String zzd() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzmt
    public final synchronized String zze(zzci zzciVar, zzsb zzsbVar) {
        return zzk(zzciVar.zzn(zzsbVar.zza, this.zzd).zzd, zzsbVar).zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzmt
    public final synchronized void zzf(zzkj zzkjVar) {
        zzms zzmsVar;
        this.zzi = null;
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzmo zzmoVar = (zzmo) it.next();
            it.remove();
            if (zzmoVar.zzf && (zzmsVar = this.zzg) != null) {
                zzmsVar.zzd(zzkjVar, zzmoVar.zzb, false);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmt
    public final void zzg(zzms zzmsVar) {
        this.zzg = zzmsVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        if (r10.zzd.zzd < r0.zzd) goto L20;
     */
    @Override // com.google.android.gms.internal.ads.zzmt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzh(zzkj zzkjVar) {
        Objects.requireNonNull(this.zzg);
        if (zzkjVar.zzb.zzo()) {
            return;
        }
        zzmo zzmoVar = (zzmo) this.zze.get(this.zzi);
        if (zzkjVar.zzd != null && zzmoVar != null) {
            if (zzmoVar.zzd == -1) {
                if (zzmoVar.zzc == zzkjVar.zzc) {
                }
                return;
            }
        }
        zzmo zzk = zzk(zzkjVar.zzc, zzkjVar.zzd);
        if (this.zzi == null) {
            this.zzi = zzk.zzb;
        }
        zzsb zzsbVar = zzkjVar.zzd;
        if (zzsbVar != null && zzsbVar.zzb()) {
            zzmo zzk2 = zzk(zzkjVar.zzc, new zzsb(zzsbVar.zza, zzsbVar.zzd, zzsbVar.zzb));
            if (!zzk2.zzf) {
                zzk2.zzf = true;
                zzkjVar.zzb.zzn(zzkjVar.zzd.zza, this.zzd);
                this.zzd.zzh(zzkjVar.zzd.zzb);
                Math.max(0L, zzeg.zzz(0L) + zzeg.zzz(0L));
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
        this.zzg.zzc(zzkjVar, zzk.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzmt
    public final synchronized void zzi(zzkj zzkjVar, int i) {
        Objects.requireNonNull(this.zzg);
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzmo zzmoVar = (zzmo) it.next();
            if (zzmoVar.zzk(zzkjVar)) {
                it.remove();
                if (zzmoVar.zzf) {
                    boolean equals = zzmoVar.zzb.equals(this.zzi);
                    boolean z = false;
                    if (i == 0 && equals && zzmoVar.zzg) {
                        z = true;
                    }
                    if (equals) {
                        this.zzi = null;
                    }
                    this.zzg.zzd(zzkjVar, zzmoVar.zzb, z);
                }
            }
        }
        zzm(zzkjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmt
    public final synchronized void zzj(zzkj zzkjVar) {
        Objects.requireNonNull(this.zzg);
        zzci zzciVar = this.zzh;
        this.zzh = zzkjVar.zzb;
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzmo zzmoVar = (zzmo) it.next();
            if (!zzmoVar.zzl(zzciVar, this.zzh) || zzmoVar.zzk(zzkjVar)) {
                it.remove();
                if (zzmoVar.zzf) {
                    if (zzmoVar.zzb.equals(this.zzi)) {
                        this.zzi = null;
                    }
                    this.zzg.zzd(zzkjVar, zzmoVar.zzb, false);
                }
            }
        }
        zzm(zzkjVar);
    }

    public zzmp(zzfph zzfphVar) {
        this.zzf = zzfphVar;
        this.zzc = new zzch();
        this.zzd = new zzcf();
        this.zze = new HashMap();
        this.zzh = zzci.zza;
    }
}
