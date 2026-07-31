package io.appmetrica.analytics.screenshot.impl;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class W extends ContentObserver {
    public static final String d = MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString();
    public final ClientContext a;
    public final Function0 b;
    public volatile C5874k c;

    public W(ClientContext clientContext, C5881s c5881s) {
        super(clientContext.getClientExecutorProvider().getDefaultExecutor().getHandler());
        this.a = clientContext;
        this.b = c5881s;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        C5874k c5874k;
        super.onChange(z, uri);
        if (!StringsKt.startsWith$default(String.valueOf(uri), d, false, 2, (Object) null) || (c5874k = this.c) == null) {
            return;
        }
        try {
            String[] strArr = (String[]) ArraysKt.plus((Object[]) new String[]{"date_added"}, (Collection) c5874k.b);
            Cursor query = this.a.getContext().getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, strArr, "date_added >= ?", new String[]{String.valueOf(new SystemTimeProvider().currentTimeSeconds() - c5874k.c)}, "date_added DESC");
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        for (String str : strArr) {
                        }
                        Iterator it = c5874k.b.iterator();
                        while (it.hasNext()) {
                            if (StringsKt.contains$default((CharSequence) query.getString(query.getColumnIndexOrThrow((String) it.next())).toLowerCase(Locale.ROOT), (CharSequence) "screenshot", false, 2, (Object) null)) {
                                this.b.mo4828invoke();
                            }
                        }
                    }
                } finally {
                }
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(query, null);
        } catch (Exception unused) {
        }
    }
}
