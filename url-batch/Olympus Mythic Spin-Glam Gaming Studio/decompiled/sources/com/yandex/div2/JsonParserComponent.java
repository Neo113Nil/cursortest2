package com.yandex.div2;

import com.yandex.div2.DivAbsoluteEdgeInsetsJsonParser;
import com.yandex.div2.DivAccessibilityJsonParser;
import com.yandex.div2.DivActionAnimatorStartJsonParser;
import com.yandex.div2.DivActionJsonParser;
import com.yandex.div2.DivActionScrollByJsonParser;
import com.yandex.div2.DivActionScrollToJsonParser;
import com.yandex.div2.DivActionSetStateJsonParser;
import com.yandex.div2.DivActionSubmitRequestJsonParser;
import com.yandex.div2.DivActionTimerJsonParser;
import com.yandex.div2.DivActionUpdateStructureJsonParser;
import com.yandex.div2.DivActionVideoJsonParser;
import com.yandex.div2.DivAnimationJsonParser;
import com.yandex.div2.DivAppearanceSetTransitionJsonParser;
import com.yandex.div2.DivAspectJsonParser;
import com.yandex.div2.DivBlurJsonParser;
import com.yandex.div2.DivBorderJsonParser;
import com.yandex.div2.DivChangeBoundsTransitionJsonParser;
import com.yandex.div2.DivChangeSetTransitionJsonParser;
import com.yandex.div2.DivCircleShapeJsonParser;
import com.yandex.div2.DivCloudBackgroundJsonParser;
import com.yandex.div2.DivCollectionItemBuilderJsonParser;
import com.yandex.div2.DivCollectionItemBuilderPrototypeJsonParser;
import com.yandex.div2.DivColorAnimatorJsonParser;
import com.yandex.div2.DivContainerJsonParser;
import com.yandex.div2.DivContainerSeparatorJsonParser;
import com.yandex.div2.DivCornersRadiusJsonParser;
import com.yandex.div2.DivCustomJsonParser;
import com.yandex.div2.DivDataJsonParser;
import com.yandex.div2.DivDefaultIndicatorItemPlacementJsonParser;
import com.yandex.div2.DivDimensionJsonParser;
import com.yandex.div2.DivDisappearActionJsonParser;
import com.yandex.div2.DivEdgeInsetsJsonParser;
import com.yandex.div2.DivFadeTransitionJsonParser;
import com.yandex.div2.DivFixedCountJsonParser;
import com.yandex.div2.DivFixedLengthInputMaskJsonParser;
import com.yandex.div2.DivFixedLengthInputMaskPatternElementJsonParser;
import com.yandex.div2.DivFixedSizeJsonParser;
import com.yandex.div2.DivFunctionJsonParser;
import com.yandex.div2.DivGalleryJsonParser;
import com.yandex.div2.DivGifImageJsonParser;
import com.yandex.div2.DivGridJsonParser;
import com.yandex.div2.DivImageBackgroundJsonParser;
import com.yandex.div2.DivImageJsonParser;
import com.yandex.div2.DivIndicatorJsonParser;
import com.yandex.div2.DivInputJsonParser;
import com.yandex.div2.DivInputValidatorBaseJsonParser;
import com.yandex.div2.DivInputValidatorExpressionJsonParser;
import com.yandex.div2.DivInputValidatorRegexJsonParser;
import com.yandex.div2.DivLinearGradientColorPointJsonParser;
import com.yandex.div2.DivLinearGradientJsonParser;
import com.yandex.div2.DivMatchParentSizeJsonParser;
import com.yandex.div2.DivNumberAnimatorJsonParser;
import com.yandex.div2.DivPageTransformationOverlapJsonParser;
import com.yandex.div2.DivPageTransformationSlideJsonParser;
import com.yandex.div2.DivPagerJsonParser;
import com.yandex.div2.DivPatchJsonParser;
import com.yandex.div2.DivPercentageSizeJsonParser;
import com.yandex.div2.DivPivotFixedJsonParser;
import com.yandex.div2.DivRadialGradientColorPointJsonParser;
import com.yandex.div2.DivRadialGradientFixedCenterJsonParser;
import com.yandex.div2.DivRadialGradientJsonParser;
import com.yandex.div2.DivRadialGradientRelativeRadiusJsonParser;
import com.yandex.div2.DivRoundedRectangleShapeJsonParser;
import com.yandex.div2.DivScaleTransitionJsonParser;
import com.yandex.div2.DivSelectJsonParser;
import com.yandex.div2.DivSeparatorDelimiterStyleJsonParser;
import com.yandex.div2.DivSeparatorJsonParser;
import com.yandex.div2.DivShadowJsonParser;
import com.yandex.div2.DivSizeUnitValueJsonParser;
import com.yandex.div2.DivSlideTransitionJsonParser;
import com.yandex.div2.DivSliderJsonParser;
import com.yandex.div2.DivSliderTextStyleJsonParser;
import com.yandex.div2.DivStateJsonParser;
import com.yandex.div2.DivStretchIndicatorItemPlacementJsonParser;
import com.yandex.div2.DivStrokeJsonParser;
import com.yandex.div2.DivSwitchJsonParser;
import com.yandex.div2.DivTabsJsonParser;
import com.yandex.div2.DivTabsTabTitleDelimiterJsonParser;
import com.yandex.div2.DivTabsTabTitleStyleJsonParser;
import com.yandex.div2.DivTextImageAccessibilityJsonParser;
import com.yandex.div2.DivTextImageJsonParser;
import com.yandex.div2.DivTextJsonParser;
import com.yandex.div2.DivTextRangeBorderJsonParser;
import com.yandex.div2.DivTextRangeJsonParser;
import com.yandex.div2.DivTextRangeMaskBaseJsonParser;
import com.yandex.div2.DivTextRangeMaskParticlesJsonParser;
import com.yandex.div2.DivTextRangeMaskSolidJsonParser;
import com.yandex.div2.DivTimerJsonParser;
import com.yandex.div2.DivTooltipJsonParser;
import com.yandex.div2.DivTransformJsonParser;
import com.yandex.div2.DivTriggerJsonParser;
import com.yandex.div2.DivVideoJsonParser;
import com.yandex.div2.DivVideoSourceResolutionJsonParser;
import com.yandex.div2.DivVisibilityActionJsonParser;
import com.yandex.div2.IndexDestinationJsonParser;
import com.yandex.div2.OffsetDestinationJsonParser;
import com.yandex.div2.PropertyVariableJsonParser;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: JsonParserComponent.kt */
/* loaded from: classes.dex */
public final class JsonParserComponent {
    private final Lazy arrayValueJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$arrayValueJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final ArrayValueJsonParser$EntityParserImpl mo4828invoke() {
            return new ArrayValueJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy arrayValueJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$arrayValueJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final ArrayValueJsonParser$TemplateParserImpl mo4828invoke() {
            return new ArrayValueJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy arrayValueJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$arrayValueJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final ArrayValueJsonParser$TemplateResolverImpl mo4828invoke() {
            return new ArrayValueJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy arrayVariableJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$arrayVariableJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final ArrayVariableJsonParser$EntityParserImpl mo4828invoke() {
            return new ArrayVariableJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy arrayVariableJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$arrayVariableJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final ArrayVariableJsonParser$TemplateParserImpl mo4828invoke() {
            return new ArrayVariableJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy arrayVariableJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$arrayVariableJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final ArrayVariableJsonParser$TemplateResolverImpl mo4828invoke() {
            return new ArrayVariableJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy boolValueJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$boolValueJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final BoolValueJsonParser$EntityParserImpl mo4828invoke() {
            return new BoolValueJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy boolValueJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$boolValueJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final BoolValueJsonParser$TemplateParserImpl mo4828invoke() {
            return new BoolValueJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy boolValueJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$boolValueJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final BoolValueJsonParser$TemplateResolverImpl mo4828invoke() {
            return new BoolValueJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy boolVariableJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$boolVariableJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final BoolVariableJsonParser$EntityParserImpl mo4828invoke() {
            return new BoolVariableJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy boolVariableJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$boolVariableJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final BoolVariableJsonParser$TemplateParserImpl mo4828invoke() {
            return new BoolVariableJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy boolVariableJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$boolVariableJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final BoolVariableJsonParser$TemplateResolverImpl mo4828invoke() {
            return new BoolVariableJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy colorValueJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$colorValueJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final ColorValueJsonParser$EntityParserImpl mo4828invoke() {
            return new ColorValueJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy colorValueJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$colorValueJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final ColorValueJsonParser$TemplateParserImpl mo4828invoke() {
            return new ColorValueJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy colorValueJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$colorValueJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final ColorValueJsonParser$TemplateResolverImpl mo4828invoke() {
            return new ColorValueJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy colorVariableJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$colorVariableJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final ColorVariableJsonParser$EntityParserImpl mo4828invoke() {
            return new ColorVariableJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy colorVariableJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$colorVariableJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final ColorVariableJsonParser$TemplateParserImpl mo4828invoke() {
            return new ColorVariableJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy colorVariableJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$colorVariableJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final ColorVariableJsonParser$TemplateResolverImpl mo4828invoke() {
            return new ColorVariableJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy contentTextJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$contentTextJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final ContentTextJsonParser$EntityParserImpl mo4828invoke() {
            return new ContentTextJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy contentTextJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$contentTextJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final ContentTextJsonParser$TemplateParserImpl mo4828invoke() {
            return new ContentTextJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy contentTextJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$contentTextJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final ContentTextJsonParser$TemplateResolverImpl mo4828invoke() {
            return new ContentTextJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy contentUrlJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$contentUrlJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final ContentUrlJsonParser$EntityParserImpl mo4828invoke() {
            return new ContentUrlJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy contentUrlJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$contentUrlJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final ContentUrlJsonParser$TemplateParserImpl mo4828invoke() {
            return new ContentUrlJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy contentUrlJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$contentUrlJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final ContentUrlJsonParser$TemplateResolverImpl mo4828invoke() {
            return new ContentUrlJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy dictValueJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$dictValueJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DictValueJsonParser$EntityParserImpl mo4828invoke() {
            return new DictValueJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy dictValueJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$dictValueJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DictValueJsonParser$TemplateParserImpl mo4828invoke() {
            return new DictValueJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy dictValueJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$dictValueJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DictValueJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DictValueJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy dictVariableJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$dictVariableJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DictVariableJsonParser$EntityParserImpl mo4828invoke() {
            return new DictVariableJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy dictVariableJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$dictVariableJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DictVariableJsonParser$TemplateParserImpl mo4828invoke() {
            return new DictVariableJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy dictVariableJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$dictVariableJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DictVariableJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DictVariableJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divAbsoluteEdgeInsetsJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divAbsoluteEdgeInsetsJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivAbsoluteEdgeInsetsJsonParser.EntityParserImpl mo4828invoke() {
            return new DivAbsoluteEdgeInsetsJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divAbsoluteEdgeInsetsJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divAbsoluteEdgeInsetsJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivAbsoluteEdgeInsetsJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivAbsoluteEdgeInsetsJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divAbsoluteEdgeInsetsJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divAbsoluteEdgeInsetsJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivAbsoluteEdgeInsetsJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivAbsoluteEdgeInsetsJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divAccessibilityJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divAccessibilityJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivAccessibilityJsonParser.EntityParserImpl mo4828invoke() {
            return new DivAccessibilityJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divAccessibilityJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divAccessibilityJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivAccessibilityJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivAccessibilityJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divAccessibilityJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divAccessibilityJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivAccessibilityJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivAccessibilityJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionAnimatorStartJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionAnimatorStartJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionAnimatorStartJsonParser.EntityParserImpl mo4828invoke() {
            return new DivActionAnimatorStartJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionAnimatorStartJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionAnimatorStartJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionAnimatorStartJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivActionAnimatorStartJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionAnimatorStartJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionAnimatorStartJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionAnimatorStartJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivActionAnimatorStartJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionAnimatorStopJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionAnimatorStopJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionAnimatorStopJsonParser$EntityParserImpl mo4828invoke() {
            return new DivActionAnimatorStopJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionAnimatorStopJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionAnimatorStopJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionAnimatorStopJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivActionAnimatorStopJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionAnimatorStopJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionAnimatorStopJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionAnimatorStopJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivActionAnimatorStopJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionArrayInsertValueJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionArrayInsertValueJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionArrayInsertValueJsonParser$EntityParserImpl mo4828invoke() {
            return new DivActionArrayInsertValueJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionArrayInsertValueJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionArrayInsertValueJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionArrayInsertValueJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivActionArrayInsertValueJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionArrayInsertValueJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionArrayInsertValueJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionArrayInsertValueJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivActionArrayInsertValueJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionArrayRemoveValueJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionArrayRemoveValueJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionArrayRemoveValueJsonParser$EntityParserImpl mo4828invoke() {
            return new DivActionArrayRemoveValueJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionArrayRemoveValueJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionArrayRemoveValueJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionArrayRemoveValueJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivActionArrayRemoveValueJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionArrayRemoveValueJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionArrayRemoveValueJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionArrayRemoveValueJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivActionArrayRemoveValueJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionArraySetValueJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionArraySetValueJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionArraySetValueJsonParser$EntityParserImpl mo4828invoke() {
            return new DivActionArraySetValueJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionArraySetValueJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionArraySetValueJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionArraySetValueJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivActionArraySetValueJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionArraySetValueJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionArraySetValueJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionArraySetValueJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivActionArraySetValueJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionClearFocusJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionClearFocusJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionClearFocusJsonParser$EntityParserImpl mo4828invoke() {
            return new DivActionClearFocusJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionClearFocusJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionClearFocusJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionClearFocusJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivActionClearFocusJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionClearFocusJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionClearFocusJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionClearFocusJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivActionClearFocusJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionCopyToClipboardContentJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionCopyToClipboardContentJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionCopyToClipboardContentJsonParser$EntityParserImpl mo4828invoke() {
            return new DivActionCopyToClipboardContentJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionCopyToClipboardContentJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionCopyToClipboardContentJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionCopyToClipboardContentJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivActionCopyToClipboardContentJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionCopyToClipboardContentJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionCopyToClipboardContentJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionCopyToClipboardContentJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivActionCopyToClipboardContentJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionCopyToClipboardJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionCopyToClipboardJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionCopyToClipboardJsonParser$EntityParserImpl mo4828invoke() {
            return new DivActionCopyToClipboardJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionCopyToClipboardJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionCopyToClipboardJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionCopyToClipboardJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivActionCopyToClipboardJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionCopyToClipboardJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionCopyToClipboardJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionCopyToClipboardJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivActionCopyToClipboardJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionDictSetValueJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionDictSetValueJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionDictSetValueJsonParser$EntityParserImpl mo4828invoke() {
            return new DivActionDictSetValueJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionDictSetValueJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionDictSetValueJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionDictSetValueJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivActionDictSetValueJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionDictSetValueJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionDictSetValueJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionDictSetValueJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivActionDictSetValueJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionDownloadJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionDownloadJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionDownloadJsonParser$EntityParserImpl mo4828invoke() {
            return new DivActionDownloadJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionDownloadJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionDownloadJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionDownloadJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivActionDownloadJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionDownloadJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionDownloadJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionDownloadJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivActionDownloadJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionFocusElementJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionFocusElementJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionFocusElementJsonParser$EntityParserImpl mo4828invoke() {
            return new DivActionFocusElementJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionFocusElementJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionFocusElementJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionFocusElementJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivActionFocusElementJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionFocusElementJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionFocusElementJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionFocusElementJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivActionFocusElementJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionHideTooltipJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionHideTooltipJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionHideTooltipJsonParser$EntityParserImpl mo4828invoke() {
            return new DivActionHideTooltipJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionHideTooltipJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionHideTooltipJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionHideTooltipJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivActionHideTooltipJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionHideTooltipJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionHideTooltipJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionHideTooltipJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivActionHideTooltipJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionScrollByJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionScrollByJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionScrollByJsonParser.EntityParserImpl mo4828invoke() {
            return new DivActionScrollByJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionScrollByJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionScrollByJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionScrollByJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivActionScrollByJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionScrollByJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionScrollByJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionScrollByJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivActionScrollByJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionScrollDestinationJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionScrollDestinationJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionScrollDestinationJsonParser$EntityParserImpl mo4828invoke() {
            return new DivActionScrollDestinationJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionScrollDestinationJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionScrollDestinationJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionScrollDestinationJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivActionScrollDestinationJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionScrollDestinationJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionScrollDestinationJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionScrollDestinationJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivActionScrollDestinationJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionScrollToJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionScrollToJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionScrollToJsonParser.EntityParserImpl mo4828invoke() {
            return new DivActionScrollToJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionScrollToJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionScrollToJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionScrollToJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivActionScrollToJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionScrollToJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionScrollToJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionScrollToJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivActionScrollToJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionSetStateJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionSetStateJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionSetStateJsonParser.EntityParserImpl mo4828invoke() {
            return new DivActionSetStateJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionSetStateJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionSetStateJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionSetStateJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivActionSetStateJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionSetStateJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionSetStateJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionSetStateJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivActionSetStateJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionSetStoredValueJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionSetStoredValueJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionSetStoredValueJsonParser$EntityParserImpl mo4828invoke() {
            return new DivActionSetStoredValueJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionSetStoredValueJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionSetStoredValueJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionSetStoredValueJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivActionSetStoredValueJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionSetStoredValueJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionSetStoredValueJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionSetStoredValueJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivActionSetStoredValueJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionSetVariableJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionSetVariableJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionSetVariableJsonParser$EntityParserImpl mo4828invoke() {
            return new DivActionSetVariableJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionSetVariableJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionSetVariableJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionSetVariableJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivActionSetVariableJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionSetVariableJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionSetVariableJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionSetVariableJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivActionSetVariableJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionShowTooltipJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionShowTooltipJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionShowTooltipJsonParser$EntityParserImpl mo4828invoke() {
            return new DivActionShowTooltipJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionShowTooltipJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionShowTooltipJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionShowTooltipJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivActionShowTooltipJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionShowTooltipJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionShowTooltipJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionShowTooltipJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivActionShowTooltipJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionSubmitJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionSubmitJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionSubmitJsonParser$EntityParserImpl mo4828invoke() {
            return new DivActionSubmitJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionSubmitJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionSubmitJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionSubmitJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivActionSubmitJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionSubmitJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionSubmitJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionSubmitJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivActionSubmitJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionSubmitRequestJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionSubmitRequestJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionSubmitRequestJsonParser.EntityParserImpl mo4828invoke() {
            return new DivActionSubmitRequestJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionSubmitRequestJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionSubmitRequestJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionSubmitRequestJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivActionSubmitRequestJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionSubmitRequestJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionSubmitRequestJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionSubmitRequestJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivActionSubmitRequestJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionSubmitRequestHeaderJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionSubmitRequestHeaderJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionSubmitRequestHeaderJsonParser$EntityParserImpl mo4828invoke() {
            return new DivActionSubmitRequestHeaderJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionSubmitRequestHeaderJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionSubmitRequestHeaderJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionSubmitRequestHeaderJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivActionSubmitRequestHeaderJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionSubmitRequestHeaderJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionSubmitRequestHeaderJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionSubmitRequestHeaderJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivActionSubmitRequestHeaderJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionTimerJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionTimerJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionTimerJsonParser.EntityParserImpl mo4828invoke() {
            return new DivActionTimerJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionTimerJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionTimerJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionTimerJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivActionTimerJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionTimerJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionTimerJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionTimerJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivActionTimerJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionTypedJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionTypedJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionTypedJsonParser$EntityParserImpl mo4828invoke() {
            return new DivActionTypedJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionTypedJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionTypedJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionTypedJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivActionTypedJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionTypedJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionTypedJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionTypedJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivActionTypedJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionUpdateStructureJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionUpdateStructureJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionUpdateStructureJsonParser.EntityParserImpl mo4828invoke() {
            return new DivActionUpdateStructureJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionUpdateStructureJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionUpdateStructureJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionUpdateStructureJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivActionUpdateStructureJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionUpdateStructureJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionUpdateStructureJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionUpdateStructureJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivActionUpdateStructureJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionVideoJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionVideoJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionVideoJsonParser.EntityParserImpl mo4828invoke() {
            return new DivActionVideoJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionVideoJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionVideoJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionVideoJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivActionVideoJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionVideoJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionVideoJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionVideoJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivActionVideoJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionJsonParser.EntityParserImpl mo4828invoke() {
            return new DivActionJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivActionJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivActionJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionMenuItemJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionMenuItemJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionMenuItemJsonParser$EntityParserImpl mo4828invoke() {
            return new DivActionMenuItemJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionMenuItemJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionMenuItemJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionMenuItemJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivActionMenuItemJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divActionMenuItemJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divActionMenuItemJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivActionMenuItemJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivActionMenuItemJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divAnimationJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divAnimationJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivAnimationJsonParser.EntityParserImpl mo4828invoke() {
            return new DivAnimationJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divAnimationJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divAnimationJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivAnimationJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivAnimationJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divAnimationJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divAnimationJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivAnimationJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivAnimationJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divAnimatorJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divAnimatorJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivAnimatorJsonParser$EntityParserImpl mo4828invoke() {
            return new DivAnimatorJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divAnimatorJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divAnimatorJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivAnimatorJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivAnimatorJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divAnimatorJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divAnimatorJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivAnimatorJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivAnimatorJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divAppearanceSetTransitionJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divAppearanceSetTransitionJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivAppearanceSetTransitionJsonParser.EntityParserImpl mo4828invoke() {
            return new DivAppearanceSetTransitionJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divAppearanceSetTransitionJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divAppearanceSetTransitionJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivAppearanceSetTransitionJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivAppearanceSetTransitionJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divAppearanceSetTransitionJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divAppearanceSetTransitionJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivAppearanceSetTransitionJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivAppearanceSetTransitionJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divAppearanceTransitionJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divAppearanceTransitionJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivAppearanceTransitionJsonParser$EntityParserImpl mo4828invoke() {
            return new DivAppearanceTransitionJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divAppearanceTransitionJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divAppearanceTransitionJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivAppearanceTransitionJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivAppearanceTransitionJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divAppearanceTransitionJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divAppearanceTransitionJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivAppearanceTransitionJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivAppearanceTransitionJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divAspectJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divAspectJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivAspectJsonParser.EntityParserImpl mo4828invoke() {
            return new DivAspectJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divAspectJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divAspectJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivAspectJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivAspectJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divAspectJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divAspectJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivAspectJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivAspectJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divBackgroundJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divBackgroundJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivBackgroundJsonParser$EntityParserImpl mo4828invoke() {
            return new DivBackgroundJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divBackgroundJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divBackgroundJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivBackgroundJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivBackgroundJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divBackgroundJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divBackgroundJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivBackgroundJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivBackgroundJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divBlurJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divBlurJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivBlurJsonParser.EntityParserImpl mo4828invoke() {
            return new DivBlurJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divBlurJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divBlurJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivBlurJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivBlurJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divBlurJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divBlurJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivBlurJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivBlurJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divBorderJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divBorderJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivBorderJsonParser.EntityParserImpl mo4828invoke() {
            return new DivBorderJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divBorderJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divBorderJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivBorderJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivBorderJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divBorderJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divBorderJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivBorderJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivBorderJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divChangeBoundsTransitionJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divChangeBoundsTransitionJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivChangeBoundsTransitionJsonParser.EntityParserImpl mo4828invoke() {
            return new DivChangeBoundsTransitionJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divChangeBoundsTransitionJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divChangeBoundsTransitionJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivChangeBoundsTransitionJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivChangeBoundsTransitionJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divChangeBoundsTransitionJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divChangeBoundsTransitionJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivChangeBoundsTransitionJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivChangeBoundsTransitionJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divChangeSetTransitionJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divChangeSetTransitionJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivChangeSetTransitionJsonParser.EntityParserImpl mo4828invoke() {
            return new DivChangeSetTransitionJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divChangeSetTransitionJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divChangeSetTransitionJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivChangeSetTransitionJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivChangeSetTransitionJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divChangeSetTransitionJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divChangeSetTransitionJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivChangeSetTransitionJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivChangeSetTransitionJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divChangeTransitionJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divChangeTransitionJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivChangeTransitionJsonParser$EntityParserImpl mo4828invoke() {
            return new DivChangeTransitionJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divChangeTransitionJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divChangeTransitionJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivChangeTransitionJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivChangeTransitionJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divChangeTransitionJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divChangeTransitionJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivChangeTransitionJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivChangeTransitionJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divCircleShapeJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divCircleShapeJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivCircleShapeJsonParser.EntityParserImpl mo4828invoke() {
            return new DivCircleShapeJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divCircleShapeJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divCircleShapeJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivCircleShapeJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivCircleShapeJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divCircleShapeJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divCircleShapeJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivCircleShapeJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivCircleShapeJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divCloudBackgroundJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divCloudBackgroundJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivCloudBackgroundJsonParser.EntityParserImpl mo4828invoke() {
            return new DivCloudBackgroundJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divCloudBackgroundJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divCloudBackgroundJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivCloudBackgroundJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivCloudBackgroundJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divCloudBackgroundJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divCloudBackgroundJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivCloudBackgroundJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivCloudBackgroundJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divCollectionItemBuilderJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divCollectionItemBuilderJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivCollectionItemBuilderJsonParser.EntityParserImpl mo4828invoke() {
            return new DivCollectionItemBuilderJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divCollectionItemBuilderJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divCollectionItemBuilderJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivCollectionItemBuilderJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivCollectionItemBuilderJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divCollectionItemBuilderJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divCollectionItemBuilderJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivCollectionItemBuilderJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivCollectionItemBuilderJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divCollectionItemBuilderPrototypeJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divCollectionItemBuilderPrototypeJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivCollectionItemBuilderPrototypeJsonParser.EntityParserImpl mo4828invoke() {
            return new DivCollectionItemBuilderPrototypeJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divCollectionItemBuilderPrototypeJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divCollectionItemBuilderPrototypeJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivCollectionItemBuilderPrototypeJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivCollectionItemBuilderPrototypeJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divCollectionItemBuilderPrototypeJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divCollectionItemBuilderPrototypeJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivCollectionItemBuilderPrototypeJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivCollectionItemBuilderPrototypeJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divColorAnimatorJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divColorAnimatorJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivColorAnimatorJsonParser.EntityParserImpl mo4828invoke() {
            return new DivColorAnimatorJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divColorAnimatorJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divColorAnimatorJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivColorAnimatorJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivColorAnimatorJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divColorAnimatorJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divColorAnimatorJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivColorAnimatorJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivColorAnimatorJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divContainerJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divContainerJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivContainerJsonParser.EntityParserImpl mo4828invoke() {
            return new DivContainerJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divContainerJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divContainerJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivContainerJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivContainerJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divContainerJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divContainerJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivContainerJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivContainerJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divContainerSeparatorJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divContainerSeparatorJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivContainerSeparatorJsonParser.EntityParserImpl mo4828invoke() {
            return new DivContainerSeparatorJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divContainerSeparatorJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divContainerSeparatorJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivContainerSeparatorJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivContainerSeparatorJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divContainerSeparatorJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divContainerSeparatorJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivContainerSeparatorJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivContainerSeparatorJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divCornersRadiusJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divCornersRadiusJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivCornersRadiusJsonParser.EntityParserImpl mo4828invoke() {
            return new DivCornersRadiusJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divCornersRadiusJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divCornersRadiusJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivCornersRadiusJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivCornersRadiusJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divCornersRadiusJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divCornersRadiusJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivCornersRadiusJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivCornersRadiusJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divCountJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divCountJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivCountJsonParser$EntityParserImpl mo4828invoke() {
            return new DivCountJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divCountJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divCountJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivCountJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivCountJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divCountJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divCountJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivCountJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivCountJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divCurrencyInputMaskJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divCurrencyInputMaskJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivCurrencyInputMaskJsonParser$EntityParserImpl mo4828invoke() {
            return new DivCurrencyInputMaskJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divCurrencyInputMaskJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divCurrencyInputMaskJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivCurrencyInputMaskJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivCurrencyInputMaskJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divCurrencyInputMaskJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divCurrencyInputMaskJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivCurrencyInputMaskJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivCurrencyInputMaskJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divCustomJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divCustomJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivCustomJsonParser.EntityParserImpl mo4828invoke() {
            return new DivCustomJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divCustomJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divCustomJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivCustomJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivCustomJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divCustomJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divCustomJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivCustomJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivCustomJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divDataJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divDataJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivDataJsonParser.EntityParserImpl mo4828invoke() {
            return new DivDataJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divDataJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divDataJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivDataJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivDataJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divDataJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divDataJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivDataJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivDataJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divDataStateJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divDataStateJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivDataStateJsonParser$EntityParserImpl mo4828invoke() {
            return new DivDataStateJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divDataStateJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divDataStateJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivDataStateJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivDataStateJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divDataStateJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divDataStateJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivDataStateJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivDataStateJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divDefaultIndicatorItemPlacementJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divDefaultIndicatorItemPlacementJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivDefaultIndicatorItemPlacementJsonParser.EntityParserImpl mo4828invoke() {
            return new DivDefaultIndicatorItemPlacementJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divDefaultIndicatorItemPlacementJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divDefaultIndicatorItemPlacementJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivDefaultIndicatorItemPlacementJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivDefaultIndicatorItemPlacementJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divDefaultIndicatorItemPlacementJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divDefaultIndicatorItemPlacementJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivDefaultIndicatorItemPlacementJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivDefaultIndicatorItemPlacementJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divDimensionJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divDimensionJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivDimensionJsonParser.EntityParserImpl mo4828invoke() {
            return new DivDimensionJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divDimensionJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divDimensionJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivDimensionJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivDimensionJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divDimensionJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divDimensionJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivDimensionJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivDimensionJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divDisappearActionJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divDisappearActionJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivDisappearActionJsonParser.EntityParserImpl mo4828invoke() {
            return new DivDisappearActionJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divDisappearActionJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divDisappearActionJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivDisappearActionJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivDisappearActionJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divDisappearActionJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divDisappearActionJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivDisappearActionJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivDisappearActionJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divDownloadCallbacksJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divDownloadCallbacksJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivDownloadCallbacksJsonParser$EntityParserImpl mo4828invoke() {
            return new DivDownloadCallbacksJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divDownloadCallbacksJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divDownloadCallbacksJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivDownloadCallbacksJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivDownloadCallbacksJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divDownloadCallbacksJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divDownloadCallbacksJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivDownloadCallbacksJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivDownloadCallbacksJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divDrawableJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divDrawableJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivDrawableJsonParser$EntityParserImpl mo4828invoke() {
            return new DivDrawableJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divDrawableJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divDrawableJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivDrawableJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivDrawableJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divDrawableJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divDrawableJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivDrawableJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivDrawableJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divEdgeInsetsJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divEdgeInsetsJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivEdgeInsetsJsonParser.EntityParserImpl mo4828invoke() {
            return new DivEdgeInsetsJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divEdgeInsetsJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divEdgeInsetsJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivEdgeInsetsJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivEdgeInsetsJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divEdgeInsetsJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divEdgeInsetsJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivEdgeInsetsJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivEdgeInsetsJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divExtensionJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divExtensionJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivExtensionJsonParser$EntityParserImpl mo4828invoke() {
            return new DivExtensionJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divExtensionJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divExtensionJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivExtensionJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivExtensionJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divExtensionJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divExtensionJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivExtensionJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivExtensionJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divFadeTransitionJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divFadeTransitionJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivFadeTransitionJsonParser.EntityParserImpl mo4828invoke() {
            return new DivFadeTransitionJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divFadeTransitionJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divFadeTransitionJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivFadeTransitionJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivFadeTransitionJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divFadeTransitionJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divFadeTransitionJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivFadeTransitionJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivFadeTransitionJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divFilterRtlMirrorJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divFilterRtlMirrorJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivFilterRtlMirrorJsonParser$EntityParserImpl mo4828invoke() {
            return new DivFilterRtlMirrorJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divFilterRtlMirrorJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divFilterRtlMirrorJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivFilterRtlMirrorJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivFilterRtlMirrorJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divFilterRtlMirrorJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divFilterRtlMirrorJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivFilterRtlMirrorJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivFilterRtlMirrorJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divFilterJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divFilterJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivFilterJsonParser$EntityParserImpl mo4828invoke() {
            return new DivFilterJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divFilterJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divFilterJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivFilterJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivFilterJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divFilterJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divFilterJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivFilterJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivFilterJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divFixedCountJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divFixedCountJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivFixedCountJsonParser.EntityParserImpl mo4828invoke() {
            return new DivFixedCountJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divFixedCountJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divFixedCountJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivFixedCountJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivFixedCountJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divFixedCountJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divFixedCountJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivFixedCountJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivFixedCountJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divFixedLengthInputMaskJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divFixedLengthInputMaskJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivFixedLengthInputMaskJsonParser.EntityParserImpl mo4828invoke() {
            return new DivFixedLengthInputMaskJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divFixedLengthInputMaskJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divFixedLengthInputMaskJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivFixedLengthInputMaskJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivFixedLengthInputMaskJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divFixedLengthInputMaskJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divFixedLengthInputMaskJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivFixedLengthInputMaskJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivFixedLengthInputMaskJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divFixedLengthInputMaskPatternElementJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divFixedLengthInputMaskPatternElementJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivFixedLengthInputMaskPatternElementJsonParser.EntityParserImpl mo4828invoke() {
            return new DivFixedLengthInputMaskPatternElementJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divFixedLengthInputMaskPatternElementJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divFixedLengthInputMaskPatternElementJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivFixedLengthInputMaskPatternElementJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivFixedLengthInputMaskPatternElementJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divFixedLengthInputMaskPatternElementJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divFixedLengthInputMaskPatternElementJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivFixedLengthInputMaskPatternElementJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivFixedLengthInputMaskPatternElementJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divFixedSizeJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divFixedSizeJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivFixedSizeJsonParser.EntityParserImpl mo4828invoke() {
            return new DivFixedSizeJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divFixedSizeJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divFixedSizeJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivFixedSizeJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivFixedSizeJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divFixedSizeJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divFixedSizeJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivFixedSizeJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivFixedSizeJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divFocusJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divFocusJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivFocusJsonParser$EntityParserImpl mo4828invoke() {
            return new DivFocusJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divFocusJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divFocusJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivFocusJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivFocusJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divFocusJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divFocusJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivFocusJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivFocusJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divFocusNextFocusIdsJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divFocusNextFocusIdsJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivFocusNextFocusIdsJsonParser$EntityParserImpl mo4828invoke() {
            return new DivFocusNextFocusIdsJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divFocusNextFocusIdsJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divFocusNextFocusIdsJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivFocusNextFocusIdsJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivFocusNextFocusIdsJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divFocusNextFocusIdsJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divFocusNextFocusIdsJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivFocusNextFocusIdsJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivFocusNextFocusIdsJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divFunctionArgumentJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divFunctionArgumentJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivFunctionArgumentJsonParser$EntityParserImpl mo4828invoke() {
            return new DivFunctionArgumentJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divFunctionArgumentJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divFunctionArgumentJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivFunctionArgumentJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivFunctionArgumentJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divFunctionArgumentJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divFunctionArgumentJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivFunctionArgumentJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivFunctionArgumentJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divFunctionJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divFunctionJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivFunctionJsonParser.EntityParserImpl mo4828invoke() {
            return new DivFunctionJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divFunctionJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divFunctionJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivFunctionJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivFunctionJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divFunctionJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divFunctionJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivFunctionJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivFunctionJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divGalleryJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divGalleryJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivGalleryJsonParser.EntityParserImpl mo4828invoke() {
            return new DivGalleryJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divGalleryJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divGalleryJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivGalleryJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivGalleryJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divGalleryJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divGalleryJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivGalleryJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivGalleryJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divGifImageJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divGifImageJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivGifImageJsonParser.EntityParserImpl mo4828invoke() {
            return new DivGifImageJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divGifImageJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divGifImageJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivGifImageJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivGifImageJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divGifImageJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divGifImageJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivGifImageJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivGifImageJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divGridJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divGridJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivGridJsonParser.EntityParserImpl mo4828invoke() {
            return new DivGridJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divGridJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divGridJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivGridJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivGridJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divGridJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divGridJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivGridJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivGridJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divImageBackgroundJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divImageBackgroundJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivImageBackgroundJsonParser.EntityParserImpl mo4828invoke() {
            return new DivImageBackgroundJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divImageBackgroundJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divImageBackgroundJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivImageBackgroundJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivImageBackgroundJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divImageBackgroundJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divImageBackgroundJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivImageBackgroundJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivImageBackgroundJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divImageJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divImageJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivImageJsonParser.EntityParserImpl mo4828invoke() {
            return new DivImageJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divImageJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divImageJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivImageJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivImageJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divImageJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divImageJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivImageJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivImageJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divIndicatorItemPlacementJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divIndicatorItemPlacementJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivIndicatorItemPlacementJsonParser$EntityParserImpl mo4828invoke() {
            return new DivIndicatorItemPlacementJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divIndicatorItemPlacementJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divIndicatorItemPlacementJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivIndicatorItemPlacementJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivIndicatorItemPlacementJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divIndicatorItemPlacementJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divIndicatorItemPlacementJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivIndicatorItemPlacementJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivIndicatorItemPlacementJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divIndicatorJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divIndicatorJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivIndicatorJsonParser.EntityParserImpl mo4828invoke() {
            return new DivIndicatorJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divIndicatorJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divIndicatorJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivIndicatorJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivIndicatorJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divIndicatorJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divIndicatorJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivIndicatorJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivIndicatorJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divInfinityCountJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divInfinityCountJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivInfinityCountJsonParser$EntityParserImpl mo4828invoke() {
            return new DivInfinityCountJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divInfinityCountJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divInfinityCountJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivInfinityCountJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivInfinityCountJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divInfinityCountJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divInfinityCountJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivInfinityCountJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivInfinityCountJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divInputFilterExpressionJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divInputFilterExpressionJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivInputFilterExpressionJsonParser$EntityParserImpl mo4828invoke() {
            return new DivInputFilterExpressionJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divInputFilterExpressionJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divInputFilterExpressionJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivInputFilterExpressionJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivInputFilterExpressionJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divInputFilterExpressionJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divInputFilterExpressionJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivInputFilterExpressionJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivInputFilterExpressionJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divInputFilterRegexJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divInputFilterRegexJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivInputFilterRegexJsonParser$EntityParserImpl mo4828invoke() {
            return new DivInputFilterRegexJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divInputFilterRegexJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divInputFilterRegexJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivInputFilterRegexJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivInputFilterRegexJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divInputFilterRegexJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divInputFilterRegexJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivInputFilterRegexJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivInputFilterRegexJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divInputFilterJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divInputFilterJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivInputFilterJsonParser$EntityParserImpl mo4828invoke() {
            return new DivInputFilterJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divInputFilterJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divInputFilterJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivInputFilterJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivInputFilterJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divInputFilterJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divInputFilterJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivInputFilterJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivInputFilterJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divInputMaskJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divInputMaskJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivInputMaskJsonParser$EntityParserImpl mo4828invoke() {
            return new DivInputMaskJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divInputMaskJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divInputMaskJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivInputMaskJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivInputMaskJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divInputMaskJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divInputMaskJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivInputMaskJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivInputMaskJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divInputValidatorBaseJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divInputValidatorBaseJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivInputValidatorBaseJsonParser.EntityParserImpl mo4828invoke() {
            return new DivInputValidatorBaseJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divInputValidatorBaseJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divInputValidatorBaseJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivInputValidatorBaseJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivInputValidatorBaseJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divInputValidatorBaseJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divInputValidatorBaseJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivInputValidatorBaseJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivInputValidatorBaseJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divInputValidatorExpressionJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divInputValidatorExpressionJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivInputValidatorExpressionJsonParser.EntityParserImpl mo4828invoke() {
            return new DivInputValidatorExpressionJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divInputValidatorExpressionJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divInputValidatorExpressionJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivInputValidatorExpressionJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivInputValidatorExpressionJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divInputValidatorExpressionJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divInputValidatorExpressionJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivInputValidatorExpressionJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivInputValidatorExpressionJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divInputValidatorRegexJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divInputValidatorRegexJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivInputValidatorRegexJsonParser.EntityParserImpl mo4828invoke() {
            return new DivInputValidatorRegexJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divInputValidatorRegexJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divInputValidatorRegexJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivInputValidatorRegexJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivInputValidatorRegexJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divInputValidatorRegexJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divInputValidatorRegexJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivInputValidatorRegexJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivInputValidatorRegexJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divInputValidatorJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divInputValidatorJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivInputValidatorJsonParser$EntityParserImpl mo4828invoke() {
            return new DivInputValidatorJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divInputValidatorJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divInputValidatorJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivInputValidatorJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivInputValidatorJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divInputValidatorJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divInputValidatorJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivInputValidatorJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivInputValidatorJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divInputJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divInputJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivInputJsonParser.EntityParserImpl mo4828invoke() {
            return new DivInputJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divInputJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divInputJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivInputJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivInputJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divInputJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divInputJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivInputJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivInputJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divInputNativeInterfaceJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divInputNativeInterfaceJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivInputNativeInterfaceJsonParser$EntityParserImpl mo4828invoke() {
            return new DivInputNativeInterfaceJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divInputNativeInterfaceJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divInputNativeInterfaceJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivInputNativeInterfaceJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivInputNativeInterfaceJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divInputNativeInterfaceJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divInputNativeInterfaceJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivInputNativeInterfaceJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivInputNativeInterfaceJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divLayoutProviderJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divLayoutProviderJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivLayoutProviderJsonParser$EntityParserImpl mo4828invoke() {
            return new DivLayoutProviderJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divLayoutProviderJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divLayoutProviderJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivLayoutProviderJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivLayoutProviderJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divLayoutProviderJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divLayoutProviderJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivLayoutProviderJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivLayoutProviderJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divLinearGradientJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divLinearGradientJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivLinearGradientJsonParser.EntityParserImpl mo4828invoke() {
            return new DivLinearGradientJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divLinearGradientJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divLinearGradientJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivLinearGradientJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivLinearGradientJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divLinearGradientJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divLinearGradientJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivLinearGradientJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivLinearGradientJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divLinearGradientColorPointJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divLinearGradientColorPointJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivLinearGradientColorPointJsonParser.EntityParserImpl mo4828invoke() {
            return new DivLinearGradientColorPointJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divLinearGradientColorPointJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divLinearGradientColorPointJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivLinearGradientColorPointJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivLinearGradientColorPointJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divLinearGradientColorPointJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divLinearGradientColorPointJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivLinearGradientColorPointJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivLinearGradientColorPointJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divMatchParentSizeJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divMatchParentSizeJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivMatchParentSizeJsonParser.EntityParserImpl mo4828invoke() {
            return new DivMatchParentSizeJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divMatchParentSizeJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divMatchParentSizeJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivMatchParentSizeJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivMatchParentSizeJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divMatchParentSizeJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divMatchParentSizeJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivMatchParentSizeJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivMatchParentSizeJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divNeighbourPageSizeJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divNeighbourPageSizeJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivNeighbourPageSizeJsonParser$EntityParserImpl mo4828invoke() {
            return new DivNeighbourPageSizeJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divNeighbourPageSizeJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divNeighbourPageSizeJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivNeighbourPageSizeJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivNeighbourPageSizeJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divNeighbourPageSizeJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divNeighbourPageSizeJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivNeighbourPageSizeJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivNeighbourPageSizeJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divNinePatchBackgroundJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divNinePatchBackgroundJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivNinePatchBackgroundJsonParser$EntityParserImpl mo4828invoke() {
            return new DivNinePatchBackgroundJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divNinePatchBackgroundJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divNinePatchBackgroundJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivNinePatchBackgroundJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivNinePatchBackgroundJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divNinePatchBackgroundJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divNinePatchBackgroundJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivNinePatchBackgroundJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivNinePatchBackgroundJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divNumberAnimatorJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divNumberAnimatorJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivNumberAnimatorJsonParser.EntityParserImpl mo4828invoke() {
            return new DivNumberAnimatorJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divNumberAnimatorJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divNumberAnimatorJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivNumberAnimatorJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivNumberAnimatorJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divNumberAnimatorJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divNumberAnimatorJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivNumberAnimatorJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivNumberAnimatorJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divPageContentSizeJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divPageContentSizeJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivPageContentSizeJsonParser$EntityParserImpl mo4828invoke() {
            return new DivPageContentSizeJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divPageContentSizeJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divPageContentSizeJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivPageContentSizeJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivPageContentSizeJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divPageContentSizeJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divPageContentSizeJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivPageContentSizeJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivPageContentSizeJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divPageSizeJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divPageSizeJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivPageSizeJsonParser$EntityParserImpl mo4828invoke() {
            return new DivPageSizeJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divPageSizeJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divPageSizeJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivPageSizeJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivPageSizeJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divPageSizeJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divPageSizeJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivPageSizeJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivPageSizeJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divPageTransformationOverlapJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divPageTransformationOverlapJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivPageTransformationOverlapJsonParser.EntityParserImpl mo4828invoke() {
            return new DivPageTransformationOverlapJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divPageTransformationOverlapJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divPageTransformationOverlapJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivPageTransformationOverlapJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivPageTransformationOverlapJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divPageTransformationOverlapJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divPageTransformationOverlapJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivPageTransformationOverlapJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivPageTransformationOverlapJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divPageTransformationSlideJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divPageTransformationSlideJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivPageTransformationSlideJsonParser.EntityParserImpl mo4828invoke() {
            return new DivPageTransformationSlideJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divPageTransformationSlideJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divPageTransformationSlideJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivPageTransformationSlideJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivPageTransformationSlideJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divPageTransformationSlideJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divPageTransformationSlideJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivPageTransformationSlideJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivPageTransformationSlideJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divPageTransformationJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divPageTransformationJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivPageTransformationJsonParser$EntityParserImpl mo4828invoke() {
            return new DivPageTransformationJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divPageTransformationJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divPageTransformationJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivPageTransformationJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivPageTransformationJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divPageTransformationJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divPageTransformationJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivPageTransformationJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivPageTransformationJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divPagerLayoutModeJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divPagerLayoutModeJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivPagerLayoutModeJsonParser$EntityParserImpl mo4828invoke() {
            return new DivPagerLayoutModeJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divPagerLayoutModeJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divPagerLayoutModeJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivPagerLayoutModeJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivPagerLayoutModeJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divPagerLayoutModeJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divPagerLayoutModeJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivPagerLayoutModeJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivPagerLayoutModeJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divPagerJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divPagerJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivPagerJsonParser.EntityParserImpl mo4828invoke() {
            return new DivPagerJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divPagerJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divPagerJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivPagerJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivPagerJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divPagerJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divPagerJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivPagerJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivPagerJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divPatchJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divPatchJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivPatchJsonParser.EntityParserImpl mo4828invoke() {
            return new DivPatchJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divPatchJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divPatchJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivPatchJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivPatchJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divPatchJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divPatchJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivPatchJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivPatchJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divPatchChangeJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divPatchChangeJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivPatchChangeJsonParser$EntityParserImpl mo4828invoke() {
            return new DivPatchChangeJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divPatchChangeJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divPatchChangeJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivPatchChangeJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivPatchChangeJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divPatchChangeJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divPatchChangeJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivPatchChangeJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivPatchChangeJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divPercentageSizeJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divPercentageSizeJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivPercentageSizeJsonParser.EntityParserImpl mo4828invoke() {
            return new DivPercentageSizeJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divPercentageSizeJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divPercentageSizeJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivPercentageSizeJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivPercentageSizeJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divPercentageSizeJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divPercentageSizeJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivPercentageSizeJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivPercentageSizeJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divPhoneInputMaskJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divPhoneInputMaskJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivPhoneInputMaskJsonParser$EntityParserImpl mo4828invoke() {
            return new DivPhoneInputMaskJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divPhoneInputMaskJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divPhoneInputMaskJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivPhoneInputMaskJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivPhoneInputMaskJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divPhoneInputMaskJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divPhoneInputMaskJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivPhoneInputMaskJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivPhoneInputMaskJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divPivotFixedJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divPivotFixedJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivPivotFixedJsonParser.EntityParserImpl mo4828invoke() {
            return new DivPivotFixedJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divPivotFixedJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divPivotFixedJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivPivotFixedJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivPivotFixedJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divPivotFixedJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divPivotFixedJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivPivotFixedJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivPivotFixedJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divPivotPercentageJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divPivotPercentageJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivPivotPercentageJsonParser$EntityParserImpl mo4828invoke() {
            return new DivPivotPercentageJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divPivotPercentageJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divPivotPercentageJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivPivotPercentageJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivPivotPercentageJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divPivotPercentageJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divPivotPercentageJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivPivotPercentageJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivPivotPercentageJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divPivotJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divPivotJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivPivotJsonParser$EntityParserImpl mo4828invoke() {
            return new DivPivotJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divPivotJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divPivotJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivPivotJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivPivotJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divPivotJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divPivotJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivPivotJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivPivotJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divPointJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divPointJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivPointJsonParser$EntityParserImpl mo4828invoke() {
            return new DivPointJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divPointJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divPointJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivPointJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivPointJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divPointJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divPointJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivPointJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivPointJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divRadialGradientCenterJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divRadialGradientCenterJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivRadialGradientCenterJsonParser$EntityParserImpl mo4828invoke() {
            return new DivRadialGradientCenterJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divRadialGradientCenterJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divRadialGradientCenterJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivRadialGradientCenterJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivRadialGradientCenterJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divRadialGradientCenterJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divRadialGradientCenterJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivRadialGradientCenterJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivRadialGradientCenterJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divRadialGradientFixedCenterJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divRadialGradientFixedCenterJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivRadialGradientFixedCenterJsonParser.EntityParserImpl mo4828invoke() {
            return new DivRadialGradientFixedCenterJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divRadialGradientFixedCenterJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divRadialGradientFixedCenterJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivRadialGradientFixedCenterJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivRadialGradientFixedCenterJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divRadialGradientFixedCenterJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divRadialGradientFixedCenterJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivRadialGradientFixedCenterJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivRadialGradientFixedCenterJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divRadialGradientRadiusJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divRadialGradientRadiusJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivRadialGradientRadiusJsonParser$EntityParserImpl mo4828invoke() {
            return new DivRadialGradientRadiusJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divRadialGradientRadiusJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divRadialGradientRadiusJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivRadialGradientRadiusJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivRadialGradientRadiusJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divRadialGradientRadiusJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divRadialGradientRadiusJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivRadialGradientRadiusJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivRadialGradientRadiusJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divRadialGradientRelativeCenterJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divRadialGradientRelativeCenterJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivRadialGradientRelativeCenterJsonParser$EntityParserImpl mo4828invoke() {
            return new DivRadialGradientRelativeCenterJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divRadialGradientRelativeCenterJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divRadialGradientRelativeCenterJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivRadialGradientRelativeCenterJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivRadialGradientRelativeCenterJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divRadialGradientRelativeCenterJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divRadialGradientRelativeCenterJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivRadialGradientRelativeCenterJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivRadialGradientRelativeCenterJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divRadialGradientRelativeRadiusJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divRadialGradientRelativeRadiusJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivRadialGradientRelativeRadiusJsonParser.EntityParserImpl mo4828invoke() {
            return new DivRadialGradientRelativeRadiusJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divRadialGradientRelativeRadiusJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divRadialGradientRelativeRadiusJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivRadialGradientRelativeRadiusJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivRadialGradientRelativeRadiusJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divRadialGradientRelativeRadiusJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divRadialGradientRelativeRadiusJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivRadialGradientRelativeRadiusJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivRadialGradientRelativeRadiusJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divRadialGradientJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divRadialGradientJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivRadialGradientJsonParser.EntityParserImpl mo4828invoke() {
            return new DivRadialGradientJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divRadialGradientJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divRadialGradientJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivRadialGradientJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivRadialGradientJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divRadialGradientJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divRadialGradientJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivRadialGradientJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivRadialGradientJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divRadialGradientColorPointJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divRadialGradientColorPointJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivRadialGradientColorPointJsonParser.EntityParserImpl mo4828invoke() {
            return new DivRadialGradientColorPointJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divRadialGradientColorPointJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divRadialGradientColorPointJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivRadialGradientColorPointJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivRadialGradientColorPointJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divRadialGradientColorPointJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divRadialGradientColorPointJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivRadialGradientColorPointJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivRadialGradientColorPointJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divRoundedRectangleShapeJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divRoundedRectangleShapeJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivRoundedRectangleShapeJsonParser.EntityParserImpl mo4828invoke() {
            return new DivRoundedRectangleShapeJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divRoundedRectangleShapeJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divRoundedRectangleShapeJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivRoundedRectangleShapeJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivRoundedRectangleShapeJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divRoundedRectangleShapeJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divRoundedRectangleShapeJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivRoundedRectangleShapeJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivRoundedRectangleShapeJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divScaleTransitionJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divScaleTransitionJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivScaleTransitionJsonParser.EntityParserImpl mo4828invoke() {
            return new DivScaleTransitionJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divScaleTransitionJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divScaleTransitionJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivScaleTransitionJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivScaleTransitionJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divScaleTransitionJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divScaleTransitionJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivScaleTransitionJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivScaleTransitionJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divSelectJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divSelectJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivSelectJsonParser.EntityParserImpl mo4828invoke() {
            return new DivSelectJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divSelectJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divSelectJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivSelectJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivSelectJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divSelectJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divSelectJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivSelectJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivSelectJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divSelectOptionJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divSelectOptionJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivSelectOptionJsonParser$EntityParserImpl mo4828invoke() {
            return new DivSelectOptionJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divSelectOptionJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divSelectOptionJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivSelectOptionJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivSelectOptionJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divSelectOptionJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divSelectOptionJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivSelectOptionJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivSelectOptionJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divSeparatorJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divSeparatorJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivSeparatorJsonParser.EntityParserImpl mo4828invoke() {
            return new DivSeparatorJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divSeparatorJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divSeparatorJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivSeparatorJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivSeparatorJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divSeparatorJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divSeparatorJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivSeparatorJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivSeparatorJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divSeparatorDelimiterStyleJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divSeparatorDelimiterStyleJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivSeparatorDelimiterStyleJsonParser.EntityParserImpl mo4828invoke() {
            return new DivSeparatorDelimiterStyleJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divSeparatorDelimiterStyleJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divSeparatorDelimiterStyleJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivSeparatorDelimiterStyleJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivSeparatorDelimiterStyleJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divSeparatorDelimiterStyleJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divSeparatorDelimiterStyleJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivSeparatorDelimiterStyleJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivSeparatorDelimiterStyleJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divShadowJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divShadowJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivShadowJsonParser.EntityParserImpl mo4828invoke() {
            return new DivShadowJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divShadowJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divShadowJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivShadowJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivShadowJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divShadowJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divShadowJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivShadowJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivShadowJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divShapeDrawableJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divShapeDrawableJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivShapeDrawableJsonParser$EntityParserImpl mo4828invoke() {
            return new DivShapeDrawableJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divShapeDrawableJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divShapeDrawableJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivShapeDrawableJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivShapeDrawableJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divShapeDrawableJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divShapeDrawableJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivShapeDrawableJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivShapeDrawableJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divShapeJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divShapeJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivShapeJsonParser$EntityParserImpl mo4828invoke() {
            return new DivShapeJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divShapeJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divShapeJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivShapeJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivShapeJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divShapeJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divShapeJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivShapeJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivShapeJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divSizeUnitValueJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divSizeUnitValueJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivSizeUnitValueJsonParser.EntityParserImpl mo4828invoke() {
            return new DivSizeUnitValueJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divSizeUnitValueJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divSizeUnitValueJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivSizeUnitValueJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivSizeUnitValueJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divSizeUnitValueJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divSizeUnitValueJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivSizeUnitValueJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivSizeUnitValueJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divSizeJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divSizeJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivSizeJsonParser$EntityParserImpl mo4828invoke() {
            return new DivSizeJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divSizeJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divSizeJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivSizeJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivSizeJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divSizeJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divSizeJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivSizeJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivSizeJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divSlideTransitionJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divSlideTransitionJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivSlideTransitionJsonParser.EntityParserImpl mo4828invoke() {
            return new DivSlideTransitionJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divSlideTransitionJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divSlideTransitionJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivSlideTransitionJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivSlideTransitionJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divSlideTransitionJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divSlideTransitionJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivSlideTransitionJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivSlideTransitionJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divSliderJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divSliderJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivSliderJsonParser.EntityParserImpl mo4828invoke() {
            return new DivSliderJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divSliderJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divSliderJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivSliderJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivSliderJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divSliderJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divSliderJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivSliderJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivSliderJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divSliderTextStyleJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divSliderTextStyleJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivSliderTextStyleJsonParser.EntityParserImpl mo4828invoke() {
            return new DivSliderTextStyleJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divSliderTextStyleJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divSliderTextStyleJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivSliderTextStyleJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivSliderTextStyleJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divSliderTextStyleJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divSliderTextStyleJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivSliderTextStyleJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivSliderTextStyleJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divSliderRangeJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divSliderRangeJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivSliderRangeJsonParser$EntityParserImpl mo4828invoke() {
            return new DivSliderRangeJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divSliderRangeJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divSliderRangeJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivSliderRangeJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivSliderRangeJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divSliderRangeJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divSliderRangeJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivSliderRangeJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivSliderRangeJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divSolidBackgroundJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divSolidBackgroundJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivSolidBackgroundJsonParser$EntityParserImpl mo4828invoke() {
            return new DivSolidBackgroundJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divSolidBackgroundJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divSolidBackgroundJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivSolidBackgroundJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivSolidBackgroundJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divSolidBackgroundJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divSolidBackgroundJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivSolidBackgroundJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivSolidBackgroundJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divStateJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divStateJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivStateJsonParser.EntityParserImpl mo4828invoke() {
            return new DivStateJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divStateJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divStateJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivStateJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivStateJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divStateJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divStateJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivStateJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivStateJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divStateStateJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divStateStateJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivStateStateJsonParser$EntityParserImpl mo4828invoke() {
            return new DivStateStateJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divStateStateJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divStateStateJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivStateStateJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivStateStateJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divStateStateJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divStateStateJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivStateStateJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivStateStateJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divStretchIndicatorItemPlacementJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divStretchIndicatorItemPlacementJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivStretchIndicatorItemPlacementJsonParser.EntityParserImpl mo4828invoke() {
            return new DivStretchIndicatorItemPlacementJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divStretchIndicatorItemPlacementJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divStretchIndicatorItemPlacementJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivStretchIndicatorItemPlacementJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivStretchIndicatorItemPlacementJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divStretchIndicatorItemPlacementJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divStretchIndicatorItemPlacementJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivStretchIndicatorItemPlacementJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivStretchIndicatorItemPlacementJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divStrokeStyleDashedJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divStrokeStyleDashedJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivStrokeStyleDashedJsonParser$EntityParserImpl mo4828invoke() {
            return new DivStrokeStyleDashedJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divStrokeStyleDashedJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divStrokeStyleDashedJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivStrokeStyleDashedJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivStrokeStyleDashedJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divStrokeStyleDashedJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divStrokeStyleDashedJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivStrokeStyleDashedJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivStrokeStyleDashedJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divStrokeStyleSolidJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divStrokeStyleSolidJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivStrokeStyleSolidJsonParser$EntityParserImpl mo4828invoke() {
            return new DivStrokeStyleSolidJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divStrokeStyleSolidJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divStrokeStyleSolidJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivStrokeStyleSolidJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivStrokeStyleSolidJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divStrokeStyleSolidJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divStrokeStyleSolidJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivStrokeStyleSolidJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivStrokeStyleSolidJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divStrokeStyleJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divStrokeStyleJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivStrokeStyleJsonParser$EntityParserImpl mo4828invoke() {
            return new DivStrokeStyleJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divStrokeStyleJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divStrokeStyleJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivStrokeStyleJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivStrokeStyleJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divStrokeStyleJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divStrokeStyleJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivStrokeStyleJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivStrokeStyleJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divStrokeJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divStrokeJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivStrokeJsonParser.EntityParserImpl mo4828invoke() {
            return new DivStrokeJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divStrokeJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divStrokeJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivStrokeJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivStrokeJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divStrokeJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divStrokeJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivStrokeJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivStrokeJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divSwitchJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divSwitchJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivSwitchJsonParser.EntityParserImpl mo4828invoke() {
            return new DivSwitchJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divSwitchJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divSwitchJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivSwitchJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivSwitchJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divSwitchJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divSwitchJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivSwitchJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivSwitchJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTabsJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTabsJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTabsJsonParser.EntityParserImpl mo4828invoke() {
            return new DivTabsJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTabsJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTabsJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTabsJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivTabsJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTabsJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTabsJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTabsJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivTabsJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTabsTabTitleStyleJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTabsTabTitleStyleJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTabsTabTitleStyleJsonParser.EntityParserImpl mo4828invoke() {
            return new DivTabsTabTitleStyleJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTabsTabTitleStyleJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTabsTabTitleStyleJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTabsTabTitleStyleJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivTabsTabTitleStyleJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTabsTabTitleStyleJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTabsTabTitleStyleJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTabsTabTitleStyleJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivTabsTabTitleStyleJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTabsTabTitleDelimiterJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTabsTabTitleDelimiterJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTabsTabTitleDelimiterJsonParser.EntityParserImpl mo4828invoke() {
            return new DivTabsTabTitleDelimiterJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTabsTabTitleDelimiterJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTabsTabTitleDelimiterJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTabsTabTitleDelimiterJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivTabsTabTitleDelimiterJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTabsTabTitleDelimiterJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTabsTabTitleDelimiterJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTabsTabTitleDelimiterJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivTabsTabTitleDelimiterJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTabsItemJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTabsItemJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTabsItemJsonParser$EntityParserImpl mo4828invoke() {
            return new DivTabsItemJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTabsItemJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTabsItemJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTabsItemJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivTabsItemJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTabsItemJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTabsItemJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTabsItemJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivTabsItemJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTextGradientJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTextGradientJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTextGradientJsonParser$EntityParserImpl mo4828invoke() {
            return new DivTextGradientJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTextGradientJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTextGradientJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTextGradientJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivTextGradientJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTextGradientJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTextGradientJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTextGradientJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivTextGradientJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTextRangeBackgroundJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTextRangeBackgroundJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTextRangeBackgroundJsonParser$EntityParserImpl mo4828invoke() {
            return new DivTextRangeBackgroundJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTextRangeBackgroundJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTextRangeBackgroundJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTextRangeBackgroundJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivTextRangeBackgroundJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTextRangeBackgroundJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTextRangeBackgroundJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTextRangeBackgroundJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivTextRangeBackgroundJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTextRangeBorderJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTextRangeBorderJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTextRangeBorderJsonParser.EntityParserImpl mo4828invoke() {
            return new DivTextRangeBorderJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTextRangeBorderJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTextRangeBorderJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTextRangeBorderJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivTextRangeBorderJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTextRangeBorderJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTextRangeBorderJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTextRangeBorderJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivTextRangeBorderJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTextRangeMaskBaseJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTextRangeMaskBaseJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTextRangeMaskBaseJsonParser.EntityParserImpl mo4828invoke() {
            return new DivTextRangeMaskBaseJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTextRangeMaskBaseJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTextRangeMaskBaseJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTextRangeMaskBaseJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivTextRangeMaskBaseJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTextRangeMaskBaseJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTextRangeMaskBaseJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTextRangeMaskBaseJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivTextRangeMaskBaseJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTextRangeMaskParticlesJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTextRangeMaskParticlesJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTextRangeMaskParticlesJsonParser.EntityParserImpl mo4828invoke() {
            return new DivTextRangeMaskParticlesJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTextRangeMaskParticlesJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTextRangeMaskParticlesJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTextRangeMaskParticlesJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivTextRangeMaskParticlesJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTextRangeMaskParticlesJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTextRangeMaskParticlesJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTextRangeMaskParticlesJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivTextRangeMaskParticlesJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTextRangeMaskSolidJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTextRangeMaskSolidJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTextRangeMaskSolidJsonParser.EntityParserImpl mo4828invoke() {
            return new DivTextRangeMaskSolidJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTextRangeMaskSolidJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTextRangeMaskSolidJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTextRangeMaskSolidJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivTextRangeMaskSolidJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTextRangeMaskSolidJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTextRangeMaskSolidJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTextRangeMaskSolidJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivTextRangeMaskSolidJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTextRangeMaskJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTextRangeMaskJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTextRangeMaskJsonParser$EntityParserImpl mo4828invoke() {
            return new DivTextRangeMaskJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTextRangeMaskJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTextRangeMaskJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTextRangeMaskJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivTextRangeMaskJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTextRangeMaskJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTextRangeMaskJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTextRangeMaskJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivTextRangeMaskJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTextJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTextJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTextJsonParser.EntityParserImpl mo4828invoke() {
            return new DivTextJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTextJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTextJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTextJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivTextJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTextJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTextJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTextJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivTextJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTextRangeJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTextRangeJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTextRangeJsonParser.EntityParserImpl mo4828invoke() {
            return new DivTextRangeJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTextRangeJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTextRangeJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTextRangeJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivTextRangeJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTextRangeJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTextRangeJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTextRangeJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivTextRangeJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTextImageJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTextImageJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTextImageJsonParser.EntityParserImpl mo4828invoke() {
            return new DivTextImageJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTextImageJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTextImageJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTextImageJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivTextImageJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTextImageJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTextImageJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTextImageJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivTextImageJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTextImageAccessibilityJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTextImageAccessibilityJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTextImageAccessibilityJsonParser.EntityParserImpl mo4828invoke() {
            return new DivTextImageAccessibilityJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTextImageAccessibilityJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTextImageAccessibilityJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTextImageAccessibilityJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivTextImageAccessibilityJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTextImageAccessibilityJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTextImageAccessibilityJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTextImageAccessibilityJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivTextImageAccessibilityJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTextEllipsisJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTextEllipsisJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTextEllipsisJsonParser$EntityParserImpl mo4828invoke() {
            return new DivTextEllipsisJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTextEllipsisJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTextEllipsisJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTextEllipsisJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivTextEllipsisJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTextEllipsisJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTextEllipsisJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTextEllipsisJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivTextEllipsisJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTimerJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTimerJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTimerJsonParser.EntityParserImpl mo4828invoke() {
            return new DivTimerJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTimerJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTimerJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTimerJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivTimerJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTimerJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTimerJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTimerJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivTimerJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTooltipModeModalJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTooltipModeModalJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTooltipModeModalJsonParser$EntityParserImpl mo4828invoke() {
            return new DivTooltipModeModalJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTooltipModeModalJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTooltipModeModalJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTooltipModeModalJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivTooltipModeModalJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTooltipModeModalJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTooltipModeModalJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTooltipModeModalJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivTooltipModeModalJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTooltipModeNonModalJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTooltipModeNonModalJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTooltipModeNonModalJsonParser$EntityParserImpl mo4828invoke() {
            return new DivTooltipModeNonModalJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTooltipModeNonModalJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTooltipModeNonModalJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTooltipModeNonModalJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivTooltipModeNonModalJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTooltipModeNonModalJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTooltipModeNonModalJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTooltipModeNonModalJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivTooltipModeNonModalJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTooltipModeJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTooltipModeJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTooltipModeJsonParser$EntityParserImpl mo4828invoke() {
            return new DivTooltipModeJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTooltipModeJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTooltipModeJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTooltipModeJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivTooltipModeJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTooltipModeJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTooltipModeJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTooltipModeJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivTooltipModeJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTooltipJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTooltipJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTooltipJsonParser.EntityParserImpl mo4828invoke() {
            return new DivTooltipJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTooltipJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTooltipJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTooltipJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivTooltipJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTooltipJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTooltipJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTooltipJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivTooltipJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTransformJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTransformJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTransformJsonParser.EntityParserImpl mo4828invoke() {
            return new DivTransformJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTransformJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTransformJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTransformJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivTransformJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTransformJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTransformJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTransformJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivTransformJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTriggerJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTriggerJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTriggerJsonParser.EntityParserImpl mo4828invoke() {
            return new DivTriggerJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTriggerJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTriggerJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTriggerJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivTriggerJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTriggerJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTriggerJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTriggerJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivTriggerJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTypedValueJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTypedValueJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTypedValueJsonParser$EntityParserImpl mo4828invoke() {
            return new DivTypedValueJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTypedValueJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTypedValueJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTypedValueJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivTypedValueJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divTypedValueJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divTypedValueJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivTypedValueJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivTypedValueJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divVariableJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divVariableJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivVariableJsonParser$EntityParserImpl mo4828invoke() {
            return new DivVariableJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divVariableJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divVariableJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivVariableJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivVariableJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divVariableJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divVariableJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivVariableJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivVariableJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divVideoSourceJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divVideoSourceJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivVideoSourceJsonParser$EntityParserImpl mo4828invoke() {
            return new DivVideoSourceJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divVideoSourceJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divVideoSourceJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivVideoSourceJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivVideoSourceJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divVideoSourceJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divVideoSourceJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivVideoSourceJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivVideoSourceJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divVideoSourceResolutionJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divVideoSourceResolutionJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivVideoSourceResolutionJsonParser.EntityParserImpl mo4828invoke() {
            return new DivVideoSourceResolutionJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divVideoSourceResolutionJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divVideoSourceResolutionJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivVideoSourceResolutionJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivVideoSourceResolutionJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divVideoSourceResolutionJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divVideoSourceResolutionJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivVideoSourceResolutionJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivVideoSourceResolutionJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divVideoJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divVideoJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivVideoJsonParser.EntityParserImpl mo4828invoke() {
            return new DivVideoJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divVideoJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divVideoJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivVideoJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivVideoJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divVideoJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divVideoJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivVideoJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivVideoJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divVisibilityActionJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divVisibilityActionJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivVisibilityActionJsonParser.EntityParserImpl mo4828invoke() {
            return new DivVisibilityActionJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divVisibilityActionJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divVisibilityActionJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivVisibilityActionJsonParser.TemplateParserImpl mo4828invoke() {
            return new DivVisibilityActionJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divVisibilityActionJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divVisibilityActionJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivVisibilityActionJsonParser.TemplateResolverImpl mo4828invoke() {
            return new DivVisibilityActionJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divWrapContentSizeJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divWrapContentSizeJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivWrapContentSizeJsonParser$EntityParserImpl mo4828invoke() {
            return new DivWrapContentSizeJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divWrapContentSizeJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divWrapContentSizeJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivWrapContentSizeJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivWrapContentSizeJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divWrapContentSizeJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divWrapContentSizeJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivWrapContentSizeJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivWrapContentSizeJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivJsonParser$EntityParserImpl mo4828invoke() {
            return new DivJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivJsonParser$TemplateParserImpl mo4828invoke() {
            return new DivJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy divJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$divJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final DivJsonParser$TemplateResolverImpl mo4828invoke() {
            return new DivJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy endDestinationJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$endDestinationJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final EndDestinationJsonParser$EntityParserImpl mo4828invoke() {
            return new EndDestinationJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy endDestinationJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$endDestinationJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final EndDestinationJsonParser$TemplateParserImpl mo4828invoke() {
            return new EndDestinationJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy endDestinationJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$endDestinationJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final EndDestinationJsonParser$TemplateResolverImpl mo4828invoke() {
            return new EndDestinationJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy indexDestinationJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$indexDestinationJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final IndexDestinationJsonParser.EntityParserImpl mo4828invoke() {
            return new IndexDestinationJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy indexDestinationJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$indexDestinationJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final IndexDestinationJsonParser.TemplateParserImpl mo4828invoke() {
            return new IndexDestinationJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy indexDestinationJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$indexDestinationJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final IndexDestinationJsonParser.TemplateResolverImpl mo4828invoke() {
            return new IndexDestinationJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy integerValueJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$integerValueJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final IntegerValueJsonParser$EntityParserImpl mo4828invoke() {
            return new IntegerValueJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy integerValueJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$integerValueJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final IntegerValueJsonParser$TemplateParserImpl mo4828invoke() {
            return new IntegerValueJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy integerValueJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$integerValueJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final IntegerValueJsonParser$TemplateResolverImpl mo4828invoke() {
            return new IntegerValueJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy integerVariableJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$integerVariableJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final IntegerVariableJsonParser$EntityParserImpl mo4828invoke() {
            return new IntegerVariableJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy integerVariableJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$integerVariableJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final IntegerVariableJsonParser$TemplateParserImpl mo4828invoke() {
            return new IntegerVariableJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy integerVariableJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$integerVariableJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final IntegerVariableJsonParser$TemplateResolverImpl mo4828invoke() {
            return new IntegerVariableJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy numberValueJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$numberValueJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final NumberValueJsonParser$EntityParserImpl mo4828invoke() {
            return new NumberValueJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy numberValueJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$numberValueJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final NumberValueJsonParser$TemplateParserImpl mo4828invoke() {
            return new NumberValueJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy numberValueJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$numberValueJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final NumberValueJsonParser$TemplateResolverImpl mo4828invoke() {
            return new NumberValueJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy numberVariableJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$numberVariableJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final NumberVariableJsonParser$EntityParserImpl mo4828invoke() {
            return new NumberVariableJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy numberVariableJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$numberVariableJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final NumberVariableJsonParser$TemplateParserImpl mo4828invoke() {
            return new NumberVariableJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy numberVariableJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$numberVariableJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final NumberVariableJsonParser$TemplateResolverImpl mo4828invoke() {
            return new NumberVariableJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy offsetDestinationJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$offsetDestinationJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final OffsetDestinationJsonParser.EntityParserImpl mo4828invoke() {
            return new OffsetDestinationJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy offsetDestinationJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$offsetDestinationJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final OffsetDestinationJsonParser.TemplateParserImpl mo4828invoke() {
            return new OffsetDestinationJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy offsetDestinationJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$offsetDestinationJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final OffsetDestinationJsonParser.TemplateResolverImpl mo4828invoke() {
            return new OffsetDestinationJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy propertyVariableJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$propertyVariableJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final PropertyVariableJsonParser.EntityParserImpl mo4828invoke() {
            return new PropertyVariableJsonParser.EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy propertyVariableJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$propertyVariableJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final PropertyVariableJsonParser.TemplateParserImpl mo4828invoke() {
            return new PropertyVariableJsonParser.TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy propertyVariableJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$propertyVariableJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final PropertyVariableJsonParser.TemplateResolverImpl mo4828invoke() {
            return new PropertyVariableJsonParser.TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy startDestinationJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$startDestinationJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final StartDestinationJsonParser$EntityParserImpl mo4828invoke() {
            return new StartDestinationJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy startDestinationJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$startDestinationJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final StartDestinationJsonParser$TemplateParserImpl mo4828invoke() {
            return new StartDestinationJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy startDestinationJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$startDestinationJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final StartDestinationJsonParser$TemplateResolverImpl mo4828invoke() {
            return new StartDestinationJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy strValueJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$strValueJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final StrValueJsonParser$EntityParserImpl mo4828invoke() {
            return new StrValueJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy strValueJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$strValueJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final StrValueJsonParser$TemplateParserImpl mo4828invoke() {
            return new StrValueJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy strValueJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$strValueJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final StrValueJsonParser$TemplateResolverImpl mo4828invoke() {
            return new StrValueJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy strVariableJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$strVariableJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final StrVariableJsonParser$EntityParserImpl mo4828invoke() {
            return new StrVariableJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy strVariableJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$strVariableJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final StrVariableJsonParser$TemplateParserImpl mo4828invoke() {
            return new StrVariableJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy strVariableJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$strVariableJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final StrVariableJsonParser$TemplateResolverImpl mo4828invoke() {
            return new StrVariableJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy urlValueJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$urlValueJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final UrlValueJsonParser$EntityParserImpl mo4828invoke() {
            return new UrlValueJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy urlValueJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$urlValueJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final UrlValueJsonParser$TemplateParserImpl mo4828invoke() {
            return new UrlValueJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy urlValueJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$urlValueJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final UrlValueJsonParser$TemplateResolverImpl mo4828invoke() {
            return new UrlValueJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });
    private final Lazy urlVariableJsonEntityParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$urlVariableJsonEntityParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final UrlVariableJsonParser$EntityParserImpl mo4828invoke() {
            return new UrlVariableJsonParser$EntityParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy urlVariableJsonTemplateParser = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$urlVariableJsonTemplateParser$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final UrlVariableJsonParser$TemplateParserImpl mo4828invoke() {
            return new UrlVariableJsonParser$TemplateParserImpl(JsonParserComponent.this);
        }
    });
    private final Lazy urlVariableJsonTemplateResolver = LazyKt.lazy(new Function0() { // from class: com.yandex.div2.JsonParserComponent$urlVariableJsonTemplateResolver$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final UrlVariableJsonParser$TemplateResolverImpl mo4828invoke() {
            return new UrlVariableJsonParser$TemplateResolverImpl(JsonParserComponent.this);
        }
    });

    public final Lazy getArrayValueJsonEntityParser() {
        return this.arrayValueJsonEntityParser;
    }

    public final Lazy getArrayValueJsonTemplateParser() {
        return this.arrayValueJsonTemplateParser;
    }

    public final Lazy getArrayValueJsonTemplateResolver() {
        return this.arrayValueJsonTemplateResolver;
    }

    public final Lazy getArrayVariableJsonEntityParser() {
        return this.arrayVariableJsonEntityParser;
    }

    public final Lazy getArrayVariableJsonTemplateParser() {
        return this.arrayVariableJsonTemplateParser;
    }

    public final Lazy getArrayVariableJsonTemplateResolver() {
        return this.arrayVariableJsonTemplateResolver;
    }

    public final Lazy getBoolValueJsonEntityParser() {
        return this.boolValueJsonEntityParser;
    }

    public final Lazy getBoolValueJsonTemplateParser() {
        return this.boolValueJsonTemplateParser;
    }

    public final Lazy getBoolValueJsonTemplateResolver() {
        return this.boolValueJsonTemplateResolver;
    }

    public final Lazy getBoolVariableJsonEntityParser() {
        return this.boolVariableJsonEntityParser;
    }

    public final Lazy getBoolVariableJsonTemplateParser() {
        return this.boolVariableJsonTemplateParser;
    }

    public final Lazy getBoolVariableJsonTemplateResolver() {
        return this.boolVariableJsonTemplateResolver;
    }

    public final Lazy getColorValueJsonEntityParser() {
        return this.colorValueJsonEntityParser;
    }

    public final Lazy getColorValueJsonTemplateParser() {
        return this.colorValueJsonTemplateParser;
    }

    public final Lazy getColorValueJsonTemplateResolver() {
        return this.colorValueJsonTemplateResolver;
    }

    public final Lazy getColorVariableJsonEntityParser() {
        return this.colorVariableJsonEntityParser;
    }

    public final Lazy getColorVariableJsonTemplateParser() {
        return this.colorVariableJsonTemplateParser;
    }

    public final Lazy getColorVariableJsonTemplateResolver() {
        return this.colorVariableJsonTemplateResolver;
    }

    public final Lazy getContentTextJsonEntityParser() {
        return this.contentTextJsonEntityParser;
    }

    public final Lazy getContentTextJsonTemplateParser() {
        return this.contentTextJsonTemplateParser;
    }

    public final Lazy getContentTextJsonTemplateResolver() {
        return this.contentTextJsonTemplateResolver;
    }

    public final Lazy getContentUrlJsonEntityParser() {
        return this.contentUrlJsonEntityParser;
    }

    public final Lazy getContentUrlJsonTemplateParser() {
        return this.contentUrlJsonTemplateParser;
    }

    public final Lazy getContentUrlJsonTemplateResolver() {
        return this.contentUrlJsonTemplateResolver;
    }

    public final Lazy getDictValueJsonEntityParser() {
        return this.dictValueJsonEntityParser;
    }

    public final Lazy getDictValueJsonTemplateParser() {
        return this.dictValueJsonTemplateParser;
    }

    public final Lazy getDictValueJsonTemplateResolver() {
        return this.dictValueJsonTemplateResolver;
    }

    public final Lazy getDictVariableJsonEntityParser() {
        return this.dictVariableJsonEntityParser;
    }

    public final Lazy getDictVariableJsonTemplateParser() {
        return this.dictVariableJsonTemplateParser;
    }

    public final Lazy getDictVariableJsonTemplateResolver() {
        return this.dictVariableJsonTemplateResolver;
    }

    public final Lazy getDivAbsoluteEdgeInsetsJsonEntityParser() {
        return this.divAbsoluteEdgeInsetsJsonEntityParser;
    }

    public final Lazy getDivAbsoluteEdgeInsetsJsonTemplateParser() {
        return this.divAbsoluteEdgeInsetsJsonTemplateParser;
    }

    public final Lazy getDivAbsoluteEdgeInsetsJsonTemplateResolver() {
        return this.divAbsoluteEdgeInsetsJsonTemplateResolver;
    }

    public final Lazy getDivAccessibilityJsonEntityParser() {
        return this.divAccessibilityJsonEntityParser;
    }

    public final Lazy getDivAccessibilityJsonTemplateParser() {
        return this.divAccessibilityJsonTemplateParser;
    }

    public final Lazy getDivAccessibilityJsonTemplateResolver() {
        return this.divAccessibilityJsonTemplateResolver;
    }

    public final Lazy getDivActionAnimatorStartJsonEntityParser() {
        return this.divActionAnimatorStartJsonEntityParser;
    }

    public final Lazy getDivActionAnimatorStartJsonTemplateParser() {
        return this.divActionAnimatorStartJsonTemplateParser;
    }

    public final Lazy getDivActionAnimatorStartJsonTemplateResolver() {
        return this.divActionAnimatorStartJsonTemplateResolver;
    }

    public final Lazy getDivActionAnimatorStopJsonEntityParser() {
        return this.divActionAnimatorStopJsonEntityParser;
    }

    public final Lazy getDivActionAnimatorStopJsonTemplateParser() {
        return this.divActionAnimatorStopJsonTemplateParser;
    }

    public final Lazy getDivActionAnimatorStopJsonTemplateResolver() {
        return this.divActionAnimatorStopJsonTemplateResolver;
    }

    public final Lazy getDivActionArrayInsertValueJsonEntityParser() {
        return this.divActionArrayInsertValueJsonEntityParser;
    }

    public final Lazy getDivActionArrayInsertValueJsonTemplateParser() {
        return this.divActionArrayInsertValueJsonTemplateParser;
    }

    public final Lazy getDivActionArrayInsertValueJsonTemplateResolver() {
        return this.divActionArrayInsertValueJsonTemplateResolver;
    }

    public final Lazy getDivActionArrayRemoveValueJsonEntityParser() {
        return this.divActionArrayRemoveValueJsonEntityParser;
    }

    public final Lazy getDivActionArrayRemoveValueJsonTemplateParser() {
        return this.divActionArrayRemoveValueJsonTemplateParser;
    }

    public final Lazy getDivActionArrayRemoveValueJsonTemplateResolver() {
        return this.divActionArrayRemoveValueJsonTemplateResolver;
    }

    public final Lazy getDivActionArraySetValueJsonEntityParser() {
        return this.divActionArraySetValueJsonEntityParser;
    }

    public final Lazy getDivActionArraySetValueJsonTemplateParser() {
        return this.divActionArraySetValueJsonTemplateParser;
    }

    public final Lazy getDivActionArraySetValueJsonTemplateResolver() {
        return this.divActionArraySetValueJsonTemplateResolver;
    }

    public final Lazy getDivActionClearFocusJsonEntityParser() {
        return this.divActionClearFocusJsonEntityParser;
    }

    public final Lazy getDivActionClearFocusJsonTemplateParser() {
        return this.divActionClearFocusJsonTemplateParser;
    }

    public final Lazy getDivActionClearFocusJsonTemplateResolver() {
        return this.divActionClearFocusJsonTemplateResolver;
    }

    public final Lazy getDivActionCopyToClipboardContentJsonEntityParser() {
        return this.divActionCopyToClipboardContentJsonEntityParser;
    }

    public final Lazy getDivActionCopyToClipboardContentJsonTemplateParser() {
        return this.divActionCopyToClipboardContentJsonTemplateParser;
    }

    public final Lazy getDivActionCopyToClipboardContentJsonTemplateResolver() {
        return this.divActionCopyToClipboardContentJsonTemplateResolver;
    }

    public final Lazy getDivActionCopyToClipboardJsonEntityParser() {
        return this.divActionCopyToClipboardJsonEntityParser;
    }

    public final Lazy getDivActionCopyToClipboardJsonTemplateParser() {
        return this.divActionCopyToClipboardJsonTemplateParser;
    }

    public final Lazy getDivActionCopyToClipboardJsonTemplateResolver() {
        return this.divActionCopyToClipboardJsonTemplateResolver;
    }

    public final Lazy getDivActionDictSetValueJsonEntityParser() {
        return this.divActionDictSetValueJsonEntityParser;
    }

    public final Lazy getDivActionDictSetValueJsonTemplateParser() {
        return this.divActionDictSetValueJsonTemplateParser;
    }

    public final Lazy getDivActionDictSetValueJsonTemplateResolver() {
        return this.divActionDictSetValueJsonTemplateResolver;
    }

    public final Lazy getDivActionDownloadJsonEntityParser() {
        return this.divActionDownloadJsonEntityParser;
    }

    public final Lazy getDivActionDownloadJsonTemplateParser() {
        return this.divActionDownloadJsonTemplateParser;
    }

    public final Lazy getDivActionDownloadJsonTemplateResolver() {
        return this.divActionDownloadJsonTemplateResolver;
    }

    public final Lazy getDivActionFocusElementJsonEntityParser() {
        return this.divActionFocusElementJsonEntityParser;
    }

    public final Lazy getDivActionFocusElementJsonTemplateParser() {
        return this.divActionFocusElementJsonTemplateParser;
    }

    public final Lazy getDivActionFocusElementJsonTemplateResolver() {
        return this.divActionFocusElementJsonTemplateResolver;
    }

    public final Lazy getDivActionHideTooltipJsonEntityParser() {
        return this.divActionHideTooltipJsonEntityParser;
    }

    public final Lazy getDivActionHideTooltipJsonTemplateParser() {
        return this.divActionHideTooltipJsonTemplateParser;
    }

    public final Lazy getDivActionHideTooltipJsonTemplateResolver() {
        return this.divActionHideTooltipJsonTemplateResolver;
    }

    public final Lazy getDivActionScrollByJsonEntityParser() {
        return this.divActionScrollByJsonEntityParser;
    }

    public final Lazy getDivActionScrollByJsonTemplateParser() {
        return this.divActionScrollByJsonTemplateParser;
    }

    public final Lazy getDivActionScrollByJsonTemplateResolver() {
        return this.divActionScrollByJsonTemplateResolver;
    }

    public final Lazy getDivActionScrollDestinationJsonEntityParser() {
        return this.divActionScrollDestinationJsonEntityParser;
    }

    public final Lazy getDivActionScrollDestinationJsonTemplateParser() {
        return this.divActionScrollDestinationJsonTemplateParser;
    }

    public final Lazy getDivActionScrollDestinationJsonTemplateResolver() {
        return this.divActionScrollDestinationJsonTemplateResolver;
    }

    public final Lazy getDivActionScrollToJsonEntityParser() {
        return this.divActionScrollToJsonEntityParser;
    }

    public final Lazy getDivActionScrollToJsonTemplateParser() {
        return this.divActionScrollToJsonTemplateParser;
    }

    public final Lazy getDivActionScrollToJsonTemplateResolver() {
        return this.divActionScrollToJsonTemplateResolver;
    }

    public final Lazy getDivActionSetStateJsonEntityParser() {
        return this.divActionSetStateJsonEntityParser;
    }

    public final Lazy getDivActionSetStateJsonTemplateParser() {
        return this.divActionSetStateJsonTemplateParser;
    }

    public final Lazy getDivActionSetStateJsonTemplateResolver() {
        return this.divActionSetStateJsonTemplateResolver;
    }

    public final Lazy getDivActionSetStoredValueJsonEntityParser() {
        return this.divActionSetStoredValueJsonEntityParser;
    }

    public final Lazy getDivActionSetStoredValueJsonTemplateParser() {
        return this.divActionSetStoredValueJsonTemplateParser;
    }

    public final Lazy getDivActionSetStoredValueJsonTemplateResolver() {
        return this.divActionSetStoredValueJsonTemplateResolver;
    }

    public final Lazy getDivActionSetVariableJsonEntityParser() {
        return this.divActionSetVariableJsonEntityParser;
    }

    public final Lazy getDivActionSetVariableJsonTemplateParser() {
        return this.divActionSetVariableJsonTemplateParser;
    }

    public final Lazy getDivActionSetVariableJsonTemplateResolver() {
        return this.divActionSetVariableJsonTemplateResolver;
    }

    public final Lazy getDivActionShowTooltipJsonEntityParser() {
        return this.divActionShowTooltipJsonEntityParser;
    }

    public final Lazy getDivActionShowTooltipJsonTemplateParser() {
        return this.divActionShowTooltipJsonTemplateParser;
    }

    public final Lazy getDivActionShowTooltipJsonTemplateResolver() {
        return this.divActionShowTooltipJsonTemplateResolver;
    }

    public final Lazy getDivActionSubmitJsonEntityParser() {
        return this.divActionSubmitJsonEntityParser;
    }

    public final Lazy getDivActionSubmitJsonTemplateParser() {
        return this.divActionSubmitJsonTemplateParser;
    }

    public final Lazy getDivActionSubmitJsonTemplateResolver() {
        return this.divActionSubmitJsonTemplateResolver;
    }

    public final Lazy getDivActionSubmitRequestJsonEntityParser() {
        return this.divActionSubmitRequestJsonEntityParser;
    }

    public final Lazy getDivActionSubmitRequestJsonTemplateParser() {
        return this.divActionSubmitRequestJsonTemplateParser;
    }

    public final Lazy getDivActionSubmitRequestJsonTemplateResolver() {
        return this.divActionSubmitRequestJsonTemplateResolver;
    }

    public final Lazy getDivActionSubmitRequestHeaderJsonEntityParser() {
        return this.divActionSubmitRequestHeaderJsonEntityParser;
    }

    public final Lazy getDivActionSubmitRequestHeaderJsonTemplateParser() {
        return this.divActionSubmitRequestHeaderJsonTemplateParser;
    }

    public final Lazy getDivActionSubmitRequestHeaderJsonTemplateResolver() {
        return this.divActionSubmitRequestHeaderJsonTemplateResolver;
    }

    public final Lazy getDivActionTimerJsonEntityParser() {
        return this.divActionTimerJsonEntityParser;
    }

    public final Lazy getDivActionTimerJsonTemplateParser() {
        return this.divActionTimerJsonTemplateParser;
    }

    public final Lazy getDivActionTimerJsonTemplateResolver() {
        return this.divActionTimerJsonTemplateResolver;
    }

    public final Lazy getDivActionTypedJsonEntityParser() {
        return this.divActionTypedJsonEntityParser;
    }

    public final Lazy getDivActionTypedJsonTemplateParser() {
        return this.divActionTypedJsonTemplateParser;
    }

    public final Lazy getDivActionTypedJsonTemplateResolver() {
        return this.divActionTypedJsonTemplateResolver;
    }

    public final Lazy getDivActionUpdateStructureJsonEntityParser() {
        return this.divActionUpdateStructureJsonEntityParser;
    }

    public final Lazy getDivActionUpdateStructureJsonTemplateParser() {
        return this.divActionUpdateStructureJsonTemplateParser;
    }

    public final Lazy getDivActionUpdateStructureJsonTemplateResolver() {
        return this.divActionUpdateStructureJsonTemplateResolver;
    }

    public final Lazy getDivActionVideoJsonEntityParser() {
        return this.divActionVideoJsonEntityParser;
    }

    public final Lazy getDivActionVideoJsonTemplateParser() {
        return this.divActionVideoJsonTemplateParser;
    }

    public final Lazy getDivActionVideoJsonTemplateResolver() {
        return this.divActionVideoJsonTemplateResolver;
    }

    public final Lazy getDivActionJsonEntityParser() {
        return this.divActionJsonEntityParser;
    }

    public final Lazy getDivActionJsonTemplateParser() {
        return this.divActionJsonTemplateParser;
    }

    public final Lazy getDivActionJsonTemplateResolver() {
        return this.divActionJsonTemplateResolver;
    }

    public final Lazy getDivActionMenuItemJsonEntityParser() {
        return this.divActionMenuItemJsonEntityParser;
    }

    public final Lazy getDivActionMenuItemJsonTemplateParser() {
        return this.divActionMenuItemJsonTemplateParser;
    }

    public final Lazy getDivActionMenuItemJsonTemplateResolver() {
        return this.divActionMenuItemJsonTemplateResolver;
    }

    public final Lazy getDivAnimationJsonEntityParser() {
        return this.divAnimationJsonEntityParser;
    }

    public final Lazy getDivAnimationJsonTemplateParser() {
        return this.divAnimationJsonTemplateParser;
    }

    public final Lazy getDivAnimationJsonTemplateResolver() {
        return this.divAnimationJsonTemplateResolver;
    }

    public final Lazy getDivAnimatorJsonEntityParser() {
        return this.divAnimatorJsonEntityParser;
    }

    public final Lazy getDivAnimatorJsonTemplateParser() {
        return this.divAnimatorJsonTemplateParser;
    }

    public final Lazy getDivAnimatorJsonTemplateResolver() {
        return this.divAnimatorJsonTemplateResolver;
    }

    public final Lazy getDivAppearanceSetTransitionJsonEntityParser() {
        return this.divAppearanceSetTransitionJsonEntityParser;
    }

    public final Lazy getDivAppearanceSetTransitionJsonTemplateParser() {
        return this.divAppearanceSetTransitionJsonTemplateParser;
    }

    public final Lazy getDivAppearanceSetTransitionJsonTemplateResolver() {
        return this.divAppearanceSetTransitionJsonTemplateResolver;
    }

    public final Lazy getDivAppearanceTransitionJsonEntityParser() {
        return this.divAppearanceTransitionJsonEntityParser;
    }

    public final Lazy getDivAppearanceTransitionJsonTemplateParser() {
        return this.divAppearanceTransitionJsonTemplateParser;
    }

    public final Lazy getDivAppearanceTransitionJsonTemplateResolver() {
        return this.divAppearanceTransitionJsonTemplateResolver;
    }

    public final Lazy getDivAspectJsonEntityParser() {
        return this.divAspectJsonEntityParser;
    }

    public final Lazy getDivAspectJsonTemplateParser() {
        return this.divAspectJsonTemplateParser;
    }

    public final Lazy getDivAspectJsonTemplateResolver() {
        return this.divAspectJsonTemplateResolver;
    }

    public final Lazy getDivBackgroundJsonEntityParser() {
        return this.divBackgroundJsonEntityParser;
    }

    public final Lazy getDivBackgroundJsonTemplateParser() {
        return this.divBackgroundJsonTemplateParser;
    }

    public final Lazy getDivBackgroundJsonTemplateResolver() {
        return this.divBackgroundJsonTemplateResolver;
    }

    public final Lazy getDivBlurJsonEntityParser() {
        return this.divBlurJsonEntityParser;
    }

    public final Lazy getDivBlurJsonTemplateParser() {
        return this.divBlurJsonTemplateParser;
    }

    public final Lazy getDivBlurJsonTemplateResolver() {
        return this.divBlurJsonTemplateResolver;
    }

    public final Lazy getDivBorderJsonEntityParser() {
        return this.divBorderJsonEntityParser;
    }

    public final Lazy getDivBorderJsonTemplateParser() {
        return this.divBorderJsonTemplateParser;
    }

    public final Lazy getDivBorderJsonTemplateResolver() {
        return this.divBorderJsonTemplateResolver;
    }

    public final Lazy getDivChangeBoundsTransitionJsonEntityParser() {
        return this.divChangeBoundsTransitionJsonEntityParser;
    }

    public final Lazy getDivChangeBoundsTransitionJsonTemplateParser() {
        return this.divChangeBoundsTransitionJsonTemplateParser;
    }

    public final Lazy getDivChangeBoundsTransitionJsonTemplateResolver() {
        return this.divChangeBoundsTransitionJsonTemplateResolver;
    }

    public final Lazy getDivChangeSetTransitionJsonEntityParser() {
        return this.divChangeSetTransitionJsonEntityParser;
    }

    public final Lazy getDivChangeSetTransitionJsonTemplateParser() {
        return this.divChangeSetTransitionJsonTemplateParser;
    }

    public final Lazy getDivChangeSetTransitionJsonTemplateResolver() {
        return this.divChangeSetTransitionJsonTemplateResolver;
    }

    public final Lazy getDivChangeTransitionJsonEntityParser() {
        return this.divChangeTransitionJsonEntityParser;
    }

    public final Lazy getDivChangeTransitionJsonTemplateParser() {
        return this.divChangeTransitionJsonTemplateParser;
    }

    public final Lazy getDivChangeTransitionJsonTemplateResolver() {
        return this.divChangeTransitionJsonTemplateResolver;
    }

    public final Lazy getDivCircleShapeJsonEntityParser() {
        return this.divCircleShapeJsonEntityParser;
    }

    public final Lazy getDivCircleShapeJsonTemplateParser() {
        return this.divCircleShapeJsonTemplateParser;
    }

    public final Lazy getDivCircleShapeJsonTemplateResolver() {
        return this.divCircleShapeJsonTemplateResolver;
    }

    public final Lazy getDivCloudBackgroundJsonEntityParser() {
        return this.divCloudBackgroundJsonEntityParser;
    }

    public final Lazy getDivCloudBackgroundJsonTemplateParser() {
        return this.divCloudBackgroundJsonTemplateParser;
    }

    public final Lazy getDivCloudBackgroundJsonTemplateResolver() {
        return this.divCloudBackgroundJsonTemplateResolver;
    }

    public final Lazy getDivCollectionItemBuilderJsonEntityParser() {
        return this.divCollectionItemBuilderJsonEntityParser;
    }

    public final Lazy getDivCollectionItemBuilderJsonTemplateParser() {
        return this.divCollectionItemBuilderJsonTemplateParser;
    }

    public final Lazy getDivCollectionItemBuilderJsonTemplateResolver() {
        return this.divCollectionItemBuilderJsonTemplateResolver;
    }

    public final Lazy getDivCollectionItemBuilderPrototypeJsonEntityParser() {
        return this.divCollectionItemBuilderPrototypeJsonEntityParser;
    }

    public final Lazy getDivCollectionItemBuilderPrototypeJsonTemplateParser() {
        return this.divCollectionItemBuilderPrototypeJsonTemplateParser;
    }

    public final Lazy getDivCollectionItemBuilderPrototypeJsonTemplateResolver() {
        return this.divCollectionItemBuilderPrototypeJsonTemplateResolver;
    }

    public final Lazy getDivColorAnimatorJsonEntityParser() {
        return this.divColorAnimatorJsonEntityParser;
    }

    public final Lazy getDivColorAnimatorJsonTemplateParser() {
        return this.divColorAnimatorJsonTemplateParser;
    }

    public final Lazy getDivColorAnimatorJsonTemplateResolver() {
        return this.divColorAnimatorJsonTemplateResolver;
    }

    public final Lazy getDivContainerJsonEntityParser() {
        return this.divContainerJsonEntityParser;
    }

    public final Lazy getDivContainerJsonTemplateParser() {
        return this.divContainerJsonTemplateParser;
    }

    public final Lazy getDivContainerJsonTemplateResolver() {
        return this.divContainerJsonTemplateResolver;
    }

    public final Lazy getDivContainerSeparatorJsonEntityParser() {
        return this.divContainerSeparatorJsonEntityParser;
    }

    public final Lazy getDivContainerSeparatorJsonTemplateParser() {
        return this.divContainerSeparatorJsonTemplateParser;
    }

    public final Lazy getDivContainerSeparatorJsonTemplateResolver() {
        return this.divContainerSeparatorJsonTemplateResolver;
    }

    public final Lazy getDivCornersRadiusJsonEntityParser() {
        return this.divCornersRadiusJsonEntityParser;
    }

    public final Lazy getDivCornersRadiusJsonTemplateParser() {
        return this.divCornersRadiusJsonTemplateParser;
    }

    public final Lazy getDivCornersRadiusJsonTemplateResolver() {
        return this.divCornersRadiusJsonTemplateResolver;
    }

    public final Lazy getDivCountJsonEntityParser() {
        return this.divCountJsonEntityParser;
    }

    public final Lazy getDivCountJsonTemplateParser() {
        return this.divCountJsonTemplateParser;
    }

    public final Lazy getDivCountJsonTemplateResolver() {
        return this.divCountJsonTemplateResolver;
    }

    public final Lazy getDivCurrencyInputMaskJsonEntityParser() {
        return this.divCurrencyInputMaskJsonEntityParser;
    }

    public final Lazy getDivCurrencyInputMaskJsonTemplateParser() {
        return this.divCurrencyInputMaskJsonTemplateParser;
    }

    public final Lazy getDivCurrencyInputMaskJsonTemplateResolver() {
        return this.divCurrencyInputMaskJsonTemplateResolver;
    }

    public final Lazy getDivCustomJsonEntityParser() {
        return this.divCustomJsonEntityParser;
    }

    public final Lazy getDivCustomJsonTemplateParser() {
        return this.divCustomJsonTemplateParser;
    }

    public final Lazy getDivCustomJsonTemplateResolver() {
        return this.divCustomJsonTemplateResolver;
    }

    public final Lazy getDivDataJsonEntityParser() {
        return this.divDataJsonEntityParser;
    }

    public final Lazy getDivDataJsonTemplateParser() {
        return this.divDataJsonTemplateParser;
    }

    public final Lazy getDivDataJsonTemplateResolver() {
        return this.divDataJsonTemplateResolver;
    }

    public final Lazy getDivDataStateJsonEntityParser() {
        return this.divDataStateJsonEntityParser;
    }

    public final Lazy getDivDataStateJsonTemplateParser() {
        return this.divDataStateJsonTemplateParser;
    }

    public final Lazy getDivDataStateJsonTemplateResolver() {
        return this.divDataStateJsonTemplateResolver;
    }

    public final Lazy getDivDefaultIndicatorItemPlacementJsonEntityParser() {
        return this.divDefaultIndicatorItemPlacementJsonEntityParser;
    }

    public final Lazy getDivDefaultIndicatorItemPlacementJsonTemplateParser() {
        return this.divDefaultIndicatorItemPlacementJsonTemplateParser;
    }

    public final Lazy getDivDefaultIndicatorItemPlacementJsonTemplateResolver() {
        return this.divDefaultIndicatorItemPlacementJsonTemplateResolver;
    }

    public final Lazy getDivDimensionJsonEntityParser() {
        return this.divDimensionJsonEntityParser;
    }

    public final Lazy getDivDimensionJsonTemplateParser() {
        return this.divDimensionJsonTemplateParser;
    }

    public final Lazy getDivDimensionJsonTemplateResolver() {
        return this.divDimensionJsonTemplateResolver;
    }

    public final Lazy getDivDisappearActionJsonEntityParser() {
        return this.divDisappearActionJsonEntityParser;
    }

    public final Lazy getDivDisappearActionJsonTemplateParser() {
        return this.divDisappearActionJsonTemplateParser;
    }

    public final Lazy getDivDisappearActionJsonTemplateResolver() {
        return this.divDisappearActionJsonTemplateResolver;
    }

    public final Lazy getDivDownloadCallbacksJsonEntityParser() {
        return this.divDownloadCallbacksJsonEntityParser;
    }

    public final Lazy getDivDownloadCallbacksJsonTemplateParser() {
        return this.divDownloadCallbacksJsonTemplateParser;
    }

    public final Lazy getDivDownloadCallbacksJsonTemplateResolver() {
        return this.divDownloadCallbacksJsonTemplateResolver;
    }

    public final Lazy getDivDrawableJsonEntityParser() {
        return this.divDrawableJsonEntityParser;
    }

    public final Lazy getDivDrawableJsonTemplateParser() {
        return this.divDrawableJsonTemplateParser;
    }

    public final Lazy getDivDrawableJsonTemplateResolver() {
        return this.divDrawableJsonTemplateResolver;
    }

    public final Lazy getDivEdgeInsetsJsonEntityParser() {
        return this.divEdgeInsetsJsonEntityParser;
    }

    public final Lazy getDivEdgeInsetsJsonTemplateParser() {
        return this.divEdgeInsetsJsonTemplateParser;
    }

    public final Lazy getDivEdgeInsetsJsonTemplateResolver() {
        return this.divEdgeInsetsJsonTemplateResolver;
    }

    public final Lazy getDivExtensionJsonEntityParser() {
        return this.divExtensionJsonEntityParser;
    }

    public final Lazy getDivExtensionJsonTemplateParser() {
        return this.divExtensionJsonTemplateParser;
    }

    public final Lazy getDivExtensionJsonTemplateResolver() {
        return this.divExtensionJsonTemplateResolver;
    }

    public final Lazy getDivFadeTransitionJsonEntityParser() {
        return this.divFadeTransitionJsonEntityParser;
    }

    public final Lazy getDivFadeTransitionJsonTemplateParser() {
        return this.divFadeTransitionJsonTemplateParser;
    }

    public final Lazy getDivFadeTransitionJsonTemplateResolver() {
        return this.divFadeTransitionJsonTemplateResolver;
    }

    public final Lazy getDivFilterRtlMirrorJsonEntityParser() {
        return this.divFilterRtlMirrorJsonEntityParser;
    }

    public final Lazy getDivFilterRtlMirrorJsonTemplateParser() {
        return this.divFilterRtlMirrorJsonTemplateParser;
    }

    public final Lazy getDivFilterRtlMirrorJsonTemplateResolver() {
        return this.divFilterRtlMirrorJsonTemplateResolver;
    }

    public final Lazy getDivFilterJsonEntityParser() {
        return this.divFilterJsonEntityParser;
    }

    public final Lazy getDivFilterJsonTemplateParser() {
        return this.divFilterJsonTemplateParser;
    }

    public final Lazy getDivFilterJsonTemplateResolver() {
        return this.divFilterJsonTemplateResolver;
    }

    public final Lazy getDivFixedCountJsonEntityParser() {
        return this.divFixedCountJsonEntityParser;
    }

    public final Lazy getDivFixedCountJsonTemplateParser() {
        return this.divFixedCountJsonTemplateParser;
    }

    public final Lazy getDivFixedCountJsonTemplateResolver() {
        return this.divFixedCountJsonTemplateResolver;
    }

    public final Lazy getDivFixedLengthInputMaskJsonEntityParser() {
        return this.divFixedLengthInputMaskJsonEntityParser;
    }

    public final Lazy getDivFixedLengthInputMaskJsonTemplateParser() {
        return this.divFixedLengthInputMaskJsonTemplateParser;
    }

    public final Lazy getDivFixedLengthInputMaskJsonTemplateResolver() {
        return this.divFixedLengthInputMaskJsonTemplateResolver;
    }

    public final Lazy getDivFixedLengthInputMaskPatternElementJsonEntityParser() {
        return this.divFixedLengthInputMaskPatternElementJsonEntityParser;
    }

    public final Lazy getDivFixedLengthInputMaskPatternElementJsonTemplateParser() {
        return this.divFixedLengthInputMaskPatternElementJsonTemplateParser;
    }

    public final Lazy getDivFixedLengthInputMaskPatternElementJsonTemplateResolver() {
        return this.divFixedLengthInputMaskPatternElementJsonTemplateResolver;
    }

    public final Lazy getDivFixedSizeJsonEntityParser() {
        return this.divFixedSizeJsonEntityParser;
    }

    public final Lazy getDivFixedSizeJsonTemplateParser() {
        return this.divFixedSizeJsonTemplateParser;
    }

    public final Lazy getDivFixedSizeJsonTemplateResolver() {
        return this.divFixedSizeJsonTemplateResolver;
    }

    public final Lazy getDivFocusJsonEntityParser() {
        return this.divFocusJsonEntityParser;
    }

    public final Lazy getDivFocusJsonTemplateParser() {
        return this.divFocusJsonTemplateParser;
    }

    public final Lazy getDivFocusJsonTemplateResolver() {
        return this.divFocusJsonTemplateResolver;
    }

    public final Lazy getDivFocusNextFocusIdsJsonEntityParser() {
        return this.divFocusNextFocusIdsJsonEntityParser;
    }

    public final Lazy getDivFocusNextFocusIdsJsonTemplateParser() {
        return this.divFocusNextFocusIdsJsonTemplateParser;
    }

    public final Lazy getDivFocusNextFocusIdsJsonTemplateResolver() {
        return this.divFocusNextFocusIdsJsonTemplateResolver;
    }

    public final Lazy getDivFunctionArgumentJsonEntityParser() {
        return this.divFunctionArgumentJsonEntityParser;
    }

    public final Lazy getDivFunctionArgumentJsonTemplateParser() {
        return this.divFunctionArgumentJsonTemplateParser;
    }

    public final Lazy getDivFunctionArgumentJsonTemplateResolver() {
        return this.divFunctionArgumentJsonTemplateResolver;
    }

    public final Lazy getDivFunctionJsonEntityParser() {
        return this.divFunctionJsonEntityParser;
    }

    public final Lazy getDivFunctionJsonTemplateParser() {
        return this.divFunctionJsonTemplateParser;
    }

    public final Lazy getDivFunctionJsonTemplateResolver() {
        return this.divFunctionJsonTemplateResolver;
    }

    public final Lazy getDivGalleryJsonEntityParser() {
        return this.divGalleryJsonEntityParser;
    }

    public final Lazy getDivGalleryJsonTemplateParser() {
        return this.divGalleryJsonTemplateParser;
    }

    public final Lazy getDivGalleryJsonTemplateResolver() {
        return this.divGalleryJsonTemplateResolver;
    }

    public final Lazy getDivGifImageJsonEntityParser() {
        return this.divGifImageJsonEntityParser;
    }

    public final Lazy getDivGifImageJsonTemplateParser() {
        return this.divGifImageJsonTemplateParser;
    }

    public final Lazy getDivGifImageJsonTemplateResolver() {
        return this.divGifImageJsonTemplateResolver;
    }

    public final Lazy getDivGridJsonEntityParser() {
        return this.divGridJsonEntityParser;
    }

    public final Lazy getDivGridJsonTemplateParser() {
        return this.divGridJsonTemplateParser;
    }

    public final Lazy getDivGridJsonTemplateResolver() {
        return this.divGridJsonTemplateResolver;
    }

    public final Lazy getDivImageBackgroundJsonEntityParser() {
        return this.divImageBackgroundJsonEntityParser;
    }

    public final Lazy getDivImageBackgroundJsonTemplateParser() {
        return this.divImageBackgroundJsonTemplateParser;
    }

    public final Lazy getDivImageBackgroundJsonTemplateResolver() {
        return this.divImageBackgroundJsonTemplateResolver;
    }

    public final Lazy getDivImageJsonEntityParser() {
        return this.divImageJsonEntityParser;
    }

    public final Lazy getDivImageJsonTemplateParser() {
        return this.divImageJsonTemplateParser;
    }

    public final Lazy getDivImageJsonTemplateResolver() {
        return this.divImageJsonTemplateResolver;
    }

    public final Lazy getDivIndicatorItemPlacementJsonEntityParser() {
        return this.divIndicatorItemPlacementJsonEntityParser;
    }

    public final Lazy getDivIndicatorItemPlacementJsonTemplateParser() {
        return this.divIndicatorItemPlacementJsonTemplateParser;
    }

    public final Lazy getDivIndicatorItemPlacementJsonTemplateResolver() {
        return this.divIndicatorItemPlacementJsonTemplateResolver;
    }

    public final Lazy getDivIndicatorJsonEntityParser() {
        return this.divIndicatorJsonEntityParser;
    }

    public final Lazy getDivIndicatorJsonTemplateParser() {
        return this.divIndicatorJsonTemplateParser;
    }

    public final Lazy getDivIndicatorJsonTemplateResolver() {
        return this.divIndicatorJsonTemplateResolver;
    }

    public final Lazy getDivInfinityCountJsonEntityParser() {
        return this.divInfinityCountJsonEntityParser;
    }

    public final Lazy getDivInfinityCountJsonTemplateParser() {
        return this.divInfinityCountJsonTemplateParser;
    }

    public final Lazy getDivInfinityCountJsonTemplateResolver() {
        return this.divInfinityCountJsonTemplateResolver;
    }

    public final Lazy getDivInputFilterExpressionJsonEntityParser() {
        return this.divInputFilterExpressionJsonEntityParser;
    }

    public final Lazy getDivInputFilterExpressionJsonTemplateParser() {
        return this.divInputFilterExpressionJsonTemplateParser;
    }

    public final Lazy getDivInputFilterExpressionJsonTemplateResolver() {
        return this.divInputFilterExpressionJsonTemplateResolver;
    }

    public final Lazy getDivInputFilterRegexJsonEntityParser() {
        return this.divInputFilterRegexJsonEntityParser;
    }

    public final Lazy getDivInputFilterRegexJsonTemplateParser() {
        return this.divInputFilterRegexJsonTemplateParser;
    }

    public final Lazy getDivInputFilterRegexJsonTemplateResolver() {
        return this.divInputFilterRegexJsonTemplateResolver;
    }

    public final Lazy getDivInputFilterJsonEntityParser() {
        return this.divInputFilterJsonEntityParser;
    }

    public final Lazy getDivInputFilterJsonTemplateParser() {
        return this.divInputFilterJsonTemplateParser;
    }

    public final Lazy getDivInputFilterJsonTemplateResolver() {
        return this.divInputFilterJsonTemplateResolver;
    }

    public final Lazy getDivInputMaskJsonEntityParser() {
        return this.divInputMaskJsonEntityParser;
    }

    public final Lazy getDivInputMaskJsonTemplateParser() {
        return this.divInputMaskJsonTemplateParser;
    }

    public final Lazy getDivInputMaskJsonTemplateResolver() {
        return this.divInputMaskJsonTemplateResolver;
    }

    public final Lazy getDivInputValidatorBaseJsonEntityParser() {
        return this.divInputValidatorBaseJsonEntityParser;
    }

    public final Lazy getDivInputValidatorBaseJsonTemplateParser() {
        return this.divInputValidatorBaseJsonTemplateParser;
    }

    public final Lazy getDivInputValidatorBaseJsonTemplateResolver() {
        return this.divInputValidatorBaseJsonTemplateResolver;
    }

    public final Lazy getDivInputValidatorExpressionJsonEntityParser() {
        return this.divInputValidatorExpressionJsonEntityParser;
    }

    public final Lazy getDivInputValidatorExpressionJsonTemplateParser() {
        return this.divInputValidatorExpressionJsonTemplateParser;
    }

    public final Lazy getDivInputValidatorExpressionJsonTemplateResolver() {
        return this.divInputValidatorExpressionJsonTemplateResolver;
    }

    public final Lazy getDivInputValidatorRegexJsonEntityParser() {
        return this.divInputValidatorRegexJsonEntityParser;
    }

    public final Lazy getDivInputValidatorRegexJsonTemplateParser() {
        return this.divInputValidatorRegexJsonTemplateParser;
    }

    public final Lazy getDivInputValidatorRegexJsonTemplateResolver() {
        return this.divInputValidatorRegexJsonTemplateResolver;
    }

    public final Lazy getDivInputValidatorJsonEntityParser() {
        return this.divInputValidatorJsonEntityParser;
    }

    public final Lazy getDivInputValidatorJsonTemplateParser() {
        return this.divInputValidatorJsonTemplateParser;
    }

    public final Lazy getDivInputValidatorJsonTemplateResolver() {
        return this.divInputValidatorJsonTemplateResolver;
    }

    public final Lazy getDivInputJsonEntityParser() {
        return this.divInputJsonEntityParser;
    }

    public final Lazy getDivInputJsonTemplateParser() {
        return this.divInputJsonTemplateParser;
    }

    public final Lazy getDivInputJsonTemplateResolver() {
        return this.divInputJsonTemplateResolver;
    }

    public final Lazy getDivInputNativeInterfaceJsonEntityParser() {
        return this.divInputNativeInterfaceJsonEntityParser;
    }

    public final Lazy getDivInputNativeInterfaceJsonTemplateParser() {
        return this.divInputNativeInterfaceJsonTemplateParser;
    }

    public final Lazy getDivInputNativeInterfaceJsonTemplateResolver() {
        return this.divInputNativeInterfaceJsonTemplateResolver;
    }

    public final Lazy getDivLayoutProviderJsonEntityParser() {
        return this.divLayoutProviderJsonEntityParser;
    }

    public final Lazy getDivLayoutProviderJsonTemplateParser() {
        return this.divLayoutProviderJsonTemplateParser;
    }

    public final Lazy getDivLayoutProviderJsonTemplateResolver() {
        return this.divLayoutProviderJsonTemplateResolver;
    }

    public final Lazy getDivLinearGradientJsonEntityParser() {
        return this.divLinearGradientJsonEntityParser;
    }

    public final Lazy getDivLinearGradientJsonTemplateParser() {
        return this.divLinearGradientJsonTemplateParser;
    }

    public final Lazy getDivLinearGradientJsonTemplateResolver() {
        return this.divLinearGradientJsonTemplateResolver;
    }

    public final Lazy getDivLinearGradientColorPointJsonEntityParser() {
        return this.divLinearGradientColorPointJsonEntityParser;
    }

    public final Lazy getDivLinearGradientColorPointJsonTemplateParser() {
        return this.divLinearGradientColorPointJsonTemplateParser;
    }

    public final Lazy getDivLinearGradientColorPointJsonTemplateResolver() {
        return this.divLinearGradientColorPointJsonTemplateResolver;
    }

    public final Lazy getDivMatchParentSizeJsonEntityParser() {
        return this.divMatchParentSizeJsonEntityParser;
    }

    public final Lazy getDivMatchParentSizeJsonTemplateParser() {
        return this.divMatchParentSizeJsonTemplateParser;
    }

    public final Lazy getDivMatchParentSizeJsonTemplateResolver() {
        return this.divMatchParentSizeJsonTemplateResolver;
    }

    public final Lazy getDivNeighbourPageSizeJsonEntityParser() {
        return this.divNeighbourPageSizeJsonEntityParser;
    }

    public final Lazy getDivNeighbourPageSizeJsonTemplateParser() {
        return this.divNeighbourPageSizeJsonTemplateParser;
    }

    public final Lazy getDivNeighbourPageSizeJsonTemplateResolver() {
        return this.divNeighbourPageSizeJsonTemplateResolver;
    }

    public final Lazy getDivNinePatchBackgroundJsonEntityParser() {
        return this.divNinePatchBackgroundJsonEntityParser;
    }

    public final Lazy getDivNinePatchBackgroundJsonTemplateParser() {
        return this.divNinePatchBackgroundJsonTemplateParser;
    }

    public final Lazy getDivNinePatchBackgroundJsonTemplateResolver() {
        return this.divNinePatchBackgroundJsonTemplateResolver;
    }

    public final Lazy getDivNumberAnimatorJsonEntityParser() {
        return this.divNumberAnimatorJsonEntityParser;
    }

    public final Lazy getDivNumberAnimatorJsonTemplateParser() {
        return this.divNumberAnimatorJsonTemplateParser;
    }

    public final Lazy getDivNumberAnimatorJsonTemplateResolver() {
        return this.divNumberAnimatorJsonTemplateResolver;
    }

    public final Lazy getDivPageContentSizeJsonEntityParser() {
        return this.divPageContentSizeJsonEntityParser;
    }

    public final Lazy getDivPageContentSizeJsonTemplateParser() {
        return this.divPageContentSizeJsonTemplateParser;
    }

    public final Lazy getDivPageContentSizeJsonTemplateResolver() {
        return this.divPageContentSizeJsonTemplateResolver;
    }

    public final Lazy getDivPageSizeJsonEntityParser() {
        return this.divPageSizeJsonEntityParser;
    }

    public final Lazy getDivPageSizeJsonTemplateParser() {
        return this.divPageSizeJsonTemplateParser;
    }

    public final Lazy getDivPageSizeJsonTemplateResolver() {
        return this.divPageSizeJsonTemplateResolver;
    }

    public final Lazy getDivPageTransformationOverlapJsonEntityParser() {
        return this.divPageTransformationOverlapJsonEntityParser;
    }

    public final Lazy getDivPageTransformationOverlapJsonTemplateParser() {
        return this.divPageTransformationOverlapJsonTemplateParser;
    }

    public final Lazy getDivPageTransformationOverlapJsonTemplateResolver() {
        return this.divPageTransformationOverlapJsonTemplateResolver;
    }

    public final Lazy getDivPageTransformationSlideJsonEntityParser() {
        return this.divPageTransformationSlideJsonEntityParser;
    }

    public final Lazy getDivPageTransformationSlideJsonTemplateParser() {
        return this.divPageTransformationSlideJsonTemplateParser;
    }

    public final Lazy getDivPageTransformationSlideJsonTemplateResolver() {
        return this.divPageTransformationSlideJsonTemplateResolver;
    }

    public final Lazy getDivPageTransformationJsonEntityParser() {
        return this.divPageTransformationJsonEntityParser;
    }

    public final Lazy getDivPageTransformationJsonTemplateParser() {
        return this.divPageTransformationJsonTemplateParser;
    }

    public final Lazy getDivPageTransformationJsonTemplateResolver() {
        return this.divPageTransformationJsonTemplateResolver;
    }

    public final Lazy getDivPagerLayoutModeJsonEntityParser() {
        return this.divPagerLayoutModeJsonEntityParser;
    }

    public final Lazy getDivPagerLayoutModeJsonTemplateParser() {
        return this.divPagerLayoutModeJsonTemplateParser;
    }

    public final Lazy getDivPagerLayoutModeJsonTemplateResolver() {
        return this.divPagerLayoutModeJsonTemplateResolver;
    }

    public final Lazy getDivPagerJsonEntityParser() {
        return this.divPagerJsonEntityParser;
    }

    public final Lazy getDivPagerJsonTemplateParser() {
        return this.divPagerJsonTemplateParser;
    }

    public final Lazy getDivPagerJsonTemplateResolver() {
        return this.divPagerJsonTemplateResolver;
    }

    public final Lazy getDivPatchJsonEntityParser() {
        return this.divPatchJsonEntityParser;
    }

    public final Lazy getDivPatchJsonTemplateParser() {
        return this.divPatchJsonTemplateParser;
    }

    public final Lazy getDivPatchJsonTemplateResolver() {
        return this.divPatchJsonTemplateResolver;
    }

    public final Lazy getDivPatchChangeJsonEntityParser() {
        return this.divPatchChangeJsonEntityParser;
    }

    public final Lazy getDivPatchChangeJsonTemplateParser() {
        return this.divPatchChangeJsonTemplateParser;
    }

    public final Lazy getDivPatchChangeJsonTemplateResolver() {
        return this.divPatchChangeJsonTemplateResolver;
    }

    public final Lazy getDivPercentageSizeJsonEntityParser() {
        return this.divPercentageSizeJsonEntityParser;
    }

    public final Lazy getDivPercentageSizeJsonTemplateParser() {
        return this.divPercentageSizeJsonTemplateParser;
    }

    public final Lazy getDivPercentageSizeJsonTemplateResolver() {
        return this.divPercentageSizeJsonTemplateResolver;
    }

    public final Lazy getDivPhoneInputMaskJsonEntityParser() {
        return this.divPhoneInputMaskJsonEntityParser;
    }

    public final Lazy getDivPhoneInputMaskJsonTemplateParser() {
        return this.divPhoneInputMaskJsonTemplateParser;
    }

    public final Lazy getDivPhoneInputMaskJsonTemplateResolver() {
        return this.divPhoneInputMaskJsonTemplateResolver;
    }

    public final Lazy getDivPivotFixedJsonEntityParser() {
        return this.divPivotFixedJsonEntityParser;
    }

    public final Lazy getDivPivotFixedJsonTemplateParser() {
        return this.divPivotFixedJsonTemplateParser;
    }

    public final Lazy getDivPivotFixedJsonTemplateResolver() {
        return this.divPivotFixedJsonTemplateResolver;
    }

    public final Lazy getDivPivotPercentageJsonEntityParser() {
        return this.divPivotPercentageJsonEntityParser;
    }

    public final Lazy getDivPivotPercentageJsonTemplateParser() {
        return this.divPivotPercentageJsonTemplateParser;
    }

    public final Lazy getDivPivotPercentageJsonTemplateResolver() {
        return this.divPivotPercentageJsonTemplateResolver;
    }

    public final Lazy getDivPivotJsonEntityParser() {
        return this.divPivotJsonEntityParser;
    }

    public final Lazy getDivPivotJsonTemplateParser() {
        return this.divPivotJsonTemplateParser;
    }

    public final Lazy getDivPivotJsonTemplateResolver() {
        return this.divPivotJsonTemplateResolver;
    }

    public final Lazy getDivPointJsonEntityParser() {
        return this.divPointJsonEntityParser;
    }

    public final Lazy getDivPointJsonTemplateParser() {
        return this.divPointJsonTemplateParser;
    }

    public final Lazy getDivPointJsonTemplateResolver() {
        return this.divPointJsonTemplateResolver;
    }

    public final Lazy getDivRadialGradientCenterJsonEntityParser() {
        return this.divRadialGradientCenterJsonEntityParser;
    }

    public final Lazy getDivRadialGradientCenterJsonTemplateParser() {
        return this.divRadialGradientCenterJsonTemplateParser;
    }

    public final Lazy getDivRadialGradientCenterJsonTemplateResolver() {
        return this.divRadialGradientCenterJsonTemplateResolver;
    }

    public final Lazy getDivRadialGradientFixedCenterJsonEntityParser() {
        return this.divRadialGradientFixedCenterJsonEntityParser;
    }

    public final Lazy getDivRadialGradientFixedCenterJsonTemplateParser() {
        return this.divRadialGradientFixedCenterJsonTemplateParser;
    }

    public final Lazy getDivRadialGradientFixedCenterJsonTemplateResolver() {
        return this.divRadialGradientFixedCenterJsonTemplateResolver;
    }

    public final Lazy getDivRadialGradientRadiusJsonEntityParser() {
        return this.divRadialGradientRadiusJsonEntityParser;
    }

    public final Lazy getDivRadialGradientRadiusJsonTemplateParser() {
        return this.divRadialGradientRadiusJsonTemplateParser;
    }

    public final Lazy getDivRadialGradientRadiusJsonTemplateResolver() {
        return this.divRadialGradientRadiusJsonTemplateResolver;
    }

    public final Lazy getDivRadialGradientRelativeCenterJsonEntityParser() {
        return this.divRadialGradientRelativeCenterJsonEntityParser;
    }

    public final Lazy getDivRadialGradientRelativeCenterJsonTemplateParser() {
        return this.divRadialGradientRelativeCenterJsonTemplateParser;
    }

    public final Lazy getDivRadialGradientRelativeCenterJsonTemplateResolver() {
        return this.divRadialGradientRelativeCenterJsonTemplateResolver;
    }

    public final Lazy getDivRadialGradientRelativeRadiusJsonEntityParser() {
        return this.divRadialGradientRelativeRadiusJsonEntityParser;
    }

    public final Lazy getDivRadialGradientRelativeRadiusJsonTemplateParser() {
        return this.divRadialGradientRelativeRadiusJsonTemplateParser;
    }

    public final Lazy getDivRadialGradientRelativeRadiusJsonTemplateResolver() {
        return this.divRadialGradientRelativeRadiusJsonTemplateResolver;
    }

    public final Lazy getDivRadialGradientJsonEntityParser() {
        return this.divRadialGradientJsonEntityParser;
    }

    public final Lazy getDivRadialGradientJsonTemplateParser() {
        return this.divRadialGradientJsonTemplateParser;
    }

    public final Lazy getDivRadialGradientJsonTemplateResolver() {
        return this.divRadialGradientJsonTemplateResolver;
    }

    public final Lazy getDivRadialGradientColorPointJsonEntityParser() {
        return this.divRadialGradientColorPointJsonEntityParser;
    }

    public final Lazy getDivRadialGradientColorPointJsonTemplateParser() {
        return this.divRadialGradientColorPointJsonTemplateParser;
    }

    public final Lazy getDivRadialGradientColorPointJsonTemplateResolver() {
        return this.divRadialGradientColorPointJsonTemplateResolver;
    }

    public final Lazy getDivRoundedRectangleShapeJsonEntityParser() {
        return this.divRoundedRectangleShapeJsonEntityParser;
    }

    public final Lazy getDivRoundedRectangleShapeJsonTemplateParser() {
        return this.divRoundedRectangleShapeJsonTemplateParser;
    }

    public final Lazy getDivRoundedRectangleShapeJsonTemplateResolver() {
        return this.divRoundedRectangleShapeJsonTemplateResolver;
    }

    public final Lazy getDivScaleTransitionJsonEntityParser() {
        return this.divScaleTransitionJsonEntityParser;
    }

    public final Lazy getDivScaleTransitionJsonTemplateParser() {
        return this.divScaleTransitionJsonTemplateParser;
    }

    public final Lazy getDivScaleTransitionJsonTemplateResolver() {
        return this.divScaleTransitionJsonTemplateResolver;
    }

    public final Lazy getDivSelectJsonEntityParser() {
        return this.divSelectJsonEntityParser;
    }

    public final Lazy getDivSelectJsonTemplateParser() {
        return this.divSelectJsonTemplateParser;
    }

    public final Lazy getDivSelectJsonTemplateResolver() {
        return this.divSelectJsonTemplateResolver;
    }

    public final Lazy getDivSelectOptionJsonEntityParser() {
        return this.divSelectOptionJsonEntityParser;
    }

    public final Lazy getDivSelectOptionJsonTemplateParser() {
        return this.divSelectOptionJsonTemplateParser;
    }

    public final Lazy getDivSelectOptionJsonTemplateResolver() {
        return this.divSelectOptionJsonTemplateResolver;
    }

    public final Lazy getDivSeparatorJsonEntityParser() {
        return this.divSeparatorJsonEntityParser;
    }

    public final Lazy getDivSeparatorJsonTemplateParser() {
        return this.divSeparatorJsonTemplateParser;
    }

    public final Lazy getDivSeparatorJsonTemplateResolver() {
        return this.divSeparatorJsonTemplateResolver;
    }

    public final Lazy getDivSeparatorDelimiterStyleJsonEntityParser() {
        return this.divSeparatorDelimiterStyleJsonEntityParser;
    }

    public final Lazy getDivSeparatorDelimiterStyleJsonTemplateParser() {
        return this.divSeparatorDelimiterStyleJsonTemplateParser;
    }

    public final Lazy getDivSeparatorDelimiterStyleJsonTemplateResolver() {
        return this.divSeparatorDelimiterStyleJsonTemplateResolver;
    }

    public final Lazy getDivShadowJsonEntityParser() {
        return this.divShadowJsonEntityParser;
    }

    public final Lazy getDivShadowJsonTemplateParser() {
        return this.divShadowJsonTemplateParser;
    }

    public final Lazy getDivShadowJsonTemplateResolver() {
        return this.divShadowJsonTemplateResolver;
    }

    public final Lazy getDivShapeDrawableJsonEntityParser() {
        return this.divShapeDrawableJsonEntityParser;
    }

    public final Lazy getDivShapeDrawableJsonTemplateParser() {
        return this.divShapeDrawableJsonTemplateParser;
    }

    public final Lazy getDivShapeDrawableJsonTemplateResolver() {
        return this.divShapeDrawableJsonTemplateResolver;
    }

    public final Lazy getDivShapeJsonEntityParser() {
        return this.divShapeJsonEntityParser;
    }

    public final Lazy getDivShapeJsonTemplateParser() {
        return this.divShapeJsonTemplateParser;
    }

    public final Lazy getDivShapeJsonTemplateResolver() {
        return this.divShapeJsonTemplateResolver;
    }

    public final Lazy getDivSizeUnitValueJsonEntityParser() {
        return this.divSizeUnitValueJsonEntityParser;
    }

    public final Lazy getDivSizeUnitValueJsonTemplateParser() {
        return this.divSizeUnitValueJsonTemplateParser;
    }

    public final Lazy getDivSizeUnitValueJsonTemplateResolver() {
        return this.divSizeUnitValueJsonTemplateResolver;
    }

    public final Lazy getDivSizeJsonEntityParser() {
        return this.divSizeJsonEntityParser;
    }

    public final Lazy getDivSizeJsonTemplateParser() {
        return this.divSizeJsonTemplateParser;
    }

    public final Lazy getDivSizeJsonTemplateResolver() {
        return this.divSizeJsonTemplateResolver;
    }

    public final Lazy getDivSlideTransitionJsonEntityParser() {
        return this.divSlideTransitionJsonEntityParser;
    }

    public final Lazy getDivSlideTransitionJsonTemplateParser() {
        return this.divSlideTransitionJsonTemplateParser;
    }

    public final Lazy getDivSlideTransitionJsonTemplateResolver() {
        return this.divSlideTransitionJsonTemplateResolver;
    }

    public final Lazy getDivSliderJsonEntityParser() {
        return this.divSliderJsonEntityParser;
    }

    public final Lazy getDivSliderJsonTemplateParser() {
        return this.divSliderJsonTemplateParser;
    }

    public final Lazy getDivSliderJsonTemplateResolver() {
        return this.divSliderJsonTemplateResolver;
    }

    public final Lazy getDivSliderTextStyleJsonEntityParser() {
        return this.divSliderTextStyleJsonEntityParser;
    }

    public final Lazy getDivSliderTextStyleJsonTemplateParser() {
        return this.divSliderTextStyleJsonTemplateParser;
    }

    public final Lazy getDivSliderTextStyleJsonTemplateResolver() {
        return this.divSliderTextStyleJsonTemplateResolver;
    }

    public final Lazy getDivSliderRangeJsonEntityParser() {
        return this.divSliderRangeJsonEntityParser;
    }

    public final Lazy getDivSliderRangeJsonTemplateParser() {
        return this.divSliderRangeJsonTemplateParser;
    }

    public final Lazy getDivSliderRangeJsonTemplateResolver() {
        return this.divSliderRangeJsonTemplateResolver;
    }

    public final Lazy getDivSolidBackgroundJsonEntityParser() {
        return this.divSolidBackgroundJsonEntityParser;
    }

    public final Lazy getDivSolidBackgroundJsonTemplateParser() {
        return this.divSolidBackgroundJsonTemplateParser;
    }

    public final Lazy getDivSolidBackgroundJsonTemplateResolver() {
        return this.divSolidBackgroundJsonTemplateResolver;
    }

    public final Lazy getDivStateJsonEntityParser() {
        return this.divStateJsonEntityParser;
    }

    public final Lazy getDivStateJsonTemplateParser() {
        return this.divStateJsonTemplateParser;
    }

    public final Lazy getDivStateJsonTemplateResolver() {
        return this.divStateJsonTemplateResolver;
    }

    public final Lazy getDivStateStateJsonEntityParser() {
        return this.divStateStateJsonEntityParser;
    }

    public final Lazy getDivStateStateJsonTemplateParser() {
        return this.divStateStateJsonTemplateParser;
    }

    public final Lazy getDivStateStateJsonTemplateResolver() {
        return this.divStateStateJsonTemplateResolver;
    }

    public final Lazy getDivStretchIndicatorItemPlacementJsonEntityParser() {
        return this.divStretchIndicatorItemPlacementJsonEntityParser;
    }

    public final Lazy getDivStretchIndicatorItemPlacementJsonTemplateParser() {
        return this.divStretchIndicatorItemPlacementJsonTemplateParser;
    }

    public final Lazy getDivStretchIndicatorItemPlacementJsonTemplateResolver() {
        return this.divStretchIndicatorItemPlacementJsonTemplateResolver;
    }

    public final Lazy getDivStrokeStyleDashedJsonEntityParser() {
        return this.divStrokeStyleDashedJsonEntityParser;
    }

    public final Lazy getDivStrokeStyleDashedJsonTemplateParser() {
        return this.divStrokeStyleDashedJsonTemplateParser;
    }

    public final Lazy getDivStrokeStyleDashedJsonTemplateResolver() {
        return this.divStrokeStyleDashedJsonTemplateResolver;
    }

    public final Lazy getDivStrokeStyleSolidJsonEntityParser() {
        return this.divStrokeStyleSolidJsonEntityParser;
    }

    public final Lazy getDivStrokeStyleSolidJsonTemplateParser() {
        return this.divStrokeStyleSolidJsonTemplateParser;
    }

    public final Lazy getDivStrokeStyleSolidJsonTemplateResolver() {
        return this.divStrokeStyleSolidJsonTemplateResolver;
    }

    public final Lazy getDivStrokeStyleJsonEntityParser() {
        return this.divStrokeStyleJsonEntityParser;
    }

    public final Lazy getDivStrokeStyleJsonTemplateParser() {
        return this.divStrokeStyleJsonTemplateParser;
    }

    public final Lazy getDivStrokeStyleJsonTemplateResolver() {
        return this.divStrokeStyleJsonTemplateResolver;
    }

    public final Lazy getDivStrokeJsonEntityParser() {
        return this.divStrokeJsonEntityParser;
    }

    public final Lazy getDivStrokeJsonTemplateParser() {
        return this.divStrokeJsonTemplateParser;
    }

    public final Lazy getDivStrokeJsonTemplateResolver() {
        return this.divStrokeJsonTemplateResolver;
    }

    public final Lazy getDivSwitchJsonEntityParser() {
        return this.divSwitchJsonEntityParser;
    }

    public final Lazy getDivSwitchJsonTemplateParser() {
        return this.divSwitchJsonTemplateParser;
    }

    public final Lazy getDivSwitchJsonTemplateResolver() {
        return this.divSwitchJsonTemplateResolver;
    }

    public final Lazy getDivTabsJsonEntityParser() {
        return this.divTabsJsonEntityParser;
    }

    public final Lazy getDivTabsJsonTemplateParser() {
        return this.divTabsJsonTemplateParser;
    }

    public final Lazy getDivTabsJsonTemplateResolver() {
        return this.divTabsJsonTemplateResolver;
    }

    public final Lazy getDivTabsTabTitleStyleJsonEntityParser() {
        return this.divTabsTabTitleStyleJsonEntityParser;
    }

    public final Lazy getDivTabsTabTitleStyleJsonTemplateParser() {
        return this.divTabsTabTitleStyleJsonTemplateParser;
    }

    public final Lazy getDivTabsTabTitleStyleJsonTemplateResolver() {
        return this.divTabsTabTitleStyleJsonTemplateResolver;
    }

    public final Lazy getDivTabsTabTitleDelimiterJsonEntityParser() {
        return this.divTabsTabTitleDelimiterJsonEntityParser;
    }

    public final Lazy getDivTabsTabTitleDelimiterJsonTemplateParser() {
        return this.divTabsTabTitleDelimiterJsonTemplateParser;
    }

    public final Lazy getDivTabsTabTitleDelimiterJsonTemplateResolver() {
        return this.divTabsTabTitleDelimiterJsonTemplateResolver;
    }

    public final Lazy getDivTabsItemJsonEntityParser() {
        return this.divTabsItemJsonEntityParser;
    }

    public final Lazy getDivTabsItemJsonTemplateParser() {
        return this.divTabsItemJsonTemplateParser;
    }

    public final Lazy getDivTabsItemJsonTemplateResolver() {
        return this.divTabsItemJsonTemplateResolver;
    }

    public final Lazy getDivTextGradientJsonEntityParser() {
        return this.divTextGradientJsonEntityParser;
    }

    public final Lazy getDivTextGradientJsonTemplateParser() {
        return this.divTextGradientJsonTemplateParser;
    }

    public final Lazy getDivTextGradientJsonTemplateResolver() {
        return this.divTextGradientJsonTemplateResolver;
    }

    public final Lazy getDivTextRangeBackgroundJsonEntityParser() {
        return this.divTextRangeBackgroundJsonEntityParser;
    }

    public final Lazy getDivTextRangeBackgroundJsonTemplateParser() {
        return this.divTextRangeBackgroundJsonTemplateParser;
    }

    public final Lazy getDivTextRangeBackgroundJsonTemplateResolver() {
        return this.divTextRangeBackgroundJsonTemplateResolver;
    }

    public final Lazy getDivTextRangeBorderJsonEntityParser() {
        return this.divTextRangeBorderJsonEntityParser;
    }

    public final Lazy getDivTextRangeBorderJsonTemplateParser() {
        return this.divTextRangeBorderJsonTemplateParser;
    }

    public final Lazy getDivTextRangeBorderJsonTemplateResolver() {
        return this.divTextRangeBorderJsonTemplateResolver;
    }

    public final Lazy getDivTextRangeMaskBaseJsonEntityParser() {
        return this.divTextRangeMaskBaseJsonEntityParser;
    }

    public final Lazy getDivTextRangeMaskBaseJsonTemplateParser() {
        return this.divTextRangeMaskBaseJsonTemplateParser;
    }

    public final Lazy getDivTextRangeMaskBaseJsonTemplateResolver() {
        return this.divTextRangeMaskBaseJsonTemplateResolver;
    }

    public final Lazy getDivTextRangeMaskParticlesJsonEntityParser() {
        return this.divTextRangeMaskParticlesJsonEntityParser;
    }

    public final Lazy getDivTextRangeMaskParticlesJsonTemplateParser() {
        return this.divTextRangeMaskParticlesJsonTemplateParser;
    }

    public final Lazy getDivTextRangeMaskParticlesJsonTemplateResolver() {
        return this.divTextRangeMaskParticlesJsonTemplateResolver;
    }

    public final Lazy getDivTextRangeMaskSolidJsonEntityParser() {
        return this.divTextRangeMaskSolidJsonEntityParser;
    }

    public final Lazy getDivTextRangeMaskSolidJsonTemplateParser() {
        return this.divTextRangeMaskSolidJsonTemplateParser;
    }

    public final Lazy getDivTextRangeMaskSolidJsonTemplateResolver() {
        return this.divTextRangeMaskSolidJsonTemplateResolver;
    }

    public final Lazy getDivTextRangeMaskJsonEntityParser() {
        return this.divTextRangeMaskJsonEntityParser;
    }

    public final Lazy getDivTextRangeMaskJsonTemplateParser() {
        return this.divTextRangeMaskJsonTemplateParser;
    }

    public final Lazy getDivTextRangeMaskJsonTemplateResolver() {
        return this.divTextRangeMaskJsonTemplateResolver;
    }

    public final Lazy getDivTextJsonEntityParser() {
        return this.divTextJsonEntityParser;
    }

    public final Lazy getDivTextJsonTemplateParser() {
        return this.divTextJsonTemplateParser;
    }

    public final Lazy getDivTextJsonTemplateResolver() {
        return this.divTextJsonTemplateResolver;
    }

    public final Lazy getDivTextRangeJsonEntityParser() {
        return this.divTextRangeJsonEntityParser;
    }

    public final Lazy getDivTextRangeJsonTemplateParser() {
        return this.divTextRangeJsonTemplateParser;
    }

    public final Lazy getDivTextRangeJsonTemplateResolver() {
        return this.divTextRangeJsonTemplateResolver;
    }

    public final Lazy getDivTextImageJsonEntityParser() {
        return this.divTextImageJsonEntityParser;
    }

    public final Lazy getDivTextImageJsonTemplateParser() {
        return this.divTextImageJsonTemplateParser;
    }

    public final Lazy getDivTextImageJsonTemplateResolver() {
        return this.divTextImageJsonTemplateResolver;
    }

    public final Lazy getDivTextImageAccessibilityJsonEntityParser() {
        return this.divTextImageAccessibilityJsonEntityParser;
    }

    public final Lazy getDivTextImageAccessibilityJsonTemplateParser() {
        return this.divTextImageAccessibilityJsonTemplateParser;
    }

    public final Lazy getDivTextImageAccessibilityJsonTemplateResolver() {
        return this.divTextImageAccessibilityJsonTemplateResolver;
    }

    public final Lazy getDivTextEllipsisJsonEntityParser() {
        return this.divTextEllipsisJsonEntityParser;
    }

    public final Lazy getDivTextEllipsisJsonTemplateParser() {
        return this.divTextEllipsisJsonTemplateParser;
    }

    public final Lazy getDivTextEllipsisJsonTemplateResolver() {
        return this.divTextEllipsisJsonTemplateResolver;
    }

    public final Lazy getDivTimerJsonEntityParser() {
        return this.divTimerJsonEntityParser;
    }

    public final Lazy getDivTimerJsonTemplateParser() {
        return this.divTimerJsonTemplateParser;
    }

    public final Lazy getDivTimerJsonTemplateResolver() {
        return this.divTimerJsonTemplateResolver;
    }

    public final Lazy getDivTooltipModeModalJsonEntityParser() {
        return this.divTooltipModeModalJsonEntityParser;
    }

    public final Lazy getDivTooltipModeModalJsonTemplateParser() {
        return this.divTooltipModeModalJsonTemplateParser;
    }

    public final Lazy getDivTooltipModeModalJsonTemplateResolver() {
        return this.divTooltipModeModalJsonTemplateResolver;
    }

    public final Lazy getDivTooltipModeNonModalJsonEntityParser() {
        return this.divTooltipModeNonModalJsonEntityParser;
    }

    public final Lazy getDivTooltipModeNonModalJsonTemplateParser() {
        return this.divTooltipModeNonModalJsonTemplateParser;
    }

    public final Lazy getDivTooltipModeNonModalJsonTemplateResolver() {
        return this.divTooltipModeNonModalJsonTemplateResolver;
    }

    public final Lazy getDivTooltipModeJsonEntityParser() {
        return this.divTooltipModeJsonEntityParser;
    }

    public final Lazy getDivTooltipModeJsonTemplateParser() {
        return this.divTooltipModeJsonTemplateParser;
    }

    public final Lazy getDivTooltipModeJsonTemplateResolver() {
        return this.divTooltipModeJsonTemplateResolver;
    }

    public final Lazy getDivTooltipJsonEntityParser() {
        return this.divTooltipJsonEntityParser;
    }

    public final Lazy getDivTooltipJsonTemplateParser() {
        return this.divTooltipJsonTemplateParser;
    }

    public final Lazy getDivTooltipJsonTemplateResolver() {
        return this.divTooltipJsonTemplateResolver;
    }

    public final Lazy getDivTransformJsonEntityParser() {
        return this.divTransformJsonEntityParser;
    }

    public final Lazy getDivTransformJsonTemplateParser() {
        return this.divTransformJsonTemplateParser;
    }

    public final Lazy getDivTransformJsonTemplateResolver() {
        return this.divTransformJsonTemplateResolver;
    }

    public final Lazy getDivTriggerJsonEntityParser() {
        return this.divTriggerJsonEntityParser;
    }

    public final Lazy getDivTriggerJsonTemplateParser() {
        return this.divTriggerJsonTemplateParser;
    }

    public final Lazy getDivTriggerJsonTemplateResolver() {
        return this.divTriggerJsonTemplateResolver;
    }

    public final Lazy getDivTypedValueJsonEntityParser() {
        return this.divTypedValueJsonEntityParser;
    }

    public final Lazy getDivTypedValueJsonTemplateParser() {
        return this.divTypedValueJsonTemplateParser;
    }

    public final Lazy getDivTypedValueJsonTemplateResolver() {
        return this.divTypedValueJsonTemplateResolver;
    }

    public final Lazy getDivVariableJsonEntityParser() {
        return this.divVariableJsonEntityParser;
    }

    public final Lazy getDivVariableJsonTemplateParser() {
        return this.divVariableJsonTemplateParser;
    }

    public final Lazy getDivVariableJsonTemplateResolver() {
        return this.divVariableJsonTemplateResolver;
    }

    public final Lazy getDivVideoSourceJsonEntityParser() {
        return this.divVideoSourceJsonEntityParser;
    }

    public final Lazy getDivVideoSourceJsonTemplateParser() {
        return this.divVideoSourceJsonTemplateParser;
    }

    public final Lazy getDivVideoSourceJsonTemplateResolver() {
        return this.divVideoSourceJsonTemplateResolver;
    }

    public final Lazy getDivVideoSourceResolutionJsonEntityParser() {
        return this.divVideoSourceResolutionJsonEntityParser;
    }

    public final Lazy getDivVideoSourceResolutionJsonTemplateParser() {
        return this.divVideoSourceResolutionJsonTemplateParser;
    }

    public final Lazy getDivVideoSourceResolutionJsonTemplateResolver() {
        return this.divVideoSourceResolutionJsonTemplateResolver;
    }

    public final Lazy getDivVideoJsonEntityParser() {
        return this.divVideoJsonEntityParser;
    }

    public final Lazy getDivVideoJsonTemplateParser() {
        return this.divVideoJsonTemplateParser;
    }

    public final Lazy getDivVideoJsonTemplateResolver() {
        return this.divVideoJsonTemplateResolver;
    }

    public final Lazy getDivVisibilityActionJsonEntityParser() {
        return this.divVisibilityActionJsonEntityParser;
    }

    public final Lazy getDivVisibilityActionJsonTemplateParser() {
        return this.divVisibilityActionJsonTemplateParser;
    }

    public final Lazy getDivVisibilityActionJsonTemplateResolver() {
        return this.divVisibilityActionJsonTemplateResolver;
    }

    public final Lazy getDivWrapContentSizeJsonEntityParser() {
        return this.divWrapContentSizeJsonEntityParser;
    }

    public final Lazy getDivWrapContentSizeJsonTemplateParser() {
        return this.divWrapContentSizeJsonTemplateParser;
    }

    public final Lazy getDivWrapContentSizeJsonTemplateResolver() {
        return this.divWrapContentSizeJsonTemplateResolver;
    }

    public final Lazy getDivJsonEntityParser() {
        return this.divJsonEntityParser;
    }

    public final Lazy getDivJsonTemplateParser() {
        return this.divJsonTemplateParser;
    }

    public final Lazy getDivJsonTemplateResolver() {
        return this.divJsonTemplateResolver;
    }

    public final Lazy getEndDestinationJsonEntityParser() {
        return this.endDestinationJsonEntityParser;
    }

    public final Lazy getEndDestinationJsonTemplateParser() {
        return this.endDestinationJsonTemplateParser;
    }

    public final Lazy getEndDestinationJsonTemplateResolver() {
        return this.endDestinationJsonTemplateResolver;
    }

    public final Lazy getIndexDestinationJsonEntityParser() {
        return this.indexDestinationJsonEntityParser;
    }

    public final Lazy getIndexDestinationJsonTemplateParser() {
        return this.indexDestinationJsonTemplateParser;
    }

    public final Lazy getIndexDestinationJsonTemplateResolver() {
        return this.indexDestinationJsonTemplateResolver;
    }

    public final Lazy getIntegerValueJsonEntityParser() {
        return this.integerValueJsonEntityParser;
    }

    public final Lazy getIntegerValueJsonTemplateParser() {
        return this.integerValueJsonTemplateParser;
    }

    public final Lazy getIntegerValueJsonTemplateResolver() {
        return this.integerValueJsonTemplateResolver;
    }

    public final Lazy getIntegerVariableJsonEntityParser() {
        return this.integerVariableJsonEntityParser;
    }

    public final Lazy getIntegerVariableJsonTemplateParser() {
        return this.integerVariableJsonTemplateParser;
    }

    public final Lazy getIntegerVariableJsonTemplateResolver() {
        return this.integerVariableJsonTemplateResolver;
    }

    public final Lazy getNumberValueJsonEntityParser() {
        return this.numberValueJsonEntityParser;
    }

    public final Lazy getNumberValueJsonTemplateParser() {
        return this.numberValueJsonTemplateParser;
    }

    public final Lazy getNumberValueJsonTemplateResolver() {
        return this.numberValueJsonTemplateResolver;
    }

    public final Lazy getNumberVariableJsonEntityParser() {
        return this.numberVariableJsonEntityParser;
    }

    public final Lazy getNumberVariableJsonTemplateParser() {
        return this.numberVariableJsonTemplateParser;
    }

    public final Lazy getNumberVariableJsonTemplateResolver() {
        return this.numberVariableJsonTemplateResolver;
    }

    public final Lazy getOffsetDestinationJsonEntityParser() {
        return this.offsetDestinationJsonEntityParser;
    }

    public final Lazy getOffsetDestinationJsonTemplateParser() {
        return this.offsetDestinationJsonTemplateParser;
    }

    public final Lazy getOffsetDestinationJsonTemplateResolver() {
        return this.offsetDestinationJsonTemplateResolver;
    }

    public final Lazy getPropertyVariableJsonEntityParser() {
        return this.propertyVariableJsonEntityParser;
    }

    public final Lazy getPropertyVariableJsonTemplateParser() {
        return this.propertyVariableJsonTemplateParser;
    }

    public final Lazy getPropertyVariableJsonTemplateResolver() {
        return this.propertyVariableJsonTemplateResolver;
    }

    public final Lazy getStartDestinationJsonEntityParser() {
        return this.startDestinationJsonEntityParser;
    }

    public final Lazy getStartDestinationJsonTemplateParser() {
        return this.startDestinationJsonTemplateParser;
    }

    public final Lazy getStartDestinationJsonTemplateResolver() {
        return this.startDestinationJsonTemplateResolver;
    }

    public final Lazy getStrValueJsonEntityParser() {
        return this.strValueJsonEntityParser;
    }

    public final Lazy getStrValueJsonTemplateParser() {
        return this.strValueJsonTemplateParser;
    }

    public final Lazy getStrValueJsonTemplateResolver() {
        return this.strValueJsonTemplateResolver;
    }

    public final Lazy getStrVariableJsonEntityParser() {
        return this.strVariableJsonEntityParser;
    }

    public final Lazy getStrVariableJsonTemplateParser() {
        return this.strVariableJsonTemplateParser;
    }

    public final Lazy getStrVariableJsonTemplateResolver() {
        return this.strVariableJsonTemplateResolver;
    }

    public final Lazy getUrlValueJsonEntityParser() {
        return this.urlValueJsonEntityParser;
    }

    public final Lazy getUrlValueJsonTemplateParser() {
        return this.urlValueJsonTemplateParser;
    }

    public final Lazy getUrlValueJsonTemplateResolver() {
        return this.urlValueJsonTemplateResolver;
    }

    public final Lazy getUrlVariableJsonEntityParser() {
        return this.urlVariableJsonEntityParser;
    }

    public final Lazy getUrlVariableJsonTemplateParser() {
        return this.urlVariableJsonTemplateParser;
    }

    public final Lazy getUrlVariableJsonTemplateResolver() {
        return this.urlVariableJsonTemplateResolver;
    }
}
