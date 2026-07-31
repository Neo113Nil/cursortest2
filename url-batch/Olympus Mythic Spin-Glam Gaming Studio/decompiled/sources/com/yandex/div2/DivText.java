package com.yandex.div2;

import com.adjust.sdk.Constants;
import com.facebook.share.internal.ShareConstants;
import com.pubmatic.sdk.omsdk.POBOMSDKLogConstants;
import com.sglib.easymobile.androidnative.gdpr.SplitContent;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivText;
import com.yandex.div2.DivTextImageAccessibilityJsonParser;
import com.yandex.div2.DivTextImageJsonParser;
import com.yandex.div2.DivTextJsonParser;
import com.yandex.div2.DivTextRangeJsonParser;
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

/* compiled from: DivText.kt */
/* loaded from: classes.dex */
public final class DivText implements JSONSerializable, Hashable, DivBase {
    private static final DivAnimation ACTION_ANIMATION_DEFAULT_VALUE;
    private static final Expression ALPHA_DEFAULT_VALUE;
    private static final Expression CAPTURE_FOCUS_ON_ACTION_DEFAULT_VALUE;
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final Expression FONT_SIZE_DEFAULT_VALUE;
    private static final Expression FONT_SIZE_UNIT_DEFAULT_VALUE;
    private static final DivSize.WrapContent HEIGHT_DEFAULT_VALUE;
    private static final Expression LETTER_SPACING_DEFAULT_VALUE;
    private static final Expression SELECTABLE_DEFAULT_VALUE;
    private static final Expression STRIKE_DEFAULT_VALUE;
    private static final Expression TEXT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE;
    private static final Expression TEXT_ALIGNMENT_VERTICAL_DEFAULT_VALUE;
    private static final Expression TEXT_COLOR_DEFAULT_VALUE;
    private static final Expression TIGHTEN_WIDTH_DEFAULT_VALUE;
    private static final Expression TRUNCATE_DEFAULT_VALUE;
    private static final Expression UNDERLINE_DEFAULT_VALUE;
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
    public final Expression autoEllipsize;
    private final List background;
    private final DivBorder border;
    public final Expression captureFocusOnAction;
    private final Expression columnSpan;
    private final List disappearActions;
    public final List doubletapActions;
    public final Ellipsis ellipsis;
    private final List extensions;
    private final DivFocus focus;
    public final Expression focusedTextColor;
    public final Expression fontFamily;
    public final Expression fontFeatureSettings;
    public final Expression fontSize;
    public final Expression fontSizeUnit;
    public final Expression fontVariationSettings;
    public final Expression fontWeight;
    public final Expression fontWeightValue;
    private final List functions;
    private final DivSize height;
    public final List hoverEndActions;
    public final List hoverStartActions;
    private final String id;
    public final List images;
    private final DivLayoutProvider layoutProvider;
    public final Expression letterSpacing;
    public final Expression lineHeight;
    public final List longtapActions;
    private final DivEdgeInsets margins;
    public final Expression maxLines;
    public final Expression minHiddenLines;
    private final DivEdgeInsets paddings;
    public final List pressEndActions;
    public final List pressStartActions;
    public final List ranges;
    private final Expression reuseId;
    private final Expression rowSpan;
    public final Expression selectable;
    private final List selectedActions;
    public final Expression strike;
    public final Expression text;
    public final Expression textAlignmentHorizontal;
    public final Expression textAlignmentVertical;
    public final Expression textColor;
    public final DivTextGradient textGradient;
    public final DivShadow textShadow;
    public final Expression tightenWidth;
    private final List tooltips;
    private final DivTransform transform;
    private final DivChangeTransition transitionChange;
    private final DivAppearanceTransition transitionIn;
    private final DivAppearanceTransition transitionOut;
    private final List transitionTriggers;
    public final Expression truncate;
    public final Expression underline;
    private final List variableTriggers;
    private final List variables;
    private final Expression visibility;
    private final DivVisibilityAction visibilityAction;
    private final List visibilityActions;
    private final DivSize width;

