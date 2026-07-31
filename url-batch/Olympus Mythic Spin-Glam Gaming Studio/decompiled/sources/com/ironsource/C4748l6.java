package com.ironsource;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.l6, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4748l6 implements K {

    @NotNull
    private final Activity a;

    public C4748l6(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.a = activity;
    }

    @Override // com.ironsource.K
    public void a(@NotNull C4712j6 fullscreenAdInstance) {
        Intrinsics.checkNotNullParameter(fullscreenAdInstance, "fullscreenAdInstance");
        fullscreenAdInstance.a(this.a);
    }
}
