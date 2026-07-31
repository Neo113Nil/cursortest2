package io.bidmachine.rendering.internal.event;

import io.bidmachine.rendering.model.EventTaskParams;
import io.bidmachine.rendering.model.EventTaskType;
import io.bidmachine.rendering.model.EventType;
import io.bidmachine.util.SystemComponent;
import io.bidmachine.util.UtilsKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes14.dex */
public final class c implements io.bidmachine.rendering.internal.event.b {
    private final String a;
    private final e b;
    private final e c;
    private final d d;
    private final CoroutineScope e;
    private final io.bidmachine.rendering.internal.f f;
    private final Map g;

    public final class a implements Function1 {
        private final EventType a;
        private final List b;
        private final Object[] c;
        final /* synthetic */ c d;

        public a(c cVar, EventType eventType, List baseEventTaskParamsList, Object... params) {
            Intrinsics.checkNotNullParameter(eventType, "eventType");
            Intrinsics.checkNotNullParameter(baseEventTaskParamsList, "baseEventTaskParamsList");
            Intrinsics.checkNotNullParameter(params, "params");
            this.d = cVar;
            this.a = eventType;
            this.b = baseEventTaskParamsList;
            this.c = params;
        }

        public void a(List list) {
            Unit unit;
            if (list != null) {
                c cVar = this.d;
                EventType eventType = this.a;
                Object[] objArr = this.c;
                cVar.a(list, eventType, Arrays.copyOf(objArr, objArr.length));
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                c cVar2 = this.d;
                List list2 = this.b;
                EventType eventType2 = this.a;
                Object[] objArr2 = this.c;
                cVar2.b(list2, eventType2, Arrays.copyOf(objArr2, objArr2.length));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((List) obj);
            return Unit.INSTANCE;
        }
    }

    static final class b extends SuspendLambda implements Function2 {
        int a;
        final /* synthetic */ Object[] c;
        final /* synthetic */ EventType d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Object[] objArr, EventType eventType, Continuation continuation) {
            super(2, continuation);
            this.c = objArr;
            this.d = eventType;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return c.this.new b(this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            e eVar = c.this.c;
            List mutableList = CollectionsKt.toMutableList((Collection) ArraysKt.filterNotNull(this.c));
            mutableList.add(0, this.d);
            if (eVar.a(mutableList)) {
                return Unit.INSTANCE;
            }
            List list = (List) c.this.g.get(this.d);
            if (list != null) {
                c cVar = c.this;
                EventType eventType = this.d;
                Object[] objArr = this.c;
                cVar.a(list, eventType, Arrays.copyOf(objArr, objArr.length));
            }
            return Unit.INSTANCE;
        }
    }

    public c(String sourceName, e stateGroupEventInterceptor, e animationEventInterceptor, d callbackProcessor, CoroutineScope coroutineScope, io.bidmachine.rendering.internal.f coroutineDispatchers, Map map) {
        Intrinsics.checkNotNullParameter(sourceName, "sourceName");
        Intrinsics.checkNotNullParameter(stateGroupEventInterceptor, "stateGroupEventInterceptor");
        Intrinsics.checkNotNullParameter(animationEventInterceptor, "animationEventInterceptor");
        Intrinsics.checkNotNullParameter(callbackProcessor, "callbackProcessor");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        this.a = sourceName;
        this.b = stateGroupEventInterceptor;
        this.c = animationEventInterceptor;
        this.d = callbackProcessor;
        this.e = coroutineScope;
        this.f = coroutineDispatchers;
        this.g = map == null ? new EnumMap(EventType.class) : map;
    }

    @Override // io.bidmachine.rendering.internal.event.b
    public void c() {
        a(EventType.OnThirdQuartile, new Object[0]);
    }

    @Override // io.bidmachine.rendering.internal.event.b
    public void d() {
        a(EventType.OnSkip, new Object[0]);
    }

    @Override // io.bidmachine.rendering.internal.event.b
    public void e() {
        a(EventType.OnBillableImpression, new Object[0]);
    }

