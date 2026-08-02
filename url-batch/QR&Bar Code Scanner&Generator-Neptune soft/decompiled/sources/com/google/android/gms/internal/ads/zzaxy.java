package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import androidx.work.WorkRequest;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzaxy implements zzayc, zzava, zzazw, zzaym {
    private long zzB;
    private int zzD;
    private boolean zzE;
    private boolean zzF;
    private final zzazp zzG;
    private final Uri zza;
    private final zzazm zzb;
    private final int zzc;
    private final Handler zzd;
    private final zzaxz zze;
    private final zzayd zzf;
    private final long zzg;
    private final zzaxw zzi;
    private zzayb zzo;
    private zzavg zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private boolean zzt;
    private int zzu;
    private zzayt zzv;
    private long zzw;
    private boolean[] zzx;
    private boolean[] zzy;
    private boolean zzz;
    private final zzbaa zzh = new zzbaa("Loader:ExtractorMediaPeriod");
    private final zzbae zzj = new zzbae();
    private final Runnable zzk = new zzaxr(this);
    private final Runnable zzl = new zzaxs(this);
    private final Handler zzm = new Handler();
    private long zzC = -9223372036854775807L;
    private final SparseArray zzn = new SparseArray();
    private long zzA = -1;

    public zzaxy(Uri uri, zzazm zzazmVar, zzauz[] zzauzVarArr, int i, Handler handler, zzaxz zzaxzVar, zzayd zzaydVar, zzazp zzazpVar, String str, int i2, byte[] bArr) {
        this.zza = uri;
        this.zzb = zzazmVar;
        this.zzc = i;
        this.zzd = handler;
        this.zze = zzaxzVar;
        this.zzf = zzaydVar;
        this.zzG = zzazpVar;
        this.zzg = i2;
        this.zzi = new zzaxw(zzauzVarArr, this);
    }

    private final int zzC() {
        int size = this.zzn.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((zzayn) this.zzn.valueAt(i2)).zze();
        }
        return i;
    }

    private final long zzD() {
        int size = this.zzn.size();
        long j = Long.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            j = Math.max(j, ((zzayn) this.zzn.valueAt(i)).zzg());
        }
        return j;
    }

    private final void zzE(zzaxv zzaxvVar) {
        if (this.zzA == -1) {
            this.zzA = zzaxvVar.zzj;
        }
    }

    private final void zzF() {
        zzavg zzavgVar;
        zzaxv zzaxvVar = new zzaxv(this, this.zza, this.zzb, this.zzi, this.zzj);
        if (this.zzr) {
            zzbac.zze(zzG());
            long j = this.zzw;
            if (j != -9223372036854775807L && this.zzC >= j) {
                this.zzE = true;
                this.zzC = -9223372036854775807L;
                return;
            } else {
                zzaxvVar.zzd(this.zzp.zzb(this.zzC), this.zzC);
                this.zzC = -9223372036854775807L;
            }
        }
        this.zzD = zzC();
        int i = this.zzc;
        if (i == -1) {
            i = (this.zzr && this.zzA == -1 && ((zzavgVar = this.zzp) == null || zzavgVar.zza() == -9223372036854775807L)) ? 6 : 3;
        }
        this.zzh.zza(zzaxvVar, this, i);
    }

    private final boolean zzG() {
        return this.zzC != -9223372036854775807L;
    }

    static /* bridge */ /* synthetic */ void zzp(zzaxy zzaxyVar) {
        if (zzaxyVar.zzF || zzaxyVar.zzr || zzaxyVar.zzp == null || !zzaxyVar.zzq) {
            return;
        }
        int size = zzaxyVar.zzn.size();
        for (int i = 0; i < size; i++) {
            if (((zzayn) zzaxyVar.zzn.valueAt(i)).zzh() == null) {
                return;
            }
        }
        zzaxyVar.zzj.zzb();
        zzays[] zzaysVarArr = new zzays[size];
        zzaxyVar.zzy = new boolean[size];
        zzaxyVar.zzx = new boolean[size];
        zzaxyVar.zzw = zzaxyVar.zzp.zza();
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i2 >= size) {
                zzaxyVar.zzv = new zzayt(zzaysVarArr);
                zzaxyVar.zzr = true;
                zzaxyVar.zzf.zzg(new zzayr(zzaxyVar.zzw, zzaxyVar.zzp.zzc()), null);
                zzaxyVar.zzo.zzf(zzaxyVar);
                return;
            }
            zzasw zzh = ((zzayn) zzaxyVar.zzn.valueAt(i2)).zzh();
            zzaysVarArr[i2] = new zzays(zzh);
            String str = zzh.zzf;
            if (!zzbah.zzb(str) && !zzbah.zza(str)) {
                z = false;
            }
            zzaxyVar.zzy[i2] = z;
            zzaxyVar.zzz = z | zzaxyVar.zzz;
            i2++;
        }
    }

    final boolean zzA(int i) {
        return this.zzE || (!zzG() && ((zzayn) this.zzn.valueAt(i)).zzm());
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00bc, code lost:
    
        if (r1 != false) goto L46;
     */
    @Override // com.google.android.gms.internal.ads.zzayc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzB(zzayx[] zzayxVarArr, boolean[] zArr, zzayo[] zzayoVarArr, boolean[] zArr2, long j) {
        zzayx zzayxVar;
        int i;
        zzbac.zze(this.zzr);
        for (int i2 = 0; i2 < zzayxVarArr.length; i2++) {
            zzayo zzayoVar = zzayoVarArr[i2];
            if (zzayoVar != null && (zzayxVarArr[i2] == null || !zArr[i2])) {
                i = ((zzaxx) zzayoVar).zzb;
                zzbac.zze(this.zzx[i]);
                this.zzu--;
                this.zzx[i] = false;
                ((zzayn) this.zzn.valueAt(i)).zzi();
                zzayoVarArr[i2] = null;
            }
        }
        boolean z = false;
        for (int i3 = 0; i3 < zzayxVarArr.length; i3++) {
            if (zzayoVarArr[i3] == null && (zzayxVar = zzayxVarArr[i3]) != null) {
                zzayxVar.zzb();
                zzbac.zze(zzayxVar.zza(0) == 0);
                int zza = this.zzv.zza(zzayxVar.zzd());
                zzbac.zze(!this.zzx[zza]);
                this.zzu++;
                this.zzx[zza] = true;
                zzayoVarArr[i3] = new zzaxx(this, zza);
                zArr2[i3] = true;
                z = true;
            }
        }
        if (!this.zzs) {
            int size = this.zzn.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (!this.zzx[i4]) {
                    ((zzayn) this.zzn.valueAt(i4)).zzi();
                }
            }
        }
        if (this.zzu == 0) {
            this.zzt = false;
            zzbaa zzbaaVar = this.zzh;
            if (zzbaaVar.zzi()) {
                zzbaaVar.zzf();
            }
        } else if (!this.zzs) {
            if (j == 0) {
                j = 0;
            }
            j = zzi(j);
            for (int i5 = 0; i5 < zzayoVarArr.length; i5++) {
                if (zzayoVarArr[i5] != null) {
                    zArr2[i5] = true;
                }
            }
        }
        this.zzs = true;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzayc, com.google.android.gms.internal.ads.zzayq
    public final long zza() {
        if (this.zzu == 0) {
            return Long.MIN_VALUE;
        }
        return zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzava
    public final void zzb() {
        this.zzq = true;
        this.zzm.post(this.zzk);
    }

    @Override // com.google.android.gms.internal.ads.zzava
    public final zzavi zzbi(int i, int i2) {
        zzayn zzaynVar = (zzayn) this.zzn.get(i);
        if (zzaynVar != null) {
            return zzaynVar;
        }
        zzayn zzaynVar2 = new zzayn(this.zzG, null);
        zzaynVar2.zzk(this);
        this.zzn.put(i, zzaynVar2);
        return zzaynVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzayc, com.google.android.gms.internal.ads.zzayq
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

    @Override // com.google.android.gms.internal.ads.zzava
    public final void zzc(zzavg zzavgVar) {
        this.zzp = zzavgVar;
        this.zzm.post(this.zzk);
    }

    @Override // com.google.android.gms.internal.ads.zzazw
    public final /* bridge */ /* synthetic */ int zzd(zzazy zzazyVar, long j, long j2, IOException iOException) {
        zzavg zzavgVar;
        zzaxv zzaxvVar = (zzaxv) zzazyVar;
        zzE(zzaxvVar);
        Handler handler = this.zzd;
        if (handler != null) {
            handler.post(new zzaxu(this, iOException));
        }
        if (iOException instanceof zzayu) {
            return 3;
        }
        int zzC = zzC();
        int i = this.zzD;
        if (this.zzA == -1 && ((zzavgVar = this.zzp) == null || zzavgVar.zza() == -9223372036854775807L)) {
            this.zzB = 0L;
            this.zzt = this.zzr;
            int size = this.zzn.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((zzayn) this.zzn.valueAt(i2)).zzj(!this.zzr || this.zzx[i2]);
            }
            zzaxvVar.zzd(0L, 0L);
        }
        this.zzD = zzC();
        return zzC <= i ? 0 : 1;
    }

    final int zze(int i, zzasx zzasxVar, zzaur zzaurVar, boolean z) {
        if (this.zzt || zzG()) {
            return -3;
        }
        return ((zzayn) this.zzn.valueAt(i)).zzf(zzasxVar, zzaurVar, z, this.zzE, this.zzB);
    }

    @Override // com.google.android.gms.internal.ads.zzayc
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
                    zzD = Math.min(zzD, ((zzayn) this.zzn.valueAt(i)).zzg());
                }
            }
        } else {
            zzD = zzD();
        }
        return zzD == Long.MIN_VALUE ? this.zzB : zzD;
    }

    @Override // com.google.android.gms.internal.ads.zzayc
    public final long zzh() {
        if (!this.zzt) {
            return -9223372036854775807L;
        }
        this.zzt = false;
        return this.zzB;
    }

    @Override // com.google.android.gms.internal.ads.zzayc
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
                zzbaa zzbaaVar = this.zzh;
                if (zzbaaVar.zzi()) {
                    zzbaaVar.zzf();
                } else {
                    for (int i2 = 0; i2 < size; i2++) {
                        ((zzayn) this.zzn.valueAt(i2)).zzj(this.zzx[i2]);
                    }
                }
            } else {
                if (i >= size) {
                    break;
                }
                if (this.zzx[i]) {
                    zzG = ((zzayn) this.zzn.valueAt(i)).zzn(j, false);
                }
                i++;
            }
        }
        this.zzt = false;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzayc
    public final zzayt zzn() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.zzayc
    public final void zzq(long j) {
    }

    final void zzr() throws IOException {
        this.zzh.zzg(Integer.MIN_VALUE);
    }

    @Override // com.google.android.gms.internal.ads.zzayc
    public final void zzs() throws IOException {
        this.zzh.zzg(Integer.MIN_VALUE);
    }

    @Override // com.google.android.gms.internal.ads.zzazw
    public final /* bridge */ /* synthetic */ void zzt(zzazy zzazyVar, long j, long j2, boolean z) {
        zzE((zzaxv) zzazyVar);
        if (z || this.zzu <= 0) {
            return;
        }
        int size = this.zzn.size();
        for (int i = 0; i < size; i++) {
            ((zzayn) this.zzn.valueAt(i)).zzj(this.zzx[i]);
        }
        this.zzo.zze(this);
    }

    @Override // com.google.android.gms.internal.ads.zzazw
    public final /* bridge */ /* synthetic */ void zzu(zzazy zzazyVar, long j, long j2) {
        zzE((zzaxv) zzazyVar);
        this.zzE = true;
        if (this.zzw == -9223372036854775807L) {
            long zzD = zzD();
            long j3 = zzD == Long.MIN_VALUE ? 0L : zzD + WorkRequest.MIN_BACKOFF_MILLIS;
            this.zzw = j3;
            this.zzf.zzg(new zzayr(j3, this.zzp.zzc()), null);
        }
        this.zzo.zze(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    public final void zzv(zzasw zzaswVar) {
        this.zzm.post(this.zzk);
    }

    @Override // com.google.android.gms.internal.ads.zzayc
    public final void zzw(zzayb zzaybVar, long j) {
        this.zzo = zzaybVar;
        this.zzj.zzc();
        zzF();
    }

    public final void zzx() {
        this.zzh.zzh(new zzaxt(this, this.zzi));
        this.zzm.removeCallbacksAndMessages(null);
        this.zzF = true;
    }

    final void zzy(int i, long j) {
        zzayn zzaynVar = (zzayn) this.zzn.valueAt(i);
        if (!this.zzE || j <= zzaynVar.zzg()) {
            zzaynVar.zzn(j, true);
        } else {
            zzaynVar.zzl();
        }
    }
}
