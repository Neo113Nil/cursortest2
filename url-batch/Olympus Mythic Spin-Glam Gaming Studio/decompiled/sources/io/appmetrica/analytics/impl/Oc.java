package io.appmetrica.analytics.impl;

import android.os.Bundle;
import com.yandex.div.core.DivActionHandler;
import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class Oc implements Z8 {
    public final Zg a;
    public final C5621qf b;
    public final String c = "activation_unlock_event_sending";
    public final AtomicBoolean d;

    public Oc(@NotNull Zg zg, @NotNull F4 f4, @NotNull C5621qf c5621qf) {
        this.a = zg;
        this.b = c5621qf;
        this.d = new AtomicBoolean(c5621qf.a(false) || a(f4));
    }

    public final void a(String str) {
        try {
            C5340fk c5340fk = Dj.a;
            String str2 = this.c;
            JSONObject put = new JSONObject().put("source", str).put("framework", FrameworkDetector.framework());
            C5382ha i = Ka.I.i();
            Bundle applicationMetaData = i.d.getApplicationMetaData(i.a);
            JSONObject put2 = put.put("appmetrica_plugin_id", applicationMetaData != null ? applicationMetaData.getString("io.appmetrica.analytics.plugin_id") : null);
            Dk dk = Ka.I.D;
            String jSONObject = put2.put("activation_offset", TimeUnit.SECONDS.convert(dk.a.currentTimeMillis() - dk.b, TimeUnit.MILLISECONDS)).toString();
            c5340fk.getClass();
            c5340fk.a(new C5289dk(str2, jSONObject));
        } catch (Throwable unused) {
        }
    }

    @Override // io.appmetrica.analytics.impl.Z8
    public final boolean b() {
        String str;
        if (!this.d.get() && (str = ((C5804xh) this.a.a()).m) != null && !Intrinsics.areEqual(str, "629a824d-c717-4ba5-bc0f-3f3968554d01") && this.d.compareAndSet(false, true)) {
            this.b.b(true);
            a("activation");
        }
        return this.d.get();
    }

    public final void a() {
        if (this.d.compareAndSet(false, true)) {
            this.b.b(true);
            a(DivActionHandler.DivActionReason.TIMER);
        }
    }

    public static boolean a(F4 f4) {
        String str = f4.a;
        return (str == null || Intrinsics.areEqual(str, "629a824d-c717-4ba5-bc0f-3f3968554d01")) ? false : true;
    }
}
