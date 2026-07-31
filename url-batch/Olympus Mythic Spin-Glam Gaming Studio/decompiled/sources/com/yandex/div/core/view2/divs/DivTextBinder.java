package com.yandex.div.core.view2.divs;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.MovementMethod;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.widget.TextView;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.dagger.ExperimentFlag;
import com.yandex.div.core.experiments.Experiment;
import com.yandex.div.core.util.DivDataExtensionsKt;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.ExpressionSubscribersKt;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivTypefaceResolver;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView;
import com.yandex.div.core.view2.spannable.ShadowData;
import com.yandex.div.core.view2.spannable.SpannedTextBuilder;
import com.yandex.div.core.view2.text.SelectableLinkMovementMethod;
import com.yandex.div.core.widget.AdaptiveMaxLines;
import com.yandex.div.core.widget.DivViewWrapper;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.drawable.LinearGradientDrawable;
import com.yandex.div.internal.drawable.RadialGradientDrawable;
import com.yandex.div.internal.graphics.Colormap;
import com.yandex.div.internal.graphics.ColormapKt;
import com.yandex.div.internal.widget.EllipsizedTextView;
import com.yandex.div.internal.widget.TextViewsKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.ExpressionsKt;
import com.yandex.div2.Div;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivDimension;
import com.yandex.div2.DivExtension;
import com.yandex.div2.DivLineStyle;
import com.yandex.div2.DivLinearGradient;
import com.yandex.div2.DivPoint;
import com.yandex.div2.DivRadialGradient;
import com.yandex.div2.DivRadialGradientCenter;
import com.yandex.div2.DivRadialGradientRadius;
import com.yandex.div2.DivRadialGradientRelativeRadius;
import com.yandex.div2.DivShadow;
import com.yandex.div2.DivSolidBackground;
import com.yandex.div2.DivStroke;
import com.yandex.div2.DivText;
import com.yandex.div2.DivTextGradient;
import com.yandex.div2.DivTextRangeBackground;
import com.yandex.div2.DivTextRangeBorder;
import com.yandex.div2.DivTextRangeMask;
import com.yandex.div2.DivTextRangeMaskParticles;
import com.yandex.div2.DivTextRangeMaskSolid;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivTextBinder.kt */
@Metadata(d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0004H\u0002J\u001c\u0010\u0018\u001a\u00020\u0014*\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0016\u0010\u001c\u001a\u00020\u0014*\u00020\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002J\u0014\u0010\u001f\u001a\u00020\u0014*\u00020\u00102\u0006\u0010 \u001a\u00020\u001eH\u0002J\u001c\u0010!\u001a\u00020\u0014*\u00020\u00102\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0002J-\u0010&\u001a\u00020\u0014*\u00020\u00042\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010#2\b\u0010*\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0002\u0010+J\u0016\u0010,\u001a\u00020\u0014*\u00020\u00042\b\u0010-\u001a\u0004\u0018\u00010\u001eH\u0002J\u001c\u0010.\u001a\u00020\u0014*\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010/\u001a\u00020\u0003H\u0002J2\u00100\u001a\u00020\u0014*\u00020\u00102\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002042\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u000f07H\u0002J\u001c\u00108\u001a\u00020\u0014*\u0002092\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010:\u001a\u00020\u0003H\u0002J\u001c\u0010;\u001a\u00020\u0014*\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0003H\u0002J\u0014\u0010<\u001a\u00020\u0014*\u00020\u00102\u0006\u0010=\u001a\u00020\fH\u0002J\u0014\u0010>\u001a\u00020\u0014*\u00020\u00102\u0006\u0010?\u001a\u00020@H\u0002J\u001c\u0010A\u001a\u00020\u0014*\u00020\u00102\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020EH\u0002J#\u0010F\u001a\u00020\u0014*\u00020\u00102\u0006\u0010G\u001a\u00020\u000f2\b\u0010H\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0002\u0010IJ\u0016\u0010J\u001a\u00020\u0014*\u00020\u00102\b\u0010K\u001a\u0004\u0018\u00010LH\u0002J\u0014\u0010M\u001a\u00020\u0014*\u00020\u00042\u0006\u0010N\u001a\u00020\fH\u0002J\u0014\u0010O\u001a\u00020\u0014*\u00020\u00102\u0006\u0010P\u001a\u00020@H\u0002J&\u0010Q\u001a\u00020\u0014*\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00032\b\u0010R\u001a\u0004\u0018\u00010\u0003H\u0014J&\u0010S\u001a\u00020\u0014*\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010:\u001a\u00020\u00032\b\u0010R\u001a\u0004\u0018\u00010\u0003H\u0002J&\u0010T\u001a\u00020\u0014*\u00020\u00042\u0006\u0010:\u001a\u00020\u00032\b\u0010R\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J&\u0010U\u001a\u00020\u0014*\u00020\u00042\u0006\u0010:\u001a\u00020\u00032\b\u0010R\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J&\u0010V\u001a\u00020\u0014*\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00032\b\u0010R\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J&\u0010W\u001a\u00020\u0014*\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00032\b\u0010R\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J.\u0010X\u001a\u00020\u0014*\u00020\u00042\u0006\u0010'\u001a\u00020(2\u0006\u0010Y\u001a\u00020Z2\b\u0010[\u001a\u0004\u0018\u00010\\2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J.\u0010]\u001a\u00020\u0014*\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010:\u001a\u00020\u00032\b\u0010R\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J(\u0010^\u001a\u00020\u0014*\u00020\u00042\b\u0010_\u001a\u0004\u0018\u00010`2\b\u0010a\u001a\u0004\u0018\u00010`2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J&\u0010b\u001a\u00020\u0014*\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010:\u001a\u00020\u00032\b\u0010R\u001a\u0004\u0018\u00010\u0003H\u0002J&\u0010c\u001a\u00020\u0014*\u00020\u00042\u0006\u0010Y\u001a\u00020d2\b\u0010[\u001a\u0004\u0018\u00010\\2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u001c\u0010e\u001a\u00020\u0014*\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010:\u001a\u00020\u0003H\u0002J\u001c\u0010f\u001a\u00020\u0014*\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010:\u001a\u00020\u0003H\u0002J&\u0010g\u001a\u00020\u0014*\u00020\u00042\u0006\u0010:\u001a\u00020\u00032\b\u0010R\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J&\u0010h\u001a\u00020\u0014*\u00020\u00042\u0006\u0010:\u001a\u00020\u00032\b\u0010R\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J&\u0010i\u001a\u00020\u0014*\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010:\u001a\u00020\u00032\b\u0010R\u001a\u0004\u0018\u00010\u0003H\u0002J&\u0010j\u001a\u00020\u0014*\u00020\u00042\u0006\u0010:\u001a\u00020\u00032\b\u0010R\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J&\u0010k\u001a\u00020\u0014*\u00020\u00042\u0006\u0010:\u001a\u00020\u00032\b\u0010R\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J.\u0010l\u001a\u00020\u0014*\u00020\u00042\u0006\u0010'\u001a\u00020(2\u0006\u0010:\u001a\u00020\u00032\b\u0010R\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J&\u0010m\u001a\u00020\u0014*\u00020\u00042\u0006\u0010:\u001a\u00020\u00032\b\u0010R\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J&\u0010n\u001a\u00020\u0014*\u00020\u00042\u0006\u0010:\u001a\u00020\u00032\b\u0010R\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J&\u0010o\u001a\u00020\u0014*\u00020\u00042\u0006\u0010:\u001a\u00020\u00032\b\u0010R\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J&\u0010p\u001a\u00020\u0014*\u00020\u00042\u0006\u0010:\u001a\u00020\u00032\b\u0010R\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J$\u0010q\u001a\u00020L*\u00020r2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010s\u001a\u00020t2\u0006\u0010u\u001a\u00020\u000fH\u0002J\u001c\u0010v\u001a\u000204*\u00020w2\u0006\u0010x\u001a\u00020t2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u001c\u0010y\u001a\u000202*\u00020z2\u0006\u0010x\u001a\u00020t2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0014\u0010{\u001a\u00020\u0014*\u00020|2\u0006\u0010\u0019\u001a\u00020\u0003H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u000e\u001a\u00020\u000f*\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006}"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivTextBinder;", "Lcom/yandex/div/core/view2/DivViewBinder;", "Lcom/yandex/div2/Div$Text;", "Lcom/yandex/div2/DivText;", "Lcom/yandex/div/core/view2/divs/widgets/DivLineHeightTextView;", "baseBinder", "Lcom/yandex/div/core/view2/divs/DivBaseBinder;", "typefaceResolver", "Lcom/yandex/div/core/view2/DivTypefaceResolver;", "spannedTextBuilder", "Lcom/yandex/div/core/view2/spannable/SpannedTextBuilder;", "isHyphenationEnabled", "", "(Lcom/yandex/div/core/view2/divs/DivBaseBinder;Lcom/yandex/div/core/view2/DivTypefaceResolver;Lcom/yandex/div/core/view2/spannable/SpannedTextBuilder;Z)V", "realTextWidth", "", "Landroid/widget/TextView;", "getRealTextWidth", "(Landroid/widget/TextView;)I", "configureView", "", "bindingContext", "Lcom/yandex/div/core/view2/BindingContext;", "view", "applyEllipsize", "div", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "applyFontFeatureSettings", "settings", "", "applyHyphenation", "text", "applyLinearTextGradientColor", "angle", "", "colormap", "Lcom/yandex/div/internal/graphics/Colormap;", "applyMaxLines", "divView", "Lcom/yandex/div/core/view2/Div2View;", "maxLines", "minHiddenLines", "(Lcom/yandex/div/core/view2/divs/widgets/DivLineHeightTextView;Lcom/yandex/div/core/view2/Div2View;Ljava/lang/Long;Ljava/lang/Long;)V", "applyPlainEllipsis", "ellipsis", "applyPlainText", "divText", "applyRadialTextGradientColor", "radius", "Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Radius;", "centerX", "Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Center;", "centerY", "colors", "", "applyRichEllipsis", "Lcom/yandex/div/internal/widget/EllipsizedTextView;", "newDiv", "applyRichText", "applySelectable", "selectable", "applyStrikethrough", "strikethrough", "Lcom/yandex/div2/DivLineStyle;", "applyTextAlignment", "horizontalAlignment", "Lcom/yandex/div2/DivAlignmentHorizontal;", "verticalAlignment", "Lcom/yandex/div2/DivAlignmentVertical;", "applyTextColor", "textColor", "focusedTextColor", "(Landroid/widget/TextView;ILjava/lang/Integer;)V", "applyTextShadow", "shadowParams", "Lcom/yandex/div/core/view2/spannable/ShadowData;", "applyTightenWidth", "tight", "applyUnderline", "underline", "bind", "oldDiv", "bindEllipsis", "bindEllipsize", "bindFontFeatureSettings", "bindFontSize", "bindLetterSpacing", "bindLinearTextGradient", "newTextGradient", "Lcom/yandex/div2/DivLinearGradient;", "oldTextGradient", "Lcom/yandex/div2/DivTextGradient;", "bindMaxLines", "bindPlainEllipsis", "newEllipsis", "Lcom/yandex/div2/DivText$Ellipsis;", "oldEllipsis", "bindPlainText", "bindRadialTextGradient", "Lcom/yandex/div2/DivRadialGradient;", "bindRichEllipsis", "bindRichText", "bindSelectable", "bindStrikethrough", "bindText", "bindTextAlignment", "bindTextColor", "bindTextGradient", "bindTextShadow", "bindTightenWidth", "bindTypeface", "bindUnderline", "getShadowData", "Lcom/yandex/div2/DivShadow;", "displayMetrics", "Landroid/util/DisplayMetrics;", "fontColor", "toRadialGradientDrawableCenter", "Lcom/yandex/div2/DivRadialGradientCenter;", "metrics", "toRadialGradientDrawableRadius", "Lcom/yandex/div2/DivRadialGradientRadius;", "updateFocusableState", "Landroid/view/View;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@DivScope
/* loaded from: classes.dex */
public final class DivTextBinder extends DivViewBinder<Div.Text, DivText, DivLineHeightTextView> {
    private final boolean isHyphenationEnabled;

    @NotNull
    private final SpannedTextBuilder spannedTextBuilder;

    @NotNull
    private final DivTypefaceResolver typefaceResolver;

    /* compiled from: DivTextBinder.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[DivAlignmentHorizontal.values().length];
            try {
                iArr[DivAlignmentHorizontal.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivAlignmentHorizontal.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivAlignmentHorizontal.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DivAlignmentHorizontal.START.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DivAlignmentHorizontal.END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DivLineStyle.values().length];
            try {
                iArr2[DivLineStyle.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[DivLineStyle.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[DivRadialGradientRelativeRadius.Value.values().length];
            try {
                iArr3[DivRadialGradientRelativeRadius.Value.FARTHEST_CORNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[DivRadialGradientRelativeRadius.Value.NEAREST_CORNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[DivRadialGradientRelativeRadius.Value.FARTHEST_SIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[DivRadialGradientRelativeRadius.Value.NEAREST_SIDE.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[DivText.Truncate.values().length];
            try {
                iArr4[DivText.Truncate.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[DivText.Truncate.START.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[DivText.Truncate.MIDDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[DivText.Truncate.END.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyLinearTextGradientColor(final TextView textView, final long j, final Colormap colormap) {
        if (!ViewsKt.isActuallyLaidOut(textView) || textView.isLayoutRequested()) {
            textView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$applyLinearTextGradientColor$$inlined$doOnActualLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    textView.getPaint().setShader(LinearGradientDrawable.INSTANCE.createLinearGradient(j, colormap.getColors(), colormap.getPositions(), this.getRealTextWidth(textView), (textView.getHeight() - textView.getPaddingBottom()) - textView.getPaddingTop()));
                    textView.invalidate();
                }
            });
        } else {
            textView.getPaint().setShader(LinearGradientDrawable.INSTANCE.createLinearGradient(j, colormap.getColors(), colormap.getPositions(), getRealTextWidth(textView), (textView.getHeight() - textView.getPaddingBottom()) - textView.getPaddingTop()));
            textView.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyRadialTextGradientColor(final TextView textView, final RadialGradientDrawable.Radius radius, final RadialGradientDrawable.Center center, final RadialGradientDrawable.Center center2, final List<Integer> list) {
        if (!ViewsKt.isActuallyLaidOut(textView) || textView.isLayoutRequested()) {
            textView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$applyRadialTextGradientColor$$inlined$doOnActualLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    textView.getPaint().setShader(RadialGradientDrawable.INSTANCE.createRadialGradient(radius, center, center2, CollectionsKt.toIntArray(list), this.getRealTextWidth(textView), (textView.getHeight() - textView.getPaddingBottom()) - textView.getPaddingTop()));
                    textView.invalidate();
                }
            });
        } else {
            textView.getPaint().setShader(RadialGradientDrawable.INSTANCE.createRadialGradient(radius, center, center2, CollectionsKt.toIntArray(list), getRealTextWidth(textView), (textView.getHeight() - textView.getPaddingBottom()) - textView.getPaddingTop()));
            textView.invalidate();
        }
    }

    public DivTextBinder(@NotNull DivBaseBinder divBaseBinder, @NotNull DivTypefaceResolver divTypefaceResolver, @NotNull SpannedTextBuilder spannedTextBuilder, @ExperimentFlag(experiment = Experiment.HYPHENATION_SUPPORT_ENABLED) boolean z) {
        super(divBaseBinder);
        this.typefaceResolver = divTypefaceResolver;
        this.spannedTextBuilder = spannedTextBuilder;
        this.isHyphenationEnabled = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(@NotNull DivLineHeightTextView divLineHeightTextView, @NotNull BindingContext bindingContext, @NotNull DivText divText, @Nullable DivText divText2) {
        configureView(bindingContext, divLineHeightTextView);
        BaseDivViewExtensionsKt.applyDivActions(divLineHeightTextView, bindingContext, divText.action, divText.actions, divText.longtapActions, divText.doubletapActions, divText.hoverStartActions, divText.hoverEndActions, divText.pressStartActions, divText.pressEndActions, divText.actionAnimation, divText.captureFocusOnAction);
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        bindTypeface(divLineHeightTextView, divText, divText2, expressionResolver);
        bindTextAlignment(divLineHeightTextView, divText, divText2, expressionResolver);
        bindFontSize(divLineHeightTextView, divText, divText2, expressionResolver);
        bindLetterSpacing(divLineHeightTextView, divText, divText2, expressionResolver);
        bindFontFeatureSettings(divLineHeightTextView, divText, divText2, expressionResolver);
        bindTextColor(divLineHeightTextView, divText, divText2, expressionResolver);
        bindUnderline(divLineHeightTextView, divText, divText2, expressionResolver);
        bindStrikethrough(divLineHeightTextView, divText, divText2, expressionResolver);
        bindMaxLines(divLineHeightTextView, bindingContext, divText, divText2, expressionResolver);
        bindText(divLineHeightTextView, bindingContext, divText, divText2);
        bindEllipsis(divLineHeightTextView, bindingContext, divText, divText2);
        bindEllipsize(divLineHeightTextView, divText, divText2, expressionResolver);
        bindTextGradient(divLineHeightTextView, bindingContext.getDivView(), divText, divText2, expressionResolver);
        bindTextShadow(divLineHeightTextView, divText, divText2, expressionResolver);
        bindSelectable(divLineHeightTextView, divText, divText2, expressionResolver);
        bindTightenWidth(divLineHeightTextView, divText, divText2, expressionResolver);
        updateFocusableState(divLineHeightTextView, divText);
    }

    private final void configureView(BindingContext bindingContext, DivLineHeightTextView view) {
        view.setDrawingPassOverrideStrategy$div_release(bindingContext.getDivView().getViewComponent().getDrawingPassOverrideStrategy());
    }

    private final void bindTextAlignment(final DivLineHeightTextView divLineHeightTextView, final DivText divText, DivText divText2, final ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(divText.textAlignmentHorizontal, divText2 != null ? divText2.textAlignmentHorizontal : null)) {
            if (ExpressionsKt.equalsToConstant(divText.textAlignmentVertical, divText2 != null ? divText2.textAlignmentVertical : null)) {
                return;
            }
        }
        applyTextAlignment(divLineHeightTextView, (DivAlignmentHorizontal) divText.textAlignmentHorizontal.evaluate(expressionResolver), (DivAlignmentVertical) divText.textAlignmentVertical.evaluate(expressionResolver));
        if (ExpressionsKt.isConstant(divText.textAlignmentHorizontal) && ExpressionsKt.isConstant(divText.textAlignmentVertical)) {
            return;
        }
        Function1 function1 = new Function1() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindTextAlignment$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7232invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7232invoke(@NotNull Object obj) {
                DivTextBinder.this.applyTextAlignment(divLineHeightTextView, (DivAlignmentHorizontal) divText.textAlignmentHorizontal.evaluate(expressionResolver), (DivAlignmentVertical) divText.textAlignmentVertical.evaluate(expressionResolver));
            }
        };
        divLineHeightTextView.addSubscription(divText.textAlignmentHorizontal.observe(expressionResolver, function1));
        divLineHeightTextView.addSubscription(divText.textAlignmentVertical.observe(expressionResolver, function1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyTextAlignment(TextView textView, DivAlignmentHorizontal divAlignmentHorizontal, DivAlignmentVertical divAlignmentVertical) {
        textView.setGravity(DivUtilKt.evaluateGravity(divAlignmentHorizontal, divAlignmentVertical));
        int i = WhenMappings.$EnumSwitchMapping$0[divAlignmentHorizontal.ordinal()];
        int i2 = 5;
        if (i != 1) {
            if (i == 2) {
                i2 = 4;
            } else if (i == 3 || (i != 4 && i == 5)) {
                i2 = 6;
            }
        }
        textView.setTextAlignment(i2);
    }

    private final void bindMaxLines(final DivLineHeightTextView divLineHeightTextView, final BindingContext bindingContext, final DivText divText, DivText divText2, final ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(divText.maxLines, divText2 != null ? divText2.maxLines : null)) {
            if (ExpressionsKt.equalsToConstant(divText.minHiddenLines, divText2 != null ? divText2.minHiddenLines : null)) {
                return;
            }
        }
        Div2View divView = bindingContext.getDivView();
        Expression expression = divText.maxLines;
        Long l = expression != null ? (Long) expression.evaluate(expressionResolver) : null;
        Expression expression2 = divText.minHiddenLines;
        applyMaxLines(divLineHeightTextView, divView, l, expression2 != null ? (Long) expression2.evaluate(expressionResolver) : null);
        if (ExpressionsKt.isConstantOrNull(divText.maxLines) && ExpressionsKt.isConstantOrNull(divText.minHiddenLines)) {
            return;
        }
        Function1 function1 = new Function1() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindMaxLines$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7228invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7228invoke(@NotNull Object obj) {
                DivTextBinder divTextBinder = DivTextBinder.this;
                DivLineHeightTextView divLineHeightTextView2 = divLineHeightTextView;
                Div2View divView2 = bindingContext.getDivView();
                Expression expression3 = divText.maxLines;
                Long l2 = expression3 != null ? (Long) expression3.evaluate(expressionResolver) : null;
                Expression expression4 = divText.minHiddenLines;
                divTextBinder.applyMaxLines(divLineHeightTextView2, divView2, l2, expression4 != null ? (Long) expression4.evaluate(expressionResolver) : null);
            }
        };
        Expression expression3 = divText.maxLines;
        divLineHeightTextView.addSubscription(expression3 != null ? expression3.observe(expressionResolver, function1) : null);
        Expression expression4 = divText.minHiddenLines;
        divLineHeightTextView.addSubscription(expression4 != null ? expression4.observe(expressionResolver, function1) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyMaxLines(DivLineHeightTextView divLineHeightTextView, Div2View div2View, Long l, Long l2) {
        int i;
        AdaptiveMaxLines adaptiveMaxLines = divLineHeightTextView.getAdaptiveMaxLines();
        if (adaptiveMaxLines != null) {
            adaptiveMaxLines.reset();
        }
        int i2 = Integer.MIN_VALUE;
        int i3 = Integer.MAX_VALUE;
        if (l == null || l2 == null) {
            if (l != null) {
                long longValue = l.longValue();
                long j = longValue >> 31;
                if (j == 0 || j == -1) {
                    i2 = (int) longValue;
                } else {
                    KAssert kAssert = KAssert.INSTANCE;
                    if (Assert.isEnabled()) {
                        Assert.fail("Unable convert '" + longValue + "' to Int");
                    }
                    if (longValue > 0) {
                        i2 = Integer.MAX_VALUE;
                    }
                }
                i3 = i2;
            }
            divLineHeightTextView.setMaxLines(i3);
            return;
        }
        AdaptiveMaxLines adaptiveMaxLines2 = new AdaptiveMaxLines(divLineHeightTextView, div2View.getViewComponent().getDrawingPassOverrideStrategy());
        long longValue2 = l.longValue();
        long j2 = longValue2 >> 31;
        if (j2 == 0 || j2 == -1) {
            i = (int) longValue2;
        } else {
            KAssert kAssert2 = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable convert '" + longValue2 + "' to Int");
            }
            i = longValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        long longValue3 = l2.longValue();
        long j3 = longValue3 >> 31;
        if (j3 == 0 || j3 == -1) {
            i2 = (int) longValue3;
        } else {
            KAssert kAssert3 = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable convert '" + longValue3 + "' to Int");
            }
            if (longValue3 > 0) {
                i2 = Integer.MAX_VALUE;
            }
        }
        adaptiveMaxLines2.apply(new AdaptiveMaxLines.Params(i, i2));
        divLineHeightTextView.setAdaptiveMaxLines$div_release(adaptiveMaxLines2);
    }

    private final void bindFontSize(DivLineHeightTextView divLineHeightTextView, DivText divText, DivText divText2, ExpressionResolver expressionResolver) {
        TextViewExtensionsKt.observeFontSize(divLineHeightTextView, divText.fontSize, divText.fontSizeUnit, divText2 != null ? divText2.fontSize : null, divText2 != null ? divText2.fontSizeUnit : null, expressionResolver, divLineHeightTextView);
    }

    private final void bindLetterSpacing(DivLineHeightTextView divLineHeightTextView, DivText divText, DivText divText2, ExpressionResolver expressionResolver) {
        TextViewExtensionsKt.observeLetterSpacing(divLineHeightTextView, divText.letterSpacing, divText.fontSize, divText2 != null ? divText2.letterSpacing : null, divText2 != null ? divText2.fontSize : null, expressionResolver, divLineHeightTextView);
    }

    private final void bindFontFeatureSettings(final DivLineHeightTextView divLineHeightTextView, final DivText divText, DivText divText2, final ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(divText.fontFeatureSettings, divText2 != null ? divText2.fontFeatureSettings : null)) {
            return;
        }
        Expression expression = divText.fontFeatureSettings;
        applyFontFeatureSettings(divLineHeightTextView, expression != null ? (String) expression.evaluate(expressionResolver) : null);
        if (ExpressionsKt.isConstantOrNull(divText.fontFeatureSettings)) {
            return;
        }
        Function1 function1 = new Function1() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindFontFeatureSettings$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7226invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7226invoke(@NotNull Object obj) {
                DivTextBinder divTextBinder = DivTextBinder.this;
                DivLineHeightTextView divLineHeightTextView2 = divLineHeightTextView;
                Expression expression2 = divText.fontFeatureSettings;
                divTextBinder.applyFontFeatureSettings(divLineHeightTextView2, expression2 != null ? (String) expression2.evaluate(expressionResolver) : null);
            }
        };
        Expression expression2 = divText.fontFeatureSettings;
        divLineHeightTextView.addSubscription(expression2 != null ? expression2.observe(expressionResolver, function1) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyFontFeatureSettings(TextView textView, String str) {
        if (str == null || !(!StringsKt.isBlank(str))) {
            str = null;
        }
        textView.setFontFeatureSettings(str);
    }

    private final void bindTypeface(DivLineHeightTextView divLineHeightTextView, DivText divText, DivText divText2, ExpressionResolver expressionResolver) {
        TextViewExtensionsKt.observeTypeface(divLineHeightTextView, divText.fontFamily, divText.fontWeight, divText.fontWeightValue, divText.fontVariationSettings, divText2 != null ? divText2.fontFamily : null, divText2 != null ? divText2.fontWeight : null, divText2 != null ? divText2.fontWeightValue : null, divText2 != null ? divText2.fontVariationSettings : null, divText2, this.typefaceResolver, expressionResolver);
    }

    private final void bindTextColor(final DivLineHeightTextView divLineHeightTextView, final DivText divText, DivText divText2, final ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(divText.textColor, divText2 != null ? divText2.textColor : null)) {
            if (ExpressionsKt.equalsToConstant(divText.focusedTextColor, divText2 != null ? divText2.focusedTextColor : null)) {
                return;
            }
        }
        int intValue = ((Number) divText.textColor.evaluate(expressionResolver)).intValue();
        Expression expression = divText.focusedTextColor;
        applyTextColor(divLineHeightTextView, intValue, expression != null ? (Integer) expression.evaluate(expressionResolver) : null);
        if (ExpressionsKt.isConstant(divText.textColor) && ExpressionsKt.isConstantOrNull(divText.focusedTextColor)) {
            return;
        }
        Function1 function1 = new Function1() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindTextColor$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7233invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7233invoke(@NotNull Object obj) {
                DivTextBinder divTextBinder = DivTextBinder.this;
                DivLineHeightTextView divLineHeightTextView2 = divLineHeightTextView;
                int intValue2 = ((Number) divText.textColor.evaluate(expressionResolver)).intValue();
                Expression expression2 = divText.focusedTextColor;
                divTextBinder.applyTextColor(divLineHeightTextView2, intValue2, expression2 != null ? (Integer) expression2.evaluate(expressionResolver) : null);
            }
        };
        divLineHeightTextView.addSubscription(divText.textColor.observe(expressionResolver, function1));
        Expression expression2 = divText.focusedTextColor;
        divLineHeightTextView.addSubscription(expression2 != null ? expression2.observe(expressionResolver, function1) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyTextColor(TextView textView, int i, Integer num) {
        textView.setTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_focused}, new int[0]}, new int[]{num != null ? num.intValue() : i, i}));
    }

    private final void bindUnderline(final DivLineHeightTextView divLineHeightTextView, DivText divText, DivText divText2, ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(divText.underline, divText2 != null ? divText2.underline : null)) {
            return;
        }
        applyUnderline(divLineHeightTextView, (DivLineStyle) divText.underline.evaluate(expressionResolver));
        if (ExpressionsKt.isConstant(divText.underline)) {
            return;
        }
        divLineHeightTextView.addSubscription(divText.underline.observe(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindUnderline$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DivLineStyle) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull DivLineStyle divLineStyle) {
                DivTextBinder.this.applyUnderline(divLineHeightTextView, divLineStyle);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyUnderline(TextView textView, DivLineStyle divLineStyle) {
        int i = WhenMappings.$EnumSwitchMapping$1[divLineStyle.ordinal()];
        if (i == 1) {
            textView.setPaintFlags(textView.getPaintFlags() | 8);
        } else {
            if (i != 2) {
                return;
            }
            textView.setPaintFlags(textView.getPaintFlags() & (-9));
        }
    }

    private final void bindStrikethrough(final DivLineHeightTextView divLineHeightTextView, DivText divText, DivText divText2, ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(divText.strike, divText2 != null ? divText2.strike : null)) {
            return;
        }
        applyStrikethrough(divLineHeightTextView, (DivLineStyle) divText.strike.evaluate(expressionResolver));
        if (ExpressionsKt.isConstant(divText.strike)) {
            return;
        }
        divLineHeightTextView.addSubscription(divText.strike.observe(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindStrikethrough$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DivLineStyle) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull DivLineStyle divLineStyle) {
                DivTextBinder.this.applyStrikethrough(divLineHeightTextView, divLineStyle);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyStrikethrough(TextView textView, DivLineStyle divLineStyle) {
        int i = WhenMappings.$EnumSwitchMapping$1[divLineStyle.ordinal()];
        if (i == 1) {
            textView.setPaintFlags(textView.getPaintFlags() | 16);
        } else {
            if (i != 2) {
                return;
            }
            textView.setPaintFlags(textView.getPaintFlags() & (-17));
        }
    }

    private final void bindSelectable(final DivLineHeightTextView divLineHeightTextView, DivText divText, DivText divText2, ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(divText.selectable, divText2 != null ? divText2.selectable : null)) {
            return;
        }
        applySelectable(divLineHeightTextView, ((Boolean) divText.selectable.evaluate(expressionResolver)).booleanValue());
        if (ExpressionsKt.isConstant(divText.selectable)) {
            return;
        }
        divLineHeightTextView.addSubscription(divText.selectable.observe(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindSelectable$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                DivTextBinder.this.applySelectable(divLineHeightTextView, z);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applySelectable(TextView textView, boolean z) {
        MovementMethod movementMethod = textView.getMovementMethod();
        textView.setTextIsSelectable(z);
        if (movementMethod instanceof SelectableLinkMovementMethod) {
            textView.setMovementMethod(movementMethod);
        }
    }

    private final void bindTightenWidth(final DivLineHeightTextView divLineHeightTextView, DivText divText, DivText divText2, ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(divText.tightenWidth, divText2 != null ? divText2.tightenWidth : null)) {
            return;
        }
        applyTightenWidth(divLineHeightTextView, ((Boolean) divText.tightenWidth.evaluate(expressionResolver)).booleanValue());
        if (ExpressionsKt.isConstant(divText.tightenWidth)) {
            return;
        }
        divLineHeightTextView.addSubscription(divText.tightenWidth.observe(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindTightenWidth$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                DivTextBinder.this.applyTightenWidth(divLineHeightTextView, z);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyTightenWidth(DivLineHeightTextView divLineHeightTextView, boolean z) {
        divLineHeightTextView.setTightenWidth(z);
    }

    private final void bindTextGradient(DivLineHeightTextView divLineHeightTextView, Div2View div2View, DivText divText, DivText divText2, ExpressionResolver expressionResolver) {
        DivTextGradient divTextGradient = divText.textGradient;
        if (divTextGradient == null) {
            divLineHeightTextView.getPaint().setShader(null);
        } else if (divTextGradient instanceof DivTextGradient.Linear) {
            bindLinearTextGradient(divLineHeightTextView, div2View, ((DivTextGradient.Linear) divTextGradient).getValue(), divText2 != null ? divText2.textGradient : null, expressionResolver);
        } else if (divTextGradient instanceof DivTextGradient.Radial) {
            bindRadialTextGradient(divLineHeightTextView, ((DivTextGradient.Radial) divTextGradient).getValue(), divText2 != null ? divText2.textGradient : null, expressionResolver);
        }
    }

    private final void bindLinearTextGradient(final DivLineHeightTextView divLineHeightTextView, final Div2View div2View, final DivLinearGradient divLinearGradient, DivTextGradient divTextGradient, final ExpressionResolver expressionResolver) {
        if (divTextGradient instanceof DivTextGradient.Linear) {
            DivTextGradient.Linear linear = (DivTextGradient.Linear) divTextGradient;
            if (ExpressionsKt.equalsToConstant(divLinearGradient.angle, linear.getValue().angle) && ExpressionsKt.equalsToConstant(divLinearGradient.colors, linear.getValue().colors)) {
                List list = divLinearGradient.colorMap;
                List list2 = linear.getValue().colorMap;
                if (list == null && list2 == null) {
                    return;
                }
                if (list != null && list2 != null && list.size() == list2.size()) {
                    int i = 0;
                    for (Object obj : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (DivDataExtensionsKt.equalsToConstant((DivLinearGradient.ColorPoint) obj, (DivLinearGradient.ColorPoint) list2.get(i))) {
                            i = i2;
                        }
                    }
                    return;
                }
            }
        }
        applyLinearTextGradientColor(divLineHeightTextView, ((Number) divLinearGradient.angle.evaluate(expressionResolver)).longValue(), ColormapKt.checkIsNotEmpty(DivDataExtensionsKt.toColormap(divLinearGradient, expressionResolver), div2View));
        if (ExpressionsKt.isConstant(divLinearGradient.angle) && ExpressionsKt.isConstantOrNull(divLinearGradient.colors)) {
            List list3 = divLinearGradient.colorMap;
            if (list3 != null) {
                List list4 = list3;
                if ((list4 instanceof Collection) && list4.isEmpty()) {
                    return;
                }
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    if (!DivDataExtensionsKt.isConstant((DivLinearGradient.ColorPoint) it.next())) {
                    }
                }
                return;
            }
            return;
        }
        Function1 function1 = new Function1() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindLinearTextGradient$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                m7227invoke(obj2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7227invoke(@NotNull Object obj2) {
                DivTextBinder.this.applyLinearTextGradientColor(divLineHeightTextView, ((Number) divLinearGradient.angle.evaluate(expressionResolver)).longValue(), ColormapKt.checkIsNotEmpty(DivDataExtensionsKt.toColormap(divLinearGradient, expressionResolver), div2View));
            }
        };
        divLineHeightTextView.addSubscription(divLinearGradient.angle.observe(expressionResolver, function1));
        ExpressionList expressionList = divLinearGradient.colors;
        divLineHeightTextView.addSubscription(expressionList != null ? expressionList.observe(expressionResolver, function1) : null);
        List list5 = divLinearGradient.colorMap;
        if (list5 != null) {
            Iterator it2 = list5.iterator();
            while (it2.hasNext()) {
                ExpressionSubscribersKt.observeColorPoint(divLineHeightTextView, (DivLinearGradient.ColorPoint) it2.next(), expressionResolver, function1);
            }
        }
    }

    private final void bindRadialTextGradient(final DivLineHeightTextView divLineHeightTextView, final DivRadialGradient divRadialGradient, DivTextGradient divTextGradient, final ExpressionResolver expressionResolver) {
        List<Integer> emptyList;
        if (divTextGradient instanceof DivTextGradient.Radial) {
            DivTextGradient.Radial radial = (DivTextGradient.Radial) divTextGradient;
            if (Intrinsics.areEqual(divRadialGradient.radius, radial.getValue().radius) && Intrinsics.areEqual(divRadialGradient.centerX, radial.getValue().centerX) && Intrinsics.areEqual(divRadialGradient.centerY, radial.getValue().centerY) && ExpressionsKt.equalsToConstant(divRadialGradient.colors, radial.getValue().colors)) {
                return;
            }
        }
        final DisplayMetrics displayMetrics = divLineHeightTextView.getResources().getDisplayMetrics();
        RadialGradientDrawable.Radius radialGradientDrawableRadius = toRadialGradientDrawableRadius(divRadialGradient.radius, displayMetrics, expressionResolver);
        RadialGradientDrawable.Center radialGradientDrawableCenter = toRadialGradientDrawableCenter(divRadialGradient.centerX, displayMetrics, expressionResolver);
        RadialGradientDrawable.Center radialGradientDrawableCenter2 = toRadialGradientDrawableCenter(divRadialGradient.centerY, displayMetrics, expressionResolver);
        ExpressionList expressionList = divRadialGradient.colors;
        if (expressionList == null || (emptyList = expressionList.evaluate(expressionResolver)) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        applyRadialTextGradientColor(divLineHeightTextView, radialGradientDrawableRadius, radialGradientDrawableCenter, radialGradientDrawableCenter2, emptyList);
        if (ExpressionsKt.isConstantOrNull(divRadialGradient.colors)) {
            return;
        }
        ExpressionList expressionList2 = divRadialGradient.colors;
        divLineHeightTextView.addSubscription(expressionList2 != null ? expressionList2.observe(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindRadialTextGradient$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((List<Integer>) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull List<Integer> list) {
                RadialGradientDrawable.Radius radialGradientDrawableRadius2;
                RadialGradientDrawable.Center radialGradientDrawableCenter3;
                RadialGradientDrawable.Center radialGradientDrawableCenter4;
                DivTextBinder divTextBinder = DivTextBinder.this;
                DivLineHeightTextView divLineHeightTextView2 = divLineHeightTextView;
                radialGradientDrawableRadius2 = divTextBinder.toRadialGradientDrawableRadius(divRadialGradient.radius, displayMetrics, expressionResolver);
                radialGradientDrawableCenter3 = DivTextBinder.this.toRadialGradientDrawableCenter(divRadialGradient.centerX, displayMetrics, expressionResolver);
                radialGradientDrawableCenter4 = DivTextBinder.this.toRadialGradientDrawableCenter(divRadialGradient.centerY, displayMetrics, expressionResolver);
                divTextBinder.applyRadialTextGradientColor(divLineHeightTextView2, radialGradientDrawableRadius2, radialGradientDrawableCenter3, radialGradientDrawableCenter4, list);
            }
        }) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getRealTextWidth(TextView textView) {
        return Math.min((textView.getWidth() - textView.getPaddingRight()) - textView.getPaddingLeft(), (int) textView.getPaint().measureText(textView.getText().toString()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RadialGradientDrawable.Radius toRadialGradientDrawableRadius(DivRadialGradientRadius divRadialGradientRadius, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        RadialGradientDrawable.Radius.Relative.Type type;
        if (divRadialGradientRadius instanceof DivRadialGradientRadius.FixedSize) {
            return new RadialGradientDrawable.Radius.Fixed(BaseDivViewExtensionsKt.dpToPxF((Number) ((DivRadialGradientRadius.FixedSize) divRadialGradientRadius).getValue().value.evaluate(expressionResolver), displayMetrics));
        }
        if (!(divRadialGradientRadius instanceof DivRadialGradientRadius.Relative)) {
            throw new NoWhenBranchMatchedException();
        }
        int i = WhenMappings.$EnumSwitchMapping$2[((DivRadialGradientRelativeRadius.Value) ((DivRadialGradientRadius.Relative) divRadialGradientRadius).getValue().value.evaluate(expressionResolver)).ordinal()];
        if (i == 1) {
            type = RadialGradientDrawable.Radius.Relative.Type.FARTHEST_CORNER;
        } else if (i == 2) {
            type = RadialGradientDrawable.Radius.Relative.Type.NEAREST_CORNER;
        } else if (i == 3) {
            type = RadialGradientDrawable.Radius.Relative.Type.FARTHEST_SIDE;
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            type = RadialGradientDrawable.Radius.Relative.Type.NEAREST_SIDE;
        }
        return new RadialGradientDrawable.Radius.Relative(type);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RadialGradientDrawable.Center toRadialGradientDrawableCenter(DivRadialGradientCenter divRadialGradientCenter, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        if (divRadialGradientCenter instanceof DivRadialGradientCenter.Fixed) {
            return new RadialGradientDrawable.Center.Fixed(BaseDivViewExtensionsKt.dpToPxF((Number) ((DivRadialGradientCenter.Fixed) divRadialGradientCenter).getValue().value.evaluate(expressionResolver), displayMetrics));
        }
        if (divRadialGradientCenter instanceof DivRadialGradientCenter.Relative) {
            return new RadialGradientDrawable.Center.Relative((float) ((Number) ((DivRadialGradientCenter.Relative) divRadialGradientCenter).getValue().value.evaluate(expressionResolver)).doubleValue());
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void bindText(DivLineHeightTextView divLineHeightTextView, BindingContext bindingContext, DivText divText, DivText divText2) {
        if (divText.ranges == null && divText.images == null) {
            bindPlainText(divLineHeightTextView, bindingContext, divText, divText2);
        } else {
            bindRichText(divLineHeightTextView, bindingContext, divText);
        }
    }

    private final void bindRichText(final DivLineHeightTextView divLineHeightTextView, final BindingContext bindingContext, final DivText divText) {
        DivStroke divStroke;
        Expression expression;
        DivStroke divStroke2;
        Expression expression2;
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        applyRichText(divLineHeightTextView, bindingContext, divText);
        applyHyphenation(divLineHeightTextView, (String) divText.text.evaluate(expressionResolver));
        divLineHeightTextView.addSubscription(divText.text.observe(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindRichText$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull String str) {
                DivTextBinder.this.applyRichText(divLineHeightTextView, bindingContext, divText);
                DivTextBinder.this.applyHyphenation(divLineHeightTextView, str);
            }
        }));
        Function1 function1 = new Function1() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindRichText$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7231invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7231invoke(@NotNull Object obj) {
                DivTextBinder.this.applyRichText(divLineHeightTextView, bindingContext, divText);
            }
        };
        divLineHeightTextView.addSubscription(divText.fontSize.observe(expressionResolver, function1));
        divLineHeightTextView.addSubscription(divText.fontSizeUnit.observe(expressionResolver, function1));
        Expression expression3 = divText.fontFamily;
        divLineHeightTextView.addSubscription(expression3 != null ? expression3.observe(expressionResolver, function1) : null);
        Expression expression4 = divText.lineHeight;
        divLineHeightTextView.addSubscription(expression4 != null ? expression4.observe(expressionResolver, function1) : null);
        List<DivText.Range> list = divText.ranges;
        if (list != null) {
            for (DivText.Range range : list) {
                divLineHeightTextView.addSubscription(range.start.observe(expressionResolver, function1));
                Expression expression5 = range.end;
                divLineHeightTextView.addSubscription(expression5 != null ? expression5.observe(expressionResolver, function1) : null);
                Expression expression6 = range.alignmentVertical;
                divLineHeightTextView.addSubscription(expression6 != null ? expression6.observe(expressionResolver, function1) : null);
                divLineHeightTextView.addSubscription(range.baselineOffset.observe(expressionResolver, function1));
                Expression expression7 = range.fontSize;
                divLineHeightTextView.addSubscription(expression7 != null ? expression7.observe(expressionResolver, function1) : null);
                divLineHeightTextView.addSubscription(range.fontSizeUnit.observe(expressionResolver, function1));
                Expression expression8 = range.fontFamily;
                divLineHeightTextView.addSubscription(expression8 != null ? expression8.observe(expressionResolver, function1) : null);
                Expression expression9 = range.fontWeight;
                divLineHeightTextView.addSubscription(expression9 != null ? expression9.observe(expressionResolver, function1) : null);
                Expression expression10 = range.fontWeightValue;
                divLineHeightTextView.addSubscription(expression10 != null ? expression10.observe(expressionResolver, function1) : null);
                Expression expression11 = range.fontFeatureSettings;
                divLineHeightTextView.addSubscription(expression11 != null ? expression11.observe(expressionResolver, function1) : null);
                Expression expression12 = range.letterSpacing;
                divLineHeightTextView.addSubscription(expression12 != null ? expression12.observe(expressionResolver, function1) : null);
                Expression expression13 = range.lineHeight;
                divLineHeightTextView.addSubscription(expression13 != null ? expression13.observe(expressionResolver, function1) : null);
                Expression expression14 = range.strike;
                divLineHeightTextView.addSubscription(expression14 != null ? expression14.observe(expressionResolver, function1) : null);
                Expression expression15 = range.textColor;
                divLineHeightTextView.addSubscription(expression15 != null ? expression15.observe(expressionResolver, function1) : null);
                Expression expression16 = range.topOffset;
                divLineHeightTextView.addSubscription(expression16 != null ? expression16.observe(expressionResolver, function1) : null);
                Expression expression17 = range.underline;
                divLineHeightTextView.addSubscription(expression17 != null ? expression17.observe(expressionResolver, function1) : null);
                DivTextRangeBackground divTextRangeBackground = range.background;
                Object value = divTextRangeBackground != null ? divTextRangeBackground.value() : null;
                if (value instanceof DivSolidBackground) {
                    divLineHeightTextView.addSubscription(((DivSolidBackground) value).color.observe(expressionResolver, function1));
                }
                DivTextRangeMask divTextRangeMask = range.mask;
                Object value2 = divTextRangeMask != null ? divTextRangeMask.value() : null;
                if (value2 instanceof DivTextRangeMaskSolid) {
                    DivTextRangeMaskSolid divTextRangeMaskSolid = (DivTextRangeMaskSolid) value2;
                    divLineHeightTextView.addSubscription(divTextRangeMaskSolid.isEnabled.observe(expressionResolver, function1));
                    divLineHeightTextView.addSubscription(divTextRangeMaskSolid.color.observe(expressionResolver, function1));
                } else if (value2 instanceof DivTextRangeMaskParticles) {
                    DivTextRangeMaskParticles divTextRangeMaskParticles = (DivTextRangeMaskParticles) value2;
                    divLineHeightTextView.addSubscription(divTextRangeMaskParticles.isEnabled.observe(expressionResolver, function1));
                    divLineHeightTextView.addSubscription(divTextRangeMaskParticles.color.observe(expressionResolver, function1));
                    divLineHeightTextView.addSubscription(divTextRangeMaskParticles.density.observe(expressionResolver, function1));
                    divLineHeightTextView.addSubscription(divTextRangeMaskParticles.isAnimated.observe(expressionResolver, function1));
                    divLineHeightTextView.addSubscription(divTextRangeMaskParticles.particleSize.value.observe(expressionResolver, function1));
                    divLineHeightTextView.addSubscription(divTextRangeMaskParticles.particleSize.unit.observe(expressionResolver, function1));
                }
                DivTextRangeBorder divTextRangeBorder = range.border;
                divLineHeightTextView.addSubscription((divTextRangeBorder == null || (divStroke2 = divTextRangeBorder.stroke) == null || (expression2 = divStroke2.color) == null) ? null : expression2.observe(expressionResolver, function1));
                DivTextRangeBorder divTextRangeBorder2 = range.border;
                divLineHeightTextView.addSubscription((divTextRangeBorder2 == null || (divStroke = divTextRangeBorder2.stroke) == null || (expression = divStroke.width) == null) ? null : expression.observe(expressionResolver, function1));
                if (TextViewExtensionsKt.getSupportFontVariations()) {
                    Expression expression18 = range.fontVariationSettings;
                    divLineHeightTextView.addSubscription(expression18 != null ? expression18.observe(expressionResolver, function1) : null);
                }
            }
        }
        List<DivText.Image> list2 = divText.images;
        if (list2 != null) {
            for (DivText.Image image : list2) {
                divLineHeightTextView.addSubscription(image.start.observe(expressionResolver, function1));
                divLineHeightTextView.addSubscription(image.indexingDirection.observe(expressionResolver, function1));
                divLineHeightTextView.addSubscription(image.url.observe(expressionResolver, function1));
                divLineHeightTextView.addSubscription(image.alignmentVertical.observe(expressionResolver, function1));
                Expression expression19 = image.tintColor;
                divLineHeightTextView.addSubscription(expression19 != null ? expression19.observe(expressionResolver, function1) : null);
                divLineHeightTextView.addSubscription(image.width.value.observe(expressionResolver, function1));
                divLineHeightTextView.addSubscription(image.width.unit.observe(expressionResolver, function1));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyRichText(final TextView textView, BindingContext bindingContext, DivText divText) {
        this.spannedTextBuilder.buildText(bindingContext, textView, divText, new Function1() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$applyRichText$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Spanned) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Spanned spanned) {
                textView.setText(spanned, TextView.BufferType.NORMAL);
            }
        });
    }

    private final void bindPlainText(final DivLineHeightTextView divLineHeightTextView, final BindingContext bindingContext, final DivText divText, DivText divText2) {
        if (ExpressionsKt.equalsToConstant(divText.text, divText2 != null ? divText2.text : null)) {
            if (ExpressionsKt.equalsToConstant(divText.lineHeight, divText2 != null ? divText2.lineHeight : null)) {
                if (ExpressionsKt.equalsToConstant(divText.fontSizeUnit, divText2 != null ? divText2.fontSizeUnit : null)) {
                    List extensions = divText.getExtensions();
                    List extensions2 = divText2 != null ? divText2.getExtensions() : null;
                    if (extensions == null && extensions2 == null) {
                        return;
                    }
                    if (extensions != null && extensions2 != null && extensions.size() == extensions2.size()) {
                        int i = 0;
                        for (Object obj : extensions) {
                            int i2 = i + 1;
                            if (i < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            if (Intrinsics.areEqual(((DivExtension) obj).id, ((DivExtension) extensions2.get(i)).id)) {
                                i = i2;
                            }
                        }
                        return;
                    }
                }
            }
        }
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        String str = (String) divText.text.evaluate(expressionResolver);
        applyPlainText(divLineHeightTextView, bindingContext, divText);
        applyHyphenation(divLineHeightTextView, str);
        if (ExpressionsKt.isConstant(divText.text) && ExpressionsKt.isConstantOrNull(divText.lineHeight) && ExpressionsKt.isConstantOrNull(divText.fontSizeUnit)) {
            return;
        }
        Function1 function1 = new Function1() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindPlainText$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                m7229invoke(obj2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7229invoke(@NotNull Object obj2) {
                String str2 = (String) DivText.this.text.evaluate(expressionResolver);
                this.applyPlainText(divLineHeightTextView, bindingContext, DivText.this);
                this.applyHyphenation(divLineHeightTextView, str2);
            }
        };
        divLineHeightTextView.addSubscription(divText.text.observe(expressionResolver, function1));
        Expression expression = divText.lineHeight;
        divLineHeightTextView.addSubscription(expression != null ? expression.observe(expressionResolver, function1) : null);
        divLineHeightTextView.addSubscription(divText.fontSizeUnit.observe(expressionResolver, function1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyPlainText(TextView textView, BindingContext bindingContext, DivText divText) {
        textView.setText(this.spannedTextBuilder.buildPlainText(bindingContext, textView, divText));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyHyphenation(TextView textView, String str) {
        if (TextViewsKt.checkHyphenationSupported()) {
            int hyphenationFrequency = textView.getHyphenationFrequency();
            int i = 0;
            if (this.isHyphenationEnabled && StringsKt.contains$default((CharSequence) str, (char) 173, false, 2, (Object) null)) {
                i = 1;
            }
            if (hyphenationFrequency != i) {
                textView.setHyphenationFrequency(i);
            }
        }
    }

    private final void bindEllipsis(DivLineHeightTextView divLineHeightTextView, BindingContext bindingContext, DivText divText, DivText divText2) {
        DivText.Ellipsis ellipsis = divText.ellipsis;
        if ((ellipsis != null ? ellipsis.ranges : null) == null) {
            if ((ellipsis != null ? ellipsis.images : null) == null) {
                if ((ellipsis != null ? ellipsis.actions : null) == null) {
                    bindPlainEllipsis(divLineHeightTextView, ellipsis, divText2 != null ? divText2.ellipsis : null, bindingContext.getExpressionResolver());
                    return;
                }
            }
        }
        bindRichEllipsis(divLineHeightTextView, bindingContext, divText);
    }

    private final void bindPlainEllipsis(final DivLineHeightTextView divLineHeightTextView, DivText.Ellipsis ellipsis, DivText.Ellipsis ellipsis2, ExpressionResolver expressionResolver) {
        Expression expression;
        Expression expression2;
        Disposable disposable = null;
        if (ExpressionsKt.equalsToConstant(ellipsis != null ? ellipsis.text : null, ellipsis2 != null ? ellipsis2.text : null)) {
            return;
        }
        applyPlainEllipsis(divLineHeightTextView, (ellipsis == null || (expression2 = ellipsis.text) == null) ? null : (String) expression2.evaluate(expressionResolver));
        if (ExpressionsKt.isConstantOrNull(ellipsis != null ? ellipsis.text : null)) {
            if (ExpressionsKt.isConstantOrNull(ellipsis != null ? ellipsis.text : null)) {
                return;
            }
        }
        if (ellipsis != null && (expression = ellipsis.text) != null) {
            disposable = expression.observe(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindPlainEllipsis$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((String) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull String str) {
                    DivTextBinder.this.applyPlainEllipsis(divLineHeightTextView, str);
                }
            });
        }
        divLineHeightTextView.addSubscription(disposable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyPlainEllipsis(DivLineHeightTextView divLineHeightTextView, String str) {
        if (str == null) {
            str = EllipsizedTextView.DEFAULT_ELLIPSIS;
        }
        divLineHeightTextView.setEllipsis(str);
    }

    private final void bindRichEllipsis(final DivLineHeightTextView divLineHeightTextView, final BindingContext bindingContext, final DivText divText) {
        DivStroke divStroke;
        Expression expression;
        DivStroke divStroke2;
        Expression expression2;
        applyRichEllipsis(divLineHeightTextView, bindingContext, divText);
        DivText.Ellipsis ellipsis = divText.ellipsis;
        if (ellipsis == null) {
            return;
        }
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        Function1 function1 = new Function1() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindRichEllipsis$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7230invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7230invoke(@NotNull Object obj) {
                DivTextBinder.this.applyRichEllipsis(divLineHeightTextView, bindingContext, divText);
            }
        };
        divLineHeightTextView.addSubscription(ellipsis.text.observe(expressionResolver, function1));
        List<DivText.Range> list = ellipsis.ranges;
        if (list != null) {
            for (DivText.Range range : list) {
                divLineHeightTextView.addSubscription(range.start.observe(expressionResolver, function1));
                Expression expression3 = range.end;
                divLineHeightTextView.addSubscription(expression3 != null ? expression3.observe(expressionResolver, function1) : null);
                Expression expression4 = range.alignmentVertical;
                divLineHeightTextView.addSubscription(expression4 != null ? expression4.observe(expressionResolver, function1) : null);
                divLineHeightTextView.addSubscription(range.baselineOffset.observe(expressionResolver, function1));
                Expression expression5 = range.fontSize;
                divLineHeightTextView.addSubscription(expression5 != null ? expression5.observe(expressionResolver, function1) : null);
                divLineHeightTextView.addSubscription(range.fontSizeUnit.observe(expressionResolver, function1));
                Expression expression6 = range.fontFamily;
                divLineHeightTextView.addSubscription(expression6 != null ? expression6.observe(expressionResolver, function1) : null);
                Expression expression7 = range.fontWeight;
                divLineHeightTextView.addSubscription(expression7 != null ? expression7.observe(expressionResolver, function1) : null);
                Expression expression8 = range.fontWeightValue;
                divLineHeightTextView.addSubscription(expression8 != null ? expression8.observe(expressionResolver, function1) : null);
                Expression expression9 = range.fontFeatureSettings;
                divLineHeightTextView.addSubscription(expression9 != null ? expression9.observe(expressionResolver, function1) : null);
                Expression expression10 = range.letterSpacing;
                divLineHeightTextView.addSubscription(expression10 != null ? expression10.observe(expressionResolver, function1) : null);
                Expression expression11 = range.lineHeight;
                divLineHeightTextView.addSubscription(expression11 != null ? expression11.observe(expressionResolver, function1) : null);
                Expression expression12 = range.strike;
                divLineHeightTextView.addSubscription(expression12 != null ? expression12.observe(expressionResolver, function1) : null);
                Expression expression13 = range.textColor;
                divLineHeightTextView.addSubscription(expression13 != null ? expression13.observe(expressionResolver, function1) : null);
                Expression expression14 = range.topOffset;
                divLineHeightTextView.addSubscription(expression14 != null ? expression14.observe(expressionResolver, function1) : null);
                Expression expression15 = range.underline;
                divLineHeightTextView.addSubscription(expression15 != null ? expression15.observe(expressionResolver, function1) : null);
                DivTextRangeBackground divTextRangeBackground = range.background;
                Object value = divTextRangeBackground != null ? divTextRangeBackground.value() : null;
                if (value instanceof DivSolidBackground) {
                    divLineHeightTextView.addSubscription(((DivSolidBackground) value).color.observe(expressionResolver, function1));
                }
                DivTextRangeMask divTextRangeMask = range.mask;
                Object value2 = divTextRangeMask != null ? divTextRangeMask.value() : null;
                if (value2 instanceof DivTextRangeMaskSolid) {
                    DivTextRangeMaskSolid divTextRangeMaskSolid = (DivTextRangeMaskSolid) value2;
                    divLineHeightTextView.addSubscription(divTextRangeMaskSolid.isEnabled.observe(expressionResolver, function1));
                    divLineHeightTextView.addSubscription(divTextRangeMaskSolid.color.observe(expressionResolver, function1));
                } else if (value2 instanceof DivTextRangeMaskParticles) {
                    DivTextRangeMaskParticles divTextRangeMaskParticles = (DivTextRangeMaskParticles) value2;
                    divLineHeightTextView.addSubscription(divTextRangeMaskParticles.isEnabled.observe(expressionResolver, function1));
                    divLineHeightTextView.addSubscription(divTextRangeMaskParticles.color.observe(expressionResolver, function1));
                    divLineHeightTextView.addSubscription(divTextRangeMaskParticles.density.observe(expressionResolver, function1));
                    divLineHeightTextView.addSubscription(divTextRangeMaskParticles.isAnimated.observe(expressionResolver, function1));
                    divLineHeightTextView.addSubscription(divTextRangeMaskParticles.particleSize.value.observe(expressionResolver, function1));
                    divLineHeightTextView.addSubscription(divTextRangeMaskParticles.particleSize.unit.observe(expressionResolver, function1));
                }
                DivTextRangeBorder divTextRangeBorder = range.border;
                divLineHeightTextView.addSubscription((divTextRangeBorder == null || (divStroke2 = divTextRangeBorder.stroke) == null || (expression2 = divStroke2.color) == null) ? null : expression2.observe(expressionResolver, function1));
                DivTextRangeBorder divTextRangeBorder2 = range.border;
                divLineHeightTextView.addSubscription((divTextRangeBorder2 == null || (divStroke = divTextRangeBorder2.stroke) == null || (expression = divStroke.width) == null) ? null : expression.observe(expressionResolver, function1));
                if (TextViewExtensionsKt.getSupportFontVariations()) {
                    Expression expression16 = range.fontVariationSettings;
                    divLineHeightTextView.addSubscription(expression16 != null ? expression16.observe(expressionResolver, function1) : null);
                }
            }
        }
        List<DivText.Image> list2 = ellipsis.images;
        if (list2 != null) {
            for (DivText.Image image : list2) {
                divLineHeightTextView.addSubscription(image.start.observe(expressionResolver, function1));
                divLineHeightTextView.addSubscription(image.url.observe(expressionResolver, function1));
                Expression expression17 = image.tintColor;
                divLineHeightTextView.addSubscription(expression17 != null ? expression17.observe(expressionResolver, function1) : null);
                divLineHeightTextView.addSubscription(image.width.value.observe(expressionResolver, function1));
                divLineHeightTextView.addSubscription(image.width.unit.observe(expressionResolver, function1));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyRichEllipsis(final EllipsizedTextView ellipsizedTextView, BindingContext bindingContext, DivText divText) {
        DivText.Ellipsis ellipsis = divText.ellipsis;
        if (ellipsis == null) {
            ellipsizedTextView.setEllipsis(EllipsizedTextView.DEFAULT_ELLIPSIS);
        } else {
            this.spannedTextBuilder.buildEllipsis(bindingContext, ellipsizedTextView, divText, ellipsis, new Function1() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$applyRichEllipsis$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Spanned) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull Spanned spanned) {
                    EllipsizedTextView.this.setEllipsis(spanned);
                }
            });
        }
    }

    private final void bindTextShadow(final DivLineHeightTextView divLineHeightTextView, final DivText divText, DivText divText2, final ExpressionResolver expressionResolver) {
        DivPoint divPoint;
        DivDimension divDimension;
        Expression expression;
        DivPoint divPoint2;
        DivDimension divDimension2;
        Expression expression2;
        DivPoint divPoint3;
        DivDimension divDimension3;
        Expression expression3;
        DivPoint divPoint4;
        DivDimension divDimension4;
        Expression expression4;
        Expression expression5;
        Expression expression6;
        Expression expression7;
        DivPoint divPoint5;
        DivDimension divDimension5;
        DivPoint divPoint6;
        DivDimension divDimension6;
        DivPoint divPoint7;
        DivDimension divDimension7;
        DivPoint divPoint8;
        DivDimension divDimension8;
        DivShadow divShadow;
        DivPoint divPoint9;
        DivDimension divDimension9;
        DivPoint divPoint10;
        DivDimension divDimension10;
        DivShadow divShadow2;
        DivPoint divPoint11;
        DivDimension divDimension11;
        DivPoint divPoint12;
        DivDimension divDimension12;
        DivShadow divShadow3;
        DivPoint divPoint13;
        DivDimension divDimension13;
        DivPoint divPoint14;
        DivDimension divDimension14;
        DivShadow divShadow4;
        DivPoint divPoint15;
        DivDimension divDimension15;
        DivPoint divPoint16;
        DivDimension divDimension16;
        DivShadow divShadow5;
        DivShadow divShadow6;
        DivShadow divShadow7;
        DivShadow divShadow8 = divText.textShadow;
        Disposable disposable = null;
        if (ExpressionsKt.equalsToConstant(divShadow8 != null ? divShadow8.alpha : null, (divText2 == null || (divShadow7 = divText2.textShadow) == null) ? null : divShadow7.alpha)) {
            DivShadow divShadow9 = divText.textShadow;
            if (ExpressionsKt.equalsToConstant(divShadow9 != null ? divShadow9.blur : null, (divText2 == null || (divShadow6 = divText2.textShadow) == null) ? null : divShadow6.blur)) {
                DivShadow divShadow10 = divText.textShadow;
                if (ExpressionsKt.equalsToConstant(divShadow10 != null ? divShadow10.color : null, (divText2 == null || (divShadow5 = divText2.textShadow) == null) ? null : divShadow5.color)) {
                    DivShadow divShadow11 = divText.textShadow;
                    if (ExpressionsKt.equalsToConstant((divShadow11 == null || (divPoint16 = divShadow11.offset) == null || (divDimension16 = divPoint16.x) == null) ? null : divDimension16.value, (divText2 == null || (divShadow4 = divText2.textShadow) == null || (divPoint15 = divShadow4.offset) == null || (divDimension15 = divPoint15.x) == null) ? null : divDimension15.value)) {
                        DivShadow divShadow12 = divText.textShadow;
                        if (ExpressionsKt.equalsToConstant((divShadow12 == null || (divPoint14 = divShadow12.offset) == null || (divDimension14 = divPoint14.x) == null) ? null : divDimension14.unit, (divText2 == null || (divShadow3 = divText2.textShadow) == null || (divPoint13 = divShadow3.offset) == null || (divDimension13 = divPoint13.x) == null) ? null : divDimension13.unit)) {
                            DivShadow divShadow13 = divText.textShadow;
                            if (ExpressionsKt.equalsToConstant((divShadow13 == null || (divPoint12 = divShadow13.offset) == null || (divDimension12 = divPoint12.y) == null) ? null : divDimension12.value, (divText2 == null || (divShadow2 = divText2.textShadow) == null || (divPoint11 = divShadow2.offset) == null || (divDimension11 = divPoint11.y) == null) ? null : divDimension11.value)) {
                                DivShadow divShadow14 = divText.textShadow;
                                if (ExpressionsKt.equalsToConstant((divShadow14 == null || (divPoint10 = divShadow14.offset) == null || (divDimension10 = divPoint10.y) == null) ? null : divDimension10.unit, (divText2 == null || (divShadow = divText2.textShadow) == null || (divPoint9 = divShadow.offset) == null || (divDimension9 = divPoint9.y) == null) ? null : divDimension9.unit)) {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        final DivShadow divShadow15 = divText.textShadow;
        final DisplayMetrics displayMetrics = divLineHeightTextView.getResources().getDisplayMetrics();
        applyTextShadow(divLineHeightTextView, divShadow15 != null ? getShadowData(divShadow15, expressionResolver, displayMetrics, ((Number) divText.textColor.evaluate(expressionResolver)).intValue()) : null);
        DivShadow divShadow16 = divText.textShadow;
        if (ExpressionsKt.isConstantOrNull(divShadow16 != null ? divShadow16.alpha : null)) {
            DivShadow divShadow17 = divText.textShadow;
            if (ExpressionsKt.isConstantOrNull(divShadow17 != null ? divShadow17.blur : null)) {
                DivShadow divShadow18 = divText.textShadow;
                if (ExpressionsKt.isConstantOrNull(divShadow18 != null ? divShadow18.color : null)) {
                    DivShadow divShadow19 = divText.textShadow;
                    if (ExpressionsKt.isConstantOrNull((divShadow19 == null || (divPoint8 = divShadow19.offset) == null || (divDimension8 = divPoint8.x) == null) ? null : divDimension8.value)) {
                        DivShadow divShadow20 = divText.textShadow;
                        if (ExpressionsKt.isConstantOrNull((divShadow20 == null || (divPoint7 = divShadow20.offset) == null || (divDimension7 = divPoint7.x) == null) ? null : divDimension7.unit)) {
                            DivShadow divShadow21 = divText.textShadow;
                            if (ExpressionsKt.isConstantOrNull((divShadow21 == null || (divPoint6 = divShadow21.offset) == null || (divDimension6 = divPoint6.y) == null) ? null : divDimension6.value)) {
                                DivShadow divShadow22 = divText.textShadow;
                                if (ExpressionsKt.isConstantOrNull((divShadow22 == null || (divPoint5 = divShadow22.offset) == null || (divDimension5 = divPoint5.y) == null) ? null : divDimension5.unit)) {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        Function1 function1 = new Function1() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindTextShadow$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7234invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7234invoke(@NotNull Object obj) {
                ShadowData shadowData;
                DivTextBinder divTextBinder = DivTextBinder.this;
                DivLineHeightTextView divLineHeightTextView2 = divLineHeightTextView;
                DivShadow divShadow23 = divShadow15;
                if (divShadow23 != null) {
                    ExpressionResolver expressionResolver2 = expressionResolver;
                    shadowData = divTextBinder.getShadowData(divShadow23, expressionResolver2, displayMetrics, ((Number) divText.textColor.evaluate(expressionResolver2)).intValue());
                } else {
                    shadowData = null;
                }
                divTextBinder.applyTextShadow(divLineHeightTextView2, shadowData);
            }
        };
        divLineHeightTextView.addSubscription((divShadow15 == null || (expression7 = divShadow15.alpha) == null) ? null : expression7.observe(expressionResolver, function1));
        divLineHeightTextView.addSubscription((divShadow15 == null || (expression6 = divShadow15.color) == null) ? null : expression6.observe(expressionResolver, function1));
        divLineHeightTextView.addSubscription((divShadow15 == null || (expression5 = divShadow15.blur) == null) ? null : expression5.observe(expressionResolver, function1));
        divLineHeightTextView.addSubscription((divShadow15 == null || (divPoint4 = divShadow15.offset) == null || (divDimension4 = divPoint4.x) == null || (expression4 = divDimension4.value) == null) ? null : expression4.observe(expressionResolver, function1));
        divLineHeightTextView.addSubscription((divShadow15 == null || (divPoint3 = divShadow15.offset) == null || (divDimension3 = divPoint3.x) == null || (expression3 = divDimension3.unit) == null) ? null : expression3.observe(expressionResolver, function1));
        divLineHeightTextView.addSubscription((divShadow15 == null || (divPoint2 = divShadow15.offset) == null || (divDimension2 = divPoint2.y) == null || (expression2 = divDimension2.value) == null) ? null : expression2.observe(expressionResolver, function1));
        if (divShadow15 != null && (divPoint = divShadow15.offset) != null && (divDimension = divPoint.y) != null && (expression = divDimension.unit) != null) {
            disposable = expression.observe(expressionResolver, function1);
        }
        divLineHeightTextView.addSubscription(disposable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyTextShadow(TextView textView, ShadowData shadowData) {
        DivViewWrapper divViewWrapper;
        if (shadowData == null) {
            ViewParent parent = textView.getParent();
            divViewWrapper = parent instanceof DivViewWrapper ? (DivViewWrapper) parent : null;
            if (divViewWrapper != null) {
                divViewWrapper.setClipChildren(true);
                divViewWrapper.setClipToPadding(true);
            }
            textView.setClipToOutline(true);
            textView.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            return;
        }
        ViewParent parent2 = textView.getParent();
        divViewWrapper = parent2 instanceof DivViewWrapper ? (DivViewWrapper) parent2 : null;
        if (divViewWrapper != null) {
            divViewWrapper.setClipChildren(false);
            divViewWrapper.setClipToPadding(false);
        }
        textView.setClipToOutline(false);
        textView.setShadowLayer(shadowData.getRadius(), shadowData.getOffsetX(), shadowData.getOffsetY(), shadowData.getColor());
    }

    private final void bindEllipsize(final DivLineHeightTextView divLineHeightTextView, final DivText divText, DivText divText2, final ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(divText.autoEllipsize, divText2 != null ? divText2.autoEllipsize : null)) {
            if (ExpressionsKt.equalsToConstant(divText.truncate, divText2 != null ? divText2.truncate : null)) {
                return;
            }
        }
        applyEllipsize(divLineHeightTextView, divText, expressionResolver);
        if (ExpressionsKt.isConstantOrNull(divText.autoEllipsize) && ExpressionsKt.isConstant(divText.truncate)) {
            return;
        }
        Function1 function1 = new Function1() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindEllipsize$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7225invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7225invoke(@NotNull Object obj) {
                DivTextBinder.this.applyEllipsize(divLineHeightTextView, divText, expressionResolver);
            }
        };
        Expression expression = divText.autoEllipsize;
        if (expression != null) {
            divLineHeightTextView.addSubscription(expression.observe(expressionResolver, function1));
        }
        divLineHeightTextView.addSubscription(divText.truncate.observe(expressionResolver, function1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        if ((r6 != null ? ((java.lang.Boolean) r6.evaluate(r7)).booleanValue() : false) != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void applyEllipsize(DivLineHeightTextView divLineHeightTextView, DivText divText, ExpressionResolver expressionResolver) {
        TextUtils.TruncateAt truncateAt;
        DivText.Truncate truncate = (DivText.Truncate) divText.truncate.evaluate(expressionResolver);
        int i = WhenMappings.$EnumSwitchMapping$3[truncate.ordinal()];
        boolean z = true;
        if (i == 1) {
            truncateAt = null;
        } else if (i == 2) {
            truncateAt = TextUtils.TruncateAt.START;
        } else if (i == 3) {
            truncateAt = TextUtils.TruncateAt.MIDDLE;
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            truncateAt = TextUtils.TruncateAt.END;
        }
        divLineHeightTextView.setEllipsisLocation(truncateAt);
        if (truncate != DivText.Truncate.NONE) {
            Expression expression = divText.autoEllipsize;
        }
        z = false;
        divLineHeightTextView.setAutoEllipsize(z);
    }

    private final void updateFocusableState(View view, DivText divText) {
        view.setFocusable(view.isFocusable() || divText.focusedTextColor != null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ShadowData getShadowData(DivShadow divShadow, ExpressionResolver expressionResolver, DisplayMetrics displayMetrics, int i) {
        float dpToPxF = BaseDivViewExtensionsKt.dpToPxF((Number) divShadow.blur.evaluate(expressionResolver), displayMetrics);
        float px = BaseDivViewExtensionsKt.toPx(divShadow.offset.x, displayMetrics, expressionResolver);
        float px2 = BaseDivViewExtensionsKt.toPx(divShadow.offset.y, displayMetrics, expressionResolver);
        Paint paint = new Paint();
        paint.setColor(((Number) divShadow.color.evaluate(expressionResolver)).intValue());
        paint.setAlpha((int) (((Number) divShadow.alpha.evaluate(expressionResolver)).doubleValue() * (i >>> 24)));
        return new ShadowData(px, px2, dpToPxF, paint.getColor());
    }
}
