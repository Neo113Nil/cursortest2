package com.inmobi.media;

import com.adjust.sdk.Constants;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* renamed from: com.inmobi.media.qf, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4288qf extends AbstractC4263pg {
    public final Mutex f;
    public Job g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4288qf(Fg dao, C4410v5 listener, C4446wf networkHandler) {
        super(dao, listener, networkHandler);
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(networkHandler, "networkHandler");
        this.f = MutexKt.Mutex$default(false, 1, null);
    }

    @Override // com.inmobi.media.AbstractC4263pg
    public final Unit b() {
        BuildersKt__Builders_commonKt.launch$default(L9.c, null, null, new C4182mf(this, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049 A[Catch: all -> 0x005e, TryCatch #0 {all -> 0x005e, blocks: (B:11:0x0045, B:13:0x0049, B:15:0x0052, B:18:0x0060, B:22:0x0066, B:24:0x0079, B:27:0x007f), top: B:10:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079 A[Catch: all -> 0x005e, TRY_LEAVE, TryCatch #0 {all -> 0x005e, blocks: (B:11:0x0045, B:13:0x0049, B:15:0x0052, B:18:0x0060, B:22:0x0066, B:24:0x0079, B:27:0x007f), top: B:10:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007f A[Catch: all -> 0x005e, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x005e, blocks: (B:11:0x0045, B:13:0x0049, B:15:0x0052, B:18:0x0060, B:22:0x0066, B:24:0x0079, B:27:0x007f), top: B:10:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        C4209nf c4209nf;
        int i;
        Mutex mutex;
        Job job;
        long normal;
        try {
            if (continuationImpl instanceof C4209nf) {
                c4209nf = (C4209nf) continuationImpl;
                int i2 = c4209nf.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c4209nf.d = i2 - Integer.MIN_VALUE;
                    Object obj = c4209nf.b;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c4209nf.d;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Mutex mutex2 = this.f;
                        c4209nf.a = mutex2;
                        c4209nf.d = 1;
                        if (mutex2.lock(null, c4209nf) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex = c4209nf.a;
                        ResultKt.throwOnFailure(obj);
                    }
                    job = this.g;
                    if (job != null) {
                        Intrinsics.checkNotNull(job);
                        if (job.isCompleted()) {
                            Job job2 = this.g;
                            Intrinsics.checkNotNull(job2);
                            if (!job2.isCancelled()) {
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                        mutex.unlock(null);
                        return unit;
                    }
                    normal = AbstractC4263pg.a().getInterval().getNormal();
                    if (normal > 0) {
                        Unit unit2 = Unit.INSTANCE;
                        mutex.unlock(null);
                        return unit2;
                    }
                    this.g = N3.a(L9.c, 0L, normal * 1000, new C4236of(this, null));
                    Unit unit3 = Unit.INSTANCE;
                    mutex.unlock(null);
                    return unit3;
                }
            }
            job = this.g;
            if (job != null) {
            }
            normal = AbstractC4263pg.a().getInterval().getNormal();
            if (normal > 0) {
            }
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        c4209nf = new C4209nf(this, continuationImpl);
        Object obj2 = c4209nf.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4209nf.d;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049 A[Catch: all -> 0x004d, TryCatch #0 {all -> 0x004d, blocks: (B:11:0x0045, B:13:0x0049, B:14:0x004f), top: B:10:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        C4262pf c4262pf;
        int i;
        Mutex mutex;
        Job job;
        try {
            if (continuationImpl instanceof C4262pf) {
                c4262pf = (C4262pf) continuationImpl;
                int i2 = c4262pf.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c4262pf.d = i2 - Integer.MIN_VALUE;
                    Object obj = c4262pf.b;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c4262pf.d;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Mutex mutex2 = this.f;
                        c4262pf.a = mutex2;
                        c4262pf.d = 1;
                        if (mutex2.lock(null, c4262pf) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex = c4262pf.a;
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
        c4262pf = new C4262pf(this, continuationImpl);
        Object obj2 = c4262pf.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4262pf.d;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cb, code lost:
    
        if (r14 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00cd, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a2, code lost:
    
        if (r14 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008c, code lost:
    
        if (r14 != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x007d, code lost:
    
        if (r14.a(r9, r0) == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00db A[LOOP:0: B:30:0x00d5->B:32:0x00db, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        C4104jf c4104jf;
        int i;
        int normal;
        List list;
        Iterator it;
        Object obj;
        if (continuationImpl instanceof C4104jf) {
            c4104jf = (C4104jf) continuationImpl;
            int i2 = c4104jf.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4104jf.e = i2 - Integer.MIN_VALUE;
                Object obj2 = c4104jf.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c4104jf.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    if (this.d == EnumC4183mg.b) {
                        normal = AbstractC4263pg.a().getMaxBatchSize().getNormal();
                        Fg fg = this.a;
                        long normal2 = AbstractC4263pg.a().getExpiry().getNormal() * 1000;
                        c4104jf.a = normal;
                        c4104jf.e = 1;
                    } else {
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj2);
                            list = (List) obj2;
                            if (list.isEmpty()) {
                                Fg fg2 = this.a;
                                c4104jf.b = list;
                                c4104jf.e = 3;
                                obj2 = fg2.b(Constants.NORMAL, c4104jf);
                            }
                            it = list.iterator();
                            while (it.hasNext()) {
                            }
                            return Unit.INSTANCE;
                        }
                        if (i != 3) {
                            if (i != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                            return Unit.INSTANCE;
                        }
                        list = c4104jf.b;
                        ResultKt.throwOnFailure(obj2);
                        if (((Number) obj2).intValue() == 0) {
                            c4104jf.b = null;
                            c4104jf.e = 4;
                            EnumC4183mg enumC4183mg = EnumC4183mg.a;
                            if (this.d == EnumC4183mg.b) {
                                this.d = enumC4183mg;
                                obj = d(c4104jf);
                                if (obj != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                    obj = Unit.INSTANCE;
                                }
                            } else {
                                obj = Unit.INSTANCE;
                            }
                        }
                        it = list.iterator();
                        while (it.hasNext()) {
                            BuildersKt__Builders_commonKt.launch$default(L9.c, null, null, new C4156lf(this, (C4053hg) it.next(), null), 3, null);
                        }
                        return Unit.INSTANCE;
                    }
                    normal = c4104jf.a;
                    ResultKt.throwOnFailure(obj2);
                }
                Fg fg3 = this.a;
                Integer boxInt = Boxing.boxInt(normal);
                c4104jf.e = 2;
                obj2 = fg3.a(Constants.NORMAL, boxInt, c4104jf);
            }
        }
        c4104jf = new C4104jf(this, continuationImpl);
        Object obj22 = c4104jf.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4104jf.e;
        if (i != 0) {
        }
        Fg fg32 = this.a;
        Integer boxInt2 = Boxing.boxInt(normal);
        c4104jf.e = 2;
        obj22 = fg32.a(Constants.NORMAL, boxInt2, c4104jf);
    }
}
