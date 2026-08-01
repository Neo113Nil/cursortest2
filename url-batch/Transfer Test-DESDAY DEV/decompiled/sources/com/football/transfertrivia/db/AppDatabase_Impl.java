package com.football.transfertrivia.db;

import T.e;
import V0.n;
import W0.c;
import W0.i;
import android.database.Cursor;
import androidx.room.g;
import androidx.room.o;
import androidx.room.t;
import androidx.room.u;
import androidx.room.v;
import g1.f;
import h0.C0137a;
import h0.d;
import j0.a;
import j0.b;
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
    private volatile GameSessionDao _gameSessionDao;

    @Override // androidx.room.t
    public void clearAllTables() {
        super.assertNotMainThread();
        a a2 = ((h) super.getOpenHelper()).a();
        try {
            super.beginTransaction();
            a2.l("DELETE FROM `game_sessions`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            a2.q("PRAGMA wal_checkpoint(FULL)").close();
            if (!a2.u()) {
                a2.l("VACUUM");
            }
        }
    }

    @Override // androidx.room.t
    public o createInvalidationTracker() {
        return new o(this, new HashMap(0), new HashMap(0), "game_sessions");
    }

    @Override // androidx.room.t
    public b createOpenHelper(g gVar) {
        u uVar = new u(1) { // from class: com.football.transfertrivia.db.AppDatabase_Impl.1
            @Override // androidx.room.u
            public void createAllTables(a aVar) {
                aVar.l("CREATE TABLE IF NOT EXISTS `game_sessions` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `score` INTEGER NOT NULL, `lives` INTEGER NOT NULL, `currentQuestion` INTEGER NOT NULL, `timeLeft` INTEGER NOT NULL, `isActive` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL)");
                aVar.l("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                aVar.l("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7c25debb60a940f62871502d02bdf8b5')");
            }

            @Override // androidx.room.u
            public void dropAllTables(a aVar) {
                aVar.l("DROP TABLE IF EXISTS `game_sessions`");
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
            public void onCreate(a aVar) {
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
            public void onOpen(a aVar) {
                ((t) AppDatabase_Impl.this).mDatabase = aVar;
                AppDatabase_Impl.this.internalInitInvalidationTracker(aVar);
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
            public void onPostMigrate(a aVar) {
            }

            @Override // androidx.room.u
            public void onPreMigrate(a aVar) {
                f.e(aVar, "db");
                c cVar = new c(10);
                Cursor q2 = aVar.q("SELECT name FROM sqlite_master WHERE type = 'trigger'");
                while (q2.moveToNext()) {
                    try {
                        cVar.add(q2.getString(0));
                    } finally {
                    }
                }
                e.m(q2, null);
                ListIterator listIterator = e.h(cVar).listIterator(0);
                while (true) {
                    W0.a aVar2 = (W0.a) listIterator;
                    if (!aVar2.hasNext()) {
                        return;
                    }
                    String str = (String) aVar2.next();
                    f.d(str, "triggerName");
                    if (str.startsWith("room_fts_content_sync_")) {
                        aVar.l("DROP TRIGGER IF EXISTS ".concat(str));
                    }
                }
            }

            /* JADX WARN: Finally extract failed */
            /* JADX WARN: Removed duplicated region for block: B:64:0x0256  */
            /* JADX WARN: Removed duplicated region for block: B:67:0x0273  */
            @Override // androidx.room.u
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public v onValidateSchema(a aVar) {
                Map b2;
                i iVar;
                h0.e eVar;
                HashMap hashMap = new HashMap(7);
                hashMap.put("id", new C0137a("id", "INTEGER", true, 1, null, 1));
                hashMap.put("score", new C0137a("score", "INTEGER", true, 0, null, 1));
                hashMap.put("lives", new C0137a("lives", "INTEGER", true, 0, null, 1));
                hashMap.put("currentQuestion", new C0137a("currentQuestion", "INTEGER", true, 0, null, 1));
                hashMap.put("timeLeft", new C0137a("timeLeft", "INTEGER", true, 0, null, 1));
                hashMap.put("isActive", new C0137a("isActive", "INTEGER", true, 0, null, 1));
                hashMap.put("timestamp", new C0137a("timestamp", "INTEGER", true, 0, null, 1));
                h0.e eVar2 = new h0.e(hashMap, new HashSet(0), new HashSet(0));
                f.e(aVar, "database");
                Cursor q2 = aVar.q("PRAGMA table_info(`game_sessions`)");
                try {
                    if (q2.getColumnCount() <= 0) {
                        b2 = n.f876a;
                        e.m(q2, null);
                    } else {
                        int columnIndex = q2.getColumnIndex("name");
                        int columnIndex2 = q2.getColumnIndex("type");
                        int columnIndex3 = q2.getColumnIndex("notnull");
                        int columnIndex4 = q2.getColumnIndex("pk");
                        int columnIndex5 = q2.getColumnIndex("dflt_value");
                        W0.f fVar = new W0.f();
                        while (q2.moveToNext()) {
                            String string = q2.getString(columnIndex);
                            String string2 = q2.getString(columnIndex2);
                            boolean z2 = q2.getInt(columnIndex3) != 0;
                            int i = q2.getInt(columnIndex4);
                            String string3 = q2.getString(columnIndex5);
                            f.d(string, "name");
                            f.d(string2, "type");
                            fVar.put(string, new C0137a(string, string2, z2, i, string3, 2));
                        }
                        b2 = fVar.b();
                        e.m(q2, null);
                    }
                    q2 = aVar.q("PRAGMA foreign_key_list(`game_sessions`)");
                    try {
                        int columnIndex6 = q2.getColumnIndex("id");
                        int columnIndex7 = q2.getColumnIndex("seq");
                        int columnIndex8 = q2.getColumnIndex("table");
                        int columnIndex9 = q2.getColumnIndex("on_delete");
                        int columnIndex10 = q2.getColumnIndex("on_update");
                        List k2 = h0.f.k(q2);
                        q2.moveToPosition(-1);
                        i iVar2 = new i();
                        while (q2.moveToNext()) {
                            if (q2.getInt(columnIndex7) == 0) {
                                int i2 = q2.getInt(columnIndex6);
                                ArrayList arrayList = new ArrayList();
                                ArrayList arrayList2 = new ArrayList();
                                ArrayList arrayList3 = new ArrayList();
                                for (Object obj : k2) {
                                    int i3 = columnIndex6;
                                    int i4 = columnIndex7;
                                    if (((h0.c) obj).f2595a == i2) {
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
                                    arrayList.add(cVar.f2597c);
                                    arrayList2.add(cVar.d);
                                }
                                String string4 = q2.getString(columnIndex8);
                                f.d(string4, "cursor.getString(tableColumnIndex)");
                                String string5 = q2.getString(columnIndex9);
                                f.d(string5, "cursor.getString(onDeleteColumnIndex)");
                                String string6 = q2.getString(columnIndex10);
                                f.d(string6, "cursor.getString(onUpdateColumnIndex)");
                                iVar2.add(new h0.b(string4, string5, string6, arrayList, arrayList2));
                                columnIndex6 = i5;
                                columnIndex7 = i6;
                                columnIndex8 = columnIndex8;
                            }
                        }
                        i i7 = e.i(iVar2);
                        e.m(q2, null);
                        q2 = aVar.q("PRAGMA index_list(`game_sessions`)");
                        try {
                            int columnIndex11 = q2.getColumnIndex("name");
                            int columnIndex12 = q2.getColumnIndex("origin");
                            int columnIndex13 = q2.getColumnIndex("unique");
                            if (columnIndex11 != -1 && columnIndex12 != -1 && columnIndex13 != -1) {
                                i iVar3 = new i();
                                while (q2.moveToNext()) {
                                    if ("c".equals(q2.getString(columnIndex12))) {
                                        String string7 = q2.getString(columnIndex11);
                                        boolean z3 = q2.getInt(columnIndex13) == 1;
                                        f.d(string7, "name");
                                        d l2 = h0.f.l(aVar, string7, z3);
                                        if (l2 == null) {
                                            e.m(q2, null);
                                        } else {
                                            iVar3.add(l2);
                                        }
                                    }
                                }
                                i i8 = e.i(iVar3);
                                e.m(q2, null);
                                iVar = i8;
                                eVar = new h0.e(b2, i7, iVar);
                                if (!eVar2.equals(eVar)) {
                                    return new v(true, null);
                                }
                                return new v(false, "game_sessions(com.football.transfertrivia.db.GameSessionEntity).\n Expected:\n" + eVar2 + "\n Found:\n" + eVar);
                            }
                            e.m(q2, null);
                            iVar = null;
                            eVar = new h0.e(b2, i7, iVar);
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
        };
        f.e(gVar, "configuration");
        int i = uVar.version;
        B.d dVar = new B.d();
        dVar.f43a = i;
        dVar.f44b = gVar;
        dVar.f45c = uVar;
        return new h(gVar.f1677a, "transfer_test_database", dVar);
    }

    @Override // com.football.transfertrivia.db.AppDatabase
    public GameSessionDao gameSessionDao() {
        GameSessionDao gameSessionDao;
        if (this._gameSessionDao != null) {
            return this._gameSessionDao;
        }
        synchronized (this) {
            try {
                if (this._gameSessionDao == null) {
                    this._gameSessionDao = new GameSessionDao_Impl(this);
                }
                gameSessionDao = this._gameSessionDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gameSessionDao;
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
        hashMap.put(GameSessionDao.class, GameSessionDao_Impl.getRequiredConverters());
        return hashMap;
    }
}
