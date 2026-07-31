package yads;

import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: classes6.dex */
public abstract class un3 {
    public static final String a;

    static {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.US;
        Intrinsics.checkNotNullExpressionValue(String.format(locale, "<script type='text/javascript'> \nfunction wrapJsFunction_%1$s() { \n  window['%1$s'] = function(%3$s) { \n      return %4$s.%1$s(%2$s, %3$s); \n  } \n} \n \nwrapJsFunction_%1$s('%1$s'); \n</script> \n", Arrays.copyOf(new Object[]{"onAdRender", "document.querySelector('#rtb').offsetHeight", "testTag", "AdPerformActionsJSI"}, 4)), "format(...)");
        String format = String.format(locale, "<script type='text/javascript'> \nfunction wrapJsFunction_%1$s() { \n  window['%1$s'] = function() { \n      return %2$s.%1$s(); \n  } \n} \n \nwrapJsFunction_%1$s('%1$s'); \n</script> \n", Arrays.copyOf(new Object[]{"getBannerInfo", "AdPerformActionsJSI"}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        a = format;
    }

    public static String a() {
        return a;
    }
}
