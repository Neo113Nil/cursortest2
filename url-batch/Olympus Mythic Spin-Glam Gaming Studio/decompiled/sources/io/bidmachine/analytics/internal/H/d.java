package io.bidmachine.analytics.internal.H;

import android.database.sqlite.SQLiteDatabase;
import io.bidmachine.analytics.internal.g.C5902d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
public final class d implements c {
    private final SQLiteDatabase a;
    private final Lazy b = LazyKt.lazy(new a());

    static final class a extends Lambda implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final io.bidmachine.analytics.internal.F.b mo4828invoke() {
            return new io.bidmachine.analytics.internal.F.b(d.this.a);
        }
    }

    public d(SQLiteDatabase sQLiteDatabase) {
        this.a = sQLiteDatabase;
    }

    @Override // io.bidmachine.analytics.internal.H.c
    public Object b(List list) {
        io.bidmachine.analytics.internal.F.b a2 = a();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(io.bidmachine.analytics.internal.G.d.a((C5902d) it.next()));
        }
        return a2.a(arrayList);
    }

    @Override // io.bidmachine.analytics.internal.H.c
    public Object c(List list) {
        io.bidmachine.analytics.internal.F.b a2 = a();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(io.bidmachine.analytics.internal.G.d.a((C5902d) it.next()));
        }
        return a2.b(arrayList);
    }

    private final io.bidmachine.analytics.internal.F.b a() {
        return (io.bidmachine.analytics.internal.F.b) this.b.getValue();
    }

    @Override // io.bidmachine.analytics.internal.H.c
    public Object a(C5902d c5902d) {
        return a().a(io.bidmachine.analytics.internal.G.d.a(c5902d));
    }

    @Override // io.bidmachine.analytics.internal.H.c
    public Object a(String str, String str2) {
        return a(a().a(str, str2));
    }

    @Override // io.bidmachine.analytics.internal.H.c
    public Object a(String str, String str2, int i) {
        return a(a().a(str, str2, Integer.valueOf(i)));
    }

    @Override // io.bidmachine.analytics.internal.H.c
    public Object a(List list) {
        io.bidmachine.analytics.internal.F.b a2 = a();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(io.bidmachine.analytics.internal.G.d.a((C5902d) it.next()));
        }
        return a2.c(arrayList);
    }

    public final Object b() {
        return a().a();
    }

    @Override // io.bidmachine.analytics.internal.H.c
    public Object a(String str, List list) {
        return a().a(str, list);
    }

    private final Object a(Object obj) {
        try {
            Result.Companion companion = Result.INSTANCE;
            ResultKt.throwOnFailure(obj);
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(io.bidmachine.analytics.internal.G.d.a((io.bidmachine.analytics.internal.G.c) it.next()));
            }
            return Result.m8023constructorimpl(arrayList);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
    }
}
