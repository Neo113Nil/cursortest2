package com.yandex.div2;

import com.yandex.div.core.view2.divs.widgets.DivSeparatorView;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivTabs;
import com.yandex.div2.DivTabsJsonParser;
import com.yandex.div2.DivTabsTabTitleDelimiterJsonParser;
import com.yandex.div2.DivTabsTabTitleStyleJsonParser;
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

/* compiled from: DivTabs.kt */
/* loaded from: classes9.dex */
public final class DivTabs implements JSONSerializable, Hashable, DivBase {
    private static final Expression ALPHA_DEFAULT_VALUE;
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final Expression DYNAMIC_HEIGHT_DEFAULT_VALUE;
    private static final Expression HAS_SEPARATOR_DEFAULT_VALUE;
    private static final DivSize.WrapContent HEIGHT_DEFAULT_VALUE;
    private static final Expression RESTRICT_PARENT_SCROLL_DEFAULT_VALUE;
    private static final Expression SELECTED_TAB_DEFAULT_VALUE;
    private static final Expression SEPARATOR_COLOR_DEFAULT_VALUE;
    private static final DivEdgeInsets SEPARATOR_PADDINGS_DEFAULT_VALUE;
    private static final Expression SWITCH_TABS_BY_CONTENT_SWIPE_ENABLED_DEFAULT_VALUE;
    private static final DivEdgeInsets TITLE_PADDINGS_DEFAULT_VALUE;
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
    private final List disappearActions;
    public final Expression dynamicHeight;
    private final List extensions;
    private final DivFocus focus;
    private final List functions;
    public final Expression hasSeparator;
    private final DivSize height;
    private final String id;
    public final List items;
    private final DivLayoutProvider layoutProvider;
    private final DivEdgeInsets margins;
    private final DivEdgeInsets paddings;
    public final Expression restrictParentScroll;
    private final Expression reuseId;
    private final Expression rowSpan;
    private final List selectedActions;
    public final Expression selectedTab;
    public final Expression separatorColor;
    public final DivEdgeInsets separatorPaddings;
    public final Expression switchTabsByContentSwipeEnabled;
    public final TabTitleDelimiter tabTitleDelimiter;
    public final TabTitleStyle tabTitleStyle;
    public final DivEdgeInsets titlePaddings;
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

