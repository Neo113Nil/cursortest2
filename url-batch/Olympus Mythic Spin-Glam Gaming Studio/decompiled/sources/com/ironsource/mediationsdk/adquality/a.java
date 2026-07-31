package com.ironsource.mediationsdk.adquality;

import com.ironsource.C4626e9;
import com.ironsource.EnumC4939ve;
import com.ironsource.O6;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

/* loaded from: classes11.dex */
public final class a {

    @NotNull
    public static final b a = new b(null);

    @NotNull
    private static EnumC1368a b = EnumC1368a.DONT_INITIALIZE;

    /* renamed from: com.ironsource.mediationsdk.adquality.a$a, reason: collision with other inner class name */
    public enum EnumC1368a {
        DONT_INITIALIZE(0),
        LEVELPLAY_ONLY(1),
        ALL_MEDIATIONS(2),
        OTHER_ONLY(3);


        @NotNull
        public static final C1369a b = new C1369a(null);
        private final int a;

        /* renamed from: com.ironsource.mediationsdk.adquality.a$a$a, reason: collision with other inner class name */
        public static final class C1369a {
            public /* synthetic */ C1369a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final EnumC1368a a(int i) {
                EnumC1368a enumC1368a;
                EnumC1368a[] values = EnumC1368a.values();
                int length = values.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        enumC1368a = null;
                        break;
                    }
                    enumC1368a = values[i2];
                    if (enumC1368a.b() == i) {
                        break;
                    }
                    i2++;
                }
                return enumC1368a == null ? EnumC1368a.DONT_INITIALIZE : enumC1368a;
            }

            private C1369a() {
            }
        }

        EnumC1368a(int i) {
            this.a = i;
        }

        public final int b() {
            return this.a;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final EnumC1368a a() {
            return a.b;
        }

        private b() {
        }

        public final void a(@NotNull EnumC1368a enumC1368a) {
            Intrinsics.checkNotNullParameter(enumC1368a, "<set-?>");
            a.b = enumC1368a;
        }
    }

    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC1368a.values().length];
            try {
                iArr[EnumC1368a.LEVELPLAY_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC1368a.ALL_MEDIATIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC1368a.OTHER_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public final boolean b() {
        EnumC4939ve enumC4939ve;
        JSONArray optJSONArray = new C4626e9().a().optJSONArray(O6.g0);
        if (optJSONArray == null) {
            return false;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            int i2 = optJSONArray.getInt(i);
            EnumC4939ve[] values = EnumC4939ve.values();
            int length2 = values.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    enumC4939ve = null;
                    break;
                }
                enumC4939ve = values[i3];
                if (enumC4939ve.b() == i2) {
                    break;
                }
                i3++;
            }
            if (enumC4939ve != null) {
                linkedHashSet.add(enumC4939ve);
            }
        }
        int i4 = c.a[b.ordinal()];
        if (i4 == 1) {
            return linkedHashSet.contains(EnumC4939ve.LEVEL_PLAY_INIT);
        }
        if (i4 == 2) {
            return linkedHashSet.contains(EnumC4939ve.LEVEL_PLAY_INIT) || linkedHashSet.contains(EnumC4939ve.EXTERNAL_MEDIATION_INIT);
        }
        if (i4 != 3) {
            return false;
        }
        return linkedHashSet.contains(EnumC4939ve.EXTERNAL_MEDIATION_INIT);
    }

    public final void a(int i) {
        b = EnumC1368a.b.a(i);
    }
}
