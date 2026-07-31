package com.inmobi.media;

import android.os.SystemClock;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.vd, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4418vd implements Eh {
    public final /* synthetic */ C4444wd a;

    public C4418vd(C4444wd c4444wd) {
        this.a = c4444wd;
    }

    @Override // com.inmobi.media.Eh
    public final boolean a() {
        long userTouchResetTime = this.a.a.b.a.b.getRendering().getUserTouchResetTime();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.a.b;
        return j != 0 && elapsedRealtime - j < userTouchResetTime;
    }

    @Override // com.inmobi.media.Eh
    public final boolean c() {
        return !this.a.a.b.a.b.getRendering().getAutoRedirectionEnforcement() || a();
    }

    @Override // com.inmobi.media.Eh
    public final long getViewTouchTimestamp() {
        return this.a.b;
    }

    @Override // com.inmobi.media.Eh
    public final void a(String api) {
        Intrinsics.checkNotNullParameter(api, "api");
        Map a = Hk.a(this.a.a.e.a);
        C4425vk c4425vk = C4425vk.a;
        C4425vk.b("BlockAutoRedirection", a, EnumC4530zk.a);
    }
}
