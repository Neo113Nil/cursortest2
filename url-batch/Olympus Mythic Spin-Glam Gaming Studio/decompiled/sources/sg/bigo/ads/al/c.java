package sg.bigo.ads.al;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsIntent;
import com.safedk.android.utils.Logger;
import sg.bigo.ads.al.a;
import sg.bigo.ads.am.a;
import sg.bigo.ads.am.b;

/* loaded from: classes14.dex */
public final class c {
    private static boolean a = true;

    public static void a(final Context context) {
        a(context, "", null, "warmup", new Runnable() { // from class: sg.bigo.ads.al.c.3
            @Override // java.lang.Runnable
            public final void run() {
                b a2 = b.a();
                Context context2 = context;
                if (context2 != null) {
                    a2.a(context2.getApplicationContext());
                }
            }
        });
    }

    static void a(final Context context, final String str, final int i, final int i2, final boolean z, final Bitmap bitmap, final a.c cVar, final a.b bVar) {
        a(context, str, bVar, "open", new Runnable() { // from class: sg.bigo.ads.al.c.2
            public static void safedk_CustomTabsIntent_launchUrl_46a735ad316dd66561bc1347435a4f91(CustomTabsIntent p0, Context p1, Uri p2) {
                Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/browser/customtabs/CustomTabsIntent;->launchUrl(Landroid/content/Context;Landroid/net/Uri;)V");
                if (p2 == null) {
                    return;
                }
                p0.launchUrl(p1, p2);
            }

            @Override // java.lang.Runnable
            public final void run() {
                Uri uri;
                final b a2 = b.a();
                Context context2 = context;
                final String str2 = str;
                int i3 = i;
                int i4 = i2;
                boolean z2 = z;
                Bitmap bitmap2 = bitmap;
                final a.c cVar2 = cVar;
                final a.b bVar2 = bVar;
                if (!TextUtils.isEmpty(str2)) {
                    a2.b.remove(str2);
                }
                Thread.currentThread().getName();
                try {
                    uri = Uri.parse(str2);
                } catch (Exception unused) {
                    uri = null;
                }
                if (uri == null) {
                    sg.bigo.ads.bn.a.a(0, "ChromeTabsStatic", "Stop open chrome tab with error url.");
                    if (bVar2 != null) {
                        bVar2.a(context2, str2, 3, "Invalid url");
                        return;
                    }
                    return;
                }
                a2.a(context2);
                a2.a.d = new CustomTabsCallback() { // from class: sg.bigo.ads.al.b.1
                    @Override // androidx.browser.customtabs.CustomTabsCallback
                    public final void onNavigationEvent(int i5, Bundle bundle) {
                        super.onNavigationEvent(i5, bundle);
                        if (cVar2 == null) {
                            return;
                        }
                        b.a(i5);
                        if (i5 == 5) {
                            cVar2.a();
                            return;
                        }
                        if (i5 == 1) {
                            cVar2.b();
                            return;
                        }
                        if (i5 == 3) {
                            cVar2.d();
                            return;
                        }
                        if (i5 == 4) {
                            cVar2.c();
                            return;
                        }
                        if (i5 == 2) {
                            cVar2.e();
                        } else if (i5 == 6) {
                            cVar2.f();
                            b.this.a.d = null;
                        }
                    }
                };
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder(a2.a.a());
                if (i3 != 0) {
                    builder.setToolbarColor(i3);
                }
                if (i4 != 0) {
                    builder.setSecondaryToolbarColor(i4);
                }
                if (bitmap2 != null) {
                    builder.setCloseButtonIcon(bitmap2);
                }
                builder.setShowTitle(z2);
                CustomTabsIntent build = builder.build();
                try {
                    Context b = sg.bigo.ads.at.b.b();
                    if (b == null) {
                        b = context2;
                    }
                    a.b bVar3 = new a.b() { // from class: sg.bigo.ads.al.b.2
                        @Override // sg.bigo.ads.am.a.b
                        public final void a(Context context3, b.a aVar) {
                            a.b bVar4 = bVar2;
                            if (bVar4 != null) {
                                bVar4.a(context3, str2, 2, aVar == null ? "" : aVar.b);
                            }
                        }

                        @Override // sg.bigo.ads.am.a.b
                        public final void a(b.a aVar) {
                            a.b bVar4 = bVar2;
                            if (bVar4 == null || aVar == null) {
                                return;
                            }
                            bVar4.a(aVar.e, aVar.d, aVar.c);
                        }
                    };
                    b.a a3 = sg.bigo.ads.am.b.a(b);
                    if (a3 != null && a3.a) {
                        build.intent.setPackage(a3.e);
                        safedk_CustomTabsIntent_launchUrl_46a735ad316dd66561bc1347435a4f91(build, b, uri);
                        bVar3.a(a3);
                        return;
                    }
                    bVar3.a(b, a3);
                } catch (Exception e) {
                    if (bVar2 != null) {
                        bVar2.a(context2, str2, 4, e.toString());
                    }
                    a2.a.d = null;
                }
            }
        });
    }

    public static void a(final Context context, final String str, final a.b bVar) {
        a(context, str, bVar, "preload", new Runnable() { // from class: sg.bigo.ads.al.c.1
            @Override // java.lang.Runnable
            public final void run() {
                b a2 = b.a();
                Context context2 = context;
                String str2 = str;
                a.b bVar2 = bVar;
                Thread.currentThread().getName();
                if (context2 == null) {
                    sg.bigo.ads.bn.a.a(0, "ChromeTabsStatic", "Preload: empty context!");
                    if (bVar2 != null) {
                        bVar2.a(context2, str2, 3, "Invalid context");
                        return;
                    }
                    return;
                }
                Context applicationContext = context2.getApplicationContext();
                if (TextUtils.isEmpty(str2)) {
                    sg.bigo.ads.bn.a.a(0, "ChromeTabsStatic", "Preload: empty url!");
                    if (bVar2 != null) {
                        bVar2.a(applicationContext, str2, 3, "Invalid url");
                        return;
                    }
                    return;
                }
                a2.b.add(str2);
                if (a2.a(applicationContext)) {
                    a2.b();
                    if (bVar2 != null) {
                        bVar2.a("", "0", "");
                        return;
                    }
                    return;
                }
                a2.b.remove(str2);
                if (bVar2 != null) {
                    bVar2.a(applicationContext, str2, 2, "Failed to make connection of Chrome service.");
                }
            }
        });
    }

    private static void a(@Nullable Context context, String str, @Nullable a.b bVar, String str2, Runnable runnable) {
        if (!a) {
            if (context == null || bVar == null) {
                return;
            }
            bVar.a(context, str, 1, "NoClassDefFoundError");
            return;
        }
        try {
            runnable.run();
        } catch (NoClassDefFoundError e) {
            a = false;
            if (context == null || bVar == null) {
                return;
            }
            bVar.a(context, str, 1, e.toString());
        } catch (Throwable th) {
            th.toString();
            if (context == null || bVar == null) {
                return;
            }
            bVar.a(context, str, 4, th.toString());
        }
    }
}
