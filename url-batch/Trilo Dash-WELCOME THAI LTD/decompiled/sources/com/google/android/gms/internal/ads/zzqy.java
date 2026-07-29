package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzqy {
    public static final /* synthetic */ int zza = 0;
    private static final Pattern zzb = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap zzc = new HashMap();
    private static int zzd = -1;

    public static int zza() throws zzqs {
        int i;
        int i2 = zzd;
        if (i2 == -1) {
            zzqg zzc2 = zzc("video/avc", false, false);
            if (zzc2 != null) {
                int i3 = 0;
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : zzc2.zzg()) {
                    int i4 = codecProfileLevel.level;
                    if (i4 != 1 && i4 != 2) {
                        switch (i4) {
                            case 8:
                            case 16:
                            case 32:
                                i = 101376;
                                break;
                            case 64:
                                i = 202752;
                                break;
                            case 128:
                            case 256:
                                i = 414720;
                                break;
                            case 512:
                                i = 921600;
                                break;
                            case 1024:
                                i = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i = 2097152;
                                break;
                            case 8192:
                                i = 2228224;
                                break;
                            case 16384:
                                i = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i = 9437184;
                                break;
                            case 131072:
                            case 262144:
                            case 524288:
                                i = 35651584;
                                break;
                            default:
                                i = -1;
                                break;
                        }
                    } else {
                        i = 25344;
                    }
                    i3 = Math.max(i, i3);
                }
                i2 = Math.max(i3, zzeg.zza >= 21 ? 345600 : 172800);
            } else {
                i2 = 0;
            }
            zzd = i2;
        }
        return i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02c5 A[Catch: NumberFormatException -> 0x02d5, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x02d5, blocks: (B:125:0x026a, B:127:0x027c, B:138:0x0298, B:141:0x02c5), top: B:124:0x026a }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair zzb(zzad zzadVar) {
        char c;
        int parseInt;
        int parseInt2;
        int i;
        int i2;
        int i3;
        int i4;
        char c2;
        Integer num;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        char c3;
        Integer num2;
        Integer num3;
        String str = zzadVar.zzj;
        if (str == null) {
            return null;
        }
        String[] split = str.split("\\.");
        int i10 = 2;
        int i11 = 1;
        if ("video/dolby-vision".equals(zzadVar.zzm)) {
            String str2 = zzadVar.zzj;
            if (split.length < 3) {
                Log.w("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: ".concat(String.valueOf(str2)));
            } else {
                Matcher matcher = zzb.matcher(split[1]);
                if (matcher.matches()) {
                    String group = matcher.group(1);
                    if (group != null) {
                        switch (group.hashCode()) {
                            case 1536:
                                if (group.equals("00")) {
                                    c3 = 0;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1537:
                                if (group.equals("01")) {
                                    c3 = 1;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1538:
                                if (group.equals("02")) {
                                    c3 = 2;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1539:
                                if (group.equals("03")) {
                                    c3 = 3;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1540:
                                if (group.equals("04")) {
                                    c3 = 4;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1541:
                                if (group.equals("05")) {
                                    c3 = 5;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1542:
                                if (group.equals("06")) {
                                    c3 = 6;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1543:
                                if (group.equals("07")) {
                                    c3 = 7;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1544:
                                if (group.equals("08")) {
                                    c3 = '\b';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1545:
                                if (group.equals("09")) {
                                    c3 = '\t';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            default:
                                c3 = 65535;
                                break;
                        }
                        switch (c3) {
                            case 0:
                                num2 = 1;
                                break;
                            case 1:
                                num2 = 2;
                                break;
                            case 2:
                                num2 = 4;
                                break;
                            case 3:
                                num2 = 8;
                                break;
                            case 4:
                                num2 = 16;
                                break;
                            case 5:
                                num2 = 32;
                                break;
                            case 6:
                                num2 = 64;
                                break;
                            case 7:
                                num2 = 128;
                                break;
                            case '\b':
                                num2 = 256;
                                break;
                            case '\t':
                                num2 = 512;
                                break;
                        }
                        if (num2 != null) {
                            Log.w("MediaCodecUtil", "Unknown Dolby Vision profile string: ".concat(String.valueOf(group)));
                        } else {
                            String str3 = split[2];
                            if (str3 != null) {
                                int hashCode = str3.hashCode();
                                switch (hashCode) {
                                    case 1537:
                                        if (str3.equals("01")) {
                                            num3 = 1;
                                            break;
                                        }
                                        break;
                                    case 1538:
                                        if (str3.equals("02")) {
                                            num3 = 2;
                                            break;
                                        }
                                        break;
                                    case 1539:
                                        if (str3.equals("03")) {
                                            num3 = 4;
                                            break;
                                        }
                                        break;
                                    case 1540:
                                        if (str3.equals("04")) {
                                            num3 = 8;
                                            break;
                                        }
                                        break;
                                    case 1541:
                                        if (str3.equals("05")) {
                                            num3 = 16;
                                            break;
                                        }
                                        break;
                                    case 1542:
                                        if (str3.equals("06")) {
                                            num3 = 32;
                                            break;
                                        }
                                        break;
                                    case 1543:
                                        if (str3.equals("07")) {
                                            num3 = 64;
                                            break;
                                        }
                                        break;
                                    case 1544:
                                        if (str3.equals("08")) {
                                            num3 = 128;
                                            break;
                                        }
                                        break;
                                    case 1545:
                                        if (str3.equals("09")) {
                                            num3 = 256;
                                            break;
                                        }
                                        break;
                                    default:
                                        switch (hashCode) {
                                            case 1567:
                                                if (str3.equals("10")) {
                                                    num3 = 512;
                                                    break;
                                                }
                                                break;
                                            case 1568:
                                                if (str3.equals("11")) {
                                                    num3 = 1024;
                                                    break;
                                                }
                                                break;
                                            case 1569:
                                                if (str3.equals("12")) {
                                                    num3 = 2048;
                                                    break;
                                                }
                                                break;
                                            case 1570:
                                                if (str3.equals("13")) {
                                                    num3 = 4096;
                                                    break;
                                                }
                                                break;
                                        }
                                }
                                if (num3 == null) {
                                    return new Pair(num2, num3);
                                }
                                Log.w("MediaCodecUtil", "Unknown Dolby Vision level string: ".concat(String.valueOf(str3)));
                            }
                            num3 = null;
                            if (num3 == null) {
                            }
                        }
                    }
                    num2 = null;
                    if (num2 != null) {
                    }
                } else {
                    Log.w("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: ".concat(String.valueOf(str2)));
                }
            }
            return null;
        }
        String str4 = split[0];
        switch (str4.hashCode()) {
            case 3004662:
                if (str4.equals("av01")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 3006243:
                if (str4.equals("avc1")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 3006244:
                if (str4.equals("avc2")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3199032:
                if (str4.equals("hev1")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3214780:
                if (str4.equals("hvc1")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 3356560:
                if (str4.equals("mp4a")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 3624515:
                if (str4.equals("vp09")) {
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
            case 1:
                String str5 = zzadVar.zzj;
                int length = split.length;
                if (length < 2) {
                    Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(String.valueOf(str5)));
                } else {
                    try {
                        if (split[1].length() == 6) {
                            parseInt = Integer.parseInt(split[1].substring(0, 2), 16);
                            parseInt2 = Integer.parseInt(split[1].substring(4), 16);
                        } else if (length >= 3) {
                            parseInt = Integer.parseInt(split[1]);
                            parseInt2 = Integer.parseInt(split[2]);
                        } else {
                            Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str5);
                        }
                        if (parseInt == 66) {
                            i = -1;
                            i10 = 1;
                        } else if (parseInt == 77) {
                            i = -1;
                        } else if (parseInt == 88) {
                            i = -1;
                            i10 = 4;
                        } else if (parseInt == 100) {
                            i = -1;
                            i10 = 8;
                        } else if (parseInt == 110) {
                            i = -1;
                            i10 = 16;
                        } else if (parseInt == 122) {
                            i = -1;
                            i10 = 32;
                        } else if (parseInt != 244) {
                            i = -1;
                            i10 = -1;
                        } else {
                            i = -1;
                            i10 = 64;
                        }
                        if (i10 == i) {
                            Log.w("MediaCodecUtil", "Unknown AVC profile: " + parseInt);
                        } else {
                            switch (parseInt2) {
                                case 10:
                                    i2 = 1;
                                    break;
                                case 11:
                                    i2 = 4;
                                    break;
                                case 12:
                                    i2 = 8;
                                    break;
                                case 13:
                                    i2 = 16;
                                    break;
                                default:
                                    switch (parseInt2) {
                                        case 20:
                                            i2 = 32;
                                            break;
                                        case 21:
                                            i2 = 64;
                                            break;
                                        case 22:
                                            i2 = 128;
                                            break;
                                        default:
                                            switch (parseInt2) {
                                                case 30:
                                                    i2 = 256;
                                                    break;
                                                case 31:
                                                    i2 = 512;
                                                    break;
                                                case 32:
                                                    i2 = 1024;
                                                    break;
                                                default:
                                                    switch (parseInt2) {
                                                        case 40:
                                                            i2 = 2048;
                                                            break;
                                                        case 41:
                                                            i2 = 4096;
                                                            break;
                                                        case 42:
                                                            i2 = 8192;
                                                            break;
                                                        default:
                                                            switch (parseInt2) {
                                                                case 50:
                                                                    i2 = 16384;
                                                                    break;
                                                                case 51:
                                                                    i2 = 32768;
                                                                    break;
                                                                case 52:
                                                                    i2 = 65536;
                                                                    break;
                                                                default:
                                                                    i2 = -1;
                                                                    break;
                                                            }
                                                    }
                                            }
                                    }
                            }
                            if (i2 != -1) {
                                return new Pair(Integer.valueOf(i10), Integer.valueOf(i2));
                            }
                            Log.w("MediaCodecUtil", "Unknown AVC level: " + parseInt2);
                        }
                    } catch (NumberFormatException unused) {
                        Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(String.valueOf(str5)));
                    }
                }
                return null;
            case 2:
                String str6 = zzadVar.zzj;
                if (split.length < 3) {
                    Log.w("MediaCodecUtil", "Ignoring malformed VP9 codec string: ".concat(String.valueOf(str6)));
                } else {
                    try {
                        int parseInt3 = Integer.parseInt(split[1]);
                        int parseInt4 = Integer.parseInt(split[2]);
                        int i12 = parseInt3 != 0 ? parseInt3 != 1 ? parseInt3 != 2 ? parseInt3 != 3 ? -1 : 8 : 4 : 2 : 1;
                        if (i12 == -1) {
                            Log.w("MediaCodecUtil", "Unknown VP9 profile: " + parseInt3);
                        } else {
                            if (parseInt4 == 10) {
                                i3 = -1;
                            } else if (parseInt4 == 11) {
                                i3 = -1;
                                i11 = 2;
                            } else if (parseInt4 == 20) {
                                i3 = -1;
                                i11 = 4;
                            } else if (parseInt4 == 21) {
                                i3 = -1;
                                i11 = 8;
                            } else if (parseInt4 == 30) {
                                i3 = -1;
                                i11 = 16;
                            } else if (parseInt4 == 31) {
                                i3 = -1;
                                i11 = 32;
                            } else if (parseInt4 == 40) {
                                i3 = -1;
                                i11 = 64;
                            } else if (parseInt4 == 41) {
                                i3 = -1;
                                i11 = 128;
                            } else if (parseInt4 == 50) {
                                i3 = -1;
                                i11 = 256;
                            } else if (parseInt4 != 51) {
                                switch (parseInt4) {
                                    case 60:
                                        i3 = -1;
                                        i11 = 2048;
                                        break;
                                    case 61:
                                        i3 = -1;
                                        i11 = 4096;
                                        break;
                                    case 62:
                                        i3 = -1;
                                        i11 = 8192;
                                        break;
                                    default:
                                        i3 = -1;
                                        i11 = -1;
                                        break;
                                }
                            } else {
                                i3 = -1;
                                i11 = 512;
                            }
                            if (i11 != i3) {
                                return new Pair(Integer.valueOf(i12), Integer.valueOf(i11));
                            }
                            Log.w("MediaCodecUtil", "Unknown VP9 level: " + parseInt4);
                        }
                    } catch (NumberFormatException unused2) {
                        Log.w("MediaCodecUtil", "Ignoring malformed VP9 codec string: ".concat(String.valueOf(str6)));
                    }
                }
                return null;
            case 3:
            case 4:
                String str7 = zzadVar.zzj;
                if (split.length < 4) {
                    Log.w("MediaCodecUtil", "Ignoring malformed HEVC codec string: ".concat(String.valueOf(str7)));
                } else {
                    Matcher matcher2 = zzb.matcher(split[1]);
                    if (matcher2.matches()) {
                        String group2 = matcher2.group(1);
                        if ("1".equals(group2)) {
                            i4 = 1;
                        } else if ("2".equals(group2)) {
                            i4 = 2;
                        } else {
                            Log.w("MediaCodecUtil", "Unknown HEVC profile string: ".concat(String.valueOf(group2)));
                        }
                        String str8 = split[3];
                        if (str8 != null) {
                            switch (str8.hashCode()) {
                                case 70821:
                                    if (str8.equals("H30")) {
                                        c2 = '\r';
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 70914:
                                    if (str8.equals("H60")) {
                                        c2 = 14;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 70917:
                                    if (str8.equals("H63")) {
                                        c2 = 15;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 71007:
                                    if (str8.equals("H90")) {
                                        c2 = 16;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 71010:
                                    if (str8.equals("H93")) {
                                        c2 = 17;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 74665:
                                    if (str8.equals("L30")) {
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 74758:
                                    if (str8.equals("L60")) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 74761:
                                    if (str8.equals("L63")) {
                                        c2 = 2;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 74851:
                                    if (str8.equals("L90")) {
                                        c2 = 3;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 74854:
                                    if (str8.equals("L93")) {
                                        c2 = 4;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 2193639:
                                    if (str8.equals("H120")) {
                                        c2 = 18;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 2193642:
                                    if (str8.equals("H123")) {
                                        c2 = 19;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 2193732:
                                    if (str8.equals("H150")) {
                                        c2 = 20;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 2193735:
                                    if (str8.equals("H153")) {
                                        c2 = 21;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 2193738:
                                    if (str8.equals("H156")) {
                                        c2 = 22;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 2193825:
                                    if (str8.equals("H180")) {
                                        c2 = 23;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 2193828:
                                    if (str8.equals("H183")) {
                                        c2 = 24;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 2193831:
                                    if (str8.equals("H186")) {
                                        c2 = 25;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 2312803:
                                    if (str8.equals("L120")) {
                                        c2 = 5;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 2312806:
                                    if (str8.equals("L123")) {
                                        c2 = 6;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 2312896:
                                    if (str8.equals("L150")) {
                                        c2 = 7;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 2312899:
                                    if (str8.equals("L153")) {
                                        c2 = '\b';
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 2312902:
                                    if (str8.equals("L156")) {
                                        c2 = '\t';
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 2312989:
                                    if (str8.equals("L180")) {
                                        c2 = '\n';
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 2312992:
                                    if (str8.equals("L183")) {
                                        c2 = 11;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 2312995:
                                    if (str8.equals("L186")) {
                                        c2 = '\f';
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
                                    num = 1;
                                    break;
                                case 1:
                                    num = 4;
                                    break;
                                case 2:
                                    num = 16;
                                    break;
                                case 3:
                                    num = 64;
                                    break;
                                case 4:
                                    num = 256;
                                    break;
                                case 5:
                                    num = 1024;
                                    break;
                                case 6:
                                    num = 4096;
                                    break;
                                case 7:
                                    num = 16384;
                                    break;
                                case '\b':
                                    num = 65536;
                                    break;
                                case '\t':
                                    num = 262144;
                                    break;
                                case '\n':
                                    num = 1048576;
                                    break;
                                case 11:
                                    num = 4194304;
                                    break;
                                case '\f':
                                    num = 16777216;
                                    break;
                                case '\r':
                                    num = 2;
                                    break;
                                case 14:
                                    num = 8;
                                    break;
                                case 15:
                                    num = 32;
                                    break;
                                case 16:
                                    num = 128;
                                    break;
                                case 17:
                                    num = 512;
                                    break;
                                case 18:
                                    num = 2048;
                                    break;
                                case 19:
                                    num = 8192;
                                    break;
                                case 20:
                                    num = 32768;
                                    break;
                                case 21:
                                    num = 131072;
                                    break;
                                case 22:
                                    num = 524288;
                                    break;
                                case 23:
                                    num = 2097152;
                                    break;
                                case 24:
                                    num = 8388608;
                                    break;
                                case 25:
                                    num = 33554432;
                                    break;
                            }
                            if (num == null) {
                                return new Pair(Integer.valueOf(i4), num);
                            }
                            Log.w("MediaCodecUtil", "Unknown HEVC level string: ".concat(String.valueOf(str8)));
                        }
                        num = null;
                        if (num == null) {
                        }
                    } else {
                        Log.w("MediaCodecUtil", "Ignoring malformed HEVC codec string: ".concat(String.valueOf(str7)));
                    }
                }
                return null;
            case 5:
                String str9 = zzadVar.zzj;
                zzo zzoVar = zzadVar.zzy;
                if (split.length < 4) {
                    Log.w("MediaCodecUtil", "Ignoring malformed AV1 codec string: ".concat(String.valueOf(str9)));
                } else {
                    try {
                        int parseInt5 = Integer.parseInt(split[1]);
                        int parseInt6 = Integer.parseInt(split[2].substring(0, 2));
                        int parseInt7 = Integer.parseInt(split[3]);
                        if (parseInt5 != 0) {
                            Log.w("MediaCodecUtil", "Unknown AV1 profile: " + parseInt5);
                        } else {
                            if (parseInt7 == 8) {
                                i5 = 1;
                            } else if (parseInt7 != 10) {
                                Log.w("MediaCodecUtil", "Unknown AV1 bit depth: " + parseInt7);
                            } else {
                                i5 = (zzoVar == null || !(zzoVar.zze != null || (i7 = zzoVar.zzd) == 7 || i7 == 6)) ? 2 : 4096;
                            }
                            switch (parseInt6) {
                                case 0:
                                    i6 = 1;
                                    break;
                                case 1:
                                    i6 = 2;
                                    break;
                                case 2:
                                    i6 = 4;
                                    break;
                                case 3:
                                    i6 = 8;
                                    break;
                                case 4:
                                    i6 = 16;
                                    break;
                                case 5:
                                    i6 = 32;
                                    break;
                                case 6:
                                    i6 = 64;
                                    break;
                                case 7:
                                    i6 = 128;
                                    break;
                                case 8:
                                    i6 = 256;
                                    break;
                                case 9:
                                    i6 = 512;
                                    break;
                                case 10:
                                    i6 = 1024;
                                    break;
                                case 11:
                                    i6 = 2048;
                                    break;
                                case 12:
                                    i6 = 4096;
                                    break;
                                case 13:
                                    i6 = 8192;
                                    break;
                                case 14:
                                    i6 = 16384;
                                    break;
                                case 15:
                                    i6 = 32768;
                                    break;
                                case 16:
                                    i6 = 65536;
                                    break;
                                case 17:
                                    i6 = 131072;
                                    break;
                                case 18:
                                    i6 = 262144;
                                    break;
                                case 19:
                                    i6 = 524288;
                                    break;
                                case 20:
                                    i6 = 1048576;
                                    break;
                                case 21:
                                    i6 = 2097152;
                                    break;
                                case 22:
                                    i6 = 4194304;
                                    break;
                                case 23:
                                    i6 = 8388608;
                                    break;
                                default:
                                    i6 = -1;
                                    break;
                            }
                            if (i6 != -1) {
                                return new Pair(Integer.valueOf(i5), Integer.valueOf(i6));
                            }
                            Log.w("MediaCodecUtil", "Unknown AV1 level: " + parseInt6);
                        }
                    } catch (NumberFormatException unused3) {
                        Log.w("MediaCodecUtil", "Ignoring malformed AV1 codec string: ".concat(String.valueOf(str9)));
                    }
                }
                return null;
            case 6:
                String str10 = zzadVar.zzj;
                if (split.length != 3) {
                    Log.w("MediaCodecUtil", "Ignoring malformed MP4A codec string: ".concat(String.valueOf(str10)));
                } else {
                    try {
                        if ("audio/mp4a-latm".equals(zzbo.zzd(Integer.parseInt(split[1], 16)))) {
                            int parseInt8 = Integer.parseInt(split[2]);
                            if (parseInt8 != 17) {
                                if (parseInt8 == 20) {
                                    i9 = -1;
                                    i8 = 20;
                                } else if (parseInt8 == 23) {
                                    i8 = 23;
                                } else if (parseInt8 == 29) {
                                    i8 = 29;
                                } else if (parseInt8 == 39) {
                                    i8 = 39;
                                } else if (parseInt8 != 42) {
                                    switch (parseInt8) {
                                        case 1:
                                            i9 = -1;
                                            i8 = 1;
                                            break;
                                        case 2:
                                            i9 = -1;
                                            i8 = 2;
                                            break;
                                        case 3:
                                            i9 = -1;
                                            i8 = 3;
                                            break;
                                        case 4:
                                            i9 = -1;
                                            i8 = 4;
                                            break;
                                        case 5:
                                            i9 = -1;
                                            i8 = 5;
                                            break;
                                        case 6:
                                            i9 = -1;
                                            i8 = 6;
                                            break;
                                        default:
                                            i9 = -1;
                                            i8 = -1;
                                            break;
                                    }
                                } else {
                                    i8 = 42;
                                }
                                if (i8 != i9) {
                                    return new Pair(Integer.valueOf(i8), 0);
                                }
                            } else {
                                i8 = 17;
                            }
                            i9 = -1;
                            if (i8 != i9) {
                            }
                        }
                    } catch (NumberFormatException unused4) {
                        Log.w("MediaCodecUtil", "Ignoring malformed MP4A codec string: ".concat(String.valueOf(str10)));
                    }
                }
                return null;
            default:
                return null;
        }
    }

    public static zzqg zzc(String str, boolean z, boolean z2) throws zzqs {
        List zzf = zzf(str, false, false);
        if (zzf.isEmpty()) {
            return null;
        }
        return (zzqg) zzf.get(0);
    }

    public static zzqg zzd() throws zzqs {
        return zzc("audio/raw", false, false);
    }

    public static String zze(zzad zzadVar) {
        Pair zzb2;
        if ("audio/eac3-joc".equals(zzadVar.zzm)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(zzadVar.zzm) || (zzb2 = zzb(zzadVar)) == null) {
            return null;
        }
        int intValue = ((Integer) zzb2.first).intValue();
        if (intValue == 16 || intValue == 256) {
            return "video/hevc";
        }
        if (intValue == 512) {
            return "video/avc";
        }
        return null;
    }

    public static synchronized List zzf(String str, boolean z, boolean z2) throws zzqs {
        int i;
        synchronized (zzqy.class) {
            zzqq zzqqVar = new zzqq(str, z, z2);
            HashMap hashMap = zzc;
            List list = (List) hashMap.get(zzqqVar);
            if (list != null) {
                return list;
            }
            ArrayList zzh = zzh(zzqqVar, zzeg.zza >= 21 ? new zzqw(z, z2) : new zzqv(null));
            if (z && zzh.isEmpty() && (i = zzeg.zza) >= 21 && i <= 23) {
                zzh = zzh(zzqqVar, new zzqv(null));
                if (!zzh.isEmpty()) {
                    Log.w("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((zzqg) zzh.get(0)).zza);
                }
            }
            if ("audio/raw".equals(str)) {
                if (zzeg.zza < 26 && zzeg.zzb.equals("R9") && zzh.size() == 1 && ((zzqg) zzh.get(0)).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    zzh.add(zzqg.zzc("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
                }
                zzi(zzh, new zzqx() { // from class: com.google.android.gms.internal.ads.zzqo
                    @Override // com.google.android.gms.internal.ads.zzqx
                    public final int zza(Object obj) {
                        int i2 = zzqy.zza;
                        String str2 = ((zzqg) obj).zza;
                        if (str2.startsWith("OMX.google") || str2.startsWith("c2.android")) {
                            return 1;
                        }
                        return (zzeg.zza >= 26 || !str2.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
                    }
                });
            }
            if (zzeg.zza < 21 && zzh.size() > 1) {
                String str2 = ((zzqg) zzh.get(0)).zza;
                if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                    zzi(zzh, new zzqx() { // from class: com.google.android.gms.internal.ads.zzqp
                        @Override // com.google.android.gms.internal.ads.zzqx
                        public final int zza(Object obj) {
                            int i2 = zzqy.zza;
                            return ((zzqg) obj).zza.startsWith("OMX.google") ? 1 : 0;
                        }
                    });
                }
            }
            if (zzeg.zza < 32 && zzh.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzqg) zzh.get(0)).zza)) {
                zzh.add((zzqg) zzh.remove(0));
            }
            zzfrh zzm = zzfrh.zzm(zzh);
            hashMap.put(zzqqVar, zzm);
            return zzm;
        }
    }

    public static List zzg(List list, final zzad zzadVar) {
        ArrayList arrayList = new ArrayList(list);
        zzi(arrayList, new zzqx() { // from class: com.google.android.gms.internal.ads.zzqm
            @Override // com.google.android.gms.internal.ads.zzqx
            public final int zza(Object obj) {
                zzad zzadVar2 = zzad.this;
                zzqg zzqgVar = (zzqg) obj;
                int i = zzqy.zza;
                try {
                    return !zzqgVar.zzd(zzadVar2) ? 0 : 1;
                } catch (zzqs unused) {
                    return -1;
                }
            }
        });
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x0254, code lost:
    
        if (r1.zzb == false) goto L154;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0209 A[Catch: Exception -> 0x02b2, TryCatch #5 {Exception -> 0x02b2, blocks: (B:95:0x01d8, B:99:0x01ef, B:103:0x0203, B:105:0x0209, B:106:0x0218, B:108:0x0222, B:110:0x024c, B:158:0x0227, B:160:0x0237, B:162:0x023f, B:166:0x020f), top: B:94:0x01d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0222 A[Catch: Exception -> 0x02b2, TryCatch #5 {Exception -> 0x02b2, blocks: (B:95:0x01d8, B:99:0x01ef, B:103:0x0203, B:105:0x0209, B:106:0x0218, B:108:0x0222, B:110:0x024c, B:158:0x0227, B:160:0x0237, B:162:0x023f, B:166:0x020f), top: B:94:0x01d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02c1 A[Catch: Exception -> 0x030f, TRY_ENTER, TryCatch #1 {Exception -> 0x030f, blocks: (B:3:0x0008, B:5:0x001c, B:7:0x0026, B:12:0x0033, B:16:0x0041, B:18:0x0047, B:20:0x004d, B:22:0x0055, B:24:0x005d, B:26:0x0065, B:28:0x006d, B:30:0x0075, B:32:0x007d, B:35:0x0085, B:37:0x008d, B:39:0x0095, B:41:0x009d, B:43:0x00a7, B:45:0x00b1, B:47:0x00bb, B:49:0x00c5, B:51:0x00cf, B:53:0x00d9, B:55:0x00e3, B:57:0x00ed, B:60:0x00f5, B:62:0x00fd, B:64:0x0105, B:66:0x010f, B:68:0x0119, B:70:0x0121, B:72:0x012b, B:74:0x0135, B:76:0x0139, B:78:0x0141, B:80:0x0149, B:82:0x014f, B:84:0x0157, B:86:0x015f, B:88:0x0167, B:119:0x02b9, B:122:0x02c1, B:124:0x02c7, B:127:0x02e1, B:128:0x0302, B:90:0x0171, B:178:0x0176, B:180:0x017e, B:183:0x0189, B:185:0x0191, B:189:0x019c, B:191:0x01a4, B:194:0x01af, B:196:0x01b7, B:199:0x01c2, B:201:0x01ca), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02e1 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0252 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0227 A[Catch: Exception -> 0x02b2, TryCatch #5 {Exception -> 0x02b2, blocks: (B:95:0x01d8, B:99:0x01ef, B:103:0x0203, B:105:0x0209, B:106:0x0218, B:108:0x0222, B:110:0x024c, B:158:0x0227, B:160:0x0237, B:162:0x023f, B:166:0x020f), top: B:94:0x01d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x020f A[Catch: Exception -> 0x02b2, TryCatch #5 {Exception -> 0x02b2, blocks: (B:95:0x01d8, B:99:0x01ef, B:103:0x0203, B:105:0x0209, B:106:0x0218, B:108:0x0222, B:110:0x024c, B:158:0x0227, B:160:0x0237, B:162:0x023f, B:166:0x020f), top: B:94:0x01d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0200  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static ArrayList zzh(zzqq zzqqVar, zzqt zzqtVar) throws zzqs {
        String str;
        String str2;
        String str3;
        int i;
        int i2;
        String str4;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean zzd2;
        boolean zzc2;
        boolean isHardwareAccelerated;
        boolean zzj;
        boolean z;
        zzqq zzqqVar2 = zzqqVar;
        zzqt zzqtVar2 = zzqtVar;
        try {
            ArrayList arrayList = new ArrayList();
            String str5 = zzqqVar2.zza;
            int zza2 = zzqtVar.zza();
            boolean zze = zzqtVar.zze();
            int i3 = 0;
            while (i3 < zza2) {
                MediaCodecInfo zzb2 = zzqtVar2.zzb(i3);
                if (zzeg.zza < 29 || !zzb2.isAlias()) {
                    String name = zzb2.getName();
                    if (!zzb2.isEncoder() && ((zze || !name.endsWith(".secure")) && ((zzeg.zza >= 21 || (!"CIPAACDecoder".equals(name) && !"CIPMP3Decoder".equals(name) && !"CIPVorbisDecoder".equals(name) && !"CIPAMRNBDecoder".equals(name) && !"AACDecoder".equals(name) && !"MP3Decoder".equals(name))) && ((zzeg.zza >= 24 || ((!"OMX.SEC.aac.dec".equals(name) && !"OMX.Exynos.AAC.Decoder".equals(name)) || !"samsung".equals(zzeg.zzc) || (!zzeg.zzb.startsWith("zeroflte") && !zzeg.zzb.startsWith("zerolte") && !zzeg.zzb.startsWith("zenlte") && !"SC-05G".equals(zzeg.zzb) && !"marinelteatt".equals(zzeg.zzb) && !"404SC".equals(zzeg.zzb) && !"SC-04G".equals(zzeg.zzb) && !"SCV31".equals(zzeg.zzb)))) && ((zzeg.zza > 19 || !"OMX.SEC.vp8.dec".equals(name) || !"samsung".equals(zzeg.zzc) || (!zzeg.zzb.startsWith("d2") && !zzeg.zzb.startsWith("serrano") && !zzeg.zzb.startsWith("jflte") && !zzeg.zzb.startsWith("santos") && !zzeg.zzb.startsWith("t0"))) && ((zzeg.zza > 19 || !zzeg.zzb.startsWith("jflte") || !"OMX.qcom.video.decoder.vp8".equals(name)) && (zzeg.zza > 23 || !"audio/eac3-joc".equals(str5) || !"OMX.MTK.AUDIO.DECODER.DSPAC3".equals(name)))))))) {
                        String[] supportedTypes = zzb2.getSupportedTypes();
                        int length = supportedTypes.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 < length) {
                                str = supportedTypes[i4];
                                if (str.equalsIgnoreCase(str5)) {
                                    break;
                                }
                                i4++;
                            } else if (str5.equals("video/dolby-vision")) {
                                if ("OMX.MS.HEVCDV.Decoder".equals(name)) {
                                    str = "video/hevcdv";
                                } else {
                                    if ("OMX.RTK.video.decoder".equals(name) || "OMX.realtek.video.decoder.tunneled".equals(name)) {
                                        str = "video/dv_hevc";
                                    }
                                    str2 = null;
                                }
                            } else if (str5.equals("audio/alac") && "OMX.lge.alac.decoder".equals(name)) {
                                str = "audio/x-lg-alac";
                            } else if (str5.equals("audio/flac") && "OMX.lge.flac.decoder".equals(name)) {
                                str = "audio/x-lg-flac";
                            } else {
                                if (str5.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(name)) {
                                    str = "audio/lg-ac3";
                                }
                                str2 = null;
                            }
                        }
                        str2 = str;
                        if (str2 != null) {
                            try {
                                capabilitiesForType = zzb2.getCapabilitiesForType(str2);
                                zzd2 = zzqtVar2.zzd("tunneled-playback", str2, capabilitiesForType);
                                zzc2 = zzqtVar2.zzc("tunneled-playback", str2, capabilitiesForType);
                            } catch (Exception e) {
                                e = e;
                                str3 = name;
                                i = i3;
                                i2 = zza2;
                                str4 = str5;
                            }
                            if (zzqqVar2.zzc) {
                                if (!zzd2) {
                                }
                                boolean zzd3 = zzqtVar2.zzd("secure-playback", str2, capabilitiesForType);
                                boolean zzc3 = zzqtVar2.zzc("secure-playback", str2, capabilitiesForType);
                                if (zzqqVar2.zzb) {
                                }
                                i3 = i + 1;
                                zzqqVar2 = zzqqVar;
                                str5 = str4;
                                zza2 = i2;
                                zzqtVar2 = zzqtVar;
                            } else if (!zzc2) {
                                boolean zzd32 = zzqtVar2.zzd("secure-playback", str2, capabilitiesForType);
                                boolean zzc32 = zzqtVar2.zzc("secure-playback", str2, capabilitiesForType);
                                if (zzqqVar2.zzb) {
                                    if (!zzc32) {
                                        isHardwareAccelerated = zzeg.zza < 29 ? zzb2.isHardwareAccelerated() : !zzj(zzb2, str5);
                                        zzj = zzj(zzb2, str5);
                                        if (zzeg.zza < 29) {
                                            z = zzb2.isVendor();
                                        } else {
                                            String zza3 = zzfoa.zza(zzb2.getName());
                                            z = (zza3.startsWith("omx.google.") || zza3.startsWith("c2.android.") || zza3.startsWith("c2.google.")) ? false : true;
                                        }
                                        if (zze || zzqqVar2.zzb != zzd32) {
                                            if (!zze) {
                                                try {
                                                } catch (Exception e2) {
                                                    e = e2;
                                                    i = i3;
                                                    i2 = zza2;
                                                    str4 = str5;
                                                    str3 = name;
                                                    if (zzeg.zza > 23) {
                                                    }
                                                    Log.e("MediaCodecUtil", "Failed to query codec " + str3 + " (" + str2 + ")");
                                                    throw e;
                                                }
                                            }
                                            i = i3;
                                            i2 = zza2;
                                            str4 = str5;
                                            if (!zze && zzd32) {
                                                StringBuilder sb = new StringBuilder();
                                                try {
                                                    sb.append(name);
                                                    sb.append(".secure");
                                                    str3 = name;
                                                } catch (Exception e3) {
                                                    e = e3;
                                                    str3 = name;
                                                }
                                                try {
                                                    arrayList.add(zzqg.zzc(sb.toString(), str4, str2, capabilitiesForType, isHardwareAccelerated, zzj, z, false, true));
                                                    return arrayList;
                                                } catch (Exception e4) {
                                                    e = e4;
                                                    if (zzeg.zza > 23 || arrayList.isEmpty()) {
                                                        Log.e("MediaCodecUtil", "Failed to query codec " + str3 + " (" + str2 + ")");
                                                        throw e;
                                                    }
                                                    Log.e("MediaCodecUtil", "Skipping codec " + str3 + " (failed to query capabilities)");
                                                    i3 = i + 1;
                                                    zzqqVar2 = zzqqVar;
                                                    str5 = str4;
                                                    zza2 = i2;
                                                    zzqtVar2 = zzqtVar;
                                                }
                                            }
                                        }
                                        i = i3;
                                        i2 = zza2;
                                        str4 = str5;
                                        try {
                                            arrayList.add(zzqg.zzc(name, str5, str2, capabilitiesForType, isHardwareAccelerated, zzj, z, false, false));
                                        } catch (Exception e5) {
                                            e = e5;
                                            str3 = name;
                                            if (zzeg.zza > 23) {
                                            }
                                            Log.e("MediaCodecUtil", "Failed to query codec " + str3 + " (" + str2 + ")");
                                            throw e;
                                        }
                                    }
                                } else if (zzd32) {
                                    zzd32 = true;
                                    if (zzeg.zza < 29) {
                                    }
                                    zzj = zzj(zzb2, str5);
                                    if (zzeg.zza < 29) {
                                    }
                                    if (zze) {
                                    }
                                    if (!zze) {
                                    }
                                    i = i3;
                                    i2 = zza2;
                                    str4 = str5;
                                    if (!zze) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(name);
                                        sb2.append(".secure");
                                        str3 = name;
                                        arrayList.add(zzqg.zzc(sb2.toString(), str4, str2, capabilitiesForType, isHardwareAccelerated, zzj, z, false, true));
                                        return arrayList;
                                    }
                                    continue;
                                }
                                i3 = i + 1;
                                zzqqVar2 = zzqqVar;
                                str5 = str4;
                                zza2 = i2;
                                zzqtVar2 = zzqtVar;
                            }
                        }
                    }
                }
                i = i3;
                i2 = zza2;
                str4 = str5;
                i3 = i + 1;
                zzqqVar2 = zzqqVar;
                str5 = str4;
                zza2 = i2;
                zzqtVar2 = zzqtVar;
            }
            return arrayList;
        } catch (Exception e6) {
            throw new zzqs(e6, null);
        }
    }

    private static void zzi(List list, final zzqx zzqxVar) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzqn
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                zzqx zzqxVar2 = zzqx.this;
                int i = zzqy.zza;
                return zzqxVar2.zza(obj2) - zzqxVar2.zza(obj);
            }
        });
    }

    private static boolean zzj(MediaCodecInfo mediaCodecInfo, String str) {
        if (zzeg.zza >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (zzbo.zzg(str)) {
            return true;
        }
        String zza2 = zzfoa.zza(mediaCodecInfo.getName());
        if (zza2.startsWith("arc.")) {
            return false;
        }
        if (zza2.startsWith("omx.google.") || zza2.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((zza2.startsWith("omx.sec.") && zza2.contains(".sw.")) || zza2.equals("omx.qcom.video.decoder.hevcswvdec") || zza2.startsWith("c2.android.") || zza2.startsWith("c2.google.")) {
            return true;
        }
        return (zza2.startsWith("omx.") || zza2.startsWith("c2.")) ? false : true;
    }
}
