package com.yandex.div.json.expressions;

import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.yandex.div.core.CompositeDisposable;
import com.yandex.div.core.CompositeDisposableKt;
import com.yandex.div.core.Disposable;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.internal.LiteralsEscaper;
import com.yandex.div.internal.parser.JsonParsers;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Expression.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b&\u0018\u0000 \u0016*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002:\u0004\u0016\u0017\u0018\u0019B\u0005¢\u0006\u0002\u0010\u0003J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\u0015\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\fH&¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J$\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00140\u0013H&J$\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00140\u0013H\u0016R\u0012\u0010\u0004\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001a"}, d2 = {"Lcom/yandex/div/json/expressions/Expression;", "T", "", "()V", "rawValue", "getRawValue", "()Ljava/lang/Object;", "equals", "", "other", "evaluate", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "(Lcom/yandex/div/json/expressions/ExpressionResolver;)Ljava/lang/Object;", "hashCode", "", "observe", "Lcom/yandex/div/core/Disposable;", "callback", "Lkotlin/Function1;", "", "observeAndGet", "Companion", "ConstantExpression", "MutableExpression", "StringConstantExpression", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class Expression<T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final <T> Expression<T> constant(@NotNull T t) {
        return INSTANCE.constant(t);
    }

    @NotNull
    public static final <T> Expression<T> constant(@NotNull T t, @NotNull ParsingErrorLogger parsingErrorLogger) {
        return INSTANCE.constant(t, parsingErrorLogger);
    }

    public static final boolean mayBeExpression(@Nullable Object obj) {
        return INSTANCE.mayBeExpression(obj);
    }

    @NotNull
    public abstract T evaluate(@NotNull ExpressionResolver resolver);

    @NotNull
    public abstract Object getRawValue();

    @NotNull
    public abstract Disposable observe(@NotNull ExpressionResolver resolver, @NotNull Function1 callback);

    @NotNull
    public Disposable observeAndGet(@NotNull ExpressionResolver resolver, @NotNull Function1 callback) {
        T t;
        try {
            t = evaluate(resolver);
        } catch (ParsingException unused) {
            t = null;
        }
        if (t != null) {
            callback.invoke(t);
        }
        return observe(resolver, callback);
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof Expression) {
            return Intrinsics.areEqual(getRawValue(), ((Expression) other).getRawValue());
        }
        return false;
    }

    public int hashCode() {
        return getRawValue().hashCode() * 16;
    }

    /* compiled from: Expression.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0002X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/yandex/div/json/expressions/Expression$StringConstantExpression;", "Lcom/yandex/div/json/expressions/Expression$ConstantExpression;", "", "value", "defaultValue", "logger", "Lcom/yandex/div/json/ParsingErrorLogger;", "(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/div/json/ParsingErrorLogger;)V", "cachedValue", "evaluate", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class StringConstantExpression extends ConstantExpression<String> {

        @Nullable
        private String cachedValue;

        @NotNull
        private final String defaultValue;

        @NotNull
        private final ParsingErrorLogger logger;

        @NotNull
        private final String value;

        public /* synthetic */ StringConstantExpression(String str, String str2, ParsingErrorLogger parsingErrorLogger, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? ParsingErrorLogger.LOG : parsingErrorLogger);
        }

        public StringConstantExpression(@NotNull String str, @NotNull String str2, @NotNull ParsingErrorLogger parsingErrorLogger) {
            super(str);
            this.value = str;
            this.defaultValue = str2;
            this.logger = parsingErrorLogger;
        }

        @Override // com.yandex.div.json.expressions.Expression.ConstantExpression, com.yandex.div.json.expressions.Expression
        @NotNull
        public String evaluate(@NotNull ExpressionResolver resolver) {
            String str = this.cachedValue;
            if (str != null) {
                return str;
            }
            try {
                String process$default = LiteralsEscaper.process$default(LiteralsEscaper.INSTANCE, this.value, null, 2, null);
                this.cachedValue = process$default;
                return process$default;
            } catch (EvaluableException e) {
                this.logger.logError(e);
                String str2 = this.defaultValue;
                this.cachedValue = str2;
                return str2;
            }
        }
    }

    /* compiled from: Expression.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0001¢\u0006\u0002\u0010\u0005J\u0015\u0010\n\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0016¢\u0006\u0002\u0010\rJ$\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J$\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00120\u0011H\u0016R\u0014\u0010\u0006\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\u0004\u001a\u00028\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/yandex/div/json/expressions/Expression$ConstantExpression;", "T", "", "Lcom/yandex/div/json/expressions/Expression;", "value", "(Ljava/lang/Object;)V", "rawValue", "getRawValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "evaluate", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "(Lcom/yandex/div/json/expressions/ExpressionResolver;)Ljava/lang/Object;", "observe", "Lcom/yandex/div/core/Disposable;", "callback", "Lkotlin/Function1;", "", "observeAndGet", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class ConstantExpression<T> extends Expression<T> {

        @NotNull
        private final T value;

        public ConstantExpression(@NotNull T t) {
            this.value = t;
        }

        @Override // com.yandex.div.json.expressions.Expression
        @NotNull
        public Object getRawValue() {
            T t = this.value;
            Intrinsics.checkNotNull(t, "null cannot be cast to non-null type kotlin.Any");
            return t;
        }

        @Override // com.yandex.div.json.expressions.Expression
        @NotNull
        public T evaluate(@NotNull ExpressionResolver resolver) {
            return this.value;
        }

        @Override // com.yandex.div.json.expressions.Expression
        @NotNull
        public Disposable observe(@NotNull ExpressionResolver resolver, @NotNull Function1 callback) {
            return Disposable.NULL;
        }

        @Override // com.yandex.div.json.expressions.Expression
        @NotNull
        public Disposable observeAndGet(@NotNull ExpressionResolver resolver, @NotNull Function1 callback) {
            callback.invoke(this.value);
            return Disposable.NULL;
        }
    }

    /* compiled from: Expression.kt */
    @Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u0001*\b\b\u0002\u0010\u0002*\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00020\u0004Bw\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012*\u0010\b\u001a&\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0002\u0018\u00010\tj\u0012\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0002\u0018\u0001`\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00020\u0010\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0004¢\u0006\u0002\u0010\u0012J\u0015\u0010\u001a\u001a\u00028\u00022\u0006\u0010\u001b\u001a\u00020\u001cH\u0016¢\u0006\u0002\u0010\u001dJ\u0010\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u001fH\u0002J\b\u0010 \u001a\u00020\u0014H\u0002J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u001f2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0018\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\u001f2\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0007J\u0018\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J$\u0010'\u001a\u00020(2\u0006\u0010\u001b\u001a\u00020\u001c2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020$0\tH\u0016J\u0015\u0010*\u001a\u00028\u00022\u0006\u0010\u001b\u001a\u00020\u001cH\u0002¢\u0006\u0002\u0010\u001dJ\u0015\u0010+\u001a\u00028\u00022\u0006\u0010\u001b\u001a\u00020\u001cH\u0002¢\u0006\u0002\u0010\u001dJ\"\u0010'\u001a\u00020(*\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001c2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020$0,H\u0002J(\u0010'\u001a\u00020(*\b\u0012\u0004\u0012\u00020\u00140\u001f2\u0006\u0010\u001b\u001a\u00020\u001c2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020$0,H\u0002J\u0016\u0010-\u001a\u0004\u0018\u00010\u0006*\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R2\u0010\b\u001a&\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0002\u0018\u00010\tj\u0012\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0002\u0018\u0001`\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u0004\u0018\u00018\u0002X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0016R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/yandex/div/json/expressions/Expression$MutableExpression;", "R", "T", "", "Lcom/yandex/div/json/expressions/Expression;", "expressionKey", "", "rawExpression", "converter", "Lkotlin/Function1;", "Lcom/yandex/div/internal/parser/Converter;", "validator", "Lcom/yandex/div/internal/parser/ValueValidator;", "logger", "Lcom/yandex/div/json/ParsingErrorLogger;", "typeHelper", "Lcom/yandex/div/internal/parser/TypeHelper;", "fieldDefaultValue", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lcom/yandex/div/internal/parser/ValueValidator;Lcom/yandex/div/json/ParsingErrorLogger;Lcom/yandex/div/internal/parser/TypeHelper;Lcom/yandex/div/json/expressions/Expression;)V", "evaluable", "Lcom/yandex/div/evaluable/Evaluable;", "lastValidValue", "Ljava/lang/Object;", "rawValue", "getRawValue", "()Ljava/lang/String;", "evaluate", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "(Lcom/yandex/div/json/expressions/ExpressionResolver;)Ljava/lang/Object;", "getDynamicVariables", "", "getEvaluable", "getVariables", "getVariablesName", "logError", "", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Lcom/yandex/div/json/ParsingException;", "observe", "Lcom/yandex/div/core/Disposable;", "callback", "tryResolve", "tryResolveOrUseLast", "Lkotlin/Function0;", "resolveVariableName", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class MutableExpression<R, T> extends Expression<T> {

        @Nullable
        private final Function1 converter;

        @Nullable
        private Evaluable evaluable;

        @NotNull
        private final String expressionKey;

        @Nullable
        private final Expression<T> fieldDefaultValue;

        @Nullable
        private T lastValidValue;

        @NotNull
        private final ParsingErrorLogger logger;

        @NotNull
        private final String rawExpression;

        @NotNull
        private final String rawValue;

        @NotNull
        private final TypeHelper<T> typeHelper;

        @NotNull
        private final ValueValidator<T> validator;

        @NotNull
        public final List<String> getVariablesName() {
            return getVariablesName$default(this, null, 1, null);
        }

        public /* synthetic */ MutableExpression(String str, String str2, Function1 function1, ValueValidator valueValidator, ParsingErrorLogger parsingErrorLogger, TypeHelper typeHelper, Expression expression, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, function1, valueValidator, parsingErrorLogger, typeHelper, (i & 64) != 0 ? null : expression);
        }

        public MutableExpression(@NotNull String str, @NotNull String str2, @Nullable Function1 function1, @NotNull ValueValidator<T> valueValidator, @NotNull ParsingErrorLogger parsingErrorLogger, @NotNull TypeHelper<T> typeHelper, @Nullable Expression<T> expression) {
            this.expressionKey = str;
            this.rawExpression = str2;
            this.converter = function1;
            this.validator = valueValidator;
            this.logger = parsingErrorLogger;
            this.typeHelper = typeHelper;
            this.fieldDefaultValue = expression;
            this.rawValue = str2;
        }

        @Override // com.yandex.div.json.expressions.Expression
        @NotNull
        public String getRawValue() {
            return this.rawValue;
        }

        @Override // com.yandex.div.json.expressions.Expression
        @NotNull
        public T evaluate(@NotNull ExpressionResolver resolver) {
            return tryResolveOrUseLast(resolver);
        }

        @Override // com.yandex.div.json.expressions.Expression
        @NotNull
        public Disposable observe(@NotNull final ExpressionResolver resolver, @NotNull final Function1 callback) {
            List<Evaluable> list;
            List<String> variables = getVariables(resolver);
            List<Evaluable> dynamicVariables = getDynamicVariables();
            if (variables.isEmpty() && ((list = dynamicVariables) == null || list.isEmpty())) {
                return Disposable.NULL;
            }
            final Function0 function0 = new Function0() { // from class: com.yandex.div.json.expressions.Expression$MutableExpression$observe$callbackWithValue$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo4828invoke() {
                    invoke();
                    return Unit.INSTANCE;
                }

                public final void invoke() {
                    Function1.this.invoke(this.evaluate(resolver));
                }
            };
            Disposable subscribeToExpression = resolver.subscribeToExpression(this.rawExpression, variables, function0);
            List<Evaluable> list2 = dynamicVariables;
            if (list2 == null || list2.isEmpty()) {
                return subscribeToExpression;
            }
            final CompositeDisposable compositeDisposable = new CompositeDisposable();
            CompositeDisposableKt.plusAssign(compositeDisposable, subscribeToExpression);
            CompositeDisposableKt.plusAssign(compositeDisposable, observe(dynamicVariables, resolver, function0));
            for (final Evaluable evaluable : dynamicVariables) {
                Function0 function02 = new Function0() { // from class: com.yandex.div.json.expressions.Expression$MutableExpression$observe$1$dynamicVarCallback$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo4828invoke() {
                        invoke();
                        return Unit.INSTANCE;
                    }

                    public final void invoke() {
                        Disposable observe;
                        CompositeDisposable compositeDisposable2 = CompositeDisposable.this;
                        observe = this.observe(evaluable, resolver, function0);
                        CompositeDisposableKt.plusAssign(compositeDisposable2, observe);
                    }
                };
                CompositeDisposableKt.plusAssign(compositeDisposable, resolver.subscribeToExpression(evaluable.toString(), evaluable.getVariables(), function02));
                CompositeDisposableKt.plusAssign(compositeDisposable, observe(evaluable.getDynamicVariables(), resolver, function02));
            }
            return compositeDisposable;
        }

        public static /* synthetic */ List getVariablesName$default(MutableExpression mutableExpression, ExpressionResolver expressionResolver, int i, Object obj) {
            if ((i & 1) != 0) {
                expressionResolver = ExpressionResolver.EMPTY;
            }
            return mutableExpression.getVariablesName(expressionResolver);
        }

        @NotNull
        public final List<String> getVariablesName(@NotNull ExpressionResolver resolver) {
            ArrayList arrayList;
            List<String> variables = getVariables(resolver);
            List<Evaluable> dynamicVariables = getDynamicVariables();
            if (dynamicVariables != null) {
                arrayList = new ArrayList();
                Iterator<T> it = dynamicVariables.iterator();
                while (it.hasNext()) {
                    String resolveVariableName = resolveVariableName((Evaluable) it.next(), resolver);
                    if (resolveVariableName != null) {
                        arrayList.add(resolveVariableName);
                    }
                }
            } else {
                arrayList = null;
            }
            return (arrayList == null || arrayList.isEmpty()) ? variables : CollectionsKt.plus((Collection) variables, (Iterable) arrayList);
        }

        private final List<String> getVariables(ExpressionResolver resolver) {
            try {
                return getEvaluable().getVariables();
            } catch (Exception e) {
                logError(ParsingExceptionKt.resolveFailed(this.expressionKey, this.rawExpression, e), resolver);
                return CollectionsKt.emptyList();
            }
        }

        private final List<Evaluable> getDynamicVariables() {
            Object m8023constructorimpl;
            try {
                Result.Companion companion = Result.INSTANCE;
                Evaluable evaluable = this.evaluable;
                m8023constructorimpl = Result.m8023constructorimpl(evaluable != null ? evaluable.getDynamicVariables() : null);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
            }
            return (List) (Result.m8028isFailureimpl(m8023constructorimpl) ? null : m8023constructorimpl);
        }

        private final T tryResolveOrUseLast(ExpressionResolver resolver) {
            T evaluate;
            try {
                T tryResolve = tryResolve(resolver);
                this.lastValidValue = tryResolve;
                return tryResolve;
            } catch (ParsingException e) {
                String message = e.getMessage();
                if (message != null && message.length() != 0) {
                    logError(e, resolver);
                }
                T t = this.lastValidValue;
                if (t != null) {
                    return t;
                }
                try {
                    Expression<T> expression = this.fieldDefaultValue;
                    if (expression != null && (evaluate = expression.evaluate(resolver)) != null) {
                        this.lastValidValue = evaluate;
                        return evaluate;
                    }
                    return this.typeHelper.getTypeDefault();
                } catch (ParsingException e2) {
                    logError(e2, resolver);
                    throw e2;
                }
            }
        }

        private final void logError(ParsingException e, ExpressionResolver resolver) {
            this.logger.logError(e);
            resolver.notifyResolveFailed(e);
        }

        private final T tryResolve(ExpressionResolver resolver) {
            T t = (T) resolver.get(this.expressionKey, this.rawExpression, getEvaluable(), this.converter, this.validator, this.typeHelper, this.logger);
            if (t == null) {
                throw ParsingExceptionKt.resolveFailed$default(this.expressionKey, this.rawExpression, null, 4, null);
            }
            if (this.typeHelper.isTypeValid(t)) {
                return t;
            }
            throw ParsingExceptionKt.typeMismatch$default(this.expressionKey, this.rawExpression, t, null, 8, null);
        }

        private final Evaluable getEvaluable() {
            Evaluable evaluable = this.evaluable;
            if (evaluable != null) {
                return evaluable;
            }
            try {
                Evaluable lazy = Evaluable.INSTANCE.lazy(this.rawExpression);
                this.evaluable = lazy;
                return lazy;
            } catch (EvaluableException e) {
                throw ParsingExceptionKt.resolveFailed(this.expressionKey, this.rawExpression, e);
            }
        }

        private final Disposable observe(List<? extends Evaluable> list, ExpressionResolver expressionResolver, Function0 function0) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                String resolveVariableName = resolveVariableName((Evaluable) it.next(), expressionResolver);
                if (resolveVariableName != null) {
                    arrayList.add(resolveVariableName);
                }
            }
            return arrayList.isEmpty() ? Disposable.NULL : expressionResolver.subscribeToExpression(this.rawExpression, arrayList, function0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Disposable observe(Evaluable evaluable, ExpressionResolver expressionResolver, Function0 function0) {
            String resolveVariableName = resolveVariableName(evaluable, expressionResolver);
            return resolveVariableName == null ? Disposable.NULL : expressionResolver.subscribeToExpression(this.rawExpression, CollectionsKt.listOf(resolveVariableName), function0);
        }

        private final String resolveVariableName(Evaluable evaluable, ExpressionResolver expressionResolver) {
            return (String) expressionResolver.get(this.expressionKey, evaluable.toString(), evaluable, JsonParsers.doNotConvert(), JsonParsers.alwaysValid(), TypeHelpersKt.TYPE_HELPER_STRING, this.logger);
        }
    }

    /* compiled from: Expression.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J/\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\b\b\u0001\u0010\u0005*\u00020\u00012\u0006\u0010\u0006\u001a\u0002H\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0007¨\u0006\f"}, d2 = {"Lcom/yandex/div/json/expressions/Expression$Companion;", "", "()V", "constant", "Lcom/yandex/div/json/expressions/Expression;", "T", "value", "logger", "Lcom/yandex/div/json/ParsingErrorLogger;", "(Ljava/lang/Object;Lcom/yandex/div/json/ParsingErrorLogger;)Lcom/yandex/div/json/expressions/Expression;", "mayBeExpression", "", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <T> Expression<T> constant(@NotNull T t) {
            return constant$default(this, t, null, 2, null);
        }

        private Companion() {
        }

        public static /* synthetic */ Expression constant$default(Companion companion, Object obj, ParsingErrorLogger parsingErrorLogger, int i, Object obj2) {
            if ((i & 2) != 0) {
                parsingErrorLogger = ParsingErrorLogger.LOG;
            }
            return companion.constant(obj, parsingErrorLogger);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final <T> Expression<T> constant(@NotNull T value, @NotNull ParsingErrorLogger logger) {
            if (value instanceof String) {
                return new StringConstantExpression((String) value, null, logger, 2, null);
            }
            return new ConstantExpression(value);
        }

        public final boolean mayBeExpression(@Nullable Object value) {
            return (value instanceof String) && StringsKt.contains$default((CharSequence) value, (CharSequence) "@{", false, 2, (Object) null);
        }
    }
}
