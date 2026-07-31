package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.kg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC5465kg {
    public static final Map a;
    public static final SparseArray b;
    public static final Map c;
    public static final Map d;

    static {
        HashMap hashMap = new HashMap();
        EnumC5600pl enumC5600pl = EnumC5600pl.FOREGROUND;
        hashMap.put(enumC5600pl, 0);
        EnumC5600pl enumC5600pl2 = EnumC5600pl.BACKGROUND;
        hashMap.put(enumC5600pl2, 1);
        a = Collections.unmodifiableMap(hashMap);
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, enumC5600pl);
        sparseArray.put(1, enumC5600pl2);
        b = sparseArray;
        HashMap hashMap2 = new HashMap();
        EnumC5798xb enumC5798xb = EnumC5798xb.EVENT_TYPE_INIT;
        hashMap2.put(enumC5798xb, 1);
        EnumC5798xb enumC5798xb2 = EnumC5798xb.EVENT_TYPE_REGULAR;
        hashMap2.put(enumC5798xb2, 4);
        EnumC5798xb enumC5798xb3 = EnumC5798xb.EVENT_TYPE_SEND_REFERRER;
        hashMap2.put(enumC5798xb3, 5);
        EnumC5798xb enumC5798xb4 = EnumC5798xb.EVENT_TYPE_ALIVE;
        hashMap2.put(enumC5798xb4, 7);
        EnumC5798xb enumC5798xb5 = EnumC5798xb.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF;
        hashMap2.put(enumC5798xb5, 26);
        EnumC5798xb enumC5798xb6 = EnumC5798xb.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE;
        hashMap2.put(enumC5798xb6, 26);
        EnumC5798xb enumC5798xb7 = EnumC5798xb.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        hashMap2.put(enumC5798xb7, 26);
        EnumC5798xb enumC5798xb8 = EnumC5798xb.EVENT_TYPE_ANR;
        hashMap2.put(enumC5798xb8, 25);
        EnumC5798xb enumC5798xb9 = EnumC5798xb.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        hashMap2.put(enumC5798xb9, 26);
        EnumC5798xb enumC5798xb10 = EnumC5798xb.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF;
        hashMap2.put(enumC5798xb10, 26);
        EnumC5798xb enumC5798xb11 = EnumC5798xb.EVENT_TYPE_EXCEPTION_USER_PROTOBUF;
        hashMap2.put(enumC5798xb11, 27);
        EnumC5798xb enumC5798xb12 = EnumC5798xb.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF;
        hashMap2.put(enumC5798xb12, 27);
        EnumC5798xb enumC5798xb13 = EnumC5798xb.EVENT_TYPE_FIRST_ACTIVATION;
        hashMap2.put(enumC5798xb13, 13);
        EnumC5798xb enumC5798xb14 = EnumC5798xb.EVENT_TYPE_START;
        hashMap2.put(enumC5798xb14, 2);
        EnumC5798xb enumC5798xb15 = EnumC5798xb.EVENT_TYPE_APP_OPEN;
        hashMap2.put(enumC5798xb15, 16);
        EnumC5798xb enumC5798xb16 = EnumC5798xb.EVENT_TYPE_APP_UPDATE;
        hashMap2.put(enumC5798xb16, 17);
        EnumC5798xb enumC5798xb17 = EnumC5798xb.EVENT_TYPE_PERMISSIONS;
        hashMap2.put(enumC5798xb17, 18);
        EnumC5798xb enumC5798xb18 = EnumC5798xb.EVENT_TYPE_APP_FEATURES;
        hashMap2.put(enumC5798xb18, 19);
        EnumC5798xb enumC5798xb19 = EnumC5798xb.EVENT_TYPE_SEND_USER_PROFILE;
        hashMap2.put(enumC5798xb19, 20);
        EnumC5798xb enumC5798xb20 = EnumC5798xb.EVENT_TYPE_SEND_REVENUE_EVENT;
        hashMap2.put(enumC5798xb20, 21);
        EnumC5798xb enumC5798xb21 = EnumC5798xb.EVENT_TYPE_SEND_AD_REVENUE_EVENT;
        hashMap2.put(enumC5798xb21, 40);
        EnumC5798xb enumC5798xb22 = EnumC5798xb.EVENT_TYPE_SEND_ECOMMERCE_EVENT;
        hashMap2.put(enumC5798xb22, 35);
        hashMap2.put(EnumC5798xb.EVENT_TYPE_CLEANUP, 29);
        EnumC5798xb enumC5798xb23 = EnumC5798xb.EVENT_TYPE_WEBVIEW_SYNC;
        hashMap2.put(enumC5798xb23, 38);
        EnumC5798xb enumC5798xb24 = EnumC5798xb.EVENT_CLIENT_EXTERNAL_ATTRIBUTION;
        hashMap2.put(enumC5798xb24, 42);
        c = Collections.unmodifiableMap(hashMap2);
        HashMap hashMap3 = new HashMap();
        P8 p8 = new P8();
        V8 v8 = new V8(new C5226b9());
        Q8 q8 = new Q8();
        C5660s3 c5660s3 = new C5660s3(new C5226b9());
        C5396ho c5396ho = new C5396ho(new C5226b9());
        C5362gg c5362gg = new C5362gg();
        C5536n9 a2 = C5562o9.a();
        a2.b = c5362gg;
        a2.c = c5362gg;
        C5562o9 c5562o9 = new C5562o9(a2);
        C5536n9 a3 = C5562o9.a();
        a3.b = v8;
        C5562o9 c5562o92 = new C5562o9(a3);
        C5536n9 a4 = C5562o9.a();
        a4.b = c5660s3;
        C5562o9 c5562o93 = new C5562o9(a4);
        C5536n9 a5 = C5562o9.a();
        a5.b = c5396ho;
        C5562o9 c5562o94 = new C5562o9(a5);
        C5536n9 a6 = C5562o9.a();
        a6.a = p8;
        C5562o9 c5562o95 = new C5562o9(a6);
        C5536n9 a7 = C5562o9.a();
        a7.b = new Mo(new V8());
        C5562o9 c5562o96 = new C5562o9(a7);
        hashMap3.put(enumC5798xb2, c5562o92);
        C5536n9 a8 = C5562o9.a();
        a8.b = new C5413ig();
        hashMap3.put(enumC5798xb3, new C5562o9(a8));
        C5536n9 a9 = C5562o9.a();
        a9.a = p8;
        a9.b = q8;
        a9.e = new C5587p8();
        a9.f = new C5614q8();
        hashMap3.put(enumC5798xb4, new C5562o9(a9));
        hashMap3.put(enumC5798xb9, c5562o9);
        hashMap3.put(enumC5798xb10, c5562o9);
        hashMap3.put(enumC5798xb11, c5562o93);
        hashMap3.put(enumC5798xb12, c5562o93);
        hashMap3.put(enumC5798xb5, c5562o93);
        hashMap3.put(enumC5798xb6, c5562o93);
        hashMap3.put(enumC5798xb7, c5562o93);
        hashMap3.put(enumC5798xb8, c5562o93);
        C5536n9 a10 = C5562o9.a();
        a10.a = new P8();
        a10.b = c5660s3;
        hashMap3.put(enumC5798xb14, new C5562o9(a10));
        EnumC5798xb enumC5798xb25 = EnumC5798xb.EVENT_TYPE_CUSTOM_EVENT;
        C5536n9 a11 = C5562o9.a();
        a11.d = new C5439jg();
        hashMap3.put(enumC5798xb25, new C5562o9(a11));
        hashMap3.put(enumC5798xb15, c5562o92);
        hashMap3.put(enumC5798xb17, c5562o95);
        hashMap3.put(enumC5798xb18, c5562o95);
        hashMap3.put(enumC5798xb19, c5562o93);
        hashMap3.put(enumC5798xb20, c5562o93);
        hashMap3.put(enumC5798xb21, c5562o93);
        hashMap3.put(enumC5798xb22, c5562o94);
        hashMap3.put(enumC5798xb, c5562o96);
        hashMap3.put(enumC5798xb16, c5562o96);
        hashMap3.put(enumC5798xb13, c5562o92);
        hashMap3.put(enumC5798xb23, c5562o92);
        hashMap3.put(enumC5798xb24, c5562o93);
        d = Collections.unmodifiableMap(hashMap3);
    }

    public static C9 a(Long l, Long l2, Boolean bool) {
        C9 c9 = new C9();
        if (l != null) {
            c9.a = l.longValue();
            c9.b = ((GregorianCalendar) Calendar.getInstance()).getTimeZone().getOffset(l.longValue() * 1000) / 1000;
        }
        if (l2 != null) {
            c9.c = l2.longValue();
        }
        if (bool != null) {
            c9.d = bool.booleanValue();
        }
        return c9;
    }
}
