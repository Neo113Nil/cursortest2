package com.ogury.ad.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.ogury.ad.OguryAdError;
import com.ogury.ad.async.Single;
import com.ogury.ad.common.OguryMediation;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class d0 implements o9 {
    public final /* synthetic */ o0 a;

    public d0(o0 o0Var) {
        this.a = o0Var;
    }

    public final void a() {
        NetworkInfo networkInfo;
        o0 o0Var = this.a;
        b0 b0Var = o0Var.i;
        t3 t3Var = b0Var.c;
        Context context = b0Var.a;
        t3Var.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter("android.permission.ACCESS_NETWORK_STATE", "permission");
        if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
            Object systemService = context.getSystemService("connectivity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            networkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            o0Var.b("Retrieving configuration...");
            Single.INSTANCE.fromCallable(new e0(o0Var)).doOnError(new f0(o0Var)).subscribe(new g0(o0Var));
            return;
        }
        o0Var.c("Impossible to join Ogury servers. No Internet connection");
        u5 u5Var = o0Var.e;
        nb nbVar = nb.e;
        String str = o0Var.b.a;
        String str2 = o0Var.m;
        OguryMediation oguryMediation = o0Var.n;
        Pair pair = TuplesKt.to("from_ad_markup", Boolean.valueOf(o0Var.y != null));
        Pair pair2 = TuplesKt.to("reload", Boolean.valueOf(o0Var.p));
        int i = o0Var.z;
        u5Var.a(nbVar, str, str2, oguryMediation, pb.a(pair, pair2, TuplesKt.to("webview_termination", i > 0 ? Integer.valueOf(i) : null)), null, o0Var.B);
        o0Var.a(new OguryAdError(OguryAdError.Type.LOAD_ERROR, 2002, "The load could not proceed because there is no active Internet connection."));
    }

    public final void a(Throwable th) {
        this.a.c("Module setup issue");
        o0 o0Var = this.a;
        u5 u5Var = o0Var.e;
        nb nbVar = nb.k;
        String str = o0Var.b.a;
        String str2 = o0Var.m;
        OguryMediation oguryMediation = o0Var.n;
        JSONObject put = new JSONObject().put("stacktrace", th != null ? th.getMessage() : null);
        Pair pair = TuplesKt.to("from_ad_markup", Boolean.valueOf(this.a.y != null));
        Pair pair2 = TuplesKt.to("reload", Boolean.valueOf(this.a.p));
        int i = this.a.z;
        u5Var.a(nbVar, str, str2, oguryMediation, pb.a(pair, pair2, TuplesKt.to("webview_termination", i > 0 ? Integer.valueOf(i) : null)), put, this.a.B);
        this.a.a(new OguryAdError(OguryAdError.Type.LOAD_ERROR, 2001, "The load could not proceed because the SDK is not properly initialized."));
    }
}
