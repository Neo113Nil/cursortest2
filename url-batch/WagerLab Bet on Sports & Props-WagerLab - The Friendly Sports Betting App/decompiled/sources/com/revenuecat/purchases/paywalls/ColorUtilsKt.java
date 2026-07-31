package com.revenuecat.purchases.paywalls;

import android.graphics.Color;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: ColorUtils.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\u001a0\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u0003H\u0001\u001a\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"rgbaColorRegex", "Lkotlin/text/Regex;", "colorInt", "", "alpha", "red", "green", "blue", "parseRGBAColor", "stringRepresentation", "", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ColorUtilsKt {
    private static final Regex rgbaColorRegex = new Regex("^#([A-Fa-f0-9]{2})([A-Fa-f0-9]{2})([A-Fa-f0-9]{2})([A-Fa-f0-9]{2})?$");

    public static final int colorInt(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    public static final int parseRGBAColor(String stringRepresentation) {
        Intrinsics.checkNotNullParameter(stringRepresentation, "stringRepresentation");
        MatchResult matchEntire = rgbaColorRegex.matchEntire(stringRepresentation);
        if (matchEntire != null) {
            MatchResult.Destructured destructured = matchEntire.getDestructured();
            String str = destructured.getMatch().getGroupValues().get(1);
            String str2 = destructured.getMatch().getGroupValues().get(2);
            String str3 = destructured.getMatch().getGroupValues().get(3);
            Object orNull = CollectionsKt.getOrNull(matchEntire.getGroupValues(), 4);
            String str4 = (String) orNull;
            if (str4 == null || StringsKt.isBlank(str4)) {
                orNull = null;
            }
            String str5 = (String) orNull;
            if (str5 == null) {
                str5 = "FF";
            }
            return colorInt(Integer.parseInt(str5, CharsKt.checkRadix(16)), Integer.parseInt(str, CharsKt.checkRadix(16)), Integer.parseInt(str2, CharsKt.checkRadix(16)), Integer.parseInt(str3, CharsKt.checkRadix(16)));
        }
        return Color.parseColor(stringRepresentation);
    }
}
