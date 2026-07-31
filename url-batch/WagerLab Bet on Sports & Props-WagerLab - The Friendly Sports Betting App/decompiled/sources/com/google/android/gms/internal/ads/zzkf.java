package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import androidx.media3.common.C;
import androidx.media3.exoplayer.MediaPeriodQueue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzkf implements Handler.Callback, zzum, zzyl, zzlb, zzhw, zzlf, zzho, zzaar {
    private static final long zza = zzeo.zzp(10000);
    private zzlt zzA;
    private boolean zzC;
    private boolean zzD;
    private zzke zzE;
    private int zzF;
    private zzld zzG;
    private zzkc zzH;
    private boolean zzI;
    private boolean zzK;
    private boolean zzL;
    private boolean zzN;
    private boolean zzQ;
    private int zzR;
    private zzke zzS;
    private long zzT;
    private long zzU;
    private int zzV;
    private boolean zzW;
    private zzhz zzX;
    private zzij zzZ;
    private boolean zzab;
    private final zzht zzad;
    private final zzlp[] zzb;
    private final zzln[] zzc;
    private final boolean[] zzd;
    private final zzym zze;
    private final zzyn zzf;
    private final zzkj zzg;
    private final zzyu zzh;
    private final zzdl zzi;
    private final zzle zzj;
    private final Looper zzk;
    private final zzbd zzl;
    private final zzbc zzm;
    private final long zzn;
    private final zzhx zzo;
    private final ArrayList zzp;
    private final zzdb zzq;
    private final zzkd zzr;
    private final zzkq zzs;
    private final zzlc zzt;
    private final long zzu;
    private final zzox zzv;
    private final zzmd zzw;
    private final zzdl zzx;
    private final boolean zzy;
    private final zzhp zzz;
    private long zzaa = C.TIME_UNSET;
    private int zzO = 0;
    private boolean zzP = false;
    private boolean zzJ = false;
    private float zzac = 1.0f;
    private zzls zzB = zzls.zza;
    private long zzY = C.TIME_UNSET;
    private long zzM = C.TIME_UNSET;

    public zzkf(Context context, zzll[] zzllVarArr, zzll[] zzllVarArr2, zzym zzymVar, zzyn zzynVar, zzkj zzkjVar, zzyu zzyuVar, int i, boolean z, zzmd zzmdVar, zzlt zzltVar, zzht zzhtVar, long j, boolean z2, boolean z3, Looper looper, zzdb zzdbVar, zzkd zzkdVar, zzox zzoxVar, zzle zzleVar, zzij zzijVar, final zzaar zzaarVar) {
        this.zzr = zzkdVar;
        this.zze = zzymVar;
        this.zzf = zzynVar;
        this.zzg = zzkjVar;
        this.zzh = zzyuVar;
        int i2 = 0;
        this.zzA = zzltVar;
        this.zzad = zzhtVar;
        this.zzu = j;
        this.zzq = zzdbVar;
        this.zzv = zzoxVar;
        this.zzZ = zzijVar;
        this.zzw = zzmdVar;
        this.zzn = zzkjVar.zze(zzoxVar);
        zzkjVar.zzf(zzoxVar);
        zzbe zzbeVar = zzbe.zza;
        this.zzG = zzld.zza(zzynVar);
        this.zzH = new zzkc(this.zzG);
        int length = zzllVarArr.length;
        this.zzc = new zzln[2];
        this.zzd = new boolean[2];
        zzlm zzg = zzymVar.zzg();
        this.zzb = new zzlp[2];
        boolean z4 = false;
        while (true) {
            int length2 = zzllVarArr.length;
            if (i2 >= 2) {
                this.zzy = z4;
                this.zzo = new zzhx(this, zzdbVar);
                this.zzp = new ArrayList();
                this.zzl = new zzbd();
                this.zzm = new zzbc();
                zzymVar.zzr(this, zzyuVar);
                this.zzW = true;
                zzdl zzd = zzdbVar.zzd(looper, null);
                this.zzx = zzd;
                this.zzs = new zzkq(zzmdVar, zzd, new zzjy(this), zzijVar);
                this.zzt = new zzlc(this, zzmdVar, zzd, zzoxVar);
                zzle zzleVar2 = new zzle(null);
                this.zzj = zzleVar2;
                Looper zza2 = zzleVar2.zza();
                this.zzk = zza2;
                zzdl zzd2 = zzdbVar.zzd(zza2, this);
                this.zzi = zzd2;
                this.zzz = new zzhp(context, zza2, this);
                zzd2.zzd(35, new zzaar() { // from class: com.google.android.gms.internal.ads.zzju
                    @Override // com.google.android.gms.internal.ads.zzaar
                    public final /* synthetic */ void zzcS(long j2, long j3, zzu zzuVar, MediaFormat mediaFormat) {
                        zzkf.this.zzcS(j2, j3, zzuVar, mediaFormat);
                    }
                }).zza();
                return;
            }
            zzllVarArr[i2].zzc(i2, zzoxVar, zzdbVar);
            this.zzc[i2] = zzllVarArr[i2].zzb();
            this.zzc[i2].zzv(zzg);
            zzll zzllVar = zzllVarArr2[i2];
            if (zzllVar != null) {
                zzllVar.zzc(i2, zzoxVar, zzdbVar);
                z4 = true;
            }
            this.zzb[i2] = new zzlp(zzllVarArr[i2], zzllVarArr2[i2], i2);
            i2++;
        }
    }

    private final void zzA(IOException iOException, int i) {
        zzkq zzkqVar = this.zzs;
        zzhz zza2 = zzhz.zza(iOException, i);
        zzkn zzm = zzkqVar.zzm();
        if (zzm != null) {
            zza2 = zza2.zzd(zzm.zzg.zza);
        }
        zzds.zzf("ExoPlayerImplInternal", "Playback error", zza2);
        zzW(false, false);
        this.zzG = this.zzG.zzf(zza2);
    }

    private final void zzB(int i) {
        zzld zzldVar = this.zzG;
        if (zzldVar.zze != i) {
            if (i != 2) {
                this.zzY = C.TIME_UNSET;
            }
            if (i != 3) {
                boolean z = zzldVar.zzp;
            }
            this.zzG = this.zzG.zze(i);
        }
    }

    private final void zzC() {
        this.zzH.zzb(this.zzG);
        if (this.zzH.zzd()) {
            this.zzr.zza(this.zzH);
            this.zzH = new zzkc(this.zzG);
        }
    }

    private final void zzD(float f) throws zzhz {
        this.zzac = f;
        float zza2 = f * this.zzz.zza();
        int i = 0;
        while (true) {
            zzlp[] zzlpVarArr = this.zzb;
            if (i >= 2) {
                return;
            }
            zzlpVarArr[i].zzK(zza2);
            i++;
        }
    }

    private final void zzE(boolean z, int i, boolean z2, int i2) throws zzhz {
        this.zzH.zza(z2 ? 1 : 0);
        zzG(z, i, i2);
    }

    private final void zzF() throws zzhz {
        zzld zzldVar = this.zzG;
        zzG(zzldVar.zzl, zzldVar.zzn, zzldVar.zzm);
    }

    private final void zzG(boolean z, int i, int i2) throws zzhz {
        zzH(z, this.zzz.zzc(z, this.zzG.zze), i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0010  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzH(boolean z, int i, int i2, int i3) throws zzhz {
        boolean z2;
        zzld zzldVar;
        zzkn zzm;
        if (z) {
            if (i != -1) {
                z2 = true;
                if (i != -1) {
                    i3 = 2;
                } else if (i3 == 2) {
                    i3 = 1;
                }
                if (i != 0) {
                    i2 = 1;
                } else if (i2 == 1) {
                    i2 = 0;
                }
                zzldVar = this.zzG;
                if (zzldVar.zzl != z2 && zzldVar.zzn == i2 && zzldVar.zzm == i3) {
                    return;
                }
                this.zzG = zzldVar.zzi(z2, i3, i2);
                zzaC(false, false);
                zzkq zzkqVar = this.zzs;
                for (zzm = zzkqVar.zzm(); zzm != null; zzm = zzm.zzp()) {
                    for (zzyf zzyfVar : zzm.zzr().zzc) {
                    }
                }
                if (zzax()) {
                    zzK();
                    zzL();
                    boolean z3 = this.zzG.zzp;
                    zzkqVar.zzf(this.zzT);
                    return;
                }
                int i4 = this.zzG.zze;
                if (i4 == 3) {
                    this.zzo.zza();
                    zzJ();
                    this.zzi.zzh(2);
                    return;
                } else {
                    if (i4 == 2) {
                        this.zzi.zzh(2);
                        return;
                    }
                    return;
                }
            }
            i = -1;
        }
        z2 = false;
        if (i != -1) {
        }
        if (i != 0) {
        }
        zzldVar = this.zzG;
        if (zzldVar.zzl != z2) {
        }
        this.zzG = zzldVar.zzi(z2, i3, i2);
        zzaC(false, false);
        zzkq zzkqVar2 = this.zzs;
        while (zzm != null) {
        }
        if (zzax()) {
        }
    }

    private final void zzI(boolean z) throws zzhz {
        zzup zzupVar = this.zzs.zzm().zzg.zza;
        long zzT = zzT(zzupVar, this.zzG.zzs, true, false);
        if (zzT != this.zzG.zzs) {
            zzld zzldVar = this.zzG;
            this.zzG = zzao(zzupVar, zzT, zzldVar.zzc, zzldVar.zzd, z, 5);
        }
    }

    private final void zzJ() throws zzhz {
        zzkn zzm = this.zzs.zzm();
        if (zzm == null) {
            return;
        }
        zzyn zzr = zzm.zzr();
        int i = 0;
        while (true) {
            zzlp[] zzlpVarArr = this.zzb;
            if (i >= 2) {
                return;
            }
            if (zzr.zza(i)) {
                zzlpVarArr[i].zzv();
            }
            i++;
        }
    }

    private final void zzK() throws zzhz {
        this.zzo.zzb();
        int i = 0;
        while (true) {
            zzlp[] zzlpVarArr = this.zzb;
            if (i >= 2) {
                return;
            }
            zzlpVarArr[i].zzw();
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00a9, code lost:
    
        r13 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzL() throws zzhz {
        zzkb zzkbVar;
        zzkq zzkqVar = this.zzs;
        zzkn zzm = zzkqVar.zzm();
        if (zzm == null) {
            return;
        }
        long zzh = zzm.zze ? zzm.zza.zzh() : -9223372036854775807L;
        if (zzh != C.TIME_UNSET) {
            if (!zzm.zzd()) {
                zzkqVar.zzs(zzm);
                zzas(false);
                zzam();
            }
            zzU(zzh);
            if (zzh != this.zzG.zzs) {
                zzld zzldVar = this.zzG;
                long j = zzh;
                this.zzG = zzao(zzldVar.zzb, j, zzldVar.zzc, j, true, 5);
            }
        } else {
            zzhx zzhxVar = this.zzo;
            long zzf = zzhxVar.zzf(zzm != zzkqVar.zzn());
            this.zzT = zzf;
            long zza2 = zzf - zzm.zza();
            long j2 = this.zzG.zzs;
            ArrayList arrayList = this.zzp;
            if (!arrayList.isEmpty() && !this.zzG.zzb.zzb()) {
                if (this.zzW) {
                    j2--;
                    this.zzW = false;
                }
                zzld zzldVar2 = this.zzG;
                int zze = zzldVar2.zza.zze(zzldVar2.zzb.zza);
                int min = Math.min(this.zzV, arrayList.size());
                if (min > 0) {
                    zzkbVar = (zzkb) arrayList.get(min - 1);
                    while (zzkbVar != null && (zze < 0 || (zze == 0 && j2 < 0))) {
                        int i = min - 1;
                        if (i > 0) {
                            zzkbVar = (zzkb) arrayList.get(min - 2);
                            min = i;
                        } else {
                            min = i;
                        }
                    }
                    if (min < arrayList.size()) {
                    }
                    this.zzV = min;
                }
                zzkbVar = null;
            }
            if (zzhxVar.zzh()) {
                boolean z = !this.zzH.zzc;
                zzld zzldVar3 = this.zzG;
                this.zzG = zzao(zzldVar3.zzb, zza2, zzldVar3.zzc, zza2, z, 6);
            } else {
                zzld zzldVar4 = this.zzG;
                zzldVar4.zzs = zza2;
                zzldVar4.zzt = SystemClock.elapsedRealtime();
            }
        }
        this.zzG.zzq = zzkqVar.zzk().zzf();
        this.zzG.zzr = zzat();
        zzld zzldVar5 = this.zzG;
        if (zzldVar5.zzl && zzldVar5.zze == 3 && zzP(zzldVar5.zza, zzldVar5.zzb)) {
            zzld zzldVar6 = this.zzG;
            if (zzldVar6.zzo.zzb == 1.0f) {
                float zzd = this.zzad.zzd(zzO(zzldVar6.zza, zzldVar6.zzb.zza, zzldVar6.zzs), this.zzG.zzr);
                zzhx zzhxVar2 = this.zzo;
                if (zzhxVar2.zzj().zzb != zzd) {
                    zzM(new zzau(zzd, this.zzG.zzo.zzc));
                    zzal(this.zzG.zzo, zzhxVar2.zzj().zzb, false, false);
                }
            }
        }
    }

    private final void zzM(zzau zzauVar) {
        this.zzi.zzk(16);
        this.zzo.zzi(zzauVar);
    }

    private final void zzN(final int i, final boolean z) {
        boolean[] zArr = this.zzd;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.zzx.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzjv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzkf.this.zzu(i, z);
                }
            });
        }
    }

    private final long zzO(zzbe zzbeVar, Object obj, long j) {
        int i = zzbeVar.zzo(obj, this.zzm).zzc;
        zzbd zzbdVar = this.zzl;
        zzbeVar.zzb(i, zzbdVar, 0L);
        if (zzbdVar.zzf == C.TIME_UNSET || !zzbdVar.zzb() || !zzbdVar.zzi) {
            return C.TIME_UNSET;
        }
        long j2 = zzbdVar.zzg;
        String str = zzeo.zza;
        return zzeo.zzq((j2 == C.TIME_UNSET ? System.currentTimeMillis() : j2 + SystemClock.elapsedRealtime()) - zzbdVar.zzf) - j;
    }

    private final boolean zzP(zzbe zzbeVar, zzup zzupVar) {
        if (!zzupVar.zzb() && !zzbeVar.zzg()) {
            int i = zzbeVar.zzo(zzupVar.zza, this.zzm).zzc;
            zzbd zzbdVar = this.zzl;
            zzbeVar.zzb(i, zzbdVar, 0L);
            if (zzbdVar.zzb() && zzbdVar.zzi && zzbdVar.zzf != C.TIME_UNSET) {
                return true;
            }
        }
        return false;
    }

    private final void zzQ(long j) {
        if (zzw()) {
            r2 = this.zzG.zze != 3 ? zza : 1000L;
            zzlp[] zzlpVarArr = this.zzb;
            for (int i = 0; i < 2; i++) {
                r2 = Math.min(r2, zzeo.zzp(zzlpVarArr[i].zzk(this.zzT, this.zzU)));
            }
            if (this.zzG.zzj()) {
                zzkq zzkqVar = this.zzs;
                if ((zzkqVar.zzm() != null ? zzkqVar.zzm().zzp() : null) != null) {
                    if (this.zzT + (zzeo.zzq(r2) * this.zzG.zzo.zzb) >= r0.zzc()) {
                        r2 = Math.min(r2, zza);
                    }
                }
            }
        } else if (this.zzG.zze != 3 || zzax()) {
            r2 = zza;
        }
        this.zzi.zzj(2, j + r2);
    }

    private final void zzR(zzke zzkeVar, boolean z) throws zzhz {
        long longValue;
        long j;
        long j2;
        boolean z2;
        zzup zzupVar;
        zzup zzupVar2;
        boolean z3;
        long j3;
        long j4;
        zzup zzupVar3;
        long j5;
        long j6;
        boolean z4;
        zzld zzldVar;
        int i;
        this.zzH.zza(z ? 1 : 0);
        if (this.zzD) {
            if (this.zzE != null) {
                this.zzF++;
            }
            this.zzE = zzkeVar;
            return;
        }
        zzbe zzbeVar = this.zzG.zza;
        int i2 = this.zzO;
        boolean z5 = this.zzP;
        zzbd zzbdVar = this.zzl;
        zzbc zzbcVar = this.zzm;
        Pair zzaD = zzaD(zzbeVar, zzkeVar, true, i2, z5, zzbdVar, zzbcVar);
        if (zzaD == null) {
            Pair zzY = zzY(this.zzG.zza);
            zzupVar = (zzup) zzY.first;
            longValue = ((Long) zzY.second).longValue();
            z2 = !this.zzG.zza.zzg();
            j = -9223372036854775807L;
            j2 = 0;
        } else {
            Object obj = zzaD.first;
            longValue = ((Long) zzaD.second).longValue();
            long j7 = zzkeVar.zzc;
            j = j7 == C.TIME_UNSET ? -9223372036854775807L : longValue;
            j2 = 0;
            zzup zzy = this.zzs.zzy(this.zzG.zza, obj, longValue);
            if (zzy.zzb()) {
                this.zzG.zza.zzo(zzy.zza, zzbcVar);
                if (zzbcVar.zzd(zzy.zzb) == zzy.zzc) {
                    zzbcVar.zzj();
                }
                zzupVar = zzy;
                z2 = true;
                longValue = 0;
            } else {
                z2 = j7 == C.TIME_UNSET;
                zzupVar = zzy;
            }
        }
        try {
            if (this.zzG.zza.zzg()) {
                this.zzS = zzkeVar;
            } else if (zzaD == null) {
                if (this.zzG.zze != 1) {
                    zzB(4);
                }
                zzX(false, true, false, true);
            } else {
                if (zzupVar.equals(this.zzG.zzb)) {
                    zzkn zzm = this.zzs.zzm();
                    if (zzm == null || !zzm.zze || longValue == j2) {
                        j4 = longValue;
                    } else {
                        zzun zzunVar = zzm.zza;
                        long j8 = zzbdVar.zzm;
                        if (this.zzC && j8 != C.TIME_UNSET) {
                            Double d = this.zzB.zzc;
                        }
                        j4 = zzunVar.zzk(longValue, this.zzA);
                    }
                    if (zzeo.zzp(j4) == zzeo.zzp(this.zzG.zzs) && ((i = (zzldVar = this.zzG).zze) == 2 || i == 3)) {
                        longValue = zzldVar.zzs;
                    }
                } else {
                    j4 = longValue;
                }
                this.zzD = this.zzC;
                long zzS = zzS(zzupVar, j4, this.zzG.zze == 4);
                boolean z6 = z2 | (longValue != zzS);
                try {
                    zzld zzldVar2 = this.zzG;
                    zzbe zzbeVar2 = zzldVar2.zza;
                    zzup zzupVar4 = zzupVar;
                    long j9 = j;
                    try {
                        zzag(zzbeVar2, zzupVar4, zzbeVar2, zzldVar2.zzb, j9, true);
                        zzupVar3 = zzupVar4;
                        j5 = j9;
                        j6 = zzS;
                        z4 = z6;
                        this.zzG = zzao(zzupVar3, j6, j5, j6, z4, 2);
                    } catch (Throwable th) {
                        th = th;
                        zzupVar2 = zzupVar4;
                        j = j9;
                        j3 = zzS;
                        z3 = z6;
                        this.zzG = zzao(zzupVar2, j3, j, j3, z3, 2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    zzupVar2 = zzupVar;
                }
            }
            z4 = z2;
            zzupVar3 = zzupVar;
            j6 = longValue;
            j5 = j;
            this.zzG = zzao(zzupVar3, j6, j5, j6, z4, 2);
        } catch (Throwable th3) {
            th = th3;
            zzupVar2 = zzupVar;
            z3 = z2;
            j3 = longValue;
        }
    }

    private final long zzS(zzup zzupVar, long j, boolean z) throws zzhz {
        zzkq zzkqVar = this.zzs;
        return zzT(zzupVar, j, zzkqVar.zzm() != zzkqVar.zzn(), z);
    }

    private final long zzT(zzup zzupVar, long j, boolean z, boolean z2) throws zzhz {
        zzK();
        zzaC(false, true);
        if (z2 || this.zzG.zze == 3) {
            zzB(2);
        }
        zzkq zzkqVar = this.zzs;
        zzkn zzm = zzkqVar.zzm();
        zzkn zzknVar = zzm;
        while (zzknVar != null && !zzupVar.equals(zzknVar.zzg.zza)) {
            zzknVar = zzknVar.zzp();
        }
        if (z || zzm != zzknVar || (zzknVar != null && zzknVar.zza() + j < 0)) {
            zzaa();
            if (zzknVar != null) {
                while (zzkqVar.zzm() != zzknVar) {
                    zzkqVar.zzr();
                }
                zzkqVar.zzs(zzknVar);
                zzknVar.zzb(MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US);
                zzap();
                zzknVar.zzh = true;
            }
        }
        zzab();
        if (zzknVar != null) {
            zzkqVar.zzs(zzknVar);
            if (!zzknVar.zze) {
                zzknVar.zzg = zzknVar.zzg.zza(j);
            } else if (zzknVar.zzf) {
                zzun zzunVar = zzknVar.zza;
                j = zzunVar.zzj(j);
                zzunVar.zzf(j - this.zzn, false);
            }
            zzU(j);
            zzam();
        } else {
            zzkqVar.zzv();
            zzU(j);
        }
        zzas(false);
        this.zzi.zzh(2);
        return j;
    }

    private final void zzU(long j) throws zzhz {
        zzkn zzm = this.zzs.zzm();
        long zza2 = j + (zzm == null ? MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US : zzm.zza());
        this.zzT = zza2;
        this.zzo.zzc(zza2);
        zzlp[] zzlpVarArr = this.zzb;
        for (int i = 0; i < 2; i++) {
            zzlpVarArr[i].zzE(zzm, this.zzT);
        }
        for (zzkn zzm2 = r0.zzm(); zzm2 != null; zzm2 = zzm2.zzp()) {
            for (zzyf zzyfVar : zzm2.zzr().zzc) {
            }
        }
    }

    private final void zzV() throws zzhz {
        int i = 0;
        while (true) {
            zzlp[] zzlpVarArr = this.zzb;
            if (i >= 2) {
                return;
            }
            zzlpVarArr[i].zzz(this.zzC ? this.zzB : null);
            i++;
        }
    }

    private final void zzW(boolean z, boolean z2) {
        zzX(z || !this.zzQ, false, true, false);
        this.zzH.zza(z2 ? 1 : 0);
        this.zzg.zzc(this.zzv);
        this.zzz.zzc(this.zzG.zzl, 1);
        zzB(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008f, code lost:
    
        if (r0 == false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzX(boolean z, boolean z2, boolean z3, boolean z4) {
        zzup zzupVar;
        zzbe zzbeVar;
        this.zzi.zzk(2);
        this.zzD = false;
        this.zzE = null;
        this.zzX = null;
        boolean z5 = true;
        zzaC(false, true);
        this.zzo.zzb();
        this.zzT = MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US;
        try {
            zzaa();
        } catch (zzhz | RuntimeException e) {
            zzds.zzf("ExoPlayerImplInternal", "Disable failed.", e);
        }
        if (z) {
            zzlp[] zzlpVarArr = this.zzb;
            for (int i = 0; i < 2; i++) {
                try {
                    zzlpVarArr[i].zzF();
                } catch (RuntimeException e2) {
                    zzds.zzf("ExoPlayerImplInternal", "Reset failed.", e2);
                }
            }
        }
        this.zzR = 0;
        zzld zzldVar = this.zzG;
        zzup zzupVar2 = zzldVar.zzb;
        long j = zzldVar.zzs;
        long j2 = (this.zzG.zzb.zzb() || zzaB(this.zzG, this.zzm)) ? this.zzG.zzc : this.zzG.zzs;
        if (z2) {
            this.zzS = null;
            Pair zzY = zzY(this.zzG.zza);
            zzupVar2 = (zzup) zzY.first;
            j = ((Long) zzY.second).longValue();
            boolean equals = zzupVar2.equals(this.zzG.zzb);
            j2 = C.TIME_UNSET;
        }
        z5 = false;
        long j3 = j;
        long j4 = j2;
        zzkq zzkqVar = this.zzs;
        zzkqVar.zzv();
        this.zzN = false;
        zzbe zzbeVar2 = this.zzG.zza;
        if (z3 && (zzbeVar2 instanceof zzlj)) {
            zzbeVar2 = ((zzlj) zzbeVar2).zzx(this.zzt.zzq());
            if (zzupVar2.zzb != -1) {
                Object obj = zzupVar2.zza;
                zzbc zzbcVar = this.zzm;
                zzbeVar2.zzo(obj, zzbcVar);
                zzbd zzbdVar = this.zzl;
                zzbeVar2.zzb(zzbcVar.zzc, zzbdVar, 0L);
                if (zzbdVar.zzb()) {
                    zzbeVar = zzbeVar2;
                    zzupVar = new zzup(obj, zzupVar2.zzd);
                    zzld zzldVar2 = this.zzG;
                    int i2 = zzldVar2.zze;
                    zzhz zzhzVar = z4 ? null : zzldVar2.zzf;
                    zzwq zzwqVar = !z5 ? zzwq.zza : zzldVar2.zzh;
                    zzyn zzynVar = !z5 ? this.zzf : this.zzG.zzi;
                    List zzi = !z5 ? zzgjz.zzi() : this.zzG.zzj;
                    zzld zzldVar3 = this.zzG;
                    this.zzG = new zzld(zzbeVar, zzupVar, j4, j3, i2, zzhzVar, false, zzwqVar, zzynVar, zzi, zzupVar, zzldVar3.zzl, zzldVar3.zzm, zzldVar3.zzn, zzldVar3.zzo, j3, 0L, j3, 0L, false);
                    if (z3) {
                        return;
                    }
                    zzkqVar.zzj();
                    this.zzt.zzf();
                    return;
                }
            }
        }
        zzupVar = zzupVar2;
        zzbeVar = zzbeVar2;
        zzld zzldVar22 = this.zzG;
        int i22 = zzldVar22.zze;
        zzhz zzhzVar2 = z4 ? null : zzldVar22.zzf;
        zzwq zzwqVar2 = !z5 ? zzwq.zza : zzldVar22.zzh;
        zzyn zzynVar2 = !z5 ? this.zzf : this.zzG.zzi;
        List zzi2 = !z5 ? zzgjz.zzi() : this.zzG.zzj;
        zzld zzldVar32 = this.zzG;
        this.zzG = new zzld(zzbeVar, zzupVar, j4, j3, i22, zzhzVar2, false, zzwqVar2, zzynVar2, zzi2, zzupVar, zzldVar32.zzl, zzldVar32.zzm, zzldVar32.zzn, zzldVar32.zzo, j3, 0L, j3, 0L, false);
        if (z3) {
        }
    }

    private final Pair zzY(zzbe zzbeVar) {
        long j = 0;
        if (zzbeVar.zzg()) {
            return Pair.create(zzld.zzb(), 0L);
        }
        int zzk = zzbeVar.zzk(this.zzP);
        zzbd zzbdVar = this.zzl;
        zzbc zzbcVar = this.zzm;
        Pair zzm = zzbeVar.zzm(zzbdVar, zzbcVar, zzk, C.TIME_UNSET);
        zzup zzy = this.zzs.zzy(zzbeVar, zzm.first, 0L);
        long longValue = ((Long) zzm.second).longValue();
        if (zzy.zzb()) {
            zzbeVar.zzo(zzy.zza, zzbcVar);
            if (zzy.zzc == zzbcVar.zzd(zzy.zzb)) {
                zzbcVar.zzj();
            }
        } else {
            j = longValue;
        }
        return Pair.create(zzy, Long.valueOf(j));
    }

    private final void zzZ(zzbe zzbeVar, zzbe zzbeVar2) {
        if (zzbeVar.zzg() && zzbeVar2.zzg()) {
            return;
        }
        ArrayList arrayList = this.zzp;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
            return;
        }
        zzkb zzkbVar = (zzkb) arrayList.get(size);
        Object obj = zzkbVar.zzb;
        zzlh zzlhVar = zzkbVar.zza;
        String str = zzeo.zza;
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzaA, reason: merged with bridge method [inline-methods] */
    public final boolean zzw() {
        if (!this.zzC) {
            return false;
        }
        boolean z = this.zzB.zzg;
        return true;
    }

    private static boolean zzaB(zzld zzldVar, zzbc zzbcVar) {
        zzup zzupVar = zzldVar.zzb;
        zzbe zzbeVar = zzldVar.zza;
        return zzbeVar.zzg() || zzbeVar.zzo(zzupVar.zza, zzbcVar).zzf;
    }

    private final void zzaC(boolean z, boolean z2) {
        this.zzL = z;
        long j = C.TIME_UNSET;
        if (z && !z2) {
            j = SystemClock.elapsedRealtime();
        }
        this.zzM = j;
    }

    private static Pair zzaD(zzbe zzbeVar, zzke zzkeVar, boolean z, int i, boolean z2, zzbd zzbdVar, zzbc zzbcVar) {
        Pair zzm;
        zzbe zzbeVar2;
        zzbe zzbeVar3 = zzkeVar.zza;
        if (zzbeVar.zzg()) {
            return null;
        }
        if (true == zzbeVar3.zzg()) {
            zzbeVar3 = zzbeVar;
        }
        try {
            zzm = zzbeVar3.zzm(zzbdVar, zzbcVar, zzkeVar.zzb, zzkeVar.zzc);
            zzbeVar2 = zzbeVar3;
        } catch (IndexOutOfBoundsException unused) {
        }
        if (!zzbeVar.equals(zzbeVar2)) {
            if (zzbeVar.zze(zzm.first) == -1) {
                int zzr = zzr(zzbdVar, zzbcVar, i, z2, zzm.first, zzbeVar2, zzbeVar);
                if (zzr != -1) {
                    return zzbeVar.zzm(zzbdVar, zzbcVar, zzr, C.TIME_UNSET);
                }
                return null;
            }
            if (zzbeVar2.zzo(zzm.first, zzbcVar).zzf && zzbeVar2.zzb(zzbcVar.zzc, zzbdVar, 0L).zzn == zzbeVar2.zze(zzm.first)) {
                return zzbeVar.zzm(zzbdVar, zzbcVar, zzbeVar.zzo(zzm.first, zzbcVar).zzc, zzkeVar.zzc);
            }
        }
        return zzm;
    }

    private static final void zzaE(zzlh zzlhVar) throws zzhz {
        zzlhVar.zzh();
        try {
            zzlhVar.zza().zzx(zzlhVar.zzc(), zzlhVar.zze());
        } finally {
            zzlhVar.zzi(true);
        }
    }

    private static final boolean zzaF(zzkn zzknVar) {
        if (zzknVar != null) {
            try {
                if (zzknVar.zze) {
                    zzwf[] zzwfVarArr = zzknVar.zzc;
                    for (int i = 0; i < 2; i++) {
                        zzwf zzwfVar = zzwfVarArr[i];
                        if (zzwfVar != null) {
                            zzwfVar.zzc();
                        }
                    }
                } else {
                    zzknVar.zza.zzc();
                }
                if (zzknVar.zzg() != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    private final void zzaa() throws zzhz {
        int i = 0;
        while (true) {
            zzlp[] zzlpVarArr = this.zzb;
            if (i >= 2) {
                this.zzaa = C.TIME_UNSET;
                return;
            }
            int zzd = zzlpVarArr[i].zzd();
            zzlpVarArr[i].zzA(this.zzo);
            zzN(i, false);
            this.zzR -= zzd;
            i++;
        }
    }

    private final void zzab() {
        if (this.zzy && zzaz()) {
            zzlp[] zzlpVarArr = this.zzb;
            for (int i = 0; i < 2; i++) {
                zzlp zzlpVar = zzlpVarArr[i];
                int zzd = zzlpVar.zzd();
                zzlpVar.zzC(this.zzo);
                this.zzR -= zzd - zzlpVar.zzd();
            }
            this.zzaa = C.TIME_UNSET;
        }
    }

    private final void zzac() throws zzhz {
        zzad();
        zzI(true);
    }

    private final void zzad() throws zzhz {
        zzkf zzkfVar;
        int i;
        boolean z;
        zzhx zzhxVar = this.zzo;
        float f = zzhxVar.zzj().zzb;
        zzkq zzkqVar = this.zzs;
        zzkn zzm = zzkqVar.zzm();
        zzkn zzn = zzkqVar.zzn();
        zzyn zzynVar = null;
        boolean z2 = true;
        while (zzm != null && zzm.zze) {
            zzld zzldVar = this.zzG;
            zzyn zzk = zzm.zzk(f, zzldVar.zza, zzldVar.zzl);
            zzyn zzynVar2 = zzm == zzkqVar.zzm() ? zzk : zzynVar;
            zzyn zzr = zzm.zzr();
            boolean z3 = false;
            if (zzr != null) {
                zzyf[] zzyfVarArr = zzk.zzc;
                if (zzr.zzc.length == zzyfVarArr.length) {
                    for (int i2 = 0; i2 < zzyfVarArr.length; i2++) {
                        if (zzk.zzb(zzr, i2)) {
                        }
                    }
                    if (zzm != zzn) {
                        z3 = true;
                    }
                    z2 &= z3;
                    zzm = zzm.zzp();
                    zzynVar = zzynVar2;
                }
            }
            if (z2) {
                zzkn zzm2 = zzkqVar.zzm();
                int zzs = zzkqVar.zzs(zzm2) & 1;
                zzlp[] zzlpVarArr = this.zzb;
                boolean[] zArr = new boolean[2];
                zzynVar2.getClass();
                long zzm3 = zzm2.zzm(zzynVar2, this.zzG.zzs, 1 == zzs, zArr);
                zzld zzldVar2 = this.zzG;
                if (zzldVar2.zze == 4 || zzm3 == zzldVar2.zzs) {
                    z = false;
                } else {
                    z = false;
                    z3 = true;
                }
                zzld zzldVar3 = this.zzG;
                boolean z4 = z;
                i = 2;
                zzkfVar = this;
                zzkfVar.zzG = zzao(zzldVar3.zzb, zzm3, zzldVar3.zzc, zzldVar3.zzd, z3, 5);
                if (z3) {
                    zzkfVar.zzU(zzm3);
                }
                zzkfVar.zzab();
                boolean[] zArr2 = new boolean[2];
                for (int i3 = z4; i3 < 2; i3++) {
                    int zzd = zzlpVarArr[i3].zzd();
                    zArr2[i3] = zzlpVarArr[i3].zzL();
                    zzlpVarArr[i3].zzD(zzm2.zzc[i3], zzhxVar, zzkfVar.zzT, zArr[i3]);
                    if (zzd - zzlpVarArr[i3].zzd() > 0) {
                        zzkfVar.zzN(i3, z4);
                    }
                    zzkfVar.zzR -= zzd - zzlpVarArr[i3].zzd();
                }
                zzkfVar.zzaq(zArr2, zzkfVar.zzT);
                zzm2.zzh = true;
            } else {
                zzkfVar = this;
                i = 2;
                zzkqVar.zzs(zzm);
                if (zzm.zze) {
                    long max = Math.max(zzm.zzg.zzb, zzkfVar.zzT - zzm.zza());
                    if (zzkfVar.zzy && zzkfVar.zzaz() && zzkqVar.zzo() == zzm) {
                        zzkfVar.zzab();
                    }
                    zzm.zzl(zzk, max, false);
                }
            }
            zzkfVar.zzas(true);
            if (zzkfVar.zzG.zze != 4) {
                zzkfVar.zzam();
                zzkfVar.zzL();
                zzkfVar.zzi.zzh(i);
                return;
            }
            return;
        }
    }

    private final boolean zzae() {
        zzkn zzm = this.zzs.zzm();
        long j = zzm.zzg.zze;
        if (zzm.zze) {
            return j == C.TIME_UNSET || this.zzG.zzs < j || !zzax();
        }
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(4:89|90|(1:92)(1:126)|93)|(5:(3:116|117|(1:119)(10:120|121|96|97|98|99|100|101|102|(2:104|105)(2:106|(1:108))))|100|101|102|(0)(0))|95|96|97|98|99) */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02b2, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02b3, code lost:
    
        r2 = r31;
        r15 = r19;
        r10 = r23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02a7 A[Catch: all -> 0x0369, TryCatch #3 {all -> 0x0369, blocks: (B:105:0x02a3, B:106:0x02a7, B:108:0x02aa, B:50:0x02c2, B:52:0x02ca, B:54:0x02d2, B:56:0x02dc, B:58:0x02e7, B:61:0x02ec), top: B:48:0x0252 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x03a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0381  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzaf(zzbe zzbeVar, boolean z) throws zzhz {
        Object obj;
        long j;
        zzup zzupVar;
        zzbd zzbdVar;
        Object obj2;
        long j2;
        zzbe zzbeVar2;
        zzbc zzbcVar;
        long j3;
        long j4;
        Object obj3;
        int i;
        long j5;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        boolean z5;
        long j6;
        zzup zzupVar2;
        boolean z6;
        boolean z7;
        int i3;
        long longValue;
        Object obj4;
        int i4;
        boolean z8;
        Object obj5;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        zzbe zzbeVar3;
        boolean z13;
        zzke zzkeVar;
        zzup zzupVar3;
        zzke zzkeVar2;
        boolean z14;
        zzke zzkeVar3;
        zzkq zzkqVar;
        long zzah;
        long zzah2;
        int i5;
        boolean z15;
        int zzw;
        boolean z16;
        zzld zzldVar = this.zzG;
        zzke zzkeVar4 = this.zzS;
        int i6 = this.zzO;
        boolean z17 = this.zzP;
        ?? r10 = 4;
        long j7 = 0;
        int i7 = -1;
        if (zzbeVar.zzg()) {
            zzbeVar2 = zzbeVar;
            zzupVar2 = zzld.zzb();
            z6 = false;
            z7 = false;
            z3 = true;
            j2 = C.TIME_UNSET;
            j4 = C.TIME_UNSET;
        } else {
            zzbc zzbcVar2 = this.zzm;
            zzup zzupVar4 = zzldVar.zzb;
            Object obj6 = zzupVar4.zza;
            boolean zzaB = zzaB(zzldVar, zzbcVar2);
            if (zzupVar4.zzb() || zzaB) {
                obj = obj6;
                j = zzldVar.zzc;
            } else {
                obj = obj6;
                j = zzldVar.zzs;
            }
            long j8 = j;
            zzbd zzbdVar2 = this.zzl;
            if (zzkeVar4 != null) {
                zzupVar = zzupVar4;
                obj2 = obj;
                j2 = C.TIME_UNSET;
                zzbeVar2 = zzbeVar;
                Pair zzaD = zzaD(zzbeVar2, zzkeVar4, true, i6, z17, zzbdVar2, zzbcVar2);
                if (zzaD == null) {
                    i4 = zzbeVar2.zzk(z17);
                    obj5 = obj2;
                    longValue = j8;
                    z10 = false;
                    z11 = true;
                    z9 = false;
                } else {
                    if (zzkeVar4.zzc == C.TIME_UNSET) {
                        i4 = zzbeVar2.zzo(zzaD.first, zzbcVar2).zzc;
                        obj4 = obj2;
                        longValue = j8;
                        z8 = false;
                    } else {
                        Object obj7 = zzaD.first;
                        longValue = ((Long) zzaD.second).longValue();
                        obj4 = obj7;
                        i4 = -1;
                        z8 = true;
                    }
                    obj5 = obj4;
                    z9 = z8;
                    z10 = zzldVar.zze == 4;
                    z11 = false;
                }
                i = i4;
                zzbdVar = zzbdVar2;
                obj3 = obj5;
                j4 = longValue;
                zzbcVar = zzbcVar2;
                boolean z18 = z9;
                z2 = z10;
                z3 = z11;
                z4 = z18;
                j3 = j8;
            } else {
                zzupVar = zzupVar4;
                zzbdVar = zzbdVar2;
                obj2 = obj;
                j2 = C.TIME_UNSET;
                zzbeVar2 = zzbeVar;
                zzbe zzbeVar4 = zzldVar.zza;
                if (zzbeVar4.zzg()) {
                    i2 = zzbeVar2.zzk(z17);
                } else if (zzbeVar2.zze(obj2) == -1) {
                    int zzr = zzr(zzbdVar, zzbcVar2, i6, z17, obj2, zzbeVar4, zzbeVar2);
                    zzbdVar = zzbdVar;
                    zzbeVar2 = zzbeVar2;
                    obj2 = obj2;
                    if (zzr == -1) {
                        zzr = zzbeVar2.zzk(z17);
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    i = zzr;
                    zzbcVar = zzbcVar2;
                    obj3 = obj2;
                    j3 = j8;
                    j4 = j3;
                    z2 = false;
                    z4 = false;
                    z3 = z5;
                } else if (j8 == C.TIME_UNSET) {
                    i2 = zzbeVar2.zzo(obj2, zzbcVar2).zzc;
                } else if (zzaB) {
                    zzbeVar4.zzo(obj2, zzbcVar2);
                    if (zzbeVar4.zzb(zzbcVar2.zzc, zzbdVar, 0L).zzn == zzbeVar4.zze(obj2)) {
                        zzbcVar = zzbcVar2;
                        Pair zzm = zzbeVar2.zzm(zzbdVar, zzbcVar, zzbeVar2.zzo(obj2, zzbcVar2).zzc, j8);
                        j3 = j8;
                        obj3 = zzm.first;
                        j5 = ((Long) zzm.second).longValue();
                    } else {
                        zzbcVar = zzbcVar2;
                        j3 = j8;
                        if (zzbeVar2.zzo(obj2, zzbcVar).zzd != C.TIME_UNSET) {
                            long j9 = zzbcVar.zzd - 1;
                            String str = zzeo.zza;
                            j5 = Math.max(0L, Math.min(j3, j9));
                        } else {
                            j5 = j3;
                        }
                        obj3 = obj2;
                    }
                    i = -1;
                    j4 = j5;
                    z2 = false;
                    z3 = false;
                    z4 = true;
                } else {
                    zzbcVar = zzbcVar2;
                    j3 = j8;
                    j4 = j3;
                    obj3 = obj2;
                    i = -1;
                    z2 = false;
                    z3 = false;
                    z4 = false;
                }
                i = i2;
                zzbcVar = zzbcVar2;
                obj3 = obj2;
                j3 = j8;
                j4 = j3;
                z2 = false;
                z3 = false;
                z4 = false;
            }
            if (i != -1) {
                Pair zzm2 = zzbeVar2.zzm(zzbdVar, zzbcVar, i, C.TIME_UNSET);
                obj3 = zzm2.first;
                j6 = ((Long) zzm2.second).longValue();
                j4 = j2;
            } else {
                j6 = j4;
            }
            zzup zzy = this.zzs.zzy(zzbeVar2, obj3, j6);
            int i8 = zzy.zze;
            boolean z19 = obj2.equals(obj3) && !zzupVar.zzb() && !zzy.zzb() && (i8 == -1 || ((i3 = zzupVar.zze) != -1 && i8 >= i3));
            zzbc zzo = zzbeVar2.zzo(obj3, zzbcVar);
            if (!zzaB && j3 == j4 && obj2.equals(zzy.zza)) {
                if (zzupVar.zzb()) {
                    zzo.zzk(zzupVar.zzb);
                }
                if (zzy.zzb()) {
                    zzo.zzk(zzy.zzb);
                }
            }
            if (true == z19) {
                zzy = zzupVar;
            }
            if (zzy.zzb()) {
                if (zzy.equals(zzupVar)) {
                    j6 = zzldVar.zzs;
                } else {
                    zzbeVar2.zzo(zzy.zza, zzbcVar);
                    if (zzy.zzc == zzbcVar.zzd(zzy.zzb)) {
                        zzbcVar.zzj();
                    }
                    j6 = 0;
                }
            }
            zzupVar2 = zzy;
            j7 = j6;
            z6 = z2;
            z7 = z4;
        }
        boolean z20 = (this.zzG.zzb.equals(zzupVar2) && j7 == this.zzG.zzs) ? false : true;
        if (z3) {
            try {
                z12 = true;
                if (this.zzG.zze != 1) {
                    try {
                        zzB(4);
                    } catch (Throwable th) {
                        th = th;
                        zzup zzupVar5 = zzupVar2;
                        zzbeVar3 = zzbeVar2;
                        zzupVar3 = zzupVar5;
                        zzkeVar = null;
                        i7 = 2;
                        z13 = z12;
                        zzld zzldVar2 = this.zzG;
                        zzbe zzbeVar5 = zzldVar2.zza;
                        zzup zzupVar6 = zzldVar2.zzb;
                        zzup zzupVar7 = zzupVar3;
                        zzag(zzbeVar3, zzupVar7, zzbeVar5, zzupVar6, z13 == z7 ? j2 : j7, false);
                        if (z20) {
                        }
                        zzld zzldVar3 = this.zzG;
                        Object obj8 = zzldVar3.zzb.zza;
                        zzbe zzbeVar6 = zzldVar3.zza;
                        if (z20) {
                        }
                        zzkeVar2 = zzkeVar;
                        z14 = false;
                        zzkeVar3 = zzkeVar2;
                        this.zzG = zzao(zzupVar7, j7, j4, this.zzG.zzd, z14, zzbeVar3.zze(obj8) != -1 ? 4 : 3);
                        zzaj();
                        zzZ(zzbeVar3, this.zzG.zza);
                        this.zzG = this.zzG.zzd(zzbeVar3);
                        if (!zzbeVar3.zzg()) {
                        }
                        zzas(false);
                        this.zzi.zzh(i7);
                        throw th;
                    }
                }
                zzX(false, false, false, true);
            } catch (Throwable th2) {
                th = th2;
                z12 = true;
                zzup zzupVar52 = zzupVar2;
                zzbeVar3 = zzbeVar2;
                zzupVar3 = zzupVar52;
                zzkeVar = null;
                i7 = 2;
                z13 = z12;
                zzld zzldVar22 = this.zzG;
                zzbe zzbeVar52 = zzldVar22.zza;
                zzup zzupVar62 = zzldVar22.zzb;
                zzup zzupVar72 = zzupVar3;
                zzag(zzbeVar3, zzupVar72, zzbeVar52, zzupVar62, z13 == z7 ? j2 : j7, false);
                if (z20 && j4 == this.zzG.zzc) {
                    zzkeVar3 = zzkeVar;
                } else {
                    zzld zzldVar32 = this.zzG;
                    Object obj82 = zzldVar32.zzb.zza;
                    zzbe zzbeVar62 = zzldVar32.zza;
                    if (z20 || !z || zzbeVar62.zzg() || zzbeVar62.zzo(obj82, this.zzm).zzf) {
                        zzkeVar2 = zzkeVar;
                        z14 = false;
                    } else {
                        zzkeVar2 = zzkeVar;
                        z14 = z13;
                    }
                    zzkeVar3 = zzkeVar2;
                    this.zzG = zzao(zzupVar72, j7, j4, this.zzG.zzd, z14, zzbeVar3.zze(obj82) != -1 ? 4 : 3);
                }
                zzaj();
                zzZ(zzbeVar3, this.zzG.zza);
                this.zzG = this.zzG.zzd(zzbeVar3);
                if (!zzbeVar3.zzg()) {
                    this.zzS = zzkeVar3;
                }
                zzas(false);
                this.zzi.zzh(i7);
                throw th;
            }
        } else {
            z12 = true;
        }
        zzlp[] zzlpVarArr = this.zzb;
        for (int i9 = 0; i9 < 2; i9++) {
            zzlpVarArr[i9].zzn(zzbeVar2);
        }
        try {
            if (z20) {
                i7 = 2;
                boolean z21 = z12;
                z16 = z21;
                if (!zzbeVar2.zzg()) {
                    zzkq zzkqVar2 = this.zzs;
                    for (zzkn zzm3 = zzkqVar2.zzm(); zzm3 != null; zzm3 = zzm3.zzp()) {
                        if (zzm3.zzg.zza.equals(zzupVar2)) {
                            zzm3.zzg = zzkqVar2.zzx(zzbeVar2, zzm3.zzg);
                            zzm3.zzs();
                        }
                    }
                    j7 = zzS(zzupVar2, j7, z6);
                    z16 = z21;
                }
            } else {
                try {
                    zzkqVar = this.zzs;
                    zzah = zzkqVar.zzn() == null ? 0L : zzah(zzkqVar.zzn());
                } catch (Throwable th3) {
                    th = th3;
                    zzbeVar2 = zzbeVar;
                    i7 = 2;
                    r10 = z12;
                }
                try {
                    if (zzaz()) {
                        try {
                            if (zzkqVar.zzo() != null) {
                                zzah2 = zzah(zzkqVar.zzo());
                                i5 = 2;
                                z15 = z12;
                                i7 = i5;
                                r10 = z15;
                                zzw = zzkqVar.zzw(zzbeVar, this.zzT, zzah, zzah2);
                                zzbeVar2 = zzbeVar;
                                if ((zzw & 1) == 0) {
                                    zzI(false);
                                    z16 = r10;
                                } else {
                                    z16 = r10;
                                    if ((zzw & i7) != 0) {
                                        zzab();
                                        z16 = r10;
                                    }
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            zzkeVar = null;
                            i7 = 2;
                            z13 = z12;
                            zzupVar3 = zzupVar2;
                            zzbeVar3 = zzbeVar;
                            zzld zzldVar222 = this.zzG;
                            zzbe zzbeVar522 = zzldVar222.zza;
                            zzup zzupVar622 = zzldVar222.zzb;
                            zzup zzupVar722 = zzupVar3;
                            zzag(zzbeVar3, zzupVar722, zzbeVar522, zzupVar622, z13 == z7 ? j2 : j7, false);
                            if (z20) {
                            }
                            zzld zzldVar322 = this.zzG;
                            Object obj822 = zzldVar322.zzb.zza;
                            zzbe zzbeVar622 = zzldVar322.zza;
                            if (z20) {
                            }
                            zzkeVar2 = zzkeVar;
                            z14 = false;
                            zzkeVar3 = zzkeVar2;
                            this.zzG = zzao(zzupVar722, j7, j4, this.zzG.zzd, z14, zzbeVar3.zze(obj822) != -1 ? 4 : 3);
                            zzaj();
                            zzZ(zzbeVar3, this.zzG.zza);
                            this.zzG = this.zzG.zzd(zzbeVar3);
                            if (!zzbeVar3.zzg()) {
                            }
                            zzas(false);
                            this.zzi.zzh(i7);
                            throw th;
                        }
                    }
                    zzw = zzkqVar.zzw(zzbeVar, this.zzT, zzah, zzah2);
                    zzbeVar2 = zzbeVar;
                    if ((zzw & 1) == 0) {
                    }
                } catch (Throwable th5) {
                    th = th5;
                    zzbeVar2 = zzbeVar;
                    zzup zzupVar8 = zzupVar2;
                    zzbeVar3 = zzbeVar2;
                    zzupVar3 = zzupVar8;
                    zzkeVar = null;
                    z13 = r10;
                    zzld zzldVar2222 = this.zzG;
                    zzbe zzbeVar5222 = zzldVar2222.zza;
                    zzup zzupVar6222 = zzldVar2222.zzb;
                    zzup zzupVar7222 = zzupVar3;
                    zzag(zzbeVar3, zzupVar7222, zzbeVar5222, zzupVar6222, z13 == z7 ? j2 : j7, false);
                    if (z20) {
                    }
                    zzld zzldVar3222 = this.zzG;
                    Object obj8222 = zzldVar3222.zzb.zza;
                    zzbe zzbeVar6222 = zzldVar3222.zza;
                    if (z20) {
                    }
                    zzkeVar2 = zzkeVar;
                    z14 = false;
                    zzkeVar3 = zzkeVar2;
                    this.zzG = zzao(zzupVar7222, j7, j4, this.zzG.zzd, z14, zzbeVar3.zze(obj8222) != -1 ? 4 : 3);
                    zzaj();
                    zzZ(zzbeVar3, this.zzG.zza);
                    this.zzG = this.zzG.zzd(zzbeVar3);
                    if (!zzbeVar3.zzg()) {
                    }
                    zzas(false);
                    this.zzi.zzh(i7);
                    throw th;
                }
                i5 = 2;
                z15 = z12;
                zzah2 = 0;
                i7 = i5;
                r10 = z15;
            }
            zzld zzldVar4 = this.zzG;
            zzup zzupVar9 = zzupVar2;
            zzag(zzbeVar2, zzupVar9, zzldVar4.zza, zzldVar4.zzb, z16 != z7 ? j2 : j7, false);
            zzbe zzbeVar7 = zzbeVar2;
            if (z20 || j4 != this.zzG.zzc) {
                zzld zzldVar5 = this.zzG;
                Object obj9 = zzldVar5.zzb.zza;
                zzbe zzbeVar8 = zzldVar5.zza;
                this.zzG = zzao(zzupVar9, j7, j4, this.zzG.zzd, (!z20 || !z || zzbeVar8.zzg() || zzbeVar8.zzo(obj9, this.zzm).zzf) ? false : z16, zzbeVar7.zze(obj9) == -1 ? 4 : 3);
            }
            zzaj();
            zzZ(zzbeVar7, this.zzG.zza);
            this.zzG = this.zzG.zzd(zzbeVar7);
            if (!zzbeVar7.zzg()) {
                this.zzS = null;
            }
            zzas(false);
            this.zzi.zzh(i7);
        } catch (Throwable th6) {
            th = th6;
        }
    }

    private final void zzag(zzbe zzbeVar, zzup zzupVar, zzbe zzbeVar2, zzup zzupVar2, long j, boolean z) throws zzhz {
        if (!zzP(zzbeVar, zzupVar)) {
            zzau zzauVar = zzupVar.zzb() ? zzau.zza : this.zzG.zzo;
            if (this.zzo.zzj().equals(zzauVar)) {
                return;
            }
            zzM(zzauVar);
            zzal(this.zzG.zzo, zzauVar.zzb, false, false);
            return;
        }
        Object obj = zzupVar.zza;
        zzbc zzbcVar = this.zzm;
        int i = zzbeVar.zzo(obj, zzbcVar).zzc;
        zzbd zzbdVar = this.zzl;
        zzbeVar.zzb(i, zzbdVar, 0L);
        zzht zzhtVar = this.zzad;
        zzae zzaeVar = zzbdVar.zzj;
        String str = zzeo.zza;
        zzhtVar.zza(zzaeVar);
        if (j != C.TIME_UNSET) {
            zzhtVar.zzb(zzO(zzbeVar, obj, j));
            return;
        }
        if (!Objects.equals(!zzbeVar2.zzg() ? zzbeVar2.zzb(zzbeVar2.zzo(zzupVar2.zza, zzbcVar).zzc, zzbdVar, 0L).zzb : null, zzbdVar.zzb) || z) {
            zzhtVar.zzb(C.TIME_UNSET);
        }
    }

    private final long zzah(zzkn zzknVar) {
        if (zzknVar == null) {
            return 0L;
        }
        long zza2 = zzknVar.zza();
        if (zzknVar.zze) {
            int i = 0;
            while (true) {
                zzlp[] zzlpVarArr = this.zzb;
                if (i >= 2) {
                    break;
                }
                if (zzlpVarArr[i].zzp(zzknVar)) {
                    long zzf = zzlpVarArr[i].zzf(zzknVar);
                    if (zzf == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    zza2 = Math.max(zzf, zza2);
                }
                i++;
            }
        }
        return zza2;
    }

    private final void zzai() {
        zzkq zzkqVar = this.zzs;
        zzkqVar.zzt();
        zzkn zzl = zzkqVar.zzl();
        if (zzl != null) {
            if (!zzl.zzd || zzl.zze) {
                zzun zzunVar = zzl.zza;
                if (zzunVar.zzn()) {
                    return;
                }
                if (this.zzg.zzi(this.zzG.zza, zzl.zzg.zza, zzl.zze ? zzunVar.zzi() : 0L)) {
                    if (!zzl.zzd) {
                        zzl.zzt(this, zzl.zzg.zzb);
                        return;
                    }
                    zzkk zzkkVar = new zzkk();
                    zzkkVar.zza(this.zzT - zzl.zza());
                    zzkkVar.zzb(this.zzo.zzj().zzb);
                    zzkkVar.zzc(this.zzM);
                    zzl.zzj(new zzkl(zzkkVar, null));
                }
            }
        }
    }

    private final void zzaj() {
        zzkn zzm = this.zzs.zzm();
        boolean z = false;
        if (zzm != null && zzm.zzg.zzi && this.zzJ) {
            z = true;
        }
        this.zzK = z;
    }

    private final void zzak(zzau zzauVar, boolean z) throws zzhz {
        zzal(zzauVar, zzauVar.zzb, true, z);
    }

    private final void zzal(zzau zzauVar, float f, boolean z, boolean z2) throws zzhz {
        int i;
        if (z) {
            if (z2) {
                this.zzH.zza(1);
            }
            zzld zzldVar = this.zzG;
            zzbe zzbeVar = zzldVar.zza;
            zzup zzupVar = zzldVar.zzb;
            long j = zzldVar.zzc;
            long j2 = zzldVar.zzd;
            int i2 = zzldVar.zze;
            zzhz zzhzVar = zzldVar.zzf;
            boolean z3 = zzldVar.zzg;
            zzwq zzwqVar = zzldVar.zzh;
            zzyn zzynVar = zzldVar.zzi;
            List list = zzldVar.zzj;
            zzup zzupVar2 = zzldVar.zzk;
            boolean z4 = zzldVar.zzl;
            int i3 = zzldVar.zzm;
            int i4 = zzldVar.zzn;
            long j3 = zzldVar.zzq;
            long j4 = zzldVar.zzr;
            long j5 = zzldVar.zzs;
            long j6 = zzldVar.zzt;
            boolean z5 = zzldVar.zzp;
            this.zzG = new zzld(zzbeVar, zzupVar, j, j2, i2, zzhzVar, z3, zzwqVar, zzynVar, list, zzupVar2, z4, i3, i4, zzauVar, j3, j4, j5, j6, false);
        }
        float f2 = zzauVar.zzb;
        zzkn zzm = this.zzs.zzm();
        while (true) {
            i = 0;
            if (zzm == null) {
                break;
            }
            zzyf[] zzyfVarArr = zzm.zzr().zzc;
            int length = zzyfVarArr.length;
            while (i < length) {
                zzyf zzyfVar = zzyfVarArr[i];
                i++;
            }
            zzm = zzm.zzp();
        }
        zzlp[] zzlpVarArr = this.zzb;
        while (i < 2) {
            zzlpVarArr[i].zzm(f, f2);
            i++;
        }
    }

    private final void zzam() {
        long zza2;
        long j;
        zzkq zzkqVar = this.zzs;
        boolean z = false;
        if (zzaF(zzkqVar.zzk())) {
            zzkn zzk = zzkqVar.zzk();
            long zzau = zzau(zzk.zzg());
            if (zzk == zzkqVar.zzm()) {
                zza2 = this.zzT;
                j = zzk.zza();
            } else {
                zza2 = this.zzT - zzk.zza();
                j = zzk.zzg.zzb;
            }
            zzki zzkiVar = new zzki(this.zzv, this.zzG.zza, zzk.zzg.zza, zza2 - j, zzau, this.zzo.zzj().zzb, this.zzG.zzl, this.zzL, zzP(this.zzG.zza, zzk.zzg.zza) ? this.zzad.zze() : C.TIME_UNSET, this.zzM);
            zzkj zzkjVar = this.zzg;
            boolean zzg = zzkjVar.zzg(zzkiVar);
            zzkn zzm = zzkqVar.zzm();
            if (zzg || !zzm.zze || zzau >= 500000 || this.zzn <= 0) {
                z = zzg;
            } else {
                zzm.zza.zzf(this.zzG.zzs, false);
                z = zzkjVar.zzg(zzkiVar);
            }
        }
        this.zzN = z;
        if (z) {
            zzkn zzk2 = zzkqVar.zzk();
            zzk2.getClass();
            zzkk zzkkVar = new zzkk();
            zzkkVar.zza(this.zzT - zzk2.zza());
            zzkkVar.zzb(this.zzo.zzj().zzb);
            zzkkVar.zzc(this.zzM);
            zzk2.zzj(new zzkl(zzkkVar, null));
        }
        zzan();
    }

    private final void zzan() {
        zzkn zzk = this.zzs.zzk();
        boolean z = true;
        if (!this.zzN && (zzk == null || !zzk.zza.zzn())) {
            z = false;
        }
        zzld zzldVar = this.zzG;
        if (z != zzldVar.zzg) {
            this.zzG = zzldVar.zzg(z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ce A[EDGE_INSN: B:51:0x00ce->B:52:0x00ce BREAK  A[LOOP:1: B:39:0x00af->B:47:0x00cb], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final zzld zzao(zzup zzupVar, long j, long j2, long j3, boolean z, int i) {
        List list;
        zzyn zzynVar;
        zzkn zzm;
        int i2 = 0;
        this.zzW = (!this.zzW && j == this.zzG.zzs && zzupVar.equals(this.zzG.zzb)) ? false : true;
        zzaj();
        zzld zzldVar = this.zzG;
        zzwq zzwqVar = zzldVar.zzh;
        zzyn zzynVar2 = zzldVar.zzi;
        List list2 = zzldVar.zzj;
        if (this.zzt.zzb()) {
            zzkq zzkqVar = this.zzs;
            zzkn zzm2 = zzkqVar.zzm();
            zzwq zzq = zzm2 == null ? zzwq.zza : zzm2.zzq();
            zzyn zzr = zzm2 == null ? this.zzf : zzm2.zzr();
            zzyf[] zzyfVarArr = zzr.zzc;
            zzgjw zzgjwVar = new zzgjw();
            boolean z2 = false;
            for (zzyf zzyfVar : zzyfVarArr) {
                if (zzyfVar != null) {
                    zzao zzaoVar = zzyfVar.zzb(0).zzl;
                    if (zzaoVar == null) {
                        zzgjwVar.zzf(new zzao(C.TIME_UNSET, new zzan[0]));
                    } else {
                        zzgjwVar.zzf(zzaoVar);
                        z2 = true;
                    }
                }
            }
            zzgjz zzi = z2 ? zzgjwVar.zzi() : zzgjz.zzi();
            if (zzm2 != null) {
                zzko zzkoVar = zzm2.zzg;
                if (zzkoVar.zzc != j2) {
                    zzm2.zzg = zzkoVar.zzb(j2);
                    if (zzkqVar.zzm() == zzkqVar.zzn() && (zzm = zzkqVar.zzm()) != null) {
                        zzyn zzr2 = zzm.zzr();
                        while (true) {
                            zzlp[] zzlpVarArr = this.zzb;
                            if (i2 >= 2) {
                                break;
                            }
                            if (zzr2.zza(i2)) {
                                if (zzlpVarArr[i2].zze() != 1) {
                                    break;
                                }
                                int i3 = zzr2.zzb[i2].zzb;
                            }
                            i2++;
                        }
                    }
                    list = zzi;
                    zzwqVar = zzq;
                    zzynVar = zzr;
                }
            }
            if (zzkqVar.zzm() == zzkqVar.zzn()) {
                zzyn zzr22 = zzm.zzr();
                while (true) {
                    zzlp[] zzlpVarArr2 = this.zzb;
                    if (i2 >= 2) {
                    }
                    i2++;
                }
            }
            list = zzi;
            zzwqVar = zzq;
            zzynVar = zzr;
        } else {
            if (!zzupVar.equals(this.zzG.zzb)) {
                zzynVar2 = this.zzf;
                zzwqVar = zzwq.zza;
                list2 = zzgjz.zzi();
            }
            list = list2;
            zzynVar = zzynVar2;
        }
        if (z) {
            this.zzH.zzc(i);
        }
        return this.zzG.zzc(zzupVar, j, j2, j3, zzat(), zzwqVar, zzynVar, list);
    }

    private final void zzap() throws zzhz {
        zzaq(new boolean[2], this.zzs.zzn().zzc());
    }

    private final void zzaq(boolean[] zArr, long j) throws zzhz {
        zzlp[] zzlpVarArr;
        long j2;
        zzkn zzn = this.zzs.zzn();
        zzyn zzr = zzn.zzr();
        int i = 0;
        while (true) {
            zzlpVarArr = this.zzb;
            if (i >= 2) {
                break;
            }
            if (!zzr.zza(i)) {
                zzlpVarArr[i].zzF();
            }
            i++;
        }
        int i2 = 0;
        while (i2 < 2) {
            if (!zzr.zza(i2) || zzlpVarArr[i2].zzp(zzn)) {
                j2 = j;
            } else {
                j2 = j;
                zzar(zzn, i2, zArr[i2], j2);
            }
            i2++;
            j = j2;
        }
    }

    private final void zzar(zzkn zzknVar, int i, boolean z, long j) throws zzhz {
        zzlp zzlpVar = this.zzb[i];
        if (zzlpVar.zzL()) {
            return;
        }
        boolean z2 = zzknVar == this.zzs.zzm();
        zzyn zzr = zzknVar.zzr();
        zzlo zzloVar = zzr.zzb[i];
        zzyf zzyfVar = zzr.zzc[i];
        boolean z3 = zzax() && this.zzG.zze == 3;
        boolean z4 = !z && z3;
        this.zzR++;
        zzlpVar.zzx(zzloVar, zzyfVar, zzknVar.zzc[i], this.zzT, z4, z2, j, zzknVar.zza(), zzknVar.zzg.zza, this.zzo);
        zzlpVar.zzy(11, new zzjt(this), zzknVar);
        if (z3 && z2) {
            zzlpVar.zzv();
        }
    }

    private final void zzas(boolean z) {
        zzkn zzk = this.zzs.zzk();
        zzup zzupVar = zzk == null ? this.zzG.zzb : zzk.zzg.zza;
        boolean equals = this.zzG.zzk.equals(zzupVar);
        if (!equals) {
            this.zzG = this.zzG.zzh(zzupVar);
        }
        zzld zzldVar = this.zzG;
        zzldVar.zzq = zzk == null ? zzldVar.zzs : zzk.zzf();
        this.zzG.zzr = zzat();
        if ((!equals || z) && zzk != null && zzk.zze) {
            zzaw(zzk.zzg.zza, zzk.zzq(), zzk.zzr());
        }
    }

    private final long zzat() {
        return zzau(this.zzG.zzq);
    }

    private final long zzau(long j) {
        zzkn zzk = this.zzs.zzk();
        if (zzk == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.zzT - zzk.zza()));
    }

    private final long zzav(zzkn zzknVar) {
        zzghc.zzh(zzknVar.zze);
        return (long) ((zzknVar.zzc() - this.zzT) / this.zzo.zzj().zzb);
    }

    private final void zzaw(zzup zzupVar, zzwq zzwqVar, zzyn zzynVar) {
        long zza2;
        long j;
        zzkq zzkqVar = this.zzs;
        zzkn zzk = zzkqVar.zzk();
        zzk.getClass();
        if (zzk == zzkqVar.zzm()) {
            zza2 = this.zzT;
            j = zzk.zza();
        } else {
            zza2 = this.zzT - zzk.zza();
            j = zzk.zzg.zzb;
        }
        this.zzg.zzb(new zzki(this.zzv, this.zzG.zza, zzupVar, zza2 - j, zzau(zzk.zzf()), this.zzo.zzj().zzb, this.zzG.zzl, this.zzL, zzP(this.zzG.zza, zzk.zzg.zza) ? this.zzad.zze() : C.TIME_UNSET, this.zzM), zzwqVar, zzynVar.zzc);
    }

    private final boolean zzax() {
        zzld zzldVar = this.zzG;
        return zzldVar.zzl && zzldVar.zzn == 0;
    }

    private final void zzay(int i) throws IOException, zzhz {
        zzlp zzlpVar = this.zzb[i];
        try {
            zzkn zzm = this.zzs.zzm();
            if (zzm == null) {
                throw null;
            }
            zzkn zzknVar = zzm;
            zzlpVar.zzu(zzm);
        } catch (IOException | RuntimeException e) {
            zzlpVar.zze();
            throw e;
        }
    }

    private final boolean zzaz() {
        if (!this.zzy) {
            return false;
        }
        zzlp[] zzlpVarArr = this.zzb;
        for (int i = 0; i < 2; i++) {
            if (zzlpVarArr[i].zzc()) {
                return true;
            }
        }
        return false;
    }

    static int zzr(zzbd zzbdVar, zzbc zzbcVar, int i, boolean z, Object obj, zzbe zzbeVar, zzbe zzbeVar2) {
        zzbd zzbdVar2 = zzbdVar;
        zzbe zzbeVar3 = zzbeVar;
        Object obj2 = zzbeVar3.zzb(zzbeVar3.zzo(obj, zzbcVar).zzc, zzbdVar, 0L).zzb;
        for (int i2 = 0; i2 < zzbeVar2.zza(); i2++) {
            if (zzbeVar2.zzb(i2, zzbdVar, 0L).zzb.equals(obj2)) {
                return i2;
            }
        }
        int zze = zzbeVar3.zze(obj);
        int zzc = zzbeVar3.zzc();
        int i3 = -1;
        int i4 = 0;
        while (true) {
            if (i4 >= zzc || i3 != -1) {
                break;
            }
            zzbe zzbeVar4 = zzbeVar3;
            int zzl = zzbeVar4.zzl(zze, zzbcVar, zzbdVar2, i, z);
            if (zzl == -1) {
                i3 = -1;
                break;
            }
            i3 = zzbeVar2.zze(zzbeVar4.zzf(zzl));
            i4++;
            zzbeVar3 = zzbeVar4;
            zze = zzl;
            zzbdVar2 = zzbdVar;
        }
        if (i3 == -1) {
            return -1;
        }
        return zzbeVar2.zzd(i3, zzbcVar, false).zzc;
    }

    static final /* synthetic */ void zzz(zzlh zzlhVar) {
        try {
            zzaE(zzlhVar);
        } catch (zzhz e) {
            zzds.zzf("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(25:154|(1:155)|(3:635|636|(25:638|(2:640|641)(2:646|(1:648))|642|(1:644)|645|158|159|(1:161)(1:631)|162|(1:629)(2:180|(2:182|(2:183|(3:185|(2:196|197)(4:191|192|193|194)|195)(17:198|199|(2:201|(1:203))|204|(15:444|(3:469|470|(1:472)(2:473|(12:475|(2:476|(2:478|(1:480)(1:481))(3:482|483|(8:497|498|499|(8:505|(3:509|(3:511|(2:513|(2:517|518))(1:522)|520)|523)|524|(1:526)|527|528|(1:530)|531)|534|(1:536)|537|531)))|207|(2:214|(2:215|(1:217)(2:218|(4:220|(3:222|(2:226|227)|228)|231|232))))|233|(4:(1:247)|248|(10:250|(2:252|(2:254|(8:258|259|(3:263|(1:265)|266)|267|(1:269)|270|(2:271|(3:273|(2:275|276)(1:278)|277))|280)))(1:282)|281|259|(4:261|263|(0)|266)|267|(0)|270|(3:271|(1:1)(0)|277)|280)(3:283|284|285)|234)|287|288|289|(3:291|(2:295|(1:297)(17:298|(2:300|(2:301|(3:303|(2:305|306)(5:308|(1:322)(1:312)|313|(1:321)(1:316)|(2:318|319)(1:320))|307)(2:323|324)))(1:438)|325|(4:333|(1:335)|336|(10:338|339|(2:341|(2:342|(3:344|(2:346|347)(1:349)|348)(3:350|351|(7:359|(1:361)(2:380|(1:382)(2:383|384))|362|(1:379)(1:366)|367|(1:378)|370))))|385|362|(1:364)|379|367|(1:369)(1:378)|370))|386|(2:388|(1:390)(1:(13:397|(7:399|(1:401)(1:417)|402|(1:416)(1:406)|407|(1:415)(1:411)|(1:414))|392|(1:394)|339|(0)|385|362|(0)|379|367|(0)(0)|370)(1:396)))|418|(2:420|(2:422|(4:424|425|(4:427|(4:429|(1:431)|432|433)|434|435)|436))(0))|339|(0)|385|362|(0)|379|367|(0)(0)|370))(1:293)|294)|11|12)))|446|(3:450|(3:452|(4:459|(1:466)(1:463)|464|465)|456)|468)|207|(4:209|211|214|(3:215|(0)(0)|217))|233|(9:236|238|240|242|244|(0)|248|(0)(0)|234)|443|287|288|289|(0)|11|12)|206|207|(0)|233|(1:234)|443|287|288|289|(0)|11|12)))(1:627))|628|204|(0)|206|207|(0)|233|(1:234)|443|287|288|289|(0)|11|12))|157|158|159|(0)(0)|162|(1:164)|629|628|204|(0)|206|207|(0)|233|(1:234)|443|287|288|289|(0)|11|12) */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x09ed, code lost:
    
        if (r6 != false) goto L513;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x0a1a, code lost:
    
        if (r7 == false) goto L524;
     */
    /* JADX WARN: Code restructure failed: missing block: B:632:0x0876, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:634:0x0ae1, code lost:
    
        r22 = r12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04db A[Catch: zzhz -> 0x04e9, RuntimeException -> 0x0873, IOException -> 0x0b34, zztp -> 0x0b3b, zzgb -> 0x0b42, zzas -> 0x0b49, zzrm -> 0x0b5f, TRY_ENTER, TRY_LEAVE, TryCatch #18 {RuntimeException -> 0x0873, blocks: (B:641:0x04a7, B:642:0x04be, B:644:0x04c4, B:645:0x04c9, B:159:0x04d7, B:161:0x04db, B:162:0x04ee, B:164:0x04f5, B:166:0x04f9, B:168:0x04fd, B:170:0x0503, B:172:0x0509, B:174:0x050f, B:176:0x0515, B:178:0x051d, B:180:0x0529, B:182:0x0533, B:183:0x0539, B:185:0x053d, B:187:0x0543, B:189:0x054b, B:191:0x0553, B:631:0x04eb, B:646:0x04ad, B:648:0x04b3), top: B:155:0x0491 }] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0741 A[Catch: RuntimeException -> 0x0afe, zzhz -> 0x0b00, IOException -> 0x0b34, zztp -> 0x0b3b, zzgb -> 0x0b42, zzas -> 0x0b49, zzrm -> 0x0b5f, TryCatch #31 {zzhz -> 0x0b00, RuntimeException -> 0x0afe, blocks: (B:193:0x056a, B:195:0x0579, B:199:0x0582, B:201:0x0593, B:203:0x05a1, B:204:0x05b9, B:207:0x073b, B:209:0x0741, B:211:0x0747, B:214:0x074c, B:215:0x0757, B:217:0x075b, B:222:0x0780, B:224:0x0786, B:226:0x078e, B:228:0x0796, B:232:0x0799, B:234:0x07a2, B:288:0x086e, B:289:0x0886, B:295:0x0892, B:297:0x089a, B:298:0x08a1, B:300:0x08af, B:301:0x08c9, B:303:0x08cd, B:305:0x08d5, B:307:0x0902, B:308:0x08db, B:310:0x08e6, B:313:0x08ef, B:318:0x08ff, B:325:0x0916, B:327:0x091c, B:331:0x0924, B:333:0x092c, B:335:0x0930, B:336:0x093b, B:338:0x0941, B:339:0x0a4e, B:342:0x0a56, B:344:0x0a5a, B:346:0x0a62, B:348:0x0a65, B:351:0x0a69, B:353:0x0a6f, B:355:0x0a78, B:357:0x0a82, B:359:0x0a88, B:361:0x0a8e, B:362:0x0aae, B:364:0x0ab4, B:367:0x0abe, B:370:0x0ad9, B:376:0x0ad2, B:378:0x0ad6, B:380:0x0a95, B:383:0x0aa3, B:384:0x0aa9, B:385:0x0aaa, B:386:0x094a, B:388:0x0951, B:390:0x0955, B:392:0x09ef, B:394:0x09fb, B:397:0x095f, B:399:0x0963, B:401:0x0975, B:402:0x0980, B:404:0x098a, B:407:0x0993, B:409:0x099d, B:414:0x09a8, B:418:0x0a08, B:420:0x0a0f, B:422:0x0a13, B:425:0x0a1c, B:427:0x0a2c, B:429:0x0a32, B:431:0x0a3c, B:433:0x0a41, B:435:0x0a46, B:436:0x0a4b, B:438:0x090d, B:236:0x07ac, B:238:0x07b0, B:240:0x07b6, B:242:0x07bc, B:244:0x07c6, B:247:0x07cc, B:248:0x07cf, B:250:0x07d8, B:252:0x07ed, B:254:0x07f6, B:256:0x07fe, B:259:0x0808, B:261:0x0832, B:263:0x0838, B:265:0x083d, B:267:0x0845, B:269:0x084b, B:270:0x084e, B:271:0x0857, B:273:0x085b, B:275:0x0861, B:277:0x0866, B:285:0x086d, B:444:0x05c4, B:478:0x05dd, B:485:0x05ee, B:489:0x0600, B:494:0x0616, B:499:0x0655, B:501:0x065c, B:503:0x0660, B:505:0x0670, B:507:0x0674, B:511:0x067b, B:513:0x0681, B:515:0x069e, B:520:0x06a7, B:524:0x06aa, B:526:0x06b1, B:528:0x06b9, B:530:0x06bf, B:532:0x0666, B:536:0x06cd, B:446:0x06ff, B:448:0x0708, B:450:0x070c, B:452:0x0711, B:456:0x0738, B:457:0x071a, B:459:0x0720, B:463:0x072e, B:464:0x0735, B:661:0x0ae4, B:664:0x0aef), top: B:4:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x075b A[Catch: RuntimeException -> 0x0afe, zzhz -> 0x0b00, IOException -> 0x0b34, zztp -> 0x0b3b, zzgb -> 0x0b42, zzas -> 0x0b49, zzrm -> 0x0b5f, LOOP:5: B:215:0x0757->B:217:0x075b, LOOP_END, TryCatch #31 {zzhz -> 0x0b00, RuntimeException -> 0x0afe, blocks: (B:193:0x056a, B:195:0x0579, B:199:0x0582, B:201:0x0593, B:203:0x05a1, B:204:0x05b9, B:207:0x073b, B:209:0x0741, B:211:0x0747, B:214:0x074c, B:215:0x0757, B:217:0x075b, B:222:0x0780, B:224:0x0786, B:226:0x078e, B:228:0x0796, B:232:0x0799, B:234:0x07a2, B:288:0x086e, B:289:0x0886, B:295:0x0892, B:297:0x089a, B:298:0x08a1, B:300:0x08af, B:301:0x08c9, B:303:0x08cd, B:305:0x08d5, B:307:0x0902, B:308:0x08db, B:310:0x08e6, B:313:0x08ef, B:318:0x08ff, B:325:0x0916, B:327:0x091c, B:331:0x0924, B:333:0x092c, B:335:0x0930, B:336:0x093b, B:338:0x0941, B:339:0x0a4e, B:342:0x0a56, B:344:0x0a5a, B:346:0x0a62, B:348:0x0a65, B:351:0x0a69, B:353:0x0a6f, B:355:0x0a78, B:357:0x0a82, B:359:0x0a88, B:361:0x0a8e, B:362:0x0aae, B:364:0x0ab4, B:367:0x0abe, B:370:0x0ad9, B:376:0x0ad2, B:378:0x0ad6, B:380:0x0a95, B:383:0x0aa3, B:384:0x0aa9, B:385:0x0aaa, B:386:0x094a, B:388:0x0951, B:390:0x0955, B:392:0x09ef, B:394:0x09fb, B:397:0x095f, B:399:0x0963, B:401:0x0975, B:402:0x0980, B:404:0x098a, B:407:0x0993, B:409:0x099d, B:414:0x09a8, B:418:0x0a08, B:420:0x0a0f, B:422:0x0a13, B:425:0x0a1c, B:427:0x0a2c, B:429:0x0a32, B:431:0x0a3c, B:433:0x0a41, B:435:0x0a46, B:436:0x0a4b, B:438:0x090d, B:236:0x07ac, B:238:0x07b0, B:240:0x07b6, B:242:0x07bc, B:244:0x07c6, B:247:0x07cc, B:248:0x07cf, B:250:0x07d8, B:252:0x07ed, B:254:0x07f6, B:256:0x07fe, B:259:0x0808, B:261:0x0832, B:263:0x0838, B:265:0x083d, B:267:0x0845, B:269:0x084b, B:270:0x084e, B:271:0x0857, B:273:0x085b, B:275:0x0861, B:277:0x0866, B:285:0x086d, B:444:0x05c4, B:478:0x05dd, B:485:0x05ee, B:489:0x0600, B:494:0x0616, B:499:0x0655, B:501:0x065c, B:503:0x0660, B:505:0x0670, B:507:0x0674, B:511:0x067b, B:513:0x0681, B:515:0x069e, B:520:0x06a7, B:524:0x06aa, B:526:0x06b1, B:528:0x06b9, B:530:0x06bf, B:532:0x0666, B:536:0x06cd, B:446:0x06ff, B:448:0x0708, B:450:0x070c, B:452:0x0711, B:456:0x0738, B:457:0x071a, B:459:0x0720, B:463:0x072e, B:464:0x0735, B:661:0x0ae4, B:664:0x0aef), top: B:4:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x077b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x07ac A[Catch: RuntimeException -> 0x0afe, zzhz -> 0x0b00, IOException -> 0x0b34, zztp -> 0x0b3b, zzgb -> 0x0b42, zzas -> 0x0b49, zzrm -> 0x0b5f, TryCatch #31 {zzhz -> 0x0b00, RuntimeException -> 0x0afe, blocks: (B:193:0x056a, B:195:0x0579, B:199:0x0582, B:201:0x0593, B:203:0x05a1, B:204:0x05b9, B:207:0x073b, B:209:0x0741, B:211:0x0747, B:214:0x074c, B:215:0x0757, B:217:0x075b, B:222:0x0780, B:224:0x0786, B:226:0x078e, B:228:0x0796, B:232:0x0799, B:234:0x07a2, B:288:0x086e, B:289:0x0886, B:295:0x0892, B:297:0x089a, B:298:0x08a1, B:300:0x08af, B:301:0x08c9, B:303:0x08cd, B:305:0x08d5, B:307:0x0902, B:308:0x08db, B:310:0x08e6, B:313:0x08ef, B:318:0x08ff, B:325:0x0916, B:327:0x091c, B:331:0x0924, B:333:0x092c, B:335:0x0930, B:336:0x093b, B:338:0x0941, B:339:0x0a4e, B:342:0x0a56, B:344:0x0a5a, B:346:0x0a62, B:348:0x0a65, B:351:0x0a69, B:353:0x0a6f, B:355:0x0a78, B:357:0x0a82, B:359:0x0a88, B:361:0x0a8e, B:362:0x0aae, B:364:0x0ab4, B:367:0x0abe, B:370:0x0ad9, B:376:0x0ad2, B:378:0x0ad6, B:380:0x0a95, B:383:0x0aa3, B:384:0x0aa9, B:385:0x0aaa, B:386:0x094a, B:388:0x0951, B:390:0x0955, B:392:0x09ef, B:394:0x09fb, B:397:0x095f, B:399:0x0963, B:401:0x0975, B:402:0x0980, B:404:0x098a, B:407:0x0993, B:409:0x099d, B:414:0x09a8, B:418:0x0a08, B:420:0x0a0f, B:422:0x0a13, B:425:0x0a1c, B:427:0x0a2c, B:429:0x0a32, B:431:0x0a3c, B:433:0x0a41, B:435:0x0a46, B:436:0x0a4b, B:438:0x090d, B:236:0x07ac, B:238:0x07b0, B:240:0x07b6, B:242:0x07bc, B:244:0x07c6, B:247:0x07cc, B:248:0x07cf, B:250:0x07d8, B:252:0x07ed, B:254:0x07f6, B:256:0x07fe, B:259:0x0808, B:261:0x0832, B:263:0x0838, B:265:0x083d, B:267:0x0845, B:269:0x084b, B:270:0x084e, B:271:0x0857, B:273:0x085b, B:275:0x0861, B:277:0x0866, B:285:0x086d, B:444:0x05c4, B:478:0x05dd, B:485:0x05ee, B:489:0x0600, B:494:0x0616, B:499:0x0655, B:501:0x065c, B:503:0x0660, B:505:0x0670, B:507:0x0674, B:511:0x067b, B:513:0x0681, B:515:0x069e, B:520:0x06a7, B:524:0x06aa, B:526:0x06b1, B:528:0x06b9, B:530:0x06bf, B:532:0x0666, B:536:0x06cd, B:446:0x06ff, B:448:0x0708, B:450:0x070c, B:452:0x0711, B:456:0x0738, B:457:0x071a, B:459:0x0720, B:463:0x072e, B:464:0x0735, B:661:0x0ae4, B:664:0x0aef), top: B:4:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x07cc A[Catch: RuntimeException -> 0x0afe, zzhz -> 0x0b00, IOException -> 0x0b34, zztp -> 0x0b3b, zzgb -> 0x0b42, zzas -> 0x0b49, zzrm -> 0x0b5f, TryCatch #31 {zzhz -> 0x0b00, RuntimeException -> 0x0afe, blocks: (B:193:0x056a, B:195:0x0579, B:199:0x0582, B:201:0x0593, B:203:0x05a1, B:204:0x05b9, B:207:0x073b, B:209:0x0741, B:211:0x0747, B:214:0x074c, B:215:0x0757, B:217:0x075b, B:222:0x0780, B:224:0x0786, B:226:0x078e, B:228:0x0796, B:232:0x0799, B:234:0x07a2, B:288:0x086e, B:289:0x0886, B:295:0x0892, B:297:0x089a, B:298:0x08a1, B:300:0x08af, B:301:0x08c9, B:303:0x08cd, B:305:0x08d5, B:307:0x0902, B:308:0x08db, B:310:0x08e6, B:313:0x08ef, B:318:0x08ff, B:325:0x0916, B:327:0x091c, B:331:0x0924, B:333:0x092c, B:335:0x0930, B:336:0x093b, B:338:0x0941, B:339:0x0a4e, B:342:0x0a56, B:344:0x0a5a, B:346:0x0a62, B:348:0x0a65, B:351:0x0a69, B:353:0x0a6f, B:355:0x0a78, B:357:0x0a82, B:359:0x0a88, B:361:0x0a8e, B:362:0x0aae, B:364:0x0ab4, B:367:0x0abe, B:370:0x0ad9, B:376:0x0ad2, B:378:0x0ad6, B:380:0x0a95, B:383:0x0aa3, B:384:0x0aa9, B:385:0x0aaa, B:386:0x094a, B:388:0x0951, B:390:0x0955, B:392:0x09ef, B:394:0x09fb, B:397:0x095f, B:399:0x0963, B:401:0x0975, B:402:0x0980, B:404:0x098a, B:407:0x0993, B:409:0x099d, B:414:0x09a8, B:418:0x0a08, B:420:0x0a0f, B:422:0x0a13, B:425:0x0a1c, B:427:0x0a2c, B:429:0x0a32, B:431:0x0a3c, B:433:0x0a41, B:435:0x0a46, B:436:0x0a4b, B:438:0x090d, B:236:0x07ac, B:238:0x07b0, B:240:0x07b6, B:242:0x07bc, B:244:0x07c6, B:247:0x07cc, B:248:0x07cf, B:250:0x07d8, B:252:0x07ed, B:254:0x07f6, B:256:0x07fe, B:259:0x0808, B:261:0x0832, B:263:0x0838, B:265:0x083d, B:267:0x0845, B:269:0x084b, B:270:0x084e, B:271:0x0857, B:273:0x085b, B:275:0x0861, B:277:0x0866, B:285:0x086d, B:444:0x05c4, B:478:0x05dd, B:485:0x05ee, B:489:0x0600, B:494:0x0616, B:499:0x0655, B:501:0x065c, B:503:0x0660, B:505:0x0670, B:507:0x0674, B:511:0x067b, B:513:0x0681, B:515:0x069e, B:520:0x06a7, B:524:0x06aa, B:526:0x06b1, B:528:0x06b9, B:530:0x06bf, B:532:0x0666, B:536:0x06cd, B:446:0x06ff, B:448:0x0708, B:450:0x070c, B:452:0x0711, B:456:0x0738, B:457:0x071a, B:459:0x0720, B:463:0x072e, B:464:0x0735, B:661:0x0ae4, B:664:0x0aef), top: B:4:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x07d8 A[Catch: RuntimeException -> 0x0afe, zzhz -> 0x0b00, IOException -> 0x0b34, zztp -> 0x0b3b, zzgb -> 0x0b42, zzas -> 0x0b49, zzrm -> 0x0b5f, TryCatch #31 {zzhz -> 0x0b00, RuntimeException -> 0x0afe, blocks: (B:193:0x056a, B:195:0x0579, B:199:0x0582, B:201:0x0593, B:203:0x05a1, B:204:0x05b9, B:207:0x073b, B:209:0x0741, B:211:0x0747, B:214:0x074c, B:215:0x0757, B:217:0x075b, B:222:0x0780, B:224:0x0786, B:226:0x078e, B:228:0x0796, B:232:0x0799, B:234:0x07a2, B:288:0x086e, B:289:0x0886, B:295:0x0892, B:297:0x089a, B:298:0x08a1, B:300:0x08af, B:301:0x08c9, B:303:0x08cd, B:305:0x08d5, B:307:0x0902, B:308:0x08db, B:310:0x08e6, B:313:0x08ef, B:318:0x08ff, B:325:0x0916, B:327:0x091c, B:331:0x0924, B:333:0x092c, B:335:0x0930, B:336:0x093b, B:338:0x0941, B:339:0x0a4e, B:342:0x0a56, B:344:0x0a5a, B:346:0x0a62, B:348:0x0a65, B:351:0x0a69, B:353:0x0a6f, B:355:0x0a78, B:357:0x0a82, B:359:0x0a88, B:361:0x0a8e, B:362:0x0aae, B:364:0x0ab4, B:367:0x0abe, B:370:0x0ad9, B:376:0x0ad2, B:378:0x0ad6, B:380:0x0a95, B:383:0x0aa3, B:384:0x0aa9, B:385:0x0aaa, B:386:0x094a, B:388:0x0951, B:390:0x0955, B:392:0x09ef, B:394:0x09fb, B:397:0x095f, B:399:0x0963, B:401:0x0975, B:402:0x0980, B:404:0x098a, B:407:0x0993, B:409:0x099d, B:414:0x09a8, B:418:0x0a08, B:420:0x0a0f, B:422:0x0a13, B:425:0x0a1c, B:427:0x0a2c, B:429:0x0a32, B:431:0x0a3c, B:433:0x0a41, B:435:0x0a46, B:436:0x0a4b, B:438:0x090d, B:236:0x07ac, B:238:0x07b0, B:240:0x07b6, B:242:0x07bc, B:244:0x07c6, B:247:0x07cc, B:248:0x07cf, B:250:0x07d8, B:252:0x07ed, B:254:0x07f6, B:256:0x07fe, B:259:0x0808, B:261:0x0832, B:263:0x0838, B:265:0x083d, B:267:0x0845, B:269:0x084b, B:270:0x084e, B:271:0x0857, B:273:0x085b, B:275:0x0861, B:277:0x0866, B:285:0x086d, B:444:0x05c4, B:478:0x05dd, B:485:0x05ee, B:489:0x0600, B:494:0x0616, B:499:0x0655, B:501:0x065c, B:503:0x0660, B:505:0x0670, B:507:0x0674, B:511:0x067b, B:513:0x0681, B:515:0x069e, B:520:0x06a7, B:524:0x06aa, B:526:0x06b1, B:528:0x06b9, B:530:0x06bf, B:532:0x0666, B:536:0x06cd, B:446:0x06ff, B:448:0x0708, B:450:0x070c, B:452:0x0711, B:456:0x0738, B:457:0x071a, B:459:0x0720, B:463:0x072e, B:464:0x0735, B:661:0x0ae4, B:664:0x0aef), top: B:4:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x083d A[Catch: RuntimeException -> 0x0afe, zzhz -> 0x0b00, IOException -> 0x0b34, zztp -> 0x0b3b, zzgb -> 0x0b42, zzas -> 0x0b49, zzrm -> 0x0b5f, LOOP:8: B:264:0x083b->B:265:0x083d, LOOP_END, TryCatch #31 {zzhz -> 0x0b00, RuntimeException -> 0x0afe, blocks: (B:193:0x056a, B:195:0x0579, B:199:0x0582, B:201:0x0593, B:203:0x05a1, B:204:0x05b9, B:207:0x073b, B:209:0x0741, B:211:0x0747, B:214:0x074c, B:215:0x0757, B:217:0x075b, B:222:0x0780, B:224:0x0786, B:226:0x078e, B:228:0x0796, B:232:0x0799, B:234:0x07a2, B:288:0x086e, B:289:0x0886, B:295:0x0892, B:297:0x089a, B:298:0x08a1, B:300:0x08af, B:301:0x08c9, B:303:0x08cd, B:305:0x08d5, B:307:0x0902, B:308:0x08db, B:310:0x08e6, B:313:0x08ef, B:318:0x08ff, B:325:0x0916, B:327:0x091c, B:331:0x0924, B:333:0x092c, B:335:0x0930, B:336:0x093b, B:338:0x0941, B:339:0x0a4e, B:342:0x0a56, B:344:0x0a5a, B:346:0x0a62, B:348:0x0a65, B:351:0x0a69, B:353:0x0a6f, B:355:0x0a78, B:357:0x0a82, B:359:0x0a88, B:361:0x0a8e, B:362:0x0aae, B:364:0x0ab4, B:367:0x0abe, B:370:0x0ad9, B:376:0x0ad2, B:378:0x0ad6, B:380:0x0a95, B:383:0x0aa3, B:384:0x0aa9, B:385:0x0aaa, B:386:0x094a, B:388:0x0951, B:390:0x0955, B:392:0x09ef, B:394:0x09fb, B:397:0x095f, B:399:0x0963, B:401:0x0975, B:402:0x0980, B:404:0x098a, B:407:0x0993, B:409:0x099d, B:414:0x09a8, B:418:0x0a08, B:420:0x0a0f, B:422:0x0a13, B:425:0x0a1c, B:427:0x0a2c, B:429:0x0a32, B:431:0x0a3c, B:433:0x0a41, B:435:0x0a46, B:436:0x0a4b, B:438:0x090d, B:236:0x07ac, B:238:0x07b0, B:240:0x07b6, B:242:0x07bc, B:244:0x07c6, B:247:0x07cc, B:248:0x07cf, B:250:0x07d8, B:252:0x07ed, B:254:0x07f6, B:256:0x07fe, B:259:0x0808, B:261:0x0832, B:263:0x0838, B:265:0x083d, B:267:0x0845, B:269:0x084b, B:270:0x084e, B:271:0x0857, B:273:0x085b, B:275:0x0861, B:277:0x0866, B:285:0x086d, B:444:0x05c4, B:478:0x05dd, B:485:0x05ee, B:489:0x0600, B:494:0x0616, B:499:0x0655, B:501:0x065c, B:503:0x0660, B:505:0x0670, B:507:0x0674, B:511:0x067b, B:513:0x0681, B:515:0x069e, B:520:0x06a7, B:524:0x06aa, B:526:0x06b1, B:528:0x06b9, B:530:0x06bf, B:532:0x0666, B:536:0x06cd, B:446:0x06ff, B:448:0x0708, B:450:0x070c, B:452:0x0711, B:456:0x0738, B:457:0x071a, B:459:0x0720, B:463:0x072e, B:464:0x0735, B:661:0x0ae4, B:664:0x0aef), top: B:4:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x084b A[Catch: RuntimeException -> 0x0afe, zzhz -> 0x0b00, IOException -> 0x0b34, zztp -> 0x0b3b, zzgb -> 0x0b42, zzas -> 0x0b49, zzrm -> 0x0b5f, TryCatch #31 {zzhz -> 0x0b00, RuntimeException -> 0x0afe, blocks: (B:193:0x056a, B:195:0x0579, B:199:0x0582, B:201:0x0593, B:203:0x05a1, B:204:0x05b9, B:207:0x073b, B:209:0x0741, B:211:0x0747, B:214:0x074c, B:215:0x0757, B:217:0x075b, B:222:0x0780, B:224:0x0786, B:226:0x078e, B:228:0x0796, B:232:0x0799, B:234:0x07a2, B:288:0x086e, B:289:0x0886, B:295:0x0892, B:297:0x089a, B:298:0x08a1, B:300:0x08af, B:301:0x08c9, B:303:0x08cd, B:305:0x08d5, B:307:0x0902, B:308:0x08db, B:310:0x08e6, B:313:0x08ef, B:318:0x08ff, B:325:0x0916, B:327:0x091c, B:331:0x0924, B:333:0x092c, B:335:0x0930, B:336:0x093b, B:338:0x0941, B:339:0x0a4e, B:342:0x0a56, B:344:0x0a5a, B:346:0x0a62, B:348:0x0a65, B:351:0x0a69, B:353:0x0a6f, B:355:0x0a78, B:357:0x0a82, B:359:0x0a88, B:361:0x0a8e, B:362:0x0aae, B:364:0x0ab4, B:367:0x0abe, B:370:0x0ad9, B:376:0x0ad2, B:378:0x0ad6, B:380:0x0a95, B:383:0x0aa3, B:384:0x0aa9, B:385:0x0aaa, B:386:0x094a, B:388:0x0951, B:390:0x0955, B:392:0x09ef, B:394:0x09fb, B:397:0x095f, B:399:0x0963, B:401:0x0975, B:402:0x0980, B:404:0x098a, B:407:0x0993, B:409:0x099d, B:414:0x09a8, B:418:0x0a08, B:420:0x0a0f, B:422:0x0a13, B:425:0x0a1c, B:427:0x0a2c, B:429:0x0a32, B:431:0x0a3c, B:433:0x0a41, B:435:0x0a46, B:436:0x0a4b, B:438:0x090d, B:236:0x07ac, B:238:0x07b0, B:240:0x07b6, B:242:0x07bc, B:244:0x07c6, B:247:0x07cc, B:248:0x07cf, B:250:0x07d8, B:252:0x07ed, B:254:0x07f6, B:256:0x07fe, B:259:0x0808, B:261:0x0832, B:263:0x0838, B:265:0x083d, B:267:0x0845, B:269:0x084b, B:270:0x084e, B:271:0x0857, B:273:0x085b, B:275:0x0861, B:277:0x0866, B:285:0x086d, B:444:0x05c4, B:478:0x05dd, B:485:0x05ee, B:489:0x0600, B:494:0x0616, B:499:0x0655, B:501:0x065c, B:503:0x0660, B:505:0x0670, B:507:0x0674, B:511:0x067b, B:513:0x0681, B:515:0x069e, B:520:0x06a7, B:524:0x06aa, B:526:0x06b1, B:528:0x06b9, B:530:0x06bf, B:532:0x0666, B:536:0x06cd, B:446:0x06ff, B:448:0x0708, B:450:0x070c, B:452:0x0711, B:456:0x0738, B:457:0x071a, B:459:0x0720, B:463:0x072e, B:464:0x0735, B:661:0x0ae4, B:664:0x0aef), top: B:4:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x085b A[Catch: RuntimeException -> 0x0afe, zzhz -> 0x0b00, IOException -> 0x0b34, zztp -> 0x0b3b, zzgb -> 0x0b42, zzas -> 0x0b49, zzrm -> 0x0b5f, TryCatch #31 {zzhz -> 0x0b00, RuntimeException -> 0x0afe, blocks: (B:193:0x056a, B:195:0x0579, B:199:0x0582, B:201:0x0593, B:203:0x05a1, B:204:0x05b9, B:207:0x073b, B:209:0x0741, B:211:0x0747, B:214:0x074c, B:215:0x0757, B:217:0x075b, B:222:0x0780, B:224:0x0786, B:226:0x078e, B:228:0x0796, B:232:0x0799, B:234:0x07a2, B:288:0x086e, B:289:0x0886, B:295:0x0892, B:297:0x089a, B:298:0x08a1, B:300:0x08af, B:301:0x08c9, B:303:0x08cd, B:305:0x08d5, B:307:0x0902, B:308:0x08db, B:310:0x08e6, B:313:0x08ef, B:318:0x08ff, B:325:0x0916, B:327:0x091c, B:331:0x0924, B:333:0x092c, B:335:0x0930, B:336:0x093b, B:338:0x0941, B:339:0x0a4e, B:342:0x0a56, B:344:0x0a5a, B:346:0x0a62, B:348:0x0a65, B:351:0x0a69, B:353:0x0a6f, B:355:0x0a78, B:357:0x0a82, B:359:0x0a88, B:361:0x0a8e, B:362:0x0aae, B:364:0x0ab4, B:367:0x0abe, B:370:0x0ad9, B:376:0x0ad2, B:378:0x0ad6, B:380:0x0a95, B:383:0x0aa3, B:384:0x0aa9, B:385:0x0aaa, B:386:0x094a, B:388:0x0951, B:390:0x0955, B:392:0x09ef, B:394:0x09fb, B:397:0x095f, B:399:0x0963, B:401:0x0975, B:402:0x0980, B:404:0x098a, B:407:0x0993, B:409:0x099d, B:414:0x09a8, B:418:0x0a08, B:420:0x0a0f, B:422:0x0a13, B:425:0x0a1c, B:427:0x0a2c, B:429:0x0a32, B:431:0x0a3c, B:433:0x0a41, B:435:0x0a46, B:436:0x0a4b, B:438:0x090d, B:236:0x07ac, B:238:0x07b0, B:240:0x07b6, B:242:0x07bc, B:244:0x07c6, B:247:0x07cc, B:248:0x07cf, B:250:0x07d8, B:252:0x07ed, B:254:0x07f6, B:256:0x07fe, B:259:0x0808, B:261:0x0832, B:263:0x0838, B:265:0x083d, B:267:0x0845, B:269:0x084b, B:270:0x084e, B:271:0x0857, B:273:0x085b, B:275:0x0861, B:277:0x0866, B:285:0x086d, B:444:0x05c4, B:478:0x05dd, B:485:0x05ee, B:489:0x0600, B:494:0x0616, B:499:0x0655, B:501:0x065c, B:503:0x0660, B:505:0x0670, B:507:0x0674, B:511:0x067b, B:513:0x0681, B:515:0x069e, B:520:0x06a7, B:524:0x06aa, B:526:0x06b1, B:528:0x06b9, B:530:0x06bf, B:532:0x0666, B:536:0x06cd, B:446:0x06ff, B:448:0x0708, B:450:0x070c, B:452:0x0711, B:456:0x0738, B:457:0x071a, B:459:0x0720, B:463:0x072e, B:464:0x0735, B:661:0x0ae4, B:664:0x0aef), top: B:4:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x086c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x088d  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0a55  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0ab4 A[Catch: RuntimeException -> 0x0afe, zzhz -> 0x0b00, IOException -> 0x0b34, zztp -> 0x0b3b, zzgb -> 0x0b42, zzas -> 0x0b49, zzrm -> 0x0b5f, TryCatch #31 {zzhz -> 0x0b00, RuntimeException -> 0x0afe, blocks: (B:193:0x056a, B:195:0x0579, B:199:0x0582, B:201:0x0593, B:203:0x05a1, B:204:0x05b9, B:207:0x073b, B:209:0x0741, B:211:0x0747, B:214:0x074c, B:215:0x0757, B:217:0x075b, B:222:0x0780, B:224:0x0786, B:226:0x078e, B:228:0x0796, B:232:0x0799, B:234:0x07a2, B:288:0x086e, B:289:0x0886, B:295:0x0892, B:297:0x089a, B:298:0x08a1, B:300:0x08af, B:301:0x08c9, B:303:0x08cd, B:305:0x08d5, B:307:0x0902, B:308:0x08db, B:310:0x08e6, B:313:0x08ef, B:318:0x08ff, B:325:0x0916, B:327:0x091c, B:331:0x0924, B:333:0x092c, B:335:0x0930, B:336:0x093b, B:338:0x0941, B:339:0x0a4e, B:342:0x0a56, B:344:0x0a5a, B:346:0x0a62, B:348:0x0a65, B:351:0x0a69, B:353:0x0a6f, B:355:0x0a78, B:357:0x0a82, B:359:0x0a88, B:361:0x0a8e, B:362:0x0aae, B:364:0x0ab4, B:367:0x0abe, B:370:0x0ad9, B:376:0x0ad2, B:378:0x0ad6, B:380:0x0a95, B:383:0x0aa3, B:384:0x0aa9, B:385:0x0aaa, B:386:0x094a, B:388:0x0951, B:390:0x0955, B:392:0x09ef, B:394:0x09fb, B:397:0x095f, B:399:0x0963, B:401:0x0975, B:402:0x0980, B:404:0x098a, B:407:0x0993, B:409:0x099d, B:414:0x09a8, B:418:0x0a08, B:420:0x0a0f, B:422:0x0a13, B:425:0x0a1c, B:427:0x0a2c, B:429:0x0a32, B:431:0x0a3c, B:433:0x0a41, B:435:0x0a46, B:436:0x0a4b, B:438:0x090d, B:236:0x07ac, B:238:0x07b0, B:240:0x07b6, B:242:0x07bc, B:244:0x07c6, B:247:0x07cc, B:248:0x07cf, B:250:0x07d8, B:252:0x07ed, B:254:0x07f6, B:256:0x07fe, B:259:0x0808, B:261:0x0832, B:263:0x0838, B:265:0x083d, B:267:0x0845, B:269:0x084b, B:270:0x084e, B:271:0x0857, B:273:0x085b, B:275:0x0861, B:277:0x0866, B:285:0x086d, B:444:0x05c4, B:478:0x05dd, B:485:0x05ee, B:489:0x0600, B:494:0x0616, B:499:0x0655, B:501:0x065c, B:503:0x0660, B:505:0x0670, B:507:0x0674, B:511:0x067b, B:513:0x0681, B:515:0x069e, B:520:0x06a7, B:524:0x06aa, B:526:0x06b1, B:528:0x06b9, B:530:0x06bf, B:532:0x0666, B:536:0x06cd, B:446:0x06ff, B:448:0x0708, B:450:0x070c, B:452:0x0711, B:456:0x0738, B:457:0x071a, B:459:0x0720, B:463:0x072e, B:464:0x0735, B:661:0x0ae4, B:664:0x0aef), top: B:4:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0ac9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0aca A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:444:0x05c4 A[Catch: RuntimeException -> 0x0afe, zzhz -> 0x0b00, IOException -> 0x0b34, zztp -> 0x0b3b, zzgb -> 0x0b42, zzas -> 0x0b49, zzrm -> 0x0b5f, TRY_LEAVE, TryCatch #31 {zzhz -> 0x0b00, RuntimeException -> 0x0afe, blocks: (B:193:0x056a, B:195:0x0579, B:199:0x0582, B:201:0x0593, B:203:0x05a1, B:204:0x05b9, B:207:0x073b, B:209:0x0741, B:211:0x0747, B:214:0x074c, B:215:0x0757, B:217:0x075b, B:222:0x0780, B:224:0x0786, B:226:0x078e, B:228:0x0796, B:232:0x0799, B:234:0x07a2, B:288:0x086e, B:289:0x0886, B:295:0x0892, B:297:0x089a, B:298:0x08a1, B:300:0x08af, B:301:0x08c9, B:303:0x08cd, B:305:0x08d5, B:307:0x0902, B:308:0x08db, B:310:0x08e6, B:313:0x08ef, B:318:0x08ff, B:325:0x0916, B:327:0x091c, B:331:0x0924, B:333:0x092c, B:335:0x0930, B:336:0x093b, B:338:0x0941, B:339:0x0a4e, B:342:0x0a56, B:344:0x0a5a, B:346:0x0a62, B:348:0x0a65, B:351:0x0a69, B:353:0x0a6f, B:355:0x0a78, B:357:0x0a82, B:359:0x0a88, B:361:0x0a8e, B:362:0x0aae, B:364:0x0ab4, B:367:0x0abe, B:370:0x0ad9, B:376:0x0ad2, B:378:0x0ad6, B:380:0x0a95, B:383:0x0aa3, B:384:0x0aa9, B:385:0x0aaa, B:386:0x094a, B:388:0x0951, B:390:0x0955, B:392:0x09ef, B:394:0x09fb, B:397:0x095f, B:399:0x0963, B:401:0x0975, B:402:0x0980, B:404:0x098a, B:407:0x0993, B:409:0x099d, B:414:0x09a8, B:418:0x0a08, B:420:0x0a0f, B:422:0x0a13, B:425:0x0a1c, B:427:0x0a2c, B:429:0x0a32, B:431:0x0a3c, B:433:0x0a41, B:435:0x0a46, B:436:0x0a4b, B:438:0x090d, B:236:0x07ac, B:238:0x07b0, B:240:0x07b6, B:242:0x07bc, B:244:0x07c6, B:247:0x07cc, B:248:0x07cf, B:250:0x07d8, B:252:0x07ed, B:254:0x07f6, B:256:0x07fe, B:259:0x0808, B:261:0x0832, B:263:0x0838, B:265:0x083d, B:267:0x0845, B:269:0x084b, B:270:0x084e, B:271:0x0857, B:273:0x085b, B:275:0x0861, B:277:0x0866, B:285:0x086d, B:444:0x05c4, B:478:0x05dd, B:485:0x05ee, B:489:0x0600, B:494:0x0616, B:499:0x0655, B:501:0x065c, B:503:0x0660, B:505:0x0670, B:507:0x0674, B:511:0x067b, B:513:0x0681, B:515:0x069e, B:520:0x06a7, B:524:0x06aa, B:526:0x06b1, B:528:0x06b9, B:530:0x06bf, B:532:0x0666, B:536:0x06cd, B:446:0x06ff, B:448:0x0708, B:450:0x070c, B:452:0x0711, B:456:0x0738, B:457:0x071a, B:459:0x0720, B:463:0x072e, B:464:0x0735, B:661:0x0ae4, B:664:0x0aef), top: B:4:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:543:0x0b4f  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0b59  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x0b73  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x0b8c  */
    /* JADX WARN: Removed duplicated region for block: B:574:0x0bcc A[ADDED_TO_REGION, LOOP:19: B:574:0x0bcc->B:577:0x0bd4, LOOP_START, PHI: r2
      0x0bcc: PHI (r2v30 com.google.android.gms.internal.ads.zzkn) = (r2v28 com.google.android.gms.internal.ads.zzkn), (r2v31 com.google.android.gms.internal.ads.zzkn) binds: [B:573:0x0bc9, B:577:0x0bd4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:582:0x0be3  */
    /* JADX WARN: Removed duplicated region for block: B:585:0x0bf2  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x0bfc  */
    /* JADX WARN: Removed duplicated region for block: B:597:0x0c3b  */
    /* JADX WARN: Removed duplicated region for block: B:621:0x0b12  */
    /* JADX WARN: Removed duplicated region for block: B:631:0x04eb A[Catch: RuntimeException -> 0x0873, zzhz -> 0x0876, IOException -> 0x0b34, zztp -> 0x0b3b, zzgb -> 0x0b42, zzas -> 0x0b49, zzrm -> 0x0b5f, TRY_ENTER, TryCatch #17 {zzhz -> 0x0876, blocks: (B:159:0x04d7, B:162:0x04ee, B:164:0x04f5, B:166:0x04f9, B:168:0x04fd, B:170:0x0503, B:172:0x0509, B:174:0x050f, B:176:0x0515, B:178:0x051d, B:180:0x0529, B:182:0x0533, B:183:0x0539, B:185:0x053d, B:187:0x0543, B:189:0x054b, B:191:0x0553, B:631:0x04eb), top: B:158:0x04d7 }] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        String str;
        String str2;
        String str3;
        String str4;
        zzhz zzhzVar;
        boolean z;
        int i;
        zzup zzupVar;
        zzkn zzn;
        zzc zzcVar;
        boolean z2;
        long uptimeMillis;
        zzdl zzdlVar;
        long j;
        zzhz zzhzVar2;
        long j2;
        int i2;
        long j3;
        boolean z3;
        boolean z4;
        boolean zzh;
        int i3;
        long j4;
        zzko zzh2;
        long j5;
        zzkn zzn2;
        int i4;
        zzkq zzkqVar;
        boolean z5;
        zzkn zzn3;
        boolean z6;
        zzkn zzm;
        zzkn zzp;
        zzkn zzr;
        char c;
        boolean z7;
        int i5;
        int i6;
        zzkn zzn4;
        zzyn zzr2;
        int i7;
        int i8;
        zzlp[] zzlpVarArr;
        zzkn zzo;
        long j6;
        long j7;
        String str5;
        String str6 = "ExoPlayerImplInternal";
        int i9 = 2;
        try {
            try {
                try {
                    zzcVar = null;
                    try {
                    } catch (zzhz e) {
                        e = e;
                    } catch (RuntimeException e2) {
                        e = e2;
                    }
                } catch (zzhz e3) {
                    e = e3;
                }
            } catch (RuntimeException e4) {
                e = e4;
            }
        } catch (zzas e5) {
            e = e5;
        } catch (zzgb e6) {
            e = e6;
        } catch (zzrm e7) {
            e = e7;
        } catch (zztp e8) {
            e = e8;
        } catch (IOException e9) {
            e = e9;
        }
        switch (message.what) {
            case 1:
                zzE(message.arg1 != 0, message.arg2 >> 4, true, message.arg2 & 15);
                z = true;
                zzC();
                return z;
            case 2:
                try {
                    uptimeMillis = SystemClock.uptimeMillis();
                    zzdlVar = this.zzi;
                    zzdlVar.zzk(2);
                } catch (zzhz e10) {
                    e = e10;
                    str = "Playback error";
                    break;
                }
                if (!this.zzG.zza.zzg() && this.zzt.zzb()) {
                    zzkq zzkqVar2 = this.zzs;
                    zzkqVar2.zzf(this.zzT);
                    try {
                        try {
                        } catch (RuntimeException e11) {
                            e = e11;
                            str4 = str6;
                            zzhz zzc = zzhz.zzc(e, (!(e instanceof IllegalStateException) || (e instanceof IllegalArgumentException)) ? 1004 : 1000);
                            zzds.zzf(str4, str, zzc);
                            zzW(true, false);
                            this.zzG = this.zzG.zzf(zzc);
                            z = true;
                            zzC();
                            return z;
                        }
                    } catch (zzhz e12) {
                        e = e12;
                    }
                    if (zzkqVar2.zzg()) {
                        try {
                            zzh2 = zzkqVar2.zzh(this.zzT, this.zzG);
                        } catch (zzhz e13) {
                            e = e13;
                            str = "Playback error";
                            str3 = "ExoPlayerImplInternal";
                            str2 = str;
                            if (e.zzc == 1 && (zzn = this.zzs.zzn()) != null && e.zzh == null) {
                                e = e.zzd(zzn.zzg.zza);
                            }
                            if (e.zzc == 1 && (zzupVar = e.zzh) != null) {
                                int i10 = e.zze;
                                zzkq zzkqVar3 = this.zzs;
                                if (zzkqVar3.zzo() != null && zzkqVar3.zzo().zzg.zza.equals(zzupVar) && this.zzb[i10].zzq(zzkqVar3.zzo())) {
                                    this.zzab = true;
                                    zzab();
                                    zzkn zzo2 = zzkqVar3.zzo();
                                    zzkn zzm2 = zzkqVar3.zzm();
                                    if (zzkqVar3.zzm() != zzo2) {
                                        while (zzm2 != null && zzm2.zzp() != zzo2) {
                                            zzm2 = zzm2.zzp();
                                        }
                                    }
                                    zzkqVar3.zzs(zzm2);
                                    if (this.zzG.zze != 4) {
                                        zzam();
                                        this.zzi.zzh(2);
                                    }
                                    z = true;
                                    zzC();
                                    return z;
                                }
                            }
                            zzhzVar = this.zzX;
                            if (zzhzVar != null) {
                                zzhzVar.addSuppressed(e);
                                e = this.zzX;
                            }
                            if (e.zzc == 1) {
                                zzkq zzkqVar4 = this.zzs;
                                if (zzkqVar4.zzm() != zzkqVar4.zzn()) {
                                    while (zzkqVar4.zzm() != zzkqVar4.zzn()) {
                                        zzkqVar4.zzr();
                                    }
                                    zzkn zzm3 = zzkqVar4.zzm();
                                    zzm3.getClass();
                                    zzC();
                                    zzko zzkoVar = zzm3.zzg;
                                    zzup zzupVar2 = zzkoVar.zza;
                                    long j8 = zzkoVar.zzb;
                                    this.zzG = zzao(zzupVar2, j8, zzkoVar.zzc, j8, true, 0);
                                }
                            }
                            if (e.zzi || !(this.zzX == null || (i = e.zza) == 5004 || i == 5003)) {
                                zzds.zzf(str3, str2, e);
                                z = true;
                                zzW(true, false);
                                this.zzG = this.zzG.zzf(e);
                                zzC();
                                return z;
                            }
                            zzds.zzd(str3, "Recoverable renderer error", e);
                            if (this.zzX == null) {
                                this.zzX = e;
                            }
                            zzdl zzdlVar2 = this.zzi;
                            zzdlVar2.zzg(zzdlVar2.zzd(25, e));
                            z = true;
                            zzC();
                            return z;
                        }
                        if (zzh2 != null) {
                            zzkn zzi = zzkqVar2.zzi(zzh2);
                            if (zzi.zzd) {
                                str = "Playback error";
                                if (zzi.zze) {
                                    zzdlVar.zzd(8, zzi.zza).zza();
                                }
                            } else {
                                str = "Playback error";
                                zzi.zzt(this, zzh2.zzb);
                            }
                            if (zzkqVar2.zzm() == zzi) {
                                zzU(zzh2.zzb);
                            }
                            zzas(false);
                            if (this.zzN) {
                                zzam();
                            } else {
                                this.zzN = zzaF(zzkqVar2.zzk());
                                zzan();
                            }
                            long j9 = 10000000;
                            if (!this.zzK || !this.zzy || this.zzab || zzaz() || (zzo = zzkqVar2.zzo()) == null || zzo != zzkqVar2.zzn() || zzo.zzp() == null || !zzo.zzp().zze || zzav(zzo.zzp()) > 10000000) {
                                j = uptimeMillis;
                            } else {
                                zzkqVar2.zzq();
                                zzkn zzo3 = zzkqVar2.zzo();
                                if (zzo3 != null) {
                                    zzyn zzr3 = zzo3.zzr();
                                    long j10 = uptimeMillis;
                                    int i11 = 0;
                                    while (true) {
                                        zzlp[] zzlpVarArr2 = this.zzb;
                                        if (i11 >= 2) {
                                            j = j10;
                                            j5 = j9;
                                            str4 = str6;
                                            j2 = C.TIME_UNSET;
                                            if (zzaz()) {
                                                this.zzaa = zzo3.zza.zzh();
                                                if (!zzo3.zzd()) {
                                                    zzkqVar2.zzs(zzo3);
                                                    zzas(false);
                                                    zzam();
                                                }
                                            }
                                            zzn2 = zzkqVar2.zzn();
                                            if (zzn2 != null) {
                                                if (zzn2.zzp() != null) {
                                                    try {
                                                    } catch (zzas e14) {
                                                        e = e14;
                                                        zzA(e, e.zzb != 1 ? true != e.zza ? 3003 : 3001 : 1000);
                                                        z = true;
                                                        zzC();
                                                        return z;
                                                    } catch (zzgb e15) {
                                                        e = e15;
                                                        zzA(e, e.zza);
                                                        z = true;
                                                        zzC();
                                                        return z;
                                                    } catch (zzhz e16) {
                                                        e = e16;
                                                        str2 = str;
                                                        str3 = str4;
                                                        if (e.zzc == 1) {
                                                        }
                                                        if (e.zzc == 1) {
                                                        }
                                                        zzhzVar = this.zzX;
                                                        if (zzhzVar != null) {
                                                        }
                                                        if (e.zzc == 1) {
                                                        }
                                                        if (e.zzi) {
                                                        }
                                                        zzds.zzf(str3, str2, e);
                                                        z = true;
                                                        zzW(true, false);
                                                        this.zzG = this.zzG.zzf(e);
                                                        zzC();
                                                        return z;
                                                    } catch (zzrm e17) {
                                                        e = e17;
                                                        zzA(e, e.zza);
                                                        z = true;
                                                        zzC();
                                                        return z;
                                                    } catch (zztp e18) {
                                                        e = e18;
                                                        zzA(e, 1002);
                                                        z = true;
                                                        zzC();
                                                        return z;
                                                    } catch (IOException e19) {
                                                        e = e19;
                                                        zzA(e, 2000);
                                                        z = true;
                                                        zzC();
                                                        return z;
                                                    } catch (RuntimeException e20) {
                                                        e = e20;
                                                        zzhz zzc2 = zzhz.zzc(e, (!(e instanceof IllegalStateException) || (e instanceof IllegalArgumentException)) ? 1004 : 1000);
                                                        zzds.zzf(str4, str, zzc2);
                                                        zzW(true, false);
                                                        this.zzG = this.zzG.zzf(zzc2);
                                                        z = true;
                                                        zzC();
                                                        return z;
                                                    }
                                                    if (!this.zzK) {
                                                        zzkn zzn5 = zzkqVar2.zzn();
                                                        if (zzn5.zze) {
                                                            int i12 = 0;
                                                            while (true) {
                                                                zzlp[] zzlpVarArr3 = this.zzb;
                                                                if (i12 < 2) {
                                                                    if (zzlpVarArr3[i12].zzr(zzn5)) {
                                                                        i12++;
                                                                    }
                                                                } else if ((!zzaz() || zzkqVar2.zzo() != zzkqVar2.zzn()) && ((zzn2.zzp().zze || this.zzT >= zzn2.zzp().zzc()) && (!zzn2.zzp().zze || zzav(zzn2.zzp()) <= j5))) {
                                                                    zzyn zzr4 = zzn2.zzr();
                                                                    zzkn zzp2 = zzkqVar2.zzp();
                                                                    zzyn zzr5 = zzp2.zzr();
                                                                    zzbe zzbeVar = this.zzG.zza;
                                                                    i4 = 1;
                                                                    zzag(zzbeVar, zzp2.zzg.zza, zzbeVar, zzn2.zzg.zza, C.TIME_UNSET, false);
                                                                    if (zzp2.zze && (((z5 = this.zzy) && this.zzaa != j2) || zzp2.zza.zzh() != j2)) {
                                                                        this.zzaa = j2;
                                                                        if (z5 && !this.zzab) {
                                                                            for (int i13 = 0; i13 < 2; i13++) {
                                                                                if (zzr5.zza(i13)) {
                                                                                    zzlpVarArr3[i13].zze();
                                                                                    zzyf[] zzyfVarArr = zzr5.zzc;
                                                                                    if (!zzar.zzd(zzyfVarArr[i13].zzc().zzo, zzyfVarArr[i13].zzc().zzk) && !zzlpVarArr3[i13].zzc()) {
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        long zzc3 = zzp2.zzc();
                                                                        for (int i14 = 0; i14 < 2; i14++) {
                                                                            zzlpVarArr3[i14].zzj(zzc3);
                                                                        }
                                                                        if (!zzp2.zzd()) {
                                                                            zzkqVar2.zzs(zzp2);
                                                                            zzas(false);
                                                                            zzam();
                                                                        }
                                                                        zzkqVar = zzkqVar2;
                                                                    }
                                                                    for (int i15 = 0; i15 < 2; i15++) {
                                                                        zzlpVarArr3[i15].zzi(zzr4, zzr5, zzp2.zzc());
                                                                    }
                                                                    zzkqVar = zzkqVar2;
                                                                }
                                                            }
                                                            zzn3 = zzkqVar.zzn();
                                                            if (zzn3 != null && zzkqVar.zzm() != zzn3 && !zzn3.zzh) {
                                                                zzn4 = zzkqVar.zzn();
                                                                zzr2 = zzn4.zzr();
                                                                i7 = i4;
                                                                i8 = 0;
                                                                while (true) {
                                                                    zzlpVarArr = this.zzb;
                                                                    if (i8 >= 2) {
                                                                        int zzd = zzlpVarArr[i8].zzd();
                                                                        int zzG = zzlpVarArr[i8].zzG(zzn4, zzr2, this.zzo);
                                                                        this.zzR -= zzd - zzlpVarArr[i8].zzd();
                                                                        i7 &= zzG & 1;
                                                                        i8++;
                                                                    } else if (i7 != 0) {
                                                                        for (int i16 = 0; i16 < 2; i16++) {
                                                                            if (zzr2.zza(i16) && !zzlpVarArr[i16].zzp(zzn4)) {
                                                                                zzar(zzn4, i16, false, zzn4.zzc());
                                                                            }
                                                                        }
                                                                        zzkqVar.zzn().zzh = i4;
                                                                    }
                                                                }
                                                            }
                                                            z6 = false;
                                                            while (zzax() && !this.zzK && (zzm = zzkqVar.zzm()) != null && (zzp = zzm.zzp()) != null && this.zzT >= zzp.zzc() && zzp.zzh) {
                                                                if (z6) {
                                                                    zzC();
                                                                }
                                                                this.zzab = false;
                                                                zzr = zzkqVar.zzr();
                                                                if (zzr != null) {
                                                                    throw null;
                                                                }
                                                                zzkn zzknVar = zzr;
                                                                if (this.zzG.zzb.zza.equals(zzr.zzg.zza.zza)) {
                                                                    zzup zzupVar3 = this.zzG.zzb;
                                                                    c = 65535;
                                                                    if (zzupVar3.zzb == -1) {
                                                                        zzup zzupVar4 = zzr.zzg.zza;
                                                                        if (zzupVar4.zzb == -1 && zzupVar3.zze != zzupVar4.zze) {
                                                                            z7 = true;
                                                                            zzko zzkoVar2 = zzr.zzg;
                                                                            boolean z8 = z7;
                                                                            zzup zzupVar5 = zzkoVar2.zza;
                                                                            long j11 = zzkoVar2.zzb;
                                                                            this.zzG = zzao(zzupVar5, j11, zzkoVar2.zzc, j11, !z8, 0);
                                                                            zzaj();
                                                                            zzL();
                                                                            if (zzaz() && zzr == zzkqVar.zzo()) {
                                                                                zzlp[] zzlpVarArr4 = this.zzb;
                                                                                for (i6 = 0; i6 < 2; i6++) {
                                                                                    zzlpVarArr4[i6].zzB();
                                                                                }
                                                                            }
                                                                            if (this.zzG.zze == 3) {
                                                                                zzJ();
                                                                            }
                                                                            zzyn zzr6 = zzkqVar.zzm().zzr();
                                                                            i5 = 0;
                                                                            while (true) {
                                                                                zzlp[] zzlpVarArr5 = this.zzb;
                                                                                if (i5 >= 2) {
                                                                                    if (zzr6.zza(i5)) {
                                                                                        zzlpVarArr5[i5].zzl();
                                                                                    }
                                                                                    i5++;
                                                                                }
                                                                            }
                                                                            z6 = true;
                                                                        }
                                                                    }
                                                                } else {
                                                                    c = 65535;
                                                                }
                                                                z7 = false;
                                                                zzko zzkoVar22 = zzr.zzg;
                                                                boolean z82 = z7;
                                                                zzup zzupVar52 = zzkoVar22.zza;
                                                                long j112 = zzkoVar22.zzb;
                                                                this.zzG = zzao(zzupVar52, j112, zzkoVar22.zzc, j112, !z82, 0);
                                                                zzaj();
                                                                zzL();
                                                                if (zzaz()) {
                                                                    zzlp[] zzlpVarArr42 = this.zzb;
                                                                    while (i6 < 2) {
                                                                    }
                                                                }
                                                                if (this.zzG.zze == 3) {
                                                                }
                                                                zzyn zzr62 = zzkqVar.zzm().zzr();
                                                                i5 = 0;
                                                                while (true) {
                                                                    zzlp[] zzlpVarArr52 = this.zzb;
                                                                    if (i5 >= 2) {
                                                                        break;
                                                                    }
                                                                    i5++;
                                                                }
                                                                z6 = true;
                                                            }
                                                            zzhzVar2 = null;
                                                            long j12 = this.zzZ.zzb;
                                                            i2 = this.zzG.zze;
                                                            z = true;
                                                            if (i2 != 1) {
                                                                if (i2 != 4) {
                                                                    zzkq zzkqVar5 = this.zzs;
                                                                    zzkn zzm4 = zzkqVar5.zzm();
                                                                    if (zzm4 == null) {
                                                                        zzQ(j);
                                                                    } else {
                                                                        long j13 = j;
                                                                        Trace.beginSection("doSomeWork");
                                                                        zzL();
                                                                        if (zzm4.zze) {
                                                                            this.zzU = zzeo.zzq(SystemClock.elapsedRealtime());
                                                                            boolean z9 = false;
                                                                            zzm4.zza.zzf(this.zzG.zzs - this.zzn, false);
                                                                            int i17 = 0;
                                                                            z3 = true;
                                                                            z4 = true;
                                                                            while (true) {
                                                                                zzlp[] zzlpVarArr6 = this.zzb;
                                                                                if (i17 < i9) {
                                                                                    zzlp zzlpVar = zzlpVarArr6[i17];
                                                                                    if (zzlpVar.zzd() == 0) {
                                                                                        zzN(i17, z9);
                                                                                        j4 = j2;
                                                                                    } else {
                                                                                        j4 = j2;
                                                                                        zzlpVar.zzs(this.zzT, this.zzU);
                                                                                        z3 = z3 && zzlpVar.zzo();
                                                                                        boolean zzt = zzlpVar.zzt(zzm4);
                                                                                        zzN(i17, zzt);
                                                                                        z4 = z4 && zzt;
                                                                                        if (!zzt) {
                                                                                            zzay(i17);
                                                                                        }
                                                                                    }
                                                                                    i17++;
                                                                                    j2 = j4;
                                                                                    z9 = false;
                                                                                    i9 = 2;
                                                                                } else {
                                                                                    j3 = j2;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            j3 = j2;
                                                                            zzm4.zza.zzc();
                                                                            z3 = true;
                                                                            z4 = true;
                                                                        }
                                                                        long j14 = zzm4.zzg.zze;
                                                                        if (z3 && zzm4.zze && (j14 == j3 || j14 <= this.zzG.zzs)) {
                                                                            if (this.zzK) {
                                                                                this.zzK = false;
                                                                                zzE(false, this.zzG.zzn, false, 5);
                                                                            }
                                                                            if (zzm4.zzg.zzj) {
                                                                                zzB(4);
                                                                                zzK();
                                                                                int i18 = 2;
                                                                                if (this.zzG.zze == 2) {
                                                                                    int i19 = 0;
                                                                                    while (true) {
                                                                                        zzlp[] zzlpVarArr7 = this.zzb;
                                                                                        if (i19 < i18) {
                                                                                            if (zzlpVarArr7[i19].zzp(zzm4)) {
                                                                                                zzay(i19);
                                                                                            }
                                                                                            i19++;
                                                                                            i18 = 2;
                                                                                        } else {
                                                                                            zzld zzldVar = this.zzG;
                                                                                            if (!zzldVar.zzg && zzldVar.zzr < 500000 && zzaF(zzkqVar5.zzk()) && zzax()) {
                                                                                                if (this.zzY == j3) {
                                                                                                    this.zzY = SystemClock.elapsedRealtime();
                                                                                                } else if (SystemClock.elapsedRealtime() - this.zzY >= 4000) {
                                                                                                    throw new zzma(0);
                                                                                                }
                                                                                                boolean z10 = !zzax() && this.zzG.zze == 3;
                                                                                                boolean z11 = this.zzG.zzp;
                                                                                                i3 = this.zzG.zze;
                                                                                                if (i3 != 4 && (z10 || i3 == 2 || (i3 == 3 && this.zzR != 0))) {
                                                                                                    zzQ(j13);
                                                                                                }
                                                                                                Trace.endSection();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                this.zzY = j3;
                                                                                if (zzax()) {
                                                                                }
                                                                                boolean z112 = this.zzG.zzp;
                                                                                i3 = this.zzG.zze;
                                                                                if (i3 != 4) {
                                                                                    zzQ(j13);
                                                                                }
                                                                                Trace.endSection();
                                                                            }
                                                                        }
                                                                        zzld zzldVar2 = this.zzG;
                                                                        if (zzldVar2.zze == 2) {
                                                                            if (this.zzR == 0) {
                                                                                zzh = zzae();
                                                                                break;
                                                                            } else if (z4) {
                                                                                if (zzldVar2.zzg) {
                                                                                    zzkn zzm5 = zzkqVar5.zzm();
                                                                                    long zze = zzP(this.zzG.zza, zzm5.zzg.zza) ? this.zzad.zze() : j3;
                                                                                    zzkn zzk = zzkqVar5.zzk();
                                                                                    boolean z12 = zzk.zzd() && zzk.zzg.zzj;
                                                                                    boolean z13 = zzk.zzg.zza.zzb() && !zzk.zze;
                                                                                    if (!z12 && !z13) {
                                                                                        zzh = this.zzg.zzh(new zzki(this.zzv, this.zzG.zza, zzm5.zzg.zza, this.zzT - zzm5.zza(), zzau(zzk.zzf()), this.zzo.zzj().zzb, this.zzG.zzl, this.zzL, zze, this.zzM));
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                zzB(3);
                                                                                this.zzX = zzhzVar2;
                                                                                if (zzax()) {
                                                                                    zzaC(false, false);
                                                                                    this.zzo.zza();
                                                                                    zzJ();
                                                                                }
                                                                                int i182 = 2;
                                                                                if (this.zzG.zze == 2) {
                                                                                }
                                                                                this.zzY = j3;
                                                                                if (zzax()) {
                                                                                }
                                                                                boolean z1122 = this.zzG.zzp;
                                                                                i3 = this.zzG.zze;
                                                                                if (i3 != 4) {
                                                                                }
                                                                                Trace.endSection();
                                                                            }
                                                                        }
                                                                        if (this.zzG.zze == 3) {
                                                                            if (this.zzR == 0) {
                                                                                if (!zzae()) {
                                                                                    zzaC(zzax(), false);
                                                                                    zzB(2);
                                                                                    if (this.zzL) {
                                                                                        for (zzkn zzm6 = zzkqVar5.zzm(); zzm6 != null; zzm6 = zzm6.zzp()) {
                                                                                            for (zzyf zzyfVar : zzm6.zzr().zzc) {
                                                                                            }
                                                                                        }
                                                                                        this.zzad.zzc();
                                                                                    }
                                                                                    zzK();
                                                                                }
                                                                            }
                                                                        }
                                                                        int i1822 = 2;
                                                                        if (this.zzG.zze == 2) {
                                                                        }
                                                                        this.zzY = j3;
                                                                        if (zzax()) {
                                                                        }
                                                                        boolean z11222 = this.zzG.zzp;
                                                                        i3 = this.zzG.zze;
                                                                        if (i3 != 4) {
                                                                        }
                                                                        Trace.endSection();
                                                                    }
                                                                }
                                                                z = true;
                                                            }
                                                            zzC();
                                                            return z;
                                                        }
                                                    }
                                                }
                                                i4 = 1;
                                                zzkqVar = zzkqVar2;
                                                if (zzn2.zzg.zzj || this.zzK) {
                                                    zzlp[] zzlpVarArr8 = this.zzb;
                                                    for (int i20 = 0; i20 < 2; i20++) {
                                                        zzlp zzlpVar2 = zzlpVarArr8[i20];
                                                        if (zzlpVar2.zzp(zzn2) && zzlpVar2.zzg(zzn2)) {
                                                            long j15 = zzn2.zzg.zze;
                                                            zzlpVar2.zzh(zzn2, (j15 == j2 || j15 == Long.MIN_VALUE) ? j2 : j15 + zzn2.zza());
                                                        }
                                                    }
                                                }
                                                zzn3 = zzkqVar.zzn();
                                                if (zzn3 != null) {
                                                    zzn4 = zzkqVar.zzn();
                                                    zzr2 = zzn4.zzr();
                                                    i7 = i4;
                                                    i8 = 0;
                                                    while (true) {
                                                        zzlpVarArr = this.zzb;
                                                        if (i8 >= 2) {
                                                        }
                                                        int zzd2 = zzlpVarArr[i8].zzd();
                                                        int zzG2 = zzlpVarArr[i8].zzG(zzn4, zzr2, this.zzo);
                                                        this.zzR -= zzd2 - zzlpVarArr[i8].zzd();
                                                        i7 &= zzG2 & 1;
                                                        i8++;
                                                    }
                                                }
                                                z6 = false;
                                                while (zzax()) {
                                                    if (z6) {
                                                    }
                                                    this.zzab = false;
                                                    zzr = zzkqVar.zzr();
                                                    if (zzr != null) {
                                                    }
                                                }
                                                zzhzVar2 = null;
                                                long j122 = this.zzZ.zzb;
                                                i2 = this.zzG.zze;
                                                z = true;
                                                if (i2 != 1) {
                                                }
                                                zzC();
                                                return z;
                                            }
                                            i4 = 1;
                                            zzkqVar = zzkqVar2;
                                            zzn3 = zzkqVar.zzn();
                                            if (zzn3 != null) {
                                            }
                                            z6 = false;
                                            while (zzax()) {
                                            }
                                            zzhzVar2 = null;
                                            long j1222 = this.zzZ.zzb;
                                            i2 = this.zzG.zze;
                                            z = true;
                                            if (i2 != 1) {
                                            }
                                            zzC();
                                            return z;
                                        }
                                        if (zzr3.zza(i11) && zzlpVarArr2[i11].zza() && !zzlpVarArr2[i11].zzc()) {
                                            zzlpVarArr2[i11].zzb();
                                            j7 = j9;
                                            str5 = str6;
                                            j6 = j10;
                                            zzar(zzo3, i11, false, zzo3.zzc());
                                        } else {
                                            j6 = j10;
                                            j7 = j9;
                                            str5 = str6;
                                        }
                                        i11++;
                                        str6 = str5;
                                        j9 = j7;
                                        j10 = j6;
                                    }
                                } else {
                                    j = uptimeMillis;
                                }
                            }
                            j5 = 10000000;
                            str4 = "ExoPlayerImplInternal";
                            j2 = C.TIME_UNSET;
                            zzn2 = zzkqVar2.zzn();
                            if (zzn2 != null) {
                            }
                            i4 = 1;
                            zzkqVar = zzkqVar2;
                            zzn3 = zzkqVar.zzn();
                            if (zzn3 != null) {
                            }
                            z6 = false;
                            while (zzax()) {
                            }
                            zzhzVar2 = null;
                            long j12222 = this.zzZ.zzb;
                            i2 = this.zzG.zze;
                            z = true;
                            if (i2 != 1) {
                            }
                            zzC();
                            return z;
                        }
                    }
                    str = "Playback error";
                    if (this.zzN) {
                    }
                    long j92 = 10000000;
                    if (this.zzK) {
                    }
                    j = uptimeMillis;
                    j5 = 10000000;
                    str4 = "ExoPlayerImplInternal";
                    j2 = C.TIME_UNSET;
                    zzn2 = zzkqVar2.zzn();
                    if (zzn2 != null) {
                    }
                    i4 = 1;
                    zzkqVar = zzkqVar2;
                    zzn3 = zzkqVar.zzn();
                    if (zzn3 != null) {
                    }
                    z6 = false;
                    while (zzax()) {
                    }
                    zzhzVar2 = null;
                    long j122222 = this.zzZ.zzb;
                    i2 = this.zzG.zze;
                    z = true;
                    if (i2 != 1) {
                    }
                    zzC();
                    return z;
                }
                j = uptimeMillis;
                zzhzVar2 = null;
                j2 = C.TIME_UNSET;
                i2 = this.zzG.zze;
                z = true;
                if (i2 != 1) {
                }
                zzC();
                return z;
            case 3:
                z2 = true;
                zzR((zzke) message.obj, true);
                z = z2;
                zzC();
                return z;
            case 4:
                z2 = true;
                zzM((zzau) message.obj);
                zzak(this.zzo.zzj(), true);
                z = z2;
                zzC();
                return z;
            case 5:
                z2 = true;
                this.zzA = (zzlt) message.obj;
                z = z2;
                zzC();
                return z;
            case 6:
                z2 = true;
                zzW(false, true);
                z = z2;
                zzC();
                return z;
            case 7:
                zzde zzdeVar = (zzde) message.obj;
                try {
                    zzX(true, false, true, false);
                    int i21 = 0;
                    while (true) {
                        zzlp[] zzlpVarArr9 = this.zzb;
                        if (i21 >= 2) {
                            this.zzg.zzd(this.zzv);
                            this.zzz.zzd();
                            this.zze.zzb();
                            zzB(1);
                            return true;
                        }
                        this.zzc[i21].zzw();
                        zzlpVarArr9[i21].zzH();
                        i21++;
                    }
                } finally {
                    this.zzi.zzl(null);
                    this.zzj.zzb();
                    zzdeVar.zza();
                }
            case 8:
                try {
                    zzun zzunVar = (zzun) message.obj;
                    zzkq zzkqVar6 = this.zzs;
                    if (zzkqVar6.zzd(zzunVar)) {
                        zzkn zzk2 = zzkqVar6.zzk();
                        if (zzk2 == null) {
                            throw null;
                        }
                        zzkn zzknVar2 = zzk2;
                        if (!zzk2.zze) {
                            float f = this.zzo.zzj().zzb;
                            zzld zzldVar3 = this.zzG;
                            zzk2.zzh(f, zzldVar3.zza, zzldVar3.zzl);
                        }
                        zzaw(zzk2.zzg.zza, zzk2.zzq(), zzk2.zzr());
                        if (zzk2 == zzkqVar6.zzm()) {
                            zzU(zzk2.zzg.zzb);
                            zzap();
                            zzk2.zzh = true;
                            zzld zzldVar4 = this.zzG;
                            try {
                                zzup zzupVar6 = zzldVar4.zzb;
                                long j16 = zzk2.zzg.zzb;
                                z2 = true;
                                this.zzG = zzao(zzupVar6, j16, zzldVar4.zzc, j16, false, 5);
                            } catch (zzas e21) {
                                e = e21;
                                zzA(e, e.zzb != 1 ? true != e.zza ? 3003 : 3001 : 1000);
                                z = true;
                                zzC();
                                return z;
                            } catch (zzgb e22) {
                                e = e22;
                                zzA(e, e.zza);
                                z = true;
                                zzC();
                                return z;
                            } catch (zzhz e23) {
                                e = e23;
                                str2 = "Playback error";
                                str3 = "ExoPlayerImplInternal";
                                if (e.zzc == 1) {
                                }
                                if (e.zzc == 1) {
                                }
                                zzhzVar = this.zzX;
                                if (zzhzVar != null) {
                                }
                                if (e.zzc == 1) {
                                }
                                if (e.zzi) {
                                }
                                zzds.zzf(str3, str2, e);
                                z = true;
                                zzW(true, false);
                                this.zzG = this.zzG.zzf(e);
                                zzC();
                                return z;
                            } catch (zzrm e24) {
                                e = e24;
                                zzA(e, e.zza);
                                z = true;
                                zzC();
                                return z;
                            } catch (zztp e25) {
                                e = e25;
                                zzA(e, 1002);
                                z = true;
                                zzC();
                                return z;
                            } catch (IOException e26) {
                                e = e26;
                                zzA(e, 2000);
                                z = true;
                                zzC();
                                return z;
                            } catch (RuntimeException e27) {
                                e = e27;
                                str = "Playback error";
                                str4 = str6;
                                zzhz zzc22 = zzhz.zzc(e, (!(e instanceof IllegalStateException) || (e instanceof IllegalArgumentException)) ? 1004 : 1000);
                                zzds.zzf(str4, str, zzc22);
                                zzW(true, false);
                                this.zzG = this.zzG.zzf(zzc22);
                                z = true;
                                zzC();
                                return z;
                            }
                        } else {
                            z2 = true;
                        }
                        zzam();
                    } else {
                        z2 = true;
                        zzkn zzu = zzkqVar6.zzu(zzunVar);
                        if (zzu != null) {
                            zzghc.zzh(!zzu.zze);
                            float f2 = this.zzo.zzj().zzb;
                            zzld zzldVar5 = this.zzG;
                            zzu.zzh(f2, zzldVar5.zza, zzldVar5.zzl);
                            if (zzkqVar6.zze(zzunVar)) {
                                zzai();
                            }
                        }
                    }
                    z = z2;
                } catch (zzas e28) {
                    e = e28;
                } catch (zzgb e29) {
                    e = e29;
                } catch (zzhz e30) {
                    e = e30;
                } catch (zzrm e31) {
                    e = e31;
                } catch (zztp e32) {
                    e = e32;
                } catch (IOException e33) {
                    e = e33;
                } catch (RuntimeException e34) {
                    e = e34;
                }
                zzC();
                return z;
            case 9:
                zzun zzunVar2 = (zzun) message.obj;
                zzkq zzkqVar7 = this.zzs;
                if (zzkqVar7.zzd(zzunVar2)) {
                    zzkqVar7.zzf(this.zzT);
                    zzam();
                } else if (zzkqVar7.zze(zzunVar2)) {
                    zzai();
                }
                z = true;
                zzC();
                return z;
            case 10:
                zzad();
                z = true;
                zzC();
                return z;
            case 11:
                int i22 = message.arg1;
                this.zzO = i22;
                int zza2 = this.zzs.zza(this.zzG.zza, i22);
                if ((zza2 & 1) != 0) {
                    zzI(true);
                } else if ((zza2 & 2) != 0) {
                    zzab();
                }
                zzas(false);
                z = true;
                zzC();
                return z;
            case 12:
                boolean z14 = message.arg1 != 0;
                this.zzP = z14;
                int zzb = this.zzs.zzb(this.zzG.zza, z14);
                if ((zzb & 1) != 0) {
                    zzI(true);
                } else if ((zzb & 2) != 0) {
                    zzab();
                }
                zzas(false);
                z = true;
                zzC();
                return z;
            case 13:
                boolean z15 = message.arg1 != 0;
                zzde zzdeVar2 = (zzde) message.obj;
                if (this.zzQ != z15) {
                    this.zzQ = z15;
                    if (!z15) {
                        zzlp[] zzlpVarArr10 = this.zzb;
                        for (int i23 = 0; i23 < 2; i23++) {
                            zzlpVarArr10[i23].zzF();
                        }
                    }
                }
                if (zzdeVar2 != null) {
                    zzdeVar2.zza();
                }
                z = true;
                zzC();
                return z;
            case 14:
                zzlh zzlhVar = (zzlh) message.obj;
                if (zzlhVar.zzf() == this.zzk) {
                    zzaE(zzlhVar);
                    int i24 = this.zzG.zze;
                    if (i24 == 3 || i24 == 2) {
                        this.zzi.zzh(2);
                    }
                } else {
                    this.zzi.zzd(15, zzlhVar).zza();
                }
                z = true;
                zzC();
                return z;
            case 15:
                final zzlh zzlhVar2 = (zzlh) message.obj;
                Looper zzf = zzlhVar2.zzf();
                if (zzf.getThread().isAlive()) {
                    this.zzq.zzd(zzf, null).zzm(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzjx
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzkf.zzz(zzlhVar2);
                        }
                    });
                } else {
                    zzds.zzc("TAG", "Trying to send message on a dead thread.");
                    zzlhVar2.zzi(false);
                }
                z = true;
                zzC();
                return z;
            case 16:
                zzak((zzau) message.obj, false);
                z = true;
                zzC();
                return z;
            case 17:
                zzjz zzjzVar = (zzjz) message.obj;
                this.zzH.zza(1);
                if (zzjzVar.zzb() != -1) {
                    this.zzS = new zzke(new zzlj(zzjzVar.zza(), zzjzVar.zzd()), zzjzVar.zzb(), zzjzVar.zzc());
                }
                zzaf(this.zzt.zzk(zzjzVar.zza(), zzjzVar.zzd()), false);
                z = true;
                zzC();
                return z;
            case 18:
                zzjz zzjzVar2 = (zzjz) message.obj;
                int i25 = message.arg1;
                this.zzH.zza(1);
                zzlc zzlcVar = this.zzt;
                if (i25 == -1) {
                    i25 = zzlcVar.zzc();
                }
                zzaf(zzlcVar.zzl(i25, zzjzVar2.zza(), zzjzVar2.zzd()), false);
                z = true;
                zzC();
                return z;
            case 19:
                zzka zzkaVar = (zzka) message.obj;
                this.zzH.zza(1);
                zzlc zzlcVar2 = this.zzt;
                int i26 = zzkaVar.zza;
                int i27 = zzkaVar.zzb;
                int i28 = zzkaVar.zzc;
                zzwi zzwiVar = zzkaVar.zzd;
                zzaf(zzlcVar2.zzn(0, 0, 0, null), false);
                z = true;
                zzC();
                return z;
            case 20:
                int i29 = message.arg1;
                int i30 = message.arg2;
                zzwi zzwiVar2 = (zzwi) message.obj;
                this.zzH.zza(1);
                zzaf(this.zzt.zzm(i29, i30, zzwiVar2), false);
                z = true;
                zzC();
                return z;
            case 21:
                zzwi zzwiVar3 = (zzwi) message.obj;
                this.zzH.zza(1);
                zzaf(this.zzt.zzo(zzwiVar3), false);
                z = true;
                zzC();
                return z;
            case 22:
                zzaf(this.zzt.zzg(), true);
                z = true;
                zzC();
                return z;
            case 23:
                this.zzJ = message.arg1 != 0;
                zzaj();
                if (this.zzK) {
                    zzkq zzkqVar8 = this.zzs;
                    if (zzkqVar8.zzn() != zzkqVar8.zzm()) {
                        zzI(true);
                        zzas(false);
                    }
                }
                z = true;
                zzC();
                return z;
            case 24:
            default:
                return false;
            case 25:
                zzac();
                z = true;
                zzC();
                return z;
            case 26:
                zzac();
                z = true;
                zzC();
                return z;
            case 27:
                int i31 = message.arg1;
                int i32 = message.arg2;
                List list = (List) message.obj;
                this.zzH.zza(1);
                zzaf(this.zzt.zza(i31, i32, list), false);
                z = true;
                zzC();
                return z;
            case 28:
                zzij zzijVar = (zzij) message.obj;
                this.zzZ = zzijVar;
                this.zzs.zzc(this.zzG.zza, zzijVar);
                z = true;
                zzC();
                return z;
            case 29:
                this.zzH.zza(1);
                zzX(false, false, false, true);
                this.zzg.zza(this.zzv);
                zzB(true != this.zzG.zza.zzg() ? 2 : 4);
                zzF();
                this.zzt.zzd(this.zzh.zze());
                this.zzi.zzh(2);
                z = true;
                zzC();
                return z;
            case 30:
                Pair pair = (Pair) message.obj;
                Object obj = pair.first;
                zzde zzdeVar3 = (zzde) pair.second;
                zzlp[] zzlpVarArr11 = this.zzb;
                for (int i33 = 0; i33 < 2; i33++) {
                    zzlpVarArr11[i33].zzI(obj);
                }
                int i34 = this.zzG.zze;
                if (i34 == 3 || i34 == 2) {
                    this.zzi.zzh(2);
                }
                if (zzdeVar3 != null) {
                    zzdeVar3.zza();
                }
                z = true;
                zzC();
                return z;
            case 31:
                zzc zzcVar2 = (zzc) message.obj;
                int i35 = message.arg1;
                this.zze.zze(zzcVar2);
                zzhp zzhpVar = this.zzz;
                if (i35 != 0) {
                    zzcVar = zzcVar2;
                }
                zzhpVar.zzb(zzcVar);
                zzF();
                z = true;
                zzC();
                return z;
            case 32:
                zzD(((Float) message.obj).floatValue());
                z = true;
                zzC();
                return z;
            case 33:
                int i36 = message.arg1;
                zzld zzldVar6 = this.zzG;
                zzH(zzldVar6.zzl, i36, zzldVar6.zzn, zzldVar6.zzm);
                z = true;
                zzC();
                return z;
            case 34:
                zzD(this.zzac);
                z = true;
                zzC();
                return z;
            case 35:
                zzaar zzaarVar = (zzaar) message.obj;
                zzlp[] zzlpVarArr12 = this.zzb;
                for (int i37 = 0; i37 < 2; i37++) {
                    zzlpVarArr12[i37].zzJ(zzaarVar);
                }
                z = true;
                zzC();
                return z;
            case 36:
                boolean booleanValue = ((Boolean) message.obj).booleanValue();
                if (!booleanValue) {
                    final int i38 = this.zzF;
                    if (i38 > 0) {
                        this.zzx.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzjw
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzkf.this.zzv(i38);
                            }
                        });
                    }
                    this.zzF = 0;
                    this.zzD = false;
                    this.zzi.zzk(37);
                    zzke zzkeVar = this.zzE;
                    if (zzkeVar != null) {
                        zzR(zzkeVar, false);
                        this.zzE = null;
                    }
                }
                this.zzC = booleanValue;
                zzV();
                z = true;
                zzC();
                return z;
            case 37:
                this.zzD = false;
                zzke zzkeVar2 = this.zzE;
                if (zzkeVar2 != null) {
                    zzR(zzkeVar2, false);
                    this.zzE = null;
                }
                z = true;
                zzC();
                return z;
            case 38:
                this.zzB = (zzls) message.obj;
                zzV();
                z = true;
                zzC();
                return z;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzho
    public final void zza(float f) {
        this.zzi.zzh(34);
    }

    @Override // com.google.android.gms.internal.ads.zzho
    public final void zzb(int i) {
        this.zzi.zze(33, i, 0).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public final void zzc(zzau zzauVar) {
        this.zzi.zzd(16, zzauVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final void zzcS(long j, long j2, zzu zzuVar, MediaFormat mediaFormat) {
        if (this.zzD) {
            this.zzi.zzc(37).zza();
        }
    }

    public final void zzd() {
        this.zzi.zzc(29).zza();
    }

    public final void zze(boolean z, int i, int i2) {
        this.zzi.zze(1, z ? 1 : 0, (i2 << 4) | 1).zza();
    }

    public final void zzf(zzbe zzbeVar, int i, long j) {
        this.zzi.zzd(3, new zzke(zzbeVar, i, j)).zza();
    }

    public final void zzg(zzls zzlsVar) {
        this.zzi.zzd(38, zzlsVar).zza();
    }

    public final void zzh() {
        this.zzi.zzc(6).zza();
    }

    public final void zzi(zzc zzcVar, boolean z) {
        this.zzi.zzf(31, 0, 0, zzcVar).zza();
    }

    public final void zzj(float f) {
        this.zzi.zzd(32, Float.valueOf(f)).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzlf
    public final void zzk(zzlh zzlhVar) {
        if (!this.zzI && this.zzk.getThread().isAlive()) {
            this.zzi.zzd(14, zzlhVar).zza();
        } else {
            zzds.zzc("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            zzlhVar.zzi(false);
        }
    }

    public final boolean zzl(Object obj, long j) {
        if (this.zzI || !this.zzk.getThread().isAlive()) {
            return true;
        }
        zzde zzdeVar = new zzde(this.zzq);
        this.zzi.zzd(30, new Pair(obj, zzdeVar)).zza();
        if (j != C.TIME_UNSET) {
            return zzdeVar.zze(j);
        }
        return true;
    }

    public final boolean zzm() {
        if (this.zzI || !this.zzk.getThread().isAlive()) {
            return true;
        }
        this.zzI = true;
        zzde zzdeVar = new zzde(this.zzq);
        this.zzi.zzd(7, zzdeVar).zza();
        return zzdeVar.zze(this.zzu);
    }

    public final Looper zzn() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzo() {
        zzdl zzdlVar = this.zzi;
        zzdlVar.zzk(2);
        zzdlVar.zzh(22);
    }

    @Override // com.google.android.gms.internal.ads.zzum
    public final void zzp(zzun zzunVar) {
        this.zzi.zzd(8, zzunVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzyl
    public final void zzq() {
        this.zzi.zzh(10);
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final /* bridge */ /* synthetic */ void zzs(zzwh zzwhVar) {
        this.zzi.zzd(9, (zzun) zzwhVar).zza();
    }

    final /* synthetic */ zzkn zzt(zzko zzkoVar, long j) {
        zzyv zzk = this.zzg.zzk();
        long j2 = this.zzZ.zzb;
        zzyn zzynVar = this.zzf;
        zzlc zzlcVar = this.zzt;
        return new zzkn(this.zzc, j, this.zze, zzk, zzlcVar, zzkoVar, zzynVar, C.TIME_UNSET);
    }

    final /* synthetic */ void zzu(int i, boolean z) {
        this.zzw.zzB(i, this.zzb[i].zze(), z);
    }

    final /* synthetic */ void zzv(int i) {
        this.zzw.zzW(i);
    }

    final /* synthetic */ zzdl zzx() {
        return this.zzi;
    }

    public final void zzy(List list, int i, long j, zzwi zzwiVar) {
        this.zzi.zzd(17, new zzjz(list, zzwiVar, i, j, null)).zza();
    }
}
