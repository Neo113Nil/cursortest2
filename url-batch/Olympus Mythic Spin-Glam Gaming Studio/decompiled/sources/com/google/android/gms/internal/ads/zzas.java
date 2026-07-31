package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzas {
    public static final /* synthetic */ int zza = 0;
    private static final ArrayList zzb = new ArrayList();
    private static final Pattern zzc = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static boolean zza(@Nullable String str) {
        return "audio".equals(zzj(str));
    }

    public static boolean zzb(@Nullable String str) {
        return "video".equals(zzj(str));
    }

    public static boolean zzc(@Nullable String str) {
        return "image".equals(zzj(str)) || "application/x-image-uri".equals(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean zzd(@Nullable String str, @Nullable String str2) {
        char c;
        zzar zzi;
        int zza2;
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1354451219:
                if (str.equals("application/vnd.dvb.ait")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case -1348231605:
                if (str.equals("application/x-icy")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -1265048566:
                if (str.equals("application/x-camera-motion")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case -1248341703:
                if (str.equals("application/id3")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case -43764892:
                if (str.equals("application/meta")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 469933706:
                if (str.equals("application/x-media3-cues")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 1054472807:
                if (str.equals("application/x-itut-t35")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 1154383568:
                if (str.equals("application/x-emsg")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 1331836563:
                if (str.equals("video/apv")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1652648887:
                if (str.equals("application/x-scte35")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
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
            case 20:
                if (str2 != null && (zzi = zzi(str2)) != null && (zza2 = zzi.zza()) != 0 && zza2 != 16) {
                }
                break;
        }
        return false;
    }

    @Nullable
    public static String zze(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 221) {
            return "audio/vorbis";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            case 108:
                return "image/jpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173 /* 173 */:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static int zzf(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (zza(str)) {
            return 1;
        }
        if (zzb(str)) {
            return 2;
        }
        if ("text".equals(zzj(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) {
            return 3;
        }
        if (zzc(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str) || "application/meta".equals(str) || "application/x-itut-t35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = zzb;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str2 = ((zzaq) arrayList.get(i)).zza;
            if (str.equals(null)) {
                return 0;
            }
        }
        return -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int zzg(String str, @Nullable String str2) {
        char c;
        zzar zzi;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1365340241:
                if (str.equals("audio/vnd.dts.hd;profile=lbr")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 187081724:
                if (str.equals("audio/dsd")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 550520934:
                if (str.equals("audio/vnd.dts.uhd;profile=p2")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c = '\n';
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
                return 9;
            case 1:
                if (str2 == null || (zzi = zzi(str2)) == null) {
                    return 0;
                }
                return zzi.zza();
            case 2:
                return 5;
            case 3:
                return 6;
            case 4:
                return 18;
            case 5:
                return 17;
            case 6:
                return 7;
            case 7:
            case '\b':
                return 8;
            case '\t':
                return 30;
            case '\n':
                return 14;
            case 11:
                return 20;
            case '\f':
                return 31;
            default:
                return 0;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String zzh(String str) {
        char c;
        if (str == null) {
            return null;
        }
        String zza2 = zzgts.zza(str);
        switch (zza2.hashCode()) {
            case -1833600100:
                if (zza2.equals("video/x-mvhevc")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1007807498:
                if (zza2.equals("audio/x-flac")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -979095690:
                if (zza2.equals("application/x-mpegurl")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -586683234:
                if (zza2.equals("audio/x-wav")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -432836268:
                if (zza2.equals("audio/mpeg-l1")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -432836267:
                if (zza2.equals("audio/mpeg-l2")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 187090231:
                if (zza2.equals("audio/mp3")) {
                    c = 2;
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
                return "video/mv-hevc";
            case 1:
                return "audio/flac";
            case 2:
                return "audio/mpeg";
            case 3:
                return "audio/wav";
            case 4:
                return "application/x-mpegURL";
            case 5:
                return "audio/mpeg-L1";
            case 6:
                return "audio/mpeg-L2";
            default:
                return zza2;
        }
    }

    @Nullable
    @VisibleForTesting
    static zzar zzi(String str) {
        Matcher matcher = zzc.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        try {
            return new zzar(Integer.parseInt(group, 16), group2 != null ? Integer.parseInt(group2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Nullable
    private static String zzj(@Nullable String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }
}
