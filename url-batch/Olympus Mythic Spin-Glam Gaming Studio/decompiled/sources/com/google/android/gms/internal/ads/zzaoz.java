package com.google.android.gms.internal.ads;

import android.text.Layout;
import androidx.annotation.Nullable;
import com.facebook.appevents.UserDataStore;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes10.dex */
public final class zzaoz implements zzanz {
    private final XmlPullParserFactory zzi;
    private static final Pattern zzc = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern zzd = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern zze = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final Pattern zza = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern zzb = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    private static final Pattern zzf = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    private static final Pattern zzg = Pattern.compile("^(\\d+) (\\d+)$");
    private static final zzaox zzh = new zzaox(30.0f, 1, 1);

    private static String[] zzc(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return new String[0];
        }
        String str2 = zzfm.zza;
        return trim.split("\\s+", -1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v36 */
    /* JADX WARN: Type inference failed for: r11v37 */
    /* JADX WARN: Type inference failed for: r11v38 */
    /* JADX WARN: Type inference failed for: r11v39 */
    /* JADX WARN: Type inference failed for: r11v40 */
    /* JADX WARN: Type inference failed for: r11v41 */
    /* JADX WARN: Type inference failed for: r11v42 */
    /* JADX WARN: Type inference failed for: r11v43 */
    /* JADX WARN: Type inference failed for: r11v44 */
    /* JADX WARN: Type inference failed for: r11v45 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v73 */
    /* JADX WARN: Type inference failed for: r7v9 */
    private static zzapc zzd(XmlPullParser xmlPullParser, zzapc zzapcVar) {
        ?? r7;
        Matcher matcher;
        char c;
        int attributeCount = xmlPullParser.getAttributeCount();
        boolean z = false;
        zzapc zzapcVar2 = zzapcVar;
        int i = 0;
        while (i < attributeCount) {
            String attributeValue = xmlPullParser.getAttributeValue(i);
            String attributeName = xmlPullParser.getAttributeName(i);
            ?? r11 = -1;
            r11 = -1;
            r11 = -1;
            r11 = -1;
            r11 = -1;
            ?? r112 = -1;
            r11 = -1;
            r11 = -1;
            ?? r113 = -1;
            r11 = -1;
            r11 = -1;
            r11 = -1;
            r11 = -1;
            r11 = -1;
            r11 = -1;
            ?? r114 = -1;
            r11 = -1;
            r11 = -1;
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals("fontStyle")) {
                        r7 = 6;
                        break;
                    }
                    r7 = -1;
                    break;
                case -1289044182:
                    if (attributeName.equals("extent")) {
                        r7 = 16;
                        break;
                    }
                    r7 = -1;
                    break;
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        r7 = 3;
                        break;
                    }
                    r7 = -1;
                    break;
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
                        r7 = 7;
                        break;
                    }
                    r7 = -1;
                    break;
                case -1008619738:
                    if (attributeName.equals("origin")) {
                        r7 = 15;
                        break;
                    }
                    r7 = -1;
                    break;
                case -879295043:
                    if (attributeName.equals("textDecoration")) {
                        r7 = 12;
                        break;
                    }
                    r7 = -1;
                    break;
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
                        r7 = 5;
                        break;
                    }
                    r7 = -1;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        r7 = z;
                        break;
                    }
                    r7 = -1;
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        r7 = 10;
                        break;
                    }
                    r7 = -1;
                    break;
                case 94842723:
                    if (attributeName.equals("color")) {
                        r7 = 2;
                        break;
                    }
                    r7 = -1;
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        r7 = 14;
                        break;
                    }
                    r7 = -1;
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        r7 = 9;
                        break;
                    }
                    r7 = -1;
                    break;
                case 365601008:
                    if (attributeName.equals("fontSize")) {
                        r7 = 4;
                        break;
                    }
                    r7 = -1;
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        r7 = 13;
                        break;
                    }
                    r7 = -1;
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        r7 = 11;
                        break;
                    }
                    r7 = -1;
                    break;
                case 1287124693:
                    if (attributeName.equals("backgroundColor")) {
                        r7 = 1;
                        break;
                    }
                    r7 = -1;
                    break;
                case 1587328867:
                    if (attributeName.equals("displayAlign")) {
                        r7 = 17;
                        break;
                    }
                    r7 = -1;
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        r7 = 8;
                        break;
                    }
                    r7 = -1;
                    break;
                default:
                    r7 = -1;
                    break;
            }
            switch (r7) {
                case 0:
                    if (!"style".equals(xmlPullParser.getName())) {
                        break;
                    } else {
                        zzapcVar2 = zze(zzapcVar2);
                        zzapcVar2.zzs(attributeValue);
                        break;
                    }
                case 1:
                    zzapcVar2 = zze(zzapcVar2);
                    try {
                        zzapcVar2.zzn(zzds.zza(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused) {
                        zzeh.zzc("TtmlParser", "Failed parsing background value: ".concat(String.valueOf(attributeValue)));
                        break;
                    }
                case 2:
                    zzapcVar2 = zze(zzapcVar2);
                    try {
                        zzapcVar2.zzk(zzds.zza(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused2) {
                        zzeh.zzc("TtmlParser", "Failed parsing color value: ".concat(String.valueOf(attributeValue)));
                        break;
                    }
                case 3:
                    zzapcVar2 = zze(zzapcVar2);
                    zzapcVar2.zzi(attributeValue);
                    break;
                case 4:
                    try {
                        zzapcVar2 = zze(zzapcVar2);
                        String str = zzfm.zza;
                        String[] split = attributeValue.split("\\s+", -1);
                        int length = split.length;
                        if (length == 1) {
                            matcher = zze.matcher(attributeValue);
                        } else {
                            if (length != 2) {
                                StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 41);
                                sb.append("Invalid number of entries for fontSize: ");
                                sb.append(length);
                                sb.append(".");
                                throw new zzanv(sb.toString());
                            }
                            matcher = zze.matcher(split[1]);
                            zzeh.zzc("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
                        }
                        if (!matcher.matches()) {
                            StringBuilder sb2 = new StringBuilder(attributeValue.length() + 36);
                            sb2.append("Invalid expression for fontSize: '");
                            sb2.append(attributeValue);
                            sb2.append("'.");
                            throw new zzanv(sb2.toString());
                        }
                        String group = matcher.group(3);
                        if (group == null) {
                            throw null;
                        }
                        int hashCode = group.hashCode();
                        if (hashCode == 37) {
                            if (group.equals("%")) {
                                c = 2;
                            }
                            c = 65535;
                        } else if (hashCode != 3240) {
                            if (hashCode == 3592 && group.equals("px")) {
                                c = 0;
                            }
                            c = 65535;
                        } else {
                            if (group.equals(UserDataStore.EMAIL)) {
                                c = 1;
                            }
                            c = 65535;
                        }
                        if (c == 0) {
                            zzapcVar2.zzH(1);
                        } else if (c == 1) {
                            zzapcVar2.zzH(2);
                        } else {
                            if (c != 2) {
                                StringBuilder sb3 = new StringBuilder(group.length() + 30);
                                sb3.append("Invalid unit for fontSize: '");
                                sb3.append(group);
                                sb3.append("'.");
                                throw new zzanv(sb3.toString());
                            }
                            zzapcVar2.zzH(3);
                        }
                        String group2 = matcher.group(1);
                        if (group2 == null) {
                            throw null;
                        }
                        zzapcVar2.zzG(Float.parseFloat(group2));
                        break;
                    } catch (zzanv unused3) {
                        zzeh.zzc("TtmlParser", "Failed parsing fontSize value: ".concat(String.valueOf(attributeValue)));
                        break;
                    }
                    break;
                case 5:
                    zzapcVar2 = zze(zzapcVar2);
                    zzapcVar2.zzf("bold".equalsIgnoreCase(attributeValue));
                    break;
                case 6:
                    zzapcVar2 = zze(zzapcVar2);
                    zzapcVar2.zzg("italic".equalsIgnoreCase(attributeValue));
                    break;
                case 7:
                    zzapcVar2 = zze(zzapcVar2);
                    zzapcVar2.zzz(zzf(attributeValue));
                    break;
                case 8:
                    zzapcVar2 = zze(zzapcVar2);
                    zzapcVar2.zzB(zzf(attributeValue));
                    break;
                case 9:
                    String zza2 = zzgts.zza(attributeValue);
                    int hashCode2 = zza2.hashCode();
                    if (hashCode2 != 96673) {
                        if (hashCode2 == 3387192 && zza2.equals("none")) {
                            r11 = z;
                        }
                    } else if (zza2.equals("all")) {
                        r11 = 1;
                    }
                    if (r11 == 0) {
                        zzapcVar2 = zze(zzapcVar2);
                        zzapcVar2.zzD(z);
                        break;
                    } else if (r11 == 1) {
                        zzapcVar2 = zze(zzapcVar2);
                        zzapcVar2.zzD(true);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    String zza3 = zzgts.zza(attributeValue);
                    switch (zza3.hashCode()) {
                        case -618561360:
                            if (zza3.equals("baseContainer")) {
                                r114 = 2;
                                break;
                            }
                            break;
                        case -410956671:
                            if (zza3.equals("container")) {
                                r114 = z;
                                break;
                            }
                            break;
                        case -250518009:
                            if (zza3.equals("delimiter")) {
                                r114 = 5;
                                break;
                            }
                            break;
                        case -136074796:
                            if (zza3.equals("textContainer")) {
                                r114 = 4;
                                break;
                            }
                            break;
                        case 3016401:
                            if (zza3.equals("base")) {
                                r114 = 1;
                                break;
                            }
                            break;
                        case 3556653:
                            if (zza3.equals("text")) {
                                r114 = 3;
                                break;
                            }
                            break;
                    }
                    if (r114 == 0) {
                        zzapcVar2 = zze(zzapcVar2);
                        zzapcVar2.zzu(1);
                        break;
                    } else if (r114 != 1 && r114 != 2) {
                        if (r114 != 3 && r114 != 4) {
                            if (r114 == 5) {
                                zzapcVar2 = zze(zzapcVar2);
                                zzapcVar2.zzu(4);
                                break;
                            } else {
                                break;
                            }
                        } else {
                            zzapcVar2 = zze(zzapcVar2);
                            zzapcVar2.zzu(3);
                            break;
                        }
                    } else {
                        zzapcVar2 = zze(zzapcVar2);
                        zzapcVar2.zzu(2);
                        break;
                    }
                case 11:
                    String zza4 = zzgts.zza(attributeValue);
                    int hashCode3 = zza4.hashCode();
                    if (hashCode3 != -1392885889) {
                        if (hashCode3 == 92734940 && zza4.equals("after")) {
                            r113 = 1;
                        }
                    } else if (zza4.equals("before")) {
                        r113 = z;
                    }
                    if (r113 == 0) {
                        zzapcVar2 = zze(zzapcVar2);
                        zzapcVar2.zzw(1);
                        break;
                    } else if (r113 == 1) {
                        zzapcVar2 = zze(zzapcVar2);
                        zzapcVar2.zzw(2);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    String zza5 = zzgts.zza(attributeValue);
                    switch (zza5.hashCode()) {
                        case -1461280213:
                            if (zza5.equals("nounderline")) {
                                r112 = 3;
                                break;
                            }
                            break;
                        case -1026963764:
                            if (zza5.equals("underline")) {
                                r112 = 2;
                                break;
                            }
                            break;
                        case 913457136:
                            if (zza5.equals("nolinethrough")) {
                                r112 = 1;
                                break;
                            }
                            break;
                        case 1679736913:
                            if (zza5.equals("linethrough")) {
                                r112 = z;
                                break;
                            }
                            break;
                    }
                    if (r112 == 0) {
                        zzapcVar2 = zze(zzapcVar2);
                        zzapcVar2.zzc(true);
                        break;
                    } else if (r112 == 1) {
                        zzapcVar2 = zze(zzapcVar2);
                        zzapcVar2.zzc(z);
                        break;
                    } else if (r112 == 2) {
                        zzapcVar2 = zze(zzapcVar2);
                        zzapcVar2.zze(true);
                        break;
                    } else if (r112 == 3) {
                        zzapcVar2 = zze(zzapcVar2);
                        zzapcVar2.zze(z);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    zzapcVar2 = zze(zzapcVar2);
                    zzapcVar2.zzF(zzaov.zza(attributeValue));
                    break;
                case 14:
                    zzapc zze2 = zze(zzapcVar2);
                    Matcher matcher2 = zza.matcher(attributeValue);
                    float f = Float.MAX_VALUE;
                    if (matcher2.matches()) {
                        try {
                            String group3 = matcher2.group(1);
                            if (group3 == null) {
                                throw null;
                                break;
                            } else {
                                f = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(group3)));
                            }
                        } catch (NumberFormatException e) {
                            zzeh.zzd("TtmlParser", "Failed to parse shear: ".concat(String.valueOf(attributeValue)), e);
                        }
                    } else {
                        zzeh.zzc("TtmlParser", "Invalid value for shear: ".concat(String.valueOf(attributeValue)));
                    }
                    zze2.zzp(f);
                    zzapcVar2 = zze2;
                    break;
                case 15:
                    zzapcVar2 = zze(zzapcVar2);
                    zzapcVar2.zzK(attributeValue);
                    break;
                case 16:
                    zzapcVar2 = zze(zzapcVar2);
                    zzapcVar2.zzM(attributeValue);
                    break;
                case 17:
                    zzapcVar2 = zze(zzapcVar2);
                    zzapcVar2.zzO(attributeValue);
                    break;
            }
            i++;
            z = false;
        }
        return zzapcVar2;
    }

    private static zzapc zze(@Nullable zzapc zzapcVar) {
        return zzapcVar == null ? new zzapc() : zzapcVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Nullable
    private static Layout.Alignment zzf(String str) {
        char c;
        String zza2 = zzgts.zza(str);
        switch (zza2.hashCode()) {
            case -1364013995:
                if (zza2.equals("center")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 100571:
                if (zza2.equals("end")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3317767:
                if (zza2.equals("left")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 108511772:
                if (zza2.equals("right")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 109757538:
                if (zza2.equals("start")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0 || c == 1) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        if (c == 2 || c == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (c != 4) {
            return null;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c7, code lost:
    
        if (r13.equals("s") != false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static long zzg(String str, zzaox zzaoxVar) throws zzanv {
        double d;
        double d2;
        Matcher matcher = zzc.matcher(str);
        char c = 2;
        if (matcher.matches()) {
            String group = matcher.group(1);
            group.getClass();
            long parseLong = Long.parseLong(group) * 3600;
            String group2 = matcher.group(2);
            group2.getClass();
            long parseLong2 = Long.parseLong(group2) * 60;
            String group3 = matcher.group(3);
            group3.getClass();
            double d3 = parseLong + parseLong2;
            double parseLong3 = Long.parseLong(group3);
            String group4 = matcher.group(4);
            double parseDouble = group4 != null ? Double.parseDouble(group4) : 0.0d;
            double d4 = d3 + parseLong3;
            return (long) ((d4 + parseDouble + (matcher.group(5) != null ? Long.parseLong(r13) / zzaoxVar.zza : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r13) / zzaoxVar.zzb) / zzaoxVar.zza : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = zzd.matcher(str);
        if (!matcher2.matches()) {
            throw new zzanv("Malformed time expression: ".concat(String.valueOf(str)));
        }
        String group5 = matcher2.group(1);
        group5.getClass();
        double parseDouble2 = Double.parseDouble(group5);
        String group6 = matcher2.group(2);
        group6.getClass();
        int hashCode = group6.hashCode();
        if (hashCode == 102) {
            if (group6.equals(InneractiveMediationDefs.GENDER_FEMALE)) {
                c = 4;
            }
            c = 65535;
        } else if (hashCode == 104) {
            if (group6.equals("h")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode == 109) {
            if (group6.equals("m")) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode == 3494) {
            if (group6.equals("ms")) {
                c = 3;
            }
            c = 65535;
        } else if (hashCode != 115) {
            if (hashCode == 116 && group6.equals("t")) {
                c = 5;
            }
            c = 65535;
        }
        if (c == 0) {
            d = 3600.0d;
        } else {
            if (c != 1) {
                if (c == 3) {
                    d2 = 1000.0d;
                } else {
                    if (c != 4) {
                        if (c == 5) {
                            d2 = zzaoxVar.zzc;
                        }
                        return (long) (parseDouble2 * 1000000.0d);
                    }
                    d2 = zzaoxVar.zza;
                }
                parseDouble2 /= d2;
                return (long) (parseDouble2 * 1000000.0d);
            }
            d = 60.0d;
        }
        parseDouble2 *= d;
        return (long) (parseDouble2 * 1000000.0d);
    }

    @Override // com.google.android.gms.internal.ads.zzanz
    public final void zza(byte[] bArr, int i, int i2, zzany zzanyVar, zzdu zzduVar) {
        zzant.zza(zzb(bArr, i, i2), zzanyVar, zzduVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(9:270|(6:271|272|273|(8:275|276|277|(2:281|(2:283|(3:285|(2:287|(2:289|(3:301|302|(1:304)))(2:308|(1:310)))(2:311|(1:313))|291)(2:314|315))(1:316))(1:317)|292|293|294|296)|339|340)|(4:(3:342|343|(4:345|(1:347)(1:384)|348|(1:350)(9:383|352|(2:354|(1:356)(2:(5:371|372|373|374|(1:376))(1:381)|377))(1:382)|357|358|359|360|361|(1:363)))(1:385))(1:386)|360|361|(0))|351|352|(0)(0)|357|358|359) */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x0719, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x071a, code lost:
    
        r6 = r27;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0536 A[Catch: IOException -> 0x0098, XmlPullParserException -> 0x009c, TryCatch #17 {IOException -> 0x0098, XmlPullParserException -> 0x009c, blocks: (B:3:0x0009, B:5:0x0069, B:7:0x0074, B:10:0x007d, B:13:0x008b, B:15:0x0093, B:16:0x00a2, B:18:0x00aa, B:21:0x00bf, B:22:0x00db, B:24:0x00e5, B:25:0x00e9, B:27:0x00f6, B:28:0x0101, B:32:0x0178, B:36:0x01d3, B:39:0x01e7, B:41:0x01ed, B:43:0x01f5, B:45:0x01fd, B:47:0x0205, B:49:0x020d, B:51:0x0215, B:53:0x021b, B:55:0x0223, B:57:0x022b, B:59:0x0231, B:61:0x0237, B:63:0x023d, B:65:0x0245, B:68:0x024e, B:71:0x078d, B:72:0x027f, B:74:0x0285, B:76:0x028e, B:78:0x029d, B:80:0x02aa, B:82:0x02c0, B:84:0x02c6, B:86:0x0586, B:96:0x02d5, B:99:0x02e1, B:104:0x0536, B:107:0x02fd, B:109:0x0305, B:111:0x030d, B:113:0x0315, B:116:0x0322, B:120:0x033b, B:122:0x0341, B:124:0x034e, B:126:0x03b6, B:128:0x03bc, B:130:0x03c2, B:132:0x03ca, B:134:0x03d0, B:138:0x03e3, B:140:0x03e9, B:142:0x03f6, B:143:0x046e, B:145:0x0476, B:147:0x047c, B:149:0x0484, B:151:0x048a, B:164:0x04d6, B:166:0x04df, B:182:0x0529, B:200:0x0402, B:204:0x0404, B:205:0x0405, B:207:0x0412, B:210:0x041a, B:213:0x0428, B:215:0x042e, B:217:0x0439, B:220:0x044d, B:223:0x044f, B:224:0x0450, B:225:0x045d, B:229:0x0358, B:232:0x035a, B:233:0x035b, B:234:0x0365, B:237:0x036f, B:240:0x0378, B:242:0x037e, B:244:0x0389, B:247:0x039a, B:250:0x039c, B:251:0x039d, B:252:0x03a5, B:256:0x0549, B:258:0x0556, B:260:0x0561, B:262:0x0567, B:263:0x0573, B:272:0x05a7, B:276:0x05c9, B:302:0x0633, B:304:0x063b, B:294:0x0681, B:300:0x0723, B:308:0x064f, B:311:0x0659, B:315:0x0667, B:316:0x0671, B:317:0x0679, B:342:0x0692, B:358:0x06f5, B:361:0x0703, B:363:0x0708, B:373:0x06de, B:390:0x0185, B:392:0x0191, B:395:0x019a, B:397:0x01a0, B:399:0x01ab, B:402:0x01b8, B:405:0x01ba, B:406:0x01bb, B:407:0x011a, B:409:0x0126, B:412:0x012f, B:414:0x0135, B:417:0x013c, B:419:0x0142, B:424:0x0158, B:426:0x0170, B:431:0x0166, B:437:0x016f, B:448:0x0743, B:451:0x0750, B:454:0x0754, B:456:0x075e, B:458:0x0768, B:461:0x076f, B:462:0x0770, B:465:0x0782, B:468:0x078a, B:474:0x07a9), top: B:2:0x0009, inners: #0, #3, #6, #7, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0322 A[Catch: IOException -> 0x0098, XmlPullParserException -> 0x009c, TRY_LEAVE, TryCatch #17 {IOException -> 0x0098, XmlPullParserException -> 0x009c, blocks: (B:3:0x0009, B:5:0x0069, B:7:0x0074, B:10:0x007d, B:13:0x008b, B:15:0x0093, B:16:0x00a2, B:18:0x00aa, B:21:0x00bf, B:22:0x00db, B:24:0x00e5, B:25:0x00e9, B:27:0x00f6, B:28:0x0101, B:32:0x0178, B:36:0x01d3, B:39:0x01e7, B:41:0x01ed, B:43:0x01f5, B:45:0x01fd, B:47:0x0205, B:49:0x020d, B:51:0x0215, B:53:0x021b, B:55:0x0223, B:57:0x022b, B:59:0x0231, B:61:0x0237, B:63:0x023d, B:65:0x0245, B:68:0x024e, B:71:0x078d, B:72:0x027f, B:74:0x0285, B:76:0x028e, B:78:0x029d, B:80:0x02aa, B:82:0x02c0, B:84:0x02c6, B:86:0x0586, B:96:0x02d5, B:99:0x02e1, B:104:0x0536, B:107:0x02fd, B:109:0x0305, B:111:0x030d, B:113:0x0315, B:116:0x0322, B:120:0x033b, B:122:0x0341, B:124:0x034e, B:126:0x03b6, B:128:0x03bc, B:130:0x03c2, B:132:0x03ca, B:134:0x03d0, B:138:0x03e3, B:140:0x03e9, B:142:0x03f6, B:143:0x046e, B:145:0x0476, B:147:0x047c, B:149:0x0484, B:151:0x048a, B:164:0x04d6, B:166:0x04df, B:182:0x0529, B:200:0x0402, B:204:0x0404, B:205:0x0405, B:207:0x0412, B:210:0x041a, B:213:0x0428, B:215:0x042e, B:217:0x0439, B:220:0x044d, B:223:0x044f, B:224:0x0450, B:225:0x045d, B:229:0x0358, B:232:0x035a, B:233:0x035b, B:234:0x0365, B:237:0x036f, B:240:0x0378, B:242:0x037e, B:244:0x0389, B:247:0x039a, B:250:0x039c, B:251:0x039d, B:252:0x03a5, B:256:0x0549, B:258:0x0556, B:260:0x0561, B:262:0x0567, B:263:0x0573, B:272:0x05a7, B:276:0x05c9, B:302:0x0633, B:304:0x063b, B:294:0x0681, B:300:0x0723, B:308:0x064f, B:311:0x0659, B:315:0x0667, B:316:0x0671, B:317:0x0679, B:342:0x0692, B:358:0x06f5, B:361:0x0703, B:363:0x0708, B:373:0x06de, B:390:0x0185, B:392:0x0191, B:395:0x019a, B:397:0x01a0, B:399:0x01ab, B:402:0x01b8, B:405:0x01ba, B:406:0x01bb, B:407:0x011a, B:409:0x0126, B:412:0x012f, B:414:0x0135, B:417:0x013c, B:419:0x0142, B:424:0x0158, B:426:0x0170, B:431:0x0166, B:437:0x016f, B:448:0x0743, B:451:0x0750, B:454:0x0754, B:456:0x075e, B:458:0x0768, B:461:0x076f, B:462:0x0770, B:465:0x0782, B:468:0x078a, B:474:0x07a9), top: B:2:0x0009, inners: #0, #3, #6, #7, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03d0 A[Catch: IOException -> 0x0098, XmlPullParserException -> 0x009c, TRY_LEAVE, TryCatch #17 {IOException -> 0x0098, XmlPullParserException -> 0x009c, blocks: (B:3:0x0009, B:5:0x0069, B:7:0x0074, B:10:0x007d, B:13:0x008b, B:15:0x0093, B:16:0x00a2, B:18:0x00aa, B:21:0x00bf, B:22:0x00db, B:24:0x00e5, B:25:0x00e9, B:27:0x00f6, B:28:0x0101, B:32:0x0178, B:36:0x01d3, B:39:0x01e7, B:41:0x01ed, B:43:0x01f5, B:45:0x01fd, B:47:0x0205, B:49:0x020d, B:51:0x0215, B:53:0x021b, B:55:0x0223, B:57:0x022b, B:59:0x0231, B:61:0x0237, B:63:0x023d, B:65:0x0245, B:68:0x024e, B:71:0x078d, B:72:0x027f, B:74:0x0285, B:76:0x028e, B:78:0x029d, B:80:0x02aa, B:82:0x02c0, B:84:0x02c6, B:86:0x0586, B:96:0x02d5, B:99:0x02e1, B:104:0x0536, B:107:0x02fd, B:109:0x0305, B:111:0x030d, B:113:0x0315, B:116:0x0322, B:120:0x033b, B:122:0x0341, B:124:0x034e, B:126:0x03b6, B:128:0x03bc, B:130:0x03c2, B:132:0x03ca, B:134:0x03d0, B:138:0x03e3, B:140:0x03e9, B:142:0x03f6, B:143:0x046e, B:145:0x0476, B:147:0x047c, B:149:0x0484, B:151:0x048a, B:164:0x04d6, B:166:0x04df, B:182:0x0529, B:200:0x0402, B:204:0x0404, B:205:0x0405, B:207:0x0412, B:210:0x041a, B:213:0x0428, B:215:0x042e, B:217:0x0439, B:220:0x044d, B:223:0x044f, B:224:0x0450, B:225:0x045d, B:229:0x0358, B:232:0x035a, B:233:0x035b, B:234:0x0365, B:237:0x036f, B:240:0x0378, B:242:0x037e, B:244:0x0389, B:247:0x039a, B:250:0x039c, B:251:0x039d, B:252:0x03a5, B:256:0x0549, B:258:0x0556, B:260:0x0561, B:262:0x0567, B:263:0x0573, B:272:0x05a7, B:276:0x05c9, B:302:0x0633, B:304:0x063b, B:294:0x0681, B:300:0x0723, B:308:0x064f, B:311:0x0659, B:315:0x0667, B:316:0x0671, B:317:0x0679, B:342:0x0692, B:358:0x06f5, B:361:0x0703, B:363:0x0708, B:373:0x06de, B:390:0x0185, B:392:0x0191, B:395:0x019a, B:397:0x01a0, B:399:0x01ab, B:402:0x01b8, B:405:0x01ba, B:406:0x01bb, B:407:0x011a, B:409:0x0126, B:412:0x012f, B:414:0x0135, B:417:0x013c, B:419:0x0142, B:424:0x0158, B:426:0x0170, B:431:0x0166, B:437:0x016f, B:448:0x0743, B:451:0x0750, B:454:0x0754, B:456:0x075e, B:458:0x0768, B:461:0x076f, B:462:0x0770, B:465:0x0782, B:468:0x078a, B:474:0x07a9), top: B:2:0x0009, inners: #0, #3, #6, #7, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x048a A[Catch: IOException -> 0x0098, XmlPullParserException -> 0x009c, TRY_LEAVE, TryCatch #17 {IOException -> 0x0098, XmlPullParserException -> 0x009c, blocks: (B:3:0x0009, B:5:0x0069, B:7:0x0074, B:10:0x007d, B:13:0x008b, B:15:0x0093, B:16:0x00a2, B:18:0x00aa, B:21:0x00bf, B:22:0x00db, B:24:0x00e5, B:25:0x00e9, B:27:0x00f6, B:28:0x0101, B:32:0x0178, B:36:0x01d3, B:39:0x01e7, B:41:0x01ed, B:43:0x01f5, B:45:0x01fd, B:47:0x0205, B:49:0x020d, B:51:0x0215, B:53:0x021b, B:55:0x0223, B:57:0x022b, B:59:0x0231, B:61:0x0237, B:63:0x023d, B:65:0x0245, B:68:0x024e, B:71:0x078d, B:72:0x027f, B:74:0x0285, B:76:0x028e, B:78:0x029d, B:80:0x02aa, B:82:0x02c0, B:84:0x02c6, B:86:0x0586, B:96:0x02d5, B:99:0x02e1, B:104:0x0536, B:107:0x02fd, B:109:0x0305, B:111:0x030d, B:113:0x0315, B:116:0x0322, B:120:0x033b, B:122:0x0341, B:124:0x034e, B:126:0x03b6, B:128:0x03bc, B:130:0x03c2, B:132:0x03ca, B:134:0x03d0, B:138:0x03e3, B:140:0x03e9, B:142:0x03f6, B:143:0x046e, B:145:0x0476, B:147:0x047c, B:149:0x0484, B:151:0x048a, B:164:0x04d6, B:166:0x04df, B:182:0x0529, B:200:0x0402, B:204:0x0404, B:205:0x0405, B:207:0x0412, B:210:0x041a, B:213:0x0428, B:215:0x042e, B:217:0x0439, B:220:0x044d, B:223:0x044f, B:224:0x0450, B:225:0x045d, B:229:0x0358, B:232:0x035a, B:233:0x035b, B:234:0x0365, B:237:0x036f, B:240:0x0378, B:242:0x037e, B:244:0x0389, B:247:0x039a, B:250:0x039c, B:251:0x039d, B:252:0x03a5, B:256:0x0549, B:258:0x0556, B:260:0x0561, B:262:0x0567, B:263:0x0573, B:272:0x05a7, B:276:0x05c9, B:302:0x0633, B:304:0x063b, B:294:0x0681, B:300:0x0723, B:308:0x064f, B:311:0x0659, B:315:0x0667, B:316:0x0671, B:317:0x0679, B:342:0x0692, B:358:0x06f5, B:361:0x0703, B:363:0x0708, B:373:0x06de, B:390:0x0185, B:392:0x0191, B:395:0x019a, B:397:0x01a0, B:399:0x01ab, B:402:0x01b8, B:405:0x01ba, B:406:0x01bb, B:407:0x011a, B:409:0x0126, B:412:0x012f, B:414:0x0135, B:417:0x013c, B:419:0x0142, B:424:0x0158, B:426:0x0170, B:431:0x0166, B:437:0x016f, B:448:0x0743, B:451:0x0750, B:454:0x0754, B:456:0x075e, B:458:0x0768, B:461:0x076f, B:462:0x0770, B:465:0x0782, B:468:0x078a, B:474:0x07a9), top: B:2:0x0009, inners: #0, #3, #6, #7, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x04df A[Catch: IOException -> 0x0098, XmlPullParserException -> 0x009c, TRY_LEAVE, TryCatch #17 {IOException -> 0x0098, XmlPullParserException -> 0x009c, blocks: (B:3:0x0009, B:5:0x0069, B:7:0x0074, B:10:0x007d, B:13:0x008b, B:15:0x0093, B:16:0x00a2, B:18:0x00aa, B:21:0x00bf, B:22:0x00db, B:24:0x00e5, B:25:0x00e9, B:27:0x00f6, B:28:0x0101, B:32:0x0178, B:36:0x01d3, B:39:0x01e7, B:41:0x01ed, B:43:0x01f5, B:45:0x01fd, B:47:0x0205, B:49:0x020d, B:51:0x0215, B:53:0x021b, B:55:0x0223, B:57:0x022b, B:59:0x0231, B:61:0x0237, B:63:0x023d, B:65:0x0245, B:68:0x024e, B:71:0x078d, B:72:0x027f, B:74:0x0285, B:76:0x028e, B:78:0x029d, B:80:0x02aa, B:82:0x02c0, B:84:0x02c6, B:86:0x0586, B:96:0x02d5, B:99:0x02e1, B:104:0x0536, B:107:0x02fd, B:109:0x0305, B:111:0x030d, B:113:0x0315, B:116:0x0322, B:120:0x033b, B:122:0x0341, B:124:0x034e, B:126:0x03b6, B:128:0x03bc, B:130:0x03c2, B:132:0x03ca, B:134:0x03d0, B:138:0x03e3, B:140:0x03e9, B:142:0x03f6, B:143:0x046e, B:145:0x0476, B:147:0x047c, B:149:0x0484, B:151:0x048a, B:164:0x04d6, B:166:0x04df, B:182:0x0529, B:200:0x0402, B:204:0x0404, B:205:0x0405, B:207:0x0412, B:210:0x041a, B:213:0x0428, B:215:0x042e, B:217:0x0439, B:220:0x044d, B:223:0x044f, B:224:0x0450, B:225:0x045d, B:229:0x0358, B:232:0x035a, B:233:0x035b, B:234:0x0365, B:237:0x036f, B:240:0x0378, B:242:0x037e, B:244:0x0389, B:247:0x039a, B:250:0x039c, B:251:0x039d, B:252:0x03a5, B:256:0x0549, B:258:0x0556, B:260:0x0561, B:262:0x0567, B:263:0x0573, B:272:0x05a7, B:276:0x05c9, B:302:0x0633, B:304:0x063b, B:294:0x0681, B:300:0x0723, B:308:0x064f, B:311:0x0659, B:315:0x0667, B:316:0x0671, B:317:0x0679, B:342:0x0692, B:358:0x06f5, B:361:0x0703, B:363:0x0708, B:373:0x06de, B:390:0x0185, B:392:0x0191, B:395:0x019a, B:397:0x01a0, B:399:0x01ab, B:402:0x01b8, B:405:0x01ba, B:406:0x01bb, B:407:0x011a, B:409:0x0126, B:412:0x012f, B:414:0x0135, B:417:0x013c, B:419:0x0142, B:424:0x0158, B:426:0x0170, B:431:0x0166, B:437:0x016f, B:448:0x0743, B:451:0x0750, B:454:0x0754, B:456:0x075e, B:458:0x0768, B:461:0x076f, B:462:0x0770, B:465:0x0782, B:468:0x078a, B:474:0x07a9), top: B:2:0x0009, inners: #0, #3, #6, #7, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0708 A[Catch: IOException -> 0x0098, XmlPullParserException -> 0x009c, zzanv -> 0x070c, TRY_LEAVE, TryCatch #15 {zzanv -> 0x070c, blocks: (B:361:0x0703, B:363:0x0708), top: B:360:0x0703 }] */
    /* JADX WARN: Removed duplicated region for block: B:382:0x06f1  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0185 A[Catch: IOException -> 0x0098, XmlPullParserException -> 0x009c, TryCatch #17 {IOException -> 0x0098, XmlPullParserException -> 0x009c, blocks: (B:3:0x0009, B:5:0x0069, B:7:0x0074, B:10:0x007d, B:13:0x008b, B:15:0x0093, B:16:0x00a2, B:18:0x00aa, B:21:0x00bf, B:22:0x00db, B:24:0x00e5, B:25:0x00e9, B:27:0x00f6, B:28:0x0101, B:32:0x0178, B:36:0x01d3, B:39:0x01e7, B:41:0x01ed, B:43:0x01f5, B:45:0x01fd, B:47:0x0205, B:49:0x020d, B:51:0x0215, B:53:0x021b, B:55:0x0223, B:57:0x022b, B:59:0x0231, B:61:0x0237, B:63:0x023d, B:65:0x0245, B:68:0x024e, B:71:0x078d, B:72:0x027f, B:74:0x0285, B:76:0x028e, B:78:0x029d, B:80:0x02aa, B:82:0x02c0, B:84:0x02c6, B:86:0x0586, B:96:0x02d5, B:99:0x02e1, B:104:0x0536, B:107:0x02fd, B:109:0x0305, B:111:0x030d, B:113:0x0315, B:116:0x0322, B:120:0x033b, B:122:0x0341, B:124:0x034e, B:126:0x03b6, B:128:0x03bc, B:130:0x03c2, B:132:0x03ca, B:134:0x03d0, B:138:0x03e3, B:140:0x03e9, B:142:0x03f6, B:143:0x046e, B:145:0x0476, B:147:0x047c, B:149:0x0484, B:151:0x048a, B:164:0x04d6, B:166:0x04df, B:182:0x0529, B:200:0x0402, B:204:0x0404, B:205:0x0405, B:207:0x0412, B:210:0x041a, B:213:0x0428, B:215:0x042e, B:217:0x0439, B:220:0x044d, B:223:0x044f, B:224:0x0450, B:225:0x045d, B:229:0x0358, B:232:0x035a, B:233:0x035b, B:234:0x0365, B:237:0x036f, B:240:0x0378, B:242:0x037e, B:244:0x0389, B:247:0x039a, B:250:0x039c, B:251:0x039d, B:252:0x03a5, B:256:0x0549, B:258:0x0556, B:260:0x0561, B:262:0x0567, B:263:0x0573, B:272:0x05a7, B:276:0x05c9, B:302:0x0633, B:304:0x063b, B:294:0x0681, B:300:0x0723, B:308:0x064f, B:311:0x0659, B:315:0x0667, B:316:0x0671, B:317:0x0679, B:342:0x0692, B:358:0x06f5, B:361:0x0703, B:363:0x0708, B:373:0x06de, B:390:0x0185, B:392:0x0191, B:395:0x019a, B:397:0x01a0, B:399:0x01ab, B:402:0x01b8, B:405:0x01ba, B:406:0x01bb, B:407:0x011a, B:409:0x0126, B:412:0x012f, B:414:0x0135, B:417:0x013c, B:419:0x0142, B:424:0x0158, B:426:0x0170, B:431:0x0166, B:437:0x016f, B:448:0x0743, B:451:0x0750, B:454:0x0754, B:456:0x075e, B:458:0x0768, B:461:0x076f, B:462:0x0770, B:465:0x0782, B:468:0x078a, B:474:0x07a9), top: B:2:0x0009, inners: #0, #3, #6, #7, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01e7 A[Catch: IOException -> 0x0098, XmlPullParserException -> 0x009c, TRY_ENTER, TryCatch #17 {IOException -> 0x0098, XmlPullParserException -> 0x009c, blocks: (B:3:0x0009, B:5:0x0069, B:7:0x0074, B:10:0x007d, B:13:0x008b, B:15:0x0093, B:16:0x00a2, B:18:0x00aa, B:21:0x00bf, B:22:0x00db, B:24:0x00e5, B:25:0x00e9, B:27:0x00f6, B:28:0x0101, B:32:0x0178, B:36:0x01d3, B:39:0x01e7, B:41:0x01ed, B:43:0x01f5, B:45:0x01fd, B:47:0x0205, B:49:0x020d, B:51:0x0215, B:53:0x021b, B:55:0x0223, B:57:0x022b, B:59:0x0231, B:61:0x0237, B:63:0x023d, B:65:0x0245, B:68:0x024e, B:71:0x078d, B:72:0x027f, B:74:0x0285, B:76:0x028e, B:78:0x029d, B:80:0x02aa, B:82:0x02c0, B:84:0x02c6, B:86:0x0586, B:96:0x02d5, B:99:0x02e1, B:104:0x0536, B:107:0x02fd, B:109:0x0305, B:111:0x030d, B:113:0x0315, B:116:0x0322, B:120:0x033b, B:122:0x0341, B:124:0x034e, B:126:0x03b6, B:128:0x03bc, B:130:0x03c2, B:132:0x03ca, B:134:0x03d0, B:138:0x03e3, B:140:0x03e9, B:142:0x03f6, B:143:0x046e, B:145:0x0476, B:147:0x047c, B:149:0x0484, B:151:0x048a, B:164:0x04d6, B:166:0x04df, B:182:0x0529, B:200:0x0402, B:204:0x0404, B:205:0x0405, B:207:0x0412, B:210:0x041a, B:213:0x0428, B:215:0x042e, B:217:0x0439, B:220:0x044d, B:223:0x044f, B:224:0x0450, B:225:0x045d, B:229:0x0358, B:232:0x035a, B:233:0x035b, B:234:0x0365, B:237:0x036f, B:240:0x0378, B:242:0x037e, B:244:0x0389, B:247:0x039a, B:250:0x039c, B:251:0x039d, B:252:0x03a5, B:256:0x0549, B:258:0x0556, B:260:0x0561, B:262:0x0567, B:263:0x0573, B:272:0x05a7, B:276:0x05c9, B:302:0x0633, B:304:0x063b, B:294:0x0681, B:300:0x0723, B:308:0x064f, B:311:0x0659, B:315:0x0667, B:316:0x0671, B:317:0x0679, B:342:0x0692, B:358:0x06f5, B:361:0x0703, B:363:0x0708, B:373:0x06de, B:390:0x0185, B:392:0x0191, B:395:0x019a, B:397:0x01a0, B:399:0x01ab, B:402:0x01b8, B:405:0x01ba, B:406:0x01bb, B:407:0x011a, B:409:0x0126, B:412:0x012f, B:414:0x0135, B:417:0x013c, B:419:0x0142, B:424:0x0158, B:426:0x0170, B:431:0x0166, B:437:0x016f, B:448:0x0743, B:451:0x0750, B:454:0x0754, B:456:0x075e, B:458:0x0768, B:461:0x076f, B:462:0x0770, B:465:0x0782, B:468:0x078a, B:474:0x07a9), top: B:2:0x0009, inners: #0, #3, #6, #7, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0285 A[Catch: IOException -> 0x0098, XmlPullParserException -> 0x009c, LOOP:1: B:74:0x0285->B:88:0x0592, LOOP_START, PHI: r1 r7 r8 r9 r12 r14 r15 r31
      0x0285: PHI (r1v24 java.lang.String) = (r1v21 java.lang.String), (r1v63 java.lang.String) binds: [B:73:0x0283, B:88:0x0592] A[DONT_GENERATE, DONT_INLINE]
      0x0285: PHI (r7v11 int) = (r7v8 int), (r7v42 int) binds: [B:73:0x0283, B:88:0x0592] A[DONT_GENERATE, DONT_INLINE]
      0x0285: PHI (r8v14 java.lang.String) = (r8v1 java.lang.String), (r8v39 java.lang.String) binds: [B:73:0x0283, B:88:0x0592] A[DONT_GENERATE, DONT_INLINE]
      0x0285: PHI (r9v26 java.lang.String) = (r9v2 java.lang.String), (r9v37 java.lang.String) binds: [B:73:0x0283, B:88:0x0592] A[DONT_GENERATE, DONT_INLINE]
      0x0285: PHI (r12v13 java.util.HashMap) = (r12v1 java.util.HashMap), (r12v24 java.util.HashMap) binds: [B:73:0x0283, B:88:0x0592] A[DONT_GENERATE, DONT_INLINE]
      0x0285: PHI (r14v22 java.lang.String) = (r14v6 java.lang.String), (r14v25 java.lang.String) binds: [B:73:0x0283, B:88:0x0592] A[DONT_GENERATE, DONT_INLINE]
      0x0285: PHI (r15v14 java.lang.String) = (r15v11 java.lang.String), (r15v23 java.lang.String) binds: [B:73:0x0283, B:88:0x0592] A[DONT_GENERATE, DONT_INLINE]
      0x0285: PHI (r31v1 java.util.HashMap) = (r31v0 java.util.HashMap), (r31v4 java.util.HashMap) binds: [B:73:0x0283, B:88:0x0592] A[DONT_GENERATE, DONT_INLINE], TryCatch #17 {IOException -> 0x0098, XmlPullParserException -> 0x009c, blocks: (B:3:0x0009, B:5:0x0069, B:7:0x0074, B:10:0x007d, B:13:0x008b, B:15:0x0093, B:16:0x00a2, B:18:0x00aa, B:21:0x00bf, B:22:0x00db, B:24:0x00e5, B:25:0x00e9, B:27:0x00f6, B:28:0x0101, B:32:0x0178, B:36:0x01d3, B:39:0x01e7, B:41:0x01ed, B:43:0x01f5, B:45:0x01fd, B:47:0x0205, B:49:0x020d, B:51:0x0215, B:53:0x021b, B:55:0x0223, B:57:0x022b, B:59:0x0231, B:61:0x0237, B:63:0x023d, B:65:0x0245, B:68:0x024e, B:71:0x078d, B:72:0x027f, B:74:0x0285, B:76:0x028e, B:78:0x029d, B:80:0x02aa, B:82:0x02c0, B:84:0x02c6, B:86:0x0586, B:96:0x02d5, B:99:0x02e1, B:104:0x0536, B:107:0x02fd, B:109:0x0305, B:111:0x030d, B:113:0x0315, B:116:0x0322, B:120:0x033b, B:122:0x0341, B:124:0x034e, B:126:0x03b6, B:128:0x03bc, B:130:0x03c2, B:132:0x03ca, B:134:0x03d0, B:138:0x03e3, B:140:0x03e9, B:142:0x03f6, B:143:0x046e, B:145:0x0476, B:147:0x047c, B:149:0x0484, B:151:0x048a, B:164:0x04d6, B:166:0x04df, B:182:0x0529, B:200:0x0402, B:204:0x0404, B:205:0x0405, B:207:0x0412, B:210:0x041a, B:213:0x0428, B:215:0x042e, B:217:0x0439, B:220:0x044d, B:223:0x044f, B:224:0x0450, B:225:0x045d, B:229:0x0358, B:232:0x035a, B:233:0x035b, B:234:0x0365, B:237:0x036f, B:240:0x0378, B:242:0x037e, B:244:0x0389, B:247:0x039a, B:250:0x039c, B:251:0x039d, B:252:0x03a5, B:256:0x0549, B:258:0x0556, B:260:0x0561, B:262:0x0567, B:263:0x0573, B:272:0x05a7, B:276:0x05c9, B:302:0x0633, B:304:0x063b, B:294:0x0681, B:300:0x0723, B:308:0x064f, B:311:0x0659, B:315:0x0667, B:316:0x0671, B:317:0x0679, B:342:0x0692, B:358:0x06f5, B:361:0x0703, B:363:0x0708, B:373:0x06de, B:390:0x0185, B:392:0x0191, B:395:0x019a, B:397:0x01a0, B:399:0x01ab, B:402:0x01b8, B:405:0x01ba, B:406:0x01bb, B:407:0x011a, B:409:0x0126, B:412:0x012f, B:414:0x0135, B:417:0x013c, B:419:0x0142, B:424:0x0158, B:426:0x0170, B:431:0x0166, B:437:0x016f, B:448:0x0743, B:451:0x0750, B:454:0x0754, B:456:0x075e, B:458:0x0768, B:461:0x076f, B:462:0x0770, B:465:0x0782, B:468:0x078a, B:474:0x07a9), top: B:2:0x0009, inners: #0, #3, #6, #7, #14 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzanu zzb(byte[] bArr, int i, int i2) {
        String str;
        String str2;
        String str3;
        HashMap hashMap;
        zzaox zzaoxVar;
        ArrayDeque arrayDeque;
        HashMap hashMap2;
        int i3;
        zzaow zzaowVar;
        ArrayDeque arrayDeque2;
        zzaoy zzaoyVar;
        int i4;
        HashMap hashMap3;
        int i5;
        String str4;
        zzaox zzaoxVar2;
        zzanv zzanvVar;
        zzapc zzd2;
        String str5;
        long j;
        long j2;
        String[] strArr;
        String str6;
        long j3;
        zzaow zzaowVar2;
        long j4;
        zzaow zzaowVar3;
        long j5;
        long j6;
        Object obj;
        char c;
        String str7;
        String str8;
        String str9;
        String str10;
        String zzc2;
        String str11;
        String str12;
        int i6;
        HashMap hashMap4;
        String str13;
        float f;
        float f2;
        String zzc3;
        float f3;
        float f4;
        String zzc4;
        float f5;
        int i7;
        String zzc5;
        int i8;
        zzapa zzapaVar;
        char c2;
        char c3;
        String zzc6;
        zzapc zzapcVar;
        String zzc7;
        zzapc zzapcVar2;
        float f6;
        zzapc zzapcVar3;
        String str14;
        float f7;
        int i9;
        String group;
        String group2;
        boolean z;
        String zzc8;
        int i10 = 1;
        String str15 = "";
        String str16 = "http://www.w3.org/ns/ttml#parameter";
        String str17 = "Ignoring unsupported tag: ";
        try {
            XmlPullParser newPullParser = this.zzi.newPullParser();
            HashMap hashMap5 = new HashMap();
            HashMap hashMap6 = new HashMap();
            HashMap hashMap7 = new HashMap();
            hashMap6.put("", new zzapa("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            newPullParser.setInput(new ByteArrayInputStream(bArr, i, i2), null);
            ArrayDeque arrayDeque3 = new ArrayDeque();
            int eventType = newPullParser.getEventType();
            zzaox zzaoxVar3 = zzh;
            zzapd zzapdVar = null;
            zzaoy zzaoyVar2 = null;
            zzaox zzaoxVar4 = zzaoxVar3;
            int i11 = 15;
            int i12 = 0;
            while (eventType != i10) {
                zzaow zzaowVar4 = (zzaow) arrayDeque3.peek();
                if (i12 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        str = str15;
                        if ("tt".equals(name)) {
                            String attributeValue = newPullParser.getAttributeValue(str16, "frameRate");
                            int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
                            String attributeValue2 = newPullParser.getAttributeValue(str16, "frameRateMultiplier");
                            if (attributeValue2 != null) {
                                arrayDeque2 = arrayDeque3;
                                String str18 = zzfm.zza;
                                zzaowVar = zzaowVar4;
                                zzguk.zzb(attributeValue2.split(" ", -1).length == 2, "frameRateMultiplier doesn't have 2 parts");
                                f7 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
                            } else {
                                zzaowVar = zzaowVar4;
                                arrayDeque2 = arrayDeque3;
                                f7 = 1.0f;
                            }
                            int i13 = zzaoxVar3.zzb;
                            String attributeValue3 = newPullParser.getAttributeValue(str16, "subFrameRate");
                            if (attributeValue3 != null) {
                                i13 = Integer.parseInt(attributeValue3);
                            }
                            int i14 = zzaoxVar3.zzc;
                            String attributeValue4 = newPullParser.getAttributeValue(str16, "tickRate");
                            if (attributeValue4 != null) {
                                i9 = Integer.parseInt(attributeValue4);
                                zzaoxVar = zzaoxVar3;
                            } else {
                                zzaoxVar = zzaoxVar3;
                                i9 = i14;
                            }
                            zzaox zzaoxVar5 = new zzaox(parseInt * f7, i13, i9);
                            String attributeValue5 = newPullParser.getAttributeValue(str16, "cellResolution");
                            if (attributeValue5 != null) {
                                Matcher matcher = zzg.matcher(attributeValue5);
                                if (matcher.matches()) {
                                    try {
                                        group = matcher.group(1);
                                    } catch (NumberFormatException unused) {
                                        str2 = str16;
                                    }
                                    if (group == null) {
                                        throw null;
                                    }
                                    int parseInt2 = Integer.parseInt(group);
                                    str2 = str16;
                                    try {
                                        group2 = matcher.group(2);
                                    } catch (NumberFormatException unused2) {
                                        zzaoxVar4 = zzaoxVar5;
                                        zzeh.zzc("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                        i11 = 15;
                                        zzc8 = zzfv.zzc(newPullParser, "extent");
                                        if (zzc8 != null) {
                                        }
                                        zzaoyVar2 = null;
                                        zzaoyVar = zzaoyVar2;
                                        i4 = i11;
                                        String str19 = "image";
                                        String str20 = "metadata";
                                        String str21 = "region";
                                        zzaoxVar4 = zzaoxVar4;
                                        String str22 = "head";
                                        hashMap3 = hashMap7;
                                        if (!name.equals("tt")) {
                                            String name2 = newPullParser.getName();
                                            StringBuilder sb = new StringBuilder(String.valueOf(name2).length() + 26);
                                            sb.append(str17);
                                            sb.append(name2);
                                            zzeh.zzb("TtmlParser", sb.toString());
                                            zzaoyVar2 = zzaoyVar;
                                            i11 = i4;
                                            str3 = str17;
                                            hashMap = hashMap6;
                                            arrayDeque = arrayDeque2;
                                            hashMap2 = hashMap3;
                                            i3 = 1;
                                            i12 = 1;
                                            newPullParser.next();
                                            eventType = newPullParser.getEventType();
                                            i10 = i3;
                                            arrayDeque3 = arrayDeque;
                                            hashMap6 = hashMap;
                                            hashMap7 = hashMap2;
                                            str15 = str;
                                            zzaoxVar3 = zzaoxVar;
                                            str16 = str2;
                                            str17 = str3;
                                        }
                                        if ("head".equals(name)) {
                                        }
                                        i11 = i5;
                                        zzaoyVar2 = zzaoyVar;
                                        zzaoxVar4 = zzaoxVar2;
                                        i3 = 1;
                                        newPullParser.next();
                                        eventType = newPullParser.getEventType();
                                        i10 = i3;
                                        arrayDeque3 = arrayDeque;
                                        hashMap6 = hashMap;
                                        hashMap7 = hashMap2;
                                        str15 = str;
                                        zzaoxVar3 = zzaoxVar;
                                        str16 = str2;
                                        str17 = str3;
                                    }
                                    if (group2 == null) {
                                        throw null;
                                    }
                                    int parseInt3 = Integer.parseInt(group2);
                                    if (parseInt2 == 0) {
                                        zzaoxVar4 = zzaoxVar5;
                                        z = false;
                                    } else if (parseInt3 != 0) {
                                        zzaoxVar4 = zzaoxVar5;
                                        z = true;
                                    } else {
                                        zzaoxVar4 = zzaoxVar5;
                                        parseInt3 = 0;
                                        z = false;
                                    }
                                    try {
                                        zzguk.zzg(z, "Invalid cell resolution %s %s", parseInt2, parseInt3);
                                        i11 = parseInt3;
                                    } catch (NumberFormatException unused3) {
                                        zzeh.zzc("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                        i11 = 15;
                                        zzc8 = zzfv.zzc(newPullParser, "extent");
                                        if (zzc8 != null) {
                                        }
                                        zzaoyVar2 = null;
                                        zzaoyVar = zzaoyVar2;
                                        i4 = i11;
                                        String str192 = "image";
                                        String str202 = "metadata";
                                        String str212 = "region";
                                        zzaoxVar4 = zzaoxVar4;
                                        String str222 = "head";
                                        hashMap3 = hashMap7;
                                        if (!name.equals("tt")) {
                                        }
                                        if ("head".equals(name)) {
                                        }
                                        i11 = i5;
                                        zzaoyVar2 = zzaoyVar;
                                        zzaoxVar4 = zzaoxVar2;
                                        i3 = 1;
                                        newPullParser.next();
                                        eventType = newPullParser.getEventType();
                                        i10 = i3;
                                        arrayDeque3 = arrayDeque;
                                        hashMap6 = hashMap;
                                        hashMap7 = hashMap2;
                                        str15 = str;
                                        zzaoxVar3 = zzaoxVar;
                                        str16 = str2;
                                        str17 = str3;
                                    }
                                    zzc8 = zzfv.zzc(newPullParser, "extent");
                                    if (zzc8 != null) {
                                        Matcher matcher2 = zzf.matcher(zzc8);
                                        if (matcher2.matches()) {
                                            try {
                                                String group3 = matcher2.group(1);
                                                if (group3 == null) {
                                                    throw null;
                                                }
                                                int parseInt4 = Integer.parseInt(group3);
                                                String group4 = matcher2.group(2);
                                                if (group4 == null) {
                                                    throw null;
                                                }
                                                zzaoyVar2 = new zzaoy(parseInt4, Integer.parseInt(group4));
                                            } catch (NumberFormatException unused4) {
                                                zzeh.zzc("TtmlParser", "Ignoring malformed tts extent: ".concat(zzc8));
                                            }
                                        } else {
                                            zzeh.zzc("TtmlParser", "Ignoring non-pixel tts extent: ".concat(zzc8));
                                        }
                                    }
                                    zzaoyVar2 = null;
                                } else {
                                    zzeh.zzc("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                }
                            }
                            str2 = str16;
                            zzaoxVar4 = zzaoxVar5;
                            i11 = 15;
                            zzc8 = zzfv.zzc(newPullParser, "extent");
                            if (zzc8 != null) {
                            }
                            zzaoyVar2 = null;
                        } else {
                            zzaowVar = zzaowVar4;
                            arrayDeque2 = arrayDeque3;
                            str2 = str16;
                            zzaoxVar = zzaoxVar3;
                        }
                        zzaoyVar = zzaoyVar2;
                        i4 = i11;
                        String str1922 = "image";
                        String str2022 = "metadata";
                        String str2122 = "region";
                        zzaoxVar4 = zzaoxVar4;
                        String str2222 = "head";
                        hashMap3 = hashMap7;
                        if (!name.equals("tt") && !name.equals("head") && !name.equals("body") && !name.equals("div") && !name.equals("p") && !name.equals("span") && !name.equals("br") && !name.equals("style") && !name.equals("styling") && !name.equals("layout") && !name.equals("region") && !name.equals("metadata") && !name.equals("image") && !name.equals("data") && !name.equals("information")) {
                            String name22 = newPullParser.getName();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(name22).length() + 26);
                            sb2.append(str17);
                            sb2.append(name22);
                            zzeh.zzb("TtmlParser", sb2.toString());
                            zzaoyVar2 = zzaoyVar;
                            i11 = i4;
                            str3 = str17;
                            hashMap = hashMap6;
                            arrayDeque = arrayDeque2;
                            hashMap2 = hashMap3;
                            i3 = 1;
                            i12 = 1;
                        }
                        if ("head".equals(name)) {
                            while (true) {
                                newPullParser.next();
                                if (zzfv.zzb(newPullParser, "style")) {
                                    String zzc9 = zzfv.zzc(newPullParser, "style");
                                    zzapc zzd3 = zzd(newPullParser, new zzapc());
                                    if (zzc9 != null) {
                                        String[] zzc10 = zzc(zzc9);
                                        str3 = str17;
                                        str14 = str2222;
                                        int i15 = 0;
                                        for (int length = zzc10.length; i15 < length; length = length) {
                                            zzd3.zzr((zzapc) hashMap5.get(zzc10[i15]));
                                            i15++;
                                        }
                                    } else {
                                        str14 = str2222;
                                        str3 = str17;
                                    }
                                    String zzt = zzd3.zzt();
                                    if (zzt != null) {
                                        hashMap5.put(zzt, zzd3);
                                    }
                                    i5 = i4;
                                    str9 = str1922;
                                    hashMap = hashMap6;
                                    str7 = str2022;
                                    str8 = str2122;
                                    str10 = str14;
                                    hashMap2 = hashMap3;
                                } else {
                                    String str23 = str2222;
                                    str3 = str17;
                                    if (zzfv.zzb(newPullParser, str2122)) {
                                        str8 = str2122;
                                        String str24 = str1922;
                                        String zzc11 = zzfv.zzc(newPullParser, "id");
                                        if (zzc11 == null) {
                                            i5 = i4;
                                            hashMap4 = hashMap6;
                                            str13 = str2022;
                                        } else {
                                            String zzc12 = zzfv.zzc(newPullParser, "origin");
                                            if (zzc12 == null) {
                                                str11 = zzc12;
                                                String zzc13 = zzfv.zzc(newPullParser, "style");
                                                if (zzc13 != null && (zzapcVar3 = (zzapc) hashMap5.get(zzc13)) != null) {
                                                    str12 = zzapcVar3.zzL();
                                                    if (str12 == null) {
                                                        str13 = str2022;
                                                        Matcher matcher3 = zzb.matcher(str12);
                                                        hashMap4 = hashMap6;
                                                        Matcher matcher4 = zzf.matcher(str12);
                                                        if (matcher3.matches()) {
                                                            i6 = i4;
                                                            try {
                                                                String group5 = matcher3.group(1);
                                                                if (group5 == null) {
                                                                    throw null;
                                                                }
                                                                f6 = Float.parseFloat(group5) / 100.0f;
                                                                String group6 = matcher3.group(2);
                                                                if (group6 == null) {
                                                                    throw null;
                                                                }
                                                                f = Float.parseFloat(group6) / 100.0f;
                                                                f2 = f6;
                                                            } catch (NumberFormatException unused5) {
                                                                zzeh.zzc("TtmlParser", "Ignoring region with malformed origin: ".concat(str12));
                                                            }
                                                        } else {
                                                            i6 = i4;
                                                            if (!matcher4.matches()) {
                                                                zzeh.zzc("TtmlParser", "Ignoring region with unsupported origin: ".concat(str12));
                                                            } else if (zzaoyVar == null) {
                                                                zzeh.zzc("TtmlParser", "Ignoring region with missing tts:extent: ".concat(str12));
                                                            } else {
                                                                try {
                                                                    String group7 = matcher4.group(1);
                                                                    if (group7 == null) {
                                                                        throw null;
                                                                    }
                                                                    int parseInt5 = Integer.parseInt(group7);
                                                                    String group8 = matcher4.group(2);
                                                                    if (group8 == null) {
                                                                        throw null;
                                                                    }
                                                                    f6 = parseInt5 / zzaoyVar.zza;
                                                                    f = Integer.parseInt(group8) / zzaoyVar.zzb;
                                                                    f2 = f6;
                                                                } catch (NumberFormatException unused6) {
                                                                    zzeh.zzc("TtmlParser", "Ignoring region with malformed origin: ".concat(str12));
                                                                }
                                                            }
                                                            i5 = i6;
                                                        }
                                                    } else {
                                                        i6 = i4;
                                                        hashMap4 = hashMap6;
                                                        str13 = str2022;
                                                        f = 0.0f;
                                                        f2 = 0.0f;
                                                    }
                                                    zzc3 = zzfv.zzc(newPullParser, "extent");
                                                    if (zzc3 == null && (zzc7 = zzfv.zzc(newPullParser, "style")) != null && (zzapcVar2 = (zzapc) hashMap5.get(zzc7)) != null) {
                                                        zzc3 = zzapcVar2.zzN();
                                                    }
                                                    if (zzc3 == null) {
                                                        Matcher matcher5 = zzb.matcher(zzc3);
                                                        Matcher matcher6 = zzf.matcher(zzc3);
                                                        if (matcher5.matches()) {
                                                            try {
                                                                String group9 = matcher5.group(1);
                                                                if (group9 == null) {
                                                                    throw null;
                                                                }
                                                                float parseFloat = Float.parseFloat(group9) / 100.0f;
                                                                String group10 = matcher5.group(2);
                                                                if (group10 == null) {
                                                                    throw null;
                                                                }
                                                                f4 = Float.parseFloat(group10) / 100.0f;
                                                                f3 = parseFloat;
                                                            } catch (NumberFormatException unused7) {
                                                                zzeh.zzc("TtmlParser", "Ignoring region with malformed extent: ".concat(String.valueOf(str12)));
                                                            }
                                                        } else {
                                                            if (!matcher6.matches()) {
                                                                zzeh.zzc("TtmlParser", "Ignoring region with unsupported extent: ".concat(String.valueOf(str12)));
                                                            } else if (zzaoyVar == null) {
                                                                zzeh.zzc("TtmlParser", "Ignoring region with missing tts:extent: ".concat(String.valueOf(str12)));
                                                            } else {
                                                                try {
                                                                    String group11 = matcher6.group(1);
                                                                    if (group11 == null) {
                                                                        throw null;
                                                                    }
                                                                    int parseInt6 = Integer.parseInt(group11);
                                                                    String group12 = matcher6.group(2);
                                                                    if (group12 == null) {
                                                                        throw null;
                                                                    }
                                                                    f4 = Integer.parseInt(group12) / zzaoyVar.zzb;
                                                                    f3 = parseInt6 / zzaoyVar.zza;
                                                                } catch (NumberFormatException unused8) {
                                                                    zzeh.zzc("TtmlParser", "Ignoring region with malformed extent: ".concat(String.valueOf(str12)));
                                                                }
                                                            }
                                                            i5 = i6;
                                                        }
                                                        if (zzapaVar == null) {
                                                            hashMap = hashMap4;
                                                            hashMap.put(zzapaVar.zza, zzapaVar);
                                                        } else {
                                                            hashMap = hashMap4;
                                                        }
                                                        str10 = str23;
                                                        hashMap2 = hashMap3;
                                                        str9 = str24;
                                                        str7 = str13;
                                                    } else {
                                                        f3 = 1.0f;
                                                        f4 = 1.0f;
                                                    }
                                                    zzc4 = zzfv.zzc(newPullParser, "displayAlign");
                                                    if (zzc4 == null && (zzc6 = zzfv.zzc(newPullParser, "style")) != null && (zzapcVar = (zzapc) hashMap5.get(zzc6)) != null) {
                                                        zzc4 = zzapcVar.zzP();
                                                    }
                                                    if (zzc4 != null) {
                                                        String zza2 = zzgts.zza(zzc4);
                                                        int hashCode = zza2.hashCode();
                                                        if (hashCode != -1364013995) {
                                                            if (hashCode == 92734940 && zza2.equals("after")) {
                                                                c3 = 1;
                                                                if (c3 != 0) {
                                                                    f5 = f + (f4 / 2.0f);
                                                                    i5 = i6;
                                                                    i7 = 1;
                                                                } else if (c3 == 1) {
                                                                    f5 = f + f4;
                                                                    i5 = i6;
                                                                    i7 = 2;
                                                                }
                                                                float f8 = 1.0f / i5;
                                                                zzc5 = zzfv.zzc(newPullParser, "writingMode");
                                                                if (zzc5 != null) {
                                                                    String zza3 = zzgts.zza(zzc5);
                                                                    int hashCode2 = zza3.hashCode();
                                                                    if (hashCode2 == 3694) {
                                                                        if (zza3.equals("tb")) {
                                                                            c2 = 0;
                                                                            if (c2 != 0) {
                                                                            }
                                                                            i8 = 2;
                                                                            zzapaVar = new zzapa(zzc11, f2, f5, 0, i7, f3, f4, 1, f8, i8);
                                                                            if (zzapaVar == null) {
                                                                            }
                                                                            str10 = str23;
                                                                            hashMap2 = hashMap3;
                                                                            str9 = str24;
                                                                            str7 = str13;
                                                                        }
                                                                        c2 = 65535;
                                                                        if (c2 != 0) {
                                                                        }
                                                                        i8 = 2;
                                                                        zzapaVar = new zzapa(zzc11, f2, f5, 0, i7, f3, f4, 1, f8, i8);
                                                                        if (zzapaVar == null) {
                                                                        }
                                                                        str10 = str23;
                                                                        hashMap2 = hashMap3;
                                                                        str9 = str24;
                                                                        str7 = str13;
                                                                    } else if (hashCode2 != 3553396) {
                                                                        if (hashCode2 == 3553576 && zza3.equals("tbrl")) {
                                                                            c2 = 2;
                                                                            if (c2 != 0 || c2 == 1) {
                                                                                i8 = 2;
                                                                            } else if (c2 == 2) {
                                                                                i8 = 1;
                                                                            }
                                                                            zzapaVar = new zzapa(zzc11, f2, f5, 0, i7, f3, f4, 1, f8, i8);
                                                                            if (zzapaVar == null) {
                                                                            }
                                                                            str10 = str23;
                                                                            hashMap2 = hashMap3;
                                                                            str9 = str24;
                                                                            str7 = str13;
                                                                        }
                                                                        c2 = 65535;
                                                                        if (c2 != 0) {
                                                                        }
                                                                        i8 = 2;
                                                                        zzapaVar = new zzapa(zzc11, f2, f5, 0, i7, f3, f4, 1, f8, i8);
                                                                        if (zzapaVar == null) {
                                                                        }
                                                                        str10 = str23;
                                                                        hashMap2 = hashMap3;
                                                                        str9 = str24;
                                                                        str7 = str13;
                                                                    } else {
                                                                        if (zza3.equals("tblr")) {
                                                                            c2 = 1;
                                                                            if (c2 != 0) {
                                                                            }
                                                                            i8 = 2;
                                                                            zzapaVar = new zzapa(zzc11, f2, f5, 0, i7, f3, f4, 1, f8, i8);
                                                                            if (zzapaVar == null) {
                                                                            }
                                                                            str10 = str23;
                                                                            hashMap2 = hashMap3;
                                                                            str9 = str24;
                                                                            str7 = str13;
                                                                        }
                                                                        c2 = 65535;
                                                                        if (c2 != 0) {
                                                                        }
                                                                        i8 = 2;
                                                                        zzapaVar = new zzapa(zzc11, f2, f5, 0, i7, f3, f4, 1, f8, i8);
                                                                        if (zzapaVar == null) {
                                                                        }
                                                                        str10 = str23;
                                                                        hashMap2 = hashMap3;
                                                                        str9 = str24;
                                                                        str7 = str13;
                                                                    }
                                                                }
                                                                i8 = Integer.MIN_VALUE;
                                                                zzapaVar = new zzapa(zzc11, f2, f5, 0, i7, f3, f4, 1, f8, i8);
                                                                if (zzapaVar == null) {
                                                                }
                                                                str10 = str23;
                                                                hashMap2 = hashMap3;
                                                                str9 = str24;
                                                                str7 = str13;
                                                            }
                                                            c3 = 65535;
                                                            if (c3 != 0) {
                                                            }
                                                            float f82 = 1.0f / i5;
                                                            zzc5 = zzfv.zzc(newPullParser, "writingMode");
                                                            if (zzc5 != null) {
                                                            }
                                                            i8 = Integer.MIN_VALUE;
                                                            zzapaVar = new zzapa(zzc11, f2, f5, 0, i7, f3, f4, 1, f82, i8);
                                                            if (zzapaVar == null) {
                                                            }
                                                            str10 = str23;
                                                            hashMap2 = hashMap3;
                                                            str9 = str24;
                                                            str7 = str13;
                                                        } else {
                                                            if (zza2.equals("center")) {
                                                                c3 = 0;
                                                                if (c3 != 0) {
                                                                }
                                                                float f822 = 1.0f / i5;
                                                                zzc5 = zzfv.zzc(newPullParser, "writingMode");
                                                                if (zzc5 != null) {
                                                                }
                                                                i8 = Integer.MIN_VALUE;
                                                                zzapaVar = new zzapa(zzc11, f2, f5, 0, i7, f3, f4, 1, f822, i8);
                                                                if (zzapaVar == null) {
                                                                }
                                                                str10 = str23;
                                                                hashMap2 = hashMap3;
                                                                str9 = str24;
                                                                str7 = str13;
                                                            }
                                                            c3 = 65535;
                                                            if (c3 != 0) {
                                                            }
                                                            float f8222 = 1.0f / i5;
                                                            zzc5 = zzfv.zzc(newPullParser, "writingMode");
                                                            if (zzc5 != null) {
                                                            }
                                                            i8 = Integer.MIN_VALUE;
                                                            zzapaVar = new zzapa(zzc11, f2, f5, 0, i7, f3, f4, 1, f8222, i8);
                                                            if (zzapaVar == null) {
                                                            }
                                                            str10 = str23;
                                                            hashMap2 = hashMap3;
                                                            str9 = str24;
                                                            str7 = str13;
                                                        }
                                                    }
                                                    f5 = f;
                                                    i7 = 0;
                                                    i5 = i6;
                                                    float f82222 = 1.0f / i5;
                                                    zzc5 = zzfv.zzc(newPullParser, "writingMode");
                                                    if (zzc5 != null) {
                                                    }
                                                    i8 = Integer.MIN_VALUE;
                                                    zzapaVar = new zzapa(zzc11, f2, f5, 0, i7, f3, f4, 1, f82222, i8);
                                                    if (zzapaVar == null) {
                                                    }
                                                    str10 = str23;
                                                    hashMap2 = hashMap3;
                                                    str9 = str24;
                                                    str7 = str13;
                                                }
                                            } else {
                                                str11 = zzc12;
                                            }
                                            str12 = str11;
                                            if (str12 == null) {
                                            }
                                            zzc3 = zzfv.zzc(newPullParser, "extent");
                                            if (zzc3 == null) {
                                                zzc3 = zzapcVar2.zzN();
                                            }
                                            if (zzc3 == null) {
                                            }
                                            zzc4 = zzfv.zzc(newPullParser, "displayAlign");
                                            if (zzc4 == null) {
                                                zzc4 = zzapcVar.zzP();
                                            }
                                            if (zzc4 != null) {
                                            }
                                            f5 = f;
                                            i7 = 0;
                                            i5 = i6;
                                            float f822222 = 1.0f / i5;
                                            zzc5 = zzfv.zzc(newPullParser, "writingMode");
                                            if (zzc5 != null) {
                                            }
                                            i8 = Integer.MIN_VALUE;
                                            zzapaVar = new zzapa(zzc11, f2, f5, 0, i7, f3, f4, 1, f822222, i8);
                                            if (zzapaVar == null) {
                                            }
                                            str10 = str23;
                                            hashMap2 = hashMap3;
                                            str9 = str24;
                                            str7 = str13;
                                        }
                                        zzapaVar = null;
                                        if (zzapaVar == null) {
                                        }
                                        str10 = str23;
                                        hashMap2 = hashMap3;
                                        str9 = str24;
                                        str7 = str13;
                                    } else {
                                        i5 = i4;
                                        String str25 = str1922;
                                        hashMap = hashMap6;
                                        str7 = str2022;
                                        str8 = str2122;
                                        if (zzfv.zzb(newPullParser, str7)) {
                                            while (true) {
                                                newPullParser.next();
                                                str9 = str25;
                                                if (!zzfv.zzb(newPullParser, str9) || (zzc2 = zzfv.zzc(newPullParser, "id")) == null) {
                                                    hashMap2 = hashMap3;
                                                } else {
                                                    hashMap2 = hashMap3;
                                                    hashMap2.put(zzc2, newPullParser.nextText());
                                                }
                                                if (!zzfv.zza(newPullParser, str7)) {
                                                    str25 = str9;
                                                    hashMap3 = hashMap2;
                                                }
                                            }
                                        } else {
                                            hashMap2 = hashMap3;
                                            str9 = str25;
                                        }
                                        str10 = str23;
                                    }
                                }
                                if (zzfv.zza(newPullParser, str10)) {
                                    zzaoxVar2 = zzaoxVar4;
                                    arrayDeque = arrayDeque2;
                                } else {
                                    str2022 = str7;
                                    hashMap6 = hashMap;
                                    str1922 = str9;
                                    hashMap3 = hashMap2;
                                    str2122 = str8;
                                    str17 = str3;
                                    i4 = i5;
                                    str2222 = str10;
                                }
                            }
                        } else {
                            i5 = i4;
                            str3 = str17;
                            hashMap = hashMap6;
                            Object obj2 = "region";
                            hashMap2 = hashMap3;
                            try {
                                int attributeCount = newPullParser.getAttributeCount();
                                zzd2 = zzd(newPullParser, null);
                                int i16 = 0;
                                str5 = str;
                                j = -9223372036854775807L;
                                j2 = -9223372036854775807L;
                                strArr = null;
                                str6 = null;
                                j3 = -9223372036854775807L;
                                while (i16 < attributeCount) {
                                    try {
                                        String attributeName = newPullParser.getAttributeName(i16);
                                        String attributeValue6 = newPullParser.getAttributeValue(i16);
                                        switch (attributeName.hashCode()) {
                                            case -934795532:
                                                obj = obj2;
                                                if (attributeName.equals(obj)) {
                                                    c = 4;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 99841:
                                                if (attributeName.equals("dur")) {
                                                    obj = obj2;
                                                    c = 2;
                                                    break;
                                                }
                                                obj = obj2;
                                                c = 65535;
                                                break;
                                            case 100571:
                                                if (attributeName.equals("end")) {
                                                    obj = obj2;
                                                    c = 1;
                                                    break;
                                                }
                                                obj = obj2;
                                                c = 65535;
                                                break;
                                            case 93616297:
                                                if (attributeName.equals("begin")) {
                                                    c = 0;
                                                    obj = obj2;
                                                    break;
                                                }
                                                obj = obj2;
                                                c = 65535;
                                                break;
                                            case 109780401:
                                                if (attributeName.equals("style")) {
                                                    obj = obj2;
                                                    c = 3;
                                                    break;
                                                }
                                                obj = obj2;
                                                c = 65535;
                                                break;
                                            case 1292595405:
                                                if (attributeName.equals("backgroundImage")) {
                                                    obj = obj2;
                                                    c = 5;
                                                    break;
                                                }
                                                obj = obj2;
                                                c = 65535;
                                                break;
                                            default:
                                                obj = obj2;
                                                c = 65535;
                                                break;
                                        }
                                        if (c == 0) {
                                            zzaoxVar2 = zzaoxVar4;
                                            j2 = zzg(attributeValue6, zzaoxVar2);
                                        } else if (c == 1) {
                                            zzaoxVar2 = zzaoxVar4;
                                            j = zzg(attributeValue6, zzaoxVar2);
                                        } else if (c != 2) {
                                            if (c == 3) {
                                                String[] zzc14 = zzc(attributeValue6);
                                                if (zzc14.length > 0) {
                                                    strArr = zzc14;
                                                }
                                            } else if (c != 4) {
                                                if (c == 5) {
                                                    try {
                                                        if (attributeValue6.startsWith("#")) {
                                                            str6 = attributeValue6.substring(1);
                                                        }
                                                    } catch (zzanv e) {
                                                        zzanvVar = e;
                                                        str4 = "TtmlParser";
                                                        zzaoxVar2 = zzaoxVar4;
                                                        arrayDeque = arrayDeque2;
                                                        zzeh.zzd(str4, "Suppressing parser error", zzanvVar);
                                                        i11 = i5;
                                                        zzaoyVar2 = zzaoyVar;
                                                        zzaoxVar4 = zzaoxVar2;
                                                        i3 = 1;
                                                        i12 = 1;
                                                        newPullParser.next();
                                                        eventType = newPullParser.getEventType();
                                                        i10 = i3;
                                                        arrayDeque3 = arrayDeque;
                                                        hashMap6 = hashMap;
                                                        hashMap7 = hashMap2;
                                                        str15 = str;
                                                        zzaoxVar3 = zzaoxVar;
                                                        str16 = str2;
                                                        str17 = str3;
                                                    }
                                                }
                                            } else if (hashMap.containsKey(attributeValue6)) {
                                                str5 = attributeValue6;
                                            }
                                            zzaoxVar2 = zzaoxVar4;
                                        } else {
                                            zzaoxVar2 = zzaoxVar4;
                                            j3 = zzg(attributeValue6, zzaoxVar2);
                                        }
                                    } catch (zzanv e2) {
                                        e = e2;
                                        zzaoxVar2 = zzaoxVar4;
                                    }
                                    try {
                                        i16++;
                                        zzaoxVar4 = zzaoxVar2;
                                        obj2 = obj;
                                    } catch (zzanv e3) {
                                        e = e3;
                                        zzanvVar = e;
                                        str4 = "TtmlParser";
                                        arrayDeque = arrayDeque2;
                                        zzeh.zzd(str4, "Suppressing parser error", zzanvVar);
                                        i11 = i5;
                                        zzaoyVar2 = zzaoyVar;
                                        zzaoxVar4 = zzaoxVar2;
                                        i3 = 1;
                                        i12 = 1;
                                        newPullParser.next();
                                        eventType = newPullParser.getEventType();
                                        i10 = i3;
                                        arrayDeque3 = arrayDeque;
                                        hashMap6 = hashMap;
                                        hashMap7 = hashMap2;
                                        str15 = str;
                                        zzaoxVar3 = zzaoxVar;
                                        str16 = str2;
                                        str17 = str3;
                                    }
                                }
                                zzaoxVar2 = zzaoxVar4;
                            } catch (zzanv e4) {
                                e = e4;
                                str4 = "TtmlParser";
                                zzaoxVar2 = zzaoxVar4;
                            }
                            try {
                                if (zzaowVar != null) {
                                    zzaowVar2 = zzaowVar;
                                    long j7 = zzaowVar2.zzd;
                                    if (j7 != -9223372036854775807L) {
                                        j4 = j2 != -9223372036854775807L ? j2 + j7 : -9223372036854775807L;
                                        if (j != -9223372036854775807L) {
                                            j += j7;
                                            zzaowVar3 = zzaowVar2;
                                        } else {
                                            zzaowVar3 = zzaowVar2;
                                            j5 = -9223372036854775807L;
                                            j = -9223372036854775807L;
                                            if (j == j5) {
                                                str4 = "TtmlParser";
                                                j6 = j;
                                            } else if (j3 != j5) {
                                                str4 = "TtmlParser";
                                                j6 = j4 + j3;
                                            } else {
                                                if (zzaowVar3 != null) {
                                                    str4 = "TtmlParser";
                                                    try {
                                                        long j8 = zzaowVar3.zze;
                                                        if (j8 != j5) {
                                                            j6 = j8;
                                                        }
                                                    } catch (zzanv e5) {
                                                        zzanvVar = e5;
                                                        arrayDeque = arrayDeque2;
                                                        zzeh.zzd(str4, "Suppressing parser error", zzanvVar);
                                                        i11 = i5;
                                                        zzaoyVar2 = zzaoyVar;
                                                        zzaoxVar4 = zzaoxVar2;
                                                        i3 = 1;
                                                        i12 = 1;
                                                        newPullParser.next();
                                                        eventType = newPullParser.getEventType();
                                                        i10 = i3;
                                                        arrayDeque3 = arrayDeque;
                                                        hashMap6 = hashMap;
                                                        hashMap7 = hashMap2;
                                                        str15 = str;
                                                        zzaoxVar3 = zzaoxVar;
                                                        str16 = str2;
                                                        str17 = str3;
                                                    }
                                                } else {
                                                    str4 = "TtmlParser";
                                                }
                                                j6 = j5;
                                            }
                                            zzaow zzb2 = zzaow.zzb(newPullParser.getName(), j4, j6, zzd2, strArr, str5, str6, zzaowVar3);
                                            arrayDeque = arrayDeque2;
                                            arrayDeque.push(zzb2);
                                            if (zzaowVar2 != null) {
                                                zzaowVar2.zzd(zzb2);
                                            }
                                        }
                                    } else {
                                        zzaowVar3 = zzaowVar2;
                                        j4 = j2;
                                    }
                                } else {
                                    zzaowVar2 = zzaowVar;
                                    j4 = j2;
                                    zzaowVar3 = null;
                                }
                                arrayDeque.push(zzb2);
                                if (zzaowVar2 != null) {
                                }
                            } catch (zzanv e6) {
                                e = e6;
                                zzanvVar = e;
                                zzeh.zzd(str4, "Suppressing parser error", zzanvVar);
                                i11 = i5;
                                zzaoyVar2 = zzaoyVar;
                                zzaoxVar4 = zzaoxVar2;
                                i3 = 1;
                                i12 = 1;
                                newPullParser.next();
                                eventType = newPullParser.getEventType();
                                i10 = i3;
                                arrayDeque3 = arrayDeque;
                                hashMap6 = hashMap;
                                hashMap7 = hashMap2;
                                str15 = str;
                                zzaoxVar3 = zzaoxVar;
                                str16 = str2;
                                str17 = str3;
                            }
                            j5 = -9223372036854775807L;
                            if (j == j5) {
                            }
                            zzaow zzb22 = zzaow.zzb(newPullParser.getName(), j4, j6, zzd2, strArr, str5, str6, zzaowVar3);
                            arrayDeque = arrayDeque2;
                        }
                        i11 = i5;
                        zzaoyVar2 = zzaoyVar;
                        zzaoxVar4 = zzaoxVar2;
                    } else {
                        str = str15;
                        str2 = str16;
                        str3 = str17;
                        hashMap = hashMap6;
                        zzaoxVar = zzaoxVar3;
                        arrayDeque = arrayDeque3;
                        hashMap2 = hashMap7;
                        if (eventType == 4) {
                            if (zzaowVar4 == null) {
                                throw null;
                            }
                            zzaowVar4.zzd(zzaow.zza(newPullParser.getText()));
                        } else if (eventType == 3) {
                            if (newPullParser.getName().equals("tt")) {
                                zzaow zzaowVar5 = (zzaow) arrayDeque.peek();
                                if (zzaowVar5 == null) {
                                    throw null;
                                }
                                zzapdVar = new zzapd(zzaowVar5, hashMap5, hashMap, hashMap2);
                            }
                            arrayDeque.pop();
                        }
                    }
                    i3 = 1;
                } else {
                    str = str15;
                    str2 = str16;
                    str3 = str17;
                    hashMap = hashMap6;
                    zzaoxVar = zzaoxVar3;
                    arrayDeque = arrayDeque3;
                    hashMap2 = hashMap7;
                    if (eventType == 2) {
                        i3 = 1;
                        i12++;
                    } else {
                        i3 = 1;
                        if (eventType == 3) {
                            i12--;
                        }
                    }
                }
                newPullParser.next();
                eventType = newPullParser.getEventType();
                i10 = i3;
                arrayDeque3 = arrayDeque;
                hashMap6 = hashMap;
                hashMap7 = hashMap2;
                str15 = str;
                zzaoxVar3 = zzaoxVar;
                str16 = str2;
                str17 = str3;
            }
            if (zzapdVar != null) {
                return zzapdVar;
            }
            throw null;
        } catch (IOException e7) {
            throw new IllegalStateException("Unexpected error when reading input.", e7);
        } catch (XmlPullParserException e8) {
            throw new IllegalStateException("Unable to decode source", e8);
        }
    }

    public zzaoz() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.zzi = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }
}