    public DivText(DivAccessibility divAccessibility, DivAction divAction, DivAnimation divAnimation, List list, Expression expression, Expression expression2, Expression expression3, List list2, Expression expression4, List list3, DivBorder divBorder, Expression expression5, Expression expression6, List list4, List list5, Ellipsis ellipsis, List list6, DivFocus divFocus, Expression expression7, Expression expression8, Expression expression9, Expression expression10, Expression expression11, Expression expression12, Expression expression13, Expression expression14, List list7, DivSize divSize, List list8, List list9, String str, List list10, DivLayoutProvider divLayoutProvider, Expression expression15, Expression expression16, List list11, DivEdgeInsets divEdgeInsets, Expression expression17, Expression expression18, DivEdgeInsets divEdgeInsets2, List list12, List list13, List list14, Expression expression19, Expression expression20, Expression expression21, List list15, Expression expression22, Expression expression23, Expression expression24, Expression expression25, Expression expression26, DivTextGradient divTextGradient, DivShadow divShadow, Expression expression27, List list16, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list17, Expression expression28, Expression expression29, List list18, List list19, Expression expression30, DivVisibilityAction divVisibilityAction, List list20, DivSize divSize2) {
        this.accessibility = divAccessibility;
        this.action = divAction;
        this.actionAnimation = divAnimation;
        this.actions = list;
        this.alignmentHorizontal = expression;
        this.alignmentVertical = expression2;
        this.alpha = expression3;
        this.animators = list2;
        this.autoEllipsize = expression4;
        this.background = list3;
        this.border = divBorder;
        this.captureFocusOnAction = expression5;
        this.columnSpan = expression6;
        this.disappearActions = list4;
        this.doubletapActions = list5;
        this.ellipsis = ellipsis;
        this.extensions = list6;
        this.focus = divFocus;
        this.focusedTextColor = expression7;
        this.fontFamily = expression8;
        this.fontFeatureSettings = expression9;
        this.fontSize = expression10;
        this.fontSizeUnit = expression11;
        this.fontVariationSettings = expression12;
        this.fontWeight = expression13;
        this.fontWeightValue = expression14;
        this.functions = list7;
        this.height = divSize;
        this.hoverEndActions = list8;
        this.hoverStartActions = list9;
        this.id = str;
        this.images = list10;
        this.layoutProvider = divLayoutProvider;
        this.letterSpacing = expression15;
        this.lineHeight = expression16;
        this.longtapActions = list11;
        this.margins = divEdgeInsets;
        this.maxLines = expression17;
        this.minHiddenLines = expression18;
        this.paddings = divEdgeInsets2;
        this.pressEndActions = list12;
        this.pressStartActions = list13;
        this.ranges = list14;
        this.reuseId = expression19;
        this.rowSpan = expression20;
        this.selectable = expression21;
        this.selectedActions = list15;
        this.strike = expression22;
        this.text = expression23;
        this.textAlignmentHorizontal = expression24;
        this.textAlignmentVertical = expression25;
        this.textColor = expression26;
        this.textGradient = divTextGradient;
        this.textShadow = divShadow;
        this.tightenWidth = expression27;
        this.tooltips = list16;
        this.transform = divTransform;
        this.transitionChange = divChangeTransition;
        this.transitionIn = divAppearanceTransition;
        this.transitionOut = divAppearanceTransition2;
        this.transitionTriggers = list17;
        this.truncate = expression28;
        this.underline = expression29;
        this.variableTriggers = list18;
        this.variables = list19;
        this.visibility = expression30;
        this.visibilityAction = divVisibilityAction;
        this.visibilityActions = list20;
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
        int i18;
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivText.class).hashCode();
        DivAccessibility accessibility = getAccessibility();
        int i19 = 0;
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
        int i20 = hash2 + i;
        Expression alignmentHorizontal = getAlignmentHorizontal();
        int hashCode2 = i20 + (alignmentHorizontal != null ? alignmentHorizontal.hashCode() : 0);
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
        int i21 = hashCode3 + i2;
        Expression expression = this.autoEllipsize;
        int hashCode4 = i21 + (expression != null ? expression.hashCode() : 0);
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
        int i22 = hashCode4 + i3;
        DivBorder border = getBorder();
        int hash3 = i22 + (border != null ? border.hash() : 0) + this.captureFocusOnAction.hashCode();
        Expression columnSpan = getColumnSpan();
        int hashCode5 = hash3 + (columnSpan != null ? columnSpan.hashCode() : 0);
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
        int i23 = hashCode5 + i4;
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
        int i24 = i23 + i5;
        Ellipsis ellipsis = this.ellipsis;
        int hash4 = i24 + (ellipsis != null ? ellipsis.hash() : 0);
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
        int i25 = hash4 + i6;
        DivFocus focus = getFocus();
        int hash5 = i25 + (focus != null ? focus.hash() : 0);
        Expression expression2 = this.focusedTextColor;
        int hashCode6 = hash5 + (expression2 != null ? expression2.hashCode() : 0);
        Expression expression3 = this.fontFamily;
        int hashCode7 = hashCode6 + (expression3 != null ? expression3.hashCode() : 0);
        Expression expression4 = this.fontFeatureSettings;
        int hashCode8 = hashCode7 + (expression4 != null ? expression4.hashCode() : 0) + this.fontSize.hashCode() + this.fontSizeUnit.hashCode();
        Expression expression5 = this.fontVariationSettings;
        int hashCode9 = hashCode8 + (expression5 != null ? expression5.hashCode() : 0);
        Expression expression6 = this.fontWeight;
        int hashCode10 = hashCode9 + (expression6 != null ? expression6.hashCode() : 0);
        Expression expression7 = this.fontWeightValue;
        int hashCode11 = hashCode10 + (expression7 != null ? expression7.hashCode() : 0);
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
        int hash6 = hashCode11 + i7 + getHeight().hash();
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
        int i26 = hash6 + i8;
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
        int i27 = i26 + i9;
        String id = getId();
        int hashCode12 = i27 + (id != null ? id.hashCode() : 0);
        List list5 = this.images;
        if (list5 != null) {
            Iterator it10 = list5.iterator();
            i10 = 0;
            while (it10.hasNext()) {
                i10 += ((Image) it10.next()).hash();
            }
        } else {
            i10 = 0;
        }
        int i28 = hashCode12 + i10;
        DivLayoutProvider layoutProvider = getLayoutProvider();
        int hash7 = i28 + (layoutProvider != null ? layoutProvider.hash() : 0) + this.letterSpacing.hashCode();
        Expression expression8 = this.lineHeight;
        int hashCode13 = hash7 + (expression8 != null ? expression8.hashCode() : 0);
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
        int i29 = hashCode13 + i11;
        DivEdgeInsets margins = getMargins();
        int hash8 = i29 + (margins != null ? margins.hash() : 0);
        Expression expression9 = this.maxLines;
        int hashCode14 = hash8 + (expression9 != null ? expression9.hashCode() : 0);
        Expression expression10 = this.minHiddenLines;
        int hashCode15 = hashCode14 + (expression10 != null ? expression10.hashCode() : 0);
        DivEdgeInsets paddings = getPaddings();
        int hash9 = hashCode15 + (paddings != null ? paddings.hash() : 0);
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
        int i30 = hash9 + i12;
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
        int i31 = i30 + i13;
        List list9 = this.ranges;
        if (list9 != null) {
            Iterator it14 = list9.iterator();
            i14 = 0;
            while (it14.hasNext()) {
                i14 += ((Range) it14.next()).hash();
            }
        } else {
            i14 = 0;
        }
        int i32 = i31 + i14;
        Expression reuseId = getReuseId();
        int hashCode16 = i32 + (reuseId != null ? reuseId.hashCode() : 0);
        Expression rowSpan = getRowSpan();
        int hashCode17 = hashCode16 + (rowSpan != null ? rowSpan.hashCode() : 0) + this.selectable.hashCode();
        List selectedActions = getSelectedActions();
        if (selectedActions != null) {
            Iterator it15 = selectedActions.iterator();
            i15 = 0;
            while (it15.hasNext()) {
                i15 += ((DivAction) it15.next()).hash();
            }
        } else {
            i15 = 0;
        }
        int hashCode18 = hashCode17 + i15 + this.strike.hashCode() + this.text.hashCode() + this.textAlignmentHorizontal.hashCode() + this.textAlignmentVertical.hashCode() + this.textColor.hashCode();
        DivTextGradient divTextGradient = this.textGradient;
        int hash10 = hashCode18 + (divTextGradient != null ? divTextGradient.hash() : 0);
        DivShadow divShadow = this.textShadow;
        int hash11 = hash10 + (divShadow != null ? divShadow.hash() : 0) + this.tightenWidth.hashCode();
        List tooltips = getTooltips();
        if (tooltips != null) {
            Iterator it16 = tooltips.iterator();
            i16 = 0;
            while (it16.hasNext()) {
                i16 += ((DivTooltip) it16.next()).hash();
            }
        } else {
            i16 = 0;
        }
        int i33 = hash11 + i16;
        DivTransform transform = getTransform();
        int hash12 = i33 + (transform != null ? transform.hash() : 0);
        DivChangeTransition transitionChange = getTransitionChange();
        int hash13 = hash12 + (transitionChange != null ? transitionChange.hash() : 0);
        DivAppearanceTransition transitionIn = getTransitionIn();
        int hash14 = hash13 + (transitionIn != null ? transitionIn.hash() : 0);
        DivAppearanceTransition transitionOut = getTransitionOut();
        int hash15 = hash14 + (transitionOut != null ? transitionOut.hash() : 0);
        List transitionTriggers = getTransitionTriggers();
        int hashCode19 = hash15 + (transitionTriggers != null ? transitionTriggers.hashCode() : 0) + this.truncate.hashCode() + this.underline.hashCode();
        List variableTriggers = getVariableTriggers();
        if (variableTriggers != null) {
            Iterator it17 = variableTriggers.iterator();
            i17 = 0;
            while (it17.hasNext()) {
                i17 += ((DivTrigger) it17.next()).hash();
            }
        } else {
            i17 = 0;
        }
        int i34 = hashCode19 + i17;
        List variables = getVariables();
        if (variables != null) {
            Iterator it18 = variables.iterator();
            i18 = 0;
            while (it18.hasNext()) {
                i18 += ((DivVariable) it18.next()).hash();
            }
        } else {
            i18 = 0;
        }
        int hashCode20 = i34 + i18 + getVisibility().hashCode();
        DivVisibilityAction visibilityAction = getVisibilityAction();
        int hash16 = hashCode20 + (visibilityAction != null ? visibilityAction.hash() : 0);
        List visibilityActions = getVisibilityActions();
        if (visibilityActions != null) {
            Iterator it19 = visibilityActions.iterator();
            while (it19.hasNext()) {
                i19 += ((DivVisibilityAction) it19.next()).hash();
            }
        }
        int hash17 = hash16 + i19 + getWidth().hash();
        this._hash = Integer.valueOf(hash17);
        return hash17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:633:0x0a58, code lost:
    
