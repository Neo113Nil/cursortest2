package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.FunctionProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: FunctionRegistry.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J,\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u001e\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013H\u0016J&\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00160\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u001e\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013H\u0016J\u000e\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0007J\u000e\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u0007J\u001e\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00072\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u0013H\u0002R#\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR#\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00048F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR \u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\rX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/yandex/div/evaluable/function/FunctionRegistry;", "Lcom/yandex/div/evaluable/FunctionProvider;", "()V", "exposedFunctions", "", "", "", "Lcom/yandex/div/evaluable/Function;", "getExposedFunctions", "()Ljava/util/Map;", "exposedMethods", "getExposedMethods", "knownFunctions", "", "knownMethods", "ensureRegistered", "", "name", "args", "", "Lcom/yandex/div/evaluable/FunctionArgument;", "resultType", "Lcom/yandex/div/evaluable/EvaluableType;", "isMethod", "", "get", "getMethod", "register", "function", "registerMethod", "method", "validateFunction", "overloadedFunctions", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FunctionRegistry implements FunctionProvider {

    @NotNull
    private final Map<String, List<Function>> knownFunctions = new LinkedHashMap();

    @NotNull
    private final Map<String, List<Function>> knownMethods = new LinkedHashMap();

    @NotNull
    public final Map<String, List<Function>> getExposedFunctions() {
        return this.knownFunctions;
    }

    @NotNull
    public final Map<String, List<Function>> getExposedMethods() {
        return this.knownMethods;
    }

    public final void register(@NotNull Function function) {
        Intrinsics.checkNotNullParameter(function, "function");
        Map<String, List<Function>> map = this.knownFunctions;
        String name = function.getName();
        List<Function> list = map.get(name);
        if (list == null) {
            list = new ArrayList<>();
            map.put(name, list);
        }
        List<Function> list2 = list;
        if (list2.contains(function)) {
            return;
        }
        list2.add(validateFunction(function, list2));
    }

    public final void registerMethod(@NotNull Function method) {
        Intrinsics.checkNotNullParameter(method, "method");
        Map<String, List<Function>> map = this.knownMethods;
        String name = method.getName();
        List<Function> list = map.get(name);
        if (list == null) {
            list = new ArrayList<>();
            map.put(name, list);
        }
        List<Function> list2 = list;
        if (list2.contains(method)) {
            return;
        }
        list2.add(validateFunction(method, list2));
    }

    private final Function validateFunction(Function function, List<? extends Function> overloadedFunctions) {
        FunctionValidator functionValidator = FunctionValidator.INSTANCE;
        return functionValidator.validateOverloading(functionValidator.validateFunction(function), overloadedFunctions);
    }

    @Override // com.yandex.div.evaluable.FunctionProvider
    @NotNull
    public Function get(@NotNull String name, @NotNull List<? extends EvaluableType> args) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(args, "args");
        return get(name, args, false);
    }

    @Override // com.yandex.div.evaluable.FunctionProvider
    @NotNull
    public Function getMethod(@NotNull String name, @NotNull List<? extends EvaluableType> args) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(args, "args");
        return get(name, args, true);
    }

    public final void ensureRegistered(@NotNull String name, @NotNull List<FunctionArgument> args, @NotNull EvaluableType resultType, boolean isMethod) {
        List<Function> list;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(resultType, "resultType");
        if (isMethod) {
            List<Function> list2 = this.knownMethods.get(name);
            if (list2 == null) {
                throw new EvaluableException("Unknown method name: '" + name + "'.", null, 2, null);
            }
            list = list2;
        } else {
            List<Function> list3 = this.knownFunctions.get(name);
            if (list3 == null) {
                throw new EvaluableException("Unknown function name: '" + name + "'.", null, 2, null);
            }
            list = list3;
        }
        List<Function> list4 = list;
        boolean z = list4 instanceof Collection;
        if (!z || !list4.isEmpty()) {
            Iterator<T> it = list4.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((Function) it.next()).getDeclaredArgs(), args)) {
                    if (!z || !list4.isEmpty()) {
                        Iterator<T> it2 = list4.iterator();
                        while (it2.hasNext()) {
                            if (((Function) it2.next()).getResultType() == resultType) {
                                return;
                            }
                        }
                    }
                    throw new EvaluableException("Function with specified result type is not registered.", null, 2, null);
                }
            }
        }
        throw new EvaluableException("Function with declared args is not registered.", null, 2, null);
    }

    private final Function get(String name, List<? extends EvaluableType> args, boolean isMethod) {
        List<Function> list;
        Object obj;
        Object obj2 = null;
        if (isMethod) {
            List<Function> list2 = this.knownMethods.get(name);
            if (list2 == null) {
                throw new EvaluableException("Unknown method name: " + name + '.', null, 2, null);
            }
            list = list2;
        } else {
            List<Function> list3 = this.knownFunctions.get(name);
            if (list3 == null) {
                throw new EvaluableException("Unknown function name: " + name + '.', null, 2, null);
            }
            list = list3;
        }
        if (list.size() == 1) {
            return FunctionValidatorKt.withArgumentsValidation((Function) CollectionsKt.first((List) list), args);
        }
        List<Function> list4 = list;
        Iterator<T> it = list4.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((Function) obj).matchesArguments$div_evaluable(args), Function.MatchResult.Ok.INSTANCE)) {
                break;
            }
        }
        Function function = (Function) obj;
        if (function != null) {
            return function;
        }
        Iterator<T> it2 = list4.iterator();
        boolean z = false;
        Object obj3 = null;
        while (true) {
            if (it2.hasNext()) {
                Object next = it2.next();
                if (Intrinsics.areEqual(((Function) next).matchesArgumentsWithCast$div_evaluable(args), Function.MatchResult.Ok.INSTANCE)) {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj3 = next;
                }
            } else if (z) {
                obj2 = obj3;
            }
        }
        Function function2 = (Function) obj2;
        if (function2 != null) {
            return function2;
        }
        throw FunctionValidatorKt.getFunctionArgumentsException(name, args, isMethod);
    }
}
