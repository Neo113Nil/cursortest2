package com.moloco.sdk.internal.services.bidtoken;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.chromium.net.NetError;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.moloco.sdk.internal.services.bidtoken.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC5039b {
    public static final EnumC5039b b = new EnumC5039b("UNKNOWN", 0, -100);
    public static final EnumC5039b c = new EnumC5039b("HTTP_REQUEST_TIMEOUT", 1, NetError.ERR_CONNECTION_RESET);
    public static final EnumC5039b d = new EnumC5039b("UNKNOWN_HOST", 2, -102);
    public static final /* synthetic */ EnumC5039b[] e;
    public static final /* synthetic */ EnumEntries f;
    public final int a;

    static {
        EnumC5039b[] a = a();
        e = a;
        f = EnumEntriesKt.enumEntries(a);
    }

    public EnumC5039b(String str, int i, int i2) {
        this.a = i2;
    }

    public static final /* synthetic */ EnumC5039b[] a() {
        return new EnumC5039b[]{b, c, d};
    }

    @NotNull
    public static EnumEntries b() {
        return f;
    }

    public static EnumC5039b valueOf(String str) {
        return (EnumC5039b) Enum.valueOf(EnumC5039b.class, str);
    }

    public static EnumC5039b[] values() {
        return (EnumC5039b[]) e.clone();
    }

    public final int c() {
        return this.a;
    }
}
