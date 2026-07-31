package com.yandex.div.state.db;

import androidx.annotation.WorkerThread;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivStateDao.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J\u0016\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H'J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0007H'J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0007H'J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH'J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0007H'J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\u0006\u0010\t\u001a\u00020\u0007H'J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Lcom/yandex/div/state/db/DivStateDao;", "", "deleteAll", "", "deleteAllExcept", "cardIds", "", "", "deleteByCardId", "cardId", "deleteCardRootState", "deleteModifiedBefore", "timestamp", "", "getRootStateId", "getStates", "Lcom/yandex/div/state/db/PathToState;", "updateState", "state", "Lcom/yandex/div/state/db/DivStateEntity;", "div-states_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface DivStateDao {
    @WorkerThread
    void deleteAll();

    @WorkerThread
    void deleteAllExcept(@NotNull List<String> cardIds);

    @WorkerThread
    void deleteByCardId(@NotNull String cardId);

    @WorkerThread
    void deleteCardRootState(@NotNull String cardId);

    @WorkerThread
    void deleteModifiedBefore(long timestamp);

    @WorkerThread
    @Nullable
    String getRootStateId(@NotNull String cardId);

    @WorkerThread
    @NotNull
    List<PathToState> getStates(@NotNull String cardId);

    @WorkerThread
    void updateState(@NotNull DivStateEntity state);
}
