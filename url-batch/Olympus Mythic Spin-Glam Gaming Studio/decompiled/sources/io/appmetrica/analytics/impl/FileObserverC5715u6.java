package io.appmetrica.analytics.impl;

import android.os.FileObserver;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;

/* renamed from: io.appmetrica.analytics.impl.u6, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class FileObserverC5715u6 extends FileObserver {
    public final Consumer a;
    public final File b;
    public final C5771wa c;

    public FileObserverC5715u6(File file, C5767w6 c5767w6, C5771wa c5771wa) {
        super(file.getAbsolutePath(), 8);
        this.a = c5767w6;
        this.b = file;
        this.c = c5771wa;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i, String str) {
        if (i != 8 || TextUtils.isEmpty(str)) {
            return;
        }
        Consumer consumer = this.a;
        C5771wa c5771wa = this.c;
        File file = this.b;
        c5771wa.getClass();
        consumer.consume(new File(file, str));
    }
}
