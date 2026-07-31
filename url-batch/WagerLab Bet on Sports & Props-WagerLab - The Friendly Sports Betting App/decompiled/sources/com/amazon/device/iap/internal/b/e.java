package com.amazon.device.iap.internal.b;

import com.amazon.a.a.o.f;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

/* compiled from: PurchaseRequestTracker.java */
/* loaded from: classes3.dex */
public class e {
    private static final e b = new e();

    /* renamed from: a, reason: collision with root package name */
    private final Set<String> f684a = new ConcurrentSkipListSet();

    public boolean a(String str) {
        if (f.a(str)) {
            return false;
        }
        return this.f684a.remove(str);
    }

    public void b(String str) {
        if (f.a(str)) {
            return;
        }
        this.f684a.add(str);
    }

    public static e a() {
        return b;
    }
}
