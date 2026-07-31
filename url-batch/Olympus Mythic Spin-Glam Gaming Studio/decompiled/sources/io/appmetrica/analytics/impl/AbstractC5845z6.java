package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.ICrashTransformer;

/* renamed from: io.appmetrica.analytics.impl.z6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5845z6 implements InterfaceC5305eb {
    public final InterfaceC5819y6 a;
    public final ICrashTransformer b;
    public final C5382ha c;

    public AbstractC5845z6(InterfaceC5819y6 interfaceC5819y6, ICrashTransformer iCrashTransformer, C5382ha c5382ha) {
        this.a = interfaceC5819y6;
        this.b = iCrashTransformer;
        this.c = c5382ha;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5305eb
    public final void a(@Nullable Throwable th, @NonNull X x) {
        if (this.a.a(th)) {
            ICrashTransformer iCrashTransformer = this.b;
            if (iCrashTransformer == null || th == null || (th = iCrashTransformer.process(th)) != null) {
                C5421io a = AbstractC5499lo.a(th, x, null, (String) this.c.b.a(), (Boolean) this.c.c.a());
                Bc bc = (Bc) ((Oh) this).d;
                bc.a.a().a(bc.b).a(a);
            }
        }
    }

    @VisibleForTesting
    public final InterfaceC5819y6 b() {
        return this.a;
    }

    @Nullable
    @VisibleForTesting
    public final ICrashTransformer a() {
        return this.b;
    }
}
