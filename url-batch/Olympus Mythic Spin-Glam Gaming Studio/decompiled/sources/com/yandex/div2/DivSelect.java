package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivSelect;
import com.yandex.div2.DivSelectJsonParser;
import com.yandex.div2.DivSize;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivSelect.kt */
/* loaded from: classes10.dex */
public final class DivSelect implements JSONSerializable, Hashable, DivBase {
    private static final Expression ALPHA_DEFAULT_VALUE;
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final Expression FONT_SIZE_DEFAULT_VALUE;
    private static final Expression FONT_SIZE_UNIT_DEFAULT_VALUE;
    private static final DivSize.WrapContent HEIGHT_DEFAULT_VALUE;
    private static final Expression HINT_COLOR_DEFAULT_VALUE;
    private static final Expression LETTER_SPACING_DEFAULT_VALUE;
    private static final Expression TEXT_COLOR_DEFAULT_VALUE;
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
    public final Expression fontFamily;
    public final Expression fontSize;
    public final Expression fontSizeUnit;
    public final Expression fontVariationSettings;
    public final Expression fontWeight;
    public final Expression fontWeightValue;
    private final List functions;
    private final DivSize height;
    public final Expression hintColor;
    public final Expression hintText;
    private final String id;
    private final DivLayoutProvider layoutProvider;
    public final Expression letterSpacing;
    public final Expression lineHeight;
    private final DivEdgeInsets margins;
    public final List options;
    private final DivEdgeInsets paddings;
    private final Expression reuseId;
    private final Expression rowSpan;
    private final List selectedActions;
    public final Expression textColor;
    private final List tooltips;
    private final DivTransform transform;
    private final DivChangeTransition transitionChange;
    private final DivAppearanceTransition transitionIn;
    private final DivAppearanceTransition transitionOut;
    private final List transitionTriggers;
    public final String valueVariable;
    private final List variableTriggers;
    private final List variables;
    private final Expression visibility;
    private final DivVisibilityAction visibilityAction;
    private final List visibilityActions;
    private final DivSize width;

