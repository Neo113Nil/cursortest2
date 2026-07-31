package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.w, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C5760w implements InterfaceC5786x {
    public final Context a;

    public C5760w(@NotNull Context context) {
        this.a = context;
    }

    @Nullable
    public final String a() {
        C5661s4 l = C5661s4.l();
        Context context = this.a;
        C5382ha c5382ha = l.u;
        if (c5382ha == null) {
            synchronized (l) {
                try {
                    c5382ha = l.u;
                    if (c5382ha == null) {
                        c5382ha = new C5382ha(context);
                        l.u = c5382ha;
                    }
                } finally {
                }
            }
        }
        Bundle applicationMetaData = c5382ha.d.getApplicationMetaData(c5382ha.a);
        if (applicationMetaData != null) {
            return applicationMetaData.getString("io.appmetrica.analytics.plugin_supported_ad_revenue_sources");
        }
        return null;
    }
}
