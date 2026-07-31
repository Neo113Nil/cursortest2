package com.yandex.div.core.state;

import androidx.annotation.AnyThread;
import com.yandex.div.core.dagger.DivScope;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TemporaryDivStateCache.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0007J\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0007J \u0010\r\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0007J\u001e\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u0005H\u0007R&\u0010\u0003\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/yandex/div/core/state/TemporaryDivStateCache;", "", "()V", "temporaryCache", "", "", "clear", "", "getState", "cardId", "path", "putRootState", "stateId", "putState", "resetCard", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@DivScope
/* loaded from: classes.dex */
public final class TemporaryDivStateCache {

    @NotNull
    private final Map<String, Map<String, String>> temporaryCache = new LinkedHashMap();

    @AnyThread
    @Nullable
    public final String getState(@NotNull String cardId, @NotNull String path) {
        String str;
        synchronized (this.temporaryCache) {
            Map<String, String> map = this.temporaryCache.get(cardId);
            str = map != null ? map.get(path) : null;
        }
        return str;
    }

    @AnyThread
    @Nullable
    public final Map<String, String> resetCard(@NotNull String cardId) {
        Map<String, String> remove;
        synchronized (this.temporaryCache) {
            remove = this.temporaryCache.remove(cardId);
        }
        return remove;
    }

    @AnyThread
    public final void putState(@NotNull String cardId, @NotNull String path, @NotNull String stateId) {
        synchronized (this.temporaryCache) {
            try {
                Map<String, Map<String, String>> map = this.temporaryCache;
                Map<String, String> map2 = map.get(cardId);
                if (map2 == null) {
                    map2 = new LinkedHashMap<>();
                    map.put(cardId, map2);
                }
                map2.put(path, stateId);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @AnyThread
    public final void putRootState(@NotNull String cardId, @NotNull String stateId) {
        putState(cardId, "/", stateId);
    }

    @AnyThread
    public final void clear() {
        this.temporaryCache.clear();
    }
}
