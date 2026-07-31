package io.bidmachine.analytics.internal.H;

import android.database.sqlite.SQLiteDatabase;
import io.bidmachine.analytics.internal.g.C5903e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes14.dex */
public final class f implements e {
    private final SQLiteDatabase a;
    private final Lazy b = LazyKt.lazy(new a());

    static final class a extends Lambda implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final io.bidmachine.analytics.internal.F.c mo4828invoke() {
            return new io.bidmachine.analytics.internal.F.c(f.this.a);
        }
    }

    public f(SQLiteDatabase sQLiteDatabase) {
        this.a = sQLiteDatabase;
    }

    @Override // io.bidmachine.analytics.internal.H.e
    public Object b(C5903e c5903e) {
        return a().c(io.bidmachine.analytics.internal.G.f.a(c5903e));
    }

    @Override // io.bidmachine.analytics.internal.H.e
    public Object c(List list) {
        io.bidmachine.analytics.internal.F.c a2 = a();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(io.bidmachine.analytics.internal.G.f.a((C5903e) it.next()));
        }
        return a2.d(arrayList);
    }

    private final io.bidmachine.analytics.internal.F.c a() {
        return (io.bidmachine.analytics.internal.F.c) this.b.getValue();
    }

    @Override // io.bidmachine.analytics.internal.H.e
    public Object b(List list) {
        io.bidmachine.analytics.internal.F.c a2 = a();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(io.bidmachine.analytics.internal.G.f.a((C5903e) it.next()));
        }
        return a2.a(arrayList);
    }

    @Override // io.bidmachine.analytics.internal.H.e
    public Object a(C5903e c5903e) {
        return a().a(io.bidmachine.analytics.internal.G.f.a(c5903e));
    }

    @Override // io.bidmachine.analytics.internal.H.e
    public Object a(String str, C5903e.a aVar) {
        Object a2 = a().a(str, io.bidmachine.analytics.internal.G.f.a(aVar).toString());
        try {
            Result.Companion companion = Result.INSTANCE;
            ResultKt.throwOnFailure(a2);
            io.bidmachine.analytics.internal.G.e eVar = (io.bidmachine.analytics.internal.G.e) a2;
            return Result.m8023constructorimpl(eVar != null ? io.bidmachine.analytics.internal.G.f.a(eVar) : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
    }

    @Override // io.bidmachine.analytics.internal.H.e
    public Object a(String str) {
        return a(a().a(str));
    }

    @Override // io.bidmachine.analytics.internal.H.e
    public Object a(List list) {
        io.bidmachine.analytics.internal.F.c a2 = a();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(io.bidmachine.analytics.internal.G.f.a((C5903e) it.next()));
        }
        return a2.e(arrayList);
    }

    public final Object b() {
        return a().b();
    }

    @Override // io.bidmachine.analytics.internal.H.e
    public Object a(String str, List list) {
        io.bidmachine.analytics.internal.F.c a2 = a();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(io.bidmachine.analytics.internal.G.f.a((C5903e.a) it.next()).toString());
        }
        return a2.a(str, arrayList);
    }

    @Override // io.bidmachine.analytics.internal.H.e
    public Object a(List list, List list2) {
        a().b(list);
        io.bidmachine.analytics.internal.F.c a2 = a();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(io.bidmachine.analytics.internal.G.f.a((C5903e.a) it.next()).toString());
        }
        a2.c(arrayList);
        Result.Companion companion = Result.INSTANCE;
        return Result.m8023constructorimpl(Unit.INSTANCE);
    }

    private final Object a(Object obj) {
        try {
            Result.Companion companion = Result.INSTANCE;
            ResultKt.throwOnFailure(obj);
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(io.bidmachine.analytics.internal.G.f.a((io.bidmachine.analytics.internal.G.e) it.next()));
            }
            return Result.m8023constructorimpl(arrayList);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
    }
}
