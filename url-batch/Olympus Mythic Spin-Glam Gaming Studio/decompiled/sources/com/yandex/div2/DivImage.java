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
import com.yandex.div2.DivImageJsonParser;
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

/* compiled from: DivImage.kt */
/* loaded from: classes15.dex */
public final class DivImage implements JSONSerializable, Hashable, DivBase {
    private static final DivAnimation ACTION_ANIMATION_DEFAULT_VALUE;
    private static final Expression ALPHA_DEFAULT_VALUE;
    private static final Expression CAPTURE_FOCUS_ON_ACTION_DEFAULT_VALUE;
    private static final Expression CONTENT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE;
    private static final Expression CONTENT_ALIGNMENT_VERTICAL_DEFAULT_VALUE;
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final DivSize.WrapContent HEIGHT_DEFAULT_VALUE;
    private static final Expression HIGH_PRIORITY_PREVIEW_SHOW_DEFAULT_VALUE;
    private static final Expression PLACEHOLDER_COLOR_DEFAULT_VALUE;
    private static final Expression PRELOAD_REQUIRED_DEFAULT_VALUE;
    private static final Expression SCALE_DEFAULT_VALUE;
    private static final Expression TINT_MODE_DEFAULT_VALUE;
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
    public final DivFadeTransition appearanceAnimation;
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
    public final List filters;
    private final DivFocus focus;
    private final List functions;
    private final DivSize height;
    public final Expression highPriorityPreviewShow;
    public final List hoverEndActions;
    public final List hoverStartActions;
    private final String id;
    public final Expression imageUrl;
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
    public final Expression tintColor;
    public final Expression tintMode;
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

