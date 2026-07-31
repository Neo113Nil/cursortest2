package com.iab.omid.library.mmadbridge.walking.async;

import com.iab.omid.library.mmadbridge.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class a extends b {
    protected final HashSet<String> c;
    protected final JSONObject d;
    protected final long e;

    public a(b.InterfaceC0306b interfaceC0306b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC0306b);
        this.c = new HashSet<>(hashSet);
        this.d = jSONObject;
        this.e = j;
    }
}
