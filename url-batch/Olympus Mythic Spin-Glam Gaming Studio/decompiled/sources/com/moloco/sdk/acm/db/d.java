package com.moloco.sdk.acm.db;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Dao
/* loaded from: classes.dex */
public interface d {

    public static final class a {

        @DebugMetadata(c = "com.moloco.sdk.acm.db.MetricsDAO$DefaultImpls", f = "MetricsDAO.kt", l = {58, 62}, m = "deleteAndReturnDeletedEvents")
        /* renamed from: com.moloco.sdk.acm.db.d$a$a, reason: collision with other inner class name */
        public static final class C1524a extends ContinuationImpl {
            public Object a;
            public Object b;
            public Object c;
            public /* synthetic */ Object d;
            public int e;

            public C1524a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.d = obj;
                this.e |= Integer.MIN_VALUE;
                return a.a(null, this);
            }
        }

        @DebugMetadata(c = "com.moloco.sdk.acm.db.MetricsDAO$DefaultImpls", f = "MetricsDAO.kt", l = {69, 70}, m = "resetDatabase")
        public static final class b extends ContinuationImpl {
            public Object a;
            public /* synthetic */ Object b;
            public int c;

            public b(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.b = obj;
                this.c |= Integer.MIN_VALUE;
                return a.b(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00a3 -> B:16:0x00a5). Please report as a decompilation issue!!! */
        @Transaction
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object a(@NotNull d dVar, @NotNull Continuation continuation) {
            C1524a c1524a;
            int i;
            ArrayList arrayList;
            List<com.moloco.sdk.acm.db.b> b2;
            if (continuation instanceof C1524a) {
                c1524a = (C1524a) continuation;
                int i2 = c1524a.e;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c1524a.e = i2 - Integer.MIN_VALUE;
                    Object obj = c1524a.d;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c1524a.e;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        arrayList = new ArrayList();
                        b2 = dVar.b();
                        if (b2.isEmpty()) {
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            List list = (List) c1524a.a;
                            ResultKt.throwOnFailure(obj);
                            return list;
                        }
                        List<com.moloco.sdk.acm.db.b> list2 = (List) c1524a.c;
                        ?? r2 = (List) c1524a.b;
                        d dVar2 = (d) c1524a.a;
                        ResultKt.throwOnFailure(obj);
                        arrayList = r2;
                        arrayList.addAll(list2);
                        dVar = dVar2;
                        b2 = dVar.b();
                        if (b2.isEmpty()) {
                            c1524a.a = arrayList;
                            c1524a.b = null;
                            c1524a.c = null;
                            c1524a.e = 2;
                            return dVar.d(c1524a) == coroutine_suspended ? coroutine_suspended : arrayList;
                        }
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(b2, 10));
                        Iterator it = b2.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(Boxing.boxLong(((com.moloco.sdk.acm.db.b) it.next()).i()));
                        }
                        c1524a.a = dVar;
                        c1524a.b = arrayList;
                        c1524a.c = b2;
                        c1524a.e = 1;
                        if (dVar.a(arrayList2, c1524a) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        dVar2 = dVar;
                        list2 = b2;
                        arrayList.addAll(list2);
                        dVar = dVar2;
                        b2 = dVar.b();
                        if (b2.isEmpty()) {
                        }
                    }
                }
            }
            c1524a = new C1524a(continuation);
            Object obj2 = c1524a.d;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = c1524a.e;
            if (i != 0) {
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0055 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Transaction
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object b(@NotNull d dVar, @NotNull Continuation continuation) {
            b bVar;
            Object coroutine_suspended;
            int i;
            if (continuation instanceof b) {
                bVar = (b) continuation;
                int i2 = bVar.c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    bVar.c = i2 - Integer.MIN_VALUE;
                    Object obj = bVar.b;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = bVar.c;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        bVar.a = dVar;
                        bVar.c = 1;
                        if (dVar.b(bVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        dVar = (d) bVar.a;
                        ResultKt.throwOnFailure(obj);
                    }
                    bVar.a = null;
                    bVar.c = 2;
                    if (dVar.d(bVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
            }
            bVar = new b(continuation);
            Object obj2 = bVar.b;
            coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = bVar.c;
            if (i != 0) {
            }
            bVar.a = null;
            bVar.c = 2;
            if (dVar.d(bVar) == coroutine_suspended) {
            }
            return Unit.INSTANCE;
        }
    }

    @Insert
    long a(@NotNull b bVar);

    @Query
    @Nullable
    b a(long j);

    @Query
    @Nullable
    Object a(@NotNull List<Long> list, @NotNull Continuation continuation);

    @Transaction
    @Nullable
    Object a(@NotNull Continuation continuation);

    @Query
    @NotNull
    List<b> a();

    @Insert
    @NotNull
    List<Long> a(@NotNull List<b> list);

    @Query
    @Nullable
    Object b(@NotNull Continuation continuation);

    @Query
    @NotNull
    List<b> b();

    @Insert
    @NotNull
    List<Long> b(@NotNull List<b> list);

    @Transaction
    @Nullable
    Object c(@NotNull Continuation continuation);

    @Query
    @Nullable
    Object d(@NotNull Continuation continuation);
}
