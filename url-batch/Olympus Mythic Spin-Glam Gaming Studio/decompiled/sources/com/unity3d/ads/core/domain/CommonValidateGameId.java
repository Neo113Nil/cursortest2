package com.unity3d.ads.core.domain;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CommonValidateGameId.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonValidateGameId;", "Lcom/unity3d/ads/core/domain/ValidateGameId;", "getGameId", "Lcom/unity3d/ads/core/domain/GetGameId;", "setGameId", "Lcom/unity3d/ads/core/domain/SetGameId;", "<init>", "(Lcom/unity3d/ads/core/domain/GetGameId;Lcom/unity3d/ads/core/domain/SetGameId;)V", "invoke", "", AndroidGetAdPlayerContext.KEY_GAME_ID, "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CommonValidateGameId implements ValidateGameId {

    @NotNull
    private final GetGameId getGameId;

    @NotNull
    private final SetGameId setGameId;

    public CommonValidateGameId(@NotNull GetGameId getGameId, @NotNull SetGameId setGameId) {
        Intrinsics.checkNotNullParameter(getGameId, "getGameId");
        Intrinsics.checkNotNullParameter(setGameId, "setGameId");
        this.getGameId = getGameId;
        this.setGameId = setGameId;
    }

    @Override // com.unity3d.ads.core.domain.ValidateGameId
    public boolean invoke(@Nullable String gameId) {
        if (this.getGameId.invoke() != null) {
            return true;
        }
        if (gameId == null) {
            return false;
        }
        this.setGameId.invoke(gameId);
        return true;
    }
}
