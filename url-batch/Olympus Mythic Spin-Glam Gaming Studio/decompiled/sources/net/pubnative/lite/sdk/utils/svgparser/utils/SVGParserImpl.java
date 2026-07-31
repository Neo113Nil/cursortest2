package net.pubnative.lite.sdk.utils.svgparser.utils;

import android.graphics.Matrix;
import android.util.Log;
import android.util.Xml;
import com.adjust.sdk.Constants;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.ironsource.B5;
import com.ironsource.X3;
import com.safedk.android.utils.SdksMapping;
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
import net.pubnative.lite.sdk.utils.svgparser.PreserveAspectRatio;
import net.pubnative.lite.sdk.utils.svgparser.SVGExternalFileResolver;
import net.pubnative.lite.sdk.utils.svgparser.SVGParseException;
import net.pubnative.lite.sdk.utils.svgparser.utils.CSSParser;
import net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase;
import net.pubnative.lite.sdk.utils.svgparser.utils.Style;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes11.dex */
class SVGParserImpl implements SVGParser {
    static final String CURRENTCOLOR = "currentColor";
    public static final int ENTITY_WATCH_BUFFER_SIZE = 4096;
    private static final String FEATURE_STRING_PREFIX = "http://www.w3.org/TR/SVG11/feature#";
    static final String NONE = "none";
    private static final String SVG_NAMESPACE = "http://www.w3.org/2000/svg";
    private static final String TAG = "SVGParser";
    static final String VALID_DISPLAY_VALUES = "|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|";
    static final String VALID_VISIBILITY_VALUES = "|visible|hidden|collapse|";
    private static final String XLINK_NAMESPACE = "http://www.w3.org/1999/xlink";
    public static final String XML_STYLESHEET_ATTR_ALTERNATE = "alternate";
    public static final String XML_STYLESHEET_ATTR_ALTERNATE_NO = "no";
    public static final String XML_STYLESHEET_ATTR_HREF = "href";
    public static final String XML_STYLESHEET_ATTR_MEDIA = "media";
    public static final String XML_STYLESHEET_ATTR_MEDIA_ALL = "all";
    public static final String XML_STYLESHEET_ATTR_TYPE = "type";
    private static final String XML_STYLESHEET_PROCESSING_INSTRUCTION = "xml-stylesheet";
    private int ignoreDepth;
    private static final boolean FORCE_SAX_ON_EARLY_ANDROIDS = false;
    private static final Pattern PATTERN_BLOCK_COMMENTS = Pattern.compile("/\\*.*?\\*/");
    private SVGBase svgDocument = null;
    private SVGBase.SvgContainer currentElement = null;
    private boolean enableInternalEntities = true;
    private SVGExternalFileResolver externalFileResolver = null;
    private boolean ignoring = false;
    private boolean inMetadataElement = false;
    private SVGElem metadataTag = null;
    private StringBuilder metadataElementContents = null;
    private boolean inStyleElement = false;
    private StringBuilder styleElementContents = null;

    private static class ColourKeywords {
        private static final Map<String, Integer> colourKeywords;

        static {
            HashMap hashMap = new HashMap(47);
            colourKeywords = hashMap;
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

        private ColourKeywords() {
        }

        static Integer get(String str) {
            return colourKeywords.get(str);
        }
    }

    private static class FontSizeKeywords {
        private static final Map<String, SVGBase.Length> fontSizeKeywords;

        static {
            HashMap hashMap = new HashMap(9);
            fontSizeKeywords = hashMap;
            SVGBase.Unit unit = SVGBase.Unit.pt;
            hashMap.put("xx-small", new SVGBase.Length(0.694f, unit));
            hashMap.put("x-small", new SVGBase.Length(0.833f, unit));
            hashMap.put(Constants.SMALL, new SVGBase.Length(10.0f, unit));
            hashMap.put(Constants.MEDIUM, new SVGBase.Length(12.0f, unit));
            hashMap.put(Constants.LARGE, new SVGBase.Length(14.4f, unit));
            hashMap.put("x-large", new SVGBase.Length(17.3f, unit));
            hashMap.put("xx-large", new SVGBase.Length(20.7f, unit));
            SVGBase.Unit unit2 = SVGBase.Unit.percent;
            hashMap.put("smaller", new SVGBase.Length(83.33f, unit2));
            hashMap.put("larger", new SVGBase.Length(120.0f, unit2));
        }

        private FontSizeKeywords() {
        }

        static SVGBase.Length get(String str) {
            return fontSizeKeywords.get(str);
        }
    }

    private static class FontStretchKeywords {
        private static final Map<String, Float> fontStretchKeywords;

        static {
            HashMap hashMap = new HashMap(9);
            fontStretchKeywords = hashMap;
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

        private FontStretchKeywords() {
        }

        static boolean contains(String str) {
            return fontStretchKeywords.containsKey(str);
        }

        static Float get(String str) {
            return fontStretchKeywords.get(str);
        }
    }

    private static class FontWeightKeywords {
        private static final Map<String, Float> fontWeightKeywords;

        static {
            HashMap hashMap = new HashMap(4);
            fontWeightKeywords = hashMap;
            hashMap.put(Constants.NORMAL, Float.valueOf(400.0f));
            hashMap.put("bold", Float.valueOf(700.0f));
            hashMap.put("bolder", Float.valueOf(Float.MAX_VALUE));
            hashMap.put("lighter", Float.valueOf(Float.MIN_VALUE));
        }

        private FontWeightKeywords() {
        }

        static boolean contains(String str) {
            return fontWeightKeywords.containsKey(str);
        }

        static Float get(String str) {
            return fontWeightKeywords.get(str);
        }
    }

