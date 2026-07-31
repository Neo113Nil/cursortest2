package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzom implements zzov {
    public static final zzght zza = zzok.zza;
    private static final Random zzb = new Random();
    private final zzbd zzc;
    private final zzbc zzd;
    private final HashMap zze;
    private zzou zzf;
    private zzbe zzg;
    private String zzh;
    private long zzi;

    public zzom() {
        throw null;
    }

    public zzom(zzght zzghtVar) {
        this.zzc = new zzbd();
        this.zzd = new zzbc();
        this.zze = new HashMap();
        this.zzg = zzbe.zza;
        this.zzi = -1L;
    }

    @RequiresNonNull({ServiceSpecificExtraArgs.CastExtraArgs.LISTENER})
    private final void zzl(zzme zzmeVar) {
        if (zzmeVar.zzb.zzg()) {
            String str = this.zzh;
            if (str != null) {
                zzol zzolVar = (zzol) this.zze.get(str);
                zzolVar.getClass();
                zzm(zzolVar);
                return;
            }
            return;
        }
        zzol zzolVar2 = (zzol) this.zze.get(this.zzh);
        int i = zzmeVar.zzc;
        zzup zzupVar = zzmeVar.zzd;
        this.zzh = zzo(i, zzupVar).zze();
        zzc(zzmeVar);
        if (zzupVar == null || !zzupVar.zzb()) {
            return;
        }
        if (zzolVar2 != null) {
            if (zzolVar2.zzg() == zzupVar.zzd && zzolVar2.zzh() != null) {
                zzup zzh = zzolVar2.zzh();
                if (zzh.zzb == zzupVar.zzb) {
                    zzup zzh2 = zzolVar2.zzh();
                    if (zzh2.zzc == zzupVar.zzc) {
                        return;
                    }
                }
            }
        }
        zzo(i, new zzup(zzupVar.zza, zzupVar.zzd));
    }

    private final void zzm(zzol zzolVar) {
        if (zzolVar.zzg() != -1) {
            this.zzi = zzolVar.zzg();
        }
        this.zzh = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final long zzi() {
        zzol zzolVar = (zzol) this.zze.get(this.zzh);
        return (zzolVar == null || zzolVar.zzg() == -1) ? this.zzi + 1 : zzolVar.zzg();
    }

    private final zzol zzo(int i, zzup zzupVar) {
        HashMap hashMap = this.zze;
        long j = Long.MAX_VALUE;
        zzol zzolVar = null;
        for (zzol zzolVar2 : hashMap.values()) {
            zzolVar2.zzc(i, zzupVar);
            if (zzolVar2.zzb(i, zzupVar)) {
                long zzg = zzolVar2.zzg();
                if (zzg == -1 || zzg < j) {
                    zzolVar = zzolVar2;
                    j = zzg;
                } else if (zzg == j) {
                    String str = zzeo.zza;
                    if (zzolVar.zzh() != null && zzolVar2.zzh() != null) {
                        zzolVar = zzolVar2;
                    }
                }
            }
        }
        if (zzolVar != null) {
            return zzolVar;
        }
        String zzp = zzp();
        zzol zzolVar3 = new zzol(this, zzp, i, zzupVar);
        hashMap.put(zzp, zzolVar3);
        return zzolVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzp() {
        byte[] bArr = new byte[12];
        zzb.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzov
    public final void zza(zzou zzouVar) {
        this.zzf = zzouVar;
    }

    @Override // com.google.android.gms.internal.ads.zzov
    public final synchronized String zzb(zzbe zzbeVar, zzup zzupVar) {
        return zzo(zzbeVar.zzo(zzupVar.zza, this.zzd).zzc, zzupVar).zze();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        if (r2.zzf() == r10.zzc) goto L18;
     */
    @Override // com.google.android.gms.internal.ads.zzov
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzc(zzme zzmeVar) {
        if (this.zzf == null) {
            throw null;
        }
        zzbe zzbeVar = zzmeVar.zzb;
        if (!zzbeVar.zzg()) {
            zzup zzupVar = zzmeVar.zzd;
            if (zzupVar != null) {
                if (zzupVar.zzd >= zzi()) {
                    zzol zzolVar = (zzol) this.zze.get(this.zzh);
                    if (zzolVar != null) {
                        if (zzolVar.zzg() == -1) {
                        }
                    }
                }
            }
            int i = zzmeVar.zzc;
            zzol zzo = zzo(i, zzupVar);
            if (this.zzh == null) {
                this.zzh = zzo.zze();
            }
            if (zzupVar != null && zzupVar.zzb()) {
                Object obj = zzupVar.zza;
                long j = zzupVar.zzd;
                int i2 = zzupVar.zzb;
                zzol zzo2 = zzo(i, new zzup(obj, j, i2));
                if (!zzo2.zzi()) {
                    zzo2.zzj(true);
                    zzbc zzbcVar = this.zzd;
                    zzbeVar.zzo(obj, zzbcVar);
                    zzbcVar.zzc(i2);
                    Math.max(0L, zzeo.zzp(0L) + zzeo.zzp(0L));
                }
            }
            if (!zzo.zzi()) {
                zzo.zzj(true);
            }
            if (zzo.zze().equals(this.zzh) && !zzo.zzk()) {
                zzo.zzl(true);
                this.zzf.zzc(zzmeVar, zzo.zze());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzov
    public final synchronized void zzd(zzme zzmeVar) {
        if (this.zzf == null) {
            throw null;
        }
        zzbe zzbeVar = this.zzg;
        this.zzg = zzmeVar.zzb;
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzol zzolVar = (zzol) it.next();
            if (!zzolVar.zza(zzbeVar, this.zzg) || zzolVar.zzd(zzmeVar)) {
                it.remove();
                if (zzolVar.zzi()) {
                    if (zzolVar.zze().equals(this.zzh)) {
                        zzm(zzolVar);
                    }
                    this.zzf.zzd(zzmeVar, zzolVar.zze(), false);
                }
            }
        }
        zzl(zzmeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzov
    public final synchronized void zze(zzme zzmeVar, int i) {
        if (this.zzf == null) {
            throw null;
        }
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzol zzolVar = (zzol) it.next();
            if (zzolVar.zzd(zzmeVar)) {
                it.remove();
                if (zzolVar.zzi()) {
                    boolean equals = zzolVar.zze().equals(this.zzh);
                    boolean z = false;
                    if (i == 0 && equals && zzolVar.zzk()) {
                        z = true;
                    }
                    if (equals) {
                        zzm(zzolVar);
                    }
                    this.zzf.zzd(zzmeVar, zzolVar.zze(), z);
                }
            }
        }
        zzl(zzmeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzov
    public final synchronized String zzf() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzov
    public final synchronized void zzg(zzme zzmeVar) {
        zzou zzouVar;
        String str = this.zzh;
        if (str != null) {
            zzol zzolVar = (zzol) this.zze.get(str);
            if (zzolVar == null) {
                throw null;
            }
            zzol zzolVar2 = zzolVar;
            zzm(zzolVar);
        }
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzol zzolVar3 = (zzol) it.next();
            it.remove();
            if (zzolVar3.zzi() && (zzouVar = this.zzf) != null) {
                zzouVar.zzd(zzmeVar, zzolVar3.zze(), false);
            }
        }
    }

    final /* synthetic */ zzbd zzj() {
        return this.zzc;
    }

    final /* synthetic */ zzbc zzk() {
        return this.zzd;
    }
}
