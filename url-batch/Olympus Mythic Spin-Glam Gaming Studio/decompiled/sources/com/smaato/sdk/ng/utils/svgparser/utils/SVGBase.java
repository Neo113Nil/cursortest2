package com.smaato.sdk.ng.utils.svgparser.utils;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import com.ironsource.X3;
import com.smaato.sdk.ng.utils.svgparser.PreserveAspectRatio;
import com.smaato.sdk.ng.utils.svgparser.RenderOptions;
import com.smaato.sdk.ng.utils.svgparser.SVGExternalFileResolver;
import com.smaato.sdk.ng.utils.svgparser.SVGParseException;
import com.smaato.sdk.ng.utils.svgparser.utils.CSSParser;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes9.dex */
public class SVGBase {
    private static SVGExternalFileResolver i = null;
    private static boolean j = true;
    private final SVGExternalFileResolver a;
    private final boolean b;
    private Svg c = null;
    private String d = "";
    private String e = "";
    private float f = 96.0f;
    private final CSSParser.Ruleset g = new CSSParser.Ruleset();
    private final Map<String, E> h = new HashMap();

    static class A extends E implements SvgContainer {
        Float h;

        A() {
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.SvgObject
        String a() {
            return "stop";
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.SvgContainer
        public void addChild(SvgObject svgObject) {
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.SvgContainer
        public List<SvgObject> getChildren() {
            return Collections.EMPTY_LIST;
        }
    }

    interface B {
        String getRequiredExtensions();

        Set<String> getRequiredFeatures();

        Set<String> getRequiredFonts();

        Set<String> getRequiredFormats();

        Set<String> getSystemLanguage();

        void setRequiredExtensions(String str);

        void setRequiredFeatures(Set<String> set);

        void setRequiredFonts(Set<String> set);

        void setRequiredFormats(Set<String> set);

        void setSystemLanguage(Set<String> set);
    }

    static abstract class C extends D implements B {
        Set<String> i = null;
        String j = null;
        Set<String> k = null;
        Set<String> l = null;
        Set<String> m = null;

        C() {
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.B
        public String getRequiredExtensions() {
            return this.j;
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.B
        public Set<String> getRequiredFeatures() {
            return this.i;
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.B
        public Set<String> getRequiredFonts() {
            return this.m;
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.B
        public Set<String> getRequiredFormats() {
            return this.l;
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.B
        public Set<String> getSystemLanguage() {
            return this.k;
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.B
        public void setRequiredExtensions(String str) {
            this.j = str;
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.B
        public void setRequiredFeatures(Set<String> set) {
            this.i = set;
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.B
        public void setRequiredFonts(Set<String> set) {
            this.m = set;
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.B
        public void setRequiredFormats(Set<String> set) {
            this.l = set;
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.B
        public void setSystemLanguage(Set<String> set) {
            this.k = set;
        }
    }

    public static class CSSClipRect {
        final Length a;
        final Length b;
        final Length c;
        final Length d;

        CSSClipRect(Length length, Length length2, Length length3, Length length4) {
            this.a = length;
            this.b = length2;
            this.c = length3;
            this.d = length4;
        }
    }

    public static class Colour extends SvgPaint {
        static final Colour b = new Colour(-16777216);
        static final Colour c = new Colour(0);
        final int a;

        Colour(int i) {
            this.a = i;
        }

        public String toString() {
            return String.format("#%08x", Integer.valueOf(this.a));
        }
    }

    static abstract class D extends E {
        C5109b h = null;

        D() {
        }
    }

    static abstract class E extends SvgObject {
        String c = null;
        Boolean d = null;
        Style e = null;
        Style f = null;
        List<String> g = null;

        E() {
        }

        public String toString() {
            return a();
        }
    }

    static class F extends AbstractC5115h {
        Length m;
        Length n;
        Length o;
        Length p;

        F() {
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.SvgObject
        String a() {
            return "linearGradient";
        }
    }

    static abstract class G extends SvgConditionalContainer {
        PreserveAspectRatio o = null;

        G() {
        }
    }

    static class H extends AbstractC5115h {
        Length m;
        Length n;
        Length o;
        Length p;
        Length q;
        Length r;

        H() {
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.SvgObject
        String a() {
            return "radialGradient";
        }
    }

    static abstract class I extends G {
        C5109b p;

        I() {
        }
    }

    static class J extends C5118k {
        J() {
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.C5118k, com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.SvgObject
        String a() {
            return "switch";
        }
    }

    static class K extends I implements InterfaceC5124q {
        K() {
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.SvgObject
        String a() {
            return "symbol";
        }
    }

    static class L extends TextContainer implements O {
        String o;
        private R p;

        L() {
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.SvgObject
        String a() {
            return "tref";
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.O
        public R getTextRoot() {
            return this.p;
        }

        public void setTextRoot(R r) {
            this.p = r;
        }
    }

    public static class Length implements Cloneable {
        static final Length c = new Length(0.0f);
        static final Length d = new Length(100.0f, S.percent);
        final float a;
        final S b;

        public Length(float f, S s) {
            this.a = f;
            this.b = s;
        }

        float a() {
            return this.a;
        }

        float b(SVGAndroidRenderer sVGAndroidRenderer) {
            switch (this.b.ordinal()) {
                case 8:
                    C5109b i = sVGAndroidRenderer.i();
                    if (i != null) {
                        break;
                    } else {
                        break;
                    }
            }
            return this.a;
        }

        float c(SVGAndroidRenderer sVGAndroidRenderer) {
            if (this.b != S.percent) {
                return b(sVGAndroidRenderer);
            }
            C5109b i = sVGAndroidRenderer.i();
            return i == null ? this.a : (this.a * i.d) / 100.0f;
        }

        public String toString() {
            return String.valueOf(this.a) + this.b;
        }

        float a(SVGAndroidRenderer sVGAndroidRenderer) {
            if (this.b != S.percent) {
                return b(sVGAndroidRenderer);
            }
            C5109b i = sVGAndroidRenderer.i();
            if (i == null) {
                return this.a;
            }
            float f = i.c;
            if (f == i.d) {
                return (this.a * f) / 100.0f;
            }
            return (this.a * ((float) (Math.sqrt((f * f) + (r6 * r6)) / 1.414213562373095d))) / 100.0f;
        }

        public Length(float f) {
            this.a = f;
            this.b = S.px;
        }

        boolean c() {
            return this.a == 0.0f;
        }

        float a(SVGAndroidRenderer sVGAndroidRenderer, float f) {
            if (this.b == S.percent) {
                return (this.a * f) / 100.0f;
            }
            return b(sVGAndroidRenderer);
        }

        float a(float f) {
            int ordinal = this.b.ordinal();
            if (ordinal == 3) {
                return this.a * f;
            }
            if (ordinal == 4) {
                return (this.a * f) / 2.54f;
            }
            if (ordinal == 5) {
                return (this.a * f) / 25.4f;
            }
            if (ordinal == 6) {
                return (this.a * f) / 72.0f;
            }
            if (ordinal != 7) {
                return this.a;
            }
            return (this.a * f) / 6.0f;
        }

        boolean b() {
            return this.a < 0.0f;
        }
    }

    static class M extends Q implements O {
        private R s;

        M() {
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.SvgObject
        String a() {
            return "tspan";
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.O
        public R getTextRoot() {
            return this.s;
        }

        public void setTextRoot(R r) {
            this.s = r;
        }
    }

    static class N extends Q implements R, InterfaceC5119l {
        Matrix s;

        N() {
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.InterfaceC5119l
        public void a(Matrix matrix) {
            this.s = matrix;
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.SvgObject
        String a() {
            return "text";
        }
    }

    interface O {
        R getTextRoot();
    }

    static class P extends TextContainer implements O {
        String o;
        Length p;
        private R q;

        P() {
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.SvgObject
        String a() {
            return "textPath";
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.O
        public R getTextRoot() {
            return this.q;
        }

        public void setTextRoot(R r) {
            this.q = r;
        }
    }

    static abstract class Q extends TextContainer {
        List<Length> o;
        List<Length> p;
        List<Length> q;
        List<Length> r;

        Q() {
        }
    }

    interface R {
    }

    enum S {
        px,
        em,
        ex,
        in,
        cm,
        mm,
        pt,
        pc,
        percent
    }

    public static class Svg extends I {
        Length q;
        Length r;
        Length s;
        Length t;
        public String version;

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.SvgObject
        String a() {
            return "svg";
        }
    }

    public static abstract class SvgConditionalContainer extends D implements SvgContainer, B {
        List<SvgObject> i = new ArrayList();
        Set<String> j = null;
        String k = null;
        Set<String> l = null;
        Set<String> m = null;
        Set<String> n = null;

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.SvgContainer
        public void addChild(SvgObject svgObject) throws SVGParseException {
            this.i.add(svgObject);
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.SvgContainer
        public List<SvgObject> getChildren() {
            return this.i;
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.B
        public String getRequiredExtensions() {
            return this.k;
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.B
        public Set<String> getRequiredFeatures() {
            return this.j;
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.B
        public Set<String> getRequiredFonts() {
            return this.n;
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.B
        public Set<String> getRequiredFormats() {
            return this.m;
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.B
        public Set<String> getSystemLanguage() {
            return null;
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.B
        public void setRequiredExtensions(String str) {
            this.k = str;
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.B
        public void setRequiredFeatures(Set<String> set) {
            this.j = set;
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.B
        public void setRequiredFonts(Set<String> set) {
            this.n = set;
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.B
        public void setRequiredFormats(Set<String> set) {
            this.m = set;
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.B
        public void setSystemLanguage(Set<String> set) {
            this.l = set;
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.E
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }
    }

    public interface SvgContainer {
        void addChild(SvgObject svgObject) throws SVGParseException;

        List<SvgObject> getChildren();
    }

    public static class SvgObject {
        SVGBase a;
        SvgContainer b;

        String a() {
            return "";
        }
    }

    public static abstract class SvgPaint implements Cloneable {
    }

    static class T extends C5118k {
        String p;
        Length q;
        Length r;
        Length s;
        Length t;

        T() {
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.C5118k, com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.SvgObject
        String a() {
            return "use";
        }
    }

    public static abstract class TextContainer extends SvgConditionalContainer {
        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.SvgConditionalContainer, com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.SvgContainer
        public void addChild(SvgObject svgObject) throws SVGParseException {
            if (svgObject instanceof O) {
                this.i.add(svgObject);
                return;
            }
            throw new SVGParseException("Text content elements cannot contain " + svgObject + " elements.");
        }
    }

    public static class TextSequence extends SvgObject implements O {
        String c;
        private R d;

        public TextSequence(String str) {
            this.c = str;
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.O
        public R getTextRoot() {
            return this.d;
        }

        public void setTextRoot(R r) {
            this.d = r;
        }

        public String toString() {
            return "TextChild: '" + this.c + "'";
        }
    }

    static class U extends I implements InterfaceC5124q {
        U() {
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.SvgObject
        String a() {
            return "view";
        }
    }

    /* renamed from: com.smaato.sdk.ng.utils.svgparser.utils.SVGBase$a, reason: case insensitive filesystem */
    static class C5108a extends C5118k {
        String p;

        C5108a() {
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.C5118k, com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.SvgObject
        String a() {
            return "a";
        }
    }

    /* renamed from: com.smaato.sdk.ng.utils.svgparser.utils.SVGBase$b, reason: case insensitive filesystem */
    static class C5109b {
        float a;
        float b;
        float c;
        float d;

        C5109b(float f, float f2, float f3, float f4) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
        }

        static C5109b a(float f, float f2, float f3, float f4) {
            return new C5109b(f, f2, f3 - f, f4 - f2);
        }

        float b() {
            return this.b + this.d;
        }

        public String toString() {
            return X3.j.d + this.a + " " + this.b + " " + this.c + " " + this.d + X3.j.e;
        }

        float a() {
            return this.a + this.c;
        }

        void a(C5109b c5109b) {
            float f = c5109b.a;
            if (f < this.a) {
                this.a = f;
            }
            float f2 = c5109b.b;
            if (f2 < this.b) {
                this.b = f2;
            }
            if (c5109b.a() > a()) {
                this.c = c5109b.a() - this.a;
            }
            if (c5109b.b() > b()) {
                this.d = c5109b.b() - this.b;
            }
        }

        C5109b(C5109b c5109b) {
            this.a = c5109b.a;
            this.b = c5109b.b;
            this.c = c5109b.c;
            this.d = c5109b.d;
        }
    }

    /* renamed from: com.smaato.sdk.ng.utils.svgparser.utils.SVGBase$c, reason: case insensitive filesystem */
    static class C5110c extends AbstractC5117j {
        Length o;
        Length p;
        Length q;

        C5110c() {
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.SvgObject
        String a() {
            return "circle";
        }
    }

    /* renamed from: com.smaato.sdk.ng.utils.svgparser.utils.SVGBase$d, reason: case insensitive filesystem */
    static class C5111d extends C5118k implements InterfaceC5124q {
        Boolean p;

        C5111d() {
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.C5118k, com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.SvgObject
        String a() {
            return "clipPath";
        }
    }

    /* renamed from: com.smaato.sdk.ng.utils.svgparser.utils.SVGBase$e, reason: case insensitive filesystem */
    static class C5112e extends SvgPaint {
        private static final C5112e a = new C5112e();

        private C5112e() {
        }

        static C5112e a() {
            return a;
        }
    }

    /* renamed from: com.smaato.sdk.ng.utils.svgparser.utils.SVGBase$f, reason: case insensitive filesystem */
    static class C5113f extends C5118k implements InterfaceC5124q {
        C5113f() {
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.C5118k, com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.SvgObject
        String a() {
            return "defs";
        }
    }

    /* renamed from: com.smaato.sdk.ng.utils.svgparser.utils.SVGBase$g, reason: case insensitive filesystem */
    static class C5114g extends AbstractC5117j {
        Length o;
        Length p;
        Length q;
        Length r;

        C5114g() {
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.SvgObject
        String a() {
            return "ellipse";
        }
    }

    /* renamed from: com.smaato.sdk.ng.utils.svgparser.utils.SVGBase$h, reason: case insensitive filesystem */
    static abstract class AbstractC5115h extends E implements SvgContainer {
        List<SvgObject> h = new ArrayList();
        Boolean i;
        Matrix j;
        EnumC5116i k;
        String l;

        AbstractC5115h() {
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.SvgContainer
        public void addChild(SvgObject svgObject) throws SVGParseException {
            if (svgObject instanceof A) {
                this.h.add(svgObject);
                return;
            }
            throw new SVGParseException("Gradient elements cannot contain " + svgObject + " elements.");
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.SvgContainer
        public List<SvgObject> getChildren() {
            return this.h;
        }
    }

    /* renamed from: com.smaato.sdk.ng.utils.svgparser.utils.SVGBase$i, reason: case insensitive filesystem */
    enum EnumC5116i {
        pad,
        reflect,
        repeat
    }

    /* renamed from: com.smaato.sdk.ng.utils.svgparser.utils.SVGBase$j, reason: case insensitive filesystem */
    static abstract class AbstractC5117j extends C implements InterfaceC5119l {
        Matrix n;

        AbstractC5117j() {
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.InterfaceC5119l
        public void a(Matrix matrix) {
            this.n = matrix;
        }
    }

    /* renamed from: com.smaato.sdk.ng.utils.svgparser.utils.SVGBase$k, reason: case insensitive filesystem */
    static class C5118k extends SvgConditionalContainer implements InterfaceC5119l {
        Matrix o;

        C5118k() {
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.InterfaceC5119l
        public void a(Matrix matrix) {
            this.o = matrix;
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.SvgObject
        String a() {
            return "group";
        }
    }

    /* renamed from: com.smaato.sdk.ng.utils.svgparser.utils.SVGBase$l, reason: case insensitive filesystem */
    interface InterfaceC5119l {
        void a(Matrix matrix);
    }

    /* renamed from: com.smaato.sdk.ng.utils.svgparser.utils.SVGBase$m, reason: case insensitive filesystem */
    static class C5120m extends G implements InterfaceC5119l {
        String p;
        Length q;
        Length r;
        Length s;
        Length t;
        Matrix u;

        C5120m() {
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.InterfaceC5119l
        public void a(Matrix matrix) {
            this.u = matrix;
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.SvgObject
        String a() {
            return "image";
        }
    }

    /* renamed from: com.smaato.sdk.ng.utils.svgparser.utils.SVGBase$n, reason: case insensitive filesystem */
    static class C5121n extends AbstractC5117j {
        Length o;
        Length p;
        Length q;
        Length r;

        C5121n() {
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.SvgObject
        String a() {
            return "line";
        }
    }

    /* renamed from: com.smaato.sdk.ng.utils.svgparser.utils.SVGBase$o, reason: case insensitive filesystem */
    static class C5122o extends I implements InterfaceC5124q {
        boolean q;
        Length r;
        Length s;
        Length t;
        Length u;
        Float v;

        C5122o() {
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.SvgObject
        String a() {
            return "marker";
        }
    }

    /* renamed from: com.smaato.sdk.ng.utils.svgparser.utils.SVGBase$p, reason: case insensitive filesystem */
    static class C5123p extends SvgConditionalContainer implements InterfaceC5124q {
        Boolean o;
        Boolean p;
        Length q;
        Length r;
        Length s;
        Length t;

        C5123p() {
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.SvgObject
        String a() {
            return "mask";
        }
    }

    /* renamed from: com.smaato.sdk.ng.utils.svgparser.utils.SVGBase$q, reason: case insensitive filesystem */
    interface InterfaceC5124q {
    }

    /* renamed from: com.smaato.sdk.ng.utils.svgparser.utils.SVGBase$r, reason: case insensitive filesystem */
    static class C5125r extends SvgPaint {
        final String a;
        final SvgPaint b;

        C5125r(String str, SvgPaint svgPaint) {
            this.a = str;
            this.b = svgPaint;
        }

        public String toString() {
            return this.a + " " + this.b;
        }
    }

    /* renamed from: com.smaato.sdk.ng.utils.svgparser.utils.SVGBase$s, reason: case insensitive filesystem */
    static class C5126s extends AbstractC5117j {
        C5127t o;
        Float p;

        C5126s() {
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.SvgObject
        String a() {
            return "path";
        }
    }

    /* renamed from: com.smaato.sdk.ng.utils.svgparser.utils.SVGBase$t, reason: case insensitive filesystem */
    static class C5127t implements InterfaceC5128u {
        private int b = 0;
        private int d = 0;
        private byte[] a = new byte[8];
        private float[] c = new float[16];

        C5127t() {
        }

        boolean a() {
            return this.b == 0;
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.InterfaceC5128u
        public void arcTo(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            a((byte) ((z ? 2 : 0) | 4 | (z2 ? 1 : 0)));
            a(5);
            float[] fArr = this.c;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            fArr[i] = f;
            int i3 = i + 2;
            this.d = i3;
            fArr[i2] = f2;
            int i4 = i + 3;
            this.d = i4;
            fArr[i3] = f3;
            int i5 = i + 4;
            this.d = i5;
            fArr[i4] = f4;
            this.d = i + 5;
            fArr[i5] = f5;
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.InterfaceC5128u
        public void close() {
            a((byte) 8);
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.InterfaceC5128u
        public void cubicTo(float f, float f2, float f3, float f4, float f5, float f6) {
            a((byte) 2);
            a(6);
            float[] fArr = this.c;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            fArr[i] = f;
            int i3 = i + 2;
            this.d = i3;
            fArr[i2] = f2;
            int i4 = i + 3;
            this.d = i4;
            fArr[i3] = f3;
            int i5 = i + 4;
            this.d = i5;
            fArr[i4] = f4;
            int i6 = i + 5;
            this.d = i6;
            fArr[i5] = f5;
            this.d = i + 6;
            fArr[i6] = f6;
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.InterfaceC5128u
        public void lineTo(float f, float f2) {
            a((byte) 1);
            a(2);
            float[] fArr = this.c;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            fArr[i] = f;
            this.d = i + 2;
            fArr[i2] = f2;
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.InterfaceC5128u
        public void moveTo(float f, float f2) {
            a((byte) 0);
            a(2);
            float[] fArr = this.c;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            fArr[i] = f;
            this.d = i + 2;
            fArr[i2] = f2;
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.InterfaceC5128u
        public void quadTo(float f, float f2, float f3, float f4) {
            a((byte) 3);
            a(4);
            float[] fArr = this.c;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            fArr[i] = f;
            int i3 = i + 2;
            this.d = i3;
            fArr[i2] = f2;
            int i4 = i + 3;
            this.d = i4;
            fArr[i3] = f3;
            this.d = i + 4;
            fArr[i4] = f4;
        }

        private void a(byte b) {
            int i = this.b;
            byte[] bArr = this.a;
            if (i == bArr.length) {
                byte[] bArr2 = new byte[bArr.length * 2];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.a = bArr2;
            }
            byte[] bArr3 = this.a;
            int i2 = this.b;
            this.b = i2 + 1;
            bArr3[i2] = b;
        }

        private void a(int i) {
            float[] fArr = this.c;
            if (fArr.length < this.d + i) {
                float[] fArr2 = new float[fArr.length * 2];
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                this.c = fArr2;
            }
        }

        void a(InterfaceC5128u interfaceC5128u) {
            int i = 0;
            for (int i2 = 0; i2 < this.b; i2++) {
                byte b = this.a[i2];
                if (b == 8) {
                    interfaceC5128u.close();
                } else if (b == 0) {
                    float[] fArr = this.c;
                    int i3 = i + 1;
                    float f = fArr[i];
                    i += 2;
                    interfaceC5128u.moveTo(f, fArr[i3]);
                } else if (b == 1) {
                    float[] fArr2 = this.c;
                    int i4 = i + 1;
                    float f2 = fArr2[i];
                    i += 2;
                    interfaceC5128u.lineTo(f2, fArr2[i4]);
                } else if (b == 2) {
                    float[] fArr3 = this.c;
                    float f3 = fArr3[i];
                    float f4 = fArr3[i + 1];
                    float f5 = fArr3[i + 2];
                    float f6 = fArr3[i + 3];
                    int i5 = i + 5;
                    float f7 = fArr3[i + 4];
                    i += 6;
                    interfaceC5128u.cubicTo(f3, f4, f5, f6, f7, fArr3[i5]);
                } else if (b != 3) {
                    boolean z = (b & 2) != 0;
                    boolean z2 = (b & 1) != 0;
                    float[] fArr4 = this.c;
                    float f8 = fArr4[i];
                    float f9 = fArr4[i + 1];
                    float f10 = fArr4[i + 2];
                    int i6 = i + 4;
                    float f11 = fArr4[i + 3];
                    i += 5;
                    interfaceC5128u.arcTo(f8, f9, f10, z, z2, f11, fArr4[i6]);
                } else {
                    float[] fArr5 = this.c;
                    float f12 = fArr5[i];
                    float f13 = fArr5[i + 1];
                    int i7 = i + 3;
                    float f14 = fArr5[i + 2];
                    i += 4;
                    interfaceC5128u.quadTo(f12, f13, f14, fArr5[i7]);
                }
            }
        }
    }

    /* renamed from: com.smaato.sdk.ng.utils.svgparser.utils.SVGBase$u, reason: case insensitive filesystem */
    interface InterfaceC5128u {
        void arcTo(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5);

        void close();

        void cubicTo(float f, float f2, float f3, float f4, float f5, float f6);

        void lineTo(float f, float f2);

        void moveTo(float f, float f2);

        void quadTo(float f, float f2, float f3, float f4);
    }

    static class v extends I implements InterfaceC5124q {
        Boolean q;
        Boolean r;
        Matrix s;
        Length t;
        Length u;
        Length v;
        Length w;
        String x;

        v() {
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.SvgObject
        String a() {
            return "pattern";
        }
    }

    static class w extends AbstractC5117j {
        float[] o;

        w() {
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.SvgObject
        String a() {
            return "polyline";
        }
    }

    static class x extends w {
        x() {
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.w, com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.SvgObject
        String a() {
            return "polygon";
        }
    }

    static class y extends AbstractC5117j {
        Length o;
        Length p;
        Length q;
        Length r;
        Length s;
        Length t;

        y() {
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.SvgObject
        String a() {
            return "rect";
        }
    }

    static class z extends E implements SvgContainer {
        z() {
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.SvgObject
        String a() {
            return "solidColor";
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.SvgContainer
        public void addChild(SvgObject svgObject) {
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.SVGBase.SvgContainer
        public List<SvgObject> getChildren() {
            return Collections.EMPTY_LIST;
        }
    }

    SVGBase(boolean z2, SVGExternalFileResolver sVGExternalFileResolver) {
        this.b = z2;
        this.a = sVGExternalFileResolver;
    }

    protected static c b() {
        return new d().a(j).a(i);
    }

    public static SVGBase getFromInputStream(InputStream inputStream) throws SVGParseException {
        return b().a(inputStream);
    }

    public static SVGBase getFromString(String str) throws SVGParseException {
        return b().a(new ByteArrayInputStream(str.getBytes()));
    }

    void a(Svg svg) {
        this.c = svg;
    }

    SvgObject c(String str) {
        if (str == null) {
            return null;
        }
        String a = a(str);
        if (a.length() <= 1 || !a.startsWith("#")) {
            return null;
        }
        return b(a.substring(1));
    }

    boolean d() {
        return !this.g.isEmpty();
    }

    void e(String str) {
        this.d = str;
    }

    public PreserveAspectRatio getDocumentPreserveAspectRatio() {
        Svg svg = this.c;
        if (svg == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        PreserveAspectRatio preserveAspectRatio = svg.o;
        if (preserveAspectRatio == null) {
            return null;
        }
        return preserveAspectRatio;
    }

    public Svg getRootElement() {
        return this.c;
    }

    public void renderToCanvas(Canvas canvas, RenderOptions renderOptions) {
        if (renderOptions == null) {
            renderOptions = new RenderOptions();
        }
        if (!renderOptions.hasViewPort()) {
            renderOptions.viewPort(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        }
        new SVGAndroidRenderer(canvas, this.f, this.a).a(this, renderOptions);
    }

    public Picture renderToPicture(RenderOptionsBase renderOptionsBase) {
        Length length;
        C5109b c5109b = (renderOptionsBase == null || !renderOptionsBase.hasViewBox()) ? this.c.p : renderOptionsBase.e;
        if (renderOptionsBase != null && renderOptionsBase.hasViewPort()) {
            return renderToPicture((int) Math.ceil(renderOptionsBase.g.a()), (int) Math.ceil(renderOptionsBase.g.b()), renderOptionsBase);
        }
        Svg svg = this.c;
        Length length2 = svg.s;
        if (length2 != null) {
            S s = length2.b;
            S s2 = S.percent;
            if (s != s2 && (length = svg.t) != null && length.b != s2) {
                return renderToPicture((int) Math.ceil(length2.a(this.f)), (int) Math.ceil(this.c.t.a(this.f)), renderOptionsBase);
            }
        }
        if (length2 != null && c5109b != null) {
            return renderToPicture((int) Math.ceil(length2.a(this.f)), (int) Math.ceil((c5109b.d * r1) / c5109b.c), renderOptionsBase);
        }
        Length length3 = svg.t;
        if (length3 == null || c5109b == null) {
            return renderToPicture(512, 512, renderOptionsBase);
        }
        return renderToPicture((int) Math.ceil((c5109b.c * r1) / c5109b.d), (int) Math.ceil(length3.a(this.f)), renderOptionsBase);
    }

    private String a(String str) {
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        return str.replace("\\\n", "").replace("\\A", "\n");
    }

    void d(String str) {
        this.e = str;
    }

    E b(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.equals(this.c.c)) {
            return this.c;
        }
        if (this.h.containsKey(str)) {
            return this.h.get(str);
        }
        E a = a(this.c, str);
        this.h.put(str, a);
        return a;
    }

    List<CSSParser.Rule> c() {
        return this.g.getRules();
    }

    void a(CSSParser.Ruleset ruleset) {
        this.g.addAll(ruleset);
    }

    void a() {
        this.g.removeFromSource(CSSParser.Source.RenderOptions);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private E a(SvgContainer svgContainer, String str) {
        E a;
        E e = (E) svgContainer;
        if (str.equals(e.c)) {
            return e;
        }
        for (Object obj : svgContainer.getChildren()) {
            if (obj instanceof E) {
                E e2 = (E) obj;
                if (str.equals(e2.c)) {
                    return e2;
                }
                if ((obj instanceof SvgContainer) && (a = a((SvgContainer) obj, str)) != null) {
                    return a;
                }
            }
        }
        return null;
    }

    public Picture renderToPicture(int i2, int i3, RenderOptionsBase renderOptionsBase) {
        Picture picture = new Picture();
        Canvas beginRecording = picture.beginRecording(i2, i3);
        if (renderOptionsBase == null || renderOptionsBase.g == null) {
            renderOptionsBase = renderOptionsBase == null ? new RenderOptionsBase() : new RenderOptionsBase(renderOptionsBase);
            renderOptionsBase.viewPort(0.0f, 0.0f, i2, i3);
        }
        new SVGAndroidRenderer(beginRecording, this.f, this.a).a(this, renderOptionsBase);
        picture.endRecording();
        return picture;
    }
}
