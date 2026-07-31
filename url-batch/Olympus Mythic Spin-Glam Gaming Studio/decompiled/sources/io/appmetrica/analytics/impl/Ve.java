package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Locale;
import java.util.UUID;
import kotlin.text.StringsKt;

/* loaded from: classes13.dex */
public final class Ve {
    public final Context a;
    public final Go b;
    public final Ho c;

    public Ve(Context context) {
        this(context, new Go(), new Ho());
    }

    public final String a(String str) {
        try {
            this.c.getClass();
            if (!Ho.a(str)) {
                this.b.getClass();
                str = StringsKt.replace$default(UUID.randomUUID().toString(), "-", "", false, 4, (Object) null).toLowerCase(Locale.US);
            }
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.a, "uuid.dat");
            if (fileFromSdkStorage != null && str != null) {
                AbstractC5409ib.a(str, new FileOutputStream(fileFromSdkStorage));
            }
            return str;
        } catch (Throwable unused) {
            return null;
        }
    }

    public Ve(Context context, Go go, Ho ho) {
        this.a = context;
        this.b = go;
        this.c = ho;
    }

    public final void a() {
        File fileFromAppStorage;
        File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.a, "uuid.dat");
        if (fileFromSdkStorage == null || fileFromSdkStorage.exists() || (fileFromAppStorage = FileUtils.getFileFromAppStorage(this.a, "uuid.dat")) == null || !fileFromAppStorage.exists()) {
            return;
        }
        FileUtils.copyToNullable(fileFromAppStorage, fileFromSdkStorage);
    }
}