    @Override // io.bidmachine.rendering.internal.event.b
    public void f() {
        a(EventType.OnExpand, new Object[0]);
    }

    @Override // io.bidmachine.rendering.internal.event.b
    public String g() {
        return this.a;
    }

    @Override // io.bidmachine.rendering.internal.event.b
    public void h() {
        a(EventType.OnPause, new Object[0]);
    }

    @Override // io.bidmachine.rendering.internal.event.b
    public void i() {
        a(EventType.OnCollapse, new Object[0]);
    }

    @Override // io.bidmachine.rendering.internal.event.b
    public void j() {
        a(EventType.OnMidpoint, new Object[0]);
    }

    @Override // io.bidmachine.rendering.internal.event.b
    public void k() {
        a(EventType.OnScheduled, new Object[0]);
    }

    @Override // io.bidmachine.rendering.internal.event.b
    public void l() {
        a(EventType.OnFirstQuartile, new Object[0]);
    }

    @Override // io.bidmachine.rendering.internal.event.b
    public void m() {
        a(EventType.OnStart, new Object[0]);
    }

    @Override // io.bidmachine.rendering.internal.event.b
    public void n() {
        a(EventType.OnImpression, new Object[0]);
    }

    @Override // io.bidmachine.rendering.internal.event.b
    public void onClose() {
        a(EventType.OnClose, new Object[0]);
    }

    @Override // io.bidmachine.rendering.internal.event.b
    public void onUseCustomClose(boolean z) {
        a(EventType.OnUseCustomClose, Boolean.valueOf(z));
    }

    @Override // io.bidmachine.rendering.internal.event.b
    public void a(int i) {
        a(EventType.OnClick, Integer.valueOf(i));
    }

    @Override // io.bidmachine.rendering.internal.event.b
    public void b(Integer num) {
        a(EventType.OnMute, num);
    }

    @Override // io.bidmachine.rendering.internal.event.b
    public void a(SystemComponent systemComponent) {
        a(EventType.OnClickResolved, systemComponent);
    }

    @Override // io.bidmachine.rendering.internal.event.b
    public void b() {
        a(EventType.OnResume, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(List list, EventType eventType, Object... objArr) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.d.a(eventType, (EventTaskParams) it.next(), Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Override // io.bidmachine.rendering.internal.event.b
    public void a(Integer num) {
        a(EventType.OnUnMute, num);
    }

    @Override // io.bidmachine.rendering.internal.event.b
    public void a() {
        a(EventType.OnComplete, new Object[0]);
    }

    @Override // io.bidmachine.rendering.internal.event.b
    public void a(long j, long j2) {
        a(EventType.OnProgress, Long.valueOf(j), Long.valueOf(j2));
    }

    @Override // io.bidmachine.rendering.internal.event.b
    public void a(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        a(EventType.OnNavigate, url);
    }

    public final void a(EventType eventType, Object... params) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(params, "params");
        BuildersKt__Builders_commonKt.launch$default(this.e, this.f.b(), null, new b(params, eventType, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(List list, EventType eventType, Object... objArr) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!this.b.a(((EventTaskParams) obj2).getStateGroups())) {
                arrayList.add(obj2);
            }
        }
        List mutableList = CollectionsKt.toMutableList((Collection) arrayList);
        Iterator it = mutableList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((EventTaskParams) obj).getEventTaskType() == EventTaskType.RequestPermission) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (obj != null) {
            mutableList.remove(obj);
        }
        EventTaskParams eventTaskParams = (EventTaskParams) obj;
        if (eventTaskParams != null) {
            d dVar = this.d;
            Object firstOrNull = ArraysKt.firstOrNull(objArr);
            dVar.a(eventTaskParams, eventType, firstOrNull != null ? UtilsKt.toStringOrDefault$default(firstOrNull, null, 1, null) : null, mutableList, new a(this, eventType, mutableList, Arrays.copyOf(objArr, objArr.length)));
            return;
        }
        b(mutableList, eventType, Arrays.copyOf(objArr, objArr.length));
    }
}
