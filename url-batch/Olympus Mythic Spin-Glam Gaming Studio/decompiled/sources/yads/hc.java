package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class hc {
    public final String a;
    public final Runnable b;

    public hc(String str, Runnable runnable) {
        this.a = str;
        this.b = runnable;
    }

    public final boolean a(String str, String str2) {
        return Intrinsics.areEqual("mobileads", str) && Intrinsics.areEqual(this.a, str2);
    }

    public final void a() {
        this.b.run();
    }
}
