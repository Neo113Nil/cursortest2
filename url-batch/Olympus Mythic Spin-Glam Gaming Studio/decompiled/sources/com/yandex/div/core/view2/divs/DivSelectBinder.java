package com.yandex.div.core.view2.divs;

import android.view.MotionEvent;
import android.view.View;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.expression.variables.TwoWayStringVariableBinder;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivTypefaceResolver;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.animations.UtilsKt;
import com.yandex.div.core.view2.divs.widgets.DivSelectView;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivSelect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivSelectBinder.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u001c\u0010\u000e\u001a\u00020\u000f*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J.\u0010\u0013\u001a\u00020\u000f*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0015\u001a\u00020\u0016H\u0014J\"\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J&\u0010\u001c\u001a\u00020\u000f*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u001c\u0010\u001d\u001a\u00020\u000f*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u001c\u0010\u001e\u001a\u00020\u000f*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J$\u0010\u001f\u001a\u00020\u000f*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/yandex/div/core/view2/divs/DivSelectBinder;", "Lcom/yandex/div/core/view2/DivViewBinder;", "Lcom/yandex/div2/Div$Select;", "Lcom/yandex/div2/DivSelect;", "Lcom/yandex/div/core/view2/divs/widgets/DivSelectView;", "baseBinder", "Lcom/yandex/div/core/view2/divs/DivBaseBinder;", "typefaceResolver", "Lcom/yandex/div/core/view2/DivTypefaceResolver;", "variableBinder", "Lcom/yandex/div/core/expression/variables/TwoWayStringVariableBinder;", "errorCollectors", "Lcom/yandex/div/core/view2/errors/ErrorCollectors;", "(Lcom/yandex/div/core/view2/divs/DivBaseBinder;Lcom/yandex/div/core/view2/DivTypefaceResolver;Lcom/yandex/div/core/expression/variables/TwoWayStringVariableBinder;Lcom/yandex/div/core/view2/errors/ErrorCollectors;)V", "applyOptions", "", "div", "bindingContext", "Lcom/yandex/div/core/view2/BindingContext;", "bind", "oldDiv", "path", "Lcom/yandex/div/core/state/DivStatePath;", "createObservedItemList", "", "", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "observeBaseTextProperties", "observeHintColor", "observeHintText", "observeVariable", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@DivScope
/* loaded from: classes11.dex */
public final class DivSelectBinder extends DivViewBinder<Div.Select, DivSelect, DivSelectView> {

    @NotNull
    private final ErrorCollectors errorCollectors;

    @NotNull
    private final DivTypefaceResolver typefaceResolver;

    @NotNull
    private final TwoWayStringVariableBinder variableBinder;

