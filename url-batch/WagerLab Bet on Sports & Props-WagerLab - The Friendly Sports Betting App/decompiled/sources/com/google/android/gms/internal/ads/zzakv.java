package com.google.android.gms.internal.ads;

import android.text.Layout;
import androidx.media3.common.C;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.appevents.UserDataStore;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzakv implements zzajv {
    private final XmlPullParserFactory zzi;
    private static final Pattern zzc = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern zzd = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern zze = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final Pattern zza = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern zzb = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    private static final Pattern zzf = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    private static final Pattern zzg = Pattern.compile("^(\\d+) (\\d+)$");
    private static final zzakt zzh = new zzakt(30.0f, 1, 1);

    private static String[] zzc(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return new String[0];
        }
        String str2 = zzeo.zza;
        return trim.split("\\s+", -1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r10v38 */
    /* JADX WARN: Type inference failed for: r10v39 */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r10v41 */
    /* JADX WARN: Type inference failed for: r10v42 */
    /* JADX WARN: Type inference failed for: r10v43 */
    /* JADX WARN: Type inference failed for: r10v44 */
    /* JADX WARN: Type inference failed for: r10v45 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v73 */
    /* JADX WARN: Type inference failed for: r6v9 */
    private static zzaky zzd(XmlPullParser xmlPullParser, zzaky zzakyVar) {
        ?? r6;
        Matcher matcher;
        char c;
        int attributeCount = xmlPullParser.getAttributeCount();
        boolean z = false;
        zzaky zzakyVar2 = zzakyVar;
        int i = 0;
        while (i < attributeCount) {
            String attributeValue = xmlPullParser.getAttributeValue(i);
            String attributeName = xmlPullParser.getAttributeName(i);
            ?? r10 = -1;
            r10 = -1;
            r10 = -1;
            r10 = -1;
            r10 = -1;
            ?? r102 = -1;
            r10 = -1;
            r10 = -1;
            ?? r103 = -1;
            r10 = -1;
            r10 = -1;
            r10 = -1;
            r10 = -1;
            r10 = -1;
            r10 = -1;
            ?? r104 = -1;
            r10 = -1;
            r10 = -1;
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals("fontStyle")) {
                        r6 = 6;
                        break;
                    }
                    r6 = -1;
                    break;
                case -1289044182:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_EXTENT)) {
                        r6 = 16;
                        break;
                    }
                    r6 = -1;
                    break;
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        r6 = 3;
                        break;
                    }
                    r6 = -1;
                    break;
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
                        r6 = 7;
                        break;
                    }
                    r6 = -1;
                    break;
                case -1008619738:
                    if (attributeName.equals("origin")) {
                        r6 = 15;
                        break;
                    }
                    r6 = -1;
                    break;
                case -879295043:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_TEXT_DECORATION)) {
                        r6 = 12;
                        break;
                    }
                    r6 = -1;
                    break;
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
                        r6 = 5;
                        break;
                    }
                    r6 = -1;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        r6 = z;
                        break;
                    }
                    r6 = -1;
                    break;
                case 3511770:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_RUBY)) {
                        r6 = 10;
                        break;
                    }
                    r6 = -1;
                    break;
                case 94842723:
                    if (attributeName.equals("color")) {
                        r6 = 2;
                        break;
                    }
                    r6 = -1;
                    break;
                case 109403361:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_SHEAR)) {
                        r6 = 14;
                        break;
                    }
                    r6 = -1;
                    break;
                case 110138194:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_TEXT_COMBINE)) {
                        r6 = 9;
                        break;
                    }
                    r6 = -1;
                    break;
                case 365601008:
                    if (attributeName.equals("fontSize")) {
                        r6 = 4;
                        break;
                    }
                    r6 = -1;
                    break;
                case 921125321:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_TEXT_EMPHASIS)) {
                        r6 = 13;
                        break;
                    }
                    r6 = -1;
                    break;
                case 1115953443:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_RUBY_POSITION)) {
                        r6 = 11;
                        break;
                    }
                    r6 = -1;
                    break;
                case 1287124693:
                    if (attributeName.equals("backgroundColor")) {
                        r6 = 1;
                        break;
                    }
                    r6 = -1;
                    break;
                case 1754920356:
                    if (attributeName.equals(TtmlNode.ATTR_EBUTTS_MULTI_ROW_ALIGN)) {
                        r6 = 8;
                        break;
                    }
                    r6 = -1;
                    break;
                default:
                    r6 = -1;
                    break;
            }
            switch (r6) {
                case 0:
                    if (!"style".equals(xmlPullParser.getName())) {
                        break;
                    } else {
                        zzakyVar2 = zze(zzakyVar2);
                        zzakyVar2.zzs(attributeValue);
                        break;
                    }
                case 1:
                    zzakyVar2 = zze(zzakyVar2);
                    try {
                        zzakyVar2.zzn(zzdd.zza(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused) {
                        String.valueOf(attributeValue);
                        zzds.zzc("TtmlParser", "Failed parsing background value: ".concat(String.valueOf(attributeValue)));
                        break;
                    }
                case 2:
                    zzakyVar2 = zze(zzakyVar2);
                    try {
                        zzakyVar2.zzk(zzdd.zza(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused2) {
                        String.valueOf(attributeValue);
                        zzds.zzc("TtmlParser", "Failed parsing color value: ".concat(String.valueOf(attributeValue)));
                        break;
                    }
                case 3:
                    zzakyVar2 = zze(zzakyVar2);
                    zzakyVar2.zzi(attributeValue);
                    break;
                case 4:
                    try {
                        zzakyVar2 = zze(zzakyVar2);
                        String str = zzeo.zza;
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
                                throw new zzajr(sb.toString());
                            }
                            matcher = zze.matcher(split[1]);
                            zzds.zzc("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
                        }
                        if (!matcher.matches()) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(attributeValue).length() + 36);
                            sb2.append("Invalid expression for fontSize: '");
                            sb2.append(attributeValue);
                            sb2.append("'.");
                            throw new zzajr(sb2.toString());
                        }
                        String group = matcher.group(3);
                        if (group == null) {
                            throw null;
                        }
                        String str2 = group;
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
                            zzakyVar2.zzH(1);
                        } else if (c == 1) {
                            zzakyVar2.zzH(2);
                        } else {
                            if (c != 2) {
                                StringBuilder sb3 = new StringBuilder(group.length() + 30);
                                sb3.append("Invalid unit for fontSize: '");
                                sb3.append(group);
                                sb3.append("'.");
                                throw new zzajr(sb3.toString());
                            }
                            zzakyVar2.zzH(3);
                        }
                        String group2 = matcher.group(1);
                        if (group2 == null) {
                            throw null;
                        }
                        String str3 = group2;
                        zzakyVar2.zzG(Float.parseFloat(group2));
                        break;
                    } catch (zzajr unused3) {
                        String.valueOf(attributeValue);
                        zzds.zzc("TtmlParser", "Failed parsing fontSize value: ".concat(String.valueOf(attributeValue)));
                        break;
                    }
                    break;
                case 5:
                    zzakyVar2 = zze(zzakyVar2);
                    zzakyVar2.zzf(TtmlNode.BOLD.equalsIgnoreCase(attributeValue));
                    break;
                case 6:
                    zzakyVar2 = zze(zzakyVar2);
                    zzakyVar2.zzg(TtmlNode.ITALIC.equalsIgnoreCase(attributeValue));
                    break;
                case 7:
                    zzakyVar2 = zze(zzakyVar2);
                    zzakyVar2.zzz(zzf(attributeValue));
                    break;
                case 8:
                    zzakyVar2 = zze(zzakyVar2);
                    zzakyVar2.zzB(zzf(attributeValue));
                    break;
                case 9:
                    String zza2 = zzggj.zza(attributeValue);
                    int hashCode2 = zza2.hashCode();
                    if (hashCode2 != 96673) {
                        if (hashCode2 == 3387192 && zza2.equals("none")) {
                            r10 = z;
                        }
                    } else if (zza2.equals("all")) {
                        r10 = 1;
                    }
                    if (r10 == 0) {
                        zzakyVar2 = zze(zzakyVar2);
                        zzakyVar2.zzD(z);
                        break;
                    } else if (r10 == 1) {
                        zzakyVar2 = zze(zzakyVar2);
                        zzakyVar2.zzD(true);
                        break;
                    } else {
                        break;
                    }
                    break;
                case 10:
                    String zza3 = zzggj.zza(attributeValue);
                    switch (zza3.hashCode()) {
                        case -618561360:
                            if (zza3.equals(TtmlNode.RUBY_BASE_CONTAINER)) {
                                r104 = 2;
                                break;
                            }
                            break;
                        case -410956671:
                            if (zza3.equals(TtmlNode.RUBY_CONTAINER)) {
                                r104 = z;
                                break;
                            }
                            break;
                        case -250518009:
                            if (zza3.equals(TtmlNode.RUBY_DELIMITER)) {
                                r104 = 5;
                                break;
                            }
                            break;
                        case -136074796:
                            if (zza3.equals(TtmlNode.RUBY_TEXT_CONTAINER)) {
                                r104 = 4;
                                break;
                            }
                            break;
                        case 3016401:
                            if (zza3.equals("base")) {
                                r104 = 1;
                                break;
                            }
                            break;
                        case 3556653:
                            if (zza3.equals("text")) {
                                r104 = 3;
                                break;
                            }
                            break;
                    }
                    if (r104 == 0) {
                        zzakyVar2 = zze(zzakyVar2);
                        zzakyVar2.zzu(1);
                        break;
                    } else if (r104 != 1 && r104 != 2) {
                        if (r104 != 3 && r104 != 4) {
                            if (r104 == 5) {
                                zzakyVar2 = zze(zzakyVar2);
                                zzakyVar2.zzu(4);
                                break;
                            } else {
                                break;
                            }
                        } else {
                            zzakyVar2 = zze(zzakyVar2);
                            zzakyVar2.zzu(3);
                            break;
                        }
                    } else {
                        zzakyVar2 = zze(zzakyVar2);
                        zzakyVar2.zzu(2);
                        break;
                    }
                case 11:
                    String zza4 = zzggj.zza(attributeValue);
                    int hashCode3 = zza4.hashCode();
                    if (hashCode3 != -1392885889) {
                        if (hashCode3 == 92734940 && zza4.equals(TtmlNode.ANNOTATION_POSITION_AFTER)) {
                            r103 = 1;
                        }
                    } else if (zza4.equals(TtmlNode.ANNOTATION_POSITION_BEFORE)) {
                        r103 = z;
                    }
                    if (r103 == 0) {
                        zzakyVar2 = zze(zzakyVar2);
                        zzakyVar2.zzw(1);
                        break;
                    } else if (r103 == 1) {
                        zzakyVar2 = zze(zzakyVar2);
                        zzakyVar2.zzw(2);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    String zza5 = zzggj.zza(attributeValue);
                    switch (zza5.hashCode()) {
                        case -1461280213:
                            if (zza5.equals(TtmlNode.NO_UNDERLINE)) {
                                r102 = 3;
                                break;
                            }
                            break;
                        case -1026963764:
                            if (zza5.equals(TtmlNode.UNDERLINE)) {
                                r102 = 2;
                                break;
                            }
                            break;
                        case 913457136:
                            if (zza5.equals(TtmlNode.NO_LINETHROUGH)) {
                                r102 = 1;
                                break;
                            }
                            break;
                        case 1679736913:
                            if (zza5.equals(TtmlNode.LINETHROUGH)) {
                                r102 = z;
                                break;
                            }
                            break;
                    }
                    if (r102 == 0) {
                        zzakyVar2 = zze(zzakyVar2);
                        zzakyVar2.zzc(true);
                        break;
                    } else if (r102 == 1) {
                        zzakyVar2 = zze(zzakyVar2);
                        zzakyVar2.zzc(z);
                        break;
                    } else if (r102 == 2) {
                        zzakyVar2 = zze(zzakyVar2);
                        zzakyVar2.zze(true);
                        break;
                    } else if (r102 == 3) {
                        zzakyVar2 = zze(zzakyVar2);
                        zzakyVar2.zze(z);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    zzakyVar2 = zze(zzakyVar2);
                    zzakyVar2.zzF(zzakr.zza(attributeValue));
                    break;
                case 14:
                    zzaky zze2 = zze(zzakyVar2);
                    Matcher matcher2 = zza.matcher(attributeValue);
                    float f = Float.MAX_VALUE;
                    if (matcher2.matches()) {
                        try {
                            String group3 = matcher2.group(1);
                            if (group3 == null) {
                                throw null;
                                break;
                            } else {
                                String str4 = group3;
                                f = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(group3)));
                            }
                        } catch (NumberFormatException e) {
                            String.valueOf(attributeValue);
                            zzds.zzd("TtmlParser", "Failed to parse shear: ".concat(String.valueOf(attributeValue)), e);
                        }
                    } else {
                        String.valueOf(attributeValue);
                        zzds.zzc("TtmlParser", "Invalid value for shear: ".concat(String.valueOf(attributeValue)));
                    }
                    zze2.zzp(f);
                    zzakyVar2 = zze2;
                    break;
                case 15:
                    zzakyVar2 = zze(zzakyVar2);
                    zzakyVar2.zzK(attributeValue);
                    break;
                case 16:
                    zzakyVar2 = zze(zzakyVar2);
                    zzakyVar2.zzM(attributeValue);
                    break;
            }
            i++;
            z = false;
        }
        return zzakyVar2;
    }

    private static zzaky zze(zzaky zzakyVar) {
        return zzakyVar == null ? new zzaky() : zzakyVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static Layout.Alignment zzf(String str) {
        char c;
        String zza2 = zzggj.zza(str);
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

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d6, code lost:
    
        if (r13.equals(androidx.media3.exoplayer.upstream.CmcdData.STREAMING_FORMAT_SS) != false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static long zzg(String str, zzakt zzaktVar) throws zzajr {
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
            return (long) ((d4 + parseDouble + (matcher.group(5) != null ? Long.parseLong(r13) / zzaktVar.zza : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r13) / zzaktVar.zzb) / zzaktVar.zza : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = zzd.matcher(str);
        if (!matcher2.matches()) {
            String.valueOf(str);
            throw new zzajr("Malformed time expression: ".concat(String.valueOf(str)));
        }
        String group5 = matcher2.group(1);
        group5.getClass();
        double parseDouble2 = Double.parseDouble(group5);
        String group6 = matcher2.group(2);
        group6.getClass();
        int hashCode = group6.hashCode();
        if (hashCode == 102) {
            if (group6.equals("f")) {
                c = 4;
            }
            c = 65535;
        } else if (hashCode == 104) {
            if (group6.equals(CmcdData.STREAMING_FORMAT_HLS)) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode == 109) {
            if (group6.equals(CmcdData.OBJECT_TYPE_MANIFEST)) {
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
                            d2 = zzaktVar.zzc;
                        }
                        return (long) (parseDouble2 * 1000000.0d);
                    }
                    d2 = zzaktVar.zza;
                }
                parseDouble2 /= d2;
                return (long) (parseDouble2 * 1000000.0d);
            }
            d = 60.0d;
        }
        parseDouble2 *= d;
        return (long) (parseDouble2 * 1000000.0d);
    }

    @Override // com.google.android.gms.internal.ads.zzajv
    public final void zza(byte[] bArr, int i, int i2, zzaju zzajuVar, zzdf zzdfVar) {
        zzajp.zza(zzb(bArr, i, i2), zzajuVar, zzdfVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(8:401|(1:(6:404|405|406|33|(2:374|(1:376)(4:377|378|379|(2:381|(1:383)(2:384|385))(2:386|387)))|35)(1:409))(1:411)|410|405|406|33|(0)|35) */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0308 A[Catch: IOException -> 0x077b, XmlPullParserException -> 0x0784, TRY_LEAVE, TryCatch #16 {IOException -> 0x077b, XmlPullParserException -> 0x0784, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0081, B:16:0x0089, B:17:0x0090, B:19:0x0098, B:22:0x00ae, B:23:0x00c9, B:25:0x00d3, B:26:0x00d7, B:28:0x00e3, B:29:0x00e7, B:33:0x0160, B:36:0x01b9, B:39:0x01d3, B:41:0x01d9, B:43:0x01e1, B:45:0x01e9, B:47:0x01f1, B:49:0x01f9, B:51:0x0201, B:53:0x0207, B:55:0x020f, B:57:0x0217, B:59:0x021d, B:61:0x0223, B:63:0x0229, B:65:0x0231, B:68:0x023a, B:70:0x075a, B:71:0x026a, B:73:0x0270, B:75:0x0279, B:77:0x0288, B:79:0x0295, B:81:0x02a9, B:83:0x02af, B:85:0x056f, B:95:0x02b9, B:98:0x02c5, B:102:0x0523, B:104:0x02e3, B:106:0x02eb, B:108:0x02f3, B:110:0x02fb, B:113:0x0308, B:117:0x0321, B:119:0x0327, B:121:0x0337, B:123:0x03a6, B:125:0x03ae, B:127:0x03b4, B:129:0x03bc, B:131:0x03c2, B:135:0x03d5, B:137:0x03db, B:139:0x03eb, B:140:0x0475, B:142:0x047d, B:155:0x04c4, B:157:0x04cc, B:173:0x0516, B:190:0x03fa, B:193:0x03fb, B:194:0x03fc, B:196:0x040b, B:199:0x0413, B:202:0x0424, B:204:0x042a, B:206:0x0438, B:208:0x044f, B:210:0x0450, B:211:0x0451, B:212:0x0461, B:215:0x0341, B:217:0x0342, B:218:0x0343, B:219:0x034b, B:222:0x0355, B:225:0x035e, B:227:0x0364, B:229:0x0372, B:231:0x0387, B:233:0x0388, B:234:0x0389, B:235:0x0391, B:239:0x0531, B:241:0x0540, B:243:0x054b, B:245:0x0551, B:246:0x055d, B:256:0x058d, B:260:0x05b0, B:279:0x0664, B:289:0x0620, B:293:0x0629, B:284:0x06e3, B:300:0x0633, B:303:0x063d, B:308:0x0651, B:310:0x0656, B:312:0x065d, B:338:0x067e, B:342:0x068a, B:345:0x0693, B:351:0x06a8, B:354:0x06bf, B:357:0x06cb, B:359:0x06d0, B:363:0x06af, B:374:0x016f, B:376:0x017b, B:379:0x0184, B:381:0x018a, B:383:0x0198, B:385:0x01a7, B:387:0x01a8, B:388:0x01a9, B:389:0x0100, B:391:0x010c, B:394:0x0116, B:396:0x011c, B:399:0x0127, B:401:0x012d, B:406:0x0144, B:408:0x0158, B:414:0x014e, B:420:0x0153, B:430:0x0703, B:433:0x0713, B:436:0x0717, B:438:0x0721, B:440:0x072b, B:441:0x0736, B:444:0x0733, B:448:0x074b, B:451:0x0753, B:455:0x0774, B:458:0x077a), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03ae A[Catch: IOException -> 0x077b, XmlPullParserException -> 0x0784, TryCatch #16 {IOException -> 0x077b, XmlPullParserException -> 0x0784, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0081, B:16:0x0089, B:17:0x0090, B:19:0x0098, B:22:0x00ae, B:23:0x00c9, B:25:0x00d3, B:26:0x00d7, B:28:0x00e3, B:29:0x00e7, B:33:0x0160, B:36:0x01b9, B:39:0x01d3, B:41:0x01d9, B:43:0x01e1, B:45:0x01e9, B:47:0x01f1, B:49:0x01f9, B:51:0x0201, B:53:0x0207, B:55:0x020f, B:57:0x0217, B:59:0x021d, B:61:0x0223, B:63:0x0229, B:65:0x0231, B:68:0x023a, B:70:0x075a, B:71:0x026a, B:73:0x0270, B:75:0x0279, B:77:0x0288, B:79:0x0295, B:81:0x02a9, B:83:0x02af, B:85:0x056f, B:95:0x02b9, B:98:0x02c5, B:102:0x0523, B:104:0x02e3, B:106:0x02eb, B:108:0x02f3, B:110:0x02fb, B:113:0x0308, B:117:0x0321, B:119:0x0327, B:121:0x0337, B:123:0x03a6, B:125:0x03ae, B:127:0x03b4, B:129:0x03bc, B:131:0x03c2, B:135:0x03d5, B:137:0x03db, B:139:0x03eb, B:140:0x0475, B:142:0x047d, B:155:0x04c4, B:157:0x04cc, B:173:0x0516, B:190:0x03fa, B:193:0x03fb, B:194:0x03fc, B:196:0x040b, B:199:0x0413, B:202:0x0424, B:204:0x042a, B:206:0x0438, B:208:0x044f, B:210:0x0450, B:211:0x0451, B:212:0x0461, B:215:0x0341, B:217:0x0342, B:218:0x0343, B:219:0x034b, B:222:0x0355, B:225:0x035e, B:227:0x0364, B:229:0x0372, B:231:0x0387, B:233:0x0388, B:234:0x0389, B:235:0x0391, B:239:0x0531, B:241:0x0540, B:243:0x054b, B:245:0x0551, B:246:0x055d, B:256:0x058d, B:260:0x05b0, B:279:0x0664, B:289:0x0620, B:293:0x0629, B:284:0x06e3, B:300:0x0633, B:303:0x063d, B:308:0x0651, B:310:0x0656, B:312:0x065d, B:338:0x067e, B:342:0x068a, B:345:0x0693, B:351:0x06a8, B:354:0x06bf, B:357:0x06cb, B:359:0x06d0, B:363:0x06af, B:374:0x016f, B:376:0x017b, B:379:0x0184, B:381:0x018a, B:383:0x0198, B:385:0x01a7, B:387:0x01a8, B:388:0x01a9, B:389:0x0100, B:391:0x010c, B:394:0x0116, B:396:0x011c, B:399:0x0127, B:401:0x012d, B:406:0x0144, B:408:0x0158, B:414:0x014e, B:420:0x0153, B:430:0x0703, B:433:0x0713, B:436:0x0717, B:438:0x0721, B:440:0x072b, B:441:0x0736, B:444:0x0733, B:448:0x074b, B:451:0x0753, B:455:0x0774, B:458:0x077a), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03c2 A[Catch: IOException -> 0x077b, XmlPullParserException -> 0x0784, TRY_LEAVE, TryCatch #16 {IOException -> 0x077b, XmlPullParserException -> 0x0784, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0081, B:16:0x0089, B:17:0x0090, B:19:0x0098, B:22:0x00ae, B:23:0x00c9, B:25:0x00d3, B:26:0x00d7, B:28:0x00e3, B:29:0x00e7, B:33:0x0160, B:36:0x01b9, B:39:0x01d3, B:41:0x01d9, B:43:0x01e1, B:45:0x01e9, B:47:0x01f1, B:49:0x01f9, B:51:0x0201, B:53:0x0207, B:55:0x020f, B:57:0x0217, B:59:0x021d, B:61:0x0223, B:63:0x0229, B:65:0x0231, B:68:0x023a, B:70:0x075a, B:71:0x026a, B:73:0x0270, B:75:0x0279, B:77:0x0288, B:79:0x0295, B:81:0x02a9, B:83:0x02af, B:85:0x056f, B:95:0x02b9, B:98:0x02c5, B:102:0x0523, B:104:0x02e3, B:106:0x02eb, B:108:0x02f3, B:110:0x02fb, B:113:0x0308, B:117:0x0321, B:119:0x0327, B:121:0x0337, B:123:0x03a6, B:125:0x03ae, B:127:0x03b4, B:129:0x03bc, B:131:0x03c2, B:135:0x03d5, B:137:0x03db, B:139:0x03eb, B:140:0x0475, B:142:0x047d, B:155:0x04c4, B:157:0x04cc, B:173:0x0516, B:190:0x03fa, B:193:0x03fb, B:194:0x03fc, B:196:0x040b, B:199:0x0413, B:202:0x0424, B:204:0x042a, B:206:0x0438, B:208:0x044f, B:210:0x0450, B:211:0x0451, B:212:0x0461, B:215:0x0341, B:217:0x0342, B:218:0x0343, B:219:0x034b, B:222:0x0355, B:225:0x035e, B:227:0x0364, B:229:0x0372, B:231:0x0387, B:233:0x0388, B:234:0x0389, B:235:0x0391, B:239:0x0531, B:241:0x0540, B:243:0x054b, B:245:0x0551, B:246:0x055d, B:256:0x058d, B:260:0x05b0, B:279:0x0664, B:289:0x0620, B:293:0x0629, B:284:0x06e3, B:300:0x0633, B:303:0x063d, B:308:0x0651, B:310:0x0656, B:312:0x065d, B:338:0x067e, B:342:0x068a, B:345:0x0693, B:351:0x06a8, B:354:0x06bf, B:357:0x06cb, B:359:0x06d0, B:363:0x06af, B:374:0x016f, B:376:0x017b, B:379:0x0184, B:381:0x018a, B:383:0x0198, B:385:0x01a7, B:387:0x01a8, B:388:0x01a9, B:389:0x0100, B:391:0x010c, B:394:0x0116, B:396:0x011c, B:399:0x0127, B:401:0x012d, B:406:0x0144, B:408:0x0158, B:414:0x014e, B:420:0x0153, B:430:0x0703, B:433:0x0713, B:436:0x0717, B:438:0x0721, B:440:0x072b, B:441:0x0736, B:444:0x0733, B:448:0x074b, B:451:0x0753, B:455:0x0774, B:458:0x077a), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x047d A[Catch: IOException -> 0x077b, XmlPullParserException -> 0x0784, TRY_LEAVE, TryCatch #16 {IOException -> 0x077b, XmlPullParserException -> 0x0784, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0081, B:16:0x0089, B:17:0x0090, B:19:0x0098, B:22:0x00ae, B:23:0x00c9, B:25:0x00d3, B:26:0x00d7, B:28:0x00e3, B:29:0x00e7, B:33:0x0160, B:36:0x01b9, B:39:0x01d3, B:41:0x01d9, B:43:0x01e1, B:45:0x01e9, B:47:0x01f1, B:49:0x01f9, B:51:0x0201, B:53:0x0207, B:55:0x020f, B:57:0x0217, B:59:0x021d, B:61:0x0223, B:63:0x0229, B:65:0x0231, B:68:0x023a, B:70:0x075a, B:71:0x026a, B:73:0x0270, B:75:0x0279, B:77:0x0288, B:79:0x0295, B:81:0x02a9, B:83:0x02af, B:85:0x056f, B:95:0x02b9, B:98:0x02c5, B:102:0x0523, B:104:0x02e3, B:106:0x02eb, B:108:0x02f3, B:110:0x02fb, B:113:0x0308, B:117:0x0321, B:119:0x0327, B:121:0x0337, B:123:0x03a6, B:125:0x03ae, B:127:0x03b4, B:129:0x03bc, B:131:0x03c2, B:135:0x03d5, B:137:0x03db, B:139:0x03eb, B:140:0x0475, B:142:0x047d, B:155:0x04c4, B:157:0x04cc, B:173:0x0516, B:190:0x03fa, B:193:0x03fb, B:194:0x03fc, B:196:0x040b, B:199:0x0413, B:202:0x0424, B:204:0x042a, B:206:0x0438, B:208:0x044f, B:210:0x0450, B:211:0x0451, B:212:0x0461, B:215:0x0341, B:217:0x0342, B:218:0x0343, B:219:0x034b, B:222:0x0355, B:225:0x035e, B:227:0x0364, B:229:0x0372, B:231:0x0387, B:233:0x0388, B:234:0x0389, B:235:0x0391, B:239:0x0531, B:241:0x0540, B:243:0x054b, B:245:0x0551, B:246:0x055d, B:256:0x058d, B:260:0x05b0, B:279:0x0664, B:289:0x0620, B:293:0x0629, B:284:0x06e3, B:300:0x0633, B:303:0x063d, B:308:0x0651, B:310:0x0656, B:312:0x065d, B:338:0x067e, B:342:0x068a, B:345:0x0693, B:351:0x06a8, B:354:0x06bf, B:357:0x06cb, B:359:0x06d0, B:363:0x06af, B:374:0x016f, B:376:0x017b, B:379:0x0184, B:381:0x018a, B:383:0x0198, B:385:0x01a7, B:387:0x01a8, B:388:0x01a9, B:389:0x0100, B:391:0x010c, B:394:0x0116, B:396:0x011c, B:399:0x0127, B:401:0x012d, B:406:0x0144, B:408:0x0158, B:414:0x014e, B:420:0x0153, B:430:0x0703, B:433:0x0713, B:436:0x0717, B:438:0x0721, B:440:0x072b, B:441:0x0736, B:444:0x0733, B:448:0x074b, B:451:0x0753, B:455:0x0774, B:458:0x077a), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04cc A[Catch: IOException -> 0x077b, XmlPullParserException -> 0x0784, TRY_LEAVE, TryCatch #16 {IOException -> 0x077b, XmlPullParserException -> 0x0784, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0081, B:16:0x0089, B:17:0x0090, B:19:0x0098, B:22:0x00ae, B:23:0x00c9, B:25:0x00d3, B:26:0x00d7, B:28:0x00e3, B:29:0x00e7, B:33:0x0160, B:36:0x01b9, B:39:0x01d3, B:41:0x01d9, B:43:0x01e1, B:45:0x01e9, B:47:0x01f1, B:49:0x01f9, B:51:0x0201, B:53:0x0207, B:55:0x020f, B:57:0x0217, B:59:0x021d, B:61:0x0223, B:63:0x0229, B:65:0x0231, B:68:0x023a, B:70:0x075a, B:71:0x026a, B:73:0x0270, B:75:0x0279, B:77:0x0288, B:79:0x0295, B:81:0x02a9, B:83:0x02af, B:85:0x056f, B:95:0x02b9, B:98:0x02c5, B:102:0x0523, B:104:0x02e3, B:106:0x02eb, B:108:0x02f3, B:110:0x02fb, B:113:0x0308, B:117:0x0321, B:119:0x0327, B:121:0x0337, B:123:0x03a6, B:125:0x03ae, B:127:0x03b4, B:129:0x03bc, B:131:0x03c2, B:135:0x03d5, B:137:0x03db, B:139:0x03eb, B:140:0x0475, B:142:0x047d, B:155:0x04c4, B:157:0x04cc, B:173:0x0516, B:190:0x03fa, B:193:0x03fb, B:194:0x03fc, B:196:0x040b, B:199:0x0413, B:202:0x0424, B:204:0x042a, B:206:0x0438, B:208:0x044f, B:210:0x0450, B:211:0x0451, B:212:0x0461, B:215:0x0341, B:217:0x0342, B:218:0x0343, B:219:0x034b, B:222:0x0355, B:225:0x035e, B:227:0x0364, B:229:0x0372, B:231:0x0387, B:233:0x0388, B:234:0x0389, B:235:0x0391, B:239:0x0531, B:241:0x0540, B:243:0x054b, B:245:0x0551, B:246:0x055d, B:256:0x058d, B:260:0x05b0, B:279:0x0664, B:289:0x0620, B:293:0x0629, B:284:0x06e3, B:300:0x0633, B:303:0x063d, B:308:0x0651, B:310:0x0656, B:312:0x065d, B:338:0x067e, B:342:0x068a, B:345:0x0693, B:351:0x06a8, B:354:0x06bf, B:357:0x06cb, B:359:0x06d0, B:363:0x06af, B:374:0x016f, B:376:0x017b, B:379:0x0184, B:381:0x018a, B:383:0x0198, B:385:0x01a7, B:387:0x01a8, B:388:0x01a9, B:389:0x0100, B:391:0x010c, B:394:0x0116, B:396:0x011c, B:399:0x0127, B:401:0x012d, B:406:0x0144, B:408:0x0158, B:414:0x014e, B:420:0x0153, B:430:0x0703, B:433:0x0713, B:436:0x0717, B:438:0x0721, B:440:0x072b, B:441:0x0736, B:444:0x0733, B:448:0x074b, B:451:0x0753, B:455:0x0774, B:458:0x077a), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x06d0 A[Catch: zzajr -> 0x06db, IOException -> 0x077b, XmlPullParserException -> 0x0784, TRY_LEAVE, TryCatch #2 {zzajr -> 0x06db, blocks: (B:357:0x06cb, B:359:0x06d0), top: B:356:0x06cb }] */
    /* JADX WARN: Removed duplicated region for block: B:374:0x016f A[Catch: IOException -> 0x077b, XmlPullParserException -> 0x0784, TryCatch #16 {IOException -> 0x077b, XmlPullParserException -> 0x0784, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0081, B:16:0x0089, B:17:0x0090, B:19:0x0098, B:22:0x00ae, B:23:0x00c9, B:25:0x00d3, B:26:0x00d7, B:28:0x00e3, B:29:0x00e7, B:33:0x0160, B:36:0x01b9, B:39:0x01d3, B:41:0x01d9, B:43:0x01e1, B:45:0x01e9, B:47:0x01f1, B:49:0x01f9, B:51:0x0201, B:53:0x0207, B:55:0x020f, B:57:0x0217, B:59:0x021d, B:61:0x0223, B:63:0x0229, B:65:0x0231, B:68:0x023a, B:70:0x075a, B:71:0x026a, B:73:0x0270, B:75:0x0279, B:77:0x0288, B:79:0x0295, B:81:0x02a9, B:83:0x02af, B:85:0x056f, B:95:0x02b9, B:98:0x02c5, B:102:0x0523, B:104:0x02e3, B:106:0x02eb, B:108:0x02f3, B:110:0x02fb, B:113:0x0308, B:117:0x0321, B:119:0x0327, B:121:0x0337, B:123:0x03a6, B:125:0x03ae, B:127:0x03b4, B:129:0x03bc, B:131:0x03c2, B:135:0x03d5, B:137:0x03db, B:139:0x03eb, B:140:0x0475, B:142:0x047d, B:155:0x04c4, B:157:0x04cc, B:173:0x0516, B:190:0x03fa, B:193:0x03fb, B:194:0x03fc, B:196:0x040b, B:199:0x0413, B:202:0x0424, B:204:0x042a, B:206:0x0438, B:208:0x044f, B:210:0x0450, B:211:0x0451, B:212:0x0461, B:215:0x0341, B:217:0x0342, B:218:0x0343, B:219:0x034b, B:222:0x0355, B:225:0x035e, B:227:0x0364, B:229:0x0372, B:231:0x0387, B:233:0x0388, B:234:0x0389, B:235:0x0391, B:239:0x0531, B:241:0x0540, B:243:0x054b, B:245:0x0551, B:246:0x055d, B:256:0x058d, B:260:0x05b0, B:279:0x0664, B:289:0x0620, B:293:0x0629, B:284:0x06e3, B:300:0x0633, B:303:0x063d, B:308:0x0651, B:310:0x0656, B:312:0x065d, B:338:0x067e, B:342:0x068a, B:345:0x0693, B:351:0x06a8, B:354:0x06bf, B:357:0x06cb, B:359:0x06d0, B:363:0x06af, B:374:0x016f, B:376:0x017b, B:379:0x0184, B:381:0x018a, B:383:0x0198, B:385:0x01a7, B:387:0x01a8, B:388:0x01a9, B:389:0x0100, B:391:0x010c, B:394:0x0116, B:396:0x011c, B:399:0x0127, B:401:0x012d, B:406:0x0144, B:408:0x0158, B:414:0x014e, B:420:0x0153, B:430:0x0703, B:433:0x0713, B:436:0x0717, B:438:0x0721, B:440:0x072b, B:441:0x0736, B:444:0x0733, B:448:0x074b, B:451:0x0753, B:455:0x0774, B:458:0x077a), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01d3 A[Catch: IOException -> 0x077b, XmlPullParserException -> 0x0784, TRY_ENTER, TryCatch #16 {IOException -> 0x077b, XmlPullParserException -> 0x0784, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0081, B:16:0x0089, B:17:0x0090, B:19:0x0098, B:22:0x00ae, B:23:0x00c9, B:25:0x00d3, B:26:0x00d7, B:28:0x00e3, B:29:0x00e7, B:33:0x0160, B:36:0x01b9, B:39:0x01d3, B:41:0x01d9, B:43:0x01e1, B:45:0x01e9, B:47:0x01f1, B:49:0x01f9, B:51:0x0201, B:53:0x0207, B:55:0x020f, B:57:0x0217, B:59:0x021d, B:61:0x0223, B:63:0x0229, B:65:0x0231, B:68:0x023a, B:70:0x075a, B:71:0x026a, B:73:0x0270, B:75:0x0279, B:77:0x0288, B:79:0x0295, B:81:0x02a9, B:83:0x02af, B:85:0x056f, B:95:0x02b9, B:98:0x02c5, B:102:0x0523, B:104:0x02e3, B:106:0x02eb, B:108:0x02f3, B:110:0x02fb, B:113:0x0308, B:117:0x0321, B:119:0x0327, B:121:0x0337, B:123:0x03a6, B:125:0x03ae, B:127:0x03b4, B:129:0x03bc, B:131:0x03c2, B:135:0x03d5, B:137:0x03db, B:139:0x03eb, B:140:0x0475, B:142:0x047d, B:155:0x04c4, B:157:0x04cc, B:173:0x0516, B:190:0x03fa, B:193:0x03fb, B:194:0x03fc, B:196:0x040b, B:199:0x0413, B:202:0x0424, B:204:0x042a, B:206:0x0438, B:208:0x044f, B:210:0x0450, B:211:0x0451, B:212:0x0461, B:215:0x0341, B:217:0x0342, B:218:0x0343, B:219:0x034b, B:222:0x0355, B:225:0x035e, B:227:0x0364, B:229:0x0372, B:231:0x0387, B:233:0x0388, B:234:0x0389, B:235:0x0391, B:239:0x0531, B:241:0x0540, B:243:0x054b, B:245:0x0551, B:246:0x055d, B:256:0x058d, B:260:0x05b0, B:279:0x0664, B:289:0x0620, B:293:0x0629, B:284:0x06e3, B:300:0x0633, B:303:0x063d, B:308:0x0651, B:310:0x0656, B:312:0x065d, B:338:0x067e, B:342:0x068a, B:345:0x0693, B:351:0x06a8, B:354:0x06bf, B:357:0x06cb, B:359:0x06d0, B:363:0x06af, B:374:0x016f, B:376:0x017b, B:379:0x0184, B:381:0x018a, B:383:0x0198, B:385:0x01a7, B:387:0x01a8, B:388:0x01a9, B:389:0x0100, B:391:0x010c, B:394:0x0116, B:396:0x011c, B:399:0x0127, B:401:0x012d, B:406:0x0144, B:408:0x0158, B:414:0x014e, B:420:0x0153, B:430:0x0703, B:433:0x0713, B:436:0x0717, B:438:0x0721, B:440:0x072b, B:441:0x0736, B:444:0x0733, B:448:0x074b, B:451:0x0753, B:455:0x0774, B:458:0x077a), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0270 A[Catch: IOException -> 0x077b, XmlPullParserException -> 0x0784, LOOP:1: B:73:0x0270->B:87:0x057b, LOOP_START, PHI: r1 r2 r3 r8 r10 r14 r15
      0x0270: PHI (r1v37 java.lang.String) = (r1v12 java.lang.String), (r1v80 java.lang.String) binds: [B:72:0x026e, B:87:0x057b] A[DONT_GENERATE, DONT_INLINE]
      0x0270: PHI (r2v30 com.google.android.gms.internal.ads.zzakt) = (r2v7 com.google.android.gms.internal.ads.zzakt), (r2v54 com.google.android.gms.internal.ads.zzakt) binds: [B:72:0x026e, B:87:0x057b] A[DONT_GENERATE, DONT_INLINE]
      0x0270: PHI (r3v20 java.lang.String) = (r3v1 java.lang.String), (r3v29 java.lang.String) binds: [B:72:0x026e, B:87:0x057b] A[DONT_GENERATE, DONT_INLINE]
      0x0270: PHI (r8v29 java.util.HashMap) = (r8v1 java.util.HashMap), (r8v51 java.util.HashMap) binds: [B:72:0x026e, B:87:0x057b] A[DONT_GENERATE, DONT_INLINE]
      0x0270: PHI (r10v14 java.lang.String) = (r10v11 java.lang.String), (r10v33 java.lang.String) binds: [B:72:0x026e, B:87:0x057b] A[DONT_GENERATE, DONT_INLINE]
      0x0270: PHI (r14v21 java.lang.String) = (r14v12 java.lang.String), (r14v28 java.lang.String) binds: [B:72:0x026e, B:87:0x057b] A[DONT_GENERATE, DONT_INLINE]
      0x0270: PHI (r15v10 java.lang.String) = (r15v8 java.lang.String), (r15v12 java.lang.String) binds: [B:72:0x026e, B:87:0x057b] A[DONT_GENERATE, DONT_INLINE], TryCatch #16 {IOException -> 0x077b, XmlPullParserException -> 0x0784, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0081, B:16:0x0089, B:17:0x0090, B:19:0x0098, B:22:0x00ae, B:23:0x00c9, B:25:0x00d3, B:26:0x00d7, B:28:0x00e3, B:29:0x00e7, B:33:0x0160, B:36:0x01b9, B:39:0x01d3, B:41:0x01d9, B:43:0x01e1, B:45:0x01e9, B:47:0x01f1, B:49:0x01f9, B:51:0x0201, B:53:0x0207, B:55:0x020f, B:57:0x0217, B:59:0x021d, B:61:0x0223, B:63:0x0229, B:65:0x0231, B:68:0x023a, B:70:0x075a, B:71:0x026a, B:73:0x0270, B:75:0x0279, B:77:0x0288, B:79:0x0295, B:81:0x02a9, B:83:0x02af, B:85:0x056f, B:95:0x02b9, B:98:0x02c5, B:102:0x0523, B:104:0x02e3, B:106:0x02eb, B:108:0x02f3, B:110:0x02fb, B:113:0x0308, B:117:0x0321, B:119:0x0327, B:121:0x0337, B:123:0x03a6, B:125:0x03ae, B:127:0x03b4, B:129:0x03bc, B:131:0x03c2, B:135:0x03d5, B:137:0x03db, B:139:0x03eb, B:140:0x0475, B:142:0x047d, B:155:0x04c4, B:157:0x04cc, B:173:0x0516, B:190:0x03fa, B:193:0x03fb, B:194:0x03fc, B:196:0x040b, B:199:0x0413, B:202:0x0424, B:204:0x042a, B:206:0x0438, B:208:0x044f, B:210:0x0450, B:211:0x0451, B:212:0x0461, B:215:0x0341, B:217:0x0342, B:218:0x0343, B:219:0x034b, B:222:0x0355, B:225:0x035e, B:227:0x0364, B:229:0x0372, B:231:0x0387, B:233:0x0388, B:234:0x0389, B:235:0x0391, B:239:0x0531, B:241:0x0540, B:243:0x054b, B:245:0x0551, B:246:0x055d, B:256:0x058d, B:260:0x05b0, B:279:0x0664, B:289:0x0620, B:293:0x0629, B:284:0x06e3, B:300:0x0633, B:303:0x063d, B:308:0x0651, B:310:0x0656, B:312:0x065d, B:338:0x067e, B:342:0x068a, B:345:0x0693, B:351:0x06a8, B:354:0x06bf, B:357:0x06cb, B:359:0x06d0, B:363:0x06af, B:374:0x016f, B:376:0x017b, B:379:0x0184, B:381:0x018a, B:383:0x0198, B:385:0x01a7, B:387:0x01a8, B:388:0x01a9, B:389:0x0100, B:391:0x010c, B:394:0x0116, B:396:0x011c, B:399:0x0127, B:401:0x012d, B:406:0x0144, B:408:0x0158, B:414:0x014e, B:420:0x0153, B:430:0x0703, B:433:0x0713, B:436:0x0717, B:438:0x0721, B:440:0x072b, B:441:0x0736, B:444:0x0733, B:448:0x074b, B:451:0x0753, B:455:0x0774, B:458:0x077a), top: B:2:0x0008 }] */
    /* JADX WARN: Type inference failed for: r48v1, types: [com.google.android.gms.internal.ads.zzaky, java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzajq zzb(byte[] bArr, int i, int i2) {
        String str;
        String str2;
        String str3;
        ArrayDeque arrayDeque;
        zzakt zzaktVar;
        zzakz zzakzVar;
        int i3;
        HashMap hashMap;
        zzakt zzaktVar2;
        zzaku zzakuVar;
        int i4;
        boolean equals;
        ArrayDeque arrayDeque2;
        zzakt zzaktVar3;
        int i5;
        zzaks zzaksVar;
        zzaks zzaksVar2;
        long j;
        long j2;
        long j3;
        Object obj;
        char c;
        zzakt zzaktVar4;
        String str4;
        String str5;
        String str6;
        String zzc2;
        String str7;
        String str8;
        String str9;
        HashMap hashMap2;
        String str10;
        float f;
        float f2;
        zzakw zzakwVar;
        float f3;
        String zzc3;
        float f4;
        float f5;
        String zzc4;
        int i6;
        float f6;
        String zzc5;
        int i7;
        char c2;
        char c3;
        String zzc6;
        zzaky zzakyVar;
        zzaky zzakyVar2;
        float f7;
        String group;
        String group2;
        boolean z;
        String zzc7;
        String str11 = "";
        String str12 = "http://www.w3.org/ns/ttml#parameter";
        String str13 = "Ignoring unsupported tag: ";
        try {
            XmlPullParser newPullParser = this.zzi.newPullParser();
            HashMap hashMap3 = new HashMap();
            HashMap hashMap4 = new HashMap();
            HashMap hashMap5 = new HashMap();
            hashMap4.put("", new zzakw("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            Object obj2 = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, i, i2), null);
            ArrayDeque arrayDeque3 = new ArrayDeque();
            int eventType = newPullParser.getEventType();
            zzakt zzaktVar5 = zzh;
            zzakz zzakzVar2 = null;
            zzaku zzakuVar2 = null;
            zzakt zzaktVar6 = zzaktVar5;
            int i8 = 0;
            int i9 = 15;
            while (eventType != 1) {
                zzaks zzaksVar3 = (zzaks) arrayDeque3.peek();
                ?? r48 = obj2;
                if (i8 == 0) {
                    String name = newPullParser.getName();
                    str = str11;
                    if (eventType == 2) {
                        if (TtmlNode.TAG_TT.equals(name)) {
                            String attributeValue = newPullParser.getAttributeValue(str12, "frameRate");
                            int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
                            String attributeValue2 = newPullParser.getAttributeValue(str12, "frameRateMultiplier");
                            if (attributeValue2 != null) {
                                zzakzVar = zzakzVar2;
                                String str14 = zzeo.zza;
                                i3 = i8;
                                zzghc.zzb(attributeValue2.split(" ", -1).length == 2, "frameRateMultiplier doesn't have 2 parts");
                                f7 = Integer.parseInt(r4[0]) / Integer.parseInt(r4[1]);
                            } else {
                                zzakzVar = zzakzVar2;
                                i3 = i8;
                                f7 = 1.0f;
                            }
                            int i10 = zzaktVar5.zzb;
                            String attributeValue3 = newPullParser.getAttributeValue(str12, "subFrameRate");
                            if (attributeValue3 != null) {
                                i10 = Integer.parseInt(attributeValue3);
                            }
                            int i11 = zzaktVar5.zzc;
                            zzaktVar = zzaktVar5;
                            String attributeValue4 = newPullParser.getAttributeValue(str12, "tickRate");
                            if (attributeValue4 != null) {
                                i11 = Integer.parseInt(attributeValue4);
                            }
                            zzakt zzaktVar7 = new zzakt(parseInt * f7, i10, i11);
                            String attributeValue5 = newPullParser.getAttributeValue(str12, "cellResolution");
                            if (attributeValue5 != null) {
                                Matcher matcher = zzg.matcher(attributeValue5);
                                if (matcher.matches()) {
                                    try {
                                        group = matcher.group(1);
                                    } catch (NumberFormatException unused) {
                                        str2 = str12;
                                    }
                                    if (group == null) {
                                        throw r48;
                                    }
                                    String str15 = group;
                                    int parseInt2 = Integer.parseInt(group);
                                    str2 = str12;
                                    try {
                                        group2 = matcher.group(2);
                                    } catch (NumberFormatException unused2) {
                                        zzaktVar6 = zzaktVar7;
                                        zzds.zzc("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                        i9 = 15;
                                        zzc7 = zzep.zzc(newPullParser, TtmlNode.ATTR_TTS_EXTENT);
                                        if (zzc7 != null) {
                                        }
                                        zzakuVar2 = r48;
                                        zzaktVar2 = zzaktVar6;
                                        zzakuVar = zzakuVar2;
                                        i4 = i9;
                                        equals = name.equals(TtmlNode.TAG_TT);
                                        String str16 = "image";
                                        String str17 = TtmlNode.TAG_METADATA;
                                        String str18 = TtmlNode.TAG_REGION;
                                        arrayDeque2 = arrayDeque3;
                                        String str19 = TtmlNode.TAG_HEAD;
                                        if (!equals) {
                                            String name2 = newPullParser.getName();
                                            StringBuilder sb = new StringBuilder(String.valueOf(name2).length() + 26);
                                            sb.append(str13);
                                            sb.append(name2);
                                            zzds.zzb("TtmlParser", sb.toString());
                                            zzaktVar6 = zzaktVar2;
                                            str3 = str13;
                                            zzakuVar2 = zzakuVar;
                                            hashMap = hashMap5;
                                            i9 = i4;
                                            zzakzVar2 = zzakzVar;
                                            arrayDeque = arrayDeque2;
                                            i8 = 1;
                                            newPullParser.next();
                                            eventType = newPullParser.getEventType();
                                            hashMap5 = hashMap;
                                            str11 = str;
                                            zzaktVar5 = zzaktVar;
                                            str12 = str2;
                                            obj2 = null;
                                            arrayDeque3 = arrayDeque;
                                            str13 = str3;
                                        }
                                        if (TtmlNode.TAG_HEAD.equals(name)) {
                                        }
                                        zzakuVar2 = zzakuVar;
                                        zzaktVar6 = zzaktVar3;
                                        i9 = i4;
                                        zzakzVar2 = zzakzVar;
                                        i8 = i3;
                                        newPullParser.next();
                                        eventType = newPullParser.getEventType();
                                        hashMap5 = hashMap;
                                        str11 = str;
                                        zzaktVar5 = zzaktVar;
                                        str12 = str2;
                                        obj2 = null;
                                        arrayDeque3 = arrayDeque;
                                        str13 = str3;
                                    }
                                    if (group2 == null) {
                                        throw r48;
                                    }
                                    String str20 = group2;
                                    int parseInt3 = Integer.parseInt(group2);
                                    if (parseInt2 == 0) {
                                        z = false;
                                    } else if (parseInt3 != 0) {
                                        zzaktVar6 = zzaktVar7;
                                        z = true;
                                        zzghc.zzg(z, "Invalid cell resolution %s %s", parseInt2, parseInt3);
                                        i9 = parseInt3;
                                        zzc7 = zzep.zzc(newPullParser, TtmlNode.ATTR_TTS_EXTENT);
                                        if (zzc7 != null) {
                                            Matcher matcher2 = zzf.matcher(zzc7);
                                            if (matcher2.matches()) {
                                                try {
                                                    String group3 = matcher2.group(1);
                                                    if (group3 == null) {
                                                        throw r48;
                                                    }
                                                    String str21 = group3;
                                                    int parseInt4 = Integer.parseInt(group3);
                                                    String group4 = matcher2.group(2);
                                                    if (group4 == null) {
                                                        throw r48;
                                                    }
                                                    String str22 = group4;
                                                    zzakuVar2 = new zzaku(parseInt4, Integer.parseInt(group4));
                                                } catch (NumberFormatException unused3) {
                                                    zzds.zzc("TtmlParser", "Ignoring malformed tts extent: ".concat(zzc7));
                                                }
                                            } else {
                                                zzds.zzc("TtmlParser", "Ignoring non-pixel tts extent: ".concat(zzc7));
                                            }
                                        }
                                        zzakuVar2 = r48;
                                    } else {
                                        parseInt3 = 0;
                                        z = false;
                                    }
                                    zzaktVar6 = zzaktVar7;
                                    zzghc.zzg(z, "Invalid cell resolution %s %s", parseInt2, parseInt3);
                                    i9 = parseInt3;
                                    zzc7 = zzep.zzc(newPullParser, TtmlNode.ATTR_TTS_EXTENT);
                                    if (zzc7 != null) {
                                    }
                                    zzakuVar2 = r48;
                                } else {
                                    zzds.zzc("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                }
                            }
                            str2 = str12;
                            zzaktVar6 = zzaktVar7;
                            i9 = 15;
                            zzc7 = zzep.zzc(newPullParser, TtmlNode.ATTR_TTS_EXTENT);
                            if (zzc7 != null) {
                            }
                            zzakuVar2 = r48;
                        } else {
                            str2 = str12;
                            zzaktVar = zzaktVar5;
                            zzakzVar = zzakzVar2;
                            i3 = i8;
                        }
                        zzaktVar2 = zzaktVar6;
                        zzakuVar = zzakuVar2;
                        i4 = i9;
                        equals = name.equals(TtmlNode.TAG_TT);
                        String str162 = "image";
                        String str172 = TtmlNode.TAG_METADATA;
                        String str182 = TtmlNode.TAG_REGION;
                        arrayDeque2 = arrayDeque3;
                        String str192 = TtmlNode.TAG_HEAD;
                        if (!equals && !name.equals(TtmlNode.TAG_HEAD) && !name.equals("body") && !name.equals(TtmlNode.TAG_DIV) && !name.equals("p") && !name.equals(TtmlNode.TAG_SPAN) && !name.equals("br") && !name.equals("style") && !name.equals(TtmlNode.TAG_STYLING) && !name.equals(TtmlNode.TAG_LAYOUT) && !name.equals(TtmlNode.TAG_REGION) && !name.equals(TtmlNode.TAG_METADATA) && !name.equals("image") && !name.equals("data") && !name.equals(TtmlNode.TAG_INFORMATION)) {
                            String name22 = newPullParser.getName();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(name22).length() + 26);
                            sb2.append(str13);
                            sb2.append(name22);
                            zzds.zzb("TtmlParser", sb2.toString());
                            zzaktVar6 = zzaktVar2;
                            str3 = str13;
                            zzakuVar2 = zzakuVar;
                            hashMap = hashMap5;
                            i9 = i4;
                            zzakzVar2 = zzakzVar;
                            arrayDeque = arrayDeque2;
                            i8 = 1;
                        }
                        if (TtmlNode.TAG_HEAD.equals(name)) {
                            while (true) {
                                newPullParser.next();
                                if (zzep.zzb(newPullParser, "style")) {
                                    String zzc8 = zzep.zzc(newPullParser, "style");
                                    zzaky zzd2 = zzd(newPullParser, new zzaky());
                                    if (zzc8 != null) {
                                        String[] zzc9 = zzc(zzc8);
                                        str3 = str13;
                                        int length = zzc9.length;
                                        zzaktVar4 = zzaktVar2;
                                        int i12 = 0;
                                        while (i12 < length) {
                                            int i13 = i12;
                                            zzd2.zzr((zzaky) hashMap3.get(zzc9[i13]));
                                            i12 = i13 + 1;
                                        }
                                    } else {
                                        zzaktVar4 = zzaktVar2;
                                        str3 = str13;
                                    }
                                    String zzt = zzd2.zzt();
                                    if (zzt != null) {
                                        hashMap3.put(zzt, zzd2);
                                    }
                                    str6 = str192;
                                    str4 = str172;
                                    str5 = str182;
                                    hashMap = hashMap5;
                                } else {
                                    zzaktVar4 = zzaktVar2;
                                    str3 = str13;
                                    if (zzep.zzb(newPullParser, str182)) {
                                        str5 = str182;
                                        String str23 = str192;
                                        String zzc10 = zzep.zzc(newPullParser, "id");
                                        if (zzc10 == null) {
                                            zzakwVar = r48;
                                            str9 = str162;
                                            hashMap2 = hashMap5;
                                            str10 = str172;
                                        } else {
                                            String zzc11 = zzep.zzc(newPullParser, "origin");
                                            if (zzc11 == null) {
                                                str7 = zzc11;
                                                String zzc12 = zzep.zzc(newPullParser, "style");
                                                if (zzc12 != null && (zzakyVar2 = (zzaky) hashMap3.get(zzc12)) != null) {
                                                    str8 = zzakyVar2.zzL();
                                                    if (str8 == null) {
                                                        hashMap2 = hashMap5;
                                                        Matcher matcher3 = zzb.matcher(str8);
                                                        str9 = str162;
                                                        Matcher matcher4 = zzf.matcher(str8);
                                                        if (matcher3.matches()) {
                                                            str10 = str172;
                                                            try {
                                                                String group5 = matcher3.group(1);
                                                                if (group5 == null) {
                                                                    throw r48;
                                                                }
                                                                String str24 = group5;
                                                                f2 = Float.parseFloat(group5) / 100.0f;
                                                                String group6 = matcher3.group(2);
                                                                if (group6 == null) {
                                                                    throw r48;
                                                                }
                                                                String str25 = group6;
                                                                f = Float.parseFloat(group6) / 100.0f;
                                                            } catch (NumberFormatException unused4) {
                                                                zzds.zzc("TtmlParser", "Ignoring region with malformed origin: ".concat(str8));
                                                            }
                                                        } else {
                                                            str10 = str172;
                                                            if (!matcher4.matches()) {
                                                                zzds.zzc("TtmlParser", "Ignoring region with unsupported origin: ".concat(str8));
                                                            } else if (zzakuVar == null) {
                                                                zzds.zzc("TtmlParser", "Ignoring region with missing tts:extent: ".concat(str8));
                                                            } else {
                                                                try {
                                                                    String group7 = matcher4.group(1);
                                                                    if (group7 == null) {
                                                                        throw r48;
                                                                    }
                                                                    String str26 = group7;
                                                                    int parseInt5 = Integer.parseInt(group7);
                                                                    String group8 = matcher4.group(2);
                                                                    if (group8 == null) {
                                                                        throw r48;
                                                                    }
                                                                    String str27 = group8;
                                                                    f = Integer.parseInt(group8) / zzakuVar.zzb;
                                                                    f3 = parseInt5 / zzakuVar.zza;
                                                                    zzc3 = zzep.zzc(newPullParser, TtmlNode.ATTR_TTS_EXTENT);
                                                                    if (zzc3 == null && (zzc6 = zzep.zzc(newPullParser, "style")) != null && (zzakyVar = (zzaky) hashMap3.get(zzc6)) != null) {
                                                                        zzc3 = zzakyVar.zzN();
                                                                    }
                                                                    if (zzc3 != null) {
                                                                        Matcher matcher5 = zzb.matcher(zzc3);
                                                                        Matcher matcher6 = zzf.matcher(zzc3);
                                                                        if (matcher5.matches()) {
                                                                            try {
                                                                                String group9 = matcher5.group(1);
                                                                                if (group9 == null) {
                                                                                    throw r48;
                                                                                }
                                                                                String str28 = group9;
                                                                                float parseFloat = Float.parseFloat(group9) / 100.0f;
                                                                                String group10 = matcher5.group(2);
                                                                                if (group10 == null) {
                                                                                    throw r48;
                                                                                }
                                                                                String str29 = group10;
                                                                                f4 = parseFloat;
                                                                                f5 = Float.parseFloat(group10) / 100.0f;
                                                                            } catch (NumberFormatException unused5) {
                                                                                String.valueOf(str8);
                                                                                zzds.zzc("TtmlParser", "Ignoring region with malformed extent: ".concat(String.valueOf(str8)));
                                                                            }
                                                                        } else if (!matcher6.matches()) {
                                                                            String.valueOf(str8);
                                                                            zzds.zzc("TtmlParser", "Ignoring region with unsupported extent: ".concat(String.valueOf(str8)));
                                                                        } else if (zzakuVar == null) {
                                                                            String.valueOf(str8);
                                                                            zzds.zzc("TtmlParser", "Ignoring region with missing tts:extent: ".concat(String.valueOf(str8)));
                                                                        } else {
                                                                            try {
                                                                                String group11 = matcher6.group(1);
                                                                                if (group11 == null) {
                                                                                    throw r48;
                                                                                }
                                                                                String str30 = group11;
                                                                                int parseInt6 = Integer.parseInt(group11);
                                                                                String group12 = matcher6.group(2);
                                                                                if (group12 == null) {
                                                                                    throw r48;
                                                                                }
                                                                                String str31 = group12;
                                                                                f5 = Integer.parseInt(group12) / zzakuVar.zzb;
                                                                                f4 = parseInt6 / zzakuVar.zza;
                                                                            } catch (NumberFormatException unused6) {
                                                                                String.valueOf(str8);
                                                                                zzds.zzc("TtmlParser", "Ignoring region with malformed extent: ".concat(String.valueOf(str8)));
                                                                            }
                                                                        }
                                                                    } else {
                                                                        f4 = 1.0f;
                                                                        f5 = 1.0f;
                                                                    }
                                                                    zzc4 = zzep.zzc(newPullParser, TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
                                                                    if (zzc4 != null) {
                                                                        String zza2 = zzggj.zza(zzc4);
                                                                        int hashCode = zza2.hashCode();
                                                                        if (hashCode != -1364013995) {
                                                                            if (hashCode == 92734940 && zza2.equals(TtmlNode.ANNOTATION_POSITION_AFTER)) {
                                                                                c3 = 1;
                                                                                if (c3 != 0) {
                                                                                    f6 = f + (f5 / 2.0f);
                                                                                    i6 = 1;
                                                                                } else if (c3 == 1) {
                                                                                    f6 = f + f5;
                                                                                    i6 = 2;
                                                                                }
                                                                                float f8 = 1.0f / i4;
                                                                                zzc5 = zzep.zzc(newPullParser, TtmlNode.ATTR_TTS_WRITING_MODE);
                                                                                if (zzc5 != null) {
                                                                                    String zza3 = zzggj.zza(zzc5);
                                                                                    int hashCode2 = zza3.hashCode();
                                                                                    if (hashCode2 == 3694) {
                                                                                        if (zza3.equals("tb")) {
                                                                                            c2 = 0;
                                                                                            if (c2 != 0) {
                                                                                            }
                                                                                            i7 = 2;
                                                                                            zzakwVar = new zzakw(zzc10, f3, f6, 0, i6, f4, f5, 1, f8, i7);
                                                                                        }
                                                                                        c2 = 65535;
                                                                                        if (c2 != 0) {
                                                                                        }
                                                                                        i7 = 2;
                                                                                        zzakwVar = new zzakw(zzc10, f3, f6, 0, i6, f4, f5, 1, f8, i7);
                                                                                    } else if (hashCode2 != 3553396) {
                                                                                        if (hashCode2 == 3553576 && zza3.equals(TtmlNode.VERTICAL_RL)) {
                                                                                            c2 = 2;
                                                                                            if (c2 != 0 || c2 == 1) {
                                                                                                i7 = 2;
                                                                                            } else if (c2 == 2) {
                                                                                                i7 = 1;
                                                                                            }
                                                                                            zzakwVar = new zzakw(zzc10, f3, f6, 0, i6, f4, f5, 1, f8, i7);
                                                                                        }
                                                                                        c2 = 65535;
                                                                                        if (c2 != 0) {
                                                                                        }
                                                                                        i7 = 2;
                                                                                        zzakwVar = new zzakw(zzc10, f3, f6, 0, i6, f4, f5, 1, f8, i7);
                                                                                    } else {
                                                                                        if (zza3.equals(TtmlNode.VERTICAL_LR)) {
                                                                                            c2 = 1;
                                                                                            if (c2 != 0) {
                                                                                            }
                                                                                            i7 = 2;
                                                                                            zzakwVar = new zzakw(zzc10, f3, f6, 0, i6, f4, f5, 1, f8, i7);
                                                                                        }
                                                                                        c2 = 65535;
                                                                                        if (c2 != 0) {
                                                                                        }
                                                                                        i7 = 2;
                                                                                        zzakwVar = new zzakw(zzc10, f3, f6, 0, i6, f4, f5, 1, f8, i7);
                                                                                    }
                                                                                }
                                                                                i7 = Integer.MIN_VALUE;
                                                                                zzakwVar = new zzakw(zzc10, f3, f6, 0, i6, f4, f5, 1, f8, i7);
                                                                            }
                                                                            c3 = 65535;
                                                                            if (c3 != 0) {
                                                                            }
                                                                            float f82 = 1.0f / i4;
                                                                            zzc5 = zzep.zzc(newPullParser, TtmlNode.ATTR_TTS_WRITING_MODE);
                                                                            if (zzc5 != null) {
                                                                            }
                                                                            i7 = Integer.MIN_VALUE;
                                                                            zzakwVar = new zzakw(zzc10, f3, f6, 0, i6, f4, f5, 1, f82, i7);
                                                                        } else {
                                                                            if (zza2.equals("center")) {
                                                                                c3 = 0;
                                                                                if (c3 != 0) {
                                                                                }
                                                                                float f822 = 1.0f / i4;
                                                                                zzc5 = zzep.zzc(newPullParser, TtmlNode.ATTR_TTS_WRITING_MODE);
                                                                                if (zzc5 != null) {
                                                                                }
                                                                                i7 = Integer.MIN_VALUE;
                                                                                zzakwVar = new zzakw(zzc10, f3, f6, 0, i6, f4, f5, 1, f822, i7);
                                                                            }
                                                                            c3 = 65535;
                                                                            if (c3 != 0) {
                                                                            }
                                                                            float f8222 = 1.0f / i4;
                                                                            zzc5 = zzep.zzc(newPullParser, TtmlNode.ATTR_TTS_WRITING_MODE);
                                                                            if (zzc5 != null) {
                                                                            }
                                                                            i7 = Integer.MIN_VALUE;
                                                                            zzakwVar = new zzakw(zzc10, f3, f6, 0, i6, f4, f5, 1, f8222, i7);
                                                                        }
                                                                    }
                                                                    i6 = 0;
                                                                    f6 = f;
                                                                    float f82222 = 1.0f / i4;
                                                                    zzc5 = zzep.zzc(newPullParser, TtmlNode.ATTR_TTS_WRITING_MODE);
                                                                    if (zzc5 != null) {
                                                                    }
                                                                    i7 = Integer.MIN_VALUE;
                                                                    zzakwVar = new zzakw(zzc10, f3, f6, 0, i6, f4, f5, 1, f82222, i7);
                                                                } catch (NumberFormatException unused7) {
                                                                    zzds.zzc("TtmlParser", "Ignoring region with malformed origin: ".concat(str8));
                                                                }
                                                            }
                                                        }
                                                        zzakwVar = r48;
                                                    } else {
                                                        str9 = str162;
                                                        hashMap2 = hashMap5;
                                                        str10 = str172;
                                                        f = 0.0f;
                                                        f2 = 0.0f;
                                                    }
                                                    f3 = f2;
                                                    zzc3 = zzep.zzc(newPullParser, TtmlNode.ATTR_TTS_EXTENT);
                                                    if (zzc3 == null) {
                                                        zzc3 = zzakyVar.zzN();
                                                    }
                                                    if (zzc3 != null) {
                                                    }
                                                    zzc4 = zzep.zzc(newPullParser, TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
                                                    if (zzc4 != null) {
                                                    }
                                                    i6 = 0;
                                                    f6 = f;
                                                    float f822222 = 1.0f / i4;
                                                    zzc5 = zzep.zzc(newPullParser, TtmlNode.ATTR_TTS_WRITING_MODE);
                                                    if (zzc5 != null) {
                                                    }
                                                    i7 = Integer.MIN_VALUE;
                                                    zzakwVar = new zzakw(zzc10, f3, f6, 0, i6, f4, f5, 1, f822222, i7);
                                                }
                                            } else {
                                                str7 = zzc11;
                                            }
                                            str8 = str7;
                                            if (str8 == null) {
                                            }
                                            f3 = f2;
                                            zzc3 = zzep.zzc(newPullParser, TtmlNode.ATTR_TTS_EXTENT);
                                            if (zzc3 == null) {
                                            }
                                            if (zzc3 != null) {
                                            }
                                            zzc4 = zzep.zzc(newPullParser, TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
                                            if (zzc4 != null) {
                                            }
                                            i6 = 0;
                                            f6 = f;
                                            float f8222222 = 1.0f / i4;
                                            zzc5 = zzep.zzc(newPullParser, TtmlNode.ATTR_TTS_WRITING_MODE);
                                            if (zzc5 != null) {
                                            }
                                            i7 = Integer.MIN_VALUE;
                                            zzakwVar = new zzakw(zzc10, f3, f6, 0, i6, f4, f5, 1, f8222222, i7);
                                        }
                                        if (zzakwVar != null) {
                                            hashMap4.put(zzakwVar.zza, zzakwVar);
                                        }
                                        str6 = str23;
                                        hashMap = hashMap2;
                                        str162 = str9;
                                        str4 = str10;
                                    } else {
                                        String str32 = str162;
                                        HashMap hashMap6 = hashMap5;
                                        String str33 = str192;
                                        str4 = str172;
                                        str5 = str182;
                                        if (zzep.zzb(newPullParser, str4)) {
                                            while (true) {
                                                newPullParser.next();
                                                str162 = str32;
                                                if (!zzep.zzb(newPullParser, str162) || (zzc2 = zzep.zzc(newPullParser, "id")) == null) {
                                                    hashMap = hashMap6;
                                                } else {
                                                    hashMap = hashMap6;
                                                    hashMap.put(zzc2, newPullParser.nextText());
                                                }
                                                if (!zzep.zza(newPullParser, str4)) {
                                                    str32 = str162;
                                                    hashMap6 = hashMap;
                                                }
                                            }
                                        } else {
                                            hashMap = hashMap6;
                                            str162 = str32;
                                        }
                                        str6 = str33;
                                    }
                                }
                                if (zzep.zza(newPullParser, str6)) {
                                    zzaktVar3 = zzaktVar4;
                                    arrayDeque = arrayDeque2;
                                } else {
                                    str172 = str4;
                                    hashMap5 = hashMap;
                                    str182 = str5;
                                    str13 = str3;
                                    str192 = str6;
                                    zzaktVar2 = zzaktVar4;
                                }
                            }
                        } else {
                            zzakt zzaktVar8 = zzaktVar2;
                            str3 = str13;
                            hashMap = hashMap5;
                            Object obj3 = TtmlNode.TAG_REGION;
                            try {
                                int attributeCount = newPullParser.getAttributeCount();
                                zzaky zzd3 = zzd(newPullParser, r48);
                                int i14 = 0;
                                String str34 = str;
                                long j4 = C.TIME_UNSET;
                                long j5 = C.TIME_UNSET;
                                long j6 = C.TIME_UNSET;
                                String[] strArr = null;
                                String str35 = null;
                                while (i14 < attributeCount) {
                                    try {
                                        String attributeName = newPullParser.getAttributeName(i14);
                                        String attributeValue6 = newPullParser.getAttributeValue(i14);
                                        switch (attributeName.hashCode()) {
                                            case -934795532:
                                                obj = obj3;
                                                if (attributeName.equals(obj)) {
                                                    c = 4;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 99841:
                                                if (attributeName.equals("dur")) {
                                                    obj = obj3;
                                                    c = 2;
                                                    break;
                                                }
                                                obj = obj3;
                                                c = 65535;
                                                break;
                                            case 100571:
                                                if (attributeName.equals("end")) {
                                                    obj = obj3;
                                                    c = 1;
                                                    break;
                                                }
                                                obj = obj3;
                                                c = 65535;
                                                break;
                                            case 93616297:
                                                if (attributeName.equals("begin")) {
                                                    c = 0;
                                                    obj = obj3;
                                                    break;
                                                }
                                                obj = obj3;
                                                c = 65535;
                                                break;
                                            case 109780401:
                                                if (attributeName.equals("style")) {
                                                    obj = obj3;
                                                    c = 3;
                                                    break;
                                                }
                                                obj = obj3;
                                                c = 65535;
                                                break;
                                            case 1292595405:
                                                if (attributeName.equals("backgroundImage")) {
                                                    obj = obj3;
                                                    c = 5;
                                                    break;
                                                }
                                                obj = obj3;
                                                c = 65535;
                                                break;
                                            default:
                                                obj = obj3;
                                                c = 65535;
                                                break;
                                        }
                                        if (c != 0) {
                                            i5 = 1;
                                            if (c == 1) {
                                                zzaktVar3 = zzaktVar8;
                                                j4 = zzg(attributeValue6, zzaktVar3);
                                            } else if (c != 2) {
                                                if (c == 3) {
                                                    i5 = 1;
                                                    String[] zzc13 = zzc(attributeValue6);
                                                    if (zzc13.length > 0) {
                                                        strArr = zzc13;
                                                    }
                                                } else if (c != 4) {
                                                    if (c == 5) {
                                                        try {
                                                            if (attributeValue6.startsWith("#")) {
                                                                i5 = 1;
                                                                try {
                                                                    str35 = attributeValue6.substring(1);
                                                                } catch (zzajr e) {
                                                                    e = e;
                                                                    zzaktVar3 = zzaktVar8;
                                                                    arrayDeque = arrayDeque2;
                                                                    zzds.zzd("TtmlParser", "Suppressing parser error", e);
                                                                    i8 = i5;
                                                                    zzakuVar2 = zzakuVar;
                                                                    zzaktVar6 = zzaktVar3;
                                                                    i9 = i4;
                                                                    zzakzVar2 = zzakzVar;
                                                                    newPullParser.next();
                                                                    eventType = newPullParser.getEventType();
                                                                    hashMap5 = hashMap;
                                                                    str11 = str;
                                                                    zzaktVar5 = zzaktVar;
                                                                    str12 = str2;
                                                                    obj2 = null;
                                                                    arrayDeque3 = arrayDeque;
                                                                    str13 = str3;
                                                                }
                                                            }
                                                        } catch (zzajr e2) {
                                                            e = e2;
                                                            i5 = 1;
                                                        }
                                                    }
                                                    i5 = 1;
                                                } else {
                                                    i5 = 1;
                                                    if (hashMap4.containsKey(attributeValue6)) {
                                                        str34 = attributeValue6;
                                                    }
                                                }
                                                zzaktVar3 = zzaktVar8;
                                            } else {
                                                zzaktVar3 = zzaktVar8;
                                                i5 = 1;
                                                try {
                                                    j6 = zzg(attributeValue6, zzaktVar3);
                                                } catch (zzajr e3) {
                                                    e = e3;
                                                    arrayDeque = arrayDeque2;
                                                    zzds.zzd("TtmlParser", "Suppressing parser error", e);
                                                    i8 = i5;
                                                    zzakuVar2 = zzakuVar;
                                                    zzaktVar6 = zzaktVar3;
                                                    i9 = i4;
                                                    zzakzVar2 = zzakzVar;
                                                    newPullParser.next();
                                                    eventType = newPullParser.getEventType();
                                                    hashMap5 = hashMap;
                                                    str11 = str;
                                                    zzaktVar5 = zzaktVar;
                                                    str12 = str2;
                                                    obj2 = null;
                                                    arrayDeque3 = arrayDeque;
                                                    str13 = str3;
                                                }
                                            }
                                        } else {
                                            zzaktVar3 = zzaktVar8;
                                            i5 = 1;
                                            j5 = zzg(attributeValue6, zzaktVar3);
                                        }
                                        i14++;
                                        obj3 = obj;
                                        zzaktVar8 = zzaktVar3;
                                    } catch (zzajr e4) {
                                        e = e4;
                                        zzaktVar3 = zzaktVar8;
                                        i5 = 1;
                                    }
                                }
                                zzaktVar3 = zzaktVar8;
                                i5 = 1;
                                if (zzaksVar3 != null) {
                                    zzaksVar = zzaksVar3;
                                    long j7 = zzaksVar.zzd;
                                    if (j7 != C.TIME_UNSET) {
                                        j5 = j5 != C.TIME_UNSET ? j5 + j7 : -9223372036854775807L;
                                        if (j4 != C.TIME_UNSET) {
                                            j4 += j7;
                                        } else {
                                            zzaksVar2 = zzaksVar;
                                            j4 = -9223372036854775807L;
                                        }
                                    }
                                    zzaksVar2 = zzaksVar;
                                } else {
                                    zzaksVar = zzaksVar3;
                                    zzaksVar2 = null;
                                }
                                try {
                                    if (j4 == C.TIME_UNSET) {
                                        if (j6 != C.TIME_UNSET) {
                                            j3 = j5 + j6;
                                        } else {
                                            if (zzaksVar2 != null) {
                                                j3 = zzaksVar2.zze;
                                                if (j3 != C.TIME_UNSET) {
                                                }
                                            }
                                            j2 = j5;
                                            j = -9223372036854775807L;
                                            zzaks zzb2 = zzaks.zzb(newPullParser.getName(), j2, j, zzd3, strArr, str34, str35, zzaksVar2);
                                            arrayDeque = arrayDeque2;
                                            arrayDeque.push(zzb2);
                                            if (zzaksVar != null) {
                                                zzaksVar.zzd(zzb2);
                                            }
                                        }
                                        j = j3;
                                    } else {
                                        j = j4;
                                    }
                                    arrayDeque.push(zzb2);
                                    if (zzaksVar != null) {
                                    }
                                } catch (zzajr e5) {
                                    e = e5;
                                    zzds.zzd("TtmlParser", "Suppressing parser error", e);
                                    i8 = i5;
                                    zzakuVar2 = zzakuVar;
                                    zzaktVar6 = zzaktVar3;
                                    i9 = i4;
                                    zzakzVar2 = zzakzVar;
                                    newPullParser.next();
                                    eventType = newPullParser.getEventType();
                                    hashMap5 = hashMap;
                                    str11 = str;
                                    zzaktVar5 = zzaktVar;
                                    str12 = str2;
                                    obj2 = null;
                                    arrayDeque3 = arrayDeque;
                                    str13 = str3;
                                }
                                j2 = j5;
                                zzaks zzb22 = zzaks.zzb(newPullParser.getName(), j2, j, zzd3, strArr, str34, str35, zzaksVar2);
                                arrayDeque = arrayDeque2;
                            } catch (zzajr e6) {
                                e = e6;
                                zzaktVar3 = zzaktVar8;
                                arrayDeque = arrayDeque2;
                                i5 = 1;
                            }
                        }
                        zzakuVar2 = zzakuVar;
                        zzaktVar6 = zzaktVar3;
                        i9 = i4;
                    } else {
                        str2 = str12;
                        str3 = str13;
                        arrayDeque = arrayDeque3;
                        zzaktVar = zzaktVar5;
                        zzakzVar = zzakzVar2;
                        i3 = i8;
                        hashMap = hashMap5;
                        if (eventType == 4) {
                            if (zzaksVar3 == null) {
                                throw null;
                            }
                            zzaks zzaksVar4 = zzaksVar3;
                            zzaksVar3.zzd(zzaks.zza(newPullParser.getText()));
                        } else if (eventType == 3) {
                            if (newPullParser.getName().equals(TtmlNode.TAG_TT)) {
                                zzaks zzaksVar5 = (zzaks) arrayDeque.peek();
                                if (zzaksVar5 == null) {
                                    throw null;
                                }
                                zzaks zzaksVar6 = zzaksVar5;
                                zzakzVar2 = new zzakz(zzaksVar5, hashMap3, hashMap4, hashMap);
                            } else {
                                zzakzVar2 = zzakzVar;
                            }
                            arrayDeque.pop();
                            i8 = i3;
                        }
                    }
                    zzakzVar2 = zzakzVar;
                    i8 = i3;
                } else {
                    str = str11;
                    str2 = str12;
                    str3 = str13;
                    arrayDeque = arrayDeque3;
                    zzaktVar = zzaktVar5;
                    zzakzVar = zzakzVar2;
                    i3 = i8;
                    hashMap = hashMap5;
                    if (eventType == 2) {
                        i8 = i3 + 1;
                    } else {
                        if (eventType == 3) {
                            i8 = i3 - 1;
                        }
                        zzakzVar2 = zzakzVar;
                        i8 = i3;
                    }
                    zzakzVar2 = zzakzVar;
                }
                newPullParser.next();
                eventType = newPullParser.getEventType();
                hashMap5 = hashMap;
                str11 = str;
                zzaktVar5 = zzaktVar;
                str12 = str2;
                obj2 = null;
                arrayDeque3 = arrayDeque;
                str13 = str3;
            }
            zzakz zzakzVar3 = zzakzVar2;
            if (zzakzVar3 != null) {
                return zzakzVar3;
            }
            throw null;
        } catch (IOException e7) {
            throw new IllegalStateException("Unexpected error when reading input.", e7);
        } catch (XmlPullParserException e8) {
            throw new IllegalStateException("Unable to decode source", e8);
        }
    }

    public zzakv() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.zzi = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }
}
