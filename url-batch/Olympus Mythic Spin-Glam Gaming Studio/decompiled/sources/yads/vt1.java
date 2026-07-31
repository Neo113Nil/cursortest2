package yads;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes12.dex */
public abstract class vt1 {
    public static final ArrayList a = new ArrayList();
    public static final Pattern b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static String a(String str) {
        ut1 b2;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String a2 = lh.a(str.trim());
        if (a2.startsWith("avc1") || a2.startsWith("avc3")) {
            return "video/avc";
        }
        if (a2.startsWith("hev1") || a2.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (a2.startsWith("dvav") || a2.startsWith("dva1") || a2.startsWith("dvhe") || a2.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (a2.startsWith("av01")) {
            return "video/av01";
        }
        if (a2.startsWith("vp9") || a2.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (a2.startsWith("vp8") || a2.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (a2.startsWith("mp4a")) {
            if (a2.startsWith("mp4a.") && (b2 = b(a2)) != null) {
                str2 = a(b2.a);
            }
            return str2 == null ? "audio/mp4a-latm" : str2;
        }
        if (a2.startsWith("mha1")) {
            return "audio/mha1";
        }
        if (a2.startsWith("mhm1")) {
            return "audio/mhm1";
        }
        if (a2.startsWith("ac-3") || a2.startsWith("dac3")) {
            return "audio/ac3";
        }
        if (a2.startsWith("ec-3") || a2.startsWith("dec3")) {
            return "audio/eac3";
        }
        if (a2.startsWith("ec+3")) {
            return "audio/eac3-joc";
        }
        if (a2.startsWith("ac-4") || a2.startsWith("dac4")) {
            return "audio/ac4";
        }
        if (a2.startsWith("dtsc")) {
            return "audio/vnd.dts";
        }
        if (a2.startsWith("dtse")) {
            return "audio/vnd.dts.hd;profile=lbr";
        }
        if (a2.startsWith("dtsh") || a2.startsWith("dtsl")) {
            return "audio/vnd.dts.hd";
        }
        if (a2.startsWith("dtsx")) {
            return "audio/vnd.dts.uhd;profile=p2";
        }
        if (a2.startsWith("opus")) {
            return "audio/opus";
        }
        if (a2.startsWith("vorbis")) {
            return "audio/vorbis";
        }
        if (a2.startsWith("flac")) {
            return "audio/flac";
        }
        if (a2.startsWith("stpp")) {
            return "application/ttml+xml";
        }
        if (a2.startsWith("wvtt")) {
            return "text/vtt";
        }
        if (a2.contains("cea708")) {
            return "application/cea-708";
        }
        if (a2.contains("eia608") || a2.contains("cea608")) {
            return "application/cea-608";
        }
        ArrayList arrayList = a;
        if (arrayList.size() <= 0) {
            return null;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public static ut1 b(String str) {
        Matcher matcher = b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        try {
            return new ut1(Integer.parseInt(group, 16), group2 != null ? Integer.parseInt(group2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String c(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static int d(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if ("audio".equals(c(str))) {
            return 1;
        }
        if ("video".equals(c(str))) {
            return 2;
        }
        if (e(str)) {
            return 3;
        }
        if ("image".equals(c(str))) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public static boolean e(String str) {
        return "text".equals(c(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static String a(int i) {
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
        if (i == 165) {
            return "audio/ac3";
        }
        if (i != 166) {
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
        return "audio/eac3";
    }

    public static int a(String str, String str2) {
        ut1 b2;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (b2 = b(str2)) == null) {
                    return 0;
                }
                int i = b2.b;
                if (i == 2) {
                    return 10;
                }
                if (i == 5) {
                    return 11;
                }
                if (i == 29) {
                    return 12;
                }
                if (i == 42) {
                    return 16;
                }
                if (i != 22) {
                    return i != 23 ? 0 : 15;
                }
                return 1073741824;
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }
}
