package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: o.ua, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2033ua implements InterfaceC2095vW {
    public final ConnectivityManager b;
    public final Context c;
    public final InterfaceC0212Ib e;
    public final InterfaceC0212Ib f;
    public final DataEncoder a = new JsonDataEncoderBuilder().configureWith(C0460Rq.u).ignoreNullValues(true).build();
    public final URL d = b(C1479m9.c);
    public final int g = 130000;

    public C2033ua(Context context, InterfaceC0212Ib interfaceC0212Ib, InterfaceC0212Ib interfaceC0212Ib2) {
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.e = interfaceC0212Ib2;
        this.f = interfaceC0212Ib;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(AbstractC1888sN.s("Invalid url: ", str), e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a7, code lost:
    
        if (((o.EnumC1748qE) o.EnumC1748qE.h.get(r0)) != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2070v7 a(C2070v7 c2070v7) {
        int type;
        int subtype;
        HashMap hashMap;
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        C1343k5 c = c2070v7.c();
        int i = Build.VERSION.SDK_INT;
        HashMap hashMap2 = (HashMap) c.m;
        if (hashMap2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap2.put("sdk-version", String.valueOf(i));
        c.b("model", Build.MODEL);
        c.b("hardware", Build.HARDWARE);
        c.b("device", Build.DEVICE);
        c.b("product", Build.PRODUCT);
        c.b("os-uild", Build.ID);
        c.b("manufacturer", Build.MANUFACTURER);
        c.b("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap hashMap3 = (HashMap) c.m;
        if (hashMap3 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap3.put("tz-offset", String.valueOf(offset));
        int i2 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = EnumC1813rE.h;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap hashMap4 = (HashMap) c.m;
        if (hashMap4 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = EnumC1748qE.h;
                subtype = 100;
            }
            hashMap = (HashMap) c.m;
            if (hashMap != null) {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            hashMap.put("mobile-subtype", String.valueOf(subtype));
            c.b("country", Locale.getDefault().getCountry());
            c.b("locale", Locale.getDefault().getLanguage());
            Context context = this.c;
            c.b("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
            try {
                i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                AbstractC0868ct.r("CctTransportBackend", "Unable to find version code for package", e);
            }
            c.b("application_build", Integer.toString(i2));
            return c.h();
        }
        SparseArray sparseArray3 = EnumC1748qE.h;
        subtype = 0;
        hashMap = (HashMap) c.m;
        if (hashMap != null) {
        }
    }
}
