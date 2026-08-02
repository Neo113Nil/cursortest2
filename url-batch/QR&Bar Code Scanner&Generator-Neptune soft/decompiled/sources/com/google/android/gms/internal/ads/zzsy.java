package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzsy implements zzsg, zzsf {
    private final zzsg[] zza;
    private zzsf zze;
    private zzuh zzf;
    private final zzrt zzi;
    private final ArrayList zzc = new ArrayList();
    private final HashMap zzd = new HashMap();
    private zzub zzh = new zzrs(new zzub[0]);
    private final IdentityHashMap zzb = new IdentityHashMap();
    private zzsg[] zzg = new zzsg[0];

    public zzsy(zzrt zzrtVar, long[] jArr, zzsg[] zzsgVarArr, byte... bArr) {
        this.zzi = zzrtVar;
        this.zza = zzsgVarArr;
        for (int i = 0; i < zzsgVarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.zza[i] = new zzsw(zzsgVarArr[i], j);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final long zza(long j, zzkd zzkdVar) {
        zzsg[] zzsgVarArr = this.zzg;
        return (zzsgVarArr.length > 0 ? zzsgVarArr[0] : this.zza[0]).zza(j, zzkdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsg, com.google.android.gms.internal.ads.zzub
    public final long zzb() {
        return this.zzh.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzsg, com.google.android.gms.internal.ads.zzub
    public final long zzc() {
        return this.zzh.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final long zzd() {
        long j = -9223372036854775807L;
        for (zzsg zzsgVar : this.zzg) {
            long zzd = zzsgVar.zzd();
            if (zzd != -9223372036854775807L) {
                if (j == -9223372036854775807L) {
                    for (zzsg zzsgVar2 : this.zzg) {
                        if (zzsgVar2 == zzsgVar) {
                            break;
                        }
                        if (zzsgVar2.zze(zzd) != zzd) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j = zzd;
                } else if (zzd != j) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j != -9223372036854775807L && zzsgVar.zze(j) != j) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final long zze(long j) {
        long zze = this.zzg[0].zze(j);
        int i = 1;
        while (true) {
            zzsg[] zzsgVarArr = this.zzg;
            if (i >= zzsgVarArr.length) {
                return zze;
            }
            if (zzsgVarArr[i].zze(zze) != zze) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    @Override // com.google.android.gms.internal.ads.zzsg
    public final long zzf(zzvt[] zzvtVarArr, boolean[] zArr, zztz[] zztzVarArr, boolean[] zArr2, long j) {
        int length;
        zztz zztzVar;
        int length2 = zzvtVarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i = 0;
        while (true) {
            length = zzvtVarArr.length;
            zztzVar = null;
            if (i >= length) {
                break;
            }
            zztz zztzVar2 = zztzVarArr[i];
            Integer num = zztzVar2 != null ? (Integer) this.zzb.get(zztzVar2) : null;
            iArr[i] = num == null ? -1 : num.intValue();
            iArr2[i] = -1;
            zzvt zzvtVar = zzvtVarArr[i];
            if (zzvtVar != null) {
                zzcp zzcpVar = (zzcp) this.zzd.get(zzvtVar.zze());
                Objects.requireNonNull(zzcpVar);
                int i2 = 0;
                while (true) {
                    zzsg[] zzsgVarArr = this.zza;
                    if (i2 >= zzsgVarArr.length) {
                        break;
                    }
                    if (zzsgVarArr[i2].zzh().zza(zzcpVar) != -1) {
                        iArr2[i] = i2;
                        break;
                    }
                    i2++;
                }
            }
            i++;
        }
        this.zzb.clear();
        zztz[] zztzVarArr2 = new zztz[length];
        zztz[] zztzVarArr3 = new zztz[length];
        ArrayList arrayList = new ArrayList(this.zza.length);
        long j2 = j;
        int i3 = 0;
        zzvt[] zzvtVarArr2 = new zzvt[length];
        while (i3 < this.zza.length) {
            for (int i4 = 0; i4 < zzvtVarArr.length; i4++) {
                zztzVarArr3[i4] = iArr[i4] == i3 ? zztzVarArr[i4] : zztzVar;
                if (iArr2[i4] == i3) {
                    zzvt zzvtVar2 = zzvtVarArr[i4];
                    Objects.requireNonNull(zzvtVar2);
                    zzcp zzcpVar2 = (zzcp) this.zzd.get(zzvtVar2.zze());
                    Objects.requireNonNull(zzcpVar2);
                    zzvtVarArr2[i4] = new zzsv(zzvtVar2, zzcpVar2);
                } else {
                    zzvtVarArr2[i4] = zztzVar;
                }
            }
            int i5 = i3;
            ArrayList arrayList2 = arrayList;
            zztz[] zztzVarArr4 = zztzVarArr3;
            zzvt[] zzvtVarArr3 = zzvtVarArr2;
            long zzf = this.zza[i3].zzf(zzvtVarArr2, zArr, zztzVarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = zzf;
            } else if (zzf != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i6 = 0; i6 < zzvtVarArr.length; i6++) {
                if (iArr2[i6] == i5) {
                    zztz zztzVar3 = zztzVarArr4[i6];
                    Objects.requireNonNull(zztzVar3);
                    zztzVarArr2[i6] = zztzVar3;
                    this.zzb.put(zztzVar3, Integer.valueOf(i5));
                    z = true;
                } else if (iArr[i6] == i5) {
                    zzdd.zzf(zztzVarArr4[i6] == null);
                }
            }
            if (z) {
                arrayList2.add(this.zza[i5]);
            }
            i3 = i5 + 1;
            arrayList = arrayList2;
            zztzVarArr3 = zztzVarArr4;
            zzvtVarArr2 = zzvtVarArr3;
            zztzVar = null;
        }
        System.arraycopy(zztzVarArr2, 0, zztzVarArr, 0, length);
        zzsg[] zzsgVarArr2 = (zzsg[]) arrayList.toArray(new zzsg[0]);
        this.zzg = zzsgVarArr2;
        this.zzh = new zzrs(zzsgVarArr2);
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzua
    public final /* bridge */ /* synthetic */ void zzg(zzub zzubVar) {
        zzsf zzsfVar = this.zze;
        Objects.requireNonNull(zzsfVar);
        zzsfVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final zzuh zzh() {
        zzuh zzuhVar = this.zzf;
        Objects.requireNonNull(zzuhVar);
        return zzuhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzsf
    public final void zzi(zzsg zzsgVar) {
        this.zzc.remove(zzsgVar);
        if (!this.zzc.isEmpty()) {
            return;
        }
        int i = 0;
        for (zzsg zzsgVar2 : this.zza) {
            i += zzsgVar2.zzh().zzc;
        }
        zzcp[] zzcpVarArr = new zzcp[i];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            zzsg[] zzsgVarArr = this.zza;
            if (i2 >= zzsgVarArr.length) {
                this.zzf = new zzuh(zzcpVarArr);
                zzsf zzsfVar = this.zze;
                Objects.requireNonNull(zzsfVar);
                zzsfVar.zzi(this);
                return;
            }
            zzuh zzh = zzsgVarArr[i2].zzh();
            int i4 = zzh.zzc;
            int i5 = 0;
            while (i5 < i4) {
                zzcp zzb = zzh.zzb(i5);
                zzcp zzc = zzb.zzc(i2 + ":" + zzb.zzc);
                this.zzd.put(zzc, zzb);
                zzcpVarArr[i3] = zzc;
                i5++;
                i3++;
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final void zzj(long j, boolean z) {
        for (zzsg zzsgVar : this.zzg) {
            zzsgVar.zzj(j, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final void zzk() throws IOException {
        for (zzsg zzsgVar : this.zza) {
            zzsgVar.zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final void zzl(zzsf zzsfVar, long j) {
        this.zze = zzsfVar;
        Collections.addAll(this.zzc, this.zza);
        for (zzsg zzsgVar : this.zza) {
            zzsgVar.zzl(this, j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsg, com.google.android.gms.internal.ads.zzub
    public final void zzm(long j) {
        this.zzh.zzm(j);
    }

    public final zzsg zzn(int i) {
        zzsg zzsgVar;
        zzsg zzsgVar2 = this.zza[i];
        if (!(zzsgVar2 instanceof zzsw)) {
            return zzsgVar2;
        }
        zzsgVar = ((zzsw) zzsgVar2).zza;
        return zzsgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzsg, com.google.android.gms.internal.ads.zzub
    public final boolean zzo(long j) {
        if (this.zzc.isEmpty()) {
            return this.zzh.zzo(j);
        }
        int size = this.zzc.size();
        for (int i = 0; i < size; i++) {
            ((zzsg) this.zzc.get(i)).zzo(j);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzsg, com.google.android.gms.internal.ads.zzub
    public final boolean zzp() {
        return this.zzh.zzp();
    }
}