    private class SAXHandler extends DefaultHandler2 {
        private SAXHandler() {
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i, int i2) {
            SVGParserImpl.this.text(new String(cArr, i, i2));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endDocument() {
            SVGParserImpl.this.endDocument();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) {
            SVGParserImpl.this.endElement(str, str2, str3);
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void processingInstruction(String str, String str2) {
            SVGParserImpl.this.handleProcessingInstruction(str, SVGParserImpl.this.parseProcessingInstructionAttributes(new TextScanner(str2)));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startDocument() {
            SVGParserImpl.this.startDocument();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) {
            SVGParserImpl.this.startElement(str, str2, str3, attributes);
        }
    }

    enum SVGAttr {
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

        private static final Map<String, SVGAttr> cache = new HashMap();

        static {
            for (SVGAttr sVGAttr : values()) {
                if (sVGAttr == CLASS) {
                    cache.put(SdksMapping.KEY_INSTALLED_MEDIATION_ADAPTERS_CLASS, sVGAttr);
                } else if (sVGAttr != UNSUPPORTED) {
                    cache.put(sVGAttr.name().replace('_', '-'), sVGAttr);
                }
            }
        }

        public static SVGAttr fromString(String str) {
            SVGAttr sVGAttr = cache.get(str);
            return sVGAttr != null ? sVGAttr : UNSUPPORTED;
        }
    }

    private enum SVGElem {
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

        private static final Map<String, SVGElem> cache = new HashMap();

        static {
            for (SVGElem sVGElem : values()) {
                if (sVGElem == SWITCH) {
                    cache.put("switch", sVGElem);
                } else if (sVGElem != UNSUPPORTED) {
                    cache.put(sVGElem.name(), sVGElem);
                }
            }
        }

        public static SVGElem fromString(String str) {
            SVGElem sVGElem = cache.get(str);
            return sVGElem != null ? sVGElem : UNSUPPORTED;
        }
    }

    SVGParserImpl() {
    }

    private void a(Attributes attributes) {
        debug("<a>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.A a = new SVGBase.A();
        a.document = this.svgDocument;
        a.parent = this.currentElement;
        parseAttributesCore(a, attributes);
        parseAttributesStyle(a, attributes);
        parseAttributesTransform(a, attributes);
        parseAttributesConditional(a, attributes);
        parseAttributesA(a, attributes);
        this.currentElement.addChild(a);
        this.currentElement = a;
    }

    private void appendToTextContainer(String str) {
        SVGBase.SvgConditionalContainer svgConditionalContainer = (SVGBase.SvgConditionalContainer) this.currentElement;
        int size = svgConditionalContainer.getChildren().size();
        SVGBase.SvgObject svgObject = size == 0 ? null : svgConditionalContainer.getChildren().get(size - 1);
        if (!(svgObject instanceof SVGBase.TextSequence)) {
            this.currentElement.addChild(new SVGBase.TextSequence(str));
            return;
        }
        StringBuilder sb = new StringBuilder();
        SVGBase.TextSequence textSequence = (SVGBase.TextSequence) svgObject;
        sb.append(textSequence.text);
        sb.append(str);
        textSequence.text = sb.toString();
    }

    private void circle(Attributes attributes) {
        debug("<circle>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.Circle circle = new SVGBase.Circle();
        circle.document = this.svgDocument;
        circle.parent = this.currentElement;
        parseAttributesCore(circle, attributes);
        parseAttributesStyle(circle, attributes);
        parseAttributesTransform(circle, attributes);
        parseAttributesConditional(circle, attributes);
        parseAttributesCircle(circle, attributes);
        this.currentElement.addChild(circle);
    }

    private static int clamp255(float f) {
        if (f < 0.0f) {
            return 0;
        }
        if (f > 255.0f) {
            return 255;
        }
        return Math.round(f);
    }

    private void clipPath(Attributes attributes) {
        debug("<clipPath>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.ClipPath clipPath = new SVGBase.ClipPath();
        clipPath.document = this.svgDocument;
        clipPath.parent = this.currentElement;
        parseAttributesCore(clipPath, attributes);
        parseAttributesStyle(clipPath, attributes);
        parseAttributesTransform(clipPath, attributes);
        parseAttributesConditional(clipPath, attributes);
        parseAttributesClipPath(clipPath, attributes);
        this.currentElement.addChild(clipPath);
        this.currentElement = clipPath;
    }

    private void debug(String str, Object... objArr) {
    }

    private void defs(Attributes attributes) {
        debug("<defs>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.Defs defs = new SVGBase.Defs();
        defs.document = this.svgDocument;
        defs.parent = this.currentElement;
        parseAttributesCore(defs, attributes);
        parseAttributesStyle(defs, attributes);
        parseAttributesTransform(defs, attributes);
        this.currentElement.addChild(defs);
        this.currentElement = defs;
    }

    private void dumpNode(SVGBase.SvgObject svgObject, String str) {
    }

    private void ellipse(Attributes attributes) {
        debug("<ellipse>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.Ellipse ellipse = new SVGBase.Ellipse();
        ellipse.document = this.svgDocument;
        ellipse.parent = this.currentElement;
        parseAttributesCore(ellipse, attributes);
        parseAttributesStyle(ellipse, attributes);
        parseAttributesTransform(ellipse, attributes);
        parseAttributesConditional(ellipse, attributes);
        parseAttributesEllipse(ellipse, attributes);
        this.currentElement.addChild(ellipse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void endDocument() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void endElement(String str, String str2, String str3) {
        if (this.ignoring) {
            int i = this.ignoreDepth - 1;
            this.ignoreDepth = i;
            if (i == 0) {
                this.ignoring = false;
                return;
            }
            return;
        }
        if (SVG_NAMESPACE.equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            switch (SVGElem.fromString(str2)) {
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
                    Object obj = this.currentElement;
                    if (obj == null) {
                        throw new SVGParseException(String.format("Unbalanced end element </%s> found", str2));
                    }
                    this.currentElement = ((SVGBase.SvgObject) obj).parent;
                    return;
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
                    this.inMetadataElement = false;
                    StringBuilder sb = this.metadataElementContents;
                    if (sb != null) {
                        SVGElem sVGElem = this.metadataTag;
                        if (sVGElem == SVGElem.title) {
                            this.svgDocument.setTitle(sb.toString());
                        } else if (sVGElem == SVGElem.desc) {
                            this.svgDocument.setDesc(sb.toString());
                        }
                        this.metadataElementContents.setLength(0);
                        return;
                    }
                    return;
                case style:
                    StringBuilder sb2 = this.styleElementContents;
                    if (sb2 != null) {
                        this.inStyleElement = false;
                        parseCSSStyleSheet(sb2.toString());
                        this.styleElementContents.setLength(0);
                        return;
                    }
                    return;
            }
        }
    }

    private void g(Attributes attributes) {
        debug("<g>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.Group group = new SVGBase.Group();
        group.document = this.svgDocument;
        group.parent = this.currentElement;
        parseAttributesCore(group, attributes);
        parseAttributesStyle(group, attributes);
        parseAttributesTransform(group, attributes);
        parseAttributesConditional(group, attributes);
        this.currentElement.addChild(group);
        this.currentElement = group;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleProcessingInstruction(String str, Map<String, String> map) {
        String str2;
        String resolveCSSStyleSheet;
        if (!str.equals(XML_STYLESHEET_PROCESSING_INSTRUCTION) || this.externalFileResolver == null) {
            return;
        }
        if (map.get("type") == null || "text/css".equals(map.get("type"))) {
            if ((map.get(XML_STYLESHEET_ATTR_ALTERNATE) != null && !XML_STYLESHEET_ATTR_ALTERNATE_NO.equals(map.get(XML_STYLESHEET_ATTR_ALTERNATE))) || (str2 = map.get("href")) == null || (resolveCSSStyleSheet = this.externalFileResolver.resolveCSSStyleSheet(str2)) == null) {
                return;
            }
            String str3 = map.get("media");
            if (str3 != null && !"all".equals(str3.trim())) {
                resolveCSSStyleSheet = "@media " + str3 + " { " + resolveCSSStyleSheet + "}";
            }
            parseCSSStyleSheet(resolveCSSStyleSheet);
        }
    }

    private static int hslToRgb(float f, float f2, float f3) {
        float f4 = f % 360.0f;
        if (f < 0.0f) {
            f4 += 360.0f;
        }
        float f5 = f4 / 60.0f;
        float f6 = f2 / 100.0f;
        float f7 = f3 / 100.0f;
        float min = f6 < 0.0f ? 0.0f : Math.min(f6, 1.0f);
        float min2 = f7 >= 0.0f ? Math.min(f7, 1.0f) : 0.0f;
        float f8 = min2 <= 0.5f ? (min + 1.0f) * min2 : (min2 + min) - (min * min2);
        float f9 = (min2 * 2.0f) - f8;
        return clamp255(hueToRgb(f9, f8, f5 - 2.0f) * 256.0f) | (clamp255(hueToRgb(f9, f8, f5 + 2.0f) * 256.0f) << 16) | (clamp255(hueToRgb(f9, f8, f5) * 256.0f) << 8);
    }

    private static float hueToRgb(float f, float f2, float f3) {
        float f4;
        if (f3 < 0.0f) {
            f3 += 6.0f;
        }
        if (f3 >= 6.0f) {
            f3 -= 6.0f;
        }
        if (f3 < 1.0f) {
            f4 = (f2 - f) * f3;
        } else {
            if (f3 < 3.0f) {
                return f2;
            }
            if (f3 >= 4.0f) {
                return f;
            }
            f4 = (f2 - f) * (4.0f - f3);
        }
        return f4 + f;
    }

    private void image(Attributes attributes) {
        debug("<image>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.Image image = new SVGBase.Image();
        image.document = this.svgDocument;
        image.parent = this.currentElement;
        parseAttributesCore(image, attributes);
        parseAttributesStyle(image, attributes);
        parseAttributesTransform(image, attributes);
        parseAttributesConditional(image, attributes);
        parseAttributesImage(image, attributes);
        this.currentElement.addChild(image);
        this.currentElement = image;
    }

    private void line(Attributes attributes) {
        debug("<line>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.Line line = new SVGBase.Line();
        line.document = this.svgDocument;
        line.parent = this.currentElement;
        parseAttributesCore(line, attributes);
        parseAttributesStyle(line, attributes);
        parseAttributesTransform(line, attributes);
        parseAttributesConditional(line, attributes);
        parseAttributesLine(line, attributes);
        this.currentElement.addChild(line);
    }

    private void linearGradient(Attributes attributes) {
        debug("<linearGradient>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.SvgLinearGradient svgLinearGradient = new SVGBase.SvgLinearGradient();
        svgLinearGradient.document = this.svgDocument;
        svgLinearGradient.parent = this.currentElement;
        parseAttributesCore(svgLinearGradient, attributes);
        parseAttributesStyle(svgLinearGradient, attributes);
        parseAttributesGradient(svgLinearGradient, attributes);
        parseAttributesLinearGradient(svgLinearGradient, attributes);
        this.currentElement.addChild(svgLinearGradient);
        this.currentElement = svgLinearGradient;
    }

    private void marker(Attributes attributes) {
        debug("<marker>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.Marker marker = new SVGBase.Marker();
        marker.document = this.svgDocument;
        marker.parent = this.currentElement;
        parseAttributesCore(marker, attributes);
        parseAttributesStyle(marker, attributes);
        parseAttributesConditional(marker, attributes);
        parseAttributesViewBox(marker, attributes);
        parseAttributesMarker(marker, attributes);
        this.currentElement.addChild(marker);
        this.currentElement = marker;
    }

    private void mask(Attributes attributes) {
        debug("<mask>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.Mask mask = new SVGBase.Mask();
        mask.document = this.svgDocument;
        mask.parent = this.currentElement;
        parseAttributesCore(mask, attributes);
        parseAttributesStyle(mask, attributes);
        parseAttributesConditional(mask, attributes);
        parseAttributesMask(mask, attributes);
        this.currentElement.addChild(mask);
        this.currentElement = mask;
    }

    private void parseAttributesA(SVGBase.A a, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if (SVGAttr.fromString(attributes.getLocalName(i)).ordinal() == 38 && ("".equals(attributes.getURI(i)) || XLINK_NAMESPACE.equals(attributes.getURI(i)))) {
                a.href = trim;
            }
        }
    }

    private void parseAttributesCircle(SVGBase.Circle circle, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ordinal = SVGAttr.fromString(attributes.getLocalName(i)).ordinal();
            if (ordinal == 6) {
                circle.cx = parseLength(trim);
            } else if (ordinal == 7) {
                circle.cy = parseLength(trim);
            } else if (ordinal != 64) {
                continue;
            } else {
                SVGBase.Length parseLength = parseLength(trim);
                circle.r = parseLength;
                if (parseLength.isNegative()) {
                    throw new SVGParseException("Invalid <circle> element. r cannot be negative");
                }
            }
        }
    }

    private void parseAttributesClipPath(SVGBase.ClipPath clipPath, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if (SVGAttr.fromString(attributes.getLocalName(i)).ordinal() == 3) {
                if ("objectBoundingBox".equals(trim)) {
                    clipPath.clipPathUnitsAreUser = Boolean.FALSE;
                } else {
                    if (!"userSpaceOnUse".equals(trim)) {
                        throw new SVGParseException("Invalid value for attribute clipPathUnits");
                    }
                    clipPath.clipPathUnitsAreUser = Boolean.TRUE;
                }
            }
        }
    }

    private void parseAttributesConditional(SVGBase.SvgConditional svgConditional, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ordinal = SVGAttr.fromString(attributes.getLocalName(i)).ordinal();
            if (ordinal != 88) {
                switch (ordinal) {
                    case 67:
                        svgConditional.setRequiredFeatures(parseRequiredFeatures(trim));
                        break;
                    case 68:
                        svgConditional.setRequiredExtensions(trim);
                        break;
                    case 69:
                        svgConditional.setRequiredFormats(parseRequiredFormats(trim));
                        break;
                    case 70:
                        List<String> parseFontFamily = parseFontFamily(trim);
                        svgConditional.setRequiredFonts(parseFontFamily != null ? new HashSet(parseFontFamily) : new HashSet(0));
                        break;
                }
            } else {
                svgConditional.setSystemLanguage(parseSystemLanguage(trim));
            }
        }
    }

    private void parseAttributesCore(SVGBase.SvgElementBase svgElementBase, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String qName = attributes.getQName(i);
            if (qName.equals("id") || qName.equals("xml:id")) {
                svgElementBase.id = attributes.getValue(i).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String trim = attributes.getValue(i).trim();
                if ("default".equals(trim)) {
                    svgElementBase.spacePreserve = Boolean.FALSE;
                    return;
                } else {
                    if ("preserve".equals(trim)) {
                        svgElementBase.spacePreserve = Boolean.TRUE;
                        return;
                    }
                    throw new SVGParseException("Invalid value for \"xml:space\" attribute: " + trim);
                }
            }
        }
    }

    private void parseAttributesEllipse(SVGBase.Ellipse ellipse, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ordinal = SVGAttr.fromString(attributes.getLocalName(i)).ordinal();
            if (ordinal == 6) {
                ellipse.cx = parseLength(trim);
            } else if (ordinal == 7) {
                ellipse.cy = parseLength(trim);
            } else if (ordinal == 71) {
                SVGBase.Length parseLength = parseLength(trim);
                ellipse.rx = parseLength;
                if (parseLength.isNegative()) {
                    throw new SVGParseException("Invalid <ellipse> element. rx cannot be negative");
                }
            } else if (ordinal != 72) {
                continue;
            } else {
                SVGBase.Length parseLength2 = parseLength(trim);
                ellipse.ry = parseLength2;
                if (parseLength2.isNegative()) {
                    throw new SVGParseException("Invalid <ellipse> element. ry cannot be negative");
                }
            }
        }
    }

    private void parseAttributesGradient(SVGBase.GradientElement gradientElement, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ordinal = SVGAttr.fromString(attributes.getLocalName(i)).ordinal();
            if (ordinal == 35) {
                gradientElement.gradientTransform = parseTransformList(trim);
            } else if (ordinal != 36) {
                if (ordinal != 38) {
                    if (ordinal != 75) {
                        continue;
                    } else {
                        try {
                            gradientElement.spreadMethod = SVGBase.GradientSpread.valueOf(trim);
                        } catch (IllegalArgumentException unused) {
                            throw new SVGParseException("Invalid spreadMethod attribute. \"" + trim + "\" is not a valid value.");
                        }
                    }
                } else if ("".equals(attributes.getURI(i)) || XLINK_NAMESPACE.equals(attributes.getURI(i))) {
                    gradientElement.href = trim;
                }
            } else if ("objectBoundingBox".equals(trim)) {
                gradientElement.gradientUnitsAreUser = Boolean.FALSE;
            } else {
                if (!"userSpaceOnUse".equals(trim)) {
                    throw new SVGParseException("Invalid value for attribute gradientUnits");
                }
                gradientElement.gradientUnitsAreUser = Boolean.TRUE;
            }
        }
    }

    private void parseAttributesImage(SVGBase.Image image, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ordinal = SVGAttr.fromString(attributes.getLocalName(i)).ordinal();
            if (ordinal == 37) {
                SVGBase.Length parseLength = parseLength(trim);
                image.height = parseLength;
                if (parseLength.isNegative()) {
                    throw new SVGParseException("Invalid <use> element. height cannot be negative");
                }
            } else if (ordinal != 38) {
                if (ordinal == 63) {
                    parsePreserveAspectRatio(image, trim);
                } else if (ordinal == 97) {
                    SVGBase.Length parseLength2 = parseLength(trim);
                    image.width = parseLength2;
                    if (parseLength2.isNegative()) {
                        throw new SVGParseException("Invalid <use> element. width cannot be negative");
                    }
                } else if (ordinal == 100) {
                    image.x = parseLength(trim);
                } else if (ordinal == 101) {
                    image.y = parseLength(trim);
                }
            } else if ("".equals(attributes.getURI(i)) || XLINK_NAMESPACE.equals(attributes.getURI(i))) {
                image.href = trim;
            }
        }
    }

    private void parseAttributesLine(SVGBase.Line line, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (SVGAttr.fromString(attributes.getLocalName(i)).ordinal()) {
                case 102:
                    line.x1 = parseLength(trim);
                    break;
                case 103:
                    line.y1 = parseLength(trim);
                    break;
                case 104:
                    line.x2 = parseLength(trim);
                    break;
                case 105:
                    line.y2 = parseLength(trim);
                    break;
            }
        }
    }

    private void parseAttributesLinearGradient(SVGBase.SvgLinearGradient svgLinearGradient, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (SVGAttr.fromString(attributes.getLocalName(i)).ordinal()) {
                case 102:
                    svgLinearGradient.x1 = parseLength(trim);
                    break;
                case 103:
                    svgLinearGradient.y1 = parseLength(trim);
                    break;
                case 104:
                    svgLinearGradient.x2 = parseLength(trim);
                    break;
                case 105:
                    svgLinearGradient.y2 = parseLength(trim);
                    break;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x009f, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void parseAttributesMarker(SVGBase.Marker marker, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ordinal = SVGAttr.fromString(attributes.getLocalName(i)).ordinal();
            if (ordinal != 56) {
                if (ordinal == 65) {
                    marker.refX = parseLength(trim);
                } else if (ordinal != 66) {
                    switch (ordinal) {
                        case 46:
                            SVGBase.Length parseLength = parseLength(trim);
                            marker.markerHeight = parseLength;
                            if (parseLength.isNegative()) {
                                throw new SVGParseException("Invalid <marker> element. markerHeight cannot be negative");
                            }
                            break;
                        case 47:
                            if (!"strokeWidth".equals(trim)) {
                                if (!"userSpaceOnUse".equals(trim)) {
                                    throw new SVGParseException("Invalid value for attribute markerUnits");
                                }
                                marker.markerUnitsAreUser = true;
                                break;
                            } else {
                                marker.markerUnitsAreUser = false;
                                break;
                            }
                        case 48:
                            SVGBase.Length parseLength2 = parseLength(trim);
                            marker.markerWidth = parseLength2;
                            if (parseLength2.isNegative()) {
                                throw new SVGParseException("Invalid <marker> element. markerWidth cannot be negative");
                            }
                            break;
                    }
                } else {
                    marker.refY = parseLength(trim);
                }
            } else if ("auto".equals(trim)) {
                marker.orient = Float.valueOf(Float.NaN);
            } else {
                marker.orient = Float.valueOf(parseFloat(trim));
            }
        }
    }

    private void parseAttributesMask(SVGBase.Mask mask, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ordinal = SVGAttr.fromString(attributes.getLocalName(i)).ordinal();
            if (ordinal == 37) {
                SVGBase.Length parseLength = parseLength(trim);
                mask.height = parseLength;
                if (parseLength.isNegative()) {
                    throw new SVGParseException("Invalid <mask> element. height cannot be negative");
                }
            } else if (ordinal == 97) {
                SVGBase.Length parseLength2 = parseLength(trim);
                mask.width = parseLength2;
                if (parseLength2.isNegative()) {
                    throw new SVGParseException("Invalid <mask> element. width cannot be negative");
                }
            } else if (ordinal != 50) {
                if (ordinal != 51) {
                    if (ordinal == 100) {
                        mask.x = parseLength(trim);
                    } else if (ordinal == 101) {
                        mask.y = parseLength(trim);
                    }
                } else if ("objectBoundingBox".equals(trim)) {
                    mask.maskUnitsAreUser = Boolean.FALSE;
                } else {
                    if (!"userSpaceOnUse".equals(trim)) {
                        throw new SVGParseException("Invalid value for attribute maskUnits");
                    }
                    mask.maskUnitsAreUser = Boolean.TRUE;
                }
            } else if ("objectBoundingBox".equals(trim)) {
                mask.maskContentUnitsAreUser = Boolean.FALSE;
            } else {
                if (!"userSpaceOnUse".equals(trim)) {
                    throw new SVGParseException("Invalid value for attribute maskContentUnits");
                }
                mask.maskContentUnitsAreUser = Boolean.TRUE;
            }
        }
    }

    private void parseAttributesPath(SVGBase.Path path, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ordinal = SVGAttr.fromString(attributes.getLocalName(i)).ordinal();
            if (ordinal == 14) {
                path.d = parsePath(trim);
            } else if (ordinal != 58) {
                continue;
            } else {
                float parseFloat = parseFloat(trim);
                path.pathLength = Float.valueOf(parseFloat);
                if (parseFloat < 0.0f) {
                    throw new SVGParseException("Invalid <path> element. pathLength cannot be negative");
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c7, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void parseAttributesPattern(SVGBase.Pattern pattern, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ordinal = SVGAttr.fromString(attributes.getLocalName(i)).ordinal();
            if (ordinal == 37) {
                SVGBase.Length parseLength = parseLength(trim);
                pattern.height = parseLength;
                if (parseLength.isNegative()) {
                    throw new SVGParseException("Invalid <pattern> element. height cannot be negative");
                }
            } else if (ordinal != 38) {
                if (ordinal == 97) {
                    SVGBase.Length parseLength2 = parseLength(trim);
                    pattern.width = parseLength2;
                    if (parseLength2.isNegative()) {
                        throw new SVGParseException("Invalid <pattern> element. width cannot be negative");
                    }
                } else if (ordinal == 100) {
                    pattern.x = parseLength(trim);
                } else if (ordinal != 101) {
                    switch (ordinal) {
                        case 59:
                            if (!"objectBoundingBox".equals(trim)) {
                                if (!"userSpaceOnUse".equals(trim)) {
                                    throw new SVGParseException("Invalid value for attribute patternContentUnits");
                                }
                                pattern.patternContentUnitsAreUser = Boolean.TRUE;
                                break;
                            } else {
                                pattern.patternContentUnitsAreUser = Boolean.FALSE;
                                break;
                            }
                        case 60:
                            pattern.patternTransform = parseTransformList(trim);
                            break;
                        case 61:
                            if (!"objectBoundingBox".equals(trim)) {
                                if (!"userSpaceOnUse".equals(trim)) {
                                    throw new SVGParseException("Invalid value for attribute patternUnits");
                                }
                                pattern.patternUnitsAreUser = Boolean.TRUE;
                                break;
                            } else {
                                pattern.patternUnitsAreUser = Boolean.FALSE;
                                break;
                            }
                    }
                } else {
                    pattern.y = parseLength(trim);
                }
            } else if ("".equals(attributes.getURI(i)) || XLINK_NAMESPACE.equals(attributes.getURI(i))) {
                pattern.href = trim;
            }
        }
    }

    private void parseAttributesPolyLine(SVGBase.PolyLine polyLine, Attributes attributes, String str) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (SVGAttr.fromString(attributes.getLocalName(i)) == SVGAttr.points) {
                TextScanner textScanner = new TextScanner(attributes.getValue(i));
                ArrayList arrayList = new ArrayList();
                textScanner.skipWhitespace();
                while (!textScanner.empty()) {
                    float nextFloat = textScanner.nextFloat();
                    if (Float.isNaN(nextFloat)) {
                        throw new SVGParseException("Invalid <" + str + "> points attribute. Non-coordinate content found in list.");
                    }
                    textScanner.skipCommaWhitespace();
                    float nextFloat2 = textScanner.nextFloat();
                    if (Float.isNaN(nextFloat2)) {
                        throw new SVGParseException("Invalid <" + str + "> points attribute. There should be an even number of coordinates.");
                    }
                    textScanner.skipCommaWhitespace();
                    arrayList.add(Float.valueOf(nextFloat));
                    arrayList.add(Float.valueOf(nextFloat2));
                }
                polyLine.points = new float[arrayList.size()];
                int size = arrayList.size();
                int i2 = 0;
                int i3 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    polyLine.points[i3] = ((Float) obj).floatValue();
                    i3++;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void parseAttributesRadialGradient(SVGBase.SvgRadialGradient svgRadialGradient, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ordinal = SVGAttr.fromString(attributes.getLocalName(i)).ordinal();
            if (ordinal == 6) {
                svgRadialGradient.cx = parseLength(trim);
            } else if (ordinal == 7) {
                svgRadialGradient.cy = parseLength(trim);
            } else if (ordinal != 64) {
                switch (ordinal) {
                    case 11:
                        svgRadialGradient.fx = parseLength(trim);
                        break;
                    case 12:
                        svgRadialGradient.fy = parseLength(trim);
                        break;
                    case 13:
                        SVGBase.Length parseLength = parseLength(trim);
                        svgRadialGradient.fr = parseLength;
                        if (parseLength.isNegative()) {
                            throw new SVGParseException("Invalid <radialGradient> element. fr cannot be negative");
                        }
                        break;
                }
            } else {
                SVGBase.Length parseLength2 = parseLength(trim);
                svgRadialGradient.r = parseLength2;
                if (parseLength2.isNegative()) {
                    throw new SVGParseException("Invalid <radialGradient> element. r cannot be negative");
                }
            }
        }
    }

    private void parseAttributesRect(SVGBase.Rect rect, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ordinal = SVGAttr.fromString(attributes.getLocalName(i)).ordinal();
            if (ordinal == 37) {
                SVGBase.Length parseLength = parseLength(trim);
                rect.height = parseLength;
                if (parseLength.isNegative()) {
                    throw new SVGParseException("Invalid <rect> element. height cannot be negative");
                }
            } else if (ordinal == 97) {
                SVGBase.Length parseLength2 = parseLength(trim);
                rect.width = parseLength2;
                if (parseLength2.isNegative()) {
                    throw new SVGParseException("Invalid <rect> element. width cannot be negative");
                }
            } else if (ordinal == 71) {
                SVGBase.Length parseLength3 = parseLength(trim);
                rect.rx = parseLength3;
                if (parseLength3.isNegative()) {
                    throw new SVGParseException("Invalid <rect> element. rx cannot be negative");
                }
            } else if (ordinal == 72) {
                SVGBase.Length parseLength4 = parseLength(trim);
                rect.ry = parseLength4;
                if (parseLength4.isNegative()) {
                    throw new SVGParseException("Invalid <rect> element. ry cannot be negative");
                }
            } else if (ordinal == 100) {
                rect.x = parseLength(trim);
            } else if (ordinal == 101) {
                rect.y = parseLength(trim);
            }
        }
    }

    private void parseAttributesSVG(SVGBase.Svg svg, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ordinal = SVGAttr.fromString(attributes.getLocalName(i)).ordinal();
            if (ordinal == 37) {
                SVGBase.Length parseLength = parseLength(trim);
                svg.height = parseLength;
                if (parseLength.isNegative()) {
                    throw new SVGParseException("Invalid <svg> element. height cannot be negative");
                }
            } else if (ordinal == 95) {
                svg.version = trim;
            } else if (ordinal == 97) {
                SVGBase.Length parseLength2 = parseLength(trim);
                svg.width = parseLength2;
                if (parseLength2.isNegative()) {
                    throw new SVGParseException("Invalid <svg> element. width cannot be negative");
                }
            } else if (ordinal == 100) {
                svg.x = parseLength(trim);
            } else if (ordinal == 101) {
                svg.y = parseLength(trim);
            }
        }
    }

    private void parseAttributesStop(SVGBase.Stop stop, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if (SVGAttr.fromString(attributes.getLocalName(i)).ordinal() == 54) {
                stop.offset = parseGradientOffset(trim);
            }
        }
    }

    private void parseAttributesStyle(SVGBase.SvgElementBase svgElementBase, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if (trim.length() != 0) {
                int ordinal = SVGAttr.fromString(attributes.getLocalName(i)).ordinal();
                if (ordinal == 0) {
                    svgElementBase.classNames = CSSParser.parseClassAttribute(trim);
                } else if (ordinal != 87) {
                    if (svgElementBase.baseStyle == null) {
                        svgElementBase.baseStyle = new Style();
                    }
                    Style.processStyleProperty(svgElementBase.baseStyle, attributes.getLocalName(i), attributes.getValue(i).trim(), true);
                } else {
                    parseStyle(svgElementBase, trim);
                }
            }
        }
    }

    private void parseAttributesTRef(SVGBase.TRef tRef, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if (SVGAttr.fromString(attributes.getLocalName(i)).ordinal() == 38 && ("".equals(attributes.getURI(i)) || XLINK_NAMESPACE.equals(attributes.getURI(i)))) {
                tRef.href = trim;
            }
        }
    }

    private void parseAttributesTextPath(SVGBase.TextPath textPath, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ordinal = SVGAttr.fromString(attributes.getLocalName(i)).ordinal();
            if (ordinal != 38) {
                if (ordinal == 76) {
                    textPath.startOffset = parseLength(trim);
                }
            } else if ("".equals(attributes.getURI(i)) || XLINK_NAMESPACE.equals(attributes.getURI(i))) {
                textPath.href = trim;
            }
        }
    }

    private void parseAttributesTextPosition(SVGBase.TextPositionedContainer textPositionedContainer, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ordinal = SVGAttr.fromString(attributes.getLocalName(i)).ordinal();
            if (ordinal == 9) {
                textPositionedContainer.dx = parseLengthList(trim);
            } else if (ordinal == 10) {
                textPositionedContainer.dy = parseLengthList(trim);
            } else if (ordinal == 100) {
                textPositionedContainer.x = parseLengthList(trim);
            } else if (ordinal == 101) {
                textPositionedContainer.y = parseLengthList(trim);
            }
        }
    }

    private void parseAttributesTransform(SVGBase.HasTransform hasTransform, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (SVGAttr.fromString(attributes.getLocalName(i)) == SVGAttr.transform) {
                hasTransform.setTransform(parseTransformList(attributes.getValue(i)));
            }
        }
    }

    private void parseAttributesUse(SVGBase.Use use, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ordinal = SVGAttr.fromString(attributes.getLocalName(i)).ordinal();
            if (ordinal == 37) {
                SVGBase.Length parseLength = parseLength(trim);
                use.height = parseLength;
                if (parseLength.isNegative()) {
                    throw new SVGParseException("Invalid <use> element. height cannot be negative");
                }
            } else if (ordinal != 38) {
                if (ordinal == 97) {
                    SVGBase.Length parseLength2 = parseLength(trim);
                    use.width = parseLength2;
                    if (parseLength2.isNegative()) {
                        throw new SVGParseException("Invalid <use> element. width cannot be negative");
                    }
                } else if (ordinal == 100) {
                    use.x = parseLength(trim);
                } else if (ordinal == 101) {
                    use.y = parseLength(trim);
                }
            } else if ("".equals(attributes.getURI(i)) || XLINK_NAMESPACE.equals(attributes.getURI(i))) {
                use.href = trim;
            }
        }
    }

