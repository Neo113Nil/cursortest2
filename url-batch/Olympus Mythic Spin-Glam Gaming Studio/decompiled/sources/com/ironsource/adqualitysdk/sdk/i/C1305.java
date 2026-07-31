package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ｒ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C1305 extends ThreadPoolExecutor implements InterfaceC1111 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1303 f3598;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C1189 f3599;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1305(C1303 c1303, ThreadPoolExecutor threadPoolExecutor, C1189 c1189) {
        super(r1, r2, threadPoolExecutor.getKeepAliveTime(r5), r5, threadPoolExecutor.getQueue());
        this.f3598 = c1303;
        int corePoolSize = threadPoolExecutor.getCorePoolSize();
        int maximumPoolSize = threadPoolExecutor.getMaximumPoolSize();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f3599 = c1189;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f3598.m4103(this, this.f3599, StringFog.decrypt("bQYLTN6KfQNWNh1RyZ9hFFxqK0zein0DXA==\n", "OURONLvpCHc=\n"), runnable);
        super.execute(runnable);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1111
    /* renamed from: ﾒ */
    public final Object mo3996() {
        return this;
    }
}
