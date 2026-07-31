package com.ironsource;

import android.content.Context;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.z4, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5001z4 implements InterfaceC4968x7 {

    /* renamed from: com.ironsource.z4$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC4929v4.values().length];
            try {
                iArr[EnumC4929v4.IADS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4929v4.UADS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4929v4.SHARED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC4929v4.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    @Override // com.ironsource.InterfaceC4968x7
    @Nullable
    public B4 a(@NotNull Context context, @NotNull EnumC4929v4 source) {
        C4983y4 c4983y4;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(source, "source");
        int i = a.a[source.ordinal()];
        if (i == 1) {
            c4983y4 = new C4983y4(context, "supersonic_shared_preferen");
        } else if (i == 2) {
            c4983y4 = new C4983y4(context, "unityads-installinfo");
        } else {
            if (i != 3) {
                if (i == 4) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            c4983y4 = new C4983y4(context, A4.c);
        }
        return c4983y4;
    }
}
