package io.appmetrica.analytics.impl;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.internal.CounterConfiguration;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class Sh extends Y3 {

    @NonNull
    protected W8 c;
    protected Of d;
    public boolean e;
    public String f;

    public Sh(@NonNull Wf wf, @NonNull CounterConfiguration counterConfiguration, @NonNull W8 w8) {
        this(wf, counterConfiguration, w8, null);
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        this.b.toBundle(bundle);
        Wf wf = this.a;
        synchronized (wf) {
            bundle.putParcelable("PROCESS_CFG_OBJ", wf);
        }
        return bundle;
    }

    @Nullable
    public final synchronized String d() {
        W8 w8;
        w8 = this.c;
        return w8.a.isEmpty() ? null : new JSONObject(w8.a).toString();
    }

    @Nullable
    public final synchronized String e() {
        return this.f;
    }

    public boolean f() {
        return this.e;
    }

    public Sh(@NonNull Wf wf, @NonNull CounterConfiguration counterConfiguration, @NonNull W8 w8, @Nullable String str) {
        super(wf, counterConfiguration);
        this.e = true;
        this.f = str;
        this.c = w8;
    }
}
