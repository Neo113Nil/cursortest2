package com.unity3d.services.core.domain;

import com.ironsource.X3;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* compiled from: SDKDispatchers.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/unity3d/services/core/domain/SDKDispatchers;", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "<init>", "()V", "io", "Lkotlinx/coroutines/CoroutineDispatcher;", "getIo", "()Lkotlinx/coroutines/CoroutineDispatcher;", "default", "getDefault", X3.i.Z, "getMain", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SDKDispatchers implements ISDKDispatchers {

    @NotNull
    private final CoroutineDispatcher io = Dispatchers.getIO();

    @NotNull
    private final CoroutineDispatcher default = Dispatchers.getDefault();

    @NotNull
    private final CoroutineDispatcher main = Dispatchers.getMain();

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    @NotNull
    public CoroutineDispatcher getIo() {
        return this.io;
    }

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    @NotNull
    public CoroutineDispatcher getDefault() {
        return this.default;
    }

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    @NotNull
    public CoroutineDispatcher getMain() {
        return this.main;
    }
}
