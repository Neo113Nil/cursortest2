package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivCustomJsonParser;
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

/* compiled from: DivCustom.kt */
/* loaded from: classes14.dex */
public final class DivCustom implements JSONSerializable, Hashable, DivBase {
    private static final Expression ALPHA_DEFAULT_VALUE;
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final DivSize.WrapContent HEIGHT_DEFAULT_VALUE;
    private static final Expression VISIBILITY_DEFAULT_VALUE;
    private static final DivSize.MatchParent WIDTH_DEFAULT_VALUE;
    private Integer _hash;
    private Integer _propertiesHash;
    private final DivAccessibility accessibility;
    private final Expression alignmentHorizontal;
    private final Expression alignmentVertical;
    private final Expression alpha;
    private final List animators;
    private final List background;
    private final DivBorder border;
    private final Expression columnSpan;
    public final JSONObject customProps;
    public final String customType;
    private final List disappearActions;
    private final List extensions;
    private final DivFocus focus;
    private final List functions;
    private final DivSize height;
    private final String id;
    public final List items;
    private final DivLayoutProvider layoutProvider;
    private final DivEdgeInsets margins;
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

    public DivCustom(DivAccessibility divAccessibility, Expression expression, Expression expression2, Expression expression3, List list, List list2, DivBorder divBorder, Expression expression4, JSONObject jSONObject, String str, List list3, List list4, DivFocus divFocus, List list5, DivSize divSize, String str2, List list6, DivLayoutProvider divLayoutProvider, DivEdgeInsets divEdgeInsets, DivEdgeInsets divEdgeInsets2, Expression expression5, Expression expression6, List list7, List list8, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list9, List list10, List list11, Expression expression7, DivVisibilityAction divVisibilityAction, List list12, DivSize divSize2) {
        this.accessibility = divAccessibility;
        this.alignmentHorizontal = expression;
        this.alignmentVertical = expression2;
        this.alpha = expression3;
        this.animators = list;
        this.background = list2;
        this.border = divBorder;
        this.columnSpan = expression4;
        this.customProps = jSONObject;
        this.customType = str;
        this.disappearActions = list3;
        this.extensions = list4;
        this.focus = divFocus;
        this.functions = list5;
        this.height = divSize;
        this.id = str2;
        this.items = list6;
        this.layoutProvider = divLayoutProvider;
        this.margins = divEdgeInsets;
        this.paddings = divEdgeInsets2;
        this.reuseId = expression5;
        this.rowSpan = expression6;
        this.selectedActions = list7;
        this.tooltips = list8;
        this.transform = divTransform;
        this.transitionChange = divChangeTransition;
        this.transitionIn = divAppearanceTransition;
        this.transitionOut = divAppearanceTransition2;
        this.transitionTriggers = list9;
        this.variableTriggers = list10;
        this.variables = list11;
        this.visibility = expression7;
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
    public int propertiesHash() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Integer num = this._propertiesHash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivCustom.class).hashCode();
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
        JSONObject jSONObject = this.customProps;
        int hashCode5 = hashCode4 + (jSONObject != null ? jSONObject.hashCode() : 0) + this.customType.hashCode();
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
        int i13 = hashCode5 + i3;
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
        int hashCode6 = hash4 + (id != null ? id.hashCode() : 0);
        DivLayoutProvider layoutProvider = getLayoutProvider();
        int hash5 = hashCode6 + (layoutProvider != null ? layoutProvider.hash() : 0);
        DivEdgeInsets margins = getMargins();
        int hash6 = hash5 + (margins != null ? margins.hash() : 0);
        DivEdgeInsets paddings = getPaddings();
        int hash7 = hash6 + (paddings != null ? paddings.hash() : 0);
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
        this._propertiesHash = Integer.valueOf(hash13);
        return hash13;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int propertiesHash = propertiesHash();
        List list = this.items;
        int i = 0;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                i += ((Div) it.next()).hash();
            }
        }
        int i2 = propertiesHash + i;
        this._hash = Integer.valueOf(i2);
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:352:0x05af, code lost:
    
        if (r9.getVisibilityActions() == null) goto L431;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x0537, code lost:
    
        if (r9.getVariables() == null) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x04eb, code lost:
    
        if (r9.getVariableTriggers() == null) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x049f, code lost:
    
        if (r9.getTransitionTriggers() == null) goto L352;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x03ea, code lost:
    
        if (r9.getTooltips() == null) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x039e, code lost:
    
        if (r9.getSelectedActions() == null) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x02c2, code lost:
    
        if (r9.items == null) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x0260, code lost:
    
        if (r9.getFunctions() == null) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x01fa, code lost:
    
        if (r9.getExtensions() == null) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x01ae, code lost:
    
        if (r9.getDisappearActions() == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x0112, code lost:
    
        if (r9.getBackground() == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x00c6, code lost:
    
        if (r9.getAnimators() == null) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(DivCustom divCustom, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
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
        if (divCustom == null) {
            return false;
        }
        DivAccessibility accessibility = getAccessibility();
        if (!(accessibility != null ? accessibility.equals(divCustom.getAccessibility(), expressionResolver, expressionResolver2) : divCustom.getAccessibility() == null)) {
            return false;
        }
        Expression alignmentHorizontal = getAlignmentHorizontal();
        DivAlignmentHorizontal divAlignmentHorizontal = alignmentHorizontal != null ? (DivAlignmentHorizontal) alignmentHorizontal.evaluate(expressionResolver) : null;
        Expression alignmentHorizontal2 = divCustom.getAlignmentHorizontal();
        if (divAlignmentHorizontal != (alignmentHorizontal2 != null ? (DivAlignmentHorizontal) alignmentHorizontal2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression alignmentVertical = getAlignmentVertical();
        DivAlignmentVertical divAlignmentVertical = alignmentVertical != null ? (DivAlignmentVertical) alignmentVertical.evaluate(expressionResolver) : null;
        Expression alignmentVertical2 = divCustom.getAlignmentVertical();
        if (divAlignmentVertical != (alignmentVertical2 != null ? (DivAlignmentVertical) alignmentVertical2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        if (!(((Number) getAlpha().evaluate(expressionResolver)).doubleValue() == ((Number) divCustom.getAlpha().evaluate(expressionResolver2)).doubleValue())) {
            return false;
        }
        List animators = getAnimators();
        if (animators != null) {
            List animators2 = divCustom.getAnimators();
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
            List background2 = divCustom.getBackground();
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
        if (!(border != null ? border.equals(divCustom.getBorder(), expressionResolver, expressionResolver2) : divCustom.getBorder() == null)) {
            return false;
        }
        Expression columnSpan = getColumnSpan();
        Long l = columnSpan != null ? (Long) columnSpan.evaluate(expressionResolver) : null;
        Expression columnSpan2 = divCustom.getColumnSpan();
        if (!Intrinsics.areEqual(l, columnSpan2 != null ? (Long) columnSpan2.evaluate(expressionResolver2) : null) || !Intrinsics.areEqual(this.customProps, divCustom.customProps) || !Intrinsics.areEqual(this.customType, divCustom.customType)) {
            return false;
        }
        List disappearActions = getDisappearActions();
        if (disappearActions != null) {
            List disappearActions2 = divCustom.getDisappearActions();
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
            List extensions2 = divCustom.getExtensions();
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
        if (!(focus != null ? focus.equals(divCustom.getFocus(), expressionResolver, expressionResolver2) : divCustom.getFocus() == null)) {
            return false;
        }
        List functions = getFunctions();
        if (functions != null) {
            List functions2 = divCustom.getFunctions();
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
        if (!z5 || !getHeight().equals(divCustom.getHeight(), expressionResolver, expressionResolver2) || !Intrinsics.areEqual(getId(), divCustom.getId())) {
            return false;
        }
        List list = this.items;
        if (list != null) {
            List list2 = divCustom.items;
            if (list2 != null) {
                if (list.size() == list2.size()) {
                    int i11 = 0;
                    for (Object obj6 : list) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((Div) obj6).equals((Div) list2.get(i11), expressionResolver, expressionResolver2)) {
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
        DivLayoutProvider layoutProvider = getLayoutProvider();
        if (!(layoutProvider != null ? layoutProvider.equals(divCustom.getLayoutProvider(), expressionResolver, expressionResolver2) : divCustom.getLayoutProvider() == null)) {
            return false;
        }
        DivEdgeInsets margins = getMargins();
        if (!(margins != null ? margins.equals(divCustom.getMargins(), expressionResolver, expressionResolver2) : divCustom.getMargins() == null)) {
            return false;
        }
        DivEdgeInsets paddings = getPaddings();
        if (!(paddings != null ? paddings.equals(divCustom.getPaddings(), expressionResolver, expressionResolver2) : divCustom.getPaddings() == null)) {
            return false;
        }
        Expression reuseId = getReuseId();
        String str = reuseId != null ? (String) reuseId.evaluate(expressionResolver) : null;
        Expression reuseId2 = divCustom.getReuseId();
        if (!Intrinsics.areEqual(str, reuseId2 != null ? (String) reuseId2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression rowSpan = getRowSpan();
        Long l2 = rowSpan != null ? (Long) rowSpan.evaluate(expressionResolver) : null;
        Expression rowSpan2 = divCustom.getRowSpan();
        if (!Intrinsics.areEqual(l2, rowSpan2 != null ? (Long) rowSpan2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List selectedActions = getSelectedActions();
        if (selectedActions != null) {
            List selectedActions2 = divCustom.getSelectedActions();
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
        List tooltips = getTooltips();
        if (tooltips != null) {
            List tooltips2 = divCustom.getTooltips();
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
        if (!(transform != null ? transform.equals(divCustom.getTransform(), expressionResolver, expressionResolver2) : divCustom.getTransform() == null)) {
            return false;
        }
        DivChangeTransition transitionChange = getTransitionChange();
        if (!(transitionChange != null ? transitionChange.equals(divCustom.getTransitionChange(), expressionResolver, expressionResolver2) : divCustom.getTransitionChange() == null)) {
            return false;
        }
        DivAppearanceTransition transitionIn = getTransitionIn();
        if (!(transitionIn != null ? transitionIn.equals(divCustom.getTransitionIn(), expressionResolver, expressionResolver2) : divCustom.getTransitionIn() == null)) {
            return false;
        }
        DivAppearanceTransition transitionOut = getTransitionOut();
        if (!(transitionOut != null ? transitionOut.equals(divCustom.getTransitionOut(), expressionResolver, expressionResolver2) : divCustom.getTransitionOut() == null)) {
            return false;
        }
        List transitionTriggers = getTransitionTriggers();
        if (transitionTriggers != null) {
            List transitionTriggers2 = divCustom.getTransitionTriggers();
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
            List variableTriggers2 = divCustom.getVariableTriggers();
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
            List variables2 = divCustom.getVariables();
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
        if (!z11 || getVisibility().evaluate(expressionResolver) != divCustom.getVisibility().evaluate(expressionResolver2)) {
            return false;
        }
        DivVisibilityAction visibilityAction = getVisibilityAction();
        if (!(visibilityAction != null ? visibilityAction.equals(divCustom.getVisibilityAction(), expressionResolver, expressionResolver2) : divCustom.getVisibilityAction() == null)) {
            return false;
        }
        List visibilityActions = getVisibilityActions();
        if (visibilityActions != null) {
            List visibilityActions2 = divCustom.getVisibilityActions();
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
        return z12 && getWidth().equals(divCustom.getWidth(), expressionResolver, expressionResolver2);
    }

    public final DivCustom copy(DivAccessibility divAccessibility, Expression expression, Expression expression2, Expression expression3, List list, List list2, DivBorder divBorder, Expression expression4, JSONObject jSONObject, String str, List list3, List list4, DivFocus divFocus, List list5, DivSize divSize, String str2, List list6, DivLayoutProvider divLayoutProvider, DivEdgeInsets divEdgeInsets, DivEdgeInsets divEdgeInsets2, Expression expression5, Expression expression6, List list7, List list8, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list9, List list10, List list11, Expression expression7, DivVisibilityAction divVisibilityAction, List list12, DivSize divSize2) {
        return new DivCustom(divAccessibility, expression, expression2, expression3, list, list2, divBorder, expression4, jSONObject, str, list3, list4, divFocus, list5, divSize, str2, list6, divLayoutProvider, divEdgeInsets, divEdgeInsets2, expression5, expression6, list7, list8, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, list9, list10, list11, expression7, divVisibilityAction, list12, divSize2);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivCustomJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivCustomJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivCustom.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivCustom fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivCustomJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivCustomJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.INSTANCE;
        ALPHA_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        HEIGHT_DEFAULT_VALUE = new DivSize.WrapContent(new DivWrapContentSize(null, null, null, 7, null));
        VISIBILITY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        WIDTH_DEFAULT_VALUE = new DivSize.MatchParent(new DivMatchParentSize(null, null, null, 7, 0 == true ? 1 : 0));
        CREATOR = new Function2() { // from class: com.yandex.div2.DivCustom$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivCustom invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivCustom.Companion.fromJson(parsingEnvironment, jSONObject);
            }
        };
    }
}
