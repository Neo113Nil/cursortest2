package com.yandex.div.core.expression.variables;

import android.net.Uri;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.data.VariableDeclarationException;
import com.yandex.div.evaluable.types.Url;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivVariable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VariableController.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000\u001a\u0010\u0010\t\u001a\u0004\u0018\u00010\n*\u0004\u0018\u00010\nH\u0000¨\u0006\u000b"}, d2 = {"declare", "", "Lcom/yandex/div/core/expression/variables/VariableController;", "divVariable", "Lcom/yandex/div2/DivVariable;", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "errorCollector", "Lcom/yandex/div/core/view2/errors/ErrorCollector;", "wrapVariableValue", "", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VariableControllerKt {
    @Nullable
    public static final Object wrapVariableValue(@Nullable Object obj) {
        return obj instanceof Uri ? Url.m7336boximpl(Url.m7337constructorimpl(obj.toString())) : obj;
    }

    public static final void declare(@NotNull VariableController variableController, @NotNull DivVariable divVariable, @NotNull ExpressionResolver expressionResolver, @NotNull ErrorCollector errorCollector) {
        try {
            variableController.declare(DivVariablesParserKt.toVariable(divVariable, expressionResolver));
        } catch (VariableDeclarationException e) {
            errorCollector.logError(e);
        }
    }
}
