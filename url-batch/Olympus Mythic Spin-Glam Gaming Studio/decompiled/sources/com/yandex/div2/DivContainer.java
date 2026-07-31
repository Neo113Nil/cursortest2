package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivContainer;
import com.yandex.div2.DivContainerJsonParser;
import com.yandex.div2.DivContainerSeparatorJsonParser;
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

/* compiled from: DivContainer.kt */
/* loaded from: classes12.dex */
public final class DivContainer implements JSONSerializable, Hashable, DivBase {
    private static final DivAnimation ACTION_ANIMATION_DEFAULT_VALUE;
    private static final Expression ALPHA_DEFAULT_VALUE;
    private static final Expression CAPTURE_FOCUS_ON_ACTION_DEFAULT_VALUE;
    private static final Expression CLIP_TO_BOUNDS_DEFAULT_VALUE;
    private static final Expression CONTENT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE;
    private static final Expression CONTENT_ALIGNMENT_VERTICAL_DEFAULT_VALUE;
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final DivSize.WrapContent HEIGHT_DEFAULT_VALUE;
    private static final Expression ITEM_SPACING_DEFAULT_VALUE;
    private static final Expression LAYOUT_MODE_DEFAULT_VALUE;
    private static final Expression LINE_SPACING_DEFAULT_VALUE;
    private static final Expression ORIENTATION_DEFAULT_VALUE;
    private static final Expression VISIBILITY_DEFAULT_VALUE;
    private static final DivSize.MatchParent WIDTH_DEFAULT_VALUE;
    private Integer _hash;
    private Integer _propertiesHash;
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
    public final Expression clipToBounds;
    private final Expression columnSpan;
    public final Expression contentAlignmentHorizontal;
    public final Expression contentAlignmentVertical;
    private final List disappearActions;
    public final List doubletapActions;
    private final List extensions;
    private final DivFocus focus;
    private final List functions;
    private final DivSize height;
    public final List hoverEndActions;
    public final List hoverStartActions;
    private final String id;
    public final DivCollectionItemBuilder itemBuilder;
    public final Expression itemSpacing;
    public final List items;
    public final Expression layoutMode;
    private final DivLayoutProvider layoutProvider;
    public final Separator lineSeparator;
    public final Expression lineSpacing;
    public final List longtapActions;
    private final DivEdgeInsets margins;
    public final Expression orientation;
    private final DivEdgeInsets paddings;
    public final List pressEndActions;
    public final List pressStartActions;
    private final Expression reuseId;
    private final Expression rowSpan;
    private final List selectedActions;
    public final Separator separator;
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

