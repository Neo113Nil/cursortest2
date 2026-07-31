package com.my.target;

import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.my.target.wh;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes3.dex */
public abstract class wh {
    static a a;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface a {
        void a(uh uhVar, Map map, int i, c cVar);

        void a(String str);
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface c {
        void a();
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(jg jgVar, kc kcVar, hc hcVar) {
        yh aiVar;
        SQLiteDatabase a2 = kcVar.a();
        if (a2 != null) {
            try {
                aiVar = new ai(a2);
            } catch (Exception unused) {
            }
            if (aiVar == null) {
                aiVar = new zh();
            }
            si a3 = si.a();
            ci a4 = ci.a(o0.e, aiVar, a3, 10, 4, hcVar, jgVar);
            a4.c();
            synchronized (wh.class) {
                try {
                    if (a == null) {
                        a = new b(a4);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        aiVar = null;
        if (aiVar == null) {
        }
        si a32 = si.a();
        ci a42 = ci.a(o0.e, aiVar, a32, 10, 4, hcVar, jgVar);
        a42.c();
        synchronized (wh.class) {
        }
    }

    public static void b(uh uhVar, int i) {
        b(uhVar, i, (c) null);
    }

    public static void c(th thVar, String str, int i) {
        b(thVar, str, i, null);
    }

    public static void b(uh uhVar, int i, c cVar) {
        if (a == null || uhVar.c.isEmpty()) {
            return;
        }
        a.a(uhVar, null, i, cVar);
    }

    public static void b(th thVar, String str, int i) {
        a(thVar, str, i, (c) null);
    }

    public static void b(th thVar, String str, int i, c cVar) {
        if (a != null) {
            uh b2 = thVar.b(str);
            if (b2.c.isEmpty()) {
                return;
            }
            a.a(b2, null, i, cVar);
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    static final class b implements a {
        private static final List b = Arrays.asList("urlResolved", "webviewShown", "pageLoaded", "pageLoadFailed", "webviewClosed");
        private static Pattern c = null;
        private static Pattern d = null;
        private final ci a;

        b(ci ciVar) {
            this.a = ciVar;
            try {
                c = Pattern.compile("^https://[a-z]+\\.((mail\\.ru)|(mradx\\.net))/pixel/.*$");
                d = Pattern.compile("^https://vk.com/ads_light.php.*$");
            } catch (PatternSyntaxException e) {
                mi.b("StatResolver: " + e.getLocalizedMessage());
            }
        }

        private boolean b(String str) {
            Pattern pattern = d;
            if (pattern != null) {
                return pattern.matcher(str).matches();
            }
            return false;
        }

        private boolean c(String str) {
            Pattern pattern = c;
            if (pattern != null) {
                return pattern.matcher(str).matches();
            }
            return false;
        }

        @Override // com.my.target.wh.a
        public void a(final uh uhVar, final Map map, int i, final c cVar) {
            if (uhVar == null || uhVar.c.isEmpty()) {
                mi.a("No stats here, nothing to send");
                return;
            }
            final vh vhVar = new vh(uhVar.d, i, "");
            final long a = q3.a();
            this.a.b(new Runnable() { // from class: com.my.target.wh$b$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    wh.b.this.a(uhVar, map, a, vhVar, cVar);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(uh uhVar, Map map, long j, vh vhVar, c cVar) {
            for (rh rhVar : uhVar.c) {
                String str = "statType=" + rhVar.b() + ", needDecode=" + rhVar.e() + ", statUrl=" + rhVar.c();
                a(rhVar);
                String a = wh.a(rhVar.c(), rhVar.e(), a(rhVar, map, j, uhVar.b));
                if (a == null) {
                    vhVar.a(9000, "url is null for " + str);
                } else {
                    if (cVar != null && rhVar.d()) {
                        cVar.a();
                    }
                    this.a.a(a, j, vhVar.a(str), uhVar.a);
                }
            }
        }

        @Override // com.my.target.wh.a
        public void a(final String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            final long currentTimeMillis = System.currentTimeMillis();
            this.a.b(new Runnable() { // from class: com.my.target.wh$b$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    wh.b.this.a(str, currentTimeMillis);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(String str, long j) {
            String a = wh.a(str, true, Collections.EMPTY_MAP);
            if (a != null) {
                this.a.a(a, j, vh.e, null);
            }
        }

        private Map a(rh rhVar, Map map, long j, g0 g0Var) {
            HashMap hashMap = new HashMap();
            if (map != null) {
                hashMap.putAll(map);
            }
            hashMap.putAll(a(rhVar, j, g0Var));
            return hashMap;
        }

        private Map a(rh rhVar, long j, g0 g0Var) {
            String c2;
            Map a;
            if (rhVar.e()) {
                c2 = ti.a(rhVar.c());
            } else {
                c2 = rhVar.c();
            }
            HashMap hashMap = new HashMap();
            if (g0Var != null && (a = g0Var.a(rhVar.a())) != null) {
                hashMap.putAll(a);
            }
            boolean z = c(c2) && b.contains(rhVar.b());
            boolean b2 = b(c2);
            if (!z && !b2) {
                return hashMap;
            }
            hashMap.put("client_timestamp", String.valueOf(j));
            return hashMap;
        }

        private void a(rh rhVar) {
            if (rhVar instanceof xe) {
                mi.a("StatResolver: Tracking progress stat value - " + ((xe) rhVar).h() + ", url - " + rhVar.c());
                return;
            }
            if (rhVar instanceof ke) {
                ke keVar = (ke) rhVar;
                mi.a("StatResolver: Tracking ovv stat percent - " + keVar.f + ", value - " + keVar.i() + ", ovv - " + keVar.j() + ", url - " + rhVar.c());
                return;
            }
            if (rhVar instanceof gc) {
                gc gcVar = (gc) rhVar;
                mi.a("StatResolver: Tracking mrc stat percent - , percent - " + gcVar.f + ", duration - " + gcVar.h + ", url - " + rhVar.c());
                return;
            }
            mi.a("StatResolver: Tracking stat type - " + rhVar.b() + ", url - " + rhVar.c());
        }
    }

    public static void a(uh uhVar, Map map, int i, c cVar) {
        a aVar = a;
        if (aVar != null) {
            aVar.a(uhVar, map, i, cVar);
        }
    }

    public static void a(List list, t tVar, int i, g0 g0Var) {
        if (a != null) {
            th a2 = th.a(tVar.a(u0.g), null, g0Var);
            if (list == null) {
                list = Collections.EMPTY_LIST;
            }
            a.a(uh.a(a2, list), null, i, null);
        }
    }

    public static void a(uh uhVar, int i) {
        a(uhVar, i, (c) null);
    }

    public static void a(uh uhVar, int i, c cVar) {
        a aVar = a;
        if (aVar != null) {
            aVar.a(uhVar, null, i, cVar);
        }
    }

    public static void a(th thVar, String str, Map map, int i) {
        a(thVar.b(str), map, i, (c) null);
    }

    public static void a(th thVar, String str, int i, c cVar) {
        a aVar = a;
        if (aVar != null) {
            aVar.a(thVar.b(str), null, i, cVar);
        }
    }

    public static void a(th thVar, String str, int i) {
        a aVar = a;
        if (aVar != null) {
            aVar.a(thVar.a(str), null, i, null);
        }
    }

    public static void a(String str) {
        a aVar = a;
        if (aVar != null) {
            aVar.a(str);
        }
    }

    static String a(String str, boolean z, Map map) {
        if (z) {
            str = ti.a(str);
        }
        if (!URLUtil.isNetworkUrl(str)) {
            mi.a("StatResolver: Invalid stat url: " + str);
            return null;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return buildUpon.build().toString();
    }
}
