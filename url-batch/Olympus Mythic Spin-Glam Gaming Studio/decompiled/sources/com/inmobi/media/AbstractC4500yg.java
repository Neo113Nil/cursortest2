package com.inmobi.media;

import com.adjust.sdk.Constants;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.yandex.div.core.DivActionHandler;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.yg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4500yg {
    public final Fg a;
    public final ConcurrentHashMap b;
    public final C4446wf c;

    public AbstractC4500yg(Fg dao) {
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.a = dao;
        this.b = new ConcurrentHashMap();
        this.c = new C4446wf(a());
    }

    public static void a(C4053hg c4053hg, short s) {
        Bi bi = c4053hg.k;
        if (bi == null) {
            C3922cj c3922cj = AbstractC4526zg.a;
            AbstractC4526zg.a("PingFailed", MapsKt.mutableMapOf(TuplesKt.to(DivActionHandler.DivActionReason.TRIGGER, c4053hg.e), TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s)), TuplesKt.to("retryCount", Integer.valueOf(c4053hg.g))));
            return;
        }
        Hi hi = new Hi(bi);
        String priority = c4053hg.e;
        int i = c4053hg.g;
        Intrinsics.checkNotNullParameter(priority, "priority");
        Map a = hi.a();
        a.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s));
        a.put(DivActionHandler.DivActionReason.TRIGGER, priority);
        a.put("retryCount", String.valueOf(i));
        AbstractC4526zg.a("PingFailed", a);
    }

    public static AdConfig.PingsV2Config a() {
        C4277q4 c4277q4 = AbstractC4015g4.a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        return ((AdConfig) AbstractC4015g4.a.a(AdConfig.class)).getPingV2();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b3, code lost:
    
        if (r12 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a2, code lost:
    
        if (r12 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c3, code lost:
    
        if (r12 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x006c, code lost:
    
        if (r12 == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        C4474xg c4474xg;
        Object obj;
        int i;
        C4053hg c4053hg;
        if (continuationImpl instanceof C4474xg) {
            c4474xg = (C4474xg) continuationImpl;
            int i2 = c4474xg.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4474xg.d = i2 - Integer.MIN_VALUE;
                obj = c4474xg.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c4474xg.d;
                boolean z = true;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Fg fg = this.a;
                    c4474xg.a = str;
                    c4474xg.d = 1;
                    C4308r9 c4308r9 = fg.a;
                    c4308r9.getClass();
                    obj = c4308r9.a(new C4072i9(c4308r9, "SELECT COUNT(*) FROM pings", null), c4474xg);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            str = c4474xg.a;
                            ResultKt.throwOnFailure(obj);
                            c4053hg = (C4053hg) obj;
                            if (c4053hg == null) {
                                Fg fg2 = this.a;
                                c4474xg.a = str;
                                c4474xg.d = 3;
                                obj = fg2.a(Constants.HIGH, c4474xg);
                            }
                            if (c4053hg != null) {
                            }
                            return Boxing.boxBoolean(z);
                        }
                        if (i == 3) {
                            str = c4474xg.a;
                            ResultKt.throwOnFailure(obj);
                            c4053hg = (C4053hg) obj;
                            if (c4053hg != null) {
                            }
                            return Boxing.boxBoolean(z);
                        }
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str = c4474xg.a;
                        ResultKt.throwOnFailure(obj);
                        c4053hg = (C4053hg) obj;
                        if (c4053hg != null) {
                            a(c4053hg, (short) (Intrinsics.areEqual(str, Constants.HIGH) ? 2259 : 2260));
                        } else {
                            z = false;
                        }
                        return Boxing.boxBoolean(z);
                    }
                    str = c4474xg.a;
                    ResultKt.throwOnFailure(obj);
                }
                if (((Number) obj).intValue() >= a().getMaxEntries()) {
                    return Boxing.boxBoolean(true);
                }
                C3922cj c3922cj = AbstractC4526zg.a;
                AbstractC4526zg.a("PingDBMaxLimitReached", new LinkedHashMap());
                if (Intrinsics.areEqual(str, Constants.HIGH)) {
                    Fg fg3 = this.a;
                    c4474xg.a = str;
                    c4474xg.d = 2;
                    obj = fg3.a(Constants.NORMAL, c4474xg);
                } else {
                    Fg fg4 = this.a;
                    c4474xg.a = str;
                    c4474xg.d = 4;
                    obj = fg4.a(Constants.NORMAL, c4474xg);
                }
                return coroutine_suspended;
            }
        }
        c4474xg = new C4474xg(this, continuationImpl);
        obj = c4474xg.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4474xg.d;
        boolean z2 = true;
        if (i != 0) {
        }
        if (((Number) obj).intValue() >= a().getMaxEntries()) {
        }
    }

    public static void a(int i, String str, short s, C4053hg ping, long j, InterfaceC4421vg interfaceC4421vg) {
        Intrinsics.checkNotNullParameter(ping, "ping");
        Intrinsics.checkNotNullExpressionValue(AbstractC4500yg.class.getSimpleName(), "getSimpleName(...)");
        String str2 = ping.a;
        Intrinsics.checkNotNullExpressionValue(AbstractC4500yg.class.getSimpleName(), "getSimpleName(...)");
        Objects.toString(interfaceC4421vg);
        if (interfaceC4421vg != null) {
            ((C4395ug) interfaceC4421vg).a(ping, i, str, ping.g, j);
        } else {
            a(ping, s);
        }
    }

    public static void a(C4210ng c4210ng, InterfaceC4421vg interfaceC4421vg) {
        Intrinsics.checkNotNullExpressionValue(AbstractC4500yg.class.getSimpleName(), "getSimpleName(...)");
        String str = c4210ng.a.a;
        Objects.toString(interfaceC4421vg);
        if (interfaceC4421vg != null) {
            ((C4395ug) interfaceC4421vg).a(c4210ng.a, c4210ng.b, c4210ng.d);
            return;
        }
        C4053hg c4053hg = c4210ng.a;
        Bi bi = c4053hg.k;
        if (bi != null) {
            Hi hi = new Hi(bi);
            String priority = c4053hg.e;
            long j = c4053hg.i;
            Intrinsics.checkNotNullParameter(priority, "priority");
            Map a = hi.a();
            a.put(DivActionHandler.DivActionReason.TRIGGER, priority);
            a.put("latency", Long.valueOf(j));
            AbstractC4526zg.a("PingSuccess", a);
            return;
        }
        C3922cj c3922cj = AbstractC4526zg.a;
        AbstractC4526zg.a("PingSuccess", MapsKt.mutableMapOf(TuplesKt.to(DivActionHandler.DivActionReason.TRIGGER, c4053hg.e), TuplesKt.to("retryCount", Integer.valueOf(c4053hg.g))));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C4210ng c4210ng, InterfaceC4421vg interfaceC4421vg, Continuation continuation) {
        C4447wg c4447wg;
        int i;
        int maxRetries;
        Pair pair;
        C4210ng c4210ng2;
        C4053hg c4053hg;
        InterfaceC4421vg interfaceC4421vg2;
        InterfaceC4421vg interfaceC4421vg3;
        C4053hg c4053hg2;
        InterfaceC4421vg interfaceC4421vg4;
        C4210ng c4210ng3 = c4210ng;
        if (continuation instanceof C4447wg) {
            c4447wg = (C4447wg) continuation;
            int i2 = c4447wg.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4447wg.f = i2 - Integer.MIN_VALUE;
                C4447wg c4447wg2 = c4447wg;
                Object obj = c4447wg2.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c4447wg2.f;
                if (i == 0) {
                    if (i == 1) {
                        InterfaceC4421vg interfaceC4421vg5 = c4447wg2.b;
                        C4210ng c4210ng4 = c4447wg2.a;
                        ResultKt.throwOnFailure(obj);
                        interfaceC4421vg4 = interfaceC4421vg5;
                        c4210ng3 = c4210ng4;
                        a(c4210ng3.b, "Redirect URL is malformed", (short) 2258, c4210ng3.a, c4210ng3.d, interfaceC4421vg4);
                        return Unit.INSTANCE;
                    }
                    if (i == 2) {
                        C4053hg c4053hg3 = c4447wg2.c;
                        InterfaceC4421vg interfaceC4421vg6 = c4447wg2.b;
                        C4210ng c4210ng5 = c4447wg2.a;
                        ResultKt.throwOnFailure(obj);
                        c4053hg2 = c4053hg3;
                        interfaceC4421vg3 = interfaceC4421vg6;
                        c4210ng3 = c4210ng5;
                        a(c4210ng3.b, c4210ng3.c, (short) 2249, c4053hg2, c4210ng3.d, interfaceC4421vg3);
                        return Unit.INSTANCE;
                    }
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C4053hg c4053hg4 = c4447wg2.c;
                    InterfaceC4421vg interfaceC4421vg7 = c4447wg2.b;
                    C4210ng c4210ng6 = c4447wg2.a;
                    ResultKt.throwOnFailure(obj);
                    interfaceC4421vg2 = interfaceC4421vg7;
                    c4210ng2 = c4210ng6;
                    c4053hg = c4053hg4;
                    a(c4210ng2.b, c4210ng2.c, (short) 2247, c4053hg, c4210ng2.d, interfaceC4421vg2);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                String str = c4210ng3.a.a;
                int i3 = c4210ng3.b;
                C4017g6 c4017g6 = EnumC4069i6.b;
                if (i3 == 178) {
                    String str2 = c4210ng3.a.a;
                    Fg fg = this.a;
                    C4053hg c4053hg5 = c4210ng3.a;
                    c4447wg2.a = c4210ng3;
                    c4447wg2.b = interfaceC4421vg;
                    c4447wg2.f = 1;
                    Object a = fg.a.a("pings", "id=?", new String[]{c4053hg5.b}, c4447wg2);
                    if (a != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        a = Unit.INSTANCE;
                    }
                    if (a != coroutine_suspended) {
                        interfaceC4421vg4 = interfaceC4421vg;
                        a(c4210ng3.b, "Redirect URL is malformed", (short) 2258, c4210ng3.a, c4210ng3.d, interfaceC4421vg4);
                        return Unit.INSTANCE;
                    }
                } else {
                    C4053hg c4053hg6 = c4210ng3.a;
                    int i4 = c4053hg6.g + 1;
                    if (Intrinsics.areEqual(c4053hg6.e, Constants.HIGH)) {
                        maxRetries = a().getRetryConfig().getHigh().getMaxRetries();
                    } else {
                        maxRetries = a().getRetryConfig().getNormal().getMaxRetries();
                    }
                    if (i4 > maxRetries) {
                        Fg fg2 = this.a;
                        c4447wg2.a = c4210ng3;
                        c4447wg2.b = interfaceC4421vg;
                        c4447wg2.c = c4053hg6;
                        c4447wg2.f = 2;
                        Object a2 = fg2.a.a("pings", "id=?", new String[]{c4053hg6.b}, c4447wg2);
                        if (a2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            a2 = Unit.INSTANCE;
                        }
                        if (a2 != coroutine_suspended) {
                            interfaceC4421vg3 = interfaceC4421vg;
                            c4053hg2 = c4053hg6;
                            a(c4210ng3.b, c4210ng3.c, (short) 2249, c4053hg2, c4210ng3.d, interfaceC4421vg3);
                            return Unit.INSTANCE;
                        }
                    } else {
                        if (Intrinsics.areEqual(c4053hg6.e, Constants.HIGH)) {
                            pair = new Pair(Boxing.boxLong(a().getRetryConfig().getHigh().getRetryInterval()), Boxing.boxDouble(a().getRetryConfig().getHigh().getFactor()));
                        } else {
                            pair = new Pair(Boxing.boxLong(a().getRetryConfig().getNormal().getRetryInterval()), Boxing.boxDouble(a().getRetryConfig().getNormal().getFactor()));
                        }
                        Long boxLong = Boxing.boxLong(System.currentTimeMillis() + ((long) (Math.pow(((Number) pair.component2()).doubleValue(), i4) * ((Number) pair.component1()).longValue() * 1000)));
                        String url = c4053hg6.a;
                        String id = c4053hg6.b;
                        Map headers = c4053hg6.c;
                        boolean z = c4053hg6.d;
                        String priority = c4053hg6.e;
                        boolean z2 = c4053hg6.f;
                        String ownerId = c4053hg6.h;
                        long j = c4053hg6.i;
                        Bi bi = c4053hg6.k;
                        Intrinsics.checkNotNullParameter(url, "url");
                        Intrinsics.checkNotNullParameter(id, "id");
                        Intrinsics.checkNotNullParameter(headers, "headers");
                        Intrinsics.checkNotNullParameter(priority, "priority");
                        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
                        C4053hg c4053hg7 = new C4053hg(url, id, headers, z, priority, z2, i4, ownerId, j, boxLong, bi);
                        Fg fg3 = this.a;
                        c4210ng2 = c4210ng;
                        c4447wg2.a = c4210ng2;
                        c4447wg2.b = interfaceC4421vg;
                        c4447wg2.c = c4053hg6;
                        c4447wg2.f = 3;
                        Object a3 = C4308r9.a(fg3.a, "pings", Gg.a(c4053hg7), "id=?", new String[]{id}, c4447wg2, 16);
                        if (a3 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            a3 = Unit.INSTANCE;
                        }
                        if (a3 != coroutine_suspended) {
                            c4053hg = c4053hg6;
                            interfaceC4421vg2 = interfaceC4421vg;
                            a(c4210ng2.b, c4210ng2.c, (short) 2247, c4053hg, c4210ng2.d, interfaceC4421vg2);
                            return Unit.INSTANCE;
                        }
                    }
                }
                return coroutine_suspended;
            }
        }
        c4447wg = new C4447wg(this, continuation);
        C4447wg c4447wg22 = c4447wg;
        Object obj2 = c4447wg22.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4447wg22.f;
        if (i == 0) {
        }
    }
}
