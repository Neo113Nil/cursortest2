package com.yandex.div.core.view2.divs;

import android.text.Editable;
import com.yandex.div.core.expression.local.UtilsKt;
import com.yandex.div.core.expression.variables.TwoWayStringVariableBinder;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.core.util.inputfilter.InputFiltersHolder;
import com.yandex.div.core.util.mask.BaseInputMask;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.widgets.DivInputView;
import com.yandex.div.data.Variable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivInputBinder.kt */
@Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005*\u0001\u0000\b\u001a\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0012J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\bH\u0012J\u001c\u0010\f\u001a\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0016¨\u0006\r"}, d2 = {"com/yandex/div/core/view2/divs/DivInputBinder$createCallbacks$1", "Lcom/yandex/div/core/expression/variables/TwoWayStringVariableBinder$Callbacks;", "applyMaskOrFilters", "", "editable", "Landroid/text/Editable;", "valueUpdater", "Lkotlin/Function1;", "", "onVariableChanged", "value", "setSecondVariable", "setViewStateChangeListener", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public class DivInputBinder$createCallbacks$1 implements TwoWayStringVariableBinder.Callbacks {
    final /* synthetic */ BindingContext $bindingContext;
    final /* synthetic */ InputFiltersHolder $filters;
    final /* synthetic */ BaseInputMask $inputMask;
    final /* synthetic */ String $secondaryVariable;
    final /* synthetic */ DivInputView $this_createCallbacks;

    DivInputBinder$createCallbacks$1(BaseInputMask baseInputMask, InputFiltersHolder inputFiltersHolder, DivInputView divInputView, BindingContext bindingContext, String str) {
        this.$inputMask = baseInputMask;
        this.$filters = inputFiltersHolder;
        this.$this_createCallbacks = divInputView;
        this.$bindingContext = bindingContext;
        this.$secondaryVariable = str;
    }

    @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
    public void onVariableChanged(@Nullable String value) {
        if (value == null) {
            value = "";
        }
        BaseInputMask baseInputMask = this.$inputMask;
        if (baseInputMask != null) {
            DivInputView divInputView = this.$this_createCallbacks;
            baseInputMask.overrideRawValue(value);
            setSecondVariable(baseInputMask.getValue());
            divInputView.setText(baseInputMask.getValue());
            return;
        }
        InputFiltersHolder inputFiltersHolder = this.$filters;
        if (inputFiltersHolder != null) {
            if (!inputFiltersHolder.checkValue(value)) {
                return;
            }
            inputFiltersHolder.setCurrentValue(value);
            inputFiltersHolder.setCursorPosition(value.length());
        }
        Editable text = this.$this_createCallbacks.getText();
        if (Intrinsics.areEqual(text != null ? text.toString() : null, value)) {
            return;
        }
        this.$this_createCallbacks.setText(value);
    }

    @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
    public void setViewStateChangeListener(@NotNull final Function1 valueUpdater) {
        this.$this_createCallbacks.addAfterTextChangeAction(new Function1() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$createCallbacks$1$setViewStateChangeListener$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Editable) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Editable editable) {
                DivInputBinder$createCallbacks$1.this.applyMaskOrFilters(editable, valueUpdater);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyMaskOrFilters(Editable editable, Function1 valueUpdater) {
        String str;
        String obj;
        String str2 = "";
        if (editable == null || (str = editable.toString()) == null) {
            str = "";
        }
        BaseInputMask baseInputMask = this.$inputMask;
        if (baseInputMask != null) {
            DivInputView divInputView = this.$this_createCallbacks;
            if (!Intrinsics.areEqual(baseInputMask.getValue(), str)) {
                Editable text = divInputView.getText();
                if (text != null && (obj = text.toString()) != null) {
                    str2 = obj;
                }
                baseInputMask.applyChangeFrom(str2, Integer.valueOf(divInputView.getSelectionStart()));
                divInputView.setText(baseInputMask.getValue());
                divInputView.setSelection(baseInputMask.getCursorPosition());
                setSecondVariable(baseInputMask.getValue());
            }
            valueUpdater.invoke(StringsKt.replace$default(baseInputMask.getRawValue(), ',', '.', false, 4, (Object) null));
            return;
        }
        InputFiltersHolder inputFiltersHolder = this.$filters;
        if (inputFiltersHolder != null) {
            DivInputView divInputView2 = this.$this_createCallbacks;
            if (Intrinsics.areEqual(inputFiltersHolder.getCurrentValue(), str)) {
                return;
            }
            if (!inputFiltersHolder.checkValue(str)) {
                divInputView2.setText(inputFiltersHolder.getCurrentValue());
                divInputView2.setSelection(inputFiltersHolder.getCursorPosition());
                return;
            } else {
                inputFiltersHolder.setCurrentValue(str);
                inputFiltersHolder.setCursorPosition(divInputView2.getSelectionStart());
            }
        }
        valueUpdater.invoke(str);
    }

    private void setSecondVariable(String value) {
        VariableController variableController = UtilsKt.getVariableController(this.$bindingContext.getExpressionResolver());
        String str = this.$secondaryVariable;
        if (str != null) {
            Variable mutableVariable = variableController != null ? variableController.getMutableVariable(str) : null;
            if (mutableVariable != null) {
                mutableVariable.set(value);
            }
        }
    }
}
