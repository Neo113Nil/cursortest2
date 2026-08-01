package com.luckycounter.drinkwater.data;

import B.d;
import F1.l;
import X0.a;
import X0.c;
import X0.i;
import a1.AbstractC0067d;
import android.database.Cursor;
import androidx.room.g;
import androidx.room.o;
import androidx.room.t;
import androidx.room.u;
import androidx.room.v;
import c1.AbstractC0104b;
import h0.b;
import h0.e;
import i1.f;
import j0.InterfaceC0178a;
import j0.InterfaceC0179b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import k0.h;

/* loaded from: classes.dex */
public final class AppDatabase_Impl extends AppDatabase {
    private volatile WaterDao _waterDao;

    @Override // androidx.room.t
    public void clearAllTables() {
        super.assertNotMainThread();
        InterfaceC0178a a2 = ((h) super.getOpenHelper()).a();
        try {
            super.beginTransaction();
            a2.p("DELETE FROM `water_entries`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            a2.t("PRAGMA wal_checkpoint(FULL)").close();
            if (!a2.x()) {
                a2.p("VACUUM");
            }
        }
    }

    @Override // androidx.room.t
    public o createInvalidationTracker() {
        return new o(this, new HashMap(0), new HashMap(0), "water_entries");
    }

    @Override // androidx.room.t
    public InterfaceC0179b createOpenHelper(g gVar) {
        return new h(gVar.f2056a, "lucky_counter_db", new d(gVar, new u(1) { // from class: com.luckycounter.drinkwater.data.AppDatabase_Impl.1
            @Override // androidx.room.u
            public void createAllTables(InterfaceC0178a interfaceC0178a) {
                interfaceC0178a.p("CREATE TABLE IF NOT EXISTS `water_entries` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `amountMl` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL)");
                interfaceC0178a.p("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                interfaceC0178a.p("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7ee45c9fd872b863c58c5d553d86a94d')");
            }

            @Override // androidx.room.u
            public void dropAllTables(InterfaceC0178a interfaceC0178a) {
                interfaceC0178a.p("DROP TABLE IF EXISTS `water_entries`");
                List list = ((t) AppDatabase_Impl.this).mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                }
            }

            @Override // androidx.room.u
            public void onCreate(InterfaceC0178a interfaceC0178a) {
                List list = ((t) AppDatabase_Impl.this).mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                }
            }

            @Override // androidx.room.u
            public void onOpen(InterfaceC0178a interfaceC0178a) {
                ((t) AppDatabase_Impl.this).mDatabase = interfaceC0178a;
                AppDatabase_Impl.this.internalInitInvalidationTracker(interfaceC0178a);
                List list = ((t) AppDatabase_Impl.this).mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                }
            }

            @Override // androidx.room.u
            public void onPostMigrate(InterfaceC0178a interfaceC0178a) {
            }

            @Override // androidx.room.u
            public void onPreMigrate(InterfaceC0178a interfaceC0178a) {
                f.e(interfaceC0178a, "db");
                c cVar = new c(10);
                Cursor t2 = interfaceC0178a.t("SELECT name FROM sqlite_master WHERE type = 'trigger'");
                while (t2.moveToNext()) {
                    try {
                        cVar.add(t2.getString(0));
                    } finally {
                    }
                }
                AbstractC0104b.g(t2, null);
                ListIterator listIterator = l.b(cVar).listIterator(0);
                while (true) {
                    a aVar = (a) listIterator;
                    if (!aVar.hasNext()) {
                        return;
                    }
                    String str = (String) aVar.next();
                    f.d(str, "triggerName");
                    if (p1.l.J(str, "room_fts_content_sync_", false)) {
                        interfaceC0178a.p("DROP TRIGGER IF EXISTS ".concat(str));
                    }
                }
            }

            /* JADX WARN: Finally extract failed */
            /* JADX WARN: Removed duplicated region for block: B:64:0x021a  */
            /* JADX WARN: Removed duplicated region for block: B:67:0x0237  */
            @Override // androidx.room.u
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public v onValidateSchema(InterfaceC0178a interfaceC0178a) {
                Map b2;
                i iVar;
                e eVar;
                HashMap hashMap = new HashMap(3);
                hashMap.put("id", new h0.a("id", "INTEGER", true, 1, null, 1));
                hashMap.put("amountMl", new h0.a("amountMl", "INTEGER", true, 0, null, 1));
                hashMap.put("timestamp", new h0.a("timestamp", "INTEGER", true, 0, null, 1));
                e eVar2 = new e(hashMap, new HashSet(0), new HashSet(0));
                f.e(interfaceC0178a, "database");
                Cursor t2 = interfaceC0178a.t("PRAGMA table_info(`water_entries`)");
                try {
                    if (t2.getColumnCount() <= 0) {
                        b2 = W0.t.f1285a;
                        AbstractC0104b.g(t2, null);
                    } else {
                        int columnIndex = t2.getColumnIndex("name");
                        int columnIndex2 = t2.getColumnIndex("type");
                        int columnIndex3 = t2.getColumnIndex("notnull");
                        int columnIndex4 = t2.getColumnIndex("pk");
                        int columnIndex5 = t2.getColumnIndex("dflt_value");
                        X0.f fVar = new X0.f();
                        while (t2.moveToNext()) {
                            String string = t2.getString(columnIndex);
                            String string2 = t2.getString(columnIndex2);
                            boolean z2 = t2.getInt(columnIndex3) != 0;
                            int i = t2.getInt(columnIndex4);
                            String string3 = t2.getString(columnIndex5);
                            f.d(string, "name");
                            f.d(string2, "type");
                            fVar.put(string, new h0.a(string, string2, z2, i, string3, 2));
                        }
                        b2 = fVar.b();
                        AbstractC0104b.g(t2, null);
                    }
                    t2 = interfaceC0178a.t("PRAGMA foreign_key_list(`water_entries`)");
                    try {
                        int columnIndex6 = t2.getColumnIndex("id");
                        int columnIndex7 = t2.getColumnIndex("seq");
                        int columnIndex8 = t2.getColumnIndex("table");
                        int columnIndex9 = t2.getColumnIndex("on_delete");
                        int columnIndex10 = t2.getColumnIndex("on_update");
                        List r2 = AbstractC0067d.r(t2);
                        t2.moveToPosition(-1);
                        i iVar2 = new i();
                        while (t2.moveToNext()) {
                            if (t2.getInt(columnIndex7) == 0) {
                                int i2 = t2.getInt(columnIndex6);
                                ArrayList arrayList = new ArrayList();
                                ArrayList arrayList2 = new ArrayList();
                                ArrayList arrayList3 = new ArrayList();
                                for (Object obj : r2) {
                                    int i3 = columnIndex6;
                                    int i4 = columnIndex7;
                                    if (((h0.c) obj).f3020a == i2) {
                                        arrayList3.add(obj);
                                    }
                                    columnIndex6 = i3;
                                    columnIndex7 = i4;
                                }
                                int i5 = columnIndex6;
                                int i6 = columnIndex7;
                                Iterator it = arrayList3.iterator();
                                while (it.hasNext()) {
                                    h0.c cVar = (h0.c) it.next();
                                    arrayList.add(cVar.f3022c);
                                    arrayList2.add(cVar.d);
                                }
                                String string4 = t2.getString(columnIndex8);
                                f.d(string4, "cursor.getString(tableColumnIndex)");
                                String string5 = t2.getString(columnIndex9);
                                f.d(string5, "cursor.getString(onDeleteColumnIndex)");
                                String string6 = t2.getString(columnIndex10);
                                f.d(string6, "cursor.getString(onUpdateColumnIndex)");
                                iVar2.add(new b(string4, string5, string6, arrayList, arrayList2));
                                columnIndex6 = i5;
                                columnIndex7 = i6;
                                columnIndex8 = columnIndex8;
                            }
                        }
                        i c2 = l.c(iVar2);
                        AbstractC0104b.g(t2, null);
                        t2 = interfaceC0178a.t("PRAGMA index_list(`water_entries`)");
                        try {
                            int columnIndex11 = t2.getColumnIndex("name");
                            int columnIndex12 = t2.getColumnIndex("origin");
                            int columnIndex13 = t2.getColumnIndex("unique");
                            if (columnIndex11 != -1 && columnIndex12 != -1 && columnIndex13 != -1) {
                                i iVar3 = new i();
                                while (t2.moveToNext()) {
                                    if ("c".equals(t2.getString(columnIndex12))) {
                                        String string7 = t2.getString(columnIndex11);
                                        boolean z3 = t2.getInt(columnIndex13) == 1;
                                        f.d(string7, "name");
                                        h0.d s2 = AbstractC0067d.s(interfaceC0178a, string7, z3);
                                        if (s2 == null) {
                                            AbstractC0104b.g(t2, null);
                                        } else {
                                            iVar3.add(s2);
                                        }
                                    }
                                }
                                i c3 = l.c(iVar3);
                                AbstractC0104b.g(t2, null);
                                iVar = c3;
                                eVar = new e(b2, c2, iVar);
                                if (!eVar2.equals(eVar)) {
                                    return new v(null, true);
                                }
                                return new v("water_entries(com.luckycounter.drinkwater.data.WaterEntry).\n Expected:\n" + eVar2 + "\n Found:\n" + eVar, false);
                            }
                            AbstractC0104b.g(t2, null);
                            iVar = null;
                            eVar = new e(b2, c2, iVar);
                            if (!eVar2.equals(eVar)) {
                            }
                        } finally {
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            }
        }));
    }

    @Override // androidx.room.t
    public List<Object> getAutoMigrations(Map<Class<Object>, Object> map) {
        return new ArrayList();
    }

    @Override // androidx.room.t
    public Set<Class<Object>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.t
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(WaterDao.class, WaterDao_Impl.getRequiredConverters());
        return hashMap;
    }

    @Override // com.luckycounter.drinkwater.data.AppDatabase
    public WaterDao waterDao() {
        WaterDao waterDao;
        if (this._waterDao != null) {
            return this._waterDao;
        }
        synchronized (this) {
            try {
                if (this._waterDao == null) {
                    this._waterDao = new WaterDao_Impl(this);
                }
                waterDao = this._waterDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return waterDao;
    }
}