        if (r9.getVisibilityActions() == null) goto L773;
     */
    /* JADX WARN: Code restructure failed: missing block: B:643:0x09e0, code lost:
    
        if (r9.getVariables() == null) goto L740;
     */
    /* JADX WARN: Code restructure failed: missing block: B:647:0x0994, code lost:
    
        if (r9.getVariableTriggers() == null) goto L717;
     */
    /* JADX WARN: Code restructure failed: missing block: B:653:0x092c, code lost:
    
        if (r9.getTransitionTriggers() == null) goto L690;
     */
    /* JADX WARN: Code restructure failed: missing block: B:677:0x0877, code lost:
    
        if (r9.getTooltips() == null) goto L632;
     */
    /* JADX WARN: Code restructure failed: missing block: B:697:0x0793, code lost:
    
        if (r9.getSelectedActions() == null) goto L581;
     */
    /* JADX WARN: Code restructure failed: missing block: B:707:0x06eb, code lost:
    
        if (r9.ranges == null) goto L537;
     */
    /* JADX WARN: Code restructure failed: missing block: B:711:0x06a5, code lost:
    
        if (r9.pressStartActions == null) goto L514;
     */
    /* JADX WARN: Code restructure failed: missing block: B:715:0x065f, code lost:
    
        if (r9.pressEndActions == null) goto L491;
     */
    /* JADX WARN: Code restructure failed: missing block: B:735:0x05a9, code lost:
    
        if (r9.longtapActions == null) goto L432;
     */
    /* JADX WARN: Code restructure failed: missing block: B:749:0x050a, code lost:
    
        if (r9.images == null) goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:754:0x04b6, code lost:
    
        if (r9.hoverStartActions == null) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:758:0x0470, code lost:
    
        if (r9.hoverEndActions == null) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:763:0x041c, code lost:
    
        if (r9.getFunctions() == null) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:792:0x02dc, code lost:
    
        if (r9.getExtensions() == null) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:801:0x027c, code lost:
    
        if (r9.doubletapActions == null) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:805:0x0236, code lost:
    
        if (r9.getDisappearActions() == null) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:818:0x0194, code lost:
    
        if (r9.getBackground() == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:825:0x012a, code lost:
    
        if (r9.getAnimators() == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:837:0x007c, code lost:
    
        if (r9.actions == null) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(DivText divText, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
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
        boolean z20;
        if (divText == null) {
            return false;
        }
        DivAccessibility accessibility = getAccessibility();
        if (!(accessibility != null ? accessibility.equals(divText.getAccessibility(), expressionResolver, expressionResolver2) : divText.getAccessibility() == null)) {
            return false;
        }
        DivAction divAction = this.action;
        if (!(divAction != null ? divAction.equals(divText.action, expressionResolver, expressionResolver2) : divText.action == null) || !this.actionAnimation.equals(divText.actionAnimation, expressionResolver, expressionResolver2)) {
            return false;
        }
        List list = this.actions;
        if (list != null) {
            List list2 = divText.actions;
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
        Expression alignmentHorizontal2 = divText.getAlignmentHorizontal();
        if (divAlignmentHorizontal != (alignmentHorizontal2 != null ? (DivAlignmentHorizontal) alignmentHorizontal2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression alignmentVertical = getAlignmentVertical();
        DivAlignmentVertical divAlignmentVertical = alignmentVertical != null ? (DivAlignmentVertical) alignmentVertical.evaluate(expressionResolver) : null;
        Expression alignmentVertical2 = divText.getAlignmentVertical();
        if (divAlignmentVertical != (alignmentVertical2 != null ? (DivAlignmentVertical) alignmentVertical2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        if (!(((Number) getAlpha().evaluate(expressionResolver)).doubleValue() == ((Number) divText.getAlpha().evaluate(expressionResolver2)).doubleValue())) {
            return false;
        }
        List animators = getAnimators();
        if (animators != null) {
            List animators2 = divText.getAnimators();
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
        Expression expression = this.autoEllipsize;
        Boolean bool = expression != null ? (Boolean) expression.evaluate(expressionResolver) : null;
        Expression expression2 = divText.autoEllipsize;
        if (!Intrinsics.areEqual(bool, expression2 != null ? (Boolean) expression2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List background = getBackground();
        if (background != null) {
            List background2 = divText.getBackground();
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
        if (!(border != null ? border.equals(divText.getBorder(), expressionResolver, expressionResolver2) : divText.getBorder() == null) || ((Boolean) this.captureFocusOnAction.evaluate(expressionResolver)).booleanValue() != ((Boolean) divText.captureFocusOnAction.evaluate(expressionResolver2)).booleanValue()) {
            return false;
        }
        Expression columnSpan = getColumnSpan();
        Long l = columnSpan != null ? (Long) columnSpan.evaluate(expressionResolver) : null;
        Expression columnSpan2 = divText.getColumnSpan();
        if (!Intrinsics.areEqual(l, columnSpan2 != null ? (Long) columnSpan2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List disappearActions = getDisappearActions();
        if (disappearActions != null) {
            List disappearActions2 = divText.getDisappearActions();
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
            List list4 = divText.doubletapActions;
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
        Ellipsis ellipsis = this.ellipsis;
        if (!(ellipsis != null ? ellipsis.equals(divText.ellipsis, expressionResolver, expressionResolver2) : divText.ellipsis == null)) {
            return false;
        }
        List extensions = getExtensions();
        if (extensions != null) {
            List extensions2 = divText.getExtensions();
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
        if (!(focus != null ? focus.equals(divText.getFocus(), expressionResolver, expressionResolver2) : divText.getFocus() == null)) {
            return false;
        }
        Expression expression3 = this.focusedTextColor;
        Integer num = expression3 != null ? (Integer) expression3.evaluate(expressionResolver) : null;
        Expression expression4 = divText.focusedTextColor;
        if (!Intrinsics.areEqual(num, expression4 != null ? (Integer) expression4.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression expression5 = this.fontFamily;
        String str = expression5 != null ? (String) expression5.evaluate(expressionResolver) : null;
        Expression expression6 = divText.fontFamily;
        if (!Intrinsics.areEqual(str, expression6 != null ? (String) expression6.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression expression7 = this.fontFeatureSettings;
        String str2 = expression7 != null ? (String) expression7.evaluate(expressionResolver) : null;
        Expression expression8 = divText.fontFeatureSettings;
        if (!Intrinsics.areEqual(str2, expression8 != null ? (String) expression8.evaluate(expressionResolver2) : null) || ((Number) this.fontSize.evaluate(expressionResolver)).longValue() != ((Number) divText.fontSize.evaluate(expressionResolver2)).longValue() || this.fontSizeUnit.evaluate(expressionResolver) != divText.fontSizeUnit.evaluate(expressionResolver2)) {
            return false;
        }
        Expression expression9 = this.fontVariationSettings;
        JSONObject jSONObject = expression9 != null ? (JSONObject) expression9.evaluate(expressionResolver) : null;
        Expression expression10 = divText.fontVariationSettings;
        if (!Intrinsics.areEqual(jSONObject, expression10 != null ? (JSONObject) expression10.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression expression11 = this.fontWeight;
        DivFontWeight divFontWeight = expression11 != null ? (DivFontWeight) expression11.evaluate(expressionResolver) : null;
        Expression expression12 = divText.fontWeight;
        if (divFontWeight != (expression12 != null ? (DivFontWeight) expression12.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression expression13 = this.fontWeightValue;
        Long l2 = expression13 != null ? (Long) expression13.evaluate(expressionResolver) : null;
        Expression expression14 = divText.fontWeightValue;
        if (!Intrinsics.areEqual(l2, expression14 != null ? (Long) expression14.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List functions = getFunctions();
        if (functions != null) {
            List functions2 = divText.getFunctions();
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
        if (!z7 || !getHeight().equals(divText.getHeight(), expressionResolver, expressionResolver2)) {
            return false;
        }
        List list5 = this.hoverEndActions;
        if (list5 != null) {
            List list6 = divText.hoverEndActions;
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
            List list8 = divText.hoverStartActions;
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
        if (!z9 || !Intrinsics.areEqual(getId(), divText.getId())) {
            return false;
        }
        List list9 = this.images;
        if (list9 != null) {
            List list10 = divText.images;
            if (list10 != null) {
                if (list9.size() == list10.size()) {
                    int i19 = 0;
                    for (Object obj10 : list9) {
                        int i20 = i19 + 1;
                        if (i19 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((Image) obj10).equals((Image) list10.get(i19), expressionResolver, expressionResolver2)) {
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
        DivLayoutProvider layoutProvider = getLayoutProvider();
        if (!(layoutProvider != null ? layoutProvider.equals(divText.getLayoutProvider(), expressionResolver, expressionResolver2) : divText.getLayoutProvider() == null)) {
            return false;
        }
        if (!(((Number) this.letterSpacing.evaluate(expressionResolver)).doubleValue() == ((Number) divText.letterSpacing.evaluate(expressionResolver2)).doubleValue())) {
            return false;
        }
        Expression expression15 = this.lineHeight;
        Long l3 = expression15 != null ? (Long) expression15.evaluate(expressionResolver) : null;
        Expression expression16 = divText.lineHeight;
        if (!Intrinsics.areEqual(l3, expression16 != null ? (Long) expression16.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List list11 = this.longtapActions;
        if (list11 != null) {
            List list12 = divText.longtapActions;
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
        if (!(margins != null ? margins.equals(divText.getMargins(), expressionResolver, expressionResolver2) : divText.getMargins() == null)) {
            return false;
        }
        Expression expression17 = this.maxLines;
        Long l4 = expression17 != null ? (Long) expression17.evaluate(expressionResolver) : null;
        Expression expression18 = divText.maxLines;
        if (!Intrinsics.areEqual(l4, expression18 != null ? (Long) expression18.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression expression19 = this.minHiddenLines;
        Long l5 = expression19 != null ? (Long) expression19.evaluate(expressionResolver) : null;
        Expression expression20 = divText.minHiddenLines;
        if (!Intrinsics.areEqual(l5, expression20 != null ? (Long) expression20.evaluate(expressionResolver2) : null)) {
            return false;
        }
        DivEdgeInsets paddings = getPaddings();
        if (!(paddings != null ? paddings.equals(divText.getPaddings(), expressionResolver, expressionResolver2) : divText.getPaddings() == null)) {
            return false;
        }
        List list13 = this.pressEndActions;
        if (list13 != null) {
            List list14 = divText.pressEndActions;
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
            List list16 = divText.pressStartActions;
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
        List list17 = this.ranges;
        if (list17 != null) {
            List list18 = divText.ranges;
            if (list18 != null) {
                if (list17.size() == list18.size()) {
                    int i27 = 0;
                    for (Object obj14 : list17) {
                        int i28 = i27 + 1;
                        if (i27 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((Range) obj14).equals((Range) list18.get(i27), expressionResolver, expressionResolver2)) {
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
        Expression reuseId = getReuseId();
        String str3 = reuseId != null ? (String) reuseId.evaluate(expressionResolver) : null;
        Expression reuseId2 = divText.getReuseId();
        if (!Intrinsics.areEqual(str3, reuseId2 != null ? (String) reuseId2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression rowSpan = getRowSpan();
        Long l6 = rowSpan != null ? (Long) rowSpan.evaluate(expressionResolver) : null;
        Expression rowSpan2 = divText.getRowSpan();
        if (!Intrinsics.areEqual(l6, rowSpan2 != null ? (Long) rowSpan2.evaluate(expressionResolver2) : null) || ((Boolean) this.selectable.evaluate(expressionResolver)).booleanValue() != ((Boolean) divText.selectable.evaluate(expressionResolver2)).booleanValue()) {
            return false;
        }
        List selectedActions = getSelectedActions();
        if (selectedActions != null) {
            List selectedActions2 = divText.getSelectedActions();
            if (selectedActions2 != null) {
                if (selectedActions.size() == selectedActions2.size()) {
                    int i29 = 0;
                    for (Object obj15 : selectedActions) {
                        int i30 = i29 + 1;
                        if (i29 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivAction) obj15).equals((DivAction) selectedActions2.get(i29), expressionResolver, expressionResolver2)) {
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
        if (!z15 || this.strike.evaluate(expressionResolver) != divText.strike.evaluate(expressionResolver2) || !Intrinsics.areEqual(this.text.evaluate(expressionResolver), divText.text.evaluate(expressionResolver2)) || this.textAlignmentHorizontal.evaluate(expressionResolver) != divText.textAlignmentHorizontal.evaluate(expressionResolver2) || this.textAlignmentVertical.evaluate(expressionResolver) != divText.textAlignmentVertical.evaluate(expressionResolver2) || ((Number) this.textColor.evaluate(expressionResolver)).intValue() != ((Number) divText.textColor.evaluate(expressionResolver2)).intValue()) {
            return false;
        }
        DivTextGradient divTextGradient = this.textGradient;
        if (!(divTextGradient != null ? divTextGradient.equals(divText.textGradient, expressionResolver, expressionResolver2) : divText.textGradient == null)) {
            return false;
        }
        DivShadow divShadow = this.textShadow;
        if (!(divShadow != null ? divShadow.equals(divText.textShadow, expressionResolver, expressionResolver2) : divText.textShadow == null) || ((Boolean) this.tightenWidth.evaluate(expressionResolver)).booleanValue() != ((Boolean) divText.tightenWidth.evaluate(expressionResolver2)).booleanValue()) {
            return false;
        }
        List tooltips = getTooltips();
        if (tooltips != null) {
            List tooltips2 = divText.getTooltips();
            if (tooltips2 != null) {
                if (tooltips.size() == tooltips2.size()) {
                    int i31 = 0;
                    for (Object obj16 : tooltips) {
                        int i32 = i31 + 1;
                        if (i31 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivTooltip) obj16).equals((DivTooltip) tooltips2.get(i31), expressionResolver, expressionResolver2)) {
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
        DivTransform transform = getTransform();
        if (!(transform != null ? transform.equals(divText.getTransform(), expressionResolver, expressionResolver2) : divText.getTransform() == null)) {
            return false;
        }
        DivChangeTransition transitionChange = getTransitionChange();
        if (!(transitionChange != null ? transitionChange.equals(divText.getTransitionChange(), expressionResolver, expressionResolver2) : divText.getTransitionChange() == null)) {
            return false;
        }
        DivAppearanceTransition transitionIn = getTransitionIn();
        if (!(transitionIn != null ? transitionIn.equals(divText.getTransitionIn(), expressionResolver, expressionResolver2) : divText.getTransitionIn() == null)) {
            return false;
        }
        DivAppearanceTransition transitionOut = getTransitionOut();
        if (!(transitionOut != null ? transitionOut.equals(divText.getTransitionOut(), expressionResolver, expressionResolver2) : divText.getTransitionOut() == null)) {
            return false;
        }
        List transitionTriggers = getTransitionTriggers();
        if (transitionTriggers != null) {
            List transitionTriggers2 = divText.getTransitionTriggers();
            if (transitionTriggers2 != null) {
                if (transitionTriggers.size() == transitionTriggers2.size()) {
                    int i33 = 0;
                    for (Object obj17 : transitionTriggers) {
                        int i34 = i33 + 1;
                        if (i33 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivTransitionTrigger) obj17) == ((DivTransitionTrigger) transitionTriggers2.get(i33))) {
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
        if (!z17 || this.truncate.evaluate(expressionResolver) != divText.truncate.evaluate(expressionResolver2) || this.underline.evaluate(expressionResolver) != divText.underline.evaluate(expressionResolver2)) {
            return false;
        }
        List variableTriggers = getVariableTriggers();
        if (variableTriggers != null) {
            List variableTriggers2 = divText.getVariableTriggers();
            if (variableTriggers2 != null) {
                if (variableTriggers.size() == variableTriggers2.size()) {
                    int i35 = 0;
                    for (Object obj18 : variableTriggers) {
                        int i36 = i35 + 1;
                        if (i35 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivTrigger) obj18).equals((DivTrigger) variableTriggers2.get(i35), expressionResolver, expressionResolver2)) {
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
        if (!z18) {
            return false;
        }
        List variables = getVariables();
        if (variables != null) {
            List variables2 = divText.getVariables();
            if (variables2 != null) {
                if (variables.size() == variables2.size()) {
                    int i37 = 0;
                    for (Object obj19 : variables) {
                        int i38 = i37 + 1;
                        if (i37 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivVariable) obj19).equals((DivVariable) variables2.get(i37), expressionResolver, expressionResolver2)) {
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
        if (!z19 || getVisibility().evaluate(expressionResolver) != divText.getVisibility().evaluate(expressionResolver2)) {
            return false;
        }
        DivVisibilityAction visibilityAction = getVisibilityAction();
        if (!(visibilityAction != null ? visibilityAction.equals(divText.getVisibilityAction(), expressionResolver, expressionResolver2) : divText.getVisibilityAction() == null)) {
            return false;
        }
        List visibilityActions = getVisibilityActions();
        if (visibilityActions != null) {
            List visibilityActions2 = divText.getVisibilityActions();
            if (visibilityActions2 != null) {
                if (visibilityActions.size() == visibilityActions2.size()) {
                    int i39 = 0;
                    for (Object obj20 : visibilityActions) {
                        int i40 = i39 + 1;
                        if (i39 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivVisibilityAction) obj20).equals((DivVisibilityAction) visibilityActions2.get(i39), expressionResolver, expressionResolver2)) {
                            i39 = i40;
                        }
                    }
                    z20 = true;
                }
                z20 = false;
                break;
            }
            return false;
        }
        return z20 && getWidth().equals(divText.getWidth(), expressionResolver, expressionResolver2);
    }

    public static /* synthetic */ DivText copy$default(DivText divText, DivAccessibility divAccessibility, DivAction divAction, DivAnimation divAnimation, List list, Expression expression, Expression expression2, Expression expression3, List list2, Expression expression4, List list3, DivBorder divBorder, Expression expression5, Expression expression6, List list4, List list5, Ellipsis ellipsis, List list6, DivFocus divFocus, Expression expression7, Expression expression8, Expression expression9, Expression expression10, Expression expression11, Expression expression12, Expression expression13, Expression expression14, List list7, DivSize divSize, List list8, List list9, String str, List list10, DivLayoutProvider divLayoutProvider, Expression expression15, Expression expression16, List list11, DivEdgeInsets divEdgeInsets, Expression expression17, Expression expression18, DivEdgeInsets divEdgeInsets2, List list12, List list13, List list14, Expression expression19, Expression expression20, Expression expression21, List list15, Expression expression22, Expression expression23, Expression expression24, Expression expression25, Expression expression26, DivTextGradient divTextGradient, DivShadow divShadow, Expression expression27, List list16, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list17, Expression expression28, Expression expression29, List list18, List list19, Expression expression30, DivVisibilityAction divVisibilityAction, List list20, DivSize divSize2, int i, int i2, int i3, Object obj) {
        DivAccessibility accessibility = (i & 1) != 0 ? divText.getAccessibility() : divAccessibility;
        DivAction divAction2 = (i & 2) != 0 ? divText.action : divAction;
        DivAnimation divAnimation2 = (i & 4) != 0 ? divText.actionAnimation : divAnimation;
        List list21 = (i & 8) != 0 ? divText.actions : list;
        Expression alignmentHorizontal = (i & 16) != 0 ? divText.getAlignmentHorizontal() : expression;
        Expression alignmentVertical = (i & 32) != 0 ? divText.getAlignmentVertical() : expression2;
        Expression alpha = (i & 64) != 0 ? divText.getAlpha() : expression3;
        List animators = (i & 128) != 0 ? divText.getAnimators() : list2;
        Expression expression31 = (i & 256) != 0 ? divText.autoEllipsize : expression4;
        List background = (i & 512) != 0 ? divText.getBackground() : list3;
        DivBorder border = (i & 1024) != 0 ? divText.getBorder() : divBorder;
        Expression expression32 = (i & 2048) != 0 ? divText.captureFocusOnAction : expression5;
        Expression columnSpan = (i & 4096) != 0 ? divText.getColumnSpan() : expression6;
        List disappearActions = (i & 8192) != 0 ? divText.getDisappearActions() : list4;
        List list22 = (i & 16384) != 0 ? divText.doubletapActions : list5;
        Ellipsis ellipsis2 = (i & 32768) != 0 ? divText.ellipsis : ellipsis;
        List extensions = (i & 65536) != 0 ? divText.getExtensions() : list6;
        DivFocus focus = (i & 131072) != 0 ? divText.getFocus() : divFocus;
        Ellipsis ellipsis3 = ellipsis2;
        Expression expression33 = (i & 262144) != 0 ? divText.focusedTextColor : expression7;
        Expression expression34 = (i & 524288) != 0 ? divText.fontFamily : expression8;
        Expression expression35 = (i & 1048576) != 0 ? divText.fontFeatureSettings : expression9;
        Expression expression36 = (i & 2097152) != 0 ? divText.fontSize : expression10;
        Expression expression37 = (i & 4194304) != 0 ? divText.fontSizeUnit : expression11;
        Expression expression38 = (i & 8388608) != 0 ? divText.fontVariationSettings : expression12;
        Expression expression39 = (i & 16777216) != 0 ? divText.fontWeight : expression13;
        Expression expression40 = (i & 33554432) != 0 ? divText.fontWeightValue : expression14;
        List functions = (i & 67108864) != 0 ? divText.getFunctions() : list7;
        DivSize height = (i & 134217728) != 0 ? divText.getHeight() : divSize;
        Expression expression41 = expression40;
        List list23 = (i & 268435456) != 0 ? divText.hoverEndActions : list8;
        List list24 = (i & 536870912) != 0 ? divText.hoverStartActions : list9;
        String id = (i & 1073741824) != 0 ? divText.getId() : str;
        List list25 = (i & Integer.MIN_VALUE) != 0 ? divText.images : list10;
        DivLayoutProvider layoutProvider = (i2 & 1) != 0 ? divText.getLayoutProvider() : divLayoutProvider;
        List list26 = list25;
        Expression expression42 = (i2 & 2) != 0 ? divText.letterSpacing : expression15;
        Expression expression43 = (i2 & 4) != 0 ? divText.lineHeight : expression16;
        List list27 = (i2 & 8) != 0 ? divText.longtapActions : list11;
        return divText.copy(accessibility, divAction2, divAnimation2, list21, alignmentHorizontal, alignmentVertical, alpha, animators, expression31, background, border, expression32, columnSpan, disappearActions, list22, ellipsis3, extensions, focus, expression33, expression34, expression35, expression36, expression37, expression38, expression39, expression41, functions, height, list23, list24, id, list26, layoutProvider, expression42, expression43, list27, (i2 & 16) != 0 ? divText.getMargins() : divEdgeInsets, (i2 & 32) != 0 ? divText.maxLines : expression17, (i2 & 64) != 0 ? divText.minHiddenLines : expression18, (i2 & 128) != 0 ? divText.getPaddings() : divEdgeInsets2, (i2 & 256) != 0 ? divText.pressEndActions : list12, (i2 & 512) != 0 ? divText.pressStartActions : list13, (i2 & 1024) != 0 ? divText.ranges : list14, (i2 & 2048) != 0 ? divText.getReuseId() : expression19, (i2 & 4096) != 0 ? divText.getRowSpan() : expression20, (i2 & 8192) != 0 ? divText.selectable : expression21, (i2 & 16384) != 0 ? divText.getSelectedActions() : list15, (i2 & 32768) != 0 ? divText.strike : expression22, (i2 & 65536) != 0 ? divText.text : expression23, (i2 & 131072) != 0 ? divText.textAlignmentHorizontal : expression24, (i2 & 262144) != 0 ? divText.textAlignmentVertical : expression25, (i2 & 524288) != 0 ? divText.textColor : expression26, (i2 & 1048576) != 0 ? divText.textGradient : divTextGradient, (i2 & 2097152) != 0 ? divText.textShadow : divShadow, (i2 & 4194304) != 0 ? divText.tightenWidth : expression27, (i2 & 8388608) != 0 ? divText.getTooltips() : list16, (i2 & 16777216) != 0 ? divText.getTransform() : divTransform, (i2 & 33554432) != 0 ? divText.getTransitionChange() : divChangeTransition, (i2 & 67108864) != 0 ? divText.getTransitionIn() : divAppearanceTransition, (i2 & 134217728) != 0 ? divText.getTransitionOut() : divAppearanceTransition2, (i2 & 268435456) != 0 ? divText.getTransitionTriggers() : list17, (i2 & 536870912) != 0 ? divText.truncate : expression28, (i2 & 1073741824) != 0 ? divText.underline : expression29, (i2 & Integer.MIN_VALUE) != 0 ? divText.getVariableTriggers() : list18, (i3 & 1) != 0 ? divText.getVariables() : list19, (i3 & 2) != 0 ? divText.getVisibility() : expression30, (i3 & 4) != 0 ? divText.getVisibilityAction() : divVisibilityAction, (i3 & 8) != 0 ? divText.getVisibilityActions() : list20, (i3 & 16) != 0 ? divText.getWidth() : divSize2);
    }

