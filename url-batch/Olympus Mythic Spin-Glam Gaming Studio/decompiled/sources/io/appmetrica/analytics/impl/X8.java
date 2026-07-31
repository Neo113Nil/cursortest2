package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: classes13.dex */
public final class X8 {
    public final C5586p7 a;
    public final C5532n5 b;
    public final AtomicLong c;
    public final List d;
    public final Z6 e;
    public final ReentrantReadWriteLock.WriteLock f;

    public X8(C5586p7 c5586p7, C5532n5 c5532n5, AtomicLong atomicLong, ArrayList arrayList, Z6 z6, ReentrantReadWriteLock reentrantReadWriteLock) {
        this.a = c5586p7;
        this.b = c5532n5;
        this.c = atomicLong;
        this.d = arrayList;
        this.e = z6;
        this.f = reentrantReadWriteLock.writeLock();
    }

    public final int a(SQLiteDatabase sQLiteDatabase) {
        try {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            return this.e.a(sQLiteDatabase, String.format("id IN (SELECT id FROM events ORDER BY CASE WHEN type IN (%1$s) THEN 2 WHEN type IN (%2$s) THEN 1 ELSE 0 END, id LIMIT (SELECT count() FROM events) / %3$s)", Arrays.copyOf(new Object[]{CollectionsKt.joinToString$default(Q9.i, ", ", null, null, 0, null, null, 62, null), CollectionsKt.joinToString$default(Q9.j, ", ", null, null, 0, null, null, 62, null), 10}, 3)), null, 2, this.b.b.b, true).b;
        } catch (Throwable th) {
            C5340fk c5340fk = Dj.a;
            c5340fk.getClass();
            c5340fk.a(new Ej("deleteExcessiveReports exception", th));
            return 0;
        }
    }

    public final void b(List list) {
        int i;
        if (list.isEmpty()) {
            return;
        }
        long j = ((C5804xh) this.b.k.a()).v;
        ReentrantReadWriteLock.WriteLock writeLock = this.f;
        writeLock.lock();
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
                if (writableDatabase != null) {
                    try {
                        writableDatabase.beginTransaction();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ContentValues contentValues = (ContentValues) it.next();
                            writableDatabase.insertOrThrow("events", null, contentValues);
                            this.c.incrementAndGet();
                            a(contentValues);
                        }
                        if (this.c.get() > j) {
                            i = a(writableDatabase);
                            this.c.addAndGet(-i);
                        } else {
                            i = 0;
                        }
                        writableDatabase.setTransactionSuccessful();
                        if (i != 0) {
                            Iterator it2 = this.d.iterator();
                            while (it2.hasNext()) {
                                ((InterfaceC5510m9) it2.next()).a();
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable unused) {
                        sQLiteDatabase = writableDatabase;
                        try {
                            Unit unit2 = Unit.INSTANCE;
                        } finally {
                            Do.a(sQLiteDatabase);
                        }
                    }
                }
                Do.a(writableDatabase);
            } finally {
                writeLock.unlock();
            }
        } catch (Throwable unused2) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(ContentValues contentValues) {
        Integer asInteger = contentValues.getAsInteger("type");
        if (Q9.d.contains(EnumC5798xb.a(asInteger != null ? asInteger.intValue() : -1))) {
            C5742v7 model = new C5768w7(null, 1, 0 == true ? 1 : 0).toModel(contentValues);
            PublicLogger publicLogger = this.b.m;
            EnumC5798xb enumC5798xb = model.d;
            C5716u7 c5716u7 = model.g;
            publicLogger.info(AbstractC5491lg.a("Event saved to db", enumC5798xb, c5716u7.b, c5716u7.c), new Object[0]);
        }
    }

    public final void a(List list) {
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer asInteger = ((ContentValues) it.next()).getAsInteger("type");
            arrayList.add(Integer.valueOf(asInteger != null ? asInteger.intValue() : -1));
        }
        Iterator it2 = this.d.iterator();
        while (it2.hasNext()) {
            ((InterfaceC5510m9) it2.next()).a(arrayList);
        }
        ((A5) this.b.p).e();
    }
}
