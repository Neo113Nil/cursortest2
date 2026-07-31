package com.smaato.sdk.ng.utils.svgparser.utils;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSource;
import com.smaato.sdk.ng.utils.svgparser.PreserveAspectRatio;
import com.smaato.sdk.ng.utils.svgparser.SVGExternalFileResolver;
import com.smaato.sdk.ng.utils.svgparser.utils.CSSParser;
import com.smaato.sdk.ng.utils.svgparser.utils.SVGBase;
import com.smaato.sdk.ng.utils.svgparser.utils.Style;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;
import java.util.regex.Pattern;

/* loaded from: classes11.dex */
public class SVGAndroidRenderer {
    public static final float LUMINANCE_TO_ALPHA_BLUE = 0.0722f;
    public static final float LUMINANCE_TO_ALPHA_GREEN = 0.7151f;
    public static final float LUMINANCE_TO_ALPHA_RED = 0.2127f;
    private static final boolean j;
    private static final boolean k;
    private static final boolean l;
    private static final boolean m;
    private static final boolean n;
    private static final boolean o;
    private static final boolean p;
    private static final boolean q;
    private static final boolean r;
    private static final boolean s;
    private static final Pattern t;
    private static final Pattern u;
    private static final Pattern v;
    private static final Pattern w;
    private static final Pattern x;
    private static final Pattern y;
    private static HashSet<String> z;
    private final Canvas a;
    private final float b;
    private SVGBase c;
    private RendererState d;
    private Stack<RendererState> e;
    private Stack<SVGBase.SvgContainer> f;
    private Stack<Matrix> g;
    private CSSParser.n h = null;
    private SVGExternalFileResolver i;

    protected static class PathConverter implements SVGBase.InterfaceC5128u {
        final Path a = new Path();
        float b;
        float c;

        PathConverter(SVGBase.C5127t c5127t) {
            if (c5127t == null) {
                return;
            }
            c5127t.a(this);
        }

