package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import android.net.ConnectivityManager;
import io.appmetrica.analytics.coreapi.internal.system.NetworkType;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.y7, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5820y7 {
    public final Context a;
    public final int b;
    public final Po c;
    public final S8 d;
    public final C5449k0 e;
    public final C5278d9 f;
    public final B7 g;
    public final C5326f6 h;

    public C5820y7(Context context, C5548nl c5548nl, int i, Po po, S8 s8, C5449k0 c5449k0, C5278d9 c5278d9, B7 b7) {
        this.a = context;
        this.b = i;
        this.c = po;
        this.d = s8;
        this.e = c5449k0;
        this.f = c5278d9;
        this.g = b7;
        this.h = s8.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String b() {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        En C = Ka.I.C();
        C5794x7 c5794x7 = new C5794x7(ref$ObjectRef);
        synchronized (C) {
            C.b.a(c5794x7);
        }
        return (String) ref$ObjectRef.element;
    }

    public final C5716u7 a() {
        long optLong;
        bp bpVar;
        Integer valueOf = Integer.valueOf(this.h.e);
        String name = this.h.getName();
        String value = this.h.getValue();
        Po po = this.c;
        int i = this.b;
        synchronized (po) {
            try {
                JSONObject a = po.a.a();
                JSONObject optJSONObject = a.optJSONObject("numbers_of_type");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                optLong = optJSONObject.optLong(String.valueOf(i));
                optJSONObject.put(String.valueOf(i), 1 + optLong);
                po.a.a(a.put("numbers_of_type", optJSONObject));
            } catch (Throwable th) {
                throw th;
            }
        }
        Long valueOf2 = Long.valueOf(optLong);
        B7 b7 = this.g;
        b7.getClass();
        InterfaceC5358gc m = Ka.I.m();
        Location userLocation = m.getUserLocation();
        if (userLocation != null) {
            int i2 = bp.b;
            Location location = new Location(userLocation);
            String provider = location.getProvider();
            location.setProvider("");
            bpVar = new bp(location, provider);
        } else {
            Location systemLocation = m.getSystemLocation();
            bpVar = systemLocation != null ? new bp(new Location(systemLocation), "") : null;
        }
        boolean z = b7.a.d;
        Double valueOf3 = bpVar != null ? Double.valueOf(bpVar.getLatitude()) : null;
        Double valueOf4 = bpVar != null ? Double.valueOf(bpVar.getLongitude()) : null;
        Long valueOf5 = bpVar != null ? Long.valueOf(bpVar.getTime()) : null;
        Integer valueOf6 = bpVar != null ? Integer.valueOf((int) bpVar.getAccuracy()) : null;
        Integer valueOf7 = bpVar != null ? Integer.valueOf((int) bpVar.getBearing()) : null;
        Integer valueOf8 = bpVar != null ? Integer.valueOf((int) bpVar.getSpeed()) : null;
        C5846z7 c5846z7 = new C5846z7(Boolean.valueOf(z), valueOf4, valueOf3, bpVar != null ? Integer.valueOf((int) bpVar.getAltitude()) : null, valueOf7, valueOf6, valueOf8, valueOf5, bpVar != null ? bpVar.getProvider() : null, bpVar != null ? bpVar.a : null);
        String str = this.h.c;
        C5449k0 c5449k0 = this.e;
        String str2 = c5449k0.a;
        Long valueOf9 = Long.valueOf(c5449k0.b);
        Integer valueOf10 = Integer.valueOf(this.h.g);
        Context context = this.a;
        Xe xe = AbstractC5232bf.a;
        Integer num = (Integer) AbstractC5232bf.c.a((NetworkType) SystemServiceUtils.accessSystemServiceSafelyOrDefault((ConnectivityManager) context.getSystemService("connectivity"), "getting connection type", "ConnectivityManager", NetworkType.UNDEFINED, new C5206af()));
        num.intValue();
        String b = b();
        EnumC5252c9 enumC5252c9 = this.d.b;
        C5326f6 c5326f6 = this.h;
        return new C5716u7(valueOf, name, value, valueOf2, c5846z7, str, str2, valueOf9, valueOf10, num, b, enumC5252c9, c5326f6.h, c5326f6.k, c5326f6.l, c5326f6.n, c5326f6.o, this.f.fromModel(c5326f6.p));
    }

    public /* synthetic */ C5820y7(Context context, C5548nl c5548nl, int i, Po po, S8 s8, C5804xh c5804xh, C5449k0 c5449k0) {
        this(context, c5548nl, i, po, s8, c5449k0, new C5278d9(), new B7(c5804xh));
    }
}
