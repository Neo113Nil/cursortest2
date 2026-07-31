package com.yandex.div.core.view2.divs;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.dagger.ExperimentFlag;
import com.yandex.div.core.experiments.Experiment;
import com.yandex.div.core.expression.variables.TwoWayIntegerVariableBinder;
import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.ExpressionSubscribersKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivTypefaceResolver;
import com.yandex.div.core.view2.DivTypefaceResolverKt;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.DivSliderBinder;
import com.yandex.div.core.view2.divs.widgets.DivSliderView;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.widget.slider.SliderTextStyle;
import com.yandex.div.internal.widget.slider.SliderView;
import com.yandex.div.internal.widget.slider.shapes.TextDrawable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivDimension;
import com.yandex.div2.DivDrawable;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivPoint;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivSlider;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivSliderBinder.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0000\u0018\u0000 B2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001BBA\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\u001c\u0010\u0016\u001a\u00020\u0017*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u001e\u0010\u001d\u001a\u00020\u0017*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002J\u001c\u0010 \u001a\u00020\u0017*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u001e\u0010!\u001a\u00020\u0017*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002J\u001e\u0010\"\u001a\u00020\u0017*\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010#\u001a\u0004\u0018\u00010\u001cH\u0002J\u001e\u0010$\u001a\u00020\u0017*\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010#\u001a\u0004\u0018\u00010\u001cH\u0002J\u001c\u0010%\u001a\u00020\u0017*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u001cH\u0002J\u001c\u0010'\u001a\u00020\u0017*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u001cH\u0002J.\u0010(\u001a\u00020\u0017*\u00020\u00042\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00032\b\u0010,\u001a\u0004\u0018\u00010\u00032\u0006\u0010-\u001a\u00020.H\u0014J\f\u0010/\u001a\u00020\u0017*\u00020\u0004H\u0002J\u001e\u00100\u001a\u00020\u0017*\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J\u001e\u00101\u001a\u00020\u0017*\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u001a2\b\u00102\u001a\u0004\u0018\u00010\u001fH\u0002J$\u00103\u001a\u00020\u0017*\u00020\u00042\u0006\u00104\u001a\u0002052\u0006\u0010)\u001a\u00020*2\u0006\u0010-\u001a\u00020.H\u0002J\u001c\u00106\u001a\u00020\u0017*\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u001e\u00107\u001a\u00020\u0017*\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u001a2\b\u00102\u001a\u0004\u0018\u00010\u001fH\u0002J$\u00108\u001a\u00020\u0017*\u00020\u00042\u0006\u0010+\u001a\u00020\u00032\u0006\u0010)\u001a\u00020*2\u0006\u0010-\u001a\u00020.H\u0002J\u001e\u00109\u001a\u00020\u0017*\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010#\u001a\u0004\u0018\u00010\u001cH\u0002J\u001e\u0010:\u001a\u00020\u0017*\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010#\u001a\u0004\u0018\u00010\u001cH\u0002J\u001c\u0010;\u001a\u00020\u0017*\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u001cH\u0002J\u001c\u0010<\u001a\u00020\u0017*\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u001cH\u0002J\u001c\u0010=\u001a\u00020\u0017*\u00020\u00042\u0006\u0010+\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J$\u0010>\u001a\u00020\u0017*\u00020\u00042\u0006\u0010+\u001a\u00020\u00032\u0006\u0010)\u001a\u00020*2\u0006\u0010-\u001a\u00020.H\u0002J$\u0010?\u001a\u00020\u0017*\u00020\u00042\u0006\u0010+\u001a\u00020\u00032\u0006\u0010)\u001a\u00020*2\u0006\u0010-\u001a\u00020.H\u0002J\u001c\u0010@\u001a\u00020\u0017*\u00020\u00042\u0006\u0010+\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u001c\u0010A\u001a\u00020\u0017*\u00020\u00042\u0006\u0010+\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006C"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivSliderBinder;", "Lcom/yandex/div/core/view2/DivViewBinder;", "Lcom/yandex/div2/Div$Slider;", "Lcom/yandex/div2/DivSlider;", "Lcom/yandex/div/core/view2/divs/widgets/DivSliderView;", "baseBinder", "Lcom/yandex/div/core/view2/divs/DivBaseBinder;", "logger", "Lcom/yandex/div/core/Div2Logger;", "typefaceResolver", "Lcom/yandex/div/core/view2/DivTypefaceResolver;", "variableBinder", "Lcom/yandex/div/core/expression/variables/TwoWayIntegerVariableBinder;", "errorCollectors", "Lcom/yandex/div/core/view2/errors/ErrorCollectors;", "horizontalInterceptionAngle", "", "visualErrorsEnabled", "", "(Lcom/yandex/div/core/view2/divs/DivBaseBinder;Lcom/yandex/div/core/Div2Logger;Lcom/yandex/div/core/view2/DivTypefaceResolver;Lcom/yandex/div/core/expression/variables/TwoWayIntegerVariableBinder;Lcom/yandex/div/core/view2/errors/ErrorCollectors;FZ)V", "errorCollector", "Lcom/yandex/div/core/view2/errors/ErrorCollector;", "applyThumbSecondaryStyle", "", "Lcom/yandex/div/internal/widget/slider/SliderView;", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "thumbStyle", "Lcom/yandex/div2/DivDrawable;", "applyThumbSecondaryTextStyle", "textStyle", "Lcom/yandex/div2/DivSlider$TextStyle;", "applyThumbStyle", "applyThumbTextStyle", "applyTickMarkActiveStyle", "tickMarkStyle", "applyTickMarkInactiveStyle", "applyTrackActiveStyle", "trackStyle", "applyTrackInactiveStyle", "bind", "bindingContext", "Lcom/yandex/div/core/view2/BindingContext;", "div", "oldDiv", "path", "Lcom/yandex/div/core/state/DivStatePath;", "checkSliderTicks", "observeThumbSecondaryStyle", "observeThumbSecondaryTextStyle", "thumbTextStyle", "observeThumbSecondaryValue", "variableName", "", "observeThumbStyle", "observeThumbTextStyle", "observeThumbValue", "observeTickMarkActiveStyle", "observeTickMarkInactiveStyle", "observeTrackActiveStyle", "observeTrackInactiveStyle", "setupRanges", "setupSecondaryThumb", "setupThumb", "setupTickMarks", "setupTrack", "Companion", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DivSliderBinder extends DivViewBinder<Div.Slider, DivSlider, DivSliderView> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Nullable
    private ErrorCollector errorCollector;

    @NotNull
    private final ErrorCollectors errorCollectors;
    private final float horizontalInterceptionAngle;

    @NotNull
    private final Div2Logger logger;

    @NotNull
    private final DivTypefaceResolver typefaceResolver;

    @NotNull
    private final TwoWayIntegerVariableBinder variableBinder;
    private final boolean visualErrorsEnabled;

    public DivSliderBinder(@NotNull DivBaseBinder divBaseBinder, @NotNull Div2Logger div2Logger, @NotNull DivTypefaceResolver divTypefaceResolver, @NotNull TwoWayIntegerVariableBinder twoWayIntegerVariableBinder, @NotNull ErrorCollectors errorCollectors, float f, @ExperimentFlag(experiment = Experiment.VISUAL_ERRORS_ENABLED) boolean z) {
        super(divBaseBinder);
        this.logger = div2Logger;
        this.typefaceResolver = divTypefaceResolver;
        this.variableBinder = twoWayIntegerVariableBinder;
        this.errorCollectors = errorCollectors;
        this.horizontalInterceptionAngle = f;
        this.visualErrorsEnabled = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(@NotNull final DivSliderView divSliderView, @NotNull BindingContext bindingContext, @NotNull DivSlider divSlider, @Nullable DivSlider divSlider2, @NotNull DivStatePath divStatePath) {
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        this.errorCollector = this.errorCollectors.getOrCreate(bindingContext.getDivView().getDataTag(), bindingContext.getDivView().getDivData());
        divSliderView.setInterceptionAngle(this.horizontalInterceptionAngle);
        divSliderView.addSubscription(divSlider.minValue.observeAndGet(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$bind$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).longValue());
                return Unit.INSTANCE;
            }

            public final void invoke(long j) {
                DivSliderView.this.setMinValue(j);
                this.checkSliderTicks(DivSliderView.this);
            }
        }));
        divSliderView.addSubscription(divSlider.maxValue.observeAndGet(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$bind$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).longValue());
                return Unit.INSTANCE;
            }

            public final void invoke(long j) {
                DivSliderView.this.setMaxValue(j);
                this.checkSliderTicks(DivSliderView.this);
            }
        }));
        divSliderView.addSubscription(divSlider.isEnabled.observeAndGet(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$bind$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                DivSliderView.this.setInteractive(z);
            }
        }));
        divSliderView.clearOnThumbChangedListener();
        setupThumb(divSliderView, divSlider, bindingContext, divStatePath);
        setupSecondaryThumb(divSliderView, divSlider, bindingContext, divStatePath);
        setupTrack(divSliderView, divSlider, expressionResolver);
        setupTickMarks(divSliderView, divSlider, expressionResolver);
        setupRanges(divSliderView, divSlider, expressionResolver);
    }

    private final void setupThumb(DivSliderView divSliderView, DivSlider divSlider, BindingContext bindingContext, DivStatePath divStatePath) {
        observeThumbValue(divSliderView, divSlider, bindingContext, divStatePath);
        observeThumbStyle(divSliderView, bindingContext.getExpressionResolver(), divSlider.thumbStyle);
        observeThumbTextStyle(divSliderView, bindingContext.getExpressionResolver(), divSlider.thumbTextStyle);
    }

    private final void observeThumbValue(final DivSliderView divSliderView, DivSlider divSlider, final BindingContext bindingContext, DivStatePath divStatePath) {
        String str = divSlider.thumbValueVariable;
        if (str == null) {
            return;
        }
        divSliderView.addSubscription(this.variableBinder.bindVariable(bindingContext, str, new TwoWayIntegerVariableBinder.Callbacks() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$observeThumbValue$callbacks$1
            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void onVariableChanged(@Nullable Long value) {
                DivSliderView.this.setThumbValue(value != null ? value.longValue() : 0.0f, false);
            }

            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void setViewStateChangeListener(@NotNull final Function1 valueUpdater) {
                final DivSliderView divSliderView2 = DivSliderView.this;
                final DivSliderBinder divSliderBinder = this;
                final BindingContext bindingContext2 = bindingContext;
                divSliderView2.addOnThumbChangedListener(new SliderView.ChangedListener() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$observeThumbValue$callbacks$1$setViewStateChangeListener$1
                    @Override // com.yandex.div.internal.widget.slider.SliderView.ChangedListener
                    public void onThumbValueChanged(float value) {
                        Div2Logger div2Logger;
                        div2Logger = DivSliderBinder.this.logger;
                        div2Logger.logSliderDrag(bindingContext2.getDivView(), divSliderView2, Float.valueOf(value));
                        valueUpdater.invoke(Long.valueOf(MathKt.roundToLong(value)));
                    }
                });
            }
        }, divStatePath));
    }

    private final void observeThumbStyle(final DivSliderView divSliderView, final ExpressionResolver expressionResolver, final DivDrawable divDrawable) {
        applyThumbStyle(divSliderView, expressionResolver, divDrawable);
        ExpressionSubscribersKt.observeDrawable(divSliderView, divDrawable, expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$observeThumbStyle$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7216invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7216invoke(@NotNull Object obj) {
                DivSliderBinder.this.applyThumbStyle(divSliderView, expressionResolver, divDrawable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyThumbStyle(SliderView sliderView, ExpressionResolver expressionResolver, DivDrawable divDrawable) {
        sliderView.setThumbDrawable(DivUtilKt.toDrawable(divDrawable, sliderView.getResources().getDisplayMetrics(), expressionResolver));
    }

    private final void observeThumbSecondaryStyle(final DivSliderView divSliderView, final ExpressionResolver expressionResolver, final DivDrawable divDrawable) {
        if (divDrawable == null) {
            return;
        }
        applyThumbSecondaryStyle(divSliderView, expressionResolver, divDrawable);
        ExpressionSubscribersKt.observeDrawable(divSliderView, divDrawable, expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$observeThumbSecondaryStyle$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7215invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7215invoke(@NotNull Object obj) {
                DivSliderBinder.this.applyThumbSecondaryStyle(divSliderView, expressionResolver, divDrawable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyThumbSecondaryStyle(SliderView sliderView, ExpressionResolver expressionResolver, DivDrawable divDrawable) {
        sliderView.setThumbSecondaryDrawable(DivUtilKt.toDrawable(divDrawable, sliderView.getResources().getDisplayMetrics(), expressionResolver));
    }

    private final void observeThumbTextStyle(final DivSliderView divSliderView, final ExpressionResolver expressionResolver, final DivSlider.TextStyle textStyle) {
        applyThumbTextStyle(divSliderView, expressionResolver, textStyle);
        if (textStyle == null) {
            return;
        }
        divSliderView.addSubscription(textStyle.textColor.observe(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$observeThumbTextStyle$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) {
                DivSliderBinder.this.applyThumbTextStyle(divSliderView, expressionResolver, textStyle);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyThumbTextStyle(SliderView sliderView, ExpressionResolver expressionResolver, DivSlider.TextStyle textStyle) {
        sliderView.setThumbTextDrawable(textStyle != null ? new TextDrawable(Companion.toSliderTextStyle(textStyle, sliderView.getResources().getDisplayMetrics(), this.typefaceResolver, expressionResolver)) : null);
    }

    private final void observeThumbSecondaryTextStyle(final DivSliderView divSliderView, final ExpressionResolver expressionResolver, final DivSlider.TextStyle textStyle) {
        applyThumbSecondaryTextStyle(divSliderView, expressionResolver, textStyle);
        if (textStyle == null) {
            return;
        }
        divSliderView.addSubscription(textStyle.textColor.observe(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$observeThumbSecondaryTextStyle$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) {
                DivSliderBinder.this.applyThumbSecondaryTextStyle(divSliderView, expressionResolver, textStyle);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyThumbSecondaryTextStyle(SliderView sliderView, ExpressionResolver expressionResolver, DivSlider.TextStyle textStyle) {
        sliderView.setThumbSecondTextDrawable(textStyle != null ? new TextDrawable(Companion.toSliderTextStyle(textStyle, sliderView.getResources().getDisplayMetrics(), this.typefaceResolver, expressionResolver)) : null);
    }

    private final void setupSecondaryThumb(DivSliderView divSliderView, DivSlider divSlider, BindingContext bindingContext, DivStatePath divStatePath) {
        String str = divSlider.thumbSecondaryValueVariable;
        Unit unit = null;
        if (str == null) {
            divSliderView.setThumbSecondaryDrawable(null);
            divSliderView.setThumbSecondaryValue(null, false);
            return;
        }
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        observeThumbSecondaryValue(divSliderView, str, bindingContext, divStatePath);
        DivDrawable divDrawable = divSlider.thumbSecondaryStyle;
        if (divDrawable != null) {
            observeThumbSecondaryStyle(divSliderView, expressionResolver, divDrawable);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            observeThumbSecondaryStyle(divSliderView, expressionResolver, divSlider.thumbStyle);
        }
        observeThumbSecondaryTextStyle(divSliderView, expressionResolver, divSlider.thumbSecondaryTextStyle);
    }

    private final void observeThumbSecondaryValue(final DivSliderView divSliderView, String str, final BindingContext bindingContext, DivStatePath divStatePath) {
        divSliderView.addSubscription(this.variableBinder.bindVariable(bindingContext, str, new TwoWayIntegerVariableBinder.Callbacks() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$observeThumbSecondaryValue$callbacks$1
            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void onVariableChanged(@Nullable Long value) {
                DivSliderView.this.setThumbSecondaryValue(value != null ? Float.valueOf(value.longValue()) : null, false);
            }

            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void setViewStateChangeListener(@NotNull final Function1 valueUpdater) {
                final DivSliderView divSliderView2 = DivSliderView.this;
                final DivSliderBinder divSliderBinder = this;
                final BindingContext bindingContext2 = bindingContext;
                divSliderView2.addOnThumbChangedListener(new SliderView.ChangedListener() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$observeThumbSecondaryValue$callbacks$1$setViewStateChangeListener$1
                    @Override // com.yandex.div.internal.widget.slider.SliderView.ChangedListener
                    public void onThumbSecondaryValueChanged(@Nullable Float value) {
                        Div2Logger div2Logger;
                        div2Logger = DivSliderBinder.this.logger;
                        div2Logger.logSliderDrag(bindingContext2.getDivView(), divSliderView2, value);
                        valueUpdater.invoke(Long.valueOf(value != null ? MathKt.roundToLong(value.floatValue()) : 0L));
                    }
                });
            }
        }, divStatePath));
    }

    private final void setupTrack(DivSliderView divSliderView, DivSlider divSlider, ExpressionResolver expressionResolver) {
        observeTrackActiveStyle(divSliderView, expressionResolver, divSlider.trackActiveStyle);
        observeTrackInactiveStyle(divSliderView, expressionResolver, divSlider.trackInactiveStyle);
    }

    private final void observeTrackActiveStyle(final DivSliderView divSliderView, final ExpressionResolver expressionResolver, final DivDrawable divDrawable) {
        applyTrackActiveStyle(divSliderView, expressionResolver, divDrawable);
        ExpressionSubscribersKt.observeDrawable(divSliderView, divDrawable, expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$observeTrackActiveStyle$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7219invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7219invoke(@NotNull Object obj) {
                DivSliderBinder.this.applyTrackActiveStyle(divSliderView, expressionResolver, divDrawable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyTrackActiveStyle(SliderView sliderView, ExpressionResolver expressionResolver, DivDrawable divDrawable) {
        sliderView.setActiveTrackDrawable(DivUtilKt.toDrawable(divDrawable, sliderView.getResources().getDisplayMetrics(), expressionResolver));
    }

    private final void observeTrackInactiveStyle(final DivSliderView divSliderView, final ExpressionResolver expressionResolver, final DivDrawable divDrawable) {
        applyTrackInactiveStyle(divSliderView, expressionResolver, divDrawable);
        ExpressionSubscribersKt.observeDrawable(divSliderView, divDrawable, expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$observeTrackInactiveStyle$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7220invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7220invoke(@NotNull Object obj) {
                DivSliderBinder.this.applyTrackInactiveStyle(divSliderView, expressionResolver, divDrawable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyTrackInactiveStyle(SliderView sliderView, ExpressionResolver expressionResolver, DivDrawable divDrawable) {
        sliderView.setInactiveTrackDrawable(DivUtilKt.toDrawable(divDrawable, sliderView.getResources().getDisplayMetrics(), expressionResolver));
    }

    private final void setupTickMarks(DivSliderView divSliderView, DivSlider divSlider, ExpressionResolver expressionResolver) {
        observeTickMarkActiveStyle(divSliderView, expressionResolver, divSlider.tickMarkActiveStyle);
        observeTickMarkInactiveStyle(divSliderView, expressionResolver, divSlider.tickMarkInactiveStyle);
    }

    private final void observeTickMarkActiveStyle(final DivSliderView divSliderView, final ExpressionResolver expressionResolver, final DivDrawable divDrawable) {
        applyTickMarkActiveStyle(divSliderView, expressionResolver, divDrawable);
        ExpressionSubscribersKt.observeDrawable(divSliderView, divDrawable, expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$observeTickMarkActiveStyle$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7217invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7217invoke(@NotNull Object obj) {
                DivSliderBinder.this.applyTickMarkActiveStyle(divSliderView, expressionResolver, divDrawable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyTickMarkActiveStyle(DivSliderView divSliderView, ExpressionResolver expressionResolver, DivDrawable divDrawable) {
        divSliderView.setActiveTickMarkDrawable(divDrawable != null ? DivUtilKt.toDrawable(divDrawable, divSliderView.getResources().getDisplayMetrics(), expressionResolver) : null);
        checkSliderTicks(divSliderView);
    }

    private final void observeTickMarkInactiveStyle(final DivSliderView divSliderView, final ExpressionResolver expressionResolver, final DivDrawable divDrawable) {
        applyTickMarkInactiveStyle(divSliderView, expressionResolver, divDrawable);
        ExpressionSubscribersKt.observeDrawable(divSliderView, divDrawable, expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$observeTickMarkInactiveStyle$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7218invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7218invoke(@NotNull Object obj) {
                DivSliderBinder.this.applyTickMarkInactiveStyle(divSliderView, expressionResolver, divDrawable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyTickMarkInactiveStyle(DivSliderView divSliderView, ExpressionResolver expressionResolver, DivDrawable divDrawable) {
        divSliderView.setInactiveTickMarkDrawable(divDrawable != null ? DivUtilKt.toDrawable(divDrawable, divSliderView.getResources().getDisplayMetrics(), expressionResolver) : null);
        checkSliderTicks(divSliderView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkSliderTicks(final DivSliderView divSliderView) {
        if (!this.visualErrorsEnabled || this.errorCollector == null) {
            return;
        }
        OneShotPreDrawListener.add(divSliderView, new Runnable() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$checkSliderTicks$$inlined$doOnPreDraw$1
            /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
            
                r0 = r3.errorCollector;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                ErrorCollector errorCollector;
                ErrorCollector errorCollector2;
                ErrorCollector errorCollector3;
                if (divSliderView.getActiveTickMarkDrawable() == null && divSliderView.getInactiveTickMarkDrawable() == null) {
                    return;
                }
                float maxValue = divSliderView.getMaxValue() - divSliderView.getMinValue();
                Drawable activeTickMarkDrawable = divSliderView.getActiveTickMarkDrawable();
                boolean z = false;
                int intrinsicWidth = activeTickMarkDrawable != null ? activeTickMarkDrawable.getIntrinsicWidth() : 0;
                if (Math.max(intrinsicWidth, divSliderView.getInactiveTickMarkDrawable() != null ? r3.getIntrinsicWidth() : 0) * maxValue > divSliderView.getWidth()) {
                    errorCollector = this.errorCollector;
                    if (errorCollector != null) {
                        errorCollector2 = this.errorCollector;
                        Intrinsics.checkNotNull(errorCollector2);
                        Iterator<Throwable> warnings = errorCollector2.getWarnings();
                        while (warnings.hasNext()) {
                            if (Intrinsics.areEqual(warnings.next().getMessage(), "Slider ticks overlap each other.")) {
                                z = true;
                            }
                        }
                        if (z || errorCollector3 == null) {
                            return;
                        }
                        errorCollector3.logWarning(new Throwable("Slider ticks overlap each other."));
                    }
                }
            }
        });
    }

    private final void setupRanges(final DivSliderView divSliderView, DivSlider divSlider, final ExpressionResolver expressionResolver) {
        Iterator it;
        divSliderView.getRanges().clear();
        List list = divSlider.ranges;
        if (list == null) {
            return;
        }
        final DisplayMetrics displayMetrics = divSliderView.getResources().getDisplayMetrics();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            DivSlider.Range range = (DivSlider.Range) it2.next();
            final SliderView.Range range2 = new SliderView.Range();
            divSliderView.getRanges().add(range2);
            Expression expression = range.start;
            if (expression == null) {
                expression = divSlider.minValue;
            }
            divSliderView.addSubscription(expression.observeAndGet(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$setupRanges$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke(((Number) obj).longValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(long j) {
                    DivSliderBinder.Companion unused;
                    unused = DivSliderBinder.Companion;
                    DivSliderView divSliderView2 = DivSliderView.this;
                    range2.setStartValue(j);
                    divSliderView2.requestLayout();
                    divSliderView2.invalidate();
                }
            }));
            Expression expression2 = range.end;
            if (expression2 == null) {
                expression2 = divSlider.maxValue;
            }
            divSliderView.addSubscription(expression2.observeAndGet(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$setupRanges$1$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke(((Number) obj).longValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(long j) {
                    DivSliderBinder.Companion unused;
                    unused = DivSliderBinder.Companion;
                    DivSliderView divSliderView2 = DivSliderView.this;
                    range2.setEndValue(j);
                    divSliderView2.requestLayout();
                    divSliderView2.invalidate();
                }
            }));
            final DivEdgeInsets divEdgeInsets = range.margins;
            if (divEdgeInsets == null) {
                range2.setMarginStart(0);
                range2.setMarginEnd(0);
                it = it2;
            } else {
                Expression expression3 = divEdgeInsets.start;
                boolean z = (expression3 == null && divEdgeInsets.end == null) ? false : true;
                if (!z) {
                    expression3 = divEdgeInsets.left;
                }
                final Expression expression4 = expression3;
                final Expression expression5 = z ? divEdgeInsets.end : divEdgeInsets.right;
                if (expression4 != null) {
                    it = it2;
                    divSliderView.addSubscription(expression4.observe(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$setupRanges$1$3$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke(((Number) obj).longValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(long j) {
                            DivSliderBinder.Companion companion;
                            DivSliderBinder.Companion unused;
                            unused = DivSliderBinder.Companion;
                            DivSliderView divSliderView2 = DivSliderView.this;
                            SliderView.Range range3 = range2;
                            DivEdgeInsets divEdgeInsets2 = divEdgeInsets;
                            ExpressionResolver expressionResolver2 = expressionResolver;
                            DisplayMetrics displayMetrics2 = displayMetrics;
                            companion = DivSliderBinder.Companion;
                            range3.setMarginStart(companion.applyUnit(divEdgeInsets2, j, expressionResolver2, displayMetrics2));
                            divSliderView2.requestLayout();
                            divSliderView2.invalidate();
                        }
                    }));
                } else {
                    it = it2;
                }
                if (expression5 != null) {
                    divSliderView.addSubscription(expression5.observe(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$setupRanges$1$3$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke(((Number) obj).longValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(long j) {
                            DivSliderBinder.Companion companion;
                            DivSliderBinder.Companion unused;
                            unused = DivSliderBinder.Companion;
                            DivSliderView divSliderView2 = DivSliderView.this;
                            SliderView.Range range3 = range2;
                            DivEdgeInsets divEdgeInsets2 = divEdgeInsets;
                            ExpressionResolver expressionResolver2 = expressionResolver;
                            DisplayMetrics displayMetrics2 = displayMetrics;
                            companion = DivSliderBinder.Companion;
                            range3.setMarginEnd(companion.applyUnit(divEdgeInsets2, j, expressionResolver2, displayMetrics2));
                            divSliderView2.requestLayout();
                            divSliderView2.invalidate();
                        }
                    }));
                }
                divEdgeInsets.unit.observeAndGet(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$setupRanges$1$3$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((DivSizeUnit) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull DivSizeUnit divSizeUnit) {
                        DivSliderBinder.Companion companion;
                        DivSliderBinder.Companion companion2;
                        DivSliderBinder.Companion unused;
                        unused = DivSliderBinder.Companion;
                        DivSliderView divSliderView2 = DivSliderView.this;
                        Expression<Long> expression6 = expression4;
                        Expression<Long> expression7 = expression5;
                        SliderView.Range range3 = range2;
                        ExpressionResolver expressionResolver2 = expressionResolver;
                        DisplayMetrics displayMetrics2 = displayMetrics;
                        if (expression6 != null) {
                            companion2 = DivSliderBinder.Companion;
                            range3.setMarginStart(companion2.castToUnit(expression6.evaluate(expressionResolver2).longValue(), divSizeUnit, displayMetrics2));
                        }
                        if (expression7 != null) {
                            companion = DivSliderBinder.Companion;
                            range3.setMarginEnd(companion.castToUnit(expression7.evaluate(expressionResolver2).longValue(), divSizeUnit, displayMetrics2));
                        }
                        divSliderView2.requestLayout();
                        divSliderView2.invalidate();
                    }
                });
            }
            DivDrawable divDrawable = range.trackActiveStyle;
            if (divDrawable == null) {
                divDrawable = divSlider.trackActiveStyle;
            }
            final DivDrawable divDrawable2 = divDrawable;
            Function1 function1 = new Function1() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$setupRanges$1$applyActiveTrackStyle$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m7221invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m7221invoke(@NotNull Object obj) {
                    DivSliderBinder.Companion unused;
                    unused = DivSliderBinder.Companion;
                    DivSliderView divSliderView2 = DivSliderView.this;
                    range2.setActiveTrackDrawable(DivUtilKt.toDrawable(divDrawable2, displayMetrics, expressionResolver));
                    divSliderView2.requestLayout();
                    divSliderView2.invalidate();
                }
            };
            Unit unit = Unit.INSTANCE;
            function1.invoke(unit);
            ExpressionSubscribersKt.observeDrawable(divSliderView, divDrawable2, expressionResolver, function1);
            DivDrawable divDrawable3 = range.trackInactiveStyle;
            if (divDrawable3 == null) {
                divDrawable3 = divSlider.trackInactiveStyle;
            }
            final DivDrawable divDrawable4 = divDrawable3;
            Function1 function12 = new Function1() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$setupRanges$1$applyInactiveTrackStyle$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m7222invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m7222invoke(@NotNull Object obj) {
                    DivSliderBinder.Companion unused;
                    unused = DivSliderBinder.Companion;
                    DivSliderView divSliderView2 = DivSliderView.this;
                    range2.setInactiveTrackDrawable(DivUtilKt.toDrawable(divDrawable4, displayMetrics, expressionResolver));
                    divSliderView2.requestLayout();
                    divSliderView2.invalidate();
                }
            };
            function12.invoke(unit);
            ExpressionSubscribersKt.observeDrawable(divSliderView, divDrawable4, expressionResolver, function12);
            it2 = it;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DivSliderBinder.kt */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u001a\u0010\f\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000bJ\"\u0010\u000f\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\tJ\u001b\u0010\u0014\u001a\u00020\u0015*\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u0018H\u0086\b¨\u0006\u0019"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivSliderBinder$Companion;", "", "()V", "applyUnit", "", "Lcom/yandex/div2/DivEdgeInsets;", VastAttributes.MARGIN, "", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "metrics", "Landroid/util/DisplayMetrics;", "castToUnit", "unit", "Lcom/yandex/div2/DivSizeUnit;", "toSliderTextStyle", "Lcom/yandex/div/internal/widget/slider/SliderTextStyle;", "Lcom/yandex/div2/DivSlider$TextStyle;", "typefaceResolver", "Lcom/yandex/div/core/view2/DivTypefaceResolver;", "updateAfter", "", "Lcom/yandex/div/internal/widget/slider/SliderView;", "block", "Lkotlin/Function0;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class Companion {

        /* compiled from: DivSliderBinder.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[DivSizeUnit.values().length];
                try {
                    iArr[DivSizeUnit.DP.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DivSizeUnit.SP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[DivSizeUnit.PX.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final SliderTextStyle toSliderTextStyle(@NotNull DivSlider.TextStyle textStyle, @NotNull DisplayMetrics displayMetrics, @NotNull DivTypefaceResolver divTypefaceResolver, @NotNull ExpressionResolver expressionResolver) {
            DivTypefaceResolver divTypefaceResolver2;
            String str;
            DivDimension divDimension;
            DivDimension divDimension2;
            int i;
            long longValue = ((Number) textStyle.fontSize.evaluate(expressionResolver)).longValue();
            Expression expression = textStyle.fontFamily;
            Integer num = null;
            if (expression != null) {
                str = (String) expression.evaluate(expressionResolver);
                divTypefaceResolver2 = divTypefaceResolver;
            } else {
                divTypefaceResolver2 = divTypefaceResolver;
                str = null;
            }
            DivTypefaceProvider typefaceProvider = divTypefaceResolver2.getTypefaceProvider(str);
            String fontVariations = typefaceProvider.isVariable() ? TextViewExtensionsKt.getFontVariations(textStyle.fontWeight, textStyle.fontWeightValue, textStyle.fontVariationSettings, expressionResolver) : null;
            float fontSizeToPx = BaseDivViewExtensionsKt.fontSizeToPx(longValue, (DivSizeUnit) textStyle.fontSizeUnit.evaluate(expressionResolver), displayMetrics);
            float doubleValue = ((float) ((Number) textStyle.letterSpacing.evaluate(expressionResolver)).doubleValue()) / longValue;
            Expression expression2 = textStyle.fontWeight;
            DivFontWeight divFontWeight = expression2 != null ? (DivFontWeight) expression2.evaluate(expressionResolver) : null;
            Expression expression3 = textStyle.fontWeightValue;
            if (expression3 != null) {
                long longValue2 = ((Number) expression3.evaluate(expressionResolver)).longValue();
                long j = longValue2 >> 31;
                if (j == 0 || j == -1) {
                    i = (int) longValue2;
                } else {
                    KAssert kAssert = KAssert.INSTANCE;
                    if (Assert.isEnabled()) {
                        Assert.fail("Unable convert '" + longValue2 + "' to Int");
                    }
                    i = longValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                num = Integer.valueOf(i);
            }
            Typeface typeface = DivTypefaceResolverKt.getTypeface(divFontWeight, num, typefaceProvider);
            DivPoint divPoint = textStyle.offset;
            float px = (divPoint == null || (divDimension2 = divPoint.x) == null) ? 0.0f : BaseDivViewExtensionsKt.toPx(divDimension2, displayMetrics, expressionResolver);
            DivPoint divPoint2 = textStyle.offset;
            return new SliderTextStyle(fontSizeToPx, doubleValue, typeface, px, (divPoint2 == null || (divDimension = divPoint2.y) == null) ? 0.0f : BaseDivViewExtensionsKt.toPx(divDimension, displayMetrics, expressionResolver), ((Number) textStyle.textColor.evaluate(expressionResolver)).intValue(), fontVariations);
        }

        public final void updateAfter(@NotNull SliderView sliderView, @NotNull Function0 function0) {
            function0.mo4828invoke();
            sliderView.requestLayout();
            sliderView.invalidate();
        }

        public final int applyUnit(@NotNull DivEdgeInsets divEdgeInsets, long j, @NotNull ExpressionResolver expressionResolver, @NotNull DisplayMetrics displayMetrics) {
            return castToUnit(j, (DivSizeUnit) divEdgeInsets.unit.evaluate(expressionResolver), displayMetrics);
        }

        public final int castToUnit(long j, @NotNull DivSizeUnit divSizeUnit, @NotNull DisplayMetrics displayMetrics) {
            int i = WhenMappings.$EnumSwitchMapping$0[divSizeUnit.ordinal()];
            if (i == 1) {
                return BaseDivViewExtensionsKt.dpToPx(Long.valueOf(j), displayMetrics);
            }
            if (i == 2) {
                return BaseDivViewExtensionsKt.spToPx(Long.valueOf(j), displayMetrics);
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            long j2 = j >> 31;
            if (j2 == 0 || j2 == -1) {
                return (int) j;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable convert '" + j + "' to Int");
            }
            return j > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
    }
}