        Path a() {
            return this.a;
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.InterfaceC5128u
        public void arcTo(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            SVGAndroidRenderer.a(this.b, this.c, f, f2, f3, z, z2, f4, f5, this);
            this.b = f4;
            this.c = f5;
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.InterfaceC5128u
        public void close() {
            this.a.close();
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.InterfaceC5128u
        public void cubicTo(float f, float f2, float f3, float f4, float f5, float f6) {
            this.a.cubicTo(f, f2, f3, f4, f5, f6);
            this.b = f5;
            this.c = f6;
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.InterfaceC5128u
        public void lineTo(float f, float f2) {
            this.a.lineTo(f, f2);
            this.b = f;
            this.c = f2;
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.InterfaceC5128u
        public void moveTo(float f, float f2) {
            this.a.moveTo(f, f2);
            this.b = f;
            this.c = f2;
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.InterfaceC5128u
        public void quadTo(float f, float f2, float f3, float f4) {
            this.a.quadTo(f, f2, f3, f4);
            this.b = f3;
            this.c = f4;
        }
    }

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;
        static final /* synthetic */ int[] c;
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[Style.LineJoin.values().length];
            d = iArr;
            try {
                iArr[Style.LineJoin.Miter.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[Style.LineJoin.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[Style.LineJoin.Bevel.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[Style.LineCap.values().length];
            c = iArr2;
            try {
                iArr2[Style.LineCap.Butt.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                c[Style.LineCap.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                c[Style.LineCap.Square.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[PreserveAspectRatio.Alignment.values().length];
            b = iArr3;
            try {
                iArr3[PreserveAspectRatio.Alignment.xMidYMin.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[PreserveAspectRatio.Alignment.xMidYMid.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[PreserveAspectRatio.Alignment.xMidYMax.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                b[PreserveAspectRatio.Alignment.xMaxYMin.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                b[PreserveAspectRatio.Alignment.xMaxYMid.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                b[PreserveAspectRatio.Alignment.xMaxYMax.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                b[PreserveAspectRatio.Alignment.xMinYMid.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                b[PreserveAspectRatio.Alignment.xMinYMax.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            int[] iArr4 = new int[Style.CSSBlendMode.values().length];
            a = iArr4;
            try {
                iArr4[Style.CSSBlendMode.multiply.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[Style.CSSBlendMode.screen.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[Style.CSSBlendMode.overlay.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[Style.CSSBlendMode.darken.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                a[Style.CSSBlendMode.lighten.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[Style.CSSBlendMode.color_dodge.ordinal()] = 6;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                a[Style.CSSBlendMode.color_burn.ordinal()] = 7;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                a[Style.CSSBlendMode.hard_light.ordinal()] = 8;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                a[Style.CSSBlendMode.soft_light.ordinal()] = 9;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                a[Style.CSSBlendMode.difference.ordinal()] = 10;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                a[Style.CSSBlendMode.exclusion.ordinal()] = 11;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                a[Style.CSSBlendMode.hue.ordinal()] = 12;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                a[Style.CSSBlendMode.saturation.ordinal()] = 13;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                a[Style.CSSBlendMode.color.ordinal()] = 14;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                a[Style.CSSBlendMode.luminosity.ordinal()] = 15;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                a[Style.CSSBlendMode.normal.ordinal()] = 16;
            } catch (NoSuchFieldError unused30) {
            }
        }
    }

    private class b implements SVGBase.InterfaceC5128u {
        private final List<c> a;
        private float b;
        private float c;
        private c d;
        private boolean e;
        private boolean f;
        private int g;
        private boolean h;

        b(SVGBase.C5127t c5127t) {
            ArrayList arrayList = new ArrayList();
            this.a = arrayList;
            this.d = null;
            this.e = false;
            this.f = true;
            this.g = -1;
            if (c5127t == null) {
                return;
            }
            c5127t.a(this);
            if (this.h) {
                this.d.a((c) arrayList.get(this.g));
                arrayList.set(this.g, this.d);
                this.h = false;
            }
            c cVar = this.d;
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }

        List<c> a() {
            return this.a;
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.InterfaceC5128u
        public void arcTo(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            this.e = true;
            this.f = false;
            c cVar = this.d;
            SVGAndroidRenderer.a(cVar.a, cVar.b, f, f2, f3, z, z2, f4, f5, this);
            this.f = true;
            this.h = false;
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.InterfaceC5128u
        public void close() {
            this.a.add(this.d);
            lineTo(this.b, this.c);
            this.h = true;
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.InterfaceC5128u
        public void cubicTo(float f, float f2, float f3, float f4, float f5, float f6) {
            if (this.f || this.e) {
                this.d.a(f, f2);
                this.a.add(this.d);
                this.e = false;
            }
            this.d = new c(f5, f6, f5 - f3, f6 - f4);
            this.h = false;
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.InterfaceC5128u
        public void lineTo(float f, float f2) {
            this.d.a(f, f2);
            this.a.add(this.d);
            c cVar = this.d;
            this.d = new c(f, f2, f - cVar.a, f2 - cVar.b);
            this.h = false;
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.InterfaceC5128u
        public void moveTo(float f, float f2) {
            if (this.h) {
                this.d.a(this.a.get(this.g));
                this.a.set(this.g, this.d);
                this.h = false;
            }
            c cVar = this.d;
            if (cVar != null) {
                this.a.add(cVar);
            }
            this.b = f;
            this.c = f2;
            this.d = new c(f, f2, 0.0f, 0.0f);
            this.g = this.a.size();
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.InterfaceC5128u
        public void quadTo(float f, float f2, float f3, float f4) {
            this.d.a(f, f2);
            this.a.add(this.d);
            this.d = new c(f3, f4, f3 - f, f4 - f2);
            this.h = false;
        }
    }

    private class d extends e {
        private final Path d;

        d(Path path, float f, float f2) {
            super(f, f2);
            this.d = path;
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGAndroidRenderer.e, com.smaato.sdk.ng.utils.svgparser.utils.SVGAndroidRenderer.h
        public void a(String str) {
            float f;
            if (SVGAndroidRenderer.this.t()) {
                if (SVGAndroidRenderer.n) {
                    SVGAndroidRenderer sVGAndroidRenderer = SVGAndroidRenderer.this;
                    f = sVGAndroidRenderer.d.a.b0.a(sVGAndroidRenderer) / 2.0f;
                } else {
                    f = 0.0f;
                }
                SVGAndroidRenderer sVGAndroidRenderer2 = SVGAndroidRenderer.this;
                RendererState rendererState = sVGAndroidRenderer2.d;
                if (rendererState.b) {
                    sVGAndroidRenderer2.a.drawTextOnPath(str, this.d, this.a - f, this.b, rendererState.g);
                }
                SVGAndroidRenderer sVGAndroidRenderer3 = SVGAndroidRenderer.this;
                RendererState rendererState2 = sVGAndroidRenderer3.d;
                if (rendererState2.c) {
                    sVGAndroidRenderer3.a.drawTextOnPath(str, this.d, this.a - f, this.b, rendererState2.h);
                }
            }
            float f2 = this.a;
            SVGAndroidRenderer sVGAndroidRenderer4 = SVGAndroidRenderer.this;
            this.a = f2 + sVGAndroidRenderer4.a(str, sVGAndroidRenderer4.d.g);
        }
    }

    private class e extends h {
        float a;
        float b;

        e(float f, float f2) {
            super();
            this.a = f;
            this.b = f2;
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGAndroidRenderer.h
        public void a(String str) {
            float f;
            SVGAndroidRenderer.a("TextSequence render", new Object[0]);
            if (SVGAndroidRenderer.this.t()) {
                if (SVGAndroidRenderer.n) {
                    SVGAndroidRenderer sVGAndroidRenderer = SVGAndroidRenderer.this;
                    f = sVGAndroidRenderer.d.a.b0.a(sVGAndroidRenderer) / 2.0f;
                } else {
                    f = 0.0f;
                }
                SVGAndroidRenderer sVGAndroidRenderer2 = SVGAndroidRenderer.this;
                RendererState rendererState = sVGAndroidRenderer2.d;
                if (rendererState.b) {
                    sVGAndroidRenderer2.a.drawText(str, this.a - f, this.b, rendererState.g);
                }
                SVGAndroidRenderer sVGAndroidRenderer3 = SVGAndroidRenderer.this;
                RendererState rendererState2 = sVGAndroidRenderer3.d;
                if (rendererState2.c) {
                    sVGAndroidRenderer3.a.drawText(str, this.a - f, this.b, rendererState2.h);
                }
            }
            float f2 = this.a;
            SVGAndroidRenderer sVGAndroidRenderer4 = SVGAndroidRenderer.this;
            this.a = f2 + sVGAndroidRenderer4.a(str, sVGAndroidRenderer4.d.g);
        }
    }

    private static abstract class h {
        private h() {
        }

        public abstract void a(String str);

        public boolean a(SVGBase.TextContainer textContainer) {
            return true;
        }
    }

    private class i extends h {
        float a;

        private i() {
            super();
            this.a = 0.0f;
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGAndroidRenderer.h
        public void a(String str) {
            float f = this.a;
            SVGAndroidRenderer sVGAndroidRenderer = SVGAndroidRenderer.this;
            this.a = f + sVGAndroidRenderer.a(str, sVGAndroidRenderer.d.g);
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        j = true;
        k = true;
        l = true;
        m = true;
        n = true;
        o = i2 >= 26;
        p = i2 >= 29;
        q = i2 >= 29;
        r = true;
        s = i2 >= 31;
        t = Pattern.compile("[\\n\\t]");
        u = Pattern.compile("\\t");
        v = Pattern.compile("\\n");
        w = Pattern.compile("^\\s+");
        x = Pattern.compile("\\s+$");
        y = Pattern.compile("\\s{2,}");
        z = null;
    }

    SVGAndroidRenderer(Canvas canvas, float f2, SVGExternalFileResolver sVGExternalFileResolver) {
        this.a = canvas;
        this.b = f2;
        this.i = sVGExternalFileResolver;
    }

    private float a(float f2, float f3, float f4, float f5) {
        return (f2 * f4) + (f3 * f5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(String str, Object... objArr) {
    }

    private void b(Path path) {
        RendererState rendererState = this.d;
        if (rendererState.a.M != Style.VectorEffect.NonScalingStroke) {
            this.a.drawPath(path, rendererState.h);
            return;
        }
        Matrix matrix = this.a.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        this.a.setMatrix(new Matrix());
        Shader shader = this.d.h.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        this.a.drawPath(path2, this.d.h);
        this.a.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    private void c(SVGBase.SvgObject svgObject) {
        if (svgObject instanceof SVGBase.InterfaceC5124q) {
            return;
        }
        r();
        a(svgObject);
        if (svgObject instanceof SVGBase.Svg) {
            a((SVGBase.Svg) svgObject);
        } else if (svgObject instanceof SVGBase.T) {
            a((SVGBase.T) svgObject);
        } else if (svgObject instanceof SVGBase.J) {
            a((SVGBase.J) svgObject);
        } else if (svgObject instanceof SVGBase.C5118k) {
            a((SVGBase.C5118k) svgObject);
        } else if (svgObject instanceof SVGBase.C5120m) {
            a((SVGBase.C5120m) svgObject);
        } else if (svgObject instanceof SVGBase.C5126s) {
            a((SVGBase.C5126s) svgObject);
        } else if (svgObject instanceof SVGBase.y) {
            b((SVGBase.y) svgObject);
        } else if (svgObject instanceof SVGBase.C5110c) {
            b((SVGBase.C5110c) svgObject);
        } else if (svgObject instanceof SVGBase.C5114g) {
            b((SVGBase.C5114g) svgObject);
        } else if (svgObject instanceof SVGBase.C5121n) {
            c((SVGBase.C5121n) svgObject);
        } else if (svgObject instanceof SVGBase.x) {
            a((SVGBase.x) svgObject);
        } else if (svgObject instanceof SVGBase.w) {
            c((SVGBase.w) svgObject);
        } else if (svgObject instanceof SVGBase.N) {
            b((SVGBase.N) svgObject);
        }
        q();
    }

    private void d(SVGBase.D d2) {
        if (d2.b == null || d2.h == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (this.g.peek().invert(matrix)) {
            SVGBase.C5109b c5109b = d2.h;
            float f2 = c5109b.a;
            float f3 = c5109b.b;
            float a2 = c5109b.a();
            SVGBase.C5109b c5109b2 = d2.h;
            float f4 = c5109b2.b;
            float a3 = c5109b2.a();
            float b2 = d2.h.b();
            SVGBase.C5109b c5109b3 = d2.h;
            float[] fArr = {f2, f3, a2, f4, a3, b2, c5109b3.a, c5109b3.b()};
            matrix.preConcat(this.a.getMatrix());
            matrix.mapPoints(fArr);
            float f5 = fArr[0];
            float f6 = fArr[1];
            RectF rectF = new RectF(f5, f6, f5, f6);
            for (int i2 = 2; i2 <= 6; i2 += 2) {
                float f7 = fArr[i2];
                if (f7 < rectF.left) {
                    rectF.left = f7;
                }
                if (f7 > rectF.right) {
                    rectF.right = f7;
                }
                float f8 = fArr[i2 + 1];
                if (f8 < rectF.top) {
                    rectF.top = f8;
                }
                if (f8 > rectF.bottom) {
                    rectF.bottom = f8;
                }
            }
            SVGBase.D d3 = (SVGBase.D) this.f.peek();
            SVGBase.C5109b c5109b4 = d3.h;
            if (c5109b4 == null) {
                d3.h = SVGBase.C5109b.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
            } else {
                c5109b4.a(SVGBase.C5109b.a(rectF.left, rectF.top, rectF.right, rectF.bottom));
            }
        }
    }

    private Path.FillType e() {
        Style.FillRule fillRule = this.d.a.G;
        return (fillRule == null || fillRule != Style.FillRule.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    private Path.FillType j() {
        Style.FillRule fillRule = this.d.a.c;
        return (fillRule == null || fillRule != Style.FillRule.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    private static synchronized void k() {
        synchronized (SVGAndroidRenderer.class) {
            HashSet<String> hashSet = new HashSet<>();
            z = hashSet;
            hashSet.add("Structure");
            z.add("BasicStructure");
            z.add("ConditionalProcessing");
            z.add("Image");
            z.add("Style");
            z.add("ViewportAttribute");
            z.add("Shape");
            z.add("BasicText");
            z.add("PaintAttribute");
            z.add("BasicPaintAttribute");
            z.add("OpacityAttribute");
            z.add("BasicGraphicsAttribute");
            z.add("Marker");
            z.add("Gradient");
            z.add("Pattern");
            z.add("Clip");
            z.add("BasicClip");
            z.add("Mask");
            z.add("View");
        }
    }

    private void l() {
        this.f.pop();
        this.g.pop();
    }

    private boolean m() {
        return b(1.0f);
    }

    private boolean n() {
        if (this.d.a.m.floatValue() < 1.0f) {
            return true;
        }
        Style style = this.d.a;
        if (style.H != null || style.O == Style.Isolation.isolate) {
            return true;
        }
        return p && style.P != Style.CSSBlendMode.normal;
    }

    private void o() {
        this.d = new RendererState();
        this.e = new Stack<>();
        a(this.d, Style.a());
        RendererState rendererState = this.d;
        rendererState.d = null;
        rendererState.f = false;
        this.e.push(new RendererState(rendererState));
        this.g = new Stack<>();
        this.f = new Stack<>();
    }

    private void p() {
        SVGExternalFileResolver sVGExternalFileResolver;
        List<String> list = this.d.a.o;
        Typeface typeface = null;
        if (list != null && this.c != null) {
            for (String str : list) {
                Style style = this.d.a;
                Typeface a2 = a(str, style.q, style.r);
                typeface = (a2 != null || (sVGExternalFileResolver = this.i) == null) ? a2 : sVGExternalFileResolver.resolveFont(str, this.d.a.q.floatValue(), String.valueOf(this.d.a.r), this.d.a.s.floatValue());
                if (typeface != null) {
                    break;
                }
            }
        }
        if (typeface == null) {
            Style style2 = this.d.a;
            typeface = a("serif", style2.q, style2.r);
        }
        this.d.g.setTypeface(typeface);
        this.d.h.setTypeface(typeface);
        if (o) {
            RendererState rendererState = this.d;
            rendererState.j.addSetting("wght", rendererState.a.q.floatValue());
            RendererState rendererState2 = this.d;
            Style.FontStyle fontStyle = rendererState2.a.r;
            if (fontStyle == Style.FontStyle.italic) {
                rendererState2.j.addSetting("ital", CSSFontVariationSettings.b.floatValue());
                this.d.j.addSetting("slnt", CSSFontVariationSettings.c.floatValue());
            } else if (fontStyle == Style.FontStyle.oblique) {
                rendererState2.j.addSetting("slnt", CSSFontVariationSettings.c.floatValue());
            }
            RendererState rendererState3 = this.d;
            rendererState3.j.addSetting("wdth", rendererState3.a.s.floatValue());
            String cSSFontVariationSettings = this.d.j.toString();
            a("fontVariationSettings = " + cSSFontVariationSettings, new Object[0]);
            this.d.g.setFontVariationSettings(cSSFontVariationSettings);
            this.d.h.setFontVariationSettings(cSSFontVariationSettings);
        }
        if (m) {
            String cSSFontFeatureSettings = this.d.i.toString();
            a("fontFeatureSettings = " + cSSFontFeatureSettings, new Object[0]);
            this.d.g.setFontFeatureSettings(cSSFontFeatureSettings);
            this.d.h.setFontFeatureSettings(cSSFontFeatureSettings);
        }
    }

    private void q() {
        this.a.restore();
        this.d = this.e.pop();
    }

    private void r() {
        a(false);
    }

    private void s() {
        int i2;
        Style style = this.d.a;
        SVGBase.SvgPaint svgPaint = style.K;
        if (svgPaint instanceof SVGBase.Colour) {
            i2 = ((SVGBase.Colour) svgPaint).a;
        } else if (!(svgPaint instanceof SVGBase.C5112e)) {
            return;
        } else {
            i2 = style.n.a;
        }
        Float f2 = style.L;
        if (f2 != null) {
            i2 = a(i2, f2.floatValue());
        }
        this.a.drawColor(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean t() {
        Boolean bool = this.d.a.C;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    float f() {
        return this.d.g.getTextSize();
    }

    float g() {
        return this.d.g.getTextSize() / 2.0f;
    }

    float h() {
        return this.b;
    }

    SVGBase.C5109b i() {
        RendererState rendererState = this.d;
        SVGBase.C5109b c5109b = rendererState.e;
        return c5109b != null ? c5109b : rendererState.d;
    }

    private class f extends h {
        float a;
        float b;
        final Path c;

        f(float f, float f2, Path path) {
            super();
            this.a = f;
            this.b = f2;
            this.c = path;
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGAndroidRenderer.h
        public boolean a(SVGBase.TextContainer textContainer) {
            if (!(textContainer instanceof SVGBase.P)) {
                return true;
            }
            SVGAndroidRenderer.c("Using <textPath> elements in a clip path is not supported.", new Object[0]);
            return false;
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGAndroidRenderer.h
        public void a(String str) {
            if (SVGAndroidRenderer.this.t()) {
                Path path = new Path();
                SVGAndroidRenderer.this.d.g.getTextPath(str, 0, str.length(), this.a, this.b, path);
                this.c.addPath(path);
            }
            float f = this.a;
            SVGAndroidRenderer sVGAndroidRenderer = SVGAndroidRenderer.this;
            this.a = f + sVGAndroidRenderer.a(str, sVGAndroidRenderer.d.g);
        }
    }

    void a(SVGBase sVGBase, RenderOptionsBase renderOptionsBase) {
        SVGBase.C5109b c5109b;
        PreserveAspectRatio preserveAspectRatio;
        if (renderOptionsBase != null) {
            this.c = sVGBase;
            SVGBase.Svg rootElement = sVGBase.getRootElement();
            if (rootElement == null) {
                c("Nothing to render. Document is empty.", new Object[0]);
                return;
            }
            if (renderOptionsBase.hasView()) {
                SVGBase.E b2 = this.c.b(renderOptionsBase.f);
                if (!(b2 instanceof SVGBase.U)) {
                    Log.w("SVGAndroidRenderer", String.format("View element with id \"%s\" not found.", renderOptionsBase.f));
                    return;
                }
                SVGBase.U u2 = (SVGBase.U) b2;
                c5109b = u2.p;
                if (c5109b == null) {
                    Log.w("SVGAndroidRenderer", String.format("View element with id \"%s\" is missing a viewBox attribute.", renderOptionsBase.f));
                    return;
                }
                preserveAspectRatio = u2.o;
            } else {
                c5109b = renderOptionsBase.hasViewBox() ? renderOptionsBase.e : rootElement.p;
                preserveAspectRatio = renderOptionsBase.hasPreserveAspectRatio() ? renderOptionsBase.c : rootElement.o;
            }
            if (renderOptionsBase.hasCss()) {
                if (renderOptionsBase.a != null) {
                    sVGBase.a(new CSSParser(CSSParser.Source.RenderOptions, this.i).a(renderOptionsBase.a));
                } else {
                    CSSParser.Ruleset ruleset = renderOptionsBase.b;
                    if (ruleset != null) {
                        sVGBase.a(ruleset);
                    }
                }
            }
            if (renderOptionsBase.hasTarget()) {
                CSSParser.n nVar = new CSSParser.n();
                this.h = nVar;
                nVar.a = sVGBase.b(renderOptionsBase.d);
            }
            o();
            a((SVGBase.SvgObject) rootElement);
            a(true);
            SVGBase.C5109b c5109b2 = new SVGBase.C5109b(renderOptionsBase.g);
            SVGBase.Length length = rootElement.s;
            if (length != null) {
                c5109b2.c = length.a(this, c5109b2.c);
            }
            SVGBase.Length length2 = rootElement.t;
            if (length2 != null) {
                c5109b2.d = length2.a(this, c5109b2.d);
            }
            a(rootElement, c5109b2, c5109b, preserveAspectRatio);
            q();
            if (renderOptionsBase.hasCss()) {
                sVGBase.a();
                return;
            }
            return;
        }
        throw new NullPointerException("renderOptions shouldn't be null");
    }

    private static class c {
        final float a;
        final float b;
        float c;
        float d;
        boolean e = false;

        c(float f, float f2, float f3, float f4) {
            this.c = 0.0f;
            this.d = 0.0f;
            this.a = f;
            this.b = f2;
            double sqrt = Math.sqrt((f3 * f3) + (f4 * f4));
            if (sqrt != 0.0d) {
                this.c = (float) (f3 / sqrt);
                this.d = (float) (f4 / sqrt);
            }
        }

        void a(float f, float f2) {
            float f3 = f - this.a;
            float f4 = f2 - this.b;
            double sqrt = Math.sqrt((f3 * f3) + (f4 * f4));
            if (sqrt != 0.0d) {
                f3 = (float) (f3 / sqrt);
                f4 = (float) (f4 / sqrt);
            }
            float f5 = this.c;
            if (f3 != (-f5) || f4 != (-this.d)) {
                this.c = f5 + f3;
                this.d += f4;
            } else {
                this.e = true;
                this.c = -f4;
                this.d = f3;
            }
        }

        public String toString() {
            return "(" + this.a + StringUtils.COMMA + this.b + " " + this.c + StringUtils.COMMA + this.d + ")";
        }

        void a(c cVar) {
            float f = cVar.c;
            float f2 = this.c;
            if (f == (-f2)) {
                float f3 = cVar.d;
                if (f3 == (-this.d)) {
                    this.e = true;
                    this.c = -f3;
                    this.d = cVar.c;
                    return;
                }
            }
            this.c = f2 + f;
            this.d += cVar.d;
        }
    }

    private class g extends h {
        float a;
        float b;
        final RectF c;

        g(float f, float f2) {
            super();
            this.c = new RectF();
            this.a = f;
            this.b = f2;
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGAndroidRenderer.h
        public boolean a(SVGBase.TextContainer textContainer) {
            if (!(textContainer instanceof SVGBase.P)) {
                return true;
            }
            SVGBase.P p = (SVGBase.P) textContainer;
            SVGBase.SvgObject c = textContainer.a.c(p.o);
            if (c == null) {
                SVGAndroidRenderer.b("TextPath path reference '%s' not found", p.o);
                return false;
            }
            SVGBase.C5126s c5126s = (SVGBase.C5126s) c;
            Path a = new PathConverter(c5126s.o).a();
            Matrix matrix = c5126s.n;
            if (matrix != null) {
                a.transform(matrix);
            }
            RectF rectF = new RectF();
            a.computeBounds(rectF, true);
            this.c.union(rectF);
            return false;
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGAndroidRenderer.h
        public void a(String str) {
            if (SVGAndroidRenderer.this.t()) {
                Rect rect = new Rect();
                SVGAndroidRenderer.this.d.g.getTextBounds(str, 0, str.length(), rect);
                RectF rectF = new RectF(rect);
                rectF.offset(this.a, this.b);
                this.c.union(rectF);
            }
            float f = this.a;
            SVGAndroidRenderer sVGAndroidRenderer = SVGAndroidRenderer.this;
            this.a = f + sVGAndroidRenderer.a(str, sVGAndroidRenderer.d.g);
        }
    }

    public static class RendererState {
        Style a;
        boolean b;
        boolean c;
        SVGBase.C5109b d;
        SVGBase.C5109b e;
        boolean f;
        final Paint g;
        final Paint h;
        final CSSFontFeatureSettings i;
        final CSSFontVariationSettings j;

        @TargetApi(21)
        RendererState() {
            Paint paint = new Paint();
            this.g = paint;
            paint.setFlags(193);
            boolean z = SVGAndroidRenderer.j;
            if (z) {
                paint.setHinting(0);
            }
            paint.setStyle(Paint.Style.FILL);
            Typeface typeface = Typeface.DEFAULT;
            paint.setTypeface(typeface);
            Paint paint2 = new Paint();
            this.h = paint2;
            paint2.setFlags(193);
            if (z) {
                paint2.setHinting(0);
            }
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setTypeface(typeface);
            this.i = new CSSFontFeatureSettings();
            this.j = new CSSFontVariationSettings();
            this.a = Style.a();
        }

        RendererState(RendererState rendererState) {
            this.b = rendererState.b;
            this.c = rendererState.c;
            this.g = new Paint(rendererState.g);
            this.h = new Paint(rendererState.h);
            SVGBase.C5109b c5109b = rendererState.d;
            if (c5109b != null) {
                this.d = new SVGBase.C5109b(c5109b);
            }
            SVGBase.C5109b c5109b2 = rendererState.e;
            if (c5109b2 != null) {
                this.e = new SVGBase.C5109b(c5109b2);
            }
            this.f = rendererState.f;
            this.i = new CSSFontFeatureSettings(rendererState.i);
            this.j = new CSSFontVariationSettings(rendererState.j);
            try {
                this.a = (Style) rendererState.a.clone();
            } catch (CloneNotSupportedException e) {
                Log.e("SVGAndroidRenderer", "Unexpected clone error", e);
                this.a = Style.a();
            }
        }
    }

    private void d(SVGBase.D d2, SVGBase.C5109b c5109b) {
        if (this.d.a.H != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            a(this.a, (RectF) null, paint);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            a(this.a, (RectF) null, paint2);
            SVGBase.C5123p c5123p = (SVGBase.C5123p) this.c.c(this.d.a.H);
            a(c5123p, d2, c5109b);
            this.a.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            a(this.a, (RectF) null, paint3);
            a(c5123p, d2, c5109b);
            this.a.restore();
            this.a.restore();
        }
        q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    private boolean b(float f2) {
        if (!n() && f2 == 1.0f) {
            return false;
        }
        Paint paint = new Paint();
        paint.setAlpha(a(this.d.a.m.floatValue() * f2));
        if (p && this.d.a.P != Style.CSSBlendMode.normal) {
            a(paint);
        }
        a(this.a, (RectF) null, paint);
        this.e.push(this.d);
        RendererState rendererState = new RendererState(this.d);
        this.d = rendererState;
        String str = rendererState.a.H;
        if (str != null && !(this.c.c(str) instanceof SVGBase.C5123p)) {
            b("Mask reference '%s' not found", this.d.a.H);
            this.d.a.H = null;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str, Object... objArr) {
        Log.w("SVGAndroidRenderer", String.format(str, objArr));
    }

    private void c(SVGBase.D d2) {
        d(d2, d2.h);
    }

    private void c(SVGBase.C5121n c5121n) {
        a("Line render", new Object[0]);
        a(this.d, c5121n);
        if (c() && t() && this.d.c) {
            Matrix matrix = c5121n.n;
            if (matrix != null) {
                this.a.concat(matrix);
            }
            Path b2 = b(c5121n);
            d(c5121n);
            b((SVGBase.D) c5121n);
            a((SVGBase.D) c5121n);
            boolean m2 = m();
            b(b2);
            a((SVGBase.AbstractC5117j) c5121n);
            if (m2) {
                c((SVGBase.D) c5121n);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void b(SVGBase.J j2) {
        Set<String> systemLanguage;
        String language = Locale.getDefault().getLanguage();
        for (SVGBase.SvgObject svgObject : j2.getChildren()) {
            if (svgObject instanceof SVGBase.B) {
                SVGBase.B b2 = (SVGBase.B) svgObject;
                if (b2.getRequiredExtensions() == null && ((systemLanguage = b2.getSystemLanguage()) == null || (!systemLanguage.isEmpty() && systemLanguage.contains(language)))) {
                    Set<String> requiredFeatures = b2.getRequiredFeatures();
                    if (requiredFeatures != null) {
                        if (z == null) {
                            k();
                        }
                        if (!requiredFeatures.isEmpty() && z.containsAll(requiredFeatures)) {
                        }
                    }
                    Set<String> requiredFormats = b2.getRequiredFormats();
                    if (requiredFormats != null) {
                        if (!requiredFormats.isEmpty() && this.i != null) {
                            Iterator<String> it = requiredFormats.iterator();
                            while (it.hasNext()) {
                                if (!this.i.isFormatSupported(it.next())) {
                                    break;
                                }
                            }
                        }
                    }
                    Set<String> requiredFonts = b2.getRequiredFonts();
                    if (requiredFonts != null) {
                        if (!requiredFonts.isEmpty() && this.i != null) {
                            Iterator<String> it2 = requiredFonts.iterator();
                            while (it2.hasNext()) {
                                if (this.i.resolveFont(it2.next(), this.d.a.q.floatValue(), String.valueOf(this.d.a.r), this.d.a.s.floatValue()) == null) {
                                    break;
                                }
                            }
                        }
                    }
                    c(svgObject);
                    return;
                }
            }
        }
    }

    private void c(SVGBase.w wVar) {
        a("PolyLine render", new Object[0]);
        a(this.d, wVar);
        if (c() && t()) {
            RendererState rendererState = this.d;
            if (rendererState.c || rendererState.b) {
                Matrix matrix = wVar.n;
                if (matrix != null) {
                    this.a.concat(matrix);
                }
                float[] fArr = wVar.o;
                int length = fArr != null ? fArr.length : 0;
                if (length < 2 || length % 2 == 1) {
                    return;
                }
                Path b2 = b(wVar);
                d(wVar);
                b2.setFillType(j());
                b((SVGBase.D) wVar);
                a((SVGBase.D) wVar);
                boolean m2 = m();
                if (this.d.b) {
                    a(wVar, b2);
                }
                if (this.d.c) {
                    b(b2);
                }
                a((SVGBase.AbstractC5117j) wVar);
                if (m2) {
                    c((SVGBase.D) wVar);
                }
            }
        }
    }

    private Style.TextAnchor d() {
        Style.TextAnchor textAnchor;
        Style style = this.d.a;
        if (style.u != Style.TextDirection.LTR && (textAnchor = style.v) != Style.TextAnchor.Middle) {
            Style.TextAnchor textAnchor2 = Style.TextAnchor.Start;
            return textAnchor == textAnchor2 ? Style.TextAnchor.End : textAnchor2;
        }
        return style.v;
    }

    private void a(SVGBase.SvgContainer svgContainer, boolean z2) {
        if (z2) {
            a(svgContainer);
        }
        Iterator<SVGBase.SvgObject> it = svgContainer.getChildren().iterator();
        while (it.hasNext()) {
            c(it.next());
        }
        if (z2) {
            l();
        }
    }

    private void a(boolean z2) {
        if (z2) {
            a(this.a, (RectF) null, (Paint) null);
        } else {
            this.a.save();
        }
        this.e.push(this.d);
        this.d = new RendererState(this.d);
    }

    private void a(Canvas canvas, RectF rectF, Paint paint) {
        if (r) {
            canvas.saveLayer(rectF, paint);
        } else {
            CanvasLegacy.saveLayer(canvas, rectF, paint, CanvasLegacy.ALL_SAVE_FLAG);
        }
    }

    private void a(SVGBase.SvgContainer svgContainer) {
        this.f.push(svgContainer);
        this.g.push(this.a.getMatrix());
    }

    private void a(RendererState rendererState, SVGBase.E e2) {
        rendererState.a.a(e2.b == null);
        Style style = e2.e;
        if (style != null) {
            a(rendererState, style);
        }
        if (this.c.d()) {
            for (CSSParser.Rule rule : this.c.c()) {
                if (CSSParser.a(this.h, rule.a, e2)) {
                    a(rendererState, rule.b);
                }
            }
        }
        Style style2 = e2.f;
        if (style2 != null) {
            a(rendererState, style2);
        }
    }

    private boolean c() {
        Boolean bool = this.d.a.B;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private void c(SVGBase.D d2, SVGBase.C5109b c5109b) {
        SVGBase.SvgObject c2 = d2.a.c(this.d.a.F);
        if (c2 == null) {
            b("ClipPath reference '%s' not found", this.d.a.F);
            return;
        }
        if (c2.a() != "clipPath") {
            return;
        }
        SVGBase.C5111d c5111d = (SVGBase.C5111d) c2;
        if (c5111d.i.isEmpty()) {
            this.a.clipRect(0, 0, 0, 0);
            return;
        }
        Boolean bool = c5111d.p;
        boolean z2 = bool == null || bool.booleanValue();
        if ((d2 instanceof SVGBase.C5118k) && !z2) {
            c("<clipPath clipPathUnits=\"objectBoundingBox\"> is not supported when referenced from container elements (like %s)", d2.a());
            return;
        }
        b();
        if (!z2) {
            Matrix matrix = new Matrix();
            matrix.preTranslate(c5109b.a, c5109b.b);
            matrix.preScale(c5109b.c, c5109b.d);
            this.a.concat(matrix);
        }
        Matrix matrix2 = c5111d.o;
        if (matrix2 != null) {
            this.a.concat(matrix2);
        }
        this.d = b((SVGBase.SvgObject) c5111d);
        a((SVGBase.D) c5111d);
        Path path = new Path();
        Iterator<SVGBase.SvgObject> it = c5111d.i.iterator();
        while (it.hasNext()) {
            a(it.next(), true, path, new Matrix());
        }
        this.a.clipPath(path);
        a();
    }

    private void b(SVGBase.y yVar) {
        a("Rect render", new Object[0]);
        SVGBase.Length length = yVar.q;
        if (length == null || yVar.r == null || length.c() || yVar.r.c()) {
            return;
        }
        a(this.d, yVar);
        if (c() && t()) {
            Matrix matrix = yVar.n;
            if (matrix != null) {
                this.a.concat(matrix);
            }
            Path a2 = a(yVar);
            d(yVar);
            b((SVGBase.D) yVar);
            a((SVGBase.D) yVar);
            boolean m2 = m();
            if (this.d.b) {
                a(yVar, a2);
            }
            if (this.d.c) {
                b(a2);
            }
            if (m2) {
                c((SVGBase.D) yVar);
            }
        }
    }

    private void a(SVGBase.SvgObject svgObject) {
        Boolean bool;
        if ((svgObject instanceof SVGBase.E) && (bool = ((SVGBase.E) svgObject).d) != null) {
            this.d.f = bool.booleanValue();
        }
    }

    private void a(SVGBase.D d2, Path path) {
        SVGBase.SvgPaint svgPaint = this.d.a.b;
        if (svgPaint instanceof SVGBase.C5125r) {
            SVGBase.SvgObject c2 = this.c.c(((SVGBase.C5125r) svgPaint).a);
            if (c2 instanceof SVGBase.v) {
                a(d2, path, (SVGBase.v) c2);
                return;
            }
        }
        this.a.drawPath(path, this.d.g);
    }

    private void a(SVGBase.Svg svg) {
        a(svg, a(svg.q, svg.r, svg.s, svg.t), svg.p, svg.o);
    }

    private void a(SVGBase.Svg svg, SVGBase.C5109b c5109b) {
        a(svg, c5109b, svg.p, svg.o);
    }

    private void b(SVGBase.C5110c c5110c) {
        a("Circle render", new Object[0]);
        SVGBase.Length length = c5110c.q;
        if (length == null || length.c()) {
            return;
        }
        a(this.d, c5110c);
        if (c() && t()) {
            Matrix matrix = c5110c.n;
            if (matrix != null) {
                this.a.concat(matrix);
            }
            Path a2 = a(c5110c);
            d(c5110c);
            b((SVGBase.D) c5110c);
            a((SVGBase.D) c5110c);
            boolean m2 = m();
            if (this.d.b) {
                a(c5110c, a2);
            }
            if (this.d.c) {
                b(a2);
            }
            if (m2) {
                c((SVGBase.D) c5110c);
            }
        }
    }

    private void a(SVGBase.Svg svg, SVGBase.C5109b c5109b, SVGBase.C5109b c5109b2, PreserveAspectRatio preserveAspectRatio) {
        a("Svg render", new Object[0]);
        if (c5109b.c == 0.0f || c5109b.d == 0.0f) {
            return;
        }
        if (preserveAspectRatio == null && (preserveAspectRatio = svg.o) == null) {
            preserveAspectRatio = PreserveAspectRatio.LETTERBOX;
        }
        a(this.d, svg);
        if (c()) {
            RendererState rendererState = this.d;
            rendererState.d = c5109b;
            if (!rendererState.a.w.booleanValue()) {
                SVGBase.C5109b c5109b3 = this.d.d;
                b(c5109b3.a, c5109b3.b, c5109b3.c, c5109b3.d);
            }
            b(svg, this.d.d);
            if (c5109b2 != null) {
                this.a.concat(a(this.d.d, c5109b2, preserveAspectRatio));
                this.d.e = svg.p;
            } else {
                Canvas canvas = this.a;
                SVGBase.C5109b c5109b4 = this.d.d;
                canvas.translate(c5109b4.a, c5109b4.b);
                this.d.e = null;
            }
            boolean m2 = m();
            s();
            a((SVGBase.SvgContainer) svg, true);
            if (m2) {
                c((SVGBase.D) svg);
            }
            d(svg);
        }
    }

    private void b(SVGBase.C5114g c5114g) {
        a("Ellipse render", new Object[0]);
        SVGBase.Length length = c5114g.q;
        if (length == null || c5114g.r == null || length.c() || c5114g.r.c()) {
            return;
        }
        a(this.d, c5114g);
        if (c() && t()) {
            Matrix matrix = c5114g.n;
            if (matrix != null) {
                this.a.concat(matrix);
            }
            Path a2 = a(c5114g);
            d(c5114g);
            b((SVGBase.D) c5114g);
            a((SVGBase.D) c5114g);
            boolean m2 = m();
            if (this.d.b) {
                a(c5114g, a2);
            }
            if (this.d.c) {
                b(a2);
            }
            if (m2) {
                c((SVGBase.D) c5114g);
            }
        }
    }

    private SVGBase.C5109b a(SVGBase.Length length, SVGBase.Length length2, SVGBase.Length length3, SVGBase.Length length4) {
        float b2 = length != null ? length.b(this) : 0.0f;
        float c2 = length2 != null ? length2.c(this) : 0.0f;
        SVGBase.C5109b i2 = i();
        return new SVGBase.C5109b(b2, c2, length3 != null ? length3.b(this) : i2.c, length4 != null ? length4.c(this) : i2.d);
    }

    private void a(SVGBase.C5118k c5118k) {
        a(c5118k.a() + " render", new Object[0]);
        a(this.d, c5118k);
        if (c()) {
            Matrix matrix = c5118k.o;
            if (matrix != null) {
                this.a.concat(matrix);
            }
            a((SVGBase.D) c5118k);
            boolean m2 = m();
            a((SVGBase.SvgContainer) c5118k, true);
            if (m2) {
                c((SVGBase.D) c5118k);
            }
            d(c5118k);
        }
    }

    private void b(SVGBase.N n2) {
        a("Text render", new Object[0]);
        a(this.d, n2);
        if (c()) {
            p();
            Matrix matrix = n2.s;
            if (matrix != null) {
                this.a.concat(matrix);
            }
            List<SVGBase.Length> list = n2.o;
            float f2 = 0.0f;
            float b2 = (list == null || list.size() == 0) ? 0.0f : n2.o.get(0).b(this);
            List<SVGBase.Length> list2 = n2.p;
            float c2 = (list2 == null || list2.size() == 0) ? 0.0f : n2.p.get(0).c(this);
            List<SVGBase.Length> list3 = n2.q;
            float b3 = (list3 == null || list3.size() == 0) ? 0.0f : n2.q.get(0).b(this);
            List<SVGBase.Length> list4 = n2.r;
            if (list4 != null && list4.size() != 0) {
                f2 = n2.r.get(0).c(this);
            }
            Style.TextAnchor d2 = d();
            if (d2 != Style.TextAnchor.Start) {
                float a2 = a((SVGBase.TextContainer) n2);
                if (d2 == Style.TextAnchor.Middle) {
                    a2 /= 2.0f;
                }
                b2 -= a2;
            }
            if (n2.h == null) {
                g gVar = new g(b2, c2);
                a((SVGBase.TextContainer) n2, (h) gVar);
                RectF rectF = gVar.c;
                n2.h = new SVGBase.C5109b(rectF.left, rectF.top, rectF.width(), gVar.c.height());
            }
            d(n2);
            b((SVGBase.D) n2);
            a((SVGBase.D) n2);
            boolean m2 = m();
            a((SVGBase.TextContainer) n2, new e(b2 + b3, c2 + f2));
            if (m2) {
                c((SVGBase.D) n2);
            }
        }
    }

    @TargetApi(29)
    private void a(Paint paint) {
        BlendMode blendMode;
        BlendMode blendMode2;
        BlendMode blendMode3;
        BlendMode blendMode4;
        BlendMode blendMode5;
        BlendMode blendMode6;
        BlendMode blendMode7;
        BlendMode blendMode8;
        BlendMode blendMode9;
        BlendMode blendMode10;
        BlendMode blendMode11;
        BlendMode blendMode12;
        BlendMode blendMode13;
        BlendMode blendMode14;
        BlendMode blendMode15;
        a("Setting blend mode to " + this.d.a.P, new Object[0]);
        switch (a.a[this.d.a.P.ordinal()]) {
            case 1:
                blendMode = BlendMode.MULTIPLY;
                paint.setBlendMode(blendMode);
                break;
            case 2:
                blendMode2 = BlendMode.SCREEN;
                paint.setBlendMode(blendMode2);
                break;
            case 3:
                blendMode3 = BlendMode.OVERLAY;
                paint.setBlendMode(blendMode3);
                break;
            case 4:
                blendMode4 = BlendMode.DARKEN;
                paint.setBlendMode(blendMode4);
                break;
            case 5:
                blendMode5 = BlendMode.LIGHTEN;
                paint.setBlendMode(blendMode5);
                break;
            case 6:
                blendMode6 = BlendMode.COLOR_DODGE;
                paint.setBlendMode(blendMode6);
                break;
            case 7:
                blendMode7 = BlendMode.COLOR_BURN;
                paint.setBlendMode(blendMode7);
                break;
            case 8:
                blendMode8 = BlendMode.HARD_LIGHT;
                paint.setBlendMode(blendMode8);
                break;
            case 9:
                blendMode9 = BlendMode.SOFT_LIGHT;
                paint.setBlendMode(blendMode9);
                break;
            case 10:
                blendMode10 = BlendMode.DIFFERENCE;
                paint.setBlendMode(blendMode10);
                break;
            case 11:
                blendMode11 = BlendMode.EXCLUSION;
                paint.setBlendMode(blendMode11);
                break;
            case 12:
                blendMode12 = BlendMode.HUE;
                paint.setBlendMode(blendMode12);
                break;
            case 13:
                blendMode13 = BlendMode.SATURATION;
                paint.setBlendMode(blendMode13);
                break;
            case 14:
                blendMode14 = BlendMode.COLOR;
                paint.setBlendMode(blendMode14);
                break;
            case 15:
                blendMode15 = BlendMode.LUMINOSITY;
                paint.setBlendMode(blendMode15);
                break;
            default:
                paint.setBlendMode(null);
                break;
        }
    }

    private void b(float f2, float f3, float f4, float f5) {
        float f6 = f4 + f2;
        float f7 = f5 + f3;
        SVGBase.CSSClipRect cSSClipRect = this.d.a.x;
        if (cSSClipRect != null) {
            f2 += cSSClipRect.d.b(this);
            f3 += this.d.a.x.a.c(this);
            f6 -= this.d.a.x.b.b(this);
            f7 -= this.d.a.x.c.c(this);
        }
        this.a.clipRect(f2, f3, f6, f7);
    }

    private void a(SVGBase.J j2) {
        a("Switch render", new Object[0]);
        a(this.d, j2);
        if (c()) {
            Matrix matrix = j2.o;
            if (matrix != null) {
                this.a.concat(matrix);
            }
            a((SVGBase.D) j2);
            boolean m2 = m();
            b(j2);
            if (m2) {
                c((SVGBase.D) j2);
            }
            d(j2);
        }
    }

    private RendererState b(SVGBase.SvgObject svgObject) {
        RendererState rendererState = new RendererState();
        a(rendererState, Style.a());
        return a(svgObject, rendererState);
    }

    private void b(SVGBase.D d2) {
        SVGBase.SvgPaint svgPaint = this.d.a.b;
        if (svgPaint instanceof SVGBase.C5125r) {
            a(true, d2.h, (SVGBase.C5125r) svgPaint);
        }
        SVGBase.SvgPaint svgPaint2 = this.d.a.e;
        if (svgPaint2 instanceof SVGBase.C5125r) {
            a(false, d2.h, (SVGBase.C5125r) svgPaint2);
        }
    }

    private void b(SVGBase.D d2, SVGBase.C5109b c5109b) {
        if (this.d.a.F == null) {
            return;
        }
        if (l) {
            Path a2 = a(d2, c5109b);
            if (a2 != null) {
                this.a.clipPath(a2);
                return;
            }
            return;
        }
        c(d2, c5109b);
    }

    private void a(SVGBase.T t2) {
        a("Use render", new Object[0]);
        SVGBase.Length length = t2.s;
        if (length == null || !length.c()) {
            SVGBase.Length length2 = t2.t;
            if (length2 == null || !length2.c()) {
                a(this.d, t2);
                if (c()) {
                    SVGBase.SvgObject c2 = t2.a.c(t2.p);
                    if (c2 == null) {
                        b("Use reference '%s' not found", t2.p);
                        return;
                    }
                    Matrix matrix = t2.o;
                    if (matrix != null) {
                        this.a.concat(matrix);
                    }
                    SVGBase.Length length3 = t2.q;
                    float b2 = length3 != null ? length3.b(this) : 0.0f;
                    SVGBase.Length length4 = t2.r;
                    this.a.translate(b2, length4 != null ? length4.c(this) : 0.0f);
                    a((SVGBase.D) t2);
                    boolean m2 = m();
                    a((SVGBase.SvgContainer) t2);
                    if (c2 instanceof SVGBase.Svg) {
                        SVGBase.C5109b a2 = a((SVGBase.Length) null, (SVGBase.Length) null, t2.s, t2.t);
                        r();
                        a((SVGBase.Svg) c2, a2);
                        q();
                    } else if (c2 instanceof SVGBase.K) {
                        SVGBase.Length length5 = t2.s;
                        if (length5 == null) {
                            length5 = new SVGBase.Length(100.0f, SVGBase.S.percent);
                        }
                        SVGBase.Length length6 = t2.t;
                        if (length6 == null) {
                            length6 = new SVGBase.Length(100.0f, SVGBase.S.percent);
                        }
                        SVGBase.C5109b a3 = a((SVGBase.Length) null, (SVGBase.Length) null, length5, length6);
                        r();
                        a((SVGBase.K) c2, a3);
                        q();
                    } else {
                        c(c2);
                    }
                    l();
                    if (m2) {
                        c((SVGBase.D) t2);
                    }
                    d(t2);
                }
            }
        }
    }

    private void b() {
        CanvasLegacy.save(this.a, CanvasLegacy.MATRIX_SAVE_FLAG);
        this.e.push(this.d);
        this.d = new RendererState(this.d);
    }

    private Path b(SVGBase.C5121n c5121n) {
        SVGBase.Length length = c5121n.o;
        float b2 = length == null ? 0.0f : length.b(this);
        SVGBase.Length length2 = c5121n.p;
        float c2 = length2 == null ? 0.0f : length2.c(this);
        SVGBase.Length length3 = c5121n.q;
        float b3 = length3 == null ? 0.0f : length3.b(this);
        SVGBase.Length length4 = c5121n.r;
        float c3 = length4 != null ? length4.c(this) : 0.0f;
        if (c5121n.h == null) {
            c5121n.h = new SVGBase.C5109b(Math.min(b2, b3), Math.min(c2, c3), Math.abs(b3 - b2), Math.abs(c3 - c2));
        }
        Path path = new Path();
        path.moveTo(b2, c2);
        path.lineTo(b3, c3);
        return path;
    }

    private Path b(SVGBase.w wVar) {
        Path path = new Path();
        float[] fArr = wVar.o;
        int i2 = 0;
        int length = fArr != null ? fArr.length : 0;
        if (length % 2 != 0) {
            return null;
        }
        if (length > 0) {
            while (length >= 2) {
                if (i2 == 0) {
                    float[] fArr2 = wVar.o;
                    path.moveTo(fArr2[i2], fArr2[i2 + 1]);
                } else {
                    float[] fArr3 = wVar.o;
                    path.lineTo(fArr3[i2], fArr3[i2 + 1]);
                }
                i2 += 2;
                length -= 2;
            }
            if (wVar instanceof SVGBase.x) {
                path.close();
            }
        }
        if (wVar.h == null) {
            wVar.h = a(path);
        }
        return path;
    }

    private void a(SVGBase.C5126s c5126s) {
        a("Path render", new Object[0]);
        if (c5126s.o == null) {
            return;
        }
        a(this.d, c5126s);
        if (c() && t()) {
            RendererState rendererState = this.d;
            if (rendererState.c || rendererState.b) {
                Matrix matrix = c5126s.n;
                if (matrix != null) {
                    this.a.concat(matrix);
                }
                Path a2 = new PathConverter(c5126s.o).a();
                if (c5126s.h == null) {
                    c5126s.h = a(a2);
                }
                d(c5126s);
                b((SVGBase.D) c5126s);
                a((SVGBase.D) c5126s);
                boolean m2 = m();
                if (this.d.b) {
                    a2.setFillType(j());
                    a(c5126s, a2);
                }
                if (this.d.c) {
                    b(a2);
                }
                a((SVGBase.AbstractC5117j) c5126s);
                if (m2) {
                    c((SVGBase.D) c5126s);
                }
            }
        }
    }

    private SVGBase.C5109b a(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new SVGBase.C5109b(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    private List<c> a(SVGBase.C5121n c5121n) {
        SVGBase.Length length = c5121n.o;
        float b2 = length != null ? length.b(this) : 0.0f;
        SVGBase.Length length2 = c5121n.p;
        float c2 = length2 != null ? length2.c(this) : 0.0f;
        SVGBase.Length length3 = c5121n.q;
        float b3 = length3 != null ? length3.b(this) : 0.0f;
        SVGBase.Length length4 = c5121n.r;
        float c3 = length4 != null ? length4.c(this) : 0.0f;
        ArrayList arrayList = new ArrayList(2);
        float f2 = b3 - b2;
        float f3 = c3 - c2;
        arrayList.add(new c(b2, c2, f2, f3));
        arrayList.add(new c(b3, c3, f2, f3));
        return arrayList;
    }

    private List<c> a(SVGBase.w wVar) {
        float[] fArr = wVar.o;
        int length = fArr != null ? fArr.length : 0;
        int i2 = 2;
        if (length < 2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        float[] fArr2 = wVar.o;
        float f2 = 0.0f;
        c cVar = new c(fArr2[0], fArr2[1], 0.0f, 0.0f);
        float f3 = 0.0f;
        while (i2 < length) {
            float[] fArr3 = wVar.o;
            f2 = fArr3[i2];
            f3 = fArr3[i2 + 1];
            cVar.a(f2, f3);
            arrayList.add(cVar);
            i2 += 2;
            cVar = new c(f2, f3, f2 - cVar.a, f3 - cVar.b);
        }
        if (wVar instanceof SVGBase.x) {
            float[] fArr4 = wVar.o;
            float f4 = fArr4[0];
            if (f2 != f4) {
                float f5 = fArr4[1];
                if (f3 != f5) {
                    cVar.a(f4, f5);
                    arrayList.add(cVar);
                    c cVar2 = new c(f4, f5, f4 - cVar.a, f5 - cVar.b);
                    cVar2.a((c) arrayList.get(0));
                    arrayList.add(cVar2);
                    arrayList.set(0, cVar2);
                }
            }
            return arrayList;
        }
        arrayList.add(cVar);
        return arrayList;
    }

    private void a(SVGBase.x xVar) {
        a("Polygon render", new Object[0]);
        a(this.d, xVar);
        if (c() && t()) {
            RendererState rendererState = this.d;
            if (rendererState.c || rendererState.b) {
                Matrix matrix = xVar.n;
                if (matrix != null) {
                    this.a.concat(matrix);
                }
                float[] fArr = xVar.o;
                if ((fArr != null ? fArr.length : 0) < 2) {
                    return;
                }
                Path b2 = b((SVGBase.w) xVar);
                d(xVar);
                b((SVGBase.D) xVar);
                a((SVGBase.D) xVar);
                boolean m2 = m();
                if (this.d.b) {
                    a(xVar, b2);
                }
                if (this.d.c) {
                    b(b2);
                }
                a((SVGBase.AbstractC5117j) xVar);
                if (m2) {
                    c((SVGBase.D) xVar);
                }
            }
        }
    }

    private void a(SVGBase.TextContainer textContainer, h hVar) {
        if (c()) {
            Iterator<SVGBase.SvgObject> it = textContainer.i.iterator();
            boolean z2 = true;
            while (it.hasNext()) {
                SVGBase.SvgObject next = it.next();
                if (next instanceof SVGBase.TextSequence) {
                    hVar.a(a(((SVGBase.TextSequence) next).c, z2, !it.hasNext()));
                } else {
                    a(next, hVar);
                }
                z2 = false;
            }
        }
    }

    private void a(SVGBase.SvgObject svgObject, h hVar) {
        float f2;
        float f3;
        float f4;
        Style.TextAnchor d2;
        if (hVar.a((SVGBase.TextContainer) svgObject)) {
            if (svgObject instanceof SVGBase.P) {
                r();
                a((SVGBase.P) svgObject);
                q();
                return;
            }
            if (svgObject instanceof SVGBase.M) {
                a("TSpan render", new Object[0]);
                r();
                SVGBase.M m2 = (SVGBase.M) svgObject;
                a(this.d, m2);
                if (c()) {
                    p();
                    List<SVGBase.Length> list = m2.o;
                    boolean z2 = list != null && list.size() > 0;
                    boolean z3 = hVar instanceof e;
                    float f5 = 0.0f;
                    if (z3) {
                        float b2 = !z2 ? ((e) hVar).a : m2.o.get(0).b(this);
                        List<SVGBase.Length> list2 = m2.p;
                        f3 = (list2 == null || list2.size() == 0) ? ((e) hVar).b : m2.p.get(0).c(this);
                        List<SVGBase.Length> list3 = m2.q;
                        f4 = (list3 == null || list3.size() == 0) ? 0.0f : m2.q.get(0).b(this);
                        List<SVGBase.Length> list4 = m2.r;
                        if (list4 != null && list4.size() != 0) {
                            f5 = m2.r.get(0).c(this);
                        }
                        f2 = f5;
                        f5 = b2;
                    } else {
                        f2 = 0.0f;
                        f3 = 0.0f;
                        f4 = 0.0f;
                    }
                    if (z2 && (d2 = d()) != Style.TextAnchor.Start) {
                        float a2 = a((SVGBase.TextContainer) m2);
                        if (d2 == Style.TextAnchor.Middle) {
                            a2 /= 2.0f;
                        }
                        f5 -= a2;
                    }
                    b((SVGBase.D) m2.getTextRoot());
                    if (z3) {
                        e eVar = (e) hVar;
                        eVar.a = f5 + f4;
                        eVar.b = f3 + f2;
                    }
                    boolean m3 = m();
                    a((SVGBase.TextContainer) m2, hVar);
                    if (m3) {
                        c((SVGBase.D) m2);
                    }
                }
                q();
                return;
            }
            if (svgObject instanceof SVGBase.L) {
                r();
                SVGBase.L l2 = (SVGBase.L) svgObject;
                a(this.d, l2);
                if (c()) {
                    b((SVGBase.D) l2.getTextRoot());
                    SVGBase.SvgObject c2 = svgObject.a.c(l2.o);
                    if (c2 instanceof SVGBase.TextContainer) {
                        StringBuilder sb = new StringBuilder();
                        a((SVGBase.TextContainer) c2, sb);
                        if (sb.length() > 0) {
                            hVar.a(sb.toString());
                        }
                    } else {
                        b("Tref reference '%s' not found", l2.o);
                    }
                }
                q();
            }
        }
    }

    private void a(SVGBase.P p2) {
        a("TextPath render", new Object[0]);
        a(this.d, p2);
        if (c() && t()) {
            p();
            SVGBase.SvgObject c2 = p2.a.c(p2.o);
            if (c2 == null) {
                b("TextPath reference '%s' not found", p2.o);
                return;
            }
            SVGBase.C5126s c5126s = (SVGBase.C5126s) c2;
            Path a2 = new PathConverter(c5126s.o).a();
            Matrix matrix = c5126s.n;
            if (matrix != null) {
                a2.transform(matrix);
            }
            PathMeasure pathMeasure = new PathMeasure(a2, false);
            SVGBase.Length length = p2.p;
            float a3 = length != null ? length.a(this, pathMeasure.getLength()) : 0.0f;
            Style.TextAnchor d2 = d();
            if (d2 != Style.TextAnchor.Start) {
                float a4 = a((SVGBase.TextContainer) p2);
                if (d2 == Style.TextAnchor.Middle) {
                    a4 /= 2.0f;
                }
                a3 -= a4;
            }
            b((SVGBase.D) p2.getTextRoot());
            boolean m2 = m();
            a((SVGBase.TextContainer) p2, (h) new d(a2, a3, 0.0f));
            if (m2) {
                c((SVGBase.D) p2);
            }
        }
    }

    private float a(SVGBase.TextContainer textContainer) {
        i iVar = new i();
        a(textContainer, (h) iVar);
        return iVar.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float a(String str, Paint paint) {
        int length = str.length();
        float[] fArr = new float[length];
        paint.getTextWidths(str, fArr);
        float f2 = 0.0f;
        for (int i2 = 0; i2 < length; i2++) {
            f2 += fArr[i2];
        }
        return f2;
    }

    private void a(SVGBase.TextContainer textContainer, StringBuilder sb) {
        Iterator<SVGBase.SvgObject> it = textContainer.i.iterator();
        boolean z2 = true;
        while (it.hasNext()) {
            SVGBase.SvgObject next = it.next();
            if (next instanceof SVGBase.TextContainer) {
                a((SVGBase.TextContainer) next, sb);
            } else if (next instanceof SVGBase.TextSequence) {
                sb.append(a(((SVGBase.TextSequence) next).c, z2, !it.hasNext()));
            }
            z2 = false;
        }
    }

    private String a(String str, boolean z2, boolean z3) {
        if (this.d.f) {
            return t.matcher(str).replaceAll(" ");
        }
        String replaceAll = v.matcher(u.matcher(str).replaceAll("")).replaceAll(" ");
        if (z2) {
            replaceAll = w.matcher(replaceAll).replaceAll("");
        }
        if (z3) {
            replaceAll = x.matcher(replaceAll).replaceAll("");
        }
        return y.matcher(replaceAll).replaceAll(" ");
    }

    private void a(SVGBase.K k2, SVGBase.C5109b c5109b) {
        a("Symbol render", new Object[0]);
        if (c5109b.c == 0.0f || c5109b.d == 0.0f) {
            return;
        }
        PreserveAspectRatio preserveAspectRatio = k2.o;
        if (preserveAspectRatio == null) {
            preserveAspectRatio = PreserveAspectRatio.LETTERBOX;
        }
        a(this.d, k2);
        RendererState rendererState = this.d;
        rendererState.d = c5109b;
        if (!rendererState.a.w.booleanValue()) {
            SVGBase.C5109b c5109b2 = this.d.d;
            b(c5109b2.a, c5109b2.b, c5109b2.c, c5109b2.d);
        }
        SVGBase.C5109b c5109b3 = k2.p;
        if (c5109b3 != null) {
            this.a.concat(a(this.d.d, c5109b3, preserveAspectRatio));
            this.d.e = k2.p;
        } else {
            Canvas canvas = this.a;
            SVGBase.C5109b c5109b4 = this.d.d;
            canvas.translate(c5109b4.a, c5109b4.b);
            this.d.e = null;
        }
        boolean m2 = m();
        a((SVGBase.SvgContainer) k2, true);
        if (m2) {
            c((SVGBase.D) k2);
        }
        d(k2);
    }

    private void a(SVGBase.C5120m c5120m) {
        SVGBase.Length length;
        String str;
        a("Image render", new Object[0]);
        SVGBase.Length length2 = c5120m.s;
        if (length2 == null || length2.c() || (length = c5120m.t) == null || length.c() || (str = c5120m.p) == null) {
            return;
        }
        PreserveAspectRatio preserveAspectRatio = c5120m.o;
        if (preserveAspectRatio == null) {
            preserveAspectRatio = PreserveAspectRatio.LETTERBOX;
        }
        Bitmap a2 = a(str);
        if (a2 == null) {
            SVGExternalFileResolver sVGExternalFileResolver = this.i;
            if (sVGExternalFileResolver == null) {
                return;
            } else {
                a2 = sVGExternalFileResolver.resolveImage(c5120m.p);
            }
        }
        if (a2 == null) {
            b("Could not locate image '%s'", c5120m.p);
            return;
        }
        SVGBase.C5109b c5109b = new SVGBase.C5109b(0.0f, 0.0f, a2.getWidth(), a2.getHeight());
        a(this.d, c5120m);
        if (c() && t()) {
            Matrix matrix = c5120m.u;
            if (matrix != null) {
                this.a.concat(matrix);
            }
            SVGBase.Length length3 = c5120m.q;
            float b2 = length3 != null ? length3.b(this) : 0.0f;
            SVGBase.Length length4 = c5120m.r;
            this.d.d = new SVGBase.C5109b(b2, length4 != null ? length4.c(this) : 0.0f, c5120m.s.b(this), c5120m.t.b(this));
            if (!this.d.a.w.booleanValue()) {
                SVGBase.C5109b c5109b2 = this.d.d;
                b(c5109b2.a, c5109b2.b, c5109b2.c, c5109b2.d);
            }
            c5120m.h = this.d.d;
            d(c5120m);
            a((SVGBase.D) c5120m);
            boolean m2 = m();
            s();
            this.a.save();
            this.a.concat(a(this.d.d, c5109b, preserveAspectRatio));
            this.a.drawBitmap(a2, 0.0f, 0.0f, new Paint(this.d.a.N != Style.RenderQuality.optimizeSpeed ? 2 : 0));
            this.a.restore();
            if (m2) {
                c((SVGBase.D) c5120m);
            }
        }
    }

    private Bitmap a(String str) {
        int indexOf;
        if (!str.startsWith("data:") || str.length() < 14 || (indexOf = str.indexOf(44)) < 12 || !";base64".equals(str.substring(indexOf - 7, indexOf))) {
            return null;
        }
        try {
            byte[] decode = Base64.decode(str.substring(indexOf + 1), 0);
            return BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (Exception e2) {
            Log.e("SVGAndroidRenderer", "Could not decode bad Data URL", e2);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0083, code lost:
    
        if (r12 != 8) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Matrix a(SVGBase.C5109b c5109b, SVGBase.C5109b c5109b2, PreserveAspectRatio preserveAspectRatio) {
        float f2;
        float f3;
        Matrix matrix = new Matrix();
        if (preserveAspectRatio != null && preserveAspectRatio.getAlignment() != null) {
            float f4 = c5109b.c / c5109b2.c;
            float f5 = c5109b.d / c5109b2.d;
            float f6 = -c5109b2.a;
            float f7 = -c5109b2.b;
            if (preserveAspectRatio.equals(PreserveAspectRatio.STRETCH)) {
                matrix.preTranslate(c5109b.a, c5109b.b);
                matrix.preScale(f4, f5);
                matrix.preTranslate(f6, f7);
                return matrix;
            }
            float max = preserveAspectRatio.getScale() == PreserveAspectRatio.Scale.slice ? Math.max(f4, f5) : Math.min(f4, f5);
            float f8 = c5109b.c / max;
            float f9 = c5109b.d / max;
            int[] iArr = a.b;
            switch (iArr[preserveAspectRatio.getAlignment().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    f3 = (c5109b2.c - f8) / 2.0f;
                    break;
                case 4:
                case 5:
                case 6:
                    f3 = c5109b2.c - f8;
                    break;
            }
            f6 -= f3;
            int i2 = iArr[preserveAspectRatio.getAlignment().ordinal()];
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        if (i2 != 6) {
                            if (i2 != 7) {
                            }
                        }
                    }
                }
                f2 = c5109b2.d - f9;
                f7 -= f2;
                matrix.preTranslate(c5109b.a, c5109b.b);
                matrix.preScale(max, max);
                matrix.preTranslate(f6, f7);
            }
            f2 = (c5109b2.d - f9) / 2.0f;
            f7 -= f2;
            matrix.preTranslate(c5109b.a, c5109b.b);
            matrix.preScale(max, max);
            matrix.preTranslate(f6, f7);
        }
        return matrix;
    }

    private boolean a(Style style, long j2) {
        return (style.a & j2) != 0;
    }

    private void a(RendererState rendererState, Style style) {
        if (a(style, 4096L)) {
            rendererState.a.n = style.n;
        }
        if (a(style, 2048L)) {
            rendererState.a.m = style.m;
        }
        if (a(style, 1L)) {
            rendererState.a.b = style.b;
            SVGBase.SvgPaint svgPaint = style.b;
            rendererState.b = (svgPaint == null || svgPaint == SVGBase.Colour.c) ? false : true;
        }
        if (a(style, 4L)) {
            rendererState.a.d = style.d;
        }
        if (a(style, 6149L)) {
            a(rendererState, true, rendererState.a.b);
        }
        if (a(style, 2L)) {
            rendererState.a.c = style.c;
        }
        if (a(style, 8L)) {
            rendererState.a.e = style.e;
            SVGBase.SvgPaint svgPaint2 = style.e;
            rendererState.c = (svgPaint2 == null || svgPaint2 == SVGBase.Colour.c) ? false : true;
        }
        if (a(style, 16L)) {
            rendererState.a.f = style.f;
        }
        if (a(style, 6168L)) {
            a(rendererState, false, rendererState.a.e);
        }
        if (a(style, 34359738368L)) {
            rendererState.a.M = style.M;
        }
        if (a(style, 32L)) {
            Style style2 = rendererState.a;
            SVGBase.Length length = style.g;
            style2.g = length;
            rendererState.h.setStrokeWidth(length.a(this));
        }
        if (a(style, 64L)) {
            rendererState.a.h = style.h;
            int i2 = a.c[style.h.ordinal()];
            if (i2 == 1) {
                rendererState.h.setStrokeCap(Paint.Cap.BUTT);
            } else if (i2 == 2) {
                rendererState.h.setStrokeCap(Paint.Cap.ROUND);
            } else if (i2 == 3) {
                rendererState.h.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (a(style, 128L)) {
            rendererState.a.i = style.i;
            int i3 = a.d[style.i.ordinal()];
            if (i3 == 1) {
                rendererState.h.setStrokeJoin(Paint.Join.MITER);
            } else if (i3 == 2) {
                rendererState.h.setStrokeJoin(Paint.Join.ROUND);
            } else if (i3 == 3) {
                rendererState.h.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (a(style, 256L)) {
            rendererState.a.j = style.j;
            rendererState.h.setStrokeMiter(style.j.floatValue());
        }
        if (a(style, 512L)) {
            rendererState.a.k = style.k;
        }
        if (a(style, 1024L)) {
            rendererState.a.l = style.l;
        }
        if (a(style, 1536L)) {
            SVGBase.Length[] lengthArr = rendererState.a.k;
            if (lengthArr == null) {
                rendererState.h.setPathEffect(null);
            } else {
                int length2 = lengthArr.length;
                int i4 = length2 % 2 == 0 ? length2 : length2 * 2;
                float[] fArr = new float[i4];
                float f2 = 0.0f;
                for (int i5 = 0; i5 < i4; i5++) {
                    float a2 = rendererState.a.k[i5 % length2].a(this);
                    fArr[i5] = a2;
                    f2 += a2;
                }
                if (f2 == 0.0f) {
                    rendererState.h.setPathEffect(null);
                } else {
                    float a3 = rendererState.a.l.a(this);
                    if (a3 < 0.0f) {
                        a3 = (a3 % f2) + f2;
                    }
                    rendererState.h.setPathEffect(new DashPathEffect(fArr, a3));
                }
            }
        }
        if (a(style, 16384L)) {
            float f3 = f();
            rendererState.a.p = style.p;
            rendererState.g.setTextSize(style.p.a(this, f3));
            rendererState.h.setTextSize(style.p.a(this, f3));
        }
        if (a(style, 8192L)) {
            rendererState.a.o = style.o;
        }
        if (a(style, 32768L)) {
            if (style.q.floatValue() == Float.MIN_VALUE) {
                float floatValue = rendererState.a.q.floatValue();
                if (floatValue >= 100.0f && floatValue < 550.0f) {
                    rendererState.a.q = Float.valueOf(100.0f);
                } else if (floatValue >= 550.0f && floatValue < 750.0f) {
                    rendererState.a.q = Float.valueOf(400.0f);
                } else if (floatValue >= 750.0f) {
                    rendererState.a.q = Float.valueOf(700.0f);
                }
            } else if (style.q.floatValue() == Float.MAX_VALUE) {
                float floatValue2 = rendererState.a.q.floatValue();
                if (floatValue2 < 350.0f) {
                    rendererState.a.q = Float.valueOf(400.0f);
                } else if (floatValue2 >= 350.0f && floatValue2 < 550.0f) {
                    rendererState.a.q = Float.valueOf(700.0f);
                } else if (floatValue2 >= 550.0f && floatValue2 < 900.0f) {
                    rendererState.a.q = Float.valueOf(900.0f);
                }
            } else {
                rendererState.a.q = style.q;
            }
        }
        if (a(style, 65536L)) {
            rendererState.a.r = style.r;
        }
        if (a(style, 2251799813685248L)) {
            rendererState.a.s = style.s;
        }
        if (a(style, 131072L)) {
            rendererState.a.t = style.t;
            Paint paint = rendererState.g;
            Style.TextDecoration textDecoration = style.t;
            Style.TextDecoration textDecoration2 = Style.TextDecoration.LineThrough;
            paint.setStrikeThruText(textDecoration == textDecoration2);
            Paint paint2 = rendererState.g;
            Style.TextDecoration textDecoration3 = style.t;
            Style.TextDecoration textDecoration4 = Style.TextDecoration.Underline;
            paint2.setUnderlineText(textDecoration3 == textDecoration4);
            if (k) {
                rendererState.h.setStrikeThruText(style.t == textDecoration2);
                rendererState.h.setUnderlineText(style.t == textDecoration4);
            }
        }
        if (a(style, 68719476736L)) {
            rendererState.a.u = style.u;
        }
        if (a(style, 262144L)) {
            rendererState.a.v = style.v;
        }
        if (a(style, 524288L)) {
            rendererState.a.w = style.w;
        }
        if (a(style, CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE)) {
            rendererState.a.y = style.y;
        }
        if (a(style, 4194304L)) {
            rendererState.a.z = style.z;
        }
        if (a(style, 8388608L)) {
            rendererState.a.A = style.A;
        }
        if (a(style, 16777216L)) {
            rendererState.a.B = style.B;
        }
        if (a(style, 33554432L)) {
            rendererState.a.C = style.C;
        }
        if (a(style, 1048576L)) {
            rendererState.a.x = style.x;
        }
        if (a(style, 268435456L)) {
            rendererState.a.F = style.F;
        }
        if (a(style, 536870912L)) {
            rendererState.a.G = style.G;
        }
        if (a(style, 1073741824L)) {
            rendererState.a.H = style.H;
        }
        if (a(style, 67108864L)) {
            rendererState.a.D = style.D;
        }
        if (a(style, 134217728L)) {
            rendererState.a.E = style.E;
        }
        if (a(style, 8589934592L)) {
            rendererState.a.K = style.K;
        }
        if (a(style, 17179869184L)) {
            rendererState.a.L = style.L;
        }
        if (a(style, 137438953472L)) {
            rendererState.a.N = style.N;
        }
        if (a(style, 274877906944L)) {
            rendererState.a.O = style.O;
        }
        if (a(style, 549755813888L)) {
            rendererState.a.P = style.P;
        }
        if (a(style, 562949953421312L)) {
            rendererState.a.Q = style.Q;
            rendererState.i.applyKerning(style.Q);
        }
        if (a(style, 35184372088832L)) {
            rendererState.a.W = style.W;
            rendererState.i.applySettings(style.W);
        }
        if (a(style, 1099511627776L)) {
            rendererState.a.R = style.R;
            rendererState.i.applySettings(style.R);
        }
        if (a(style, 2199023255552L)) {
            rendererState.a.S = style.S;
            rendererState.i.applySettings(style.S);
        }
        if (a(style, 4398046511104L)) {
            rendererState.a.T = style.T;
            rendererState.i.applySettings(style.T);
        }
        if (a(style, 8796093022208L)) {
            rendererState.a.U = style.U;
            rendererState.i.applySettings(style.U);
        }
        if (a(style, 17592186044416L)) {
            rendererState.a.V = style.V;
            rendererState.i.applySettings(style.V);
        }
        if (o && a(style, 1125899906842624L)) {
            rendererState.a.X = style.X;
            rendererState.j.applySettings(style.X);
        }
        if (a(style, 70368744177664L)) {
            rendererState.a.Y = style.Y;
        }
        if (a(style, 140737488355328L)) {
            rendererState.a.Z = style.Z;
        }
        if (a(style, 281474976710656L)) {
            rendererState.a.a0 = style.a0;
        }
        if (a(style, 4503599627370496L)) {
            rendererState.a.b0 = style.b0;
            if (n) {
                rendererState.g.setLetterSpacing(style.b0.a(this) / f());
                rendererState.h.setLetterSpacing(style.b0.a(this) / f());
            }
        }
        if (a(style, 9007199254740992L)) {
            rendererState.a.c0 = style.c0;
            if (q) {
                rendererState.g.setWordSpacing(style.c0.a(this));
                rendererState.h.setWordSpacing(style.c0.a(this));
            }
        }
    }

    private void a(RendererState rendererState, boolean z2, SVGBase.SvgPaint svgPaint) {
        int i2;
        float floatValue = (z2 ? rendererState.a.d : rendererState.a.f).floatValue();
        if (svgPaint instanceof SVGBase.Colour) {
            i2 = ((SVGBase.Colour) svgPaint).a;
        } else if (!(svgPaint instanceof SVGBase.C5112e)) {
            return;
        } else {
            i2 = rendererState.a.n.a;
        }
        int a2 = a(i2, floatValue);
        if (z2) {
            rendererState.g.setColor(a2);
        } else {
            rendererState.h.setColor(a2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0049, code lost:
    
        if (r6.equals("fantasy") == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Typeface a(String str, Float f2, Style.FontStyle fontStyle) {
        char c2 = 2;
        boolean z2 = fontStyle == Style.FontStyle.italic;
        int i2 = f2.floatValue() >= 700.0f ? z2 ? 3 : 1 : z2 ? 2 : 0;
        str.getClass();
        switch (str.hashCode()) {
            case -1536685117:
                if (str.equals("sans-serif")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1431958525:
                if (str.equals("monospace")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -1081737434:
                break;
            case 109326717:
                if (str.equals("serif")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 1126973893:
                if (str.equals("cursive")) {
                    c2 = 4;
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
            case 2:
            case 4:
                return Typeface.create(Typeface.SANS_SERIF, i2);
            case 1:
                return Typeface.create(Typeface.MONOSPACE, i2);
            case 3:
                return Typeface.create(Typeface.SERIF, i2);
            default:
                return null;
        }
    }

    private static int a(float f2) {
        int i2 = (int) (f2 * 256.0f);
        if (i2 < 0) {
            return 0;
        }
        return Math.min(i2, 255);
    }

    private static int a(int i2, float f2) {
        int round = Math.round(((i2 >> 24) & 255) * f2);
        return (i2 & 16777215) | ((round < 0 ? 0 : Math.min(round, 255)) << 24);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(float f2, float f3, float f4, float f5, float f6, boolean z2, boolean z3, float f7, float f8, SVGBase.InterfaceC5128u interfaceC5128u) {
        if (f2 == f7 && f3 == f8) {
            return;
        }
        if (f4 != 0.0f && f5 != 0.0f) {
            float abs = Math.abs(f4);
            float abs2 = Math.abs(f5);
            double radians = Math.toRadians(f6 % 360.0d);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d2 = (f2 - f7) / 2.0d;
            double d3 = (f3 - f8) / 2.0d;
            double d4 = (cos * d2) + (sin * d3);
            double d5 = ((-sin) * d2) + (d3 * cos);
            double d6 = abs * abs;
            double d7 = abs2 * abs2;
            double d8 = d4 * d4;
            double d9 = d5 * d5;
            double d10 = (d8 / d6) + (d9 / d7);
            if (d10 > 0.99999d) {
                double sqrt = Math.sqrt(d10) * 1.00001d;
                abs = (float) (abs * sqrt);
                abs2 = (float) (sqrt * abs2);
                d6 = abs * abs;
                d7 = abs2 * abs2;
            }
            double d11 = z2 == z3 ? -1.0d : 1.0d;
            double d12 = d6 * d7;
            double d13 = d6 * d9;
            double d14 = d7 * d8;
            double d15 = ((d12 - d13) - d14) / (d13 + d14);
            if (d15 < 0.0d) {
                d15 = 0.0d;
            }
            double sqrt2 = d11 * Math.sqrt(d15);
            double d16 = abs;
            double d17 = abs2;
            double d18 = ((d16 * d5) / d17) * sqrt2;
            float f9 = abs;
            float f10 = abs2;
            double d19 = sqrt2 * (-((d17 * d4) / d16));
            double d20 = ((f2 + f7) / 2.0d) + ((cos * d18) - (sin * d19));
            double d21 = ((f3 + f8) / 2.0d) + (sin * d18) + (cos * d19);
            double d22 = (d4 - d18) / d16;
            double d23 = (d5 - d19) / d17;
            double d24 = ((-d4) - d18) / d16;
            double d25 = ((-d5) - d19) / d17;
            double d26 = (d22 * d22) + (d23 * d23);
            double acos = (d23 < 0.0d ? -1.0d : 1.0d) * Math.acos(d22 / Math.sqrt(d26));
            double a2 = ((d22 * d25) - (d23 * d24) < 0.0d ? -1.0d : 1.0d) * a(((d22 * d24) + (d23 * d25)) / Math.sqrt(d26 * ((d24 * d24) + (d25 * d25))));
            if (a2 == 0.0d) {
                interfaceC5128u.lineTo(f7, f8);
                return;
            }
            if (!z3 && a2 > 0.0d) {
                a2 -= 6.283185307179586d;
            } else if (z3 && a2 < 0.0d) {
                a2 += 6.283185307179586d;
            }
            float[] a3 = a(acos % 6.283185307179586d, a2 % 6.283185307179586d);
            Matrix matrix = new Matrix();
            matrix.postScale(f9, f10);
            matrix.postRotate(f6);
            matrix.postTranslate((float) d20, (float) d21);
            matrix.mapPoints(a3);
            a3[a3.length - 2] = f7;
            a3[a3.length - 1] = f8;
            for (int i2 = 0; i2 < a3.length; i2 += 6) {
                interfaceC5128u.cubicTo(a3[i2], a3[i2 + 1], a3[i2 + 2], a3[i2 + 3], a3[i2 + 4], a3[i2 + 5]);
            }
            return;
        }
        interfaceC5128u.lineTo(f7, f8);
    }

    private static double a(double d2) {
        if (d2 < -1.0d) {
            return 3.141592653589793d;
        }
        if (d2 > 1.0d) {
            return 0.0d;
        }
        return Math.acos(d2);
    }

    private static float[] a(double d2, double d3) {
        int ceil = (int) Math.ceil((Math.abs(d3) * 2.0d) / 3.141592653589793d);
        double d4 = d3 / ceil;
        double d5 = d4 / 2.0d;
        double sin = (Math.sin(d5) * 1.3333333333333333d) / (Math.cos(d5) + 1.0d);
        float[] fArr = new float[ceil * 6];
        int i2 = 0;
        int i3 = 0;
        while (i2 < ceil) {
            double d6 = d2 + (i2 * d4);
            double cos = Math.cos(d6);
            double sin2 = Math.sin(d6);
            double d7 = d4;
            fArr[i3] = (float) (cos - (sin * sin2));
            fArr[i3 + 1] = (float) (sin2 + (cos * sin));
            double d8 = d6 + d7;
            double cos2 = Math.cos(d8);
            double sin3 = Math.sin(d8);
            fArr[i3 + 2] = (float) ((sin * sin3) + cos2);
            fArr[i3 + 3] = (float) (sin3 - (sin * cos2));
            int i4 = i3 + 5;
            fArr[i3 + 4] = (float) cos2;
            i3 += 6;
            fArr[i4] = (float) sin3;
            i2++;
            d4 = d7;
        }
        return fArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(SVGBase.AbstractC5117j abstractC5117j) {
        SVGBase.C5122o c5122o;
        String str;
        SVGBase.C5122o c5122o2;
        String str2;
        SVGBase.C5122o c5122o3;
        List<c> a2;
        int size;
        int i2;
        Style style = this.d.a;
        String str3 = style.y;
        if (str3 == null && style.z == null && style.A == null) {
            return;
        }
        if (str3 != null) {
            SVGBase.SvgObject c2 = abstractC5117j.a.c(str3);
            if (c2 != null) {
                c5122o = (SVGBase.C5122o) c2;
                str = this.d.a.z;
                if (str != null) {
                    SVGBase.SvgObject c3 = abstractC5117j.a.c(str);
                    if (c3 != null) {
                        c5122o2 = (SVGBase.C5122o) c3;
                        str2 = this.d.a.A;
                        if (str2 != null) {
                            SVGBase.SvgObject c4 = abstractC5117j.a.c(str2);
                            if (c4 != null) {
                                c5122o3 = (SVGBase.C5122o) c4;
                                if (!(abstractC5117j instanceof SVGBase.C5126s)) {
                                    a2 = new b(((SVGBase.C5126s) abstractC5117j).o).a();
                                } else if (abstractC5117j instanceof SVGBase.C5121n) {
                                    a2 = a((SVGBase.C5121n) abstractC5117j);
                                } else {
                                    a2 = a((SVGBase.w) abstractC5117j);
                                }
                                if (a2 == null && (size = a2.size()) != 0) {
                                    Style style2 = this.d.a;
                                    style2.A = null;
                                    style2.z = null;
                                    style2.y = null;
                                    if (c5122o != null) {
                                        a(c5122o, a2.get(0));
                                    }
                                    if (c5122o2 != null && a2.size() > 2) {
                                        c cVar = a2.get(0);
                                        c cVar2 = a2.get(1);
                                        i2 = 1;
                                        while (i2 < size - 1) {
                                            i2++;
                                            c cVar3 = a2.get(i2);
                                            cVar = cVar2.e ? a(cVar, cVar2, cVar3) : cVar2;
                                            a(c5122o2, cVar);
                                            cVar2 = cVar3;
                                        }
                                    }
                                    if (c5122o3 == null) {
                                        a(c5122o3, a2.get(size - 1));
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            b("Marker reference '%s' not found", this.d.a.A);
                        }
                        c5122o3 = null;
                        if (!(abstractC5117j instanceof SVGBase.C5126s)) {
                        }
                        if (a2 == null) {
                            return;
                        }
                        Style style22 = this.d.a;
                        style22.A = null;
                        style22.z = null;
                        style22.y = null;
                        if (c5122o != null) {
                        }
                        if (c5122o2 != null) {
                            c cVar4 = a2.get(0);
                            c cVar22 = a2.get(1);
                            i2 = 1;
                            while (i2 < size - 1) {
                            }
                        }
                        if (c5122o3 == null) {
                        }
                    } else {
                        b("Marker reference '%s' not found", this.d.a.z);
                    }
                }
                c5122o2 = null;
                str2 = this.d.a.A;
                if (str2 != null) {
                }
                c5122o3 = null;
                if (!(abstractC5117j instanceof SVGBase.C5126s)) {
                }
                if (a2 == null) {
                }
            } else {
                b("Marker reference '%s' not found", this.d.a.y);
            }
        }
        c5122o = null;
        str = this.d.a.z;
        if (str != null) {
        }
        c5122o2 = null;
        str2 = this.d.a.A;
        if (str2 != null) {
        }
        c5122o3 = null;
        if (!(abstractC5117j instanceof SVGBase.C5126s)) {
        }
        if (a2 == null) {
        }
    }

    private c a(c cVar, c cVar2, c cVar3) {
        float a2 = a(cVar2.c, cVar2.d, cVar2.a - cVar.a, cVar2.b - cVar.b);
        if (a2 == 0.0f) {
            a2 = a(cVar2.c, cVar2.d, cVar3.a - cVar2.a, cVar3.b - cVar2.b);
        }
        if (a2 > 0.0f || (a2 == 0.0f && (cVar2.c > 0.0f || cVar2.d >= 0.0f))) {
            return cVar2;
        }
        cVar2.c = -cVar2.c;
        cVar2.d = -cVar2.d;
        return cVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0101, code lost:
    
        if (r7 != 8) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(SVGBase.C5122o c5122o, c cVar) {
        float f2;
        SVGBase.C5109b c5109b;
        boolean m2;
        float f3;
        float f4;
        float f5;
        r();
        Float f6 = c5122o.v;
        float f7 = 0.0f;
        if (f6 != null) {
            if (Float.isNaN(f6.floatValue())) {
                float f8 = cVar.c;
                if (f8 != 0.0f || cVar.d != 0.0f) {
                    f2 = (float) Math.toDegrees(Math.atan2(cVar.d, f8));
                }
            } else {
                f2 = c5122o.v.floatValue();
            }
            float a2 = !c5122o.q ? 1.0f : this.d.a.g.a(this.b);
            this.d = b((SVGBase.SvgObject) c5122o);
            Matrix matrix = new Matrix();
            matrix.preTranslate(cVar.a, cVar.b);
            matrix.preRotate(f2);
            matrix.preScale(a2, a2);
            SVGBase.Length length = c5122o.r;
            float b2 = length == null ? length.b(this) : 0.0f;
            SVGBase.Length length2 = c5122o.s;
            float c2 = length2 == null ? length2.c(this) : 0.0f;
            SVGBase.Length length3 = c5122o.t;
            float b3 = length3 == null ? length3.b(this) : 3.0f;
            SVGBase.Length length4 = c5122o.u;
            float c3 = length4 != null ? length4.c(this) : 3.0f;
            c5109b = c5122o.p;
            if (c5109b == null) {
                float f9 = b3 / c5109b.c;
                float f10 = c3 / c5109b.d;
                PreserveAspectRatio preserveAspectRatio = c5122o.o;
                if (preserveAspectRatio == null) {
                    preserveAspectRatio = PreserveAspectRatio.LETTERBOX;
                }
                if (!preserveAspectRatio.equals(PreserveAspectRatio.STRETCH)) {
                    f9 = preserveAspectRatio.getScale() == PreserveAspectRatio.Scale.slice ? Math.max(f9, f10) : Math.min(f9, f10);
                    f10 = f9;
                }
                matrix.preTranslate((-b2) * f9, (-c2) * f10);
                this.a.concat(matrix);
                SVGBase.C5109b c5109b2 = c5122o.p;
                float f11 = c5109b2.c * f9;
                float f12 = c5109b2.d * f10;
                int[] iArr = a.b;
                switch (iArr[preserveAspectRatio.getAlignment().ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        f3 = (b3 - f11) / 2.0f;
                        f4 = 0.0f - f3;
                        break;
                    case 4:
                    case 5:
                    case 6:
                        f3 = b3 - f11;
                        f4 = 0.0f - f3;
                        break;
                    default:
                        f4 = 0.0f;
                        break;
                }
                int i2 = iArr[preserveAspectRatio.getAlignment().ordinal()];
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 5) {
                            if (i2 != 6) {
                                if (i2 != 7) {
                                }
                            }
                        }
                    }
                    f5 = c3 - f12;
                    f7 = 0.0f - f5;
                    if (!this.d.a.w.booleanValue()) {
                        b(f4, f7, b3, c3);
                    }
                    matrix.reset();
                    matrix.preScale(f9, f10);
                    this.a.concat(matrix);
                }
                f5 = (c3 - f12) / 2.0f;
                f7 = 0.0f - f5;
                if (!this.d.a.w.booleanValue()) {
                }
                matrix.reset();
                matrix.preScale(f9, f10);
                this.a.concat(matrix);
            } else {
                matrix.preTranslate(-b2, -c2);
                this.a.concat(matrix);
                if (!this.d.a.w.booleanValue()) {
                    b(0.0f, 0.0f, b3, c3);
                }
            }
            m2 = m();
            a((SVGBase.SvgContainer) c5122o, false);
            if (m2) {
                c((SVGBase.D) c5122o);
            }
            q();
        }
        f2 = 0.0f;
        if (!c5122o.q) {
        }
        this.d = b((SVGBase.SvgObject) c5122o);
        Matrix matrix2 = new Matrix();
        matrix2.preTranslate(cVar.a, cVar.b);
        matrix2.preRotate(f2);
        matrix2.preScale(a2, a2);
        SVGBase.Length length5 = c5122o.r;
        if (length5 == null) {
        }
        SVGBase.Length length22 = c5122o.s;
        if (length22 == null) {
        }
        SVGBase.Length length32 = c5122o.t;
        if (length32 == null) {
        }
        SVGBase.Length length42 = c5122o.u;
        if (length42 != null) {
        }
        c5109b = c5122o.p;
        if (c5109b == null) {
        }
        m2 = m();
        a((SVGBase.SvgContainer) c5122o, false);
        if (m2) {
        }
        q();
    }

    private RendererState a(SVGBase.SvgObject svgObject, RendererState rendererState) {
        int i2;
        ArrayList arrayList = new ArrayList();
        while (true) {
            i2 = 0;
            if (svgObject instanceof SVGBase.E) {
                arrayList.add(0, (SVGBase.E) svgObject);
            }
            Object obj = svgObject.b;
            if (obj == null) {
                break;
            }
            svgObject = (SVGBase.SvgObject) obj;
        }
        int size = arrayList.size();
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            a(rendererState, (SVGBase.E) obj2);
        }
        RendererState rendererState2 = this.d;
        rendererState.e = rendererState2.e;
        rendererState.d = rendererState2.d;
        return rendererState;
    }

    private void a(boolean z2, SVGBase.C5109b c5109b, SVGBase.C5125r c5125r) {
        SVGBase.SvgObject c2 = this.c.c(c5125r.a);
        if (c2 == null) {
            b("%s reference '%s' not found", z2 ? "Fill" : "Stroke", c5125r.a);
            SVGBase.SvgPaint svgPaint = c5125r.b;
            if (svgPaint != null) {
                a(this.d, z2, svgPaint);
                return;
            } else if (z2) {
                this.d.b = false;
                return;
            } else {
                this.d.c = false;
                return;
            }
        }
        if (c2 instanceof SVGBase.F) {
            a(z2, c5109b, (SVGBase.F) c2);
        } else if (c2 instanceof SVGBase.H) {
            a(z2, c5109b, (SVGBase.H) c2);
        } else if (c2 instanceof SVGBase.z) {
            a(z2, (SVGBase.z) c2);
        }
    }

    private void a(boolean z2, SVGBase.C5109b c5109b, SVGBase.F f2) {
        float a2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        int i2;
        String str = f2.l;
        if (str != null) {
            a(f2, str);
        }
        Boolean bool = f2.i;
        int i3 = 0;
        boolean z3 = bool != null && bool.booleanValue();
        Paint paint = z2 ? this.d.g : this.d.h;
        if (z3) {
            SVGBase.Length length = f2.m;
            a2 = length != null ? length.b(this) : 0.0f;
            SVGBase.Length length2 = f2.n;
            f3 = length2 != null ? length2.c(this) : 0.0f;
            SVGBase.Length length3 = f2.o;
            if (length3 == null) {
                length3 = SVGBase.Length.d;
            }
            f4 = length3.b(this);
            SVGBase.Length length4 = f2.p;
            if (length4 != null) {
                f5 = a2;
                f7 = f3;
                f8 = f4;
                f6 = length4.c(this);
            }
            f5 = a2;
            f7 = f3;
            f8 = f4;
            f6 = 0.0f;
        } else {
            SVGBase.Length length5 = f2.m;
            a2 = length5 != null ? length5.a(this, 1.0f) : 0.0f;
            SVGBase.Length length6 = f2.n;
            float a3 = length6 != null ? length6.a(this, 1.0f) : 0.0f;
            SVGBase.Length length7 = f2.o;
            float a4 = length7 != null ? length7.a(this, 1.0f) : 1.0f;
            SVGBase.Length length8 = f2.p;
            if (length8 != null) {
                float a5 = length8.a(this, 1.0f);
                f5 = a2;
                f6 = a5;
                f7 = a3;
                f8 = a4;
            } else {
                f3 = a3;
                f4 = a4;
                f5 = a2;
                f7 = f3;
                f8 = f4;
                f6 = 0.0f;
            }
        }
        r();
        this.d = b(f2);
        Matrix matrix = new Matrix();
        if (!z3) {
            matrix.preTranslate(c5109b.a, c5109b.b);
            matrix.preScale(c5109b.c, c5109b.d);
        }
        Matrix matrix2 = f2.j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = f2.h.size();
        if (size == 0) {
            q();
            if (z2) {
                this.d.b = false;
                return;
            } else {
                this.d.c = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        Iterator<SVGBase.SvgObject> it = f2.h.iterator();
        float f9 = -1.0f;
        while (it.hasNext()) {
            SVGBase.A a6 = (SVGBase.A) it.next();
            Float f10 = a6.h;
            float floatValue = f10 != null ? f10.floatValue() : 0.0f;
            if (i3 != 0 && floatValue < f9) {
                fArr[i3] = f9;
            } else {
                fArr[i3] = floatValue;
                f9 = floatValue;
            }
            r();
            a(this.d, a6);
            Style style = this.d.a;
            SVGBase.Colour colour = (SVGBase.Colour) style.D;
            if (colour == null) {
                colour = SVGBase.Colour.b;
            }
            iArr[i3] = a(colour.a, style.E.floatValue());
            i3++;
            q();
        }
        if (f5 == f8 && f7 == f6) {
            i2 = 1;
        } else {
            i2 = 1;
            if (size != 1) {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                SVGBase.EnumC5116i enumC5116i = f2.k;
                if (enumC5116i != null) {
                    if (enumC5116i == SVGBase.EnumC5116i.reflect) {
                        tileMode = Shader.TileMode.MIRROR;
                    } else if (enumC5116i == SVGBase.EnumC5116i.repeat) {
                        tileMode = Shader.TileMode.REPEAT;
                    }
                }
                Shader.TileMode tileMode2 = tileMode;
                q();
                LinearGradient linearGradient = new LinearGradient(f5, f7, f8, f6, iArr, fArr, tileMode2);
                linearGradient.setLocalMatrix(matrix);
                paint.setShader(linearGradient);
                paint.setAlpha(a(this.d.a.d.floatValue()));
                return;
            }
        }
        q();
        paint.setColor(iArr[size - i2]);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(boolean z2, SVGBase.C5109b c5109b, SVGBase.H h2) {
        float f2;
        float f3;
        float f4;
        float a2;
        float f5;
        float f6;
        float f7;
        float f8;
        Matrix matrix;
        int size;
        int[] iArr;
        long[] jArr;
        long pack;
        String str = h2.l;
        if (str != null) {
            a(h2, str);
        }
        Boolean bool = h2.i;
        int i2 = 0;
        boolean z3 = bool != null && bool.booleanValue();
        Paint paint = z2 ? this.d.g : this.d.h;
        if (z3) {
            SVGBase.Length length = new SVGBase.Length(50.0f, SVGBase.S.percent);
            SVGBase.Length length2 = h2.m;
            f2 = length2 != null ? length2.b(this) : length.b(this);
            SVGBase.Length length3 = h2.n;
            f3 = length3 != null ? length3.c(this) : length.c(this);
            SVGBase.Length length4 = h2.o;
            f4 = length4 != null ? length4.a(this) : length.a(this);
            if (s) {
                SVGBase.Length length5 = h2.p;
                f5 = length5 != null ? length5.b(this) : f2;
                SVGBase.Length length6 = h2.q;
                f6 = length6 != null ? length6.c(this) : f3;
                SVGBase.Length length7 = h2.r;
                if (length7 != null) {
                    f7 = f6;
                    f8 = length7.a(this);
                    a2 = f5;
                    r();
                    this.d = b(h2);
                    Matrix matrix2 = new Matrix();
                    if (!z3) {
                        matrix2.preTranslate(c5109b.a, c5109b.b);
                        matrix2.preScale(c5109b.c, c5109b.d);
                    }
                    matrix = h2.j;
                    if (matrix != null) {
                        matrix2.preConcat(matrix);
                    }
                    size = h2.h.size();
                    if (size == 0) {
                        q();
                        if (z2) {
                            this.d.b = false;
                            return;
                        } else {
                            this.d.c = false;
                            return;
                        }
                    }
                    if (s) {
                        jArr = new long[size];
                        iArr = null;
                    } else {
                        iArr = new int[size];
                        jArr = null;
                    }
                    float[] fArr = new float[size];
                    Iterator<SVGBase.SvgObject> it = h2.h.iterator();
                    float f9 = -1.0f;
                    while (it.hasNext()) {
                        SVGBase.A a3 = (SVGBase.A) it.next();
                        Float f10 = a3.h;
                        float floatValue = f10 != null ? f10.floatValue() : 0.0f;
                        if (i2 != 0 && floatValue < f9) {
                            fArr[i2] = f9;
                        } else {
                            fArr[i2] = floatValue;
                            f9 = floatValue;
                        }
                        r();
                        a(this.d, a3);
                        Style style = this.d.a;
                        SVGBase.Colour colour = (SVGBase.Colour) style.D;
                        if (colour == null) {
                            colour = SVGBase.Colour.b;
                        }
                        if (s) {
                            pack = Color.pack(a(colour.a, style.E.floatValue()));
                            jArr[i2] = pack;
                        } else {
                            iArr[i2] = a(colour.a, style.E.floatValue());
                        }
                        i2++;
                        q();
                    }
                    if (f4 != 0.0f && size != 1) {
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        SVGBase.EnumC5116i enumC5116i = h2.k;
                        if (enumC5116i != null) {
                            if (enumC5116i == SVGBase.EnumC5116i.reflect) {
                                tileMode = Shader.TileMode.MIRROR;
                            } else if (enumC5116i == SVGBase.EnumC5116i.repeat) {
                                tileMode = Shader.TileMode.REPEAT;
                            }
                        }
                        q();
                        RadialGradient m2 = s ? SVGAndroidRenderer$$ExternalSyntheticApiModelOutline3.m(a2, f7, f8, f2, f3, f4, jArr, fArr, tileMode) : new RadialGradient(f2, f3, f4, iArr, fArr, tileMode);
                        m2.setLocalMatrix(matrix2);
                        paint.setShader(m2);
                        paint.setAlpha(a(this.d.a.d.floatValue()));
                        return;
                    }
                    q();
                    paint.setColor(iArr[size - 1]);
                    return;
                }
                a2 = f5;
                f7 = f6;
            }
            a2 = 0.0f;
            f7 = 0.0f;
        } else {
            SVGBase.Length length8 = h2.m;
            float a4 = length8 != null ? length8.a(this, 1.0f) : 0.5f;
            SVGBase.Length length9 = h2.n;
            float a5 = length9 != null ? length9.a(this, 1.0f) : 0.5f;
            SVGBase.Length length10 = h2.o;
            float a6 = length10 != null ? length10.a(this, 1.0f) : 0.5f;
            if (s) {
                SVGBase.Length length11 = h2.p;
                a2 = length11 != null ? length11.a(this, 1.0f) : 0.5f;
                SVGBase.Length length12 = h2.q;
                float a7 = length12 != null ? length12.a(this, 1.0f) : 0.5f;
                SVGBase.Length length13 = h2.r;
                if (length13 != null) {
                    float a8 = length13.a(this, 1.0f);
                    f7 = a7;
                    f8 = a8;
                    f3 = a5;
                    f2 = a4;
                    f4 = a6;
                    r();
                    this.d = b(h2);
                    Matrix matrix22 = new Matrix();
                    if (!z3) {
                    }
                    matrix = h2.j;
                    if (matrix != null) {
                    }
                    size = h2.h.size();
                    if (size == 0) {
                    }
                } else {
                    f3 = a5;
                    f5 = a2;
                    float f11 = a7;
                    f2 = a4;
                    f4 = a6;
                    f6 = f11;
                    a2 = f5;
                    f7 = f6;
                }
            } else {
                f2 = a4;
                f3 = a5;
                f4 = a6;
                a2 = 0.0f;
                f7 = 0.0f;
            }
        }
        f8 = 0.0f;
        r();
        this.d = b(h2);
        Matrix matrix222 = new Matrix();
        if (!z3) {
        }
        matrix = h2.j;
        if (matrix != null) {
        }
        size = h2.h.size();
        if (size == 0) {
        }
    }

    private void a(SVGBase.AbstractC5115h abstractC5115h, String str) {
        SVGBase.SvgObject c2 = abstractC5115h.a.c(str);
        if (c2 == null) {
            c("Gradient reference '%s' not found", str);
            return;
        }
        if (!(c2 instanceof SVGBase.AbstractC5115h)) {
            b("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (c2 == abstractC5115h) {
            b("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        SVGBase.AbstractC5115h abstractC5115h2 = (SVGBase.AbstractC5115h) c2;
        if (abstractC5115h.i == null) {
            abstractC5115h.i = abstractC5115h2.i;
        }
        if (abstractC5115h.j == null) {
            abstractC5115h.j = abstractC5115h2.j;
        }
        if (abstractC5115h.k == null) {
            abstractC5115h.k = abstractC5115h2.k;
        }
        if (abstractC5115h.h.isEmpty()) {
            abstractC5115h.h = abstractC5115h2.h;
        }
        try {
            if (abstractC5115h instanceof SVGBase.F) {
                a((SVGBase.F) abstractC5115h, (SVGBase.F) c2);
            } else {
                a((SVGBase.H) abstractC5115h, (SVGBase.H) c2);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = abstractC5115h2.l;
        if (str2 != null) {
            a(abstractC5115h, str2);
        }
    }

    private void a(SVGBase.F f2, SVGBase.F f3) {
        if (f2.m == null) {
            f2.m = f3.m;
        }
        if (f2.n == null) {
            f2.n = f3.n;
        }
        if (f2.o == null) {
            f2.o = f3.o;
        }
        if (f2.p == null) {
            f2.p = f3.p;
        }
    }

    private void a(SVGBase.H h2, SVGBase.H h3) {
        if (h2.m == null) {
            h2.m = h3.m;
        }
        if (h2.n == null) {
            h2.n = h3.n;
        }
        if (h2.o == null) {
            h2.o = h3.o;
        }
        if (h2.p == null) {
            h2.p = h3.p;
        }
        if (h2.q == null) {
            h2.q = h3.q;
        }
        if (h2.r == null) {
            h2.r = h3.r;
        }
    }

    private void a(boolean z2, SVGBase.z zVar) {
        if (z2) {
            if (a(zVar.e, 2147483648L)) {
                RendererState rendererState = this.d;
                Style style = rendererState.a;
                SVGBase.SvgPaint svgPaint = zVar.e.I;
                style.b = svgPaint;
                rendererState.b = svgPaint != null;
            }
            if (a(zVar.e, 4294967296L)) {
                this.d.a.d = zVar.e.J;
            }
            if (a(zVar.e, 6442450944L)) {
                RendererState rendererState2 = this.d;
                a(rendererState2, z2, rendererState2.a.b);
                return;
            }
            return;
        }
        if (a(zVar.e, 2147483648L)) {
            RendererState rendererState3 = this.d;
            Style style2 = rendererState3.a;
            SVGBase.SvgPaint svgPaint2 = zVar.e.I;
            style2.e = svgPaint2;
            rendererState3.c = svgPaint2 != null;
        }
        if (a(zVar.e, 4294967296L)) {
            this.d.a.f = zVar.e.J;
        }
        if (a(zVar.e, 6442450944L)) {
            RendererState rendererState4 = this.d;
            a(rendererState4, z2, rendererState4.a.e);
        }
    }

    private void a(SVGBase.D d2) {
        b(d2, d2.h);
    }

    @TargetApi(19)
    private Path a(SVGBase.D d2, SVGBase.C5109b c5109b) {
        Path a2;
        SVGBase.SvgObject c2 = d2.a.c(this.d.a.F);
        if (c2 == null) {
            b("ClipPath reference '%s' not found", this.d.a.F);
            return null;
        }
        if (c2.a() != "clipPath") {
            return null;
        }
        SVGBase.C5111d c5111d = (SVGBase.C5111d) c2;
        this.e.push(this.d);
        this.d = b((SVGBase.SvgObject) c5111d);
        Boolean bool = c5111d.p;
        boolean z2 = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z2) {
            matrix.preTranslate(c5109b.a, c5109b.b);
            matrix.preScale(c5109b.c, c5109b.d);
        }
        Matrix matrix2 = c5111d.o;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (SVGBase.SvgObject svgObject : c5111d.i) {
            if ((svgObject instanceof SVGBase.D) && (a2 = a((SVGBase.D) svgObject, true)) != null) {
                path.op(a2, Path.Op.UNION);
            }
        }
        if (this.d.a.F != null) {
            if (c5111d.h == null) {
                c5111d.h = a(path);
            }
            Path a3 = a(c5111d, c5111d.h);
            if (a3 != null) {
                path.op(a3, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.d = this.e.pop();
        return path;
    }

    @TargetApi(19)
    private Path a(SVGBase.D d2, boolean z2) {
        Path a2;
        Path a3;
        this.e.push(this.d);
        RendererState rendererState = new RendererState(this.d);
        this.d = rendererState;
        a(rendererState, d2);
        if (c() && t()) {
            if (d2 instanceof SVGBase.T) {
                if (!z2) {
                    b("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
                }
                SVGBase.T t2 = (SVGBase.T) d2;
                SVGBase.SvgObject c2 = d2.a.c(t2.p);
                if (c2 == null) {
                    b("Use reference '%s' not found", t2.p);
                    this.d = this.e.pop();
                    return null;
                }
                if (!(c2 instanceof SVGBase.D)) {
                    this.d = this.e.pop();
                    return null;
                }
                a2 = a((SVGBase.D) c2, false);
                if (a2 == null) {
                    return null;
                }
                if (t2.h == null) {
                    t2.h = a(a2);
                }
                Matrix matrix = t2.o;
                if (matrix != null) {
                    a2.transform(matrix);
                }
            } else if (d2 instanceof SVGBase.AbstractC5117j) {
                SVGBase.AbstractC5117j abstractC5117j = (SVGBase.AbstractC5117j) d2;
                if (d2 instanceof SVGBase.C5126s) {
                    a2 = new PathConverter(((SVGBase.C5126s) d2).o).a();
                    if (d2.h == null) {
                        d2.h = a(a2);
                    }
                } else {
                    a2 = d2 instanceof SVGBase.y ? a((SVGBase.y) d2) : d2 instanceof SVGBase.C5110c ? a((SVGBase.C5110c) d2) : d2 instanceof SVGBase.C5114g ? a((SVGBase.C5114g) d2) : d2 instanceof SVGBase.w ? b((SVGBase.w) d2) : null;
                }
                if (a2 == null) {
                    return null;
                }
                if (abstractC5117j.h == null) {
                    abstractC5117j.h = a(a2);
                }
                Matrix matrix2 = abstractC5117j.n;
                if (matrix2 != null) {
                    a2.transform(matrix2);
                }
                a2.setFillType(e());
            } else if (d2 instanceof SVGBase.N) {
                SVGBase.N n2 = (SVGBase.N) d2;
                a2 = a(n2);
                Matrix matrix3 = n2.s;
                if (matrix3 != null) {
                    a2.transform(matrix3);
                }
                a2.setFillType(e());
            } else {
                b("Invalid %s element found in clipPath definition", d2.a());
                return null;
            }
            if (this.d.a.F != null && (a3 = a(d2, d2.h)) != null) {
                a2.op(a3, Path.Op.INTERSECT);
            }
            this.d = this.e.pop();
            return a2;
        }
        this.d = this.e.pop();
        return null;
    }

    private void a(SVGBase.SvgObject svgObject, boolean z2, Path path, Matrix matrix) {
        if (c()) {
            b();
            if (svgObject instanceof SVGBase.T) {
                if (z2) {
                    a((SVGBase.T) svgObject, path, matrix);
                } else {
                    b("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
                }
            } else if (svgObject instanceof SVGBase.C5126s) {
                a((SVGBase.C5126s) svgObject, path, matrix);
            } else if (svgObject instanceof SVGBase.N) {
                a((SVGBase.N) svgObject, path, matrix);
            } else if (svgObject instanceof SVGBase.AbstractC5117j) {
                a((SVGBase.AbstractC5117j) svgObject, path, matrix);
            } else {
                b("Invalid %s element found in clipPath definition", svgObject.toString());
            }
            a();
        }
    }

    private void a() {
        this.a.restore();
        this.d = this.e.pop();
    }

    private void a(SVGBase.C5126s c5126s, Path path, Matrix matrix) {
        a(this.d, c5126s);
        if (c() && t()) {
            Matrix matrix2 = c5126s.n;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            Path a2 = new PathConverter(c5126s.o).a();
            if (c5126s.h == null) {
                c5126s.h = a(a2);
            }
            a((SVGBase.D) c5126s);
            path.setFillType(e());
            path.addPath(a2, matrix);
        }
    }

    private void a(SVGBase.AbstractC5117j abstractC5117j, Path path, Matrix matrix) {
        Path b2;
        a(this.d, abstractC5117j);
        if (c() && t()) {
            Matrix matrix2 = abstractC5117j.n;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            if (abstractC5117j instanceof SVGBase.y) {
                b2 = a((SVGBase.y) abstractC5117j);
            } else if (abstractC5117j instanceof SVGBase.C5110c) {
                b2 = a((SVGBase.C5110c) abstractC5117j);
            } else if (abstractC5117j instanceof SVGBase.C5114g) {
                b2 = a((SVGBase.C5114g) abstractC5117j);
            } else if (!(abstractC5117j instanceof SVGBase.w)) {
                return;
            } else {
                b2 = b((SVGBase.w) abstractC5117j);
            }
            if (b2 == null) {
                return;
            }
            a((SVGBase.D) abstractC5117j);
            path.setFillType(e());
            path.addPath(b2, matrix);
        }
    }

    private void a(SVGBase.T t2, Path path, Matrix matrix) {
        a(this.d, t2);
        if (c() && t()) {
            Matrix matrix2 = t2.o;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            SVGBase.SvgObject c2 = t2.a.c(t2.p);
            if (c2 == null) {
                b("Use reference '%s' not found", t2.p);
            } else {
                a((SVGBase.D) t2);
                a(c2, false, path, matrix);
            }
        }
    }

    private void a(SVGBase.N n2, Path path, Matrix matrix) {
        a(this.d, n2);
        if (c()) {
            Matrix matrix2 = n2.s;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            List<SVGBase.Length> list = n2.o;
            float f2 = 0.0f;
            float b2 = (list == null || list.size() == 0) ? 0.0f : n2.o.get(0).b(this);
            List<SVGBase.Length> list2 = n2.p;
            float c2 = (list2 == null || list2.size() == 0) ? 0.0f : n2.p.get(0).c(this);
            List<SVGBase.Length> list3 = n2.q;
            float b3 = (list3 == null || list3.size() == 0) ? 0.0f : n2.q.get(0).b(this);
            List<SVGBase.Length> list4 = n2.r;
            if (list4 != null && list4.size() != 0) {
                f2 = n2.r.get(0).c(this);
            }
            if (this.d.a.v != Style.TextAnchor.Start) {
                float a2 = a((SVGBase.TextContainer) n2);
                if (this.d.a.v == Style.TextAnchor.Middle) {
                    a2 /= 2.0f;
                }
                b2 -= a2;
            }
            if (n2.h == null) {
                g gVar = new g(b2, c2);
                a((SVGBase.TextContainer) n2, (h) gVar);
                RectF rectF = gVar.c;
                n2.h = new SVGBase.C5109b(rectF.left, rectF.top, rectF.width(), gVar.c.height());
            }
            a((SVGBase.D) n2);
            Path path2 = new Path();
            a((SVGBase.TextContainer) n2, new f(b2 + b3, c2 + f2, path2));
            path.setFillType(e());
            path.addPath(path2, matrix);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Path a(SVGBase.y yVar) {
        float b2;
        float c2;
        float min;
        float b3;
        float c3;
        float f2;
        float f3;
        Path path;
        Path path2;
        SVGBase.Length length = yVar.s;
        if (length == null && yVar.t == null) {
            c2 = 0.0f;
        } else if (length == null) {
            c2 = yVar.t.c(this);
        } else if (yVar.t == null) {
            c2 = length.b(this);
        } else {
            b2 = length.b(this);
            c2 = yVar.t.c(this);
            min = Math.min(b2, yVar.q.b(this) / 2.0f);
            float min2 = Math.min(c2, yVar.r.c(this) / 2.0f);
            SVGBase.Length length2 = yVar.o;
            b3 = length2 == null ? length2.b(this) : 0.0f;
            SVGBase.Length length3 = yVar.p;
            c3 = length3 == null ? length3.c(this) : 0.0f;
            float b4 = yVar.q.b(this);
            float c4 = yVar.r.c(this);
            if (yVar.h == null) {
                yVar.h = new SVGBase.C5109b(b3, c3, b4, c4);
            }
            f2 = b3 + b4;
            f3 = c3 + c4;
            path = new Path();
            if (min == 0.0f && min2 != 0.0f) {
                float f4 = min * 0.5522848f;
                float f5 = 0.5522848f * min2;
                float f6 = c3 + min2;
                path.moveTo(b3, f6);
                float f7 = f6 - f5;
                float f8 = b3 + min;
                float f9 = f8 - f4;
                path.cubicTo(b3, f7, f9, c3, f8, c3);
                float f10 = f2 - min;
                path.lineTo(f10, c3);
                float f11 = f10 + f4;
                path.cubicTo(f11, c3, f2, f7, f2, f6);
                float f12 = f3 - min2;
                path.lineTo(f2, f12);
                float f13 = f12 + f5;
                path2 = path;
                path.cubicTo(f2, f13, f11, f3, f10, f3);
                path2.lineTo(f8, f3);
                path2.cubicTo(f9, f3, b3, f13, b3, f12);
                path2.lineTo(b3, f6);
            } else {
                path2 = path;
                path2.moveTo(b3, c3);
                path2.lineTo(f2, c3);
                path2.lineTo(f2, f3);
                path2.lineTo(b3, f3);
                path2.lineTo(b3, c3);
            }
            path2.close();
            return path2;
        }
        b2 = c2;
        min = Math.min(b2, yVar.q.b(this) / 2.0f);
        float min22 = Math.min(c2, yVar.r.c(this) / 2.0f);
        SVGBase.Length length22 = yVar.o;
        if (length22 == null) {
        }
        SVGBase.Length length32 = yVar.p;
        if (length32 == null) {
        }
        float b42 = yVar.q.b(this);
        float c42 = yVar.r.c(this);
        if (yVar.h == null) {
        }
        f2 = b3 + b42;
        f3 = c3 + c42;
        path = new Path();
        if (min == 0.0f) {
        }
        path2 = path;
        path2.moveTo(b3, c3);
        path2.lineTo(f2, c3);
        path2.lineTo(f2, f3);
        path2.lineTo(b3, f3);
        path2.lineTo(b3, c3);
        path2.close();
        return path2;
    }

    private Path a(SVGBase.C5110c c5110c) {
        SVGBase.Length length = c5110c.o;
        float b2 = length != null ? length.b(this) : 0.0f;
        SVGBase.Length length2 = c5110c.p;
        float c2 = length2 != null ? length2.c(this) : 0.0f;
        float a2 = c5110c.q.a(this);
        float f2 = b2 - a2;
        float f3 = c2 - a2;
        float f4 = b2 + a2;
        float f5 = c2 + a2;
        if (c5110c.h == null) {
            float f6 = 2.0f * a2;
            c5110c.h = new SVGBase.C5109b(f2, f3, f6, f6);
        }
        float f7 = 0.5522848f * a2;
        Path path = new Path();
        path.moveTo(b2, f3);
        float f8 = b2 + f7;
        float f9 = c2 - f7;
        path.cubicTo(f8, f3, f4, f9, f4, c2);
        float f10 = c2 + f7;
        path.cubicTo(f4, f10, f8, f5, b2, f5);
        float f11 = b2 - f7;
        path.cubicTo(f11, f5, f2, f10, f2, c2);
        path.cubicTo(f2, f9, f11, f3, b2, f3);
        path.close();
        return path;
    }

    private Path a(SVGBase.C5114g c5114g) {
        SVGBase.Length length = c5114g.o;
        float b2 = length != null ? length.b(this) : 0.0f;
        SVGBase.Length length2 = c5114g.p;
        float c2 = length2 != null ? length2.c(this) : 0.0f;
        float b3 = c5114g.q.b(this);
        float c3 = c5114g.r.c(this);
        float f2 = b2 - b3;
        float f3 = c2 - c3;
        float f4 = b2 + b3;
        float f5 = c2 + c3;
        if (c5114g.h == null) {
            c5114g.h = new SVGBase.C5109b(f2, f3, b3 * 2.0f, 2.0f * c3);
        }
        float f6 = b3 * 0.5522848f;
        float f7 = 0.5522848f * c3;
        Path path = new Path();
        path.moveTo(b2, f3);
        float f8 = b2 + f6;
        float f9 = c2 - f7;
        path.cubicTo(f8, f3, f4, f9, f4, c2);
        float f10 = f7 + c2;
        path.cubicTo(f4, f10, f8, f5, b2, f5);
        float f11 = b2 - f6;
        path.cubicTo(f11, f5, f2, f10, f2, c2);
        path.cubicTo(f2, f9, f11, f3, b2, f3);
        path.close();
        return path;
    }

    private Path a(SVGBase.N n2) {
        List<SVGBase.Length> list = n2.o;
        float f2 = 0.0f;
        float b2 = (list == null || list.size() == 0) ? 0.0f : n2.o.get(0).b(this);
        List<SVGBase.Length> list2 = n2.p;
        float c2 = (list2 == null || list2.size() == 0) ? 0.0f : n2.p.get(0).c(this);
        List<SVGBase.Length> list3 = n2.q;
        float b3 = (list3 == null || list3.size() == 0) ? 0.0f : n2.q.get(0).b(this);
        List<SVGBase.Length> list4 = n2.r;
        if (list4 != null && list4.size() != 0) {
            f2 = n2.r.get(0).c(this);
        }
        if (this.d.a.v != Style.TextAnchor.Start) {
            float a2 = a((SVGBase.TextContainer) n2);
            if (this.d.a.v == Style.TextAnchor.Middle) {
                a2 /= 2.0f;
            }
            b2 -= a2;
        }
        if (n2.h == null) {
            g gVar = new g(b2, c2);
            a((SVGBase.TextContainer) n2, (h) gVar);
            RectF rectF = gVar.c;
            n2.h = new SVGBase.C5109b(rectF.left, rectF.top, rectF.width(), gVar.c.height());
        }
        Path path = new Path();
        a((SVGBase.TextContainer) n2, new f(b2 + b3, c2 + f2, path));
        return path;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0202 A[LOOP:3: B:67:0x01fc->B:69:0x0202, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0222  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(SVGBase.D d2, Path path, SVGBase.v vVar) {
        float f2;
        float f3;
        float f4;
        float f5;
        PreserveAspectRatio preserveAspectRatio;
        boolean z2;
        boolean z3;
        float floor;
        float b2;
        boolean b3;
        PreserveAspectRatio preserveAspectRatio2;
        Iterator<SVGBase.SvgObject> it;
        Boolean bool = vVar.q;
        boolean z4 = bool != null && bool.booleanValue();
        float floatValue = this.d.a.d.floatValue();
        String str = vVar.x;
        if (str != null) {
            a(vVar, str);
        }
        if (z4) {
            SVGBase.Length length = vVar.t;
            f2 = length != null ? length.b(this) : 0.0f;
            SVGBase.Length length2 = vVar.u;
            f4 = length2 != null ? length2.c(this) : 0.0f;
            SVGBase.Length length3 = vVar.v;
            f5 = length3 != null ? length3.b(this) : 0.0f;
            SVGBase.Length length4 = vVar.w;
            f3 = length4 != null ? length4.c(this) : 0.0f;
        } else {
            SVGBase.Length length5 = vVar.t;
            float a2 = length5 != null ? length5.a(this, 1.0f) : 0.0f;
            SVGBase.Length length6 = vVar.u;
            float a3 = length6 != null ? length6.a(this, 1.0f) : 0.0f;
            SVGBase.Length length7 = vVar.v;
            float a4 = length7 != null ? length7.a(this, 1.0f) : 0.0f;
            SVGBase.Length length8 = vVar.w;
            float a5 = length8 != null ? length8.a(this, 1.0f) : 0.0f;
            SVGBase.C5109b c5109b = d2.h;
            float f6 = c5109b.a;
            float f7 = c5109b.c;
            f2 = (a2 * f7) + f6;
            float f8 = c5109b.b;
            float f9 = c5109b.d;
            float f10 = a4 * f7;
            f3 = a5 * f9;
            f4 = (a3 * f9) + f8;
            f5 = f10;
        }
        if (f5 == 0.0f || f3 == 0.0f) {
            return;
        }
        PreserveAspectRatio preserveAspectRatio3 = vVar.o;
        if (preserveAspectRatio3 == null) {
            preserveAspectRatio3 = PreserveAspectRatio.LETTERBOX;
        }
        r();
        this.a.clipPath(path);
        RendererState rendererState = new RendererState();
        a(rendererState, Style.a());
        rendererState.a.w = Boolean.FALSE;
        this.d = a(vVar, rendererState);
        SVGBase.C5109b c5109b2 = d2.h;
        Matrix matrix = vVar.s;
        if (matrix != null) {
            this.a.concat(matrix);
            Matrix matrix2 = new Matrix();
            if (vVar.s.invert(matrix2)) {
                SVGBase.C5109b c5109b3 = d2.h;
                float f11 = c5109b3.a;
                float f12 = c5109b3.b;
                float a6 = c5109b3.a();
                SVGBase.C5109b c5109b4 = d2.h;
                float f13 = c5109b4.b;
                float a7 = c5109b4.a();
                float b4 = d2.h.b();
                preserveAspectRatio = preserveAspectRatio3;
                SVGBase.C5109b c5109b5 = d2.h;
                float[] fArr = {f11, f12, a6, f13, a7, b4, c5109b5.a, c5109b5.b()};
                matrix2.mapPoints(fArr);
                z3 = false;
                float f14 = fArr[0];
                float f15 = fArr[1];
                RectF rectF = new RectF(f14, f15, f14, f15);
                for (int i2 = 2; i2 <= 6; i2 += 2) {
                    float f16 = fArr[i2];
                    if (f16 < rectF.left) {
                        rectF.left = f16;
                    }
                    if (f16 > rectF.right) {
                        rectF.right = f16;
                    }
                    float f17 = fArr[i2 + 1];
                    if (f17 < rectF.top) {
                        rectF.top = f17;
                    }
                    if (f17 > rectF.bottom) {
                        rectF.bottom = f17;
                    }
                }
                z2 = true;
                float f18 = rectF.left;
                float f19 = rectF.top;
                c5109b2 = new SVGBase.C5109b(f18, f19, rectF.right - f18, rectF.bottom - f19);
                float floor2 = f2 + (((float) Math.floor((c5109b2.a - f2) / f5)) * f5);
                floor = f4 + (((float) Math.floor((c5109b2.b - f4) / f3)) * f3);
                float a8 = c5109b2.a();
                b2 = c5109b2.b();
                SVGBase.C5109b c5109b6 = new SVGBase.C5109b(0.0f, 0.0f, f5, f3);
                b3 = b(floatValue);
                while (floor < b2) {
                    float f20 = floor2;
                    while (f20 < a8) {
                        c5109b6.a = f20;
                        c5109b6.b = floor;
                        r();
                        if (!this.d.a.w.booleanValue()) {
                            b(c5109b6.a, c5109b6.b, c5109b6.c, c5109b6.d);
                        }
                        SVGBase.C5109b c5109b7 = vVar.p;
                        if (c5109b7 != null) {
                            preserveAspectRatio2 = preserveAspectRatio;
                            this.a.concat(a(c5109b6, c5109b7, preserveAspectRatio2));
                        } else {
                            preserveAspectRatio2 = preserveAspectRatio;
                            Boolean bool2 = vVar.r;
                            boolean z5 = (bool2 == null || bool2.booleanValue()) ? z2 : z3;
                            this.a.translate(f20, floor);
                            if (!z5) {
                                Canvas canvas = this.a;
                                SVGBase.C5109b c5109b8 = d2.h;
                                canvas.scale(c5109b8.c, c5109b8.d);
                                it = vVar.i.iterator();
                                while (it.hasNext()) {
                                    c(it.next());
                                }
                                q();
                                f20 += f5;
                                preserveAspectRatio = preserveAspectRatio2;
                                z2 = true;
                            }
                        }
                        it = vVar.i.iterator();
                        while (it.hasNext()) {
                        }
                        q();
                        f20 += f5;
                        preserveAspectRatio = preserveAspectRatio2;
                        z2 = true;
                    }
                    floor += f3;
                    z2 = true;
                }
                if (b3) {
                    c((SVGBase.D) vVar);
                }
                q();
            }
        }
        preserveAspectRatio = preserveAspectRatio3;
        z2 = true;
        z3 = false;
        float floor22 = f2 + (((float) Math.floor((c5109b2.a - f2) / f5)) * f5);
        floor = f4 + (((float) Math.floor((c5109b2.b - f4) / f3)) * f3);
        float a82 = c5109b2.a();
        b2 = c5109b2.b();
        SVGBase.C5109b c5109b62 = new SVGBase.C5109b(0.0f, 0.0f, f5, f3);
        b3 = b(floatValue);
        while (floor < b2) {
        }
        if (b3) {
        }
        q();
    }

    private void a(SVGBase.v vVar, String str) {
        SVGBase.SvgObject c2 = vVar.a.c(str);
        if (c2 == null) {
            c("Pattern reference '%s' not found", str);
            return;
        }
        if (!(c2 instanceof SVGBase.v)) {
            b("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (c2 == vVar) {
            b("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        SVGBase.v vVar2 = (SVGBase.v) c2;
        if (vVar.q == null) {
            vVar.q = vVar2.q;
        }
        if (vVar.r == null) {
            vVar.r = vVar2.r;
        }
        if (vVar.s == null) {
            vVar.s = vVar2.s;
        }
        if (vVar.t == null) {
            vVar.t = vVar2.t;
        }
        if (vVar.u == null) {
            vVar.u = vVar2.u;
        }
        if (vVar.v == null) {
            vVar.v = vVar2.v;
        }
        if (vVar.w == null) {
            vVar.w = vVar2.w;
        }
        if (vVar.i.isEmpty()) {
            vVar.i = vVar2.i;
        }
        if (vVar.p == null) {
            vVar.p = vVar2.p;
        }
        if (vVar.o == null) {
            vVar.o = vVar2.o;
        }
        String str2 = vVar2.x;
        if (str2 != null) {
            a(vVar, str2);
        }
    }

    private void a(SVGBase.C5123p c5123p, SVGBase.D d2, SVGBase.C5109b c5109b) {
        float f2;
        float f3;
        a("Mask render", new Object[0]);
        Boolean bool = c5123p.o;
        if (bool != null && bool.booleanValue()) {
            SVGBase.Length length = c5123p.s;
            f2 = length != null ? length.b(this) : c5109b.c;
            SVGBase.Length length2 = c5123p.t;
            f3 = length2 != null ? length2.c(this) : c5109b.d;
        } else {
            SVGBase.Length length3 = c5123p.s;
            float a2 = length3 != null ? length3.a(this, 1.0f) : 1.2f;
            SVGBase.Length length4 = c5123p.t;
            float a3 = length4 != null ? length4.a(this, 1.0f) : 1.2f;
            f2 = a2 * c5109b.c;
            f3 = a3 * c5109b.d;
        }
        if (f2 == 0.0f || f3 == 0.0f) {
            return;
        }
        r();
        RendererState b2 = b((SVGBase.SvgObject) c5123p);
        this.d = b2;
        b2.a.m = Float.valueOf(1.0f);
        boolean m2 = m();
        this.a.save();
        Boolean bool2 = c5123p.p;
        if (bool2 != null && !bool2.booleanValue()) {
            this.a.translate(c5109b.a, c5109b.b);
            this.a.scale(c5109b.c, c5109b.d);
        }
        a((SVGBase.SvgContainer) c5123p, false);
        this.a.restore();
        if (m2) {
            d(d2, c5109b);
        }
        q();
    }
}
