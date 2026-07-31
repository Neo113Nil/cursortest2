package yads;

import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

/* loaded from: classes13.dex */
public final class dx2 {
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(String str) {
        int i;
        int i2;
        int i3 = 0;
        String[] strArr = (String[]) StringsKt.split$default((CharSequence) "8.1.0", new String[]{"."}, false, 0, 6, (Object) null).toArray(new String[0]);
        if (strArr.length > 0) {
            String str2 = strArr[0];
            int i4 = oa.$r8$clinit;
            if (str2 != null) {
                try {
                    i = Integer.parseInt(str2);
                } catch (NumberFormatException unused) {
                }
                if (strArr.length > 1) {
                    String str3 = strArr[1];
                    int i5 = oa.$r8$clinit;
                    if (str3 != null) {
                        try {
                            i2 = Integer.parseInt(str3);
                        } catch (NumberFormatException unused2) {
                        }
                        if (strArr.length > 2) {
                            String str4 = strArr[2];
                            int i6 = oa.$r8$clinit;
                            if (str4 != null) {
                                try {
                                    i3 = Integer.parseInt(str4);
                                } catch (NumberFormatException unused3) {
                                }
                            }
                        }
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        String format = String.format(Locale.US, str, Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, 3));
                        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                        return format;
                    }
                }
                i2 = 0;
                if (strArr.length > 2) {
                }
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                String format2 = String.format(Locale.US, str, Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, 3));
                Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
                return format2;
            }
        }
        i = 0;
        if (strArr.length > 1) {
        }
        i2 = 0;
        if (strArr.length > 2) {
        }
        StringCompanionObject stringCompanionObject22 = StringCompanionObject.INSTANCE;
        String format22 = String.format(Locale.US, str, Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, 3));
        Intrinsics.checkNotNullExpressionValue(format22, "format(...)");
        return format22;
    }
}
