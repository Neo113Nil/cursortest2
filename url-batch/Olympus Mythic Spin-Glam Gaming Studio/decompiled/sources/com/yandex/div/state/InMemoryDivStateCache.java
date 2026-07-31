package com.yandex.div.state;

import androidx.annotation.AnyThread;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: InMemoryDivStateCache.kt */
@AnyThread
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0016J \u0010\u0012\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0016J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0005H\u0016RN\u0010\u0003\u001aB\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006* \u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R~\u0010\b\u001ar\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t0\t\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*8\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t0\t\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/yandex/div/state/InMemoryDivStateCache;", "Lcom/yandex/div/state/DivStateCache;", "()V", "rootStates", "", "", "kotlin.jvm.PlatformType", "", "states", "Lkotlin/Pair;", "clear", "", "getRootState", "cardId", "getState", "path", "putRootState", "state", "putState", "resetCard", "div-states_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InMemoryDivStateCache implements DivStateCache {
    private final Map<Pair<String, String>, String> states = Collections.synchronizedMap(new LinkedHashMap());
    private final Map<String, String> rootStates = Collections.synchronizedMap(new LinkedHashMap());

    @Override // com.yandex.div.state.DivStateCache
    public void putState(@NotNull String cardId, @NotNull String path, @NotNull String state) {
        this.states.put(TuplesKt.to(cardId, path), state);
    }

    @Override // com.yandex.div.state.DivStateCache
    public void putRootState(@NotNull String cardId, @NotNull String state) {
        this.rootStates.put(cardId, state);
    }

    @Override // com.yandex.div.state.DivStateCache
    @Nullable
    public String getState(@NotNull String cardId, @NotNull String path) {
        return this.states.get(TuplesKt.to(cardId, path));
    }

    @Override // com.yandex.div.state.DivStateCache
    @Nullable
    public String getRootState(@NotNull String cardId) {
        return this.rootStates.get(cardId);
    }

    @Override // com.yandex.div.state.DivStateCache
    public void clear() {
        this.states.clear();
        this.rootStates.clear();
    }

    @Override // com.yandex.div.state.DivStateCache
    public void resetCard(@NotNull final String cardId) {
        this.rootStates.remove(cardId);
        CollectionsKt.removeAll(this.states.keySet(), new Function1() { // from class: com.yandex.div.state.InMemoryDivStateCache$resetCard$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(Pair<String, String> pair) {
                return Boolean.valueOf(Intrinsics.areEqual(pair.getFirst(), cardId));
            }
        });
    }
}
