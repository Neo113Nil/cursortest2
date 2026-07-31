package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.login.LoginLogger;
import com.moloco.sdk.acm.CountEvent;
import com.moloco.sdk.acm.TimerEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.MolocoLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@StabilityInferred
/* loaded from: classes14.dex */
public final class e {

    @NotNull
    public static final a d = new a(null);
    public static final int e = 8;

    @NotNull
    public static final String f = "CompositeEventHandler";

    @NotNull
    public final Set<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a> a;

    @NotNull
    public final MetricsRecorder b;

    @NotNull
    public final Lazy c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@NotNull Set<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a> eventHandlers, @NotNull MetricsRecorder metricsRecorder) {
        Intrinsics.checkNotNullParameter(eventHandlers, "eventHandlers");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.a = eventHandlers;
        this.b = metricsRecorder;
        this.c = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.e$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return e.a(e.this);
            }
        });
    }

    public final Map<String, List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a>> a() {
        return (Map) this.c.getValue();
    }

    public static final Map a(e eVar) {
        Set<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a> set = eVar.a;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a) it.next()).a());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
        for (Object obj : arrayList) {
            String str = (String) obj;
            Set<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a> set2 = eVar.a;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : set2) {
                if (((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a) obj2).a().contains(str)) {
                    arrayList2.add(obj2);
                }
            }
            linkedHashMap.put(obj, arrayList2);
        }
        return linkedHashMap;
    }

    public final void a(@NotNull String event) {
        TimerEvent timerEvent;
        String str;
        String str2;
        TimerEvent timerEvent2;
        TimerEvent timerEvent3;
        Intrinsics.checkNotNullParameter(event, "event");
        TimerEvent startTimerEvent = this.b.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.s.c());
        JSONObject jSONObject = new JSONObject(event);
        String string = jSONObject.getString("event");
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.debug$default(molocoLogger, f, "Event received: " + string, false, 4, null);
        List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a> list = a().get(string);
        if (list != null && !list.isEmpty()) {
            if (list.size() > 1) {
                timerEvent = startTimerEvent;
                str = LoginLogger.EVENT_EXTRAS_FAILURE;
                MolocoLogger.warn$default(molocoLogger, f, "Found multiple event handlers for event: " + string + ", using first one", null, false, 12, null);
                MetricsRecorder metricsRecorder = this.b;
                CountEvent withTag = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.L.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), str);
                Intrinsics.checkNotNull(string);
                metricsRecorder.recordCountEvent(withTag.withTag("event", string));
            } else {
                timerEvent = startTimerEvent;
                str = LoginLogger.EVENT_EXTRAS_FAILURE;
            }
            TimerEvent startTimerEvent2 = this.b.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.t.c());
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a) CollectionsKt.first((List) list);
            try {
                aVar.a(jSONObject);
                str2 = str;
                timerEvent2 = startTimerEvent2;
            } catch (Exception e2) {
                e = e2;
                str2 = str;
                timerEvent2 = startTimerEvent2;
            }
            try {
                MolocoLogger.info$default(molocoLogger, f, "Event handled: " + string, null, false, 12, null);
                MetricsRecorder metricsRecorder2 = this.b;
                Intrinsics.checkNotNull(string);
                TimerEvent withTag2 = timerEvent2.withTag("event", string).withTag("handler", aVar.b());
                com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.d;
                metricsRecorder2.recordTimerEvent(withTag2.withTag(dVar.c(), "success"));
                this.b.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.K.c()).withTag(dVar.c(), "success").withTag("handler", aVar.b()).withTag("event", string));
                timerEvent3 = timerEvent;
                try {
                    this.b.recordTimerEvent(timerEvent3.withTag(dVar.c(), "success").withTag("handler", aVar.b()).withTag("event", string));
                    return;
                } catch (Exception e3) {
                    e = e3;
                    MolocoLogger.warn$default(MolocoLogger.INSTANCE, f, "Event handling failed: " + string, e, false, 8, null);
                    MetricsRecorder metricsRecorder3 = this.b;
                    Intrinsics.checkNotNull(string);
                    TimerEvent withTag3 = timerEvent2.withTag("event", string).withTag("handler", aVar.b());
                    com.moloco.sdk.internal.client_metrics_data.d dVar2 = com.moloco.sdk.internal.client_metrics_data.d.b;
                    String c = dVar2.c();
                    String simpleName = e.getClass().getSimpleName();
                    Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                    TimerEvent withTag4 = withTag3.withTag(c, simpleName);
                    com.moloco.sdk.internal.client_metrics_data.d dVar3 = com.moloco.sdk.internal.client_metrics_data.d.d;
                    String str3 = str2;
                    metricsRecorder3.recordTimerEvent(withTag4.withTag(dVar3.c(), str3));
                    MetricsRecorder metricsRecorder4 = this.b;
                    CountEvent withTag5 = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.K.c()).withTag(dVar3.c(), str3);
                    String c2 = dVar2.c();
                    String simpleName2 = e.getClass().getSimpleName();
                    Intrinsics.checkNotNullExpressionValue(simpleName2, "getSimpleName(...)");
                    metricsRecorder4.recordCountEvent(withTag5.withTag(c2, simpleName2).withTag("handler", aVar.b()).withTag("event", string));
                    MetricsRecorder metricsRecorder5 = this.b;
                    TimerEvent withTag6 = timerEvent3.withTag(dVar3.c(), str3);
                    String c3 = dVar2.c();
                    String simpleName3 = e.getClass().getSimpleName();
                    Intrinsics.checkNotNullExpressionValue(simpleName3, "getSimpleName(...)");
                    metricsRecorder5.recordTimerEvent(withTag6.withTag(c3, simpleName3).withTag("handler", aVar.b()).withTag("event", string));
                    return;
                }
            } catch (Exception e4) {
                e = e4;
                timerEvent3 = timerEvent;
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, f, "Event handling failed: " + string, e, false, 8, null);
                MetricsRecorder metricsRecorder32 = this.b;
                Intrinsics.checkNotNull(string);
                TimerEvent withTag32 = timerEvent2.withTag("event", string).withTag("handler", aVar.b());
                com.moloco.sdk.internal.client_metrics_data.d dVar22 = com.moloco.sdk.internal.client_metrics_data.d.b;
                String c4 = dVar22.c();
                String simpleName4 = e.getClass().getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName4, "getSimpleName(...)");
                TimerEvent withTag42 = withTag32.withTag(c4, simpleName4);
                com.moloco.sdk.internal.client_metrics_data.d dVar32 = com.moloco.sdk.internal.client_metrics_data.d.d;
                String str32 = str2;
                metricsRecorder32.recordTimerEvent(withTag42.withTag(dVar32.c(), str32));
                MetricsRecorder metricsRecorder42 = this.b;
                CountEvent withTag52 = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.K.c()).withTag(dVar32.c(), str32);
                String c22 = dVar22.c();
                String simpleName22 = e.getClass().getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName22, "getSimpleName(...)");
                metricsRecorder42.recordCountEvent(withTag52.withTag(c22, simpleName22).withTag("handler", aVar.b()).withTag("event", string));
                MetricsRecorder metricsRecorder52 = this.b;
                TimerEvent withTag62 = timerEvent3.withTag(dVar32.c(), str32);
                String c32 = dVar22.c();
                String simpleName32 = e.getClass().getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName32, "getSimpleName(...)");
                metricsRecorder52.recordTimerEvent(withTag62.withTag(c32, simpleName32).withTag("handler", aVar.b()).withTag("event", string));
                return;
            }
        }
        MolocoLogger.error$default(molocoLogger, f, "Event not handled: " + string, null, false, 12, null);
        MetricsRecorder metricsRecorder6 = this.b;
        CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.K.c());
        com.moloco.sdk.internal.client_metrics_data.d dVar4 = com.moloco.sdk.internal.client_metrics_data.d.d;
        CountEvent withTag7 = countEvent.withTag(dVar4.c(), LoginLogger.EVENT_EXTRAS_FAILURE);
        com.moloco.sdk.internal.client_metrics_data.d dVar5 = com.moloco.sdk.internal.client_metrics_data.d.b;
        CountEvent withTag8 = withTag7.withTag(dVar5.c(), "no_handler");
        Intrinsics.checkNotNull(string);
        metricsRecorder6.recordCountEvent(withTag8.withTag("event", string));
        this.b.recordTimerEvent(startTimerEvent.withTag(dVar4.c(), LoginLogger.EVENT_EXTRAS_FAILURE).withTag(dVar5.c(), "no_handler").withTag("event", string));
    }
}
