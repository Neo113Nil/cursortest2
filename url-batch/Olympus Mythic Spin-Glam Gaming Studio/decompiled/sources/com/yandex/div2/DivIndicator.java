package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivIndicator;
import com.yandex.div2.DivIndicatorJsonParser;
import com.yandex.div2.DivShape;
import com.yandex.div2.DivSize;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivIndicator.kt */
/* loaded from: classes14.dex */
public final class DivIndicator implements JSONSerializable, Hashable, DivBase {
    private static final Expression ACTIVE_ITEM_COLOR_DEFAULT_VALUE;
    private static final Expression ACTIVE_ITEM_SIZE_DEFAULT_VALUE;
    private static final Expression ALPHA_DEFAULT_VALUE;
    private static final Expression ANIMATION_DEFAULT_VALUE;
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final DivSize.WrapContent HEIGHT_DEFAULT_VALUE;
    private static final Expression INACTIVE_ITEM_COLOR_DEFAULT_VALUE;
    private static final Expression MINIMUM_ITEM_SIZE_DEFAULT_VALUE;
    private static final DivShape.RoundedRectangle SHAPE_DEFAULT_VALUE;
    private static final DivFixedSize SPACE_BETWEEN_CENTERS_DEFAULT_VALUE;
    private static final Expression VISIBILITY_DEFAULT_VALUE;
    private static final DivSize.MatchParent WIDTH_DEFAULT_VALUE;
    private Integer _hash;
    private final DivAccessibility accessibility;
    public final Expression activeItemColor;
    public final Expression activeItemSize;
    public final DivRoundedRectangleShape activeShape;
    private final Expression alignmentHorizontal;
    private final Expression alignmentVertical;
    private final Expression alpha;
    public final Expression animation;
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
    public final Expression inactiveItemColor;
    public final DivRoundedRectangleShape inactiveMinimumShape;
    public final DivRoundedRectangleShape inactiveShape;
    public final DivIndicatorItemPlacement itemsPlacement;
    private final DivLayoutProvider layoutProvider;
    private final DivEdgeInsets margins;
    public final Expression minimumItemSize;
    private final DivEdgeInsets paddings;
    public final String pagerId;
    private final Expression reuseId;
    private final Expression rowSpan;
    private final List selectedActions;
    public final DivShape shape;
    public final DivFixedSize spaceBetweenCenters;
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

