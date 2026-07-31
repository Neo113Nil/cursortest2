package com.vungle.ads.internal.network.converters;

import com.vungle.ads.internal.network.j;
import kotlin.Unit;
import kotlin.io.CloseableKt;

/* loaded from: classes13.dex */
public final class b implements a {
    @Override // com.vungle.ads.internal.network.converters.a
    public final Object a(j jVar) {
        try {
            jVar.close();
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(jVar, null);
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(jVar, th);
                throw th2;
            }
        }
    }
}
