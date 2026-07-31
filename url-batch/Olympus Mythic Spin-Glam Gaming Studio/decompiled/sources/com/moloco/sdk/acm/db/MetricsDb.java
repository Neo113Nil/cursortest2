package com.moloco.sdk.acm.db;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@TypeConverters
@Database
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/moloco/sdk/acm/db/MetricsDb;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "Lcom/moloco/sdk/acm/db/d;", "b", "()Lcom/moloco/sdk/acm/db/d;", "a", "moloco-android-client-metrics_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes8.dex */
public abstract class MetricsDb extends RoomDatabase {

    /* renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    public static volatile MetricsDb b = null;

    @NotNull
    public static final String c = "MetricsDb";

    /* renamed from: com.moloco.sdk.acm.db.MetricsDb$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MetricsDb a(Context context) {
            try {
                Context applicationContext = context.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                return (MetricsDb) Room.databaseBuilder(applicationContext, MetricsDb.class, "metrics-db").build();
            } catch (Exception e) {
                throw new IllegalStateException("Database creation failed", e);
            }
        }

        @NotNull
        public final MetricsDb b(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            MetricsDb metricsDb = MetricsDb.b;
            if (metricsDb == null) {
                synchronized (this) {
                    metricsDb = MetricsDb.b;
                    if (metricsDb == null) {
                        MetricsDb a = MetricsDb.INSTANCE.a(context);
                        MetricsDb.b = a;
                        metricsDb = a;
                    }
                }
            }
            return metricsDb;
        }

        public Companion() {
        }
    }

    @NotNull
    public abstract d b();
}
