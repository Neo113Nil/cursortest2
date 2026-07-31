package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzvg extends zztx {
    private static final zzaj zza;
    private final zzur[] zzb;
    private final List zzc;
    private final zzbe[] zzd;
    private final ArrayList zze;
    private int zzf = -1;
    private long[][] zzg;
    private zzve zzh;
    private final zzua zzi;

    static {
        zzy zzyVar = new zzy();
        zzyVar.zza("MergingMediaSource");
        zza = zzyVar.zzc();
    }

    public zzvg(boolean z, boolean z2, zzua zzuaVar, zzur... zzurVarArr) {
        this.zzb = zzurVarArr;
        this.zzi = zzuaVar;
        this.zze = new ArrayList(Arrays.asList(zzurVarArr));
        this.zzc = new ArrayList(zzurVarArr.length);
        int i = 0;
        while (true) {
            int length = zzurVarArr.length;
            if (i >= length) {
                this.zzd = new zzbe[length];
                this.zzg = new long[0][];
                new HashMap();
                zzgle.zzb(8).zzb(2).zza();
                return;
            }
            this.zzc.add(new ArrayList());
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzA(zzaj zzajVar) {
        this.zzb[0].zzA(zzajVar);
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzC(zzun zzunVar) {
        zzvd zzvdVar = (zzvd) zzunVar;
        int i = 0;
        while (true) {
            zzur[] zzurVarArr = this.zzb;
            if (i >= zzurVarArr.length) {
                return;
            }
            List list = (List) this.zzc.get(i);
            zzun zza2 = zzvdVar.zza(i);
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                }
                if (((zzvf) list.get(i2)).zzb().equals(zza2)) {
                    list.remove(i2);
                    break;
                }
                i2++;
            }
            zzurVarArr[i].zzC(zzvdVar.zza(i));
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final zzun zzG(zzup zzupVar, zzyv zzyvVar, long j) {
        zzbe[] zzbeVarArr = this.zzd;
        zzur[] zzurVarArr = this.zzb;
        int length = zzurVarArr.length;
        zzun[] zzunVarArr = new zzun[length];
        int zze = zzbeVarArr[0].zze(zzupVar.zza);
        for (int i = 0; i < length; i++) {
            zzup zza2 = zzupVar.zza(zzbeVarArr[i].zzf(zze));
            zzunVarArr[i] = zzurVarArr[i].zzG(zza2, zzyvVar, j - this.zzg[zze][i]);
            ((List) this.zzc.get(i)).add(new zzvf(zza2, zzunVarArr[i], null));
        }
        return new zzvd(this.zzi, this.zzg[zze], zzunVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final zzaj zzJ() {
        zzur[] zzurVarArr = this.zzb;
        return zzurVarArr.length > 0 ? zzurVarArr[0].zzJ() : zza;
    }

    @Override // com.google.android.gms.internal.ads.zztx, com.google.android.gms.internal.ads.zzto
    protected final void zza(zzgy zzgyVar) {
        super.zza(zzgyVar);
        int i = 0;
        while (true) {
            zzur[] zzurVarArr = this.zzb;
            if (i >= zzurVarArr.length) {
                return;
            }
            zzv(Integer.valueOf(i), zzurVarArr[i]);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zztx, com.google.android.gms.internal.ads.zzto
    protected final void zzd() {
        super.zzd();
        Arrays.fill(this.zzd, (Object) null);
        this.zzf = -1;
        this.zzh = null;
        ArrayList arrayList = this.zze;
        arrayList.clear();
        Collections.addAll(arrayList, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zztx, com.google.android.gms.internal.ads.zzur
    public final void zzt() throws IOException {
        zzve zzveVar = this.zzh;
        if (zzveVar != null) {
            throw zzveVar;
        }
        super.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zztx
    protected final /* bridge */ /* synthetic */ void zzu(Object obj, zzur zzurVar, zzbe zzbeVar) {
        int i;
        Integer num = (Integer) obj;
        if (this.zzh != null) {
            return;
        }
        if (this.zzf == -1) {
            i = zzbeVar.zzc();
            this.zzf = i;
        } else {
            int zzc = zzbeVar.zzc();
            int i2 = this.zzf;
            if (zzc != i2) {
                this.zzh = new zzve(0);
                return;
            }
            i = i2;
        }
        if (this.zzg.length == 0) {
            this.zzg = (long[][]) Array.newInstance((Class<?>) Long.TYPE, i, this.zzd.length);
        }
        ArrayList arrayList = this.zze;
        arrayList.remove(zzurVar);
        zzbe[] zzbeVarArr = this.zzd;
        zzbeVarArr[num.intValue()] = zzbeVar;
        if (arrayList.isEmpty()) {
            zze(zzbeVarArr[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztx
    protected final /* bridge */ /* synthetic */ zzup zzx(Object obj, zzup zzupVar) {
        int intValue = ((Integer) obj).intValue();
        List list = this.zzc;
        List list2 = (List) list.get(intValue);
        for (int i = 0; i < list2.size(); i++) {
            if (((zzvf) list2.get(i)).zza().equals(zzupVar)) {
                return ((zzvf) ((List) list.get(0)).get(i)).zza();
            }
        }
        return null;
    }
}
