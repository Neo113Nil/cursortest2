package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivSwitchJsonParser;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivSwitch.kt */
/* loaded from: classes12.dex */
public final class DivSwitch implements JSONSerializable, Hashable, DivBase {
    private static final Expression ALPHA_DEFAULT_VALUE;
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final DivSize.WrapContent HEIGHT_DEFAULT_VALUE;
    private static final Expression IS_ENABLED_DEFAULT_VALUE;
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
    public final String isOnVariable;
    private final DivLayoutProvider layoutProvider;
    private final DivEdgeInsets margins;
    public final Expression onColor;
    private final DivEdgeInsets paddings;
    private final Expression reuseId;
    private final Expression rowSpan;
    private final List selectedActions;
    private final List tooltips;
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

    public DivSwitch(DivAccessibility divAccessibility, Expression expression, Expression expression2, Expression expression3, List list, List list2, DivBorder divBorder, Expression expression4, List list3, List list4, DivFocus divFocus, List list5, DivSize divSize, String str, Expression expression5, String str2, DivLayoutProvider divLayoutProvider, DivEdgeInsets divEdgeInsets, Expression expression6, DivEdgeInsets divEdgeInsets2, Expression expression7, Expression expression8, List list6, List list7, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list8, List list9, List list10, Expression expression9, DivVisibilityAction divVisibilityAction, List list11, DivSize divSize2) {
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
        this.isOnVariable = str2;
        this.layoutProvider = divLayoutProvider;
        this.margins = divEdgeInsets;
        this.onColor = expression6;
        this.paddings = divEdgeInsets2;
        this.reuseId = expression7;
        this.rowSpan = expression8;
        this.selectedActions = list6;
        this.tooltips = list7;
        this.transform = divTransform;
        this.transitionChange = divChangeTransition;
        this.transitionIn = divAppearanceTransition;
        this.transitionOut = divAppearanceTransition2;
        this.transitionTriggers = list8;
        this.variableTriggers = list9;
        this.variables = list10;
        this.visibility = expression9;
        this.visibilityAction = divVisibilityAction;
        this.visibilityActions = list11;
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
        int hashCode = Reflection.getOrCreateKotlinClass(DivSwitch.class).hashCode();
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
        int hashCode5 = hash4 + (id != null ? id.hashCode() : 0) + this.isEnabled.hashCode() + this.isOnVariable.hashCode();
        DivLayoutProvider layoutProvider = getLayoutProvider();
        int hash5 = hashCode5 + (layoutProvider != null ? layoutProvider.hash() : 0);
        DivEdgeInsets margins = getMargins();
        int hash6 = hash5 + (margins != null ? margins.hash() : 0);
        Expression expression = this.onColor;
        int hashCode6 = hash6 + (expression != null ? expression.hashCode() : 0);
        DivEdgeInsets paddings = getPaddings();
        int hash7 = hashCode6 + (paddings != null ? paddings.hash() : 0);
        Expression reuseId = getReuseId();
        int hashCode7 = hash7 + (reuseId != null ? reuseId.hashCode() : 0);
        Expression rowSpan = getRowSpan();
        int hashCode8 = hashCode7 + (rowSpan != null ? rowSpan.hashCode() : 0);
        List selectedActions = getSelectedActions();
        if (selectedActions != null) {
            Iterator it6 = selectedActions.iterator();
            i6 = 0;
            while (it6.hasNext()) {
                i6 += ((DivAction) it6.next()).hash();
            }
        } else {
            i6 = 0;
        }
        int i15 = hashCode8 + i6;
        List tooltips = getTooltips();
        if (tooltips != null) {
            Iterator it7 = tooltips.iterator();
            i7 = 0;
            while (it7.hasNext()) {
                i7 += ((DivTooltip) it7.next()).hash();
            }
        } else {
            i7 = 0;
        }
        int i16 = i15 + i7;
        DivTransform transform = getTransform();
        int hash8 = i16 + (transform != null ? transform.hash() : 0);
        DivChangeTransition transitionChange = getTransitionChange();
        int hash9 = hash8 + (transitionChange != null ? transitionChange.hash() : 0);
        DivAppearanceTransition transitionIn = getTransitionIn();
        int hash10 = hash9 + (transitionIn != null ? transitionIn.hash() : 0);
        DivAppearanceTransition transitionOut = getTransitionOut();
        int hash11 = hash10 + (transitionOut != null ? transitionOut.hash() : 0);
        List transitionTriggers = getTransitionTriggers();
        int hashCode9 = hash11 + (transitionTriggers != null ? transitionTriggers.hashCode() : 0);
        List variableTriggers = getVariableTriggers();
        if (variableTriggers != null) {
            Iterator it8 = variableTriggers.iterator();
            i8 = 0;
            while (it8.hasNext()) {
                i8 += ((DivTrigger) it8.next()).hash();
            }
        } else {
            i8 = 0;
        }
        int i17 = hashCode9 + i8;
        List variables = getVariables();
        if (variables != null) {
            Iterator it9 = variables.iterator();
            i9 = 0;
            while (it9.hasNext()) {
                i9 += ((DivVariable) it9.next()).hash();
            }
        } else {
            i9 = 0;
        }
        int hashCode10 = i17 + i9 + getVisibility().hashCode();
        DivVisibilityAction visibilityAction = getVisibilityAction();
        int hash12 = hashCode10 + (visibilityAction != null ? visibilityAction.hash() : 0);
        List visibilityActions = getVisibilityActions();
        if (visibilityActions != null) {
            Iterator it10 = visibilityActions.iterator();
            while (it10.hasNext()) {
                i10 += ((DivVisibilityAction) it10.next()).hash();
            }
        }
        int hash13 = hash12 + i10 + getWidth().hash();
        this._hash = Integer.valueOf(hash13);
        return hash13;
    }

