package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: FunctionValidator.kt */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a,\u0010\u0000\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tH\u0000\u001a\"\u0010\n\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000\u001a\u0014\u0010\u000b\u001a\u00020\t*\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002\u001a\u001a\u0010\u000e\u001a\u00020\f*\u00020\f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¨\u0006\u000f"}, d2 = {"getFunctionArgumentsException", "Ljava/lang/Exception;", "Lkotlin/Exception;", "name", "", "args", "", "Lcom/yandex/div/evaluable/EvaluableType;", "isMethod", "", "getMethodArgumentsException", "conflictsWith", "Lcom/yandex/div/evaluable/Function;", "other", "withArgumentsValidation", "div-evaluable"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FunctionValidatorKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean conflictsWith(Function function, Function function2) {
        if (!Intrinsics.areEqual(function.getName(), function2.getName())) {
            return false;
        }
        List<FunctionArgument> declaredArgs = function.getDeclaredArgs().size() < function2.getDeclaredArgs().size() ? function.getDeclaredArgs() : function2.getDeclaredArgs();
        List<FunctionArgument> declaredArgs2 = Intrinsics.areEqual(declaredArgs, function.getDeclaredArgs()) ? function2.getDeclaredArgs() : function.getDeclaredArgs();
        if (declaredArgs.isEmpty()) {
            FunctionArgument functionArgument = (FunctionArgument) CollectionsKt.firstOrNull((List) declaredArgs2);
            return functionArgument != null && functionArgument.isVariadic();
        }
        int lastIndex = CollectionsKt.getLastIndex(declaredArgs);
        for (int i = 0; i < lastIndex; i++) {
            if (declaredArgs.get(i).getType() != declaredArgs2.get(i).getType()) {
                return false;
            }
        }
        if (((FunctionArgument) CollectionsKt.last((List) declaredArgs)).isVariadic()) {
            EvaluableType type = ((FunctionArgument) CollectionsKt.last((List) declaredArgs)).getType();
            int size = declaredArgs2.size();
            for (int lastIndex2 = CollectionsKt.getLastIndex(declaredArgs); lastIndex2 < size; lastIndex2++) {
                if (declaredArgs2.get(lastIndex2).getType() != type) {
                    return false;
                }
            }
            return true;
        }
        if (declaredArgs.size() == declaredArgs2.size()) {
            return ((FunctionArgument) CollectionsKt.last((List) declaredArgs)).getType() == ((FunctionArgument) CollectionsKt.last((List) declaredArgs2)).getType();
        }
        if (declaredArgs2.size() == declaredArgs.size() + 1) {
            return ((FunctionArgument) CollectionsKt.last((List) declaredArgs2)).isVariadic();
        }
        return false;
    }

    @NotNull
    public static final Function withArgumentsValidation(@NotNull Function function, @NotNull List<? extends EvaluableType> args) {
        Intrinsics.checkNotNullParameter(function, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        Function.MatchResult matchesArguments$div_evaluable = function.matchesArguments$div_evaluable(args);
        if (matchesArguments$div_evaluable instanceof Function.MatchResult.Ok) {
            return function;
        }
        if (matchesArguments$div_evaluable instanceof Function.MatchResult.ArgCountMismatch) {
            StringBuilder sb = new StringBuilder();
            sb.append(function.getHasVarArg$div_evaluable() ? "At least" : "Exactly");
            sb.append(' ');
            sb.append(((Function.MatchResult.ArgCountMismatch) matchesArguments$div_evaluable).getExpected());
            sb.append(" argument(s) expected.");
            throw new EvaluableException(sb.toString(), null, 2, null);
        }
        if (!(matchesArguments$div_evaluable instanceof Function.MatchResult.ArgTypeMismatch)) {
            throw new NoWhenBranchMatchedException();
        }
        if (Intrinsics.areEqual(function.matchesArgumentsWithCast$div_evaluable(args), Function.MatchResult.Ok.INSTANCE)) {
            return function;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Invalid argument type: expected ");
        Function.MatchResult.ArgTypeMismatch argTypeMismatch = (Function.MatchResult.ArgTypeMismatch) matchesArguments$div_evaluable;
        sb2.append(argTypeMismatch.getExpected());
        sb2.append(", got ");
        sb2.append(argTypeMismatch.getActual());
        sb2.append('.');
        throw new EvaluableException(sb2.toString(), null, 2, null);
    }

    public static /* synthetic */ Exception getFunctionArgumentsException$default(String str, List list, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return getFunctionArgumentsException(str, list, z);
    }

    @NotNull
    public static final Exception getFunctionArgumentsException(@NotNull String name, @NotNull List<? extends EvaluableType> args, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(args, "args");
        if (z) {
            return getMethodArgumentsException(name, args);
        }
        if (args.isEmpty()) {
            return new EvaluableException(EvaluableExceptionKt.REASON_EMPTY_ARGUMENT_LIST, null, 2, null);
        }
        return new EvaluableException("Function has no matching overload for given argument types: " + EvaluableExceptionKt.toMessageFormat((List<? extends Object>) args) + '.', null, 2, null);
    }

    @NotNull
    public static final Exception getMethodArgumentsException(@NotNull String name, @NotNull List<? extends EvaluableType> args) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(args, "args");
        if (args.size() == 1) {
            return new EvaluableException("Method requires non empty argument list.", null, 2, null);
        }
        return new EvaluableException("Method has no matching overload for given argument types: " + EvaluableExceptionKt.toMessageFormat((List<? extends Object>) args.subList(1, args.size())) + '.', null, 2, null);
    }
}
