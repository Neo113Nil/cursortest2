package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivVideoJsonParser;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivVideo.kt */
/* loaded from: classes10.dex */
public final class DivVideo implements JSONSerializable, Hashable, DivBase {
    private static final Expression ALPHA_DEFAULT_VALUE;
    private static final Expression AUTOSTART_DEFAULT_VALUE;
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final DivSize.WrapContent HEIGHT_DEFAULT_VALUE;
    private static final Expression MUTED_DEFAULT_VALUE;
    private static final Expression PRELOAD_REQUIRED_DEFAULT_VALUE;
    private static final Expression REPEATABLE_DEFAULT_VALUE;
    private static final Expression SCALE_DEFAULT_VALUE;
    private static final Expression VISIBILITY_DEFAULT_VALUE;
    private static final DivSize.MatchParent WIDTH_DEFAULT_VALUE;
    private Integer _hash;
    private final DivAccessibility accessibility;
    private final Expression alignmentHorizontal;
    private final Expression alignmentVertical;
    private final Expression alpha;
    private final List animators;
    public final DivAspect aspect;
    public final Expression autostart;
    private final List background;
    private final DivBorder border;
    public final List bufferingActions;
    private final Expression columnSpan;
    private final List disappearActions;
    public final String elapsedTimeVariable;
    public final List endActions;
    private final List extensions;
    public final List fatalActions;
    private final DivFocus focus;
    private final List functions;
    private final DivSize height;
    private final String id;
    private final DivLayoutProvider layoutProvider;
    private final DivEdgeInsets margins;
    public final Expression muted;
    private final DivEdgeInsets paddings;
    public final List pauseActions;
    public final JSONObject playerSettingsPayload;
    public final Expression preloadRequired;
    public final Expression preview;
    public final Expression repeatable;
    public final List resumeActions;
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
    public final List videoSources;
    private final Expression visibility;
    private final DivVisibilityAction visibilityAction;
    private final List visibilityActions;
    private final DivSize width;

