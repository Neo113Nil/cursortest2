package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.impl.oa, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5563oa {
    public final C5471km a = new C5471km();
    public C5616qa b = new C5616qa();

    public final synchronized void a(C5616qa c5616qa) {
        this.b = c5616qa;
    }

    public final synchronized void a(List list, HashMap hashMap) {
        Boolean bool;
        String str;
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual((String) it.next(), "appmetrica_lib_ssl_enabled") && (bool = this.b.a) != null) {
                    boolean booleanValue = bool.booleanValue();
                    C5616qa c5616qa = this.b;
                    IdentifierStatus identifierStatus = c5616qa.b;
                    String str2 = c5616qa.c;
                    if (booleanValue) {
                        str = "true";
                    } else {
                        if (booleanValue) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = "false";
                    }
                    hashMap.put("appmetrica_lib_ssl_enabled", this.a.a(new IdentifiersResult(str, identifierStatus, str2)));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