    public final DivText copy(DivAccessibility divAccessibility, DivAction divAction, DivAnimation divAnimation, List list, Expression expression, Expression expression2, Expression expression3, List list2, Expression expression4, List list3, DivBorder divBorder, Expression expression5, Expression expression6, List list4, List list5, Ellipsis ellipsis, List list6, DivFocus divFocus, Expression expression7, Expression expression8, Expression expression9, Expression expression10, Expression expression11, Expression expression12, Expression expression13, Expression expression14, List list7, DivSize divSize, List list8, List list9, String str, List list10, DivLayoutProvider divLayoutProvider, Expression expression15, Expression expression16, List list11, DivEdgeInsets divEdgeInsets, Expression expression17, Expression expression18, DivEdgeInsets divEdgeInsets2, List list12, List list13, List list14, Expression expression19, Expression expression20, Expression expression21, List list15, Expression expression22, Expression expression23, Expression expression24, Expression expression25, Expression expression26, DivTextGradient divTextGradient, DivShadow divShadow, Expression expression27, List list16, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list17, Expression expression28, Expression expression29, List list18, List list19, Expression expression30, DivVisibilityAction divVisibilityAction, List list20, DivSize divSize2) {
        return new DivText(divAccessibility, divAction, divAnimation, list, expression, expression2, expression3, list2, expression4, list3, divBorder, expression5, expression6, list4, list5, ellipsis, list6, divFocus, expression7, expression8, expression9, expression10, expression11, expression12, expression13, expression14, list7, divSize, list8, list9, str, list10, divLayoutProvider, expression15, expression16, list11, divEdgeInsets, expression17, expression18, divEdgeInsets2, list12, list13, list14, expression19, expression20, expression21, list15, expression22, expression23, expression24, expression25, expression26, divTextGradient, divShadow, expression27, list16, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, list17, expression28, expression29, list18, list19, expression30, divVisibilityAction, list20, divSize2);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivTextJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTextJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivText.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivText fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivTextJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTextJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
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
        FONT_SIZE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 12L, null, 2, null);
        FONT_SIZE_UNIT_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivSizeUnit.SP, null, 2, null);
        HEIGHT_DEFAULT_VALUE = new DivSize.WrapContent(new DivWrapContentSize(null, null, null == true ? 1 : 0, 7, null));
        LETTER_SPACING_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        Boolean bool = Boolean.FALSE;
        SELECTABLE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, bool, null, 2, null);
        DivLineStyle divLineStyle = DivLineStyle.NONE;
        STRIKE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, divLineStyle, null, 2, null);
        TEXT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivAlignmentHorizontal.START, null, 2, null);
        TEXT_ALIGNMENT_VERTICAL_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivAlignmentVertical.TOP, null, 2, null);
        TEXT_COLOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, -16777216, null, 2, null);
        TIGHTEN_WIDTH_DEFAULT_VALUE = Expression.Companion.constant$default(companion, bool, null, 2, null);
        TRUNCATE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Truncate.END, null, 2, null);
        UNDERLINE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, divLineStyle, null, 2, null);
        VISIBILITY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        WIDTH_DEFAULT_VALUE = new DivSize.MatchParent(new DivMatchParentSize(null, null, null == true ? 1 : 0, 7, null));
        CREATOR = new Function2() { // from class: com.yandex.div2.DivText$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivText invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivText.Companion.fromJson(parsingEnvironment, jSONObject);
            }
        };
    }

    /* compiled from: DivText.kt */
    public static final class Range implements JSONSerializable, Hashable {
        private static final Expression BASELINE_OFFSET_DEFAULT_VALUE;
        private static final Function2 CREATOR;
        public static final Companion Companion = new Companion(null);
        private static final Expression FONT_SIZE_UNIT_DEFAULT_VALUE;
        private static final Expression START_DEFAULT_VALUE;
        private Integer _hash;
        public final List actions;
        public final Expression alignmentVertical;
        public final DivTextRangeBackground background;
        public final Expression baselineOffset;
        public final DivTextRangeBorder border;
        public final Expression end;
        public final Expression fontFamily;
        public final Expression fontFeatureSettings;
        public final Expression fontSize;
        public final Expression fontSizeUnit;
        public final Expression fontVariationSettings;
        public final Expression fontWeight;
        public final Expression fontWeightValue;
        public final Expression letterSpacing;
        public final Expression lineHeight;
        public final DivTextRangeMask mask;
        public final Expression start;
        public final Expression strike;
        public final Expression textColor;
        public final DivShadow textShadow;
        public final Expression topOffset;
        public final Expression underline;

        public Range(List list, Expression expression, DivTextRangeBackground divTextRangeBackground, Expression expression2, DivTextRangeBorder divTextRangeBorder, Expression expression3, Expression expression4, Expression expression5, Expression expression6, Expression expression7, Expression expression8, Expression expression9, Expression expression10, Expression expression11, Expression expression12, DivTextRangeMask divTextRangeMask, Expression expression13, Expression expression14, Expression expression15, DivShadow divShadow, Expression expression16, Expression expression17) {
            this.actions = list;
            this.alignmentVertical = expression;
            this.background = divTextRangeBackground;
            this.baselineOffset = expression2;
            this.border = divTextRangeBorder;
            this.end = expression3;
            this.fontFamily = expression4;
            this.fontFeatureSettings = expression5;
            this.fontSize = expression6;
            this.fontSizeUnit = expression7;
            this.fontVariationSettings = expression8;
            this.fontWeight = expression9;
            this.fontWeightValue = expression10;
            this.letterSpacing = expression11;
            this.lineHeight = expression12;
            this.mask = divTextRangeMask;
            this.start = expression13;
            this.strike = expression14;
            this.textColor = expression15;
            this.textShadow = divShadow;
            this.topOffset = expression16;
            this.underline = expression17;
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            int i;
            Integer num = this._hash;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = Reflection.getOrCreateKotlinClass(Range.class).hashCode();
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
            int i2 = hashCode + i;
            Expression expression = this.alignmentVertical;
            int hashCode2 = i2 + (expression != null ? expression.hashCode() : 0);
            DivTextRangeBackground divTextRangeBackground = this.background;
            int hash = hashCode2 + (divTextRangeBackground != null ? divTextRangeBackground.hash() : 0) + this.baselineOffset.hashCode();
            DivTextRangeBorder divTextRangeBorder = this.border;
            int hash2 = hash + (divTextRangeBorder != null ? divTextRangeBorder.hash() : 0);
            Expression expression2 = this.end;
            int hashCode3 = hash2 + (expression2 != null ? expression2.hashCode() : 0);
            Expression expression3 = this.fontFamily;
            int hashCode4 = hashCode3 + (expression3 != null ? expression3.hashCode() : 0);
            Expression expression4 = this.fontFeatureSettings;
            int hashCode5 = hashCode4 + (expression4 != null ? expression4.hashCode() : 0);
            Expression expression5 = this.fontSize;
            int hashCode6 = hashCode5 + (expression5 != null ? expression5.hashCode() : 0) + this.fontSizeUnit.hashCode();
            Expression expression6 = this.fontVariationSettings;
            int hashCode7 = hashCode6 + (expression6 != null ? expression6.hashCode() : 0);
            Expression expression7 = this.fontWeight;
            int hashCode8 = hashCode7 + (expression7 != null ? expression7.hashCode() : 0);
            Expression expression8 = this.fontWeightValue;
            int hashCode9 = hashCode8 + (expression8 != null ? expression8.hashCode() : 0);
            Expression expression9 = this.letterSpacing;
            int hashCode10 = hashCode9 + (expression9 != null ? expression9.hashCode() : 0);
            Expression expression10 = this.lineHeight;
            int hashCode11 = hashCode10 + (expression10 != null ? expression10.hashCode() : 0);
            DivTextRangeMask divTextRangeMask = this.mask;
            int hash3 = hashCode11 + (divTextRangeMask != null ? divTextRangeMask.hash() : 0) + this.start.hashCode();
            Expression expression11 = this.strike;
            int hashCode12 = hash3 + (expression11 != null ? expression11.hashCode() : 0);
            Expression expression12 = this.textColor;
            int hashCode13 = hashCode12 + (expression12 != null ? expression12.hashCode() : 0);
            DivShadow divShadow = this.textShadow;
            int hash4 = hashCode13 + (divShadow != null ? divShadow.hash() : 0);
            Expression expression13 = this.topOffset;
            int hashCode14 = hash4 + (expression13 != null ? expression13.hashCode() : 0);
            Expression expression14 = this.underline;
            int hashCode15 = hashCode14 + (expression14 != null ? expression14.hashCode() : 0);
            this._hash = Integer.valueOf(hashCode15);
            return hashCode15;
        }

        public final boolean equals(Range range, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            if (range == null) {
                return false;
            }
            List list = this.actions;
            if (list != null) {
                List list2 = range.actions;
                if (list2 == null || list.size() != list2.size()) {
                    return false;
                }
                int i = 0;
                for (Object obj : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    if (!((DivAction) obj).equals((DivAction) list2.get(i), expressionResolver, expressionResolver2)) {
                        return false;
                    }
                    i = i2;
                }
            } else if (range.actions != null) {
                return false;
            }
            Expression expression = this.alignmentVertical;
            DivTextAlignmentVertical divTextAlignmentVertical = expression != null ? (DivTextAlignmentVertical) expression.evaluate(expressionResolver) : null;
            Expression expression2 = range.alignmentVertical;
            if (divTextAlignmentVertical != (expression2 != null ? (DivTextAlignmentVertical) expression2.evaluate(expressionResolver2) : null)) {
                return false;
            }
            DivTextRangeBackground divTextRangeBackground = this.background;
            if (!(divTextRangeBackground != null ? divTextRangeBackground.equals(range.background, expressionResolver, expressionResolver2) : range.background == null)) {
                return false;
            }
            if (!(((Number) this.baselineOffset.evaluate(expressionResolver)).doubleValue() == ((Number) range.baselineOffset.evaluate(expressionResolver2)).doubleValue())) {
                return false;
            }
            DivTextRangeBorder divTextRangeBorder = this.border;
            if (!(divTextRangeBorder != null ? divTextRangeBorder.equals(range.border, expressionResolver, expressionResolver2) : range.border == null)) {
                return false;
            }
            Expression expression3 = this.end;
            Long l = expression3 != null ? (Long) expression3.evaluate(expressionResolver) : null;
            Expression expression4 = range.end;
            if (!Intrinsics.areEqual(l, expression4 != null ? (Long) expression4.evaluate(expressionResolver2) : null)) {
                return false;
            }
            Expression expression5 = this.fontFamily;
            String str = expression5 != null ? (String) expression5.evaluate(expressionResolver) : null;
            Expression expression6 = range.fontFamily;
            if (!Intrinsics.areEqual(str, expression6 != null ? (String) expression6.evaluate(expressionResolver2) : null)) {
                return false;
            }
            Expression expression7 = this.fontFeatureSettings;
            String str2 = expression7 != null ? (String) expression7.evaluate(expressionResolver) : null;
            Expression expression8 = range.fontFeatureSettings;
            if (!Intrinsics.areEqual(str2, expression8 != null ? (String) expression8.evaluate(expressionResolver2) : null)) {
                return false;
            }
            Expression expression9 = this.fontSize;
            Long l2 = expression9 != null ? (Long) expression9.evaluate(expressionResolver) : null;
            Expression expression10 = range.fontSize;
            if (!Intrinsics.areEqual(l2, expression10 != null ? (Long) expression10.evaluate(expressionResolver2) : null) || this.fontSizeUnit.evaluate(expressionResolver) != range.fontSizeUnit.evaluate(expressionResolver2)) {
                return false;
            }
            Expression expression11 = this.fontVariationSettings;
            JSONObject jSONObject = expression11 != null ? (JSONObject) expression11.evaluate(expressionResolver) : null;
            Expression expression12 = range.fontVariationSettings;
            if (!Intrinsics.areEqual(jSONObject, expression12 != null ? (JSONObject) expression12.evaluate(expressionResolver2) : null)) {
                return false;
            }
            Expression expression13 = this.fontWeight;
            DivFontWeight divFontWeight = expression13 != null ? (DivFontWeight) expression13.evaluate(expressionResolver) : null;
            Expression expression14 = range.fontWeight;
            if (divFontWeight != (expression14 != null ? (DivFontWeight) expression14.evaluate(expressionResolver2) : null)) {
                return false;
            }
            Expression expression15 = this.fontWeightValue;
            Long l3 = expression15 != null ? (Long) expression15.evaluate(expressionResolver) : null;
            Expression expression16 = range.fontWeightValue;
            if (!Intrinsics.areEqual(l3, expression16 != null ? (Long) expression16.evaluate(expressionResolver2) : null)) {
                return false;
            }
            Expression expression17 = this.letterSpacing;
            Double d = expression17 != null ? (Double) expression17.evaluate(expressionResolver) : null;
            Expression expression18 = range.letterSpacing;
            if (!Intrinsics.areEqual(d, expression18 != null ? (Double) expression18.evaluate(expressionResolver2) : null)) {
                return false;
            }
            Expression expression19 = this.lineHeight;
            Long l4 = expression19 != null ? (Long) expression19.evaluate(expressionResolver) : null;
            Expression expression20 = range.lineHeight;
            if (!Intrinsics.areEqual(l4, expression20 != null ? (Long) expression20.evaluate(expressionResolver2) : null)) {
                return false;
            }
            DivTextRangeMask divTextRangeMask = this.mask;
            if (!(divTextRangeMask != null ? divTextRangeMask.equals(range.mask, expressionResolver, expressionResolver2) : range.mask == null) || ((Number) this.start.evaluate(expressionResolver)).longValue() != ((Number) range.start.evaluate(expressionResolver2)).longValue()) {
                return false;
            }
            Expression expression21 = this.strike;
            DivLineStyle divLineStyle = expression21 != null ? (DivLineStyle) expression21.evaluate(expressionResolver) : null;
            Expression expression22 = range.strike;
            if (divLineStyle != (expression22 != null ? (DivLineStyle) expression22.evaluate(expressionResolver2) : null)) {
                return false;
            }
            Expression expression23 = this.textColor;
            Integer num = expression23 != null ? (Integer) expression23.evaluate(expressionResolver) : null;
            Expression expression24 = range.textColor;
            if (!Intrinsics.areEqual(num, expression24 != null ? (Integer) expression24.evaluate(expressionResolver2) : null)) {
                return false;
            }
            DivShadow divShadow = this.textShadow;
            if (!(divShadow != null ? divShadow.equals(range.textShadow, expressionResolver, expressionResolver2) : range.textShadow == null)) {
                return false;
            }
            Expression expression25 = this.topOffset;
            Long l5 = expression25 != null ? (Long) expression25.evaluate(expressionResolver) : null;
            Expression expression26 = range.topOffset;
            if (!Intrinsics.areEqual(l5, expression26 != null ? (Long) expression26.evaluate(expressionResolver2) : null)) {
                return false;
            }
            Expression expression27 = this.underline;
            DivLineStyle divLineStyle2 = expression27 != null ? (DivLineStyle) expression27.evaluate(expressionResolver) : null;
            Expression expression28 = range.underline;
            return divLineStyle2 == (expression28 != null ? (DivLineStyle) expression28.evaluate(expressionResolver2) : null);
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((DivTextRangeJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTextRangeJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        /* compiled from: DivText.kt */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Range fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return ((DivTextRangeJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTextRangeJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
            }
        }

        static {
            Expression.Companion companion = Expression.INSTANCE;
            BASELINE_OFFSET_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
            FONT_SIZE_UNIT_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivSizeUnit.SP, null, 2, null);
            START_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
            CREATOR = new Function2() { // from class: com.yandex.div2.DivText$Range$Companion$CREATOR$1
                @Override // kotlin.jvm.functions.Function2
                @NotNull
                public final DivText.Range invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                    return DivText.Range.Companion.fromJson(parsingEnvironment, jSONObject);
                }
            };
        }
    }

    /* compiled from: DivText.kt */
    public static final class Image implements JSONSerializable, Hashable {
        private static final Expression ALIGNMENT_VERTICAL_DEFAULT_VALUE;
        private static final Function2 CREATOR;
        public static final Companion Companion = new Companion(null);
        private static final DivFixedSize HEIGHT_DEFAULT_VALUE;
        private static final Expression INDEXING_DIRECTION_DEFAULT_VALUE;
        private static final Expression PRELOAD_REQUIRED_DEFAULT_VALUE;
        private static final Expression TINT_MODE_DEFAULT_VALUE;
        private static final DivFixedSize WIDTH_DEFAULT_VALUE;
        private Integer _hash;
        public final Accessibility accessibility;
        public final Expression alignmentVertical;
        public final DivFixedSize height;
        public final Expression indexingDirection;
        public final Expression preloadRequired;
        public final Expression start;
        public final Expression tintColor;
        public final Expression tintMode;
        public final Expression url;
        public final DivFixedSize width;

        public Image(Accessibility accessibility, Expression expression, DivFixedSize divFixedSize, Expression expression2, Expression expression3, Expression expression4, Expression expression5, Expression expression6, Expression expression7, DivFixedSize divFixedSize2) {
            this.accessibility = accessibility;
            this.alignmentVertical = expression;
            this.height = divFixedSize;
            this.indexingDirection = expression2;
            this.preloadRequired = expression3;
            this.start = expression4;
            this.tintColor = expression5;
            this.tintMode = expression6;
            this.url = expression7;
            this.width = divFixedSize2;
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this._hash;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = Reflection.getOrCreateKotlinClass(Image.class).hashCode();
            Accessibility accessibility = this.accessibility;
            int hash = hashCode + (accessibility != null ? accessibility.hash() : 0) + this.alignmentVertical.hashCode() + this.height.hash() + this.indexingDirection.hashCode() + this.preloadRequired.hashCode() + this.start.hashCode();
            Expression expression = this.tintColor;
            int hashCode2 = hash + (expression != null ? expression.hashCode() : 0) + this.tintMode.hashCode() + this.url.hashCode() + this.width.hash();
            this._hash = Integer.valueOf(hashCode2);
            return hashCode2;
        }

        public final boolean equals(Image image, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            if (image == null) {
                return false;
            }
            Accessibility accessibility = this.accessibility;
            if (!(accessibility != null ? accessibility.equals(image.accessibility, expressionResolver, expressionResolver2) : image.accessibility == null) || this.alignmentVertical.evaluate(expressionResolver) != image.alignmentVertical.evaluate(expressionResolver2) || !this.height.equals(image.height, expressionResolver, expressionResolver2) || this.indexingDirection.evaluate(expressionResolver) != image.indexingDirection.evaluate(expressionResolver2) || ((Boolean) this.preloadRequired.evaluate(expressionResolver)).booleanValue() != ((Boolean) image.preloadRequired.evaluate(expressionResolver2)).booleanValue() || ((Number) this.start.evaluate(expressionResolver)).longValue() != ((Number) image.start.evaluate(expressionResolver2)).longValue()) {
                return false;
            }
            Expression expression = this.tintColor;
            Integer num = expression != null ? (Integer) expression.evaluate(expressionResolver) : null;
            Expression expression2 = image.tintColor;
            return Intrinsics.areEqual(num, expression2 != null ? (Integer) expression2.evaluate(expressionResolver2) : null) && this.tintMode.evaluate(expressionResolver) == image.tintMode.evaluate(expressionResolver2) && Intrinsics.areEqual(this.url.evaluate(expressionResolver), image.url.evaluate(expressionResolver2)) && this.width.equals(image.width, expressionResolver, expressionResolver2);
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((DivTextImageJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTextImageJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        /* compiled from: DivText.kt */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Image fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return ((DivTextImageJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTextImageJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Expression.Companion companion = Expression.INSTANCE;
            ALIGNMENT_VERTICAL_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivTextAlignmentVertical.CENTER, null, 2, null);
            int i = 1;
            HEIGHT_DEFAULT_VALUE = new DivFixedSize(null == true ? 1 : 0, Expression.Companion.constant$default(companion, 20L, null, 2, null), i, null == true ? 1 : 0);
            INDEXING_DIRECTION_DEFAULT_VALUE = Expression.Companion.constant$default(companion, IndexingDirection.NORMAL, null, 2, null);
            PRELOAD_REQUIRED_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
            TINT_MODE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivBlendMode.SOURCE_IN, null, 2, null);
            WIDTH_DEFAULT_VALUE = new DivFixedSize(null == true ? 1 : 0, Expression.Companion.constant$default(companion, 20L, null, 2, null), i, null == true ? 1 : 0);
            CREATOR = new Function2() { // from class: com.yandex.div2.DivText$Image$Companion$CREATOR$1
                @Override // kotlin.jvm.functions.Function2
                @NotNull
                public final DivText.Image invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                    return DivText.Image.Companion.fromJson(parsingEnvironment, jSONObject);
                }
            };
        }

        /* compiled from: DivText.kt */
        public static final class Accessibility implements JSONSerializable, Hashable {
            private Integer _hash;
            public final Expression description;
            public final Type type;
            public static final Companion Companion = new Companion(null);
            private static final Type TYPE_DEFAULT_VALUE = Type.AUTO;
            private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivText$Image$Accessibility$Companion$CREATOR$1
                @Override // kotlin.jvm.functions.Function2
                @NotNull
                public final DivText.Image.Accessibility invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                    return DivText.Image.Accessibility.Companion.fromJson(parsingEnvironment, jSONObject);
                }
            };

            public Accessibility(Expression expression, Type type) {
                this.description = expression;
                this.type = type;
            }

            @Override // com.yandex.div.data.Hashable
            public int hash() {
                Integer num = this._hash;
                if (num != null) {
                    return num.intValue();
                }
                int hashCode = Reflection.getOrCreateKotlinClass(Accessibility.class).hashCode();
                Expression expression = this.description;
                int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0) + this.type.hashCode();
                this._hash = Integer.valueOf(hashCode2);
                return hashCode2;
            }

            public final boolean equals(Accessibility accessibility, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
                if (accessibility == null) {
                    return false;
                }
                Expression expression = this.description;
                String str = expression != null ? (String) expression.evaluate(expressionResolver) : null;
                Expression expression2 = accessibility.description;
                return Intrinsics.areEqual(str, expression2 != null ? (String) expression2.evaluate(expressionResolver2) : null) && this.type == accessibility.type;
            }

            @Override // com.yandex.div.json.JSONSerializable
            public JSONObject writeToJSON() {
                return ((DivTextImageAccessibilityJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTextImageAccessibilityJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
            }

            /* compiled from: DivText.kt */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final Accessibility fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                    return ((DivTextImageAccessibilityJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTextImageAccessibilityJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
                }
            }

            /* compiled from: DivText.kt */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/yandex/div2/DivText$Image$Accessibility$Type;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "NONE", "BUTTON", ShareConstants.IMAGE_URL, "TEXT", "AUTO", "Converter", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public enum Type {
                NONE("none"),
                BUTTON(SplitContent.BUTTON_VALUE),
                IMAGE("image"),
                TEXT("text"),
                AUTO("auto");


                @NotNull
                private final String value;

                /* renamed from: Converter, reason: from kotlin metadata */
                @NotNull
                public static final Companion INSTANCE = new Companion(null);

                @NotNull
                public static final Function1 TO_STRING = new Function1() { // from class: com.yandex.div2.DivText$Image$Accessibility$Type$Converter$TO_STRING$1
                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final String invoke(@NotNull DivText.Image.Accessibility.Type type) {
                        return DivText.Image.Accessibility.Type.INSTANCE.toString(type);
                    }
                };

                @NotNull
                public static final Function1 FROM_STRING = new Function1() { // from class: com.yandex.div2.DivText$Image$Accessibility$Type$Converter$FROM_STRING$1
                    @Override // kotlin.jvm.functions.Function1
                    @Nullable
                    public final DivText.Image.Accessibility.Type invoke(@NotNull String str) {
                        return DivText.Image.Accessibility.Type.INSTANCE.fromString(str);
                    }
                };

                Type(String str) {
                    this.value = str;
                }

                /* compiled from: DivText.kt */
                /* renamed from: com.yandex.div2.DivText$Image$Accessibility$Type$Converter, reason: from kotlin metadata */
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private Companion() {
                    }

                    public final String toString(Type type) {
                        return type.value;
                    }

                    public final Type fromString(String str) {
                        Type type = Type.NONE;
                        if (Intrinsics.areEqual(str, type.value)) {
                            return type;
                        }
                        Type type2 = Type.BUTTON;
                        if (Intrinsics.areEqual(str, type2.value)) {
                            return type2;
                        }
                        Type type3 = Type.IMAGE;
                        if (Intrinsics.areEqual(str, type3.value)) {
                            return type3;
                        }
                        Type type4 = Type.TEXT;
                        if (Intrinsics.areEqual(str, type4.value)) {
                            return type4;
                        }
                        Type type5 = Type.AUTO;
                        if (Intrinsics.areEqual(str, type5.value)) {
                            return type5;
                        }
                        return null;
                    }
                }
            }
        }

        /* compiled from: DivText.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/yandex/div2/DivText$Image$IndexingDirection;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "NORMAL", "REVERSED", "Converter", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public enum IndexingDirection {
            NORMAL(Constants.NORMAL),
            REVERSED("reversed");


            @NotNull
            private final String value;

            /* renamed from: Converter, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            @NotNull
            public static final Function1 TO_STRING = new Function1() { // from class: com.yandex.div2.DivText$Image$IndexingDirection$Converter$TO_STRING$1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final String invoke(@NotNull DivText.Image.IndexingDirection indexingDirection) {
                    return DivText.Image.IndexingDirection.INSTANCE.toString(indexingDirection);
                }
            };

            @NotNull
            public static final Function1 FROM_STRING = new Function1() { // from class: com.yandex.div2.DivText$Image$IndexingDirection$Converter$FROM_STRING$1
                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final DivText.Image.IndexingDirection invoke(@NotNull String str) {
                    return DivText.Image.IndexingDirection.INSTANCE.fromString(str);
                }
            };

            IndexingDirection(String str) {
                this.value = str;
            }

            /* compiled from: DivText.kt */
            /* renamed from: com.yandex.div2.DivText$Image$IndexingDirection$Converter, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final String toString(IndexingDirection indexingDirection) {
                    return indexingDirection.value;
                }

                public final IndexingDirection fromString(String str) {
                    IndexingDirection indexingDirection = IndexingDirection.NORMAL;
                    if (Intrinsics.areEqual(str, indexingDirection.value)) {
                        return indexingDirection;
                    }
                    IndexingDirection indexingDirection2 = IndexingDirection.REVERSED;
                    if (Intrinsics.areEqual(str, indexingDirection2.value)) {
                        return indexingDirection2;
                    }
                    return null;
                }
            }
        }
    }

    /* compiled from: DivText.kt */
    public static final class Ellipsis implements JSONSerializable, Hashable {
        private Integer _hash;
        public final List actions;
        public final List images;
        public final List ranges;
        public final Expression text;
        public static final Companion Companion = new Companion(null);
        private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivText$Ellipsis$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivText.Ellipsis invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivText.Ellipsis.Companion.fromJson(parsingEnvironment, jSONObject);
            }
        };

        public Ellipsis(List list, List list2, List list3, Expression expression) {
            this.actions = list;
            this.images = list2;
            this.ranges = list3;
            this.text = expression;
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            int i;
            int i2;
            Integer num = this._hash;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = Reflection.getOrCreateKotlinClass(Ellipsis.class).hashCode();
            List list = this.actions;
            int i3 = 0;
            if (list != null) {
                Iterator it = list.iterator();
                i = 0;
                while (it.hasNext()) {
                    i += ((DivAction) it.next()).hash();
                }
            } else {
                i = 0;
            }
            int i4 = hashCode + i;
            List list2 = this.images;
            if (list2 != null) {
                Iterator it2 = list2.iterator();
                i2 = 0;
                while (it2.hasNext()) {
                    i2 += ((Image) it2.next()).hash();
                }
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            List list3 = this.ranges;
            if (list3 != null) {
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    i3 += ((Range) it3.next()).hash();
                }
            }
            int hashCode2 = i5 + i3 + this.text.hashCode();
            this._hash = Integer.valueOf(hashCode2);
            return hashCode2;
        }

        public final boolean equals(Ellipsis ellipsis, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            if (ellipsis == null) {
                return false;
            }
            List list = this.actions;
            if (list != null) {
                List list2 = ellipsis.actions;
                if (list2 == null || list.size() != list2.size()) {
                    return false;
                }
                int i = 0;
                for (Object obj : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    if (!((DivAction) obj).equals((DivAction) list2.get(i), expressionResolver, expressionResolver2)) {
                        return false;
                    }
                    i = i2;
                }
            } else if (ellipsis.actions != null) {
                return false;
            }
            List list3 = this.images;
            if (list3 != null) {
                List list4 = ellipsis.images;
                if (list4 == null || list3.size() != list4.size()) {
                    return false;
                }
                int i3 = 0;
                for (Object obj2 : list3) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    if (!((Image) obj2).equals((Image) list4.get(i3), expressionResolver, expressionResolver2)) {
                        return false;
                    }
                    i3 = i4;
                }
            } else if (ellipsis.images != null) {
                return false;
            }
            List list5 = this.ranges;
            if (list5 != null) {
                List list6 = ellipsis.ranges;
                if (list6 == null || list5.size() != list6.size()) {
                    return false;
                }
                int i5 = 0;
                for (Object obj3 : list5) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    if (!((Range) obj3).equals((Range) list6.get(i5), expressionResolver, expressionResolver2)) {
                        return false;
                    }
                    i5 = i6;
                }
            } else if (ellipsis.ranges != null) {
                return false;
            }
            return Intrinsics.areEqual(this.text.evaluate(expressionResolver), ellipsis.text.evaluate(expressionResolver2));
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((DivTextEllipsisJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTextEllipsisJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        /* compiled from: DivText.kt */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Ellipsis fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return ((DivTextEllipsisJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTextEllipsisJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
            }
        }
    }

    /* compiled from: DivText.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/yandex/div2/DivText$Truncate;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "NONE", POBOMSDKLogConstants.MSG_OMSDK_START_EVENT, "END", "MIDDLE", "Converter", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Truncate {
        NONE("none"),
        START("start"),
        END("end"),
        MIDDLE("middle");


        @NotNull
        private final String value;

        /* renamed from: Converter, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        public static final Function1 TO_STRING = new Function1() { // from class: com.yandex.div2.DivText$Truncate$Converter$TO_STRING$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final String invoke(@NotNull DivText.Truncate truncate) {
                return DivText.Truncate.INSTANCE.toString(truncate);
            }
        };

        @NotNull
        public static final Function1 FROM_STRING = new Function1() { // from class: com.yandex.div2.DivText$Truncate$Converter$FROM_STRING$1
            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final DivText.Truncate invoke(@NotNull String str) {
                return DivText.Truncate.INSTANCE.fromString(str);
            }
        };

        Truncate(String str) {
            this.value = str;
        }

        /* compiled from: DivText.kt */
        /* renamed from: com.yandex.div2.DivText$Truncate$Converter, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final String toString(Truncate truncate) {
                return truncate.value;
            }

            public final Truncate fromString(String str) {
                Truncate truncate = Truncate.NONE;
                if (Intrinsics.areEqual(str, truncate.value)) {
                    return truncate;
                }
                Truncate truncate2 = Truncate.START;
                if (Intrinsics.areEqual(str, truncate2.value)) {
                    return truncate2;
                }
                Truncate truncate3 = Truncate.END;
                if (Intrinsics.areEqual(str, truncate3.value)) {
                    return truncate3;
                }
                Truncate truncate4 = Truncate.MIDDLE;
                if (Intrinsics.areEqual(str, truncate4.value)) {
                    return truncate4;
                }
                return null;
            }
        }
    }
}
