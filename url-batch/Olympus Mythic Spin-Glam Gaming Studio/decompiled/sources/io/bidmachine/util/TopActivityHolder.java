package io.bidmachine.util;

import android.app.Activity;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TopActivityHolder.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lio/bidmachine/util/TopActivityHolder;", "", "()V", "weakTopActivity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "getTopActivity", "setTopActivity", "", "activity", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes13.dex */
public final class TopActivityHolder {

    @NotNull
    public static final TopActivityHolder INSTANCE = new TopActivityHolder();

    @Nullable
    private static WeakReference<Activity> weakTopActivity;

    private TopActivityHolder() {
    }

    @Nullable
    public final Activity getTopActivity() {
        WeakReference<Activity> weakReference = weakTopActivity;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void setTopActivity(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        weakTopActivity = new WeakReference<>(activity);
    }
}
