package com.ironsource.sdk.controller;

import com.ironsource.C4822p8;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes13.dex */
public interface m {

    public static final class a implements m {

        @NotNull
        private final String a;

        @Nullable
        private final String b;

        @Nullable
        private final String c;

        @Nullable
        private final String d;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@NotNull String funToCall) {
            this(funToCall, null, null, null, 14, null);
            Intrinsics.checkNotNullParameter(funToCall, "funToCall");
        }

        @Override // com.ironsource.sdk.controller.m
        @NotNull
        public String a() {
            StringBuilder sb = new StringBuilder();
            sb.append("SSA_CORE.SDKController.runFunction('" + this.a);
            String str = this.b;
            if (str != null && str.length() != 0) {
                sb.append("?parameters=" + this.b);
            }
            String str2 = this.c;
            if (str2 != null && str2.length() != 0) {
                sb.append("','" + this.c);
            }
            String str3 = this.d;
            if (str3 != null && str3.length() != 0) {
                sb.append("','" + this.d);
            }
            sb.append("');");
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@NotNull String funToCall, @Nullable String str) {
            this(funToCall, str, null, null, 12, null);
            Intrinsics.checkNotNullParameter(funToCall, "funToCall");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@NotNull String funToCall, @Nullable String str, @Nullable String str2) {
            this(funToCall, str, str2, null, 8, null);
            Intrinsics.checkNotNullParameter(funToCall, "funToCall");
        }

        public a(@NotNull String funToCall, @Nullable String str, @Nullable String str2, @Nullable String str3) {
            Intrinsics.checkNotNullParameter(funToCall, "funToCall");
            this.a = funToCall;
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        public /* synthetic */ a(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
        }
    }

    public static final class b implements m {
        private int a;

        @NotNull
        private String b;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(@NotNull m jsMethod, int i) {
            this(jsMethod.a(), i);
            Intrinsics.checkNotNullParameter(jsMethod, "jsMethod");
        }

        public b(@NotNull String script, int i) {
            Intrinsics.checkNotNullParameter(script, "script");
            this.b = script;
            this.a = i;
        }

        @Override // com.ironsource.sdk.controller.m
        @NotNull
        public String a() {
            String str = "console.log(\"JS exception: \" + JSON.stringify(e));";
            if (this.a != C4822p8.d.MODE_0.b() && (this.a < C4822p8.d.MODE_1.b() || this.a > C4822p8.d.MODE_3.b())) {
                str = "empty";
            }
            String str2 = "try{" + this.b + "}catch(e){" + str + "}";
            Intrinsics.checkNotNullExpressionValue(str2, "StringBuilder()\n        …}\")\n          .toString()");
            return str2;
        }
    }

    @NotNull
    String a();
}
