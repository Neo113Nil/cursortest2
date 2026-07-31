package com.yandex.div.core.view2.errors;

import com.yandex.div.data.Variable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;

/* compiled from: VariableMonitorView.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0006\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007*<\b\u0002\u0010\n\"\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\b2\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\b¨\u0006\u000b"}, d2 = {"Lcom/yandex/div/data/Variable;", "", "path", "Lcom/yandex/div/core/view2/errors/VariableModel;", "toModel", "(Lcom/yandex/div/data/Variable;Ljava/lang/String;)Lcom/yandex/div/core/view2/errors/VariableModel;", "getType", "(Lcom/yandex/div/data/Variable;)Ljava/lang/String;", "Lkotlin/Function3;", "", "VariableMutator", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class VariableMonitorViewKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final VariableModel toModel(Variable variable, String str) {
        return new VariableModel(variable.getName(), str, getType(variable), variable.getValue().toString());
    }

    private static final String getType(Variable variable) {
        if (variable instanceof Variable.ArrayVariable) {
            return "array";
        }
        if (variable instanceof Variable.BooleanVariable) {
            return "boolean";
        }
        if (variable instanceof Variable.ColorVariable) {
            return "color";
        }
        if (variable instanceof Variable.DictVariable) {
            return "dict";
        }
        if (variable instanceof Variable.DoubleVariable) {
            return "number";
        }
        if (variable instanceof Variable.IntegerVariable) {
            return "integer";
        }
        if (variable instanceof Variable.StringVariable) {
            return "string";
        }
        if (variable instanceof Variable.UrlVariable) {
            return "url";
        }
        if (!(variable instanceof Variable.PropertyVariable)) {
            throw new NoWhenBranchMatchedException();
        }
        throw new NotImplementedError("An operation is not implemented: Support property variables");
    }
}
