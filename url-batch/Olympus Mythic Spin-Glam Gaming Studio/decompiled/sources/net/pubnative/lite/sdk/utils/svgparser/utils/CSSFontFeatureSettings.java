package net.pubnative.lite.sdk.utils.svgparser.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.pubnative.lite.sdk.utils.svgparser.utils.Style;

/* loaded from: classes8.dex */
public class CSSFontFeatureSettings {
    static CSSFontFeatureSettings CAPS_ALL_OFF = null;
    static CSSFontFeatureSettings EAST_ASIAN_ALL_OFF = null;
    public static final String FEATURE_AFRC = "afrc";
    private static final String FEATURE_C2PC = "c2pc";
    private static final String FEATURE_C2SC = "c2sc";
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
    private static final String FEATURE_OFF = "off";
    private static final String FEATURE_ON = "on";
    public static final String FEATURE_ONUM = "onum";
    public static final String FEATURE_ORDN = "ordn";
    private static final String FEATURE_PCAP = "pcap";
    public static final String FEATURE_PNUM = "pnum";
    public static final String FEATURE_PWID = "pwid";
    public static final String FEATURE_RUBY = "ruby";
    private static final String FEATURE_SMCP = "smcp";
    public static final String FEATURE_SMPL = "smpl";
    private static final String FEATURE_SUBS = "subs";
    private static final String FEATURE_SUPS = "sups";
    private static final String FEATURE_TITL = "titl";
    public static final String FEATURE_TNUM = "tnum";
    public static final String FEATURE_TRAD = "trad";
    private static final String FEATURE_UNIC = "unic";
    public static final String FEATURE_ZERO = "zero";
    private static final String FONT_VARIANT_ALL_PETITE_CAPS = "all-petite-caps";
    private static final String FONT_VARIANT_ALL_SMALL_CAPS = "all-small-caps";
    private static final String FONT_VARIANT_AUTO = "auto";
    private static final String FONT_VARIANT_COMMON_LIGATURES = "common-ligatures";
    private static final String FONT_VARIANT_CONTEXTUAL_LIGATURES = "contextual";
    private static final String FONT_VARIANT_DIAGONAL_FRACTIONS = "diagonal-fractions";
    private static final String FONT_VARIANT_DISCRETIONARY_LIGATURES = "discretionary-ligatures";
    private static final String FONT_VARIANT_FULL_WIDTH = "full-width";
    private static final String FONT_VARIANT_HISTORICAL_LIGATURES = "historical-ligatures";
    private static final String FONT_VARIANT_JIS04 = "jis04";
    private static final String FONT_VARIANT_JIS78 = "jis78";
    private static final String FONT_VARIANT_JIS83 = "jis83";
    private static final String FONT_VARIANT_JIS90 = "jis90";
    private static final String FONT_VARIANT_LINING_NUMS = "lining-nums";
    private static final String FONT_VARIANT_NONE = "none";
    static final String FONT_VARIANT_NORMAL = "normal";
    private static final String FONT_VARIANT_NO_COMMON_LIGATURES = "no-common-ligatures";
    private static final String FONT_VARIANT_NO_CONTEXTUAL_LIGATURES = "no-contextual";
    private static final String FONT_VARIANT_NO_DISCRETIONARY_LIGATURES = "no-discretionary-ligatures";
    private static final String FONT_VARIANT_NO_HISTORICAL_LIGATURES = "no-historical-ligatures";
    private static final String FONT_VARIANT_OLDSTYLE_NUMS = "oldstyle-nums";
    private static final String FONT_VARIANT_ORDINAL = "ordinal";
    private static final String FONT_VARIANT_PETITE_CAPS = "petite-caps";
    private static final String FONT_VARIANT_PROPORTIONAL_NUMS = "proportional-nums";
    private static final String FONT_VARIANT_PROPORTIONAL_WIDTH = "proportional-width";
    private static final String FONT_VARIANT_RUBY = "ruby";
    private static final String FONT_VARIANT_SIMPLIFIED = "simplified";
    private static final String FONT_VARIANT_SLASHED_ZERO = "slashed-zero";
    static final String FONT_VARIANT_SMALL_CAPS = "small-caps";
    private static final String FONT_VARIANT_STACKED_FRACTIONS = "stacked-fractions";
    private static final String FONT_VARIANT_SUB = "sub";
    private static final String FONT_VARIANT_SUPER = "super";
    private static final String FONT_VARIANT_TABULAR_NUMS = "tabular-nums";
    private static final String FONT_VARIANT_TITLING_CAPS = "titling-caps";
    private static final String FONT_VARIANT_TRADITIONAL = "traditional";
    private static final String FONT_VARIANT_UNICASE = "unicase";
    static CSSFontFeatureSettings LIGATURES_NORMAL = null;
    static CSSFontFeatureSettings NUMERIC_ALL_OFF = null;
    static CSSFontFeatureSettings POSITION_ALL_OFF = null;
    private static final String TOKEN_ERROR = "ERR";
    private static final int VALUE_OFF = 0;
    private static final int VALUE_ON = 1;
    private final HashMap<String, Integer> settings;
    public static final CSSFontFeatureSettings FONT_FEATURE_SETTINGS_NORMAL = makeDefaultSettings();
    public static final CSSFontFeatureSettings ERROR = new CSSFontFeatureSettings((HashMap<String, Integer>) null);
    private static CSSFontFeatureSettings LIGATURES_ALL_OFF = null;
    private static CSSFontFeatureSettings CAPS_SMALL_CAPS = null;

