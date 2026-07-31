package com.google.android.gms.internal.ads;

import androidx.media3.common.C;
import com.revenuecat.purchases.common.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzvd implements zzun, zzum {
    private final zzun[] zza;
    private final boolean[] zzb;
    private zzum zzf;
    private zzwq zzg;
    private final ArrayList zzd = new ArrayList();
    private final HashMap zze = new HashMap();
    private zzwh zzi = new zztz(zzgjz.zzi(), zzgjz.zzi());
    private final IdentityHashMap zzc = new IdentityHashMap();
    private zzun[] zzh = new zzun[0];

    public zzvd(zzua zzuaVar, long[] jArr, zzun... zzunVarArr) {
        this.zza = zzunVarArr;
        this.zzb = new boolean[zzunVarArr.length];
        for (int i = 0; i < zzunVarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.zzb[i] = true;
                this.zza[i] = new zzwn(zzunVarArr[i], j);
            }
        }
    }

    public final zzun zza(int i) {
        return this.zzb[i] ? ((zzwn) this.zza[i]).zza() : this.zza[i];
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final void zzb(zzum zzumVar, long j) {
        this.zzf = zzumVar;
        ArrayList arrayList = this.zzd;
        zzun[] zzunVarArr = this.zza;
        Collections.addAll(arrayList, zzunVarArr);
        for (zzun zzunVar : zzunVarArr) {
            zzunVar.zzb(this, j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final void zzc() throws IOException {
        int i = 0;
        while (true) {
            zzun[] zzunVarArr = this.zza;
            if (i >= zzunVarArr.length) {
                return;
            }
            zzunVarArr[i].zzc();
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final long zze(zzyf[] zzyfVarArr, boolean[] zArr, zzwf[] zzwfVarArr, boolean[] zArr2, long j) {
        int length;
        int[] iArr;
        int length2 = zzyfVarArr.length;
        int[] iArr2 = new int[length2];
        int[] iArr3 = new int[length2];
        int i = 0;
        int i2 = 0;
        while (true) {
            length = zzyfVarArr.length;
            if (i2 >= length) {
                break;
            }
            zzwf zzwfVar = zzwfVarArr[i2];
            Integer num = zzwfVar == null ? null : (Integer) this.zzc.get(zzwfVar);
            iArr2[i2] = num == null ? -1 : num.intValue();
            zzyf zzyfVar = zzyfVarArr[i2];
            if (zzyfVar != null) {
                String str = zzyfVar.zza().zzb;
                iArr3[i2] = Integer.parseInt(str.substring(0, str.indexOf(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR)));
            } else {
                iArr3[i2] = -1;
            }
            i2++;
        }
        IdentityHashMap identityHashMap = this.zzc;
        identityHashMap.clear();
        zzun[] zzunVarArr = this.zza;
        zzwf[] zzwfVarArr2 = new zzwf[length];
        zzwf[] zzwfVarArr3 = new zzwf[length];
        zzyf[] zzyfVarArr2 = new zzyf[length];
        ArrayList arrayList = new ArrayList(zzunVarArr.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < zzunVarArr.length) {
            int i4 = i;
            while (i4 < zzyfVarArr.length) {
                zzwfVarArr3[i4] = iArr2[i4] == i3 ? zzwfVarArr[i4] : null;
                if (iArr3[i4] == i3) {
                    zzyf zzyfVar2 = zzyfVarArr[i4];
                    zzyfVar2.getClass();
                    iArr = iArr3;
                    zzbf zzbfVar = (zzbf) this.zze.get(zzyfVar2.zza());
                    zzbfVar.getClass();
                    zzyfVarArr2[i4] = new zzvc(zzyfVar2, zzbfVar);
                } else {
                    iArr = iArr3;
                    zzyfVarArr2[i4] = null;
                }
                i4++;
                iArr3 = iArr;
            }
            int[] iArr4 = iArr3;
            ArrayList arrayList2 = arrayList;
            int i5 = i3;
            long zze = zzunVarArr[i3].zze(zzyfVarArr2, zArr, zzwfVarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = zze;
            } else if (zze != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i6 = 0; i6 < zzyfVarArr.length; i6++) {
                if (iArr4[i6] == i5) {
                    zzwf zzwfVar2 = zzwfVarArr3[i6];
                    zzwfVar2.getClass();
                    zzwfVarArr2[i6] = zzwfVar2;
                    identityHashMap.put(zzwfVar2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr2[i6] == i5) {
                    zzghc.zzh(zzwfVarArr3[i6] == null);
                }
            }
            if (z) {
                arrayList2.add(zzunVarArr[i5]);
            }
            i3 = i5 + 1;
            arrayList = arrayList2;
            iArr3 = iArr4;
            i = 0;
        }
        int i7 = i;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(zzwfVarArr2, i7, zzwfVarArr, i7, length);
        this.zzh = (zzun[]) arrayList3.toArray(new zzun[i7]);
        this.zzi = new zztz(arrayList3, zzgkp.zzc(arrayList3, zzvb.zza));
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final void zzf(long j, boolean z) {
        for (zzun zzunVar : this.zzh) {
            zzunVar.zzf(j, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final void zzg(long j) {
        this.zzi.zzg(j);
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final long zzh() {
        long j = -9223372036854775807L;
        for (zzun zzunVar : this.zzh) {
            long zzh = zzunVar.zzh();
            if (zzh != C.TIME_UNSET) {
                if (j == C.TIME_UNSET) {
                    for (zzun zzunVar2 : this.zzh) {
                        if (zzunVar2 == zzunVar) {
                            break;
                        }
                        if (zzunVar2.zzj(zzh) != zzh) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j = zzh;
                } else if (zzh != j) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j != C.TIME_UNSET && zzunVar.zzj(j) != j) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final long zzi() {
        return this.zzi.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final long zzj(long j) {
        long zzj = this.zzh[0].zzj(j);
        int i = 1;
        while (true) {
            zzun[] zzunVarArr = this.zzh;
            if (i >= zzunVarArr.length) {
                return zzj;
            }
            if (zzunVarArr[i].zzj(zzj) != zzj) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final long zzk(long j, zzlt zzltVar) {
        zzun[] zzunVarArr = this.zzh;
        return (zzunVarArr.length > 0 ? zzunVarArr[0] : this.zza[0]).zzk(j, zzltVar);
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final long zzl() {
        return this.zzi.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final boolean zzm(zzkl zzklVar) {
        ArrayList arrayList = this.zzd;
        if (arrayList.isEmpty()) {
            return this.zzi.zzm(zzklVar);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((zzun) arrayList.get(i)).zzm(zzklVar);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final boolean zzn() {
        return this.zzi.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzum
    public final void zzp(zzun zzunVar) {
        ArrayList arrayList = this.zzd;
        arrayList.remove(zzunVar);
        if (arrayList.isEmpty()) {
            zzun[] zzunVarArr = this.zza;
            int i = 0;
            for (zzun zzunVar2 : zzunVarArr) {
                i += zzunVar2.zzd().zzb;
            }
            zzbf[] zzbfVarArr = new zzbf[i];
            int i2 = 0;
            for (int i3 = 0; i3 < zzunVarArr.length; i3++) {
                zzwq zzd = zzunVarArr[i3].zzd();
                int i4 = zzd.zzb;
                int i5 = 0;
                while (i5 < i4) {
                    zzbf zza = zzd.zza(i5);
                    int i6 = zza.zza;
                    zzu[] zzuVarArr = new zzu[i6];
                    int i7 = 0;
                    while (i7 < i6) {
                        zzu zza2 = zza.zza(i7);
                        zzs zza3 = zza2.zza();
                        String str = zza2.zza;
                        if (str == null) {
                            str = "";
                        }
                        StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 1 + str.length());
                        sb.append(i3);
                        sb.append(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
                        sb.append(str);
                        zza3.zza(sb.toString());
                        zzuVarArr[i7] = zza3.zzM();
                        i7++;
                        zzunVarArr = zzunVarArr;
                    }
                    zzun[] zzunVarArr2 = zzunVarArr;
                    String str2 = zza.zzb;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + 1 + String.valueOf(str2).length());
                    sb2.append(i3);
                    sb2.append(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
                    sb2.append(str2);
                    zzbf zzbfVar = new zzbf(sb2.toString(), zzuVarArr);
                    this.zze.put(zzbfVar, zza);
                    zzbfVarArr[i2] = zzbfVar;
                    i5++;
                    i2++;
                    zzunVarArr = zzunVarArr2;
                }
            }
            this.zzg = new zzwq(zzbfVarArr);
            zzum zzumVar = this.zzf;
            zzumVar.getClass();
            zzumVar.zzp(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final /* bridge */ /* synthetic */ void zzs(zzwh zzwhVar) {
        zzum zzumVar = this.zzf;
        zzumVar.getClass();
        zzumVar.zzs(this);
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final zzwq zzd() {
        zzwq zzwqVar = this.zzg;
        zzwqVar.getClass();
        return zzwqVar;
    }
}
