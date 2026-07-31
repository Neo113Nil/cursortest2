package sg.bigo.ads.df;

import android.database.Cursor;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import sg.bigo.ads.api.core.r;

/* loaded from: classes14.dex */
public final class g {

    static class a {
        public static g a = new g(0);
    }

    private g() {
    }

    /* synthetic */ g(byte b) {
        this();
    }

    public static List<f> a(long j, @NonNull r rVar) {
        sg.bigo.ads.aw.d.b(System.currentTimeMillis() - 86400000);
        Cursor a2 = sg.bigo.ads.aw.d.a(j);
        ArrayList arrayList = new ArrayList();
        if (a2 == null) {
            return arrayList;
        }
        while (a2.moveToNext()) {
            f fVar = new f(rVar, a2);
            arrayList.add(fVar);
            fVar.toString();
        }
        a2.close();
        return arrayList;
    }

    public static void a(f fVar) {
        if (sg.bigo.ads.aw.d.c(fVar)) {
            sg.bigo.ads.aw.d.b(fVar);
        } else {
            fVar.a = sg.bigo.ads.aw.d.a(fVar);
        }
    }

    public static void b(f fVar) {
        if (fVar.g()) {
            c(fVar);
        } else {
            sg.bigo.ads.aw.d.b(fVar);
        }
    }

    private static void c(f fVar) {
        sg.bigo.ads.aw.d.a(String.valueOf(fVar.a));
    }
}
