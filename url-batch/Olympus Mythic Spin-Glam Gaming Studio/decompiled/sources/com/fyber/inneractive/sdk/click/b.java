package com.fyber.inneractive.sdk.click;

import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class b {
    public final q a;
    public final Throwable b;
    public final String c;
    public final String d;
    public long e;
    public final ArrayList f = new ArrayList();

    public b(String str, q qVar, String str2, Exception exc) {
        this.d = str;
        this.a = qVar;
        this.c = str2;
        this.b = exc;
    }

    public final String toString() {
        q qVar = this.a;
        if (qVar == q.FAILED) {
            Throwable th = this.b;
            return "Open result: Failed! error: " + (th != null ? th.getMessage() : "none");
        }
        return "Open result: Success! target: " + qVar + " method: " + this.c;
    }
}
