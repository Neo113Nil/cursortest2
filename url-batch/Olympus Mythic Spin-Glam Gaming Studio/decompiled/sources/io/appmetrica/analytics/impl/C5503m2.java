package io.appmetrica.analytics.impl;

import androidx.annotation.MainThread;
import io.appmetrica.analytics.appsetid.internal.AppSetIdListener;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetId;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.m2, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C5503m2 implements AppSetIdListener {
    public final /* synthetic */ C5529n2 a;

    public C5503m2(C5529n2 c5529n2) {
        this.a = c5529n2;
    }

    @Override // io.appmetrica.analytics.appsetid.internal.AppSetIdListener
    @MainThread
    public final void onAppSetIdRetrieved(@Nullable String str, @NotNull AppSetIdScope appSetIdScope) {
        this.a.c = new AppSetId(str, appSetIdScope);
        this.a.d.countDown();
    }

    @Override // io.appmetrica.analytics.appsetid.internal.AppSetIdListener
    @MainThread
    public final void onFailure(@Nullable Throwable th) {
        this.a.d.countDown();
    }
}
