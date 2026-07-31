package com.ogury.ad.async;

import com.safedk.android.analytics.brandsafety.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0001J\b\u0010\b\u001a\u00020\u0006H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ogury/ad/async/CompositeDisposable;", "Lcom/ogury/ad/async/Disposable;", "()V", "disposables", "", m.l, "", "disposable", "dispose", "sdk-ads_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CompositeDisposable implements Disposable {

    @NotNull
    private final List<Disposable> disposables = new ArrayList();

    public final void add(@NotNull Disposable disposable) {
        Intrinsics.checkNotNullParameter(disposable, "disposable");
        this.disposables.add(disposable);
    }

    @Override // com.ogury.ad.async.Disposable
    public void dispose() {
        Iterator<Disposable> it = this.disposables.iterator();
        while (it.hasNext()) {
            it.next().dispose();
        }
        this.disposables.clear();
    }
}
