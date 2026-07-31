package com.ogury.ad.internal;

import com.ogury.core.internal.IntegrationLogger;
import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.SourceTag;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes9.dex */
public final class h3 extends Lambda implements Function0 {
    public final /* synthetic */ j3 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(j3 j3Var) {
        super(0);
        this.a = j3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        LogTag logTag = LogTag.INTERNAL;
        SourceTag sourceTag = SourceTag.ADS;
        IntegrationLogger.d(logTag, sourceTag, "[Setup] New synchronisation of the configuration has just been required");
        ne neVar = this.a.h;
        neVar.getClass();
        IntegrationLogger.d(logTag, sourceTag, "[Setup] Configuration has just been marked as obsolete");
        BuildersKt.runBlocking(Dispatchers.getIO(), new od(neVar.b, null));
        return this.a.h.a(false);
    }
}
