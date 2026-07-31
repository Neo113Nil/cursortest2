package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class e {
    public final String a;
    public final String b;
    public int c;
    public final int d;

    /* JADX WARN: Removed duplicated region for block: B:19:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e(String str, String str2) {
        int i;
        String str3;
        int parseInt;
        this.a = str;
        this.b = str2;
        int i2 = -1;
        if (!TextUtils.isEmpty(str2) && !str2.startsWith("-")) {
            if (str2.endsWith("%") && str2.endsWith("%")) {
                try {
                    parseInt = TextUtils.isEmpty(str2) ? -1 : Integer.parseInt(str2.substring(0, str2.length() - 1));
                } catch (NumberFormatException e) {
                    IAlog.f("ProgressTrackingEvent: failed isPercentageOffsetValid with %s", e.getMessage());
                }
                if (parseInt >= 0 && parseInt <= 100) {
                    i = 1;
                    this.d = i;
                    if (i == 2 && (str3 = this.b) != null) {
                        ArrayList a = a(str3);
                        i2 = ((Integer) a.get(3)).intValue() + ((((Integer) a.get(2)).intValue() + (((Integer) a.get(1)).intValue() * 60) + (((Integer) a.get(0)).intValue() * 3600)) * 1000);
                    }
                    this.c = i2;
                }
            }
            if (str2.contains(":")) {
                ArrayList a2 = a(str2);
                if (!a2.isEmpty() && ((Integer) a2.get(0)).intValue() >= 0 && ((Integer) a2.get(1)).intValue() >= 0 && ((Integer) a2.get(2)).intValue() >= 0 && ((Integer) a2.get(3)).intValue() >= 0) {
                    i = 2;
                    this.d = i;
                    if (i == 2) {
                        ArrayList a3 = a(str3);
                        i2 = ((Integer) a3.get(3)).intValue() + ((((Integer) a3.get(2)).intValue() + (((Integer) a3.get(1)).intValue() * 60) + (((Integer) a3.get(0)).intValue() * 3600)) * 1000);
                    }
                    this.c = i2;
                }
            }
        }
        i = 0;
        this.d = i;
        if (i == 2) {
        }
        this.c = i2;
    }

    public static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        if (str == null) {
            return arrayList;
        }
        String[] split = str.split(":");
        if (split.length != 3) {
            return arrayList;
        }
        String str2 = split[0];
        String str3 = split[1];
        String[] split2 = split[2].split("\\.");
        String str4 = split2[0];
        String str5 = split2.length > 1 ? split2[1] : "000";
        try {
            arrayList.add(Integer.valueOf(Integer.parseInt(str2)));
            arrayList.add(Integer.valueOf(Integer.parseInt(str3)));
            arrayList.add(Integer.valueOf(Integer.parseInt(str4)));
            arrayList.add(Integer.valueOf(Integer.parseInt(str5)));
            return arrayList;
        } catch (NumberFormatException e) {
            IAlog.f("ProgressTrackingEvent: failed convertOffsetToTimeList with %s", e.getMessage());
            return new ArrayList();
        }
    }
}
