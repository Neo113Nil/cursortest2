package io.appmetrica.analytics.internal;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.AbstractC5754vj;
import io.appmetrica.analytics.impl.Af;
import io.appmetrica.analytics.impl.Ba;
import io.appmetrica.analytics.impl.Bf;
import io.appmetrica.analytics.impl.G3;
import io.appmetrica.analytics.impl.H3;
import io.appmetrica.analytics.impl.Q5;
import io.appmetrica.analytics.impl.R5;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes5.dex */
public class PreloadInfoContentProvider extends ContentProvider {
    private boolean a = false;
    private final UriMatcher b = new UriMatcher(-1);

    private void a(R5 r5, ContentValues contentValues) {
        Context context = getContext();
        Context applicationContext = context == null ? null : context.getApplicationContext();
        if (applicationContext != null) {
            try {
                Object invoke = r5.a.invoke(contentValues);
                if (invoke != null) {
                    r5.c.b(applicationContext);
                    if (((Boolean) r5.b.invoke(invoke)).booleanValue()) {
                        AbstractC5754vj.a("Successfully saved " + r5.d, new Object[0]);
                    } else {
                        AbstractC5754vj.a("Did not save " + r5.d + " because data is already present", new Object[0]);
                    }
                }
            } catch (Throwable th) {
                ImportantLogger.INSTANCE.info("AppMetrica-Attribution", String.format("Unexpected error occurred", new Object[0]) + "\n" + StringUtils.throwableToString(th), new Object[0]);
            }
        }
    }

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        AbstractC5754vj.a("Deleting is not supported", new Object[0]);
        return -1;
    }

    public synchronized void disable() {
        this.a = true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        synchronized (this) {
            try {
                if (this.a) {
                    return null;
                }
                if (contentValues != null) {
                    int match = this.b.match(uri);
                    if (match == 1) {
                        a(new R5(new Af(), new Bf(), Ba.d, "preload info"), contentValues);
                    } else if (match != 2) {
                        AbstractC5754vj.a("Bad content provider uri.", new Object[0]);
                    } else {
                        a(new R5(new G3(), new H3(), Ba.d, "clids"), contentValues);
                    }
                }
                CountDownLatch countDownLatch = Q5.a;
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        Context applicationContext = context == null ? null : context.getApplicationContext();
        String str = (applicationContext != null ? applicationContext.getPackageName() : "") + ".appmetrica.preloadinfo.retail";
        this.b.addURI(str, "preloadinfo", 1);
        this.b.addURI(str, "clids", 2);
        Q5.a = new CountDownLatch(1);
        Q5.b = this;
        return true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        AbstractC5754vj.a("Query is not supported", new Object[0]);
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        AbstractC5754vj.a("Updating is not supported", new Object[0]);
        return -1;
    }
}
