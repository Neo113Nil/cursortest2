package io.appmetrica.analytics.impl;

import android.content.Context;
import android.net.ConnectivityManager;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.coreapi.internal.system.NetworkType;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.EnumSet;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class F5 implements IExecutionPolicy {
    public final Context a;
    public final C5422j b = Ka.k().b();
    public final EnumSet c = EnumSet.of(NetworkType.OFFLINE);
    public final String d = "connection based";

    public F5(@NotNull Context context) {
        this.a = context;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final boolean canBeExecuted() {
        C5422j c5422j = this.b;
        Context context = this.a;
        c5422j.getClass();
        Xe xe = AbstractC5232bf.a;
        return !this.c.contains((NetworkType) SystemServiceUtils.accessSystemServiceSafelyOrDefault((ConnectivityManager) context.getSystemService("connectivity"), "getting connection type", "ConnectivityManager", NetworkType.UNDEFINED, new C5206af()));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    @NotNull
    public final String description() {
        return this.d;
    }
}
