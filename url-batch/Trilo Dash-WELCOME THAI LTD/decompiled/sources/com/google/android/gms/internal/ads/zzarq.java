package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzarq implements Handler.Callback, zzawx, zzayc, zzawz {
    private zzaro zzA;
    private long zzB;
    private zzarm zzC;
    private zzarm zzD;
    private zzarm zzE;
    private zzasd zzF;
    private boolean zzG;
    private boolean zzH;
    private int zzI;
    private volatile int zzJ;
    private volatile int zzK;
    private final zzcio zzL;
    private final zzarx[] zza;
    private final zzayd zzc;
    private final zzazj zzd;
    private final Handler zze;
    private final HandlerThread zzf;
    private final Handler zzg;
    private final zzari zzh;
    private final zzasc zzi;
    private final zzasb zzj;
    private zzarn zzk;
    private zzarw zzl;
    private zzarx zzm;
    private zzazc zzn;
    private zzaxa zzo;
    private zzarx[] zzp;
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
    private final zzary[] zzb = new zzary[2];

    public zzarq(zzarx[] zzarxVarArr, zzayd zzaydVar, zzcio zzcioVar, boolean z, int i, Handler handler, zzarn zzarnVar, zzari zzariVar, byte[] bArr) {
        this.zza = zzarxVarArr;
        this.zzc = zzaydVar;
        this.zzL = zzcioVar;
        this.zzr = z;
        this.zzg = handler;
        this.zzk = zzarnVar;
        this.zzh = zzariVar;
        for (int i2 = 0; i2 < 2; i2++) {
            zzarxVarArr[i2].zzw(i2);
            this.zzb[i2] = zzarxVarArr[i2].zzf();
        }
        this.zzd = new zzazj();
        this.zzp = new zzarx[0];
        this.zzi = new zzasc();
        this.zzj = new zzasb();
        zzaydVar.zzf(this);
        this.zzl = zzarw.zza;
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.zzf = handlerThread;
        handlerThread.start();
        this.zze = new Handler(handlerThread.getLooper(), this);
    }

    private final void zzA(Object obj, int i) {
        this.zzk = new zzarn(0, 0L);
        zzD(obj, i);
        this.zzk = new zzarn(0, -9223372036854775807L);
        zzJ(4);
        zzE(false);
    }

    private final void zzB() {
        zzarm zzarmVar = this.zzC;
        long zza = !zzarmVar.zzj ? 0L : zzarmVar.zza.zza();
        if (zza == Long.MIN_VALUE) {
            zzH(false);
            return;
        }
        zzarm zzarmVar2 = this.zzC;
        long j = this.zzB - (zzarmVar2.zzf - zzarmVar2.zzh);
        boolean zzj = this.zzL.zzj(zza - j);
        zzH(zzj);
        if (zzj) {
            this.zzC.zza.zzbj(j);
        }
    }

    private final void zzC() throws IOException {
        zzarm zzarmVar = this.zzC;
        if (zzarmVar == null || zzarmVar.zzj) {
            return;
        }
        zzarm zzarmVar2 = this.zzD;
        if (zzarmVar2 == null || zzarmVar2.zzl == zzarmVar) {
            for (zzarx zzarxVar : this.zzp) {
                if (!zzarxVar.zzA()) {
                    return;
                }
            }
            this.zzC.zza.zzs();
        }
    }

    private final void zzD(Object obj, int i) {
        this.zzg.obtainMessage(6, new zzarp(this.zzF, obj, this.zzk, i)).sendToTarget();
    }

    private final void zzE(boolean z) {
        this.zze.removeMessages(2);
        this.zzs = false;
        this.zzd.zzc();
        this.zzn = null;
        this.zzm = null;
        this.zzB = 60000000L;
        for (zzarx zzarxVar : this.zzp) {
            try {
                zzQ(zzarxVar);
                zzarxVar.zzj();
            } catch (zzare | RuntimeException e) {
                Log.e("ExoPlayerImplInternal", "Stop failed.", e);
            }
        }
        this.zzp = new zzarx[0];
        zzarm zzarmVar = this.zzE;
        if (zzarmVar == null) {
            zzarmVar = this.zzC;
        }
        zzR(zzarmVar);
        this.zzC = null;
        this.zzD = null;
        this.zzE = null;
        zzH(false);
        if (z) {
            zzaxa zzaxaVar = this.zzo;
            if (zzaxaVar != null) {
                zzaxaVar.zzd();
                this.zzo = null;
            }
            this.zzF = null;
        }
    }

    private final void zzF(long j) throws zzare {
        zzarm zzarmVar = this.zzE;
        long j2 = zzarmVar == null ? j + 60000000 : j + (zzarmVar.zzf - zzarmVar.zzh);
        this.zzB = j2;
        this.zzd.zza(j2);
        for (zzarx zzarxVar : this.zzp) {
            zzarxVar.zzu(this.zzB);
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

    private final void zzI(zzarm zzarmVar) throws zzare {
        if (this.zzE == zzarmVar) {
            return;
        }
        boolean[] zArr = new boolean[2];
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            zzarx zzarxVar = this.zza[i2];
            zArr[i2] = zzarxVar.zzb() != 0;
            zzaxt zza = zzarmVar.zzm.zzb.zza(i2);
            if (zza != null) {
                i++;
            }
            if (zArr[i2] && (zza == null || (zzarxVar.zzB() && zzarxVar.zzh() == this.zzE.zzd[i2]))) {
                if (zzarxVar == this.zzm) {
                    this.zzd.zzd(this.zzn);
                    this.zzn = null;
                    this.zzm = null;
                }
                zzQ(zzarxVar);
                zzarxVar.zzj();
            }
        }
        this.zzE = zzarmVar;
        this.zzg.obtainMessage(3, zzarmVar.zzm).sendToTarget();
        zzz(zArr, i);
    }

    private final void zzJ(int i) {
        if (this.zzu != i) {
            this.zzu = i;
            this.zzg.obtainMessage(1, i, 0).sendToTarget();
        }
    }

    private final void zzK() throws zzare {
        this.zzs = false;
        this.zzd.zzb();
        for (zzarx zzarxVar : this.zzp) {
            zzarxVar.zzy();
        }
    }

    private final void zzL() {
        zzE(true);
        this.zzL.zzc();
        zzJ(1);
    }

    private final void zzM() throws zzare {
        this.zzd.zzc();
        for (zzarx zzarxVar : this.zzp) {
            zzQ(zzarxVar);
        }
    }

    private final void zzN() throws zzare {
        zzarm zzarmVar = this.zzE;
        if (zzarmVar == null) {
            return;
        }
        long zzh = zzarmVar.zza.zzh();
        if (zzh != -9223372036854775807L) {
            zzF(zzh);
        } else {
            zzarx zzarxVar = this.zzm;
            if (zzarxVar == null || zzarxVar.zzE()) {
                this.zzB = this.zzd.zzI();
            } else {
                long zzI = this.zzn.zzI();
                this.zzB = zzI;
                this.zzd.zza(zzI);
            }
            zzarm zzarmVar2 = this.zzE;
            zzh = this.zzB - (zzarmVar2.zzf - zzarmVar2.zzh);
        }
        this.zzk.zzc = zzh;
        this.zzy = SystemClock.elapsedRealtime() * 1000;
        long zzg = this.zzp.length == 0 ? Long.MIN_VALUE : this.zzE.zza.zzg();
        zzarn zzarnVar = this.zzk;
        if (zzg == Long.MIN_VALUE) {
            zzg = this.zzF.zzd(this.zzE.zzg, this.zzj, false).zzc;
        }
        zzarnVar.zzd = zzg;
    }

    private final boolean zzO(int i) {
        this.zzF.zzd(i, this.zzj, false);
        this.zzF.zzg(0, this.zzi, false);
        return this.zzF.zzf(i, this.zzj, this.zzi, this.zzv) == -1;
    }

    private final boolean zzP(long j) {
        zzarm zzarmVar;
        return j == -9223372036854775807L || this.zzk.zzc < j || ((zzarmVar = this.zzE.zzl) != null && zzarmVar.zzj);
    }

    private static final void zzQ(zzarx zzarxVar) throws zzare {
        if (zzarxVar.zzb() == 2) {
            zzarxVar.zzz();
        }
    }

    private static final void zzR(zzarm zzarmVar) {
        while (zzarmVar != null) {
            zzarmVar.zzc();
            zzarmVar = zzarmVar.zzl;
        }
    }

    private final int zzt(int i, zzasd zzasdVar, zzasd zzasdVar2) {
        int zzb = zzasdVar.zzb();
        int i2 = -1;
        for (int i3 = 0; i3 < zzb && i2 == -1; i3++) {
            i = zzasdVar.zzf(i, this.zzj, this.zzi, this.zzv);
            i2 = zzasdVar2.zza(zzasdVar.zzd(i, this.zzj, true).zzb);
        }
        return i2;
    }

    private final long zzu(int i, long j) throws zzare {
        zzarm zzarmVar;
        zzM();
        this.zzs = false;
        zzJ(2);
        zzarm zzarmVar2 = this.zzE;
        if (zzarmVar2 == null) {
            zzarm zzarmVar3 = this.zzC;
            if (zzarmVar3 != null) {
                zzarmVar3.zzc();
            }
            zzarmVar = null;
        } else {
            zzarmVar = null;
            while (zzarmVar2 != null) {
                if (zzarmVar2.zzg == i && zzarmVar2.zzj) {
                    zzarmVar = zzarmVar2;
                } else {
                    zzarmVar2.zzc();
                }
                zzarmVar2 = zzarmVar2.zzl;
            }
        }
        zzarm zzarmVar4 = this.zzE;
        if (zzarmVar4 != zzarmVar || zzarmVar4 != this.zzD) {
            for (zzarx zzarxVar : this.zzp) {
                zzarxVar.zzj();
            }
            this.zzp = new zzarx[0];
            this.zzn = null;
            this.zzm = null;
            this.zzE = null;
        }
        if (zzarmVar != null) {
            zzarmVar.zzl = null;
            this.zzC = zzarmVar;
            this.zzD = zzarmVar;
            zzI(zzarmVar);
            zzarm zzarmVar5 = this.zzE;
            if (zzarmVar5.zzk) {
                j = zzarmVar5.zza.zzi(j);
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

    private final Pair zzw(zzasd zzasdVar, int i, long j) {
        return zzx(zzasdVar, 0, j, 0L);
    }

    private final Pair zzx(zzasd zzasdVar, int i, long j, long j2) {
        zzayy.zza(0, 0, zzasdVar.zzc());
        zzasdVar.zze(0, this.zzi, false, j2);
        if (j == -9223372036854775807L) {
            j = 0;
        }
        long j3 = zzasdVar.zzd(0, this.zzj, false).zzc;
        if (j3 != -9223372036854775807L) {
            int i2 = (j > j3 ? 1 : (j == j3 ? 0 : -1));
        }
        return Pair.create(0, Long.valueOf(j));
    }

    private final Pair zzy(zzaro zzaroVar) {
        zzasd zzasdVar = zzaroVar.zza;
        if (zzasdVar.zzh()) {
            zzasdVar = this.zzF;
        }
        try {
            int i = zzaroVar.zzb;
            Pair zzw = zzw(zzasdVar, 0, zzaroVar.zzc);
            zzasd zzasdVar2 = this.zzF;
            if (zzasdVar2 == zzasdVar) {
                return zzw;
            }
            if (zzasdVar2.zza(zzasdVar.zzd(((Integer) zzw.first).intValue(), this.zzj, true).zzb) != -1) {
                return Pair.create(0, (Long) zzw.second);
            }
            if (zzt(((Integer) zzw.first).intValue(), zzasdVar, this.zzF) == -1) {
                return null;
            }
            this.zzF.zzd(0, this.zzj, false);
            return zzv(0, -9223372036854775807L);
        } catch (IndexOutOfBoundsException unused) {
            zzasd zzasdVar3 = this.zzF;
            int i2 = zzaroVar.zzb;
            throw new zzaru(zzasdVar3, 0, zzaroVar.zzc);
        }
    }

    private final void zzz(boolean[] zArr, int i) throws zzare {
        int i2;
        this.zzp = new zzarx[i];
        int i3 = 0;
        int i4 = 0;
        while (i3 < 2) {
            zzarx zzarxVar = this.zza[i3];
            zzaxt zza = this.zzE.zzm.zzb.zza(i3);
            if (zza != null) {
                int i5 = i4 + 1;
                this.zzp[i4] = zzarxVar;
                if (zzarxVar.zzb() == 0) {
                    zzarz zzarzVar = this.zzE.zzm.zzd[i3];
                    boolean z = this.zzr && this.zzu == 3;
                    boolean z2 = !zArr[i3] && z;
                    zza.zzb();
                    zzars[] zzarsVarArr = new zzars[1];
                    for (int i6 = 0; i6 <= 0; i6++) {
                        zzarsVarArr[i6] = zza.zzc(i6);
                    }
                    zzarm zzarmVar = this.zzE;
                    i2 = i3;
                    zzarxVar.zzk(zzarzVar, zzarsVarArr, zzarmVar.zzd[i3], this.zzB, z2, zzarmVar.zzf - zzarmVar.zzh);
                    zzazc zzi = zzarxVar.zzi();
                    if (zzi != null) {
                        if (this.zzn != null) {
                            throw zzare.zzc(new IllegalStateException("Multiple renderer media clocks enabled."));
                        }
                        this.zzn = zzi;
                        this.zzm = zzarxVar;
                        zzi.zzK(this.zzl);
                    }
                    if (z) {
                        zzarxVar.zzy();
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

    /* JADX WARN: Code restructure failed: missing block: B:220:0x0332, code lost:
    
        if (r2 != false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0334, code lost:
    
        r2 = r33.zzE.zzg;
        r33.zzk = new com.google.android.gms.internal.ads.zzarn(r2, zzu(r2, r33.zzk.zzc));
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0348, code lost:
    
        r33.zzC = r3;
        r3.zzl = null;
        zzR(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x079a, code lost:
    
        if (zzP(r1) != false) goto L421;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006a, code lost:
    
        zzR(r12);
        r2.zzl = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:179:0x026a A[Catch: IOException -> 0x0874, zzare -> 0x087a, RuntimeException -> 0x0880, TryCatch #6 {RuntimeException -> 0x0880, blocks: (B:3:0x0005, B:9:0x001a, B:11:0x0022, B:15:0x0028, B:18:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:30:0x0053, B:34:0x005b, B:40:0x006a, B:41:0x006f, B:43:0x0079, B:45:0x007d, B:47:0x0081, B:48:0x0092, B:51:0x0098, B:56:0x009c, B:66:0x00ba, B:75:0x00c8, B:78:0x00cb, B:82:0x00d5, B:87:0x00d9, B:88:0x00da, B:92:0x00e1, B:94:0x00e7, B:105:0x00ef, B:108:0x00f8, B:110:0x0117, B:111:0x011e, B:113:0x0124, B:116:0x0131, B:118:0x013b, B:120:0x013f, B:122:0x0145, B:125:0x014b, B:126:0x0152, B:127:0x0156, B:130:0x015d, B:132:0x0161, B:129:0x0166, B:138:0x0169, B:139:0x019d, B:141:0x0178, B:143:0x017e, B:145:0x0184, B:147:0x018c, B:96:0x01a9, B:100:0x01b0, B:152:0x01b6, B:154:0x01be, B:156:0x01c2, B:158:0x01c6, B:160:0x01ce, B:163:0x01d3, B:165:0x01e4, B:166:0x01f2, B:168:0x01f6, B:170:0x0206, B:172:0x020a, B:174:0x0218, B:176:0x021d, B:177:0x0266, B:179:0x026a, B:181:0x026e, B:182:0x0273, B:184:0x027d, B:186:0x0287, B:187:0x028c, B:188:0x02b4, B:190:0x02b8, B:194:0x02c3, B:198:0x02c6, B:199:0x02d6, B:202:0x02e5, B:204:0x02eb, B:206:0x02fc, B:208:0x0300, B:210:0x030e, B:212:0x0320, B:216:0x032f, B:221:0x0334, B:223:0x0348, B:222:0x034f, B:227:0x0235, B:229:0x023d, B:231:0x0245, B:232:0x024a, B:234:0x0353, B:235:0x035e, B:244:0x0369, B:245:0x036a, B:247:0x036e, B:249:0x0376, B:250:0x0380, B:252:0x037b, B:253:0x038c, B:255:0x0394, B:257:0x039d, B:259:0x03a3, B:260:0x03c1, B:263:0x03ca, B:270:0x03ec, B:271:0x03f9, B:277:0x0409, B:281:0x0419, B:282:0x042a, B:284:0x042b, B:286:0x0435, B:287:0x0679, B:289:0x067f, B:292:0x0688, B:294:0x06a3, B:296:0x06ae, B:299:0x06b7, B:301:0x06bd, B:306:0x06c9, B:311:0x06d3, B:318:0x06da, B:319:0x06dd, B:321:0x06e1, B:323:0x06ed, B:324:0x0700, B:328:0x071a, B:330:0x0722, B:332:0x0728, B:333:0x07c2, B:335:0x07c7, B:337:0x07cd, B:339:0x07d5, B:341:0x07d9, B:343:0x07e3, B:345:0x07e7, B:346:0x07ed, B:347:0x080a, B:349:0x07de, B:351:0x07f1, B:353:0x07f6, B:355:0x07fa, B:356:0x0800, B:358:0x0804, B:359:0x0731, B:361:0x0736, B:364:0x073d, B:366:0x0745, B:369:0x0754, B:372:0x079c, B:374:0x07a4, B:375:0x075b, B:376:0x0768, B:378:0x076c, B:381:0x0782, B:382:0x0748, B:383:0x0796, B:387:0x07ab, B:391:0x07b7, B:392:0x07b1, B:393:0x043d, B:395:0x0441, B:396:0x047b, B:398:0x0483, B:400:0x0556, B:402:0x055a, B:405:0x0561, B:407:0x0565, B:409:0x0569, B:410:0x0570, B:412:0x0574, B:414:0x057a, B:416:0x0584, B:418:0x05ab, B:423:0x05b3, B:425:0x05bf, B:427:0x05c5, B:429:0x05cb, B:431:0x05ce, B:439:0x05d5, B:442:0x05e7, B:446:0x05ed, B:450:0x05f0, B:452:0x05f6, B:454:0x05fa, B:456:0x060a, B:460:0x066f, B:463:0x0624, B:464:0x0628, B:466:0x062e, B:468:0x063e, B:470:0x0644, B:472:0x064c, B:474:0x0655, B:476:0x0668, B:480:0x056d, B:481:0x048a, B:483:0x048e, B:485:0x04e8, B:487:0x04ec, B:489:0x0506, B:492:0x0512, B:494:0x0548, B:495:0x054a, B:496:0x050d, B:497:0x04f3, B:498:0x0495, B:501:0x04a6, B:503:0x04d7, B:504:0x0446, B:506:0x044c, B:508:0x0452, B:510:0x0460, B:512:0x0464, B:514:0x046f, B:515:0x0810, B:518:0x0817, B:520:0x081e, B:523:0x0826, B:525:0x082b, B:528:0x0838, B:530:0x083f, B:532:0x0856, B:533:0x0862), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x026e A[Catch: IOException -> 0x0874, zzare -> 0x087a, RuntimeException -> 0x0880, TryCatch #6 {RuntimeException -> 0x0880, blocks: (B:3:0x0005, B:9:0x001a, B:11:0x0022, B:15:0x0028, B:18:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:30:0x0053, B:34:0x005b, B:40:0x006a, B:41:0x006f, B:43:0x0079, B:45:0x007d, B:47:0x0081, B:48:0x0092, B:51:0x0098, B:56:0x009c, B:66:0x00ba, B:75:0x00c8, B:78:0x00cb, B:82:0x00d5, B:87:0x00d9, B:88:0x00da, B:92:0x00e1, B:94:0x00e7, B:105:0x00ef, B:108:0x00f8, B:110:0x0117, B:111:0x011e, B:113:0x0124, B:116:0x0131, B:118:0x013b, B:120:0x013f, B:122:0x0145, B:125:0x014b, B:126:0x0152, B:127:0x0156, B:130:0x015d, B:132:0x0161, B:129:0x0166, B:138:0x0169, B:139:0x019d, B:141:0x0178, B:143:0x017e, B:145:0x0184, B:147:0x018c, B:96:0x01a9, B:100:0x01b0, B:152:0x01b6, B:154:0x01be, B:156:0x01c2, B:158:0x01c6, B:160:0x01ce, B:163:0x01d3, B:165:0x01e4, B:166:0x01f2, B:168:0x01f6, B:170:0x0206, B:172:0x020a, B:174:0x0218, B:176:0x021d, B:177:0x0266, B:179:0x026a, B:181:0x026e, B:182:0x0273, B:184:0x027d, B:186:0x0287, B:187:0x028c, B:188:0x02b4, B:190:0x02b8, B:194:0x02c3, B:198:0x02c6, B:199:0x02d6, B:202:0x02e5, B:204:0x02eb, B:206:0x02fc, B:208:0x0300, B:210:0x030e, B:212:0x0320, B:216:0x032f, B:221:0x0334, B:223:0x0348, B:222:0x034f, B:227:0x0235, B:229:0x023d, B:231:0x0245, B:232:0x024a, B:234:0x0353, B:235:0x035e, B:244:0x0369, B:245:0x036a, B:247:0x036e, B:249:0x0376, B:250:0x0380, B:252:0x037b, B:253:0x038c, B:255:0x0394, B:257:0x039d, B:259:0x03a3, B:260:0x03c1, B:263:0x03ca, B:270:0x03ec, B:271:0x03f9, B:277:0x0409, B:281:0x0419, B:282:0x042a, B:284:0x042b, B:286:0x0435, B:287:0x0679, B:289:0x067f, B:292:0x0688, B:294:0x06a3, B:296:0x06ae, B:299:0x06b7, B:301:0x06bd, B:306:0x06c9, B:311:0x06d3, B:318:0x06da, B:319:0x06dd, B:321:0x06e1, B:323:0x06ed, B:324:0x0700, B:328:0x071a, B:330:0x0722, B:332:0x0728, B:333:0x07c2, B:335:0x07c7, B:337:0x07cd, B:339:0x07d5, B:341:0x07d9, B:343:0x07e3, B:345:0x07e7, B:346:0x07ed, B:347:0x080a, B:349:0x07de, B:351:0x07f1, B:353:0x07f6, B:355:0x07fa, B:356:0x0800, B:358:0x0804, B:359:0x0731, B:361:0x0736, B:364:0x073d, B:366:0x0745, B:369:0x0754, B:372:0x079c, B:374:0x07a4, B:375:0x075b, B:376:0x0768, B:378:0x076c, B:381:0x0782, B:382:0x0748, B:383:0x0796, B:387:0x07ab, B:391:0x07b7, B:392:0x07b1, B:393:0x043d, B:395:0x0441, B:396:0x047b, B:398:0x0483, B:400:0x0556, B:402:0x055a, B:405:0x0561, B:407:0x0565, B:409:0x0569, B:410:0x0570, B:412:0x0574, B:414:0x057a, B:416:0x0584, B:418:0x05ab, B:423:0x05b3, B:425:0x05bf, B:427:0x05c5, B:429:0x05cb, B:431:0x05ce, B:439:0x05d5, B:442:0x05e7, B:446:0x05ed, B:450:0x05f0, B:452:0x05f6, B:454:0x05fa, B:456:0x060a, B:460:0x066f, B:463:0x0624, B:464:0x0628, B:466:0x062e, B:468:0x063e, B:470:0x0644, B:472:0x064c, B:474:0x0655, B:476:0x0668, B:480:0x056d, B:481:0x048a, B:483:0x048e, B:485:0x04e8, B:487:0x04ec, B:489:0x0506, B:492:0x0512, B:494:0x0548, B:495:0x054a, B:496:0x050d, B:497:0x04f3, B:498:0x0495, B:501:0x04a6, B:503:0x04d7, B:504:0x0446, B:506:0x044c, B:508:0x0452, B:510:0x0460, B:512:0x0464, B:514:0x046f, B:515:0x0810, B:518:0x0817, B:520:0x081e, B:523:0x0826, B:525:0x082b, B:528:0x0838, B:530:0x083f, B:532:0x0856, B:533:0x0862), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0273 A[Catch: IOException -> 0x0874, zzare -> 0x087a, RuntimeException -> 0x0880, TryCatch #6 {RuntimeException -> 0x0880, blocks: (B:3:0x0005, B:9:0x001a, B:11:0x0022, B:15:0x0028, B:18:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:30:0x0053, B:34:0x005b, B:40:0x006a, B:41:0x006f, B:43:0x0079, B:45:0x007d, B:47:0x0081, B:48:0x0092, B:51:0x0098, B:56:0x009c, B:66:0x00ba, B:75:0x00c8, B:78:0x00cb, B:82:0x00d5, B:87:0x00d9, B:88:0x00da, B:92:0x00e1, B:94:0x00e7, B:105:0x00ef, B:108:0x00f8, B:110:0x0117, B:111:0x011e, B:113:0x0124, B:116:0x0131, B:118:0x013b, B:120:0x013f, B:122:0x0145, B:125:0x014b, B:126:0x0152, B:127:0x0156, B:130:0x015d, B:132:0x0161, B:129:0x0166, B:138:0x0169, B:139:0x019d, B:141:0x0178, B:143:0x017e, B:145:0x0184, B:147:0x018c, B:96:0x01a9, B:100:0x01b0, B:152:0x01b6, B:154:0x01be, B:156:0x01c2, B:158:0x01c6, B:160:0x01ce, B:163:0x01d3, B:165:0x01e4, B:166:0x01f2, B:168:0x01f6, B:170:0x0206, B:172:0x020a, B:174:0x0218, B:176:0x021d, B:177:0x0266, B:179:0x026a, B:181:0x026e, B:182:0x0273, B:184:0x027d, B:186:0x0287, B:187:0x028c, B:188:0x02b4, B:190:0x02b8, B:194:0x02c3, B:198:0x02c6, B:199:0x02d6, B:202:0x02e5, B:204:0x02eb, B:206:0x02fc, B:208:0x0300, B:210:0x030e, B:212:0x0320, B:216:0x032f, B:221:0x0334, B:223:0x0348, B:222:0x034f, B:227:0x0235, B:229:0x023d, B:231:0x0245, B:232:0x024a, B:234:0x0353, B:235:0x035e, B:244:0x0369, B:245:0x036a, B:247:0x036e, B:249:0x0376, B:250:0x0380, B:252:0x037b, B:253:0x038c, B:255:0x0394, B:257:0x039d, B:259:0x03a3, B:260:0x03c1, B:263:0x03ca, B:270:0x03ec, B:271:0x03f9, B:277:0x0409, B:281:0x0419, B:282:0x042a, B:284:0x042b, B:286:0x0435, B:287:0x0679, B:289:0x067f, B:292:0x0688, B:294:0x06a3, B:296:0x06ae, B:299:0x06b7, B:301:0x06bd, B:306:0x06c9, B:311:0x06d3, B:318:0x06da, B:319:0x06dd, B:321:0x06e1, B:323:0x06ed, B:324:0x0700, B:328:0x071a, B:330:0x0722, B:332:0x0728, B:333:0x07c2, B:335:0x07c7, B:337:0x07cd, B:339:0x07d5, B:341:0x07d9, B:343:0x07e3, B:345:0x07e7, B:346:0x07ed, B:347:0x080a, B:349:0x07de, B:351:0x07f1, B:353:0x07f6, B:355:0x07fa, B:356:0x0800, B:358:0x0804, B:359:0x0731, B:361:0x0736, B:364:0x073d, B:366:0x0745, B:369:0x0754, B:372:0x079c, B:374:0x07a4, B:375:0x075b, B:376:0x0768, B:378:0x076c, B:381:0x0782, B:382:0x0748, B:383:0x0796, B:387:0x07ab, B:391:0x07b7, B:392:0x07b1, B:393:0x043d, B:395:0x0441, B:396:0x047b, B:398:0x0483, B:400:0x0556, B:402:0x055a, B:405:0x0561, B:407:0x0565, B:409:0x0569, B:410:0x0570, B:412:0x0574, B:414:0x057a, B:416:0x0584, B:418:0x05ab, B:423:0x05b3, B:425:0x05bf, B:427:0x05c5, B:429:0x05cb, B:431:0x05ce, B:439:0x05d5, B:442:0x05e7, B:446:0x05ed, B:450:0x05f0, B:452:0x05f6, B:454:0x05fa, B:456:0x060a, B:460:0x066f, B:463:0x0624, B:464:0x0628, B:466:0x062e, B:468:0x063e, B:470:0x0644, B:472:0x064c, B:474:0x0655, B:476:0x0668, B:480:0x056d, B:481:0x048a, B:483:0x048e, B:485:0x04e8, B:487:0x04ec, B:489:0x0506, B:492:0x0512, B:494:0x0548, B:495:0x054a, B:496:0x050d, B:497:0x04f3, B:498:0x0495, B:501:0x04a6, B:503:0x04d7, B:504:0x0446, B:506:0x044c, B:508:0x0452, B:510:0x0460, B:512:0x0464, B:514:0x046f, B:515:0x0810, B:518:0x0817, B:520:0x081e, B:523:0x0826, B:525:0x082b, B:528:0x0838, B:530:0x083f, B:532:0x0856, B:533:0x0862), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x06c9 A[Catch: IOException -> 0x0874, zzare -> 0x087a, RuntimeException -> 0x0880, TryCatch #6 {RuntimeException -> 0x0880, blocks: (B:3:0x0005, B:9:0x001a, B:11:0x0022, B:15:0x0028, B:18:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:30:0x0053, B:34:0x005b, B:40:0x006a, B:41:0x006f, B:43:0x0079, B:45:0x007d, B:47:0x0081, B:48:0x0092, B:51:0x0098, B:56:0x009c, B:66:0x00ba, B:75:0x00c8, B:78:0x00cb, B:82:0x00d5, B:87:0x00d9, B:88:0x00da, B:92:0x00e1, B:94:0x00e7, B:105:0x00ef, B:108:0x00f8, B:110:0x0117, B:111:0x011e, B:113:0x0124, B:116:0x0131, B:118:0x013b, B:120:0x013f, B:122:0x0145, B:125:0x014b, B:126:0x0152, B:127:0x0156, B:130:0x015d, B:132:0x0161, B:129:0x0166, B:138:0x0169, B:139:0x019d, B:141:0x0178, B:143:0x017e, B:145:0x0184, B:147:0x018c, B:96:0x01a9, B:100:0x01b0, B:152:0x01b6, B:154:0x01be, B:156:0x01c2, B:158:0x01c6, B:160:0x01ce, B:163:0x01d3, B:165:0x01e4, B:166:0x01f2, B:168:0x01f6, B:170:0x0206, B:172:0x020a, B:174:0x0218, B:176:0x021d, B:177:0x0266, B:179:0x026a, B:181:0x026e, B:182:0x0273, B:184:0x027d, B:186:0x0287, B:187:0x028c, B:188:0x02b4, B:190:0x02b8, B:194:0x02c3, B:198:0x02c6, B:199:0x02d6, B:202:0x02e5, B:204:0x02eb, B:206:0x02fc, B:208:0x0300, B:210:0x030e, B:212:0x0320, B:216:0x032f, B:221:0x0334, B:223:0x0348, B:222:0x034f, B:227:0x0235, B:229:0x023d, B:231:0x0245, B:232:0x024a, B:234:0x0353, B:235:0x035e, B:244:0x0369, B:245:0x036a, B:247:0x036e, B:249:0x0376, B:250:0x0380, B:252:0x037b, B:253:0x038c, B:255:0x0394, B:257:0x039d, B:259:0x03a3, B:260:0x03c1, B:263:0x03ca, B:270:0x03ec, B:271:0x03f9, B:277:0x0409, B:281:0x0419, B:282:0x042a, B:284:0x042b, B:286:0x0435, B:287:0x0679, B:289:0x067f, B:292:0x0688, B:294:0x06a3, B:296:0x06ae, B:299:0x06b7, B:301:0x06bd, B:306:0x06c9, B:311:0x06d3, B:318:0x06da, B:319:0x06dd, B:321:0x06e1, B:323:0x06ed, B:324:0x0700, B:328:0x071a, B:330:0x0722, B:332:0x0728, B:333:0x07c2, B:335:0x07c7, B:337:0x07cd, B:339:0x07d5, B:341:0x07d9, B:343:0x07e3, B:345:0x07e7, B:346:0x07ed, B:347:0x080a, B:349:0x07de, B:351:0x07f1, B:353:0x07f6, B:355:0x07fa, B:356:0x0800, B:358:0x0804, B:359:0x0731, B:361:0x0736, B:364:0x073d, B:366:0x0745, B:369:0x0754, B:372:0x079c, B:374:0x07a4, B:375:0x075b, B:376:0x0768, B:378:0x076c, B:381:0x0782, B:382:0x0748, B:383:0x0796, B:387:0x07ab, B:391:0x07b7, B:392:0x07b1, B:393:0x043d, B:395:0x0441, B:396:0x047b, B:398:0x0483, B:400:0x0556, B:402:0x055a, B:405:0x0561, B:407:0x0565, B:409:0x0569, B:410:0x0570, B:412:0x0574, B:414:0x057a, B:416:0x0584, B:418:0x05ab, B:423:0x05b3, B:425:0x05bf, B:427:0x05c5, B:429:0x05cb, B:431:0x05ce, B:439:0x05d5, B:442:0x05e7, B:446:0x05ed, B:450:0x05f0, B:452:0x05f6, B:454:0x05fa, B:456:0x060a, B:460:0x066f, B:463:0x0624, B:464:0x0628, B:466:0x062e, B:468:0x063e, B:470:0x0644, B:472:0x064c, B:474:0x0655, B:476:0x0668, B:480:0x056d, B:481:0x048a, B:483:0x048e, B:485:0x04e8, B:487:0x04ec, B:489:0x0506, B:492:0x0512, B:494:0x0548, B:495:0x054a, B:496:0x050d, B:497:0x04f3, B:498:0x0495, B:501:0x04a6, B:503:0x04d7, B:504:0x0446, B:506:0x044c, B:508:0x0452, B:510:0x0460, B:512:0x0464, B:514:0x046f, B:515:0x0810, B:518:0x0817, B:520:0x081e, B:523:0x0826, B:525:0x082b, B:528:0x0838, B:530:0x083f, B:532:0x0856, B:533:0x0862), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:374:0x07a4 A[Catch: IOException -> 0x0874, zzare -> 0x087a, RuntimeException -> 0x0880, TryCatch #6 {RuntimeException -> 0x0880, blocks: (B:3:0x0005, B:9:0x001a, B:11:0x0022, B:15:0x0028, B:18:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:30:0x0053, B:34:0x005b, B:40:0x006a, B:41:0x006f, B:43:0x0079, B:45:0x007d, B:47:0x0081, B:48:0x0092, B:51:0x0098, B:56:0x009c, B:66:0x00ba, B:75:0x00c8, B:78:0x00cb, B:82:0x00d5, B:87:0x00d9, B:88:0x00da, B:92:0x00e1, B:94:0x00e7, B:105:0x00ef, B:108:0x00f8, B:110:0x0117, B:111:0x011e, B:113:0x0124, B:116:0x0131, B:118:0x013b, B:120:0x013f, B:122:0x0145, B:125:0x014b, B:126:0x0152, B:127:0x0156, B:130:0x015d, B:132:0x0161, B:129:0x0166, B:138:0x0169, B:139:0x019d, B:141:0x0178, B:143:0x017e, B:145:0x0184, B:147:0x018c, B:96:0x01a9, B:100:0x01b0, B:152:0x01b6, B:154:0x01be, B:156:0x01c2, B:158:0x01c6, B:160:0x01ce, B:163:0x01d3, B:165:0x01e4, B:166:0x01f2, B:168:0x01f6, B:170:0x0206, B:172:0x020a, B:174:0x0218, B:176:0x021d, B:177:0x0266, B:179:0x026a, B:181:0x026e, B:182:0x0273, B:184:0x027d, B:186:0x0287, B:187:0x028c, B:188:0x02b4, B:190:0x02b8, B:194:0x02c3, B:198:0x02c6, B:199:0x02d6, B:202:0x02e5, B:204:0x02eb, B:206:0x02fc, B:208:0x0300, B:210:0x030e, B:212:0x0320, B:216:0x032f, B:221:0x0334, B:223:0x0348, B:222:0x034f, B:227:0x0235, B:229:0x023d, B:231:0x0245, B:232:0x024a, B:234:0x0353, B:235:0x035e, B:244:0x0369, B:245:0x036a, B:247:0x036e, B:249:0x0376, B:250:0x0380, B:252:0x037b, B:253:0x038c, B:255:0x0394, B:257:0x039d, B:259:0x03a3, B:260:0x03c1, B:263:0x03ca, B:270:0x03ec, B:271:0x03f9, B:277:0x0409, B:281:0x0419, B:282:0x042a, B:284:0x042b, B:286:0x0435, B:287:0x0679, B:289:0x067f, B:292:0x0688, B:294:0x06a3, B:296:0x06ae, B:299:0x06b7, B:301:0x06bd, B:306:0x06c9, B:311:0x06d3, B:318:0x06da, B:319:0x06dd, B:321:0x06e1, B:323:0x06ed, B:324:0x0700, B:328:0x071a, B:330:0x0722, B:332:0x0728, B:333:0x07c2, B:335:0x07c7, B:337:0x07cd, B:339:0x07d5, B:341:0x07d9, B:343:0x07e3, B:345:0x07e7, B:346:0x07ed, B:347:0x080a, B:349:0x07de, B:351:0x07f1, B:353:0x07f6, B:355:0x07fa, B:356:0x0800, B:358:0x0804, B:359:0x0731, B:361:0x0736, B:364:0x073d, B:366:0x0745, B:369:0x0754, B:372:0x079c, B:374:0x07a4, B:375:0x075b, B:376:0x0768, B:378:0x076c, B:381:0x0782, B:382:0x0748, B:383:0x0796, B:387:0x07ab, B:391:0x07b7, B:392:0x07b1, B:393:0x043d, B:395:0x0441, B:396:0x047b, B:398:0x0483, B:400:0x0556, B:402:0x055a, B:405:0x0561, B:407:0x0565, B:409:0x0569, B:410:0x0570, B:412:0x0574, B:414:0x057a, B:416:0x0584, B:418:0x05ab, B:423:0x05b3, B:425:0x05bf, B:427:0x05c5, B:429:0x05cb, B:431:0x05ce, B:439:0x05d5, B:442:0x05e7, B:446:0x05ed, B:450:0x05f0, B:452:0x05f6, B:454:0x05fa, B:456:0x060a, B:460:0x066f, B:463:0x0624, B:464:0x0628, B:466:0x062e, B:468:0x063e, B:470:0x0644, B:472:0x064c, B:474:0x0655, B:476:0x0668, B:480:0x056d, B:481:0x048a, B:483:0x048e, B:485:0x04e8, B:487:0x04ec, B:489:0x0506, B:492:0x0512, B:494:0x0548, B:495:0x054a, B:496:0x050d, B:497:0x04f3, B:498:0x0495, B:501:0x04a6, B:503:0x04d7, B:504:0x0446, B:506:0x044c, B:508:0x0452, B:510:0x0460, B:512:0x0464, B:514:0x046f, B:515:0x0810, B:518:0x0817, B:520:0x081e, B:523:0x0826, B:525:0x082b, B:528:0x0838, B:530:0x083f, B:532:0x0856, B:533:0x0862), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:402:0x055a A[Catch: IOException -> 0x0874, zzare -> 0x087a, RuntimeException -> 0x0880, TryCatch #6 {RuntimeException -> 0x0880, blocks: (B:3:0x0005, B:9:0x001a, B:11:0x0022, B:15:0x0028, B:18:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:30:0x0053, B:34:0x005b, B:40:0x006a, B:41:0x006f, B:43:0x0079, B:45:0x007d, B:47:0x0081, B:48:0x0092, B:51:0x0098, B:56:0x009c, B:66:0x00ba, B:75:0x00c8, B:78:0x00cb, B:82:0x00d5, B:87:0x00d9, B:88:0x00da, B:92:0x00e1, B:94:0x00e7, B:105:0x00ef, B:108:0x00f8, B:110:0x0117, B:111:0x011e, B:113:0x0124, B:116:0x0131, B:118:0x013b, B:120:0x013f, B:122:0x0145, B:125:0x014b, B:126:0x0152, B:127:0x0156, B:130:0x015d, B:132:0x0161, B:129:0x0166, B:138:0x0169, B:139:0x019d, B:141:0x0178, B:143:0x017e, B:145:0x0184, B:147:0x018c, B:96:0x01a9, B:100:0x01b0, B:152:0x01b6, B:154:0x01be, B:156:0x01c2, B:158:0x01c6, B:160:0x01ce, B:163:0x01d3, B:165:0x01e4, B:166:0x01f2, B:168:0x01f6, B:170:0x0206, B:172:0x020a, B:174:0x0218, B:176:0x021d, B:177:0x0266, B:179:0x026a, B:181:0x026e, B:182:0x0273, B:184:0x027d, B:186:0x0287, B:187:0x028c, B:188:0x02b4, B:190:0x02b8, B:194:0x02c3, B:198:0x02c6, B:199:0x02d6, B:202:0x02e5, B:204:0x02eb, B:206:0x02fc, B:208:0x0300, B:210:0x030e, B:212:0x0320, B:216:0x032f, B:221:0x0334, B:223:0x0348, B:222:0x034f, B:227:0x0235, B:229:0x023d, B:231:0x0245, B:232:0x024a, B:234:0x0353, B:235:0x035e, B:244:0x0369, B:245:0x036a, B:247:0x036e, B:249:0x0376, B:250:0x0380, B:252:0x037b, B:253:0x038c, B:255:0x0394, B:257:0x039d, B:259:0x03a3, B:260:0x03c1, B:263:0x03ca, B:270:0x03ec, B:271:0x03f9, B:277:0x0409, B:281:0x0419, B:282:0x042a, B:284:0x042b, B:286:0x0435, B:287:0x0679, B:289:0x067f, B:292:0x0688, B:294:0x06a3, B:296:0x06ae, B:299:0x06b7, B:301:0x06bd, B:306:0x06c9, B:311:0x06d3, B:318:0x06da, B:319:0x06dd, B:321:0x06e1, B:323:0x06ed, B:324:0x0700, B:328:0x071a, B:330:0x0722, B:332:0x0728, B:333:0x07c2, B:335:0x07c7, B:337:0x07cd, B:339:0x07d5, B:341:0x07d9, B:343:0x07e3, B:345:0x07e7, B:346:0x07ed, B:347:0x080a, B:349:0x07de, B:351:0x07f1, B:353:0x07f6, B:355:0x07fa, B:356:0x0800, B:358:0x0804, B:359:0x0731, B:361:0x0736, B:364:0x073d, B:366:0x0745, B:369:0x0754, B:372:0x079c, B:374:0x07a4, B:375:0x075b, B:376:0x0768, B:378:0x076c, B:381:0x0782, B:382:0x0748, B:383:0x0796, B:387:0x07ab, B:391:0x07b7, B:392:0x07b1, B:393:0x043d, B:395:0x0441, B:396:0x047b, B:398:0x0483, B:400:0x0556, B:402:0x055a, B:405:0x0561, B:407:0x0565, B:409:0x0569, B:410:0x0570, B:412:0x0574, B:414:0x057a, B:416:0x0584, B:418:0x05ab, B:423:0x05b3, B:425:0x05bf, B:427:0x05c5, B:429:0x05cb, B:431:0x05ce, B:439:0x05d5, B:442:0x05e7, B:446:0x05ed, B:450:0x05f0, B:452:0x05f6, B:454:0x05fa, B:456:0x060a, B:460:0x066f, B:463:0x0624, B:464:0x0628, B:466:0x062e, B:468:0x063e, B:470:0x0644, B:472:0x064c, B:474:0x0655, B:476:0x0668, B:480:0x056d, B:481:0x048a, B:483:0x048e, B:485:0x04e8, B:487:0x04ec, B:489:0x0506, B:492:0x0512, B:494:0x0548, B:495:0x054a, B:496:0x050d, B:497:0x04f3, B:498:0x0495, B:501:0x04a6, B:503:0x04d7, B:504:0x0446, B:506:0x044c, B:508:0x0452, B:510:0x0460, B:512:0x0464, B:514:0x046f, B:515:0x0810, B:518:0x0817, B:520:0x081e, B:523:0x0826, B:525:0x082b, B:528:0x0838, B:530:0x083f, B:532:0x0856, B:533:0x0862), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0574 A[Catch: IOException -> 0x0874, zzare -> 0x087a, RuntimeException -> 0x0880, LOOP:9: B:412:0x0574->B:416:0x0584, LOOP_START, TryCatch #6 {RuntimeException -> 0x0880, blocks: (B:3:0x0005, B:9:0x001a, B:11:0x0022, B:15:0x0028, B:18:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:30:0x0053, B:34:0x005b, B:40:0x006a, B:41:0x006f, B:43:0x0079, B:45:0x007d, B:47:0x0081, B:48:0x0092, B:51:0x0098, B:56:0x009c, B:66:0x00ba, B:75:0x00c8, B:78:0x00cb, B:82:0x00d5, B:87:0x00d9, B:88:0x00da, B:92:0x00e1, B:94:0x00e7, B:105:0x00ef, B:108:0x00f8, B:110:0x0117, B:111:0x011e, B:113:0x0124, B:116:0x0131, B:118:0x013b, B:120:0x013f, B:122:0x0145, B:125:0x014b, B:126:0x0152, B:127:0x0156, B:130:0x015d, B:132:0x0161, B:129:0x0166, B:138:0x0169, B:139:0x019d, B:141:0x0178, B:143:0x017e, B:145:0x0184, B:147:0x018c, B:96:0x01a9, B:100:0x01b0, B:152:0x01b6, B:154:0x01be, B:156:0x01c2, B:158:0x01c6, B:160:0x01ce, B:163:0x01d3, B:165:0x01e4, B:166:0x01f2, B:168:0x01f6, B:170:0x0206, B:172:0x020a, B:174:0x0218, B:176:0x021d, B:177:0x0266, B:179:0x026a, B:181:0x026e, B:182:0x0273, B:184:0x027d, B:186:0x0287, B:187:0x028c, B:188:0x02b4, B:190:0x02b8, B:194:0x02c3, B:198:0x02c6, B:199:0x02d6, B:202:0x02e5, B:204:0x02eb, B:206:0x02fc, B:208:0x0300, B:210:0x030e, B:212:0x0320, B:216:0x032f, B:221:0x0334, B:223:0x0348, B:222:0x034f, B:227:0x0235, B:229:0x023d, B:231:0x0245, B:232:0x024a, B:234:0x0353, B:235:0x035e, B:244:0x0369, B:245:0x036a, B:247:0x036e, B:249:0x0376, B:250:0x0380, B:252:0x037b, B:253:0x038c, B:255:0x0394, B:257:0x039d, B:259:0x03a3, B:260:0x03c1, B:263:0x03ca, B:270:0x03ec, B:271:0x03f9, B:277:0x0409, B:281:0x0419, B:282:0x042a, B:284:0x042b, B:286:0x0435, B:287:0x0679, B:289:0x067f, B:292:0x0688, B:294:0x06a3, B:296:0x06ae, B:299:0x06b7, B:301:0x06bd, B:306:0x06c9, B:311:0x06d3, B:318:0x06da, B:319:0x06dd, B:321:0x06e1, B:323:0x06ed, B:324:0x0700, B:328:0x071a, B:330:0x0722, B:332:0x0728, B:333:0x07c2, B:335:0x07c7, B:337:0x07cd, B:339:0x07d5, B:341:0x07d9, B:343:0x07e3, B:345:0x07e7, B:346:0x07ed, B:347:0x080a, B:349:0x07de, B:351:0x07f1, B:353:0x07f6, B:355:0x07fa, B:356:0x0800, B:358:0x0804, B:359:0x0731, B:361:0x0736, B:364:0x073d, B:366:0x0745, B:369:0x0754, B:372:0x079c, B:374:0x07a4, B:375:0x075b, B:376:0x0768, B:378:0x076c, B:381:0x0782, B:382:0x0748, B:383:0x0796, B:387:0x07ab, B:391:0x07b7, B:392:0x07b1, B:393:0x043d, B:395:0x0441, B:396:0x047b, B:398:0x0483, B:400:0x0556, B:402:0x055a, B:405:0x0561, B:407:0x0565, B:409:0x0569, B:410:0x0570, B:412:0x0574, B:414:0x057a, B:416:0x0584, B:418:0x05ab, B:423:0x05b3, B:425:0x05bf, B:427:0x05c5, B:429:0x05cb, B:431:0x05ce, B:439:0x05d5, B:442:0x05e7, B:446:0x05ed, B:450:0x05f0, B:452:0x05f6, B:454:0x05fa, B:456:0x060a, B:460:0x066f, B:463:0x0624, B:464:0x0628, B:466:0x062e, B:468:0x063e, B:470:0x0644, B:472:0x064c, B:474:0x0655, B:476:0x0668, B:480:0x056d, B:481:0x048a, B:483:0x048e, B:485:0x04e8, B:487:0x04ec, B:489:0x0506, B:492:0x0512, B:494:0x0548, B:495:0x054a, B:496:0x050d, B:497:0x04f3, B:498:0x0495, B:501:0x04a6, B:503:0x04d7, B:504:0x0446, B:506:0x044c, B:508:0x0452, B:510:0x0460, B:512:0x0464, B:514:0x046f, B:515:0x0810, B:518:0x0817, B:520:0x081e, B:523:0x0826, B:525:0x082b, B:528:0x0838, B:530:0x083f, B:532:0x0856, B:533:0x0862), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:487:0x04ec A[Catch: IOException -> 0x0874, zzare -> 0x087a, RuntimeException -> 0x0880, TryCatch #6 {RuntimeException -> 0x0880, blocks: (B:3:0x0005, B:9:0x001a, B:11:0x0022, B:15:0x0028, B:18:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:30:0x0053, B:34:0x005b, B:40:0x006a, B:41:0x006f, B:43:0x0079, B:45:0x007d, B:47:0x0081, B:48:0x0092, B:51:0x0098, B:56:0x009c, B:66:0x00ba, B:75:0x00c8, B:78:0x00cb, B:82:0x00d5, B:87:0x00d9, B:88:0x00da, B:92:0x00e1, B:94:0x00e7, B:105:0x00ef, B:108:0x00f8, B:110:0x0117, B:111:0x011e, B:113:0x0124, B:116:0x0131, B:118:0x013b, B:120:0x013f, B:122:0x0145, B:125:0x014b, B:126:0x0152, B:127:0x0156, B:130:0x015d, B:132:0x0161, B:129:0x0166, B:138:0x0169, B:139:0x019d, B:141:0x0178, B:143:0x017e, B:145:0x0184, B:147:0x018c, B:96:0x01a9, B:100:0x01b0, B:152:0x01b6, B:154:0x01be, B:156:0x01c2, B:158:0x01c6, B:160:0x01ce, B:163:0x01d3, B:165:0x01e4, B:166:0x01f2, B:168:0x01f6, B:170:0x0206, B:172:0x020a, B:174:0x0218, B:176:0x021d, B:177:0x0266, B:179:0x026a, B:181:0x026e, B:182:0x0273, B:184:0x027d, B:186:0x0287, B:187:0x028c, B:188:0x02b4, B:190:0x02b8, B:194:0x02c3, B:198:0x02c6, B:199:0x02d6, B:202:0x02e5, B:204:0x02eb, B:206:0x02fc, B:208:0x0300, B:210:0x030e, B:212:0x0320, B:216:0x032f, B:221:0x0334, B:223:0x0348, B:222:0x034f, B:227:0x0235, B:229:0x023d, B:231:0x0245, B:232:0x024a, B:234:0x0353, B:235:0x035e, B:244:0x0369, B:245:0x036a, B:247:0x036e, B:249:0x0376, B:250:0x0380, B:252:0x037b, B:253:0x038c, B:255:0x0394, B:257:0x039d, B:259:0x03a3, B:260:0x03c1, B:263:0x03ca, B:270:0x03ec, B:271:0x03f9, B:277:0x0409, B:281:0x0419, B:282:0x042a, B:284:0x042b, B:286:0x0435, B:287:0x0679, B:289:0x067f, B:292:0x0688, B:294:0x06a3, B:296:0x06ae, B:299:0x06b7, B:301:0x06bd, B:306:0x06c9, B:311:0x06d3, B:318:0x06da, B:319:0x06dd, B:321:0x06e1, B:323:0x06ed, B:324:0x0700, B:328:0x071a, B:330:0x0722, B:332:0x0728, B:333:0x07c2, B:335:0x07c7, B:337:0x07cd, B:339:0x07d5, B:341:0x07d9, B:343:0x07e3, B:345:0x07e7, B:346:0x07ed, B:347:0x080a, B:349:0x07de, B:351:0x07f1, B:353:0x07f6, B:355:0x07fa, B:356:0x0800, B:358:0x0804, B:359:0x0731, B:361:0x0736, B:364:0x073d, B:366:0x0745, B:369:0x0754, B:372:0x079c, B:374:0x07a4, B:375:0x075b, B:376:0x0768, B:378:0x076c, B:381:0x0782, B:382:0x0748, B:383:0x0796, B:387:0x07ab, B:391:0x07b7, B:392:0x07b1, B:393:0x043d, B:395:0x0441, B:396:0x047b, B:398:0x0483, B:400:0x0556, B:402:0x055a, B:405:0x0561, B:407:0x0565, B:409:0x0569, B:410:0x0570, B:412:0x0574, B:414:0x057a, B:416:0x0584, B:418:0x05ab, B:423:0x05b3, B:425:0x05bf, B:427:0x05c5, B:429:0x05cb, B:431:0x05ce, B:439:0x05d5, B:442:0x05e7, B:446:0x05ed, B:450:0x05f0, B:452:0x05f6, B:454:0x05fa, B:456:0x060a, B:460:0x066f, B:463:0x0624, B:464:0x0628, B:466:0x062e, B:468:0x063e, B:470:0x0644, B:472:0x064c, B:474:0x0655, B:476:0x0668, B:480:0x056d, B:481:0x048a, B:483:0x048e, B:485:0x04e8, B:487:0x04ec, B:489:0x0506, B:492:0x0512, B:494:0x0548, B:495:0x054a, B:496:0x050d, B:497:0x04f3, B:498:0x0495, B:501:0x04a6, B:503:0x04d7, B:504:0x0446, B:506:0x044c, B:508:0x0452, B:510:0x0460, B:512:0x0464, B:514:0x046f, B:515:0x0810, B:518:0x0817, B:520:0x081e, B:523:0x0826, B:525:0x082b, B:528:0x0838, B:530:0x083f, B:532:0x0856, B:533:0x0862), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:491:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0548 A[Catch: IOException -> 0x0874, zzare -> 0x087a, RuntimeException -> 0x0880, TryCatch #6 {RuntimeException -> 0x0880, blocks: (B:3:0x0005, B:9:0x001a, B:11:0x0022, B:15:0x0028, B:18:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:30:0x0053, B:34:0x005b, B:40:0x006a, B:41:0x006f, B:43:0x0079, B:45:0x007d, B:47:0x0081, B:48:0x0092, B:51:0x0098, B:56:0x009c, B:66:0x00ba, B:75:0x00c8, B:78:0x00cb, B:82:0x00d5, B:87:0x00d9, B:88:0x00da, B:92:0x00e1, B:94:0x00e7, B:105:0x00ef, B:108:0x00f8, B:110:0x0117, B:111:0x011e, B:113:0x0124, B:116:0x0131, B:118:0x013b, B:120:0x013f, B:122:0x0145, B:125:0x014b, B:126:0x0152, B:127:0x0156, B:130:0x015d, B:132:0x0161, B:129:0x0166, B:138:0x0169, B:139:0x019d, B:141:0x0178, B:143:0x017e, B:145:0x0184, B:147:0x018c, B:96:0x01a9, B:100:0x01b0, B:152:0x01b6, B:154:0x01be, B:156:0x01c2, B:158:0x01c6, B:160:0x01ce, B:163:0x01d3, B:165:0x01e4, B:166:0x01f2, B:168:0x01f6, B:170:0x0206, B:172:0x020a, B:174:0x0218, B:176:0x021d, B:177:0x0266, B:179:0x026a, B:181:0x026e, B:182:0x0273, B:184:0x027d, B:186:0x0287, B:187:0x028c, B:188:0x02b4, B:190:0x02b8, B:194:0x02c3, B:198:0x02c6, B:199:0x02d6, B:202:0x02e5, B:204:0x02eb, B:206:0x02fc, B:208:0x0300, B:210:0x030e, B:212:0x0320, B:216:0x032f, B:221:0x0334, B:223:0x0348, B:222:0x034f, B:227:0x0235, B:229:0x023d, B:231:0x0245, B:232:0x024a, B:234:0x0353, B:235:0x035e, B:244:0x0369, B:245:0x036a, B:247:0x036e, B:249:0x0376, B:250:0x0380, B:252:0x037b, B:253:0x038c, B:255:0x0394, B:257:0x039d, B:259:0x03a3, B:260:0x03c1, B:263:0x03ca, B:270:0x03ec, B:271:0x03f9, B:277:0x0409, B:281:0x0419, B:282:0x042a, B:284:0x042b, B:286:0x0435, B:287:0x0679, B:289:0x067f, B:292:0x0688, B:294:0x06a3, B:296:0x06ae, B:299:0x06b7, B:301:0x06bd, B:306:0x06c9, B:311:0x06d3, B:318:0x06da, B:319:0x06dd, B:321:0x06e1, B:323:0x06ed, B:324:0x0700, B:328:0x071a, B:330:0x0722, B:332:0x0728, B:333:0x07c2, B:335:0x07c7, B:337:0x07cd, B:339:0x07d5, B:341:0x07d9, B:343:0x07e3, B:345:0x07e7, B:346:0x07ed, B:347:0x080a, B:349:0x07de, B:351:0x07f1, B:353:0x07f6, B:355:0x07fa, B:356:0x0800, B:358:0x0804, B:359:0x0731, B:361:0x0736, B:364:0x073d, B:366:0x0745, B:369:0x0754, B:372:0x079c, B:374:0x07a4, B:375:0x075b, B:376:0x0768, B:378:0x076c, B:381:0x0782, B:382:0x0748, B:383:0x0796, B:387:0x07ab, B:391:0x07b7, B:392:0x07b1, B:393:0x043d, B:395:0x0441, B:396:0x047b, B:398:0x0483, B:400:0x0556, B:402:0x055a, B:405:0x0561, B:407:0x0565, B:409:0x0569, B:410:0x0570, B:412:0x0574, B:414:0x057a, B:416:0x0584, B:418:0x05ab, B:423:0x05b3, B:425:0x05bf, B:427:0x05c5, B:429:0x05cb, B:431:0x05ce, B:439:0x05d5, B:442:0x05e7, B:446:0x05ed, B:450:0x05f0, B:452:0x05f6, B:454:0x05fa, B:456:0x060a, B:460:0x066f, B:463:0x0624, B:464:0x0628, B:466:0x062e, B:468:0x063e, B:470:0x0644, B:472:0x064c, B:474:0x0655, B:476:0x0668, B:480:0x056d, B:481:0x048a, B:483:0x048e, B:485:0x04e8, B:487:0x04ec, B:489:0x0506, B:492:0x0512, B:494:0x0548, B:495:0x054a, B:496:0x050d, B:497:0x04f3, B:498:0x0495, B:501:0x04a6, B:503:0x04d7, B:504:0x0446, B:506:0x044c, B:508:0x0452, B:510:0x0460, B:512:0x0464, B:514:0x046f, B:515:0x0810, B:518:0x0817, B:520:0x081e, B:523:0x0826, B:525:0x082b, B:528:0x0838, B:530:0x083f, B:532:0x0856, B:533:0x0862), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:496:0x050d A[Catch: IOException -> 0x0874, zzare -> 0x087a, RuntimeException -> 0x0880, TryCatch #6 {RuntimeException -> 0x0880, blocks: (B:3:0x0005, B:9:0x001a, B:11:0x0022, B:15:0x0028, B:18:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:30:0x0053, B:34:0x005b, B:40:0x006a, B:41:0x006f, B:43:0x0079, B:45:0x007d, B:47:0x0081, B:48:0x0092, B:51:0x0098, B:56:0x009c, B:66:0x00ba, B:75:0x00c8, B:78:0x00cb, B:82:0x00d5, B:87:0x00d9, B:88:0x00da, B:92:0x00e1, B:94:0x00e7, B:105:0x00ef, B:108:0x00f8, B:110:0x0117, B:111:0x011e, B:113:0x0124, B:116:0x0131, B:118:0x013b, B:120:0x013f, B:122:0x0145, B:125:0x014b, B:126:0x0152, B:127:0x0156, B:130:0x015d, B:132:0x0161, B:129:0x0166, B:138:0x0169, B:139:0x019d, B:141:0x0178, B:143:0x017e, B:145:0x0184, B:147:0x018c, B:96:0x01a9, B:100:0x01b0, B:152:0x01b6, B:154:0x01be, B:156:0x01c2, B:158:0x01c6, B:160:0x01ce, B:163:0x01d3, B:165:0x01e4, B:166:0x01f2, B:168:0x01f6, B:170:0x0206, B:172:0x020a, B:174:0x0218, B:176:0x021d, B:177:0x0266, B:179:0x026a, B:181:0x026e, B:182:0x0273, B:184:0x027d, B:186:0x0287, B:187:0x028c, B:188:0x02b4, B:190:0x02b8, B:194:0x02c3, B:198:0x02c6, B:199:0x02d6, B:202:0x02e5, B:204:0x02eb, B:206:0x02fc, B:208:0x0300, B:210:0x030e, B:212:0x0320, B:216:0x032f, B:221:0x0334, B:223:0x0348, B:222:0x034f, B:227:0x0235, B:229:0x023d, B:231:0x0245, B:232:0x024a, B:234:0x0353, B:235:0x035e, B:244:0x0369, B:245:0x036a, B:247:0x036e, B:249:0x0376, B:250:0x0380, B:252:0x037b, B:253:0x038c, B:255:0x0394, B:257:0x039d, B:259:0x03a3, B:260:0x03c1, B:263:0x03ca, B:270:0x03ec, B:271:0x03f9, B:277:0x0409, B:281:0x0419, B:282:0x042a, B:284:0x042b, B:286:0x0435, B:287:0x0679, B:289:0x067f, B:292:0x0688, B:294:0x06a3, B:296:0x06ae, B:299:0x06b7, B:301:0x06bd, B:306:0x06c9, B:311:0x06d3, B:318:0x06da, B:319:0x06dd, B:321:0x06e1, B:323:0x06ed, B:324:0x0700, B:328:0x071a, B:330:0x0722, B:332:0x0728, B:333:0x07c2, B:335:0x07c7, B:337:0x07cd, B:339:0x07d5, B:341:0x07d9, B:343:0x07e3, B:345:0x07e7, B:346:0x07ed, B:347:0x080a, B:349:0x07de, B:351:0x07f1, B:353:0x07f6, B:355:0x07fa, B:356:0x0800, B:358:0x0804, B:359:0x0731, B:361:0x0736, B:364:0x073d, B:366:0x0745, B:369:0x0754, B:372:0x079c, B:374:0x07a4, B:375:0x075b, B:376:0x0768, B:378:0x076c, B:381:0x0782, B:382:0x0748, B:383:0x0796, B:387:0x07ab, B:391:0x07b7, B:392:0x07b1, B:393:0x043d, B:395:0x0441, B:396:0x047b, B:398:0x0483, B:400:0x0556, B:402:0x055a, B:405:0x0561, B:407:0x0565, B:409:0x0569, B:410:0x0570, B:412:0x0574, B:414:0x057a, B:416:0x0584, B:418:0x05ab, B:423:0x05b3, B:425:0x05bf, B:427:0x05c5, B:429:0x05cb, B:431:0x05ce, B:439:0x05d5, B:442:0x05e7, B:446:0x05ed, B:450:0x05f0, B:452:0x05f6, B:454:0x05fa, B:456:0x060a, B:460:0x066f, B:463:0x0624, B:464:0x0628, B:466:0x062e, B:468:0x063e, B:470:0x0644, B:472:0x064c, B:474:0x0655, B:476:0x0668, B:480:0x056d, B:481:0x048a, B:483:0x048e, B:485:0x04e8, B:487:0x04ec, B:489:0x0506, B:492:0x0512, B:494:0x0548, B:495:0x054a, B:496:0x050d, B:497:0x04f3, B:498:0x0495, B:501:0x04a6, B:503:0x04d7, B:504:0x0446, B:506:0x044c, B:508:0x0452, B:510:0x0460, B:512:0x0464, B:514:0x046f, B:515:0x0810, B:518:0x0817, B:520:0x081e, B:523:0x0826, B:525:0x082b, B:528:0x0838, B:530:0x083f, B:532:0x0856, B:533:0x0862), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:497:0x04f3 A[Catch: IOException -> 0x0874, zzare -> 0x087a, RuntimeException -> 0x0880, TryCatch #6 {RuntimeException -> 0x0880, blocks: (B:3:0x0005, B:9:0x001a, B:11:0x0022, B:15:0x0028, B:18:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:30:0x0053, B:34:0x005b, B:40:0x006a, B:41:0x006f, B:43:0x0079, B:45:0x007d, B:47:0x0081, B:48:0x0092, B:51:0x0098, B:56:0x009c, B:66:0x00ba, B:75:0x00c8, B:78:0x00cb, B:82:0x00d5, B:87:0x00d9, B:88:0x00da, B:92:0x00e1, B:94:0x00e7, B:105:0x00ef, B:108:0x00f8, B:110:0x0117, B:111:0x011e, B:113:0x0124, B:116:0x0131, B:118:0x013b, B:120:0x013f, B:122:0x0145, B:125:0x014b, B:126:0x0152, B:127:0x0156, B:130:0x015d, B:132:0x0161, B:129:0x0166, B:138:0x0169, B:139:0x019d, B:141:0x0178, B:143:0x017e, B:145:0x0184, B:147:0x018c, B:96:0x01a9, B:100:0x01b0, B:152:0x01b6, B:154:0x01be, B:156:0x01c2, B:158:0x01c6, B:160:0x01ce, B:163:0x01d3, B:165:0x01e4, B:166:0x01f2, B:168:0x01f6, B:170:0x0206, B:172:0x020a, B:174:0x0218, B:176:0x021d, B:177:0x0266, B:179:0x026a, B:181:0x026e, B:182:0x0273, B:184:0x027d, B:186:0x0287, B:187:0x028c, B:188:0x02b4, B:190:0x02b8, B:194:0x02c3, B:198:0x02c6, B:199:0x02d6, B:202:0x02e5, B:204:0x02eb, B:206:0x02fc, B:208:0x0300, B:210:0x030e, B:212:0x0320, B:216:0x032f, B:221:0x0334, B:223:0x0348, B:222:0x034f, B:227:0x0235, B:229:0x023d, B:231:0x0245, B:232:0x024a, B:234:0x0353, B:235:0x035e, B:244:0x0369, B:245:0x036a, B:247:0x036e, B:249:0x0376, B:250:0x0380, B:252:0x037b, B:253:0x038c, B:255:0x0394, B:257:0x039d, B:259:0x03a3, B:260:0x03c1, B:263:0x03ca, B:270:0x03ec, B:271:0x03f9, B:277:0x0409, B:281:0x0419, B:282:0x042a, B:284:0x042b, B:286:0x0435, B:287:0x0679, B:289:0x067f, B:292:0x0688, B:294:0x06a3, B:296:0x06ae, B:299:0x06b7, B:301:0x06bd, B:306:0x06c9, B:311:0x06d3, B:318:0x06da, B:319:0x06dd, B:321:0x06e1, B:323:0x06ed, B:324:0x0700, B:328:0x071a, B:330:0x0722, B:332:0x0728, B:333:0x07c2, B:335:0x07c7, B:337:0x07cd, B:339:0x07d5, B:341:0x07d9, B:343:0x07e3, B:345:0x07e7, B:346:0x07ed, B:347:0x080a, B:349:0x07de, B:351:0x07f1, B:353:0x07f6, B:355:0x07fa, B:356:0x0800, B:358:0x0804, B:359:0x0731, B:361:0x0736, B:364:0x073d, B:366:0x0745, B:369:0x0754, B:372:0x079c, B:374:0x07a4, B:375:0x075b, B:376:0x0768, B:378:0x076c, B:381:0x0782, B:382:0x0748, B:383:0x0796, B:387:0x07ab, B:391:0x07b7, B:392:0x07b1, B:393:0x043d, B:395:0x0441, B:396:0x047b, B:398:0x0483, B:400:0x0556, B:402:0x055a, B:405:0x0561, B:407:0x0565, B:409:0x0569, B:410:0x0570, B:412:0x0574, B:414:0x057a, B:416:0x0584, B:418:0x05ab, B:423:0x05b3, B:425:0x05bf, B:427:0x05c5, B:429:0x05cb, B:431:0x05ce, B:439:0x05d5, B:442:0x05e7, B:446:0x05ed, B:450:0x05f0, B:452:0x05f6, B:454:0x05fa, B:456:0x060a, B:460:0x066f, B:463:0x0624, B:464:0x0628, B:466:0x062e, B:468:0x063e, B:470:0x0644, B:472:0x064c, B:474:0x0655, B:476:0x0668, B:480:0x056d, B:481:0x048a, B:483:0x048e, B:485:0x04e8, B:487:0x04ec, B:489:0x0506, B:492:0x0512, B:494:0x0548, B:495:0x054a, B:496:0x050d, B:497:0x04f3, B:498:0x0495, B:501:0x04a6, B:503:0x04d7, B:504:0x0446, B:506:0x044c, B:508:0x0452, B:510:0x0460, B:512:0x0464, B:514:0x046f, B:515:0x0810, B:518:0x0817, B:520:0x081e, B:523:0x0826, B:525:0x082b, B:528:0x0838, B:530:0x083f, B:532:0x0856, B:533:0x0862), top: B:2:0x0005 }] */
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
        zzare zzareVar;
        zzarm zzarmVar;
        int zzf;
        long j;
        zzarm zzarmVar2;
        zzarm zzarmVar3;
        int i3;
        zzaye zzayeVar;
        long j2;
        zzarm zzarmVar4;
        boolean zzk;
        boolean z3;
        Message obtainMessage;
        int i4;
        zzarm zzarmVar5;
        zzarm zzarmVar6;
        int i5;
        int i6 = 1;
        try {
            try {
                long j3 = 0;
                try {
                    switch (message.what) {
                        case 0:
                            zzaxa zzaxaVar = (zzaxa) message.obj;
                            int i7 = message.arg1;
                            this.zzg.sendEmptyMessage(0);
                            zzE(true);
                            this.zzL.zza();
                            if (i7 != 0) {
                                this.zzk = new zzarn(0, -9223372036854775807L);
                            }
                            this.zzo = zzaxaVar;
                            zzaxaVar.zzb(this.zzh, true, this);
                            zzJ(2);
                            this.zze.sendEmptyMessage(2);
                            return true;
                        case 1:
                            boolean z4 = message.arg1 != 0;
                            this.zzs = false;
                            this.zzr = z4;
                            if (z4) {
                                int i8 = this.zzu;
                                if (i8 == 3) {
                                    zzK();
                                    this.zze.sendEmptyMessage(2);
                                } else if (i8 == 2) {
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
                                zzarm zzarmVar7 = this.zzC;
                                if (zzarmVar7 == null) {
                                    zzf = this.zzk.zza;
                                } else {
                                    int i9 = zzarmVar7.zzg;
                                    if (!zzarmVar7.zzi && zzarmVar7.zzd() && this.zzF.zzd(i9, this.zzj, false).zzc != -9223372036854775807L && ((zzarmVar = this.zzE) == null || this.zzC.zzc - zzarmVar.zzc != 100)) {
                                        zzf = this.zzF.zzf(i9, this.zzj, this.zzi, this.zzv);
                                    }
                                    j = elapsedRealtime;
                                    zzarmVar2 = this.zzC;
                                    if (zzarmVar2 != null && !zzarmVar2.zzd()) {
                                        if (this.zzC != null && !this.zzt) {
                                            zzB();
                                        }
                                        if (this.zzE != null) {
                                            while (true) {
                                                zzarm zzarmVar8 = this.zzE;
                                                zzarmVar3 = this.zzD;
                                                if (zzarmVar8 != zzarmVar3 && this.zzB >= zzarmVar8.zzl.zzf) {
                                                    zzarmVar8.zzc();
                                                    zzI(this.zzE.zzl);
                                                    zzarm zzarmVar9 = this.zzE;
                                                    this.zzk = new zzarn(zzarmVar9.zzg, zzarmVar9.zzh);
                                                    zzN();
                                                    this.zzg.obtainMessage(5, this.zzk).sendToTarget();
                                                }
                                            }
                                            if (zzarmVar3.zzi) {
                                                for (int i10 = 0; i10 < 2; i10++) {
                                                    zzarx zzarxVar = this.zza[i10];
                                                    zzaxk zzaxkVar = this.zzD.zzd[i10];
                                                    if (zzaxkVar != null && zzarxVar.zzh() == zzaxkVar && zzarxVar.zzA()) {
                                                        zzarxVar.zzv();
                                                    }
                                                }
                                            } else {
                                                while (true) {
                                                    if (i3 < 2) {
                                                        zzarx zzarxVar2 = this.zza[i3];
                                                        zzaxk zzaxkVar2 = this.zzD.zzd[i3];
                                                        i3 = (zzarxVar2.zzh() == zzaxkVar2 && (zzaxkVar2 == null || zzarxVar2.zzA())) ? i3 + 1 : 0;
                                                    } else {
                                                        zzarm zzarmVar10 = this.zzD;
                                                        zzarm zzarmVar11 = zzarmVar10.zzl;
                                                        if (zzarmVar11 != null && zzarmVar11.zzj) {
                                                            zzaye zzayeVar2 = zzarmVar10.zzm;
                                                            this.zzD = zzarmVar11;
                                                            zzaye zzayeVar3 = zzarmVar11.zzm;
                                                            long zzh = zzarmVar11.zza.zzh();
                                                            int i11 = 0;
                                                            int i12 = 2;
                                                            while (i11 < i12) {
                                                                zzarx zzarxVar3 = this.zza[i11];
                                                                if (zzayeVar2.zzb.zza(i11) != null) {
                                                                    if (zzh != -9223372036854775807L) {
                                                                        zzarxVar3.zzv();
                                                                    } else if (!zzarxVar3.zzB()) {
                                                                        zzaxt zza = zzayeVar3.zzb.zza(i11);
                                                                        zzarz zzarzVar = zzayeVar2.zzd[i11];
                                                                        zzarz zzarzVar2 = zzayeVar3.zzd[i11];
                                                                        if (zza == null || !zzarzVar2.equals(zzarzVar)) {
                                                                            zzayeVar = zzayeVar3;
                                                                            j2 = zzh;
                                                                            zzarxVar3.zzv();
                                                                        } else {
                                                                            zza.zzb();
                                                                            zzars[] zzarsVarArr = new zzars[i6];
                                                                            for (int i13 = 0; i13 <= 0; i13++) {
                                                                                zzarsVarArr[i13] = zza.zzc(i13);
                                                                            }
                                                                            zzarm zzarmVar12 = this.zzD;
                                                                            zzayeVar = zzayeVar3;
                                                                            j2 = zzh;
                                                                            zzarxVar3.zzt(zzarsVarArr, zzarmVar12.zzd[i11], zzarmVar12.zzf - zzarmVar12.zzh);
                                                                        }
                                                                        i11++;
                                                                        zzayeVar3 = zzayeVar;
                                                                        zzh = j2;
                                                                        i12 = 2;
                                                                        i6 = 1;
                                                                    }
                                                                }
                                                                zzayeVar = zzayeVar3;
                                                                j2 = zzh;
                                                                i11++;
                                                                zzayeVar3 = zzayeVar;
                                                                zzh = j2;
                                                                i12 = 2;
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
                                    zzarmVar2 = this.zzC;
                                    if (zzarmVar2 != null) {
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
                                            zzarm zzarmVar13 = this.zzC;
                                            j = elapsedRealtime;
                                            Pair zzx = zzx(this.zzF, 0, -9223372036854775807L, Math.max(0L, ((zzarmVar13.zzf - zzarmVar13.zzh) + this.zzF.zzd(zzarmVar13.zzg, this.zzj, false).zzc) - this.zzB));
                                            if (zzx != null) {
                                                int intValue = ((Integer) zzx.first).intValue();
                                                j3 = ((Long) zzx.second).longValue();
                                                zzf = intValue;
                                                zzarm zzarmVar14 = this.zzC;
                                                long j4 = zzarmVar14 != null ? 60000000 + j3 : (zzarmVar14.zzf - zzarmVar14.zzh) + this.zzF.zzd(zzarmVar14.zzg, this.zzj, false).zzc;
                                                zzarm zzarmVar15 = this.zzC;
                                                int i14 = zzarmVar15 != null ? 0 : zzarmVar15.zzc + 1;
                                                boolean zzO = zzO(zzf);
                                                this.zzF.zzd(zzf, this.zzj, true);
                                                zzarm zzarmVar16 = new zzarm(this.zza, this.zzb, j4, this.zzc, this.zzL, this.zzo, this.zzj.zzb, i14, zzf, zzO, j3, null);
                                                zzarmVar4 = this.zzC;
                                                if (zzarmVar4 != null) {
                                                    zzarmVar4.zzl = zzarmVar16;
                                                }
                                                this.zzC = zzarmVar16;
                                                zzarmVar16.zza.zzw(this, j3);
                                                zzH(true);
                                            }
                                            zzarmVar2 = this.zzC;
                                            if (zzarmVar2 != null) {
                                            }
                                            zzH(false);
                                            if (this.zzE != null) {
                                            }
                                        }
                                    }
                                    j = elapsedRealtime;
                                    zzarm zzarmVar142 = this.zzC;
                                    long j42 = zzarmVar142 != null ? 60000000 + j3 : (zzarmVar142.zzf - zzarmVar142.zzh) + this.zzF.zzd(zzarmVar142.zzg, this.zzj, false).zzc;
                                    zzarm zzarmVar152 = this.zzC;
                                    if (zzarmVar152 != null) {
                                    }
                                    boolean zzO2 = zzO(zzf);
                                    this.zzF.zzd(zzf, this.zzj, true);
                                    zzarm zzarmVar162 = new zzarm(this.zza, this.zzb, j42, this.zzc, this.zzL, this.zzo, this.zzj.zzb, i14, zzf, zzO2, j3, null);
                                    zzarmVar4 = this.zzC;
                                    if (zzarmVar4 != null) {
                                    }
                                    this.zzC = zzarmVar162;
                                    zzarmVar162.zza.zzw(this, j3);
                                    zzH(true);
                                    zzarmVar2 = this.zzC;
                                    if (zzarmVar2 != null) {
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
                                zzazl.zza("doSomeWork");
                                zzN();
                                this.zzE.zza.zzq(this.zzk.zzc);
                                boolean z5 = true;
                                boolean z6 = true;
                                for (zzarx zzarxVar4 : this.zzp) {
                                    zzarxVar4.zzD(this.zzB, this.zzy);
                                    z6 = z6 && zzarxVar4.zzE();
                                    if (!zzarxVar4.zzF() && !zzarxVar4.zzE()) {
                                        z3 = false;
                                        if (!z3) {
                                            zzarxVar4.zzm();
                                        }
                                        z5 = !z5 && z3;
                                    }
                                    z3 = true;
                                    if (!z3) {
                                    }
                                    if (z5) {
                                    }
                                }
                                if (!z5) {
                                    zzC();
                                }
                                zzazc zzazcVar = this.zzn;
                                if (zzazcVar != null) {
                                    zzarw zzJ = zzazcVar.zzJ();
                                    if (!zzJ.equals(this.zzl)) {
                                        this.zzl = zzJ;
                                        this.zzd.zzd(this.zzn);
                                        this.zzg.obtainMessage(7, zzJ).sendToTarget();
                                    }
                                }
                                long j5 = this.zzF.zzd(this.zzE.zzg, this.zzj, false).zzc;
                                if (!z6 || ((j5 != -9223372036854775807L && j5 > this.zzk.zzc) || !this.zzE.zzi)) {
                                    int i15 = this.zzu;
                                    if (i15 == 2) {
                                        if (this.zzp.length <= 0) {
                                            break;
                                        } else if (z5) {
                                            boolean z7 = this.zzs;
                                            zzarm zzarmVar17 = this.zzC;
                                            long zzg = !zzarmVar17.zzj ? zzarmVar17.zzh : zzarmVar17.zza.zzg();
                                            if (zzg == Long.MIN_VALUE) {
                                                zzarm zzarmVar18 = this.zzC;
                                                if (zzarmVar18.zzi) {
                                                    zzJ(3);
                                                    if (this.zzr) {
                                                        zzK();
                                                    }
                                                } else {
                                                    zzg = this.zzF.zzd(zzarmVar18.zzg, this.zzj, false).zzc;
                                                }
                                            }
                                            if (this.zzG) {
                                                zzcio zzcioVar = this.zzL;
                                                long j6 = this.zzk.zzd;
                                                zzarm zzarmVar19 = this.zzC;
                                                zzk = zzcioVar.zzk(j6 - (this.zzB - (zzarmVar19.zzf - zzarmVar19.zzh)), z7);
                                            } else {
                                                zzcio zzcioVar2 = this.zzL;
                                                zzarm zzarmVar20 = this.zzC;
                                                zzk = zzcioVar2.zzk(zzg - (this.zzB - (zzarmVar20.zzf - zzarmVar20.zzh)), z7);
                                            }
                                            if (zzk) {
                                                zzJ(3);
                                                if (this.zzr) {
                                                }
                                            }
                                        }
                                    } else if (i15 == 3) {
                                        if (this.zzp.length <= 0) {
                                            z5 = zzP(j5);
                                        }
                                        if (!z5) {
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
                                    for (zzarx zzarxVar5 : this.zzp) {
                                        zzarxVar5.zzm();
                                    }
                                }
                                if ((this.zzr && this.zzu == 3) || this.zzu == 2) {
                                    zzG(j, this.zzJ > 0 ? this.zzJ : 10L);
                                } else if (this.zzp.length != 0) {
                                    zzG(j, this.zzK > 0 ? this.zzK : 1000L);
                                } else {
                                    this.zze.removeMessages(2);
                                }
                                zzazl.zzb();
                            }
                            return true;
                        case 3:
                            zzaro zzaroVar = (zzaro) message.obj;
                            if (this.zzF == null) {
                                this.zzz++;
                                this.zzA = zzaroVar;
                            } else {
                                Pair zzy = zzy(zzaroVar);
                                if (zzy == null) {
                                    zzarn zzarnVar = new zzarn(0, 0L);
                                    this.zzk = zzarnVar;
                                    this.zzg.obtainMessage(4, 1, 0, zzarnVar).sendToTarget();
                                    this.zzk = new zzarn(0, -9223372036854775807L);
                                    zzJ(4);
                                    zzE(false);
                                } else {
                                    int i16 = zzaroVar.zzc == -9223372036854775807L ? 1 : 0;
                                    int intValue2 = ((Integer) zzy.first).intValue();
                                    long longValue = ((Long) zzy.second).longValue();
                                    try {
                                        zzarn zzarnVar2 = this.zzk;
                                        if (intValue2 == zzarnVar2.zza && longValue / 1000 == zzarnVar2.zzc / 1000) {
                                            zzarn zzarnVar3 = new zzarn(intValue2, longValue);
                                            this.zzk = zzarnVar3;
                                            obtainMessage = this.zzg.obtainMessage(4, i16, 0, zzarnVar3);
                                        } else {
                                            long zzu = zzu(intValue2, longValue);
                                            int i17 = i16 | (longValue != zzu ? 1 : 0);
                                            zzarn zzarnVar4 = new zzarn(intValue2, zzu);
                                            this.zzk = zzarnVar4;
                                            obtainMessage = this.zzg.obtainMessage(4, i17, 0, zzarnVar4);
                                        }
                                        obtainMessage.sendToTarget();
                                    } catch (Throwable th) {
                                        zzarn zzarnVar5 = new zzarn(intValue2, longValue);
                                        this.zzk = zzarnVar5;
                                        this.zzg.obtainMessage(4, i16, 0, zzarnVar5).sendToTarget();
                                        throw th;
                                    }
                                }
                            }
                            return true;
                        case 4:
                            zzarw zzarwVar = (zzarw) message.obj;
                            zzazc zzazcVar2 = this.zzn;
                            if (zzazcVar2 != null) {
                                zzarwVar = zzazcVar2.zzK(zzarwVar);
                            } else {
                                this.zzd.zzK(zzarwVar);
                            }
                            this.zzl = zzarwVar;
                            this.zzg.obtainMessage(7, zzarwVar).sendToTarget();
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
                            zzasd zzasdVar = this.zzF;
                            this.zzF = (zzasd) pair.first;
                            Object obj = pair.second;
                            if (zzasdVar == null) {
                                if (this.zzz > 0) {
                                    Pair zzy2 = zzy(this.zzA);
                                    i4 = this.zzz;
                                    this.zzz = 0;
                                    this.zzA = null;
                                    if (zzy2 == null) {
                                        zzA(obj, i4);
                                    } else {
                                        this.zzk = new zzarn(((Integer) zzy2.first).intValue(), ((Long) zzy2.second).longValue());
                                        zzarmVar5 = this.zzE;
                                        if (zzarmVar5 == null) {
                                            zzarmVar5 = this.zzC;
                                        }
                                        if (zzarmVar5 != null) {
                                            zzD(obj, i4);
                                        } else {
                                            int zza2 = this.zzF.zza(zzarmVar5.zzb);
                                            if (zza2 != -1) {
                                                boolean zzO3 = zzO(0);
                                                zzarmVar5.zzg = 0;
                                                zzarmVar5.zzi = zzO3;
                                                boolean z8 = zzarmVar5 == this.zzD;
                                                zzarn zzarnVar6 = this.zzk;
                                                if (zzarnVar6.zza != 0) {
                                                    zzarn zzarnVar7 = new zzarn(0, zzarnVar6.zzb);
                                                    zzarnVar7.zzc = zzarnVar6.zzc;
                                                    zzarnVar7.zzd = zzarnVar6.zzd;
                                                    this.zzk = zzarnVar7;
                                                }
                                                while (true) {
                                                    zzarm zzarmVar21 = zzarmVar5.zzl;
                                                    if (zzarmVar21 != null) {
                                                        zza2 = this.zzF.zzf(zza2, this.zzj, this.zzi, this.zzv);
                                                        if (zza2 != -1 && zzarmVar21.zzb.equals(this.zzF.zzd(zza2, this.zzj, true).zzb)) {
                                                            boolean zzO4 = zzO(zza2);
                                                            zzarmVar21.zzg = zza2;
                                                            zzarmVar21.zzi = zzO4;
                                                            z8 |= zzarmVar21 == this.zzD;
                                                            zzarmVar5 = zzarmVar21;
                                                        }
                                                    }
                                                }
                                                zzD(obj, i4);
                                            } else if (zzt(zzarmVar5.zzg, zzasdVar, this.zzF) == -1) {
                                                zzA(obj, i4);
                                            } else {
                                                this.zzF.zzd(0, this.zzj, false);
                                                Pair zzv = zzv(0, -9223372036854775807L);
                                                int intValue3 = ((Integer) zzv.first).intValue();
                                                long longValue2 = ((Long) zzv.second).longValue();
                                                this.zzF.zzd(intValue3, this.zzj, true);
                                                Object obj2 = this.zzj.zzb;
                                                zzarmVar5.zzg = -1;
                                                while (true) {
                                                    zzarmVar5 = zzarmVar5.zzl;
                                                    if (zzarmVar5 != null) {
                                                        zzarmVar5.zzg = true != zzarmVar5.zzb.equals(obj2) ? -1 : intValue3;
                                                    } else {
                                                        this.zzk = new zzarn(intValue3, zzu(intValue3, longValue2));
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
                                        this.zzk = new zzarn(((Integer) zzv2.first).intValue(), ((Long) zzv2.second).longValue());
                                    }
                                }
                                return true;
                            }
                            i4 = 0;
                            zzarmVar5 = this.zzE;
                            if (zzarmVar5 == null) {
                            }
                            if (zzarmVar5 != null) {
                            }
                            return true;
                        case 8:
                            zzawy zzawyVar = (zzawy) message.obj;
                            zzarm zzarmVar22 = this.zzC;
                            if (zzarmVar22 != null && zzarmVar22.zza == zzawyVar) {
                                zzarmVar22.zzj = true;
                                zzarmVar22.zze();
                                zzarmVar22.zzh = zzarmVar22.zza(zzarmVar22.zzh, false);
                                if (this.zzE == null) {
                                    zzarm zzarmVar23 = this.zzC;
                                    this.zzD = zzarmVar23;
                                    zzF(zzarmVar23.zzh);
                                    zzI(this.zzD);
                                }
                                zzB();
                            }
                            return true;
                        case 9:
                            zzawy zzawyVar2 = (zzawy) message.obj;
                            zzarm zzarmVar24 = this.zzC;
                            if (zzarmVar24 != null && zzarmVar24.zza == zzawyVar2) {
                                zzB();
                            }
                            return true;
                        case 10:
                            zzarm zzarmVar25 = this.zzE;
                            if (zzarmVar25 != null) {
                                boolean z9 = true;
                                while (true) {
                                    if (zzarmVar25 != null && zzarmVar25.zzj) {
                                        if (zzarmVar25.zze()) {
                                            if (z9) {
                                                zzarm zzarmVar26 = this.zzD;
                                                zzarm zzarmVar27 = this.zzE;
                                                boolean z10 = zzarmVar26 != zzarmVar27;
                                                zzR(zzarmVar27.zzl);
                                                zzarm zzarmVar28 = this.zzE;
                                                zzarmVar28.zzl = null;
                                                this.zzC = zzarmVar28;
                                                this.zzD = zzarmVar28;
                                                boolean[] zArr = new boolean[2];
                                                long zzb = zzarmVar28.zzb(this.zzk.zzc, z10, zArr);
                                                if (zzb != this.zzk.zzc) {
                                                    this.zzk.zzc = zzb;
                                                    zzF(zzb);
                                                }
                                                boolean[] zArr2 = new boolean[2];
                                                int i18 = 0;
                                                for (int i19 = 0; i19 < 2; i19++) {
                                                    zzarx zzarxVar6 = this.zza[i19];
                                                    boolean z11 = zzarxVar6.zzb() != 0;
                                                    zArr2[i19] = z11;
                                                    zzaxk zzaxkVar3 = this.zzE.zzd[i19];
                                                    if (zzaxkVar3 != null) {
                                                        i18++;
                                                    }
                                                    if (z11) {
                                                        if (zzaxkVar3 != zzarxVar6.zzh()) {
                                                            if (zzarxVar6 == this.zzm) {
                                                                if (zzaxkVar3 == null) {
                                                                    this.zzd.zzd(this.zzn);
                                                                }
                                                                this.zzn = null;
                                                                this.zzm = null;
                                                            }
                                                            zzQ(zzarxVar6);
                                                            zzarxVar6.zzj();
                                                        } else if (zArr[i19]) {
                                                            zzarxVar6.zzu(this.zzB);
                                                        }
                                                    }
                                                }
                                                this.zzg.obtainMessage(3, zzarmVar25.zzm).sendToTarget();
                                                zzz(zArr2, i18);
                                            } else {
                                                this.zzC = zzarmVar25;
                                                for (zzarm zzarmVar29 = zzarmVar25.zzl; zzarmVar29 != null; zzarmVar29 = zzarmVar29.zzl) {
                                                    zzarmVar29.zzc();
                                                }
                                                zzarm zzarmVar30 = this.zzC;
                                                zzarmVar30.zzl = null;
                                                if (zzarmVar30.zzj) {
                                                    long j7 = zzarmVar30.zzh;
                                                    this.zzC.zza(Math.max(j7, this.zzB - (zzarmVar30.zzf - j7)), false);
                                                }
                                            }
                                            zzB();
                                            zzN();
                                            this.zze.sendEmptyMessage(2);
                                        } else {
                                            z9 &= zzarmVar25 != this.zzD;
                                            zzarmVar25 = zzarmVar25.zzl;
                                        }
                                    }
                                }
                            }
                            return true;
                        case 11:
                            try {
                                for (zzarh zzarhVar : (zzarh[]) message.obj) {
                                    zzarhVar.zza.zzl(zzarhVar.zzb, zzarhVar.zzc);
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
                            int i20 = message.arg1;
                            this.zzv = i20;
                            zzarm zzarmVar31 = this.zzE;
                            if (zzarmVar31 == null) {
                                zzarmVar31 = this.zzC;
                            }
                            if (zzarmVar31 != null) {
                                boolean z12 = zzarmVar31 == this.zzD;
                                boolean z13 = zzarmVar31 == this.zzC;
                                int zzf2 = this.zzF.zzf(zzarmVar31.zzg, this.zzj, this.zzi, i20);
                                while (true) {
                                    zzarm zzarmVar32 = zzarmVar31.zzl;
                                    if (zzarmVar32 != null && zzf2 != -1 && (i5 = zzarmVar32.zzg) == zzf2) {
                                        z12 |= zzarmVar32 == this.zzD;
                                        z13 |= zzarmVar32 == this.zzC;
                                        zzf2 = this.zzF.zzf(i5, this.zzj, this.zzi, i20);
                                        zzarmVar31 = zzarmVar32;
                                    }
                                }
                                zzarmVar31.zzi = zzO(zzarmVar31.zzg);
                                if (!z13) {
                                    this.zzC = zzarmVar31;
                                }
                                if (!z12 && (zzarmVar6 = this.zzE) != null) {
                                    int i21 = zzarmVar6.zzg;
                                    this.zzk = new zzarn(i21, zzu(i21, this.zzk.zzc));
                                }
                                if (this.zzu == 4 && i20 != 0) {
                                    zzJ(2);
                                }
                            }
                            return true;
                        default:
                            return false;
                    }
                } catch (zzare e) {
                    zzareVar = e;
                    z2 = true;
                    i2 = 8;
                    Log.e("ExoPlayerImplInternal", "Renderer error.", zzareVar);
                    this.zzg.obtainMessage(i2, zzareVar).sendToTarget();
                    zzL();
                    return z2;
                } catch (IOException e2) {
                    iOException = e2;
                    z = true;
                    i = 8;
                    Log.e("ExoPlayerImplInternal", "Source error.", iOException);
                    this.zzg.obtainMessage(i, zzare.zzb(iOException)).sendToTarget();
                    zzL();
                    return z;
                }
            } catch (RuntimeException e3) {
                Log.e("ExoPlayerImplInternal", "Internal runtime error.", e3);
                this.zzg.obtainMessage(8, zzare.zzc(e3)).sendToTarget();
                zzL();
                return true;
            }
        } catch (zzare e4) {
            z2 = true;
            i2 = 8;
            zzareVar = e4;
        } catch (IOException e5) {
            z = true;
            i = 8;
            iOException = e5;
        }
    }

    public final synchronized void zza(zzarh... zzarhVarArr) {
        if (this.zzq) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            return;
        }
        int i = this.zzw;
        this.zzw = i + 1;
        this.zze.obtainMessage(11, zzarhVarArr).sendToTarget();
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

    @Override // com.google.android.gms.internal.ads.zzaxl
    public final /* bridge */ /* synthetic */ void zze(zzaxm zzaxmVar) {
        this.zze.obtainMessage(9, (zzawy) zzaxmVar).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzawx
    public final void zzf(zzawy zzawyVar) {
        this.zze.obtainMessage(8, zzawyVar).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final void zzg(zzasd zzasdVar, Object obj) {
        this.zze.obtainMessage(7, Pair.create(zzasdVar, null)).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzayc
    public final void zzh() {
        this.zze.sendEmptyMessage(10);
    }

    public final void zzi(zzaxa zzaxaVar, boolean z) {
        this.zze.obtainMessage(0, 1, 0, zzaxaVar).sendToTarget();
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

    public final void zzk(zzasd zzasdVar, int i, long j) {
        this.zze.obtainMessage(3, new zzaro(zzasdVar, 0, j)).sendToTarget();
    }

    public final void zzl(zzarh... zzarhVarArr) {
        if (this.zzq) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        } else {
            this.zzw++;
            this.zze.obtainMessage(11, zzarhVarArr).sendToTarget();
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

    public final synchronized boolean zzq(zzarh... zzarhVarArr) {
        int i;
        if (this.zzq) {
            return true;
        }
        int i2 = this.zzw;
        this.zzw = i2 + 1;
        this.zze.obtainMessage(11, zzarhVarArr).sendToTarget();
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