    private static class FontFeatureEntry {
        String name;
        int val;

        public FontFeatureEntry(String str, int i) {
            this.name = str;
            this.val = i;
        }
    }

    static {
        LIGATURES_NORMAL = null;
        POSITION_ALL_OFF = null;
        CAPS_ALL_OFF = null;
        NUMERIC_ALL_OFF = null;
        EAST_ASIAN_ALL_OFF = null;
        CSSFontFeatureSettings cSSFontFeatureSettings = new CSSFontFeatureSettings();
        LIGATURES_NORMAL = cSSFontFeatureSettings;
        cSSFontFeatureSettings.settings.put("liga", 1);
        LIGATURES_NORMAL.settings.put("clig", 1);
        LIGATURES_NORMAL.settings.put("dlig", 0);
        LIGATURES_NORMAL.settings.put("hlig", 0);
        LIGATURES_NORMAL.settings.put("calt", 1);
        CSSFontFeatureSettings cSSFontFeatureSettings2 = new CSSFontFeatureSettings();
        POSITION_ALL_OFF = cSSFontFeatureSettings2;
        cSSFontFeatureSettings2.settings.put("subs", 0);
        POSITION_ALL_OFF.settings.put(FEATURE_SUPS, 0);
        CSSFontFeatureSettings cSSFontFeatureSettings3 = new CSSFontFeatureSettings();
        CAPS_ALL_OFF = cSSFontFeatureSettings3;
        cSSFontFeatureSettings3.settings.put(FEATURE_SMCP, 0);
        CAPS_ALL_OFF.settings.put(FEATURE_C2SC, 0);
        CAPS_ALL_OFF.settings.put(FEATURE_PCAP, 0);
        CAPS_ALL_OFF.settings.put(FEATURE_C2PC, 0);
        CAPS_ALL_OFF.settings.put(FEATURE_UNIC, 0);
        CAPS_ALL_OFF.settings.put(FEATURE_TITL, 0);
        CSSFontFeatureSettings cSSFontFeatureSettings4 = new CSSFontFeatureSettings();
        NUMERIC_ALL_OFF = cSSFontFeatureSettings4;
        cSSFontFeatureSettings4.settings.put("lnum", 0);
        NUMERIC_ALL_OFF.settings.put("onum", 0);
        NUMERIC_ALL_OFF.settings.put("pnum", 0);
        NUMERIC_ALL_OFF.settings.put("tnum", 0);
        NUMERIC_ALL_OFF.settings.put("frac", 0);
        NUMERIC_ALL_OFF.settings.put("afrc", 0);
        NUMERIC_ALL_OFF.settings.put("ordn", 0);
        NUMERIC_ALL_OFF.settings.put("zero", 0);
        CSSFontFeatureSettings cSSFontFeatureSettings5 = new CSSFontFeatureSettings();
        EAST_ASIAN_ALL_OFF = cSSFontFeatureSettings5;
        cSSFontFeatureSettings5.settings.put("jp78", 0);
        EAST_ASIAN_ALL_OFF.settings.put("jp83", 0);
        EAST_ASIAN_ALL_OFF.settings.put("jp90", 0);
        EAST_ASIAN_ALL_OFF.settings.put("jp04", 0);
        EAST_ASIAN_ALL_OFF.settings.put("smpl", 0);
        EAST_ASIAN_ALL_OFF.settings.put("trad", 0);
        EAST_ASIAN_ALL_OFF.settings.put("fwid", 0);
        EAST_ASIAN_ALL_OFF.settings.put("pwid", 0);
        EAST_ASIAN_ALL_OFF.settings.put("ruby", 0);
    }

