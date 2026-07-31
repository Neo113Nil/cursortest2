package yads;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.InitializationListener;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class zq3 implements k00 {
    public final InitializationListener a;

    public zq3(InitializationListener initializationListener) {
        this.a = initializationListener;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zq3) && Intrinsics.areEqual(((zq3) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // yads.k00
    public final void onInitializationCompleted() {
        new CallbackStackTraceMarker(new yq3(this));
    }
}
