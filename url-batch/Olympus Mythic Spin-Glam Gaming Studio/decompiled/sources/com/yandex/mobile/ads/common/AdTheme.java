package com.yandex.mobile.ads.common;

import com.my.target.common.webform.WebFormSetViewSettings;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/mobile/ads/common/AdTheme;", "", "", "b", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "LIGHT", "DARK", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AdTheme {
    public static final AdTheme DARK;
    public static final AdTheme LIGHT;
    private static final /* synthetic */ AdTheme[] c;
    private static final /* synthetic */ EnumEntries d;

    /* renamed from: b, reason: from kotlin metadata */
    private final String value;

    static {
        AdTheme adTheme = new AdTheme(0, "LIGHT", WebFormSetViewSettings.StatusBarStyle.LIGHT);
        LIGHT = adTheme;
        AdTheme adTheme2 = new AdTheme(1, "DARK", WebFormSetViewSettings.StatusBarStyle.DARK);
        DARK = adTheme2;
        AdTheme[] adThemeArr = {adTheme, adTheme2};
        c = adThemeArr;
        d = EnumEntriesKt.enumEntries(adThemeArr);
    }

    private AdTheme(int i, String str, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return d;
    }

    public static AdTheme valueOf(String str) {
        return (AdTheme) Enum.valueOf(AdTheme.class, str);
    }

    public static AdTheme[] values() {
        return (AdTheme[]) c.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
