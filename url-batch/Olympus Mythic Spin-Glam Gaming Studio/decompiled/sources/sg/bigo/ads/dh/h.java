package sg.bigo.ads.dh;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Node;
import sg.bigo.ads.common.utils.r;

/* loaded from: classes3.dex */
public final class h {

    @NonNull
    final Node a;

    public h(@NonNull Node node) {
        this.a = node;
    }

    private static void a(@NonNull List<l> list, @NonNull List<String> list2, float f) {
        Iterator<String> it = list2.iterator();
        while (it.hasNext()) {
            list.add(new l(it.next(), f));
        }
    }

    @NonNull
    private List<String> b(@NonNull String str) {
        List<Node> b;
        ArrayList arrayList = new ArrayList();
        Node a = sg.bigo.ads.dg.a.a(this.a, "TrackingEvents");
        if (a == null || (b = sg.bigo.ads.dg.a.b(a, "Tracking", "event", Collections.singletonList(str))) == null) {
            return arrayList;
        }
        Iterator<Node> it = b.iterator();
        while (it.hasNext()) {
            String a2 = sg.bigo.ads.dg.a.a(it.next());
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    @Nullable
    final String a() {
        Node a = sg.bigo.ads.dg.a.a(this.a, "VideoClicks", null, null);
        if (a == null) {
            return null;
        }
        return sg.bigo.ads.dg.a.a(sg.bigo.ads.dg.a.a(a, "ClickThrough", null, null));
    }

    @NonNull
    final List<n> a(@NonNull String str) {
        List<String> b = b(str);
        ArrayList arrayList = new ArrayList(b.size());
        Iterator<String> it = b.iterator();
        while (it.hasNext()) {
            arrayList.add(new n(it.next()));
        }
        return arrayList;
    }

    @NonNull
    final List<n> b() {
        List<Node> c;
        ArrayList arrayList = new ArrayList();
        Node a = sg.bigo.ads.dg.a.a(this.a, "VideoClicks");
        if (a == null || (c = sg.bigo.ads.dg.a.c(a, "ClickTracking")) == null) {
            return arrayList;
        }
        Iterator<Node> it = c.iterator();
        while (it.hasNext()) {
            String a2 = sg.bigo.ads.dg.a.a(it.next());
            if (a2 != null) {
                arrayList.add(new n(a2));
            }
        }
        return arrayList;
    }

    @NonNull
    final List<j> c() {
        List<String> b = b("mute");
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = b.iterator();
        while (it.hasNext()) {
            arrayList.add(new j(it.next(), true));
        }
        Iterator<String> it2 = b("unmute").iterator();
        while (it2.hasNext()) {
            arrayList.add(new j(it2.next(), false));
        }
        return arrayList;
    }

    @NonNull
    final List<n> d() {
        List<n> a = a("close");
        a.addAll(a("closeLinear"));
        return a;
    }

    @NonNull
    final List<n> e() {
        List<String> b = b("pause");
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = b.iterator();
        while (it.hasNext()) {
            arrayList.add(new n(it.next(), (byte) 0));
        }
        return arrayList;
    }

    @NonNull
    final List<n> f() {
        List<String> b = b("resume");
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = b.iterator();
        while (it.hasNext()) {
            arrayList.add(new n(it.next(), (byte) 0));
        }
        return arrayList;
    }

    @NonNull
    final List<l> g() {
        ArrayList arrayList = new ArrayList();
        a(arrayList, b("firstQuartile"), 25.0f);
        a(arrayList, b("midpoint"), 50.0f);
        a(arrayList, b("thirdQuartile"), 75.0f);
        List<Node> b = sg.bigo.ads.dg.a.b(sg.bigo.ads.dg.a.a(this.a, "TrackingEvents"), "Tracking", "event", Collections.singletonList("progress"));
        if (b != null) {
            for (Node node : b) {
                String e = sg.bigo.ads.dg.a.e(node, "offset");
                if (e != null) {
                    String trim = e.trim();
                    if (o.a(trim)) {
                        String a = sg.bigo.ads.dg.a.a(node);
                        try {
                            int d = o.d(trim);
                            if (d >= 0 && r.b((CharSequence) a)) {
                                arrayList.add(new l(a, d));
                            }
                        } catch (NumberFormatException unused) {
                            String.format("Failed to parse VAST progress tracker %s", trim);
                        }
                    }
                }
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    @NonNull
    final List<c> h() {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = b("start").iterator();
        while (it.hasNext()) {
            arrayList.add(new c(it.next(), 0));
        }
        Node a = sg.bigo.ads.dg.a.a(this.a, "TrackingEvents");
        List<Node> b = sg.bigo.ads.dg.a.b(a, "Tracking", "event", Collections.singletonList("progress"));
        if (b != null) {
            for (Node node : b) {
                String e = sg.bigo.ads.dg.a.e(node, "offset");
                if (e != null) {
                    String trim = e.trim();
                    if (o.b(trim)) {
                        String b2 = sg.bigo.ads.dg.a.b(node);
                        if (!r.a((CharSequence) b2)) {
                            try {
                                int c = o.c(trim);
                                if (c >= 0) {
                                    arrayList.add(new c(b2, c));
                                }
                            } catch (NumberFormatException unused) {
                                String.format("Failed to parse VAST progress tracker %s", trim);
                            }
                        }
                    }
                }
            }
        }
        List<Node> b3 = sg.bigo.ads.dg.a.b(a, "Tracking", "event", Collections.singletonList("creativeView"));
        if (b3 != null) {
            Iterator<Node> it2 = b3.iterator();
            while (it2.hasNext()) {
                String a2 = sg.bigo.ads.dg.a.a(it2.next());
                if (a2 != null) {
                    arrayList.add(new c(a2, 0));
                }
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public final int i() {
        String b = sg.bigo.ads.dg.a.b(this.a, "Duration");
        if (r.a((CharSequence) b)) {
            return -1;
        }
        return o.c(b);
    }
}
