package com.iab.omid.library.pubmatic.walking.async;

import com.iab.omid.library.pubmatic.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public abstract class a extends b {
    protected final HashSet<String> c;
    protected final JSONObject d;
    protected final long e;

    public a(b.InterfaceC0323b interfaceC0323b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC0323b);
        this.c = new HashSet<>(hashSet);
        this.d = jSONObject;
        this.e = j;
    }
}
