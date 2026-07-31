package com.ironsource;

import android.util.Log;
import android.util.Pair;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes12.dex */
public class J5 {
    private static final String e = "EventsTracker";
    private InterfaceC4785n7 a;
    private D5 b;
    private G7 c;
    private ExecutorService d;

    class a implements Runnable {
        final /* synthetic */ String a;

        a(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Qd qd = new Qd();
                ArrayList<Pair<String, String>> d = J5.this.b.d();
                if ("POST".equals(J5.this.b.e())) {
                    qd = C4589c8.b(J5.this.b.b(), this.a, d);
                } else if (C4701ic.a.equals(J5.this.b.e())) {
                    qd = C4589c8.a(J5.this.b.b(), this.a, d);
                }
                J5.this.a("response status code: " + qd.a);
            } catch (Exception e) {
                C4782n4.d().a(e);
            }
        }
    }

    public J5(D5 d5, InterfaceC4785n7 interfaceC4785n7) {
        if (d5 == null) {
            throw new InvalidParameterException("Null configuration not supported ");
        }
        if (d5.c() == null) {
            throw new InvalidParameterException("Null formatter not supported ");
        }
        this.b = d5;
        this.a = interfaceC4785n7;
        this.c = d5.c();
        this.d = Executors.newSingleThreadExecutor();
    }

    private void b(String str) {
        this.d.submit(new a(str));
    }

    public void a(String str, Map<String, Object> map) {
        a(String.format(Locale.ENGLISH, "%s %s", str, map.toString()));
        if (this.b.a() && !str.isEmpty()) {
            HashMap hashMap = new HashMap();
            hashMap.put(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.W, str);
            a(hashMap, this.a.a());
            a(hashMap, map);
            b(this.c.a(hashMap));
        }
    }

    private void a(Map<String, Object> map, Map<String, Object> map2) {
        try {
            map.putAll(map2);
        } catch (Exception e2) {
            C4782n4.d().a(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (this.b.f()) {
            Log.d(e, str);
        }
    }
}
