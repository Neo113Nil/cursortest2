package com.smaato.sdk.ng.utils.svgparser.utils;

import android.graphics.Matrix;
import android.util.Log;
import android.util.Xml;
import com.adjust.sdk.Constants;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.ironsource.B5;
import com.ironsource.X3;
import com.safedk.android.utils.SdksMapping;
import com.smaato.sdk.ng.utils.svgparser.PreserveAspectRatio;
import com.smaato.sdk.ng.utils.svgparser.SVGExternalFileResolver;
import com.smaato.sdk.ng.utils.svgparser.SVGParseException;
import com.smaato.sdk.ng.utils.svgparser.utils.CSSParser;
import com.smaato.sdk.ng.utils.svgparser.utils.SVGBase;
import com.smaato.sdk.ng.utils.svgparser.utils.Style;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import net.pubnative.lite.sdk.utils.svgparser.utils.SVGParserImpl;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes15.dex */
class d implements com.smaato.sdk.ng.utils.svgparser.utils.c {
    private static final boolean l = false;
    private static final Pattern m = Pattern.compile("/\\*.*?\\*/");
    private int f;
    private SVGBase a = null;
    private SVGBase.SvgContainer b = null;
    private boolean c = true;
    private SVGExternalFileResolver d = null;
    private boolean e = false;
    private boolean g = false;
    private g h = null;
    private StringBuilder i = null;
    private boolean j = false;
    private StringBuilder k = null;

    private static class a {
        private static final Map<String, Integer> a;

        static {
            HashMap hashMap = new HashMap(47);
            a = hashMap;
            hashMap.put("aliceblue", -984833);
            hashMap.put("antiquewhite", -332841);
            hashMap.put("aqua", -16711681);
            hashMap.put("aquamarine", -8388652);
            hashMap.put("azure", -983041);
            hashMap.put("beige", -657956);
            hashMap.put("bisque", -6972);
            hashMap.put("black", -16777216);
            hashMap.put("blanchedalmond", -5171);
            hashMap.put("blue", -16776961);
            hashMap.put("blueviolet", -7722014);
            hashMap.put("brown", -5952982);
            hashMap.put("burlywood", -2180985);
            hashMap.put("cadetblue", -10510688);
            hashMap.put("chartreuse", -8388864);
            hashMap.put("chocolate", -2987746);
            hashMap.put("coral", -32944);
            hashMap.put("cornflowerblue", -10185235);
            hashMap.put("cornsilk", -1828);
            hashMap.put("crimson", -2354116);
            hashMap.put("cyan", -16711681);
            hashMap.put("darkblue", -16777077);
            hashMap.put("darkcyan", -16741493);
            hashMap.put("darkgoldenrod", -4684277);
            hashMap.put("darkgray", -5658199);
            hashMap.put("darkgreen", -16751616);
            hashMap.put("darkgrey", -5658199);
            hashMap.put("darkkhaki", -4343957);
            hashMap.put("darkmagenta", -7667573);
            hashMap.put("darkolivegreen", -11179217);
            hashMap.put("darkorange", -29696);
            hashMap.put("darkorchid", -6737204);
            hashMap.put("darkred", -7667712);
            hashMap.put("darksalmon", -1468806);
            hashMap.put("darkseagreen", -7357297);
            hashMap.put("darkslateblue", -12042869);
            hashMap.put("darkslategray", -13676721);
            hashMap.put("darkslategrey", -13676721);
            hashMap.put("darkturquoise", -16724271);
            hashMap.put("darkviolet", -7077677);
            hashMap.put("deeppink", -60269);
            hashMap.put("deepskyblue", -16728065);
            hashMap.put("dimgray", -9868951);
            hashMap.put("dimgrey", -9868951);
            hashMap.put("dodgerblue", -14774017);
            hashMap.put("firebrick", -5103070);
            hashMap.put("floralwhite", -1296);
            hashMap.put("forestgreen", -14513374);
            hashMap.put("fuchsia", -65281);
            hashMap.put("gainsboro", -2302756);
            hashMap.put("ghostwhite", -460545);
            hashMap.put("gold", -10496);
            hashMap.put("goldenrod", -2448096);
            hashMap.put("gray", -8355712);
            hashMap.put("green", -16744448);
            hashMap.put("greenyellow", -5374161);
            hashMap.put("grey", -8355712);
            hashMap.put("honeydew", -983056);
            hashMap.put("hotpink", -38476);
            hashMap.put("indianred", -3318692);
            hashMap.put("indigo", -11861886);
            hashMap.put("ivory", -16);
            hashMap.put("khaki", -989556);
            hashMap.put("lavender", -1644806);
            hashMap.put("lavenderblush", -3851);
            hashMap.put("lawngreen", -8586240);
            hashMap.put("lemonchiffon", -1331);
            hashMap.put("lightblue", -5383962);
            hashMap.put("lightcoral", -1015680);
            hashMap.put("lightcyan", -2031617);
            hashMap.put("lightgoldenrodyellow", -329006);
            hashMap.put("lightgray", -2894893);
            hashMap.put("lightgreen", -7278960);
            hashMap.put("lightgrey", -2894893);
            hashMap.put("lightpink", -18751);
            hashMap.put("lightsalmon", -24454);
            hashMap.put("lightseagreen", -14634326);
            hashMap.put("lightskyblue", -7876870);
            hashMap.put("lightslategray", -8943463);
            hashMap.put("lightslategrey", -8943463);
            hashMap.put("lightsteelblue", -5192482);
            hashMap.put("lightyellow", -32);
            hashMap.put("lime", -16711936);
            hashMap.put("limegreen", -13447886);
            hashMap.put("linen", -331546);
            hashMap.put("magenta", -65281);
            hashMap.put("maroon", -8388608);
            hashMap.put("mediumaquamarine", -10039894);
            hashMap.put("mediumblue", -16777011);
            hashMap.put("mediumorchid", -4565549);
            hashMap.put("mediumpurple", -7114533);
            hashMap.put("mediumseagreen", -12799119);
            hashMap.put("mediumslateblue", -8689426);
            hashMap.put("mediumspringgreen", -16713062);
            hashMap.put("mediumturquoise", -12004916);
            hashMap.put("mediumvioletred", -3730043);
            hashMap.put("midnightblue", -15132304);
            hashMap.put("mintcream", -655366);
            hashMap.put("mistyrose", -6943);
            hashMap.put("moccasin", -6987);
            hashMap.put("navajowhite", -8531);
            hashMap.put("navy", -16777088);
            hashMap.put("oldlace", -133658);
            hashMap.put("olive", -8355840);
            hashMap.put("olivedrab", -9728477);
            hashMap.put("orange", -23296);
            hashMap.put("orangered", -47872);
            hashMap.put("orchid", -2461482);
            hashMap.put("palegoldenrod", -1120086);
            hashMap.put("palegreen", -6751336);
            hashMap.put("paleturquoise", -5247250);
            hashMap.put("palevioletred", -2396013);
            hashMap.put("papayawhip", -4139);
            hashMap.put("peachpuff", -9543);
            hashMap.put("peru", -3308225);
            hashMap.put("pink", -16181);
            hashMap.put("plum", -2252579);
            hashMap.put("powderblue", -5185306);
            hashMap.put("purple", -8388480);
            hashMap.put("rebeccapurple", -10079335);
            hashMap.put("red", -65536);
            hashMap.put("rosybrown", -4419697);
            hashMap.put("royalblue", -12490271);
            hashMap.put("saddlebrown", -7650029);
            hashMap.put("salmon", -360334);
            hashMap.put("sandybrown", -744352);
            hashMap.put("seagreen", -13726889);
            hashMap.put("seashell", -2578);
            hashMap.put("sienna", -6270419);
            hashMap.put("silver", -4144960);
            hashMap.put("skyblue", -7876885);
            hashMap.put("slateblue", -9807155);
            hashMap.put("slategray", -9404272);
            hashMap.put("slategrey", -9404272);
            hashMap.put("snow", -1286);
            hashMap.put("springgreen", -16711809);
            hashMap.put("steelblue", -12156236);
            hashMap.put("tan", -2968436);
            hashMap.put("teal", -16744320);
            hashMap.put("thistle", -2572328);
            hashMap.put("tomato", -40121);
            hashMap.put("turquoise", -12525360);
            hashMap.put("violet", -1146130);
            hashMap.put("wheat", -663885);
            hashMap.put("white", -1);
            hashMap.put("whitesmoke", -657931);
            hashMap.put("yellow", -256);
            hashMap.put("yellowgreen", -6632142);
            hashMap.put(X3.i.T, 0);
        }

        static Integer a(String str) {
            return a.get(str);
        }
    }

    private static class b {
        private static final Map<String, SVGBase.Length> a;

        static {
            HashMap hashMap = new HashMap(9);
            a = hashMap;
            SVGBase.S s = SVGBase.S.pt;
            hashMap.put("xx-small", new SVGBase.Length(0.694f, s));
            hashMap.put("x-small", new SVGBase.Length(0.833f, s));
            hashMap.put(Constants.SMALL, new SVGBase.Length(10.0f, s));
            hashMap.put(Constants.MEDIUM, new SVGBase.Length(12.0f, s));
            hashMap.put(Constants.LARGE, new SVGBase.Length(14.4f, s));
            hashMap.put("x-large", new SVGBase.Length(17.3f, s));
            hashMap.put("xx-large", new SVGBase.Length(20.7f, s));
            SVGBase.S s2 = SVGBase.S.percent;
            hashMap.put("smaller", new SVGBase.Length(83.33f, s2));
            hashMap.put("larger", new SVGBase.Length(120.0f, s2));
        }

        static SVGBase.Length a(String str) {
            return a.get(str);
        }
    }

    private static class c {
        private static final Map<String, Float> a;

        static {
            HashMap hashMap = new HashMap(9);
            a = hashMap;
            hashMap.put("ultra-condensed", Float.valueOf(50.0f));
            hashMap.put("extra-condensed", Float.valueOf(62.5f));
            hashMap.put("condensed", Float.valueOf(75.0f));
            hashMap.put("semi-condensed", Float.valueOf(87.5f));
            hashMap.put(Constants.NORMAL, Float.valueOf(100.0f));
            hashMap.put("semi-expanded", Float.valueOf(112.5f));
            hashMap.put("expanded", Float.valueOf(125.0f));
            hashMap.put("extra-expanded", Float.valueOf(150.0f));
            hashMap.put("ultra-expanded", Float.valueOf(200.0f));
        }

        static boolean a(String str) {
            return a.containsKey(str);
        }

        static Float b(String str) {
            return a.get(str);
        }
    }

    /* renamed from: com.smaato.sdk.ng.utils.svgparser.utils.d$d, reason: collision with other inner class name */
    private static class C1697d {
        private static final Map<String, Float> a;

        static {
            HashMap hashMap = new HashMap(4);
            a = hashMap;
            hashMap.put(Constants.NORMAL, Float.valueOf(400.0f));
            hashMap.put("bold", Float.valueOf(700.0f));
            hashMap.put("bolder", Float.valueOf(Float.MAX_VALUE));
            hashMap.put("lighter", Float.valueOf(Float.MIN_VALUE));
        }

        static boolean a(String str) {
            return a.containsKey(str);
        }

        static Float b(String str) {
            return a.get(str);
        }
    }

