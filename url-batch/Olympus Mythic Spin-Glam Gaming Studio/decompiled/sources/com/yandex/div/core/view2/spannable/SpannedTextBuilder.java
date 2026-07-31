package com.yandex.div.core.view2.spannable;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.style.StrikethroughSpan;
import android.text.style.UnderlineSpan;
import android.util.DisplayMetrics;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.core.view.ViewCompat;
import com.ironsource.X3;
import com.yandex.div.core.DivIdLoggingImageDownloadCallback;
import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.div.core.images.CachedBitmap;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.text.DivBackgroundSpan;
import com.yandex.div.core.util.text.DivTextRangesBackgroundHelper;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivTypefaceResolver;
import com.yandex.div.core.view2.DivTypefaceResolverKt;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.TextViewExtensionsKt;
import com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView;
import com.yandex.div.core.view2.divs.widgets.DivLineHeightTextViewKt;
import com.yandex.div.core.view2.spannable.ImageSpan;
import com.yandex.div.core.view2.spannable.MaskData;
import com.yandex.div.core.view2.text.SelectableLinkMovementMethod;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.spannable.LetterSpacingSpan;
import com.yandex.div.internal.spannable.NoStrikethroughSpan;
import com.yandex.div.internal.spannable.NoUnderlineSpan;
import com.yandex.div.internal.spannable.TextColorSpan;
import com.yandex.div.internal.spannable.TypefaceSpan;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivBlendMode;
import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivLineStyle;
import com.yandex.div2.DivShadow;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivText;
import com.yandex.div2.DivTextAlignmentVertical;
import com.yandex.div2.DivTextRangeBackground;
import com.yandex.div2.DivTextRangeBorder;
import com.yandex.div2.DivTextRangeMask;
import com.yandex.div2.DivTextRangeMaskParticles;
import com.yandex.div2.DivTextRangeMaskSolid;
import io.appmetrica.analytics.impl.M2;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: SpannedTextBuilder.kt */
@Metadata(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 P2\u00020\u0001:\u0002PQB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J@\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0002JD\u0010\u0019\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J0\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J(\u0010$\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010 \u001a\u00020!2\u0006\u0010%\u001a\u00020&H\u0002JD\u0010'\u001a\u00020(2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u001c\b\u0002\u0010-\u001a\u0016\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\f\u0018\u00010.j\u0004\u0018\u0001`/J\u001e\u00100\u001a\u00020(2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010)\u001a\u00020*J<\u00101\u001a\u00020(2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010)\u001a\u00020*2\u001c\b\u0002\u0010-\u001a\u0016\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\f\u0018\u00010.j\u0004\u0018\u0001`/Jv\u00101\u001a\u00020(2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010)\u001a\u00020*2\u0006\u00102\u001a\u0002032\u000e\u00104\u001a\n\u0012\u0004\u0012\u000205\u0018\u00010\u00172\u000e\u00106\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u00172\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\u001c\b\u0002\u0010-\u001a\u0016\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\f\u0018\u00010.j\u0004\u0018\u0001`/H\u0002J$\u00107\u001a\u0004\u0018\u0001082\u0006\u00109\u001a\u00020:2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010;\u001a\u0004\u0018\u00010<H\u0002J.\u0010=\u001a\u0004\u0018\u00010>2\u0006\u00109\u001a\u00020:2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010?\u001a\u0004\u0018\u00010@2\b\b\u0001\u0010A\u001a\u00020\u0014H\u0002J8\u0010B\u001a\u00020&2\u0006\u00109\u001a\u00020:2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020!2\u0006\u0010C\u001a\u0002052\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J(\u0010D\u001a\u00020!2\u0006\u00109\u001a\u00020:2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020*2\u0006\u00102\u001a\u000203H\u0002J(\u0010E\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010F\u001a\u00020\u0014H\u0002J \u0010G\u001a\u00020\u00142\u0006\u0010H\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020#2\u0006\u0010I\u001a\u00020JH\u0002J.\u0010K\u001a\b\u0012\u0004\u0012\u00020#0\u00172\u0006\u0010 \u001a\u00020!2\u000e\u00106\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u00172\u0006\u0010I\u001a\u00020JH\u0002J6\u0010L\u001a\b\u0012\u0004\u0012\u00020&0\u00172\u0006\u00109\u001a\u00020:2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020!2\u000e\u00104\u001a\n\u0012\u0004\u0012\u000205\u0018\u00010\u0017H\u0002J\f\u0010M\u001a\u00020N*\u00020OH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006R"}, d2 = {"Lcom/yandex/div/core/view2/spannable/SpannedTextBuilder;", "", "typefaceResolver", "Lcom/yandex/div/core/view2/DivTypefaceResolver;", "imageLoader", "Lcom/yandex/div/core/images/DivImageLoader;", "(Lcom/yandex/div/core/view2/DivTypefaceResolver;Lcom/yandex/div/core/images/DivImageLoader;)V", "debugFontMetrics", "", "tempPaint", "Landroid/graphics/Paint;", "addActionSpan", "", "bindingContext", "Lcom/yandex/div/core/view2/BindingContext;", "textView", "Landroid/widget/TextView;", "spannedText", "Landroid/text/Spannable;", "start", "", "end", "actions", "", "Lcom/yandex/div2/DivAction;", "addDecorationSpan", "border", "Lcom/yandex/div2/DivTextRangeBorder;", M2.g, "Lcom/yandex/div2/DivTextRangeBackground;", "addImageSpan", "Lcom/yandex/div/core/view2/spannable/ImageSpan;", "textData", "Lcom/yandex/div/core/view2/spannable/TextData;", "image", "Lcom/yandex/div2/DivText$Image;", "addSpan", "span", "Lcom/yandex/div/core/view2/spannable/SpanData;", "buildEllipsis", "Landroid/text/Spanned;", "divText", "Lcom/yandex/div2/DivText;", "ellipsis", "Lcom/yandex/div2/DivText$Ellipsis;", "textConsumer", "Lkotlin/Function1;", "Lcom/yandex/div/core/view2/spannable/TextConsumer;", "buildPlainText", "buildText", "text", "", "ranges", "Lcom/yandex/div2/DivText$Range;", "images", "createMaskData", "Lcom/yandex/div/core/view2/spannable/MaskData;", "context", "Landroid/content/Context;", "mask", "Lcom/yandex/div2/DivTextRangeMask;", "createShadowData", "Lcom/yandex/div/core/view2/spannable/ShadowData;", "shadow", "Lcom/yandex/div2/DivShadow;", "textColor", "createSpanData", "range", "createTextData", "getActionsForPosition", X3.i.L, "imagePosition", "textLength", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "preprocessImages", "preprocessSpans", "toTextVerticalAlignment", "Lcom/yandex/div/core/view2/spannable/TextVerticalAlignment;", "Lcom/yandex/div2/DivTextAlignmentVertical;", "Companion", "ImageDownloadCallbackImpl", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@DivScope
/* loaded from: classes12.dex */
public final class SpannedTextBuilder {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String IMAGE_PLACEHOLDER = "#";

    @NotNull
    private static final String WORD_JOINER = "\u2060";

    @NotNull
    private static final String ZWSP = "\u200b";
    private final boolean debugFontMetrics;

    @NotNull
    private final DivImageLoader imageLoader;

    @NotNull
    private final Paint tempPaint = new Paint();

    @NotNull
    private final DivTypefaceResolver typefaceResolver;

    /* compiled from: SpannedTextBuilder.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[DivText.Image.IndexingDirection.values().length];
            try {
                iArr[DivText.Image.IndexingDirection.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivText.Image.IndexingDirection.REVERSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DivLineStyle.values().length];
            try {
                iArr2[DivLineStyle.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[DivLineStyle.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[DivText.Image.Accessibility.Type.values().length];
            try {
                iArr3[DivText.Image.Accessibility.Type.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[DivText.Image.Accessibility.Type.BUTTON.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[DivText.Image.Accessibility.Type.IMAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[DivText.Image.Accessibility.Type.TEXT.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[DivText.Image.Accessibility.Type.AUTO.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[DivTextAlignmentVertical.values().length];
            try {
                iArr4[DivTextAlignmentVertical.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[DivTextAlignmentVertical.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[DivTextAlignmentVertical.BASELINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[DivTextAlignmentVertical.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    private final List<DivAction> getActionsForPosition(BindingContext bindingContext, Spannable spannedText, int position) {
        PerformActionSpan[] performActionSpanArr = (PerformActionSpan[]) spannedText.getSpans(position, position + 1, PerformActionSpan.class);
        if (performActionSpanArr.length > 1) {
            DivActionTypedUtilsKt.logWarning(bindingContext.getDivView(), new Throwable("Two or more clickable ranges intersect."));
        }
        PerformActionSpan performActionSpan = (PerformActionSpan) ArraysKt.firstOrNull(performActionSpanArr);
        if (performActionSpan != null) {
            return performActionSpan.getActions();
        }
        return null;
    }

    public SpannedTextBuilder(@NotNull DivTypefaceResolver divTypefaceResolver, @NotNull DivImageLoader divImageLoader) {
        this.typefaceResolver = divTypefaceResolver;
        this.imageLoader = divImageLoader;
    }

    @NotNull
    public final Spanned buildPlainText(@NotNull BindingContext bindingContext, @NotNull TextView textView, @NotNull DivText divText) {
        return buildText(bindingContext, textView, divText, (String) divText.text.evaluate(bindingContext.getExpressionResolver()), null, null, null, null);
    }

    public static /* synthetic */ Spanned buildText$default(SpannedTextBuilder spannedTextBuilder, BindingContext bindingContext, TextView textView, DivText divText, Function1 function1, int i, Object obj) {
        if ((i & 8) != 0) {
            function1 = null;
        }
        return spannedTextBuilder.buildText(bindingContext, textView, divText, function1);
    }

    @NotNull
    public final Spanned buildText(@NotNull BindingContext bindingContext, @NotNull TextView textView, @NotNull DivText divText, @Nullable Function1 textConsumer) {
        return buildText(bindingContext, textView, divText, (String) divText.text.evaluate(bindingContext.getExpressionResolver()), divText.ranges, divText.images, null, textConsumer);
    }

    public static /* synthetic */ Spanned buildEllipsis$default(SpannedTextBuilder spannedTextBuilder, BindingContext bindingContext, TextView textView, DivText divText, DivText.Ellipsis ellipsis, Function1 function1, int i, Object obj) {
        if ((i & 16) != 0) {
            function1 = null;
        }
        return spannedTextBuilder.buildEllipsis(bindingContext, textView, divText, ellipsis, function1);
    }

    @NotNull
    public final Spanned buildEllipsis(@NotNull BindingContext bindingContext, @NotNull TextView textView, @NotNull DivText divText, @NotNull DivText.Ellipsis ellipsis, @Nullable Function1 textConsumer) {
        return buildText(bindingContext, textView, divText, (String) ellipsis.text.evaluate(bindingContext.getExpressionResolver()), ellipsis.ranges, ellipsis.images, ellipsis.actions, textConsumer);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* JADX INFO: Access modifiers changed from: private */
    public final android.text.Spanned buildText(com.yandex.div.core.view2.BindingContext r29, android.widget.TextView r30, com.yandex.div2.DivText r31, java.lang.String r32, java.util.List<com.yandex.div2.DivText.Range> r33, java.util.List<com.yandex.div2.DivText.Image> r34, java.util.List<com.yandex.div2.DivAction> r35, kotlin.jvm.functions.Function1 r36) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.spannable.SpannedTextBuilder.buildText(com.yandex.div.core.view2.BindingContext, android.widget.TextView, com.yandex.div2.DivText, java.lang.String, java.util.List, java.util.List, java.util.List, kotlin.jvm.functions.Function1):android.text.Spanned");
    }

    private final List<SpanData> preprocessSpans(Context context, BindingContext bindingContext, TextData textData, List<DivText.Range> ranges) {
        int i;
        int i2;
        int i3;
        int i4;
        List<DivText.Range> list;
        if (textData.getLineHeight() == null && ((list = ranges) == null || list.isEmpty())) {
            return CollectionsKt.emptyList();
        }
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        int textLength = textData.getTextLength();
        int size = ranges != null ? ranges.size() : 0;
        TreeSet sortedSetOf = SetsKt.sortedSetOf(new Integer[0]);
        ArrayList arrayList = new ArrayList(size + 1);
        if (ranges != null) {
            for (DivText.Range range : ranges) {
                long longValue = ((Number) range.start.evaluate(expressionResolver)).longValue();
                long j = longValue >> 31;
                if (j == 0 || j == -1) {
                    i2 = (int) longValue;
                } else {
                    KAssert kAssert = KAssert.INSTANCE;
                    if (Assert.isEnabled()) {
                        Assert.fail("Unable convert '" + longValue + "' to Int");
                    }
                    i2 = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                int coerceAtMost = RangesKt.coerceAtMost(i2, textLength);
                Expression expression = range.end;
                if (expression != null) {
                    long longValue2 = ((Number) expression.evaluate(expressionResolver)).longValue();
                    long j2 = longValue2 >> 31;
                    if (j2 == 0 || j2 == -1) {
                        i4 = (int) longValue2;
                    } else {
                        KAssert kAssert2 = KAssert.INSTANCE;
                        if (Assert.isEnabled()) {
                            Assert.fail("Unable convert '" + longValue2 + "' to Int");
                        }
                        i4 = longValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                    }
                    i3 = RangesKt.coerceAtMost(i4, textLength);
                } else {
                    i3 = textLength;
                }
                if (coerceAtMost < i3) {
                    SpanData createSpanData = createSpanData(context, bindingContext, textData, range, coerceAtMost, i3);
                    if (!createSpanData.isEmpty()) {
                        sortedSetOf.add(Integer.valueOf(coerceAtMost));
                        sortedSetOf.add(Integer.valueOf(i3));
                        arrayList.add(createSpanData);
                    }
                }
            }
        }
        CollectionsKt.sort(arrayList);
        Integer lineHeight = textData.getLineHeight();
        if (lineHeight != null) {
            int intValue = lineHeight.intValue();
            i = 0;
            sortedSetOf.add(0);
            sortedSetOf.add(Integer.valueOf(textLength));
            arrayList.add(0, SpanData.INSTANCE.lineHeight$div_release(0, textLength, intValue));
        } else {
            i = 0;
        }
        if (arrayList.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        List list2 = CollectionsKt.toList(sortedSetOf);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int intValue2 = ((Number) CollectionsKt.first(list2)).intValue();
        if (list2.size() == 1) {
            SpanData empty$div_release = SpanData.INSTANCE.empty$div_release(intValue2, intValue2);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                empty$div_release = empty$div_release.mergeWith((SpanData) it.next(), intValue2, intValue2);
            }
            arrayList2.add(empty$div_release);
            return arrayList2;
        }
        int size2 = list2.size();
        int i5 = 1;
        while (i5 < size2) {
            int intValue3 = ((Number) list2.get(i5)).intValue();
            int size3 = arrayList.size();
            for (int i6 = i; i6 < size3; i6++) {
                SpanData spanData = (SpanData) arrayList.get(i6);
                if (intValue3 < spanData.getStart()) {
                    break;
                }
                if (intValue3 > spanData.getStart() && intValue3 <= spanData.getEnd()) {
                    arrayList3.add(spanData);
                }
            }
            if (!arrayList3.isEmpty()) {
                SpanData empty$div_release2 = SpanData.INSTANCE.empty$div_release(intValue2, intValue3);
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    empty$div_release2 = empty$div_release2.mergeWith((SpanData) it2.next(), intValue2, intValue3);
                }
                arrayList2.add(empty$div_release2);
            }
            arrayList3.clear();
            i5++;
            intValue2 = intValue3;
        }
        return arrayList2;
    }

    private final List<DivText.Image> preprocessImages(final TextData textData, List<DivText.Image> images, final ExpressionResolver resolver) {
        if (images != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : images) {
                if (((Number) ((DivText.Image) obj).start.evaluate(resolver)).longValue() <= textData.getTextLength()) {
                    arrayList.add(obj);
                }
            }
            List<DivText.Image> sortedWith = CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.yandex.div.core.view2.spannable.SpannedTextBuilder$preprocessImages$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    int imagePosition;
                    int imagePosition2;
                    imagePosition = SpannedTextBuilder.this.imagePosition(textData.getTextLength(), (DivText.Image) t, resolver);
                    Integer valueOf = Integer.valueOf(imagePosition);
                    imagePosition2 = SpannedTextBuilder.this.imagePosition(textData.getTextLength(), (DivText.Image) t2, resolver);
                    return ComparisonsKt.compareValues(valueOf, Integer.valueOf(imagePosition2));
                }
            });
            if (sortedWith != null) {
                return sortedWith;
            }
        }
        return CollectionsKt.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int imagePosition(int textLength, DivText.Image image, ExpressionResolver resolver) {
        long longValue = ((Number) image.start.evaluate(resolver)).longValue();
        int i = WhenMappings.$EnumSwitchMapping$0[((DivText.Image.IndexingDirection) image.indexingDirection.evaluate(resolver)).ordinal()];
        if (i == 1) {
            long j = longValue >> 31;
            if (j == 0 || j == -1) {
                return (int) longValue;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable convert '" + longValue + "' to Int");
            }
            if (longValue <= 0) {
                return Integer.MIN_VALUE;
            }
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            long j2 = textLength - longValue;
            long j3 = j2 >> 31;
            if (j3 == 0 || j3 == -1) {
                return (int) j2;
            }
            KAssert kAssert2 = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable convert '" + j2 + "' to Int");
            }
            if (j2 <= 0) {
                return Integer.MIN_VALUE;
            }
        }
        return Integer.MAX_VALUE;
    }

    private final void addSpan(final TextView textView, Spannable spannedText, TextData textData, SpanData span) {
        int typefaceValue;
        int start = span.getStart();
        int end = span.getEnd();
        if (start > end) {
            return;
        }
        DivTextAlignmentVertical alignmentVertical = span.getAlignmentVertical();
        if (alignmentVertical == null) {
            alignmentVertical = DivTextAlignmentVertical.BASELINE;
        }
        int baselineOffset = span.getBaselineOffset();
        if (baselineOffset != 0) {
            Integer lineHeight = span.getLineHeight();
            spannedText.setSpan(new BaselineShiftSpan(baselineOffset, (lineHeight == null && (lineHeight = textData.getLineHeight()) == null) ? 0 : lineHeight.intValue()), start, end, 33);
        } else if (alignmentVertical != DivTextAlignmentVertical.BASELINE) {
            Integer fontSize = span.getFontSize();
            spannedText.setSpan(new VerticalAlignmentSpan(fontSize != null ? fontSize.intValue() : 0, toTextVerticalAlignment(alignmentVertical), new Provider() { // from class: com.yandex.div.core.view2.spannable.SpannedTextBuilder$$ExternalSyntheticLambda0
                @Override // javax.inject.Provider
                public final Object get() {
                    Layout layout;
                    layout = textView.getLayout();
                    return layout;
                }
            }), start, end, 33);
        }
        Integer fontSize2 = span.getFontSize();
        if (fontSize2 != null) {
            int intValue = fontSize2.intValue();
            Integer lineHeight2 = span.getLineHeight();
            spannedText.setSpan(new FontSizeSpan(intValue, (lineHeight2 == null && (lineHeight2 = textData.getLineHeight()) == null) ? 0 : lineHeight2.intValue()), start, end, 33);
        }
        String fontFeatureSettings = span.getFontFeatureSettings();
        if (fontFeatureSettings != null) {
            spannedText.setSpan(new FontFeatureSpan(fontFeatureSettings), start, end, 33);
        }
        Integer textColor = span.getTextColor();
        if (textColor != null) {
            spannedText.setSpan(new TextColorSpan(textColor.intValue()), start, end, 33);
        }
        Double letterSpacing = span.getLetterSpacing();
        if (letterSpacing != null) {
            spannedText.setSpan(new LetterSpacingSpan((float) letterSpacing.doubleValue()), start, end, 33);
        }
        DivLineStyle strike = span.getStrike();
        if (strike != null) {
            int i = WhenMappings.$EnumSwitchMapping$1[strike.ordinal()];
            if (i == 1) {
                spannedText.setSpan(new StrikethroughSpan(), start, end, 33);
            } else if (i == 2) {
                spannedText.setSpan(new NoStrikethroughSpan(), start, end, 33);
            }
        }
        DivLineStyle underline = span.getUnderline();
        if (underline != null) {
            int i2 = WhenMappings.$EnumSwitchMapping$1[underline.ordinal()];
            if (i2 == 1) {
                spannedText.setSpan(new UnderlineSpan(), start, end, 33);
            } else if (i2 == 2) {
                spannedText.setSpan(new NoUnderlineSpan(), start, end, 33);
            }
        }
        DivTypefaceResolver divTypefaceResolver = this.typefaceResolver;
        String fontFamily = span.getFontFamily();
        if (fontFamily == null) {
            fontFamily = textData.getFontFamily();
        }
        DivTypefaceProvider typefaceProvider = divTypefaceResolver.getTypefaceProvider(fontFamily);
        if (span.getFontFamily() != null || span.getFontWeight() != null || span.getFontWeightValue() != null) {
            if (span.getFontWeight() != null || span.getFontWeightValue() != null) {
                typefaceValue = DivTypefaceResolverKt.getTypefaceValue(span.getFontWeight(), span.getFontWeightValue());
            } else {
                typefaceValue = DivTypefaceResolverKt.getTypefaceValue(textData.getFontWeight(), textData.getFontWeightValue());
            }
            spannedText.setSpan(new TypefaceSpan(DivTypefaceResolverKt.getTypeface(typefaceValue, typefaceProvider)), start, end, 33);
        }
        if (TextViewExtensionsKt.getSupportFontVariations() && typefaceProvider.isVariable() && (span.getFontWeight() != null || span.getFontWeightValue() != null || span.getFontVariationSettings() != null)) {
            spannedText.setSpan(new FontVariationSpan(TextViewExtensionsKt.getFontVariations(span.getFontWeight(), span.getFontWeightValue(), span.getFontVariationSettings())), start, end, 33);
        }
        if (span.getLineHeight() != null || span.getTopOffset() != null) {
            int i3 = Intrinsics.areEqual(span.getLineHeight(), textData.getLineHeight()) ? 18 : 33;
            Integer topOffset = span.getTopOffset();
            int intValue2 = topOffset != null ? topOffset.intValue() : 0;
            Integer lineHeight3 = span.getLineHeight();
            int intValue3 = lineHeight3 != null ? lineHeight3.intValue() : 0;
            Integer topOffsetStart = span.getTopOffsetStart();
            int intValue4 = topOffsetStart != null ? topOffsetStart.intValue() : start;
            Integer topOffsetEnd = span.getTopOffsetEnd();
            spannedText.setSpan(new LineHeightWithTopOffsetSpan(intValue2, intValue3, intValue4, topOffsetEnd != null ? topOffsetEnd.intValue() : end), start, end, i3);
        }
        ShadowData textShadow = span.getTextShadow();
        if (textShadow != null) {
            spannedText.setSpan(new ShadowSpan(textShadow), start, end, 33);
        }
        MaskData mask = span.getMask();
        if (mask != null) {
            if (mask instanceof MaskData.Particles) {
                if (((MaskData.Particles) mask).isEnabled()) {
                    spannedText.setSpan(new MaskSpan(mask, textView instanceof DivLineHeightTextView ? (DivLineHeightTextView) textView : null), start, end, 33);
                }
            } else if ((mask instanceof MaskData.Solid) && ((MaskData.Solid) mask).isEnabled()) {
                spannedText.setSpan(new MaskSpan(mask, textView instanceof DivLineHeightTextView ? (DivLineHeightTextView) textView : null), start, end, 33);
            }
        }
    }

    private final void addActionSpan(BindingContext bindingContext, TextView textView, Spannable spannedText, int start, int end, List<DivAction> actions) {
        List<DivAction> list = actions;
        if (list == null || list.isEmpty()) {
            return;
        }
        textView.setMovementMethod(SelectableLinkMovementMethod.INSTANCE);
        spannedText.setSpan(new PerformActionSpan(bindingContext, actions), start, end, 33);
        ViewCompat.enableAccessibleClickableSpanSupport(textView);
    }

    private final void addDecorationSpan(BindingContext bindingContext, TextView textView, Spannable spannedText, int start, int end, DivTextRangeBorder border, DivTextRangeBackground background) {
        if (border == null && background == null) {
            return;
        }
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        DivBackgroundSpan divBackgroundSpan = new DivBackgroundSpan(border, background);
        if (textView instanceof DivLineHeightTextView) {
            DivLineHeightTextView divLineHeightTextView = (DivLineHeightTextView) textView;
            if (DivLineHeightTextViewKt.hasBackgroundSpan(divLineHeightTextView, spannedText, divBackgroundSpan, start, end, expressionResolver)) {
                return;
            }
            spannedText.setSpan(divBackgroundSpan, start, end, 33);
            DivTextRangesBackgroundHelper textRoundedBgHelper = divLineHeightTextView.getTextRoundedBgHelper();
            if (textRoundedBgHelper != null) {
                textRoundedBgHelper.addBackgroundSpan$div_release(divBackgroundSpan);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final ImageSpan addImageSpan(final BindingContext bindingContext, final TextView textView, Spannable spannedText, TextData textData, DivText.Image image) {
        ImageSpan.Accessibility accessibility;
        String str;
        DisplayMetrics displayMetrics = textView.getResources().getDisplayMetrics();
        final Div2View divView = bindingContext.getDivView();
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        int imagePosition = imagePosition(textData.getTextLength(), image, expressionResolver);
        int px = BaseDivViewExtensionsKt.toPx(image.width, displayMetrics, expressionResolver);
        int px2 = BaseDivViewExtensionsKt.toPx(image.height, displayMetrics, expressionResolver);
        Integer lineHeight = textData.getLineHeight();
        int intValue = lineHeight != null ? lineHeight.intValue() : 0;
        TextVerticalAlignment textVerticalAlignment = toTextVerticalAlignment((DivTextAlignmentVertical) image.alignmentVertical.evaluate(expressionResolver));
        DivText.Image.Accessibility accessibility2 = image.accessibility;
        if (accessibility2 != null) {
            int i = WhenMappings.$EnumSwitchMapping$2[accessibility2.type.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    str = Reflection.getOrCreateKotlinClass(Button.class).getQualifiedName();
                } else if (i == 3) {
                    str = Reflection.getOrCreateKotlinClass(ImageView.class).getQualifiedName();
                } else if (i == 4) {
                    str = Reflection.getOrCreateKotlinClass(TextView.class).getQualifiedName();
                } else if (i == 5) {
                    str = Reflection.getOrCreateKotlinClass(ImageView.class).getQualifiedName();
                }
                Expression expression = accessibility2.description;
                String str2 = expression == null ? (String) expression.evaluate(expressionResolver) : null;
                final List<DivAction> actionsForPosition = getActionsForPosition(bindingContext, spannedText, imagePosition);
                accessibility = new ImageSpan.Accessibility(str, str2, actionsForPosition == null ? new ImageSpan.OnAccessibilityClickAction() { // from class: com.yandex.div.core.view2.spannable.SpannedTextBuilder$$ExternalSyntheticLambda1
                    @Override // com.yandex.div.core.view2.spannable.ImageSpan.OnAccessibilityClickAction
                    public final void perform() {
                        SpannedTextBuilder.addImageSpan$lambda$22$lambda$21$lambda$20(Div2View.this, bindingContext, textView, actionsForPosition);
                    }
                } : null);
            }
            str = null;
            Expression expression2 = accessibility2.description;
            if (expression2 == null) {
            }
            final List actionsForPosition2 = getActionsForPosition(bindingContext, spannedText, imagePosition);
            accessibility = new ImageSpan.Accessibility(str, str2, actionsForPosition2 == null ? new ImageSpan.OnAccessibilityClickAction() { // from class: com.yandex.div.core.view2.spannable.SpannedTextBuilder$$ExternalSyntheticLambda1
                @Override // com.yandex.div.core.view2.spannable.ImageSpan.OnAccessibilityClickAction
                public final void perform() {
                    SpannedTextBuilder.addImageSpan$lambda$22$lambda$21$lambda$20(Div2View.this, bindingContext, textView, actionsForPosition2);
                }
            } : null);
        } else {
            accessibility = null;
        }
        ImageSpan imageSpan = new ImageSpan(null, px, px2, intValue, textVerticalAlignment, accessibility);
        spannedText.setSpan(imageSpan, imagePosition, imagePosition + 1, 33);
        DivLineHeightTextView divLineHeightTextView = textView instanceof DivLineHeightTextView ? (DivLineHeightTextView) textView : null;
        if (divLineHeightTextView != null) {
            divLineHeightTextView.addImageSpan$div_release(imageSpan);
        }
        return imageSpan;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addImageSpan$lambda$22$lambda$21$lambda$20(Div2View div2View, BindingContext bindingContext, TextView textView, List list) {
        div2View.getDiv2Component().getActionBinder().handleTapClick$div_release(bindingContext, textView, list);
    }

    private final TextData createTextData(Context context, BindingContext bindingContext, DivText divText, String text) {
        int i;
        Integer num;
        Integer num2;
        int i2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        long longValue = ((Number) divText.fontSize.evaluate(expressionResolver)).longValue();
        long j = longValue >> 31;
        int i3 = Integer.MIN_VALUE;
        if (j == 0 || j == -1) {
            i = (int) longValue;
        } else {
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable convert '" + longValue + "' to Int");
            }
            i = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        int i4 = i;
        DivSizeUnit divSizeUnit = (DivSizeUnit) divText.fontSizeUnit.evaluate(expressionResolver);
        int unitToPx = BaseDivViewExtensionsKt.unitToPx(Integer.valueOf(i4), displayMetrics, divSizeUnit);
        Expression expression = divText.fontWeight;
        DivFontWeight divFontWeight = expression != null ? (DivFontWeight) expression.evaluate(expressionResolver) : null;
        Expression expression2 = divText.fontWeightValue;
        if (expression2 != null) {
            long longValue2 = ((Number) expression2.evaluate(expressionResolver)).longValue();
            long j2 = longValue2 >> 31;
            if (j2 == 0 || j2 == -1) {
                i2 = (int) longValue2;
            } else {
                KAssert kAssert2 = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + longValue2 + "' to Int");
                }
                i2 = longValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            num = Integer.valueOf(i2);
        } else {
            num = null;
        }
        Expression expression3 = divText.fontFamily;
        String str = expression3 != null ? (String) expression3.evaluate(expressionResolver) : null;
        Expression expression4 = divText.lineHeight;
        if (expression4 != null) {
            long longValue3 = ((Number) expression4.evaluate(expressionResolver)).longValue();
            long j3 = longValue3 >> 31;
            if (j3 == 0 || j3 == -1) {
                i3 = (int) longValue3;
            } else {
                KAssert kAssert3 = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + longValue3 + "' to Int");
                }
                if (longValue3 > 0) {
                    i3 = Integer.MAX_VALUE;
                }
            }
            num2 = Integer.valueOf(BaseDivViewExtensionsKt.unitToPx(Integer.valueOf(i3), displayMetrics, divSizeUnit));
        } else {
            num2 = null;
        }
        return new TextData(text, unitToPx, i4, divSizeUnit, str, divFontWeight, num, num2, ((Number) divText.textColor.evaluate(expressionResolver)).intValue());
    }

    private final SpanData createSpanData(Context context, BindingContext bindingContext, TextData textData, DivText.Range range, int start, int end) {
        Integer num;
        Integer num2;
        Double d;
        Integer num3;
        int i;
        int i2;
        int i3;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        int fontSizeValue = textData.getFontSizeValue();
        Expression expression = range.fontSize;
        if (expression != null) {
            long longValue = ((Number) expression.evaluate(expressionResolver)).longValue();
            long j = longValue >> 31;
            if (j == 0 || j == -1) {
                i3 = (int) longValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + longValue + "' to Int");
                }
                i3 = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            num = Integer.valueOf(i3);
        } else {
            num = null;
        }
        DivSizeUnit divSizeUnit = (DivSizeUnit) range.fontSizeUnit.evaluate(expressionResolver);
        Expression expression2 = range.alignmentVertical;
        DivTextAlignmentVertical divTextAlignmentVertical = expression2 != null ? (DivTextAlignmentVertical) expression2.evaluate(expressionResolver) : null;
        int unitToPx = BaseDivViewExtensionsKt.unitToPx((Number) range.baselineOffset.evaluate(expressionResolver), displayMetrics, divSizeUnit);
        Expression expression3 = range.fontFamily;
        String str = expression3 != null ? (String) expression3.evaluate(expressionResolver) : null;
        Expression expression4 = range.fontFeatureSettings;
        String str2 = expression4 != null ? (String) expression4.evaluate(expressionResolver) : null;
        Integer valueOf = num != null ? Integer.valueOf(BaseDivViewExtensionsKt.unitToPx(num, displayMetrics, divSizeUnit)) : null;
        Expression expression5 = range.fontWeight;
        DivFontWeight divFontWeight = expression5 != null ? (DivFontWeight) expression5.evaluate(expressionResolver) : null;
        Expression expression6 = range.fontWeightValue;
        if (expression6 != null) {
            long longValue2 = ((Number) expression6.evaluate(expressionResolver)).longValue();
            long j2 = longValue2 >> 31;
            if (j2 == 0 || j2 == -1) {
                i2 = (int) longValue2;
            } else {
                KAssert kAssert2 = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + longValue2 + "' to Int");
                }
                i2 = longValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            num2 = Integer.valueOf(i2);
        } else {
            num2 = null;
        }
        Expression expression7 = range.fontVariationSettings;
        JSONObject jSONObject = expression7 != null ? (JSONObject) expression7.evaluate(expressionResolver) : null;
        Expression expression8 = range.letterSpacing;
        if (expression8 != null) {
            double doubleValue = ((Number) expression8.evaluate(expressionResolver)).doubleValue();
            if (num != null) {
                fontSizeValue = num.intValue();
            }
            d = Double.valueOf(doubleValue / fontSizeValue);
        } else {
            d = null;
        }
        Expression expression9 = range.lineHeight;
        Integer valueOf2 = expression9 != null ? Integer.valueOf(BaseDivViewExtensionsKt.unitToPx(Long.valueOf(((Number) expression9.evaluate(expressionResolver)).longValue()), displayMetrics, divSizeUnit)) : null;
        MaskData createMaskData = createMaskData(context, bindingContext, range.mask);
        Expression expression10 = range.strike;
        DivLineStyle divLineStyle = expression10 != null ? (DivLineStyle) expression10.evaluate(expressionResolver) : null;
        Expression expression11 = range.textColor;
        Integer num4 = expression11 != null ? (Integer) expression11.evaluate(expressionResolver) : null;
        ShadowData createShadowData = createShadowData(context, bindingContext, range.textShadow, textData.getTextColor());
        Expression expression12 = range.topOffset;
        if (expression12 != null) {
            long longValue3 = ((Number) expression12.evaluate(expressionResolver)).longValue();
            long j3 = longValue3 >> 31;
            if (j3 == 0 || j3 == -1) {
                i = (int) longValue3;
            } else {
                KAssert kAssert3 = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + longValue3 + "' to Int");
                }
                i = longValue3 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            num3 = Integer.valueOf(BaseDivViewExtensionsKt.unitToPx(Integer.valueOf(i), displayMetrics, divSizeUnit));
        } else {
            num3 = null;
        }
        Integer valueOf3 = range.topOffset != null ? Integer.valueOf(start) : null;
        Integer valueOf4 = range.topOffset != null ? Integer.valueOf(end) : null;
        Expression expression13 = range.underline;
        return new SpanData(start, end, divTextAlignmentVertical, unitToPx, str, str2, valueOf, divSizeUnit, divFontWeight, num2, jSONObject, d, valueOf2, createMaskData, divLineStyle, num4, createShadowData, num3, valueOf3, valueOf4, expression13 != null ? (DivLineStyle) expression13.evaluate(expressionResolver) : null);
    }

    private final ShadowData createShadowData(Context context, BindingContext bindingContext, DivShadow shadow, @ColorInt int textColor) {
        if (shadow == null) {
            return null;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        float dpToPxF = BaseDivViewExtensionsKt.dpToPxF((Number) shadow.blur.evaluate(expressionResolver), displayMetrics);
        float px = BaseDivViewExtensionsKt.toPx(shadow.offset.x, displayMetrics, expressionResolver);
        float px2 = BaseDivViewExtensionsKt.toPx(shadow.offset.y, displayMetrics, expressionResolver);
        Paint paint = this.tempPaint;
        paint.setColor(((Number) shadow.color.evaluate(expressionResolver)).intValue());
        paint.setAlpha((int) (((Number) shadow.alpha.evaluate(expressionResolver)).doubleValue() * (textColor >>> 24)));
        return new ShadowData(px, px2, dpToPxF, paint.getColor());
    }

    private final MaskData createMaskData(Context context, BindingContext bindingContext, DivTextRangeMask mask) {
        if (mask == null) {
            return null;
        }
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (mask instanceof DivTextRangeMask.Particles) {
            DivTextRangeMaskParticles value = ((DivTextRangeMask.Particles) mask).getValue();
            long longValue = ((Number) value.particleSize.value.evaluate(expressionResolver)).longValue();
            return new MaskData.Particles(((Number) value.color.evaluate(expressionResolver)).intValue(), (float) ((Number) value.density.evaluate(expressionResolver)).doubleValue(), ((Boolean) value.isAnimated.evaluate(expressionResolver)).booleanValue(), ((Boolean) value.isEnabled.evaluate(expressionResolver)).booleanValue(), BaseDivViewExtensionsKt.unitToPxF(Long.valueOf(longValue), displayMetrics, (DivSizeUnit) value.particleSize.unit.evaluate(expressionResolver)));
        }
        if (!(mask instanceof DivTextRangeMask.Solid)) {
            throw new NoWhenBranchMatchedException();
        }
        DivTextRangeMaskSolid value2 = ((DivTextRangeMask.Solid) mask).getValue();
        return new MaskData.Solid(((Number) value2.color.evaluate(expressionResolver)).intValue(), ((Boolean) value2.isEnabled.evaluate(expressionResolver)).booleanValue());
    }

    private final TextVerticalAlignment toTextVerticalAlignment(DivTextAlignmentVertical divTextAlignmentVertical) {
        int i = WhenMappings.$EnumSwitchMapping$3[divTextAlignmentVertical.ordinal()];
        if (i == 1) {
            return TextVerticalAlignment.TOP;
        }
        if (i == 2) {
            return TextVerticalAlignment.CENTER;
        }
        if (i == 3) {
            return TextVerticalAlignment.BASELINE;
        }
        if (i == 4) {
            return TextVerticalAlignment.BOTTOM;
        }
        return TextVerticalAlignment.BASELINE;
    }

    /* compiled from: SpannedTextBuilder.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bj\u0004\u0018\u0001`\r¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bj\u0004\u0018\u0001`\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/yandex/div/core/view2/spannable/SpannedTextBuilder$ImageDownloadCallbackImpl;", "Lcom/yandex/div/core/DivIdLoggingImageDownloadCallback;", "bindingContext", "Lcom/yandex/div/core/view2/BindingContext;", "image", "Lcom/yandex/div2/DivText$Image;", "imageSpan", "Lcom/yandex/div/core/view2/spannable/ImageSpan;", "spannedText", "Landroid/text/Spanned;", "textConsumer", "Lkotlin/Function1;", "", "Lcom/yandex/div/core/view2/spannable/TextConsumer;", "(Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div2/DivText$Image;Lcom/yandex/div/core/view2/spannable/ImageSpan;Landroid/text/Spanned;Lkotlin/jvm/functions/Function1;)V", "onSuccess", "cachedBitmap", "Lcom/yandex/div/core/images/CachedBitmap;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class ImageDownloadCallbackImpl extends DivIdLoggingImageDownloadCallback {

        @NotNull
        private final BindingContext bindingContext;

        @NotNull
        private final DivText.Image image;

        @NotNull
        private final ImageSpan imageSpan;

        @NotNull
        private final Spanned spannedText;

        @Nullable
        private final Function1 textConsumer;

        public /* synthetic */ ImageDownloadCallbackImpl(BindingContext bindingContext, DivText.Image image, ImageSpan imageSpan, Spanned spanned, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(bindingContext, image, imageSpan, spanned, (i & 16) != 0 ? null : function1);
        }

        public ImageDownloadCallbackImpl(@NotNull BindingContext bindingContext, @NotNull DivText.Image image, @NotNull ImageSpan imageSpan, @NotNull Spanned spanned, @Nullable Function1 function1) {
            super(bindingContext.getDivView());
            this.bindingContext = bindingContext;
            this.image = image;
            this.imageSpan = imageSpan;
            this.spannedText = spanned;
            this.textConsumer = function1;
        }

        @Override // com.yandex.div.core.images.DivImageDownloadCallback
        public void onSuccess(@NotNull CachedBitmap cachedBitmap) {
            super.onSuccess(cachedBitmap);
            Resources resources = this.bindingContext.getDivView().getResources();
            ExpressionResolver expressionResolver = this.bindingContext.getExpressionResolver();
            Expression expression = this.image.tintColor;
            Integer num = expression != null ? (Integer) expression.evaluate(expressionResolver) : null;
            PorterDuff.Mode porterDuffMode = DivUtilKt.toPorterDuffMode((DivBlendMode) this.image.tintMode.evaluate(expressionResolver));
            BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, cachedBitmap.getBitmap());
            if (num != null) {
                bitmapDrawable.setColorFilter(new PorterDuffColorFilter(num.intValue(), porterDuffMode));
            }
            this.imageSpan.setImage(bitmapDrawable);
            Function1 function1 = this.textConsumer;
            if (function1 != null) {
                function1.invoke(this.spannedText);
            }
        }
    }

    /* compiled from: SpannedTextBuilder.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/core/view2/spannable/SpannedTextBuilder$Companion;", "", "()V", "IMAGE_PLACEHOLDER", "", "WORD_JOINER", "ZWSP", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
