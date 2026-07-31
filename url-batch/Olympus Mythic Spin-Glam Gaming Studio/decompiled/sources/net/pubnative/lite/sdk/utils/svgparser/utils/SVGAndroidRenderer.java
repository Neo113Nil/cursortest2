package net.pubnative.lite.sdk.utils.svgparser.utils;

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
import com.smaato.sdk.ng.utils.svgparser.utils.SVGAndroidRenderer$$ExternalSyntheticApiModelOutline3;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;
import java.util.regex.Pattern;
import net.pubnative.lite.sdk.utils.svgparser.PreserveAspectRatio;
import net.pubnative.lite.sdk.utils.svgparser.SVGExternalFileResolver;
import net.pubnative.lite.sdk.utils.svgparser.utils.CSSParser;
import net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase;
import net.pubnative.lite.sdk.utils.svgparser.utils.Style;

/* loaded from: classes8.dex */
public class SVGAndroidRenderer {
    private static final float BEZIER_ARC_FACTOR = 0.5522848f;
    private static final String DEFAULT_FONT_FAMILY = "serif";
    public static final float LUMINANCE_TO_ALPHA_BLUE = 0.0722f;
    public static final float LUMINANCE_TO_ALPHA_GREEN = 0.7151f;
    public static final float LUMINANCE_TO_ALPHA_RED = 0.2127f;
    private static final Pattern PATTERN_DOUBLE_SPACES;
    private static final Pattern PATTERN_END_SPACES;
    private static final Pattern PATTERN_LINE_BREAKS;
    private static final Pattern PATTERN_START_SPACES;
    private static final Pattern PATTERN_TABS;
    private static final Pattern PATTERN_TABS_OR_LINE_BREAKS;
    private static final boolean SUPPORTS_BLEND_MODE;
    private static final boolean SUPPORTS_FONT_HINTING;
    private static final boolean SUPPORTS_PAINT_FONT_FEATURE_SETTINGS;
    private static final boolean SUPPORTS_PAINT_FONT_VARIATION_SETTINGS;
    private static final boolean SUPPORTS_PAINT_LETTER_SPACING;
    private static final boolean SUPPORTS_PAINT_WORD_SPACING;
    private static final boolean SUPPORTS_PATH_OP;
    private static final boolean SUPPORTS_RADIAL_GRADIENT_WITH_FOCUS;
    private static final boolean SUPPORTS_SAVE_LAYER_FLAGLESS;
    private static final boolean SUPPORTS_STROKED_UNDERLINES;
    private static final String TAG = "SVGAndroidRenderer";
    private static HashSet<String> supportedFeatures;
    private final Canvas canvas;
    private SVGBase document;
    private final float dpi;
    private SVGExternalFileResolver externalFileResolver;
    private Stack<Matrix> matrixStack;
    private Stack<SVGBase.SvgContainer> parentStack;
    private CSSParser.RuleMatchContext ruleMatchContext = null;
    private RendererState state;
    private Stack<RendererState> stateStack;

    /* renamed from: net.pubnative.lite.sdk.utils.svgparser.utils.SVGAndroidRenderer$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$PreserveAspectRatio$Alignment;
        static final /* synthetic */ int[] $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$Style$CSSBlendMode;
        static final /* synthetic */ int[] $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$Style$LineCap;
        static final /* synthetic */ int[] $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$Style$LineJoin;

