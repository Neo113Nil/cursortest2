package com.inmobi.media;

import android.content.Context;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* renamed from: com.inmobi.media.t6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4358t6 {
    public final String a;
    public final AbstractC4147l6 b;
    public final Zf c;
    public final C4425vk d;
    public final String e;
    public final AtomicBoolean f;
    public final AtomicBoolean g;
    public final CoroutineScope h;
    public C4121k6 i;
    public Job j;

    public C4358t6(String tableName, AbstractC4147l6 mEventDao, Zf mPayloadProvider, C4121k6 eventConfig, C4425vk c4425vk) {
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        Intrinsics.checkNotNullParameter(mEventDao, "mEventDao");
        Intrinsics.checkNotNullParameter(mPayloadProvider, "mPayloadProvider");
        Intrinsics.checkNotNullParameter(eventConfig, "eventConfig");
        this.a = tableName;
        this.b = mEventDao;
        this.c = mPayloadProvider;
        this.d = c4425vk;
        this.e = C4358t6.class.getSimpleName();
        this.f = new AtomicBoolean(false);
        this.g = new AtomicBoolean(false);
        this.h = L9.c;
        this.i = eventConfig;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(C4358t6 listener, boolean z, ContinuationImpl continuationImpl) {
        C4200n6 c4200n6;
        Object coroutine_suspended;
        int i;
        boolean z2;
        C4121k6 c4121k6;
        Zk zk;
        Object a;
        C4121k6 c4121k62;
        boolean z3;
        int i2;
        long j;
        Object a2;
        int i3;
        boolean z4;
        boolean z5;
        int i4;
        int i5;
        long j2;
        Zk zk2;
        long j3;
        boolean z6;
        C4121k6 c4121k63;
        C4173m6 payload;
        listener.getClass();
        if (continuationImpl instanceof C4200n6) {
            c4200n6 = (C4200n6) continuationImpl;
            int i6 = c4200n6.j;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c4200n6.j = i6 - Integer.MIN_VALUE;
                C4200n6 c4200n62 = c4200n6;
                Object obj = c4200n62.h;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c4200n62.j;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    C4121k6 c4121k64 = listener.i;
                    if (listener.g.get() || listener.f.get() || c4121k64 == null) {
                        return Unit.INSTANCE;
                    }
                    String TAG = listener.e;
                    Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                    long currentTimeMillis = System.currentTimeMillis() - (c4121k64.b * 1000);
                    AbstractC4147l6 abstractC4147l6 = listener.b;
                    c4200n62.a = null;
                    c4200n62.b = c4121k64;
                    z2 = z;
                    c4200n62.c = z2;
                    c4200n62.j = 1;
                    if (abstractC4147l6.a(currentTimeMillis, c4200n62) != coroutine_suspended) {
                        c4121k6 = c4121k64;
                        zk = null;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i == 2) {
                        z3 = c4200n62.c;
                        C4121k6 c4121k65 = c4200n62.b;
                        zk = c4200n62.a;
                        ResultKt.throwOnFailure(obj);
                        c4121k62 = c4121k65;
                        int intValue = ((Number) obj).intValue();
                        F5.a.getClass();
                        int n = F5.n();
                        C4121k6 c4121k66 = listener.i;
                        i2 = c4121k66 != null ? 0 : n != 0 ? n != 1 ? c4121k66.g : c4121k66.e : c4121k66.g;
                        j = c4121k66 != null ? 0L : n != 0 ? n != 1 ? c4121k66.j : c4121k66.i : c4121k66.j;
                        long j4 = c4121k62.d;
                        c4200n62.a = zk;
                        c4200n62.b = c4121k62;
                        c4200n62.c = z3;
                        c4200n62.e = intValue;
                        c4200n62.f = i2;
                        c4200n62.g = j;
                        c4200n62.j = 3;
                        a2 = listener.a(j4, c4200n62);
                        if (a2 != coroutine_suspended) {
                            i3 = intValue;
                            z4 = z3;
                            obj = a2;
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            long j5 = c4121k62.c;
                            long j6 = c4121k62.d;
                            c4200n62.a = zk;
                            c4200n62.b = c4121k62;
                            c4200n62.c = z4;
                            c4200n62.e = i3;
                            c4200n62.f = i2;
                            c4200n62.g = j;
                            c4200n62.d = booleanValue;
                            c4200n62.j = 4;
                            Zk zk3 = zk;
                            obj = listener.a(j5, j6, c4200n62);
                            if (obj != coroutine_suspended) {
                            }
                        }
                        return coroutine_suspended;
                    }
                    if (i == 3) {
                        long j7 = c4200n62.g;
                        int i7 = c4200n62.f;
                        int i8 = c4200n62.e;
                        z4 = c4200n62.c;
                        c4121k62 = c4200n62.b;
                        Zk zk4 = c4200n62.a;
                        ResultKt.throwOnFailure(obj);
                        j = j7;
                        i3 = i8;
                        zk = zk4;
                        i2 = i7;
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        long j52 = c4121k62.c;
                        long j62 = c4121k62.d;
                        c4200n62.a = zk;
                        c4200n62.b = c4121k62;
                        c4200n62.c = z4;
                        c4200n62.e = i3;
                        c4200n62.f = i2;
                        c4200n62.g = j;
                        c4200n62.d = booleanValue2;
                        c4200n62.j = 4;
                        Zk zk32 = zk;
                        obj = listener.a(j52, j62, c4200n62);
                        if (obj != coroutine_suspended) {
                            z5 = booleanValue2;
                            i4 = i3;
                            i5 = i2;
                            j2 = j;
                            zk2 = zk32;
                            boolean booleanValue3 = ((Boolean) obj).booleanValue();
                            if (i5 > i4) {
                            }
                            Zf zf = listener.c;
                            c4200n62.a = zk2;
                            c4200n62.b = c4121k62;
                            c4200n62.c = z4;
                            c4200n62.g = j2;
                            c4200n62.j = 5;
                            obj = zf.a(c4200n62);
                            if (obj != coroutine_suspended) {
                            }
                        }
                        return coroutine_suspended;
                    }
                    if (i != 4) {
                        if (i != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        long j8 = c4200n62.g;
                        boolean z7 = c4200n62.c;
                        c4121k63 = c4200n62.b;
                        Zk zk5 = c4200n62.a;
                        ResultKt.throwOnFailure(obj);
                        z6 = z7;
                        zk2 = zk5;
                        j3 = j8;
                        payload = (C4173m6) obj;
                        if (payload != null) {
                            listener.f.set(true);
                            Lazy lazy = AbstractC4411v6.a;
                            String str = c4121k63.k;
                            int i9 = c4121k63.a + 1;
                            Intrinsics.checkNotNullParameter(payload, "payload");
                            Intrinsics.checkNotNullParameter(listener, "listener");
                            AbstractC4411v6.a(payload, str, i9, i9, j3, zk2, listener, z6);
                        }
                        return Unit.INSTANCE;
                    }
                    z5 = c4200n62.d;
                    j2 = c4200n62.g;
                    i5 = c4200n62.f;
                    i4 = c4200n62.e;
                    z4 = c4200n62.c;
                    c4121k62 = c4200n62.b;
                    zk2 = c4200n62.a;
                    ResultKt.throwOnFailure(obj);
                    boolean booleanValue32 = ((Boolean) obj).booleanValue();
                    if (i5 > i4 || z5 || booleanValue32) {
                        Zf zf2 = listener.c;
                        c4200n62.a = zk2;
                        c4200n62.b = c4121k62;
                        c4200n62.c = z4;
                        c4200n62.g = j2;
                        c4200n62.j = 5;
                        obj = zf2.a(c4200n62);
                        if (obj != coroutine_suspended) {
                            j3 = j2;
                            z6 = z4;
                            c4121k63 = c4121k62;
                            payload = (C4173m6) obj;
                            if (payload != null) {
                            }
                        }
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
                boolean z8 = c4200n62.c;
                C4121k6 c4121k67 = c4200n62.b;
                Zk zk6 = c4200n62.a;
                ResultKt.throwOnFailure(obj);
                z2 = z8;
                c4121k6 = c4121k67;
                zk = zk6;
                AbstractC4147l6 abstractC4147l62 = listener.b;
                c4200n62.a = zk;
                c4200n62.b = c4121k6;
                c4200n62.c = z2;
                c4200n62.j = 2;
                a = abstractC4147l62.a(c4200n62);
                if (a != coroutine_suspended) {
                    c4121k62 = c4121k6;
                    obj = a;
                    z3 = z2;
                    int intValue2 = ((Number) obj).intValue();
                    F5.a.getClass();
                    int n2 = F5.n();
                    C4121k6 c4121k662 = listener.i;
                    if (c4121k662 != null) {
                    }
                    if (c4121k662 != null) {
                    }
                    long j42 = c4121k62.d;
                    c4200n62.a = zk;
                    c4200n62.b = c4121k62;
                    c4200n62.c = z3;
                    c4200n62.e = intValue2;
                    c4200n62.f = i2;
                    c4200n62.g = j;
                    c4200n62.j = 3;
                    a2 = listener.a(j42, c4200n62);
                    if (a2 != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
        }
        c4200n6 = new C4200n6(listener, continuationImpl);
        C4200n6 c4200n622 = c4200n6;
        Object obj2 = c4200n622.h;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4200n622.j;
        if (i != 0) {
        }
        AbstractC4147l6 abstractC4147l622 = listener.b;
        c4200n622.a = zk;
        c4200n622.b = c4121k6;
        c4200n622.c = z2;
        c4200n622.j = 2;
        a = abstractC4147l622.a(c4200n622);
        if (a != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    public final long a() {
        Context context = AbstractC4002fj.a;
        if (context == null) {
            return -1L;
        }
        ConcurrentHashMap concurrentHashMap = Qa.b;
        Qa a = Pa.a(context, "batch_processing_info");
        String key = this.a + "_last_batch_process";
        Intrinsics.checkNotNullParameter(key, "key");
        return a.a.getLong(key, -1L);
    }

    public final void a(long j) {
        Context context = AbstractC4002fj.a;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = Qa.b;
            Pa.a(context, "batch_processing_info").a(this.a + "_last_batch_process", j, false);
        }
    }

    public final void a(boolean z) {
        C4121k6 c4121k6 = this.i;
        if (this.g.get() || c4121k6 == null) {
            return;
        }
        long j = c4121k6.c;
        Job job = this.j;
        if (job == null || !job.isActive()) {
            String TAG = this.e;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            CoroutineScope coroutineScope = this.h;
            C4121k6 c4121k62 = this.i;
            long a = a();
            if (a == -1) {
                a(System.currentTimeMillis());
            }
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.j = N3.a(coroutineScope, Math.max(0L, (timeUnit.toSeconds(a) + (c4121k62 != null ? c4121k62.c : 0L)) - timeUnit.toSeconds(System.currentTimeMillis())) * 1000, j * 1000, new C4305r6(this, z, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j, ContinuationImpl continuationImpl) {
        C4227o6 c4227o6;
        int i;
        if (continuationImpl instanceof C4227o6) {
            c4227o6 = (C4227o6) continuationImpl;
            int i2 = c4227o6.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4227o6.d = i2 - Integer.MIN_VALUE;
                Object obj = c4227o6.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c4227o6.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    AbstractC4147l6 abstractC4147l6 = this.b;
                    c4227o6.a = j;
                    c4227o6.d = 1;
                    obj = abstractC4147l6.b(1, c4227o6);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = c4227o6.a;
                    ResultKt.throwOnFailure(obj);
                }
                List list = (List) obj;
                return Boxing.boxBoolean(list.isEmpty() && TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - ((AbstractC4196n2) list.get(0)).c) > j);
            }
        }
        c4227o6 = new C4227o6(this, continuationImpl);
        Object obj2 = c4227o6.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4227o6.d;
        if (i != 0) {
        }
        List list2 = (List) obj2;
        return Boxing.boxBoolean(list2.isEmpty() && TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - ((AbstractC4196n2) list2.get(0)).c) > j);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j, long j2, ContinuationImpl continuationImpl) {
        C4331s6 c4331s6;
        int i;
        long seconds;
        if (continuationImpl instanceof C4331s6) {
            c4331s6 = (C4331s6) continuationImpl;
            int i2 = c4331s6.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4331s6.e = i2 - Integer.MIN_VALUE;
                Object obj = c4331s6.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c4331s6.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    seconds = j + TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
                    AbstractC4147l6 abstractC4147l6 = this.b;
                    c4331s6.a = j2;
                    c4331s6.b = seconds;
                    c4331s6.e = 1;
                    obj = abstractC4147l6.b(1, c4331s6);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    seconds = c4331s6.b;
                    j2 = c4331s6.a;
                    ResultKt.throwOnFailure(obj);
                }
                List list = (List) obj;
                return Boxing.boxBoolean(list.isEmpty() && seconds - TimeUnit.MILLISECONDS.toSeconds(((AbstractC4196n2) list.get(0)).c) >= j2);
            }
        }
        c4331s6 = new C4331s6(this, continuationImpl);
        Object obj2 = c4331s6.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4331s6.e;
        if (i != 0) {
        }
        List list2 = (List) obj2;
        return Boxing.boxBoolean(list2.isEmpty() && seconds - TimeUnit.MILLISECONDS.toSeconds(((AbstractC4196n2) list2.get(0)).c) >= j2);
    }
}
