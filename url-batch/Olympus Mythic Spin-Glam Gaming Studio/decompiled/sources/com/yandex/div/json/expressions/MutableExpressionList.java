package com.yandex.div.json.expressions;

import com.yandex.div.core.CompositeDisposable;
import com.yandex.div.core.Disposable;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ExpressionList.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B7\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0019\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0007H\u0001¢\u0006\u0002\b\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J*\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u00142\u0018\u0010\u001b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00020\u001d0\u001cH\u0016J*\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u00142\u0018\u0010\u001b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00020\u001d0\u001cH\u0016J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/yandex/div/json/expressions/MutableExpressionList;", "T", "", "Lcom/yandex/div/json/expressions/ExpressionList;", "key", "", "expressions", "", "Lcom/yandex/div/json/expressions/Expression;", "listValidator", "Lcom/yandex/div/internal/parser/ListValidator;", "logger", "Lcom/yandex/div/json/ParsingErrorLogger;", "(Ljava/lang/String;Ljava/util/List;Lcom/yandex/div/internal/parser/ListValidator;Lcom/yandex/div/json/ParsingErrorLogger;)V", "lastValidValuesList", "equals", "", "other", "evaluate", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "getExpressions", "getExpressionsInternal", "hashCode", "", "observe", "Lcom/yandex/div/core/Disposable;", "callback", "Lkotlin/Function1;", "", "observeAndGet", "tryResolve", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MutableExpressionList<T> implements ExpressionList<T> {

    @NotNull
    private final List<Expression<T>> expressions;

    @NotNull
    private final String key;

    @Nullable
    private List<? extends T> lastValidValuesList;

    @NotNull
    private final ListValidator<T> listValidator;

    @NotNull
    private final ParsingErrorLogger logger;

    /* JADX WARN: Multi-variable type inference failed */
    public MutableExpressionList(@NotNull String str, @NotNull List<? extends Expression<T>> list, @NotNull ListValidator<T> listValidator, @NotNull ParsingErrorLogger parsingErrorLogger) {
        this.key = str;
        this.expressions = list;
        this.listValidator = listValidator;
        this.logger = parsingErrorLogger;
    }

    @Override // com.yandex.div.json.expressions.ExpressionList
    @NotNull
    public List<T> evaluate(@NotNull ExpressionResolver resolver) {
        try {
            List<T> tryResolve = tryResolve(resolver);
            this.lastValidValuesList = tryResolve;
            return tryResolve;
        } catch (ParsingException e) {
            this.logger.logError(e);
            List<? extends T> list = this.lastValidValuesList;
            if (list != null) {
                return list;
            }
            throw e;
        }
    }

    private final List<T> tryResolve(ExpressionResolver resolver) {
        List<Expression<T>> list = this.expressions;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Expression) it.next()).evaluate(resolver));
        }
        if (this.listValidator.isValid(arrayList)) {
            return arrayList;
        }
        throw ParsingExceptionKt.invalidValue(this.key, arrayList);
    }

    @Override // com.yandex.div.json.expressions.ExpressionList
    @NotNull
    public Disposable observe(@NotNull final ExpressionResolver resolver, @NotNull final Function1 callback) {
        Function1 function1 = new Function1() { // from class: com.yandex.div.json.expressions.MutableExpressionList$observe$itemCallback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7355invoke((MutableExpressionList$observe$itemCallback$1) obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7355invoke(@NotNull T t) {
                Function1.this.invoke(this.evaluate(resolver));
            }
        };
        if (this.expressions.size() == 1) {
            return ((Expression) CollectionsKt.first((List) this.expressions)).observe(resolver, function1);
        }
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        Iterator<T> it = this.expressions.iterator();
        while (it.hasNext()) {
            compositeDisposable.add(((Expression) it.next()).observe(resolver, function1));
        }
        return compositeDisposable;
    }

    @Override // com.yandex.div.json.expressions.ExpressionList
    @NotNull
    public Disposable observeAndGet(@NotNull ExpressionResolver resolver, @NotNull Function1 callback) {
        List<T> list;
        Disposable observe = observe(resolver, callback);
        try {
            list = evaluate(resolver);
        } catch (ParsingException e) {
            this.logger.logError(e);
            list = null;
        }
        if (list != null) {
            callback.invoke(list);
        }
        return observe;
    }

    public int hashCode() {
        return this.expressions.hashCode() * 16;
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof MutableExpressionList) && Intrinsics.areEqual(this.expressions, ((MutableExpressionList) other).expressions);
    }

    @NotNull
    public final List<Expression<T>> getExpressionsInternal() {
        return this.expressions;
    }
}
