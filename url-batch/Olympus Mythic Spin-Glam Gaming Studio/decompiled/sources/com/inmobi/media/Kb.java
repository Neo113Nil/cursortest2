package com.inmobi.media;

import android.content.ContentValues;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class Kb {
    public final C4308r9 a;
    public WeakReference b;

    public Kb(C4308r9 databaseHelper) {
        Intrinsics.checkNotNullParameter(databaseHelper, "databaseHelper");
        this.a = databaseHelper;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Db db, ContinuationImpl continuationImpl) {
        Ib ib;
        int i;
        WeakReference weakReference;
        if (continuationImpl instanceof Ib) {
            ib = (Ib) continuationImpl;
            int i2 = ib.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ib.c = i2 - Integer.MIN_VALUE;
                Object obj = ib.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = ib.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    C4308r9 c4308r9 = this.a;
                    ContentValues a = Mb.a(db);
                    ib.c = 1;
                    if (c4308r9.a("logs_v2", a, 4, ib) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                weakReference = this.b;
                if (weakReference != null && ((C4519z9) weakReference.get()) != null) {
                    C4519z9.a();
                }
                return Unit.INSTANCE;
            }
        }
        ib = new Ib(this, continuationImpl);
        Object obj2 = ib.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = ib.c;
        if (i != 0) {
        }
        weakReference = this.b;
        if (weakReference != null) {
            C4519z9.a();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Db db, ContinuationImpl continuationImpl) {
        Jb jb;
        int i;
        WeakReference weakReference;
        if (continuationImpl instanceof Jb) {
            jb = (Jb) continuationImpl;
            int i2 = jb.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jb.c = i2 - Integer.MIN_VALUE;
                Jb jb2 = jb;
                Object obj = jb2.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = jb2.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    C4308r9 c4308r9 = this.a;
                    ContentValues a = Mb.a(db);
                    String[] strArr = {db.a};
                    jb2.c = 1;
                    if (C4308r9.a(c4308r9, "logs_v2", a, "filename=?", strArr, jb2, 16) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                weakReference = this.b;
                if (weakReference != null && ((C4519z9) weakReference.get()) != null) {
                    C4519z9.a();
                }
                return Unit.INSTANCE;
            }
        }
        jb = new Jb(this, continuationImpl);
        Jb jb22 = jb;
        Object obj2 = jb22.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = jb22.c;
        if (i != 0) {
        }
        weakReference = this.b;
        if (weakReference != null) {
            C4519z9.a();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061 A[LOOP:0: B:11:0x005b->B:13:0x0061, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        Fb fb;
        int i;
        Iterator it;
        if (continuationImpl instanceof Fb) {
            fb = (Fb) continuationImpl;
            int i2 = fb.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fb.c = i2 - Integer.MIN_VALUE;
                Object obj = fb.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fb.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    C4308r9 c4308r9 = this.a;
                    fb.c = 1;
                    c4308r9.getClass();
                    obj = c4308r9.a(new C4203n9(c4308r9, "SELECT * FROM logs_v2 WHERE hasLoggerFinished=1", null), fb);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(Mb.a((ContentValues) it.next()));
                }
                return arrayList;
            }
        }
        fb = new Fb(this, continuationImpl);
        Object obj2 = fb.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fb.c;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        Hb hb;
        int i;
        if (continuationImpl instanceof Hb) {
            hb = (Hb) continuationImpl;
            int i2 = hb.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hb.c = i2 - Integer.MIN_VALUE;
                Object obj = hb.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = hb.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    C4308r9 c4308r9 = this.a;
                    hb.c = 1;
                    c4308r9.getClass();
                    obj = c4308r9.a(new C4072i9(c4308r9, "SELECT COUNT(*) FROM logs_v2 WHERE filename='" + str + "'", null), hb);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxBoolean(((Number) obj).intValue() != 0);
            }
        }
        hb = new Hb(this, continuationImpl);
        Object obj2 = hb.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = hb.c;
        if (i != 0) {
        }
        return Boxing.boxBoolean(((Number) obj2).intValue() != 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061 A[LOOP:0: B:11:0x005b->B:13:0x0061, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        Gb gb;
        int i;
        Iterator it;
        if (continuationImpl instanceof Gb) {
            gb = (Gb) continuationImpl;
            int i2 = gb.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gb.c = i2 - Integer.MIN_VALUE;
                Object obj = gb.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = gb.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    C4308r9 c4308r9 = this.a;
                    gb.c = 1;
                    c4308r9.getClass();
                    obj = c4308r9.a(new C4203n9(c4308r9, "SELECT * FROM logs_v2 WHERE hasLoggerFinished=0", null), gb);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(Mb.a((ContentValues) it.next()));
                }
                return arrayList;
            }
        }
        gb = new Gb(this, continuationImpl);
        Object obj2 = gb.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = gb.c;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007d A[LOOP:0: B:11:0x0077->B:13:0x007d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j, int i, ContinuationImpl continuationImpl) {
        Eb eb;
        int i2;
        Iterator it;
        if (continuationImpl instanceof Eb) {
            eb = (Eb) continuationImpl;
            int i3 = eb.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                eb.c = i3 - Integer.MIN_VALUE;
                Object obj = eb.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = eb.c;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    C4308r9 c4308r9 = this.a;
                    eb.c = 1;
                    c4308r9.getClass();
                    obj = c4308r9.a(new C4203n9(c4308r9, "SELECT * FROM logs_v2 WHERE id NOT IN (SELECT id FROM ( SELECT id FROM logs_v2 WHERE saveTimestamp > " + j + " ORDER BY saveTimestamp DESC LIMIT " + i + ") AS recent_logs);", null), eb);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(Mb.a((ContentValues) it.next()));
                }
                return arrayList;
            }
        }
        eb = new Eb(this, continuationImpl);
        Object obj2 = eb.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = eb.c;
        if (i2 != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }

    public final Object a(String str, ContinuationImpl continuationImpl) {
        Object a = C4308r9.a(this.a, "logs_v2", "filename='" + str + "'", continuationImpl, 4);
        return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Unit.INSTANCE;
    }
}
