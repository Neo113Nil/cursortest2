package com.inmobi.media;

import android.content.Context;
import com.mobilefuse.sdk.telemetry.TelemetryCategory;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.ExecutorsKt;

/* renamed from: com.inmobi.media.s9, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC4334s9 {
    public static final Lazy a = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.s9$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Object mo4828invoke() {
            return AbstractC4334s9.a();
        }
    });
    public static final Lazy b = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.s9$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Object mo4828invoke() {
            return AbstractC4334s9.c();
        }
    });

    public static final C4046h9 a() {
        Context context = AbstractC4002fj.a;
        Intrinsics.checkNotNullParameter("com.im_11.3.0.db", "name");
        ArrayList arrayList = new ArrayList();
        Intrinsics.checkNotNullParameter("ad_quality_db", "tableName");
        Intrinsics.checkNotNullParameter("(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, image_location TEXT NOT NULL, sdk_model_result TEXT, beacon_url TEXT NOT NULL, extras TEXT)", "tableSchema");
        arrayList.add(new C4188mk("ad_quality_db", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, image_location TEXT NOT NULL, sdk_model_result TEXT, beacon_url TEXT NOT NULL, extras TEXT)"));
        Intrinsics.checkNotNullParameter("click", "tableName");
        Intrinsics.checkNotNullParameter("(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, pending_attempts INTEGER NOT NULL, url TEXT NOT NULL, ping_in_webview TEXT NOT NULL, follow_redirect TEXT NOT NULL, ts TEXT NOT NULL, track_extras TEXT, created_ts TEXT NOT NULL )", "tableSchema");
        arrayList.add(new C4188mk("click", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, pending_attempts INTEGER NOT NULL, url TEXT NOT NULL, ping_in_webview TEXT NOT NULL, follow_redirect TEXT NOT NULL, ts TEXT NOT NULL, track_extras TEXT, created_ts TEXT NOT NULL )"));
        Intrinsics.checkNotNullParameter("config_db", "tableName");
        Intrinsics.checkNotNullParameter("(config_value TEXT NOT NULL,config_type TEXT NOT NULL,update_ts INTEGER DEFAULT 0,UNIQUE(config_type))", "tableSchema");
        arrayList.add(new C4188mk("config_db", "(config_value TEXT NOT NULL,config_type TEXT NOT NULL,update_ts INTEGER DEFAULT 0,UNIQUE(config_type))"));
        Intrinsics.checkNotNullParameter("c_data", "tableName");
        Intrinsics.checkNotNullParameter("(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, e_data TEXT NOT NULL, timestamp INTEGER NOT NULL )", "tableSchema");
        arrayList.add(new C4188mk("c_data", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, e_data TEXT NOT NULL, timestamp INTEGER NOT NULL )"));
        Intrinsics.checkNotNullParameter("crash", "tableName");
        Intrinsics.checkNotNullParameter("(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, componentType TEXT NOT NULL, eventId TEXT NOT NULL, eventType TEXT NOT NULL, payload TEXT NOT NULL, ts TEXT NOT NULL)", "tableSchema");
        arrayList.add(new C4188mk("crash", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, componentType TEXT NOT NULL, eventId TEXT NOT NULL, eventType TEXT NOT NULL, payload TEXT NOT NULL, ts TEXT NOT NULL)"));
        Intrinsics.checkNotNullParameter("logs_v2", "tableName");
        Intrinsics.checkNotNullParameter("(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, filename TEXT NOT NULL, saveTimestamp INTEGER NOT NULL, retryCount INTEGER NOT NULL, hasLoggerFinished INTEGER NOT NULL, checkpoints INTEGER NOT NULL,lastRetryTimestamp INTEGER NOT NULL )", "tableSchema");
        arrayList.add(new C4188mk("logs_v2", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, filename TEXT NOT NULL, saveTimestamp INTEGER NOT NULL, retryCount INTEGER NOT NULL, hasLoggerFinished INTEGER NOT NULL, checkpoints INTEGER NOT NULL,lastRetryTimestamp INTEGER NOT NULL )"));
        Intrinsics.checkNotNullParameter("pings", "tableName");
        Intrinsics.checkNotNullParameter("(id TEXT PRIMARY KEY,url TEXT NOT NULL,headers TEXT,allow_redirects TEXT NOT NULL,priority TEXT NOT NULL,ack_required TEXT NOT NULL,time_created INTEGER NOT NULL,owner TEXT NOT NULL,retry_count INTEGER DEFAULT 0,retryAfter INTEGER DEFAULT 0,telemetry_metadata TEXT)", "tableSchema");
        arrayList.add(new C4188mk("pings", "(id TEXT PRIMARY KEY,url TEXT NOT NULL,headers TEXT,allow_redirects TEXT NOT NULL,priority TEXT NOT NULL,ack_required TEXT NOT NULL,time_created INTEGER NOT NULL,owner TEXT NOT NULL,retry_count INTEGER DEFAULT 0,retryAfter INTEGER DEFAULT 0,telemetry_metadata TEXT)"));
        Intrinsics.checkNotNullParameter(TelemetryCategory.TELEMETRY, "tableName");
        Intrinsics.checkNotNullParameter("(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, eventType TEXT NOT NULL, payload TEXT NOT NULL, eventSource TEXT NOT NULL, ts TEXT NOT NULL)", "tableSchema");
        arrayList.add(new C4188mk(TelemetryCategory.TELEMETRY, "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, eventType TEXT NOT NULL, payload TEXT NOT NULL, eventSource TEXT NOT NULL, ts TEXT NOT NULL)"));
        Object value = b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ExecutorService transactionExecutor = (ExecutorService) value;
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
        C4330s5 c4330s5 = new C4330s5(context, arrayList, Ma.a(), transactionExecutor);
        C4046h9 c4046h9 = new C4046h9(c4330s5);
        I9 i9 = new I9(c4330s5);
        C4308r9 c4308r9 = new C4308r9(i9, c4330s5);
        c4046h9.a = c4308r9;
        try {
            c4308r9.c = i9.getWritableDatabase();
        } catch (Exception unused) {
        }
        try {
            c4308r9.d = c4308r9.a.getReadableDatabase();
        } catch (Exception unused2) {
        }
        ExecutorService executorService = c4308r9.b.d;
        if (executorService != null) {
            c4308r9.e = ExecutorsKt.from((Executor) executorService);
        }
        return c4046h9;
    }

    public static final C4308r9 b() {
        C4308r9 c4308r9 = ((C4046h9) a.getValue()).a;
        if (c4308r9 != null) {
            return c4308r9;
        }
        Intrinsics.throwUninitializedPropertyAccessException("_inmobiDatabaseHelper");
        return null;
    }

    public static final ExecutorService c() {
        Intrinsics.checkNotNullParameter("db.transactionExecutor", "name");
        return Executors.newSingleThreadExecutor(new M9("db.transactionExecutor", false));
    }
}
