package sg.bigo.ads.al;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsSession;
import com.pubmatic.sdk.common.POBCommonConstants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import sg.bigo.ads.am.a;
import sg.bigo.ads.am.b;
import sg.bigo.ads.bh.d;

/* loaded from: classes10.dex */
final class b implements a.InterfaceC1838a {
    private static final b c = new b();
    final sg.bigo.ads.am.a a = new sg.bigo.ads.am.a();
    private final int d = POBCommonConstants.BANNER_BID_EXPIRE_TIME_IN_MILLIS;
    private final int e = 200;
    final Set<String> b = new LinkedHashSet();
    private final HashMap<String, Long> f = new HashMap<>();
    private int g = 0;
    private boolean h = false;
    private boolean i = false;
    private boolean j = true;
    private boolean k = false;

    b() {
    }

    static /* synthetic */ String a(int i) {
        switch (i) {
            case 1:
                return "Navigation Started";
            case 2:
                return "Navigation Finished";
            case 3:
                return "Navigation Failed";
            case 4:
                return "Navigation Aborted";
            case 5:
                return "Tab Shown";
            case 6:
                return "Tab Hidden";
            default:
                return "Unknown Event";
        }
    }

    public static b a() {
        return c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    public void e() {
        final String str;
        Iterator<String> it;
        if (!this.i) {
            this.k = false;
            return;
        }
        try {
            it = this.b.iterator();
        } catch (Exception unused) {
            str = null;
        }
        if (!it.hasNext()) {
            this.k = false;
            return;
        }
        this.k = true;
        str = it.next();
        try {
            this.b.remove(str);
        } catch (Exception unused2) {
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        d.a(1, new Runnable() { // from class: sg.bigo.ads.al.b.3
            @Override // java.lang.Runnable
            public final void run() {
                CustomTabsSession a;
                Long l = (Long) b.this.f.get(str);
                if (l == null || SystemClock.elapsedRealtime() - l.longValue() > 300000) {
                    Uri parse = Uri.parse(str);
                    sg.bigo.ads.am.a aVar = b.this.a;
                    boolean z = false;
                    if (aVar.a != null && (a = aVar.a()) != null) {
                        z = a.mayLaunchUrl(parse, null, null);
                    }
                    String str2 = str;
                    if (!z) {
                        sg.bigo.ads.da.b.a(3002, 10115, String.valueOf(str2));
                    }
                    b.this.f.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
                }
                d.a(2, new Runnable() { // from class: sg.bigo.ads.al.b.3.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.this.e();
                    }
                }, 200L);
            }
        });
    }

    final boolean a(Context context) {
        if (!this.j) {
            return false;
        }
        boolean z = true;
        if (this.i || this.h) {
            return true;
        }
        this.h = true;
        sg.bigo.ads.am.a aVar = this.a;
        aVar.c = this;
        if (aVar.a == null) {
            b.a a = sg.bigo.ads.am.b.a(context);
            if (a == null || !a.a) {
                z = false;
            } else {
                sg.bigo.ads.am.c cVar = new sg.bigo.ads.am.c(aVar);
                aVar.b = cVar;
                z = CustomTabsClient.bindCustomTabsService(context, a.e, cVar);
            }
        }
        if (!z) {
            this.h = false;
            int i = this.g;
            this.g = i + 1;
            if (i < 3) {
                this.j = false;
            }
        }
        return z;
    }

    @MainThread
    final void b() {
        if (this.k) {
            return;
        }
        e();
    }

    @Override // sg.bigo.ads.am.a.InterfaceC1838a
    public final void c() {
        this.i = true;
        this.h = false;
        b();
    }

    @Override // sg.bigo.ads.am.a.InterfaceC1838a
    public final void d() {
        this.i = false;
        this.h = false;
    }
}
