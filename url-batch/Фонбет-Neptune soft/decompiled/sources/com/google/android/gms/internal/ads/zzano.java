package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzano implements zzack {
    private final int zza;
    private final List zzb;
    private final zzek zzc;
    private final SparseIntArray zzd;
    private final zzanr zze;
    private final zzajy zzf;
    private final SparseArray zzg;
    private final SparseBooleanArray zzh;
    private final SparseBooleanArray zzi;
    private final zzanl zzj;
    private zzank zzk;
    private zzacn zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;

    @Deprecated
    public zzano() {
        this(1, 1, zzajy.zza, new zzer(0L), new zzamc(0), 112800);
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x01bb, code lost:
    
        if (r1 == false) goto L97;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    @Override // com.google.android.gms.internal.ads.zzack
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzb(zzacl zzaclVar, zzadf zzadfVar) throws IOException {
        ?? r3;
        long j;
        boolean z;
        long zzd = zzaclVar.zzd();
        if (this.zzn) {
            if (zzd != -1) {
                zzanl zzanlVar = this.zzj;
                if (!zzanlVar.zzd()) {
                    return zzanlVar.zza(zzaclVar, zzadfVar, this.zzr);
                }
            }
            if (this.zzo) {
                j = 0;
            } else {
                this.zzo = true;
                zzanl zzanlVar2 = this.zzj;
                if (zzanlVar2.zzb() != -9223372036854775807L) {
                    j = 0;
                    zzank zzankVar = new zzank(zzanlVar2.zzc(), zzanlVar2.zzb(), zzd, this.zzr, 112800);
                    this.zzk = zzankVar;
                    this.zzl.zzO(zzankVar.zzb());
                } else {
                    j = 0;
                    this.zzl.zzO(new zzadh(zzanlVar2.zzb(), 0L));
                }
            }
            if (this.zzp) {
                z = false;
                this.zzp = false;
                zzi(j, j);
                if (zzaclVar.zzf() != j) {
                    zzadfVar.zza = j;
                    return 1;
                }
            } else {
                z = false;
            }
            zzank zzankVar2 = this.zzk;
            r3 = z;
            if (zzankVar2 != null) {
                r3 = z;
                if (zzankVar2.zze()) {
                    return zzankVar2.zza(zzaclVar, zzadfVar);
                }
            }
        } else {
            r3 = 0;
        }
        zzek zzekVar = this.zzc;
        byte[] zzM = zzekVar.zzM();
        if (9400 - zzekVar.zzd() < 188) {
            int zzb = zzekVar.zzb();
            if (zzb > 0) {
                System.arraycopy(zzM, zzekVar.zzd(), zzM, r3, zzb);
            }
            this.zzc.zzI(zzM, zzb);
        }
        while (true) {
            zzek zzekVar2 = this.zzc;
            if (zzekVar2.zzb() >= 188) {
                int zzd2 = zzekVar2.zzd();
                int zze = zzekVar2.zze();
                int zza = zzanu.zza(zzekVar2.zzM(), zzd2, zze);
                this.zzc.zzK(zza);
                int i = zza + Opcodes.NEWARRAY;
                if (i > zze) {
                    this.zzq += zza - zzd2;
                } else {
                    this.zzq = r3;
                }
                zzek zzekVar3 = this.zzc;
                int zze2 = zzekVar3.zze();
                if (i > zze2) {
                    return r3;
                }
                int zzg = zzekVar3.zzg();
                if ((8388608 & zzg) != 0) {
                    this.zzc.zzK(i);
                    return r3;
                }
                int i2 = (4194304 & zzg) != 0 ? 1 : 0;
                int i3 = zzg & 32;
                int i4 = (zzg >> 8) & 8191;
                zzant zzantVar = (zzg & 16) != 0 ? (zzant) this.zzg.get(i4) : null;
                if (zzantVar == null) {
                    this.zzc.zzK(i);
                    return r3;
                }
                int i5 = zzg & 15;
                int i6 = this.zzd.get(i4, i5 - 1);
                this.zzd.put(i4, i5);
                if (i6 == i5) {
                    this.zzc.zzK(i);
                    return r3;
                }
                if (i5 != ((i6 + 1) & 15)) {
                    zzantVar.zzc();
                }
                if (i3 != 0) {
                    zzek zzekVar4 = this.zzc;
                    int zzm = zzekVar4.zzm();
                    i2 |= (zzekVar4.zzm() & 64) != 0 ? 2 : 0;
                    this.zzc.zzL(zzm - 1);
                }
                boolean z2 = this.zzn;
                if (z2 || !this.zzi.get(i4, r3)) {
                    this.zzc.zzJ(i);
                    zzantVar.zza(this.zzc, i2);
                    this.zzc.zzJ(zze2);
                }
                if (this.zzn && zzd != -1) {
                    this.zzp = true;
                }
                this.zzc.zzK(i);
                return r3;
            }
            int zze3 = zzekVar2.zze();
            int zza2 = zzaclVar.zza(zzM, zze3, 9400 - zze3);
            if (zza2 == -1) {
                for (int i7 = 0; i7 < this.zzg.size(); i7++) {
                    zzant zzantVar2 = (zzant) this.zzg.valueAt(i7);
                    if (zzantVar2 instanceof zzamz) {
                        zzamz zzamzVar = (zzamz) zzantVar2;
                        if (zzamzVar.zzd(r3)) {
                            zzamzVar.zza(new zzek(), 1);
                        }
                    }
                }
                return -1;
            }
            this.zzc.zzJ(zze3 + zza2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final /* synthetic */ zzack zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final /* synthetic */ List zzd() {
        return zzfxr.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zze(zzacn zzacnVar) {
        if (this.zza == 0) {
            zzacnVar = new zzakc(zzacnVar, this.zzf);
        }
        this.zzl = zzacnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zzi(long j, long j2) {
        zzank zzankVar;
        int size = this.zzb.size();
        for (int i = 0; i < size; i++) {
            zzer zzerVar = (zzer) this.zzb.get(i);
            if (zzerVar.zzf() != -9223372036854775807L) {
                long zzd = zzerVar.zzd();
                if (zzd != -9223372036854775807L) {
                    if (zzd != 0) {
                        if (zzd == j2) {
                        }
                    }
                }
            }
            zzerVar.zzi(j2);
        }
        if (j2 != 0 && (zzankVar = this.zzk) != null) {
            zzankVar.zzd(j2);
        }
        this.zzc.zzH(0);
        this.zzd.clear();
        for (int i2 = 0; i2 < this.zzg.size(); i2++) {
            ((zzant) this.zzg.valueAt(i2)).zzc();
        }
        this.zzq = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        r1 = r1 + 1;
     */
    @Override // com.google.android.gms.internal.ads.zzack
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzj(zzacl zzaclVar) throws IOException {
        byte[] zzM = this.zzc.zzM();
        zzaby zzabyVar = (zzaby) zzaclVar;
        zzabyVar.zzm(zzM, 0, 940, false);
        int i = 0;
        while (i < 188) {
            for (int i2 = 0; i2 < 5; i2++) {
                if (zzM[(i2 * Opcodes.NEWARRAY) + i] != 71) {
                    break;
                }
            }
            zzabyVar.zzo(i, false);
            return true;
        }
        return false;
    }

    public zzano(int i, int i2, zzajy zzajyVar, zzer zzerVar, zzanr zzanrVar, int i3) {
        this.zze = zzanrVar;
        this.zza = i2;
        this.zzf = zzajyVar;
        this.zzb = Collections.singletonList(zzerVar);
        this.zzc = new zzek(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.zzh = sparseBooleanArray;
        this.zzi = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.zzg = sparseArray;
        this.zzd = new SparseIntArray();
        this.zzj = new zzanl(112800);
        this.zzl = zzacn.zza;
        this.zzr = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.zzg.put(sparseArray2.keyAt(i4), (zzant) sparseArray2.valueAt(i4));
        }
        this.zzg.put(0, new zzanh(new zzanm(this)));
    }
}
