package io.bidmachine.util.viewabilitytracker.checker;

import android.view.View;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: ViewabilityChecker.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lio/bidmachine/util/viewabilitytracker/checker/ViewabilityChecker;", "", "destroy", "", "start", "view", "Landroid/view/View;", "delayMs", "", "stop", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes13.dex */
public interface ViewabilityChecker {
    void destroy();

    void start(@NotNull View view, long delayMs);

    void stop();
}
