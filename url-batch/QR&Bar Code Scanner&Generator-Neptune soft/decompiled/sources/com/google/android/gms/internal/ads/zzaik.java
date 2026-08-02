package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzaik implements zzzi {
    public static final zzzp zza = new zzzp() { // from class: com.google.android.gms.internal.ads.zzaih
        @Override // com.google.android.gms.internal.ads.zzzp
        public final zzzi[] zza() {
            zzzp zzzpVar = zzaik.zza;
            return new zzzi[]{new zzaik(0)};
        }

        @Override // com.google.android.gms.internal.ads.zzzp
        public final /* synthetic */ zzzi[] zzb(Uri uri, Map map) {
            return zzzo.zza(this, uri, map);
        }
    };
    private final List zzb;
    private final zzef zzc;
    private final SparseIntArray zzd;
    private final zzain zze;
    private final SparseArray zzf;
    private final SparseBooleanArray zzg;
    private final SparseBooleanArray zzh;
    private final zzaig zzi;
    private zzaif zzj;
    private zzzl zzk;
    private int zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private int zzp;
    private int zzq;

    public zzaik() {
        this(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0194, code lost:
    
        if (r1 == false) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    @Override // com.google.android.gms.internal.ads.zzzi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zza(zzzj zzzjVar, zzaai zzaaiVar) throws IOException {
        ?? r3;
        long j;
        boolean z;
        long zzd = zzzjVar.zzd();
        if (this.zzm) {
            if (zzd != -1) {
                zzaig zzaigVar = this.zzi;
                if (!zzaigVar.zzd()) {
                    return zzaigVar.zza(zzzjVar, zzaaiVar, this.zzq);
                }
            }
            if (this.zzn) {
                j = 0;
            } else {
                this.zzn = true;
                zzaig zzaigVar2 = this.zzi;
                if (zzaigVar2.zzb() != -9223372036854775807L) {
                    j = 0;
                    zzaif zzaifVar = new zzaif(zzaigVar2.zzc(), zzaigVar2.zzb(), zzd, this.zzq, 112800);
                    this.zzj = zzaifVar;
                    this.zzk.zzN(zzaifVar.zzb());
                } else {
                    j = 0;
                    this.zzk.zzN(new zzaak(zzaigVar2.zzb(), 0L));
                }
            }
            if (this.zzo) {
                z = false;
                this.zzo = false;
                zzc(j, j);
                if (zzzjVar.zzf() != j) {
                    zzaaiVar.zza = j;
                    return 1;
                }
            } else {
                z = false;
            }
            zzaif zzaifVar2 = this.zzj;
            r3 = z;
            if (zzaifVar2 != null) {
                r3 = z;
                if (zzaifVar2.zze()) {
                    return zzaifVar2.zza(zzzjVar, zzaaiVar);
                }
            }
        } else {
            r3 = 0;
        }
        zzef zzefVar = this.zzc;
        byte[] zzH = zzefVar.zzH();
        if (9400 - zzefVar.zzc() < 188) {
            int zza2 = zzefVar.zza();
            if (zza2 > 0) {
                System.arraycopy(zzH, zzefVar.zzc(), zzH, r3, zza2);
            }
            this.zzc.zzD(zzH, zza2);
        }
        while (true) {
            zzef zzefVar2 = this.zzc;
            if (zzefVar2.zza() >= 188) {
                int zzc = zzefVar2.zzc();
                int zzd2 = zzefVar2.zzd();
                int zza3 = zzaiq.zza(zzefVar2.zzH(), zzc, zzd2);
                this.zzc.zzF(zza3);
                int i = zza3 + 188;
                if (i > zzd2) {
                    this.zzp += zza3 - zzc;
                } else {
                    this.zzp = r3;
                }
                zzef zzefVar3 = this.zzc;
                int zzd3 = zzefVar3.zzd();
                if (i > zzd3) {
                    return r3;
                }
                int zze = zzefVar3.zze();
                if ((8388608 & zze) != 0) {
                    this.zzc.zzF(i);
                    return r3;
                }
                int i2 = (4194304 & zze) != 0 ? 1 : r3;
                int i3 = (zze >> 8) & 8191;
                int i4 = zze & 32;
                zzaip zzaipVar = (zze & 16) != 0 ? (zzaip) this.zzf.get(i3) : null;
                if (zzaipVar == null) {
                    this.zzc.zzF(i);
                    return r3;
                }
                int i5 = zze & 15;
                int i6 = this.zzd.get(i3, i5 - 1);
                this.zzd.put(i3, i5);
                if (i6 == i5) {
                    this.zzc.zzF(i);
                    return r3;
                }
                if (i5 != ((i6 + 1) & 15)) {
                    zzaipVar.zzc();
                }
                if (i4 != 0) {
                    int zzk = this.zzc.zzk();
                    i2 |= (this.zzc.zzk() & 64) != 0 ? 2 : r3;
                    this.zzc.zzG(zzk - 1);
                }
                boolean z2 = this.zzm;
                if (z2 || !this.zzh.get(i3, r3)) {
                    this.zzc.zzE(i);
                    zzaipVar.zza(this.zzc, i2);
                    this.zzc.zzE(zzd3);
                }
                if (this.zzm && zzd != -1) {
                    this.zzo = true;
                }
                this.zzc.zzF(i);
                return r3;
            }
            int zzd4 = zzefVar2.zzd();
            int zza4 = zzzjVar.zza(zzH, zzd4, 9400 - zzd4);
            if (zza4 == -1) {
                return -1;
            }
            this.zzc.zzE(zzd4 + zza4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final void zzb(zzzl zzzlVar) {
        this.zzk = zzzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final void zzc(long j, long j2) {
        zzaif zzaifVar;
        int size = this.zzb.size();
        for (int i = 0; i < size; i++) {
            zzel zzelVar = (zzel) this.zzb.get(i);
            if (zzelVar.zze() != -9223372036854775807L) {
                long zzc = zzelVar.zzc();
                if (zzc != -9223372036854775807L) {
                    if (zzc != 0) {
                        if (zzc == j2) {
                        }
                    }
                }
            }
            zzelVar.zzf(j2);
        }
        if (j2 != 0 && (zzaifVar = this.zzj) != null) {
            zzaifVar.zzd(j2);
        }
        this.zzc.zzC(0);
        this.zzd.clear();
        for (int i2 = 0; i2 < this.zzf.size(); i2++) {
            ((zzaip) this.zzf.valueAt(i2)).zzc();
        }
        this.zzp = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        r2 = r2 + 1;
     */
    @Override // com.google.android.gms.internal.ads.zzzi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzd(zzzj zzzjVar) throws IOException {
        byte[] zzH = this.zzc.zzH();
        zzyy zzyyVar = (zzyy) zzzjVar;
        zzyyVar.zzm(zzH, 0, 940, false);
        int i = 0;
        while (i < 188) {
            for (int i2 = 0; i2 < 5; i2++) {
                if (zzH[(i2 * 188) + i] != 71) {
                    break;
                }
            }
            zzyyVar.zzo(i, false);
            return true;
        }
        return false;
    }

    public zzaik(int i) {
        this(1, 0, 112800);
    }

    public zzaik(int i, int i2, int i3) {
        zzel zzelVar = new zzel(0L);
        this.zze = new zzagz(0);
        this.zzb = Collections.singletonList(zzelVar);
        this.zzc = new zzef(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.zzg = sparseBooleanArray;
        this.zzh = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.zzf = sparseArray;
        this.zzd = new SparseIntArray();
        this.zzi = new zzaig(112800);
        this.zzk = zzzl.zza;
        this.zzq = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.zzf.put(sparseArray2.keyAt(i4), (zzaip) sparseArray2.valueAt(i4));
        }
        this.zzf.put(0, new zzaic(new zzaii(this)));
    }
}
