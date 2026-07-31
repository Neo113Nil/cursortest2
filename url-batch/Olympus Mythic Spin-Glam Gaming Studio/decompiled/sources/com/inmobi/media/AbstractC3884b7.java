package com.inmobi.media;

import android.content.Context;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.b7, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC3884b7 {
    public static final void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ConcurrentHashMap concurrentHashMap = Qa.b;
        Iterator it = CollectionsKt.listOf((Object[]) new String[]{Pa.a("carb_store"), Pa.a("aes_key_store"), Pa.a("mraid_js_store"), Pa.a("omid_js_store"), Pa.a("user_info_store"), Pa.a("coppa_store"), Pa.a("gesture_info_store"), Pa.a("display_info_store"), Pa.a("unified_id_info_store"), Pa.a("app_bundle_store"), Pa.a("pub_signals_store"), Pa.a("CrashSession-store")}).iterator();
        while (it.hasNext()) {
            context.deleteSharedPreferences((String) it.next());
        }
    }

    public static final void a(File path) {
        Intrinsics.checkNotNullParameter(path, "path");
        try {
            if (path.exists()) {
                File[] listFiles = path.listFiles();
                if (listFiles != null) {
                    Iterator it = ArrayIteratorKt.iterator(listFiles);
                    while (it.hasNext()) {
                        File file = (File) it.next();
                        if (file.isDirectory()) {
                            Intrinsics.checkNotNull(file);
                            a(file);
                        } else if (file.delete()) {
                            Intrinsics.checkNotNullExpressionValue("b7", "TAG");
                            file.getName();
                        }
                    }
                }
                if (path.delete()) {
                    Intrinsics.checkNotNullExpressionValue("b7", "TAG");
                    path.getName();
                }
            }
        } catch (Exception e) {
            Intrinsics.checkNotNullExpressionValue("b7", "TAG");
            e.getMessage();
        }
    }
}
