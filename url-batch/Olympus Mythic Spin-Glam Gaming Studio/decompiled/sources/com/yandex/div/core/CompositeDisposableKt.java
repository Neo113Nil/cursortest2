package com.yandex.div.core;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: CompositeDisposable.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\u0002\u001a\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\u0002¨\u0006\u0006"}, d2 = {"minusAssign", "", "Lcom/yandex/div/core/CompositeDisposable;", "disposable", "Lcom/yandex/div/core/Disposable;", "plusAssign", "div-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CompositeDisposableKt {
    public static final void plusAssign(@NotNull CompositeDisposable compositeDisposable, @NotNull Disposable disposable) {
        compositeDisposable.add(disposable);
    }

    public static final void minusAssign(@NotNull CompositeDisposable compositeDisposable, @NotNull Disposable disposable) {
        compositeDisposable.remove(disposable);
    }
}
