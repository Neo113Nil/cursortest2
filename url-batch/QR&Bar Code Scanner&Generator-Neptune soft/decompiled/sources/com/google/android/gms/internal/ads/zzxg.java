package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import androidx.work.WorkRequest;
import com.google.android.gms.common.Scopes;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;
import kotlin.text.Typography;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzxg extends zzqq {
    private static final int[] zzb = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean zzc;
    private static boolean zzd;
    private long zzA;
    private int zzB;
    private int zzC;
    private int zzD;
    private int zzE;
    private float zzF;
    private zzda zzG;
    private int zzH;
    private zzxk zzI;
    private final Context zze;
    private final zzxr zzf;
    private final zzyc zzg;
    private final boolean zzh;
    private zzxf zzi;
    private boolean zzj;
    private boolean zzk;
    private Surface zzl;
    private zzxj zzm;
    private boolean zzn;
    private int zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private int zzv;
    private int zzw;
    private int zzx;
    private long zzy;
    private long zzz;

    public zzxg(Context context, zzqk zzqkVar, zzqs zzqsVar, long j, boolean z, Handler handler, zzyd zzydVar, int i, float f) {
        super(2, zzqkVar, zzqsVar, false, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.zze = applicationContext;
        this.zzf = new zzxr(applicationContext);
        this.zzg = new zzyc(handler, zzydVar);
        this.zzh = "NVIDIA".equals(zzen.zzc);
        this.zzt = -9223372036854775807L;
        this.zzC = -1;
        this.zzD = -1;
        this.zzF = -1.0f;
        this.zzo = 1;
        this.zzH = 0;
        this.zzG = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0060, code lost:
    
        if (r3.equals("video/mp4v-es") != false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zzT(zzqn zzqnVar, zzaf zzafVar) {
        int i;
        int intValue;
        int i2 = zzafVar.zzr;
        int i3 = zzafVar.zzs;
        if (i2 == -1 || i3 == -1) {
            return -1;
        }
        String str = zzafVar.zzm;
        char c = 1;
        int i4 = 2;
        if ("video/dolby-vision".equals(str)) {
            Pair zzb2 = zzrf.zzb(zzafVar);
            str = (zzb2 == null || !((intValue = ((Integer) zzb2.first).intValue()) == 512 || intValue == 1 || intValue == 2)) ? "video/hevc" : "video/avc";
        }
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1662735862:
                if (str.equals("video/av01")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1187890754:
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 3:
            case 4:
                i = i2 * i3;
                break;
            case 2:
                if (!"BRAVIA 4K 2015".equals(zzen.zzd) && (!"Amazon".equals(zzen.zzc) || (!"KFSOWI".equals(zzen.zzd) && (!"AFTS".equals(zzen.zzd) || !zzqnVar.zzf)))) {
                    i = zzen.zze(i2, 16) * zzen.zze(i3, 16) * 256;
                    break;
                } else {
                    return -1;
                }
            case 5:
            case 6:
                i = i2 * i3;
                i4 = 4;
                break;
            default:
                return -1;
        }
        return (i * 3) / (i4 + i4);
    }

    protected static int zzU(zzqn zzqnVar, zzaf zzafVar) {
        if (zzafVar.zzn == -1) {
            return zzT(zzqnVar, zzafVar);
        }
        int size = zzafVar.zzo.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((byte[]) zzafVar.zzo.get(i2)).length;
        }
        return zzafVar.zzn + i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x04c3, code lost:
    
        if (r13.equals("deb") != false) goto L506;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x07a1, code lost:
    
        if (r10 != 0) goto L515;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected static final boolean zzaB(String str) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (zzxg.class) {
            if (!zzc) {
                char c = 28;
                char c2 = 65535;
                if (zzen.zza <= 28) {
                    String str2 = zzen.zzb;
                    switch (str2.hashCode()) {
                        case -1339091551:
                            if (str2.equals("dangal")) {
                                z2 = true;
                                break;
                            }
                            z2 = -1;
                            break;
                        case -1220081023:
                            if (str2.equals("dangalFHD")) {
                                z2 = 3;
                                break;
                            }
                            z2 = -1;
                            break;
                        case -1220066608:
                            if (str2.equals("dangalUHD")) {
                                z2 = 2;
                                break;
                            }
                            z2 = -1;
                            break;
                        case -1012436106:
                            if (str2.equals("oneday")) {
                                z2 = 7;
                                break;
                            }
                            z2 = -1;
                            break;
                        case -760312546:
                            if (str2.equals("aquaman")) {
                                z2 = false;
                                break;
                            }
                            z2 = -1;
                            break;
                        case -64886864:
                            if (str2.equals("magnolia")) {
                                z2 = 4;
                                break;
                            }
                            z2 = -1;
                            break;
                        case 3415681:
                            if (str2.equals("once")) {
                                z2 = 6;
                                break;
                            }
                            z2 = -1;
                            break;
                        case 825323514:
                            if (str2.equals("machuca")) {
                                z2 = 5;
                                break;
                            }
                            z2 = -1;
                            break;
                        default:
                            z2 = -1;
                            break;
                    }
                    switch (z2) {
                        case false:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                            z3 = true;
                            break;
                    }
                    zzd = z3;
                    zzc = true;
                }
                if (zzen.zza > 27 || !"HWEML".equals(zzen.zzb)) {
                    String str3 = zzen.zzd;
                    switch (str3.hashCode()) {
                        case -349662828:
                            if (str3.equals("AFTJMST12")) {
                                z = 6;
                                break;
                            }
                            z = -1;
                            break;
                        case -321033677:
                            if (str3.equals("AFTKMST12")) {
                                z = 7;
                                break;
                            }
                            z = -1;
                            break;
                        case 2006354:
                            if (str3.equals("AFTA")) {
                                z = false;
                                break;
                            }
                            z = -1;
                            break;
                        case 2006367:
                            if (str3.equals("AFTN")) {
                                z = true;
                                break;
                            }
                            z = -1;
                            break;
                        case 2006371:
                            if (str3.equals("AFTR")) {
                                z = 2;
                                break;
                            }
                            z = -1;
                            break;
                        case 1785421873:
                            if (str3.equals("AFTEU011")) {
                                z = 3;
                                break;
                            }
                            z = -1;
                            break;
                        case 1785421876:
                            if (str3.equals("AFTEU014")) {
                                z = 4;
                                break;
                            }
                            z = -1;
                            break;
                        case 1798172390:
                            if (str3.equals("AFTSO001")) {
                                z = 8;
                                break;
                            }
                            z = -1;
                            break;
                        case 2119412532:
                            if (str3.equals("AFTEUFF014")) {
                                z = 5;
                                break;
                            }
                            z = -1;
                            break;
                        default:
                            z = -1;
                            break;
                    }
                    switch (z) {
                        default:
                            if (zzen.zza <= 26) {
                                String str4 = zzen.zzb;
                                switch (str4.hashCode()) {
                                    case -2144781245:
                                        if (str4.equals("GIONEE_SWW1609")) {
                                            c = '6';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -2144781185:
                                        if (str4.equals("GIONEE_SWW1627")) {
                                            c = '7';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -2144781160:
                                        if (str4.equals("GIONEE_SWW1631")) {
                                            c = '8';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -2097309513:
                                        if (str4.equals("K50a40")) {
                                            c = 'J';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -2022874474:
                                        if (str4.equals("CP8676_I02")) {
                                            c = 22;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1978993182:
                                        if (str4.equals("NX541J")) {
                                            c = 'Y';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1978990237:
                                        if (str4.equals("NX573J")) {
                                            c = 'Z';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1936688988:
                                        if (str4.equals("PGN528")) {
                                            c = 'e';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1936688066:
                                        if (str4.equals("PGN610")) {
                                            c = 'f';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1936688065:
                                        if (str4.equals("PGN611")) {
                                            c = 'g';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1931988508:
                                        if (str4.equals("AquaPowerM")) {
                                            c = '\r';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1885099851:
                                        if (str4.equals("RAIJIN")) {
                                            c = 't';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1696512866:
                                        if (str4.equals("XT1663")) {
                                            c = 137;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1680025915:
                                        if (str4.equals("ComioS1")) {
                                            c = 21;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1615810839:
                                        if (str4.equals("Phantom6")) {
                                            c = 'h';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1600724499:
                                        if (str4.equals("pacificrim")) {
                                            c = '_';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1554255044:
                                        if (str4.equals("vernee_M5")) {
                                            c = 130;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1481772737:
                                        if (str4.equals("panell_dl")) {
                                            c = 'a';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1481772730:
                                        if (str4.equals("panell_ds")) {
                                            c = 'b';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1481772729:
                                        if (str4.equals("panell_dt")) {
                                            c = 'c';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1320080169:
                                        if (str4.equals("GiONEE_GBL7319")) {
                                            c = '4';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1217592143:
                                        if (str4.equals("BRAVIA_ATV2")) {
                                            c = 18;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1180384755:
                                        if (str4.equals("iris60")) {
                                            c = 'F';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1139198265:
                                        if (str4.equals("Slate_Pro")) {
                                            c = 'v';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1052835013:
                                        if (str4.equals("namath")) {
                                            c = 'W';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -993250464:
                                        if (str4.equals("A10-70F")) {
                                            c = 5;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -993250458:
                                        if (str4.equals("A10-70L")) {
                                            c = 6;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -965403638:
                                        if (str4.equals("s905x018")) {
                                            c = 'x';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -958336948:
                                        if (str4.equals("ELUGA_Ray_X")) {
                                            c = Typography.quote;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -879245230:
                                        if (str4.equals("tcl_eu")) {
                                            c = '~';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -842500323:
                                        if (str4.equals("nicklaus_f")) {
                                            c = 'X';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -821392978:
                                        if (str4.equals("A7000-a")) {
                                            c = '\t';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -797483286:
                                        if (str4.equals("SVP-DTV15")) {
                                            c = 'w';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -794946968:
                                        if (str4.equals("watson")) {
                                            c = 131;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -788334647:
                                        if (str4.equals("whyred")) {
                                            c = 132;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -782144577:
                                        if (str4.equals("OnePlus5T")) {
                                            c = '[';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -575125681:
                                        if (str4.equals("GiONEE_CBL7513")) {
                                            c = '3';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -521118391:
                                        if (str4.equals("GIONEE_GBL7360")) {
                                            c = '5';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -430914369:
                                        if (str4.equals("Pixi4-7_3G")) {
                                            c = 'i';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -290434366:
                                        if (str4.equals("taido_row")) {
                                            c = 'y';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -282781963:
                                        if (str4.equals("BLACK-1X")) {
                                            c = 17;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -277133239:
                                        if (str4.equals("Z12_PRO")) {
                                            c = 138;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -173639913:
                                        if (str4.equals("ELUGA_A3_Pro")) {
                                            c = 31;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -56598463:
                                        if (str4.equals("woods_fn")) {
                                            c = 134;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2126:
                                        if (str4.equals("C1")) {
                                            c = 20;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2564:
                                        if (str4.equals("Q5")) {
                                            c = 'q';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2715:
                                        if (str4.equals("V1")) {
                                            c = 127;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2719:
                                        if (str4.equals("V5")) {
                                            c = 129;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 3091:
                                        if (str4.equals("b5")) {
                                            c = 16;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 3483:
                                        if (str4.equals("mh")) {
                                            c = 'T';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 73405:
                                        if (str4.equals("JGZ")) {
                                            c = 'I';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 75537:
                                        if (str4.equals("M04")) {
                                            c = 'O';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 75739:
                                        if (str4.equals("M5c")) {
                                            c = 'P';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 76779:
                                        if (str4.equals("MX6")) {
                                            c = 'V';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 78669:
                                        if (str4.equals("P85")) {
                                            c = '^';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 79305:
                                        if (str4.equals("PLE")) {
                                            c = 'k';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 80618:
                                        if (str4.equals("QX1")) {
                                            c = 's';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 88274:
                                        if (str4.equals("Z80")) {
                                            c = 139;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 98846:
                                        if (str4.equals("cv1")) {
                                            c = 26;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 98848:
                                        if (str4.equals("cv3")) {
                                            c = 27;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 99329:
                                        break;
                                    case 101481:
                                        if (str4.equals("flo")) {
                                            c = '1';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1513190:
                                        if (str4.equals("1601")) {
                                            c = 0;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1514184:
                                        if (str4.equals("1713")) {
                                            c = 1;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1514185:
                                        if (str4.equals("1714")) {
                                            c = 2;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2133089:
                                        if (str4.equals("F01H")) {
                                            c = Typography.dollar;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2133091:
                                        if (str4.equals("F01J")) {
                                            c = '%';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2133120:
                                        if (str4.equals("F02H")) {
                                            c = Typography.amp;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2133151:
                                        if (str4.equals("F03H")) {
                                            c = '\'';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2133182:
                                        if (str4.equals("F04H")) {
                                            c = '(';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2133184:
                                        if (str4.equals("F04J")) {
                                            c = ')';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2436959:
                                        if (str4.equals("P681")) {
                                            c = ']';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2463773:
                                        if (str4.equals("Q350")) {
                                            c = 'm';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2464648:
                                        if (str4.equals("Q427")) {
                                            c = 'o';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2689555:
                                        if (str4.equals("XE2X")) {
                                            c = 136;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 3154429:
                                        if (str4.equals("fugu")) {
                                            c = '2';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 3284551:
                                        if (str4.equals("kate")) {
                                            c = 'K';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 3351335:
                                        if (str4.equals("mido")) {
                                            c = 'U';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 3386211:
                                        if (str4.equals("p212")) {
                                            c = '\\';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 41325051:
                                        if (str4.equals("MEIZU_M5")) {
                                            c = 'S';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 51349633:
                                        if (str4.equals("601LV")) {
                                            c = 3;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 51350594:
                                        if (str4.equals("602LV")) {
                                            c = 4;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 55178625:
                                        if (str4.equals("Aura_Note_2")) {
                                            c = 15;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 61542055:
                                        if (str4.equals("A1601")) {
                                            c = 7;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 65355429:
                                        if (str4.equals("E5643")) {
                                            c = 30;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 66214468:
                                        if (str4.equals("F3111")) {
                                            c = '*';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 66214470:
                                        if (str4.equals("F3113")) {
                                            c = '+';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 66214473:
                                        if (str4.equals("F3116")) {
                                            c = ',';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 66215429:
                                        if (str4.equals("F3211")) {
                                            c = '-';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 66215431:
                                        if (str4.equals("F3213")) {
                                            c = '.';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 66215433:
                                        if (str4.equals("F3215")) {
                                            c = '/';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 66216390:
                                        if (str4.equals("F3311")) {
                                            c = '0';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 76402249:
                                        if (str4.equals("PRO7S")) {
                                            c = 'l';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 76404105:
                                        if (str4.equals("Q4260")) {
                                            c = 'n';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 76404911:
                                        if (str4.equals("Q4310")) {
                                            c = 'p';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 80963634:
                                        if (str4.equals("V23GB")) {
                                            c = 128;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 82882791:
                                        if (str4.equals("X3_HK")) {
                                            c = 135;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 98715550:
                                        if (str4.equals("i9031")) {
                                            c = 'C';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 101370885:
                                        if (str4.equals("l5460")) {
                                            c = 'L';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 102844228:
                                        if (str4.equals("le_x6")) {
                                            c = 'M';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 165221241:
                                        if (str4.equals("A2016a40")) {
                                            c = '\b';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 182191441:
                                        if (str4.equals("CPY83_I00")) {
                                            c = 25;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 245388979:
                                        if (str4.equals("marino_f")) {
                                            c = 'R';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 287431619:
                                        if (str4.equals("griffin")) {
                                            c = Typography.less;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 307593612:
                                        if (str4.equals("A7010a48")) {
                                            c = 11;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 308517133:
                                        if (str4.equals("A7020a48")) {
                                            c = '\f';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 316215098:
                                        if (str4.equals("TB3-730F")) {
                                            c = 'z';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 316215116:
                                        if (str4.equals("TB3-730X")) {
                                            c = '{';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 316246811:
                                        if (str4.equals("TB3-850F")) {
                                            c = '|';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 316246818:
                                        if (str4.equals("TB3-850M")) {
                                            c = '}';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 407160593:
                                        if (str4.equals("Pixi5-10_4G")) {
                                            c = 'j';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 507412548:
                                        if (str4.equals("QM16XE_U")) {
                                            c = 'r';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 793982701:
                                        if (str4.equals("GIONEE_WBL5708")) {
                                            c = '9';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 794038622:
                                        if (str4.equals("GIONEE_WBL7365")) {
                                            c = ':';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 794040393:
                                        if (str4.equals("GIONEE_WBL7519")) {
                                            c = ';';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 835649806:
                                        if (str4.equals("manning")) {
                                            c = 'Q';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 917340916:
                                        if (str4.equals("A7000plus")) {
                                            c = '\n';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 958008161:
                                        if (str4.equals("j2xlteins")) {
                                            c = 'H';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1060579533:
                                        if (str4.equals("panell_d")) {
                                            c = '`';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1150207623:
                                        if (str4.equals("LS-5017")) {
                                            c = 'N';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1176899427:
                                        if (str4.equals("itel_S41")) {
                                            c = 'G';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1280332038:
                                        if (str4.equals("hwALE-H")) {
                                            c = Typography.greater;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1306947716:
                                        if (str4.equals("EverStar_S")) {
                                            c = '#';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1349174697:
                                        if (str4.equals("htc_e56ml_dtul")) {
                                            c = '=';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1522194893:
                                        if (str4.equals("woods_f")) {
                                            c = 133;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1691543273:
                                        if (str4.equals("CPH1609")) {
                                            c = 23;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1691544261:
                                        if (str4.equals("CPH1715")) {
                                            c = 24;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1709443163:
                                        if (str4.equals("iball8735_9806")) {
                                            c = 'D';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1865889110:
                                        if (str4.equals("santoni")) {
                                            c = 'u';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1906253259:
                                        if (str4.equals("PB2-670M")) {
                                            c = 'd';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1977196784:
                                        if (str4.equals("Infinix-X572")) {
                                            c = 'E';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2006372676:
                                        if (str4.equals("BRAVIA_ATV3_4K")) {
                                            c = 19;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2019281702:
                                        if (str4.equals("DM-01K")) {
                                            c = 29;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2029784656:
                                        if (str4.equals("HWBLN-H")) {
                                            c = '?';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2030379515:
                                        if (str4.equals("HWCAM-H")) {
                                            c = '@';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2033393791:
                                        if (str4.equals("ASUS_X00AD_2")) {
                                            c = 14;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2047190025:
                                        if (str4.equals("ELUGA_Note")) {
                                            c = ' ';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2047252157:
                                        if (str4.equals("ELUGA_Prim")) {
                                            c = '!';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2048319463:
                                        if (str4.equals("HWVNS-H")) {
                                            c = 'A';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2048855701:
                                        if (str4.equals("HWWAS-H")) {
                                            c = 'B';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    default:
                                        c = 65535;
                                        break;
                                }
                                switch (c) {
                                    default:
                                        if (str3.hashCode() == -594534941 && str3.equals("JSN-L21")) {
                                            c2 = 0;
                                            break;
                                        }
                                        break;
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case '\b':
                                    case '\t':
                                    case '\n':
                                    case 11:
                                    case '\f':
                                    case '\r':
                                    case 14:
                                    case 15:
                                    case 16:
                                    case 17:
                                    case 18:
                                    case 19:
                                    case 20:
                                    case 21:
                                    case 22:
                                    case 23:
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                    case 29:
                                    case 30:
                                    case 31:
                                    case ' ':
                                    case '!':
                                    case '\"':
                                    case '#':
                                    case '$':
                                    case '%':
                                    case '&':
                                    case '\'':
                                    case '(':
                                    case ')':
                                    case '*':
                                    case '+':
                                    case ',':
                                    case '-':
                                    case '.':
                                    case '/':
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                    case ':':
                                    case ';':
                                    case '<':
                                    case '=':
                                    case '>':
                                    case '?':
                                    case '@':
                                    case 'A':
                                    case 'B':
                                    case 'C':
                                    case 'D':
                                    case 'E':
                                    case 'F':
                                    case 'G':
                                    case 'H':
                                    case 'I':
                                    case 'J':
                                    case 'K':
                                    case 'L':
                                    case 'M':
                                    case 'N':
                                    case 'O':
                                    case 'P':
                                    case 'Q':
                                    case 'R':
                                    case 'S':
                                    case 'T':
                                    case 'U':
                                    case 'V':
                                    case 'W':
                                    case 'X':
                                    case 'Y':
                                    case 'Z':
                                    case '[':
                                    case '\\':
                                    case ']':
                                    case '^':
                                    case '_':
                                    case '`':
                                    case 'a':
                                    case 'b':
                                    case 'c':
                                    case 'd':
                                    case 'e':
                                    case 'f':
                                    case 'g':
                                    case 'h':
                                    case 'i':
                                    case 'j':
                                    case 'k':
                                    case 'l':
                                    case 'm':
                                    case 'n':
                                    case 'o':
                                    case 'p':
                                    case 'q':
                                    case 'r':
                                    case 's':
                                    case 't':
                                    case 'u':
                                    case 'v':
                                    case 'w':
                                    case 'x':
                                    case 'y':
                                    case 'z':
                                    case '{':
                                    case '|':
                                    case '}':
                                    case '~':
                                    case WorkQueueKt.MASK /* 127 */:
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                    case 136:
                                    case 137:
                                    case 138:
                                    case 139:
                                        break;
                                }
                            }
                            break;
                        case false:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                            break;
                    }
                    zzd = z3;
                    zzc = true;
                }
                z3 = true;
                zzd = z3;
                zzc = true;
            }
        }
        return zzd;
    }

    private static List zzaC(zzqs zzqsVar, zzaf zzafVar, boolean z, boolean z2) throws zzqz {
        String str = zzafVar.zzm;
        if (str == null) {
            return zzfvn.zzo();
        }
        List zzf = zzrf.zzf(str, z, z2);
        String zze = zzrf.zze(zzafVar);
        if (zze == null) {
            return zzfvn.zzm(zzf);
        }
        List zzf2 = zzrf.zzf(zze, z, z2);
        zzfvk zzi = zzfvn.zzi();
        zzi.zzf(zzf);
        zzi.zzf(zzf2);
        return zzi.zzg();
    }

    private final void zzaD() {
        int i = this.zzC;
        if (i == -1) {
            if (this.zzD == -1) {
                return;
            } else {
                i = -1;
            }
        }
        zzda zzdaVar = this.zzG;
        if (zzdaVar != null && zzdaVar.zzc == i && zzdaVar.zzd == this.zzD && zzdaVar.zze == this.zzE && zzdaVar.zzf == this.zzF) {
            return;
        }
        zzda zzdaVar2 = new zzda(i, this.zzD, this.zzE, this.zzF);
        this.zzG = zzdaVar2;
        this.zzg.zzt(zzdaVar2);
    }

    private final void zzaE() {
        zzda zzdaVar = this.zzG;
        if (zzdaVar != null) {
            this.zzg.zzt(zzdaVar);
        }
    }

    private final void zzaF() {
        Surface surface = this.zzl;
        zzxj zzxjVar = this.zzm;
        if (surface == zzxjVar) {
            this.zzl = null;
        }
        zzxjVar.release();
        this.zzm = null;
    }

    private static boolean zzaG(long j) {
        return j < -30000;
    }

    private final boolean zzaH(zzqn zzqnVar) {
        return zzen.zza >= 23 && !zzaB(zzqnVar.zza) && (!zzqnVar.zzf || zzxj.zzb(this.zze));
    }

    @Override // com.google.android.gms.internal.ads.zzqq, com.google.android.gms.internal.ads.zzgr, com.google.android.gms.internal.ads.zzka
    public final void zzD(float f, float f2) throws zzha {
        super.zzD(f, f2);
        this.zzf.zze(f);
    }

    @Override // com.google.android.gms.internal.ads.zzka, com.google.android.gms.internal.ads.zzkb
    public final String zzK() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzqq, com.google.android.gms.internal.ads.zzka
    public final boolean zzN() {
        zzxj zzxjVar;
        if (super.zzN() && (this.zzp || (((zzxjVar = this.zzm) != null && this.zzl == zzxjVar) || zzaj() == null))) {
            this.zzt = -9223372036854775807L;
            return true;
        }
        if (this.zzt == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.zzt) {
            return true;
        }
        this.zzt = -9223372036854775807L;
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzqq
    protected final float zzP(float f, zzaf zzafVar, zzaf[] zzafVarArr) {
        float f2 = -1.0f;
        for (zzaf zzafVar2 : zzafVarArr) {
            float f3 = zzafVar2.zzt;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    @Override // com.google.android.gms.internal.ads.zzqq
    protected final int zzQ(zzqs zzqsVar, zzaf zzafVar) throws zzqz {
        boolean z;
        if (!zzbt.zzh(zzafVar.zzm)) {
            return 128;
        }
        int i = 0;
        boolean z2 = zzafVar.zzp != null;
        List zzaC = zzaC(zzqsVar, zzafVar, z2, false);
        if (z2 && zzaC.isEmpty()) {
            zzaC = zzaC(zzqsVar, zzafVar, false, false);
        }
        if (zzaC.isEmpty()) {
            return 129;
        }
        if (!zzav(zzafVar)) {
            return 130;
        }
        zzqn zzqnVar = (zzqn) zzaC.get(0);
        boolean zzd2 = zzqnVar.zzd(zzafVar);
        if (!zzd2) {
            for (int i2 = 1; i2 < zzaC.size(); i2++) {
                zzqn zzqnVar2 = (zzqn) zzaC.get(i2);
                if (zzqnVar2.zzd(zzafVar)) {
                    zzd2 = true;
                    z = false;
                    zzqnVar = zzqnVar2;
                    break;
                }
            }
        }
        z = true;
        int i3 = true != zzd2 ? 3 : 4;
        int i4 = true != zzqnVar.zze(zzafVar) ? 8 : 16;
        int i5 = true != zzqnVar.zzg ? 0 : 64;
        int i6 = true != z ? 0 : 128;
        if (zzd2) {
            List zzaC2 = zzaC(zzqsVar, zzafVar, z2, true);
            if (!zzaC2.isEmpty()) {
                zzqn zzqnVar3 = (zzqn) zzrf.zzg(zzaC2, zzafVar).get(0);
                if (zzqnVar3.zzd(zzafVar) && zzqnVar3.zze(zzafVar)) {
                    i = 32;
                }
            }
        }
        return i3 | i4 | i | i5 | i6;
    }

    @Override // com.google.android.gms.internal.ads.zzqq
    protected final zzgt zzR(zzqn zzqnVar, zzaf zzafVar, zzaf zzafVar2) {
        int i;
        int i2;
        zzgt zzb2 = zzqnVar.zzb(zzafVar, zzafVar2);
        int i3 = zzb2.zze;
        int i4 = zzafVar2.zzr;
        zzxf zzxfVar = this.zzi;
        if (i4 > zzxfVar.zza || zzafVar2.zzs > zzxfVar.zzb) {
            i3 |= 256;
        }
        if (zzU(zzqnVar, zzafVar2) > this.zzi.zzc) {
            i3 |= 64;
        }
        String str = zzqnVar.zza;
        if (i3 != 0) {
            i2 = 0;
            i = i3;
        } else {
            i = 0;
            i2 = zzb2.zzd;
        }
        return new zzgt(str, zzafVar, zzafVar2, i2, i);
    }

    @Override // com.google.android.gms.internal.ads.zzqq
    protected final zzgt zzS(zzjg zzjgVar) throws zzha {
        zzgt zzS = super.zzS(zzjgVar);
        this.zzg.zzf(zzjgVar.zza, zzS);
        return zzS;
    }

    @Override // com.google.android.gms.internal.ads.zzqq
    protected final zzqj zzV(zzqn zzqnVar, zzaf zzafVar, MediaCrypto mediaCrypto, float f) {
        String str;
        zzxf zzxfVar;
        String str2;
        String str3;
        Point point;
        Pair zzb2;
        int zzT;
        zzxj zzxjVar = this.zzm;
        if (zzxjVar != null && zzxjVar.zza != zzqnVar.zzf) {
            zzaF();
        }
        String str4 = zzqnVar.zzc;
        zzaf[] zzJ = zzJ();
        int i = zzafVar.zzr;
        int i2 = zzafVar.zzs;
        int zzU = zzU(zzqnVar, zzafVar);
        int length = zzJ.length;
        if (length == 1) {
            if (zzU != -1 && (zzT = zzT(zzqnVar, zzafVar)) != -1) {
                zzU = Math.min((int) (zzU * 1.5f), zzT);
            }
            zzxfVar = new zzxf(i, i2, zzU);
            str = str4;
        } else {
            boolean z = false;
            for (int i3 = 0; i3 < length; i3++) {
                zzaf zzafVar2 = zzJ[i3];
                if (zzafVar.zzy != null && zzafVar2.zzy == null) {
                    zzad zzb3 = zzafVar2.zzb();
                    zzb3.zzy(zzafVar.zzy);
                    zzafVar2 = zzb3.zzY();
                }
                if (zzqnVar.zzb(zzafVar, zzafVar2).zzd != 0) {
                    int i4 = zzafVar2.zzr;
                    z |= i4 == -1 || zzafVar2.zzs == -1;
                    i = Math.max(i, i4);
                    i2 = Math.max(i2, zzafVar2.zzs);
                    zzU = Math.max(zzU, zzU(zzqnVar, zzafVar2));
                }
            }
            if (z) {
                StringBuilder sb = new StringBuilder();
                sb.append("Resolutions unknown. Codec max resolution: ");
                sb.append(i);
                String str5 = "x";
                sb.append("x");
                sb.append(i2);
                String str6 = "MediaCodecVideoRenderer";
                zzdw.zze("MediaCodecVideoRenderer", sb.toString());
                int i5 = zzafVar.zzs;
                int i6 = zzafVar.zzr;
                int i7 = i5 > i6 ? i5 : i6;
                int i8 = i5 <= i6 ? i5 : i6;
                float f2 = i8 / i7;
                int[] iArr = zzb;
                str = str4;
                int i9 = 0;
                while (i9 < 9) {
                    int i10 = iArr[i9];
                    int[] iArr2 = iArr;
                    int i11 = (int) (i10 * f2);
                    if (i10 <= i7 || i11 <= i8) {
                        break;
                    }
                    int i12 = i7;
                    int i13 = i8;
                    if (zzen.zza >= 21) {
                        int i14 = i5 <= i6 ? i10 : i11;
                        if (i5 <= i6) {
                            i10 = i11;
                        }
                        point = zzqnVar.zza(i14, i10);
                        str2 = str5;
                        str3 = str6;
                        if (zzqnVar.zzf(point.x, point.y, zzafVar.zzt)) {
                            break;
                        }
                        i9++;
                        iArr = iArr2;
                        i7 = i12;
                        i8 = i13;
                        str5 = str2;
                        str6 = str3;
                    } else {
                        str2 = str5;
                        str3 = str6;
                        try {
                            int zze = zzen.zze(i10, 16) * 16;
                            int zze2 = zzen.zze(i11, 16) * 16;
                            if (zze * zze2 <= zzrf.zza()) {
                                int i15 = i5 <= i6 ? zze : zze2;
                                if (i5 <= i6) {
                                    zze = zze2;
                                }
                                point = new Point(i15, zze);
                            } else {
                                i9++;
                                iArr = iArr2;
                                i7 = i12;
                                i8 = i13;
                                str5 = str2;
                                str6 = str3;
                            }
                        } catch (zzqz unused) {
                        }
                    }
                }
                str2 = str5;
                str3 = str6;
                point = null;
                if (point != null) {
                    i = Math.max(i, point.x);
                    i2 = Math.max(i2, point.y);
                    zzad zzb4 = zzafVar.zzb();
                    zzb4.zzX(i);
                    zzb4.zzF(i2);
                    zzU = Math.max(zzU, zzT(zzqnVar, zzb4.zzY()));
                    zzdw.zze(str3, "Codec max resolution adjusted to: " + i + str2 + i2);
                }
            } else {
                str = str4;
            }
            zzxfVar = new zzxf(i, i2, zzU);
        }
        this.zzi = zzxfVar;
        boolean z2 = this.zzh;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", zzafVar.zzr);
        mediaFormat.setInteger("height", zzafVar.zzs);
        zzdy.zzb(mediaFormat, zzafVar.zzo);
        float f3 = zzafVar.zzt;
        if (f3 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f3);
        }
        zzdy.zza(mediaFormat, "rotation-degrees", zzafVar.zzu);
        zzq zzqVar = zzafVar.zzy;
        if (zzqVar != null) {
            zzdy.zza(mediaFormat, "color-transfer", zzqVar.zzd);
            zzdy.zza(mediaFormat, "color-standard", zzqVar.zzb);
            zzdy.zza(mediaFormat, "color-range", zzqVar.zzc);
            byte[] bArr = zzqVar.zze;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(zzafVar.zzm) && (zzb2 = zzrf.zzb(zzafVar)) != null) {
            zzdy.zza(mediaFormat, Scopes.PROFILE, ((Integer) zzb2.first).intValue());
        }
        mediaFormat.setInteger("max-width", zzxfVar.zza);
        mediaFormat.setInteger("max-height", zzxfVar.zzb);
        zzdy.zza(mediaFormat, "max-input-size", zzxfVar.zzc);
        if (zzen.zza >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (z2) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (this.zzl == null) {
            if (!zzaH(zzqnVar)) {
                throw new IllegalStateException();
            }
            if (this.zzm == null) {
                this.zzm = zzxj.zza(this.zze, zzqnVar.zzf);
            }
            this.zzl = this.zzm;
        }
        return zzqj.zzb(zzqnVar, mediaFormat, zzafVar, this.zzl, null);
    }

    @Override // com.google.android.gms.internal.ads.zzqq
    protected final List zzW(zzqs zzqsVar, zzaf zzafVar, boolean z) throws zzqz {
        return zzrf.zzg(zzaC(zzqsVar, zzafVar, false, false), zzafVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqq
    protected final void zzX(Exception exc) {
        zzdw.zzc("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzg.zzs(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzqq
    protected final void zzY(String str, zzqj zzqjVar, long j, long j2) {
        this.zzg.zza(str, j, j2);
        this.zzj = zzaB(str);
        zzqn zzal = zzal();
        Objects.requireNonNull(zzal);
        boolean z = false;
        if (zzen.zza >= 29 && "video/x-vnd.on2.vp9".equals(zzal.zzb)) {
            MediaCodecInfo.CodecProfileLevel[] zzg = zzal.zzg();
            int length = zzg.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (zzg[i].profile == 16384) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.zzk = z;
    }

    @Override // com.google.android.gms.internal.ads.zzqq
    protected final void zzZ(String str) {
        this.zzg.zzb(str);
    }

    protected final void zzaA(long j) {
        zzgs zzgsVar = this.zza;
        zzgsVar.zzk += j;
        zzgsVar.zzl++;
        this.zzA += j;
        this.zzB++;
    }

    @Override // com.google.android.gms.internal.ads.zzqq
    protected final void zzaa(zzaf zzafVar, MediaFormat mediaFormat) {
        zzql zzaj = zzaj();
        if (zzaj != null) {
            zzaj.zzq(this.zzo);
        }
        Objects.requireNonNull(mediaFormat);
        boolean z = false;
        if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            z = true;
        }
        this.zzC = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        this.zzD = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        this.zzF = zzafVar.zzv;
        if (zzen.zza >= 21) {
            int i = zzafVar.zzu;
            if (i == 90 || i == 270) {
                int i2 = this.zzC;
                this.zzC = this.zzD;
                this.zzD = i2;
                this.zzF = 1.0f / this.zzF;
            }
        } else {
            this.zzE = zzafVar.zzu;
        }
        this.zzf.zzc(zzafVar.zzt);
    }

    final void zzab() {
        this.zzr = true;
        if (this.zzp) {
            return;
        }
        this.zzp = true;
        this.zzg.zzq(this.zzl);
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzqq
    protected final void zzac() {
        this.zzp = false;
        int i = zzen.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzqq
    protected final void zzad(zzgi zzgiVar) throws zzha {
        this.zzx++;
        int i = zzen.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzqq
    protected final zzqm zzak(Throwable th, zzqn zzqnVar) {
        return new zzxe(th, zzqnVar, this.zzl);
    }

    @Override // com.google.android.gms.internal.ads.zzqq
    protected final void zzam(zzgi zzgiVar) throws zzha {
        if (this.zzk) {
            ByteBuffer byteBuffer = zzgiVar.zze;
            Objects.requireNonNull(byteBuffer);
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        zzql zzaj = zzaj();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        zzaj.zzp(bundle);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqq
    protected final void zzao(long j) {
        super.zzao(j);
        this.zzx--;
    }

    @Override // com.google.android.gms.internal.ads.zzqq
    protected final void zzaq() {
        super.zzaq();
        this.zzx = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzqq
    protected final boolean zzau(zzqn zzqnVar) {
        return this.zzl != null || zzaH(zzqnVar);
    }

    protected final void zzaw(zzql zzqlVar, int i, long j) {
        zzaD();
        int i2 = zzen.zza;
        Trace.beginSection("releaseOutputBuffer");
        zzqlVar.zzn(i, true);
        Trace.endSection();
        this.zzz = SystemClock.elapsedRealtime() * 1000;
        this.zza.zze++;
        this.zzw = 0;
        zzab();
    }

    protected final void zzax(zzql zzqlVar, int i, long j, long j2) {
        zzaD();
        int i2 = zzen.zza;
        Trace.beginSection("releaseOutputBuffer");
        zzqlVar.zzm(i, j2);
        Trace.endSection();
        this.zzz = SystemClock.elapsedRealtime() * 1000;
        this.zza.zze++;
        this.zzw = 0;
        zzab();
    }

    protected final void zzay(zzql zzqlVar, int i, long j) {
        int i2 = zzen.zza;
        Trace.beginSection("skipVideoBuffer");
        zzqlVar.zzn(i, false);
        Trace.endSection();
        this.zza.zzf++;
    }

    protected final void zzaz(int i, int i2) {
        zzgs zzgsVar = this.zza;
        zzgsVar.zzh += i;
        int i3 = i + i2;
        zzgsVar.zzg += i3;
        this.zzv += i3;
        int i4 = this.zzw + i3;
        this.zzw = i4;
        zzgsVar.zzi = Math.max(i4, zzgsVar.zzi);
    }

    @Override // com.google.android.gms.internal.ads.zzqq, com.google.android.gms.internal.ads.zzgr
    protected final void zzs() {
        this.zzG = null;
        this.zzp = false;
        int i = zzen.zza;
        this.zzn = false;
        try {
            super.zzs();
        } finally {
            this.zzg.zzc(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqq, com.google.android.gms.internal.ads.zzgr
    protected final void zzt(boolean z, boolean z2) throws zzha {
        super.zzt(z, z2);
        zzk();
        this.zzg.zze(this.zza);
        this.zzq = z2;
        this.zzr = false;
    }

    @Override // com.google.android.gms.internal.ads.zzqq, com.google.android.gms.internal.ads.zzgr
    protected final void zzu(long j, boolean z) throws zzha {
        super.zzu(j, z);
        this.zzp = false;
        int i = zzen.zza;
        this.zzf.zzf();
        this.zzy = -9223372036854775807L;
        this.zzs = -9223372036854775807L;
        this.zzw = 0;
        this.zzt = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzqq, com.google.android.gms.internal.ads.zzgr
    protected final void zzv() {
        try {
            super.zzv();
            if (this.zzm != null) {
                zzaF();
            }
        } catch (Throwable th) {
            if (this.zzm != null) {
                zzaF();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgr
    protected final void zzw() {
        this.zzv = 0;
        this.zzu = SystemClock.elapsedRealtime();
        this.zzz = SystemClock.elapsedRealtime() * 1000;
        this.zzA = 0L;
        this.zzB = 0;
        this.zzf.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzgr
    protected final void zzx() {
        this.zzt = -9223372036854775807L;
        if (this.zzv > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.zzg.zzd(this.zzv, elapsedRealtime - this.zzu);
            this.zzv = 0;
            this.zzu = elapsedRealtime;
        }
        int i = this.zzB;
        if (i != 0) {
            this.zzg.zzr(this.zzA, i);
            this.zzA = 0L;
            this.zzB = 0;
        }
        this.zzf.zzh();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v8, types: [android.view.Surface] */
    @Override // com.google.android.gms.internal.ads.zzgr, com.google.android.gms.internal.ads.zzjw
    public final void zzp(int i, Object obj) throws zzha {
        if (i != 1) {
            if (i == 7) {
                this.zzI = (zzxk) obj;
                return;
            }
            if (i == 10) {
                int intValue = ((Integer) obj).intValue();
                if (this.zzH != intValue) {
                    this.zzH = intValue;
                    return;
                }
                return;
            }
            if (i != 4) {
                if (i != 5) {
                    return;
                }
                this.zzf.zzj(((Integer) obj).intValue());
                return;
            } else {
                int intValue2 = ((Integer) obj).intValue();
                this.zzo = intValue2;
                zzql zzaj = zzaj();
                if (zzaj != null) {
                    zzaj.zzq(intValue2);
                    return;
                }
                return;
            }
        }
        zzxj zzxjVar = obj instanceof Surface ? (Surface) obj : null;
        if (zzxjVar == null) {
            zzxj zzxjVar2 = this.zzm;
            if (zzxjVar2 != null) {
                zzxjVar = zzxjVar2;
            } else {
                zzqn zzal = zzal();
                if (zzal != null && zzaH(zzal)) {
                    zzxjVar = zzxj.zza(this.zze, zzal.zzf);
                    this.zzm = zzxjVar;
                }
            }
        }
        if (this.zzl == zzxjVar) {
            if (zzxjVar == null || zzxjVar == this.zzm) {
                return;
            }
            zzaE();
            if (this.zzn) {
                this.zzg.zzq(this.zzl);
                return;
            }
            return;
        }
        this.zzl = zzxjVar;
        this.zzf.zzi(zzxjVar);
        this.zzn = false;
        int zzbe = zzbe();
        zzql zzaj2 = zzaj();
        if (zzaj2 != null) {
            if (zzen.zza < 23 || zzxjVar == null || this.zzj) {
                zzap();
                zzan();
            } else {
                zzaj2.zzo(zzxjVar);
            }
        }
        if (zzxjVar == null || zzxjVar == this.zzm) {
            this.zzG = null;
            this.zzp = false;
            int i2 = zzen.zza;
        } else {
            zzaE();
            this.zzp = false;
            int i3 = zzen.zza;
            if (zzbe == 2) {
                this.zzt = -9223372036854775807L;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a0, code lost:
    
        if (r16 > 100000) goto L46;
     */
    @Override // com.google.android.gms.internal.ads.zzqq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final boolean zzaf(long j, long j2, zzql zzqlVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzaf zzafVar) throws zzha {
        int i4;
        boolean z3;
        int zzd2;
        Objects.requireNonNull(zzqlVar);
        if (this.zzs == -9223372036854775807L) {
            this.zzs = j;
        }
        if (j3 != this.zzy) {
            this.zzf.zzd(j3);
            this.zzy = j3;
        }
        long zzai = zzai();
        long j4 = j3 - zzai;
        if (z && !z2) {
            zzay(zzqlVar, i, j4);
            return true;
        }
        float zzah = zzah();
        int zzbe = zzbe();
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        long j5 = (long) ((j3 - j) / zzah);
        if (zzbe == 2) {
            j5 -= elapsedRealtime - j2;
        }
        if (this.zzl == this.zzm) {
            if (!zzaG(j5)) {
                return false;
            }
            zzay(zzqlVar, i, j4);
            zzaA(j5);
            return true;
        }
        long j6 = elapsedRealtime - this.zzz;
        boolean z4 = this.zzr ? !this.zzp : zzbe == 2 || this.zzq;
        if (this.zzt == -9223372036854775807L && j >= zzai) {
            if (!z4) {
                i4 = 2;
                if (zzbe == 2) {
                    if (zzaG(j5)) {
                    }
                }
                if (zzbe != i4 && j != this.zzs) {
                    long nanoTime = System.nanoTime();
                    long zza = this.zzf.zza((j5 * 1000) + nanoTime);
                    long j7 = (zza - nanoTime) / 1000;
                    long j8 = this.zzt;
                    if (j7 < -500000 && !z2 && (zzd2 = zzd(j)) != 0) {
                        if (j8 != -9223372036854775807L) {
                            zzgs zzgsVar = this.zza;
                            zzgsVar.zzd += zzd2;
                            zzgsVar.zzf += this.zzx;
                        } else {
                            this.zza.zzj++;
                            zzaz(zzd2, this.zzx);
                        }
                        zzas();
                        return false;
                    }
                    if (zzaG(j7) && !z2) {
                        if (j8 != -9223372036854775807L) {
                            zzay(zzqlVar, i, j4);
                            z3 = true;
                        } else {
                            int i5 = zzen.zza;
                            Trace.beginSection("dropVideoBuffer");
                            zzqlVar.zzn(i, false);
                            Trace.endSection();
                            z3 = true;
                            zzaz(0, 1);
                        }
                        zzaA(j7);
                        return z3;
                    }
                    if (zzen.zza >= 21) {
                        if (j7 >= 50000) {
                            return false;
                        }
                        zzax(zzqlVar, i, j4, zza);
                        zzaA(j7);
                        return true;
                    }
                    if (j7 >= WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                        return false;
                    }
                    if (j7 > 11000) {
                        try {
                            Thread.sleep(((-10000) + j7) / 1000);
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            return false;
                        }
                    }
                    zzaw(zzqlVar, i, j4);
                    zzaA(j7);
                    return true;
                }
            }
            long nanoTime2 = System.nanoTime();
            if (zzen.zza >= 21) {
                zzax(zzqlVar, i, j4, nanoTime2);
            } else {
                zzaw(zzqlVar, i, j4);
            }
            zzaA(j5);
            return true;
        }
        i4 = 2;
        return zzbe != i4 ? false : false;
    }
}
