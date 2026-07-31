package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\tR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u00138F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/ForegroundMonitor;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "<init>", "()V", "", "a", "Landroidx/lifecycle/LifecycleOwner;", "owner", "onStart", "(Landroidx/lifecycle/LifecycleOwner;)V", "onStop", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "b", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_isForeground", "c", "Z", "isInitialized", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "isForeground", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class ForegroundMonitor implements DefaultLifecycleObserver {

    /* renamed from: c, reason: from kotlin metadata */
    public static boolean isInitialized;

    @NotNull
    public static final ForegroundMonitor a = new ForegroundMonitor();

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final MutableStateFlow _isForeground = StateFlowKt.MutableStateFlow(Boolean.TRUE);
    public static final int d = 8;

    private ForegroundMonitor() {
    }

    public final void a() {
        if (isInitialized) {
            return;
        }
        ProcessLifecycleOwner.INSTANCE.get().getLifecycleRegistry().addObserver(this);
        isInitialized = true;
    }

    @NotNull
    public final StateFlow b() {
        return _isForeground;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ /* synthetic */ void onCreate(@NotNull LifecycleOwner lifecycleOwner) {
        super.onCreate(lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ /* synthetic */ void onDestroy(@NotNull LifecycleOwner lifecycleOwner) {
        super.onDestroy(lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ /* synthetic */ void onPause(@NotNull LifecycleOwner lifecycleOwner) {
        super.onPause(lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ /* synthetic */ void onResume(@NotNull LifecycleOwner lifecycleOwner) {
        super.onResume(lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        _isForeground.setValue(Boolean.TRUE);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        _isForeground.setValue(Boolean.FALSE);
    }
}
