package com.inmobi.media;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.w6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4437w6 {
    public static final Lazy a = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.w6$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Object mo4828invoke() {
            return AbstractC4437w6.a();
        }
    });
    public static final Lazy b = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.w6$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Object mo4828invoke() {
            return AbstractC4437w6.c();
        }
    });
    public static final Lazy c = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.w6$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Object mo4828invoke() {
            return AbstractC4437w6.e();
        }
    });
    public static final Lazy d = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.w6$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Object mo4828invoke() {
            return AbstractC4437w6.b();
        }
    });
    public static final Lazy e = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.w6$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Object mo4828invoke() {
            return AbstractC4437w6.d();
        }
    });
    public static final Lazy f = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.w6$$ExternalSyntheticLambda5
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Object mo4828invoke() {
            return AbstractC4437w6.f();
        }
    });

    public static final ExecutorService a() {
        Intrinsics.checkNotNullParameter("ExecutorProvider.IO", "name");
        return Executors.newCachedThreadPool(new M9("ExecutorProvider.IO", false));
    }

    public static final ExecutorService b() {
        Intrinsics.checkNotNullParameter("ExecutorProvider.high", "name");
        return Executors.newCachedThreadPool(new M9("ExecutorProvider.high", false));
    }

    public static final ExecutorService c() {
        Intrinsics.checkNotNullParameter("ExecutorProvider.highIO", "name");
        return Executors.newCachedThreadPool(new M9("ExecutorProvider.highIO", false));
    }

    public static final ExecutorC4101jc d() {
        return new ExecutorC4101jc();
    }

    public static final ExecutorService e() {
        Intrinsics.checkNotNullParameter("ExecutorProvider.normal", "name");
        return Executors.newCachedThreadPool(new M9("ExecutorProvider.normal", false));
    }

    public static final ExecutorService f() {
        Intrinsics.checkNotNullParameter("ExecutorProvider.single", "name");
        return Executors.newSingleThreadExecutor(new M9("ExecutorProvider.single", false));
    }
}
