package com.moloco.sdk.internal.services.proto;

import com.moloco.sdk.UserIntent;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public interface a {

    /* renamed from: com.moloco.sdk.internal.services.proto.a$a, reason: collision with other inner class name */
    public static final class C1558a {
        public static /* synthetic */ String a(a aVar, UserIntent.UserAdInteractionExt userAdInteractionExt, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeUserAdInteractionExt");
            }
            if ((i2 & 2) != 0) {
                i = 10;
            }
            return aVar.a(userAdInteractionExt, i);
        }
    }

    @NotNull
    String a(@NotNull UserIntent.UserAdInteractionExt userAdInteractionExt, int i);
}