    public CSSFontFeatureSettings() {
        this.settings = new HashMap<>();
    }

    private void addSettings(String str, String str2, int i) {
        this.settings.put(str, Integer.valueOf(i));
        this.settings.put(str2, Integer.valueOf(i));
    }

    private static int containsOnce(List<String> list, String str) {
        if (list.remove(str)) {
            return list.contains(str) ? 2 : 1;
        }
        return 0;
    }

    private static String containsOneOf(List<String> list, String... strArr) {
        String str = null;
        for (String str2 : strArr) {
            if (str == null && list.remove(str2)) {
                str = str2;
            }
            if (list.contains(str2)) {
                return TOKEN_ERROR;
            }
        }
        return str;
    }

    private static int containsWhich(List<String> list, String str, String str2) {
        if (list.remove(str)) {
            return (list.contains(str) || list.contains(str2)) ? 3 : 1;
        }
        if (list.remove(str2)) {
            return list.contains(str2) ? 3 : 2;
        }
        return 0;
    }

    private static void ensureLigaturesNone() {
        if (LIGATURES_ALL_OFF != null) {
            return;
        }
        CSSFontFeatureSettings cSSFontFeatureSettings = new CSSFontFeatureSettings();
        cSSFontFeatureSettings.settings.put("liga", 0);
        cSSFontFeatureSettings.settings.put("clig", 0);
        cSSFontFeatureSettings.settings.put("dlig", 0);
        cSSFontFeatureSettings.settings.put("hlig", 0);
        cSSFontFeatureSettings.settings.put("calt", 0);
        LIGATURES_ALL_OFF = cSSFontFeatureSettings;
    }

    private void ensurePositionNormal() {
        if (POSITION_ALL_OFF == null) {
            CSSFontFeatureSettings cSSFontFeatureSettings = new CSSFontFeatureSettings();
            cSSFontFeatureSettings.settings.put("subs", 0);
            cSSFontFeatureSettings.settings.put(FEATURE_SUPS, 0);
            POSITION_ALL_OFF = cSSFontFeatureSettings;
        }
    }

