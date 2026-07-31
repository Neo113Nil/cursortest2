package com.yandex.div.core.actions;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.core.content.ContextCompat;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.widgets.DivInputView;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivTypedValue;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivActionTypedUtils.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0005\u001a=\u0010\u000b\u001a\u00020\u0003*\u00020\u00002(\u0010\n\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\b\u0012\u0004\u0012\u00020\u00030\u0007j\u0002`\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u0011\u001a\u00020\u0010*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u0016*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001d\u0010\u001a\u001a\u0004\u0018\u00010\u0019*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0013\u0010\u001d\u001a\u00020\u0003*\u00020\u001cH\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0013\u0010 \u001a\u00020\u0003*\u00020\u001fH\u0000¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/yandex/div/core/view2/Div2View;", "", "throwable", "", "logError", "(Lcom/yandex/div/core/view2/Div2View;Ljava/lang/Throwable;)V", "logWarning", "Lkotlin/Function2;", "", "Lcom/yandex/div/core/view2/errors/ErrorObserver;", "observer", "observeErrors", "(Lcom/yandex/div/core/view2/Div2View;Lkotlin/jvm/functions/Function2;)V", "Lcom/yandex/div2/DivTypedValue;", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "expressionResolver", "", "evaluate", "(Lcom/yandex/div2/DivTypedValue;Lcom/yandex/div/json/expressions/ExpressionResolver;)Ljava/lang/Object;", "", "longValue", "(Lcom/yandex/div2/DivTypedValue;Lcom/yandex/div/json/expressions/ExpressionResolver;)Ljava/lang/Long;", "", "doubleValue", "(Lcom/yandex/div2/DivTypedValue;Lcom/yandex/div/json/expressions/ExpressionResolver;)Ljava/lang/Double;", "", "colorIntValue", "(Lcom/yandex/div2/DivTypedValue;Lcom/yandex/div/json/expressions/ExpressionResolver;)Ljava/lang/Integer;", "Lcom/yandex/div/core/view2/divs/widgets/DivInputView;", "openKeyboard", "(Lcom/yandex/div/core/view2/divs/widgets/DivInputView;)V", "Landroid/view/View;", "closeKeyboard", "(Landroid/view/View;)V", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DivActionTypedUtilsKt {
    public static final void logError(@NotNull Div2View div2View, @NotNull Throwable th) {
        div2View.getViewComponent().getErrorCollectors().getOrCreate(div2View.getDataTag(), div2View.getDivData()).logError(th);
    }

    public static final void logWarning(@NotNull Div2View div2View, @NotNull Throwable th) {
        div2View.getViewComponent().getErrorCollectors().getOrCreate(div2View.getDataTag(), div2View.getDivData()).logWarning(th);
    }

    public static final void observeErrors(@NotNull Div2View div2View, @NotNull Function2 function2) {
        div2View.getViewComponent().getErrorCollectors().getOrCreate(div2View.getDataTag(), div2View.getDivData()).observeAndGet(function2);
    }

    @NotNull
    public static final Object evaluate(@NotNull DivTypedValue divTypedValue, @NotNull ExpressionResolver expressionResolver) {
        if (divTypedValue instanceof DivTypedValue.Integer) {
            return ((DivTypedValue.Integer) divTypedValue).getValue().value.evaluate(expressionResolver);
        }
        if (divTypedValue instanceof DivTypedValue.Str) {
            return ((DivTypedValue.Str) divTypedValue).getValue().value.evaluate(expressionResolver);
        }
        if (divTypedValue instanceof DivTypedValue.Bool) {
            return ((DivTypedValue.Bool) divTypedValue).getValue().value.evaluate(expressionResolver);
        }
        if (divTypedValue instanceof DivTypedValue.Color) {
            return ((DivTypedValue.Color) divTypedValue).getValue().value.evaluate(expressionResolver);
        }
        if (divTypedValue instanceof DivTypedValue.Number) {
            return ((DivTypedValue.Number) divTypedValue).getValue().value.evaluate(expressionResolver);
        }
        if (divTypedValue instanceof DivTypedValue.Url) {
            return ((DivTypedValue.Url) divTypedValue).getValue().value.evaluate(expressionResolver);
        }
        if (divTypedValue instanceof DivTypedValue.Array) {
            return ((DivTypedValue.Array) divTypedValue).getValue().value.evaluate(expressionResolver);
        }
        if (divTypedValue instanceof DivTypedValue.Dict) {
            return ((DivTypedValue.Dict) divTypedValue).getValue().value.evaluate(expressionResolver);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Nullable
    public static final Long longValue(@NotNull DivTypedValue divTypedValue, @NotNull ExpressionResolver expressionResolver) {
        if (divTypedValue instanceof DivTypedValue.Integer) {
            return (Long) ((DivTypedValue.Integer) divTypedValue).getValue().value.evaluate(expressionResolver);
        }
        return null;
    }

    @Nullable
    public static final Double doubleValue(@NotNull DivTypedValue divTypedValue, @NotNull ExpressionResolver expressionResolver) {
        if (divTypedValue instanceof DivTypedValue.Integer) {
            return Double.valueOf(((Number) ((DivTypedValue.Integer) divTypedValue).getValue().value.evaluate(expressionResolver)).longValue());
        }
        if (divTypedValue instanceof DivTypedValue.Number) {
            return (Double) ((DivTypedValue.Number) divTypedValue).getValue().value.evaluate(expressionResolver);
        }
        return null;
    }

    @Nullable
    public static final Integer colorIntValue(@NotNull DivTypedValue divTypedValue, @NotNull ExpressionResolver expressionResolver) {
        if (divTypedValue instanceof DivTypedValue.Color) {
            return (Integer) ((DivTypedValue.Color) divTypedValue).getValue().value.evaluate(expressionResolver);
        }
        return null;
    }

    public static final void openKeyboard(@NotNull DivInputView divInputView) {
        InputMethodManager inputMethodManager = (InputMethodManager) ContextCompat.getSystemService(divInputView.getContext(), InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(divInputView, 1);
        }
    }

    public static final void closeKeyboard(@NotNull View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) ContextCompat.getSystemService(view.getContext(), InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 2);
        }
    }
}
