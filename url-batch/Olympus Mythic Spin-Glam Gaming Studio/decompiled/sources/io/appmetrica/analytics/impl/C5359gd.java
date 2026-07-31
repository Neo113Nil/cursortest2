package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider;
import io.appmetrica.analytics.coreutils.internal.permission.AlwaysAllowPermissionStrategy;
import io.appmetrica.analytics.coreutils.internal.permission.SinglePermissionStrategy;
import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.gd, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5359gd implements Hn {
    public final Context a;
    public final PermissionResolutionStrategy b;
    public final CellularNetworkTypeExtractor c;
    public final CachedDataProvider.CachedData d;

    public C5359gd(@NotNull Context context) {
        this.a = context;
        this.b = AndroidUtils.isApiAchieved(29) ? new SinglePermissionStrategy(Ka.k().j(), "android.permission.READ_PHONE_STATE") : new AlwaysAllowPermissionStrategy();
        this.c = new CellularNetworkTypeExtractor(context);
        long millis = TimeUnit.SECONDS.toMillis(20L);
        this.d = new CachedDataProvider.CachedData(millis, millis * 2, "mobile-connection");
    }

    @Override // io.appmetrica.analytics.impl.Hn
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized C5333fd a() {
        C5333fd c5333fd;
        try {
            c5333fd = (C5333fd) this.d.getData();
            if (c5333fd != null) {
                if (this.d.shouldUpdateData()) {
                }
            }
            c5333fd = new C5333fd(this.b.hasNecessaryPermissions(this.a) ? this.c.getNetworkType() : "unknown");
            this.d.setData(c5333fd);
        } catch (Throwable th) {
            throw th;
        }
        return c5333fd;
    }
}
