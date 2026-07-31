package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* renamed from: io.appmetrica.analytics.impl.va, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5745va {
    public static volatile C5745va c;
    public final Context a;
    public final HashMap b = new HashMap();

    public C5745va(Context context) {
        this.a = context;
    }

    public static final C5745va a(Context context) {
        if (c == null) {
            synchronized (Reflection.getOrCreateKotlinClass(C5745va.class)) {
                try {
                    if (c == null) {
                        c = new C5745va(context);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C5745va c5745va = c;
        if (c5745va != null) {
            return c5745va;
        }
        Intrinsics.throwUninitializedPropertyAccessException("INSTANCE");
        return null;
    }

    public final synchronized R9 b(String str) {
        Object obj;
        try {
            HashMap hashMap = this.b;
            obj = hashMap.get(str);
            if (obj == null) {
                obj = new R9(this.a, str);
                hashMap.put(str, obj);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (R9) obj;
    }

    public final synchronized void a(String str) {
        this.b.remove(str);
    }
}
