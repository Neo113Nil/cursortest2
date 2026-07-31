package com.yandex.div.state;

import android.content.Context;
import androidx.annotation.AnyThread;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.yandex.div.core.annotations.PublicApi;
import com.yandex.div.state.db.DivStateDao;
import com.yandex.div.state.db.DivStateDaoImpl;
import com.yandex.div.state.db.DivStateDbOpenHelper;
import com.yandex.div.state.db.PathToState;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivStateDatabase.kt */
@PublicApi
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0017\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0015\u001a\u00020\u0016H\u0017J\u0016\u0010\u0017\u001a\u00020\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0019H\u0017J\u0010\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0005H\u0017R\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0092\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108PX\u0090\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/yandex/div/state/DivStateDatabase;", "Lcom/yandex/div/state/DivStateStorage;", "context", "Landroid/content/Context;", "databaseName", "", "executorService", "Ljava/util/concurrent/ExecutorService;", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/concurrent/ExecutorService;)V", "cache", "Lcom/yandex/div/state/DivStateCache;", "getCache", "()Lcom/yandex/div/state/DivStateCache;", "cacheImpl", "Lcom/yandex/div/state/DivStateCacheImpl;", "divStateDao", "Lcom/yandex/div/state/db/DivStateDao;", "getDivStateDao$div_states_release", "()Lcom/yandex/div/state/db/DivStateDao;", "divStateDao$delegate", "Lkotlin/Lazy;", "deleteAllStates", "", "deleteStatesExceptGiven", "cardIds", "", "preloadState", "cardId", "Companion", "div-states_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public class DivStateDatabase implements DivStateStorage {
    private static final long STATE_MAX_AGE = TimeUnit.DAYS.toMillis(2);

    @NotNull
    private final DivStateCacheImpl cacheImpl;

    /* renamed from: divStateDao$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy divStateDao;

    @NotNull
    private final ExecutorService executorService;

    public DivStateDatabase(@NotNull final Context context, @NotNull final String str, @NotNull ExecutorService executorService) {
        this.executorService = executorService;
        this.cacheImpl = new DivStateCacheImpl(this, executorService);
        this.divStateDao = LazyKt.lazy(new Function0() { // from class: com.yandex.div.state.DivStateDatabase$divStateDao$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final DivStateDaoImpl mo4828invoke() {
                long j;
                DivStateDaoImpl divStateDaoImpl = new DivStateDaoImpl(new DivStateDbOpenHelper(context, str).getWritableDatabase());
                long currentTimeMillis = System.currentTimeMillis();
                j = DivStateDatabase.STATE_MAX_AGE;
                divStateDaoImpl.deleteModifiedBefore(currentTimeMillis - j);
                return divStateDaoImpl;
            }
        });
    }

    @NotNull
    public DivStateDao getDivStateDao$div_states_release() {
        return (DivStateDao) this.divStateDao.getValue();
    }

    @Override // com.yandex.div.state.DivStateStorage
    @NotNull
    public DivStateCache getCache() {
        return this.cacheImpl;
    }

    @Override // com.yandex.div.state.DivStateStorage
    @AnyThread
    public void preloadState(@NotNull final String cardId) {
        Future<Map<String, String>> submit = this.executorService.submit(new Callable() { // from class: com.yandex.div.state.DivStateDatabase$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Map preloadState$lambda$1;
                preloadState$lambda$1 = DivStateDatabase.preloadState$lambda$1(DivStateDatabase.this, cardId);
                return preloadState$lambda$1;
            }
        });
        this.cacheImpl.putRootState(cardId, this.executorService.submit(new Callable() { // from class: com.yandex.div.state.DivStateDatabase$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String preloadState$lambda$2;
                preloadState$lambda$2 = DivStateDatabase.preloadState$lambda$2(DivStateDatabase.this, cardId);
                return preloadState$lambda$2;
            }
        }));
        this.cacheImpl.putState(cardId, submit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map preloadState$lambda$1(DivStateDatabase divStateDatabase, String str) {
        ArrayMap arrayMap = new ArrayMap();
        for (PathToState pathToState : divStateDatabase.getDivStateDao$div_states_release().getStates(str)) {
            arrayMap.put(pathToState.getPath(), pathToState.getStateId());
        }
        return arrayMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String preloadState$lambda$2(DivStateDatabase divStateDatabase, String str) {
        return divStateDatabase.getDivStateDao$div_states_release().getRootStateId(str);
    }

    @Override // com.yandex.div.state.DivStateStorage
    @WorkerThread
    public void deleteAllStates() {
        getDivStateDao$div_states_release().deleteAll();
        this.cacheImpl.clear();
    }

    @Override // com.yandex.div.state.DivStateStorage
    @WorkerThread
    public void deleteStatesExceptGiven(@NotNull List<String> cardIds) {
        getDivStateDao$div_states_release().deleteAllExcept(cardIds);
    }
}
