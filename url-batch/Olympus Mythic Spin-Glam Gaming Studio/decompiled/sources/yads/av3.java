package yads;

import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.webkit.WebView;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class av3 {
    public final g9 a;
    public final f9 b;
    public final fw3 c;
    public zu3 d;
    public i9 e;
    public boolean f;
    public boolean g;
    public final String h;
    public boolean i;
    public boolean j;

    /* JADX WARN: Multi-variable type inference failed */
    public av3(f9 f9Var, g9 g9Var) {
        String uuid = UUID.randomUUID().toString();
        this.c = new fw3();
        this.f = false;
        this.g = false;
        this.b = f9Var;
        this.a = g9Var;
        this.h = uuid;
        this.d = new zu3(null);
        h9 h9Var = g9Var.e;
        if (h9Var == h9.c || h9Var == h9.e) {
            this.e = new vu3(uuid);
        } else {
            this.e = new gv3(uuid, Collections.unmodifiableMap(g9Var.c), g9Var.d);
        }
        this.e.b();
        qv3.c.a.add(this);
        i9 i9Var = this.e;
        kw3 kw3Var = kw3.a;
        WebView webView = (WebView) i9Var.b.get();
        String str = i9Var.a;
        JSONObject jSONObject = new JSONObject();
        ov3.a(jSONObject, "impressionOwner", sb2.c);
        ov3.a(jSONObject, "mediaEventsOwner", f9Var.a);
        ov3.a(jSONObject, "creativeType", m20.c);
        ov3.a(jSONObject, "impressionType", a51.c);
        ov3.a(jSONObject, "isolateVerificationScripts", Boolean.FALSE);
        kw3Var.a(webView, "init", jSONObject, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        if (this.f || this.e == null) {
            return;
        }
        this.f = true;
        qv3 qv3Var = qv3.c;
        boolean z = qv3Var.b.size() > 0;
        qv3Var.b.add(this);
        if (!z) {
            lw3 a = lw3.a();
            a.getClass();
            ev3 ev3Var = ev3.d;
            ev3Var.c = a;
            ev3Var.b();
            m93.g.getClass();
            if (m93.i == null) {
                Handler handler = new Handler(Looper.getMainLooper());
                m93.i = handler;
                handler.post(m93.j);
                m93.i.postDelayed(m93.k, 200L);
            }
            xv3 xv3Var = a.c;
            xv3Var.h.submit(new tv3(xv3Var));
            xv3Var.b.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, xv3Var);
        }
        float f = lw3.a().a;
        i9 i9Var = this.e;
        kw3 kw3Var = kw3.a;
        kw3Var.a((WebView) i9Var.b.get(), "setDeviceVolume", Float.valueOf(f), i9Var.a);
        i9 i9Var2 = this.e;
        Date date = uu3.e.a;
        Date date2 = date != null ? (Date) date.clone() : null;
        i9Var2.getClass();
        if (date2 != null) {
            JSONObject jSONObject = new JSONObject();
            ov3.a(jSONObject, "timestamp", Long.valueOf(date2.getTime()));
            kw3Var.a((WebView) i9Var2.b.get(), "setLastActivity", jSONObject);
        }
        this.e.a(this, this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        if (this.g) {
            return;
        }
        this.d.clear();
        if (!this.g) {
            this.c.a.clear();
        }
        this.g = true;
        i9 i9Var = this.e;
        kw3.a.a((WebView) i9Var.b.get(), "finishSession", i9Var.a);
        qv3 qv3Var = qv3.c;
        boolean z = qv3Var.b.size() > 0;
        qv3Var.a.remove(this);
        qv3Var.b.remove(this);
        if (z && qv3Var.b.size() <= 0) {
            lw3 a = lw3.a();
            a.getClass();
            m93 m93Var = m93.g;
            m93Var.getClass();
            Handler handler = m93.i;
            if (handler != null) {
                handler.removeCallbacks(m93.k);
                m93.i = null;
            }
            m93Var.a.clear();
            m93.h.post(new j93(m93Var));
            ev3 ev3Var = ev3.d;
            ev3Var.a = false;
            ev3Var.c = null;
            xv3 xv3Var = a.c;
            xv3Var.b.getContentResolver().unregisterContentObserver(xv3Var);
        }
        this.e.a();
        this.e = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(View view) {
        if (this.g || ((View) this.d.get()) == view) {
            return;
        }
        this.d = new zu3(view);
        i9 i9Var = this.e;
        i9Var.getClass();
        i9Var.f = System.nanoTime();
        i9Var.e = 1;
        Collection<av3> unmodifiableCollection = Collections.unmodifiableCollection(qv3.c.a);
        if (unmodifiableCollection == null || unmodifiableCollection.isEmpty()) {
            return;
        }
        for (av3 av3Var : unmodifiableCollection) {
            if (av3Var != this && ((View) av3Var.d.get()) == view) {
                av3Var.d.clear();
            }
        }
    }
}
