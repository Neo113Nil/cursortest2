package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.zxing.client.result.ExpandedProductParsedResult;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzwl implements zzwh, zzfz {
    public static final zzfvn zza = zzfvn.zzs(4800000L, 3100000L, 2100000L, 1500000L, 800000L);
    public static final zzfvn zzb = zzfvn.zzs(1500000L, 1000000L, 730000L, 440000L, 170000L);
    public static final zzfvn zzc = zzfvn.zzs(2200000L, 1400000L, 1100000L, 910000L, 620000L);
    public static final zzfvn zzd = zzfvn.zzs(3000000L, 1900000L, 1400000L, 1000000L, 660000L);
    public static final zzfvn zze = zzfvn.zzs(6000000L, 4100000L, 3200000L, 1800000L, 1000000L);
    public static final zzfvn zzf = zzfvn.zzs(2800000L, 2400000L, 1600000L, 1100000L, 950000L);
    private static zzwl zzg;
    private final zzfvq zzh;
    private final zzwf zzi;
    private final zzxb zzj;
    private final zzde zzk;
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
    public zzwl() {
        zzfvq.zzd();
        zzde zzdeVar = zzde.zza;
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
        if (i != 0) {
            i2 = i;
            j3 = j;
        } else if (j != 0) {
            j3 = j;
            i2 = 0;
        } else {
            if (j2 == this.zzt) {
                return;
            }
            i2 = 0;
            j3 = 0;
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

    private static boolean zzl(zzfc zzfcVar, boolean z) {
        return z && !zzfcVar.zzb(8);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0aa0, code lost:
    
        return new int[]{4, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0114, code lost:
    
        if (r3.equals("XK") != false) goto L888;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0bd4, code lost:
    
        return new int[]{1, 1, 1, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x012c, code lost:
    
        if (r3.equals("WF") != false) goto L562;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0768, code lost:
    
        return new int[]{4, 2, 2, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0136, code lost:
    
        if (r3.equals("VU") != false) goto L638;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x086d, code lost:
    
        return new int[]{3, 3, 3, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x014e, code lost:
    
        if (r3.equals("VI") != false) goto L642;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x087b, code lost:
    
        return new int[]{0, 2, 0, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0166, code lost:
    
        if (r3.equals("VE") != false) goto L800;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0170, code lost:
    
        if (r3.equals("VC") != false) goto L848;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x017a, code lost:
    
        if (r3.equals("VA") != false) goto L741;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0192, code lost:
    
        if (r3.equals("UY") != false) goto L524;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01aa, code lost:
    
        if (r3.equals("UG") != false) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02ea, code lost:
    
        return new int[]{3, 3, 4, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01b4, code lost:
    
        if (r3.equals("UA") != false) goto L570;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0784, code lost:
    
        return new int[]{0, 2, 1, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01cc, code lost:
    
        if (r3.equals("TW") != false) goto L703;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x094f, code lost:
    
        return new int[]{0, 0, 0, 0, 0, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x01d6, code lost:
    
        if (r3.equals("TV") != false) goto L562;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x01fc, code lost:
    
        if (r3.equals("TO") != false) goto L824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0af4, code lost:
    
        return new int[]{3, 2, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0206, code lost:
    
        if (r3.equals("TN") != false) goto L524;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0210, code lost:
    
        if (r3.equals("TM") != false) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0338, code lost:
    
        return new int[]{4, 2, 1, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x021a, code lost:
    
        if (r3.equals("TL") != false) goto L753;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x09fc, code lost:
    
        return new int[]{4, 3, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0232, code lost:
    
        if (r3.equals("TJ") != false) goto L753;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x024a, code lost:
    
        if (r3.equals("TG") != false) goto L660;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x08b9, code lost:
    
        return new int[]{3, 4, 1, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0254, code lost:
    
        if (r3.equals("TD") != false) goto L800;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x025e, code lost:
    
        if (r3.equals("TC") != false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0286, code lost:
    
        return new int[]{1, 2, 1, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0275, code lost:
    
        if (r3.equals("SY") != false) goto L753;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x027f, code lost:
    
        if (r3.equals("SX") != false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x028d, code lost:
    
        if (r3.equals("SV") != false) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x048d, code lost:
    
        return new int[]{2, 3, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x02c1, code lost:
    
        if (r3.equals("SO") != false) goto L824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x02d9, code lost:
    
        if (r3.equals("SM") != false) goto L876;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0baa, code lost:
    
        return new int[]{0, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x02e3, code lost:
    
        if (r3.equals("SL") != false) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x02f1, code lost:
    
        if (r3.equals("SK") != false) goto L808;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0abc, code lost:
    
        return new int[]{0, 0, 0, 0, 1, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x02fb, code lost:
    
        if (r3.equals("SI") != false) goto L613;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0817, code lost:
    
        return new int[]{1, 0, 0, 0, 1, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0305, code lost:
    
        if (r3.equals("SH") != false) goto L695;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x031d, code lost:
    
        if (r3.equals("SE") != false) goto L703;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0327, code lost:
    
        if (r3.equals("SD") != false) goto L800;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0331, code lost:
    
        if (r3.equals("SC") != false) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0377, code lost:
    
        if (r3.equals("RS") != false) goto L442;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0044, code lost:
    
        if (r3.equals("CI") != false) goto L711;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x05ca, code lost:
    
        return new int[]{1, 0, 0, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x038f, code lost:
    
        if (r3.equals("RE") != false) goto L434;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x05ae, code lost:
    
        return new int[]{1, 2, 1, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x03b5, code lost:
    
        if (r3.equals("PT") != false) goto L703;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x096b, code lost:
    
        return new int[]{3, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x03db, code lost:
    
        if (r3.equals("PM") != false) goto L876;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x03e5, code lost:
    
        if (r3.equals("PL") != false) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0442, code lost:
    
        return new int[]{1, 1, 2, 2, 4, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x03ee, code lost:
    
        if (r3.equals("PK") != false) goto L824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0406, code lost:
    
        if (r3.equals(com.google.android.gms.ads.RequestConfiguration.MAX_AD_CONTENT_RATING_PG) != false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x057e, code lost:
    
        return new int[]{4, 3, 3, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x0410, code lost:
    
        if (r3.equals("PF") != false) goto L777;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x0a50, code lost:
    
        return new int[]{2, 2, 2, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x041a, code lost:
    
        if (r3.equals("PE") != false) goto L605;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x07fb, code lost:
    
        return new int[]{1, 2, 4, 4, 4, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0424, code lost:
    
        if (r3.equals("PA") != false) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x043b, code lost:
    
        if (r3.equals("NZ") != false) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0449, code lost:
    
        if (r3.equals("NU") != false) goto L335;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0459, code lost:
    
        return new int[]{4, 2, 2, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0452, code lost:
    
        if (r3.equals("NR") != false) goto L335;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x046e, code lost:
    
        if (r3.equals("NO") != false) goto L733;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x09b6, code lost:
    
        return new int[]{0, 0, 2, 0, 1, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0486, code lost:
    
        if (r3.equals("NI") != false) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x04a2, code lost:
    
        if (r3.equals("NE") != false) goto L800;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005c, code lost:
    
        if (r3.equals("CG") != false) goto L699;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x04ba, code lost:
    
        if (r3.equals("NA") != false) goto L638;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0941, code lost:
    
        return new int[]{3, 4, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x0518, code lost:
    
        if (r3.equals("MT") != false) goto L808;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x0522, code lost:
    
        if (r3.equals("MS") != false) goto L876;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x052c, code lost:
    
        if (r3.equals("MR") != false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x053a, code lost:
    
        if (r3.equals("MQ") != false) goto L621;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x0833, code lost:
    
        return new int[]{2, 1, 2, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x0544, code lost:
    
        if (r3.equals("MP") != false) goto L408;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x0554, code lost:
    
        return new int[]{0, 2, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0066, code lost:
    
        if (r3.equals("CF") != false) goto L516;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x054d, code lost:
    
        if (r3.equals("MO") != false) goto L408;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x0577, code lost:
    
        if (r3.equals("ML") != false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x0593, code lost:
    
        if (r3.equals("MH") != false) goto L562;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x059d, code lost:
    
        if (r3.equals("MG") != false) goto L800;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x06c8, code lost:
    
        return new int[]{4, 2, 4, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x05a7, code lost:
    
        if (r3.equals("MF") != false) goto L434;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x05c3, code lost:
    
        if (r3.equals("MD") != false) goto L442;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x05ed, code lost:
    
        if (r3.equals("LY") != false) goto L824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x05f7, code lost:
    
        if (r3.equals("LV") != false) goto L703;
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x062b, code lost:
    
        if (r3.equals("LR") != false) goto L711;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x0643, code lost:
    
        if (r3.equals("LI") != false) goto L876;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x064d, code lost:
    
        if (r3.equals("LC") != false) goto L848;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x0681, code lost:
    
        if (r3.equals("KY") != false) goto L848;
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x068b, code lost:
    
        if (r3.equals("KW") != false) goto L737;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x09c4, code lost:
    
        return new int[]{1, 0, 0, 0, 0, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x06a3, code lost:
    
        if (r3.equals("KP") != false) goto L675;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x08ed, code lost:
    
        return new int[]{3, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x06ad, code lost:
    
        if (r3.equals("KN") != false) goto L848;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x06b7, code lost:
    
        if (r3.equals("KM") != false) goto L800;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x06c1, code lost:
    
        if (r3.equals("KI") != false) goto L516;
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x06dd, code lost:
    
        if (r3.equals(com.google.zxing.client.result.ExpandedProductParsedResult.KILOGRAM) != false) goto L524;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x007e, code lost:
    
        if (r3.equals("BN") != false) goto L745;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x06eb, code lost:
    
        if (r3.equals("KE") != false) goto L675;
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:0x071f, code lost:
    
        if (r3.equals("JE") != false) goto L543;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x09e0, code lost:
    
        return new int[]{2, 2, 0, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x073b, code lost:
    
        if (r3.equals("IS") != false) goto L703;
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x0761, code lost:
    
        if (r3.equals("IO") != false) goto L562;
     */
    /* JADX WARN: Code restructure failed: missing block: B:546:0x077d, code lost:
    
        if (r3.equals("IM") != false) goto L570;
     */
    /* JADX WARN: Code restructure failed: missing block: B:548:0x078b, code lost:
    
        if (r3.equals("IL") != false) goto L773;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0088, code lost:
    
        if (r3.equals("BM") != false) goto L848;
     */
    /* JADX WARN: Code restructure failed: missing block: B:550:0x0a42, code lost:
    
        return new int[]{1, 2, 2, 2, 3, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:552:0x0795, code lost:
    
        if (r3.equals("IE") != false) goto L691;
     */
    /* JADX WARN: Code restructure failed: missing block: B:554:0x0925, code lost:
    
        return new int[]{0, 1, 1, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:564:0x07bb, code lost:
    
        if (r3.equals("HT") != false) goto L800;
     */
    /* JADX WARN: Code restructure failed: missing block: B:566:0x07c5, code lost:
    
        if (r3.equals("HR") != false) goto L613;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0b48, code lost:
    
        return new int[]{1, 2, 0, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:576:0x07ea, code lost:
    
        if (r3.equals("GW") != false) goto L699;
     */
    /* JADX WARN: Code restructure failed: missing block: B:578:0x07f4, code lost:
    
        if (r3.equals("GU") != false) goto L605;
     */
    /* JADX WARN: Code restructure failed: missing block: B:584:0x0810, code lost:
    
        if (r3.equals("GR") != false) goto L613;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0092, code lost:
    
        if (r3.equals("BL") != false) goto L741;
     */
    /* JADX WARN: Code restructure failed: missing block: B:590:0x082c, code lost:
    
        if (r3.equals("GP") != false) goto L621;
     */
    /* JADX WARN: Code restructure failed: missing block: B:596:0x0848, code lost:
    
        if (r3.equals("GM") != false) goto L840;
     */
    /* JADX WARN: Code restructure failed: missing block: B:598:0x0b2c, code lost:
    
        return new int[]{4, 3, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:600:0x0852, code lost:
    
        if (r3.equals("GL") != false) goto L848;
     */
    /* JADX WARN: Code restructure failed: missing block: B:602:0x085c, code lost:
    
        if (r3.equals("GI") != false) goto L868;
     */
    /* JADX WARN: Code restructure failed: missing block: B:604:0x0b8e, code lost:
    
        return new int[]{0, 2, 0, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:606:0x0866, code lost:
    
        if (r3.equals("GH") != false) goto L638;
     */
    /* JADX WARN: Code restructure failed: missing block: B:608:0x0874, code lost:
    
        if (r3.equals("GG") != false) goto L642;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x09d2, code lost:
    
        return new int[]{1, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:610:0x0882, code lost:
    
        if (r3.equals("GF") != false) goto L824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:616:0x089a, code lost:
    
        if (r3.equals("GD") != false) goto L848;
     */
    /* JADX WARN: Code restructure failed: missing block: B:622:0x08b2, code lost:
    
        if (r3.equals("GA") != false) goto L660;
     */
    /* JADX WARN: Code restructure failed: missing block: B:628:0x08ce, code lost:
    
        if (r3.equals("FO") != false) goto L868;
     */
    /* JADX WARN: Code restructure failed: missing block: B:634:0x08e6, code lost:
    
        if (r3.equals("FK") != false) goto L675;
     */
    /* JADX WARN: Code restructure failed: missing block: B:648:0x091e, code lost:
    
        if (r3.equals("ES") != false) goto L691;
     */
    /* JADX WARN: Code restructure failed: missing block: B:650:0x092c, code lost:
    
        if (r3.equals("ER") != false) goto L695;
     */
    /* JADX WARN: Code restructure failed: missing block: B:652:0x093a, code lost:
    
        if (r3.equals("EG") != false) goto L699;
     */
    /* JADX WARN: Code restructure failed: missing block: B:654:0x0948, code lost:
    
        if (r3.equals("EE") != false) goto L703;
     */
    /* JADX WARN: Code restructure failed: missing block: B:660:0x0964, code lost:
    
        if (r3.equals("DZ") != false) goto L711;
     */
    /* JADX WARN: Code restructure failed: missing block: B:666:0x0980, code lost:
    
        if (r3.equals("DM") != false) goto L868;
     */
    /* JADX WARN: Code restructure failed: missing block: B:672:0x0998, code lost:
    
        if (r3.equals("DJ") != false) goto L753;
     */
    /* JADX WARN: Code restructure failed: missing block: B:678:0x09af, code lost:
    
        if (r3.equals("CZ") != false) goto L733;
     */
    /* JADX WARN: Code restructure failed: missing block: B:680:0x09bd, code lost:
    
        if (r3.equals("CY") != false) goto L737;
     */
    /* JADX WARN: Code restructure failed: missing block: B:682:0x09cb, code lost:
    
        if (r3.equals("CX") != false) goto L741;
     */
    /* JADX WARN: Code restructure failed: missing block: B:684:0x09d9, code lost:
    
        if (r3.equals("CW") != false) goto L745;
     */
    /* JADX WARN: Code restructure failed: missing block: B:690:0x09f5, code lost:
    
        if (r3.equals("CU") != false) goto L753;
     */
    /* JADX WARN: Code restructure failed: missing block: B:708:0x0a3b, code lost:
    
        if (r3.equals("CL") != false) goto L773;
     */
    /* JADX WARN: Code restructure failed: missing block: B:710:0x0a49, code lost:
    
        if (r3.equals("CK") != false) goto L777;
     */
    /* JADX WARN: Code restructure failed: missing block: B:724:0x0a81, code lost:
    
        if (r3.equals("BQ") != false) goto L848;
     */
    /* JADX WARN: Code restructure failed: missing block: B:730:0x0a99, code lost:
    
        if (r3.equals("BI") != false) goto L800;
     */
    /* JADX WARN: Code restructure failed: missing block: B:736:0x0ab5, code lost:
    
        if (r3.equals("BG") != false) goto L808;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c6, code lost:
    
        if (r3.equals("AR") != false) goto L524;
     */
    /* JADX WARN: Code restructure failed: missing block: B:750:0x0aed, code lost:
    
        if (r3.equals("AZ") != false) goto L824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:764:0x0b25, code lost:
    
        if (r3.equals("AF") != false) goto L840;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x06e4, code lost:
    
        return new int[]{2, 1, 1, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:770:0x0b41, code lost:
    
        if (r3.equals("AD") != false) goto L848;
     */
    /* JADX WARN: Code restructure failed: missing block: B:788:0x0b87, code lost:
    
        if (r3.equals("BB") != false) goto L868;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00d0, code lost:
    
        if (r3.equals("AQ") != false) goto L695;
     */
    /* JADX WARN: Code restructure failed: missing block: B:794:0x0ba3, code lost:
    
        if (r3.equals("AX") != false) goto L876;
     */
    /* JADX WARN: Code restructure failed: missing block: B:804:0x0bcd, code lost:
    
        if (r3.equals("AL") != false) goto L888;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0933, code lost:
    
        return new int[]{4, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00da, code lost:
    
        if (r3.equals("ZW") != false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0533, code lost:
    
        return new int[]{4, 2, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0100, code lost:
    
        if (r3.equals("YT") != false) goto L543;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0726, code lost:
    
        return new int[]{4, 2, 2, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x010a, code lost:
    
        if (r3.equals("YE") != false) goto L800;
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
                                if (hashCode != 2129) {
                                    if (hashCode != 2130) {
                                        if (hashCode != 2135) {
                                            if (hashCode != 2136) {
                                                switch (hashCode) {
                                                    case 2083:
                                                        break;
                                                    case 2084:
                                                        if (str.equals("AE")) {
                                                            return new int[]{1, 4, 4, 4, 4, 0};
                                                        }
                                                        break;
                                                    case 2085:
                                                        break;
                                                    case 2086:
                                                        if (str.equals("AG")) {
                                                            return new int[]{2, 4, 1, 2, 2, 2};
                                                        }
                                                        break;
                                                    default:
                                                        switch (hashCode) {
                                                            case 2088:
                                                                if (str.equals("AI")) {
                                                                    return new int[]{0, 2, 0, 3, 2, 2};
                                                                }
                                                                break;
                                                            case 2094:
                                                                if (str.equals("AO")) {
                                                                    return new int[]{4, 4, 3, 2, 2, 2};
                                                                }
                                                                break;
                                                            case 2105:
                                                                break;
                                                            case 2114:
                                                                if (str.equals("BD")) {
                                                                    return new int[]{2, 1, 3, 3, 2, 2};
                                                                }
                                                                break;
                                                            case 2115:
                                                                if (str.equals("BE")) {
                                                                    return new int[]{0, 1, 4, 4, 3, 2};
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
                                                                    return new int[]{1, 2, 1, 3, 4, 2};
                                                                }
                                                                break;
                                                            case 2119:
                                                                break;
                                                            case 2120:
                                                                if (str.equals("BJ")) {
                                                                    return new int[]{4, 4, 3, 3, 2, 2};
                                                                }
                                                                break;
                                                            case 2127:
                                                                break;
                                                            case 2133:
                                                                if (str.equals("BW")) {
                                                                    return new int[]{3, 2, 1, 0, 2, 2};
                                                                }
                                                                break;
                                                            case 2142:
                                                                if (str.equals("CA")) {
                                                                    return new int[]{0, 2, 2, 2, 3, 2};
                                                                }
                                                                break;
                                                            case 2145:
                                                                if (str.equals("CD")) {
                                                                    return new int[]{4, 2, 3, 2, 2, 2};
                                                                }
                                                                break;
                                                            case 2152:
                                                                break;
                                                            case 2153:
                                                                break;
                                                            case 2154:
                                                                if (str.equals("CM")) {
                                                                    return new int[]{3, 3, 3, 3, 2, 2};
                                                                }
                                                                break;
                                                            case 2155:
                                                                if (str.equals("CN")) {
                                                                    return new int[]{2, 0, 1, 1, 3, 2};
                                                                }
                                                                break;
                                                            case 2156:
                                                                if (str.equals("CO")) {
                                                                    return new int[]{2, 3, 4, 3, 2, 2};
                                                                }
                                                                break;
                                                            case 2159:
                                                                if (str.equals("CR")) {
                                                                    return new int[]{2, 3, 4, 4, 2, 2};
                                                                }
                                                                break;
                                                            case 2162:
                                                                break;
                                                            case 2163:
                                                                if (str.equals("CV")) {
                                                                    return new int[]{2, 1, 0, 0, 2, 2};
                                                                }
                                                                break;
                                                            case 2164:
                                                                break;
                                                            case 2165:
                                                                break;
                                                            case 2166:
                                                                break;
                                                            case 2167:
                                                                break;
                                                            case 2177:
                                                                if (str.equals("DE")) {
                                                                    return new int[]{0, 1, 2, 2, 2, 3};
                                                                }
                                                                break;
                                                            case 2182:
                                                                break;
                                                            case 2183:
                                                                if (str.equals("DK")) {
                                                                    return new int[]{0, 0, 3, 2, 0, 2};
                                                                }
                                                                break;
                                                            case 2185:
                                                                break;
                                                            case 2187:
                                                                if (str.equals("DO")) {
                                                                    return new int[]{3, 4, 4, 4, 4, 2};
                                                                }
                                                                break;
                                                            case 2198:
                                                                break;
                                                            case 2206:
                                                                if (str.equals("EC")) {
                                                                    return new int[]{2, 3, 2, 1, 2, 2};
                                                                }
                                                                break;
                                                            case 2208:
                                                                break;
                                                            case 2210:
                                                                break;
                                                            case 2221:
                                                                break;
                                                            case 2222:
                                                                break;
                                                            case 2223:
                                                                if (str.equals("ET")) {
                                                                    return new int[]{4, 3, 3, 1, 2, 2};
                                                                }
                                                                break;
                                                            case 2243:
                                                                if (str.equals("FI")) {
                                                                    return new int[]{0, 0, 0, 3, 0, 2};
                                                                }
                                                                break;
                                                            case 2244:
                                                                if (str.equals("FJ")) {
                                                                    return new int[]{3, 1, 2, 2, 2, 2};
                                                                }
                                                                break;
                                                            case 2245:
                                                                break;
                                                            case 2247:
                                                                if (str.equals("FM")) {
                                                                    return new int[]{4, 2, 4, 1, 2, 2};
                                                                }
                                                                break;
                                                            case 2249:
                                                                break;
                                                            case 2252:
                                                                if (str.equals("FR")) {
                                                                    return new int[]{1, 2, 3, 1, 0, 2};
                                                                }
                                                                break;
                                                            case 2266:
                                                                break;
                                                            case 2267:
                                                                if (str.equals("GB")) {
                                                                    return new int[]{0, 0, 1, 1, 1, 1};
                                                                }
                                                                break;
                                                            case 2269:
                                                                break;
                                                            case 2270:
                                                                if (str.equals("GE")) {
                                                                    return new int[]{1, 1, 1, 2, 2, 2};
                                                                }
                                                                break;
                                                            case 2271:
                                                                break;
                                                            case 2272:
                                                                break;
                                                            case 2273:
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
                                                                    return new int[]{4, 2, 1, 4, 2, 2};
                                                                }
                                                                break;
                                                            case 2283:
                                                                break;
                                                            case 2285:
                                                                if (str.equals("GT")) {
                                                                    return new int[]{2, 3, 2, 2, 2, 2};
                                                                }
                                                                break;
                                                            case 2286:
                                                                break;
                                                            case 2288:
                                                                break;
                                                            case 2290:
                                                                if (str.equals("GY")) {
                                                                    return new int[]{3, 2, 2, 1, 2, 2};
                                                                }
                                                                break;
                                                            case 2307:
                                                                if (str.equals("HK")) {
                                                                    return new int[]{0, 1, 2, 3, 2, 0};
                                                                }
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
                                                                    return new int[]{3, 1, 2, 2, 3, 2};
                                                                }
                                                                break;
                                                            case 2332:
                                                                break;
                                                            case 2339:
                                                                break;
                                                            case 2340:
                                                                break;
                                                            case 2341:
                                                                if (str.equals("IN")) {
                                                                    return new int[]{1, 1, 3, 2, 3, 3};
                                                                }
                                                                break;
                                                            case 2342:
                                                                break;
                                                            case 2344:
                                                                if (str.equals("IQ")) {
                                                                    return new int[]{3, 2, 2, 3, 2, 2};
                                                                }
                                                                break;
                                                            case 2345:
                                                                if (str.equals("IR")) {
                                                                    return new int[]{3, 0, 1, 1, 4, 1};
                                                                }
                                                                break;
                                                            case 2346:
                                                                break;
                                                            case 2347:
                                                                if (str.equals("IT")) {
                                                                    return new int[]{0, 0, 0, 1, 1, 2};
                                                                }
                                                                break;
                                                            case 2363:
                                                                break;
                                                            case 2371:
                                                                if (str.equals("JM")) {
                                                                    return new int[]{2, 4, 3, 2, 2, 2};
                                                                }
                                                                break;
                                                            case 2373:
                                                                if (str.equals("JO")) {
                                                                    return new int[]{2, 1, 1, 2, 2, 2};
                                                                }
                                                                break;
                                                            case 2374:
                                                                if (str.equals("JP")) {
                                                                    return new int[]{0, 1, 1, 2, 2, 4};
                                                                }
                                                                break;
                                                            case 2394:
                                                                break;
                                                            case 2396:
                                                                break;
                                                            case 2397:
                                                                if (str.equals("KH")) {
                                                                    return new int[]{2, 1, 4, 2, 2, 2};
                                                                }
                                                                break;
                                                            case 2398:
                                                                break;
                                                            case 2402:
                                                                break;
                                                            case 2403:
                                                                break;
                                                            case 2405:
                                                                break;
                                                            case 2407:
                                                                if (str.equals("KR")) {
                                                                    return new int[]{0, 1, 1, 3, 4, 4};
                                                                }
                                                                break;
                                                            case 2412:
                                                                break;
                                                            case 2414:
                                                                break;
                                                            case 2415:
                                                                if (str.equals("KZ")) {
                                                                    return new int[]{2, 1, 2, 2, 2, 2};
                                                                }
                                                                break;
                                                            case 2421:
                                                                if (str.equals("LA")) {
                                                                    return new int[]{1, 2, 1, 3, 2, 2};
                                                                }
                                                                break;
                                                            case 2422:
                                                                if (str.equals(ExpandedProductParsedResult.POUND)) {
                                                                    return new int[]{3, 3, 2, 4, 2, 2};
                                                                }
                                                                break;
                                                            case 2423:
                                                                break;
                                                            case 2429:
                                                                break;
                                                            case 2431:
                                                                if (str.equals("LK")) {
                                                                    return new int[]{3, 1, 3, 3, 4, 2};
                                                                }
                                                                break;
                                                            case 2438:
                                                                break;
                                                            case 2439:
                                                                if (str.equals("LS")) {
                                                                    return new int[]{3, 3, 2, 2, 2, 2};
                                                                }
                                                                break;
                                                            case 2440:
                                                                if (str.equals("LT")) {
                                                                    return new int[]{0, 0, 0, 0, 2, 2};
                                                                }
                                                                break;
                                                            case 2441:
                                                                if (str.equals("LU")) {
                                                                    return new int[]{1, 0, 3, 2, 1, 4};
                                                                }
                                                                break;
                                                            case 2442:
                                                                break;
                                                            case 2445:
                                                                break;
                                                            case 2452:
                                                                if (str.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_MA)) {
                                                                    return new int[]{3, 3, 1, 1, 2, 2};
                                                                }
                                                                break;
                                                            case 2454:
                                                                if (str.equals("MC")) {
                                                                    return new int[]{0, 2, 2, 0, 2, 2};
                                                                }
                                                                break;
                                                            case 2455:
                                                                break;
                                                            case 2456:
                                                                if (str.equals("ME")) {
                                                                    return new int[]{2, 0, 0, 1, 2, 2};
                                                                }
                                                                break;
                                                            case 2457:
                                                                break;
                                                            case 2458:
                                                                break;
                                                            case 2459:
                                                                break;
                                                            case 2462:
                                                                if (str.equals("MK")) {
                                                                    return new int[]{1, 0, 0, 1, 3, 2};
                                                                }
                                                                break;
                                                            case 2463:
                                                                break;
                                                            case 2464:
                                                                if (str.equals("MM")) {
                                                                    return new int[]{2, 4, 2, 3, 2, 2};
                                                                }
                                                                break;
                                                            case 2465:
                                                                if (str.equals("MN")) {
                                                                    return new int[]{2, 0, 1, 2, 2, 2};
                                                                }
                                                                break;
                                                            case 2466:
                                                                break;
                                                            case 2467:
                                                                break;
                                                            case 2468:
                                                                break;
                                                            case 2469:
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
                                                                    return new int[]{4, 2, 3, 3, 2, 2};
                                                                }
                                                                break;
                                                            case 2475:
                                                                if (str.equals("MX")) {
                                                                    return new int[]{2, 4, 3, 4, 2, 2};
                                                                }
                                                                break;
                                                            case 2476:
                                                                if (str.equals("MY")) {
                                                                    return new int[]{1, 0, 3, 1, 3, 2};
                                                                }
                                                                break;
                                                            case 2477:
                                                                if (str.equals("MZ")) {
                                                                    return new int[]{3, 1, 2, 1, 2, 2};
                                                                }
                                                                break;
                                                            case 2483:
                                                                break;
                                                            case 2485:
                                                                if (str.equals("NC")) {
                                                                    return new int[]{3, 3, 4, 4, 2, 2};
                                                                }
                                                                break;
                                                            case 2487:
                                                                break;
                                                            case 2489:
                                                                if (str.equals("NG")) {
                                                                    return new int[]{3, 4, 2, 1, 2, 2};
                                                                }
                                                                break;
                                                            case 2491:
                                                                break;
                                                            case 2494:
                                                                if (str.equals("NL")) {
                                                                    return new int[]{0, 2, 2, 3, 0, 3};
                                                                }
                                                                break;
                                                            case 2497:
                                                                break;
                                                            case 2498:
                                                                if (str.equals("NP")) {
                                                                    return new int[]{2, 2, 4, 3, 2, 2};
                                                                }
                                                                break;
                                                            case 2500:
                                                                break;
                                                            case 2503:
                                                                break;
                                                            case 2508:
                                                                break;
                                                            case 2526:
                                                                if (str.equals("OM")) {
                                                                    return new int[]{2, 3, 1, 3, 4, 2};
                                                                }
                                                                break;
                                                            case 2545:
                                                                break;
                                                            case 2549:
                                                                break;
                                                            case 2550:
                                                                break;
                                                            case 2551:
                                                                break;
                                                            case 2552:
                                                                if (str.equals("PH")) {
                                                                    return new int[]{2, 1, 3, 3, 3, 0};
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
                                                                    return new int[]{2, 0, 2, 1, 2, 1};
                                                                }
                                                                break;
                                                            case 2563:
                                                                if (str.equals("PS")) {
                                                                    return new int[]{3, 4, 1, 2, 2, 2};
                                                                }
                                                                break;
                                                            case 2564:
                                                                break;
                                                            case 2567:
                                                                if (str.equals("PW")) {
                                                                    return new int[]{2, 2, 4, 1, 2, 2};
                                                                }
                                                                break;
                                                            case 2576:
                                                                if (str.equals("QA")) {
                                                                    return new int[]{2, 4, 4, 4, 4, 2};
                                                                }
                                                                break;
                                                            case 2611:
                                                                break;
                                                            case 2621:
                                                                if (str.equals("RO")) {
                                                                    return new int[]{0, 0, 1, 2, 1, 2};
                                                                }
                                                                break;
                                                            case 2625:
                                                                break;
                                                            case 2627:
                                                                if (str.equals("RU")) {
                                                                    return new int[]{1, 0, 0, 0, 4, 3};
                                                                }
                                                                break;
                                                            case 2629:
                                                                if (str.equals("RW")) {
                                                                    return new int[]{3, 4, 2, 0, 2, 2};
                                                                }
                                                                break;
                                                            case 2638:
                                                                if (str.equals("SA")) {
                                                                    return new int[]{3, 1, 1, 1, 2, 2};
                                                                }
                                                                break;
                                                            case 2639:
                                                                if (str.equals("SB")) {
                                                                    return new int[]{4, 2, 4, 3, 2, 2};
                                                                }
                                                                break;
                                                            case 2640:
                                                                break;
                                                            case 2641:
                                                                break;
                                                            case 2642:
                                                                break;
                                                            case 2644:
                                                                if (str.equals("SG")) {
                                                                    return new int[]{1, 1, 2, 2, 2, 1};
                                                                }
                                                                break;
                                                            case 2645:
                                                                break;
                                                            case 2646:
                                                                break;
                                                            case 2648:
                                                                break;
                                                            case 2649:
                                                                break;
                                                            case 2650:
                                                                break;
                                                            case 2651:
                                                                if (str.equals("SN")) {
                                                                    return new int[]{4, 4, 4, 3, 2, 2};
                                                                }
                                                                break;
                                                            case 2652:
                                                                break;
                                                            case 2655:
                                                                if (str.equals("SR")) {
                                                                    return new int[]{2, 4, 3, 0, 2, 2};
                                                                }
                                                                break;
                                                            case 2656:
                                                                if (str.equals("SS")) {
                                                                    return new int[]{4, 3, 2, 3, 2, 2};
                                                                }
                                                                break;
                                                            case 2657:
                                                                if (str.equals("ST")) {
                                                                    return new int[]{2, 2, 1, 2, 2, 2};
                                                                }
                                                                break;
                                                            case 2659:
                                                                break;
                                                            case 2661:
                                                                break;
                                                            case 2662:
                                                                break;
                                                            case 2663:
                                                                if (str.equals("SZ")) {
                                                                    return new int[]{3, 3, 3, 4, 2, 2};
                                                                }
                                                                break;
                                                            case 2671:
                                                                break;
                                                            case 2672:
                                                                break;
                                                            case 2675:
                                                                break;
                                                            case 2676:
                                                                if (str.equals("TH")) {
                                                                    return new int[]{0, 2, 2, 3, 3, 4};
                                                                }
                                                                break;
                                                            case 2678:
                                                                break;
                                                            case 2679:
                                                                if (str.equals("TK")) {
                                                                    return new int[]{2, 2, 2, 4, 2, 2};
                                                                }
                                                                break;
                                                            case 2680:
                                                                break;
                                                            case 2681:
                                                                break;
                                                            case 2682:
                                                                break;
                                                            case 2683:
                                                                break;
                                                            case 2686:
                                                                if (str.equals("TR")) {
                                                                    return new int[]{1, 1, 0, 0, 2, 2};
                                                                }
                                                                break;
                                                            case 2688:
                                                                if (str.equals("TT")) {
                                                                    return new int[]{1, 4, 1, 3, 2, 2};
                                                                }
                                                                break;
                                                            case 2690:
                                                                break;
                                                            case 2691:
                                                                break;
                                                            case 2694:
                                                                if (str.equals("TZ")) {
                                                                    return new int[]{3, 4, 3, 2, 2, 2};
                                                                }
                                                                break;
                                                            case 2700:
                                                                break;
                                                            case 2706:
                                                                break;
                                                            case 2718:
                                                                if (str.equals("US")) {
                                                                    return new int[]{1, 0, 2, 2, 3, 1};
                                                                }
                                                                break;
                                                            case 2724:
                                                                break;
                                                            case 2725:
                                                                if (str.equals("UZ")) {
                                                                    return new int[]{2, 2, 3, 4, 2, 2};
                                                                }
                                                                break;
                                                            case 2731:
                                                                break;
                                                            case 2733:
                                                                break;
                                                            case 2735:
                                                                break;
                                                            case 2737:
                                                                if (str.equals("VG")) {
                                                                    return new int[]{2, 2, 1, 1, 2, 2};
                                                                }
                                                                break;
                                                            case 2739:
                                                                break;
                                                            case 2744:
                                                                if (str.equals("VN")) {
                                                                    return new int[]{0, 3, 3, 4, 2, 2};
                                                                }
                                                                break;
                                                            case 2751:
                                                                break;
                                                            case 2767:
                                                                break;
                                                            case 2780:
                                                                if (str.equals("WS")) {
                                                                    return new int[]{3, 1, 3, 1, 2, 2};
                                                                }
                                                                break;
                                                            case 2803:
                                                                break;
                                                            case 2828:
                                                                break;
                                                            case 2843:
                                                                break;
                                                            case 2855:
                                                                if (str.equals("ZA")) {
                                                                    return new int[]{3, 2, 2, 1, 1, 2};
                                                                }
                                                                break;
                                                            case 2867:
                                                                if (str.equals("ZM")) {
                                                                    return new int[]{3, 3, 4, 2, 2, 2};
                                                                }
                                                                break;
                                                            case 2877:
                                                                break;
                                                            default:
                                                                switch (hashCode) {
                                                                    case 2096:
                                                                        break;
                                                                    case 2097:
                                                                        break;
                                                                    case 2098:
                                                                        if (str.equals("AS")) {
                                                                            return new int[]{2, 2, 3, 3, 2, 2};
                                                                        }
                                                                        break;
                                                                    case 2099:
                                                                        if (str.equals("AT")) {
                                                                            return new int[]{1, 0, 1, 1, 0, 0};
                                                                        }
                                                                        break;
                                                                    case 2100:
                                                                        if (str.equals("AU")) {
                                                                            return new int[]{0, 1, 1, 1, 2, 0};
                                                                        }
                                                                        break;
                                                                    default:
                                                                        switch (hashCode) {
                                                                            case 2122:
                                                                                break;
                                                                            case 2123:
                                                                                break;
                                                                            case 2124:
                                                                                break;
                                                                            case 2125:
                                                                                if (str.equals("BO")) {
                                                                                    return new int[]{1, 2, 3, 2, 2, 2};
                                                                                }
                                                                                break;
                                                                            default:
                                                                                switch (hashCode) {
                                                                                    case 2149:
                                                                                        if (str.equals("CH")) {
                                                                                            return new int[]{0, 0, 0, 1, 0, 2};
                                                                                        }
                                                                                        break;
                                                                                }
                                                                        }
                                                                }
                                                        }
                                                }
                                            } else if (str.equals("BZ")) {
                                                return new int[]{2, 4, 2, 1, 2, 2};
                                            }
                                        } else if (str.equals("BY")) {
                                            return new int[]{0, 1, 2, 3, 2, 2};
                                        }
                                    } else if (str.equals("BT")) {
                                        return new int[]{3, 1, 3, 2, 2, 2};
                                    }
                                } else if (str.equals("BS")) {
                                    return new int[]{4, 4, 2, 2, 2, 2};
                                }
                            }
                        } else if (str.equals("BA")) {
                            return new int[]{1, 2, 1, 1, 2, 2};
                        }
                    }
                } else if (str.equals("AW")) {
                    return new int[]{1, 3, 4, 4, 2, 2};
                }
            } else if (str.equals("AM")) {
                return new int[]{2, 3, 2, 3, 2, 2};
            }
            return new int[]{2, 2, 2, 2, 2, 2};
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfz
    public final synchronized void zza(zzex zzexVar, zzfc zzfcVar, boolean z, int i) {
        if (zzl(zzfcVar, z)) {
            this.zzo += i;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfz
    public final synchronized void zzb(zzex zzexVar, zzfc zzfcVar, boolean z) {
        if (zzl(zzfcVar, z)) {
            zzdd.zzf(this.zzm > 0);
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

    @Override // com.google.android.gms.internal.ads.zzfz
    public final void zzc(zzex zzexVar, zzfc zzfcVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzfz
    public final synchronized void zzd(zzex zzexVar, zzfc zzfcVar, boolean z) {
        if (zzl(zzfcVar, z)) {
            if (this.zzm == 0) {
                this.zzn = SystemClock.elapsedRealtime();
            }
            this.zzm++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final void zzf(zzwg zzwgVar) {
        this.zzi.zzc(zzwgVar);
    }

    public static synchronized zzwl zzg(Context context) {
        zzwl zzwlVar;
        synchronized (zzwl.class) {
            if (zzg == null) {
                Context applicationContext = context == null ? null : context.getApplicationContext();
                int[] zzm = zzm(zzen.zzL(context));
                HashMap hashMap = new HashMap(8);
                hashMap.put(0, 1000000L);
                zzfvn zzfvnVar = zza;
                hashMap.put(2, (Long) zzfvnVar.get(zzm[0]));
                hashMap.put(3, (Long) zzb.get(zzm[1]));
                hashMap.put(4, (Long) zzc.get(zzm[2]));
                hashMap.put(5, (Long) zzd.get(zzm[3]));
                hashMap.put(10, (Long) zze.get(zzm[4]));
                hashMap.put(9, (Long) zzf.get(zzm[5]));
                hashMap.put(7, (Long) zzfvnVar.get(zzm[0]));
                zzg = new zzwl(applicationContext, hashMap, 2000, zzde.zza, true, null);
            }
            zzwlVar = zzg;
        }
        return zzwlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final void zze(Handler handler, zzwg zzwgVar) {
        Objects.requireNonNull(zzwgVar);
        this.zzi.zza(handler, zzwgVar);
    }

    /* synthetic */ zzwl(Context context, Map map, int i, zzde zzdeVar, boolean z, zzwk zzwkVar) {
        this.zzh = zzfvq.zzc(map);
        this.zzi = new zzwf();
        this.zzj = new zzxb(2000);
        this.zzk = zzdeVar;
        this.zzl = true;
        if (context != null) {
            zzed zzb2 = zzed.zzb(context);
            int zza2 = zzb2.zza();
            this.zzp = zza2;
            this.zzs = zzi(zza2);
            zzb2.zzd(new zzwj(this));
            return;
        }
        this.zzp = 0;
        this.zzs = zzi(0);
    }
}
