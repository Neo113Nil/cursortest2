package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes13.dex */
public interface i extends d {

    @NotNull
    public static final a a = a.a;

    public static final class a {
        public static final /* synthetic */ a a = new a();

        @NotNull
        public final i a(@NotNull l worker) {
            Intrinsics.checkNotNullParameter(worker, "worker");
            return new j(worker);
        }
    }
}
