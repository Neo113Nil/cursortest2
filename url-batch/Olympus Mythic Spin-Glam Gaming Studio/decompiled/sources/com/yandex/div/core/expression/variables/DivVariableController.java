package com.yandex.div.core.expression.variables;

import android.os.Handler;
import android.os.Looper;
import com.yandex.div.data.Variable;
import com.yandex.div.data.VariableDeclarationException;
import com.yandex.div.data.VariableMutationException;
import com.yandex.div.internal.Assert;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivVariableController.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0000¢\u0006\u0002\u0010\u0003J\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u001dJ!\u0010\u001e\u001a\u00020\f2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\f0\u000bH\u0000¢\u0006\u0002\b\u001fJ\u001e\u0010 \u001a\u00020\f2\u0016\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000bj\u0002`\rJ\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001a0\"J\u001f\u0010#\u001a\u00020\f2\u0012\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001a0$\"\u00020\u001a¢\u0006\u0002\u0010%J\u0010\u0010&\u001a\u0004\u0018\u00010\u001a2\u0006\u0010'\u001a\u00020\tJ\u000e\u0010(\u001a\u00020)2\u0006\u0010'\u001a\u00020\tJ\u0010\u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020\tH\u0002J\u001f\u0010+\u001a\u00020\f2\u0012\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001a0$\"\u00020\u001a¢\u0006\u0002\u0010%J!\u0010,\u001a\u00020\f2\u0012\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001a0$\"\u00020\u001aH\u0002¢\u0006\u0002\u0010%J!\u0010-\u001a\u00020\f2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\f0\u000bH\u0000¢\u0006\u0002\b.J\u001f\u0010/\u001a\u00020\f2\u0012\u00100\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0$\"\u00020\t¢\u0006\u0002\u00101J\u0015\u00102\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0006H\u0000¢\u0006\u0002\b3J!\u00104\u001a\u00020\f2\u0012\u00105\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0$\"\u00020\tH\u0002¢\u0006\u0002\u00101J\u001e\u00106\u001a\u00020\f2\u0016\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000bj\u0002`\rJ!\u00107\u001a\u00020\f2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\f0\u000bH\u0000¢\u0006\u0002\b8J\u001f\u00109\u001a\u00020\f2\u0012\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001a0$\"\u00020\u001a¢\u0006\u0002\u0010%J!\u0010:\u001a\u00020\f2\u0012\u0010;\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001a0$\"\u00020\u001aH\u0002¢\u0006\u0002\u0010%R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000bj\u0002`\r0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u0015X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lcom/yandex/div/core/expression/variables/DivVariableController;", "", "internalVariableController", "(Lcom/yandex/div/core/expression/variables/DivVariableController;)V", "declarationObservers", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Lcom/yandex/div/core/expression/variables/DeclarationObserver;", "declaredVariableNames", "", "", "externalVariableRequestObservers", "Lkotlin/Function1;", "", "Lcom/yandex/div/core/expression/variables/VariableRequestObserver;", "mainHandler", "Landroid/os/Handler;", "pendingDeclaration", "requestsObserver", "undeclaredVariables", "", "variableSource", "Lcom/yandex/div/core/expression/variables/MultiVariableSource;", "getVariableSource$div_release", "()Lcom/yandex/div/core/expression/variables/MultiVariableSource;", "variables", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/yandex/div/data/Variable;", "addDeclarationObserver", "observer", "addDeclarationObserver$div_release", "addVariableObserver", "addVariableObserver$div_release", "addVariableRequestObserver", "captureAllVariables", "", "declare", "", "([Lcom/yandex/div/data/Variable;)V", "get", "variableName", "isDeclared", "", "isDeclaredLocal", "putOrUpdate", "putOrUpdateInternal", "receiveVariablesUpdates", "receiveVariablesUpdates$div_release", "removeAll", "variablesNames", "([Ljava/lang/String;)V", "removeDeclarationObserver", "removeDeclarationObserver$div_release", "removeVariableInternal", "names", "removeVariableRequestObserver", "removeVariablesObserver", "removeVariablesObserver$div_release", "replaceAll", "replaceAllInternal", "newVariables", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DivVariableController {

    @NotNull
    private final ConcurrentLinkedQueue<DeclarationObserver> declarationObservers;

    @NotNull
    private final Set<String> declaredVariableNames;

    @NotNull
    private final ConcurrentLinkedQueue<Function1> externalVariableRequestObservers;

    @Nullable
    private final DivVariableController internalVariableController;

    @NotNull
    private final Handler mainHandler;

    @NotNull
    private final Set<String> pendingDeclaration;

    @NotNull
    private final Function1 requestsObserver;

    @NotNull
    private final Map<String, String> undeclaredVariables;

    @NotNull
    private final MultiVariableSource variableSource;

    @NotNull
    private final ConcurrentHashMap<String, Variable> variables;

    /* JADX WARN: Multi-variable type inference failed */
    public DivVariableController() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public DivVariableController(@Nullable DivVariableController divVariableController) {
        this.internalVariableController = divVariableController;
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.variables = new ConcurrentHashMap<>();
        this.declarationObservers = new ConcurrentLinkedQueue<>();
        this.undeclaredVariables = new LinkedHashMap();
        this.declaredVariableNames = new LinkedHashSet();
        this.pendingDeclaration = new LinkedHashSet();
        this.externalVariableRequestObservers = new ConcurrentLinkedQueue<>();
        Function1 function1 = new Function1() { // from class: com.yandex.div.core.expression.variables.DivVariableController$requestsObserver$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull String str) {
                ConcurrentLinkedQueue concurrentLinkedQueue;
                concurrentLinkedQueue = DivVariableController.this.externalVariableRequestObservers;
                Iterator it = concurrentLinkedQueue.iterator();
                while (it.hasNext()) {
                    ((Function1) it.next()).invoke(str);
                }
            }
        };
        this.requestsObserver = function1;
        this.variableSource = new MultiVariableSource(this, function1);
    }

    public /* synthetic */ DivVariableController(DivVariableController divVariableController, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : divVariableController);
    }

    @NotNull
    /* renamed from: getVariableSource$div_release, reason: from getter */
    public final MultiVariableSource getVariableSource() {
        return this.variableSource;
    }

    public final void declare(@NotNull final Variable... variables) throws VariableDeclarationException {
        int i;
        synchronized (this.declaredVariableNames) {
            try {
                ArrayList arrayList = new ArrayList();
                for (Variable variable : variables) {
                    i = (this.declaredVariableNames.contains(variable.getName()) || this.pendingDeclaration.contains(variable.getName())) ? 0 : i + 1;
                    arrayList.add(variable);
                }
                if (!arrayList.isEmpty()) {
                    throw new VariableDeclarationException(StringsKt.trimIndent("\n                        Wanted to declare new variable(s) '" + arrayList + "',\n                        but variable(s) with such name(s) already exists!\n                    "), null, 2, null);
                }
                Set<String> set = this.pendingDeclaration;
                ArrayList arrayList2 = new ArrayList(variables.length);
                for (Variable variable2 : variables) {
                    arrayList2.add(variable2.getName());
                }
                set.addAll(arrayList2);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!Intrinsics.areEqual(this.mainHandler.getLooper(), Looper.myLooper())) {
            this.mainHandler.post(new Runnable() { // from class: com.yandex.div.core.expression.variables.DivVariableController$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    DivVariableController.declare$lambda$3(DivVariableController.this, variables);
                }
            });
        } else {
            putOrUpdateInternal((Variable[]) Arrays.copyOf(variables, variables.length));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void declare$lambda$3(DivVariableController divVariableController, Variable[] variableArr) {
        divVariableController.putOrUpdateInternal((Variable[]) Arrays.copyOf(variableArr, variableArr.length));
    }

    @Nullable
    public final Variable get(@NotNull String variableName) {
        if (isDeclaredLocal(variableName)) {
            return this.variables.get(variableName);
        }
        DivVariableController divVariableController = this.internalVariableController;
        if (divVariableController != null) {
            return divVariableController.get(variableName);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0014, code lost:
    
        if (r1.isDeclared(r5) == true) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isDeclared(@NotNull String variableName) {
        boolean z;
        synchronized (this.declaredVariableNames) {
            z = true;
            if (!isDeclaredLocal(variableName)) {
                DivVariableController divVariableController = this.internalVariableController;
                if (divVariableController != null) {
                }
                z = false;
            }
        }
        return z;
    }

    public final void putOrUpdate(@NotNull final Variable... variables) throws VariableMutationException {
        if (!Intrinsics.areEqual(this.mainHandler.getLooper(), Looper.myLooper())) {
            this.mainHandler.post(new Runnable() { // from class: com.yandex.div.core.expression.variables.DivVariableController$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    DivVariableController.putOrUpdate$lambda$5(DivVariableController.this, variables);
                }
            });
        } else {
            putOrUpdateInternal((Variable[]) Arrays.copyOf(variables, variables.length));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void putOrUpdate$lambda$5(DivVariableController divVariableController, Variable[] variableArr) {
        divVariableController.putOrUpdateInternal((Variable[]) Arrays.copyOf(variableArr, variableArr.length));
    }

    public final void replaceAll(@NotNull final Variable... variables) throws VariableMutationException {
        if (!Intrinsics.areEqual(this.mainHandler.getLooper(), Looper.myLooper())) {
            this.mainHandler.post(new Runnable() { // from class: com.yandex.div.core.expression.variables.DivVariableController$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    DivVariableController.replaceAll$lambda$6(DivVariableController.this, variables);
                }
            });
        } else {
            replaceAllInternal((Variable[]) Arrays.copyOf(variables, variables.length));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void replaceAll$lambda$6(DivVariableController divVariableController, Variable[] variableArr) {
        divVariableController.replaceAllInternal((Variable[]) Arrays.copyOf(variableArr, variableArr.length));
    }

    public final void removeAll(@NotNull final String... variablesNames) {
        if (!Intrinsics.areEqual(this.mainHandler.getLooper(), Looper.myLooper())) {
            this.mainHandler.post(new Runnable() { // from class: com.yandex.div.core.expression.variables.DivVariableController$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    DivVariableController.removeAll$lambda$7(DivVariableController.this, variablesNames);
                }
            });
        } else {
            removeVariableInternal((String[]) Arrays.copyOf(variablesNames, variablesNames.length));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeAll$lambda$7(DivVariableController divVariableController, String[] strArr) {
        divVariableController.removeVariableInternal((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    private final void putOrUpdateInternal(Variable... variables) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.declaredVariableNames) {
            try {
                for (Variable variable : variables) {
                    String str = this.undeclaredVariables.get(variable.getName());
                    if (str != null && !Intrinsics.areEqual(str, variable.getClass().getName())) {
                        throw new VariableMutationException("Cannot declare new variable with type = " + variable.getClass().getName() + ", because this variable have been declared with another type = " + str, null, 2, null);
                    }
                    if (!this.declaredVariableNames.contains(variable.getName())) {
                        this.declaredVariableNames.add(variable.getName());
                        this.pendingDeclaration.remove(variable.getName());
                        arrayList.add(variable);
                    }
                    final Variable variable2 = this.variables.get(variable.getName());
                    if (variable2 != null) {
                        variable2.setValue(variable);
                        variable.addObserver(new Function1() { // from class: com.yandex.div.core.expression.variables.DivVariableController$putOrUpdateInternal$1$1$1$1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Variable) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull Variable variable3) {
                                Variable.this.setValue(variable3);
                            }
                        });
                    } else {
                        Variable put = this.variables.put(variable.getName(), variable);
                        if (put != null) {
                            Assert.fail(StringsKt.trimIndent("\n                    Wanted to put new variable '" + variable + "', but variable with such name\n                    already exists '" + put + "'! Is there a race?\n                "));
                        }
                        this.undeclaredVariables.remove(variable.getName());
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        for (DeclarationObserver declarationObserver : this.declarationObservers) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                declarationObserver.onDeclared((Variable) it.next());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void removeVariableInternal(String... names) {
        ConcurrentHashMap<String, Variable> concurrentHashMap = this.variables;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Variable> entry : concurrentHashMap.entrySet()) {
            if (ArraysKt.contains(names, entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        synchronized (this.declaredVariableNames) {
            try {
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    this.declaredVariableNames.remove(entry2.getKey());
                    this.undeclaredVariables.put(entry2.getKey(), entry2.getValue().getClass().getName());
                    this.variables.remove(entry2.getKey());
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        for (DeclarationObserver declarationObserver : this.declarationObservers) {
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                declarationObserver.onUndeclared((Variable) ((Map.Entry) it.next()).getValue());
            }
        }
    }

    private final void replaceAllInternal(Variable... newVariables) {
        ConcurrentHashMap<String, Variable> concurrentHashMap = this.variables;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Variable> entry : concurrentHashMap.entrySet()) {
            int length = newVariables.length;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (Intrinsics.areEqual(entry.getKey(), newVariables[i].getName())) {
                    z = true;
                    break;
                }
                i++;
            }
            if (!z) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Collection<?> values = linkedHashMap.values();
        List mutableList = ArraysKt.toMutableList(newVariables);
        mutableList.removeAll(values);
        Collection<?> collection = values;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((Variable) it.next()).getName());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            removeVariableInternal((String) it2.next());
        }
        Iterator it3 = mutableList.iterator();
        while (it3.hasNext()) {
            putOrUpdateInternal((Variable) it3.next());
        }
    }

    private final boolean isDeclaredLocal(String variableName) {
        boolean contains;
        synchronized (this.declaredVariableNames) {
            contains = this.declaredVariableNames.contains(variableName);
        }
        return contains;
    }

    public final void addVariableRequestObserver(@NotNull Function1 observer) {
        this.externalVariableRequestObservers.add(observer);
        DivVariableController divVariableController = this.internalVariableController;
        if (divVariableController != null) {
            divVariableController.addVariableRequestObserver(observer);
        }
    }

    public final void removeVariableRequestObserver(@NotNull Function1 observer) {
        this.externalVariableRequestObservers.remove(observer);
        DivVariableController divVariableController = this.internalVariableController;
        if (divVariableController != null) {
            divVariableController.removeVariableRequestObserver(observer);
        }
    }

    @NotNull
    public final List<Variable> captureAllVariables() {
        List<Variable> emptyList;
        Collection<Variable> values = this.variables.values();
        DivVariableController divVariableController = this.internalVariableController;
        if (divVariableController == null || (emptyList = divVariableController.captureAllVariables()) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        return CollectionsKt.plus((Collection) values, (Iterable) emptyList);
    }

    public final void addDeclarationObserver$div_release(@NotNull DeclarationObserver observer) {
        this.declarationObservers.add(observer);
        DivVariableController divVariableController = this.internalVariableController;
        if (divVariableController != null) {
            divVariableController.addDeclarationObserver$div_release(observer);
        }
    }

    public final void removeDeclarationObserver$div_release(@NotNull DeclarationObserver observer) {
        this.declarationObservers.remove(observer);
        DivVariableController divVariableController = this.internalVariableController;
        if (divVariableController != null) {
            divVariableController.removeDeclarationObserver$div_release(observer);
        }
    }

    public final void addVariableObserver$div_release(@NotNull Function1 observer) {
        Iterator<T> it = this.variables.values().iterator();
        while (it.hasNext()) {
            ((Variable) it.next()).addObserver(observer);
        }
        DivVariableController divVariableController = this.internalVariableController;
        if (divVariableController != null) {
            divVariableController.addVariableObserver$div_release(observer);
        }
    }

    public final void removeVariablesObserver$div_release(@NotNull Function1 observer) {
        Iterator<T> it = this.variables.values().iterator();
        while (it.hasNext()) {
            ((Variable) it.next()).removeObserver(observer);
        }
        DivVariableController divVariableController = this.internalVariableController;
        if (divVariableController != null) {
            divVariableController.removeVariablesObserver$div_release(observer);
        }
    }

    public final void receiveVariablesUpdates$div_release(@NotNull Function1 observer) {
        Iterator<T> it = this.variables.values().iterator();
        while (it.hasNext()) {
            observer.invoke((Variable) it.next());
        }
        DivVariableController divVariableController = this.internalVariableController;
        if (divVariableController != null) {
            divVariableController.receiveVariablesUpdates$div_release(observer);
        }
    }
}
