package net.pubnative.lite.sdk.utils.svgparser.utils;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import com.ironsource.X3;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.pubnative.lite.sdk.utils.svgparser.PreserveAspectRatio;
import net.pubnative.lite.sdk.utils.svgparser.RenderOptions;
import net.pubnative.lite.sdk.utils.svgparser.SVGExternalFileResolver;
import net.pubnative.lite.sdk.utils.svgparser.SVGParseException;
import net.pubnative.lite.sdk.utils.svgparser.utils.CSSParser;

/* loaded from: classes.dex */
public class SVGBase {
    private static final int DEFAULT_PICTURE_HEIGHT = 512;
    private static final int DEFAULT_PICTURE_WIDTH = 512;
    private static final double SQRT2 = 1.414213562373095d;
    private static boolean enableInternalEntitiesSingleton = true;
    private static SVGExternalFileResolver externalFileResolverSingleton;
    private final boolean enableInternalEntities;
    private final SVGExternalFileResolver externalFileResolver;
    private Svg rootElement = null;
    private String title = "";
    private String desc = "";
    private float renderDPI = 96.0f;
    private final CSSParser.Ruleset cssRules = new CSSParser.Ruleset();
    private final Map<String, SvgElementBase> idToElementMap = new HashMap();

    static class A extends Group {
        String href;

