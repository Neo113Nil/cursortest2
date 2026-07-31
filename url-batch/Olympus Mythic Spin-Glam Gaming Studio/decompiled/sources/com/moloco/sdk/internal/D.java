package com.moloco.sdk.internal;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.os.SavedStateRegistry;
import androidx.os.SavedStateRegistryController;
import androidx.os.SavedStateRegistryOwner;
import androidx.os.ViewTreeSavedStateRegistryOwner;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes15.dex */
public final class D implements C, LifecycleOwner, SavedStateRegistryOwner {

    @NotNull
    public static final a c = new a(null);
    public static final int d = 8;

    @NotNull
    public static final String e = "ViewLifecycleOwner";

    @NotNull
    public final LifecycleRegistry a = new LifecycleRegistry(this);

    @NotNull
    public final SavedStateRegistryController b = SavedStateRegistryController.INSTANCE.create(this);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View a;
        public final /* synthetic */ D b;
        public final /* synthetic */ View c;

        public b(View view, D d, View view2) {
            this.a = view;
            this.b = d;
            this.c = view2;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.a.removeOnAttachStateChangeListener(this);
            this.b.f(this.c);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
        }
    }

    @Override // com.moloco.sdk.internal.C
    public void b(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        View rootView = view.getRootView();
        if (rootView == null) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, e, "RootView is absent, skipping", null, false, 12, null);
            return;
        }
        if (Intrinsics.areEqual(ViewTreeSavedStateRegistryOwner.get(rootView), this)) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, e, "Removing ViewTreeSavedStateRegistryOwner", null, false, 12, null);
            ViewTreeSavedStateRegistryOwner.set(rootView, null);
        }
        if (e(rootView)) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, e, "Removing ViewTreeLifecycleOwner", null, false, 12, null);
            ViewTreeLifecycleOwner.set(rootView, null);
        }
    }

    @Override // com.moloco.sdk.internal.C
    public void c(@NotNull View view) {
        Object m8023constructorimpl;
        Intrinsics.checkNotNullParameter(view, "view");
        View rootView = view.getRootView();
        Intrinsics.checkNotNull(rootView);
        if (e(rootView)) {
            try {
                Result.Companion companion = Result.INSTANCE;
                this.a.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
                m8023constructorimpl = Result.m8023constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
            }
            MolocoLogger.info$default(MolocoLogger.INSTANCE, e, "lifecycle pause success " + Result.m8029isSuccessimpl(m8023constructorimpl), Result.m8026exceptionOrNullimpl(m8023constructorimpl), false, 8, null);
        }
    }

    @Override // com.moloco.sdk.internal.C
    public void d(@NotNull View view) {
        Object m8023constructorimpl;
        Intrinsics.checkNotNullParameter(view, "view");
        View rootView = view.getRootView();
        Intrinsics.checkNotNull(rootView);
        if (e(rootView)) {
            try {
                Result.Companion companion = Result.INSTANCE;
                this.a.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
                m8023constructorimpl = Result.m8023constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m8029isSuccessimpl(m8023constructorimpl)) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, e, "lifecycle resume success", null, false, 12, null);
            }
            Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
            if (m8026exceptionOrNullimpl != null) {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, e, "lifecycle resume failure", m8026exceptionOrNullimpl, false, 8, null);
            }
        }
    }

    public final boolean e(View view) {
        return Intrinsics.areEqual(ViewTreeLifecycleOwner.get(view), this);
    }

    public final void f(View view) {
        View rootView = view.getRootView();
        if (rootView == null) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, e, "RootView is absent, skipping", null, false, 12, null);
            return;
        }
        if (ViewTreeSavedStateRegistryOwner.get(rootView) == null) {
            ViewTreeSavedStateRegistryOwner.set(rootView, this);
            try {
                Result.Companion companion = Result.INSTANCE;
                this.b.performRestore(null);
                Result.m8023constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m8023constructorimpl(ResultKt.createFailure(th));
            }
            MolocoLogger.info$default(MolocoLogger.INSTANCE, e, "ViewTreeSavedStateRegistryOwner is absent, setting custom one", null, false, 12, null);
        }
        if (ViewTreeLifecycleOwner.get(rootView) == null) {
            ViewTreeLifecycleOwner.set(rootView, this);
            this.a.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
            this.a.handleLifecycleEvent(Lifecycle.Event.ON_START);
            this.a.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
            MolocoLogger.info$default(MolocoLogger.INSTANCE, e, "ViewTreeLifecycleOwner is absent, setting custom one", null, false, 12, null);
        }
    }

    @Override // com.moloco.sdk.internal.C, androidx.lifecycle.LifecycleOwner
    @NotNull
    public Lifecycle getLifecycle() {
        return this.a;
    }

    @Override // androidx.os.SavedStateRegistryOwner
    @NotNull
    public SavedStateRegistry getSavedStateRegistry() {
        return this.b.getSavedStateRegistry();
    }

    @Override // com.moloco.sdk.internal.C
    public void a(@NotNull final View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        com.moloco.sdk.internal.scheduling.d.a(new Function0() { // from class: com.moloco.sdk.internal.D$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return D.a(view, this);
            }
        });
    }

    public static final Unit a(View view, D d2) {
        if (ViewCompat.isAttachedToWindow(view)) {
            d2.f(view);
        } else {
            view.addOnAttachStateChangeListener(new b(view, d2, view));
        }
        return Unit.INSTANCE;
    }
}
