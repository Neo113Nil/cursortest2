package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import androidx.core.view.PointerIconCompat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzjd implements Handler.Callback, zzsf, zzvy, zzjs, zzgx, zzjv {
    private boolean zzA;
    private boolean zzD;
    private boolean zzE;
    private boolean zzF;
    private int zzG;
    private zzjc zzH;
    private long zzI;
    private int zzJ;
    private boolean zzK;
    private zzha zzL;
    private final zzhw zzN;
    private final zzgv zzO;
    private final zzka[] zza;
    private final Set zzb;
    private final zzkb[] zzc;
    private final zzvz zzd;
    private final zzwa zze;
    private final zzjh zzf;
    private final zzwh zzg;
    private final zzdn zzh;
    private final HandlerThread zzi;
    private final Looper zzj;
    private final zzcm zzk;
    private final zzck zzl;
    private final long zzm;
    private final zzgy zzn;
    private final ArrayList zzo;
    private final zzde zzp;
    private final zzjm zzq;
    private final zzjt zzr;
    private final long zzs;
    private zzkd zzt;
    private zzju zzu;
    private zzjb zzv;
    private boolean zzw;
    private boolean zzy;
    private boolean zzz;
    private int zzB = 0;
    private boolean zzC = false;
    private boolean zzx = false;
    private long zzM = -9223372036854775807L;

    public zzjd(zzka[] zzkaVarArr, zzvz zzvzVar, zzwa zzwaVar, zzjh zzjhVar, zzwh zzwhVar, int i, boolean z, zzko zzkoVar, zzkd zzkdVar, zzgv zzgvVar, long j, boolean z2, Looper looper, zzde zzdeVar, zzhw zzhwVar, zznb zznbVar, byte[] bArr) {
        this.zzN = zzhwVar;
        this.zza = zzkaVarArr;
        this.zzd = zzvzVar;
        this.zze = zzwaVar;
        this.zzf = zzjhVar;
        this.zzg = zzwhVar;
        int i2 = 0;
        this.zzt = zzkdVar;
        this.zzO = zzgvVar;
        this.zzs = j;
        this.zzp = zzdeVar;
        this.zzm = zzjhVar.zza();
        zzjhVar.zzf();
        this.zzu = zzju.zzg(zzwaVar);
        this.zzv = new zzjb(this.zzu);
        int length = zzkaVarArr.length;
        this.zzc = new zzkb[2];
        while (true) {
            int length2 = zzkaVarArr.length;
            if (i2 >= 2) {
                this.zzn = new zzgy(this, zzdeVar);
                this.zzo = new ArrayList();
                this.zzb = Collections.newSetFromMap(new IdentityHashMap());
                this.zzk = new zzcm();
                this.zzl = new zzck();
                zzvzVar.zzq(this, zzwhVar);
                this.zzK = true;
                Handler handler = new Handler(looper);
                this.zzq = new zzjm(zzkoVar, handler);
                this.zzr = new zzjt(this, zzkoVar, handler, zznbVar);
                HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                this.zzi = handlerThread;
                handlerThread.start();
                Looper looper2 = handlerThread.getLooper();
                this.zzj = looper2;
                this.zzh = zzdeVar.zzb(looper2, this);
                return;
            }
            zzkaVarArr[i2].zzq(i2, zznbVar);
            this.zzc[i2] = zzkaVarArr[i2].zzj();
            i2++;
        }
    }

    private final void zzA(zzka zzkaVar) throws zzha {
        if (zzac(zzkaVar)) {
            this.zzn.zzd(zzkaVar);
            zzaj(zzkaVar);
            zzkaVar.zzn();
            this.zzG--;
        }
    }

    private final void zzB() throws zzha {
        int length = this.zza.length;
        zzC(new boolean[2]);
    }

    private final void zzC(boolean[] zArr) throws zzha {
        zzjj zze = this.zzq.zze();
        zzwa zzi = zze.zzi();
        int i = 0;
        while (true) {
            int length = this.zza.length;
            if (i >= 2) {
                break;
            }
            if (!zzi.zzb(i) && this.zzb.remove(this.zza[i])) {
                this.zza[i].zzA();
            }
            i++;
        }
        int i2 = 0;
        while (true) {
            int length2 = this.zza.length;
            if (i2 >= 2) {
                zze.zzg = true;
                return;
            }
            if (zzi.zzb(i2)) {
                boolean z = zArr[i2];
                zzka zzkaVar = this.zza[i2];
                if (!zzac(zzkaVar)) {
                    zzjj zze2 = this.zzq.zze();
                    boolean z2 = zze2 == this.zzq.zzd();
                    zzwa zzi2 = zze2.zzi();
                    zzkc zzkcVar = zzi2.zzb[i2];
                    zzaf[] zzah = zzah(zzi2.zzc[i2]);
                    boolean z3 = zzaf() && this.zzu.zze == 3;
                    boolean z4 = !z && z3;
                    this.zzG++;
                    this.zzb.add(zzkaVar);
                    zzkaVar.zzo(zzkcVar, zzah, zze2.zzc[i2], this.zzI, z4, z2, zze2.zzf(), zze2.zze());
                    zzkaVar.zzp(11, new zziw(this));
                    this.zzn.zze(zzkaVar);
                    if (z3) {
                        zzkaVar.zzE();
                    }
                }
            }
            i2++;
        }
    }

    private final void zzD(IOException iOException, int i) {
        zzha zzc = zzha.zzc(iOException, i);
        zzjj zzd = this.zzq.zzd();
        if (zzd != null) {
            zzc = zzc.zza(zzd.zzf.zza);
        }
        zzdw.zzc("ExoPlayerImplInternal", "Playback error", zzc);
        zzU(false, false);
        this.zzu = this.zzu.zzd(zzc);
    }

    private final void zzE(boolean z) {
        zzjj zzc = this.zzq.zzc();
        zzsi zzsiVar = zzc == null ? this.zzu.zzb : zzc.zzf.zza;
        boolean z2 = !this.zzu.zzk.equals(zzsiVar);
        if (z2) {
            this.zzu = this.zzu.zza(zzsiVar);
        }
        zzju zzjuVar = this.zzu;
        zzjuVar.zzp = zzc == null ? zzjuVar.zzr : zzc.zzc();
        this.zzu.zzq = zzt();
        if ((z2 || z) && zzc != null && zzc.zzd) {
            zzX(zzc.zzh(), zzc.zzi());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x037a, code lost:
    
        if (r1.zzn(r2, r15.zzl).zzg != false) goto L204;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x036a A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.google.android.gms.internal.ads.zzck] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [com.google.android.gms.internal.ads.zzjc] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r15v12, types: [com.google.android.gms.internal.ads.zzjd] */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.google.android.gms.internal.ads.zzcn] */
    /* JADX WARN: Type inference failed for: r29v0, types: [com.google.android.gms.internal.ads.zzcn] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzF(zzcn zzcnVar, boolean z) throws zzha {
        zzsi zzsiVar;
        zzjm zzjmVar;
        int i;
        int i2;
        Object obj;
        long j;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        boolean z5;
        long j2;
        zzsi zzh;
        boolean z6;
        ?? r13;
        zzsi zzsiVar2;
        boolean z7;
        boolean z8;
        long j3;
        boolean z9;
        ?? r15;
        int i5;
        int i6;
        int i7;
        boolean z10;
        boolean z11;
        boolean z12;
        ?? r9;
        boolean z13;
        long j4;
        boolean z14;
        boolean z15;
        zzjc zzjcVar;
        boolean z16;
        long j5;
        zzju zzjuVar = this.zzu;
        zzjc zzjcVar2 = this.zzH;
        zzjm zzjmVar2 = this.zzq;
        int i8 = this.zzB;
        boolean z17 = this.zzC;
        zzcm zzcmVar = this.zzk;
        ?? r14 = this.zzl;
        boolean z18 = true;
        if (zzcnVar.zzo()) {
            zzsiVar2 = zzju.zzh();
            z9 = true;
            r15 = this;
            r13 = -9223372036854775807;
            z7 = false;
            z8 = false;
            r9 = -1;
            j3 = 0;
        } else {
            zzsi zzsiVar3 = zzjuVar.zzb;
            Object obj2 = zzsiVar3.zza;
            boolean zzae = zzae(zzjuVar, r14);
            long j6 = (zzjuVar.zzb.zzb() || zzae) ? zzjuVar.zzc : zzjuVar.zzr;
            if (zzjcVar2 != null) {
                zzsiVar = zzsiVar3;
                zzjmVar = zzjmVar2;
                i6 = -1;
                Pair zzy = zzy(zzcnVar, zzjcVar2, true, i8, z17, zzcmVar, r14);
                if (zzy == null) {
                    i7 = zzcnVar.zzg(z17);
                    j = j6;
                    z5 = true;
                    z11 = false;
                    z12 = false;
                } else {
                    if (zzjcVar2.zzc == -9223372036854775807L) {
                        i7 = zzcnVar.zzn(zzy.first, r14).zzd;
                        j = j6;
                        z10 = false;
                    } else {
                        obj2 = zzy.first;
                        j = ((Long) zzy.second).longValue();
                        i7 = -1;
                        z10 = true;
                    }
                    z11 = zzjuVar.zze == 4;
                    z12 = z10;
                    z5 = false;
                }
                z2 = z11;
                i2 = i7;
                z4 = z12;
            } else {
                zzsiVar = zzsiVar3;
                zzjmVar = zzjmVar2;
                i = -1;
                i = -1;
                i6 = -1;
                if (zzjuVar.zza.zzo()) {
                    i3 = zzcnVar.zzg(z17);
                } else if (zzcnVar.zza(obj2) == -1) {
                    Object zze = zze(zzcmVar, r14, i8, z17, obj2, zzjuVar.zza, zzcnVar);
                    if (zze == null) {
                        i4 = zzcnVar.zzg(z17);
                        z5 = true;
                    } else {
                        i4 = zzcnVar.zzn(zze, r14).zzd;
                        z5 = false;
                    }
                    i2 = i4;
                    j = j6;
                    z2 = false;
                    z4 = false;
                } else if (j6 == -9223372036854775807L) {
                    i3 = zzcnVar.zzn(obj2, r14).zzd;
                } else if (zzae) {
                    zzjuVar.zza.zzn(zzsiVar.zza, r14);
                    if (zzjuVar.zza.zze(r14.zzd, zzcmVar, 0L).zzo == zzjuVar.zza.zza(zzsiVar.zza)) {
                        Pair zzl = zzcnVar.zzl(zzcmVar, r14, zzcnVar.zzn(obj2, r14).zzd, j6);
                        obj2 = zzl.first;
                        j = ((Long) zzl.second).longValue();
                    } else {
                        j = j6;
                    }
                    i2 = -1;
                    obj = obj2;
                    z2 = false;
                    z3 = false;
                    z4 = true;
                    if (i2 == i) {
                        Pair zzl2 = zzcnVar.zzl(zzcmVar, r14, i2, -9223372036854775807L);
                        obj = zzl2.first;
                        j2 = ((Long) zzl2.second).longValue();
                        j = -9223372036854775807L;
                    } else {
                        j2 = j;
                    }
                    zzh = zzjmVar.zzh(zzcnVar, obj, j2);
                    int i9 = zzh.zze;
                    z6 = (zzsiVar.zza.equals(obj) || zzsiVar.zzb() || zzh.zzb() || !(i9 != i || ((i5 = zzsiVar.zze) != i && i9 >= i5))) ? false : true;
                    zzck zzn = zzcnVar.zzn(obj, r14);
                    if (!zzae && j6 == j && zzsiVar.zza.equals(zzh.zza)) {
                        if (zzsiVar.zzb()) {
                            zzn.zzl(zzsiVar.zzb);
                        }
                        if (zzh.zzb()) {
                            zzn.zzl(zzh.zzb);
                        }
                    }
                    if (true == z6) {
                        zzh = zzsiVar;
                    }
                    if (zzh.zzb()) {
                        if (zzh.equals(zzsiVar)) {
                            j2 = zzjuVar.zzr;
                        } else {
                            zzcnVar.zzn(zzh.zza, r14);
                            if (zzh.zzc == r14.zze(zzh.zzb)) {
                                r14.zzi();
                            }
                            j2 = 0;
                        }
                    }
                    r13 = j;
                    zzsiVar2 = zzh;
                    z7 = z2;
                    z8 = z4;
                    j3 = j2;
                    z9 = true;
                    z18 = z3;
                    r15 = this;
                    r9 = i;
                } else {
                    i2 = -1;
                    obj = obj2;
                    j = j6;
                    z2 = false;
                    z3 = false;
                    z4 = false;
                    if (i2 == i) {
                    }
                    zzh = zzjmVar.zzh(zzcnVar, obj, j2);
                    int i92 = zzh.zze;
                    if (zzsiVar.zza.equals(obj)) {
                    }
                    zzck zzn2 = zzcnVar.zzn(obj, r14);
                    if (!zzae) {
                        if (zzsiVar.zzb()) {
                        }
                        if (zzh.zzb()) {
                        }
                    }
                    if (true == z6) {
                    }
                    if (zzh.zzb()) {
                    }
                    r13 = j;
                    zzsiVar2 = zzh;
                    z7 = z2;
                    z8 = z4;
                    j3 = j2;
                    z9 = true;
                    z18 = z3;
                    r15 = this;
                    r9 = i;
                }
                i2 = i3;
                obj = obj2;
                j = j6;
                z2 = false;
                z3 = false;
                z4 = false;
                if (i2 == i) {
                }
                zzh = zzjmVar.zzh(zzcnVar, obj, j2);
                int i922 = zzh.zze;
                if (zzsiVar.zza.equals(obj)) {
                }
                zzck zzn22 = zzcnVar.zzn(obj, r14);
                if (!zzae) {
                }
                if (true == z6) {
                }
                if (zzh.zzb()) {
                }
                r13 = j;
                zzsiVar2 = zzh;
                z7 = z2;
                z8 = z4;
                j3 = j2;
                z9 = true;
                z18 = z3;
                r15 = this;
                r9 = i;
            }
            Object obj3 = obj2;
            z3 = z5;
            obj = obj3;
            i = i6;
            if (i2 == i) {
            }
            zzh = zzjmVar.zzh(zzcnVar, obj, j2);
            int i9222 = zzh.zze;
            if (zzsiVar.zza.equals(obj)) {
            }
            zzck zzn222 = zzcnVar.zzn(obj, r14);
            if (!zzae) {
            }
            if (true == z6) {
            }
            if (zzh.zzb()) {
            }
            r13 = j;
            zzsiVar2 = zzh;
            z7 = z2;
            z8 = z4;
            j3 = j2;
            z9 = true;
            z18 = z3;
            r15 = this;
            r9 = i;
        }
        boolean z19 = (r15.zzu.zzb.equals(zzsiVar2) && j3 == r15.zzu.zzr) ? false : z9;
        if (z18) {
            try {
                if (r15.zzu.zze != z9) {
                    r15.zzS(4);
                }
                z13 = false;
            } catch (Throwable th) {
                th = th;
                r9 = z9;
                j4 = r13;
                r13 = 0;
                r14 = 0;
                zzju zzjuVar2 = r15.zzu;
                zzZ(zzcnVar, zzsiVar2, zzjuVar2.zza, zzjuVar2.zzb, r9 == z8 ? -9223372036854775807L : j3);
                if (!z19) {
                }
                zzju zzjuVar3 = r15.zzu;
                Object obj4 = zzjuVar3.zzb.zza;
                zzcn zzcnVar2 = zzjuVar3.zza;
                if (z19) {
                    z14 = r9;
                }
                z14 = r13;
                r15.zzu = zzz(zzsiVar2, j3, j4, r15.zzu.zzd, z14, zzcnVar.zza(obj4) != -1 ? 4 : 3);
                zzL();
                r15.zzN(zzcnVar, r15.zzu.zza);
                r15.zzu = r15.zzu.zzf(zzcnVar);
                if (!zzcnVar.zzo()) {
                }
                r15.zzE(r13);
                throw th;
            }
            try {
                r15.zzK(false, false, false, z9);
            } catch (Throwable th2) {
                th = th2;
                r9 = z9;
                j4 = r13;
                r14 = 0;
                r13 = z13;
                zzju zzjuVar22 = r15.zzu;
                zzZ(zzcnVar, zzsiVar2, zzjuVar22.zza, zzjuVar22.zzb, r9 == z8 ? -9223372036854775807L : j3);
                if (!z19) {
                }
                zzju zzjuVar32 = r15.zzu;
                Object obj42 = zzjuVar32.zzb.zza;
                zzcn zzcnVar22 = zzjuVar32.zza;
                if (z19) {
                }
                z14 = r13;
                r15.zzu = zzz(zzsiVar2, j3, j4, r15.zzu.zzd, z14, zzcnVar.zza(obj42) != -1 ? 4 : 3);
                zzL();
                r15.zzN(zzcnVar, r15.zzu.zza);
                r15.zzu = r15.zzu.zzf(zzcnVar);
                if (!zzcnVar.zzo()) {
                }
                r15.zzE(r13);
                throw th;
            }
        } else {
            z13 = false;
        }
        try {
            if (z19) {
                z15 = z9;
                j4 = r13;
                zzjcVar = null;
                z16 = z13;
                if (!zzcnVar.zzo()) {
                    for (zzjj zzd = r15.zzq.zzd(); zzd != null; zzd = zzd.zzg()) {
                        if (zzd.zzf.zza.equals(zzsiVar2)) {
                            zzd.zzf = r15.zzq.zzg(zzcnVar, zzd.zzf);
                            zzd.zzq();
                        }
                    }
                    j3 = r15.zzv(zzsiVar2, j3, z7);
                }
            } else {
                zzjm zzjmVar3 = r15.zzq;
                long j7 = r15.zzI;
                zzjj zze2 = zzjmVar3.zze();
                if (zze2 == null) {
                    j4 = r13;
                    j5 = 0;
                } else {
                    long zze3 = zze2.zze();
                    if (zze2.zzd) {
                        j5 = zze3;
                        int i10 = 0;
                        long j8 = r13;
                        while (true) {
                            try {
                                zzka[] zzkaVarArr = r15.zza;
                                j4 = j8;
                                try {
                                    int length = zzkaVarArr.length;
                                    if (i10 >= 2) {
                                        break;
                                    }
                                    if (zzac(zzkaVarArr[i10]) && r15.zza[i10].zzm() == zze2.zzc[i10]) {
                                        long zzf = r15.zza[i10].zzf();
                                        if (zzf == Long.MIN_VALUE) {
                                            j5 = Long.MIN_VALUE;
                                            break;
                                        }
                                        j5 = Math.max(zzf, j5);
                                    }
                                    i10++;
                                    j8 = j4;
                                } catch (Throwable th3) {
                                    th = th3;
                                    r9 = 1;
                                    r13 = 0;
                                    r14 = 0;
                                    zzju zzjuVar222 = r15.zzu;
                                    zzZ(zzcnVar, zzsiVar2, zzjuVar222.zza, zzjuVar222.zzb, r9 == z8 ? -9223372036854775807L : j3);
                                    if (!z19) {
                                    }
                                    zzju zzjuVar322 = r15.zzu;
                                    Object obj422 = zzjuVar322.zzb.zza;
                                    zzcn zzcnVar222 = zzjuVar322.zza;
                                    if (z19) {
                                    }
                                    z14 = r13;
                                    r15.zzu = zzz(zzsiVar2, j3, j4, r15.zzu.zzd, z14, zzcnVar.zza(obj422) != -1 ? 4 : 3);
                                    zzL();
                                    r15.zzN(zzcnVar, r15.zzu.zza);
                                    r15.zzu = r15.zzu.zzf(zzcnVar);
                                    if (!zzcnVar.zzo()) {
                                    }
                                    r15.zzE(r13);
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                j4 = j8;
                            }
                        }
                    } else {
                        j4 = r13;
                        j5 = zze3;
                    }
                }
                z16 = false;
                z15 = true;
                zzjcVar = null;
                if (!zzjmVar3.zzo(zzcnVar, j7, j5)) {
                    r15.zzP(false);
                }
            }
            zzju zzjuVar4 = r15.zzu;
            zzZ(zzcnVar, zzsiVar2, zzjuVar4.zza, zzjuVar4.zzb, z15 != z8 ? -9223372036854775807L : j3);
            if (z19 || j4 != r15.zzu.zzc) {
                zzju zzjuVar5 = r15.zzu;
                Object obj5 = zzjuVar5.zzb.zza;
                zzcn zzcnVar3 = zzjuVar5.zza;
                if (!z19 || !z || zzcnVar3.zzo() || zzcnVar3.zzn(obj5, r15.zzl).zzg) {
                    z15 = z16;
                }
                r15.zzu = zzz(zzsiVar2, j3, j4, r15.zzu.zzd, z15, zzcnVar.zza(obj5) == -1 ? 4 : 3);
            }
            zzL();
            r15.zzN(zzcnVar, r15.zzu.zza);
            r15.zzu = r15.zzu.zzf(zzcnVar);
            if (!zzcnVar.zzo()) {
                r15.zzH = zzjcVar;
            }
            r15.zzE(z16);
        } catch (Throwable th5) {
            th = th5;
            zzju zzjuVar2222 = r15.zzu;
            zzZ(zzcnVar, zzsiVar2, zzjuVar2222.zza, zzjuVar2222.zzb, r9 == z8 ? -9223372036854775807L : j3);
            if (!z19 || j4 != r15.zzu.zzc) {
                zzju zzjuVar3222 = r15.zzu;
                Object obj4222 = zzjuVar3222.zzb.zza;
                zzcn zzcnVar2222 = zzjuVar3222.zza;
                if (z19 && z && !zzcnVar2222.zzo()) {
                    z14 = r9;
                }
                z14 = r13;
                r15.zzu = zzz(zzsiVar2, j3, j4, r15.zzu.zzd, z14, zzcnVar.zza(obj4222) != -1 ? 4 : 3);
            }
            zzL();
            r15.zzN(zzcnVar, r15.zzu.zza);
            r15.zzu = r15.zzu.zzf(zzcnVar);
            if (!zzcnVar.zzo()) {
                r15.zzH = r14;
            }
            r15.zzE(r13);
            throw th;
        }
    }

    private final void zzG(zzby zzbyVar, boolean z) throws zzha {
        zzH(zzbyVar, zzbyVar.zzc, true, z);
    }

    private final void zzH(zzby zzbyVar, float f, boolean z, boolean z2) throws zzha {
        int i;
        zzjd zzjdVar = this;
        if (z) {
            if (z2) {
                zzjdVar.zzv.zza(1);
            }
            zzju zzjuVar = zzjdVar.zzu;
            zzjdVar = this;
            zzjdVar.zzu = new zzju(zzjuVar.zza, zzjuVar.zzb, zzjuVar.zzc, zzjuVar.zzd, zzjuVar.zze, zzjuVar.zzf, zzjuVar.zzg, zzjuVar.zzh, zzjuVar.zzi, zzjuVar.zzj, zzjuVar.zzk, zzjuVar.zzl, zzjuVar.zzm, zzbyVar, zzjuVar.zzp, zzjuVar.zzq, zzjuVar.zzr, zzjuVar.zzo);
        }
        float f2 = zzbyVar.zzc;
        zzjj zzd = zzjdVar.zzq.zzd();
        while (true) {
            i = 0;
            if (zzd == null) {
                break;
            }
            zzvt[] zzvtVarArr = zzd.zzi().zzc;
            int length = zzvtVarArr.length;
            while (i < length) {
                zzvt zzvtVar = zzvtVarArr[i];
                i++;
            }
            zzd = zzd.zzg();
        }
        zzka[] zzkaVarArr = zzjdVar.zza;
        int length2 = zzkaVarArr.length;
        while (i < 2) {
            zzka zzkaVar = zzkaVarArr[i];
            if (zzkaVar != null) {
                zzkaVar.zzD(f, zzbyVar.zzc);
            }
            i++;
        }
    }

    private final void zzI() {
        long zze;
        long j;
        boolean zzg;
        if (zzab()) {
            zzjj zzc = this.zzq.zzc();
            long zzu = zzu(zzc.zzd());
            if (zzc == this.zzq.zzd()) {
                zze = this.zzI;
                j = zzc.zze();
            } else {
                zze = this.zzI - zzc.zze();
                j = zzc.zzf.zzb;
            }
            zzg = this.zzf.zzg(zze - j, zzu, this.zzn.zzc().zzc);
        } else {
            zzg = false;
        }
        this.zzA = zzg;
        if (zzg) {
            this.zzq.zzc().zzk(this.zzI);
        }
        zzW();
    }

    private final void zzJ() {
        boolean z;
        this.zzv.zzc(this.zzu);
        z = this.zzv.zzg;
        if (z) {
            zzhw zzhwVar = this.zzN;
            zzhwVar.zza.zzT(this.zzv);
            this.zzv = new zzjb(this.zzu);
        }
    }

    private final void zzK(boolean z, boolean z2, boolean z3, boolean z4) {
        zzsi zzsiVar;
        boolean z5;
        long j;
        long j2;
        this.zzh.zze(2);
        this.zzL = null;
        this.zzz = false;
        this.zzn.zzi();
        this.zzI = 1000000000000L;
        zzka[] zzkaVarArr = this.zza;
        int length = zzkaVarArr.length;
        for (int i = 0; i < 2; i++) {
            try {
                zzA(zzkaVarArr[i]);
            } catch (zzha | RuntimeException e) {
                zzdw.zzc("ExoPlayerImplInternal", "Disable failed.", e);
            }
        }
        if (z) {
            zzka[] zzkaVarArr2 = this.zza;
            int length2 = zzkaVarArr2.length;
            for (int i2 = 0; i2 < 2; i2++) {
                zzka zzkaVar = zzkaVarArr2[i2];
                if (this.zzb.remove(zzkaVar)) {
                    try {
                        zzkaVar.zzA();
                    } catch (RuntimeException e2) {
                        zzdw.zzc("ExoPlayerImplInternal", "Reset failed.", e2);
                    }
                }
            }
        }
        this.zzG = 0;
        zzju zzjuVar = this.zzu;
        zzsi zzsiVar2 = zzjuVar.zzb;
        long j3 = zzjuVar.zzr;
        long j4 = (this.zzu.zzb.zzb() || zzae(this.zzu, this.zzl)) ? this.zzu.zzc : this.zzu.zzr;
        if (z2) {
            this.zzH = null;
            Pair zzx = zzx(this.zzu.zza);
            zzsi zzsiVar3 = (zzsi) zzx.first;
            long longValue = ((Long) zzx.second).longValue();
            if (zzsiVar3.equals(this.zzu.zzb)) {
                zzsiVar = zzsiVar3;
                z5 = false;
            } else {
                z5 = true;
                zzsiVar = zzsiVar3;
            }
            j = longValue;
            j2 = -9223372036854775807L;
        } else {
            zzsiVar = zzsiVar2;
            z5 = false;
            j = j3;
            j2 = j4;
        }
        this.zzq.zzi();
        this.zzA = false;
        zzju zzjuVar2 = this.zzu;
        zzcn zzcnVar = zzjuVar2.zza;
        int i3 = zzjuVar2.zze;
        zzha zzhaVar = z4 ? null : zzjuVar2.zzf;
        zzuh zzuhVar = z5 ? zzuh.zza : zzjuVar2.zzh;
        zzwa zzwaVar = z5 ? this.zze : this.zzu.zzi;
        List zzo = z5 ? zzfvn.zzo() : this.zzu.zzj;
        zzju zzjuVar3 = this.zzu;
        this.zzu = new zzju(zzcnVar, zzsiVar, j2, j, i3, zzhaVar, false, zzuhVar, zzwaVar, zzo, zzsiVar, zzjuVar3.zzl, zzjuVar3.zzm, zzjuVar3.zzn, j, 0L, j, false);
        if (z3) {
            this.zzr.zzg();
        }
    }

    private final void zzL() {
        zzjj zzd = this.zzq.zzd();
        boolean z = false;
        if (zzd != null && zzd.zzf.zzh && this.zzx) {
            z = true;
        }
        this.zzy = z;
    }

    private final void zzM(long j) throws zzha {
        zzjj zzd = this.zzq.zzd();
        long zze = j + (zzd == null ? 1000000000000L : zzd.zze());
        this.zzI = zze;
        this.zzn.zzf(zze);
        zzka[] zzkaVarArr = this.zza;
        int length = zzkaVarArr.length;
        for (int i = 0; i < 2; i++) {
            zzka zzkaVar = zzkaVarArr[i];
            if (zzac(zzkaVar)) {
                zzkaVar.zzB(this.zzI);
            }
        }
        for (zzjj zzd2 = this.zzq.zzd(); zzd2 != null; zzd2 = zzd2.zzg()) {
            for (zzvt zzvtVar : zzd2.zzi().zzc) {
            }
        }
    }

    private final void zzN(zzcn zzcnVar, zzcn zzcnVar2) {
        if (zzcnVar.zzo() && zzcnVar2.zzo()) {
            return;
        }
        int size = this.zzo.size() - 1;
        if (size < 0) {
            Collections.sort(this.zzo);
            return;
        }
        zzja zzjaVar = (zzja) this.zzo.get(size);
        Object obj = zzjaVar.zzb;
        zzjx zzjxVar = zzjaVar.zza;
        int i = zzen.zza;
        zzjx zzjxVar2 = zzjaVar.zza;
        throw null;
    }

    private final void zzO(long j, long j2) {
        this.zzh.zzi(2, j + j2);
    }

    private final void zzP(boolean z) throws zzha {
        zzsi zzsiVar = this.zzq.zzd().zzf.zza;
        long zzw = zzw(zzsiVar, this.zzu.zzr, true, false);
        if (zzw != this.zzu.zzr) {
            zzju zzjuVar = this.zzu;
            this.zzu = zzz(zzsiVar, zzw, zzjuVar.zzc, zzjuVar.zzd, z, 5);
        }
    }

    private final void zzQ(zzjx zzjxVar) throws zzha {
        if (zzjxVar.zzb() != this.zzj) {
            this.zzh.zzb(15, zzjxVar).zza();
            return;
        }
        zzai(zzjxVar);
        int i = this.zzu.zze;
        if (i == 3 || i == 2) {
            this.zzh.zzh(2);
        }
    }

    private final void zzR(boolean z, int i, boolean z2, int i2) throws zzha {
        this.zzv.zza(z2 ? 1 : 0);
        this.zzv.zzb(i2);
        this.zzu = this.zzu.zzc(z, i);
        this.zzz = false;
        for (zzjj zzd = this.zzq.zzd(); zzd != null; zzd = zzd.zzg()) {
            for (zzvt zzvtVar : zzd.zzi().zzc) {
            }
        }
        if (!zzaf()) {
            zzV();
            zzY();
            return;
        }
        int i3 = this.zzu.zze;
        if (i3 == 3) {
            zzT();
            this.zzh.zzh(2);
        } else if (i3 == 2) {
            this.zzh.zzh(2);
        }
    }

    private final void zzS(int i) {
        zzju zzjuVar = this.zzu;
        if (zzjuVar.zze != i) {
            if (i != 2) {
                this.zzM = -9223372036854775807L;
            }
            this.zzu = zzjuVar.zze(i);
        }
    }

    private final void zzT() throws zzha {
        this.zzz = false;
        this.zzn.zzh();
        zzka[] zzkaVarArr = this.zza;
        int length = zzkaVarArr.length;
        for (int i = 0; i < 2; i++) {
            zzka zzkaVar = zzkaVarArr[i];
            if (zzac(zzkaVar)) {
                zzkaVar.zzE();
            }
        }
    }

    private final void zzU(boolean z, boolean z2) {
        zzK(z || !this.zzD, false, true, false);
        this.zzv.zza(z2 ? 1 : 0);
        this.zzf.zzd();
        zzS(1);
    }

    private final void zzV() throws zzha {
        this.zzn.zzi();
        zzka[] zzkaVarArr = this.zza;
        int length = zzkaVarArr.length;
        for (int i = 0; i < 2; i++) {
            zzka zzkaVar = zzkaVarArr[i];
            if (zzac(zzkaVar)) {
                zzaj(zzkaVar);
            }
        }
    }

    private final void zzW() {
        zzjj zzc = this.zzq.zzc();
        boolean z = this.zzA || (zzc != null && zzc.zza.zzp());
        zzju zzjuVar = this.zzu;
        if (z != zzjuVar.zzg) {
            this.zzu = new zzju(zzjuVar.zza, zzjuVar.zzb, zzjuVar.zzc, zzjuVar.zzd, zzjuVar.zze, zzjuVar.zzf, z, zzjuVar.zzh, zzjuVar.zzi, zzjuVar.zzj, zzjuVar.zzk, zzjuVar.zzl, zzjuVar.zzm, zzjuVar.zzn, zzjuVar.zzp, zzjuVar.zzq, zzjuVar.zzr, zzjuVar.zzo);
        }
    }

    private final void zzX(zzuh zzuhVar, zzwa zzwaVar) {
        this.zzf.zze(this.zza, zzuhVar, zzwaVar.zzc);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x009c, code lost:
    
        r7 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzY() throws zzha {
        zzja zzjaVar;
        zzjj zzd = this.zzq.zzd();
        if (zzd == null) {
            return;
        }
        long zzd2 = zzd.zzd ? zzd.zza.zzd() : -9223372036854775807L;
        if (zzd2 != -9223372036854775807L) {
            zzM(zzd2);
            if (zzd2 != this.zzu.zzr) {
                zzju zzjuVar = this.zzu;
                this.zzu = zzz(zzjuVar.zzb, zzd2, zzjuVar.zzc, zzd2, true, 5);
            }
        } else {
            long zzb = this.zzn.zzb(zzd != this.zzq.zze());
            this.zzI = zzb;
            long zze = zzb - zzd.zze();
            long j = this.zzu.zzr;
            if (!this.zzo.isEmpty() && !this.zzu.zzb.zzb()) {
                if (this.zzK) {
                    j--;
                    this.zzK = false;
                }
                zzju zzjuVar2 = this.zzu;
                int zza = zzjuVar2.zza.zza(zzjuVar2.zzb.zza);
                int min = Math.min(this.zzJ, this.zzo.size());
                if (min > 0) {
                    zzjaVar = (zzja) this.zzo.get(min - 1);
                    while (zzjaVar != null && (zza < 0 || (zza == 0 && j < 0))) {
                        min--;
                        if (min > 0) {
                            zzjaVar = (zzja) this.zzo.get(min - 1);
                        }
                    }
                    if (min < this.zzo.size()) {
                    }
                    this.zzJ = min;
                }
                zzjaVar = null;
            }
            this.zzu.zzr = zze;
        }
        this.zzu.zzp = this.zzq.zzc().zzc();
        this.zzu.zzq = zzt();
        zzju zzjuVar3 = this.zzu;
        if (zzjuVar3.zzl && zzjuVar3.zze == 3 && zzag(zzjuVar3.zza, zzjuVar3.zzb)) {
            zzju zzjuVar4 = this.zzu;
            if (zzjuVar4.zzn.zzc == 1.0f) {
                float zza2 = this.zzO.zza(zzs(zzjuVar4.zza, zzjuVar4.zzb.zza, zzjuVar4.zzr), zzt());
                if (this.zzn.zzc().zzc != zza2) {
                    this.zzn.zzg(new zzby(zza2, this.zzu.zzn.zzd));
                    zzH(this.zzu.zzn, this.zzn.zzc().zzc, false, false);
                }
            }
        }
    }

    private final void zzZ(zzcn zzcnVar, zzsi zzsiVar, zzcn zzcnVar2, zzsi zzsiVar2, long j) {
        if (!zzag(zzcnVar, zzsiVar)) {
            zzby zzbyVar = zzsiVar.zzb() ? zzby.zza : this.zzu.zzn;
            if (this.zzn.zzc().equals(zzbyVar)) {
                return;
            }
            this.zzn.zzg(zzbyVar);
            return;
        }
        zzcnVar.zze(zzcnVar.zzn(zzsiVar.zza, this.zzl).zzd, this.zzk, 0L);
        zzgv zzgvVar = this.zzO;
        zzaw zzawVar = this.zzk.zzk;
        int i = zzen.zza;
        zzgvVar.zzd(zzawVar);
        if (j != -9223372036854775807L) {
            this.zzO.zze(zzs(zzcnVar, zzsiVar.zza, j));
            return;
        }
        if (zzen.zzT(!zzcnVar2.zzo() ? zzcnVar2.zze(zzcnVar2.zzn(zzsiVar2.zza, this.zzl).zzd, this.zzk, 0L).zzc : null, this.zzk.zzc)) {
            return;
        }
        this.zzO.zze(-9223372036854775807L);
    }

    private final synchronized void zzaa(zzftn zzftnVar, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        boolean z = false;
        while (!Boolean.valueOf(((zziu) zzftnVar).zza.zzw).booleanValue() && j > 0) {
            try {
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            j = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    private final boolean zzab() {
        zzjj zzc = this.zzq.zzc();
        return (zzc == null || zzc.zzd() == Long.MIN_VALUE) ? false : true;
    }

    private static boolean zzac(zzka zzkaVar) {
        return zzkaVar.zzbe() != 0;
    }

    private final boolean zzad() {
        zzjj zzd = this.zzq.zzd();
        long j = zzd.zzf.zze;
        if (!zzd.zzd) {
            return false;
        }
        if (j == -9223372036854775807L || this.zzu.zzr < j) {
            return true;
        }
        return !zzaf();
    }

    private static boolean zzae(zzju zzjuVar, zzck zzckVar) {
        zzsi zzsiVar = zzjuVar.zzb;
        zzcn zzcnVar = zzjuVar.zza;
        return zzcnVar.zzo() || zzcnVar.zzn(zzsiVar.zza, zzckVar).zzg;
    }

    private final boolean zzaf() {
        zzju zzjuVar = this.zzu;
        return zzjuVar.zzl && zzjuVar.zzm == 0;
    }

    private final boolean zzag(zzcn zzcnVar, zzsi zzsiVar) {
        if (!zzsiVar.zzb() && !zzcnVar.zzo()) {
            zzcnVar.zze(zzcnVar.zzn(zzsiVar.zza, this.zzl).zzd, this.zzk, 0L);
            if (this.zzk.zzb()) {
                zzcm zzcmVar = this.zzk;
                if (zzcmVar.zzi && zzcmVar.zzf != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    private static zzaf[] zzah(zzvt zzvtVar) {
        int zzc = zzvtVar != null ? zzvtVar.zzc() : 0;
        zzaf[] zzafVarArr = new zzaf[zzc];
        for (int i = 0; i < zzc; i++) {
            zzafVarArr[i] = zzvtVar.zzd(i);
        }
        return zzafVarArr;
    }

    private static final void zzai(zzjx zzjxVar) throws zzha {
        zzjxVar.zzj();
        try {
            zzjxVar.zzc().zzp(zzjxVar.zza(), zzjxVar.zzg());
        } finally {
            zzjxVar.zzh(true);
        }
    }

    private static final void zzaj(zzka zzkaVar) throws zzha {
        if (zzkaVar.zzbe() == 2) {
            zzkaVar.zzF();
        }
    }

    private static final void zzak(zzka zzkaVar, long j) {
        zzkaVar.zzC();
        if (zzkaVar instanceof zzuk) {
            throw null;
        }
    }

    static Object zze(zzcm zzcmVar, zzck zzckVar, int i, boolean z, Object obj, zzcn zzcnVar, zzcn zzcnVar2) {
        int zza = zzcnVar.zza(obj);
        int zzb = zzcnVar.zzb();
        int i2 = 0;
        int i3 = zza;
        int i4 = -1;
        while (true) {
            if (i2 >= zzb || i4 != -1) {
                break;
            }
            i3 = zzcnVar.zzi(i3, zzckVar, zzcmVar, i, z);
            if (i3 == -1) {
                i4 = -1;
                break;
            }
            i4 = zzcnVar2.zza(zzcnVar.zzf(i3));
            i2++;
        }
        if (i4 == -1) {
            return null;
        }
        return zzcnVar2.zzf(i4);
    }

    static final /* synthetic */ void zzr(zzjx zzjxVar) {
        try {
            zzai(zzjxVar);
        } catch (zzha e) {
            zzdw.zzc("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    private final long zzs(zzcn zzcnVar, Object obj, long j) {
        zzcnVar.zze(zzcnVar.zzn(obj, this.zzl).zzd, this.zzk, 0L);
        zzcm zzcmVar = this.zzk;
        if (zzcmVar.zzf != -9223372036854775807L && zzcmVar.zzb()) {
            zzcm zzcmVar2 = this.zzk;
            if (zzcmVar2.zzi) {
                return zzen.zzv(zzen.zzt(zzcmVar2.zzg) - this.zzk.zzf) - j;
            }
        }
        return -9223372036854775807L;
    }

    private final long zzt() {
        return zzu(this.zzu.zzp);
    }

    private final long zzu(long j) {
        zzjj zzc = this.zzq.zzc();
        if (zzc == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.zzI - zzc.zze()));
    }

    private final long zzv(zzsi zzsiVar, long j, boolean z) throws zzha {
        return zzw(zzsiVar, j, this.zzq.zzd() != this.zzq.zze(), z);
    }

    private final long zzw(zzsi zzsiVar, long j, boolean z, boolean z2) throws zzha {
        zzV();
        this.zzz = false;
        if (z2 || this.zzu.zze == 3) {
            zzS(2);
        }
        zzjj zzd = this.zzq.zzd();
        zzjj zzjjVar = zzd;
        while (zzjjVar != null && !zzsiVar.equals(zzjjVar.zzf.zza)) {
            zzjjVar = zzjjVar.zzg();
        }
        if (z || zzd != zzjjVar || (zzjjVar != null && zzjjVar.zze() + j < 0)) {
            zzka[] zzkaVarArr = this.zza;
            int length = zzkaVarArr.length;
            for (int i = 0; i < 2; i++) {
                zzA(zzkaVarArr[i]);
            }
            if (zzjjVar != null) {
                while (this.zzq.zzd() != zzjjVar) {
                    this.zzq.zza();
                }
                this.zzq.zzm(zzjjVar);
                zzjjVar.zzp(1000000000000L);
                zzB();
            }
        }
        if (zzjjVar != null) {
            this.zzq.zzm(zzjjVar);
            if (!zzjjVar.zzd) {
                zzjjVar.zzf = zzjjVar.zzf.zzb(j);
            } else if (zzjjVar.zze) {
                j = zzjjVar.zza.zze(j);
                zzjjVar.zza.zzj(j - this.zzm, false);
            }
            zzM(j);
            zzI();
        } else {
            this.zzq.zzi();
            zzM(j);
        }
        zzE(false);
        this.zzh.zzh(2);
        return j;
    }

    private final Pair zzx(zzcn zzcnVar) {
        long j = 0;
        if (zzcnVar.zzo()) {
            return Pair.create(zzju.zzh(), 0L);
        }
        Pair zzl = zzcnVar.zzl(this.zzk, this.zzl, zzcnVar.zzg(this.zzC), -9223372036854775807L);
        zzsi zzh = this.zzq.zzh(zzcnVar, zzl.first, 0L);
        long longValue = ((Long) zzl.second).longValue();
        if (zzh.zzb()) {
            zzcnVar.zzn(zzh.zza, this.zzl);
            if (zzh.zzc == this.zzl.zze(zzh.zzb)) {
                this.zzl.zzi();
            }
        } else {
            j = longValue;
        }
        return Pair.create(zzh, Long.valueOf(j));
    }

    private static Pair zzy(zzcn zzcnVar, zzjc zzjcVar, boolean z, int i, boolean z2, zzcm zzcmVar, zzck zzckVar) {
        Pair zzl;
        zzcn zzcnVar2 = zzjcVar.zza;
        if (zzcnVar.zzo()) {
            return null;
        }
        zzcn zzcnVar3 = true == zzcnVar2.zzo() ? zzcnVar : zzcnVar2;
        try {
            zzl = zzcnVar3.zzl(zzcmVar, zzckVar, zzjcVar.zzb, zzjcVar.zzc);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (zzcnVar.equals(zzcnVar3)) {
            return zzl;
        }
        if (zzcnVar.zza(zzl.first) != -1) {
            return (zzcnVar3.zzn(zzl.first, zzckVar).zzg && zzcnVar3.zze(zzckVar.zzd, zzcmVar, 0L).zzo == zzcnVar3.zza(zzl.first)) ? zzcnVar.zzl(zzcmVar, zzckVar, zzcnVar.zzn(zzl.first, zzckVar).zzd, zzjcVar.zzc) : zzl;
        }
        Object zze = zze(zzcmVar, zzckVar, i, z2, zzl.first, zzcnVar3, zzcnVar);
        if (zze != null) {
            return zzcnVar.zzl(zzcmVar, zzckVar, zzcnVar.zzn(zze, zzckVar).zzd, -9223372036854775807L);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final zzju zzz(zzsi zzsiVar, long j, long j2, long j3, boolean z, int i) {
        List list;
        zzuh zzuhVar;
        zzwa zzwaVar;
        this.zzK = (!this.zzK && j == this.zzu.zzr && zzsiVar.equals(this.zzu.zzb)) ? false : true;
        zzL();
        zzju zzjuVar = this.zzu;
        zzuh zzuhVar2 = zzjuVar.zzh;
        zzwa zzwaVar2 = zzjuVar.zzi;
        List list2 = zzjuVar.zzj;
        if (this.zzr.zzi()) {
            zzjj zzd = this.zzq.zzd();
            zzuhVar2 = zzd == null ? zzuh.zza : zzd.zzh();
            zzwaVar2 = zzd == null ? this.zze : zzd.zzi();
            zzvt[] zzvtVarArr = zzwaVar2.zzc;
            zzfvk zzfvkVar = new zzfvk();
            boolean z2 = false;
            for (zzvt zzvtVar : zzvtVarArr) {
                if (zzvtVar != null) {
                    zzbq zzbqVar = zzvtVar.zzd(0).zzk;
                    if (zzbqVar == null) {
                        zzfvkVar.zze(new zzbq(-9223372036854775807L, new zzbp[0]));
                    } else {
                        zzfvkVar.zze(zzbqVar);
                        z2 = true;
                    }
                }
            }
            zzfvn zzg = z2 ? zzfvkVar.zzg() : zzfvn.zzo();
            if (zzd != null) {
                zzjk zzjkVar = zzd.zzf;
                if (zzjkVar.zzc != j2) {
                    zzd.zzf = zzjkVar.zza(j2);
                }
            }
            list = zzg;
        } else {
            if (!zzsiVar.equals(this.zzu.zzb)) {
                zzuhVar = zzuh.zza;
                zzwaVar = this.zze;
                list = zzfvn.zzo();
                if (z) {
                    this.zzv.zzd(i);
                }
                return this.zzu.zzb(zzsiVar, j, j2, j3, zzt(), zzuhVar, zzwaVar, list);
            }
            list = list2;
        }
        zzuhVar = zzuhVar2;
        zzwaVar = zzwaVar2;
        if (z) {
        }
        return this.zzu.zzb(zzsiVar, j, j2, j3, zzt(), zzuhVar, zzwaVar, list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:497:0x0911, code lost:
    
        if (r53.zzf.zzh(zzt(), r53.zzn.zzc().zzc, r53.zzz, r31) == false) goto L466;
     */
    /* JADX WARN: Code restructure failed: missing block: B:520:0x0934, code lost:
    
        if (r2 == false) goto L474;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:289:0x06dc A[Catch: RuntimeException -> 0x0ac7, IOException -> 0x0af1, zzrk -> 0x0af9, zzey -> 0x0b01, zzbu -> 0x0b09, zzpi -> 0x0b20, zzha -> 0x0b29, TryCatch #9 {zzbu -> 0x0b09, zzey -> 0x0b01, zzha -> 0x0b29, zzpi -> 0x0b20, zzrk -> 0x0af9, IOException -> 0x0af1, RuntimeException -> 0x0ac7, blocks: (B:3:0x0006, B:4:0x0011, B:8:0x0016, B:12:0x001c, B:15:0x0023, B:17:0x0027, B:19:0x002b, B:21:0x0031, B:23:0x0037, B:26:0x003e, B:28:0x0047, B:30:0x0055, B:32:0x005c, B:33:0x0066, B:34:0x0079, B:35:0x0090, B:36:0x00ac, B:38:0x00bb, B:39:0x00bf, B:40:0x00d0, B:42:0x00df, B:43:0x00fb, B:44:0x010e, B:45:0x0117, B:47:0x0129, B:48:0x0135, B:49:0x0145, B:50:0x014e, B:53:0x0155, B:55:0x015d, B:57:0x0161, B:59:0x0167, B:61:0x016f, B:63:0x0177, B:65:0x017a, B:70:0x017f, B:79:0x018c, B:81:0x018d, B:84:0x0194, B:86:0x01a2, B:87:0x01a5, B:89:0x01aa, B:91:0x01ba, B:92:0x01bd, B:93:0x01c2, B:95:0x01d9, B:97:0x01dd, B:99:0x01eb, B:102:0x01f5, B:104:0x01fa, B:106:0x0200, B:147:0x0208, B:109:0x0210, B:111:0x0236, B:114:0x023f, B:116:0x0261, B:117:0x0264, B:118:0x026a, B:120:0x026f, B:122:0x027f, B:124:0x0285, B:127:0x0289, B:129:0x028d, B:126:0x0292, B:134:0x0297, B:135:0x02b8, B:137:0x02c3, B:140:0x029b, B:142:0x02a5, B:155:0x02d0, B:157:0x02dc, B:158:0x02e8, B:160:0x02f4, B:162:0x031c, B:163:0x033c, B:164:0x0341, B:165:0x0353, B:174:0x035e, B:175:0x035f, B:176:0x0366, B:177:0x036e, B:178:0x0383, B:180:0x03af, B:188:0x04d1, B:189:0x049d, B:215:0x0499, B:229:0x04e8, B:230:0x04f8, B:244:0x03d2, B:247:0x03e5, B:249:0x03f5, B:251:0x040c, B:253:0x0416, B:260:0x04f9, B:262:0x050e, B:265:0x0518, B:267:0x0527, B:269:0x0533, B:271:0x0562, B:272:0x0567, B:273:0x056b, B:275:0x056f, B:276:0x057c, B:279:0x06b5, B:281:0x06bd, B:283:0x06c5, B:286:0x06ca, B:287:0x06d6, B:289:0x06dc, B:291:0x06e4, B:297:0x06f5, B:299:0x06fb, B:301:0x0715, B:303:0x071b, B:296:0x0720, B:310:0x0725, B:312:0x0729, B:314:0x072f, B:316:0x0733, B:318:0x073b, B:320:0x0741, B:322:0x074b, B:325:0x0751, B:326:0x0754, B:328:0x075d, B:330:0x076f, B:332:0x0777, B:334:0x077f, B:338:0x0788, B:343:0x07b4, B:348:0x07c0, B:350:0x07ca, B:351:0x07d1, B:353:0x07e3, B:354:0x07f8, B:356:0x07fe, B:360:0x084a, B:361:0x0807, B:363:0x080e, B:366:0x0817, B:368:0x0821, B:373:0x082e, B:375:0x0834, B:383:0x0847, B:391:0x0859, B:393:0x085f, B:397:0x086c, B:399:0x0874, B:401:0x0878, B:402:0x0883, B:404:0x0889, B:405:0x0968, B:408:0x0970, B:410:0x0975, B:412:0x097d, B:414:0x098b, B:416:0x0992, B:420:0x0996, B:422:0x099c, B:424:0x09a5, B:426:0x09ab, B:428:0x09b6, B:429:0x09da, B:431:0x09e0, B:434:0x09e9, B:436:0x09ed, B:440:0x09f6, B:442:0x09fc, B:443:0x0a58, B:445:0x0a5d, B:453:0x0a6d, B:455:0x0a71, B:456:0x0a80, B:457:0x0a79, B:461:0x09bd, B:464:0x09cb, B:465:0x09d2, B:466:0x09d3, B:467:0x0892, B:469:0x0899, B:471:0x089d, B:474:0x0913, B:476:0x091f, B:479:0x08a9, B:481:0x08ad, B:483:0x08bf, B:484:0x08cd, B:486:0x08d9, B:489:0x08e2, B:491:0x08ec, B:496:0x08f7, B:501:0x0923, B:503:0x0929, B:505:0x092d, B:508:0x0936, B:510:0x0944, B:512:0x094c, B:514:0x0956, B:516:0x095b, B:518:0x0960, B:519:0x0965, B:521:0x0852, B:528:0x0589, B:530:0x058f, B:533:0x0595, B:536:0x05a0, B:538:0x05a6, B:541:0x05b4, B:544:0x05ba, B:546:0x05c2, B:550:0x05c5, B:552:0x05cd, B:554:0x05db, B:556:0x060e, B:558:0x0618, B:561:0x0623, B:563:0x062b, B:565:0x062e, B:569:0x0632, B:571:0x0638, B:573:0x0642, B:575:0x064c, B:577:0x065d, B:581:0x0663, B:580:0x066e, B:586:0x0671, B:588:0x067a, B:591:0x067f, B:593:0x0685, B:595:0x068d, B:597:0x0693, B:599:0x0699, B:603:0x06a7, B:604:0x06af, B:606:0x06b2, B:612:0x0579, B:614:0x0a88, B:617:0x0a8f, B:619:0x0a97, B:622:0x0ab5), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0723 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0751 A[Catch: RuntimeException -> 0x0ac7, IOException -> 0x0af1, zzrk -> 0x0af9, zzey -> 0x0b01, zzbu -> 0x0b09, zzpi -> 0x0b20, zzha -> 0x0b29, TryCatch #9 {zzbu -> 0x0b09, zzey -> 0x0b01, zzha -> 0x0b29, zzpi -> 0x0b20, zzrk -> 0x0af9, IOException -> 0x0af1, RuntimeException -> 0x0ac7, blocks: (B:3:0x0006, B:4:0x0011, B:8:0x0016, B:12:0x001c, B:15:0x0023, B:17:0x0027, B:19:0x002b, B:21:0x0031, B:23:0x0037, B:26:0x003e, B:28:0x0047, B:30:0x0055, B:32:0x005c, B:33:0x0066, B:34:0x0079, B:35:0x0090, B:36:0x00ac, B:38:0x00bb, B:39:0x00bf, B:40:0x00d0, B:42:0x00df, B:43:0x00fb, B:44:0x010e, B:45:0x0117, B:47:0x0129, B:48:0x0135, B:49:0x0145, B:50:0x014e, B:53:0x0155, B:55:0x015d, B:57:0x0161, B:59:0x0167, B:61:0x016f, B:63:0x0177, B:65:0x017a, B:70:0x017f, B:79:0x018c, B:81:0x018d, B:84:0x0194, B:86:0x01a2, B:87:0x01a5, B:89:0x01aa, B:91:0x01ba, B:92:0x01bd, B:93:0x01c2, B:95:0x01d9, B:97:0x01dd, B:99:0x01eb, B:102:0x01f5, B:104:0x01fa, B:106:0x0200, B:147:0x0208, B:109:0x0210, B:111:0x0236, B:114:0x023f, B:116:0x0261, B:117:0x0264, B:118:0x026a, B:120:0x026f, B:122:0x027f, B:124:0x0285, B:127:0x0289, B:129:0x028d, B:126:0x0292, B:134:0x0297, B:135:0x02b8, B:137:0x02c3, B:140:0x029b, B:142:0x02a5, B:155:0x02d0, B:157:0x02dc, B:158:0x02e8, B:160:0x02f4, B:162:0x031c, B:163:0x033c, B:164:0x0341, B:165:0x0353, B:174:0x035e, B:175:0x035f, B:176:0x0366, B:177:0x036e, B:178:0x0383, B:180:0x03af, B:188:0x04d1, B:189:0x049d, B:215:0x0499, B:229:0x04e8, B:230:0x04f8, B:244:0x03d2, B:247:0x03e5, B:249:0x03f5, B:251:0x040c, B:253:0x0416, B:260:0x04f9, B:262:0x050e, B:265:0x0518, B:267:0x0527, B:269:0x0533, B:271:0x0562, B:272:0x0567, B:273:0x056b, B:275:0x056f, B:276:0x057c, B:279:0x06b5, B:281:0x06bd, B:283:0x06c5, B:286:0x06ca, B:287:0x06d6, B:289:0x06dc, B:291:0x06e4, B:297:0x06f5, B:299:0x06fb, B:301:0x0715, B:303:0x071b, B:296:0x0720, B:310:0x0725, B:312:0x0729, B:314:0x072f, B:316:0x0733, B:318:0x073b, B:320:0x0741, B:322:0x074b, B:325:0x0751, B:326:0x0754, B:328:0x075d, B:330:0x076f, B:332:0x0777, B:334:0x077f, B:338:0x0788, B:343:0x07b4, B:348:0x07c0, B:350:0x07ca, B:351:0x07d1, B:353:0x07e3, B:354:0x07f8, B:356:0x07fe, B:360:0x084a, B:361:0x0807, B:363:0x080e, B:366:0x0817, B:368:0x0821, B:373:0x082e, B:375:0x0834, B:383:0x0847, B:391:0x0859, B:393:0x085f, B:397:0x086c, B:399:0x0874, B:401:0x0878, B:402:0x0883, B:404:0x0889, B:405:0x0968, B:408:0x0970, B:410:0x0975, B:412:0x097d, B:414:0x098b, B:416:0x0992, B:420:0x0996, B:422:0x099c, B:424:0x09a5, B:426:0x09ab, B:428:0x09b6, B:429:0x09da, B:431:0x09e0, B:434:0x09e9, B:436:0x09ed, B:440:0x09f6, B:442:0x09fc, B:443:0x0a58, B:445:0x0a5d, B:453:0x0a6d, B:455:0x0a71, B:456:0x0a80, B:457:0x0a79, B:461:0x09bd, B:464:0x09cb, B:465:0x09d2, B:466:0x09d3, B:467:0x0892, B:469:0x0899, B:471:0x089d, B:474:0x0913, B:476:0x091f, B:479:0x08a9, B:481:0x08ad, B:483:0x08bf, B:484:0x08cd, B:486:0x08d9, B:489:0x08e2, B:491:0x08ec, B:496:0x08f7, B:501:0x0923, B:503:0x0929, B:505:0x092d, B:508:0x0936, B:510:0x0944, B:512:0x094c, B:514:0x0956, B:516:0x095b, B:518:0x0960, B:519:0x0965, B:521:0x0852, B:528:0x0589, B:530:0x058f, B:533:0x0595, B:536:0x05a0, B:538:0x05a6, B:541:0x05b4, B:544:0x05ba, B:546:0x05c2, B:550:0x05c5, B:552:0x05cd, B:554:0x05db, B:556:0x060e, B:558:0x0618, B:561:0x0623, B:563:0x062b, B:565:0x062e, B:569:0x0632, B:571:0x0638, B:573:0x0642, B:575:0x064c, B:577:0x065d, B:581:0x0663, B:580:0x066e, B:586:0x0671, B:588:0x067a, B:591:0x067f, B:593:0x0685, B:595:0x068d, B:597:0x0693, B:599:0x0699, B:603:0x06a7, B:604:0x06af, B:606:0x06b2, B:612:0x0579, B:614:0x0a88, B:617:0x0a8f, B:619:0x0a97, B:622:0x0ab5), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:330:0x076f A[Catch: RuntimeException -> 0x0ac7, IOException -> 0x0af1, zzrk -> 0x0af9, zzey -> 0x0b01, zzbu -> 0x0b09, zzpi -> 0x0b20, zzha -> 0x0b29, TryCatch #9 {zzbu -> 0x0b09, zzey -> 0x0b01, zzha -> 0x0b29, zzpi -> 0x0b20, zzrk -> 0x0af9, IOException -> 0x0af1, RuntimeException -> 0x0ac7, blocks: (B:3:0x0006, B:4:0x0011, B:8:0x0016, B:12:0x001c, B:15:0x0023, B:17:0x0027, B:19:0x002b, B:21:0x0031, B:23:0x0037, B:26:0x003e, B:28:0x0047, B:30:0x0055, B:32:0x005c, B:33:0x0066, B:34:0x0079, B:35:0x0090, B:36:0x00ac, B:38:0x00bb, B:39:0x00bf, B:40:0x00d0, B:42:0x00df, B:43:0x00fb, B:44:0x010e, B:45:0x0117, B:47:0x0129, B:48:0x0135, B:49:0x0145, B:50:0x014e, B:53:0x0155, B:55:0x015d, B:57:0x0161, B:59:0x0167, B:61:0x016f, B:63:0x0177, B:65:0x017a, B:70:0x017f, B:79:0x018c, B:81:0x018d, B:84:0x0194, B:86:0x01a2, B:87:0x01a5, B:89:0x01aa, B:91:0x01ba, B:92:0x01bd, B:93:0x01c2, B:95:0x01d9, B:97:0x01dd, B:99:0x01eb, B:102:0x01f5, B:104:0x01fa, B:106:0x0200, B:147:0x0208, B:109:0x0210, B:111:0x0236, B:114:0x023f, B:116:0x0261, B:117:0x0264, B:118:0x026a, B:120:0x026f, B:122:0x027f, B:124:0x0285, B:127:0x0289, B:129:0x028d, B:126:0x0292, B:134:0x0297, B:135:0x02b8, B:137:0x02c3, B:140:0x029b, B:142:0x02a5, B:155:0x02d0, B:157:0x02dc, B:158:0x02e8, B:160:0x02f4, B:162:0x031c, B:163:0x033c, B:164:0x0341, B:165:0x0353, B:174:0x035e, B:175:0x035f, B:176:0x0366, B:177:0x036e, B:178:0x0383, B:180:0x03af, B:188:0x04d1, B:189:0x049d, B:215:0x0499, B:229:0x04e8, B:230:0x04f8, B:244:0x03d2, B:247:0x03e5, B:249:0x03f5, B:251:0x040c, B:253:0x0416, B:260:0x04f9, B:262:0x050e, B:265:0x0518, B:267:0x0527, B:269:0x0533, B:271:0x0562, B:272:0x0567, B:273:0x056b, B:275:0x056f, B:276:0x057c, B:279:0x06b5, B:281:0x06bd, B:283:0x06c5, B:286:0x06ca, B:287:0x06d6, B:289:0x06dc, B:291:0x06e4, B:297:0x06f5, B:299:0x06fb, B:301:0x0715, B:303:0x071b, B:296:0x0720, B:310:0x0725, B:312:0x0729, B:314:0x072f, B:316:0x0733, B:318:0x073b, B:320:0x0741, B:322:0x074b, B:325:0x0751, B:326:0x0754, B:328:0x075d, B:330:0x076f, B:332:0x0777, B:334:0x077f, B:338:0x0788, B:343:0x07b4, B:348:0x07c0, B:350:0x07ca, B:351:0x07d1, B:353:0x07e3, B:354:0x07f8, B:356:0x07fe, B:360:0x084a, B:361:0x0807, B:363:0x080e, B:366:0x0817, B:368:0x0821, B:373:0x082e, B:375:0x0834, B:383:0x0847, B:391:0x0859, B:393:0x085f, B:397:0x086c, B:399:0x0874, B:401:0x0878, B:402:0x0883, B:404:0x0889, B:405:0x0968, B:408:0x0970, B:410:0x0975, B:412:0x097d, B:414:0x098b, B:416:0x0992, B:420:0x0996, B:422:0x099c, B:424:0x09a5, B:426:0x09ab, B:428:0x09b6, B:429:0x09da, B:431:0x09e0, B:434:0x09e9, B:436:0x09ed, B:440:0x09f6, B:442:0x09fc, B:443:0x0a58, B:445:0x0a5d, B:453:0x0a6d, B:455:0x0a71, B:456:0x0a80, B:457:0x0a79, B:461:0x09bd, B:464:0x09cb, B:465:0x09d2, B:466:0x09d3, B:467:0x0892, B:469:0x0899, B:471:0x089d, B:474:0x0913, B:476:0x091f, B:479:0x08a9, B:481:0x08ad, B:483:0x08bf, B:484:0x08cd, B:486:0x08d9, B:489:0x08e2, B:491:0x08ec, B:496:0x08f7, B:501:0x0923, B:503:0x0929, B:505:0x092d, B:508:0x0936, B:510:0x0944, B:512:0x094c, B:514:0x0956, B:516:0x095b, B:518:0x0960, B:519:0x0965, B:521:0x0852, B:528:0x0589, B:530:0x058f, B:533:0x0595, B:536:0x05a0, B:538:0x05a6, B:541:0x05b4, B:544:0x05ba, B:546:0x05c2, B:550:0x05c5, B:552:0x05cd, B:554:0x05db, B:556:0x060e, B:558:0x0618, B:561:0x0623, B:563:0x062b, B:565:0x062e, B:569:0x0632, B:571:0x0638, B:573:0x0642, B:575:0x064c, B:577:0x065d, B:581:0x0663, B:580:0x066e, B:586:0x0671, B:588:0x067a, B:591:0x067f, B:593:0x0685, B:595:0x068d, B:597:0x0693, B:599:0x0699, B:603:0x06a7, B:604:0x06af, B:606:0x06b2, B:612:0x0579, B:614:0x0a88, B:617:0x0a8f, B:619:0x0a97, B:622:0x0ab5), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:345:0x07bb  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0847 A[Catch: RuntimeException -> 0x0ac7, IOException -> 0x0af1, zzrk -> 0x0af9, zzey -> 0x0b01, zzbu -> 0x0b09, zzpi -> 0x0b20, zzha -> 0x0b29, TryCatch #9 {zzbu -> 0x0b09, zzey -> 0x0b01, zzha -> 0x0b29, zzpi -> 0x0b20, zzrk -> 0x0af9, IOException -> 0x0af1, RuntimeException -> 0x0ac7, blocks: (B:3:0x0006, B:4:0x0011, B:8:0x0016, B:12:0x001c, B:15:0x0023, B:17:0x0027, B:19:0x002b, B:21:0x0031, B:23:0x0037, B:26:0x003e, B:28:0x0047, B:30:0x0055, B:32:0x005c, B:33:0x0066, B:34:0x0079, B:35:0x0090, B:36:0x00ac, B:38:0x00bb, B:39:0x00bf, B:40:0x00d0, B:42:0x00df, B:43:0x00fb, B:44:0x010e, B:45:0x0117, B:47:0x0129, B:48:0x0135, B:49:0x0145, B:50:0x014e, B:53:0x0155, B:55:0x015d, B:57:0x0161, B:59:0x0167, B:61:0x016f, B:63:0x0177, B:65:0x017a, B:70:0x017f, B:79:0x018c, B:81:0x018d, B:84:0x0194, B:86:0x01a2, B:87:0x01a5, B:89:0x01aa, B:91:0x01ba, B:92:0x01bd, B:93:0x01c2, B:95:0x01d9, B:97:0x01dd, B:99:0x01eb, B:102:0x01f5, B:104:0x01fa, B:106:0x0200, B:147:0x0208, B:109:0x0210, B:111:0x0236, B:114:0x023f, B:116:0x0261, B:117:0x0264, B:118:0x026a, B:120:0x026f, B:122:0x027f, B:124:0x0285, B:127:0x0289, B:129:0x028d, B:126:0x0292, B:134:0x0297, B:135:0x02b8, B:137:0x02c3, B:140:0x029b, B:142:0x02a5, B:155:0x02d0, B:157:0x02dc, B:158:0x02e8, B:160:0x02f4, B:162:0x031c, B:163:0x033c, B:164:0x0341, B:165:0x0353, B:174:0x035e, B:175:0x035f, B:176:0x0366, B:177:0x036e, B:178:0x0383, B:180:0x03af, B:188:0x04d1, B:189:0x049d, B:215:0x0499, B:229:0x04e8, B:230:0x04f8, B:244:0x03d2, B:247:0x03e5, B:249:0x03f5, B:251:0x040c, B:253:0x0416, B:260:0x04f9, B:262:0x050e, B:265:0x0518, B:267:0x0527, B:269:0x0533, B:271:0x0562, B:272:0x0567, B:273:0x056b, B:275:0x056f, B:276:0x057c, B:279:0x06b5, B:281:0x06bd, B:283:0x06c5, B:286:0x06ca, B:287:0x06d6, B:289:0x06dc, B:291:0x06e4, B:297:0x06f5, B:299:0x06fb, B:301:0x0715, B:303:0x071b, B:296:0x0720, B:310:0x0725, B:312:0x0729, B:314:0x072f, B:316:0x0733, B:318:0x073b, B:320:0x0741, B:322:0x074b, B:325:0x0751, B:326:0x0754, B:328:0x075d, B:330:0x076f, B:332:0x0777, B:334:0x077f, B:338:0x0788, B:343:0x07b4, B:348:0x07c0, B:350:0x07ca, B:351:0x07d1, B:353:0x07e3, B:354:0x07f8, B:356:0x07fe, B:360:0x084a, B:361:0x0807, B:363:0x080e, B:366:0x0817, B:368:0x0821, B:373:0x082e, B:375:0x0834, B:383:0x0847, B:391:0x0859, B:393:0x085f, B:397:0x086c, B:399:0x0874, B:401:0x0878, B:402:0x0883, B:404:0x0889, B:405:0x0968, B:408:0x0970, B:410:0x0975, B:412:0x097d, B:414:0x098b, B:416:0x0992, B:420:0x0996, B:422:0x099c, B:424:0x09a5, B:426:0x09ab, B:428:0x09b6, B:429:0x09da, B:431:0x09e0, B:434:0x09e9, B:436:0x09ed, B:440:0x09f6, B:442:0x09fc, B:443:0x0a58, B:445:0x0a5d, B:453:0x0a6d, B:455:0x0a71, B:456:0x0a80, B:457:0x0a79, B:461:0x09bd, B:464:0x09cb, B:465:0x09d2, B:466:0x09d3, B:467:0x0892, B:469:0x0899, B:471:0x089d, B:474:0x0913, B:476:0x091f, B:479:0x08a9, B:481:0x08ad, B:483:0x08bf, B:484:0x08cd, B:486:0x08d9, B:489:0x08e2, B:491:0x08ec, B:496:0x08f7, B:501:0x0923, B:503:0x0929, B:505:0x092d, B:508:0x0936, B:510:0x0944, B:512:0x094c, B:514:0x0956, B:516:0x095b, B:518:0x0960, B:519:0x0965, B:521:0x0852, B:528:0x0589, B:530:0x058f, B:533:0x0595, B:536:0x05a0, B:538:0x05a6, B:541:0x05b4, B:544:0x05ba, B:546:0x05c2, B:550:0x05c5, B:552:0x05cd, B:554:0x05db, B:556:0x060e, B:558:0x0618, B:561:0x0623, B:563:0x062b, B:565:0x062e, B:569:0x0632, B:571:0x0638, B:573:0x0642, B:575:0x064c, B:577:0x065d, B:581:0x0663, B:580:0x066e, B:586:0x0671, B:588:0x067a, B:591:0x067f, B:593:0x0685, B:595:0x068d, B:597:0x0693, B:599:0x0699, B:603:0x06a7, B:604:0x06af, B:606:0x06b2, B:612:0x0579, B:614:0x0a88, B:617:0x0a8f, B:619:0x0a97, B:622:0x0ab5), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:385:0x084a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:407:0x096f  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x09e0 A[Catch: RuntimeException -> 0x0ac7, IOException -> 0x0af1, zzrk -> 0x0af9, zzey -> 0x0b01, zzbu -> 0x0b09, zzpi -> 0x0b20, zzha -> 0x0b29, TryCatch #9 {zzbu -> 0x0b09, zzey -> 0x0b01, zzha -> 0x0b29, zzpi -> 0x0b20, zzrk -> 0x0af9, IOException -> 0x0af1, RuntimeException -> 0x0ac7, blocks: (B:3:0x0006, B:4:0x0011, B:8:0x0016, B:12:0x001c, B:15:0x0023, B:17:0x0027, B:19:0x002b, B:21:0x0031, B:23:0x0037, B:26:0x003e, B:28:0x0047, B:30:0x0055, B:32:0x005c, B:33:0x0066, B:34:0x0079, B:35:0x0090, B:36:0x00ac, B:38:0x00bb, B:39:0x00bf, B:40:0x00d0, B:42:0x00df, B:43:0x00fb, B:44:0x010e, B:45:0x0117, B:47:0x0129, B:48:0x0135, B:49:0x0145, B:50:0x014e, B:53:0x0155, B:55:0x015d, B:57:0x0161, B:59:0x0167, B:61:0x016f, B:63:0x0177, B:65:0x017a, B:70:0x017f, B:79:0x018c, B:81:0x018d, B:84:0x0194, B:86:0x01a2, B:87:0x01a5, B:89:0x01aa, B:91:0x01ba, B:92:0x01bd, B:93:0x01c2, B:95:0x01d9, B:97:0x01dd, B:99:0x01eb, B:102:0x01f5, B:104:0x01fa, B:106:0x0200, B:147:0x0208, B:109:0x0210, B:111:0x0236, B:114:0x023f, B:116:0x0261, B:117:0x0264, B:118:0x026a, B:120:0x026f, B:122:0x027f, B:124:0x0285, B:127:0x0289, B:129:0x028d, B:126:0x0292, B:134:0x0297, B:135:0x02b8, B:137:0x02c3, B:140:0x029b, B:142:0x02a5, B:155:0x02d0, B:157:0x02dc, B:158:0x02e8, B:160:0x02f4, B:162:0x031c, B:163:0x033c, B:164:0x0341, B:165:0x0353, B:174:0x035e, B:175:0x035f, B:176:0x0366, B:177:0x036e, B:178:0x0383, B:180:0x03af, B:188:0x04d1, B:189:0x049d, B:215:0x0499, B:229:0x04e8, B:230:0x04f8, B:244:0x03d2, B:247:0x03e5, B:249:0x03f5, B:251:0x040c, B:253:0x0416, B:260:0x04f9, B:262:0x050e, B:265:0x0518, B:267:0x0527, B:269:0x0533, B:271:0x0562, B:272:0x0567, B:273:0x056b, B:275:0x056f, B:276:0x057c, B:279:0x06b5, B:281:0x06bd, B:283:0x06c5, B:286:0x06ca, B:287:0x06d6, B:289:0x06dc, B:291:0x06e4, B:297:0x06f5, B:299:0x06fb, B:301:0x0715, B:303:0x071b, B:296:0x0720, B:310:0x0725, B:312:0x0729, B:314:0x072f, B:316:0x0733, B:318:0x073b, B:320:0x0741, B:322:0x074b, B:325:0x0751, B:326:0x0754, B:328:0x075d, B:330:0x076f, B:332:0x0777, B:334:0x077f, B:338:0x0788, B:343:0x07b4, B:348:0x07c0, B:350:0x07ca, B:351:0x07d1, B:353:0x07e3, B:354:0x07f8, B:356:0x07fe, B:360:0x084a, B:361:0x0807, B:363:0x080e, B:366:0x0817, B:368:0x0821, B:373:0x082e, B:375:0x0834, B:383:0x0847, B:391:0x0859, B:393:0x085f, B:397:0x086c, B:399:0x0874, B:401:0x0878, B:402:0x0883, B:404:0x0889, B:405:0x0968, B:408:0x0970, B:410:0x0975, B:412:0x097d, B:414:0x098b, B:416:0x0992, B:420:0x0996, B:422:0x099c, B:424:0x09a5, B:426:0x09ab, B:428:0x09b6, B:429:0x09da, B:431:0x09e0, B:434:0x09e9, B:436:0x09ed, B:440:0x09f6, B:442:0x09fc, B:443:0x0a58, B:445:0x0a5d, B:453:0x0a6d, B:455:0x0a71, B:456:0x0a80, B:457:0x0a79, B:461:0x09bd, B:464:0x09cb, B:465:0x09d2, B:466:0x09d3, B:467:0x0892, B:469:0x0899, B:471:0x089d, B:474:0x0913, B:476:0x091f, B:479:0x08a9, B:481:0x08ad, B:483:0x08bf, B:484:0x08cd, B:486:0x08d9, B:489:0x08e2, B:491:0x08ec, B:496:0x08f7, B:501:0x0923, B:503:0x0929, B:505:0x092d, B:508:0x0936, B:510:0x0944, B:512:0x094c, B:514:0x0956, B:516:0x095b, B:518:0x0960, B:519:0x0965, B:521:0x0852, B:528:0x0589, B:530:0x058f, B:533:0x0595, B:536:0x05a0, B:538:0x05a6, B:541:0x05b4, B:544:0x05ba, B:546:0x05c2, B:550:0x05c5, B:552:0x05cd, B:554:0x05db, B:556:0x060e, B:558:0x0618, B:561:0x0623, B:563:0x062b, B:565:0x062e, B:569:0x0632, B:571:0x0638, B:573:0x0642, B:575:0x064c, B:577:0x065d, B:581:0x0663, B:580:0x066e, B:586:0x0671, B:588:0x067a, B:591:0x067f, B:593:0x0685, B:595:0x068d, B:597:0x0693, B:599:0x0699, B:603:0x06a7, B:604:0x06af, B:606:0x06b2, B:612:0x0579, B:614:0x0a88, B:617:0x0a8f, B:619:0x0a97, B:622:0x0ab5), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:436:0x09ed A[Catch: RuntimeException -> 0x0ac7, IOException -> 0x0af1, zzrk -> 0x0af9, zzey -> 0x0b01, zzbu -> 0x0b09, zzpi -> 0x0b20, zzha -> 0x0b29, TryCatch #9 {zzbu -> 0x0b09, zzey -> 0x0b01, zzha -> 0x0b29, zzpi -> 0x0b20, zzrk -> 0x0af9, IOException -> 0x0af1, RuntimeException -> 0x0ac7, blocks: (B:3:0x0006, B:4:0x0011, B:8:0x0016, B:12:0x001c, B:15:0x0023, B:17:0x0027, B:19:0x002b, B:21:0x0031, B:23:0x0037, B:26:0x003e, B:28:0x0047, B:30:0x0055, B:32:0x005c, B:33:0x0066, B:34:0x0079, B:35:0x0090, B:36:0x00ac, B:38:0x00bb, B:39:0x00bf, B:40:0x00d0, B:42:0x00df, B:43:0x00fb, B:44:0x010e, B:45:0x0117, B:47:0x0129, B:48:0x0135, B:49:0x0145, B:50:0x014e, B:53:0x0155, B:55:0x015d, B:57:0x0161, B:59:0x0167, B:61:0x016f, B:63:0x0177, B:65:0x017a, B:70:0x017f, B:79:0x018c, B:81:0x018d, B:84:0x0194, B:86:0x01a2, B:87:0x01a5, B:89:0x01aa, B:91:0x01ba, B:92:0x01bd, B:93:0x01c2, B:95:0x01d9, B:97:0x01dd, B:99:0x01eb, B:102:0x01f5, B:104:0x01fa, B:106:0x0200, B:147:0x0208, B:109:0x0210, B:111:0x0236, B:114:0x023f, B:116:0x0261, B:117:0x0264, B:118:0x026a, B:120:0x026f, B:122:0x027f, B:124:0x0285, B:127:0x0289, B:129:0x028d, B:126:0x0292, B:134:0x0297, B:135:0x02b8, B:137:0x02c3, B:140:0x029b, B:142:0x02a5, B:155:0x02d0, B:157:0x02dc, B:158:0x02e8, B:160:0x02f4, B:162:0x031c, B:163:0x033c, B:164:0x0341, B:165:0x0353, B:174:0x035e, B:175:0x035f, B:176:0x0366, B:177:0x036e, B:178:0x0383, B:180:0x03af, B:188:0x04d1, B:189:0x049d, B:215:0x0499, B:229:0x04e8, B:230:0x04f8, B:244:0x03d2, B:247:0x03e5, B:249:0x03f5, B:251:0x040c, B:253:0x0416, B:260:0x04f9, B:262:0x050e, B:265:0x0518, B:267:0x0527, B:269:0x0533, B:271:0x0562, B:272:0x0567, B:273:0x056b, B:275:0x056f, B:276:0x057c, B:279:0x06b5, B:281:0x06bd, B:283:0x06c5, B:286:0x06ca, B:287:0x06d6, B:289:0x06dc, B:291:0x06e4, B:297:0x06f5, B:299:0x06fb, B:301:0x0715, B:303:0x071b, B:296:0x0720, B:310:0x0725, B:312:0x0729, B:314:0x072f, B:316:0x0733, B:318:0x073b, B:320:0x0741, B:322:0x074b, B:325:0x0751, B:326:0x0754, B:328:0x075d, B:330:0x076f, B:332:0x0777, B:334:0x077f, B:338:0x0788, B:343:0x07b4, B:348:0x07c0, B:350:0x07ca, B:351:0x07d1, B:353:0x07e3, B:354:0x07f8, B:356:0x07fe, B:360:0x084a, B:361:0x0807, B:363:0x080e, B:366:0x0817, B:368:0x0821, B:373:0x082e, B:375:0x0834, B:383:0x0847, B:391:0x0859, B:393:0x085f, B:397:0x086c, B:399:0x0874, B:401:0x0878, B:402:0x0883, B:404:0x0889, B:405:0x0968, B:408:0x0970, B:410:0x0975, B:412:0x097d, B:414:0x098b, B:416:0x0992, B:420:0x0996, B:422:0x099c, B:424:0x09a5, B:426:0x09ab, B:428:0x09b6, B:429:0x09da, B:431:0x09e0, B:434:0x09e9, B:436:0x09ed, B:440:0x09f6, B:442:0x09fc, B:443:0x0a58, B:445:0x0a5d, B:453:0x0a6d, B:455:0x0a71, B:456:0x0a80, B:457:0x0a79, B:461:0x09bd, B:464:0x09cb, B:465:0x09d2, B:466:0x09d3, B:467:0x0892, B:469:0x0899, B:471:0x089d, B:474:0x0913, B:476:0x091f, B:479:0x08a9, B:481:0x08ad, B:483:0x08bf, B:484:0x08cd, B:486:0x08d9, B:489:0x08e2, B:491:0x08ec, B:496:0x08f7, B:501:0x0923, B:503:0x0929, B:505:0x092d, B:508:0x0936, B:510:0x0944, B:512:0x094c, B:514:0x0956, B:516:0x095b, B:518:0x0960, B:519:0x0965, B:521:0x0852, B:528:0x0589, B:530:0x058f, B:533:0x0595, B:536:0x05a0, B:538:0x05a6, B:541:0x05b4, B:544:0x05ba, B:546:0x05c2, B:550:0x05c5, B:552:0x05cd, B:554:0x05db, B:556:0x060e, B:558:0x0618, B:561:0x0623, B:563:0x062b, B:565:0x062e, B:569:0x0632, B:571:0x0638, B:573:0x0642, B:575:0x064c, B:577:0x065d, B:581:0x0663, B:580:0x066e, B:586:0x0671, B:588:0x067a, B:591:0x067f, B:593:0x0685, B:595:0x068d, B:597:0x0693, B:599:0x0699, B:603:0x06a7, B:604:0x06af, B:606:0x06b2, B:612:0x0579, B:614:0x0a88, B:617:0x0a8f, B:619:0x0a97, B:622:0x0ab5), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:442:0x09fc A[Catch: RuntimeException -> 0x0ac7, IOException -> 0x0af1, zzrk -> 0x0af9, zzey -> 0x0b01, zzbu -> 0x0b09, zzpi -> 0x0b20, zzha -> 0x0b29, TryCatch #9 {zzbu -> 0x0b09, zzey -> 0x0b01, zzha -> 0x0b29, zzpi -> 0x0b20, zzrk -> 0x0af9, IOException -> 0x0af1, RuntimeException -> 0x0ac7, blocks: (B:3:0x0006, B:4:0x0011, B:8:0x0016, B:12:0x001c, B:15:0x0023, B:17:0x0027, B:19:0x002b, B:21:0x0031, B:23:0x0037, B:26:0x003e, B:28:0x0047, B:30:0x0055, B:32:0x005c, B:33:0x0066, B:34:0x0079, B:35:0x0090, B:36:0x00ac, B:38:0x00bb, B:39:0x00bf, B:40:0x00d0, B:42:0x00df, B:43:0x00fb, B:44:0x010e, B:45:0x0117, B:47:0x0129, B:48:0x0135, B:49:0x0145, B:50:0x014e, B:53:0x0155, B:55:0x015d, B:57:0x0161, B:59:0x0167, B:61:0x016f, B:63:0x0177, B:65:0x017a, B:70:0x017f, B:79:0x018c, B:81:0x018d, B:84:0x0194, B:86:0x01a2, B:87:0x01a5, B:89:0x01aa, B:91:0x01ba, B:92:0x01bd, B:93:0x01c2, B:95:0x01d9, B:97:0x01dd, B:99:0x01eb, B:102:0x01f5, B:104:0x01fa, B:106:0x0200, B:147:0x0208, B:109:0x0210, B:111:0x0236, B:114:0x023f, B:116:0x0261, B:117:0x0264, B:118:0x026a, B:120:0x026f, B:122:0x027f, B:124:0x0285, B:127:0x0289, B:129:0x028d, B:126:0x0292, B:134:0x0297, B:135:0x02b8, B:137:0x02c3, B:140:0x029b, B:142:0x02a5, B:155:0x02d0, B:157:0x02dc, B:158:0x02e8, B:160:0x02f4, B:162:0x031c, B:163:0x033c, B:164:0x0341, B:165:0x0353, B:174:0x035e, B:175:0x035f, B:176:0x0366, B:177:0x036e, B:178:0x0383, B:180:0x03af, B:188:0x04d1, B:189:0x049d, B:215:0x0499, B:229:0x04e8, B:230:0x04f8, B:244:0x03d2, B:247:0x03e5, B:249:0x03f5, B:251:0x040c, B:253:0x0416, B:260:0x04f9, B:262:0x050e, B:265:0x0518, B:267:0x0527, B:269:0x0533, B:271:0x0562, B:272:0x0567, B:273:0x056b, B:275:0x056f, B:276:0x057c, B:279:0x06b5, B:281:0x06bd, B:283:0x06c5, B:286:0x06ca, B:287:0x06d6, B:289:0x06dc, B:291:0x06e4, B:297:0x06f5, B:299:0x06fb, B:301:0x0715, B:303:0x071b, B:296:0x0720, B:310:0x0725, B:312:0x0729, B:314:0x072f, B:316:0x0733, B:318:0x073b, B:320:0x0741, B:322:0x074b, B:325:0x0751, B:326:0x0754, B:328:0x075d, B:330:0x076f, B:332:0x0777, B:334:0x077f, B:338:0x0788, B:343:0x07b4, B:348:0x07c0, B:350:0x07ca, B:351:0x07d1, B:353:0x07e3, B:354:0x07f8, B:356:0x07fe, B:360:0x084a, B:361:0x0807, B:363:0x080e, B:366:0x0817, B:368:0x0821, B:373:0x082e, B:375:0x0834, B:383:0x0847, B:391:0x0859, B:393:0x085f, B:397:0x086c, B:399:0x0874, B:401:0x0878, B:402:0x0883, B:404:0x0889, B:405:0x0968, B:408:0x0970, B:410:0x0975, B:412:0x097d, B:414:0x098b, B:416:0x0992, B:420:0x0996, B:422:0x099c, B:424:0x09a5, B:426:0x09ab, B:428:0x09b6, B:429:0x09da, B:431:0x09e0, B:434:0x09e9, B:436:0x09ed, B:440:0x09f6, B:442:0x09fc, B:443:0x0a58, B:445:0x0a5d, B:453:0x0a6d, B:455:0x0a71, B:456:0x0a80, B:457:0x0a79, B:461:0x09bd, B:464:0x09cb, B:465:0x09d2, B:466:0x09d3, B:467:0x0892, B:469:0x0899, B:471:0x089d, B:474:0x0913, B:476:0x091f, B:479:0x08a9, B:481:0x08ad, B:483:0x08bf, B:484:0x08cd, B:486:0x08d9, B:489:0x08e2, B:491:0x08ec, B:496:0x08f7, B:501:0x0923, B:503:0x0929, B:505:0x092d, B:508:0x0936, B:510:0x0944, B:512:0x094c, B:514:0x0956, B:516:0x095b, B:518:0x0960, B:519:0x0965, B:521:0x0852, B:528:0x0589, B:530:0x058f, B:533:0x0595, B:536:0x05a0, B:538:0x05a6, B:541:0x05b4, B:544:0x05ba, B:546:0x05c2, B:550:0x05c5, B:552:0x05cd, B:554:0x05db, B:556:0x060e, B:558:0x0618, B:561:0x0623, B:563:0x062b, B:565:0x062e, B:569:0x0632, B:571:0x0638, B:573:0x0642, B:575:0x064c, B:577:0x065d, B:581:0x0663, B:580:0x066e, B:586:0x0671, B:588:0x067a, B:591:0x067f, B:593:0x0685, B:595:0x068d, B:597:0x0693, B:599:0x0699, B:603:0x06a7, B:604:0x06af, B:606:0x06b2, B:612:0x0579, B:614:0x0a88, B:617:0x0a8f, B:619:0x0a97, B:622:0x0ab5), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0a5d A[Catch: RuntimeException -> 0x0ac7, IOException -> 0x0af1, zzrk -> 0x0af9, zzey -> 0x0b01, zzbu -> 0x0b09, zzpi -> 0x0b20, zzha -> 0x0b29, TryCatch #9 {zzbu -> 0x0b09, zzey -> 0x0b01, zzha -> 0x0b29, zzpi -> 0x0b20, zzrk -> 0x0af9, IOException -> 0x0af1, RuntimeException -> 0x0ac7, blocks: (B:3:0x0006, B:4:0x0011, B:8:0x0016, B:12:0x001c, B:15:0x0023, B:17:0x0027, B:19:0x002b, B:21:0x0031, B:23:0x0037, B:26:0x003e, B:28:0x0047, B:30:0x0055, B:32:0x005c, B:33:0x0066, B:34:0x0079, B:35:0x0090, B:36:0x00ac, B:38:0x00bb, B:39:0x00bf, B:40:0x00d0, B:42:0x00df, B:43:0x00fb, B:44:0x010e, B:45:0x0117, B:47:0x0129, B:48:0x0135, B:49:0x0145, B:50:0x014e, B:53:0x0155, B:55:0x015d, B:57:0x0161, B:59:0x0167, B:61:0x016f, B:63:0x0177, B:65:0x017a, B:70:0x017f, B:79:0x018c, B:81:0x018d, B:84:0x0194, B:86:0x01a2, B:87:0x01a5, B:89:0x01aa, B:91:0x01ba, B:92:0x01bd, B:93:0x01c2, B:95:0x01d9, B:97:0x01dd, B:99:0x01eb, B:102:0x01f5, B:104:0x01fa, B:106:0x0200, B:147:0x0208, B:109:0x0210, B:111:0x0236, B:114:0x023f, B:116:0x0261, B:117:0x0264, B:118:0x026a, B:120:0x026f, B:122:0x027f, B:124:0x0285, B:127:0x0289, B:129:0x028d, B:126:0x0292, B:134:0x0297, B:135:0x02b8, B:137:0x02c3, B:140:0x029b, B:142:0x02a5, B:155:0x02d0, B:157:0x02dc, B:158:0x02e8, B:160:0x02f4, B:162:0x031c, B:163:0x033c, B:164:0x0341, B:165:0x0353, B:174:0x035e, B:175:0x035f, B:176:0x0366, B:177:0x036e, B:178:0x0383, B:180:0x03af, B:188:0x04d1, B:189:0x049d, B:215:0x0499, B:229:0x04e8, B:230:0x04f8, B:244:0x03d2, B:247:0x03e5, B:249:0x03f5, B:251:0x040c, B:253:0x0416, B:260:0x04f9, B:262:0x050e, B:265:0x0518, B:267:0x0527, B:269:0x0533, B:271:0x0562, B:272:0x0567, B:273:0x056b, B:275:0x056f, B:276:0x057c, B:279:0x06b5, B:281:0x06bd, B:283:0x06c5, B:286:0x06ca, B:287:0x06d6, B:289:0x06dc, B:291:0x06e4, B:297:0x06f5, B:299:0x06fb, B:301:0x0715, B:303:0x071b, B:296:0x0720, B:310:0x0725, B:312:0x0729, B:314:0x072f, B:316:0x0733, B:318:0x073b, B:320:0x0741, B:322:0x074b, B:325:0x0751, B:326:0x0754, B:328:0x075d, B:330:0x076f, B:332:0x0777, B:334:0x077f, B:338:0x0788, B:343:0x07b4, B:348:0x07c0, B:350:0x07ca, B:351:0x07d1, B:353:0x07e3, B:354:0x07f8, B:356:0x07fe, B:360:0x084a, B:361:0x0807, B:363:0x080e, B:366:0x0817, B:368:0x0821, B:373:0x082e, B:375:0x0834, B:383:0x0847, B:391:0x0859, B:393:0x085f, B:397:0x086c, B:399:0x0874, B:401:0x0878, B:402:0x0883, B:404:0x0889, B:405:0x0968, B:408:0x0970, B:410:0x0975, B:412:0x097d, B:414:0x098b, B:416:0x0992, B:420:0x0996, B:422:0x099c, B:424:0x09a5, B:426:0x09ab, B:428:0x09b6, B:429:0x09da, B:431:0x09e0, B:434:0x09e9, B:436:0x09ed, B:440:0x09f6, B:442:0x09fc, B:443:0x0a58, B:445:0x0a5d, B:453:0x0a6d, B:455:0x0a71, B:456:0x0a80, B:457:0x0a79, B:461:0x09bd, B:464:0x09cb, B:465:0x09d2, B:466:0x09d3, B:467:0x0892, B:469:0x0899, B:471:0x089d, B:474:0x0913, B:476:0x091f, B:479:0x08a9, B:481:0x08ad, B:483:0x08bf, B:484:0x08cd, B:486:0x08d9, B:489:0x08e2, B:491:0x08ec, B:496:0x08f7, B:501:0x0923, B:503:0x0929, B:505:0x092d, B:508:0x0936, B:510:0x0944, B:512:0x094c, B:514:0x0956, B:516:0x095b, B:518:0x0960, B:519:0x0965, B:521:0x0852, B:528:0x0589, B:530:0x058f, B:533:0x0595, B:536:0x05a0, B:538:0x05a6, B:541:0x05b4, B:544:0x05ba, B:546:0x05c2, B:550:0x05c5, B:552:0x05cd, B:554:0x05db, B:556:0x060e, B:558:0x0618, B:561:0x0623, B:563:0x062b, B:565:0x062e, B:569:0x0632, B:571:0x0638, B:573:0x0642, B:575:0x064c, B:577:0x065d, B:581:0x0663, B:580:0x066e, B:586:0x0671, B:588:0x067a, B:591:0x067f, B:593:0x0685, B:595:0x068d, B:597:0x0693, B:599:0x0699, B:603:0x06a7, B:604:0x06af, B:606:0x06b2, B:612:0x0579, B:614:0x0a88, B:617:0x0a8f, B:619:0x0a97, B:622:0x0ab5), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0a52  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x091f A[Catch: RuntimeException -> 0x0ac7, IOException -> 0x0af1, zzrk -> 0x0af9, zzey -> 0x0b01, zzbu -> 0x0b09, zzpi -> 0x0b20, zzha -> 0x0b29, TryCatch #9 {zzbu -> 0x0b09, zzey -> 0x0b01, zzha -> 0x0b29, zzpi -> 0x0b20, zzrk -> 0x0af9, IOException -> 0x0af1, RuntimeException -> 0x0ac7, blocks: (B:3:0x0006, B:4:0x0011, B:8:0x0016, B:12:0x001c, B:15:0x0023, B:17:0x0027, B:19:0x002b, B:21:0x0031, B:23:0x0037, B:26:0x003e, B:28:0x0047, B:30:0x0055, B:32:0x005c, B:33:0x0066, B:34:0x0079, B:35:0x0090, B:36:0x00ac, B:38:0x00bb, B:39:0x00bf, B:40:0x00d0, B:42:0x00df, B:43:0x00fb, B:44:0x010e, B:45:0x0117, B:47:0x0129, B:48:0x0135, B:49:0x0145, B:50:0x014e, B:53:0x0155, B:55:0x015d, B:57:0x0161, B:59:0x0167, B:61:0x016f, B:63:0x0177, B:65:0x017a, B:70:0x017f, B:79:0x018c, B:81:0x018d, B:84:0x0194, B:86:0x01a2, B:87:0x01a5, B:89:0x01aa, B:91:0x01ba, B:92:0x01bd, B:93:0x01c2, B:95:0x01d9, B:97:0x01dd, B:99:0x01eb, B:102:0x01f5, B:104:0x01fa, B:106:0x0200, B:147:0x0208, B:109:0x0210, B:111:0x0236, B:114:0x023f, B:116:0x0261, B:117:0x0264, B:118:0x026a, B:120:0x026f, B:122:0x027f, B:124:0x0285, B:127:0x0289, B:129:0x028d, B:126:0x0292, B:134:0x0297, B:135:0x02b8, B:137:0x02c3, B:140:0x029b, B:142:0x02a5, B:155:0x02d0, B:157:0x02dc, B:158:0x02e8, B:160:0x02f4, B:162:0x031c, B:163:0x033c, B:164:0x0341, B:165:0x0353, B:174:0x035e, B:175:0x035f, B:176:0x0366, B:177:0x036e, B:178:0x0383, B:180:0x03af, B:188:0x04d1, B:189:0x049d, B:215:0x0499, B:229:0x04e8, B:230:0x04f8, B:244:0x03d2, B:247:0x03e5, B:249:0x03f5, B:251:0x040c, B:253:0x0416, B:260:0x04f9, B:262:0x050e, B:265:0x0518, B:267:0x0527, B:269:0x0533, B:271:0x0562, B:272:0x0567, B:273:0x056b, B:275:0x056f, B:276:0x057c, B:279:0x06b5, B:281:0x06bd, B:283:0x06c5, B:286:0x06ca, B:287:0x06d6, B:289:0x06dc, B:291:0x06e4, B:297:0x06f5, B:299:0x06fb, B:301:0x0715, B:303:0x071b, B:296:0x0720, B:310:0x0725, B:312:0x0729, B:314:0x072f, B:316:0x0733, B:318:0x073b, B:320:0x0741, B:322:0x074b, B:325:0x0751, B:326:0x0754, B:328:0x075d, B:330:0x076f, B:332:0x0777, B:334:0x077f, B:338:0x0788, B:343:0x07b4, B:348:0x07c0, B:350:0x07ca, B:351:0x07d1, B:353:0x07e3, B:354:0x07f8, B:356:0x07fe, B:360:0x084a, B:361:0x0807, B:363:0x080e, B:366:0x0817, B:368:0x0821, B:373:0x082e, B:375:0x0834, B:383:0x0847, B:391:0x0859, B:393:0x085f, B:397:0x086c, B:399:0x0874, B:401:0x0878, B:402:0x0883, B:404:0x0889, B:405:0x0968, B:408:0x0970, B:410:0x0975, B:412:0x097d, B:414:0x098b, B:416:0x0992, B:420:0x0996, B:422:0x099c, B:424:0x09a5, B:426:0x09ab, B:428:0x09b6, B:429:0x09da, B:431:0x09e0, B:434:0x09e9, B:436:0x09ed, B:440:0x09f6, B:442:0x09fc, B:443:0x0a58, B:445:0x0a5d, B:453:0x0a6d, B:455:0x0a71, B:456:0x0a80, B:457:0x0a79, B:461:0x09bd, B:464:0x09cb, B:465:0x09d2, B:466:0x09d3, B:467:0x0892, B:469:0x0899, B:471:0x089d, B:474:0x0913, B:476:0x091f, B:479:0x08a9, B:481:0x08ad, B:483:0x08bf, B:484:0x08cd, B:486:0x08d9, B:489:0x08e2, B:491:0x08ec, B:496:0x08f7, B:501:0x0923, B:503:0x0929, B:505:0x092d, B:508:0x0936, B:510:0x0944, B:512:0x094c, B:514:0x0956, B:516:0x095b, B:518:0x0960, B:519:0x0965, B:521:0x0852, B:528:0x0589, B:530:0x058f, B:533:0x0595, B:536:0x05a0, B:538:0x05a6, B:541:0x05b4, B:544:0x05ba, B:546:0x05c2, B:550:0x05c5, B:552:0x05cd, B:554:0x05db, B:556:0x060e, B:558:0x0618, B:561:0x0623, B:563:0x062b, B:565:0x062e, B:569:0x0632, B:571:0x0638, B:573:0x0642, B:575:0x064c, B:577:0x065d, B:581:0x0663, B:580:0x066e, B:586:0x0671, B:588:0x067a, B:591:0x067f, B:593:0x0685, B:595:0x068d, B:597:0x0693, B:599:0x0699, B:603:0x06a7, B:604:0x06af, B:606:0x06b2, B:612:0x0579, B:614:0x0a88, B:617:0x0a8f, B:619:0x0a97, B:622:0x0ab5), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0a85  */
    /* JADX WARN: Type inference failed for: r2v26, types: [com.google.android.gms.internal.ads.zzfz, com.google.android.gms.internal.ads.zzwh] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        boolean z;
        zzjj zze;
        int i;
        int i2;
        long j;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        zzju zzjuVar;
        boolean z5;
        boolean z6;
        long j2;
        int i4;
        boolean z7;
        zzjj zze2;
        boolean z8;
        zzjj zzd;
        zzjj zzg;
        zzjj zza;
        boolean z9;
        int i5;
        zzjk zzf;
        long j3;
        zzsi zzsiVar;
        boolean z10;
        long j4;
        long j5;
        Throwable th;
        Throwable th2;
        boolean z11;
        long j6;
        long j7;
        long zzv;
        zzju zzjuVar2;
        int i6;
        zzju zzz;
        int i7;
        int i8;
        List list;
        zzuc zzucVar;
        List list2;
        zzuc zzucVar2;
        int i9;
        long j8;
        List list3;
        zzuc zzucVar3;
        try {
            i = -1;
        } catch (zzbu e) {
            zzD(e, e.zzb == 1 ? true != e.zza ? 3003 : 3001 : 1000);
        } catch (zzey e2) {
            zzD(e2, e2.zza);
        } catch (zzha e3) {
            zzha zzhaVar = e3;
            if (zzhaVar.zze == 1 && (zze = this.zzq.zze()) != null) {
                zzhaVar = zzhaVar.zza(zze.zzf.zza);
            }
            if (zzhaVar.zzk && this.zzL == null) {
                zzdw.zzf("ExoPlayerImplInternal", "Recoverable renderer error", zzhaVar);
                this.zzL = zzhaVar;
                zzdn zzdnVar = this.zzh;
                zzdnVar.zzj(zzdnVar.zzb(25, zzhaVar));
            } else {
                zzha zzhaVar2 = this.zzL;
                if (zzhaVar2 != null) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(zzhaVar2, zzhaVar);
                    } catch (Exception unused) {
                    }
                    zzhaVar = this.zzL;
                }
                zzdw.zzc("ExoPlayerImplInternal", "Playback error", zzhaVar);
                z = true;
                zzU(true, false);
                this.zzu = this.zzu.zzd(zzhaVar);
            }
        } catch (zzpi e4) {
            zzD(e4, e4.zza);
        } catch (zzrk e5) {
            zzD(e5, PointerIconCompat.TYPE_HAND);
        } catch (IOException e6) {
            zzD(e6, 2000);
        } catch (RuntimeException e7) {
            zzha zzd2 = zzha.zzd(e7, ((e7 instanceof IllegalStateException) || (e7 instanceof IllegalArgumentException)) ? 1004 : 1000);
            zzdw.zzc("ExoPlayerImplInternal", "Playback error", zzd2);
            zzU(true, false);
            this.zzu = this.zzu.zzd(zzd2);
        }
        switch (message.what) {
            case 0:
                this.zzv.zza(1);
                zzK(false, false, false, true);
                this.zzf.zzb();
                zzS(true != this.zzu.zza.zzo() ? 2 : 4);
                this.zzr.zzf(this.zzg);
                this.zzh.zzh(2);
                z = true;
                zzJ();
                return z;
            case 1:
                zzR(message.arg1 != 0, message.arg2, true, 1);
                z = true;
                zzJ();
                return z;
            case 2:
                long uptimeMillis = SystemClock.uptimeMillis();
                this.zzh.zze(2);
                if (!this.zzu.zza.zzo() && this.zzr.zzi()) {
                    this.zzq.zzk(this.zzI);
                    if (this.zzq.zzn() && (zzf = this.zzq.zzf(this.zzI, this.zzu)) != null) {
                        zzjj zzr = this.zzq.zzr(this.zzc, this.zzd, this.zzf.zzi(), this.zzr, zzf, this.zze);
                        zzr.zza.zzl(this, zzf.zzb);
                        if (this.zzq.zzd() == zzr) {
                            zzM(zzf.zzb);
                        }
                        zzE(false);
                    }
                    if (this.zzA) {
                        this.zzA = zzab();
                        zzW();
                    } else {
                        zzI();
                    }
                    zzjj zze3 = this.zzq.zze();
                    if (zze3 != null) {
                        if (zze3.zzg() != null && !this.zzy) {
                            zzjj zze4 = this.zzq.zze();
                            if (zze4.zzd) {
                                int i10 = 0;
                                while (true) {
                                    zzka[] zzkaVarArr = this.zza;
                                    int length = zzkaVarArr.length;
                                    if (i10 < 2) {
                                        zzka zzkaVar = zzkaVarArr[i10];
                                        zztz zztzVar = zze4.zzc[i10];
                                        if (zzkaVar.zzm() == zztzVar) {
                                            if (zztzVar == null || zzkaVar.zzG()) {
                                                i10++;
                                            } else {
                                                zze4.zzg();
                                                boolean z12 = zze4.zzf.zzf;
                                            }
                                        }
                                    } else if (zze3.zzg().zzd || this.zzI >= zze3.zzg().zzf()) {
                                        zzwa zzi = zze3.zzi();
                                        zzjj zzb = this.zzq.zzb();
                                        zzwa zzi2 = zzb.zzi();
                                        zzcn zzcnVar = this.zzu.zza;
                                        j = uptimeMillis;
                                        zzZ(zzcnVar, zzb.zzf.zza, zzcnVar, zze3.zzf.zza, -9223372036854775807L);
                                        if (!zzb.zzd || zzb.zza.zzd() == -9223372036854775807L) {
                                            int i11 = 0;
                                            while (true) {
                                                int length2 = this.zza.length;
                                                if (i11 < 2) {
                                                    boolean zzb2 = zzi.zzb(i11);
                                                    boolean zzb3 = zzi2.zzb(i11);
                                                    if (zzb2 && !this.zza[i11].zzH()) {
                                                        this.zzc[i11].zzb();
                                                        zzkc zzkcVar = zzi.zzb[i11];
                                                        zzkc zzkcVar2 = zzi2.zzb[i11];
                                                        if (!zzb3 || !zzkcVar2.equals(zzkcVar)) {
                                                            zzak(this.zza[i11], zzb.zzf());
                                                        }
                                                    }
                                                    i11++;
                                                }
                                            }
                                        } else {
                                            long zzf2 = zzb.zzf();
                                            zzka[] zzkaVarArr2 = this.zza;
                                            int length3 = zzkaVarArr2.length;
                                            for (int i12 = 0; i12 < 2; i12++) {
                                                zzka zzkaVar2 = zzkaVarArr2[i12];
                                                if (zzkaVar2.zzm() != null) {
                                                    zzak(zzkaVar2, zzf2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        j = uptimeMillis;
                        if (zze3.zzf.zzi || this.zzy) {
                            int i13 = 0;
                            while (true) {
                                zzka[] zzkaVarArr3 = this.zza;
                                int length4 = zzkaVarArr3.length;
                                if (i13 < 2) {
                                    zzka zzkaVar3 = zzkaVarArr3[i13];
                                    zztz zztzVar2 = zze3.zzc[i13];
                                    if (zztzVar2 != null && zzkaVar3.zzm() == zztzVar2 && zzkaVar3.zzG()) {
                                        long j9 = zze3.zzf.zze;
                                        zzak(zzkaVar3, (j9 == -9223372036854775807L || j9 == Long.MIN_VALUE) ? -9223372036854775807L : zze3.zze() + j9);
                                    }
                                    i13++;
                                }
                            }
                        }
                        zze2 = this.zzq.zze();
                        if (zze2 != null && this.zzq.zzd() != zze2 && !zze2.zzg) {
                            zzjj zze5 = this.zzq.zze();
                            zzwa zzi3 = zze5.zzi();
                            i5 = 0;
                            boolean z13 = false;
                            while (true) {
                                zzka[] zzkaVarArr4 = this.zza;
                                int length5 = zzkaVarArr4.length;
                                if (i5 >= 2) {
                                    zzka zzkaVar4 = zzkaVarArr4[i5];
                                    if (zzac(zzkaVar4)) {
                                        zztz zzm = zzkaVar4.zzm();
                                        zztz zztzVar3 = zze5.zzc[i5];
                                        if (!zzi3.zzb(i5) || zzm != zztzVar3) {
                                            if (!zzkaVar4.zzH()) {
                                                zzkaVar4.zzz(zzah(zzi3.zzc[i5]), zze5.zzc[i5], zze5.zzf(), zze5.zze());
                                            } else if (zzkaVar4.zzM()) {
                                                zzA(zzkaVar4);
                                            } else {
                                                z13 = true;
                                            }
                                        }
                                    }
                                    i5++;
                                } else if (!z13) {
                                    zzB();
                                }
                            }
                        }
                        z8 = false;
                        while (zzaf() && !this.zzy && (zzd = this.zzq.zzd()) != null && (zzg = zzd.zzg()) != null && this.zzI >= zzg.zzf() && zzg.zzg) {
                            if (z8) {
                                zzJ();
                            }
                            zza = this.zzq.zza();
                            Objects.requireNonNull(zza);
                            if (this.zzu.zzb.zza.equals(zza.zzf.zza.zza)) {
                                zzsi zzsiVar2 = this.zzu.zzb;
                                if (zzsiVar2.zzb == i) {
                                    zzsi zzsiVar3 = zza.zzf.zza;
                                    if (zzsiVar3.zzb == i && zzsiVar2.zze != zzsiVar3.zze) {
                                        z9 = true;
                                        zzjk zzjkVar = zza.zzf;
                                        zzsi zzsiVar4 = zzjkVar.zza;
                                        long j10 = zzjkVar.zzb;
                                        this.zzu = zzz(zzsiVar4, j10, zzjkVar.zzc, j10, !z9, 0);
                                        zzL();
                                        zzY();
                                        i = i;
                                        z8 = true;
                                    }
                                }
                            }
                            z9 = false;
                            zzjk zzjkVar2 = zza.zzf;
                            zzsi zzsiVar42 = zzjkVar2.zza;
                            long j102 = zzjkVar2.zzb;
                            this.zzu = zzz(zzsiVar42, j102, zzjkVar2.zzc, j102, !z9, 0);
                            zzL();
                            zzY();
                            i = i;
                            z8 = true;
                        }
                        i2 = 3;
                        i3 = this.zzu.zze;
                        if (i3 == 1) {
                            z = true;
                            zzJ();
                            return z;
                        }
                        if (i3 != 4) {
                            zzjj zzd3 = this.zzq.zzd();
                            if (zzd3 == null) {
                                zzO(j, 10L);
                            } else {
                                long j11 = j;
                                int i14 = zzen.zza;
                                Trace.beginSection("doSomeWork");
                                zzY();
                                if (zzd3.zzd) {
                                    long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
                                    zzd3.zza.zzj(this.zzu.zzr - this.zzm, false);
                                    z2 = true;
                                    z3 = true;
                                    int i15 = 0;
                                    while (true) {
                                        zzka[] zzkaVarArr5 = this.zza;
                                        int length6 = zzkaVarArr5.length;
                                        if (i15 < 2) {
                                            zzka zzkaVar5 = zzkaVarArr5[i15];
                                            if (zzac(zzkaVar5)) {
                                                zzkaVar5.zzL(this.zzI, elapsedRealtime);
                                                z3 = z3 && zzkaVar5.zzM();
                                                zztz zztzVar4 = zzd3.zzc[i15];
                                                zztz zzm2 = zzkaVar5.zzm();
                                                boolean z14 = zztzVar4 == zzm2 && zzkaVar5.zzG();
                                                if (zztzVar4 == zzm2 && !z14 && !zzkaVar5.zzN() && !zzkaVar5.zzM()) {
                                                    z7 = false;
                                                    z2 = !z2 && z7;
                                                    if (z7) {
                                                        zzkaVar5.zzr();
                                                    }
                                                }
                                                z7 = true;
                                                if (z2) {
                                                }
                                                if (z7) {
                                                }
                                            }
                                            i15++;
                                        }
                                    }
                                } else {
                                    zzd3.zza.zzk();
                                    z2 = true;
                                    z3 = true;
                                }
                                long j12 = zzd3.zzf.zze;
                                if (z3 && zzd3.zzd && (j12 == -9223372036854775807L || j12 <= this.zzu.zzr)) {
                                    if (this.zzy) {
                                        this.zzy = false;
                                        zzR(false, this.zzu.zzm, false, 5);
                                    }
                                    if (zzd3.zzf.zzi) {
                                        zzS(4);
                                        zzV();
                                        int i16 = 2;
                                        if (this.zzu.zze == 2) {
                                            int i17 = 0;
                                            while (true) {
                                                zzka[] zzkaVarArr6 = this.zza;
                                                int length7 = zzkaVarArr6.length;
                                                if (i17 < i16) {
                                                    if (zzac(zzkaVarArr6[i17]) && this.zza[i17].zzm() == zzd3.zzc[i17]) {
                                                        this.zza[i17].zzr();
                                                    }
                                                    i17++;
                                                    i16 = 2;
                                                } else {
                                                    zzju zzjuVar3 = this.zzu;
                                                    if (!zzjuVar3.zzg && zzjuVar3.zzq < 500000 && zzab()) {
                                                        if (this.zzM == -9223372036854775807L) {
                                                            this.zzM = SystemClock.elapsedRealtime();
                                                        } else if (SystemClock.elapsedRealtime() - this.zzM >= 4000) {
                                                            throw new IllegalStateException("Playback stuck buffering and not loading");
                                                        }
                                                        boolean z15 = !zzaf() && this.zzu.zze == i2;
                                                        z4 = !this.zzF && this.zzE && z15;
                                                        zzjuVar = this.zzu;
                                                        if (zzjuVar.zzo == z4) {
                                                            j2 = j11;
                                                            z5 = z15;
                                                            z6 = z4;
                                                            this.zzu = new zzju(zzjuVar.zza, zzjuVar.zzb, zzjuVar.zzc, zzjuVar.zzd, zzjuVar.zze, zzjuVar.zzf, zzjuVar.zzg, zzjuVar.zzh, zzjuVar.zzi, zzjuVar.zzj, zzjuVar.zzk, zzjuVar.zzl, zzjuVar.zzm, zzjuVar.zzn, zzjuVar.zzp, zzjuVar.zzq, zzjuVar.zzr, z6);
                                                        } else {
                                                            z5 = z15;
                                                            z6 = z4;
                                                            j2 = j11;
                                                        }
                                                        this.zzE = false;
                                                        if (!z6 && (i4 = this.zzu.zze) != 4) {
                                                            if (!z5 && i4 != 2) {
                                                                if (i4 == 3 && this.zzG != 0) {
                                                                    zzO(j2, 1000L);
                                                                }
                                                                Trace.endSection();
                                                            }
                                                            zzO(j2, 10L);
                                                            Trace.endSection();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        this.zzM = -9223372036854775807L;
                                        if (zzaf()) {
                                        }
                                        if (this.zzF) {
                                        }
                                        zzjuVar = this.zzu;
                                        if (zzjuVar.zzo == z4) {
                                        }
                                        this.zzE = false;
                                        if (!z6) {
                                            if (!z5) {
                                                if (i4 == 3) {
                                                    zzO(j2, 1000L);
                                                }
                                                Trace.endSection();
                                            }
                                            zzO(j2, 10L);
                                            Trace.endSection();
                                        }
                                    }
                                }
                                zzju zzjuVar4 = this.zzu;
                                if (zzjuVar4.zze == 2) {
                                    if (this.zzG == 0) {
                                        if (zzad()) {
                                            zzS(i2);
                                            this.zzL = null;
                                            if (zzaf()) {
                                                zzT();
                                            }
                                        }
                                    } else if (z2) {
                                        if (zzjuVar4.zzg) {
                                            long zzb4 = zzag(zzjuVar4.zza, this.zzq.zzd().zzf.zza) ? this.zzO.zzb() : -9223372036854775807L;
                                            zzjj zzc = this.zzq.zzc();
                                            boolean z16 = zzc.zzr() && zzc.zzf.zzi;
                                            boolean z17 = zzc.zzf.zza.zzb() && !zzc.zzd;
                                            if (!z16) {
                                                if (!z17) {
                                                    break;
                                                }
                                            }
                                        }
                                        zzS(i2);
                                        this.zzL = null;
                                        if (zzaf()) {
                                        }
                                    }
                                    int i162 = 2;
                                    if (this.zzu.zze == 2) {
                                    }
                                    this.zzM = -9223372036854775807L;
                                    if (zzaf()) {
                                    }
                                    if (this.zzF) {
                                    }
                                    zzjuVar = this.zzu;
                                    if (zzjuVar.zzo == z4) {
                                    }
                                    this.zzE = false;
                                    if (!z6) {
                                    }
                                }
                                if (this.zzu.zze == i2) {
                                    if (this.zzG == 0) {
                                        if (!zzad()) {
                                            this.zzz = zzaf();
                                            zzS(2);
                                            if (this.zzz) {
                                                for (zzjj zzd4 = this.zzq.zzd(); zzd4 != null; zzd4 = zzd4.zzg()) {
                                                    for (zzvt zzvtVar : zzd4.zzi().zzc) {
                                                    }
                                                }
                                                this.zzO.zzc();
                                            }
                                            zzV();
                                        }
                                    }
                                }
                                int i1622 = 2;
                                if (this.zzu.zze == 2) {
                                }
                                this.zzM = -9223372036854775807L;
                                if (zzaf()) {
                                }
                                if (this.zzF) {
                                }
                                zzjuVar = this.zzu;
                                if (zzjuVar.zzo == z4) {
                                }
                                this.zzE = false;
                                if (!z6) {
                                }
                            }
                        }
                        z = true;
                        zzJ();
                        return z;
                    }
                    j = uptimeMillis;
                    zze2 = this.zzq.zze();
                    if (zze2 != null) {
                        zzjj zze52 = this.zzq.zze();
                        zzwa zzi32 = zze52.zzi();
                        i5 = 0;
                        boolean z132 = false;
                        while (true) {
                            zzka[] zzkaVarArr42 = this.zza;
                            int length52 = zzkaVarArr42.length;
                            if (i5 >= 2) {
                            }
                            i5++;
                        }
                    }
                    z8 = false;
                    while (zzaf()) {
                        if (z8) {
                        }
                        zza = this.zzq.zza();
                        Objects.requireNonNull(zza);
                        if (this.zzu.zzb.zza.equals(zza.zzf.zza.zza)) {
                        }
                        z9 = false;
                        zzjk zzjkVar22 = zza.zzf;
                        zzsi zzsiVar422 = zzjkVar22.zza;
                        long j1022 = zzjkVar22.zzb;
                        this.zzu = zzz(zzsiVar422, j1022, zzjkVar22.zzc, j1022, !z9, 0);
                        zzL();
                        zzY();
                        i = i;
                        z8 = true;
                    }
                    i2 = 3;
                    i3 = this.zzu.zze;
                    if (i3 == 1) {
                    }
                }
                i2 = 3;
                j = uptimeMillis;
                i3 = this.zzu.zze;
                if (i3 == 1) {
                }
                break;
            case 3:
                zzjc zzjcVar = (zzjc) message.obj;
                this.zzv.zza(1);
                Pair zzy = zzy(this.zzu.zza, zzjcVar, true, this.zzB, this.zzC, this.zzk, this.zzl);
                if (zzy == null) {
                    Pair zzx = zzx(this.zzu.zza);
                    zzsiVar = (zzsi) zzx.first;
                    long longValue = ((Long) zzx.second).longValue();
                    j3 = -9223372036854775807L;
                    z10 = !this.zzu.zza.zzo();
                    j4 = longValue;
                } else {
                    Object obj = zzy.first;
                    long longValue2 = ((Long) zzy.second).longValue();
                    j3 = zzjcVar.zzc == -9223372036854775807L ? -9223372036854775807L : longValue2;
                    zzsi zzh = this.zzq.zzh(this.zzu.zza, obj, longValue2);
                    if (zzh.zzb()) {
                        this.zzu.zza.zzn(zzh.zza, this.zzl);
                        if (this.zzl.zze(zzh.zzb) == zzh.zzc) {
                            this.zzl.zzi();
                        }
                        zzsiVar = zzh;
                        j4 = 0;
                        z10 = true;
                    } else {
                        zzsiVar = zzh;
                        z10 = zzjcVar.zzc == -9223372036854775807L;
                        j4 = longValue2;
                    }
                }
                try {
                } catch (Throwable th3) {
                    th = th3;
                    j5 = j3;
                }
                try {
                    if (this.zzu.zza.zzo()) {
                        this.zzH = zzjcVar;
                    } else if (zzy == null) {
                        if (this.zzu.zze != 1) {
                            zzS(4);
                        }
                        zzK(false, true, false, true);
                    } else {
                        try {
                            if (zzsiVar.equals(this.zzu.zzb)) {
                                zzjj zzd5 = this.zzq.zzd();
                                j7 = (zzd5 == null || !zzd5.zzd || j4 == 0) ? j4 : zzd5.zza.zza(j4, this.zzt);
                                j5 = j3;
                                try {
                                    if (zzen.zzz(j7) == zzen.zzz(this.zzu.zzr) && ((i6 = (zzjuVar2 = this.zzu).zze) == 2 || i6 == 3)) {
                                        long j13 = zzjuVar2.zzr;
                                        zzz = zzz(zzsiVar, j13, j5, j13, z10, 2);
                                        this.zzu = zzz;
                                        z = true;
                                        zzJ();
                                        return z;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    th = th;
                                    th2 = th;
                                    z11 = z10;
                                    j6 = j4;
                                    this.zzu = zzz(zzsiVar, j6, j5, j6, z11, 2);
                                    throw th2;
                                }
                            } else {
                                j5 = j3;
                                j7 = j4;
                            }
                            zzju zzjuVar5 = this.zzu;
                            zzcn zzcnVar2 = zzjuVar5.zza;
                            zzZ(zzcnVar2, zzsiVar, zzcnVar2, zzjuVar5.zzb, j5);
                            zzz = zzz(zzsiVar, zzv, j5, zzv, z10, 2);
                            this.zzu = zzz;
                            z = true;
                            zzJ();
                            return z;
                        } catch (Throwable th5) {
                            th2 = th5;
                            z11 = z10;
                            j6 = zzv;
                            this.zzu = zzz(zzsiVar, j6, j5, j6, z11, 2);
                            throw th2;
                        }
                        zzv = zzv(zzsiVar, j7, this.zzu.zze == 4);
                        z10 |= j4 != zzv;
                    }
                    j5 = j3;
                    zzv = j4;
                    zzz = zzz(zzsiVar, zzv, j5, zzv, z10, 2);
                    this.zzu = zzz;
                    z = true;
                    zzJ();
                    return z;
                } catch (Throwable th6) {
                    th = th6;
                    j5 = j3;
                    th2 = th;
                    z11 = z10;
                    j6 = j4;
                    this.zzu = zzz(zzsiVar, j6, j5, j6, z11, 2);
                    throw th2;
                }
            case 4:
                this.zzn.zzg((zzby) message.obj);
                zzG(this.zzn.zzc(), true);
                z = true;
                zzJ();
                return z;
            case 5:
                this.zzt = (zzkd) message.obj;
                z = true;
                zzJ();
                return z;
            case 6:
                zzU(false, true);
                z = true;
                zzJ();
                return z;
            case 7:
                zzK(true, false, true, false);
                this.zzf.zzc();
                zzS(1);
                this.zzi.quit();
                synchronized (this) {
                    this.zzw = true;
                    notifyAll();
                }
                return true;
            case 8:
                if (this.zzq.zzl((zzsg) message.obj)) {
                    zzjj zzc2 = this.zzq.zzc();
                    zzc2.zzl(this.zzn.zzc().zzc, this.zzu.zza);
                    zzX(zzc2.zzh(), zzc2.zzi());
                    if (zzc2 == this.zzq.zzd()) {
                        zzM(zzc2.zzf.zzb);
                        zzB();
                        zzju zzjuVar6 = this.zzu;
                        zzsi zzsiVar5 = zzjuVar6.zzb;
                        long j14 = zzc2.zzf.zzb;
                        this.zzu = zzz(zzsiVar5, j14, zzjuVar6.zzc, j14, false, 5);
                    }
                    zzI();
                }
                z = true;
                zzJ();
                return z;
            case 9:
                if (this.zzq.zzl((zzsg) message.obj)) {
                    this.zzq.zzk(this.zzI);
                    zzI();
                }
                z = true;
                zzJ();
                return z;
            case 10:
                float f = this.zzn.zzc().zzc;
                zzjj zzd6 = this.zzq.zzd();
                zzjj zze6 = this.zzq.zze();
                boolean z18 = true;
                while (zzd6 != null && zzd6.zzd) {
                    zzwa zzj = zzd6.zzj(f, this.zzu.zza);
                    zzwa zzi4 = zzd6.zzi();
                    if (zzi4 != null && zzi4.zzc.length == zzj.zzc.length) {
                        for (int i18 = 0; i18 < zzj.zzc.length; i18++) {
                            if (zzj.zza(zzi4, i18)) {
                            }
                        }
                        z18 &= zzd6 != zze6;
                        zzd6 = zzd6.zzg();
                    }
                    if (z18) {
                        zzjj zzd7 = this.zzq.zzd();
                        boolean zzm3 = this.zzq.zzm(zzd7);
                        int length8 = this.zza.length;
                        boolean[] zArr = new boolean[2];
                        long zzb5 = zzd7.zzb(zzj, this.zzu.zzr, zzm3, zArr);
                        zzju zzjuVar7 = this.zzu;
                        boolean z19 = (zzjuVar7.zze == 4 || zzb5 == zzjuVar7.zzr) ? false : true;
                        zzju zzjuVar8 = this.zzu;
                        i7 = 2;
                        zzjj zzjjVar = zzd7;
                        this.zzu = zzz(zzjuVar8.zzb, zzb5, zzjuVar8.zzc, zzjuVar8.zzd, z19, 5);
                        if (z19) {
                            zzM(zzb5);
                        }
                        int length9 = this.zza.length;
                        boolean[] zArr2 = new boolean[2];
                        int i19 = 0;
                        while (true) {
                            zzka[] zzkaVarArr7 = this.zza;
                            int length10 = zzkaVarArr7.length;
                            if (i19 < 2) {
                                zzka zzkaVar6 = zzkaVarArr7[i19];
                                boolean zzac = zzac(zzkaVar6);
                                zArr2[i19] = zzac;
                                zzjj zzjjVar2 = zzjjVar;
                                zztz zztzVar5 = zzjjVar2.zzc[i19];
                                if (zzac) {
                                    if (zztzVar5 != zzkaVar6.zzm()) {
                                        zzA(zzkaVar6);
                                    } else if (zArr[i19]) {
                                        zzkaVar6.zzB(this.zzI);
                                    }
                                }
                                i19++;
                                zzjjVar = zzjjVar2;
                            } else {
                                zzC(zArr2);
                            }
                        }
                    } else {
                        i7 = 2;
                        this.zzq.zzm(zzd6);
                        if (zzd6.zzd) {
                            zzd6.zza(zzj, Math.max(zzd6.zzf.zzb, this.zzI - zzd6.zze()), false);
                        }
                    }
                    zzE(true);
                    if (this.zzu.zze != 4) {
                        zzI();
                        zzY();
                        this.zzh.zzh(i7);
                    }
                    z = true;
                    zzJ();
                    return z;
                }
                z = true;
                zzJ();
                return z;
            case 11:
                int i20 = message.arg1;
                this.zzB = i20;
                if (!this.zzq.zzp(this.zzu.zza, i20)) {
                    zzP(true);
                }
                zzE(false);
                z = true;
                zzJ();
                return z;
            case 12:
                boolean z20 = message.arg1 != 0;
                this.zzC = z20;
                if (!this.zzq.zzq(this.zzu.zza, z20)) {
                    zzP(true);
                }
                zzE(false);
                z = true;
                zzJ();
                return z;
            case 13:
                boolean z21 = message.arg1 != 0;
                AtomicBoolean atomicBoolean = (AtomicBoolean) message.obj;
                if (this.zzD != z21) {
                    this.zzD = z21;
                    if (!z21) {
                        zzka[] zzkaVarArr8 = this.zza;
                        int length11 = zzkaVarArr8.length;
                        for (int i21 = 0; i21 < 2; i21++) {
                            zzka zzkaVar7 = zzkaVarArr8[i21];
                            if (!zzac(zzkaVar7) && this.zzb.remove(zzkaVar7)) {
                                zzkaVar7.zzA();
                            }
                        }
                    }
                }
                if (atomicBoolean != null) {
                    synchronized (this) {
                        atomicBoolean.set(true);
                        notifyAll();
                    }
                }
                z = true;
                zzJ();
                return z;
            case 14:
                zzQ((zzjx) message.obj);
                z = true;
                zzJ();
                return z;
            case 15:
                final zzjx zzjxVar = (zzjx) message.obj;
                Looper zzb6 = zzjxVar.zzb();
                if (zzb6.getThread().isAlive()) {
                    this.zzp.zzb(zzb6, null).zzg(new Runnable() { // from class: com.google.android.gms.internal.ads.zziv
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzjd.zzr(zzjxVar);
                        }
                    });
                } else {
                    zzdw.zze("TAG", "Trying to send message on a dead thread.");
                    zzjxVar.zzh(false);
                }
                z = true;
                zzJ();
                return z;
            case 16:
                zzG((zzby) message.obj, false);
                z = true;
                zzJ();
                return z;
            case 17:
                zziy zziyVar = (zziy) message.obj;
                this.zzv.zza(1);
                i8 = zziyVar.zzb;
                if (i8 != -1) {
                    list2 = zziyVar.zza;
                    zzucVar2 = zziyVar.zzd;
                    zzjy zzjyVar = new zzjy(list2, zzucVar2, null);
                    i9 = zziyVar.zzb;
                    j8 = zziyVar.zzc;
                    this.zzH = new zzjc(zzjyVar, i9, j8);
                }
                zzjt zzjtVar = this.zzr;
                list = zziyVar.zza;
                zzucVar = zziyVar.zzd;
                zzF(zzjtVar.zzm(list, zzucVar), false);
                z = true;
                zzJ();
                return z;
            case 18:
                zziy zziyVar2 = (zziy) message.obj;
                int i22 = message.arg1;
                this.zzv.zza(1);
                zzjt zzjtVar2 = this.zzr;
                if (i22 == -1) {
                    i22 = zzjtVar2.zza();
                }
                list3 = zziyVar2.zza;
                zzucVar3 = zziyVar2.zzd;
                zzF(zzjtVar2.zzj(i22, list3, zzucVar3), false);
                z = true;
                zzJ();
                return z;
            case 19:
                zziz zzizVar = (zziz) message.obj;
                this.zzv.zza(1);
                zzjt zzjtVar3 = this.zzr;
                int i23 = zzizVar.zza;
                int i24 = zzizVar.zzb;
                int i25 = zzizVar.zzc;
                zzuc zzucVar4 = zzizVar.zzd;
                zzF(zzjtVar3.zzk(0, 0, 0, null), false);
                z = true;
                zzJ();
                return z;
            case 20:
                int i26 = message.arg1;
                int i27 = message.arg2;
                zzuc zzucVar5 = (zzuc) message.obj;
                this.zzv.zza(1);
                zzF(this.zzr.zzl(i26, i27, zzucVar5), false);
                z = true;
                zzJ();
                return z;
            case 21:
                zzuc zzucVar6 = (zzuc) message.obj;
                this.zzv.zza(1);
                zzF(this.zzr.zzn(zzucVar6), false);
                z = true;
                zzJ();
                return z;
            case 22:
                zzF(this.zzr.zzb(), true);
                z = true;
                zzJ();
                return z;
            case 23:
                this.zzx = message.arg1 != 0;
                zzL();
                if (this.zzy && this.zzq.zze() != this.zzq.zzd()) {
                    zzP(true);
                    zzE(false);
                }
                z = true;
                zzJ();
                return z;
            case 24:
                boolean z22 = message.arg1 == 1;
                if (z22 != this.zzF) {
                    this.zzF = z22;
                    if (!z22 && this.zzu.zzo) {
                        this.zzh.zzh(2);
                    }
                }
                z = true;
                zzJ();
                return z;
            case 25:
                zzP(true);
                z = true;
                zzJ();
                return z;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgx
    public final void zza(zzby zzbyVar) {
        this.zzh.zzb(16, zzbyVar).zza();
    }

    public final Looper zzb() {
        return this.zzj;
    }

    final /* synthetic */ Boolean zzd() {
        return Boolean.valueOf(this.zzw);
    }

    @Override // com.google.android.gms.internal.ads.zzua
    public final /* bridge */ /* synthetic */ void zzg(zzub zzubVar) {
        this.zzh.zzb(9, (zzsg) zzubVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzjs
    public final void zzh() {
        this.zzh.zzh(22);
    }

    @Override // com.google.android.gms.internal.ads.zzsf
    public final void zzi(zzsg zzsgVar) {
        this.zzh.zzb(8, zzsgVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final void zzj() {
        this.zzh.zzh(10);
    }

    public final void zzk() {
        this.zzh.zza(0).zza();
    }

    public final void zzl(zzcn zzcnVar, int i, long j) {
        this.zzh.zzb(3, new zzjc(zzcnVar, i, j)).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzjv
    public final synchronized void zzm(zzjx zzjxVar) {
        if (!this.zzw && this.zzi.isAlive()) {
            this.zzh.zzb(14, zzjxVar).zza();
            return;
        }
        zzdw.zze("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        zzjxVar.zzh(false);
    }

    public final void zzn(boolean z, int i) {
        this.zzh.zzc(1, z ? 1 : 0, i).zza();
    }

    public final void zzo() {
        this.zzh.zza(6).zza();
    }

    public final synchronized boolean zzp() {
        if (!this.zzw && this.zzi.isAlive()) {
            this.zzh.zzh(7);
            zzaa(new zziu(this), this.zzs);
            return this.zzw;
        }
        return true;
    }

    public final void zzq(List list, int i, long j, zzuc zzucVar) {
        this.zzh.zzb(17, new zziy(list, zzucVar, i, j, null, null)).zza();
    }
}