    public DivTabs(DivAccessibility divAccessibility, Expression expression, Expression expression2, Expression expression3, List list, List list2, DivBorder divBorder, Expression expression4, List list3, Expression expression5, List list4, DivFocus divFocus, List list5, Expression expression6, DivSize divSize, String str, List list6, DivLayoutProvider divLayoutProvider, DivEdgeInsets divEdgeInsets, DivEdgeInsets divEdgeInsets2, Expression expression7, Expression expression8, Expression expression9, List list7, Expression expression10, Expression expression11, DivEdgeInsets divEdgeInsets3, Expression expression12, TabTitleDelimiter tabTitleDelimiter, TabTitleStyle tabTitleStyle, DivEdgeInsets divEdgeInsets4, List list8, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list9, List list10, List list11, Expression expression13, DivVisibilityAction divVisibilityAction, List list12, DivSize divSize2) {
        this.accessibility = divAccessibility;
        this.alignmentHorizontal = expression;
        this.alignmentVertical = expression2;
        this.alpha = expression3;
        this.animators = list;
        this.background = list2;
        this.border = divBorder;
        this.columnSpan = expression4;
        this.disappearActions = list3;
        this.dynamicHeight = expression5;
        this.extensions = list4;
        this.focus = divFocus;
        this.functions = list5;
        this.hasSeparator = expression6;
        this.height = divSize;
        this.id = str;
        this.items = list6;
        this.layoutProvider = divLayoutProvider;
        this.margins = divEdgeInsets;
        this.paddings = divEdgeInsets2;
        this.restrictParentScroll = expression7;
        this.reuseId = expression8;
        this.rowSpan = expression9;
        this.selectedActions = list7;
        this.selectedTab = expression10;
        this.separatorColor = expression11;
        this.separatorPaddings = divEdgeInsets3;
        this.switchTabsByContentSwipeEnabled = expression12;
        this.tabTitleDelimiter = tabTitleDelimiter;
        this.tabTitleStyle = tabTitleStyle;
        this.titlePaddings = divEdgeInsets4;
        this.tooltips = list8;
        this.transform = divTransform;
        this.transitionChange = divChangeTransition;
        this.transitionIn = divAppearanceTransition;
        this.transitionOut = divAppearanceTransition2;
        this.transitionTriggers = list9;
        this.variableTriggers = list10;
        this.variables = list11;
        this.visibility = expression13;
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
        int hashCode = Reflection.getOrCreateKotlinClass(DivTabs.class).hashCode();
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
        int hashCode5 = hashCode4 + i3 + this.dynamicHeight.hashCode();
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
        int i13 = hashCode5 + i4;
        DivFocus focus = getFocus();
        int hash3 = i13 + (focus != null ? focus.hash() : 0);
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
        int hashCode6 = hash3 + i5 + this.hasSeparator.hashCode() + getHeight().hash();
        String id = getId();
        int hashCode7 = hashCode6 + (id != null ? id.hashCode() : 0);
        DivLayoutProvider layoutProvider = getLayoutProvider();
        int hash4 = hashCode7 + (layoutProvider != null ? layoutProvider.hash() : 0);
        DivEdgeInsets margins = getMargins();
        int hash5 = hash4 + (margins != null ? margins.hash() : 0);
        DivEdgeInsets paddings = getPaddings();
        int hash6 = hash5 + (paddings != null ? paddings.hash() : 0) + this.restrictParentScroll.hashCode();
        Expression reuseId = getReuseId();
        int hashCode8 = hash6 + (reuseId != null ? reuseId.hashCode() : 0);
        Expression rowSpan = getRowSpan();
        int hashCode9 = hashCode8 + (rowSpan != null ? rowSpan.hashCode() : 0);
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
        int hashCode10 = hashCode9 + i6 + this.selectedTab.hashCode() + this.separatorColor.hashCode() + this.separatorPaddings.hash() + this.switchTabsByContentSwipeEnabled.hashCode();
        TabTitleDelimiter tabTitleDelimiter = this.tabTitleDelimiter;
        int hash7 = hashCode10 + (tabTitleDelimiter != null ? tabTitleDelimiter.hash() : 0);
        TabTitleStyle tabTitleStyle = this.tabTitleStyle;
        int hash8 = hash7 + (tabTitleStyle != null ? tabTitleStyle.hash() : 0) + this.titlePaddings.hash();
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
        int i14 = hash8 + i7;
        DivTransform transform = getTransform();
        int hash9 = i14 + (transform != null ? transform.hash() : 0);
        DivChangeTransition transitionChange = getTransitionChange();
        int hash10 = hash9 + (transitionChange != null ? transitionChange.hash() : 0);
        DivAppearanceTransition transitionIn = getTransitionIn();
        int hash11 = hash10 + (transitionIn != null ? transitionIn.hash() : 0);
        DivAppearanceTransition transitionOut = getTransitionOut();
        int hash12 = hash11 + (transitionOut != null ? transitionOut.hash() : 0);
        List transitionTriggers = getTransitionTriggers();
        int hashCode11 = hash12 + (transitionTriggers != null ? transitionTriggers.hashCode() : 0);
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
        int i15 = hashCode11 + i8;
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
        int hashCode12 = i15 + i9 + getVisibility().hashCode();
        DivVisibilityAction visibilityAction = getVisibilityAction();
        int hash13 = hashCode12 + (visibilityAction != null ? visibilityAction.hash() : 0);
        List visibilityActions = getVisibilityActions();
        if (visibilityActions != null) {
            Iterator it10 = visibilityActions.iterator();
            while (it10.hasNext()) {
                i10 += ((DivVisibilityAction) it10.next()).hash();
            }
        }
        int hash14 = hash13 + i10 + getWidth().hash();
        this._propertiesHash = Integer.valueOf(hash14);
        return hash14;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int propertiesHash = propertiesHash();
        Iterator it = this.items.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Item) it.next()).hash();
        }
        int i2 = propertiesHash + i;
        this._hash = Integer.valueOf(i2);
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:356:0x066b, code lost:
    
        if (r9.getVisibilityActions() == null) goto L451;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x05f3, code lost:
    
        if (r9.getVariables() == null) goto L418;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x05a7, code lost:
    
        if (r9.getVariableTriggers() == null) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x055b, code lost:
    
        if (r9.getTransitionTriggers() == null) goto L372;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x04a6, code lost:
    
        if (r9.getTooltips() == null) goto L314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x03ce, code lost:
    
        if (r9.getSelectedActions() == null) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x0266, code lost:
    
        if (r9.getFunctions() == null) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x0200, code lost:
    
        if (r9.getExtensions() == null) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x019a, code lost:
    
        if (r9.getDisappearActions() == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x0112, code lost:
    
        if (r9.getBackground() == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x00c6, code lost:
    
        if (r9.getAnimators() == null) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:439:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(DivTabs divTabs, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
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
        if (divTabs == null) {
            return false;
        }
        DivAccessibility accessibility = getAccessibility();
        if (!(accessibility != null ? accessibility.equals(divTabs.getAccessibility(), expressionResolver, expressionResolver2) : divTabs.getAccessibility() == null)) {
            return false;
        }
        Expression alignmentHorizontal = getAlignmentHorizontal();
        DivAlignmentHorizontal divAlignmentHorizontal = alignmentHorizontal != null ? (DivAlignmentHorizontal) alignmentHorizontal.evaluate(expressionResolver) : null;
        Expression alignmentHorizontal2 = divTabs.getAlignmentHorizontal();
        if (divAlignmentHorizontal != (alignmentHorizontal2 != null ? (DivAlignmentHorizontal) alignmentHorizontal2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression alignmentVertical = getAlignmentVertical();
        DivAlignmentVertical divAlignmentVertical = alignmentVertical != null ? (DivAlignmentVertical) alignmentVertical.evaluate(expressionResolver) : null;
        Expression alignmentVertical2 = divTabs.getAlignmentVertical();
        if (divAlignmentVertical != (alignmentVertical2 != null ? (DivAlignmentVertical) alignmentVertical2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        if (!(((Number) getAlpha().evaluate(expressionResolver)).doubleValue() == ((Number) divTabs.getAlpha().evaluate(expressionResolver2)).doubleValue())) {
            return false;
        }
        List animators = getAnimators();
        if (animators != null) {
            List animators2 = divTabs.getAnimators();
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
            List background2 = divTabs.getBackground();
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
        if (!(border != null ? border.equals(divTabs.getBorder(), expressionResolver, expressionResolver2) : divTabs.getBorder() == null)) {
            return false;
        }
        Expression columnSpan = getColumnSpan();
        Long l = columnSpan != null ? (Long) columnSpan.evaluate(expressionResolver) : null;
        Expression columnSpan2 = divTabs.getColumnSpan();
        if (!Intrinsics.areEqual(l, columnSpan2 != null ? (Long) columnSpan2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List disappearActions = getDisappearActions();
        if (disappearActions != null) {
            List disappearActions2 = divTabs.getDisappearActions();
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
        if (!z3 || ((Boolean) this.dynamicHeight.evaluate(expressionResolver)).booleanValue() != ((Boolean) divTabs.dynamicHeight.evaluate(expressionResolver2)).booleanValue()) {
            return false;
        }
        List extensions = getExtensions();
        if (extensions != null) {
            List extensions2 = divTabs.getExtensions();
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
        if (!(focus != null ? focus.equals(divTabs.getFocus(), expressionResolver, expressionResolver2) : divTabs.getFocus() == null)) {
            return false;
        }
        List functions = getFunctions();
        if (functions != null) {
            List functions2 = divTabs.getFunctions();
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
        if (!z5 || ((Boolean) this.hasSeparator.evaluate(expressionResolver)).booleanValue() != ((Boolean) divTabs.hasSeparator.evaluate(expressionResolver2)).booleanValue() || !getHeight().equals(divTabs.getHeight(), expressionResolver, expressionResolver2) || !Intrinsics.areEqual(getId(), divTabs.getId())) {
            return false;
        }
        List list = this.items;
        List list2 = divTabs.items;
        if (list.size() == list2.size()) {
            int i11 = 0;
            for (Object obj6 : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                if (((Item) obj6).equals((Item) list2.get(i11), expressionResolver, expressionResolver2)) {
                    i11 = i12;
                }
            }
            z6 = true;
            if (z6) {
                return false;
            }
            DivLayoutProvider layoutProvider = getLayoutProvider();
            if (!(layoutProvider != null ? layoutProvider.equals(divTabs.getLayoutProvider(), expressionResolver, expressionResolver2) : divTabs.getLayoutProvider() == null)) {
                return false;
            }
            DivEdgeInsets margins = getMargins();
            if (!(margins != null ? margins.equals(divTabs.getMargins(), expressionResolver, expressionResolver2) : divTabs.getMargins() == null)) {
                return false;
            }
            DivEdgeInsets paddings = getPaddings();
            if (!(paddings != null ? paddings.equals(divTabs.getPaddings(), expressionResolver, expressionResolver2) : divTabs.getPaddings() == null) || ((Boolean) this.restrictParentScroll.evaluate(expressionResolver)).booleanValue() != ((Boolean) divTabs.restrictParentScroll.evaluate(expressionResolver2)).booleanValue()) {
                return false;
            }
            Expression reuseId = getReuseId();
            String str = reuseId != null ? (String) reuseId.evaluate(expressionResolver) : null;
            Expression reuseId2 = divTabs.getReuseId();
            if (!Intrinsics.areEqual(str, reuseId2 != null ? (String) reuseId2.evaluate(expressionResolver2) : null)) {
                return false;
            }
            Expression rowSpan = getRowSpan();
            Long l2 = rowSpan != null ? (Long) rowSpan.evaluate(expressionResolver) : null;
            Expression rowSpan2 = divTabs.getRowSpan();
            if (!Intrinsics.areEqual(l2, rowSpan2 != null ? (Long) rowSpan2.evaluate(expressionResolver2) : null)) {
                return false;
            }
            List selectedActions = getSelectedActions();
            if (selectedActions != null) {
                List selectedActions2 = divTabs.getSelectedActions();
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
            if (!z7 || ((Number) this.selectedTab.evaluate(expressionResolver)).longValue() != ((Number) divTabs.selectedTab.evaluate(expressionResolver2)).longValue() || ((Number) this.separatorColor.evaluate(expressionResolver)).intValue() != ((Number) divTabs.separatorColor.evaluate(expressionResolver2)).intValue() || !this.separatorPaddings.equals(divTabs.separatorPaddings, expressionResolver, expressionResolver2) || ((Boolean) this.switchTabsByContentSwipeEnabled.evaluate(expressionResolver)).booleanValue() != ((Boolean) divTabs.switchTabsByContentSwipeEnabled.evaluate(expressionResolver2)).booleanValue()) {
                return false;
            }
            TabTitleDelimiter tabTitleDelimiter = this.tabTitleDelimiter;
            if (!(tabTitleDelimiter != null ? tabTitleDelimiter.equals(divTabs.tabTitleDelimiter, expressionResolver, expressionResolver2) : divTabs.tabTitleDelimiter == null)) {
                return false;
            }
            TabTitleStyle tabTitleStyle = this.tabTitleStyle;
            if (!(tabTitleStyle != null ? tabTitleStyle.equals(divTabs.tabTitleStyle, expressionResolver, expressionResolver2) : divTabs.tabTitleStyle == null) || !this.titlePaddings.equals(divTabs.titlePaddings, expressionResolver, expressionResolver2)) {
                return false;
            }
            List tooltips = getTooltips();
            if (tooltips != null) {
                List tooltips2 = divTabs.getTooltips();
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
            if (!(transform != null ? transform.equals(divTabs.getTransform(), expressionResolver, expressionResolver2) : divTabs.getTransform() == null)) {
                return false;
            }
            DivChangeTransition transitionChange = getTransitionChange();
            if (!(transitionChange != null ? transitionChange.equals(divTabs.getTransitionChange(), expressionResolver, expressionResolver2) : divTabs.getTransitionChange() == null)) {
                return false;
            }
            DivAppearanceTransition transitionIn = getTransitionIn();
            if (!(transitionIn != null ? transitionIn.equals(divTabs.getTransitionIn(), expressionResolver, expressionResolver2) : divTabs.getTransitionIn() == null)) {
                return false;
            }
            DivAppearanceTransition transitionOut = getTransitionOut();
            if (!(transitionOut != null ? transitionOut.equals(divTabs.getTransitionOut(), expressionResolver, expressionResolver2) : divTabs.getTransitionOut() == null)) {
                return false;
            }
            List transitionTriggers = getTransitionTriggers();
            if (transitionTriggers != null) {
                List transitionTriggers2 = divTabs.getTransitionTriggers();
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
                List variableTriggers2 = divTabs.getVariableTriggers();
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
                List variables2 = divTabs.getVariables();
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
            if (!z11 || getVisibility().evaluate(expressionResolver) != divTabs.getVisibility().evaluate(expressionResolver2)) {
                return false;
            }
            DivVisibilityAction visibilityAction = getVisibilityAction();
            if (!(visibilityAction != null ? visibilityAction.equals(divTabs.getVisibilityAction(), expressionResolver, expressionResolver2) : divTabs.getVisibilityAction() == null)) {
                return false;
            }
            List visibilityActions = getVisibilityActions();
            if (visibilityActions != null) {
                List visibilityActions2 = divTabs.getVisibilityActions();
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
            return z12 && getWidth().equals(divTabs.getWidth(), expressionResolver, expressionResolver2);
        }
        z6 = false;
        if (z6) {
        }
    }

    public static /* synthetic */ DivTabs copy$default(DivTabs divTabs, DivAccessibility divAccessibility, Expression expression, Expression expression2, Expression expression3, List list, List list2, DivBorder divBorder, Expression expression4, List list3, Expression expression5, List list4, DivFocus divFocus, List list5, Expression expression6, DivSize divSize, String str, List list6, DivLayoutProvider divLayoutProvider, DivEdgeInsets divEdgeInsets, DivEdgeInsets divEdgeInsets2, Expression expression7, Expression expression8, Expression expression9, List list7, Expression expression10, Expression expression11, DivEdgeInsets divEdgeInsets3, Expression expression12, TabTitleDelimiter tabTitleDelimiter, TabTitleStyle tabTitleStyle, DivEdgeInsets divEdgeInsets4, List list8, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list9, List list10, List list11, Expression expression13, DivVisibilityAction divVisibilityAction, List list12, DivSize divSize2, int i, int i2, Object obj) {
        DivAccessibility accessibility = (i & 1) != 0 ? divTabs.getAccessibility() : divAccessibility;
        Expression alignmentHorizontal = (i & 2) != 0 ? divTabs.getAlignmentHorizontal() : expression;
        Expression alignmentVertical = (i & 4) != 0 ? divTabs.getAlignmentVertical() : expression2;
        Expression alpha = (i & 8) != 0 ? divTabs.getAlpha() : expression3;
        List animators = (i & 16) != 0 ? divTabs.getAnimators() : list;
        List background = (i & 32) != 0 ? divTabs.getBackground() : list2;
        DivBorder border = (i & 64) != 0 ? divTabs.getBorder() : divBorder;
        Expression columnSpan = (i & 128) != 0 ? divTabs.getColumnSpan() : expression4;
        List disappearActions = (i & 256) != 0 ? divTabs.getDisappearActions() : list3;
        Expression expression14 = (i & 512) != 0 ? divTabs.dynamicHeight : expression5;
        List extensions = (i & 1024) != 0 ? divTabs.getExtensions() : list4;
        DivFocus focus = (i & 2048) != 0 ? divTabs.getFocus() : divFocus;
        List functions = (i & 4096) != 0 ? divTabs.getFunctions() : list5;
        Expression expression15 = (i & 8192) != 0 ? divTabs.hasSeparator : expression6;
        DivSize height = (i & 16384) != 0 ? divTabs.getHeight() : divSize;
        String id = (i & 32768) != 0 ? divTabs.getId() : str;
        DivSize divSize3 = height;
        List list13 = (i & 65536) != 0 ? divTabs.items : list6;
        return divTabs.copy(accessibility, alignmentHorizontal, alignmentVertical, alpha, animators, background, border, columnSpan, disappearActions, expression14, extensions, focus, functions, expression15, divSize3, id, list13, (i & 131072) != 0 ? divTabs.getLayoutProvider() : divLayoutProvider, (i & 262144) != 0 ? divTabs.getMargins() : divEdgeInsets, (i & 524288) != 0 ? divTabs.getPaddings() : divEdgeInsets2, (i & 1048576) != 0 ? divTabs.restrictParentScroll : expression7, (i & 2097152) != 0 ? divTabs.getReuseId() : expression8, (i & 4194304) != 0 ? divTabs.getRowSpan() : expression9, (i & 8388608) != 0 ? divTabs.getSelectedActions() : list7, (i & 16777216) != 0 ? divTabs.selectedTab : expression10, (i & 33554432) != 0 ? divTabs.separatorColor : expression11, (i & 67108864) != 0 ? divTabs.separatorPaddings : divEdgeInsets3, (i & 134217728) != 0 ? divTabs.switchTabsByContentSwipeEnabled : expression12, (i & 268435456) != 0 ? divTabs.tabTitleDelimiter : tabTitleDelimiter, (i & 536870912) != 0 ? divTabs.tabTitleStyle : tabTitleStyle, (i & 1073741824) != 0 ? divTabs.titlePaddings : divEdgeInsets4, (i & Integer.MIN_VALUE) != 0 ? divTabs.getTooltips() : list8, (i2 & 1) != 0 ? divTabs.getTransform() : divTransform, (i2 & 2) != 0 ? divTabs.getTransitionChange() : divChangeTransition, (i2 & 4) != 0 ? divTabs.getTransitionIn() : divAppearanceTransition, (i2 & 8) != 0 ? divTabs.getTransitionOut() : divAppearanceTransition2, (i2 & 16) != 0 ? divTabs.getTransitionTriggers() : list9, (i2 & 32) != 0 ? divTabs.getVariableTriggers() : list10, (i2 & 64) != 0 ? divTabs.getVariables() : list11, (i2 & 128) != 0 ? divTabs.getVisibility() : expression13, (i2 & 256) != 0 ? divTabs.getVisibilityAction() : divVisibilityAction, (i2 & 512) != 0 ? divTabs.getVisibilityActions() : list12, (i2 & 1024) != 0 ? divTabs.getWidth() : divSize2);
    }

    public final DivTabs copy(DivAccessibility divAccessibility, Expression expression, Expression expression2, Expression expression3, List list, List list2, DivBorder divBorder, Expression expression4, List list3, Expression expression5, List list4, DivFocus divFocus, List list5, Expression expression6, DivSize divSize, String str, List list6, DivLayoutProvider divLayoutProvider, DivEdgeInsets divEdgeInsets, DivEdgeInsets divEdgeInsets2, Expression expression7, Expression expression8, Expression expression9, List list7, Expression expression10, Expression expression11, DivEdgeInsets divEdgeInsets3, Expression expression12, TabTitleDelimiter tabTitleDelimiter, TabTitleStyle tabTitleStyle, DivEdgeInsets divEdgeInsets4, List list8, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list9, List list10, List list11, Expression expression13, DivVisibilityAction divVisibilityAction, List list12, DivSize divSize2) {
        return new DivTabs(divAccessibility, expression, expression2, expression3, list, list2, divBorder, expression4, list3, expression5, list4, divFocus, list5, expression6, divSize, str, list6, divLayoutProvider, divEdgeInsets, divEdgeInsets2, expression7, expression8, expression9, list7, expression10, expression11, divEdgeInsets3, expression12, tabTitleDelimiter, tabTitleStyle, divEdgeInsets4, list8, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, list9, list10, list11, expression13, divVisibilityAction, list12, divSize2);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivTabsJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTabsJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivTabs.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivTabs fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivTabsJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTabsJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.INSTANCE;
        ALPHA_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        Boolean bool = Boolean.FALSE;
        DYNAMIC_HEIGHT_DEFAULT_VALUE = Expression.Companion.constant$default(companion, bool, null, 2, null);
        HAS_SEPARATOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, bool, null, 2, null);
        HEIGHT_DEFAULT_VALUE = new DivSize.WrapContent(new DivWrapContentSize(null, null, null, 7, null));
        RESTRICT_PARENT_SCROLL_DEFAULT_VALUE = Expression.Companion.constant$default(companion, bool, null, 2, null);
        SELECTED_TAB_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        SEPARATOR_COLOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Integer.valueOf(DivSeparatorView.DEFAULT_DIVIDER_COLOR), null, 2, null);
        int i = 82;
        DefaultConstructorMarker defaultConstructorMarker = null;
        Expression expression = null;
        Expression expression2 = null;
        SEPARATOR_PADDINGS_DEFAULT_VALUE = new DivEdgeInsets(Expression.Companion.constant$default(companion, 0L, null, 2, null), expression, Expression.Companion.constant$default(companion, 12L, null, 2, null), Expression.Companion.constant$default(companion, 12L, null, 2, null), null == true ? 1 : 0, Expression.Companion.constant$default(companion, 0L, null, 2, null), expression2, i, defaultConstructorMarker);
        SWITCH_TABS_BY_CONTENT_SWIPE_ENABLED_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        TITLE_PADDINGS_DEFAULT_VALUE = new DivEdgeInsets(Expression.Companion.constant$default(companion, 8L, null, 2, null), expression, Expression.Companion.constant$default(companion, 12L, null, 2, null), Expression.Companion.constant$default(companion, 12L, null, 2, null), null == true ? 1 : 0, Expression.Companion.constant$default(companion, 0L, null, 2, null), expression2, i, defaultConstructorMarker);
        VISIBILITY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        WIDTH_DEFAULT_VALUE = new DivSize.MatchParent(new DivMatchParentSize(null, null, null, 7, null));
        CREATOR = new Function2() { // from class: com.yandex.div2.DivTabs$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivTabs invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivTabs.Companion.fromJson(parsingEnvironment, jSONObject);
            }
        };
    }

    /* compiled from: DivTabs.kt */
    public static final class TabTitleStyle implements JSONSerializable, Hashable {
        private static final Expression ACTIVE_BACKGROUND_COLOR_DEFAULT_VALUE;
        private static final Expression ACTIVE_TEXT_COLOR_DEFAULT_VALUE;
        private static final Expression ANIMATION_DURATION_DEFAULT_VALUE;
        private static final Expression ANIMATION_TYPE_DEFAULT_VALUE;
        private static final Function2 CREATOR;
        public static final Companion Companion = new Companion(null);
        private static final Expression FONT_SIZE_DEFAULT_VALUE;
        private static final Expression FONT_SIZE_UNIT_DEFAULT_VALUE;
        private static final Expression FONT_WEIGHT_DEFAULT_VALUE;
        private static final Expression INACTIVE_TEXT_COLOR_DEFAULT_VALUE;
        private static final Expression ITEM_SPACING_DEFAULT_VALUE;
        private static final Expression LETTER_SPACING_DEFAULT_VALUE;
        private static final DivEdgeInsets PADDINGS_DEFAULT_VALUE;
        private Integer _hash;
        public final Expression activeBackgroundColor;
        public final Expression activeFontVariationSettings;
        public final Expression activeFontWeight;
        public final Expression activeTextColor;
        public final Expression animationDuration;
        public final Expression animationType;
        public final Expression cornerRadius;
        public final DivCornersRadius cornersRadius;
        public final Expression fontFamily;
        public final Expression fontSize;
        public final Expression fontSizeUnit;
        public final Expression fontWeight;
        public final Expression inactiveBackgroundColor;
        public final Expression inactiveFontVariationSettings;
        public final Expression inactiveFontWeight;
        public final Expression inactiveTextColor;
        public final Expression itemSpacing;
        public final Expression letterSpacing;
        public final Expression lineHeight;
        public final DivEdgeInsets paddings;

        public TabTitleStyle(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5, Expression expression6, Expression expression7, DivCornersRadius divCornersRadius, Expression expression8, Expression expression9, Expression expression10, Expression expression11, Expression expression12, Expression expression13, Expression expression14, Expression expression15, Expression expression16, Expression expression17, Expression expression18, DivEdgeInsets divEdgeInsets) {
            this.activeBackgroundColor = expression;
            this.activeFontVariationSettings = expression2;
            this.activeFontWeight = expression3;
            this.activeTextColor = expression4;
            this.animationDuration = expression5;
            this.animationType = expression6;
            this.cornerRadius = expression7;
            this.cornersRadius = divCornersRadius;
            this.fontFamily = expression8;
            this.fontSize = expression9;
            this.fontSizeUnit = expression10;
            this.fontWeight = expression11;
            this.inactiveBackgroundColor = expression12;
            this.inactiveFontVariationSettings = expression13;
            this.inactiveFontWeight = expression14;
            this.inactiveTextColor = expression15;
            this.itemSpacing = expression16;
            this.letterSpacing = expression17;
            this.lineHeight = expression18;
            this.paddings = divEdgeInsets;
        }

        public /* synthetic */ TabTitleStyle(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5, Expression expression6, Expression expression7, DivCornersRadius divCornersRadius, Expression expression8, Expression expression9, Expression expression10, Expression expression11, Expression expression12, Expression expression13, Expression expression14, Expression expression15, Expression expression16, Expression expression17, Expression expression18, DivEdgeInsets divEdgeInsets, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ACTIVE_BACKGROUND_COLOR_DEFAULT_VALUE : expression, (i & 2) != 0 ? null : expression2, (i & 4) != 0 ? null : expression3, (i & 8) != 0 ? ACTIVE_TEXT_COLOR_DEFAULT_VALUE : expression4, (i & 16) != 0 ? ANIMATION_DURATION_DEFAULT_VALUE : expression5, (i & 32) != 0 ? ANIMATION_TYPE_DEFAULT_VALUE : expression6, (i & 64) != 0 ? null : expression7, (i & 128) != 0 ? null : divCornersRadius, (i & 256) != 0 ? null : expression8, (i & 512) != 0 ? FONT_SIZE_DEFAULT_VALUE : expression9, (i & 1024) != 0 ? FONT_SIZE_UNIT_DEFAULT_VALUE : expression10, (i & 2048) != 0 ? FONT_WEIGHT_DEFAULT_VALUE : expression11, (i & 4096) != 0 ? null : expression12, (i & 8192) != 0 ? null : expression13, (i & 16384) != 0 ? null : expression14, (i & 32768) != 0 ? INACTIVE_TEXT_COLOR_DEFAULT_VALUE : expression15, (i & 65536) != 0 ? ITEM_SPACING_DEFAULT_VALUE : expression16, (i & 131072) != 0 ? LETTER_SPACING_DEFAULT_VALUE : expression17, (i & 262144) != 0 ? null : expression18, (i & 524288) != 0 ? PADDINGS_DEFAULT_VALUE : divEdgeInsets);
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this._hash;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = Reflection.getOrCreateKotlinClass(TabTitleStyle.class).hashCode() + this.activeBackgroundColor.hashCode();
            Expression expression = this.activeFontVariationSettings;
            int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0);
            Expression expression2 = this.activeFontWeight;
            int hashCode3 = hashCode2 + (expression2 != null ? expression2.hashCode() : 0) + this.activeTextColor.hashCode() + this.animationDuration.hashCode() + this.animationType.hashCode();
            Expression expression3 = this.cornerRadius;
            int hashCode4 = hashCode3 + (expression3 != null ? expression3.hashCode() : 0);
            DivCornersRadius divCornersRadius = this.cornersRadius;
            int hash = hashCode4 + (divCornersRadius != null ? divCornersRadius.hash() : 0);
            Expression expression4 = this.fontFamily;
            int hashCode5 = hash + (expression4 != null ? expression4.hashCode() : 0) + this.fontSize.hashCode() + this.fontSizeUnit.hashCode() + this.fontWeight.hashCode();
            Expression expression5 = this.inactiveBackgroundColor;
            int hashCode6 = hashCode5 + (expression5 != null ? expression5.hashCode() : 0);
            Expression expression6 = this.inactiveFontVariationSettings;
            int hashCode7 = hashCode6 + (expression6 != null ? expression6.hashCode() : 0);
            Expression expression7 = this.inactiveFontWeight;
            int hashCode8 = hashCode7 + (expression7 != null ? expression7.hashCode() : 0) + this.inactiveTextColor.hashCode() + this.itemSpacing.hashCode() + this.letterSpacing.hashCode();
            Expression expression8 = this.lineHeight;
            int hashCode9 = hashCode8 + (expression8 != null ? expression8.hashCode() : 0) + this.paddings.hash();
            this._hash = Integer.valueOf(hashCode9);
            return hashCode9;
        }

        public final boolean equals(TabTitleStyle tabTitleStyle, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            if (tabTitleStyle == null || ((Number) this.activeBackgroundColor.evaluate(expressionResolver)).intValue() != ((Number) tabTitleStyle.activeBackgroundColor.evaluate(expressionResolver2)).intValue()) {
                return false;
            }
            Expression expression = this.activeFontVariationSettings;
            JSONObject jSONObject = expression != null ? (JSONObject) expression.evaluate(expressionResolver) : null;
            Expression expression2 = tabTitleStyle.activeFontVariationSettings;
            if (!Intrinsics.areEqual(jSONObject, expression2 != null ? (JSONObject) expression2.evaluate(expressionResolver2) : null)) {
                return false;
            }
            Expression expression3 = this.activeFontWeight;
            DivFontWeight divFontWeight = expression3 != null ? (DivFontWeight) expression3.evaluate(expressionResolver) : null;
            Expression expression4 = tabTitleStyle.activeFontWeight;
            if (divFontWeight != (expression4 != null ? (DivFontWeight) expression4.evaluate(expressionResolver2) : null) || ((Number) this.activeTextColor.evaluate(expressionResolver)).intValue() != ((Number) tabTitleStyle.activeTextColor.evaluate(expressionResolver2)).intValue() || ((Number) this.animationDuration.evaluate(expressionResolver)).longValue() != ((Number) tabTitleStyle.animationDuration.evaluate(expressionResolver2)).longValue() || this.animationType.evaluate(expressionResolver) != tabTitleStyle.animationType.evaluate(expressionResolver2)) {
                return false;
            }
            Expression expression5 = this.cornerRadius;
            Long l = expression5 != null ? (Long) expression5.evaluate(expressionResolver) : null;
            Expression expression6 = tabTitleStyle.cornerRadius;
            if (!Intrinsics.areEqual(l, expression6 != null ? (Long) expression6.evaluate(expressionResolver2) : null)) {
                return false;
            }
            DivCornersRadius divCornersRadius = this.cornersRadius;
            if (!(divCornersRadius != null ? divCornersRadius.equals(tabTitleStyle.cornersRadius, expressionResolver, expressionResolver2) : tabTitleStyle.cornersRadius == null)) {
                return false;
            }
            Expression expression7 = this.fontFamily;
            String str = expression7 != null ? (String) expression7.evaluate(expressionResolver) : null;
            Expression expression8 = tabTitleStyle.fontFamily;
            if (!Intrinsics.areEqual(str, expression8 != null ? (String) expression8.evaluate(expressionResolver2) : null) || ((Number) this.fontSize.evaluate(expressionResolver)).longValue() != ((Number) tabTitleStyle.fontSize.evaluate(expressionResolver2)).longValue() || this.fontSizeUnit.evaluate(expressionResolver) != tabTitleStyle.fontSizeUnit.evaluate(expressionResolver2) || this.fontWeight.evaluate(expressionResolver) != tabTitleStyle.fontWeight.evaluate(expressionResolver2)) {
                return false;
            }
            Expression expression9 = this.inactiveBackgroundColor;
            Integer num = expression9 != null ? (Integer) expression9.evaluate(expressionResolver) : null;
            Expression expression10 = tabTitleStyle.inactiveBackgroundColor;
            if (!Intrinsics.areEqual(num, expression10 != null ? (Integer) expression10.evaluate(expressionResolver2) : null)) {
                return false;
            }
            Expression expression11 = this.inactiveFontVariationSettings;
            JSONObject jSONObject2 = expression11 != null ? (JSONObject) expression11.evaluate(expressionResolver) : null;
            Expression expression12 = tabTitleStyle.inactiveFontVariationSettings;
            if (!Intrinsics.areEqual(jSONObject2, expression12 != null ? (JSONObject) expression12.evaluate(expressionResolver2) : null)) {
                return false;
            }
            Expression expression13 = this.inactiveFontWeight;
            DivFontWeight divFontWeight2 = expression13 != null ? (DivFontWeight) expression13.evaluate(expressionResolver) : null;
            Expression expression14 = tabTitleStyle.inactiveFontWeight;
            if (divFontWeight2 != (expression14 != null ? (DivFontWeight) expression14.evaluate(expressionResolver2) : null) || ((Number) this.inactiveTextColor.evaluate(expressionResolver)).intValue() != ((Number) tabTitleStyle.inactiveTextColor.evaluate(expressionResolver2)).intValue() || ((Number) this.itemSpacing.evaluate(expressionResolver)).longValue() != ((Number) tabTitleStyle.itemSpacing.evaluate(expressionResolver2)).longValue()) {
                return false;
            }
            if (!(((Number) this.letterSpacing.evaluate(expressionResolver)).doubleValue() == ((Number) tabTitleStyle.letterSpacing.evaluate(expressionResolver2)).doubleValue())) {
                return false;
            }
            Expression expression15 = this.lineHeight;
            Long l2 = expression15 != null ? (Long) expression15.evaluate(expressionResolver) : null;
            Expression expression16 = tabTitleStyle.lineHeight;
            return Intrinsics.areEqual(l2, expression16 != null ? (Long) expression16.evaluate(expressionResolver2) : null) && this.paddings.equals(tabTitleStyle.paddings, expressionResolver, expressionResolver2);
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((DivTabsTabTitleStyleJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTabsTabTitleStyleJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        /* compiled from: DivTabs.kt */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final TabTitleStyle fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return ((DivTabsTabTitleStyleJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTabsTabTitleStyleJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
            }
        }

        static {
            Expression.Companion companion = Expression.INSTANCE;
            ACTIVE_BACKGROUND_COLOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, -9120, null, 2, null);
            ACTIVE_TEXT_COLOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, -872415232, null, 2, null);
            ANIMATION_DURATION_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 300L, null, 2, null);
            ANIMATION_TYPE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, AnimationType.SLIDE, null, 2, null);
            FONT_SIZE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 12L, null, 2, null);
            FONT_SIZE_UNIT_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivSizeUnit.SP, null, 2, null);
            FONT_WEIGHT_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivFontWeight.REGULAR, null, 2, null);
            INACTIVE_TEXT_COLOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Integer.MIN_VALUE, null, 2, null);
            ITEM_SPACING_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
            LETTER_SPACING_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
            PADDINGS_DEFAULT_VALUE = new DivEdgeInsets(Expression.Companion.constant$default(companion, 6L, null, 2, null), null, Expression.Companion.constant$default(companion, 8L, null, 2, null), Expression.Companion.constant$default(companion, 8L, null, 2, null), null, Expression.Companion.constant$default(companion, 6L, null, 2, null), null, 82, null);
            CREATOR = new Function2() { // from class: com.yandex.div2.DivTabs$TabTitleStyle$Companion$CREATOR$1
                @Override // kotlin.jvm.functions.Function2
                @NotNull
                public final DivTabs.TabTitleStyle invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                    return DivTabs.TabTitleStyle.Companion.fromJson(parsingEnvironment, jSONObject);
                }
            };
        }

        /* compiled from: DivTabs.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/yandex/div2/DivTabs$TabTitleStyle$AnimationType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "SLIDE", "FADE", "NONE", "Converter", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public enum AnimationType {
            SLIDE("slide"),
            FADE("fade"),
            NONE("none");


            @NotNull
            private final String value;

            /* renamed from: Converter, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            @NotNull
            public static final Function1 TO_STRING = new Function1() { // from class: com.yandex.div2.DivTabs$TabTitleStyle$AnimationType$Converter$TO_STRING$1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final String invoke(@NotNull DivTabs.TabTitleStyle.AnimationType animationType) {
                    return DivTabs.TabTitleStyle.AnimationType.INSTANCE.toString(animationType);
                }
            };

            @NotNull
            public static final Function1 FROM_STRING = new Function1() { // from class: com.yandex.div2.DivTabs$TabTitleStyle$AnimationType$Converter$FROM_STRING$1
                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final DivTabs.TabTitleStyle.AnimationType invoke(@NotNull String str) {
                    return DivTabs.TabTitleStyle.AnimationType.INSTANCE.fromString(str);
                }
            };

            AnimationType(String str) {
                this.value = str;
            }

            /* compiled from: DivTabs.kt */
            /* renamed from: com.yandex.div2.DivTabs$TabTitleStyle$AnimationType$Converter, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final String toString(AnimationType animationType) {
                    return animationType.value;
                }

                public final AnimationType fromString(String str) {
                    AnimationType animationType = AnimationType.SLIDE;
                    if (Intrinsics.areEqual(str, animationType.value)) {
                        return animationType;
                    }
                    AnimationType animationType2 = AnimationType.FADE;
                    if (Intrinsics.areEqual(str, animationType2.value)) {
                        return animationType2;
                    }
                    AnimationType animationType3 = AnimationType.NONE;
                    if (Intrinsics.areEqual(str, animationType3.value)) {
                        return animationType3;
                    }
                    return null;
                }
            }
        }
    }

    /* compiled from: DivTabs.kt */
    public static final class TabTitleDelimiter implements JSONSerializable, Hashable {
        private static final Function2 CREATOR;
        public static final Companion Companion = new Companion(null);
        private static final DivFixedSize HEIGHT_DEFAULT_VALUE;
        private static final DivFixedSize WIDTH_DEFAULT_VALUE;
        private Integer _hash;
        public final DivFixedSize height;
        public final Expression imageUrl;
        public final DivFixedSize width;

        public TabTitleDelimiter(DivFixedSize divFixedSize, Expression expression, DivFixedSize divFixedSize2) {
            this.height = divFixedSize;
            this.imageUrl = expression;
            this.width = divFixedSize2;
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this._hash;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = Reflection.getOrCreateKotlinClass(TabTitleDelimiter.class).hashCode() + this.height.hash() + this.imageUrl.hashCode() + this.width.hash();
            this._hash = Integer.valueOf(hashCode);
            return hashCode;
        }

        public final boolean equals(TabTitleDelimiter tabTitleDelimiter, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            return tabTitleDelimiter != null && this.height.equals(tabTitleDelimiter.height, expressionResolver, expressionResolver2) && Intrinsics.areEqual(this.imageUrl.evaluate(expressionResolver), tabTitleDelimiter.imageUrl.evaluate(expressionResolver2)) && this.width.equals(tabTitleDelimiter.width, expressionResolver, expressionResolver2);
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((DivTabsTabTitleDelimiterJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTabsTabTitleDelimiterJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        /* compiled from: DivTabs.kt */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final TabTitleDelimiter fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return ((DivTabsTabTitleDelimiterJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTabsTabTitleDelimiterJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Expression.Companion companion = Expression.INSTANCE;
            int i = 1;
            HEIGHT_DEFAULT_VALUE = new DivFixedSize(null == true ? 1 : 0, Expression.Companion.constant$default(companion, 12L, null, 2, null), i, null == true ? 1 : 0);
            WIDTH_DEFAULT_VALUE = new DivFixedSize(null == true ? 1 : 0, Expression.Companion.constant$default(companion, 12L, null, 2, null), i, null == true ? 1 : 0);
            CREATOR = new Function2() { // from class: com.yandex.div2.DivTabs$TabTitleDelimiter$Companion$CREATOR$1
                @Override // kotlin.jvm.functions.Function2
                @NotNull
                public final DivTabs.TabTitleDelimiter invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                    return DivTabs.TabTitleDelimiter.Companion.fromJson(parsingEnvironment, jSONObject);
                }
            };
        }
    }

    /* compiled from: DivTabs.kt */
    public static final class Item implements JSONSerializable, Hashable {
        private Integer _hash;
        public final Div div;
        public final Expression title;
        public final DivAction titleClickAction;
        public static final Companion Companion = new Companion(null);
        private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivTabs$Item$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivTabs.Item invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivTabs.Item.Companion.fromJson(parsingEnvironment, jSONObject);
            }
        };

        public Item(Div div, Expression expression, DivAction divAction) {
            this.div = div;
            this.title = expression;
            this.titleClickAction = divAction;
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this._hash;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = Reflection.getOrCreateKotlinClass(Item.class).hashCode() + this.div.hash() + this.title.hashCode();
            DivAction divAction = this.titleClickAction;
            int hash = hashCode + (divAction != null ? divAction.hash() : 0);
            this._hash = Integer.valueOf(hash);
            return hash;
        }

        public final boolean equals(Item item, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            if (item == null || !this.div.equals(item.div, expressionResolver, expressionResolver2) || !Intrinsics.areEqual(this.title.evaluate(expressionResolver), item.title.evaluate(expressionResolver2))) {
                return false;
            }
            DivAction divAction = this.titleClickAction;
            DivAction divAction2 = item.titleClickAction;
            return divAction != null ? divAction.equals(divAction2, expressionResolver, expressionResolver2) : divAction2 == null;
        }

        public static /* synthetic */ Item copy$default(Item item, Div div, Expression expression, DivAction divAction, int i, Object obj) {
            if ((i & 1) != 0) {
                div = item.div;
            }
            if ((i & 2) != 0) {
                expression = item.title;
            }
            if ((i & 4) != 0) {
                divAction = item.titleClickAction;
            }
            return item.copy(div, expression, divAction);
        }

        public final Item copy(Div div, Expression expression, DivAction divAction) {
            return new Item(div, expression, divAction);
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((DivTabsItemJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTabsItemJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        /* compiled from: DivTabs.kt */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Item fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return ((DivTabsItemJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTabsItemJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
            }
        }
    }
}
