package com.yandex.div.state;

import androidx.annotation.AnyThread;
import androidx.annotation.WorkerThread;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: InMemoryDivStateStorage.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0017J\u0016\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0017J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\fH\u0017R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/yandex/div/state/InMemoryDivStateStorage;", "Lcom/yandex/div/state/DivStateStorage;", "()V", "cache", "Lcom/yandex/div/state/InMemoryDivStateCache;", "getCache", "()Lcom/yandex/div/state/InMemoryDivStateCache;", "deleteAllStates", "", "deleteStatesExceptGiven", "cardIds", "", "", "preloadState", "cardId", "div-states_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class InMemoryDivStateStorage implements DivStateStorage {

    @NotNull
    private final InMemoryDivStateCache cache = new InMemoryDivStateCache();

    @Override // com.yandex.div.state.DivStateStorage
    @WorkerThread
    public void deleteStatesExceptGiven(@NotNull List<String> cardIds) {
    }

    @Override // com.yandex.div.state.DivStateStorage
    @AnyThread
    public void preloadState(@NotNull String cardId) {
    }

    @Override // com.yandex.div.state.DivStateStorage
    @NotNull
    public InMemoryDivStateCache getCache() {
        return this.cache;
    }

    @Override // com.yandex.div.state.DivStateStorage
    @WorkerThread
    public void deleteAllStates() {
        getCache().clear();
    }
}
