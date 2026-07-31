package com.yandex.div2;

import com.applovin.sdk.AppLovinEventTypes;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.internal.ShareConstants;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivInput;
import com.yandex.div2.DivInputJsonParser;
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

/* compiled from: DivInput.kt */
/* loaded from: classes9.dex */
public final class DivInput implements JSONSerializable, Hashable, DivBase {
    private static final Expression ALPHA_DEFAULT_VALUE;
    private static final Expression AUTOCAPITALIZATION_DEFAULT_VALUE;
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final Expression ENTER_KEY_TYPE_DEFAULT_VALUE;
    private static final Expression FONT_SIZE_DEFAULT_VALUE;
    private static final Expression FONT_SIZE_UNIT_DEFAULT_VALUE;
    private static final DivSize.WrapContent HEIGHT_DEFAULT_VALUE;
    private static final Expression HINT_COLOR_DEFAULT_VALUE;
    private static final Expression IS_ENABLED_DEFAULT_VALUE;
    private static final Expression KEYBOARD_TYPE_DEFAULT_VALUE;
    private static final Expression LETTER_SPACING_DEFAULT_VALUE;
    private static final Expression SELECT_ALL_ON_FOCUS_DEFAULT_VALUE;
    private static final Expression TEXT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE;
    private static final Expression TEXT_ALIGNMENT_VERTICAL_DEFAULT_VALUE;
    private static final Expression TEXT_COLOR_DEFAULT_VALUE;
    private static final Expression VISIBILITY_DEFAULT_VALUE;
    private static final DivSize.MatchParent WIDTH_DEFAULT_VALUE;
    private Integer _hash;
    private final DivAccessibility accessibility;
    private final Expression alignmentHorizontal;
    private final Expression alignmentVertical;
    private final Expression alpha;
    private final List animators;
    public final Expression autocapitalization;
    private final List background;
    private final DivBorder border;
    private final Expression columnSpan;
    private final List disappearActions;
    public final List enterKeyActions;
    public final Expression enterKeyType;
    private final List extensions;
    public final List filters;
    private final DivFocus focus;
    public final Expression fontFamily;
    public final Expression fontSize;
    public final Expression fontSizeUnit;
    public final Expression fontVariationSettings;
    public final Expression fontWeight;
    public final Expression fontWeightValue;
    private final List functions;
    private final DivSize height;
    public final Expression highlightColor;
    public final Expression hintColor;
    public final Expression hintText;
    private final String id;
    public final Expression isEnabled;
    public final Expression keyboardType;
    private final DivLayoutProvider layoutProvider;
    public final Expression letterSpacing;
    public final Expression lineHeight;
    private final DivEdgeInsets margins;
    public final DivInputMask mask;
    public final Expression maxLength;
    public final Expression maxVisibleLines;
    public final NativeInterface nativeInterface;
    private final DivEdgeInsets paddings;
    private final Expression reuseId;
    private final Expression rowSpan;
    public final Expression selectAllOnFocus;
    private final List selectedActions;
    public final Expression textAlignmentHorizontal;
    public final Expression textAlignmentVertical;
    public final Expression textColor;
    public final String textVariable;
    private final List tooltips;
    private final DivTransform transform;
    private final DivChangeTransition transitionChange;
    private final DivAppearanceTransition transitionIn;
    private final DivAppearanceTransition transitionOut;
    private final List transitionTriggers;
    public final List validators;
    private final List variableTriggers;
    private final List variables;
    private final Expression visibility;
    private final DivVisibilityAction visibilityAction;
    private final List visibilityActions;
    private final DivSize width;

