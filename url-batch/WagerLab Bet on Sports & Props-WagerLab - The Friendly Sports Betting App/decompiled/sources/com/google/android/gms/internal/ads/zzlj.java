package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzlj extends zzhh {
    public static final /* synthetic */ int zzb = 0;
    private final int zzc;
    private final int zzd;
    private final int[] zze;
    private final int[] zzf;
    private final zzbe[] zzg;
    private final Object[] zzh;
    private final HashMap zzi;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzlj(Collection collection, zzwi zzwiVar) {
        this(r0, r1, zzwiVar);
        zzbe[] zzbeVarArr = new zzbe[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            zzbeVarArr[i2] = ((zzkr) it.next()).zzb();
            i2++;
        }
        Object[] objArr = new Object[collection.size()];
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((zzkr) it2.next()).zza();
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    protected final int zzp(int i) {
        return zzeo.zzl(this.zze, i + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    protected final int zzq(int i) {
        return zzeo.zzl(this.zzf, i + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    protected final int zzr(Object obj) {
        Integer num = (Integer) this.zzi.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    protected final zzbe zzs(int i) {
        return this.zzg[i];
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    protected final int zzt(int i) {
        return this.zze[i];
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    protected final int zzu(int i) {
        return this.zzf[i];
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    protected final Object zzv(int i) {
        return this.zzh[i];
    }

    final List zzw() {
        return Arrays.asList(this.zzg);
    }

    public final zzlj zzx(zzwi zzwiVar) {
        zzbe[] zzbeVarArr = this.zzg;
        zzbe[] zzbeVarArr2 = new zzbe[zzbeVarArr.length];
        for (int i = 0; i < zzbeVarArr.length; i++) {
            zzbeVarArr2[i] = new zzli(this, zzbeVarArr[i]);
        }
        return new zzlj(zzbeVarArr2, this.zzh, zzwiVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzlj(zzbe[] zzbeVarArr, Object[] objArr, zzwi zzwiVar) {
        super(false, zzwiVar);
        int i = 0;
        this.zzg = zzbeVarArr;
        int length = zzbeVarArr.length;
        this.zze = new int[length];
        this.zzf = new int[length];
        this.zzh = objArr;
        this.zzi = new HashMap();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i < zzbeVarArr.length) {
            zzbe zzbeVar = zzbeVarArr[i];
            this.zzg[i4] = zzbeVar;
            this.zzf[i4] = i2;
            this.zze[i4] = i3;
            i2 += zzbeVar.zza();
            i3 += this.zzg[i4].zzc();
            this.zzi.put(objArr[i4], Integer.valueOf(i4));
            i++;
            i4++;
        }
        this.zzc = i2;
        this.zzd = i3;
    }
}
