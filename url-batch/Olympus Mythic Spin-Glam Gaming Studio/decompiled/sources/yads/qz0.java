package yads;

import android.app.ActivityManager;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class qz0 {
    public static Long a(Context context) {
        try {
            Object systemService = context.getApplicationContext().getSystemService("activity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
            return Long.valueOf(memoryInfo.totalMem / 1048576);
        } catch (Throwable unused) {
            boolean z = ob1.a;
            return null;
        }
    }
}
