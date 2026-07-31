package com.moloco.sdk.internal.services.bidtoken.providers;

import android.app.ActivityManager;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes14.dex */
public final class s implements j<r> {

    @NotNull
    public static final a d = new a(null);
    public static final int e = 8;

    @NotNull
    public static final String f = "MemorySignalProvider";

    @NotNull
    public final ActivityManager b;

    @NotNull
    public r c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public s(@NotNull ActivityManager activityManager) {
        Intrinsics.checkNotNullParameter(activityManager, "activityManager");
        this.b = activityManager;
        this.c = e();
    }

    public final boolean a(r rVar, r rVar2) {
        return (Intrinsics.areEqual(rVar.d(), rVar2.d()) && Intrinsics.areEqual(rVar.e(), rVar2.e()) && Intrinsics.areEqual(rVar.f(), rVar2.f())) ? false : true;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public boolean b() {
        r e2 = e();
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.debugBuildLog$default(molocoLogger, f, "[CBT] cached lm: " + this.c.d() + ", t: " + this.c.e() + ", tm: " + this.c.f(), false, 4, null);
        MolocoLogger.debugBuildLog$default(molocoLogger, f, "[CBT] current lm: " + e2.d() + ", t: " + e2.e() + ", tm: " + e2.f(), false, 4, null);
        boolean a2 = a(e2, this.c);
        StringBuilder sb = new StringBuilder();
        sb.append("[CBT] m needsRefresh: ");
        sb.append(a2);
        MolocoLogger.debugBuildLog$default(molocoLogger, f, sb.toString(), false, 4, null);
        return a2;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    @NotNull
    public String c() {
        return f;
    }

    public final r e() {
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            this.b.getMemoryInfo(memoryInfo);
            return new r(Boolean.valueOf(memoryInfo.lowMemory), Long.valueOf(memoryInfo.threshold), Long.valueOf(memoryInfo.totalMem));
        } catch (Exception e2) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, f, "[CBT] MI Error", e2, false, 8, null);
            return new r(null, null, null, 7, null);
        }
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    @NotNull
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public r d() {
        r rVar = this.c;
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, f, "[CBT] lm: " + rVar.d() + ", t: " + rVar.e() + ", tm: " + rVar.f(), false, 4, null);
        return rVar;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public void a() {
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, f, "[CBT] Updating m state", false, 4, null);
        this.c = e();
    }
}
