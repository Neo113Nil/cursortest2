package com.inmobi.media;

import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class K9 implements Runnable {
    public final /* synthetic */ JSONObject a;

    public K9(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (AbstractC4216nl.c()) {
            return;
        }
        Q9.a(this.a);
    }
}
