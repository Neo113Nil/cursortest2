package com.inmobi.media;

import android.content.ContentValues;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Fg {
    public final C4308r9 a;

    public Fg(C4308r9 databaseHelper) {
        Intrinsics.checkNotNullParameter(databaseHelper, "databaseHelper");
        this.a = databaseHelper;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        if (r5 == null) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009b A[LOOP:0: B:11:0x0095->B:13:0x009b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Integer num, String str, long j, ContinuationImpl continuationImpl) {
        Eg eg;
        int i;
        String str2;
        Iterator it;
        if (continuationImpl instanceof Eg) {
            eg = (Eg) continuationImpl;
            int i2 = eg.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eg.c = i2 - Integer.MIN_VALUE;
                Object obj = eg.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = eg.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (num != null) {
                        str2 = " LIMIT " + num.intValue();
                    }
                    str2 = "";
                    String str3 = "SELECT * FROM pings WHERE priority='" + str + "' AND retry_count=0 AND time_created<" + j + " ORDER BY time_created ASC" + str2;
                    C4308r9 c4308r9 = this.a;
                    eg.c = 1;
                    c4308r9.getClass();
                    obj = c4308r9.a(new C4203n9(c4308r9, str3, null), eg);
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
                    arrayList.add(Gg.a((ContentValues) it.next()));
                }
                return arrayList;
            }
        }
        eg = new Eg(this, continuationImpl);
        Object obj2 = eg.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = eg.c;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }

    public final Object b(String str, ContinuationImpl continuationImpl) {
        String str2 = "SELECT COUNT(*) FROM pings WHERE priority='" + str + "'";
        C4308r9 c4308r9 = this.a;
        c4308r9.getClass();
        return c4308r9.a(new C4072i9(c4308r9, str2, null), continuationImpl);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        if (r8 == null) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009f A[LOOP:0: B:11:0x0099->B:13:0x009f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, Integer num, ContinuationImpl continuationImpl) {
        Dg dg;
        int i;
        String str2;
        Iterator it;
        if (continuationImpl instanceof Dg) {
            dg = (Dg) continuationImpl;
            int i2 = dg.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dg.c = i2 - Integer.MIN_VALUE;
                Object obj = dg.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dg.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    long currentTimeMillis = System.currentTimeMillis();
                    if (num != null) {
                        str2 = " LIMIT " + num.intValue();
                    }
                    str2 = "";
                    String str3 = "SELECT * FROM pings WHERE priority='" + str + "' AND retry_count>=1 AND retryAfter<=" + currentTimeMillis + " ORDER BY time_created ASC" + str2;
                    C4308r9 c4308r9 = this.a;
                    dg.c = 1;
                    c4308r9.getClass();
                    obj = c4308r9.a(new C4203n9(c4308r9, str3, null), dg);
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
                    arrayList.add(Gg.a((ContentValues) it.next()));
                }
                return arrayList;
            }
        }
        dg = new Dg(this, continuationImpl);
        Object obj2 = dg.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dg.c;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        if (r8 == null) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009f A[LOOP:0: B:11:0x0099->B:13:0x009f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, Integer num, ContinuationImpl continuationImpl) {
        Cg cg;
        int i;
        String str2;
        Iterator it;
        if (continuationImpl instanceof Cg) {
            cg = (Cg) continuationImpl;
            int i2 = cg.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cg.c = i2 - Integer.MIN_VALUE;
                Object obj = cg.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cg.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    long currentTimeMillis = System.currentTimeMillis();
                    if (num != null) {
                        str2 = " LIMIT " + num.intValue();
                    }
                    str2 = "";
                    String str3 = "SELECT * FROM pings WHERE priority='" + str + "' AND retryAfter<=" + currentTimeMillis + " ORDER BY time_created ASC" + str2;
                    C4308r9 c4308r9 = this.a;
                    cg.c = 1;
                    c4308r9.getClass();
                    obj = c4308r9.a(new C4203n9(c4308r9, str3, null), cg);
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
                    arrayList.add(Gg.a((ContentValues) it.next()));
                }
                return arrayList;
            }
        }
        cg = new Cg(this, continuationImpl);
        Object obj2 = cg.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cg.c;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
    
        if (r7 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007e A[LOOP:0: B:17:0x0078->B:19:0x007e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        Bg bg;
        int i;
        Iterator it;
        C4053hg c4053hg;
        if (continuationImpl instanceof Bg) {
            bg = (Bg) continuationImpl;
            int i2 = bg.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bg.d = i2 - Integer.MIN_VALUE;
                Object obj = bg.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = bg.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    C4308r9 c4308r9 = this.a;
                    bg.d = 1;
                    c4308r9.getClass();
                    obj = c4308r9.a(new C4203n9(c4308r9, "SELECT * FROM pings WHERE priority='" + str + "' ORDER BY time_created ASC LIMIT 1", null), bg);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C4053hg c4053hg2 = bg.a;
                        ResultKt.throwOnFailure(obj);
                        return c4053hg2;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(Gg.a((ContentValues) it.next()));
                }
                c4053hg = (C4053hg) CollectionsKt.firstOrNull((List) arrayList);
                if (c4053hg != null) {
                    C4308r9 c4308r92 = this.a;
                    String[] strArr = {c4053hg.b};
                    bg.a = c4053hg;
                    bg.d = 2;
                    if (c4308r92.a("pings", "id=?", strArr, bg) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return c4053hg;
            }
        }
        bg = new Bg(this, continuationImpl);
        Object obj2 = bg.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bg.d;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        c4053hg = (C4053hg) CollectionsKt.firstOrNull((List) arrayList2);
        if (c4053hg != null) {
        }
        return c4053hg;
    }

    public final Object a(long j, ContinuationImpl continuationImpl) {
        String valueOf = String.valueOf(System.currentTimeMillis() - j);
        Object a = C4308r9.a(this.a, "pings", "time_created<" + valueOf, continuationImpl, 4);
        return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Unit.INSTANCE;
    }
}
