package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.compose.material.MenuKt;
import androidx.compose.material.TextFieldImplKt;
import androidx.media3.common.C;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.media3.extractor.ts.PsExtractor;
import androidx.media3.extractor.ts.TsExtractor;
import com.amazon.a.a.o.b;
import com.caverock.androidsvg.SVGParser;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imageutils.JfifUtil;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.location.LocationRequest;
import com.google.mlkit.common.MlKitException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.UByte$$ExternalSyntheticBackport0;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzeo {
    public static final String zza;
    public static final byte[] zzb;
    private static final Pattern zzc;
    private static HashMap zzd;
    private static final String[] zze;
    private static final String[] zzf;
    private static final int[] zzg;
    private static final int[] zzh;
    private static final int[] zzi;

    static {
        String str = Build.DEVICE;
        String str2 = Build.MODEL;
        String str3 = Build.MANUFACTURER;
        int i = Build.VERSION.SDK_INT;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length() + 2 + String.valueOf(str3).length() + 2 + String.valueOf(i).length());
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(i);
        zza = sb.toString();
        zzb = new byte[0];
        zzc = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        zze = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", CmcdConfiguration.KEY_BUFFER_STARVATION, "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        zzf = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        zzg = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        zzh = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        zzi = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, WebSocketProtocol.PAYLOAD_SHORT, 121, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, JfifUtil.MARKER_SOI, 223, 214, 209, 196, 195, 202, MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR, 144, 151, 158, 153, 140, TsExtractor.TS_STREAM_TYPE_DTS_UHD, TsExtractor.TS_STREAM_TYPE_HDMV_DTS, 133, 168, 175, 166, 161, RotationOptions.ROTATE_180, 179, 186, PsExtractor.PRIVATE_STREAM_1, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, FacebookRequestErrorClassification.EC_INVALID_TOKEN, 171, TsExtractor.TS_STREAM_TYPE_AC4, 165, 162, 143, TsExtractor.TS_STREAM_TYPE_DTS_HD, TsExtractor.TS_STREAM_TYPE_AC3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, 125, 122, 137, 142, TsExtractor.TS_STREAM_TYPE_E_AC3, 128, 149, 146, ModuleDescriptor.MODULE_VERSION, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, PsExtractor.VIDEO_STREAM_MASK, 229, 226, 235, 236, 193, 198, 207, 200, 221, JfifUtil.MARKER_SOS, 211, 212, LocationRequest.PRIORITY_NO_POWER, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, MenuKt.InTransitionDuration, 127, 106, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, TsExtractor.TS_PACKET_SIZE, 187, TextFieldImplKt.AnimationDuration, 145, 152, 159, TsExtractor.TS_STREAM_TYPE_DTS, 141, 132, 131, 222, JfifUtil.MARKER_EOI, JfifUtil.MARKER_RST0, JfifUtil.MARKER_RST7, 194, 197, 204, 203, 230, JfifUtil.MARKER_APP1, 232, 239, 250, 253, 244, 243};
    }

    public static boolean zzA(int i) {
        return i == 3 || i == 2 || i == 268435456 || i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4;
    }

    public static int zzB(int i) {
        int i2;
        int i3 = 6396;
        if (i == 10) {
            i2 = 737532;
        } else {
            if (i == 12) {
                return 743676;
            }
            if (i != 24) {
                switch (i) {
                    case 1:
                        return 4;
                    case 2:
                        return 12;
                    case 3:
                        return 28;
                    case 4:
                        return 204;
                    case 5:
                        return 220;
                    case 6:
                        return 252;
                    case 7:
                        return 1276;
                    case 8:
                        return 6396;
                    default:
                        return 0;
                }
            }
            i2 = 67108860;
            i3 = 0;
        }
        return Build.VERSION.SDK_INT >= 32 ? i2 : i3;
    }

    public static AudioFormat zzC(int i, int i2, int i3) {
        return new AudioFormat.Builder().setSampleRate(i).setChannelMask(i2).setEncoding(i3).build();
    }

    public static int zzD(int i) {
        if (i == 30) {
            return 34;
        }
        switch (i) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
                return 28;
            default:
                switch (i) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        switch (i) {
                            case 20:
                                return 30;
                            case 21:
                            case 22:
                                return 31;
                            default:
                                return Integer.MAX_VALUE;
                        }
                }
        }
    }

    public static int zzE(int i) {
        if (i != 2) {
            if (i == 3) {
                return 1;
            }
            if (i != 4) {
                if (i != 21) {
                    if (i != 22) {
                        if (i != 268435456) {
                            if (i != 1342177280) {
                                if (i != 1610612736) {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                }
                return 3;
            }
            return 4;
        }
        return 2;
    }

    public static int zzF(int i) {
        if (i == 2 || i == 4) {
            return PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION;
        }
        if (i == 10) {
            return PlaybackException.ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED;
        }
        if (i == 7) {
            return PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION;
        }
        if (i == 8) {
            return PlaybackException.ERROR_CODE_DRM_CONTENT_ERROR;
        }
        switch (i) {
            case 15:
                return PlaybackException.ERROR_CODE_DRM_CONTENT_ERROR;
            case 16:
            case 18:
                return PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return PlaybackException.ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED;
            default:
                switch (i) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return PlaybackException.ERROR_CODE_DRM_PROVISIONING_FAILED;
                    default:
                        return PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR;
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int zzG(Uri uri) {
        char c;
        String scheme = uri.getScheme();
        if (scheme != null && (zzggj.zze("rtsp", scheme) || zzggj.zze("rtspt", scheme))) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int lastIndexOf = lastPathSegment.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String zza2 = zzggj.zza(lastPathSegment.substring(lastIndexOf + 1));
            switch (zza2.hashCode()) {
                case 104579:
                    if (zza2.equals("ism")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 108321:
                    if (zza2.equals("mpd")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 3242057:
                    if (zza2.equals("isml")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 3299913:
                    if (zza2.equals("m3u8")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            int i = c != 0 ? c != 1 ? (c == 2 || c == 3) ? 1 : 4 : 2 : 0;
            if (i != 4) {
                return i;
            }
        }
        Pattern pattern = zzc;
        String path = uri.getPath();
        path.getClass();
        Matcher matcher = pattern.matcher(path);
        if (!matcher.matches()) {
            return 4;
        }
        String group = matcher.group(2);
        if (group != null) {
            if (group.contains("format=mpd-time-csf")) {
                return 0;
            }
            if (group.contains("format=m3u8-aapl")) {
                return 2;
            }
        }
        return 1;
    }

    public static int zzH(byte[] bArr, int i, int i2, int i3) {
        while (i < i2) {
            i3 = zzg[(i3 >>> 24) ^ (bArr[i] & 255)] ^ (i3 << 8);
            i++;
        }
        return i3;
    }

    public static int zzI(byte[] bArr, int i, int i2, int i3) {
        int i4 = 65535;
        for (int i5 = 0; i5 < i2; i5++) {
            int m = UByte$$ExternalSyntheticBackport0.m(bArr[i5]);
            i4 = zzU(m & 15, zzU(m >> 4, i4));
        }
        return i4;
    }

    public static int zzJ(byte[] bArr, int i, int i2, int i3) {
        int i4 = 0;
        while (i < i2) {
            i4 = zzi[i4 ^ (bArr[i] & 255)];
            i++;
        }
        return i4;
    }

    public static int zzK(ByteBuffer byteBuffer, int i) {
        int i2 = byteBuffer.getInt(i);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i2 : Integer.reverseBytes(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
    
        r4.zzf(r3);
        r1 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean zzL(zzef zzefVar, zzef zzefVar2, Inflater inflater) {
        boolean z = false;
        if (zzefVar.zzd() == 0) {
            return false;
        }
        if (zzefVar2.zzj() < zzefVar.zzd()) {
            int zzd2 = zzefVar.zzd();
            zzefVar2.zzc(zzd2 + zzd2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(zzefVar.zzi(), zzefVar.zzg(), zzefVar.zzd());
        int i = 0;
        while (true) {
            try {
                i += inflater.inflate(zzefVar2.zzi(), i, zzefVar2.zzj() - i);
                if (!inflater.finished()) {
                    if (inflater.needsDictionary() || inflater.needsInput()) {
                        break;
                    }
                    if (i == zzefVar2.zzj()) {
                        int zzj = zzefVar2.zzj();
                        zzefVar2.zzc(zzj + zzj);
                    }
                } else {
                    break;
                }
            } catch (DataFormatException unused) {
            } catch (Throwable th) {
                inflater.reset();
                throw th;
            }
        }
        inflater.reset();
        return z;
    }

    public static boolean zzM(zzef zzefVar, zzef zzefVar2, Inflater inflater) {
        return zzefVar.zzd() > 0 && zzefVar.zzn() == 120 && zzL(zzefVar, zzefVar2, inflater);
    }

    public static boolean zzN(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static boolean zzO(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static Point zzP(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && zzN(context)) {
            String zzV = Build.VERSION.SDK_INT < 28 ? zzV("sys.display-size") : zzV("vendor.display-size");
            if (!TextUtils.isEmpty(zzV)) {
                try {
                    String[] split = zzV.trim().split("x", -1);
                    if (split.length == 2) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                String.valueOf(zzV);
                zzds.zze("Util", "Invalid display size: ".concat(String.valueOf(zzV)));
            }
            if ("Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
        return point;
    }

    public static String zzQ(int i) {
        switch (i) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return MimeTypes.BASE_TYPE_AUDIO;
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return TtmlNode.TAG_METADATA;
            default:
                return "camera motion";
        }
    }

    public static int zzR(String str) {
        String[] split;
        int length;
        if (str == null || (length = (split = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = split[length - 1];
        boolean z = length >= 3 && "neg".equals(split[length + (-2)]);
        try {
            if (str2 == null) {
                throw null;
            }
            String str3 = str2;
            int parseInt = Integer.parseInt(str2);
            return z ? -parseInt : parseInt;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static boolean zzS(Context context) {
        if (Build.VERSION.SDK_INT < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (Build.VERSION.SDK_INT == 30 && (zzggj.zze(Build.MODEL, "moto g(20)") || zzggj.zze(Build.MODEL, "rmx3231"))) {
            return true;
        }
        return Build.VERSION.SDK_INT == 34 && zzggj.zze(Build.MODEL, "sm-x200");
    }

    private static long zzT(long j, long j2, long j3, RoundingMode roundingMode) {
        long zzc2 = zzgmz.zzc(j, j2);
        if (zzc2 != Long.MAX_VALUE && zzc2 != Long.MIN_VALUE) {
            return zzgmz.zza(zzc2, j3, roundingMode);
        }
        long zzb2 = zzgmz.zzb(Math.abs(j2), Math.abs(j3));
        long zza2 = zzgmz.zza(j2, zzb2, RoundingMode.UNNECESSARY);
        long zza3 = zzgmz.zza(j3, zzb2, RoundingMode.UNNECESSARY);
        long zzb3 = zzgmz.zzb(Math.abs(j), Math.abs(zza3));
        long zza4 = zzgmz.zza(j, zzb3, RoundingMode.UNNECESSARY);
        long zza5 = zzgmz.zza(zza3, zzb3, RoundingMode.UNNECESSARY);
        long zzc3 = zzgmz.zzc(zza4, zza2);
        if (zzc3 != Long.MAX_VALUE && zzc3 != Long.MIN_VALUE) {
            return zzgmz.zza(zzc3, zza5, roundingMode);
        }
        double d = zza4 * (zza2 / zza5);
        if (d > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        return zzgmu.zza(d, roundingMode);
    }

    private static int zzU(int i, int i2) {
        return (char) (zzh[(i ^ (i2 >> 12)) & 255] ^ ((char) (i2 << 4)));
    }

    private static String zzV(String str) {
        try {
            Class<?> cls = Class.forName(b.at);
            return (String) cls.getMethod(b.au, String.class).invoke(cls, str);
        } catch (Exception e) {
            zzds.zzf("Util", "Failed to read system property ".concat(str), e);
            return null;
        }
    }

    private static HashMap zzW() {
        String[] iSOLanguages = Locale.getISOLanguages();
        int length = iSOLanguages.length;
        int length2 = zze.length;
        HashMap hashMap = new HashMap(length + 88);
        int i = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    hashMap.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = zze;
            int length3 = strArr.length;
            if (i >= 88) {
                return hashMap;
            }
            hashMap.put(strArr[i], strArr[i + 1]);
            i += 2;
        }
    }

    public static boolean zza(SparseArray sparseArray, int i) {
        return sparseArray.indexOfKey(i) >= 0;
    }

    public static Object[] zzb(Object[] objArr, int i) {
        zzghc.zza(i <= objArr.length);
        return Arrays.copyOf(objArr, i);
    }

    public static Handler zzc(Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        return new Handler(myLooper, null);
    }

    public static boolean zzd(Handler handler, Runnable runnable) {
        Looper looper = handler.getLooper();
        if (!looper.getThread().isAlive()) {
            return false;
        }
        if (looper != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    public static Looper zze() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    public static ExecutorService zzf(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.google.android.gms.internal.ads.zzen
            @Override // java.util.concurrent.ThreadFactory
            public final /* synthetic */ Thread newThread(Runnable runnable) {
                String str2 = zzeo.zza;
                return new Thread(runnable, str);
            }
        });
    }

    public static ScheduledExecutorService zzg(String str) {
        final String str2 = "ExoPlayer:AudioTrackReleaseThread";
        return Executors.newSingleThreadScheduledExecutor(new ThreadFactory(str2) { // from class: com.google.android.gms.internal.ads.zzem
            @Override // java.util.concurrent.ThreadFactory
            public final /* synthetic */ Thread newThread(Runnable runnable) {
                String str3 = zzeo.zza;
                return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
            }
        });
    }

    public static String zzh(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals(C.LANGUAGE_UNDETERMINED)) {
            str = replace;
        }
        String zza2 = zzggj.zza(str);
        int i = 0;
        String str2 = zza2.split("-", 2)[0];
        if (zzd == null) {
            zzd = zzW();
        }
        String str3 = (String) zzd.get(str2);
        if (str3 != null) {
            String substring = zza2.substring(str2.length());
            String.valueOf(substring);
            zza2 = str3.concat(String.valueOf(substring));
            str2 = str3;
        }
        if (SVGParser.XML_STYLESHEET_ATTR_ALTERNATE_NO.equals(str2) || "i".equals(str2) || "zh".equals(str2)) {
            while (true) {
                String[] strArr = zzf;
                int length = strArr.length;
                if (i >= 18) {
                    break;
                }
                if (zza2.startsWith(strArr[i])) {
                    String str4 = strArr[i + 1];
                    String substring2 = zza2.substring(strArr[i].length());
                    String.valueOf(str4);
                    String.valueOf(substring2);
                    return String.valueOf(str4).concat(String.valueOf(substring2));
                }
                i += 2;
            }
        }
        return zza2;
    }

    public static String zzi(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static String zzj(byte[] bArr, int i, int i2) {
        return new String(bArr, i, i2, StandardCharsets.UTF_8);
    }

    public static boolean zzk(int i) {
        return i == 10 || i == 13;
    }

    public static int zzl(int[] iArr, int i, boolean z, boolean z2) {
        int i2;
        int i3;
        int binarySearch = Arrays.binarySearch(iArr, i);
        if (binarySearch < 0) {
            i3 = -(binarySearch + 2);
        } else {
            while (true) {
                i2 = binarySearch - 1;
                if (i2 < 0 || iArr[i2] != i) {
                    break;
                }
                binarySearch = i2;
            }
            i3 = z ? binarySearch : i2;
        }
        return z2 ? Math.max(0, i3) : i3;
    }

    public static int zzm(long[] jArr, long j, boolean z, boolean z2) {
        int i;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            i = -(binarySearch + 2);
        } else {
            while (true) {
                int i2 = binarySearch - 1;
                if (i2 < 0 || jArr[i2] != j) {
                    break;
                }
                binarySearch = i2;
            }
            i = binarySearch;
        }
        return z2 ? Math.max(0, i) : i;
    }

    public static int zzn(zzdt zzdtVar, long j, boolean z, boolean z2) {
        int zzd2 = zzdtVar.zzd() - 1;
        int i = 0;
        while (i <= zzd2) {
            int i2 = (i + zzd2) >>> 1;
            if (zzdtVar.zzc(i2) < j) {
                i = i2 + 1;
            } else {
                zzd2 = i2 - 1;
            }
        }
        int i3 = zzd2 + 1;
        if (i3 < zzdtVar.zzd() && zzdtVar.zzc(i3) == j) {
            return i3;
        }
        if (zzd2 == -1) {
            return 0;
        }
        return zzd2;
    }

    public static int zzo(long[] jArr, long j, boolean z, boolean z2) {
        int i;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        while (true) {
            i = binarySearch + 1;
            if (i >= jArr.length || jArr[i] != j) {
                break;
            }
            binarySearch = i;
        }
        return !z ? i : binarySearch;
    }

    public static long zzp(long j) {
        return (j == C.TIME_UNSET || j == Long.MIN_VALUE) ? j : j / 1000;
    }

    public static long zzq(long j) {
        return (j == C.TIME_UNSET || j == Long.MIN_VALUE) ? j : j * 1000;
    }

    public static long zzr(long j, int i) {
        return zzt(j, 1000000L, i, RoundingMode.DOWN);
    }

    public static long zzs(long j, int i) {
        return zzt(j, i, 1000000L, RoundingMode.UP);
    }

    public static long zzt(long j, long j2, long j3, RoundingMode roundingMode) {
        if (j == 0 || j2 == 0) {
            return 0L;
        }
        return (j3 < j2 || j3 % j2 != 0) ? (j3 >= j2 || j2 % j3 != 0) ? (j3 < j || j3 % j != 0) ? (j3 >= j || j % j3 != 0) ? zzT(j, j2, j3, roundingMode) : zzgmz.zzc(j2, zzgmz.zza(j, j3, RoundingMode.UNNECESSARY)) : zzgmz.zza(j2, zzgmz.zza(j3, j, RoundingMode.UNNECESSARY), roundingMode) : zzgmz.zzc(j, zzgmz.zza(j2, j3, RoundingMode.UNNECESSARY)) : zzgmz.zza(j, zzgmz.zza(j3, j2, RoundingMode.UNNECESSARY), roundingMode);
    }

    public static long zzv(long j, float f) {
        return f == 1.0f ? j : Math.round(j * f);
    }

    public static long zzw(long j, float f) {
        return f == 1.0f ? j : Math.round(j / f);
    }

    public static String zzx(int i) {
        return new String(new byte[]{(byte) (i >> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) i}, StandardCharsets.US_ASCII);
    }

    public static zzu zzy(int i, int i2, int i3) {
        zzs zzsVar = new zzs();
        zzsVar.zzm(MimeTypes.AUDIO_RAW);
        zzsVar.zzE(i2);
        zzsVar.zzF(i3);
        zzsVar.zzG(i);
        return zzsVar.zzM();
    }

    public static int zzz(int i, ByteOrder byteOrder) {
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 2 : 268435456;
        }
        if (i == 24) {
            if (byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) {
                return 21;
            }
            return C.ENCODING_PCM_24BIT_BIG_ENDIAN;
        }
        if (i != 32) {
            return 0;
        }
        if (byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) {
            return 22;
        }
        return C.ENCODING_PCM_32BIT_BIG_ENDIAN;
    }

    public static void zzu(long[] jArr, long j, long j2) {
        long j3;
        RoundingMode roundingMode = RoundingMode.DOWN;
        int i = 0;
        if (j2 >= 1000000 && j2 % 1000000 == 0) {
            long zza2 = zzgmz.zza(j2, 1000000L, RoundingMode.UNNECESSARY);
            while (i < jArr.length) {
                jArr[i] = zzgmz.zza(jArr[i], zza2, roundingMode);
                i++;
            }
            return;
        }
        if (j2 < 1000000 && 1000000 % j2 == 0) {
            long zza3 = zzgmz.zza(1000000L, j2, RoundingMode.UNNECESSARY);
            while (i < jArr.length) {
                jArr[i] = zzgmz.zzc(jArr[i], zza3);
                i++;
            }
            return;
        }
        int i2 = 0;
        while (i2 < jArr.length) {
            long j4 = jArr[i2];
            if (j4 != 0) {
                if (j2 >= j4 && j2 % j4 == 0) {
                    jArr[i2] = zzgmz.zza(1000000L, zzgmz.zza(j2, j4, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j2 >= j4 || j4 % j2 != 0) {
                    j3 = j2;
                    jArr[i2] = zzT(j4, 1000000L, j3, roundingMode);
                    i2++;
                    j2 = j3;
                } else {
                    jArr[i2] = zzgmz.zzc(1000000L, zzgmz.zza(j4, j2, RoundingMode.UNNECESSARY));
                }
            }
            j3 = j2;
            i2++;
            j2 = j3;
        }
    }
}
