package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzst extends zzrk {
    private static final zzbb zza;
    private final zzsd[] zzb;
    private final zzci[] zzc;
    private final ArrayList zzd;
    private final Map zze;
    private final zzfsd zzf;
    private int zzg;
    private long[][] zzh;
    private zzss zzi;
    private final zzrm zzj;

    static {
        zzah zzahVar = new zzah();
        zzahVar.zza("MergingMediaSource");
        zza = zzahVar.zzc();
    }

    public zzst(boolean z, boolean z2, zzsd... zzsdVarArr) {
        zzrm zzrmVar = new zzrm();
        this.zzb = zzsdVarArr;
        this.zzj = zzrmVar;
        this.zzd = new ArrayList(Arrays.asList(zzsdVarArr));
        this.zzg = -1;
        this.zzc = new zzci[zzsdVarArr.length];
        this.zzh = new long[0][];
        this.zze = new HashMap();
        this.zzf = zzfsk.zzb(8).zzb(2).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzB(zzrz zzrzVar) {
        zzsr zzsrVar = (zzsr) zzrzVar;
        int i = 0;
        while (true) {
            zzsd[] zzsdVarArr = this.zzb;
            if (i >= zzsdVarArr.length) {
                return;
            }
            zzsdVarArr[i].zzB(zzsrVar.zzn(i));
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final zzrz zzD(zzsb zzsbVar, zzvw zzvwVar, long j) {
        int length = this.zzb.length;
        zzrz[] zzrzVarArr = new zzrz[length];
        int zza2 = this.zzc[0].zza(zzsbVar.zza);
        for (int i = 0; i < length; i++) {
            zzrzVarArr[i] = this.zzb[i].zzD(zzsbVar.zzc(this.zzc[i].zzf(zza2)), zzvwVar, j - this.zzh[zza2][i]);
        }
        return new zzsr(this.zzj, this.zzh[zza2], zzrzVarArr, null);
    }

    @Override // com.google.android.gms.internal.ads.zzrk, com.google.android.gms.internal.ads.zzrc
    protected final void zzn(zzft zzftVar) {
        super.zzn(zzftVar);
        for (int i = 0; i < this.zzb.length; i++) {
            zzy(Integer.valueOf(i), this.zzb[i]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrk, com.google.android.gms.internal.ads.zzrc
    protected final void zzq() {
        super.zzq();
        Arrays.fill(this.zzc, (Object) null);
        this.zzg = -1;
        this.zzi = null;
        this.zzd.clear();
        Collections.addAll(this.zzd, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzrk
    protected final /* bridge */ /* synthetic */ zzsb zzv(Object obj, zzsb zzsbVar) {
        if (((Integer) obj).intValue() == 0) {
            return zzsbVar;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzrk, com.google.android.gms.internal.ads.zzsd
    public final void zzw() throws IOException {
        zzss zzssVar = this.zzi;
        if (zzssVar != null) {
            throw zzssVar;
        }
        super.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzrk
    protected final /* bridge */ /* synthetic */ void zzx(Object obj, zzsd zzsdVar, zzci zzciVar) {
        int i;
        if (this.zzi != null) {
            return;
        }
        if (this.zzg == -1) {
            i = zzciVar.zzb();
            this.zzg = i;
        } else {
            int zzb = zzciVar.zzb();
            int i2 = this.zzg;
            if (zzb != i2) {
                this.zzi = new zzss(0);
                return;
            }
            i = i2;
        }
        if (this.zzh.length == 0) {
            this.zzh = (long[][]) Array.newInstance((Class<?>) long.class, i, this.zzc.length);
        }
        this.zzd.remove(zzsdVar);
        this.zzc[((Integer) obj).intValue()] = zzciVar;
        if (this.zzd.isEmpty()) {
            zzo(this.zzc[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final zzbb zzz() {
        zzsd[] zzsdVarArr = this.zzb;
        return zzsdVarArr.length > 0 ? zzsdVarArr[0].zzz() : zza;
    }
}