        A() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.Group, net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "a";
        }
    }

    public static class CSSClipRect {
        final Length bottom;
        final Length left;
        final Length right;
        final Length top;

        CSSClipRect(Length length, Length length2, Length length3, Length length4) {
            this.top = length;
            this.right = length2;
            this.bottom = length3;
            this.left = length4;
        }
    }

    static class Circle extends GraphicsElement {
        Length cx;
        Length cy;
        Length r;

        Circle() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "circle";
        }
    }

    static class ClipPath extends Group implements NotDirectlyRendered {
        static final String NODE_NAME = "clipPath";
        Boolean clipPathUnitsAreUser;

        ClipPath() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.Group, net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return NODE_NAME;
        }
    }

    public static class Colour extends SvgPaint {
        static final Colour BLACK = new Colour(-16777216);
        static final Colour TRANSPARENT = new Colour(0);
        final int colour;

        Colour(int i) {
            this.colour = i;
        }

        public String toString() {
            return String.format("#%08x", Integer.valueOf(this.colour));
        }
    }

    static class CurrentColor extends SvgPaint {
        private static final CurrentColor instance = new CurrentColor();

        private CurrentColor() {
        }

        static CurrentColor getInstance() {
            return instance;
        }
    }

    static class Defs extends Group implements NotDirectlyRendered {
        Defs() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.Group, net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "defs";
        }
    }

    static class Ellipse extends GraphicsElement {
        Length cx;
        Length cy;
        Length rx;
        Length ry;

        Ellipse() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "ellipse";
        }
    }

    static abstract class GradientElement extends SvgElementBase implements SvgContainer {
        List<SvgObject> children = new ArrayList();
        Matrix gradientTransform;
        Boolean gradientUnitsAreUser;
        String href;
        GradientSpread spreadMethod;

        GradientElement() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgContainer
        public void addChild(SvgObject svgObject) {
            if (svgObject instanceof Stop) {
                this.children.add(svgObject);
                return;
            }
            throw new SVGParseException("Gradient elements cannot contain " + svgObject + " elements.");
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgContainer
        public List<SvgObject> getChildren() {
            return this.children;
        }
    }

    enum GradientSpread {
        pad,
        reflect,
        repeat
    }

    static abstract class GraphicsElement extends SvgConditionalElement implements HasTransform {
        Matrix transform;

        GraphicsElement() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.HasTransform
        public void setTransform(Matrix matrix) {
            this.transform = matrix;
        }
    }

    static class Group extends SvgConditionalContainer implements HasTransform {
        Matrix transform;

        Group() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "group";
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.HasTransform
        public void setTransform(Matrix matrix) {
            this.transform = matrix;
        }
    }

    interface HasTransform {
        void setTransform(Matrix matrix);
    }

    static class Image extends SvgPreserveAspectRatioContainer implements HasTransform {
        Length height;
        String href;
        Matrix transform;
        Length width;
        Length x;
        Length y;

        Image() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "image";
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.HasTransform
        public void setTransform(Matrix matrix) {
            this.transform = matrix;
        }
    }

    public static class Length implements Cloneable {
        final Unit unit;
        final float value;
        static final Length ZERO = new Length(0.0f);
        static final Length PERCENT_100 = new Length(100.0f, Unit.percent);

        public Length(float f, Unit unit) {
            this.value = f;
            this.unit = unit;
        }

        float floatValue() {
            return this.value;
        }

        float floatValueX(SVGAndroidRenderer sVGAndroidRenderer) {
            switch (this.unit.ordinal()) {
                case 8:
                    Box effectiveViewPortInUserUnits = sVGAndroidRenderer.getEffectiveViewPortInUserUnits();
                    if (effectiveViewPortInUserUnits != null) {
                        break;
                    } else {
                        break;
                    }
            }
            return this.value;
        }

        float floatValueY(SVGAndroidRenderer sVGAndroidRenderer) {
            if (this.unit != Unit.percent) {
                return floatValueX(sVGAndroidRenderer);
            }
            Box effectiveViewPortInUserUnits = sVGAndroidRenderer.getEffectiveViewPortInUserUnits();
            return effectiveViewPortInUserUnits == null ? this.value : (this.value * effectiveViewPortInUserUnits.height) / 100.0f;
        }

        boolean isNegative() {
            return this.value < 0.0f;
        }

        boolean isZero() {
            return this.value == 0.0f;
        }

        public String toString() {
            return String.valueOf(this.value) + this.unit;
        }

        float floatValue(SVGAndroidRenderer sVGAndroidRenderer) {
            if (this.unit != Unit.percent) {
                return floatValueX(sVGAndroidRenderer);
            }
            Box effectiveViewPortInUserUnits = sVGAndroidRenderer.getEffectiveViewPortInUserUnits();
            if (effectiveViewPortInUserUnits == null) {
                return this.value;
            }
            float f = effectiveViewPortInUserUnits.width;
            if (f == effectiveViewPortInUserUnits.height) {
                return (this.value * f) / 100.0f;
            }
            return (this.value * ((float) (Math.sqrt((f * f) + (r6 * r6)) / SVGBase.SQRT2))) / 100.0f;
        }

        public Length(float f) {
            this.value = f;
            this.unit = Unit.px;
        }

        float floatValue(SVGAndroidRenderer sVGAndroidRenderer, float f) {
            if (this.unit == Unit.percent) {
                return (this.value * f) / 100.0f;
            }
            return floatValueX(sVGAndroidRenderer);
        }

        float floatValue(float f) {
            int ordinal = this.unit.ordinal();
            if (ordinal == 3) {
                return this.value * f;
            }
            if (ordinal == 4) {
                return (this.value * f) / 2.54f;
            }
            if (ordinal == 5) {
                return (this.value * f) / 25.4f;
            }
            if (ordinal == 6) {
                return (this.value * f) / 72.0f;
            }
            if (ordinal != 7) {
                return this.value;
            }
            return (this.value * f) / 6.0f;
        }
    }

    static class Line extends GraphicsElement {
        Length x1;
        Length x2;
        Length y1;
        Length y2;

        Line() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "line";
        }
    }

    static class Marker extends SvgViewBoxContainer implements NotDirectlyRendered {
        Length markerHeight;
        boolean markerUnitsAreUser;
        Length markerWidth;
        Float orient;
        Length refX;
        Length refY;

        Marker() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "marker";
        }
    }

    static class Mask extends SvgConditionalContainer implements NotDirectlyRendered {
        Length height;
        Boolean maskContentUnitsAreUser;
        Boolean maskUnitsAreUser;
        Length width;
        Length x;
        Length y;

        Mask() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "mask";
        }
    }

    interface NotDirectlyRendered {
    }

    static class PaintReference extends SvgPaint {
        final SvgPaint fallback;
        final String href;

        PaintReference(String str, SvgPaint svgPaint) {
            this.href = str;
            this.fallback = svgPaint;
        }

        public String toString() {
            return this.href + " " + this.fallback;
        }
    }

    static class Path extends GraphicsElement {
        PathDefinition d;
        Float pathLength;

        Path() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "path";
        }
    }

    static class PathDefinition implements PathInterface {
        private static final byte ARCTO = 4;
        private static final byte CLOSE = 8;
        private static final byte CUBICTO = 2;
        private static final byte LINETO = 1;
        private static final byte MOVETO = 0;
        private static final byte QUADTO = 3;
        private int commandsLength = 0;
        private int coordsLength = 0;
        private byte[] commands = new byte[8];
        private float[] coords = new float[16];

        PathDefinition() {
        }

        private void addCommand(byte b) {
            int i = this.commandsLength;
            byte[] bArr = this.commands;
            if (i == bArr.length) {
                byte[] bArr2 = new byte[bArr.length * 2];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.commands = bArr2;
            }
            byte[] bArr3 = this.commands;
            int i2 = this.commandsLength;
            this.commandsLength = i2 + 1;
            bArr3[i2] = b;
        }

        private void coordsEnsure(int i) {
            float[] fArr = this.coords;
            if (fArr.length < this.coordsLength + i) {
                float[] fArr2 = new float[fArr.length * 2];
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                this.coords = fArr2;
            }
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.PathInterface
        public void arcTo(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            addCommand((byte) ((z ? 2 : 0) | 4 | (z2 ? 1 : 0)));
            coordsEnsure(5);
            float[] fArr = this.coords;
            int i = this.coordsLength;
            int i2 = i + 1;
            this.coordsLength = i2;
            fArr[i] = f;
            int i3 = i + 2;
            this.coordsLength = i3;
            fArr[i2] = f2;
            int i4 = i + 3;
            this.coordsLength = i4;
            fArr[i3] = f3;
            int i5 = i + 4;
            this.coordsLength = i5;
            fArr[i4] = f4;
            this.coordsLength = i + 5;
            fArr[i5] = f5;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.PathInterface
        public void close() {
            addCommand((byte) 8);
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.PathInterface
        public void cubicTo(float f, float f2, float f3, float f4, float f5, float f6) {
            addCommand((byte) 2);
            coordsEnsure(6);
            float[] fArr = this.coords;
            int i = this.coordsLength;
            int i2 = i + 1;
            this.coordsLength = i2;
            fArr[i] = f;
            int i3 = i + 2;
            this.coordsLength = i3;
            fArr[i2] = f2;
            int i4 = i + 3;
            this.coordsLength = i4;
            fArr[i3] = f3;
            int i5 = i + 4;
            this.coordsLength = i5;
            fArr[i4] = f4;
            int i6 = i + 5;
            this.coordsLength = i6;
            fArr[i5] = f5;
            this.coordsLength = i + 6;
            fArr[i6] = f6;
        }

        void enumeratePath(PathInterface pathInterface) {
            int i = 0;
            for (int i2 = 0; i2 < this.commandsLength; i2++) {
                byte b = this.commands[i2];
                if (b == 8) {
                    pathInterface.close();
                } else if (b == 0) {
                    float[] fArr = this.coords;
                    int i3 = i + 1;
                    float f = fArr[i];
                    i += 2;
                    pathInterface.moveTo(f, fArr[i3]);
                } else if (b == 1) {
                    float[] fArr2 = this.coords;
                    int i4 = i + 1;
                    float f2 = fArr2[i];
                    i += 2;
                    pathInterface.lineTo(f2, fArr2[i4]);
                } else if (b == 2) {
                    float[] fArr3 = this.coords;
                    float f3 = fArr3[i];
                    float f4 = fArr3[i + 1];
                    float f5 = fArr3[i + 2];
                    float f6 = fArr3[i + 3];
                    int i5 = i + 5;
                    float f7 = fArr3[i + 4];
                    i += 6;
                    pathInterface.cubicTo(f3, f4, f5, f6, f7, fArr3[i5]);
                } else if (b != 3) {
                    boolean z = (b & 2) != 0;
                    boolean z2 = (b & 1) != 0;
                    float[] fArr4 = this.coords;
                    float f8 = fArr4[i];
                    float f9 = fArr4[i + 1];
                    float f10 = fArr4[i + 2];
                    int i6 = i + 4;
                    float f11 = fArr4[i + 3];
                    i += 5;
                    pathInterface.arcTo(f8, f9, f10, z, z2, f11, fArr4[i6]);
                } else {
                    float[] fArr5 = this.coords;
                    float f12 = fArr5[i];
                    float f13 = fArr5[i + 1];
                    int i7 = i + 3;
                    float f14 = fArr5[i + 2];
                    i += 4;
                    pathInterface.quadTo(f12, f13, f14, fArr5[i7]);
                }
            }
        }

        boolean isEmpty() {
            return this.commandsLength == 0;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.PathInterface
        public void lineTo(float f, float f2) {
            addCommand((byte) 1);
            coordsEnsure(2);
            float[] fArr = this.coords;
            int i = this.coordsLength;
            int i2 = i + 1;
            this.coordsLength = i2;
            fArr[i] = f;
            this.coordsLength = i + 2;
            fArr[i2] = f2;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.PathInterface
        public void moveTo(float f, float f2) {
            addCommand((byte) 0);
            coordsEnsure(2);
            float[] fArr = this.coords;
            int i = this.coordsLength;
            int i2 = i + 1;
            this.coordsLength = i2;
            fArr[i] = f;
            this.coordsLength = i + 2;
            fArr[i2] = f2;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.PathInterface
        public void quadTo(float f, float f2, float f3, float f4) {
            addCommand((byte) 3);
            coordsEnsure(4);
            float[] fArr = this.coords;
            int i = this.coordsLength;
            int i2 = i + 1;
            this.coordsLength = i2;
            fArr[i] = f;
            int i3 = i + 2;
            this.coordsLength = i3;
            fArr[i2] = f2;
            int i4 = i + 3;
            this.coordsLength = i4;
            fArr[i3] = f3;
            this.coordsLength = i + 4;
            fArr[i4] = f4;
        }
    }

    interface PathInterface {
        void arcTo(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5);

        void close();

        void cubicTo(float f, float f2, float f3, float f4, float f5, float f6);

        void lineTo(float f, float f2);

        void moveTo(float f, float f2);

        void quadTo(float f, float f2, float f3, float f4);
    }

    static class Pattern extends SvgViewBoxContainer implements NotDirectlyRendered {
        Length height;
        String href;
        Boolean patternContentUnitsAreUser;
        Matrix patternTransform;
        Boolean patternUnitsAreUser;
        Length width;
        Length x;
        Length y;

        Pattern() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "pattern";
        }
    }

    static class PolyLine extends GraphicsElement {
        float[] points;

        PolyLine() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "polyline";
        }
    }

    static class Polygon extends PolyLine {
        Polygon() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.PolyLine, net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "polygon";
        }
    }

    static class Rect extends GraphicsElement {
        Length height;
        Length rx;
        Length ry;
        Length width;
        Length x;
        Length y;

        Rect() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "rect";
        }
    }

    static class SolidColor extends SvgElementBase implements SvgContainer {
        SolidColor() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgContainer
        public void addChild(SvgObject svgObject) {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgContainer
        public List<SvgObject> getChildren() {
            return Collections.EMPTY_LIST;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "solidColor";
        }
    }

    static class Stop extends SvgElementBase implements SvgContainer {
        Float offset;

        Stop() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgContainer
        public void addChild(SvgObject svgObject) {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgContainer
        public List<SvgObject> getChildren() {
            return Collections.EMPTY_LIST;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "stop";
        }
    }

    public static class Svg extends SvgViewBoxContainer {
        Length height;
        public String version;
        Length width;
        Length x;
        Length y;

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "svg";
        }
    }

    interface SvgConditional {
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

    public static abstract class SvgConditionalContainer extends SvgElement implements SvgContainer, SvgConditional {
        List<SvgObject> children = new ArrayList();
        Set<String> requiredFeatures = null;
        String requiredExtensions = null;
        Set<String> systemLanguage = null;
        Set<String> requiredFormats = null;
        Set<String> requiredFonts = null;

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgContainer
        public void addChild(SvgObject svgObject) {
            this.children.add(svgObject);
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgContainer
        public List<SvgObject> getChildren() {
            return this.children;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public String getRequiredExtensions() {
            return this.requiredExtensions;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public Set<String> getRequiredFeatures() {
            return this.requiredFeatures;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public Set<String> getRequiredFonts() {
            return this.requiredFonts;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public Set<String> getRequiredFormats() {
            return this.requiredFormats;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public Set<String> getSystemLanguage() {
            return null;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public void setRequiredExtensions(String str) {
            this.requiredExtensions = str;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public void setRequiredFeatures(Set<String> set) {
            this.requiredFeatures = set;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public void setRequiredFonts(Set<String> set) {
            this.requiredFonts = set;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public void setRequiredFormats(Set<String> set) {
            this.requiredFormats = set;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public void setSystemLanguage(Set<String> set) {
            this.systemLanguage = set;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgElementBase
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }
    }

    static abstract class SvgConditionalElement extends SvgElement implements SvgConditional {
        Set<String> requiredFeatures = null;
        String requiredExtensions = null;
        Set<String> systemLanguage = null;
        Set<String> requiredFormats = null;
        Set<String> requiredFonts = null;

        SvgConditionalElement() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public String getRequiredExtensions() {
            return this.requiredExtensions;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public Set<String> getRequiredFeatures() {
            return this.requiredFeatures;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public Set<String> getRequiredFonts() {
            return this.requiredFonts;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public Set<String> getRequiredFormats() {
            return this.requiredFormats;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public Set<String> getSystemLanguage() {
            return this.systemLanguage;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public void setRequiredExtensions(String str) {
            this.requiredExtensions = str;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public void setRequiredFeatures(Set<String> set) {
            this.requiredFeatures = set;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public void setRequiredFonts(Set<String> set) {
            this.requiredFonts = set;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public void setRequiredFormats(Set<String> set) {
            this.requiredFormats = set;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public void setSystemLanguage(Set<String> set) {
            this.systemLanguage = set;
        }
    }

    public interface SvgContainer {
        void addChild(SvgObject svgObject);

        List<SvgObject> getChildren();
    }

    static abstract class SvgElement extends SvgElementBase {
        Box boundingBox = null;

        SvgElement() {
        }
    }

    static abstract class SvgElementBase extends SvgObject {
        String id = null;
        Boolean spacePreserve = null;
        Style baseStyle = null;
        Style style = null;
        List<String> classNames = null;

        SvgElementBase() {
        }

        public String toString() {
            return getNodeName();
        }
    }

    static class SvgLinearGradient extends GradientElement {
        Length x1;
        Length x2;
        Length y1;
        Length y2;

        SvgLinearGradient() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "linearGradient";
        }
    }

    public static class SvgObject {
        SVGBase document;
        SvgContainer parent;

        String getNodeName() {
            return "";
        }
    }

    public static abstract class SvgPaint implements Cloneable {
    }

    static abstract class SvgPreserveAspectRatioContainer extends SvgConditionalContainer {
        PreserveAspectRatio preserveAspectRatio = null;

        SvgPreserveAspectRatioContainer() {
        }
    }

    static class SvgRadialGradient extends GradientElement {
        Length cx;
        Length cy;
        Length fr;
        Length fx;
        Length fy;
        Length r;

        SvgRadialGradient() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "radialGradient";
        }
    }

    static abstract class SvgViewBoxContainer extends SvgPreserveAspectRatioContainer {
        Box viewBox;

        SvgViewBoxContainer() {
        }
    }

    static class Switch extends Group {
        Switch() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.Group, net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "switch";
        }
    }

    static class Symbol extends SvgViewBoxContainer implements NotDirectlyRendered {
        Symbol() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "symbol";
        }
    }

    static class TRef extends TextContainer implements TextChild {
        String href;
        private TextRoot textRoot;

        TRef() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "tref";
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.TextChild
        public TextRoot getTextRoot() {
            return this.textRoot;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.TextChild
        public void setTextRoot(TextRoot textRoot) {
            this.textRoot = textRoot;
        }
    }

    static class TSpan extends TextPositionedContainer implements TextChild {
        private TextRoot textRoot;

        TSpan() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "tspan";
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.TextChild
        public TextRoot getTextRoot() {
            return this.textRoot;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.TextChild
        public void setTextRoot(TextRoot textRoot) {
            this.textRoot = textRoot;
        }
    }

    static class Text extends TextPositionedContainer implements TextRoot, HasTransform {
        Matrix transform;

        Text() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "text";
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.HasTransform
        public void setTransform(Matrix matrix) {
            this.transform = matrix;
        }
    }

    interface TextChild {
        TextRoot getTextRoot();

        void setTextRoot(TextRoot textRoot);
    }

    public static abstract class TextContainer extends SvgConditionalContainer {
        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditionalContainer, net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgContainer
        public void addChild(SvgObject svgObject) {
            if (svgObject instanceof TextChild) {
                this.children.add(svgObject);
                return;
            }
            throw new SVGParseException("Text content elements cannot contain " + svgObject + " elements.");
        }
    }

    static class TextPath extends TextContainer implements TextChild {
        String href;
        Length startOffset;
        private TextRoot textRoot;

        TextPath() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "textPath";
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.TextChild
        public TextRoot getTextRoot() {
            return this.textRoot;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.TextChild
        public void setTextRoot(TextRoot textRoot) {
            this.textRoot = textRoot;
        }
    }

    static abstract class TextPositionedContainer extends TextContainer {
        List<Length> dx;
        List<Length> dy;
        List<Length> x;
        List<Length> y;

        TextPositionedContainer() {
        }
    }

    interface TextRoot {
    }

    public static class TextSequence extends SvgObject implements TextChild {
        String text;
        private TextRoot textRoot;

        public TextSequence(String str) {
            this.text = str;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.TextChild
        public TextRoot getTextRoot() {
            return this.textRoot;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.TextChild
        public void setTextRoot(TextRoot textRoot) {
            this.textRoot = textRoot;
        }

        public String toString() {
            return "TextChild: '" + this.text + "'";
        }
    }

    enum Unit {
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

    static class Use extends Group {
        Length height;
        String href;
        Length width;
        Length x;
        Length y;

        Use() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.Group, net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "use";
        }
    }

    static class View extends SvgViewBoxContainer implements NotDirectlyRendered {
        static final String NODE_NAME = "view";

        View() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "view";
        }
    }

    SVGBase(boolean z, SVGExternalFileResolver sVGExternalFileResolver) {
        this.enableInternalEntities = z;
        this.externalFileResolver = sVGExternalFileResolver;
    }

    protected static SVGParser createParser() {
        return new SVGParserImpl().setInternalEntitiesEnabled(enableInternalEntitiesSingleton).setExternalFileResolver(externalFileResolverSingleton);
    }

    private String cssQuotedString(String str) {
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        return str.replace("\\\n", "").replace("\\A", "\n");
    }

    private Box getDocumentDimensions(float f) {
        Unit unit;
        Unit unit2;
        Unit unit3;
        Unit unit4;
        float f2;
        Unit unit5;
        Svg svg = this.rootElement;
        Length length = svg.width;
        Length length2 = svg.height;
        if (length == null || length.isZero() || (unit = length.unit) == (unit2 = Unit.percent) || unit == (unit3 = Unit.em) || unit == (unit4 = Unit.ex)) {
            return new Box(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float floatValue = length.floatValue(f);
        if (length2 == null) {
            Box box = this.rootElement.viewBox;
            f2 = box != null ? (box.height * floatValue) / box.width : floatValue;
        } else {
            if (length2.isZero() || (unit5 = length2.unit) == unit2 || unit5 == unit3 || unit5 == unit4) {
                return new Box(-1.0f, -1.0f, -1.0f, -1.0f);
            }
            f2 = length2.floatValue(f);
        }
        return new Box(0.0f, 0.0f, floatValue, f2);
    }

    public static SVGBase getFromInputStream(InputStream inputStream) {
        return createParser().parseStream(inputStream);
    }

    public static SVGBase getFromString(String str) {
        return createParser().parseStream(new ByteArrayInputStream(str.getBytes()));
    }

    void addCSSRules(CSSParser.Ruleset ruleset) {
        this.cssRules.addAll(ruleset);
    }

    void clearRenderCSSRules() {
        this.cssRules.removeFromSource(CSSParser.Source.RenderOptions);
    }

    List<CSSParser.Rule> getCSSRules() {
        return this.cssRules.getRules();
    }

    public PreserveAspectRatio getDocumentPreserveAspectRatio() {
        Svg svg = this.rootElement;
        if (svg == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        PreserveAspectRatio preserveAspectRatio = svg.preserveAspectRatio;
        if (preserveAspectRatio == null) {
            return null;
        }
        return preserveAspectRatio;
    }

    SvgElementBase getElementById(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.equals(this.rootElement.id)) {
            return this.rootElement;
        }
        if (this.idToElementMap.containsKey(str)) {
            return this.idToElementMap.get(str);
        }
        SvgElementBase elementById = getElementById(this.rootElement, str);
        this.idToElementMap.put(str, elementById);
        return elementById;
    }

    List<SvgObject> getElementsByTagName(String str) {
        ArrayList arrayList = new ArrayList();
        getElementsByTagName(arrayList, this.rootElement, str);
        return arrayList;
    }

    public Svg getRootElement() {
        return this.rootElement;
    }

    boolean hasCSSRules() {
        return !this.cssRules.isEmpty();
    }

    public void renderToCanvas(Canvas canvas, RenderOptions renderOptions) {
        if (renderOptions == null) {
            renderOptions = new RenderOptions();
        }
        if (!renderOptions.hasViewPort()) {
            renderOptions.viewPort(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        }
        new SVGAndroidRenderer(canvas, this.renderDPI, this.externalFileResolver).renderDocument(this, renderOptions);
    }

    public Picture renderToPicture(RenderOptionsBase renderOptionsBase) {
        Length length;
        Box box = (renderOptionsBase == null || !renderOptionsBase.hasViewBox()) ? this.rootElement.viewBox : renderOptionsBase.viewBox;
        if (renderOptionsBase != null && renderOptionsBase.hasViewPort()) {
            return renderToPicture((int) Math.ceil(renderOptionsBase.viewPort.maxX()), (int) Math.ceil(renderOptionsBase.viewPort.maxY()), renderOptionsBase);
        }
        Svg svg = this.rootElement;
        Length length2 = svg.width;
        if (length2 != null) {
            Unit unit = length2.unit;
            Unit unit2 = Unit.percent;
            if (unit != unit2 && (length = svg.height) != null && length.unit != unit2) {
                return renderToPicture((int) Math.ceil(length2.floatValue(this.renderDPI)), (int) Math.ceil(this.rootElement.height.floatValue(this.renderDPI)), renderOptionsBase);
            }
        }
        if (length2 != null && box != null) {
            return renderToPicture((int) Math.ceil(length2.floatValue(this.renderDPI)), (int) Math.ceil((box.height * r1) / box.width), renderOptionsBase);
        }
        Length length3 = svg.height;
        if (length3 == null || box == null) {
            return renderToPicture(512, 512, renderOptionsBase);
        }
        return renderToPicture((int) Math.ceil((box.width * r1) / box.height), (int) Math.ceil(length3.floatValue(this.renderDPI)), renderOptionsBase);
    }

    SvgObject resolveIRI(String str) {
        if (str == null) {
            return null;
        }
        String cssQuotedString = cssQuotedString(str);
        if (cssQuotedString.length() <= 1 || !cssQuotedString.startsWith("#")) {
            return null;
        }
        return getElementById(cssQuotedString.substring(1));
    }

    void setDesc(String str) {
        this.desc = str;
    }

    void setRootElement(Svg svg) {
        this.rootElement = svg;
    }

    void setTitle(String str) {
        this.title = str;
    }

    static class Box {
        float height;
        float minX;
        float minY;
        float width;

        Box(float f, float f2, float f3, float f4) {
            this.minX = f;
            this.minY = f2;
            this.width = f3;
            this.height = f4;
        }

        static Box fromLimits(float f, float f2, float f3, float f4) {
            return new Box(f, f2, f3 - f, f4 - f2);
        }

        float maxX() {
            return this.minX + this.width;
        }

        float maxY() {
            return this.minY + this.height;
        }

        RectF toRectF() {
            return new RectF(this.minX, this.minY, maxX(), maxY());
        }

        public String toString() {
            return X3.j.d + this.minX + " " + this.minY + " " + this.width + " " + this.height + X3.j.e;
        }

        void union(Box box) {
            float f = box.minX;
            if (f < this.minX) {
                this.minX = f;
            }
            float f2 = box.minY;
            if (f2 < this.minY) {
                this.minY = f2;
            }
            if (box.maxX() > maxX()) {
                this.width = box.maxX() - this.minX;
            }
            if (box.maxY() > maxY()) {
                this.height = box.maxY() - this.minY;
            }
        }

        Box(Box box) {
            this.minX = box.minX;
            this.minY = box.minY;
            this.width = box.width;
            this.height = box.height;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void getElementsByTagName(List<SvgObject> list, SvgObject svgObject, String str) {
        if (svgObject.getNodeName().equals(str)) {
            list.add(svgObject);
        }
        if (svgObject instanceof SvgContainer) {
            Iterator<SvgObject> it = ((SvgContainer) svgObject).getChildren().iterator();
            while (it.hasNext()) {
                getElementsByTagName(list, it.next(), str);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SvgElementBase getElementById(SvgContainer svgContainer, String str) {
        SvgElementBase elementById;
        SvgElementBase svgElementBase = (SvgElementBase) svgContainer;
        if (str.equals(svgElementBase.id)) {
            return svgElementBase;
        }
        for (Object obj : svgContainer.getChildren()) {
            if (obj instanceof SvgElementBase) {
                SvgElementBase svgElementBase2 = (SvgElementBase) obj;
                if (str.equals(svgElementBase2.id)) {
                    return svgElementBase2;
                }
                if ((obj instanceof SvgContainer) && (elementById = getElementById((SvgContainer) obj, str)) != null) {
                    return elementById;
                }
            }
        }
        return null;
    }

    public Picture renderToPicture(int i, int i2, RenderOptionsBase renderOptionsBase) {
        Picture picture = new Picture();
        Canvas beginRecording = picture.beginRecording(i, i2);
        if (renderOptionsBase == null || renderOptionsBase.viewPort == null) {
            renderOptionsBase = renderOptionsBase == null ? new RenderOptionsBase() : new RenderOptionsBase(renderOptionsBase);
            renderOptionsBase.viewPort(0.0f, 0.0f, i, i2);
        }
        new SVGAndroidRenderer(beginRecording, this.renderDPI, this.externalFileResolver).renderDocument(this, renderOptionsBase);
        picture.endRecording();
        return picture;
    }
}
