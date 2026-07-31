package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import kotlin.io.CloseableKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes12.dex */
public final class Ya implements Bg {
    public final Context a;
    public final String b = "huawei";

    public Ya(@NotNull Context context) {
        this.a = context;
    }

    @Override // io.appmetrica.analytics.impl.Bg
    @NotNull
    public final String a() {
        return this.b;
    }

    public static final void a(InterfaceC5803xg interfaceC5803xg, Ya ya) {
        Eg cg;
        Cursor query;
        Context context = ya.a;
        try {
            query = context.getContentResolver().query(Uri.parse("content://com.huawei.appmarket.commondata/item/5"), null, null, new String[]{context.getPackageName()}, null);
        } catch (Throwable th) {
            cg = new Cg("Failed to get referrer from huawei content provider", th);
        }
        if (query == null) {
            throw new IllegalStateException("Not found content provider");
        }
        try {
            if (!query.moveToFirst()) {
                throw new IllegalStateException("Cursor is empty");
            }
            String string = query.getString(0);
            if (string == null || StringsKt.isBlank(string)) {
                throw new IllegalStateException("Referrer is empty");
            }
            cg = new Dg(new C5751vg(string, query.getLong(1), query.getLong(2), 3));
            CloseableKt.closeFinally(query, null);
            interfaceC5803xg.a(cg);
        } finally {
        }
    }

    @Override // io.appmetrica.analytics.impl.Bg
    public final void a(@NotNull final InterfaceC5803xg interfaceC5803xg) {
        Bk bk = Ka.I.d;
        Runnable runnable = new Runnable() { // from class: io.appmetrica.analytics.impl.Ya$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Ya.a(InterfaceC5803xg.this, this);
            }
        };
        bk.a.getClass();
        new InterruptionSafeThread(runnable, "IAA-SHMSR-" + Td.a.incrementAndGet()).start();
    }
}
