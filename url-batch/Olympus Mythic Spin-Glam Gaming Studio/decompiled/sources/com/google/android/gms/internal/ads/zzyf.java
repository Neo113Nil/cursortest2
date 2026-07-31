package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzyf extends zzww {
    private static final zzak zza;
    private final zzxq[] zzb;
    private final List zzc;
    private final zzbf[] zzd;
    private final ArrayList zze;
    private int zzf = -1;
    private long[][] zzg;

    @Nullable
    private zzyd zzh;
    private final zzwz zzi;

    static {
        zzz zzzVar = new zzz();
        zzzVar.zza("MergingMediaSource");
        zza = zzzVar.zzc();
    }

    public zzyf(boolean z, boolean z2, zzwz zzwzVar, zzxq... zzxqVarArr) {
        this.zzb = zzxqVarArr;
        this.zzi = zzwzVar;
        this.zze = new ArrayList(Arrays.asList(zzxqVarArr));
        this.zzc = new ArrayList(zzxqVarArr.length);
        int i = 0;
        while (true) {
            int length = zzxqVarArr.length;
            if (i >= length) {
                this.zzd = new zzbf[length];
                this.zzg = new long[0][];
                new HashMap();
                zzgzb.zzb(8).zzb(2).zza();
                return;
            }
            this.zzc.add(new ArrayList());
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void zzB(zzak zzakVar) {
        this.zzb[0].zzB(zzakVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void zzE(zzxm zzxmVar) {
        zzyc zzycVar = (zzyc) zzxmVar;
        int i = 0;
        while (true) {
            zzxq[] zzxqVarArr = this.zzb;
            if (i >= zzxqVarArr.length) {
                return;
            }
            List list = (List) this.zzc.get(i);
            zzxm zza2 = zzycVar.zza(i);
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                }
                if (((zzye) list.get(i2)).zzb().equals(zza2)) {
                    list.remove(i2);
                    break;
                }
                i2++;
            }
            zzxqVarArr[i].zzE(zzycVar.zza(i));
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final zzxm zzH(zzxo zzxoVar, zzabp zzabpVar, long j) {
        zzbf[] zzbfVarArr = this.zzd;
        zzxq[] zzxqVarArr = this.zzb;
        int length = zzxqVarArr.length;
        zzxm[] zzxmVarArr = new zzxm[length];
        int zze = zzbfVarArr[0].zze(zzxoVar.zza);
        for (int i = 0; i < length; i++) {
            zzxo zza2 = zzxoVar.zza(zzbfVarArr[i].zzf(zze));
            zzxmVarArr[i] = zzxqVarArr[i].zzH(zza2, zzabpVar, j - this.zzg[zze][i]);
            ((List) this.zzc.get(i)).add(new zzye(zza2, zzxmVarArr[i], null));
        }
        return new zzyc(this.zzi, this.zzg[zze], zzxmVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final zzak zzK() {
        zzxq[] zzxqVarArr = this.zzb;
        return zzxqVarArr.length > 0 ? zzxqVarArr[0].zzK() : zza;
    }

    @Override // com.google.android.gms.internal.ads.zzww, com.google.android.gms.internal.ads.zzwp
    protected final void zza(@Nullable zziq zziqVar) {
        super.zza(zziqVar);
        int i = 0;
        while (true) {
            zzxq[] zzxqVarArr = this.zzb;
            if (i >= zzxqVarArr.length) {
                return;
            }
            zzw(Integer.valueOf(i), zzxqVarArr[i]);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzww, com.google.android.gms.internal.ads.zzwp
    protected final void zzd() {
        super.zzd();
        Arrays.fill(this.zzd, (Object) null);
        this.zzf = -1;
        this.zzh = null;
        ArrayList arrayList = this.zze;
        arrayList.clear();
        Collections.addAll(arrayList, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzww, com.google.android.gms.internal.ads.zzxq
    public final void zzu() throws IOException {
        zzyd zzydVar = this.zzh;
        if (zzydVar != null) {
            throw zzydVar;
        }
        super.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzww
    protected final /* bridge */ /* synthetic */ void zzv(Object obj, zzxq zzxqVar, zzbf zzbfVar) {
        int i;
        Integer num = (Integer) obj;
        if (this.zzh != null) {
            return;
        }
        if (this.zzf == -1) {
            i = zzbfVar.zzc();
            this.zzf = i;
        } else {
            int zzc = zzbfVar.zzc();
            int i2 = this.zzf;
            if (zzc != i2) {
                this.zzh = new zzyd(0);
                return;
            }
            i = i2;
        }
        if (this.zzg.length == 0) {
            this.zzg = (long[][]) Array.newInstance((Class<?>) Long.TYPE, i, this.zzd.length);
        }
        ArrayList arrayList = this.zze;
        arrayList.remove(zzxqVar);
        zzbf[] zzbfVarArr = this.zzd;
        zzbfVarArr[num.intValue()] = zzbfVar;
        if (arrayList.isEmpty()) {
            zze(zzbfVarArr[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzww
    @Nullable
    protected final /* bridge */ /* synthetic */ zzxo zzy(Object obj, zzxo zzxoVar) {
        int intValue = ((Integer) obj).intValue();
        List list = this.zzc;
        List list2 = (List) list.get(intValue);
        for (int i = 0; i < list2.size(); i++) {
            if (((zzye) list2.get(i)).zza().equals(zzxoVar)) {
                return ((zzye) ((List) list.get(0)).get(i)).zza();
            }
        }
        return null;
    }
}
