package com.five_corp.ad.internal.exception;

import com.five_corp.ad.internal.m;

/* loaded from: classes4.dex */
public class b extends Exception {
    public final m a;

    public b(m mVar, String str) {
        super(str, null);
        this.a = mVar;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(this.a.toString());
        sb.append(getCause() == null ? "" : getCause().toString());
        return sb.toString();
    }
}
