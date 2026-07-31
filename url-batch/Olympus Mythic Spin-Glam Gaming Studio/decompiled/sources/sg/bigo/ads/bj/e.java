package sg.bigo.ads.bj;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.concurrent.Executor;
import sg.bigo.ads.bj.d;
import sg.bigo.ads.bj.h;

/* loaded from: classes11.dex */
public final class e {
    public static void a(Context context, @NonNull String str, boolean z, g gVar) {
        a(context, null, str, z, gVar);
    }

    public static void a(final Context context, @NonNull final List<String> list, final boolean z, final g gVar) {
        if (list.size() == 0) {
            gVar.a(0, "urlList all download Failed", null);
        } else {
            a(context, list.remove(0), z, new g() { // from class: sg.bigo.ads.bj.e.1
                @Override // sg.bigo.ads.bj.g
                public final void a(int i, @NonNull String str, @Nullable f fVar) {
                    e.a(context, (List<String>) list, z, g.this);
                }

                @Override // sg.bigo.ads.bj.g
                public final void a(@NonNull Bitmap bitmap, @NonNull f fVar) {
                    g gVar2 = g.this;
                    if (gVar2 != null) {
                        gVar2.a(bitmap, fVar);
                    }
                }
            });
        }
    }

    public static void a(Context context, @Nullable Executor executor, @NonNull String str, boolean z, g gVar) {
        c(context, executor, str, z, gVar);
    }

    public static boolean a(Context context, String str) {
        h hVar;
        hVar = h.a.a;
        return hVar.d(context, str);
    }

    public static void b(Context context, @Nullable Executor executor, @NonNull String str, boolean z, g gVar) {
        d dVar;
        dVar = d.a.a;
        dVar.a(context, executor, str, z, gVar);
    }

    private static void c(Context context, @Nullable Executor executor, @NonNull String str, boolean z, g gVar) {
        h hVar;
        hVar = h.a.a;
        hVar.a(context, executor, str, z, gVar);
    }
}
