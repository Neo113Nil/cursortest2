package com.yandex.div.state;

import androidx.annotation.AnyThread;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.util.CompletedFuture;
import com.yandex.div.internal.util.SingleThreadExecutor;
import com.yandex.div.state.db.DivStateEntity;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivStateCacheImpl.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001dB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0010\u001a\u00020\u0011H\u0017J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0013\u001a\u00020\tH\u0017J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\tH\u0017J \u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\t2\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000bH\u0007J\u0018\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0017J*\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\t2\u0018\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b0\u000bH\u0007J \u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0017J\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\tH\u0017J\u0010\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\tH\u0003J\u0010\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\tH\u0003R\u0097\u0001\u0010\u0007\u001a\u008a\u0001\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t\u00120\u0012.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b \n*\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u000b0\u000b \n*D\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t\u00120\u0012.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b \n*\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u000b0\u000b\u0018\u00010\f0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000Rn\u0010\r\u001ab\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t\u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010\t \n*\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u000b0\u000b \n*0\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t\u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010\t \n*\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u000b0\u000b\u0018\u00010\f0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/yandex/div/state/DivStateCacheImpl;", "Lcom/yandex/div/state/DivStateCache;", "divStateDatabase", "Lcom/yandex/div/state/DivStateDatabase;", "executorService", "Ljava/util/concurrent/ExecutorService;", "(Lcom/yandex/div/state/DivStateDatabase;Ljava/util/concurrent/ExecutorService;)V", "cache", "", "", "kotlin.jvm.PlatformType", "Ljava/util/concurrent/Future;", "", "rootState", "singleThreadExecutor", "Lcom/yandex/div/state/DivStateCacheImpl$WorkerThreadExecutor;", "clear", "", "getRootState", "cardId", "getState", "path", "putRootState", "future", "stateId", "putState", "resetCard", "resetCardRootState", "resetCardStates", "WorkerThreadExecutor", "div-states_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DivStateCacheImpl implements DivStateCache {

    @NotNull
    private final DivStateDatabase divStateDatabase;

    @NotNull
    private final WorkerThreadExecutor singleThreadExecutor;
    private final Map<String, Future<Map<String, String>>> cache = Collections.synchronizedMap(new LinkedHashMap());
    private final Map<String, Future<String>> rootState = Collections.synchronizedMap(new LinkedHashMap());

    public DivStateCacheImpl(@NotNull DivStateDatabase divStateDatabase, @NotNull ExecutorService executorService) {
        this.divStateDatabase = divStateDatabase;
        this.singleThreadExecutor = new WorkerThreadExecutor(executorService);
    }

    @AnyThread
    public final void putState(@NotNull String cardId, @NotNull Future<Map<String, String>> future) {
        synchronized (this.cache) {
            try {
                if (!this.cache.containsKey(cardId)) {
                    this.cache.put(cardId, future);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @AnyThread
    public final void putRootState(@NotNull String cardId, @NotNull Future<String> future) {
        synchronized (this.rootState) {
            try {
                if (!this.rootState.containsKey(cardId)) {
                    this.rootState.put(cardId, future);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.yandex.div.state.DivStateCache
    @AnyThread
    public void putState(@NotNull final String cardId, @NotNull final String path, @NotNull final String stateId) {
        synchronized (this.cache) {
            try {
                Map<String, Future<Map<String, String>>> map = this.cache;
                Future<Map<String, String>> future = map.get(cardId);
                if (future == null) {
                    future = new CompletedFuture<>(new LinkedHashMap());
                    map.put(cardId, future);
                }
                future.get().put(path, stateId);
                this.singleThreadExecutor.post(new Runnable() { // from class: com.yandex.div.state.DivStateCacheImpl$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        DivStateCacheImpl.putState$lambda$4$lambda$3(DivStateCacheImpl.this, cardId, path, stateId);
                    }
                });
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void putState$lambda$4$lambda$3(DivStateCacheImpl divStateCacheImpl, String str, String str2, String str3) {
        divStateCacheImpl.divStateDatabase.getDivStateDao$div_states_release().updateState(new DivStateEntity(0, str, str2, str3, System.currentTimeMillis()));
    }

    @Override // com.yandex.div.state.DivStateCache
    @AnyThread
    public void putRootState(@NotNull final String cardId, @NotNull final String stateId) {
        synchronized (this.rootState) {
            this.rootState.put(cardId, new CompletedFuture(stateId));
            this.singleThreadExecutor.post(new Runnable() { // from class: com.yandex.div.state.DivStateCacheImpl$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    DivStateCacheImpl.putRootState$lambda$6$lambda$5(DivStateCacheImpl.this, cardId, stateId);
                }
            });
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void putRootState$lambda$6$lambda$5(DivStateCacheImpl divStateCacheImpl, String str, String str2) {
        divStateCacheImpl.divStateDatabase.getDivStateDao$div_states_release().deleteCardRootState(str);
        divStateCacheImpl.divStateDatabase.getDivStateDao$div_states_release().updateState(new DivStateEntity(0, str, "/", str2, System.currentTimeMillis()));
    }

    @Override // com.yandex.div.state.DivStateCache
    @AnyThread
    @Nullable
    public String getState(@NotNull String cardId, @NotNull String path) {
        Map<String, String> map;
        try {
            Future<Map<String, String>> future = this.cache.get(cardId);
            if (future == null || !future.isDone() || (map = future.get()) == null) {
                return null;
            }
            return map.get(path);
        } catch (ExecutionException e) {
            Assert.fail("", e);
        }
        return null;
    }

    @Override // com.yandex.div.state.DivStateCache
    @AnyThread
    @Nullable
    public String getRootState(@NotNull String cardId) {
        try {
        } catch (ExecutionException e) {
            Assert.fail("", e);
        }
        synchronized (this.rootState) {
            Future<String> future = this.rootState.get(cardId);
            if (future != null && future.isDone()) {
                String str = future.get();
                if (str == null) {
                    this.rootState.put(cardId, null);
                }
                return str;
            }
            Unit unit = Unit.INSTANCE;
            return null;
        }
    }

    @Override // com.yandex.div.state.DivStateCache
    @AnyThread
    public void clear() {
        this.cache.clear();
        this.rootState.clear();
    }

    /* compiled from: DivStateCacheImpl.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\bj\u0002`\tH\u0014¨\u0006\n"}, d2 = {"Lcom/yandex/div/state/DivStateCacheImpl$WorkerThreadExecutor;", "Lcom/yandex/div/internal/util/SingleThreadExecutor;", "executor", "Ljava/util/concurrent/Executor;", "(Ljava/util/concurrent/Executor;)V", "handleError", "", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "div-states_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class WorkerThreadExecutor extends SingleThreadExecutor {
        public WorkerThreadExecutor(@NotNull Executor executor) {
            super(executor, "DivStateCache");
        }

        @Override // com.yandex.div.internal.util.SingleThreadExecutor
        protected void handleError(@NotNull RuntimeException e) {
            Assert.fail("", e);
        }
    }

    @Override // com.yandex.div.state.DivStateCache
    @AnyThread
    public void resetCard(@NotNull String cardId) {
        resetCardStates(cardId);
        resetCardRootState(cardId);
    }

    @AnyThread
    private final void resetCardStates(final String cardId) {
        synchronized (this.cache) {
            this.cache.remove(cardId);
            this.singleThreadExecutor.post(new Runnable() { // from class: com.yandex.div.state.DivStateCacheImpl$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    DivStateCacheImpl.resetCardStates$lambda$9$lambda$8(DivStateCacheImpl.this, cardId);
                }
            });
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resetCardStates$lambda$9$lambda$8(DivStateCacheImpl divStateCacheImpl, String str) {
        divStateCacheImpl.divStateDatabase.getDivStateDao$div_states_release().deleteByCardId(str);
    }

    @AnyThread
    private final void resetCardRootState(final String cardId) {
        synchronized (this.rootState) {
            this.rootState.remove(cardId);
            this.singleThreadExecutor.post(new Runnable() { // from class: com.yandex.div.state.DivStateCacheImpl$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    DivStateCacheImpl.resetCardRootState$lambda$11$lambda$10(DivStateCacheImpl.this, cardId);
                }
            });
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resetCardRootState$lambda$11$lambda$10(DivStateCacheImpl divStateCacheImpl, String str) {
        divStateCacheImpl.divStateDatabase.getDivStateDao$div_states_release().deleteCardRootState(str);
    }
}
