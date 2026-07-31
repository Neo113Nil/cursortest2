package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Savable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes15.dex */
public final class N implements Savable {
    public final /* synthetic */ O a;

    public N(O o) {
        this.a = o;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Savable
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean getValue() {
        return Boolean.valueOf(this.a.a.a(false));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Savable
    public final /* bridge */ /* synthetic */ void setValue(Object obj) {
        a(((Boolean) obj).booleanValue());
    }

    public final void a(boolean z) {
        this.a.a.e(z);
    }
}