    public DivInput(DivAccessibility divAccessibility, Expression expression, Expression expression2, Expression expression3, List list, Expression expression4, List list2, DivBorder divBorder, Expression expression5, List list3, List list4, Expression expression6, List list5, List list6, DivFocus divFocus, Expression expression7, Expression expression8, Expression expression9, Expression expression10, Expression expression11, Expression expression12, List list7, DivSize divSize, Expression expression13, Expression expression14, Expression expression15, String str, Expression expression16, Expression expression17, DivLayoutProvider divLayoutProvider, Expression expression18, Expression expression19, DivEdgeInsets divEdgeInsets, DivInputMask divInputMask, Expression expression20, Expression expression21, NativeInterface nativeInterface, DivEdgeInsets divEdgeInsets2, Expression expression22, Expression expression23, Expression expression24, List list8, Expression expression25, Expression expression26, Expression expression27, String str2, List list9, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list10, List list11, List list12, List list13, Expression expression28, DivVisibilityAction divVisibilityAction, List list14, DivSize divSize2) {
        this.accessibility = divAccessibility;
        this.alignmentHorizontal = expression;
        this.alignmentVertical = expression2;
        this.alpha = expression3;
        this.animators = list;
        this.autocapitalization = expression4;
        this.background = list2;
        this.border = divBorder;
        this.columnSpan = expression5;
        this.disappearActions = list3;
        this.enterKeyActions = list4;
        this.enterKeyType = expression6;
        this.extensions = list5;
        this.filters = list6;
        this.focus = divFocus;
        this.fontFamily = expression7;
        this.fontSize = expression8;
        this.fontSizeUnit = expression9;
        this.fontVariationSettings = expression10;
        this.fontWeight = expression11;
        this.fontWeightValue = expression12;
        this.functions = list7;
        this.height = divSize;
        this.highlightColor = expression13;
        this.hintColor = expression14;
        this.hintText = expression15;
        this.id = str;
        this.isEnabled = expression16;
        this.keyboardType = expression17;
        this.layoutProvider = divLayoutProvider;
        this.letterSpacing = expression18;
        this.lineHeight = expression19;
        this.margins = divEdgeInsets;
        this.mask = divInputMask;
        this.maxLength = expression20;
        this.maxVisibleLines = expression21;
        this.nativeInterface = nativeInterface;
        this.paddings = divEdgeInsets2;
        this.reuseId = expression22;
        this.rowSpan = expression23;
        this.selectAllOnFocus = expression24;
        this.selectedActions = list8;
        this.textAlignmentHorizontal = expression25;
        this.textAlignmentVertical = expression26;
        this.textColor = expression27;
        this.textVariable = str2;
        this.tooltips = list9;
        this.transform = divTransform;
        this.transitionChange = divChangeTransition;
        this.transitionIn = divAppearanceTransition;
        this.transitionOut = divAppearanceTransition2;
        this.transitionTriggers = list10;
        this.validators = list11;
        this.variableTriggers = list12;
        this.variables = list13;
        this.visibility = expression28;
        this.visibilityAction = divVisibilityAction;
        this.visibilityActions = list14;
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
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivInput.class).hashCode();
        DivAccessibility accessibility = getAccessibility();
        int i13 = 0;
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
        int hashCode4 = hashCode3 + i + this.autocapitalization.hashCode();
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
        int i14 = hashCode4 + i2;
        DivBorder border = getBorder();
        int hash2 = i14 + (border != null ? border.hash() : 0);
        Expression columnSpan = getColumnSpan();
        int hashCode5 = hash2 + (columnSpan != null ? columnSpan.hashCode() : 0);
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
        int i15 = hashCode5 + i3;
        List list = this.enterKeyActions;
        if (list != null) {
            Iterator it4 = list.iterator();
            i4 = 0;
            while (it4.hasNext()) {
                i4 += ((DivAction) it4.next()).hash();
            }
        } else {
            i4 = 0;
        }
        int hashCode6 = i15 + i4 + this.enterKeyType.hashCode();
        List extensions = getExtensions();
        if (extensions != null) {
            Iterator it5 = extensions.iterator();
            i5 = 0;
            while (it5.hasNext()) {
                i5 += ((DivExtension) it5.next()).hash();
            }
        } else {
            i5 = 0;
        }
        int i16 = hashCode6 + i5;
        List list2 = this.filters;
        if (list2 != null) {
            Iterator it6 = list2.iterator();
            i6 = 0;
            while (it6.hasNext()) {
                i6 += ((DivInputFilter) it6.next()).hash();
            }
        } else {
            i6 = 0;
        }
        int i17 = i16 + i6;
        DivFocus focus = getFocus();
        int hash3 = i17 + (focus != null ? focus.hash() : 0);
        Expression expression = this.fontFamily;
        int hashCode7 = hash3 + (expression != null ? expression.hashCode() : 0) + this.fontSize.hashCode() + this.fontSizeUnit.hashCode();
        Expression expression2 = this.fontVariationSettings;
        int hashCode8 = hashCode7 + (expression2 != null ? expression2.hashCode() : 0);
        Expression expression3 = this.fontWeight;
        int hashCode9 = hashCode8 + (expression3 != null ? expression3.hashCode() : 0);
        Expression expression4 = this.fontWeightValue;
        int hashCode10 = hashCode9 + (expression4 != null ? expression4.hashCode() : 0);
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
        int hash4 = hashCode10 + i7 + getHeight().hash();
        Expression expression5 = this.highlightColor;
        int hashCode11 = hash4 + (expression5 != null ? expression5.hashCode() : 0) + this.hintColor.hashCode();
        Expression expression6 = this.hintText;
        int hashCode12 = hashCode11 + (expression6 != null ? expression6.hashCode() : 0);
        String id = getId();
        int hashCode13 = hashCode12 + (id != null ? id.hashCode() : 0) + this.isEnabled.hashCode() + this.keyboardType.hashCode();
        DivLayoutProvider layoutProvider = getLayoutProvider();
        int hash5 = hashCode13 + (layoutProvider != null ? layoutProvider.hash() : 0) + this.letterSpacing.hashCode();
        Expression expression7 = this.lineHeight;
        int hashCode14 = hash5 + (expression7 != null ? expression7.hashCode() : 0);
        DivEdgeInsets margins = getMargins();
        int hash6 = hashCode14 + (margins != null ? margins.hash() : 0);
        DivInputMask divInputMask = this.mask;
        int hash7 = hash6 + (divInputMask != null ? divInputMask.hash() : 0);
        Expression expression8 = this.maxLength;
        int hashCode15 = hash7 + (expression8 != null ? expression8.hashCode() : 0);
        Expression expression9 = this.maxVisibleLines;
        int hashCode16 = hashCode15 + (expression9 != null ? expression9.hashCode() : 0);
        NativeInterface nativeInterface = this.nativeInterface;
        int hash8 = hashCode16 + (nativeInterface != null ? nativeInterface.hash() : 0);
        DivEdgeInsets paddings = getPaddings();
        int hash9 = hash8 + (paddings != null ? paddings.hash() : 0);
        Expression reuseId = getReuseId();
        int hashCode17 = hash9 + (reuseId != null ? reuseId.hashCode() : 0);
        Expression rowSpan = getRowSpan();
        int hashCode18 = hashCode17 + (rowSpan != null ? rowSpan.hashCode() : 0) + this.selectAllOnFocus.hashCode();
        List selectedActions = getSelectedActions();
        if (selectedActions != null) {
            Iterator it8 = selectedActions.iterator();
            i8 = 0;
            while (it8.hasNext()) {
                i8 += ((DivAction) it8.next()).hash();
            }
        } else {
            i8 = 0;
        }
        int hashCode19 = hashCode18 + i8 + this.textAlignmentHorizontal.hashCode() + this.textAlignmentVertical.hashCode() + this.textColor.hashCode() + this.textVariable.hashCode();
        List tooltips = getTooltips();
        if (tooltips != null) {
            Iterator it9 = tooltips.iterator();
            i9 = 0;
            while (it9.hasNext()) {
                i9 += ((DivTooltip) it9.next()).hash();
            }
        } else {
            i9 = 0;
        }
        int i18 = hashCode19 + i9;
        DivTransform transform = getTransform();
        int hash10 = i18 + (transform != null ? transform.hash() : 0);
        DivChangeTransition transitionChange = getTransitionChange();
        int hash11 = hash10 + (transitionChange != null ? transitionChange.hash() : 0);
        DivAppearanceTransition transitionIn = getTransitionIn();
        int hash12 = hash11 + (transitionIn != null ? transitionIn.hash() : 0);
        DivAppearanceTransition transitionOut = getTransitionOut();
        int hash13 = hash12 + (transitionOut != null ? transitionOut.hash() : 0);
        List transitionTriggers = getTransitionTriggers();
        int hashCode20 = hash13 + (transitionTriggers != null ? transitionTriggers.hashCode() : 0);
        List list3 = this.validators;
        if (list3 != null) {
            Iterator it10 = list3.iterator();
            i10 = 0;
            while (it10.hasNext()) {
                i10 += ((DivInputValidator) it10.next()).hash();
            }
        } else {
            i10 = 0;
        }
        int i19 = hashCode20 + i10;
        List variableTriggers = getVariableTriggers();
        if (variableTriggers != null) {
            Iterator it11 = variableTriggers.iterator();
            i11 = 0;
            while (it11.hasNext()) {
                i11 += ((DivTrigger) it11.next()).hash();
            }
        } else {
            i11 = 0;
        }
        int i20 = i19 + i11;
        List variables = getVariables();
        if (variables != null) {
            Iterator it12 = variables.iterator();
            i12 = 0;
            while (it12.hasNext()) {
                i12 += ((DivVariable) it12.next()).hash();
            }
        } else {
            i12 = 0;
        }
        int hashCode21 = i20 + i12 + getVisibility().hashCode();
        DivVisibilityAction visibilityAction = getVisibilityAction();
        int hash14 = hashCode21 + (visibilityAction != null ? visibilityAction.hash() : 0);
        List visibilityActions = getVisibilityActions();
        if (visibilityActions != null) {
            Iterator it13 = visibilityActions.iterator();
            while (it13.hasNext()) {
                i13 += ((DivVisibilityAction) it13.next()).hash();
            }
        }
        int hash15 = hash14 + i13 + getWidth().hash();
        this._hash = Integer.valueOf(hash15);
        return hash15;
    }

    /* JADX WARN: Code restructure failed: missing block: B:495:0x085c, code lost:
    
        if (r9.getVisibilityActions() == null) goto L607;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x07e4, code lost:
    
        if (r9.getVariables() == null) goto L574;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x0798, code lost:
    
        if (r9.getVariableTriggers() == null) goto L551;
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x074c, code lost:
    
        if (r9.validators == null) goto L528;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x0706, code lost:
    
        if (r9.getTransitionTriggers() == null) goto L505;
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x0651, code lost:
    
        if (r9.getTooltips() == null) goto L447;
     */
    /* JADX WARN: Code restructure failed: missing block: B:549:0x05c5, code lost:
    
        if (r9.getSelectedActions() == null) goto L416;
     */
    /* JADX WARN: Code restructure failed: missing block: B:606:0x0392, code lost:
    
        if (r9.getFunctions() == null) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:629:0x028e, code lost:
    
        if (r9.filters == null) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:633:0x0248, code lost:
    
        if (r9.getExtensions() == null) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:638:0x01ee, code lost:
    
        if (r9.enterKeyActions == null) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:642:0x01a8, code lost:
    
        if (r9.getDisappearActions() == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:654:0x0120, code lost:
    
        if (r9.getBackground() == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:659:0x00c6, code lost:
    
        if (r9.getAnimators() == null) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(DivInput divInput, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
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
        if (divInput == null) {
            return false;
        }
        DivAccessibility accessibility = getAccessibility();
        if (!(accessibility != null ? accessibility.equals(divInput.getAccessibility(), expressionResolver, expressionResolver2) : divInput.getAccessibility() == null)) {
            return false;
        }
        Expression alignmentHorizontal = getAlignmentHorizontal();
        DivAlignmentHorizontal divAlignmentHorizontal = alignmentHorizontal != null ? (DivAlignmentHorizontal) alignmentHorizontal.evaluate(expressionResolver) : null;
        Expression alignmentHorizontal2 = divInput.getAlignmentHorizontal();
        if (divAlignmentHorizontal != (alignmentHorizontal2 != null ? (DivAlignmentHorizontal) alignmentHorizontal2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression alignmentVertical = getAlignmentVertical();
        DivAlignmentVertical divAlignmentVertical = alignmentVertical != null ? (DivAlignmentVertical) alignmentVertical.evaluate(expressionResolver) : null;
        Expression alignmentVertical2 = divInput.getAlignmentVertical();
        if (divAlignmentVertical != (alignmentVertical2 != null ? (DivAlignmentVertical) alignmentVertical2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        if (!(((Number) getAlpha().evaluate(expressionResolver)).doubleValue() == ((Number) divInput.getAlpha().evaluate(expressionResolver2)).doubleValue())) {
            return false;
        }
        List animators = getAnimators();
        if (animators != null) {
            List animators2 = divInput.getAnimators();
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
        if (!z || this.autocapitalization.evaluate(expressionResolver) != divInput.autocapitalization.evaluate(expressionResolver2)) {
            return false;
        }
        List background = getBackground();
        if (background != null) {
            List background2 = divInput.getBackground();
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
        if (!(border != null ? border.equals(divInput.getBorder(), expressionResolver, expressionResolver2) : divInput.getBorder() == null)) {
            return false;
        }
        Expression columnSpan = getColumnSpan();
        Long l = columnSpan != null ? (Long) columnSpan.evaluate(expressionResolver) : null;
        Expression columnSpan2 = divInput.getColumnSpan();
        if (!Intrinsics.areEqual(l, columnSpan2 != null ? (Long) columnSpan2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List disappearActions = getDisappearActions();
        if (disappearActions != null) {
            List disappearActions2 = divInput.getDisappearActions();
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
        List list = this.enterKeyActions;
        if (list != null) {
            List list2 = divInput.enterKeyActions;
            if (list2 != null) {
                if (list.size() == list2.size()) {
                    int i7 = 0;
                    for (Object obj4 : list) {
                        int i8 = i7 + 1;
                        if (i7 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivAction) obj4).equals((DivAction) list2.get(i7), expressionResolver, expressionResolver2)) {
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
        if (!z4 || this.enterKeyType.evaluate(expressionResolver) != divInput.enterKeyType.evaluate(expressionResolver2)) {
            return false;
        }
        List extensions = getExtensions();
        if (extensions != null) {
            List extensions2 = divInput.getExtensions();
            if (extensions2 != null) {
                if (extensions.size() == extensions2.size()) {
                    int i9 = 0;
                    for (Object obj5 : extensions) {
                        int i10 = i9 + 1;
                        if (i9 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivExtension) obj5).equals((DivExtension) extensions2.get(i9), expressionResolver, expressionResolver2)) {
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
        List list3 = this.filters;
        if (list3 != null) {
            List list4 = divInput.filters;
            if (list4 != null) {
                if (list3.size() == list4.size()) {
                    int i11 = 0;
                    for (Object obj6 : list3) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivInputFilter) obj6).equals((DivInputFilter) list4.get(i11), expressionResolver, expressionResolver2)) {
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
        if (!(focus != null ? focus.equals(divInput.getFocus(), expressionResolver, expressionResolver2) : divInput.getFocus() == null)) {
            return false;
        }
        Expression expression = this.fontFamily;
        String str = expression != null ? (String) expression.evaluate(expressionResolver) : null;
        Expression expression2 = divInput.fontFamily;
        if (!Intrinsics.areEqual(str, expression2 != null ? (String) expression2.evaluate(expressionResolver2) : null) || ((Number) this.fontSize.evaluate(expressionResolver)).longValue() != ((Number) divInput.fontSize.evaluate(expressionResolver2)).longValue() || this.fontSizeUnit.evaluate(expressionResolver) != divInput.fontSizeUnit.evaluate(expressionResolver2)) {
            return false;
        }
        Expression expression3 = this.fontVariationSettings;
        JSONObject jSONObject = expression3 != null ? (JSONObject) expression3.evaluate(expressionResolver) : null;
        Expression expression4 = divInput.fontVariationSettings;
        if (!Intrinsics.areEqual(jSONObject, expression4 != null ? (JSONObject) expression4.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression expression5 = this.fontWeight;
        DivFontWeight divFontWeight = expression5 != null ? (DivFontWeight) expression5.evaluate(expressionResolver) : null;
        Expression expression6 = divInput.fontWeight;
        if (divFontWeight != (expression6 != null ? (DivFontWeight) expression6.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression expression7 = this.fontWeightValue;
        Long l2 = expression7 != null ? (Long) expression7.evaluate(expressionResolver) : null;
        Expression expression8 = divInput.fontWeightValue;
        if (!Intrinsics.areEqual(l2, expression8 != null ? (Long) expression8.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List functions = getFunctions();
        if (functions != null) {
            List functions2 = divInput.getFunctions();
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
        if (!z7 || !getHeight().equals(divInput.getHeight(), expressionResolver, expressionResolver2)) {
            return false;
        }
        Expression expression9 = this.highlightColor;
        Integer num = expression9 != null ? (Integer) expression9.evaluate(expressionResolver) : null;
        Expression expression10 = divInput.highlightColor;
        if (!Intrinsics.areEqual(num, expression10 != null ? (Integer) expression10.evaluate(expressionResolver2) : null) || ((Number) this.hintColor.evaluate(expressionResolver)).intValue() != ((Number) divInput.hintColor.evaluate(expressionResolver2)).intValue()) {
            return false;
        }
        Expression expression11 = this.hintText;
        String str2 = expression11 != null ? (String) expression11.evaluate(expressionResolver) : null;
        Expression expression12 = divInput.hintText;
        if (!Intrinsics.areEqual(str2, expression12 != null ? (String) expression12.evaluate(expressionResolver2) : null) || !Intrinsics.areEqual(getId(), divInput.getId()) || ((Boolean) this.isEnabled.evaluate(expressionResolver)).booleanValue() != ((Boolean) divInput.isEnabled.evaluate(expressionResolver2)).booleanValue() || this.keyboardType.evaluate(expressionResolver) != divInput.keyboardType.evaluate(expressionResolver2)) {
            return false;
        }
        DivLayoutProvider layoutProvider = getLayoutProvider();
        if (!(layoutProvider != null ? layoutProvider.equals(divInput.getLayoutProvider(), expressionResolver, expressionResolver2) : divInput.getLayoutProvider() == null)) {
            return false;
        }
        if (!(((Number) this.letterSpacing.evaluate(expressionResolver)).doubleValue() == ((Number) divInput.letterSpacing.evaluate(expressionResolver2)).doubleValue())) {
            return false;
        }
        Expression expression13 = this.lineHeight;
        Long l3 = expression13 != null ? (Long) expression13.evaluate(expressionResolver) : null;
        Expression expression14 = divInput.lineHeight;
        if (!Intrinsics.areEqual(l3, expression14 != null ? (Long) expression14.evaluate(expressionResolver2) : null)) {
            return false;
        }
        DivEdgeInsets margins = getMargins();
        if (!(margins != null ? margins.equals(divInput.getMargins(), expressionResolver, expressionResolver2) : divInput.getMargins() == null)) {
            return false;
        }
        DivInputMask divInputMask = this.mask;
        if (!(divInputMask != null ? divInputMask.equals(divInput.mask, expressionResolver, expressionResolver2) : divInput.mask == null)) {
            return false;
        }
        Expression expression15 = this.maxLength;
        Long l4 = expression15 != null ? (Long) expression15.evaluate(expressionResolver) : null;
        Expression expression16 = divInput.maxLength;
        if (!Intrinsics.areEqual(l4, expression16 != null ? (Long) expression16.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression expression17 = this.maxVisibleLines;
        Long l5 = expression17 != null ? (Long) expression17.evaluate(expressionResolver) : null;
        Expression expression18 = divInput.maxVisibleLines;
        if (!Intrinsics.areEqual(l5, expression18 != null ? (Long) expression18.evaluate(expressionResolver2) : null)) {
            return false;
        }
        NativeInterface nativeInterface = this.nativeInterface;
        if (!(nativeInterface != null ? nativeInterface.equals(divInput.nativeInterface, expressionResolver, expressionResolver2) : divInput.nativeInterface == null)) {
            return false;
        }
        DivEdgeInsets paddings = getPaddings();
        if (!(paddings != null ? paddings.equals(divInput.getPaddings(), expressionResolver, expressionResolver2) : divInput.getPaddings() == null)) {
            return false;
        }
        Expression reuseId = getReuseId();
        String str3 = reuseId != null ? (String) reuseId.evaluate(expressionResolver) : null;
        Expression reuseId2 = divInput.getReuseId();
        if (!Intrinsics.areEqual(str3, reuseId2 != null ? (String) reuseId2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression rowSpan = getRowSpan();
        Long l6 = rowSpan != null ? (Long) rowSpan.evaluate(expressionResolver) : null;
        Expression rowSpan2 = divInput.getRowSpan();
        if (!Intrinsics.areEqual(l6, rowSpan2 != null ? (Long) rowSpan2.evaluate(expressionResolver2) : null) || ((Boolean) this.selectAllOnFocus.evaluate(expressionResolver)).booleanValue() != ((Boolean) divInput.selectAllOnFocus.evaluate(expressionResolver2)).booleanValue()) {
            return false;
        }
        List selectedActions = getSelectedActions();
        if (selectedActions != null) {
            List selectedActions2 = divInput.getSelectedActions();
            if (selectedActions2 != null) {
                if (selectedActions.size() == selectedActions2.size()) {
                    int i15 = 0;
                    for (Object obj8 : selectedActions) {
                        int i16 = i15 + 1;
                        if (i15 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivAction) obj8).equals((DivAction) selectedActions2.get(i15), expressionResolver, expressionResolver2)) {
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
        if (!z8 || this.textAlignmentHorizontal.evaluate(expressionResolver) != divInput.textAlignmentHorizontal.evaluate(expressionResolver2) || this.textAlignmentVertical.evaluate(expressionResolver) != divInput.textAlignmentVertical.evaluate(expressionResolver2) || ((Number) this.textColor.evaluate(expressionResolver)).intValue() != ((Number) divInput.textColor.evaluate(expressionResolver2)).intValue() || !Intrinsics.areEqual(this.textVariable, divInput.textVariable)) {
            return false;
        }
        List tooltips = getTooltips();
        if (tooltips != null) {
            List tooltips2 = divInput.getTooltips();
            if (tooltips2 != null) {
                if (tooltips.size() == tooltips2.size()) {
                    int i17 = 0;
                    for (Object obj9 : tooltips) {
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivTooltip) obj9).equals((DivTooltip) tooltips2.get(i17), expressionResolver, expressionResolver2)) {
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
        DivTransform transform = getTransform();
        if (!(transform != null ? transform.equals(divInput.getTransform(), expressionResolver, expressionResolver2) : divInput.getTransform() == null)) {
            return false;
        }
        DivChangeTransition transitionChange = getTransitionChange();
        if (!(transitionChange != null ? transitionChange.equals(divInput.getTransitionChange(), expressionResolver, expressionResolver2) : divInput.getTransitionChange() == null)) {
            return false;
        }
        DivAppearanceTransition transitionIn = getTransitionIn();
        if (!(transitionIn != null ? transitionIn.equals(divInput.getTransitionIn(), expressionResolver, expressionResolver2) : divInput.getTransitionIn() == null)) {
            return false;
        }
        DivAppearanceTransition transitionOut = getTransitionOut();
        if (!(transitionOut != null ? transitionOut.equals(divInput.getTransitionOut(), expressionResolver, expressionResolver2) : divInput.getTransitionOut() == null)) {
            return false;
        }
        List transitionTriggers = getTransitionTriggers();
        if (transitionTriggers != null) {
            List transitionTriggers2 = divInput.getTransitionTriggers();
            if (transitionTriggers2 != null) {
                if (transitionTriggers.size() == transitionTriggers2.size()) {
                    int i19 = 0;
                    for (Object obj10 : transitionTriggers) {
                        int i20 = i19 + 1;
                        if (i19 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivTransitionTrigger) obj10) == ((DivTransitionTrigger) transitionTriggers2.get(i19))) {
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
        List list5 = this.validators;
        if (list5 != null) {
            List list6 = divInput.validators;
            if (list6 != null) {
                if (list5.size() == list6.size()) {
                    int i21 = 0;
                    for (Object obj11 : list5) {
                        int i22 = i21 + 1;
                        if (i21 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivInputValidator) obj11).equals((DivInputValidator) list6.get(i21), expressionResolver, expressionResolver2)) {
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
        List variableTriggers = getVariableTriggers();
        if (variableTriggers != null) {
            List variableTriggers2 = divInput.getVariableTriggers();
            if (variableTriggers2 != null) {
                if (variableTriggers.size() == variableTriggers2.size()) {
                    int i23 = 0;
                    for (Object obj12 : variableTriggers) {
                        int i24 = i23 + 1;
                        if (i23 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivTrigger) obj12).equals((DivTrigger) variableTriggers2.get(i23), expressionResolver, expressionResolver2)) {
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
        List variables = getVariables();
        if (variables != null) {
            List variables2 = divInput.getVariables();
            if (variables2 != null) {
                if (variables.size() == variables2.size()) {
                    int i25 = 0;
                    for (Object obj13 : variables) {
                        int i26 = i25 + 1;
                        if (i25 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivVariable) obj13).equals((DivVariable) variables2.get(i25), expressionResolver, expressionResolver2)) {
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
        if (!z13 || getVisibility().evaluate(expressionResolver) != divInput.getVisibility().evaluate(expressionResolver2)) {
            return false;
        }
        DivVisibilityAction visibilityAction = getVisibilityAction();
        if (!(visibilityAction != null ? visibilityAction.equals(divInput.getVisibilityAction(), expressionResolver, expressionResolver2) : divInput.getVisibilityAction() == null)) {
            return false;
        }
        List visibilityActions = getVisibilityActions();
        if (visibilityActions != null) {
            List visibilityActions2 = divInput.getVisibilityActions();
            if (visibilityActions2 != null) {
                if (visibilityActions.size() == visibilityActions2.size()) {
                    int i27 = 0;
                    for (Object obj14 : visibilityActions) {
                        int i28 = i27 + 1;
                        if (i27 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivVisibilityAction) obj14).equals((DivVisibilityAction) visibilityActions2.get(i27), expressionResolver, expressionResolver2)) {
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
        return z14 && getWidth().equals(divInput.getWidth(), expressionResolver, expressionResolver2);
    }

    public static /* synthetic */ DivInput copy$default(DivInput divInput, DivAccessibility divAccessibility, Expression expression, Expression expression2, Expression expression3, List list, Expression expression4, List list2, DivBorder divBorder, Expression expression5, List list3, List list4, Expression expression6, List list5, List list6, DivFocus divFocus, Expression expression7, Expression expression8, Expression expression9, Expression expression10, Expression expression11, Expression expression12, List list7, DivSize divSize, Expression expression13, Expression expression14, Expression expression15, String str, Expression expression16, Expression expression17, DivLayoutProvider divLayoutProvider, Expression expression18, Expression expression19, DivEdgeInsets divEdgeInsets, DivInputMask divInputMask, Expression expression20, Expression expression21, NativeInterface nativeInterface, DivEdgeInsets divEdgeInsets2, Expression expression22, Expression expression23, Expression expression24, List list8, Expression expression25, Expression expression26, Expression expression27, String str2, List list9, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list10, List list11, List list12, List list13, Expression expression28, DivVisibilityAction divVisibilityAction, List list14, DivSize divSize2, int i, int i2, Object obj) {
        DivAccessibility accessibility = (i & 1) != 0 ? divInput.getAccessibility() : divAccessibility;
        Expression alignmentHorizontal = (i & 2) != 0 ? divInput.getAlignmentHorizontal() : expression;
        Expression alignmentVertical = (i & 4) != 0 ? divInput.getAlignmentVertical() : expression2;
        Expression alpha = (i & 8) != 0 ? divInput.getAlpha() : expression3;
        List animators = (i & 16) != 0 ? divInput.getAnimators() : list;
        Expression expression29 = (i & 32) != 0 ? divInput.autocapitalization : expression4;
        List background = (i & 64) != 0 ? divInput.getBackground() : list2;
        DivBorder border = (i & 128) != 0 ? divInput.getBorder() : divBorder;
        Expression columnSpan = (i & 256) != 0 ? divInput.getColumnSpan() : expression5;
        List disappearActions = (i & 512) != 0 ? divInput.getDisappearActions() : list3;
        List list15 = (i & 1024) != 0 ? divInput.enterKeyActions : list4;
        Expression expression30 = (i & 2048) != 0 ? divInput.enterKeyType : expression6;
        List extensions = (i & 4096) != 0 ? divInput.getExtensions() : list5;
        List list16 = (i & 8192) != 0 ? divInput.filters : list6;
        DivFocus focus = (i & 16384) != 0 ? divInput.getFocus() : divFocus;
        Expression expression31 = (i & 32768) != 0 ? divInput.fontFamily : expression7;
        Expression expression32 = (i & 65536) != 0 ? divInput.fontSize : expression8;
        Expression expression33 = (i & 131072) != 0 ? divInput.fontSizeUnit : expression9;
        Expression expression34 = (i & 262144) != 0 ? divInput.fontVariationSettings : expression10;
        Expression expression35 = (i & 524288) != 0 ? divInput.fontWeight : expression11;
        Expression expression36 = (i & 1048576) != 0 ? divInput.fontWeightValue : expression12;
        List functions = (i & 2097152) != 0 ? divInput.getFunctions() : list7;
        DivSize height = (i & 4194304) != 0 ? divInput.getHeight() : divSize;
        Expression expression37 = expression36;
        Expression expression38 = (i & 8388608) != 0 ? divInput.highlightColor : expression13;
        Expression expression39 = (i & 16777216) != 0 ? divInput.hintColor : expression14;
        Expression expression40 = (i & 33554432) != 0 ? divInput.hintText : expression15;
        String id = (i & 67108864) != 0 ? divInput.getId() : str;
        Expression expression41 = expression40;
        Expression expression42 = (i & 134217728) != 0 ? divInput.isEnabled : expression16;
        Expression expression43 = (i & 268435456) != 0 ? divInput.keyboardType : expression17;
        DivLayoutProvider layoutProvider = (i & 536870912) != 0 ? divInput.getLayoutProvider() : divLayoutProvider;
        Expression expression44 = expression43;
        Expression expression45 = (i & 1073741824) != 0 ? divInput.letterSpacing : expression18;
        Expression expression46 = (i & Integer.MIN_VALUE) != 0 ? divInput.lineHeight : expression19;
        DivEdgeInsets margins = (i2 & 1) != 0 ? divInput.getMargins() : divEdgeInsets;
        Expression expression47 = expression46;
        DivInputMask divInputMask2 = (i2 & 2) != 0 ? divInput.mask : divInputMask;
        Expression expression48 = (i2 & 4) != 0 ? divInput.maxLength : expression20;
        Expression expression49 = (i2 & 8) != 0 ? divInput.maxVisibleLines : expression21;
        NativeInterface nativeInterface2 = (i2 & 16) != 0 ? divInput.nativeInterface : nativeInterface;
        return divInput.copy(accessibility, alignmentHorizontal, alignmentVertical, alpha, animators, expression29, background, border, columnSpan, disappearActions, list15, expression30, extensions, list16, focus, expression31, expression32, expression33, expression34, expression35, expression37, functions, height, expression38, expression39, expression41, id, expression42, expression44, layoutProvider, expression45, expression47, margins, divInputMask2, expression48, expression49, nativeInterface2, (i2 & 32) != 0 ? divInput.getPaddings() : divEdgeInsets2, (i2 & 64) != 0 ? divInput.getReuseId() : expression22, (i2 & 128) != 0 ? divInput.getRowSpan() : expression23, (i2 & 256) != 0 ? divInput.selectAllOnFocus : expression24, (i2 & 512) != 0 ? divInput.getSelectedActions() : list8, (i2 & 1024) != 0 ? divInput.textAlignmentHorizontal : expression25, (i2 & 2048) != 0 ? divInput.textAlignmentVertical : expression26, (i2 & 4096) != 0 ? divInput.textColor : expression27, (i2 & 8192) != 0 ? divInput.textVariable : str2, (i2 & 16384) != 0 ? divInput.getTooltips() : list9, (i2 & 32768) != 0 ? divInput.getTransform() : divTransform, (i2 & 65536) != 0 ? divInput.getTransitionChange() : divChangeTransition, (i2 & 131072) != 0 ? divInput.getTransitionIn() : divAppearanceTransition, (i2 & 262144) != 0 ? divInput.getTransitionOut() : divAppearanceTransition2, (i2 & 524288) != 0 ? divInput.getTransitionTriggers() : list10, (i2 & 1048576) != 0 ? divInput.validators : list11, (i2 & 2097152) != 0 ? divInput.getVariableTriggers() : list12, (i2 & 4194304) != 0 ? divInput.getVariables() : list13, (i2 & 8388608) != 0 ? divInput.getVisibility() : expression28, (i2 & 16777216) != 0 ? divInput.getVisibilityAction() : divVisibilityAction, (i2 & 33554432) != 0 ? divInput.getVisibilityActions() : list14, (i2 & 67108864) != 0 ? divInput.getWidth() : divSize2);
    }

    public final DivInput copy(DivAccessibility divAccessibility, Expression expression, Expression expression2, Expression expression3, List list, Expression expression4, List list2, DivBorder divBorder, Expression expression5, List list3, List list4, Expression expression6, List list5, List list6, DivFocus divFocus, Expression expression7, Expression expression8, Expression expression9, Expression expression10, Expression expression11, Expression expression12, List list7, DivSize divSize, Expression expression13, Expression expression14, Expression expression15, String str, Expression expression16, Expression expression17, DivLayoutProvider divLayoutProvider, Expression expression18, Expression expression19, DivEdgeInsets divEdgeInsets, DivInputMask divInputMask, Expression expression20, Expression expression21, NativeInterface nativeInterface, DivEdgeInsets divEdgeInsets2, Expression expression22, Expression expression23, Expression expression24, List list8, Expression expression25, Expression expression26, Expression expression27, String str2, List list9, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list10, List list11, List list12, List list13, Expression expression28, DivVisibilityAction divVisibilityAction, List list14, DivSize divSize2) {
        return new DivInput(divAccessibility, expression, expression2, expression3, list, expression4, list2, divBorder, expression5, list3, list4, expression6, list5, list6, divFocus, expression7, expression8, expression9, expression10, expression11, expression12, list7, divSize, expression13, expression14, expression15, str, expression16, expression17, divLayoutProvider, expression18, expression19, divEdgeInsets, divInputMask, expression20, expression21, nativeInterface, divEdgeInsets2, expression22, expression23, expression24, list8, expression25, expression26, expression27, str2, list9, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, list10, list11, list12, list13, expression28, divVisibilityAction, list14, divSize2);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivInputJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivInputJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivInput.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivInput fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivInputJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivInputJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.INSTANCE;
        ALPHA_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        AUTOCAPITALIZATION_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Autocapitalization.AUTO, null, 2, null);
        ENTER_KEY_TYPE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, EnterKeyType.DEFAULT, null, 2, null);
        FONT_SIZE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 12L, null, 2, null);
        FONT_SIZE_UNIT_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivSizeUnit.SP, null, 2, null);
        HEIGHT_DEFAULT_VALUE = new DivSize.WrapContent(new DivWrapContentSize(null, null, null, 7, null));
        HINT_COLOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 1929379840, null, 2, null);
        IS_ENABLED_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        KEYBOARD_TYPE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, KeyboardType.MULTI_LINE_TEXT, null, 2, null);
        LETTER_SPACING_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        SELECT_ALL_ON_FOCUS_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        TEXT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivAlignmentHorizontal.START, null, 2, null);
        TEXT_ALIGNMENT_VERTICAL_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivAlignmentVertical.CENTER, null, 2, null);
        TEXT_COLOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, -16777216, null, 2, null);
        VISIBILITY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        WIDTH_DEFAULT_VALUE = new DivSize.MatchParent(new DivMatchParentSize(null, null, null, 7, null == true ? 1 : 0));
        CREATOR = new Function2() { // from class: com.yandex.div2.DivInput$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivInput invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivInput.Companion.fromJson(parsingEnvironment, jSONObject);
            }
        };
    }

    /* compiled from: DivInput.kt */
    public static final class NativeInterface implements JSONSerializable, Hashable {
        private Integer _hash;
        public final Expression color;
        public static final Companion Companion = new Companion(null);
        private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivInput$NativeInterface$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivInput.NativeInterface invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivInput.NativeInterface.Companion.fromJson(parsingEnvironment, jSONObject);
            }
        };

        public NativeInterface(Expression expression) {
            this.color = expression;
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this._hash;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = Reflection.getOrCreateKotlinClass(NativeInterface.class).hashCode() + this.color.hashCode();
            this._hash = Integer.valueOf(hashCode);
            return hashCode;
        }

        public final boolean equals(NativeInterface nativeInterface, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            return nativeInterface != null && ((Number) this.color.evaluate(expressionResolver)).intValue() == ((Number) nativeInterface.color.evaluate(expressionResolver2)).intValue();
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((DivInputNativeInterfaceJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivInputNativeInterfaceJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        /* compiled from: DivInput.kt */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final NativeInterface fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return ((DivInputNativeInterfaceJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivInputNativeInterfaceJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
            }
        }
    }

    /* compiled from: DivInput.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/yandex/div2/DivInput$Autocapitalization;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "AUTO", "NONE", "WORDS", "SENTENCES", "ALL_CHARACTERS", "Converter", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Autocapitalization {
        AUTO("auto"),
        NONE("none"),
        WORDS("words"),
        SENTENCES("sentences"),
        ALL_CHARACTERS("all_characters");


        @NotNull
        private final String value;

        /* renamed from: Converter, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        public static final Function1 TO_STRING = new Function1() { // from class: com.yandex.div2.DivInput$Autocapitalization$Converter$TO_STRING$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final String invoke(@NotNull DivInput.Autocapitalization autocapitalization) {
                return DivInput.Autocapitalization.INSTANCE.toString(autocapitalization);
            }
        };

        @NotNull
        public static final Function1 FROM_STRING = new Function1() { // from class: com.yandex.div2.DivInput$Autocapitalization$Converter$FROM_STRING$1
            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final DivInput.Autocapitalization invoke(@NotNull String str) {
                return DivInput.Autocapitalization.INSTANCE.fromString(str);
            }
        };

        Autocapitalization(String str) {
            this.value = str;
        }

        /* compiled from: DivInput.kt */
        /* renamed from: com.yandex.div2.DivInput$Autocapitalization$Converter, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final String toString(Autocapitalization autocapitalization) {
                return autocapitalization.value;
            }

            public final Autocapitalization fromString(String str) {
                Autocapitalization autocapitalization = Autocapitalization.AUTO;
                if (Intrinsics.areEqual(str, autocapitalization.value)) {
                    return autocapitalization;
                }
                Autocapitalization autocapitalization2 = Autocapitalization.NONE;
                if (Intrinsics.areEqual(str, autocapitalization2.value)) {
                    return autocapitalization2;
                }
                Autocapitalization autocapitalization3 = Autocapitalization.WORDS;
                if (Intrinsics.areEqual(str, autocapitalization3.value)) {
                    return autocapitalization3;
                }
                Autocapitalization autocapitalization4 = Autocapitalization.SENTENCES;
                if (Intrinsics.areEqual(str, autocapitalization4.value)) {
                    return autocapitalization4;
                }
                Autocapitalization autocapitalization5 = Autocapitalization.ALL_CHARACTERS;
                if (Intrinsics.areEqual(str, autocapitalization5.value)) {
                    return autocapitalization5;
                }
                return null;
            }
        }
    }

    /* compiled from: DivInput.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/yandex/div2/DivInput$EnterKeyType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "DEFAULT", "GO", ViewHierarchyConstants.SEARCH, "SEND", "DONE", "Converter", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum EnterKeyType {
        DEFAULT("default"),
        GO("go"),
        SEARCH(AppLovinEventTypes.USER_EXECUTED_SEARCH),
        SEND("send"),
        DONE("done");


        @NotNull
        private final String value;

        /* renamed from: Converter, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        public static final Function1 TO_STRING = new Function1() { // from class: com.yandex.div2.DivInput$EnterKeyType$Converter$TO_STRING$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final String invoke(@NotNull DivInput.EnterKeyType enterKeyType) {
                return DivInput.EnterKeyType.INSTANCE.toString(enterKeyType);
            }
        };

        @NotNull
        public static final Function1 FROM_STRING = new Function1() { // from class: com.yandex.div2.DivInput$EnterKeyType$Converter$FROM_STRING$1
            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final DivInput.EnterKeyType invoke(@NotNull String str) {
                return DivInput.EnterKeyType.INSTANCE.fromString(str);
            }
        };

        EnterKeyType(String str) {
            this.value = str;
        }

        /* compiled from: DivInput.kt */
        /* renamed from: com.yandex.div2.DivInput$EnterKeyType$Converter, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final String toString(EnterKeyType enterKeyType) {
                return enterKeyType.value;
            }

            public final EnterKeyType fromString(String str) {
                EnterKeyType enterKeyType = EnterKeyType.DEFAULT;
                if (Intrinsics.areEqual(str, enterKeyType.value)) {
                    return enterKeyType;
                }
                EnterKeyType enterKeyType2 = EnterKeyType.GO;
                if (Intrinsics.areEqual(str, enterKeyType2.value)) {
                    return enterKeyType2;
                }
                EnterKeyType enterKeyType3 = EnterKeyType.SEARCH;
                if (Intrinsics.areEqual(str, enterKeyType3.value)) {
                    return enterKeyType3;
                }
                EnterKeyType enterKeyType4 = EnterKeyType.SEND;
                if (Intrinsics.areEqual(str, enterKeyType4.value)) {
                    return enterKeyType4;
                }
                EnterKeyType enterKeyType5 = EnterKeyType.DONE;
                if (Intrinsics.areEqual(str, enterKeyType5.value)) {
                    return enterKeyType5;
                }
                return null;
            }
        }
    }

    /* compiled from: DivInput.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/yandex/div2/DivInput$KeyboardType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "SINGLE_LINE_TEXT", "MULTI_LINE_TEXT", "PHONE", "NUMBER", "EMAIL", "URI", "PASSWORD", "Converter", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum KeyboardType {
        SINGLE_LINE_TEXT("single_line_text"),
        MULTI_LINE_TEXT("multi_line_text"),
        PHONE("phone"),
        NUMBER("number"),
        EMAIL("email"),
        URI(ShareConstants.MEDIA_URI),
        PASSWORD("password");


        @NotNull
        private final String value;

        /* renamed from: Converter, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        public static final Function1 TO_STRING = new Function1() { // from class: com.yandex.div2.DivInput$KeyboardType$Converter$TO_STRING$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final String invoke(@NotNull DivInput.KeyboardType keyboardType) {
                return DivInput.KeyboardType.INSTANCE.toString(keyboardType);
            }
        };

        @NotNull
        public static final Function1 FROM_STRING = new Function1() { // from class: com.yandex.div2.DivInput$KeyboardType$Converter$FROM_STRING$1
            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final DivInput.KeyboardType invoke(@NotNull String str) {
                return DivInput.KeyboardType.INSTANCE.fromString(str);
            }
        };

        KeyboardType(String str) {
            this.value = str;
        }

        /* compiled from: DivInput.kt */
        /* renamed from: com.yandex.div2.DivInput$KeyboardType$Converter, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final String toString(KeyboardType keyboardType) {
                return keyboardType.value;
            }

            public final KeyboardType fromString(String str) {
                KeyboardType keyboardType = KeyboardType.SINGLE_LINE_TEXT;
                if (Intrinsics.areEqual(str, keyboardType.value)) {
                    return keyboardType;
                }
                KeyboardType keyboardType2 = KeyboardType.MULTI_LINE_TEXT;
                if (Intrinsics.areEqual(str, keyboardType2.value)) {
                    return keyboardType2;
                }
                KeyboardType keyboardType3 = KeyboardType.PHONE;
                if (Intrinsics.areEqual(str, keyboardType3.value)) {
                    return keyboardType3;
                }
                KeyboardType keyboardType4 = KeyboardType.NUMBER;
                if (Intrinsics.areEqual(str, keyboardType4.value)) {
                    return keyboardType4;
                }
                KeyboardType keyboardType5 = KeyboardType.EMAIL;
                if (Intrinsics.areEqual(str, keyboardType5.value)) {
                    return keyboardType5;
                }
                KeyboardType keyboardType6 = KeyboardType.URI;
                if (Intrinsics.areEqual(str, keyboardType6.value)) {
                    return keyboardType6;
                }
                KeyboardType keyboardType7 = KeyboardType.PASSWORD;
                if (Intrinsics.areEqual(str, keyboardType7.value)) {
                    return keyboardType7;
                }
                return null;
            }
        }
    }
}
