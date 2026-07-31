package com.my.target;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.facebook.ads.AdError;
import com.my.target.common.CustomParams;
import com.my.target.common.webform.UserInfo;
import com.my.target.common.webform.WebForm;
import com.my.target.common.webform.WebFormClient;
import com.my.target.common.webform.WebFormSetViewSettings;
import com.my.target.internal.api.internalnativead.ExternalNavigationRouter;
import com.my.target.internal.api.internalnativead.webform.CustomSdkUserInfoCallback;
import com.my.target.internal.api.internalnativead.webform.InternalWebFormClient;
import com.my.target.j7;
import com.my.target.l2;
import com.my.target.m2;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes5.dex */
public class n7 {
    private final l2 a;
    private final String b;
    private ExternalNavigationRouter c;
    private InternalWebFormClient d;
    private final m2 e;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private static class a implements WebFormClient {
        private final InternalWebFormClient a;

        /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
        /* renamed from: com.my.target.n7$a$a, reason: collision with other inner class name */
        class C1684a extends CustomSdkUserInfoCallback {
            final /* synthetic */ WebFormClient.CustomSdkUserInfoCallback a;

            C1684a(WebFormClient.CustomSdkUserInfoCallback customSdkUserInfoCallback) {
                this.a = customSdkUserInfoCallback;
            }

            public void onGetUserInfo(UserInfo userInfo) {
                this.a.onGetUserInfo(userInfo);
            }
        }

        a(InternalWebFormClient internalWebFormClient) {
            this.a = internalWebFormClient;
        }

        @Override // com.my.target.common.webform.WebFormClient
        public UserInfo getCustomSdkUserInfo(WebForm webForm) {
            return null;
        }

        @Override // com.my.target.common.webform.WebFormClient
        public View getErrorView(String str, WebForm webForm) {
            return this.a.getErrorView(str, webForm);
        }

        @Override // com.my.target.common.webform.WebFormClient
        public void onCopyText(String str, WebForm webForm) {
            this.a.onCopyText(str, webForm);
        }

        @Override // com.my.target.common.webform.WebFormClient
        public void onDismiss(WebForm webForm) {
            this.a.onDismiss(webForm);
        }

        @Override // com.my.target.common.webform.WebFormClient
        public void onPresent(WebForm webForm) {
            this.a.onPresent(webForm);
        }

        @Override // com.my.target.common.webform.WebFormClient
        public void setViewSettings(WebFormSetViewSettings webFormSetViewSettings, WebForm webForm) {
            this.a.setViewSettings(webForm, webFormSetViewSettings);
        }

        @Override // com.my.target.common.webform.WebFormClient
        public void getCustomSdkUserInfo(WebForm webForm, WebFormClient.CustomSdkUserInfoCallback customSdkUserInfoCallback) {
            this.a.getCustomSdkUserInfo(webForm, new C1684a(customSdkUserInfoCallback));
        }
    }

    private n7(CustomParams customParams, ExternalNavigationRouter externalNavigationRouter, InternalWebFormClient internalWebFormClient, m2 m2Var, String str) {
        this.a = l2.a(customParams, (Integer) 1);
        this.c = externalNavigationRouter;
        this.d = internalWebFormClient;
        this.e = m2Var;
        this.b = str;
    }

