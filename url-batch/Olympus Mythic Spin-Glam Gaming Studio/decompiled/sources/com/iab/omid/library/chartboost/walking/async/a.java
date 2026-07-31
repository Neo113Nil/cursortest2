package com.iab.omid.library.chartboost.walking.async;

import com.iab.omid.library.chartboost.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public abstract class a extends b {
    protected final HashSet<String> c;
    protected final JSONObject d;
    protected final long e;

    public a(b.InterfaceC0286b interfaceC0286b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC0286b);
        this.c = new HashSet<>(hashSet);
        this.d = jSONObject;
        this.e = j;
    }
}
