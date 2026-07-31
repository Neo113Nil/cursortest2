package yads;

import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q63 {
    public static boolean a() {
        return Intrinsics.areEqual(Thread.currentThread(), Looper.getMainLooper().getThread());
    }
}
