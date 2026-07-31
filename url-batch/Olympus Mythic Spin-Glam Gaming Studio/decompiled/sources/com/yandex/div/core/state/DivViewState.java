package com.yandex.div.core.state;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class DivViewState {

    @NonNull
    private final Map<String, BlockState> mBlockStates;
    private final long mCurrentDivStateId;

    interface BlockState {
    }

    DivViewState(long j) {
        this(j, new ArrayMap());
    }

    DivViewState(long j, @NonNull Map<String, BlockState> map) {
        this.mCurrentDivStateId = j;
        this.mBlockStates = map;
    }

    public long getCurrentDivStateId() {
        return this.mCurrentDivStateId;
    }

    @Nullable
    public <T extends BlockState> T getBlockState(@NonNull String str) {
        return (T) this.mBlockStates.get(str);
    }

    public <T extends BlockState> void putBlockState(@NonNull String str, @NonNull T t) {
        this.mBlockStates.put(str, t);
    }

    public void reset() {
        this.mBlockStates.clear();
    }

    @NonNull
    Map<String, BlockState> getBlockStates() {
        return this.mBlockStates;
    }
}
