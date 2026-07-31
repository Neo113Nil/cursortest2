package com.yandex.div.core.expression.variables;

import com.yandex.div.data.Variable;
import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VariableSource.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u001c\u0010\n\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u000bH&J\u001c\u0010\f\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u000bH&J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u001c\u0010\u000e\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u000bH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/expression/variables/VariableSource;", "", "getMutableVariable", "Lcom/yandex/div/data/Variable;", "name", "", "observeDeclaration", "", "observer", "Lcom/yandex/div/core/expression/variables/DeclarationObserver;", "observeVariables", "Lkotlin/Function1;", "receiveVariablesUpdates", "removeDeclarationObserver", "removeVariablesObserver", "Companion", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface VariableSource {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Nullable
    Variable getMutableVariable(@NotNull String name);

    void observeDeclaration(@NotNull DeclarationObserver observer);

    void observeVariables(@NotNull Function1 observer);

    void receiveVariablesUpdates(@NotNull Function1 observer);

    void removeDeclarationObserver(@NotNull DeclarationObserver observer);

    void removeVariablesObserver(@NotNull Function1 observer);

    /* compiled from: VariableSource.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/yandex/div/core/expression/variables/VariableSource$Companion;", "", "<init>", "()V", "", "", "Lcom/yandex/div/data/Variable;", "variables", "Lkotlin/Function1;", "", "requestObserver", "", "Lcom/yandex/div/core/expression/variables/DeclarationObserver;", "declarationObservers", "Lcom/yandex/div/core/expression/variables/VariableSource;", "invoke", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;Ljava/util/Collection;)Lcom/yandex/div/core/expression/variables/VariableSource;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final VariableSource invoke(@NotNull Map<String, ? extends Variable> variables, @NotNull Function1 requestObserver, @NotNull Collection<DeclarationObserver> declarationObservers) {
            return new SingleVariableSource(variables, requestObserver, declarationObservers);
        }
    }
}
