package com.mobilefuse.sdk;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppLifecycleHelper.kt */
@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 3})
/* loaded from: classes9.dex */
final class AppLifecycleHelper$sam$java_lang_Runnable$0 implements Runnable {
    private final /* synthetic */ Function0 function;

    AppLifecycleHelper$sam$java_lang_Runnable$0(Function0 function0) {
        this.function = function0;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        Intrinsics.checkNotNullExpressionValue(this.function.mo4828invoke(), "invoke(...)");
    }
}
