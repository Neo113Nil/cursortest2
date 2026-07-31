package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* renamed from: io.appmetrica.analytics.impl.q7, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5613q7 {
    public final InterfaceC5198a7 a;
    public final List b;
    public final boolean c;

    public C5613q7(InterfaceC5198a7 interfaceC5198a7, ArrayList arrayList, boolean z) {
        this.a = interfaceC5198a7;
        this.b = arrayList;
        this.c = z;
    }

    public final String a(Context context, InterfaceC5560o7 interfaceC5560o7) {
        File parentFile;
        try {
            File a = this.a.a(context, interfaceC5560o7.b());
            if (!a.exists() && (parentFile = a.getParentFile()) != null && (parentFile.exists() || parentFile.mkdirs())) {
                a(context, interfaceC5560o7.a(), a);
            }
            return a.getPath();
        } catch (Throwable unused) {
            return interfaceC5560o7.b();
        }
    }

    public final void a(Context context, String str, File file) {
        List list = this.b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File a = ((InterfaceC5198a7) it.next()).a(context, str);
            if (a.exists()) {
                try {
                    if (this.c) {
                        FileUtils.copyToNullable(a, file);
                    } else {
                        FileUtils.move(a, file);
                    }
                    String path = a.getPath();
                    String path2 = file.getPath();
                    for (String str2 : CollectionsKt.listOf((Object[]) new String[]{"-journal", "-shm", "-wal"})) {
                        File file2 = new File(path + str2);
                        File file3 = new File(path2 + str2);
                        if (this.c) {
                            FileUtils.copyToNullable(file2, file3);
                        } else {
                            FileUtils.move(file2, file3);
                        }
                    }
                    return;
                } catch (Throwable unused) {
                    continue;
                }
            }
        }
    }
}
