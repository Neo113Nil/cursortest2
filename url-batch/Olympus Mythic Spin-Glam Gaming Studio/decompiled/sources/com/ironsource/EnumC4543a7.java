package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.a7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC4543a7 {
    SendEvent(0),
    NativeController(1);


    @NotNull
    public static final a b = new a(null);
    private final int a;

    /* renamed from: com.ironsource.a7$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final EnumC4543a7 a(int i) {
            EnumC4543a7 enumC4543a7;
            EnumC4543a7[] values = EnumC4543a7.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    enumC4543a7 = null;
                    break;
                }
                enumC4543a7 = values[i2];
                if (enumC4543a7.b() == i) {
                    break;
                }
                i2++;
            }
            return enumC4543a7 == null ? EnumC4543a7.SendEvent : enumC4543a7;
        }

        private a() {
        }
    }

    EnumC4543a7(int i) {
        this.a = i;
    }

    public final int b() {
        return this.a;
    }
}
