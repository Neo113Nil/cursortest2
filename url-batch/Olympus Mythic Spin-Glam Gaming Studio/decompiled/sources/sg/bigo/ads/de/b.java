package sg.bigo.ads.de;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.URLUtil;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.login.LoginLogger;
import io.bidmachine.protobuf.EventTypeExtended;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sg.bigo.ads.ai.k;
import sg.bigo.ads.bo.g;
import sg.bigo.ads.bo.h;
import sg.bigo.ads.bp.e;

/* loaded from: classes12.dex */
public final class b {

    public interface a {
        void a();

        boolean a(int i);

        void b();
    }

    private static void a(int i, String str, @NonNull sg.bigo.ads.bo.a aVar, String str2, boolean z, int i2, int i3, Map<String, String> map, boolean z2) {
        b(i, str, "start", aVar, str2, z, i2, i3, map, 0, "", z2);
    }

    public static void a(Context context, int i, String str, @NonNull sg.bigo.ads.bo.a aVar, String str2, boolean z, int i2, Map<String, String> map, a aVar2) {
        a(context, i, str, aVar, str2, z, i2, false, 0, map, aVar2);
    }

    public static void a(Context context, final int i, final String str, @NonNull final sg.bigo.ads.bo.a aVar, final String str2, final boolean z, final int i2, final boolean z2, final int i3, final Map<String, String> map, final a aVar2) {
        if (sg.bigo.ads.bw.a.s()) {
            return;
        }
        aVar.a();
        if (k.a.n().a(9) && URLUtil.isHttpUrl(aVar.a())) {
            b(i, str, LoginLogger.EVENT_EXTRAS_FAILURE, aVar, str2, z2, i3, i2, map, EventTypeExtended.EVENT_TYPE_EXTENDED_WATERFALL_STARTED_VALUE, "Invalid http url", z);
            return;
        }
        a(i, str, aVar, str2, z2, i3, i2, map, z);
        sg.bigo.ads.bs.a aVar3 = new sg.bigo.ads.bs.a(aVar, context);
        aVar3.l = e.g();
        g.a(aVar3, new sg.bigo.ads.bo.b<sg.bigo.ads.bs.a, sg.bigo.ads.bt.a>() { // from class: sg.bigo.ads.de.b.1
            private final List<Integer> l = new ArrayList();
            private int m = -1;
            private boolean n = false;

            private boolean a(@NonNull sg.bigo.ads.bs.a aVar4) {
                Iterator<Integer> it = this.l.iterator();
                while (it.hasNext()) {
                    int intValue = it.next().intValue();
                    a aVar5 = a.this;
                    if ((aVar5 != null && aVar5.a(intValue)) || super.a((AnonymousClass1) aVar4, intValue)) {
                        this.m = intValue;
                        this.n = true;
                        return true;
                    }
                }
                return false;
            }

            @Override // sg.bigo.ads.bo.b
            public final /* bridge */ /* synthetic */ sg.bigo.ads.bt.a a(@NonNull sg.bigo.ads.bt.a aVar4) {
                return aVar4;
            }

            @Override // sg.bigo.ads.bo.b
            public final /* synthetic */ void a(@NonNull sg.bigo.ads.bs.a aVar4, @Nullable String str3, int i4) {
                super.a(aVar4, str3, i4);
                this.l.add(Integer.valueOf(i4));
            }

            @Override // sg.bigo.ads.bo.b
            public final /* synthetic */ void a(@NonNull sg.bigo.ads.bs.a aVar4, @NonNull h hVar) {
                int i4;
                String str3;
                sg.bigo.ads.bo.a aVar5;
                String str4;
                boolean z3;
                int i5;
                int i6;
                Map map2;
                int i7;
                String str5;
                boolean z4;
                String str6;
                sg.bigo.ads.bs.a aVar6 = aVar4;
                if (this.n || a(aVar6)) {
                    a aVar7 = a.this;
                    if (aVar7 != null) {
                        aVar7.b();
                    }
                    i4 = i;
                    str3 = str;
                    aVar5 = aVar;
                    str4 = str2;
                    z3 = z2;
                    i5 = i3;
                    i6 = i2;
                    map2 = map;
                    i7 = this.m;
                    str5 = "Something wrong occurs when handling the request, but it is still successful";
                    z4 = z;
                    str6 = "success";
                } else {
                    hVar.getMessage();
                    a aVar8 = a.this;
                    if (aVar8 != null) {
                        aVar8.a();
                    }
                    i4 = i;
                    str3 = str;
                    aVar5 = aVar;
                    str4 = str2;
                    z3 = z2;
                    i5 = i3;
                    i6 = i2;
                    map2 = map;
                    i7 = hVar.a;
                    str5 = hVar.getMessage();
                    z4 = z;
                    str6 = LoginLogger.EVENT_EXTRAS_FAILURE;
                }
                b.b(i4, str3, str6, aVar5, str4, z3, i5, i6, map2, i7, str5, z4);
            }

            @Override // sg.bigo.ads.bo.b
            public final /* synthetic */ void a(@NonNull sg.bigo.ads.bs.a aVar4, @NonNull sg.bigo.ads.bt.a aVar5) {
                sg.bigo.ads.bt.a aVar6 = aVar5;
                a aVar7 = a.this;
                if (aVar7 != null) {
                    aVar7.b();
                }
                b.b(i, str, "success", aVar, str2, z2, i3, i2, map, aVar6.a, "success", z);
            }

            @Override // sg.bigo.ads.bo.b
            public final /* synthetic */ boolean a(@NonNull sg.bigo.ads.bs.a aVar4, int i4) {
                this.l.add(Integer.valueOf(i4));
                return a(aVar4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(int i, String str, String str2, @NonNull sg.bigo.ads.bo.a aVar, String str3, boolean z, int i2, int i3, Map<String, String> map, int i4, String str4, boolean z2) {
        HashMap hashMap;
        if (map == null) {
            map = new HashMap<>();
        }
        if (TextUtils.isEmpty(str)) {
            str = "unknown";
        }
        hashMap = new HashMap(map);
        hashMap.put("action", str);
        hashMap.put("track_url", aVar.a());
        hashMap.put("domain_front", aVar.e() ? aVar.d() : "");
        hashMap.put("track_name", str3);
        hashMap.put("states", str2);
        hashMap.put("src", z ? "1" : "0");
        hashMap.put("res_code", String.valueOf(i4));
        if (str4 == null) {
            str4 = "";
        }
        hashMap.put("res_msg", str4);
        hashMap.put("retry", String.valueOf(i2));
        hashMap.put("out_ad", String.valueOf(i3));
        hashMap.put("replace", String.valueOf(i));
        str.hashCode();
        switch (str) {
            case "va_cpn_cli":
            case "va_cli":
            case "click_track":
                if (z2) {
                    hashMap.put("auto_click_tracker", "1");
                }
                sg.bigo.ads.da.b.b(hashMap);
                break;
            case "va_cpn_imp":
            case "impl_track":
            case "va_show":
                sg.bigo.ads.da.b.a(hashMap);
                break;
        }
    }
}
