package com.smaato.sdk.ng.utils.svgparser.utils;

import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSource;
import com.smaato.sdk.ng.utils.svgparser.SVGParseException;
import com.smaato.sdk.ng.utils.svgparser.utils.SVGBase;
import com.smaato.sdk.ng.utils.svgparser.utils.d;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public class Style implements Cloneable {
    String A;
    Boolean B;
    Boolean C;
    SVGBase.SvgPaint D;
    Float E;
    String F;
    FillRule G;
    String H;
    SVGBase.SvgPaint I;
    Float J;
    SVGBase.SvgPaint K;
    Float L;
    VectorEffect M;
    RenderQuality N;
    Isolation O;
    CSSBlendMode P;
    FontKerning Q;
    CSSFontFeatureSettings R;
    CSSFontFeatureSettings S;
    CSSFontFeatureSettings T;
    CSSFontFeatureSettings U;
    CSSFontFeatureSettings V;
    CSSFontFeatureSettings W;
    CSSFontVariationSettings X;
    WritingMode Y;
    GlypOrientationVertical Z;
    long a = 0;
    TextOrientation a0;
    SVGBase.SvgPaint b;
    SVGBase.Length b0;
    FillRule c;
    SVGBase.Length c0;
    Float d;
    SVGBase.SvgPaint e;
    Float f;
    SVGBase.Length g;
    LineCap h;
    LineJoin i;
    Float j;
    SVGBase.Length[] k;
    SVGBase.Length l;
    Float m;
    SVGBase.Colour n;
    List<String> o;
    SVGBase.Length p;
    Float q;
    FontStyle r;
    Float s;
    TextDecoration t;
    TextDirection u;
    TextAnchor v;
    Boolean w;
    SVGBase.CSSClipRect x;
    String y;
    String z;

    public enum CSSBlendMode {
        normal,
        multiply,
        screen,
        overlay,
        darken,
        lighten,
        color_dodge,
        color_burn,
        hard_light,
        soft_light,
        difference,
        exclusion,
        hue,
        saturation,
        color,
        luminosity,
        UNSUPPORTED;

        private static final Map<String, CSSBlendMode> a = new HashMap();

        static {
            for (CSSBlendMode cSSBlendMode : values()) {
                if (cSSBlendMode != UNSUPPORTED) {
                    a.put(cSSBlendMode.name().replace('_', '-'), cSSBlendMode);
                }
            }
        }

        public static CSSBlendMode fromString(String str) {
            CSSBlendMode cSSBlendMode = a.get(str);
            return cSSBlendMode != null ? cSSBlendMode : UNSUPPORTED;
        }
    }

    public enum FillRule {
        NonZero,
        EvenOdd
    }

    public enum FontKerning {
        auto,
        normal,
        none
    }

    public enum FontStyle {
        normal,
        italic,
        oblique
    }

    public enum GlypOrientationVertical {
        auto,
        angle0,
        angle90,
        angle180,
        angle270
    }

    public enum Isolation {
        auto,
        isolate
    }

    public enum LineCap {
        Butt,
        Round,
        Square
    }

    public enum LineJoin {
        Miter,
        Round,
        Bevel
    }

    public enum RenderQuality {
        auto,
        optimizeQuality,
        optimizeSpeed
    }

    public enum TextAnchor {
        Start,
        Middle,
        End
    }

    public enum TextDecoration {
        None,
        Underline,
        Overline,
        LineThrough,
        Blink
    }

    public enum TextDirection {
        LTR,
        RTL
    }

    public enum TextOrientation {
        mixed,
        upright,
        sideways
    }

    public enum VectorEffect {
        None,
        NonScalingStroke
    }

    public enum WritingMode {
        lr_tb,
        rl_tb,
        tb_rl,
        lr,
        rl,
        tb,
        horizontal_tb,
        vertical_rl,
        vertical_lr
    }

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d.f.values().length];
            a = iArr;
            try {
                iArr[d.f.fill.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[d.f.fill_rule.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[d.f.fill_opacity.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[d.f.stroke.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[d.f.stroke_opacity.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[d.f.stroke_width.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[d.f.stroke_linecap.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[d.f.stroke_linejoin.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[d.f.stroke_miterlimit.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[d.f.stroke_dasharray.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[d.f.stroke_dashoffset.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[d.f.opacity.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[d.f.color.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[d.f.font.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[d.f.font_family.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[d.f.font_size.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[d.f.font_weight.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[d.f.font_style.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                a[d.f.font_stretch.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[d.f.text_decoration.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                a[d.f.direction.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                a[d.f.text_anchor.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                a[d.f.overflow.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                a[d.f.marker.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                a[d.f.marker_start.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                a[d.f.marker_mid.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                a[d.f.marker_end.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                a[d.f.display.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                a[d.f.visibility.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                a[d.f.stop_color.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                a[d.f.stop_opacity.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                a[d.f.clip.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                a[d.f.clip_path.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                a[d.f.clip_rule.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                a[d.f.mask.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                a[d.f.solid_color.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                a[d.f.solid_opacity.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                a[d.f.viewport_fill.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                a[d.f.viewport_fill_opacity.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                a[d.f.vector_effect.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                a[d.f.image_rendering.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                a[d.f.isolation.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                a[d.f.mix_blend_mode.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                a[d.f.font_kerning.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                a[d.f.font_variant.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                a[d.f.font_variant_ligatures.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                a[d.f.font_variant_position.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                a[d.f.font_variant_caps.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                a[d.f.font_variant_numeric.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                a[d.f.font_variant_east_asian.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                a[d.f.font_feature_settings.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                a[d.f.font_variation_settings.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                a[d.f.letter_spacing.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                a[d.f.word_spacing.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
        }
    }

    static Style a() {
        Style style = new Style();
        SVGBase.Colour colour = SVGBase.Colour.b;
        style.b = colour;
        FillRule fillRule = FillRule.NonZero;
        style.c = fillRule;
        Float valueOf = Float.valueOf(1.0f);
        style.d = valueOf;
        style.e = null;
        style.f = valueOf;
        style.g = new SVGBase.Length(1.0f);
        style.h = LineCap.Butt;
        style.i = LineJoin.Miter;
        style.j = Float.valueOf(4.0f);
        style.k = null;
        SVGBase.Length length = SVGBase.Length.c;
        style.l = length;
        style.m = valueOf;
        style.n = colour;
        style.o = null;
        style.p = new SVGBase.Length(12.0f, SVGBase.S.pt);
        style.q = Float.valueOf(400.0f);
        style.r = FontStyle.normal;
        style.s = Float.valueOf(100.0f);
        style.t = TextDecoration.None;
        style.u = TextDirection.LTR;
        style.v = TextAnchor.Start;
        Boolean bool = Boolean.TRUE;
        style.w = bool;
        style.x = null;
        style.y = null;
        style.z = null;
        style.A = null;
        style.B = bool;
        style.C = bool;
        style.D = colour;
        style.E = valueOf;
        style.F = null;
        style.G = fillRule;
        style.H = null;
        style.I = null;
        style.J = valueOf;
        style.K = null;
        style.L = valueOf;
        style.M = VectorEffect.None;
        style.N = RenderQuality.auto;
        style.O = Isolation.auto;
        style.P = CSSBlendMode.normal;
        style.Q = FontKerning.auto;
        style.R = CSSFontFeatureSettings.b;
        style.S = CSSFontFeatureSettings.d;
        style.T = CSSFontFeatureSettings.e;
        style.U = CSSFontFeatureSettings.g;
        style.V = CSSFontFeatureSettings.h;
        style.W = CSSFontFeatureSettings.FONT_FEATURE_SETTINGS_NORMAL;
        style.X = null;
        style.b0 = length;
        style.c0 = length;
        style.Y = WritingMode.horizontal_tb;
        style.Z = GlypOrientationVertical.auto;
        style.a0 = TextOrientation.mixed;
        style.a = -1159984767303681L;
        return style;
    }

    protected Object clone() throws CloneNotSupportedException {
        Style style = (Style) super.clone();
        SVGBase.Length[] lengthArr = this.k;
        if (lengthArr != null) {
            style.k = (SVGBase.Length[]) lengthArr.clone();
        }
        return style;
    }

    void a(boolean z) {
        Boolean bool = Boolean.TRUE;
        this.B = bool;
        if (!z) {
            bool = Boolean.FALSE;
        }
        this.w = bool;
        this.x = null;
        this.F = null;
        this.m = Float.valueOf(1.0f);
        this.D = SVGBase.Colour.b;
        this.E = Float.valueOf(1.0f);
        this.H = null;
        this.I = null;
        this.J = Float.valueOf(1.0f);
        this.K = null;
        this.L = Float.valueOf(1.0f);
        this.M = VectorEffect.None;
        this.O = Isolation.auto;
        this.P = CSSBlendMode.normal;
    }

    static void a(Style style, String str, String str2, boolean z) {
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        try {
            switch (a.a[d.f.a(str).ordinal()]) {
                case 1:
                    SVGBase.SvgPaint u = d.u(str2);
                    style.b = u;
                    if (u != null) {
                        style.a |= 1;
                        break;
                    }
                    break;
                case 2:
                    FillRule g = d.g(str2);
                    style.c = g;
                    if (g != null) {
                        style.a |= 2;
                        break;
                    }
                    break;
                case 3:
                    Float s = d.s(str2);
                    style.d = s;
                    if (s != null) {
                        style.a |= 4;
                        break;
                    }
                    break;
                case 4:
                    SVGBase.SvgPaint u2 = d.u(str2);
                    style.e = u2;
                    if (u2 != null) {
                        style.a |= 8;
                        break;
                    }
                    break;
                case 5:
                    Float s2 = d.s(str2);
                    style.f = s2;
                    if (s2 != null) {
                        style.a |= 16;
                        break;
                    }
                    break;
                case 6:
                    style.g = d.p(str2);
                    style.a |= 32;
                    break;
                case 7:
                    LineCap A = d.A(str2);
                    style.h = A;
                    if (A != null) {
                        style.a |= 64;
                        break;
                    }
                    break;
                case 8:
                    LineJoin B = d.B(str2);
                    style.i = B;
                    if (B != null) {
                        style.a |= 128;
                        break;
                    }
                    break;
                case 9:
                    style.j = Float.valueOf(d.h(str2));
                    style.a |= 256;
                    break;
                case 10:
                    if ("none".equals(str2)) {
                        style.k = null;
                        style.a |= 512;
                        break;
                    } else {
                        SVGBase.Length[] z2 = d.z(str2);
                        style.k = z2;
                        if (z2 != null) {
                            style.a |= 512;
                            break;
                        }
                    }
                    break;
                case 11:
                    style.l = d.p(str2);
                    style.a |= 1024;
                    break;
                case 12:
                    style.m = d.s(str2);
                    style.a |= 2048;
                    break;
                case 13:
                    style.n = d.d(str2);
                    style.a |= 4096;
                    break;
                case 14:
                    if (!z) {
                        d.a(style, str2);
                        break;
                    }
                    break;
                case 15:
                    List<String> i = d.i(str2);
                    style.o = i;
                    if (i != null) {
                        style.a |= 8192;
                        break;
                    }
                    break;
                case 16:
                    SVGBase.Length j = d.j(str2);
                    style.p = j;
                    if (j != null) {
                        style.a |= 16384;
                        break;
                    }
                    break;
                case 17:
                    Float m = d.m(str2);
                    style.q = m;
                    if (m != null) {
                        style.a |= 32768;
                        break;
                    }
                    break;
                case 18:
                    FontStyle l = d.l(str2);
                    style.r = l;
                    if (l != null) {
                        style.a |= 65536;
                        break;
                    }
                    break;
                case 19:
                    Float k = d.k(str2);
                    style.s = k;
                    if (k != null) {
                        style.a |= 2251799813685248L;
                        break;
                    }
                    break;
                case 20:
                    TextDecoration E = d.E(str2);
                    style.t = E;
                    if (E != null) {
                        style.a |= 131072;
                        break;
                    }
                    break;
                case 21:
                    TextDirection F = d.F(str2);
                    style.u = F;
                    if (F != null) {
                        style.a |= 68719476736L;
                        break;
                    }
                    break;
                case 22:
                    TextAnchor D = d.D(str2);
                    style.v = D;
                    if (D != null) {
                        style.a |= 262144;
                        break;
                    }
                    break;
                case 23:
                    Boolean t = d.t(str2);
                    style.w = t;
                    if (t != null) {
                        style.a |= 524288;
                        break;
                    }
                    break;
                case 24:
                    String a2 = d.a(str2, str);
                    style.y = a2;
                    style.z = a2;
                    style.A = a2;
                    style.a |= 14680064;
                    break;
                case 25:
                    style.y = d.a(str2, str);
                    style.a |= CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE;
                    break;
                case 26:
                    style.z = d.a(str2, str);
                    style.a |= 4194304;
                    break;
                case 27:
                    style.A = d.a(str2, str);
                    style.a |= 8388608;
                    break;
                case 28:
                    if (str2.indexOf(124) < 0) {
                        if ("|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".contains('|' + str2 + '|')) {
                            style.B = Boolean.valueOf(!str2.equals("none"));
                            style.a |= 16777216;
                            break;
                        }
                    }
                    break;
                case 29:
                    if (str2.indexOf(124) < 0) {
                        if ("|visible|hidden|collapse|".contains('|' + str2 + '|')) {
                            style.C = Boolean.valueOf(str2.equals(VastAttributes.VISIBLE));
                            style.a |= 33554432;
                            break;
                        }
                    }
                    break;
                case 30:
                    if (str2.equals("currentColor")) {
                        style.D = SVGBase.C5112e.a();
                    } else {
                        style.D = d.d(str2);
                    }
                    style.a |= 67108864;
                    break;
                case 31:
                    style.E = d.s(str2);
                    style.a |= 134217728;
                    break;
                case 32:
                    SVGBase.CSSClipRect c = d.c(str2);
                    style.x = c;
                    if (c != null) {
                        style.a |= 1048576;
                        break;
                    }
                    break;
                case 33:
                    style.F = d.a(str2, str);
                    style.a |= 268435456;
                    break;
                case 34:
                    style.G = d.g(str2);
                    style.a |= 536870912;
                    break;
                case 35:
                    style.H = d.a(str2, str);
                    style.a |= 1073741824;
                    break;
                case 36:
                    if (z) {
                        if (str2.equals("currentColor")) {
                            style.I = SVGBase.C5112e.a();
                        } else {
                            style.I = d.d(str2);
                        }
                        style.a |= 2147483648L;
                        break;
                    }
                    break;
                case 37:
                    if (z) {
                        style.J = d.s(str2);
                        style.a |= 4294967296L;
                        break;
                    }
                    break;
                case 38:
                    if (str2.equals("currentColor")) {
                        style.K = SVGBase.C5112e.a();
                    } else {
                        style.K = d.d(str2);
                    }
                    style.a |= 8589934592L;
                    break;
                case 39:
                    style.L = d.s(str2);
                    style.a |= 17179869184L;
                    break;
                case 40:
                    VectorEffect H = d.H(str2);
                    style.M = H;
                    if (H != null) {
                        style.a |= 34359738368L;
                        break;
                    }
                    break;
                case 41:
                    RenderQuality w = d.w(str2);
                    style.N = w;
                    if (w != null) {
                        style.a |= 137438953472L;
                        break;
                    }
                    break;
                case 42:
                    if (!z) {
                        Isolation o = d.o(str2);
                        style.O = o;
                        if (o != null) {
                            style.a |= 274877906944L;
                            break;
                        }
                    }
                    break;
                case 43:
                    if (!z) {
                        CSSBlendMode fromString = CSSBlendMode.fromString(str2);
                        style.P = fromString;
                        if (fromString != null) {
                            style.a |= 549755813888L;
                            break;
                        }
                    }
                    break;
                case 44:
                    if (!z) {
                        FontKerning d = CSSFontFeatureSettings.d(str2);
                        style.Q = d;
                        if (d != null) {
                            style.a |= 562949953421312L;
                            break;
                        }
                    }
                    break;
                case 45:
                    if (!z) {
                        CSSFontFeatureSettings.a(style, str2);
                        break;
                    }
                    break;
                case 46:
                    if (!z) {
                        CSSFontFeatureSettings f = CSSFontFeatureSettings.f(str2);
                        style.R = f;
                        if (f != null) {
                            style.a |= 1099511627776L;
                            break;
                        }
                    }
                    break;
                case 47:
                    if (!z) {
                        CSSFontFeatureSettings h = CSSFontFeatureSettings.h(str2);
                        style.S = h;
                        if (h != null) {
                            style.a |= 2199023255552L;
                            break;
                        }
                    }
                    break;
                case 48:
                    if (!z) {
                        CSSFontFeatureSettings e = CSSFontFeatureSettings.e(str2);
                        style.T = e;
                        if (e != null) {
                            style.a |= 4398046511104L;
                            break;
                        }
                    }
                    break;
                case 49:
                    if (!z) {
                        CSSFontFeatureSettings g2 = CSSFontFeatureSettings.g(str2);
                        style.U = g2;
                        if (g2 != null) {
                            style.a |= 8796093022208L;
                            break;
                        }
                    }
                    break;
                case 50:
                    if (!z) {
                        CSSFontFeatureSettings b = CSSFontFeatureSettings.b(str2);
                        style.V = b;
                        if (b != null) {
                            style.a |= 17592186044416L;
                            break;
                        }
                    }
                    break;
                case 51:
                    if (!z) {
                        CSSFontFeatureSettings c2 = CSSFontFeatureSettings.c(str2);
                        style.W = c2;
                        if (c2 != null) {
                            style.a |= 35184372088832L;
                            break;
                        }
                    }
                    break;
                case 52:
                    if (!z) {
                        CSSFontVariationSettings a3 = CSSFontVariationSettings.a(str2);
                        style.X = a3;
                        if (a3 != null) {
                            style.a |= 1125899906842624L;
                            break;
                        }
                    }
                    break;
                case 53:
                    SVGBase.Length r = d.r(str2);
                    style.b0 = r;
                    if (r != null) {
                        style.a |= 4503599627370496L;
                        break;
                    }
                    break;
                case 54:
                    SVGBase.Length r2 = d.r(str2);
                    style.c0 = r2;
                    if (r2 != null) {
                        style.a |= 9007199254740992L;
                        break;
                    }
                    break;
            }
        } catch (SVGParseException unused) {
        }
    }
}
