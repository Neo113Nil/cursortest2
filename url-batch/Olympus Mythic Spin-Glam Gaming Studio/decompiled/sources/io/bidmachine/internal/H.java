package io.bidmachine.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import io.bidmachine.util.SharedPreferenceUtilsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes12.dex */
public final class H implements G {
    public static final a b = new a(null);
    private final SharedPreferences a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final G a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            Intrinsics.checkNotNullExpressionValue(defaultSharedPreferences, "getDefaultSharedPreferences(context)");
            return new H(defaultSharedPreferences);
        }

        private a() {
        }
    }

    public H(SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        this.a = sharedPreferences;
    }

    public static final G a(Context context) {
        return b.a(context);
    }

    @Override // io.bidmachine.internal.G
    public Boolean b() {
        Integer optIntOrNull = SharedPreferenceUtilsKt.optIntOrNull(this.a, POBConstants.DEFAULT_SHARED_PREFERENCE_GDPR_STATE_KEY, null);
        if (optIntOrNull == null) {
            return null;
        }
        int intValue = optIntOrNull.intValue();
        if (intValue != 0 && intValue != 1) {
            optIntOrNull = null;
        }
        if (optIntOrNull != null) {
            return Boolean.valueOf(optIntOrNull.intValue() == 1);
        }
        return null;
    }

    @Override // io.bidmachine.internal.G
    public List c() {
        String optStringOrNull$default = SharedPreferenceUtilsKt.optStringOrNull$default(this.a, "IABGPP_GppSID", null, 2, null);
        List split$default = optStringOrNull$default != null ? StringsKt.split$default((CharSequence) optStringOrNull$default, new String[]{"_"}, false, 0, 6, (Object) null) : null;
        if (split$default == null || split$default.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = split$default.iterator();
        while (it.hasNext()) {
            Integer intOrNull = StringsKt.toIntOrNull((String) it.next());
            if (intOrNull != null) {
                arrayList.add(intOrNull);
            }
        }
        return arrayList;
    }

    @Override // io.bidmachine.internal.G
    public String d() {
        return SharedPreferenceUtilsKt.optStringOrNull$default(this.a, "IABUSPrivacy_String", null, 2, null);
    }

    @Override // io.bidmachine.internal.G
    public Boolean e() {
        String optStringOrNull$default = SharedPreferenceUtilsKt.optStringOrNull$default(this.a, "IABConsent_SubjectToGDPR", null, 2, null);
        if (optStringOrNull$default != null) {
            return Boolean.valueOf(Intrinsics.areEqual(optStringOrNull$default, "1"));
        }
        return null;
    }

    @Override // io.bidmachine.internal.G
    public String f() {
        return SharedPreferenceUtilsKt.optStringOrNull$default(this.a, "IABTCF_TCString", null, 2, null);
    }

    @Override // io.bidmachine.internal.G
    public String g() {
        return SharedPreferenceUtilsKt.optStringOrNull$default(this.a, "IABConsent_ConsentString", null, 2, null);
    }

    @Override // io.bidmachine.internal.G
    public String a() {
        return SharedPreferenceUtilsKt.optStringOrNull$default(this.a, "IABGPP_HDR_GppString", null, 2, null);
    }
}
