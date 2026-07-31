package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivSlider;
import com.yandex.div2.DivSliderJsonParser;
import com.yandex.div2.DivSliderTextStyleJsonParser;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivSlider.kt */
/* loaded from: classes13.dex */
public final class DivSlider implements JSONSerializable, Hashable, DivBase {
    private static final Expression ALPHA_DEFAULT_VALUE;
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final DivSize.WrapContent HEIGHT_DEFAULT_VALUE;
    private static final Expression IS_ENABLED_DEFAULT_VALUE;
    private static final Expression MAX_VALUE_DEFAULT_VALUE;
    private static final Expression MIN_VALUE_DEFAULT_VALUE;
    private static final Expression VISIBILITY_DEFAULT_VALUE;
    private static final DivSize.MatchParent WIDTH_DEFAULT_VALUE;
    private Integer _hash;
    private final DivAccessibility accessibility;
    private final Expression alignmentHorizontal;
    private final Expression alignmentVertical;
    private final Expression alpha;
    private final List animators;
    private final List background;
    private final DivBorder border;
    private final Expression columnSpan;
    private final List disappearActions;
    private final List extensions;
    private final DivFocus focus;
    private final List functions;
    private final DivSize height;
    private final String id;
    public final Expression isEnabled;
    private final DivLayoutProvider layoutProvider;
    private final DivEdgeInsets margins;
    public final Expression maxValue;
    public final Expression minValue;
    private final DivEdgeInsets paddings;
    public final List ranges;
    private final Expression reuseId;
    private final Expression rowSpan;
    public final DivAccessibility secondaryValueAccessibility;
    private final List selectedActions;
    public final DivDrawable thumbSecondaryStyle;
    public final TextStyle thumbSecondaryTextStyle;
    public final String thumbSecondaryValueVariable;
    public final DivDrawable thumbStyle;
    public final TextStyle thumbTextStyle;
    public final String thumbValueVariable;
    public final DivDrawable tickMarkActiveStyle;
    public final DivDrawable tickMarkInactiveStyle;
    private final List tooltips;
    public final DivDrawable trackActiveStyle;
    public final DivDrawable trackInactiveStyle;
    private final DivTransform transform;
    private final DivChangeTransition transitionChange;
    private final DivAppearanceTransition transitionIn;
    private final DivAppearanceTransition transitionOut;
    private final List transitionTriggers;
    private final List variableTriggers;
    private final List variables;
    private final Expression visibility;
    private final DivVisibilityAction visibilityAction;
    private final List visibilityActions;
    private final DivSize width;

    public DivSlider(DivAccessibility divAccessibility, Expression expression, Expression expression2, Expression expression3, List list, List list2, DivBorder divBorder, Expression expression4, List list3, List list4, DivFocus divFocus, List list5, DivSize divSize, String str, Expression expression5, DivLayoutProvider divLayoutProvider, DivEdgeInsets divEdgeInsets, Expression expression6, Expression expression7, DivEdgeInsets divEdgeInsets2, List list6, Expression expression8, Expression expression9, DivAccessibility divAccessibility2, List list7, DivDrawable divDrawable, TextStyle textStyle, String str2, DivDrawable divDrawable2, TextStyle textStyle2, String str3, DivDrawable divDrawable3, DivDrawable divDrawable4, List list8, DivDrawable divDrawable5, DivDrawable divDrawable6, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list9, List list10, List list11, Expression expression10, DivVisibilityAction divVisibilityAction, List list12, DivSize divSize2) {
        this.accessibility = divAccessibility;
        this.alignmentHorizontal = expression;
        this.alignmentVertical = expression2;
        this.alpha = expression3;
        this.animators = list;
        this.background = list2;
        this.border = divBorder;
        this.columnSpan = expression4;
        this.disappearActions = list3;
        this.extensions = list4;
        this.focus = divFocus;
        this.functions = list5;
        this.height = divSize;
        this.id = str;
        this.isEnabled = expression5;
        this.layoutProvider = divLayoutProvider;
        this.margins = divEdgeInsets;
        this.maxValue = expression6;
        this.minValue = expression7;
        this.paddings = divEdgeInsets2;
        this.ranges = list6;
        this.reuseId = expression8;
        this.rowSpan = expression9;
        this.secondaryValueAccessibility = divAccessibility2;
        this.selectedActions = list7;
        this.thumbSecondaryStyle = divDrawable;
        this.thumbSecondaryTextStyle = textStyle;
        this.thumbSecondaryValueVariable = str2;
        this.thumbStyle = divDrawable2;
        this.thumbTextStyle = textStyle2;
        this.thumbValueVariable = str3;
        this.tickMarkActiveStyle = divDrawable3;
        this.tickMarkInactiveStyle = divDrawable4;
        this.tooltips = list8;
        this.trackActiveStyle = divDrawable5;
        this.trackInactiveStyle = divDrawable6;
        this.transform = divTransform;
        this.transitionChange = divChangeTransition;
        this.transitionIn = divAppearanceTransition;
        this.transitionOut = divAppearanceTransition2;
        this.transitionTriggers = list9;
        this.variableTriggers = list10;
        this.variables = list11;
        this.visibility = expression10;
        this.visibilityAction = divVisibilityAction;
        this.visibilityActions = list12;
        this.width = divSize2;
    }

    @Override // com.yandex.div2.DivBase
    public DivAccessibility getAccessibility() {
        return this.accessibility;
    }

    @Override // com.yandex.div2.DivBase
    public Expression getAlignmentHorizontal() {
        return this.alignmentHorizontal;
    }

    @Override // com.yandex.div2.DivBase
    public Expression getAlignmentVertical() {
        return this.alignmentVertical;
    }

    @Override // com.yandex.div2.DivBase
    public Expression getAlpha() {
        return this.alpha;
    }

    @Override // com.yandex.div2.DivBase
    public List getAnimators() {
        return this.animators;
    }

    @Override // com.yandex.div2.DivBase
    public List getBackground() {
        return this.background;
    }

    @Override // com.yandex.div2.DivBase
    public DivBorder getBorder() {
        return this.border;
    }

    @Override // com.yandex.div2.DivBase
    public Expression getColumnSpan() {
        return this.columnSpan;
    }

