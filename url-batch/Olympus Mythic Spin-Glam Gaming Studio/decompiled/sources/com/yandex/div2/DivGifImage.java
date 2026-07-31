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
import com.yandex.div2.DivGifImageJsonParser;
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

/* compiled from: DivGifImage.kt */
/* loaded from: classes3.dex */
public final class DivGifImage implements JSONSerializable, Hashable, DivBase {
    private static final DivAnimation ACTION_ANIMATION_DEFAULT_VALUE;
    private static final Expression ALPHA_DEFAULT_VALUE;
    private static final Expression CAPTURE_FOCUS_ON_ACTION_DEFAULT_VALUE;
    private static final Expression CONTENT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE;
    private static final Expression CONTENT_ALIGNMENT_VERTICAL_DEFAULT_VALUE;
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final DivSize.WrapContent HEIGHT_DEFAULT_VALUE;
    private static final Expression PLACEHOLDER_COLOR_DEFAULT_VALUE;
    private static final Expression PRELOAD_REQUIRED_DEFAULT_VALUE;
    private static final Expression SCALE_DEFAULT_VALUE;
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
    public final DivAspect aspect;
    private final List background;
    private final DivBorder border;
    public final Expression captureFocusOnAction;
    private final Expression columnSpan;
    public final Expression contentAlignmentHorizontal;
    public final Expression contentAlignmentVertical;
    private final List disappearActions;
    public final List doubletapActions;
    private final List extensions;
    private final DivFocus focus;
    private final List functions;
    public final Expression gifUrl;
    private final DivSize height;
    public final List hoverEndActions;
    public final List hoverStartActions;
    private final String id;
    private final DivLayoutProvider layoutProvider;
    public final List longtapActions;
    private final DivEdgeInsets margins;
    private final DivEdgeInsets paddings;
    public final Expression placeholderColor;
    public final Expression preloadRequired;
    public final List pressEndActions;
    public final List pressStartActions;
    public final Expression preview;
    private final Expression reuseId;
    private final Expression rowSpan;
    public final Expression scale;
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

