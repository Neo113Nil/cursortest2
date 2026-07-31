package sg.bigo.ads.ba;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes12.dex */
public final class b {
    public static sg.bigo.ads.ay.a a(String str) {
        a c = i.c(str);
        if (c != null) {
            return c.b;
        }
        return null;
    }

    public static void a() {
        Iterator<a> it = i.b().iterator();
        while (it.hasNext()) {
            i.a(it.next());
        }
        i.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void a(Context context, T t) {
        if (t == 0) {
            return;
        }
        if (t.getClass() == sg.bigo.ads.ay.a.class) {
            a(context, (sg.bigo.ads.ay.a) t);
            return;
        }
        if (!(t instanceof List)) {
            sg.bigo.ads.bn.a.a(0, "DownloadHandler", "argument is only Downloader or List ");
            return;
        }
        List list = (List) t;
        if (list.size() <= 0 || list.get(0).getClass() != sg.bigo.ads.ay.a.class) {
            sg.bigo.ads.bn.a.a(0, "DownloadHandler", "argument of collect is only Downloader");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a(context, (sg.bigo.ads.ay.a) it.next());
        }
    }

    private static void a(Context context, sg.bigo.ads.ay.a aVar) {
        a c = i.c(aVar.a);
        if (c != null) {
            if (c.b.equals(aVar)) {
                c.b(aVar.g);
                c.a(aVar.i);
                c.e = h.a;
                f.a().a(aVar.a);
                return;
            }
            a(aVar.a);
        }
        a aVar2 = new a(aVar);
        aVar2.c = new d(context, aVar2);
        aVar2.e = h.a;
        i.b(aVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void a(T t) {
        if (t == 0) {
            return;
        }
        if (t.getClass() == String.class) {
            i.b((String) t);
        } else {
            sg.bigo.ads.bn.a.a(0, "DownloadHandler", "argument is only String or List ");
        }
    }

    public static void a(String str, e eVar) {
        CopyOnWriteArrayList<e> copyOnWriteArrayList;
        f a = f.a();
        if (a.a.containsKey(str)) {
            copyOnWriteArrayList = a.a.get(str);
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            }
        } else {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        }
        if (copyOnWriteArrayList.contains(eVar)) {
            return;
        }
        copyOnWriteArrayList.add(eVar);
        a.a.put(str, copyOnWriteArrayList);
    }

    public static void a(boolean z) {
        g.a(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void b(T t) {
        if (t == 0) {
            return;
        }
        if (t.getClass() == String.class) {
            i.a((String) t);
        } else {
            sg.bigo.ads.bn.a.a(0, "DownloadHandler", "argument is only String or List ");
        }
    }
}