    public DivIndicator(DivAccessibility divAccessibility, Expression expression, Expression expression2, DivRoundedRectangleShape divRoundedRectangleShape, Expression expression3, Expression expression4, Expression expression5, Expression expression6, List list, List list2, DivBorder divBorder, Expression expression7, List list3, List list4, DivFocus divFocus, List list5, DivSize divSize, String str, Expression expression8, DivRoundedRectangleShape divRoundedRectangleShape2, DivRoundedRectangleShape divRoundedRectangleShape3, DivIndicatorItemPlacement divIndicatorItemPlacement, DivLayoutProvider divLayoutProvider, DivEdgeInsets divEdgeInsets, Expression expression9, DivEdgeInsets divEdgeInsets2, String str2, Expression expression10, Expression expression11, List list6, DivShape divShape, DivFixedSize divFixedSize, List list7, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list8, List list9, List list10, Expression expression12, DivVisibilityAction divVisibilityAction, List list11, DivSize divSize2) {
        this.accessibility = divAccessibility;
        this.activeItemColor = expression;
        this.activeItemSize = expression2;
        this.activeShape = divRoundedRectangleShape;
        this.alignmentHorizontal = expression3;
        this.alignmentVertical = expression4;
        this.alpha = expression5;
        this.animation = expression6;
        this.animators = list;
        this.background = list2;
        this.border = divBorder;
        this.columnSpan = expression7;
        this.disappearActions = list3;
        this.extensions = list4;
        this.focus = divFocus;
        this.functions = list5;
        this.height = divSize;
        this.id = str;
        this.inactiveItemColor = expression8;
        this.inactiveMinimumShape = divRoundedRectangleShape2;
        this.inactiveShape = divRoundedRectangleShape3;
        this.itemsPlacement = divIndicatorItemPlacement;
        this.layoutProvider = divLayoutProvider;
        this.margins = divEdgeInsets;
        this.minimumItemSize = expression9;
        this.paddings = divEdgeInsets2;
        this.pagerId = str2;
        this.reuseId = expression10;
        this.rowSpan = expression11;
        this.selectedActions = list6;
        this.shape = divShape;
        this.spaceBetweenCenters = divFixedSize;
        this.tooltips = list7;
        this.transform = divTransform;
        this.transitionChange = divChangeTransition;
        this.transitionIn = divAppearanceTransition;
        this.transitionOut = divAppearanceTransition2;
        this.transitionTriggers = list8;
        this.variableTriggers = list9;
        this.variables = list10;
        this.visibility = expression12;
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
        int hashCode = Reflection.getOrCreateKotlinClass(DivIndicator.class).hashCode();
        DivAccessibility accessibility = getAccessibility();
        int i10 = 0;
        int hash = hashCode + (accessibility != null ? accessibility.hash() : 0) + this.activeItemColor.hashCode() + this.activeItemSize.hashCode();
        DivRoundedRectangleShape divRoundedRectangleShape = this.activeShape;
        int hash2 = hash + (divRoundedRectangleShape != null ? divRoundedRectangleShape.hash() : 0);
        Expression alignmentHorizontal = getAlignmentHorizontal();
        int hashCode2 = hash2 + (alignmentHorizontal != null ? alignmentHorizontal.hashCode() : 0);
        Expression alignmentVertical = getAlignmentVertical();
        int hashCode3 = hashCode2 + (alignmentVertical != null ? alignmentVertical.hashCode() : 0) + getAlpha().hashCode() + this.animation.hashCode();
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
        int hash3 = i12 + (border != null ? border.hash() : 0);
        Expression columnSpan = getColumnSpan();
        int hashCode4 = hash3 + (columnSpan != null ? columnSpan.hashCode() : 0);
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
        int hash4 = i14 + (focus != null ? focus.hash() : 0);
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
        int hash5 = hash4 + i5 + getHeight().hash();
        String id = getId();
        int hashCode5 = hash5 + (id != null ? id.hashCode() : 0) + this.inactiveItemColor.hashCode();
        DivRoundedRectangleShape divRoundedRectangleShape2 = this.inactiveMinimumShape;
        int hash6 = hashCode5 + (divRoundedRectangleShape2 != null ? divRoundedRectangleShape2.hash() : 0);
        DivRoundedRectangleShape divRoundedRectangleShape3 = this.inactiveShape;
        int hash7 = hash6 + (divRoundedRectangleShape3 != null ? divRoundedRectangleShape3.hash() : 0);
        DivIndicatorItemPlacement divIndicatorItemPlacement = this.itemsPlacement;
        int hash8 = hash7 + (divIndicatorItemPlacement != null ? divIndicatorItemPlacement.hash() : 0);
        DivLayoutProvider layoutProvider = getLayoutProvider();
        int hash9 = hash8 + (layoutProvider != null ? layoutProvider.hash() : 0);
        DivEdgeInsets margins = getMargins();
        int hash10 = hash9 + (margins != null ? margins.hash() : 0) + this.minimumItemSize.hashCode();
        DivEdgeInsets paddings = getPaddings();
        int hash11 = hash10 + (paddings != null ? paddings.hash() : 0);
        String str = this.pagerId;
        int hashCode6 = hash11 + (str != null ? str.hashCode() : 0);
        Expression reuseId = getReuseId();
        int hashCode7 = hashCode6 + (reuseId != null ? reuseId.hashCode() : 0);
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
        int hash12 = hashCode8 + i6 + this.shape.hash() + this.spaceBetweenCenters.hash();
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
        int i15 = hash12 + i7;
        DivTransform transform = getTransform();
        int hash13 = i15 + (transform != null ? transform.hash() : 0);
        DivChangeTransition transitionChange = getTransitionChange();
        int hash14 = hash13 + (transitionChange != null ? transitionChange.hash() : 0);
        DivAppearanceTransition transitionIn = getTransitionIn();
        int hash15 = hash14 + (transitionIn != null ? transitionIn.hash() : 0);
        DivAppearanceTransition transitionOut = getTransitionOut();
        int hash16 = hash15 + (transitionOut != null ? transitionOut.hash() : 0);
        List transitionTriggers = getTransitionTriggers();
        int hashCode9 = hash16 + (transitionTriggers != null ? transitionTriggers.hashCode() : 0);
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
        int i16 = hashCode9 + i8;
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
        int hashCode10 = i16 + i9 + getVisibility().hashCode();
        DivVisibilityAction visibilityAction = getVisibilityAction();
        int hash17 = hashCode10 + (visibilityAction != null ? visibilityAction.hash() : 0);
        List visibilityActions = getVisibilityActions();
        if (visibilityActions != null) {
            Iterator it10 = visibilityActions.iterator();
            while (it10.hasNext()) {
                i10 += ((DivVisibilityAction) it10.next()).hash();
            }
        }
        int hash18 = hash17 + i10 + getWidth().hash();
        this._hash = Integer.valueOf(hash18);
        return hash18;
    }

