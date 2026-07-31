package yads;

import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: classes5.dex */
public abstract class e8 {
    public static final d4 a = a(1, "Received unsupported ad type", "Received unsupported ad type. We are already working on this issue.");
    public static final d4 b = a(1, "Internal state wasn't completely configured", "Internal state wasn't completely configured. Please try again later.");
    public static final d4 c = a(1, "Incorrect data in server response", "Failed to parse server's response. We are already working on this issue.");
    public static final d4 d = a(1, "Invalid server response code", "Unexpected server response code. We are already working on this issue.");
    public static final d4 e = a(1, "Service temporarily unavailable", "Service temporarily unavailable. Please try again later.");
    public static final d4 f = a(1, "Invalid SDK state.", "Invalid SDK state.");
    public static final d4 g = a(1, "Invalid SDK state.", "Invalid SDK state.");
    public static final d4 h = a(4, "Ad request completed successfully, but there are no ads available.", "Ad request completed successfully, but there are no ads available.");
    public static final d4 i = a(2, "Ad request configured incorrectly", "Ad request configured incorrectly");
    public static final d4 j = a(2, "Invalid request parameters", "Invalid request parameters");
    public static final d4 k = a(2, "Invalid ad type in response", "Invalid ad type in response");
    public static final d4 l = a(2, "Invalid Ad Unit Id. AdUnitId should be not empty string", "Invalid AdUnitId. Please set the AdUnitId using the setAdUnitId method. AdUnitId is a unique identifier in R-M-XXXXXX-Y format, which is assigned in the Partner Interface.");
    public static final d4 m = a(2, "Invalid ad size. Please, specify AdSize excplicitly", "Invalid ad size. Set the ad size using the 'setAdSize' method.");
    public static final d4 n = a(1, "Invalid sdk configuration. Please request another ad.", "Invalid sdk configuration. Please request another ad.");
    public static final d4 o = a(5, "Device hasn't enough free memory.", "Device has not enough free memory.");
    public static final d4 p = a(2, "Feed ad preloading has already started", "Feed ad preloading was already started. You should use preloadAd method only once");
    public static final d4 q = a(3, "Ad request failed with network error", "Ad request failed with network error. Please try again later.");
    public static final d4 r = a(3, "Ad request failed with no connection error", "Ad request failed with network error. Please try again later.");
    public static final d4 s = a(3, "Ad request failed with timeout error", "Ad request failed with network error. Please try again later.");
    public static final d4 t = a(3, "Ad request failed with auth failure", "Ad request failed with network error. Please try again later.");
    public static final d4 u = a(3, "Ad request failed with client error", "Ad request failed with network error. Please try again later.");
    public static final d4 v = a(3, "Ad request failed with parse error", "Failed to parse server response. Please try again later.");
    public static final d4 w = a(1, "Ad request failed with content preloading error", "Ad request failed with content preloading error. Please try again later");

    public static d4 a(String str) {
        String str2;
        String str3;
        if (str == null || str.length() == 0) {
            str2 = "Invalid AdUnitId. Please set the AdUnitId using the setAdUnitId method. AdUnitId is a unique identifier in R-M-XXXXXX-Y format, which is assigned in the Partner Interface.";
            str3 = "Invalid Ad Unit Id. AdUnitId should be not empty string";
        } else {
            str2 = "Provided AdUnitId '%s' does not exist! Please set the AdUnitId using the setAdUnitId method. AdUnitId is a unique identifier in R-M-XXXXXX-Y format, which is assigned in the Partner Interface.";
            str3 = "Provided ad unit id doesn't exist";
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, str2, Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return a(2, str3, format);
    }

    public static d4 a(int i2, int i3, int i4, int i5, int i6, int i7) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "Ad was loaded successfully, but there is not enough space to display it. Requested size: [%dx%d], Received size : [%dx%d], device screen size: [%dx%d].", Arrays.copyOf(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7)}, 6));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return a(1, "Ad was loaded successfully, but there is not enough space to display it", format);
    }

    public static d4 a(int i2, String str, String str2) {
        return new d4(i2, str, str2, null);
    }
}
