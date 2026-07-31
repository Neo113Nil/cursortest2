package com.inmobi.media;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.inmobi.media.core.config.models.TelemetryConfig;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.net.URISyntaxException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.t5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4357t5 {
    public static int a(Context context, String url, Eh redirectionValidator, String api, InterfaceC4466x9 interfaceC4466x9) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(redirectionValidator, "redirectionValidator");
        Intrinsics.checkNotNullParameter(api, "api");
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).c("DeeplinkHandler", "In appLinkOrDeepLinkHandled");
        }
        if (url.length() == 0) {
            if (interfaceC4466x9 == null) {
                return 2;
            }
            ((C4493y9) interfaceC4466x9).c("DeeplinkHandler", "AppLink url is Empty or null");
            return 2;
        }
        try {
            List a = F3.a(context, url);
            if (a.isEmpty()) {
                if (interfaceC4466x9 != null) {
                    ((C4493y9) interfaceC4466x9).c("DeeplinkHandler", " Resolve Info Empty");
                }
                return b(context, url, redirectionValidator, api, interfaceC4466x9);
            }
            if (interfaceC4466x9 != null) {
                ((C4493y9) interfaceC4466x9).c("DeeplinkHandler", "Resolve Info " + ((ResolveInfo) a.get(0)).activityInfo.name);
            }
            return a(context, url, (ResolveInfo) a.get(0), redirectionValidator, api, interfaceC4466x9);
        } catch (URISyntaxException unused) {
            if (interfaceC4466x9 == null) {
                return 5;
            }
            ((C4493y9) interfaceC4466x9).b("DeeplinkHandler", "URISyntaxException for url: " + url);
            return 5;
        }
    }

    public static int b(Context context, String str, Eh eh, String str2, InterfaceC4466x9 interfaceC4466x9) {
        try {
            return F3.a(context, str, eh, str2);
        } catch (ActivityNotFoundException unused) {
            return a(context, str, null, eh, str2, interfaceC4466x9);
        } catch (NullPointerException unused2) {
            return a(context, str, null, eh, str2, interfaceC4466x9);
        } catch (SecurityException unused3) {
            if (interfaceC4466x9 != null) {
                ((C4493y9) interfaceC4466x9).b("DeeplinkHandler", "SecurityException");
            }
            return 12;
        } catch (URISyntaxException unused4) {
            if (interfaceC4466x9 != null) {
                ((C4493y9) interfaceC4466x9).b("DeeplinkHandler", "uriSyntaxException");
            }
            return 5;
        } catch (Exception e) {
            if (interfaceC4466x9 != null) {
                ((C4493y9) interfaceC4466x9).b("DeeplinkHandler", "Exception: " + e);
            }
            return 9;
        }
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.i);
        p0.startActivity(p1);
    }

    public static boolean a(String url, Context context, Eh redirectionValidator, InterfaceC4466x9 interfaceC4466x9) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(redirectionValidator, "redirectionValidator");
        F5.a.getClass();
        if (!F5.t() || !redirectionValidator.a()) {
            return false;
        }
        C4277q4 c4277q4 = AbstractC4015g4.a;
        Intrinsics.checkNotNullParameter(TelemetryConfig.class, "clazz");
        if (!((TelemetryConfig) AbstractC4015g4.a.a(TelemetryConfig.class)).getLpConfig().getUniversalLinkEnabled()) {
            return false;
        }
        try {
            Uri parse = Uri.parse(url);
            Intrinsics.checkNotNullExpressionValue(parse, "Uri.parse(this)");
            Intent intent = new Intent("android.intent.action.VIEW", parse);
            Intrinsics.checkNotNullParameter(intent, "<this>");
            intent.addCategory("android.intent.category.BROWSABLE");
            Intrinsics.checkNotNullParameter(intent, "<this>");
            intent.setFlags(268436992);
            Intrinsics.checkNotNullParameter(intent, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
            if (interfaceC4466x9 == null) {
                return true;
            }
            ((C4493y9) interfaceC4466x9).a("DeeplinkHandler", "openDefaultApplication: SUCCESS");
            return true;
        } catch (ActivityNotFoundException unused) {
            if (interfaceC4466x9 != null) {
                ((C4493y9) interfaceC4466x9).b("DeeplinkHandler", "openDefaultApplication: ActivityNotFoundException");
            }
            return false;
        } catch (NullPointerException unused2) {
            if (interfaceC4466x9 != null) {
                ((C4493y9) interfaceC4466x9).b("DeeplinkHandler", "openDefaultApplication: NullPointerException");
            }
            return false;
        }
    }

    public static int a(Context context, String str, ResolveInfo resolveInfo, Eh eh, String str2, InterfaceC4466x9 interfaceC4466x9) {
        try {
            return F3.a(context, str, resolveInfo, eh, str2);
        } catch (ActivityNotFoundException unused) {
            if (interfaceC4466x9 != null) {
                ((C4493y9) interfaceC4466x9).b("DeeplinkHandler", "ActivityNotFoundException for url: " + str);
            }
            return 6;
        } catch (NullPointerException unused2) {
            if (interfaceC4466x9 != null) {
                ((C4493y9) interfaceC4466x9).b("DeeplinkHandler", "NullPointerException for url: " + str);
            }
            return 13;
        } catch (SecurityException unused3) {
            if (interfaceC4466x9 != null) {
                ((C4493y9) interfaceC4466x9).b("DeeplinkHandler", "SecurityException for url: " + str);
            }
            return 12;
        } catch (URISyntaxException unused4) {
            if (interfaceC4466x9 != null) {
                ((C4493y9) interfaceC4466x9).b("DeeplinkHandler", "URISyntaxException for url: " + str);
            }
            return 5;
        } catch (Exception e) {
            if (interfaceC4466x9 != null) {
                ((C4493y9) interfaceC4466x9).b("DeeplinkHandler", "Exception: " + e);
            }
            return 9;
        }
    }
}
