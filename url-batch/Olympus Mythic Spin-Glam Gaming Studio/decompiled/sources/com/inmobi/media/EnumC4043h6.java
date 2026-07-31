package com.inmobi.media;

import kotlin.enums.EnumEntriesKt;
import org.chromium.net.NetError;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.inmobi.media.h6, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class EnumC4043h6 {
    public static final /* synthetic */ EnumC4043h6[] a;

    static {
        EnumC4043h6[] enumC4043h6Arr = {new EnumC4043h6(0, -100, "PING_V2_DISABLED", "Ping V2 is disabled from SDK config"), new EnumC4043h6(1, NetError.ERR_CONNECTION_RESET, "PING_ID_MISSING", "Ping ID is missing"), new EnumC4043h6(2, -102, "PING_URL_INVALID", "Ping url is invalid"), new EnumC4043h6(3, -103, "PING_URL_MISSING", "Ping URL is missing"), new EnumC4043h6(4, -104, "PING_JSON_INVALID", "Ping JSON is invalid"), new EnumC4043h6(5, -105, "PING_ARRAY_EMPTY", "Ping array is empty"), new EnumC4043h6(6, -106, "PING_UNKNOWN_RESPONSE", "Ping response is unknown"), new EnumC4043h6(7, -107, "PING_EXCEPTION", "Ping exception occurred")};
        a = enumC4043h6Arr;
        EnumEntriesKt.enumEntries(enumC4043h6Arr);
    }

    public EnumC4043h6(int i, int i2, String str, String str2) {
    }

    public static EnumC4043h6 valueOf(String str) {
        return (EnumC4043h6) Enum.valueOf(EnumC4043h6.class, str);
    }

    public static EnumC4043h6[] values() {
        return (EnumC4043h6[]) a.clone();
    }
}
