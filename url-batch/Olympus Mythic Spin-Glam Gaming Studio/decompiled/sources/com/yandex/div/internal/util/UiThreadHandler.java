package com.yandex.div.internal.util;

import android.os.Handler;
import android.os.Looper;
import com.yandex.div.core.annotations.InternalApi;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: UiThreadHandler.kt */
@InternalApi
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0006\u001a\u00020\u00072\u000e\b\u0004\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0086\bJ\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\f\u001a\u00020\u0004H\u0007J\b\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\u0014\u0010\u0011\u001a\u00020\u000e2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tR\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\b\u0005¨\u0006\u0012"}, d2 = {"Lcom/yandex/div/internal/util/UiThreadHandler;", "", "()V", "INSTANCE", "Landroid/os/Handler;", "INSTANCE$1", "executeOnMainThread", "", "action", "Lkotlin/Function0;", "runnable", "Ljava/lang/Runnable;", "get", "isMainThread", "", "mainThread", "Ljava/lang/Thread;", "postOnMainThread", "utils_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UiThreadHandler {

    @NotNull
    public static final UiThreadHandler INSTANCE = new UiThreadHandler();

    /* renamed from: INSTANCE$1, reason: from kotlin metadata */
    @NotNull
    private static final Handler INSTANCE = new Handler(Looper.getMainLooper());

    private UiThreadHandler() {
    }

    @NotNull
    public static final Thread mainThread() {
        return Looper.getMainLooper().getThread();
    }

    public static final boolean isMainThread() {
        return Intrinsics.areEqual(Thread.currentThread(), mainThread());
    }

    @NotNull
    public static final Handler get() {
        return INSTANCE;
    }

    public final boolean postOnMainThread(@NotNull final Function0 runnable) {
        return INSTANCE.post(new Runnable() { // from class: com.yandex.div.internal.util.UiThreadHandler$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Function0.this.mo4828invoke();
            }
        });
    }

    public static final void executeOnMainThread(@NotNull Runnable runnable) {
        if (isMainThread()) {
            runnable.run();
        } else {
            INSTANCE.post(runnable);
        }
    }

    public final void executeOnMainThread(@NotNull final Function0 action) {
        if (isMainThread()) {
            action.mo4828invoke();
        } else {
            get().post(new Runnable() { // from class: com.yandex.div.internal.util.UiThreadHandler$executeOnMainThread$1
                @Override // java.lang.Runnable
                public final void run() {
                    Function0.this.mo4828invoke();
                }
            });
        }
    }
}
