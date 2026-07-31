package com.yandex.div.core.expression;

import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.ObserverList;
import com.yandex.div.core.expression.local.RuntimeStore;
import com.yandex.div.core.expression.variables.ConstantsProvider;
import com.yandex.div.core.expression.variables.VariableAndConstantController;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.data.Variable;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Evaluator;
import com.yandex.div.evaluable.MissingVariableException;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.json.ParsingExceptionReason;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: ExpressionResolverImpl.kt */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rJ\u0085\u0001\u0010&\u001a\u0002H'\"\u0004\b\u0000\u0010(\"\b\b\u0001\u0010'*\u00020\u00102\u0006\u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020,2*\u0010-\u001a&\u0012\u0004\u0012\u0002H(\u0012\u0006\u0012\u0004\u0018\u0001H'\u0018\u00010.j\u0012\u0012\u0004\u0012\u0002H(\u0012\u0006\u0012\u0004\u0018\u0001H'\u0018\u0001`/2\f\u00100\u001a\b\u0012\u0004\u0012\u0002H'012\f\u00102\u001a\b\u0012\u0004\u0012\u0002H'032\u0006\u00104\u001a\u000205H\u0016¢\u0006\u0002\u00106J'\u00107\u001a\u0002H(\"\b\b\u0000\u0010(*\u00020\u00102\u0006\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020,H\u0002¢\u0006\u0002\u00108J\u0010\u00109\u001a\u00020\u00162\u0006\u0010:\u001a\u00020;H\u0016Jm\u0010<\u001a\u0004\u0018\u0001H'\"\u0004\b\u0000\u0010(\"\u0004\b\u0001\u0010'2\u0006\u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u00032*\u0010-\u001a&\u0012\u0004\u0012\u0002H(\u0012\u0006\u0012\u0004\u0018\u0001H'\u0018\u00010.j\u0012\u0012\u0004\u0012\u0002H(\u0012\u0006\u0012\u0004\u0018\u0001H'\u0018\u0001`/2\u0006\u0010=\u001a\u0002H(2\f\u00102\u001a\b\u0012\u0004\u0012\u0002H'03H\u0002¢\u0006\u0002\u0010>J9\u0010?\u001a\u00020\u0016\"\u0004\b\u0000\u0010'2\u0006\u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u00032\f\u00100\u001a\b\u0012\u0004\u0012\u0002H'012\u0006\u0010@\u001a\u0002H'H\u0002¢\u0006\u0002\u0010AJ\r\u0010B\u001a\u00020\u0016H\u0000¢\u0006\u0002\bCJ,\u0010D\u001a\u00020E2\u0006\u0010*\u001a\u00020\u00032\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00030G2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016J\u0012\u0010I\u001a\u0004\u0018\u00010\u00032\u0006\u0010:\u001a\u00020JH\u0002J\u0081\u0001\u0010K\u001a\u0002H'\"\b\b\u0000\u0010(*\u00020\u0010\"\b\b\u0001\u0010'*\u00020\u00102\u0006\u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020,2*\u0010-\u001a&\u0012\u0004\u0012\u0002H(\u0012\u0006\u0012\u0004\u0018\u0001H'\u0018\u00010.j\u0012\u0012\u0004\u0012\u0002H(\u0012\u0006\u0012\u0004\u0018\u0001H'\u0018\u0001`/2\f\u00100\u001a\b\u0012\u0004\u0012\u0002H'012\f\u00102\u001a\b\u0012\u0004\u0012\u0002H'03H\u0002¢\u0006\u0002\u0010LJ\u0018\u0010M\u001a\u0004\u0018\u00010N2\u0006\u0010O\u001a\u00020\u00102\u0006\u0010P\u001a\u00020QJ\u001d\u0010R\u001a\u00020\u00002\u0006\u0010S\u001a\u00020\u00032\u0006\u0010T\u001a\u00020UH\u0000¢\u0006\u0002\bVR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R&\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00140\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R \u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030#0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u0006W"}, d2 = {"Lcom/yandex/div/core/expression/ExpressionResolverImpl;", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "path", "", "runtimeStore", "Lcom/yandex/div/core/expression/local/RuntimeStore;", "variableController", "Lcom/yandex/div/core/expression/variables/VariableController;", "evaluator", "Lcom/yandex/div/evaluable/Evaluator;", "errorCollector", "Lcom/yandex/div/core/view2/errors/ErrorCollector;", "itemBuilderData", "(Ljava/lang/String;Lcom/yandex/div/core/expression/local/RuntimeStore;Lcom/yandex/div/core/expression/variables/VariableController;Lcom/yandex/div/evaluable/Evaluator;Lcom/yandex/div/core/view2/errors/ErrorCollector;Ljava/lang/String;)V", "evaluationsCache", "", "", "getEvaluator", "()Lcom/yandex/div/evaluable/Evaluator;", "expressionObservers", "Lcom/yandex/div/core/ObserverList;", "Lkotlin/Function0;", "", "getItemBuilderData", "()Ljava/lang/String;", "getPath", "getRuntimeStore", "()Lcom/yandex/div/core/expression/local/RuntimeStore;", "suppressMissingVariableException", "", "getSuppressMissingVariableException", "()Z", "setSuppressMissingVariableException", "(Z)V", "varToExpressions", "", "getVariableController", "()Lcom/yandex/div/core/expression/variables/VariableController;", "get", "T", "R", "expressionKey", "rawExpression", "evaluable", "Lcom/yandex/div/evaluable/Evaluable;", "converter", "Lkotlin/Function1;", "Lcom/yandex/div/internal/parser/Converter;", "validator", "Lcom/yandex/div/internal/parser/ValueValidator;", "fieldType", "Lcom/yandex/div/internal/parser/TypeHelper;", "logger", "Lcom/yandex/div/json/ParsingErrorLogger;", "(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/div/evaluable/Evaluable;Lkotlin/jvm/functions/Function1;Lcom/yandex/div/internal/parser/ValueValidator;Lcom/yandex/div/internal/parser/TypeHelper;Lcom/yandex/div/json/ParsingErrorLogger;)Ljava/lang/Object;", "getEvaluationResult", "(Ljava/lang/String;Lcom/yandex/div/evaluable/Evaluable;)Ljava/lang/Object;", "notifyResolveFailed", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Lcom/yandex/div/json/ParsingException;", "safeConvert", "rawValue", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lcom/yandex/div/internal/parser/TypeHelper;)Ljava/lang/Object;", "safeValidate", "convertedValue", "(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/div/internal/parser/ValueValidator;Ljava/lang/Object;)V", "subscribeOnVariables", "subscribeOnVariables$div_release", "subscribeToExpression", "Lcom/yandex/div/core/Disposable;", "variableNames", "", "callback", "tryGetMissingVariableName", "Lcom/yandex/div/evaluable/EvaluableException;", "tryResolve", "(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/div/evaluable/Evaluable;Lkotlin/jvm/functions/Function1;Lcom/yandex/div/internal/parser/ValueValidator;Lcom/yandex/div/internal/parser/TypeHelper;)Ljava/lang/Object;", "validateItemBuilderDataElement", "Lorg/json/JSONObject;", "element", "index", "", "withConstants", "pathSegment", "constants", "Lcom/yandex/div/core/expression/variables/ConstantsProvider;", "withConstants$div_release", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ExpressionResolverImpl implements ExpressionResolver {

    @NotNull
    private final ErrorCollector errorCollector;

    @NotNull
    private final Map<String, Object> evaluationsCache;

    @NotNull
    private final Evaluator evaluator;

    @NotNull
    private final Map<String, ObserverList<Function0>> expressionObservers;

    @Nullable
    private final String itemBuilderData;

    @NotNull
    private final String path;

    @NotNull
    private final RuntimeStore runtimeStore;
    private boolean suppressMissingVariableException;

    @NotNull
    private final Map<String, Set<String>> varToExpressions;

    @NotNull
    private final VariableController variableController;

    public ExpressionResolverImpl(@NotNull String str, @NotNull RuntimeStore runtimeStore, @NotNull VariableController variableController, @NotNull Evaluator evaluator, @NotNull ErrorCollector errorCollector, @Nullable String str2) {
        this.path = str;
        this.runtimeStore = runtimeStore;
        this.variableController = variableController;
        this.evaluator = evaluator;
        this.errorCollector = errorCollector;
        this.itemBuilderData = str2;
        this.evaluationsCache = new LinkedHashMap();
        this.varToExpressions = new LinkedHashMap();
        this.expressionObservers = new LinkedHashMap();
    }

    public /* synthetic */ ExpressionResolverImpl(String str, RuntimeStore runtimeStore, VariableController variableController, Evaluator evaluator, ErrorCollector errorCollector, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, runtimeStore, variableController, evaluator, errorCollector, (i & 32) != 0 ? null : str2);
    }

    @NotNull
    public final String getPath() {
        return this.path;
    }

    @NotNull
    public final RuntimeStore getRuntimeStore() {
        return this.runtimeStore;
    }

    @NotNull
    public final VariableController getVariableController() {
        return this.variableController;
    }

    @NotNull
    public final Evaluator getEvaluator() {
        return this.evaluator;
    }

    @Nullable
    public final String getItemBuilderData() {
        return this.itemBuilderData;
    }

    public final boolean getSuppressMissingVariableException() {
        return this.suppressMissingVariableException;
    }

    public final void setSuppressMissingVariableException(boolean z) {
        this.suppressMissingVariableException = z;
    }

    @Override // com.yandex.div.json.expressions.ExpressionResolver
    @NotNull
    public <R, T> T get(@NotNull String expressionKey, @NotNull String rawExpression, @NotNull Evaluable evaluable, @Nullable Function1 converter, @NotNull ValueValidator<T> validator, @NotNull TypeHelper<T> fieldType, @NotNull ParsingErrorLogger logger) {
        try {
            return (T) tryResolve(expressionKey, rawExpression, evaluable, converter, validator, fieldType);
        } catch (ParsingException e) {
            if (e.getReason() == ParsingExceptionReason.MISSING_VARIABLE) {
                if (this.suppressMissingVariableException) {
                    throw ParsingExceptionKt.getSILENT_PARSING_EXCEPTION();
                }
                throw e;
            }
            logger.logError(e);
            this.errorCollector.logError(e);
            return (T) tryResolve(expressionKey, rawExpression, evaluable, converter, validator, fieldType);
        }
    }

    private final <R, T> T tryResolve(String expressionKey, String rawExpression, Evaluable evaluable, Function1 converter, ValueValidator<T> validator, TypeHelper<T> fieldType) {
        try {
            T t = (T) getEvaluationResult(rawExpression, evaluable);
            if (fieldType.isTypeValid(t)) {
                Intrinsics.checkNotNull(t, "null cannot be cast to non-null type T of com.yandex.div.core.expression.ExpressionResolverImpl.tryResolve");
            } else {
                Object safeConvert = safeConvert(expressionKey, rawExpression, converter, t, fieldType);
                if (safeConvert == null) {
                    throw ParsingExceptionKt.invalidValue(expressionKey, rawExpression, t);
                }
                t = (T) safeConvert;
            }
            safeValidate(expressionKey, rawExpression, validator, t);
            return t;
        } catch (EvaluableException e) {
            String tryGetMissingVariableName = tryGetMissingVariableName(e);
            if (tryGetMissingVariableName != null) {
                throw ParsingExceptionKt.missingVariable(expressionKey, rawExpression, tryGetMissingVariableName, e);
            }
            throw ParsingExceptionKt.resolveFailed(expressionKey, rawExpression, e);
        }
    }

    private final <R> R getEvaluationResult(String rawExpression, Evaluable evaluable) {
        R r = (R) this.evaluationsCache.get(rawExpression);
        if (r == null) {
            r = (R) this.evaluator.eval(evaluable);
            if (evaluable.getIsCacheable()) {
                for (String str : evaluable.getVariables()) {
                    Map<String, Set<String>> map = this.varToExpressions;
                    Set<String> set = map.get(str);
                    if (set == null) {
                        set = new LinkedHashSet<>();
                        map.put(str, set);
                    }
                    set.add(rawExpression);
                }
                this.evaluationsCache.put(rawExpression, r);
            }
        }
        return r;
    }

    private final String tryGetMissingVariableName(EvaluableException e) {
        if (e instanceof MissingVariableException) {
            return ((MissingVariableException) e).getVariableName();
        }
        return null;
    }

    private final <R, T> T safeConvert(String expressionKey, String rawExpression, Function1 converter, R rawValue, TypeHelper<T> fieldType) {
        if (converter != null) {
            try {
                rawValue = (T) converter.invoke(rawValue);
            } catch (ClassCastException e) {
                throw ParsingExceptionKt.typeMismatch(expressionKey, rawExpression, rawValue, e);
            } catch (Exception e2) {
                throw ParsingExceptionKt.invalidValue(expressionKey, rawExpression, rawValue, e2);
            }
        } else if (rawValue == null) {
            rawValue = (T) null;
        }
        return safeConvert$fieldAwaitsStringButValueNotConverted(fieldType, rawValue) ? (T) String.valueOf(rawValue) : (T) rawValue;
    }

    private static final <T> boolean safeConvert$fieldAwaitsStringButValueNotConverted(TypeHelper<T> typeHelper, T t) {
        return (t == null || !(typeHelper.getTypeDefault() instanceof String) || typeHelper.isTypeValid(t)) ? false : true;
    }

    private final <T> void safeValidate(String expressionKey, String rawExpression, ValueValidator<T> validator, T convertedValue) {
        try {
            if (validator.isValid(convertedValue)) {
            } else {
                throw ParsingExceptionKt.invalidValue(rawExpression, convertedValue);
            }
        } catch (ClassCastException e) {
            throw ParsingExceptionKt.typeMismatch(expressionKey, rawExpression, convertedValue, e);
        }
    }

    @Override // com.yandex.div.json.expressions.ExpressionResolver
    public void notifyResolveFailed(@NotNull ParsingException e) {
        this.errorCollector.logError(e);
    }

    @Override // com.yandex.div.json.expressions.ExpressionResolver
    @NotNull
    public Disposable subscribeToExpression(@NotNull final String rawExpression, @NotNull List<String> variableNames, @NotNull final Function0 callback) {
        for (String str : variableNames) {
            Map<String, Set<String>> map = this.varToExpressions;
            Set<String> set = map.get(str);
            if (set == null) {
                set = new LinkedHashSet<>();
                map.put(str, set);
            }
            set.add(rawExpression);
        }
        Map<String, ObserverList<Function0>> map2 = this.expressionObservers;
        ObserverList<Function0> observerList = map2.get(rawExpression);
        if (observerList == null) {
            observerList = new ObserverList<>();
            map2.put(rawExpression, observerList);
        }
        observerList.addObserver(callback);
        return new Disposable() { // from class: com.yandex.div.core.expression.ExpressionResolverImpl$$ExternalSyntheticLambda0
            @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
            public final void close() {
                ExpressionResolverImpl.subscribeToExpression$lambda$7(ExpressionResolverImpl.this, rawExpression, callback);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribeToExpression$lambda$7(ExpressionResolverImpl expressionResolverImpl, String str, Function0 function0) {
        ObserverList<Function0> observerList = expressionResolverImpl.expressionObservers.get(str);
        if (observerList != null) {
            observerList.removeObserver(function0);
        }
    }

    public final void subscribeOnVariables$div_release() {
        this.variableController.setOnAnyVariableChangeCallback(this, new Function1() { // from class: com.yandex.div.core.expression.ExpressionResolverImpl$subscribeOnVariables$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Variable) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Variable variable) {
                Map map;
                Map map2;
                Map map3;
                map = ExpressionResolverImpl.this.varToExpressions;
                Set set = (Set) map.get(variable.getName());
                List<String> list = set != null ? CollectionsKt.toList(set) : null;
                if (list != null) {
                    ExpressionResolverImpl expressionResolverImpl = ExpressionResolverImpl.this;
                    for (String str : list) {
                        map3 = expressionResolverImpl.evaluationsCache;
                        map3.remove(str);
                    }
                }
                if (list != null) {
                    ExpressionResolverImpl expressionResolverImpl2 = ExpressionResolverImpl.this;
                    for (String str2 : list) {
                        map2 = expressionResolverImpl2.expressionObservers;
                        ObserverList observerList = (ObserverList) map2.get(str2);
                        if (observerList != null) {
                            Iterator<E> it = observerList.iterator();
                            while (it.hasNext()) {
                                ((Function0) it.next()).mo4828invoke();
                            }
                        }
                    }
                }
            }
        });
        this.variableController.restoreSubscriptions();
    }

    @NotNull
    public final ExpressionResolverImpl withConstants$div_release(@NotNull String pathSegment, @NotNull ConstantsProvider constants) {
        VariableAndConstantController variableAndConstantController = new VariableAndConstantController(this.variableController, constants);
        return new ExpressionResolverImpl(this.path + '/' + pathSegment, this.runtimeStore, variableAndConstantController, new Evaluator(new EvaluationContext(variableAndConstantController, this.evaluator.getEvaluationContext().getStoredValueProvider(), this.evaluator.getEvaluationContext().getFunctionProvider(), this.evaluator.getEvaluationContext().getWarningSender())), this.errorCollector, pathSegment);
    }

    @Nullable
    public final JSONObject validateItemBuilderDataElement(@NotNull Object element, int index) {
        JSONObject jSONObject = element instanceof JSONObject ? (JSONObject) element : null;
        if (jSONObject != null) {
            return jSONObject;
        }
        this.errorCollector.logError(ParsingExceptionKt.typeMismatch(index, element));
        return null;
    }
}
