package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.inmobi.media.m0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4167m0 {
    public final CoroutineScope a;
    public final C4274q1 b;
    public final C3903c0 c;

    public C4167m0(CoroutineScope coroutineScope, C4274q1 adManagerContext, C3903c0 adLifecycleData) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(adManagerContext, "adManagerContext");
        Intrinsics.checkNotNullParameter(adLifecycleData, "adLifecycleData");
        this.a = coroutineScope;
        this.b = adManagerContext;
        this.c = adLifecycleData;
    }
}
