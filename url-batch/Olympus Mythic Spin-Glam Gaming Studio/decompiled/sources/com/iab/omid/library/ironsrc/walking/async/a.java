package com.iab.omid.library.ironsrc.walking.async;

import com.iab.omid.library.ironsrc.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class a extends b {
    protected final HashSet<String> c;
    protected final JSONObject d;
    protected final long e;

    public a(b.InterfaceC0302b interfaceC0302b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC0302b);
        this.c = new HashSet<>(hashSet);
        this.d = jSONObject;
        this.e = j;
    }
}
