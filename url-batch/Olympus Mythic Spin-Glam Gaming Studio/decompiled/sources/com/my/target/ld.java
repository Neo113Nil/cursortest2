package com.my.target;

import android.graphics.Rect;
import android.net.Uri;
import android.view.View;
import com.my.target.wh;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public final class ld extends qj {
    private static boolean p = true;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private static final class a {
        public final z4 a;
        public final boolean b;

        public a(z4 z4Var, boolean z) {
            this.a = z4Var;
            this.b = z;
        }
    }

    private ld(boolean z, long j, List list, List list2, z4 z4Var) {
        super(z, j, list, list2, z4Var);
    }

    public static ld a(uh uhVar, uh uhVar2, w0 w0Var, rj rjVar) {
        List a2;
        List a3;
        boolean z;
        long j;
        a a4 = a(rjVar != null ? rjVar.c : "", w0Var);
        if (rjVar == null) {
            a2 = Collections.EMPTY_LIST;
            a3 = a2;
            z = false;
            j = 100000;
        } else {
            a2 = a(uhVar, a4.b);
            a3 = a(uhVar2, a4.b);
            z = rjVar.a;
            j = rjVar.b;
        }
        return new ld(z, j, a2, a3, a4.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float b(View view) {
        if (a(view)) {
            return 0.0f;
        }
        if (view.getLocalVisibleRect(new Rect())) {
            return (r0.bottom / view.getHeight()) * 100.0f;
        }
        return 0.0f;
    }

    private static a a(String str, w0 w0Var) {
        String str2;
        z4 z4Var;
        boolean z = false;
        final float f = 50.0f;
        try {
            if (str.contains("=")) {
                Uri parse = Uri.parse("https://my.target.com/?" + str);
                String queryParameter = parse.getQueryParameter("algorithm");
                Objects.requireNonNull(queryParameter);
                str2 = queryParameter.toLowerCase(Locale.ROOT);
                if ("point-100".equals(str2)) {
                    String queryParameter2 = parse.getQueryParameter("percent-point");
                    Objects.requireNonNull(queryParameter2);
                    f = Float.parseFloat(queryParameter2);
                }
            } else {
                str2 = str.toLowerCase(Locale.ROOT);
            }
        } catch (Throwable th) {
            String str3 = "vvtv2 config error: " + str + "\nError: " + th;
            if (p) {
                p = false;
                w0Var.c(999, 999000, str3);
            }
            str2 = "";
        }
        int hashCode = str2.hashCode();
        if (hashCode == 0) {
            str2.equals("");
        } else {
            if (hashCode != 457220915) {
                if (hashCode == 1563312180 && str2.equals("point-100")) {
                    z4Var = new z4() { // from class: com.my.target.ld$$ExternalSyntheticLambda0
                        @Override // com.my.target.z4
                        public final Object apply(Object obj) {
                            Float a2;
                            a2 = ld.a(f, (View) obj);
                            return a2;
                        }
                    };
                    z = true;
                }
            } else if (str2.equals("max-height-point")) {
                z4Var = new z4() { // from class: com.my.target.ld$$ExternalSyntheticLambda1
                    @Override // com.my.target.z4
                    public final Object apply(Object obj) {
                        float b;
                        b = ld.b((View) obj);
                        return Float.valueOf(b);
                    }
                };
                z = true;
            }
            return new a(z4Var, z);
        }
        z4Var = new z4() { // from class: com.my.target.ld$$ExternalSyntheticLambda2
            @Override // com.my.target.z4
            public final Object apply(Object obj) {
                return Float.valueOf(qi.a((View) obj));
            }
        };
        return new a(z4Var, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Float a(float f, View view) {
        return Float.valueOf(a(view, f));
    }

    private static float a(View view, float f) {
        if (a(view)) {
            return 0.0f;
        }
        int height = (int) ((f * view.getHeight()) / 100.0f);
        Rect rect = new Rect();
        return (!view.getLocalVisibleRect(rect) || rect.top > height || height > rect.bottom) ? 0.0f : 100.0f;
    }

    private static List a(uh uhVar, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (gc gcVar : uhVar.c) {
            float f = gcVar.f;
            long j = z ? 0L : (long) (gcVar.h * 1000.0f);
            final uh a2 = uhVar.a();
            a2.c.add(rh.a(gcVar.b(), gcVar.c(), false));
            arrayList.add(sj.a(f, j, f, new Runnable() { // from class: com.my.target.ld$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    wh.b(uh.this, 1, (wh.c) null);
                }
            }));
        }
        return arrayList;
    }

    private static boolean a(View view) {
        if (view != null && view.getParent() != null && view.getWindowVisibility() == 0 && view.getVisibility() == 0 && view.getAlpha() >= 0.5f) {
            int width = view.getWidth();
            if (view.getHeight() > 0 && width > 0) {
                return false;
            }
        }
        return true;
    }
}
