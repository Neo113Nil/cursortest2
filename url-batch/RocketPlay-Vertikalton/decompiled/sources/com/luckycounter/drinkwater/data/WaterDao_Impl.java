package com.luckycounter.drinkwater.data;

import Z0.d;
import a1.AbstractC0067d;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.h;
import androidx.room.i;
import androidx.room.t;
import androidx.room.w;
import c1.AbstractC0104b;
import i1.f;
import j0.InterfaceC0182e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class WaterDao_Impl implements WaterDao {
    private final t __db;
    private final h __deletionAdapterOfWaterEntry;
    private final i __insertionAdapterOfWaterEntry;

    public WaterDao_Impl(t tVar) {
        this.__db = tVar;
        this.__insertionAdapterOfWaterEntry = new i(tVar) { // from class: com.luckycounter.drinkwater.data.WaterDao_Impl.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(tVar);
                f.e(tVar, "database");
            }

            @Override // androidx.room.y
            public String createQuery() {
                return "INSERT OR ABORT INTO `water_entries` (`id`,`amountMl`,`timestamp`) VALUES (nullif(?, 0),?,?)";
            }

            @Override // androidx.room.i
            public void bind(InterfaceC0182e interfaceC0182e, WaterEntry waterEntry) {
                interfaceC0182e.s(1, waterEntry.getId());
                interfaceC0182e.s(2, waterEntry.getAmountMl());
                interfaceC0182e.s(3, waterEntry.getTimestamp());
            }
        };
        this.__deletionAdapterOfWaterEntry = new h(tVar) { // from class: com.luckycounter.drinkwater.data.WaterDao_Impl.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(tVar);
                f.e(tVar, "database");
            }

            @Override // androidx.room.y
            public String createQuery() {
                return "DELETE FROM `water_entries` WHERE `id` = ?";
            }

            @Override // androidx.room.h
            public void bind(InterfaceC0182e interfaceC0182e, WaterEntry waterEntry) {
                interfaceC0182e.s(1, waterEntry.getId());
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.luckycounter.drinkwater.data.WaterDao
    public Object delete(final WaterEntry waterEntry, d dVar) {
        return androidx.room.f.b(this.__db, new Callable<V0.i>() { // from class: com.luckycounter.drinkwater.data.WaterDao_Impl.4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public V0.i call() {
                WaterDao_Impl.this.__db.beginTransaction();
                try {
                    WaterDao_Impl.this.__deletionAdapterOfWaterEntry.handle(waterEntry);
                    WaterDao_Impl.this.__db.setTransactionSuccessful();
                    return V0.i.f1250a;
                } finally {
                    WaterDao_Impl.this.__db.endTransaction();
                }
            }
        }, dVar);
    }

    @Override // com.luckycounter.drinkwater.data.WaterDao
    public Object getEntriesForDay(long j2, long j3, d dVar) {
        final w h = w.h("SELECT * FROM water_entries WHERE timestamp >= ? AND timestamp < ? ORDER BY timestamp DESC");
        h.s(1, j2);
        h.s(2, j3);
        return androidx.room.f.a(this.__db, new CancellationSignal(), new Callable<List<WaterEntry>>() { // from class: com.luckycounter.drinkwater.data.WaterDao_Impl.5
            @Override // java.util.concurrent.Callable
            public List<WaterEntry> call() {
                Cursor q2 = AbstractC0067d.q(WaterDao_Impl.this.__db, h);
                try {
                    int m2 = AbstractC0104b.m(q2, "id");
                    int m3 = AbstractC0104b.m(q2, "amountMl");
                    int m4 = AbstractC0104b.m(q2, "timestamp");
                    ArrayList arrayList = new ArrayList(q2.getCount());
                    while (q2.moveToNext()) {
                        arrayList.add(new WaterEntry(q2.getLong(m2), q2.getInt(m3), q2.getLong(m4)));
                    }
                    return arrayList;
                } finally {
                    q2.close();
                    h.i();
                }
            }
        }, dVar);
    }

    @Override // com.luckycounter.drinkwater.data.WaterDao
    public Object insert(final WaterEntry waterEntry, d dVar) {
        return androidx.room.f.b(this.__db, new Callable<Long>() { // from class: com.luckycounter.drinkwater.data.WaterDao_Impl.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() {
                WaterDao_Impl.this.__db.beginTransaction();
                try {
                    Long valueOf = Long.valueOf(WaterDao_Impl.this.__insertionAdapterOfWaterEntry.insertAndReturnId(waterEntry));
                    WaterDao_Impl.this.__db.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    WaterDao_Impl.this.__db.endTransaction();
                }
            }
        }, dVar);
    }

    @Override // com.luckycounter.drinkwater.data.WaterDao
    public Object sumForDay(long j2, long j3, d dVar) {
        final w h = w.h("SELECT COALESCE(SUM(amountMl), 0) FROM water_entries WHERE timestamp >= ? AND timestamp < ?");
        h.s(1, j2);
        h.s(2, j3);
        return androidx.room.f.a(this.__db, new CancellationSignal(), new Callable<Integer>() { // from class: com.luckycounter.drinkwater.data.WaterDao_Impl.6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() {
                Cursor q2 = AbstractC0067d.q(WaterDao_Impl.this.__db, h);
                try {
                    Integer num = null;
                    if (q2.moveToFirst() && !q2.isNull(0)) {
                        num = Integer.valueOf(q2.getInt(0));
                    }
                    return num;
                } finally {
                    q2.close();
                    h.i();
                }
            }
        }, dVar);
    }
}
