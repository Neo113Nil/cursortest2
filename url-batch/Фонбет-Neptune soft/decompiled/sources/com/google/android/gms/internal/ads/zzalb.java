package com.google.android.gms.internal.ads;

import android.text.Layout;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.firebase.messaging.Constants;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzalb implements zzaka {
    private final XmlPullParserFactory zzi;
    private static final Pattern zzc = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern zzd = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern zze = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final Pattern zza = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern zzb = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    private static final Pattern zzf = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    private static final Pattern zzg = Pattern.compile("^(\\d+) (\\d+)$");
    private static final zzakz zzh = new zzakz(30.0f, 1, 1);

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ca, code lost:
    
        if (r13.equals("s") != false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static long zzd(String str, zzakz zzakzVar) throws zzajw {
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
            return (long) ((d4 + parseDouble + (matcher.group(5) != null ? Long.parseLong(r13) / zzakzVar.zza : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r13) / zzakzVar.zzb) / zzakzVar.zza : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = zzd.matcher(str);
        if (!matcher2.matches()) {
            throw new zzajw("Malformed time expression: ".concat(String.valueOf(str)));
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
                            d2 = zzakzVar.zzc;
                        }
                        return (long) (parseDouble2 * 1000000.0d);
                    }
                    d2 = zzakzVar.zza;
                }
                parseDouble2 /= d2;
                return (long) (parseDouble2 * 1000000.0d);
            }
            d = 60.0d;
        }
        parseDouble2 *= d;
        return (long) (parseDouble2 * 1000000.0d);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static Layout.Alignment zze(String str) {
        char c;
        String zza2 = zzfuf.zza(str);
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

    private static zzale zzf(zzale zzaleVar) {
        return zzaleVar == null ? new zzale() : zzaleVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static zzale zzg(XmlPullParser xmlPullParser, zzale zzaleVar) {
        char c;
        Matcher matcher;
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeValue = xmlPullParser.getAttributeValue(i);
            String attributeName = xmlPullParser.getAttributeName(i);
            char c2 = 65535;
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals("fontStyle")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -879295043:
                    if (attributeName.equals("textDecoration")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 3355:
                    if (attributeName.equals(FacebookMediationAdapter.KEY_ID)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 94842723:
                    if (attributeName.equals(TypedValues.Custom.S_COLOR)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 365601008:
                    if (attributeName.equals("fontSize")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 1287124693:
                    if (attributeName.equals("backgroundColor")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        c = '\b';
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
                    if ("style".equals(xmlPullParser.getName())) {
                        zzaleVar = zzf(zzaleVar);
                        zzaleVar.zzs(attributeValue);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    zzaleVar = zzf(zzaleVar);
                    try {
                        zzaleVar.zzm(zzdl.zzb(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused) {
                        zzea.zzf("TtmlParser", "Failed parsing background value: ".concat(String.valueOf(attributeValue)));
                        break;
                    }
                case 2:
                    zzaleVar = zzf(zzaleVar);
                    try {
                        zzaleVar.zzo(zzdl.zzb(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused2) {
                        zzea.zzf("TtmlParser", "Failed parsing color value: ".concat(String.valueOf(attributeValue)));
                        break;
                    }
                case 3:
                    zzaleVar = zzf(zzaleVar);
                    zzaleVar.zzp(attributeValue);
                    break;
                case 4:
                    try {
                        zzaleVar = zzf(zzaleVar);
                        int i2 = zzet.zza;
                        String[] split = attributeValue.split("\\s+", -1);
                        int length = split.length;
                        if (length == 1) {
                            matcher = zze.matcher(attributeValue);
                        } else {
                            if (length != 2) {
                                throw new zzajw("Invalid number of entries for fontSize: " + length + ".");
                            }
                            matcher = zze.matcher(split[1]);
                            zzea.zzf("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
                        }
                        if (!matcher.matches()) {
                            throw new zzajw("Invalid expression for fontSize: '" + attributeValue + "'.");
                        }
                        String group = matcher.group(3);
                        group.getClass();
                        int hashCode = group.hashCode();
                        if (hashCode != 37) {
                            if (hashCode != 3240) {
                                if (hashCode == 3592 && group.equals("px")) {
                                    c2 = 0;
                                }
                            } else if (group.equals("em")) {
                                c2 = 1;
                            }
                        } else if (group.equals("%")) {
                            c2 = 2;
                        }
                        if (c2 == 0) {
                            zzaleVar.zzr(1);
                        } else if (c2 == 1) {
                            zzaleVar.zzr(2);
                        } else {
                            if (c2 != 2) {
                                throw new zzajw("Invalid unit for fontSize: '" + group + "'.");
                            }
                            zzaleVar.zzr(3);
                        }
                        String group2 = matcher.group(1);
                        group2.getClass();
                        zzaleVar.zzq(Float.parseFloat(group2));
                        break;
                    } catch (zzajw unused3) {
                        zzea.zzf("TtmlParser", "Failed parsing fontSize value: ".concat(String.valueOf(attributeValue)));
                        break;
                    }
                case 5:
                    zzaleVar = zzf(zzaleVar);
                    zzaleVar.zzn("bold".equalsIgnoreCase(attributeValue));
                    break;
                case 6:
                    zzaleVar = zzf(zzaleVar);
                    zzaleVar.zzt("italic".equalsIgnoreCase(attributeValue));
                    break;
                case 7:
                    zzaleVar = zzf(zzaleVar);
                    zzaleVar.zzz(zze(attributeValue));
                    break;
                case '\b':
                    zzaleVar = zzf(zzaleVar);
                    zzaleVar.zzv(zze(attributeValue));
                    break;
                case '\t':
                    String zza2 = zzfuf.zza(attributeValue);
                    int hashCode2 = zza2.hashCode();
                    if (hashCode2 != 96673) {
                        if (hashCode2 == 3387192 && zza2.equals("none")) {
                            c2 = 0;
                        }
                    } else if (zza2.equals("all")) {
                        c2 = 1;
                    }
                    if (c2 != 0) {
                        if (c2 != 1) {
                            break;
                        } else {
                            zzaleVar = zzf(zzaleVar);
                            zzaleVar.zzA(true);
                            break;
                        }
                    } else {
                        zzaleVar = zzf(zzaleVar);
                        zzaleVar.zzA(false);
                        break;
                    }
                case '\n':
                    String zza3 = zzfuf.zza(attributeValue);
                    switch (zza3.hashCode()) {
                        case -618561360:
                            if (zza3.equals("baseContainer")) {
                                c2 = 2;
                                break;
                            }
                            break;
                        case -410956671:
                            if (zza3.equals("container")) {
                                c2 = 0;
                                break;
                            }
                            break;
                        case -250518009:
                            if (zza3.equals("delimiter")) {
                                c2 = 5;
                                break;
                            }
                            break;
                        case -136074796:
                            if (zza3.equals("textContainer")) {
                                c2 = 4;
                                break;
                            }
                            break;
                        case 3016401:
                            if (zza3.equals("base")) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case 3556653:
                            if (zza3.equals("text")) {
                                c2 = 3;
                                break;
                            }
                            break;
                    }
                    if (c2 != 0) {
                        if (c2 != 1 && c2 != 2) {
                            if (c2 != 3 && c2 != 4) {
                                if (c2 != 5) {
                                    break;
                                } else {
                                    zzaleVar = zzf(zzaleVar);
                                    zzaleVar.zzx(4);
                                    break;
                                }
                            } else {
                                zzaleVar = zzf(zzaleVar);
                                zzaleVar.zzx(3);
                                break;
                            }
                        } else {
                            zzaleVar = zzf(zzaleVar);
                            zzaleVar.zzx(2);
                            break;
                        }
                    } else {
                        zzaleVar = zzf(zzaleVar);
                        zzaleVar.zzx(1);
                        break;
                    }
                case 11:
                    String zza4 = zzfuf.zza(attributeValue);
                    int hashCode3 = zza4.hashCode();
                    if (hashCode3 != -1392885889) {
                        if (hashCode3 == 92734940 && zza4.equals("after")) {
                            c2 = 1;
                        }
                    } else if (zza4.equals("before")) {
                        c2 = 0;
                    }
                    if (c2 != 0) {
                        if (c2 != 1) {
                            break;
                        } else {
                            zzaleVar = zzf(zzaleVar);
                            zzaleVar.zzw(2);
                            break;
                        }
                    } else {
                        zzaleVar = zzf(zzaleVar);
                        zzaleVar.zzw(1);
                        break;
                    }
                case '\f':
                    String zza5 = zzfuf.zza(attributeValue);
                    switch (zza5.hashCode()) {
                        case -1461280213:
                            if (zza5.equals("nounderline")) {
                                c2 = 3;
                                break;
                            }
                            break;
                        case -1026963764:
                            if (zza5.equals("underline")) {
                                c2 = 2;
                                break;
                            }
                            break;
                        case 913457136:
                            if (zza5.equals("nolinethrough")) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case 1679736913:
                            if (zza5.equals("linethrough")) {
                                c2 = 0;
                                break;
                            }
                            break;
                    }
                    if (c2 != 0) {
                        if (c2 != 1) {
                            if (c2 != 2) {
                                if (c2 != 3) {
                                    break;
                                } else {
                                    zzaleVar = zzf(zzaleVar);
                                    zzaleVar.zzC(false);
                                    break;
                                }
                            } else {
                                zzaleVar = zzf(zzaleVar);
                                zzaleVar.zzC(true);
                                break;
                            }
                        } else {
                            zzaleVar = zzf(zzaleVar);
                            zzaleVar.zzu(false);
                            break;
                        }
                    } else {
                        zzaleVar = zzf(zzaleVar);
                        zzaleVar.zzu(true);
                        break;
                    }
                case '\r':
                    zzaleVar = zzf(zzaleVar);
                    zzaleVar.zzB(zzakx.zza(attributeValue));
                    break;
                case 14:
                    zzaleVar = zzf(zzaleVar);
                    Matcher matcher2 = zza.matcher(attributeValue);
                    float f = Float.MAX_VALUE;
                    if (matcher2.matches()) {
                        try {
                            String group3 = matcher2.group(1);
                            group3.getClass();
                            f = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(group3)));
                        } catch (NumberFormatException e) {
                            zzea.zzg("TtmlParser", "Failed to parse shear: ".concat(String.valueOf(attributeValue)), e);
                        }
                    } else {
                        zzea.zzf("TtmlParser", "Invalid value for shear: ".concat(String.valueOf(attributeValue)));
                    }
                    zzaleVar.zzy(f);
                    break;
            }
        }
        return zzaleVar;
    }

    private static String[] zzh(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return new String[0];
        }
        int i = zzet.zza;
        return trim.split("\\s+", -1);
    }

    @Override // com.google.android.gms.internal.ads.zzaka
    public final void zza(byte[] bArr, int i, int i2, zzajz zzajzVar, zzdn zzdnVar) {
        zzaju.zza(zzc(bArr, i, i2), zzajzVar, zzdnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaka
    public final /* synthetic */ void zzb() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:114:0x04d8 A[Catch: IOException -> 0x06bc, XmlPullParserException -> 0x06c6, TryCatch #17 {IOException -> 0x06bc, XmlPullParserException -> 0x06c6, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:17:0x008e, B:20:0x0098, B:23:0x00aa, B:24:0x00c9, B:26:0x00d7, B:27:0x00de, B:29:0x00ea, B:30:0x00f5, B:34:0x0178, B:38:0x01cf, B:41:0x01dd, B:43:0x01e3, B:45:0x01eb, B:47:0x01f3, B:49:0x01fb, B:51:0x0203, B:53:0x020b, B:55:0x0211, B:57:0x0219, B:59:0x0221, B:61:0x0227, B:63:0x022d, B:65:0x0235, B:67:0x023d, B:70:0x0246, B:72:0x06a4, B:74:0x0269, B:76:0x026f, B:78:0x0278, B:80:0x0287, B:82:0x0291, B:84:0x02a5, B:86:0x02ab, B:88:0x04dd, B:95:0x02af, B:98:0x02b9, B:100:0x02bf, B:102:0x02ca, B:104:0x02d0, B:105:0x02d7, B:109:0x02e3, B:114:0x04d8, B:115:0x02f0, B:117:0x02f8, B:122:0x0311, B:124:0x0318, B:126:0x0326, B:128:0x0372, B:130:0x037a, B:134:0x0389, B:136:0x0390, B:138:0x039e, B:140:0x03ed, B:142:0x03f5, B:155:0x043b, B:157:0x0443, B:173:0x048c, B:190:0x03a9, B:191:0x03b4, B:194:0x03bc, B:197:0x03c8, B:199:0x03cf, B:201:0x03db, B:204:0x0498, B:205:0x04a3, B:206:0x04ae, B:208:0x032f, B:209:0x0339, B:212:0x0343, B:215:0x034e, B:217:0x0355, B:219:0x0361, B:222:0x04b5, B:223:0x04c0, B:224:0x04cb, B:227:0x04f5, B:231:0x0512, B:250:0x05b2, B:260:0x056e, B:264:0x0577, B:256:0x0633, B:271:0x057f, B:274:0x0589, B:279:0x059e, B:281:0x05a3, B:283:0x05ab, B:307:0x05c7, B:311:0x05d1, B:314:0x05da, B:320:0x05ee, B:322:0x0603, B:325:0x0611, B:327:0x0616, B:335:0x05f5, B:347:0x0182, B:349:0x018e, B:352:0x0199, B:354:0x01a0, B:356:0x01ac, B:358:0x01b6, B:359:0x010d, B:361:0x0119, B:364:0x0124, B:366:0x012b, B:368:0x0137, B:373:0x014d, B:376:0x0154, B:379:0x016e, B:396:0x0653, B:402:0x0662, B:404:0x066c, B:406:0x0679, B:407:0x0681, B:411:0x0695, B:415:0x069d), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0443 A[Catch: IOException -> 0x06bc, XmlPullParserException -> 0x06c6, TRY_LEAVE, TryCatch #17 {IOException -> 0x06bc, XmlPullParserException -> 0x06c6, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:17:0x008e, B:20:0x0098, B:23:0x00aa, B:24:0x00c9, B:26:0x00d7, B:27:0x00de, B:29:0x00ea, B:30:0x00f5, B:34:0x0178, B:38:0x01cf, B:41:0x01dd, B:43:0x01e3, B:45:0x01eb, B:47:0x01f3, B:49:0x01fb, B:51:0x0203, B:53:0x020b, B:55:0x0211, B:57:0x0219, B:59:0x0221, B:61:0x0227, B:63:0x022d, B:65:0x0235, B:67:0x023d, B:70:0x0246, B:72:0x06a4, B:74:0x0269, B:76:0x026f, B:78:0x0278, B:80:0x0287, B:82:0x0291, B:84:0x02a5, B:86:0x02ab, B:88:0x04dd, B:95:0x02af, B:98:0x02b9, B:100:0x02bf, B:102:0x02ca, B:104:0x02d0, B:105:0x02d7, B:109:0x02e3, B:114:0x04d8, B:115:0x02f0, B:117:0x02f8, B:122:0x0311, B:124:0x0318, B:126:0x0326, B:128:0x0372, B:130:0x037a, B:134:0x0389, B:136:0x0390, B:138:0x039e, B:140:0x03ed, B:142:0x03f5, B:155:0x043b, B:157:0x0443, B:173:0x048c, B:190:0x03a9, B:191:0x03b4, B:194:0x03bc, B:197:0x03c8, B:199:0x03cf, B:201:0x03db, B:204:0x0498, B:205:0x04a3, B:206:0x04ae, B:208:0x032f, B:209:0x0339, B:212:0x0343, B:215:0x034e, B:217:0x0355, B:219:0x0361, B:222:0x04b5, B:223:0x04c0, B:224:0x04cb, B:227:0x04f5, B:231:0x0512, B:250:0x05b2, B:260:0x056e, B:264:0x0577, B:256:0x0633, B:271:0x057f, B:274:0x0589, B:279:0x059e, B:281:0x05a3, B:283:0x05ab, B:307:0x05c7, B:311:0x05d1, B:314:0x05da, B:320:0x05ee, B:322:0x0603, B:325:0x0611, B:327:0x0616, B:335:0x05f5, B:347:0x0182, B:349:0x018e, B:352:0x0199, B:354:0x01a0, B:356:0x01ac, B:358:0x01b6, B:359:0x010d, B:361:0x0119, B:364:0x0124, B:366:0x012b, B:368:0x0137, B:373:0x014d, B:376:0x0154, B:379:0x016e, B:396:0x0653, B:402:0x0662, B:404:0x066c, B:406:0x0679, B:407:0x0681, B:411:0x0695, B:415:0x069d), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0182 A[Catch: IOException -> 0x06bc, XmlPullParserException -> 0x06c6, TryCatch #17 {IOException -> 0x06bc, XmlPullParserException -> 0x06c6, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:17:0x008e, B:20:0x0098, B:23:0x00aa, B:24:0x00c9, B:26:0x00d7, B:27:0x00de, B:29:0x00ea, B:30:0x00f5, B:34:0x0178, B:38:0x01cf, B:41:0x01dd, B:43:0x01e3, B:45:0x01eb, B:47:0x01f3, B:49:0x01fb, B:51:0x0203, B:53:0x020b, B:55:0x0211, B:57:0x0219, B:59:0x0221, B:61:0x0227, B:63:0x022d, B:65:0x0235, B:67:0x023d, B:70:0x0246, B:72:0x06a4, B:74:0x0269, B:76:0x026f, B:78:0x0278, B:80:0x0287, B:82:0x0291, B:84:0x02a5, B:86:0x02ab, B:88:0x04dd, B:95:0x02af, B:98:0x02b9, B:100:0x02bf, B:102:0x02ca, B:104:0x02d0, B:105:0x02d7, B:109:0x02e3, B:114:0x04d8, B:115:0x02f0, B:117:0x02f8, B:122:0x0311, B:124:0x0318, B:126:0x0326, B:128:0x0372, B:130:0x037a, B:134:0x0389, B:136:0x0390, B:138:0x039e, B:140:0x03ed, B:142:0x03f5, B:155:0x043b, B:157:0x0443, B:173:0x048c, B:190:0x03a9, B:191:0x03b4, B:194:0x03bc, B:197:0x03c8, B:199:0x03cf, B:201:0x03db, B:204:0x0498, B:205:0x04a3, B:206:0x04ae, B:208:0x032f, B:209:0x0339, B:212:0x0343, B:215:0x034e, B:217:0x0355, B:219:0x0361, B:222:0x04b5, B:223:0x04c0, B:224:0x04cb, B:227:0x04f5, B:231:0x0512, B:250:0x05b2, B:260:0x056e, B:264:0x0577, B:256:0x0633, B:271:0x057f, B:274:0x0589, B:279:0x059e, B:281:0x05a3, B:283:0x05ab, B:307:0x05c7, B:311:0x05d1, B:314:0x05da, B:320:0x05ee, B:322:0x0603, B:325:0x0611, B:327:0x0616, B:335:0x05f5, B:347:0x0182, B:349:0x018e, B:352:0x0199, B:354:0x01a0, B:356:0x01ac, B:358:0x01b6, B:359:0x010d, B:361:0x0119, B:364:0x0124, B:366:0x012b, B:368:0x0137, B:373:0x014d, B:376:0x0154, B:379:0x016e, B:396:0x0653, B:402:0x0662, B:404:0x066c, B:406:0x0679, B:407:0x0681, B:411:0x0695, B:415:0x069d), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01dd A[Catch: IOException -> 0x06bc, XmlPullParserException -> 0x06c6, TRY_ENTER, TryCatch #17 {IOException -> 0x06bc, XmlPullParserException -> 0x06c6, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:17:0x008e, B:20:0x0098, B:23:0x00aa, B:24:0x00c9, B:26:0x00d7, B:27:0x00de, B:29:0x00ea, B:30:0x00f5, B:34:0x0178, B:38:0x01cf, B:41:0x01dd, B:43:0x01e3, B:45:0x01eb, B:47:0x01f3, B:49:0x01fb, B:51:0x0203, B:53:0x020b, B:55:0x0211, B:57:0x0219, B:59:0x0221, B:61:0x0227, B:63:0x022d, B:65:0x0235, B:67:0x023d, B:70:0x0246, B:72:0x06a4, B:74:0x0269, B:76:0x026f, B:78:0x0278, B:80:0x0287, B:82:0x0291, B:84:0x02a5, B:86:0x02ab, B:88:0x04dd, B:95:0x02af, B:98:0x02b9, B:100:0x02bf, B:102:0x02ca, B:104:0x02d0, B:105:0x02d7, B:109:0x02e3, B:114:0x04d8, B:115:0x02f0, B:117:0x02f8, B:122:0x0311, B:124:0x0318, B:126:0x0326, B:128:0x0372, B:130:0x037a, B:134:0x0389, B:136:0x0390, B:138:0x039e, B:140:0x03ed, B:142:0x03f5, B:155:0x043b, B:157:0x0443, B:173:0x048c, B:190:0x03a9, B:191:0x03b4, B:194:0x03bc, B:197:0x03c8, B:199:0x03cf, B:201:0x03db, B:204:0x0498, B:205:0x04a3, B:206:0x04ae, B:208:0x032f, B:209:0x0339, B:212:0x0343, B:215:0x034e, B:217:0x0355, B:219:0x0361, B:222:0x04b5, B:223:0x04c0, B:224:0x04cb, B:227:0x04f5, B:231:0x0512, B:250:0x05b2, B:260:0x056e, B:264:0x0577, B:256:0x0633, B:271:0x057f, B:274:0x0589, B:279:0x059e, B:281:0x05a3, B:283:0x05ab, B:307:0x05c7, B:311:0x05d1, B:314:0x05da, B:320:0x05ee, B:322:0x0603, B:325:0x0611, B:327:0x0616, B:335:0x05f5, B:347:0x0182, B:349:0x018e, B:352:0x0199, B:354:0x01a0, B:356:0x01ac, B:358:0x01b6, B:359:0x010d, B:361:0x0119, B:364:0x0124, B:366:0x012b, B:368:0x0137, B:373:0x014d, B:376:0x0154, B:379:0x016e, B:396:0x0653, B:402:0x0662, B:404:0x066c, B:406:0x0679, B:407:0x0681, B:411:0x0695, B:415:0x069d), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x026f A[Catch: IOException -> 0x06bc, XmlPullParserException -> 0x06c6, LOOP:1: B:76:0x026f->B:90:0x04e9, LOOP_START, PHI: r2 r5 r11
      0x026f: PHI (r2v35 java.lang.String) = (r2v16 java.lang.String), (r2v73 java.lang.String) binds: [B:75:0x026d, B:90:0x04e9] A[DONT_GENERATE, DONT_INLINE]
      0x026f: PHI (r5v7 java.util.HashMap) = (r5v1 java.util.HashMap), (r5v24 java.util.HashMap) binds: [B:75:0x026d, B:90:0x04e9] A[DONT_GENERATE, DONT_INLINE]
      0x026f: PHI (r11v10 com.google.android.gms.internal.ads.zzakz) = (r11v5 com.google.android.gms.internal.ads.zzakz), (r11v27 com.google.android.gms.internal.ads.zzakz) binds: [B:75:0x026d, B:90:0x04e9] A[DONT_GENERATE, DONT_INLINE], TryCatch #17 {IOException -> 0x06bc, XmlPullParserException -> 0x06c6, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:17:0x008e, B:20:0x0098, B:23:0x00aa, B:24:0x00c9, B:26:0x00d7, B:27:0x00de, B:29:0x00ea, B:30:0x00f5, B:34:0x0178, B:38:0x01cf, B:41:0x01dd, B:43:0x01e3, B:45:0x01eb, B:47:0x01f3, B:49:0x01fb, B:51:0x0203, B:53:0x020b, B:55:0x0211, B:57:0x0219, B:59:0x0221, B:61:0x0227, B:63:0x022d, B:65:0x0235, B:67:0x023d, B:70:0x0246, B:72:0x06a4, B:74:0x0269, B:76:0x026f, B:78:0x0278, B:80:0x0287, B:82:0x0291, B:84:0x02a5, B:86:0x02ab, B:88:0x04dd, B:95:0x02af, B:98:0x02b9, B:100:0x02bf, B:102:0x02ca, B:104:0x02d0, B:105:0x02d7, B:109:0x02e3, B:114:0x04d8, B:115:0x02f0, B:117:0x02f8, B:122:0x0311, B:124:0x0318, B:126:0x0326, B:128:0x0372, B:130:0x037a, B:134:0x0389, B:136:0x0390, B:138:0x039e, B:140:0x03ed, B:142:0x03f5, B:155:0x043b, B:157:0x0443, B:173:0x048c, B:190:0x03a9, B:191:0x03b4, B:194:0x03bc, B:197:0x03c8, B:199:0x03cf, B:201:0x03db, B:204:0x0498, B:205:0x04a3, B:206:0x04ae, B:208:0x032f, B:209:0x0339, B:212:0x0343, B:215:0x034e, B:217:0x0355, B:219:0x0361, B:222:0x04b5, B:223:0x04c0, B:224:0x04cb, B:227:0x04f5, B:231:0x0512, B:250:0x05b2, B:260:0x056e, B:264:0x0577, B:256:0x0633, B:271:0x057f, B:274:0x0589, B:279:0x059e, B:281:0x05a3, B:283:0x05ab, B:307:0x05c7, B:311:0x05d1, B:314:0x05da, B:320:0x05ee, B:322:0x0603, B:325:0x0611, B:327:0x0616, B:335:0x05f5, B:347:0x0182, B:349:0x018e, B:352:0x0199, B:354:0x01a0, B:356:0x01ac, B:358:0x01b6, B:359:0x010d, B:361:0x0119, B:364:0x0124, B:366:0x012b, B:368:0x0137, B:373:0x014d, B:376:0x0154, B:379:0x016e, B:396:0x0653, B:402:0x0662, B:404:0x066c, B:406:0x0679, B:407:0x0681, B:411:0x0695, B:415:0x069d), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x04e9 A[LOOP:1: B:76:0x026f->B:90:0x04e9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x04e3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzajv zzc(byte[] bArr, int i, int i2) {
        String str;
        String str2;
        HashMap hashMap;
        ArrayDeque arrayDeque;
        zzalf zzalfVar;
        int i3;
        ArrayDeque arrayDeque2;
        zzalf zzalfVar2;
        int i4;
        zzala zzalaVar;
        int i5;
        HashMap hashMap2;
        zzakz zzakzVar;
        zzajw zzajwVar;
        zzaky zzakyVar;
        long j;
        char c;
        zzakz zzakzVar2;
        String str3;
        float f;
        float parseInt;
        float parseInt2;
        float f2;
        float f3;
        int i6;
        String zza2;
        int i7;
        zzalc zzalcVar;
        char c2;
        char c3;
        String zza3;
        float f4;
        int i8;
        zzakz zzakzVar3;
        int parseInt3;
        boolean z;
        String zza4;
        String str4 = "";
        String str5 = "http://www.w3.org/ns/ttml#parameter";
        try {
            XmlPullParser newPullParser = this.zzi.newPullParser();
            HashMap hashMap3 = new HashMap();
            HashMap hashMap4 = new HashMap();
            HashMap hashMap5 = new HashMap();
            hashMap4.put("", new zzalc("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            newPullParser.setInput(new ByteArrayInputStream(bArr, i, i2), null);
            ArrayDeque arrayDeque3 = new ArrayDeque();
            int eventType = newPullParser.getEventType();
            zzakz zzakzVar4 = zzh;
            zzalf zzalfVar3 = null;
            zzala zzalaVar2 = null;
            int i9 = 0;
            int i10 = 15;
            while (eventType != 1) {
                zzaky zzakyVar2 = (zzaky) arrayDeque3.peek();
                if (i9 == 0) {
                    String name = newPullParser.getName();
                    str = str4;
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            String attributeValue = newPullParser.getAttributeValue(str5, "frameRate");
                            int parseInt4 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
                            String attributeValue2 = newPullParser.getAttributeValue(str5, "frameRateMultiplier");
                            if (attributeValue2 != null) {
                                int i11 = zzet.zza;
                                zzalfVar2 = zzalfVar3;
                                i4 = i9;
                                zzdi.zze(attributeValue2.split(" ", -1).length == 2, "frameRateMultiplier doesn't have 2 parts");
                                f4 = Integer.parseInt(r11[0]) / Integer.parseInt(r11[1]);
                            } else {
                                zzalfVar2 = zzalfVar3;
                                i4 = i9;
                                f4 = 1.0f;
                            }
                            zzakz zzakzVar5 = zzh;
                            int i12 = zzakzVar5.zzb;
                            String attributeValue3 = newPullParser.getAttributeValue(str5, "subFrameRate");
                            int parseInt5 = attributeValue3 != null ? Integer.parseInt(attributeValue3) : i12;
                            int i13 = zzakzVar5.zzc;
                            String attributeValue4 = newPullParser.getAttributeValue(str5, "tickRate");
                            if (attributeValue4 != null) {
                                i8 = Integer.parseInt(attributeValue4);
                                arrayDeque2 = arrayDeque3;
                            } else {
                                arrayDeque2 = arrayDeque3;
                                i8 = i13;
                            }
                            zzakz zzakzVar6 = new zzakz(parseInt4 * f4, parseInt5, i8);
                            String attributeValue5 = newPullParser.getAttributeValue(str5, "cellResolution");
                            if (attributeValue5 != null) {
                                Matcher matcher = zzg.matcher(attributeValue5);
                                if (matcher.matches()) {
                                    try {
                                        String group = matcher.group(1);
                                        group.getClass();
                                        parseInt3 = Integer.parseInt(group);
                                        String group2 = matcher.group(2);
                                        group2.getClass();
                                        int parseInt6 = Integer.parseInt(group2);
                                        if (parseInt3 == 0) {
                                            str2 = str5;
                                            i5 = parseInt6;
                                            z = false;
                                        } else if (parseInt6 != 0) {
                                            str2 = str5;
                                            i5 = parseInt6;
                                            z = true;
                                        } else {
                                            str2 = str5;
                                            z = false;
                                            i5 = 0;
                                        }
                                    } catch (NumberFormatException unused) {
                                        str2 = str5;
                                    }
                                    try {
                                        StringBuilder sb = new StringBuilder();
                                        zzakzVar3 = zzakzVar6;
                                        try {
                                            sb.append("Invalid cell resolution ");
                                            sb.append(parseInt3);
                                            sb.append(" ");
                                            sb.append(i5);
                                            zzdi.zze(z, sb.toString());
                                        } catch (NumberFormatException unused2) {
                                            zzea.zzf("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                            i5 = 15;
                                            zza4 = zzeu.zza(newPullParser, "extent");
                                            if (zza4 != null) {
                                            }
                                            zzalaVar = null;
                                            zzakzVar4 = zzakzVar3;
                                            String str6 = "metadata";
                                            if (!name.equals("tt")) {
                                                zzea.zze("TtmlParser", "Ignoring unsupported tag: " + newPullParser.getName());
                                                hashMap = hashMap3;
                                                zzalaVar2 = zzalaVar;
                                                i10 = i5;
                                                zzalfVar3 = zzalfVar2;
                                                arrayDeque = arrayDeque2;
                                                i9 = 1;
                                                newPullParser.next();
                                                eventType = newPullParser.getEventType();
                                                hashMap3 = hashMap;
                                                arrayDeque3 = arrayDeque;
                                                str4 = str;
                                                str5 = str2;
                                            }
                                            if ("head".equals(name)) {
                                            }
                                            zzakzVar4 = zzakzVar;
                                            zzalaVar2 = zzalaVar;
                                            i10 = i5;
                                            zzalfVar3 = zzalfVar2;
                                            i9 = i4;
                                            hashMap = hashMap2;
                                            newPullParser.next();
                                            eventType = newPullParser.getEventType();
                                            hashMap3 = hashMap;
                                            arrayDeque3 = arrayDeque;
                                            str4 = str;
                                            str5 = str2;
                                        }
                                    } catch (NumberFormatException unused3) {
                                        zzakzVar3 = zzakzVar6;
                                        zzea.zzf("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                        i5 = 15;
                                        zza4 = zzeu.zza(newPullParser, "extent");
                                        if (zza4 != null) {
                                        }
                                        zzalaVar = null;
                                        zzakzVar4 = zzakzVar3;
                                        String str62 = "metadata";
                                        if (!name.equals("tt")) {
                                        }
                                        if ("head".equals(name)) {
                                        }
                                        zzakzVar4 = zzakzVar;
                                        zzalaVar2 = zzalaVar;
                                        i10 = i5;
                                        zzalfVar3 = zzalfVar2;
                                        i9 = i4;
                                        hashMap = hashMap2;
                                        newPullParser.next();
                                        eventType = newPullParser.getEventType();
                                        hashMap3 = hashMap;
                                        arrayDeque3 = arrayDeque;
                                        str4 = str;
                                        str5 = str2;
                                    }
                                    zza4 = zzeu.zza(newPullParser, "extent");
                                    if (zza4 != null) {
                                        Matcher matcher2 = zzf.matcher(zza4);
                                        if (matcher2.matches()) {
                                            try {
                                                String group3 = matcher2.group(1);
                                                group3.getClass();
                                                int parseInt7 = Integer.parseInt(group3);
                                                String group4 = matcher2.group(2);
                                                group4.getClass();
                                                zzalaVar = new zzala(parseInt7, Integer.parseInt(group4));
                                            } catch (NumberFormatException unused4) {
                                                zzea.zzf("TtmlParser", "Ignoring malformed tts extent: ".concat(zza4));
                                            }
                                            zzakzVar4 = zzakzVar3;
                                        } else {
                                            zzea.zzf("TtmlParser", "Ignoring non-pixel tts extent: ".concat(zza4));
                                        }
                                    }
                                    zzalaVar = null;
                                    zzakzVar4 = zzakzVar3;
                                } else {
                                    zzea.zzf("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                }
                            }
                            str2 = str5;
                            zzakzVar3 = zzakzVar6;
                            i5 = 15;
                            zza4 = zzeu.zza(newPullParser, "extent");
                            if (zza4 != null) {
                            }
                            zzalaVar = null;
                            zzakzVar4 = zzakzVar3;
                        } else {
                            str2 = str5;
                            arrayDeque2 = arrayDeque3;
                            zzalfVar2 = zzalfVar3;
                            i4 = i9;
                            zzalaVar = zzalaVar2;
                            i5 = i10;
                        }
                        String str622 = "metadata";
                        if (!name.equals("tt") && !name.equals("head") && !name.equals("body") && !name.equals("div") && !name.equals("p") && !name.equals("span") && !name.equals("br") && !name.equals("style") && !name.equals("styling") && !name.equals("layout") && !name.equals("region") && !name.equals("metadata") && !name.equals("image") && !name.equals(Constants.ScionAnalytics.MessageType.DATA_MESSAGE) && !name.equals("information")) {
                            zzea.zze("TtmlParser", "Ignoring unsupported tag: " + newPullParser.getName());
                            hashMap = hashMap3;
                            zzalaVar2 = zzalaVar;
                            i10 = i5;
                            zzalfVar3 = zzalfVar2;
                            arrayDeque = arrayDeque2;
                            i9 = 1;
                            newPullParser.next();
                            eventType = newPullParser.getEventType();
                            hashMap3 = hashMap;
                            arrayDeque3 = arrayDeque;
                            str4 = str;
                            str5 = str2;
                        }
                        if ("head".equals(name)) {
                            while (true) {
                                newPullParser.next();
                                if (zzeu.zzc(newPullParser, "style")) {
                                    String zza5 = zzeu.zza(newPullParser, "style");
                                    zzale zzg2 = zzg(newPullParser, new zzale());
                                    if (zza5 != null) {
                                        String[] zzh2 = zzh(zza5);
                                        zzakzVar2 = zzakzVar4;
                                        int i14 = 0;
                                        for (int length = zzh2.length; i14 < length; length = length) {
                                            zzg2.zzl((zzale) hashMap3.get(zzh2[i14]));
                                            i14++;
                                        }
                                    } else {
                                        zzakzVar2 = zzakzVar4;
                                    }
                                    String zzE = zzg2.zzE();
                                    if (zzE != null) {
                                        hashMap3.put(zzE, zzg2);
                                    }
                                } else {
                                    zzakzVar2 = zzakzVar4;
                                    if (zzeu.zzc(newPullParser, "region")) {
                                        String zza6 = zzeu.zza(newPullParser, FacebookMediationAdapter.KEY_ID);
                                        if (zza6 == null) {
                                            str3 = str622;
                                            hashMap2 = hashMap3;
                                        } else {
                                            String zza7 = zzeu.zza(newPullParser, "origin");
                                            if (zza7 != null) {
                                                Pattern pattern = zzb;
                                                Matcher matcher3 = pattern.matcher(zza7);
                                                Pattern pattern2 = zzf;
                                                str3 = str622;
                                                Matcher matcher4 = pattern2.matcher(zza7);
                                                if (matcher3.matches()) {
                                                    hashMap2 = hashMap3;
                                                    try {
                                                        String group5 = matcher3.group(1);
                                                        group5.getClass();
                                                        float parseFloat = Float.parseFloat(group5) / 100.0f;
                                                        String group6 = matcher3.group(2);
                                                        group6.getClass();
                                                        parseInt = Float.parseFloat(group6) / 100.0f;
                                                        f = parseFloat;
                                                    } catch (NumberFormatException unused5) {
                                                        zzea.zzf("TtmlParser", "Ignoring region with malformed origin: ".concat(zza7));
                                                    }
                                                } else {
                                                    hashMap2 = hashMap3;
                                                    if (!matcher4.matches()) {
                                                        zzea.zzf("TtmlParser", "Ignoring region with unsupported origin: ".concat(zza7));
                                                    } else if (zzalaVar == null) {
                                                        zzea.zzf("TtmlParser", "Ignoring region with missing tts:extent: ".concat(zza7));
                                                    } else {
                                                        try {
                                                            String group7 = matcher4.group(1);
                                                            group7.getClass();
                                                            int parseInt8 = Integer.parseInt(group7);
                                                            String group8 = matcher4.group(2);
                                                            group8.getClass();
                                                            f = parseInt8 / zzalaVar.zza;
                                                            parseInt = Integer.parseInt(group8) / zzalaVar.zzb;
                                                        } catch (NumberFormatException unused6) {
                                                            zzea.zzf("TtmlParser", "Ignoring region with malformed origin: ".concat(zza7));
                                                        }
                                                    }
                                                }
                                                String zza8 = zzeu.zza(newPullParser, "extent");
                                                if (zza8 != null) {
                                                    Matcher matcher5 = pattern.matcher(zza8);
                                                    Matcher matcher6 = pattern2.matcher(zza8);
                                                    if (matcher5.matches()) {
                                                        try {
                                                            String group9 = matcher5.group(1);
                                                            group9.getClass();
                                                            float parseFloat2 = Float.parseFloat(group9) / 100.0f;
                                                            String group10 = matcher5.group(2);
                                                            group10.getClass();
                                                            parseInt2 = Float.parseFloat(group10) / 100.0f;
                                                            f2 = parseFloat2;
                                                        } catch (NumberFormatException unused7) {
                                                            zzea.zzf("TtmlParser", "Ignoring region with malformed extent: ".concat(zza7));
                                                        }
                                                    } else if (!matcher6.matches()) {
                                                        zzea.zzf("TtmlParser", "Ignoring region with unsupported extent: ".concat(zza7));
                                                    } else if (zzalaVar == null) {
                                                        zzea.zzf("TtmlParser", "Ignoring region with missing tts:extent: ".concat(zza7));
                                                    } else {
                                                        try {
                                                            String group11 = matcher6.group(1);
                                                            group11.getClass();
                                                            int parseInt9 = Integer.parseInt(group11);
                                                            String group12 = matcher6.group(2);
                                                            group12.getClass();
                                                            float f5 = parseInt9 / zzalaVar.zza;
                                                            parseInt2 = Integer.parseInt(group12) / zzalaVar.zzb;
                                                            f2 = f5;
                                                        } catch (NumberFormatException unused8) {
                                                            zzea.zzf("TtmlParser", "Ignoring region with malformed extent: ".concat(zza7));
                                                        }
                                                    }
                                                    String zza9 = zzeu.zza(newPullParser, "displayAlign");
                                                    if (zza9 != null) {
                                                        String zza10 = zzfuf.zza(zza9);
                                                        int hashCode = zza10.hashCode();
                                                        if (hashCode != -1364013995) {
                                                            if (hashCode == 92734940 && zza10.equals("after")) {
                                                                c3 = 1;
                                                                if (c3 != 0) {
                                                                    f3 = parseInt + (parseInt2 / 2.0f);
                                                                    i6 = 1;
                                                                } else if (c3 == 1) {
                                                                    f3 = parseInt + parseInt2;
                                                                    i6 = 2;
                                                                }
                                                                float f6 = 1.0f / i5;
                                                                zza2 = zzeu.zza(newPullParser, "writingMode");
                                                                if (zza2 != null) {
                                                                    String zza11 = zzfuf.zza(zza2);
                                                                    int hashCode2 = zza11.hashCode();
                                                                    if (hashCode2 == 3694) {
                                                                        if (zza11.equals("tb")) {
                                                                            c2 = 0;
                                                                            if (c2 != 0) {
                                                                            }
                                                                            i7 = 2;
                                                                            zzalcVar = new zzalc(zza6, f, f3, 0, i6, f2, parseInt2, 1, f6, i7);
                                                                            if (zzalcVar != null) {
                                                                            }
                                                                            if (zzeu.zzb(newPullParser, "head")) {
                                                                            }
                                                                        }
                                                                        c2 = 65535;
                                                                        if (c2 != 0) {
                                                                        }
                                                                        i7 = 2;
                                                                        zzalcVar = new zzalc(zza6, f, f3, 0, i6, f2, parseInt2, 1, f6, i7);
                                                                        if (zzalcVar != null) {
                                                                        }
                                                                        if (zzeu.zzb(newPullParser, "head")) {
                                                                        }
                                                                    } else if (hashCode2 != 3553396) {
                                                                        if (hashCode2 == 3553576 && zza11.equals("tbrl")) {
                                                                            c2 = 2;
                                                                            if (c2 != 0 || c2 == 1) {
                                                                                i7 = 2;
                                                                            } else if (c2 == 2) {
                                                                                i7 = 1;
                                                                            }
                                                                            zzalcVar = new zzalc(zza6, f, f3, 0, i6, f2, parseInt2, 1, f6, i7);
                                                                            if (zzalcVar != null) {
                                                                                hashMap4.put(zzalcVar.zza, zzalcVar);
                                                                            }
                                                                            if (zzeu.zzb(newPullParser, "head")) {
                                                                                zzakzVar = zzakzVar2;
                                                                                arrayDeque = arrayDeque2;
                                                                            } else {
                                                                                zzakzVar4 = zzakzVar2;
                                                                                str622 = str3;
                                                                                hashMap3 = hashMap2;
                                                                            }
                                                                        }
                                                                        c2 = 65535;
                                                                        if (c2 != 0) {
                                                                        }
                                                                        i7 = 2;
                                                                        zzalcVar = new zzalc(zza6, f, f3, 0, i6, f2, parseInt2, 1, f6, i7);
                                                                        if (zzalcVar != null) {
                                                                        }
                                                                        if (zzeu.zzb(newPullParser, "head")) {
                                                                        }
                                                                    } else {
                                                                        if (zza11.equals("tblr")) {
                                                                            c2 = 1;
                                                                            if (c2 != 0) {
                                                                            }
                                                                            i7 = 2;
                                                                            zzalcVar = new zzalc(zza6, f, f3, 0, i6, f2, parseInt2, 1, f6, i7);
                                                                            if (zzalcVar != null) {
                                                                            }
                                                                            if (zzeu.zzb(newPullParser, "head")) {
                                                                            }
                                                                        }
                                                                        c2 = 65535;
                                                                        if (c2 != 0) {
                                                                        }
                                                                        i7 = 2;
                                                                        zzalcVar = new zzalc(zza6, f, f3, 0, i6, f2, parseInt2, 1, f6, i7);
                                                                        if (zzalcVar != null) {
                                                                        }
                                                                        if (zzeu.zzb(newPullParser, "head")) {
                                                                        }
                                                                    }
                                                                }
                                                                i7 = Integer.MIN_VALUE;
                                                                zzalcVar = new zzalc(zza6, f, f3, 0, i6, f2, parseInt2, 1, f6, i7);
                                                                if (zzalcVar != null) {
                                                                }
                                                                if (zzeu.zzb(newPullParser, "head")) {
                                                                }
                                                            }
                                                            c3 = 65535;
                                                            if (c3 != 0) {
                                                            }
                                                            float f62 = 1.0f / i5;
                                                            zza2 = zzeu.zza(newPullParser, "writingMode");
                                                            if (zza2 != null) {
                                                            }
                                                            i7 = Integer.MIN_VALUE;
                                                            zzalcVar = new zzalc(zza6, f, f3, 0, i6, f2, parseInt2, 1, f62, i7);
                                                            if (zzalcVar != null) {
                                                            }
                                                            if (zzeu.zzb(newPullParser, "head")) {
                                                            }
                                                        } else {
                                                            if (zza10.equals("center")) {
                                                                c3 = 0;
                                                                if (c3 != 0) {
                                                                }
                                                                float f622 = 1.0f / i5;
                                                                zza2 = zzeu.zza(newPullParser, "writingMode");
                                                                if (zza2 != null) {
                                                                }
                                                                i7 = Integer.MIN_VALUE;
                                                                zzalcVar = new zzalc(zza6, f, f3, 0, i6, f2, parseInt2, 1, f622, i7);
                                                                if (zzalcVar != null) {
                                                                }
                                                                if (zzeu.zzb(newPullParser, "head")) {
                                                                }
                                                            }
                                                            c3 = 65535;
                                                            if (c3 != 0) {
                                                            }
                                                            float f6222 = 1.0f / i5;
                                                            zza2 = zzeu.zza(newPullParser, "writingMode");
                                                            if (zza2 != null) {
                                                            }
                                                            i7 = Integer.MIN_VALUE;
                                                            zzalcVar = new zzalc(zza6, f, f3, 0, i6, f2, parseInt2, 1, f6222, i7);
                                                            if (zzalcVar != null) {
                                                            }
                                                            if (zzeu.zzb(newPullParser, "head")) {
                                                            }
                                                        }
                                                        newPullParser.next();
                                                        eventType = newPullParser.getEventType();
                                                        hashMap3 = hashMap;
                                                        arrayDeque3 = arrayDeque;
                                                        str4 = str;
                                                        str5 = str2;
                                                    }
                                                    f3 = parseInt;
                                                    i6 = 0;
                                                    float f62222 = 1.0f / i5;
                                                    zza2 = zzeu.zza(newPullParser, "writingMode");
                                                    if (zza2 != null) {
                                                    }
                                                    i7 = Integer.MIN_VALUE;
                                                    zzalcVar = new zzalc(zza6, f, f3, 0, i6, f2, parseInt2, 1, f62222, i7);
                                                    if (zzalcVar != null) {
                                                    }
                                                    if (zzeu.zzb(newPullParser, "head")) {
                                                    }
                                                } else {
                                                    zzea.zzf("TtmlParser", "Ignoring region without an extent");
                                                }
                                            } else {
                                                str3 = str622;
                                                hashMap2 = hashMap3;
                                                zzea.zzf("TtmlParser", "Ignoring region without an origin");
                                            }
                                        }
                                        zzalcVar = null;
                                        if (zzalcVar != null) {
                                        }
                                        if (zzeu.zzb(newPullParser, "head")) {
                                        }
                                    } else if (zzeu.zzc(newPullParser, str622)) {
                                        do {
                                            newPullParser.next();
                                            if (zzeu.zzc(newPullParser, "image") && (zza3 = zzeu.zza(newPullParser, FacebookMediationAdapter.KEY_ID)) != null) {
                                                hashMap5.put(zza3, newPullParser.nextText());
                                            }
                                        } while (!zzeu.zzb(newPullParser, str622));
                                    }
                                }
                                str3 = str622;
                                hashMap2 = hashMap3;
                                if (zzeu.zzb(newPullParser, "head")) {
                                }
                            }
                        } else {
                            hashMap2 = hashMap3;
                            zzakz zzakzVar7 = zzakzVar4;
                            try {
                                int attributeCount = newPullParser.getAttributeCount();
                                zzale zzg3 = zzg(newPullParser, null);
                                String[] strArr = null;
                                String str7 = null;
                                String str8 = str;
                                long j2 = -9223372036854775807L;
                                long j3 = -9223372036854775807L;
                                long j4 = -9223372036854775807L;
                                int i15 = 0;
                                while (i15 < attributeCount) {
                                    try {
                                        String attributeName = newPullParser.getAttributeName(i15);
                                        String attributeValue6 = newPullParser.getAttributeValue(i15);
                                        switch (attributeName.hashCode()) {
                                            case -934795532:
                                                if (attributeName.equals("region")) {
                                                    c = 4;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 99841:
                                                if (attributeName.equals("dur")) {
                                                    c = 2;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 100571:
                                                if (attributeName.equals("end")) {
                                                    c = 1;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 93616297:
                                                if (attributeName.equals("begin")) {
                                                    c = 0;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 109780401:
                                                if (attributeName.equals("style")) {
                                                    c = 3;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 1292595405:
                                                if (attributeName.equals("backgroundImage")) {
                                                    c = 5;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            default:
                                                c = 65535;
                                                break;
                                        }
                                        if (c == 0) {
                                            zzakzVar = zzakzVar7;
                                            j3 = zzd(attributeValue6, zzakzVar);
                                        } else if (c == 1) {
                                            zzakzVar = zzakzVar7;
                                            j2 = zzd(attributeValue6, zzakzVar);
                                        } else if (c != 2) {
                                            if (c == 3) {
                                                String[] zzh3 = zzh(attributeValue6);
                                                if (zzh3.length > 0) {
                                                    strArr = zzh3;
                                                }
                                            } else if (c != 4) {
                                                if (c == 5) {
                                                    try {
                                                        if (attributeValue6.startsWith("#")) {
                                                            try {
                                                                str7 = attributeValue6.substring(1);
                                                            } catch (zzajw e) {
                                                                e = e;
                                                                zzajwVar = e;
                                                                zzakzVar = zzakzVar7;
                                                                arrayDeque = arrayDeque2;
                                                                zzea.zzg("TtmlParser", "Suppressing parser error", zzajwVar);
                                                                zzakzVar4 = zzakzVar;
                                                                zzalaVar2 = zzalaVar;
                                                                i10 = i5;
                                                                zzalfVar3 = zzalfVar2;
                                                                hashMap = hashMap2;
                                                                i9 = 1;
                                                                newPullParser.next();
                                                                eventType = newPullParser.getEventType();
                                                                hashMap3 = hashMap;
                                                                arrayDeque3 = arrayDeque;
                                                                str4 = str;
                                                                str5 = str2;
                                                            }
                                                        }
                                                    } catch (zzajw e2) {
                                                        e = e2;
                                                    }
                                                }
                                            } else if (hashMap4.containsKey(attributeValue6)) {
                                                str8 = attributeValue6;
                                            }
                                            zzakzVar = zzakzVar7;
                                        } else {
                                            zzakzVar = zzakzVar7;
                                            try {
                                                j4 = zzd(attributeValue6, zzakzVar);
                                            } catch (zzajw e3) {
                                                e = e3;
                                                zzajwVar = e;
                                                arrayDeque = arrayDeque2;
                                                zzea.zzg("TtmlParser", "Suppressing parser error", zzajwVar);
                                                zzakzVar4 = zzakzVar;
                                                zzalaVar2 = zzalaVar;
                                                i10 = i5;
                                                zzalfVar3 = zzalfVar2;
                                                hashMap = hashMap2;
                                                i9 = 1;
                                                newPullParser.next();
                                                eventType = newPullParser.getEventType();
                                                hashMap3 = hashMap;
                                                arrayDeque3 = arrayDeque;
                                                str4 = str;
                                                str5 = str2;
                                            }
                                        }
                                        i15++;
                                        zzakzVar7 = zzakzVar;
                                    } catch (zzajw e4) {
                                        e = e4;
                                        zzakzVar = zzakzVar7;
                                    }
                                }
                                zzakzVar = zzakzVar7;
                                if (zzakyVar2 != null) {
                                    long j5 = zzakyVar2.zzd;
                                    if (j5 != -9223372036854775807L) {
                                        j3 = j3 != -9223372036854775807L ? j3 + j5 : -9223372036854775807L;
                                        if (j2 != -9223372036854775807L) {
                                            j2 += j5;
                                        } else {
                                            zzakyVar = zzakyVar2;
                                            j2 = -9223372036854775807L;
                                        }
                                    }
                                    zzakyVar = zzakyVar2;
                                } else {
                                    zzakyVar = null;
                                }
                                if (j2 != -9223372036854775807L) {
                                    j = j2;
                                } else if (j4 != -9223372036854775807L) {
                                    j = j3 + j4;
                                } else {
                                    if (zzakyVar != null) {
                                        long j6 = zzakyVar.zze;
                                        if (j6 != -9223372036854775807L) {
                                            j = j6;
                                        }
                                    }
                                    j = -9223372036854775807L;
                                }
                                try {
                                    zzaky zzb2 = zzaky.zzb(newPullParser.getName(), j3, j, zzg3, strArr, str8, str7, zzakyVar);
                                    arrayDeque = arrayDeque2;
                                    try {
                                        arrayDeque.push(zzb2);
                                        if (zzakyVar2 != null) {
                                            zzakyVar2.zzf(zzb2);
                                        }
                                    } catch (zzajw e5) {
                                        e = e5;
                                        zzajwVar = e;
                                        zzea.zzg("TtmlParser", "Suppressing parser error", zzajwVar);
                                        zzakzVar4 = zzakzVar;
                                        zzalaVar2 = zzalaVar;
                                        i10 = i5;
                                        zzalfVar3 = zzalfVar2;
                                        hashMap = hashMap2;
                                        i9 = 1;
                                        newPullParser.next();
                                        eventType = newPullParser.getEventType();
                                        hashMap3 = hashMap;
                                        arrayDeque3 = arrayDeque;
                                        str4 = str;
                                        str5 = str2;
                                    }
                                } catch (zzajw e6) {
                                    e = e6;
                                    arrayDeque = arrayDeque2;
                                }
                            } catch (zzajw e7) {
                                e = e7;
                                zzakzVar = zzakzVar7;
                                arrayDeque = arrayDeque2;
                            }
                        }
                        zzakzVar4 = zzakzVar;
                        zzalaVar2 = zzalaVar;
                        i10 = i5;
                        zzalfVar3 = zzalfVar2;
                        i9 = i4;
                        hashMap = hashMap2;
                        newPullParser.next();
                        eventType = newPullParser.getEventType();
                        hashMap3 = hashMap;
                        arrayDeque3 = arrayDeque;
                        str4 = str;
                        str5 = str2;
                    } else {
                        str2 = str5;
                        HashMap hashMap6 = hashMap3;
                        arrayDeque = arrayDeque3;
                        zzalfVar = zzalfVar3;
                        i3 = i9;
                        if (eventType == 4) {
                            zzakyVar2.getClass();
                            zzakyVar2.zzf(zzaky.zzc(newPullParser.getText()));
                        } else if (eventType == 3) {
                            if (newPullParser.getName().equals("tt")) {
                                zzaky zzakyVar3 = (zzaky) arrayDeque.peek();
                                zzakyVar3.getClass();
                                hashMap = hashMap6;
                                zzalfVar3 = new zzalf(zzakyVar3, hashMap, hashMap4, hashMap5);
                            } else {
                                hashMap = hashMap6;
                                zzalfVar3 = zzalfVar;
                            }
                            arrayDeque.pop();
                        }
                        hashMap = hashMap6;
                        zzalfVar3 = zzalfVar;
                    }
                } else {
                    str = str4;
                    str2 = str5;
                    hashMap = hashMap3;
                    arrayDeque = arrayDeque3;
                    zzalfVar = zzalfVar3;
                    i3 = i9;
                    if (eventType == 2) {
                        i9 = i3 + 1;
                    } else {
                        if (eventType == 3) {
                            i9 = i3 - 1;
                        }
                        zzalfVar3 = zzalfVar;
                    }
                    zzalfVar3 = zzalfVar;
                    newPullParser.next();
                    eventType = newPullParser.getEventType();
                    hashMap3 = hashMap;
                    arrayDeque3 = arrayDeque;
                    str4 = str;
                    str5 = str2;
                }
                i9 = i3;
                newPullParser.next();
                eventType = newPullParser.getEventType();
                hashMap3 = hashMap;
                arrayDeque3 = arrayDeque;
                str4 = str;
                str5 = str2;
            }
            zzalf zzalfVar4 = zzalfVar3;
            zzalfVar4.getClass();
            return zzalfVar4;
        } catch (IOException e8) {
            throw new IllegalStateException("Unexpected error when reading input.", e8);
        } catch (XmlPullParserException e9) {
            throw new IllegalStateException("Unable to decode source", e9);
        }
    }

    public zzalb() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.zzi = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }
}
