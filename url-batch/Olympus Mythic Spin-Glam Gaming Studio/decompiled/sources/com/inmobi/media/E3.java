package com.inmobi.media;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.RootConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes10.dex */
public final class E3 {
    public static final E3 a = new E3();
    public static final Lazy b;
    public static CoroutineScope c;
    public static HandlerC4224o3 d;
    public static HandlerThread e;
    public static List f;
    public static final AtomicBoolean g;
    public static final AtomicBoolean h;
    public static final Object i;
    public static final LinkedHashMap j;
    public static final Function1 k;
    public static final B3 l;

    static {
        String TAG = E3.class.getSimpleName();
        b = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.E3$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return E3.b();
            }
        });
        f = new ArrayList();
        g = new AtomicBoolean(false);
        h = new AtomicBoolean(true);
        i = new Object();
        j = new LinkedHashMap();
        k = new Function1() { // from class: com.inmobi.media.E3$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return E3.a((N2) obj);
            }
        };
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.E3$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                E3.a();
            }
        };
        Context context = AbstractC4002fj.a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        AbstractC4002fj.g.submit(runnable);
        l = new B3();
    }

    public static final Unit a(N2 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int i2 = event.a;
        if (i2 == 1 || i2 == 2) {
            Intrinsics.checkNotNullExpressionValue("E3", "TAG");
            h.set(false);
        } else if (i2 != 10) {
            if (i2 != 11) {
                Intrinsics.checkNotNullExpressionValue("E3", "TAG");
            } else if (!Boolean.parseBoolean(event.b)) {
                f();
            }
        } else if (Intrinsics.areEqual("available", event.b)) {
            f();
        }
        return Unit.INSTANCE;
    }

    public static final void b(Z2 z2) {
        int i2 = z2.f;
        if (i2 > 0) {
            z2.f = i2 - 1;
            z2.g = System.currentTimeMillis();
            BuildersKt__BuildersKt.runBlocking$default(null, new D3(z2, null), 1, null);
        }
    }

    public static AdConfig.ImaiConfig c() {
        C4277q4 c4277q4 = AbstractC4015g4.a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        return ((AdConfig) AbstractC4015g4.a.a(AdConfig.class)).getImai();
    }

    public static void d() {
        try {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
            Intrinsics.checkNotNullExpressionValue("E3", "TAG");
            Intrinsics.checkNotNullParameter("E3", "name");
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 5L, timeUnit, linkedBlockingQueue, new M9("E3", false));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            c = CoroutineScopeKt.CoroutineScope(ExecutorsKt.from((ExecutorService) threadPoolExecutor).plus(SupervisorKt.SupervisorJob$default(null, 1, null)));
            HandlerThread handlerThread = new HandlerThread("pingHandlerThread");
            e = handlerThread;
            P6.a(handlerThread, "pingHandlerThread");
            HandlerThread handlerThread2 = e;
            Intrinsics.checkNotNull(handlerThread2);
            Looper looper = handlerThread2.getLooper();
            Intrinsics.checkNotNullExpressionValue(looper, "getLooper(...)");
            d = new HandlerC4224o3(looper);
            ((Kc) AbstractC4002fj.e.getValue()).a(new int[]{10, 11, 2, 1}, k);
        } catch (Exception e2) {
            Intrinsics.checkNotNullExpressionValue("E3", "TAG");
            e2.getMessage();
        }
    }

    public static boolean e() {
        C4277q4 c4277q4 = AbstractC4015g4.a;
        Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
        return !((RootConfig) AbstractC4015g4.a.a(RootConfig.class)).getMonetizationDisabled();
    }

    public static void f() {
        HandlerThread handlerThread;
        try {
            if (AbstractC3998ff.a() != null) {
                return;
            }
            synchronized (i) {
                try {
                    if (g.compareAndSet(false, true)) {
                        Intrinsics.checkNotNullExpressionValue("E3", "TAG");
                        if (e == null) {
                            HandlerThread handlerThread2 = new HandlerThread("pingHandlerThread");
                            e = handlerThread2;
                            P6.a(handlerThread2, "pingHandlerThread");
                        }
                        if (d == null && (handlerThread = e) != null) {
                            Looper looper = handlerThread.getLooper();
                            Intrinsics.checkNotNullExpressionValue(looper, "getLooper(...)");
                            d = new HandlerC4224o3(looper);
                        }
                        BuildersKt__BuildersKt.runBlocking$default(null, new C3(null), 1, null);
                    }
                    Unit unit = Unit.INSTANCE;
                } finally {
                }
            }
        } catch (Exception e2) {
            Intrinsics.checkNotNullExpressionValue("E3", "TAG");
            e2.getMessage();
        }
    }

    public static void g() {
        try {
            AtomicBoolean atomicBoolean = g;
            atomicBoolean.set(false);
            synchronized (i) {
                try {
                    if (!atomicBoolean.get()) {
                        HandlerThread handlerThread = e;
                        if (handlerThread != null) {
                            handlerThread.getLooper().quit();
                            handlerThread.interrupt();
                        }
                        e = null;
                        d = null;
                    }
                    Unit unit = Unit.INSTANCE;
                } finally {
                }
            }
        } catch (Exception e2) {
            Intrinsics.checkNotNullExpressionValue("E3", "TAG");
            e2.getMessage();
        }
    }

    public static final C3932d3 b() {
        return new C3932d3(AbstractC4334s9.b());
    }

    public static final HashMap a(Z2 z2) {
        HashMap hashMap = new HashMap();
        try {
            int maxRetries = (c().getMaxRetries() - z2.f) + 1;
            if (maxRetries > 0) {
                hashMap.put("X-im-retry-count", String.valueOf(maxRetries));
                return hashMap;
            }
        } catch (Exception unused) {
            Intrinsics.checkNotNullExpressionValue("E3", "TAG");
        }
        return hashMap;
    }

    public static final void a() {
        d();
    }

    public static void a(String url, boolean z, InterfaceC4466x9 interfaceC4466x9) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullExpressionValue("E3", "TAG");
        Ug.a(Rg.b, new C4381u3(url, z, interfaceC4466x9, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Z2 z2, C3851a0 c3851a0, InterfaceC4466x9 interfaceC4466x9, ContinuationImpl continuationImpl) {
        C4487y3 c4487y3;
        int i2;
        C3851a0 c3851a02;
        Z2 z22 = z2;
        InterfaceC4466x9 interfaceC4466x92 = interfaceC4466x9;
        if (continuationImpl instanceof C4487y3) {
            c4487y3 = (C4487y3) continuationImpl;
            int i3 = c4487y3.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c4487y3.f = i3 - Integer.MIN_VALUE;
                Object obj = c4487y3.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c4487y3.f;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (interfaceC4466x92 != null) {
                        Intrinsics.checkNotNullExpressionValue("E3", "TAG");
                        ((C4493y9) interfaceC4466x92).c("E3", "record Click");
                    }
                    C3932d3 c3932d3 = (C3932d3) b.getValue();
                    int maxDbEvents = c().getMaxDbEvents();
                    c4487y3.a = z22;
                    c3851a02 = c3851a0;
                    c4487y3.b = c3851a02;
                    c4487y3.c = interfaceC4466x92;
                    c4487y3.f = 1;
                    C4308r9 c4308r9 = c3932d3.a;
                    C3906c3 c3906c3 = new C3906c3(maxDbEvents, c3932d3, z22, null);
                    c4308r9.getClass();
                    Object a2 = c4308r9.a(new C4282q9(c4308r9, c3906c3, null), c4487y3);
                    if (a2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        a2 = Unit.INSTANCE;
                    }
                    if (a2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    InterfaceC4466x9 interfaceC4466x93 = c4487y3.c;
                    C3851a0 c3851a03 = c4487y3.b;
                    Z2 z23 = c4487y3.a;
                    ResultKt.throwOnFailure(obj);
                    c3851a02 = c3851a03;
                    interfaceC4466x92 = interfaceC4466x93;
                    z22 = z23;
                }
                if (c3851a02 != null) {
                    j.put(Integer.valueOf(z22.a), c3851a02);
                }
                if (AbstractC3998ff.a() == null) {
                    if (interfaceC4466x92 != null) {
                        Intrinsics.checkNotNullExpressionValue("E3", "TAG");
                        ((C4493y9) interfaceC4466x92).b("E3", "No network available. Saving click for later processing ...");
                    }
                    g.set(false);
                    g();
                } else {
                    if (interfaceC4466x92 != null) {
                        Intrinsics.checkNotNullExpressionValue("E3", "TAG");
                        ((C4493y9) interfaceC4466x92).a("E3", "submit click - " + z22.a);
                    }
                    CoroutineScope coroutineScope = c;
                    if (coroutineScope != null) {
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C4513z3(z22, interfaceC4466x92, null), 3, null);
                    }
                }
                return Unit.INSTANCE;
            }
        }
        c4487y3 = new C4487y3(this, continuationImpl);
        Object obj2 = c4487y3.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c4487y3.f;
        if (i2 != 0) {
        }
        if (c3851a02 != null) {
        }
        if (AbstractC3998ff.a() == null) {
        }
        return Unit.INSTANCE;
    }

    public static void a(Z2 click, String reason) {
        Intrinsics.checkNotNullParameter(click, "click");
        Intrinsics.checkNotNullParameter(reason, "error");
        LinkedHashMap linkedHashMap = j;
        C3851a0 c3851a0 = (C3851a0) linkedHashMap.get(Integer.valueOf(click.a));
        if (c3851a0 != null) {
            Intrinsics.checkNotNullParameter(click, "click");
            Intrinsics.checkNotNullParameter(reason, "error");
            Fk fk = c3851a0.b;
            Intrinsics.checkNotNullParameter(reason, "reason");
            LinkedHashMap a2 = fk.a();
            a2.put("networkType", F5.g());
            a2.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2178);
            a2.put("reason", reason);
            String str = fk.d;
            if (str == null) {
                str = "";
            }
            a2.put("impressionId", str);
            C4425vk c4425vk = C4425vk.a;
            C4425vk.b("AdImpressionSuccessful", a2, EnumC4530zk.a);
        }
        linkedHashMap.remove(Integer.valueOf(click.a));
    }
}
