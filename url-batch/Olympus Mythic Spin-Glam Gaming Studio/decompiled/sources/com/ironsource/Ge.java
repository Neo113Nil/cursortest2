package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.We;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes10.dex */
public final class Ge implements He {

    @NotNull
    private final U9 a = new U9();

    @NotNull
    private final C4876s9 b = new C4876s9();

    @NotNull
    private final InterfaceC4986y7 c = Kb.u.d().a();

    public static final class a extends AbstractRunnableC4756le {
        final /* synthetic */ Runnable b;

        a(Runnable runnable) {
            this.b = runnable;
        }

        @Override // com.ironsource.AbstractRunnableC4756le
        public void a() {
            this.b.run();
        }
    }

    @Override // com.ironsource.He
    @NotNull
    public InterfaceC4986y7 a() {
        return this.c;
    }

    @Override // com.ironsource.He
    public void b(@NotNull Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, callback, 0L, 2, null);
    }

    @Override // com.ironsource.He
    public void c(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.b.a(runnable);
    }

    @Override // com.ironsource.He
    public void d(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        IronSourceThreadManager.postMediationBackgroundTask$default(IronSourceThreadManager.INSTANCE, runnable, 0L, 2, null);
    }

    @Override // com.ironsource.He
    public void e() {
        com.ironsource.mediationsdk.p.h().I();
    }

    @Override // com.ironsource.He
    public void f() {
        Md.c().a();
    }

    @Override // com.ironsource.He
    @NotNull
    public U9 g() {
        return this.a;
    }

    @Override // com.ironsource.He
    public void a(@NotNull Runnable runnable, long j) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(runnable, j);
    }

    @Override // com.ironsource.He
    public boolean b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return IronSourceUtils.f(context);
    }

    @Override // com.ironsource.He
    @NotNull
    public String c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String b = com.ironsource.mediationsdk.p.h().b(context);
        Intrinsics.checkNotNullExpressionValue(b, "getInstance().getAdvertiserId(context)");
        return b;
    }

    @Override // com.ironsource.He
    public boolean d() {
        return IronSourceUtils.g();
    }

    @Override // com.ironsource.He
    public void a(@NotNull Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new a(callback), 0L, 2, null);
    }

    @Override // com.ironsource.He
    public void b() {
        Kb.u.d().q().a(new C4966x5(EnumC4984y5.USING_CACHE_FOR_INIT_EVENT, IronSourceUtils.b(false)));
    }

    @Override // com.ironsource.He
    @Nullable
    public C4573ba c() {
        return com.ironsource.mediationsdk.p.h().n();
    }

    @Override // com.ironsource.He
    public void a(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        if (TextUtils.isEmpty(value)) {
            return;
        }
        L6.a().a(key, value);
    }

    @Override // com.ironsource.He
    public void a(long j, @NotNull We.a responseOrigin) {
        Intrinsics.checkNotNullParameter(responseOrigin, "responseOrigin");
        com.ironsource.mediationsdk.p.h().a(j, responseOrigin);
    }

    @Override // com.ironsource.He
    @Nullable
    public We a(@NotNull Context context, @NotNull String appKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        return com.ironsource.mediationsdk.p.h().a(context, appKey);
    }

    @Override // com.ironsource.He
    @NotNull
    public String a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String a2 = a().a(context);
        Intrinsics.checkNotNullExpressionValue(a2, "deviceInfoService.getOrG…UniqueIdentifier(context)");
        return a2;
    }

    @Override // com.ironsource.He
    public void a(@NotNull F1 reporterSettings) {
        Intrinsics.checkNotNullParameter(reporterSettings, "reporterSettings");
        C4782n4.d().a(reporterSettings.b(), reporterSettings.d(), reporterSettings.c(), reporterSettings.e(), IronSourceUtils.d(), reporterSettings.a(), reporterSettings.g());
    }

    @Override // com.ironsource.He
    public void a(@NotNull Ee initStatus) {
        Intrinsics.checkNotNullParameter(initStatus, "initStatus");
        Fe.a.a(initStatus);
    }
}
