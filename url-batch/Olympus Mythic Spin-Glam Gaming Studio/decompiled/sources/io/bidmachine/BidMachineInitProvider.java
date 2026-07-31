package io.bidmachine;

import android.content.Context;
import io.bidmachine.internal.AbstractC6009d;
import io.bidmachine.internal.K;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/bidmachine/BidMachineInitProvider;", "Lio/bidmachine/internal/d;", "<init>", "()V", "", "onCreate", "()Z", "Landroid/content/Context;", "context", "", "preInitialize", "(Landroid/content/Context;)V", "Lio/bidmachine/internal/K;", "startupWatcherThread", "Lio/bidmachine/internal/K;", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class BidMachineInitProvider extends AbstractC6009d {

    @NotNull
    private final K startupWatcherThread;

    public BidMachineInitProvider() {
        K k = new K(System.currentTimeMillis(), null, null, null, 14, null);
        this.startupWatcherThread = k;
        k.start();
    }

    @Override // io.bidmachine.internal.AbstractC6009d, android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        if (context != null) {
            this.startupWatcherThread.a(context);
        }
        this.startupWatcherThread.d();
        boolean onCreate = super.onCreate();
        this.startupWatcherThread.c();
        return onCreate;
    }

    @Override // io.bidmachine.internal.AbstractC6009d
    public void preInitialize(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        k.j(context);
    }
}
