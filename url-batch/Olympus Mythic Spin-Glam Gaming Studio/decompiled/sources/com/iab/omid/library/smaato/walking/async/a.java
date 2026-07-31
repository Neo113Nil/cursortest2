package com.iab.omid.library.smaato.walking.async;

import com.iab.omid.library.smaato.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class a extends b {
    protected final HashSet<String> c;
    protected final JSONObject d;
    protected final long e;

    public a(b.InterfaceC0333b interfaceC0333b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC0333b);
        this.c = new HashSet<>(hashSet);
        this.d = jSONObject;
        this.e = j;
    }
}
