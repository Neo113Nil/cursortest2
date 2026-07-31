package com.yandex.div2;

import com.pubmatic.sdk.omsdk.POBOMSDKLogConstants;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivGallery;
import com.yandex.div2.DivGalleryJsonParser;
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

/* compiled from: DivGallery.kt */
/* loaded from: classes.dex */
public final class DivGallery implements JSONSerializable, Hashable, DivBase {
    private static final Expression ALPHA_DEFAULT_VALUE;
    private static final Function2 CREATOR;
    private static final Expression CROSS_CONTENT_ALIGNMENT_DEFAULT_VALUE;
    public static final Companion Companion = new Companion(null);
    private static final Expression DEFAULT_ITEM_DEFAULT_VALUE;
    private static final DivSize.WrapContent HEIGHT_DEFAULT_VALUE;
    private static final Expression ITEM_SPACING_DEFAULT_VALUE;
    private static final Expression ORIENTATION_DEFAULT_VALUE;
    private static final Expression RESTRICT_PARENT_SCROLL_DEFAULT_VALUE;
    private static final Expression SCROLLBAR_DEFAULT_VALUE;
    private static final Expression SCROLL_MODE_DEFAULT_VALUE;
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
    public final Expression columnCount;
    private final Expression columnSpan;
    public final Expression crossContentAlignment;
    public final Expression crossSpacing;
    public final Expression defaultItem;
    private final List disappearActions;
    private final List extensions;
    private final DivFocus focus;
    private final List functions;
    private final DivSize height;
    private final String id;
    public final DivCollectionItemBuilder itemBuilder;
    public final Expression itemSpacing;
    public final List items;
    private final DivLayoutProvider layoutProvider;
    private final DivEdgeInsets margins;
    public final Expression orientation;
    private final DivEdgeInsets paddings;
    public final Expression restrictParentScroll;
    private final Expression reuseId;
    private final Expression rowSpan;
    public final Expression scrollMode;
    public final Expression scrollbar;
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

    public DivGallery(DivAccessibility divAccessibility, Expression expression, Expression expression2, Expression expression3, List list, List list2, DivBorder divBorder, Expression expression4, Expression expression5, Expression expression6, Expression expression7, Expression expression8, List list3, List list4, DivFocus divFocus, List list5, DivSize divSize, String str, DivCollectionItemBuilder divCollectionItemBuilder, Expression expression9, List list6, DivLayoutProvider divLayoutProvider, DivEdgeInsets divEdgeInsets, Expression expression10, DivEdgeInsets divEdgeInsets2, Expression expression11, Expression expression12, Expression expression13, Expression expression14, Expression expression15, List list7, List list8, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list9, List list10, List list11, Expression expression16, DivVisibilityAction divVisibilityAction, List list12, DivSize divSize2) {
        this.accessibility = divAccessibility;
        this.alignmentHorizontal = expression;
        this.alignmentVertical = expression2;
        this.alpha = expression3;
        this.animators = list;
        this.background = list2;
        this.border = divBorder;
        this.columnCount = expression4;
        this.columnSpan = expression5;
        this.crossContentAlignment = expression6;
        this.crossSpacing = expression7;
        this.defaultItem = expression8;
        this.disappearActions = list3;
        this.extensions = list4;
        this.focus = divFocus;
        this.functions = list5;
        this.height = divSize;
        this.id = str;
        this.itemBuilder = divCollectionItemBuilder;
        this.itemSpacing = expression9;
        this.items = list6;
        this.layoutProvider = divLayoutProvider;
        this.margins = divEdgeInsets;
        this.orientation = expression10;
        this.paddings = divEdgeInsets2;
        this.restrictParentScroll = expression11;
        this.reuseId = expression12;
        this.rowSpan = expression13;
        this.scrollMode = expression14;
        this.scrollbar = expression15;
        this.selectedActions = list7;
        this.tooltips = list8;
        this.transform = divTransform;
        this.transitionChange = divChangeTransition;
        this.transitionIn = divAppearanceTransition;
        this.transitionOut = divAppearanceTransition2;
        this.transitionTriggers = list9;
        this.variableTriggers = list10;
        this.variables = list11;
        this.visibility = expression16;
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
        int hashCode = Reflection.getOrCreateKotlinClass(DivGallery.class).hashCode();
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
        Expression expression = this.columnCount;
        int hashCode4 = hash2 + (expression != null ? expression.hashCode() : 0);
        Expression columnSpan = getColumnSpan();
        int hashCode5 = hashCode4 + (columnSpan != null ? columnSpan.hashCode() : 0) + this.crossContentAlignment.hashCode();
        Expression expression2 = this.crossSpacing;
        int hashCode6 = hashCode5 + (expression2 != null ? expression2.hashCode() : 0) + this.defaultItem.hashCode();
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
        int i13 = hashCode6 + i3;
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
        int hashCode7 = hash4 + (id != null ? id.hashCode() : 0);
        DivCollectionItemBuilder divCollectionItemBuilder = this.itemBuilder;
        int hash5 = hashCode7 + (divCollectionItemBuilder != null ? divCollectionItemBuilder.hash() : 0) + this.itemSpacing.hashCode();
        DivLayoutProvider layoutProvider = getLayoutProvider();
        int hash6 = hash5 + (layoutProvider != null ? layoutProvider.hash() : 0);
        DivEdgeInsets margins = getMargins();
        int hash7 = hash6 + (margins != null ? margins.hash() : 0) + this.orientation.hashCode();
        DivEdgeInsets paddings = getPaddings();
        int hash8 = hash7 + (paddings != null ? paddings.hash() : 0) + this.restrictParentScroll.hashCode();
        Expression reuseId = getReuseId();
        int hashCode8 = hash8 + (reuseId != null ? reuseId.hashCode() : 0);
        Expression rowSpan = getRowSpan();
        int hashCode9 = hashCode8 + (rowSpan != null ? rowSpan.hashCode() : 0) + this.scrollMode.hashCode() + this.scrollbar.hashCode();
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
        int i15 = hashCode9 + i6;
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
        int hash9 = i16 + (transform != null ? transform.hash() : 0);
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
            Iterator it8 = variableTriggers.iterator();
            i8 = 0;
            while (it8.hasNext()) {
                i8 += ((DivTrigger) it8.next()).hash();
            }
        } else {
            i8 = 0;
        }
        int i17 = hashCode10 + i8;
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
        int hashCode11 = i17 + i9 + getVisibility().hashCode();
        DivVisibilityAction visibilityAction = getVisibilityAction();
        int hash13 = hashCode11 + (visibilityAction != null ? visibilityAction.hash() : 0);
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

