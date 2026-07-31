package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes14.dex */
public final class B {

    public static final class a implements View.OnAttachStateChangeListener {
        public ViewTreeObserver a;
        public final /* synthetic */ View.OnLayoutChangeListener b;
        public final /* synthetic */ ViewTreeObserver.OnScrollChangedListener c;
        public final /* synthetic */ View d;
        public final /* synthetic */ int[] e;
        public final /* synthetic */ a.AbstractC1677a.c.EnumC1679a f;
        public final /* synthetic */ Ref$ObjectRef<a.AbstractC1677a.c> g;
        public final /* synthetic */ Function1 h;

        public a(View.OnLayoutChangeListener onLayoutChangeListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener, View view, int[] iArr, a.AbstractC1677a.c.EnumC1679a enumC1679a, Ref$ObjectRef<a.AbstractC1677a.c> ref$ObjectRef, Function1 function1) {
            this.b = onLayoutChangeListener;
            this.c = onScrollChangedListener;
            this.d = view;
            this.e = iArr;
            this.f = enumC1679a;
            this.g = ref$ObjectRef;
            this.h = function1;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v) {
            Intrinsics.checkNotNullParameter(v, "v");
            v.addOnLayoutChangeListener(this.b);
            ViewTreeObserver viewTreeObserver = v.getViewTreeObserver();
            ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = this.c;
            this.a = viewTreeObserver;
            viewTreeObserver.addOnScrollChangedListener(onScrollChangedListener);
            B.c(this.d, this.e, this.f, this.g, this.h);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v) {
            Intrinsics.checkNotNullParameter(v, "v");
            v.removeOnLayoutChangeListener(this.b);
            ViewTreeObserver viewTreeObserver = this.a;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    viewTreeObserver = null;
                }
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnScrollChangedListener(this.c);
                }
            }
            this.a = null;
        }
    }

    public static final Unit a(Modifier modifier, a.AbstractC1677a.c.EnumC1679a enumC1679a, Function1 function1, Function3 function3, int i, int i2, Composer composer, int i3) {
        a(modifier, enumC1679a, function1, function3, composer, i | 1, i2);
        return Unit.INSTANCE;
    }

    public static final void b(View view, int[] iArr, a.AbstractC1677a.c.EnumC1679a enumC1679a, Ref$ObjectRef ref$ObjectRef, Function1 function1) {
        c(view, iArr, enumC1679a, ref$ObjectRef, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$a$c, java.lang.Object] */
    public static final void c(View view, int[] iArr, a.AbstractC1677a.c.EnumC1679a enumC1679a, Ref$ObjectRef<a.AbstractC1677a.c> ref$ObjectRef, Function1 function1) {
        float f = view.getResources().getDisplayMetrics().density;
        view.getLocationOnScreen(iArr);
        ?? cVar = new a.AbstractC1677a.c(enumC1679a, new a.AbstractC1677a.f(iArr[0] / f, iArr[1] / f), new a.AbstractC1677a.g(view.getWidth() / f, view.getHeight() / f));
        if (!com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.c.a.a((a.AbstractC1677a.c) cVar) || Intrinsics.areEqual((Object) cVar, ref$ObjectRef.element)) {
            return;
        }
        ref$ObjectRef.element = cVar;
        function1.invoke(cVar);
    }

    @Composable
    @ComposableInferredTarget
    public static final void a(@Nullable Modifier modifier, @NotNull final a.AbstractC1677a.c.EnumC1679a buttonType, @NotNull final Function1 onButtonRendered, @NotNull final Function3 content, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        Intrinsics.checkNotNullParameter(onButtonRendered, "onButtonRendered");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1040306081);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(buttonType) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(onButtonRendered) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(content) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1040306081, i3, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.TrackableButton (TrackableButton.kt:27)");
            }
            startRestartGroup.startReplaceableGroup(-334646762);
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.b.a(buttonType), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final MutableState mutableState = (MutableState) rememberedValue;
            startRestartGroup.endReplaceableGroup();
            a.AbstractC1677a.c a2 = a(mutableState);
            startRestartGroup.startReplaceableGroup(-334642210);
            boolean changed = startRestartGroup.changed(mutableState) | startRestartGroup.changed(onButtonRendered);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.B$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return B.a(Function1.this, mutableState, (a.AbstractC1677a.c) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            content.invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.modifiers.a.a(modifier, a2, (Function1) rememberedValue2), startRestartGroup, Integer.valueOf((i3 >> 6) & 112));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.B$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return B.a(Modifier.this, buttonType, onButtonRendered, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final Unit a(Function1 function1, MutableState mutableState, a.AbstractC1677a.c it) {
        Intrinsics.checkNotNullParameter(it, "it");
        a(mutableState, it);
        function1.invoke(it);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$a$c] */
    public static final void a(@NotNull final View view, @NotNull final a.AbstractC1677a.c.EnumC1679a buttonType, @NotNull final Function1 onButtonRendered) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        Intrinsics.checkNotNullParameter(onButtonRendered, "onButtonRendered");
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.b.a(buttonType);
        final int[] iArr = new int[2];
        a aVar = new a(new View.OnLayoutChangeListener() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.B$$ExternalSyntheticLambda2
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                B.a(view, iArr, buttonType, ref$ObjectRef, onButtonRendered, view2, i, i2, i3, i4, i5, i6, i7, i8);
            }
        }, new ViewTreeObserver.OnScrollChangedListener() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.B$$ExternalSyntheticLambda3
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                B.b(view, iArr, buttonType, ref$ObjectRef, onButtonRendered);
            }
        }, view, iArr, buttonType, ref$ObjectRef, onButtonRendered);
        view.addOnAttachStateChangeListener(aVar);
        if (view.isAttachedToWindow()) {
            aVar.onViewAttachedToWindow(view);
        }
    }

    public static final void a(View view, int[] iArr, a.AbstractC1677a.c.EnumC1679a enumC1679a, Ref$ObjectRef ref$ObjectRef, Function1 function1, View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        c(view, iArr, enumC1679a, ref$ObjectRef, function1);
    }

    public static final a.AbstractC1677a.c a(MutableState<a.AbstractC1677a.c> mutableState) {
        return (a.AbstractC1677a.c) mutableState.getValue();
    }

    public static final void a(MutableState<a.AbstractC1677a.c> mutableState, a.AbstractC1677a.c cVar) {
        mutableState.setValue(cVar);
    }
}
