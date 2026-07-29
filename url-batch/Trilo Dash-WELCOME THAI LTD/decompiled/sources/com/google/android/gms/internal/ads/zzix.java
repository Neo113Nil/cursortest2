package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
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

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzix implements Handler.Callback, zzry, zzvm, zzjm, zzgr, zzjp {
    private boolean zzC;
    private boolean zzD;
    private boolean zzE;
    private int zzF;
    private zziw zzG;
    private long zzH;
    private int zzI;
    private boolean zzJ;
    private zzgu zzK;
    private final zzhq zzM;
    private final zzgp zzN;
    private final zzju[] zza;
    private final Set zzb;
    private final zzjv[] zzc;
    private final zzvn zzd;
    private final zzvo zze;
    private final zzjb zzf;
    private final zzvv zzg;
    private final zzdg zzh;
    private final HandlerThread zzi;
    private final Looper zzj;
    private final zzch zzk;
    private final zzcf zzl;
    private final long zzm;
    private final zzgs zzn;
    private final ArrayList zzo;
    private final zzcx zzp;
    private final zzjg zzq;
    private final zzjn zzr;
    private zzjx zzs;
    private zzjo zzt;
    private zziv zzu;
    private boolean zzv;
    private boolean zzx;
    private boolean zzy;
    private boolean zzz;
    private int zzA = 0;
    private boolean zzB = false;
    private boolean zzw = false;
    private long zzL = -9223372036854775807L;

    public zzix(zzju[] zzjuVarArr, zzvn zzvnVar, zzvo zzvoVar, zzjb zzjbVar, zzvv zzvvVar, int i, boolean z, zzki zzkiVar, zzjx zzjxVar, zzgp zzgpVar, long j, boolean z2, Looper looper, zzcx zzcxVar, zzhq zzhqVar, zzmv zzmvVar, byte[] bArr) {
        this.zzM = zzhqVar;
        this.zza = zzjuVarArr;
        this.zzd = zzvnVar;
        this.zze = zzvoVar;
        this.zzf = zzjbVar;
        this.zzg = zzvvVar;
        int i2 = 0;
        this.zzs = zzjxVar;
        this.zzN = zzgpVar;
        this.zzp = zzcxVar;
        this.zzm = zzjbVar.zza();
        zzjbVar.zzf();
        zzjo zzh = zzjo.zzh(zzvoVar);
        this.zzt = zzh;
        this.zzu = new zziv(zzh);
        int length = zzjuVarArr.length;
        this.zzc = new zzjv[2];
        while (true) {
            int length2 = zzjuVarArr.length;
            if (i2 >= 2) {
                this.zzn = new zzgs(this, zzcxVar);
                this.zzo = new ArrayList();
                this.zzb = Collections.newSetFromMap(new IdentityHashMap());
                this.zzk = new zzch();
                this.zzl = new zzcf();
                zzvnVar.zzm(this, zzvvVar);
                this.zzJ = true;
                Handler handler = new Handler(looper);
                this.zzq = new zzjg(zzkiVar, handler);
                this.zzr = new zzjn(this, zzkiVar, handler, zzmvVar);
                HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                this.zzi = handlerThread;
                handlerThread.start();
                Looper looper2 = handlerThread.getLooper();
                this.zzj = looper2;
                this.zzh = zzcxVar.zzb(looper2, this);
                return;
            }
            zzjuVarArr[i2].zzq(i2, zzmvVar);
            this.zzc[i2] = zzjuVarArr[i2].zzj();
            i2++;
        }
    }

    private final void zzA(zzju zzjuVar) throws zzgu {
        if (zzac(zzjuVar)) {
            this.zzn.zzd(zzjuVar);
            zzaj(zzjuVar);
            zzjuVar.zzn();
            this.zzF--;
        }
    }

    private final void zzB() throws zzgu {
        int length = this.zza.length;
        zzC(new boolean[2]);
    }

    private final void zzC(boolean[] zArr) throws zzgu {
        zzjd zze = this.zzq.zze();
        zzvo zzi = zze.zzi();
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
                zzju zzjuVar = this.zza[i2];
                if (!zzac(zzjuVar)) {
                    zzjd zze2 = this.zzq.zze();
                    boolean z2 = zze2 == this.zzq.zzd();
                    zzvo zzi2 = zze2.zzi();
                    zzjw zzjwVar = zzi2.zzb[i2];
                    zzad[] zzah = zzah(zzi2.zzc[i2]);
                    boolean z3 = zzaf() && this.zzt.zze == 3;
                    boolean z4 = !z && z3;
                    this.zzF++;
                    this.zzb.add(zzjuVar);
                    zzjuVar.zzo(zzjwVar, zzah, zze2.zzc[i2], this.zzH, z4, z2, zze2.zzf(), zze2.zze());
                    zzjuVar.zzp(11, new zziq(this));
                    this.zzn.zze(zzjuVar);
                    if (z3) {
                        zzjuVar.zzE();
                    }
                }
            }
            i2++;
        }
    }

    private final void zzD(IOException iOException, int i) {
        zzgu zzc = zzgu.zzc(iOException, i);
        zzjd zzd = this.zzq.zzd();
        if (zzd != null) {
            zzc = zzc.zza(zzd.zzf.zza);
        }
        zzdn.zza("ExoPlayerImplInternal", "Playback error", zzc);
        zzU(false, false);
        this.zzt = this.zzt.zze(zzc);
    }

    private final void zzE(boolean z) {
        zzjd zzc = this.zzq.zzc();
        zzsb zzsbVar = zzc == null ? this.zzt.zzb : zzc.zzf.zza;
        boolean z2 = !this.zzt.zzk.equals(zzsbVar);
        if (z2) {
            this.zzt = this.zzt.zza(zzsbVar);
        }
        zzjo zzjoVar = this.zzt;
        zzjoVar.zzq = zzc == null ? zzjoVar.zzs : zzc.zzc();
        this.zzt.zzr = zzt();
        if ((z2 || z) && zzc != null && zzc.zzd) {
            zzX(zzc.zzh(), zzc.zzi());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x036d, code lost:
    
        if (r1.zzn(r2, r15.zzl).zzg != false) goto L196;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x035d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x037f  */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.google.android.gms.internal.ads.zzcf] */
    /* JADX WARN: Type inference failed for: r14v1, types: [com.google.android.gms.internal.ads.zziw] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r15v12, types: [com.google.android.gms.internal.ads.zzix] */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.google.android.gms.internal.ads.zzci] */
    /* JADX WARN: Type inference failed for: r29v0, types: [com.google.android.gms.internal.ads.zzci] */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzF(zzci zzciVar, boolean z) throws zzgu {
        zzsb zzsbVar;
        zzjg zzjgVar;
        int i;
        Object obj;
        long j;
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        boolean z5;
        long j2;
        zzsb zzh;
        boolean z6;
        ?? r13;
        zzsb zzsbVar2;
        boolean z7;
        boolean z8;
        ?? r15;
        long j3;
        boolean z9;
        int i5;
        int i6;
        boolean z10;
        int i7;
        boolean z11;
        boolean z12;
        ?? r9;
        long j4;
        boolean z13;
        boolean z14;
        zziw zziwVar;
        long j5;
        zzjo zzjoVar = this.zzt;
        zziw zziwVar2 = this.zzG;
        zzjg zzjgVar2 = this.zzq;
        int i8 = this.zzA;
        boolean z15 = this.zzB;
        zzch zzchVar = this.zzk;
        ?? r14 = this.zzl;
        boolean z16 = true;
        if (zzciVar.zzo()) {
            zzsbVar2 = zzjo.zzi();
            r15 = this;
            r13 = -9223372036854775807;
            z7 = false;
            z9 = true;
            z8 = false;
            r9 = -1;
            j3 = 0;
        } else {
            zzsb zzsbVar3 = zzjoVar.zzb;
            Object obj2 = zzsbVar3.zza;
            boolean zzae = zzae(zzjoVar, r14);
            long j6 = (zzjoVar.zzb.zzb() || zzae) ? zzjoVar.zzc : zzjoVar.zzs;
            if (zziwVar2 != null) {
                zzsbVar = zzsbVar3;
                zzjgVar = zzjgVar2;
                i6 = -1;
                Pair zzy = zzy(zzciVar, zziwVar2, true, i8, z15, zzchVar, r14);
                if (zzy == null) {
                    i7 = zzciVar.zzg(z15);
                    j = j6;
                    z5 = true;
                    z11 = false;
                    z12 = false;
                } else {
                    if (zziwVar2.zzc == -9223372036854775807L) {
                        i7 = zzciVar.zzn(zzy.first, r14).zzd;
                        j = j6;
                        z10 = false;
                    } else {
                        obj2 = zzy.first;
                        j = ((Long) zzy.second).longValue();
                        z10 = true;
                        i7 = -1;
                    }
                    z11 = zzjoVar.zze == 4;
                    z12 = z10;
                    z5 = false;
                }
                z2 = z11;
                i2 = i7;
                z4 = z12;
            } else {
                zzsbVar = zzsbVar3;
                zzjgVar = zzjgVar2;
                i = -1;
                i = -1;
                i6 = -1;
                if (zzjoVar.zza.zzo()) {
                    i3 = zzciVar.zzg(z15);
                } else if (zzciVar.zza(obj2) == -1) {
                    Object zze = zze(zzchVar, r14, i8, z15, obj2, zzjoVar.zza, zzciVar);
                    if (zze == null) {
                        i4 = zzciVar.zzg(z15);
                        z5 = true;
                    } else {
                        i4 = zzciVar.zzn(zze, r14).zzd;
                        z5 = false;
                    }
                    i2 = i4;
                    j = j6;
                    z2 = false;
                    z4 = false;
                } else if (j6 == -9223372036854775807L) {
                    i3 = zzciVar.zzn(obj2, r14).zzd;
                } else if (zzae) {
                    zzjoVar.zza.zzn(zzsbVar.zza, r14);
                    if (zzjoVar.zza.zze(r14.zzd, zzchVar, 0L).zzo == zzjoVar.zza.zza(zzsbVar.zza)) {
                        Pair zzl = zzciVar.zzl(zzchVar, r14, zzciVar.zzn(obj2, r14).zzd, j6);
                        obj2 = zzl.first;
                        j = ((Long) zzl.second).longValue();
                    } else {
                        j = j6;
                    }
                    obj = obj2;
                    i2 = -1;
                    z2 = false;
                    z3 = false;
                    z4 = true;
                    if (i2 == i) {
                        Pair zzl2 = zzciVar.zzl(zzchVar, r14, i2, -9223372036854775807L);
                        obj = zzl2.first;
                        j2 = ((Long) zzl2.second).longValue();
                        j = -9223372036854775807L;
                    } else {
                        j2 = j;
                    }
                    zzh = zzjgVar.zzh(zzciVar, obj, j2);
                    int i9 = zzh.zze;
                    z6 = (zzsbVar.zza.equals(obj) || zzsbVar.zzb() || zzh.zzb() || !(i9 != i || ((i5 = zzsbVar.zze) != i && i9 >= i5))) ? false : true;
                    zzcf zzn = zzciVar.zzn(obj, r14);
                    if (!zzae && j6 == j && zzsbVar.zza.equals(zzh.zza)) {
                        if (zzsbVar.zzb()) {
                            zzn.zzl(zzsbVar.zzb);
                        }
                        if (zzh.zzb()) {
                            zzn.zzl(zzh.zzb);
                        }
                    }
                    if (true == z6) {
                        zzh = zzsbVar;
                    }
                    if (zzh.zzb()) {
                        if (zzh.equals(zzsbVar)) {
                            j2 = zzjoVar.zzs;
                        } else {
                            zzciVar.zzn(zzh.zza, r14);
                            if (zzh.zzc == r14.zze(zzh.zzb)) {
                                r14.zzi();
                            }
                            j2 = 0;
                        }
                    }
                    r13 = j;
                    zzsbVar2 = zzh;
                    z7 = z2;
                    z16 = z3;
                    z8 = z4;
                    r15 = this;
                    j3 = j2;
                    z9 = true;
                    r9 = i;
                } else {
                    obj = obj2;
                    j = j6;
                    i2 = -1;
                    z2 = false;
                    z3 = false;
                    z4 = false;
                    if (i2 == i) {
                    }
                    zzh = zzjgVar.zzh(zzciVar, obj, j2);
                    int i92 = zzh.zze;
                    if (zzsbVar.zza.equals(obj)) {
                    }
                    zzcf zzn2 = zzciVar.zzn(obj, r14);
                    if (!zzae) {
                        if (zzsbVar.zzb()) {
                        }
                        if (zzh.zzb()) {
                        }
                    }
                    if (true == z6) {
                    }
                    if (zzh.zzb()) {
                    }
                    r13 = j;
                    zzsbVar2 = zzh;
                    z7 = z2;
                    z16 = z3;
                    z8 = z4;
                    r15 = this;
                    j3 = j2;
                    z9 = true;
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
                zzh = zzjgVar.zzh(zzciVar, obj, j2);
                int i922 = zzh.zze;
                if (zzsbVar.zza.equals(obj)) {
                }
                zzcf zzn22 = zzciVar.zzn(obj, r14);
                if (!zzae) {
                }
                if (true == z6) {
                }
                if (zzh.zzb()) {
                }
                r13 = j;
                zzsbVar2 = zzh;
                z7 = z2;
                z16 = z3;
                z8 = z4;
                r15 = this;
                j3 = j2;
                z9 = true;
                r9 = i;
            }
            Object obj3 = obj2;
            z3 = z5;
            obj = obj3;
            i = i6;
            if (i2 == i) {
            }
            zzh = zzjgVar.zzh(zzciVar, obj, j2);
            int i9222 = zzh.zze;
            if (zzsbVar.zza.equals(obj)) {
            }
            zzcf zzn222 = zzciVar.zzn(obj, r14);
            if (!zzae) {
            }
            if (true == z6) {
            }
            if (zzh.zzb()) {
            }
            r13 = j;
            zzsbVar2 = zzh;
            z7 = z2;
            z16 = z3;
            z8 = z4;
            r15 = this;
            j3 = j2;
            z9 = true;
            r9 = i;
        }
        boolean z17 = (r15.zzt.zzb.equals(zzsbVar2) && j3 == r15.zzt.zzs) ? false : true;
        if (z16) {
            try {
                if (r15.zzt.zze != z9) {
                    r15.zzS(4);
                }
                r15.zzK(false, false, false, z9);
            } catch (Throwable th) {
                th = th;
                j4 = r13;
                r9 = 1;
                r13 = 0;
                r14 = 0;
                zzjo zzjoVar2 = r15.zzt;
                zzZ(zzciVar, zzsbVar2, zzjoVar2.zza, zzjoVar2.zzb, r9 != z8 ? -9223372036854775807L : j3);
                if (!z17 || j4 != r15.zzt.zzc) {
                    zzjo zzjoVar3 = r15.zzt;
                    Object obj4 = zzjoVar3.zzb.zza;
                    zzci zzciVar2 = zzjoVar3.zza;
                    boolean z18 = (z17 && z && !zzciVar2.zzo()) ? r9 : false;
                    r15.zzt = zzz(zzsbVar2, j3, j4, r15.zzt.zzd, z18, zzciVar.zza(obj4) == -1 ? 4 : 3);
                }
                zzL();
                r15.zzN(zzciVar, r15.zzt.zza);
                r15.zzt = r15.zzt.zzg(zzciVar);
                if (!zzciVar.zzo()) {
                    r15.zzG = r14;
                }
                r15.zzE(r13);
                throw th;
            }
        }
        try {
            if (z17) {
                j4 = r13;
                z13 = true;
                z14 = false;
                zziwVar = null;
                if (!zzciVar.zzo()) {
                    for (zzjd zzd = r15.zzq.zzd(); zzd != null; zzd = zzd.zzg()) {
                        if (zzd.zzf.zza.equals(zzsbVar2)) {
                            zzd.zzf = r15.zzq.zzg(zzciVar, zzd.zzf);
                            zzd.zzq();
                        }
                    }
                    j3 = r15.zzv(zzsbVar2, j3, z7);
                }
            } else {
                zzjg zzjgVar3 = r15.zzq;
                long j7 = r15.zzH;
                zzjd zze2 = zzjgVar3.zze();
                if (zze2 == null) {
                    j4 = r13;
                    j5 = 0;
                } else {
                    long zze3 = zze2.zze();
                    if (zze2.zzd) {
                        j5 = zze3;
                        int i10 = 0;
                        r13 = r13;
                        while (true) {
                            zzju[] zzjuVarArr = r15.zza;
                            j4 = r13;
                            try {
                                int length = zzjuVarArr.length;
                                if (i10 >= 2) {
                                    break;
                                }
                                if (zzac(zzjuVarArr[i10]) && r15.zza[i10].zzm() == zze2.zzc[i10]) {
                                    long zzf = r15.zza[i10].zzf();
                                    if (zzf == Long.MIN_VALUE) {
                                        j5 = Long.MIN_VALUE;
                                        break;
                                    }
                                    j5 = Math.max(zzf, j5);
                                }
                                i10++;
                                r13 = j4;
                            } catch (Throwable th2) {
                                th = th2;
                                r9 = 1;
                                r13 = 0;
                                r14 = 0;
                                zzjo zzjoVar22 = r15.zzt;
                                zzZ(zzciVar, zzsbVar2, zzjoVar22.zza, zzjoVar22.zzb, r9 != z8 ? -9223372036854775807L : j3);
                                if (!z17) {
                                }
                                zzjo zzjoVar32 = r15.zzt;
                                Object obj42 = zzjoVar32.zzb.zza;
                                zzci zzciVar22 = zzjoVar32.zza;
                                if (z17) {
                                }
                                r15.zzt = zzz(zzsbVar2, j3, j4, r15.zzt.zzd, z18, zzciVar.zza(obj42) == -1 ? 4 : 3);
                                zzL();
                                r15.zzN(zzciVar, r15.zzt.zza);
                                r15.zzt = r15.zzt.zzg(zzciVar);
                                if (!zzciVar.zzo()) {
                                }
                                r15.zzE(r13);
                                throw th;
                            }
                        }
                    } else {
                        j4 = r13;
                        j5 = zze3;
                    }
                }
                z14 = false;
                z13 = true;
                zziwVar = null;
                if (!zzjgVar3.zzo(zzciVar, j7, j5)) {
                    r15.zzP(false);
                }
            }
            zzjo zzjoVar4 = r15.zzt;
            zzZ(zzciVar, zzsbVar2, zzjoVar4.zza, zzjoVar4.zzb, z13 != z8 ? -9223372036854775807L : j3);
            if (z17 || j4 != r15.zzt.zzc) {
                zzjo zzjoVar5 = r15.zzt;
                Object obj5 = zzjoVar5.zzb.zza;
                zzci zzciVar3 = zzjoVar5.zza;
                if (!z17 || !z || zzciVar3.zzo() || zzciVar3.zzn(obj5, r15.zzl).zzg) {
                    z13 = false;
                }
                r15.zzt = zzz(zzsbVar2, j3, j4, r15.zzt.zzd, z13, zzciVar.zza(obj5) == -1 ? 4 : 3);
            }
            zzL();
            r15.zzN(zzciVar, r15.zzt.zza);
            r15.zzt = r15.zzt.zzg(zzciVar);
            if (!zzciVar.zzo()) {
                r15.zzG = zziwVar;
            }
            r15.zzE(z14);
        } catch (Throwable th3) {
            th = th3;
            zzjo zzjoVar222 = r15.zzt;
            zzZ(zzciVar, zzsbVar2, zzjoVar222.zza, zzjoVar222.zzb, r9 != z8 ? -9223372036854775807L : j3);
            if (!z17) {
            }
            zzjo zzjoVar322 = r15.zzt;
            Object obj422 = zzjoVar322.zzb.zza;
            zzci zzciVar222 = zzjoVar322.zza;
            if (z17) {
            }
            r15.zzt = zzz(zzsbVar2, j3, j4, r15.zzt.zzd, z18, zzciVar.zza(obj422) == -1 ? 4 : 3);
            zzL();
            r15.zzN(zzciVar, r15.zzt.zza);
            r15.zzt = r15.zzt.zzg(zzciVar);
            if (!zzciVar.zzo()) {
            }
            r15.zzE(r13);
            throw th;
        }
    }

    private final void zzG(zzbt zzbtVar, boolean z) throws zzgu {
        zzH(zzbtVar, zzbtVar.zzc, true, z);
    }

    private final void zzH(zzbt zzbtVar, float f, boolean z, boolean z2) throws zzgu {
        int i;
        zzix zzixVar = this;
        if (z) {
            if (z2) {
                zzixVar.zzu.zza(1);
            }
            zzjo zzjoVar = zzixVar.zzt;
            zzixVar = this;
            zzixVar.zzt = new zzjo(zzjoVar.zza, zzjoVar.zzb, zzjoVar.zzc, zzjoVar.zzd, zzjoVar.zze, zzjoVar.zzf, zzjoVar.zzg, zzjoVar.zzh, zzjoVar.zzi, zzjoVar.zzj, zzjoVar.zzk, zzjoVar.zzl, zzjoVar.zzm, zzbtVar, zzjoVar.zzq, zzjoVar.zzr, zzjoVar.zzs, zzjoVar.zzo, zzjoVar.zzp);
        }
        float f2 = zzbtVar.zzc;
        zzjd zzd = zzixVar.zzq.zzd();
        while (true) {
            i = 0;
            if (zzd == null) {
                break;
            }
            zzvh[] zzvhVarArr = zzd.zzi().zzc;
            int length = zzvhVarArr.length;
            while (i < length) {
                zzvh zzvhVar = zzvhVarArr[i];
                i++;
            }
            zzd = zzd.zzg();
        }
        zzju[] zzjuVarArr = zzixVar.zza;
        int length2 = zzjuVarArr.length;
        while (i < 2) {
            zzju zzjuVar = zzjuVarArr[i];
            if (zzjuVar != null) {
                zzjuVar.zzD(f, zzbtVar.zzc);
            }
            i++;
        }
    }

    private final void zzI() {
        long zze;
        long j;
        boolean zzg;
        if (zzab()) {
            zzjd zzc = this.zzq.zzc();
            long zzu = zzu(zzc.zzd());
            if (zzc == this.zzq.zzd()) {
                zze = this.zzH;
                j = zzc.zze();
            } else {
                zze = this.zzH - zzc.zze();
                j = zzc.zzf.zzb;
            }
            zzg = this.zzf.zzg(zze - j, zzu, this.zzn.zzc().zzc);
        } else {
            zzg = false;
        }
        this.zzz = zzg;
        if (zzg) {
            this.zzq.zzc().zzk(this.zzH);
        }
        zzW();
    }

    private final void zzJ() {
        boolean z;
        this.zzu.zzc(this.zzt);
        z = this.zzu.zzg;
        if (z) {
            zzhq zzhqVar = this.zzM;
            zzhqVar.zza.zzT(this.zzu);
            this.zzu = new zziv(this.zzt);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzK(boolean z, boolean z2, boolean z3, boolean z4) {
        zzsb zzsbVar;
        long j;
        long j2;
        boolean z5;
        this.zzh.zze(2);
        this.zzK = null;
        this.zzy = false;
        this.zzn.zzi();
        this.zzH = 1000000000000L;
        zzju[] zzjuVarArr = this.zza;
        int length = zzjuVarArr.length;
        for (int i = 0; i < 2; i++) {
            try {
                zzA(zzjuVarArr[i]);
            } catch (zzgu | RuntimeException e) {
                zzdn.zza("ExoPlayerImplInternal", "Disable failed.", e);
            }
        }
        if (z) {
            zzju[] zzjuVarArr2 = this.zza;
            int length2 = zzjuVarArr2.length;
            for (int i2 = 0; i2 < 2; i2++) {
                zzju zzjuVar = zzjuVarArr2[i2];
                if (this.zzb.remove(zzjuVar)) {
                    try {
                        zzjuVar.zzA();
                    } catch (RuntimeException e2) {
                        zzdn.zza("ExoPlayerImplInternal", "Reset failed.", e2);
                    }
                }
            }
        }
        this.zzF = 0;
        zzjo zzjoVar = this.zzt;
        zzsb zzsbVar2 = zzjoVar.zzb;
        long j3 = zzjoVar.zzs;
        long j4 = (this.zzt.zzb.zzb() || zzae(this.zzt, this.zzl)) ? this.zzt.zzc : this.zzt.zzs;
        if (z2) {
            this.zzG = null;
            Pair zzx = zzx(this.zzt.zza);
            zzsb zzsbVar3 = (zzsb) zzx.first;
            long longValue = ((Long) zzx.second).longValue();
            if (!zzsbVar3.equals(this.zzt.zzb)) {
                z5 = true;
                zzsbVar = zzsbVar3;
                j = longValue;
                j2 = -9223372036854775807L;
                this.zzq.zzi();
                this.zzz = false;
                zzjo zzjoVar2 = this.zzt;
                zzci zzciVar = zzjoVar2.zza;
                int i3 = zzjoVar2.zze;
                zzgu zzguVar = z4 ? null : zzjoVar2.zzf;
                zztz zztzVar = !z5 ? zztz.zza : zzjoVar2.zzh;
                zzvo zzvoVar = !z5 ? this.zze : this.zzt.zzi;
                List zzo = !z5 ? zzfrh.zzo() : this.zzt.zzj;
                zzjo zzjoVar3 = this.zzt;
                this.zzt = new zzjo(zzciVar, zzsbVar, j2, j, i3, zzguVar, false, zztzVar, zzvoVar, zzo, zzsbVar, zzjoVar3.zzl, zzjoVar3.zzm, zzjoVar3.zzn, j, 0L, j, this.zzE, false);
                if (z3) {
                    return;
                }
                this.zzr.zzg();
                return;
            }
            zzsbVar = zzsbVar3;
            j = longValue;
            j2 = -9223372036854775807L;
        } else {
            zzsbVar = zzsbVar2;
            j = j3;
            j2 = j4;
        }
        z5 = false;
        this.zzq.zzi();
        this.zzz = false;
        zzjo zzjoVar22 = this.zzt;
        zzci zzciVar2 = zzjoVar22.zza;
        int i32 = zzjoVar22.zze;
        zzgu zzguVar2 = z4 ? null : zzjoVar22.zzf;
        zztz zztzVar2 = !z5 ? zztz.zza : zzjoVar22.zzh;
        zzvo zzvoVar2 = !z5 ? this.zze : this.zzt.zzi;
        List zzo2 = !z5 ? zzfrh.zzo() : this.zzt.zzj;
        zzjo zzjoVar32 = this.zzt;
        this.zzt = new zzjo(zzciVar2, zzsbVar, j2, j, i32, zzguVar2, false, zztzVar2, zzvoVar2, zzo2, zzsbVar, zzjoVar32.zzl, zzjoVar32.zzm, zzjoVar32.zzn, j, 0L, j, this.zzE, false);
        if (z3) {
        }
    }

    private final void zzL() {
        zzjd zzd = this.zzq.zzd();
        boolean z = false;
        if (zzd != null && zzd.zzf.zzh && this.zzw) {
            z = true;
        }
        this.zzx = z;
    }

    private final void zzM(long j) throws zzgu {
        zzjd zzd = this.zzq.zzd();
        long zze = j + (zzd == null ? 1000000000000L : zzd.zze());
        this.zzH = zze;
        this.zzn.zzf(zze);
        zzju[] zzjuVarArr = this.zza;
        int length = zzjuVarArr.length;
        for (int i = 0; i < 2; i++) {
            zzju zzjuVar = zzjuVarArr[i];
            if (zzac(zzjuVar)) {
                zzjuVar.zzB(this.zzH);
            }
        }
        for (zzjd zzd2 = this.zzq.zzd(); zzd2 != null; zzd2 = zzd2.zzg()) {
            for (zzvh zzvhVar : zzd2.zzi().zzc) {
            }
        }
    }

    private final void zzN(zzci zzciVar, zzci zzciVar2) {
        if (zzciVar.zzo() && zzciVar2.zzo()) {
            return;
        }
        int size = this.zzo.size() - 1;
        if (size < 0) {
            Collections.sort(this.zzo);
            return;
        }
        zziu zziuVar = (zziu) this.zzo.get(size);
        Object obj = zziuVar.zzb;
        zzjr zzjrVar = zziuVar.zza;
        int i = zzeg.zza;
        zzjr zzjrVar2 = zziuVar.zza;
        throw null;
    }

    private final void zzO(long j, long j2) {
        this.zzh.zze(2);
        this.zzh.zzi(2, j + j2);
    }

    private final void zzP(boolean z) throws zzgu {
        zzsb zzsbVar = this.zzq.zzd().zzf.zza;
        long zzw = zzw(zzsbVar, this.zzt.zzs, true, false);
        if (zzw != this.zzt.zzs) {
            zzjo zzjoVar = this.zzt;
            this.zzt = zzz(zzsbVar, zzw, zzjoVar.zzc, zzjoVar.zzd, z, 5);
        }
    }

    private final void zzQ(zzjr zzjrVar) throws zzgu {
        if (zzjrVar.zzb() != this.zzj) {
            this.zzh.zzb(15, zzjrVar).zza();
            return;
        }
        zzai(zzjrVar);
        int i = this.zzt.zze;
        if (i == 3 || i == 2) {
            this.zzh.zzh(2);
        }
    }

    private final void zzR(boolean z, int i, boolean z2, int i2) throws zzgu {
        this.zzu.zza(z2 ? 1 : 0);
        this.zzu.zzb(i2);
        this.zzt = this.zzt.zzd(z, i);
        this.zzy = false;
        for (zzjd zzd = this.zzq.zzd(); zzd != null; zzd = zzd.zzg()) {
            for (zzvh zzvhVar : zzd.zzi().zzc) {
            }
        }
        if (!zzaf()) {
            zzV();
            zzY();
            return;
        }
        int i3 = this.zzt.zze;
        if (i3 == 3) {
            zzT();
            this.zzh.zzh(2);
        } else if (i3 == 2) {
            this.zzh.zzh(2);
        }
    }

    private final void zzS(int i) {
        zzjo zzjoVar = this.zzt;
        if (zzjoVar.zze != i) {
            if (i != 2) {
                this.zzL = -9223372036854775807L;
            }
            this.zzt = zzjoVar.zzf(i);
        }
    }

    private final void zzT() throws zzgu {
        this.zzy = false;
        this.zzn.zzh();
        zzju[] zzjuVarArr = this.zza;
        int length = zzjuVarArr.length;
        for (int i = 0; i < 2; i++) {
            zzju zzjuVar = zzjuVarArr[i];
            if (zzac(zzjuVar)) {
                zzjuVar.zzE();
            }
        }
    }

    private final void zzU(boolean z, boolean z2) {
        zzK(z || !this.zzC, false, true, false);
        this.zzu.zza(z2 ? 1 : 0);
        this.zzf.zzd();
        zzS(1);
    }

    private final void zzV() throws zzgu {
        this.zzn.zzi();
        zzju[] zzjuVarArr = this.zza;
        int length = zzjuVarArr.length;
        for (int i = 0; i < 2; i++) {
            zzju zzjuVar = zzjuVarArr[i];
            if (zzac(zzjuVar)) {
                zzaj(zzjuVar);
            }
        }
    }

    private final void zzW() {
        zzjd zzc = this.zzq.zzc();
        boolean z = this.zzz || (zzc != null && zzc.zza.zzp());
        zzjo zzjoVar = this.zzt;
        if (z != zzjoVar.zzg) {
            this.zzt = new zzjo(zzjoVar.zza, zzjoVar.zzb, zzjoVar.zzc, zzjoVar.zzd, zzjoVar.zze, zzjoVar.zzf, z, zzjoVar.zzh, zzjoVar.zzi, zzjoVar.zzj, zzjoVar.zzk, zzjoVar.zzl, zzjoVar.zzm, zzjoVar.zzn, zzjoVar.zzq, zzjoVar.zzr, zzjoVar.zzs, zzjoVar.zzo, zzjoVar.zzp);
        }
    }

    private final void zzX(zztz zztzVar, zzvo zzvoVar) {
        this.zzf.zze(this.zza, zztzVar, zzvoVar.zzc);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x009c, code lost:
    
        r7 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzY() throws zzgu {
        zziu zziuVar;
        zzjd zzd = this.zzq.zzd();
        if (zzd == null) {
            return;
        }
        long zzd2 = zzd.zzd ? zzd.zza.zzd() : -9223372036854775807L;
        if (zzd2 != -9223372036854775807L) {
            zzM(zzd2);
            if (zzd2 != this.zzt.zzs) {
                zzjo zzjoVar = this.zzt;
                this.zzt = zzz(zzjoVar.zzb, zzd2, zzjoVar.zzc, zzd2, true, 5);
            }
        } else {
            long zzb = this.zzn.zzb(zzd != this.zzq.zze());
            this.zzH = zzb;
            long zze = zzb - zzd.zze();
            long j = this.zzt.zzs;
            if (!this.zzo.isEmpty() && !this.zzt.zzb.zzb()) {
                if (this.zzJ) {
                    j--;
                    this.zzJ = false;
                }
                zzjo zzjoVar2 = this.zzt;
                int zza = zzjoVar2.zza.zza(zzjoVar2.zzb.zza);
                int min = Math.min(this.zzI, this.zzo.size());
                if (min > 0) {
                    zziuVar = (zziu) this.zzo.get(min - 1);
                    while (zziuVar != null && (zza < 0 || (zza == 0 && j < 0))) {
                        min--;
                        if (min > 0) {
                            zziuVar = (zziu) this.zzo.get(min - 1);
                        }
                    }
                    if (min < this.zzo.size()) {
                    }
                    this.zzI = min;
                }
                zziuVar = null;
            }
            this.zzt.zzs = zze;
        }
        this.zzt.zzq = this.zzq.zzc().zzc();
        this.zzt.zzr = zzt();
        zzjo zzjoVar3 = this.zzt;
        if (zzjoVar3.zzl && zzjoVar3.zze == 3 && zzag(zzjoVar3.zza, zzjoVar3.zzb)) {
            zzjo zzjoVar4 = this.zzt;
            if (zzjoVar4.zzn.zzc == 1.0f) {
                float zza2 = this.zzN.zza(zzs(zzjoVar4.zza, zzjoVar4.zzb.zza, zzjoVar4.zzs), zzt());
                if (this.zzn.zzc().zzc != zza2) {
                    this.zzn.zzg(new zzbt(zza2, this.zzt.zzn.zzd));
                    zzH(this.zzt.zzn, this.zzn.zzc().zzc, false, false);
                }
            }
        }
    }

    private final void zzZ(zzci zzciVar, zzsb zzsbVar, zzci zzciVar2, zzsb zzsbVar2, long j) {
        if (!zzag(zzciVar, zzsbVar)) {
            zzbt zzbtVar = zzsbVar.zzb() ? zzbt.zza : this.zzt.zzn;
            if (this.zzn.zzc().equals(zzbtVar)) {
                return;
            }
            this.zzn.zzg(zzbtVar);
            return;
        }
        zzciVar.zze(zzciVar.zzn(zzsbVar.zza, this.zzl).zzd, this.zzk, 0L);
        zzgp zzgpVar = this.zzN;
        zzau zzauVar = this.zzk.zzk;
        int i = zzeg.zza;
        zzgpVar.zzd(zzauVar);
        if (j != -9223372036854775807L) {
            this.zzN.zze(zzs(zzciVar, zzsbVar.zza, j));
            return;
        }
        if (zzeg.zzS(!zzciVar2.zzo() ? zzciVar2.zze(zzciVar2.zzn(zzsbVar2.zza, this.zzl).zzd, this.zzk, 0L).zzc : null, this.zzk.zzc)) {
            return;
        }
        this.zzN.zze(-9223372036854775807L);
    }

    private final synchronized void zzaa(zzfph zzfphVar, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + 500;
        boolean z = false;
        for (long j2 = 500; !Boolean.valueOf(((zzio) zzfphVar).zza.zzv).booleanValue() && j2 > 0; j2 = elapsedRealtime - SystemClock.elapsedRealtime()) {
            try {
                wait(j2);
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    private final boolean zzab() {
        zzjd zzc = this.zzq.zzc();
        return (zzc == null || zzc.zzd() == Long.MIN_VALUE) ? false : true;
    }

    private static boolean zzac(zzju zzjuVar) {
        return zzjuVar.zzbe() != 0;
    }

    private final boolean zzad() {
        zzjd zzd = this.zzq.zzd();
        long j = zzd.zzf.zze;
        if (zzd.zzd) {
            return j == -9223372036854775807L || this.zzt.zzs < j || !zzaf();
        }
        return false;
    }

    private static boolean zzae(zzjo zzjoVar, zzcf zzcfVar) {
        zzsb zzsbVar = zzjoVar.zzb;
        zzci zzciVar = zzjoVar.zza;
        return zzciVar.zzo() || zzciVar.zzn(zzsbVar.zza, zzcfVar).zzg;
    }

    private final boolean zzaf() {
        zzjo zzjoVar = this.zzt;
        return zzjoVar.zzl && zzjoVar.zzm == 0;
    }

    private final boolean zzag(zzci zzciVar, zzsb zzsbVar) {
        if (!zzsbVar.zzb() && !zzciVar.zzo()) {
            zzciVar.zze(zzciVar.zzn(zzsbVar.zza, this.zzl).zzd, this.zzk, 0L);
            if (this.zzk.zzb()) {
                zzch zzchVar = this.zzk;
                if (zzchVar.zzi && zzchVar.zzf != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    private static zzad[] zzah(zzvh zzvhVar) {
        int zzc = zzvhVar != null ? zzvhVar.zzc() : 0;
        zzad[] zzadVarArr = new zzad[zzc];
        for (int i = 0; i < zzc; i++) {
            zzadVarArr[i] = zzvhVar.zzd(i);
        }
        return zzadVarArr;
    }

    private static final void zzai(zzjr zzjrVar) throws zzgu {
        zzjrVar.zzj();
        try {
            zzjrVar.zzc().zzp(zzjrVar.zza(), zzjrVar.zzg());
        } finally {
            zzjrVar.zzh(true);
        }
    }

    private static final void zzaj(zzju zzjuVar) throws zzgu {
        if (zzjuVar.zzbe() == 2) {
            zzjuVar.zzF();
        }
    }

    private static final void zzak(zzju zzjuVar, long j) {
        zzjuVar.zzC();
        if (zzjuVar instanceof zzuc) {
            throw null;
        }
    }

    static Object zze(zzch zzchVar, zzcf zzcfVar, int i, boolean z, Object obj, zzci zzciVar, zzci zzciVar2) {
        int zza = zzciVar.zza(obj);
        int zzb = zzciVar.zzb();
        int i2 = 0;
        int i3 = zza;
        int i4 = -1;
        while (true) {
            if (i2 >= zzb || i4 != -1) {
                break;
            }
            i3 = zzciVar.zzi(i3, zzcfVar, zzchVar, i, z);
            if (i3 == -1) {
                i4 = -1;
                break;
            }
            i4 = zzciVar2.zza(zzciVar.zzf(i3));
            i2++;
        }
        if (i4 == -1) {
            return null;
        }
        return zzciVar2.zzf(i4);
    }

    static final /* synthetic */ void zzr(zzjr zzjrVar) {
        try {
            zzai(zzjrVar);
        } catch (zzgu e) {
            zzdn.zza("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    private final long zzs(zzci zzciVar, Object obj, long j) {
        zzciVar.zze(zzciVar.zzn(obj, this.zzl).zzd, this.zzk, 0L);
        zzch zzchVar = this.zzk;
        if (zzchVar.zzf != -9223372036854775807L && zzchVar.zzb()) {
            zzch zzchVar2 = this.zzk;
            if (zzchVar2.zzi) {
                return zzeg.zzv(zzeg.zzt(zzchVar2.zzg) - this.zzk.zzf) - j;
            }
        }
        return -9223372036854775807L;
    }

    private final long zzt() {
        return zzu(this.zzt.zzq);
    }

    private final long zzu(long j) {
        zzjd zzc = this.zzq.zzc();
        if (zzc == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.zzH - zzc.zze()));
    }

    private final long zzv(zzsb zzsbVar, long j, boolean z) throws zzgu {
        return zzw(zzsbVar, j, this.zzq.zzd() != this.zzq.zze(), z);
    }

    private final long zzw(zzsb zzsbVar, long j, boolean z, boolean z2) throws zzgu {
        zzV();
        this.zzy = false;
        if (z2 || this.zzt.zze == 3) {
            zzS(2);
        }
        zzjd zzd = this.zzq.zzd();
        zzjd zzjdVar = zzd;
        while (zzjdVar != null && !zzsbVar.equals(zzjdVar.zzf.zza)) {
            zzjdVar = zzjdVar.zzg();
        }
        if (z || zzd != zzjdVar || (zzjdVar != null && zzjdVar.zze() + j < 0)) {
            zzju[] zzjuVarArr = this.zza;
            int length = zzjuVarArr.length;
            for (int i = 0; i < 2; i++) {
                zzA(zzjuVarArr[i]);
            }
            if (zzjdVar != null) {
                while (this.zzq.zzd() != zzjdVar) {
                    this.zzq.zza();
                }
                this.zzq.zzm(zzjdVar);
                zzjdVar.zzp(1000000000000L);
                zzB();
            }
        }
        if (zzjdVar != null) {
            this.zzq.zzm(zzjdVar);
            if (!zzjdVar.zzd) {
                zzjdVar.zzf = zzjdVar.zzf.zzb(j);
            } else if (zzjdVar.zze) {
                j = zzjdVar.zza.zze(j);
                zzjdVar.zza.zzj(j - this.zzm, false);
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

    private final Pair zzx(zzci zzciVar) {
        long j = 0;
        if (zzciVar.zzo()) {
            return Pair.create(zzjo.zzi(), 0L);
        }
        Pair zzl = zzciVar.zzl(this.zzk, this.zzl, zzciVar.zzg(this.zzB), -9223372036854775807L);
        zzsb zzh = this.zzq.zzh(zzciVar, zzl.first, 0L);
        long longValue = ((Long) zzl.second).longValue();
        if (zzh.zzb()) {
            zzciVar.zzn(zzh.zza, this.zzl);
            if (zzh.zzc == this.zzl.zze(zzh.zzb)) {
                this.zzl.zzi();
            }
        } else {
            j = longValue;
        }
        return Pair.create(zzh, Long.valueOf(j));
    }

    private static Pair zzy(zzci zzciVar, zziw zziwVar, boolean z, int i, boolean z2, zzch zzchVar, zzcf zzcfVar) {
        Pair zzl;
        zzci zzciVar2 = zziwVar.zza;
        if (zzciVar.zzo()) {
            return null;
        }
        zzci zzciVar3 = true == zzciVar2.zzo() ? zzciVar : zzciVar2;
        try {
            zzl = zzciVar3.zzl(zzchVar, zzcfVar, zziwVar.zzb, zziwVar.zzc);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (zzciVar.equals(zzciVar3)) {
            return zzl;
        }
        if (zzciVar.zza(zzl.first) != -1) {
            return (zzciVar3.zzn(zzl.first, zzcfVar).zzg && zzciVar3.zze(zzcfVar.zzd, zzchVar, 0L).zzo == zzciVar3.zza(zzl.first)) ? zzciVar.zzl(zzchVar, zzcfVar, zzciVar.zzn(zzl.first, zzcfVar).zzd, zziwVar.zzc) : zzl;
        }
        Object zze = zze(zzchVar, zzcfVar, i, z2, zzl.first, zzciVar3, zzciVar);
        if (zze != null) {
            return zzciVar.zzl(zzchVar, zzcfVar, zzciVar.zzn(zze, zzcfVar).zzd, -9223372036854775807L);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final zzjo zzz(zzsb zzsbVar, long j, long j2, long j3, boolean z, int i) {
        List list;
        zztz zztzVar;
        zzvo zzvoVar;
        this.zzJ = (!this.zzJ && j == this.zzt.zzs && zzsbVar.equals(this.zzt.zzb)) ? false : true;
        zzL();
        zzjo zzjoVar = this.zzt;
        zztz zztzVar2 = zzjoVar.zzh;
        zzvo zzvoVar2 = zzjoVar.zzi;
        List list2 = zzjoVar.zzj;
        if (this.zzr.zzi()) {
            zzjd zzd = this.zzq.zzd();
            zztzVar2 = zzd == null ? zztz.zza : zzd.zzh();
            zzvoVar2 = zzd == null ? this.zze : zzd.zzi();
            zzvh[] zzvhVarArr = zzvoVar2.zzc;
            zzfre zzfreVar = new zzfre();
            boolean z2 = false;
            for (zzvh zzvhVar : zzvhVarArr) {
                if (zzvhVar != null) {
                    zzbl zzblVar = zzvhVar.zzd(0).zzk;
                    if (zzblVar == null) {
                        zzfreVar.zze(new zzbl(new zzbk[0]));
                    } else {
                        zzfreVar.zze(zzblVar);
                        z2 = true;
                    }
                }
            }
            zzfrh zzg = z2 ? zzfreVar.zzg() : zzfrh.zzo();
            if (zzd != null) {
                zzje zzjeVar = zzd.zzf;
                if (zzjeVar.zzc != j2) {
                    zzd.zzf = zzjeVar.zza(j2);
                }
            }
            list = zzg;
        } else {
            if (!zzsbVar.equals(this.zzt.zzb)) {
                zztzVar = zztz.zza;
                zzvoVar = this.zze;
                list = zzfrh.zzo();
                if (z) {
                    this.zzu.zzd(i);
                }
                return this.zzt.zzb(zzsbVar, j, j2, j3, zzt(), zztzVar, zzvoVar, list);
            }
            list = list2;
        }
        zztzVar = zztzVar2;
        zzvoVar = zzvoVar2;
        if (z) {
        }
        return this.zzt.zzb(zzsbVar, j, j2, j3, zzt(), zztzVar, zzvoVar, list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:454:0x0897, code lost:
    
        if (zzad() != false) goto L428;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x092d, code lost:
    
        if (r2 == false) goto L465;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:278:0x06d6 A[Catch: RuntimeException -> 0x0ad0, IOException -> 0x0afb, zzrd -> 0x0b03, zzes -> 0x0b0b, zzbp -> 0x0b13, zzpb -> 0x0b2a, zzgu -> 0x0b33, TryCatch #7 {zzbp -> 0x0b13, zzes -> 0x0b0b, zzgu -> 0x0b33, zzpb -> 0x0b2a, zzrd -> 0x0b03, IOException -> 0x0afb, RuntimeException -> 0x0ad0, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:11:0x001b, B:14:0x0022, B:16:0x0026, B:21:0x0033, B:22:0x003a, B:24:0x0042, B:27:0x0049, B:29:0x0052, B:31:0x0060, B:33:0x0068, B:34:0x0073, B:35:0x0087, B:36:0x009f, B:37:0x00bb, B:39:0x00ca, B:40:0x00ce, B:41:0x00df, B:43:0x00ee, B:44:0x010a, B:45:0x011d, B:46:0x0126, B:48:0x0138, B:49:0x0144, B:50:0x0154, B:51:0x015d, B:54:0x0164, B:56:0x016c, B:58:0x0170, B:60:0x0176, B:62:0x017e, B:64:0x0186, B:66:0x0189, B:71:0x018e, B:80:0x019b, B:82:0x019c, B:85:0x01a3, B:87:0x01b1, B:88:0x01b4, B:90:0x01b9, B:92:0x01c9, B:93:0x01cc, B:94:0x01d1, B:96:0x01e8, B:98:0x01ec, B:100:0x01fa, B:103:0x0204, B:105:0x0209, B:107:0x020f, B:147:0x0217, B:110:0x021f, B:112:0x0245, B:115:0x024e, B:117:0x0270, B:118:0x0273, B:119:0x0279, B:121:0x027e, B:123:0x028e, B:125:0x0294, B:128:0x0298, B:130:0x029c, B:127:0x02a1, B:135:0x02a6, B:136:0x02c7, B:138:0x02d2, B:140:0x02aa, B:142:0x02b4, B:155:0x02df, B:157:0x02eb, B:158:0x02f7, B:160:0x0303, B:162:0x032b, B:163:0x034b, B:164:0x0350, B:165:0x0362, B:174:0x036d, B:175:0x036e, B:176:0x0375, B:177:0x037d, B:178:0x0392, B:180:0x03be, B:187:0x04d1, B:188:0x049f, B:211:0x049b, B:225:0x04e0, B:226:0x04ef, B:233:0x03df, B:236:0x03f2, B:238:0x0402, B:240:0x0419, B:242:0x0423, B:249:0x04f0, B:251:0x04ff, B:254:0x0509, B:256:0x0518, B:258:0x0524, B:260:0x0553, B:261:0x0558, B:262:0x055c, B:264:0x0560, B:265:0x056d, B:268:0x06af, B:270:0x06b7, B:272:0x06bf, B:275:0x06c4, B:276:0x06d0, B:278:0x06d6, B:280:0x06de, B:286:0x06ef, B:288:0x06f5, B:290:0x070f, B:292:0x0715, B:285:0x071a, B:299:0x071f, B:301:0x0723, B:303:0x0729, B:305:0x072d, B:307:0x0735, B:309:0x073b, B:311:0x0745, B:314:0x074b, B:315:0x074e, B:317:0x0757, B:319:0x0769, B:321:0x0771, B:323:0x0779, B:327:0x0782, B:331:0x07a9, B:335:0x07b4, B:337:0x07be, B:338:0x07c5, B:340:0x07d7, B:341:0x07ed, B:343:0x07f3, B:347:0x083f, B:348:0x07fc, B:350:0x0803, B:353:0x080c, B:355:0x0816, B:360:0x0823, B:362:0x0829, B:370:0x083c, B:378:0x084f, B:380:0x0855, B:384:0x0862, B:386:0x086a, B:388:0x086e, B:389:0x0879, B:391:0x087f, B:392:0x0961, B:395:0x0969, B:397:0x096e, B:399:0x0976, B:401:0x0984, B:403:0x098b, B:407:0x098f, B:409:0x0995, B:411:0x099e, B:413:0x09a4, B:415:0x09af, B:416:0x09d3, B:418:0x09db, B:419:0x09e1, B:421:0x09e7, B:423:0x09f5, B:425:0x09f9, B:428:0x0a09, B:429:0x0a20, B:431:0x0a26, B:432:0x0a81, B:433:0x0a01, B:434:0x09ee, B:436:0x0a0c, B:440:0x0a13, B:442:0x0a19, B:443:0x09b6, B:446:0x09c4, B:447:0x09cb, B:448:0x09cc, B:449:0x0888, B:451:0x088f, B:453:0x0893, B:456:0x090b, B:458:0x0917, B:461:0x08a0, B:463:0x08a4, B:465:0x08b6, B:466:0x08c4, B:468:0x08d0, B:471:0x08d9, B:473:0x08e3, B:478:0x08ee, B:484:0x091b, B:486:0x0922, B:488:0x0926, B:491:0x092f, B:493:0x093d, B:495:0x0945, B:497:0x094f, B:499:0x0954, B:501:0x0959, B:502:0x095e, B:504:0x0848, B:505:0x0a89, B:511:0x057a, B:513:0x0580, B:516:0x0586, B:519:0x0591, B:521:0x0597, B:524:0x05a5, B:527:0x05ab, B:529:0x05b3, B:533:0x05b6, B:535:0x05be, B:537:0x05cc, B:539:0x0608, B:541:0x0612, B:544:0x061d, B:546:0x0625, B:548:0x0628, B:552:0x062c, B:554:0x0632, B:556:0x063c, B:558:0x0646, B:560:0x0657, B:564:0x065d, B:563:0x0668, B:569:0x066b, B:571:0x0674, B:574:0x0679, B:576:0x067f, B:578:0x0687, B:580:0x068d, B:582:0x0693, B:586:0x06a1, B:587:0x06a9, B:589:0x06ac, B:595:0x056a, B:597:0x0a91, B:600:0x0a98, B:602:0x0aa0, B:605:0x0abe), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x071d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x074b A[Catch: RuntimeException -> 0x0ad0, IOException -> 0x0afb, zzrd -> 0x0b03, zzes -> 0x0b0b, zzbp -> 0x0b13, zzpb -> 0x0b2a, zzgu -> 0x0b33, TryCatch #7 {zzbp -> 0x0b13, zzes -> 0x0b0b, zzgu -> 0x0b33, zzpb -> 0x0b2a, zzrd -> 0x0b03, IOException -> 0x0afb, RuntimeException -> 0x0ad0, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:11:0x001b, B:14:0x0022, B:16:0x0026, B:21:0x0033, B:22:0x003a, B:24:0x0042, B:27:0x0049, B:29:0x0052, B:31:0x0060, B:33:0x0068, B:34:0x0073, B:35:0x0087, B:36:0x009f, B:37:0x00bb, B:39:0x00ca, B:40:0x00ce, B:41:0x00df, B:43:0x00ee, B:44:0x010a, B:45:0x011d, B:46:0x0126, B:48:0x0138, B:49:0x0144, B:50:0x0154, B:51:0x015d, B:54:0x0164, B:56:0x016c, B:58:0x0170, B:60:0x0176, B:62:0x017e, B:64:0x0186, B:66:0x0189, B:71:0x018e, B:80:0x019b, B:82:0x019c, B:85:0x01a3, B:87:0x01b1, B:88:0x01b4, B:90:0x01b9, B:92:0x01c9, B:93:0x01cc, B:94:0x01d1, B:96:0x01e8, B:98:0x01ec, B:100:0x01fa, B:103:0x0204, B:105:0x0209, B:107:0x020f, B:147:0x0217, B:110:0x021f, B:112:0x0245, B:115:0x024e, B:117:0x0270, B:118:0x0273, B:119:0x0279, B:121:0x027e, B:123:0x028e, B:125:0x0294, B:128:0x0298, B:130:0x029c, B:127:0x02a1, B:135:0x02a6, B:136:0x02c7, B:138:0x02d2, B:140:0x02aa, B:142:0x02b4, B:155:0x02df, B:157:0x02eb, B:158:0x02f7, B:160:0x0303, B:162:0x032b, B:163:0x034b, B:164:0x0350, B:165:0x0362, B:174:0x036d, B:175:0x036e, B:176:0x0375, B:177:0x037d, B:178:0x0392, B:180:0x03be, B:187:0x04d1, B:188:0x049f, B:211:0x049b, B:225:0x04e0, B:226:0x04ef, B:233:0x03df, B:236:0x03f2, B:238:0x0402, B:240:0x0419, B:242:0x0423, B:249:0x04f0, B:251:0x04ff, B:254:0x0509, B:256:0x0518, B:258:0x0524, B:260:0x0553, B:261:0x0558, B:262:0x055c, B:264:0x0560, B:265:0x056d, B:268:0x06af, B:270:0x06b7, B:272:0x06bf, B:275:0x06c4, B:276:0x06d0, B:278:0x06d6, B:280:0x06de, B:286:0x06ef, B:288:0x06f5, B:290:0x070f, B:292:0x0715, B:285:0x071a, B:299:0x071f, B:301:0x0723, B:303:0x0729, B:305:0x072d, B:307:0x0735, B:309:0x073b, B:311:0x0745, B:314:0x074b, B:315:0x074e, B:317:0x0757, B:319:0x0769, B:321:0x0771, B:323:0x0779, B:327:0x0782, B:331:0x07a9, B:335:0x07b4, B:337:0x07be, B:338:0x07c5, B:340:0x07d7, B:341:0x07ed, B:343:0x07f3, B:347:0x083f, B:348:0x07fc, B:350:0x0803, B:353:0x080c, B:355:0x0816, B:360:0x0823, B:362:0x0829, B:370:0x083c, B:378:0x084f, B:380:0x0855, B:384:0x0862, B:386:0x086a, B:388:0x086e, B:389:0x0879, B:391:0x087f, B:392:0x0961, B:395:0x0969, B:397:0x096e, B:399:0x0976, B:401:0x0984, B:403:0x098b, B:407:0x098f, B:409:0x0995, B:411:0x099e, B:413:0x09a4, B:415:0x09af, B:416:0x09d3, B:418:0x09db, B:419:0x09e1, B:421:0x09e7, B:423:0x09f5, B:425:0x09f9, B:428:0x0a09, B:429:0x0a20, B:431:0x0a26, B:432:0x0a81, B:433:0x0a01, B:434:0x09ee, B:436:0x0a0c, B:440:0x0a13, B:442:0x0a19, B:443:0x09b6, B:446:0x09c4, B:447:0x09cb, B:448:0x09cc, B:449:0x0888, B:451:0x088f, B:453:0x0893, B:456:0x090b, B:458:0x0917, B:461:0x08a0, B:463:0x08a4, B:465:0x08b6, B:466:0x08c4, B:468:0x08d0, B:471:0x08d9, B:473:0x08e3, B:478:0x08ee, B:484:0x091b, B:486:0x0922, B:488:0x0926, B:491:0x092f, B:493:0x093d, B:495:0x0945, B:497:0x094f, B:499:0x0954, B:501:0x0959, B:502:0x095e, B:504:0x0848, B:505:0x0a89, B:511:0x057a, B:513:0x0580, B:516:0x0586, B:519:0x0591, B:521:0x0597, B:524:0x05a5, B:527:0x05ab, B:529:0x05b3, B:533:0x05b6, B:535:0x05be, B:537:0x05cc, B:539:0x0608, B:541:0x0612, B:544:0x061d, B:546:0x0625, B:548:0x0628, B:552:0x062c, B:554:0x0632, B:556:0x063c, B:558:0x0646, B:560:0x0657, B:564:0x065d, B:563:0x0668, B:569:0x066b, B:571:0x0674, B:574:0x0679, B:576:0x067f, B:578:0x0687, B:580:0x068d, B:582:0x0693, B:586:0x06a1, B:587:0x06a9, B:589:0x06ac, B:595:0x056a, B:597:0x0a91, B:600:0x0a98, B:602:0x0aa0, B:605:0x0abe), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0769 A[Catch: RuntimeException -> 0x0ad0, IOException -> 0x0afb, zzrd -> 0x0b03, zzes -> 0x0b0b, zzbp -> 0x0b13, zzpb -> 0x0b2a, zzgu -> 0x0b33, TryCatch #7 {zzbp -> 0x0b13, zzes -> 0x0b0b, zzgu -> 0x0b33, zzpb -> 0x0b2a, zzrd -> 0x0b03, IOException -> 0x0afb, RuntimeException -> 0x0ad0, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:11:0x001b, B:14:0x0022, B:16:0x0026, B:21:0x0033, B:22:0x003a, B:24:0x0042, B:27:0x0049, B:29:0x0052, B:31:0x0060, B:33:0x0068, B:34:0x0073, B:35:0x0087, B:36:0x009f, B:37:0x00bb, B:39:0x00ca, B:40:0x00ce, B:41:0x00df, B:43:0x00ee, B:44:0x010a, B:45:0x011d, B:46:0x0126, B:48:0x0138, B:49:0x0144, B:50:0x0154, B:51:0x015d, B:54:0x0164, B:56:0x016c, B:58:0x0170, B:60:0x0176, B:62:0x017e, B:64:0x0186, B:66:0x0189, B:71:0x018e, B:80:0x019b, B:82:0x019c, B:85:0x01a3, B:87:0x01b1, B:88:0x01b4, B:90:0x01b9, B:92:0x01c9, B:93:0x01cc, B:94:0x01d1, B:96:0x01e8, B:98:0x01ec, B:100:0x01fa, B:103:0x0204, B:105:0x0209, B:107:0x020f, B:147:0x0217, B:110:0x021f, B:112:0x0245, B:115:0x024e, B:117:0x0270, B:118:0x0273, B:119:0x0279, B:121:0x027e, B:123:0x028e, B:125:0x0294, B:128:0x0298, B:130:0x029c, B:127:0x02a1, B:135:0x02a6, B:136:0x02c7, B:138:0x02d2, B:140:0x02aa, B:142:0x02b4, B:155:0x02df, B:157:0x02eb, B:158:0x02f7, B:160:0x0303, B:162:0x032b, B:163:0x034b, B:164:0x0350, B:165:0x0362, B:174:0x036d, B:175:0x036e, B:176:0x0375, B:177:0x037d, B:178:0x0392, B:180:0x03be, B:187:0x04d1, B:188:0x049f, B:211:0x049b, B:225:0x04e0, B:226:0x04ef, B:233:0x03df, B:236:0x03f2, B:238:0x0402, B:240:0x0419, B:242:0x0423, B:249:0x04f0, B:251:0x04ff, B:254:0x0509, B:256:0x0518, B:258:0x0524, B:260:0x0553, B:261:0x0558, B:262:0x055c, B:264:0x0560, B:265:0x056d, B:268:0x06af, B:270:0x06b7, B:272:0x06bf, B:275:0x06c4, B:276:0x06d0, B:278:0x06d6, B:280:0x06de, B:286:0x06ef, B:288:0x06f5, B:290:0x070f, B:292:0x0715, B:285:0x071a, B:299:0x071f, B:301:0x0723, B:303:0x0729, B:305:0x072d, B:307:0x0735, B:309:0x073b, B:311:0x0745, B:314:0x074b, B:315:0x074e, B:317:0x0757, B:319:0x0769, B:321:0x0771, B:323:0x0779, B:327:0x0782, B:331:0x07a9, B:335:0x07b4, B:337:0x07be, B:338:0x07c5, B:340:0x07d7, B:341:0x07ed, B:343:0x07f3, B:347:0x083f, B:348:0x07fc, B:350:0x0803, B:353:0x080c, B:355:0x0816, B:360:0x0823, B:362:0x0829, B:370:0x083c, B:378:0x084f, B:380:0x0855, B:384:0x0862, B:386:0x086a, B:388:0x086e, B:389:0x0879, B:391:0x087f, B:392:0x0961, B:395:0x0969, B:397:0x096e, B:399:0x0976, B:401:0x0984, B:403:0x098b, B:407:0x098f, B:409:0x0995, B:411:0x099e, B:413:0x09a4, B:415:0x09af, B:416:0x09d3, B:418:0x09db, B:419:0x09e1, B:421:0x09e7, B:423:0x09f5, B:425:0x09f9, B:428:0x0a09, B:429:0x0a20, B:431:0x0a26, B:432:0x0a81, B:433:0x0a01, B:434:0x09ee, B:436:0x0a0c, B:440:0x0a13, B:442:0x0a19, B:443:0x09b6, B:446:0x09c4, B:447:0x09cb, B:448:0x09cc, B:449:0x0888, B:451:0x088f, B:453:0x0893, B:456:0x090b, B:458:0x0917, B:461:0x08a0, B:463:0x08a4, B:465:0x08b6, B:466:0x08c4, B:468:0x08d0, B:471:0x08d9, B:473:0x08e3, B:478:0x08ee, B:484:0x091b, B:486:0x0922, B:488:0x0926, B:491:0x092f, B:493:0x093d, B:495:0x0945, B:497:0x094f, B:499:0x0954, B:501:0x0959, B:502:0x095e, B:504:0x0848, B:505:0x0a89, B:511:0x057a, B:513:0x0580, B:516:0x0586, B:519:0x0591, B:521:0x0597, B:524:0x05a5, B:527:0x05ab, B:529:0x05b3, B:533:0x05b6, B:535:0x05be, B:537:0x05cc, B:539:0x0608, B:541:0x0612, B:544:0x061d, B:546:0x0625, B:548:0x0628, B:552:0x062c, B:554:0x0632, B:556:0x063c, B:558:0x0646, B:560:0x0657, B:564:0x065d, B:563:0x0668, B:569:0x066b, B:571:0x0674, B:574:0x0679, B:576:0x067f, B:578:0x0687, B:580:0x068d, B:582:0x0693, B:586:0x06a1, B:587:0x06a9, B:589:0x06ac, B:595:0x056a, B:597:0x0a91, B:600:0x0a98, B:602:0x0aa0, B:605:0x0abe), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:333:0x07b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:337:0x07be A[Catch: RuntimeException -> 0x0ad0, IOException -> 0x0afb, zzrd -> 0x0b03, zzes -> 0x0b0b, zzbp -> 0x0b13, zzpb -> 0x0b2a, zzgu -> 0x0b33, TryCatch #7 {zzbp -> 0x0b13, zzes -> 0x0b0b, zzgu -> 0x0b33, zzpb -> 0x0b2a, zzrd -> 0x0b03, IOException -> 0x0afb, RuntimeException -> 0x0ad0, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:11:0x001b, B:14:0x0022, B:16:0x0026, B:21:0x0033, B:22:0x003a, B:24:0x0042, B:27:0x0049, B:29:0x0052, B:31:0x0060, B:33:0x0068, B:34:0x0073, B:35:0x0087, B:36:0x009f, B:37:0x00bb, B:39:0x00ca, B:40:0x00ce, B:41:0x00df, B:43:0x00ee, B:44:0x010a, B:45:0x011d, B:46:0x0126, B:48:0x0138, B:49:0x0144, B:50:0x0154, B:51:0x015d, B:54:0x0164, B:56:0x016c, B:58:0x0170, B:60:0x0176, B:62:0x017e, B:64:0x0186, B:66:0x0189, B:71:0x018e, B:80:0x019b, B:82:0x019c, B:85:0x01a3, B:87:0x01b1, B:88:0x01b4, B:90:0x01b9, B:92:0x01c9, B:93:0x01cc, B:94:0x01d1, B:96:0x01e8, B:98:0x01ec, B:100:0x01fa, B:103:0x0204, B:105:0x0209, B:107:0x020f, B:147:0x0217, B:110:0x021f, B:112:0x0245, B:115:0x024e, B:117:0x0270, B:118:0x0273, B:119:0x0279, B:121:0x027e, B:123:0x028e, B:125:0x0294, B:128:0x0298, B:130:0x029c, B:127:0x02a1, B:135:0x02a6, B:136:0x02c7, B:138:0x02d2, B:140:0x02aa, B:142:0x02b4, B:155:0x02df, B:157:0x02eb, B:158:0x02f7, B:160:0x0303, B:162:0x032b, B:163:0x034b, B:164:0x0350, B:165:0x0362, B:174:0x036d, B:175:0x036e, B:176:0x0375, B:177:0x037d, B:178:0x0392, B:180:0x03be, B:187:0x04d1, B:188:0x049f, B:211:0x049b, B:225:0x04e0, B:226:0x04ef, B:233:0x03df, B:236:0x03f2, B:238:0x0402, B:240:0x0419, B:242:0x0423, B:249:0x04f0, B:251:0x04ff, B:254:0x0509, B:256:0x0518, B:258:0x0524, B:260:0x0553, B:261:0x0558, B:262:0x055c, B:264:0x0560, B:265:0x056d, B:268:0x06af, B:270:0x06b7, B:272:0x06bf, B:275:0x06c4, B:276:0x06d0, B:278:0x06d6, B:280:0x06de, B:286:0x06ef, B:288:0x06f5, B:290:0x070f, B:292:0x0715, B:285:0x071a, B:299:0x071f, B:301:0x0723, B:303:0x0729, B:305:0x072d, B:307:0x0735, B:309:0x073b, B:311:0x0745, B:314:0x074b, B:315:0x074e, B:317:0x0757, B:319:0x0769, B:321:0x0771, B:323:0x0779, B:327:0x0782, B:331:0x07a9, B:335:0x07b4, B:337:0x07be, B:338:0x07c5, B:340:0x07d7, B:341:0x07ed, B:343:0x07f3, B:347:0x083f, B:348:0x07fc, B:350:0x0803, B:353:0x080c, B:355:0x0816, B:360:0x0823, B:362:0x0829, B:370:0x083c, B:378:0x084f, B:380:0x0855, B:384:0x0862, B:386:0x086a, B:388:0x086e, B:389:0x0879, B:391:0x087f, B:392:0x0961, B:395:0x0969, B:397:0x096e, B:399:0x0976, B:401:0x0984, B:403:0x098b, B:407:0x098f, B:409:0x0995, B:411:0x099e, B:413:0x09a4, B:415:0x09af, B:416:0x09d3, B:418:0x09db, B:419:0x09e1, B:421:0x09e7, B:423:0x09f5, B:425:0x09f9, B:428:0x0a09, B:429:0x0a20, B:431:0x0a26, B:432:0x0a81, B:433:0x0a01, B:434:0x09ee, B:436:0x0a0c, B:440:0x0a13, B:442:0x0a19, B:443:0x09b6, B:446:0x09c4, B:447:0x09cb, B:448:0x09cc, B:449:0x0888, B:451:0x088f, B:453:0x0893, B:456:0x090b, B:458:0x0917, B:461:0x08a0, B:463:0x08a4, B:465:0x08b6, B:466:0x08c4, B:468:0x08d0, B:471:0x08d9, B:473:0x08e3, B:478:0x08ee, B:484:0x091b, B:486:0x0922, B:488:0x0926, B:491:0x092f, B:493:0x093d, B:495:0x0945, B:497:0x094f, B:499:0x0954, B:501:0x0959, B:502:0x095e, B:504:0x0848, B:505:0x0a89, B:511:0x057a, B:513:0x0580, B:516:0x0586, B:519:0x0591, B:521:0x0597, B:524:0x05a5, B:527:0x05ab, B:529:0x05b3, B:533:0x05b6, B:535:0x05be, B:537:0x05cc, B:539:0x0608, B:541:0x0612, B:544:0x061d, B:546:0x0625, B:548:0x0628, B:552:0x062c, B:554:0x0632, B:556:0x063c, B:558:0x0646, B:560:0x0657, B:564:0x065d, B:563:0x0668, B:569:0x066b, B:571:0x0674, B:574:0x0679, B:576:0x067f, B:578:0x0687, B:580:0x068d, B:582:0x0693, B:586:0x06a1, B:587:0x06a9, B:589:0x06ac, B:595:0x056a, B:597:0x0a91, B:600:0x0a98, B:602:0x0aa0, B:605:0x0abe), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:338:0x07c5 A[Catch: RuntimeException -> 0x0ad0, IOException -> 0x0afb, zzrd -> 0x0b03, zzes -> 0x0b0b, zzbp -> 0x0b13, zzpb -> 0x0b2a, zzgu -> 0x0b33, TryCatch #7 {zzbp -> 0x0b13, zzes -> 0x0b0b, zzgu -> 0x0b33, zzpb -> 0x0b2a, zzrd -> 0x0b03, IOException -> 0x0afb, RuntimeException -> 0x0ad0, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:11:0x001b, B:14:0x0022, B:16:0x0026, B:21:0x0033, B:22:0x003a, B:24:0x0042, B:27:0x0049, B:29:0x0052, B:31:0x0060, B:33:0x0068, B:34:0x0073, B:35:0x0087, B:36:0x009f, B:37:0x00bb, B:39:0x00ca, B:40:0x00ce, B:41:0x00df, B:43:0x00ee, B:44:0x010a, B:45:0x011d, B:46:0x0126, B:48:0x0138, B:49:0x0144, B:50:0x0154, B:51:0x015d, B:54:0x0164, B:56:0x016c, B:58:0x0170, B:60:0x0176, B:62:0x017e, B:64:0x0186, B:66:0x0189, B:71:0x018e, B:80:0x019b, B:82:0x019c, B:85:0x01a3, B:87:0x01b1, B:88:0x01b4, B:90:0x01b9, B:92:0x01c9, B:93:0x01cc, B:94:0x01d1, B:96:0x01e8, B:98:0x01ec, B:100:0x01fa, B:103:0x0204, B:105:0x0209, B:107:0x020f, B:147:0x0217, B:110:0x021f, B:112:0x0245, B:115:0x024e, B:117:0x0270, B:118:0x0273, B:119:0x0279, B:121:0x027e, B:123:0x028e, B:125:0x0294, B:128:0x0298, B:130:0x029c, B:127:0x02a1, B:135:0x02a6, B:136:0x02c7, B:138:0x02d2, B:140:0x02aa, B:142:0x02b4, B:155:0x02df, B:157:0x02eb, B:158:0x02f7, B:160:0x0303, B:162:0x032b, B:163:0x034b, B:164:0x0350, B:165:0x0362, B:174:0x036d, B:175:0x036e, B:176:0x0375, B:177:0x037d, B:178:0x0392, B:180:0x03be, B:187:0x04d1, B:188:0x049f, B:211:0x049b, B:225:0x04e0, B:226:0x04ef, B:233:0x03df, B:236:0x03f2, B:238:0x0402, B:240:0x0419, B:242:0x0423, B:249:0x04f0, B:251:0x04ff, B:254:0x0509, B:256:0x0518, B:258:0x0524, B:260:0x0553, B:261:0x0558, B:262:0x055c, B:264:0x0560, B:265:0x056d, B:268:0x06af, B:270:0x06b7, B:272:0x06bf, B:275:0x06c4, B:276:0x06d0, B:278:0x06d6, B:280:0x06de, B:286:0x06ef, B:288:0x06f5, B:290:0x070f, B:292:0x0715, B:285:0x071a, B:299:0x071f, B:301:0x0723, B:303:0x0729, B:305:0x072d, B:307:0x0735, B:309:0x073b, B:311:0x0745, B:314:0x074b, B:315:0x074e, B:317:0x0757, B:319:0x0769, B:321:0x0771, B:323:0x0779, B:327:0x0782, B:331:0x07a9, B:335:0x07b4, B:337:0x07be, B:338:0x07c5, B:340:0x07d7, B:341:0x07ed, B:343:0x07f3, B:347:0x083f, B:348:0x07fc, B:350:0x0803, B:353:0x080c, B:355:0x0816, B:360:0x0823, B:362:0x0829, B:370:0x083c, B:378:0x084f, B:380:0x0855, B:384:0x0862, B:386:0x086a, B:388:0x086e, B:389:0x0879, B:391:0x087f, B:392:0x0961, B:395:0x0969, B:397:0x096e, B:399:0x0976, B:401:0x0984, B:403:0x098b, B:407:0x098f, B:409:0x0995, B:411:0x099e, B:413:0x09a4, B:415:0x09af, B:416:0x09d3, B:418:0x09db, B:419:0x09e1, B:421:0x09e7, B:423:0x09f5, B:425:0x09f9, B:428:0x0a09, B:429:0x0a20, B:431:0x0a26, B:432:0x0a81, B:433:0x0a01, B:434:0x09ee, B:436:0x0a0c, B:440:0x0a13, B:442:0x0a19, B:443:0x09b6, B:446:0x09c4, B:447:0x09cb, B:448:0x09cc, B:449:0x0888, B:451:0x088f, B:453:0x0893, B:456:0x090b, B:458:0x0917, B:461:0x08a0, B:463:0x08a4, B:465:0x08b6, B:466:0x08c4, B:468:0x08d0, B:471:0x08d9, B:473:0x08e3, B:478:0x08ee, B:484:0x091b, B:486:0x0922, B:488:0x0926, B:491:0x092f, B:493:0x093d, B:495:0x0945, B:497:0x094f, B:499:0x0954, B:501:0x0959, B:502:0x095e, B:504:0x0848, B:505:0x0a89, B:511:0x057a, B:513:0x0580, B:516:0x0586, B:519:0x0591, B:521:0x0597, B:524:0x05a5, B:527:0x05ab, B:529:0x05b3, B:533:0x05b6, B:535:0x05be, B:537:0x05cc, B:539:0x0608, B:541:0x0612, B:544:0x061d, B:546:0x0625, B:548:0x0628, B:552:0x062c, B:554:0x0632, B:556:0x063c, B:558:0x0646, B:560:0x0657, B:564:0x065d, B:563:0x0668, B:569:0x066b, B:571:0x0674, B:574:0x0679, B:576:0x067f, B:578:0x0687, B:580:0x068d, B:582:0x0693, B:586:0x06a1, B:587:0x06a9, B:589:0x06ac, B:595:0x056a, B:597:0x0a91, B:600:0x0a98, B:602:0x0aa0, B:605:0x0abe), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:370:0x083c A[Catch: RuntimeException -> 0x0ad0, IOException -> 0x0afb, zzrd -> 0x0b03, zzes -> 0x0b0b, zzbp -> 0x0b13, zzpb -> 0x0b2a, zzgu -> 0x0b33, TryCatch #7 {zzbp -> 0x0b13, zzes -> 0x0b0b, zzgu -> 0x0b33, zzpb -> 0x0b2a, zzrd -> 0x0b03, IOException -> 0x0afb, RuntimeException -> 0x0ad0, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:11:0x001b, B:14:0x0022, B:16:0x0026, B:21:0x0033, B:22:0x003a, B:24:0x0042, B:27:0x0049, B:29:0x0052, B:31:0x0060, B:33:0x0068, B:34:0x0073, B:35:0x0087, B:36:0x009f, B:37:0x00bb, B:39:0x00ca, B:40:0x00ce, B:41:0x00df, B:43:0x00ee, B:44:0x010a, B:45:0x011d, B:46:0x0126, B:48:0x0138, B:49:0x0144, B:50:0x0154, B:51:0x015d, B:54:0x0164, B:56:0x016c, B:58:0x0170, B:60:0x0176, B:62:0x017e, B:64:0x0186, B:66:0x0189, B:71:0x018e, B:80:0x019b, B:82:0x019c, B:85:0x01a3, B:87:0x01b1, B:88:0x01b4, B:90:0x01b9, B:92:0x01c9, B:93:0x01cc, B:94:0x01d1, B:96:0x01e8, B:98:0x01ec, B:100:0x01fa, B:103:0x0204, B:105:0x0209, B:107:0x020f, B:147:0x0217, B:110:0x021f, B:112:0x0245, B:115:0x024e, B:117:0x0270, B:118:0x0273, B:119:0x0279, B:121:0x027e, B:123:0x028e, B:125:0x0294, B:128:0x0298, B:130:0x029c, B:127:0x02a1, B:135:0x02a6, B:136:0x02c7, B:138:0x02d2, B:140:0x02aa, B:142:0x02b4, B:155:0x02df, B:157:0x02eb, B:158:0x02f7, B:160:0x0303, B:162:0x032b, B:163:0x034b, B:164:0x0350, B:165:0x0362, B:174:0x036d, B:175:0x036e, B:176:0x0375, B:177:0x037d, B:178:0x0392, B:180:0x03be, B:187:0x04d1, B:188:0x049f, B:211:0x049b, B:225:0x04e0, B:226:0x04ef, B:233:0x03df, B:236:0x03f2, B:238:0x0402, B:240:0x0419, B:242:0x0423, B:249:0x04f0, B:251:0x04ff, B:254:0x0509, B:256:0x0518, B:258:0x0524, B:260:0x0553, B:261:0x0558, B:262:0x055c, B:264:0x0560, B:265:0x056d, B:268:0x06af, B:270:0x06b7, B:272:0x06bf, B:275:0x06c4, B:276:0x06d0, B:278:0x06d6, B:280:0x06de, B:286:0x06ef, B:288:0x06f5, B:290:0x070f, B:292:0x0715, B:285:0x071a, B:299:0x071f, B:301:0x0723, B:303:0x0729, B:305:0x072d, B:307:0x0735, B:309:0x073b, B:311:0x0745, B:314:0x074b, B:315:0x074e, B:317:0x0757, B:319:0x0769, B:321:0x0771, B:323:0x0779, B:327:0x0782, B:331:0x07a9, B:335:0x07b4, B:337:0x07be, B:338:0x07c5, B:340:0x07d7, B:341:0x07ed, B:343:0x07f3, B:347:0x083f, B:348:0x07fc, B:350:0x0803, B:353:0x080c, B:355:0x0816, B:360:0x0823, B:362:0x0829, B:370:0x083c, B:378:0x084f, B:380:0x0855, B:384:0x0862, B:386:0x086a, B:388:0x086e, B:389:0x0879, B:391:0x087f, B:392:0x0961, B:395:0x0969, B:397:0x096e, B:399:0x0976, B:401:0x0984, B:403:0x098b, B:407:0x098f, B:409:0x0995, B:411:0x099e, B:413:0x09a4, B:415:0x09af, B:416:0x09d3, B:418:0x09db, B:419:0x09e1, B:421:0x09e7, B:423:0x09f5, B:425:0x09f9, B:428:0x0a09, B:429:0x0a20, B:431:0x0a26, B:432:0x0a81, B:433:0x0a01, B:434:0x09ee, B:436:0x0a0c, B:440:0x0a13, B:442:0x0a19, B:443:0x09b6, B:446:0x09c4, B:447:0x09cb, B:448:0x09cc, B:449:0x0888, B:451:0x088f, B:453:0x0893, B:456:0x090b, B:458:0x0917, B:461:0x08a0, B:463:0x08a4, B:465:0x08b6, B:466:0x08c4, B:468:0x08d0, B:471:0x08d9, B:473:0x08e3, B:478:0x08ee, B:484:0x091b, B:486:0x0922, B:488:0x0926, B:491:0x092f, B:493:0x093d, B:495:0x0945, B:497:0x094f, B:499:0x0954, B:501:0x0959, B:502:0x095e, B:504:0x0848, B:505:0x0a89, B:511:0x057a, B:513:0x0580, B:516:0x0586, B:519:0x0591, B:521:0x0597, B:524:0x05a5, B:527:0x05ab, B:529:0x05b3, B:533:0x05b6, B:535:0x05be, B:537:0x05cc, B:539:0x0608, B:541:0x0612, B:544:0x061d, B:546:0x0625, B:548:0x0628, B:552:0x062c, B:554:0x0632, B:556:0x063c, B:558:0x0646, B:560:0x0657, B:564:0x065d, B:563:0x0668, B:569:0x066b, B:571:0x0674, B:574:0x0679, B:576:0x067f, B:578:0x0687, B:580:0x068d, B:582:0x0693, B:586:0x06a1, B:587:0x06a9, B:589:0x06ac, B:595:0x056a, B:597:0x0a91, B:600:0x0a98, B:602:0x0aa0, B:605:0x0abe), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:372:0x083f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0968  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x09db A[Catch: RuntimeException -> 0x0ad0, IOException -> 0x0afb, zzrd -> 0x0b03, zzes -> 0x0b0b, zzbp -> 0x0b13, zzpb -> 0x0b2a, zzgu -> 0x0b33, TryCatch #7 {zzbp -> 0x0b13, zzes -> 0x0b0b, zzgu -> 0x0b33, zzpb -> 0x0b2a, zzrd -> 0x0b03, IOException -> 0x0afb, RuntimeException -> 0x0ad0, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:11:0x001b, B:14:0x0022, B:16:0x0026, B:21:0x0033, B:22:0x003a, B:24:0x0042, B:27:0x0049, B:29:0x0052, B:31:0x0060, B:33:0x0068, B:34:0x0073, B:35:0x0087, B:36:0x009f, B:37:0x00bb, B:39:0x00ca, B:40:0x00ce, B:41:0x00df, B:43:0x00ee, B:44:0x010a, B:45:0x011d, B:46:0x0126, B:48:0x0138, B:49:0x0144, B:50:0x0154, B:51:0x015d, B:54:0x0164, B:56:0x016c, B:58:0x0170, B:60:0x0176, B:62:0x017e, B:64:0x0186, B:66:0x0189, B:71:0x018e, B:80:0x019b, B:82:0x019c, B:85:0x01a3, B:87:0x01b1, B:88:0x01b4, B:90:0x01b9, B:92:0x01c9, B:93:0x01cc, B:94:0x01d1, B:96:0x01e8, B:98:0x01ec, B:100:0x01fa, B:103:0x0204, B:105:0x0209, B:107:0x020f, B:147:0x0217, B:110:0x021f, B:112:0x0245, B:115:0x024e, B:117:0x0270, B:118:0x0273, B:119:0x0279, B:121:0x027e, B:123:0x028e, B:125:0x0294, B:128:0x0298, B:130:0x029c, B:127:0x02a1, B:135:0x02a6, B:136:0x02c7, B:138:0x02d2, B:140:0x02aa, B:142:0x02b4, B:155:0x02df, B:157:0x02eb, B:158:0x02f7, B:160:0x0303, B:162:0x032b, B:163:0x034b, B:164:0x0350, B:165:0x0362, B:174:0x036d, B:175:0x036e, B:176:0x0375, B:177:0x037d, B:178:0x0392, B:180:0x03be, B:187:0x04d1, B:188:0x049f, B:211:0x049b, B:225:0x04e0, B:226:0x04ef, B:233:0x03df, B:236:0x03f2, B:238:0x0402, B:240:0x0419, B:242:0x0423, B:249:0x04f0, B:251:0x04ff, B:254:0x0509, B:256:0x0518, B:258:0x0524, B:260:0x0553, B:261:0x0558, B:262:0x055c, B:264:0x0560, B:265:0x056d, B:268:0x06af, B:270:0x06b7, B:272:0x06bf, B:275:0x06c4, B:276:0x06d0, B:278:0x06d6, B:280:0x06de, B:286:0x06ef, B:288:0x06f5, B:290:0x070f, B:292:0x0715, B:285:0x071a, B:299:0x071f, B:301:0x0723, B:303:0x0729, B:305:0x072d, B:307:0x0735, B:309:0x073b, B:311:0x0745, B:314:0x074b, B:315:0x074e, B:317:0x0757, B:319:0x0769, B:321:0x0771, B:323:0x0779, B:327:0x0782, B:331:0x07a9, B:335:0x07b4, B:337:0x07be, B:338:0x07c5, B:340:0x07d7, B:341:0x07ed, B:343:0x07f3, B:347:0x083f, B:348:0x07fc, B:350:0x0803, B:353:0x080c, B:355:0x0816, B:360:0x0823, B:362:0x0829, B:370:0x083c, B:378:0x084f, B:380:0x0855, B:384:0x0862, B:386:0x086a, B:388:0x086e, B:389:0x0879, B:391:0x087f, B:392:0x0961, B:395:0x0969, B:397:0x096e, B:399:0x0976, B:401:0x0984, B:403:0x098b, B:407:0x098f, B:409:0x0995, B:411:0x099e, B:413:0x09a4, B:415:0x09af, B:416:0x09d3, B:418:0x09db, B:419:0x09e1, B:421:0x09e7, B:423:0x09f5, B:425:0x09f9, B:428:0x0a09, B:429:0x0a20, B:431:0x0a26, B:432:0x0a81, B:433:0x0a01, B:434:0x09ee, B:436:0x0a0c, B:440:0x0a13, B:442:0x0a19, B:443:0x09b6, B:446:0x09c4, B:447:0x09cb, B:448:0x09cc, B:449:0x0888, B:451:0x088f, B:453:0x0893, B:456:0x090b, B:458:0x0917, B:461:0x08a0, B:463:0x08a4, B:465:0x08b6, B:466:0x08c4, B:468:0x08d0, B:471:0x08d9, B:473:0x08e3, B:478:0x08ee, B:484:0x091b, B:486:0x0922, B:488:0x0926, B:491:0x092f, B:493:0x093d, B:495:0x0945, B:497:0x094f, B:499:0x0954, B:501:0x0959, B:502:0x095e, B:504:0x0848, B:505:0x0a89, B:511:0x057a, B:513:0x0580, B:516:0x0586, B:519:0x0591, B:521:0x0597, B:524:0x05a5, B:527:0x05ab, B:529:0x05b3, B:533:0x05b6, B:535:0x05be, B:537:0x05cc, B:539:0x0608, B:541:0x0612, B:544:0x061d, B:546:0x0625, B:548:0x0628, B:552:0x062c, B:554:0x0632, B:556:0x063c, B:558:0x0646, B:560:0x0657, B:564:0x065d, B:563:0x0668, B:569:0x066b, B:571:0x0674, B:574:0x0679, B:576:0x067f, B:578:0x0687, B:580:0x068d, B:582:0x0693, B:586:0x06a1, B:587:0x06a9, B:589:0x06ac, B:595:0x056a, B:597:0x0a91, B:600:0x0a98, B:602:0x0aa0, B:605:0x0abe), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:421:0x09e7 A[Catch: RuntimeException -> 0x0ad0, IOException -> 0x0afb, zzrd -> 0x0b03, zzes -> 0x0b0b, zzbp -> 0x0b13, zzpb -> 0x0b2a, zzgu -> 0x0b33, TryCatch #7 {zzbp -> 0x0b13, zzes -> 0x0b0b, zzgu -> 0x0b33, zzpb -> 0x0b2a, zzrd -> 0x0b03, IOException -> 0x0afb, RuntimeException -> 0x0ad0, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:11:0x001b, B:14:0x0022, B:16:0x0026, B:21:0x0033, B:22:0x003a, B:24:0x0042, B:27:0x0049, B:29:0x0052, B:31:0x0060, B:33:0x0068, B:34:0x0073, B:35:0x0087, B:36:0x009f, B:37:0x00bb, B:39:0x00ca, B:40:0x00ce, B:41:0x00df, B:43:0x00ee, B:44:0x010a, B:45:0x011d, B:46:0x0126, B:48:0x0138, B:49:0x0144, B:50:0x0154, B:51:0x015d, B:54:0x0164, B:56:0x016c, B:58:0x0170, B:60:0x0176, B:62:0x017e, B:64:0x0186, B:66:0x0189, B:71:0x018e, B:80:0x019b, B:82:0x019c, B:85:0x01a3, B:87:0x01b1, B:88:0x01b4, B:90:0x01b9, B:92:0x01c9, B:93:0x01cc, B:94:0x01d1, B:96:0x01e8, B:98:0x01ec, B:100:0x01fa, B:103:0x0204, B:105:0x0209, B:107:0x020f, B:147:0x0217, B:110:0x021f, B:112:0x0245, B:115:0x024e, B:117:0x0270, B:118:0x0273, B:119:0x0279, B:121:0x027e, B:123:0x028e, B:125:0x0294, B:128:0x0298, B:130:0x029c, B:127:0x02a1, B:135:0x02a6, B:136:0x02c7, B:138:0x02d2, B:140:0x02aa, B:142:0x02b4, B:155:0x02df, B:157:0x02eb, B:158:0x02f7, B:160:0x0303, B:162:0x032b, B:163:0x034b, B:164:0x0350, B:165:0x0362, B:174:0x036d, B:175:0x036e, B:176:0x0375, B:177:0x037d, B:178:0x0392, B:180:0x03be, B:187:0x04d1, B:188:0x049f, B:211:0x049b, B:225:0x04e0, B:226:0x04ef, B:233:0x03df, B:236:0x03f2, B:238:0x0402, B:240:0x0419, B:242:0x0423, B:249:0x04f0, B:251:0x04ff, B:254:0x0509, B:256:0x0518, B:258:0x0524, B:260:0x0553, B:261:0x0558, B:262:0x055c, B:264:0x0560, B:265:0x056d, B:268:0x06af, B:270:0x06b7, B:272:0x06bf, B:275:0x06c4, B:276:0x06d0, B:278:0x06d6, B:280:0x06de, B:286:0x06ef, B:288:0x06f5, B:290:0x070f, B:292:0x0715, B:285:0x071a, B:299:0x071f, B:301:0x0723, B:303:0x0729, B:305:0x072d, B:307:0x0735, B:309:0x073b, B:311:0x0745, B:314:0x074b, B:315:0x074e, B:317:0x0757, B:319:0x0769, B:321:0x0771, B:323:0x0779, B:327:0x0782, B:331:0x07a9, B:335:0x07b4, B:337:0x07be, B:338:0x07c5, B:340:0x07d7, B:341:0x07ed, B:343:0x07f3, B:347:0x083f, B:348:0x07fc, B:350:0x0803, B:353:0x080c, B:355:0x0816, B:360:0x0823, B:362:0x0829, B:370:0x083c, B:378:0x084f, B:380:0x0855, B:384:0x0862, B:386:0x086a, B:388:0x086e, B:389:0x0879, B:391:0x087f, B:392:0x0961, B:395:0x0969, B:397:0x096e, B:399:0x0976, B:401:0x0984, B:403:0x098b, B:407:0x098f, B:409:0x0995, B:411:0x099e, B:413:0x09a4, B:415:0x09af, B:416:0x09d3, B:418:0x09db, B:419:0x09e1, B:421:0x09e7, B:423:0x09f5, B:425:0x09f9, B:428:0x0a09, B:429:0x0a20, B:431:0x0a26, B:432:0x0a81, B:433:0x0a01, B:434:0x09ee, B:436:0x0a0c, B:440:0x0a13, B:442:0x0a19, B:443:0x09b6, B:446:0x09c4, B:447:0x09cb, B:448:0x09cc, B:449:0x0888, B:451:0x088f, B:453:0x0893, B:456:0x090b, B:458:0x0917, B:461:0x08a0, B:463:0x08a4, B:465:0x08b6, B:466:0x08c4, B:468:0x08d0, B:471:0x08d9, B:473:0x08e3, B:478:0x08ee, B:484:0x091b, B:486:0x0922, B:488:0x0926, B:491:0x092f, B:493:0x093d, B:495:0x0945, B:497:0x094f, B:499:0x0954, B:501:0x0959, B:502:0x095e, B:504:0x0848, B:505:0x0a89, B:511:0x057a, B:513:0x0580, B:516:0x0586, B:519:0x0591, B:521:0x0597, B:524:0x05a5, B:527:0x05ab, B:529:0x05b3, B:533:0x05b6, B:535:0x05be, B:537:0x05cc, B:539:0x0608, B:541:0x0612, B:544:0x061d, B:546:0x0625, B:548:0x0628, B:552:0x062c, B:554:0x0632, B:556:0x063c, B:558:0x0646, B:560:0x0657, B:564:0x065d, B:563:0x0668, B:569:0x066b, B:571:0x0674, B:574:0x0679, B:576:0x067f, B:578:0x0687, B:580:0x068d, B:582:0x0693, B:586:0x06a1, B:587:0x06a9, B:589:0x06ac, B:595:0x056a, B:597:0x0a91, B:600:0x0a98, B:602:0x0aa0, B:605:0x0abe), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0a26 A[Catch: RuntimeException -> 0x0ad0, IOException -> 0x0afb, zzrd -> 0x0b03, zzes -> 0x0b0b, zzbp -> 0x0b13, zzpb -> 0x0b2a, zzgu -> 0x0b33, TryCatch #7 {zzbp -> 0x0b13, zzes -> 0x0b0b, zzgu -> 0x0b33, zzpb -> 0x0b2a, zzrd -> 0x0b03, IOException -> 0x0afb, RuntimeException -> 0x0ad0, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:11:0x001b, B:14:0x0022, B:16:0x0026, B:21:0x0033, B:22:0x003a, B:24:0x0042, B:27:0x0049, B:29:0x0052, B:31:0x0060, B:33:0x0068, B:34:0x0073, B:35:0x0087, B:36:0x009f, B:37:0x00bb, B:39:0x00ca, B:40:0x00ce, B:41:0x00df, B:43:0x00ee, B:44:0x010a, B:45:0x011d, B:46:0x0126, B:48:0x0138, B:49:0x0144, B:50:0x0154, B:51:0x015d, B:54:0x0164, B:56:0x016c, B:58:0x0170, B:60:0x0176, B:62:0x017e, B:64:0x0186, B:66:0x0189, B:71:0x018e, B:80:0x019b, B:82:0x019c, B:85:0x01a3, B:87:0x01b1, B:88:0x01b4, B:90:0x01b9, B:92:0x01c9, B:93:0x01cc, B:94:0x01d1, B:96:0x01e8, B:98:0x01ec, B:100:0x01fa, B:103:0x0204, B:105:0x0209, B:107:0x020f, B:147:0x0217, B:110:0x021f, B:112:0x0245, B:115:0x024e, B:117:0x0270, B:118:0x0273, B:119:0x0279, B:121:0x027e, B:123:0x028e, B:125:0x0294, B:128:0x0298, B:130:0x029c, B:127:0x02a1, B:135:0x02a6, B:136:0x02c7, B:138:0x02d2, B:140:0x02aa, B:142:0x02b4, B:155:0x02df, B:157:0x02eb, B:158:0x02f7, B:160:0x0303, B:162:0x032b, B:163:0x034b, B:164:0x0350, B:165:0x0362, B:174:0x036d, B:175:0x036e, B:176:0x0375, B:177:0x037d, B:178:0x0392, B:180:0x03be, B:187:0x04d1, B:188:0x049f, B:211:0x049b, B:225:0x04e0, B:226:0x04ef, B:233:0x03df, B:236:0x03f2, B:238:0x0402, B:240:0x0419, B:242:0x0423, B:249:0x04f0, B:251:0x04ff, B:254:0x0509, B:256:0x0518, B:258:0x0524, B:260:0x0553, B:261:0x0558, B:262:0x055c, B:264:0x0560, B:265:0x056d, B:268:0x06af, B:270:0x06b7, B:272:0x06bf, B:275:0x06c4, B:276:0x06d0, B:278:0x06d6, B:280:0x06de, B:286:0x06ef, B:288:0x06f5, B:290:0x070f, B:292:0x0715, B:285:0x071a, B:299:0x071f, B:301:0x0723, B:303:0x0729, B:305:0x072d, B:307:0x0735, B:309:0x073b, B:311:0x0745, B:314:0x074b, B:315:0x074e, B:317:0x0757, B:319:0x0769, B:321:0x0771, B:323:0x0779, B:327:0x0782, B:331:0x07a9, B:335:0x07b4, B:337:0x07be, B:338:0x07c5, B:340:0x07d7, B:341:0x07ed, B:343:0x07f3, B:347:0x083f, B:348:0x07fc, B:350:0x0803, B:353:0x080c, B:355:0x0816, B:360:0x0823, B:362:0x0829, B:370:0x083c, B:378:0x084f, B:380:0x0855, B:384:0x0862, B:386:0x086a, B:388:0x086e, B:389:0x0879, B:391:0x087f, B:392:0x0961, B:395:0x0969, B:397:0x096e, B:399:0x0976, B:401:0x0984, B:403:0x098b, B:407:0x098f, B:409:0x0995, B:411:0x099e, B:413:0x09a4, B:415:0x09af, B:416:0x09d3, B:418:0x09db, B:419:0x09e1, B:421:0x09e7, B:423:0x09f5, B:425:0x09f9, B:428:0x0a09, B:429:0x0a20, B:431:0x0a26, B:432:0x0a81, B:433:0x0a01, B:434:0x09ee, B:436:0x0a0c, B:440:0x0a13, B:442:0x0a19, B:443:0x09b6, B:446:0x09c4, B:447:0x09cb, B:448:0x09cc, B:449:0x0888, B:451:0x088f, B:453:0x0893, B:456:0x090b, B:458:0x0917, B:461:0x08a0, B:463:0x08a4, B:465:0x08b6, B:466:0x08c4, B:468:0x08d0, B:471:0x08d9, B:473:0x08e3, B:478:0x08ee, B:484:0x091b, B:486:0x0922, B:488:0x0926, B:491:0x092f, B:493:0x093d, B:495:0x0945, B:497:0x094f, B:499:0x0954, B:501:0x0959, B:502:0x095e, B:504:0x0848, B:505:0x0a89, B:511:0x057a, B:513:0x0580, B:516:0x0586, B:519:0x0591, B:521:0x0597, B:524:0x05a5, B:527:0x05ab, B:529:0x05b3, B:533:0x05b6, B:535:0x05be, B:537:0x05cc, B:539:0x0608, B:541:0x0612, B:544:0x061d, B:546:0x0625, B:548:0x0628, B:552:0x062c, B:554:0x0632, B:556:0x063c, B:558:0x0646, B:560:0x0657, B:564:0x065d, B:563:0x0668, B:569:0x066b, B:571:0x0674, B:574:0x0679, B:576:0x067f, B:578:0x0687, B:580:0x068d, B:582:0x0693, B:586:0x06a1, B:587:0x06a9, B:589:0x06ac, B:595:0x056a, B:597:0x0a91, B:600:0x0a98, B:602:0x0aa0, B:605:0x0abe), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0a10  */
    /* JADX WARN: Type inference failed for: r2v26, types: [com.google.android.gms.internal.ads.zzft, com.google.android.gms.internal.ads.zzvv] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        boolean z;
        zzjd zze;
        long j;
        int i;
        zzjd zzd;
        boolean z2;
        boolean z3;
        boolean z4;
        zzjo zzjoVar;
        int i2;
        boolean z5;
        zzjo zzjoVar2;
        boolean z6;
        boolean z7;
        zzjd zze2;
        boolean z8;
        zzjd zzd2;
        zzjd zzg;
        zzjd zza;
        boolean z9;
        int i3;
        zzje zzf;
        long longValue;
        long j2;
        boolean z10;
        zzsb zzsbVar;
        Throwable th;
        long j3;
        boolean z11;
        long j4;
        zzjo zzjoVar3;
        int i4;
        zzjo zzz;
        int i5;
        int i6;
        List list;
        zztu zztuVar;
        List list2;
        zztu zztuVar2;
        int i7;
        long j5;
        List list3;
        zztu zztuVar3;
        try {
            int i8 = -1;
            switch (message.what) {
                case 0:
                    this.zzu.zza(1);
                    zzK(false, false, false, true);
                    this.zzf.zzb();
                    zzS(true != this.zzt.zza.zzo() ? 2 : 4);
                    this.zzr.zzf(this.zzg);
                    this.zzh.zzh(2);
                    break;
                case 1:
                    zzR(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    long uptimeMillis = SystemClock.uptimeMillis();
                    if (!this.zzt.zza.zzo() && this.zzr.zzi()) {
                        this.zzq.zzk(this.zzH);
                        if (this.zzq.zzn() && (zzf = this.zzq.zzf(this.zzH, this.zzt)) != null) {
                            zzjd zzr = this.zzq.zzr(this.zzc, this.zzd, this.zzf.zzi(), this.zzr, zzf, this.zze);
                            zzr.zza.zzl(this, zzf.zzb);
                            if (this.zzq.zzd() == zzr) {
                                zzM(zzf.zzb);
                            }
                            zzE(false);
                        }
                        if (this.zzz) {
                            this.zzz = zzab();
                            zzW();
                        } else {
                            zzI();
                        }
                        zzjd zze3 = this.zzq.zze();
                        if (zze3 != null) {
                            if (zze3.zzg() != null && !this.zzx) {
                                zzjd zze4 = this.zzq.zze();
                                if (zze4.zzd) {
                                    int i9 = 0;
                                    while (true) {
                                        zzju[] zzjuVarArr = this.zza;
                                        int length = zzjuVarArr.length;
                                        if (i9 < 2) {
                                            zzju zzjuVar = zzjuVarArr[i9];
                                            zztr zztrVar = zze4.zzc[i9];
                                            if (zzjuVar.zzm() == zztrVar) {
                                                if (zztrVar == null || zzjuVar.zzG()) {
                                                    i9++;
                                                } else {
                                                    zze4.zzg();
                                                    boolean z12 = zze4.zzf.zzf;
                                                }
                                            }
                                        } else if (zze3.zzg().zzd || this.zzH >= zze3.zzg().zzf()) {
                                            zzvo zzi = zze3.zzi();
                                            zzjd zzb = this.zzq.zzb();
                                            zzvo zzi2 = zzb.zzi();
                                            zzci zzciVar = this.zzt.zza;
                                            j = uptimeMillis;
                                            zzZ(zzciVar, zzb.zzf.zza, zzciVar, zze3.zzf.zza, -9223372036854775807L);
                                            if (!zzb.zzd || zzb.zza.zzd() == -9223372036854775807L) {
                                                int i10 = 0;
                                                while (true) {
                                                    int length2 = this.zza.length;
                                                    if (i10 < 2) {
                                                        boolean zzb2 = zzi.zzb(i10);
                                                        boolean zzb3 = zzi2.zzb(i10);
                                                        if (zzb2 && !this.zza[i10].zzH()) {
                                                            this.zzc[i10].zzb();
                                                            zzjw zzjwVar = zzi.zzb[i10];
                                                            zzjw zzjwVar2 = zzi2.zzb[i10];
                                                            if (!zzb3 || !zzjwVar2.equals(zzjwVar)) {
                                                                zzak(this.zza[i10], zzb.zzf());
                                                            }
                                                        }
                                                        i10++;
                                                    }
                                                }
                                            } else {
                                                long zzf2 = zzb.zzf();
                                                zzju[] zzjuVarArr2 = this.zza;
                                                int length3 = zzjuVarArr2.length;
                                                for (int i11 = 0; i11 < 2; i11++) {
                                                    zzju zzjuVar2 = zzjuVarArr2[i11];
                                                    if (zzjuVar2.zzm() != null) {
                                                        zzak(zzjuVar2, zzf2);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            j = uptimeMillis;
                            if (zze3.zzf.zzi || this.zzx) {
                                int i12 = 0;
                                while (true) {
                                    zzju[] zzjuVarArr3 = this.zza;
                                    int length4 = zzjuVarArr3.length;
                                    if (i12 < 2) {
                                        zzju zzjuVar3 = zzjuVarArr3[i12];
                                        zztr zztrVar2 = zze3.zzc[i12];
                                        if (zztrVar2 != null && zzjuVar3.zzm() == zztrVar2 && zzjuVar3.zzG()) {
                                            long j6 = zze3.zzf.zze;
                                            zzak(zzjuVar3, (j6 == -9223372036854775807L || j6 == Long.MIN_VALUE) ? -9223372036854775807L : j6 + zze3.zze());
                                        }
                                        i12++;
                                    }
                                }
                            }
                            zze2 = this.zzq.zze();
                            if (zze2 != null && this.zzq.zzd() != zze2 && !zze2.zzg) {
                                zzjd zze5 = this.zzq.zze();
                                zzvo zzi3 = zze5.zzi();
                                i3 = 0;
                                boolean z13 = false;
                                while (true) {
                                    zzju[] zzjuVarArr4 = this.zza;
                                    int length5 = zzjuVarArr4.length;
                                    if (i3 >= 2) {
                                        zzju zzjuVar4 = zzjuVarArr4[i3];
                                        if (zzac(zzjuVar4)) {
                                            zztr zzm = zzjuVar4.zzm();
                                            zztr zztrVar3 = zze5.zzc[i3];
                                            if (!zzi3.zzb(i3) || zzm != zztrVar3) {
                                                if (!zzjuVar4.zzH()) {
                                                    zzjuVar4.zzz(zzah(zzi3.zzc[i3]), zze5.zzc[i3], zze5.zzf(), zze5.zze());
                                                } else if (zzjuVar4.zzM()) {
                                                    zzA(zzjuVar4);
                                                } else {
                                                    z13 = true;
                                                }
                                            }
                                        }
                                        i3++;
                                    } else if (!z13) {
                                        zzB();
                                    }
                                }
                            }
                            z8 = false;
                            while (zzaf() && !this.zzx && (zzd2 = this.zzq.zzd()) != null && (zzg = zzd2.zzg()) != null && this.zzH >= zzg.zzf() && zzg.zzg) {
                                if (z8) {
                                    zzJ();
                                }
                                zza = this.zzq.zza();
                                Objects.requireNonNull(zza);
                                if (this.zzt.zzb.zza.equals(zza.zzf.zza.zza)) {
                                    zzsb zzsbVar2 = this.zzt.zzb;
                                    if (zzsbVar2.zzb == i8) {
                                        zzsb zzsbVar3 = zza.zzf.zza;
                                        if (zzsbVar3.zzb == i8 && zzsbVar2.zze != zzsbVar3.zze) {
                                            z9 = true;
                                            zzje zzjeVar = zza.zzf;
                                            zzsb zzsbVar4 = zzjeVar.zza;
                                            long j7 = zzjeVar.zzb;
                                            this.zzt = zzz(zzsbVar4, j7, zzjeVar.zzc, j7, !z9, 0);
                                            zzL();
                                            zzY();
                                            z8 = true;
                                            i8 = -1;
                                        }
                                    }
                                }
                                z9 = false;
                                zzje zzjeVar2 = zza.zzf;
                                zzsb zzsbVar42 = zzjeVar2.zza;
                                long j72 = zzjeVar2.zzb;
                                this.zzt = zzz(zzsbVar42, j72, zzjeVar2.zzc, j72, !z9, 0);
                                zzL();
                                zzY();
                                z8 = true;
                                i8 = -1;
                            }
                            i = this.zzt.zze;
                            if (i != 1 && i != 4) {
                                zzd = this.zzq.zzd();
                                if (zzd != null) {
                                    zzO(j, 10L);
                                    break;
                                } else {
                                    long j8 = j;
                                    int i13 = zzeg.zza;
                                    Trace.beginSection("doSomeWork");
                                    zzY();
                                    if (zzd.zzd) {
                                        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
                                        zzd.zza.zzj(this.zzt.zzs - this.zzm, false);
                                        z2 = true;
                                        z3 = true;
                                        int i14 = 0;
                                        while (true) {
                                            zzju[] zzjuVarArr5 = this.zza;
                                            int length6 = zzjuVarArr5.length;
                                            if (i14 < 2) {
                                                zzju zzjuVar5 = zzjuVarArr5[i14];
                                                if (zzac(zzjuVar5)) {
                                                    zzjuVar5.zzL(this.zzH, elapsedRealtime);
                                                    z3 = z3 && zzjuVar5.zzM();
                                                    zztr zztrVar4 = zzd.zzc[i14];
                                                    zztr zzm2 = zzjuVar5.zzm();
                                                    boolean z14 = zztrVar4 == zzm2 && zzjuVar5.zzG();
                                                    if (zztrVar4 == zzm2 && !z14 && !zzjuVar5.zzN() && !zzjuVar5.zzM()) {
                                                        z7 = false;
                                                        z2 = !z2 && z7;
                                                        if (z7) {
                                                            zzjuVar5.zzr();
                                                        }
                                                    }
                                                    z7 = true;
                                                    if (z2) {
                                                    }
                                                    if (z7) {
                                                    }
                                                }
                                                i14++;
                                            }
                                        }
                                    } else {
                                        zzd.zza.zzk();
                                        z2 = true;
                                        z3 = true;
                                    }
                                    long j9 = zzd.zzf.zze;
                                    if (z3 && zzd.zzd && (j9 == -9223372036854775807L || j9 <= this.zzt.zzs)) {
                                        if (this.zzx) {
                                            this.zzx = false;
                                            zzR(false, this.zzt.zzm, false, 5);
                                        }
                                        if (zzd.zzf.zzi) {
                                            zzS(4);
                                            zzV();
                                            int i15 = 2;
                                            if (this.zzt.zze == 2) {
                                                int i16 = 0;
                                                while (true) {
                                                    zzju[] zzjuVarArr6 = this.zza;
                                                    int length7 = zzjuVarArr6.length;
                                                    if (i16 >= i15) {
                                                        zzjo zzjoVar4 = this.zzt;
                                                        if (!zzjoVar4.zzg && zzjoVar4.zzr < 500000 && zzab()) {
                                                            if (this.zzL == -9223372036854775807L) {
                                                                this.zzL = SystemClock.elapsedRealtime();
                                                            } else if (SystemClock.elapsedRealtime() - this.zzL >= 4000) {
                                                                throw new IllegalStateException("Playback stuck buffering and not loading");
                                                            }
                                                            z4 = this.zzE;
                                                            zzjoVar = this.zzt;
                                                            if (z4 != zzjoVar.zzo) {
                                                                this.zzt = zzjoVar.zzc(z4);
                                                            }
                                                            if ((zzaf() || this.zzt.zze != 3) && (i2 = this.zzt.zze) != 2) {
                                                                if (this.zzF != 0 || i2 == 4) {
                                                                    this.zzh.zze(2);
                                                                } else {
                                                                    zzO(j8, 1000L);
                                                                }
                                                                z5 = false;
                                                            } else {
                                                                if (this.zzE && this.zzD) {
                                                                    z6 = false;
                                                                } else {
                                                                    zzO(j8, 10L);
                                                                    z6 = true;
                                                                }
                                                                z5 = !z6;
                                                            }
                                                            zzjoVar2 = this.zzt;
                                                            if (zzjoVar2.zzp != z5) {
                                                                this.zzt = new zzjo(zzjoVar2.zza, zzjoVar2.zzb, zzjoVar2.zzc, zzjoVar2.zzd, zzjoVar2.zze, zzjoVar2.zzf, zzjoVar2.zzg, zzjoVar2.zzh, zzjoVar2.zzi, zzjoVar2.zzj, zzjoVar2.zzk, zzjoVar2.zzl, zzjoVar2.zzm, zzjoVar2.zzn, zzjoVar2.zzq, zzjoVar2.zzr, zzjoVar2.zzs, zzjoVar2.zzo, z5);
                                                            }
                                                            this.zzD = false;
                                                            Trace.endSection();
                                                            break;
                                                        }
                                                    } else {
                                                        if (zzac(zzjuVarArr6[i16]) && this.zza[i16].zzm() == zzd.zzc[i16]) {
                                                            this.zza[i16].zzr();
                                                        }
                                                        i16++;
                                                        i15 = 2;
                                                    }
                                                }
                                            }
                                            this.zzL = -9223372036854775807L;
                                            z4 = this.zzE;
                                            zzjoVar = this.zzt;
                                            if (z4 != zzjoVar.zzo) {
                                            }
                                            if (zzaf()) {
                                            }
                                            if (this.zzF != 0) {
                                            }
                                            this.zzh.zze(2);
                                            z5 = false;
                                            zzjoVar2 = this.zzt;
                                            if (zzjoVar2.zzp != z5) {
                                            }
                                            this.zzD = false;
                                            Trace.endSection();
                                        }
                                    }
                                    zzjo zzjoVar5 = this.zzt;
                                    if (zzjoVar5.zze == 2) {
                                        if (this.zzF == 0) {
                                            break;
                                        } else if (z2) {
                                            if (zzjoVar5.zzg) {
                                                long zzb4 = zzag(zzjoVar5.zza, this.zzq.zzd().zzf.zza) ? this.zzN.zzb() : -9223372036854775807L;
                                                zzjd zzc = this.zzq.zzc();
                                                boolean z15 = zzc.zzr() && zzc.zzf.zzi;
                                                boolean z16 = zzc.zzf.zza.zzb() && !zzc.zzd;
                                                if (!z15) {
                                                    if (!z16) {
                                                        if (this.zzf.zzh(zzt(), this.zzn.zzc().zzc, this.zzy, zzb4)) {
                                                        }
                                                    }
                                                }
                                            }
                                            zzS(3);
                                            this.zzK = null;
                                            if (zzaf()) {
                                                zzT();
                                            }
                                        }
                                        int i152 = 2;
                                        if (this.zzt.zze == 2) {
                                        }
                                        this.zzL = -9223372036854775807L;
                                        z4 = this.zzE;
                                        zzjoVar = this.zzt;
                                        if (z4 != zzjoVar.zzo) {
                                        }
                                        if (zzaf()) {
                                        }
                                        if (this.zzF != 0) {
                                        }
                                        this.zzh.zze(2);
                                        z5 = false;
                                        zzjoVar2 = this.zzt;
                                        if (zzjoVar2.zzp != z5) {
                                        }
                                        this.zzD = false;
                                        Trace.endSection();
                                    }
                                    if (this.zzt.zze == 3) {
                                        if (this.zzF == 0) {
                                            if (!zzad()) {
                                                this.zzy = zzaf();
                                                zzS(2);
                                                if (this.zzy) {
                                                    for (zzjd zzd3 = this.zzq.zzd(); zzd3 != null; zzd3 = zzd3.zzg()) {
                                                        for (zzvh zzvhVar : zzd3.zzi().zzc) {
                                                        }
                                                    }
                                                    this.zzN.zzc();
                                                }
                                                zzV();
                                            }
                                        }
                                    }
                                    int i1522 = 2;
                                    if (this.zzt.zze == 2) {
                                    }
                                    this.zzL = -9223372036854775807L;
                                    z4 = this.zzE;
                                    zzjoVar = this.zzt;
                                    if (z4 != zzjoVar.zzo) {
                                    }
                                    if (zzaf()) {
                                    }
                                    if (this.zzF != 0) {
                                    }
                                    this.zzh.zze(2);
                                    z5 = false;
                                    zzjoVar2 = this.zzt;
                                    if (zzjoVar2.zzp != z5) {
                                    }
                                    this.zzD = false;
                                    Trace.endSection();
                                }
                            }
                            this.zzh.zze(2);
                        }
                        j = uptimeMillis;
                        zze2 = this.zzq.zze();
                        if (zze2 != null) {
                            zzjd zze52 = this.zzq.zze();
                            zzvo zzi32 = zze52.zzi();
                            i3 = 0;
                            boolean z132 = false;
                            while (true) {
                                zzju[] zzjuVarArr42 = this.zza;
                                int length52 = zzjuVarArr42.length;
                                if (i3 >= 2) {
                                }
                                i3++;
                            }
                        }
                        z8 = false;
                        while (zzaf()) {
                            if (z8) {
                            }
                            zza = this.zzq.zza();
                            Objects.requireNonNull(zza);
                            if (this.zzt.zzb.zza.equals(zza.zzf.zza.zza)) {
                            }
                            z9 = false;
                            zzje zzjeVar22 = zza.zzf;
                            zzsb zzsbVar422 = zzjeVar22.zza;
                            long j722 = zzjeVar22.zzb;
                            this.zzt = zzz(zzsbVar422, j722, zzjeVar22.zzc, j722, !z9, 0);
                            zzL();
                            zzY();
                            z8 = true;
                            i8 = -1;
                        }
                        i = this.zzt.zze;
                        if (i != 1) {
                            zzd = this.zzq.zzd();
                            if (zzd != null) {
                            }
                        }
                        this.zzh.zze(2);
                    }
                    j = uptimeMillis;
                    i = this.zzt.zze;
                    if (i != 1) {
                    }
                    this.zzh.zze(2);
                    break;
                case 3:
                    zziw zziwVar = (zziw) message.obj;
                    this.zzu.zza(1);
                    Pair zzy = zzy(this.zzt.zza, zziwVar, true, this.zzA, this.zzB, this.zzk, this.zzl);
                    if (zzy == null) {
                        Pair zzx = zzx(this.zzt.zza);
                        zzsbVar = (zzsb) zzx.first;
                        longValue = ((Long) zzx.second).longValue();
                        j2 = -9223372036854775807L;
                        z10 = !this.zzt.zza.zzo();
                    } else {
                        Object obj = zzy.first;
                        longValue = ((Long) zzy.second).longValue();
                        j2 = zziwVar.zzc == -9223372036854775807L ? -9223372036854775807L : longValue;
                        zzsb zzh = this.zzq.zzh(this.zzt.zza, obj, longValue);
                        if (zzh.zzb()) {
                            this.zzt.zza.zzn(zzh.zza, this.zzl);
                            if (this.zzl.zze(zzh.zzb) == zzh.zzc) {
                                this.zzl.zzi();
                            }
                            zzsbVar = zzh;
                            longValue = 0;
                            z10 = true;
                        } else {
                            z10 = zziwVar.zzc == -9223372036854775807L;
                            zzsbVar = zzh;
                        }
                    }
                    try {
                        if (this.zzt.zza.zzo()) {
                            this.zzG = zziwVar;
                        } else if (zzy == null) {
                            if (this.zzt.zze != 1) {
                                zzS(4);
                            }
                            zzK(false, true, false, true);
                        } else {
                            try {
                                if (zzsbVar.equals(this.zzt.zzb)) {
                                    zzjd zzd4 = this.zzq.zzd();
                                    j4 = (zzd4 == null || !zzd4.zzd || longValue == 0) ? longValue : zzd4.zza.zza(longValue, this.zzs);
                                    if (zzeg.zzz(j4) == zzeg.zzz(this.zzt.zzs) && ((i4 = (zzjoVar3 = this.zzt).zze) == 2 || i4 == 3)) {
                                        long j10 = zzjoVar3.zzs;
                                        zzz = zzz(zzsbVar, j10, j2, j10, z10, 2);
                                        this.zzt = zzz;
                                        break;
                                    }
                                } else {
                                    j4 = longValue;
                                }
                                zzjo zzjoVar6 = this.zzt;
                                zzci zzciVar2 = zzjoVar6.zza;
                                zzZ(zzciVar2, zzsbVar, zzciVar2, zzjoVar6.zzb, j2);
                                zzz = zzz(zzsbVar, j3, j2, j3, z11, 2);
                                this.zzt = zzz;
                            } catch (Throwable th2) {
                                th = th2;
                                this.zzt = zzz(zzsbVar, j3, j2, j3, z11, 2);
                                throw th;
                            }
                            j3 = zzv(zzsbVar, j4, this.zzt.zze == 4);
                            z11 = z10 | (longValue != j3);
                        }
                        j3 = longValue;
                        z11 = z10;
                        zzz = zzz(zzsbVar, j3, j2, j3, z11, 2);
                        this.zzt = zzz;
                    } catch (Throwable th3) {
                        th = th3;
                        j3 = longValue;
                        z11 = z10;
                    }
                    break;
                case 4:
                    this.zzn.zzg((zzbt) message.obj);
                    zzG(this.zzn.zzc(), true);
                    break;
                case 5:
                    this.zzs = (zzjx) message.obj;
                    break;
                case 6:
                    zzU(false, true);
                    break;
                case 7:
                    zzK(true, false, true, false);
                    this.zzf.zzc();
                    zzS(1);
                    this.zzi.quit();
                    synchronized (this) {
                        this.zzv = true;
                        notifyAll();
                    }
                    return true;
                case 8:
                    if (this.zzq.zzl((zzrz) message.obj)) {
                        zzjd zzc2 = this.zzq.zzc();
                        zzc2.zzl(this.zzn.zzc().zzc, this.zzt.zza);
                        zzX(zzc2.zzh(), zzc2.zzi());
                        if (zzc2 == this.zzq.zzd()) {
                            zzM(zzc2.zzf.zzb);
                            zzB();
                            zzjo zzjoVar7 = this.zzt;
                            zzsb zzsbVar5 = zzjoVar7.zzb;
                            long j11 = zzc2.zzf.zzb;
                            this.zzt = zzz(zzsbVar5, j11, zzjoVar7.zzc, j11, false, 5);
                        }
                        zzI();
                        break;
                    }
                    break;
                case 9:
                    if (this.zzq.zzl((zzrz) message.obj)) {
                        this.zzq.zzk(this.zzH);
                        zzI();
                        break;
                    }
                    break;
                case 10:
                    float f = this.zzn.zzc().zzc;
                    zzjd zzd5 = this.zzq.zzd();
                    zzjd zze6 = this.zzq.zze();
                    boolean z17 = true;
                    while (zzd5 != null && zzd5.zzd) {
                        zzvo zzj = zzd5.zzj(f, this.zzt.zza);
                        zzvo zzi4 = zzd5.zzi();
                        if (zzi4 != null && zzi4.zzc.length == zzj.zzc.length) {
                            for (int i17 = 0; i17 < zzj.zzc.length; i17++) {
                                if (zzj.zza(zzi4, i17)) {
                                }
                            }
                            z17 &= zzd5 != zze6;
                            zzd5 = zzd5.zzg();
                        }
                        if (z17) {
                            zzjd zzd6 = this.zzq.zzd();
                            boolean zzm3 = this.zzq.zzm(zzd6);
                            int length8 = this.zza.length;
                            boolean[] zArr = new boolean[2];
                            long zzb5 = zzd6.zzb(zzj, this.zzt.zzs, zzm3, zArr);
                            zzjo zzjoVar8 = this.zzt;
                            boolean z18 = (zzjoVar8.zze == 4 || zzb5 == zzjoVar8.zzs) ? false : true;
                            zzjo zzjoVar9 = this.zzt;
                            i5 = 2;
                            zzjd zzjdVar = zzd6;
                            this.zzt = zzz(zzjoVar9.zzb, zzb5, zzjoVar9.zzc, zzjoVar9.zzd, z18, 5);
                            if (z18) {
                                zzM(zzb5);
                            }
                            int length9 = this.zza.length;
                            boolean[] zArr2 = new boolean[2];
                            int i18 = 0;
                            while (true) {
                                zzju[] zzjuVarArr7 = this.zza;
                                int length10 = zzjuVarArr7.length;
                                if (i18 < 2) {
                                    zzju zzjuVar6 = zzjuVarArr7[i18];
                                    boolean zzac = zzac(zzjuVar6);
                                    zArr2[i18] = zzac;
                                    zzjd zzjdVar2 = zzjdVar;
                                    zztr zztrVar5 = zzjdVar2.zzc[i18];
                                    if (zzac) {
                                        if (zztrVar5 != zzjuVar6.zzm()) {
                                            zzA(zzjuVar6);
                                        } else if (zArr[i18]) {
                                            zzjuVar6.zzB(this.zzH);
                                        }
                                    }
                                    i18++;
                                    zzjdVar = zzjdVar2;
                                } else {
                                    zzC(zArr2);
                                }
                            }
                        } else {
                            i5 = 2;
                            this.zzq.zzm(zzd5);
                            if (zzd5.zzd) {
                                zzd5.zza(zzj, Math.max(zzd5.zzf.zzb, this.zzH - zzd5.zze()), false);
                            }
                        }
                        zzE(true);
                        if (this.zzt.zze != 4) {
                            zzI();
                            zzY();
                            this.zzh.zzh(i5);
                            break;
                        }
                    }
                    break;
                case 11:
                    int i19 = message.arg1;
                    this.zzA = i19;
                    if (!this.zzq.zzp(this.zzt.zza, i19)) {
                        zzP(true);
                    }
                    zzE(false);
                    break;
                case 12:
                    boolean z19 = message.arg1 != 0;
                    this.zzB = z19;
                    if (!this.zzq.zzq(this.zzt.zza, z19)) {
                        zzP(true);
                    }
                    zzE(false);
                    break;
                case 13:
                    boolean z20 = message.arg1 != 0;
                    AtomicBoolean atomicBoolean = (AtomicBoolean) message.obj;
                    if (this.zzC != z20) {
                        this.zzC = z20;
                        if (!z20) {
                            zzju[] zzjuVarArr8 = this.zza;
                            int length11 = zzjuVarArr8.length;
                            for (int i20 = 0; i20 < 2; i20++) {
                                zzju zzjuVar7 = zzjuVarArr8[i20];
                                if (!zzac(zzjuVar7) && this.zzb.remove(zzjuVar7)) {
                                    zzjuVar7.zzA();
                                }
                            }
                        }
                    }
                    if (atomicBoolean != null) {
                        synchronized (this) {
                            atomicBoolean.set(true);
                            notifyAll();
                        }
                        break;
                    }
                    break;
                case 14:
                    zzQ((zzjr) message.obj);
                    break;
                case 15:
                    final zzjr zzjrVar = (zzjr) message.obj;
                    Looper zzb6 = zzjrVar.zzb();
                    if (zzb6.getThread().isAlive()) {
                        this.zzp.zzb(zzb6, null).zzg(new Runnable() { // from class: com.google.android.gms.internal.ads.zzip
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzix.zzr(zzjrVar);
                            }
                        });
                        break;
                    } else {
                        Log.w("TAG", "Trying to send message on a dead thread.");
                        zzjrVar.zzh(false);
                        break;
                    }
                case 16:
                    zzG((zzbt) message.obj, false);
                    break;
                case 17:
                    zzis zzisVar = (zzis) message.obj;
                    this.zzu.zza(1);
                    i6 = zzisVar.zzb;
                    if (i6 != -1) {
                        list2 = zzisVar.zza;
                        zztuVar2 = zzisVar.zzd;
                        zzjs zzjsVar = new zzjs(list2, zztuVar2, null);
                        i7 = zzisVar.zzb;
                        j5 = zzisVar.zzc;
                        this.zzG = new zziw(zzjsVar, i7, j5);
                    }
                    zzjn zzjnVar = this.zzr;
                    list = zzisVar.zza;
                    zztuVar = zzisVar.zzd;
                    zzF(zzjnVar.zzm(list, zztuVar), false);
                    break;
                case 18:
                    zzis zzisVar2 = (zzis) message.obj;
                    int i21 = message.arg1;
                    this.zzu.zza(1);
                    zzjn zzjnVar2 = this.zzr;
                    if (i21 == -1) {
                        i21 = zzjnVar2.zza();
                    }
                    list3 = zzisVar2.zza;
                    zztuVar3 = zzisVar2.zzd;
                    zzF(zzjnVar2.zzj(i21, list3, zztuVar3), false);
                    break;
                case 19:
                    zzit zzitVar = (zzit) message.obj;
                    this.zzu.zza(1);
                    zzjn zzjnVar3 = this.zzr;
                    int i22 = zzitVar.zza;
                    int i23 = zzitVar.zzb;
                    int i24 = zzitVar.zzc;
                    zztu zztuVar4 = zzitVar.zzd;
                    zzF(zzjnVar3.zzk(0, 0, 0, null), false);
                    break;
                case 20:
                    int i25 = message.arg1;
                    int i26 = message.arg2;
                    zztu zztuVar5 = (zztu) message.obj;
                    this.zzu.zza(1);
                    zzF(this.zzr.zzl(i25, i26, zztuVar5), false);
                    break;
                case 21:
                    zztu zztuVar6 = (zztu) message.obj;
                    this.zzu.zza(1);
                    zzF(this.zzr.zzn(zztuVar6), false);
                    break;
                case 22:
                    zzF(this.zzr.zzb(), true);
                    break;
                case 23:
                    this.zzw = message.arg1 != 0;
                    zzL();
                    if (this.zzx && this.zzq.zze() != this.zzq.zzd()) {
                        zzP(true);
                        zzE(false);
                        break;
                    }
                    break;
                case 24:
                    boolean z21 = message.arg1 == 1;
                    if (z21 != this.zzE) {
                        this.zzE = z21;
                        zzjo zzjoVar10 = this.zzt;
                        int i27 = zzjoVar10.zze;
                        if (!z21 && i27 != 4 && i27 != 1) {
                            this.zzh.zzh(2);
                            break;
                        }
                        this.zzt = zzjoVar10.zzc(z21);
                    }
                    break;
                case 25:
                    zzP(true);
                    break;
                default:
                    return false;
            }
        } catch (zzbp e) {
            zzD(e, e.zzb == 1 ? true != e.zza ? 3003 : 3001 : 1000);
        } catch (zzes e2) {
            zzD(e2, e2.zza);
        } catch (zzgu e3) {
            zzgu zzguVar = e3;
            if (zzguVar.zze == 1 && (zze = this.zzq.zze()) != null) {
                zzguVar = zzguVar.zza(zze.zzf.zza);
            }
            if (zzguVar.zzk && this.zzK == null) {
                zzdn.zzb("ExoPlayerImplInternal", "Recoverable renderer error", zzguVar);
                this.zzK = zzguVar;
                zzdg zzdgVar = this.zzh;
                zzdgVar.zzj(zzdgVar.zzb(25, zzguVar));
            } else {
                zzgu zzguVar2 = this.zzK;
                if (zzguVar2 != null) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(zzguVar2, zzguVar);
                    } catch (Exception unused) {
                    }
                    zzguVar = this.zzK;
                }
                zzdn.zza("ExoPlayerImplInternal", "Playback error", zzguVar);
                z = true;
                zzU(true, false);
                this.zzt = this.zzt.zze(zzguVar);
            }
        } catch (zzpb e4) {
            zzD(e4, e4.zza);
        } catch (zzrd e5) {
            zzD(e5, PointerIconCompat.TYPE_HAND);
        } catch (IOException e6) {
            zzD(e6, 2000);
        } catch (RuntimeException e7) {
            zzgu zzd7 = zzgu.zzd(e7, ((e7 instanceof IllegalStateException) || (e7 instanceof IllegalArgumentException)) ? PointerIconCompat.TYPE_WAIT : 1000);
            zzdn.zza("ExoPlayerImplInternal", "Playback error", zzd7);
            zzU(true, false);
            this.zzt = this.zzt.zze(zzd7);
        }
        z = true;
        zzJ();
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzgr
    public final void zza(zzbt zzbtVar) {
        this.zzh.zzb(16, zzbtVar).zza();
    }

    public final Looper zzb() {
        return this.zzj;
    }

    final /* synthetic */ Boolean zzd() {
        return Boolean.valueOf(this.zzv);
    }

    @Override // com.google.android.gms.internal.ads.zzts
    public final /* bridge */ /* synthetic */ void zzg(zztt zzttVar) {
        this.zzh.zzb(9, (zzrz) zzttVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzjm
    public final void zzh() {
        this.zzh.zzh(22);
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final void zzi(zzrz zzrzVar) {
        this.zzh.zzb(8, zzrzVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void zzj() {
        this.zzh.zzh(10);
    }

    public final void zzk() {
        this.zzh.zza(0).zza();
    }

    public final void zzl(zzci zzciVar, int i, long j) {
        this.zzh.zzb(3, new zziw(zzciVar, i, j)).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public final synchronized void zzm(zzjr zzjrVar) {
        if (!this.zzv && this.zzi.isAlive()) {
            this.zzh.zzb(14, zzjrVar).zza();
            return;
        }
        Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        zzjrVar.zzh(false);
    }

    public final void zzn(boolean z, int i) {
        this.zzh.zzc(1, z ? 1 : 0, i).zza();
    }

    public final void zzo() {
        this.zzh.zza(6).zza();
    }

    public final synchronized boolean zzp() {
        if (!this.zzv && this.zzi.isAlive()) {
            this.zzh.zzh(7);
            zzaa(new zzio(this), 500L);
            return this.zzv;
        }
        return true;
    }

    public final void zzq(List list, int i, long j, zztu zztuVar) {
        this.zzh.zzb(17, new zzis(list, zztuVar, i, j, null, null)).zza();
    }
}