    private void parseAttributesViewBox(SVGBase.SvgViewBoxContainer svgViewBoxContainer, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ordinal = SVGAttr.fromString(attributes.getLocalName(i)).ordinal();
            if (ordinal == 63) {
                parsePreserveAspectRatio(svgViewBoxContainer, trim);
            } else if (ordinal == 96) {
                svgViewBoxContainer.viewBox = parseViewBox(trim);
            }
        }
    }

    private void parseCSSStyleSheet(String str) {
        this.svgDocument.addCSSRules(new CSSParser(CSSParser.MediaType.screen, CSSParser.Source.Document, this.externalFileResolver).parse(str));
    }

    static SVGBase.CSSClipRect parseClip(String str) {
        if ("auto".equals(str) || !str.startsWith("rect(")) {
            return null;
        }
        TextScanner textScanner = new TextScanner(str.substring(5));
        textScanner.skipWhitespace();
        SVGBase.Length parseLengthOrAuto = parseLengthOrAuto(textScanner);
        textScanner.skipCommaWhitespace();
        SVGBase.Length parseLengthOrAuto2 = parseLengthOrAuto(textScanner);
        textScanner.skipCommaWhitespace();
        SVGBase.Length parseLengthOrAuto3 = parseLengthOrAuto(textScanner);
        textScanner.skipCommaWhitespace();
        SVGBase.Length parseLengthOrAuto4 = parseLengthOrAuto(textScanner);
        textScanner.skipWhitespace();
        if (textScanner.consume(')') || textScanner.empty()) {
            return new SVGBase.CSSClipRect(parseLengthOrAuto, parseLengthOrAuto2, parseLengthOrAuto3, parseLengthOrAuto4);
        }
        return null;
    }

