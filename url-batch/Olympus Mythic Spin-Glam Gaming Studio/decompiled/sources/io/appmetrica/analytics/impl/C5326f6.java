package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionState;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.f6, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C5326f6 implements CounterReportApi, Parcelable {
    public static final Parcelable.Creator<C5326f6> CREATOR = new C5300e6();

    @Nullable
    protected String a;

    @Nullable
    protected String b;
    public String c;
    public int d;
    public int e;
    public Pair f;
    public int g;
    public String h;
    public long i;
    public long j;
    public Aa k;
    public G9 l;
    public Bundle m;
    public Boolean n;
    public Integer o;
    public Map p;

    public C5326f6() {
        this("", 0);
    }

    public final void a(String str, String str2) {
        if (this.f == null) {
            this.f = new Pair(str, str2);
        }
    }

    @Nullable
    public final Pair<String, String> b() {
        return this.f;
    }

    public final void c(@Nullable Bundle bundle) {
        this.m = bundle;
    }

    public final long d() {
        return this.i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long e() {
        return this.j;
    }

    @Nullable
    public final String f() {
        return this.c;
    }

    @NonNull
    public final Aa g() {
        return this.k;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getBytesTruncated() {
        return this.g;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getCustomType() {
        return this.e;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    @NonNull
    public final Map<String, byte[]> getExtras() {
        return this.p;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    @Nullable
    public final String getName() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getType() {
        return this.d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    @Nullable
    public final String getValue() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    @Nullable
    public final byte[] getValueBytes() {
        String str = this.b;
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    @Nullable
    public final Integer h() {
        return this.o;
    }

    @Nullable
    public final Bundle i() {
        return this.m;
    }

    @Nullable
    public final String j() {
        return this.h;
    }

    @Nullable
    public final G9 k() {
        return this.l;
    }

    public final boolean l() {
        return this.a == null;
    }

    public final boolean m() {
        EnumC5798xb enumC5798xb = EnumC5798xb.EVENT_TYPE_UNDEFINED;
        return -1 == this.d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setBytesTruncated(int i) {
        this.g = i;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setCustomType(int i) {
        this.e = i;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setExtras(@NonNull Map<String, byte[]> map) {
        this.p = map;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setName(@Nullable String str) {
        this.a = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setType(int i) {
        this.d = i;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setValue(@Nullable String str) {
        this.b = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setValueBytes(@Nullable byte[] bArr) {
        this.b = bArr == null ? null : new String(Base64.encode(bArr, 0));
    }

    @NonNull
    public final String toString() {
        Locale locale = Locale.US;
        String str = this.a;
        String str2 = EnumC5798xb.a(this.d).b;
        String str3 = this.b;
        if (str3 == null) {
            str3 = null;
        } else if (str3.length() > 500) {
            str3 = str3.substring(0, 500);
        }
        return String.format(locale, "[event: %s, type: %s, value: %s]", str, str2, str3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("CounterReport.Event", this.a);
        bundle.putString("CounterReport.Value", this.b);
        bundle.putInt("CounterReport.Type", this.d);
        bundle.putInt("CounterReport.CustomType", this.e);
        bundle.putInt("CounterReport.TRUNCATED", this.g);
        bundle.putString("CounterReport.ProfileID", this.h);
        bundle.putInt("CounterReport.UniquenessStatus", this.k.a);
        Bundle bundle2 = this.m;
        if (bundle2 != null) {
            bundle.putParcelable("CounterReport.Payload", bundle2);
        }
        String str = this.c;
        if (str != null) {
            bundle.putString("CounterReport.Environment", str);
        }
        Pair pair = this.f;
        if (pair != null) {
            bundle.putString("CounterReport.AppEnvironmentDiffKey", (String) pair.first);
            bundle.putString("CounterReport.AppEnvironmentDiffValue", (String) pair.second);
        }
        bundle.putLong("CounterReport.CreationElapsedRealtime", this.i);
        bundle.putLong("CounterReport.CreationTimestamp", this.j);
        G9 g9 = this.l;
        if (g9 != null) {
            bundle.putInt("CounterReport.Source", g9.a);
        }
        Boolean bool = this.n;
        if (bool != null) {
            bundle.putBoolean("CounterReport.AttributionIdChanged", bool.booleanValue());
        }
        Integer num = this.o;
        if (num != null) {
            bundle.putInt("CounterReport.OpenId", num.intValue());
        }
        bundle.putBundle("CounterReport.Extras", CollectionUtils.mapToBundle(this.p));
        parcel.writeBundle(bundle);
    }

    public C5326f6(@Nullable String str, int i) {
        this("", str, i);
    }

    @NonNull
    public static C5326f6 e(@NonNull C5326f6 c5326f6) {
        return a(c5326f6, EnumC5798xb.EVENT_TYPE_APP_UPDATE);
    }

    public final void b(@Nullable String str) {
        this.c = str;
    }

    public void c(@Nullable String str) {
        this.h = str;
    }

    @NonNull
    public final Bundle d(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putParcelable("CounterReport.Object", this);
        return bundle;
    }

    public C5326f6(@Nullable String str, @Nullable String str2, int i) {
        this.k = Aa.UNKNOWN;
        this.p = new HashMap();
        SystemTimeProvider systemTimeProvider = new SystemTimeProvider();
        this.a = str2;
        this.d = i;
        this.b = str;
        this.i = systemTimeProvider.elapsedRealtime();
        this.j = systemTimeProvider.currentTimeMillis();
    }

    public final void a(long j) {
        this.i = j;
    }

    public final void b(long j) {
        this.j = j;
    }

    @Nullable
    public final Boolean c() {
        return this.n;
    }

    @NonNull
    public static C5326f6 b(@Nullable Bundle bundle) {
        if (bundle != null) {
            try {
                C5326f6 c5326f6 = (C5326f6) bundle.getParcelable("CounterReport.Object");
                if (c5326f6 != null) {
                    return c5326f6;
                }
            } catch (Throwable unused) {
                return new C5326f6("", 0);
            }
        }
        return new C5326f6("", 0);
    }

    @NonNull
    public static C5326f6 c(@NonNull C5326f6 c5326f6) {
        return a(c5326f6, EnumC5798xb.EVENT_TYPE_INIT);
    }

    @NonNull
    public static C5326f6 d(@NonNull C5326f6 c5326f6) {
        C5326f6 c5326f62 = new C5326f6("", 0);
        c5326f62.j = c5326f6.j;
        c5326f62.i = c5326f6.i;
        c5326f62.f = c5326f6.f;
        c5326f62.c = c5326f6.c;
        c5326f62.m = c5326f6.m;
        c5326f62.p = c5326f6.p;
        c5326f62.h = c5326f6.h;
        return c5326f62;
    }

    public final void a(@NonNull Aa aa) {
        this.k = aa;
    }

    public final void a(@Nullable G9 g9) {
        this.l = g9;
    }

    public final void a(@Nullable Boolean bool) {
        this.n = bool;
    }

    public final void a(@Nullable Integer num) {
        this.o = num;
    }

    public static Pair a(Bundle bundle) {
        if (bundle.containsKey("CounterReport.AppEnvironmentDiffKey") && bundle.containsKey("CounterReport.AppEnvironmentDiffValue")) {
            return new Pair(bundle.getString("CounterReport.AppEnvironmentDiffKey"), bundle.getString("CounterReport.AppEnvironmentDiffValue"));
        }
        return null;
    }

    public static C5326f6 a(C5326f6 c5326f6, EnumC5798xb enumC5798xb) {
        C5326f6 d = d(c5326f6);
        d.d = enumC5798xb.a;
        return d;
    }

    @NonNull
    public static C5326f6 b(@NonNull C5326f6 c5326f6) {
        return a(c5326f6, EnumC5798xb.EVENT_TYPE_FIRST_ACTIVATION);
    }

    @NonNull
    public static C5326f6 a(@NonNull C5326f6 c5326f6) {
        return a(c5326f6, EnumC5798xb.EVENT_TYPE_ALIVE);
    }

    @NonNull
    public static C5326f6 a(@NonNull C5326f6 c5326f6, @NonNull C5382ha c5382ha) {
        C5326f6 a = a(c5326f6, EnumC5798xb.EVENT_TYPE_START);
        a.setValueBytes(MessageNano.toByteArray(new J9().fromModel(new I9((String) c5382ha.b.a()))));
        a.j = c5326f6.j;
        a.i = c5326f6.i;
        return a;
    }

    @NonNull
    public static C5326f6 a(@NonNull C5326f6 c5326f6, @NonNull Collection<PermissionState> collection, @Nullable K2 k2, @NonNull C5581p2 c5581p2, @NonNull List<String> list) {
        String str;
        String str2;
        C5326f6 d = d(c5326f6);
        try {
            JSONArray jSONArray = new JSONArray();
            for (PermissionState permissionState : collection) {
                jSONArray.put(new JSONObject().put("name", permissionState.name).put("granted", permissionState.granted));
            }
            JSONObject jSONObject = new JSONObject();
            if (k2 != null) {
                jSONObject.put("background_restricted", k2.b);
                J2 j2 = k2.a;
                c5581p2.getClass();
                if (j2 != null) {
                    int ordinal = j2.ordinal();
                    if (ordinal == 0) {
                        str2 = "EXEMPTED";
                    } else if (ordinal == 1) {
                        str2 = "ACTIVE";
                    } else if (ordinal == 2) {
                        str2 = "WORKING_SET";
                    } else if (ordinal == 3) {
                        str2 = "FREQUENT";
                    } else if (ordinal == 4) {
                        str2 = "RARE";
                    } else if (ordinal == 5) {
                        str2 = "RESTRICTED";
                    }
                    jSONObject.put("app_standby_bucket", str2);
                }
                str2 = null;
                jSONObject.put("app_standby_bucket", str2);
            }
            str = new JSONObject().put("permissions", jSONArray).put("background_restrictions", jSONObject).put("available_providers", new JSONArray((Collection) list)).toString();
        } catch (Throwable unused) {
            str = "";
        }
        EnumC5798xb enumC5798xb = EnumC5798xb.EVENT_TYPE_UNDEFINED;
        d.d = 12288;
        d.setValue(str);
        return d;
    }

    public C5326f6(@Nullable String str, @Nullable String str2, int i, long j) {
        this(str, str2, i);
        b(j);
    }

    @NonNull
    public static C5326f6 a(@NonNull C5326f6 c5326f6, @Nullable String str) {
        C5326f6 d = d(c5326f6);
        EnumC5798xb enumC5798xb = EnumC5798xb.EVENT_TYPE_UNDEFINED;
        d.d = 12289;
        d.setValue(str);
        return d;
    }

    @NonNull
    public static C5326f6 a() {
        C5326f6 c5326f6 = new C5326f6("", 0);
        EnumC5798xb enumC5798xb = EnumC5798xb.EVENT_TYPE_UNDEFINED;
        c5326f6.d = 16384;
        return c5326f6;
    }

    @NonNull
    public static C5326f6 a(@NonNull String str) {
        C5326f6 c5326f6 = new C5326f6("", 0);
        EnumC5798xb enumC5798xb = EnumC5798xb.EVENT_TYPE_UNDEFINED;
        c5326f6.d = 12320;
        c5326f6.b = str;
        c5326f6.l = G9.JS;
        return c5326f6;
    }
}