    private class e extends DefaultHandler2 {
        private e() {
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i, int i2) throws SAXException {
            d.this.J(new String(cArr, i, i2));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endDocument() {
            d.this.a();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) throws SAXException {
            d.this.a(str, str2, str3);
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void processingInstruction(String str, String str2) {
            d.this.a(str, (Map<String, String>) d.this.b(new TextScanner(str2)));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startDocument() {
            d.this.b();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            d.this.a(str, str2, str3, attributes);
        }
    }

    enum f {
        CLASS,
        clip,
        clip_path,
        clipPathUnits,
        clip_rule,
        color,
        cx,
        cy,
        direction,
        dx,
        dy,
        fx,
        fy,
        fr,
        d,
        display,
        fill,
        fill_rule,
        fill_opacity,
        font,
        font_family,
        font_feature_settings,
        font_size,
        font_stretch,
        font_style,
        font_weight,
        font_kerning,
        font_variant,
        font_variant_ligatures,
        font_variant_position,
        font_variant_caps,
        font_variant_numeric,
        font_variant_east_asian,
        font_variation_settings,
        glyph_orientation_vertical,
        gradientTransform,
        gradientUnits,
        height,
        href,
        image_rendering,
        isolation,
        letter_spacing,
        marker,
        marker_start,
        marker_mid,
        marker_end,
        markerHeight,
        markerUnits,
        markerWidth,
        mask,
        maskContentUnits,
        maskUnits,
        media,
        mix_blend_mode,
        offset,
        opacity,
        orient,
        overflow,
        pathLength,
        patternContentUnits,
        patternTransform,
        patternUnits,
        points,
        preserveAspectRatio,
        r,
        refX,
        refY,
        requiredFeatures,
        requiredExtensions,
        requiredFormats,
        requiredFonts,
        rx,
        ry,
        solid_color,
        solid_opacity,
        spreadMethod,
        startOffset,
        stop_color,
        stop_opacity,
        stroke,
        stroke_dasharray,
        stroke_dashoffset,
        stroke_linecap,
        stroke_linejoin,
        stroke_miterlimit,
        stroke_opacity,
        stroke_width,
        style,
        systemLanguage,
        text_anchor,
        text_decoration,
        text_orientation,
        transform,
        type,
        vector_effect,
        version,
        viewBox,
        width,
        word_spacing,
        writing_mode,
        x,
        y,
        x1,
        y1,
        x2,
        y2,
        viewport_fill,
        viewport_fill_opacity,
        visibility,
        UNSUPPORTED;

        private static final Map<String, f> g1 = new HashMap();

        static {
            for (f fVar : values()) {
                if (fVar == CLASS) {
                    g1.put(SdksMapping.KEY_INSTALLED_MEDIATION_ADAPTERS_CLASS, fVar);
                } else if (fVar != UNSUPPORTED) {
                    g1.put(fVar.name().replace('_', '-'), fVar);
                }
            }
        }

        public static f a(String str) {
            f fVar = g1.get(str);
            return fVar != null ? fVar : UNSUPPORTED;
        }
    }

    private enum g {
        svg,
        a,
        circle,
        clipPath,
        defs,
        desc,
        ellipse,
        g,
        image,
        line,
        linearGradient,
        marker,
        mask,
        path,
        pattern,
        polygon,
        polyline,
        radialGradient,
        rect,
        solidColor,
        stop,
        style,
        SWITCH,
        symbol,
        text,
        textPath,
        title,
        tref,
        tspan,
        use,
        view,
        UNSUPPORTED;

        private static final Map<String, g> G = new HashMap();

        static {
            for (g gVar : values()) {
                if (gVar == SWITCH) {
                    G.put("switch", gVar);
                } else if (gVar != UNSUPPORTED) {
                    G.put(gVar.name(), gVar);
                }
            }
        }

        public static g a(String str) {
            g gVar = G.get(str);
            return gVar != null ? gVar : UNSUPPORTED;
        }
    }

    d() {
    }

    private void A(Attributes attributes) throws SVGParseException {
        a("<use>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.T t = new SVGBase.T();
        t.a = this.a;
        t.b = this.b;
        a((SVGBase.E) t, attributes);
        b(t, attributes);
        a((SVGBase.InterfaceC5119l) t, attributes);
        a((SVGBase.B) t, attributes);
        a(t, attributes);
        this.b.addChild(t);
        this.b = t;
    }

    private void B(Attributes attributes) throws SVGParseException {
        a("<view>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.I u = new SVGBase.U();
        u.a = this.a;
        u.b = this.b;
        a((SVGBase.E) u, attributes);
        a((SVGBase.B) u, attributes);
        a(u, attributes);
        this.b.addChild(u);
        this.b = u;
    }

    private void C(Attributes attributes) throws SVGParseException {
        a("<switch>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.J j = new SVGBase.J();
        j.a = this.a;
        j.b = this.b;
        a((SVGBase.E) j, attributes);
        b(j, attributes);
        a((SVGBase.InterfaceC5119l) j, attributes);
        a((SVGBase.B) j, attributes);
        this.b.addChild(j);
        this.b = j;
    }

    static Style.TextAnchor D(String str) {
        str.getClass();
        switch (str) {
            case "middle":
                return Style.TextAnchor.Middle;
            case "end":
                return Style.TextAnchor.End;
            case "start":
                return Style.TextAnchor.Start;
            default:
                return null;
        }
    }

    static Style.TextDecoration E(String str) {
        str.getClass();
        switch (str) {
            case "line-through":
                return Style.TextDecoration.LineThrough;
            case "underline":
                return Style.TextDecoration.Underline;
            case "none":
                return Style.TextDecoration.None;
            case "blink":
                return Style.TextDecoration.Blink;
            case "overline":
                return Style.TextDecoration.Overline;
            default:
                return null;
        }
    }

    static Style.TextDirection F(String str) {
        str.getClass();
        if (str.equals("ltr")) {
            return Style.TextDirection.LTR;
        }
        if (str.equals("rtl")) {
            return Style.TextDirection.RTL;
        }
        return null;
    }

    private Matrix G(String str) throws SVGParseException {
        Matrix matrix = new Matrix();
        TextScanner textScanner = new TextScanner(str);
        textScanner.skipWhitespace();
        while (!textScanner.empty()) {
            String f2 = textScanner.f();
            if (f2 == null) {
                throw new SVGParseException("Bad transform function encountered in transform list: " + str);
            }
            switch (f2) {
                case "matrix":
                    textScanner.skipWhitespace();
                    float nextFloat = textScanner.nextFloat();
                    textScanner.skipCommaWhitespace();
                    float nextFloat2 = textScanner.nextFloat();
                    textScanner.skipCommaWhitespace();
                    float nextFloat3 = textScanner.nextFloat();
                    textScanner.skipCommaWhitespace();
                    float nextFloat4 = textScanner.nextFloat();
                    textScanner.skipCommaWhitespace();
                    float nextFloat5 = textScanner.nextFloat();
                    textScanner.skipCommaWhitespace();
                    float nextFloat6 = textScanner.nextFloat();
                    textScanner.skipWhitespace();
                    if (!Float.isNaN(nextFloat6) && textScanner.consume(')')) {
                        Matrix matrix2 = new Matrix();
                        matrix2.setValues(new float[]{nextFloat, nextFloat3, nextFloat5, nextFloat2, nextFloat4, nextFloat6, 0.0f, 0.0f, 1.0f});
                        matrix.preConcat(matrix2);
                        break;
                    } else {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                    break;
                case "rotate":
                    textScanner.skipWhitespace();
                    float nextFloat7 = textScanner.nextFloat();
                    float i = textScanner.i();
                    float i2 = textScanner.i();
                    textScanner.skipWhitespace();
                    if (Float.isNaN(nextFloat7) || !textScanner.consume(')')) {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                    if (Float.isNaN(i)) {
                        matrix.preRotate(nextFloat7);
                        break;
                    } else if (!Float.isNaN(i2)) {
                        matrix.preRotate(nextFloat7, i, i2);
                        break;
                    } else {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                case "scale":
                    textScanner.skipWhitespace();
                    float nextFloat8 = textScanner.nextFloat();
                    float i3 = textScanner.i();
                    textScanner.skipWhitespace();
                    if (!Float.isNaN(nextFloat8) && textScanner.consume(')')) {
                        if (!Float.isNaN(i3)) {
                            matrix.preScale(nextFloat8, i3);
                            break;
                        } else {
                            matrix.preScale(nextFloat8, nextFloat8);
                            break;
                        }
                    } else {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                    break;
                case "skewX":
                    textScanner.skipWhitespace();
                    float nextFloat9 = textScanner.nextFloat();
                    textScanner.skipWhitespace();
                    if (!Float.isNaN(nextFloat9) && textScanner.consume(')')) {
                        matrix.preSkew((float) Math.tan(Math.toRadians(nextFloat9)), 0.0f);
                        break;
                    } else {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                    break;
                case "skewY":
                    textScanner.skipWhitespace();
                    float nextFloat10 = textScanner.nextFloat();
                    textScanner.skipWhitespace();
                    if (!Float.isNaN(nextFloat10) && textScanner.consume(')')) {
                        matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians(nextFloat10)));
                        break;
                    } else {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                case "translate":
                    textScanner.skipWhitespace();
                    float nextFloat11 = textScanner.nextFloat();
                    float i4 = textScanner.i();
                    textScanner.skipWhitespace();
                    if (!Float.isNaN(nextFloat11) && textScanner.consume(')')) {
                        if (!Float.isNaN(i4)) {
                            matrix.preTranslate(nextFloat11, i4);
                            break;
                        } else {
                            matrix.preTranslate(nextFloat11, 0.0f);
                            break;
                        }
                    } else {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                    break;
                default:
                    throw new SVGParseException("Invalid transform list fn: " + f2 + ")");
            }
            if (textScanner.empty()) {
                return matrix;
            }
            textScanner.skipCommaWhitespace();
        }
        return matrix;
    }

    static Style.VectorEffect H(String str) {
        str.getClass();
        if (str.equals("none")) {
            return Style.VectorEffect.None;
        }
        if (str.equals("non-scaling-stroke")) {
            return Style.VectorEffect.NonScalingStroke;
        }
        return null;
    }

    private static SVGBase.C5109b I(String str) throws SVGParseException {
        TextScanner textScanner = new TextScanner(str);
        textScanner.skipWhitespace();
        float nextFloat = textScanner.nextFloat();
        textScanner.skipCommaWhitespace();
        float nextFloat2 = textScanner.nextFloat();
        textScanner.skipCommaWhitespace();
        float nextFloat3 = textScanner.nextFloat();
        textScanner.skipCommaWhitespace();
        float nextFloat4 = textScanner.nextFloat();
        if (Float.isNaN(nextFloat) || Float.isNaN(nextFloat2) || Float.isNaN(nextFloat3) || Float.isNaN(nextFloat4)) {
            throw new SVGParseException("Invalid viewBox definition - should have four numbers");
        }
        if (nextFloat3 < 0.0f) {
            throw new SVGParseException("Invalid viewBox. width cannot be negative");
        }
        if (nextFloat4 >= 0.0f) {
            return new SVGBase.C5109b(nextFloat, nextFloat2, nextFloat3, nextFloat4);
        }
        throw new SVGParseException("Invalid viewBox. height cannot be negative");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J(String str) throws SVGParseException {
        if (this.e) {
            return;
        }
        if (this.g) {
            if (this.i == null) {
                this.i = new StringBuilder(str.length());
            }
            this.i.append(str);
        } else if (this.j) {
            if (this.k == null) {
                this.k = new StringBuilder(str.length());
            }
            this.k.append(str);
        } else if (this.b instanceof SVGBase.TextContainer) {
            a(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
    }

    private void a(String str, Object... objArr) {
    }

    private static float b(float f2, float f3, float f4) {
        float f5;
        if (f4 < 0.0f) {
            f4 += 6.0f;
        }
        if (f4 >= 6.0f) {
            f4 -= 6.0f;
        }
        if (f4 < 1.0f) {
            f5 = (f3 - f2) * f4;
        } else {
            if (f4 < 3.0f) {
                return f3;
            }
            if (f4 >= 4.0f) {
                return f2;
            }
            f5 = (f3 - f2) * (4.0f - f4);
        }
        return f5 + f2;
    }

    private void c(InputStream inputStream) throws SVGParseException {
        try {
            XmlPullParser newPullParser = Xml.newPullParser();
            h hVar = new h(newPullParser);
            newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
            newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
            newPullParser.setInput(inputStream, null);
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.nextToken()) {
                if (eventType == 0) {
                    b();
                } else if (eventType == 8) {
                    TextScanner textScanner = new TextScanner(newPullParser.getText());
                    a(textScanner.nextToken(), b(textScanner));
                } else if (eventType == 2) {
                    String name = newPullParser.getName();
                    if (newPullParser.getPrefix() != null) {
                        name = newPullParser.getPrefix() + ':' + name;
                    }
                    a(newPullParser.getNamespace(), newPullParser.getName(), name, hVar);
                } else if (eventType == 3) {
                    String name2 = newPullParser.getName();
                    if (newPullParser.getPrefix() != null) {
                        name2 = newPullParser.getPrefix() + ':' + name2;
                    }
                    a(newPullParser.getNamespace(), newPullParser.getName(), name2);
                } else if (eventType == 4) {
                    int[] iArr = new int[2];
                    a(newPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                } else if (eventType == 5) {
                    J(newPullParser.getText());
                } else if (eventType == 6) {
                    J(newPullParser.getText());
                }
            }
            a();
        } catch (IOException e2) {
            throw new SVGParseException("Stream error", e2);
        } catch (XmlPullParserException e3) {
            throw new SVGParseException("XML parser problem", e3);
        }
    }

    private void d(Attributes attributes) throws SVGParseException {
        a("<defs>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.C5113f c5113f = new SVGBase.C5113f();
        c5113f.a = this.a;
        c5113f.b = this.b;
        a((SVGBase.E) c5113f, attributes);
        b(c5113f, attributes);
        a((SVGBase.InterfaceC5119l) c5113f, attributes);
        this.b.addChild(c5113f);
        this.b = c5113f;
    }

    private void e(Attributes attributes) throws SVGParseException {
        a("<ellipse>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.C5114g c5114g = new SVGBase.C5114g();
        c5114g.a = this.a;
        c5114g.b = this.b;
        a((SVGBase.E) c5114g, attributes);
        b(c5114g, attributes);
        a((SVGBase.InterfaceC5119l) c5114g, attributes);
        a((SVGBase.B) c5114g, attributes);
        a(c5114g, attributes);
        this.b.addChild(c5114g);
    }

    private void f(Attributes attributes) throws SVGParseException {
        a("<g>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.C5118k c5118k = new SVGBase.C5118k();
        c5118k.a = this.a;
        c5118k.b = this.b;
        a((SVGBase.E) c5118k, attributes);
        b(c5118k, attributes);
        a((SVGBase.InterfaceC5119l) c5118k, attributes);
        a((SVGBase.B) c5118k, attributes);
        this.b.addChild(c5118k);
        this.b = c5118k;
    }

    private void g(Attributes attributes) throws SVGParseException {
        a("<image>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.C5120m c5120m = new SVGBase.C5120m();
        c5120m.a = this.a;
        c5120m.b = this.b;
        a((SVGBase.E) c5120m, attributes);
        b(c5120m, attributes);
        a((SVGBase.InterfaceC5119l) c5120m, attributes);
        a((SVGBase.B) c5120m, attributes);
        a(c5120m, attributes);
        this.b.addChild(c5120m);
        this.b = c5120m;
    }

    private void h(Attributes attributes) throws SVGParseException {
        a("<line>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.C5121n c5121n = new SVGBase.C5121n();
        c5121n.a = this.a;
        c5121n.b = this.b;
        a((SVGBase.E) c5121n, attributes);
        b(c5121n, attributes);
        a((SVGBase.InterfaceC5119l) c5121n, attributes);
        a((SVGBase.B) c5121n, attributes);
        a(c5121n, attributes);
        this.b.addChild(c5121n);
    }

    private void i(Attributes attributes) throws SVGParseException {
        a("<linearGradient>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.F f2 = new SVGBase.F();
        f2.a = this.a;
        f2.b = this.b;
        a((SVGBase.E) f2, attributes);
        b(f2, attributes);
        a((SVGBase.AbstractC5115h) f2, attributes);
        a(f2, attributes);
        this.b.addChild(f2);
        this.b = f2;
    }

    private void j(Attributes attributes) throws SVGParseException {
        a("<marker>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.C5122o c5122o = new SVGBase.C5122o();
        c5122o.a = this.a;
        c5122o.b = this.b;
        a((SVGBase.E) c5122o, attributes);
        b(c5122o, attributes);
        a((SVGBase.B) c5122o, attributes);
        a((SVGBase.I) c5122o, attributes);
        a(c5122o, attributes);
        this.b.addChild(c5122o);
        this.b = c5122o;
    }

    private void k(Attributes attributes) throws SVGParseException {
        a("<mask>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.C5123p c5123p = new SVGBase.C5123p();
        c5123p.a = this.a;
        c5123p.b = this.b;
        a((SVGBase.E) c5123p, attributes);
        b(c5123p, attributes);
        a((SVGBase.B) c5123p, attributes);
        a(c5123p, attributes);
        this.b.addChild(c5123p);
        this.b = c5123p;
    }

    private void l(Attributes attributes) throws SVGParseException {
        a("<path>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.C5126s c5126s = new SVGBase.C5126s();
        c5126s.a = this.a;
        c5126s.b = this.b;
        a((SVGBase.E) c5126s, attributes);
        b(c5126s, attributes);
        a((SVGBase.InterfaceC5119l) c5126s, attributes);
        a((SVGBase.B) c5126s, attributes);
        a(c5126s, attributes);
        this.b.addChild(c5126s);
    }

    private void m(Attributes attributes) throws SVGParseException {
        a("<pattern>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.v vVar = new SVGBase.v();
        vVar.a = this.a;
        vVar.b = this.b;
        a((SVGBase.E) vVar, attributes);
        b(vVar, attributes);
        a((SVGBase.B) vVar, attributes);
        a((SVGBase.I) vVar, attributes);
        a(vVar, attributes);
        this.b.addChild(vVar);
        this.b = vVar;
    }

    private void n(Attributes attributes) throws SVGParseException {
        a("<polygon>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.w xVar = new SVGBase.x();
        xVar.a = this.a;
        xVar.b = this.b;
        a((SVGBase.E) xVar, attributes);
        b(xVar, attributes);
        a((SVGBase.InterfaceC5119l) xVar, attributes);
        a((SVGBase.B) xVar, attributes);
        a(xVar, attributes, "polygon");
        this.b.addChild(xVar);
    }

    private void o(Attributes attributes) throws SVGParseException {
        a("<polyline>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.w wVar = new SVGBase.w();
        wVar.a = this.a;
        wVar.b = this.b;
        a((SVGBase.E) wVar, attributes);
        b(wVar, attributes);
        a((SVGBase.InterfaceC5119l) wVar, attributes);
        a((SVGBase.B) wVar, attributes);
        a(wVar, attributes, "polyline");
        this.b.addChild(wVar);
    }

    private void p(Attributes attributes) throws SVGParseException {
        a("<radialGradient>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.H h2 = new SVGBase.H();
        h2.a = this.a;
        h2.b = this.b;
        a((SVGBase.E) h2, attributes);
        b(h2, attributes);
        a((SVGBase.AbstractC5115h) h2, attributes);
        a(h2, attributes);
        this.b.addChild(h2);
        this.b = h2;
    }

    private void q(Attributes attributes) throws SVGParseException {
        a("<rect>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.y yVar = new SVGBase.y();
        yVar.a = this.a;
        yVar.b = this.b;
        a((SVGBase.E) yVar, attributes);
        b(yVar, attributes);
        a((SVGBase.InterfaceC5119l) yVar, attributes);
        a((SVGBase.B) yVar, attributes);
        a(yVar, attributes);
        this.b.addChild(yVar);
    }

    private void r(Attributes attributes) throws SVGParseException {
        a("<solidColor>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.z zVar = new SVGBase.z();
        zVar.a = this.a;
        zVar.b = this.b;
        a(zVar, attributes);
        b(zVar, attributes);
        this.b.addChild(zVar);
        this.b = zVar;
    }

    private void s(Attributes attributes) throws SVGParseException {
        a("<stop>", new Object[0]);
        SVGBase.SvgContainer svgContainer = this.b;
        if (svgContainer == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        if (!(svgContainer instanceof SVGBase.AbstractC5115h)) {
            throw new SVGParseException("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
        }
        SVGBase.A a2 = new SVGBase.A();
        a2.a = this.a;
        a2.b = this.b;
        a((SVGBase.E) a2, attributes);
        b(a2, attributes);
        a(a2, attributes);
        this.b.addChild(a2);
        this.b = a2;
    }

    static Boolean t(String str) {
        str.getClass();
        switch (str) {
            case "hidden":
            case "scroll":
                return Boolean.FALSE;
            case "auto":
            case "visible":
                return Boolean.TRUE;
            default:
                return null;
        }
    }

    private void u(Attributes attributes) throws SVGParseException {
        a("<svg>", new Object[0]);
        SVGBase.Svg svg = new SVGBase.Svg();
        svg.a = this.a;
        svg.b = this.b;
        a((SVGBase.E) svg, attributes);
        b(svg, attributes);
        a((SVGBase.B) svg, attributes);
        a((SVGBase.I) svg, attributes);
        a(svg, attributes);
        SVGBase.SvgContainer svgContainer = this.b;
        if (svgContainer == null) {
            this.a.a(svg);
        } else {
            svgContainer.addChild(svg);
        }
        this.b = svg;
    }

    private void v(Attributes attributes) throws SVGParseException {
        a("<symbol>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.I k = new SVGBase.K();
        k.a = this.a;
        k.b = this.b;
        a((SVGBase.E) k, attributes);
        b(k, attributes);
        a((SVGBase.B) k, attributes);
        a(k, attributes);
        this.b.addChild(k);
        this.b = k;
    }

    private void w(Attributes attributes) throws SVGParseException {
        a("<text>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.N n = new SVGBase.N();
        n.a = this.a;
        n.b = this.b;
        a((SVGBase.E) n, attributes);
        b(n, attributes);
        a((SVGBase.InterfaceC5119l) n, attributes);
        a((SVGBase.B) n, attributes);
        a((SVGBase.Q) n, attributes);
        this.b.addChild(n);
        this.b = n;
    }

    private void x(Attributes attributes) throws SVGParseException {
        a("<textPath>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.P p = new SVGBase.P();
        p.a = this.a;
        p.b = this.b;
        a((SVGBase.E) p, attributes);
        b(p, attributes);
        a((SVGBase.B) p, attributes);
        a(p, attributes);
        this.b.addChild(p);
        this.b = p;
        SVGBase.SvgContainer svgContainer = p.b;
        if (svgContainer instanceof SVGBase.R) {
            p.setTextRoot((SVGBase.R) svgContainer);
        } else {
            p.setTextRoot(((SVGBase.O) svgContainer).getTextRoot());
        }
    }

    private void y(Attributes attributes) throws SVGParseException {
        a("<tref>", new Object[0]);
        SVGBase.SvgContainer svgContainer = this.b;
        if (svgContainer == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        if (!(svgContainer instanceof SVGBase.TextContainer)) {
            throw new SVGParseException("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
        }
        SVGBase.L l2 = new SVGBase.L();
        l2.a = this.a;
        l2.b = this.b;
        a((SVGBase.E) l2, attributes);
        b(l2, attributes);
        a((SVGBase.B) l2, attributes);
        a(l2, attributes);
        this.b.addChild(l2);
        SVGBase.SvgContainer svgContainer2 = l2.b;
        if (svgContainer2 instanceof SVGBase.R) {
            l2.setTextRoot((SVGBase.R) svgContainer2);
        } else {
            l2.setTextRoot(((SVGBase.O) svgContainer2).getTextRoot());
        }
    }

    private void z(Attributes attributes) throws SVGParseException {
        a("<tspan>", new Object[0]);
        SVGBase.SvgContainer svgContainer = this.b;
        if (svgContainer == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        if (!(svgContainer instanceof SVGBase.TextContainer)) {
            throw new SVGParseException("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
        }
        SVGBase.M m2 = new SVGBase.M();
        m2.a = this.a;
        m2.b = this.b;
        a((SVGBase.E) m2, attributes);
        b(m2, attributes);
        a((SVGBase.B) m2, attributes);
        a((SVGBase.Q) m2, attributes);
        this.b.addChild(m2);
        this.b = m2;
        SVGBase.SvgContainer svgContainer2 = m2.b;
        if (svgContainer2 instanceof SVGBase.R) {
            m2.setTextRoot((SVGBase.R) svgContainer2);
        } else {
            m2.setTextRoot(((SVGBase.O) svgContainer2).getTextRoot());
        }
    }

    private static class h implements Attributes {
        private final XmlPullParser a;

        public h(XmlPullParser xmlPullParser) {
            this.a = xmlPullParser;
        }

        @Override // org.xml.sax.Attributes
        public int getIndex(String str) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public int getIndex(String str, String str2) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public int getLength() {
            return this.a.getAttributeCount();
        }

        @Override // org.xml.sax.Attributes
        public String getLocalName(int i) {
            return this.a.getAttributeName(i);
        }

        @Override // org.xml.sax.Attributes
        public String getQName(int i) {
            String attributeName = this.a.getAttributeName(i);
            if (this.a.getAttributePrefix(i) == null) {
                return attributeName;
            }
            return this.a.getAttributePrefix(i) + ':' + attributeName;
        }

        @Override // org.xml.sax.Attributes
        public String getType(int i) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getType(String str) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getType(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getURI(int i) {
            return this.a.getAttributeNamespace(i);
        }

        @Override // org.xml.sax.Attributes
        public String getValue(String str) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getValue(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getValue(int i) {
            return this.a.getAttributeValue(i);
        }
    }

    private void b(InputStream inputStream) throws SVGParseException {
        try {
            SAXParserFactory newInstance = SAXParserFactory.newInstance();
            if (!l) {
                newInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
                newInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            }
            XMLReader xMLReader = newInstance.newSAXParser().getXMLReader();
            e eVar = new e();
            xMLReader.setContentHandler(eVar);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", eVar);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e2) {
            throw new SVGParseException("Stream error", e2);
        } catch (ParserConfigurationException e3) {
            throw new SVGParseException("XML parser problem", e3);
        } catch (SAXException e4) {
            throw new SVGParseException("SVG parse error", e4);
        }
    }

    @Override // com.smaato.sdk.ng.utils.svgparser.utils.c
    public SVGBase a(InputStream inputStream) throws SVGParseException {
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        try {
            inputStream.mark(3);
            int read = inputStream.read() + (inputStream.read() << 8);
            inputStream.reset();
            if (read == 35615) {
                inputStream = new BufferedInputStream(new GZIPInputStream(inputStream));
            }
        } catch (IOException unused) {
        }
        try {
            try {
                if (l) {
                    a("Forcing SAX parser for this version of Android", new Object[0]);
                    b(inputStream);
                    return this.a;
                }
                if (this.c) {
                    inputStream.mark(4096);
                    byte[] bArr = new byte[4096];
                    String str = new String(bArr, 0, inputStream.read(bArr));
                    inputStream.reset();
                    if (str.contains("<!ENTITY ")) {
                        a("Switching to SAX parser to process entities", new Object[0]);
                        b(inputStream);
                        SVGBase sVGBase = this.a;
                        try {
                            inputStream.close();
                        } catch (IOException unused2) {
                            Log.e("SVGParser", "Exception thrown closing input stream");
                        }
                        return sVGBase;
                    }
                }
                c(inputStream);
                SVGBase sVGBase2 = this.a;
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                    Log.e("SVGParser", "Exception thrown closing input stream");
                }
                return sVGBase2;
            } finally {
                try {
                    inputStream.close();
                } catch (IOException unused4) {
                    Log.e("SVGParser", "Exception thrown closing input stream");
                }
            }
        } catch (IOException e2) {
            Log.e("SVGParser", "Error occurred while performing check for entities.  File may not be parsed correctly if it contains entity definitions.", e2);
            c(inputStream);
            SVGBase sVGBase3 = this.a;
            try {
                inputStream.close();
            } catch (IOException unused5) {
                Log.e("SVGParser", "Exception thrown closing input stream");
            }
            return sVGBase3;
        }
    }

    private void t(Attributes attributes) throws SVGParseException {
        a("<style>", new Object[0]);
        if (this.b != null) {
            String str = "all";
            boolean z = true;
            for (int i = 0; i < attributes.getLength(); i++) {
                String trim = attributes.getValue(i).trim();
                int ordinal = f.a(attributes.getLocalName(i)).ordinal();
                if (ordinal == 52) {
                    str = trim;
                } else if (ordinal == 93) {
                    z = trim.equals("text/css");
                }
            }
            if (z && CSSParser.a(str, CSSParser.d.screen)) {
                this.j = true;
                return;
            } else {
                this.e = true;
                this.f = 1;
                return;
            }
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    static SVGBase.Length r(String str) {
        if (Constants.NORMAL.equals(str)) {
            return SVGBase.Length.c;
        }
        try {
            SVGBase.Length p = p(str);
            if (p.b == SVGBase.S.percent) {
                return null;
            }
            return p;
        } catch (SVGParseException unused) {
            return null;
        }
    }

    static Style.LineJoin B(String str) {
        if ("miter".equals(str)) {
            return Style.LineJoin.Miter;
        }
        if ("round".equals(str)) {
            return Style.LineJoin.Round;
        }
        if ("bevel".equals(str)) {
            return Style.LineJoin.Bevel;
        }
        return null;
    }

    static SVGBase.Colour d(String str) {
        if (str.charAt(0) == '#') {
            com.smaato.sdk.ng.utils.svgparser.utils.a a2 = com.smaato.sdk.ng.utils.svgparser.utils.a.a(str, 1, str.length());
            if (a2 == null) {
                return SVGBase.Colour.b;
            }
            int a3 = a2.a();
            if (a3 == 4) {
                int b2 = a2.b();
                int i = b2 & 3840;
                int i2 = b2 & 240;
                int i3 = b2 & 15;
                return new SVGBase.Colour(i3 | (i << 8) | (-16777216) | (i << 12) | (i2 << 8) | (i2 << 4) | (i3 << 4));
            }
            if (a3 != 5) {
                if (a3 == 7) {
                    return new SVGBase.Colour(a2.b() | (-16777216));
                }
                if (a3 != 9) {
                    return SVGBase.Colour.b;
                }
                return new SVGBase.Colour((a2.b() >>> 8) | (a2.b() << 24));
            }
            int b3 = a2.b();
            int i4 = 61440 & b3;
            int i5 = b3 & 3840;
            int i6 = b3 & 240;
            int i7 = b3 & 15;
            return new SVGBase.Colour((i7 << 24) | (i7 << 28) | (i4 << 8) | (i4 << 4) | (i5 << 4) | i5 | i6 | (i6 >> 4));
        }
        String lowerCase = str.toLowerCase(Locale.US);
        boolean startsWith = lowerCase.startsWith("rgba(");
        float f2 = Float.NaN;
        if (!startsWith && !lowerCase.startsWith("rgb(")) {
            boolean startsWith2 = lowerCase.startsWith("hsla(");
            if (startsWith2 || lowerCase.startsWith("hsl(")) {
                TextScanner textScanner = new TextScanner(str.substring(startsWith2 ? 5 : 4));
                textScanner.skipWhitespace();
                float nextFloat = textScanner.nextFloat();
                if (!Float.isNaN(nextFloat)) {
                    textScanner.consume("deg");
                    boolean skipCommaWhitespace = textScanner.skipCommaWhitespace();
                    float nextFloat2 = textScanner.nextFloat();
                    if (!Float.isNaN(nextFloat2)) {
                        if (!textScanner.consume('%')) {
                            return SVGBase.Colour.b;
                        }
                        if (skipCommaWhitespace) {
                            if (!textScanner.skipCommaWhitespace()) {
                                return SVGBase.Colour.b;
                            }
                        } else {
                            textScanner.skipWhitespace();
                        }
                        float nextFloat3 = textScanner.nextFloat();
                        if (!Float.isNaN(nextFloat3)) {
                            if (!textScanner.consume('%')) {
                                return SVGBase.Colour.b;
                            }
                            if (skipCommaWhitespace) {
                                if (textScanner.skipCommaWhitespace()) {
                                    f2 = textScanner.nextFloat();
                                }
                            } else {
                                textScanner.skipWhitespace();
                                if (textScanner.consume('/')) {
                                    textScanner.skipWhitespace();
                                    f2 = textScanner.nextFloat();
                                }
                            }
                            textScanner.skipWhitespace();
                            if (!textScanner.consume(')')) {
                                return SVGBase.Colour.b;
                            }
                            if (Float.isNaN(f2)) {
                                return new SVGBase.Colour(a(nextFloat, nextFloat2, nextFloat3) | (-16777216));
                            }
                            return new SVGBase.Colour(a(nextFloat, nextFloat2, nextFloat3) | (a(f2 * 256.0f) << 24));
                        }
                    }
                }
            }
        } else {
            TextScanner textScanner2 = new TextScanner(str.substring(startsWith ? 5 : 4));
            textScanner2.skipWhitespace();
            float nextFloat4 = textScanner2.nextFloat();
            if (!Float.isNaN(nextFloat4)) {
                if (textScanner2.consume('%')) {
                    nextFloat4 = (nextFloat4 * 256.0f) / 100.0f;
                }
                boolean skipCommaWhitespace2 = textScanner2.skipCommaWhitespace();
                float nextFloat5 = textScanner2.nextFloat();
                if (!Float.isNaN(nextFloat5)) {
                    if (textScanner2.consume('%')) {
                        nextFloat5 = (nextFloat5 * 256.0f) / 100.0f;
                    }
                    if (skipCommaWhitespace2) {
                        if (!textScanner2.skipCommaWhitespace()) {
                            return SVGBase.Colour.b;
                        }
                    } else {
                        textScanner2.skipWhitespace();
                    }
                    float nextFloat6 = textScanner2.nextFloat();
                    if (!Float.isNaN(nextFloat6)) {
                        if (textScanner2.consume('%')) {
                            nextFloat6 = (nextFloat6 * 256.0f) / 100.0f;
                        }
                        if (skipCommaWhitespace2) {
                            if (textScanner2.skipCommaWhitespace()) {
                                f2 = textScanner2.nextFloat();
                            }
                        } else {
                            textScanner2.skipWhitespace();
                            if (textScanner2.consume('/')) {
                                textScanner2.skipWhitespace();
                                f2 = textScanner2.nextFloat();
                            }
                        }
                        textScanner2.skipWhitespace();
                        if (!textScanner2.consume(')')) {
                            return SVGBase.Colour.b;
                        }
                        if (Float.isNaN(f2)) {
                            return new SVGBase.Colour((a(nextFloat4) << 16) | (-16777216) | (a(nextFloat5) << 8) | a(nextFloat6));
                        }
                        return new SVGBase.Colour((a(nextFloat4) << 16) | (a(f2 * 256.0f) << 24) | (a(nextFloat5) << 8) | a(nextFloat6));
                    }
                }
            }
        }
        return e(lowerCase);
    }

    private static Set<String> C(String str) {
        TextScanner textScanner = new TextScanner(str);
        HashSet hashSet = new HashSet();
        while (!textScanner.empty()) {
            String nextToken = textScanner.nextToken();
            int indexOf = nextToken.indexOf(45);
            if (indexOf != -1) {
                nextToken = nextToken.substring(0, indexOf);
            }
            hashSet.add(new Locale(nextToken, "", "").getLanguage());
            textScanner.skipWhitespace();
        }
        return hashSet;
    }

    private static SVGBase.Colour e(String str) {
        Integer a2 = a.a(str);
        return a2 == null ? SVGBase.Colour.b : new SVGBase.Colour(a2.intValue());
    }

    private static SVGBase.SvgPaint f(String str) {
        str.getClass();
        if (str.equals("none")) {
            return SVGBase.Colour.c;
        }
        if (!str.equals("currentColor")) {
            return d(str);
        }
        return SVGBase.C5112e.a();
    }

    static float h(String str) throws SVGParseException {
        int length = str.length();
        if (length != 0) {
            return a(str, 0, length);
        }
        throw new SVGParseException("Invalid float value (empty string)");
    }

    static List<String> i(String str) {
        TextScanner textScanner = new TextScanner(str);
        ArrayList arrayList = null;
        do {
            String nextQuotedString = textScanner.nextQuotedString();
            if (nextQuotedString == null) {
                nextQuotedString = textScanner.a(',');
            }
            if (nextQuotedString == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(nextQuotedString);
            textScanner.skipCommaWhitespace();
        } while (!textScanner.empty());
        return arrayList;
    }

    static Float k(String str) {
        Float b2 = c.b(str);
        if (b2 != null) {
            return b2;
        }
        TextScanner textScanner = new TextScanner(str);
        float nextFloat = textScanner.nextFloat();
        Float valueOf = Float.valueOf(nextFloat);
        if (!textScanner.consume('%')) {
            return null;
        }
        textScanner.skipWhitespace();
        if (textScanner.empty() && nextFloat >= 0.0f) {
            return valueOf;
        }
        return null;
    }

    static Style.FontStyle l(String str) {
        str.getClass();
        switch (str) {
            case "oblique":
                return Style.FontStyle.oblique;
            case "italic":
                return Style.FontStyle.italic;
            case "normal":
                return Style.FontStyle.normal;
            default:
                return null;
        }
    }

    private Float n(String str) throws SVGParseException {
        if (str.length() != 0) {
            int length = str.length();
            boolean z = true;
            if (str.charAt(str.length() - 1) == '%') {
                length--;
            } else {
                z = false;
            }
            try {
                float a2 = a(str, 0, length);
                float f2 = 100.0f;
                if (z) {
                    a2 /= 100.0f;
                }
                if (a2 < 0.0f) {
                    f2 = 0.0f;
                } else if (a2 <= 100.0f) {
                    f2 = a2;
                }
                return Float.valueOf(f2);
            } catch (NumberFormatException e2) {
                throw new SVGParseException("Invalid offset value in <stop>: " + str, e2);
            }
        }
        throw new SVGParseException("Invalid offset value in <stop> (empty string)");
    }

    static Style.Isolation o(String str) {
        str.getClass();
        if (str.equals("auto")) {
            return Style.Isolation.auto;
        }
        if (str.equals("isolate")) {
            return Style.Isolation.isolate;
        }
        return null;
    }

    static SVGBase.Length p(String str) throws SVGParseException {
        if (str.length() != 0) {
            int length = str.length();
            SVGBase.S s = SVGBase.S.px;
            char charAt = str.charAt(length - 1);
            if (charAt == '%') {
                length--;
                s = SVGBase.S.percent;
            } else if (length > 2 && Character.isLetter(charAt) && Character.isLetter(str.charAt(length - 2))) {
                length -= 2;
                try {
                    s = SVGBase.S.valueOf(str.substring(length).toLowerCase(Locale.US));
                } catch (IllegalArgumentException unused) {
                    throw new SVGParseException("Invalid length unit specifier: " + str);
                }
            }
            try {
                return new SVGBase.Length(a(str, 0, length), s);
            } catch (NumberFormatException e2) {
                throw new SVGParseException("Invalid length value: " + str, e2);
            }
        }
        throw new SVGParseException("Invalid length value (empty string)");
    }

    private static List<SVGBase.Length> q(String str) throws SVGParseException {
        if (str.length() != 0) {
            ArrayList arrayList = new ArrayList(1);
            TextScanner textScanner = new TextScanner(str);
            textScanner.skipWhitespace();
            while (!textScanner.empty()) {
                float nextFloat = textScanner.nextFloat();
                if (!Float.isNaN(nextFloat)) {
                    SVGBase.S h2 = textScanner.h();
                    if (h2 == null) {
                        h2 = SVGBase.S.px;
                    }
                    arrayList.add(new SVGBase.Length(nextFloat, h2));
                    textScanner.skipCommaWhitespace();
                } else {
                    throw new SVGParseException("Invalid length list value: " + textScanner.b());
                }
            }
            return arrayList;
        }
        throw new SVGParseException("Invalid length list (empty string)");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0287 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected static SVGBase.C5127t v(String str) {
        float a2;
        float f2;
        float f3;
        float f4;
        TextScanner textScanner = new TextScanner(str);
        SVGBase.C5127t c5127t = new SVGBase.C5127t();
        if (!textScanner.empty()) {
            int intValue = textScanner.d().intValue();
            int i = 109;
            if (intValue == 77 || intValue == 109) {
                int i2 = intValue;
                float f5 = 0.0f;
                float f6 = 0.0f;
                float f7 = 0.0f;
                float f8 = 0.0f;
                float f9 = 0.0f;
                float f10 = 0.0f;
                while (true) {
                    textScanner.skipWhitespace();
                    switch (i2) {
                        case 65:
                        case 97:
                            float nextFloat = textScanner.nextFloat();
                            float a3 = textScanner.a(nextFloat);
                            float a4 = textScanner.a(a3);
                            Boolean a5 = textScanner.a(Float.valueOf(a4));
                            Boolean a6 = textScanner.a((Object) a5);
                            float a7 = textScanner.a(a6);
                            float a8 = textScanner.a(a7);
                            if (!Float.isNaN(a8) && nextFloat >= 0.0f && a3 >= 0.0f) {
                                if (i2 == 97) {
                                    a7 += f6;
                                    a8 += f5;
                                }
                                c5127t.arcTo(nextFloat, a3, a4, a5.booleanValue(), a6.booleanValue(), a7, a8);
                                f6 = a7;
                                f7 = f6;
                                f5 = a8;
                                f8 = f5;
                                textScanner.skipCommaWhitespace();
                                if (!textScanner.empty()) {
                                    break;
                                } else {
                                    if (textScanner.c()) {
                                        i2 = textScanner.d().intValue();
                                    }
                                    i = 109;
                                }
                            }
                            break;
                        case 67:
                        case 99:
                            float nextFloat2 = textScanner.nextFloat();
                            float a9 = textScanner.a(nextFloat2);
                            float a10 = textScanner.a(a9);
                            float a11 = textScanner.a(a10);
                            float a12 = textScanner.a(a11);
                            a2 = textScanner.a(a12);
                            if (Float.isNaN(a2)) {
                                Log.e("SVGParser", "Bad path coords for " + ((char) i2) + " path segment");
                                break;
                            } else {
                                if (i2 == 99) {
                                    a12 += f6;
                                    a2 += f5;
                                    nextFloat2 += f6;
                                    a9 += f5;
                                    a10 += f6;
                                    a11 += f5;
                                }
                                f2 = a11;
                                f3 = a12;
                                f4 = a10;
                                c5127t.cubicTo(nextFloat2, a9, f4, f2, f3, a2);
                                f8 = f2;
                                f7 = f4;
                                f6 = f3;
                                f5 = a2;
                                textScanner.skipCommaWhitespace();
                                if (!textScanner.empty()) {
                                }
                            }
                            break;
                        case TokenParametersOuterClass$TokenParameters.MEDIAMUTED_FIELD_NUMBER /* 72 */:
                        case 104:
                            float nextFloat3 = textScanner.nextFloat();
                            if (Float.isNaN(nextFloat3)) {
                                Log.e("SVGParser", "Bad path coords for " + ((char) i2) + " path segment");
                                break;
                            } else {
                                if (i2 == 104) {
                                    nextFloat3 += f6;
                                }
                                f6 = nextFloat3;
                                c5127t.lineTo(f6, f5);
                                f8 = f5;
                                f7 = f6;
                                textScanner.skipCommaWhitespace();
                                if (!textScanner.empty()) {
                                }
                            }
                            break;
                        case TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER /* 76 */:
                        case 108:
                            float nextFloat4 = textScanner.nextFloat();
                            float a13 = textScanner.a(nextFloat4);
                            if (Float.isNaN(a13)) {
                                Log.e("SVGParser", "Bad path coords for " + ((char) i2) + " path segment");
                                break;
                            } else {
                                if (i2 == 108) {
                                    nextFloat4 += f6;
                                    a13 += f5;
                                }
                                f6 = nextFloat4;
                                f5 = a13;
                                c5127t.lineTo(f6, f5);
                                f8 = f5;
                                f7 = f6;
                                textScanner.skipCommaWhitespace();
                                if (!textScanner.empty()) {
                                }
                            }
                            break;
                        case TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER /* 77 */:
                        case 109:
                            float nextFloat5 = textScanner.nextFloat();
                            float a14 = textScanner.a(nextFloat5);
                            if (Float.isNaN(a14)) {
                                Log.e("SVGParser", "Bad path coords for " + ((char) i2) + " path segment");
                                break;
                            } else {
                                if (i2 == i && !c5127t.a()) {
                                    nextFloat5 += f6;
                                    a14 += f5;
                                }
                                f6 = nextFloat5;
                                f5 = a14;
                                c5127t.moveTo(f6, f5);
                                f8 = f5;
                                f10 = f8;
                                f7 = f6;
                                f9 = f7;
                                i2 = i2 != i ? 76 : 108;
                                textScanner.skipCommaWhitespace();
                                if (!textScanner.empty()) {
                                }
                            }
                            break;
                        case 81:
                        case 113:
                            float nextFloat6 = textScanner.nextFloat();
                            float a15 = textScanner.a(nextFloat6);
                            float a16 = textScanner.a(a15);
                            float a17 = textScanner.a(a16);
                            if (Float.isNaN(a17)) {
                                Log.e("SVGParser", "Bad path coords for " + ((char) i2) + " path segment");
                                break;
                            } else {
                                if (i2 == 113) {
                                    a16 += f6;
                                    a17 += f5;
                                    nextFloat6 += f6;
                                    a15 += f5;
                                }
                                float f11 = nextFloat6;
                                float f12 = a15;
                                c5127t.quadTo(f11, f12, a16, a17);
                                f8 = f12;
                                f7 = f11;
                                f6 = a16;
                                f5 = a17;
                                textScanner.skipCommaWhitespace();
                                if (!textScanner.empty()) {
                                }
                            }
                            break;
                        case 83:
                        case 115:
                            float f13 = (f6 * 2.0f) - f7;
                            float f14 = (2.0f * f5) - f8;
                            float nextFloat7 = textScanner.nextFloat();
                            float a18 = textScanner.a(nextFloat7);
                            float a19 = textScanner.a(a18);
                            a2 = textScanner.a(a19);
                            if (Float.isNaN(a2)) {
                                Log.e("SVGParser", "Bad path coords for " + ((char) i2) + " path segment");
                                break;
                            } else {
                                if (i2 == 115) {
                                    a19 += f6;
                                    a2 += f5;
                                    nextFloat7 += f6;
                                    a18 += f5;
                                }
                                f2 = a18;
                                f3 = a19;
                                f4 = nextFloat7;
                                c5127t.cubicTo(f13, f14, f4, f2, f3, a2);
                                f8 = f2;
                                f7 = f4;
                                f6 = f3;
                                f5 = a2;
                                textScanner.skipCommaWhitespace();
                                if (!textScanner.empty()) {
                                }
                            }
                            break;
                        case 84:
                        case 116:
                            float f15 = (f6 * 2.0f) - f7;
                            float f16 = (2.0f * f5) - f8;
                            float nextFloat8 = textScanner.nextFloat();
                            float a20 = textScanner.a(nextFloat8);
                            if (Float.isNaN(a20)) {
                                Log.e("SVGParser", "Bad path coords for " + ((char) i2) + " path segment");
                                break;
                            } else {
                                if (i2 == 116) {
                                    nextFloat8 += f6;
                                    a20 += f5;
                                }
                                f6 = nextFloat8;
                                f5 = a20;
                                c5127t.quadTo(f15, f16, f6, f5);
                                f7 = f15;
                                f8 = f16;
                                textScanner.skipCommaWhitespace();
                                if (!textScanner.empty()) {
                                }
                            }
                            break;
                        case 86:
                        case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                            float nextFloat9 = textScanner.nextFloat();
                            if (Float.isNaN(nextFloat9)) {
                                Log.e("SVGParser", "Bad path coords for " + ((char) i2) + " path segment");
                                break;
                            } else {
                                if (i2 == 118) {
                                    nextFloat9 += f5;
                                }
                                f5 = nextFloat9;
                                c5127t.lineTo(f6, f5);
                                f8 = f5;
                                f7 = f6;
                                textScanner.skipCommaWhitespace();
                                if (!textScanner.empty()) {
                                }
                            }
                            break;
                        case 90:
                        case INVALID_ADS_ENDPOINT_VALUE:
                            c5127t.close();
                            f6 = f9;
                            f7 = f6;
                            f5 = f10;
                            f8 = f5;
                            textScanner.skipCommaWhitespace();
                            if (!textScanner.empty()) {
                            }
                            break;
                    }
                    return c5127t;
                }
            }
        }
        return c5127t;
    }

    static Style.LineCap A(String str) {
        if ("butt".equals(str)) {
            return Style.LineCap.Butt;
        }
        if ("round".equals(str)) {
            return Style.LineCap.Round;
        }
        if ("square".equals(str)) {
            return Style.LineCap.Square;
        }
        return null;
    }

    static Style.FillRule g(String str) {
        if ("nonzero".equals(str)) {
            return Style.FillRule.NonZero;
        }
        if ("evenodd".equals(str)) {
            return Style.FillRule.EvenOdd;
        }
        return null;
    }

    static SVGBase.Length j(String str) {
        try {
            SVGBase.Length a2 = b.a(str);
            return a2 == null ? p(str) : a2;
        } catch (SVGParseException unused) {
            return null;
        }
    }

    static Float m(String str) {
        Float b2 = C1697d.b(str);
        if (b2 != null) {
            return b2;
        }
        TextScanner textScanner = new TextScanner(str);
        float nextFloat = textScanner.nextFloat();
        Float valueOf = Float.valueOf(nextFloat);
        textScanner.skipWhitespace();
        if (textScanner.empty() && nextFloat >= 1.0f && nextFloat <= 1000.0f) {
            return valueOf;
        }
        return null;
    }

    static Style.RenderQuality w(String str) {
        str.getClass();
        switch (str) {
            case "optimizeQuality":
                return Style.RenderQuality.optimizeQuality;
            case "auto":
                return Style.RenderQuality.auto;
            case "optimizeSpeed":
                return Style.RenderQuality.optimizeSpeed;
            default:
                return null;
        }
    }

    static Float s(String str) {
        try {
            float h2 = h(str);
            float f2 = 0.0f;
            if (h2 >= 0.0f) {
                f2 = Math.min(h2, 1.0f);
            }
            return Float.valueOf(f2);
        } catch (SVGParseException unused) {
            return null;
        }
    }

    static SVGBase.SvgPaint u(String str) {
        if (str.startsWith("url(")) {
            int indexOf = str.indexOf(")");
            if (indexOf != -1) {
                String trim = str.substring(4, indexOf).trim();
                String trim2 = str.substring(indexOf + 1).trim();
                return new SVGBase.C5125r(trim, trim2.length() > 0 ? f(trim2) : null);
            }
            return new SVGBase.C5125r(str.substring(4).trim(), null);
        }
        return f(str);
    }

    private static Set<String> x(String str) {
        TextScanner textScanner = new TextScanner(str);
        HashSet hashSet = new HashSet();
        while (!textScanner.empty()) {
            String nextToken = textScanner.nextToken();
            if (nextToken.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                hashSet.add(nextToken.substring(35));
            } else {
                hashSet.add("UNSUPPORTED");
            }
            textScanner.skipWhitespace();
        }
        return hashSet;
    }

    private static Set<String> y(String str) {
        TextScanner textScanner = new TextScanner(str);
        HashSet hashSet = new HashSet();
        while (!textScanner.empty()) {
            hashSet.add(textScanner.nextToken());
            textScanner.skipWhitespace();
        }
        return hashSet;
    }

    static SVGBase.Length[] z(String str) {
        SVGBase.Length g2;
        TextScanner textScanner = new TextScanner(str);
        textScanner.skipWhitespace();
        if (textScanner.empty() || (g2 = textScanner.g()) == null || g2.b()) {
            return null;
        }
        float a2 = g2.a();
        ArrayList arrayList = new ArrayList();
        arrayList.add(g2);
        while (!textScanner.empty()) {
            textScanner.skipCommaWhitespace();
            SVGBase.Length g3 = textScanner.g();
            if (g3 == null || g3.b()) {
                return null;
            }
            arrayList.add(g3);
            a2 += g3.a();
        }
        if (a2 == 0.0f) {
            return null;
        }
        return (SVGBase.Length[]) arrayList.toArray(new SVGBase.Length[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.a = new SVGBase(this.c, this.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> b(TextScanner textScanner) {
        HashMap hashMap = new HashMap();
        textScanner.skipWhitespace();
        String nextToken = textScanner.nextToken(B5.U);
        while (nextToken != null) {
            textScanner.consume(B5.U);
            hashMap.put(nextToken, textScanner.nextQuotedString());
            textScanner.skipWhitespace();
            nextToken = textScanner.nextToken(B5.U);
        }
        return hashMap;
    }

    private void b(Attributes attributes) throws SVGParseException {
        a("<circle>", new Object[0]);
        if (this.b != null) {
            SVGBase.C5110c c5110c = new SVGBase.C5110c();
            c5110c.a = this.a;
            c5110c.b = this.b;
            a((SVGBase.E) c5110c, attributes);
            b(c5110c, attributes);
            a((SVGBase.InterfaceC5119l) c5110c, attributes);
            a((SVGBase.B) c5110c, attributes);
            a(c5110c, attributes);
            this.b.addChild(c5110c);
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    private void b(SVGBase.E e2, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if (trim.length() != 0) {
                int ordinal = f.a(attributes.getLocalName(i)).ordinal();
                if (ordinal == 0) {
                    e2.g = CSSParser.parseClassAttribute(trim);
                } else if (ordinal != 87) {
                    if (e2.e == null) {
                        e2.e = new Style();
                    }
                    Style.a(e2.e, attributes.getLocalName(i), attributes.getValue(i).trim(), true);
                } else {
                    a(e2, trim);
                }
            }
        }
    }

    private void b(String str) {
        this.a.a(new CSSParser(CSSParser.d.screen, CSSParser.Source.Document, this.d).a(str));
    }

    private void c(Attributes attributes) throws SVGParseException {
        a("<clipPath>", new Object[0]);
        if (this.b != null) {
            SVGBase.C5111d c5111d = new SVGBase.C5111d();
            c5111d.a = this.a;
            c5111d.b = this.b;
            a((SVGBase.E) c5111d, attributes);
            b(c5111d, attributes);
            a((SVGBase.InterfaceC5119l) c5111d, attributes);
            a((SVGBase.B) c5111d, attributes);
            a(c5111d, attributes);
            this.b.addChild(c5111d);
            this.b = c5111d;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    public com.smaato.sdk.ng.utils.svgparser.utils.c a(boolean z) {
        this.c = z;
        return this;
    }

    @Override // com.smaato.sdk.ng.utils.svgparser.utils.c
    public com.smaato.sdk.ng.utils.svgparser.utils.c a(SVGExternalFileResolver sVGExternalFileResolver) {
        this.d = sVGExternalFileResolver;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, String str3, Attributes attributes) throws SVGParseException {
        if (this.e) {
            this.f++;
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            g a2 = g.a(str2);
            switch (a2) {
                case svg:
                    u(attributes);
                    break;
                case a:
                    a(attributes);
                    break;
                case circle:
                    b(attributes);
                    break;
                case clipPath:
                    c(attributes);
                    break;
                case defs:
                    d(attributes);
                    break;
                case desc:
                case title:
                    this.g = true;
                    this.h = a2;
                    break;
                case ellipse:
                    e(attributes);
                    break;
                case g:
                    f(attributes);
                    break;
                case image:
                    g(attributes);
                    break;
                case line:
                    h(attributes);
                    break;
                case linearGradient:
                    i(attributes);
                    break;
                case marker:
                    j(attributes);
                    break;
                case mask:
                    k(attributes);
                    break;
                case path:
                    l(attributes);
                    break;
                case pattern:
                    m(attributes);
                    break;
                case polygon:
                    n(attributes);
                    break;
                case polyline:
                    o(attributes);
                    break;
                case radialGradient:
                    p(attributes);
                    break;
                case rect:
                    q(attributes);
                    break;
                case solidColor:
                    r(attributes);
                    break;
                case stop:
                    s(attributes);
                    break;
                case style:
                    t(attributes);
                    break;
                case SWITCH:
                    C(attributes);
                    break;
                case symbol:
                    v(attributes);
                    break;
                case text:
                    w(attributes);
                    break;
                case textPath:
                    x(attributes);
                    break;
                case tref:
                    y(attributes);
                    break;
                case tspan:
                    z(attributes);
                    break;
                case use:
                    A(attributes);
                    break;
                case view:
                    B(attributes);
                    break;
                default:
                    this.e = true;
                    this.f = 1;
                    break;
            }
        }
    }

    static SVGBase.CSSClipRect c(String str) {
        if ("auto".equals(str) || !str.startsWith("rect(")) {
            return null;
        }
        TextScanner textScanner = new TextScanner(str.substring(5));
        textScanner.skipWhitespace();
        SVGBase.Length a2 = a(textScanner);
        textScanner.skipCommaWhitespace();
        SVGBase.Length a3 = a(textScanner);
        textScanner.skipCommaWhitespace();
        SVGBase.Length a4 = a(textScanner);
        textScanner.skipCommaWhitespace();
        SVGBase.Length a5 = a(textScanner);
        textScanner.skipWhitespace();
        if (textScanner.consume(')') || textScanner.empty()) {
            return new SVGBase.CSSClipRect(a2, a3, a4, a5);
        }
        return null;
    }

    private void a(char[] cArr, int i, int i2) throws SVGParseException {
        if (this.e) {
            return;
        }
        if (this.g) {
            if (this.i == null) {
                this.i = new StringBuilder(i2);
            }
            this.i.append(cArr, i, i2);
        } else if (this.j) {
            if (this.k == null) {
                this.k = new StringBuilder(i2);
            }
            this.k.append(cArr, i, i2);
        } else if (this.b instanceof SVGBase.TextContainer) {
            a(new String(cArr, i, i2));
        }
    }

    private void a(String str) throws SVGParseException {
        SVGBase.SvgConditionalContainer svgConditionalContainer = (SVGBase.SvgConditionalContainer) this.b;
        int size = svgConditionalContainer.getChildren().size();
        SVGBase.SvgObject svgObject = size == 0 ? null : svgConditionalContainer.getChildren().get(size - 1);
        if (svgObject instanceof SVGBase.TextSequence) {
            StringBuilder sb = new StringBuilder();
            SVGBase.TextSequence textSequence = (SVGBase.TextSequence) svgObject;
            sb.append(textSequence.c);
            sb.append(str);
            textSequence.c = sb.toString();
            return;
        }
        this.b.addChild(new SVGBase.TextSequence(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, String str3) throws SVGParseException {
        if (this.e) {
            int i = this.f - 1;
            this.f = i;
            if (i == 0) {
                this.e = false;
                return;
            }
            return;
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            switch (g.a(str2)) {
                case svg:
                case a:
                case clipPath:
                case defs:
                case g:
                case image:
                case linearGradient:
                case marker:
                case mask:
                case pattern:
                case radialGradient:
                case solidColor:
                case stop:
                case SWITCH:
                case symbol:
                case text:
                case textPath:
                case tspan:
                case use:
                case view:
                    Object obj = this.b;
                    if (obj != null) {
                        this.b = ((SVGBase.SvgObject) obj).b;
                        return;
                    }
                    throw new SVGParseException(String.format("Unbalanced end element </%s> found", str2));
                case circle:
                case ellipse:
                case line:
                case path:
                case polygon:
                case polyline:
                case rect:
                case tref:
                default:
                    return;
                case desc:
                case title:
                    this.g = false;
                    StringBuilder sb = this.i;
                    if (sb != null) {
                        g gVar = this.h;
                        if (gVar == g.title) {
                            this.a.e(sb.toString());
                        } else if (gVar == g.desc) {
                            this.a.d(sb.toString());
                        }
                        this.i.setLength(0);
                        return;
                    }
                    return;
                case style:
                    StringBuilder sb2 = this.k;
                    if (sb2 != null) {
                        this.j = false;
                        b(sb2.toString());
                        this.k.setLength(0);
                        return;
                    }
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, Map<String, String> map) {
        String str2;
        String resolveCSSStyleSheet;
        if (!str.equals("xml-stylesheet") || this.d == null) {
            return;
        }
        if (map.get("type") == null || "text/css".equals(map.get("type"))) {
            if ((map.get(SVGParserImpl.XML_STYLESHEET_ATTR_ALTERNATE) != null && !SVGParserImpl.XML_STYLESHEET_ATTR_ALTERNATE_NO.equals(map.get(SVGParserImpl.XML_STYLESHEET_ATTR_ALTERNATE))) || (str2 = map.get("href")) == null || (resolveCSSStyleSheet = this.d.resolveCSSStyleSheet(str2)) == null) {
                return;
            }
            String str3 = map.get("media");
            if (str3 != null && !"all".equals(str3.trim())) {
                resolveCSSStyleSheet = "@media " + str3 + " { " + resolveCSSStyleSheet + "}";
            }
            b(resolveCSSStyleSheet);
        }
    }

    private void a(SVGBase.Svg svg, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ordinal = f.a(attributes.getLocalName(i)).ordinal();
            if (ordinal == 37) {
                SVGBase.Length p = p(trim);
                svg.t = p;
                if (p.b()) {
                    throw new SVGParseException("Invalid <svg> element. height cannot be negative");
                }
            } else if (ordinal == 95) {
                svg.version = trim;
            } else if (ordinal == 97) {
                SVGBase.Length p2 = p(trim);
                svg.s = p2;
                if (p2.b()) {
                    throw new SVGParseException("Invalid <svg> element. width cannot be negative");
                }
            } else if (ordinal == 100) {
                svg.q = p(trim);
            } else if (ordinal == 101) {
                svg.r = p(trim);
            }
        }
    }

    private void a(Attributes attributes) throws SVGParseException {
        a("<a>", new Object[0]);
        if (this.b != null) {
            SVGBase.C5108a c5108a = new SVGBase.C5108a();
            c5108a.a = this.a;
            c5108a.b = this.b;
            a((SVGBase.E) c5108a, attributes);
            b(c5108a, attributes);
            a((SVGBase.InterfaceC5119l) c5108a, attributes);
            a((SVGBase.B) c5108a, attributes);
            a(c5108a, attributes);
            this.b.addChild(c5108a);
            this.b = c5108a;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    private void a(SVGBase.C5108a c5108a, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if (f.a(attributes.getLocalName(i)).ordinal() == 38 && ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i)))) {
                c5108a.p = trim;
            }
        }
    }

    private void a(SVGBase.T t, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ordinal = f.a(attributes.getLocalName(i)).ordinal();
            if (ordinal == 37) {
                SVGBase.Length p = p(trim);
                t.t = p;
                if (p.b()) {
                    throw new SVGParseException("Invalid <use> element. height cannot be negative");
                }
            } else if (ordinal != 38) {
                if (ordinal == 97) {
                    SVGBase.Length p2 = p(trim);
                    t.s = p2;
                    if (p2.b()) {
                        throw new SVGParseException("Invalid <use> element. width cannot be negative");
                    }
                } else if (ordinal == 100) {
                    t.q = p(trim);
                } else if (ordinal == 101) {
                    t.r = p(trim);
                }
            } else if ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                t.p = trim;
            }
        }
    }

    private void a(SVGBase.C5120m c5120m, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ordinal = f.a(attributes.getLocalName(i)).ordinal();
            if (ordinal == 37) {
                SVGBase.Length p = p(trim);
                c5120m.t = p;
                if (p.b()) {
                    throw new SVGParseException("Invalid <use> element. height cannot be negative");
                }
            } else if (ordinal != 38) {
                if (ordinal == 63) {
                    a((SVGBase.G) c5120m, trim);
                } else if (ordinal == 97) {
                    SVGBase.Length p2 = p(trim);
                    c5120m.s = p2;
                    if (p2.b()) {
                        throw new SVGParseException("Invalid <use> element. width cannot be negative");
                    }
                } else if (ordinal == 100) {
                    c5120m.q = p(trim);
                } else if (ordinal == 101) {
                    c5120m.r = p(trim);
                }
            } else if ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                c5120m.p = trim;
            }
        }
    }

    private void a(SVGBase.C5126s c5126s, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ordinal = f.a(attributes.getLocalName(i)).ordinal();
            if (ordinal == 14) {
                c5126s.o = v(trim);
            } else if (ordinal != 58) {
                continue;
            } else {
                float h2 = h(trim);
                c5126s.p = Float.valueOf(h2);
                if (h2 < 0.0f) {
                    throw new SVGParseException("Invalid <path> element. pathLength cannot be negative");
                }
            }
        }
    }

    private void a(SVGBase.y yVar, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ordinal = f.a(attributes.getLocalName(i)).ordinal();
            if (ordinal == 37) {
                SVGBase.Length p = p(trim);
                yVar.r = p;
                if (p.b()) {
                    throw new SVGParseException("Invalid <rect> element. height cannot be negative");
                }
            } else if (ordinal == 97) {
                SVGBase.Length p2 = p(trim);
                yVar.q = p2;
                if (p2.b()) {
                    throw new SVGParseException("Invalid <rect> element. width cannot be negative");
                }
            } else if (ordinal == 71) {
                SVGBase.Length p3 = p(trim);
                yVar.s = p3;
                if (p3.b()) {
                    throw new SVGParseException("Invalid <rect> element. rx cannot be negative");
                }
            } else if (ordinal == 72) {
                SVGBase.Length p4 = p(trim);
                yVar.t = p4;
                if (p4.b()) {
                    throw new SVGParseException("Invalid <rect> element. ry cannot be negative");
                }
            } else if (ordinal == 100) {
                yVar.o = p(trim);
            } else if (ordinal == 101) {
                yVar.p = p(trim);
            }
        }
    }

    private void a(SVGBase.C5110c c5110c, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ordinal = f.a(attributes.getLocalName(i)).ordinal();
            if (ordinal == 6) {
                c5110c.o = p(trim);
            } else if (ordinal == 7) {
                c5110c.p = p(trim);
            } else if (ordinal != 64) {
                continue;
            } else {
                SVGBase.Length p = p(trim);
                c5110c.q = p;
                if (p.b()) {
                    throw new SVGParseException("Invalid <circle> element. r cannot be negative");
                }
            }
        }
    }

    private void a(SVGBase.C5114g c5114g, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ordinal = f.a(attributes.getLocalName(i)).ordinal();
            if (ordinal == 6) {
                c5114g.o = p(trim);
            } else if (ordinal == 7) {
                c5114g.p = p(trim);
            } else if (ordinal == 71) {
                SVGBase.Length p = p(trim);
                c5114g.q = p;
                if (p.b()) {
                    throw new SVGParseException("Invalid <ellipse> element. rx cannot be negative");
                }
            } else if (ordinal != 72) {
                continue;
            } else {
                SVGBase.Length p2 = p(trim);
                c5114g.r = p2;
                if (p2.b()) {
                    throw new SVGParseException("Invalid <ellipse> element. ry cannot be negative");
                }
            }
        }
    }

    private void a(SVGBase.C5121n c5121n, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (f.a(attributes.getLocalName(i)).ordinal()) {
                case 102:
                    c5121n.o = p(trim);
                    break;
                case 103:
                    c5121n.p = p(trim);
                    break;
                case 104:
                    c5121n.q = p(trim);
                    break;
                case 105:
                    c5121n.r = p(trim);
                    break;
            }
        }
    }

    private void a(SVGBase.w wVar, Attributes attributes, String str) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (f.a(attributes.getLocalName(i)) == f.points) {
                TextScanner textScanner = new TextScanner(attributes.getValue(i));
                ArrayList arrayList = new ArrayList();
                textScanner.skipWhitespace();
                while (!textScanner.empty()) {
                    float nextFloat = textScanner.nextFloat();
                    if (!Float.isNaN(nextFloat)) {
                        textScanner.skipCommaWhitespace();
                        float nextFloat2 = textScanner.nextFloat();
                        if (!Float.isNaN(nextFloat2)) {
                            textScanner.skipCommaWhitespace();
                            arrayList.add(Float.valueOf(nextFloat));
                            arrayList.add(Float.valueOf(nextFloat2));
                        } else {
                            throw new SVGParseException("Invalid <" + str + "> points attribute. There should be an even number of coordinates.");
                        }
                    } else {
                        throw new SVGParseException("Invalid <" + str + "> points attribute. Non-coordinate content found in list.");
                    }
                }
                wVar.o = new float[arrayList.size()];
                int size = arrayList.size();
                int i2 = 0;
                int i3 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    wVar.o[i3] = ((Float) obj).floatValue();
                    i3++;
                }
            }
        }
    }

    private void a(SVGBase.Q q, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ordinal = f.a(attributes.getLocalName(i)).ordinal();
            if (ordinal == 9) {
                q.q = q(trim);
            } else if (ordinal == 10) {
                q.r = q(trim);
            } else if (ordinal == 100) {
                q.o = q(trim);
            } else if (ordinal == 101) {
                q.p = q(trim);
            }
        }
    }

    private void a(SVGBase.L l2, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if (f.a(attributes.getLocalName(i)).ordinal() == 38 && ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i)))) {
                l2.o = trim;
            }
        }
    }

    private void a(SVGBase.B b2, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ordinal = f.a(attributes.getLocalName(i)).ordinal();
            if (ordinal != 88) {
                switch (ordinal) {
                    case 67:
                        b2.setRequiredFeatures(x(trim));
                        break;
                    case 68:
                        b2.setRequiredExtensions(trim);
                        break;
                    case 69:
                        b2.setRequiredFormats(y(trim));
                        break;
                    case 70:
                        List<String> i2 = i(trim);
                        b2.setRequiredFonts(i2 != null ? new HashSet(i2) : new HashSet(0));
                        break;
                }
            } else {
                b2.setSystemLanguage(C(trim));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x009f, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(SVGBase.C5122o c5122o, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ordinal = f.a(attributes.getLocalName(i)).ordinal();
            if (ordinal != 56) {
                if (ordinal == 65) {
                    c5122o.r = p(trim);
                } else if (ordinal != 66) {
                    switch (ordinal) {
                        case 46:
                            SVGBase.Length p = p(trim);
                            c5122o.u = p;
                            if (p.b()) {
                                throw new SVGParseException("Invalid <marker> element. markerHeight cannot be negative");
                            }
                            break;
                        case 47:
                            if ("strokeWidth".equals(trim)) {
                                c5122o.q = false;
                                break;
                            } else if ("userSpaceOnUse".equals(trim)) {
                                c5122o.q = true;
                                break;
                            } else {
                                throw new SVGParseException("Invalid value for attribute markerUnits");
                            }
                        case 48:
                            SVGBase.Length p2 = p(trim);
                            c5122o.t = p2;
                            if (p2.b()) {
                                throw new SVGParseException("Invalid <marker> element. markerWidth cannot be negative");
                            }
                            break;
                    }
                } else {
                    c5122o.s = p(trim);
                }
            } else if ("auto".equals(trim)) {
                c5122o.v = Float.valueOf(Float.NaN);
            } else {
                c5122o.v = Float.valueOf(h(trim));
            }
        }
    }

    private void a(SVGBase.AbstractC5115h abstractC5115h, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ordinal = f.a(attributes.getLocalName(i)).ordinal();
            if (ordinal == 35) {
                abstractC5115h.j = G(trim);
            } else if (ordinal != 36) {
                if (ordinal != 38) {
                    if (ordinal != 75) {
                        continue;
                    } else {
                        try {
                            abstractC5115h.k = SVGBase.EnumC5116i.valueOf(trim);
                        } catch (IllegalArgumentException unused) {
                            throw new SVGParseException("Invalid spreadMethod attribute. \"" + trim + "\" is not a valid value.");
                        }
                    }
                } else if ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                    abstractC5115h.l = trim;
                }
            } else if ("objectBoundingBox".equals(trim)) {
                abstractC5115h.i = Boolean.FALSE;
            } else if ("userSpaceOnUse".equals(trim)) {
                abstractC5115h.i = Boolean.TRUE;
            } else {
                throw new SVGParseException("Invalid value for attribute gradientUnits");
            }
        }
    }

    private void a(SVGBase.F f2, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (f.a(attributes.getLocalName(i)).ordinal()) {
                case 102:
                    f2.m = p(trim);
                    break;
                case 103:
                    f2.n = p(trim);
                    break;
                case 104:
                    f2.o = p(trim);
                    break;
                case 105:
                    f2.p = p(trim);
                    break;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(SVGBase.H h2, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ordinal = f.a(attributes.getLocalName(i)).ordinal();
            if (ordinal == 6) {
                h2.m = p(trim);
            } else if (ordinal == 7) {
                h2.n = p(trim);
            } else if (ordinal != 64) {
                switch (ordinal) {
                    case 11:
                        h2.p = p(trim);
                        break;
                    case 12:
                        h2.q = p(trim);
                        break;
                    case 13:
                        SVGBase.Length p = p(trim);
                        h2.r = p;
                        if (p.b()) {
                            throw new SVGParseException("Invalid <radialGradient> element. fr cannot be negative");
                        }
                        break;
                }
            } else {
                SVGBase.Length p2 = p(trim);
                h2.o = p2;
                if (p2.b()) {
                    throw new SVGParseException("Invalid <radialGradient> element. r cannot be negative");
                }
            }
        }
    }

    private void a(SVGBase.A a2, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if (f.a(attributes.getLocalName(i)).ordinal() == 54) {
                a2.h = n(trim);
            }
        }
    }

    private void a(SVGBase.C5111d c5111d, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if (f.a(attributes.getLocalName(i)).ordinal() == 3) {
                if ("objectBoundingBox".equals(trim)) {
                    c5111d.p = Boolean.FALSE;
                } else if ("userSpaceOnUse".equals(trim)) {
                    c5111d.p = Boolean.TRUE;
                } else {
                    throw new SVGParseException("Invalid value for attribute clipPathUnits");
                }
            }
        }
    }

    private void a(SVGBase.P p, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ordinal = f.a(attributes.getLocalName(i)).ordinal();
            if (ordinal != 38) {
                if (ordinal == 76) {
                    p.p = p(trim);
                }
            } else if ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                p.o = trim;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c7, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(SVGBase.v vVar, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ordinal = f.a(attributes.getLocalName(i)).ordinal();
            if (ordinal == 37) {
                SVGBase.Length p = p(trim);
                vVar.w = p;
                if (p.b()) {
                    throw new SVGParseException("Invalid <pattern> element. height cannot be negative");
                }
            } else if (ordinal != 38) {
                if (ordinal == 97) {
                    SVGBase.Length p2 = p(trim);
                    vVar.v = p2;
                    if (p2.b()) {
                        throw new SVGParseException("Invalid <pattern> element. width cannot be negative");
                    }
                } else if (ordinal == 100) {
                    vVar.t = p(trim);
                } else if (ordinal == 101) {
                    vVar.u = p(trim);
                } else {
                    switch (ordinal) {
                        case 59:
                            if ("objectBoundingBox".equals(trim)) {
                                vVar.r = Boolean.FALSE;
                                break;
                            } else if ("userSpaceOnUse".equals(trim)) {
                                vVar.r = Boolean.TRUE;
                                break;
                            } else {
                                throw new SVGParseException("Invalid value for attribute patternContentUnits");
                            }
                        case 60:
                            vVar.s = G(trim);
                            break;
                        case 61:
                            if ("objectBoundingBox".equals(trim)) {
                                vVar.q = Boolean.FALSE;
                                break;
                            } else if ("userSpaceOnUse".equals(trim)) {
                                vVar.q = Boolean.TRUE;
                                break;
                            } else {
                                throw new SVGParseException("Invalid value for attribute patternUnits");
                            }
                    }
                }
            } else if ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                vVar.x = trim;
            }
        }
    }

    private void a(SVGBase.C5123p c5123p, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ordinal = f.a(attributes.getLocalName(i)).ordinal();
            if (ordinal == 37) {
                SVGBase.Length p = p(trim);
                c5123p.t = p;
                if (p.b()) {
                    throw new SVGParseException("Invalid <mask> element. height cannot be negative");
                }
            } else if (ordinal == 97) {
                SVGBase.Length p2 = p(trim);
                c5123p.s = p2;
                if (p2.b()) {
                    throw new SVGParseException("Invalid <mask> element. width cannot be negative");
                }
            } else if (ordinal != 50) {
                if (ordinal != 51) {
                    if (ordinal == 100) {
                        c5123p.q = p(trim);
                    } else if (ordinal == 101) {
                        c5123p.r = p(trim);
                    }
                } else if ("objectBoundingBox".equals(trim)) {
                    c5123p.o = Boolean.FALSE;
                } else if ("userSpaceOnUse".equals(trim)) {
                    c5123p.o = Boolean.TRUE;
                } else {
                    throw new SVGParseException("Invalid value for attribute maskUnits");
                }
            } else if ("objectBoundingBox".equals(trim)) {
                c5123p.p = Boolean.FALSE;
            } else if ("userSpaceOnUse".equals(trim)) {
                c5123p.p = Boolean.TRUE;
            } else {
                throw new SVGParseException("Invalid value for attribute maskContentUnits");
            }
        }
    }

    private void a(SVGBase.E e2, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String qName = attributes.getQName(i);
            if (!qName.equals("id") && !qName.equals("xml:id")) {
                if (qName.equals("xml:space")) {
                    String trim = attributes.getValue(i).trim();
                    if ("default".equals(trim)) {
                        e2.d = Boolean.FALSE;
                        return;
                    } else {
                        if ("preserve".equals(trim)) {
                            e2.d = Boolean.TRUE;
                            return;
                        }
                        throw new SVGParseException("Invalid value for \"xml:space\" attribute: " + trim);
                    }
                }
            } else {
                e2.c = attributes.getValue(i).trim();
                return;
            }
        }
    }

    private static void a(SVGBase.E e2, String str) {
        CSSTextScanner cSSTextScanner = new CSSTextScanner(m.matcher(str).replaceAll(""));
        while (!cSSTextScanner.empty()) {
            cSSTextScanner.skipWhitespace();
            String nextIdentifier = cSSTextScanner.nextIdentifier();
            cSSTextScanner.skipWhitespace();
            if (!cSSTextScanner.consume(';')) {
                if (!cSSTextScanner.consume(':')) {
                    return;
                }
                cSSTextScanner.skipWhitespace();
                String nextPropertyValue = cSSTextScanner.nextPropertyValue();
                if (nextPropertyValue != null) {
                    cSSTextScanner.skipWhitespace();
                    if (cSSTextScanner.empty() || cSSTextScanner.consume(';')) {
                        if (e2.f == null) {
                            e2.f = new Style();
                        }
                        Style.a(e2.f, nextIdentifier, nextPropertyValue, false);
                        cSSTextScanner.skipWhitespace();
                    }
                }
            }
        }
    }

    private void a(SVGBase.I i, Attributes attributes) throws SVGParseException {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String trim = attributes.getValue(i2).trim();
            int ordinal = f.a(attributes.getLocalName(i2)).ordinal();
            if (ordinal == 63) {
                a((SVGBase.G) i, trim);
            } else if (ordinal == 96) {
                i.p = I(trim);
            }
        }
    }

    private void a(SVGBase.InterfaceC5119l interfaceC5119l, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (f.a(attributes.getLocalName(i)) == f.transform) {
                interfaceC5119l.a(G(attributes.getValue(i)));
            }
        }
    }

    private static float a(String str, int i, int i2) throws SVGParseException {
        float a2 = new com.smaato.sdk.ng.utils.svgparser.utils.b().a(str, i, i2);
        if (!Float.isNaN(a2)) {
            return a2;
        }
        throw new SVGParseException("Invalid float value: " + str);
    }

    private static void a(SVGBase.G g2, String str) throws SVGParseException {
        g2.o = PreserveAspectRatio.of(str);
    }

    private static int a(float f2) {
        if (f2 < 0.0f) {
            return 0;
        }
        if (f2 > 255.0f) {
            return 255;
        }
        return Math.round(f2);
    }

    private static int a(float f2, float f3, float f4) {
        float f5 = f2 % 360.0f;
        if (f2 < 0.0f) {
            f5 += 360.0f;
        }
        float f6 = f5 / 60.0f;
        float f7 = f3 / 100.0f;
        float f8 = f4 / 100.0f;
        float min = f7 < 0.0f ? 0.0f : Math.min(f7, 1.0f);
        float min2 = f8 >= 0.0f ? Math.min(f8, 1.0f) : 0.0f;
        float f9 = min2 <= 0.5f ? (min + 1.0f) * min2 : (min2 + min) - (min * min2);
        float f10 = (min2 * 2.0f) - f9;
        return a(b(f10, f9, f6 - 2.0f) * 256.0f) | (a(b(f10, f9, f6 + 2.0f) * 256.0f) << 16) | (a(b(f10, f9, f6) * 256.0f) << 8);
    }

    static void a(Style style, String str) {
        String nextToken;
        if ("|caption|icon|menu|message-box|small-caption|status-bar|".contains('|' + str + '|')) {
            return;
        }
        TextScanner textScanner = new TextScanner(str);
        Float f2 = null;
        Style.FontStyle fontStyle = null;
        Boolean bool = null;
        Float f3 = null;
        while (true) {
            nextToken = textScanner.nextToken('/');
            textScanner.skipWhitespace();
            if (nextToken != null) {
                if (f2 != null && fontStyle != null) {
                    break;
                }
                if (!nextToken.equals(Constants.NORMAL)) {
                    if (f2 == null && C1697d.a(nextToken)) {
                        f2 = C1697d.b(nextToken);
                    } else if (fontStyle != null || (fontStyle = l(nextToken)) == null) {
                        if (bool == null && nextToken.equals("small-caps")) {
                            bool = Boolean.TRUE;
                        } else if (f3 != null || !c.a(nextToken)) {
                            break;
                        } else {
                            f3 = c.b(nextToken);
                        }
                    }
                }
            } else {
                return;
            }
        }
        SVGBase.Length j = j(nextToken);
        if (textScanner.consume('/')) {
            textScanner.skipWhitespace();
            String nextToken2 = textScanner.nextToken();
            if (nextToken2 != null) {
                try {
                    p(nextToken2);
                } catch (SVGParseException unused) {
                    return;
                }
            }
            textScanner.skipWhitespace();
        }
        style.o = i(textScanner.j());
        style.p = j;
        style.q = Float.valueOf(f2 == null ? 400.0f : f2.floatValue());
        if (fontStyle == null) {
            fontStyle = Style.FontStyle.normal;
        }
        style.r = fontStyle;
        style.s = Float.valueOf(f3 == null ? 100.0f : f3.floatValue());
        style.Q = Style.FontKerning.auto;
        style.R = CSSFontFeatureSettings.b;
        style.S = CSSFontFeatureSettings.d;
        style.T = CSSFontFeatureSettings.e;
        if (bool == Boolean.TRUE) {
            style.T = CSSFontFeatureSettings.c();
        }
        style.U = CSSFontFeatureSettings.g;
        style.V = CSSFontFeatureSettings.h;
        style.W = CSSFontFeatureSettings.FONT_FEATURE_SETTINGS_NORMAL;
        style.X = null;
        style.a |= 4009918906621952L;
    }

    private static SVGBase.Length a(TextScanner textScanner) {
        if (textScanner.consume("auto")) {
            return SVGBase.Length.c;
        }
        return textScanner.g();
    }

    static String a(String str, String str2) {
        if (str.equals("none") || !str.startsWith("url(")) {
            return null;
        }
        if (str.endsWith(")")) {
            return str.substring(4, str.length() - 1).trim();
        }
        return str.substring(4).trim();
    }
}