    static SVGBase.Colour parseColour(String str) {
        if (str.charAt(0) == '#') {
            IntegerParser parseHex = IntegerParser.parseHex(str, 1, str.length());
            if (parseHex == null) {
                return SVGBase.Colour.BLACK;
            }
            int endPos = parseHex.getEndPos();
            if (endPos == 4) {
                int value = parseHex.value();
                int i = value & 3840;
                int i2 = value & 240;
                int i3 = value & 15;
                return new SVGBase.Colour(i3 | (i << 8) | (-16777216) | (i << 12) | (i2 << 8) | (i2 << 4) | (i3 << 4));
            }
            if (endPos != 5) {
                if (endPos == 7) {
                    return new SVGBase.Colour(parseHex.value() | (-16777216));
                }
                if (endPos != 9) {
                    return SVGBase.Colour.BLACK;
                }
                return new SVGBase.Colour((parseHex.value() >>> 8) | (parseHex.value() << 24));
            }
            int value2 = parseHex.value();
            int i4 = 61440 & value2;
            int i5 = value2 & 3840;
            int i6 = value2 & 240;
            int i7 = value2 & 15;
            return new SVGBase.Colour((i7 << 24) | (i7 << 28) | (i4 << 8) | (i4 << 4) | (i5 << 4) | i5 | i6 | (i6 >> 4));
        }
        String lowerCase = str.toLowerCase(Locale.US);
        boolean startsWith = lowerCase.startsWith("rgba(");
        float f = Float.NaN;
        if (startsWith || lowerCase.startsWith("rgb(")) {
            TextScanner textScanner = new TextScanner(str.substring(startsWith ? 5 : 4));
            textScanner.skipWhitespace();
            float nextFloat = textScanner.nextFloat();
            if (!Float.isNaN(nextFloat)) {
                if (textScanner.consume('%')) {
                    nextFloat = (nextFloat * 256.0f) / 100.0f;
                }
                boolean skipCommaWhitespace = textScanner.skipCommaWhitespace();
                float nextFloat2 = textScanner.nextFloat();
                if (!Float.isNaN(nextFloat2)) {
                    if (textScanner.consume('%')) {
                        nextFloat2 = (nextFloat2 * 256.0f) / 100.0f;
                    }
                    if (!skipCommaWhitespace) {
                        textScanner.skipWhitespace();
                    } else if (!textScanner.skipCommaWhitespace()) {
                        return SVGBase.Colour.BLACK;
                    }
                    float nextFloat3 = textScanner.nextFloat();
                    if (!Float.isNaN(nextFloat3)) {
                        if (textScanner.consume('%')) {
                            nextFloat3 = (nextFloat3 * 256.0f) / 100.0f;
                        }
                        if (!skipCommaWhitespace) {
                            textScanner.skipWhitespace();
                            if (textScanner.consume('/')) {
                                textScanner.skipWhitespace();
                                f = textScanner.nextFloat();
                            }
                        } else if (textScanner.skipCommaWhitespace()) {
                            f = textScanner.nextFloat();
                        }
                        textScanner.skipWhitespace();
                        if (!textScanner.consume(')')) {
                            return SVGBase.Colour.BLACK;
                        }
                        if (Float.isNaN(f)) {
                            return new SVGBase.Colour((clamp255(nextFloat) << 16) | (-16777216) | (clamp255(nextFloat2) << 8) | clamp255(nextFloat3));
                        }
                        return new SVGBase.Colour((clamp255(nextFloat) << 16) | (clamp255(f * 256.0f) << 24) | (clamp255(nextFloat2) << 8) | clamp255(nextFloat3));
                    }
                }
            }
        } else {
            boolean startsWith2 = lowerCase.startsWith("hsla(");
            if (startsWith2 || lowerCase.startsWith("hsl(")) {
                TextScanner textScanner2 = new TextScanner(str.substring(startsWith2 ? 5 : 4));
                textScanner2.skipWhitespace();
                float nextFloat4 = textScanner2.nextFloat();
                if (!Float.isNaN(nextFloat4)) {
                    textScanner2.consume("deg");
                    boolean skipCommaWhitespace2 = textScanner2.skipCommaWhitespace();
                    float nextFloat5 = textScanner2.nextFloat();
                    if (!Float.isNaN(nextFloat5)) {
                        if (!textScanner2.consume('%')) {
                            return SVGBase.Colour.BLACK;
                        }
                        if (!skipCommaWhitespace2) {
                            textScanner2.skipWhitespace();
                        } else if (!textScanner2.skipCommaWhitespace()) {
                            return SVGBase.Colour.BLACK;
                        }
                        float nextFloat6 = textScanner2.nextFloat();
                        if (!Float.isNaN(nextFloat6)) {
                            if (!textScanner2.consume('%')) {
                                return SVGBase.Colour.BLACK;
                            }
                            if (!skipCommaWhitespace2) {
                                textScanner2.skipWhitespace();
                                if (textScanner2.consume('/')) {
                                    textScanner2.skipWhitespace();
                                    f = textScanner2.nextFloat();
                                }
                            } else if (textScanner2.skipCommaWhitespace()) {
                                f = textScanner2.nextFloat();
                            }
                            textScanner2.skipWhitespace();
                            if (!textScanner2.consume(')')) {
                                return SVGBase.Colour.BLACK;
                            }
                            if (Float.isNaN(f)) {
                                return new SVGBase.Colour(hslToRgb(nextFloat4, nextFloat5, nextFloat6) | (-16777216));
                            }
                            return new SVGBase.Colour(hslToRgb(nextFloat4, nextFloat5, nextFloat6) | (clamp255(f * 256.0f) << 24));
                        }
                    }
                }
            }
        }
        return parseColourKeyword(lowerCase);
    }