    public DivGifImage(DivAccessibility divAccessibility, DivAction divAction, DivAnimation divAnimation, List list, Expression expression, Expression expression2, Expression expression3, List list2, DivAspect divAspect, List list3, DivBorder divBorder, Expression expression4, Expression expression5, Expression expression6, Expression expression7, List list4, List list5, List list6, DivFocus divFocus, List list7, Expression expression8, DivSize divSize, List list8, List list9, String str, DivLayoutProvider divLayoutProvider, List list10, DivEdgeInsets divEdgeInsets, DivEdgeInsets divEdgeInsets2, Expression expression9, Expression expression10, List list11, List list12, Expression expression11, Expression expression12, Expression expression13, Expression expression14, List list13, List list14, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list15, List list16, List list17, Expression expression15, DivVisibilityAction divVisibilityAction, List list18, DivSize divSize2) {
        this.accessibility = divAccessibility;
        this.action = divAction;
        this.actionAnimation = divAnimation;
        this.actions = list;
        this.alignmentHorizontal = expression;
        this.alignmentVertical = expression2;
        this.alpha = expression3;
        this.animators = list2;
        this.aspect = divAspect;
        this.background = list3;
        this.border = divBorder;
        this.captureFocusOnAction = expression4;
        this.columnSpan = expression5;
        this.contentAlignmentHorizontal = expression6;
        this.contentAlignmentVertical = expression7;
        this.disappearActions = list4;
        this.doubletapActions = list5;
        this.extensions = list6;
        this.focus = divFocus;
        this.functions = list7;
        this.gifUrl = expression8;
        this.height = divSize;
        this.hoverEndActions = list8;
        this.hoverStartActions = list9;
        this.id = str;
        this.layoutProvider = divLayoutProvider;
        this.longtapActions = list10;
        this.margins = divEdgeInsets;
        this.paddings = divEdgeInsets2;
        this.placeholderColor = expression9;
        this.preloadRequired = expression10;
        this.pressEndActions = list11;
        this.pressStartActions = list12;
        this.preview = expression11;
        this.reuseId = expression12;
        this.rowSpan = expression13;
        this.scale = expression14;
        this.selectedActions = list13;
        this.tooltips = list14;
        this.transform = divTransform;
        this.transitionChange = divChangeTransition;
        this.transitionIn = divAppearanceTransition;
        this.transitionOut = divAppearanceTransition2;
        this.transitionTriggers = list15;
        this.variableTriggers = list16;
        this.variables = list17;
        this.visibility = expression15;
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
        int hashCode = Reflection.getOrCreateKotlinClass(DivGifImage.class).hashCode();
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
        DivAspect divAspect = this.aspect;
        int hash3 = i19 + (divAspect != null ? divAspect.hash() : 0);
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
        int i20 = hash3 + i3;
        DivBorder border = getBorder();
        int hash4 = i20 + (border != null ? border.hash() : 0) + this.captureFocusOnAction.hashCode();
        Expression columnSpan = getColumnSpan();
        int hashCode4 = hash4 + (columnSpan != null ? columnSpan.hashCode() : 0) + this.contentAlignmentHorizontal.hashCode() + this.contentAlignmentVertical.hashCode();
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
        int i21 = hashCode4 + i4;
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
        int hashCode5 = hash5 + i7 + this.gifUrl.hashCode() + getHeight().hash();
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
        int i24 = hashCode5 + i8;
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
        int hashCode6 = i25 + (id != null ? id.hashCode() : 0);
        DivLayoutProvider layoutProvider = getLayoutProvider();
        int hash6 = hashCode6 + (layoutProvider != null ? layoutProvider.hash() : 0);
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
        int i26 = hash6 + i10;
        DivEdgeInsets margins = getMargins();
        int hash7 = i26 + (margins != null ? margins.hash() : 0);
        DivEdgeInsets paddings = getPaddings();
        int hash8 = hash7 + (paddings != null ? paddings.hash() : 0) + this.placeholderColor.hashCode() + this.preloadRequired.hashCode();
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
        int i27 = hash8 + i11;
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
        Expression expression = this.preview;
        int hashCode7 = i28 + (expression != null ? expression.hashCode() : 0);
        Expression reuseId = getReuseId();
        int hashCode8 = hashCode7 + (reuseId != null ? reuseId.hashCode() : 0);
        Expression rowSpan = getRowSpan();
        int hashCode9 = hashCode8 + (rowSpan != null ? rowSpan.hashCode() : 0) + this.scale.hashCode();
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
        int i29 = hashCode9 + i13;
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
        int hash9 = i30 + (transform != null ? transform.hash() : 0);
        DivChangeTransition transitionChange = getTransitionChange();
        int hash10 = hash9 + (transitionChange != null ? transitionChange.hash() : 0);
        DivAppearanceTransition transitionIn = getTransitionIn();
        int hash11 = hash10 + (transitionIn != null ? transitionIn.hash() : 0);
        DivAppearanceTransition transitionOut = getTransitionOut();
        int hash12 = hash11 + (transitionOut != null ? transitionOut.hash() : 0);
        List transitionTriggers = getTransitionTriggers();
        int hashCode10 = hash12 + (transitionTriggers != null ? transitionTriggers.hashCode() : 0);
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
        int i31 = hashCode10 + i15;
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
        int hashCode11 = i31 + i16 + getVisibility().hashCode();
        DivVisibilityAction visibilityAction = getVisibilityAction();
        int hash13 = hashCode11 + (visibilityAction != null ? visibilityAction.hash() : 0);
        List visibilityActions = getVisibilityActions();
        if (visibilityActions != null) {
            Iterator it17 = visibilityActions.iterator();
            while (it17.hasNext()) {
                i17 += ((DivVisibilityAction) it17.next()).hash();
            }
        }
        int hash14 = hash13 + i17 + getWidth().hash();
        this._hash = Integer.valueOf(hash14);
        return hash14;
    }

