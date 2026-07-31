package yads;

import android.text.Layout;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes15.dex */
public final class fa3 extends uz2 {
    public static final Pattern n = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern o = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern p = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern q = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern r = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    public static final Pattern s = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    public static final Pattern t = Pattern.compile("^(\\d+) (\\d+)$");
    public static final da3 u = new da3(30.0f, 1, 1);
    public static final ca3 v = new ca3(15);
    public final XmlPullParserFactory m;

    public fa3() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.m = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    public static ea3 b(XmlPullParser xmlPullParser) {
        String a = sp3.a(xmlPullParser, "extent");
        if (a == null) {
            return null;
        }
        Matcher matcher = s.matcher(a);
        if (!matcher.matches()) {
            gh1.d("TtmlDecoder", "Ignoring non-pixel tts extent: ".concat(a));
            return null;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            return new ea3(parseInt, Integer.parseInt(group2));
        } catch (NumberFormatException unused) {
            gh1.d("TtmlDecoder", "Ignoring malformed tts extent: ".concat(a));
            return null;
        }
    }

    @Override // yads.uz2
    public final c53 a(byte[] bArr, int i, boolean z) {
        da3 da3Var;
        try {
            XmlPullParser newPullParser = this.m.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new ha3("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            ea3 ea3Var = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            da3 da3Var2 = u;
            ca3 ca3Var = v;
            int i2 = 0;
            ka3 ka3Var = null;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                ga3 ga3Var = (ga3) arrayDeque.peek();
                if (i2 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            da3Var2 = a(newPullParser);
                            ca3Var = a(newPullParser, v);
                            ea3Var = b(newPullParser);
                        }
                        ea3 ea3Var2 = ea3Var;
                        da3 da3Var3 = da3Var2;
                        ca3 ca3Var2 = ca3Var;
                        if (a(name)) {
                            if ("head".equals(name)) {
                                da3Var = da3Var3;
                                a(newPullParser, hashMap, ca3Var2, ea3Var2, hashMap2, hashMap3);
                            } else {
                                da3Var = da3Var3;
                                try {
                                    ga3 a = a(newPullParser, ga3Var, hashMap2, da3Var);
                                    arrayDeque.push(a);
                                    if (ga3Var != null) {
                                        if (ga3Var.m == null) {
                                            ga3Var.m = new ArrayList();
                                        }
                                        ga3Var.m.add(a);
                                    }
                                } catch (e53 e) {
                                    gh1.d("TtmlDecoder", gh1.a("Suppressing parser error", e));
                                }
                            }
                            da3Var2 = da3Var;
                            ea3Var = ea3Var2;
                            ca3Var = ca3Var2;
                        } else {
                            gh1.c("TtmlDecoder", "Ignoring unsupported tag: " + newPullParser.getName());
                            da3Var = da3Var3;
                        }
                        da3Var2 = da3Var;
                        ea3Var = ea3Var2;
                        ca3Var = ca3Var2;
                        i2++;
                    } else if (eventType == 4) {
                        ga3Var.getClass();
                        ga3 a2 = ga3.a(newPullParser.getText());
                        if (ga3Var.m == null) {
                            ga3Var.m = new ArrayList();
                        }
                        ga3Var.m.add(a2);
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            ga3 ga3Var2 = (ga3) arrayDeque.peek();
                            ga3Var2.getClass();
                            ka3Var = new ka3(ga3Var2, hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                    newPullParser.next();
                } else {
                    if (eventType != 2) {
                        if (eventType == 3) {
                            i2--;
                        }
                        newPullParser.next();
                    }
                    i2++;
                    newPullParser.next();
                }
            }
            if (ka3Var != null) {
                return ka3Var;
            }
            throw new e53("No TTML subtitles found");
        } catch (IOException e2) {
            throw new IllegalStateException("Unexpected error when reading input.", e2);
        } catch (XmlPullParserException e3) {
            throw new e53("Unable to decode source", e3);
        }
    }

