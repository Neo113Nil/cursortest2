package com.inmobi.media;

import com.adjust.sdk.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* renamed from: com.inmobi.media.u7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4385u7 extends AbstractC4263pg {
    public static final /* synthetic */ int h = 0;
    public final Mutex f;
    public Job g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4385u7(Fg dao, M8 listener, C4446wf networkHandler) {
        super(dao, listener, networkHandler);
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(networkHandler, "networkHandler");
        this.f = MutexKt.Mutex$default(false, 1, null);
    }

    @Override // com.inmobi.media.AbstractC4263pg
    public final Unit b() {
        CoroutineScope coroutineScope = L9.d;
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C4254p7(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C4280q7(this, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cf, code lost:
    
        if (r1 == r9) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00cf -> B:11:0x00d2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        C4174m7 c4174m7;
        int i;
        long j;
        int i2;
        List list;
        C4174m7 c4174m72;
        int i3;
        long j2;
        if (continuationImpl instanceof C4174m7) {
            c4174m7 = (C4174m7) continuationImpl;
            int i4 = c4174m7.e;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c4174m7.e = i4 - Integer.MIN_VALUE;
                Object obj = c4174m7.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c4174m7.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    long currentTimeMillis = System.currentTimeMillis();
                    Intrinsics.checkNotNullExpressionValue("u7", "TAG");
                    int high = AbstractC4263pg.a().getMaxBatchSize().getHigh();
                    Fg fg = this.a;
                    Integer boxInt = Boxing.boxInt(high);
                    c4174m7.a = currentTimeMillis;
                    c4174m7.b = high;
                    c4174m7.e = 1;
                    Object a = fg.a(boxInt, Constants.HIGH, currentTimeMillis, c4174m7);
                    if (a != coroutine_suspended) {
                        j = currentTimeMillis;
                        i2 = high;
                        obj = a;
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    i2 = c4174m7.b;
                    j = c4174m7.a;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i5 = c4174m7.b;
                    long j3 = c4174m7.a;
                    ResultKt.throwOnFailure(obj);
                    c4174m72 = c4174m7;
                    i3 = i5;
                    j2 = j3;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : (Iterable) obj) {
                        if (!this.e.containsKey(((C4053hg) obj2).b)) {
                            arrayList.add(obj2);
                        }
                    }
                    list = CollectionsKt.take(arrayList, i3);
                    if (!list.isEmpty() || this.d != EnumC4183mg.b) {
                        return Unit.INSTANCE;
                    }
                    Intrinsics.checkNotNullExpressionValue("u7", "TAG");
                    list.size();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        BuildersKt__Builders_commonKt.launch$default(L9.d, null, null, new C4228o7(this, (C4053hg) it.next(), null), 3, null);
                    }
                    Fg fg2 = this.a;
                    c4174m72.a = j2;
                    c4174m72.b = i3;
                    c4174m72.e = 2;
                    obj = fg2.a(null, Constants.HIGH, j2, c4174m72);
                }
                list = (List) obj;
                c4174m72 = c4174m7;
                i3 = i2;
                j2 = j;
                if (!list.isEmpty()) {
                }
                return Unit.INSTANCE;
            }
        }
        c4174m7 = new C4174m7(this, continuationImpl);
        Object obj3 = c4174m7.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4174m7.e;
        if (i != 0) {
        }
        list = (List) obj3;
        c4174m72 = c4174m7;
        i3 = i2;
        j2 = j;
        if (!list.isEmpty()) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049 A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:11:0x0045, B:13:0x0049, B:15:0x0053, B:19:0x0059, B:21:0x006c, B:24:0x0072), top: B:10:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053 A[Catch: all -> 0x004e, TRY_LEAVE, TryCatch #0 {all -> 0x004e, blocks: (B:11:0x0045, B:13:0x0049, B:15:0x0053, B:19:0x0059, B:21:0x006c, B:24:0x0072), top: B:10:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059 A[Catch: all -> 0x004e, TRY_ENTER, TryCatch #0 {all -> 0x004e, blocks: (B:11:0x0045, B:13:0x0049, B:15:0x0053, B:19:0x0059, B:21:0x006c, B:24:0x0072), top: B:10:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        C4306r7 c4306r7;
        int i;
        Mutex mutex;
        Job job;
        try {
            if (continuationImpl instanceof C4306r7) {
                c4306r7 = (C4306r7) continuationImpl;
                int i2 = c4306r7.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c4306r7.d = i2 - Integer.MIN_VALUE;
                    Object obj = c4306r7.b;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c4306r7.d;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Mutex mutex2 = this.f;
                        c4306r7.a = mutex2;
                        c4306r7.d = 1;
                        if (mutex2.lock(null, c4306r7) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex = c4306r7.a;
                        ResultKt.throwOnFailure(obj);
                    }
                    job = this.g;
                    if (!(job == null ? job.isActive() : false)) {
                        Unit unit = Unit.INSTANCE;
                        mutex.unlock(null);
                        return unit;
                    }
                    long high = AbstractC4263pg.a().getInterval().getHigh();
                    if (high <= 0) {
                        Unit unit2 = Unit.INSTANCE;
                        mutex.unlock(null);
                        return unit2;
                    }
                    Intrinsics.checkNotNullExpressionValue("u7", "TAG");
                    CoroutineScope coroutineScope = L9.d;
                    IntRange intRange = AbstractC4026gf.a;
                    this.g = N3.a(coroutineScope, 0L, high * 1000, new C4332s7(this, null));
                    Unit unit3 = Unit.INSTANCE;
                    mutex.unlock(null);
                    return unit3;
                }
            }
            job = this.g;
            if (!(job == null ? job.isActive() : false)) {
            }
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        c4306r7 = new C4306r7(this, continuationImpl);
        Object obj2 = c4306r7.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4306r7.d;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049 A[Catch: all -> 0x004d, TryCatch #0 {all -> 0x004d, blocks: (B:11:0x0045, B:13:0x0049, B:14:0x004f), top: B:10:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        C4359t7 c4359t7;
        int i;
        Mutex mutex;
        Job job;
        try {
            if (continuationImpl instanceof C4359t7) {
                c4359t7 = (C4359t7) continuationImpl;
                int i2 = c4359t7.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c4359t7.d = i2 - Integer.MIN_VALUE;
                    Object obj = c4359t7.b;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c4359t7.d;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Mutex mutex2 = this.f;
                        c4359t7.a = mutex2;
                        c4359t7.d = 1;
                        if (mutex2.lock(null, c4359t7) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex = c4359t7.a;
                        ResultKt.throwOnFailure(obj);
                    }
                    job = this.g;
                    if (job != null) {
                        Job.DefaultImpls.cancel$default(job, null, 1, null);
                    }
                    this.g = null;
                    Unit unit = Unit.INSTANCE;
                    mutex.unlock(null);
                    return unit;
                }
            }
            job = this.g;
            if (job != null) {
            }
            this.g = null;
            Unit unit2 = Unit.INSTANCE;
            mutex.unlock(null);
            return unit2;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        c4359t7 = new C4359t7(this, continuationImpl);
        Object obj2 = c4359t7.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4359t7.d;
        if (i != 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|(2:3|(13:5|6|7|(1:(1:(1:(1:(3:13|14|15)(2:17|18))(9:19|20|21|(2:23|(2:25|(1:27)(1:30))(1:31))|32|(2:35|33)|36|37|38))(8:39|40|(4:42|(2:44|29)|21|(0))|32|(1:33)|36|37|38))(2:45|46))(3:50|51|(2:53|(2:55|29))(2:56|57))|47|(2:49|29)|40|(0)|32|(1:33)|36|37|38))|62|6|7|(0)(0)|47|(0)|40|(0)|32|(1:33)|36|37|38) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00dc, code lost:
    
        if (r0 == r3) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x003e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x010e, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("u7", "TAG");
        r0.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0041, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0115, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("u7", "TAG");
        r0.getMessage();
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00be A[Catch: Error -> 0x003e, Exception -> 0x0041, TryCatch #2 {Error -> 0x003e, Exception -> 0x0041, blocks: (B:13:0x0039, B:14:0x00df, B:20:0x004e, B:21:0x00b6, B:23:0x00be, B:25:0x00ca, B:30:0x00d7, B:31:0x00da, B:32:0x00e2, B:33:0x00ec, B:35:0x00f2, B:39:0x0052, B:40:0x00a0, B:42:0x00a9, B:46:0x0058, B:47:0x0091, B:51:0x005f, B:53:0x0068, B:56:0x010b), top: B:7:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f2 A[Catch: Error -> 0x003e, Exception -> 0x0041, LOOP:0: B:33:0x00ec->B:35:0x00f2, LOOP_END, TryCatch #2 {Error -> 0x003e, Exception -> 0x0041, blocks: (B:13:0x0039, B:14:0x00df, B:20:0x004e, B:21:0x00b6, B:23:0x00be, B:25:0x00ca, B:30:0x00d7, B:31:0x00da, B:32:0x00e2, B:33:0x00ec, B:35:0x00f2, B:39:0x0052, B:40:0x00a0, B:42:0x00a9, B:46:0x0058, B:47:0x0091, B:51:0x005f, B:53:0x0068, B:56:0x010b), top: B:7:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a9 A[Catch: Error -> 0x003e, Exception -> 0x0041, TryCatch #2 {Error -> 0x003e, Exception -> 0x0041, blocks: (B:13:0x0039, B:14:0x00df, B:20:0x004e, B:21:0x00b6, B:23:0x00be, B:25:0x00ca, B:30:0x00d7, B:31:0x00da, B:32:0x00e2, B:33:0x00ec, B:35:0x00f2, B:39:0x0052, B:40:0x00a0, B:42:0x00a9, B:46:0x0058, B:47:0x0091, B:51:0x005f, B:53:0x0068, B:56:0x010b), top: B:7:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        C4096j7 c4096j7;
        Object obj;
        Object coroutine_suspended;
        int i;
        int high;
        List list;
        Iterator it;
        Object obj2;
        if (continuationImpl instanceof C4096j7) {
            c4096j7 = (C4096j7) continuationImpl;
            int i2 = c4096j7.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4096j7.e = i2 - Integer.MIN_VALUE;
                obj = c4096j7.c;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c4096j7.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Intrinsics.checkNotNullExpressionValue("u7", "TAG");
                    if (this.d != EnumC4183mg.b) {
                        return Unit.INSTANCE;
                    }
                    high = AbstractC4263pg.a().getMaxBatchSize().getHigh();
                    Fg fg = this.a;
                    long high2 = AbstractC4263pg.a().getExpiry().getHigh() * 1000;
                    c4096j7.a = high;
                    c4096j7.e = 1;
                    if (fg.a(high2, c4096j7) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                            list = (List) obj;
                            if (list.isEmpty()) {
                                Fg fg2 = this.a;
                                c4096j7.b = list;
                                c4096j7.e = 3;
                                obj = fg2.b(Constants.HIGH, c4096j7);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                if (((Number) obj).intValue() == 0) {
                                }
                            }
                            Intrinsics.checkNotNullExpressionValue("u7", "TAG");
                            list.size();
                            it = list.iterator();
                            while (it.hasNext()) {
                            }
                            return Unit.INSTANCE;
                        }
                        if (i != 3) {
                            if (i != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        list = c4096j7.b;
                        ResultKt.throwOnFailure(obj);
                        if (((Number) obj).intValue() == 0) {
                            c4096j7.b = null;
                            c4096j7.e = 4;
                            EnumC4183mg enumC4183mg = EnumC4183mg.a;
                            if (this.d == EnumC4183mg.b) {
                                this.d = enumC4183mg;
                                obj2 = e(c4096j7);
                                if (obj2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                    obj2 = Unit.INSTANCE;
                                }
                            } else {
                                obj2 = Unit.INSTANCE;
                            }
                        }
                        Intrinsics.checkNotNullExpressionValue("u7", "TAG");
                        list.size();
                        it = list.iterator();
                        while (it.hasNext()) {
                            BuildersKt__Builders_commonKt.launch$default(L9.d, null, null, new C4148l7(this, (C4053hg) it.next(), null), 3, null);
                        }
                        return Unit.INSTANCE;
                    }
                    high = c4096j7.a;
                    ResultKt.throwOnFailure(obj);
                }
                Fg fg3 = this.a;
                Integer boxInt = Boxing.boxInt(high);
                c4096j7.e = 2;
                obj = fg3.b(Constants.HIGH, boxInt, c4096j7);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list = (List) obj;
                if (list.isEmpty()) {
                }
                Intrinsics.checkNotNullExpressionValue("u7", "TAG");
                list.size();
                it = list.iterator();
                while (it.hasNext()) {
                }
                return Unit.INSTANCE;
            }
        }
        c4096j7 = new C4096j7(this, continuationImpl);
        obj = c4096j7.c;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4096j7.e;
        if (i != 0) {
        }
        Fg fg32 = this.a;
        Integer boxInt2 = Boxing.boxInt(high);
        c4096j7.e = 2;
        obj = fg32.b(Constants.HIGH, boxInt2, c4096j7);
        if (obj == coroutine_suspended) {
        }
        list = (List) obj;
        if (list.isEmpty()) {
        }
        Intrinsics.checkNotNullExpressionValue("u7", "TAG");
        list.size();
        it = list.iterator();
        while (it.hasNext()) {
        }
        return Unit.INSTANCE;
    }
}