    public DivSelect(DivAccessibility divAccessibility, Expression expression, Expression expression2, Expression expression3, List list, List list2, DivBorder divBorder, Expression expression4, List list3, List list4, DivFocus divFocus, Expression expression5, Expression expression6, Expression expression7, Expression expression8, Expression expression9, Expression expression10, List list5, DivSize divSize, Expression expression11, Expression expression12, String str, DivLayoutProvider divLayoutProvider, Expression expression13, Expression expression14, DivEdgeInsets divEdgeInsets, List list6, DivEdgeInsets divEdgeInsets2, Expression expression15, Expression expression16, List list7, Expression expression17, List list8, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list9, String str2, List list10, List list11, Expression expression18, DivVisibilityAction divVisibilityAction, List list12, DivSize divSize2) {
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
        this.fontFamily = expression5;
        this.fontSize = expression6;
        this.fontSizeUnit = expression7;
        this.fontVariationSettings = expression8;
        this.fontWeight = expression9;
        this.fontWeightValue = expression10;
        this.functions = list5;
        this.height = divSize;
        this.hintColor = expression11;
        this.hintText = expression12;
        this.id = str;
        this.layoutProvider = divLayoutProvider;
        this.letterSpacing = expression13;
        this.lineHeight = expression14;
        this.margins = divEdgeInsets;
        this.options = list6;
        this.paddings = divEdgeInsets2;
        this.reuseId = expression15;
        this.rowSpan = expression16;
        this.selectedActions = list7;
        this.textColor = expression17;
        this.tooltips = list8;
        this.transform = divTransform;
        this.transitionChange = divChangeTransition;
        this.transitionIn = divAppearanceTransition;
        this.transitionOut = divAppearanceTransition2;
        this.transitionTriggers = list9;
        this.valueVariable = str2;
        this.variableTriggers = list10;
        this.variables = list11;
        this.visibility = expression18;
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
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivSelect.class).hashCode();
        DivAccessibility accessibility = getAccessibility();
        int i10 = 0;
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
        int i11 = hashCode3 + i;
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
        int i12 = i11 + i2;
        DivBorder border = getBorder();
        int hash2 = i12 + (border != null ? border.hash() : 0);
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
        int i13 = hashCode4 + i3;
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
        int i14 = i13 + i4;
        DivFocus focus = getFocus();
        int hash3 = i14 + (focus != null ? focus.hash() : 0);
        Expression expression = this.fontFamily;
        int hashCode5 = hash3 + (expression != null ? expression.hashCode() : 0) + this.fontSize.hashCode() + this.fontSizeUnit.hashCode();
        Expression expression2 = this.fontVariationSettings;
        int hashCode6 = hashCode5 + (expression2 != null ? expression2.hashCode() : 0);
        Expression expression3 = this.fontWeight;
        int hashCode7 = hashCode6 + (expression3 != null ? expression3.hashCode() : 0);
        Expression expression4 = this.fontWeightValue;
        int hashCode8 = hashCode7 + (expression4 != null ? expression4.hashCode() : 0);
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
        int hash4 = hashCode8 + i5 + getHeight().hash() + this.hintColor.hashCode();
        Expression expression5 = this.hintText;
        int hashCode9 = hash4 + (expression5 != null ? expression5.hashCode() : 0);
        String id = getId();
        int hashCode10 = hashCode9 + (id != null ? id.hashCode() : 0);
        DivLayoutProvider layoutProvider = getLayoutProvider();
        int hash5 = hashCode10 + (layoutProvider != null ? layoutProvider.hash() : 0) + this.letterSpacing.hashCode();
        Expression expression6 = this.lineHeight;
        int hashCode11 = hash5 + (expression6 != null ? expression6.hashCode() : 0);
        DivEdgeInsets margins = getMargins();
        int hash6 = hashCode11 + (margins != null ? margins.hash() : 0);
        Iterator it6 = this.options.iterator();
        int i15 = 0;
        while (it6.hasNext()) {
            i15 += ((Option) it6.next()).hash();
        }
        int i16 = hash6 + i15;
        DivEdgeInsets paddings = getPaddings();
        int hash7 = i16 + (paddings != null ? paddings.hash() : 0);
        Expression reuseId = getReuseId();
        int hashCode12 = hash7 + (reuseId != null ? reuseId.hashCode() : 0);
        Expression rowSpan = getRowSpan();
        int hashCode13 = hashCode12 + (rowSpan != null ? rowSpan.hashCode() : 0);
        List selectedActions = getSelectedActions();
        if (selectedActions != null) {
            Iterator it7 = selectedActions.iterator();
            i6 = 0;
            while (it7.hasNext()) {
                i6 += ((DivAction) it7.next()).hash();
            }
        } else {
            i6 = 0;
        }
        int hashCode14 = hashCode13 + i6 + this.textColor.hashCode();
        List tooltips = getTooltips();
        if (tooltips != null) {
            Iterator it8 = tooltips.iterator();
            i7 = 0;
            while (it8.hasNext()) {
                i7 += ((DivTooltip) it8.next()).hash();
            }
        } else {
            i7 = 0;
        }
        int i17 = hashCode14 + i7;
        DivTransform transform = getTransform();
        int hash8 = i17 + (transform != null ? transform.hash() : 0);
        DivChangeTransition transitionChange = getTransitionChange();
        int hash9 = hash8 + (transitionChange != null ? transitionChange.hash() : 0);
        DivAppearanceTransition transitionIn = getTransitionIn();
        int hash10 = hash9 + (transitionIn != null ? transitionIn.hash() : 0);
        DivAppearanceTransition transitionOut = getTransitionOut();
        int hash11 = hash10 + (transitionOut != null ? transitionOut.hash() : 0);
        List transitionTriggers = getTransitionTriggers();
        int hashCode15 = hash11 + (transitionTriggers != null ? transitionTriggers.hashCode() : 0) + this.valueVariable.hashCode();
        List variableTriggers = getVariableTriggers();
        if (variableTriggers != null) {
            Iterator it9 = variableTriggers.iterator();
            i8 = 0;
            while (it9.hasNext()) {
                i8 += ((DivTrigger) it9.next()).hash();
            }
        } else {
            i8 = 0;
        }
        int i18 = hashCode15 + i8;
        List variables = getVariables();
        if (variables != null) {
            Iterator it10 = variables.iterator();
            i9 = 0;
            while (it10.hasNext()) {
                i9 += ((DivVariable) it10.next()).hash();
            }
        } else {
            i9 = 0;
        }
        int hashCode16 = i18 + i9 + getVisibility().hashCode();
        DivVisibilityAction visibilityAction = getVisibilityAction();
        int hash12 = hashCode16 + (visibilityAction != null ? visibilityAction.hash() : 0);
        List visibilityActions = getVisibilityActions();
        if (visibilityActions != null) {
            Iterator it11 = visibilityActions.iterator();
            while (it11.hasNext()) {
                i10 += ((DivVisibilityAction) it11.next()).hash();
            }
        }
        int hash13 = hash12 + i10 + getWidth().hash();
        this._hash = Integer.valueOf(hash13);
        return hash13;
    }

    /* JADX WARN: Code restructure failed: missing block: B:393:0x06ca, code lost:
    
        if (r9.getVisibilityActions() == null) goto L493;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x0652, code lost:
    
        if (r9.getVariables() == null) goto L460;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x0606, code lost:
    
        if (r9.getVariableTriggers() == null) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x05b0, code lost:
    
        if (r9.getTransitionTriggers() == null) goto L412;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x04fb, code lost:
    
        if (r9.getTooltips() == null) goto L354;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x0495, code lost:
    
        if (r9.getSelectedActions() == null) goto L329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x02ea, code lost:
    
        if (r9.getFunctions() == null) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x01e6, code lost:
    
        if (r9.getExtensions() == null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x019a, code lost:
    
        if (r9.getDisappearActions() == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x0112, code lost:
    
        if (r9.getBackground() == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:532:0x00c6, code lost:
    
        if (r9.getAnimators() == null) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:452:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(DivSelect divSelect, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
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
        if (divSelect == null) {
            return false;
        }
        DivAccessibility accessibility = getAccessibility();
        if (!(accessibility != null ? accessibility.equals(divSelect.getAccessibility(), expressionResolver, expressionResolver2) : divSelect.getAccessibility() == null)) {
            return false;
        }
        Expression alignmentHorizontal = getAlignmentHorizontal();
        DivAlignmentHorizontal divAlignmentHorizontal = alignmentHorizontal != null ? (DivAlignmentHorizontal) alignmentHorizontal.evaluate(expressionResolver) : null;
        Expression alignmentHorizontal2 = divSelect.getAlignmentHorizontal();
        if (divAlignmentHorizontal != (alignmentHorizontal2 != null ? (DivAlignmentHorizontal) alignmentHorizontal2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression alignmentVertical = getAlignmentVertical();
        DivAlignmentVertical divAlignmentVertical = alignmentVertical != null ? (DivAlignmentVertical) alignmentVertical.evaluate(expressionResolver) : null;
        Expression alignmentVertical2 = divSelect.getAlignmentVertical();
        if (divAlignmentVertical != (alignmentVertical2 != null ? (DivAlignmentVertical) alignmentVertical2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        if (!(((Number) getAlpha().evaluate(expressionResolver)).doubleValue() == ((Number) divSelect.getAlpha().evaluate(expressionResolver2)).doubleValue())) {
            return false;
        }
        List animators = getAnimators();
        if (animators != null) {
            List animators2 = divSelect.getAnimators();
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
            List background2 = divSelect.getBackground();
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
        if (!(border != null ? border.equals(divSelect.getBorder(), expressionResolver, expressionResolver2) : divSelect.getBorder() == null)) {
            return false;
        }
        Expression columnSpan = getColumnSpan();
        Long l = columnSpan != null ? (Long) columnSpan.evaluate(expressionResolver) : null;
        Expression columnSpan2 = divSelect.getColumnSpan();
        if (!Intrinsics.areEqual(l, columnSpan2 != null ? (Long) columnSpan2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List disappearActions = getDisappearActions();
        if (disappearActions != null) {
            List disappearActions2 = divSelect.getDisappearActions();
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
            List extensions2 = divSelect.getExtensions();
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
        if (!(focus != null ? focus.equals(divSelect.getFocus(), expressionResolver, expressionResolver2) : divSelect.getFocus() == null)) {
            return false;
        }
        Expression expression = this.fontFamily;
        String str = expression != null ? (String) expression.evaluate(expressionResolver) : null;
        Expression expression2 = divSelect.fontFamily;
        if (!Intrinsics.areEqual(str, expression2 != null ? (String) expression2.evaluate(expressionResolver2) : null) || ((Number) this.fontSize.evaluate(expressionResolver)).longValue() != ((Number) divSelect.fontSize.evaluate(expressionResolver2)).longValue() || this.fontSizeUnit.evaluate(expressionResolver) != divSelect.fontSizeUnit.evaluate(expressionResolver2)) {
            return false;
        }
        Expression expression3 = this.fontVariationSettings;
        JSONObject jSONObject = expression3 != null ? (JSONObject) expression3.evaluate(expressionResolver) : null;
        Expression expression4 = divSelect.fontVariationSettings;
        if (!Intrinsics.areEqual(jSONObject, expression4 != null ? (JSONObject) expression4.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression expression5 = this.fontWeight;
        DivFontWeight divFontWeight = expression5 != null ? (DivFontWeight) expression5.evaluate(expressionResolver) : null;
        Expression expression6 = divSelect.fontWeight;
        if (divFontWeight != (expression6 != null ? (DivFontWeight) expression6.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression expression7 = this.fontWeightValue;
        Long l2 = expression7 != null ? (Long) expression7.evaluate(expressionResolver) : null;
        Expression expression8 = divSelect.fontWeightValue;
        if (!Intrinsics.areEqual(l2, expression8 != null ? (Long) expression8.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List functions = getFunctions();
        if (functions != null) {
            List functions2 = divSelect.getFunctions();
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
        if (!z5 || !getHeight().equals(divSelect.getHeight(), expressionResolver, expressionResolver2) || ((Number) this.hintColor.evaluate(expressionResolver)).intValue() != ((Number) divSelect.hintColor.evaluate(expressionResolver2)).intValue()) {
            return false;
        }
        Expression expression9 = this.hintText;
        String str2 = expression9 != null ? (String) expression9.evaluate(expressionResolver) : null;
        Expression expression10 = divSelect.hintText;
        if (!Intrinsics.areEqual(str2, expression10 != null ? (String) expression10.evaluate(expressionResolver2) : null) || !Intrinsics.areEqual(getId(), divSelect.getId())) {
            return false;
        }
        DivLayoutProvider layoutProvider = getLayoutProvider();
        if (!(layoutProvider != null ? layoutProvider.equals(divSelect.getLayoutProvider(), expressionResolver, expressionResolver2) : divSelect.getLayoutProvider() == null)) {
            return false;
        }
        if (!(((Number) this.letterSpacing.evaluate(expressionResolver)).doubleValue() == ((Number) divSelect.letterSpacing.evaluate(expressionResolver2)).doubleValue())) {
            return false;
        }
        Expression expression11 = this.lineHeight;
        Long l3 = expression11 != null ? (Long) expression11.evaluate(expressionResolver) : null;
        Expression expression12 = divSelect.lineHeight;
        if (!Intrinsics.areEqual(l3, expression12 != null ? (Long) expression12.evaluate(expressionResolver2) : null)) {
            return false;
        }
        DivEdgeInsets margins = getMargins();
        if (!(margins != null ? margins.equals(divSelect.getMargins(), expressionResolver, expressionResolver2) : divSelect.getMargins() == null)) {
            return false;
        }
        List list = this.options;
        List list2 = divSelect.options;
        if (list.size() == list2.size()) {
            int i11 = 0;
            for (Object obj6 : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                if (((Option) obj6).equals((Option) list2.get(i11), expressionResolver, expressionResolver2)) {
                    i11 = i12;
                }
            }
            z6 = true;
            if (z6) {
                return false;
            }
            DivEdgeInsets paddings = getPaddings();
            if (!(paddings != null ? paddings.equals(divSelect.getPaddings(), expressionResolver, expressionResolver2) : divSelect.getPaddings() == null)) {
                return false;
            }
            Expression reuseId = getReuseId();
            String str3 = reuseId != null ? (String) reuseId.evaluate(expressionResolver) : null;
            Expression reuseId2 = divSelect.getReuseId();
            if (!Intrinsics.areEqual(str3, reuseId2 != null ? (String) reuseId2.evaluate(expressionResolver2) : null)) {
                return false;
            }
            Expression rowSpan = getRowSpan();
            Long l4 = rowSpan != null ? (Long) rowSpan.evaluate(expressionResolver) : null;
            Expression rowSpan2 = divSelect.getRowSpan();
            if (!Intrinsics.areEqual(l4, rowSpan2 != null ? (Long) rowSpan2.evaluate(expressionResolver2) : null)) {
                return false;
            }
            List selectedActions = getSelectedActions();
            if (selectedActions != null) {
                List selectedActions2 = divSelect.getSelectedActions();
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
            if (!z7 || ((Number) this.textColor.evaluate(expressionResolver)).intValue() != ((Number) divSelect.textColor.evaluate(expressionResolver2)).intValue()) {
                return false;
            }
            List tooltips = getTooltips();
            if (tooltips != null) {
                List tooltips2 = divSelect.getTooltips();
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
            if (!z8) {
                return false;
            }
            DivTransform transform = getTransform();
            if (!(transform != null ? transform.equals(divSelect.getTransform(), expressionResolver, expressionResolver2) : divSelect.getTransform() == null)) {
                return false;
            }
            DivChangeTransition transitionChange = getTransitionChange();
            if (!(transitionChange != null ? transitionChange.equals(divSelect.getTransitionChange(), expressionResolver, expressionResolver2) : divSelect.getTransitionChange() == null)) {
                return false;
            }
            DivAppearanceTransition transitionIn = getTransitionIn();
            if (!(transitionIn != null ? transitionIn.equals(divSelect.getTransitionIn(), expressionResolver, expressionResolver2) : divSelect.getTransitionIn() == null)) {
                return false;
            }
            DivAppearanceTransition transitionOut = getTransitionOut();
            if (!(transitionOut != null ? transitionOut.equals(divSelect.getTransitionOut(), expressionResolver, expressionResolver2) : divSelect.getTransitionOut() == null)) {
                return false;
            }
            List transitionTriggers = getTransitionTriggers();
            if (transitionTriggers != null) {
                List transitionTriggers2 = divSelect.getTransitionTriggers();
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
            if (!z9 || !Intrinsics.areEqual(this.valueVariable, divSelect.valueVariable)) {
                return false;
            }
            List variableTriggers = getVariableTriggers();
            if (variableTriggers != null) {
                List variableTriggers2 = divSelect.getVariableTriggers();
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
                List variables2 = divSelect.getVariables();
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
            if (!z11 || getVisibility().evaluate(expressionResolver) != divSelect.getVisibility().evaluate(expressionResolver2)) {
                return false;
            }
            DivVisibilityAction visibilityAction = getVisibilityAction();
            if (!(visibilityAction != null ? visibilityAction.equals(divSelect.getVisibilityAction(), expressionResolver, expressionResolver2) : divSelect.getVisibilityAction() == null)) {
                return false;
            }
            List visibilityActions = getVisibilityActions();
            if (visibilityActions != null) {
                List visibilityActions2 = divSelect.getVisibilityActions();
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
            return z12 && getWidth().equals(divSelect.getWidth(), expressionResolver, expressionResolver2);
        }
        z6 = false;
        if (z6) {
        }
    }

    public static /* synthetic */ DivSelect copy$default(DivSelect divSelect, DivAccessibility divAccessibility, Expression expression, Expression expression2, Expression expression3, List list, List list2, DivBorder divBorder, Expression expression4, List list3, List list4, DivFocus divFocus, Expression expression5, Expression expression6, Expression expression7, Expression expression8, Expression expression9, Expression expression10, List list5, DivSize divSize, Expression expression11, Expression expression12, String str, DivLayoutProvider divLayoutProvider, Expression expression13, Expression expression14, DivEdgeInsets divEdgeInsets, List list6, DivEdgeInsets divEdgeInsets2, Expression expression15, Expression expression16, List list7, Expression expression17, List list8, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list9, String str2, List list10, List list11, Expression expression18, DivVisibilityAction divVisibilityAction, List list12, DivSize divSize2, int i, int i2, Object obj) {
        DivAccessibility accessibility = (i & 1) != 0 ? divSelect.getAccessibility() : divAccessibility;
        Expression alignmentHorizontal = (i & 2) != 0 ? divSelect.getAlignmentHorizontal() : expression;
        Expression alignmentVertical = (i & 4) != 0 ? divSelect.getAlignmentVertical() : expression2;
        Expression alpha = (i & 8) != 0 ? divSelect.getAlpha() : expression3;
        List animators = (i & 16) != 0 ? divSelect.getAnimators() : list;
        List background = (i & 32) != 0 ? divSelect.getBackground() : list2;
        DivBorder border = (i & 64) != 0 ? divSelect.getBorder() : divBorder;
        Expression columnSpan = (i & 128) != 0 ? divSelect.getColumnSpan() : expression4;
        List disappearActions = (i & 256) != 0 ? divSelect.getDisappearActions() : list3;
        List extensions = (i & 512) != 0 ? divSelect.getExtensions() : list4;
        DivFocus focus = (i & 1024) != 0 ? divSelect.getFocus() : divFocus;
        Expression expression19 = (i & 2048) != 0 ? divSelect.fontFamily : expression5;
        Expression expression20 = (i & 4096) != 0 ? divSelect.fontSize : expression6;
        Expression expression21 = (i & 8192) != 0 ? divSelect.fontSizeUnit : expression7;
        Expression expression22 = (i & 16384) != 0 ? divSelect.fontVariationSettings : expression8;
        Expression expression23 = (i & 32768) != 0 ? divSelect.fontWeight : expression9;
        Expression expression24 = (i & 65536) != 0 ? divSelect.fontWeightValue : expression10;
        List functions = (i & 131072) != 0 ? divSelect.getFunctions() : list5;
        DivSize height = (i & 262144) != 0 ? divSelect.getHeight() : divSize;
        Expression expression25 = expression24;
        Expression expression26 = (i & 524288) != 0 ? divSelect.hintColor : expression11;
        Expression expression27 = (i & 1048576) != 0 ? divSelect.hintText : expression12;
        String id = (i & 2097152) != 0 ? divSelect.getId() : str;
        DivLayoutProvider layoutProvider = (i & 4194304) != 0 ? divSelect.getLayoutProvider() : divLayoutProvider;
        Expression expression28 = expression27;
        Expression expression29 = (i & 8388608) != 0 ? divSelect.letterSpacing : expression13;
        Expression expression30 = (i & 16777216) != 0 ? divSelect.lineHeight : expression14;
        return divSelect.copy(accessibility, alignmentHorizontal, alignmentVertical, alpha, animators, background, border, columnSpan, disappearActions, extensions, focus, expression19, expression20, expression21, expression22, expression23, expression25, functions, height, expression26, expression28, id, layoutProvider, expression29, expression30, (i & 33554432) != 0 ? divSelect.getMargins() : divEdgeInsets, (i & 67108864) != 0 ? divSelect.options : list6, (i & 134217728) != 0 ? divSelect.getPaddings() : divEdgeInsets2, (i & 268435456) != 0 ? divSelect.getReuseId() : expression15, (i & 536870912) != 0 ? divSelect.getRowSpan() : expression16, (i & 1073741824) != 0 ? divSelect.getSelectedActions() : list7, (i & Integer.MIN_VALUE) != 0 ? divSelect.textColor : expression17, (i2 & 1) != 0 ? divSelect.getTooltips() : list8, (i2 & 2) != 0 ? divSelect.getTransform() : divTransform, (i2 & 4) != 0 ? divSelect.getTransitionChange() : divChangeTransition, (i2 & 8) != 0 ? divSelect.getTransitionIn() : divAppearanceTransition, (i2 & 16) != 0 ? divSelect.getTransitionOut() : divAppearanceTransition2, (i2 & 32) != 0 ? divSelect.getTransitionTriggers() : list9, (i2 & 64) != 0 ? divSelect.valueVariable : str2, (i2 & 128) != 0 ? divSelect.getVariableTriggers() : list10, (i2 & 256) != 0 ? divSelect.getVariables() : list11, (i2 & 512) != 0 ? divSelect.getVisibility() : expression18, (i2 & 1024) != 0 ? divSelect.getVisibilityAction() : divVisibilityAction, (i2 & 2048) != 0 ? divSelect.getVisibilityActions() : list12, (i2 & 4096) != 0 ? divSelect.getWidth() : divSize2);
    }

    public final DivSelect copy(DivAccessibility divAccessibility, Expression expression, Expression expression2, Expression expression3, List list, List list2, DivBorder divBorder, Expression expression4, List list3, List list4, DivFocus divFocus, Expression expression5, Expression expression6, Expression expression7, Expression expression8, Expression expression9, Expression expression10, List list5, DivSize divSize, Expression expression11, Expression expression12, String str, DivLayoutProvider divLayoutProvider, Expression expression13, Expression expression14, DivEdgeInsets divEdgeInsets, List list6, DivEdgeInsets divEdgeInsets2, Expression expression15, Expression expression16, List list7, Expression expression17, List list8, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list9, String str2, List list10, List list11, Expression expression18, DivVisibilityAction divVisibilityAction, List list12, DivSize divSize2) {
        return new DivSelect(divAccessibility, expression, expression2, expression3, list, list2, divBorder, expression4, list3, list4, divFocus, expression5, expression6, expression7, expression8, expression9, expression10, list5, divSize, expression11, expression12, str, divLayoutProvider, expression13, expression14, divEdgeInsets, list6, divEdgeInsets2, expression15, expression16, list7, expression17, list8, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, list9, str2, list10, list11, expression18, divVisibilityAction, list12, divSize2);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivSelectJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivSelectJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivSelect.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivSelect fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivSelectJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivSelectJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.INSTANCE;
        ALPHA_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        FONT_SIZE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 12L, null, 2, null);
        FONT_SIZE_UNIT_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivSizeUnit.SP, null, 2, null);
        HEIGHT_DEFAULT_VALUE = new DivSize.WrapContent(new DivWrapContentSize(null, null, null, 7, null));
        HINT_COLOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 1929379840, null, 2, null);
        LETTER_SPACING_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        TEXT_COLOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, -16777216, null, 2, null);
        VISIBILITY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        WIDTH_DEFAULT_VALUE = new DivSize.MatchParent(new DivMatchParentSize(null, null, null, 7, null == true ? 1 : 0));
        CREATOR = new Function2() { // from class: com.yandex.div2.DivSelect$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivSelect invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivSelect.Companion.fromJson(parsingEnvironment, jSONObject);
            }
        };
    }

    /* compiled from: DivSelect.kt */
    public static final class Option implements JSONSerializable, Hashable {
        private Integer _hash;
        public final Expression text;
        public final Expression value;
        public static final Companion Companion = new Companion(null);
        private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivSelect$Option$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivSelect.Option invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivSelect.Option.Companion.fromJson(parsingEnvironment, jSONObject);
            }
        };

        public Option(Expression expression, Expression expression2) {
            this.text = expression;
            this.value = expression2;
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this._hash;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = Reflection.getOrCreateKotlinClass(Option.class).hashCode();
            Expression expression = this.text;
            int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0) + this.value.hashCode();
            this._hash = Integer.valueOf(hashCode2);
            return hashCode2;
        }

        public final boolean equals(Option option, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            if (option == null) {
                return false;
            }
            Expression expression = this.text;
            String str = expression != null ? (String) expression.evaluate(expressionResolver) : null;
            Expression expression2 = option.text;
            return Intrinsics.areEqual(str, expression2 != null ? (String) expression2.evaluate(expressionResolver2) : null) && Intrinsics.areEqual(this.value.evaluate(expressionResolver), option.value.evaluate(expressionResolver2));
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((DivSelectOptionJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivSelectOptionJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        /* compiled from: DivSelect.kt */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Option fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return ((DivSelectOptionJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivSelectOptionJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
            }
        }
    }
}