    /* JADX WARN: Code restructure failed: missing block: B:382:0x0675, code lost:
    
        if (r9.getVisibilityActions() == null) goto L469;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x05fd, code lost:
    
        if (r9.getVariables() == null) goto L436;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x05b1, code lost:
    
        if (r9.getVariableTriggers() == null) goto L413;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x0565, code lost:
    
        if (r9.getTransitionTriggers() == null) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x04b0, code lost:
    
        if (r9.getTooltips() == null) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x0464, code lost:
    
        if (r9.getSelectedActions() == null) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x0344, code lost:
    
        if (r9.items == null) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x02b2, code lost:
    
        if (r9.getFunctions() == null) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x024c, code lost:
    
        if (r9.getExtensions() == null) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x0200, code lost:
    
        if (r9.getDisappearActions() == null) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x0112, code lost:
    
        if (r9.getBackground() == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x00c6, code lost:
    
        if (r9.getAnimators() == null) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(DivGallery divGallery, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
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
        if (divGallery == null) {
            return false;
        }
        DivAccessibility accessibility = getAccessibility();
        if (!(accessibility != null ? accessibility.equals(divGallery.getAccessibility(), expressionResolver, expressionResolver2) : divGallery.getAccessibility() == null)) {
            return false;
        }
        Expression alignmentHorizontal = getAlignmentHorizontal();
        DivAlignmentHorizontal divAlignmentHorizontal = alignmentHorizontal != null ? (DivAlignmentHorizontal) alignmentHorizontal.evaluate(expressionResolver) : null;
        Expression alignmentHorizontal2 = divGallery.getAlignmentHorizontal();
        if (divAlignmentHorizontal != (alignmentHorizontal2 != null ? (DivAlignmentHorizontal) alignmentHorizontal2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression alignmentVertical = getAlignmentVertical();
        DivAlignmentVertical divAlignmentVertical = alignmentVertical != null ? (DivAlignmentVertical) alignmentVertical.evaluate(expressionResolver) : null;
        Expression alignmentVertical2 = divGallery.getAlignmentVertical();
        if (divAlignmentVertical != (alignmentVertical2 != null ? (DivAlignmentVertical) alignmentVertical2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        if (!(((Number) getAlpha().evaluate(expressionResolver)).doubleValue() == ((Number) divGallery.getAlpha().evaluate(expressionResolver2)).doubleValue())) {
            return false;
        }
        List animators = getAnimators();
        if (animators != null) {
            List animators2 = divGallery.getAnimators();
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
            List background2 = divGallery.getBackground();
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
        if (!(border != null ? border.equals(divGallery.getBorder(), expressionResolver, expressionResolver2) : divGallery.getBorder() == null)) {
            return false;
        }
        Expression expression = this.columnCount;
        Long l = expression != null ? (Long) expression.evaluate(expressionResolver) : null;
        Expression expression2 = divGallery.columnCount;
        if (!Intrinsics.areEqual(l, expression2 != null ? (Long) expression2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression columnSpan = getColumnSpan();
        Long l2 = columnSpan != null ? (Long) columnSpan.evaluate(expressionResolver) : null;
        Expression columnSpan2 = divGallery.getColumnSpan();
        if (!Intrinsics.areEqual(l2, columnSpan2 != null ? (Long) columnSpan2.evaluate(expressionResolver2) : null) || this.crossContentAlignment.evaluate(expressionResolver) != divGallery.crossContentAlignment.evaluate(expressionResolver2)) {
            return false;
        }
        Expression expression3 = this.crossSpacing;
        Long l3 = expression3 != null ? (Long) expression3.evaluate(expressionResolver) : null;
        Expression expression4 = divGallery.crossSpacing;
        if (!Intrinsics.areEqual(l3, expression4 != null ? (Long) expression4.evaluate(expressionResolver2) : null) || ((Number) this.defaultItem.evaluate(expressionResolver)).longValue() != ((Number) divGallery.defaultItem.evaluate(expressionResolver2)).longValue()) {
            return false;
        }
        List disappearActions = getDisappearActions();
        if (disappearActions != null) {
            List disappearActions2 = divGallery.getDisappearActions();
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
            List extensions2 = divGallery.getExtensions();
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
        if (!(focus != null ? focus.equals(divGallery.getFocus(), expressionResolver, expressionResolver2) : divGallery.getFocus() == null)) {
            return false;
        }
        List functions = getFunctions();
        if (functions != null) {
            List functions2 = divGallery.getFunctions();
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
        if (!z5 || !getHeight().equals(divGallery.getHeight(), expressionResolver, expressionResolver2) || !Intrinsics.areEqual(getId(), divGallery.getId())) {
            return false;
        }
        DivCollectionItemBuilder divCollectionItemBuilder = this.itemBuilder;
        if (!(divCollectionItemBuilder != null ? divCollectionItemBuilder.equals(divGallery.itemBuilder, expressionResolver, expressionResolver2) : divGallery.itemBuilder == null) || ((Number) this.itemSpacing.evaluate(expressionResolver)).longValue() != ((Number) divGallery.itemSpacing.evaluate(expressionResolver2)).longValue()) {
            return false;
        }
        List list = this.items;
        if (list != null) {
            List list2 = divGallery.items;
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
        if (!(layoutProvider != null ? layoutProvider.equals(divGallery.getLayoutProvider(), expressionResolver, expressionResolver2) : divGallery.getLayoutProvider() == null)) {
            return false;
        }
        DivEdgeInsets margins = getMargins();
        if (!(margins != null ? margins.equals(divGallery.getMargins(), expressionResolver, expressionResolver2) : divGallery.getMargins() == null) || this.orientation.evaluate(expressionResolver) != divGallery.orientation.evaluate(expressionResolver2)) {
            return false;
        }
        DivEdgeInsets paddings = getPaddings();
        if (!(paddings != null ? paddings.equals(divGallery.getPaddings(), expressionResolver, expressionResolver2) : divGallery.getPaddings() == null) || ((Boolean) this.restrictParentScroll.evaluate(expressionResolver)).booleanValue() != ((Boolean) divGallery.restrictParentScroll.evaluate(expressionResolver2)).booleanValue()) {
            return false;
        }
        Expression reuseId = getReuseId();
        String str = reuseId != null ? (String) reuseId.evaluate(expressionResolver) : null;
        Expression reuseId2 = divGallery.getReuseId();
        if (!Intrinsics.areEqual(str, reuseId2 != null ? (String) reuseId2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression rowSpan = getRowSpan();
        Long l4 = rowSpan != null ? (Long) rowSpan.evaluate(expressionResolver) : null;
        Expression rowSpan2 = divGallery.getRowSpan();
        if (!Intrinsics.areEqual(l4, rowSpan2 != null ? (Long) rowSpan2.evaluate(expressionResolver2) : null) || this.scrollMode.evaluate(expressionResolver) != divGallery.scrollMode.evaluate(expressionResolver2) || this.scrollbar.evaluate(expressionResolver) != divGallery.scrollbar.evaluate(expressionResolver2)) {
            return false;
        }
        List selectedActions = getSelectedActions();
        if (selectedActions != null) {
            List selectedActions2 = divGallery.getSelectedActions();
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
            List tooltips2 = divGallery.getTooltips();
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
        if (!(transform != null ? transform.equals(divGallery.getTransform(), expressionResolver, expressionResolver2) : divGallery.getTransform() == null)) {
            return false;
        }
        DivChangeTransition transitionChange = getTransitionChange();
        if (!(transitionChange != null ? transitionChange.equals(divGallery.getTransitionChange(), expressionResolver, expressionResolver2) : divGallery.getTransitionChange() == null)) {
            return false;
        }
        DivAppearanceTransition transitionIn = getTransitionIn();
        if (!(transitionIn != null ? transitionIn.equals(divGallery.getTransitionIn(), expressionResolver, expressionResolver2) : divGallery.getTransitionIn() == null)) {
            return false;
        }
        DivAppearanceTransition transitionOut = getTransitionOut();
        if (!(transitionOut != null ? transitionOut.equals(divGallery.getTransitionOut(), expressionResolver, expressionResolver2) : divGallery.getTransitionOut() == null)) {
            return false;
        }
        List transitionTriggers = getTransitionTriggers();
        if (transitionTriggers != null) {
            List transitionTriggers2 = divGallery.getTransitionTriggers();
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
            List variableTriggers2 = divGallery.getVariableTriggers();
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
            List variables2 = divGallery.getVariables();
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
        if (!z11 || getVisibility().evaluate(expressionResolver) != divGallery.getVisibility().evaluate(expressionResolver2)) {
            return false;
        }
        DivVisibilityAction visibilityAction = getVisibilityAction();
        if (!(visibilityAction != null ? visibilityAction.equals(divGallery.getVisibilityAction(), expressionResolver, expressionResolver2) : divGallery.getVisibilityAction() == null)) {
            return false;
        }
        List visibilityActions = getVisibilityActions();
        if (visibilityActions != null) {
            List visibilityActions2 = divGallery.getVisibilityActions();
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
        return z12 && getWidth().equals(divGallery.getWidth(), expressionResolver, expressionResolver2);
    }

    public static /* synthetic */ DivGallery copy$default(DivGallery divGallery, DivAccessibility divAccessibility, Expression expression, Expression expression2, Expression expression3, List list, List list2, DivBorder divBorder, Expression expression4, Expression expression5, Expression expression6, Expression expression7, Expression expression8, List list3, List list4, DivFocus divFocus, List list5, DivSize divSize, String str, DivCollectionItemBuilder divCollectionItemBuilder, Expression expression9, List list6, DivLayoutProvider divLayoutProvider, DivEdgeInsets divEdgeInsets, Expression expression10, DivEdgeInsets divEdgeInsets2, Expression expression11, Expression expression12, Expression expression13, Expression expression14, Expression expression15, List list7, List list8, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list9, List list10, List list11, Expression expression16, DivVisibilityAction divVisibilityAction, List list12, DivSize divSize2, int i, int i2, Object obj) {
        DivAccessibility accessibility = (i & 1) != 0 ? divGallery.getAccessibility() : divAccessibility;
        Expression alignmentHorizontal = (i & 2) != 0 ? divGallery.getAlignmentHorizontal() : expression;
        Expression alignmentVertical = (i & 4) != 0 ? divGallery.getAlignmentVertical() : expression2;
        Expression alpha = (i & 8) != 0 ? divGallery.getAlpha() : expression3;
        List animators = (i & 16) != 0 ? divGallery.getAnimators() : list;
        List background = (i & 32) != 0 ? divGallery.getBackground() : list2;
        DivBorder border = (i & 64) != 0 ? divGallery.getBorder() : divBorder;
        Expression expression17 = (i & 128) != 0 ? divGallery.columnCount : expression4;
        Expression columnSpan = (i & 256) != 0 ? divGallery.getColumnSpan() : expression5;
        Expression expression18 = (i & 512) != 0 ? divGallery.crossContentAlignment : expression6;
        Expression expression19 = (i & 1024) != 0 ? divGallery.crossSpacing : expression7;
        Expression expression20 = (i & 2048) != 0 ? divGallery.defaultItem : expression8;
        List disappearActions = (i & 4096) != 0 ? divGallery.getDisappearActions() : list3;
        List extensions = (i & 8192) != 0 ? divGallery.getExtensions() : list4;
        DivFocus focus = (i & 16384) != 0 ? divGallery.getFocus() : divFocus;
        List functions = (i & 32768) != 0 ? divGallery.getFunctions() : list5;
        DivSize height = (i & 65536) != 0 ? divGallery.getHeight() : divSize;
        String id = (i & 131072) != 0 ? divGallery.getId() : str;
        DivFocus divFocus2 = focus;
        DivCollectionItemBuilder divCollectionItemBuilder2 = (i & 262144) != 0 ? divGallery.itemBuilder : divCollectionItemBuilder;
        Expression expression21 = (i & 524288) != 0 ? divGallery.itemSpacing : expression9;
        List list13 = (i & 1048576) != 0 ? divGallery.items : list6;
        DivLayoutProvider layoutProvider = (i & 2097152) != 0 ? divGallery.getLayoutProvider() : divLayoutProvider;
        DivEdgeInsets margins = (i & 4194304) != 0 ? divGallery.getMargins() : divEdgeInsets;
        List list14 = list13;
        Expression expression22 = (i & 8388608) != 0 ? divGallery.orientation : expression10;
        return divGallery.copy(accessibility, alignmentHorizontal, alignmentVertical, alpha, animators, background, border, expression17, columnSpan, expression18, expression19, expression20, disappearActions, extensions, divFocus2, functions, height, id, divCollectionItemBuilder2, expression21, list14, layoutProvider, margins, expression22, (i & 16777216) != 0 ? divGallery.getPaddings() : divEdgeInsets2, (i & 33554432) != 0 ? divGallery.restrictParentScroll : expression11, (i & 67108864) != 0 ? divGallery.getReuseId() : expression12, (i & 134217728) != 0 ? divGallery.getRowSpan() : expression13, (i & 268435456) != 0 ? divGallery.scrollMode : expression14, (i & 536870912) != 0 ? divGallery.scrollbar : expression15, (i & 1073741824) != 0 ? divGallery.getSelectedActions() : list7, (i & Integer.MIN_VALUE) != 0 ? divGallery.getTooltips() : list8, (i2 & 1) != 0 ? divGallery.getTransform() : divTransform, (i2 & 2) != 0 ? divGallery.getTransitionChange() : divChangeTransition, (i2 & 4) != 0 ? divGallery.getTransitionIn() : divAppearanceTransition, (i2 & 8) != 0 ? divGallery.getTransitionOut() : divAppearanceTransition2, (i2 & 16) != 0 ? divGallery.getTransitionTriggers() : list9, (i2 & 32) != 0 ? divGallery.getVariableTriggers() : list10, (i2 & 64) != 0 ? divGallery.getVariables() : list11, (i2 & 128) != 0 ? divGallery.getVisibility() : expression16, (i2 & 256) != 0 ? divGallery.getVisibilityAction() : divVisibilityAction, (i2 & 512) != 0 ? divGallery.getVisibilityActions() : list12, (i2 & 1024) != 0 ? divGallery.getWidth() : divSize2);
    }