    public static da3 a(XmlPullParser xmlPullParser) {
        float f;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i = sb3.a;
            if (attributeValue2.split(" ", -1).length == 2) {
                f = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
            } else {
                throw new e53("frameRateMultiplier doesn't have 2 parts");
            }
        } else {
            f = 1.0f;
        }
        da3 da3Var = u;
        int i2 = da3Var.b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i2 = Integer.parseInt(attributeValue3);
        }
        int i3 = da3Var.c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i3 = Integer.parseInt(attributeValue4);
        }
        return new da3(parseInt * f, i2, i3);
    }

    public static ca3 a(XmlPullParser xmlPullParser, ca3 ca3Var) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return ca3Var;
        }
        Matcher matcher = t.matcher(attributeValue);
        if (!matcher.matches()) {
            gh1.d("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return ca3Var;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            int parseInt2 = Integer.parseInt(group2);
            if (parseInt == 0 || parseInt2 == 0) {
                throw new e53("Invalid cell resolution " + parseInt + " " + parseInt2);
            }
            return new ca3(parseInt2);
        } catch (NumberFormatException unused) {
            gh1.d("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return ca3Var;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0263 A[LOOP:0: B:2:0x000a->B:22:0x0263, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0262 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x019b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(XmlPullParser xmlPullParser, HashMap hashMap, ca3 ca3Var, ea3 ea3Var, HashMap hashMap2, HashMap hashMap3) {
        String a;
        float parseFloat;
        float f;
        float f2;
        float parseFloat2;
        ca3 ca3Var2;
        int i;
        String a2;
        int i2;
        char c;
        String[] split;
        int i3 = -1;
        int i4 = 0;
        while (true) {
            xmlPullParser.next();
            if (sp3.c(xmlPullParser, "style")) {
                String a3 = sp3.a(xmlPullParser, "style");
                ja3 a4 = a(xmlPullParser, new ja3());
                if (a3 != null) {
                    String trim = a3.trim();
                    if (trim.isEmpty()) {
                        split = new String[i4];
                    } else {
                        int i5 = sb3.a;
                        split = trim.split("\\s+", i3);
                    }
                    int length = split.length;
                    for (int i6 = i4; i6 < length; i6++) {
                        a4.a((ja3) hashMap.get(split[i6]));
                    }
                }
                String str = a4.l;
                if (str != null) {
                    hashMap.put(str, a4);
                }
            } else {
                if (sp3.c(xmlPullParser, "region")) {
                    String a5 = sp3.a(xmlPullParser, "id");
                    ha3 ha3Var = null;
                    if (a5 != null) {
                        String a6 = sp3.a(xmlPullParser, "origin");
                        if (a6 != null) {
                            Pattern pattern = r;
                            Matcher matcher = pattern.matcher(a6);
                            Pattern pattern2 = s;
                            Matcher matcher2 = pattern2.matcher(a6);
                            if (matcher.matches()) {
                                try {
                                    String group = matcher.group(1);
                                    group.getClass();
                                    float parseFloat3 = Float.parseFloat(group) / 100.0f;
                                    String group2 = matcher.group(2);
                                    group2.getClass();
                                    parseFloat = Float.parseFloat(group2) / 100.0f;
                                    f = parseFloat3;
                                } catch (NumberFormatException unused) {
                                    gh1.d("TtmlDecoder", "Ignoring region with malformed origin: ".concat(a6));
                                }
                            } else if (!matcher2.matches()) {
                                gh1.d("TtmlDecoder", "Ignoring region with unsupported origin: ".concat(a6));
                            } else if (ea3Var == null) {
                                gh1.d("TtmlDecoder", "Ignoring region with missing tts:extent: ".concat(a6));
                            } else {
                                try {
                                    String group3 = matcher2.group(1);
                                    group3.getClass();
                                    int parseInt = Integer.parseInt(group3);
                                    String group4 = matcher2.group(2);
                                    group4.getClass();
                                    f = parseInt / ea3Var.a;
                                    parseFloat = Integer.parseInt(group4) / ea3Var.b;
                                } catch (NumberFormatException unused2) {
                                    gh1.d("TtmlDecoder", "Ignoring region with malformed origin: ".concat(a6));
                                }
                            }
                            String a7 = sp3.a(xmlPullParser, "extent");
                            if (a7 != null) {
                                Matcher matcher3 = pattern.matcher(a7);
                                Matcher matcher4 = pattern2.matcher(a7);
                                if (matcher3.matches()) {
                                    try {
                                        String group5 = matcher3.group(1);
                                        group5.getClass();
                                        float parseFloat4 = Float.parseFloat(group5) / 100.0f;
                                        String group6 = matcher3.group(2);
                                        group6.getClass();
                                        f2 = parseFloat4;
                                        parseFloat2 = Float.parseFloat(group6) / 100.0f;
                                    } catch (NumberFormatException unused3) {
                                        gh1.d("TtmlDecoder", "Ignoring region with malformed extent: ".concat(a6));
                                    }
                                } else if (!matcher4.matches()) {
                                    gh1.d("TtmlDecoder", "Ignoring region with unsupported extent: ".concat(a6));
                                } else if (ea3Var == null) {
                                    gh1.d("TtmlDecoder", "Ignoring region with missing tts:extent: ".concat(a6));
                                } else {
                                    try {
                                        String group7 = matcher4.group(1);
                                        group7.getClass();
                                        int parseInt2 = Integer.parseInt(group7);
                                        String group8 = matcher4.group(2);
                                        group8.getClass();
                                        f2 = parseInt2 / ea3Var.a;
                                        parseFloat2 = Integer.parseInt(group8) / ea3Var.b;
                                    } catch (NumberFormatException unused4) {
                                        gh1.d("TtmlDecoder", "Ignoring region with malformed extent: ".concat(a6));
                                    }
                                }
                                String a8 = sp3.a(xmlPullParser, "displayAlign");
                                if (a8 != null) {
                                    String a9 = lh.a(a8);
                                    a9.getClass();
                                    if (a9.equals("center")) {
                                        parseFloat = (parseFloat2 / 2.0f) + parseFloat;
                                        i = 1;
                                        ca3Var2 = ca3Var;
                                    } else if (a9.equals("after")) {
                                        parseFloat += parseFloat2;
                                        ca3Var2 = ca3Var;
                                        i = 2;
                                    }
                                    float f3 = 1.0f / ca3Var2.a;
                                    a2 = sp3.a(xmlPullParser, "writingMode");
                                    if (a2 != null) {
                                        String a10 = lh.a(a2);
                                        a10.getClass();
                                        switch (a10.hashCode()) {
                                            case 3694:
                                                if (a10.equals("tb")) {
                                                    c = 0;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 3553396:
                                                if (a10.equals("tblr")) {
                                                    c = 1;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 3553576:
                                                if (a10.equals("tbrl")) {
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
                                                i2 = 2;
                                                break;
                                            case 2:
                                                i2 = 1;
                                                break;
                                        }
                                        ha3Var = new ha3(a5, f, parseFloat, 0, i, f2, parseFloat2, 1, f3, i2);
                                    }
                                    i2 = Integer.MIN_VALUE;
                                    ha3Var = new ha3(a5, f, parseFloat, 0, i, f2, parseFloat2, 1, f3, i2);
                                }
                                ca3Var2 = ca3Var;
                                i = 0;
                                float f32 = 1.0f / ca3Var2.a;
                                a2 = sp3.a(xmlPullParser, "writingMode");
                                if (a2 != null) {
                                }
                                i2 = Integer.MIN_VALUE;
                                ha3Var = new ha3(a5, f, parseFloat, 0, i, f2, parseFloat2, 1, f32, i2);
                            } else {
                                gh1.d("TtmlDecoder", "Ignoring region without an extent");
                            }
                        } else {
                            gh1.d("TtmlDecoder", "Ignoring region without an origin");
                        }
                        if (ha3Var != null) {
                            hashMap2.put(ha3Var.a, ha3Var);
                        }
                    }
                    if (ha3Var != null) {
                    }
                } else if (sp3.c(xmlPullParser, "metadata")) {
                    do {
                        xmlPullParser.next();
                        if (sp3.c(xmlPullParser, "image") && (a = sp3.a(xmlPullParser, "id")) != null) {
                            hashMap3.put(a, xmlPullParser.nextText());
                        }
                    } while (!sp3.b(xmlPullParser, "metadata"));
                    if (sp3.b(xmlPullParser, "head")) {
                        return;
                    }
                    i3 = -1;
                    i4 = 0;
                }
                if (sp3.b(xmlPullParser, "head")) {
                }
            }
            if (sp3.b(xmlPullParser, "head")) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static ja3 a(XmlPullParser xmlPullParser, ja3 ja3Var) {
        int i;
        int i2;
        int i3;
        int i4;
        char c;
        int i5;
        int i6 = 2;
        int attributeCount = xmlPullParser.getAttributeCount();
        ja3 ja3Var2 = ja3Var;
        int i7 = 0;
        while (i7 < attributeCount) {
            String attributeValue = xmlPullParser.getAttributeValue(i7);
            String attributeName = xmlPullParser.getAttributeName(i7);
            attributeName.getClass();
            Layout.Alignment alignment = null;
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals("fontStyle")) {
                        i = 0;
                        break;
                    }
                    i = -1;
                    break;
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        i = 1;
                        break;
                    }
                    i = -1;
                    break;
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
                        i = i6;
                        break;
                    }
                    i = -1;
                    break;
                case -879295043:
                    if (attributeName.equals("textDecoration")) {
                        i = 3;
                        break;
                    }
                    i = -1;
                    break;
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
                        i = 4;
                        break;
                    }
                    i = -1;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        i = 5;
                        break;
                    }
                    i = -1;
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        i = 6;
                        break;
                    }
                    i = -1;
                    break;
                case 94842723:
                    if (attributeName.equals("color")) {
                        i = 7;
                        break;
                    }
                    i = -1;
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        i = 8;
                        break;
                    }
                    i = -1;
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        i = 9;
                        break;
                    }
                    i = -1;
                    break;
                case 365601008:
                    if (attributeName.equals("fontSize")) {
                        i = 10;
                        break;
                    }
                    i = -1;
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        i = 11;
                        break;
                    }
                    i = -1;
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        i = 12;
                        break;
                    }
                    i = -1;
                    break;
                case 1287124693:
                    if (attributeName.equals("backgroundColor")) {
                        i = 13;
                        break;
                    }
                    i = -1;
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        i = 14;
                        break;
                    }
                    i = -1;
                    break;
                default:
                    i = -1;
                    break;
            }
            switch (i) {
                case 0:
                    i2 = i6;
                    ja3Var2 = a(ja3Var2);
                    ja3Var2.i = "italic".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 1:
                    i2 = i6;
                    ja3Var2 = a(ja3Var2);
                    ja3Var2.a = attributeValue;
                    break;
                case 2:
                    i2 = i6;
                    ja3Var2 = a(ja3Var2);
                    String a = lh.a(attributeValue);
                    a.getClass();
                    switch (a.hashCode()) {
                        case -1364013995:
                            if (a.equals("center")) {
                                i3 = 0;
                                break;
                            }
                            i3 = -1;
                            break;
                        case 100571:
                            if (a.equals("end")) {
                                i3 = 1;
                                break;
                            }
                            i3 = -1;
                            break;
                        case 3317767:
                            if (a.equals("left")) {
                                i3 = i2;
                                break;
                            }
                            i3 = -1;
                            break;
                        case 108511772:
                            if (a.equals("right")) {
                                i3 = 3;
                                break;
                            }
                            i3 = -1;
                            break;
                        case 109757538:
                            if (a.equals("start")) {
                                i3 = 4;
                                break;
                            }
                            i3 = -1;
                            break;
                        default:
                            i3 = -1;
                            break;
                    }
                    switch (i3) {
                        case 0:
                            alignment = Layout.Alignment.ALIGN_CENTER;
                            break;
                        case 1:
                        case 3:
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            break;
                        case 2:
                        case 4:
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                            break;
                    }
                    ja3Var2.o = alignment;
                    break;
                case 3:
                    i2 = i6;
                    String a2 = lh.a(attributeValue);
                    a2.getClass();
                    switch (a2.hashCode()) {
                        case -1461280213:
                            if (a2.equals("nounderline")) {
                                i4 = 0;
                                break;
                            }
                            i4 = -1;
                            break;
                        case -1026963764:
                            if (a2.equals("underline")) {
                                i4 = 1;
                                break;
                            }
                            i4 = -1;
                            break;
                        case 913457136:
                            if (a2.equals("nolinethrough")) {
                                i4 = i2;
                                break;
                            }
                            i4 = -1;
                            break;
                        case 1679736913:
                            if (a2.equals("linethrough")) {
                                i4 = 3;
                                break;
                            }
                            i4 = -1;
                            break;
                        default:
                            i4 = -1;
                            break;
                    }
                    switch (i4) {
                        case 0:
                            ja3Var2 = a(ja3Var2);
                            ja3Var2.g = 0;
                            break;
                        case 1:
                            ja3Var2 = a(ja3Var2);
                            ja3Var2.g = 1;
                            break;
                        case 2:
                            ja3Var2 = a(ja3Var2);
                            ja3Var2.f = 0;
                            break;
                        case 3:
                            ja3Var2 = a(ja3Var2);
                            ja3Var2.f = 1;
                            break;
                    }
                case 4:
                    i2 = i6;
                    ja3Var2 = a(ja3Var2);
                    ja3Var2.h = "bold".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 5:
                    i2 = i6;
                    if (!"style".equals(xmlPullParser.getName())) {
                        break;
                    } else {
                        ja3Var2 = a(ja3Var2);
                        ja3Var2.l = attributeValue;
                        break;
                    }
                case 6:
                    String a3 = lh.a(attributeValue);
                    a3.getClass();
                    switch (a3.hashCode()) {
                        case -618561360:
                            if (a3.equals("baseContainer")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -410956671:
                            if (a3.equals("container")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -250518009:
                            if (a3.equals("delimiter")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -136074796:
                            if (a3.equals("textContainer")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3016401:
                            if (a3.equals("base")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3556653:
                            if (a3.equals("text")) {
                                c = 5;
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
                        case 4:
                            ja3Var2 = a(ja3Var2);
                            i2 = 2;
                            ja3Var2.m = 2;
                            break;
                        case 1:
                            ja3Var2 = a(ja3Var2);
                            ja3Var2.m = 1;
                            i2 = 2;
                            break;
                        case 2:
                            ja3Var2 = a(ja3Var2);
                            ja3Var2.m = 4;
                            i2 = 2;
                            break;
                        case 3:
                        case 5:
                            ja3Var2 = a(ja3Var2);
                            ja3Var2.m = 3;
                        default:
                            i2 = 2;
                            break;
                    }
                case 7:
                    ja3Var2 = a(ja3Var2);
                    try {
                        ja3Var2.b = gx.a(attributeValue, false);
                        ja3Var2.c = true;
                    } catch (IllegalArgumentException unused) {
                        jk1.a("Failed parsing color value: ", attributeValue, "TtmlDecoder");
                    }
                    i2 = 2;
                    break;
                case 8:
                    ja3 a4 = a(ja3Var2);
                    Matcher matcher = q.matcher(attributeValue);
                    float f = Float.MAX_VALUE;
                    if (!matcher.matches()) {
                        jk1.a("Invalid value for shear: ", attributeValue, "TtmlDecoder");
                    } else {
                        try {
                            String group = matcher.group(1);
                            group.getClass();
                            f = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(group)));
                        } catch (NumberFormatException e) {
                            gh1.d("TtmlDecoder", gh1.a("Failed to parse shear: " + attributeValue, e));
                        }
                    }
                    a4.s = f;
                    ja3Var2 = a4;
                    i2 = 2;
                    break;
                case 9:
                    String a5 = lh.a(attributeValue);
                    a5.getClass();
                    if (a5.equals("all")) {
                        ja3Var2 = a(ja3Var2);
                        ja3Var2.q = 1;
                    } else if (a5.equals("none")) {
                        ja3Var2 = a(ja3Var2);
                        ja3Var2.q = 0;
                    }
                    i2 = i6;
                    break;
                case 10:
                    try {
                        ja3Var2 = a(ja3Var2);
                        a(attributeValue, ja3Var2);
                    } catch (e53 unused2) {
                        jk1.a("Failed parsing fontSize value: ", attributeValue, "TtmlDecoder");
                    }
                    i2 = i6;
                    break;
                case 11:
                    ja3Var2 = a(ja3Var2);
                    ja3Var2.r = i63.a(attributeValue);
                    i2 = i6;
                    break;
                case 12:
                    String a6 = lh.a(attributeValue);
                    a6.getClass();
                    if (a6.equals("before")) {
                        ja3Var2 = a(ja3Var2);
                        ja3Var2.n = 1;
                    } else if (a6.equals("after")) {
                        ja3Var2 = a(ja3Var2);
                        ja3Var2.n = i6;
                    }
                    i2 = i6;
                    break;
                case 13:
                    ja3Var2 = a(ja3Var2);
                    try {
                        ja3Var2.d = gx.a(attributeValue, false);
                        ja3Var2.e = true;
                    } catch (IllegalArgumentException unused3) {
                        jk1.a("Failed parsing background value: ", attributeValue, "TtmlDecoder");
                    }
                    i2 = i6;
                    break;
                case 14:
                    ja3Var2 = a(ja3Var2);
                    String a7 = lh.a(attributeValue);
                    a7.getClass();
                    switch (a7.hashCode()) {
                        case -1364013995:
                            if (a7.equals("center")) {
                                i5 = 0;
                                break;
                            }
                            i5 = -1;
                            break;
                        case 100571:
                            if (a7.equals("end")) {
                                i5 = 1;
                                break;
                            }
                            i5 = -1;
                            break;
                        case 3317767:
                            if (a7.equals("left")) {
                                i5 = i6;
                                break;
                            }
                            i5 = -1;
                            break;
                        case 108511772:
                            if (a7.equals("right")) {
                                i5 = 3;
                                break;
                            }
                            i5 = -1;
                            break;
                        case 109757538:
                            if (a7.equals("start")) {
                                i5 = 4;
                                break;
                            }
                            i5 = -1;
                            break;
                        default:
                            i5 = -1;
                            break;
                    }
                    switch (i5) {
                        case 0:
                            alignment = Layout.Alignment.ALIGN_CENTER;
                            break;
                        case 1:
                        case 3:
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            break;
                        case 2:
                        case 4:
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                            break;
                    }
                    ja3Var2.p = alignment;
                    i2 = i6;
                    break;
                default:
                    i2 = i6;
                    break;
            }
            i7++;
            i6 = i2;
        }
        return ja3Var2;
    }

    public static ja3 a(ja3 ja3Var) {
        return ja3Var == null ? new ja3() : ja3Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static ga3 a(XmlPullParser xmlPullParser, ga3 ga3Var, HashMap hashMap, da3 da3Var) {
        long j;
        long j2;
        char c;
        String[] split;
        int attributeCount = xmlPullParser.getAttributeCount();
        ja3 a = a(xmlPullParser, (ja3) null);
        String[] strArr = null;
        String str = null;
        String str2 = "";
        long j3 = -9223372036854775807L;
        long j4 = -9223372036854775807L;
        long j5 = -9223372036854775807L;
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c = 4;
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
            switch (c) {
                case 0:
                    if (!hashMap.containsKey(attributeValue)) {
                        break;
                    } else {
                        str2 = attributeValue;
                        continue;
                    }
                case 1:
                    j5 = a(attributeValue, da3Var);
                    break;
                case 2:
                    j4 = a(attributeValue, da3Var);
                    break;
                case 3:
                    j3 = a(attributeValue, da3Var);
                    break;
                case 4:
                    String trim = attributeValue.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                    } else {
                        int i2 = sb3.a;
                        split = trim.split("\\s+", -1);
                    }
                    if (split.length > 0) {
                        strArr = split;
                        break;
                    }
                    break;
                case 5:
                    if (attributeValue.startsWith("#")) {
                        str = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (ga3Var != null) {
            long j6 = ga3Var.d;
            j = -9223372036854775807L;
            if (j6 != -9223372036854775807L) {
                if (j3 != -9223372036854775807L) {
                    j3 += j6;
                }
                if (j4 != -9223372036854775807L) {
                    j4 += j6;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        if (j4 == j) {
            if (j5 != j) {
                j2 = j3 + j5;
            } else if (ga3Var != null) {
                long j7 = ga3Var.e;
                if (j7 != j) {
                    j2 = j7;
                }
            }
            return new ga3(xmlPullParser.getName(), null, j3, j2, a, strArr, str2, str, ga3Var);
        }
        j2 = j4;
        return new ga3(xmlPullParser.getName(), null, j3, j2, a, strArr, str2, str, ga3Var);
    }

    public static boolean a(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static void a(String str, ja3 ja3Var) {
        Matcher matcher;
        String group;
        int i = sb3.a;
        String[] split = str.split("\\s+", -1);
        if (split.length == 1) {
            matcher = p.matcher(str);
        } else if (split.length == 2) {
            matcher = p.matcher(split[1]);
            gh1.d("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new e53("Invalid number of entries for fontSize: " + split.length + ".");
        }
        if (matcher.matches()) {
            group = matcher.group(3);
            group.getClass();
            switch (group) {
                case "%":
                    ja3Var.j = 3;
                    break;
                case "em":
                    ja3Var.j = 2;
                    break;
                case "px":
                    ja3Var.j = 1;
                    break;
                default:
                    throw new e53("Invalid unit for fontSize: '" + group + "'.");
            }
            String group2 = matcher.group(1);
            group2.getClass();
            ja3Var.k = Float.parseFloat(group2);
            return;
        }
        throw new e53("Invalid expression for fontSize: '" + str + "'.");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a9, code lost:
    
        if (r13.equals("ms") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long a(String str, da3 da3Var) {
        double d;
        double d2;
        char c = 4;
        Matcher matcher = n.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            group.getClass();
            double parseLong = Long.parseLong(group) * 3600;
            matcher.group(2).getClass();
            double parseLong2 = parseLong + (Long.parseLong(r13) * 60);
            matcher.group(3).getClass();
            double parseLong3 = parseLong2 + Long.parseLong(r13);
            String group2 = matcher.group(4);
            return (long) ((parseLong3 + (group2 != null ? Double.parseDouble(group2) : 0.0d) + (matcher.group(5) != null ? Long.parseLong(r13) / da3Var.a : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r13) / da3Var.b) / da3Var.a : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = o.matcher(str);
        if (matcher2.matches()) {
            String group3 = matcher2.group(1);
            group3.getClass();
            double parseDouble = Double.parseDouble(group3);
            String group4 = matcher2.group(2);
            group4.getClass();
            switch (group4.hashCode()) {
                case 102:
                    if (group4.equals(InneractiveMediationDefs.GENDER_FEMALE)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 104:
                    if (group4.equals("h")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 109:
                    if (group4.equals("m")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 116:
                    if (group4.equals("t")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 3494:
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    d = da3Var.a;
                    parseDouble /= d;
                    break;
                case 1:
                    d2 = 3600.0d;
                    break;
                case 2:
                    d2 = 60.0d;
                    break;
                case 3:
                    d = da3Var.c;
                    parseDouble /= d;
                    break;
                case 4:
                    d = 1000.0d;
                    parseDouble /= d;
                    break;
            }
            parseDouble *= d2;
            return (long) (parseDouble * 1000000.0d);
        }
        throw new e53("Malformed time expression: " + str);
    }
}
