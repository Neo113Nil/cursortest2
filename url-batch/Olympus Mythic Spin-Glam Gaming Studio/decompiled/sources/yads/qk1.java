package yads;

import android.media.MediaCodecInfo;
import android.util.Base64;
import android.util.Pair;
import com.inmobi.media.core.config.models.AdConfig;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.Charsets;

/* loaded from: classes5.dex */
public abstract class qk1 {
    public static final Pattern a;
    public static final HashMap b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public static int j;

    static {
        rk1 rk1Var = tk2.e;
        a = Pattern.compile("^\\D?(\\d+)$");
        b = new HashMap();
        c = rk1Var.b();
        d = rk1Var.c();
        e = rk1Var.O();
        f = rk1Var.q();
        g = rk1Var.r();
        h = rk1Var.a();
        i = rk1Var.F();
        j = -1;
    }

    public static synchronized List a(String str, boolean z, boolean z2) {
        synchronized (qk1.class) {
            try {
                kk1 kk1Var = new kk1(str, z, z2);
                HashMap hashMap = b;
                List list = (List) hashMap.get(kk1Var);
                if (list != null) {
                    return list;
                }
                int i2 = sb3.a;
                ArrayList a2 = a(kk1Var, i2 >= 21 ? new ok1(z, z2) : new nk1());
                if (z && a2.isEmpty() && 21 <= i2 && i2 <= 23) {
                    a2 = a(kk1Var, new nk1());
                    if (!a2.isEmpty()) {
                        gh1.d("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((ck1) a2.get(0)).a);
                    }
                }
                a(str, a2);
                l41 a3 = l41.a(a2);
                hashMap.put(kk1Var, a3);
                return a3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x043c A[Catch: NumberFormatException -> 0x044d, TRY_LEAVE, TryCatch #2 {NumberFormatException -> 0x044d, blocks: (B:272:0x03e3, B:274:0x03f5, B:285:0x0412, B:288:0x043c), top: B:271:0x03e3 }] */
    /* JADX WARN: Removed duplicated region for block: B:292:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:327:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x06d5  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x06dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair b(jw0 jw0Var) {
        int i2;
        int parseInt;
        int i3;
        int parseInt2;
        int i4;
        int i5;
        int i6;
        int i7;
        Integer num;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Integer num2;
        char c2;
        Integer num3;
        char c3;
        char c4;
        char c5;
        int i13;
        int i14 = 1;
        String str = jw0Var.j;
        if (str == null) {
            return null;
        }
        String[] split = str.split("\\.");
        if ("video/dolby-vision".equals(jw0Var.m)) {
            String str2 = jw0Var.j;
            if (split.length < 3) {
                jk1.a("Ignoring malformed Dolby Vision codec string: ", str2, "MediaCodecUtil");
                return null;
            }
            Matcher matcher = a.matcher(split[1]);
            if (!matcher.matches()) {
                jk1.a("Ignoring malformed Dolby Vision codec string: ", str2, "MediaCodecUtil");
                return null;
            }
            String group = matcher.group(1);
            if (group != null) {
                switch (group.hashCode()) {
                    case 1536:
                        if (group.equals("00")) {
                            c5 = 0;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1537:
                        if (group.equals("01")) {
                            c5 = 1;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1538:
                        if (group.equals("02")) {
                            c5 = 2;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1539:
                        if (group.equals("03")) {
                            c5 = 3;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1540:
                        if (group.equals("04")) {
                            c5 = 4;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1541:
                        if (group.equals("05")) {
                            c5 = 5;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1542:
                        if (group.equals("06")) {
                            c5 = 6;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1543:
                        if (group.equals("07")) {
                            c5 = 7;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1544:
                        if (group.equals("08")) {
                            c5 = '\b';
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1545:
                        if (group.equals("09")) {
                            c5 = '\t';
                            break;
                        }
                        c5 = 65535;
                        break;
                    default:
                        c5 = 65535;
                        break;
                }
                switch (c5) {
                    case 0:
                        c2 = 2;
                        num2 = 1;
                        break;
                    case 1:
                        c2 = 2;
                        num2 = 2;
                        break;
                    case 2:
                        num2 = 4;
                        c2 = 2;
                        break;
                    case 3:
                        num2 = 8;
                        c2 = 2;
                        break;
                    case 4:
                        i13 = 16;
                        num2 = i13;
                        c2 = 2;
                        break;
                    case 5:
                        i13 = 32;
                        num2 = i13;
                        c2 = 2;
                        break;
                    case 6:
                        i13 = 64;
                        num2 = i13;
                        c2 = 2;
                        break;
                    case 7:
                        i13 = 128;
                        num2 = i13;
                        c2 = 2;
                        break;
                    case '\b':
                        i13 = 256;
                        num2 = i13;
                        c2 = 2;
                        break;
                    case '\t':
                        i13 = 512;
                        num2 = i13;
                        c2 = 2;
                        break;
                }
                if (num2 != null) {
                    jk1.a("Unknown Dolby Vision profile string: ", group, "MediaCodecUtil");
                    return null;
                }
                String str3 = split[c2];
                if (str3 != null) {
                    switch (str3.hashCode()) {
                        case 1537:
                            if (str3.equals("01")) {
                                c3 = 0;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1538:
                            if (str3.equals("02")) {
                                c3 = 1;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1539:
                            if (str3.equals("03")) {
                                c3 = 2;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1540:
                            if (str3.equals("04")) {
                                c3 = 3;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1541:
                            if (str3.equals("05")) {
                                c3 = 4;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1542:
                            if (str3.equals("06")) {
                                c3 = 5;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1543:
                            if (str3.equals("07")) {
                                c3 = 6;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1544:
                            if (str3.equals("08")) {
                                c3 = 7;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1545:
                            if (str3.equals("09")) {
                                c3 = '\b';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1567:
                            if (str3.equals("10")) {
                                c4 = '\t';
                                c3 = c4;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1568:
                            if (str3.equals("11")) {
                                c3 = '\n';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1569:
                            if (str3.equals("12")) {
                                c4 = 11;
                                c3 = c4;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1570:
                            if (str3.equals("13")) {
                                c4 = '\f';
                                c3 = c4;
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
                            num3 = 1;
                            break;
                        case 1:
                            num3 = 2;
                            break;
                        case 2:
                            num3 = 4;
                            break;
                        case 3:
                            num3 = 8;
                            break;
                        case 4:
                            num3 = 16;
                            break;
                        case 5:
                            num3 = 32;
                            break;
                        case 6:
                            num3 = 64;
                            break;
                        case 7:
                            num3 = 128;
                            break;
                        case '\b':
                            num3 = 256;
                            break;
                        case '\t':
                            num3 = 512;
                            break;
                        case '\n':
                            num3 = 1024;
                            break;
                        case 11:
                            num3 = 2048;
                            break;
                        case '\f':
                            num3 = 4096;
                            break;
                    }
                    if (num3 == null) {
                        return new Pair(num2, num3);
                    }
                    jk1.a("Unknown Dolby Vision level string: ", str3, "MediaCodecUtil");
                    return null;
                }
                num3 = null;
                if (num3 == null) {
                }
            }
            num2 = null;
            c2 = 2;
            if (num2 != null) {
            }
        } else if (c.equals(split[0]) || d.equals(split[0])) {
            String str4 = jw0Var.j;
            if (split.length < 2) {
                jk1.a("Ignoring malformed AVC codec string: ", str4, "MediaCodecUtil");
                return null;
            }
            try {
                if (split[1].length() == 6) {
                    parseInt = Integer.parseInt(split[1].substring(0, 2), 16);
                    i2 = 4;
                    parseInt2 = Integer.parseInt(split[1].substring(4), 16);
                    i3 = 2;
                } else {
                    i2 = 4;
                    if (split.length < 3) {
                        gh1.d("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str4);
                        return null;
                    }
                    parseInt = Integer.parseInt(split[1]);
                    i3 = 2;
                    parseInt2 = Integer.parseInt(split[2]);
                }
                if (parseInt == 66) {
                    i4 = 1;
                } else if (parseInt == 77) {
                    i4 = i3;
                } else if (parseInt == 88) {
                    i4 = i2;
                } else if (parseInt == 100) {
                    i4 = 8;
                } else if (parseInt == 110) {
                    i4 = 16;
                } else if (parseInt == 122) {
                    i4 = 32;
                } else {
                    if (parseInt != 244) {
                        i5 = -1;
                        i4 = -1;
                        if (i4 != i5) {
                            mf1.a(parseInt, "Unknown AVC profile: ", "MediaCodecUtil");
                            return null;
                        }
                        switch (parseInt2) {
                            case 10:
                                i6 = -1;
                                break;
                            case 11:
                                i14 = i2;
                                i6 = -1;
                                break;
                            case 12:
                                i14 = 8;
                                i6 = -1;
                                break;
                            case 13:
                                i14 = 16;
                                i6 = -1;
                                break;
                            default:
                                switch (parseInt2) {
                                    case 20:
                                        i14 = 32;
                                        i6 = -1;
                                        break;
                                    case 21:
                                        i14 = 64;
                                        i6 = -1;
                                        break;
                                    case 22:
                                        i14 = 128;
                                        i6 = -1;
                                        break;
                                    default:
                                        switch (parseInt2) {
                                            case 30:
                                                i14 = 256;
                                                i6 = -1;
                                                break;
                                            case 31:
                                                i14 = 512;
                                                i6 = -1;
                                                break;
                                            case 32:
                                                i14 = 1024;
                                                i6 = -1;
                                                break;
                                            default:
                                                switch (parseInt2) {
                                                    case 40:
                                                        i14 = 2048;
                                                        i6 = -1;
                                                        break;
                                                    case 41:
                                                        i14 = 4096;
                                                        i6 = -1;
                                                        break;
                                                    case 42:
                                                        i14 = 8192;
                                                        i6 = -1;
                                                        break;
                                                    default:
                                                        switch (parseInt2) {
                                                            case 50:
                                                                i14 = 16384;
                                                                i6 = -1;
                                                                break;
                                                            case 51:
                                                                i14 = 32768;
                                                                i6 = -1;
                                                                break;
                                                            case 52:
                                                                i14 = 65536;
                                                                i6 = -1;
                                                                break;
                                                            default:
                                                                i6 = -1;
                                                                i14 = -1;
                                                                break;
                                                        }
                                                }
                                        }
                                }
                        }
                        if (i14 != i6) {
                            return new Pair(Integer.valueOf(i4), Integer.valueOf(i14));
                        }
                        mf1.a(parseInt2, "Unknown AVC level: ", "MediaCodecUtil");
                        return null;
                    }
                    i4 = 64;
                }
                i5 = -1;
                if (i4 != i5) {
                }
            } catch (NumberFormatException unused) {
                jk1.a("Ignoring malformed AVC codec string: ", str4, "MediaCodecUtil");
                return null;
            }
        } else if (e.equals(split[0])) {
            String str5 = jw0Var.j;
            if (split.length < 3) {
                jk1.a("Ignoring malformed VP9 codec string: ", str5, "MediaCodecUtil");
                return null;
            }
            try {
                int parseInt3 = Integer.parseInt(split[1]);
                int parseInt4 = Integer.parseInt(split[2]);
                int i15 = parseInt3 != 0 ? parseInt3 != 1 ? parseInt3 != 2 ? parseInt3 != 3 ? -1 : 8 : 4 : 2 : 1;
                if (i15 == -1) {
                    mf1.a(parseInt3, "Unknown VP9 profile: ", "MediaCodecUtil");
                    return null;
                }
                if (parseInt4 != 10) {
                    if (parseInt4 == 11) {
                        i12 = -1;
                        i14 = 2;
                    } else if (parseInt4 == 20) {
                        i12 = -1;
                        i14 = 4;
                    } else if (parseInt4 == 21) {
                        i12 = -1;
                        i14 = 8;
                    } else if (parseInt4 == 30) {
                        i14 = 16;
                    } else if (parseInt4 == 31) {
                        i14 = 32;
                    } else if (parseInt4 == 40) {
                        i14 = 64;
                    } else if (parseInt4 == 41) {
                        i14 = 128;
                    } else if (parseInt4 == 50) {
                        i14 = 256;
                    } else if (parseInt4 != 51) {
                        switch (parseInt4) {
                            case 60:
                                i14 = 2048;
                                break;
                            case 61:
                                i14 = 4096;
                                break;
                            case 62:
                                i14 = 8192;
                                break;
                            default:
                                i12 = -1;
                                i14 = -1;
                                break;
                        }
                    } else {
                        i14 = 512;
                    }
                    if (i14 == i12) {
                        return new Pair(Integer.valueOf(i15), Integer.valueOf(i14));
                    }
                    mf1.a(parseInt4, "Unknown VP9 level: ", "MediaCodecUtil");
                    return null;
                }
                i12 = -1;
                if (i14 == i12) {
                }
            } catch (NumberFormatException unused2) {
                jk1.a("Ignoring malformed VP9 codec string: ", str5, "MediaCodecUtil");
                return null;
            }
        } else if (f.equals(split[0]) || g.equals(split[0])) {
            String str6 = jw0Var.j;
            if (split.length < 4) {
                jk1.a("Ignoring malformed HEVC codec string: ", str6, "MediaCodecUtil");
                return null;
            }
            Matcher matcher2 = a.matcher(split[1]);
            if (!matcher2.matches()) {
                jk1.a("Ignoring malformed HEVC codec string: ", str6, "MediaCodecUtil");
                return null;
            }
            String group2 = matcher2.group(1);
            if ("1".equals(group2)) {
                i7 = 1;
            } else {
                if (!"2".equals(group2)) {
                    jk1.a("Unknown HEVC profile string: ", group2, "MediaCodecUtil");
                    return null;
                }
                i7 = 2;
            }
            String str7 = split[3];
            if (str7 != null) {
                rk1 rk1Var = tk2.e;
                if (rk1Var.A().equals(str7)) {
                    num = 1;
                } else if (rk1Var.B().equals(str7)) {
                    num = 4;
                } else if (rk1Var.C().equals(str7)) {
                    num = 16;
                } else if (rk1Var.D().equals(str7)) {
                    num = 64;
                } else if (rk1Var.E().equals(str7)) {
                    num = 256;
                } else if (rk1Var.s().equals(str7)) {
                    num = 1024;
                } else if (rk1Var.t().equals(str7)) {
                    num = 4096;
                } else if (rk1Var.u().equals(str7)) {
                    num = 16384;
                } else if (rk1Var.v().equals(str7)) {
                    num = 65536;
                } else if (rk1Var.w().equals(str7)) {
                    num = 262144;
                } else if (rk1Var.x().equals(str7)) {
                    num = 1048576;
                } else if (rk1Var.y().equals(str7)) {
                    num = 4194304;
                } else if (rk1Var.z().equals(str7)) {
                    num = 16777216;
                } else if (rk1Var.l().equals(str7)) {
                    num = 2;
                } else if (rk1Var.m().equals(str7)) {
                    num = 8;
                } else if (rk1Var.n().equals(str7)) {
                    num = 32;
                } else if (rk1Var.o().equals(str7)) {
                    num = 128;
                } else if (rk1Var.p().equals(str7)) {
                    num = 512;
                } else if (rk1Var.d().equals(str7)) {
                    num = 2048;
                } else if (rk1Var.e().equals(str7)) {
                    num = 8192;
                } else if (rk1Var.f().equals(str7)) {
                    num = 32768;
                } else if (rk1Var.g().equals(str7)) {
                    num = 131072;
                } else if (rk1Var.h().equals(str7)) {
                    num = 524288;
                } else if (rk1Var.i().equals(str7)) {
                    num = 2097152;
                } else if (rk1Var.j().equals(str7)) {
                    num = 8388608;
                } else if (rk1Var.k().equals(str7)) {
                    num = 33554432;
                }
                if (num == null) {
                    return new Pair(Integer.valueOf(i7), num);
                }
                jk1.a("Unknown HEVC level string: ", str7, "MediaCodecUtil");
                return null;
            }
            num = null;
            if (num == null) {
            }
        } else {
            if (h.equals(split[0])) {
                String str8 = jw0Var.j;
                fx fxVar = jw0Var.y;
                if (split.length < 4) {
                    jk1.a("Ignoring malformed AV1 codec string: ", str8, "MediaCodecUtil");
                    return null;
                }
                try {
                    int parseInt5 = Integer.parseInt(split[1]);
                    int parseInt6 = Integer.parseInt(split[2].substring(0, 2));
                    int parseInt7 = Integer.parseInt(split[3]);
                    if (parseInt5 != 0) {
                        mf1.a(parseInt5, "Unknown AV1 profile: ", "MediaCodecUtil");
                        return null;
                    }
                    if (parseInt7 != 8 && parseInt7 != 10) {
                        mf1.a(parseInt7, "Unknown AV1 bit depth: ", "MediaCodecUtil");
                        return null;
                    }
                    int i16 = parseInt7 == 8 ? 1 : (fxVar == null || !(fxVar.e != null || (i10 = fxVar.d) == 7 || i10 == 6)) ? 2 : 4096;
                    switch (parseInt6) {
                        case 0:
                            i11 = -1;
                            break;
                        case 1:
                            i11 = -1;
                            i14 = 2;
                            break;
                        case 2:
                            i11 = -1;
                            i14 = 4;
                            break;
                        case 3:
                            i11 = -1;
                            i14 = 8;
                            break;
                        case 4:
                            i14 = 16;
                            i11 = -1;
                            break;
                        case 5:
                            i14 = 32;
                            i11 = -1;
                            break;
                        case 6:
                            i14 = 64;
                            i11 = -1;
                            break;
                        case 7:
                            i14 = 128;
                            i11 = -1;
                            break;
                        case 8:
                            i14 = 256;
                            i11 = -1;
                            break;
                        case 9:
                            i14 = 512;
                            i11 = -1;
                            break;
                        case 10:
                            i11 = -1;
                            i14 = 1024;
                            break;
                        case 11:
                            i14 = 2048;
                            i11 = -1;
                            break;
                        case 12:
                            i14 = 4096;
                            i11 = -1;
                            break;
                        case 13:
                            i14 = 8192;
                            i11 = -1;
                            break;
                        case 14:
                            i11 = -1;
                            i14 = 16384;
                            break;
                        case 15:
                            i11 = -1;
                            i14 = 32768;
                            break;
                        case 16:
                            i14 = 65536;
                            i11 = -1;
                            break;
                        case 17:
                            i14 = 131072;
                            i11 = -1;
                            break;
                        case 18:
                            i14 = 262144;
                            i11 = -1;
                            break;
                        case 19:
                            i14 = 524288;
                            i11 = -1;
                            break;
                        case 20:
                            i14 = 1048576;
                            i11 = -1;
                            break;
                        case 21:
                            i14 = 2097152;
                            i11 = -1;
                            break;
                        case 22:
                            i14 = 4194304;
                            i11 = -1;
                            break;
                        case 23:
                            i14 = 8388608;
                            i11 = -1;
                            break;
                        default:
                            i11 = -1;
                            i14 = -1;
                            break;
                    }
                    if (i14 != i11) {
                        return new Pair(Integer.valueOf(i16), Integer.valueOf(i14));
                    }
                    mf1.a(parseInt6, "Unknown AV1 level: ", "MediaCodecUtil");
                    return null;
                } catch (NumberFormatException unused3) {
                    jk1.a("Ignoring malformed AV1 codec string: ", str8, "MediaCodecUtil");
                    return null;
                }
            }
            if (!i.equals(split[0])) {
                return null;
            }
            String str9 = jw0Var.j;
            if (split.length != 3) {
                jk1.a("Ignoring malformed MP4A codec string: ", str9, "MediaCodecUtil");
                return null;
            }
            try {
                if (!"audio/mp4a-latm".equals(vt1.a(Integer.parseInt(split[1], 16)))) {
                    return null;
                }
                int parseInt8 = Integer.parseInt(split[2]);
                if (parseInt8 == 17) {
                    i8 = 17;
                } else if (parseInt8 == 20) {
                    i8 = 20;
                } else if (parseInt8 == 23) {
                    i8 = 23;
                } else if (parseInt8 == 29) {
                    i8 = 29;
                } else if (parseInt8 == 39) {
                    i8 = 39;
                } else {
                    if (parseInt8 != 42) {
                        switch (parseInt8) {
                            case 1:
                                i8 = 1;
                                break;
                            case 2:
                                i9 = -1;
                                i8 = 2;
                                break;
                            case 3:
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
                        if (i8 == i9) {
                            return new Pair(Integer.valueOf(i8), 0);
                        }
                        return null;
                    }
                    i8 = 42;
                }
                i9 = -1;
                if (i8 == i9) {
                }
            } catch (NumberFormatException unused4) {
                jk1.a("Ignoring malformed MP4A codec string: ", str9, "MediaCodecUtil");
                return null;
            }
        }
    }

    public static ArrayList a(l41 l41Var, final jw0 jw0Var) {
        ArrayList arrayList = new ArrayList(l41Var);
        a(arrayList, new pk1() { // from class: yads.qk1$$ExternalSyntheticLambda0
            @Override // yads.pk1
            public final int a(Object obj) {
                return qk1.a(jw0.this, (ck1) obj);
            }
        });
        return arrayList;
    }

    public static /* synthetic */ int a(jw0 jw0Var, ck1 ck1Var) {
        try {
            return ck1Var.a(jw0Var) ? 1 : 0;
        } catch (lk1 unused) {
            return -1;
        }
    }

    public static int a() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i2;
        if (j == -1) {
            int i3 = 0;
            List a2 = a("video/avc", false, false);
            ck1 ck1Var = a2.isEmpty() ? null : (ck1) a2.get(0);
            if (ck1Var != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = ck1Var.d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int i4 = 0;
                while (i3 < length) {
                    int i5 = codecProfileLevelArr[i3].level;
                    if (i5 != 1 && i5 != 2) {
                        switch (i5) {
                            case 8:
                            case 16:
                            case 32:
                                i2 = 101376;
                                break;
                            case 64:
                                i2 = 202752;
                                break;
                            case 128:
                            case 256:
                                i2 = 414720;
                                break;
                            case 512:
                                i2 = 921600;
                                break;
                            case 1024:
                                i2 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i2 = 2097152;
                                break;
                            case 8192:
                                i2 = 2228224;
                                break;
                            case 16384:
                                i2 = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i2 = 9437184;
                                break;
                            case 131072:
                            case 262144:
                            case 524288:
                                i2 = 35651584;
                                break;
                            default:
                                i2 = -1;
                                break;
                        }
                    } else {
                        i2 = 25344;
                    }
                    i4 = Math.max(i2, i4);
                    i3++;
                }
                i3 = Math.max(i4, sb3.a >= 21 ? 345600 : AdConfig.DEFAULT_PING_V2_EXPIRY_HIGH);
            }
            j = i3;
        }
        return j;
    }

    public static String a(jw0 jw0Var) {
        Pair b2;
        if ("audio/eac3-joc".equals(jw0Var.m)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(jw0Var.m) || (b2 = b(jw0Var)) == null) {
            return null;
        }
        int intValue = ((Integer) b2.first).intValue();
        if (intValue == 16 || intValue == 256) {
            return "video/hevc";
        }
        if (intValue == 512) {
            return "video/avc";
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x013e, code lost:
    
        yads.gh1.b("MediaCodecUtil", "Skipping codec " + r1 + " (failed to query capabilities)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00d3, code lost:
    
        if (r1.b == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00d5, code lost:
    
        r1 = r10;
        r18 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00e3, code lost:
    
        r5.add(yads.ck1.a(r10, r12, r9, r8, r16, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00ec, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00ed, code lost:
    
        r2 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00cd, code lost:
    
        if (r1.b != r15) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r8 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0138 A[Catch: Exception -> 0x0030, TRY_ENTER, TryCatch #0 {Exception -> 0x0030, blocks: (B:3:0x0008, B:5:0x001a, B:7:0x0024, B:11:0x0157, B:12:0x0033, B:15:0x003e, B:52:0x0130, B:55:0x0138, B:57:0x013e, B:60:0x015f, B:61:0x0180), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015f A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList a(kk1 kk1Var, mk1 mk1Var) {
        String a2;
        String str;
        String str2;
        int i2;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean a3;
        boolean a4;
        boolean z;
        boolean z2;
        int i3;
        String str3;
        boolean isAlias;
        kk1 kk1Var2 = kk1Var;
        mk1 mk1Var2 = mk1Var;
        try {
            ArrayList arrayList = new ArrayList();
            String str4 = kk1Var2.a;
            int a5 = mk1Var.a();
            boolean b2 = mk1Var.b();
            int i4 = 0;
            while (i4 < a5) {
                MediaCodecInfo a6 = mk1Var2.a(i4);
                int i5 = sb3.a;
                if (i5 >= 29) {
                    isAlias = a6.isAlias();
                }
                String name = a6.getName();
                if (a(a6, name, b2, str4) && (a2 = a(a6, name, str4)) != null) {
                    try {
                        capabilitiesForType = a6.getCapabilitiesForType(a2);
                        a3 = mk1Var2.a("tunneled-playback", a2, capabilitiesForType);
                        a4 = mk1Var2.a("tunneled-playback", capabilitiesForType);
                        z = kk1Var2.c;
                    } catch (Exception e2) {
                        e = e2;
                        str = a2;
                        str2 = name;
                        i2 = i4;
                    }
                    if ((z || !a4) && (!z || a3)) {
                        boolean a7 = mk1Var2.a("secure-playback", a2, capabilitiesForType);
                        boolean a8 = mk1Var2.a("secure-playback", capabilitiesForType);
                        boolean z3 = kk1Var2.b;
                        if ((z3 || !a8) && (!z3 || a7)) {
                            if (i5 >= 29) {
                                z2 = a6.isHardwareAccelerated();
                            } else {
                                z2 = !a(a6, str4);
                            }
                            boolean z4 = z2;
                            a(a6, str4);
                            if (i5 >= 29) {
                                a6.isVendor();
                                i3 = i4;
                            } else {
                                String a9 = lh.a(a6.getName());
                                i3 = i4;
                                try {
                                    if (!a9.startsWith(new String(Base64.decode("b214Lmdvb2dsZS4=", 0), Charsets.UTF_8)) && !a9.startsWith("c2.android.")) {
                                        a9.startsWith("c2.google.");
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                    str = a2;
                                    str2 = name;
                                    i2 = i3;
                                    if (sb3.a <= 23) {
                                    }
                                    gh1.b("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                    throw e;
                                }
                            }
                            if (b2) {
                                try {
                                } catch (Exception e4) {
                                    e = e4;
                                    str = a2;
                                    str2 = name;
                                    i2 = i3;
                                    if (sb3.a <= 23) {
                                    }
                                    gh1.b("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                    throw e;
                                }
                            }
                            if (!b2) {
                                try {
                                } catch (Exception e5) {
                                    e = e5;
                                    str3 = a2;
                                    str2 = name;
                                    i2 = i3;
                                    str = str3;
                                    if (sb3.a <= 23) {
                                    }
                                    gh1.b("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                    throw e;
                                }
                            }
                            str3 = a2;
                            str2 = name;
                            i2 = i3;
                            if (!b2 && a7) {
                                try {
                                    str = str3;
                                } catch (Exception e6) {
                                    e = e6;
                                    str = str3;
                                    if (sb3.a <= 23) {
                                    }
                                    gh1.b("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                    throw e;
                                }
                                try {
                                    arrayList.add(ck1.a(str2 + ".secure", str4, str3, capabilitiesForType, z4, true));
                                    return arrayList;
                                } catch (Exception e7) {
                                    e = e7;
                                    if (sb3.a <= 23) {
                                    }
                                    gh1.b("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                    throw e;
                                }
                            }
                            i4 = i2 + 1;
                            kk1Var2 = kk1Var;
                            mk1Var2 = mk1Var;
                        }
                    }
                }
                i2 = i4;
                i4 = i2 + 1;
                kk1Var2 = kk1Var;
                mk1Var2 = mk1Var;
            }
            return arrayList;
        } catch (Exception e8) {
            throw new lk1(e8);
        }
    }

    public static String a(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            byte[] decode = Base64.decode("T01YLk1TLkhFVkNEVi5EZWNvZGVy", 0);
            Charset charset = Charsets.UTF_8;
            if (new String(decode, charset).equals(str)) {
                return new String(Base64.decode("dmlkZW8vaGV2Y2R2", 0), charset);
            }
            if (new String(Base64.decode("T01YLlJUSy52aWRlby5kZWNvZGVy", 0), charset).equals(str) || new String(Base64.decode("T01YLnJlYWx0ZWsudmlkZW8uZGVjb2Rlci50dW5uZWxlZA==", 0), charset).equals(str)) {
                return new String(Base64.decode("dmlkZW8vZHZfaGV2Yw==", 0), charset);
            }
            return null;
        }
        if (str2.equals("audio/alac") && new String(Base64.decode("T01YLmxnZS5hbGFjLmRlY29kZXI=", 0), Charsets.UTF_8).equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && new String(Base64.decode("T01YLmxnZS5mbGFjLmRlY29kZXI=", 0), Charsets.UTF_8).equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && new String(Base64.decode("T01YLmxnZS5hYzMuZGVjb2Rlcg==", 0), Charsets.UTF_8).equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    public static boolean a(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        int i2 = sb3.a;
        if (i2 < 21) {
            byte[] decode = Base64.decode("Q0lQQUFDRGVjb2Rlcg==", 0);
            Charset charset = Charsets.UTF_8;
            if (new String(decode, charset).equals(str) || new String(Base64.decode("Q0lQTVAzRGVjb2Rlcg==", 0), charset).equals(str) || new String(Base64.decode("Q0lQVm9yYmlzRGVjb2Rlcg==", 0), charset).equals(str) || new String(Base64.decode("Q0lQQU1STkJEZWNvZGVy", 0), charset).equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str)) {
                return false;
            }
        }
        if (i2 < 18) {
            byte[] decode2 = Base64.decode("T01YLk1USy5BVURJTy5ERUNPREVSLkFBQw==", 0);
            Charset charset2 = Charsets.UTF_8;
            if (new String(decode2, charset2).equals(str)) {
                String str3 = new String(Base64.decode("YTcw", 0), charset2);
                String str4 = sb3.b;
                if (str3.equals(str4) || (new String(Base64.decode("WGlhb21p", 0), charset2).equals(sb3.c) && str4.startsWith(new String(Base64.decode("SE0=", 0), charset2)))) {
                    return false;
                }
            }
        }
        if (i2 == 16) {
            byte[] decode3 = Base64.decode("T01YLnFjb20uYXVkaW8uZGVjb2Rlci5tcDM=", 0);
            Charset charset3 = Charsets.UTF_8;
            if (new String(decode3, charset3).equals(str)) {
                String str5 = new String(Base64.decode("ZGx4dQ==", 0), charset3);
                String str6 = sb3.b;
                if (str5.equals(str6) || new String(Base64.decode("cHJvdG91", 0), charset3).equals(str6) || new String(Base64.decode("dmlsbGU=", 0), charset3).equals(str6) || new String(Base64.decode("dmlsbGVwbHVz", 0), charset3).equals(str6) || new String(Base64.decode("dmlsbGVjMg==", 0), charset3).equals(str6) || str6.startsWith(new String(Base64.decode("Z2Vl", 0), charset3)) || new String(Base64.decode("QzY2MDI=", 0), charset3).equals(str6) || new String(Base64.decode("QzY2MDM=", 0), charset3).equals(str6) || new String(Base64.decode("QzY2MDY=", 0), charset3).equals(str6) || new String(Base64.decode("QzY2MTY=", 0), charset3).equals(str6) || new String(Base64.decode("TDM2aA==", 0), charset3).equals(str6) || new String(Base64.decode("U08tMDJF", 0), charset3).equals(str6)) {
                    return false;
                }
            }
        }
        if (i2 == 16) {
            byte[] decode4 = Base64.decode("T01YLnFjb20uYXVkaW8uZGVjb2Rlci5hYWM=", 0);
            Charset charset4 = Charsets.UTF_8;
            if (new String(decode4, charset4).equals(str)) {
                String str7 = new String(Base64.decode("QzE1MDQ=", 0), charset4);
                String str8 = sb3.b;
                if (str7.equals(str8) || new String(Base64.decode("QzE1MDU=", 0), charset4).equals(str8) || new String(Base64.decode("QzE2MDQ=", 0), charset4).equals(str8) || new String(Base64.decode("QzE2MDU=", 0), charset4).equals(str8)) {
                    return false;
                }
            }
        }
        if (i2 < 24) {
            byte[] decode5 = Base64.decode("T01YLlNFQy5hYWMuZGVj", 0);
            Charset charset5 = Charsets.UTF_8;
            if ((new String(decode5, charset5).equals(str) || new String(Base64.decode("T01YLkV4eW5vcy5BQUMuRGVjb2Rlcg==", 0), charset5).equals(str)) && new String(Base64.decode("c2Ftc3VuZw==", 0), charset5).equals(sb3.c)) {
                String str9 = sb3.b;
                if (str9.startsWith(new String(Base64.decode("emVyb2ZsdGU=", 0), charset5)) || str9.startsWith(new String(Base64.decode("emVyb2x0ZQ==", 0), charset5)) || str9.startsWith(new String(Base64.decode("emVubHRl", 0), charset5)) || new String(Base64.decode("U0MtMDVH", 0), charset5).equals(str9) || new String(Base64.decode("bWFyaW5lbHRlYXR0", 0), charset5).equals(str9) || new String(Base64.decode("NDA0U0M=", 0), charset5).equals(str9) || new String(Base64.decode("U0MtMDRH", 0), charset5).equals(str9) || new String(Base64.decode("U0NWMzE=", 0), charset5).equals(str9)) {
                    return false;
                }
            }
        }
        if (i2 <= 19) {
            byte[] decode6 = Base64.decode("T01YLlNFQy52cDguZGVj", 0);
            Charset charset6 = Charsets.UTF_8;
            if (new String(decode6, charset6).equals(str) && new String(Base64.decode("c2Ftc3VuZw==", 0), charset6).equals(sb3.c)) {
                String str10 = sb3.b;
                if (str10.startsWith("d2") || str10.startsWith(new String(Base64.decode("c2VycmFubw==", 0), charset6)) || str10.startsWith(new String(Base64.decode("amZsdGU=", 0), charset6)) || str10.startsWith(new String(Base64.decode("c2FudG9z", 0), charset6)) || str10.startsWith(new String(Base64.decode("dDA=", 0), charset6))) {
                    return false;
                }
            }
        }
        if (i2 <= 19) {
            String str11 = sb3.b;
            byte[] decode7 = Base64.decode("amZsdGU=", 0);
            Charset charset7 = Charsets.UTF_8;
            if (str11.startsWith(new String(decode7, charset7)) && new String(Base64.decode("T01YLnFjb20udmlkZW8uZGVjb2Rlci52cDg=", 0), charset7).equals(str)) {
                return false;
            }
        }
        return (i2 <= 23 && "audio/eac3-joc".equals(str2) && new String(Base64.decode("T01YLk1USy5BVURJTy5ERUNPREVSLkRTUEFDMw==", 0), Charsets.UTF_8).equals(str)) ? false : true;
    }

    public static /* synthetic */ int b(ck1 ck1Var) {
        return ck1Var.a.startsWith(tk2.e.K()) ? 1 : 0;
    }

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (sb3.a < 26) {
                String str2 = sb3.b;
                rk1 rk1Var = tk2.e;
                if (str2.equals(rk1Var.N()) && arrayList.size() == 1 && ((ck1) arrayList.get(0)).a.equals(rk1Var.G())) {
                    arrayList.add(ck1.a(rk1Var.L(), "audio/raw", "audio/raw", null, false, false));
                }
            }
            a(arrayList, new pk1() { // from class: yads.qk1$$ExternalSyntheticLambda1
                @Override // yads.pk1
                public final int a(Object obj) {
                    return qk1.a((ck1) obj);
                }
            });
        }
        int i2 = sb3.a;
        if (i2 < 21 && arrayList.size() > 1) {
            String str3 = ((ck1) arrayList.get(0)).a;
            rk1 rk1Var2 = tk2.e;
            if (rk1Var2.I().equals(str3) || rk1Var2.H().equals(str3) || rk1Var2.J().equals(str3)) {
                a(arrayList, new pk1() { // from class: yads.qk1$$ExternalSyntheticLambda2
                    @Override // yads.pk1
                    public final int a(Object obj) {
                        return qk1.b((ck1) obj);
                    }
                });
            }
        }
        if (i2 >= 32 || arrayList.size() <= 1) {
            return;
        }
        if (tk2.e.M().equals(((ck1) arrayList.get(0)).a)) {
            arrayList.add((ck1) arrayList.remove(0));
        }
    }

    public static /* synthetic */ int a(ck1 ck1Var) {
        String str = ck1Var.a;
        rk1 rk1Var = tk2.e;
        if (str.startsWith(rk1Var.K()) || str.startsWith("c2.android")) {
            return 1;
        }
        return (sb3.a >= 26 || !str.equals(rk1Var.G())) ? 0 : -1;
    }

    public static boolean a(MediaCodecInfo mediaCodecInfo, String str) {
        boolean isSoftwareOnly;
        if (sb3.a >= 29) {
            isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
            return isSoftwareOnly;
        }
        if ("audio".equals(vt1.c(str))) {
            return true;
        }
        String a2 = lh.a(mediaCodecInfo.getName());
        if (a2.startsWith("arc.")) {
            return false;
        }
        byte[] decode = Base64.decode("b214Lmdvb2dsZS4=", 0);
        Charset charset = Charsets.UTF_8;
        if (a2.startsWith(new String(decode, charset)) || a2.startsWith(new String(Base64.decode("b214LmZmbXBlZy4=", 0), charset))) {
            return true;
        }
        if ((a2.startsWith(new String(Base64.decode("b214LnNlYy4=", 0), charset)) && a2.contains(".sw.")) || a2.equals(new String(Base64.decode("b214LnFjb20udmlkZW8uZGVjb2Rlci5oZXZjc3d2ZGVj", 0), charset)) || a2.startsWith("c2.android.") || a2.startsWith("c2.google.")) {
            return true;
        }
        return (a2.startsWith(new String(Base64.decode("b214Lg==", 0), charset)) || a2.startsWith("c2.")) ? false : true;
    }

    public static /* synthetic */ int a(pk1 pk1Var, Object obj, Object obj2) {
        return pk1Var.a(obj2) - pk1Var.a(obj);
    }

    public static void a(ArrayList arrayList, final pk1 pk1Var) {
        Collections.sort(arrayList, new Comparator() { // from class: yads.qk1$$ExternalSyntheticLambda3
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return qk1.a(pk1.this, obj, obj2);
            }
        });
    }
}
