package com.vectorharbor.planetvectorsurvey.navigation;

import defpackage.nk;
import defpackage.nq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class Route {
    private static final /* synthetic */ nq $ENTRIES;
    private static final /* synthetic */ Route[] $VALUES;
    private final String value;
    public static final Route Loading = new Route("Loading", 0, "loading");
    public static final Route Briefing = new Route("Briefing", 1, "briefing");
    public static final Route Sectors = new Route("Sectors", 2, "sectors");
    public static final Route ArrayDeck = new Route("ArrayDeck", 3, "array_deck");
    public static final Route Rules = new Route("Rules", 4, "rules");
    public static final Route Calibration = new Route("Calibration", 5, "calibration");
    public static final Route Debrief = new Route("Debrief", 6, "debrief");

    private static final /* synthetic */ Route[] $values() {
        return new Route[]{Loading, Briefing, Sectors, ArrayDeck, Rules, Calibration, Debrief};
    }

    static {
        Route[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nk.o($values);
    }

    private Route(String str, int i, String str2) {
        this.value = str2;
    }

    public static nq getEntries() {
        return $ENTRIES;
    }

    public static Route valueOf(String str) {
        return (Route) Enum.valueOf(Route.class, str);
    }

    public static Route[] values() {
        return (Route[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
