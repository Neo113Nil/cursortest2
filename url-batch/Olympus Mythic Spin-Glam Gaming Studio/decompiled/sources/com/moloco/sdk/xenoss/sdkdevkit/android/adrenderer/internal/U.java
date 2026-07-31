package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes6.dex */
public final class U {

    @NotNull
    public static final U a = new U();

    @NotNull
    public static final Map<Integer, C5054d> b = new LinkedHashMap();
    public static final int c = 8;

    public final void b(int i) {
        b.remove(Integer.valueOf(i));
    }

    public final int a(@NotNull C5054d wv) {
        Intrinsics.checkNotNullParameter(wv, "wv");
        int hashCode = wv.hashCode();
        b.put(Integer.valueOf(hashCode), wv);
        return hashCode;
    }

    public final /* synthetic */ <T> T a(int i) {
        T t = (T) b.get(Integer.valueOf(i));
        Intrinsics.reifiedOperationMarker(2, "T");
        return t;
    }
}