        static {
            int[] iArr = new int[Style.LineJoin.values().length];
            $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$Style$LineJoin = iArr;
            try {
                iArr[Style.LineJoin.Miter.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$Style$LineJoin[Style.LineJoin.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$Style$LineJoin[Style.LineJoin.Bevel.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[Style.LineCap.values().length];
            $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$Style$LineCap = iArr2;
            try {
                iArr2[Style.LineCap.Butt.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$Style$LineCap[Style.LineCap.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$Style$LineCap[Style.LineCap.Square.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[PreserveAspectRatio.Alignment.values().length];
            $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$PreserveAspectRatio$Alignment = iArr3;
            try {
                iArr3[PreserveAspectRatio.Alignment.xMidYMin.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$PreserveAspectRatio$Alignment[PreserveAspectRatio.Alignment.xMidYMid.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$PreserveAspectRatio$Alignment[PreserveAspectRatio.Alignment.xMidYMax.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$PreserveAspectRatio$Alignment[PreserveAspectRatio.Alignment.xMaxYMin.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$PreserveAspectRatio$Alignment[PreserveAspectRatio.Alignment.xMaxYMid.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$PreserveAspectRatio$Alignment[PreserveAspectRatio.Alignment.xMaxYMax.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$PreserveAspectRatio$Alignment[PreserveAspectRatio.Alignment.xMinYMid.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$PreserveAspectRatio$Alignment[PreserveAspectRatio.Alignment.xMinYMax.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            int[] iArr4 = new int[Style.CSSBlendMode.values().length];
            $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$Style$CSSBlendMode = iArr4;
            try {
                iArr4[Style.CSSBlendMode.multiply.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$Style$CSSBlendMode[Style.CSSBlendMode.screen.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$Style$CSSBlendMode[Style.CSSBlendMode.overlay.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$Style$CSSBlendMode[Style.CSSBlendMode.darken.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$Style$CSSBlendMode[Style.CSSBlendMode.lighten.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$Style$CSSBlendMode[Style.CSSBlendMode.color_dodge.ordinal()] = 6;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$Style$CSSBlendMode[Style.CSSBlendMode.color_burn.ordinal()] = 7;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$Style$CSSBlendMode[Style.CSSBlendMode.hard_light.ordinal()] = 8;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$Style$CSSBlendMode[Style.CSSBlendMode.soft_light.ordinal()] = 9;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$Style$CSSBlendMode[Style.CSSBlendMode.difference.ordinal()] = 10;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$Style$CSSBlendMode[Style.CSSBlendMode.exclusion.ordinal()] = 11;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$Style$CSSBlendMode[Style.CSSBlendMode.hue.ordinal()] = 12;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$Style$CSSBlendMode[Style.CSSBlendMode.saturation.ordinal()] = 13;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$Style$CSSBlendMode[Style.CSSBlendMode.color.ordinal()] = 14;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$Style$CSSBlendMode[Style.CSSBlendMode.luminosity.ordinal()] = 15;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$Style$CSSBlendMode[Style.CSSBlendMode.normal.ordinal()] = 16;
            } catch (NoSuchFieldError unused30) {
            }
        }
    }

    private class MarkerPositionCalculator implements SVGBase.PathInterface {
        private boolean closepathReAdjustPending;
        private MarkerVector lastPos;
        private final List<MarkerVector> markers;
        private boolean normalCubic;
        private boolean startArc;
        private float startX;
        private float startY;
        private int subpathStartIndex;

        MarkerPositionCalculator(SVGBase.PathDefinition pathDefinition) {
            ArrayList arrayList = new ArrayList();
            this.markers = arrayList;
            this.lastPos = null;
            this.startArc = false;
            this.normalCubic = true;
            this.subpathStartIndex = -1;
            if (pathDefinition == null) {
                return;
            }
            pathDefinition.enumeratePath(this);
            if (this.closepathReAdjustPending) {
                this.lastPos.add((MarkerVector) arrayList.get(this.subpathStartIndex));
                arrayList.set(this.subpathStartIndex, this.lastPos);
                this.closepathReAdjustPending = false;
            }
            MarkerVector markerVector = this.lastPos;
            if (markerVector != null) {
                arrayList.add(markerVector);
            }
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.PathInterface
        public void arcTo(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            this.startArc = true;
            this.normalCubic = false;
            MarkerVector markerVector = this.lastPos;
            SVGAndroidRenderer.arcTo(markerVector.x, markerVector.y, f, f2, f3, z, z2, f4, f5, this);
            this.normalCubic = true;
            this.closepathReAdjustPending = false;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.PathInterface
        public void close() {
            this.markers.add(this.lastPos);
            lineTo(this.startX, this.startY);
            this.closepathReAdjustPending = true;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.PathInterface
        public void cubicTo(float f, float f2, float f3, float f4, float f5, float f6) {
            if (this.normalCubic || this.startArc) {
                this.lastPos.add(f, f2);
                this.markers.add(this.lastPos);
                this.startArc = false;
            }
            this.lastPos = new MarkerVector(f5, f6, f5 - f3, f6 - f4);
            this.closepathReAdjustPending = false;
        }

        List<MarkerVector> getMarkers() {
            return this.markers;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.PathInterface
        public void lineTo(float f, float f2) {
            this.lastPos.add(f, f2);
            this.markers.add(this.lastPos);
            MarkerVector markerVector = this.lastPos;
            this.lastPos = new MarkerVector(f, f2, f - markerVector.x, f2 - markerVector.y);
            this.closepathReAdjustPending = false;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.PathInterface
        public void moveTo(float f, float f2) {
            if (this.closepathReAdjustPending) {
                this.lastPos.add(this.markers.get(this.subpathStartIndex));
                this.markers.set(this.subpathStartIndex, this.lastPos);
                this.closepathReAdjustPending = false;
            }
            MarkerVector markerVector = this.lastPos;
            if (markerVector != null) {
                this.markers.add(markerVector);
            }
            this.startX = f;
            this.startY = f2;
            this.lastPos = new MarkerVector(f, f2, 0.0f, 0.0f);
            this.subpathStartIndex = this.markers.size();
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.PathInterface
        public void quadTo(float f, float f2, float f3, float f4) {
            this.lastPos.add(f, f2);
            this.markers.add(this.lastPos);
            this.lastPos = new MarkerVector(f3, f4, f3 - f, f4 - f2);
            this.closepathReAdjustPending = false;
        }
    }

    protected static class PathConverter implements SVGBase.PathInterface {
        float lastX;
        float lastY;
        final Path path = new Path();

        PathConverter(SVGBase.PathDefinition pathDefinition) {
            if (pathDefinition == null) {
                return;
            }
            pathDefinition.enumeratePath(this);
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.PathInterface
        public void arcTo(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            SVGAndroidRenderer.arcTo(this.lastX, this.lastY, f, f2, f3, z, z2, f4, f5, this);
            this.lastX = f4;
            this.lastY = f5;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.PathInterface
        public void close() {
            this.path.close();
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.PathInterface
        public void cubicTo(float f, float f2, float f3, float f4, float f5, float f6) {
            this.path.cubicTo(f, f2, f3, f4, f5, f6);
            this.lastX = f5;
            this.lastY = f6;
        }

        Path getPath() {
            return this.path;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.PathInterface
        public void lineTo(float f, float f2) {
            this.path.lineTo(f, f2);
            this.lastX = f;
            this.lastY = f2;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.PathInterface
        public void moveTo(float f, float f2) {
            this.path.moveTo(f, f2);
            this.lastX = f;
            this.lastY = f2;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.PathInterface
        public void quadTo(float f, float f2, float f3, float f4) {
            this.path.quadTo(f, f2, f3, f4);
            this.lastX = f3;
            this.lastY = f4;
        }
    }

    private class PathTextDrawer extends PlainTextDrawer {
        private final Path path;

        PathTextDrawer(Path path, float f, float f2) {
            super(f, f2);
            this.path = path;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGAndroidRenderer.PlainTextDrawer, net.pubnative.lite.sdk.utils.svgparser.utils.SVGAndroidRenderer.TextProcessor
        public void processText(String str) {
            if (SVGAndroidRenderer.this.visible()) {
                float floatValue = SVGAndroidRenderer.SUPPORTS_PAINT_LETTER_SPACING ? SVGAndroidRenderer.this.state.style.letterSpacing.floatValue(SVGAndroidRenderer.this) / 2.0f : 0.0f;
                if (SVGAndroidRenderer.this.state.hasFill) {
                    SVGAndroidRenderer.this.canvas.drawTextOnPath(str, this.path, this.x - floatValue, this.y, SVGAndroidRenderer.this.state.fillPaint);
                }
                if (SVGAndroidRenderer.this.state.hasStroke) {
                    SVGAndroidRenderer.this.canvas.drawTextOnPath(str, this.path, this.x - floatValue, this.y, SVGAndroidRenderer.this.state.strokePaint);
                }
            }
            float f = this.x;
            SVGAndroidRenderer sVGAndroidRenderer = SVGAndroidRenderer.this;
            this.x = f + sVGAndroidRenderer.measureText(str, sVGAndroidRenderer.state.fillPaint);
        }
    }

    private class PlainTextDrawer extends TextProcessor {
        float x;
        float y;

        PlainTextDrawer(float f, float f2) {
            super(null);
            this.x = f;
            this.y = f2;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGAndroidRenderer.TextProcessor
        public void processText(String str) {
            SVGAndroidRenderer.debug("TextSequence render", new Object[0]);
            if (SVGAndroidRenderer.this.visible()) {
                float floatValue = SVGAndroidRenderer.SUPPORTS_PAINT_LETTER_SPACING ? SVGAndroidRenderer.this.state.style.letterSpacing.floatValue(SVGAndroidRenderer.this) / 2.0f : 0.0f;
                if (SVGAndroidRenderer.this.state.hasFill) {
                    SVGAndroidRenderer.this.canvas.drawText(str, this.x - floatValue, this.y, SVGAndroidRenderer.this.state.fillPaint);
                }
                if (SVGAndroidRenderer.this.state.hasStroke) {
                    SVGAndroidRenderer.this.canvas.drawText(str, this.x - floatValue, this.y, SVGAndroidRenderer.this.state.strokePaint);
                }
            }
            float f = this.x;
            SVGAndroidRenderer sVGAndroidRenderer = SVGAndroidRenderer.this;
            this.x = f + sVGAndroidRenderer.measureText(str, sVGAndroidRenderer.state.fillPaint);
        }
    }

    private class PlainTextToPath extends TextProcessor {
        final Path textAsPath;
        float x;
        float y;

        PlainTextToPath(float f, float f2, Path path) {
            super(null);
            this.x = f;
            this.y = f2;
            this.textAsPath = path;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGAndroidRenderer.TextProcessor
        public boolean doTextContainer(SVGBase.TextContainer textContainer) {
            if (!(textContainer instanceof SVGBase.TextPath)) {
                return true;
            }
            SVGAndroidRenderer.warn("Using <textPath> elements in a clip path is not supported.", new Object[0]);
            return false;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGAndroidRenderer.TextProcessor
        public void processText(String str) {
            if (SVGAndroidRenderer.this.visible()) {
                Path path = new Path();
                SVGAndroidRenderer.this.state.fillPaint.getTextPath(str, 0, str.length(), this.x, this.y, path);
                this.textAsPath.addPath(path);
            }
            float f = this.x;
            SVGAndroidRenderer sVGAndroidRenderer = SVGAndroidRenderer.this;
            this.x = f + sVGAndroidRenderer.measureText(str, sVGAndroidRenderer.state.fillPaint);
        }
    }

    private class TextBoundsCalculator extends TextProcessor {
        final RectF bbox;
        float x;
        float y;

        TextBoundsCalculator(float f, float f2) {
            super(null);
            this.bbox = new RectF();
            this.x = f;
            this.y = f2;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGAndroidRenderer.TextProcessor
        public boolean doTextContainer(SVGBase.TextContainer textContainer) {
            if (!(textContainer instanceof SVGBase.TextPath)) {
                return true;
            }
            SVGBase.TextPath textPath = (SVGBase.TextPath) textContainer;
            SVGBase.SvgObject resolveIRI = textContainer.document.resolveIRI(textPath.href);
            if (resolveIRI == null) {
                SVGAndroidRenderer.error("TextPath path reference '%s' not found", textPath.href);
                return false;
            }
            SVGBase.Path path = (SVGBase.Path) resolveIRI;
            Path path2 = new PathConverter(path.d).getPath();
            Matrix matrix = path.transform;
            if (matrix != null) {
                path2.transform(matrix);
            }
            RectF rectF = new RectF();
            path2.computeBounds(rectF, true);
            this.bbox.union(rectF);
            return false;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGAndroidRenderer.TextProcessor
        public void processText(String str) {
            if (SVGAndroidRenderer.this.visible()) {
                Rect rect = new Rect();
                SVGAndroidRenderer.this.state.fillPaint.getTextBounds(str, 0, str.length(), rect);
                RectF rectF = new RectF(rect);
                rectF.offset(this.x, this.y);
                this.bbox.union(rectF);
            }
            float f = this.x;
            SVGAndroidRenderer sVGAndroidRenderer = SVGAndroidRenderer.this;
            this.x = f + sVGAndroidRenderer.measureText(str, sVGAndroidRenderer.state.fillPaint);
        }
    }

    private static abstract class TextProcessor {
        private TextProcessor() {
        }

        public boolean doTextContainer(SVGBase.TextContainer textContainer) {
            return true;
        }

        public abstract void processText(String str);

        /* synthetic */ TextProcessor(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        SUPPORTS_FONT_HINTING = true;
        SUPPORTS_STROKED_UNDERLINES = true;
        SUPPORTS_PATH_OP = true;
        SUPPORTS_PAINT_FONT_FEATURE_SETTINGS = true;
        SUPPORTS_PAINT_LETTER_SPACING = true;
        SUPPORTS_PAINT_FONT_VARIATION_SETTINGS = i >= 26;
        SUPPORTS_BLEND_MODE = i >= 29;
        SUPPORTS_PAINT_WORD_SPACING = i >= 29;
        SUPPORTS_SAVE_LAYER_FLAGLESS = true;
        SUPPORTS_RADIAL_GRADIENT_WITH_FOCUS = i >= 31;
        PATTERN_TABS_OR_LINE_BREAKS = Pattern.compile("[\\n\\t]");
        PATTERN_TABS = Pattern.compile("\\t");
        PATTERN_LINE_BREAKS = Pattern.compile("\\n");
        PATTERN_START_SPACES = Pattern.compile("^\\s+");
        PATTERN_END_SPACES = Pattern.compile("\\s+$");
        PATTERN_DOUBLE_SPACES = Pattern.compile("\\s{2,}");
        supportedFeatures = null;
    }

    SVGAndroidRenderer(Canvas canvas, float f, SVGExternalFileResolver sVGExternalFileResolver) {
        this.canvas = canvas;
        this.dpi = f;
        this.externalFileResolver = sVGExternalFileResolver;
    }

    private void addObjectToClip(SVGBase.SvgObject svgObject, boolean z, Path path, Matrix matrix) {
        if (display()) {
            clipStatePush();
            if (svgObject instanceof SVGBase.Use) {
                if (z) {
                    addObjectToClip((SVGBase.Use) svgObject, path, matrix);
                } else {
                    error("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
                }
            } else if (svgObject instanceof SVGBase.Path) {
                addObjectToClip((SVGBase.Path) svgObject, path, matrix);
            } else if (svgObject instanceof SVGBase.Text) {
                addObjectToClip((SVGBase.Text) svgObject, path, matrix);
            } else if (svgObject instanceof SVGBase.GraphicsElement) {
                addObjectToClip((SVGBase.GraphicsElement) svgObject, path, matrix);
            } else {
                error("Invalid %s element found in clipPath definition", svgObject.toString());
            }
            clipStatePop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void arcTo(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2, float f6, float f7, SVGBase.PathInterface pathInterface) {
        if (f == f6 && f2 == f7) {
            return;
        }
        if (f3 == 0.0f || f4 == 0.0f) {
            pathInterface.lineTo(f6, f7);
            return;
        }
        float abs = Math.abs(f3);
        float abs2 = Math.abs(f4);
        double radians = Math.toRadians(f5 % 360.0d);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d = (f - f6) / 2.0d;
        double d2 = (f2 - f7) / 2.0d;
        double d3 = (cos * d) + (sin * d2);
        double d4 = ((-sin) * d) + (d2 * cos);
        double d5 = abs * abs;
        double d6 = abs2 * abs2;
        double d7 = d3 * d3;
        double d8 = d4 * d4;
        double d9 = (d7 / d5) + (d8 / d6);
        if (d9 > 0.99999d) {
            double sqrt = Math.sqrt(d9) * 1.00001d;
            abs = (float) (abs * sqrt);
            abs2 = (float) (sqrt * abs2);
            d5 = abs * abs;
            d6 = abs2 * abs2;
        }
        double d10 = z == z2 ? -1.0d : 1.0d;
        double d11 = d5 * d6;
        double d12 = d5 * d8;
        double d13 = d6 * d7;
        double d14 = ((d11 - d12) - d13) / (d12 + d13);
        if (d14 < 0.0d) {
            d14 = 0.0d;
        }
        double sqrt2 = d10 * Math.sqrt(d14);
        double d15 = abs;
        double d16 = abs2;
        double d17 = ((d15 * d4) / d16) * sqrt2;
        float f8 = abs;
        float f9 = abs2;
        double d18 = sqrt2 * (-((d16 * d3) / d15));
        double d19 = ((f + f6) / 2.0d) + ((cos * d17) - (sin * d18));
        double d20 = ((f2 + f7) / 2.0d) + (sin * d17) + (cos * d18);
        double d21 = (d3 - d17) / d15;
        double d22 = (d4 - d18) / d16;
        double d23 = ((-d3) - d17) / d15;
        double d24 = ((-d4) - d18) / d16;
        double d25 = (d21 * d21) + (d22 * d22);
        double acos = (d22 < 0.0d ? -1.0d : 1.0d) * Math.acos(d21 / Math.sqrt(d25));
        double checkedArcCos = ((d21 * d24) - (d22 * d23) < 0.0d ? -1.0d : 1.0d) * checkedArcCos(((d21 * d23) + (d22 * d24)) / Math.sqrt(d25 * ((d23 * d23) + (d24 * d24))));
        if (checkedArcCos == 0.0d) {
            pathInterface.lineTo(f6, f7);
            return;
        }
        if (!z2 && checkedArcCos > 0.0d) {
            checkedArcCos -= 6.283185307179586d;
        } else if (z2 && checkedArcCos < 0.0d) {
            checkedArcCos += 6.283185307179586d;
        }
        float[] arcToBeziers = arcToBeziers(acos % 6.283185307179586d, checkedArcCos % 6.283185307179586d);
        Matrix matrix = new Matrix();
        matrix.postScale(f8, f9);
        matrix.postRotate(f5);
        matrix.postTranslate((float) d19, (float) d20);
        matrix.mapPoints(arcToBeziers);
        arcToBeziers[arcToBeziers.length - 2] = f6;
        arcToBeziers[arcToBeziers.length - 1] = f7;
        for (int i = 0; i < arcToBeziers.length; i += 6) {
            pathInterface.cubicTo(arcToBeziers[i], arcToBeziers[i + 1], arcToBeziers[i + 2], arcToBeziers[i + 3], arcToBeziers[i + 4], arcToBeziers[i + 5]);
        }
    }

    private static float[] arcToBeziers(double d, double d2) {
        int ceil = (int) Math.ceil((Math.abs(d2) * 2.0d) / 3.141592653589793d);
        double d3 = d2 / ceil;
        double d4 = d3 / 2.0d;
        double sin = (Math.sin(d4) * 1.3333333333333333d) / (Math.cos(d4) + 1.0d);
        float[] fArr = new float[ceil * 6];
        int i = 0;
        int i2 = 0;
        while (i < ceil) {
            double d5 = d + (i * d3);
            double cos = Math.cos(d5);
            double sin2 = Math.sin(d5);
            double d6 = d3;
            fArr[i2] = (float) (cos - (sin * sin2));
            fArr[i2 + 1] = (float) (sin2 + (cos * sin));
            double d7 = d5 + d6;
            double cos2 = Math.cos(d7);
            double sin3 = Math.sin(d7);
            fArr[i2 + 2] = (float) ((sin * sin3) + cos2);
            fArr[i2 + 3] = (float) (sin3 - (sin * cos2));
            int i3 = i2 + 5;
            fArr[i2 + 4] = (float) cos2;
            i2 += 6;
            fArr[i3] = (float) sin3;
            i++;
            d3 = d6;
        }
        return fArr;
    }

    private Path calculateClipPath(SVGBase.SvgElement svgElement, SVGBase.Box box) {
        Path objectToPath;
        SVGBase.SvgObject resolveIRI = svgElement.document.resolveIRI(this.state.style.clipPath);
        if (resolveIRI == null) {
            error("ClipPath reference '%s' not found", this.state.style.clipPath);
            return null;
        }
        if (resolveIRI.getNodeName() != "clipPath") {
            return null;
        }
        SVGBase.ClipPath clipPath = (SVGBase.ClipPath) resolveIRI;
        this.stateStack.push(this.state);
        this.state = findInheritFromAncestorState(clipPath);
        Boolean bool = clipPath.clipPathUnitsAreUser;
        boolean z = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z) {
            matrix.preTranslate(box.minX, box.minY);
            matrix.preScale(box.width, box.height);
        }
        Matrix matrix2 = clipPath.transform;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (SVGBase.SvgObject svgObject : clipPath.children) {
            if ((svgObject instanceof SVGBase.SvgElement) && (objectToPath = objectToPath((SVGBase.SvgElement) svgObject, true)) != null) {
                path.op(objectToPath, Path.Op.UNION);
            }
        }
        if (this.state.style.clipPath != null) {
            if (clipPath.boundingBox == null) {
                clipPath.boundingBox = calculatePathBounds(path);
            }
            Path calculateClipPath = calculateClipPath(clipPath, clipPath.boundingBox);
            if (calculateClipPath != null) {
                path.op(calculateClipPath, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.state = this.stateStack.pop();
        return path;
    }

    private List<MarkerVector> calculateMarkerPositions(SVGBase.Line line) {
        SVGBase.Length length = line.x1;
        float floatValueX = length != null ? length.floatValueX(this) : 0.0f;
        SVGBase.Length length2 = line.y1;
        float floatValueY = length2 != null ? length2.floatValueY(this) : 0.0f;
        SVGBase.Length length3 = line.x2;
        float floatValueX2 = length3 != null ? length3.floatValueX(this) : 0.0f;
        SVGBase.Length length4 = line.y2;
        float floatValueY2 = length4 != null ? length4.floatValueY(this) : 0.0f;
        ArrayList arrayList = new ArrayList(2);
        float f = floatValueX2 - floatValueX;
        float f2 = floatValueY2 - floatValueY;
        arrayList.add(new MarkerVector(floatValueX, floatValueY, f, f2));
        arrayList.add(new MarkerVector(floatValueX2, floatValueY2, f, f2));
        return arrayList;
    }

    private SVGBase.Box calculatePathBounds(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new SVGBase.Box(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    private float calculateTextWidth(SVGBase.TextContainer textContainer) {
        TextWidthCalculator textWidthCalculator = new TextWidthCalculator(this, null);
        enumerateTextSpans(textContainer, textWidthCalculator);
        return textWidthCalculator.x;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0083, code lost:
    
        if (r12 != 8) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Matrix calculateViewBoxTransform(SVGBase.Box box, SVGBase.Box box2, PreserveAspectRatio preserveAspectRatio) {
        float f;
        float f2;
        Matrix matrix = new Matrix();
        if (preserveAspectRatio != null && preserveAspectRatio.getAlignment() != null) {
            float f3 = box.width / box2.width;
            float f4 = box.height / box2.height;
            float f5 = -box2.minX;
            float f6 = -box2.minY;
            if (preserveAspectRatio.equals(PreserveAspectRatio.STRETCH)) {
                matrix.preTranslate(box.minX, box.minY);
                matrix.preScale(f3, f4);
                matrix.preTranslate(f5, f6);
                return matrix;
            }
            float max = preserveAspectRatio.getScale() == PreserveAspectRatio.Scale.slice ? Math.max(f3, f4) : Math.min(f3, f4);
            float f7 = box.width / max;
            float f8 = box.height / max;
            int[] iArr = AnonymousClass1.$SwitchMap$net$pubnative$lite$sdk$utils$svgparser$PreserveAspectRatio$Alignment;
            switch (iArr[preserveAspectRatio.getAlignment().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    f2 = (box2.width - f7) / 2.0f;
                    break;
                case 4:
                case 5:
                case 6:
                    f2 = box2.width - f7;
                    break;
            }
            f5 -= f2;
            int i = iArr[preserveAspectRatio.getAlignment().ordinal()];
            if (i != 2) {
                if (i != 3) {
                    if (i != 5) {
                        if (i != 6) {
                            if (i != 7) {
                            }
                        }
                    }
                }
                f = box2.height - f8;
                f6 -= f;
                matrix.preTranslate(box.minX, box.minY);
                matrix.preScale(max, max);
                matrix.preTranslate(f5, f6);
            }
            f = (box2.height - f8) / 2.0f;
            f6 -= f;
            matrix.preTranslate(box.minX, box.minY);
            matrix.preScale(max, max);
            matrix.preTranslate(f5, f6);
        }
        return matrix;
    }

    private void canvasSaveLayer(Canvas canvas, RectF rectF, Paint paint) {
        if (SUPPORTS_SAVE_LAYER_FLAGLESS) {
            canvas.saveLayer(rectF, paint);
        } else {
            CanvasLegacy.saveLayer(canvas, rectF, paint, CanvasLegacy.ALL_SAVE_FLAG);
        }
    }

    private void checkForClipPath(SVGBase.SvgElement svgElement) {
        checkForClipPath(svgElement, svgElement.boundingBox);
    }

    private void checkForClipPath_OldStyle(SVGBase.SvgElement svgElement, SVGBase.Box box) {
        SVGBase.SvgObject resolveIRI = svgElement.document.resolveIRI(this.state.style.clipPath);
        if (resolveIRI == null) {
            error("ClipPath reference '%s' not found", this.state.style.clipPath);
            return;
        }
        if (resolveIRI.getNodeName() != "clipPath") {
            return;
        }
        SVGBase.ClipPath clipPath = (SVGBase.ClipPath) resolveIRI;
        if (clipPath.children.isEmpty()) {
            this.canvas.clipRect(0, 0, 0, 0);
            return;
        }
        Boolean bool = clipPath.clipPathUnitsAreUser;
        boolean z = bool == null || bool.booleanValue();
        if ((svgElement instanceof SVGBase.Group) && !z) {
            warn("<clipPath clipPathUnits=\"objectBoundingBox\"> is not supported when referenced from container elements (like %s)", svgElement.getNodeName());
            return;
        }
        clipStatePush();
        if (!z) {
            Matrix matrix = new Matrix();
            matrix.preTranslate(box.minX, box.minY);
            matrix.preScale(box.width, box.height);
            this.canvas.concat(matrix);
        }
        Matrix matrix2 = clipPath.transform;
        if (matrix2 != null) {
            this.canvas.concat(matrix2);
        }
        this.state = findInheritFromAncestorState(clipPath);
        checkForClipPath(clipPath);
        Path path = new Path();
        Iterator<SVGBase.SvgObject> it = clipPath.children.iterator();
        while (it.hasNext()) {
            addObjectToClip(it.next(), true, path, new Matrix());
        }
        this.canvas.clipPath(path);
        clipStatePop();
    }

    private void checkForGradientsAndPatterns(SVGBase.SvgElement svgElement) {
        SVGBase.SvgPaint svgPaint = this.state.style.fill;
        if (svgPaint instanceof SVGBase.PaintReference) {
            decodePaintReference(true, svgElement.boundingBox, (SVGBase.PaintReference) svgPaint);
        }
        SVGBase.SvgPaint svgPaint2 = this.state.style.stroke;
        if (svgPaint2 instanceof SVGBase.PaintReference) {
            decodePaintReference(false, svgElement.boundingBox, (SVGBase.PaintReference) svgPaint2);
        }
    }

    private Bitmap checkForImageDataURL(String str) {
        int indexOf;
        if (!str.startsWith("data:") || str.length() < 14 || (indexOf = str.indexOf(44)) < 12 || !";base64".equals(str.substring(indexOf - 7, indexOf))) {
            return null;
        }
        try {
            byte[] decode = Base64.decode(str.substring(indexOf + 1), 0);
            return BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (Exception e) {
            Log.e(TAG, "Could not decode bad Data URL", e);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0049, code lost:
    
        if (r6.equals("fantasy") == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Typeface checkGenericFont(String str, Float f, Style.FontStyle fontStyle) {
        char c = 2;
        boolean z = fontStyle == Style.FontStyle.italic;
        int i = f.floatValue() >= 700.0f ? z ? 3 : 1 : z ? 2 : 0;
        str.getClass();
        switch (str.hashCode()) {
            case -1536685117:
                if (str.equals("sans-serif")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1431958525:
                if (str.equals("monospace")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1081737434:
                break;
            case 109326717:
                if (str.equals("serif")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1126973893:
                if (str.equals("cursive")) {
                    c = 4;
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
            case 2:
            case 4:
                return Typeface.create(Typeface.SANS_SERIF, i);
            case 1:
                return Typeface.create(Typeface.MONOSPACE, i);
            case 3:
                return Typeface.create(Typeface.SERIF, i);
            default:
                return null;
        }
    }

    private void checkXMLSpaceAttribute(SVGBase.SvgObject svgObject) {
        Boolean bool;
        if ((svgObject instanceof SVGBase.SvgElementBase) && (bool = ((SVGBase.SvgElementBase) svgObject).spacePreserve) != null) {
            this.state.spacePreserve = bool.booleanValue();
        }
    }

    private static double checkedArcCos(double d) {
        if (d < -1.0d) {
            return 3.141592653589793d;
        }
        if (d > 1.0d) {
            return 0.0d;
        }
        return Math.acos(d);
    }

    private static int clamp255(float f) {
        int i = (int) (f * 256.0f);
        if (i < 0) {
            return 0;
        }
        return Math.min(i, 255);
    }

    private void clipStatePop() {
        this.canvas.restore();
        this.state = this.stateStack.pop();
    }

    private void clipStatePush() {
        CanvasLegacy.save(this.canvas, CanvasLegacy.MATRIX_SAVE_FLAG);
        this.stateStack.push(this.state);
        this.state = new RendererState(this.state);
    }

    private static int colourWithOpacity(int i, float f) {
        int round = Math.round(((i >> 24) & 255) * f);
        return (i & 16777215) | ((round < 0 ? 0 : Math.min(round, 255)) << 24);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void debug(String str, Object... objArr) {
    }

    private void decodePaintReference(boolean z, SVGBase.Box box, SVGBase.PaintReference paintReference) {
        SVGBase.SvgObject resolveIRI = this.document.resolveIRI(paintReference.href);
        if (resolveIRI == null) {
            error("%s reference '%s' not found", z ? "Fill" : "Stroke", paintReference.href);
            SVGBase.SvgPaint svgPaint = paintReference.fallback;
            if (svgPaint != null) {
                setPaintColour(this.state, z, svgPaint);
                return;
            } else if (z) {
                this.state.hasFill = false;
                return;
            } else {
                this.state.hasStroke = false;
                return;
            }
        }
        if (resolveIRI instanceof SVGBase.SvgLinearGradient) {
            makeLinearGradient(z, box, (SVGBase.SvgLinearGradient) resolveIRI);
        } else if (resolveIRI instanceof SVGBase.SvgRadialGradient) {
            makeRadialGradient(z, box, (SVGBase.SvgRadialGradient) resolveIRI);
        } else if (resolveIRI instanceof SVGBase.SolidColor) {
            setSolidColor(z, (SVGBase.SolidColor) resolveIRI);
        }
    }

    private boolean display() {
        Boolean bool = this.state.style.display;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private void doFilledPath(SVGBase.SvgElement svgElement, Path path) {
        SVGBase.SvgPaint svgPaint = this.state.style.fill;
        if (svgPaint instanceof SVGBase.PaintReference) {
            SVGBase.SvgObject resolveIRI = this.document.resolveIRI(((SVGBase.PaintReference) svgPaint).href);
            if (resolveIRI instanceof SVGBase.Pattern) {
                fillWithPattern(svgElement, path, (SVGBase.Pattern) resolveIRI);
                return;
            }
        }
        this.canvas.drawPath(path, this.state.fillPaint);
    }

    private void doStroke(Path path) {
        RendererState rendererState = this.state;
        if (rendererState.style.vectorEffect != Style.VectorEffect.NonScalingStroke) {
            this.canvas.drawPath(path, rendererState.strokePaint);
            return;
        }
        Matrix matrix = this.canvas.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        this.canvas.setMatrix(new Matrix());
        Shader shader = this.state.strokePaint.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        this.canvas.drawPath(path2, this.state.strokePaint);
        this.canvas.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    private float dotProduct(float f, float f2, float f3, float f4) {
        return (f * f3) + (f2 * f4);
    }

    private void enumerateTextSpans(SVGBase.TextContainer textContainer, TextProcessor textProcessor) {
        if (display()) {
            Iterator<SVGBase.SvgObject> it = textContainer.children.iterator();
            boolean z = true;
            while (it.hasNext()) {
                SVGBase.SvgObject next = it.next();
                if (next instanceof SVGBase.TextSequence) {
                    textProcessor.processText(textXMLSpaceTransform(((SVGBase.TextSequence) next).text, z, !it.hasNext()));
                } else {
                    processTextChild(next, textProcessor);
                }
                z = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void error(String str, Object... objArr) {
        Log.e(TAG, String.format(str, objArr));
    }

    private void extractRawText(SVGBase.TextContainer textContainer, StringBuilder sb) {
        Iterator<SVGBase.SvgObject> it = textContainer.children.iterator();
        boolean z = true;
        while (it.hasNext()) {
            SVGBase.SvgObject next = it.next();
            if (next instanceof SVGBase.TextContainer) {
                extractRawText((SVGBase.TextContainer) next, sb);
            } else if (next instanceof SVGBase.TextSequence) {
                sb.append(textXMLSpaceTransform(((SVGBase.TextSequence) next).text, z, !it.hasNext()));
            }
            z = false;
        }
    }

    private void fillInChainedGradientFields(SVGBase.GradientElement gradientElement, String str) {
        SVGBase.SvgObject resolveIRI = gradientElement.document.resolveIRI(str);
        if (resolveIRI == null) {
            warn("Gradient reference '%s' not found", str);
            return;
        }
        if (!(resolveIRI instanceof SVGBase.GradientElement)) {
            error("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (resolveIRI == gradientElement) {
            error("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        SVGBase.GradientElement gradientElement2 = (SVGBase.GradientElement) resolveIRI;
        if (gradientElement.gradientUnitsAreUser == null) {
            gradientElement.gradientUnitsAreUser = gradientElement2.gradientUnitsAreUser;
        }
        if (gradientElement.gradientTransform == null) {
            gradientElement.gradientTransform = gradientElement2.gradientTransform;
        }
        if (gradientElement.spreadMethod == null) {
            gradientElement.spreadMethod = gradientElement2.spreadMethod;
        }
        if (gradientElement.children.isEmpty()) {
            gradientElement.children = gradientElement2.children;
        }
        try {
            if (gradientElement instanceof SVGBase.SvgLinearGradient) {
                fillInChainedGradientFields((SVGBase.SvgLinearGradient) gradientElement, (SVGBase.SvgLinearGradient) resolveIRI);
            } else {
                fillInChainedGradientFields((SVGBase.SvgRadialGradient) gradientElement, (SVGBase.SvgRadialGradient) resolveIRI);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = gradientElement2.href;
        if (str2 != null) {
            fillInChainedGradientFields(gradientElement, str2);
        }
    }

    private void fillInChainedPatternFields(SVGBase.Pattern pattern, String str) {
        SVGBase.SvgObject resolveIRI = pattern.document.resolveIRI(str);
        if (resolveIRI == null) {
            warn("Pattern reference '%s' not found", str);
            return;
        }
        if (!(resolveIRI instanceof SVGBase.Pattern)) {
            error("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (resolveIRI == pattern) {
            error("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        SVGBase.Pattern pattern2 = (SVGBase.Pattern) resolveIRI;
        if (pattern.patternUnitsAreUser == null) {
            pattern.patternUnitsAreUser = pattern2.patternUnitsAreUser;
        }
        if (pattern.patternContentUnitsAreUser == null) {
            pattern.patternContentUnitsAreUser = pattern2.patternContentUnitsAreUser;
        }
        if (pattern.patternTransform == null) {
            pattern.patternTransform = pattern2.patternTransform;
        }
        if (pattern.x == null) {
            pattern.x = pattern2.x;
        }
        if (pattern.y == null) {
            pattern.y = pattern2.y;
        }
        if (pattern.width == null) {
            pattern.width = pattern2.width;
        }
        if (pattern.height == null) {
            pattern.height = pattern2.height;
        }
        if (pattern.children.isEmpty()) {
            pattern.children = pattern2.children;
        }
        if (pattern.viewBox == null) {
            pattern.viewBox = pattern2.viewBox;
        }
        if (pattern.preserveAspectRatio == null) {
            pattern.preserveAspectRatio = pattern2.preserveAspectRatio;
        }
        String str2 = pattern2.href;
        if (str2 != null) {
            fillInChainedPatternFields(pattern, str2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0202 A[LOOP:3: B:67:0x01fc->B:69:0x0202, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0222  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void fillWithPattern(SVGBase.SvgElement svgElement, Path path, SVGBase.Pattern pattern) {
        float f;
        float f2;
        float f3;
        float f4;
        PreserveAspectRatio preserveAspectRatio;
        boolean z;
        boolean z2;
        float floor;
        float maxY;
        boolean pushLayer;
        PreserveAspectRatio preserveAspectRatio2;
        Iterator<SVGBase.SvgObject> it;
        Boolean bool = pattern.patternUnitsAreUser;
        boolean z3 = bool != null && bool.booleanValue();
        float floatValue = this.state.style.fillOpacity.floatValue();
        String str = pattern.href;
        if (str != null) {
            fillInChainedPatternFields(pattern, str);
        }
        if (z3) {
            SVGBase.Length length = pattern.x;
            f = length != null ? length.floatValueX(this) : 0.0f;
            SVGBase.Length length2 = pattern.y;
            f3 = length2 != null ? length2.floatValueY(this) : 0.0f;
            SVGBase.Length length3 = pattern.width;
            f4 = length3 != null ? length3.floatValueX(this) : 0.0f;
            SVGBase.Length length4 = pattern.height;
            f2 = length4 != null ? length4.floatValueY(this) : 0.0f;
        } else {
            SVGBase.Length length5 = pattern.x;
            float floatValue2 = length5 != null ? length5.floatValue(this, 1.0f) : 0.0f;
            SVGBase.Length length6 = pattern.y;
            float floatValue3 = length6 != null ? length6.floatValue(this, 1.0f) : 0.0f;
            SVGBase.Length length7 = pattern.width;
            float floatValue4 = length7 != null ? length7.floatValue(this, 1.0f) : 0.0f;
            SVGBase.Length length8 = pattern.height;
            float floatValue5 = length8 != null ? length8.floatValue(this, 1.0f) : 0.0f;
            SVGBase.Box box = svgElement.boundingBox;
            float f5 = box.minX;
            float f6 = box.width;
            f = (floatValue2 * f6) + f5;
            float f7 = box.minY;
            float f8 = box.height;
            float f9 = floatValue4 * f6;
            f2 = floatValue5 * f8;
            f3 = (floatValue3 * f8) + f7;
            f4 = f9;
        }
        if (f4 == 0.0f || f2 == 0.0f) {
            return;
        }
        PreserveAspectRatio preserveAspectRatio3 = pattern.preserveAspectRatio;
        if (preserveAspectRatio3 == null) {
            preserveAspectRatio3 = PreserveAspectRatio.LETTERBOX;
        }
        statePush();
        this.canvas.clipPath(path);
        RendererState rendererState = new RendererState();
        updateStyle(rendererState, Style.getDefaultStyle());
        rendererState.style.overflow = Boolean.FALSE;
        this.state = findInheritFromAncestorState(pattern, rendererState);
        SVGBase.Box box2 = svgElement.boundingBox;
        Matrix matrix = pattern.patternTransform;
        if (matrix != null) {
            this.canvas.concat(matrix);
            Matrix matrix2 = new Matrix();
            if (pattern.patternTransform.invert(matrix2)) {
                SVGBase.Box box3 = svgElement.boundingBox;
                float f10 = box3.minX;
                float f11 = box3.minY;
                float maxX = box3.maxX();
                SVGBase.Box box4 = svgElement.boundingBox;
                float f12 = box4.minY;
                float maxX2 = box4.maxX();
                float maxY2 = svgElement.boundingBox.maxY();
                preserveAspectRatio = preserveAspectRatio3;
                SVGBase.Box box5 = svgElement.boundingBox;
                float[] fArr = {f10, f11, maxX, f12, maxX2, maxY2, box5.minX, box5.maxY()};
                matrix2.mapPoints(fArr);
                z2 = false;
                float f13 = fArr[0];
                float f14 = fArr[1];
                RectF rectF = new RectF(f13, f14, f13, f14);
                for (int i = 2; i <= 6; i += 2) {
                    float f15 = fArr[i];
                    if (f15 < rectF.left) {
                        rectF.left = f15;
                    }
                    if (f15 > rectF.right) {
                        rectF.right = f15;
                    }
                    float f16 = fArr[i + 1];
                    if (f16 < rectF.top) {
                        rectF.top = f16;
                    }
                    if (f16 > rectF.bottom) {
                        rectF.bottom = f16;
                    }
                }
                z = true;
                float f17 = rectF.left;
                float f18 = rectF.top;
                box2 = new SVGBase.Box(f17, f18, rectF.right - f17, rectF.bottom - f18);
                float floor2 = f + (((float) Math.floor((box2.minX - f) / f4)) * f4);
                floor = f3 + (((float) Math.floor((box2.minY - f3) / f2)) * f2);
                float maxX3 = box2.maxX();
                maxY = box2.maxY();
                SVGBase.Box box6 = new SVGBase.Box(0.0f, 0.0f, f4, f2);
                pushLayer = pushLayer(floatValue);
                while (floor < maxY) {
                    float f19 = floor2;
                    while (f19 < maxX3) {
                        box6.minX = f19;
                        box6.minY = floor;
                        statePush();
                        if (!this.state.style.overflow.booleanValue()) {
                            setClipRect(box6.minX, box6.minY, box6.width, box6.height);
                        }
                        SVGBase.Box box7 = pattern.viewBox;
                        if (box7 != null) {
                            preserveAspectRatio2 = preserveAspectRatio;
                            this.canvas.concat(calculateViewBoxTransform(box6, box7, preserveAspectRatio2));
                        } else {
                            preserveAspectRatio2 = preserveAspectRatio;
                            Boolean bool2 = pattern.patternContentUnitsAreUser;
                            boolean z4 = (bool2 == null || bool2.booleanValue()) ? z : z2;
                            this.canvas.translate(f19, floor);
                            if (!z4) {
                                Canvas canvas = this.canvas;
                                SVGBase.Box box8 = svgElement.boundingBox;
                                canvas.scale(box8.width, box8.height);
                                it = pattern.children.iterator();
                                while (it.hasNext()) {
                                    render(it.next());
                                }
                                statePop();
                                f19 += f4;
                                preserveAspectRatio = preserveAspectRatio2;
                                z = true;
                            }
                        }
                        it = pattern.children.iterator();
                        while (it.hasNext()) {
                        }
                        statePop();
                        f19 += f4;
                        preserveAspectRatio = preserveAspectRatio2;
                        z = true;
                    }
                    floor += f2;
                    z = true;
                }
                if (pushLayer) {
                    popLayer(pattern);
                }
                statePop();
            }
        }
        preserveAspectRatio = preserveAspectRatio3;
        z = true;
        z2 = false;
        float floor22 = f + (((float) Math.floor((box2.minX - f) / f4)) * f4);
        floor = f3 + (((float) Math.floor((box2.minY - f3) / f2)) * f2);
        float maxX32 = box2.maxX();
        maxY = box2.maxY();
        SVGBase.Box box62 = new SVGBase.Box(0.0f, 0.0f, f4, f2);
        pushLayer = pushLayer(floatValue);
        while (floor < maxY) {
        }
        if (pushLayer) {
        }
        statePop();
    }

    private RendererState findInheritFromAncestorState(SVGBase.SvgObject svgObject) {
        RendererState rendererState = new RendererState();
        updateStyle(rendererState, Style.getDefaultStyle());
        return findInheritFromAncestorState(svgObject, rendererState);
    }

    private Style.TextAnchor getAnchorPosition() {
        Style.TextAnchor textAnchor;
        Style style = this.state.style;
        if (style.direction == Style.TextDirection.LTR || (textAnchor = style.textAnchor) == Style.TextAnchor.Middle) {
            return style.textAnchor;
        }
        Style.TextAnchor textAnchor2 = Style.TextAnchor.Start;
        return textAnchor == textAnchor2 ? Style.TextAnchor.End : textAnchor2;
    }

    private Path.FillType getClipRuleFromState() {
        Style.FillRule fillRule = this.state.style.clipRule;
        return (fillRule == null || fillRule != Style.FillRule.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    private Path.FillType getFillTypeFromState() {
        Style.FillRule fillRule = this.state.style.fillRule;
        return (fillRule == null || fillRule != Style.FillRule.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    private static synchronized void initialiseSupportedFeaturesMap() {
        synchronized (SVGAndroidRenderer.class) {
            HashSet<String> hashSet = new HashSet<>();
            supportedFeatures = hashSet;
            hashSet.add("Structure");
            supportedFeatures.add("BasicStructure");
            supportedFeatures.add("ConditionalProcessing");
            supportedFeatures.add("Image");
            supportedFeatures.add("Style");
            supportedFeatures.add("ViewportAttribute");
            supportedFeatures.add("Shape");
            supportedFeatures.add("BasicText");
            supportedFeatures.add("PaintAttribute");
            supportedFeatures.add("BasicPaintAttribute");
            supportedFeatures.add("OpacityAttribute");
            supportedFeatures.add("BasicGraphicsAttribute");
            supportedFeatures.add("Marker");
            supportedFeatures.add("Gradient");
            supportedFeatures.add("Pattern");
            supportedFeatures.add("Clip");
            supportedFeatures.add("BasicClip");
            supportedFeatures.add("Mask");
            supportedFeatures.add("View");
        }
    }

    private boolean isSpecified(Style style, long j) {
        return (style.specifiedFlags & j) != 0;
    }

    private void makeLinearGradient(boolean z, SVGBase.Box box, SVGBase.SvgLinearGradient svgLinearGradient) {
        float floatValue;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        int i;
        String str = svgLinearGradient.href;
        if (str != null) {
            fillInChainedGradientFields(svgLinearGradient, str);
        }
        Boolean bool = svgLinearGradient.gradientUnitsAreUser;
        int i2 = 0;
        boolean z2 = bool != null && bool.booleanValue();
        Paint paint = z ? this.state.fillPaint : this.state.strokePaint;
        if (z2) {
            SVGBase.Length length = svgLinearGradient.x1;
            floatValue = length != null ? length.floatValueX(this) : 0.0f;
            SVGBase.Length length2 = svgLinearGradient.y1;
            f = length2 != null ? length2.floatValueY(this) : 0.0f;
            SVGBase.Length length3 = svgLinearGradient.x2;
            if (length3 == null) {
                length3 = SVGBase.Length.PERCENT_100;
            }
            f2 = length3.floatValueX(this);
            SVGBase.Length length4 = svgLinearGradient.y2;
            if (length4 != null) {
                f3 = floatValue;
                f5 = f;
                f6 = f2;
                f4 = length4.floatValueY(this);
            }
            f3 = floatValue;
            f5 = f;
            f6 = f2;
            f4 = 0.0f;
        } else {
            SVGBase.Length length5 = svgLinearGradient.x1;
            floatValue = length5 != null ? length5.floatValue(this, 1.0f) : 0.0f;
            SVGBase.Length length6 = svgLinearGradient.y1;
            float floatValue2 = length6 != null ? length6.floatValue(this, 1.0f) : 0.0f;
            SVGBase.Length length7 = svgLinearGradient.x2;
            float floatValue3 = length7 != null ? length7.floatValue(this, 1.0f) : 1.0f;
            SVGBase.Length length8 = svgLinearGradient.y2;
            if (length8 != null) {
                float floatValue4 = length8.floatValue(this, 1.0f);
                f3 = floatValue;
                f4 = floatValue4;
                f5 = floatValue2;
                f6 = floatValue3;
            } else {
                f = floatValue2;
                f2 = floatValue3;
                f3 = floatValue;
                f5 = f;
                f6 = f2;
                f4 = 0.0f;
            }
        }
        statePush();
        this.state = findInheritFromAncestorState(svgLinearGradient);
        Matrix matrix = new Matrix();
        if (!z2) {
            matrix.preTranslate(box.minX, box.minY);
            matrix.preScale(box.width, box.height);
        }
        Matrix matrix2 = svgLinearGradient.gradientTransform;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = svgLinearGradient.children.size();
        if (size == 0) {
            statePop();
            if (z) {
                this.state.hasFill = false;
                return;
            } else {
                this.state.hasStroke = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        Iterator<SVGBase.SvgObject> it = svgLinearGradient.children.iterator();
        float f7 = -1.0f;
        while (it.hasNext()) {
            SVGBase.Stop stop = (SVGBase.Stop) it.next();
            Float f8 = stop.offset;
            float floatValue5 = f8 != null ? f8.floatValue() : 0.0f;
            if (i2 == 0 || floatValue5 >= f7) {
                fArr[i2] = floatValue5;
                f7 = floatValue5;
            } else {
                fArr[i2] = f7;
            }
            statePush();
            updateStyleForElement(this.state, stop);
            Style style = this.state.style;
            SVGBase.Colour colour = (SVGBase.Colour) style.stopColor;
            if (colour == null) {
                colour = SVGBase.Colour.BLACK;
            }
            iArr[i2] = colourWithOpacity(colour.colour, style.stopOpacity.floatValue());
            i2++;
            statePop();
        }
        if (f3 == f6 && f5 == f4) {
            i = 1;
        } else {
            i = 1;
            if (size != 1) {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                SVGBase.GradientSpread gradientSpread = svgLinearGradient.spreadMethod;
                if (gradientSpread != null) {
                    if (gradientSpread == SVGBase.GradientSpread.reflect) {
                        tileMode = Shader.TileMode.MIRROR;
                    } else if (gradientSpread == SVGBase.GradientSpread.repeat) {
                        tileMode = Shader.TileMode.REPEAT;
                    }
                }
                Shader.TileMode tileMode2 = tileMode;
                statePop();
                LinearGradient linearGradient = new LinearGradient(f3, f5, f6, f4, iArr, fArr, tileMode2);
                linearGradient.setLocalMatrix(matrix);
                paint.setShader(linearGradient);
                paint.setAlpha(clamp255(this.state.style.fillOpacity.floatValue()));
                return;
            }
        }
        statePop();
        paint.setColor(iArr[size - i]);
    }

    private Path makePathAndBoundingBox(SVGBase.Line line) {
        SVGBase.Length length = line.x1;
        float floatValueX = length == null ? 0.0f : length.floatValueX(this);
        SVGBase.Length length2 = line.y1;
        float floatValueY = length2 == null ? 0.0f : length2.floatValueY(this);
        SVGBase.Length length3 = line.x2;
        float floatValueX2 = length3 == null ? 0.0f : length3.floatValueX(this);
        SVGBase.Length length4 = line.y2;
        float floatValueY2 = length4 != null ? length4.floatValueY(this) : 0.0f;
        if (line.boundingBox == null) {
            line.boundingBox = new SVGBase.Box(Math.min(floatValueX, floatValueX2), Math.min(floatValueY, floatValueY2), Math.abs(floatValueX2 - floatValueX), Math.abs(floatValueY2 - floatValueY));
        }
        Path path = new Path();
        path.moveTo(floatValueX, floatValueY);
        path.lineTo(floatValueX2, floatValueY2);
        return path;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void makeRadialGradient(boolean z, SVGBase.Box box, SVGBase.SvgRadialGradient svgRadialGradient) {
        float f;
        float f2;
        float f3;
        float floatValue;
        float f4;
        float f5;
        float f6;
        float f7;
        Matrix matrix;
        int size;
        int[] iArr;
        long[] jArr;
        long pack;
        String str = svgRadialGradient.href;
        if (str != null) {
            fillInChainedGradientFields(svgRadialGradient, str);
        }
        Boolean bool = svgRadialGradient.gradientUnitsAreUser;
        int i = 0;
        boolean z2 = bool != null && bool.booleanValue();
        Paint paint = z ? this.state.fillPaint : this.state.strokePaint;
        if (z2) {
            SVGBase.Length length = new SVGBase.Length(50.0f, SVGBase.Unit.percent);
            SVGBase.Length length2 = svgRadialGradient.cx;
            f = length2 != null ? length2.floatValueX(this) : length.floatValueX(this);
            SVGBase.Length length3 = svgRadialGradient.cy;
            f2 = length3 != null ? length3.floatValueY(this) : length.floatValueY(this);
            SVGBase.Length length4 = svgRadialGradient.r;
            f3 = length4 != null ? length4.floatValue(this) : length.floatValue(this);
            if (SUPPORTS_RADIAL_GRADIENT_WITH_FOCUS) {
                SVGBase.Length length5 = svgRadialGradient.fx;
                f4 = length5 != null ? length5.floatValueX(this) : f;
                SVGBase.Length length6 = svgRadialGradient.fy;
                f5 = length6 != null ? length6.floatValueY(this) : f2;
                SVGBase.Length length7 = svgRadialGradient.fr;
                if (length7 != null) {
                    f6 = f5;
                    f7 = length7.floatValue(this);
                    floatValue = f4;
                    statePush();
                    this.state = findInheritFromAncestorState(svgRadialGradient);
                    Matrix matrix2 = new Matrix();
                    if (!z2) {
                        matrix2.preTranslate(box.minX, box.minY);
                        matrix2.preScale(box.width, box.height);
                    }
                    matrix = svgRadialGradient.gradientTransform;
                    if (matrix != null) {
                        matrix2.preConcat(matrix);
                    }
                    size = svgRadialGradient.children.size();
                    if (size == 0) {
                        statePop();
                        if (z) {
                            this.state.hasFill = false;
                            return;
                        } else {
                            this.state.hasStroke = false;
                            return;
                        }
                    }
                    if (SUPPORTS_RADIAL_GRADIENT_WITH_FOCUS) {
                        jArr = new long[size];
                        iArr = null;
                    } else {
                        iArr = new int[size];
                        jArr = null;
                    }
                    float[] fArr = new float[size];
                    Iterator<SVGBase.SvgObject> it = svgRadialGradient.children.iterator();
                    float f8 = -1.0f;
                    while (it.hasNext()) {
                        SVGBase.Stop stop = (SVGBase.Stop) it.next();
                        Float f9 = stop.offset;
                        float floatValue2 = f9 != null ? f9.floatValue() : 0.0f;
                        if (i == 0 || floatValue2 >= f8) {
                            fArr[i] = floatValue2;
                            f8 = floatValue2;
                        } else {
                            fArr[i] = f8;
                        }
                        statePush();
                        updateStyleForElement(this.state, stop);
                        Style style = this.state.style;
                        SVGBase.Colour colour = (SVGBase.Colour) style.stopColor;
                        if (colour == null) {
                            colour = SVGBase.Colour.BLACK;
                        }
                        if (SUPPORTS_RADIAL_GRADIENT_WITH_FOCUS) {
                            pack = Color.pack(colourWithOpacity(colour.colour, style.stopOpacity.floatValue()));
                            jArr[i] = pack;
                        } else {
                            iArr[i] = colourWithOpacity(colour.colour, style.stopOpacity.floatValue());
                        }
                        i++;
                        statePop();
                    }
                    if (f3 == 0.0f || size == 1) {
                        statePop();
                        paint.setColor(iArr[size - 1]);
                        return;
                    }
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    SVGBase.GradientSpread gradientSpread = svgRadialGradient.spreadMethod;
                    if (gradientSpread != null) {
                        if (gradientSpread == SVGBase.GradientSpread.reflect) {
                            tileMode = Shader.TileMode.MIRROR;
                        } else if (gradientSpread == SVGBase.GradientSpread.repeat) {
                            tileMode = Shader.TileMode.REPEAT;
                        }
                    }
                    statePop();
                    RadialGradient m = SUPPORTS_RADIAL_GRADIENT_WITH_FOCUS ? SVGAndroidRenderer$$ExternalSyntheticApiModelOutline3.m(floatValue, f6, f7, f, f2, f3, jArr, fArr, tileMode) : new RadialGradient(f, f2, f3, iArr, fArr, tileMode);
                    m.setLocalMatrix(matrix2);
                    paint.setShader(m);
                    paint.setAlpha(clamp255(this.state.style.fillOpacity.floatValue()));
                    return;
                }
                floatValue = f4;
                f6 = f5;
            }
            floatValue = 0.0f;
            f6 = 0.0f;
        } else {
            SVGBase.Length length8 = svgRadialGradient.cx;
            float floatValue3 = length8 != null ? length8.floatValue(this, 1.0f) : 0.5f;
            SVGBase.Length length9 = svgRadialGradient.cy;
            float floatValue4 = length9 != null ? length9.floatValue(this, 1.0f) : 0.5f;
            SVGBase.Length length10 = svgRadialGradient.r;
            float floatValue5 = length10 != null ? length10.floatValue(this, 1.0f) : 0.5f;
            if (SUPPORTS_RADIAL_GRADIENT_WITH_FOCUS) {
                SVGBase.Length length11 = svgRadialGradient.fx;
                floatValue = length11 != null ? length11.floatValue(this, 1.0f) : 0.5f;
                SVGBase.Length length12 = svgRadialGradient.fy;
                float floatValue6 = length12 != null ? length12.floatValue(this, 1.0f) : 0.5f;
                SVGBase.Length length13 = svgRadialGradient.fr;
                if (length13 != null) {
                    float floatValue7 = length13.floatValue(this, 1.0f);
                    f6 = floatValue6;
                    f7 = floatValue7;
                    f2 = floatValue4;
                    f = floatValue3;
                    f3 = floatValue5;
                    statePush();
                    this.state = findInheritFromAncestorState(svgRadialGradient);
                    Matrix matrix22 = new Matrix();
                    if (!z2) {
                    }
                    matrix = svgRadialGradient.gradientTransform;
                    if (matrix != null) {
                    }
                    size = svgRadialGradient.children.size();
                    if (size == 0) {
                    }
                } else {
                    f2 = floatValue4;
                    f4 = floatValue;
                    float f10 = floatValue6;
                    f = floatValue3;
                    f3 = floatValue5;
                    f5 = f10;
                    floatValue = f4;
                    f6 = f5;
                }
            } else {
                f = floatValue3;
                f2 = floatValue4;
                f3 = floatValue5;
                floatValue = 0.0f;
                f6 = 0.0f;
            }
        }
        f7 = 0.0f;
        statePush();
        this.state = findInheritFromAncestorState(svgRadialGradient);
        Matrix matrix222 = new Matrix();
        if (!z2) {
        }
        matrix = svgRadialGradient.gradientTransform;
        if (matrix != null) {
        }
        size = svgRadialGradient.children.size();
        if (size == 0) {
        }
    }

    private SVGBase.Box makeViewPort(SVGBase.Length length, SVGBase.Length length2, SVGBase.Length length3, SVGBase.Length length4) {
        float floatValueX = length != null ? length.floatValueX(this) : 0.0f;
        float floatValueY = length2 != null ? length2.floatValueY(this) : 0.0f;
        SVGBase.Box effectiveViewPortInUserUnits = getEffectiveViewPortInUserUnits();
        return new SVGBase.Box(floatValueX, floatValueY, length3 != null ? length3.floatValueX(this) : effectiveViewPortInUserUnits.width, length4 != null ? length4.floatValueY(this) : effectiveViewPortInUserUnits.height);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float measureText(String str, Paint paint) {
        int length = str.length();
        float[] fArr = new float[length];
        paint.getTextWidths(str, fArr);
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i];
        }
        return f;
    }

    private Path objectToPath(SVGBase.SvgElement svgElement, boolean z) {
        Path makePathAndBoundingBox;
        Path calculateClipPath;
        this.stateStack.push(this.state);
        RendererState rendererState = new RendererState(this.state);
        this.state = rendererState;
        updateStyleForElement(rendererState, svgElement);
        if (!display() || !visible()) {
            this.state = this.stateStack.pop();
            return null;
        }
        if (svgElement instanceof SVGBase.Use) {
            if (!z) {
                error("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            SVGBase.Use use = (SVGBase.Use) svgElement;
            SVGBase.SvgObject resolveIRI = svgElement.document.resolveIRI(use.href);
            if (resolveIRI == null) {
                error("Use reference '%s' not found", use.href);
                this.state = this.stateStack.pop();
                return null;
            }
            if (!(resolveIRI instanceof SVGBase.SvgElement)) {
                this.state = this.stateStack.pop();
                return null;
            }
            makePathAndBoundingBox = objectToPath((SVGBase.SvgElement) resolveIRI, false);
            if (makePathAndBoundingBox == null) {
                return null;
            }
            if (use.boundingBox == null) {
                use.boundingBox = calculatePathBounds(makePathAndBoundingBox);
            }
            Matrix matrix = use.transform;
            if (matrix != null) {
                makePathAndBoundingBox.transform(matrix);
            }
        } else if (svgElement instanceof SVGBase.GraphicsElement) {
            SVGBase.GraphicsElement graphicsElement = (SVGBase.GraphicsElement) svgElement;
            if (svgElement instanceof SVGBase.Path) {
                makePathAndBoundingBox = new PathConverter(((SVGBase.Path) svgElement).d).getPath();
                if (svgElement.boundingBox == null) {
                    svgElement.boundingBox = calculatePathBounds(makePathAndBoundingBox);
                }
            } else {
                makePathAndBoundingBox = svgElement instanceof SVGBase.Rect ? makePathAndBoundingBox((SVGBase.Rect) svgElement) : svgElement instanceof SVGBase.Circle ? makePathAndBoundingBox((SVGBase.Circle) svgElement) : svgElement instanceof SVGBase.Ellipse ? makePathAndBoundingBox((SVGBase.Ellipse) svgElement) : svgElement instanceof SVGBase.PolyLine ? makePathAndBoundingBox((SVGBase.PolyLine) svgElement) : null;
            }
            if (makePathAndBoundingBox == null) {
                return null;
            }
            if (graphicsElement.boundingBox == null) {
                graphicsElement.boundingBox = calculatePathBounds(makePathAndBoundingBox);
            }
            Matrix matrix2 = graphicsElement.transform;
            if (matrix2 != null) {
                makePathAndBoundingBox.transform(matrix2);
            }
            makePathAndBoundingBox.setFillType(getClipRuleFromState());
        } else {
            if (!(svgElement instanceof SVGBase.Text)) {
                error("Invalid %s element found in clipPath definition", svgElement.getNodeName());
                return null;
            }
            SVGBase.Text text = (SVGBase.Text) svgElement;
            makePathAndBoundingBox = makePathAndBoundingBox(text);
            Matrix matrix3 = text.transform;
            if (matrix3 != null) {
                makePathAndBoundingBox.transform(matrix3);
            }
            makePathAndBoundingBox.setFillType(getClipRuleFromState());
        }
        if (this.state.style.clipPath != null && (calculateClipPath = calculateClipPath(svgElement, svgElement.boundingBox)) != null) {
            makePathAndBoundingBox.op(calculateClipPath, Path.Op.INTERSECT);
        }
        this.state = this.stateStack.pop();
        return makePathAndBoundingBox;
    }

    private void parentPop() {
        this.parentStack.pop();
        this.matrixStack.pop();
    }

    private void parentPush(SVGBase.SvgContainer svgContainer) {
        this.parentStack.push(svgContainer);
        this.matrixStack.push(this.canvas.getMatrix());
    }

    private void popLayer(SVGBase.SvgElement svgElement) {
        popLayer(svgElement, svgElement.boundingBox);
    }

    private void processTextChild(SVGBase.SvgObject svgObject, TextProcessor textProcessor) {
        float f;
        float f2;
        float f3;
        Style.TextAnchor anchorPosition;
        if (textProcessor.doTextContainer((SVGBase.TextContainer) svgObject)) {
            if (svgObject instanceof SVGBase.TextPath) {
                statePush();
                renderTextPath((SVGBase.TextPath) svgObject);
                statePop();
                return;
            }
            if (!(svgObject instanceof SVGBase.TSpan)) {
                if (svgObject instanceof SVGBase.TRef) {
                    statePush();
                    SVGBase.TRef tRef = (SVGBase.TRef) svgObject;
                    updateStyleForElement(this.state, tRef);
                    if (display()) {
                        checkForGradientsAndPatterns((SVGBase.SvgElement) tRef.getTextRoot());
                        SVGBase.SvgObject resolveIRI = svgObject.document.resolveIRI(tRef.href);
                        if (resolveIRI instanceof SVGBase.TextContainer) {
                            StringBuilder sb = new StringBuilder();
                            extractRawText((SVGBase.TextContainer) resolveIRI, sb);
                            if (sb.length() > 0) {
                                textProcessor.processText(sb.toString());
                            }
                        } else {
                            error("Tref reference '%s' not found", tRef.href);
                        }
                    }
                    statePop();
                    return;
                }
                return;
            }
            debug("TSpan render", new Object[0]);
            statePush();
            SVGBase.TSpan tSpan = (SVGBase.TSpan) svgObject;
            updateStyleForElement(this.state, tSpan);
            if (display()) {
                selectTypefaceAndFontStyling();
                List<SVGBase.Length> list = tSpan.x;
                boolean z = list != null && list.size() > 0;
                boolean z2 = textProcessor instanceof PlainTextDrawer;
                float f4 = 0.0f;
                if (z2) {
                    float floatValueX = !z ? ((PlainTextDrawer) textProcessor).x : tSpan.x.get(0).floatValueX(this);
                    List<SVGBase.Length> list2 = tSpan.y;
                    f2 = (list2 == null || list2.size() == 0) ? ((PlainTextDrawer) textProcessor).y : tSpan.y.get(0).floatValueY(this);
                    List<SVGBase.Length> list3 = tSpan.dx;
                    f3 = (list3 == null || list3.size() == 0) ? 0.0f : tSpan.dx.get(0).floatValueX(this);
                    List<SVGBase.Length> list4 = tSpan.dy;
                    if (list4 != null && list4.size() != 0) {
                        f4 = tSpan.dy.get(0).floatValueY(this);
                    }
                    f = f4;
                    f4 = floatValueX;
                } else {
                    f = 0.0f;
                    f2 = 0.0f;
                    f3 = 0.0f;
                }
                if (z && (anchorPosition = getAnchorPosition()) != Style.TextAnchor.Start) {
                    float calculateTextWidth = calculateTextWidth(tSpan);
                    if (anchorPosition == Style.TextAnchor.Middle) {
                        calculateTextWidth /= 2.0f;
                    }
                    f4 -= calculateTextWidth;
                }
                checkForGradientsAndPatterns((SVGBase.SvgElement) tSpan.getTextRoot());
                if (z2) {
                    PlainTextDrawer plainTextDrawer = (PlainTextDrawer) textProcessor;
                    plainTextDrawer.x = f4 + f3;
                    plainTextDrawer.y = f2 + f;
                }
                boolean pushLayer = pushLayer();
                enumerateTextSpans(tSpan, textProcessor);
                if (pushLayer) {
                    popLayer(tSpan);
                }
            }
            statePop();
        }
    }

    private boolean pushLayer() {
        return pushLayer(1.0f);
    }

    private MarkerVector realignMarkerMid(MarkerVector markerVector, MarkerVector markerVector2, MarkerVector markerVector3) {
        float dotProduct = dotProduct(markerVector2.dx, markerVector2.dy, markerVector2.x - markerVector.x, markerVector2.y - markerVector.y);
        if (dotProduct == 0.0f) {
            dotProduct = dotProduct(markerVector2.dx, markerVector2.dy, markerVector3.x - markerVector2.x, markerVector3.y - markerVector2.y);
        }
        if (dotProduct > 0.0f || (dotProduct == 0.0f && (markerVector2.dx > 0.0f || markerVector2.dy >= 0.0f))) {
            return markerVector2;
        }
        markerVector2.dx = -markerVector2.dx;
        markerVector2.dy = -markerVector2.dy;
        return markerVector2;
    }

    private void render(SVGBase.SvgObject svgObject) {
        if (svgObject instanceof SVGBase.NotDirectlyRendered) {
            return;
        }
        statePush();
        checkXMLSpaceAttribute(svgObject);
        if (svgObject instanceof SVGBase.Svg) {
            render((SVGBase.Svg) svgObject);
        } else if (svgObject instanceof SVGBase.Use) {
            render((SVGBase.Use) svgObject);
        } else if (svgObject instanceof SVGBase.Switch) {
            render((SVGBase.Switch) svgObject);
        } else if (svgObject instanceof SVGBase.Group) {
            render((SVGBase.Group) svgObject);
        } else if (svgObject instanceof SVGBase.Image) {
            render((SVGBase.Image) svgObject);
        } else if (svgObject instanceof SVGBase.Path) {
            render((SVGBase.Path) svgObject);
        } else if (svgObject instanceof SVGBase.Rect) {
            render((SVGBase.Rect) svgObject);
        } else if (svgObject instanceof SVGBase.Circle) {
            render((SVGBase.Circle) svgObject);
        } else if (svgObject instanceof SVGBase.Ellipse) {
            render((SVGBase.Ellipse) svgObject);
        } else if (svgObject instanceof SVGBase.Line) {
            render((SVGBase.Line) svgObject);
        } else if (svgObject instanceof SVGBase.Polygon) {
            render((SVGBase.Polygon) svgObject);
        } else if (svgObject instanceof SVGBase.PolyLine) {
            render((SVGBase.PolyLine) svgObject);
        } else if (svgObject instanceof SVGBase.Text) {
            render((SVGBase.Text) svgObject);
        }
        statePop();
    }

    private void renderChildren(SVGBase.SvgContainer svgContainer, boolean z) {
        if (z) {
            parentPush(svgContainer);
        }
        Iterator<SVGBase.SvgObject> it = svgContainer.getChildren().iterator();
        while (it.hasNext()) {
            render(it.next());
        }
        if (z) {
            parentPop();
        }
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
    private void renderMarker(SVGBase.Marker marker, MarkerVector markerVector) {
        float f;
        SVGBase.Box box;
        boolean pushLayer;
        float f2;
        float f3;
        float f4;
        statePush();
        Float f5 = marker.orient;
        float f6 = 0.0f;
        if (f5 != null) {
            if (Float.isNaN(f5.floatValue())) {
                float f7 = markerVector.dx;
                if (f7 != 0.0f || markerVector.dy != 0.0f) {
                    f = (float) Math.toDegrees(Math.atan2(markerVector.dy, f7));
                }
            } else {
                f = marker.orient.floatValue();
            }
            float floatValue = !marker.markerUnitsAreUser ? 1.0f : this.state.style.strokeWidth.floatValue(this.dpi);
            this.state = findInheritFromAncestorState(marker);
            Matrix matrix = new Matrix();
            matrix.preTranslate(markerVector.x, markerVector.y);
            matrix.preRotate(f);
            matrix.preScale(floatValue, floatValue);
            SVGBase.Length length = marker.refX;
            float floatValueX = length == null ? length.floatValueX(this) : 0.0f;
            SVGBase.Length length2 = marker.refY;
            float floatValueY = length2 == null ? length2.floatValueY(this) : 0.0f;
            SVGBase.Length length3 = marker.markerWidth;
            float floatValueX2 = length3 == null ? length3.floatValueX(this) : 3.0f;
            SVGBase.Length length4 = marker.markerHeight;
            float floatValueY2 = length4 != null ? length4.floatValueY(this) : 3.0f;
            box = marker.viewBox;
            if (box == null) {
                float f8 = floatValueX2 / box.width;
                float f9 = floatValueY2 / box.height;
                PreserveAspectRatio preserveAspectRatio = marker.preserveAspectRatio;
                if (preserveAspectRatio == null) {
                    preserveAspectRatio = PreserveAspectRatio.LETTERBOX;
                }
                if (!preserveAspectRatio.equals(PreserveAspectRatio.STRETCH)) {
                    f8 = preserveAspectRatio.getScale() == PreserveAspectRatio.Scale.slice ? Math.max(f8, f9) : Math.min(f8, f9);
                    f9 = f8;
                }
                matrix.preTranslate((-floatValueX) * f8, (-floatValueY) * f9);
                this.canvas.concat(matrix);
                SVGBase.Box box2 = marker.viewBox;
                float f10 = box2.width * f8;
                float f11 = box2.height * f9;
                int[] iArr = AnonymousClass1.$SwitchMap$net$pubnative$lite$sdk$utils$svgparser$PreserveAspectRatio$Alignment;
                switch (iArr[preserveAspectRatio.getAlignment().ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        f2 = (floatValueX2 - f10) / 2.0f;
                        f3 = 0.0f - f2;
                        break;
                    case 4:
                    case 5:
                    case 6:
                        f2 = floatValueX2 - f10;
                        f3 = 0.0f - f2;
                        break;
                    default:
                        f3 = 0.0f;
                        break;
                }
                int i = iArr[preserveAspectRatio.getAlignment().ordinal()];
                if (i != 2) {
                    if (i != 3) {
                        if (i != 5) {
                            if (i != 6) {
                                if (i != 7) {
                                }
                            }
                        }
                    }
                    f4 = floatValueY2 - f11;
                    f6 = 0.0f - f4;
                    if (!this.state.style.overflow.booleanValue()) {
                        setClipRect(f3, f6, floatValueX2, floatValueY2);
                    }
                    matrix.reset();
                    matrix.preScale(f8, f9);
                    this.canvas.concat(matrix);
                }
                f4 = (floatValueY2 - f11) / 2.0f;
                f6 = 0.0f - f4;
                if (!this.state.style.overflow.booleanValue()) {
                }
                matrix.reset();
                matrix.preScale(f8, f9);
                this.canvas.concat(matrix);
            } else {
                matrix.preTranslate(-floatValueX, -floatValueY);
                this.canvas.concat(matrix);
                if (!this.state.style.overflow.booleanValue()) {
                    setClipRect(0.0f, 0.0f, floatValueX2, floatValueY2);
                }
            }
            pushLayer = pushLayer();
            renderChildren(marker, false);
            if (pushLayer) {
                popLayer(marker);
            }
            statePop();
        }
        f = 0.0f;
        if (!marker.markerUnitsAreUser) {
        }
        this.state = findInheritFromAncestorState(marker);
        Matrix matrix2 = new Matrix();
        matrix2.preTranslate(markerVector.x, markerVector.y);
        matrix2.preRotate(f);
        matrix2.preScale(floatValue, floatValue);
        SVGBase.Length length5 = marker.refX;
        if (length5 == null) {
        }
        SVGBase.Length length22 = marker.refY;
        if (length22 == null) {
        }
        SVGBase.Length length32 = marker.markerWidth;
        if (length32 == null) {
        }
        SVGBase.Length length42 = marker.markerHeight;
        if (length42 != null) {
        }
        box = marker.viewBox;
        if (box == null) {
        }
        pushLayer = pushLayer();
        renderChildren(marker, false);
        if (pushLayer) {
        }
        statePop();
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
    private void renderMarkers(SVGBase.GraphicsElement graphicsElement) {
        SVGBase.Marker marker;
        String str;
        SVGBase.Marker marker2;
        String str2;
        SVGBase.Marker marker3;
        List<MarkerVector> markers;
        int size;
        int i;
        Style style = this.state.style;
        String str3 = style.markerStart;
        if (str3 == null && style.markerMid == null && style.markerEnd == null) {
            return;
        }
        if (str3 != null) {
            SVGBase.SvgObject resolveIRI = graphicsElement.document.resolveIRI(str3);
            if (resolveIRI != null) {
                marker = (SVGBase.Marker) resolveIRI;
                str = this.state.style.markerMid;
                if (str != null) {
                    SVGBase.SvgObject resolveIRI2 = graphicsElement.document.resolveIRI(str);
                    if (resolveIRI2 != null) {
                        marker2 = (SVGBase.Marker) resolveIRI2;
                        str2 = this.state.style.markerEnd;
                        if (str2 != null) {
                            SVGBase.SvgObject resolveIRI3 = graphicsElement.document.resolveIRI(str2);
                            if (resolveIRI3 != null) {
                                marker3 = (SVGBase.Marker) resolveIRI3;
                                markers = !(graphicsElement instanceof SVGBase.Path) ? new MarkerPositionCalculator(((SVGBase.Path) graphicsElement).d).getMarkers() : graphicsElement instanceof SVGBase.Line ? calculateMarkerPositions((SVGBase.Line) graphicsElement) : calculateMarkerPositions((SVGBase.PolyLine) graphicsElement);
                                if (markers == null && (size = markers.size()) != 0) {
                                    Style style2 = this.state.style;
                                    style2.markerEnd = null;
                                    style2.markerMid = null;
                                    style2.markerStart = null;
                                    if (marker != null) {
                                        renderMarker(marker, markers.get(0));
                                    }
                                    if (marker2 != null && markers.size() > 2) {
                                        MarkerVector markerVector = markers.get(0);
                                        MarkerVector markerVector2 = markers.get(1);
                                        i = 1;
                                        while (i < size - 1) {
                                            i++;
                                            MarkerVector markerVector3 = markers.get(i);
                                            markerVector = markerVector2.isAmbiguous ? realignMarkerMid(markerVector, markerVector2, markerVector3) : markerVector2;
                                            renderMarker(marker2, markerVector);
                                            markerVector2 = markerVector3;
                                        }
                                    }
                                    if (marker3 == null) {
                                        renderMarker(marker3, markers.get(size - 1));
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            error("Marker reference '%s' not found", this.state.style.markerEnd);
                        }
                        marker3 = null;
                        if (!(graphicsElement instanceof SVGBase.Path)) {
                        }
                        if (markers == null) {
                            return;
                        }
                        Style style22 = this.state.style;
                        style22.markerEnd = null;
                        style22.markerMid = null;
                        style22.markerStart = null;
                        if (marker != null) {
                        }
                        if (marker2 != null) {
                            MarkerVector markerVector4 = markers.get(0);
                            MarkerVector markerVector22 = markers.get(1);
                            i = 1;
                            while (i < size - 1) {
                            }
                        }
                        if (marker3 == null) {
                        }
                    } else {
                        error("Marker reference '%s' not found", this.state.style.markerMid);
                    }
                }
                marker2 = null;
                str2 = this.state.style.markerEnd;
                if (str2 != null) {
                }
                marker3 = null;
                if (!(graphicsElement instanceof SVGBase.Path)) {
                }
                if (markers == null) {
                }
            } else {
                error("Marker reference '%s' not found", this.state.style.markerStart);
            }
        }
        marker = null;
        str = this.state.style.markerMid;
        if (str != null) {
        }
        marker2 = null;
        str2 = this.state.style.markerEnd;
        if (str2 != null) {
        }
        marker3 = null;
        if (!(graphicsElement instanceof SVGBase.Path)) {
        }
        if (markers == null) {
        }
    }

    private void renderMask(SVGBase.Mask mask, SVGBase.SvgElement svgElement, SVGBase.Box box) {
        float f;
        float f2;
        debug("Mask render", new Object[0]);
        Boolean bool = mask.maskUnitsAreUser;
        if (bool == null || !bool.booleanValue()) {
            SVGBase.Length length = mask.width;
            float floatValue = length != null ? length.floatValue(this, 1.0f) : 1.2f;
            SVGBase.Length length2 = mask.height;
            float floatValue2 = length2 != null ? length2.floatValue(this, 1.0f) : 1.2f;
            f = floatValue * box.width;
            f2 = floatValue2 * box.height;
        } else {
            SVGBase.Length length3 = mask.width;
            f = length3 != null ? length3.floatValueX(this) : box.width;
            SVGBase.Length length4 = mask.height;
            f2 = length4 != null ? length4.floatValueY(this) : box.height;
        }
        if (f == 0.0f || f2 == 0.0f) {
            return;
        }
        statePush();
        RendererState findInheritFromAncestorState = findInheritFromAncestorState(mask);
        this.state = findInheritFromAncestorState;
        findInheritFromAncestorState.style.opacity = Float.valueOf(1.0f);
        boolean pushLayer = pushLayer();
        this.canvas.save();
        Boolean bool2 = mask.maskContentUnitsAreUser;
        if (bool2 != null && !bool2.booleanValue()) {
            this.canvas.translate(box.minX, box.minY);
            this.canvas.scale(box.width, box.height);
        }
        renderChildren(mask, false);
        this.canvas.restore();
        if (pushLayer) {
            popLayer(svgElement, box);
        }
        statePop();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void renderSwitchChild(SVGBase.Switch r9) {
        Set<String> systemLanguage;
        String language = Locale.getDefault().getLanguage();
        for (SVGBase.SvgObject svgObject : r9.getChildren()) {
            if (svgObject instanceof SVGBase.SvgConditional) {
                SVGBase.SvgConditional svgConditional = (SVGBase.SvgConditional) svgObject;
                if (svgConditional.getRequiredExtensions() == null && ((systemLanguage = svgConditional.getSystemLanguage()) == null || (!systemLanguage.isEmpty() && systemLanguage.contains(language)))) {
                    Set<String> requiredFeatures = svgConditional.getRequiredFeatures();
                    if (requiredFeatures != null) {
                        if (supportedFeatures == null) {
                            initialiseSupportedFeaturesMap();
                        }
                        if (!requiredFeatures.isEmpty() && supportedFeatures.containsAll(requiredFeatures)) {
                        }
                    }
                    Set<String> requiredFormats = svgConditional.getRequiredFormats();
                    if (requiredFormats != null) {
                        if (!requiredFormats.isEmpty() && this.externalFileResolver != null) {
                            Iterator<String> it = requiredFormats.iterator();
                            while (it.hasNext()) {
                                if (!this.externalFileResolver.isFormatSupported(it.next())) {
                                    break;
                                }
                            }
                        }
                    }
                    Set<String> requiredFonts = svgConditional.getRequiredFonts();
                    if (requiredFonts != null) {
                        if (!requiredFonts.isEmpty() && this.externalFileResolver != null) {
                            Iterator<String> it2 = requiredFonts.iterator();
                            while (it2.hasNext()) {
                                if (this.externalFileResolver.resolveFont(it2.next(), this.state.style.fontWeight.floatValue(), String.valueOf(this.state.style.fontStyle), this.state.style.fontStretch.floatValue()) == null) {
                                    break;
                                }
                            }
                        }
                    }
                    render(svgObject);
                    return;
                }
            }
        }
    }

    private void renderTextPath(SVGBase.TextPath textPath) {
        debug("TextPath render", new Object[0]);
        updateStyleForElement(this.state, textPath);
        if (display() && visible()) {
            selectTypefaceAndFontStyling();
            SVGBase.SvgObject resolveIRI = textPath.document.resolveIRI(textPath.href);
            if (resolveIRI == null) {
                error("TextPath reference '%s' not found", textPath.href);
                return;
            }
            SVGBase.Path path = (SVGBase.Path) resolveIRI;
            Path path2 = new PathConverter(path.d).getPath();
            Matrix matrix = path.transform;
            if (matrix != null) {
                path2.transform(matrix);
            }
            PathMeasure pathMeasure = new PathMeasure(path2, false);
            SVGBase.Length length = textPath.startOffset;
            float floatValue = length != null ? length.floatValue(this, pathMeasure.getLength()) : 0.0f;
            Style.TextAnchor anchorPosition = getAnchorPosition();
            if (anchorPosition != Style.TextAnchor.Start) {
                float calculateTextWidth = calculateTextWidth(textPath);
                if (anchorPosition == Style.TextAnchor.Middle) {
                    calculateTextWidth /= 2.0f;
                }
                floatValue -= calculateTextWidth;
            }
            checkForGradientsAndPatterns((SVGBase.SvgElement) textPath.getTextRoot());
            boolean pushLayer = pushLayer();
            enumerateTextSpans(textPath, new PathTextDrawer(path2, floatValue, 0.0f));
            if (pushLayer) {
                popLayer(textPath);
            }
        }
    }

    private boolean requiresCompositing() {
        if (this.state.style.opacity.floatValue() < 1.0f) {
            return true;
        }
        Style style = this.state.style;
        if (style.mask != null || style.isolation == Style.Isolation.isolate) {
            return true;
        }
        return SUPPORTS_BLEND_MODE && style.mixBlendMode != Style.CSSBlendMode.normal;
    }

    private void resetState() {
        this.state = new RendererState();
        this.stateStack = new Stack<>();
        updateStyle(this.state, Style.getDefaultStyle());
        RendererState rendererState = this.state;
        rendererState.viewPort = null;
        rendererState.spacePreserve = false;
        this.stateStack.push(new RendererState(rendererState));
        this.matrixStack = new Stack<>();
        this.parentStack = new Stack<>();
    }

    private void selectTypefaceAndFontStyling() {
        SVGExternalFileResolver sVGExternalFileResolver;
        List<String> list = this.state.style.fontFamily;
        Typeface typeface = null;
        if (list != null && this.document != null) {
            for (String str : list) {
                Style style = this.state.style;
                Typeface checkGenericFont = checkGenericFont(str, style.fontWeight, style.fontStyle);
                typeface = (checkGenericFont != null || (sVGExternalFileResolver = this.externalFileResolver) == null) ? checkGenericFont : sVGExternalFileResolver.resolveFont(str, this.state.style.fontWeight.floatValue(), String.valueOf(this.state.style.fontStyle), this.state.style.fontStretch.floatValue());
                if (typeface != null) {
                    break;
                }
            }
        }
        if (typeface == null) {
            Style style2 = this.state.style;
            typeface = checkGenericFont("serif", style2.fontWeight, style2.fontStyle);
        }
        this.state.fillPaint.setTypeface(typeface);
        this.state.strokePaint.setTypeface(typeface);
        if (SUPPORTS_PAINT_FONT_VARIATION_SETTINGS) {
            RendererState rendererState = this.state;
            rendererState.fontVariationSet.addSetting("wght", rendererState.style.fontWeight.floatValue());
            RendererState rendererState2 = this.state;
            Style.FontStyle fontStyle = rendererState2.style.fontStyle;
            if (fontStyle == Style.FontStyle.italic) {
                rendererState2.fontVariationSet.addSetting("ital", CSSFontVariationSettings.VARIATION_ITALIC_VALUE_ON.floatValue());
                this.state.fontVariationSet.addSetting("slnt", CSSFontVariationSettings.VARIATION_OBLIQUE_VALUE_ON.floatValue());
            } else if (fontStyle == Style.FontStyle.oblique) {
                rendererState2.fontVariationSet.addSetting("slnt", CSSFontVariationSettings.VARIATION_OBLIQUE_VALUE_ON.floatValue());
            }
            RendererState rendererState3 = this.state;
            rendererState3.fontVariationSet.addSetting("wdth", rendererState3.style.fontStretch.floatValue());
            String cSSFontVariationSettings = this.state.fontVariationSet.toString();
            debug("fontVariationSettings = " + cSSFontVariationSettings, new Object[0]);
            this.state.fillPaint.setFontVariationSettings(cSSFontVariationSettings);
            this.state.strokePaint.setFontVariationSettings(cSSFontVariationSettings);
        }
        if (SUPPORTS_PAINT_FONT_FEATURE_SETTINGS) {
            String cSSFontFeatureSettings = this.state.fontFeatureSet.toString();
            debug("fontFeatureSettings = " + cSSFontFeatureSettings, new Object[0]);
            this.state.fillPaint.setFontFeatureSettings(cSSFontFeatureSettings);
            this.state.strokePaint.setFontFeatureSettings(cSSFontFeatureSettings);
        }
    }

    private void setBlendMode(Paint paint) {
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
        debug("Setting blend mode to " + this.state.style.mixBlendMode, new Object[0]);
        switch (AnonymousClass1.$SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$Style$CSSBlendMode[this.state.style.mixBlendMode.ordinal()]) {
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

    private void setClipRect(float f, float f2, float f3, float f4) {
        float f5 = f3 + f;
        float f6 = f4 + f2;
        SVGBase.CSSClipRect cSSClipRect = this.state.style.clip;
        if (cSSClipRect != null) {
            f += cSSClipRect.left.floatValueX(this);
            f2 += this.state.style.clip.top.floatValueY(this);
            f5 -= this.state.style.clip.right.floatValueX(this);
            f6 -= this.state.style.clip.bottom.floatValueY(this);
        }
        this.canvas.clipRect(f, f2, f5, f6);
    }

    private void setPaintColour(RendererState rendererState, boolean z, SVGBase.SvgPaint svgPaint) {
        int i;
        float floatValue = (z ? rendererState.style.fillOpacity : rendererState.style.strokeOpacity).floatValue();
        if (svgPaint instanceof SVGBase.Colour) {
            i = ((SVGBase.Colour) svgPaint).colour;
        } else if (!(svgPaint instanceof SVGBase.CurrentColor)) {
            return;
        } else {
            i = rendererState.style.color.colour;
        }
        int colourWithOpacity = colourWithOpacity(i, floatValue);
        if (z) {
            rendererState.fillPaint.setColor(colourWithOpacity);
        } else {
            rendererState.strokePaint.setColor(colourWithOpacity);
        }
    }

    private void setSolidColor(boolean z, SVGBase.SolidColor solidColor) {
        if (z) {
            if (isSpecified(solidColor.baseStyle, 2147483648L)) {
                RendererState rendererState = this.state;
                Style style = rendererState.style;
                SVGBase.SvgPaint svgPaint = solidColor.baseStyle.solidColor;
                style.fill = svgPaint;
                rendererState.hasFill = svgPaint != null;
            }
            if (isSpecified(solidColor.baseStyle, 4294967296L)) {
                this.state.style.fillOpacity = solidColor.baseStyle.solidOpacity;
            }
            if (isSpecified(solidColor.baseStyle, 6442450944L)) {
                RendererState rendererState2 = this.state;
                setPaintColour(rendererState2, z, rendererState2.style.fill);
                return;
            }
            return;
        }
        if (isSpecified(solidColor.baseStyle, 2147483648L)) {
            RendererState rendererState3 = this.state;
            Style style2 = rendererState3.style;
            SVGBase.SvgPaint svgPaint2 = solidColor.baseStyle.solidColor;
            style2.stroke = svgPaint2;
            rendererState3.hasStroke = svgPaint2 != null;
        }
        if (isSpecified(solidColor.baseStyle, 4294967296L)) {
            this.state.style.strokeOpacity = solidColor.baseStyle.solidOpacity;
        }
        if (isSpecified(solidColor.baseStyle, 6442450944L)) {
            RendererState rendererState4 = this.state;
            setPaintColour(rendererState4, z, rendererState4.style.stroke);
        }
    }

    private void statePop() {
        this.canvas.restore();
        this.state = this.stateStack.pop();
    }

    private void statePush() {
        statePush(false);
    }

    private String textXMLSpaceTransform(String str, boolean z, boolean z2) {
        if (this.state.spacePreserve) {
            return PATTERN_TABS_OR_LINE_BREAKS.matcher(str).replaceAll(" ");
        }
        String replaceAll = PATTERN_LINE_BREAKS.matcher(PATTERN_TABS.matcher(str).replaceAll("")).replaceAll(" ");
        if (z) {
            replaceAll = PATTERN_START_SPACES.matcher(replaceAll).replaceAll("");
        }
        if (z2) {
            replaceAll = PATTERN_END_SPACES.matcher(replaceAll).replaceAll("");
        }
        return PATTERN_DOUBLE_SPACES.matcher(replaceAll).replaceAll(" ");
    }

    private void updateParentBoundingBox(SVGBase.SvgElement svgElement) {
        if (svgElement.parent == null || svgElement.boundingBox == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (this.matrixStack.peek().invert(matrix)) {
            SVGBase.Box box = svgElement.boundingBox;
            float f = box.minX;
            float f2 = box.minY;
            float maxX = box.maxX();
            SVGBase.Box box2 = svgElement.boundingBox;
            float f3 = box2.minY;
            float maxX2 = box2.maxX();
            float maxY = svgElement.boundingBox.maxY();
            SVGBase.Box box3 = svgElement.boundingBox;
            float[] fArr = {f, f2, maxX, f3, maxX2, maxY, box3.minX, box3.maxY()};
            matrix.preConcat(this.canvas.getMatrix());
            matrix.mapPoints(fArr);
            float f4 = fArr[0];
            float f5 = fArr[1];
            RectF rectF = new RectF(f4, f5, f4, f5);
            for (int i = 2; i <= 6; i += 2) {
                float f6 = fArr[i];
                if (f6 < rectF.left) {
                    rectF.left = f6;
                }
                if (f6 > rectF.right) {
                    rectF.right = f6;
                }
                float f7 = fArr[i + 1];
                if (f7 < rectF.top) {
                    rectF.top = f7;
                }
                if (f7 > rectF.bottom) {
                    rectF.bottom = f7;
                }
            }
            SVGBase.SvgElement svgElement2 = (SVGBase.SvgElement) this.parentStack.peek();
            SVGBase.Box box4 = svgElement2.boundingBox;
            if (box4 == null) {
                svgElement2.boundingBox = SVGBase.Box.fromLimits(rectF.left, rectF.top, rectF.right, rectF.bottom);
            } else {
                box4.union(SVGBase.Box.fromLimits(rectF.left, rectF.top, rectF.right, rectF.bottom));
            }
        }
    }

    private void updateStyle(RendererState rendererState, Style style) {
        if (isSpecified(style, 4096L)) {
            rendererState.style.color = style.color;
        }
        if (isSpecified(style, 2048L)) {
            rendererState.style.opacity = style.opacity;
        }
        if (isSpecified(style, 1L)) {
            rendererState.style.fill = style.fill;
            SVGBase.SvgPaint svgPaint = style.fill;
            rendererState.hasFill = (svgPaint == null || svgPaint == SVGBase.Colour.TRANSPARENT) ? false : true;
        }
        if (isSpecified(style, 4L)) {
            rendererState.style.fillOpacity = style.fillOpacity;
        }
        if (isSpecified(style, 6149L)) {
            setPaintColour(rendererState, true, rendererState.style.fill);
        }
        if (isSpecified(style, 2L)) {
            rendererState.style.fillRule = style.fillRule;
        }
        if (isSpecified(style, 8L)) {
            rendererState.style.stroke = style.stroke;
            SVGBase.SvgPaint svgPaint2 = style.stroke;
            rendererState.hasStroke = (svgPaint2 == null || svgPaint2 == SVGBase.Colour.TRANSPARENT) ? false : true;
        }
        if (isSpecified(style, 16L)) {
            rendererState.style.strokeOpacity = style.strokeOpacity;
        }
        if (isSpecified(style, 6168L)) {
            setPaintColour(rendererState, false, rendererState.style.stroke);
        }
        if (isSpecified(style, 34359738368L)) {
            rendererState.style.vectorEffect = style.vectorEffect;
        }
        if (isSpecified(style, 32L)) {
            Style style2 = rendererState.style;
            SVGBase.Length length = style.strokeWidth;
            style2.strokeWidth = length;
            rendererState.strokePaint.setStrokeWidth(length.floatValue(this));
        }
        if (isSpecified(style, 64L)) {
            rendererState.style.strokeLineCap = style.strokeLineCap;
            int i = AnonymousClass1.$SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$Style$LineCap[style.strokeLineCap.ordinal()];
            if (i == 1) {
                rendererState.strokePaint.setStrokeCap(Paint.Cap.BUTT);
            } else if (i == 2) {
                rendererState.strokePaint.setStrokeCap(Paint.Cap.ROUND);
            } else if (i == 3) {
                rendererState.strokePaint.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (isSpecified(style, 128L)) {
            rendererState.style.strokeLineJoin = style.strokeLineJoin;
            int i2 = AnonymousClass1.$SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$Style$LineJoin[style.strokeLineJoin.ordinal()];
            if (i2 == 1) {
                rendererState.strokePaint.setStrokeJoin(Paint.Join.MITER);
            } else if (i2 == 2) {
                rendererState.strokePaint.setStrokeJoin(Paint.Join.ROUND);
            } else if (i2 == 3) {
                rendererState.strokePaint.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (isSpecified(style, 256L)) {
            rendererState.style.strokeMiterLimit = style.strokeMiterLimit;
            rendererState.strokePaint.setStrokeMiter(style.strokeMiterLimit.floatValue());
        }
        if (isSpecified(style, 512L)) {
            rendererState.style.strokeDashArray = style.strokeDashArray;
        }
        if (isSpecified(style, 1024L)) {
            rendererState.style.strokeDashOffset = style.strokeDashOffset;
        }
        if (isSpecified(style, 1536L)) {
            SVGBase.Length[] lengthArr = rendererState.style.strokeDashArray;
            if (lengthArr == null) {
                rendererState.strokePaint.setPathEffect(null);
            } else {
                int length2 = lengthArr.length;
                int i3 = length2 % 2 == 0 ? length2 : length2 * 2;
                float[] fArr = new float[i3];
                float f = 0.0f;
                for (int i4 = 0; i4 < i3; i4++) {
                    float floatValue = rendererState.style.strokeDashArray[i4 % length2].floatValue(this);
                    fArr[i4] = floatValue;
                    f += floatValue;
                }
                if (f == 0.0f) {
                    rendererState.strokePaint.setPathEffect(null);
                } else {
                    float floatValue2 = rendererState.style.strokeDashOffset.floatValue(this);
                    if (floatValue2 < 0.0f) {
                        floatValue2 = (floatValue2 % f) + f;
                    }
                    rendererState.strokePaint.setPathEffect(new DashPathEffect(fArr, floatValue2));
                }
            }
        }
        if (isSpecified(style, 16384L)) {
            float currentFontSize = getCurrentFontSize();
            rendererState.style.fontSize = style.fontSize;
            rendererState.fillPaint.setTextSize(style.fontSize.floatValue(this, currentFontSize));
            rendererState.strokePaint.setTextSize(style.fontSize.floatValue(this, currentFontSize));
        }
        if (isSpecified(style, 8192L)) {
            rendererState.style.fontFamily = style.fontFamily;
        }
        if (isSpecified(style, 32768L)) {
            if (style.fontWeight.floatValue() == Float.MIN_VALUE) {
                float floatValue3 = rendererState.style.fontWeight.floatValue();
                if (floatValue3 >= 100.0f && floatValue3 < 550.0f) {
                    rendererState.style.fontWeight = Float.valueOf(100.0f);
                } else if (floatValue3 >= 550.0f && floatValue3 < 750.0f) {
                    rendererState.style.fontWeight = Float.valueOf(400.0f);
                } else if (floatValue3 >= 750.0f) {
                    rendererState.style.fontWeight = Float.valueOf(700.0f);
                }
            } else if (style.fontWeight.floatValue() == Float.MAX_VALUE) {
                float floatValue4 = rendererState.style.fontWeight.floatValue();
                if (floatValue4 < 350.0f) {
                    rendererState.style.fontWeight = Float.valueOf(400.0f);
                } else if (floatValue4 >= 350.0f && floatValue4 < 550.0f) {
                    rendererState.style.fontWeight = Float.valueOf(700.0f);
                } else if (floatValue4 >= 550.0f && floatValue4 < 900.0f) {
                    rendererState.style.fontWeight = Float.valueOf(900.0f);
                }
            } else {
                rendererState.style.fontWeight = style.fontWeight;
            }
        }
        if (isSpecified(style, 65536L)) {
            rendererState.style.fontStyle = style.fontStyle;
        }
        if (isSpecified(style, 2251799813685248L)) {
            rendererState.style.fontStretch = style.fontStretch;
        }
        if (isSpecified(style, 131072L)) {
            rendererState.style.textDecoration = style.textDecoration;
            Paint paint = rendererState.fillPaint;
            Style.TextDecoration textDecoration = style.textDecoration;
            Style.TextDecoration textDecoration2 = Style.TextDecoration.LineThrough;
            paint.setStrikeThruText(textDecoration == textDecoration2);
            Paint paint2 = rendererState.fillPaint;
            Style.TextDecoration textDecoration3 = style.textDecoration;
            Style.TextDecoration textDecoration4 = Style.TextDecoration.Underline;
            paint2.setUnderlineText(textDecoration3 == textDecoration4);
            if (SUPPORTS_STROKED_UNDERLINES) {
                rendererState.strokePaint.setStrikeThruText(style.textDecoration == textDecoration2);
                rendererState.strokePaint.setUnderlineText(style.textDecoration == textDecoration4);
            }
        }
        if (isSpecified(style, 68719476736L)) {
            rendererState.style.direction = style.direction;
        }
        if (isSpecified(style, 262144L)) {
            rendererState.style.textAnchor = style.textAnchor;
        }
        if (isSpecified(style, 524288L)) {
            rendererState.style.overflow = style.overflow;
        }
        if (isSpecified(style, CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE)) {
            rendererState.style.markerStart = style.markerStart;
        }
        if (isSpecified(style, 4194304L)) {
            rendererState.style.markerMid = style.markerMid;
        }
        if (isSpecified(style, 8388608L)) {
            rendererState.style.markerEnd = style.markerEnd;
        }
        if (isSpecified(style, 16777216L)) {
            rendererState.style.display = style.display;
        }
        if (isSpecified(style, 33554432L)) {
            rendererState.style.visibility = style.visibility;
        }
        if (isSpecified(style, 1048576L)) {
            rendererState.style.clip = style.clip;
        }
        if (isSpecified(style, 268435456L)) {
            rendererState.style.clipPath = style.clipPath;
        }
        if (isSpecified(style, 536870912L)) {
            rendererState.style.clipRule = style.clipRule;
        }
        if (isSpecified(style, 1073741824L)) {
            rendererState.style.mask = style.mask;
        }
        if (isSpecified(style, 67108864L)) {
            rendererState.style.stopColor = style.stopColor;
        }
        if (isSpecified(style, 134217728L)) {
            rendererState.style.stopOpacity = style.stopOpacity;
        }
        if (isSpecified(style, 8589934592L)) {
            rendererState.style.viewportFill = style.viewportFill;
        }
        if (isSpecified(style, 17179869184L)) {
            rendererState.style.viewportFillOpacity = style.viewportFillOpacity;
        }
        if (isSpecified(style, 137438953472L)) {
            rendererState.style.imageRendering = style.imageRendering;
        }
        if (isSpecified(style, 274877906944L)) {
            rendererState.style.isolation = style.isolation;
        }
        if (isSpecified(style, 549755813888L)) {
            rendererState.style.mixBlendMode = style.mixBlendMode;
        }
        if (isSpecified(style, 562949953421312L)) {
            rendererState.style.fontKerning = style.fontKerning;
            rendererState.fontFeatureSet.applyKerning(style.fontKerning);
        }
        if (isSpecified(style, 35184372088832L)) {
            rendererState.style.fontFeatureSettings = style.fontFeatureSettings;
            rendererState.fontFeatureSet.applySettings(style.fontFeatureSettings);
        }
        if (isSpecified(style, 1099511627776L)) {
            rendererState.style.fontVariantLigatures = style.fontVariantLigatures;
            rendererState.fontFeatureSet.applySettings(style.fontVariantLigatures);
        }
        if (isSpecified(style, 2199023255552L)) {
            rendererState.style.fontVariantPosition = style.fontVariantPosition;
            rendererState.fontFeatureSet.applySettings(style.fontVariantPosition);
        }
        if (isSpecified(style, 4398046511104L)) {
            rendererState.style.fontVariantCaps = style.fontVariantCaps;
            rendererState.fontFeatureSet.applySettings(style.fontVariantCaps);
        }
        if (isSpecified(style, 8796093022208L)) {
            rendererState.style.fontVariantNumeric = style.fontVariantNumeric;
            rendererState.fontFeatureSet.applySettings(style.fontVariantNumeric);
        }
        if (isSpecified(style, 17592186044416L)) {
            rendererState.style.fontVariantEastAsian = style.fontVariantEastAsian;
            rendererState.fontFeatureSet.applySettings(style.fontVariantEastAsian);
        }
        if (SUPPORTS_PAINT_FONT_VARIATION_SETTINGS && isSpecified(style, 1125899906842624L)) {
            rendererState.style.fontVariationSettings = style.fontVariationSettings;
            rendererState.fontVariationSet.applySettings(style.fontVariationSettings);
        }
        if (isSpecified(style, 70368744177664L)) {
            rendererState.style.writingMode = style.writingMode;
        }
        if (isSpecified(style, 140737488355328L)) {
            rendererState.style.glyphOrientationVertical = style.glyphOrientationVertical;
        }
        if (isSpecified(style, 281474976710656L)) {
            rendererState.style.textOrientation = style.textOrientation;
        }
        if (isSpecified(style, 4503599627370496L)) {
            rendererState.style.letterSpacing = style.letterSpacing;
            if (SUPPORTS_PAINT_LETTER_SPACING) {
                rendererState.fillPaint.setLetterSpacing(style.letterSpacing.floatValue(this) / getCurrentFontSize());
                rendererState.strokePaint.setLetterSpacing(style.letterSpacing.floatValue(this) / getCurrentFontSize());
            }
        }
        if (isSpecified(style, 9007199254740992L)) {
            rendererState.style.wordSpacing = style.wordSpacing;
            if (SUPPORTS_PAINT_WORD_SPACING) {
                rendererState.fillPaint.setWordSpacing(style.wordSpacing.floatValue(this));
                rendererState.strokePaint.setWordSpacing(style.wordSpacing.floatValue(this));
            }
        }
    }

    private void updateStyleForElement(RendererState rendererState, SVGBase.SvgElementBase svgElementBase) {
        rendererState.style.resetNonInheritingProperties(svgElementBase.parent == null);
        Style style = svgElementBase.baseStyle;
        if (style != null) {
            updateStyle(rendererState, style);
        }
        if (this.document.hasCSSRules()) {
            for (CSSParser.Rule rule : this.document.getCSSRules()) {
                if (CSSParser.ruleMatch(this.ruleMatchContext, rule.selector, svgElementBase)) {
                    updateStyle(rendererState, rule.style);
                }
            }
        }
        Style style2 = svgElementBase.style;
        if (style2 != null) {
            updateStyle(rendererState, style2);
        }
    }

    private void viewportFill() {
        int i;
        Style style = this.state.style;
        SVGBase.SvgPaint svgPaint = style.viewportFill;
        if (svgPaint instanceof SVGBase.Colour) {
            i = ((SVGBase.Colour) svgPaint).colour;
        } else if (!(svgPaint instanceof SVGBase.CurrentColor)) {
            return;
        } else {
            i = style.color.colour;
        }
        Float f = style.viewportFillOpacity;
        if (f != null) {
            i = colourWithOpacity(i, f.floatValue());
        }
        this.canvas.drawColor(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean visible() {
        Boolean bool = this.state.style.visibility;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void warn(String str, Object... objArr) {
        Log.w(TAG, String.format(str, objArr));
    }

    float getCurrentFontSize() {
        return this.state.fillPaint.getTextSize();
    }

    float getCurrentFontXHeight() {
        return this.state.fillPaint.getTextSize() / 2.0f;
    }

    float getDPI() {
        return this.dpi;
    }

    SVGBase.Box getEffectiveViewPortInUserUnits() {
        RendererState rendererState = this.state;
        SVGBase.Box box = rendererState.viewBox;
        return box != null ? box : rendererState.viewPort;
    }

    void renderDocument(SVGBase sVGBase, RenderOptionsBase renderOptionsBase) {
        SVGBase.Box box;
        PreserveAspectRatio preserveAspectRatio;
        if (renderOptionsBase == null) {
            throw new NullPointerException("renderOptions shouldn't be null");
        }
        this.document = sVGBase;
        SVGBase.Svg rootElement = sVGBase.getRootElement();
        if (rootElement == null) {
            warn("Nothing to render. Document is empty.", new Object[0]);
            return;
        }
        if (renderOptionsBase.hasView()) {
            SVGBase.SvgElementBase elementById = this.document.getElementById(renderOptionsBase.viewId);
            if (!(elementById instanceof SVGBase.View)) {
                Log.w(TAG, String.format("View element with id \"%s\" not found.", renderOptionsBase.viewId));
                return;
            }
            SVGBase.View view = (SVGBase.View) elementById;
            box = view.viewBox;
            if (box == null) {
                Log.w(TAG, String.format("View element with id \"%s\" is missing a viewBox attribute.", renderOptionsBase.viewId));
                return;
            }
            preserveAspectRatio = view.preserveAspectRatio;
        } else {
            box = renderOptionsBase.hasViewBox() ? renderOptionsBase.viewBox : rootElement.viewBox;
            preserveAspectRatio = renderOptionsBase.hasPreserveAspectRatio() ? renderOptionsBase.preserveAspectRatio : rootElement.preserveAspectRatio;
        }
        if (renderOptionsBase.hasCss()) {
            if (renderOptionsBase.css != null) {
                sVGBase.addCSSRules(new CSSParser(CSSParser.Source.RenderOptions, this.externalFileResolver).parse(renderOptionsBase.css));
            } else {
                CSSParser.Ruleset ruleset = renderOptionsBase.cssRuleset;
                if (ruleset != null) {
                    sVGBase.addCSSRules(ruleset);
                }
            }
        }
        if (renderOptionsBase.hasTarget()) {
            CSSParser.RuleMatchContext ruleMatchContext = new CSSParser.RuleMatchContext();
            this.ruleMatchContext = ruleMatchContext;
            ruleMatchContext.targetElement = sVGBase.getElementById(renderOptionsBase.targetId);
        }
        resetState();
        checkXMLSpaceAttribute(rootElement);
        statePush(true);
        SVGBase.Box box2 = new SVGBase.Box(renderOptionsBase.viewPort);
        SVGBase.Length length = rootElement.width;
        if (length != null) {
            box2.width = length.floatValue(this, box2.width);
        }
        SVGBase.Length length2 = rootElement.height;
        if (length2 != null) {
            box2.height = length2.floatValue(this, box2.height);
        }
        render(rootElement, box2, box, preserveAspectRatio);
        statePop();
        if (renderOptionsBase.hasCss()) {
            sVGBase.clearRenderCSSRules();
        }
    }

    private void checkForClipPath(SVGBase.SvgElement svgElement, SVGBase.Box box) {
        if (this.state.style.clipPath == null) {
            return;
        }
        if (!SUPPORTS_PATH_OP) {
            checkForClipPath_OldStyle(svgElement, box);
            return;
        }
        Path calculateClipPath = calculateClipPath(svgElement, box);
        if (calculateClipPath != null) {
            this.canvas.clipPath(calculateClipPath);
        }
    }

    private void popLayer(SVGBase.SvgElement svgElement, SVGBase.Box box) {
        if (this.state.style.mask != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            canvasSaveLayer(this.canvas, null, paint);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            canvasSaveLayer(this.canvas, null, paint2);
            SVGBase.Mask mask = (SVGBase.Mask) this.document.resolveIRI(this.state.style.mask);
            renderMask(mask, svgElement, box);
            this.canvas.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            canvasSaveLayer(this.canvas, null, paint3);
            renderMask(mask, svgElement, box);
            this.canvas.restore();
            this.canvas.restore();
        }
        statePop();
    }

    private boolean pushLayer(float f) {
        if (!requiresCompositing() && f == 1.0f) {
            return false;
        }
        Paint paint = new Paint();
        paint.setAlpha(clamp255(this.state.style.opacity.floatValue() * f));
        if (SUPPORTS_BLEND_MODE && this.state.style.mixBlendMode != Style.CSSBlendMode.normal) {
            setBlendMode(paint);
        }
        canvasSaveLayer(this.canvas, null, paint);
        this.stateStack.push(this.state);
        RendererState rendererState = new RendererState(this.state);
        this.state = rendererState;
        String str = rendererState.style.mask;
        if (str != null && !(this.document.resolveIRI(str) instanceof SVGBase.Mask)) {
            error("Mask reference '%s' not found", this.state.style.mask);
            this.state.style.mask = null;
        }
        return true;
    }

    private void statePush(boolean z) {
        if (z) {
            canvasSaveLayer(this.canvas, null, null);
        } else {
            this.canvas.save();
        }
        this.stateStack.push(this.state);
        this.state = new RendererState(this.state);
    }

    private class TextWidthCalculator extends TextProcessor {
        float x;

        private TextWidthCalculator() {
            super(null);
            this.x = 0.0f;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGAndroidRenderer.TextProcessor
        public void processText(String str) {
            float f = this.x;
            SVGAndroidRenderer sVGAndroidRenderer = SVGAndroidRenderer.this;
            this.x = f + sVGAndroidRenderer.measureText(str, sVGAndroidRenderer.state.fillPaint);
        }

        /* synthetic */ TextWidthCalculator(SVGAndroidRenderer sVGAndroidRenderer, AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    private RendererState findInheritFromAncestorState(SVGBase.SvgObject svgObject, RendererState rendererState) {
        int i;
        ArrayList arrayList = new ArrayList();
        while (true) {
            i = 0;
            if (svgObject instanceof SVGBase.SvgElementBase) {
                arrayList.add(0, (SVGBase.SvgElementBase) svgObject);
            }
            Object obj = svgObject.parent;
            if (obj == null) {
                break;
            }
            svgObject = (SVGBase.SvgObject) obj;
        }
        int size = arrayList.size();
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            updateStyleForElement(rendererState, (SVGBase.SvgElementBase) obj2);
        }
        RendererState rendererState2 = this.state;
        rendererState.viewBox = rendererState2.viewBox;
        rendererState.viewPort = rendererState2.viewPort;
        return rendererState;
    }

    private List<MarkerVector> calculateMarkerPositions(SVGBase.PolyLine polyLine) {
        float[] fArr = polyLine.points;
        int length = fArr != null ? fArr.length : 0;
        int i = 2;
        if (length < 2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        float[] fArr2 = polyLine.points;
        float f = 0.0f;
        MarkerVector markerVector = new MarkerVector(fArr2[0], fArr2[1], 0.0f, 0.0f);
        float f2 = 0.0f;
        while (i < length) {
            float[] fArr3 = polyLine.points;
            f = fArr3[i];
            f2 = fArr3[i + 1];
            markerVector.add(f, f2);
            arrayList.add(markerVector);
            i += 2;
            markerVector = new MarkerVector(f, f2, f - markerVector.x, f2 - markerVector.y);
        }
        if (polyLine instanceof SVGBase.Polygon) {
            float[] fArr4 = polyLine.points;
            float f3 = fArr4[0];
            if (f != f3) {
                float f4 = fArr4[1];
                if (f2 != f4) {
                    markerVector.add(f3, f4);
                    arrayList.add(markerVector);
                    MarkerVector markerVector2 = new MarkerVector(f3, f4, f3 - markerVector.x, f4 - markerVector.y);
                    markerVector2.add((MarkerVector) arrayList.get(0));
                    arrayList.add(markerVector2);
                    arrayList.set(0, markerVector2);
                }
            }
            return arrayList;
        }
        arrayList.add(markerVector);
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Path makePathAndBoundingBox(SVGBase.Rect rect) {
        float floatValueX;
        float floatValueY;
        float min;
        float floatValueX2;
        float floatValueY2;
        float f;
        float f2;
        Path path;
        Path path2;
        SVGBase.Length length = rect.rx;
        if (length == null && rect.ry == null) {
            floatValueY = 0.0f;
        } else if (length == null) {
            floatValueY = rect.ry.floatValueY(this);
        } else if (rect.ry == null) {
            floatValueY = length.floatValueX(this);
        } else {
            floatValueX = length.floatValueX(this);
            floatValueY = rect.ry.floatValueY(this);
            min = Math.min(floatValueX, rect.width.floatValueX(this) / 2.0f);
            float min2 = Math.min(floatValueY, rect.height.floatValueY(this) / 2.0f);
            SVGBase.Length length2 = rect.x;
            floatValueX2 = length2 == null ? length2.floatValueX(this) : 0.0f;
            SVGBase.Length length3 = rect.y;
            floatValueY2 = length3 == null ? length3.floatValueY(this) : 0.0f;
            float floatValueX3 = rect.width.floatValueX(this);
            float floatValueY3 = rect.height.floatValueY(this);
            if (rect.boundingBox == null) {
                rect.boundingBox = new SVGBase.Box(floatValueX2, floatValueY2, floatValueX3, floatValueY3);
            }
            f = floatValueX2 + floatValueX3;
            f2 = floatValueY2 + floatValueY3;
            path = new Path();
            if (min == 0.0f && min2 != 0.0f) {
                float f3 = min * BEZIER_ARC_FACTOR;
                float f4 = BEZIER_ARC_FACTOR * min2;
                float f5 = floatValueY2 + min2;
                path.moveTo(floatValueX2, f5);
                float f6 = f5 - f4;
                float f7 = floatValueX2 + min;
                float f8 = f7 - f3;
                path.cubicTo(floatValueX2, f6, f8, floatValueY2, f7, floatValueY2);
                float f9 = f - min;
                path.lineTo(f9, floatValueY2);
                float f10 = f9 + f3;
                path.cubicTo(f10, floatValueY2, f, f6, f, f5);
                float f11 = f2 - min2;
                path.lineTo(f, f11);
                float f12 = f11 + f4;
                path2 = path;
                path.cubicTo(f, f12, f10, f2, f9, f2);
                path2.lineTo(f7, f2);
                path2.cubicTo(f8, f2, floatValueX2, f12, floatValueX2, f11);
                path2.lineTo(floatValueX2, f5);
            } else {
                path2 = path;
                path2.moveTo(floatValueX2, floatValueY2);
                path2.lineTo(f, floatValueY2);
                path2.lineTo(f, f2);
                path2.lineTo(floatValueX2, f2);
                path2.lineTo(floatValueX2, floatValueY2);
            }
            path2.close();
            return path2;
        }
        floatValueX = floatValueY;
        min = Math.min(floatValueX, rect.width.floatValueX(this) / 2.0f);
        float min22 = Math.min(floatValueY, rect.height.floatValueY(this) / 2.0f);
        SVGBase.Length length22 = rect.x;
        if (length22 == null) {
        }
        SVGBase.Length length32 = rect.y;
        if (length32 == null) {
        }
        float floatValueX32 = rect.width.floatValueX(this);
        float floatValueY32 = rect.height.floatValueY(this);
        if (rect.boundingBox == null) {
        }
        f = floatValueX2 + floatValueX32;
        f2 = floatValueY2 + floatValueY32;
        path = new Path();
        if (min == 0.0f) {
        }
        path2 = path;
        path2.moveTo(floatValueX2, floatValueY2);
        path2.lineTo(f, floatValueY2);
        path2.lineTo(f, f2);
        path2.lineTo(floatValueX2, f2);
        path2.lineTo(floatValueX2, floatValueY2);
        path2.close();
        return path2;
    }

    private static class MarkerVector {
        float dx;
        float dy;
        boolean isAmbiguous = false;
        final float x;
        final float y;

        MarkerVector(float f, float f2, float f3, float f4) {
            this.dx = 0.0f;
            this.dy = 0.0f;
            this.x = f;
            this.y = f2;
            double sqrt = Math.sqrt((f3 * f3) + (f4 * f4));
            if (sqrt != 0.0d) {
                this.dx = (float) (f3 / sqrt);
                this.dy = (float) (f4 / sqrt);
            }
        }

        void add(float f, float f2) {
            float f3 = f - this.x;
            float f4 = f2 - this.y;
            double sqrt = Math.sqrt((f3 * f3) + (f4 * f4));
            if (sqrt != 0.0d) {
                f3 = (float) (f3 / sqrt);
                f4 = (float) (f4 / sqrt);
            }
            float f5 = this.dx;
            if (f3 != (-f5) || f4 != (-this.dy)) {
                this.dx = f5 + f3;
                this.dy += f4;
            } else {
                this.isAmbiguous = true;
                this.dx = -f4;
                this.dy = f3;
            }
        }

        public String toString() {
            return "(" + this.x + StringUtils.COMMA + this.y + " " + this.dx + StringUtils.COMMA + this.dy + ")";
        }

        void add(MarkerVector markerVector) {
            float f = markerVector.dx;
            float f2 = this.dx;
            if (f == (-f2)) {
                float f3 = markerVector.dy;
                if (f3 == (-this.dy)) {
                    this.isAmbiguous = true;
                    this.dx = -f3;
                    this.dy = markerVector.dx;
                    return;
                }
            }
            this.dx = f2 + f;
            this.dy += markerVector.dy;
        }
    }

    public static class RendererState {
        final Paint fillPaint;
        final CSSFontFeatureSettings fontFeatureSet;
        final CSSFontVariationSettings fontVariationSet;
        boolean hasFill;
        boolean hasStroke;
        boolean spacePreserve;
        final Paint strokePaint;
        Style style;
        SVGBase.Box viewBox;
        SVGBase.Box viewPort;

        RendererState() {
            Paint paint = new Paint();
            this.fillPaint = paint;
            paint.setFlags(193);
            if (SVGAndroidRenderer.SUPPORTS_FONT_HINTING) {
                paint.setHinting(0);
            }
            paint.setStyle(Paint.Style.FILL);
            Typeface typeface = Typeface.DEFAULT;
            paint.setTypeface(typeface);
            Paint paint2 = new Paint();
            this.strokePaint = paint2;
            paint2.setFlags(193);
            if (SVGAndroidRenderer.SUPPORTS_FONT_HINTING) {
                paint2.setHinting(0);
            }
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setTypeface(typeface);
            this.fontFeatureSet = new CSSFontFeatureSettings();
            this.fontVariationSet = new CSSFontVariationSettings();
            this.style = Style.getDefaultStyle();
        }

        RendererState(RendererState rendererState) {
            this.hasFill = rendererState.hasFill;
            this.hasStroke = rendererState.hasStroke;
            this.fillPaint = new Paint(rendererState.fillPaint);
            this.strokePaint = new Paint(rendererState.strokePaint);
            SVGBase.Box box = rendererState.viewPort;
            if (box != null) {
                this.viewPort = new SVGBase.Box(box);
            }
            SVGBase.Box box2 = rendererState.viewBox;
            if (box2 != null) {
                this.viewBox = new SVGBase.Box(box2);
            }
            this.spacePreserve = rendererState.spacePreserve;
            this.fontFeatureSet = new CSSFontFeatureSettings(rendererState.fontFeatureSet);
            this.fontVariationSet = new CSSFontVariationSettings(rendererState.fontVariationSet);
            try {
                this.style = (Style) rendererState.style.clone();
            } catch (CloneNotSupportedException e) {
                Log.e(SVGAndroidRenderer.TAG, "Unexpected clone error", e);
                this.style = Style.getDefaultStyle();
            }
        }
    }

    private void addObjectToClip(SVGBase.Path path, Path path2, Matrix matrix) {
        updateStyleForElement(this.state, path);
        if (display() && visible()) {
            Matrix matrix2 = path.transform;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            Path path3 = new PathConverter(path.d).getPath();
            if (path.boundingBox == null) {
                path.boundingBox = calculatePathBounds(path3);
            }
            checkForClipPath(path);
            path2.setFillType(getClipRuleFromState());
            path2.addPath(path3, matrix);
        }
    }

    private void fillInChainedGradientFields(SVGBase.SvgLinearGradient svgLinearGradient, SVGBase.SvgLinearGradient svgLinearGradient2) {
        if (svgLinearGradient.x1 == null) {
            svgLinearGradient.x1 = svgLinearGradient2.x1;
        }
        if (svgLinearGradient.y1 == null) {
            svgLinearGradient.y1 = svgLinearGradient2.y1;
        }
        if (svgLinearGradient.x2 == null) {
            svgLinearGradient.x2 = svgLinearGradient2.x2;
        }
        if (svgLinearGradient.y2 == null) {
            svgLinearGradient.y2 = svgLinearGradient2.y2;
        }
    }

    private void render(SVGBase.Svg svg) {
        render(svg, makeViewPort(svg.x, svg.y, svg.width, svg.height), svg.viewBox, svg.preserveAspectRatio);
    }

    private void render(SVGBase.Svg svg, SVGBase.Box box) {
        render(svg, box, svg.viewBox, svg.preserveAspectRatio);
    }

    private void render(SVGBase.Svg svg, SVGBase.Box box, SVGBase.Box box2, PreserveAspectRatio preserveAspectRatio) {
        debug("Svg render", new Object[0]);
        if (box.width == 0.0f || box.height == 0.0f) {
            return;
        }
        if (preserveAspectRatio == null && (preserveAspectRatio = svg.preserveAspectRatio) == null) {
            preserveAspectRatio = PreserveAspectRatio.LETTERBOX;
        }
        updateStyleForElement(this.state, svg);
        if (display()) {
            RendererState rendererState = this.state;
            rendererState.viewPort = box;
            if (!rendererState.style.overflow.booleanValue()) {
                SVGBase.Box box3 = this.state.viewPort;
                setClipRect(box3.minX, box3.minY, box3.width, box3.height);
            }
            checkForClipPath(svg, this.state.viewPort);
            if (box2 != null) {
                this.canvas.concat(calculateViewBoxTransform(this.state.viewPort, box2, preserveAspectRatio));
                this.state.viewBox = svg.viewBox;
            } else {
                Canvas canvas = this.canvas;
                SVGBase.Box box4 = this.state.viewPort;
                canvas.translate(box4.minX, box4.minY);
                this.state.viewBox = null;
            }
            boolean pushLayer = pushLayer();
            viewportFill();
            renderChildren(svg, true);
            if (pushLayer) {
                popLayer(svg);
            }
            updateParentBoundingBox(svg);
        }
    }

    private void addObjectToClip(SVGBase.GraphicsElement graphicsElement, Path path, Matrix matrix) {
        Path makePathAndBoundingBox;
        updateStyleForElement(this.state, graphicsElement);
        if (display() && visible()) {
            Matrix matrix2 = graphicsElement.transform;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            if (graphicsElement instanceof SVGBase.Rect) {
                makePathAndBoundingBox = makePathAndBoundingBox((SVGBase.Rect) graphicsElement);
            } else if (graphicsElement instanceof SVGBase.Circle) {
                makePathAndBoundingBox = makePathAndBoundingBox((SVGBase.Circle) graphicsElement);
            } else if (graphicsElement instanceof SVGBase.Ellipse) {
                makePathAndBoundingBox = makePathAndBoundingBox((SVGBase.Ellipse) graphicsElement);
            } else if (!(graphicsElement instanceof SVGBase.PolyLine)) {
                return;
            } else {
                makePathAndBoundingBox = makePathAndBoundingBox((SVGBase.PolyLine) graphicsElement);
            }
            if (makePathAndBoundingBox == null) {
                return;
            }
            checkForClipPath(graphicsElement);
            path.setFillType(getClipRuleFromState());
            path.addPath(makePathAndBoundingBox, matrix);
        }
    }

    private void fillInChainedGradientFields(SVGBase.SvgRadialGradient svgRadialGradient, SVGBase.SvgRadialGradient svgRadialGradient2) {
        if (svgRadialGradient.cx == null) {
            svgRadialGradient.cx = svgRadialGradient2.cx;
        }
        if (svgRadialGradient.cy == null) {
            svgRadialGradient.cy = svgRadialGradient2.cy;
        }
        if (svgRadialGradient.r == null) {
            svgRadialGradient.r = svgRadialGradient2.r;
        }
        if (svgRadialGradient.fx == null) {
            svgRadialGradient.fx = svgRadialGradient2.fx;
        }
        if (svgRadialGradient.fy == null) {
            svgRadialGradient.fy = svgRadialGradient2.fy;
        }
        if (svgRadialGradient.fr == null) {
            svgRadialGradient.fr = svgRadialGradient2.fr;
        }
    }

    private void addObjectToClip(SVGBase.Use use, Path path, Matrix matrix) {
        updateStyleForElement(this.state, use);
        if (display() && visible()) {
            Matrix matrix2 = use.transform;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            SVGBase.SvgObject resolveIRI = use.document.resolveIRI(use.href);
            if (resolveIRI == null) {
                error("Use reference '%s' not found", use.href);
            } else {
                checkForClipPath(use);
                addObjectToClip(resolveIRI, false, path, matrix);
            }
        }
    }

    private void render(SVGBase.Group group) {
        debug(group.getNodeName() + " render", new Object[0]);
        updateStyleForElement(this.state, group);
        if (display()) {
            Matrix matrix = group.transform;
            if (matrix != null) {
                this.canvas.concat(matrix);
            }
            checkForClipPath(group);
            boolean pushLayer = pushLayer();
            renderChildren(group, true);
            if (pushLayer) {
                popLayer(group);
            }
            updateParentBoundingBox(group);
        }
    }

    private Path makePathAndBoundingBox(SVGBase.Circle circle) {
        SVGBase.Length length = circle.cx;
        float floatValueX = length != null ? length.floatValueX(this) : 0.0f;
        SVGBase.Length length2 = circle.cy;
        float floatValueY = length2 != null ? length2.floatValueY(this) : 0.0f;
        float floatValue = circle.r.floatValue(this);
        float f = floatValueX - floatValue;
        float f2 = floatValueY - floatValue;
        float f3 = floatValueX + floatValue;
        float f4 = floatValueY + floatValue;
        if (circle.boundingBox == null) {
            float f5 = 2.0f * floatValue;
            circle.boundingBox = new SVGBase.Box(f, f2, f5, f5);
        }
        float f6 = BEZIER_ARC_FACTOR * floatValue;
        Path path = new Path();
        path.moveTo(floatValueX, f2);
        float f7 = floatValueX + f6;
        float f8 = floatValueY - f6;
        path.cubicTo(f7, f2, f3, f8, f3, floatValueY);
        float f9 = floatValueY + f6;
        path.cubicTo(f3, f9, f7, f4, floatValueX, f4);
        float f10 = floatValueX - f6;
        path.cubicTo(f10, f4, f, f9, f, floatValueY);
        path.cubicTo(f, f8, f10, f2, floatValueX, f2);
        path.close();
        return path;
    }

    private void addObjectToClip(SVGBase.Text text, Path path, Matrix matrix) {
        updateStyleForElement(this.state, text);
        if (display()) {
            Matrix matrix2 = text.transform;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            List<SVGBase.Length> list = text.x;
            float f = 0.0f;
            float floatValueX = (list == null || list.size() == 0) ? 0.0f : text.x.get(0).floatValueX(this);
            List<SVGBase.Length> list2 = text.y;
            float floatValueY = (list2 == null || list2.size() == 0) ? 0.0f : text.y.get(0).floatValueY(this);
            List<SVGBase.Length> list3 = text.dx;
            float floatValueX2 = (list3 == null || list3.size() == 0) ? 0.0f : text.dx.get(0).floatValueX(this);
            List<SVGBase.Length> list4 = text.dy;
            if (list4 != null && list4.size() != 0) {
                f = text.dy.get(0).floatValueY(this);
            }
            if (this.state.style.textAnchor != Style.TextAnchor.Start) {
                float calculateTextWidth = calculateTextWidth(text);
                if (this.state.style.textAnchor == Style.TextAnchor.Middle) {
                    calculateTextWidth /= 2.0f;
                }
                floatValueX -= calculateTextWidth;
            }
            if (text.boundingBox == null) {
                TextBoundsCalculator textBoundsCalculator = new TextBoundsCalculator(floatValueX, floatValueY);
                enumerateTextSpans(text, textBoundsCalculator);
                RectF rectF = textBoundsCalculator.bbox;
                text.boundingBox = new SVGBase.Box(rectF.left, rectF.top, rectF.width(), textBoundsCalculator.bbox.height());
            }
            checkForClipPath(text);
            Path path2 = new Path();
            enumerateTextSpans(text, new PlainTextToPath(floatValueX + floatValueX2, floatValueY + f, path2));
            path.setFillType(getClipRuleFromState());
            path.addPath(path2, matrix);
        }
    }

    private void render(SVGBase.Switch r3) {
        debug("Switch render", new Object[0]);
        updateStyleForElement(this.state, r3);
        if (display()) {
            Matrix matrix = r3.transform;
            if (matrix != null) {
                this.canvas.concat(matrix);
            }
            checkForClipPath(r3);
            boolean pushLayer = pushLayer();
            renderSwitchChild(r3);
            if (pushLayer) {
                popLayer(r3);
            }
            updateParentBoundingBox(r3);
        }
    }

    private Path makePathAndBoundingBox(SVGBase.Ellipse ellipse) {
        SVGBase.Length length = ellipse.cx;
        float floatValueX = length != null ? length.floatValueX(this) : 0.0f;
        SVGBase.Length length2 = ellipse.cy;
        float floatValueY = length2 != null ? length2.floatValueY(this) : 0.0f;
        float floatValueX2 = ellipse.rx.floatValueX(this);
        float floatValueY2 = ellipse.ry.floatValueY(this);
        float f = floatValueX - floatValueX2;
        float f2 = floatValueY - floatValueY2;
        float f3 = floatValueX + floatValueX2;
        float f4 = floatValueY + floatValueY2;
        if (ellipse.boundingBox == null) {
            ellipse.boundingBox = new SVGBase.Box(f, f2, floatValueX2 * 2.0f, 2.0f * floatValueY2);
        }
        float f5 = floatValueX2 * BEZIER_ARC_FACTOR;
        float f6 = BEZIER_ARC_FACTOR * floatValueY2;
        Path path = new Path();
        path.moveTo(floatValueX, f2);
        float f7 = floatValueX + f5;
        float f8 = floatValueY - f6;
        path.cubicTo(f7, f2, f3, f8, f3, floatValueY);
        float f9 = f6 + floatValueY;
        path.cubicTo(f3, f9, f7, f4, floatValueX, f4);
        float f10 = floatValueX - f5;
        path.cubicTo(f10, f4, f, f9, f, floatValueY);
        path.cubicTo(f, f8, f10, f2, floatValueX, f2);
        path.close();
        return path;
    }

    private void render(SVGBase.Use use) {
        debug("Use render", new Object[0]);
        SVGBase.Length length = use.width;
        if (length == null || !length.isZero()) {
            SVGBase.Length length2 = use.height;
            if (length2 == null || !length2.isZero()) {
                updateStyleForElement(this.state, use);
                if (display()) {
                    SVGBase.SvgObject resolveIRI = use.document.resolveIRI(use.href);
                    if (resolveIRI == null) {
                        error("Use reference '%s' not found", use.href);
                        return;
                    }
                    Matrix matrix = use.transform;
                    if (matrix != null) {
                        this.canvas.concat(matrix);
                    }
                    SVGBase.Length length3 = use.x;
                    float floatValueX = length3 != null ? length3.floatValueX(this) : 0.0f;
                    SVGBase.Length length4 = use.y;
                    this.canvas.translate(floatValueX, length4 != null ? length4.floatValueY(this) : 0.0f);
                    checkForClipPath(use);
                    boolean pushLayer = pushLayer();
                    parentPush(use);
                    if (resolveIRI instanceof SVGBase.Svg) {
                        SVGBase.Box makeViewPort = makeViewPort(null, null, use.width, use.height);
                        statePush();
                        render((SVGBase.Svg) resolveIRI, makeViewPort);
                        statePop();
                    } else if (resolveIRI instanceof SVGBase.Symbol) {
                        SVGBase.Length length5 = use.width;
                        if (length5 == null) {
                            length5 = new SVGBase.Length(100.0f, SVGBase.Unit.percent);
                        }
                        SVGBase.Length length6 = use.height;
                        if (length6 == null) {
                            length6 = new SVGBase.Length(100.0f, SVGBase.Unit.percent);
                        }
                        SVGBase.Box makeViewPort2 = makeViewPort(null, null, length5, length6);
                        statePush();
                        render((SVGBase.Symbol) resolveIRI, makeViewPort2);
                        statePop();
                    } else {
                        render(resolveIRI);
                    }
                    parentPop();
                    if (pushLayer) {
                        popLayer(use);
                    }
                    updateParentBoundingBox(use);
                }
            }
        }
    }

    private Path makePathAndBoundingBox(SVGBase.PolyLine polyLine) {
        Path path = new Path();
        float[] fArr = polyLine.points;
        int i = 0;
        int length = fArr != null ? fArr.length : 0;
        if (length % 2 != 0) {
            return null;
        }
        if (length > 0) {
            while (length >= 2) {
                if (i == 0) {
                    float[] fArr2 = polyLine.points;
                    path.moveTo(fArr2[i], fArr2[i + 1]);
                } else {
                    float[] fArr3 = polyLine.points;
                    path.lineTo(fArr3[i], fArr3[i + 1]);
                }
                i += 2;
                length -= 2;
            }
            if (polyLine instanceof SVGBase.Polygon) {
                path.close();
            }
        }
        if (polyLine.boundingBox == null) {
            polyLine.boundingBox = calculatePathBounds(path);
        }
        return path;
    }

    private Path makePathAndBoundingBox(SVGBase.Text text) {
        List<SVGBase.Length> list = text.x;
        float f = 0.0f;
        float floatValueX = (list == null || list.size() == 0) ? 0.0f : text.x.get(0).floatValueX(this);
        List<SVGBase.Length> list2 = text.y;
        float floatValueY = (list2 == null || list2.size() == 0) ? 0.0f : text.y.get(0).floatValueY(this);
        List<SVGBase.Length> list3 = text.dx;
        float floatValueX2 = (list3 == null || list3.size() == 0) ? 0.0f : text.dx.get(0).floatValueX(this);
        List<SVGBase.Length> list4 = text.dy;
        if (list4 != null && list4.size() != 0) {
            f = text.dy.get(0).floatValueY(this);
        }
        if (this.state.style.textAnchor != Style.TextAnchor.Start) {
            float calculateTextWidth = calculateTextWidth(text);
            if (this.state.style.textAnchor == Style.TextAnchor.Middle) {
                calculateTextWidth /= 2.0f;
            }
            floatValueX -= calculateTextWidth;
        }
        if (text.boundingBox == null) {
            TextBoundsCalculator textBoundsCalculator = new TextBoundsCalculator(floatValueX, floatValueY);
            enumerateTextSpans(text, textBoundsCalculator);
            RectF rectF = textBoundsCalculator.bbox;
            text.boundingBox = new SVGBase.Box(rectF.left, rectF.top, rectF.width(), textBoundsCalculator.bbox.height());
        }
        Path path = new Path();
        enumerateTextSpans(text, new PlainTextToPath(floatValueX + floatValueX2, floatValueY + f, path));
        return path;
    }

    private void render(SVGBase.Path path) {
        debug("Path render", new Object[0]);
        if (path.d == null) {
            return;
        }
        updateStyleForElement(this.state, path);
        if (display() && visible()) {
            RendererState rendererState = this.state;
            if (rendererState.hasStroke || rendererState.hasFill) {
                Matrix matrix = path.transform;
                if (matrix != null) {
                    this.canvas.concat(matrix);
                }
                Path path2 = new PathConverter(path.d).getPath();
                if (path.boundingBox == null) {
                    path.boundingBox = calculatePathBounds(path2);
                }
                updateParentBoundingBox(path);
                checkForGradientsAndPatterns(path);
                checkForClipPath(path);
                boolean pushLayer = pushLayer();
                if (this.state.hasFill) {
                    path2.setFillType(getFillTypeFromState());
                    doFilledPath(path, path2);
                }
                if (this.state.hasStroke) {
                    doStroke(path2);
                }
                renderMarkers(path);
                if (pushLayer) {
                    popLayer(path);
                }
            }
        }
    }

    private void render(SVGBase.Rect rect) {
        debug("Rect render", new Object[0]);
        SVGBase.Length length = rect.width;
        if (length == null || rect.height == null || length.isZero() || rect.height.isZero()) {
            return;
        }
        updateStyleForElement(this.state, rect);
        if (display() && visible()) {
            Matrix matrix = rect.transform;
            if (matrix != null) {
                this.canvas.concat(matrix);
            }
            Path makePathAndBoundingBox = makePathAndBoundingBox(rect);
            updateParentBoundingBox(rect);
            checkForGradientsAndPatterns(rect);
            checkForClipPath(rect);
            boolean pushLayer = pushLayer();
            if (this.state.hasFill) {
                doFilledPath(rect, makePathAndBoundingBox);
            }
            if (this.state.hasStroke) {
                doStroke(makePathAndBoundingBox);
            }
            if (pushLayer) {
                popLayer(rect);
            }
        }
    }

    private void render(SVGBase.Circle circle) {
        debug("Circle render", new Object[0]);
        SVGBase.Length length = circle.r;
        if (length == null || length.isZero()) {
            return;
        }
        updateStyleForElement(this.state, circle);
        if (display() && visible()) {
            Matrix matrix = circle.transform;
            if (matrix != null) {
                this.canvas.concat(matrix);
            }
            Path makePathAndBoundingBox = makePathAndBoundingBox(circle);
            updateParentBoundingBox(circle);
            checkForGradientsAndPatterns(circle);
            checkForClipPath(circle);
            boolean pushLayer = pushLayer();
            if (this.state.hasFill) {
                doFilledPath(circle, makePathAndBoundingBox);
            }
            if (this.state.hasStroke) {
                doStroke(makePathAndBoundingBox);
            }
            if (pushLayer) {
                popLayer(circle);
            }
        }
    }

    private void render(SVGBase.Ellipse ellipse) {
        debug("Ellipse render", new Object[0]);
        SVGBase.Length length = ellipse.rx;
        if (length == null || ellipse.ry == null || length.isZero() || ellipse.ry.isZero()) {
            return;
        }
        updateStyleForElement(this.state, ellipse);
        if (display() && visible()) {
            Matrix matrix = ellipse.transform;
            if (matrix != null) {
                this.canvas.concat(matrix);
            }
            Path makePathAndBoundingBox = makePathAndBoundingBox(ellipse);
            updateParentBoundingBox(ellipse);
            checkForGradientsAndPatterns(ellipse);
            checkForClipPath(ellipse);
            boolean pushLayer = pushLayer();
            if (this.state.hasFill) {
                doFilledPath(ellipse, makePathAndBoundingBox);
            }
            if (this.state.hasStroke) {
                doStroke(makePathAndBoundingBox);
            }
            if (pushLayer) {
                popLayer(ellipse);
            }
        }
    }

    private void render(SVGBase.Line line) {
        debug("Line render", new Object[0]);
        updateStyleForElement(this.state, line);
        if (display() && visible() && this.state.hasStroke) {
            Matrix matrix = line.transform;
            if (matrix != null) {
                this.canvas.concat(matrix);
            }
            Path makePathAndBoundingBox = makePathAndBoundingBox(line);
            updateParentBoundingBox(line);
            checkForGradientsAndPatterns(line);
            checkForClipPath(line);
            boolean pushLayer = pushLayer();
            doStroke(makePathAndBoundingBox);
            renderMarkers(line);
            if (pushLayer) {
                popLayer(line);
            }
        }
    }

    private void render(SVGBase.PolyLine polyLine) {
        debug("PolyLine render", new Object[0]);
        updateStyleForElement(this.state, polyLine);
        if (display() && visible()) {
            RendererState rendererState = this.state;
            if (rendererState.hasStroke || rendererState.hasFill) {
                Matrix matrix = polyLine.transform;
                if (matrix != null) {
                    this.canvas.concat(matrix);
                }
                float[] fArr = polyLine.points;
                int length = fArr != null ? fArr.length : 0;
                if (length < 2 || length % 2 == 1) {
                    return;
                }
                Path makePathAndBoundingBox = makePathAndBoundingBox(polyLine);
                updateParentBoundingBox(polyLine);
                makePathAndBoundingBox.setFillType(getFillTypeFromState());
                checkForGradientsAndPatterns(polyLine);
                checkForClipPath(polyLine);
                boolean pushLayer = pushLayer();
                if (this.state.hasFill) {
                    doFilledPath(polyLine, makePathAndBoundingBox);
                }
                if (this.state.hasStroke) {
                    doStroke(makePathAndBoundingBox);
                }
                renderMarkers(polyLine);
                if (pushLayer) {
                    popLayer(polyLine);
                }
            }
        }
    }

    private void render(SVGBase.Polygon polygon) {
        debug("Polygon render", new Object[0]);
        updateStyleForElement(this.state, polygon);
        if (display() && visible()) {
            RendererState rendererState = this.state;
            if (rendererState.hasStroke || rendererState.hasFill) {
                Matrix matrix = polygon.transform;
                if (matrix != null) {
                    this.canvas.concat(matrix);
                }
                float[] fArr = polygon.points;
                if ((fArr != null ? fArr.length : 0) < 2) {
                    return;
                }
                Path makePathAndBoundingBox = makePathAndBoundingBox(polygon);
                updateParentBoundingBox(polygon);
                checkForGradientsAndPatterns(polygon);
                checkForClipPath(polygon);
                boolean pushLayer = pushLayer();
                if (this.state.hasFill) {
                    doFilledPath(polygon, makePathAndBoundingBox);
                }
                if (this.state.hasStroke) {
                    doStroke(makePathAndBoundingBox);
                }
                renderMarkers(polygon);
                if (pushLayer) {
                    popLayer(polygon);
                }
            }
        }
    }

    private void render(SVGBase.Text text) {
        debug("Text render", new Object[0]);
        updateStyleForElement(this.state, text);
        if (display()) {
            selectTypefaceAndFontStyling();
            Matrix matrix = text.transform;
            if (matrix != null) {
                this.canvas.concat(matrix);
            }
            List<SVGBase.Length> list = text.x;
            float f = 0.0f;
            float floatValueX = (list == null || list.size() == 0) ? 0.0f : text.x.get(0).floatValueX(this);
            List<SVGBase.Length> list2 = text.y;
            float floatValueY = (list2 == null || list2.size() == 0) ? 0.0f : text.y.get(0).floatValueY(this);
            List<SVGBase.Length> list3 = text.dx;
            float floatValueX2 = (list3 == null || list3.size() == 0) ? 0.0f : text.dx.get(0).floatValueX(this);
            List<SVGBase.Length> list4 = text.dy;
            if (list4 != null && list4.size() != 0) {
                f = text.dy.get(0).floatValueY(this);
            }
            Style.TextAnchor anchorPosition = getAnchorPosition();
            if (anchorPosition != Style.TextAnchor.Start) {
                float calculateTextWidth = calculateTextWidth(text);
                if (anchorPosition == Style.TextAnchor.Middle) {
                    calculateTextWidth /= 2.0f;
                }
                floatValueX -= calculateTextWidth;
            }
            if (text.boundingBox == null) {
                TextBoundsCalculator textBoundsCalculator = new TextBoundsCalculator(floatValueX, floatValueY);
                enumerateTextSpans(text, textBoundsCalculator);
                RectF rectF = textBoundsCalculator.bbox;
                text.boundingBox = new SVGBase.Box(rectF.left, rectF.top, rectF.width(), textBoundsCalculator.bbox.height());
            }
            updateParentBoundingBox(text);
            checkForGradientsAndPatterns(text);
            checkForClipPath(text);
            boolean pushLayer = pushLayer();
            enumerateTextSpans(text, new PlainTextDrawer(floatValueX + floatValueX2, floatValueY + f));
            if (pushLayer) {
                popLayer(text);
            }
        }
    }

    private void render(SVGBase.Symbol symbol, SVGBase.Box box) {
        debug("Symbol render", new Object[0]);
        if (box.width == 0.0f || box.height == 0.0f) {
            return;
        }
        PreserveAspectRatio preserveAspectRatio = symbol.preserveAspectRatio;
        if (preserveAspectRatio == null) {
            preserveAspectRatio = PreserveAspectRatio.LETTERBOX;
        }
        updateStyleForElement(this.state, symbol);
        RendererState rendererState = this.state;
        rendererState.viewPort = box;
        if (!rendererState.style.overflow.booleanValue()) {
            SVGBase.Box box2 = this.state.viewPort;
            setClipRect(box2.minX, box2.minY, box2.width, box2.height);
        }
        SVGBase.Box box3 = symbol.viewBox;
        if (box3 != null) {
            this.canvas.concat(calculateViewBoxTransform(this.state.viewPort, box3, preserveAspectRatio));
            this.state.viewBox = symbol.viewBox;
        } else {
            Canvas canvas = this.canvas;
            SVGBase.Box box4 = this.state.viewPort;
            canvas.translate(box4.minX, box4.minY);
            this.state.viewBox = null;
        }
        boolean pushLayer = pushLayer();
        renderChildren(symbol, true);
        if (pushLayer) {
            popLayer(symbol);
        }
        updateParentBoundingBox(symbol);
    }

    private void render(SVGBase.Image image) {
        SVGBase.Length length;
        String str;
        debug("Image render", new Object[0]);
        SVGBase.Length length2 = image.width;
        if (length2 == null || length2.isZero() || (length = image.height) == null || length.isZero() || (str = image.href) == null) {
            return;
        }
        PreserveAspectRatio preserveAspectRatio = image.preserveAspectRatio;
        if (preserveAspectRatio == null) {
            preserveAspectRatio = PreserveAspectRatio.LETTERBOX;
        }
        Bitmap checkForImageDataURL = checkForImageDataURL(str);
        if (checkForImageDataURL == null) {
            SVGExternalFileResolver sVGExternalFileResolver = this.externalFileResolver;
            if (sVGExternalFileResolver == null) {
                return;
            } else {
                checkForImageDataURL = sVGExternalFileResolver.resolveImage(image.href);
            }
        }
        if (checkForImageDataURL == null) {
            error("Could not locate image '%s'", image.href);
            return;
        }
        SVGBase.Box box = new SVGBase.Box(0.0f, 0.0f, checkForImageDataURL.getWidth(), checkForImageDataURL.getHeight());
        updateStyleForElement(this.state, image);
        if (display() && visible()) {
            Matrix matrix = image.transform;
            if (matrix != null) {
                this.canvas.concat(matrix);
            }
            SVGBase.Length length3 = image.x;
            float floatValueX = length3 != null ? length3.floatValueX(this) : 0.0f;
            SVGBase.Length length4 = image.y;
            this.state.viewPort = new SVGBase.Box(floatValueX, length4 != null ? length4.floatValueY(this) : 0.0f, image.width.floatValueX(this), image.height.floatValueX(this));
            if (!this.state.style.overflow.booleanValue()) {
                SVGBase.Box box2 = this.state.viewPort;
                setClipRect(box2.minX, box2.minY, box2.width, box2.height);
            }
            image.boundingBox = this.state.viewPort;
            updateParentBoundingBox(image);
            checkForClipPath(image);
            boolean pushLayer = pushLayer();
            viewportFill();
            this.canvas.save();
            this.canvas.concat(calculateViewBoxTransform(this.state.viewPort, box, preserveAspectRatio));
            this.canvas.drawBitmap(checkForImageDataURL, 0.0f, 0.0f, new Paint(this.state.style.imageRendering != Style.RenderQuality.optimizeSpeed ? 2 : 0));
            this.canvas.restore();
            if (pushLayer) {
                popLayer(image);
            }
        }
    }
}
