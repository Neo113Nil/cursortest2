package com.smaato.sdk.ng.utils.svgparser.utils;

import com.adjust.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.smaato.sdk.ng.utils.svgparser.utils.Style;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public class CSSFontFeatureSettings {
    public static final String FEATURE_AFRC = "afrc";
    public static final String FEATURE_CALT = "calt";
    public static final String FEATURE_CLIG = "clig";
    public static final String FEATURE_DLIG = "dlig";
    public static final String FEATURE_FRAC = "frac";
    public static final String FEATURE_FWID = "fwid";
    public static final String FEATURE_HLIG = "hlig";
    public static final String FEATURE_JP04 = "jp04";
    public static final String FEATURE_JP78 = "jp78";
    public static final String FEATURE_JP83 = "jp83";
    public static final String FEATURE_JP90 = "jp90";
    public static final String FEATURE_KERN = "kern";
    public static final String FEATURE_LIGA = "liga";
    public static final String FEATURE_LNUM = "lnum";
    public static final String FEATURE_ONUM = "onum";
    public static final String FEATURE_ORDN = "ordn";
    public static final String FEATURE_PNUM = "pnum";
    public static final String FEATURE_PWID = "pwid";
    public static final String FEATURE_RUBY = "ruby";
    public static final String FEATURE_SMPL = "smpl";
    public static final String FEATURE_TNUM = "tnum";
    public static final String FEATURE_TRAD = "trad";
    public static final String FEATURE_ZERO = "zero";
    static CSSFontFeatureSettings b;
    static CSSFontFeatureSettings d;
    static CSSFontFeatureSettings e;
    static CSSFontFeatureSettings g;
    static CSSFontFeatureSettings h;
    private final HashMap<String, Integer> a;
    public static final CSSFontFeatureSettings FONT_FEATURE_SETTINGS_NORMAL = b();
    public static final CSSFontFeatureSettings ERROR = new CSSFontFeatureSettings((HashMap<String, Integer>) null);
    private static CSSFontFeatureSettings c = null;
    private static CSSFontFeatureSettings f = null;

    private static class a {
        String a;
        int b;

        public a(String str, int i) {
            this.a = str;
            this.b = i;
        }
    }

    static {
        b = null;
        d = null;
        e = null;
        g = null;
        h = null;
        CSSFontFeatureSettings cSSFontFeatureSettings = new CSSFontFeatureSettings();
        b = cSSFontFeatureSettings;
        cSSFontFeatureSettings.a.put("liga", 1);
        b.a.put("clig", 1);
        b.a.put("dlig", 0);
        b.a.put("hlig", 0);
        b.a.put("calt", 1);
        CSSFontFeatureSettings cSSFontFeatureSettings2 = new CSSFontFeatureSettings();
        d = cSSFontFeatureSettings2;
        cSSFontFeatureSettings2.a.put("subs", 0);
        d.a.put("sups", 0);
        CSSFontFeatureSettings cSSFontFeatureSettings3 = new CSSFontFeatureSettings();
        e = cSSFontFeatureSettings3;
        cSSFontFeatureSettings3.a.put("smcp", 0);
        e.a.put("c2sc", 0);
        e.a.put("pcap", 0);
        e.a.put("c2pc", 0);
        e.a.put("unic", 0);
        e.a.put("titl", 0);
        CSSFontFeatureSettings cSSFontFeatureSettings4 = new CSSFontFeatureSettings();
        g = cSSFontFeatureSettings4;
        cSSFontFeatureSettings4.a.put("lnum", 0);
        g.a.put("onum", 0);
        g.a.put("pnum", 0);
        g.a.put("tnum", 0);
        g.a.put("frac", 0);
        g.a.put("afrc", 0);
        g.a.put("ordn", 0);
        g.a.put("zero", 0);
        CSSFontFeatureSettings cSSFontFeatureSettings5 = new CSSFontFeatureSettings();
        h = cSSFontFeatureSettings5;
        cSSFontFeatureSettings5.a.put("jp78", 0);
        h.a.put("jp83", 0);
        h.a.put("jp90", 0);
        h.a.put("jp04", 0);
        h.a.put("smpl", 0);
        h.a.put("trad", 0);
        h.a.put("fwid", 0);
        h.a.put("pwid", 0);
        h.a.put("ruby", 0);
    }

    public CSSFontFeatureSettings() {
        this.a = new HashMap<>();
    }

    private static a a(TextScanner textScanner) {
        int i;
        textScanner.skipWhitespace();
        String nextQuotedString = textScanner.nextQuotedString();
        if (nextQuotedString == null || nextQuotedString.length() != 4) {
            return null;
        }
        textScanner.skipWhitespace();
        if (!textScanner.empty()) {
            i = 0;
            Integer a2 = textScanner.a(false);
            if (a2 == null) {
                if (!textScanner.consume("off")) {
                    textScanner.consume("on");
                }
            } else {
                if (a2.intValue() > 99) {
                    return null;
                }
                i = a2.intValue();
            }
            return new a(nextQuotedString, i);
        }
        i = 1;
        return new a(nextQuotedString, i);
    }

    static CSSFontFeatureSettings b(String str) {
        CSSFontFeatureSettings b2;
        if (str.equals(Constants.NORMAL)) {
            return h;
        }
        List<String> a2 = a(str);
        if (a2 == null || (b2 = b(a2)) == null || b2 == ERROR || a2.size() > 0) {
            return null;
        }
        return b2;
    }

    static CSSFontFeatureSettings c(String str) {
        CSSFontFeatureSettings cSSFontFeatureSettings = new CSSFontFeatureSettings();
        TextScanner textScanner = new TextScanner(str);
        textScanner.skipWhitespace();
        while (!textScanner.empty()) {
            a a2 = a(textScanner);
            if (a2 == null) {
                return null;
            }
            cSSFontFeatureSettings.a.put(a2.a, Integer.valueOf(a2.b));
            textScanner.skipCommaWhitespace();
        }
        return cSSFontFeatureSettings;
    }

    static Style.FontKerning d(String str) {
        str.getClass();
        switch (str) {
            case "normal":
                return Style.FontKerning.normal;
            case "auto":
                return Style.FontKerning.auto;
            case "none":
                return Style.FontKerning.none;
            default:
                return null;
        }
    }

    private static CSSFontFeatureSettings e(List<String> list) {
        CSSFontFeatureSettings cSSFontFeatureSettings = new CSSFontFeatureSettings(d);
        int a2 = a(list, AuthenticationTokenClaims.JSON_KEY_SUB, "super");
        if (a2 == 1) {
            cSSFontFeatureSettings.a.put("subs", 1);
            return cSSFontFeatureSettings;
        }
        if (a2 == 2) {
            cSSFontFeatureSettings.a.put("sups", 1);
            return cSSFontFeatureSettings;
        }
        if (a2 != 3) {
            return null;
        }
        return ERROR;
    }

    static CSSFontFeatureSettings f(String str) {
        if (str.equals(Constants.NORMAL)) {
            return b;
        }
        if (str.equals("none")) {
            a();
            return c;
        }
        List<String> a2 = a(str);
        if (a2 == null) {
            return null;
        }
        a();
        CSSFontFeatureSettings c2 = c(a2);
        if (c2 == null || c2 == ERROR || a2.size() > 0) {
            return null;
        }
        return c2;
    }

    static CSSFontFeatureSettings g(String str) {
        CSSFontFeatureSettings d2;
        if (str.equals(Constants.NORMAL)) {
            return g;
        }
        List<String> a2 = a(str);
        if (a2 == null || (d2 = d(a2)) == null || d2 == ERROR || a2.size() > 0) {
            return null;
        }
        return d2;
    }

    static CSSFontFeatureSettings h(String str) {
        if (str.equals(Constants.NORMAL)) {
            return d;
        }
        CSSFontFeatureSettings cSSFontFeatureSettings = new CSSFontFeatureSettings(d);
        if (str.equals(AuthenticationTokenClaims.JSON_KEY_SUB)) {
            cSSFontFeatureSettings.a.put("subs", 1);
            return cSSFontFeatureSettings;
        }
        if (!str.equals("super")) {
            return null;
        }
        cSSFontFeatureSettings.a.put("sups", 1);
        return cSSFontFeatureSettings;
    }

    public void applyKerning(Style.FontKerning fontKerning) {
        if (fontKerning == Style.FontKerning.none) {
            this.a.put("kern", 0);
        } else {
            this.a.put("kern", 1);
        }
    }

    public void applySettings(CSSFontFeatureSettings cSSFontFeatureSettings) {
        if (cSSFontFeatureSettings == null) {
            return;
        }
        this.a.putAll(cSSFontFeatureSettings.a);
    }

    public boolean hasSettings() {
        return this.a.size() > 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : this.a.entrySet()) {
            if (sb.length() > 0) {
                sb.append(',');
            }
            sb.append("'");
            sb.append(entry.getKey());
            sb.append("' ");
            sb.append(entry.getValue());
        }
        return sb.toString();
    }

    private CSSFontFeatureSettings(HashMap<String, Integer> hashMap) {
        this.a = hashMap;
    }

    public CSSFontFeatureSettings(CSSFontFeatureSettings cSSFontFeatureSettings) {
        this.a = new HashMap<>(cSSFontFeatureSettings.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static CSSFontFeatureSettings d(List<String> list) {
        boolean z;
        int a2;
        int a3;
        int a4;
        int a5;
        CSSFontFeatureSettings cSSFontFeatureSettings = new CSSFontFeatureSettings(g);
        int a6 = a(list, "lining-nums", "oldstyle-nums");
        boolean z2 = true;
        if (a6 == 1) {
            cSSFontFeatureSettings.a.put("lnum", 1);
        } else if (a6 == 2) {
            cSSFontFeatureSettings.a.put("onum", 1);
        } else {
            if (a6 == 3) {
                return ERROR;
            }
            z = false;
            a2 = a(list, "proportional-nums", "tabular-nums");
            if (a2 != 1) {
                cSSFontFeatureSettings.a.put("pnum", 1);
            } else if (a2 == 2) {
                cSSFontFeatureSettings.a.put("tnum", 1);
            } else {
                if (a2 == 3) {
                    return ERROR;
                }
                a3 = a(list, "diagonal-fractions", "stacked-fractions");
                if (a3 == 1) {
                    cSSFontFeatureSettings.a.put("frac", 1);
                } else if (a3 == 2) {
                    cSSFontFeatureSettings.a.put("afrc", 1);
                } else {
                    if (a3 == 3) {
                        return ERROR;
                    }
                    a4 = a(list, MediationMetaData.KEY_ORDINAL);
                    if (a4 != 1) {
                        cSSFontFeatureSettings.a.put("ordn", 1);
                        z = true;
                    } else if (a4 == 2) {
                        return ERROR;
                    }
                    a5 = a(list, "slashed-zero");
                    if (a5 != 1) {
                        cSSFontFeatureSettings.a.put("zero", 1);
                    } else {
                        if (a5 == 2) {
                            return ERROR;
                        }
                        z2 = z;
                    }
                    if (z2) {
                        return null;
                    }
                    return cSSFontFeatureSettings;
                }
                z = true;
                a4 = a(list, MediationMetaData.KEY_ORDINAL);
                if (a4 != 1) {
                }
                a5 = a(list, "slashed-zero");
                if (a5 != 1) {
                }
                if (z2) {
                }
            }
            z = true;
            a3 = a(list, "diagonal-fractions", "stacked-fractions");
            if (a3 == 1) {
            }
            z = true;
            a4 = a(list, MediationMetaData.KEY_ORDINAL);
            if (a4 != 1) {
            }
            a5 = a(list, "slashed-zero");
            if (a5 != 1) {
            }
            if (z2) {
            }
        }
        z = true;
        a2 = a(list, "proportional-nums", "tabular-nums");
        if (a2 != 1) {
        }
        z = true;
        a3 = a(list, "diagonal-fractions", "stacked-fractions");
        if (a3 == 1) {
        }
        z = true;
        a4 = a(list, MediationMetaData.KEY_ORDINAL);
        if (a4 != 1) {
        }
        a5 = a(list, "slashed-zero");
        if (a5 != 1) {
        }
        if (z2) {
        }
    }

    static CSSFontFeatureSettings e(String str) {
        if (str.equals(Constants.NORMAL)) {
            return e;
        }
        CSSFontFeatureSettings cSSFontFeatureSettings = new CSSFontFeatureSettings(e);
        if (a(cSSFontFeatureSettings, str)) {
            return cSSFontFeatureSettings;
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0077, code lost:
    
        if (r4.equals("traditional") == false) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ea A[ADDED_TO_REGION, REMOVE, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00eb A[ADDED_TO_REGION, REMOVE, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static CSSFontFeatureSettings b(List<String> list) {
        int a2;
        char c2 = 0;
        CSSFontFeatureSettings cSSFontFeatureSettings = new CSSFontFeatureSettings(h);
        String a3 = a(list, "jis78", "jis83", "jis90", "jis04", "simplified", "traditional");
        char c3 = 1;
        if (a3 != null) {
            switch (a3.hashCode()) {
                case -2137707097:
                    break;
                case -1427350696:
                    if (a3.equals("simplified")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 68933:
                    if (a3.equals("ERR")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 101133336:
                    if (a3.equals("jis04")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 101133557:
                    if (a3.equals("jis78")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 101133583:
                    if (a3.equals("jis83")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 101133611:
                    if (a3.equals("jis90")) {
                        c2 = 6;
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
                    cSSFontFeatureSettings.a.put("trad", 1);
                    c2 = 1;
                    break;
                case 1:
                    cSSFontFeatureSettings.a.put("smpl", 1);
                    c2 = 1;
                    break;
                case 2:
                    break;
                case 3:
                    cSSFontFeatureSettings.a.put("jp04", 1);
                    c2 = 1;
                    break;
                case 4:
                    cSSFontFeatureSettings.a.put("jp78", 1);
                    c2 = 1;
                    break;
                case 5:
                    cSSFontFeatureSettings.a.put("jp83", 1);
                    c2 = 1;
                    break;
                case 6:
                    cSSFontFeatureSettings.a.put("jp90", 1);
                    c2 = 1;
                    break;
                default:
                    c2 = 1;
                    break;
            }
            return ERROR;
        }
        int a4 = a(list, "full-width", "proportional-width");
        if (a4 == 1) {
            cSSFontFeatureSettings.a.put("fwid", 1);
        } else if (a4 == 2) {
            cSSFontFeatureSettings.a.put("pwid", 1);
        } else {
            if (a4 == 3) {
                return ERROR;
            }
            a2 = a(list, "ruby");
            if (a2 != 1) {
                cSSFontFeatureSettings.a.put("ruby", 1);
            } else {
                if (a2 == 2) {
                    return ERROR;
                }
                c3 = c2;
            }
            if (c3 == 0) {
                return cSSFontFeatureSettings;
            }
            return null;
        }
        c2 = 1;
        a2 = a(list, "ruby");
        if (a2 != 1) {
        }
        if (c3 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static CSSFontFeatureSettings c(List<String> list) {
        int a2;
        int a3;
        int a4;
        a();
        CSSFontFeatureSettings cSSFontFeatureSettings = new CSSFontFeatureSettings(c);
        int a5 = a(list, "common-ligatures", "no-common-ligatures");
        boolean z = false;
        boolean z2 = true;
        if (a5 == 1) {
            cSSFontFeatureSettings.a("clig", "liga", 1);
        } else if (a5 == 2) {
            cSSFontFeatureSettings.a("clig", "liga", 0);
        } else {
            if (a5 == 3) {
                return ERROR;
            }
            a2 = a(list, "discretionary-ligatures", "no-discretionary-ligatures");
            if (a2 != 1) {
                cSSFontFeatureSettings.a.put("dlig", 1);
            } else if (a2 == 2) {
                cSSFontFeatureSettings.a.put("dlig", 0);
            } else {
                if (a2 == 3) {
                    return ERROR;
                }
                a3 = a(list, "historical-ligatures", "no-historical-ligatures");
                if (a3 == 1) {
                    cSSFontFeatureSettings.a.put("hlig", 1);
                } else if (a3 == 2) {
                    cSSFontFeatureSettings.a.put("hlig", 0);
                } else {
                    if (a3 == 3) {
                        return ERROR;
                    }
                    a4 = a(list, "contextual", "no-contextual");
                    if (a4 != 1) {
                        cSSFontFeatureSettings.a.put("calt", 1);
                    } else if (a4 == 2) {
                        cSSFontFeatureSettings.a.put("calt", 0);
                    } else {
                        if (a4 == 3) {
                            return ERROR;
                        }
                        z2 = z;
                    }
                    if (z2) {
                        return null;
                    }
                    return cSSFontFeatureSettings;
                }
                z = true;
                a4 = a(list, "contextual", "no-contextual");
                if (a4 != 1) {
                }
                if (z2) {
                }
            }
            z = true;
            a3 = a(list, "historical-ligatures", "no-historical-ligatures");
            if (a3 == 1) {
            }
            z = true;
            a4 = a(list, "contextual", "no-contextual");
            if (a4 != 1) {
            }
            if (z2) {
            }
        }
        z = true;
        a2 = a(list, "discretionary-ligatures", "no-discretionary-ligatures");
        if (a2 != 1) {
        }
        z = true;
        a3 = a(list, "historical-ligatures", "no-historical-ligatures");
        if (a3 == 1) {
        }
        z = true;
        a4 = a(list, "contextual", "no-contextual");
        if (a4 != 1) {
        }
        if (z2) {
        }
    }

    private static List<String> a(String str) {
        TextScanner textScanner = new TextScanner(str);
        textScanner.skipWhitespace();
        if (textScanner.empty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (!textScanner.empty()) {
            arrayList.add(textScanner.nextToken());
            textScanner.skipWhitespace();
        }
        return arrayList;
    }

    private static int a(List<String> list, String str, String str2) {
        if (list.remove(str)) {
            return (list.contains(str) || list.contains(str2)) ? 3 : 1;
        }
        if (list.remove(str2)) {
            return list.contains(str2) ? 3 : 2;
        }
        return 0;
    }

    private static int a(List<String> list, String str) {
        if (list.remove(str)) {
            return list.contains(str) ? 2 : 1;
        }
        return 0;
    }

    private static String a(List<String> list, String... strArr) {
        String str = null;
        for (String str2 : strArr) {
            if (str == null && list.remove(str2)) {
                str = str2;
            }
            if (list.contains(str2)) {
                return "ERR";
            }
        }
        return str;
    }

    private void a(String str, String str2, int i) {
        this.a.put(str, Integer.valueOf(i));
        this.a.put(str2, Integer.valueOf(i));
    }

    private static boolean a(CSSFontFeatureSettings cSSFontFeatureSettings, String str) {
        str.getClass();
        switch (str) {
            case "titling-caps":
                cSSFontFeatureSettings.a.put("titl", 1);
                return true;
            case "all-small-caps":
                cSSFontFeatureSettings.a("smcp", "c2sc", 1);
                return true;
            case "unicase":
                cSSFontFeatureSettings.a.put("unic", 1);
                return true;
            case "petite-caps":
                cSSFontFeatureSettings.a.put("pcap", 1);
                return true;
            case "all-petite-caps":
                cSSFontFeatureSettings.a("pcap", "c2pc", 1);
                return true;
            case "small-caps":
                cSSFontFeatureSettings.a.put("smcp", 1);
                return true;
            default:
                return false;
        }
    }

    private static final CSSFontFeatureSettings b() {
        CSSFontFeatureSettings cSSFontFeatureSettings = new CSSFontFeatureSettings();
        cSSFontFeatureSettings.a.put("rlig", 1);
        cSSFontFeatureSettings.a.put("liga", 1);
        cSSFontFeatureSettings.a.put("clig", 1);
        cSSFontFeatureSettings.a.put("calt", 1);
        cSSFontFeatureSettings.a.put("locl", 1);
        cSSFontFeatureSettings.a.put("ccmp", 1);
        cSSFontFeatureSettings.a.put("mark", 1);
        cSSFontFeatureSettings.a.put("mkmk", 1);
        return cSSFontFeatureSettings;
    }

    static CSSFontFeatureSettings c() {
        if (f == null) {
            CSSFontFeatureSettings cSSFontFeatureSettings = new CSSFontFeatureSettings();
            f = cSSFontFeatureSettings;
            cSSFontFeatureSettings.a.put("smcp", 1);
            f.a.put("c2sc", 0);
            f.a.put("pcap", 0);
            f.a.put("c2pc", 0);
            f.a.put("unic", 0);
            f.a.put("titl", 0);
        }
        return f;
    }

    private static CSSFontFeatureSettings a(List<String> list) {
        CSSFontFeatureSettings cSSFontFeatureSettings = new CSSFontFeatureSettings(e);
        String a2 = a(list, "small-caps", "all-small-caps", "petite-caps", "all-petite-caps", "unicase", "titling-caps");
        if (a2 == "ERR") {
            return ERROR;
        }
        if (a2 == null) {
            return null;
        }
        a(cSSFontFeatureSettings, a2);
        return cSSFontFeatureSettings;
    }

    static void a(Style style, String str) {
        CSSFontFeatureSettings c2;
        CSSFontFeatureSettings cSSFontFeatureSettings;
        CSSFontFeatureSettings cSSFontFeatureSettings2;
        CSSFontFeatureSettings cSSFontFeatureSettings3;
        CSSFontFeatureSettings cSSFontFeatureSettings4;
        if (str.equals(Constants.NORMAL)) {
            style.R = b;
            style.S = d;
            style.T = e;
            style.U = g;
            style.V = h;
            style.a |= 34084860461056L;
            return;
        }
        if (str.equals("none")) {
            a();
            style.R = c;
            style.S = d;
            style.T = e;
            style.U = g;
            style.V = h;
            style.a |= 34084860461056L;
            return;
        }
        List<String> a2 = a(str);
        if (a2 == null || (c2 = c(a2)) == (cSSFontFeatureSettings = ERROR)) {
            return;
        }
        CSSFontFeatureSettings cSSFontFeatureSettings5 = null;
        if (a2.size() > 0) {
            cSSFontFeatureSettings2 = e(a2);
            if (cSSFontFeatureSettings2 == cSSFontFeatureSettings) {
                return;
            }
        } else {
            cSSFontFeatureSettings2 = null;
        }
        if (a2.size() > 0) {
            cSSFontFeatureSettings3 = a(a2);
            if (cSSFontFeatureSettings3 == cSSFontFeatureSettings) {
                return;
            }
        } else {
            cSSFontFeatureSettings3 = null;
        }
        if (a2.size() > 0) {
            cSSFontFeatureSettings4 = d(a2);
            if (cSSFontFeatureSettings4 == cSSFontFeatureSettings) {
                return;
            }
        } else {
            cSSFontFeatureSettings4 = null;
        }
        if (a2.size() <= 0 || (cSSFontFeatureSettings5 = b(a2)) != cSSFontFeatureSettings) {
            if (c2 != null) {
                style.R = c2;
                style.a |= 1099511627776L;
            }
            if (cSSFontFeatureSettings2 != null) {
                style.S = cSSFontFeatureSettings2;
                style.a |= 2199023255552L;
            }
            if (cSSFontFeatureSettings3 != null) {
                style.T = cSSFontFeatureSettings3;
                style.a |= 4398046511104L;
            }
            if (cSSFontFeatureSettings4 != null) {
                style.U = cSSFontFeatureSettings4;
                style.a |= 8796093022208L;
            }
            if (cSSFontFeatureSettings5 != null) {
                style.V = cSSFontFeatureSettings5;
                style.a |= 17592186044416L;
            }
        }
    }

    private static void a() {
        if (c != null) {
            return;
        }
        CSSFontFeatureSettings cSSFontFeatureSettings = new CSSFontFeatureSettings();
        cSSFontFeatureSettings.a.put("liga", 0);
        cSSFontFeatureSettings.a.put("clig", 0);
        cSSFontFeatureSettings.a.put("dlig", 0);
        cSSFontFeatureSettings.a.put("hlig", 0);
        cSSFontFeatureSettings.a.put("calt", 0);
        c = cSSFontFeatureSettings;
    }
}
