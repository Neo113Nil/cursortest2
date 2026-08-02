package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzasu implements Handler.Callback, zzayb, zzazg, zzayd {
    private zzass zzA;
    private long zzB;
    private zzasq zzC;
    private zzasq zzD;
    private zzasq zzE;
    private zzath zzF;
    private boolean zzG;
    private boolean zzH;
    private int zzI;
    private volatile int zzJ;
    private volatile int zzK;
    private final zzcjv zzL;
    private final zzatb[] zza;
    private final zzazh zzc;
    private final zzban zzd;
    private final Handler zze;
    private final HandlerThread zzf;
    private final Handler zzg;
    private final zzasm zzh;
    private final zzatg zzi;
    private final zzatf zzj;
    private zzasr zzk;
    private zzata zzl;
    private zzatb zzm;
    private zzbag zzn;
    private zzaye zzo;
    private zzatb[] zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private boolean zzt;
    private int zzw;
    private int zzx;
    private long zzy;
    private int zzz;
    private int zzv = 0;
    private int zzu = 1;
    private final zzatc[] zzb = new zzatc[2];

    public zzasu(zzatb[] zzatbVarArr, zzazh zzazhVar, zzcjv zzcjvVar, boolean z, int i, Handler handler, zzasr zzasrVar, zzasm zzasmVar, byte[] bArr) {
        this.zza = zzatbVarArr;
        this.zzc = zzazhVar;
        this.zzL = zzcjvVar;
        this.zzr = z;
        this.zzg = handler;
        this.zzk = zzasrVar;
        this.zzh = zzasmVar;
        for (int i2 = 0; i2 < 2; i2++) {
            zzatbVarArr[i2].zzw(i2);
            this.zzb[i2] = zzatbVarArr[i2].zzf();
        }
        this.zzd = new zzban();
        this.zzp = new zzatb[0];
        this.zzi = new zzatg();
        this.zzj = new zzatf();
        zzazhVar.zzf(this);
        this.zzl = zzata.zza;
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.zzf = handlerThread;
        handlerThread.start();
        this.zze = new Handler(handlerThread.getLooper(), this);
    }

    private final void zzA(Object obj, int i) {
        this.zzk = new zzasr(0, 0L);
        zzD(obj, i);
        this.zzk = new zzasr(0, -9223372036854775807L);
        zzJ(4);
        zzE(false);
    }

    private final void zzB() {
        zzasq zzasqVar = this.zzC;
        long zza = !zzasqVar.zzj ? 0L : zzasqVar.zza.zza();
        if (zza == Long.MIN_VALUE) {
            zzH(false);
            return;
        }
        zzasq zzasqVar2 = this.zzC;
        long j = this.zzB - (zzasqVar2.zzf - zzasqVar2.zzh);
        boolean zzj = this.zzL.zzj(zza - j);
        zzH(zzj);
        if (zzj) {
            this.zzC.zza.zzbj(j);
        }
    }

    private final void zzC() throws IOException {
        zzasq zzasqVar = this.zzC;
        if (zzasqVar == null || zzasqVar.zzj) {
            return;
        }
        zzasq zzasqVar2 = this.zzD;
        if (zzasqVar2 == null || zzasqVar2.zzl == zzasqVar) {
            for (zzatb zzatbVar : this.zzp) {
                if (!zzatbVar.zzA()) {
                    return;
                }
            }
            this.zzC.zza.zzs();
        }
    }

    private final void zzD(Object obj, int i) {
        this.zzg.obtainMessage(6, new zzast(this.zzF, obj, this.zzk, i)).sendToTarget();
    }

    private final void zzE(boolean z) {
        this.zze.removeMessages(2);
        this.zzs = false;
        this.zzd.zzc();
        this.zzn = null;
        this.zzm = null;
        this.zzB = 60000000L;
        for (zzatb zzatbVar : this.zzp) {
            try {
                zzQ(zzatbVar);
                zzatbVar.zzj();
            } catch (zzasi | RuntimeException e) {
                Log.e("ExoPlayerImplInternal", "Stop failed.", e);
            }
        }
        this.zzp = new zzatb[0];
        zzasq zzasqVar = this.zzE;
        if (zzasqVar == null) {
            zzasqVar = this.zzC;
        }
        zzR(zzasqVar);
        this.zzC = null;
        this.zzD = null;
        this.zzE = null;
        zzH(false);
        if (z) {
            zzaye zzayeVar = this.zzo;
            if (zzayeVar != null) {
                zzayeVar.zzd();
                this.zzo = null;
            }
            this.zzF = null;
        }
    }

    private final void zzF(long j) throws zzasi {
        zzasq zzasqVar = this.zzE;
        long j2 = zzasqVar == null ? j + 60000000 : j + (zzasqVar.zzf - zzasqVar.zzh);
        this.zzB = j2;
        this.zzd.zza(j2);
        for (zzatb zzatbVar : this.zzp) {
            zzatbVar.zzu(this.zzB);
        }
    }

    private final void zzG(long j, long j2) {
        this.zze.removeMessages(2);
        long elapsedRealtime = (j + j2) - SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            this.zze.sendEmptyMessage(2);
        } else {
            this.zze.sendEmptyMessageDelayed(2, elapsedRealtime);
        }
    }

    private final void zzH(boolean z) {
        if (this.zzt != z) {
            this.zzt = z;
            this.zzg.obtainMessage(2, z ? 1 : 0, 0).sendToTarget();
        }
    }

    private final void zzI(zzasq zzasqVar) throws zzasi {
        if (this.zzE == zzasqVar) {
            return;
        }
        boolean[] zArr = new boolean[2];
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            zzatb zzatbVar = this.zza[i2];
            zArr[i2] = zzatbVar.zzb() != 0;
            zzayx zza = zzasqVar.zzm.zzb.zza(i2);
            if (zza != null) {
                i++;
            }
            if (zArr[i2] && (zza == null || (zzatbVar.zzB() && zzatbVar.zzh() == this.zzE.zzd[i2]))) {
                if (zzatbVar == this.zzm) {
                    this.zzd.zzd(this.zzn);
                    this.zzn = null;
                    this.zzm = null;
                }
                zzQ(zzatbVar);
                zzatbVar.zzj();
            }
        }
        this.zzE = zzasqVar;
        this.zzg.obtainMessage(3, zzasqVar.zzm).sendToTarget();
        zzz(zArr, i);
    }

    private final void zzJ(int i) {
        if (this.zzu != i) {
            this.zzu = i;
            this.zzg.obtainMessage(1, i, 0).sendToTarget();
        }
    }

    private final void zzK() throws zzasi {
        this.zzs = false;
        this.zzd.zzb();
        for (zzatb zzatbVar : this.zzp) {
            zzatbVar.zzy();
        }
    }

    private final void zzL() {
        zzE(true);
        this.zzL.zzc();
        zzJ(1);
    }

    private final void zzM() throws zzasi {
        this.zzd.zzc();
        for (zzatb zzatbVar : this.zzp) {
            zzQ(zzatbVar);
        }
    }

    private final void zzN() throws zzasi {
        zzasq zzasqVar = this.zzE;
        if (zzasqVar == null) {
            return;
        }
        long zzh = zzasqVar.zza.zzh();
        if (zzh != -9223372036854775807L) {
            zzF(zzh);
        } else {
            zzatb zzatbVar = this.zzm;
            if (zzatbVar == null || zzatbVar.zzE()) {
                this.zzB = this.zzd.zzI();
            } else {
                long zzI = this.zzn.zzI();
                this.zzB = zzI;
                this.zzd.zza(zzI);
            }
            zzasq zzasqVar2 = this.zzE;
            zzh = this.zzB - (zzasqVar2.zzf - zzasqVar2.zzh);
        }
        this.zzk.zzc = zzh;
        this.zzy = SystemClock.elapsedRealtime() * 1000;
        long zzg = this.zzp.length == 0 ? Long.MIN_VALUE : this.zzE.zza.zzg();
        zzasr zzasrVar = this.zzk;
        if (zzg == Long.MIN_VALUE) {
            zzg = this.zzF.zzd(this.zzE.zzg, this.zzj, false).zzc;
        }
        zzasrVar.zzd = zzg;
    }

    private final boolean zzO(int i) {
        this.zzF.zzd(i, this.zzj, false);
        this.zzF.zzg(0, this.zzi, false);
        return this.zzF.zzf(i, this.zzj, this.zzi, this.zzv) == -1;
    }

    private final boolean zzP(long j) {
        zzasq zzasqVar;
        return j == -9223372036854775807L || this.zzk.zzc < j || ((zzasqVar = this.zzE.zzl) != null && zzasqVar.zzj);
    }

    private static final void zzQ(zzatb zzatbVar) throws zzasi {
        if (zzatbVar.zzb() == 2) {
            zzatbVar.zzz();
        }
    }

    private static final void zzR(zzasq zzasqVar) {
        while (zzasqVar != null) {
            zzasqVar.zzc();
            zzasqVar = zzasqVar.zzl;
        }
    }

    private final int zzt(int i, zzath zzathVar, zzath zzathVar2) {
        int zzb = zzathVar.zzb();
        int i2 = -1;
        for (int i3 = 0; i3 < zzb && i2 == -1; i3++) {
            i = zzathVar.zzf(i, this.zzj, this.zzi, this.zzv);
            i2 = zzathVar2.zza(zzathVar.zzd(i, this.zzj, true).zzb);
        }
        return i2;
    }

    private final long zzu(int i, long j) throws zzasi {
        zzasq zzasqVar;
        zzM();
        this.zzs = false;
        zzJ(2);
        zzasq zzasqVar2 = this.zzE;
        if (zzasqVar2 == null) {
            zzasq zzasqVar3 = this.zzC;
            if (zzasqVar3 != null) {
                zzasqVar3.zzc();
            }
            zzasqVar = null;
        } else {
            zzasqVar = null;
            while (zzasqVar2 != null) {
                if (zzasqVar2.zzg == i && zzasqVar2.zzj) {
                    zzasqVar = zzasqVar2;
                } else {
                    zzasqVar2.zzc();
                }
                zzasqVar2 = zzasqVar2.zzl;
            }
        }
        zzasq zzasqVar4 = this.zzE;
        if (zzasqVar4 != zzasqVar || zzasqVar4 != this.zzD) {
            for (zzatb zzatbVar : this.zzp) {
                zzatbVar.zzj();
            }
            this.zzp = new zzatb[0];
            this.zzn = null;
            this.zzm = null;
            this.zzE = null;
        }
        if (zzasqVar != null) {
            zzasqVar.zzl = null;
            this.zzC = zzasqVar;
            this.zzD = zzasqVar;
            zzI(zzasqVar);
            zzasq zzasqVar5 = this.zzE;
            if (zzasqVar5.zzk) {
                j = zzasqVar5.zza.zzi(j);
            }
            zzF(j);
            zzB();
        } else {
            this.zzC = null;
            this.zzD = null;
            this.zzE = null;
            zzF(j);
        }
        this.zze.sendEmptyMessage(2);
        return j;
    }

    private final Pair zzv(int i, long j) {
        return zzw(this.zzF, 0, -9223372036854775807L);
    }

    private final Pair zzw(zzath zzathVar, int i, long j) {
        return zzx(zzathVar, 0, j, 0L);
    }

    private final Pair zzx(zzath zzathVar, int i, long j, long j2) {
        zzbac.zza(0, 0, zzathVar.zzc());
        zzathVar.zze(0, this.zzi, false, j2);
        if (j == -9223372036854775807L) {
            j = 0;
        }
        long j3 = zzathVar.zzd(0, this.zzj, false).zzc;
        if (j3 != -9223372036854775807L) {
            int i2 = (j > j3 ? 1 : (j == j3 ? 0 : -1));
        }
        return Pair.create(0, Long.valueOf(j));
    }

    private final Pair zzy(zzass zzassVar) {
        zzath zzathVar = zzassVar.zza;
        if (zzathVar.zzh()) {
            zzathVar = this.zzF;
        }
        try {
            int i = zzassVar.zzb;
            Pair zzw = zzw(zzathVar, 0, zzassVar.zzc);
            zzath zzathVar2 = this.zzF;
            if (zzathVar2 == zzathVar) {
                return zzw;
            }
            if (zzathVar2.zza(zzathVar.zzd(((Integer) zzw.first).intValue(), this.zzj, true).zzb) != -1) {
                return Pair.create(0, (Long) zzw.second);
            }
            if (zzt(((Integer) zzw.first).intValue(), zzathVar, this.zzF) == -1) {
                return null;
            }
            this.zzF.zzd(0, this.zzj, false);
            return zzv(0, -9223372036854775807L);
        } catch (IndexOutOfBoundsException unused) {
            zzath zzathVar3 = this.zzF;
            int i2 = zzassVar.zzb;
            throw new zzasy(zzathVar3, 0, zzassVar.zzc);
        }
    }

    private final void zzz(boolean[] zArr, int i) throws zzasi {
        int i2;
        this.zzp = new zzatb[i];
        int i3 = 0;
        int i4 = 0;
        while (i3 < 2) {
            zzatb zzatbVar = this.zza[i3];
            zzayx zza = this.zzE.zzm.zzb.zza(i3);
            if (zza != null) {
                int i5 = i4 + 1;
                this.zzp[i4] = zzatbVar;
                if (zzatbVar.zzb() == 0) {
                    zzatd zzatdVar = this.zzE.zzm.zzd[i3];
                    boolean z = this.zzr && this.zzu == 3;
                    boolean z2 = !zArr[i3] && z;
                    zza.zzb();
                    zzasw[] zzaswVarArr = new zzasw[1];
                    for (int i6 = 0; i6 <= 0; i6++) {
                        zzaswVarArr[i6] = zza.zzc(i6);
                    }
                    zzasq zzasqVar = this.zzE;
                    i2 = i3;
                    zzatbVar.zzk(zzatdVar, zzaswVarArr, zzasqVar.zzd[i3], this.zzB, z2, zzasqVar.zzf - zzasqVar.zzh);
                    zzbag zzi = zzatbVar.zzi();
                    if (zzi != null) {
                        if (this.zzn != null) {
                            throw zzasi.zzc(new IllegalStateException("Multiple renderer media clocks enabled."));
                        }
                        this.zzn = zzi;
                        this.zzm = zzatbVar;
                        zzi.zzK(this.zzl);
                    }
                    if (z) {
                        zzatbVar.zzy();
                    }
                } else {
                    i2 = i3;
                }
                i4 = i5;
            } else {
                i2 = i3;
            }
            i3 = i2 + 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:221:0x0332, code lost:
    
        if (r2 != false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0334, code lost:
    
        r2 = r33.zzE.zzg;
        r33.zzk = new com.google.android.gms.internal.ads.zzasr(r2, zzu(r2, r33.zzk.zzc));
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0348, code lost:
    
        r33.zzC = r3;
        r3.zzl = null;
        zzR(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x079a, code lost:
    
        if (zzP(r1) != false) goto L422;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006a, code lost:
    
        zzR(r12);
        r2.zzl = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:180:0x026a A[Catch: IOException -> 0x0810, zzasi -> 0x0815, RuntimeException -> 0x0892, TryCatch #0 {RuntimeException -> 0x0892, blocks: (B:3:0x0005, B:10:0x001a, B:12:0x0022, B:16:0x0028, B:19:0x002f, B:22:0x0036, B:23:0x0042, B:26:0x0048, B:28:0x004c, B:31:0x0053, B:35:0x005b, B:41:0x006a, B:42:0x006f, B:44:0x0079, B:46:0x007d, B:48:0x0081, B:49:0x0092, B:52:0x0098, B:57:0x009c, B:67:0x00ba, B:76:0x00c8, B:79:0x00cb, B:83:0x00d5, B:88:0x00d9, B:89:0x00da, B:93:0x00e1, B:95:0x00e7, B:106:0x00ef, B:109:0x00f8, B:111:0x0117, B:112:0x011e, B:114:0x0124, B:117:0x0131, B:119:0x013b, B:121:0x013f, B:123:0x0145, B:126:0x014b, B:127:0x0152, B:128:0x0156, B:131:0x015d, B:133:0x0161, B:130:0x0166, B:139:0x0169, B:140:0x019d, B:142:0x0178, B:144:0x017e, B:146:0x0184, B:148:0x018c, B:97:0x01a9, B:101:0x01b0, B:153:0x01b6, B:155:0x01be, B:157:0x01c2, B:159:0x01c6, B:161:0x01ce, B:164:0x01d3, B:166:0x01e4, B:167:0x01f2, B:169:0x01f6, B:171:0x0206, B:173:0x020a, B:175:0x0218, B:177:0x021d, B:178:0x0266, B:180:0x026a, B:182:0x026e, B:183:0x0273, B:185:0x027d, B:187:0x0287, B:188:0x028c, B:189:0x02b4, B:191:0x02b8, B:195:0x02c3, B:199:0x02c6, B:200:0x02d6, B:203:0x02e5, B:205:0x02eb, B:207:0x02fc, B:209:0x0300, B:211:0x030e, B:213:0x0320, B:217:0x032f, B:222:0x0334, B:224:0x0348, B:223:0x034f, B:228:0x0235, B:230:0x023d, B:232:0x0245, B:233:0x024a, B:235:0x0353, B:236:0x035e, B:245:0x0369, B:246:0x036a, B:248:0x036e, B:250:0x0376, B:251:0x0380, B:253:0x037b, B:254:0x038c, B:256:0x0394, B:258:0x039d, B:260:0x03a3, B:261:0x03c1, B:264:0x03ca, B:271:0x03ec, B:272:0x03f9, B:278:0x0409, B:282:0x0419, B:283:0x042a, B:285:0x042b, B:287:0x0435, B:288:0x0679, B:290:0x067f, B:293:0x0688, B:295:0x06a3, B:297:0x06ae, B:300:0x06b7, B:302:0x06bd, B:307:0x06c9, B:312:0x06d3, B:319:0x06da, B:320:0x06dd, B:322:0x06e1, B:324:0x06ed, B:325:0x0700, B:329:0x071a, B:331:0x0722, B:333:0x0728, B:334:0x07c2, B:336:0x07c7, B:338:0x07cd, B:340:0x07d5, B:342:0x07d9, B:344:0x07e3, B:346:0x07e7, B:347:0x07ed, B:348:0x080a, B:350:0x07de, B:352:0x07f1, B:354:0x07f6, B:356:0x07fa, B:357:0x0800, B:359:0x0804, B:360:0x0731, B:362:0x0736, B:365:0x073d, B:367:0x0745, B:370:0x0754, B:373:0x079c, B:375:0x07a4, B:376:0x075b, B:377:0x0768, B:379:0x076c, B:382:0x0782, B:383:0x0748, B:384:0x0796, B:388:0x07ab, B:392:0x07b7, B:393:0x07b1, B:394:0x043d, B:396:0x0441, B:397:0x047b, B:399:0x0483, B:401:0x0556, B:403:0x055a, B:406:0x0561, B:408:0x0565, B:410:0x0569, B:411:0x0570, B:413:0x0574, B:415:0x057a, B:417:0x0584, B:419:0x05ab, B:424:0x05b3, B:426:0x05bf, B:428:0x05c5, B:430:0x05cb, B:432:0x05ce, B:440:0x05d5, B:443:0x05e7, B:447:0x05ed, B:451:0x05f0, B:453:0x05f6, B:455:0x05fa, B:457:0x060a, B:461:0x066f, B:464:0x0624, B:465:0x0628, B:467:0x062e, B:469:0x063e, B:471:0x0644, B:473:0x064c, B:475:0x0655, B:476:0x065b, B:478:0x0668, B:482:0x056d, B:483:0x048a, B:485:0x048e, B:487:0x04e8, B:489:0x04ec, B:491:0x0506, B:494:0x0512, B:496:0x0548, B:497:0x054a, B:498:0x050d, B:499:0x04f3, B:500:0x0495, B:503:0x04a6, B:505:0x04d7, B:506:0x0446, B:508:0x044c, B:510:0x0452, B:512:0x0460, B:514:0x0464, B:516:0x046f, B:517:0x081a, B:520:0x0821, B:522:0x0828, B:525:0x0830, B:527:0x0835, B:530:0x0842, B:532:0x0849, B:535:0x0856, B:536:0x0859, B:538:0x0860, B:539:0x086c, B:541:0x0871), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x026e A[Catch: IOException -> 0x0810, zzasi -> 0x0815, RuntimeException -> 0x0892, TryCatch #0 {RuntimeException -> 0x0892, blocks: (B:3:0x0005, B:10:0x001a, B:12:0x0022, B:16:0x0028, B:19:0x002f, B:22:0x0036, B:23:0x0042, B:26:0x0048, B:28:0x004c, B:31:0x0053, B:35:0x005b, B:41:0x006a, B:42:0x006f, B:44:0x0079, B:46:0x007d, B:48:0x0081, B:49:0x0092, B:52:0x0098, B:57:0x009c, B:67:0x00ba, B:76:0x00c8, B:79:0x00cb, B:83:0x00d5, B:88:0x00d9, B:89:0x00da, B:93:0x00e1, B:95:0x00e7, B:106:0x00ef, B:109:0x00f8, B:111:0x0117, B:112:0x011e, B:114:0x0124, B:117:0x0131, B:119:0x013b, B:121:0x013f, B:123:0x0145, B:126:0x014b, B:127:0x0152, B:128:0x0156, B:131:0x015d, B:133:0x0161, B:130:0x0166, B:139:0x0169, B:140:0x019d, B:142:0x0178, B:144:0x017e, B:146:0x0184, B:148:0x018c, B:97:0x01a9, B:101:0x01b0, B:153:0x01b6, B:155:0x01be, B:157:0x01c2, B:159:0x01c6, B:161:0x01ce, B:164:0x01d3, B:166:0x01e4, B:167:0x01f2, B:169:0x01f6, B:171:0x0206, B:173:0x020a, B:175:0x0218, B:177:0x021d, B:178:0x0266, B:180:0x026a, B:182:0x026e, B:183:0x0273, B:185:0x027d, B:187:0x0287, B:188:0x028c, B:189:0x02b4, B:191:0x02b8, B:195:0x02c3, B:199:0x02c6, B:200:0x02d6, B:203:0x02e5, B:205:0x02eb, B:207:0x02fc, B:209:0x0300, B:211:0x030e, B:213:0x0320, B:217:0x032f, B:222:0x0334, B:224:0x0348, B:223:0x034f, B:228:0x0235, B:230:0x023d, B:232:0x0245, B:233:0x024a, B:235:0x0353, B:236:0x035e, B:245:0x0369, B:246:0x036a, B:248:0x036e, B:250:0x0376, B:251:0x0380, B:253:0x037b, B:254:0x038c, B:256:0x0394, B:258:0x039d, B:260:0x03a3, B:261:0x03c1, B:264:0x03ca, B:271:0x03ec, B:272:0x03f9, B:278:0x0409, B:282:0x0419, B:283:0x042a, B:285:0x042b, B:287:0x0435, B:288:0x0679, B:290:0x067f, B:293:0x0688, B:295:0x06a3, B:297:0x06ae, B:300:0x06b7, B:302:0x06bd, B:307:0x06c9, B:312:0x06d3, B:319:0x06da, B:320:0x06dd, B:322:0x06e1, B:324:0x06ed, B:325:0x0700, B:329:0x071a, B:331:0x0722, B:333:0x0728, B:334:0x07c2, B:336:0x07c7, B:338:0x07cd, B:340:0x07d5, B:342:0x07d9, B:344:0x07e3, B:346:0x07e7, B:347:0x07ed, B:348:0x080a, B:350:0x07de, B:352:0x07f1, B:354:0x07f6, B:356:0x07fa, B:357:0x0800, B:359:0x0804, B:360:0x0731, B:362:0x0736, B:365:0x073d, B:367:0x0745, B:370:0x0754, B:373:0x079c, B:375:0x07a4, B:376:0x075b, B:377:0x0768, B:379:0x076c, B:382:0x0782, B:383:0x0748, B:384:0x0796, B:388:0x07ab, B:392:0x07b7, B:393:0x07b1, B:394:0x043d, B:396:0x0441, B:397:0x047b, B:399:0x0483, B:401:0x0556, B:403:0x055a, B:406:0x0561, B:408:0x0565, B:410:0x0569, B:411:0x0570, B:413:0x0574, B:415:0x057a, B:417:0x0584, B:419:0x05ab, B:424:0x05b3, B:426:0x05bf, B:428:0x05c5, B:430:0x05cb, B:432:0x05ce, B:440:0x05d5, B:443:0x05e7, B:447:0x05ed, B:451:0x05f0, B:453:0x05f6, B:455:0x05fa, B:457:0x060a, B:461:0x066f, B:464:0x0624, B:465:0x0628, B:467:0x062e, B:469:0x063e, B:471:0x0644, B:473:0x064c, B:475:0x0655, B:476:0x065b, B:478:0x0668, B:482:0x056d, B:483:0x048a, B:485:0x048e, B:487:0x04e8, B:489:0x04ec, B:491:0x0506, B:494:0x0512, B:496:0x0548, B:497:0x054a, B:498:0x050d, B:499:0x04f3, B:500:0x0495, B:503:0x04a6, B:505:0x04d7, B:506:0x0446, B:508:0x044c, B:510:0x0452, B:512:0x0460, B:514:0x0464, B:516:0x046f, B:517:0x081a, B:520:0x0821, B:522:0x0828, B:525:0x0830, B:527:0x0835, B:530:0x0842, B:532:0x0849, B:535:0x0856, B:536:0x0859, B:538:0x0860, B:539:0x086c, B:541:0x0871), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0273 A[Catch: IOException -> 0x0810, zzasi -> 0x0815, RuntimeException -> 0x0892, TryCatch #0 {RuntimeException -> 0x0892, blocks: (B:3:0x0005, B:10:0x001a, B:12:0x0022, B:16:0x0028, B:19:0x002f, B:22:0x0036, B:23:0x0042, B:26:0x0048, B:28:0x004c, B:31:0x0053, B:35:0x005b, B:41:0x006a, B:42:0x006f, B:44:0x0079, B:46:0x007d, B:48:0x0081, B:49:0x0092, B:52:0x0098, B:57:0x009c, B:67:0x00ba, B:76:0x00c8, B:79:0x00cb, B:83:0x00d5, B:88:0x00d9, B:89:0x00da, B:93:0x00e1, B:95:0x00e7, B:106:0x00ef, B:109:0x00f8, B:111:0x0117, B:112:0x011e, B:114:0x0124, B:117:0x0131, B:119:0x013b, B:121:0x013f, B:123:0x0145, B:126:0x014b, B:127:0x0152, B:128:0x0156, B:131:0x015d, B:133:0x0161, B:130:0x0166, B:139:0x0169, B:140:0x019d, B:142:0x0178, B:144:0x017e, B:146:0x0184, B:148:0x018c, B:97:0x01a9, B:101:0x01b0, B:153:0x01b6, B:155:0x01be, B:157:0x01c2, B:159:0x01c6, B:161:0x01ce, B:164:0x01d3, B:166:0x01e4, B:167:0x01f2, B:169:0x01f6, B:171:0x0206, B:173:0x020a, B:175:0x0218, B:177:0x021d, B:178:0x0266, B:180:0x026a, B:182:0x026e, B:183:0x0273, B:185:0x027d, B:187:0x0287, B:188:0x028c, B:189:0x02b4, B:191:0x02b8, B:195:0x02c3, B:199:0x02c6, B:200:0x02d6, B:203:0x02e5, B:205:0x02eb, B:207:0x02fc, B:209:0x0300, B:211:0x030e, B:213:0x0320, B:217:0x032f, B:222:0x0334, B:224:0x0348, B:223:0x034f, B:228:0x0235, B:230:0x023d, B:232:0x0245, B:233:0x024a, B:235:0x0353, B:236:0x035e, B:245:0x0369, B:246:0x036a, B:248:0x036e, B:250:0x0376, B:251:0x0380, B:253:0x037b, B:254:0x038c, B:256:0x0394, B:258:0x039d, B:260:0x03a3, B:261:0x03c1, B:264:0x03ca, B:271:0x03ec, B:272:0x03f9, B:278:0x0409, B:282:0x0419, B:283:0x042a, B:285:0x042b, B:287:0x0435, B:288:0x0679, B:290:0x067f, B:293:0x0688, B:295:0x06a3, B:297:0x06ae, B:300:0x06b7, B:302:0x06bd, B:307:0x06c9, B:312:0x06d3, B:319:0x06da, B:320:0x06dd, B:322:0x06e1, B:324:0x06ed, B:325:0x0700, B:329:0x071a, B:331:0x0722, B:333:0x0728, B:334:0x07c2, B:336:0x07c7, B:338:0x07cd, B:340:0x07d5, B:342:0x07d9, B:344:0x07e3, B:346:0x07e7, B:347:0x07ed, B:348:0x080a, B:350:0x07de, B:352:0x07f1, B:354:0x07f6, B:356:0x07fa, B:357:0x0800, B:359:0x0804, B:360:0x0731, B:362:0x0736, B:365:0x073d, B:367:0x0745, B:370:0x0754, B:373:0x079c, B:375:0x07a4, B:376:0x075b, B:377:0x0768, B:379:0x076c, B:382:0x0782, B:383:0x0748, B:384:0x0796, B:388:0x07ab, B:392:0x07b7, B:393:0x07b1, B:394:0x043d, B:396:0x0441, B:397:0x047b, B:399:0x0483, B:401:0x0556, B:403:0x055a, B:406:0x0561, B:408:0x0565, B:410:0x0569, B:411:0x0570, B:413:0x0574, B:415:0x057a, B:417:0x0584, B:419:0x05ab, B:424:0x05b3, B:426:0x05bf, B:428:0x05c5, B:430:0x05cb, B:432:0x05ce, B:440:0x05d5, B:443:0x05e7, B:447:0x05ed, B:451:0x05f0, B:453:0x05f6, B:455:0x05fa, B:457:0x060a, B:461:0x066f, B:464:0x0624, B:465:0x0628, B:467:0x062e, B:469:0x063e, B:471:0x0644, B:473:0x064c, B:475:0x0655, B:476:0x065b, B:478:0x0668, B:482:0x056d, B:483:0x048a, B:485:0x048e, B:487:0x04e8, B:489:0x04ec, B:491:0x0506, B:494:0x0512, B:496:0x0548, B:497:0x054a, B:498:0x050d, B:499:0x04f3, B:500:0x0495, B:503:0x04a6, B:505:0x04d7, B:506:0x0446, B:508:0x044c, B:510:0x0452, B:512:0x0460, B:514:0x0464, B:516:0x046f, B:517:0x081a, B:520:0x0821, B:522:0x0828, B:525:0x0830, B:527:0x0835, B:530:0x0842, B:532:0x0849, B:535:0x0856, B:536:0x0859, B:538:0x0860, B:539:0x086c, B:541:0x0871), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:307:0x06c9 A[Catch: IOException -> 0x0886, zzasi -> 0x088c, RuntimeException -> 0x0892, TryCatch #0 {RuntimeException -> 0x0892, blocks: (B:3:0x0005, B:10:0x001a, B:12:0x0022, B:16:0x0028, B:19:0x002f, B:22:0x0036, B:23:0x0042, B:26:0x0048, B:28:0x004c, B:31:0x0053, B:35:0x005b, B:41:0x006a, B:42:0x006f, B:44:0x0079, B:46:0x007d, B:48:0x0081, B:49:0x0092, B:52:0x0098, B:57:0x009c, B:67:0x00ba, B:76:0x00c8, B:79:0x00cb, B:83:0x00d5, B:88:0x00d9, B:89:0x00da, B:93:0x00e1, B:95:0x00e7, B:106:0x00ef, B:109:0x00f8, B:111:0x0117, B:112:0x011e, B:114:0x0124, B:117:0x0131, B:119:0x013b, B:121:0x013f, B:123:0x0145, B:126:0x014b, B:127:0x0152, B:128:0x0156, B:131:0x015d, B:133:0x0161, B:130:0x0166, B:139:0x0169, B:140:0x019d, B:142:0x0178, B:144:0x017e, B:146:0x0184, B:148:0x018c, B:97:0x01a9, B:101:0x01b0, B:153:0x01b6, B:155:0x01be, B:157:0x01c2, B:159:0x01c6, B:161:0x01ce, B:164:0x01d3, B:166:0x01e4, B:167:0x01f2, B:169:0x01f6, B:171:0x0206, B:173:0x020a, B:175:0x0218, B:177:0x021d, B:178:0x0266, B:180:0x026a, B:182:0x026e, B:183:0x0273, B:185:0x027d, B:187:0x0287, B:188:0x028c, B:189:0x02b4, B:191:0x02b8, B:195:0x02c3, B:199:0x02c6, B:200:0x02d6, B:203:0x02e5, B:205:0x02eb, B:207:0x02fc, B:209:0x0300, B:211:0x030e, B:213:0x0320, B:217:0x032f, B:222:0x0334, B:224:0x0348, B:223:0x034f, B:228:0x0235, B:230:0x023d, B:232:0x0245, B:233:0x024a, B:235:0x0353, B:236:0x035e, B:245:0x0369, B:246:0x036a, B:248:0x036e, B:250:0x0376, B:251:0x0380, B:253:0x037b, B:254:0x038c, B:256:0x0394, B:258:0x039d, B:260:0x03a3, B:261:0x03c1, B:264:0x03ca, B:271:0x03ec, B:272:0x03f9, B:278:0x0409, B:282:0x0419, B:283:0x042a, B:285:0x042b, B:287:0x0435, B:288:0x0679, B:290:0x067f, B:293:0x0688, B:295:0x06a3, B:297:0x06ae, B:300:0x06b7, B:302:0x06bd, B:307:0x06c9, B:312:0x06d3, B:319:0x06da, B:320:0x06dd, B:322:0x06e1, B:324:0x06ed, B:325:0x0700, B:329:0x071a, B:331:0x0722, B:333:0x0728, B:334:0x07c2, B:336:0x07c7, B:338:0x07cd, B:340:0x07d5, B:342:0x07d9, B:344:0x07e3, B:346:0x07e7, B:347:0x07ed, B:348:0x080a, B:350:0x07de, B:352:0x07f1, B:354:0x07f6, B:356:0x07fa, B:357:0x0800, B:359:0x0804, B:360:0x0731, B:362:0x0736, B:365:0x073d, B:367:0x0745, B:370:0x0754, B:373:0x079c, B:375:0x07a4, B:376:0x075b, B:377:0x0768, B:379:0x076c, B:382:0x0782, B:383:0x0748, B:384:0x0796, B:388:0x07ab, B:392:0x07b7, B:393:0x07b1, B:394:0x043d, B:396:0x0441, B:397:0x047b, B:399:0x0483, B:401:0x0556, B:403:0x055a, B:406:0x0561, B:408:0x0565, B:410:0x0569, B:411:0x0570, B:413:0x0574, B:415:0x057a, B:417:0x0584, B:419:0x05ab, B:424:0x05b3, B:426:0x05bf, B:428:0x05c5, B:430:0x05cb, B:432:0x05ce, B:440:0x05d5, B:443:0x05e7, B:447:0x05ed, B:451:0x05f0, B:453:0x05f6, B:455:0x05fa, B:457:0x060a, B:461:0x066f, B:464:0x0624, B:465:0x0628, B:467:0x062e, B:469:0x063e, B:471:0x0644, B:473:0x064c, B:475:0x0655, B:476:0x065b, B:478:0x0668, B:482:0x056d, B:483:0x048a, B:485:0x048e, B:487:0x04e8, B:489:0x04ec, B:491:0x0506, B:494:0x0512, B:496:0x0548, B:497:0x054a, B:498:0x050d, B:499:0x04f3, B:500:0x0495, B:503:0x04a6, B:505:0x04d7, B:506:0x0446, B:508:0x044c, B:510:0x0452, B:512:0x0460, B:514:0x0464, B:516:0x046f, B:517:0x081a, B:520:0x0821, B:522:0x0828, B:525:0x0830, B:527:0x0835, B:530:0x0842, B:532:0x0849, B:535:0x0856, B:536:0x0859, B:538:0x0860, B:539:0x086c, B:541:0x0871), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:375:0x07a4 A[Catch: IOException -> 0x0886, zzasi -> 0x088c, RuntimeException -> 0x0892, TryCatch #0 {RuntimeException -> 0x0892, blocks: (B:3:0x0005, B:10:0x001a, B:12:0x0022, B:16:0x0028, B:19:0x002f, B:22:0x0036, B:23:0x0042, B:26:0x0048, B:28:0x004c, B:31:0x0053, B:35:0x005b, B:41:0x006a, B:42:0x006f, B:44:0x0079, B:46:0x007d, B:48:0x0081, B:49:0x0092, B:52:0x0098, B:57:0x009c, B:67:0x00ba, B:76:0x00c8, B:79:0x00cb, B:83:0x00d5, B:88:0x00d9, B:89:0x00da, B:93:0x00e1, B:95:0x00e7, B:106:0x00ef, B:109:0x00f8, B:111:0x0117, B:112:0x011e, B:114:0x0124, B:117:0x0131, B:119:0x013b, B:121:0x013f, B:123:0x0145, B:126:0x014b, B:127:0x0152, B:128:0x0156, B:131:0x015d, B:133:0x0161, B:130:0x0166, B:139:0x0169, B:140:0x019d, B:142:0x0178, B:144:0x017e, B:146:0x0184, B:148:0x018c, B:97:0x01a9, B:101:0x01b0, B:153:0x01b6, B:155:0x01be, B:157:0x01c2, B:159:0x01c6, B:161:0x01ce, B:164:0x01d3, B:166:0x01e4, B:167:0x01f2, B:169:0x01f6, B:171:0x0206, B:173:0x020a, B:175:0x0218, B:177:0x021d, B:178:0x0266, B:180:0x026a, B:182:0x026e, B:183:0x0273, B:185:0x027d, B:187:0x0287, B:188:0x028c, B:189:0x02b4, B:191:0x02b8, B:195:0x02c3, B:199:0x02c6, B:200:0x02d6, B:203:0x02e5, B:205:0x02eb, B:207:0x02fc, B:209:0x0300, B:211:0x030e, B:213:0x0320, B:217:0x032f, B:222:0x0334, B:224:0x0348, B:223:0x034f, B:228:0x0235, B:230:0x023d, B:232:0x0245, B:233:0x024a, B:235:0x0353, B:236:0x035e, B:245:0x0369, B:246:0x036a, B:248:0x036e, B:250:0x0376, B:251:0x0380, B:253:0x037b, B:254:0x038c, B:256:0x0394, B:258:0x039d, B:260:0x03a3, B:261:0x03c1, B:264:0x03ca, B:271:0x03ec, B:272:0x03f9, B:278:0x0409, B:282:0x0419, B:283:0x042a, B:285:0x042b, B:287:0x0435, B:288:0x0679, B:290:0x067f, B:293:0x0688, B:295:0x06a3, B:297:0x06ae, B:300:0x06b7, B:302:0x06bd, B:307:0x06c9, B:312:0x06d3, B:319:0x06da, B:320:0x06dd, B:322:0x06e1, B:324:0x06ed, B:325:0x0700, B:329:0x071a, B:331:0x0722, B:333:0x0728, B:334:0x07c2, B:336:0x07c7, B:338:0x07cd, B:340:0x07d5, B:342:0x07d9, B:344:0x07e3, B:346:0x07e7, B:347:0x07ed, B:348:0x080a, B:350:0x07de, B:352:0x07f1, B:354:0x07f6, B:356:0x07fa, B:357:0x0800, B:359:0x0804, B:360:0x0731, B:362:0x0736, B:365:0x073d, B:367:0x0745, B:370:0x0754, B:373:0x079c, B:375:0x07a4, B:376:0x075b, B:377:0x0768, B:379:0x076c, B:382:0x0782, B:383:0x0748, B:384:0x0796, B:388:0x07ab, B:392:0x07b7, B:393:0x07b1, B:394:0x043d, B:396:0x0441, B:397:0x047b, B:399:0x0483, B:401:0x0556, B:403:0x055a, B:406:0x0561, B:408:0x0565, B:410:0x0569, B:411:0x0570, B:413:0x0574, B:415:0x057a, B:417:0x0584, B:419:0x05ab, B:424:0x05b3, B:426:0x05bf, B:428:0x05c5, B:430:0x05cb, B:432:0x05ce, B:440:0x05d5, B:443:0x05e7, B:447:0x05ed, B:451:0x05f0, B:453:0x05f6, B:455:0x05fa, B:457:0x060a, B:461:0x066f, B:464:0x0624, B:465:0x0628, B:467:0x062e, B:469:0x063e, B:471:0x0644, B:473:0x064c, B:475:0x0655, B:476:0x065b, B:478:0x0668, B:482:0x056d, B:483:0x048a, B:485:0x048e, B:487:0x04e8, B:489:0x04ec, B:491:0x0506, B:494:0x0512, B:496:0x0548, B:497:0x054a, B:498:0x050d, B:499:0x04f3, B:500:0x0495, B:503:0x04a6, B:505:0x04d7, B:506:0x0446, B:508:0x044c, B:510:0x0452, B:512:0x0460, B:514:0x0464, B:516:0x046f, B:517:0x081a, B:520:0x0821, B:522:0x0828, B:525:0x0830, B:527:0x0835, B:530:0x0842, B:532:0x0849, B:535:0x0856, B:536:0x0859, B:538:0x0860, B:539:0x086c, B:541:0x0871), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:403:0x055a A[Catch: IOException -> 0x0810, zzasi -> 0x0815, RuntimeException -> 0x0892, TryCatch #0 {RuntimeException -> 0x0892, blocks: (B:3:0x0005, B:10:0x001a, B:12:0x0022, B:16:0x0028, B:19:0x002f, B:22:0x0036, B:23:0x0042, B:26:0x0048, B:28:0x004c, B:31:0x0053, B:35:0x005b, B:41:0x006a, B:42:0x006f, B:44:0x0079, B:46:0x007d, B:48:0x0081, B:49:0x0092, B:52:0x0098, B:57:0x009c, B:67:0x00ba, B:76:0x00c8, B:79:0x00cb, B:83:0x00d5, B:88:0x00d9, B:89:0x00da, B:93:0x00e1, B:95:0x00e7, B:106:0x00ef, B:109:0x00f8, B:111:0x0117, B:112:0x011e, B:114:0x0124, B:117:0x0131, B:119:0x013b, B:121:0x013f, B:123:0x0145, B:126:0x014b, B:127:0x0152, B:128:0x0156, B:131:0x015d, B:133:0x0161, B:130:0x0166, B:139:0x0169, B:140:0x019d, B:142:0x0178, B:144:0x017e, B:146:0x0184, B:148:0x018c, B:97:0x01a9, B:101:0x01b0, B:153:0x01b6, B:155:0x01be, B:157:0x01c2, B:159:0x01c6, B:161:0x01ce, B:164:0x01d3, B:166:0x01e4, B:167:0x01f2, B:169:0x01f6, B:171:0x0206, B:173:0x020a, B:175:0x0218, B:177:0x021d, B:178:0x0266, B:180:0x026a, B:182:0x026e, B:183:0x0273, B:185:0x027d, B:187:0x0287, B:188:0x028c, B:189:0x02b4, B:191:0x02b8, B:195:0x02c3, B:199:0x02c6, B:200:0x02d6, B:203:0x02e5, B:205:0x02eb, B:207:0x02fc, B:209:0x0300, B:211:0x030e, B:213:0x0320, B:217:0x032f, B:222:0x0334, B:224:0x0348, B:223:0x034f, B:228:0x0235, B:230:0x023d, B:232:0x0245, B:233:0x024a, B:235:0x0353, B:236:0x035e, B:245:0x0369, B:246:0x036a, B:248:0x036e, B:250:0x0376, B:251:0x0380, B:253:0x037b, B:254:0x038c, B:256:0x0394, B:258:0x039d, B:260:0x03a3, B:261:0x03c1, B:264:0x03ca, B:271:0x03ec, B:272:0x03f9, B:278:0x0409, B:282:0x0419, B:283:0x042a, B:285:0x042b, B:287:0x0435, B:288:0x0679, B:290:0x067f, B:293:0x0688, B:295:0x06a3, B:297:0x06ae, B:300:0x06b7, B:302:0x06bd, B:307:0x06c9, B:312:0x06d3, B:319:0x06da, B:320:0x06dd, B:322:0x06e1, B:324:0x06ed, B:325:0x0700, B:329:0x071a, B:331:0x0722, B:333:0x0728, B:334:0x07c2, B:336:0x07c7, B:338:0x07cd, B:340:0x07d5, B:342:0x07d9, B:344:0x07e3, B:346:0x07e7, B:347:0x07ed, B:348:0x080a, B:350:0x07de, B:352:0x07f1, B:354:0x07f6, B:356:0x07fa, B:357:0x0800, B:359:0x0804, B:360:0x0731, B:362:0x0736, B:365:0x073d, B:367:0x0745, B:370:0x0754, B:373:0x079c, B:375:0x07a4, B:376:0x075b, B:377:0x0768, B:379:0x076c, B:382:0x0782, B:383:0x0748, B:384:0x0796, B:388:0x07ab, B:392:0x07b7, B:393:0x07b1, B:394:0x043d, B:396:0x0441, B:397:0x047b, B:399:0x0483, B:401:0x0556, B:403:0x055a, B:406:0x0561, B:408:0x0565, B:410:0x0569, B:411:0x0570, B:413:0x0574, B:415:0x057a, B:417:0x0584, B:419:0x05ab, B:424:0x05b3, B:426:0x05bf, B:428:0x05c5, B:430:0x05cb, B:432:0x05ce, B:440:0x05d5, B:443:0x05e7, B:447:0x05ed, B:451:0x05f0, B:453:0x05f6, B:455:0x05fa, B:457:0x060a, B:461:0x066f, B:464:0x0624, B:465:0x0628, B:467:0x062e, B:469:0x063e, B:471:0x0644, B:473:0x064c, B:475:0x0655, B:476:0x065b, B:478:0x0668, B:482:0x056d, B:483:0x048a, B:485:0x048e, B:487:0x04e8, B:489:0x04ec, B:491:0x0506, B:494:0x0512, B:496:0x0548, B:497:0x054a, B:498:0x050d, B:499:0x04f3, B:500:0x0495, B:503:0x04a6, B:505:0x04d7, B:506:0x0446, B:508:0x044c, B:510:0x0452, B:512:0x0460, B:514:0x0464, B:516:0x046f, B:517:0x081a, B:520:0x0821, B:522:0x0828, B:525:0x0830, B:527:0x0835, B:530:0x0842, B:532:0x0849, B:535:0x0856, B:536:0x0859, B:538:0x0860, B:539:0x086c, B:541:0x0871), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0574 A[Catch: IOException -> 0x0810, zzasi -> 0x0815, RuntimeException -> 0x0892, LOOP:9: B:413:0x0574->B:417:0x0584, LOOP_START, TryCatch #0 {RuntimeException -> 0x0892, blocks: (B:3:0x0005, B:10:0x001a, B:12:0x0022, B:16:0x0028, B:19:0x002f, B:22:0x0036, B:23:0x0042, B:26:0x0048, B:28:0x004c, B:31:0x0053, B:35:0x005b, B:41:0x006a, B:42:0x006f, B:44:0x0079, B:46:0x007d, B:48:0x0081, B:49:0x0092, B:52:0x0098, B:57:0x009c, B:67:0x00ba, B:76:0x00c8, B:79:0x00cb, B:83:0x00d5, B:88:0x00d9, B:89:0x00da, B:93:0x00e1, B:95:0x00e7, B:106:0x00ef, B:109:0x00f8, B:111:0x0117, B:112:0x011e, B:114:0x0124, B:117:0x0131, B:119:0x013b, B:121:0x013f, B:123:0x0145, B:126:0x014b, B:127:0x0152, B:128:0x0156, B:131:0x015d, B:133:0x0161, B:130:0x0166, B:139:0x0169, B:140:0x019d, B:142:0x0178, B:144:0x017e, B:146:0x0184, B:148:0x018c, B:97:0x01a9, B:101:0x01b0, B:153:0x01b6, B:155:0x01be, B:157:0x01c2, B:159:0x01c6, B:161:0x01ce, B:164:0x01d3, B:166:0x01e4, B:167:0x01f2, B:169:0x01f6, B:171:0x0206, B:173:0x020a, B:175:0x0218, B:177:0x021d, B:178:0x0266, B:180:0x026a, B:182:0x026e, B:183:0x0273, B:185:0x027d, B:187:0x0287, B:188:0x028c, B:189:0x02b4, B:191:0x02b8, B:195:0x02c3, B:199:0x02c6, B:200:0x02d6, B:203:0x02e5, B:205:0x02eb, B:207:0x02fc, B:209:0x0300, B:211:0x030e, B:213:0x0320, B:217:0x032f, B:222:0x0334, B:224:0x0348, B:223:0x034f, B:228:0x0235, B:230:0x023d, B:232:0x0245, B:233:0x024a, B:235:0x0353, B:236:0x035e, B:245:0x0369, B:246:0x036a, B:248:0x036e, B:250:0x0376, B:251:0x0380, B:253:0x037b, B:254:0x038c, B:256:0x0394, B:258:0x039d, B:260:0x03a3, B:261:0x03c1, B:264:0x03ca, B:271:0x03ec, B:272:0x03f9, B:278:0x0409, B:282:0x0419, B:283:0x042a, B:285:0x042b, B:287:0x0435, B:288:0x0679, B:290:0x067f, B:293:0x0688, B:295:0x06a3, B:297:0x06ae, B:300:0x06b7, B:302:0x06bd, B:307:0x06c9, B:312:0x06d3, B:319:0x06da, B:320:0x06dd, B:322:0x06e1, B:324:0x06ed, B:325:0x0700, B:329:0x071a, B:331:0x0722, B:333:0x0728, B:334:0x07c2, B:336:0x07c7, B:338:0x07cd, B:340:0x07d5, B:342:0x07d9, B:344:0x07e3, B:346:0x07e7, B:347:0x07ed, B:348:0x080a, B:350:0x07de, B:352:0x07f1, B:354:0x07f6, B:356:0x07fa, B:357:0x0800, B:359:0x0804, B:360:0x0731, B:362:0x0736, B:365:0x073d, B:367:0x0745, B:370:0x0754, B:373:0x079c, B:375:0x07a4, B:376:0x075b, B:377:0x0768, B:379:0x076c, B:382:0x0782, B:383:0x0748, B:384:0x0796, B:388:0x07ab, B:392:0x07b7, B:393:0x07b1, B:394:0x043d, B:396:0x0441, B:397:0x047b, B:399:0x0483, B:401:0x0556, B:403:0x055a, B:406:0x0561, B:408:0x0565, B:410:0x0569, B:411:0x0570, B:413:0x0574, B:415:0x057a, B:417:0x0584, B:419:0x05ab, B:424:0x05b3, B:426:0x05bf, B:428:0x05c5, B:430:0x05cb, B:432:0x05ce, B:440:0x05d5, B:443:0x05e7, B:447:0x05ed, B:451:0x05f0, B:453:0x05f6, B:455:0x05fa, B:457:0x060a, B:461:0x066f, B:464:0x0624, B:465:0x0628, B:467:0x062e, B:469:0x063e, B:471:0x0644, B:473:0x064c, B:475:0x0655, B:476:0x065b, B:478:0x0668, B:482:0x056d, B:483:0x048a, B:485:0x048e, B:487:0x04e8, B:489:0x04ec, B:491:0x0506, B:494:0x0512, B:496:0x0548, B:497:0x054a, B:498:0x050d, B:499:0x04f3, B:500:0x0495, B:503:0x04a6, B:505:0x04d7, B:506:0x0446, B:508:0x044c, B:510:0x0452, B:512:0x0460, B:514:0x0464, B:516:0x046f, B:517:0x081a, B:520:0x0821, B:522:0x0828, B:525:0x0830, B:527:0x0835, B:530:0x0842, B:532:0x0849, B:535:0x0856, B:536:0x0859, B:538:0x0860, B:539:0x086c, B:541:0x0871), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:489:0x04ec A[Catch: IOException -> 0x0810, zzasi -> 0x0815, RuntimeException -> 0x0892, TryCatch #0 {RuntimeException -> 0x0892, blocks: (B:3:0x0005, B:10:0x001a, B:12:0x0022, B:16:0x0028, B:19:0x002f, B:22:0x0036, B:23:0x0042, B:26:0x0048, B:28:0x004c, B:31:0x0053, B:35:0x005b, B:41:0x006a, B:42:0x006f, B:44:0x0079, B:46:0x007d, B:48:0x0081, B:49:0x0092, B:52:0x0098, B:57:0x009c, B:67:0x00ba, B:76:0x00c8, B:79:0x00cb, B:83:0x00d5, B:88:0x00d9, B:89:0x00da, B:93:0x00e1, B:95:0x00e7, B:106:0x00ef, B:109:0x00f8, B:111:0x0117, B:112:0x011e, B:114:0x0124, B:117:0x0131, B:119:0x013b, B:121:0x013f, B:123:0x0145, B:126:0x014b, B:127:0x0152, B:128:0x0156, B:131:0x015d, B:133:0x0161, B:130:0x0166, B:139:0x0169, B:140:0x019d, B:142:0x0178, B:144:0x017e, B:146:0x0184, B:148:0x018c, B:97:0x01a9, B:101:0x01b0, B:153:0x01b6, B:155:0x01be, B:157:0x01c2, B:159:0x01c6, B:161:0x01ce, B:164:0x01d3, B:166:0x01e4, B:167:0x01f2, B:169:0x01f6, B:171:0x0206, B:173:0x020a, B:175:0x0218, B:177:0x021d, B:178:0x0266, B:180:0x026a, B:182:0x026e, B:183:0x0273, B:185:0x027d, B:187:0x0287, B:188:0x028c, B:189:0x02b4, B:191:0x02b8, B:195:0x02c3, B:199:0x02c6, B:200:0x02d6, B:203:0x02e5, B:205:0x02eb, B:207:0x02fc, B:209:0x0300, B:211:0x030e, B:213:0x0320, B:217:0x032f, B:222:0x0334, B:224:0x0348, B:223:0x034f, B:228:0x0235, B:230:0x023d, B:232:0x0245, B:233:0x024a, B:235:0x0353, B:236:0x035e, B:245:0x0369, B:246:0x036a, B:248:0x036e, B:250:0x0376, B:251:0x0380, B:253:0x037b, B:254:0x038c, B:256:0x0394, B:258:0x039d, B:260:0x03a3, B:261:0x03c1, B:264:0x03ca, B:271:0x03ec, B:272:0x03f9, B:278:0x0409, B:282:0x0419, B:283:0x042a, B:285:0x042b, B:287:0x0435, B:288:0x0679, B:290:0x067f, B:293:0x0688, B:295:0x06a3, B:297:0x06ae, B:300:0x06b7, B:302:0x06bd, B:307:0x06c9, B:312:0x06d3, B:319:0x06da, B:320:0x06dd, B:322:0x06e1, B:324:0x06ed, B:325:0x0700, B:329:0x071a, B:331:0x0722, B:333:0x0728, B:334:0x07c2, B:336:0x07c7, B:338:0x07cd, B:340:0x07d5, B:342:0x07d9, B:344:0x07e3, B:346:0x07e7, B:347:0x07ed, B:348:0x080a, B:350:0x07de, B:352:0x07f1, B:354:0x07f6, B:356:0x07fa, B:357:0x0800, B:359:0x0804, B:360:0x0731, B:362:0x0736, B:365:0x073d, B:367:0x0745, B:370:0x0754, B:373:0x079c, B:375:0x07a4, B:376:0x075b, B:377:0x0768, B:379:0x076c, B:382:0x0782, B:383:0x0748, B:384:0x0796, B:388:0x07ab, B:392:0x07b7, B:393:0x07b1, B:394:0x043d, B:396:0x0441, B:397:0x047b, B:399:0x0483, B:401:0x0556, B:403:0x055a, B:406:0x0561, B:408:0x0565, B:410:0x0569, B:411:0x0570, B:413:0x0574, B:415:0x057a, B:417:0x0584, B:419:0x05ab, B:424:0x05b3, B:426:0x05bf, B:428:0x05c5, B:430:0x05cb, B:432:0x05ce, B:440:0x05d5, B:443:0x05e7, B:447:0x05ed, B:451:0x05f0, B:453:0x05f6, B:455:0x05fa, B:457:0x060a, B:461:0x066f, B:464:0x0624, B:465:0x0628, B:467:0x062e, B:469:0x063e, B:471:0x0644, B:473:0x064c, B:475:0x0655, B:476:0x065b, B:478:0x0668, B:482:0x056d, B:483:0x048a, B:485:0x048e, B:487:0x04e8, B:489:0x04ec, B:491:0x0506, B:494:0x0512, B:496:0x0548, B:497:0x054a, B:498:0x050d, B:499:0x04f3, B:500:0x0495, B:503:0x04a6, B:505:0x04d7, B:506:0x0446, B:508:0x044c, B:510:0x0452, B:512:0x0460, B:514:0x0464, B:516:0x046f, B:517:0x081a, B:520:0x0821, B:522:0x0828, B:525:0x0830, B:527:0x0835, B:530:0x0842, B:532:0x0849, B:535:0x0856, B:536:0x0859, B:538:0x0860, B:539:0x086c, B:541:0x0871), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:493:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x0548 A[Catch: IOException -> 0x0810, zzasi -> 0x0815, RuntimeException -> 0x0892, TryCatch #0 {RuntimeException -> 0x0892, blocks: (B:3:0x0005, B:10:0x001a, B:12:0x0022, B:16:0x0028, B:19:0x002f, B:22:0x0036, B:23:0x0042, B:26:0x0048, B:28:0x004c, B:31:0x0053, B:35:0x005b, B:41:0x006a, B:42:0x006f, B:44:0x0079, B:46:0x007d, B:48:0x0081, B:49:0x0092, B:52:0x0098, B:57:0x009c, B:67:0x00ba, B:76:0x00c8, B:79:0x00cb, B:83:0x00d5, B:88:0x00d9, B:89:0x00da, B:93:0x00e1, B:95:0x00e7, B:106:0x00ef, B:109:0x00f8, B:111:0x0117, B:112:0x011e, B:114:0x0124, B:117:0x0131, B:119:0x013b, B:121:0x013f, B:123:0x0145, B:126:0x014b, B:127:0x0152, B:128:0x0156, B:131:0x015d, B:133:0x0161, B:130:0x0166, B:139:0x0169, B:140:0x019d, B:142:0x0178, B:144:0x017e, B:146:0x0184, B:148:0x018c, B:97:0x01a9, B:101:0x01b0, B:153:0x01b6, B:155:0x01be, B:157:0x01c2, B:159:0x01c6, B:161:0x01ce, B:164:0x01d3, B:166:0x01e4, B:167:0x01f2, B:169:0x01f6, B:171:0x0206, B:173:0x020a, B:175:0x0218, B:177:0x021d, B:178:0x0266, B:180:0x026a, B:182:0x026e, B:183:0x0273, B:185:0x027d, B:187:0x0287, B:188:0x028c, B:189:0x02b4, B:191:0x02b8, B:195:0x02c3, B:199:0x02c6, B:200:0x02d6, B:203:0x02e5, B:205:0x02eb, B:207:0x02fc, B:209:0x0300, B:211:0x030e, B:213:0x0320, B:217:0x032f, B:222:0x0334, B:224:0x0348, B:223:0x034f, B:228:0x0235, B:230:0x023d, B:232:0x0245, B:233:0x024a, B:235:0x0353, B:236:0x035e, B:245:0x0369, B:246:0x036a, B:248:0x036e, B:250:0x0376, B:251:0x0380, B:253:0x037b, B:254:0x038c, B:256:0x0394, B:258:0x039d, B:260:0x03a3, B:261:0x03c1, B:264:0x03ca, B:271:0x03ec, B:272:0x03f9, B:278:0x0409, B:282:0x0419, B:283:0x042a, B:285:0x042b, B:287:0x0435, B:288:0x0679, B:290:0x067f, B:293:0x0688, B:295:0x06a3, B:297:0x06ae, B:300:0x06b7, B:302:0x06bd, B:307:0x06c9, B:312:0x06d3, B:319:0x06da, B:320:0x06dd, B:322:0x06e1, B:324:0x06ed, B:325:0x0700, B:329:0x071a, B:331:0x0722, B:333:0x0728, B:334:0x07c2, B:336:0x07c7, B:338:0x07cd, B:340:0x07d5, B:342:0x07d9, B:344:0x07e3, B:346:0x07e7, B:347:0x07ed, B:348:0x080a, B:350:0x07de, B:352:0x07f1, B:354:0x07f6, B:356:0x07fa, B:357:0x0800, B:359:0x0804, B:360:0x0731, B:362:0x0736, B:365:0x073d, B:367:0x0745, B:370:0x0754, B:373:0x079c, B:375:0x07a4, B:376:0x075b, B:377:0x0768, B:379:0x076c, B:382:0x0782, B:383:0x0748, B:384:0x0796, B:388:0x07ab, B:392:0x07b7, B:393:0x07b1, B:394:0x043d, B:396:0x0441, B:397:0x047b, B:399:0x0483, B:401:0x0556, B:403:0x055a, B:406:0x0561, B:408:0x0565, B:410:0x0569, B:411:0x0570, B:413:0x0574, B:415:0x057a, B:417:0x0584, B:419:0x05ab, B:424:0x05b3, B:426:0x05bf, B:428:0x05c5, B:430:0x05cb, B:432:0x05ce, B:440:0x05d5, B:443:0x05e7, B:447:0x05ed, B:451:0x05f0, B:453:0x05f6, B:455:0x05fa, B:457:0x060a, B:461:0x066f, B:464:0x0624, B:465:0x0628, B:467:0x062e, B:469:0x063e, B:471:0x0644, B:473:0x064c, B:475:0x0655, B:476:0x065b, B:478:0x0668, B:482:0x056d, B:483:0x048a, B:485:0x048e, B:487:0x04e8, B:489:0x04ec, B:491:0x0506, B:494:0x0512, B:496:0x0548, B:497:0x054a, B:498:0x050d, B:499:0x04f3, B:500:0x0495, B:503:0x04a6, B:505:0x04d7, B:506:0x0446, B:508:0x044c, B:510:0x0452, B:512:0x0460, B:514:0x0464, B:516:0x046f, B:517:0x081a, B:520:0x0821, B:522:0x0828, B:525:0x0830, B:527:0x0835, B:530:0x0842, B:532:0x0849, B:535:0x0856, B:536:0x0859, B:538:0x0860, B:539:0x086c, B:541:0x0871), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:498:0x050d A[Catch: IOException -> 0x0810, zzasi -> 0x0815, RuntimeException -> 0x0892, TryCatch #0 {RuntimeException -> 0x0892, blocks: (B:3:0x0005, B:10:0x001a, B:12:0x0022, B:16:0x0028, B:19:0x002f, B:22:0x0036, B:23:0x0042, B:26:0x0048, B:28:0x004c, B:31:0x0053, B:35:0x005b, B:41:0x006a, B:42:0x006f, B:44:0x0079, B:46:0x007d, B:48:0x0081, B:49:0x0092, B:52:0x0098, B:57:0x009c, B:67:0x00ba, B:76:0x00c8, B:79:0x00cb, B:83:0x00d5, B:88:0x00d9, B:89:0x00da, B:93:0x00e1, B:95:0x00e7, B:106:0x00ef, B:109:0x00f8, B:111:0x0117, B:112:0x011e, B:114:0x0124, B:117:0x0131, B:119:0x013b, B:121:0x013f, B:123:0x0145, B:126:0x014b, B:127:0x0152, B:128:0x0156, B:131:0x015d, B:133:0x0161, B:130:0x0166, B:139:0x0169, B:140:0x019d, B:142:0x0178, B:144:0x017e, B:146:0x0184, B:148:0x018c, B:97:0x01a9, B:101:0x01b0, B:153:0x01b6, B:155:0x01be, B:157:0x01c2, B:159:0x01c6, B:161:0x01ce, B:164:0x01d3, B:166:0x01e4, B:167:0x01f2, B:169:0x01f6, B:171:0x0206, B:173:0x020a, B:175:0x0218, B:177:0x021d, B:178:0x0266, B:180:0x026a, B:182:0x026e, B:183:0x0273, B:185:0x027d, B:187:0x0287, B:188:0x028c, B:189:0x02b4, B:191:0x02b8, B:195:0x02c3, B:199:0x02c6, B:200:0x02d6, B:203:0x02e5, B:205:0x02eb, B:207:0x02fc, B:209:0x0300, B:211:0x030e, B:213:0x0320, B:217:0x032f, B:222:0x0334, B:224:0x0348, B:223:0x034f, B:228:0x0235, B:230:0x023d, B:232:0x0245, B:233:0x024a, B:235:0x0353, B:236:0x035e, B:245:0x0369, B:246:0x036a, B:248:0x036e, B:250:0x0376, B:251:0x0380, B:253:0x037b, B:254:0x038c, B:256:0x0394, B:258:0x039d, B:260:0x03a3, B:261:0x03c1, B:264:0x03ca, B:271:0x03ec, B:272:0x03f9, B:278:0x0409, B:282:0x0419, B:283:0x042a, B:285:0x042b, B:287:0x0435, B:288:0x0679, B:290:0x067f, B:293:0x0688, B:295:0x06a3, B:297:0x06ae, B:300:0x06b7, B:302:0x06bd, B:307:0x06c9, B:312:0x06d3, B:319:0x06da, B:320:0x06dd, B:322:0x06e1, B:324:0x06ed, B:325:0x0700, B:329:0x071a, B:331:0x0722, B:333:0x0728, B:334:0x07c2, B:336:0x07c7, B:338:0x07cd, B:340:0x07d5, B:342:0x07d9, B:344:0x07e3, B:346:0x07e7, B:347:0x07ed, B:348:0x080a, B:350:0x07de, B:352:0x07f1, B:354:0x07f6, B:356:0x07fa, B:357:0x0800, B:359:0x0804, B:360:0x0731, B:362:0x0736, B:365:0x073d, B:367:0x0745, B:370:0x0754, B:373:0x079c, B:375:0x07a4, B:376:0x075b, B:377:0x0768, B:379:0x076c, B:382:0x0782, B:383:0x0748, B:384:0x0796, B:388:0x07ab, B:392:0x07b7, B:393:0x07b1, B:394:0x043d, B:396:0x0441, B:397:0x047b, B:399:0x0483, B:401:0x0556, B:403:0x055a, B:406:0x0561, B:408:0x0565, B:410:0x0569, B:411:0x0570, B:413:0x0574, B:415:0x057a, B:417:0x0584, B:419:0x05ab, B:424:0x05b3, B:426:0x05bf, B:428:0x05c5, B:430:0x05cb, B:432:0x05ce, B:440:0x05d5, B:443:0x05e7, B:447:0x05ed, B:451:0x05f0, B:453:0x05f6, B:455:0x05fa, B:457:0x060a, B:461:0x066f, B:464:0x0624, B:465:0x0628, B:467:0x062e, B:469:0x063e, B:471:0x0644, B:473:0x064c, B:475:0x0655, B:476:0x065b, B:478:0x0668, B:482:0x056d, B:483:0x048a, B:485:0x048e, B:487:0x04e8, B:489:0x04ec, B:491:0x0506, B:494:0x0512, B:496:0x0548, B:497:0x054a, B:498:0x050d, B:499:0x04f3, B:500:0x0495, B:503:0x04a6, B:505:0x04d7, B:506:0x0446, B:508:0x044c, B:510:0x0452, B:512:0x0460, B:514:0x0464, B:516:0x046f, B:517:0x081a, B:520:0x0821, B:522:0x0828, B:525:0x0830, B:527:0x0835, B:530:0x0842, B:532:0x0849, B:535:0x0856, B:536:0x0859, B:538:0x0860, B:539:0x086c, B:541:0x0871), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:499:0x04f3 A[Catch: IOException -> 0x0810, zzasi -> 0x0815, RuntimeException -> 0x0892, TryCatch #0 {RuntimeException -> 0x0892, blocks: (B:3:0x0005, B:10:0x001a, B:12:0x0022, B:16:0x0028, B:19:0x002f, B:22:0x0036, B:23:0x0042, B:26:0x0048, B:28:0x004c, B:31:0x0053, B:35:0x005b, B:41:0x006a, B:42:0x006f, B:44:0x0079, B:46:0x007d, B:48:0x0081, B:49:0x0092, B:52:0x0098, B:57:0x009c, B:67:0x00ba, B:76:0x00c8, B:79:0x00cb, B:83:0x00d5, B:88:0x00d9, B:89:0x00da, B:93:0x00e1, B:95:0x00e7, B:106:0x00ef, B:109:0x00f8, B:111:0x0117, B:112:0x011e, B:114:0x0124, B:117:0x0131, B:119:0x013b, B:121:0x013f, B:123:0x0145, B:126:0x014b, B:127:0x0152, B:128:0x0156, B:131:0x015d, B:133:0x0161, B:130:0x0166, B:139:0x0169, B:140:0x019d, B:142:0x0178, B:144:0x017e, B:146:0x0184, B:148:0x018c, B:97:0x01a9, B:101:0x01b0, B:153:0x01b6, B:155:0x01be, B:157:0x01c2, B:159:0x01c6, B:161:0x01ce, B:164:0x01d3, B:166:0x01e4, B:167:0x01f2, B:169:0x01f6, B:171:0x0206, B:173:0x020a, B:175:0x0218, B:177:0x021d, B:178:0x0266, B:180:0x026a, B:182:0x026e, B:183:0x0273, B:185:0x027d, B:187:0x0287, B:188:0x028c, B:189:0x02b4, B:191:0x02b8, B:195:0x02c3, B:199:0x02c6, B:200:0x02d6, B:203:0x02e5, B:205:0x02eb, B:207:0x02fc, B:209:0x0300, B:211:0x030e, B:213:0x0320, B:217:0x032f, B:222:0x0334, B:224:0x0348, B:223:0x034f, B:228:0x0235, B:230:0x023d, B:232:0x0245, B:233:0x024a, B:235:0x0353, B:236:0x035e, B:245:0x0369, B:246:0x036a, B:248:0x036e, B:250:0x0376, B:251:0x0380, B:253:0x037b, B:254:0x038c, B:256:0x0394, B:258:0x039d, B:260:0x03a3, B:261:0x03c1, B:264:0x03ca, B:271:0x03ec, B:272:0x03f9, B:278:0x0409, B:282:0x0419, B:283:0x042a, B:285:0x042b, B:287:0x0435, B:288:0x0679, B:290:0x067f, B:293:0x0688, B:295:0x06a3, B:297:0x06ae, B:300:0x06b7, B:302:0x06bd, B:307:0x06c9, B:312:0x06d3, B:319:0x06da, B:320:0x06dd, B:322:0x06e1, B:324:0x06ed, B:325:0x0700, B:329:0x071a, B:331:0x0722, B:333:0x0728, B:334:0x07c2, B:336:0x07c7, B:338:0x07cd, B:340:0x07d5, B:342:0x07d9, B:344:0x07e3, B:346:0x07e7, B:347:0x07ed, B:348:0x080a, B:350:0x07de, B:352:0x07f1, B:354:0x07f6, B:356:0x07fa, B:357:0x0800, B:359:0x0804, B:360:0x0731, B:362:0x0736, B:365:0x073d, B:367:0x0745, B:370:0x0754, B:373:0x079c, B:375:0x07a4, B:376:0x075b, B:377:0x0768, B:379:0x076c, B:382:0x0782, B:383:0x0748, B:384:0x0796, B:388:0x07ab, B:392:0x07b7, B:393:0x07b1, B:394:0x043d, B:396:0x0441, B:397:0x047b, B:399:0x0483, B:401:0x0556, B:403:0x055a, B:406:0x0561, B:408:0x0565, B:410:0x0569, B:411:0x0570, B:413:0x0574, B:415:0x057a, B:417:0x0584, B:419:0x05ab, B:424:0x05b3, B:426:0x05bf, B:428:0x05c5, B:430:0x05cb, B:432:0x05ce, B:440:0x05d5, B:443:0x05e7, B:447:0x05ed, B:451:0x05f0, B:453:0x05f6, B:455:0x05fa, B:457:0x060a, B:461:0x066f, B:464:0x0624, B:465:0x0628, B:467:0x062e, B:469:0x063e, B:471:0x0644, B:473:0x064c, B:475:0x0655, B:476:0x065b, B:478:0x0668, B:482:0x056d, B:483:0x048a, B:485:0x048e, B:487:0x04e8, B:489:0x04ec, B:491:0x0506, B:494:0x0512, B:496:0x0548, B:497:0x054a, B:498:0x050d, B:499:0x04f3, B:500:0x0495, B:503:0x04a6, B:505:0x04d7, B:506:0x0446, B:508:0x044c, B:510:0x0452, B:512:0x0460, B:514:0x0464, B:516:0x046f, B:517:0x081a, B:520:0x0821, B:522:0x0828, B:525:0x0830, B:527:0x0835, B:530:0x0842, B:532:0x0849, B:535:0x0856, B:536:0x0859, B:538:0x0860, B:539:0x086c, B:541:0x0871), top: B:2:0x0005 }] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        boolean z;
        int i;
        IOException iOException;
        boolean z2;
        int i2;
        zzasi zzasiVar;
        zzasq zzasqVar;
        int zzf;
        long j;
        zzasq zzasqVar2;
        zzasq zzasqVar3;
        int i3;
        zzazi zzaziVar;
        long j2;
        zzasq zzasqVar4;
        boolean zzk;
        boolean z3;
        Message obtainMessage;
        int i4;
        zzasq zzasqVar5;
        zzasq zzasqVar6;
        int i5;
        int i6 = 1;
        try {
            try {
                long j3 = 0;
                int i7 = 0;
                try {
                    try {
                        switch (message.what) {
                            case 0:
                                zzaye zzayeVar = (zzaye) message.obj;
                                int i8 = message.arg1;
                                this.zzg.sendEmptyMessage(0);
                                boolean z4 = true;
                                try {
                                    zzE(true);
                                    this.zzL.zza();
                                    if (i8 != 0) {
                                        this.zzk = new zzasr(0, -9223372036854775807L);
                                    }
                                    this.zzo = zzayeVar;
                                    z4 = true;
                                    zzayeVar.zzb(this.zzh, true, this);
                                    zzJ(2);
                                    this.zze.sendEmptyMessage(2);
                                    return true;
                                } catch (zzasi e) {
                                    zzasiVar = e;
                                    z2 = z4;
                                    i2 = 8;
                                    Log.e("ExoPlayerImplInternal", "Renderer error.", zzasiVar);
                                    this.zzg.obtainMessage(i2, zzasiVar).sendToTarget();
                                    zzL();
                                    return z2;
                                } catch (IOException e2) {
                                    iOException = e2;
                                    z = z4;
                                    i = 8;
                                    Log.e("ExoPlayerImplInternal", "Source error.", iOException);
                                    this.zzg.obtainMessage(i, zzasi.zzb(iOException)).sendToTarget();
                                    zzL();
                                    return z;
                                }
                            case 1:
                                boolean z5 = message.arg1 != 0;
                                this.zzs = false;
                                this.zzr = z5;
                                if (z5) {
                                    int i9 = this.zzu;
                                    if (i9 == 3) {
                                        zzK();
                                        this.zze.sendEmptyMessage(2);
                                    } else if (i9 == 2) {
                                        this.zze.sendEmptyMessage(2);
                                    }
                                } else {
                                    zzM();
                                    zzN();
                                }
                                return true;
                            case 2:
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                if (this.zzF == null) {
                                    this.zzo.zza();
                                    j = elapsedRealtime;
                                } else {
                                    zzasq zzasqVar7 = this.zzC;
                                    if (zzasqVar7 == null) {
                                        zzf = this.zzk.zza;
                                    } else {
                                        int i10 = zzasqVar7.zzg;
                                        if (!zzasqVar7.zzi && zzasqVar7.zzd() && this.zzF.zzd(i10, this.zzj, false).zzc != -9223372036854775807L && ((zzasqVar = this.zzE) == null || this.zzC.zzc - zzasqVar.zzc != 100)) {
                                            zzf = this.zzF.zzf(i10, this.zzj, this.zzi, this.zzv);
                                        }
                                        j = elapsedRealtime;
                                        zzasqVar2 = this.zzC;
                                        if (zzasqVar2 != null && !zzasqVar2.zzd()) {
                                            if (this.zzC != null && !this.zzt) {
                                                zzB();
                                            }
                                            if (this.zzE != null) {
                                                while (true) {
                                                    zzasq zzasqVar8 = this.zzE;
                                                    zzasqVar3 = this.zzD;
                                                    if (zzasqVar8 != zzasqVar3 && this.zzB >= zzasqVar8.zzl.zzf) {
                                                        zzasqVar8.zzc();
                                                        zzI(this.zzE.zzl);
                                                        zzasq zzasqVar9 = this.zzE;
                                                        this.zzk = new zzasr(zzasqVar9.zzg, zzasqVar9.zzh);
                                                        zzN();
                                                        this.zzg.obtainMessage(5, this.zzk).sendToTarget();
                                                    }
                                                }
                                                if (zzasqVar3.zzi) {
                                                    for (int i11 = 0; i11 < 2; i11++) {
                                                        zzatb zzatbVar = this.zza[i11];
                                                        zzayo zzayoVar = this.zzD.zzd[i11];
                                                        if (zzayoVar != null && zzatbVar.zzh() == zzayoVar && zzatbVar.zzA()) {
                                                            zzatbVar.zzv();
                                                        }
                                                    }
                                                } else {
                                                    while (true) {
                                                        if (i3 < 2) {
                                                            zzatb zzatbVar2 = this.zza[i3];
                                                            zzayo zzayoVar2 = this.zzD.zzd[i3];
                                                            i3 = (zzatbVar2.zzh() == zzayoVar2 && (zzayoVar2 == null || zzatbVar2.zzA())) ? i3 + 1 : 0;
                                                        } else {
                                                            zzasq zzasqVar10 = this.zzD;
                                                            zzasq zzasqVar11 = zzasqVar10.zzl;
                                                            if (zzasqVar11 != null && zzasqVar11.zzj) {
                                                                zzazi zzaziVar2 = zzasqVar10.zzm;
                                                                this.zzD = zzasqVar11;
                                                                zzazi zzaziVar3 = zzasqVar11.zzm;
                                                                long zzh = zzasqVar11.zza.zzh();
                                                                int i12 = 0;
                                                                int i13 = 2;
                                                                while (i12 < i13) {
                                                                    zzatb zzatbVar3 = this.zza[i12];
                                                                    if (zzaziVar2.zzb.zza(i12) != null) {
                                                                        if (zzh != -9223372036854775807L) {
                                                                            zzatbVar3.zzv();
                                                                        } else if (!zzatbVar3.zzB()) {
                                                                            zzayx zza = zzaziVar3.zzb.zza(i12);
                                                                            zzatd zzatdVar = zzaziVar2.zzd[i12];
                                                                            zzatd zzatdVar2 = zzaziVar3.zzd[i12];
                                                                            if (zza == null || !zzatdVar2.equals(zzatdVar)) {
                                                                                zzaziVar = zzaziVar3;
                                                                                j2 = zzh;
                                                                                zzatbVar3.zzv();
                                                                            } else {
                                                                                zza.zzb();
                                                                                zzasw[] zzaswVarArr = new zzasw[i6];
                                                                                for (int i14 = i7; i14 <= 0; i14++) {
                                                                                    zzaswVarArr[i14] = zza.zzc(i14);
                                                                                }
                                                                                zzasq zzasqVar12 = this.zzD;
                                                                                zzaziVar = zzaziVar3;
                                                                                j2 = zzh;
                                                                                zzatbVar3.zzt(zzaswVarArr, zzasqVar12.zzd[i12], zzasqVar12.zzf - zzasqVar12.zzh);
                                                                            }
                                                                            i12++;
                                                                            zzaziVar3 = zzaziVar;
                                                                            zzh = j2;
                                                                            i13 = 2;
                                                                            i7 = 0;
                                                                            i6 = 1;
                                                                        }
                                                                    }
                                                                    zzaziVar = zzaziVar3;
                                                                    j2 = zzh;
                                                                    i12++;
                                                                    zzaziVar3 = zzaziVar;
                                                                    zzh = j2;
                                                                    i13 = 2;
                                                                    i7 = 0;
                                                                    i6 = 1;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        zzH(false);
                                        if (this.zzE != null) {
                                        }
                                    }
                                    if (zzf >= this.zzF.zzb()) {
                                        this.zzo.zza();
                                        j = elapsedRealtime;
                                        zzasqVar2 = this.zzC;
                                        if (zzasqVar2 != null) {
                                            if (this.zzC != null) {
                                                zzB();
                                            }
                                            if (this.zzE != null) {
                                            }
                                        }
                                        zzH(false);
                                        if (this.zzE != null) {
                                        }
                                    } else {
                                        if (this.zzC == null) {
                                            j3 = this.zzk.zzc;
                                        } else {
                                            this.zzF.zzd(zzf, this.zzj, false);
                                            this.zzF.zzg(0, this.zzi, false);
                                            if (zzf == 0) {
                                                zzasq zzasqVar13 = this.zzC;
                                                j = elapsedRealtime;
                                                Pair zzx = zzx(this.zzF, 0, -9223372036854775807L, Math.max(0L, ((zzasqVar13.zzf - zzasqVar13.zzh) + this.zzF.zzd(zzasqVar13.zzg, this.zzj, false).zzc) - this.zzB));
                                                if (zzx != null) {
                                                    int intValue = ((Integer) zzx.first).intValue();
                                                    j3 = ((Long) zzx.second).longValue();
                                                    zzf = intValue;
                                                    zzasq zzasqVar14 = this.zzC;
                                                    long j4 = zzasqVar14 != null ? 60000000 + j3 : (zzasqVar14.zzf - zzasqVar14.zzh) + this.zzF.zzd(zzasqVar14.zzg, this.zzj, false).zzc;
                                                    zzasq zzasqVar15 = this.zzC;
                                                    int i15 = zzasqVar15 != null ? 0 : zzasqVar15.zzc + 1;
                                                    boolean zzO = zzO(zzf);
                                                    this.zzF.zzd(zzf, this.zzj, true);
                                                    zzasq zzasqVar16 = new zzasq(this.zza, this.zzb, j4, this.zzc, this.zzL, this.zzo, this.zzj.zzb, i15, zzf, zzO, j3, null);
                                                    zzasqVar4 = this.zzC;
                                                    if (zzasqVar4 != null) {
                                                        zzasqVar4.zzl = zzasqVar16;
                                                    }
                                                    this.zzC = zzasqVar16;
                                                    zzasqVar16.zza.zzw(this, j3);
                                                    zzH(true);
                                                }
                                                zzasqVar2 = this.zzC;
                                                if (zzasqVar2 != null) {
                                                }
                                                zzH(false);
                                                if (this.zzE != null) {
                                                }
                                            }
                                        }
                                        j = elapsedRealtime;
                                        zzasq zzasqVar142 = this.zzC;
                                        long j42 = zzasqVar142 != null ? 60000000 + j3 : (zzasqVar142.zzf - zzasqVar142.zzh) + this.zzF.zzd(zzasqVar142.zzg, this.zzj, false).zzc;
                                        zzasq zzasqVar152 = this.zzC;
                                        if (zzasqVar152 != null) {
                                        }
                                        boolean zzO2 = zzO(zzf);
                                        this.zzF.zzd(zzf, this.zzj, true);
                                        zzasq zzasqVar162 = new zzasq(this.zza, this.zzb, j42, this.zzc, this.zzL, this.zzo, this.zzj.zzb, i15, zzf, zzO2, j3, null);
                                        zzasqVar4 = this.zzC;
                                        if (zzasqVar4 != null) {
                                        }
                                        this.zzC = zzasqVar162;
                                        zzasqVar162.zza.zzw(this, j3);
                                        zzH(true);
                                        zzasqVar2 = this.zzC;
                                        if (zzasqVar2 != null) {
                                        }
                                        zzH(false);
                                        if (this.zzE != null) {
                                        }
                                    }
                                }
                                if (this.zzE == null) {
                                    zzC();
                                    zzG(j, 10L);
                                } else {
                                    zzbap.zza("doSomeWork");
                                    zzN();
                                    this.zzE.zza.zzq(this.zzk.zzc);
                                    boolean z6 = true;
                                    boolean z7 = true;
                                    for (zzatb zzatbVar4 : this.zzp) {
                                        zzatbVar4.zzD(this.zzB, this.zzy);
                                        z7 = z7 && zzatbVar4.zzE();
                                        if (!zzatbVar4.zzF() && !zzatbVar4.zzE()) {
                                            z3 = false;
                                            if (!z3) {
                                                zzatbVar4.zzm();
                                            }
                                            z6 = !z6 && z3;
                                        }
                                        z3 = true;
                                        if (!z3) {
                                        }
                                        if (z6) {
                                        }
                                    }
                                    if (!z6) {
                                        zzC();
                                    }
                                    zzbag zzbagVar = this.zzn;
                                    if (zzbagVar != null) {
                                        zzata zzJ = zzbagVar.zzJ();
                                        if (!zzJ.equals(this.zzl)) {
                                            this.zzl = zzJ;
                                            this.zzd.zzd(this.zzn);
                                            this.zzg.obtainMessage(7, zzJ).sendToTarget();
                                        }
                                    }
                                    long j5 = this.zzF.zzd(this.zzE.zzg, this.zzj, false).zzc;
                                    if (!z7 || ((j5 != -9223372036854775807L && j5 > this.zzk.zzc) || !this.zzE.zzi)) {
                                        int i16 = this.zzu;
                                        if (i16 == 2) {
                                            if (this.zzp.length <= 0) {
                                                break;
                                            } else if (z6) {
                                                boolean z8 = this.zzs;
                                                zzasq zzasqVar17 = this.zzC;
                                                long zzg = !zzasqVar17.zzj ? zzasqVar17.zzh : zzasqVar17.zza.zzg();
                                                if (zzg == Long.MIN_VALUE) {
                                                    zzasq zzasqVar18 = this.zzC;
                                                    if (zzasqVar18.zzi) {
                                                        zzJ(3);
                                                        if (this.zzr) {
                                                            zzK();
                                                        }
                                                    } else {
                                                        zzg = this.zzF.zzd(zzasqVar18.zzg, this.zzj, false).zzc;
                                                    }
                                                }
                                                if (this.zzG) {
                                                    zzcjv zzcjvVar = this.zzL;
                                                    long j6 = this.zzk.zzd;
                                                    zzasq zzasqVar19 = this.zzC;
                                                    zzk = zzcjvVar.zzk(j6 - (this.zzB - (zzasqVar19.zzf - zzasqVar19.zzh)), z8);
                                                } else {
                                                    zzcjv zzcjvVar2 = this.zzL;
                                                    zzasq zzasqVar20 = this.zzC;
                                                    zzk = zzcjvVar2.zzk(zzg - (this.zzB - (zzasqVar20.zzf - zzasqVar20.zzh)), z8);
                                                }
                                                if (zzk) {
                                                    zzJ(3);
                                                    if (this.zzr) {
                                                    }
                                                }
                                            }
                                        } else if (i16 == 3) {
                                            if (this.zzp.length <= 0) {
                                                z6 = zzP(j5);
                                            }
                                            if (!z6) {
                                                this.zzs = this.zzr;
                                                zzJ(2);
                                                zzM();
                                            }
                                        }
                                    } else {
                                        zzJ(4);
                                        zzM();
                                    }
                                    if (this.zzu == 2) {
                                        for (zzatb zzatbVar5 : this.zzp) {
                                            zzatbVar5.zzm();
                                        }
                                    }
                                    if ((this.zzr && this.zzu == 3) || this.zzu == 2) {
                                        zzG(j, this.zzJ > 0 ? this.zzJ : 10L);
                                    } else if (this.zzp.length != 0) {
                                        zzG(j, this.zzK > 0 ? this.zzK : 1000L);
                                    } else {
                                        this.zze.removeMessages(2);
                                    }
                                    zzbap.zzb();
                                }
                                return true;
                            case 3:
                                zzass zzassVar = (zzass) message.obj;
                                if (this.zzF == null) {
                                    this.zzz++;
                                    this.zzA = zzassVar;
                                } else {
                                    Pair zzy = zzy(zzassVar);
                                    if (zzy == null) {
                                        zzasr zzasrVar = new zzasr(0, 0L);
                                        this.zzk = zzasrVar;
                                        this.zzg.obtainMessage(4, 1, 0, zzasrVar).sendToTarget();
                                        this.zzk = new zzasr(0, -9223372036854775807L);
                                        zzJ(4);
                                        zzE(false);
                                    } else {
                                        int i17 = zzassVar.zzc == -9223372036854775807L ? 1 : 0;
                                        int intValue2 = ((Integer) zzy.first).intValue();
                                        long longValue = ((Long) zzy.second).longValue();
                                        try {
                                            zzasr zzasrVar2 = this.zzk;
                                            if (intValue2 == zzasrVar2.zza && longValue / 1000 == zzasrVar2.zzc / 1000) {
                                                zzasr zzasrVar3 = new zzasr(intValue2, longValue);
                                                this.zzk = zzasrVar3;
                                                obtainMessage = this.zzg.obtainMessage(4, i17, 0, zzasrVar3);
                                            } else {
                                                long zzu = zzu(intValue2, longValue);
                                                int i18 = i17 | (longValue != zzu ? 1 : 0);
                                                zzasr zzasrVar4 = new zzasr(intValue2, zzu);
                                                this.zzk = zzasrVar4;
                                                obtainMessage = this.zzg.obtainMessage(4, i18, 0, zzasrVar4);
                                            }
                                            obtainMessage.sendToTarget();
                                        } catch (Throwable th) {
                                            zzasr zzasrVar5 = new zzasr(intValue2, longValue);
                                            this.zzk = zzasrVar5;
                                            this.zzg.obtainMessage(4, i17, 0, zzasrVar5).sendToTarget();
                                            throw th;
                                        }
                                    }
                                }
                                return true;
                            case 4:
                                zzata zzataVar = (zzata) message.obj;
                                zzbag zzbagVar2 = this.zzn;
                                if (zzbagVar2 != null) {
                                    zzataVar = zzbagVar2.zzK(zzataVar);
                                } else {
                                    this.zzd.zzK(zzataVar);
                                }
                                this.zzl = zzataVar;
                                this.zzg.obtainMessage(7, zzataVar).sendToTarget();
                                return true;
                            case 5:
                                zzL();
                                return true;
                            case 6:
                                zzE(true);
                                this.zzL.zzb();
                                zzJ(1);
                                synchronized (this) {
                                    this.zzq = true;
                                    notifyAll();
                                }
                                return true;
                            case 7:
                                Pair pair = (Pair) message.obj;
                                zzath zzathVar = this.zzF;
                                this.zzF = (zzath) pair.first;
                                Object obj = pair.second;
                                if (zzathVar == null) {
                                    if (this.zzz > 0) {
                                        Pair zzy2 = zzy(this.zzA);
                                        i4 = this.zzz;
                                        this.zzz = 0;
                                        this.zzA = null;
                                        if (zzy2 == null) {
                                            zzA(obj, i4);
                                        } else {
                                            this.zzk = new zzasr(((Integer) zzy2.first).intValue(), ((Long) zzy2.second).longValue());
                                            zzasqVar5 = this.zzE;
                                            if (zzasqVar5 == null) {
                                                zzasqVar5 = this.zzC;
                                            }
                                            if (zzasqVar5 != null) {
                                                zzD(obj, i4);
                                            } else {
                                                int zza2 = this.zzF.zza(zzasqVar5.zzb);
                                                if (zza2 != -1) {
                                                    boolean zzO3 = zzO(0);
                                                    zzasqVar5.zzg = 0;
                                                    zzasqVar5.zzi = zzO3;
                                                    boolean z9 = zzasqVar5 == this.zzD;
                                                    zzasr zzasrVar6 = this.zzk;
                                                    if (zzasrVar6.zza != 0) {
                                                        zzasr zzasrVar7 = new zzasr(0, zzasrVar6.zzb);
                                                        zzasrVar7.zzc = zzasrVar6.zzc;
                                                        zzasrVar7.zzd = zzasrVar6.zzd;
                                                        this.zzk = zzasrVar7;
                                                    }
                                                    while (true) {
                                                        zzasq zzasqVar21 = zzasqVar5.zzl;
                                                        if (zzasqVar21 != null) {
                                                            zza2 = this.zzF.zzf(zza2, this.zzj, this.zzi, this.zzv);
                                                            if (zza2 != -1 && zzasqVar21.zzb.equals(this.zzF.zzd(zza2, this.zzj, true).zzb)) {
                                                                boolean zzO4 = zzO(zza2);
                                                                zzasqVar21.zzg = zza2;
                                                                zzasqVar21.zzi = zzO4;
                                                                z9 |= zzasqVar21 == this.zzD;
                                                                zzasqVar5 = zzasqVar21;
                                                            }
                                                        }
                                                    }
                                                    zzD(obj, i4);
                                                } else if (zzt(zzasqVar5.zzg, zzathVar, this.zzF) == -1) {
                                                    zzA(obj, i4);
                                                } else {
                                                    this.zzF.zzd(0, this.zzj, false);
                                                    Pair zzv = zzv(0, -9223372036854775807L);
                                                    int intValue3 = ((Integer) zzv.first).intValue();
                                                    long longValue2 = ((Long) zzv.second).longValue();
                                                    this.zzF.zzd(intValue3, this.zzj, true);
                                                    Object obj2 = this.zzj.zzb;
                                                    zzasqVar5.zzg = -1;
                                                    while (true) {
                                                        zzasqVar5 = zzasqVar5.zzl;
                                                        if (zzasqVar5 != null) {
                                                            zzasqVar5.zzg = true != zzasqVar5.zzb.equals(obj2) ? -1 : intValue3;
                                                        } else {
                                                            this.zzk = new zzasr(intValue3, zzu(intValue3, longValue2));
                                                            zzD(obj, i4);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else if (this.zzk.zzb == -9223372036854775807L) {
                                        if (this.zzF.zzh()) {
                                            zzA(obj, 0);
                                        } else {
                                            Pair zzv2 = zzv(0, -9223372036854775807L);
                                            this.zzk = new zzasr(((Integer) zzv2.first).intValue(), ((Long) zzv2.second).longValue());
                                        }
                                    }
                                    return true;
                                }
                                i4 = 0;
                                zzasqVar5 = this.zzE;
                                if (zzasqVar5 == null) {
                                }
                                if (zzasqVar5 != null) {
                                }
                                return true;
                            case 8:
                                zzayc zzaycVar = (zzayc) message.obj;
                                zzasq zzasqVar22 = this.zzC;
                                if (zzasqVar22 != null && zzasqVar22.zza == zzaycVar) {
                                    zzasqVar22.zzj = true;
                                    zzasqVar22.zze();
                                    zzasqVar22.zzh = zzasqVar22.zza(zzasqVar22.zzh, false);
                                    if (this.zzE == null) {
                                        zzasq zzasqVar23 = this.zzC;
                                        this.zzD = zzasqVar23;
                                        zzF(zzasqVar23.zzh);
                                        zzI(this.zzD);
                                    }
                                    zzB();
                                }
                                return true;
                            case 9:
                                zzayc zzaycVar2 = (zzayc) message.obj;
                                zzasq zzasqVar24 = this.zzC;
                                if (zzasqVar24 != null && zzasqVar24.zza == zzaycVar2) {
                                    zzB();
                                }
                                return true;
                            case 10:
                                zzasq zzasqVar25 = this.zzE;
                                if (zzasqVar25 != null) {
                                    boolean z10 = true;
                                    while (true) {
                                        if (zzasqVar25 != null && zzasqVar25.zzj) {
                                            if (zzasqVar25.zze()) {
                                                if (z10) {
                                                    zzasq zzasqVar26 = this.zzD;
                                                    zzasq zzasqVar27 = this.zzE;
                                                    boolean z11 = zzasqVar26 != zzasqVar27;
                                                    zzR(zzasqVar27.zzl);
                                                    zzasq zzasqVar28 = this.zzE;
                                                    zzasqVar28.zzl = null;
                                                    this.zzC = zzasqVar28;
                                                    this.zzD = zzasqVar28;
                                                    boolean[] zArr = new boolean[2];
                                                    long zzb = zzasqVar28.zzb(this.zzk.zzc, z11, zArr);
                                                    if (zzb != this.zzk.zzc) {
                                                        this.zzk.zzc = zzb;
                                                        zzF(zzb);
                                                    }
                                                    boolean[] zArr2 = new boolean[2];
                                                    int i19 = 0;
                                                    for (int i20 = 0; i20 < 2; i20++) {
                                                        zzatb zzatbVar6 = this.zza[i20];
                                                        boolean z12 = zzatbVar6.zzb() != 0;
                                                        zArr2[i20] = z12;
                                                        zzayo zzayoVar3 = this.zzE.zzd[i20];
                                                        if (zzayoVar3 != null) {
                                                            i19++;
                                                        }
                                                        if (z12) {
                                                            if (zzayoVar3 != zzatbVar6.zzh()) {
                                                                if (zzatbVar6 == this.zzm) {
                                                                    if (zzayoVar3 == null) {
                                                                        this.zzd.zzd(this.zzn);
                                                                    }
                                                                    this.zzn = null;
                                                                    this.zzm = null;
                                                                }
                                                                zzQ(zzatbVar6);
                                                                zzatbVar6.zzj();
                                                            } else if (zArr[i20]) {
                                                                zzatbVar6.zzu(this.zzB);
                                                            }
                                                        }
                                                    }
                                                    this.zzg.obtainMessage(3, zzasqVar25.zzm).sendToTarget();
                                                    zzz(zArr2, i19);
                                                } else {
                                                    this.zzC = zzasqVar25;
                                                    for (zzasq zzasqVar29 = zzasqVar25.zzl; zzasqVar29 != null; zzasqVar29 = zzasqVar29.zzl) {
                                                        zzasqVar29.zzc();
                                                    }
                                                    zzasq zzasqVar30 = this.zzC;
                                                    zzasqVar30.zzl = null;
                                                    if (zzasqVar30.zzj) {
                                                        long j7 = zzasqVar30.zzh;
                                                        this.zzC.zza(Math.max(j7, this.zzB - (zzasqVar30.zzf - j7)), false);
                                                    }
                                                }
                                                zzB();
                                                zzN();
                                                this.zze.sendEmptyMessage(2);
                                            } else {
                                                z10 &= zzasqVar25 != this.zzD;
                                                zzasqVar25 = zzasqVar25.zzl;
                                            }
                                        }
                                    }
                                }
                                return true;
                            case 11:
                                zzasl[] zzaslVarArr = (zzasl[]) message.obj;
                                try {
                                    int length = zzaslVarArr.length;
                                    while (i7 < length) {
                                        zzasl zzaslVar = zzaslVarArr[i7];
                                        zzaslVar.zza.zzl(zzaslVar.zzb, zzaslVar.zzc);
                                        i7++;
                                    }
                                    if (this.zzo != null) {
                                        this.zze.sendEmptyMessage(2);
                                    }
                                    synchronized (this) {
                                        this.zzx++;
                                        notifyAll();
                                    }
                                    return true;
                                } catch (Throwable th2) {
                                    synchronized (this) {
                                        this.zzx++;
                                        notifyAll();
                                        throw th2;
                                    }
                                }
                            case 12:
                                int i21 = message.arg1;
                                this.zzv = i21;
                                zzasq zzasqVar31 = this.zzE;
                                if (zzasqVar31 == null) {
                                    zzasqVar31 = this.zzC;
                                }
                                if (zzasqVar31 != null) {
                                    boolean z13 = zzasqVar31 == this.zzD;
                                    boolean z14 = zzasqVar31 == this.zzC;
                                    int zzf2 = this.zzF.zzf(zzasqVar31.zzg, this.zzj, this.zzi, i21);
                                    while (true) {
                                        zzasq zzasqVar32 = zzasqVar31.zzl;
                                        if (zzasqVar32 != null && zzf2 != -1 && (i5 = zzasqVar32.zzg) == zzf2) {
                                            z13 |= zzasqVar32 == this.zzD;
                                            z14 |= zzasqVar32 == this.zzC;
                                            zzf2 = this.zzF.zzf(i5, this.zzj, this.zzi, i21);
                                            zzasqVar31 = zzasqVar32;
                                        }
                                    }
                                    zzasqVar31.zzi = zzO(zzasqVar31.zzg);
                                    if (!z14) {
                                        this.zzC = zzasqVar31;
                                    }
                                    if (!z13 && (zzasqVar6 = this.zzE) != null) {
                                        int i22 = zzasqVar6.zzg;
                                        this.zzk = new zzasr(i22, zzu(i22, this.zzk.zzc));
                                    }
                                    if (this.zzu == 4 && i21 != 0) {
                                        zzJ(2);
                                    }
                                }
                                return true;
                            default:
                                return false;
                        }
                    } catch (zzasi e3) {
                        zzasiVar = e3;
                        z2 = true;
                    } catch (IOException e4) {
                        iOException = e4;
                        z = true;
                    }
                } catch (zzasi e5) {
                    zzasiVar = e5;
                    z2 = true;
                } catch (IOException e6) {
                    iOException = e6;
                    z = true;
                }
            } catch (RuntimeException e7) {
                Log.e("ExoPlayerImplInternal", "Internal runtime error.", e7);
                this.zzg.obtainMessage(8, zzasi.zzc(e7)).sendToTarget();
                zzL();
                return true;
            }
        } catch (zzasi e8) {
            z2 = true;
            i2 = 8;
            zzasiVar = e8;
        } catch (IOException e9) {
            z = true;
            i = 8;
            iOException = e9;
        }
    }

    public final synchronized void zza(zzasl... zzaslVarArr) {
        if (this.zzq) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            return;
        }
        int i = this.zzw;
        this.zzw = i + 1;
        this.zze.obtainMessage(11, zzaslVarArr).sendToTarget();
        while (this.zzx <= i) {
            try {
                wait();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final void zzb() {
        this.zzG = true;
    }

    public final void zzc(int i) {
        this.zzI = i;
    }

    public final void zzd() {
        this.zzH = true;
    }

    @Override // com.google.android.gms.internal.ads.zzayp
    public final /* bridge */ /* synthetic */ void zze(zzayq zzayqVar) {
        this.zze.obtainMessage(9, (zzayc) zzayqVar).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    public final void zzf(zzayc zzaycVar) {
        this.zze.obtainMessage(8, zzaycVar).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final void zzg(zzath zzathVar, Object obj) {
        this.zze.obtainMessage(7, Pair.create(zzathVar, null)).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzazg
    public final void zzh() {
        this.zze.sendEmptyMessage(10);
    }

    public final void zzi(zzaye zzayeVar, boolean z) {
        this.zze.obtainMessage(0, 1, 0, zzayeVar).sendToTarget();
    }

    public final synchronized void zzj() {
        if (this.zzq) {
            return;
        }
        this.zze.sendEmptyMessage(6);
        while (!this.zzq) {
            try {
                wait();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        this.zzf.quit();
    }

    public final void zzk(zzath zzathVar, int i, long j) {
        this.zze.obtainMessage(3, new zzass(zzathVar, 0, j)).sendToTarget();
    }

    public final void zzl(zzasl... zzaslVarArr) {
        if (this.zzq) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        } else {
            this.zzw++;
            this.zze.obtainMessage(11, zzaslVarArr).sendToTarget();
        }
    }

    public final void zzm(int i) {
        this.zzK = i;
    }

    public final void zzn(int i) {
        this.zzJ = i;
    }

    public final void zzo(boolean z) {
        this.zze.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
    }

    public final void zzp() {
        this.zze.sendEmptyMessage(5);
    }

    public final synchronized boolean zzq(zzasl... zzaslVarArr) {
        int i;
        if (this.zzq) {
            return true;
        }
        int i2 = this.zzw;
        this.zzw = i2 + 1;
        this.zze.obtainMessage(11, zzaslVarArr).sendToTarget();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.zzI;
        long j2 = elapsedRealtime + j;
        while (true) {
            i = this.zzx;
            if (i > i2 || j <= 0) {
                break;
            }
            try {
                wait(j);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            j = j2 - SystemClock.elapsedRealtime();
        }
        return i2 < i;
    }

    public final boolean zzr() {
        return this.zzH && this.zzI > 0;
    }

    public final synchronized boolean zzs() {
        if (this.zzq) {
            return true;
        }
        this.zze.sendEmptyMessage(6);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.zzI;
        long j2 = elapsedRealtime + j;
        while (true) {
            if (!this.zzq) {
                if (j <= 0) {
                    break;
                }
                try {
                    wait(j);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
                j = j2 - SystemClock.elapsedRealtime();
            } else {
                this.zzf.quit();
                break;
            }
        }
        return this.zzq;
    }
}
