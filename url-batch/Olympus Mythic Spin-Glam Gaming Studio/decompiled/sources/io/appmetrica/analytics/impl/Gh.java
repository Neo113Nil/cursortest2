package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.db.DBUtils;
import io.appmetrica.analytics.coreutils.internal.io.GZIPCompressor;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.networktasks.internal.DefaultNetworkResponseHandler;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.RequestBodyEncrypter;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import io.appmetrica.analytics.networktasks.internal.SendingDataTaskHelper;
import io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class Gh implements UnderlyingNetworkTask {
    public final C5532n5 a;
    public C7 c;
    public final Hh d;
    public Pf e;
    public final C5492lh f;
    public final PublicLogger g;
    public final C5518mh h;
    public final FullUrlFormer i;
    public final Ub j;
    public final RequestDataHolder k;
    public final ResponseDataHolder l;
    public final SendingDataTaskHelper m;
    public int n;
    public final LinkedHashMap b = new LinkedHashMap();
    public boolean o = false;

    public Gh(@NonNull C5532n5 c5532n5, @NonNull C5518mh c5518mh, @NonNull Ub ub, @NonNull FullUrlFormer<C5804xh> fullUrlFormer, @NonNull RequestDataHolder requestDataHolder, @NonNull ResponseDataHolder responseDataHolder, @NonNull RequestBodyEncrypter requestBodyEncrypter) {
        this.m = new SendingDataTaskHelper(requestBodyEncrypter, new GZIPCompressor(), requestDataHolder, responseDataHolder, new DefaultNetworkResponseHandler());
        this.h = c5518mh;
        this.a = c5532n5;
        Hh hh = new Hh(c5532n5);
        this.d = hh;
        PublicLogger p = c5532n5.p();
        this.g = p;
        this.j = ub;
        this.k = requestDataHolder;
        this.l = responseDataHolder;
        this.i = fullUrlFormer;
        this.f = new C5492lh(hh, new C5582p3(1024000, "event value in ReportTask", p), AbstractC5840z1.a(), Ka.k().C());
    }

    public final void a(boolean z) {
        int i;
        List list;
        Hh hh = this.d;
        Pf pf = this.e;
        A9[] a9Arr = pf.a.a;
        List list2 = pf.b;
        int i2 = this.n;
        Po po = hh.c;
        synchronized (po) {
            JSONObject a = po.a.a();
            if (a.optInt("report_request_id", -1) != i2) {
                po.a.a(a.put("report_request_id", i2));
            }
            Qo qo = po.a;
            Qo.a(qo.a);
            Qo.a(qo.b);
        }
        ArrayList arrayList = new ArrayList(a9Arr.length);
        int length = a9Arr.length;
        char c = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            Long l = null;
            if (i3 >= length) {
                break;
            }
            A9 a9 = a9Arr[i3];
            int i5 = i4 + 1;
            long longValue = ((Number) list2.get(i4)).longValue();
            EnumC5600pl enumC5600pl = (EnumC5600pl) AbstractC5465kg.b.get(a9.b.c);
            if (enumC5600pl == null) {
                enumC5600pl = EnumC5600pl.FOREGROUND;
            }
            C5822y9[] c5822y9Arr = a9.c;
            if (c5822y9Arr.length == 0) {
                list = list2;
                i = i3;
            } else {
                i = i3;
                Long valueOf = Long.valueOf(c5822y9Arr[c].a);
                IntIterator it = new IntRange(1, ArraysKt.getLastIndex(c5822y9Arr)).iterator();
                l = valueOf;
                while (it.hasNext()) {
                    List list3 = list2;
                    Long valueOf2 = Long.valueOf(c5822y9Arr[it.nextInt()].a);
                    if (l.compareTo(valueOf2) < 0) {
                        l = valueOf2;
                        list2 = list3;
                    } else {
                        list2 = list3;
                    }
                }
                list = list2;
            }
            long longValue2 = l != null ? l.longValue() : 0L;
            C5822y9[] c5822y9Arr2 = a9.c;
            if (c5822y9Arr2 != null) {
                for (C5822y9 c5822y9 : c5822y9Arr2) {
                }
            }
            arrayList.add(new Zk(longValue, enumC5600pl.a, longValue2, z));
            i3 = i + 1;
            list2 = list;
            i4 = i5;
            c = 0;
        }
        C5250c7 c5250c7 = hh.a;
        long a2 = hh.b.a();
        c5250c7.getClass();
        ArrayList arrayList2 = new ArrayList();
        String format = String.format(Locale.US, "%1$s = ? AND %2$s = ? AND %3$s <= ?", SDKAnalyticsEvents.PARAMETER_SESSION_ID, "session_type", "number_in_session");
        c5250c7.b.lock();
        try {
            SQLiteDatabase writableDatabase = c5250c7.c.getWritableDatabase();
            if (writableDatabase != null) {
                if (M5.a.booleanValue()) {
                    c5250c7.c();
                }
                writableDatabase.beginTransaction();
                try {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(c5250c7.a(writableDatabase, format, (Zk) it2.next()));
                    }
                    writableDatabase.delete("sessions", K5.c, new String[]{String.valueOf(a2)});
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
        } catch (Throwable unused) {
        }
        c5250c7.b.unlock();
        Iterator it3 = arrayList2.iterator();
        int i6 = 0;
        while (it3.hasNext()) {
            X6 x6 = (X6) it3.next();
            if (x6.a != null) {
                ArrayList arrayList3 = new ArrayList();
                Iterator it4 = x6.a.iterator();
                while (it4.hasNext()) {
                    Integer asInteger = ((ContentValues) it4.next()).getAsInteger("type");
                    asInteger.intValue();
                    arrayList3.add(asInteger);
                }
                Iterator it5 = c5250c7.g.iterator();
                while (it5.hasNext()) {
                    ((InterfaceC5510m9) it5.next()).b(arrayList3);
                }
                List list4 = x6.a;
                for (int i7 = 0; i7 < list4.size(); i7++) {
                    ContentValues contentValues = (ContentValues) list4.get(i7);
                    Integer asInteger2 = contentValues.getAsInteger("type");
                    if (Q9.d.contains(EnumC5798xb.a(asInteger2 != null ? asInteger2.intValue() : -1))) {
                        C5742v7 model = new C5768w7(null, 1, null).toModel(contentValues);
                        PublicLogger publicLogger = c5250c7.e.m;
                        EnumC5798xb enumC5798xb = model.d;
                        C5716u7 c5716u7 = model.g;
                        publicLogger.info(AbstractC5491lg.a("Event removed from db", enumC5798xb, c5716u7.b, c5716u7.c), new Object[0]);
                    }
                }
            }
            i6 += x6.b;
        }
        c5250c7.f.addAndGet(-i6);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final String description() {
        return "ReportTask_" + ApiKeyUtils.createPartialApiKey(this.a.b.b);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final FullUrlFormer<?> getFullUrlFormer() {
        return this.i;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final RequestDataHolder getRequestDataHolder() {
        return this.k;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final ResponseDataHolder getResponseDataHolder() {
        return this.l;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @Nullable
    public final RetryPolicyConfig getRetryPolicyConfig() {
        return ((C5804xh) this.a.k.a()).getRetryPolicyConfig();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @Nullable
    public final SSLSocketFactory getSslSocketFactory() {
        ((Rl) Ka.I.z()).getClass();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x04a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c9 A[LOOP:3: B:65:0x01c3->B:67:0x01c9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03e7  */
    /* JADX WARN: Type inference failed for: r0v77, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v34, types: [io.appmetrica.analytics.impl.z9, io.appmetrica.analytics.protobuf.nano.MessageNano] */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v43 */
    /* JADX WARN: Type inference failed for: r10v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r19v10 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r19v9 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v43 */
    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onCreateTask() {
        Cursor cursor;
        ContentValues contentValues;
        int i;
        LinkedHashMap linkedHashMap;
        Cursor cursor2;
        C5449k0 c5449k0;
        SQLiteDatabase readableDatabase;
        C5449k0 c5449k02;
        LinkedHashMap linkedHashMap2;
        Throwable th;
        ArrayList arrayList;
        Iterator it;
        ?? r6;
        C5449k0 c5449k03;
        ArrayList arrayList2;
        ?? r19;
        C5804xh c5804xh;
        List list;
        C5492lh c5492lh;
        C7 c7;
        int i2;
        C5666s9[] c5666s9Arr;
        Gh gh;
        Pf pf;
        Si si;
        Integer num;
        C5449k0 c5449k04;
        C5250c7 c5250c7 = this.d.a;
        c5250c7.getClass();
        ArrayList arrayList3 = new ArrayList();
        c5250c7.a.lock();
        try {
            SQLiteDatabase readableDatabase2 = c5250c7.c.getReadableDatabase();
            if (readableDatabase2 != null) {
                cursor = readableDatabase2.rawQuery(K5.b, null);
                while (cursor.moveToNext()) {
                    try {
                        ContentValues contentValues2 = new ContentValues();
                        DatabaseUtils.cursorRowToContentValues(cursor, contentValues2);
                        arrayList3.add(contentValues2);
                    } catch (Throwable unused) {
                        try {
                            arrayList3 = new ArrayList();
                            contentValues = (ContentValues) CollectionsKt.firstOrNull((List) arrayList3);
                            if (contentValues != null) {
                            }
                        } finally {
                            Do.a(cursor);
                            c5250c7.a.unlock();
                        }
                    }
                }
            } else {
                cursor = null;
            }
        } catch (Throwable unused2) {
            cursor = null;
        }
        contentValues = (ContentValues) CollectionsKt.firstOrNull((List) arrayList3);
        if (contentValues != null) {
            return false;
        }
        this.b.clear();
        for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
            this.b.put(entry.getKey(), entry.getValue().toString());
        }
        String asString = contentValues.getAsString("report_request_parameters");
        if (TextUtils.isEmpty(asString)) {
            C7 c72 = new C7();
            this.c = c72;
            this.h.c = c72;
        } else {
            try {
                C7 c73 = new C7(new Bb(asString));
                this.c = c73;
                this.h.c = c73;
            } catch (Throwable unused3) {
                C7 c74 = new C7();
                this.c = c74;
                this.h.c = c74;
            }
        }
        C5804xh config = this.j.getConfig();
        List list2 = config.w;
        if (Do.a((Collection) list2)) {
            return false;
        }
        this.i.setHosts(config.q);
        if (!config.u() || Do.a((Collection) this.i.getAllHosts())) {
            this.o = true;
            return false;
        }
        C7 c75 = this.c;
        if (c75 == null) {
            c75 = new C7();
        }
        C7 c76 = c75;
        C5492lh c5492lh2 = this.f;
        LinkedHashMap linkedHashMap3 = this.b;
        Fh fh = c5492lh2.b;
        fh.getClass();
        ArrayList arrayList4 = new ArrayList();
        ?? r10 = 100;
        r10 = 100;
        try {
            i = 0;
            for (J7 j7 : fh.a.a(linkedHashMap3)) {
                try {
                    if (arrayList4.size() >= r10) {
                        break;
                    }
                    Long l = j7.a;
                    if (l != null) {
                        I7 i7 = j7.d;
                        C9 a = AbstractC5465kg.a(i7.a, i7.b, i7.c);
                        String locale = config.getLocale();
                        EnumC5600pl enumC5600pl = j7.b;
                        r10 = new C5848z9();
                        r10.a = a;
                        r10.b = locale;
                        if (enumC5600pl != null) {
                            Integer num2 = (Integer) AbstractC5465kg.a.get(enumC5600pl);
                            r10.c = num2 != null ? num2.intValue() : 0;
                        }
                        i = i + CodedOutputByteBufferNano.computeUInt64Size(1, Long.MAX_VALUE) + CodedOutputByteBufferNano.computeMessageSize(2, r10);
                        if (i >= 250880) {
                            break;
                        }
                        EnumC5600pl enumC5600pl2 = (EnumC5600pl) AbstractC5465kg.b.get(r10.c);
                        if (enumC5600pl2 == null) {
                            enumC5600pl2 = EnumC5600pl.FOREGROUND;
                        }
                        arrayList4.add(new Eh(l.longValue(), r10, enumC5600pl2.a));
                        r10 = 100;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r10 = r10;
                    fh.b.reportError("protobuf_serialization_error", th);
                    Pair pair = new Pair(arrayList4, Integer.valueOf(i));
                    List<Eh> list3 = (List) pair.component1();
                    int intValue = ((Number) pair.component2()).intValue();
                    linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list3, 10)), 16));
                    while (r0.hasNext()) {
                    }
                    C5250c7 c5250c72 = fh.a.a;
                    c5250c72.getClass();
                    if (linkedHashMap.isEmpty()) {
                    }
                    if (cursor2 != null) {
                    }
                    JSONObject jSONObject = new JSONObject();
                    arrayList = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    it = list3.iterator();
                    JSONObject jSONObject2 = jSONObject;
                    int i3 = intValue;
                    C5449k0 c5449k05 = c5449k02;
                    r6 = c5449k05;
                    int i4 = 0;
                    c5449k03 = c5449k02;
                    while (true) {
                        if (it.hasNext()) {
                        }
                        list2 = list;
                        r6 = num;
                        c5449k03 = c5449k04;
                    }
                    c5492lh = c5492lh2;
                    c7 = c76;
                    JSONObject jSONObject3 = jSONObject2;
                    if (arrayList.isEmpty()) {
                    }
                    gh.e = pf;
                    if (pf != null) {
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            i = 0;
        }
        Pair pair2 = new Pair(arrayList4, Integer.valueOf(i));
        List<Eh> list32 = (List) pair2.component1();
        int intValue2 = ((Number) pair2.component2()).intValue();
        linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list32, 10)), 16));
        for (Eh eh : list32) {
            Pair pair3 = TuplesKt.to(Long.valueOf(eh.a), Integer.valueOf(eh.c));
            linkedHashMap.put(pair3.getFirst(), pair3.getSecond());
        }
        C5250c7 c5250c722 = fh.a.a;
        c5250c722.getClass();
        if (linkedHashMap.isEmpty()) {
            c5250c722.a.lock();
            try {
                readableDatabase = c5250c722.c.getReadableDatabase();
            } catch (Throwable unused4) {
            }
            if (readableDatabase != null) {
                StringBuilder sb = new StringBuilder();
                String[] strArr = new String[linkedHashMap.size() * 2];
                Iterator it2 = linkedHashMap.entrySet().iterator();
                int i5 = 0;
                while (true) {
                    r10 = it2.hasNext();
                    if (r10 == 0) {
                        break;
                    }
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    if (i5 > 0) {
                        sb.append(" OR ");
                    }
                    sb.append("(");
                    sb.append(SDKAnalyticsEvents.PARAMETER_SESSION_ID);
                    sb.append(" = ? AND ");
                    sb.append("session_type");
                    sb.append(" = ?)");
                    int i6 = i5 * 2;
                    strArr[i6] = Long.toString(((Long) entry2.getKey()).longValue());
                    strArr[i6 + 1] = Integer.toString(((Integer) entry2.getValue()).intValue());
                    i5++;
                }
                cursor2 = readableDatabase.query("events", null, sb.toString(), strArr, null, null, "session_id ASC, number_in_session ASC", String.valueOf(100));
                c5449k0 = r10;
                c5250c722.a.unlock();
                c5449k02 = c5449k0;
            }
            cursor2 = null;
            c5449k0 = r10;
            c5250c722.a.unlock();
            c5449k02 = c5449k0;
        } else {
            cursor2 = null;
            c5449k02 = r10;
        }
        if (cursor2 != null) {
            linkedHashMap2 = MapsKt.emptyMap();
            c5449k02 = null;
        } else {
            linkedHashMap2 = new LinkedHashMap();
            while (cursor2.moveToNext()) {
                try {
                    try {
                        try {
                            ContentValues contentValues3 = new ContentValues();
                            DBUtils.cursorRowToContentValues(cursor2, contentValues3);
                            Long asLong = contentValues3.getAsLong(SDKAnalyticsEvents.PARAMETER_SESSION_ID);
                            Object obj = linkedHashMap2.get(asLong);
                            if (obj == null) {
                                obj = new ArrayList();
                                linkedHashMap2.put(asLong, obj);
                            }
                            ((List) obj).add(contentValues3);
                        } catch (Throwable th4) {
                            th = th4;
                            c5449k02 = null;
                            try {
                                throw th;
                            } catch (Throwable th5) {
                                CloseableKt.closeFinally(cursor2, th);
                                throw th5;
                            }
                        }
                    } catch (Throwable th6) {
                        c5449k02 = null;
                        th = th6;
                    }
                } catch (Throwable unused5) {
                }
            }
            Unit unit = Unit.INSTANCE;
            c5449k02 = null;
            CloseableKt.closeFinally(cursor2, null);
        }
        JSONObject jSONObject4 = new JSONObject();
        arrayList = new ArrayList();
        ArrayList arrayList52 = new ArrayList();
        it = list32.iterator();
        JSONObject jSONObject22 = jSONObject4;
        int i32 = intValue2;
        C5449k0 c5449k052 = c5449k02;
        r6 = c5449k052;
        int i42 = 0;
        c5449k03 = c5449k02;
        while (true) {
            if (it.hasNext()) {
                arrayList2 = arrayList52;
                r19 = c5449k03;
                c5804xh = config;
                list = list2;
                break;
            }
            Iterator it3 = it;
            Eh eh2 = (Eh) it.next();
            if (i42 >= 100) {
                arrayList2 = arrayList52;
                c5804xh = config;
                list = list2;
                r19 = null;
                break;
            }
            C5522ml c5522ml = fh.c;
            Fh fh2 = fh;
            long j = eh2.a;
            C5848z9 c5848z9 = eh2.b;
            ArrayList arrayList6 = arrayList52;
            List list4 = (List) linkedHashMap2.get(Long.valueOf(j));
            if (list4 == null) {
                list4 = CollectionsKt.emptyList();
            }
            List list5 = list4;
            int size = arrayList.size();
            C5311eh c5311eh = new C5311eh(i32, i42, r6);
            c5522ml.getClass();
            Integer num3 = r6;
            int i8 = i32;
            int i9 = i42;
            r19 = null;
            LinkedHashMap linkedHashMap4 = linkedHashMap2;
            arrayList2 = arrayList6;
            C5804xh c5804xh2 = config;
            list = list2;
            c5492lh = c5492lh2;
            c5804xh = config;
            c7 = c76;
            try {
                si = c5522ml.a(j, c5848z9, list5, c5804xh2, size, c5311eh);
            } catch (Throwable th7) {
                c5522ml.b.reportError("protobuf_serialization_error", th7);
                si = null;
            }
            if (si != null) {
                i32 = si.d;
                i42 = si.e;
                num = si.f;
                if (c5449k052 != null && !Intrinsics.areEqual(c5449k052, si.b)) {
                    break;
                }
                c5449k052 = si.b;
                arrayList2.add(Long.valueOf(eh2.a));
                arrayList.add(si.a);
                C5449k0 c5449k06 = si.b;
                String str = c5449k06 != null ? c5449k06.a : null;
                if (str != null && str.length() != 0) {
                    try {
                        jSONObject22 = new JSONObject(str);
                    } catch (Throwable unused6) {
                    }
                }
                if (si.c) {
                    break;
                }
                arrayList52 = arrayList2;
                c76 = c7;
                c5492lh2 = c5492lh;
                fh = fh2;
                it = it3;
                c5449k04 = null;
                linkedHashMap2 = linkedHashMap4;
                config = c5804xh;
            } else {
                arrayList52 = arrayList2;
                c76 = c7;
                c5492lh2 = c5492lh;
                fh = fh2;
                it = it3;
                c5449k04 = null;
                linkedHashMap2 = linkedHashMap4;
                config = c5804xh;
                num = num3;
                i32 = i8;
                i42 = i9;
            }
            list2 = list;
            r6 = num;
            c5449k03 = c5449k04;
        }
        c5492lh = c5492lh2;
        c7 = c76;
        JSONObject jSONObject32 = jSONObject22;
        if (arrayList.isEmpty()) {
            C5466kh c5466kh = c5492lh.c;
            c5466kh.getClass();
            D9 d9 = new D9();
            C5744v9 c5744v9 = new C5744v9();
            c5744v9.a = WrapUtils.getOrDefaultIfEmpty(c7.b, c5804xh.getUuid());
            c5744v9.b = WrapUtils.getOrDefaultIfEmpty(c7.a, c5804xh.getDeviceId());
            d9.b = c5744v9;
            En en = c5466kh.a;
            C5440jh c5440jh = new C5440jh(d9);
            synchronized (en) {
                en.a.a(c5440jh);
            }
            d9.a = (A9[]) arrayList.toArray(new A9[0]);
            int length = jSONObject32.length();
            if (length <= 0) {
                c5666s9Arr = r19;
                i2 = 0;
            } else {
                ArrayList arrayList7 = new ArrayList(length);
                Iterator<String> keys = jSONObject32.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    try {
                        C5666s9 c5666s9 = new C5666s9();
                        c5666s9.a = next;
                        c5666s9.b = jSONObject32.getString(next);
                        arrayList7.add(c5666s9);
                    } catch (Throwable unused7) {
                    }
                }
                i2 = 0;
                c5666s9Arr = (C5666s9[]) arrayList7.toArray(new C5666s9[0]);
            }
            d9.c = c5666s9Arr;
            d9.e = (String[]) list.toArray(new String[i2]);
            String[] strArr2 = (String[]) c5804xh.x.toArray(new String[i2]);
            int length2 = strArr2.length;
            byte[][] bArr = new byte[length2][];
            for (int i10 = 0; i10 < length2; i10++) {
                bArr[i10] = StringUtils.getUTF8Bytes(strArr2[i10]);
            }
            d9.f = bArr;
            Pf pf2 = new Pf(d9, arrayList2, c5492lh.a.a());
            gh = this;
            pf = pf2;
        } else {
            gh = this;
            pf = r19;
        }
        gh.e = pf;
        if (pf != null) {
            return false;
        }
        int i11 = pf.c;
        gh.n = i11;
        gh.h.e = i11;
        gh.m.prepareAndSetPostData(MessageNano.toByteArray(pf.a));
        return true;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPerformRequest() {
        this.m.onPerformRequest();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPostRequestComplete(boolean z) {
        String a;
        if (z) {
            a(false);
        } else if (this.l.getResponseCode() == 400) {
            a(true);
        }
        if (z) {
            for (A9 a9 : this.e.a.a) {
                for (C5822y9 c5822y9 : a9.c) {
                    if (c5822y9 != null && (a = AbstractC5491lg.a(c5822y9)) != null) {
                        this.g.info(a, new Object[0]);
                    }
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onRequestComplete() {
        return this.m.isResponseValid();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onRequestError(@Nullable Throwable th) {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onShouldNotExecute() {
        this.o = true;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onSuccessfulTaskFinished() {
        this.o = true;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskAdded() {
        ((A5) this.a.p).d.set(false);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskFinished() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskRemoved() {
        ((A5) this.a.p).d.set(true);
        if (this.o) {
            ((A5) this.a.p).f();
        }
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onUnsuccessfulTaskFinished() {
    }
}
