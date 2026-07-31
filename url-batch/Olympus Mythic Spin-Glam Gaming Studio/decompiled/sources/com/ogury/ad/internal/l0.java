package com.ogury.ad.internal;

import com.ogury.ad.OguryAdError;
import com.ogury.ad.OguryLoadErrorCode;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class l0 {
    public final /* synthetic */ o0 a;

    public l0(o0 o0Var) {
        this.a = o0Var;
    }

    public final void a(b ad, lb preCacheError, ArrayList arrayList, Long l, Long l2, String str) {
        Object obj;
        ArrayList arrayList2;
        Object obj2;
        ArrayList arrayList3 = arrayList;
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(preCacheError, "preCacheError");
        int ordinal = preCacheError.ordinal();
        String str2 = POBConstants.KEY_FORMAT;
        if (ordinal == 0) {
            u5 u5Var = this.a.e;
            nb nbVar = nb.q;
            if (arrayList3 != null) {
                arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
                int size = arrayList.size();
                obj = POBConstants.KEY_FORMAT;
                int i = 0;
                while (i < size) {
                    Object obj3 = arrayList3.get(i);
                    i++;
                    arrayList2.add(((si) obj3).a);
                    arrayList3 = arrayList;
                }
            } else {
                obj = POBConstants.KEY_FORMAT;
                arrayList2 = null;
            }
            JSONObject b = pb.b(TuplesKt.to("accomplished", arrayList2), TuplesKt.to("time_span", l2), TuplesKt.to("timeout_duration", l), TuplesKt.to("stacktrace", str));
            Pair pair = TuplesKt.to("from_ad_markup", Boolean.valueOf(ad.H));
            Pair pair2 = TuplesKt.to("reload", Boolean.valueOf(ad.J));
            b5 b5Var = ad.A.a;
            Intrinsics.checkNotNullParameter(b5Var, "<this>");
            int ordinal2 = b5Var.ordinal();
            if (ordinal2 == 0) {
                obj2 = obj;
            } else {
                if (ordinal2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                obj2 = "sdk";
            }
            Pair pair3 = TuplesKt.to("loaded_source", obj2);
            int i2 = this.a.z;
            u5Var.a(nbVar, ad, pb.a(pair, pair2, pair3, TuplesKt.to("webview_termination", i2 > 0 ? Integer.valueOf(i2) : null)), b);
            this.a.a(new OguryAdError(OguryAdError.Type.LOAD_ERROR, OguryLoadErrorCode.AD_PRECACHING_TIMEOUT, "The ad could not be loaded as precaching exceeded the time limit and timed out."));
        } else if (ordinal == 1) {
            u5 u5Var2 = this.a.e;
            nb nbVar2 = nb.t;
            JSONObject b2 = pb.b(TuplesKt.to("stacktrace", str));
            Pair pair4 = TuplesKt.to("from_ad_markup", Boolean.valueOf(ad.H));
            Pair pair5 = TuplesKt.to("reload", Boolean.valueOf(ad.J));
            b5 b5Var2 = ad.A.a;
            Intrinsics.checkNotNullParameter(b5Var2, "<this>");
            int ordinal3 = b5Var2.ordinal();
            if (ordinal3 != 0) {
                if (ordinal3 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                str2 = "sdk";
            }
            Pair pair6 = TuplesKt.to("loaded_source", str2);
            int i3 = this.a.z;
            u5Var2.a(nbVar2, ad, pb.a(pair4, pair5, pair6, TuplesKt.to("webview_termination", i3 > 0 ? Integer.valueOf(i3) : null)), b2);
            this.a.c();
        } else if (ordinal == 2) {
            u5 u5Var3 = this.a.e;
            nb nbVar3 = nb.r;
            JSONObject b3 = pb.b(TuplesKt.to("stacktrace", str));
            Pair pair7 = TuplesKt.to("from_ad_markup", Boolean.valueOf(ad.H));
            Pair pair8 = TuplesKt.to("reload", Boolean.valueOf(ad.J));
            b5 b5Var3 = ad.A.a;
            Intrinsics.checkNotNullParameter(b5Var3, "<this>");
            int ordinal4 = b5Var3.ordinal();
            if (ordinal4 != 0) {
                if (ordinal4 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                str2 = "sdk";
            }
            Pair pair9 = TuplesKt.to("loaded_source", str2);
            int i4 = this.a.z;
            u5Var3.a(nbVar3, ad, pb.a(pair7, pair8, pair9, TuplesKt.to("webview_termination", i4 > 0 ? Integer.valueOf(i4) : null)), b3);
            this.a.c();
        } else if (ordinal == 3) {
            u5 u5Var4 = this.a.e;
            nb nbVar4 = nb.u;
            JSONObject b4 = pb.b(TuplesKt.to("stacktrace", str));
            Pair pair10 = TuplesKt.to("from_ad_markup", Boolean.valueOf(ad.H));
            Pair pair11 = TuplesKt.to("reload", Boolean.valueOf(ad.J));
            b5 b5Var4 = ad.A.a;
            Intrinsics.checkNotNullParameter(b5Var4, "<this>");
            int ordinal5 = b5Var4.ordinal();
            if (ordinal5 != 0) {
                if (ordinal5 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                str2 = "sdk";
            }
            Pair pair12 = TuplesKt.to("loaded_source", str2);
            int i5 = this.a.z;
            u5Var4.a(nbVar4, ad, pb.a(pair10, pair11, pair12, TuplesKt.to("webview_termination", i5 > 0 ? Integer.valueOf(i5) : null)), b4);
            this.a.c();
        } else if (ordinal != 4) {
            u5 u5Var5 = this.a.e;
            nb nbVar5 = nb.v;
            JSONObject b5 = pb.b(TuplesKt.to("stacktrace", str));
            Pair pair13 = TuplesKt.to("from_ad_markup", Boolean.valueOf(ad.H));
            Pair pair14 = TuplesKt.to("reload", Boolean.valueOf(ad.J));
            b5 b5Var5 = ad.A.a;
            Intrinsics.checkNotNullParameter(b5Var5, "<this>");
            int ordinal6 = b5Var5.ordinal();
            if (ordinal6 != 0) {
                if (ordinal6 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                str2 = "sdk";
            }
            Pair pair15 = TuplesKt.to("loaded_source", str2);
            int i6 = this.a.z;
            u5Var5.a(nbVar5, ad, pb.a(pair13, pair14, pair15, TuplesKt.to("webview_termination", i6 > 0 ? Integer.valueOf(i6) : null)), b5);
            this.a.c();
        } else {
            this.a.b("Ad unloaded");
            this.a.c();
        }
        o0 o0Var = this.a;
        o0Var.q = false;
        o0Var.c("Failed to load (precaching failed)");
    }

    public final void a(b ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.a.b("Do not precache ad #" + ad.g);
        o0 o0Var = this.a;
        boolean z = o0Var.o;
        String str = POBConstants.KEY_FORMAT;
        if (!z) {
            u5 u5Var = o0Var.e;
            nb nbVar = nb.s;
            Pair pair = TuplesKt.to("from_ad_markup", Boolean.valueOf(ad.H));
            Pair pair2 = TuplesKt.to("reload", Boolean.valueOf(ad.J));
            b5 b5Var = ad.A.a;
            Intrinsics.checkNotNullParameter(b5Var, "<this>");
            int ordinal = b5Var.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "sdk";
            }
            Pair pair3 = TuplesKt.to("loaded_source", str);
            int i = this.a.z;
            u5Var.a(nbVar, ad, pb.a(pair, pair2, pair3, TuplesKt.to("webview_termination", i > 0 ? Integer.valueOf(i) : null)), null);
        } else {
            u5 u5Var2 = o0Var.e;
            ob obVar = ob.l;
            Pair pair4 = TuplesKt.to("from_ad_markup", Boolean.valueOf(ad.H));
            b5 b5Var2 = ad.A.a;
            Intrinsics.checkNotNullParameter(b5Var2, "<this>");
            int ordinal2 = b5Var2.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "sdk";
            }
            Pair pair5 = TuplesKt.to("loaded_source", str);
            Pair pair6 = TuplesKt.to("reload", Boolean.valueOf(ad.J));
            int i2 = this.a.z;
            u5Var2.a(obVar, ad, pb.a(pair4, pair5, pair6, TuplesKt.to("webview_termination", i2 > 0 ? Integer.valueOf(i2) : null)));
        }
        this.a.s.remove(ad);
        o0 o0Var2 = this.a;
        int size = o0Var2.s.size();
        int i3 = 0;
        while (i3 < size) {
            b bVar = (b) o0Var2.s.get(i3);
            i3++;
            bVar.getClass();
        }
    }
}
