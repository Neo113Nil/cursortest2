package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.IdentityHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzaxb implements zzawy, zzawx {
    public final zzawy[] zza;
    private final IdentityHashMap zzb = new IdentityHashMap();
    private zzawx zzc;
    private int zzd;
    private zzaxp zze;
    private zzawy[] zzf;
    private zzaxm zzg;

    public zzaxb(zzawy... zzawyVarArr) {
        this.zza = zzawyVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzawy
    public final long zzB(zzaxt[] zzaxtVarArr, boolean[] zArr, zzaxk[] zzaxkVarArr, boolean[] zArr2, long j) {
        int length;
        zzaxk[] zzaxkVarArr2 = zzaxkVarArr;
        int length2 = zzaxtVarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i = 0;
        while (true) {
            length = zzaxtVarArr.length;
            if (i >= length) {
                break;
            }
            zzaxk zzaxkVar = zzaxkVarArr2[i];
            iArr[i] = zzaxkVar == null ? -1 : ((Integer) this.zzb.get(zzaxkVar)).intValue();
            iArr2[i] = -1;
            zzaxt zzaxtVar = zzaxtVarArr[i];
            if (zzaxtVar != null) {
                zzaxo zzd = zzaxtVar.zzd();
                int i2 = 0;
                while (true) {
                    zzawy[] zzawyVarArr = this.zza;
                    if (i2 >= zzawyVarArr.length) {
                        break;
                    }
                    if (zzawyVarArr[i2].zzn().zza(zzd) != -1) {
                        iArr2[i] = i2;
                        break;
                    }
                    i2++;
                }
            }
            i++;
        }
        this.zzb.clear();
        zzaxk[] zzaxkVarArr3 = new zzaxk[length];
        zzaxk[] zzaxkVarArr4 = new zzaxk[length];
        zzaxt[] zzaxtVarArr2 = new zzaxt[length];
        ArrayList arrayList = new ArrayList(this.zza.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < this.zza.length) {
            for (int i4 = 0; i4 < zzaxtVarArr.length; i4++) {
                zzaxt zzaxtVar2 = null;
                zzaxkVarArr4[i4] = iArr[i4] == i3 ? zzaxkVarArr2[i4] : null;
                if (iArr2[i4] == i3) {
                    zzaxtVar2 = zzaxtVarArr[i4];
                }
                zzaxtVarArr2[i4] = zzaxtVar2;
            }
            int i5 = i3;
            zzaxt[] zzaxtVarArr3 = zzaxtVarArr2;
            ArrayList arrayList2 = arrayList;
            long zzB = this.zza[i3].zzB(zzaxtVarArr2, zArr, zzaxkVarArr4, zArr2, j2);
            if (i5 == 0) {
                j2 = zzB;
            } else if (zzB != j2) {
                throw new IllegalStateException("Children enabled at different positions");
            }
            boolean z = false;
            for (int i6 = 0; i6 < zzaxtVarArr.length; i6++) {
                if (iArr2[i6] == i5) {
                    zzayy.zze(zzaxkVarArr4[i6] != null);
                    zzaxk zzaxkVar2 = zzaxkVarArr4[i6];
                    zzaxkVarArr3[i6] = zzaxkVar2;
                    this.zzb.put(zzaxkVar2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr[i6] == i5) {
                    zzayy.zze(zzaxkVarArr4[i6] == null);
                }
            }
            if (z) {
                arrayList2.add(this.zza[i5]);
            }
            i3 = i5 + 1;
            arrayList = arrayList2;
            zzaxtVarArr2 = zzaxtVarArr3;
            zzaxkVarArr2 = zzaxkVarArr;
        }
        zzaxk[] zzaxkVarArr5 = zzaxkVarArr2;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(zzaxkVarArr3, 0, zzaxkVarArr5, 0, length);
        zzawy[] zzawyVarArr2 = new zzawy[arrayList3.size()];
        this.zzf = zzawyVarArr2;
        arrayList3.toArray(zzawyVarArr2);
        this.zzg = new zzawm(this.zzf);
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzawy, com.google.android.gms.internal.ads.zzaxm
    public final long zza() {
        return this.zzg.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzawy, com.google.android.gms.internal.ads.zzaxm
    public final boolean zzbj(long j) {
        return this.zzg.zzbj(j);
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    public final /* bridge */ /* synthetic */ void zze(zzaxm zzaxmVar) {
        if (this.zze == null) {
            return;
        }
        this.zzc.zze(this);
    }

    @Override // com.google.android.gms.internal.ads.zzawx
    public final void zzf(zzawy zzawyVar) {
        int i = this.zzd - 1;
        this.zzd = i;
        if (i > 0) {
            return;
        }
        int i2 = 0;
        for (zzawy zzawyVar2 : this.zza) {
            i2 += zzawyVar2.zzn().zzb;
        }
        zzaxo[] zzaxoVarArr = new zzaxo[i2];
        int i3 = 0;
        for (zzawy zzawyVar3 : this.zza) {
            zzaxp zzn = zzawyVar3.zzn();
            int i4 = zzn.zzb;
            int i5 = 0;
            while (i5 < i4) {
                zzaxoVarArr[i3] = zzn.zzb(i5);
                i5++;
                i3++;
            }
        }
        this.zze = new zzaxp(zzaxoVarArr);
        this.zzc.zzf(this);
    }

    @Override // com.google.android.gms.internal.ads.zzawy
    public final long zzg() {
        long j = Long.MAX_VALUE;
        for (zzawy zzawyVar : this.zzf) {
            long zzg = zzawyVar.zzg();
            if (zzg != Long.MIN_VALUE) {
                j = Math.min(j, zzg);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzawy
    public final long zzh() {
        long zzh = this.zza[0].zzh();
        int i = 1;
        while (true) {
            zzawy[] zzawyVarArr = this.zza;
            if (i >= zzawyVarArr.length) {
                if (zzh != -9223372036854775807L) {
                    for (zzawy zzawyVar : this.zzf) {
                        if (zzawyVar != this.zza[0] && zzawyVar.zzi(zzh) != zzh) {
                            throw new IllegalStateException("Children seeked to different positions");
                        }
                    }
                }
                return zzh;
            }
            if (zzawyVarArr[i].zzh() != -9223372036854775807L) {
                throw new IllegalStateException("Child reported discontinuity");
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawy
    public final long zzi(long j) {
        long zzi = this.zzf[0].zzi(j);
        int i = 1;
        while (true) {
            zzawy[] zzawyVarArr = this.zzf;
            if (i >= zzawyVarArr.length) {
                return zzi;
            }
            if (zzawyVarArr[i].zzi(zzi) != zzi) {
                throw new IllegalStateException("Children seeked to different positions");
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawy
    public final zzaxp zzn() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzawy
    public final void zzq(long j) {
        for (zzawy zzawyVar : this.zzf) {
            zzawyVar.zzq(j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawy
    public final void zzs() throws IOException {
        for (zzawy zzawyVar : this.zza) {
            zzawyVar.zzs();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawy
    public final void zzw(zzawx zzawxVar, long j) {
        this.zzc = zzawxVar;
        zzawy[] zzawyVarArr = this.zza;
        this.zzd = zzawyVarArr.length;
        for (zzawy zzawyVar : zzawyVarArr) {
            zzawyVar.zzw(this, j);
        }
    }
}
