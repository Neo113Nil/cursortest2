package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class Q9 {
    public static final Set a;
    public static final EnumSet b;
    public static final EnumSet c;
    public static final EnumSet d;
    public static final EnumSet e;
    public static final EnumSet f;
    public static final EnumSet g;
    public static final EnumSet h;
    public static final List i;
    public static final List j;

    static {
        EnumC5798xb enumC5798xb = EnumC5798xb.EVENT_TYPE_EXCEPTION_USER_PROTOBUF;
        EnumC5798xb enumC5798xb2 = EnumC5798xb.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF;
        EnumC5798xb enumC5798xb3 = EnumC5798xb.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF;
        EnumC5798xb enumC5798xb4 = EnumC5798xb.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        EnumC5798xb enumC5798xb5 = EnumC5798xb.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE;
        EnumC5798xb enumC5798xb6 = EnumC5798xb.EVENT_TYPE_ANR;
        a = CollectionUtils.unmodifiableSetOf(5892, 5896, 5891, 5889, 5890, 5968);
        EnumC5798xb enumC5798xb7 = EnumC5798xb.EVENT_TYPE_UNDEFINED;
        EnumC5798xb enumC5798xb8 = EnumC5798xb.EVENT_TYPE_PURGE_BUFFER;
        EnumC5798xb enumC5798xb9 = EnumC5798xb.EVENT_TYPE_SEND_REFERRER;
        EnumC5798xb enumC5798xb10 = EnumC5798xb.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        EnumC5798xb enumC5798xb11 = EnumC5798xb.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        EnumC5798xb enumC5798xb12 = EnumC5798xb.EVENT_TYPE_ACTIVATION;
        EnumC5798xb enumC5798xb13 = EnumC5798xb.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        EnumC5798xb enumC5798xb14 = EnumC5798xb.EVENT_TYPE_SET_SESSION_EXTRA;
        b = EnumSet.of(enumC5798xb7, enumC5798xb8, enumC5798xb9, enumC5798xb10, enumC5798xb11, enumC5798xb12, enumC5798xb13, enumC5798xb5, enumC5798xb14);
        EnumC5798xb enumC5798xb15 = EnumC5798xb.EVENT_TYPE_UPDATE_FOREGROUND_TIME;
        EnumC5798xb enumC5798xb16 = EnumC5798xb.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF;
        c = EnumSet.of(enumC5798xb15, enumC5798xb4, enumC5798xb5, enumC5798xb13, enumC5798xb16);
        EnumC5798xb enumC5798xb17 = EnumC5798xb.EVENT_TYPE_REGULAR;
        d = EnumSet.of(enumC5798xb4, enumC5798xb5, enumC5798xb3, enumC5798xb, enumC5798xb2, enumC5798xb16, enumC5798xb13, enumC5798xb17, EnumC5798xb.EVENT_CLIENT_EXTERNAL_ATTRIBUTION, EnumC5798xb.EVENT_TYPE_SEND_ECOMMERCE_EVENT, EnumC5798xb.EVENT_TYPE_SEND_REVENUE_EVENT, EnumC5798xb.EVENT_TYPE_SEND_AD_REVENUE_EVENT, enumC5798xb8, EnumC5798xb.EVENT_TYPE_INIT, EnumC5798xb.EVENT_TYPE_SEND_USER_PROFILE, EnumC5798xb.EVENT_TYPE_SET_USER_PROFILE_ID, enumC5798xb9, enumC5798xb10, enumC5798xb11, EnumC5798xb.EVENT_TYPE_FIRST_ACTIVATION, EnumC5798xb.EVENT_TYPE_START, EnumC5798xb.EVENT_TYPE_APP_OPEN, EnumC5798xb.EVENT_TYPE_APP_UPDATE, enumC5798xb6);
        e = EnumSet.of(enumC5798xb17);
        f = EnumSet.of(enumC5798xb17);
        g = EnumSet.of(enumC5798xb13);
        h = EnumSet.of(EnumC5798xb.EVENT_TYPE_ALIVE, enumC5798xb8, enumC5798xb14, enumC5798xb5, enumC5798xb13);
        i = Arrays.asList(0, 6145, 4097, 8224);
        j = Arrays.asList(12290);
    }
}
