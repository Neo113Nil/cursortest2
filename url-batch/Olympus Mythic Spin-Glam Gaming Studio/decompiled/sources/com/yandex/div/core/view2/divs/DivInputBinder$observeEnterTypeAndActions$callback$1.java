package com.yandex.div.core.view2.divs;

import android.view.KeyEvent;
import android.widget.TextView;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.widgets.DivInputView;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivInput;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivInputBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
final class DivInputBinder$observeEnterTypeAndActions$callback$1 extends Lambda implements Function1 {
    final /* synthetic */ BindingContext $bindingContext;
    final /* synthetic */ DivInput $div;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ DivInputView $this_observeEnterTypeAndActions;
    final /* synthetic */ DivInputBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivInputBinder$observeEnterTypeAndActions$callback$1(DivInput divInput, ExpressionResolver expressionResolver, DivInputView divInputView, DivInputBinder divInputBinder, BindingContext bindingContext) {
        super(1);
        this.$div = divInput;
        this.$resolver = expressionResolver;
        this.$this_observeEnterTypeAndActions = divInputView;
        this.this$0 = divInputBinder;
        this.$bindingContext = bindingContext;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m7200invoke(obj);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m7200invoke(@NotNull Object obj) {
        int imeAction;
        DivInput.EnterKeyType enterKeyType = (DivInput.EnterKeyType) this.$div.enterKeyType.evaluate(this.$resolver);
        DivInputView divInputView = this.$this_observeEnterTypeAndActions;
        int imeOptions = divInputView.getImeOptions();
        imeAction = this.this$0.getImeAction(enterKeyType);
        divInputView.setImeOptions(imeOptions + imeAction);
        final List list = this.$div.enterKeyActions;
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            final DivInputView divInputView2 = this.$this_observeEnterTypeAndActions;
            final DivInputBinder divInputBinder = this.this$0;
            final BindingContext bindingContext = this.$bindingContext;
            divInputView2.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeEnterTypeAndActions$callback$1$$ExternalSyntheticLambda0
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                    boolean invoke$lambda$0;
                    invoke$lambda$0 = DivInputBinder$observeEnterTypeAndActions$callback$1.invoke$lambda$0(DivInputBinder.this, bindingContext, divInputView2, list, textView, i, keyEvent);
                    return invoke$lambda$0;
                }
            });
            return;
        }
        this.$this_observeEnterTypeAndActions.setOnEditorActionListener(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$0(DivInputBinder divInputBinder, BindingContext bindingContext, DivInputView divInputView, List list, TextView textView, int i, KeyEvent keyEvent) {
        DivActionBinder divActionBinder;
        if ((i & 255) == 0) {
            return false;
        }
        divActionBinder = divInputBinder.actionBinder;
        divActionBinder.handleBulkActions$div_release(bindingContext, divInputView, list, "enter");
        return false;
    }
}
