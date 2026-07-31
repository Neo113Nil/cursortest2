package com.yandex.div.core.expression.local;

import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.expression.ExpressionsRuntime;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivBase;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RuntimeStore.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000 $2\u00020\u0001:\u0001$J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J \u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H&J&\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0015H&J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0017\u001a\u00020\u0011H&J\u0014\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00030\u0019H&J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J4\u0010\u001b\u001a\u0004\u0018\u00010\u00032\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J,\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\"H&J\b\u0010#\u001a\u00020\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006%À\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/expression/local/RuntimeStore;", "", "rootRuntime", "Lcom/yandex/div/core/expression/ExpressionsRuntime;", "getRootRuntime", "()Lcom/yandex/div/core/expression/ExpressionsRuntime;", "cleanupRuntimes", "", "divView", "Lcom/yandex/div/core/DivViewFacade;", "clearBindings", "getOrCreateRuntime", "path", "Lcom/yandex/div/core/state/DivStatePath;", "div", "Lcom/yandex/div2/Div;", "parentResolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "getOrPutItemBuilderResolver", "", "createResolver", "Lkotlin/Function0;", "getRuntimeWithOrNull", "resolver", "getUniquePathsAndRuntimes", "", "onDetachedFromWindow", "resolveRuntimeWith", "showWarningIfNeeded", "child", "Lcom/yandex/div2/DivBase;", "traverseFrom", "runtime", "callback", "Lkotlin/Function1;", "updateSubscriptions", "Companion", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface RuntimeStore {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    void cleanupRuntimes(@NotNull DivViewFacade divView);

    void clearBindings(@NotNull DivViewFacade divView);

    @NotNull
    ExpressionsRuntime getOrCreateRuntime(@NotNull DivStatePath path, @NotNull Div div, @NotNull ExpressionResolver parentResolver);

    @NotNull
    ExpressionResolver getOrPutItemBuilderResolver(@NotNull String path, @NotNull ExpressionResolver parentResolver, @NotNull Function0 createResolver);

    @NotNull
    ExpressionsRuntime getRootRuntime();

    @Nullable
    ExpressionsRuntime getRuntimeWithOrNull(@NotNull ExpressionResolver resolver);

    @NotNull
    Map<String, ExpressionsRuntime> getUniquePathsAndRuntimes();

    void onDetachedFromWindow(@NotNull DivViewFacade divView);

    @Nullable
    ExpressionsRuntime resolveRuntimeWith(@Nullable DivViewFacade divView, @NotNull DivStatePath path, @NotNull Div div, @NotNull ExpressionResolver resolver, @NotNull ExpressionResolver parentResolver);

    default void showWarningIfNeeded(@NotNull DivBase child) {
    }

    void traverseFrom(@NotNull ExpressionsRuntime runtime, @NotNull DivStatePath path, @NotNull Function1 callback);

    void updateSubscriptions();

    /* compiled from: RuntimeStore.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/core/expression/local/RuntimeStore$Companion;", "", "()V", "EMPTY", "Lcom/yandex/div/core/expression/local/RuntimeStore;", "getEMPTY", "()Lcom/yandex/div/core/expression/local/RuntimeStore;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final RuntimeStore EMPTY = new RuntimeStore() { // from class: com.yandex.div.core.expression.local.RuntimeStore$Companion$EMPTY$1
            @Override // com.yandex.div.core.expression.local.RuntimeStore
            public void cleanupRuntimes(@NotNull DivViewFacade divView) {
            }

            @Override // com.yandex.div.core.expression.local.RuntimeStore
            public void clearBindings(@NotNull DivViewFacade divView) {
            }

            @Override // com.yandex.div.core.expression.local.RuntimeStore
            public void onDetachedFromWindow(@NotNull DivViewFacade divView) {
            }

            @Override // com.yandex.div.core.expression.local.RuntimeStore
            public void traverseFrom(@NotNull ExpressionsRuntime runtime, @NotNull DivStatePath path, @NotNull Function1 callback) {
            }

            @Override // com.yandex.div.core.expression.local.RuntimeStore
            public void updateSubscriptions() {
            }

            @Override // com.yandex.div.core.expression.local.RuntimeStore
            public /* bridge */ /* synthetic */ ExpressionsRuntime getOrCreateRuntime(DivStatePath divStatePath, Div div, ExpressionResolver expressionResolver) {
                return (ExpressionsRuntime) m7125getOrCreateRuntime(divStatePath, div, expressionResolver);
            }

            @Override // com.yandex.div.core.expression.local.RuntimeStore
            public /* bridge */ /* synthetic */ ExpressionResolver getOrPutItemBuilderResolver(String str, ExpressionResolver expressionResolver, Function0 function0) {
                return (ExpressionResolver) m7126getOrPutItemBuilderResolver(str, expressionResolver, function0);
            }

            @Override // com.yandex.div.core.expression.local.RuntimeStore
            public /* bridge */ /* synthetic */ ExpressionsRuntime getRuntimeWithOrNull(ExpressionResolver expressionResolver) {
                return (ExpressionsRuntime) m7127getRuntimeWithOrNull(expressionResolver);
            }

            @Override // com.yandex.div.core.expression.local.RuntimeStore
            public /* bridge */ /* synthetic */ ExpressionsRuntime resolveRuntimeWith(DivViewFacade divViewFacade, DivStatePath divStatePath, Div div, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
                return (ExpressionsRuntime) m7128resolveRuntimeWith(divViewFacade, divStatePath, div, expressionResolver, expressionResolver2);
            }

            @Override // com.yandex.div.core.expression.local.RuntimeStore
            @NotNull
            public ExpressionsRuntime getRootRuntime() {
                throwException();
                throw new KotlinNothingValueException();
            }

            @NotNull
            /* renamed from: getOrCreateRuntime, reason: collision with other method in class */
            public Void m7125getOrCreateRuntime(@NotNull DivStatePath path, @NotNull Div div, @NotNull ExpressionResolver parentResolver) {
                throw new IllegalStateException();
            }

            @NotNull
            /* renamed from: getRuntimeWithOrNull, reason: collision with other method in class */
            public Void m7127getRuntimeWithOrNull(@NotNull ExpressionResolver resolver) {
                throwException();
                throw new KotlinNothingValueException();
            }

            @NotNull
            /* renamed from: resolveRuntimeWith, reason: collision with other method in class */
            public Void m7128resolveRuntimeWith(@Nullable DivViewFacade divView, @NotNull DivStatePath path, @NotNull Div div, @NotNull ExpressionResolver resolver, @NotNull ExpressionResolver parentResolver) {
                throwException();
                throw new KotlinNothingValueException();
            }

            @Override // com.yandex.div.core.expression.local.RuntimeStore
            @NotNull
            public Map<String, ExpressionsRuntime> getUniquePathsAndRuntimes() {
                throwException();
                throw new KotlinNothingValueException();
            }

            @NotNull
            /* renamed from: getOrPutItemBuilderResolver, reason: collision with other method in class */
            public Void m7126getOrPutItemBuilderResolver(@NotNull String path, @NotNull ExpressionResolver parentResolver, @NotNull Function0 createResolver) {
                throwException();
                throw new KotlinNothingValueException();
            }

            private final Void throwException() {
                throw new IllegalStateException("Trying to use RuntimeStore before initializing.");
            }
        };

        private Companion() {
        }

        @NotNull
        public final RuntimeStore getEMPTY() {
            return EMPTY;
        }
    }
}
