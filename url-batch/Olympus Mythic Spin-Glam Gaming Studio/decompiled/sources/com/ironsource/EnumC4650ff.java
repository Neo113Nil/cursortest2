package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.ff, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC4650ff {
    Off(0),
    CurrentlyLoadedAds(1),
    CurrentlyLoadedAdsAndFullHistory(2);


    @NotNull
    public static final a b = new a(null);
    private final int a;

    /* renamed from: com.ironsource.ff$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final EnumC4650ff a(int i) {
            EnumC4650ff enumC4650ff;
            EnumC4650ff[] values = EnumC4650ff.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    enumC4650ff = null;
                    break;
                }
                enumC4650ff = values[i2];
                if (enumC4650ff.a == i) {
                    break;
                }
                i2++;
            }
            return enumC4650ff == null ? EnumC4650ff.CurrentlyLoadedAds : enumC4650ff;
        }

        private a() {
        }
    }

    EnumC4650ff(int i) {
        this.a = i;
    }

    public final int b() {
        return this.a;
    }
}