    /* JADX WARN: Code restructure failed: missing block: B:364:0x0647, code lost:
    
        if (r9.getVisibilityActions() == null) goto L458;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x05cf, code lost:
    
        if (r9.getVariables() == null) goto L425;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x0583, code lost:
    
        if (r9.getVariableTriggers() == null) goto L402;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x0537, code lost:
    
        if (r9.getTransitionTriggers() == null) goto L379;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x0482, code lost:
    
        if (r9.getTooltips() == null) goto L321;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x0422, code lost:
    
        if (r9.getSelectedActions() == null) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x02a9, code lost:
    
        if (r9.getFunctions() == null) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x0243, code lost:
    
        if (r9.getExtensions() == null) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x01f7, code lost:
    
        if (r9.getDisappearActions() == null) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x016f, code lost:
    
        if (r9.getBackground() == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x0123, code lost:
    
        if (r9.getAnimators() == null) goto L73;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(DivIndicator divIndicator, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
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
        if (divIndicator == null) {
            return false;
        }
        DivAccessibility accessibility = getAccessibility();
        if (!(accessibility != null ? accessibility.equals(divIndicator.getAccessibility(), expressionResolver, expressionResolver2) : divIndicator.getAccessibility() == null) || ((Number) this.activeItemColor.evaluate(expressionResolver)).intValue() != ((Number) divIndicator.activeItemColor.evaluate(expressionResolver2)).intValue()) {
            return false;
        }
        if (!(((Number) this.activeItemSize.evaluate(expressionResolver)).doubleValue() == ((Number) divIndicator.activeItemSize.evaluate(expressionResolver2)).doubleValue())) {
            return false;
        }
        DivRoundedRectangleShape divRoundedRectangleShape = this.activeShape;
        if (!(divRoundedRectangleShape != null ? divRoundedRectangleShape.equals(divIndicator.activeShape, expressionResolver, expressionResolver2) : divIndicator.activeShape == null)) {
            return false;
        }
        Expression alignmentHorizontal = getAlignmentHorizontal();
        DivAlignmentHorizontal divAlignmentHorizontal = alignmentHorizontal != null ? (DivAlignmentHorizontal) alignmentHorizontal.evaluate(expressionResolver) : null;
        Expression alignmentHorizontal2 = divIndicator.getAlignmentHorizontal();
        if (divAlignmentHorizontal != (alignmentHorizontal2 != null ? (DivAlignmentHorizontal) alignmentHorizontal2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression alignmentVertical = getAlignmentVertical();
        DivAlignmentVertical divAlignmentVertical = alignmentVertical != null ? (DivAlignmentVertical) alignmentVertical.evaluate(expressionResolver) : null;
        Expression alignmentVertical2 = divIndicator.getAlignmentVertical();
        if (divAlignmentVertical != (alignmentVertical2 != null ? (DivAlignmentVertical) alignmentVertical2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        if (!(((Number) getAlpha().evaluate(expressionResolver)).doubleValue() == ((Number) divIndicator.getAlpha().evaluate(expressionResolver2)).doubleValue()) || this.animation.evaluate(expressionResolver) != divIndicator.animation.evaluate(expressionResolver2)) {
            return false;
        }
        List animators = getAnimators();
        if (animators != null) {
            List animators2 = divIndicator.getAnimators();
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
            List background2 = divIndicator.getBackground();
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
        if (!(border != null ? border.equals(divIndicator.getBorder(), expressionResolver, expressionResolver2) : divIndicator.getBorder() == null)) {
            return false;
        }
        Expression columnSpan = getColumnSpan();
        Long l = columnSpan != null ? (Long) columnSpan.evaluate(expressionResolver) : null;
        Expression columnSpan2 = divIndicator.getColumnSpan();
        if (!Intrinsics.areEqual(l, columnSpan2 != null ? (Long) columnSpan2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List disappearActions = getDisappearActions();
        if (disappearActions != null) {
            List disappearActions2 = divIndicator.getDisappearActions();
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
            List extensions2 = divIndicator.getExtensions();
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
        if (!(focus != null ? focus.equals(divIndicator.getFocus(), expressionResolver, expressionResolver2) : divIndicator.getFocus() == null)) {
            return false;
        }
        List functions = getFunctions();
        if (functions != null) {
            List functions2 = divIndicator.getFunctions();
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
        if (!z5 || !getHeight().equals(divIndicator.getHeight(), expressionResolver, expressionResolver2) || !Intrinsics.areEqual(getId(), divIndicator.getId()) || ((Number) this.inactiveItemColor.evaluate(expressionResolver)).intValue() != ((Number) divIndicator.inactiveItemColor.evaluate(expressionResolver2)).intValue()) {
            return false;
        }
        DivRoundedRectangleShape divRoundedRectangleShape2 = this.inactiveMinimumShape;
        if (!(divRoundedRectangleShape2 != null ? divRoundedRectangleShape2.equals(divIndicator.inactiveMinimumShape, expressionResolver, expressionResolver2) : divIndicator.inactiveMinimumShape == null)) {
            return false;
        }
        DivRoundedRectangleShape divRoundedRectangleShape3 = this.inactiveShape;
        if (!(divRoundedRectangleShape3 != null ? divRoundedRectangleShape3.equals(divIndicator.inactiveShape, expressionResolver, expressionResolver2) : divIndicator.inactiveShape == null)) {
            return false;
        }
        DivIndicatorItemPlacement divIndicatorItemPlacement = this.itemsPlacement;
        if (!(divIndicatorItemPlacement != null ? divIndicatorItemPlacement.equals(divIndicator.itemsPlacement, expressionResolver, expressionResolver2) : divIndicator.itemsPlacement == null)) {
            return false;
        }
        DivLayoutProvider layoutProvider = getLayoutProvider();
        if (!(layoutProvider != null ? layoutProvider.equals(divIndicator.getLayoutProvider(), expressionResolver, expressionResolver2) : divIndicator.getLayoutProvider() == null)) {
            return false;
        }
        DivEdgeInsets margins = getMargins();
        if (!(margins != null ? margins.equals(divIndicator.getMargins(), expressionResolver, expressionResolver2) : divIndicator.getMargins() == null)) {
            return false;
        }
        if (!(((Number) this.minimumItemSize.evaluate(expressionResolver)).doubleValue() == ((Number) divIndicator.minimumItemSize.evaluate(expressionResolver2)).doubleValue())) {
            return false;
        }
        DivEdgeInsets paddings = getPaddings();
        if (!(paddings != null ? paddings.equals(divIndicator.getPaddings(), expressionResolver, expressionResolver2) : divIndicator.getPaddings() == null) || !Intrinsics.areEqual(this.pagerId, divIndicator.pagerId)) {
            return false;
        }
        Expression reuseId = getReuseId();
        String str = reuseId != null ? (String) reuseId.evaluate(expressionResolver) : null;
        Expression reuseId2 = divIndicator.getReuseId();
        if (!Intrinsics.areEqual(str, reuseId2 != null ? (String) reuseId2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression rowSpan = getRowSpan();
        Long l2 = rowSpan != null ? (Long) rowSpan.evaluate(expressionResolver) : null;
        Expression rowSpan2 = divIndicator.getRowSpan();
        if (!Intrinsics.areEqual(l2, rowSpan2 != null ? (Long) rowSpan2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List selectedActions = getSelectedActions();
        if (selectedActions != null) {
            List selectedActions2 = divIndicator.getSelectedActions();
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
        if (!z6 || !this.shape.equals(divIndicator.shape, expressionResolver, expressionResolver2) || !this.spaceBetweenCenters.equals(divIndicator.spaceBetweenCenters, expressionResolver, expressionResolver2)) {
            return false;
        }
        List tooltips = getTooltips();
        if (tooltips != null) {
            List tooltips2 = divIndicator.getTooltips();
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
        if (!(transform != null ? transform.equals(divIndicator.getTransform(), expressionResolver, expressionResolver2) : divIndicator.getTransform() == null)) {
            return false;
        }
        DivChangeTransition transitionChange = getTransitionChange();
        if (!(transitionChange != null ? transitionChange.equals(divIndicator.getTransitionChange(), expressionResolver, expressionResolver2) : divIndicator.getTransitionChange() == null)) {
            return false;
        }
        DivAppearanceTransition transitionIn = getTransitionIn();
        if (!(transitionIn != null ? transitionIn.equals(divIndicator.getTransitionIn(), expressionResolver, expressionResolver2) : divIndicator.getTransitionIn() == null)) {
            return false;
        }
        DivAppearanceTransition transitionOut = getTransitionOut();
        if (!(transitionOut != null ? transitionOut.equals(divIndicator.getTransitionOut(), expressionResolver, expressionResolver2) : divIndicator.getTransitionOut() == null)) {
            return false;
        }
        List transitionTriggers = getTransitionTriggers();
        if (transitionTriggers != null) {
            List transitionTriggers2 = divIndicator.getTransitionTriggers();
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
            List variableTriggers2 = divIndicator.getVariableTriggers();
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
            List variables2 = divIndicator.getVariables();
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
        if (!z10 || getVisibility().evaluate(expressionResolver) != divIndicator.getVisibility().evaluate(expressionResolver2)) {
            return false;
        }
        DivVisibilityAction visibilityAction = getVisibilityAction();
        if (!(visibilityAction != null ? visibilityAction.equals(divIndicator.getVisibilityAction(), expressionResolver, expressionResolver2) : divIndicator.getVisibilityAction() == null)) {
            return false;
        }
        List visibilityActions = getVisibilityActions();
        if (visibilityActions != null) {
            List visibilityActions2 = divIndicator.getVisibilityActions();
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
        return z11 && getWidth().equals(divIndicator.getWidth(), expressionResolver, expressionResolver2);
    }

    public static /* synthetic */ DivIndicator copy$default(DivIndicator divIndicator, DivAccessibility divAccessibility, Expression expression, Expression expression2, DivRoundedRectangleShape divRoundedRectangleShape, Expression expression3, Expression expression4, Expression expression5, Expression expression6, List list, List list2, DivBorder divBorder, Expression expression7, List list3, List list4, DivFocus divFocus, List list5, DivSize divSize, String str, Expression expression8, DivRoundedRectangleShape divRoundedRectangleShape2, DivRoundedRectangleShape divRoundedRectangleShape3, DivIndicatorItemPlacement divIndicatorItemPlacement, DivLayoutProvider divLayoutProvider, DivEdgeInsets divEdgeInsets, Expression expression9, DivEdgeInsets divEdgeInsets2, String str2, Expression expression10, Expression expression11, List list6, DivShape divShape, DivFixedSize divFixedSize, List list7, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list8, List list9, List list10, Expression expression12, DivVisibilityAction divVisibilityAction, List list11, DivSize divSize2, int i, int i2, Object obj) {
        DivAccessibility accessibility = (i & 1) != 0 ? divIndicator.getAccessibility() : divAccessibility;
        Expression expression13 = (i & 2) != 0 ? divIndicator.activeItemColor : expression;
        Expression expression14 = (i & 4) != 0 ? divIndicator.activeItemSize : expression2;
        DivRoundedRectangleShape divRoundedRectangleShape4 = (i & 8) != 0 ? divIndicator.activeShape : divRoundedRectangleShape;
        Expression alignmentHorizontal = (i & 16) != 0 ? divIndicator.getAlignmentHorizontal() : expression3;
        Expression alignmentVertical = (i & 32) != 0 ? divIndicator.getAlignmentVertical() : expression4;
        Expression alpha = (i & 64) != 0 ? divIndicator.getAlpha() : expression5;
        Expression expression15 = (i & 128) != 0 ? divIndicator.animation : expression6;
        List animators = (i & 256) != 0 ? divIndicator.getAnimators() : list;
        List background = (i & 512) != 0 ? divIndicator.getBackground() : list2;
        DivBorder border = (i & 1024) != 0 ? divIndicator.getBorder() : divBorder;
        Expression columnSpan = (i & 2048) != 0 ? divIndicator.getColumnSpan() : expression7;
        List disappearActions = (i & 4096) != 0 ? divIndicator.getDisappearActions() : list3;
        List extensions = (i & 8192) != 0 ? divIndicator.getExtensions() : list4;
        DivFocus focus = (i & 16384) != 0 ? divIndicator.getFocus() : divFocus;
        List functions = (i & 32768) != 0 ? divIndicator.getFunctions() : list5;
        DivSize height = (i & 65536) != 0 ? divIndicator.getHeight() : divSize;
        String id = (i & 131072) != 0 ? divIndicator.getId() : str;
        DivFocus divFocus2 = focus;
        Expression expression16 = (i & 262144) != 0 ? divIndicator.inactiveItemColor : expression8;
        DivRoundedRectangleShape divRoundedRectangleShape5 = (i & 524288) != 0 ? divIndicator.inactiveMinimumShape : divRoundedRectangleShape2;
        DivRoundedRectangleShape divRoundedRectangleShape6 = (i & 1048576) != 0 ? divIndicator.inactiveShape : divRoundedRectangleShape3;
        DivIndicatorItemPlacement divIndicatorItemPlacement2 = (i & 2097152) != 0 ? divIndicator.itemsPlacement : divIndicatorItemPlacement;
        DivLayoutProvider layoutProvider = (i & 4194304) != 0 ? divIndicator.getLayoutProvider() : divLayoutProvider;
        DivEdgeInsets margins = (i & 8388608) != 0 ? divIndicator.getMargins() : divEdgeInsets;
        DivIndicatorItemPlacement divIndicatorItemPlacement3 = divIndicatorItemPlacement2;
        Expression expression17 = (i & 16777216) != 0 ? divIndicator.minimumItemSize : expression9;
        return divIndicator.copy(accessibility, expression13, expression14, divRoundedRectangleShape4, alignmentHorizontal, alignmentVertical, alpha, expression15, animators, background, border, columnSpan, disappearActions, extensions, divFocus2, functions, height, id, expression16, divRoundedRectangleShape5, divRoundedRectangleShape6, divIndicatorItemPlacement3, layoutProvider, margins, expression17, (i & 33554432) != 0 ? divIndicator.getPaddings() : divEdgeInsets2, (i & 67108864) != 0 ? divIndicator.pagerId : str2, (i & 134217728) != 0 ? divIndicator.getReuseId() : expression10, (i & 268435456) != 0 ? divIndicator.getRowSpan() : expression11, (i & 536870912) != 0 ? divIndicator.getSelectedActions() : list6, (i & 1073741824) != 0 ? divIndicator.shape : divShape, (i & Integer.MIN_VALUE) != 0 ? divIndicator.spaceBetweenCenters : divFixedSize, (i2 & 1) != 0 ? divIndicator.getTooltips() : list7, (i2 & 2) != 0 ? divIndicator.getTransform() : divTransform, (i2 & 4) != 0 ? divIndicator.getTransitionChange() : divChangeTransition, (i2 & 8) != 0 ? divIndicator.getTransitionIn() : divAppearanceTransition, (i2 & 16) != 0 ? divIndicator.getTransitionOut() : divAppearanceTransition2, (i2 & 32) != 0 ? divIndicator.getTransitionTriggers() : list8, (i2 & 64) != 0 ? divIndicator.getVariableTriggers() : list9, (i2 & 128) != 0 ? divIndicator.getVariables() : list10, (i2 & 256) != 0 ? divIndicator.getVisibility() : expression12, (i2 & 512) != 0 ? divIndicator.getVisibilityAction() : divVisibilityAction, (i2 & 1024) != 0 ? divIndicator.getVisibilityActions() : list11, (i2 & 2048) != 0 ? divIndicator.getWidth() : divSize2);
    }