    /* JADX WARN: Code restructure failed: missing block: B:500:0x0819, code lost:
    
        if (r9.getVisibilityActions() == null) goto L607;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x07a1, code lost:
    
        if (r9.getVariables() == null) goto L574;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x0755, code lost:
    
        if (r9.getVariableTriggers() == null) goto L551;
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x0709, code lost:
    
        if (r9.getTransitionTriggers() == null) goto L528;
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x0654, code lost:
    
        if (r9.getTooltips() == null) goto L470;
     */
    /* JADX WARN: Code restructure failed: missing block: B:546:0x0608, code lost:
    
        if (r9.getSelectedActions() == null) goto L447;
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x054e, code lost:
    
        if (r9.pressStartActions == null) goto L393;
     */
    /* JADX WARN: Code restructure failed: missing block: B:563:0x0508, code lost:
    
        if (r9.pressEndActions == null) goto L370;
     */
    /* JADX WARN: Code restructure failed: missing block: B:579:0x045a, code lost:
    
        if (r9.longtapActions == null) goto L327;
     */
    /* JADX WARN: Code restructure failed: missing block: B:589:0x03ec, code lost:
    
        if (r9.hoverStartActions == null) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:593:0x03a6, code lost:
    
        if (r9.hoverEndActions == null) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:599:0x0340, code lost:
    
        if (r9.getFunctions() == null) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:608:0x02da, code lost:
    
        if (r9.getExtensions() == null) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:612:0x028e, code lost:
    
        if (r9.doubletapActions == null) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:616:0x0248, code lost:
    
        if (r9.getDisappearActions() == null) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:631:0x018a, code lost:
    
        if (r9.getBackground() == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:640:0x012a, code lost:
    
        if (r9.getAnimators() == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:652:0x007c, code lost:
    
        if (r9.actions == null) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(DivGifImage divGifImage, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
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
        if (divGifImage == null) {
            return false;
        }
        DivAccessibility accessibility = getAccessibility();
        if (!(accessibility != null ? accessibility.equals(divGifImage.getAccessibility(), expressionResolver, expressionResolver2) : divGifImage.getAccessibility() == null)) {
            return false;
        }
        DivAction divAction = this.action;
        if (!(divAction != null ? divAction.equals(divGifImage.action, expressionResolver, expressionResolver2) : divGifImage.action == null) || !this.actionAnimation.equals(divGifImage.actionAnimation, expressionResolver, expressionResolver2)) {
            return false;
        }
        List list = this.actions;
        if (list != null) {
            List list2 = divGifImage.actions;
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
        Expression alignmentHorizontal2 = divGifImage.getAlignmentHorizontal();
        if (divAlignmentHorizontal != (alignmentHorizontal2 != null ? (DivAlignmentHorizontal) alignmentHorizontal2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression alignmentVertical = getAlignmentVertical();
        DivAlignmentVertical divAlignmentVertical = alignmentVertical != null ? (DivAlignmentVertical) alignmentVertical.evaluate(expressionResolver) : null;
        Expression alignmentVertical2 = divGifImage.getAlignmentVertical();
        if (divAlignmentVertical != (alignmentVertical2 != null ? (DivAlignmentVertical) alignmentVertical2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        if (!(((Number) getAlpha().evaluate(expressionResolver)).doubleValue() == ((Number) divGifImage.getAlpha().evaluate(expressionResolver2)).doubleValue())) {
            return false;
        }
        List animators = getAnimators();
        if (animators != null) {
            List animators2 = divGifImage.getAnimators();
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
        DivAspect divAspect = this.aspect;
        if (!(divAspect != null ? divAspect.equals(divGifImage.aspect, expressionResolver, expressionResolver2) : divGifImage.aspect == null)) {
            return false;
        }
        List background = getBackground();
        if (background != null) {
            List background2 = divGifImage.getBackground();
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
        if (!(border != null ? border.equals(divGifImage.getBorder(), expressionResolver, expressionResolver2) : divGifImage.getBorder() == null) || ((Boolean) this.captureFocusOnAction.evaluate(expressionResolver)).booleanValue() != ((Boolean) divGifImage.captureFocusOnAction.evaluate(expressionResolver2)).booleanValue()) {
            return false;
        }
        Expression columnSpan = getColumnSpan();
        Long l = columnSpan != null ? (Long) columnSpan.evaluate(expressionResolver) : null;
        Expression columnSpan2 = divGifImage.getColumnSpan();
        if (!Intrinsics.areEqual(l, columnSpan2 != null ? (Long) columnSpan2.evaluate(expressionResolver2) : null) || this.contentAlignmentHorizontal.evaluate(expressionResolver) != divGifImage.contentAlignmentHorizontal.evaluate(expressionResolver2) || this.contentAlignmentVertical.evaluate(expressionResolver) != divGifImage.contentAlignmentVertical.evaluate(expressionResolver2)) {
            return false;
        }
        List disappearActions = getDisappearActions();
        if (disappearActions != null) {
            List disappearActions2 = divGifImage.getDisappearActions();
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
            List list4 = divGifImage.doubletapActions;
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
            List extensions2 = divGifImage.getExtensions();
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
        if (!(focus != null ? focus.equals(divGifImage.getFocus(), expressionResolver, expressionResolver2) : divGifImage.getFocus() == null)) {
            return false;
        }
        List functions = getFunctions();
        if (functions != null) {
            List functions2 = divGifImage.getFunctions();
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
        if (!z7 || !Intrinsics.areEqual(this.gifUrl.evaluate(expressionResolver), divGifImage.gifUrl.evaluate(expressionResolver2)) || !getHeight().equals(divGifImage.getHeight(), expressionResolver, expressionResolver2)) {
            return false;
        }
        List list5 = this.hoverEndActions;
        if (list5 != null) {
            List list6 = divGifImage.hoverEndActions;
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
            List list8 = divGifImage.hoverStartActions;
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
        if (!z9 || !Intrinsics.areEqual(getId(), divGifImage.getId())) {
            return false;
        }
        DivLayoutProvider layoutProvider = getLayoutProvider();
        if (!(layoutProvider != null ? layoutProvider.equals(divGifImage.getLayoutProvider(), expressionResolver, expressionResolver2) : divGifImage.getLayoutProvider() == null)) {
            return false;
        }
        List list9 = this.longtapActions;
        if (list9 != null) {
            List list10 = divGifImage.longtapActions;
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
        if (!(margins != null ? margins.equals(divGifImage.getMargins(), expressionResolver, expressionResolver2) : divGifImage.getMargins() == null)) {
            return false;
        }
        DivEdgeInsets paddings = getPaddings();
        if (!(paddings != null ? paddings.equals(divGifImage.getPaddings(), expressionResolver, expressionResolver2) : divGifImage.getPaddings() == null) || ((Number) this.placeholderColor.evaluate(expressionResolver)).intValue() != ((Number) divGifImage.placeholderColor.evaluate(expressionResolver2)).intValue() || ((Boolean) this.preloadRequired.evaluate(expressionResolver)).booleanValue() != ((Boolean) divGifImage.preloadRequired.evaluate(expressionResolver2)).booleanValue()) {
            return false;
        }
        List list11 = this.pressEndActions;
        if (list11 != null) {
            List list12 = divGifImage.pressEndActions;
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
            List list14 = divGifImage.pressStartActions;
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
        Expression expression = this.preview;
        String str = expression != null ? (String) expression.evaluate(expressionResolver) : null;
        Expression expression2 = divGifImage.preview;
        if (!Intrinsics.areEqual(str, expression2 != null ? (String) expression2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression reuseId = getReuseId();
        String str2 = reuseId != null ? (String) reuseId.evaluate(expressionResolver) : null;
        Expression reuseId2 = divGifImage.getReuseId();
        if (!Intrinsics.areEqual(str2, reuseId2 != null ? (String) reuseId2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression rowSpan = getRowSpan();
        Long l2 = rowSpan != null ? (Long) rowSpan.evaluate(expressionResolver) : null;
        Expression rowSpan2 = divGifImage.getRowSpan();
        if (!Intrinsics.areEqual(l2, rowSpan2 != null ? (Long) rowSpan2.evaluate(expressionResolver2) : null) || this.scale.evaluate(expressionResolver) != divGifImage.scale.evaluate(expressionResolver2)) {
            return false;
        }
        List selectedActions = getSelectedActions();
        if (selectedActions != null) {
            List selectedActions2 = divGifImage.getSelectedActions();
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
            List tooltips2 = divGifImage.getTooltips();
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
        if (!(transform != null ? transform.equals(divGifImage.getTransform(), expressionResolver, expressionResolver2) : divGifImage.getTransform() == null)) {
            return false;
        }
        DivChangeTransition transitionChange = getTransitionChange();
        if (!(transitionChange != null ? transitionChange.equals(divGifImage.getTransitionChange(), expressionResolver, expressionResolver2) : divGifImage.getTransitionChange() == null)) {
            return false;
        }
        DivAppearanceTransition transitionIn = getTransitionIn();
        if (!(transitionIn != null ? transitionIn.equals(divGifImage.getTransitionIn(), expressionResolver, expressionResolver2) : divGifImage.getTransitionIn() == null)) {
            return false;
        }
        DivAppearanceTransition transitionOut = getTransitionOut();
        if (!(transitionOut != null ? transitionOut.equals(divGifImage.getTransitionOut(), expressionResolver, expressionResolver2) : divGifImage.getTransitionOut() == null)) {
            return false;
        }
        List transitionTriggers = getTransitionTriggers();
        if (transitionTriggers != null) {
            List transitionTriggers2 = divGifImage.getTransitionTriggers();
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
            List variableTriggers2 = divGifImage.getVariableTriggers();
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
            List variables2 = divGifImage.getVariables();
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
        if (!z17 || getVisibility().evaluate(expressionResolver) != divGifImage.getVisibility().evaluate(expressionResolver2)) {
            return false;
        }
        DivVisibilityAction visibilityAction = getVisibilityAction();
        if (!(visibilityAction != null ? visibilityAction.equals(divGifImage.getVisibilityAction(), expressionResolver, expressionResolver2) : divGifImage.getVisibilityAction() == null)) {
            return false;
        }
        List visibilityActions = getVisibilityActions();
        if (visibilityActions != null) {
            List visibilityActions2 = divGifImage.getVisibilityActions();
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
        return z18 && getWidth().equals(divGifImage.getWidth(), expressionResolver, expressionResolver2);
    }

    public static /* synthetic */ DivGifImage copy$default(DivGifImage divGifImage, DivAccessibility divAccessibility, DivAction divAction, DivAnimation divAnimation, List list, Expression expression, Expression expression2, Expression expression3, List list2, DivAspect divAspect, List list3, DivBorder divBorder, Expression expression4, Expression expression5, Expression expression6, Expression expression7, List list4, List list5, List list6, DivFocus divFocus, List list7, Expression expression8, DivSize divSize, List list8, List list9, String str, DivLayoutProvider divLayoutProvider, List list10, DivEdgeInsets divEdgeInsets, DivEdgeInsets divEdgeInsets2, Expression expression9, Expression expression10, List list11, List list12, Expression expression11, Expression expression12, Expression expression13, Expression expression14, List list13, List list14, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list15, List list16, List list17, Expression expression15, DivVisibilityAction divVisibilityAction, List list18, DivSize divSize2, int i, int i2, Object obj) {
        DivAccessibility accessibility = (i & 1) != 0 ? divGifImage.getAccessibility() : divAccessibility;
        DivAction divAction2 = (i & 2) != 0 ? divGifImage.action : divAction;
        DivAnimation divAnimation2 = (i & 4) != 0 ? divGifImage.actionAnimation : divAnimation;
        List list19 = (i & 8) != 0 ? divGifImage.actions : list;
        Expression alignmentHorizontal = (i & 16) != 0 ? divGifImage.getAlignmentHorizontal() : expression;
        Expression alignmentVertical = (i & 32) != 0 ? divGifImage.getAlignmentVertical() : expression2;
        Expression alpha = (i & 64) != 0 ? divGifImage.getAlpha() : expression3;
        List animators = (i & 128) != 0 ? divGifImage.getAnimators() : list2;
        DivAspect divAspect2 = (i & 256) != 0 ? divGifImage.aspect : divAspect;
        List background = (i & 512) != 0 ? divGifImage.getBackground() : list3;
        DivBorder border = (i & 1024) != 0 ? divGifImage.getBorder() : divBorder;
        Expression expression16 = (i & 2048) != 0 ? divGifImage.captureFocusOnAction : expression4;
        Expression columnSpan = (i & 4096) != 0 ? divGifImage.getColumnSpan() : expression5;
        Expression expression17 = (i & 8192) != 0 ? divGifImage.contentAlignmentHorizontal : expression6;
        Expression expression18 = (i & 16384) != 0 ? divGifImage.contentAlignmentVertical : expression7;
        List disappearActions = (i & 32768) != 0 ? divGifImage.getDisappearActions() : list4;
        Expression expression19 = expression18;
        List list20 = (i & 65536) != 0 ? divGifImage.doubletapActions : list5;
        List extensions = (i & 131072) != 0 ? divGifImage.getExtensions() : list6;
        DivFocus focus = (i & 262144) != 0 ? divGifImage.getFocus() : divFocus;
        List functions = (i & 524288) != 0 ? divGifImage.getFunctions() : list7;
        List list21 = list20;
        Expression expression20 = (i & 1048576) != 0 ? divGifImage.gifUrl : expression8;
        DivSize height = (i & 2097152) != 0 ? divGifImage.getHeight() : divSize;
        Expression expression21 = expression20;
        List list22 = (i & 4194304) != 0 ? divGifImage.hoverEndActions : list8;
        List list23 = (i & 8388608) != 0 ? divGifImage.hoverStartActions : list9;
        String id = (i & 16777216) != 0 ? divGifImage.getId() : str;
        DivLayoutProvider layoutProvider = (i & 33554432) != 0 ? divGifImage.getLayoutProvider() : divLayoutProvider;
        List list24 = list23;
        List list25 = (i & 67108864) != 0 ? divGifImage.longtapActions : list10;
        return divGifImage.copy(accessibility, divAction2, divAnimation2, list19, alignmentHorizontal, alignmentVertical, alpha, animators, divAspect2, background, border, expression16, columnSpan, expression17, expression19, disappearActions, list21, extensions, focus, functions, expression21, height, list22, list24, id, layoutProvider, list25, (i & 134217728) != 0 ? divGifImage.getMargins() : divEdgeInsets, (i & 268435456) != 0 ? divGifImage.getPaddings() : divEdgeInsets2, (i & 536870912) != 0 ? divGifImage.placeholderColor : expression9, (i & 1073741824) != 0 ? divGifImage.preloadRequired : expression10, (i & Integer.MIN_VALUE) != 0 ? divGifImage.pressEndActions : list11, (i2 & 1) != 0 ? divGifImage.pressStartActions : list12, (i2 & 2) != 0 ? divGifImage.preview : expression11, (i2 & 4) != 0 ? divGifImage.getReuseId() : expression12, (i2 & 8) != 0 ? divGifImage.getRowSpan() : expression13, (i2 & 16) != 0 ? divGifImage.scale : expression14, (i2 & 32) != 0 ? divGifImage.getSelectedActions() : list13, (i2 & 64) != 0 ? divGifImage.getTooltips() : list14, (i2 & 128) != 0 ? divGifImage.getTransform() : divTransform, (i2 & 256) != 0 ? divGifImage.getTransitionChange() : divChangeTransition, (i2 & 512) != 0 ? divGifImage.getTransitionIn() : divAppearanceTransition, (i2 & 1024) != 0 ? divGifImage.getTransitionOut() : divAppearanceTransition2, (i2 & 2048) != 0 ? divGifImage.getTransitionTriggers() : list15, (i2 & 4096) != 0 ? divGifImage.getVariableTriggers() : list16, (i2 & 8192) != 0 ? divGifImage.getVariables() : list17, (i2 & 16384) != 0 ? divGifImage.getVisibility() : expression15, (i2 & 32768) != 0 ? divGifImage.getVisibilityAction() : divVisibilityAction, (i2 & 65536) != 0 ? divGifImage.getVisibilityActions() : list18, (i2 & 131072) != 0 ? divGifImage.getWidth() : divSize2);
    }

