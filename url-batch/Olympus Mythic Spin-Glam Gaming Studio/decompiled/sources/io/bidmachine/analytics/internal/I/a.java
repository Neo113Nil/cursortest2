package io.bidmachine.analytics.internal.I;

import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public abstract class a {

    /* renamed from: io.bidmachine.analytics.internal.I.a$a, reason: collision with other inner class name */
    static final class C1727a extends Lambda implements Function1 {
        public static final C1727a a = new C1727a();

        C1727a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Object obj) {
            return "?";
        }
    }

    public static final String a(List list, String str) {
        if (list == null) {
            return null;
        }
        return str + " (" + CollectionsKt.joinToString$default(list, StringUtils.COMMA, null, null, 0, null, C1727a.a, 30, null) + ')';
    }

    public static /* synthetic */ void a(List list, SQLiteDatabase sQLiteDatabase, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 100;
        }
        a(list, sQLiteDatabase, i, function1);
    }

    public static final void a(List list, SQLiteDatabase sQLiteDatabase, int i, Function1 function1) {
        if (list == null) {
            function1.invoke(null);
            return;
        }
        sQLiteDatabase.beginTransaction();
        try {
            Iterator it = CollectionsKt.chunked(list, i).iterator();
            while (it.hasNext()) {
                function1.invoke((List) it.next());
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }

    public static final String[] a(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
