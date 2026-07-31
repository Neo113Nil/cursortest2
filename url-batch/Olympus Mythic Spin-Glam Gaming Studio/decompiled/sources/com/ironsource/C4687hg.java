package com.ironsource;

import android.os.Handler;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.hg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4687hg {
    @NotNull
    public static final InterfaceC4669gg a(@NotNull final Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "<this>");
        return new InterfaceC4669gg() { // from class: com.ironsource.hg$$ExternalSyntheticLambda2
            @Override // com.ironsource.InterfaceC4669gg
            public final void a(Function0 function0) {
                C4687hg.a(handler, function0);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.mo4828invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Handler this_asDispatcher, final Function0 it) {
        Intrinsics.checkNotNullParameter(this_asDispatcher, "$this_asDispatcher");
        Intrinsics.checkNotNullParameter(it, "it");
        this_asDispatcher.post(new Runnable() { // from class: com.ironsource.hg$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C4687hg.a(Function0.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.mo4828invoke();
    }

    @NotNull
    public static final InterfaceC4669gg a(@NotNull final C4876s9 c4876s9) {
        Intrinsics.checkNotNullParameter(c4876s9, "<this>");
        return new InterfaceC4669gg() { // from class: com.ironsource.hg$$ExternalSyntheticLambda0
            @Override // com.ironsource.InterfaceC4669gg
            public final void a(Function0 function0) {
                C4687hg.a(C4876s9.this, function0);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4876s9 this_asDispatcher, final Function0 it) {
        Intrinsics.checkNotNullParameter(this_asDispatcher, "$this_asDispatcher");
        Intrinsics.checkNotNullParameter(it, "it");
        this_asDispatcher.a(new Runnable() { // from class: com.ironsource.hg$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                C4687hg.b(Function0.this);
            }
        });
    }
}
