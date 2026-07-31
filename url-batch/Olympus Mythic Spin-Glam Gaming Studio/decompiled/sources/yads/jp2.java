package yads;

import com.yandex.mobile.ads.common.AdTheme;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class jp2 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AdTheme.values().length];
        try {
            iArr[AdTheme.DARK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AdTheme.LIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
