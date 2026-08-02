package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzta extends zzrr {
    private static final zzbg zza;
    private final zzsk[] zzb;
    private final zzcn[] zzc;
    private final ArrayList zzd;
    private final Map zze;
    private final zzfwj zzf;
    private int zzg;
    private long[][] zzh;
    private zzsz zzi;
    private final zzrt zzj;

    static {
        zzaj zzajVar = new zzaj();
        zzajVar.zza("MergingMediaSource");
        zza = zzajVar.zzc();
    }

    public zzta(boolean z, boolean z2, zzsk... zzskVarArr) {
        zzrt zzrtVar = new zzrt();
        this.zzb = zzskVarArr;
        this.zzj = zzrtVar;
        this.zzd = new ArrayList(Arrays.asList(zzskVarArr));
        this.zzg = -1;
        this.zzc = new zzcn[zzskVarArr.length];
        this.zzh = new long[0][];
        this.zze = new HashMap();
        this.zzf = zzfwq.zzb(8).zzb(2).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzsk
    public final void zzB(zzsg zzsgVar) {
        zzsy zzsyVar = (zzsy) zzsgVar;
        int i = 0;
        while (true) {
            zzsk[] zzskVarArr = this.zzb;
            if (i >= zzskVarArr.length) {
                return;
            }
            zzskVarArr[i].zzB(zzsyVar.zzn(i));
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsk
    public final zzsg zzD(zzsi zzsiVar, zzwi zzwiVar, long j) {
        int length = this.zzb.length;
        zzsg[] zzsgVarArr = new zzsg[length];
        int zza2 = this.zzc[0].zza(zzsiVar.zza);
        for (int i = 0; i < length; i++) {
            zzsgVarArr[i] = this.zzb[i].zzD(zzsiVar.zzc(this.zzc[i].zzf(zza2)), zzwiVar, j - this.zzh[zza2][i]);
        }
        return new zzsy(this.zzj, this.zzh[zza2], zzsgVarArr, null);
    }

    @Override // com.google.android.gms.internal.ads.zzrr, com.google.android.gms.internal.ads.zzrj
    protected final void zzn(zzfz zzfzVar) {
        super.zzn(zzfzVar);
        for (int i = 0; i < this.zzb.length; i++) {
            zzy(Integer.valueOf(i), this.zzb[i]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrr, com.google.android.gms.internal.ads.zzrj
    protected final void zzq() {
        super.zzq();
        Arrays.fill(this.zzc, (Object) null);
        this.zzg = -1;
        this.zzi = null;
        this.zzd.clear();
        Collections.addAll(this.zzd, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzrr
    protected final /* bridge */ /* synthetic */ zzsi zzv(Object obj, zzsi zzsiVar) {
        if (((Integer) obj).intValue() == 0) {
            return zzsiVar;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzrr, com.google.android.gms.internal.ads.zzsk
    public final void zzw() throws IOException {
        zzsz zzszVar = this.zzi;
        if (zzszVar != null) {
            throw zzszVar;
        }
        super.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzrr
    protected final /* bridge */ /* synthetic */ void zzx(Object obj, zzsk zzskVar, zzcn zzcnVar) {
        int i;
        if (this.zzi != null) {
            return;
        }
        if (this.zzg == -1) {
            i = zzcnVar.zzb();
            this.zzg = i;
        } else {
            int zzb = zzcnVar.zzb();
            int i2 = this.zzg;
            if (zzb != i2) {
                this.zzi = new zzsz(0);
                return;
            }
            i = i2;
        }
        if (this.zzh.length == 0) {
            this.zzh = (long[][]) Array.newInstance((Class<?>) long.class, i, this.zzc.length);
        }
        this.zzd.remove(zzskVar);
        this.zzc[((Integer) obj).intValue()] = zzcnVar;
        if (this.zzd.isEmpty()) {
            zzo(this.zzc[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsk
    public final zzbg zzz() {
        zzsk[] zzskVarArr = this.zzb;
        return zzskVarArr.length > 0 ? zzskVarArr[0].zzz() : zza;
    }
}
