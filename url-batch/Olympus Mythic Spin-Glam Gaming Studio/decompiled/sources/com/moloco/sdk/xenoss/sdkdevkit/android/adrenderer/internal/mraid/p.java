package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class p {

    @NotNull
    public static final a a;
    public static final p b = new p("Portrait", 0);
    public static final p c = new p("Landscape", 1);
    public static final p d = new p("None", 2);
    public static final /* synthetic */ p[] e;
    public static final /* synthetic */ EnumEntries f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final p a(@Nullable String str) {
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != 3387192) {
                    if (hashCode != 729267099) {
                        if (hashCode == 1430647483 && str.equals("landscape")) {
                            return p.c;
                        }
                    } else if (str.equals("portrait")) {
                        return p.b;
                    }
                } else if (str.equals("none")) {
                    return p.d;
                }
            }
            return null;
        }

        public a() {
        }
    }

    static {
        p[] a2 = a();
        e = a2;
        f = EnumEntriesKt.enumEntries(a2);
        a = new a(null);
    }

    public p(String str, int i) {
    }

    public static final /* synthetic */ p[] a() {
        return new p[]{b, c, d};
    }

    @NotNull
    public static EnumEntries b() {
        return f;
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) e.clone();
    }
}