    public final DivIndicator copy(DivAccessibility divAccessibility, Expression expression, Expression expression2, DivRoundedRectangleShape divRoundedRectangleShape, Expression expression3, Expression expression4, Expression expression5, Expression expression6, List list, List list2, DivBorder divBorder, Expression expression7, List list3, List list4, DivFocus divFocus, List list5, DivSize divSize, String str, Expression expression8, DivRoundedRectangleShape divRoundedRectangleShape2, DivRoundedRectangleShape divRoundedRectangleShape3, DivIndicatorItemPlacement divIndicatorItemPlacement, DivLayoutProvider divLayoutProvider, DivEdgeInsets divEdgeInsets, Expression expression9, DivEdgeInsets divEdgeInsets2, String str2, Expression expression10, Expression expression11, List list6, DivShape divShape, DivFixedSize divFixedSize, List list7, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list8, List list9, List list10, Expression expression12, DivVisibilityAction divVisibilityAction, List list11, DivSize divSize2) {
        return new DivIndicator(divAccessibility, expression, expression2, divRoundedRectangleShape, expression3, expression4, expression5, expression6, list, list2, divBorder, expression7, list3, list4, divFocus, list5, divSize, str, expression8, divRoundedRectangleShape2, divRoundedRectangleShape3, divIndicatorItemPlacement, divLayoutProvider, divEdgeInsets, expression9, divEdgeInsets2, str2, expression10, expression11, list6, divShape, divFixedSize, list7, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, list8, list9, list10, expression12, divVisibilityAction, list11, divSize2);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivIndicatorJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivIndicatorJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivIndicator.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivIndicator fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivIndicatorJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivIndicatorJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.INSTANCE;
        ACTIVE_ITEM_COLOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 16768096, null, 2, null);
        ACTIVE_ITEM_SIZE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Double.valueOf(1.3d), null, 2, null);
        ALPHA_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        ANIMATION_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Animation.SCALE, null, 2, null);
        HEIGHT_DEFAULT_VALUE = new DivSize.WrapContent(new DivWrapContentSize(null, null, null, 7, null));
        INACTIVE_ITEM_COLOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 865180853, null, 2, null);
        MINIMUM_ITEM_SIZE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Double.valueOf(0.5d), null, 2, null);
        Object[] objArr = null == true ? 1 : 0;
        SHAPE_DEFAULT_VALUE = new DivShape.RoundedRectangle(new DivRoundedRectangleShape(null, null == true ? 1 : 0, null == true ? 1 : 0, null, objArr, 31, null));
        SPACE_BETWEEN_CENTERS_DEFAULT_VALUE = new DivFixedSize(null == true ? 1 : 0, Expression.Companion.constant$default(companion, 15L, null, 2, null), 1, null == true ? 1 : 0);
        VISIBILITY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        WIDTH_DEFAULT_VALUE = new DivSize.MatchParent(new DivMatchParentSize(null, null, null, 7, null == true ? 1 : 0));
        CREATOR = new Function2() { // from class: com.yandex.div2.DivIndicator$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivIndicator invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivIndicator.Companion.fromJson(parsingEnvironment, jSONObject);
            }
        };
    }

    /* compiled from: DivIndicator.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/yandex/div2/DivIndicator$Animation;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "SCALE", "WORM", "SLIDER", "Converter", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Animation {
        SCALE("scale"),
        WORM("worm"),
        SLIDER("slider");


        @NotNull
        private final String value;

        /* renamed from: Converter, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        public static final Function1 TO_STRING = new Function1() { // from class: com.yandex.div2.DivIndicator$Animation$Converter$TO_STRING$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final String invoke(@NotNull DivIndicator.Animation animation) {
                return DivIndicator.Animation.INSTANCE.toString(animation);
            }
        };

        @NotNull
        public static final Function1 FROM_STRING = new Function1() { // from class: com.yandex.div2.DivIndicator$Animation$Converter$FROM_STRING$1
            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final DivIndicator.Animation invoke(@NotNull String str) {
                return DivIndicator.Animation.INSTANCE.fromString(str);
            }
        };

        Animation(String str) {
            this.value = str;
        }

        /* compiled from: DivIndicator.kt */
        /* renamed from: com.yandex.div2.DivIndicator$Animation$Converter, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final String toString(Animation animation) {
                return animation.value;
            }

            public final Animation fromString(String str) {
                Animation animation = Animation.SCALE;
                if (Intrinsics.areEqual(str, animation.value)) {
                    return animation;
                }
                Animation animation2 = Animation.WORM;
                if (Intrinsics.areEqual(str, animation2.value)) {
                    return animation2;
                }
                Animation animation3 = Animation.SLIDER;
                if (Intrinsics.areEqual(str, animation3.value)) {
                    return animation3;
                }
                return null;
            }
        }
    }
}
