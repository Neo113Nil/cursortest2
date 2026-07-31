package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.CrashConfig;
import com.inmobi.media.core.config.models.TelemetryConfig;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.inmobi.media.ai, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC3869ai {
    public static Wb b;
    public static final Nb a = Nb.c;
    public static final AtomicBoolean c = new AtomicBoolean(false);
    public static final Zh d = new Zh();
    public static final ReentrantLock e = new ReentrantLock();
    public static final Function1 f = new Function1() { // from class: com.inmobi.media.ai$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return AbstractC3869ai.a((N2) obj);
        }
    };
    public static final ReferenceQueue g = new ReferenceQueue();
    public static final ConcurrentHashMap h = new ConcurrentHashMap();
    public static final AtomicBoolean i = new AtomicBoolean(false);

    public static final Unit a(N2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int i2 = it.a;
        if (i2 != 1 && i2 != 2) {
            switch (i2) {
                case 150:
                case 151:
                case 152:
                    Map map = it.c;
                    if (map != null && map.containsKey("data")) {
                        Object obj = it.c.get("data");
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.inmobi.commons.core.incident.IncidentEvent");
                        a((C3887ba) obj);
                        break;
                    }
                    break;
            }
        } else {
            a(i2);
            c.set(false);
            ((Kc) AbstractC4002fj.e.getValue()).a(f);
            b = null;
        }
        return Unit.INSTANCE;
    }

    public static void b() {
        if (b != null) {
            return;
        }
        ReentrantLock reentrantLock = e;
        if (reentrantLock.tryLock()) {
            try {
                if (b == null && c.get()) {
                    Context context = AbstractC4002fj.a;
                    if (context != null) {
                        C4277q4 c4277q4 = AbstractC4015g4.a;
                        Intrinsics.checkNotNullParameter(TelemetryConfig.class, "clazz");
                        TelemetryConfig.LoggingConfig loggingConfig = ((TelemetryConfig) AbstractC4015g4.a.a(TelemetryConfig.class)).getLoggingConfig();
                        b = new Wb(context, loggingConfig.getLoggingUrl(), loggingConfig.getRetryInterval() * 1000, loggingConfig.getExpiry(), loggingConfig.getMaxRetries(), loggingConfig.getMaxNoOfEntries());
                    }
                    Wb wb = b;
                    if (wb != null) {
                        B9.a(wb);
                    }
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                e.unlock();
                throw th;
            }
        }
    }

    public static final void c() {
        while (c.get()) {
            a();
        }
    }

    public static void a(Object obj, InterfaceC4466x9 interfaceC4466x9) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        try {
            C4277q4 c4277q4 = AbstractC4015g4.a;
            Intrinsics.checkNotNullParameter(TelemetryConfig.class, "clazz");
            if (((TelemetryConfig) AbstractC4015g4.a.a(TelemetryConfig.class)).getLoggingConfig().getEnabled()) {
                if (interfaceC4466x9 != null) {
                    ((C4493y9) interfaceC4466x9).a("RemoteLoggerComponent", "starting to track reference of " + obj);
                }
                if (interfaceC4466x9 != null) {
                    h.put(new PhantomReference(obj, g), new Pair(obj.toString(), new WeakReference(interfaceC4466x9)));
                    if (i.getAndSet(true)) {
                        return;
                    }
                    CoroutineScope coroutineScope = AbstractC3995fc.a;
                    Runnable runnable = new Runnable() { // from class: com.inmobi.media.ai$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC3869ai.c();
                        }
                    };
                    Intrinsics.checkNotNullParameter("RemoteLoggerComponent", "tag");
                    Intrinsics.checkNotNullParameter(runnable, "runnable");
                    try {
                        BuildersKt__Builders_commonKt.launch$default(AbstractC3995fc.a, null, null, new C3889bc(runnable, null), 3, null);
                    } catch (Exception unused) {
                    }
                }
            }
        } catch (Exception e2) {
            Lazy lazy = AbstractC3861aa.a;
            AbstractC4361t9.a(e2);
        }
    }

    public static double b(String str, String str2, TelemetryConfig.LoggingConfig loggingConfig) {
        switch (str.hashCode()) {
            case -1396342996:
                if (!str.equals("banner")) {
                    return 0.01d;
                }
                if (Intrinsics.areEqual(str2, "AB")) {
                    return loggingConfig.getBanner().getAb().getSamplePercent();
                }
                return loggingConfig.getBanner().getNonAb().getSamplePercent();
            case -1052618729:
                if (!str.equals("native")) {
                    return 0.01d;
                }
                if (Intrinsics.areEqual(str2, "AB")) {
                    return loggingConfig.getNative().getAb().getSamplePercent();
                }
                return loggingConfig.getNative().getNonAb().getSamplePercent();
            case -171121434:
                if (!str.equals("intNative")) {
                    return 0.01d;
                }
                if (Intrinsics.areEqual(str2, "AB")) {
                    return loggingConfig.getInt_native().getAb().getSamplePercent();
                }
                return loggingConfig.getInt_native().getNonAb().getSamplePercent();
            case 93166550:
                if (str.equals("audio")) {
                    return loggingConfig.getAudio().getNonAb().getSamplePercent();
                }
                return 0.01d;
            case 1957200954:
                if (!str.equals("intHtml")) {
                    return 0.01d;
                }
                if (Intrinsics.areEqual(str2, "AB")) {
                    return loggingConfig.getInt_html().getAb().getSamplePercent();
                }
                return loggingConfig.getInt_html().getNonAb().getSamplePercent();
            case 1966366787:
                if (str.equals("getToken")) {
                    return loggingConfig.getGetToken().getSamplePercent();
                }
                return 0.01d;
            default:
                return 0.01d;
        }
    }

    public static C4493y9 a(String logType, String placementType) {
        Intrinsics.checkNotNullParameter(logType, "logType");
        Intrinsics.checkNotNullParameter(placementType, "placementType");
        Context context = AbstractC4002fj.a;
        if (context != null) {
            try {
                b();
                C4277q4 c4277q4 = AbstractC4015g4.a;
                Intrinsics.checkNotNullParameter(TelemetryConfig.class, "clazz");
                TelemetryConfig.LoggingConfig loggingConfig = ((TelemetryConfig) AbstractC4015g4.a.a(TelemetryConfig.class)).getLoggingConfig();
                double b2 = b(logType, placementType, loggingConfig);
                Nb logLevel = a(logType, placementType, loggingConfig);
                boolean z = !loggingConfig.getEnabled();
                long expiry = loggingConfig.getExpiry() * 1000;
                int maxNoOfEntries = loggingConfig.getMaxNoOfEntries();
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(logLevel, "logLevel");
                return new C4493y9(context, b2, logLevel, z, maxNoOfEntries, expiry);
            } catch (Exception e2) {
                Lazy lazy = AbstractC3861aa.a;
                AbstractC4361t9.a(e2);
            }
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Nb a(String str, String str2, TelemetryConfig.LoggingConfig loggingConfig) {
        switch (str.hashCode()) {
            case -1396342996:
                if (str.equals("banner")) {
                    if (Intrinsics.areEqual(str2, "AB")) {
                        return Ob.a(loggingConfig.getBanner().getAb().getLogLevel());
                    }
                    return Ob.a(loggingConfig.getBanner().getNonAb().getLogLevel());
                }
                break;
            case -1052618729:
                if (str.equals("native")) {
                    if (Intrinsics.areEqual(str2, "AB")) {
                        return Ob.a(loggingConfig.getNative().getAb().getLogLevel());
                    }
                    return Ob.a(loggingConfig.getNative().getNonAb().getLogLevel());
                }
                break;
            case -171121434:
                if (str.equals("intNative")) {
                    if (Intrinsics.areEqual(str2, "AB")) {
                        return Ob.a(loggingConfig.getInt_native().getAb().getLogLevel());
                    }
                    return Ob.a(loggingConfig.getInt_native().getNonAb().getLogLevel());
                }
                break;
            case 93166550:
                if (str.equals("audio")) {
                    return Ob.a(loggingConfig.getAudio().getNonAb().getLogLevel());
                }
                break;
            case 1957200954:
                if (str.equals("intHtml")) {
                    if (Intrinsics.areEqual(str2, "AB")) {
                        return Ob.a(loggingConfig.getInt_html().getAb().getLogLevel());
                    }
                    return Ob.a(loggingConfig.getInt_html().getNonAb().getLogLevel());
                }
                break;
            case 1966366787:
                if (str.equals("getToken")) {
                    return Ob.a(loggingConfig.getGetToken().getLogLevel());
                }
                break;
        }
        return a;
    }

    public static void a() {
        WeakReference weakReference;
        InterfaceC4466x9 interfaceC4466x9;
        Reference remove = g.remove();
        ConcurrentHashMap concurrentHashMap = h;
        if (CollectionsKt.contains(concurrentHashMap.keySet(), remove)) {
            Pair pair = (Pair) concurrentHashMap.get(remove);
            if (pair != null && (weakReference = (WeakReference) pair.getSecond()) != null && (interfaceC4466x9 = (InterfaceC4466x9) weakReference.get()) != null) {
                ((C4493y9) interfaceC4466x9).a("ReferenceTracker", " reference " + pair.getFirst() + " reference is GCed.");
            }
            TypeIntrinsics.asMutableMap(concurrentHashMap).remove(remove);
        }
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (((WeakReference) ((Pair) entry.getValue()).getSecond()).get() == null) {
                h.remove(entry.getKey());
            }
        }
    }

    public static void a(C3887ba incident) {
        Intrinsics.checkNotNullParameter(incident, "incident");
        if (!(incident instanceof C3882b5) && !(incident instanceof C4455wo)) {
            C4277q4 c4277q4 = AbstractC4015g4.a;
            Intrinsics.checkNotNullParameter(CrashConfig.class, "clazz");
            C4277q4 c4277q42 = AbstractC4015g4.a;
            if (((CrashConfig) c4277q42.a(CrashConfig.class)).getAnr().getAppExitReason().getReportToLogs() && (incident instanceof D1)) {
                Intrinsics.checkNotNullParameter(CrashConfig.class, "clazz");
                C4099ja c4099ja = new C4099ja(((CrashConfig) c4277q42.a(CrashConfig.class)).getAnr().getAppExitReason().getIncompleteLogThresholdTime());
                String message = incident.a;
                String str = incident.b;
                String exitData = str == null ? "" : str;
                int i2 = ((D1) incident).g;
                long j = incident.c;
                Intrinsics.checkNotNullParameter(message, "message");
                Intrinsics.checkNotNullParameter(exitData, "exitData");
                CoroutineScope coroutineScope = AbstractC3995fc.a;
                AbstractC3967ec.a(new C4073ia(c4099ja, j, message, i2, exitData, null));
                return;
            }
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = B9.a;
        ArrayList arrayList = new ArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList2 = Zb.a;
        Iterator it = Yb.a().iterator();
        while (it.hasNext()) {
            arrayList.add(new Zi((Xh) it.next()));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Zi zi = (Zi) it2.next();
            Nb logLevel = Nb.c;
            String str2 = incident.a;
            long j2 = incident.c;
            String str3 = incident.b;
            if (str3 == null) {
                str3 = "";
            }
            String message2 = "TYPE - " + str2 + ", TIMESTAMP - " + j2 + ", PAYLOAD - " + str3;
            zi.getClass();
            Intrinsics.checkNotNullParameter(logLevel, "logLevel");
            Intrinsics.checkNotNullParameter("LOGGER CRASH", "tag");
            Intrinsics.checkNotNullParameter(message2, "message");
            zi.a.a(logLevel, "LOGGER CRASH", message2);
            if (incident instanceof C3882b5) {
                zi.a.b();
            }
        }
    }

    public static void a(int i2) {
        CopyOnWriteArrayList copyOnWriteArrayList = B9.a;
        ArrayList arrayList = new ArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList2 = Zb.a;
        Iterator it = Yb.a().iterator();
        while (it.hasNext()) {
            arrayList.add(new Zi((Xh) it.next()));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Zi zi = (Zi) it2.next();
            Nb logLevel = Nb.c;
            String message = "SYSTEM SHUTDOWN RECEIVED - " + i2;
            zi.getClass();
            Intrinsics.checkNotNullParameter(logLevel, "logLevel");
            Intrinsics.checkNotNullParameter("LOGGER CRASH", "tag");
            Intrinsics.checkNotNullParameter(message, "message");
            zi.a.a(logLevel, "LOGGER CRASH", message);
            zi.a.b();
        }
        c.set(false);
        ((Kc) AbstractC4002fj.e.getValue()).a(f);
        b = null;
    }
}