    public DivVideo(DivAccessibility divAccessibility, Expression expression, Expression expression2, Expression expression3, List list, DivAspect divAspect, Expression expression4, List list2, DivBorder divBorder, List list3, Expression expression5, List list4, String str, List list5, List list6, List list7, DivFocus divFocus, List list8, DivSize divSize, String str2, DivLayoutProvider divLayoutProvider, DivEdgeInsets divEdgeInsets, Expression expression6, DivEdgeInsets divEdgeInsets2, List list9, JSONObject jSONObject, Expression expression7, Expression expression8, Expression expression9, List list10, Expression expression10, Expression expression11, Expression expression12, List list11, List list12, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list13, List list14, List list15, List list16, Expression expression13, DivVisibilityAction divVisibilityAction, List list17, DivSize divSize2) {
        this.accessibility = divAccessibility;
        this.alignmentHorizontal = expression;
        this.alignmentVertical = expression2;
        this.alpha = expression3;
        this.animators = list;
        this.aspect = divAspect;
        this.autostart = expression4;
        this.background = list2;
        this.border = divBorder;
        this.bufferingActions = list3;
        this.columnSpan = expression5;
        this.disappearActions = list4;
        this.elapsedTimeVariable = str;
        this.endActions = list5;
        this.extensions = list6;
        this.fatalActions = list7;
        this.focus = divFocus;
        this.functions = list8;
        this.height = divSize;
        this.id = str2;
        this.layoutProvider = divLayoutProvider;
        this.margins = divEdgeInsets;
        this.muted = expression6;
        this.paddings = divEdgeInsets2;
        this.pauseActions = list9;
        this.playerSettingsPayload = jSONObject;
        this.preloadRequired = expression7;
        this.preview = expression8;
        this.repeatable = expression9;
        this.resumeActions = list10;
        this.reuseId = expression10;
        this.rowSpan = expression11;
        this.scale = expression12;
        this.selectedActions = list11;
        this.tooltips = list12;
        this.transform = divTransform;
        this.transitionChange = divChangeTransition;
        this.transitionIn = divAppearanceTransition;
        this.transitionOut = divAppearanceTransition2;
        this.transitionTriggers = list13;
        this.variableTriggers = list14;
        this.variables = list15;
        this.videoSources = list16;
        this.visibility = expression13;
        this.visibilityAction = divVisibilityAction;
        this.visibilityActions = list17;
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
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivVideo.class).hashCode();
        DivAccessibility accessibility = getAccessibility();
        int i15 = 0;
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
        int i16 = hashCode3 + i;
        DivAspect divAspect = this.aspect;
        int hash2 = i16 + (divAspect != null ? divAspect.hash() : 0) + this.autostart.hashCode();
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
        int i17 = hash2 + i2;
        DivBorder border = getBorder();
        int hash3 = i17 + (border != null ? border.hash() : 0);
        List list = this.bufferingActions;
        if (list != null) {
            Iterator it3 = list.iterator();
            i3 = 0;
            while (it3.hasNext()) {
                i3 += ((DivAction) it3.next()).hash();
            }
        } else {
            i3 = 0;
        }
        int i18 = hash3 + i3;
        Expression columnSpan = getColumnSpan();
        int hashCode4 = i18 + (columnSpan != null ? columnSpan.hashCode() : 0);
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
        int i19 = hashCode4 + i4;
        String str = this.elapsedTimeVariable;
        int hashCode5 = i19 + (str != null ? str.hashCode() : 0);
        List list2 = this.endActions;
        if (list2 != null) {
            Iterator it5 = list2.iterator();
            i5 = 0;
            while (it5.hasNext()) {
                i5 += ((DivAction) it5.next()).hash();
            }
        } else {
            i5 = 0;
        }
        int i20 = hashCode5 + i5;
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
        int i21 = i20 + i6;
        List list3 = this.fatalActions;
        if (list3 != null) {
            Iterator it7 = list3.iterator();
            i7 = 0;
            while (it7.hasNext()) {
                i7 += ((DivAction) it7.next()).hash();
            }
        } else {
            i7 = 0;
        }
        int i22 = i21 + i7;
        DivFocus focus = getFocus();
        int hash4 = i22 + (focus != null ? focus.hash() : 0);
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
        int hash5 = hash4 + i8 + getHeight().hash();
        String id = getId();
        int hashCode6 = hash5 + (id != null ? id.hashCode() : 0);
        DivLayoutProvider layoutProvider = getLayoutProvider();
        int hash6 = hashCode6 + (layoutProvider != null ? layoutProvider.hash() : 0);
        DivEdgeInsets margins = getMargins();
        int hash7 = hash6 + (margins != null ? margins.hash() : 0) + this.muted.hashCode();
        DivEdgeInsets paddings = getPaddings();
        int hash8 = hash7 + (paddings != null ? paddings.hash() : 0);
        List list4 = this.pauseActions;
        if (list4 != null) {
            Iterator it9 = list4.iterator();
            i9 = 0;
            while (it9.hasNext()) {
                i9 += ((DivAction) it9.next()).hash();
            }
        } else {
            i9 = 0;
        }
        int i23 = hash8 + i9;
        JSONObject jSONObject = this.playerSettingsPayload;
        int hashCode7 = i23 + (jSONObject != null ? jSONObject.hashCode() : 0) + this.preloadRequired.hashCode();
        Expression expression = this.preview;
        int hashCode8 = hashCode7 + (expression != null ? expression.hashCode() : 0) + this.repeatable.hashCode();
        List list5 = this.resumeActions;
        if (list5 != null) {
            Iterator it10 = list5.iterator();
            i10 = 0;
            while (it10.hasNext()) {
                i10 += ((DivAction) it10.next()).hash();
            }
        } else {
            i10 = 0;
        }
        int i24 = hashCode8 + i10;
        Expression reuseId = getReuseId();
        int hashCode9 = i24 + (reuseId != null ? reuseId.hashCode() : 0);
        Expression rowSpan = getRowSpan();
        int hashCode10 = hashCode9 + (rowSpan != null ? rowSpan.hashCode() : 0) + this.scale.hashCode();
        List selectedActions = getSelectedActions();
        if (selectedActions != null) {
            Iterator it11 = selectedActions.iterator();
            i11 = 0;
            while (it11.hasNext()) {
                i11 += ((DivAction) it11.next()).hash();
            }
        } else {
            i11 = 0;
        }
        int i25 = hashCode10 + i11;
        List tooltips = getTooltips();
        if (tooltips != null) {
            Iterator it12 = tooltips.iterator();
            i12 = 0;
            while (it12.hasNext()) {
                i12 += ((DivTooltip) it12.next()).hash();
            }
        } else {
            i12 = 0;
        }
        int i26 = i25 + i12;
        DivTransform transform = getTransform();
        int hash9 = i26 + (transform != null ? transform.hash() : 0);
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
            Iterator it13 = variableTriggers.iterator();
            i13 = 0;
            while (it13.hasNext()) {
                i13 += ((DivTrigger) it13.next()).hash();
            }
        } else {
            i13 = 0;
        }
        int i27 = hashCode11 + i13;
        List variables = getVariables();
        if (variables != null) {
            Iterator it14 = variables.iterator();
            i14 = 0;
            while (it14.hasNext()) {
                i14 += ((DivVariable) it14.next()).hash();
            }
        } else {
            i14 = 0;
        }
        int i28 = i27 + i14;
        Iterator it15 = this.videoSources.iterator();
        int i29 = 0;
        while (it15.hasNext()) {
            i29 += ((DivVideoSource) it15.next()).hash();
        }
        int hashCode12 = i28 + i29 + getVisibility().hashCode();
        DivVisibilityAction visibilityAction = getVisibilityAction();
        int hash13 = hashCode12 + (visibilityAction != null ? visibilityAction.hash() : 0);
        List visibilityActions = getVisibilityActions();
        if (visibilityActions != null) {
            Iterator it16 = visibilityActions.iterator();
            while (it16.hasNext()) {
                i15 += ((DivVisibilityAction) it16.next()).hash();
            }
        }
        int hash14 = hash13 + i15 + getWidth().hash();
        this._hash = Integer.valueOf(hash14);
        return hash14;
    }

    /* JADX WARN: Code restructure failed: missing block: B:458:0x07ab, code lost:
    
        if (r9.getVisibilityActions() == null) goto L566;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x06f7, code lost:
    
        if (r9.getVariables() == null) goto L518;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x06ab, code lost:
    
        if (r9.getVariableTriggers() == null) goto L495;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x065f, code lost:
    
        if (r9.getTransitionTriggers() == null) goto L472;
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x05aa, code lost:
    
        if (r9.getTooltips() == null) goto L414;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x055e, code lost:
    
        if (r9.getSelectedActions() == null) goto L391;
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x04c2, code lost:
    
        if (r9.resumeActions == null) goto L347;
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x0420, code lost:
    
        if (r9.pauseActions == null) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x0356, code lost:
    
        if (r9.getFunctions() == null) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:568:0x02f0, code lost:
    
        if (r9.fatalActions == null) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:572:0x02aa, code lost:
    
        if (r9.getExtensions() == null) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:576:0x025e, code lost:
    
        if (r9.endActions == null) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:581:0x020e, code lost:
    
        if (r9.getDisappearActions() == null) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:588:0x01a0, code lost:
    
        if (r9.bufferingActions == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:597:0x0140, code lost:
    
        if (r9.getBackground() == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:607:0x00c6, code lost:
    
        if (r9.getAnimators() == null) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(DivVideo divVideo, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
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
        if (divVideo == null) {
            return false;
        }
        DivAccessibility accessibility = getAccessibility();
        if (!(accessibility != null ? accessibility.equals(divVideo.getAccessibility(), expressionResolver, expressionResolver2) : divVideo.getAccessibility() == null)) {
            return false;
        }
        Expression alignmentHorizontal = getAlignmentHorizontal();
        DivAlignmentHorizontal divAlignmentHorizontal = alignmentHorizontal != null ? (DivAlignmentHorizontal) alignmentHorizontal.evaluate(expressionResolver) : null;
        Expression alignmentHorizontal2 = divVideo.getAlignmentHorizontal();
        if (divAlignmentHorizontal != (alignmentHorizontal2 != null ? (DivAlignmentHorizontal) alignmentHorizontal2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression alignmentVertical = getAlignmentVertical();
        DivAlignmentVertical divAlignmentVertical = alignmentVertical != null ? (DivAlignmentVertical) alignmentVertical.evaluate(expressionResolver) : null;
        Expression alignmentVertical2 = divVideo.getAlignmentVertical();
        if (divAlignmentVertical != (alignmentVertical2 != null ? (DivAlignmentVertical) alignmentVertical2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        if (!(((Number) getAlpha().evaluate(expressionResolver)).doubleValue() == ((Number) divVideo.getAlpha().evaluate(expressionResolver2)).doubleValue())) {
            return false;
        }
        List animators = getAnimators();
        if (animators != null) {
            List animators2 = divVideo.getAnimators();
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
        DivAspect divAspect = this.aspect;
        if (!(divAspect != null ? divAspect.equals(divVideo.aspect, expressionResolver, expressionResolver2) : divVideo.aspect == null) || ((Boolean) this.autostart.evaluate(expressionResolver)).booleanValue() != ((Boolean) divVideo.autostart.evaluate(expressionResolver2)).booleanValue()) {
            return false;
        }
        List background = getBackground();
        if (background != null) {
            List background2 = divVideo.getBackground();
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
        if (!(border != null ? border.equals(divVideo.getBorder(), expressionResolver, expressionResolver2) : divVideo.getBorder() == null)) {
            return false;
        }
        List list = this.bufferingActions;
        if (list != null) {
            List list2 = divVideo.bufferingActions;
            if (list2 != null) {
                if (list.size() == list2.size()) {
                    int i5 = 0;
                    for (Object obj3 : list) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivAction) obj3).equals((DivAction) list2.get(i5), expressionResolver, expressionResolver2)) {
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
        Expression columnSpan = getColumnSpan();
        Long l = columnSpan != null ? (Long) columnSpan.evaluate(expressionResolver) : null;
        Expression columnSpan2 = divVideo.getColumnSpan();
        if (!Intrinsics.areEqual(l, columnSpan2 != null ? (Long) columnSpan2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List disappearActions = getDisappearActions();
        if (disappearActions != null) {
            List disappearActions2 = divVideo.getDisappearActions();
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
        if (!z4 || !Intrinsics.areEqual(this.elapsedTimeVariable, divVideo.elapsedTimeVariable)) {
            return false;
        }
        List list3 = this.endActions;
        if (list3 != null) {
            List list4 = divVideo.endActions;
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
            List extensions2 = divVideo.getExtensions();
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
        List list5 = this.fatalActions;
        if (list5 != null) {
            List list6 = divVideo.fatalActions;
            if (list6 != null) {
                if (list5.size() == list6.size()) {
                    int i13 = 0;
                    for (Object obj7 : list5) {
                        int i14 = i13 + 1;
                        if (i13 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivAction) obj7).equals((DivAction) list6.get(i13), expressionResolver, expressionResolver2)) {
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
        if (!(focus != null ? focus.equals(divVideo.getFocus(), expressionResolver, expressionResolver2) : divVideo.getFocus() == null)) {
            return false;
        }
        List functions = getFunctions();
        if (functions != null) {
            List functions2 = divVideo.getFunctions();
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
        if (!z8 || !getHeight().equals(divVideo.getHeight(), expressionResolver, expressionResolver2) || !Intrinsics.areEqual(getId(), divVideo.getId())) {
            return false;
        }
        DivLayoutProvider layoutProvider = getLayoutProvider();
        if (!(layoutProvider != null ? layoutProvider.equals(divVideo.getLayoutProvider(), expressionResolver, expressionResolver2) : divVideo.getLayoutProvider() == null)) {
            return false;
        }
        DivEdgeInsets margins = getMargins();
        if (!(margins != null ? margins.equals(divVideo.getMargins(), expressionResolver, expressionResolver2) : divVideo.getMargins() == null) || ((Boolean) this.muted.evaluate(expressionResolver)).booleanValue() != ((Boolean) divVideo.muted.evaluate(expressionResolver2)).booleanValue()) {
            return false;
        }
        DivEdgeInsets paddings = getPaddings();
        if (!(paddings != null ? paddings.equals(divVideo.getPaddings(), expressionResolver, expressionResolver2) : divVideo.getPaddings() == null)) {
            return false;
        }
        List list7 = this.pauseActions;
        if (list7 != null) {
            List list8 = divVideo.pauseActions;
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
        if (!z9 || !Intrinsics.areEqual(this.playerSettingsPayload, divVideo.playerSettingsPayload) || ((Boolean) this.preloadRequired.evaluate(expressionResolver)).booleanValue() != ((Boolean) divVideo.preloadRequired.evaluate(expressionResolver2)).booleanValue()) {
            return false;
        }
        Expression expression = this.preview;
        String str = expression != null ? (String) expression.evaluate(expressionResolver) : null;
        Expression expression2 = divVideo.preview;
        if (!Intrinsics.areEqual(str, expression2 != null ? (String) expression2.evaluate(expressionResolver2) : null) || ((Boolean) this.repeatable.evaluate(expressionResolver)).booleanValue() != ((Boolean) divVideo.repeatable.evaluate(expressionResolver2)).booleanValue()) {
            return false;
        }
        List list9 = this.resumeActions;
        if (list9 != null) {
            List list10 = divVideo.resumeActions;
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
        Expression reuseId = getReuseId();
        String str2 = reuseId != null ? (String) reuseId.evaluate(expressionResolver) : null;
        Expression reuseId2 = divVideo.getReuseId();
        if (!Intrinsics.areEqual(str2, reuseId2 != null ? (String) reuseId2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression rowSpan = getRowSpan();
        Long l2 = rowSpan != null ? (Long) rowSpan.evaluate(expressionResolver) : null;
        Expression rowSpan2 = divVideo.getRowSpan();
        if (!Intrinsics.areEqual(l2, rowSpan2 != null ? (Long) rowSpan2.evaluate(expressionResolver2) : null) || this.scale.evaluate(expressionResolver) != divVideo.scale.evaluate(expressionResolver2)) {
            return false;
        }
        List selectedActions = getSelectedActions();
        if (selectedActions != null) {
            List selectedActions2 = divVideo.getSelectedActions();
            if (selectedActions2 != null) {
                if (selectedActions.size() == selectedActions2.size()) {
                    int i21 = 0;
                    for (Object obj11 : selectedActions) {
                        int i22 = i21 + 1;
                        if (i21 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivAction) obj11).equals((DivAction) selectedActions2.get(i21), expressionResolver, expressionResolver2)) {
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
        List tooltips = getTooltips();
        if (tooltips != null) {
            List tooltips2 = divVideo.getTooltips();
            if (tooltips2 != null) {
                if (tooltips.size() == tooltips2.size()) {
                    int i23 = 0;
                    for (Object obj12 : tooltips) {
                        int i24 = i23 + 1;
                        if (i23 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivTooltip) obj12).equals((DivTooltip) tooltips2.get(i23), expressionResolver, expressionResolver2)) {
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
        DivTransform transform = getTransform();
        if (!(transform != null ? transform.equals(divVideo.getTransform(), expressionResolver, expressionResolver2) : divVideo.getTransform() == null)) {
            return false;
        }
        DivChangeTransition transitionChange = getTransitionChange();
        if (!(transitionChange != null ? transitionChange.equals(divVideo.getTransitionChange(), expressionResolver, expressionResolver2) : divVideo.getTransitionChange() == null)) {
            return false;
        }
        DivAppearanceTransition transitionIn = getTransitionIn();
        if (!(transitionIn != null ? transitionIn.equals(divVideo.getTransitionIn(), expressionResolver, expressionResolver2) : divVideo.getTransitionIn() == null)) {
            return false;
        }
        DivAppearanceTransition transitionOut = getTransitionOut();
        if (!(transitionOut != null ? transitionOut.equals(divVideo.getTransitionOut(), expressionResolver, expressionResolver2) : divVideo.getTransitionOut() == null)) {
            return false;
        }
        List transitionTriggers = getTransitionTriggers();
        if (transitionTriggers != null) {
            List transitionTriggers2 = divVideo.getTransitionTriggers();
            if (transitionTriggers2 != null) {
                if (transitionTriggers.size() == transitionTriggers2.size()) {
                    int i25 = 0;
                    for (Object obj13 : transitionTriggers) {
                        int i26 = i25 + 1;
                        if (i25 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivTransitionTrigger) obj13) == ((DivTransitionTrigger) transitionTriggers2.get(i25))) {
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
        List variableTriggers = getVariableTriggers();
        if (variableTriggers != null) {
            List variableTriggers2 = divVideo.getVariableTriggers();
            if (variableTriggers2 != null) {
                if (variableTriggers.size() == variableTriggers2.size()) {
                    int i27 = 0;
                    for (Object obj14 : variableTriggers) {
                        int i28 = i27 + 1;
                        if (i27 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivTrigger) obj14).equals((DivTrigger) variableTriggers2.get(i27), expressionResolver, expressionResolver2)) {
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
        List variables = getVariables();
        if (variables != null) {
            List variables2 = divVideo.getVariables();
            if (variables2 != null) {
                if (variables.size() == variables2.size()) {
                    int i29 = 0;
                    for (Object obj15 : variables) {
                        int i30 = i29 + 1;
                        if (i29 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivVariable) obj15).equals((DivVariable) variables2.get(i29), expressionResolver, expressionResolver2)) {
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
        List list11 = this.videoSources;
        List list12 = divVideo.videoSources;
        if (list11.size() == list12.size()) {
            int i31 = 0;
            for (Object obj16 : list11) {
                int i32 = i31 + 1;
                if (i31 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                if (((DivVideoSource) obj16).equals((DivVideoSource) list12.get(i31), expressionResolver, expressionResolver2)) {
                    i31 = i32;
                }
            }
            z16 = true;
            if (!z16 && getVisibility().evaluate(expressionResolver) == divVideo.getVisibility().evaluate(expressionResolver2)) {
                DivVisibilityAction visibilityAction = getVisibilityAction();
                if (!(visibilityAction != null ? visibilityAction.equals(divVideo.getVisibilityAction(), expressionResolver, expressionResolver2) : divVideo.getVisibilityAction() == null)) {
                    return false;
                }
                List visibilityActions = getVisibilityActions();
                if (visibilityActions != null) {
                    List visibilityActions2 = divVideo.getVisibilityActions();
                    if (visibilityActions2 != null) {
                        if (visibilityActions.size() == visibilityActions2.size()) {
                            int i33 = 0;
                            for (Object obj17 : visibilityActions) {
                                int i34 = i33 + 1;
                                if (i33 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                if (((DivVisibilityAction) obj17).equals((DivVisibilityAction) visibilityActions2.get(i33), expressionResolver, expressionResolver2)) {
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
                return z17 && getWidth().equals(divVideo.getWidth(), expressionResolver, expressionResolver2);
            }
        }
        z16 = false;
        return !z16 ? false : false;
    }

    public static /* synthetic */ DivVideo copy$default(DivVideo divVideo, DivAccessibility divAccessibility, Expression expression, Expression expression2, Expression expression3, List list, DivAspect divAspect, Expression expression4, List list2, DivBorder divBorder, List list3, Expression expression5, List list4, String str, List list5, List list6, List list7, DivFocus divFocus, List list8, DivSize divSize, String str2, DivLayoutProvider divLayoutProvider, DivEdgeInsets divEdgeInsets, Expression expression6, DivEdgeInsets divEdgeInsets2, List list9, JSONObject jSONObject, Expression expression7, Expression expression8, Expression expression9, List list10, Expression expression10, Expression expression11, Expression expression12, List list11, List list12, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list13, List list14, List list15, List list16, Expression expression13, DivVisibilityAction divVisibilityAction, List list17, DivSize divSize2, int i, int i2, Object obj) {
        DivAccessibility accessibility = (i & 1) != 0 ? divVideo.getAccessibility() : divAccessibility;
        Expression alignmentHorizontal = (i & 2) != 0 ? divVideo.getAlignmentHorizontal() : expression;
        Expression alignmentVertical = (i & 4) != 0 ? divVideo.getAlignmentVertical() : expression2;
        Expression alpha = (i & 8) != 0 ? divVideo.getAlpha() : expression3;
        List animators = (i & 16) != 0 ? divVideo.getAnimators() : list;
        DivAspect divAspect2 = (i & 32) != 0 ? divVideo.aspect : divAspect;
        Expression expression14 = (i & 64) != 0 ? divVideo.autostart : expression4;
        List background = (i & 128) != 0 ? divVideo.getBackground() : list2;
        DivBorder border = (i & 256) != 0 ? divVideo.getBorder() : divBorder;
        List list18 = (i & 512) != 0 ? divVideo.bufferingActions : list3;
        Expression columnSpan = (i & 1024) != 0 ? divVideo.getColumnSpan() : expression5;
        List disappearActions = (i & 2048) != 0 ? divVideo.getDisappearActions() : list4;
        String str3 = (i & 4096) != 0 ? divVideo.elapsedTimeVariable : str;
        List list19 = (i & 8192) != 0 ? divVideo.endActions : list5;
        List extensions = (i & 16384) != 0 ? divVideo.getExtensions() : list6;
        List list20 = (i & 32768) != 0 ? divVideo.fatalActions : list7;
        DivFocus focus = (i & 65536) != 0 ? divVideo.getFocus() : divFocus;
        List functions = (i & 131072) != 0 ? divVideo.getFunctions() : list8;
        DivSize height = (i & 262144) != 0 ? divVideo.getHeight() : divSize;
        String id = (i & 524288) != 0 ? divVideo.getId() : str2;
        DivLayoutProvider layoutProvider = (i & 1048576) != 0 ? divVideo.getLayoutProvider() : divLayoutProvider;
        DivEdgeInsets margins = (i & 2097152) != 0 ? divVideo.getMargins() : divEdgeInsets;
        List list21 = list20;
        Expression expression15 = (i & 4194304) != 0 ? divVideo.muted : expression6;
        return divVideo.copy(accessibility, alignmentHorizontal, alignmentVertical, alpha, animators, divAspect2, expression14, background, border, list18, columnSpan, disappearActions, str3, list19, extensions, list21, focus, functions, height, id, layoutProvider, margins, expression15, (i & 8388608) != 0 ? divVideo.getPaddings() : divEdgeInsets2, (i & 16777216) != 0 ? divVideo.pauseActions : list9, (i & 33554432) != 0 ? divVideo.playerSettingsPayload : jSONObject, (i & 67108864) != 0 ? divVideo.preloadRequired : expression7, (i & 134217728) != 0 ? divVideo.preview : expression8, (i & 268435456) != 0 ? divVideo.repeatable : expression9, (i & 536870912) != 0 ? divVideo.resumeActions : list10, (i & 1073741824) != 0 ? divVideo.getReuseId() : expression10, (i & Integer.MIN_VALUE) != 0 ? divVideo.getRowSpan() : expression11, (i2 & 1) != 0 ? divVideo.scale : expression12, (i2 & 2) != 0 ? divVideo.getSelectedActions() : list11, (i2 & 4) != 0 ? divVideo.getTooltips() : list12, (i2 & 8) != 0 ? divVideo.getTransform() : divTransform, (i2 & 16) != 0 ? divVideo.getTransitionChange() : divChangeTransition, (i2 & 32) != 0 ? divVideo.getTransitionIn() : divAppearanceTransition, (i2 & 64) != 0 ? divVideo.getTransitionOut() : divAppearanceTransition2, (i2 & 128) != 0 ? divVideo.getTransitionTriggers() : list13, (i2 & 256) != 0 ? divVideo.getVariableTriggers() : list14, (i2 & 512) != 0 ? divVideo.getVariables() : list15, (i2 & 1024) != 0 ? divVideo.videoSources : list16, (i2 & 2048) != 0 ? divVideo.getVisibility() : expression13, (i2 & 4096) != 0 ? divVideo.getVisibilityAction() : divVisibilityAction, (i2 & 8192) != 0 ? divVideo.getVisibilityActions() : list17, (i2 & 16384) != 0 ? divVideo.getWidth() : divSize2);
    }

    public final DivVideo copy(DivAccessibility divAccessibility, Expression expression, Expression expression2, Expression expression3, List list, DivAspect divAspect, Expression expression4, List list2, DivBorder divBorder, List list3, Expression expression5, List list4, String str, List list5, List list6, List list7, DivFocus divFocus, List list8, DivSize divSize, String str2, DivLayoutProvider divLayoutProvider, DivEdgeInsets divEdgeInsets, Expression expression6, DivEdgeInsets divEdgeInsets2, List list9, JSONObject jSONObject, Expression expression7, Expression expression8, Expression expression9, List list10, Expression expression10, Expression expression11, Expression expression12, List list11, List list12, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list13, List list14, List list15, List list16, Expression expression13, DivVisibilityAction divVisibilityAction, List list17, DivSize divSize2) {
        return new DivVideo(divAccessibility, expression, expression2, expression3, list, divAspect, expression4, list2, divBorder, list3, expression5, list4, str, list5, list6, list7, divFocus, list8, divSize, str2, divLayoutProvider, divEdgeInsets, expression6, divEdgeInsets2, list9, jSONObject, expression7, expression8, expression9, list10, expression10, expression11, expression12, list11, list12, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, list13, list14, list15, list16, expression13, divVisibilityAction, list17, divSize2);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivVideoJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivVideoJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivVideo.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivVideo fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivVideoJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivVideoJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.INSTANCE;
        ALPHA_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        Boolean bool = Boolean.FALSE;
        AUTOSTART_DEFAULT_VALUE = Expression.Companion.constant$default(companion, bool, null, 2, null);
        HEIGHT_DEFAULT_VALUE = new DivSize.WrapContent(new DivWrapContentSize(null, null, null, 7, null));
        MUTED_DEFAULT_VALUE = Expression.Companion.constant$default(companion, bool, null, 2, null);
        PRELOAD_REQUIRED_DEFAULT_VALUE = Expression.Companion.constant$default(companion, bool, null, 2, null);
        REPEATABLE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, bool, null, 2, null);
        SCALE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivVideoScale.FIT, null, 2, null);
        VISIBILITY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        WIDTH_DEFAULT_VALUE = new DivSize.MatchParent(new DivMatchParentSize(null, null, null, 7, 0 == true ? 1 : 0));
        CREATOR = new Function2() { // from class: com.yandex.div2.DivVideo$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivVideo invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivVideo.Companion.fromJson(parsingEnvironment, jSONObject);
            }
        };
    }
}
