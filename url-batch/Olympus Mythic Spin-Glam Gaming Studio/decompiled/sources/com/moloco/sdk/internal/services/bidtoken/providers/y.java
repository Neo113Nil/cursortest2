package com.moloco.sdk.internal.services.bidtoken.providers;

import android.content.Context;
import android.util.Base64;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes6.dex */
public final class y implements j<x> {

    @NotNull
    public static final a f = new a(null);
    public static final int g = 8;

    @NotNull
    public static final String h = "TCSignalProvider";

    @NotNull
    public static final String i;

    @NotNull
    public static final String j = "test_config";

    @NotNull
    public final Context b;

    @NotNull
    public final String c;

    @NotNull
    public final String d;

    @NotNull
    public x e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    static {
        byte[] decode = Base64.decode(new byte[]{98, 87, 57, 115, 98, 50, 78, 118, 88, 50, 82, 108, 98, 87, 57, 102, 100, 71, 86, 122, 100, 71, 108, 117, 90, 119, 61, 61, 10}, 0);
        Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
        i = StringsKt.decodeToString(decode);
    }

    public y(@NotNull Context context, @NotNull String preferencesName, @NotNull String key) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(preferencesName, "preferencesName");
        Intrinsics.checkNotNullParameter(key, "key");
        this.b = context;
        this.c = preferencesName;
        this.d = key;
        this.e = f();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public void a() {
        this.e = f();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public boolean b() {
        x f2 = f();
        boolean z = !Intrinsics.areEqual(f2, this.e);
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, h, "[CBT] TCS needsRefresh: " + z + ", current: " + f2.b() + ", cached: " + this.e.b(), false, 4, null);
        return z;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    @NotNull
    public String c() {
        return h;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    @NotNull
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public x d() {
        x xVar = this.e;
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, h, "[CBT] TCS providing: " + xVar.b(), false, 4, null);
        return xVar;
    }

    public final x f() {
        try {
            return new x(this.b.getSharedPreferences(this.c, 0).getString(this.d, null));
        } catch (Exception e) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, h, "[CBT] TCS Error", e, false, 8, null);
            return new x(null);
        }
    }

    public /* synthetic */ y(Context context, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? i : str, (i2 & 4) != 0 ? j : str2);
    }
}
