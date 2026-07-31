package io.appmetrica.analytics.impl;

import android.content.Context;
import com.pubmatic.sdk.common.POBCommonConstants;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.ModulesFacade;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;

/* loaded from: classes10.dex */
public final class H0 {
    public final Xb a = new Xb(C5661s4.l().d());
    public final Yb b = new Yb();
    public final C5203ac c = new C5203ac();

    public final void a(final String str, final String str2, final String str3) {
        Xb xb = this.a;
        if (xb.c.a((Void) null).a && xb.d.a(str).a && xb.e.a(str2).a && xb.f.a(str3).a) {
            this.b.getClass();
            ((U9) C5661s4.l().c.a()).b.post(new Runnable() { // from class: io.appmetrica.analytics.impl.H0$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    H0.a(H0.this, str, str2, str3);
                }
            });
            return;
        }
        String str4 = "Failed report event from sender: " + str + " with name = " + str2 + " and payload = " + str3;
        PublicLogger.INSTANCE.getAnonymousInstance().warning("[AppMetricaLibraryAdapterProxy]" + str4, new Object[0]);
    }

    public static final void a(H0 h0, String str, String str2, String str3) {
        List list;
        Context a;
        C5203ac c5203ac = h0.c;
        c5203ac.getClass();
        if (str == null) {
            str = POBCommonConstants.NULL_VALUE;
        }
        Pair pair = TuplesKt.to("sender", str);
        if (str2 == null) {
            str2 = POBCommonConstants.NULL_VALUE;
        }
        Pair pair2 = TuplesKt.to("event", str2);
        if (str3 == null) {
            str3 = POBCommonConstants.NULL_VALUE;
        }
        Map<String, Object> mutableMapOf = MapsKt.mutableMapOf(pair, pair2, TuplesKt.to("payload", str3));
        ModuleEvent.Builder withName = ModuleEvent.newBuilder(4).withName("appmetrica_system_event_42");
        synchronized (c5203ac) {
            try {
                if (c5203ac.a == null && (a = C5661s4.l().g.a()) != null) {
                    c5203ac.a = CollectionsKt.listOf((Object[]) new InterfaceC5708u[]{new C5463ke(), new C5758vn(a), new cp()});
                }
                list = c5203ac.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC5708u) it.next()).a(mutableMapOf);
            }
        }
        ModulesFacade.reportEvent(withName.withAttributes(mutableMapOf).build());
    }
}