    public final DivGallery copy(DivAccessibility divAccessibility, Expression expression, Expression expression2, Expression expression3, List list, List list2, DivBorder divBorder, Expression expression4, Expression expression5, Expression expression6, Expression expression7, Expression expression8, List list3, List list4, DivFocus divFocus, List list5, DivSize divSize, String str, DivCollectionItemBuilder divCollectionItemBuilder, Expression expression9, List list6, DivLayoutProvider divLayoutProvider, DivEdgeInsets divEdgeInsets, Expression expression10, DivEdgeInsets divEdgeInsets2, Expression expression11, Expression expression12, Expression expression13, Expression expression14, Expression expression15, List list7, List list8, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list9, List list10, List list11, Expression expression16, DivVisibilityAction divVisibilityAction, List list12, DivSize divSize2) {
        return new DivGallery(divAccessibility, expression, expression2, expression3, list, list2, divBorder, expression4, expression5, expression6, expression7, expression8, list3, list4, divFocus, list5, divSize, str, divCollectionItemBuilder, expression9, list6, divLayoutProvider, divEdgeInsets, expression10, divEdgeInsets2, expression11, expression12, expression13, expression14, expression15, list7, list8, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, list9, list10, list11, expression16, divVisibilityAction, list12, divSize2);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivGalleryJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivGalleryJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivGallery.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivGallery fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivGalleryJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivGalleryJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.INSTANCE;
        ALPHA_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        CROSS_CONTENT_ALIGNMENT_DEFAULT_VALUE = Expression.Companion.constant$default(companion, CrossContentAlignment.START, null, 2, null);
        DEFAULT_ITEM_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        HEIGHT_DEFAULT_VALUE = new DivSize.WrapContent(new DivWrapContentSize(null, null, null, 7, null));
        ITEM_SPACING_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 8L, null, 2, null);
        ORIENTATION_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Orientation.HORIZONTAL, null, 2, null);
        RESTRICT_PARENT_SCROLL_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        SCROLL_MODE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, ScrollMode.DEFAULT, null, 2, null);
        SCROLLBAR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Scrollbar.NONE, null, 2, null);
        VISIBILITY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        WIDTH_DEFAULT_VALUE = new DivSize.MatchParent(new DivMatchParentSize(null, null, null, 7, null == true ? 1 : 0));
        CREATOR = new Function2() { // from class: com.yandex.div2.DivGallery$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivGallery invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivGallery.Companion.fromJson(parsingEnvironment, jSONObject);
            }
        };
    }

    /* compiled from: DivGallery.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/yandex/div2/DivGallery$CrossContentAlignment;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", POBOMSDKLogConstants.MSG_OMSDK_START_EVENT, "CENTER", "END", "Converter", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum CrossContentAlignment {
        START("start"),
        CENTER("center"),
        END("end");


        @NotNull
        private final String value;

        /* renamed from: Converter, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        public static final Function1 TO_STRING = new Function1() { // from class: com.yandex.div2.DivGallery$CrossContentAlignment$Converter$TO_STRING$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final String invoke(@NotNull DivGallery.CrossContentAlignment crossContentAlignment) {
                return DivGallery.CrossContentAlignment.INSTANCE.toString(crossContentAlignment);
            }
        };

        @NotNull
        public static final Function1 FROM_STRING = new Function1() { // from class: com.yandex.div2.DivGallery$CrossContentAlignment$Converter$FROM_STRING$1
            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final DivGallery.CrossContentAlignment invoke(@NotNull String str) {
                return DivGallery.CrossContentAlignment.INSTANCE.fromString(str);
            }
        };

        CrossContentAlignment(String str) {
            this.value = str;
        }

        /* compiled from: DivGallery.kt */
        /* renamed from: com.yandex.div2.DivGallery$CrossContentAlignment$Converter, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final String toString(CrossContentAlignment crossContentAlignment) {
                return crossContentAlignment.value;
            }

            public final CrossContentAlignment fromString(String str) {
                CrossContentAlignment crossContentAlignment = CrossContentAlignment.START;
                if (Intrinsics.areEqual(str, crossContentAlignment.value)) {
                    return crossContentAlignment;
                }
                CrossContentAlignment crossContentAlignment2 = CrossContentAlignment.CENTER;
                if (Intrinsics.areEqual(str, crossContentAlignment2.value)) {
                    return crossContentAlignment2;
                }
                CrossContentAlignment crossContentAlignment3 = CrossContentAlignment.END;
                if (Intrinsics.areEqual(str, crossContentAlignment3.value)) {
                    return crossContentAlignment3;
                }
                return null;
            }
        }
    }

    /* compiled from: DivGallery.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/yandex/div2/DivGallery$ScrollMode;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "PAGING", "DEFAULT", "Converter", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum ScrollMode {
        PAGING("paging"),
        DEFAULT("default");


        @NotNull
        private final String value;

        /* renamed from: Converter, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        public static final Function1 TO_STRING = new Function1() { // from class: com.yandex.div2.DivGallery$ScrollMode$Converter$TO_STRING$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final String invoke(@NotNull DivGallery.ScrollMode scrollMode) {
                return DivGallery.ScrollMode.INSTANCE.toString(scrollMode);
            }
        };

        @NotNull
        public static final Function1 FROM_STRING = new Function1() { // from class: com.yandex.div2.DivGallery$ScrollMode$Converter$FROM_STRING$1
            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final DivGallery.ScrollMode invoke(@NotNull String str) {
                return DivGallery.ScrollMode.INSTANCE.fromString(str);
            }
        };

        ScrollMode(String str) {
            this.value = str;
        }

        /* compiled from: DivGallery.kt */
        /* renamed from: com.yandex.div2.DivGallery$ScrollMode$Converter, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final String toString(ScrollMode scrollMode) {
                return scrollMode.value;
            }

            public final ScrollMode fromString(String str) {
                ScrollMode scrollMode = ScrollMode.PAGING;
                if (Intrinsics.areEqual(str, scrollMode.value)) {
                    return scrollMode;
                }
                ScrollMode scrollMode2 = ScrollMode.DEFAULT;
                if (Intrinsics.areEqual(str, scrollMode2.value)) {
                    return scrollMode2;
                }
                return null;
            }
        }
    }

    /* compiled from: DivGallery.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/yandex/div2/DivGallery$Orientation;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "HORIZONTAL", "VERTICAL", "Converter", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Orientation {
        HORIZONTAL("horizontal"),
        VERTICAL("vertical");


        @NotNull
        private final String value;

        /* renamed from: Converter, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        public static final Function1 TO_STRING = new Function1() { // from class: com.yandex.div2.DivGallery$Orientation$Converter$TO_STRING$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final String invoke(@NotNull DivGallery.Orientation orientation) {
                return DivGallery.Orientation.INSTANCE.toString(orientation);
            }
        };

        @NotNull
        public static final Function1 FROM_STRING = new Function1() { // from class: com.yandex.div2.DivGallery$Orientation$Converter$FROM_STRING$1
            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final DivGallery.Orientation invoke(@NotNull String str) {
                return DivGallery.Orientation.INSTANCE.fromString(str);
            }
        };

        Orientation(String str) {
            this.value = str;
        }

        /* compiled from: DivGallery.kt */
        /* renamed from: com.yandex.div2.DivGallery$Orientation$Converter, reason: from kotlin metadata */
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
                Orientation orientation = Orientation.HORIZONTAL;
                if (Intrinsics.areEqual(str, orientation.value)) {
                    return orientation;
                }
                Orientation orientation2 = Orientation.VERTICAL;
                if (Intrinsics.areEqual(str, orientation2.value)) {
                    return orientation2;
                }
                return null;
            }
        }
    }

    /* compiled from: DivGallery.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/yandex/div2/DivGallery$Scrollbar;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "NONE", "AUTO", "Converter", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Scrollbar {
        NONE("none"),
        AUTO("auto");


        @NotNull
        private final String value;

        /* renamed from: Converter, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        public static final Function1 TO_STRING = new Function1() { // from class: com.yandex.div2.DivGallery$Scrollbar$Converter$TO_STRING$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final String invoke(@NotNull DivGallery.Scrollbar scrollbar) {
                return DivGallery.Scrollbar.INSTANCE.toString(scrollbar);
            }
        };

        @NotNull
        public static final Function1 FROM_STRING = new Function1() { // from class: com.yandex.div2.DivGallery$Scrollbar$Converter$FROM_STRING$1
            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final DivGallery.Scrollbar invoke(@NotNull String str) {
                return DivGallery.Scrollbar.INSTANCE.fromString(str);
            }
        };

        Scrollbar(String str) {
            this.value = str;
        }

        /* compiled from: DivGallery.kt */
        /* renamed from: com.yandex.div2.DivGallery$Scrollbar$Converter, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final String toString(Scrollbar scrollbar) {
                return scrollbar.value;
            }

            public final Scrollbar fromString(String str) {
                Scrollbar scrollbar = Scrollbar.NONE;
                if (Intrinsics.areEqual(str, scrollbar.value)) {
                    return scrollbar;
                }
                Scrollbar scrollbar2 = Scrollbar.AUTO;
                if (Intrinsics.areEqual(str, scrollbar2.value)) {
                    return scrollbar2;
                }
                return null;
            }
        }
    }
}
