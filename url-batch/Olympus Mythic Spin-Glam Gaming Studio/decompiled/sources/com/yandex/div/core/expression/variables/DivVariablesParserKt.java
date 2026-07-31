package com.yandex.div.core.expression.variables;

import android.net.Uri;
import com.yandex.div.data.Variable;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivVariable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: DivVariablesParser.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"toVariable", "Lcom/yandex/div/data/Variable;", "Lcom/yandex/div2/DivVariable;", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DivVariablesParserKt {
    @NotNull
    public static final Variable toVariable(@NotNull DivVariable divVariable, @NotNull ExpressionResolver expressionResolver) {
        if (divVariable instanceof DivVariable.Bool) {
            DivVariable.Bool bool = (DivVariable.Bool) divVariable;
            return new Variable.BooleanVariable(bool.getValue().name, ((Boolean) bool.getValue().value.evaluate(expressionResolver)).booleanValue());
        }
        if (divVariable instanceof DivVariable.Integer) {
            DivVariable.Integer integer = (DivVariable.Integer) divVariable;
            return new Variable.IntegerVariable(integer.getValue().name, ((Number) integer.getValue().value.evaluate(expressionResolver)).longValue());
        }
        if (divVariable instanceof DivVariable.Number) {
            DivVariable.Number number = (DivVariable.Number) divVariable;
            return new Variable.DoubleVariable(number.getValue().name, ((Number) number.getValue().value.evaluate(expressionResolver)).doubleValue());
        }
        if (divVariable instanceof DivVariable.Str) {
            DivVariable.Str str = (DivVariable.Str) divVariable;
            return new Variable.StringVariable(str.getValue().name, (String) str.getValue().value.evaluate(expressionResolver));
        }
        if (divVariable instanceof DivVariable.Color) {
            DivVariable.Color color = (DivVariable.Color) divVariable;
            return new Variable.ColorVariable(color.getValue().name, ((Number) color.getValue().value.evaluate(expressionResolver)).intValue());
        }
        if (divVariable instanceof DivVariable.Url) {
            DivVariable.Url url = (DivVariable.Url) divVariable;
            return new Variable.UrlVariable(url.getValue().name, (Uri) url.getValue().value.evaluate(expressionResolver));
        }
        if (divVariable instanceof DivVariable.Dict) {
            DivVariable.Dict dict = (DivVariable.Dict) divVariable;
            return new Variable.DictVariable(dict.getValue().name, (JSONObject) dict.getValue().value.evaluate(expressionResolver));
        }
        if (divVariable instanceof DivVariable.Array) {
            DivVariable.Array array = (DivVariable.Array) divVariable;
            return new Variable.ArrayVariable(array.getValue().name, (JSONArray) array.getValue().value.evaluate(expressionResolver));
        }
        if (!(divVariable instanceof DivVariable.Property)) {
            throw new NoWhenBranchMatchedException();
        }
        throw new NotImplementedError("An operation is not implemented: Support property variables");
    }
}
