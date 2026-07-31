package com.yandex.div.core.expression.variables;

import com.yandex.div.internal.parser.ListValidator;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivVariablesParser.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes14.dex */
final class DivVariablesParserKt$sam$com_yandex_div_internal_parser_ListValidator$0 implements ListValidator, FunctionAdapter {
    private final /* synthetic */ Function1 function;

    DivVariablesParserKt$sam$com_yandex_div_internal_parser_ListValidator$0(Function1 function1) {
        this.function = function1;
    }

    public final boolean equals(@Nullable Object obj) {
        if ((obj instanceof ListValidator) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    @NotNull
    public final Function getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // com.yandex.div.internal.parser.ListValidator
    public final /* synthetic */ boolean isValid(List list) {
        return ((Boolean) this.function.invoke(list)).booleanValue();
    }
}
