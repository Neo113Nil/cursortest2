package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.IdentityHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzayf implements zzayc, zzayb {
    public final zzayc[] zza;
    private final IdentityHashMap zzb = new IdentityHashMap();
    private zzayb zzc;
    private int zzd;
    private zzayt zze;
    private zzayc[] zzf;
    private zzayq zzg;

    public zzayf(zzayc... zzaycVarArr) {
        this.zza = zzaycVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzayc
    public final long zzB(zzayx[] zzayxVarArr, boolean[] zArr, zzayo[] zzayoVarArr, boolean[] zArr2, long j) {
        int length;
        zzayo[] zzayoVarArr2 = zzayoVarArr;
        int length2 = zzayxVarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i = 0;
        while (true) {
            length = zzayxVarArr.length;
            if (i >= length) {
                break;
            }
            zzayo zzayoVar = zzayoVarArr2[i];
            iArr[i] = zzayoVar == null ? -1 : ((Integer) this.zzb.get(zzayoVar)).intValue();
            iArr2[i] = -1;
            zzayx zzayxVar = zzayxVarArr[i];
            if (zzayxVar != null) {
                zzays zzd = zzayxVar.zzd();
                int i2 = 0;
                while (true) {
                    zzayc[] zzaycVarArr = this.zza;
                    if (i2 >= zzaycVarArr.length) {
                        break;
                    }
                    if (zzaycVarArr[i2].zzn().zza(zzd) != -1) {
                        iArr2[i] = i2;
                        break;
                    }
                    i2++;
                }
            }
            i++;
        }
        this.zzb.clear();
        zzayo[] zzayoVarArr3 = new zzayo[length];
        zzayo[] zzayoVarArr4 = new zzayo[length];
        zzayx[] zzayxVarArr2 = new zzayx[length];
        ArrayList arrayList = new ArrayList(this.zza.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < this.zza.length) {
            for (int i4 = 0; i4 < zzayxVarArr.length; i4++) {
                zzayx zzayxVar2 = null;
                zzayoVarArr4[i4] = iArr[i4] == i3 ? zzayoVarArr2[i4] : null;
                if (iArr2[i4] == i3) {
                    zzayxVar2 = zzayxVarArr[i4];
                }
                zzayxVarArr2[i4] = zzayxVar2;
            }
            int i5 = i3;
            zzayx[] zzayxVarArr3 = zzayxVarArr2;
            ArrayList arrayList2 = arrayList;
            long zzB = this.zza[i3].zzB(zzayxVarArr2, zArr, zzayoVarArr4, zArr2, j2);
            if (i5 == 0) {
                j2 = zzB;
            } else if (zzB != j2) {
                throw new IllegalStateException("Children enabled at different positions");
            }
            boolean z = false;
            for (int i6 = 0; i6 < zzayxVarArr.length; i6++) {
                if (iArr2[i6] == i5) {
                    zzbac.zze(zzayoVarArr4[i6] != null);
                    zzayo zzayoVar2 = zzayoVarArr4[i6];
                    zzayoVarArr3[i6] = zzayoVar2;
                    this.zzb.put(zzayoVar2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr[i6] == i5) {
                    zzbac.zze(zzayoVarArr4[i6] == null);
                }
            }
            if (z) {
                arrayList2.add(this.zza[i5]);
            }
            i3 = i5 + 1;
            arrayList = arrayList2;
            zzayxVarArr2 = zzayxVarArr3;
            zzayoVarArr2 = zzayoVarArr;
        }
        zzayo[] zzayoVarArr5 = zzayoVarArr2;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(zzayoVarArr3, 0, zzayoVarArr5, 0, length);
        zzayc[] zzaycVarArr2 = new zzayc[arrayList3.size()];
        this.zzf = zzaycVarArr2;
        arrayList3.toArray(zzaycVarArr2);
        this.zzg = new zzaxq(this.zzf);
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzayc, com.google.android.gms.internal.ads.zzayq
    public final long zza() {
        return this.zzg.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzayc, com.google.android.gms.internal.ads.zzayq
    public final boolean zzbj(long j) {
        return this.zzg.zzbj(j);
    }

    @Override // com.google.android.gms.internal.ads.zzayp
    public final /* bridge */ /* synthetic */ void zze(zzayq zzayqVar) {
        if (this.zze == null) {
            return;
        }
        this.zzc.zze(this);
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    public final void zzf(zzayc zzaycVar) {
        int i = this.zzd - 1;
        this.zzd = i;
        if (i > 0) {
            return;
        }
        int i2 = 0;
        for (zzayc zzaycVar2 : this.zza) {
            i2 += zzaycVar2.zzn().zzb;
        }
        zzays[] zzaysVarArr = new zzays[i2];
        int i3 = 0;
        for (zzayc zzaycVar3 : this.zza) {
            zzayt zzn = zzaycVar3.zzn();
            int i4 = zzn.zzb;
            int i5 = 0;
            while (i5 < i4) {
                zzaysVarArr[i3] = zzn.zzb(i5);
                i5++;
                i3++;
            }
        }
        this.zze = new zzayt(zzaysVarArr);
        this.zzc.zzf(this);
    }

    @Override // com.google.android.gms.internal.ads.zzayc
    public final long zzg() {
        long j = Long.MAX_VALUE;
        for (zzayc zzaycVar : this.zzf) {
            long zzg = zzaycVar.zzg();
            if (zzg != Long.MIN_VALUE) {
                j = Math.min(j, zzg);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzayc
    public final long zzh() {
        long zzh = this.zza[0].zzh();
        int i = 1;
        while (true) {
            zzayc[] zzaycVarArr = this.zza;
            if (i >= zzaycVarArr.length) {
                if (zzh != -9223372036854775807L) {
                    for (zzayc zzaycVar : this.zzf) {
                        if (zzaycVar != this.zza[0] && zzaycVar.zzi(zzh) != zzh) {
                            throw new IllegalStateException("Children seeked to different positions");
                        }
                    }
                }
                return zzh;
            }
            if (zzaycVarArr[i].zzh() != -9223372036854775807L) {
                throw new IllegalStateException("Child reported discontinuity");
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayc
    public final long zzi(long j) {
        long zzi = this.zzf[0].zzi(j);
        int i = 1;
        while (true) {
            zzayc[] zzaycVarArr = this.zzf;
            if (i >= zzaycVarArr.length) {
                return zzi;
            }
            if (zzaycVarArr[i].zzi(zzi) != zzi) {
                throw new IllegalStateException("Children seeked to different positions");
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayc
    public final zzayt zzn() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzayc
    public final void zzq(long j) {
        for (zzayc zzaycVar : this.zzf) {
            zzaycVar.zzq(j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayc
    public final void zzs() throws IOException {
        for (zzayc zzaycVar : this.zza) {
            zzaycVar.zzs();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayc
    public final void zzw(zzayb zzaybVar, long j) {
        this.zzc = zzaybVar;
        zzayc[] zzaycVarArr = this.zza;
        this.zzd = zzaycVarArr.length;
        for (zzayc zzaycVar : zzaycVarArr) {
            zzaycVar.zzw(this, j);
        }
    }
}
