package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.devanos.nilufar.usmonova.R;
import java.util.Locale;

/* renamed from: o.o20, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1604o20 {
    public static final GR a = new GR(0);
    public static Locale b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = Z10.a(context).a;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context, int i) {
        Resources resources = context.getResources();
        String a2 = a(context);
        if (i == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, a2);
        }
        if (i == 2) {
            return EB.B(context) ? resources.getString(R.string.common_google_play_services_wear_update_text) : resources.getString(R.string.common_google_play_services_update_text, a2);
        }
        if (i == 3) {
            return resources.getString(R.string.common_google_play_services_enable_text, a2);
        }
        if (i == 5) {
            return d(context, "common_google_play_services_invalid_account_text", a2);
        }
        if (i == 7) {
            return d(context, "common_google_play_services_network_error_text", a2);
        }
        if (i == 9) {
            return resources.getString(R.string.common_google_play_services_unsupported_text, a2);
        }
        if (i == 20) {
            return d(context, "common_google_play_services_restricted_profile_text", a2);
        }
        switch (i) {
            case 16:
                return d(context, "common_google_play_services_api_unavailable_text", a2);
            case 17:
                return d(context, "common_google_play_services_sign_in_failed_text", a2);
            case 18:
                return resources.getString(R.string.common_google_play_services_updating_text, a2);
            default:
                return resources.getString(R.string.common_google_play_services_unknown_issue, a2);
        }
    }

    public static String c(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            case 18:
                return null;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return e(context, "common_google_play_services_invalid_account_title");
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return e(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i);
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return e(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return e(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String d(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String e = e(context, str);
        if (e == null) {
            e = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, e, str2);
    }

    public static String e(Context context, String str) {
        Resources resources;
        GR gr = a;
        synchronized (gr) {
            try {
                Locale locale = AbstractC0110Ed.a(context.getResources().getConfiguration()).get(0);
                if (!locale.equals(b)) {
                    gr.clear();
                    b = locale;
                }
                String str2 = (String) gr.get(str);
                if (str2 != null) {
                    return str2;
                }
                int i = AbstractC0434Qq.c;
                try {
                    resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resources = null;
                }
                if (resources != null) {
                    int identifier = resources.getIdentifier(str, "string", "com.google.android.gms");
                    if (identifier == 0) {
                        Log.w("GoogleApiAvailability", "Missing resource: ".concat(str));
                    } else {
                        String string = resources.getString(identifier);
                        if (!TextUtils.isEmpty(string)) {
                            a.put(str, string);
                            return string;
                        }
                        Log.w("GoogleApiAvailability", "Got empty resource: ".concat(str));
                    }
                }
                return null;
            } finally {
            }
        }
    }
}
