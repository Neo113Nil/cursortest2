package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes11.dex */
public final class zzarr implements zzagh {
    private final int zza;
    private final List zzb;
    private final zzeu zzc;
    private final SparseIntArray zzd;
    private final zzaru zze;
    private final zzanx zzf;
    private final SparseArray zzg;
    private final SparseBooleanArray zzh;
    private final SparseBooleanArray zzi;
    private final zzarn zzj;
    private zzarm zzk;
    private zzagk zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;

    static {
        int i = zzarq.zza;
    }

    @Deprecated
    public zzarr() {
        this(1, 1, zzanx.zza, new zzfj(0L), new zzaqe(0), 112800);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r1 = r1 + 1;
     */
    @Override // com.google.android.gms.internal.ads.zzagh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zza(zzagi zzagiVar) throws IOException {
        byte[] zzi = this.zzc.zzi();
        zzagiVar.zzi(zzi, 0, 940);
        int i = 0;
        while (i < 188) {
            for (int i2 = 0; i2 < 5; i2++) {
                if (zzi[(i2 * 188) + i] != 71) {
                    break;
                }
            }
            zzagiVar.zzf(i);
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzc(zzagk zzagkVar) {
        if (this.zza == 0) {
            zzagkVar = new zzaoa(zzagkVar, this.zzf);
        }
        this.zzl = zzagkVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    @Override // com.google.android.gms.internal.ads.zzagh
    public final int zzd(zzagi zzagiVar, zzahh zzahhVar) throws IOException {
        ?? r3;
        long j;
        boolean z;
        long zzo = zzagiVar.zzo();
        if (this.zzn) {
            if (zzo != -1) {
                zzarn zzarnVar = this.zzj;
                if (!zzarnVar.zza()) {
                    return zzarnVar.zzb(zzagiVar, zzahhVar, this.zzr);
                }
            }
            if (this.zzo) {
                j = 0;
            } else {
                this.zzo = true;
                zzarn zzarnVar2 = this.zzj;
                if (zzarnVar2.zzc() != -9223372036854775807L) {
                    j = 0;
                    zzarm zzarmVar = new zzarm(zzarnVar2.zzd(), zzarnVar2.zzc(), zzo, this.zzr, 112800);
                    this.zzk = zzarmVar;
                    this.zzl.zzw(zzarmVar.zza());
                } else {
                    j = 0;
                    this.zzl.zzw(new zzahj(zzarnVar2.zzc(), 0L));
                }
            }
            if (this.zzp) {
                z = false;
                this.zzp = false;
                zze(j, j);
                if (zzagiVar.zzn() != j) {
                    zzahhVar.zza = j;
                    return 1;
                }
            } else {
                z = false;
            }
            zzarm zzarmVar2 = this.zzk;
            r3 = z;
            if (zzarmVar2 != null) {
                r3 = z;
                if (zzarmVar2.zzc()) {
                    return zzarmVar2.zzd(zzagiVar, zzahhVar);
                }
            }
        } else {
            r3 = 0;
        }
        zzeu zzeuVar = this.zzc;
        byte[] zzi = zzeuVar.zzi();
        if (9400 - zzeuVar.zzg() < 188) {
            int zzd = zzeuVar.zzd();
            if (zzd > 0) {
                System.arraycopy(zzi, zzeuVar.zzg(), zzi, r3, zzd);
            }
            zzeuVar.zzb(zzi, zzd);
        }
        while (zzeuVar.zzd() < 188) {
            int zze = zzeuVar.zze();
            int zza = zzagiVar.zza(zzi, zze, 9400 - zze);
            if (zza == -1) {
                int i = r3;
                while (true) {
                    SparseArray sparseArray = this.zzg;
                    if (i >= sparseArray.size()) {
                        return -1;
                    }
                    zzarw zzarwVar = (zzarw) sparseArray.valueAt(i);
                    if (zzarwVar instanceof zzara) {
                        zzara zzaraVar = (zzara) zzarwVar;
                        if (zzaraVar.zzd(r3)) {
                            zzaraVar.zzc(new zzeu(), 1);
                        }
                    }
                    i++;
                }
            } else {
                zzeuVar.zzf(zze + zza);
            }
        }
        int zzg = zzeuVar.zzg();
        int zze2 = zzeuVar.zze();
        int zza2 = zzarx.zza(zzeuVar.zzi(), zzg, zze2);
        zzeuVar.zzh(zza2);
        int i2 = zza2 + 188;
        if (i2 > zze2) {
            this.zzq += zza2 - zzg;
        } else {
            this.zzq = r3;
        }
        int zze3 = zzeuVar.zze();
        if (i2 > zze3) {
            return r3;
        }
        int zzB = zzeuVar.zzB();
        if ((8388608 & zzB) != 0) {
            zzeuVar.zzh(i2);
            return r3;
        }
        int i3 = (4194304 & zzB) != 0 ? 1 : r3;
        int i4 = zzB & 32;
        int i5 = (zzB >> 8) & 8191;
        zzarw zzarwVar2 = (zzB & 16) != 0 ? (zzarw) this.zzg.get(i5) : null;
        if (zzarwVar2 == null) {
            zzeuVar.zzh(i2);
            return r3;
        }
        int i6 = zzB & 15;
        SparseIntArray sparseIntArray = this.zzd;
        int i7 = sparseIntArray.get(i5, i6 - 1);
        sparseIntArray.put(i5, i6);
        if (i7 == i6) {
            zzeuVar.zzh(i2);
            return r3;
        }
        if (i6 != ((i7 + 1) & 15)) {
            zzarwVar2.zzb();
        }
        if (i4 != 0) {
            int zzs = zzeuVar.zzs();
            i3 |= (zzeuVar.zzs() & 64) != 0 ? 2 : r3;
            zzeuVar.zzk(zzs - 1);
        }
        boolean z2 = this.zzn;
        if (z2 || !this.zzi.get(i5, r3)) {
            zzeuVar.zzf(i2);
            zzarwVar2.zzc(zzeuVar, i3);
            zzeuVar.zzf(zze3);
        }
        if (!z2 && this.zzn && zzo != -1) {
            this.zzp = true;
        }
        zzeuVar.zzh(i2);
        return r3;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zze(long j, long j2) {
        zzarm zzarmVar;
        List list = this.zzb;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            zzfj zzfjVar = (zzfj) list.get(i);
            if (zzfjVar.zzc() != -9223372036854775807L) {
                long zza = zzfjVar.zza();
                if (zza != -9223372036854775807L) {
                    if (zza != 0) {
                        if (zza == j2) {
                        }
                    }
                }
            }
            zzfjVar.zzd(j2);
        }
        if (j2 != 0 && (zzarmVar = this.zzk) != null) {
            zzarmVar.zzb(j2);
        }
        this.zzc.zza(0);
        this.zzd.clear();
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.zzg;
            if (i2 >= sparseArray.size()) {
                this.zzq = 0;
                return;
            } else {
                ((zzarw) sparseArray.valueAt(i2)).zzb();
                i2++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzf() {
    }

    final /* synthetic */ List zzh() {
        return this.zzb;
    }

    final /* synthetic */ zzaru zzi() {
        return this.zze;
    }

    final /* synthetic */ SparseArray zzj() {
        return this.zzg;
    }

    final /* synthetic */ SparseBooleanArray zzk() {
        return this.zzh;
    }

    final /* synthetic */ SparseBooleanArray zzl() {
        return this.zzi;
    }

    final /* synthetic */ zzagk zzm() {
        return this.zzl;
    }

    final /* synthetic */ int zzn() {
        return this.zzm;
    }

    final /* synthetic */ void zzo(int i) {
        this.zzm = i;
    }

    final /* synthetic */ void zzp(boolean z) {
        this.zzn = true;
    }

    final /* synthetic */ void zzq(int i) {
        this.zzr = i;
    }

    public zzarr(int i, int i2, zzanx zzanxVar, zzfj zzfjVar, zzaru zzaruVar, int i3) {
        this.zze = zzaruVar;
        this.zza = i2;
        this.zzf = zzanxVar;
        this.zzb = Collections.singletonList(zzfjVar);
        this.zzc = new zzeu(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.zzh = sparseBooleanArray;
        this.zzi = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.zzg = sparseArray;
        this.zzd = new SparseIntArray();
        this.zzj = new zzarn(112800);
        this.zzl = zzagk.zza;
        this.zzr = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray zza = zzaruVar.zza();
        int size = zza.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.zzg.put(zza.keyAt(i4), (zzarw) zza.valueAt(i4));
        }
        this.zzg.put(0, new zzari(new zzaro(this)));
    }
}
