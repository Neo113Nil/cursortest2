package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.l9, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public enum EnumC4751l9 {
    APP_ACTIVITY(0),
    DIRECT_INTENT(1);


    @NotNull
    public static final a b = new a(null);
    private final int a;

    /* renamed from: com.ironsource.l9$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final EnumC4751l9 a(int i) {
            EnumC4751l9 enumC4751l9;
            EnumC4751l9[] values = EnumC4751l9.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    enumC4751l9 = null;
                    break;
                }
                enumC4751l9 = values[i2];
                if (enumC4751l9.b() == i) {
                    break;
                }
                i2++;
            }
            return enumC4751l9 == null ? EnumC4751l9.APP_ACTIVITY : enumC4751l9;
        }

        private a() {
        }
    }

    EnumC4751l9(int i) {
        this.a = i;
    }

    public final int b() {
        return this.a;
    }
}
