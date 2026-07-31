package com.ironsource;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.f0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4635f0 implements InterfaceC4653g0 {

    @NotNull
    public static final a b = new a(null);

    @NotNull
    private static final String c = "ext_";

    @NotNull
    private final Map<String, String> a = new HashMap();

    /* renamed from: com.ironsource.f0$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Override // com.ironsource.InterfaceC4653g0
    public void a(@NotNull HashMap<String, String> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.a.putAll(params);
    }

    @Override // com.ironsource.InterfaceC4653g0
    public void b(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.a.put("ext_" + key, value);
    }

    @Override // com.ironsource.InterfaceC4653g0
    @NotNull
    public Map<String, String> get() {
        return this.a;
    }

    @Override // com.ironsource.InterfaceC4653g0
    public void a(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.a.put(key, value);
    }
}
