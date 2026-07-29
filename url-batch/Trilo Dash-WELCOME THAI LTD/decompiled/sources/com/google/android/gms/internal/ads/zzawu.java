package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import androidx.work.WorkRequest;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzawu implements zzawy, zzatw, zzays, zzaxi {
    private long zzB;
    private int zzD;
    private boolean zzE;
    private boolean zzF;
    private final zzayl zzG;
    private final Uri zza;
    private final zzayi zzb;
    private final int zzc;
    private final Handler zzd;
    private final zzawv zze;
    private final zzawz zzf;
    private final long zzg;
    private final zzaws zzi;
    private zzawx zzo;
    private zzauc zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private boolean zzt;
    private int zzu;
    private zzaxp zzv;
    private long zzw;
    private boolean[] zzx;
    private boolean[] zzy;
    private boolean zzz;
    private final zzayw zzh = new zzayw("Loader:ExtractorMediaPeriod");
    private final zzaza zzj = new zzaza();
    private final Runnable zzk = new zzawn(this);
    private final Runnable zzl = new zzawo(this);
    private final Handler zzm = new Handler();
    private long zzC = -9223372036854775807L;
    private final SparseArray zzn = new SparseArray();
    private long zzA = -1;

    public zzawu(Uri uri, zzayi zzayiVar, zzatv[] zzatvVarArr, int i, Handler handler, zzawv zzawvVar, zzawz zzawzVar, zzayl zzaylVar, String str, int i2, byte[] bArr) {
        this.zza = uri;
        this.zzb = zzayiVar;
        this.zzc = i;
        this.zzd = handler;
        this.zze = zzawvVar;
        this.zzf = zzawzVar;
        this.zzG = zzaylVar;
        this.zzg = i2;
        this.zzi = new zzaws(zzatvVarArr, this);
    }

    private final int zzC() {
        int size = this.zzn.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((zzaxj) this.zzn.valueAt(i2)).zze();
        }
        return i;
    }

    private final long zzD() {
        int size = this.zzn.size();
        long j = Long.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            j = Math.max(j, ((zzaxj) this.zzn.valueAt(i)).zzg());
        }
        return j;
    }

    private final void zzE(zzawr zzawrVar) {
        if (this.zzA == -1) {
            this.zzA = zzawrVar.zzj;
        }
    }

    private final void zzF() {
        zzauc zzaucVar;
        zzawr zzawrVar = new zzawr(this, this.zza, this.zzb, this.zzi, this.zzj);
        if (this.zzr) {
            zzayy.zze(zzG());
            long j = this.zzw;
            if (j != -9223372036854775807L && this.zzC >= j) {
                this.zzE = true;
                this.zzC = -9223372036854775807L;
                return;
            } else {
                zzawrVar.zzd(this.zzp.zzb(this.zzC), this.zzC);
                this.zzC = -9223372036854775807L;
            }
        }
        this.zzD = zzC();
        int i = this.zzc;
        if (i == -1) {
            i = (this.zzr && this.zzA == -1 && ((zzaucVar = this.zzp) == null || zzaucVar.zza() == -9223372036854775807L)) ? 6 : 3;
        }
        this.zzh.zza(zzawrVar, this, i);
    }

    private final boolean zzG() {
        return this.zzC != -9223372036854775807L;
    }

    static /* bridge */ /* synthetic */ void zzp(zzawu zzawuVar) {
        if (zzawuVar.zzF || zzawuVar.zzr || zzawuVar.zzp == null || !zzawuVar.zzq) {
            return;
        }
        int size = zzawuVar.zzn.size();
        for (int i = 0; i < size; i++) {
            if (((zzaxj) zzawuVar.zzn.valueAt(i)).zzh() == null) {
                return;
            }
        }
        zzawuVar.zzj.zzb();
        zzaxo[] zzaxoVarArr = new zzaxo[size];
        zzawuVar.zzy = new boolean[size];
        zzawuVar.zzx = new boolean[size];
        zzawuVar.zzw = zzawuVar.zzp.zza();
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i2 >= size) {
                zzawuVar.zzv = new zzaxp(zzaxoVarArr);
                zzawuVar.zzr = true;
                zzawuVar.zzf.zzg(new zzaxn(zzawuVar.zzw, zzawuVar.zzp.zzc()), null);
                zzawuVar.zzo.zzf(zzawuVar);
                return;
            }
            zzars zzh = ((zzaxj) zzawuVar.zzn.valueAt(i2)).zzh();
            zzaxoVarArr[i2] = new zzaxo(zzh);
            String str = zzh.zzf;
            if (!zzazd.zzb(str) && !zzazd.zza(str)) {
                z = false;
            }
            zzawuVar.zzy[i2] = z;
            zzawuVar.zzz = z | zzawuVar.zzz;
            i2++;
        }
    }

    final boolean zzA(int i) {
        return this.zzE || (!zzG() && ((zzaxj) this.zzn.valueAt(i)).zzm());
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00bc, code lost:
    
        if (r1 != false) goto L46;
     */
    @Override // com.google.android.gms.internal.ads.zzawy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzB(zzaxt[] zzaxtVarArr, boolean[] zArr, zzaxk[] zzaxkVarArr, boolean[] zArr2, long j) {
        zzaxt zzaxtVar;
        int i;
        zzayy.zze(this.zzr);
        for (int i2 = 0; i2 < zzaxtVarArr.length; i2++) {
            zzaxk zzaxkVar = zzaxkVarArr[i2];
            if (zzaxkVar != null && (zzaxtVarArr[i2] == null || !zArr[i2])) {
                i = ((zzawt) zzaxkVar).zzb;
                zzayy.zze(this.zzx[i]);
                this.zzu--;
                this.zzx[i] = false;
                ((zzaxj) this.zzn.valueAt(i)).zzi();
                zzaxkVarArr[i2] = null;
            }
        }
        boolean z = false;
        for (int i3 = 0; i3 < zzaxtVarArr.length; i3++) {
            if (zzaxkVarArr[i3] == null && (zzaxtVar = zzaxtVarArr[i3]) != null) {
                zzaxtVar.zzb();
                zzayy.zze(zzaxtVar.zza(0) == 0);
                int zza = this.zzv.zza(zzaxtVar.zzd());
                zzayy.zze(!this.zzx[zza]);
                this.zzu++;
                this.zzx[zza] = true;
                zzaxkVarArr[i3] = new zzawt(this, zza);
                zArr2[i3] = true;
                z = true;
            }
        }
        if (!this.zzs) {
            int size = this.zzn.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (!this.zzx[i4]) {
                    ((zzaxj) this.zzn.valueAt(i4)).zzi();
                }
            }
        }
        if (this.zzu == 0) {
            this.zzt = false;
            zzayw zzaywVar = this.zzh;
            if (zzaywVar.zzi()) {
                zzaywVar.zzf();
            }
        } else if (!this.zzs) {
            if (j == 0) {
                j = 0;
            }
            j = zzi(j);
            for (int i5 = 0; i5 < zzaxkVarArr.length; i5++) {
                if (zzaxkVarArr[i5] != null) {
                    zArr2[i5] = true;
                }
            }
        }
        this.zzs = true;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzawy, com.google.android.gms.internal.ads.zzaxm
    public final long zza() {
        if (this.zzu == 0) {
            return Long.MIN_VALUE;
        }
        return zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    public final void zzb() {
        this.zzq = true;
        this.zzm.post(this.zzk);
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    public final zzaue zzbi(int i, int i2) {
        zzaxj zzaxjVar = (zzaxj) this.zzn.get(i);
        if (zzaxjVar != null) {
            return zzaxjVar;
        }
        zzaxj zzaxjVar2 = new zzaxj(this.zzG, null);
        zzaxjVar2.zzk(this);
        this.zzn.put(i, zzaxjVar2);
        return zzaxjVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzawy, com.google.android.gms.internal.ads.zzaxm
    public final boolean zzbj(long j) {
        if (this.zzE) {
            return false;
        }
        if (this.zzr && this.zzu == 0) {
            return false;
        }
        boolean zzc = this.zzj.zzc();
        if (this.zzh.zzi()) {
            return zzc;
        }
        zzF();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    public final void zzc(zzauc zzaucVar) {
        this.zzp = zzaucVar;
        this.zzm.post(this.zzk);
    }

    @Override // com.google.android.gms.internal.ads.zzays
    public final /* bridge */ /* synthetic */ int zzd(zzayu zzayuVar, long j, long j2, IOException iOException) {
        zzauc zzaucVar;
        zzawr zzawrVar = (zzawr) zzayuVar;
        zzE(zzawrVar);
        Handler handler = this.zzd;
        if (handler != null) {
            handler.post(new zzawq(this, iOException));
        }
        if (iOException instanceof zzaxq) {
            return 3;
        }
        int zzC = zzC();
        int i = this.zzD;
        if (this.zzA == -1 && ((zzaucVar = this.zzp) == null || zzaucVar.zza() == -9223372036854775807L)) {
            this.zzB = 0L;
            this.zzt = this.zzr;
            int size = this.zzn.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((zzaxj) this.zzn.valueAt(i2)).zzj(!this.zzr || this.zzx[i2]);
            }
            zzawrVar.zzd(0L, 0L);
        }
        this.zzD = zzC();
        return zzC <= i ? 0 : 1;
    }

    final int zze(int i, zzart zzartVar, zzatn zzatnVar, boolean z) {
        if (this.zzt || zzG()) {
            return -3;
        }
        return ((zzaxj) this.zzn.valueAt(i)).zzf(zzartVar, zzatnVar, z, this.zzE, this.zzB);
    }

    @Override // com.google.android.gms.internal.ads.zzawy
    public final long zzg() {
        long zzD;
        if (this.zzE) {
            return Long.MIN_VALUE;
        }
        if (zzG()) {
            return this.zzC;
        }
        if (this.zzz) {
            int size = this.zzn.size();
            zzD = Long.MAX_VALUE;
            for (int i = 0; i < size; i++) {
                if (this.zzy[i]) {
                    zzD = Math.min(zzD, ((zzaxj) this.zzn.valueAt(i)).zzg());
                }
            }
        } else {
            zzD = zzD();
        }
        return zzD == Long.MIN_VALUE ? this.zzB : zzD;
    }

    @Override // com.google.android.gms.internal.ads.zzawy
    public final long zzh() {
        if (!this.zzt) {
            return -9223372036854775807L;
        }
        this.zzt = false;
        return this.zzB;
    }

    @Override // com.google.android.gms.internal.ads.zzawy
    public final long zzi(long j) {
        if (true != this.zzp.zzc()) {
            j = 0;
        }
        this.zzB = j;
        int size = this.zzn.size();
        boolean zzG = true ^ zzG();
        int i = 0;
        while (true) {
            if (!zzG) {
                this.zzC = j;
                this.zzE = false;
                zzayw zzaywVar = this.zzh;
                if (zzaywVar.zzi()) {
                    zzaywVar.zzf();
                } else {
                    for (int i2 = 0; i2 < size; i2++) {
                        ((zzaxj) this.zzn.valueAt(i2)).zzj(this.zzx[i2]);
                    }
                }
            } else {
                if (i >= size) {
                    break;
                }
                if (this.zzx[i]) {
                    zzG = ((zzaxj) this.zzn.valueAt(i)).zzn(j, false);
                }
                i++;
            }
        }
        this.zzt = false;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzawy
    public final zzaxp zzn() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.zzawy
    public final void zzq(long j) {
    }

    final void zzr() throws IOException {
        this.zzh.zzg(Integer.MIN_VALUE);
    }

    @Override // com.google.android.gms.internal.ads.zzawy
    public final void zzs() throws IOException {
        this.zzh.zzg(Integer.MIN_VALUE);
    }

    @Override // com.google.android.gms.internal.ads.zzays
    public final /* bridge */ /* synthetic */ void zzt(zzayu zzayuVar, long j, long j2, boolean z) {
        zzE((zzawr) zzayuVar);
        if (z || this.zzu <= 0) {
            return;
        }
        int size = this.zzn.size();
        for (int i = 0; i < size; i++) {
            ((zzaxj) this.zzn.valueAt(i)).zzj(this.zzx[i]);
        }
        this.zzo.zze(this);
    }

    @Override // com.google.android.gms.internal.ads.zzays
    public final /* bridge */ /* synthetic */ void zzu(zzayu zzayuVar, long j, long j2) {
        zzE((zzawr) zzayuVar);
        this.zzE = true;
        if (this.zzw == -9223372036854775807L) {
            long zzD = zzD();
            long j3 = zzD == Long.MIN_VALUE ? 0L : zzD + WorkRequest.MIN_BACKOFF_MILLIS;
            this.zzw = j3;
            this.zzf.zzg(new zzaxn(j3, this.zzp.zzc()), null);
        }
        this.zzo.zze(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaxi
    public final void zzv(zzars zzarsVar) {
        this.zzm.post(this.zzk);
    }

    @Override // com.google.android.gms.internal.ads.zzawy
    public final void zzw(zzawx zzawxVar, long j) {
        this.zzo = zzawxVar;
        this.zzj.zzc();
        zzF();
    }

    public final void zzx() {
        this.zzh.zzh(new zzawp(this, this.zzi));
        this.zzm.removeCallbacksAndMessages(null);
        this.zzF = true;
    }

    final void zzy(int i, long j) {
        zzaxj zzaxjVar = (zzaxj) this.zzn.valueAt(i);
        if (!this.zzE || j <= zzaxjVar.zzg()) {
            zzaxjVar.zzn(j, true);
        } else {
            zzaxjVar.zzl();
        }
    }
}
