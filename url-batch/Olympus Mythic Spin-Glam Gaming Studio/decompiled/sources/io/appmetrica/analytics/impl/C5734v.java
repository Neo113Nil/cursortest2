package io.appmetrica.analytics.impl;

import java.util.Collection;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* renamed from: io.appmetrica.analytics.impl.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5734v implements InterfaceC5786x {
    public final String a = "yandex";

    @Nullable
    public final String a() {
        try {
            return new JSONArray((Collection) CollectionsKt.plus((Collection) CollectionsKt.listOf(this.a), (Iterable) C5661s4.l().m().d)).toString();
        } catch (Throwable unused) {
            return null;
        }
    }
}
