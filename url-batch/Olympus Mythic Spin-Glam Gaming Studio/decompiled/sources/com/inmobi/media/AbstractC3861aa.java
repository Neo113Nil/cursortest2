package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.CrashConfig;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.aa, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC3861aa {
    public static final Lazy a = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.aa$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Object mo4828invoke() {
            return AbstractC3861aa.b();
        }
    });
    public static final Z9 b;
    public static final C5 c;
    public static final Xa d;

    static {
        long currentTimeMillis = System.currentTimeMillis();
        b = new Z9();
        d = new Xa(a());
        Context context = AbstractC4002fj.a;
        if (context != null) {
            c = new C5(context, a(), (Kc) AbstractC4002fj.e.getValue());
        }
        if (a().getCrashConfig().getReportSessionInfo()) {
            C3934d5 type = C3934d5.d;
            Intrinsics.checkNotNullParameter(type, "type");
            Qa a2 = AbstractC3939da.a();
            if (a2 != null) {
                a2.a(type.a, currentTimeMillis, true);
            }
            Qa a3 = AbstractC3939da.a();
            if (a3 != null) {
                ConcurrentHashMap concurrentHashMap = Qa.b;
                a3.a("s-cnt", 0, false);
            }
        }
        if (AbstractC4420vf.a.getCrashConfig().getReportOOMInfo()) {
            for (AbstractC3988f5 type2 : CollectionsKt.listOf((Object[]) new AbstractC3988f5[]{C3960e5.d, C3908c5.d})) {
                Intrinsics.checkNotNullParameter(type2, "type");
                Qa a4 = AbstractC3939da.a();
                if (a4 != null) {
                    a4.a(type2.a, currentTimeMillis, true);
                }
            }
        }
    }

    public static CrashConfig a() {
        C4277q4 c4277q4 = AbstractC4015g4.a;
        Intrinsics.checkNotNullParameter(CrashConfig.class, "clazz");
        return (CrashConfig) AbstractC4015g4.a.a(CrashConfig.class);
    }

    public static final Y9 b() {
        return new Y9(AbstractC4334s9.b());
    }

    public static void c() {
        Qa a2;
        if (a().getCrashConfig().getReportSessionInfo() && (a2 = AbstractC3939da.a()) != null) {
            Intrinsics.checkNotNullParameter("s-cnt", "key");
            a2.a("s-cnt", a2.a.getInt("s-cnt", 0) + 1, false);
        }
        C5 c5 = c;
        if (c5 != null) {
            Iterator it = c5.c.iterator();
            while (it.hasNext()) {
                ((B5) it.next()).a();
            }
        }
        Xa xa = d;
        xa.getClass();
        Hl.a(new Ua(xa, null));
        ((Kc) AbstractC4002fj.e.getValue()).a(new int[]{2, 1, 152, 150, 151}, xa.d);
        C4277q4 c4277q4 = AbstractC4015g4.a;
        AbstractC4015g4.a("crashReporting", b);
    }

    public static void a(Q2 incident) {
        Intrinsics.checkNotNullParameter(incident, "event");
        Xa xa = d;
        xa.getClass();
        Intrinsics.checkNotNullParameter(incident, "incident");
        if (xa.a.getCatchConfig().getEnabled() && xa.c.b.a()) {
            Hl.a(new Ta(xa, incident, null));
        }
    }

    public static void a(JSONObject payload, boolean z, long j) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (a().getCrashConfig().getReportSessionInfo() && z) {
            C3934d5 crashType = C3934d5.d;
            Intrinsics.checkNotNullParameter(crashType, "crashType");
            Qa a2 = AbstractC3939da.a();
            long j2 = 0;
            if (a2 != null) {
                String key = crashType.a;
                Intrinsics.checkNotNullParameter(key, "key");
                long j3 = a2.a.getLong(key, 0L);
                String str = crashType.b;
                if (j3 == 0) {
                    a2.a(str, j, true);
                } else {
                    a2.a(str, j - j3, true);
                }
            }
            Intrinsics.checkNotNullParameter(crashType, "crashType");
            Qa a3 = AbstractC3939da.a();
            if (a3 != null) {
                String key2 = crashType.b;
                Intrinsics.checkNotNullParameter(key2, "key");
                j2 = a3.a.getLong(key2, 0L);
            }
            payload.put("crashFreeSessionLength", j2);
            Qa a4 = AbstractC3939da.a();
            int i = 0;
            if (a4 != null) {
                Intrinsics.checkNotNullParameter("s-cnt", "key");
                i = a4.a.getInt("s-cnt", 0);
            }
            payload.put("crashFreeSessionCount", i);
        }
    }
}
