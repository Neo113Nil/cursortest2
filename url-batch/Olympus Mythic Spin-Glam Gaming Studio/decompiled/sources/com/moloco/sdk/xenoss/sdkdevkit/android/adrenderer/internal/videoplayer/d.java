package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes5.dex */
public final class d implements k {
    public static final int d = 8;

    @NotNull
    public final Lifecycle a;

    @NotNull
    public final Function0 b;

    @NotNull
    public final LifecycleEventObserver c;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    public d(@NotNull Lifecycle lifecycle, @NotNull Function0 onExoResume, @NotNull final Function0 onExoPause) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(onExoResume, "onExoResume");
        Intrinsics.checkNotNullParameter(onExoPause, "onExoPause");
        this.a = lifecycle;
        this.b = onExoResume;
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.d$$ExternalSyntheticLambda0
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                d.a(d.this, onExoPause, lifecycleOwner, event);
            }
        };
        this.c = lifecycleEventObserver;
        lifecycle.addObserver(lifecycleEventObserver);
        Lifecycle.State state = lifecycle.getState();
        if (state == Lifecycle.State.DESTROYED || state.isAtLeast(Lifecycle.State.STARTED)) {
            return;
        }
        onExoResume.mo4828invoke();
    }

    public static final void a(d dVar, Function0 function0, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        int i = a.a[event.ordinal()];
        if (i == 1) {
            dVar.b.mo4828invoke();
        } else {
            if (i == 2 || i == 3 || i != 4) {
                return;
            }
            function0.mo4828invoke();
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void destroy() {
        this.a.removeObserver(this.c);
    }
}
