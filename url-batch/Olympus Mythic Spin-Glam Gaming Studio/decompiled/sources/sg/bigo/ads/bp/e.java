package sg.bigo.ads.bp;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import sg.bigo.ads.an.l;

/* loaded from: classes14.dex */
public class e implements Runnable {
    private static final Map<String, sg.bigo.ads.bh.e> a = new HashMap();

    @Nullable
    private static l b;

    @NonNull
    private final Executor c;
    private final sg.bigo.ads.bs.c d;
    private final sg.bigo.ads.bo.b e;

    public e(@Nullable Executor executor, sg.bigo.ads.bs.c cVar, sg.bigo.ads.bo.b bVar) {
        this.c = executor == null ? a() : executor;
        this.d = cVar;
        this.e = bVar;
    }

    public static sg.bigo.ads.bh.e a() {
        l lVar = b;
        return a("DefaultNet", 5, lVar != null ? lVar.p() : false);
    }

    private static synchronized sg.bigo.ads.bh.e a(String str, int i, boolean z) {
        sg.bigo.ads.bh.e eVar;
        synchronized (e.class) {
            try {
                if (TextUtils.isEmpty(str)) {
                    str = "DefaultNet";
                }
                Map<String, sg.bigo.ads.bh.e> map = a;
                eVar = map.get(str);
                if (eVar == null) {
                    eVar = new sg.bigo.ads.bh.e(str, i, z);
                    map.put(str, eVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    public static void a(@Nullable l lVar) {
        b = lVar;
    }

    public static sg.bigo.ads.bh.e b() {
        int i;
        boolean z;
        l lVar = b;
        if (lVar != null) {
            i = lVar.a();
            z = lVar.b();
        } else {
            i = 3;
            z = false;
        }
        return a("ConfigNet", i, z);
    }

    public static sg.bigo.ads.bh.e c() {
        int i;
        boolean z;
        l lVar = b;
        if (lVar != null) {
            i = lVar.c();
            z = lVar.d();
        } else {
            i = 2;
            z = false;
        }
        return a("ReportNet", i, z);
    }

    public static sg.bigo.ads.bh.e d() {
        int i;
        boolean z;
        l lVar = b;
        if (lVar != null) {
            i = lVar.e();
            z = lVar.f();
        } else {
            i = 12;
            z = false;
        }
        return a("AdNet", i, z);
    }

    public static sg.bigo.ads.bh.e e() {
        int i;
        boolean z;
        l lVar = b;
        if (lVar != null) {
            i = lVar.g();
            z = lVar.h();
        } else {
            i = 3;
            z = false;
        }
        return a("CallbackNet", i, z);
    }

    public static sg.bigo.ads.bh.e f() {
        int i;
        boolean z;
        l lVar = b;
        if (lVar != null) {
            i = lVar.i();
            z = lVar.j();
        } else {
            i = 3;
            z = false;
        }
        return a("VastNet", i, z);
    }

    public static sg.bigo.ads.bh.e g() {
        int i;
        boolean z;
        l lVar = b;
        if (lVar != null) {
            i = lVar.k();
            z = lVar.l();
        } else {
            i = 10;
            z = false;
        }
        return a("TrackerNet", i, z);
    }

    public static sg.bigo.ads.bh.e h() {
        int i;
        boolean z;
        l lVar = b;
        if (lVar != null) {
            i = lVar.m();
            z = lVar.n();
        } else {
            i = 5;
            z = false;
        }
        return a("CreativeNet", i, z);
    }

    public static sg.bigo.ads.bh.e i() {
        int i;
        boolean z;
        l lVar = b;
        if (lVar != null) {
            z = lVar.o();
            i = 40;
        } else {
            i = 5;
            z = false;
        }
        return a("IconCreativeNet", i, z);
    }

    public static sg.bigo.ads.bh.e j() {
        return a("BannerIconCreativeNet", b != null ? 40 : 5, true);
    }

    public static void k() {
    }

    protected void a(sg.bigo.ads.bs.c cVar, sg.bigo.ads.bo.b bVar) {
    }

    public final void l() {
        this.c.execute(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        sg.bigo.ads.bo.b bVar = this.e;
        if (bVar != null) {
            bVar.a((sg.bigo.ads.bo.b) this.d);
        }
        a(this.d, this.e);
    }
}
