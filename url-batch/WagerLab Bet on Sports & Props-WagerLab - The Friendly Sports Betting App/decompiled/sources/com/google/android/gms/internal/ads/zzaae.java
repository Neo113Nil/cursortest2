package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.compose.material.MenuKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.common.C;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.PlaybackException;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder;
import androidx.media3.extractor.ts.TsExtractor;
import com.facebook.soloader.Elf64;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.location.LocationRequest;
import com.google.common.base.Ascii;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import io.ably.lib.util.Log;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.PriorityQueue;
import kotlin.text.Typography;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.commons.io.IOUtils;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzaae extends zzsz implements zzaat {
    private static final int[] zzb = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean zzc;
    private static boolean zzd;
    private int zzA;
    private int zzB;
    private int zzC;
    private zzls zzD;
    private boolean zzE;
    private long zzF;
    private int zzG;
    private long zzH;
    private zzbu zzI;
    private zzbu zzJ;
    private int zzK;
    private int zzL;
    private zzaar zzM;
    private long zzN;
    private long zzO;
    private boolean zzP;
    private final Context zze;
    private final boolean zzf;
    private final zzabl zzg;
    private final boolean zzh;
    private final zzaau zzi;
    private final zzaas zzj;
    private final long zzk;
    private final PriorityQueue zzl;
    private zzaad zzm;
    private boolean zzn;
    private boolean zzo;
    private zzabr zzp;
    private boolean zzq;
    private int zzr;
    private List zzs;
    private Surface zzt;
    private zzaag zzu;
    private zzeg zzv;
    private boolean zzw;
    private int zzx;
    private int zzy;
    private long zzz;

    protected zzaae(zzaac zzaacVar) {
        super(2, zzaacVar.zzg(), zzaacVar.zzf(), false, 30.0f);
        Context applicationContext = zzaacVar.zze().getApplicationContext();
        this.zze = applicationContext;
        this.zzp = null;
        this.zzg = new zzabl(zzaacVar.zzh(), zzaacVar.zzi());
        this.zzf = this.zzp == null;
        this.zzi = new zzaau(applicationContext, this, 0L);
        this.zzj = new zzaas();
        this.zzh = "NVIDIA".equals(Build.MANUFACTURER);
        this.zzv = zzeg.zza;
        this.zzx = 1;
        this.zzy = 0;
        this.zzI = zzbu.zza;
        this.zzL = 0;
        this.zzJ = null;
        this.zzK = -1000;
        this.zzN = C.TIME_UNSET;
        this.zzO = C.TIME_UNSET;
        this.zzl = new PriorityQueue();
        this.zzk = C.TIME_UNSET;
        this.zzD = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0081, code lost:
    
        if (r3.equals(androidx.media3.common.MimeTypes.VIDEO_AV1) != false) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zzas(zzst zzstVar, zzu zzuVar) {
        int i = zzuVar.zzv;
        int i2 = zzuVar.zzw;
        if (i != -1 && i2 != -1) {
            String str = zzuVar.zzo;
            str.getClass();
            char c = 2;
            if (MimeTypes.VIDEO_DOLBY_VISION.equals(str)) {
                int i3 = zztl.zza;
                Pair zze = zzdc.zze(zzuVar);
                if (zze != null) {
                    int intValue = ((Integer) zze.first).intValue();
                    if (intValue == 512 || intValue == 1 || intValue == 2) {
                        str = MimeTypes.VIDEO_H264;
                    } else if (intValue == 1024) {
                        str = MimeTypes.VIDEO_AV1;
                    }
                }
                str = MimeTypes.VIDEO_H265;
            }
            int i4 = 4;
            switch (str.hashCode()) {
                case -1664118616:
                    if (str.equals(MimeTypes.VIDEO_H263)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1662735862:
                    break;
                case -1662541442:
                    if (str.equals(MimeTypes.VIDEO_H265)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1187890754:
                    if (str.equals(MimeTypes.VIDEO_MP4V)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1331836730:
                    if (str.equals(MimeTypes.VIDEO_H264)) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1599127256:
                    if (str.equals(MimeTypes.VIDEO_VP8)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1599127257:
                    if (str.equals(MimeTypes.VIDEO_VP9)) {
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
                    return ((i * i2) * 3) / i4;
                case 4:
                    return Math.max(2097152, ((i * i2) * 3) / 4);
                case 5:
                    if (!"BRAVIA 4K 2015".equals(Build.MODEL) && (!"Amazon".equals(Build.MANUFACTURER) || (!"KFSOWI".equals(Build.MODEL) && (!"AFTS".equals(Build.MODEL) || !zzstVar.zzf)))) {
                        String str2 = zzeo.zza;
                        return ((((i + 15) / 16) * ((i2 + 15) / 16)) * 768) / 4;
                    }
                    break;
                case 6:
                    i4 = 8;
                    return ((i * i2) * 3) / i4;
            }
        }
        return -1;
    }

    protected static int zzbe(zzst zzstVar, zzu zzuVar) {
        int i = zzuVar.zzp;
        if (i == -1) {
            return zzas(zzstVar, zzuVar);
        }
        List list = zzuVar.zzr;
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((byte[]) list.get(i3)).length;
        }
        return i + i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x04c1, code lost:
    
        if (r1.equals("deb") != false) goto L506;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x079e, code lost:
    
        if (r1.equals("JSN-L21") == false) goto L514;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected static final boolean zzbi(String str) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (zzaae.class) {
            if (!zzc) {
                char c = 28;
                if (Build.VERSION.SDK_INT <= 28) {
                    String str2 = Build.DEVICE;
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
                if (Build.VERSION.SDK_INT > 27 || !"HWEML".equals(Build.DEVICE)) {
                    String str3 = Build.MODEL;
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
                            if (Build.VERSION.SDK_INT <= 26) {
                                String str4 = Build.DEVICE;
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
                                            c = '\"';
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
                                            c = AbstractJsonLexerKt.BEGIN_LIST;
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
                                            c = Ascii.MAX;
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
                                            c = AbstractJsonLexerKt.END_LIST;
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
                                            c = AbstractJsonLexerKt.COMMA;
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
                                            c = IOUtils.DIR_SEPARATOR_UNIX;
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
                                            c = AbstractJsonLexerKt.BEGIN_OBJ;
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
                                            c = AbstractJsonLexerKt.END_OBJ;
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
                                            c = AbstractJsonLexerKt.COLON;
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
                                            c = AbstractJsonLexerKt.UNICODE_ESC;
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
                                        String str5 = Build.MODEL;
                                        if (str5.hashCode() == -594534941) {
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
                                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                    case Elf64.Ehdr.E_SHENTSIZE /* 58 */:
                                    case ';':
                                    case '<':
                                    case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                                    case Elf64.Ehdr.E_SHSTRNDX /* 62 */:
                                    case '?':
                                    case '@':
                                    case 'A':
                                    case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                                    case 'C':
                                    case 'D':
                                    case 'E':
                                    case 'F':
                                    case TsExtractor.TS_SYNC_BYTE /* 71 */:
                                    case 'H':
                                    case 'I':
                                    case 'J':
                                    case 'K':
                                    case 'L':
                                    case 'M':
                                    case MdtaMetadataEntry.TYPE_INDICATOR_UNSIGNED_INT64 /* 78 */:
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
                                    case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
                                    case 'Z':
                                    case '[':
                                    case '\\':
                                    case ']':
                                    case '^':
                                    case '_':
                                    case '`':
                                    case 'a':
                                    case 'b':
                                    case Log.NONE /* 99 */:
                                    case 'd':
                                    case 'e':
                                    case 'f':
                                    case 'g':
                                    case 'h':
                                    case LocationRequest.PRIORITY_NO_POWER /* 105 */:
                                    case 'j':
                                    case 'k':
                                    case AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR /* 108 */:
                                    case AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY /* 109 */:
                                    case 'n':
                                    case 'o':
                                    case 'p':
                                    case 'q':
                                    case 'r':
                                    case 's':
                                    case AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID /* 116 */:
                                    case 'u':
                                    case 'v':
                                    case 'w':
                                    case MenuKt.InTransitionDuration /* 120 */:
                                    case 'y':
                                    case 'z':
                                    case '{':
                                    case '|':
                                    case '}':
                                    case WebSocketProtocol.PAYLOAD_SHORT /* 126 */:
                                    case 127:
                                    case 128:
                                    case TsExtractor.TS_STREAM_TYPE_AC3 /* 129 */:
                                    case TsExtractor.TS_STREAM_TYPE_HDMV_DTS /* 130 */:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
                                    case TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
                                    case TsExtractor.TS_STREAM_TYPE_DTS_HD /* 136 */:
                                    case 137:
                                    case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
                                    case TsExtractor.TS_STREAM_TYPE_DTS_UHD /* 139 */:
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

    protected static final boolean zzbj(zzst zzstVar) {
        return Build.VERSION.SDK_INT >= 35 && zzstVar.zzh;
    }

    private static List zzbk(Context context, zztb zztbVar, zzu zzuVar, boolean z, boolean z2) throws zztd {
        String str = zzuVar.zzo;
        if (str == null) {
            return zzgjz.zzi();
        }
        if (Build.VERSION.SDK_INT >= 26 && MimeTypes.VIDEO_DOLBY_VISION.equals(str) && !zzaab.zza(context)) {
            List zzd2 = zztl.zzd(zztbVar, zzuVar, z, z2);
            if (!zzd2.isEmpty()) {
                return zzd2;
            }
        }
        return zztl.zzc(zztbVar, zzuVar, z, z2);
    }

    private final void zzbl(Object obj) throws zzhz {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        if (this.zzt == surface) {
            if (surface != null) {
                zzbt();
                Surface surface2 = this.zzt;
                if (surface2 == null || !this.zzw) {
                    return;
                }
                this.zzg.zzg(surface2);
                return;
            }
            return;
        }
        this.zzt = surface;
        if (this.zzp == null) {
            this.zzi.zzd(surface);
        }
        this.zzw = false;
        int zze = zze();
        zzsq zzaD = zzaD();
        if (zzaD != null && this.zzp == null) {
            zzst zzaG = zzaG();
            zzaG.getClass();
            if (!zzbp(zzaG) || this.zzn) {
                zzaH();
                zzaz();
            } else {
                Surface zzbq = zzbq(zzaG);
                if (zzbq != null) {
                    zzaD.zzm(zzbq);
                } else {
                    if (Build.VERSION.SDK_INT < 35) {
                        throw new IllegalStateException();
                    }
                    zzaD.zzn();
                }
            }
        }
        if (surface != null) {
            zzbt();
        } else {
            this.zzJ = null;
            zzabr zzabrVar = this.zzp;
            if (zzabrVar != null) {
                zzabrVar.zzq();
            }
        }
        if (zze == 2) {
            zzabr zzabrVar2 = this.zzp;
            if (zzabrVar2 != null) {
                zzabrVar2.zzw(true);
            } else {
                this.zzi.zzj(true);
            }
        }
    }

    private final boolean zzbm(zzhg zzhgVar) {
        if (zzdb() || zzhgVar.zzd() || this.zzO == C.TIME_UNSET) {
            return true;
        }
        return this.zzO - (zzhgVar.zze - zzaZ()) <= SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US;
    }

    private final boolean zzbn(zzhg zzhgVar) {
        return zzhgVar.zze < zzG();
    }

    private final void zzbo(long j, long j2, zzu zzuVar) {
        zzaar zzaarVar = this.zzM;
        if (zzaarVar != null) {
            zzaarVar.zzcS(j, j2, zzuVar, zzaF());
        }
    }

    private final boolean zzbp(zzst zzstVar) {
        if (this.zzp != null) {
            return true;
        }
        Surface surface = this.zzt;
        return (surface != null && surface.isValid()) || zzbj(zzstVar) || zzbd(zzstVar);
    }

    private final Surface zzbq(zzst zzstVar) {
        zzabr zzabrVar = this.zzp;
        if (zzabrVar != null) {
            return zzabrVar.zzk();
        }
        Surface surface = this.zzt;
        if (surface != null) {
            return surface;
        }
        if (zzbj(zzstVar)) {
            return null;
        }
        zzghc.zzh(zzbd(zzstVar));
        zzaag zzaagVar = this.zzu;
        if (zzaagVar != null) {
            if (zzaagVar.zza != zzstVar.zzf) {
                zzbr();
            }
        }
        if (this.zzu == null) {
            this.zzu = zzaag.zzb(this.zze, zzstVar.zzf);
        }
        return this.zzu;
    }

    private final void zzbr() {
        zzaag zzaagVar = this.zzu;
        if (zzaagVar != null) {
            zzaagVar.release();
            this.zzu = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresNonNull({"displaySurface"})
    /* renamed from: zzbs, reason: merged with bridge method [inline-methods] */
    public final void zzbg() {
        this.zzg.zzg(this.zzt);
        this.zzw = true;
    }

    private final void zzbt() {
        zzbu zzbuVar = this.zzJ;
        if (zzbuVar != null) {
            this.zzg.zzf(zzbuVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzhq
    protected final void zzA(long j, boolean z) throws zzhz {
        zzabr zzabrVar = this.zzp;
        if (zzabrVar != null && !z) {
            zzabrVar.zzg(true);
        }
        super.zzA(j, z);
        if (this.zzp == null) {
            this.zzi.zzl();
        }
        if (z) {
            zzabr zzabrVar2 = this.zzp;
            if (zzabrVar2 != null) {
                zzabrVar2.zzw(false);
            } else {
                this.zzi.zzj(false);
            }
        }
        this.zzB = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzhq
    protected final void zzB() {
        this.zzA = 0;
        this.zzz = zzL().zzb();
        this.zzF = 0L;
        this.zzG = 0;
        zzabr zzabrVar = this.zzp;
        if (zzabrVar != null) {
            zzabrVar.zza();
        } else {
            this.zzi.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhq
    protected final void zzC() {
        if (this.zzA > 0) {
            long zzb2 = zzL().zzb();
            this.zzg.zzd(this.zzA, zzb2 - this.zzz);
            this.zzA = 0;
            this.zzz = zzb2;
        }
        int i = this.zzG;
        if (i != 0) {
            this.zzg.zze(this.zzF, i);
            this.zzF = 0L;
            this.zzG = 0;
        }
        zzabr zzabrVar = this.zzp;
        if (zzabrVar != null) {
            zzabrVar.zzb();
        } else {
            this.zzi.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzhq
    protected final void zzD() {
        this.zzJ = null;
        this.zzO = C.TIME_UNSET;
        this.zzw = false;
        this.zzE = true;
        try {
            super.zzD();
        } finally {
            zzabl zzablVar = this.zzg;
            zzablVar.zzi(this.zza);
            zzablVar.zzf(zzbu.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzhq
    protected final void zzE() {
        try {
            super.zzE();
        } finally {
            this.zzq = false;
            this.zzN = C.TIME_UNSET;
            zzbr();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhq
    protected final void zzF() {
        zzabr zzabrVar = this.zzp;
        if (zzabrVar == null || !this.zzf) {
            return;
        }
        zzabrVar.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzll, com.google.android.gms.internal.ads.zzln
    public final String zzS() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzll
    public final void zzU(float f, float f2) throws zzhz {
        super.zzU(f, f2);
        zzabr zzabrVar = this.zzp;
        if (zzabrVar != null) {
            zzabrVar.zzm(f);
        } else {
            this.zzi.zzn(f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public final void zzV() {
        zzabr zzabrVar = this.zzp;
        if (zzabrVar == null) {
            this.zzi.zzh();
            return;
        }
        int i = this.zzr;
        if (i == 0 || i == 1) {
            this.zzr = 0;
        } else {
            zzabrVar.zzt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzll
    public final void zzW(long j, long j2) throws zzhz {
        zzabr zzabrVar = this.zzp;
        if (zzabrVar != null) {
            try {
                zzabrVar.zzv(j, j2);
            } catch (zzabq e) {
                throw zzN(e, e.zza, false, PlaybackException.ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED);
            }
        }
        super.zzW(j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzll
    public final boolean zzX() {
        boolean zzaV = zzaV();
        zzabr zzabrVar = this.zzp;
        if (zzabrVar != null) {
            return zzabrVar.zzh(zzaV);
        }
        if (zzaV && zzaD() == null) {
            return true;
        }
        return this.zzi.zzi(zzaV);
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzll
    public final boolean zzY() {
        if (!super.zzY()) {
            return false;
        }
        zzabr zzabrVar = this.zzp;
        return zzabrVar == null || zzabrVar.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final boolean zzaB(zzst zzstVar) {
        return zzbp(zzstVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final boolean zzaJ() {
        zzst zzaG = zzaG();
        if (this.zzp != null && zzaG != null) {
            String str = zzaG.zza;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.zzaJ();
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final boolean zzaK() {
        boolean z;
        zzu zzaE = zzaE();
        long j = this.zzO;
        if (j != C.TIME_UNSET) {
            if (zzaL() + j + 1 <= Long.MAX_VALUE - (zzaZ() + this.zzO)) {
                z = false;
                return this.zzD == null || this.zzE || (zzaE != null && zzaE.zzq > 0) || z || zzaT() != C.TIME_UNSET;
            }
        }
        z = true;
        if (this.zzD == null) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final void zzaM() {
        super.zzaM();
        this.zzl.clear();
        this.zzC = 0;
        this.zzE = false;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final zzss zzaO(Throwable th, zzst zzstVar) {
        return new zzzy(th, zzstVar, this.zzt);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final boolean zzaP(zzu zzuVar) throws zzhz {
        zzabr zzabrVar = this.zzp;
        if (zzabrVar == null || zzabrVar.zze()) {
            return true;
        }
        try {
            zzabrVar.zzd(zzuVar);
            return true;
        } catch (zzabq e) {
            throw zzN(e, zzuVar, false, 7000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final void zzaQ(zzhg zzhgVar) throws zzhz {
        int zzaR = zzaR(zzhgVar);
        if (Build.VERSION.SDK_INT < 34 || (zzaR & 32) == 0) {
            this.zzC++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final int zzaR(zzhg zzhgVar) {
        return (Build.VERSION.SDK_INT < 34 || this.zzD == null || !zzbn(zzhgVar) || zzbm(zzhgVar)) ? 0 : 32;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final boolean zzaS(zzhg zzhgVar) {
        boolean z = false;
        if (zzbm(zzhgVar)) {
            return false;
        }
        if (zzbn(zzhgVar)) {
            if (zzhgVar.zze()) {
                return false;
            }
            if (zzhgVar.zzf()) {
                zzhgVar.zza();
                z = true;
            }
            if (z) {
                this.zza.zzd++;
            }
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final void zzaU(long j) {
        super.zzaU(j);
        this.zzC--;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final int zzab(zztb zztbVar, zzu zzuVar) throws zztd {
        boolean z;
        String str = zzuVar.zzo;
        if (!zzar.zzb(str)) {
            return 128;
        }
        Context context = this.zze;
        int i = 0;
        boolean z2 = zzuVar.zzs != null;
        List zzbk = zzbk(context, zztbVar, zzuVar, z2, false);
        if (z2 && zzbk.isEmpty()) {
            zzbk = zzbk(context, zztbVar, zzuVar, false, false);
        }
        if (zzbk.isEmpty()) {
            return TsExtractor.TS_STREAM_TYPE_AC3;
        }
        if (!zzbb(zzuVar)) {
            return TsExtractor.TS_STREAM_TYPE_HDMV_DTS;
        }
        zzst zzstVar = (zzst) zzbk.get(0);
        boolean zzc2 = zzstVar.zzc(zzuVar);
        if (!zzc2) {
            for (int i2 = 1; i2 < zzbk.size(); i2++) {
                zzst zzstVar2 = (zzst) zzbk.get(i2);
                if (zzstVar2.zzc(zzuVar)) {
                    zzc2 = true;
                    z = false;
                    zzstVar = zzstVar2;
                    break;
                }
            }
        }
        z = true;
        int i3 = true != zzc2 ? 3 : 4;
        int i4 = true != zzstVar.zze(zzuVar) ? 8 : 16;
        int i5 = true != zzstVar.zzg ? 0 : 64;
        int i6 = true != z ? 0 : 128;
        if (Build.VERSION.SDK_INT >= 26 && MimeTypes.VIDEO_DOLBY_VISION.equals(str) && !zzaab.zza(context)) {
            i6 = 256;
        }
        if (zzc2) {
            List zzbk2 = zzbk(context, zztbVar, zzuVar, z2, true);
            if (!zzbk2.isEmpty()) {
                zzst zzstVar3 = (zzst) zztl.zze(zzbk2, zzuVar).get(0);
                if (zzstVar3.zzc(zzuVar) && zzstVar3.zze(zzuVar)) {
                    i = 32;
                }
            }
        }
        return i3 | i4 | i | i5 | i6;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final List zzac(zztb zztbVar, zzu zzuVar, boolean z) throws zztd {
        return zztl.zze(zzbk(this.zze, zztbVar, zzuVar, false, false), zzuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final zzsn zzae(zzst zzstVar, zzu zzuVar, MediaCrypto mediaCrypto, float f) {
        int i;
        zzaad zzaadVar;
        Point point;
        int i2;
        int i3;
        int i4;
        boolean z;
        zzu[] zzuVarArr;
        char c;
        boolean z2;
        int zzas;
        zzu[] zzI = zzI();
        int length = zzI.length;
        int zzbe = zzbe(zzstVar, zzuVar);
        int i5 = zzuVar.zzw;
        int i6 = zzuVar.zzv;
        if (length == 1) {
            if (zzbe != -1 && (zzas = zzas(zzstVar, zzuVar)) != -1) {
                zzbe = Math.min((int) (zzbe * 1.5f), zzas);
            }
            zzaadVar = new zzaad(i6, i5, zzbe);
            i = 35;
        } else {
            int i7 = i5;
            int i8 = i6;
            int i9 = 0;
            boolean z3 = false;
            i = 35;
            while (i9 < length) {
                zzu zzuVar2 = zzI[i9];
                zzh zzhVar = zzuVar.zzE;
                if (zzhVar != null && zzuVar2.zzE == null) {
                    zzs zza = zzuVar2.zza();
                    zza.zzC(zzhVar);
                    zzuVar2 = zza.zzM();
                }
                if (zzstVar.zzf(zzuVar, zzuVar2).zzd != 0) {
                    int i10 = zzuVar2.zzv;
                    c = 65535;
                    if (i10 != -1) {
                        zzuVarArr = zzI;
                        if (zzuVar2.zzw != -1) {
                            z2 = false;
                            z3 |= z2;
                            i8 = Math.max(i8, i10);
                            i7 = Math.max(i7, zzuVar2.zzw);
                            zzbe = Math.max(zzbe, zzbe(zzstVar, zzuVar2));
                        }
                    } else {
                        zzuVarArr = zzI;
                    }
                    z2 = true;
                    z3 |= z2;
                    i8 = Math.max(i8, i10);
                    i7 = Math.max(i7, zzuVar2.zzw);
                    zzbe = Math.max(zzbe, zzbe(zzstVar, zzuVar2));
                } else {
                    zzuVarArr = zzI;
                    c = 65535;
                }
                i9++;
                zzI = zzuVarArr;
            }
            if (z3) {
                StringBuilder sb = new StringBuilder(String.valueOf(i8).length() + 44 + String.valueOf(i7).length());
                sb.append("Resolutions unknown. Codec max resolution: ");
                sb.append(i8);
                sb.append("x");
                sb.append(i7);
                zzds.zzc("MediaCodecVideoRenderer", sb.toString());
                boolean z4 = i5 > i6;
                int i11 = z4 ? i5 : i6;
                int i12 = true != z4 ? i5 : i6;
                int[] iArr = zzb;
                int i13 = 0;
                while (i13 < 9) {
                    float f2 = i12;
                    float f3 = i11;
                    int i14 = iArr[i13];
                    int i15 = i13;
                    float f4 = i14;
                    if (i14 <= i11 || (i2 = (int) (f4 * (f2 / f3))) <= i12) {
                        break;
                    }
                    int i16 = i11;
                    if (true != z4) {
                        i3 = i12;
                        i4 = i14;
                    } else {
                        i3 = i12;
                        i4 = i2;
                    }
                    if (true != z4) {
                        i14 = i2;
                    }
                    point = zzstVar.zzi(i4, i14);
                    float f5 = zzuVar.zzz;
                    if (point != null) {
                        z = z4;
                        if (zzstVar.zzg(point.x, point.y, f5)) {
                            break;
                        }
                    } else {
                        z = z4;
                    }
                    i13 = i15 + 1;
                    i11 = i16;
                    i12 = i3;
                    z4 = z;
                }
                point = null;
                if (point != null) {
                    i8 = Math.max(i8, point.x);
                    i7 = Math.max(i7, point.y);
                    zzs zza2 = zzuVar.zza();
                    zza2.zzt(i8);
                    zza2.zzu(i7);
                    zzbe = Math.max(zzbe, zzas(zzstVar, zza2.zzM()));
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i8).length() + 35 + String.valueOf(i7).length());
                    sb2.append("Codec max resolution adjusted to: ");
                    sb2.append(i8);
                    sb2.append("x");
                    sb2.append(i7);
                    zzds.zzc("MediaCodecVideoRenderer", sb2.toString());
                }
            }
            zzaadVar = new zzaad(i8, i7, zzbe);
        }
        String str = zzstVar.zzc;
        this.zzm = zzaadVar;
        boolean z5 = this.zzh;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i6);
        mediaFormat.setInteger("height", i5);
        zzdv.zza(mediaFormat, zzuVar.zzr);
        float f6 = zzuVar.zzz;
        if (f6 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f6);
        }
        zzdv.zzb(mediaFormat, "rotation-degrees", zzuVar.zzA);
        zzh zzhVar2 = zzuVar.zzE;
        if (zzhVar2 != null) {
            zzdv.zzb(mediaFormat, "color-transfer", zzhVar2.zzd);
            zzdv.zzb(mediaFormat, "color-standard", zzhVar2.zzb);
            zzdv.zzb(mediaFormat, "color-range", zzhVar2.zzc);
            byte[] bArr = zzhVar2.zze;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if (MimeTypes.VIDEO_DOLBY_VISION.equals(zzuVar.zzo)) {
            int i17 = zztl.zza;
            Pair zze = zzdc.zze(zzuVar);
            if (zze != null) {
                zzdv.zzb(mediaFormat, Scopes.PROFILE, ((Integer) zze.first).intValue());
            }
        }
        mediaFormat.setInteger("max-width", zzaadVar.zza);
        mediaFormat.setInteger("max-height", zzaadVar.zzb);
        zzdv.zzb(mediaFormat, "max-input-size", zzaadVar.zzc);
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if (z5) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (Build.VERSION.SDK_INT >= i) {
            mediaFormat.setInteger(NotificationsChannelSerializer.IMPORTANCE_KEY, Math.max(0, -this.zzK));
        }
        Surface zzbq = zzbq(zzstVar);
        if (this.zzp != null && !zzeo.zzS(this.zze)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return zzsn.zzb(zzstVar, mediaFormat, zzuVar, zzbq, null);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final zzhs zzaf(zzst zzstVar, zzu zzuVar, zzu zzuVar2) {
        int i;
        int i2;
        zzhs zzf = zzstVar.zzf(zzuVar, zzuVar2);
        int i3 = zzf.zze;
        zzaad zzaadVar = this.zzm;
        zzaadVar.getClass();
        if (zzuVar2.zzv > zzaadVar.zza || zzuVar2.zzw > zzaadVar.zzb) {
            i3 |= 256;
        }
        if (zzbe(zzstVar, zzuVar2) > zzaadVar.zzc) {
            i3 |= 64;
        }
        String str = zzstVar.zza;
        if (i3 != 0) {
            i2 = 0;
            i = i3;
        } else {
            i = 0;
            i2 = zzf.zzd;
        }
        return new zzhs(str, zzuVar, zzuVar2, i2, i);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final float zzah(float f, zzu zzuVar, zzu[] zzuVarArr) {
        zzst zzaG;
        float f2 = -1.0f;
        for (zzu zzuVar2 : zzuVarArr) {
            float f3 = zzuVar2.zzz;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        float f4 = f2 == -1.0f ? -1.0f : f2 * f;
        if (this.zzD == null || (zzaG = zzaG()) == null) {
            return f4;
        }
        float zzh = zzaG.zzh(zzuVar.zzv, zzuVar.zzw);
        return f4 != -1.0f ? Math.max(f4, zzh) : zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final void zzai(String str, zzsn zzsnVar, long j, long j2) {
        this.zzg.zzb(str, j, j2);
        this.zzn = zzbi(str);
        zzst zzaG = zzaG();
        zzaG.getClass();
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29 && MimeTypes.VIDEO_VP9.equals(zzaG.zzb)) {
            MediaCodecInfo.CodecProfileLevel[] zzb2 = zzaG.zzb();
            int length = zzb2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (zzb2[i].profile == 16384) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.zzo = z;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final void zzaj(String str) {
        this.zzg.zzh(str);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final void zzak(Exception exc) {
        zzds.zzf("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzg.zzj(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final zzhs zzal(zzkh zzkhVar) throws zzhz {
        zzhs zzal = super.zzal(zzkhVar);
        zzu zzuVar = zzkhVar.zzb;
        zzuVar.getClass();
        this.zzg.zzc(zzuVar, zzal);
        return zzal;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final void zzam(zzu zzuVar, MediaFormat mediaFormat) {
        zzsq zzaD = zzaD();
        if (zzaD != null) {
            zzaD.zzp(this.zzx);
        }
        mediaFormat.getClass();
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float f = zzuVar.zzB;
        int i = zzuVar.zzA;
        if (i == 90 || i == 270) {
            f = 1.0f / f;
            int i2 = integer2;
            integer2 = integer;
            integer = i2;
        }
        this.zzI = new zzbu(integer, integer2, f);
        zzabr zzabrVar = this.zzp;
        if (zzabrVar == null || !this.zzP) {
            this.zzi.zze(zzuVar.zzz);
        } else {
            zzs zza = zzuVar.zza();
            zza.zzt(integer);
            zza.zzu(integer2);
            zza.zzz(f);
            zzu zzM = zza.zzM();
            int i3 = this.zzr;
            List list = this.zzs;
            if (list == null) {
                list = zzgjz.zzi();
            }
            zzabrVar.zzs(1, zzM, zzba(), i3, list);
            this.zzr = 2;
        }
        this.zzP = false;
    }

    @Override // com.google.android.gms.internal.ads.zzaat
    public final boolean zzan(long j, long j2, long j3, boolean z, boolean z2) throws zzhz {
        int zzP;
        if (this.zzp != null && this.zzf) {
            j2 -= -this.zzN;
        }
        if (j >= -500000 || z || (zzP = zzP(j2)) == 0) {
            return false;
        }
        if (z2) {
            zzhr zzhrVar = this.zza;
            int i = zzhrVar.zzd + zzP;
            zzhrVar.zzd = i;
            zzhrVar.zzf += this.zzC;
            zzhrVar.zzd = i + this.zzl.size();
        } else {
            this.zza.zzj++;
            zzav(zzP + this.zzl.size(), this.zzC);
        }
        zzaI();
        zzabr zzabrVar = this.zzp;
        if (zzabrVar != null) {
            zzabrVar.zzg(false);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final void zzao() {
        zzabr zzabrVar = this.zzp;
        if (zzabrVar != null) {
            zzabrVar.zzi();
            long j = this.zzN;
            if (j == C.TIME_UNSET) {
                j = zzba();
                this.zzN = j;
            }
            this.zzp.zzo(-j);
        } else {
            this.zzi.zza(2);
        }
        this.zzP = true;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final void zzaq() {
        zzabr zzabrVar = this.zzp;
        if (zzabrVar != null) {
            zzabrVar.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final void zzar(zzhg zzhgVar) throws zzhz {
        if (this.zzo) {
            ByteBuffer byteBuffer = zzhgVar.zzf;
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
                        zzsq zzaD = zzaD();
                        zzaD.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        zzaD.zzo(bundle);
                    }
                }
            }
        }
    }

    protected final void zzat(zzsq zzsqVar, int i, long j) {
        Trace.beginSection("skipVideoBuffer");
        zzsqVar.zzc(i, false);
        Trace.endSection();
        this.zza.zzf++;
    }

    protected final void zzau(zzsq zzsqVar, int i, long j) {
        Trace.beginSection("dropVideoBuffer");
        zzsqVar.zzc(i, false);
        Trace.endSection();
        zzav(0, 1);
    }

    protected final void zzav(int i, int i2) {
        zzhr zzhrVar = this.zza;
        zzhrVar.zzh += i;
        int i3 = i + i2;
        zzhrVar.zzg += i3;
        this.zzA += i3;
        int i4 = this.zzB + i3;
        this.zzB = i4;
        zzhrVar.zzi = Math.max(i4, zzhrVar.zzi);
    }

    protected final void zzaw(long j) {
        zzhr zzhrVar = this.zza;
        zzhrVar.zzk += j;
        zzhrVar.zzl++;
        this.zzF += j;
        this.zzG++;
    }

    protected final void zzax(zzsq zzsqVar, int i, long j, long j2) {
        Trace.beginSection("releaseOutputBuffer");
        zzsqVar.zzd(i, j2);
        Trace.endSection();
        this.zza.zze++;
        this.zzB = 0;
        if (this.zzp == null) {
            zzbu zzbuVar = this.zzI;
            if (!zzbuVar.equals(zzbu.zza) && !zzbuVar.equals(this.zzJ)) {
                this.zzJ = zzbuVar;
                this.zzg.zzf(zzbuVar);
            }
            if (!this.zzi.zzf() || this.zzt == null) {
                return;
            }
            zzbg();
        }
    }

    protected final boolean zzbd(zzst zzstVar) {
        if (zzbi(zzstVar.zza)) {
            return false;
        }
        return !zzstVar.zzf || zzaag.zza(this.zze);
    }

    final /* synthetic */ Surface zzbh() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzhq
    protected final void zzy(boolean z, boolean z2) throws zzhz {
        super.zzy(z, z2);
        zzJ();
        this.zzg.zza(this.zza);
        if (!this.zzq) {
            if (this.zzs != null && this.zzp == null) {
                zzaai zzaaiVar = new zzaai(this.zze, this.zzi);
                zzaaiVar.zza(true);
                long j = this.zzk;
                long j2 = C.TIME_UNSET;
                if (j != C.TIME_UNSET) {
                    j2 = -j;
                }
                zzaaiVar.zzc(j2);
                zzaaiVar.zzb(zzL());
                zzaaq zzd2 = zzaaiVar.zzd();
                zzd2.zza(1);
                this.zzp = zzd2.zzb(0);
            }
            this.zzq = true;
        }
        int i = !z2 ? 1 : 0;
        zzabr zzabrVar = this.zzp;
        if (zzabrVar == null) {
            zzaau zzaauVar = this.zzi;
            zzaauVar.zzg(zzL());
            zzaauVar.zza(i);
            return;
        }
        zzabrVar.zzc(new zzzz(this), zzgpk.zza());
        zzaar zzaarVar = this.zzM;
        if (zzaarVar != null) {
            this.zzp.zzl(zzaarVar);
        }
        if (this.zzt != null && !this.zzv.equals(zzeg.zza)) {
            this.zzp.zzp(this.zzt, this.zzv);
        }
        this.zzp.zzr(this.zzy);
        this.zzp.zzm(zzaW());
        List list = this.zzs;
        if (list != null) {
            this.zzp.zzn(list);
        }
        this.zzr = i;
        zzay();
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzhq
    protected final void zzz(zzu[] zzuVarArr, long j, long j2, zzup zzupVar) throws zzhz {
        super.zzz(zzuVarArr, j, j2, zzupVar);
        zzbe zzM = zzM();
        if (zzM.zzg()) {
            this.zzO = C.TIME_UNSET;
        } else {
            this.zzO = zzM.zzo(zzupVar.zza, new zzbc()).zzd;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final boolean zzap(long j, long j2, zzsq zzsqVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzu zzuVar) throws zzhz {
        zzaae zzaaeVar;
        long j4;
        zzsqVar.getClass();
        long zzaZ = j3 - zzaZ();
        int i4 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.zzl;
            Long l = (Long) priorityQueue.peek();
            if (l == null || l.longValue() >= j3) {
                break;
            }
            priorityQueue.poll();
            i4++;
        }
        zzav(i4, 0);
        zzabr zzabrVar = this.zzp;
        if (zzabrVar != null) {
            if (!z || z2) {
                return zzabrVar.zzu(j3, new zzaaa(this, zzsqVar, i, zzaZ));
            }
            zzat(zzsqVar, i, zzaZ);
            return true;
        }
        zzaau zzaauVar = this.zzi;
        long zzba = zzba();
        zzaas zzaasVar = this.zzj;
        int zzk = zzaauVar.zzk(j3, j, j2, zzba, z, z2, zzaasVar);
        if (zzk == 0) {
            long zzc2 = zzL().zzc();
            zzbo(zzaZ, zzc2, zzuVar);
            zzax(zzsqVar, i, zzaZ, zzc2);
            zzaw(zzaasVar.zza());
            return true;
        }
        if (zzk != 1) {
            if (zzk == 2) {
                zzau(zzsqVar, i, zzaZ);
                zzaw(zzaasVar.zza());
                return true;
            }
            if (zzk != 3) {
                return false;
            }
            zzat(zzsqVar, i, zzaZ);
            zzaw(zzaasVar.zza());
            return true;
        }
        long zzb2 = zzaasVar.zzb();
        long zza = zzaasVar.zza();
        if (zzb2 == this.zzH) {
            zzat(zzsqVar, i, zzaZ);
            j4 = zzb2;
            zzaaeVar = this;
        } else {
            zzbo(zzaZ, zzb2, zzuVar);
            zzax(zzsqVar, i, zzaZ, zzb2);
            zzaaeVar = this;
            j4 = zzb2;
        }
        zzaaeVar.zzaw(zza);
        zzaaeVar.zzH = j4;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzhq, com.google.android.gms.internal.ads.zzlg
    public final void zzx(int i, Object obj) throws zzhz {
        if (i == 1) {
            zzbl(obj);
            return;
        }
        if (i == 7) {
            obj.getClass();
            zzaar zzaarVar = (zzaar) obj;
            this.zzM = zzaarVar;
            zzabr zzabrVar = this.zzp;
            if (zzabrVar != null) {
                zzabrVar.zzl(zzaarVar);
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            if (this.zzL != intValue) {
                this.zzL = intValue;
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            int intValue2 = ((Integer) obj).intValue();
            this.zzx = intValue2;
            zzsq zzaD = zzaD();
            if (zzaD != null) {
                zzaD.zzp(intValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int intValue3 = ((Integer) obj).intValue();
            this.zzy = intValue3;
            zzabr zzabrVar2 = this.zzp;
            if (zzabrVar2 != null) {
                zzabrVar2.zzr(intValue3);
                return;
            } else {
                this.zzi.zzm(intValue3);
                return;
            }
        }
        if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(zzbq.zza)) {
                zzabr zzabrVar3 = this.zzp;
                if (zzabrVar3 == null || !zzabrVar3.zze()) {
                    return;
                }
                zzabrVar3.zzf();
                return;
            }
            this.zzs = list;
            zzabr zzabrVar4 = this.zzp;
            if (zzabrVar4 != null) {
                zzabrVar4.zzn(list);
                return;
            }
            return;
        }
        if (i == 14) {
            obj.getClass();
            zzeg zzegVar = (zzeg) obj;
            if (zzegVar.zza() == 0 || zzegVar.zzb() == 0) {
                return;
            }
            this.zzv = zzegVar;
            zzabr zzabrVar5 = this.zzp;
            if (zzabrVar5 != null) {
                Surface surface = this.zzt;
                surface.getClass();
                zzabrVar5.zzp(surface, zzegVar);
                return;
            }
            return;
        }
        switch (i) {
            case 16:
                obj.getClass();
                this.zzK = ((Integer) obj).intValue();
                zzsq zzaD2 = zzaD();
                if (zzaD2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt(NotificationsChannelSerializer.IMPORTANCE_KEY, Math.max(0, -this.zzK));
                    zzaD2.zzo(bundle);
                    break;
                }
                break;
            case 17:
                Surface surface2 = this.zzt;
                zzbl(null);
                obj.getClass();
                ((zzaae) obj).zzx(1, surface2);
                break;
            case 18:
                boolean z = this.zzD != null;
                zzls zzlsVar = (zzls) obj;
                this.zzD = zzlsVar;
                if (z != (zzlsVar != null)) {
                    zzaY();
                    break;
                }
                break;
            default:
                super.zzx(i, obj);
                break;
        }
    }
}
