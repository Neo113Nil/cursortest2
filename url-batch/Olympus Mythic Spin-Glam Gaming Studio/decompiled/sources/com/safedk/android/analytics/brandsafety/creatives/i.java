package com.safedk.android.analytics.brandsafety.creatives;

/* loaded from: classes14.dex */
public class i {
    private static final String b = "VastAdTagUri";
    protected final String a;

    public i(String str) {
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return obj.equals(this.a);
        }
        String str = this.a;
        return (str == null || obj == null || !str.equals(obj.toString())) ? false : true;
    }

    public int hashCode() {
        int indexOf;
        String str = this.a;
        if (str != null && (indexOf = str.indexOf("//")) >= 0) {
            int i = indexOf + 2;
            int indexOf2 = this.a.indexOf("/", i);
            if (indexOf2 < 0) {
                indexOf2 = this.a.length();
            }
            return this.a.substring(i, indexOf2).hashCode();
        }
        return 0;
    }

    public String toString() {
        return this.a;
    }
}
