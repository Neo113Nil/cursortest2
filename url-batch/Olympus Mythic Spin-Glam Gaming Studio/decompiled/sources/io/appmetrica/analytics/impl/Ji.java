package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;

/* loaded from: classes11.dex */
public final class Ji {
    public final V4 a;
    public final C5473ko b;
    public final Li c;
    public final C5631r0 d;
    public InterfaceC5368gm e;
    public final C5599pk f;

    public Ji(C5631r0 c5631r0, C5473ko c5473ko, V4 v4, C5599pk c5599pk) {
        this(c5631r0, c5473ko, v4, c5599pk, new Li(c5631r0, c5599pk));
    }

    public final void a(Ih ih) {
        Sh sh = ih.e;
        InterfaceC5368gm interfaceC5368gm = this.e;
        if (interfaceC5368gm != null) {
            sh.b.setUuid(((C5342fm) interfaceC5368gm).g());
        } else {
            sh.getClass();
        }
        this.c.a(ih);
    }

    public final void b(String str) {
        Wf wf = this.a.a;
        synchronized (wf) {
            wf.a.put("PROCESS_CFG_INSTALL_REFERRER_SOURCE", str);
        }
    }

    public Ji(C5631r0 c5631r0, C5473ko c5473ko, V4 v4, C5599pk c5599pk, Li li) {
        this.d = c5631r0;
        this.a = v4;
        this.b = c5473ko;
        this.f = c5599pk;
        this.c = li;
    }

    public final void a(C5342fm c5342fm) {
        this.e = c5342fm;
        this.a.b.setUuid(c5342fm.g());
    }

    public final void a(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        if (Do.a(bool)) {
            this.a.b.setLocationTracking(bool.booleanValue());
        }
        if (Do.a(bool2)) {
            this.a.b.setDataSendingEnabled(bool2.booleanValue());
        }
        if (Do.a(bool3)) {
            this.a.b.setAdvIdentifiersTracking(bool3.booleanValue(), bool4.booleanValue());
        }
        C5326f6 a = C5326f6.a();
        V4 v4 = this.a;
        a(a(a, v4), v4, 1, (Map) null);
    }

    public final void a(C5326f6 c5326f6, Sh sh, int i, Map map) {
        String str;
        EnumC5798xb enumC5798xb = EnumC5798xb.EVENT_TYPE_UNDEFINED;
        this.d.b();
        if (!Do.a(map)) {
            c5326f6.setValue(Cb.b(map));
            a(c5326f6, sh);
        }
        Wf wf = new Wf(sh.a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(sh.b);
        W8 w8 = sh.c;
        synchronized (sh) {
            str = sh.f;
        }
        a(new Ih(c5326f6, false, i, null, new Sh(wf, counterConfiguration, w8, str)));
    }

    public static C5326f6 a(C5326f6 c5326f6, Sh sh) {
        if (Q9.a.contains(Integer.valueOf(c5326f6.d))) {
            c5326f6.c = sh.d();
        }
        return c5326f6;
    }

    public final void a(List list) {
        Wf wf = this.a.a;
        synchronized (wf) {
            wf.a.put("PROCESS_CFG_CUSTOM_HOSTS", Do.a((Collection) list) ? null : new JSONArray((Collection) list).toString());
        }
    }

    public final void a(HashMap hashMap) {
        Wf wf = this.a.a;
        synchronized (wf) {
            wf.a.put("PROCESS_CFG_CLIDS", Cb.b(hashMap));
        }
    }

    public final void a(String str) {
        Wf wf = this.a.a;
        synchronized (wf) {
            wf.a.put("PROCESS_CFG_DISTRIBUTION_REFERRER", str);
        }
    }

    public final Ih a(C5421io c5421io, Sh sh) {
        String str;
        String str2;
        this.d.b();
        C5473ko c5473ko = this.b;
        c5473ko.getClass();
        Yn yn = c5421io.a;
        if (yn == null) {
            str = "";
        } else {
            str = (String) WrapUtils.getOrDefault(yn.a, "");
        }
        byte[] fromModel = c5473ko.a.fromModel(c5421io);
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(sh.b.getApiKey());
        Set set = Q9.a;
        EnumC5798xb enumC5798xb = EnumC5798xb.EVENT_TYPE_UNDEFINED;
        C5273d4 c5273d4 = new C5273d4(fromModel, str, 5891, orCreatePublicLogger);
        c5273d4.c = sh.d();
        HashMap hashMap = c5273d4.q;
        Wf wf = new Wf(sh.a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(sh.b);
        W8 w8 = sh.c;
        synchronized (sh) {
            str2 = sh.f;
        }
        return new Ih(c5273d4, true, 1, hashMap, new Sh(wf, counterConfiguration, w8, str2));
    }
}