    public final DivGifImage copy(DivAccessibility divAccessibility, DivAction divAction, DivAnimation divAnimation, List list, Expression expression, Expression expression2, Expression expression3, List list2, DivAspect divAspect, List list3, DivBorder divBorder, Expression expression4, Expression expression5, Expression expression6, Expression expression7, List list4, List list5, List list6, DivFocus divFocus, List list7, Expression expression8, DivSize divSize, List list8, List list9, String str, DivLayoutProvider divLayoutProvider, List list10, DivEdgeInsets divEdgeInsets, DivEdgeInsets divEdgeInsets2, Expression expression9, Expression expression10, List list11, List list12, Expression expression11, Expression expression12, Expression expression13, Expression expression14, List list13, List list14, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list15, List list16, List list17, Expression expression15, DivVisibilityAction divVisibilityAction, List list18, DivSize divSize2) {
        return new DivGifImage(divAccessibility, divAction, divAnimation, list, expression, expression2, expression3, list2, divAspect, list3, divBorder, expression4, expression5, expression6, expression7, list4, list5, list6, divFocus, list7, expression8, divSize, list8, list9, str, divLayoutProvider, list10, divEdgeInsets, divEdgeInsets2, expression9, expression10, list11, list12, expression11, expression12, expression13, expression14, list13, list14, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, list15, list16, list17, expression15, divVisibilityAction, list18, divSize2);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivGifImageJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivGifImageJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivGifImage.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivGifImage fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivGifImageJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivGifImageJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
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
        CONTENT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivAlignmentHorizontal.CENTER, null, 2, null);
        CONTENT_ALIGNMENT_VERTICAL_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivAlignmentVertical.CENTER, null, 2, null);
        HEIGHT_DEFAULT_VALUE = new DivSize.WrapContent(new DivWrapContentSize(null, null, null == true ? 1 : 0, 7, null));
        PLACEHOLDER_COLOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Integer.valueOf(DivSeparatorView.DEFAULT_DIVIDER_COLOR), null, 2, null);
        PRELOAD_REQUIRED_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        SCALE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivImageScale.FILL, null, 2, null);
        VISIBILITY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        WIDTH_DEFAULT_VALUE = new DivSize.MatchParent(new DivMatchParentSize(null, null == true ? 1 : 0, null == true ? 1 : 0, 7, null));
        CREATOR = new Function2() { // from class: com.yandex.div2.DivGifImage$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivGifImage invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivGifImage.Companion.fromJson(parsingEnvironment, jSONObject);
            }
        };
    }
}
