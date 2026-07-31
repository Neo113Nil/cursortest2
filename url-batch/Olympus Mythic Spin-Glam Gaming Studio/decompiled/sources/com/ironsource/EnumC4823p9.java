package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.p9, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public enum EnumC4823p9 {
    NonBidder(1),
    Bidder(2),
    NotSupported(-1);


    @NotNull
    public static final a b = new a(null);
    private final int a;

    /* renamed from: com.ironsource.p9$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final EnumC4823p9 a(int i) {
            EnumC4823p9 enumC4823p9;
            EnumC4823p9[] values = EnumC4823p9.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    enumC4823p9 = null;
                    break;
                }
                enumC4823p9 = values[i2];
                if (enumC4823p9.a == i) {
                    break;
                }
                i2++;
            }
            return enumC4823p9 == null ? EnumC4823p9.NotSupported : enumC4823p9;
        }

        private a() {
        }
    }

    EnumC4823p9(int i) {
        this.a = i;
    }

    public final int b() {
        return this.a;
    }

    public final boolean b(@NotNull EnumC4823p9 instanceType) {
        Intrinsics.checkNotNullParameter(instanceType, "instanceType");
        return instanceType.b() == this.a;
    }
}
