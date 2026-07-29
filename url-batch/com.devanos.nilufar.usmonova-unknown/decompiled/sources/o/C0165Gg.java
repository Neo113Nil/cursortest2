package o;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: o.Gg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0165Gg implements InterfaceC2357zU, InterfaceC1363kP {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ C0165Gg(Object obj, Object obj2, Object obj3, int i) {
        this.h = i;
        this.k = obj;
        this.j = obj2;
        this.i = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007b A[SYNTHETIC] */
    @Override // o.InterfaceC1363kP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object apply(Object obj) {
        long insert;
        Cursor cursor;
        EnumC0824cB enumC0824cB;
        int i = this.h;
        int i2 = 6;
        int i3 = 5;
        int i4 = 4;
        int i5 = 3;
        EnumC0824cB enumC0824cB2 = EnumC0824cB.CACHE_FULL;
        int i6 = 2;
        int i7 = 1;
        Object obj2 = this.i;
        Object obj3 = this.j;
        int i8 = 0;
        C1495mP c1495mP = (C1495mP) this.k;
        switch (i) {
            case 1:
                C2070v7 c2070v7 = (C2070v7) obj2;
                C1780qk c1780qk = c2070v7.c;
                String str = c2070v7.a;
                F7 f7 = (F7) obj3;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long simpleQueryForLong = c1495mP.b().compileStatement("PRAGMA page_size").simpleQueryForLong() * c1495mP.b().compileStatement("PRAGMA page_count").simpleQueryForLong();
                C2136w7 c2136w7 = c1495mP.k;
                if (simpleQueryForLong >= c2136w7.a) {
                    c1495mP.m(1L, enumC0824cB2, str);
                    return -1L;
                }
                Long c = C1495mP.c(sQLiteDatabase, f7);
                if (c != null) {
                    insert = c.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", f7.a);
                    contentValues.put("priority", Integer.valueOf(AbstractC1555nJ.a(f7.c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = f7.b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    insert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int i9 = c2136w7.e;
                byte[] bArr2 = c1780qk.b;
                boolean z = bArr2.length <= i9;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(insert));
                contentValues2.put("transport_name", str);
                contentValues2.put("timestamp_ms", Long.valueOf(c2070v7.d));
                contentValues2.put("uptime_ms", Long.valueOf(c2070v7.e));
                contentValues2.put("payload_encoding", c1780qk.a.a);
                contentValues2.put("code", c2070v7.b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z));
                contentValues2.put("payload", z ? bArr2 : new byte[0]);
                long insert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z) {
                    int ceil = (int) Math.ceil(bArr2.length / i9);
                    for (int i10 = 1; i10 <= ceil; i10++) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr2, (i10 - 1) * i9, Math.min(i10 * i9, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(insert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i10));
                        contentValues3.put("bytes", copyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(c2070v7.f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(insert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(insert2);
            case 2:
                ArrayList arrayList = (ArrayList) obj2;
                F7 f72 = (F7) obj3;
                Cursor cursor2 = (Cursor) obj;
                while (cursor2.moveToNext()) {
                    long j = cursor2.getLong(0);
                    int i11 = cursor2.getInt(7) != 0 ? i7 : 0;
                    C1343k5 c1343k5 = new C1343k5();
                    c1343k5.m = new HashMap();
                    String string = cursor2.getString(i7);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    c1343k5.h = string;
                    c1343k5.k = Long.valueOf(cursor2.getLong(i6));
                    c1343k5.l = Long.valueOf(cursor2.getLong(i5));
                    if (i11 != 0) {
                        String string2 = cursor2.getString(4);
                        c1343k5.j = new C1780qk(string2 == null ? C1495mP.m : new C1845rk(string2), cursor2.getBlob(5));
                    } else {
                        String string3 = cursor2.getString(4);
                        C1845rk c1845rk = string3 == null ? C1495mP.m : new C1845rk(string3);
                        Cursor query = c1495mP.b().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            int i12 = 0;
                            while (query.moveToNext()) {
                                byte[] blob = query.getBlob(0);
                                arrayList2.add(blob);
                                i12 += blob.length;
                            }
                            byte[] bArr3 = new byte[i12];
                            int i13 = 0;
                            int i14 = 0;
                            while (i13 < arrayList2.size()) {
                                byte[] bArr4 = (byte[]) arrayList2.get(i13);
                                cursor = query;
                                try {
                                    ArrayList arrayList3 = arrayList2;
                                    System.arraycopy(bArr4, 0, bArr3, i14, bArr4.length);
                                    i14 += bArr4.length;
                                    i13++;
                                    query = cursor;
                                    arrayList2 = arrayList3;
                                } catch (Throwable th) {
                                    th = th;
                                    cursor.close();
                                    throw th;
                                }
                            }
                            query.close();
                            c1343k5.j = new C1780qk(c1845rk, bArr3);
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = query;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        c1343k5.i = Integer.valueOf(cursor2.getInt(6));
                    }
                    arrayList.add(new B7(j, f72, c1343k5.h()));
                    i5 = 3;
                    i6 = 2;
                    i7 = 1;
                }
                return null;
            default:
                HashMap hashMap = (HashMap) obj3;
                C1334k c1334k = (C1334k) obj2;
                Cursor cursor3 = (Cursor) obj;
                c1495mP.getClass();
                while (cursor3.moveToNext()) {
                    String string4 = cursor3.getString(i8);
                    int i15 = cursor3.getInt(1);
                    EnumC0824cB enumC0824cB3 = EnumC0824cB.REASON_UNKNOWN;
                    if (i15 != 0) {
                        if (i15 == 1) {
                            enumC0824cB3 = EnumC0824cB.MESSAGE_TOO_OLD;
                        } else if (i15 == 2) {
                            enumC0824cB = enumC0824cB2;
                            long j2 = cursor3.getLong(2);
                            if (hashMap.containsKey(string4)) {
                                hashMap.put(string4, new ArrayList());
                            }
                            ((List) hashMap.get(string4)).add(new C0890dB(j2, enumC0824cB));
                            i8 = 0;
                            i2 = 6;
                            i3 = 5;
                            i4 = 4;
                        } else if (i15 == 3) {
                            enumC0824cB3 = EnumC0824cB.PAYLOAD_TOO_BIG;
                        } else if (i15 == i4) {
                            enumC0824cB3 = EnumC0824cB.MAX_RETRIES_REACHED;
                        } else if (i15 == i3) {
                            enumC0824cB3 = EnumC0824cB.INVALID_PAYLOD;
                        } else if (i15 == i2) {
                            enumC0824cB3 = EnumC0824cB.SERVER_ERROR;
                        } else {
                            AbstractC0868ct.q("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i15));
                        }
                    }
                    enumC0824cB = enumC0824cB3;
                    long j22 = cursor3.getLong(2);
                    if (hashMap.containsKey(string4)) {
                    }
                    ((List) hashMap.get(string4)).add(new C0890dB(j22, enumC0824cB));
                    i8 = 0;
                    i2 = 6;
                    i3 = 5;
                    i4 = 4;
                }
                for (Map.Entry entry2 : hashMap.entrySet()) {
                    int i16 = C1021fB.c;
                    new ArrayList();
                    ((ArrayList) c1334k.j).add(new C1021fB((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                }
                long a = c1495mP.i.a();
                SQLiteDatabase b = c1495mP.b();
                b.beginTransaction();
                try {
                    Cursor rawQuery = b.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    try {
                        rawQuery.moveToNext();
                        LV lv = new LV(rawQuery.getLong(0), a);
                        rawQuery.close();
                        b.setTransactionSuccessful();
                        b.endTransaction();
                        c1334k.i = lv;
                        c1334k.k = new C0097Dq(new PT(c1495mP.b().compileStatement("PRAGMA page_size").simpleQueryForLong() * c1495mP.b().compileStatement("PRAGMA page_count").simpleQueryForLong(), C2136w7.f.a));
                        c1334k.l = (String) c1495mP.l.get();
                        return new C0160Gb((LV) c1334k.i, Collections.unmodifiableList((ArrayList) c1334k.j), (C0097Dq) c1334k.k, (String) c1334k.l);
                    } catch (Throwable th3) {
                        rawQuery.close();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    b.endTransaction();
                    throw th4;
                }
        }
    }

    @Override // o.InterfaceC2357zU
    public Object execute() {
        C0217Ig c0217Ig = (C0217Ig) this.k;
        F7 f7 = (F7) this.j;
        C2070v7 c2070v7 = (C2070v7) this.i;
        C1495mP c1495mP = (C1495mP) c0217Ig.d;
        c1495mP.getClass();
        EnumC1489mJ enumC1489mJ = f7.c;
        String str = c2070v7.a;
        String str2 = f7.a;
        String B = AbstractC0868ct.B("SQLiteEventStore");
        if (Log.isLoggable(B, 3)) {
            Log.d(B, "Storing event with priority=" + enumC1489mJ + ", name=" + str + " for destination " + str2);
        }
        ((Long) c1495mP.j(new C0165Gg(c1495mP, (Object) c2070v7, f7, 1))).getClass();
        c0217Ig.a.a(f7, 1, false);
        return null;
    }

    public /* synthetic */ C0165Gg(C1495mP c1495mP, Object obj, F7 f7, int i) {
        this.h = i;
        this.k = c1495mP;
        this.i = obj;
        this.j = f7;
    }
}
