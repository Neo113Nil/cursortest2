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
import androidx.core.app.NotificationManagerCompat;
import androidx.work.WorkRequest;
import com.facebook.ads.AdError;
import com.google.android.gms.common.Scopes;
import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.text.Typography;
import org.apache.commons.io.IOUtils;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.signature.SignatureVisitor;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzaaa extends zzso implements zzaag {
    private static final int[] zzb = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean zzc;
    private static boolean zzd;
    private zzcp zzA;
    private zzcp zzB;
    private boolean zzC;
    private int zzD;
    private int zzE;
    private zzaae zzF;
    private final Context zze;
    private final zzabc zzf;
    private final zzaax zzg;
    private final boolean zzh;
    private final zzaah zzi;
    private final zzaaf zzj;
    private boolean zzk;
    private boolean zzl;
    private zzzz zzm;
    private boolean zzn;
    private boolean zzo;
    private Surface zzp;
    private zzaad zzq;
    private boolean zzr;
    private int zzs;
    private long zzt;
    private int zzu;
    private int zzv;
    private int zzw;
    private long zzx;
    private int zzy;
    private long zzz;

    public zzaaa(Context context, zzsa zzsaVar, zzsq zzsqVar, long j, boolean z, Handler handler, zzaay zzaayVar, int i, float f) {
        super(2, zzsaVar, zzsqVar, false, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.zze = applicationContext;
        this.zzg = new zzaax(handler, zzaayVar);
        zzzt zzc2 = new zzzg(applicationContext, new zzaah(applicationContext, this, 0L)).zzc();
        this.zzf = zzc2.zzi();
        zzaah zzh = zzc2.zzh();
        zzdi.zzb(zzh);
        this.zzi = zzh;
        this.zzj = new zzaaf();
        this.zzh = "NVIDIA".equals(zzet.zzc);
        this.zzs = 1;
        this.zzA = zzcp.zza;
        this.zzE = 0;
        this.zzB = null;
        this.zzD = NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x04c4, code lost:
    
        if (r13.equals("deb") != false) goto L506;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x07a1, code lost:
    
        if (r0.equals("JSN-L21") == false) goto L514;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected static final boolean zzaS(String str) {
        char c;
        char c2;
        boolean z = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (zzaaa.class) {
            if (!zzc) {
                char c3 = 28;
                if (zzet.zza <= 28) {
                    String str2 = zzet.zzb;
                    switch (str2.hashCode()) {
                        case -1339091551:
                            if (str2.equals("dangal")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1220081023:
                            if (str2.equals("dangalFHD")) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1220066608:
                            if (str2.equals("dangalUHD")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1012436106:
                            if (str2.equals("oneday")) {
                                c2 = 7;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -760312546:
                            if (str2.equals("aquaman")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -64886864:
                            if (str2.equals("magnolia")) {
                                c2 = 4;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 3415681:
                            if (str2.equals("once")) {
                                c2 = 6;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 825323514:
                            if (str2.equals("machuca")) {
                                c2 = 5;
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    switch (c2) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            z = true;
                            break;
                    }
                    zzd = z;
                    zzc = true;
                }
                if (zzet.zza > 27 || !"HWEML".equals(zzet.zzb)) {
                    String str3 = zzet.zzd;
                    switch (str3.hashCode()) {
                        case -349662828:
                            if (str3.equals("AFTJMST12")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case -321033677:
                            if (str3.equals("AFTKMST12")) {
                                c = 7;
                                break;
                            }
                            c = 65535;
                            break;
                        case 2006354:
                            if (str3.equals("AFTA")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 2006367:
                            if (str3.equals("AFTN")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 2006371:
                            if (str3.equals("AFTR")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1785421873:
                            if (str3.equals("AFTEU011")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1785421876:
                            if (str3.equals("AFTEU014")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1798172390:
                            if (str3.equals("AFTSO001")) {
                                c = '\b';
                                break;
                            }
                            c = 65535;
                            break;
                        case 2119412532:
                            if (str3.equals("AFTEUFF014")) {
                                c = 5;
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
                            if (zzet.zza <= 26) {
                                String str4 = zzet.zzb;
                                switch (str4.hashCode()) {
                                    case -2144781245:
                                        if (str4.equals("GIONEE_SWW1609")) {
                                            c3 = '6';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -2144781185:
                                        if (str4.equals("GIONEE_SWW1627")) {
                                            c3 = '7';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -2144781160:
                                        if (str4.equals("GIONEE_SWW1631")) {
                                            c3 = '8';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -2097309513:
                                        if (str4.equals("K50a40")) {
                                            c3 = 'J';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -2022874474:
                                        if (str4.equals("CP8676_I02")) {
                                            c3 = 22;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1978993182:
                                        if (str4.equals("NX541J")) {
                                            c3 = 'Y';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1978990237:
                                        if (str4.equals("NX573J")) {
                                            c3 = 'Z';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1936688988:
                                        if (str4.equals("PGN528")) {
                                            c3 = 'e';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1936688066:
                                        if (str4.equals("PGN610")) {
                                            c3 = 'f';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1936688065:
                                        if (str4.equals("PGN611")) {
                                            c3 = 'g';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1931988508:
                                        if (str4.equals("AquaPowerM")) {
                                            c3 = '\r';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1885099851:
                                        if (str4.equals("RAIJIN")) {
                                            c3 = 't';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1696512866:
                                        if (str4.equals("XT1663")) {
                                            c3 = 137;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1680025915:
                                        if (str4.equals("ComioS1")) {
                                            c3 = 21;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1615810839:
                                        if (str4.equals("Phantom6")) {
                                            c3 = 'h';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1600724499:
                                        if (str4.equals("pacificrim")) {
                                            c3 = '_';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1554255044:
                                        if (str4.equals("vernee_M5")) {
                                            c3 = 130;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1481772737:
                                        if (str4.equals("panell_dl")) {
                                            c3 = 'a';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1481772730:
                                        if (str4.equals("panell_ds")) {
                                            c3 = 'b';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1481772729:
                                        if (str4.equals("panell_dt")) {
                                            c3 = 'c';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1320080169:
                                        if (str4.equals("GiONEE_GBL7319")) {
                                            c3 = '4';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1217592143:
                                        if (str4.equals("BRAVIA_ATV2")) {
                                            c3 = 18;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1180384755:
                                        if (str4.equals("iris60")) {
                                            c3 = 'F';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1139198265:
                                        if (str4.equals("Slate_Pro")) {
                                            c3 = 'v';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1052835013:
                                        if (str4.equals("namath")) {
                                            c3 = 'W';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -993250464:
                                        if (str4.equals("A10-70F")) {
                                            c3 = 5;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -993250458:
                                        if (str4.equals("A10-70L")) {
                                            c3 = 6;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -965403638:
                                        if (str4.equals("s905x018")) {
                                            c3 = 'x';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -958336948:
                                        if (str4.equals("ELUGA_Ray_X")) {
                                            c3 = Typography.quote;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -879245230:
                                        if (str4.equals("tcl_eu")) {
                                            c3 = '~';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -842500323:
                                        if (str4.equals("nicklaus_f")) {
                                            c3 = 'X';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -821392978:
                                        if (str4.equals("A7000-a")) {
                                            c3 = '\t';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -797483286:
                                        if (str4.equals("SVP-DTV15")) {
                                            c3 = 'w';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -794946968:
                                        if (str4.equals("watson")) {
                                            c3 = 131;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -788334647:
                                        if (str4.equals("whyred")) {
                                            c3 = 132;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -782144577:
                                        if (str4.equals("OnePlus5T")) {
                                            c3 = '[';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -575125681:
                                        if (str4.equals("GiONEE_CBL7513")) {
                                            c3 = '3';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -521118391:
                                        if (str4.equals("GIONEE_GBL7360")) {
                                            c3 = '5';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -430914369:
                                        if (str4.equals("Pixi4-7_3G")) {
                                            c3 = 'i';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -290434366:
                                        if (str4.equals("taido_row")) {
                                            c3 = 'y';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -282781963:
                                        if (str4.equals("BLACK-1X")) {
                                            c3 = 17;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -277133239:
                                        if (str4.equals("Z12_PRO")) {
                                            c3 = 138;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -173639913:
                                        if (str4.equals("ELUGA_A3_Pro")) {
                                            c3 = 31;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -56598463:
                                        if (str4.equals("woods_fn")) {
                                            c3 = 134;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2126:
                                        if (str4.equals("C1")) {
                                            c3 = 20;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2564:
                                        if (str4.equals("Q5")) {
                                            c3 = 'q';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2715:
                                        if (str4.equals("V1")) {
                                            c3 = Ascii.MAX;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2719:
                                        if (str4.equals("V5")) {
                                            c3 = 129;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 3091:
                                        if (str4.equals("b5")) {
                                            c3 = 16;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 3483:
                                        if (str4.equals("mh")) {
                                            c3 = 'T';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 73405:
                                        if (str4.equals("JGZ")) {
                                            c3 = 'I';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 75537:
                                        if (str4.equals("M04")) {
                                            c3 = 'O';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 75739:
                                        if (str4.equals("M5c")) {
                                            c3 = 'P';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 76779:
                                        if (str4.equals("MX6")) {
                                            c3 = 'V';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 78669:
                                        if (str4.equals("P85")) {
                                            c3 = '^';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 79305:
                                        if (str4.equals("PLE")) {
                                            c3 = 'k';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 80618:
                                        if (str4.equals("QX1")) {
                                            c3 = 's';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 88274:
                                        if (str4.equals("Z80")) {
                                            c3 = 139;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 98846:
                                        if (str4.equals("cv1")) {
                                            c3 = 26;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 98848:
                                        if (str4.equals("cv3")) {
                                            c3 = 27;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 99329:
                                        break;
                                    case 101481:
                                        if (str4.equals("flo")) {
                                            c3 = '1';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1513190:
                                        if (str4.equals("1601")) {
                                            c3 = 0;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1514184:
                                        if (str4.equals("1713")) {
                                            c3 = 1;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1514185:
                                        if (str4.equals("1714")) {
                                            c3 = 2;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2133089:
                                        if (str4.equals("F01H")) {
                                            c3 = Typography.dollar;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2133091:
                                        if (str4.equals("F01J")) {
                                            c3 = '%';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2133120:
                                        if (str4.equals("F02H")) {
                                            c3 = Typography.amp;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2133151:
                                        if (str4.equals("F03H")) {
                                            c3 = '\'';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2133182:
                                        if (str4.equals("F04H")) {
                                            c3 = '(';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2133184:
                                        if (str4.equals("F04J")) {
                                            c3 = ')';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2436959:
                                        if (str4.equals("P681")) {
                                            c3 = ']';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2463773:
                                        if (str4.equals("Q350")) {
                                            c3 = 'm';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2464648:
                                        if (str4.equals("Q427")) {
                                            c3 = 'o';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2689555:
                                        if (str4.equals("XE2X")) {
                                            c3 = 136;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 3154429:
                                        if (str4.equals("fugu")) {
                                            c3 = '2';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 3284551:
                                        if (str4.equals("kate")) {
                                            c3 = 'K';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 3351335:
                                        if (str4.equals("mido")) {
                                            c3 = 'U';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 3386211:
                                        if (str4.equals("p212")) {
                                            c3 = IOUtils.DIR_SEPARATOR_WINDOWS;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 41325051:
                                        if (str4.equals("MEIZU_M5")) {
                                            c3 = 'S';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 51349633:
                                        if (str4.equals("601LV")) {
                                            c3 = 3;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 51350594:
                                        if (str4.equals("602LV")) {
                                            c3 = 4;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 55178625:
                                        if (str4.equals("Aura_Note_2")) {
                                            c3 = 15;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 61542055:
                                        if (str4.equals("A1601")) {
                                            c3 = 7;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 65355429:
                                        if (str4.equals("E5643")) {
                                            c3 = 30;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 66214468:
                                        if (str4.equals("F3111")) {
                                            c3 = '*';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 66214470:
                                        if (str4.equals("F3113")) {
                                            c3 = SignatureVisitor.EXTENDS;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 66214473:
                                        if (str4.equals("F3116")) {
                                            c3 = ',';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 66215429:
                                        if (str4.equals("F3211")) {
                                            c3 = SignatureVisitor.SUPER;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 66215431:
                                        if (str4.equals("F3213")) {
                                            c3 = '.';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 66215433:
                                        if (str4.equals("F3215")) {
                                            c3 = IOUtils.DIR_SEPARATOR_UNIX;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 66216390:
                                        if (str4.equals("F3311")) {
                                            c3 = '0';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 76402249:
                                        if (str4.equals("PRO7S")) {
                                            c3 = 'l';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 76404105:
                                        if (str4.equals("Q4260")) {
                                            c3 = 'n';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 76404911:
                                        if (str4.equals("Q4310")) {
                                            c3 = 'p';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 80963634:
                                        if (str4.equals("V23GB")) {
                                            c3 = 128;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 82882791:
                                        if (str4.equals("X3_HK")) {
                                            c3 = 135;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 98715550:
                                        if (str4.equals("i9031")) {
                                            c3 = 'C';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 101370885:
                                        if (str4.equals("l5460")) {
                                            c3 = 'L';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 102844228:
                                        if (str4.equals("le_x6")) {
                                            c3 = 'M';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 165221241:
                                        if (str4.equals("A2016a40")) {
                                            c3 = '\b';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 182191441:
                                        if (str4.equals("CPY83_I00")) {
                                            c3 = 25;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 245388979:
                                        if (str4.equals("marino_f")) {
                                            c3 = 'R';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 287431619:
                                        if (str4.equals("griffin")) {
                                            c3 = Typography.less;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 307593612:
                                        if (str4.equals("A7010a48")) {
                                            c3 = 11;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 308517133:
                                        if (str4.equals("A7020a48")) {
                                            c3 = '\f';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 316215098:
                                        if (str4.equals("TB3-730F")) {
                                            c3 = 'z';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 316215116:
                                        if (str4.equals("TB3-730X")) {
                                            c3 = '{';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 316246811:
                                        if (str4.equals("TB3-850F")) {
                                            c3 = '|';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 316246818:
                                        if (str4.equals("TB3-850M")) {
                                            c3 = '}';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 407160593:
                                        if (str4.equals("Pixi5-10_4G")) {
                                            c3 = 'j';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 507412548:
                                        if (str4.equals("QM16XE_U")) {
                                            c3 = 'r';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 793982701:
                                        if (str4.equals("GIONEE_WBL5708")) {
                                            c3 = '9';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 794038622:
                                        if (str4.equals("GIONEE_WBL7365")) {
                                            c3 = ':';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 794040393:
                                        if (str4.equals("GIONEE_WBL7519")) {
                                            c3 = ';';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 835649806:
                                        if (str4.equals("manning")) {
                                            c3 = 'Q';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 917340916:
                                        if (str4.equals("A7000plus")) {
                                            c3 = '\n';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 958008161:
                                        if (str4.equals("j2xlteins")) {
                                            c3 = 'H';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1060579533:
                                        if (str4.equals("panell_d")) {
                                            c3 = '`';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1150207623:
                                        if (str4.equals("LS-5017")) {
                                            c3 = 'N';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1176899427:
                                        if (str4.equals("itel_S41")) {
                                            c3 = 'G';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1280332038:
                                        if (str4.equals("hwALE-H")) {
                                            c3 = Typography.greater;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1306947716:
                                        if (str4.equals("EverStar_S")) {
                                            c3 = '#';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1349174697:
                                        if (str4.equals("htc_e56ml_dtul")) {
                                            c3 = SignatureVisitor.INSTANCEOF;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1522194893:
                                        if (str4.equals("woods_f")) {
                                            c3 = 133;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1691543273:
                                        if (str4.equals("CPH1609")) {
                                            c3 = 23;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1691544261:
                                        if (str4.equals("CPH1715")) {
                                            c3 = 24;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1709443163:
                                        if (str4.equals("iball8735_9806")) {
                                            c3 = 'D';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1865889110:
                                        if (str4.equals("santoni")) {
                                            c3 = 'u';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1906253259:
                                        if (str4.equals("PB2-670M")) {
                                            c3 = 'd';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1977196784:
                                        if (str4.equals("Infinix-X572")) {
                                            c3 = 'E';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2006372676:
                                        if (str4.equals("BRAVIA_ATV3_4K")) {
                                            c3 = 19;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2019281702:
                                        if (str4.equals("DM-01K")) {
                                            c3 = 29;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2029784656:
                                        if (str4.equals("HWBLN-H")) {
                                            c3 = '?';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2030379515:
                                        if (str4.equals("HWCAM-H")) {
                                            c3 = '@';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2033393791:
                                        if (str4.equals("ASUS_X00AD_2")) {
                                            c3 = 14;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2047190025:
                                        if (str4.equals("ELUGA_Note")) {
                                            c3 = ' ';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2047252157:
                                        if (str4.equals("ELUGA_Prim")) {
                                            c3 = '!';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2048319463:
                                        if (str4.equals("HWVNS-H")) {
                                            c3 = 'A';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2048855701:
                                        if (str4.equals("HWWAS-H")) {
                                            c3 = 'B';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    default:
                                        c3 = 65535;
                                        break;
                                }
                                switch (c3) {
                                    default:
                                        if (str3.hashCode() == -594534941) {
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
                                    case 127:
                                    case 128:
                                    case Opcodes.LOR /* 129 */:
                                    case 130:
                                    case Opcodes.LXOR /* 131 */:
                                    case Opcodes.IINC /* 132 */:
                                    case Opcodes.I2L /* 133 */:
                                    case Opcodes.I2F /* 134 */:
                                    case Opcodes.I2D /* 135 */:
                                    case Opcodes.L2I /* 136 */:
                                    case Opcodes.L2F /* 137 */:
                                    case Opcodes.L2D /* 138 */:
                                    case Opcodes.F2I /* 139 */:
                                        break;
                                }
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
                            break;
                    }
                    zzd = z;
                    zzc = true;
                }
                z = true;
                zzd = z;
                zzc = true;
            }
        }
        return zzd;
    }

    private static List zzaT(Context context, zzsq zzsqVar, zzaf zzafVar, boolean z, boolean z2) throws zzsw {
        if (zzafVar.zzm == null) {
            return zzfxr.zzm();
        }
        if (zzet.zza >= 26 && "video/dolby-vision".equals(zzafVar.zzm) && !zzzy.zza(context)) {
            List zzd2 = zztc.zzd(zzsqVar, zzafVar, z, z2);
            if (!zzd2.isEmpty()) {
                return zzd2;
            }
        }
        return zztc.zzf(zzsqVar, zzafVar, z, z2);
    }

    private final void zzaU() {
        zzcp zzcpVar = this.zzB;
        if (zzcpVar != null) {
            this.zzg.zzt(zzcpVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresNonNull({"displaySurface"})
    public final void zzaV() {
        this.zzg.zzq(this.zzp);
        this.zzr = true;
    }

    private final void zzaW() {
        Surface surface = this.zzp;
        zzaad zzaadVar = this.zzq;
        if (surface == zzaadVar) {
            this.zzp = null;
        }
        if (zzaadVar != null) {
            zzaadVar.release();
            this.zzq = null;
        }
    }

    private final boolean zzaX(zzsf zzsfVar) {
        if (zzet.zza < 23 || zzaS(zzsfVar.zza)) {
            return false;
        }
        return !zzsfVar.zzf || zzaad.zzb(this.zze);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0075, code lost:
    
        if (r3.equals("video/av01") != false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zzad(zzsf zzsfVar, zzaf zzafVar) {
        int intValue;
        int i = zzafVar.zzr;
        int i2 = zzafVar.zzs;
        if (i != -1 && i2 != -1) {
            String str = zzafVar.zzm;
            str.getClass();
            char c = 2;
            if ("video/dolby-vision".equals(str)) {
                Pair zza = zztc.zza(zzafVar);
                str = (zza == null || !((intValue = ((Integer) zza.first).intValue()) == 512 || intValue == 1 || intValue == 2)) ? "video/hevc" : "video/avc";
            }
            int i3 = 4;
            switch (str.hashCode()) {
                case -1664118616:
                    if (str.equals("video/3gpp")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1662735862:
                    break;
                case -1662541442:
                    if (str.equals("video/hevc")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1187890754:
                    if (str.equals("video/mp4v-es")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1331836730:
                    if (str.equals("video/avc")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1599127256:
                    if (str.equals("video/x-vnd.on2.vp8")) {
                        c = 3;
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
                case 2:
                case 3:
                    return ((i * i2) * 3) / i3;
                case 4:
                    return Math.max(2097152, ((i * i2) * 3) / 4);
                case 5:
                    if (!"BRAVIA 4K 2015".equals(zzet.zzd) && (!"Amazon".equals(zzet.zzc) || (!"KFSOWI".equals(zzet.zzd) && (!"AFTS".equals(zzet.zzd) || !zzsfVar.zzf)))) {
                        return ((((i + 15) / 16) * ((i2 + 15) / 16)) * 768) / 4;
                    }
                    break;
                case 6:
                    i3 = 8;
                    return ((i * i2) * 3) / i3;
            }
        }
        return -1;
    }

    protected static int zzae(zzsf zzsfVar, zzaf zzafVar) {
        if (zzafVar.zzn == -1) {
            return zzad(zzsfVar, zzafVar);
        }
        int size = zzafVar.zzo.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((byte[]) zzafVar.zzo.get(i2)).length;
        }
        return zzafVar.zzn + i;
    }

    @Override // com.google.android.gms.internal.ads.zzhm
    protected final void zzA() {
        ((zzzr) this.zzf).zza.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzso, com.google.android.gms.internal.ads.zzhm
    protected final void zzC() {
        try {
            super.zzC();
            this.zzl = false;
            if (this.zzq != null) {
                zzaW();
            }
        } catch (Throwable th) {
            this.zzl = false;
            if (this.zzq != null) {
                zzaW();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhm
    protected final void zzD() {
        zzaah zzaahVar;
        this.zzu = 0;
        zzh();
        this.zzt = SystemClock.elapsedRealtime();
        this.zzx = 0L;
        this.zzy = 0;
        if (!this.zzk) {
            this.zzi.zzg();
        } else {
            zzaahVar = ((zzzr) this.zzf).zza.zzd;
            zzaahVar.zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhm
    protected final void zzE() {
        zzaah zzaahVar;
        if (this.zzu > 0) {
            zzh();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.zzg.zzd(this.zzu, elapsedRealtime - this.zzt);
            this.zzu = 0;
            this.zzt = elapsedRealtime;
        }
        int i = this.zzy;
        if (i != 0) {
            this.zzg.zzr(this.zzx, i);
            this.zzx = 0L;
            this.zzy = 0;
        }
        if (!this.zzk) {
            this.zzi.zzh();
        } else {
            zzaahVar = ((zzzr) this.zzf).zza.zzd;
            zzaahVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzso, com.google.android.gms.internal.ads.zzhm, com.google.android.gms.internal.ads.zzle
    public final void zzM(float f, float f2) throws zzhw {
        super.zzM(f, f2);
        this.zzi.zzm(f);
        if (this.zzk) {
            ((zzzr) this.zzf).zza.zze.zzd(f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzle, com.google.android.gms.internal.ads.zzlh
    public final String zzU() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzso, com.google.android.gms.internal.ads.zzle
    public final void zzV(long j, long j2) throws zzhw {
        super.zzV(j, j2);
        if (this.zzk) {
            try {
                this.zzf.zzg(j, j2);
            } catch (zzabb e) {
                throw zzi(e, e.zza, false, AdError.SHOW_CALLED_BEFORE_LOAD_ERROR_CODE);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzso, com.google.android.gms.internal.ads.zzle
    public final boolean zzW() {
        return super.zzW() && !this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzso, com.google.android.gms.internal.ads.zzle
    public final boolean zzX() {
        zzaad zzaadVar;
        boolean z = false;
        if (super.zzX() && !this.zzk) {
            z = true;
        }
        if (!z || (((zzaadVar = this.zzq) == null || this.zzp != zzaadVar) && zzay() != null)) {
            return this.zzi.zzn(z);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzso
    protected final float zzZ(float f, zzaf zzafVar, zzaf[] zzafVarArr) {
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

    @Override // com.google.android.gms.internal.ads.zzso
    protected final void zzaC(long j) {
        super.zzaC(j);
        this.zzw--;
    }

    @Override // com.google.android.gms.internal.ads.zzso
    protected final void zzaD(zzhd zzhdVar) throws zzhw {
        this.zzw++;
        int i = zzet.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzso
    protected final void zzaE(zzaf zzafVar) throws zzhw {
        if (this.zzk) {
            try {
                zzabc zzabcVar = this.zzf;
                zzzt.zzd(((zzzr) zzabcVar).zza, zzafVar, zzh());
                this.zzf.zzh(new zzzx(this), zzgda.zzb());
            } catch (zzabb e) {
                throw zzi(e, zzafVar, false, 7000);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzso
    protected final void zzaG() {
        super.zzaG();
        this.zzw = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzso
    protected final boolean zzaM(zzsf zzsfVar) {
        return this.zzp != null || zzaX(zzsfVar);
    }

    protected final void zzaO(zzsc zzscVar, int i, long j) {
        Trace.beginSection("skipVideoBuffer");
        zzscVar.zzn(i, false);
        Trace.endSection();
        this.zza.zzf++;
    }

    protected final void zzaP(int i, int i2) {
        zzhn zzhnVar = this.zza;
        zzhnVar.zzh += i;
        int i3 = i + i2;
        zzhnVar.zzg += i3;
        this.zzu += i3;
        int i4 = this.zzv + i3;
        this.zzv = i4;
        zzhnVar.zzi = Math.max(i4, zzhnVar.zzi);
    }

    protected final void zzaQ(long j) {
        zzhn zzhnVar = this.zza;
        zzhnVar.zzk += j;
        zzhnVar.zzl++;
        this.zzx += j;
        this.zzy++;
    }

    protected final boolean zzaR(long j, boolean z) throws zzhw {
        int zzd2 = zzd(j);
        if (zzd2 == 0) {
            return false;
        }
        if (z) {
            zzhn zzhnVar = this.zza;
            zzhnVar.zzd += zzd2;
            zzhnVar.zzf += this.zzw;
        } else {
            this.zza.zzj++;
            zzaP(zzd2, this.zzw);
        }
        zzaI();
        if (this.zzk) {
            this.zzf.zze();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzso
    protected final int zzaa(zzsq zzsqVar, zzaf zzafVar) throws zzsw {
        boolean z;
        if (!zzbn.zzi(zzafVar.zzm)) {
            return 128;
        }
        int i = 1;
        int i2 = 0;
        boolean z2 = zzafVar.zzp != null;
        List zzaT = zzaT(this.zze, zzsqVar, zzafVar, z2, false);
        if (z2 && zzaT.isEmpty()) {
            zzaT = zzaT(this.zze, zzsqVar, zzafVar, false, false);
        }
        if (!zzaT.isEmpty()) {
            if (zzaN(zzafVar)) {
                zzsf zzsfVar = (zzsf) zzaT.get(0);
                boolean zze = zzsfVar.zze(zzafVar);
                if (!zze) {
                    for (int i3 = 1; i3 < zzaT.size(); i3++) {
                        zzsf zzsfVar2 = (zzsf) zzaT.get(i3);
                        if (zzsfVar2.zze(zzafVar)) {
                            zzsfVar = zzsfVar2;
                            z = false;
                            zze = true;
                            break;
                        }
                    }
                }
                z = true;
                int i4 = true != zze ? 3 : 4;
                int i5 = true != zzsfVar.zzf(zzafVar) ? 8 : 16;
                int i6 = true != zzsfVar.zzg ? 0 : 64;
                int i7 = true != z ? 0 : 128;
                if (zzet.zza >= 26 && "video/dolby-vision".equals(zzafVar.zzm) && !zzzy.zza(this.zze)) {
                    i7 = 256;
                }
                if (zze) {
                    List zzaT2 = zzaT(this.zze, zzsqVar, zzafVar, z2, true);
                    if (!zzaT2.isEmpty()) {
                        zzsf zzsfVar3 = (zzsf) zztc.zzg(zzaT2, zzafVar).get(0);
                        if (zzsfVar3.zze(zzafVar) && zzsfVar3.zzf(zzafVar)) {
                            i2 = 32;
                        }
                    }
                }
                return i4 | i5 | i2 | i6 | i7;
            }
            i = 2;
        }
        return i | 128;
    }

    @Override // com.google.android.gms.internal.ads.zzso
    protected final zzho zzab(zzsf zzsfVar, zzaf zzafVar, zzaf zzafVar2) {
        int i;
        int i2;
        zzho zzb2 = zzsfVar.zzb(zzafVar, zzafVar2);
        int i3 = zzb2.zze;
        zzzz zzzzVar = this.zzm;
        zzzzVar.getClass();
        if (zzafVar2.zzr > zzzzVar.zza || zzafVar2.zzs > zzzzVar.zzb) {
            i3 |= 256;
        }
        if (zzae(zzsfVar, zzafVar2) > zzzzVar.zzc) {
            i3 |= 64;
        }
        String str = zzsfVar.zza;
        if (i3 != 0) {
            i2 = i3;
            i = 0;
        } else {
            i = zzb2.zzd;
            i2 = 0;
        }
        return new zzho(str, zzafVar, zzafVar2, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzso
    protected final zzho zzac(zzjz zzjzVar) throws zzhw {
        zzho zzac = super.zzac(zzjzVar);
        zzaf zzafVar = zzjzVar.zza;
        zzafVar.getClass();
        this.zzg.zzf(zzafVar, zzac);
        return zzac;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01f4  */
    @Override // com.google.android.gms.internal.ads.zzso
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final zzrz zzaf(zzsf zzsfVar, zzaf zzafVar, MediaCrypto mediaCrypto, float f) {
        String str;
        Point point;
        int i;
        int i2;
        boolean z;
        MediaFormat mediaFormat;
        float f2;
        zzo zzoVar;
        int i3;
        boolean z2;
        Pair zza;
        int zzad;
        zzaad zzaadVar = this.zzq;
        if (zzaadVar != null) {
            if (zzaadVar.zza != zzsfVar.zzf) {
                zzaW();
            }
        }
        String str2 = zzsfVar.zzc;
        zzaf[] zzT = zzT();
        int i4 = zzafVar.zzr;
        int i5 = zzafVar.zzs;
        int zzae = zzae(zzsfVar, zzafVar);
        int length = zzT.length;
        if (length != 1) {
            boolean z3 = false;
            for (int i6 = 0; i6 < length; i6++) {
                zzaf zzafVar2 = zzT[i6];
                if (zzafVar.zzy != null && zzafVar2.zzy == null) {
                    zzad zzb2 = zzafVar2.zzb();
                    zzb2.zzA(zzafVar.zzy);
                    zzafVar2 = zzb2.zzad();
                }
                if (zzsfVar.zzb(zzafVar, zzafVar2).zzd != 0) {
                    int i7 = zzafVar2.zzr;
                    z3 |= i7 == -1 || zzafVar2.zzs == -1;
                    i4 = Math.max(i4, i7);
                    i5 = Math.max(i5, zzafVar2.zzs);
                    zzae = Math.max(zzae, zzae(zzsfVar, zzafVar2));
                }
            }
            if (z3) {
                zzea.zzf("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i4 + "x" + i5);
                int i8 = zzafVar.zzs;
                int i9 = zzafVar.zzr;
                boolean z4 = i8 > i9;
                int i10 = z4 ? i8 : i9;
                if (true == z4) {
                    i8 = i9;
                }
                int[] iArr = zzb;
                int i11 = 0;
                while (true) {
                    if (i11 >= 9) {
                        str = str2;
                        break;
                    }
                    float f3 = i8;
                    float f4 = i10;
                    str = str2;
                    int i12 = iArr[i11];
                    int[] iArr2 = iArr;
                    float f5 = i12;
                    if (i12 <= i10 || (i = (int) (f5 * (f3 / f4))) <= i8) {
                        break;
                    }
                    int i13 = zzet.zza;
                    int i14 = true != z4 ? i12 : i;
                    if (true != z4) {
                        i12 = i;
                    }
                    point = zzsfVar.zza(i14, i12);
                    float f6 = zzafVar.zzt;
                    if (point != null) {
                        i2 = i8;
                        if (zzsfVar.zzg(point.x, point.y, f6)) {
                            break;
                        }
                    } else {
                        i2 = i8;
                    }
                    i11++;
                    str2 = str;
                    iArr = iArr2;
                    i8 = i2;
                }
                point = null;
                if (point != null) {
                    i4 = Math.max(i4, point.x);
                    i5 = Math.max(i5, point.y);
                    zzad zzb3 = zzafVar.zzb();
                    zzb3.zzac(i4);
                    zzb3.zzI(i5);
                    zzae = Math.max(zzae, zzad(zzsfVar, zzb3.zzad()));
                    zzea.zzf("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i4 + "x" + i5);
                }
                zzzz zzzzVar = new zzzz(i4, i5, zzae);
                this.zzm = zzzzVar;
                z = this.zzh;
                mediaFormat = new MediaFormat();
                mediaFormat.setString("mime", str);
                mediaFormat.setInteger("width", zzafVar.zzr);
                mediaFormat.setInteger("height", zzafVar.zzs);
                zzed.zzb(mediaFormat, zzafVar.zzo);
                f2 = zzafVar.zzt;
                if (f2 != -1.0f) {
                    mediaFormat.setFloat("frame-rate", f2);
                }
                zzed.zza(mediaFormat, "rotation-degrees", zzafVar.zzu);
                zzoVar = zzafVar.zzy;
                if (zzoVar != null) {
                    zzed.zza(mediaFormat, "color-transfer", zzoVar.zzd);
                    zzed.zza(mediaFormat, "color-standard", zzoVar.zzb);
                    zzed.zza(mediaFormat, "color-range", zzoVar.zzc);
                    byte[] bArr = zzoVar.zze;
                    if (bArr != null) {
                        mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
                    }
                }
                if ("video/dolby-vision".equals(zzafVar.zzm) && (zza = zztc.zza(zzafVar)) != null) {
                    zzed.zza(mediaFormat, Scopes.PROFILE, ((Integer) zza.first).intValue());
                }
                mediaFormat.setInteger("max-width", zzzzVar.zza);
                mediaFormat.setInteger("max-height", zzzzVar.zzb);
                zzed.zza(mediaFormat, "max-input-size", zzzzVar.zzc);
                if (zzet.zza >= 23) {
                    mediaFormat.setInteger("priority", 0);
                    if (f != -1.0f) {
                        mediaFormat.setFloat("operating-rate", f);
                    }
                }
                if (z) {
                    i3 = 0;
                } else {
                    mediaFormat.setInteger("no-post-process", 1);
                    i3 = 0;
                    mediaFormat.setInteger("auto-frc", 0);
                }
                if (zzet.zza >= 35) {
                    mediaFormat.setInteger("importance", Math.max(i3, -this.zzD));
                }
                if (this.zzp == null) {
                    if (!zzaX(zzsfVar)) {
                        throw new IllegalStateException();
                    }
                    if (this.zzq == null) {
                        this.zzq = zzaad.zza(this.zze, zzsfVar.zzf);
                    }
                    this.zzp = this.zzq;
                }
                if (this.zzk || this.zzf.zzk()) {
                    z2 = false;
                } else {
                    z2 = false;
                    mediaFormat.setInteger("allow-frame-drop", 0);
                }
                if (this.zzk) {
                    return zzrz.zzb(zzsfVar, mediaFormat, zzafVar, this.zzp, null);
                }
                zzcn zzcnVar = null;
                zzdi.zzf(z2);
                zzdi.zzb(null);
                zzcnVar.zzb();
                throw null;
            }
        } else if (zzae != -1 && (zzad = zzad(zzsfVar, zzafVar)) != -1) {
            zzae = Math.min((int) (zzae * 1.5f), zzad);
        }
        str = str2;
        zzzz zzzzVar2 = new zzzz(i4, i5, zzae);
        this.zzm = zzzzVar2;
        z = this.zzh;
        mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", zzafVar.zzr);
        mediaFormat.setInteger("height", zzafVar.zzs);
        zzed.zzb(mediaFormat, zzafVar.zzo);
        f2 = zzafVar.zzt;
        if (f2 != -1.0f) {
        }
        zzed.zza(mediaFormat, "rotation-degrees", zzafVar.zzu);
        zzoVar = zzafVar.zzy;
        if (zzoVar != null) {
        }
        if ("video/dolby-vision".equals(zzafVar.zzm)) {
            zzed.zza(mediaFormat, Scopes.PROFILE, ((Integer) zza.first).intValue());
        }
        mediaFormat.setInteger("max-width", zzzzVar2.zza);
        mediaFormat.setInteger("max-height", zzzzVar2.zzb);
        zzed.zza(mediaFormat, "max-input-size", zzzzVar2.zzc);
        if (zzet.zza >= 23) {
        }
        if (z) {
        }
        if (zzet.zza >= 35) {
        }
        if (this.zzp == null) {
        }
        if (this.zzk) {
        }
        z2 = false;
        if (this.zzk) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzso
    protected final List zzag(zzsq zzsqVar, zzaf zzafVar, boolean z) throws zzsw {
        return zztc.zzg(zzaT(this.zze, zzsqVar, zzafVar, false, false), zzafVar);
    }

    @Override // com.google.android.gms.internal.ads.zzso
    protected final void zzaj(zzhd zzhdVar) throws zzhw {
        if (this.zzo) {
            ByteBuffer byteBuffer = zzhdVar.zzf;
            byteBuffer.getClass();
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
                        zzsc zzay = zzay();
                        zzay.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        zzay.zzp(bundle);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzso
    protected final void zzak(Exception exc) {
        zzea.zzd("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzg.zzs(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzso
    protected final void zzal(String str, zzrz zzrzVar, long j, long j2) {
        this.zzg.zza(str, j, j2);
        this.zzn = zzaS(str);
        zzsf zzaA = zzaA();
        zzaA.getClass();
        boolean z = false;
        if (zzet.zza >= 29 && "video/x-vnd.on2.vp9".equals(zzaA.zzb)) {
            MediaCodecInfo.CodecProfileLevel[] zzh = zzaA.zzh();
            int length = zzh.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (zzh[i].profile == 16384) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.zzo = z;
    }

    @Override // com.google.android.gms.internal.ads.zzso
    protected final void zzam(String str) {
        this.zzg.zzb(str);
    }

    @Override // com.google.android.gms.internal.ads.zzso
    protected final void zzan(zzaf zzafVar, MediaFormat mediaFormat) {
        zzsc zzay = zzay();
        if (zzay != null) {
            zzay.zzq(this.zzs);
        }
        mediaFormat.getClass();
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float f = zzafVar.zzv;
        int i = zzet.zza;
        int i2 = zzafVar.zzu;
        if (i2 == 90 || i2 == 270) {
            f = 1.0f / f;
            int i3 = integer2;
            integer2 = integer;
            integer = i3;
        }
        this.zzA = new zzcp(integer, integer2, 0, f);
        if (!this.zzk) {
            this.zzi.zzk(zzafVar.zzt);
            return;
        }
        zzabc zzabcVar = this.zzf;
        zzad zzb2 = zzafVar.zzb();
        zzb2.zzac(integer);
        zzb2.zzI(integer2);
        zzb2.zzW(0);
        zzb2.zzT(f);
        zzabcVar.zzf(1, zzb2.zzad());
    }

    protected final void zzao(zzsc zzscVar, int i, long j, long j2) {
        Trace.beginSection("releaseOutputBuffer");
        zzscVar.zzm(i, j2);
        Trace.endSection();
        this.zza.zze++;
        this.zzv = 0;
        if (this.zzk) {
            return;
        }
        zzcp zzcpVar = this.zzA;
        if (!zzcpVar.equals(zzcp.zza) && !zzcpVar.equals(this.zzB)) {
            this.zzB = zzcpVar;
            this.zzg.zzt(zzcpVar);
        }
        if (!this.zzi.zzo() || this.zzp == null) {
            return;
        }
        zzaV();
    }

    @Override // com.google.android.gms.internal.ads.zzso
    protected final void zzap() {
        if (this.zzk) {
            this.zzf.zzi(zzau());
        } else {
            this.zzi.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzso
    protected final int zzat(zzhd zzhdVar) {
        int i = zzet.zza;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzso
    protected final zzse zzaz(Throwable th, zzsf zzsfVar) {
        return new zzzw(th, zzsfVar, this.zzp);
    }

    @Override // com.google.android.gms.internal.ads.zzhm, com.google.android.gms.internal.ads.zzle
    public final void zzs() {
        this.zzi.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzso, com.google.android.gms.internal.ads.zzhm
    protected final void zzw() {
        zzaah zzaahVar;
        this.zzB = null;
        if (this.zzk) {
            zzaahVar = ((zzzr) this.zzf).zza.zzd;
            zzaahVar.zzd();
        } else {
            this.zzi.zzd();
        }
        this.zzr = false;
        try {
            super.zzw();
        } finally {
            this.zzg.zzc(this.zza);
            this.zzg.zzt(zzcp.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzso, com.google.android.gms.internal.ads.zzhm
    protected final void zzx(boolean z, boolean z2) throws zzhw {
        zzaah zzaahVar;
        super.zzx(z, z2);
        zzm();
        this.zzg.zze(this.zza);
        if (!this.zzl) {
            this.zzk = this.zzC;
            this.zzl = true;
        }
        if (!this.zzk) {
            this.zzi.zze(z2);
        } else {
            zzaahVar = ((zzzr) this.zzf).zza.zzd;
            zzaahVar.zze(z2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhm
    protected final void zzy() {
        zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzso, com.google.android.gms.internal.ads.zzhm
    protected final void zzz(long j, boolean z) throws zzhw {
        this.zzf.zze();
        this.zzf.zzi(zzau());
        super.zzz(j, z);
        this.zzi.zzi();
        if (z) {
            this.zzi.zzc(false);
        }
        this.zzv = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzso
    protected final boolean zzar(long j, long j2, zzsc zzscVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzaf zzafVar) throws zzhw {
        zzscVar.getClass();
        long zzau = j3 - zzau();
        int zza = this.zzi.zza(j3, j, j2, zzav(), z2, this.zzj);
        if (zza != 4) {
            if (z && !z2) {
                zzaO(zzscVar, i, zzau);
                return true;
            }
            if (this.zzp != this.zzq || this.zzk) {
                if (this.zzk) {
                    try {
                        this.zzf.zzg(j, j2);
                        long zzd2 = this.zzf.zzd(zzau, z2);
                        if (zzd2 != -9223372036854775807L) {
                            int i4 = zzet.zza;
                            zzao(zzscVar, i, zzau, zzd2);
                            return true;
                        }
                    } catch (zzabb e) {
                        throw zzi(e, e.zza, false, AdError.SHOW_CALLED_BEFORE_LOAD_ERROR_CODE);
                    }
                } else {
                    if (zza == 0) {
                        zzh();
                        long nanoTime = System.nanoTime();
                        int i5 = zzet.zza;
                        zzao(zzscVar, i, zzau, nanoTime);
                        zzaQ(this.zzj.zzc());
                        return true;
                    }
                    if (zza == 1) {
                        zzaaf zzaafVar = this.zzj;
                        long zzd3 = zzaafVar.zzd();
                        long zzc2 = zzaafVar.zzc();
                        int i6 = zzet.zza;
                        if (zzd3 == this.zzz) {
                            zzaO(zzscVar, i, zzau);
                        } else {
                            zzao(zzscVar, i, zzau, zzd3);
                        }
                        zzaQ(zzc2);
                        this.zzz = zzd3;
                        return true;
                    }
                    if (zza == 2) {
                        Trace.beginSection("dropVideoBuffer");
                        zzscVar.zzn(i, false);
                        Trace.endSection();
                        zzaP(0, 1);
                        zzaQ(this.zzj.zzc());
                        return true;
                    }
                    if (zza == 3) {
                        zzaO(zzscVar, i, zzau);
                        zzaQ(this.zzj.zzc());
                        return true;
                    }
                    if (zza != 5) {
                        throw new IllegalStateException(String.valueOf(zza));
                    }
                }
            } else if (this.zzj.zzc() < WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                zzaO(zzscVar, i, zzau);
                zzaQ(this.zzj.zzc());
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v13, types: [android.view.Surface] */
    @Override // com.google.android.gms.internal.ads.zzso, com.google.android.gms.internal.ads.zzhm, com.google.android.gms.internal.ads.zzkz
    public final void zzt(int i, Object obj) throws zzhw {
        if (i == 1) {
            zzaad zzaadVar = obj instanceof Surface ? (Surface) obj : null;
            if (zzaadVar == null) {
                zzaad zzaadVar2 = this.zzq;
                if (zzaadVar2 != null) {
                    zzaadVar = zzaadVar2;
                } else {
                    zzsf zzaA = zzaA();
                    if (zzaA != null && zzaX(zzaA)) {
                        zzaadVar = zzaad.zza(this.zze, zzaA.zzf);
                        this.zzq = zzaadVar;
                    }
                }
            }
            if (this.zzp == zzaadVar) {
                if (zzaadVar == null || zzaadVar == this.zzq) {
                    return;
                }
                zzaU();
                Surface surface = this.zzp;
                if (surface == null || !this.zzr) {
                    return;
                }
                this.zzg.zzq(surface);
                return;
            }
            this.zzp = zzaadVar;
            if (!this.zzk) {
                this.zzi.zzl(zzaadVar);
            }
            this.zzr = false;
            int zzcV = zzcV();
            zzsc zzay = zzay();
            zzaad zzaadVar3 = zzaadVar;
            if (zzay != null) {
                zzaadVar3 = zzaadVar;
                if (!this.zzk) {
                    zzaad zzaadVar4 = zzaadVar;
                    if (zzet.zza >= 23) {
                        if (zzaadVar != null) {
                            zzaadVar4 = zzaadVar;
                            if (!this.zzn) {
                                zzay.zzo(zzaadVar);
                                zzaadVar3 = zzaadVar;
                            }
                        } else {
                            zzaadVar4 = null;
                        }
                    }
                    zzaF();
                    zzaB();
                    zzaadVar3 = zzaadVar4;
                }
            }
            if (zzaadVar3 == null || zzaadVar3 == this.zzq) {
                this.zzB = null;
                if (this.zzk) {
                    ((zzzr) this.zzf).zza.zzr();
                    return;
                }
                return;
            }
            zzaU();
            if (zzcV == 2) {
                this.zzi.zzc(true);
                return;
            }
            return;
        }
        if (i == 7) {
            obj.getClass();
            zzaae zzaaeVar = (zzaae) obj;
            this.zzF = zzaaeVar;
            ((zzzr) this.zzf).zza.zzj = zzaaeVar;
            return;
        }
        if (i == 10) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            if (this.zzE != intValue) {
                this.zzE = intValue;
                return;
            }
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.zzD = ((Integer) obj).intValue();
            zzsc zzay2 = zzay();
            if (zzay2 == null || zzet.zza < 35) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.zzD));
            zzay2.zzp(bundle);
            return;
        }
        if (i == 4) {
            obj.getClass();
            int intValue2 = ((Integer) obj).intValue();
            this.zzs = intValue2;
            zzsc zzay3 = zzay();
            if (zzay3 != null) {
                zzay3.zzq(intValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            zzaah zzaahVar = this.zzi;
            obj.getClass();
            zzaahVar.zzj(((Integer) obj).intValue());
            return;
        }
        if (i == 13) {
            obj.getClass();
            this.zzf.zzj((List) obj);
            this.zzC = true;
        } else {
            if (i != 14) {
                super.zzt(i, obj);
                return;
            }
            obj.getClass();
            zzel zzelVar = (zzel) obj;
            if (zzelVar.zzb() == 0 || zzelVar.zza() == 0) {
                return;
            }
            zzabc zzabcVar = this.zzf;
            Surface surface2 = this.zzp;
            zzdi.zzb(surface2);
            ((zzzr) zzabcVar).zza.zzu(surface2, zzelVar);
        }
    }
}