    public DivContainer(DivAccessibility divAccessibility, DivAction divAction, DivAnimation divAnimation, List list, Expression expression, Expression expression2, Expression expression3, List list2, DivAspect divAspect, List list3, DivBorder divBorder, Expression expression4, Expression expression5, Expression expression6, Expression expression7, Expression expression8, List list4, List list5, List list6, DivFocus divFocus, List list7, DivSize divSize, List list8, List list9, String str, DivCollectionItemBuilder divCollectionItemBuilder, Expression expression9, List list10, Expression expression10, DivLayoutProvider divLayoutProvider, Separator separator, Expression expression11, List list11, DivEdgeInsets divEdgeInsets, Expression expression12, DivEdgeInsets divEdgeInsets2, List list12, List list13, Expression expression13, Expression expression14, List list14, Separator separator2, List list15, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list16, List list17, List list18, Expression expression15, DivVisibilityAction divVisibilityAction, List list19, DivSize divSize2) {
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
        this.clipToBounds = expression5;
        this.columnSpan = expression6;
        this.contentAlignmentHorizontal = expression7;
        this.contentAlignmentVertical = expression8;
        this.disappearActions = list4;
        this.doubletapActions = list5;
        this.extensions = list6;
        this.focus = divFocus;
        this.functions = list7;
        this.height = divSize;
        this.hoverEndActions = list8;
        this.hoverStartActions = list9;
        this.id = str;
        this.itemBuilder = divCollectionItemBuilder;
        this.itemSpacing = expression9;
        this.items = list10;
        this.layoutMode = expression10;
        this.layoutProvider = divLayoutProvider;
        this.lineSeparator = separator;
        this.lineSpacing = expression11;
        this.longtapActions = list11;
        this.margins = divEdgeInsets;
        this.orientation = expression12;
        this.paddings = divEdgeInsets2;
        this.pressEndActions = list12;
        this.pressStartActions = list13;
        this.reuseId = expression13;
        this.rowSpan = expression14;
        this.selectedActions = list14;
        this.separator = separator2;
        this.tooltips = list15;
        this.transform = divTransform;
        this.transitionChange = divChangeTransition;
        this.transitionIn = divAppearanceTransition;
        this.transitionOut = divAppearanceTransition2;
        this.transitionTriggers = list16;
        this.variableTriggers = list17;
        this.variables = list18;
        this.visibility = expression15;
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
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Integer num = this._propertiesHash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivContainer.class).hashCode();
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
        int hash4 = i20 + (border != null ? border.hash() : 0) + this.captureFocusOnAction.hashCode() + this.clipToBounds.hashCode();
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
        DivCollectionItemBuilder divCollectionItemBuilder = this.itemBuilder;
        int hash7 = hashCode5 + (divCollectionItemBuilder != null ? divCollectionItemBuilder.hash() : 0) + this.itemSpacing.hashCode() + this.layoutMode.hashCode();
        DivLayoutProvider layoutProvider = getLayoutProvider();
        int hash8 = hash7 + (layoutProvider != null ? layoutProvider.hash() : 0);
        Separator separator = this.lineSeparator;
        int hash9 = hash8 + (separator != null ? separator.hash() : 0) + this.lineSpacing.hashCode();
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
        int i26 = hash9 + i10;
        DivEdgeInsets margins = getMargins();
        int hash10 = i26 + (margins != null ? margins.hash() : 0) + this.orientation.hashCode();
        DivEdgeInsets paddings = getPaddings();
        int hash11 = hash10 + (paddings != null ? paddings.hash() : 0);
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
        int i27 = hash11 + i11;
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
        Separator separator2 = this.separator;
        int hash12 = i29 + (separator2 != null ? separator2.hash() : 0);
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
        int i30 = hash12 + i14;
        DivTransform transform = getTransform();
        int hash13 = i30 + (transform != null ? transform.hash() : 0);
        DivChangeTransition transitionChange = getTransitionChange();
        int hash14 = hash13 + (transitionChange != null ? transitionChange.hash() : 0);
        DivAppearanceTransition transitionIn = getTransitionIn();
        int hash15 = hash14 + (transitionIn != null ? transitionIn.hash() : 0);
        DivAppearanceTransition transitionOut = getTransitionOut();
        int hash16 = hash15 + (transitionOut != null ? transitionOut.hash() : 0);
        List transitionTriggers = getTransitionTriggers();
        int hashCode8 = hash16 + (transitionTriggers != null ? transitionTriggers.hashCode() : 0);
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
        int hash17 = hashCode9 + (visibilityAction != null ? visibilityAction.hash() : 0);
        List visibilityActions = getVisibilityActions();
        if (visibilityActions != null) {
            Iterator it17 = visibilityActions.iterator();
            while (it17.hasNext()) {
                i17 += ((DivVisibilityAction) it17.next()).hash();
            }
        }
        int hash18 = hash17 + i17 + getWidth().hash();
        this._propertiesHash = Integer.valueOf(hash18);
        return hash18;
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