    /* JADX WARN: Code restructure failed: missing block: B:340:0x0597, code lost:
    
        if (r9.getVisibilityActions() == null) goto L418;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x051f, code lost:
    
        if (r9.getVariables() == null) goto L385;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x04d3, code lost:
    
        if (r9.getVariableTriggers() == null) goto L362;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0487, code lost:
    
        if (r9.getTransitionTriggers() == null) goto L339;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x03d2, code lost:
    
        if (r9.getTooltips() == null) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x0386, code lost:
    
        if (r9.getSelectedActions() == null) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x024c, code lost:
    
        if (r9.getFunctions() == null) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x01e6, code lost:
    
        if (r9.getExtensions() == null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x019a, code lost:
    
        if (r9.getDisappearActions() == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x0112, code lost:
    
        if (r9.getBackground() == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x00c6, code lost:
    
        if (r9.getAnimators() == null) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(DivSwitch divSwitch, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
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
        if (divSwitch == null) {
            return false;
        }
        DivAccessibility accessibility = getAccessibility();
        if (!(accessibility != null ? accessibility.equals(divSwitch.getAccessibility(), expressionResolver, expressionResolver2) : divSwitch.getAccessibility() == null)) {
            return false;
        }
        Expression alignmentHorizontal = getAlignmentHorizontal();
        DivAlignmentHorizontal divAlignmentHorizontal = alignmentHorizontal != null ? (DivAlignmentHorizontal) alignmentHorizontal.evaluate(expressionResolver) : null;
        Expression alignmentHorizontal2 = divSwitch.getAlignmentHorizontal();
        if (divAlignmentHorizontal != (alignmentHorizontal2 != null ? (DivAlignmentHorizontal) alignmentHorizontal2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression alignmentVertical = getAlignmentVertical();
        DivAlignmentVertical divAlignmentVertical = alignmentVertical != null ? (DivAlignmentVertical) alignmentVertical.evaluate(expressionResolver) : null;
        Expression alignmentVertical2 = divSwitch.getAlignmentVertical();
        if (divAlignmentVertical != (alignmentVertical2 != null ? (DivAlignmentVertical) alignmentVertical2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        if (!(((Number) getAlpha().evaluate(expressionResolver)).doubleValue() == ((Number) divSwitch.getAlpha().evaluate(expressionResolver2)).doubleValue())) {
            return false;
        }
        List animators = getAnimators();
        if (animators != null) {
            List animators2 = divSwitch.getAnimators();
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
            List background2 = divSwitch.getBackground();
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
        if (!(border != null ? border.equals(divSwitch.getBorder(), expressionResolver, expressionResolver2) : divSwitch.getBorder() == null)) {
            return false;
        }
        Expression columnSpan = getColumnSpan();
        Long l = columnSpan != null ? (Long) columnSpan.evaluate(expressionResolver) : null;
        Expression columnSpan2 = divSwitch.getColumnSpan();
        if (!Intrinsics.areEqual(l, columnSpan2 != null ? (Long) columnSpan2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List disappearActions = getDisappearActions();
        if (disappearActions != null) {
            List disappearActions2 = divSwitch.getDisappearActions();
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
            List extensions2 = divSwitch.getExtensions();
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
        if (!(focus != null ? focus.equals(divSwitch.getFocus(), expressionResolver, expressionResolver2) : divSwitch.getFocus() == null)) {
            return false;
        }
        List functions = getFunctions();
        if (functions != null) {
            List functions2 = divSwitch.getFunctions();
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
        if (!z5 || !getHeight().equals(divSwitch.getHeight(), expressionResolver, expressionResolver2) || !Intrinsics.areEqual(getId(), divSwitch.getId()) || ((Boolean) this.isEnabled.evaluate(expressionResolver)).booleanValue() != ((Boolean) divSwitch.isEnabled.evaluate(expressionResolver2)).booleanValue() || !Intrinsics.areEqual(this.isOnVariable, divSwitch.isOnVariable)) {
            return false;
        }
        DivLayoutProvider layoutProvider = getLayoutProvider();
        if (!(layoutProvider != null ? layoutProvider.equals(divSwitch.getLayoutProvider(), expressionResolver, expressionResolver2) : divSwitch.getLayoutProvider() == null)) {
            return false;
        }
        DivEdgeInsets margins = getMargins();
        if (!(margins != null ? margins.equals(divSwitch.getMargins(), expressionResolver, expressionResolver2) : divSwitch.getMargins() == null)) {
            return false;
        }
        Expression expression = this.onColor;
        Integer num = expression != null ? (Integer) expression.evaluate(expressionResolver) : null;
        Expression expression2 = divSwitch.onColor;
        if (!Intrinsics.areEqual(num, expression2 != null ? (Integer) expression2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        DivEdgeInsets paddings = getPaddings();
        if (!(paddings != null ? paddings.equals(divSwitch.getPaddings(), expressionResolver, expressionResolver2) : divSwitch.getPaddings() == null)) {
            return false;
        }
        Expression reuseId = getReuseId();
        String str = reuseId != null ? (String) reuseId.evaluate(expressionResolver) : null;
        Expression reuseId2 = divSwitch.getReuseId();
        if (!Intrinsics.areEqual(str, reuseId2 != null ? (String) reuseId2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression rowSpan = getRowSpan();
        Long l2 = rowSpan != null ? (Long) rowSpan.evaluate(expressionResolver) : null;
        Expression rowSpan2 = divSwitch.getRowSpan();
        if (!Intrinsics.areEqual(l2, rowSpan2 != null ? (Long) rowSpan2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List selectedActions = getSelectedActions();
        if (selectedActions != null) {
            List selectedActions2 = divSwitch.getSelectedActions();
            if (selectedActions2 != null) {
                if (selectedActions.size() == selectedActions2.size()) {
                    int i11 = 0;
                    for (Object obj6 : selectedActions) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivAction) obj6).equals((DivAction) selectedActions2.get(i11), expressionResolver, expressionResolver2)) {
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
        List tooltips = getTooltips();
        if (tooltips != null) {
            List tooltips2 = divSwitch.getTooltips();
            if (tooltips2 != null) {
                if (tooltips.size() == tooltips2.size()) {
                    int i13 = 0;
                    for (Object obj7 : tooltips) {
                        int i14 = i13 + 1;
                        if (i13 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivTooltip) obj7).equals((DivTooltip) tooltips2.get(i13), expressionResolver, expressionResolver2)) {
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
        DivTransform transform = getTransform();
        if (!(transform != null ? transform.equals(divSwitch.getTransform(), expressionResolver, expressionResolver2) : divSwitch.getTransform() == null)) {
            return false;
        }
        DivChangeTransition transitionChange = getTransitionChange();
        if (!(transitionChange != null ? transitionChange.equals(divSwitch.getTransitionChange(), expressionResolver, expressionResolver2) : divSwitch.getTransitionChange() == null)) {
            return false;
        }
        DivAppearanceTransition transitionIn = getTransitionIn();
        if (!(transitionIn != null ? transitionIn.equals(divSwitch.getTransitionIn(), expressionResolver, expressionResolver2) : divSwitch.getTransitionIn() == null)) {
            return false;
        }
        DivAppearanceTransition transitionOut = getTransitionOut();
        if (!(transitionOut != null ? transitionOut.equals(divSwitch.getTransitionOut(), expressionResolver, expressionResolver2) : divSwitch.getTransitionOut() == null)) {
            return false;
        }
        List transitionTriggers = getTransitionTriggers();
        if (transitionTriggers != null) {
            List transitionTriggers2 = divSwitch.getTransitionTriggers();
            if (transitionTriggers2 != null) {
                if (transitionTriggers.size() == transitionTriggers2.size()) {
                    int i15 = 0;
                    for (Object obj8 : transitionTriggers) {
                        int i16 = i15 + 1;
                        if (i15 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivTransitionTrigger) obj8) == ((DivTransitionTrigger) transitionTriggers2.get(i15))) {
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
        List variableTriggers = getVariableTriggers();
        if (variableTriggers != null) {
            List variableTriggers2 = divSwitch.getVariableTriggers();
            if (variableTriggers2 != null) {
                if (variableTriggers.size() == variableTriggers2.size()) {
                    int i17 = 0;
                    for (Object obj9 : variableTriggers) {
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivTrigger) obj9).equals((DivTrigger) variableTriggers2.get(i17), expressionResolver, expressionResolver2)) {
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
        List variables = getVariables();
        if (variables != null) {
            List variables2 = divSwitch.getVariables();
            if (variables2 != null) {
                if (variables.size() == variables2.size()) {
                    int i19 = 0;
                    for (Object obj10 : variables) {
                        int i20 = i19 + 1;
                        if (i19 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivVariable) obj10).equals((DivVariable) variables2.get(i19), expressionResolver, expressionResolver2)) {
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
        if (!z10 || getVisibility().evaluate(expressionResolver) != divSwitch.getVisibility().evaluate(expressionResolver2)) {
            return false;
        }
        DivVisibilityAction visibilityAction = getVisibilityAction();
        if (!(visibilityAction != null ? visibilityAction.equals(divSwitch.getVisibilityAction(), expressionResolver, expressionResolver2) : divSwitch.getVisibilityAction() == null)) {
            return false;
        }
        List visibilityActions = getVisibilityActions();
        if (visibilityActions != null) {
            List visibilityActions2 = divSwitch.getVisibilityActions();
            if (visibilityActions2 != null) {
                if (visibilityActions.size() == visibilityActions2.size()) {
                    int i21 = 0;
                    for (Object obj11 : visibilityActions) {
                        int i22 = i21 + 1;
                        if (i21 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivVisibilityAction) obj11).equals((DivVisibilityAction) visibilityActions2.get(i21), expressionResolver, expressionResolver2)) {
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
        return z11 && getWidth().equals(divSwitch.getWidth(), expressionResolver, expressionResolver2);
    }

    public final DivSwitch copy(DivAccessibility divAccessibility, Expression expression, Expression expression2, Expression expression3, List list, List list2, DivBorder divBorder, Expression expression4, List list3, List list4, DivFocus divFocus, List list5, DivSize divSize, String str, Expression expression5, String str2, DivLayoutProvider divLayoutProvider, DivEdgeInsets divEdgeInsets, Expression expression6, DivEdgeInsets divEdgeInsets2, Expression expression7, Expression expression8, List list6, List list7, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list8, List list9, List list10, Expression expression9, DivVisibilityAction divVisibilityAction, List list11, DivSize divSize2) {
        return new DivSwitch(divAccessibility, expression, expression2, expression3, list, list2, divBorder, expression4, list3, list4, divFocus, list5, divSize, str, expression5, str2, divLayoutProvider, divEdgeInsets, expression6, divEdgeInsets2, expression7, expression8, list6, list7, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, list8, list9, list10, expression9, divVisibilityAction, list11, divSize2);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivSwitchJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivSwitchJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivSwitch.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivSwitch fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivSwitchJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivSwitchJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.INSTANCE;
        ALPHA_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        HEIGHT_DEFAULT_VALUE = new DivSize.WrapContent(new DivWrapContentSize(null, null, null, 7, null));
        IS_ENABLED_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        VISIBILITY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        WIDTH_DEFAULT_VALUE = new DivSize.MatchParent(new DivMatchParentSize(null, null, null, 7, 0 == true ? 1 : 0));
        CREATOR = new Function2() { // from class: com.yandex.div2.DivSwitch$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivSwitch invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivSwitch.Companion.fromJson(parsingEnvironment, jSONObject);
            }
        };
    }
}
