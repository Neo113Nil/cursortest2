package com.yandex.div2;

import com.yandex.div.core.view2.divs.widgets.DivSeparatorView;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivSeparator;
import com.yandex.div2.DivSeparatorDelimiterStyleJsonParser;
import com.yandex.div2.DivSeparatorJsonParser;
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

/* compiled from: DivSeparator.kt */
/* loaded from: classes10.dex */
public final class DivSeparator implements JSONSerializable, Hashable, DivBase {
    private static final DivAnimation ACTION_ANIMATION_DEFAULT_VALUE;
    private static final Expression ALPHA_DEFAULT_VALUE;
    private static final Expression CAPTURE_FOCUS_ON_ACTION_DEFAULT_VALUE;
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final DivSize.WrapContent HEIGHT_DEFAULT_VALUE;
    private static final Expression VISIBILITY_DEFAULT_VALUE;
    private static final DivSize.MatchParent WIDTH_DEFAULT_VALUE;
    private Integer _hash;
    private final DivAccessibility accessibility;
    public final DivAction action;
    public final DivAnimation actionAnimation;
    public final List actions;
    private final Expression alignmentHorizontal;
    private final Expression alignmentVertical;
    private final Expression alpha;
    private final List animators;
    private final List background;
    private final DivBorder border;
    public final Expression captureFocusOnAction;
    private final Expression columnSpan;
    public final DelimiterStyle delimiterStyle;
    private final List disappearActions;
    public final List doubletapActions;
    private final List extensions;
    private final DivFocus focus;
    private final List functions;
    private final DivSize height;
    public final List hoverEndActions;
    public final List hoverStartActions;
    private final String id;
    private final DivLayoutProvider layoutProvider;
    public final List longtapActions;
    private final DivEdgeInsets margins;
    private final DivEdgeInsets paddings;
    public final List pressEndActions;
    public final List pressStartActions;
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