    public DivSelectBinder(@NotNull DivBaseBinder divBaseBinder, @NotNull DivTypefaceResolver divTypefaceResolver, @NotNull TwoWayStringVariableBinder twoWayStringVariableBinder, @NotNull ErrorCollectors errorCollectors) {
        super(divBaseBinder);
        this.typefaceResolver = divTypefaceResolver;
        this.variableBinder = twoWayStringVariableBinder;
        this.errorCollectors = errorCollectors;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(@NotNull DivSelectView divSelectView, @NotNull BindingContext bindingContext, @NotNull DivSelect divSelect, @Nullable DivSelect divSelect2, @NotNull DivStatePath divStatePath) {
        Div2View divView = bindingContext.getDivView();
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        divSelectView.setTextAlignment(5);
        divSelectView.setFocusTracker(divView.getInputFocusTracker());
        applyOptions(divSelectView, divSelect, bindingContext);
        observeVariable(divSelectView, divSelect, bindingContext, divStatePath);
        observeBaseTextProperties(divSelectView, divSelect, divSelect2, expressionResolver);
        observeHintText(divSelectView, divSelect, expressionResolver);
        observeHintColor(divSelectView, divSelect, expressionResolver);
    }

    private final void applyOptions(final DivSelectView divSelectView, final DivSelect divSelect, final BindingContext bindingContext) {
        final Function2 createAnimatedTouchListener = BaseDivViewExtensionsKt.createAnimatedTouchListener(divSelectView, bindingContext, UtilsKt.getDEFAULT_CLICK_ANIMATION(), null);
        divSelectView.setOnTouchListener(createAnimatedTouchListener != null ? new View.OnTouchListener() { // from class: com.yandex.div.core.view2.divs.DivSelectBinder$$ExternalSyntheticLambda0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean applyOptions$lambda$0;
                applyOptions$lambda$0 = DivSelectBinder.applyOptions$lambda$0(Function2.this, view, motionEvent);
                return applyOptions$lambda$0;
            }
        } : null);
        final List<String> createObservedItemList = createObservedItemList(divSelectView, divSelect, bindingContext.getExpressionResolver());
        divSelectView.setItems(createObservedItemList);
        divSelectView.setOnItemSelectedListener(new Function1() { // from class: com.yandex.div.core.view2.divs.DivSelectBinder$applyOptions$1
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
                DivSelectView.this.setText(createObservedItemList.get(i));
                Function1 valueUpdater = DivSelectView.this.getValueUpdater();
                if (valueUpdater != null) {
                    valueUpdater.invoke(((DivSelect.Option) divSelect.options.get(i)).value.evaluate(bindingContext.getExpressionResolver()));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean applyOptions$lambda$0(Function2 function2, View view, MotionEvent motionEvent) {
        return ((Boolean) function2.invoke(view, motionEvent)).booleanValue();
    }

    private final List<String> createObservedItemList(final DivSelectView divSelectView, DivSelect divSelect, ExpressionResolver expressionResolver) {
        final ArrayList arrayList = new ArrayList();
        final int i = 0;
        for (Object obj : divSelect.options) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            DivSelect.Option option = (DivSelect.Option) obj;
            Expression expression = option.text;
            if (expression == null) {
                expression = option.value;
            }
            arrayList.add(expression.evaluate(expressionResolver));
            expression.observe(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivSelectBinder$createObservedItemList$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((String) obj2);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull String str) {
                    arrayList.set(i, str);
                    divSelectView.setItems(arrayList);
                }
            });
            i = i2;
        }
        return arrayList;
    }

    private final void observeVariable(final DivSelectView divSelectView, final DivSelect divSelect, BindingContext bindingContext, DivStatePath divStatePath) {
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        final ErrorCollector orCreate = this.errorCollectors.getOrCreate(bindingContext.getDivView().getDataTag(), bindingContext.getDivView().getDivData());
        divSelectView.addSubscription(this.variableBinder.bindVariable(bindingContext, divSelect.valueVariable, new TwoWayStringVariableBinder.Callbacks() { // from class: com.yandex.div.core.view2.divs.DivSelectBinder$observeVariable$subscription$1
            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void onVariableChanged(@Nullable final String value) {
                CharSequence charSequence;
                Sequence asSequence = CollectionsKt.asSequence(DivSelect.this.options);
                final ExpressionResolver expressionResolver2 = expressionResolver;
                Iterator it = SequencesKt.filter(asSequence, new Function1() { // from class: com.yandex.div.core.view2.divs.DivSelectBinder$observeVariable$subscription$1$onVariableChanged$matchingOptionsSequence$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final Boolean invoke(@NotNull DivSelect.Option option) {
                        return Boolean.valueOf(Intrinsics.areEqual(option.value.evaluate(ExpressionResolver.this), value));
                    }
                }).iterator();
                DivSelectView divSelectView2 = divSelectView;
                if (!it.hasNext()) {
                    orCreate.logWarning(new Throwable("No option found with value = \"" + value + '\"'));
                    charSequence = "";
                } else {
                    DivSelect.Option option = (DivSelect.Option) it.next();
                    if (it.hasNext()) {
                        orCreate.logWarning(new Throwable("Multiple options found with value = \"" + value + "\", selecting first one"));
                    }
                    Expression expression = option.text;
                    if (expression == null) {
                        expression = option.value;
                    }
                    charSequence = (CharSequence) expression.evaluate(expressionResolver);
                }
                divSelectView2.setText(charSequence);
            }

            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void setViewStateChangeListener(@NotNull Function1 valueUpdater) {
                divSelectView.setValueUpdater(valueUpdater);
            }
        }, divStatePath));
    }

    private final void observeBaseTextProperties(DivSelectView divSelectView, DivSelect divSelect, DivSelect divSelect2, ExpressionResolver expressionResolver) {
        TextViewExtensionsKt.observeBaseTextProperties(divSelectView, divSelect.fontSize, divSelect.fontSizeUnit, divSelect.letterSpacing, divSelect.textColor, divSelect.lineHeight, divSelect.fontFamily, divSelect.fontWeight, divSelect.fontWeightValue, divSelect.fontVariationSettings, divSelect2 != null ? divSelect2.fontSize : null, divSelect2 != null ? divSelect2.fontSizeUnit : null, divSelect2 != null ? divSelect2.letterSpacing : null, divSelect2 != null ? divSelect2.textColor : null, divSelect2 != null ? divSelect2.lineHeight : null, divSelect2 != null ? divSelect2.fontFamily : null, divSelect2 != null ? divSelect2.fontWeight : null, divSelect2 != null ? divSelect2.fontWeightValue : null, divSelect2 != null ? divSelect2.fontVariationSettings : null, divSelect2, this.typefaceResolver, expressionResolver);
    }

    private final void observeHintText(final DivSelectView divSelectView, DivSelect divSelect, ExpressionResolver expressionResolver) {
        Expression expression = divSelect.hintText;
        if (expression == null) {
            return;
        }
        divSelectView.addSubscription(expression.observeAndGet(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivSelectBinder$observeHintText$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull String str) {
                DivSelectView.this.setHint(str);
            }
        }));
    }

    private final void observeHintColor(final DivSelectView divSelectView, DivSelect divSelect, ExpressionResolver expressionResolver) {
        divSelectView.addSubscription(divSelect.hintColor.observeAndGet(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivSelectBinder$observeHintColor$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) {
                DivSelectView.this.setHintTextColor(i);
            }
        }));
    }
}
