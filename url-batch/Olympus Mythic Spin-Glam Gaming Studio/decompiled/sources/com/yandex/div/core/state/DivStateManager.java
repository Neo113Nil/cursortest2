package com.yandex.div.core.state;

import androidx.annotation.AnyThread;
import androidx.collection.ArrayMap;
import com.yandex.div.DivDataTag;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.timer.TimerController;
import com.yandex.div.state.DivStateCache;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivStateManager.kt */
@AnyThread
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\tJ\u0014\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0010J\u001e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u001e\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/yandex/div/core/state/DivStateManager;", "", "cache", "Lcom/yandex/div/state/DivStateCache;", "temporaryCache", "Lcom/yandex/div/core/state/TemporaryDivStateCache;", "(Lcom/yandex/div/state/DivStateCache;Lcom/yandex/div/core/state/TemporaryDivStateCache;)V", "states", "Landroidx/collection/ArrayMap;", "Lcom/yandex/div/DivDataTag;", "Lcom/yandex/div/core/state/DivViewState;", "getState", "tag", TimerController.RESET_COMMAND, "", "tags", "", "updateState", "stateId", "", "temporary", "", "updateStates", "cardId", "", "divStatePath", "Lcom/yandex/div/core/state/DivStatePath;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@DivScope
/* loaded from: classes6.dex */
public final class DivStateManager {

    @NotNull
    private final DivStateCache cache;

    @NotNull
    private final ArrayMap<DivDataTag, DivViewState> states = new ArrayMap<>();

    @NotNull
    private final TemporaryDivStateCache temporaryCache;

    public DivStateManager(@NotNull DivStateCache divStateCache, @NotNull TemporaryDivStateCache temporaryDivStateCache) {
        this.cache = divStateCache;
        this.temporaryCache = temporaryDivStateCache;
    }

    @Nullable
    public final DivViewState getState(@NotNull DivDataTag tag) {
        DivViewState divViewState;
        synchronized (this.states) {
            try {
                divViewState = (DivViewState) this.states.get(tag);
                if (divViewState == null) {
                    String rootState = this.cache.getRootState(tag.getId());
                    divViewState = rootState != null ? new DivViewState(Long.parseLong(rootState)) : null;
                    this.states.put(tag, divViewState);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return divViewState;
    }

    public final void updateState(@NotNull DivDataTag tag, long stateId, boolean temporary) {
        if (Intrinsics.areEqual(DivDataTag.INVALID, tag)) {
            return;
        }
        synchronized (this.states) {
            try {
                DivViewState state = getState(tag);
                this.states.put(tag, state == null ? new DivViewState(stateId) : new DivViewState(stateId, state.getBlockStates()));
                this.temporaryCache.putRootState(tag.getId(), String.valueOf(stateId));
                if (!temporary) {
                    this.cache.putRootState(tag.getId(), String.valueOf(stateId));
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void updateStates(@NotNull String cardId, @NotNull DivStatePath divStatePath, boolean temporary) {
        String pathToLastState = divStatePath.getPathToLastState();
        String lastStateId = divStatePath.getLastStateId();
        if (pathToLastState == null || lastStateId == null) {
            return;
        }
        synchronized (this.states) {
            try {
                this.temporaryCache.putState(cardId, pathToLastState, lastStateId);
                if (!temporary) {
                    this.cache.putState(cardId, pathToLastState, lastStateId);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void reset(@NotNull List<? extends DivDataTag> tags) {
        if (tags.isEmpty()) {
            this.states.clear();
            this.cache.clear();
            this.temporaryCache.clear();
        } else {
            for (DivDataTag divDataTag : tags) {
                this.states.remove(divDataTag);
                this.cache.resetCard(divDataTag.getId());
                this.temporaryCache.resetCard(divDataTag.getId());
            }
        }
    }
}