    private static SVGBase.Colour parseColourKeyword(String str) {
        Integer num = ColourKeywords.get(str);
        return num == null ? SVGBase.Colour.BLACK : new SVGBase.Colour(num.intValue());
    }

    private static SVGBase.SvgPaint parseColourSpecifer(String str) {
        str.getClass();
        return !str.equals("none") ? !str.equals(CURRENTCOLOR) ? parseColour(str) : SVGBase.CurrentColor.getInstance() : SVGBase.Colour.TRANSPARENT;
    }

    static Style.FillRule parseFillRule(String str) {
        if ("nonzero".equals(str)) {
            return Style.FillRule.NonZero;
        }
        if ("evenodd".equals(str)) {
            return Style.FillRule.EvenOdd;
        }
        return null;
    }

    static float parseFloat(String str) {
        int length = str.length();
        if (length != 0) {
            return parseFloat(str, 0, length);
        }
        throw new SVGParseException("Invalid float value (empty string)");
    }

    static void parseFont(Style style, String str) {
        String nextToken;
        if ("|caption|icon|menu|message-box|small-caption|status-bar|".contains('|' + str + '|')) {
            return;
        }
        TextScanner textScanner = new TextScanner(str);
        Float f = null;
        Style.FontStyle fontStyle = null;
        Boolean bool = null;
        Float f2 = null;
        while (true) {
            nextToken = textScanner.nextToken('/');
            textScanner.skipWhitespace();
            if (nextToken != null) {
                if (f != null && fontStyle != null) {
                    break;
                }
                if (!nextToken.equals(Constants.NORMAL)) {
                    if (f == null && FontWeightKeywords.contains(nextToken)) {
                        f = FontWeightKeywords.get(nextToken);
                    } else if (fontStyle != null || (fontStyle = parseFontStyle(nextToken)) == null) {
                        if (bool != null || !nextToken.equals("small-caps")) {
                            if (f2 != null || !FontStretchKeywords.contains(nextToken)) {
                                break;
                            } else {
                                f2 = FontStretchKeywords.get(nextToken);
                            }
                        } else {
                            bool = Boolean.TRUE;
                        }
                    }
                }
            } else {
                return;
            }
        }
        SVGBase.Length parseFontSize = parseFontSize(nextToken);
        if (textScanner.consume('/')) {
            textScanner.skipWhitespace();
            String nextToken2 = textScanner.nextToken();
            if (nextToken2 != null) {
                try {
                    parseLength(nextToken2);
                } catch (SVGParseException unused) {
                    return;
                }
            }
            textScanner.skipWhitespace();
        }
        style.fontFamily = parseFontFamily(textScanner.restOfText());
        style.fontSize = parseFontSize;
        style.fontWeight = Float.valueOf(f == null ? 400.0f : f.floatValue());
        if (fontStyle == null) {
            fontStyle = Style.FontStyle.normal;
        }
        style.fontStyle = fontStyle;
        style.fontStretch = Float.valueOf(f2 == null ? 100.0f : f2.floatValue());
        style.fontKerning = Style.FontKerning.auto;
        style.fontVariantLigatures = CSSFontFeatureSettings.LIGATURES_NORMAL;
        style.fontVariantPosition = CSSFontFeatureSettings.POSITION_ALL_OFF;
        style.fontVariantCaps = CSSFontFeatureSettings.CAPS_ALL_OFF;
        if (bool == Boolean.TRUE) {
            style.fontVariantCaps = CSSFontFeatureSettings.makeSmallCaps();
        }
        style.fontVariantNumeric = CSSFontFeatureSettings.NUMERIC_ALL_OFF;
        style.fontVariantEastAsian = CSSFontFeatureSettings.EAST_ASIAN_ALL_OFF;
        style.fontFeatureSettings = CSSFontFeatureSettings.FONT_FEATURE_SETTINGS_NORMAL;
        style.fontVariationSettings = null;
        style.specifiedFlags |= 4009918906621952L;
    }

