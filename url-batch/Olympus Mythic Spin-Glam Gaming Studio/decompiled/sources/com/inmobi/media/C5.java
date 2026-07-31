package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.CrashConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class C5 implements A5 {
    public volatile CrashConfig a;
    public final Kc b;
    public final List c;

    public C5(Context context, CrashConfig crashConfig, Kc eventBus) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(crashConfig, "crashConfig");
        Intrinsics.checkNotNullParameter(eventBus, "eventBus");
        this.a = crashConfig;
        this.b = eventBus;
        List synchronizedList = Collections.synchronizedList(new ArrayList());
        Intrinsics.checkNotNullExpressionValue(synchronizedList, "synchronizedList(...)");
        this.c = synchronizedList;
        if (this.a.getCrashConfig().getEnabled()) {
            synchronizedList.add(new C3856a5(Thread.getDefaultUncaughtExceptionHandler(), this));
        }
        if (this.a.getAnr().getAppExitReason().getEnabled()) {
            F5.a.getClass();
            if (F5.t()) {
                synchronizedList.add(new C1(context, this, this.a.getAnr().getAppExitReason().getIncidentWaitInterval(), this.a.getAnr().getAppExitReason().getMaxNumberOfLines()));
            }
        }
        if (this.a.getAnr().getWatchdog().getEnabled()) {
            synchronizedList.add(new C3902c(this.a.getAnr().getWatchdog().getInterval(), this));
        }
    }

    public final void a(C3887ba incidentEvent) {
        int i;
        Intrinsics.checkNotNullParameter(incidentEvent, "incidentEvent");
        if ((incidentEvent instanceof D1) && this.a.getAnr().getAppExitReason().getEnabled()) {
            i = 152;
        } else if ((incidentEvent instanceof C3882b5) && this.a.getCrashConfig().getEnabled()) {
            i = 150;
        } else if (!(incidentEvent instanceof C4455wo) || !this.a.getAnr().getWatchdog().getEnabled()) {
            return;
        } else {
            i = 151;
        }
        this.b.b(new N2(i, incidentEvent.a, MapsKt.mapOf(TuplesKt.to("data", incidentEvent))));
    }
}