    @Override // com.yandex.div2.DivBase
    public List getDisappearActions() {
        return this.disappearActions;
    }

    @Override // com.yandex.div2.DivBase
    public List getExtensions() {
        return this.extensions;
    }

    @Override // com.yandex.div2.DivBase
    public DivFocus getFocus() {
        return this.focus;
    }

    @Override // com.yandex.div2.DivBase
    public List getFunctions() {
        return this.functions;
    }

    @Override // com.yandex.div2.DivBase
    public DivSize getHeight() {
        return this.height;
    }

    @Override // com.yandex.div2.DivBase
    public String getId() {
        return this.id;
    }

    @Override // com.yandex.div2.DivBase
    public DivLayoutProvider getLayoutProvider() {
        return this.layoutProvider;
    }

    @Override // com.yandex.div2.DivBase
    public DivEdgeInsets getMargins() {
        return this.margins;
    }

    @Override // com.yandex.div2.DivBase
    public DivEdgeInsets getPaddings() {
        return this.paddings;
    }

    @Override // com.yandex.div2.DivBase
    public Expression getReuseId() {
        return this.reuseId;
    }

    @Override // com.yandex.div2.DivBase
    public Expression getRowSpan() {
        return this.rowSpan;
    }

    @Override // com.yandex.div2.DivBase
    public List getSelectedActions() {
        return this.selectedActions;
    }

    @Override // com.yandex.div2.DivBase
    public List getTooltips() {
        return this.tooltips;
    }

    @Override // com.yandex.div2.DivBase
    public DivTransform getTransform() {
        return this.transform;
    }

    @Override // com.yandex.div2.DivBase
    public DivChangeTransition getTransitionChange() {
        return this.transitionChange;
    }

    @Override // com.yandex.div2.DivBase
    public DivAppearanceTransition getTransitionIn() {
        return this.transitionIn;
    }

    @Override // com.yandex.div2.DivBase
    public DivAppearanceTransition getTransitionOut() {
        return this.transitionOut;
    }

    @Override // com.yandex.div2.DivBase
    public List getTransitionTriggers() {
        return this.transitionTriggers;
    }

    @Override // com.yandex.div2.DivBase
    public List getVariableTriggers() {
        return this.variableTriggers;
    }

    @Override // com.yandex.div2.DivBase
    public List getVariables() {
        return this.variables;
    }

    @Override // com.yandex.div2.DivBase
    public Expression getVisibility() {
        return this.visibility;
    }

    @Override // com.yandex.div2.DivBase
    public DivVisibilityAction getVisibilityAction() {
        return this.visibilityAction;
    }

    @Override // com.yandex.div2.DivBase
    public List getVisibilityActions() {
        return this.visibilityActions;
    }

