package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/* renamed from: com.inmobi.media.q3, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4276q3 {
    public final InterfaceC4355t3 a;

    public C4276q3(InterfaceC4355t3 mEventHandler) {
        Intrinsics.checkNotNullParameter(mEventHandler, "mEventHandler");
        this.a = mEventHandler;
    }

    public static final Unit b(Z2 z2) {
        E3 e3 = E3.a;
        Intrinsics.checkNotNullExpressionValue("E3", "access$getTAG$p(...)");
        String str = z2.b;
        return Unit.INSTANCE;
    }

    public final void a(final Z2 click) {
        Intrinsics.checkNotNullParameter(click, "click");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.inmobi.media.q3$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C4276q3.a(Z2.this, this);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [T, com.inmobi.media.Lo] */
    public static final void a(final Z2 z2, C4276q3 c4276q3) {
        Xe xe = new Xe(z2.b, E3.a(z2), null, null, null, false, 60);
        int pingTimeout = E3.c().getPingTimeout();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ?? lo = new Lo(xe, new C4250p3(new AtomicBoolean(false), ref$ObjectRef, c4276q3, z2), pingTimeout * 1000, new Function0() { // from class: com.inmobi.media.q3$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return C4276q3.b(Z2.this);
            }
        });
        ref$ObjectRef.element = lo;
        lo.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(AtomicBoolean atomicBoolean, Ref$ObjectRef ref$ObjectRef, C4276q3 c4276q3, Z2 z2, boolean z) {
        if (atomicBoolean.compareAndSet(false, true)) {
            Lo lo = (Lo) ref$ObjectRef.element;
            if (lo != null) {
                lo.a();
            }
            if (z) {
                c4276q3.a.a(z2);
            } else {
                c4276q3.a.a(z2, EnumC4069i6.d);
            }
        }
    }
}
