package io.bidmachine.analytics.internal.J;

import android.content.Context;
import android.content.SharedPreferences;
import io.bidmachine.analytics.internal.I.g;
import io.bidmachine.util.SharedPreferenceUtilsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class a implements b {
    private final SharedPreferences a;

    private a(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    @Override // io.bidmachine.analytics.internal.J.b
    public void a(String str, String str2) {
        SharedPreferenceUtilsKt.putStringOrRemove(this.a, b(str), str2 != null ? b(str2) : null);
    }

    @Override // io.bidmachine.analytics.internal.J.b
    public String b(String str, String str2) {
        String a;
        String optStringOrNull = SharedPreferenceUtilsKt.optStringOrNull(this.a, b(str), null);
        return (optStringOrNull == null || (a = a(optStringOrNull)) == null) ? str2 : a;
    }

    private final String a(String str) {
        try {
            return g.b(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private final String b(String str) {
        return g.d(str);
    }

    public /* synthetic */ a(Context context, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? "BidMachinePrefExt" : str, (i2 & 4) != 0 ? 0 : i);
    }

    public a(Context context, String str, int i) {
        this(context.getSharedPreferences(str, i));
    }
}
