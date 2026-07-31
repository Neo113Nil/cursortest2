package com.ogury.ad.internal;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.Logger;
import com.ogury.core.internal.SourceTag;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes4.dex */
public final class l {
    public final ci a;
    public final int b;
    public final u5 c;
    public final se d;
    public final CoroutineScope e;

    public l(u5 monitoringEventLogger) {
        le profigGateway = le.a;
        ci uniformColorRectAlgo = new ci();
        int i = Build.VERSION.SDK_INT;
        CoroutineDispatcher dispatcher = Dispatchers.getIO();
        Intrinsics.checkNotNullParameter(profigGateway, "profigGateway");
        Intrinsics.checkNotNullParameter(uniformColorRectAlgo, "uniformColorRectAlgo");
        Intrinsics.checkNotNullParameter(monitoringEventLogger, "monitoringEventLogger");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.a = uniformColorRectAlgo;
        this.b = i;
        this.c = monitoringEventLogger;
        this.d = le.b.h;
        this.e = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default(null, 1, null).plus(dispatcher));
    }

    public final void a(b ad, y7 webview) {
        ve veVar;
        Job launch$default;
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(webview, "webview");
        Logger logger = Logger.INSTANCE;
        LogTag logTag = LogTag.QUALITY;
        SourceTag sourceTag = SourceTag.ADS;
        logger.w(logTag, sourceTag, "Running this ad quality config : " + this.d);
        af afVar = this.d.a;
        if (!afVar.a) {
            logger.w(logTag, sourceTag, "Blank ad detection is disabled");
            return;
        }
        if (this.b >= 26) {
            List list = afVar.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((we) obj).a == ye.c) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                we weVar = (we) arrayList.get(i);
                List list2 = weVar.c;
                int ordinal = ad.x.ordinal();
                if (ordinal == 0) {
                    veVar = ve.c;
                } else if (ordinal == 1) {
                    veVar = ve.d;
                } else if (ordinal == 2) {
                    veVar = ve.e;
                } else {
                    if (ordinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hh hhVar = ad.y.b;
                    veVar = (hhVar != null && hhVar.a == 300 && hhVar.b == 250) ? ve.g : ve.f;
                }
                if (list2.contains(veVar)) {
                    launch$default = BuildersKt__Builders_commonKt.launch$default(this.e, null, null, new k(this, ad, webview, weVar, null), 3, null);
                    ConcurrentHashMap concurrentHashMap = i.a;
                    i.a(ad.b, launch$default);
                }
                i = i2;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:0|1|(2:3|(13:5|6|7|(1:(1:(8:11|12|13|14|15|16|17|18)(2:29|30))(1:31))(3:59|(1:61)|48)|32|33|(1:35)(1:53)|(3:46|(6:49|14|15|16|17|18)|48)|51|52|16|17|18))|62|6|7|(0)(0)|32|33|(0)(0)|(7:37|39|41|43|46|(0)|48)|51|52|16|17|18|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0091, code lost:
    
        r14 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0142, code lost:
    
        r9 = r12;
        r12 = r11;
        r11 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x008e, code lost:
    
        r12 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0089 A[Catch: all -> 0x008e, Exception -> 0x0091, TryCatch #4 {Exception -> 0x0091, all -> 0x008e, blocks: (B:33:0x0079, B:35:0x0089, B:37:0x0097, B:39:0x009d, B:41:0x00a3, B:43:0x00a9, B:46:0x00b0, B:52:0x00e6), top: B:32:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r12v14, types: [android.webkit.WebView] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(b bVar, y7 y7Var, we weVar, ContinuationImpl continuationImpl) {
        j jVar;
        j jVar2;
        Object obj;
        Object coroutine_suspended;
        int i;
        ze zeVar;
        y7 y7Var2;
        we weVar2;
        l lVar;
        b bVar2;
        we weVar3;
        Window window;
        if (continuationImpl instanceof j) {
            jVar = (j) continuationImpl;
            int i2 = jVar.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.h = i2 - Integer.MIN_VALUE;
                jVar2 = jVar;
                obj = jVar2.f;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = jVar2.h;
                boolean z = true;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    zeVar = weVar.b;
                    long j = zeVar.c;
                    jVar2.a = this;
                    jVar2.b = bVar;
                    jVar2.c = y7Var;
                    jVar2.d = weVar;
                    jVar2.e = zeVar;
                    jVar2.h = 1;
                    if (DelayKt.delay(j, jVar2) != coroutine_suspended) {
                        y7Var2 = y7Var;
                        weVar2 = weVar;
                        lVar = this;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    weVar3 = (we) jVar2.c;
                    bVar2 = jVar2.b;
                    lVar = jVar2.a;
                    try {
                        try {
                            ResultKt.throwOnFailure(obj);
                            lVar.a(bVar2, weVar3, (t1) obj);
                            bVar = bVar2;
                            ConcurrentHashMap concurrentHashMap = i.a;
                            i.b(bVar.b);
                        } catch (Exception e) {
                            e = e;
                            String str = "Exception during ad quality check: " + e.getMessage();
                            Logger.INSTANCE.e(LogTag.QUALITY, SourceTag.ADS, str, e);
                            lVar.a(bVar2, weVar3, new r1(106, str));
                            ConcurrentHashMap concurrentHashMap2 = i.a;
                            i.b(bVar2.b);
                            return Unit.INSTANCE;
                        }
                        return Unit.INSTANCE;
                    } catch (Throwable th) {
                        b bVar3 = bVar2;
                        th = th;
                        bVar = bVar3;
                        ConcurrentHashMap concurrentHashMap3 = i.a;
                        i.b(bVar.b);
                        throw th;
                    }
                }
                ze zeVar2 = jVar2.e;
                we weVar4 = jVar2.d;
                ?? r12 = (WebView) jVar2.c;
                b bVar4 = jVar2.b;
                l lVar2 = jVar2.a;
                ResultKt.throwOnFailure(obj);
                zeVar = zeVar2;
                bVar = bVar4;
                y7Var2 = r12;
                weVar2 = weVar4;
                lVar = lVar2;
                View rootView = y7Var2.getRootView();
                Intrinsics.checkNotNullExpressionValue(rootView, "getRootView(...)");
                Activity a = ii.a(rootView);
                window = a == null ? a.getWindow() : null;
                if (window != null && y7Var2.isShown() && y7Var2.isAttachedToWindow() && y7Var2.getWidth() != 0 && y7Var2.getHeight() != 0) {
                    ci ciVar = lVar.a;
                    int a2 = ib.a(zeVar.b);
                    int a3 = ib.a(zeVar.a);
                    int i3 = zeVar.d;
                    jVar2.a = lVar;
                    jVar2.b = bVar;
                    jVar2.c = weVar2;
                    jVar2.d = null;
                    jVar2.e = null;
                    jVar2.h = 2;
                    obj = ciVar.a(bVar, y7Var2, a2, a3, i3, jVar2);
                    if (obj != coroutine_suspended) {
                        we weVar5 = weVar2;
                        bVar2 = bVar;
                        weVar3 = weVar5;
                        lVar.a(bVar2, weVar3, (t1) obj);
                        bVar = bVar2;
                        ConcurrentHashMap concurrentHashMap4 = i.a;
                        i.b(bVar.b);
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
                z = false;
                String str2 = "WebView is not in a valid state for capturing. isWindowNull : " + z + ", isShown : " + y7Var2.isShown() + ", isAttachedToWindow : " + y7Var2.isAttachedToWindow() + ", width : " + y7Var2.getWidth() + ", height : " + y7Var2.getHeight();
                Logger.INSTANCE.w(LogTag.QUALITY, SourceTag.ADS, str2);
                lVar.a(bVar, weVar2, new r1(102, str2));
                ConcurrentHashMap concurrentHashMap42 = i.a;
                i.b(bVar.b);
                return Unit.INSTANCE;
            }
        }
        jVar = new j(this, continuationImpl);
        jVar2 = jVar;
        obj = jVar2.f;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = jVar2.h;
        boolean z2 = true;
        if (i != 0) {
        }
        View rootView2 = y7Var2.getRootView();
        Intrinsics.checkNotNullExpressionValue(rootView2, "getRootView(...)");
        Activity a4 = ii.a(rootView2);
        if (a4 == null) {
        }
        if (window != null) {
            ci ciVar2 = lVar.a;
            int a22 = ib.a(zeVar.b);
            int a32 = ib.a(zeVar.a);
            int i32 = zeVar.d;
            jVar2.a = lVar;
            jVar2.b = bVar;
            jVar2.c = weVar2;
            jVar2.d = null;
            jVar2.e = null;
            jVar2.h = 2;
            obj = ciVar2.a(bVar, y7Var2, a22, a32, i32, jVar2);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        z2 = false;
        String str22 = "WebView is not in a valid state for capturing. isWindowNull : " + z2 + ", isShown : " + y7Var2.isShown() + ", isAttachedToWindow : " + y7Var2.isAttachedToWindow() + ", width : " + y7Var2.getWidth() + ", height : " + y7Var2.getHeight();
        Logger.INSTANCE.w(LogTag.QUALITY, SourceTag.ADS, str22);
        lVar.a(bVar, weVar2, new r1(102, str22));
        ConcurrentHashMap concurrentHashMap422 = i.a;
        i.b(bVar.b);
        return Unit.INSTANCE;
    }

    public final void a(b bVar, we weVar, t1 t1Var) {
        Object obj;
        ze zeVar = weVar.b;
        Pair pair = TuplesKt.to("from_ad_markup", Boolean.valueOf(bVar.H));
        b5 b5Var = bVar.A.a;
        Intrinsics.checkNotNullParameter(b5Var, "<this>");
        int ordinal = b5Var.ordinal();
        String str = POBConstants.KEY_FORMAT;
        if (ordinal == 0) {
            obj = POBConstants.KEY_FORMAT;
        } else {
            if (ordinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            obj = "sdk";
        }
        Pair pair2 = TuplesKt.to("loaded_source", obj);
        Pair pair3 = TuplesKt.to("reload", Boolean.valueOf(bVar.J));
        o3 o3Var = bVar.z.b;
        int i = o3Var == null ? -1 : p3.a[o3Var.ordinal()];
        if (i == -1) {
            str = "";
        } else if (i == 1) {
            str = "sdk";
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        Pair pair4 = TuplesKt.to("impression_source", str);
        int i2 = bVar.K;
        List mutableListOf = CollectionsKt.mutableListOf(pair, pair2, pair3, pair4, TuplesKt.to("webview_termination", i2 > 0 ? Integer.valueOf(i2) : null), TuplesKt.to("algo", weVar.a.a), TuplesKt.to("params", zeVar.a + VastAttributes.HORIZONTAL_POSITION + zeVar.b + ";" + zeVar.c + ";" + zeVar.d));
        if (t1Var instanceof s1) {
            s1 s1Var = (s1) t1Var;
            mutableListOf.add(TuplesKt.to("is_blank", Boolean.valueOf(s1Var.a)));
            mutableListOf.add(TuplesKt.to("color_ref", s1Var.b));
            mutableListOf.add(TuplesKt.to("deviance", Integer.valueOf(s1Var.c)));
            mutableListOf.add(TuplesKt.to(IronSourceConstants.EVENTS_DURATION, Long.valueOf(s1Var.d)));
        } else if (t1Var instanceof r1) {
            r1 r1Var = (r1) t1Var;
            mutableListOf.add(TuplesKt.to("error_code", Integer.valueOf(r1Var.a)));
            mutableListOf.add(TuplesKt.to("error_message", r1Var.b));
        }
        u5 u5Var = this.c;
        ob obVar = ob.G;
        Pair[] pairArr = (Pair[]) mutableListOf.toArray(new Pair[0]);
        u5Var.a(obVar, bVar, pb.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
    }
}