    /* JADX WARN: Code restructure failed: missing block: B:526:0x0897, code lost:
    
        if (r9.getVisibilityActions() == null) goto L646;
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x081f, code lost:
    
        if (r9.getVariables() == null) goto L613;
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x07d3, code lost:
    
        if (r9.getVariableTriggers() == null) goto L590;
     */
    /* JADX WARN: Code restructure failed: missing block: B:544:0x0787, code lost:
    
        if (r9.getTransitionTriggers() == null) goto L567;
     */
    /* JADX WARN: Code restructure failed: missing block: B:568:0x06d2, code lost:
    
        if (r9.getTooltips() == null) goto L509;
     */
    /* JADX WARN: Code restructure failed: missing block: B:577:0x0672, code lost:
    
        if (r9.getSelectedActions() == null) goto L478;
     */
    /* JADX WARN: Code restructure failed: missing block: B:586:0x05e4, code lost:
    
        if (r9.pressStartActions == null) goto L436;
     */
    /* JADX WARN: Code restructure failed: missing block: B:590:0x059e, code lost:
    
        if (r9.pressEndActions == null) goto L413;
     */
    /* JADX WARN: Code restructure failed: missing block: B:605:0x0516, code lost:
    
        if (r9.longtapActions == null) goto L372;
     */
    /* JADX WARN: Code restructure failed: missing block: B:621:0x0478, code lost:
    
        if (r9.items == null) goto L329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:632:0x03f4, code lost:
    
        if (r9.hoverStartActions == null) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:636:0x03ae, code lost:
    
        if (r9.hoverEndActions == null) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:641:0x035a, code lost:
    
        if (r9.getFunctions() == null) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:650:0x02f4, code lost:
    
        if (r9.getExtensions() == null) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:654:0x02a8, code lost:
    
        if (r9.doubletapActions == null) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:658:0x0262, code lost:
    
        if (r9.getDisappearActions() == null) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:674:0x018a, code lost:
    
        if (r9.getBackground() == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:683:0x012a, code lost:
    
        if (r9.getAnimators() == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:695:0x007c, code lost:
    
        if (r9.actions == null) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(DivContainer divContainer, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
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
        if (divContainer == null) {
            return false;
        }
        DivAccessibility accessibility = getAccessibility();
        if (!(accessibility != null ? accessibility.equals(divContainer.getAccessibility(), expressionResolver, expressionResolver2) : divContainer.getAccessibility() == null)) {
            return false;
        }
        DivAction divAction = this.action;
        if (!(divAction != null ? divAction.equals(divContainer.action, expressionResolver, expressionResolver2) : divContainer.action == null) || !this.actionAnimation.equals(divContainer.actionAnimation, expressionResolver, expressionResolver2)) {
            return false;
        }
        List list = this.actions;
        if (list != null) {
            List list2 = divContainer.actions;
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
        Expression alignmentHorizontal2 = divContainer.getAlignmentHorizontal();
        if (divAlignmentHorizontal != (alignmentHorizontal2 != null ? (DivAlignmentHorizontal) alignmentHorizontal2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression alignmentVertical = getAlignmentVertical();
        DivAlignmentVertical divAlignmentVertical = alignmentVertical != null ? (DivAlignmentVertical) alignmentVertical.evaluate(expressionResolver) : null;
        Expression alignmentVertical2 = divContainer.getAlignmentVertical();
        if (divAlignmentVertical != (alignmentVertical2 != null ? (DivAlignmentVertical) alignmentVertical2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        if (!(((Number) getAlpha().evaluate(expressionResolver)).doubleValue() == ((Number) divContainer.getAlpha().evaluate(expressionResolver2)).doubleValue())) {
            return false;
        }
        List animators = getAnimators();
        if (animators != null) {
            List animators2 = divContainer.getAnimators();
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
        if (!(divAspect != null ? divAspect.equals(divContainer.aspect, expressionResolver, expressionResolver2) : divContainer.aspect == null)) {
            return false;
        }
        List background = getBackground();
        if (background != null) {
            List background2 = divContainer.getBackground();
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
        if (!(border != null ? border.equals(divContainer.getBorder(), expressionResolver, expressionResolver2) : divContainer.getBorder() == null) || ((Boolean) this.captureFocusOnAction.evaluate(expressionResolver)).booleanValue() != ((Boolean) divContainer.captureFocusOnAction.evaluate(expressionResolver2)).booleanValue() || ((Boolean) this.clipToBounds.evaluate(expressionResolver)).booleanValue() != ((Boolean) divContainer.clipToBounds.evaluate(expressionResolver2)).booleanValue()) {
            return false;
        }
        Expression columnSpan = getColumnSpan();
        Long l = columnSpan != null ? (Long) columnSpan.evaluate(expressionResolver) : null;
        Expression columnSpan2 = divContainer.getColumnSpan();
        if (!Intrinsics.areEqual(l, columnSpan2 != null ? (Long) columnSpan2.evaluate(expressionResolver2) : null) || this.contentAlignmentHorizontal.evaluate(expressionResolver) != divContainer.contentAlignmentHorizontal.evaluate(expressionResolver2) || this.contentAlignmentVertical.evaluate(expressionResolver) != divContainer.contentAlignmentVertical.evaluate(expressionResolver2)) {
            return false;
        }
        List disappearActions = getDisappearActions();
        if (disappearActions != null) {
            List disappearActions2 = divContainer.getDisappearActions();
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
            List list4 = divContainer.doubletapActions;
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
            List extensions2 = divContainer.getExtensions();
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
        if (!(focus != null ? focus.equals(divContainer.getFocus(), expressionResolver, expressionResolver2) : divContainer.getFocus() == null)) {
            return false;
        }
        List functions = getFunctions();
        if (functions != null) {
            List functions2 = divContainer.getFunctions();
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
        if (!z7 || !getHeight().equals(divContainer.getHeight(), expressionResolver, expressionResolver2)) {
            return false;
        }
        List list5 = this.hoverEndActions;
        if (list5 != null) {
            List list6 = divContainer.hoverEndActions;
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
            List list8 = divContainer.hoverStartActions;
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
        if (!z9 || !Intrinsics.areEqual(getId(), divContainer.getId())) {
            return false;
        }
        DivCollectionItemBuilder divCollectionItemBuilder = this.itemBuilder;
        if (!(divCollectionItemBuilder != null ? divCollectionItemBuilder.equals(divContainer.itemBuilder, expressionResolver, expressionResolver2) : divContainer.itemBuilder == null) || ((Number) this.itemSpacing.evaluate(expressionResolver)).longValue() != ((Number) divContainer.itemSpacing.evaluate(expressionResolver2)).longValue()) {
            return false;
        }
        List list9 = this.items;
        if (list9 != null) {
            List list10 = divContainer.items;
            if (list10 != null) {
                if (list9.size() == list10.size()) {
                    int i19 = 0;
                    for (Object obj10 : list9) {
                        int i20 = i19 + 1;
                        if (i19 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((Div) obj10).equals((Div) list10.get(i19), expressionResolver, expressionResolver2)) {
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
        if (!z10 || this.layoutMode.evaluate(expressionResolver) != divContainer.layoutMode.evaluate(expressionResolver2)) {
            return false;
        }
        DivLayoutProvider layoutProvider = getLayoutProvider();
        if (!(layoutProvider != null ? layoutProvider.equals(divContainer.getLayoutProvider(), expressionResolver, expressionResolver2) : divContainer.getLayoutProvider() == null)) {
            return false;
        }
        Separator separator = this.lineSeparator;
        if (!(separator != null ? separator.equals(divContainer.lineSeparator, expressionResolver, expressionResolver2) : divContainer.lineSeparator == null) || ((Number) this.lineSpacing.evaluate(expressionResolver)).longValue() != ((Number) divContainer.lineSpacing.evaluate(expressionResolver2)).longValue()) {
            return false;
        }
        List list11 = this.longtapActions;
        if (list11 != null) {
            List list12 = divContainer.longtapActions;
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
        if (!(margins != null ? margins.equals(divContainer.getMargins(), expressionResolver, expressionResolver2) : divContainer.getMargins() == null) || this.orientation.evaluate(expressionResolver) != divContainer.orientation.evaluate(expressionResolver2)) {
            return false;
        }
        DivEdgeInsets paddings = getPaddings();
        if (!(paddings != null ? paddings.equals(divContainer.getPaddings(), expressionResolver, expressionResolver2) : divContainer.getPaddings() == null)) {
            return false;
        }
        List list13 = this.pressEndActions;
        if (list13 != null) {
            List list14 = divContainer.pressEndActions;
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
            List list16 = divContainer.pressStartActions;
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
        Expression reuseId = getReuseId();
        String str = reuseId != null ? (String) reuseId.evaluate(expressionResolver) : null;
        Expression reuseId2 = divContainer.getReuseId();
        if (!Intrinsics.areEqual(str, reuseId2 != null ? (String) reuseId2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression rowSpan = getRowSpan();
        Long l2 = rowSpan != null ? (Long) rowSpan.evaluate(expressionResolver) : null;
        Expression rowSpan2 = divContainer.getRowSpan();
        if (!Intrinsics.areEqual(l2, rowSpan2 != null ? (Long) rowSpan2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List selectedActions = getSelectedActions();
        if (selectedActions != null) {
            List selectedActions2 = divContainer.getSelectedActions();
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
        Separator separator2 = this.separator;
        if (!(separator2 != null ? separator2.equals(divContainer.separator, expressionResolver, expressionResolver2) : divContainer.separator == null)) {
            return false;
        }
        List tooltips = getTooltips();
        if (tooltips != null) {
            List tooltips2 = divContainer.getTooltips();
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
        if (!(transform != null ? transform.equals(divContainer.getTransform(), expressionResolver, expressionResolver2) : divContainer.getTransform() == null)) {
            return false;
        }
        DivChangeTransition transitionChange = getTransitionChange();
        if (!(transitionChange != null ? transitionChange.equals(divContainer.getTransitionChange(), expressionResolver, expressionResolver2) : divContainer.getTransitionChange() == null)) {
            return false;
        }
        DivAppearanceTransition transitionIn = getTransitionIn();
        if (!(transitionIn != null ? transitionIn.equals(divContainer.getTransitionIn(), expressionResolver, expressionResolver2) : divContainer.getTransitionIn() == null)) {
            return false;
        }
        DivAppearanceTransition transitionOut = getTransitionOut();
        if (!(transitionOut != null ? transitionOut.equals(divContainer.getTransitionOut(), expressionResolver, expressionResolver2) : divContainer.getTransitionOut() == null)) {
            return false;
        }
        List transitionTriggers = getTransitionTriggers();
        if (transitionTriggers != null) {
            List transitionTriggers2 = divContainer.getTransitionTriggers();
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
            List variableTriggers2 = divContainer.getVariableTriggers();
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
            List variables2 = divContainer.getVariables();
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
        if (!z18 || getVisibility().evaluate(expressionResolver) != divContainer.getVisibility().evaluate(expressionResolver2)) {
            return false;
        }
        DivVisibilityAction visibilityAction = getVisibilityAction();
        if (!(visibilityAction != null ? visibilityAction.equals(divContainer.getVisibilityAction(), expressionResolver, expressionResolver2) : divContainer.getVisibilityAction() == null)) {
            return false;
        }
        List visibilityActions = getVisibilityActions();
        if (visibilityActions != null) {
            List visibilityActions2 = divContainer.getVisibilityActions();
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
        return z19 && getWidth().equals(divContainer.getWidth(), expressionResolver, expressionResolver2);
    }

    public static /* synthetic */ DivContainer copy$default(DivContainer divContainer, DivAccessibility divAccessibility, DivAction divAction, DivAnimation divAnimation, List list, Expression expression, Expression expression2, Expression expression3, List list2, DivAspect divAspect, List list3, DivBorder divBorder, Expression expression4, Expression expression5, Expression expression6, Expression expression7, Expression expression8, List list4, List list5, List list6, DivFocus divFocus, List list7, DivSize divSize, List list8, List list9, String str, DivCollectionItemBuilder divCollectionItemBuilder, Expression expression9, List list10, Expression expression10, DivLayoutProvider divLayoutProvider, Separator separator, Expression expression11, List list11, DivEdgeInsets divEdgeInsets, Expression expression12, DivEdgeInsets divEdgeInsets2, List list12, List list13, Expression expression13, Expression expression14, List list14, Separator separator2, List list15, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list16, List list17, List list18, Expression expression15, DivVisibilityAction divVisibilityAction, List list19, DivSize divSize2, int i, int i2, Object obj) {
        DivAccessibility accessibility = (i & 1) != 0 ? divContainer.getAccessibility() : divAccessibility;
        DivAction divAction2 = (i & 2) != 0 ? divContainer.action : divAction;
        DivAnimation divAnimation2 = (i & 4) != 0 ? divContainer.actionAnimation : divAnimation;
        List list20 = (i & 8) != 0 ? divContainer.actions : list;
        Expression alignmentHorizontal = (i & 16) != 0 ? divContainer.getAlignmentHorizontal() : expression;
        Expression alignmentVertical = (i & 32) != 0 ? divContainer.getAlignmentVertical() : expression2;
        Expression alpha = (i & 64) != 0 ? divContainer.getAlpha() : expression3;
        List animators = (i & 128) != 0 ? divContainer.getAnimators() : list2;
        DivAspect divAspect2 = (i & 256) != 0 ? divContainer.aspect : divAspect;
        List background = (i & 512) != 0 ? divContainer.getBackground() : list3;
        DivBorder border = (i & 1024) != 0 ? divContainer.getBorder() : divBorder;
        Expression expression16 = (i & 2048) != 0 ? divContainer.captureFocusOnAction : expression4;
        Expression expression17 = (i & 4096) != 0 ? divContainer.clipToBounds : expression5;
        Expression columnSpan = (i & 8192) != 0 ? divContainer.getColumnSpan() : expression6;
        Expression expression18 = (i & 16384) != 0 ? divContainer.contentAlignmentHorizontal : expression7;
        Expression expression19 = (i & 32768) != 0 ? divContainer.contentAlignmentVertical : expression8;
        List disappearActions = (i & 65536) != 0 ? divContainer.getDisappearActions() : list4;
        Expression expression20 = expression19;
        List list21 = (i & 131072) != 0 ? divContainer.doubletapActions : list5;
        List extensions = (i & 262144) != 0 ? divContainer.getExtensions() : list6;
        DivFocus focus = (i & 524288) != 0 ? divContainer.getFocus() : divFocus;
        List functions = (i & 1048576) != 0 ? divContainer.getFunctions() : list7;
        DivSize height = (i & 2097152) != 0 ? divContainer.getHeight() : divSize;
        List list22 = list21;
        List list23 = (i & 4194304) != 0 ? divContainer.hoverEndActions : list8;
        List list24 = (i & 8388608) != 0 ? divContainer.hoverStartActions : list9;
        String id = (i & 16777216) != 0 ? divContainer.getId() : str;
        List list25 = list24;
        DivCollectionItemBuilder divCollectionItemBuilder2 = (i & 33554432) != 0 ? divContainer.itemBuilder : divCollectionItemBuilder;
        Expression expression21 = (i & 67108864) != 0 ? divContainer.itemSpacing : expression9;
        List list26 = (i & 134217728) != 0 ? divContainer.items : list10;
        Expression expression22 = (i & 268435456) != 0 ? divContainer.layoutMode : expression10;
        DivLayoutProvider layoutProvider = (i & 536870912) != 0 ? divContainer.getLayoutProvider() : divLayoutProvider;
        Expression expression23 = expression22;
        Separator separator3 = (i & 1073741824) != 0 ? divContainer.lineSeparator : separator;
        Expression expression24 = (i & Integer.MIN_VALUE) != 0 ? divContainer.lineSpacing : expression11;
        List list27 = (i2 & 1) != 0 ? divContainer.longtapActions : list11;
        DivEdgeInsets margins = (i2 & 2) != 0 ? divContainer.getMargins() : divEdgeInsets;
        List list28 = list27;
        Expression expression25 = (i2 & 4) != 0 ? divContainer.orientation : expression12;
        return divContainer.copy(accessibility, divAction2, divAnimation2, list20, alignmentHorizontal, alignmentVertical, alpha, animators, divAspect2, background, border, expression16, expression17, columnSpan, expression18, expression20, disappearActions, list22, extensions, focus, functions, height, list23, list25, id, divCollectionItemBuilder2, expression21, list26, expression23, layoutProvider, separator3, expression24, list28, margins, expression25, (i2 & 8) != 0 ? divContainer.getPaddings() : divEdgeInsets2, (i2 & 16) != 0 ? divContainer.pressEndActions : list12, (i2 & 32) != 0 ? divContainer.pressStartActions : list13, (i2 & 64) != 0 ? divContainer.getReuseId() : expression13, (i2 & 128) != 0 ? divContainer.getRowSpan() : expression14, (i2 & 256) != 0 ? divContainer.getSelectedActions() : list14, (i2 & 512) != 0 ? divContainer.separator : separator2, (i2 & 1024) != 0 ? divContainer.getTooltips() : list15, (i2 & 2048) != 0 ? divContainer.getTransform() : divTransform, (i2 & 4096) != 0 ? divContainer.getTransitionChange() : divChangeTransition, (i2 & 8192) != 0 ? divContainer.getTransitionIn() : divAppearanceTransition, (i2 & 16384) != 0 ? divContainer.getTransitionOut() : divAppearanceTransition2, (i2 & 32768) != 0 ? divContainer.getTransitionTriggers() : list16, (i2 & 65536) != 0 ? divContainer.getVariableTriggers() : list17, (i2 & 131072) != 0 ? divContainer.getVariables() : list18, (i2 & 262144) != 0 ? divContainer.getVisibility() : expression15, (i2 & 524288) != 0 ? divContainer.getVisibilityAction() : divVisibilityAction, (i2 & 1048576) != 0 ? divContainer.getVisibilityActions() : list19, (i2 & 2097152) != 0 ? divContainer.getWidth() : divSize2);
    }

