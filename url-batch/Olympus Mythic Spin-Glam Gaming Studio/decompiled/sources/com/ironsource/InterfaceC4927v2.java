package com.ironsource;

import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* renamed from: com.ironsource.v2, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC4927v2 {
    static /* synthetic */ void a(InterfaceC4927v2 interfaceC4927v2, List list, Map map, String str, C4834q2 c4834q2, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2, B b, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onAuctionSuccess");
        }
        interfaceC4927v2.a(list, map, str, c4834q2, jSONObject, jSONObject2, i, j, i2, str2, (i3 & 1024) != 0 ? null : b);
    }

    void a(int i, @NotNull String str);

    void a(int i, @Nullable String str, int i2, @NotNull String str2, long j, @Nullable B b);

    void a(@NotNull List<C4834q2> list, @NotNull Map<String, I> map, @NotNull String str, @Nullable C4834q2 c4834q2, @Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2, int i, long j, int i2, @Nullable String str2, @Nullable B b);

    static /* synthetic */ void a(InterfaceC4927v2 interfaceC4927v2, int i, String str, int i2, String str2, long j, B b, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onAuctionFailed");
        }
        interfaceC4927v2.a(i, str, i2, str2, j, (i3 & 32) != 0 ? null : b);
    }
}
