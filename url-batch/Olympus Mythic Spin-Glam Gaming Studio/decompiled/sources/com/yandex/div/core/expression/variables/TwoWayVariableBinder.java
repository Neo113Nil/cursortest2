package com.yandex.div.core.expression.variables;

import androidx.annotation.MainThread;
import com.yandex.div.DivDataTag;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.expression.local.UtilsKt;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.data.Variable;
import com.yandex.div.internal.core.VariableMutationHandler;
import com.yandex.div2.DivData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TwoWayVariableBinder.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0012B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J.\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0011\u0010\u0010\u001a\u00020\u000b*\u00028\u0000H&¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0092\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/yandex/div/core/expression/variables/TwoWayVariableBinder;", "T", "", "errorCollectors", "Lcom/yandex/div/core/view2/errors/ErrorCollectors;", "(Lcom/yandex/div/core/view2/errors/ErrorCollectors;)V", "bindVariable", "Lcom/yandex/div/core/Disposable;", "bindingContext", "Lcom/yandex/div/core/view2/BindingContext;", "variableName", "", "callbacks", "Lcom/yandex/div/core/expression/variables/TwoWayVariableBinder$Callbacks;", "path", "Lcom/yandex/div/core/state/DivStatePath;", "toStringValue", "(Ljava/lang/Object;)Ljava/lang/String;", "Callbacks", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class TwoWayVariableBinder<T> {

    @NotNull
    private final ErrorCollectors errorCollectors;

    /* compiled from: TwoWayVariableBinder.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\u0017\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00018\u0001H'¢\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00040\tH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/expression/variables/TwoWayVariableBinder$Callbacks;", "T", "", "onVariableChanged", "", "value", "(Ljava/lang/Object;)V", "setViewStateChangeListener", "valueUpdater", "Lkotlin/Function1;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Callbacks<T> {
        @MainThread
        void onVariableChanged(@Nullable T value);

        void setViewStateChangeListener(@NotNull Function1 valueUpdater);
    }

    @NotNull
    public abstract String toStringValue(T t);

    public TwoWayVariableBinder(@NotNull ErrorCollectors errorCollectors) {
        this.errorCollectors = errorCollectors;
    }

    @NotNull
    public Disposable bindVariable(@NotNull final BindingContext bindingContext, @NotNull final String variableName, @NotNull final Callbacks<T> callbacks, @NotNull DivStatePath path) {
        final Div2View divView = bindingContext.getDivView();
        DivData divData = divView.getDivData();
        if (divData == null) {
            return Disposable.NULL;
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        DivDataTag dataTag = divView.getDataTag();
        VariableController variableController = UtilsKt.getVariableController(bindingContext.getExpressionResolver());
        if (variableController == null) {
            return Disposable.NULL;
        }
        callbacks.setViewStateChangeListener(new Function1() { // from class: com.yandex.div.core.expression.variables.TwoWayVariableBinder$bindVariable$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7133invoke((TwoWayVariableBinder$bindVariable$1) obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7133invoke(T t) {
                if (Intrinsics.areEqual(ref$ObjectRef.element, t)) {
                    return;
                }
                ref$ObjectRef.element = t;
                VariableMutationHandler.Companion.setVariable(divView, variableName, this.toStringValue(t), bindingContext.getExpressionResolver());
            }
        });
        return variableController.subscribeToVariableChange(variableName, this.errorCollectors.getOrCreate(dataTag, divData), true, new Function1() { // from class: com.yandex.div.core.expression.variables.TwoWayVariableBinder$bindVariable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Variable) obj);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void invoke(@NotNull Variable variable) {
                Object value = variable.getValue();
                T t = value;
                if (value == null) {
                    t = 0;
                }
                if (Intrinsics.areEqual(ref$ObjectRef.element, t)) {
                    return;
                }
                ref$ObjectRef.element = t;
                callbacks.onVariableChanged(t);
            }
        });
    }
}
