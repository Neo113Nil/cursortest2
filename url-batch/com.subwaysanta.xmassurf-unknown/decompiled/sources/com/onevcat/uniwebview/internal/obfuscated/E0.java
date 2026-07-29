package com.onevcat.uniwebview.internal.obfuscated;

import android.graphics.Bitmap;
import android.graphics.Rect;
import androidx.core.app.NotificationManagerCompat;
import java.io.File;
import java.io.FileOutputStream;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class E0 extends Lambda implements Function1 {
    public final /* synthetic */ String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E0(String str) {
        super(1);
        this.a = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        C0031h0 it = (C0031h0) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        String str2 = this.a;
        if (it.e.getHeight() <= 0 || it.e.getWidth() <= 0) {
            it.c.a(it.b, P2.CaptureSnapshotFinished, new D2("", String.valueOf(-1002), "", null));
        } else {
            Bitmap a = it.a((Rect) null);
            File cacheDir = it.a.getCacheDir();
            if (str2 == null || str2.length() == 0) {
                str2 = UUID.randomUUID() + ".png";
            }
            try {
                File file = new File(cacheDir, str2);
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                a.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                C0058o c0058o = C0058o.b;
                String message = "Capture Snapshot done. File written in: " + file;
                c0058o.getClass();
                Intrinsics.checkNotNullParameter(message, "message");
                c0058o.a(EnumC0054n.INFO, message);
                str = file.getAbsolutePath();
            } catch (Exception e) {
                C0058o c0058o2 = C0058o.b;
                String message2 = "Error during save snapshot image: " + e;
                c0058o2.getClass();
                Intrinsics.checkNotNullParameter(message2, "message");
                c0058o2.a(EnumC0054n.CRITICAL, message2);
                str = null;
            }
            if (str != null) {
                it.c.a(it.b, P2.CaptureSnapshotFinished, new D2("", String.valueOf(0), str, null));
            } else {
                it.c.a(it.b, P2.CaptureSnapshotFinished, new D2("", String.valueOf(NotificationManagerCompat.IMPORTANCE_UNSPECIFIED), "", null));
            }
        }
        return Unit.INSTANCE;
    }
}