    public DivImage(DivAccessibility divAccessibility, DivAction divAction, DivAnimation divAnimation, List list, Expression expression, Expression expression2, Expression expression3, List list2, DivFadeTransition divFadeTransition, DivAspect divAspect, List list3, DivBorder divBorder, Expression expression4, Expression expression5, Expression expression6, Expression expression7, List list4, List list5, List list6, List list7, DivFocus divFocus, List list8, DivSize divSize, Expression expression8, List list9, List list10, String str, Expression expression9, DivLayoutProvider divLayoutProvider, List list11, DivEdgeInsets divEdgeInsets, DivEdgeInsets divEdgeInsets2, Expression expression10, Expression expression11, List list12, List list13, Expression expression12, Expression expression13, Expression expression14, Expression expression15, List list14, Expression expression16, Expression expression17, List list15, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list16, List list17, List list18, Expression expression18, DivVisibilityAction divVisibilityAction, List list19, DivSize divSize2) {
        this.accessibility = divAccessibility;
        this.action = divAction;
        this.actionAnimation = divAnimation;
        this.actions = list;
        this.alignmentHorizontal = expression;
        this.alignmentVertical = expression2;
        this.alpha = expression3;
        this.animators = list2;
        this.appearanceAnimation = divFadeTransition;
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
        this.filters = list7;
        this.focus = divFocus;
        this.functions = list8;
        this.height = divSize;
        this.highPriorityPreviewShow = expression8;
        this.hoverEndActions = list9;
        this.hoverStartActions = list10;
        this.id = str;
        this.imageUrl = expression9;
        this.layoutProvider = divLayoutProvider;
        this.longtapActions = list11;
        this.margins = divEdgeInsets;
        this.paddings = divEdgeInsets2;
        this.placeholderColor = expression10;
        this.preloadRequired = expression11;
        this.pressEndActions = list12;
        this.pressStartActions = list13;
        this.preview = expression12;
        this.reuseId = expression13;
        this.rowSpan = expression14;
        this.scale = expression15;
        this.selectedActions = list14;
        this.tintColor = expression16;
        this.tintMode = expression17;
        this.tooltips = list15;
        this.transform = divTransform;
        this.transitionChange = divChangeTransition;
        this.transitionIn = divAppearanceTransition;
        this.transitionOut = divAppearanceTransition2;
        this.transitionTriggers = list16;
        this.variableTriggers = list17;
        this.variables = list18;
        this.visibility = expression18;
        this.visibilityAction = divVisibilityAction;
        this.visibilityActions = list19;
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
        int i17;
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivImage.class).hashCode();
        DivAccessibility accessibility = getAccessibility();
        int i18 = 0;
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
        int i19 = hash2 + i;
        Expression alignmentHorizontal = getAlignmentHorizontal();
        int hashCode2 = i19 + (alignmentHorizontal != null ? alignmentHorizontal.hashCode() : 0);
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
        int i20 = hashCode3 + i2;
        DivFadeTransition divFadeTransition = this.appearanceAnimation;
        int hash3 = i20 + (divFadeTransition != null ? divFadeTransition.hash() : 0);
        DivAspect divAspect = this.aspect;
        int hash4 = hash3 + (divAspect != null ? divAspect.hash() : 0);
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
        int i21 = hash4 + i3;
        DivBorder border = getBorder();
        int hash5 = i21 + (border != null ? border.hash() : 0) + this.captureFocusOnAction.hashCode();
        Expression columnSpan = getColumnSpan();
        int hashCode4 = hash5 + (columnSpan != null ? columnSpan.hashCode() : 0) + this.contentAlignmentHorizontal.hashCode() + this.contentAlignmentVertical.hashCode();
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
        int i22 = hashCode4 + i4;
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
        int i23 = i22 + i5;
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
        int i24 = i23 + i6;
        List list3 = this.filters;
        if (list3 != null) {
            Iterator it7 = list3.iterator();
            i7 = 0;
            while (it7.hasNext()) {
                i7 += ((DivFilter) it7.next()).hash();
            }
        } else {
            i7 = 0;
        }
        int i25 = i24 + i7;
        DivFocus focus = getFocus();
        int hash6 = i25 + (focus != null ? focus.hash() : 0);
        List functions = getFunctions();
        if (functions != null) {
            Iterator it8 = functions.iterator();
            i8 = 0;
            while (it8.hasNext()) {
                i8 += ((DivFunction) it8.next()).hash();
            }
        } else {
            i8 = 0;
        }
        int hash7 = hash6 + i8 + getHeight().hash() + this.highPriorityPreviewShow.hashCode();
        List list4 = this.hoverEndActions;
        if (list4 != null) {
            Iterator it9 = list4.iterator();
            i9 = 0;
            while (it9.hasNext()) {
                i9 += ((DivAction) it9.next()).hash();
            }
        } else {
            i9 = 0;
        }
        int i26 = hash7 + i9;
        List list5 = this.hoverStartActions;
        if (list5 != null) {
            Iterator it10 = list5.iterator();
            i10 = 0;
            while (it10.hasNext()) {
                i10 += ((DivAction) it10.next()).hash();
            }
        } else {
            i10 = 0;
        }
        int i27 = i26 + i10;
        String id = getId();
        int hashCode5 = i27 + (id != null ? id.hashCode() : 0) + this.imageUrl.hashCode();
        DivLayoutProvider layoutProvider = getLayoutProvider();
        int hash8 = hashCode5 + (layoutProvider != null ? layoutProvider.hash() : 0);
        List list6 = this.longtapActions;
        if (list6 != null) {
            Iterator it11 = list6.iterator();
            i11 = 0;
            while (it11.hasNext()) {
                i11 += ((DivAction) it11.next()).hash();
            }
        } else {
            i11 = 0;
        }
        int i28 = hash8 + i11;
        DivEdgeInsets margins = getMargins();
        int hash9 = i28 + (margins != null ? margins.hash() : 0);
        DivEdgeInsets paddings = getPaddings();
        int hash10 = hash9 + (paddings != null ? paddings.hash() : 0) + this.placeholderColor.hashCode() + this.preloadRequired.hashCode();
        List list7 = this.pressEndActions;
        if (list7 != null) {
            Iterator it12 = list7.iterator();
            i12 = 0;
            while (it12.hasNext()) {
                i12 += ((DivAction) it12.next()).hash();
            }
        } else {
            i12 = 0;
        }
        int i29 = hash10 + i12;
        List list8 = this.pressStartActions;
        if (list8 != null) {
            Iterator it13 = list8.iterator();
            i13 = 0;
            while (it13.hasNext()) {
                i13 += ((DivAction) it13.next()).hash();
            }
        } else {
            i13 = 0;
        }
        int i30 = i29 + i13;
        Expression expression = this.preview;
        int hashCode6 = i30 + (expression != null ? expression.hashCode() : 0);
        Expression reuseId = getReuseId();
        int hashCode7 = hashCode6 + (reuseId != null ? reuseId.hashCode() : 0);
        Expression rowSpan = getRowSpan();
        int hashCode8 = hashCode7 + (rowSpan != null ? rowSpan.hashCode() : 0) + this.scale.hashCode();
        List selectedActions = getSelectedActions();
        if (selectedActions != null) {
            Iterator it14 = selectedActions.iterator();
            i14 = 0;
            while (it14.hasNext()) {
                i14 += ((DivAction) it14.next()).hash();
            }
        } else {
            i14 = 0;
        }
        int i31 = hashCode8 + i14;
        Expression expression2 = this.tintColor;
        int hashCode9 = i31 + (expression2 != null ? expression2.hashCode() : 0) + this.tintMode.hashCode();
        List tooltips = getTooltips();
        if (tooltips != null) {
            Iterator it15 = tooltips.iterator();
            i15 = 0;
            while (it15.hasNext()) {
                i15 += ((DivTooltip) it15.next()).hash();
            }
        } else {
            i15 = 0;
        }
        int i32 = hashCode9 + i15;
        DivTransform transform = getTransform();
        int hash11 = i32 + (transform != null ? transform.hash() : 0);
        DivChangeTransition transitionChange = getTransitionChange();
        int hash12 = hash11 + (transitionChange != null ? transitionChange.hash() : 0);
        DivAppearanceTransition transitionIn = getTransitionIn();
        int hash13 = hash12 + (transitionIn != null ? transitionIn.hash() : 0);
        DivAppearanceTransition transitionOut = getTransitionOut();
        int hash14 = hash13 + (transitionOut != null ? transitionOut.hash() : 0);
        List transitionTriggers = getTransitionTriggers();
        int hashCode10 = hash14 + (transitionTriggers != null ? transitionTriggers.hashCode() : 0);
        List variableTriggers = getVariableTriggers();
        if (variableTriggers != null) {
            Iterator it16 = variableTriggers.iterator();
            i16 = 0;
            while (it16.hasNext()) {
                i16 += ((DivTrigger) it16.next()).hash();
            }
        } else {
            i16 = 0;
        }
        int i33 = hashCode10 + i16;
        List variables = getVariables();
        if (variables != null) {
            Iterator it17 = variables.iterator();
            i17 = 0;
            while (it17.hasNext()) {
                i17 += ((DivVariable) it17.next()).hash();
            }
        } else {
            i17 = 0;
        }
        int hashCode11 = i33 + i17 + getVisibility().hashCode();
        DivVisibilityAction visibilityAction = getVisibilityAction();
        int hash15 = hashCode11 + (visibilityAction != null ? visibilityAction.hash() : 0);
        List visibilityActions = getVisibilityActions();
        if (visibilityActions != null) {
            Iterator it18 = visibilityActions.iterator();
            while (it18.hasNext()) {
                i18 += ((DivVisibilityAction) it18.next()).hash();
            }
        }
        int hash16 = hash15 + i18 + getWidth().hash();
        this._hash = Integer.valueOf(hash16);
        return hash16;
    }

    /* JADX WARN: Code restructure failed: missing block: B:536:0x08b9, code lost:
    
        if (r9.getVisibilityActions() == null) goto L652;
     */
    /* JADX WARN: Code restructure failed: missing block: B:546:0x0841, code lost:
    
        if (r9.getVariables() == null) goto L619;
     */
    /* JADX WARN: Code restructure failed: missing block: B:550:0x07f5, code lost:
    
        if (r9.getVariableTriggers() == null) goto L596;
     */
    /* JADX WARN: Code restructure failed: missing block: B:554:0x07a9, code lost:
    
        if (r9.getTransitionTriggers() == null) goto L573;
     */
    /* JADX WARN: Code restructure failed: missing block: B:578:0x06f4, code lost:
    
        if (r9.getTooltips() == null) goto L515;
     */
    /* JADX WARN: Code restructure failed: missing block: B:585:0x067e, code lost:
    
        if (r9.getSelectedActions() == null) goto L481;
     */
    /* JADX WARN: Code restructure failed: missing block: B:599:0x05c2, code lost:
    
        if (r9.pressStartActions == null) goto L426;
     */
    /* JADX WARN: Code restructure failed: missing block: B:603:0x057c, code lost:
    
        if (r9.pressEndActions == null) goto L403;
     */
    /* JADX WARN: Code restructure failed: missing block: B:619:0x04ce, code lost:
    
        if (r9.longtapActions == null) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:630:0x044e, code lost:
    
        if (r9.hoverStartActions == null) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:634:0x0408, code lost:
    
        if (r9.hoverEndActions == null) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:640:0x039a, code lost:
    
        if (r9.getFunctions() == null) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:649:0x0334, code lost:
    
        if (r9.filters == null) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:653:0x02ee, code lost:
    
        if (r9.getExtensions() == null) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:657:0x02a2, code lost:
    
        if (r9.doubletapActions == null) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:661:0x025c, code lost:
    
        if (r9.getDisappearActions() == null) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:676:0x019e, code lost:
    
        if (r9.getBackground() == null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:690:0x012a, code lost:
    
        if (r9.getAnimators() == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:702:0x007c, code lost:
    
        if (r9.actions == null) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(DivImage divImage, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
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
        boolean z19;
        if (divImage == null) {
            return false;
        }
        DivAccessibility accessibility = getAccessibility();
        if (!(accessibility != null ? accessibility.equals(divImage.getAccessibility(), expressionResolver, expressionResolver2) : divImage.getAccessibility() == null)) {
            return false;
        }
        DivAction divAction = this.action;
        if (!(divAction != null ? divAction.equals(divImage.action, expressionResolver, expressionResolver2) : divImage.action == null) || !this.actionAnimation.equals(divImage.actionAnimation, expressionResolver, expressionResolver2)) {
            return false;
        }
        List list = this.actions;
        if (list != null) {
            List list2 = divImage.actions;
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
        Expression alignmentHorizontal2 = divImage.getAlignmentHorizontal();
        if (divAlignmentHorizontal != (alignmentHorizontal2 != null ? (DivAlignmentHorizontal) alignmentHorizontal2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression alignmentVertical = getAlignmentVertical();
        DivAlignmentVertical divAlignmentVertical = alignmentVertical != null ? (DivAlignmentVertical) alignmentVertical.evaluate(expressionResolver) : null;
        Expression alignmentVertical2 = divImage.getAlignmentVertical();
        if (divAlignmentVertical != (alignmentVertical2 != null ? (DivAlignmentVertical) alignmentVertical2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        if (!(((Number) getAlpha().evaluate(expressionResolver)).doubleValue() == ((Number) divImage.getAlpha().evaluate(expressionResolver2)).doubleValue())) {
            return false;
        }
        List animators = getAnimators();
        if (animators != null) {
            List animators2 = divImage.getAnimators();
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
        DivFadeTransition divFadeTransition = this.appearanceAnimation;
        if (!(divFadeTransition != null ? divFadeTransition.equals(divImage.appearanceAnimation, expressionResolver, expressionResolver2) : divImage.appearanceAnimation == null)) {
            return false;
        }
        DivAspect divAspect = this.aspect;
        if (!(divAspect != null ? divAspect.equals(divImage.aspect, expressionResolver, expressionResolver2) : divImage.aspect == null)) {
            return false;
        }
        List background = getBackground();
        if (background != null) {
            List background2 = divImage.getBackground();
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
        if (!(border != null ? border.equals(divImage.getBorder(), expressionResolver, expressionResolver2) : divImage.getBorder() == null) || ((Boolean) this.captureFocusOnAction.evaluate(expressionResolver)).booleanValue() != ((Boolean) divImage.captureFocusOnAction.evaluate(expressionResolver2)).booleanValue()) {
            return false;
        }
        Expression columnSpan = getColumnSpan();
        Long l = columnSpan != null ? (Long) columnSpan.evaluate(expressionResolver) : null;
        Expression columnSpan2 = divImage.getColumnSpan();
        if (!Intrinsics.areEqual(l, columnSpan2 != null ? (Long) columnSpan2.evaluate(expressionResolver2) : null) || this.contentAlignmentHorizontal.evaluate(expressionResolver) != divImage.contentAlignmentHorizontal.evaluate(expressionResolver2) || this.contentAlignmentVertical.evaluate(expressionResolver) != divImage.contentAlignmentVertical.evaluate(expressionResolver2)) {
            return false;
        }
        List disappearActions = getDisappearActions();
        if (disappearActions != null) {
            List disappearActions2 = divImage.getDisappearActions();
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
            List list4 = divImage.doubletapActions;
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
            List extensions2 = divImage.getExtensions();
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
        List list5 = this.filters;
        if (list5 != null) {
            List list6 = divImage.filters;
            if (list6 != null) {
                if (list5.size() == list6.size()) {
                    int i13 = 0;
                    for (Object obj7 : list5) {
                        int i14 = i13 + 1;
                        if (i13 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivFilter) obj7).equals((DivFilter) list6.get(i13), expressionResolver, expressionResolver2)) {
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
        DivFocus focus = getFocus();
        if (!(focus != null ? focus.equals(divImage.getFocus(), expressionResolver, expressionResolver2) : divImage.getFocus() == null)) {
            return false;
        }
        List functions = getFunctions();
        if (functions != null) {
            List functions2 = divImage.getFunctions();
            if (functions2 != null) {
                if (functions.size() == functions2.size()) {
                    int i15 = 0;
                    for (Object obj8 : functions) {
                        int i16 = i15 + 1;
                        if (i15 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivFunction) obj8).equals((DivFunction) functions2.get(i15), expressionResolver, expressionResolver2)) {
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
        if (!z8 || !getHeight().equals(divImage.getHeight(), expressionResolver, expressionResolver2) || ((Boolean) this.highPriorityPreviewShow.evaluate(expressionResolver)).booleanValue() != ((Boolean) divImage.highPriorityPreviewShow.evaluate(expressionResolver2)).booleanValue()) {
            return false;
        }
        List list7 = this.hoverEndActions;
        if (list7 != null) {
            List list8 = divImage.hoverEndActions;
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
        if (!z9) {
            return false;
        }
        List list9 = this.hoverStartActions;
        if (list9 != null) {
            List list10 = divImage.hoverStartActions;
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
        if (!z10 || !Intrinsics.areEqual(getId(), divImage.getId()) || !Intrinsics.areEqual(this.imageUrl.evaluate(expressionResolver), divImage.imageUrl.evaluate(expressionResolver2))) {
            return false;
        }
        DivLayoutProvider layoutProvider = getLayoutProvider();
        if (!(layoutProvider != null ? layoutProvider.equals(divImage.getLayoutProvider(), expressionResolver, expressionResolver2) : divImage.getLayoutProvider() == null)) {
            return false;
        }
        List list11 = this.longtapActions;
        if (list11 != null) {
            List list12 = divImage.longtapActions;
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
        DivEdgeInsets margins = getMargins();
        if (!(margins != null ? margins.equals(divImage.getMargins(), expressionResolver, expressionResolver2) : divImage.getMargins() == null)) {
            return false;
        }
        DivEdgeInsets paddings = getPaddings();
        if (!(paddings != null ? paddings.equals(divImage.getPaddings(), expressionResolver, expressionResolver2) : divImage.getPaddings() == null) || ((Number) this.placeholderColor.evaluate(expressionResolver)).intValue() != ((Number) divImage.placeholderColor.evaluate(expressionResolver2)).intValue() || ((Boolean) this.preloadRequired.evaluate(expressionResolver)).booleanValue() != ((Boolean) divImage.preloadRequired.evaluate(expressionResolver2)).booleanValue()) {
            return false;
        }
        List list13 = this.pressEndActions;
        if (list13 != null) {
            List list14 = divImage.pressEndActions;
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
        List list15 = this.pressStartActions;
        if (list15 != null) {
            List list16 = divImage.pressStartActions;
            if (list16 != null) {
                if (list15.size() == list16.size()) {
                    int i25 = 0;
                    for (Object obj13 : list15) {
                        int i26 = i25 + 1;
                        if (i25 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivAction) obj13).equals((DivAction) list16.get(i25), expressionResolver, expressionResolver2)) {
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
        Expression expression = this.preview;
        String str = expression != null ? (String) expression.evaluate(expressionResolver) : null;
        Expression expression2 = divImage.preview;
        if (!Intrinsics.areEqual(str, expression2 != null ? (String) expression2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression reuseId = getReuseId();
        String str2 = reuseId != null ? (String) reuseId.evaluate(expressionResolver) : null;
        Expression reuseId2 = divImage.getReuseId();
        if (!Intrinsics.areEqual(str2, reuseId2 != null ? (String) reuseId2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression rowSpan = getRowSpan();
        Long l2 = rowSpan != null ? (Long) rowSpan.evaluate(expressionResolver) : null;
        Expression rowSpan2 = divImage.getRowSpan();
        if (!Intrinsics.areEqual(l2, rowSpan2 != null ? (Long) rowSpan2.evaluate(expressionResolver2) : null) || this.scale.evaluate(expressionResolver) != divImage.scale.evaluate(expressionResolver2)) {
            return false;
        }
        List selectedActions = getSelectedActions();
        if (selectedActions != null) {
            List selectedActions2 = divImage.getSelectedActions();
            if (selectedActions2 != null) {
                if (selectedActions.size() == selectedActions2.size()) {
                    int i27 = 0;
                    for (Object obj14 : selectedActions) {
                        int i28 = i27 + 1;
                        if (i27 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivAction) obj14).equals((DivAction) selectedActions2.get(i27), expressionResolver, expressionResolver2)) {
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
        Expression expression3 = this.tintColor;
        Integer num = expression3 != null ? (Integer) expression3.evaluate(expressionResolver) : null;
        Expression expression4 = divImage.tintColor;
        if (!Intrinsics.areEqual(num, expression4 != null ? (Integer) expression4.evaluate(expressionResolver2) : null) || this.tintMode.evaluate(expressionResolver) != divImage.tintMode.evaluate(expressionResolver2)) {
            return false;
        }
        List tooltips = getTooltips();
        if (tooltips != null) {
            List tooltips2 = divImage.getTooltips();
            if (tooltips2 != null) {
                if (tooltips.size() == tooltips2.size()) {
                    int i29 = 0;
                    for (Object obj15 : tooltips) {
                        int i30 = i29 + 1;
                        if (i29 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivTooltip) obj15).equals((DivTooltip) tooltips2.get(i29), expressionResolver, expressionResolver2)) {
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
        DivTransform transform = getTransform();
        if (!(transform != null ? transform.equals(divImage.getTransform(), expressionResolver, expressionResolver2) : divImage.getTransform() == null)) {
            return false;
        }
        DivChangeTransition transitionChange = getTransitionChange();
        if (!(transitionChange != null ? transitionChange.equals(divImage.getTransitionChange(), expressionResolver, expressionResolver2) : divImage.getTransitionChange() == null)) {
            return false;
        }
        DivAppearanceTransition transitionIn = getTransitionIn();
        if (!(transitionIn != null ? transitionIn.equals(divImage.getTransitionIn(), expressionResolver, expressionResolver2) : divImage.getTransitionIn() == null)) {
            return false;
        }
        DivAppearanceTransition transitionOut = getTransitionOut();
        if (!(transitionOut != null ? transitionOut.equals(divImage.getTransitionOut(), expressionResolver, expressionResolver2) : divImage.getTransitionOut() == null)) {
            return false;
        }
        List transitionTriggers = getTransitionTriggers();
        if (transitionTriggers != null) {
            List transitionTriggers2 = divImage.getTransitionTriggers();
            if (transitionTriggers2 != null) {
                if (transitionTriggers.size() == transitionTriggers2.size()) {
                    int i31 = 0;
                    for (Object obj16 : transitionTriggers) {
                        int i32 = i31 + 1;
                        if (i31 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivTransitionTrigger) obj16) == ((DivTransitionTrigger) transitionTriggers2.get(i31))) {
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
        List variableTriggers = getVariableTriggers();
        if (variableTriggers != null) {
            List variableTriggers2 = divImage.getVariableTriggers();
            if (variableTriggers2 != null) {
                if (variableTriggers.size() == variableTriggers2.size()) {
                    int i33 = 0;
                    for (Object obj17 : variableTriggers) {
                        int i34 = i33 + 1;
                        if (i33 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivTrigger) obj17).equals((DivTrigger) variableTriggers2.get(i33), expressionResolver, expressionResolver2)) {
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
        if (!z17) {
            return false;
        }
        List variables = getVariables();
        if (variables != null) {
            List variables2 = divImage.getVariables();
            if (variables2 != null) {
                if (variables.size() == variables2.size()) {
                    int i35 = 0;
                    for (Object obj18 : variables) {
                        int i36 = i35 + 1;
                        if (i35 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivVariable) obj18).equals((DivVariable) variables2.get(i35), expressionResolver, expressionResolver2)) {
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
        if (!z18 || getVisibility().evaluate(expressionResolver) != divImage.getVisibility().evaluate(expressionResolver2)) {
            return false;
        }
        DivVisibilityAction visibilityAction = getVisibilityAction();
        if (!(visibilityAction != null ? visibilityAction.equals(divImage.getVisibilityAction(), expressionResolver, expressionResolver2) : divImage.getVisibilityAction() == null)) {
            return false;
        }
        List visibilityActions = getVisibilityActions();
        if (visibilityActions != null) {
            List visibilityActions2 = divImage.getVisibilityActions();
            if (visibilityActions2 != null) {
                if (visibilityActions.size() == visibilityActions2.size()) {
                    int i37 = 0;
                    for (Object obj19 : visibilityActions) {
                        int i38 = i37 + 1;
                        if (i37 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivVisibilityAction) obj19).equals((DivVisibilityAction) visibilityActions2.get(i37), expressionResolver, expressionResolver2)) {
                            i37 = i38;
                        }
                    }
                    z19 = true;
                }
                z19 = false;
                break;
            }
            return false;
        }
        return z19 && getWidth().equals(divImage.getWidth(), expressionResolver, expressionResolver2);
    }

    public static /* synthetic */ DivImage copy$default(DivImage divImage, DivAccessibility divAccessibility, DivAction divAction, DivAnimation divAnimation, List list, Expression expression, Expression expression2, Expression expression3, List list2, DivFadeTransition divFadeTransition, DivAspect divAspect, List list3, DivBorder divBorder, Expression expression4, Expression expression5, Expression expression6, Expression expression7, List list4, List list5, List list6, List list7, DivFocus divFocus, List list8, DivSize divSize, Expression expression8, List list9, List list10, String str, Expression expression9, DivLayoutProvider divLayoutProvider, List list11, DivEdgeInsets divEdgeInsets, DivEdgeInsets divEdgeInsets2, Expression expression10, Expression expression11, List list12, List list13, Expression expression12, Expression expression13, Expression expression14, Expression expression15, List list14, Expression expression16, Expression expression17, List list15, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list16, List list17, List list18, Expression expression18, DivVisibilityAction divVisibilityAction, List list19, DivSize divSize2, int i, int i2, Object obj) {
        DivAccessibility accessibility = (i & 1) != 0 ? divImage.getAccessibility() : divAccessibility;
        DivAction divAction2 = (i & 2) != 0 ? divImage.action : divAction;
        DivAnimation divAnimation2 = (i & 4) != 0 ? divImage.actionAnimation : divAnimation;
        List list20 = (i & 8) != 0 ? divImage.actions : list;
        Expression alignmentHorizontal = (i & 16) != 0 ? divImage.getAlignmentHorizontal() : expression;
        Expression alignmentVertical = (i & 32) != 0 ? divImage.getAlignmentVertical() : expression2;
        Expression alpha = (i & 64) != 0 ? divImage.getAlpha() : expression3;
        List animators = (i & 128) != 0 ? divImage.getAnimators() : list2;
        DivFadeTransition divFadeTransition2 = (i & 256) != 0 ? divImage.appearanceAnimation : divFadeTransition;
        DivAspect divAspect2 = (i & 512) != 0 ? divImage.aspect : divAspect;
        List background = (i & 1024) != 0 ? divImage.getBackground() : list3;
        DivBorder border = (i & 2048) != 0 ? divImage.getBorder() : divBorder;
        Expression expression19 = (i & 4096) != 0 ? divImage.captureFocusOnAction : expression4;
        Expression columnSpan = (i & 8192) != 0 ? divImage.getColumnSpan() : expression5;
        Expression expression20 = (i & 16384) != 0 ? divImage.contentAlignmentHorizontal : expression6;
        Expression expression21 = (i & 32768) != 0 ? divImage.contentAlignmentVertical : expression7;
        List disappearActions = (i & 65536) != 0 ? divImage.getDisappearActions() : list4;
        Expression expression22 = expression21;
        List list21 = (i & 131072) != 0 ? divImage.doubletapActions : list5;
        List extensions = (i & 262144) != 0 ? divImage.getExtensions() : list6;
        List list22 = list21;
        List list23 = (i & 524288) != 0 ? divImage.filters : list7;
        DivFocus focus = (i & 1048576) != 0 ? divImage.getFocus() : divFocus;
        List functions = (i & 2097152) != 0 ? divImage.getFunctions() : list8;
        DivSize height = (i & 4194304) != 0 ? divImage.getHeight() : divSize;
        List list24 = list23;
        Expression expression23 = (i & 8388608) != 0 ? divImage.highPriorityPreviewShow : expression8;
        List list25 = (i & 16777216) != 0 ? divImage.hoverEndActions : list9;
        List list26 = (i & 33554432) != 0 ? divImage.hoverStartActions : list10;
        String id = (i & 67108864) != 0 ? divImage.getId() : str;
        List list27 = list26;
        Expression expression24 = (i & 134217728) != 0 ? divImage.imageUrl : expression9;
        return divImage.copy(accessibility, divAction2, divAnimation2, list20, alignmentHorizontal, alignmentVertical, alpha, animators, divFadeTransition2, divAspect2, background, border, expression19, columnSpan, expression20, expression22, disappearActions, list22, extensions, list24, focus, functions, height, expression23, list25, list27, id, expression24, (i & 268435456) != 0 ? divImage.getLayoutProvider() : divLayoutProvider, (i & 536870912) != 0 ? divImage.longtapActions : list11, (i & 1073741824) != 0 ? divImage.getMargins() : divEdgeInsets, (i & Integer.MIN_VALUE) != 0 ? divImage.getPaddings() : divEdgeInsets2, (i2 & 1) != 0 ? divImage.placeholderColor : expression10, (i2 & 2) != 0 ? divImage.preloadRequired : expression11, (i2 & 4) != 0 ? divImage.pressEndActions : list12, (i2 & 8) != 0 ? divImage.pressStartActions : list13, (i2 & 16) != 0 ? divImage.preview : expression12, (i2 & 32) != 0 ? divImage.getReuseId() : expression13, (i2 & 64) != 0 ? divImage.getRowSpan() : expression14, (i2 & 128) != 0 ? divImage.scale : expression15, (i2 & 256) != 0 ? divImage.getSelectedActions() : list14, (i2 & 512) != 0 ? divImage.tintColor : expression16, (i2 & 1024) != 0 ? divImage.tintMode : expression17, (i2 & 2048) != 0 ? divImage.getTooltips() : list15, (i2 & 4096) != 0 ? divImage.getTransform() : divTransform, (i2 & 8192) != 0 ? divImage.getTransitionChange() : divChangeTransition, (i2 & 16384) != 0 ? divImage.getTransitionIn() : divAppearanceTransition, (i2 & 32768) != 0 ? divImage.getTransitionOut() : divAppearanceTransition2, (i2 & 65536) != 0 ? divImage.getTransitionTriggers() : list16, (i2 & 131072) != 0 ? divImage.getVariableTriggers() : list17, (i2 & 262144) != 0 ? divImage.getVariables() : list18, (i2 & 524288) != 0 ? divImage.getVisibility() : expression18, (i2 & 1048576) != 0 ? divImage.getVisibilityAction() : divVisibilityAction, (i2 & 2097152) != 0 ? divImage.getVisibilityActions() : list19, (i2 & 4194304) != 0 ? divImage.getWidth() : divSize2);
    }

    public final DivImage copy(DivAccessibility divAccessibility, DivAction divAction, DivAnimation divAnimation, List list, Expression expression, Expression expression2, Expression expression3, List list2, DivFadeTransition divFadeTransition, DivAspect divAspect, List list3, DivBorder divBorder, Expression expression4, Expression expression5, Expression expression6, Expression expression7, List list4, List list5, List list6, List list7, DivFocus divFocus, List list8, DivSize divSize, Expression expression8, List list9, List list10, String str, Expression expression9, DivLayoutProvider divLayoutProvider, List list11, DivEdgeInsets divEdgeInsets, DivEdgeInsets divEdgeInsets2, Expression expression10, Expression expression11, List list12, List list13, Expression expression12, Expression expression13, Expression expression14, Expression expression15, List list14, Expression expression16, Expression expression17, List list15, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list16, List list17, List list18, Expression expression18, DivVisibilityAction divVisibilityAction, List list19, DivSize divSize2) {
        return new DivImage(divAccessibility, divAction, divAnimation, list, expression, expression2, expression3, list2, divFadeTransition, divAspect, list3, divBorder, expression4, expression5, expression6, expression7, list4, list5, list6, list7, divFocus, list8, divSize, expression8, list9, list10, str, expression9, divLayoutProvider, list11, divEdgeInsets, divEdgeInsets2, expression10, expression11, list12, list13, expression12, expression13, expression14, expression15, list14, expression16, expression17, list15, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, list16, list17, list18, expression18, divVisibilityAction, list19, divSize2);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivImageJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivImageJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivImage.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivImage fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivImageJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivImageJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
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
        Boolean bool = Boolean.FALSE;
        HIGH_PRIORITY_PREVIEW_SHOW_DEFAULT_VALUE = Expression.Companion.constant$default(companion, bool, null, 2, null);
        PLACEHOLDER_COLOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Integer.valueOf(DivSeparatorView.DEFAULT_DIVIDER_COLOR), null, 2, null);
        PRELOAD_REQUIRED_DEFAULT_VALUE = Expression.Companion.constant$default(companion, bool, null, 2, null);
        SCALE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivImageScale.FILL, null, 2, null);
        TINT_MODE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivBlendMode.SOURCE_IN, null, 2, null);
        VISIBILITY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        WIDTH_DEFAULT_VALUE = new DivSize.MatchParent(new DivMatchParentSize(null, null == true ? 1 : 0, null == true ? 1 : 0, 7, null));
        CREATOR = new Function2() { // from class: com.yandex.div2.DivImage$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivImage invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivImage.Companion.fromJson(parsingEnvironment, jSONObject);
            }
        };
    }
}
