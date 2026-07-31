package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class a {

    @NotNull
    public static final C1603a a;
    public static final a b = new a("Portrait", 0);
    public static final a c = new a("Landscape", 1);
    public static final a d = new a("None", 2);
    public static final /* synthetic */ a[] e;
    public static final /* synthetic */ EnumEntries f;

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a$a, reason: collision with other inner class name */
    public static final class C1603a {
        public /* synthetic */ C1603a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final a a(@Nullable String str) {
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != 3387192) {
                    if (hashCode != 729267099) {
                        if (hashCode == 1430647483 && str.equals("landscape")) {
                            return a.c;
                        }
                    } else if (str.equals("portrait")) {
                        return a.b;
                    }
                } else if (str.equals("none")) {
                    return a.d;
                }
            }
            return null;
        }

        public C1603a() {
        }
    }

    static {
        a[] a2 = a();
        e = a2;
        f = EnumEntriesKt.enumEntries(a2);
        a = new C1603a(null);
    }

    public a(String str, int i) {
    }

    public static final /* synthetic */ a[] a() {
        return new a[]{b, c, d};
    }

    @NotNull
    public static EnumEntries b() {
        return f;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) e.clone();
    }
}