    @Override // com.yandex.div2.DivBase
    public DivSize getWidth() {
        return this.width;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivSlider.class).hashCode();
        DivAccessibility accessibility = getAccessibility();
        int i11 = 0;
        int hash = hashCode + (accessibility != null ? accessibility.hash() : 0);
        Expression alignmentHorizontal = getAlignmentHorizontal();
        int hashCode2 = hash + (alignmentHorizontal != null ? alignmentHorizontal.hashCode() : 0);
        Expression alignmentVertical = getAlignmentVertical();
        int hashCode3 = hashCode2 + (alignmentVertical != null ? alignmentVertical.hashCode() : 0) + getAlpha().hashCode();
        List animators = getAnimators();
        if (animators != null) {
            Iterator it = animators.iterator();
            i = 0;
            while (it.hasNext()) {
                i += ((DivAnimator) it.next()).hash();
            }
        } else {
            i = 0;
        }
        int i12 = hashCode3 + i;
        List background = getBackground();
        if (background != null) {
            Iterator it2 = background.iterator();
            i2 = 0;
            while (it2.hasNext()) {
                i2 += ((DivBackground) it2.next()).hash();
            }
        } else {
            i2 = 0;
        }
        int i13 = i12 + i2;
        DivBorder border = getBorder();
        int hash2 = i13 + (border != null ? border.hash() : 0);
        Expression columnSpan = getColumnSpan();
        int hashCode4 = hash2 + (columnSpan != null ? columnSpan.hashCode() : 0);
        List disappearActions = getDisappearActions();
        if (disappearActions != null) {
            Iterator it3 = disappearActions.iterator();
            i3 = 0;
            while (it3.hasNext()) {
                i3 += ((DivDisappearAction) it3.next()).hash();
            }
        } else {
            i3 = 0;
        }
        int i14 = hashCode4 + i3;
        List extensions = getExtensions();
        if (extensions != null) {
            Iterator it4 = extensions.iterator();
            i4 = 0;
            while (it4.hasNext()) {
                i4 += ((DivExtension) it4.next()).hash();
            }
        } else {
            i4 = 0;
        }
        int i15 = i14 + i4;
        DivFocus focus = getFocus();
        int hash3 = i15 + (focus != null ? focus.hash() : 0);
        List functions = getFunctions();
        if (functions != null) {
            Iterator it5 = functions.iterator();
            i5 = 0;
            while (it5.hasNext()) {
                i5 += ((DivFunction) it5.next()).hash();
            }
        } else {
            i5 = 0;
        }
        int hash4 = hash3 + i5 + getHeight().hash();
        String id = getId();
        int hashCode5 = hash4 + (id != null ? id.hashCode() : 0) + this.isEnabled.hashCode();
        DivLayoutProvider layoutProvider = getLayoutProvider();
        int hash5 = hashCode5 + (layoutProvider != null ? layoutProvider.hash() : 0);
        DivEdgeInsets margins = getMargins();
        int hash6 = hash5 + (margins != null ? margins.hash() : 0) + this.maxValue.hashCode() + this.minValue.hashCode();
        DivEdgeInsets paddings = getPaddings();
        int hash7 = hash6 + (paddings != null ? paddings.hash() : 0);
        List list = this.ranges;
        if (list != null) {
            Iterator it6 = list.iterator();
            i6 = 0;
            while (it6.hasNext()) {
                i6 += ((Range) it6.next()).hash();
            }
        } else {
            i6 = 0;
        }
        int i16 = hash7 + i6;
        Expression reuseId = getReuseId();
        int hashCode6 = i16 + (reuseId != null ? reuseId.hashCode() : 0);
        Expression rowSpan = getRowSpan();
        int hashCode7 = hashCode6 + (rowSpan != null ? rowSpan.hashCode() : 0);
        DivAccessibility divAccessibility = this.secondaryValueAccessibility;
        int hash8 = hashCode7 + (divAccessibility != null ? divAccessibility.hash() : 0);
        List selectedActions = getSelectedActions();
        if (selectedActions != null) {
            Iterator it7 = selectedActions.iterator();
            i7 = 0;
            while (it7.hasNext()) {
                i7 += ((DivAction) it7.next()).hash();
            }
        } else {
            i7 = 0;
        }
        int i17 = hash8 + i7;
        DivDrawable divDrawable = this.thumbSecondaryStyle;
        int hash9 = i17 + (divDrawable != null ? divDrawable.hash() : 0);
        TextStyle textStyle = this.thumbSecondaryTextStyle;
        int hash10 = hash9 + (textStyle != null ? textStyle.hash() : 0);
        String str = this.thumbSecondaryValueVariable;
        int hashCode8 = hash10 + (str != null ? str.hashCode() : 0) + this.thumbStyle.hash();
        TextStyle textStyle2 = this.thumbTextStyle;
        int hash11 = hashCode8 + (textStyle2 != null ? textStyle2.hash() : 0);
        String str2 = this.thumbValueVariable;
        int hashCode9 = hash11 + (str2 != null ? str2.hashCode() : 0);
        DivDrawable divDrawable2 = this.tickMarkActiveStyle;
        int hash12 = hashCode9 + (divDrawable2 != null ? divDrawable2.hash() : 0);
        DivDrawable divDrawable3 = this.tickMarkInactiveStyle;
        int hash13 = hash12 + (divDrawable3 != null ? divDrawable3.hash() : 0);
        List tooltips = getTooltips();
        if (tooltips != null) {
            Iterator it8 = tooltips.iterator();
            i8 = 0;
            while (it8.hasNext()) {
                i8 += ((DivTooltip) it8.next()).hash();
            }
        } else {
            i8 = 0;
        }
        int hash14 = hash13 + i8 + this.trackActiveStyle.hash() + this.trackInactiveStyle.hash();
        DivTransform transform = getTransform();
        int hash15 = hash14 + (transform != null ? transform.hash() : 0);
        DivChangeTransition transitionChange = getTransitionChange();
        int hash16 = hash15 + (transitionChange != null ? transitionChange.hash() : 0);
        DivAppearanceTransition transitionIn = getTransitionIn();
        int hash17 = hash16 + (transitionIn != null ? transitionIn.hash() : 0);
        DivAppearanceTransition transitionOut = getTransitionOut();
        int hash18 = hash17 + (transitionOut != null ? transitionOut.hash() : 0);
        List transitionTriggers = getTransitionTriggers();
        int hashCode10 = hash18 + (transitionTriggers != null ? transitionTriggers.hashCode() : 0);
        List variableTriggers = getVariableTriggers();
        if (variableTriggers != null) {
            Iterator it9 = variableTriggers.iterator();
            i9 = 0;
            while (it9.hasNext()) {
                i9 += ((DivTrigger) it9.next()).hash();
            }
        } else {
            i9 = 0;
        }
        int i18 = hashCode10 + i9;
        List variables = getVariables();
        if (variables != null) {
            Iterator it10 = variables.iterator();
            i10 = 0;
            while (it10.hasNext()) {
                i10 += ((DivVariable) it10.next()).hash();
            }
        } else {
            i10 = 0;
        }
        int hashCode11 = i18 + i10 + getVisibility().hashCode();
        DivVisibilityAction visibilityAction = getVisibilityAction();
        int hash19 = hashCode11 + (visibilityAction != null ? visibilityAction.hash() : 0);
        List visibilityActions = getVisibilityActions();
        if (visibilityActions != null) {
            Iterator it11 = visibilityActions.iterator();
            while (it11.hasNext()) {
                i11 += ((DivVisibilityAction) it11.next()).hash();
            }
        }
        int hash20 = hash19 + i11 + getWidth().hash();
        this._hash = Integer.valueOf(hash20);
        return hash20;
    }

    /* JADX WARN: Code restructure failed: missing block: B:388:0x0697, code lost:
    
        if (r9.getVisibilityActions() == null) goto L491;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x061f, code lost:
    
        if (r9.getVariables() == null) goto L458;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x05d3, code lost:
    
        if (r9.getVariableTriggers() == null) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x0587, code lost:
    
        if (r9.getTransitionTriggers() == null) goto L412;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x04be, code lost:
    
        if (r9.getTooltips() == null) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x03f0, code lost:
    
        if (r9.getSelectedActions() == null) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x034e, code lost:
    
        if (r9.ranges == null) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x024c, code lost:
    
        if (r9.getFunctions() == null) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x01e6, code lost:
    
        if (r9.getExtensions() == null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x019a, code lost:
    
        if (r9.getDisappearActions() == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x0112, code lost:
    
        if (r9.getBackground() == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x00c6, code lost:
    
        if (r9.getAnimators() == null) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(DivSlider divSlider, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        if (divSlider == null) {
            return false;
        }
        DivAccessibility accessibility = getAccessibility();
        if (!(accessibility != null ? accessibility.equals(divSlider.getAccessibility(), expressionResolver, expressionResolver2) : divSlider.getAccessibility() == null)) {
            return false;
        }
        Expression alignmentHorizontal = getAlignmentHorizontal();
        DivAlignmentHorizontal divAlignmentHorizontal = alignmentHorizontal != null ? (DivAlignmentHorizontal) alignmentHorizontal.evaluate(expressionResolver) : null;
        Expression alignmentHorizontal2 = divSlider.getAlignmentHorizontal();
        if (divAlignmentHorizontal != (alignmentHorizontal2 != null ? (DivAlignmentHorizontal) alignmentHorizontal2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression alignmentVertical = getAlignmentVertical();
        DivAlignmentVertical divAlignmentVertical = alignmentVertical != null ? (DivAlignmentVertical) alignmentVertical.evaluate(expressionResolver) : null;
        Expression alignmentVertical2 = divSlider.getAlignmentVertical();
        if (divAlignmentVertical != (alignmentVertical2 != null ? (DivAlignmentVertical) alignmentVertical2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        if (!(((Number) getAlpha().evaluate(expressionResolver)).doubleValue() == ((Number) divSlider.getAlpha().evaluate(expressionResolver2)).doubleValue())) {
            return false;
        }
        List animators = getAnimators();
        if (animators != null) {
            List animators2 = divSlider.getAnimators();
            if (animators2 != null) {
                if (animators.size() == animators2.size()) {
                    int i = 0;
                    for (Object obj : animators) {
                        int i2 = i + 1;
                        if (i < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivAnimator) obj).equals((DivAnimator) animators2.get(i), expressionResolver, expressionResolver2)) {
                            i = i2;
                        }
                    }
                    z = true;
                }
                z = false;
                break;
            }
            return false;
        }
        if (!z) {
            return false;
        }
        List background = getBackground();
        if (background != null) {
            List background2 = divSlider.getBackground();
            if (background2 != null) {
                if (background.size() == background2.size()) {
                    int i3 = 0;
                    for (Object obj2 : background) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivBackground) obj2).equals((DivBackground) background2.get(i3), expressionResolver, expressionResolver2)) {
                            i3 = i4;
                        }
                    }
                    z2 = true;
                }
                z2 = false;
                break;
            }
            return false;
        }
        if (!z2) {
            return false;
        }
        DivBorder border = getBorder();
        if (!(border != null ? border.equals(divSlider.getBorder(), expressionResolver, expressionResolver2) : divSlider.getBorder() == null)) {
            return false;
        }
        Expression columnSpan = getColumnSpan();
        Long l = columnSpan != null ? (Long) columnSpan.evaluate(expressionResolver) : null;
        Expression columnSpan2 = divSlider.getColumnSpan();
        if (!Intrinsics.areEqual(l, columnSpan2 != null ? (Long) columnSpan2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List disappearActions = getDisappearActions();
        if (disappearActions != null) {
            List disappearActions2 = divSlider.getDisappearActions();
            if (disappearActions2 != null) {
                if (disappearActions.size() == disappearActions2.size()) {
                    int i5 = 0;
                    for (Object obj3 : disappearActions) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivDisappearAction) obj3).equals((DivDisappearAction) disappearActions2.get(i5), expressionResolver, expressionResolver2)) {
                            i5 = i6;
                        }
                    }
                    z3 = true;
                }
                z3 = false;
                break;
            }
            return false;
        }
        if (!z3) {
            return false;
        }
        List extensions = getExtensions();
        if (extensions != null) {
            List extensions2 = divSlider.getExtensions();
            if (extensions2 != null) {
                if (extensions.size() == extensions2.size()) {
                    int i7 = 0;
                    for (Object obj4 : extensions) {
                        int i8 = i7 + 1;
                        if (i7 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivExtension) obj4).equals((DivExtension) extensions2.get(i7), expressionResolver, expressionResolver2)) {
                            i7 = i8;
                        }
                    }
                    z4 = true;
                }
                z4 = false;
                break;
            }
            return false;
        }
        if (!z4) {
            return false;
        }
        DivFocus focus = getFocus();
        if (!(focus != null ? focus.equals(divSlider.getFocus(), expressionResolver, expressionResolver2) : divSlider.getFocus() == null)) {
            return false;
        }
        List functions = getFunctions();
        if (functions != null) {
            List functions2 = divSlider.getFunctions();
            if (functions2 != null) {
                if (functions.size() == functions2.size()) {
                    int i9 = 0;
                    for (Object obj5 : functions) {
                        int i10 = i9 + 1;
                        if (i9 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivFunction) obj5).equals((DivFunction) functions2.get(i9), expressionResolver, expressionResolver2)) {
                            i9 = i10;
                        }
                    }
                    z5 = true;
                }
                z5 = false;
                break;
            }
            return false;
        }
        if (!z5 || !getHeight().equals(divSlider.getHeight(), expressionResolver, expressionResolver2) || !Intrinsics.areEqual(getId(), divSlider.getId()) || ((Boolean) this.isEnabled.evaluate(expressionResolver)).booleanValue() != ((Boolean) divSlider.isEnabled.evaluate(expressionResolver2)).booleanValue()) {
            return false;
        }
        DivLayoutProvider layoutProvider = getLayoutProvider();
        if (!(layoutProvider != null ? layoutProvider.equals(divSlider.getLayoutProvider(), expressionResolver, expressionResolver2) : divSlider.getLayoutProvider() == null)) {
            return false;
        }
        DivEdgeInsets margins = getMargins();
        if (!(margins != null ? margins.equals(divSlider.getMargins(), expressionResolver, expressionResolver2) : divSlider.getMargins() == null) || ((Number) this.maxValue.evaluate(expressionResolver)).longValue() != ((Number) divSlider.maxValue.evaluate(expressionResolver2)).longValue() || ((Number) this.minValue.evaluate(expressionResolver)).longValue() != ((Number) divSlider.minValue.evaluate(expressionResolver2)).longValue()) {
            return false;
        }
        DivEdgeInsets paddings = getPaddings();
        if (!(paddings != null ? paddings.equals(divSlider.getPaddings(), expressionResolver, expressionResolver2) : divSlider.getPaddings() == null)) {
            return false;
        }
        List list = this.ranges;
        if (list != null) {
            List list2 = divSlider.ranges;
            if (list2 != null) {
                if (list.size() == list2.size()) {
                    int i11 = 0;
                    for (Object obj6 : list) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((Range) obj6).equals((Range) list2.get(i11), expressionResolver, expressionResolver2)) {
                            i11 = i12;
                        }
                    }
                    z6 = true;
                }
                z6 = false;
                break;
            }
            return false;
        }
        if (!z6) {
            return false;
        }
        Expression reuseId = getReuseId();
        String str = reuseId != null ? (String) reuseId.evaluate(expressionResolver) : null;
        Expression reuseId2 = divSlider.getReuseId();
        if (!Intrinsics.areEqual(str, reuseId2 != null ? (String) reuseId2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression rowSpan = getRowSpan();
        Long l2 = rowSpan != null ? (Long) rowSpan.evaluate(expressionResolver) : null;
        Expression rowSpan2 = divSlider.getRowSpan();
        if (!Intrinsics.areEqual(l2, rowSpan2 != null ? (Long) rowSpan2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        DivAccessibility divAccessibility = this.secondaryValueAccessibility;
        if (!(divAccessibility != null ? divAccessibility.equals(divSlider.secondaryValueAccessibility, expressionResolver, expressionResolver2) : divSlider.secondaryValueAccessibility == null)) {
            return false;
        }
        List selectedActions = getSelectedActions();
        if (selectedActions != null) {
            List selectedActions2 = divSlider.getSelectedActions();
            if (selectedActions2 != null) {
                if (selectedActions.size() == selectedActions2.size()) {
                    int i13 = 0;
                    for (Object obj7 : selectedActions) {
                        int i14 = i13 + 1;
                        if (i13 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivAction) obj7).equals((DivAction) selectedActions2.get(i13), expressionResolver, expressionResolver2)) {
                            i13 = i14;
                        }
                    }
                    z7 = true;
                }
                z7 = false;
                break;
            }
            return false;
        }
        if (!z7) {
            return false;
        }
        DivDrawable divDrawable = this.thumbSecondaryStyle;
        if (!(divDrawable != null ? divDrawable.equals(divSlider.thumbSecondaryStyle, expressionResolver, expressionResolver2) : divSlider.thumbSecondaryStyle == null)) {
            return false;
        }
        TextStyle textStyle = this.thumbSecondaryTextStyle;
        if (!(textStyle != null ? textStyle.equals(divSlider.thumbSecondaryTextStyle, expressionResolver, expressionResolver2) : divSlider.thumbSecondaryTextStyle == null) || !Intrinsics.areEqual(this.thumbSecondaryValueVariable, divSlider.thumbSecondaryValueVariable) || !this.thumbStyle.equals(divSlider.thumbStyle, expressionResolver, expressionResolver2)) {
            return false;
        }
        TextStyle textStyle2 = this.thumbTextStyle;
        if (!(textStyle2 != null ? textStyle2.equals(divSlider.thumbTextStyle, expressionResolver, expressionResolver2) : divSlider.thumbTextStyle == null) || !Intrinsics.areEqual(this.thumbValueVariable, divSlider.thumbValueVariable)) {
            return false;
        }
        DivDrawable divDrawable2 = this.tickMarkActiveStyle;
        if (!(divDrawable2 != null ? divDrawable2.equals(divSlider.tickMarkActiveStyle, expressionResolver, expressionResolver2) : divSlider.tickMarkActiveStyle == null)) {
            return false;
        }
        DivDrawable divDrawable3 = this.tickMarkInactiveStyle;
        if (!(divDrawable3 != null ? divDrawable3.equals(divSlider.tickMarkInactiveStyle, expressionResolver, expressionResolver2) : divSlider.tickMarkInactiveStyle == null)) {
            return false;
        }
        List tooltips = getTooltips();
        if (tooltips != null) {
            List tooltips2 = divSlider.getTooltips();
            if (tooltips2 != null) {
                if (tooltips.size() == tooltips2.size()) {
                    int i15 = 0;
                    for (Object obj8 : tooltips) {
                        int i16 = i15 + 1;
                        if (i15 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivTooltip) obj8).equals((DivTooltip) tooltips2.get(i15), expressionResolver, expressionResolver2)) {
                            i15 = i16;
                        }
                    }
                    z8 = true;
                }
                z8 = false;
                break;
            }
            return false;
        }
        if (!z8 || !this.trackActiveStyle.equals(divSlider.trackActiveStyle, expressionResolver, expressionResolver2) || !this.trackInactiveStyle.equals(divSlider.trackInactiveStyle, expressionResolver, expressionResolver2)) {
            return false;
        }
        DivTransform transform = getTransform();
        if (!(transform != null ? transform.equals(divSlider.getTransform(), expressionResolver, expressionResolver2) : divSlider.getTransform() == null)) {
            return false;
        }
        DivChangeTransition transitionChange = getTransitionChange();
        if (!(transitionChange != null ? transitionChange.equals(divSlider.getTransitionChange(), expressionResolver, expressionResolver2) : divSlider.getTransitionChange() == null)) {
            return false;
        }
        DivAppearanceTransition transitionIn = getTransitionIn();
        if (!(transitionIn != null ? transitionIn.equals(divSlider.getTransitionIn(), expressionResolver, expressionResolver2) : divSlider.getTransitionIn() == null)) {
            return false;
        }
        DivAppearanceTransition transitionOut = getTransitionOut();
        if (!(transitionOut != null ? transitionOut.equals(divSlider.getTransitionOut(), expressionResolver, expressionResolver2) : divSlider.getTransitionOut() == null)) {
            return false;
        }
        List transitionTriggers = getTransitionTriggers();
        if (transitionTriggers != null) {
            List transitionTriggers2 = divSlider.getTransitionTriggers();
            if (transitionTriggers2 != null) {
                if (transitionTriggers.size() == transitionTriggers2.size()) {
                    int i17 = 0;
                    for (Object obj9 : transitionTriggers) {
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivTransitionTrigger) obj9) == ((DivTransitionTrigger) transitionTriggers2.get(i17))) {
                            i17 = i18;
                        }
                    }
                    z9 = true;
                }
                z9 = false;
                break;
            }
            return false;
        }
        if (!z9) {
            return false;
        }
        List variableTriggers = getVariableTriggers();
        if (variableTriggers != null) {
            List variableTriggers2 = divSlider.getVariableTriggers();
            if (variableTriggers2 != null) {
                if (variableTriggers.size() == variableTriggers2.size()) {
                    int i19 = 0;
                    for (Object obj10 : variableTriggers) {
                        int i20 = i19 + 1;
                        if (i19 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivTrigger) obj10).equals((DivTrigger) variableTriggers2.get(i19), expressionResolver, expressionResolver2)) {
                            i19 = i20;
                        }
                    }
                    z10 = true;
                }
                z10 = false;
                break;
            }
            return false;
        }
        if (!z10) {
            return false;
        }
        List variables = getVariables();
        if (variables != null) {
            List variables2 = divSlider.getVariables();
            if (variables2 != null) {
                if (variables.size() == variables2.size()) {
                    int i21 = 0;
                    for (Object obj11 : variables) {
                        int i22 = i21 + 1;
                        if (i21 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivVariable) obj11).equals((DivVariable) variables2.get(i21), expressionResolver, expressionResolver2)) {
                            i21 = i22;
                        }
                    }
                    z11 = true;
                }
                z11 = false;
                break;
            }
            return false;
        }
        if (!z11 || getVisibility().evaluate(expressionResolver) != divSlider.getVisibility().evaluate(expressionResolver2)) {
            return false;
        }
        DivVisibilityAction visibilityAction = getVisibilityAction();
        if (!(visibilityAction != null ? visibilityAction.equals(divSlider.getVisibilityAction(), expressionResolver, expressionResolver2) : divSlider.getVisibilityAction() == null)) {
            return false;
        }
        List visibilityActions = getVisibilityActions();
        if (visibilityActions != null) {
            List visibilityActions2 = divSlider.getVisibilityActions();
            if (visibilityActions2 != null) {
                if (visibilityActions.size() == visibilityActions2.size()) {
                    int i23 = 0;
                    for (Object obj12 : visibilityActions) {
                        int i24 = i23 + 1;
                        if (i23 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivVisibilityAction) obj12).equals((DivVisibilityAction) visibilityActions2.get(i23), expressionResolver, expressionResolver2)) {
                            i23 = i24;
                        }
                    }
                    z12 = true;
                }
                z12 = false;
                break;
            }
            return false;
        }
        return z12 && getWidth().equals(divSlider.getWidth(), expressionResolver, expressionResolver2);
    }

    public static /* synthetic */ DivSlider copy$default(DivSlider divSlider, DivAccessibility divAccessibility, Expression expression, Expression expression2, Expression expression3, List list, List list2, DivBorder divBorder, Expression expression4, List list3, List list4, DivFocus divFocus, List list5, DivSize divSize, String str, Expression expression5, DivLayoutProvider divLayoutProvider, DivEdgeInsets divEdgeInsets, Expression expression6, Expression expression7, DivEdgeInsets divEdgeInsets2, List list6, Expression expression8, Expression expression9, DivAccessibility divAccessibility2, List list7, DivDrawable divDrawable, TextStyle textStyle, String str2, DivDrawable divDrawable2, TextStyle textStyle2, String str3, DivDrawable divDrawable3, DivDrawable divDrawable4, List list8, DivDrawable divDrawable5, DivDrawable divDrawable6, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list9, List list10, List list11, Expression expression10, DivVisibilityAction divVisibilityAction, List list12, DivSize divSize2, int i, int i2, Object obj) {
        DivAccessibility accessibility = (i & 1) != 0 ? divSlider.getAccessibility() : divAccessibility;
        Expression alignmentHorizontal = (i & 2) != 0 ? divSlider.getAlignmentHorizontal() : expression;
        Expression alignmentVertical = (i & 4) != 0 ? divSlider.getAlignmentVertical() : expression2;
        Expression alpha = (i & 8) != 0 ? divSlider.getAlpha() : expression3;
        List animators = (i & 16) != 0 ? divSlider.getAnimators() : list;
        List background = (i & 32) != 0 ? divSlider.getBackground() : list2;
        DivBorder border = (i & 64) != 0 ? divSlider.getBorder() : divBorder;
        Expression columnSpan = (i & 128) != 0 ? divSlider.getColumnSpan() : expression4;
        List disappearActions = (i & 256) != 0 ? divSlider.getDisappearActions() : list3;
        List extensions = (i & 512) != 0 ? divSlider.getExtensions() : list4;
        DivFocus focus = (i & 1024) != 0 ? divSlider.getFocus() : divFocus;
        List functions = (i & 2048) != 0 ? divSlider.getFunctions() : list5;
        DivSize height = (i & 4096) != 0 ? divSlider.getHeight() : divSize;
        String id = (i & 8192) != 0 ? divSlider.getId() : str;
        Expression expression11 = (i & 16384) != 0 ? divSlider.isEnabled : expression5;
        DivLayoutProvider layoutProvider = (i & 32768) != 0 ? divSlider.getLayoutProvider() : divLayoutProvider;
        DivEdgeInsets margins = (i & 65536) != 0 ? divSlider.getMargins() : divEdgeInsets;
        Expression expression12 = expression11;
        Expression expression13 = (i & 131072) != 0 ? divSlider.maxValue : expression6;
        Expression expression14 = (i & 262144) != 0 ? divSlider.minValue : expression7;
        DivEdgeInsets paddings = (i & 524288) != 0 ? divSlider.getPaddings() : divEdgeInsets2;
        Expression expression15 = expression14;
        List list13 = (i & 1048576) != 0 ? divSlider.ranges : list6;
        Expression reuseId = (i & 2097152) != 0 ? divSlider.getReuseId() : expression8;
        Expression rowSpan = (i & 4194304) != 0 ? divSlider.getRowSpan() : expression9;
        List list14 = list13;
        DivAccessibility divAccessibility3 = (i & 8388608) != 0 ? divSlider.secondaryValueAccessibility : divAccessibility2;
        return divSlider.copy(accessibility, alignmentHorizontal, alignmentVertical, alpha, animators, background, border, columnSpan, disappearActions, extensions, focus, functions, height, id, expression12, layoutProvider, margins, expression13, expression15, paddings, list14, reuseId, rowSpan, divAccessibility3, (i & 16777216) != 0 ? divSlider.getSelectedActions() : list7, (i & 33554432) != 0 ? divSlider.thumbSecondaryStyle : divDrawable, (i & 67108864) != 0 ? divSlider.thumbSecondaryTextStyle : textStyle, (i & 134217728) != 0 ? divSlider.thumbSecondaryValueVariable : str2, (i & 268435456) != 0 ? divSlider.thumbStyle : divDrawable2, (i & 536870912) != 0 ? divSlider.thumbTextStyle : textStyle2, (i & 1073741824) != 0 ? divSlider.thumbValueVariable : str3, (i & Integer.MIN_VALUE) != 0 ? divSlider.tickMarkActiveStyle : divDrawable3, (i2 & 1) != 0 ? divSlider.tickMarkInactiveStyle : divDrawable4, (i2 & 2) != 0 ? divSlider.getTooltips() : list8, (i2 & 4) != 0 ? divSlider.trackActiveStyle : divDrawable5, (i2 & 8) != 0 ? divSlider.trackInactiveStyle : divDrawable6, (i2 & 16) != 0 ? divSlider.getTransform() : divTransform, (i2 & 32) != 0 ? divSlider.getTransitionChange() : divChangeTransition, (i2 & 64) != 0 ? divSlider.getTransitionIn() : divAppearanceTransition, (i2 & 128) != 0 ? divSlider.getTransitionOut() : divAppearanceTransition2, (i2 & 256) != 0 ? divSlider.getTransitionTriggers() : list9, (i2 & 512) != 0 ? divSlider.getVariableTriggers() : list10, (i2 & 1024) != 0 ? divSlider.getVariables() : list11, (i2 & 2048) != 0 ? divSlider.getVisibility() : expression10, (i2 & 4096) != 0 ? divSlider.getVisibilityAction() : divVisibilityAction, (i2 & 8192) != 0 ? divSlider.getVisibilityActions() : list12, (i2 & 16384) != 0 ? divSlider.getWidth() : divSize2);
    }

    public final DivSlider copy(DivAccessibility divAccessibility, Expression expression, Expression expression2, Expression expression3, List list, List list2, DivBorder divBorder, Expression expression4, List list3, List list4, DivFocus divFocus, List list5, DivSize divSize, String str, Expression expression5, DivLayoutProvider divLayoutProvider, DivEdgeInsets divEdgeInsets, Expression expression6, Expression expression7, DivEdgeInsets divEdgeInsets2, List list6, Expression expression8, Expression expression9, DivAccessibility divAccessibility2, List list7, DivDrawable divDrawable, TextStyle textStyle, String str2, DivDrawable divDrawable2, TextStyle textStyle2, String str3, DivDrawable divDrawable3, DivDrawable divDrawable4, List list8, DivDrawable divDrawable5, DivDrawable divDrawable6, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list9, List list10, List list11, Expression expression10, DivVisibilityAction divVisibilityAction, List list12, DivSize divSize2) {
        return new DivSlider(divAccessibility, expression, expression2, expression3, list, list2, divBorder, expression4, list3, list4, divFocus, list5, divSize, str, expression5, divLayoutProvider, divEdgeInsets, expression6, expression7, divEdgeInsets2, list6, expression8, expression9, divAccessibility2, list7, divDrawable, textStyle, str2, divDrawable2, textStyle2, str3, divDrawable3, divDrawable4, list8, divDrawable5, divDrawable6, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, list9, list10, list11, expression10, divVisibilityAction, list12, divSize2);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivSliderJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivSliderJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivSlider.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivSlider fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivSliderJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivSliderJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.INSTANCE;
        ALPHA_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        HEIGHT_DEFAULT_VALUE = new DivSize.WrapContent(new DivWrapContentSize(null, null, null, 7, null));
        IS_ENABLED_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        MAX_VALUE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        MIN_VALUE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        VISIBILITY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        WIDTH_DEFAULT_VALUE = new DivSize.MatchParent(new DivMatchParentSize(null, null, null, 7, null == true ? 1 : 0));
        CREATOR = new Function2() { // from class: com.yandex.div2.DivSlider$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivSlider invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivSlider.Companion.fromJson(parsingEnvironment, jSONObject);
            }
        };
    }

    /* compiled from: DivSlider.kt */
    public static final class TextStyle implements JSONSerializable, Hashable {
        private static final Function2 CREATOR;
        public static final Companion Companion = new Companion(null);
        private static final Expression FONT_SIZE_DEFAULT_VALUE;
        private static final Expression FONT_SIZE_UNIT_DEFAULT_VALUE;
        private static final Expression LETTER_SPACING_DEFAULT_VALUE;
        private static final Expression TEXT_COLOR_DEFAULT_VALUE;
        private Integer _hash;
        public final Expression fontFamily;
        public final Expression fontSize;
        public final Expression fontSizeUnit;
        public final Expression fontVariationSettings;
        public final Expression fontWeight;
        public final Expression fontWeightValue;
        public final Expression letterSpacing;
        public final DivPoint offset;
        public final Expression textColor;

        public TextStyle(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5, Expression expression6, Expression expression7, DivPoint divPoint, Expression expression8) {
            this.fontFamily = expression;
            this.fontSize = expression2;
            this.fontSizeUnit = expression3;
            this.fontVariationSettings = expression4;
            this.fontWeight = expression5;
            this.fontWeightValue = expression6;
            this.letterSpacing = expression7;
            this.offset = divPoint;
            this.textColor = expression8;
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this._hash;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = Reflection.getOrCreateKotlinClass(TextStyle.class).hashCode();
            Expression expression = this.fontFamily;
            int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0) + this.fontSize.hashCode() + this.fontSizeUnit.hashCode();
            Expression expression2 = this.fontVariationSettings;
            int hashCode3 = hashCode2 + (expression2 != null ? expression2.hashCode() : 0);
            Expression expression3 = this.fontWeight;
            int hashCode4 = hashCode3 + (expression3 != null ? expression3.hashCode() : 0);
            Expression expression4 = this.fontWeightValue;
            int hashCode5 = hashCode4 + (expression4 != null ? expression4.hashCode() : 0) + this.letterSpacing.hashCode();
            DivPoint divPoint = this.offset;
            int hash = hashCode5 + (divPoint != null ? divPoint.hash() : 0) + this.textColor.hashCode();
            this._hash = Integer.valueOf(hash);
            return hash;
        }

        public final boolean equals(TextStyle textStyle, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            if (textStyle == null) {
                return false;
            }
            Expression expression = this.fontFamily;
            String str = expression != null ? (String) expression.evaluate(expressionResolver) : null;
            Expression expression2 = textStyle.fontFamily;
            if (!Intrinsics.areEqual(str, expression2 != null ? (String) expression2.evaluate(expressionResolver2) : null) || ((Number) this.fontSize.evaluate(expressionResolver)).longValue() != ((Number) textStyle.fontSize.evaluate(expressionResolver2)).longValue() || this.fontSizeUnit.evaluate(expressionResolver) != textStyle.fontSizeUnit.evaluate(expressionResolver2)) {
                return false;
            }
            Expression expression3 = this.fontVariationSettings;
            JSONObject jSONObject = expression3 != null ? (JSONObject) expression3.evaluate(expressionResolver) : null;
            Expression expression4 = textStyle.fontVariationSettings;
            if (!Intrinsics.areEqual(jSONObject, expression4 != null ? (JSONObject) expression4.evaluate(expressionResolver2) : null)) {
                return false;
            }
            Expression expression5 = this.fontWeight;
            DivFontWeight divFontWeight = expression5 != null ? (DivFontWeight) expression5.evaluate(expressionResolver) : null;
            Expression expression6 = textStyle.fontWeight;
            if (divFontWeight != (expression6 != null ? (DivFontWeight) expression6.evaluate(expressionResolver2) : null)) {
                return false;
            }
            Expression expression7 = this.fontWeightValue;
            Long l = expression7 != null ? (Long) expression7.evaluate(expressionResolver) : null;
            Expression expression8 = textStyle.fontWeightValue;
            if (!Intrinsics.areEqual(l, expression8 != null ? (Long) expression8.evaluate(expressionResolver2) : null) || ((Number) this.letterSpacing.evaluate(expressionResolver)).doubleValue() != ((Number) textStyle.letterSpacing.evaluate(expressionResolver2)).doubleValue()) {
                return false;
            }
            DivPoint divPoint = this.offset;
            return (divPoint != null ? divPoint.equals(textStyle.offset, expressionResolver, expressionResolver2) : textStyle.offset == null) && ((Number) this.textColor.evaluate(expressionResolver)).intValue() == ((Number) textStyle.textColor.evaluate(expressionResolver2)).intValue();
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((DivSliderTextStyleJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivSliderTextStyleJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        /* compiled from: DivSlider.kt */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final TextStyle fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return ((DivSliderTextStyleJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivSliderTextStyleJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
            }
        }

        static {
            Expression.Companion companion = Expression.INSTANCE;
            FONT_SIZE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 12L, null, 2, null);
            FONT_SIZE_UNIT_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivSizeUnit.SP, null, 2, null);
            LETTER_SPACING_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
            TEXT_COLOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, -16777216, null, 2, null);
            CREATOR = new Function2() { // from class: com.yandex.div2.DivSlider$TextStyle$Companion$CREATOR$1
                @Override // kotlin.jvm.functions.Function2
                @NotNull
                public final DivSlider.TextStyle invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                    return DivSlider.TextStyle.Companion.fromJson(parsingEnvironment, jSONObject);
                }
            };
        }
    }

    /* compiled from: DivSlider.kt */
    public static final class Range implements JSONSerializable, Hashable {
        private Integer _hash;
        public final Expression end;
        public final DivEdgeInsets margins;
        public final Expression start;
        public final DivDrawable trackActiveStyle;
        public final DivDrawable trackInactiveStyle;
        public static final Companion Companion = new Companion(null);
        private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivSlider$Range$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivSlider.Range invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivSlider.Range.Companion.fromJson(parsingEnvironment, jSONObject);
            }
        };

        public Range(Expression expression, DivEdgeInsets divEdgeInsets, Expression expression2, DivDrawable divDrawable, DivDrawable divDrawable2) {
            this.end = expression;
            this.margins = divEdgeInsets;
            this.start = expression2;
            this.trackActiveStyle = divDrawable;
            this.trackInactiveStyle = divDrawable2;
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this._hash;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = Reflection.getOrCreateKotlinClass(Range.class).hashCode();
            Expression expression = this.end;
            int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0);
            DivEdgeInsets divEdgeInsets = this.margins;
            int hash = hashCode2 + (divEdgeInsets != null ? divEdgeInsets.hash() : 0);
            Expression expression2 = this.start;
            int hashCode3 = hash + (expression2 != null ? expression2.hashCode() : 0);
            DivDrawable divDrawable = this.trackActiveStyle;
            int hash2 = hashCode3 + (divDrawable != null ? divDrawable.hash() : 0);
            DivDrawable divDrawable2 = this.trackInactiveStyle;
            int hash3 = hash2 + (divDrawable2 != null ? divDrawable2.hash() : 0);
            this._hash = Integer.valueOf(hash3);
            return hash3;
        }

        public final boolean equals(Range range, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            if (range == null) {
                return false;
            }
            Expression expression = this.end;
            Long l = expression != null ? (Long) expression.evaluate(expressionResolver) : null;
            Expression expression2 = range.end;
            if (!Intrinsics.areEqual(l, expression2 != null ? (Long) expression2.evaluate(expressionResolver2) : null)) {
                return false;
            }
            DivEdgeInsets divEdgeInsets = this.margins;
            if (!(divEdgeInsets != null ? divEdgeInsets.equals(range.margins, expressionResolver, expressionResolver2) : range.margins == null)) {
                return false;
            }
            Expression expression3 = this.start;
            Long l2 = expression3 != null ? (Long) expression3.evaluate(expressionResolver) : null;
            Expression expression4 = range.start;
            if (!Intrinsics.areEqual(l2, expression4 != null ? (Long) expression4.evaluate(expressionResolver2) : null)) {
                return false;
            }
            DivDrawable divDrawable = this.trackActiveStyle;
            if (!(divDrawable != null ? divDrawable.equals(range.trackActiveStyle, expressionResolver, expressionResolver2) : range.trackActiveStyle == null)) {
                return false;
            }
            DivDrawable divDrawable2 = this.trackInactiveStyle;
            DivDrawable divDrawable3 = range.trackInactiveStyle;
            return divDrawable2 != null ? divDrawable2.equals(divDrawable3, expressionResolver, expressionResolver2) : divDrawable3 == null;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((DivSliderRangeJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivSliderRangeJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        /* compiled from: DivSlider.kt */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Range fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return ((DivSliderRangeJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivSliderRangeJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
            }
        }
    }
}