    private static List<String> extractTokensAsList(String str) {
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

    private static final CSSFontFeatureSettings makeDefaultSettings() {
        CSSFontFeatureSettings cSSFontFeatureSettings = new CSSFontFeatureSettings();
        cSSFontFeatureSettings.settings.put("rlig", 1);
        cSSFontFeatureSettings.settings.put("liga", 1);
        cSSFontFeatureSettings.settings.put("clig", 1);
        cSSFontFeatureSettings.settings.put("calt", 1);
        cSSFontFeatureSettings.settings.put("locl", 1);
        cSSFontFeatureSettings.settings.put("ccmp", 1);
        cSSFontFeatureSettings.settings.put("mark", 1);
        cSSFontFeatureSettings.settings.put("mkmk", 1);
        return cSSFontFeatureSettings;
    }

    static CSSFontFeatureSettings makeSmallCaps() {
        if (CAPS_SMALL_CAPS == null) {
            CSSFontFeatureSettings cSSFontFeatureSettings = new CSSFontFeatureSettings();
            CAPS_SMALL_CAPS = cSSFontFeatureSettings;
            cSSFontFeatureSettings.settings.put(FEATURE_SMCP, 1);
            CAPS_SMALL_CAPS.settings.put(FEATURE_C2SC, 0);
            CAPS_SMALL_CAPS.settings.put(FEATURE_PCAP, 0);
            CAPS_SMALL_CAPS.settings.put(FEATURE_C2PC, 0);
            CAPS_SMALL_CAPS.settings.put(FEATURE_UNIC, 0);
            CAPS_SMALL_CAPS.settings.put(FEATURE_TITL, 0);
        }
        return CAPS_SMALL_CAPS;
    }

    private static FontFeatureEntry nextFeatureEntry(TextScanner textScanner) {
        int i;
        textScanner.skipWhitespace();
        String nextQuotedString = textScanner.nextQuotedString();
        if (nextQuotedString == null || nextQuotedString.length() != 4) {
            return null;
        }
        textScanner.skipWhitespace();
        if (!textScanner.empty()) {
            i = 0;
            Integer nextInteger = textScanner.nextInteger(false);
            if (nextInteger == null) {
                if (!textScanner.consume(FEATURE_OFF)) {
                    textScanner.consume(FEATURE_ON);
                }
            } else {
                if (nextInteger.intValue() > 99) {
                    return null;
                }
                i = nextInteger.intValue();
            }
            return new FontFeatureEntry(nextQuotedString, i);
        }
        i = 1;
        return new FontFeatureEntry(nextQuotedString, i);
    }

    static CSSFontFeatureSettings parseEastAsian(String str) {
        CSSFontFeatureSettings parseVariantEastAsianSpecial;
        if (str.equals("normal")) {
            return EAST_ASIAN_ALL_OFF;
        }
        List<String> extractTokensAsList = extractTokensAsList(str);
        if (extractTokensAsList == null || (parseVariantEastAsianSpecial = parseVariantEastAsianSpecial(extractTokensAsList)) == null || parseVariantEastAsianSpecial == ERROR || extractTokensAsList.size() > 0) {
            return null;
        }
        return parseVariantEastAsianSpecial;
    }

    static CSSFontFeatureSettings parseFontFeatureSettings(String str) {
        CSSFontFeatureSettings cSSFontFeatureSettings = new CSSFontFeatureSettings();
        TextScanner textScanner = new TextScanner(str);
        textScanner.skipWhitespace();
        while (!textScanner.empty()) {
            FontFeatureEntry nextFeatureEntry = nextFeatureEntry(textScanner);
            if (nextFeatureEntry == null) {
                return null;
            }
            cSSFontFeatureSettings.settings.put(nextFeatureEntry.name, Integer.valueOf(nextFeatureEntry.val));
            textScanner.skipCommaWhitespace();
        }
        return cSSFontFeatureSettings;
    }

    static Style.FontKerning parseFontKerning(String str) {
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

    static void parseFontVariant(Style style, String str) {
        CSSFontFeatureSettings parseVariantLigaturesSpecial;
        CSSFontFeatureSettings cSSFontFeatureSettings;
        CSSFontFeatureSettings cSSFontFeatureSettings2;
        CSSFontFeatureSettings cSSFontFeatureSettings3;
        CSSFontFeatureSettings cSSFontFeatureSettings4;
        if (str.equals("normal")) {
            style.fontVariantLigatures = LIGATURES_NORMAL;
            style.fontVariantPosition = POSITION_ALL_OFF;
            style.fontVariantCaps = CAPS_ALL_OFF;
            style.fontVariantNumeric = NUMERIC_ALL_OFF;
            style.fontVariantEastAsian = EAST_ASIAN_ALL_OFF;
            style.specifiedFlags |= 34084860461056L;
            return;
        }
        if (str.equals("none")) {
            ensureLigaturesNone();
            style.fontVariantLigatures = LIGATURES_ALL_OFF;
            style.fontVariantPosition = POSITION_ALL_OFF;
            style.fontVariantCaps = CAPS_ALL_OFF;
            style.fontVariantNumeric = NUMERIC_ALL_OFF;
            style.fontVariantEastAsian = EAST_ASIAN_ALL_OFF;
            style.specifiedFlags |= 34084860461056L;
            return;
        }
        List<String> extractTokensAsList = extractTokensAsList(str);
        if (extractTokensAsList == null || (parseVariantLigaturesSpecial = parseVariantLigaturesSpecial(extractTokensAsList)) == (cSSFontFeatureSettings = ERROR)) {
            return;
        }
        CSSFontFeatureSettings cSSFontFeatureSettings5 = null;
        if (extractTokensAsList.size() > 0) {
            cSSFontFeatureSettings2 = parseVariantPositionSpecial(extractTokensAsList);
            if (cSSFontFeatureSettings2 == cSSFontFeatureSettings) {
                return;
            }
        } else {
            cSSFontFeatureSettings2 = null;
        }
        if (extractTokensAsList.size() > 0) {
            cSSFontFeatureSettings3 = parseVariantCapsSpecial(extractTokensAsList);
            if (cSSFontFeatureSettings3 == cSSFontFeatureSettings) {
                return;
            }
        } else {
            cSSFontFeatureSettings3 = null;
        }
        if (extractTokensAsList.size() > 0) {
            cSSFontFeatureSettings4 = parseVariantNumericSpecial(extractTokensAsList);
            if (cSSFontFeatureSettings4 == cSSFontFeatureSettings) {
                return;
            }
        } else {
            cSSFontFeatureSettings4 = null;
        }
        if (extractTokensAsList.size() <= 0 || (cSSFontFeatureSettings5 = parseVariantEastAsianSpecial(extractTokensAsList)) != cSSFontFeatureSettings) {
            if (parseVariantLigaturesSpecial != null) {
                style.fontVariantLigatures = parseVariantLigaturesSpecial;
                style.specifiedFlags |= 1099511627776L;
            }
            if (cSSFontFeatureSettings2 != null) {
                style.fontVariantPosition = cSSFontFeatureSettings2;
                style.specifiedFlags |= 2199023255552L;
            }
            if (cSSFontFeatureSettings3 != null) {
                style.fontVariantCaps = cSSFontFeatureSettings3;
                style.specifiedFlags |= 4398046511104L;
            }
            if (cSSFontFeatureSettings4 != null) {
                style.fontVariantNumeric = cSSFontFeatureSettings4;
                style.specifiedFlags |= 8796093022208L;
            }
            if (cSSFontFeatureSettings5 != null) {
                style.fontVariantEastAsian = cSSFontFeatureSettings5;
                style.specifiedFlags |= 17592186044416L;
            }
        }
    }

    static CSSFontFeatureSettings parseVariantCaps(String str) {
        if (str.equals("normal")) {
            return CAPS_ALL_OFF;
        }
        CSSFontFeatureSettings cSSFontFeatureSettings = new CSSFontFeatureSettings(CAPS_ALL_OFF);
        if (setCapsFeature(cSSFontFeatureSettings, str)) {
            return cSSFontFeatureSettings;
        }
        return null;
    }

    private static CSSFontFeatureSettings parseVariantCapsSpecial(List<String> list) {
        CSSFontFeatureSettings cSSFontFeatureSettings = new CSSFontFeatureSettings(CAPS_ALL_OFF);
        String containsOneOf = containsOneOf(list, FONT_VARIANT_SMALL_CAPS, FONT_VARIANT_ALL_SMALL_CAPS, FONT_VARIANT_PETITE_CAPS, FONT_VARIANT_ALL_PETITE_CAPS, FONT_VARIANT_UNICASE, FONT_VARIANT_TITLING_CAPS);
        if (containsOneOf == TOKEN_ERROR) {
            return ERROR;
        }
        if (containsOneOf == null) {
            return null;
        }
        setCapsFeature(cSSFontFeatureSettings, containsOneOf);
        return cSSFontFeatureSettings;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0077, code lost:
    
        if (r4.equals(net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings.FONT_VARIANT_TRADITIONAL) == false) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ea A[ADDED_TO_REGION, REMOVE, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00eb A[ADDED_TO_REGION, REMOVE, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static CSSFontFeatureSettings parseVariantEastAsianSpecial(List<String> list) {
        int containsOnce;
        char c = 0;
        CSSFontFeatureSettings cSSFontFeatureSettings = new CSSFontFeatureSettings(EAST_ASIAN_ALL_OFF);
        String containsOneOf = containsOneOf(list, FONT_VARIANT_JIS78, FONT_VARIANT_JIS83, FONT_VARIANT_JIS90, FONT_VARIANT_JIS04, FONT_VARIANT_SIMPLIFIED, FONT_VARIANT_TRADITIONAL);
        char c2 = 1;
        if (containsOneOf != null) {
            switch (containsOneOf.hashCode()) {
                case -2137707097:
                    break;
                case -1427350696:
                    if (containsOneOf.equals(FONT_VARIANT_SIMPLIFIED)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 68933:
                    if (containsOneOf.equals(TOKEN_ERROR)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 101133336:
                    if (containsOneOf.equals(FONT_VARIANT_JIS04)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 101133557:
                    if (containsOneOf.equals(FONT_VARIANT_JIS78)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 101133583:
                    if (containsOneOf.equals(FONT_VARIANT_JIS83)) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 101133611:
                    if (containsOneOf.equals(FONT_VARIANT_JIS90)) {
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
                    cSSFontFeatureSettings.settings.put("trad", 1);
                    c = 1;
                    break;
                case 1:
                    cSSFontFeatureSettings.settings.put("smpl", 1);
                    c = 1;
                    break;
                case 2:
                    break;
                case 3:
                    cSSFontFeatureSettings.settings.put("jp04", 1);
                    c = 1;
                    break;
                case 4:
                    cSSFontFeatureSettings.settings.put("jp78", 1);
                    c = 1;
                    break;
                case 5:
                    cSSFontFeatureSettings.settings.put("jp83", 1);
                    c = 1;
                    break;
                case 6:
                    cSSFontFeatureSettings.settings.put("jp90", 1);
                    c = 1;
                    break;
                default:
                    c = 1;
                    break;
            }
            return ERROR;
        }
        int containsWhich = containsWhich(list, FONT_VARIANT_FULL_WIDTH, FONT_VARIANT_PROPORTIONAL_WIDTH);
        if (containsWhich == 1) {
            cSSFontFeatureSettings.settings.put("fwid", 1);
        } else {
            if (containsWhich != 2) {
                if (containsWhich == 3) {
                    return ERROR;
                }
                containsOnce = containsOnce(list, "ruby");
                if (containsOnce != 1) {
                    cSSFontFeatureSettings.settings.put("ruby", 1);
                } else {
                    if (containsOnce == 2) {
                        return ERROR;
                    }
                    c2 = c;
                }
                if (c2 == 0) {
                    return cSSFontFeatureSettings;
                }
                return null;
            }
            cSSFontFeatureSettings.settings.put("pwid", 1);
        }
        c = 1;
        containsOnce = containsOnce(list, "ruby");
        if (containsOnce != 1) {
        }
        if (c2 == 0) {
        }
    }

    static CSSFontFeatureSettings parseVariantLigatures(String str) {
        if (str.equals("normal")) {
            return LIGATURES_NORMAL;
        }
        if (str.equals("none")) {
            ensureLigaturesNone();
            return LIGATURES_ALL_OFF;
        }
        List<String> extractTokensAsList = extractTokensAsList(str);
        if (extractTokensAsList == null) {
            return null;
        }
        ensureLigaturesNone();
        CSSFontFeatureSettings parseVariantLigaturesSpecial = parseVariantLigaturesSpecial(extractTokensAsList);
        if (parseVariantLigaturesSpecial == null || parseVariantLigaturesSpecial == ERROR || extractTokensAsList.size() > 0) {
            return null;
        }
        return parseVariantLigaturesSpecial;
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
    private static CSSFontFeatureSettings parseVariantLigaturesSpecial(List<String> list) {
        int containsWhich;
        int containsWhich2;
        int containsWhich3;
        ensureLigaturesNone();
        CSSFontFeatureSettings cSSFontFeatureSettings = new CSSFontFeatureSettings(LIGATURES_ALL_OFF);
        int containsWhich4 = containsWhich(list, FONT_VARIANT_COMMON_LIGATURES, FONT_VARIANT_NO_COMMON_LIGATURES);
        boolean z = false;
        boolean z2 = true;
        if (containsWhich4 == 1) {
            cSSFontFeatureSettings.addSettings("clig", "liga", 1);
        } else if (containsWhich4 != 2) {
            if (containsWhich4 == 3) {
                return ERROR;
            }
            containsWhich = containsWhich(list, FONT_VARIANT_DISCRETIONARY_LIGATURES, FONT_VARIANT_NO_DISCRETIONARY_LIGATURES);
            if (containsWhich != 1) {
                cSSFontFeatureSettings.settings.put("dlig", 1);
            } else if (containsWhich != 2) {
                if (containsWhich == 3) {
                    return ERROR;
                }
                containsWhich2 = containsWhich(list, FONT_VARIANT_HISTORICAL_LIGATURES, FONT_VARIANT_NO_HISTORICAL_LIGATURES);
                if (containsWhich2 == 1) {
                    cSSFontFeatureSettings.settings.put("hlig", 1);
                } else {
                    if (containsWhich2 != 2) {
                        if (containsWhich2 == 3) {
                            return ERROR;
                        }
                        containsWhich3 = containsWhich(list, FONT_VARIANT_CONTEXTUAL_LIGATURES, FONT_VARIANT_NO_CONTEXTUAL_LIGATURES);
                        if (containsWhich3 != 1) {
                            cSSFontFeatureSettings.settings.put("calt", 1);
                        } else if (containsWhich3 == 2) {
                            cSSFontFeatureSettings.settings.put("calt", 0);
                        } else {
                            if (containsWhich3 == 3) {
                                return ERROR;
                            }
                            z2 = z;
                        }
                        if (z2) {
                            return null;
                        }
                        return cSSFontFeatureSettings;
                    }
                    cSSFontFeatureSettings.settings.put("hlig", 0);
                }
                z = true;
                containsWhich3 = containsWhich(list, FONT_VARIANT_CONTEXTUAL_LIGATURES, FONT_VARIANT_NO_CONTEXTUAL_LIGATURES);
                if (containsWhich3 != 1) {
                }
                if (z2) {
                }
            } else {
                cSSFontFeatureSettings.settings.put("dlig", 0);
            }
            z = true;
            containsWhich2 = containsWhich(list, FONT_VARIANT_HISTORICAL_LIGATURES, FONT_VARIANT_NO_HISTORICAL_LIGATURES);
            if (containsWhich2 == 1) {
            }
            z = true;
            containsWhich3 = containsWhich(list, FONT_VARIANT_CONTEXTUAL_LIGATURES, FONT_VARIANT_NO_CONTEXTUAL_LIGATURES);
            if (containsWhich3 != 1) {
            }
            if (z2) {
            }
        } else {
            cSSFontFeatureSettings.addSettings("clig", "liga", 0);
        }
        z = true;
        containsWhich = containsWhich(list, FONT_VARIANT_DISCRETIONARY_LIGATURES, FONT_VARIANT_NO_DISCRETIONARY_LIGATURES);
        if (containsWhich != 1) {
        }
        z = true;
        containsWhich2 = containsWhich(list, FONT_VARIANT_HISTORICAL_LIGATURES, FONT_VARIANT_NO_HISTORICAL_LIGATURES);
        if (containsWhich2 == 1) {
        }
        z = true;
        containsWhich3 = containsWhich(list, FONT_VARIANT_CONTEXTUAL_LIGATURES, FONT_VARIANT_NO_CONTEXTUAL_LIGATURES);
        if (containsWhich3 != 1) {
        }
        if (z2) {
        }
    }

    static CSSFontFeatureSettings parseVariantNumeric(String str) {
        CSSFontFeatureSettings parseVariantNumericSpecial;
        if (str.equals("normal")) {
            return NUMERIC_ALL_OFF;
        }
        List<String> extractTokensAsList = extractTokensAsList(str);
        if (extractTokensAsList == null || (parseVariantNumericSpecial = parseVariantNumericSpecial(extractTokensAsList)) == null || parseVariantNumericSpecial == ERROR || extractTokensAsList.size() > 0) {
            return null;
        }
        return parseVariantNumericSpecial;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static CSSFontFeatureSettings parseVariantNumericSpecial(List<String> list) {
        boolean z;
        int containsWhich;
        int containsWhich2;
        int containsOnce;
        int containsOnce2;
        CSSFontFeatureSettings cSSFontFeatureSettings = new CSSFontFeatureSettings(NUMERIC_ALL_OFF);
        int containsWhich3 = containsWhich(list, FONT_VARIANT_LINING_NUMS, FONT_VARIANT_OLDSTYLE_NUMS);
        boolean z2 = true;
        if (containsWhich3 == 1) {
            cSSFontFeatureSettings.settings.put("lnum", 1);
        } else if (containsWhich3 == 2) {
            cSSFontFeatureSettings.settings.put("onum", 1);
        } else {
            if (containsWhich3 == 3) {
                return ERROR;
            }
            z = false;
            containsWhich = containsWhich(list, FONT_VARIANT_PROPORTIONAL_NUMS, FONT_VARIANT_TABULAR_NUMS);
            if (containsWhich != 1) {
                cSSFontFeatureSettings.settings.put("pnum", 1);
            } else if (containsWhich != 2) {
                if (containsWhich == 3) {
                    return ERROR;
                }
                containsWhich2 = containsWhich(list, FONT_VARIANT_DIAGONAL_FRACTIONS, FONT_VARIANT_STACKED_FRACTIONS);
                if (containsWhich2 == 1) {
                    cSSFontFeatureSettings.settings.put("frac", 1);
                } else {
                    if (containsWhich2 != 2) {
                        if (containsWhich2 == 3) {
                            return ERROR;
                        }
                        containsOnce = containsOnce(list, "ordinal");
                        if (containsOnce != 1) {
                            cSSFontFeatureSettings.settings.put("ordn", 1);
                            z = true;
                        } else if (containsOnce == 2) {
                            return ERROR;
                        }
                        containsOnce2 = containsOnce(list, FONT_VARIANT_SLASHED_ZERO);
                        if (containsOnce2 != 1) {
                            cSSFontFeatureSettings.settings.put("zero", 1);
                        } else {
                            if (containsOnce2 == 2) {
                                return ERROR;
                            }
                            z2 = z;
                        }
                        if (z2) {
                            return null;
                        }
                        return cSSFontFeatureSettings;
                    }
                    cSSFontFeatureSettings.settings.put("afrc", 1);
                }
                z = true;
                containsOnce = containsOnce(list, "ordinal");
                if (containsOnce != 1) {
                }
                containsOnce2 = containsOnce(list, FONT_VARIANT_SLASHED_ZERO);
                if (containsOnce2 != 1) {
                }
                if (z2) {
                }
            } else {
                cSSFontFeatureSettings.settings.put("tnum", 1);
            }
            z = true;
            containsWhich2 = containsWhich(list, FONT_VARIANT_DIAGONAL_FRACTIONS, FONT_VARIANT_STACKED_FRACTIONS);
            if (containsWhich2 == 1) {
            }
            z = true;
            containsOnce = containsOnce(list, "ordinal");
            if (containsOnce != 1) {
            }
            containsOnce2 = containsOnce(list, FONT_VARIANT_SLASHED_ZERO);
            if (containsOnce2 != 1) {
            }
            if (z2) {
            }
        }
        z = true;
        containsWhich = containsWhich(list, FONT_VARIANT_PROPORTIONAL_NUMS, FONT_VARIANT_TABULAR_NUMS);
        if (containsWhich != 1) {
        }
        z = true;
        containsWhich2 = containsWhich(list, FONT_VARIANT_DIAGONAL_FRACTIONS, FONT_VARIANT_STACKED_FRACTIONS);
        if (containsWhich2 == 1) {
        }
        z = true;
        containsOnce = containsOnce(list, "ordinal");
        if (containsOnce != 1) {
        }
        containsOnce2 = containsOnce(list, FONT_VARIANT_SLASHED_ZERO);
        if (containsOnce2 != 1) {
        }
        if (z2) {
        }
    }

    static CSSFontFeatureSettings parseVariantPosition(String str) {
        if (str.equals("normal")) {
            return POSITION_ALL_OFF;
        }
        CSSFontFeatureSettings cSSFontFeatureSettings = new CSSFontFeatureSettings(POSITION_ALL_OFF);
        if (str.equals("sub")) {
            cSSFontFeatureSettings.settings.put("subs", 1);
            return cSSFontFeatureSettings;
        }
        if (!str.equals(FONT_VARIANT_SUPER)) {
            return null;
        }
        cSSFontFeatureSettings.settings.put(FEATURE_SUPS, 1);
        return cSSFontFeatureSettings;
    }

    private static CSSFontFeatureSettings parseVariantPositionSpecial(List<String> list) {
        CSSFontFeatureSettings cSSFontFeatureSettings = new CSSFontFeatureSettings(POSITION_ALL_OFF);
        int containsWhich = containsWhich(list, "sub", FONT_VARIANT_SUPER);
        if (containsWhich == 1) {
            cSSFontFeatureSettings.settings.put("subs", 1);
            return cSSFontFeatureSettings;
        }
        if (containsWhich == 2) {
            cSSFontFeatureSettings.settings.put(FEATURE_SUPS, 1);
            return cSSFontFeatureSettings;
        }
        if (containsWhich != 3) {
            return null;
        }
        return ERROR;
    }

    private static boolean setCapsFeature(CSSFontFeatureSettings cSSFontFeatureSettings, String str) {
        str.getClass();
        switch (str) {
            case "titling-caps":
                cSSFontFeatureSettings.settings.put(FEATURE_TITL, 1);
                return true;
            case "all-small-caps":
                cSSFontFeatureSettings.addSettings(FEATURE_SMCP, FEATURE_C2SC, 1);
                return true;
            case "unicase":
                cSSFontFeatureSettings.settings.put(FEATURE_UNIC, 1);
                return true;
            case "petite-caps":
                cSSFontFeatureSettings.settings.put(FEATURE_PCAP, 1);
                return true;
            case "all-petite-caps":
                cSSFontFeatureSettings.addSettings(FEATURE_PCAP, FEATURE_C2PC, 1);
                return true;
            case "small-caps":
                cSSFontFeatureSettings.settings.put(FEATURE_SMCP, 1);
                return true;
            default:
                return false;
        }
    }

    public void applyKerning(Style.FontKerning fontKerning) {
        if (fontKerning == Style.FontKerning.none) {
            this.settings.put("kern", 0);
        } else {
            this.settings.put("kern", 1);
        }
    }

    public void applySettings(CSSFontFeatureSettings cSSFontFeatureSettings) {
        if (cSSFontFeatureSettings == null) {
            return;
        }
        this.settings.putAll(cSSFontFeatureSettings.settings);
    }

    public boolean hasSettings() {
        return this.settings.size() > 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : this.settings.entrySet()) {
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
        this.settings = hashMap;
    }

    public CSSFontFeatureSettings(CSSFontFeatureSettings cSSFontFeatureSettings) {
        this.settings = new HashMap<>(cSSFontFeatureSettings.settings);
    }
}
