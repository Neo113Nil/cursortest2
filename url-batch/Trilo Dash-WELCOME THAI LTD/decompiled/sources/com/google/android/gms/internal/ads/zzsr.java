package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzsr implements zzrz, zzry {
    private final zzrz[] zza;
    private zzry zze;
    private zztz zzf;
    private final zzrm zzi;
    private final ArrayList zzc = new ArrayList();
    private final HashMap zzd = new HashMap();
    private zztt zzh = new zzrl(new zztt[0]);
    private final IdentityHashMap zzb = new IdentityHashMap();
    private zzrz[] zzg = new zzrz[0];

    public zzsr(zzrm zzrmVar, long[] jArr, zzrz[] zzrzVarArr, byte... bArr) {
        this.zzi = zzrmVar;
        this.zza = zzrzVarArr;
        for (int i = 0; i < zzrzVarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.zza[i] = new zzsp(zzrzVarArr[i], j);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final long zza(long j, zzjx zzjxVar) {
        zzrz[] zzrzVarArr = this.zzg;
        return (zzrzVarArr.length > 0 ? zzrzVarArr[0] : this.zza[0]).zza(j, zzjxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzrz, com.google.android.gms.internal.ads.zztt
    public final long zzb() {
        return this.zzh.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzrz, com.google.android.gms.internal.ads.zztt
    public final long zzc() {
        return this.zzh.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final long zzd() {
        long j = -9223372036854775807L;
        for (zzrz zzrzVar : this.zzg) {
            long zzd = zzrzVar.zzd();
            if (zzd != -9223372036854775807L) {
                if (j == -9223372036854775807L) {
                    for (zzrz zzrzVar2 : this.zzg) {
                        if (zzrzVar2 == zzrzVar) {
                            break;
                        }
                        if (zzrzVar2.zze(zzd) != zzd) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j = zzd;
                } else if (zzd != j) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j != -9223372036854775807L && zzrzVar.zze(j) != j) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final long zze(long j) {
        long zze = this.zzg[0].zze(j);
        int i = 1;
        while (true) {
            zzrz[] zzrzVarArr = this.zzg;
            if (i >= zzrzVarArr.length) {
                return zze;
            }
            if (zzrzVarArr[i].zze(zze) != zze) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    @Override // com.google.android.gms.internal.ads.zzrz
    public final long zzf(zzvh[] zzvhVarArr, boolean[] zArr, zztr[] zztrVarArr, boolean[] zArr2, long j) {
        int length;
        zztr zztrVar;
        int length2 = zzvhVarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i = 0;
        while (true) {
            length = zzvhVarArr.length;
            zztrVar = null;
            if (i >= length) {
                break;
            }
            zztr zztrVar2 = zztrVarArr[i];
            Integer num = zztrVar2 != null ? (Integer) this.zzb.get(zztrVar2) : null;
            iArr[i] = num == null ? -1 : num.intValue();
            iArr2[i] = -1;
            zzvh zzvhVar = zzvhVarArr[i];
            if (zzvhVar != null) {
                zzck zzckVar = (zzck) this.zzd.get(zzvhVar.zze());
                Objects.requireNonNull(zzckVar);
                int i2 = 0;
                while (true) {
                    zzrz[] zzrzVarArr = this.zza;
                    if (i2 >= zzrzVarArr.length) {
                        break;
                    }
                    if (zzrzVarArr[i2].zzh().zza(zzckVar) != -1) {
                        iArr2[i] = i2;
                        break;
                    }
                    i2++;
                }
            }
            i++;
        }
        this.zzb.clear();
        zztr[] zztrVarArr2 = new zztr[length];
        zztr[] zztrVarArr3 = new zztr[length];
        ArrayList arrayList = new ArrayList(this.zza.length);
        long j2 = j;
        int i3 = 0;
        zzvh[] zzvhVarArr2 = new zzvh[length];
        while (i3 < this.zza.length) {
            for (int i4 = 0; i4 < zzvhVarArr.length; i4++) {
                zztrVarArr3[i4] = iArr[i4] == i3 ? zztrVarArr[i4] : zztrVar;
                if (iArr2[i4] == i3) {
                    zzvh zzvhVar2 = zzvhVarArr[i4];
                    Objects.requireNonNull(zzvhVar2);
                    zzck zzckVar2 = (zzck) this.zzd.get(zzvhVar2.zze());
                    Objects.requireNonNull(zzckVar2);
                    zzvhVarArr2[i4] = new zzso(zzvhVar2, zzckVar2);
                } else {
                    zzvhVarArr2[i4] = zztrVar;
                }
            }
            int i5 = i3;
            ArrayList arrayList2 = arrayList;
            zztr[] zztrVarArr4 = zztrVarArr3;
            zzvh[] zzvhVarArr3 = zzvhVarArr2;
            long zzf = this.zza[i3].zzf(zzvhVarArr2, zArr, zztrVarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = zzf;
            } else if (zzf != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i6 = 0; i6 < zzvhVarArr.length; i6++) {
                if (iArr2[i6] == i5) {
                    zztr zztrVar3 = zztrVarArr4[i6];
                    Objects.requireNonNull(zztrVar3);
                    zztrVarArr2[i6] = zztrVar3;
                    this.zzb.put(zztrVar3, Integer.valueOf(i5));
                    z = true;
                } else if (iArr[i6] == i5) {
                    zzcw.zzf(zztrVarArr4[i6] == null);
                }
            }
            if (z) {
                arrayList2.add(this.zza[i5]);
            }
            i3 = i5 + 1;
            arrayList = arrayList2;
            zztrVarArr3 = zztrVarArr4;
            zzvhVarArr2 = zzvhVarArr3;
            zztrVar = null;
        }
        System.arraycopy(zztrVarArr2, 0, zztrVarArr, 0, length);
        zzrz[] zzrzVarArr2 = (zzrz[]) arrayList.toArray(new zzrz[0]);
        this.zzg = zzrzVarArr2;
        this.zzh = new zzrl(zzrzVarArr2);
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzts
    public final /* bridge */ /* synthetic */ void zzg(zztt zzttVar) {
        zzry zzryVar = this.zze;
        Objects.requireNonNull(zzryVar);
        zzryVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final zztz zzh() {
        zztz zztzVar = this.zzf;
        Objects.requireNonNull(zztzVar);
        return zztzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final void zzi(zzrz zzrzVar) {
        this.zzc.remove(zzrzVar);
        if (!this.zzc.isEmpty()) {
            return;
        }
        int i = 0;
        for (zzrz zzrzVar2 : this.zza) {
            i += zzrzVar2.zzh().zzc;
        }
        zzck[] zzckVarArr = new zzck[i];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            zzrz[] zzrzVarArr = this.zza;
            if (i2 >= zzrzVarArr.length) {
                this.zzf = new zztz(zzckVarArr);
                zzry zzryVar = this.zze;
                Objects.requireNonNull(zzryVar);
                zzryVar.zzi(this);
                return;
            }
            zztz zzh = zzrzVarArr[i2].zzh();
            int i4 = zzh.zzc;
            int i5 = 0;
            while (i5 < i4) {
                zzck zzb = zzh.zzb(i5);
                zzck zzc = zzb.zzc(i2 + ":" + zzb.zzc);
                this.zzd.put(zzc, zzb);
                zzckVarArr[i3] = zzc;
                i5++;
                i3++;
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final void zzj(long j, boolean z) {
        for (zzrz zzrzVar : this.zzg) {
            zzrzVar.zzj(j, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final void zzk() throws IOException {
        for (zzrz zzrzVar : this.zza) {
            zzrzVar.zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final void zzl(zzry zzryVar, long j) {
        this.zze = zzryVar;
        Collections.addAll(this.zzc, this.zza);
        for (zzrz zzrzVar : this.zza) {
            zzrzVar.zzl(this, j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrz, com.google.android.gms.internal.ads.zztt
    public final void zzm(long j) {
        this.zzh.zzm(j);
    }

    public final zzrz zzn(int i) {
        zzrz zzrzVar;
        zzrz zzrzVar2 = this.zza[i];
        if (!(zzrzVar2 instanceof zzsp)) {
            return zzrzVar2;
        }
        zzrzVar = ((zzsp) zzrzVar2).zza;
        return zzrzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzrz, com.google.android.gms.internal.ads.zztt
    public final boolean zzo(long j) {
        if (this.zzc.isEmpty()) {
            return this.zzh.zzo(j);
        }
        int size = this.zzc.size();
        for (int i = 0; i < size; i++) {
            ((zzrz) this.zzc.get(i)).zzo(j);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzrz, com.google.android.gms.internal.ads.zztt
    public final boolean zzp() {
        return this.zzh.zzp();
    }
}