    public static n7 a(CustomParams customParams, ExternalNavigationRouter externalNavigationRouter, InternalWebFormClient internalWebFormClient, m2 m2Var, String str) {
        return new n7(customParams, externalNavigationRouter, internalWebFormClient, m2Var, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(String str, b bVar, int i, o2 o2Var, Context context, l2.c cVar) {
        if (a(str, bVar, o2Var, cVar)) {
            mi.b(this.b, "click was handled by external app");
        } else {
            a(str, bVar, i, o2Var, context, cVar);
            mi.b(this.b, "click was handled internally");
        }
    }

    public void a(ExternalNavigationRouter externalNavigationRouter) {
        this.c = externalNavigationRouter;
    }

    public void a(InternalWebFormClient internalWebFormClient) {
        this.d = internalWebFormClient;
    }

    public void a(final b bVar, final l2.c cVar, final int i, final o2 o2Var, final Context context) {
        String a2;
        if (bVar == null || context == null || (a2 = a(bVar, i)) == null) {
            return;
        }
        if (a(bVar, context)) {
            a(a2, bVar, i, o2Var, context, cVar);
            return;
        }
        if (a(bVar)) {
            a(a2, bVar, i, o2Var, context, cVar);
            mi.b(this.b, "click was handled internally");
        } else if (bVar.T()) {
            a(a2, bVar, i, o2Var, context, cVar);
        } else {
            this.a.a(a(a2, o2Var), bVar, new g3() { // from class: com.my.target.n7$$ExternalSyntheticLambda0
                @Override // com.my.target.g3
                public final void accept(Object obj) {
                    n7.this.a(bVar, i, o2Var, context, cVar, (String) obj);
                }
            });
        }
    }

    public void a(b bVar, o2 o2Var, m2.a aVar, Context context) {
        if (bVar == null || context == null) {
            return;
        }
        if (o2Var == null) {
            bVar.f().c(2, AdError.CLEAR_TEXT_SUPPORT_NOT_ALLOWED, "ClickHandlerV2: additionalData is null");
            return;
        }
        m2 m2Var = this.e;
        ExternalNavigationRouter externalNavigationRouter = this.c;
        InternalWebFormClient internalWebFormClient = this.d;
        m2Var.a(bVar, context, o2Var, externalNavigationRouter, internalWebFormClient != null ? new a(internalWebFormClient) : null, aVar);
    }

    private String a(String str, o2 o2Var) {
        if (o2Var == null || !o2Var.a()) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter("click_target", String.valueOf(o2Var.c()));
        return buildUpon.build().toString();
    }

    public void a(String str, b bVar, Context context, l2.c cVar) {
        if (a(str, bVar, (o2) null, cVar)) {
            mi.b(this.b, "click was handled by external app");
        } else {
            a(str, bVar, 1, (o2) null, context, cVar);
            mi.b(this.b, "click was handled internally");
        }
    }

    private String a(b bVar, int i) {
        if (i == 2 && bVar.k() != null) {
            return bVar.k();
        }
        return bVar.L();
    }

    private boolean a(b bVar) {
        j7.b c0;
        return (!(bVar instanceof j7) || (c0 = ((j7) bVar).c0()) == null || c0.g() == null) ? false : true;
    }

    private boolean a(b bVar, Context context) {
        if (!(bVar instanceof j7)) {
            return false;
        }
        String packageName = context.getPackageName();
        return Objects.equals(packageName, "ru.vk.store") || Objects.equals(packageName, "ru.vk.store.qa");
    }

    private boolean a(String str, b bVar, o2 o2Var, l2.c cVar) {
        ExternalNavigationRouter externalNavigationRouter = this.c;
        if (externalNavigationRouter == null) {
            return false;
        }
        String k = bVar.k();
        List N = bVar.N();
        String a2 = a(str, k, bVar);
        boolean navigate = externalNavigationRouter.navigate(str, N);
        if (navigate && a2 != null) {
            a(bVar, a2, o2Var, cVar);
        }
        return navigate;
    }

    private String a(String str, String str2, b bVar) {
        if (!TextUtils.isEmpty(str)) {
            if (str.equals(str2)) {
                return "ctaClick";
            }
            return "click";
        }
        if (TextUtils.isEmpty(bVar.g()) && TextUtils.isEmpty(bVar.m())) {
            return null;
        }
        return "deeplinkClick";
    }

    private void a(b bVar, String str, o2 o2Var, l2.c cVar) {
        HashMap hashMap = new HashMap();
        if (o2Var != null && o2Var.a()) {
            hashMap.put("click_target", String.valueOf(o2Var.c()));
        }
        wh.a(bVar.H(), str, hashMap, 2);
        cVar.c();
    }

    private void a(String str, b bVar, int i, o2 o2Var, Context context, l2.c cVar) {
        l2 l2Var = this.a;
        InternalWebFormClient internalWebFormClient = this.d;
        l2Var.a(bVar, str, i, o2Var, internalWebFormClient != null ? new a(internalWebFormClient) : null, cVar, context);
    }
}
