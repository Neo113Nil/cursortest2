package com.inmobi.media;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;

/* renamed from: com.inmobi.media.p1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4248p1 implements E8 {
    public final C4274q1 a;
    public final Context b;
    public final C4493y9 c;
    public final C3903c0 d;
    public final CoroutineScope e;
    public final C4167m0 f;

    public C4248p1(Context context, Tc tc, C4274q1 adManagerContext) {
        Intrinsics.checkNotNullParameter(adManagerContext, "adManagerContext");
        this.a = adManagerContext;
        C4222o1 c4222o1 = new C4222o1(CoroutineExceptionHandler.Key, this);
        this.b = context;
        this.c = tc.a;
        C3903c0 c3903c0 = new C3903c0();
        this.d = c3903c0;
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(SupervisorKt.SupervisorJob$default(null, 1, null)).plus(c4222o1));
        this.e = CoroutineScope;
        this.f = new C4167m0(CoroutineScope, adManagerContext, c3903c0);
    }

    @Override // com.inmobi.media.E8
    public final CoroutineScope a() {
        return this.e;
    }

    @Override // com.inmobi.media.E8
    public final C4167m0 b() {
        return this.f;
    }

    @Override // com.inmobi.media.E8
    public final InterfaceC4466x9 c() {
        return this.c;
    }
}
