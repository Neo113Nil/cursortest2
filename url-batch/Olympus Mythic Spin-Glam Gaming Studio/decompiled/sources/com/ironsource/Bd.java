package com.ironsource;

import com.ironsource.InterfaceC4949w6;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public final class Bd {

    @NotNull
    public static final a b = new a(null);

    @NotNull
    public static final String c = "type";

    @NotNull
    public static final String d = "single";

    @NotNull
    public static final String e = "onShowSuccess";

    @NotNull
    public static final String f = "onLoadSuccess";

    @Nullable
    private final InterfaceC4949w6.c a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public Bd(@NotNull JSONObject features) {
        InterfaceC4949w6.c cVar;
        Intrinsics.checkNotNullParameter(features, "features");
        String optString = features.optString("type");
        if (optString != null) {
            int hashCode = optString.hashCode();
            if (hashCode != -1900843810) {
                if (hashCode != -999907609) {
                    if (hashCode == -902265784 && optString.equals(d)) {
                        cVar = InterfaceC4949w6.c.SINGLE;
                    }
                } else if (optString.equals(e)) {
                    cVar = InterfaceC4949w6.c.PROGRESSIVE_ON_SHOW_SUCCESS;
                }
            } else if (optString.equals(f)) {
                cVar = InterfaceC4949w6.c.PROGRESSIVE_ON_LOAD_SUCCESS;
            }
            this.a = cVar;
        }
        cVar = null;
        this.a = cVar;
    }

    @Nullable
    public final InterfaceC4949w6.c a() {
        return this.a;
    }
}