    public DivSeparator(DivAccessibility divAccessibility, DivAction divAction, DivAnimation divAnimation, List list, Expression expression, Expression expression2, Expression expression3, List list2, List list3, DivBorder divBorder, Expression expression4, Expression expression5, DelimiterStyle delimiterStyle, List list4, List list5, List list6, DivFocus divFocus, List list7, DivSize divSize, List list8, List list9, String str, DivLayoutProvider divLayoutProvider, List list10, DivEdgeInsets divEdgeInsets, DivEdgeInsets divEdgeInsets2, List list11, List list12, Expression expression6, Expression expression7, List list13, List list14, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list15, List list16, List list17, Expression expression8, DivVisibilityAction divVisibilityAction, List list18, DivSize divSize2) {
        this.accessibility = divAccessibility;
        this.action = divAction;
        this.actionAnimation = divAnimation;
        this.actions = list;
        this.alignmentHorizontal = expression;
        this.alignmentVertical = expression2;
        this.alpha = expression3;
        this.animators = list2;
        this.background = list3;
        this.border = divBorder;
        this.captureFocusOnAction = expression4;
        this.columnSpan = expression5;
        this.delimiterStyle = delimiterStyle;
        this.disappearActions = list4;
        this.doubletapActions = list5;
        this.extensions = list6;
        this.focus = divFocus;
        this.functions = list7;
        this.height = divSize;
        this.hoverEndActions = list8;
        this.hoverStartActions = list9;
        this.id = str;
        this.layoutProvider = divLayoutProvider;
        this.longtapActions = list10;
        this.margins = divEdgeInsets;
        this.paddings = divEdgeInsets2;
        this.pressEndActions = list11;
        this.pressStartActions = list12;
        this.reuseId = expression6;
        this.rowSpan = expression7;
        this.selectedActions = list13;
        this.tooltips = list14;
        this.transform = divTransform;
        this.transitionChange = divChangeTransition;
        this.transitionIn = divAppearanceTransition;
        this.transitionOut = divAppearanceTransition2;
        this.transitionTriggers = list15;
        this.variableTriggers = list16;
        this.variables = list17;
        this.visibility = expression8;
        this.visibilityAction = divVisibilityAction;
        this.visibilityActions = list18;
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
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivSeparator.class).hashCode();
        DivAccessibility accessibility = getAccessibility();
        int i17 = 0;
        int hash = hashCode + (accessibility != null ? accessibility.hash() : 0);
        DivAction divAction = this.action;
        int hash2 = hash + (divAction != null ? divAction.hash() : 0) + this.actionAnimation.hash();
        List list = this.actions;
        if (list != null) {
            Iterator it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                i += ((DivAction) it.next()).hash();
            }
        } else {
            i = 0;
        }
        int i18 = hash2 + i;
        Expression alignmentHorizontal = getAlignmentHorizontal();
        int hashCode2 = i18 + (alignmentHorizontal != null ? alignmentHorizontal.hashCode() : 0);
        Expression alignmentVertical = getAlignmentVertical();
        int hashCode3 = hashCode2 + (alignmentVertical != null ? alignmentVertical.hashCode() : 0) + getAlpha().hashCode();
        List animators = getAnimators();
        if (animators != null) {
            Iterator it2 = animators.iterator();
            i2 = 0;
            while (it2.hasNext()) {
                i2 += ((DivAnimator) it2.next()).hash();
            }
        } else {
            i2 = 0;
        }
        int i19 = hashCode3 + i2;
        List background = getBackground();
        if (background != null) {
            Iterator it3 = background.iterator();
            i3 = 0;
            while (it3.hasNext()) {
                i3 += ((DivBackground) it3.next()).hash();
            }
        } else {
            i3 = 0;
        }
        int i20 = i19 + i3;
        DivBorder border = getBorder();
        int hash3 = i20 + (border != null ? border.hash() : 0) + this.captureFocusOnAction.hashCode();
        Expression columnSpan = getColumnSpan();
        int hashCode4 = hash3 + (columnSpan != null ? columnSpan.hashCode() : 0);
        DelimiterStyle delimiterStyle = this.delimiterStyle;
        int hash4 = hashCode4 + (delimiterStyle != null ? delimiterStyle.hash() : 0);
        List disappearActions = getDisappearActions();
        if (disappearActions != null) {
            Iterator it4 = disappearActions.iterator();
            i4 = 0;
            while (it4.hasNext()) {
                i4 += ((DivDisappearAction) it4.next()).hash();
            }
        } else {
            i4 = 0;
        }
        int i21 = hash4 + i4;
        List list2 = this.doubletapActions;
        if (list2 != null) {
            Iterator it5 = list2.iterator();
            i5 = 0;
            while (it5.hasNext()) {
                i5 += ((DivAction) it5.next()).hash();
            }
        } else {
            i5 = 0;
        }
        int i22 = i21 + i5;
        List extensions = getExtensions();
        if (extensions != null) {
            Iterator it6 = extensions.iterator();
            i6 = 0;
            while (it6.hasNext()) {
                i6 += ((DivExtension) it6.next()).hash();
            }
        } else {
            i6 = 0;
        }
        int i23 = i22 + i6;
        DivFocus focus = getFocus();
        int hash5 = i23 + (focus != null ? focus.hash() : 0);
        List functions = getFunctions();
        if (functions != null) {
            Iterator it7 = functions.iterator();
            i7 = 0;
            while (it7.hasNext()) {
                i7 += ((DivFunction) it7.next()).hash();
            }
        } else {
            i7 = 0;
        }
        int hash6 = hash5 + i7 + getHeight().hash();
        List list3 = this.hoverEndActions;
        if (list3 != null) {
            Iterator it8 = list3.iterator();
            i8 = 0;
            while (it8.hasNext()) {
                i8 += ((DivAction) it8.next()).hash();
            }
        } else {
            i8 = 0;
        }
        int i24 = hash6 + i8;
        List list4 = this.hoverStartActions;
        if (list4 != null) {
            Iterator it9 = list4.iterator();
            i9 = 0;
            while (it9.hasNext()) {
                i9 += ((DivAction) it9.next()).hash();
            }
        } else {
            i9 = 0;
        }
        int i25 = i24 + i9;
        String id = getId();
        int hashCode5 = i25 + (id != null ? id.hashCode() : 0);
        DivLayoutProvider layoutProvider = getLayoutProvider();
        int hash7 = hashCode5 + (layoutProvider != null ? layoutProvider.hash() : 0);
        List list5 = this.longtapActions;
        if (list5 != null) {
            Iterator it10 = list5.iterator();
            i10 = 0;
            while (it10.hasNext()) {
                i10 += ((DivAction) it10.next()).hash();
            }
        } else {
            i10 = 0;
        }
        int i26 = hash7 + i10;
        DivEdgeInsets margins = getMargins();
        int hash8 = i26 + (margins != null ? margins.hash() : 0);
        DivEdgeInsets paddings = getPaddings();
        int hash9 = hash8 + (paddings != null ? paddings.hash() : 0);
        List list6 = this.pressEndActions;
        if (list6 != null) {
            Iterator it11 = list6.iterator();
            i11 = 0;
            while (it11.hasNext()) {
                i11 += ((DivAction) it11.next()).hash();
            }
        } else {
            i11 = 0;
        }
        int i27 = hash9 + i11;
        List list7 = this.pressStartActions;
        if (list7 != null) {
            Iterator it12 = list7.iterator();
            i12 = 0;
            while (it12.hasNext()) {
                i12 += ((DivAction) it12.next()).hash();
            }
        } else {
            i12 = 0;
        }
        int i28 = i27 + i12;
        Expression reuseId = getReuseId();
        int hashCode6 = i28 + (reuseId != null ? reuseId.hashCode() : 0);
        Expression rowSpan = getRowSpan();
        int hashCode7 = hashCode6 + (rowSpan != null ? rowSpan.hashCode() : 0);
        List selectedActions = getSelectedActions();
        if (selectedActions != null) {
            Iterator it13 = selectedActions.iterator();
            i13 = 0;
            while (it13.hasNext()) {
                i13 += ((DivAction) it13.next()).hash();
            }
        } else {
            i13 = 0;
        }
        int i29 = hashCode7 + i13;
        List tooltips = getTooltips();
        if (tooltips != null) {
            Iterator it14 = tooltips.iterator();
            i14 = 0;
            while (it14.hasNext()) {
                i14 += ((DivTooltip) it14.next()).hash();
            }
        } else {
            i14 = 0;
        }
        int i30 = i29 + i14;
        DivTransform transform = getTransform();
        int hash10 = i30 + (transform != null ? transform.hash() : 0);
        DivChangeTransition transitionChange = getTransitionChange();
        int hash11 = hash10 + (transitionChange != null ? transitionChange.hash() : 0);
        DivAppearanceTransition transitionIn = getTransitionIn();
        int hash12 = hash11 + (transitionIn != null ? transitionIn.hash() : 0);
        DivAppearanceTransition transitionOut = getTransitionOut();
        int hash13 = hash12 + (transitionOut != null ? transitionOut.hash() : 0);
        List transitionTriggers = getTransitionTriggers();
        int hashCode8 = hash13 + (transitionTriggers != null ? transitionTriggers.hashCode() : 0);
        List variableTriggers = getVariableTriggers();
        if (variableTriggers != null) {
            Iterator it15 = variableTriggers.iterator();
            i15 = 0;
            while (it15.hasNext()) {
                i15 += ((DivTrigger) it15.next()).hash();
            }
        } else {
            i15 = 0;
        }
        int i31 = hashCode8 + i15;
        List variables = getVariables();
        if (variables != null) {
            Iterator it16 = variables.iterator();
            i16 = 0;
            while (it16.hasNext()) {
                i16 += ((DivVariable) it16.next()).hash();
            }
        } else {
            i16 = 0;
        }
        int hashCode9 = i31 + i16 + getVisibility().hashCode();
        DivVisibilityAction visibilityAction = getVisibilityAction();
        int hash14 = hashCode9 + (visibilityAction != null ? visibilityAction.hash() : 0);
        List visibilityActions = getVisibilityActions();
        if (visibilityActions != null) {
            Iterator it17 = visibilityActions.iterator();
            while (it17.hasNext()) {
                i17 += ((DivVisibilityAction) it17.next()).hash();
            }
        }
        int hash15 = hash14 + i17 + getWidth().hash();
        this._hash = Integer.valueOf(hash15);
        return hash15;
    }

    /* JADX WARN: Code restructure failed: missing block: B:480:0x078b, code lost:
    
        if (r9.getVisibilityActions() == null) goto L585;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x0713, code lost:
    
        if (r9.getVariables() == null) goto L552;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x06c7, code lost:
    
        if (r9.getVariableTriggers() == null) goto L529;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x067b, code lost:
    
        if (r9.getTransitionTriggers() == null) goto L506;
     */
    /* JADX WARN: Code restructure failed: missing block: B:522:0x05c6, code lost:
    
        if (r9.getTooltips() == null) goto L448;
     */
    /* JADX WARN: Code restructure failed: missing block: B:526:0x057a, code lost:
    
        if (r9.getSelectedActions() == null) goto L425;
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x04ec, code lost:
    
        if (r9.pressStartActions == null) goto L383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x04a6, code lost:
    
        if (r9.pressEndActions == null) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:553:0x042c, code lost:
    
        if (r9.longtapActions == null) goto L321;
     */
    /* JADX WARN: Code restructure failed: missing block: B:563:0x03be, code lost:
    
        if (r9.hoverStartActions == null) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:567:0x0378, code lost:
    
        if (r9.hoverEndActions == null) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:572:0x0324, code lost:
    
        if (r9.getFunctions() == null) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:581:0x02be, code lost:
    
        if (r9.getExtensions() == null) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:585:0x0272, code lost:
    
        if (r9.doubletapActions == null) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:589:0x022c, code lost:
    
        if (r9.getDisappearActions() == null) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:607:0x0176, code lost:
    
        if (r9.getBackground() == null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:611:0x012a, code lost:
    
        if (r9.getAnimators() == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:623:0x007c, code lost:
    
        if (r9.actions == null) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(DivSeparator divSeparator, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
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
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        if (divSeparator == null) {
            return false;
        }
        DivAccessibility accessibility = getAccessibility();
        if (!(accessibility != null ? accessibility.equals(divSeparator.getAccessibility(), expressionResolver, expressionResolver2) : divSeparator.getAccessibility() == null)) {
            return false;
        }
        DivAction divAction = this.action;
        if (!(divAction != null ? divAction.equals(divSeparator.action, expressionResolver, expressionResolver2) : divSeparator.action == null) || !this.actionAnimation.equals(divSeparator.actionAnimation, expressionResolver, expressionResolver2)) {
            return false;
        }
        List list = this.actions;
        if (list != null) {
            List list2 = divSeparator.actions;
            if (list2 != null) {
                if (list.size() == list2.size()) {
                    int i = 0;
                    for (Object obj : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivAction) obj).equals((DivAction) list2.get(i), expressionResolver, expressionResolver2)) {
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
        Expression alignmentHorizontal = getAlignmentHorizontal();
        DivAlignmentHorizontal divAlignmentHorizontal = alignmentHorizontal != null ? (DivAlignmentHorizontal) alignmentHorizontal.evaluate(expressionResolver) : null;
        Expression alignmentHorizontal2 = divSeparator.getAlignmentHorizontal();
        if (divAlignmentHorizontal != (alignmentHorizontal2 != null ? (DivAlignmentHorizontal) alignmentHorizontal2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression alignmentVertical = getAlignmentVertical();
        DivAlignmentVertical divAlignmentVertical = alignmentVertical != null ? (DivAlignmentVertical) alignmentVertical.evaluate(expressionResolver) : null;
        Expression alignmentVertical2 = divSeparator.getAlignmentVertical();
        if (divAlignmentVertical != (alignmentVertical2 != null ? (DivAlignmentVertical) alignmentVertical2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        if (!(((Number) getAlpha().evaluate(expressionResolver)).doubleValue() == ((Number) divSeparator.getAlpha().evaluate(expressionResolver2)).doubleValue())) {
            return false;
        }
        List animators = getAnimators();
        if (animators != null) {
            List animators2 = divSeparator.getAnimators();
            if (animators2 != null) {
                if (animators.size() == animators2.size()) {
                    int i3 = 0;
                    for (Object obj2 : animators) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivAnimator) obj2).equals((DivAnimator) animators2.get(i3), expressionResolver, expressionResolver2)) {
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
        List background = getBackground();
        if (background != null) {
            List background2 = divSeparator.getBackground();
            if (background2 != null) {
                if (background.size() == background2.size()) {
                    int i5 = 0;
                    for (Object obj3 : background) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivBackground) obj3).equals((DivBackground) background2.get(i5), expressionResolver, expressionResolver2)) {
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
        DivBorder border = getBorder();
        if (!(border != null ? border.equals(divSeparator.getBorder(), expressionResolver, expressionResolver2) : divSeparator.getBorder() == null) || ((Boolean) this.captureFocusOnAction.evaluate(expressionResolver)).booleanValue() != ((Boolean) divSeparator.captureFocusOnAction.evaluate(expressionResolver2)).booleanValue()) {
            return false;
        }
        Expression columnSpan = getColumnSpan();
        Long l = columnSpan != null ? (Long) columnSpan.evaluate(expressionResolver) : null;
        Expression columnSpan2 = divSeparator.getColumnSpan();
        if (!Intrinsics.areEqual(l, columnSpan2 != null ? (Long) columnSpan2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        DelimiterStyle delimiterStyle = this.delimiterStyle;
        if (!(delimiterStyle != null ? delimiterStyle.equals(divSeparator.delimiterStyle, expressionResolver, expressionResolver2) : divSeparator.delimiterStyle == null)) {
            return false;
        }
        List disappearActions = getDisappearActions();
        if (disappearActions != null) {
            List disappearActions2 = divSeparator.getDisappearActions();
            if (disappearActions2 != null) {
                if (disappearActions.size() == disappearActions2.size()) {
                    int i7 = 0;
                    for (Object obj4 : disappearActions) {
                        int i8 = i7 + 1;
                        if (i7 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivDisappearAction) obj4).equals((DivDisappearAction) disappearActions2.get(i7), expressionResolver, expressionResolver2)) {
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
        List list3 = this.doubletapActions;
        if (list3 != null) {
            List list4 = divSeparator.doubletapActions;
            if (list4 != null) {
                if (list3.size() == list4.size()) {
                    int i9 = 0;
                    for (Object obj5 : list3) {
                        int i10 = i9 + 1;
                        if (i9 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivAction) obj5).equals((DivAction) list4.get(i9), expressionResolver, expressionResolver2)) {
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
        if (!z5) {
            return false;
        }
        List extensions = getExtensions();
        if (extensions != null) {
            List extensions2 = divSeparator.getExtensions();
            if (extensions2 != null) {
                if (extensions.size() == extensions2.size()) {
                    int i11 = 0;
                    for (Object obj6 : extensions) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivExtension) obj6).equals((DivExtension) extensions2.get(i11), expressionResolver, expressionResolver2)) {
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
        DivFocus focus = getFocus();
        if (!(focus != null ? focus.equals(divSeparator.getFocus(), expressionResolver, expressionResolver2) : divSeparator.getFocus() == null)) {
            return false;
        }
        List functions = getFunctions();
        if (functions != null) {
            List functions2 = divSeparator.getFunctions();
            if (functions2 != null) {
                if (functions.size() == functions2.size()) {
                    int i13 = 0;
                    for (Object obj7 : functions) {
                        int i14 = i13 + 1;
                        if (i13 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivFunction) obj7).equals((DivFunction) functions2.get(i13), expressionResolver, expressionResolver2)) {
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
        if (!z7 || !getHeight().equals(divSeparator.getHeight(), expressionResolver, expressionResolver2)) {
            return false;
        }
        List list5 = this.hoverEndActions;
        if (list5 != null) {
            List list6 = divSeparator.hoverEndActions;
            if (list6 != null) {
                if (list5.size() == list6.size()) {
                    int i15 = 0;
                    for (Object obj8 : list5) {
                        int i16 = i15 + 1;
                        if (i15 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivAction) obj8).equals((DivAction) list6.get(i15), expressionResolver, expressionResolver2)) {
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
        List list7 = this.hoverStartActions;
        if (list7 != null) {
            List list8 = divSeparator.hoverStartActions;
            if (list8 != null) {
                if (list7.size() == list8.size()) {
                    int i17 = 0;
                    for (Object obj9 : list7) {
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivAction) obj9).equals((DivAction) list8.get(i17), expressionResolver, expressionResolver2)) {
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
        if (!z9 || !Intrinsics.areEqual(getId(), divSeparator.getId())) {
            return false;
        }
        DivLayoutProvider layoutProvider = getLayoutProvider();
        if (!(layoutProvider != null ? layoutProvider.equals(divSeparator.getLayoutProvider(), expressionResolver, expressionResolver2) : divSeparator.getLayoutProvider() == null)) {
            return false;
        }
        List list9 = this.longtapActions;
        if (list9 != null) {
            List list10 = divSeparator.longtapActions;
            if (list10 != null) {
                if (list9.size() == list10.size()) {
                    int i19 = 0;
                    for (Object obj10 : list9) {
                        int i20 = i19 + 1;
                        if (i19 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivAction) obj10).equals((DivAction) list10.get(i19), expressionResolver, expressionResolver2)) {
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
        DivEdgeInsets margins = getMargins();
        if (!(margins != null ? margins.equals(divSeparator.getMargins(), expressionResolver, expressionResolver2) : divSeparator.getMargins() == null)) {
            return false;
        }
        DivEdgeInsets paddings = getPaddings();
        if (!(paddings != null ? paddings.equals(divSeparator.getPaddings(), expressionResolver, expressionResolver2) : divSeparator.getPaddings() == null)) {
            return false;
        }
        List list11 = this.pressEndActions;
        if (list11 != null) {
            List list12 = divSeparator.pressEndActions;
            if (list12 != null) {
                if (list11.size() == list12.size()) {
                    int i21 = 0;
                    for (Object obj11 : list11) {
                        int i22 = i21 + 1;
                        if (i21 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivAction) obj11).equals((DivAction) list12.get(i21), expressionResolver, expressionResolver2)) {
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
        if (!z11) {
            return false;
        }
        List list13 = this.pressStartActions;
        if (list13 != null) {
            List list14 = divSeparator.pressStartActions;
            if (list14 != null) {
                if (list13.size() == list14.size()) {
                    int i23 = 0;
                    for (Object obj12 : list13) {
                        int i24 = i23 + 1;
                        if (i23 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivAction) obj12).equals((DivAction) list14.get(i23), expressionResolver, expressionResolver2)) {
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
        if (!z12) {
            return false;
        }
        Expression reuseId = getReuseId();
        String str = reuseId != null ? (String) reuseId.evaluate(expressionResolver) : null;
        Expression reuseId2 = divSeparator.getReuseId();
        if (!Intrinsics.areEqual(str, reuseId2 != null ? (String) reuseId2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression rowSpan = getRowSpan();
        Long l2 = rowSpan != null ? (Long) rowSpan.evaluate(expressionResolver) : null;
        Expression rowSpan2 = divSeparator.getRowSpan();
        if (!Intrinsics.areEqual(l2, rowSpan2 != null ? (Long) rowSpan2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List selectedActions = getSelectedActions();
        if (selectedActions != null) {
            List selectedActions2 = divSeparator.getSelectedActions();
            if (selectedActions2 != null) {
                if (selectedActions.size() == selectedActions2.size()) {
                    int i25 = 0;
                    for (Object obj13 : selectedActions) {
                        int i26 = i25 + 1;
                        if (i25 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivAction) obj13).equals((DivAction) selectedActions2.get(i25), expressionResolver, expressionResolver2)) {
                            i25 = i26;
                        }
                    }
                    z13 = true;
                }
                z13 = false;
                break;
            }
            return false;
        }
        if (!z13) {
            return false;
        }
        List tooltips = getTooltips();
        if (tooltips != null) {
            List tooltips2 = divSeparator.getTooltips();
            if (tooltips2 != null) {
                if (tooltips.size() == tooltips2.size()) {
                    int i27 = 0;
                    for (Object obj14 : tooltips) {
                        int i28 = i27 + 1;
                        if (i27 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivTooltip) obj14).equals((DivTooltip) tooltips2.get(i27), expressionResolver, expressionResolver2)) {
                            i27 = i28;
                        }
                    }
                    z14 = true;
                }
                z14 = false;
                break;
            }
            return false;
        }
        if (!z14) {
            return false;
        }
        DivTransform transform = getTransform();
        if (!(transform != null ? transform.equals(divSeparator.getTransform(), expressionResolver, expressionResolver2) : divSeparator.getTransform() == null)) {
            return false;
        }
        DivChangeTransition transitionChange = getTransitionChange();
        if (!(transitionChange != null ? transitionChange.equals(divSeparator.getTransitionChange(), expressionResolver, expressionResolver2) : divSeparator.getTransitionChange() == null)) {
            return false;
        }
        DivAppearanceTransition transitionIn = getTransitionIn();
        if (!(transitionIn != null ? transitionIn.equals(divSeparator.getTransitionIn(), expressionResolver, expressionResolver2) : divSeparator.getTransitionIn() == null)) {
            return false;
        }
        DivAppearanceTransition transitionOut = getTransitionOut();
        if (!(transitionOut != null ? transitionOut.equals(divSeparator.getTransitionOut(), expressionResolver, expressionResolver2) : divSeparator.getTransitionOut() == null)) {
            return false;
        }
        List transitionTriggers = getTransitionTriggers();
        if (transitionTriggers != null) {
            List transitionTriggers2 = divSeparator.getTransitionTriggers();
            if (transitionTriggers2 != null) {
                if (transitionTriggers.size() == transitionTriggers2.size()) {
                    int i29 = 0;
                    for (Object obj15 : transitionTriggers) {
                        int i30 = i29 + 1;
                        if (i29 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivTransitionTrigger) obj15) == ((DivTransitionTrigger) transitionTriggers2.get(i29))) {
                            i29 = i30;
                        }
                    }
                    z15 = true;
                }
                z15 = false;
                break;
            }
            return false;
        }
        if (!z15) {
            return false;
        }
        List variableTriggers = getVariableTriggers();
        if (variableTriggers != null) {
            List variableTriggers2 = divSeparator.getVariableTriggers();
            if (variableTriggers2 != null) {
                if (variableTriggers.size() == variableTriggers2.size()) {
                    int i31 = 0;
                    for (Object obj16 : variableTriggers) {
                        int i32 = i31 + 1;
                        if (i31 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivTrigger) obj16).equals((DivTrigger) variableTriggers2.get(i31), expressionResolver, expressionResolver2)) {
                            i31 = i32;
                        }
                    }
                    z16 = true;
                }
                z16 = false;
                break;
            }
            return false;
        }
        if (!z16) {
            return false;
        }
        List variables = getVariables();
        if (variables != null) {
            List variables2 = divSeparator.getVariables();
            if (variables2 != null) {
                if (variables.size() == variables2.size()) {
                    int i33 = 0;
                    for (Object obj17 : variables) {
                        int i34 = i33 + 1;
                        if (i33 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivVariable) obj17).equals((DivVariable) variables2.get(i33), expressionResolver, expressionResolver2)) {
                            i33 = i34;
                        }
                    }
                    z17 = true;
                }
                z17 = false;
                break;
            }
            return false;
        }
        if (!z17 || getVisibility().evaluate(expressionResolver) != divSeparator.getVisibility().evaluate(expressionResolver2)) {
            return false;
        }
        DivVisibilityAction visibilityAction = getVisibilityAction();
        if (!(visibilityAction != null ? visibilityAction.equals(divSeparator.getVisibilityAction(), expressionResolver, expressionResolver2) : divSeparator.getVisibilityAction() == null)) {
            return false;
        }
        List visibilityActions = getVisibilityActions();
        if (visibilityActions != null) {
            List visibilityActions2 = divSeparator.getVisibilityActions();
            if (visibilityActions2 != null) {
                if (visibilityActions.size() == visibilityActions2.size()) {
                    int i35 = 0;
                    for (Object obj18 : visibilityActions) {
                        int i36 = i35 + 1;
                        if (i35 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivVisibilityAction) obj18).equals((DivVisibilityAction) visibilityActions2.get(i35), expressionResolver, expressionResolver2)) {
                            i35 = i36;
                        }
                    }
                    z18 = true;
                }
                z18 = false;
                break;
            }
            return false;
        }
        return z18 && getWidth().equals(divSeparator.getWidth(), expressionResolver, expressionResolver2);
    }

    public static /* synthetic */ DivSeparator copy$default(DivSeparator divSeparator, DivAccessibility divAccessibility, DivAction divAction, DivAnimation divAnimation, List list, Expression expression, Expression expression2, Expression expression3, List list2, List list3, DivBorder divBorder, Expression expression4, Expression expression5, DelimiterStyle delimiterStyle, List list4, List list5, List list6, DivFocus divFocus, List list7, DivSize divSize, List list8, List list9, String str, DivLayoutProvider divLayoutProvider, List list10, DivEdgeInsets divEdgeInsets, DivEdgeInsets divEdgeInsets2, List list11, List list12, Expression expression6, Expression expression7, List list13, List list14, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list15, List list16, List list17, Expression expression8, DivVisibilityAction divVisibilityAction, List list18, DivSize divSize2, int i, int i2, Object obj) {
        DivAccessibility accessibility = (i & 1) != 0 ? divSeparator.getAccessibility() : divAccessibility;
        DivAction divAction2 = (i & 2) != 0 ? divSeparator.action : divAction;
        DivAnimation divAnimation2 = (i & 4) != 0 ? divSeparator.actionAnimation : divAnimation;
        List list19 = (i & 8) != 0 ? divSeparator.actions : list;
        Expression alignmentHorizontal = (i & 16) != 0 ? divSeparator.getAlignmentHorizontal() : expression;
        Expression alignmentVertical = (i & 32) != 0 ? divSeparator.getAlignmentVertical() : expression2;
        Expression alpha = (i & 64) != 0 ? divSeparator.getAlpha() : expression3;
        List animators = (i & 128) != 0 ? divSeparator.getAnimators() : list2;
        List background = (i & 256) != 0 ? divSeparator.getBackground() : list3;
        DivBorder border = (i & 512) != 0 ? divSeparator.getBorder() : divBorder;
        Expression expression9 = (i & 1024) != 0 ? divSeparator.captureFocusOnAction : expression4;
        Expression columnSpan = (i & 2048) != 0 ? divSeparator.getColumnSpan() : expression5;
        DelimiterStyle delimiterStyle2 = (i & 4096) != 0 ? divSeparator.delimiterStyle : delimiterStyle;
        List disappearActions = (i & 8192) != 0 ? divSeparator.getDisappearActions() : list4;
        List list20 = (i & 16384) != 0 ? divSeparator.doubletapActions : list5;
        List extensions = (i & 32768) != 0 ? divSeparator.getExtensions() : list6;
        DivFocus focus = (i & 65536) != 0 ? divSeparator.getFocus() : divFocus;
        List functions = (i & 131072) != 0 ? divSeparator.getFunctions() : list7;
        DivSize height = (i & 262144) != 0 ? divSeparator.getHeight() : divSize;
        List list21 = list20;
        List list22 = (i & 524288) != 0 ? divSeparator.hoverEndActions : list8;
        List list23 = (i & 1048576) != 0 ? divSeparator.hoverStartActions : list9;
        return divSeparator.copy(accessibility, divAction2, divAnimation2, list19, alignmentHorizontal, alignmentVertical, alpha, animators, background, border, expression9, columnSpan, delimiterStyle2, disappearActions, list21, extensions, focus, functions, height, list22, list23, (i & 2097152) != 0 ? divSeparator.getId() : str, (i & 4194304) != 0 ? divSeparator.getLayoutProvider() : divLayoutProvider, (i & 8388608) != 0 ? divSeparator.longtapActions : list10, (i & 16777216) != 0 ? divSeparator.getMargins() : divEdgeInsets, (i & 33554432) != 0 ? divSeparator.getPaddings() : divEdgeInsets2, (i & 67108864) != 0 ? divSeparator.pressEndActions : list11, (i & 134217728) != 0 ? divSeparator.pressStartActions : list12, (i & 268435456) != 0 ? divSeparator.getReuseId() : expression6, (i & 536870912) != 0 ? divSeparator.getRowSpan() : expression7, (i & 1073741824) != 0 ? divSeparator.getSelectedActions() : list13, (i & Integer.MIN_VALUE) != 0 ? divSeparator.getTooltips() : list14, (i2 & 1) != 0 ? divSeparator.getTransform() : divTransform, (i2 & 2) != 0 ? divSeparator.getTransitionChange() : divChangeTransition, (i2 & 4) != 0 ? divSeparator.getTransitionIn() : divAppearanceTransition, (i2 & 8) != 0 ? divSeparator.getTransitionOut() : divAppearanceTransition2, (i2 & 16) != 0 ? divSeparator.getTransitionTriggers() : list15, (i2 & 32) != 0 ? divSeparator.getVariableTriggers() : list16, (i2 & 64) != 0 ? divSeparator.getVariables() : list17, (i2 & 128) != 0 ? divSeparator.getVisibility() : expression8, (i2 & 256) != 0 ? divSeparator.getVisibilityAction() : divVisibilityAction, (i2 & 512) != 0 ? divSeparator.getVisibilityActions() : list18, (i2 & 1024) != 0 ? divSeparator.getWidth() : divSize2);
    }

    public final DivSeparator copy(DivAccessibility divAccessibility, DivAction divAction, DivAnimation divAnimation, List list, Expression expression, Expression expression2, Expression expression3, List list2, List list3, DivBorder divBorder, Expression expression4, Expression expression5, DelimiterStyle delimiterStyle, List list4, List list5, List list6, DivFocus divFocus, List list7, DivSize divSize, List list8, List list9, String str, DivLayoutProvider divLayoutProvider, List list10, DivEdgeInsets divEdgeInsets, DivEdgeInsets divEdgeInsets2, List list11, List list12, Expression expression6, Expression expression7, List list13, List list14, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list15, List list16, List list17, Expression expression8, DivVisibilityAction divVisibilityAction, List list18, DivSize divSize2) {
        return new DivSeparator(divAccessibility, divAction, divAnimation, list, expression, expression2, expression3, list2, list3, divBorder, expression4, expression5, delimiterStyle, list4, list5, list6, divFocus, list7, divSize, list8, list9, str, divLayoutProvider, list10, divEdgeInsets, divEdgeInsets2, list11, list12, expression6, expression7, list13, list14, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, list15, list16, list17, expression8, divVisibilityAction, list18, divSize2);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivSeparatorJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivSeparatorJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivSeparator.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivSeparator fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivSeparatorJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivSeparatorJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.INSTANCE;
        Expression constant$default = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression constant$default2 = Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null);
        Expression constant$default3 = Expression.Companion.constant$default(companion, DivAnimation.Name.FADE, null, 2, null);
        Double valueOf = Double.valueOf(1.0d);
        ACTION_ANIMATION_DEFAULT_VALUE = new DivAnimation(constant$default, constant$default2, null, null, constant$default3, null, null, Expression.Companion.constant$default(companion, valueOf, null, 2, null), 108, null);
        ALPHA_DEFAULT_VALUE = Expression.Companion.constant$default(companion, valueOf, null, 2, null);
        CAPTURE_FOCUS_ON_ACTION_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        HEIGHT_DEFAULT_VALUE = new DivSize.WrapContent(new DivWrapContentSize(null, null, null == true ? 1 : 0, 7, null));
        VISIBILITY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        WIDTH_DEFAULT_VALUE = new DivSize.MatchParent(new DivMatchParentSize(null, null == true ? 1 : 0, null == true ? 1 : 0, 7, null));
        CREATOR = new Function2() { // from class: com.yandex.div2.DivSeparator$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivSeparator invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivSeparator.Companion.fromJson(parsingEnvironment, jSONObject);
            }
        };
    }

    /* compiled from: DivSeparator.kt */
    public static final class DelimiterStyle implements JSONSerializable, Hashable {
        private static final Expression COLOR_DEFAULT_VALUE;
        private static final Function2 CREATOR;
        public static final Companion Companion = new Companion(null);
        private static final Expression ORIENTATION_DEFAULT_VALUE;
        private Integer _hash;
        public final Expression color;
        public final Expression orientation;

        public DelimiterStyle(Expression expression, Expression expression2) {
            this.color = expression;
            this.orientation = expression2;
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this._hash;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = Reflection.getOrCreateKotlinClass(DelimiterStyle.class).hashCode() + this.color.hashCode() + this.orientation.hashCode();
            this._hash = Integer.valueOf(hashCode);
            return hashCode;
        }

        public final boolean equals(DelimiterStyle delimiterStyle, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            return delimiterStyle != null && ((Number) this.color.evaluate(expressionResolver)).intValue() == ((Number) delimiterStyle.color.evaluate(expressionResolver2)).intValue() && this.orientation.evaluate(expressionResolver) == delimiterStyle.orientation.evaluate(expressionResolver2);
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((DivSeparatorDelimiterStyleJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivSeparatorDelimiterStyleJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        /* compiled from: DivSeparator.kt */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final DelimiterStyle fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return ((DivSeparatorDelimiterStyleJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivSeparatorDelimiterStyleJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
            }
        }

        static {
            Expression.Companion companion = Expression.INSTANCE;
            COLOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Integer.valueOf(DivSeparatorView.DEFAULT_DIVIDER_COLOR), null, 2, null);
            ORIENTATION_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Orientation.HORIZONTAL, null, 2, null);
            CREATOR = new Function2() { // from class: com.yandex.div2.DivSeparator$DelimiterStyle$Companion$CREATOR$1
                @Override // kotlin.jvm.functions.Function2
                @NotNull
                public final DivSeparator.DelimiterStyle invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                    return DivSeparator.DelimiterStyle.Companion.fromJson(parsingEnvironment, jSONObject);
                }
            };
        }

        /* compiled from: DivSeparator.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/yandex/div2/DivSeparator$DelimiterStyle$Orientation;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "VERTICAL", "HORIZONTAL", "Converter", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public enum Orientation {
            VERTICAL("vertical"),
            HORIZONTAL("horizontal");


            @NotNull
            private final String value;

            /* renamed from: Converter, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            @NotNull
            public static final Function1 TO_STRING = new Function1() { // from class: com.yandex.div2.DivSeparator$DelimiterStyle$Orientation$Converter$TO_STRING$1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final String invoke(@NotNull DivSeparator.DelimiterStyle.Orientation orientation) {
                    return DivSeparator.DelimiterStyle.Orientation.INSTANCE.toString(orientation);
                }
            };

            @NotNull
            public static final Function1 FROM_STRING = new Function1() { // from class: com.yandex.div2.DivSeparator$DelimiterStyle$Orientation$Converter$FROM_STRING$1
                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final DivSeparator.DelimiterStyle.Orientation invoke(@NotNull String str) {
                    return DivSeparator.DelimiterStyle.Orientation.INSTANCE.fromString(str);
                }
            };

            Orientation(String str) {
                this.value = str;
            }

            /* compiled from: DivSeparator.kt */
            /* renamed from: com.yandex.div2.DivSeparator$DelimiterStyle$Orientation$Converter, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final String toString(Orientation orientation) {
                    return orientation.value;
                }

                public final Orientation fromString(String str) {
                    Orientation orientation = Orientation.VERTICAL;
                    if (Intrinsics.areEqual(str, orientation.value)) {
                        return orientation;
                    }
                    Orientation orientation2 = Orientation.HORIZONTAL;
                    if (Intrinsics.areEqual(str, orientation2.value)) {
                        return orientation2;
                    }
                    return null;
                }
            }
        }
    }
}
