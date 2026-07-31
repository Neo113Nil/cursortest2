package com.mbridge.msdk.config.component.common.express.operator;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import java.util.List;

/* compiled from: OperatorSharePreferences.java */
/* loaded from: classes13.dex */
public class q {
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c a;

    public q(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.a = cVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        String str2;
        int i;
        char c;
        char c2;
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        if (!str.equals(com.mbridge.msdk.config.component.common.util.c.c("879"))) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        Object obj2 = "";
        String obj3 = list.get(0) != null ? list.get(0).toString() : "";
        if (list.size() >= 2) {
            Object obj4 = list.get(1);
            if (obj4 instanceof Integer) {
                i = ((Integer) obj4).intValue();
            } else {
                if (obj4 != null) {
                    try {
                        i = Integer.parseInt(obj4.toString());
                    } catch (NumberFormatException unused) {
                    }
                }
                i = 1;
            }
            if (list.size() == 3) {
                Object obj5 = list.get(2);
                if (obj5 instanceof String) {
                    str2 = String.valueOf(obj5);
                }
            }
            str2 = "STRING";
        } else {
            str2 = "STRING";
            i = 1;
        }
        if (TextUtils.isEmpty(obj3)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        if (i == 1) {
            try {
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(com.mbridge.msdk.foundation.controller.c.n().d());
                switch (str2.hashCode()) {
                    case -1838656495:
                        if (str2.equals("STRING")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 72655:
                        if (str2.equals("INT")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 2342524:
                        if (str2.equals("LONG")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 66988604:
                        if (str2.equals("FLOAT")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 782694408:
                        if (str2.equals("BOOLEAN")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                obj2 = c != 0 ? c != 1 ? c != 2 ? c != 3 ? defaultSharedPreferences.getString(obj3, "") : Boolean.valueOf(defaultSharedPreferences.getBoolean(obj3, false)) : Float.valueOf(defaultSharedPreferences.getFloat(obj3, 0.0f)) : Long.valueOf(defaultSharedPreferences.getLong(obj3, 0L)) : Integer.valueOf(defaultSharedPreferences.getInt(obj3, 0));
            } catch (Exception unused2) {
            }
        } else {
            switch (str2.hashCode()) {
                case -1838656495:
                    if (str2.equals("STRING")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 72655:
                    if (str2.equals("INT")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2342524:
                    if (str2.equals("LONG")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 66988604:
                    if (str2.equals("FLOAT")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 782694408:
                    if (str2.equals("BOOLEAN")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            obj2 = c2 != 0 ? c2 != 1 ? c2 != 2 ? c2 != 3 ? com.mbridge.msdk.config.component.common.util.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(obj3, "") : Boolean.valueOf(com.mbridge.msdk.config.component.common.util.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(obj3, false)) : Float.valueOf(com.mbridge.msdk.config.component.common.util.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(obj3, 0.0f)) : Long.valueOf(com.mbridge.msdk.config.component.common.util.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(obj3, 0L)) : Integer.valueOf(com.mbridge.msdk.config.component.common.util.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(obj3, 0));
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(obj2);
    }
}