    static List<String> parseFontFamily(String str) {
        TextScanner textScanner = new TextScanner(str);
        ArrayList arrayList = null;
        do {
            String nextQuotedString = textScanner.nextQuotedString();
            if (nextQuotedString == null) {
                nextQuotedString = textScanner.nextTokenWithWhitespace(',');
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

    static SVGBase.Length parseFontSize(String str) {
        try {
            SVGBase.Length length = FontSizeKeywords.get(str);
            return length == null ? parseLength(str) : length;
        } catch (SVGParseException unused) {
            return null;
        }
    }

    static Float parseFontStretch(String str) {
        Float f = FontStretchKeywords.get(str);
        if (f != null) {
            return f;
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

    static Style.FontStyle parseFontStyle(String str) {
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

    static Float parseFontWeight(String str) {
        Float f = FontWeightKeywords.get(str);
        if (f != null) {
            return f;
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

    static String parseFunctionalIRI(String str, String str2) {
        if (!str.equals("none") && str.startsWith("url(")) {
            return str.endsWith(")") ? str.substring(4, str.length() - 1).trim() : str.substring(4).trim();
        }
        return null;
    }

    private Float parseGradientOffset(String str) {
        if (str.length() == 0) {
            throw new SVGParseException("Invalid offset value in <stop> (empty string)");
        }
        int length = str.length();
        boolean z = true;
        if (str.charAt(str.length() - 1) == '%') {
            length--;
        } else {
            z = false;
        }
        try {
            float parseFloat = parseFloat(str, 0, length);
            float f = 100.0f;
            if (z) {
                parseFloat /= 100.0f;
            }
            if (parseFloat < 0.0f) {
                f = 0.0f;
            } else if (parseFloat <= 100.0f) {
                f = parseFloat;
            }
            return Float.valueOf(f);
        } catch (NumberFormatException e) {
            throw new SVGParseException("Invalid offset value in <stop>: " + str, e);
        }
    }

    static Style.Isolation parseIsolation(String str) {
        str.getClass();
        if (str.equals("auto")) {
            return Style.Isolation.auto;
        }
        if (str.equals("isolate")) {
            return Style.Isolation.isolate;
        }
        return null;
    }

    static SVGBase.Length parseLength(String str) {
        if (str.length() == 0) {
            throw new SVGParseException("Invalid length value (empty string)");
        }
        int length = str.length();
        SVGBase.Unit unit = SVGBase.Unit.px;
        char charAt = str.charAt(length - 1);
        if (charAt == '%') {
            length--;
            unit = SVGBase.Unit.percent;
        } else if (length > 2 && Character.isLetter(charAt) && Character.isLetter(str.charAt(length - 2))) {
            length -= 2;
            try {
                unit = SVGBase.Unit.valueOf(str.substring(length).toLowerCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                throw new SVGParseException("Invalid length unit specifier: " + str);
            }
        }
        try {
            return new SVGBase.Length(parseFloat(str, 0, length), unit);
        } catch (NumberFormatException e) {
            throw new SVGParseException("Invalid length value: " + str, e);
        }
    }

    private static List<SVGBase.Length> parseLengthList(String str) {
        if (str.length() == 0) {
            throw new SVGParseException("Invalid length list (empty string)");
        }
        ArrayList arrayList = new ArrayList(1);
        TextScanner textScanner = new TextScanner(str);
        textScanner.skipWhitespace();
        while (!textScanner.empty()) {
            float nextFloat = textScanner.nextFloat();
            if (Float.isNaN(nextFloat)) {
                throw new SVGParseException("Invalid length list value: " + textScanner.ahead());
            }
            SVGBase.Unit nextUnit = textScanner.nextUnit();
            if (nextUnit == null) {
                nextUnit = SVGBase.Unit.px;
            }
            arrayList.add(new SVGBase.Length(nextFloat, nextUnit));
            textScanner.skipCommaWhitespace();
        }
        return arrayList;
    }

    private static SVGBase.Length parseLengthOrAuto(TextScanner textScanner) {
        return textScanner.consume("auto") ? SVGBase.Length.ZERO : textScanner.nextLength();
    }

    static SVGBase.Length parseLetterOrWordSpacing(String str) {
        if (Constants.NORMAL.equals(str)) {
            return SVGBase.Length.ZERO;
        }
        try {
            SVGBase.Length parseLength = parseLength(str);
            if (parseLength.unit == SVGBase.Unit.percent) {
                return null;
            }
            return parseLength;
        } catch (SVGParseException unused) {
            return null;
        }
    }

    static Float parseOpacity(String str) {
        try {
            float parseFloat = parseFloat(str);
            float f = 0.0f;
            if (parseFloat >= 0.0f) {
                f = Math.min(parseFloat, 1.0f);
            }
            return Float.valueOf(f);
        } catch (SVGParseException unused) {
            return null;
        }
    }

    static Boolean parseOverflow(String str) {
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

    static SVGBase.SvgPaint parsePaintSpecifier(String str) {
        if (!str.startsWith("url(")) {
            return parseColourSpecifer(str);
        }
        int indexOf = str.indexOf(")");
        if (indexOf == -1) {
            return new SVGBase.PaintReference(str.substring(4).trim(), null);
        }
        String trim = str.substring(4, indexOf).trim();
        String trim2 = str.substring(indexOf + 1).trim();
        return new SVGBase.PaintReference(trim, trim2.length() > 0 ? parseColourSpecifer(trim2) : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0287 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected static SVGBase.PathDefinition parsePath(String str) {
        float checkedNextFloat;
        float f;
        float f2;
        float f3;
        TextScanner textScanner = new TextScanner(str);
        SVGBase.PathDefinition pathDefinition = new SVGBase.PathDefinition();
        if (!textScanner.empty()) {
            int intValue = textScanner.nextChar().intValue();
            int i = 109;
            if (intValue == 77 || intValue == 109) {
                int i2 = intValue;
                float f4 = 0.0f;
                float f5 = 0.0f;
                float f6 = 0.0f;
                float f7 = 0.0f;
                float f8 = 0.0f;
                float f9 = 0.0f;
                while (true) {
                    textScanner.skipWhitespace();
                    switch (i2) {
                        case 65:
                        case 97:
                            float nextFloat = textScanner.nextFloat();
                            float checkedNextFloat2 = textScanner.checkedNextFloat(nextFloat);
                            float checkedNextFloat3 = textScanner.checkedNextFloat(checkedNextFloat2);
                            Boolean checkedNextFlag = textScanner.checkedNextFlag(Float.valueOf(checkedNextFloat3));
                            Boolean checkedNextFlag2 = textScanner.checkedNextFlag(checkedNextFlag);
                            float checkedNextFloat4 = textScanner.checkedNextFloat(checkedNextFlag2);
                            float checkedNextFloat5 = textScanner.checkedNextFloat(checkedNextFloat4);
                            if (!Float.isNaN(checkedNextFloat5) && nextFloat >= 0.0f && checkedNextFloat2 >= 0.0f) {
                                if (i2 == 97) {
                                    checkedNextFloat4 += f5;
                                    checkedNextFloat5 += f4;
                                }
                                pathDefinition.arcTo(nextFloat, checkedNextFloat2, checkedNextFloat3, checkedNextFlag.booleanValue(), checkedNextFlag2.booleanValue(), checkedNextFloat4, checkedNextFloat5);
                                f5 = checkedNextFloat4;
                                f6 = f5;
                                f4 = checkedNextFloat5;
                                f7 = f4;
                                textScanner.skipCommaWhitespace();
                                if (!textScanner.empty()) {
                                    break;
                                } else {
                                    if (textScanner.hasLetter()) {
                                        i2 = textScanner.nextChar().intValue();
                                    }
                                    i = 109;
                                }
                            }
                            break;
                        case 67:
                        case 99:
                            float nextFloat2 = textScanner.nextFloat();
                            float checkedNextFloat6 = textScanner.checkedNextFloat(nextFloat2);
                            float checkedNextFloat7 = textScanner.checkedNextFloat(checkedNextFloat6);
                            float checkedNextFloat8 = textScanner.checkedNextFloat(checkedNextFloat7);
                            float checkedNextFloat9 = textScanner.checkedNextFloat(checkedNextFloat8);
                            checkedNextFloat = textScanner.checkedNextFloat(checkedNextFloat9);
                            if (Float.isNaN(checkedNextFloat)) {
                                Log.e(TAG, "Bad path coords for " + ((char) i2) + " path segment");
                                break;
                            } else {
                                if (i2 == 99) {
                                    checkedNextFloat9 += f5;
                                    checkedNextFloat += f4;
                                    nextFloat2 += f5;
                                    checkedNextFloat6 += f4;
                                    checkedNextFloat7 += f5;
                                    checkedNextFloat8 += f4;
                                }
                                f = checkedNextFloat8;
                                f2 = checkedNextFloat9;
                                f3 = checkedNextFloat7;
                                pathDefinition.cubicTo(nextFloat2, checkedNextFloat6, f3, f, f2, checkedNextFloat);
                                f7 = f;
                                f6 = f3;
                                f5 = f2;
                                f4 = checkedNextFloat;
                                textScanner.skipCommaWhitespace();
                                if (!textScanner.empty()) {
                                }
                            }
                            break;
                        case TokenParametersOuterClass$TokenParameters.MEDIAMUTED_FIELD_NUMBER /* 72 */:
                        case 104:
                            float nextFloat3 = textScanner.nextFloat();
                            if (Float.isNaN(nextFloat3)) {
                                Log.e(TAG, "Bad path coords for " + ((char) i2) + " path segment");
                                break;
                            } else {
                                if (i2 == 104) {
                                    nextFloat3 += f5;
                                }
                                f5 = nextFloat3;
                                pathDefinition.lineTo(f5, f4);
                                f7 = f4;
                                f6 = f5;
                                textScanner.skipCommaWhitespace();
                                if (!textScanner.empty()) {
                                }
                            }
                            break;
                        case TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER /* 76 */:
                        case 108:
                            float nextFloat4 = textScanner.nextFloat();
                            float checkedNextFloat10 = textScanner.checkedNextFloat(nextFloat4);
                            if (Float.isNaN(checkedNextFloat10)) {
                                Log.e(TAG, "Bad path coords for " + ((char) i2) + " path segment");
                                break;
                            } else {
                                if (i2 == 108) {
                                    nextFloat4 += f5;
                                    checkedNextFloat10 += f4;
                                }
                                f5 = nextFloat4;
                                f4 = checkedNextFloat10;
                                pathDefinition.lineTo(f5, f4);
                                f7 = f4;
                                f6 = f5;
                                textScanner.skipCommaWhitespace();
                                if (!textScanner.empty()) {
                                }
                            }
                            break;
                        case TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER /* 77 */:
                        case 109:
                            float nextFloat5 = textScanner.nextFloat();
                            float checkedNextFloat11 = textScanner.checkedNextFloat(nextFloat5);
                            if (Float.isNaN(checkedNextFloat11)) {
                                Log.e(TAG, "Bad path coords for " + ((char) i2) + " path segment");
                                break;
                            } else {
                                if (i2 == i && !pathDefinition.isEmpty()) {
                                    nextFloat5 += f5;
                                    checkedNextFloat11 += f4;
                                }
                                f5 = nextFloat5;
                                f4 = checkedNextFloat11;
                                pathDefinition.moveTo(f5, f4);
                                f7 = f4;
                                f9 = f7;
                                f6 = f5;
                                f8 = f6;
                                i2 = i2 != i ? 76 : 108;
                                textScanner.skipCommaWhitespace();
                                if (!textScanner.empty()) {
                                }
                            }
                            break;
                        case 81:
                        case 113:
                            float nextFloat6 = textScanner.nextFloat();
                            float checkedNextFloat12 = textScanner.checkedNextFloat(nextFloat6);
                            float checkedNextFloat13 = textScanner.checkedNextFloat(checkedNextFloat12);
                            float checkedNextFloat14 = textScanner.checkedNextFloat(checkedNextFloat13);
                            if (Float.isNaN(checkedNextFloat14)) {
                                Log.e(TAG, "Bad path coords for " + ((char) i2) + " path segment");
                                break;
                            } else {
                                if (i2 == 113) {
                                    checkedNextFloat13 += f5;
                                    checkedNextFloat14 += f4;
                                    nextFloat6 += f5;
                                    checkedNextFloat12 += f4;
                                }
                                float f10 = nextFloat6;
                                float f11 = checkedNextFloat12;
                                pathDefinition.quadTo(f10, f11, checkedNextFloat13, checkedNextFloat14);
                                f7 = f11;
                                f6 = f10;
                                f5 = checkedNextFloat13;
                                f4 = checkedNextFloat14;
                                textScanner.skipCommaWhitespace();
                                if (!textScanner.empty()) {
                                }
                            }
                            break;
                        case 83:
                        case 115:
                            float f12 = (f5 * 2.0f) - f6;
                            float f13 = (2.0f * f4) - f7;
                            float nextFloat7 = textScanner.nextFloat();
                            float checkedNextFloat15 = textScanner.checkedNextFloat(nextFloat7);
                            float checkedNextFloat16 = textScanner.checkedNextFloat(checkedNextFloat15);
                            checkedNextFloat = textScanner.checkedNextFloat(checkedNextFloat16);
                            if (Float.isNaN(checkedNextFloat)) {
                                Log.e(TAG, "Bad path coords for " + ((char) i2) + " path segment");
                                break;
                            } else {
                                if (i2 == 115) {
                                    checkedNextFloat16 += f5;
                                    checkedNextFloat += f4;
                                    nextFloat7 += f5;
                                    checkedNextFloat15 += f4;
                                }
                                f = checkedNextFloat15;
                                f2 = checkedNextFloat16;
                                f3 = nextFloat7;
                                pathDefinition.cubicTo(f12, f13, f3, f, f2, checkedNextFloat);
                                f7 = f;
                                f6 = f3;
                                f5 = f2;
                                f4 = checkedNextFloat;
                                textScanner.skipCommaWhitespace();
                                if (!textScanner.empty()) {
                                }
                            }
                            break;
                        case 84:
                        case 116:
                            float f14 = (f5 * 2.0f) - f6;
                            float f15 = (2.0f * f4) - f7;
                            float nextFloat8 = textScanner.nextFloat();
                            float checkedNextFloat17 = textScanner.checkedNextFloat(nextFloat8);
                            if (Float.isNaN(checkedNextFloat17)) {
                                Log.e(TAG, "Bad path coords for " + ((char) i2) + " path segment");
                                break;
                            } else {
                                if (i2 == 116) {
                                    nextFloat8 += f5;
                                    checkedNextFloat17 += f4;
                                }
                                f5 = nextFloat8;
                                f4 = checkedNextFloat17;
                                pathDefinition.quadTo(f14, f15, f5, f4);
                                f6 = f14;
                                f7 = f15;
                                textScanner.skipCommaWhitespace();
                                if (!textScanner.empty()) {
                                }
                            }
                            break;
                        case 86:
                        case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                            float nextFloat9 = textScanner.nextFloat();
                            if (Float.isNaN(nextFloat9)) {
                                Log.e(TAG, "Bad path coords for " + ((char) i2) + " path segment");
                                break;
                            } else {
                                if (i2 == 118) {
                                    nextFloat9 += f4;
                                }
                                f4 = nextFloat9;
                                pathDefinition.lineTo(f5, f4);
                                f7 = f4;
                                f6 = f5;
                                textScanner.skipCommaWhitespace();
                                if (!textScanner.empty()) {
                                }
                            }
                            break;
                        case 90:
                        case INVALID_ADS_ENDPOINT_VALUE:
                            pathDefinition.close();
                            f5 = f8;
                            f6 = f5;
                            f4 = f9;
                            f7 = f4;
                            textScanner.skipCommaWhitespace();
                            if (!textScanner.empty()) {
                            }
                            break;
                    }
                    return pathDefinition;
                }
            }
        }
        return pathDefinition;
    }

    private static void parsePreserveAspectRatio(SVGBase.SvgPreserveAspectRatioContainer svgPreserveAspectRatioContainer, String str) {
        svgPreserveAspectRatioContainer.preserveAspectRatio = PreserveAspectRatio.of(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> parseProcessingInstructionAttributes(TextScanner textScanner) {
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

    static Style.RenderQuality parseRenderQuality(String str) {
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

    private static Set<String> parseRequiredFeatures(String str) {
        TextScanner textScanner = new TextScanner(str);
        HashSet hashSet = new HashSet();
        while (!textScanner.empty()) {
            String nextToken = textScanner.nextToken();
            if (nextToken.startsWith(FEATURE_STRING_PREFIX)) {
                hashSet.add(nextToken.substring(35));
            } else {
                hashSet.add("UNSUPPORTED");
            }
            textScanner.skipWhitespace();
        }
        return hashSet;
    }

    private static Set<String> parseRequiredFormats(String str) {
        TextScanner textScanner = new TextScanner(str);
        HashSet hashSet = new HashSet();
        while (!textScanner.empty()) {
            hashSet.add(textScanner.nextToken());
            textScanner.skipWhitespace();
        }
        return hashSet;
    }

    static SVGBase.Length[] parseStrokeDashArray(String str) {
        SVGBase.Length nextLength;
        TextScanner textScanner = new TextScanner(str);
        textScanner.skipWhitespace();
        if (textScanner.empty() || (nextLength = textScanner.nextLength()) == null || nextLength.isNegative()) {
            return null;
        }
        float floatValue = nextLength.floatValue();
        ArrayList arrayList = new ArrayList();
        arrayList.add(nextLength);
        while (!textScanner.empty()) {
            textScanner.skipCommaWhitespace();
            SVGBase.Length nextLength2 = textScanner.nextLength();
            if (nextLength2 == null || nextLength2.isNegative()) {
                return null;
            }
            arrayList.add(nextLength2);
            floatValue += nextLength2.floatValue();
        }
        if (floatValue == 0.0f) {
            return null;
        }
        return (SVGBase.Length[]) arrayList.toArray(new SVGBase.Length[0]);
    }

    static Style.LineCap parseStrokeLineCap(String str) {
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

    static Style.LineJoin parseStrokeLineJoin(String str) {
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

    private static void parseStyle(SVGBase.SvgElementBase svgElementBase, String str) {
        CSSTextScanner cSSTextScanner = new CSSTextScanner(PATTERN_BLOCK_COMMENTS.matcher(str).replaceAll(""));
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
                        if (svgElementBase.style == null) {
                            svgElementBase.style = new Style();
                        }
                        Style.processStyleProperty(svgElementBase.style, nextIdentifier, nextPropertyValue, false);
                        cSSTextScanner.skipWhitespace();
                    }
                }
            }
        }
    }

    private static Set<String> parseSystemLanguage(String str) {
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

    static Style.TextAnchor parseTextAnchor(String str) {
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

    static Style.TextDecoration parseTextDecoration(String str) {
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

    static Style.TextDirection parseTextDirection(String str) {
        str.getClass();
        if (str.equals("ltr")) {
            return Style.TextDirection.LTR;
        }
        if (str.equals("rtl")) {
            return Style.TextDirection.RTL;
        }
        return null;
    }

    private Matrix parseTransformList(String str) {
        Matrix matrix = new Matrix();
        TextScanner textScanner = new TextScanner(str);
        textScanner.skipWhitespace();
        while (!textScanner.empty()) {
            String nextFunction = textScanner.nextFunction();
            if (nextFunction == null) {
                throw new SVGParseException("Bad transform function encountered in transform list: " + str);
            }
            switch (nextFunction) {
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
                    float possibleNextFloat = textScanner.possibleNextFloat();
                    float possibleNextFloat2 = textScanner.possibleNextFloat();
                    textScanner.skipWhitespace();
                    if (Float.isNaN(nextFloat7) || !textScanner.consume(')')) {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                    if (Float.isNaN(possibleNextFloat)) {
                        matrix.preRotate(nextFloat7);
                        break;
                    } else if (!Float.isNaN(possibleNextFloat2)) {
                        matrix.preRotate(nextFloat7, possibleNextFloat, possibleNextFloat2);
                        break;
                    } else {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                case "scale":
                    textScanner.skipWhitespace();
                    float nextFloat8 = textScanner.nextFloat();
                    float possibleNextFloat3 = textScanner.possibleNextFloat();
                    textScanner.skipWhitespace();
                    if (!Float.isNaN(nextFloat8) && textScanner.consume(')')) {
                        if (!Float.isNaN(possibleNextFloat3)) {
                            matrix.preScale(nextFloat8, possibleNextFloat3);
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
                    float possibleNextFloat4 = textScanner.possibleNextFloat();
                    textScanner.skipWhitespace();
                    if (!Float.isNaN(nextFloat11) && textScanner.consume(')')) {
                        if (!Float.isNaN(possibleNextFloat4)) {
                            matrix.preTranslate(nextFloat11, possibleNextFloat4);
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
                    throw new SVGParseException("Invalid transform list fn: " + nextFunction + ")");
            }
            if (textScanner.empty()) {
                return matrix;
            }
            textScanner.skipCommaWhitespace();
        }
        return matrix;
    }

    private void parseUsingSAX(InputStream inputStream) {
        try {
            SAXParserFactory newInstance = SAXParserFactory.newInstance();
            if (!FORCE_SAX_ON_EARLY_ANDROIDS) {
                newInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
                newInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            }
            XMLReader xMLReader = newInstance.newSAXParser().getXMLReader();
            SAXHandler sAXHandler = new SAXHandler();
            xMLReader.setContentHandler(sAXHandler);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", sAXHandler);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e) {
            throw new SVGParseException("Stream error", e);
        } catch (ParserConfigurationException e2) {
            throw new SVGParseException("XML parser problem", e2);
        } catch (SAXException e3) {
            throw new SVGParseException("SVG parse error", e3);
        }
    }

    private void parseUsingXmlPullParser(InputStream inputStream) {
        try {
            XmlPullParser newPullParser = Xml.newPullParser();
            XPPAttributesWrapper xPPAttributesWrapper = new XPPAttributesWrapper(newPullParser);
            newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
            newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
            newPullParser.setInput(inputStream, null);
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.nextToken()) {
                if (eventType == 0) {
                    startDocument();
                } else if (eventType == 8) {
                    TextScanner textScanner = new TextScanner(newPullParser.getText());
                    handleProcessingInstruction(textScanner.nextToken(), parseProcessingInstructionAttributes(textScanner));
                } else if (eventType == 2) {
                    String name = newPullParser.getName();
                    if (newPullParser.getPrefix() != null) {
                        name = newPullParser.getPrefix() + ':' + name;
                    }
                    startElement(newPullParser.getNamespace(), newPullParser.getName(), name, xPPAttributesWrapper);
                } else if (eventType == 3) {
                    String name2 = newPullParser.getName();
                    if (newPullParser.getPrefix() != null) {
                        name2 = newPullParser.getPrefix() + ':' + name2;
                    }
                    endElement(newPullParser.getNamespace(), newPullParser.getName(), name2);
                } else if (eventType == 4) {
                    int[] iArr = new int[2];
                    text(newPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                } else if (eventType == 5) {
                    text(newPullParser.getText());
                } else if (eventType == 6) {
                    text(newPullParser.getText());
                }
            }
            endDocument();
        } catch (IOException e) {
            throw new SVGParseException("Stream error", e);
        } catch (XmlPullParserException e2) {
            throw new SVGParseException("XML parser problem", e2);
        }
    }

    static Style.VectorEffect parseVectorEffect(String str) {
        str.getClass();
        if (str.equals("none")) {
            return Style.VectorEffect.None;
        }
        if (str.equals("non-scaling-stroke")) {
            return Style.VectorEffect.NonScalingStroke;
        }
        return null;
    }

    private static SVGBase.Box parseViewBox(String str) {
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
            return new SVGBase.Box(nextFloat, nextFloat2, nextFloat3, nextFloat4);
        }
        throw new SVGParseException("Invalid viewBox. height cannot be negative");
    }

    private void path(Attributes attributes) {
        debug("<path>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.Path path = new SVGBase.Path();
        path.document = this.svgDocument;
        path.parent = this.currentElement;
        parseAttributesCore(path, attributes);
        parseAttributesStyle(path, attributes);
        parseAttributesTransform(path, attributes);
        parseAttributesConditional(path, attributes);
        parseAttributesPath(path, attributes);
        this.currentElement.addChild(path);
    }

    private void pattern(Attributes attributes) {
        debug("<pattern>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.Pattern pattern = new SVGBase.Pattern();
        pattern.document = this.svgDocument;
        pattern.parent = this.currentElement;
        parseAttributesCore(pattern, attributes);
        parseAttributesStyle(pattern, attributes);
        parseAttributesConditional(pattern, attributes);
        parseAttributesViewBox(pattern, attributes);
        parseAttributesPattern(pattern, attributes);
        this.currentElement.addChild(pattern);
        this.currentElement = pattern;
    }

    private void polygon(Attributes attributes) {
        debug("<polygon>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.PolyLine polygon = new SVGBase.Polygon();
        polygon.document = this.svgDocument;
        polygon.parent = this.currentElement;
        parseAttributesCore(polygon, attributes);
        parseAttributesStyle(polygon, attributes);
        parseAttributesTransform(polygon, attributes);
        parseAttributesConditional(polygon, attributes);
        parseAttributesPolyLine(polygon, attributes, "polygon");
        this.currentElement.addChild(polygon);
    }

    private void polyline(Attributes attributes) {
        debug("<polyline>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.PolyLine polyLine = new SVGBase.PolyLine();
        polyLine.document = this.svgDocument;
        polyLine.parent = this.currentElement;
        parseAttributesCore(polyLine, attributes);
        parseAttributesStyle(polyLine, attributes);
        parseAttributesTransform(polyLine, attributes);
        parseAttributesConditional(polyLine, attributes);
        parseAttributesPolyLine(polyLine, attributes, "polyline");
        this.currentElement.addChild(polyLine);
    }

    private void radialGradient(Attributes attributes) {
        debug("<radialGradient>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.SvgRadialGradient svgRadialGradient = new SVGBase.SvgRadialGradient();
        svgRadialGradient.document = this.svgDocument;
        svgRadialGradient.parent = this.currentElement;
        parseAttributesCore(svgRadialGradient, attributes);
        parseAttributesStyle(svgRadialGradient, attributes);
        parseAttributesGradient(svgRadialGradient, attributes);
        parseAttributesRadialGradient(svgRadialGradient, attributes);
        this.currentElement.addChild(svgRadialGradient);
        this.currentElement = svgRadialGradient;
    }

    private void rect(Attributes attributes) {
        debug("<rect>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.Rect rect = new SVGBase.Rect();
        rect.document = this.svgDocument;
        rect.parent = this.currentElement;
        parseAttributesCore(rect, attributes);
        parseAttributesStyle(rect, attributes);
        parseAttributesTransform(rect, attributes);
        parseAttributesConditional(rect, attributes);
        parseAttributesRect(rect, attributes);
        this.currentElement.addChild(rect);
    }

    private void solidColor(Attributes attributes) {
        debug("<solidColor>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.SolidColor solidColor = new SVGBase.SolidColor();
        solidColor.document = this.svgDocument;
        solidColor.parent = this.currentElement;
        parseAttributesCore(solidColor, attributes);
        parseAttributesStyle(solidColor, attributes);
        this.currentElement.addChild(solidColor);
        this.currentElement = solidColor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startDocument() {
        this.svgDocument = new SVGBase(this.enableInternalEntities, this.externalFileResolver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startElement(String str, String str2, String str3, Attributes attributes) {
        if (this.ignoring) {
            this.ignoreDepth++;
        }
        if (SVG_NAMESPACE.equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            SVGElem fromString = SVGElem.fromString(str2);
            switch (fromString) {
                case svg:
                    svg(attributes);
                    break;
                case a:
                    a(attributes);
                    break;
                case circle:
                    circle(attributes);
                    break;
                case clipPath:
                    clipPath(attributes);
                    break;
                case defs:
                    defs(attributes);
                    break;
                case desc:
                case title:
                    this.inMetadataElement = true;
                    this.metadataTag = fromString;
                    break;
                case ellipse:
                    ellipse(attributes);
                    break;
                case g:
                    g(attributes);
                    break;
                case image:
                    image(attributes);
                    break;
                case line:
                    line(attributes);
                    break;
                case linearGradient:
                    linearGradient(attributes);
                    break;
                case marker:
                    marker(attributes);
                    break;
                case mask:
                    mask(attributes);
                    break;
                case path:
                    path(attributes);
                    break;
                case pattern:
                    pattern(attributes);
                    break;
                case polygon:
                    polygon(attributes);
                    break;
                case polyline:
                    polyline(attributes);
                    break;
                case radialGradient:
                    radialGradient(attributes);
                    break;
                case rect:
                    rect(attributes);
                    break;
                case solidColor:
                    solidColor(attributes);
                    break;
                case stop:
                    stop(attributes);
                    break;
                case style:
                    style(attributes);
                    break;
                case SWITCH:
                    zwitch(attributes);
                    break;
                case symbol:
                    symbol(attributes);
                    break;
                case text:
                    text(attributes);
                    break;
                case textPath:
                    textPath(attributes);
                    break;
                case tref:
                    tref(attributes);
                    break;
                case tspan:
                    tspan(attributes);
                    break;
                case use:
                    use(attributes);
                    break;
                case view:
                    view(attributes);
                    break;
                default:
                    this.ignoring = true;
                    this.ignoreDepth = 1;
                    break;
            }
        }
    }

    private void stop(Attributes attributes) {
        debug("<stop>", new Object[0]);
        SVGBase.SvgContainer svgContainer = this.currentElement;
        if (svgContainer == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        if (!(svgContainer instanceof SVGBase.GradientElement)) {
            throw new SVGParseException("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
        }
        SVGBase.Stop stop = new SVGBase.Stop();
        stop.document = this.svgDocument;
        stop.parent = this.currentElement;
        parseAttributesCore(stop, attributes);
        parseAttributesStyle(stop, attributes);
        parseAttributesStop(stop, attributes);
        this.currentElement.addChild(stop);
        this.currentElement = stop;
    }

    private void style(Attributes attributes) {
        debug("<style>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        String str = "all";
        boolean z = true;
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ordinal = SVGAttr.fromString(attributes.getLocalName(i)).ordinal();
            if (ordinal == 52) {
                str = trim;
            } else if (ordinal == 93) {
                z = trim.equals("text/css");
            }
        }
        if (z && CSSParser.mediaMatches(str, CSSParser.MediaType.screen)) {
            this.inStyleElement = true;
        } else {
            this.ignoring = true;
            this.ignoreDepth = 1;
        }
    }

    private void svg(Attributes attributes) {
        debug("<svg>", new Object[0]);
        SVGBase.Svg svg = new SVGBase.Svg();
        svg.document = this.svgDocument;
        svg.parent = this.currentElement;
        parseAttributesCore(svg, attributes);
        parseAttributesStyle(svg, attributes);
        parseAttributesConditional(svg, attributes);
        parseAttributesViewBox(svg, attributes);
        parseAttributesSVG(svg, attributes);
        SVGBase.SvgContainer svgContainer = this.currentElement;
        if (svgContainer == null) {
            this.svgDocument.setRootElement(svg);
        } else {
            svgContainer.addChild(svg);
        }
        this.currentElement = svg;
    }

    private void symbol(Attributes attributes) {
        debug("<symbol>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.SvgViewBoxContainer symbol = new SVGBase.Symbol();
        symbol.document = this.svgDocument;
        symbol.parent = this.currentElement;
        parseAttributesCore(symbol, attributes);
        parseAttributesStyle(symbol, attributes);
        parseAttributesConditional(symbol, attributes);
        parseAttributesViewBox(symbol, attributes);
        this.currentElement.addChild(symbol);
        this.currentElement = symbol;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void text(String str) {
        if (this.ignoring) {
            return;
        }
        if (this.inMetadataElement) {
            if (this.metadataElementContents == null) {
                this.metadataElementContents = new StringBuilder(str.length());
            }
            this.metadataElementContents.append(str);
        } else if (this.inStyleElement) {
            if (this.styleElementContents == null) {
                this.styleElementContents = new StringBuilder(str.length());
            }
            this.styleElementContents.append(str);
        } else if (this.currentElement instanceof SVGBase.TextContainer) {
            appendToTextContainer(str);
        }
    }

    private void textPath(Attributes attributes) {
        debug("<textPath>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.TextPath textPath = new SVGBase.TextPath();
        textPath.document = this.svgDocument;
        textPath.parent = this.currentElement;
        parseAttributesCore(textPath, attributes);
        parseAttributesStyle(textPath, attributes);
        parseAttributesConditional(textPath, attributes);
        parseAttributesTextPath(textPath, attributes);
        this.currentElement.addChild(textPath);
        this.currentElement = textPath;
        SVGBase.SvgContainer svgContainer = textPath.parent;
        if (svgContainer instanceof SVGBase.TextRoot) {
            textPath.setTextRoot((SVGBase.TextRoot) svgContainer);
        } else {
            textPath.setTextRoot(((SVGBase.TextChild) svgContainer).getTextRoot());
        }
    }

    private void tref(Attributes attributes) {
        debug("<tref>", new Object[0]);
        SVGBase.SvgContainer svgContainer = this.currentElement;
        if (svgContainer == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        if (!(svgContainer instanceof SVGBase.TextContainer)) {
            throw new SVGParseException("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
        }
        SVGBase.TRef tRef = new SVGBase.TRef();
        tRef.document = this.svgDocument;
        tRef.parent = this.currentElement;
        parseAttributesCore(tRef, attributes);
        parseAttributesStyle(tRef, attributes);
        parseAttributesConditional(tRef, attributes);
        parseAttributesTRef(tRef, attributes);
        this.currentElement.addChild(tRef);
        SVGBase.SvgContainer svgContainer2 = tRef.parent;
        if (svgContainer2 instanceof SVGBase.TextRoot) {
            tRef.setTextRoot((SVGBase.TextRoot) svgContainer2);
        } else {
            tRef.setTextRoot(((SVGBase.TextChild) svgContainer2).getTextRoot());
        }
    }

    private void tspan(Attributes attributes) {
        debug("<tspan>", new Object[0]);
        SVGBase.SvgContainer svgContainer = this.currentElement;
        if (svgContainer == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        if (!(svgContainer instanceof SVGBase.TextContainer)) {
            throw new SVGParseException("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
        }
        SVGBase.TSpan tSpan = new SVGBase.TSpan();
        tSpan.document = this.svgDocument;
        tSpan.parent = this.currentElement;
        parseAttributesCore(tSpan, attributes);
        parseAttributesStyle(tSpan, attributes);
        parseAttributesConditional(tSpan, attributes);
        parseAttributesTextPosition(tSpan, attributes);
        this.currentElement.addChild(tSpan);
        this.currentElement = tSpan;
        SVGBase.SvgContainer svgContainer2 = tSpan.parent;
        if (svgContainer2 instanceof SVGBase.TextRoot) {
            tSpan.setTextRoot((SVGBase.TextRoot) svgContainer2);
        } else {
            tSpan.setTextRoot(((SVGBase.TextChild) svgContainer2).getTextRoot());
        }
    }

    private void use(Attributes attributes) {
        debug("<use>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.Use use = new SVGBase.Use();
        use.document = this.svgDocument;
        use.parent = this.currentElement;
        parseAttributesCore(use, attributes);
        parseAttributesStyle(use, attributes);
        parseAttributesTransform(use, attributes);
        parseAttributesConditional(use, attributes);
        parseAttributesUse(use, attributes);
        this.currentElement.addChild(use);
        this.currentElement = use;
    }

    private void view(Attributes attributes) {
        debug("<view>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.SvgViewBoxContainer view = new SVGBase.View();
        view.document = this.svgDocument;
        view.parent = this.currentElement;
        parseAttributesCore(view, attributes);
        parseAttributesConditional(view, attributes);
        parseAttributesViewBox(view, attributes);
        this.currentElement.addChild(view);
        this.currentElement = view;
    }

    private void zwitch(Attributes attributes) {
        debug("<switch>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.Switch r0 = new SVGBase.Switch();
        r0.document = this.svgDocument;
        r0.parent = this.currentElement;
        parseAttributesCore(r0, attributes);
        parseAttributesStyle(r0, attributes);
        parseAttributesTransform(r0, attributes);
        parseAttributesConditional(r0, attributes);
        this.currentElement.addChild(r0);
        this.currentElement = r0;
    }

    @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGParser
    public SVGBase parseStream(InputStream inputStream) {
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
                if (FORCE_SAX_ON_EARLY_ANDROIDS) {
                    debug("Forcing SAX parser for this version of Android", new Object[0]);
                    parseUsingSAX(inputStream);
                    return this.svgDocument;
                }
                if (this.enableInternalEntities) {
                    inputStream.mark(4096);
                    byte[] bArr = new byte[4096];
                    String str = new String(bArr, 0, inputStream.read(bArr));
                    inputStream.reset();
                    if (str.contains("<!ENTITY ")) {
                        debug("Switching to SAX parser to process entities", new Object[0]);
                        parseUsingSAX(inputStream);
                        SVGBase sVGBase = this.svgDocument;
                        try {
                            inputStream.close();
                        } catch (IOException unused2) {
                            Log.e(TAG, "Exception thrown closing input stream");
                        }
                        return sVGBase;
                    }
                }
                parseUsingXmlPullParser(inputStream);
                SVGBase sVGBase2 = this.svgDocument;
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                    Log.e(TAG, "Exception thrown closing input stream");
                }
                return sVGBase2;
            } finally {
                try {
                    inputStream.close();
                } catch (IOException unused4) {
                    Log.e(TAG, "Exception thrown closing input stream");
                }
            }
        } catch (IOException e) {
            Log.e(TAG, "Error occurred while performing check for entities.  File may not be parsed correctly if it contains entity definitions.", e);
            parseUsingXmlPullParser(inputStream);
            SVGBase sVGBase3 = this.svgDocument;
            try {
                inputStream.close();
            } catch (IOException unused5) {
                Log.e(TAG, "Exception thrown closing input stream");
            }
            return sVGBase3;
        }
    }

    @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGParser
    public SVGParser setExternalFileResolver(SVGExternalFileResolver sVGExternalFileResolver) {
        this.externalFileResolver = sVGExternalFileResolver;
        return this;
    }

    @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGParser
    public SVGParser setInternalEntitiesEnabled(boolean z) {
        this.enableInternalEntities = z;
        return this;
    }

    private static class XPPAttributesWrapper implements Attributes {
        private final XmlPullParser parser;

        public XPPAttributesWrapper(XmlPullParser xmlPullParser) {
            this.parser = xmlPullParser;
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
            return this.parser.getAttributeCount();
        }

        @Override // org.xml.sax.Attributes
        public String getLocalName(int i) {
            return this.parser.getAttributeName(i);
        }

        @Override // org.xml.sax.Attributes
        public String getQName(int i) {
            String attributeName = this.parser.getAttributeName(i);
            if (this.parser.getAttributePrefix(i) == null) {
                return attributeName;
            }
            return this.parser.getAttributePrefix(i) + ':' + attributeName;
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
            return this.parser.getAttributeNamespace(i);
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
            return this.parser.getAttributeValue(i);
        }
    }

    private static float parseFloat(String str, int i, int i2) {
        float parseNumber = new NumberParser().parseNumber(str, i, i2);
        if (!Float.isNaN(parseNumber)) {
            return parseNumber;
        }
        throw new SVGParseException("Invalid float value: " + str);
    }

    private void text(char[] cArr, int i, int i2) {
        if (this.ignoring) {
            return;
        }
        if (this.inMetadataElement) {
            if (this.metadataElementContents == null) {
                this.metadataElementContents = new StringBuilder(i2);
            }
            this.metadataElementContents.append(cArr, i, i2);
        } else if (this.inStyleElement) {
            if (this.styleElementContents == null) {
                this.styleElementContents = new StringBuilder(i2);
            }
            this.styleElementContents.append(cArr, i, i2);
        } else if (this.currentElement instanceof SVGBase.TextContainer) {
            appendToTextContainer(new String(cArr, i, i2));
        }
    }

    private void text(Attributes attributes) {
        debug("<text>", new Object[0]);
        if (this.currentElement != null) {
            SVGBase.Text text = new SVGBase.Text();
            text.document = this.svgDocument;
            text.parent = this.currentElement;
            parseAttributesCore(text, attributes);
            parseAttributesStyle(text, attributes);
            parseAttributesTransform(text, attributes);
            parseAttributesConditional(text, attributes);
            parseAttributesTextPosition(text, attributes);
            this.currentElement.addChild(text);
            this.currentElement = text;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }
}
