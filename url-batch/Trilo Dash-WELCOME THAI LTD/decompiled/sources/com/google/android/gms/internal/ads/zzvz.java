package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzvz implements zzvv, zzft {
    public static final zzfrh zza = zzfrh.zzs(5400000L, 3300000L, 2000000L, 1300000L, 760000L);
    public static final zzfrh zzb = zzfrh.zzs(1700000L, 820000L, 450000L, 180000L, 130000L);
    public static final zzfrh zzc = zzfrh.zzs(2300000L, 1300000L, 1000000L, 820000L, 570000L);
    public static final zzfrh zzd = zzfrh.zzs(3400000L, 2000000L, 1400000L, 1000000L, 620000L);
    public static final zzfrh zze = zzfrh.zzs(7500000L, 5200000L, 3700000L, 1800000L, 1100000L);
    public static final zzfrh zzf = zzfrh.zzs(3300000L, 1900000L, 1700000L, 1500000L, 1200000L);
    private static zzvz zzg;
    private final zzfrk zzh;
    private final zzvt zzi;
    private final zzwp zzj;
    private final zzcx zzk;
    private final boolean zzl;
    private int zzm;
    private long zzn;
    private long zzo;
    private int zzp;
    private long zzq;
    private long zzr;
    private long zzs;
    private long zzt;

    @Deprecated
    public zzvz() {
        zzfrk.zzd();
        zzcx zzcxVar = zzcx.zza;
        throw null;
    }

    private final long zzi(int i) {
        Long l = (Long) this.zzh.get(Integer.valueOf(i));
        if (l == null) {
            l = (Long) this.zzh.get(0);
        }
        if (l == null) {
            l = 1000000L;
        }
        return l.longValue();
    }

    private final void zzj(int i, long j, long j2) {
        int i2;
        long j3;
        if (i == 0) {
            if (j != 0) {
                j3 = j;
            } else if (j2 == this.zzt) {
                return;
            } else {
                j3 = 0;
            }
            i2 = 0;
        } else {
            i2 = i;
            j3 = j;
        }
        this.zzt = j2;
        this.zzi.zzb(i2, j3, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzk(int i) {
        int i2 = this.zzp;
        if (i2 == 0 || this.zzl) {
            if (i2 == i) {
                return;
            }
            this.zzp = i;
            if (i != 1 && i != 0 && i != 8) {
                this.zzs = zzi(i);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                zzj(this.zzm > 0 ? (int) (elapsedRealtime - this.zzn) : 0, this.zzo, this.zzs);
                this.zzn = elapsedRealtime;
                this.zzo = 0L;
                this.zzr = 0L;
                this.zzq = 0L;
                this.zzj.zzc();
            }
        }
    }

    private static boolean zzl(zzew zzewVar, boolean z) {
        return z && !zzewVar.zzb(8);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0149, code lost:
    
        if (r3.equals("YE") != false) goto L857;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0b74, code lost:
    
        return new int[]{4, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x016f, code lost:
    
        if (r3.equals("WF") != false) goto L651;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x08a8, code lost:
    
        return new int[]{4, 2, 2, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01a3, code lost:
    
        if (r3.equals("VG") != false) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0391, code lost:
    
        return new int[]{2, 2, 1, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01ad, code lost:
    
        if (r3.equals("VE") != false) goto L857;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01b7, code lost:
    
        if (r3.equals("VC") != false) goto L849;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01cf, code lost:
    
        if (r3.equals("UY") != false) goto L510;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x06c3, code lost:
    
        return new int[]{2, 2, 1, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01d9, code lost:
    
        if (r3.equals("US") != false) goto L793;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0a94, code lost:
    
        return new int[]{1, 1, 2, 2, 3, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x01e3, code lost:
    
        if (r3.equals("UG") != false) goto L578;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x07ae, code lost:
    
        return new int[]{3, 3, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x01fb, code lost:
    
        if (r3.equals("TZ") != false) goto L625;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x084f, code lost:
    
        return new int[]{3, 4, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0213, code lost:
    
        if (r3.equals("TV") != false) goto L718;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0247, code lost:
    
        if (r3.equals("TN") != false) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x025f, code lost:
    
        if (r3.equals("TL") != false) goto L817;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0ae8, code lost:
    
        return new int[]{4, 3, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0293, code lost:
    
        if (r3.equals("TD") != false) goto L857;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x029d, code lost:
    
        if (r3.equals("TC") != false) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x02c5, code lost:
    
        return new int[]{2, 2, 1, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x02b4, code lost:
    
        if (r3.equals("SY") != false) goto L817;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x02be, code lost:
    
        if (r3.equals("SX") != false) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x02da, code lost:
    
        if (r3.equals("ST") != false) goto L698;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x094a, code lost:
    
        return new int[]{3, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x02e4, code lost:
    
        if (r3.equals("SS") != false) goto L718;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x02ee, code lost:
    
        if (r3.equals("SR") != false) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x02fc, code lost:
    
        if (r3.equals("SO") != false) goto L614;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0829, code lost:
    
        return new int[]{3, 2, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0306, code lost:
    
        if (r3.equals("SN") != false) goto L857;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0310, code lost:
    
        if (r3.equals("SM") != false) goto L884;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0bd1, code lost:
    
        return new int[]{0, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0328, code lost:
    
        if (r3.equals("SK") != false) goto L570;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0332, code lost:
    
        if (r3.equals("SJ") != false) goto L884;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x033c, code lost:
    
        if (r3.equals("SI") != false) goto L825;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0b04, code lost:
    
        return new int[]{0, 0, 0, 0, 1, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0346, code lost:
    
        if (r3.equals("SH") != false) goto L718;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x035e, code lost:
    
        if (r3.equals("SE") != false) goto L570;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0368, code lost:
    
        if (r3.equals("SD") != false) goto L857;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0380, code lost:
    
        if (r3.equals("SB") != false) goto L535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0718, code lost:
    
        return new int[]{4, 2, 4, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x038a, code lost:
    
        if (r3.equals("SA") != false) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x03b4, code lost:
    
        if (r3.equals("RS") != false) goto L636;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0875, code lost:
    
        return new int[]{1, 0, 0, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004d, code lost:
    
        if (r3.equals("CH") != false) goto L570;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0792, code lost:
    
        return new int[]{0, 0, 0, 0, 0, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x042e, code lost:
    
        if (r3.equals("PM") != false) goto L884;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x0438, code lost:
    
        if (r3.equals("PL") != false) goto L793;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x0442, code lost:
    
        if (r3.equals("PK") != false) goto L614;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x045a, code lost:
    
        if (r3.equals(com.google.android.gms.ads.RequestConfiguration.MAX_AD_CONTENT_RATING_PG) != false) goto L774;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0a52, code lost:
    
        return new int[]{4, 4, 3, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0057, code lost:
    
        if (r3.equals("CG") != false) goto L399;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x04aa, code lost:
    
        if (r3.equals("NU") != false) goto L718;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0545, code lost:
    
        return new int[]{2, 4, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x0508, code lost:
    
        if (r3.equals("NE") != false) goto L857;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x0512, code lost:
    
        if (r3.equals("NC") != false) goto L841;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x0b3c, code lost:
    
        return new int[]{3, 2, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x052a, code lost:
    
        if (r3.equals("MZ") != false) goto L698;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x0534, code lost:
    
        if (r3.equals("MY") != false) goto L837;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x0b2e, code lost:
    
        return new int[]{2, 1, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x053e, code lost:
    
        if (r3.equals("MX") != false) goto L399;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x0576, code lost:
    
        if (r3.equals("MT") != false) goto L726;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x09ac, code lost:
    
        return new int[]{0, 0, 0, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x0580, code lost:
    
        if (r3.equals("MS") != false) goto L849;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0598, code lost:
    
        if (r3.equals("MQ") != false) goto L668;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x08e2, code lost:
    
        return new int[]{2, 1, 2, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x05a2, code lost:
    
        if (r3.equals("MP") != false) goto L884;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x05e4, code lost:
    
        if (r3.equals("MK") != false) goto L636;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x0618, code lost:
    
        if (r3.equals("ME") != false) goto L555;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x075e, code lost:
    
        return new int[]{1, 0, 0, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x0622, code lost:
    
        if (r3.equals("MD") != false) goto L636;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x063a, code lost:
    
        if (r3.equals(com.google.android.gms.ads.RequestConfiguration.MAX_AD_CONTENT_RATING_MA) != false) goto L698;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x0644, code lost:
    
        if (r3.equals("LY") != false) goto L535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x064e, code lost:
    
        if (r3.equals("LV") != false) goto L726;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x0666, code lost:
    
        if (r3.equals("LT") != false) goto L726;
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x069a, code lost:
    
        if (r3.equals("LI") != false) goto L884;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x06a4, code lost:
    
        if (r3.equals("LC") != false) goto L865;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x06bc, code lost:
    
        if (r3.equals("LA") != false) goto L510;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x06d8, code lost:
    
        if (r3.equals("KY") != false) goto L896;
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x0bfb, code lost:
    
        return new int[]{1, 2, 0, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x06fe, code lost:
    
        if (r3.equals("KP") != false) goto L698;
     */
    /* JADX WARN: Code restructure failed: missing block: B:519:0x0708, code lost:
    
        if (r3.equals("KM") != false) goto L535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008b, code lost:
    
        if (r3.equals("BR") != false) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x0711, code lost:
    
        if (r3.equals("KI") != false) goto L535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x0757, code lost:
    
        if (r3.equals("JO") != false) goto L555;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x02f5, code lost:
    
        return new int[]{2, 3, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x0765, code lost:
    
        if (r3.equals("JM") != false) goto L737;
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x09d2, code lost:
    
        return new int[]{3, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:553:0x078b, code lost:
    
        if (r3.equals("IS") != false) goto L570;
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x07a7, code lost:
    
        if (r3.equals("IQ") != false) goto L578;
     */
    /* JADX WARN: Code restructure failed: missing block: B:561:0x07b5, code lost:
    
        if (r3.equals("IO") != false) goto L718;
     */
    /* JADX WARN: Code restructure failed: missing block: B:575:0x07e9, code lost:
    
        if (r3.equals("IE") != false) goto L714;
     */
    /* JADX WARN: Code restructure failed: missing block: B:577:0x0982, code lost:
    
        return new int[]{0, 1, 1, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:587:0x080f, code lost:
    
        if (r3.equals("HT") != false) goto L857;
     */
    /* JADX WARN: Code restructure failed: missing block: B:589:0x0819, code lost:
    
        if (r3.equals("HR") != false) goto L636;
     */
    /* JADX WARN: Code restructure failed: missing block: B:591:0x0822, code lost:
    
        if (r3.equals("HN") != false) goto L614;
     */
    /* JADX WARN: Code restructure failed: missing block: B:597:0x083e, code lost:
    
        if (r3.equals("GY") != false) goto L809;
     */
    /* JADX WARN: Code restructure failed: missing block: B:599:0x0acc, code lost:
    
        return new int[]{3, 4, 1, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:601:0x0848, code lost:
    
        if (r3.equals("GW") != false) goto L625;
     */
    /* JADX WARN: Code restructure failed: missing block: B:603:0x0856, code lost:
    
        if (r3.equals("GU") != false) goto L888;
     */
    /* JADX WARN: Code restructure failed: missing block: B:605:0x0bdf, code lost:
    
        return new int[]{1, 2, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:611:0x086e, code lost:
    
        if (r3.equals("GR") != false) goto L636;
     */
    /* JADX WARN: Code restructure failed: missing block: B:617:0x088a, code lost:
    
        if (r3.equals("GP") != false) goto L668;
     */
    /* JADX WARN: Code restructure failed: missing block: B:623:0x08a1, code lost:
    
        if (r3.equals("GM") != false) goto L651;
     */
    /* JADX WARN: Code restructure failed: missing block: B:625:0x08af, code lost:
    
        if (r3.equals("GL") != false) goto L865;
     */
    /* JADX WARN: Code restructure failed: missing block: B:627:0x08b9, code lost:
    
        if (r3.equals("GI") != false) goto L884;
     */
    /* JADX WARN: Code restructure failed: missing block: B:633:0x08d1, code lost:
    
        if (r3.equals("GG") != false) goto L877;
     */
    /* JADX WARN: Code restructure failed: missing block: B:635:0x0bba, code lost:
    
        return new int[]{0, 2, 0, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:637:0x08db, code lost:
    
        if (r3.equals("GF") != false) goto L668;
     */
    /* JADX WARN: Code restructure failed: missing block: B:643:0x08f7, code lost:
    
        if (r3.equals("GD") != false) goto L849;
     */
    /* JADX WARN: Code restructure failed: missing block: B:657:0x092b, code lost:
    
        if (r3.equals("FO") != false) goto L877;
     */
    /* JADX WARN: Code restructure failed: missing block: B:663:0x0943, code lost:
    
        if (r3.equals("FK") != false) goto L698;
     */
    /* JADX WARN: Code restructure failed: missing block: B:677:0x097b, code lost:
    
        if (r3.equals("ES") != false) goto L714;
     */
    /* JADX WARN: Code restructure failed: missing block: B:679:0x0989, code lost:
    
        if (r3.equals("ER") != false) goto L718;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00bf, code lost:
    
        if (r3.equals("BM") != false) goto L865;
     */
    /* JADX WARN: Code restructure failed: missing block: B:685:0x09a5, code lost:
    
        if (r3.equals("EE") != false) goto L726;
     */
    /* JADX WARN: Code restructure failed: missing block: B:691:0x09c1, code lost:
    
        if (r3.equals("DZ") != false) goto L817;
     */
    /* JADX WARN: Code restructure failed: missing block: B:693:0x09cb, code lost:
    
        if (r3.equals("DO") != false) goto L737;
     */
    /* JADX WARN: Code restructure failed: missing block: B:695:0x09d9, code lost:
    
        if (r3.equals("DM") != false) goto L849;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0b90, code lost:
    
        return new int[]{1, 2, 0, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:709:0x0a0d, code lost:
    
        if (r3.equals("CZ") != false) goto L825;
     */
    /* JADX WARN: Code restructure failed: missing block: B:715:0x0a25, code lost:
    
        if (r3.equals("CX") != false) goto L849;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00c9, code lost:
    
        if (r3.equals("BL") != false) goto L849;
     */
    /* JADX WARN: Code restructure failed: missing block: B:725:0x0a4b, code lost:
    
        if (r3.equals("CU") != false) goto L774;
     */
    /* JADX WARN: Code restructure failed: missing block: B:739:0x0a83, code lost:
    
        if (r3.equals("CM") != false) goto L845;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0b58, code lost:
    
        return new int[]{1, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:741:0x0b4a, code lost:
    
        return new int[]{3, 4, 3, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:743:0x0a8d, code lost:
    
        if (r3.equals("CL") != false) goto L793;
     */
    /* JADX WARN: Code restructure failed: missing block: B:757:0x0ac5, code lost:
    
        if (r3.equals("BW") != false) goto L809;
     */
    /* JADX WARN: Code restructure failed: missing block: B:763:0x0ae1, code lost:
    
        if (r3.equals("BI") != false) goto L817;
     */
    /* JADX WARN: Code restructure failed: missing block: B:769:0x0afd, code lost:
    
        if (r3.equals("BG") != false) goto L825;
     */
    /* JADX WARN: Code restructure failed: missing block: B:779:0x0b27, code lost:
    
        if (r3.equals("BD") != false) goto L837;
     */
    /* JADX WARN: Code restructure failed: missing block: B:781:0x0b35, code lost:
    
        if (r3.equals("AZ") != false) goto L841;
     */
    /* JADX WARN: Code restructure failed: missing block: B:783:0x0b43, code lost:
    
        if (r3.equals("AO") != false) goto L845;
     */
    /* JADX WARN: Code restructure failed: missing block: B:785:0x0b51, code lost:
    
        if (r3.equals("AI") != false) goto L849;
     */
    /* JADX WARN: Code restructure failed: missing block: B:791:0x0b6d, code lost:
    
        if (r3.equals("AF") != false) goto L857;
     */
    /* JADX WARN: Code restructure failed: missing block: B:797:0x0b89, code lost:
    
        if (r3.equals("AD") != false) goto L865;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00e1, code lost:
    
        if (r3.equals("AT") != false) goto L570;
     */
    /* JADX WARN: Code restructure failed: missing block: B:807:0x0bb3, code lost:
    
        if (r3.equals("BB") != false) goto L877;
     */
    /* JADX WARN: Code restructure failed: missing block: B:809:0x0bc1, code lost:
    
        if (r3.equals("BA") != false) goto L896;
     */
    /* JADX WARN: Code restructure failed: missing block: B:811:0x0bca, code lost:
    
        if (r3.equals("AX") != false) goto L884;
     */
    /* JADX WARN: Code restructure failed: missing block: B:813:0x0bd8, code lost:
    
        if (r3.equals("AW") != false) goto L888;
     */
    /* JADX WARN: Code restructure failed: missing block: B:819:0x0bf4, code lost:
    
        if (r3.equals("AL") != false) goto L896;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0107, code lost:
    
        if (r3.equals("AQ") != false) goto L718;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0990, code lost:
    
        return new int[]{4, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int[] zzm(String str) {
        int hashCode = str.hashCode();
        if (hashCode != 2091) {
            if (hashCode != 2092) {
                if (hashCode != 2102) {
                    if (hashCode != 2103) {
                        if (hashCode != 2111) {
                            if (hashCode != 2112) {
                                if (hashCode != 2135) {
                                    if (hashCode != 2136) {
                                        switch (hashCode) {
                                            case 2083:
                                                break;
                                            case 2084:
                                                if (str.equals("AE")) {
                                                    return new int[]{1, 4, 4, 4, 3, 2};
                                                }
                                                break;
                                            case 2085:
                                                break;
                                            case 2086:
                                                if (str.equals("AG")) {
                                                    return new int[]{2, 3, 1, 2, 2, 2};
                                                }
                                                break;
                                            default:
                                                switch (hashCode) {
                                                    case 2088:
                                                        break;
                                                    case 2094:
                                                        break;
                                                    case 2105:
                                                        break;
                                                    case 2114:
                                                        break;
                                                    case 2115:
                                                        if (str.equals("BE")) {
                                                            return new int[]{0, 0, 3, 3, 2, 2};
                                                        }
                                                        break;
                                                    case 2116:
                                                        if (str.equals("BF")) {
                                                            return new int[]{4, 3, 4, 3, 2, 2};
                                                        }
                                                        break;
                                                    case 2117:
                                                        break;
                                                    case 2118:
                                                        if (str.equals("BH")) {
                                                            return new int[]{1, 2, 2, 4, 4, 2};
                                                        }
                                                        break;
                                                    case 2119:
                                                        break;
                                                    case 2120:
                                                        if (str.equals("BJ")) {
                                                            return new int[]{4, 4, 3, 4, 2, 2};
                                                        }
                                                        break;
                                                    case 2133:
                                                        break;
                                                    case 2142:
                                                        if (str.equals("CA")) {
                                                            return new int[]{0, 2, 1, 2, 4, 1};
                                                        }
                                                        break;
                                                    case 2145:
                                                        if (str.equals("CD")) {
                                                            return new int[]{4, 2, 3, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2152:
                                                        if (str.equals("CK")) {
                                                            return new int[]{2, 2, 2, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2153:
                                                        break;
                                                    case 2154:
                                                        break;
                                                    case 2155:
                                                        if (str.equals("CN")) {
                                                            return new int[]{2, 0, 2, 2, 3, 1};
                                                        }
                                                        break;
                                                    case 2156:
                                                        if (str.equals("CO")) {
                                                            return new int[]{2, 2, 4, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2159:
                                                        if (str.equals("CR")) {
                                                            return new int[]{2, 2, 4, 4, 2, 2};
                                                        }
                                                        break;
                                                    case 2162:
                                                        break;
                                                    case 2163:
                                                        if (str.equals("CV")) {
                                                            return new int[]{2, 3, 1, 0, 2, 2};
                                                        }
                                                        break;
                                                    case 2164:
                                                        if (str.equals("CW")) {
                                                            return new int[]{2, 2, 0, 0, 2, 2};
                                                        }
                                                        break;
                                                    case 2165:
                                                        break;
                                                    case 2166:
                                                        if (str.equals("CY")) {
                                                            return new int[]{1, 0, 0, 0, 1, 2};
                                                        }
                                                        break;
                                                    case 2167:
                                                        break;
                                                    case 2177:
                                                        if (str.equals("DE")) {
                                                            return new int[]{0, 0, 2, 2, 1, 2};
                                                        }
                                                        break;
                                                    case 2182:
                                                        if (str.equals("DJ")) {
                                                            return new int[]{4, 1, 4, 4, 2, 2};
                                                        }
                                                        break;
                                                    case 2183:
                                                        if (str.equals("DK")) {
                                                            return new int[]{0, 0, 1, 0, 0, 2};
                                                        }
                                                        break;
                                                    case 2185:
                                                        break;
                                                    case 2187:
                                                        break;
                                                    case 2198:
                                                        break;
                                                    case 2206:
                                                        if (str.equals("EC")) {
                                                            return new int[]{2, 4, 2, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2208:
                                                        break;
                                                    case 2210:
                                                        if (str.equals("EG")) {
                                                            return new int[]{3, 4, 2, 3, 2, 2};
                                                        }
                                                        break;
                                                    case 2221:
                                                        break;
                                                    case 2222:
                                                        break;
                                                    case 2223:
                                                        if (str.equals("ET")) {
                                                            return new int[]{4, 4, 3, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2243:
                                                        if (str.equals("FI")) {
                                                            return new int[]{0, 0, 0, 1, 0, 2};
                                                        }
                                                        break;
                                                    case 2244:
                                                        if (str.equals("FJ")) {
                                                            return new int[]{3, 1, 3, 3, 2, 2};
                                                        }
                                                        break;
                                                    case 2245:
                                                        break;
                                                    case 2247:
                                                        if (str.equals("FM")) {
                                                            return new int[]{3, 2, 4, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2249:
                                                        break;
                                                    case 2252:
                                                        if (str.equals("FR")) {
                                                            return new int[]{1, 1, 2, 1, 1, 1};
                                                        }
                                                        break;
                                                    case 2266:
                                                        if (str.equals("GA")) {
                                                            return new int[]{2, 3, 1, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2267:
                                                        if (str.equals("GB")) {
                                                            return new int[]{0, 0, 1, 1, 2, 3};
                                                        }
                                                        break;
                                                    case 2269:
                                                        break;
                                                    case 2270:
                                                        if (str.equals("GE")) {
                                                            return new int[]{1, 1, 1, 3, 2, 2};
                                                        }
                                                        break;
                                                    case 2271:
                                                        break;
                                                    case 2272:
                                                        break;
                                                    case 2273:
                                                        if (str.equals("GH")) {
                                                            return new int[]{3, 2, 3, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2274:
                                                        break;
                                                    case 2277:
                                                        break;
                                                    case 2278:
                                                        break;
                                                    case 2279:
                                                        if (str.equals("GN")) {
                                                            return new int[]{4, 3, 4, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2281:
                                                        break;
                                                    case 2282:
                                                        if (str.equals("GQ")) {
                                                            return new int[]{4, 2, 3, 4, 2, 2};
                                                        }
                                                        break;
                                                    case 2283:
                                                        break;
                                                    case 2285:
                                                        if (str.equals("GT")) {
                                                            return new int[]{2, 3, 2, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2286:
                                                        break;
                                                    case 2288:
                                                        break;
                                                    case 2290:
                                                        break;
                                                    case 2307:
                                                        if (str.equals("HK")) {
                                                            return new int[]{0, 1, 2, 3, 2, 0};
                                                        }
                                                        break;
                                                    case 2310:
                                                        break;
                                                    case 2314:
                                                        break;
                                                    case 2316:
                                                        break;
                                                    case 2317:
                                                        if (str.equals("HU")) {
                                                            return new int[]{0, 0, 0, 1, 3, 2};
                                                        }
                                                        break;
                                                    case 2331:
                                                        if (str.equals("ID")) {
                                                            return new int[]{3, 2, 3, 3, 3, 2};
                                                        }
                                                        break;
                                                    case 2332:
                                                        break;
                                                    case 2339:
                                                        if (str.equals("IL")) {
                                                            return new int[]{1, 1, 2, 3, 4, 2};
                                                        }
                                                        break;
                                                    case 2340:
                                                        if (str.equals("IM")) {
                                                            return new int[]{0, 2, 0, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2341:
                                                        if (str.equals("IN")) {
                                                            return new int[]{1, 1, 3, 2, 4, 3};
                                                        }
                                                        break;
                                                    case 2342:
                                                        break;
                                                    case 2344:
                                                        break;
                                                    case 2345:
                                                        if (str.equals("IR")) {
                                                            return new int[]{3, 0, 1, 1, 3, 0};
                                                        }
                                                        break;
                                                    case 2346:
                                                        break;
                                                    case 2347:
                                                        if (str.equals("IT")) {
                                                            return new int[]{0, 1, 0, 1, 1, 2};
                                                        }
                                                        break;
                                                    case 2363:
                                                        if (str.equals("JE")) {
                                                            return new int[]{3, 2, 1, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2371:
                                                        break;
                                                    case 2373:
                                                        break;
                                                    case 2374:
                                                        if (str.equals("JP")) {
                                                            return new int[]{0, 1, 0, 1, 1, 1};
                                                        }
                                                        break;
                                                    case 2394:
                                                        if (str.equals("KE")) {
                                                            return new int[]{3, 3, 2, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2396:
                                                        if (str.equals("KG")) {
                                                            return new int[]{2, 1, 1, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2397:
                                                        if (str.equals("KH")) {
                                                            return new int[]{1, 1, 4, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2398:
                                                        break;
                                                    case 2402:
                                                        break;
                                                    case 2405:
                                                        break;
                                                    case 2407:
                                                        if (str.equals("KR")) {
                                                            return new int[]{0, 0, 1, 3, 4, 4};
                                                        }
                                                        break;
                                                    case 2412:
                                                        if (str.equals("KW")) {
                                                            return new int[]{1, 1, 0, 0, 0, 2};
                                                        }
                                                        break;
                                                    case 2414:
                                                        break;
                                                    case 2415:
                                                        if (str.equals("KZ")) {
                                                            return new int[]{1, 1, 2, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2421:
                                                        break;
                                                    case 2422:
                                                        if (str.equals("LB")) {
                                                            return new int[]{3, 2, 1, 4, 2, 2};
                                                        }
                                                        break;
                                                    case 2423:
                                                        break;
                                                    case 2429:
                                                        break;
                                                    case 2431:
                                                        if (str.equals("LK")) {
                                                            return new int[]{3, 1, 3, 4, 4, 2};
                                                        }
                                                        break;
                                                    case 2438:
                                                        if (str.equals("LR")) {
                                                            return new int[]{3, 4, 4, 3, 2, 2};
                                                        }
                                                        break;
                                                    case 2439:
                                                        if (str.equals("LS")) {
                                                            return new int[]{3, 3, 4, 3, 2, 2};
                                                        }
                                                        break;
                                                    case 2440:
                                                        break;
                                                    case 2441:
                                                        if (str.equals("LU")) {
                                                            return new int[]{1, 0, 2, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2442:
                                                        break;
                                                    case 2445:
                                                        break;
                                                    case 2452:
                                                        break;
                                                    case 2454:
                                                        if (str.equals("MC")) {
                                                            return new int[]{0, 2, 2, 0, 2, 2};
                                                        }
                                                        break;
                                                    case 2455:
                                                        break;
                                                    case 2456:
                                                        break;
                                                    case 2457:
                                                        if (str.equals("MF")) {
                                                            return new int[]{1, 2, 1, 0, 2, 2};
                                                        }
                                                        break;
                                                    case 2458:
                                                        if (str.equals("MG")) {
                                                            return new int[]{3, 4, 2, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2459:
                                                        if (str.equals("MH")) {
                                                            return new int[]{3, 2, 2, 4, 2, 2};
                                                        }
                                                        break;
                                                    case 2462:
                                                        break;
                                                    case 2463:
                                                        if (str.equals("ML")) {
                                                            return new int[]{4, 3, 3, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2464:
                                                        if (str.equals("MM")) {
                                                            return new int[]{2, 4, 3, 3, 2, 2};
                                                        }
                                                        break;
                                                    case 2465:
                                                        if (str.equals("MN")) {
                                                            return new int[]{2, 0, 1, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2466:
                                                        if (str.equals("MO")) {
                                                            return new int[]{0, 2, 4, 4, 2, 2};
                                                        }
                                                        break;
                                                    case 2467:
                                                        break;
                                                    case 2468:
                                                        break;
                                                    case 2469:
                                                        if (str.equals("MR")) {
                                                            return new int[]{4, 1, 3, 4, 2, 2};
                                                        }
                                                        break;
                                                    case 2470:
                                                        break;
                                                    case 2471:
                                                        break;
                                                    case 2472:
                                                        if (str.equals("MU")) {
                                                            return new int[]{3, 1, 1, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2473:
                                                        if (str.equals("MV")) {
                                                            return new int[]{3, 4, 1, 4, 2, 2};
                                                        }
                                                        break;
                                                    case 2474:
                                                        if (str.equals("MW")) {
                                                            return new int[]{4, 2, 1, 0, 2, 2};
                                                        }
                                                        break;
                                                    case 2475:
                                                        break;
                                                    case 2476:
                                                        break;
                                                    case 2477:
                                                        break;
                                                    case 2483:
                                                        if (str.equals("NA")) {
                                                            return new int[]{4, 3, 2, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2485:
                                                        break;
                                                    case 2487:
                                                        break;
                                                    case 2489:
                                                        if (str.equals("NG")) {
                                                            return new int[]{3, 4, 1, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2491:
                                                        if (str.equals("NI")) {
                                                            return new int[]{2, 3, 4, 3, 2, 2};
                                                        }
                                                        break;
                                                    case 2494:
                                                        if (str.equals("NL")) {
                                                            return new int[]{0, 0, 3, 2, 0, 4};
                                                        }
                                                        break;
                                                    case 2497:
                                                        if (str.equals("NO")) {
                                                            return new int[]{0, 0, 2, 0, 0, 2};
                                                        }
                                                        break;
                                                    case 2498:
                                                        if (str.equals("NP")) {
                                                            return new int[]{2, 1, 4, 3, 2, 2};
                                                        }
                                                        break;
                                                    case 2500:
                                                        if (str.equals("NR")) {
                                                            return new int[]{3, 2, 2, 0, 2, 2};
                                                        }
                                                        break;
                                                    case 2503:
                                                        break;
                                                    case 2508:
                                                        if (str.equals("NZ")) {
                                                            return new int[]{1, 0, 1, 2, 4, 2};
                                                        }
                                                        break;
                                                    case 2526:
                                                        if (str.equals("OM")) {
                                                            return new int[]{2, 3, 1, 3, 4, 2};
                                                        }
                                                        break;
                                                    case 2545:
                                                        if (str.equals("PA")) {
                                                            return new int[]{1, 3, 3, 3, 2, 2};
                                                        }
                                                        break;
                                                    case 2549:
                                                        if (str.equals("PE")) {
                                                            return new int[]{2, 3, 4, 4, 4, 2};
                                                        }
                                                        break;
                                                    case 2550:
                                                        if (str.equals("PF")) {
                                                            return new int[]{2, 3, 3, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2551:
                                                        break;
                                                    case 2552:
                                                        if (str.equals("PH")) {
                                                            return new int[]{2, 2, 3, 3, 3, 2};
                                                        }
                                                        break;
                                                    case 2555:
                                                        break;
                                                    case 2556:
                                                        break;
                                                    case 2557:
                                                        break;
                                                    case 2562:
                                                        if (str.equals("PR")) {
                                                            return new int[]{2, 3, 2, 2, 3, 3};
                                                        }
                                                        break;
                                                    case 2563:
                                                        if (str.equals("PS")) {
                                                            return new int[]{3, 4, 1, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2564:
                                                        if (str.equals("PT")) {
                                                            return new int[]{0, 1, 0, 0, 2, 2};
                                                        }
                                                        break;
                                                    case 2567:
                                                        if (str.equals("PW")) {
                                                            return new int[]{2, 2, 4, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2569:
                                                        if (str.equals("PY")) {
                                                            return new int[]{2, 2, 3, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2576:
                                                        if (str.equals("QA")) {
                                                            return new int[]{2, 4, 2, 4, 4, 2};
                                                        }
                                                        break;
                                                    case 2611:
                                                        if (str.equals("RE")) {
                                                            return new int[]{1, 1, 1, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2621:
                                                        if (str.equals("RO")) {
                                                            return new int[]{0, 0, 1, 1, 1, 2};
                                                        }
                                                        break;
                                                    case 2625:
                                                        break;
                                                    case 2627:
                                                        if (str.equals("RU")) {
                                                            return new int[]{0, 0, 0, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2629:
                                                        if (str.equals("RW")) {
                                                            return new int[]{3, 4, 3, 0, 2, 2};
                                                        }
                                                        break;
                                                    case 2638:
                                                        break;
                                                    case 2639:
                                                        break;
                                                    case 2640:
                                                        if (str.equals("SC")) {
                                                            return new int[]{4, 3, 0, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2641:
                                                        break;
                                                    case 2642:
                                                        break;
                                                    case 2644:
                                                        if (str.equals("SG")) {
                                                            return new int[]{1, 1, 2, 3, 1, 4};
                                                        }
                                                        break;
                                                    case 2645:
                                                        break;
                                                    case 2646:
                                                        break;
                                                    case 2647:
                                                        break;
                                                    case 2648:
                                                        break;
                                                    case 2649:
                                                        if (str.equals("SL")) {
                                                            return new int[]{4, 3, 4, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2650:
                                                        break;
                                                    case 2651:
                                                        break;
                                                    case 2652:
                                                        break;
                                                    case 2655:
                                                        break;
                                                    case 2656:
                                                        break;
                                                    case 2657:
                                                        break;
                                                    case 2659:
                                                        if (str.equals("SV")) {
                                                            return new int[]{2, 2, 3, 3, 2, 2};
                                                        }
                                                        break;
                                                    case 2661:
                                                        break;
                                                    case 2662:
                                                        break;
                                                    case 2663:
                                                        if (str.equals("SZ")) {
                                                            return new int[]{4, 3, 2, 4, 2, 2};
                                                        }
                                                        break;
                                                    case 2671:
                                                        break;
                                                    case 2672:
                                                        break;
                                                    case 2675:
                                                        if (str.equals("TG")) {
                                                            return new int[]{3, 3, 2, 0, 2, 2};
                                                        }
                                                        break;
                                                    case 2676:
                                                        if (str.equals("TH")) {
                                                            return new int[]{0, 3, 2, 3, 3, 0};
                                                        }
                                                        break;
                                                    case 2678:
                                                        if (str.equals("TJ")) {
                                                            return new int[]{4, 2, 4, 4, 2, 2};
                                                        }
                                                        break;
                                                    case 2680:
                                                        break;
                                                    case 2681:
                                                        if (str.equals("TM")) {
                                                            return new int[]{4, 2, 4, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2682:
                                                        break;
                                                    case 2683:
                                                        if (str.equals("TO")) {
                                                            return new int[]{4, 2, 3, 3, 2, 2};
                                                        }
                                                        break;
                                                    case 2686:
                                                        if (str.equals("TR")) {
                                                            return new int[]{1, 1, 0, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2688:
                                                        if (str.equals("TT")) {
                                                            return new int[]{1, 4, 1, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2690:
                                                        break;
                                                    case 2691:
                                                        if (str.equals("TW")) {
                                                            return new int[]{0, 0, 0, 0, 0, 0};
                                                        }
                                                        break;
                                                    case 2694:
                                                        break;
                                                    case 2700:
                                                        if (str.equals("UA")) {
                                                            return new int[]{0, 3, 1, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2706:
                                                        break;
                                                    case 2718:
                                                        break;
                                                    case 2724:
                                                        break;
                                                    case 2725:
                                                        if (str.equals("UZ")) {
                                                            return new int[]{2, 2, 3, 4, 2, 2};
                                                        }
                                                        break;
                                                    case 2733:
                                                        break;
                                                    case 2735:
                                                        break;
                                                    case 2737:
                                                        break;
                                                    case 2739:
                                                        if (str.equals("VI")) {
                                                            return new int[]{1, 2, 1, 3, 2, 2};
                                                        }
                                                        break;
                                                    case 2744:
                                                        if (str.equals("VN")) {
                                                            return new int[]{0, 3, 3, 4, 2, 2};
                                                        }
                                                        break;
                                                    case 2751:
                                                        if (str.equals("VU")) {
                                                            return new int[]{4, 2, 2, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2767:
                                                        break;
                                                    case 2780:
                                                        if (str.equals("WS")) {
                                                            return new int[]{3, 1, 2, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2803:
                                                        if (str.equals("XK")) {
                                                            return new int[]{1, 1, 1, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2828:
                                                        break;
                                                    case 2843:
                                                        if (str.equals("YT")) {
                                                            return new int[]{4, 1, 1, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2855:
                                                        if (str.equals("ZA")) {
                                                            return new int[]{3, 3, 1, 1, 1, 2};
                                                        }
                                                        break;
                                                    case 2867:
                                                        if (str.equals("ZM")) {
                                                            return new int[]{3, 3, 4, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2877:
                                                        if (str.equals("ZW")) {
                                                            return new int[]{3, 2, 4, 3, 2, 2};
                                                        }
                                                        break;
                                                    default:
                                                        switch (hashCode) {
                                                            case 2096:
                                                                break;
                                                            case 2097:
                                                                if (str.equals("AR")) {
                                                                    return new int[]{2, 4, 1, 1, 2, 2};
                                                                }
                                                                break;
                                                            case 2098:
                                                                if (str.equals("AS")) {
                                                                    return new int[]{2, 2, 2, 3, 2, 2};
                                                                }
                                                                break;
                                                            case 2099:
                                                                break;
                                                            case 2100:
                                                                if (str.equals("AU")) {
                                                                    return new int[]{0, 1, 0, 1, 2, 2};
                                                                }
                                                                break;
                                                            default:
                                                                switch (hashCode) {
                                                                    case 2122:
                                                                        break;
                                                                    case 2123:
                                                                        break;
                                                                    case 2124:
                                                                        if (str.equals("BN")) {
                                                                            return new int[]{3, 2, 1, 1, 2, 2};
                                                                        }
                                                                        break;
                                                                    case 2125:
                                                                        if (str.equals("BO")) {
                                                                            return new int[]{1, 3, 3, 2, 2, 2};
                                                                        }
                                                                        break;
                                                                    default:
                                                                        switch (hashCode) {
                                                                            case 2127:
                                                                                if (str.equals("BQ")) {
                                                                                    return new int[]{1, 2, 2, 0, 2, 2};
                                                                                }
                                                                                break;
                                                                            case 2128:
                                                                                break;
                                                                            case 2129:
                                                                                if (str.equals("BS")) {
                                                                                    return new int[]{4, 2, 2, 3, 2, 2};
                                                                                }
                                                                                break;
                                                                            case 2130:
                                                                                if (str.equals("BT")) {
                                                                                    return new int[]{3, 1, 3, 2, 2, 2};
                                                                                }
                                                                                break;
                                                                            default:
                                                                                switch (hashCode) {
                                                                                    case 2147:
                                                                                        if (str.equals("CF")) {
                                                                                            return new int[]{4, 2, 3, 2, 2, 2};
                                                                                        }
                                                                                        break;
                                                                                    case 2150:
                                                                                        if (str.equals("CI")) {
                                                                                            return new int[]{3, 3, 3, 4, 2, 2};
                                                                                        }
                                                                                        break;
                                                                                }
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                    } else if (str.equals("BZ")) {
                                        return new int[]{2, 4, 2, 2, 2, 2};
                                    }
                                } else if (str.equals("BY")) {
                                    return new int[]{0, 1, 1, 3, 2, 2};
                                }
                            }
                        }
                    }
                }
            } else if (str.equals("AM")) {
                return new int[]{2, 3, 2, 4, 2, 2};
            }
            return new int[]{2, 2, 2, 2, 2, 2};
        }
    }

    @Override // com.google.android.gms.internal.ads.zzft
    public final synchronized void zza(zzer zzerVar, zzew zzewVar, boolean z, int i) {
        if (zzl(zzewVar, z)) {
            this.zzo += i;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzft
    public final synchronized void zzb(zzer zzerVar, zzew zzewVar, boolean z) {
        if (zzl(zzewVar, z)) {
            zzcw.zzf(this.zzm > 0);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i = (int) (elapsedRealtime - this.zzn);
            this.zzq += i;
            long j = this.zzr;
            long j2 = this.zzo;
            this.zzr = j + j2;
            if (i > 0) {
                this.zzj.zzb((int) Math.sqrt(j2), (j2 * 8000.0f) / i);
                if (this.zzq >= 2000 || this.zzr >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                    this.zzs = (long) this.zzj.zza(0.5f);
                }
                zzj(i, this.zzo, this.zzs);
                this.zzn = elapsedRealtime;
                this.zzo = 0L;
            }
            this.zzm--;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzft
    public final void zzc(zzer zzerVar, zzew zzewVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzft
    public final synchronized void zzd(zzer zzerVar, zzew zzewVar, boolean z) {
        if (zzl(zzewVar, z)) {
            if (this.zzm == 0) {
                this.zzn = SystemClock.elapsedRealtime();
            }
            this.zzm++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvv
    public final void zzf(zzvu zzvuVar) {
        this.zzi.zzc(zzvuVar);
    }

    public static synchronized zzvz zzg(Context context) {
        zzvz zzvzVar;
        synchronized (zzvz.class) {
            if (zzg == null) {
                Context applicationContext = context == null ? null : context.getApplicationContext();
                int[] zzm = zzm(zzeg.zzK(context));
                HashMap hashMap = new HashMap(8);
                hashMap.put(0, 1000000L);
                zzfrh zzfrhVar = zza;
                hashMap.put(2, (Long) zzfrhVar.get(zzm[0]));
                hashMap.put(3, (Long) zzb.get(zzm[1]));
                hashMap.put(4, (Long) zzc.get(zzm[2]));
                hashMap.put(5, (Long) zzd.get(zzm[3]));
                hashMap.put(10, (Long) zze.get(zzm[4]));
                hashMap.put(9, (Long) zzf.get(zzm[5]));
                hashMap.put(7, (Long) zzfrhVar.get(zzm[0]));
                zzg = new zzvz(applicationContext, hashMap, 2000, zzcx.zza, true, null);
            }
            zzvzVar = zzg;
        }
        return zzvzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvv
    public final void zze(Handler handler, zzvu zzvuVar) {
        Objects.requireNonNull(zzvuVar);
        this.zzi.zza(handler, zzvuVar);
    }

    /* synthetic */ zzvz(Context context, Map map, int i, zzcx zzcxVar, boolean z, zzvy zzvyVar) {
        this.zzh = zzfrk.zzc(map);
        this.zzi = new zzvt();
        this.zzj = new zzwp(2000);
        this.zzk = zzcxVar;
        this.zzl = true;
        if (context != null) {
            zzdw zzb2 = zzdw.zzb(context);
            int zza2 = zzb2.zza();
            this.zzp = zza2;
            this.zzs = zzi(zza2);
            zzb2.zzd(new zzvx(this));
            return;
        }
        this.zzp = 0;
        this.zzs = zzi(0);
    }
}
