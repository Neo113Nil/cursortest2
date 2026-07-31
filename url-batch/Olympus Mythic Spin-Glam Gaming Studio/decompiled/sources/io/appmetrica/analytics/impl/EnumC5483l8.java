package io.appmetrica.analytics.impl;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.my.target.common.DisclaimerAlias;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: io.appmetrica.analytics.impl.l8, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class EnumC5483l8 {
    public static final C5457k8 b;
    public static final EnumC5483l8 c;
    public static final EnumC5483l8 d;
    public static final EnumC5483l8 e;
    public static final EnumC5483l8 f;
    public static final /* synthetic */ EnumC5483l8[] g;
    public final String a;

    static {
        EnumC5483l8 enumC5483l8 = new EnumC5483l8(0, DisclaimerAlias.UNDEFINED, DisclaimerAlias.UNDEFINED);
        c = enumC5483l8;
        EnumC5483l8 enumC5483l82 = new EnumC5483l8(1, IronSourceConstants.APP_EVENT_TYPE, IronSourceConstants.APP_EVENT_TYPE);
        d = enumC5483l82;
        EnumC5483l8 enumC5483l83 = new EnumC5483l8(2, "SATELLITE", "SATELLITE");
        e = enumC5483l83;
        EnumC5483l8 enumC5483l84 = new EnumC5483l8(3, "RETAIL", "RETAIL");
        f = enumC5483l84;
        EnumC5483l8[] enumC5483l8Arr = {enumC5483l8, enumC5483l82, enumC5483l83, enumC5483l84};
        g = enumC5483l8Arr;
        EnumEntriesKt.enumEntries(enumC5483l8Arr);
        b = new C5457k8();
    }

    public EnumC5483l8(int i, String str, String str2) {
        this.a = str2;
    }

    public static EnumC5483l8 valueOf(String str) {
        return (EnumC5483l8) Enum.valueOf(EnumC5483l8.class, str);
    }

    public static EnumC5483l8[] values() {
        return (EnumC5483l8[]) g.clone();
    }
}
