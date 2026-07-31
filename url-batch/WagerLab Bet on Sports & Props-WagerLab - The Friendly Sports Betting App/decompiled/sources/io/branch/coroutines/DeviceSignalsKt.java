package io.branch.coroutines;

import android.content.Context;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* compiled from: DeviceSignals.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\b\u001a\u001b\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\b\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"mutex", "Lkotlinx/coroutines/sync/Mutex;", "getMutex", "()Lkotlinx/coroutines/sync/Mutex;", "getUserAgentAsync", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserAgentSync", "Branch-SDK_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DeviceSignalsKt {
    private static final Mutex mutex = MutexKt.Mutex$default(false, 1, null);

    public static final Mutex getMutex() {
        return mutex;
    }

    public static final Object getUserAgentAsync(Context context, Continuation<? super String> continuation) {
        return BuildersKt.withContext(Dispatchers.getDefault(), new DeviceSignalsKt$getUserAgentAsync$2(context, null), continuation);
    }

    public static final Object getUserAgentSync(Context context, Continuation<? super String> continuation) {
        return BuildersKt.withContext(Dispatchers.getMain(), new DeviceSignalsKt$getUserAgentSync$2(context, null), continuation);
    }
}