    public final DivContainer copy(DivAccessibility divAccessibility, DivAction divAction, DivAnimation divAnimation, List list, Expression expression, Expression expression2, Expression expression3, List list2, DivAspect divAspect, List list3, DivBorder divBorder, Expression expression4, Expression expression5, Expression expression6, Expression expression7, Expression expression8, List list4, List list5, List list6, DivFocus divFocus, List list7, DivSize divSize, List list8, List list9, String str, DivCollectionItemBuilder divCollectionItemBuilder, Expression expression9, List list10, Expression expression10, DivLayoutProvider divLayoutProvider, Separator separator, Expression expression11, List list11, DivEdgeInsets divEdgeInsets, Expression expression12, DivEdgeInsets divEdgeInsets2, List list12, List list13, Expression expression13, Expression expression14, List list14, Separator separator2, List list15, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list16, List list17, List list18, Expression expression15, DivVisibilityAction divVisibilityAction, List list19, DivSize divSize2) {
        return new DivContainer(divAccessibility, divAction, divAnimation, list, expression, expression2, expression3, list2, divAspect, list3, divBorder, expression4, expression5, expression6, expression7, expression8, list4, list5, list6, divFocus, list7, divSize, list8, list9, str, divCollectionItemBuilder, expression9, list10, expression10, divLayoutProvider, separator, expression11, list11, divEdgeInsets, expression12, divEdgeInsets2, list12, list13, expression13, expression14, list14, separator2, list15, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, list16, list17, list18, expression15, divVisibilityAction, list19, divSize2);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivContainerJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivContainerJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivContainer.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivContainer fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivContainerJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivContainerJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
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
        Boolean bool = Boolean.TRUE;
        CAPTURE_FOCUS_ON_ACTION_DEFAULT_VALUE = Expression.Companion.constant$default(companion, bool, null, 2, null);
        CLIP_TO_BOUNDS_DEFAULT_VALUE = Expression.Companion.constant$default(companion, bool, null, 2, null);
        CONTENT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivContentAlignmentHorizontal.START, null, 2, null);
        CONTENT_ALIGNMENT_VERTICAL_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivContentAlignmentVertical.TOP, null, 2, null);
        HEIGHT_DEFAULT_VALUE = new DivSize.WrapContent(new DivWrapContentSize(null, null, null == true ? 1 : 0, 7, null));
        ITEM_SPACING_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        LAYOUT_MODE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, LayoutMode.NO_WRAP, null, 2, null);
        LINE_SPACING_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        ORIENTATION_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Orientation.VERTICAL, null, 2, null);
        VISIBILITY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        WIDTH_DEFAULT_VALUE = new DivSize.MatchParent(new DivMatchParentSize(null, null, null == true ? 1 : 0, 7, null));
        CREATOR = new Function2() { // from class: com.yandex.div2.DivContainer$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivContainer invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivContainer.Companion.fromJson(parsingEnvironment, jSONObject);
            }
        };
    }

    /* compiled from: DivContainer.kt */
    public static final class Separator implements JSONSerializable, Hashable {
        private static final Function2 CREATOR;
        public static final Companion Companion = new Companion(null);
        private static final Expression SHOW_AT_END_DEFAULT_VALUE;
        private static final Expression SHOW_AT_START_DEFAULT_VALUE;
        private static final Expression SHOW_BETWEEN_DEFAULT_VALUE;
        private Integer _hash;
        public final DivEdgeInsets margins;
        public final Expression showAtEnd;
        public final Expression showAtStart;
        public final Expression showBetween;
        public final DivDrawable style;

        public Separator(DivEdgeInsets divEdgeInsets, Expression expression, Expression expression2, Expression expression3, DivDrawable divDrawable) {
            this.margins = divEdgeInsets;
            this.showAtEnd = expression;
            this.showAtStart = expression2;
            this.showBetween = expression3;
            this.style = divDrawable;
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this._hash;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = Reflection.getOrCreateKotlinClass(Separator.class).hashCode();
            DivEdgeInsets divEdgeInsets = this.margins;
            int hash = hashCode + (divEdgeInsets != null ? divEdgeInsets.hash() : 0) + this.showAtEnd.hashCode() + this.showAtStart.hashCode() + this.showBetween.hashCode() + this.style.hash();
            this._hash = Integer.valueOf(hash);
            return hash;
        }

        public final boolean equals(Separator separator, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            if (separator == null) {
                return false;
            }
            DivEdgeInsets divEdgeInsets = this.margins;
            return (divEdgeInsets != null ? divEdgeInsets.equals(separator.margins, expressionResolver, expressionResolver2) : separator.margins == null) && ((Boolean) this.showAtEnd.evaluate(expressionResolver)).booleanValue() == ((Boolean) separator.showAtEnd.evaluate(expressionResolver2)).booleanValue() && ((Boolean) this.showAtStart.evaluate(expressionResolver)).booleanValue() == ((Boolean) separator.showAtStart.evaluate(expressionResolver2)).booleanValue() && ((Boolean) this.showBetween.evaluate(expressionResolver)).booleanValue() == ((Boolean) separator.showBetween.evaluate(expressionResolver2)).booleanValue() && this.style.equals(separator.style, expressionResolver, expressionResolver2);
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((DivContainerSeparatorJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivContainerSeparatorJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        /* compiled from: DivContainer.kt */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Separator fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return ((DivContainerSeparatorJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivContainerSeparatorJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
            }
        }

        static {
            Expression.Companion companion = Expression.INSTANCE;
            Boolean bool = Boolean.FALSE;
            SHOW_AT_END_DEFAULT_VALUE = Expression.Companion.constant$default(companion, bool, null, 2, null);
            SHOW_AT_START_DEFAULT_VALUE = Expression.Companion.constant$default(companion, bool, null, 2, null);
            SHOW_BETWEEN_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
            CREATOR = new Function2() { // from class: com.yandex.div2.DivContainer$Separator$Companion$CREATOR$1
                @Override // kotlin.jvm.functions.Function2
                @NotNull
                public final DivContainer.Separator invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                    return DivContainer.Separator.Companion.fromJson(parsingEnvironment, jSONObject);
                }
            };
        }
    }

    /* compiled from: DivContainer.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/yandex/div2/DivContainer$Orientation;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "VERTICAL", "HORIZONTAL", "OVERLAP", "Converter", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Orientation {
        VERTICAL("vertical"),
        HORIZONTAL("horizontal"),
        OVERLAP("overlap");


        @NotNull
        private final String value;

        /* renamed from: Converter, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        public static final Function1 TO_STRING = new Function1() { // from class: com.yandex.div2.DivContainer$Orientation$Converter$TO_STRING$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final String invoke(@NotNull DivContainer.Orientation orientation) {
                return DivContainer.Orientation.INSTANCE.toString(orientation);
            }
        };

        @NotNull
        public static final Function1 FROM_STRING = new Function1() { // from class: com.yandex.div2.DivContainer$Orientation$Converter$FROM_STRING$1
            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final DivContainer.Orientation invoke(@NotNull String str) {
                return DivContainer.Orientation.INSTANCE.fromString(str);
            }
        };

        Orientation(String str) {
            this.value = str;
        }

        /* compiled from: DivContainer.kt */
        /* renamed from: com.yandex.div2.DivContainer$Orientation$Converter, reason: from kotlin metadata */
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
                Orientation orientation3 = Orientation.OVERLAP;
                if (Intrinsics.areEqual(str, orientation3.value)) {
                    return orientation3;
                }
                return null;
            }
        }
    }

    /* compiled from: DivContainer.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/yandex/div2/DivContainer$LayoutMode;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "NO_WRAP", "WRAP", "Converter", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum LayoutMode {
        NO_WRAP("no_wrap"),
        WRAP("wrap");


        @NotNull
        private final String value;

        /* renamed from: Converter, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        public static final Function1 TO_STRING = new Function1() { // from class: com.yandex.div2.DivContainer$LayoutMode$Converter$TO_STRING$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final String invoke(@NotNull DivContainer.LayoutMode layoutMode) {
                return DivContainer.LayoutMode.INSTANCE.toString(layoutMode);
            }
        };

        @NotNull
        public static final Function1 FROM_STRING = new Function1() { // from class: com.yandex.div2.DivContainer$LayoutMode$Converter$FROM_STRING$1
            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final DivContainer.LayoutMode invoke(@NotNull String str) {
                return DivContainer.LayoutMode.INSTANCE.fromString(str);
            }
        };

        LayoutMode(String str) {
            this.value = str;
        }

        /* compiled from: DivContainer.kt */
        /* renamed from: com.yandex.div2.DivContainer$LayoutMode$Converter, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final String toString(LayoutMode layoutMode) {
                return layoutMode.value;
            }

            public final LayoutMode fromString(String str) {
                LayoutMode layoutMode = LayoutMode.NO_WRAP;
                if (Intrinsics.areEqual(str, layoutMode.value)) {
                    return layoutMode;
                }
                LayoutMode layoutMode2 = LayoutMode.WRAP;
                if (Intrinsics.areEqual(str, layoutMode2.value)) {
                    return layoutMode2;
                }
                return null;
            }
        }
    }
}
