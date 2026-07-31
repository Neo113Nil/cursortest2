package com.inmobi.media;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;

/* loaded from: classes11.dex */
public final class Nm extends AbstractC4223o2 {
    public final CoroutineScope b;
    public final Om c;
    public final MutableSharedFlow d;
    public final C4493y9 e;
    public final ArrayList f;
    public final ArrayList g;
    public InterfaceC4311rc h;
    public S3 i;
    public ViewGroup j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Nm(Context context, CoroutineScope coroutineScope, Om videoExperienceModel, MutableSharedFlow mediaEventFlow, C4493y9 c4493y9) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(videoExperienceModel, "videoExperienceModel");
        Intrinsics.checkNotNullParameter(mediaEventFlow, "mediaEventFlow");
        this.b = coroutineScope;
        this.c = videoExperienceModel;
        this.d = mediaEventFlow;
        this.e = c4493y9;
        this.f = new ArrayList();
        this.g = new ArrayList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0081, code lost:
    
        if (b(r0) != r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.inmobi.media.AbstractC4223o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        Am am;
        int i;
        Nm nm;
        if (continuationImpl instanceof Am) {
            am = (Am) continuationImpl;
            int i2 = am.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                am.d = i2 - Integer.MIN_VALUE;
                Object obj = am.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = am.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    C4493y9 c4493y9 = this.e;
                    if (c4493y9 != null) {
                        c4493y9.a("VideoExperienceManager", "load Called - mediaFiles count: " + this.c.c.size());
                    }
                    MainCoroutineDispatcher main = Dispatchers.getMain();
                    Bm bm = new Bm(this, null);
                    am.a = this;
                    am.d = 1;
                    obj = BuildersKt.withContext(main, bm, am);
                    if (obj != coroutine_suspended) {
                        nm = this;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                nm = am.a;
                ResultKt.throwOnFailure(obj);
                nm.h = (InterfaceC4311rc) obj;
                am.a = null;
                am.d = 2;
            }
        }
        am = new Am(this, continuationImpl);
        Object obj2 = am.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = am.d;
        if (i != 0) {
        }
        nm.h = (InterfaceC4311rc) obj2;
        am.a = null;
        am.d = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x009a, code lost:
    
        if (r12 == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b4 A[LOOP:0: B:21:0x00ae->B:23:0x00b4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        Cm cm;
        Object obj;
        Object coroutine_suspended;
        int i;
        Iterator it;
        InterfaceC4311rc interfaceC4311rc;
        Nm nm;
        C4493y9 c4493y9;
        if (continuationImpl instanceof Cm) {
            cm = (Cm) continuationImpl;
            int i2 = cm.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cm.d = i2 - Integer.MIN_VALUE;
                obj = cm.b;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cm.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    C4493y9 c4493y92 = this.e;
                    if (c4493y92 != null) {
                        c4493y92.a("VideoExperienceManager", "loadVideoExperience - getting sorted media files");
                    }
                    cm.d = 1;
                    ArrayList mediaFiles = this.c.c;
                    Intrinsics.checkNotNullParameter(mediaFiles, "mediaFiles");
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = mediaFiles.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        Ol ol = (Ol) next;
                        if (URLUtil.isHttpUrl(ol.c) || URLUtil.isHttpsUrl(ol.c)) {
                            arrayList.add(next);
                        }
                    }
                    obj = CoroutineScopeKt.coroutineScope(new Um(arrayList, AbstractC4085im.a(this.c.a) / 1000, this.c.d, null), cm);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        nm = cm.a;
                        ResultKt.throwOnFailure(obj);
                        nm.j = (ViewGroup) obj;
                        c4493y9 = this.e;
                        if (c4493y9 != null) {
                            c4493y9.a("VideoExperienceManager", "Video Experience Load Success");
                        }
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                List list = (List) obj;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((Ol) it.next()).c);
                }
                interfaceC4311rc = this.h;
                if (interfaceC4311rc == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mediaPlayer");
                    interfaceC4311rc = null;
                }
                cm.a = this;
                cm.d = 2;
                obj = ((C4025ge) interfaceC4311rc).a(arrayList2, cm);
                if (obj != coroutine_suspended) {
                    nm = this;
                    nm.j = (ViewGroup) obj;
                    c4493y9 = this.e;
                    if (c4493y9 != null) {
                    }
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
        }
        cm = new Cm(this, continuationImpl);
        obj = cm.b;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cm.d;
        if (i != 0) {
        }
        List list2 = (List) obj;
        ArrayList arrayList22 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        it = list2.iterator();
        while (it.hasNext()) {
        }
        interfaceC4311rc = this.h;
        if (interfaceC4311rc == null) {
        }
        cm.a = this;
        cm.d = 2;
        obj = ((C4025ge) interfaceC4311rc).a(arrayList22, cm);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        r0 = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(r8.b, null, null, new com.inmobi.media.Em(r0, null, r8), 3, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        Job launch$default;
        C4493y9 c4493y9 = this.e;
        if (c4493y9 != null) {
            c4493y9.a("VideoExperienceManager", "observeCompanionAdEvents - setting up companion ad event observers");
        }
        if (this.c.b.isEmpty()) {
            return;
        }
        C4493y9 c4493y92 = this.e;
        if (c4493y92 != null) {
            c4493y92.a("VideoExperienceManager", "observeCompanionAdEvents - collecting companion ad events");
        }
        S3 s3 = this.i;
        if (s3 != null && (r0 = s3.d) != null && launch$default != null) {
            ArrayList activeJobs = this.f;
            Intrinsics.checkNotNullParameter(launch$default, "<this>");
            Intrinsics.checkNotNullParameter(activeJobs, "activeJobs");
            activeJobs.add(launch$default);
        }
        C4493y9 c4493y93 = this.e;
        if (c4493y93 != null) {
            c4493y93.a("VideoExperienceManager", "observeCompanionAdEvents - companion ad event observer setup complete");
        }
    }

    @Override // com.inmobi.media.AbstractC4223o2
    public final Object a(FrameLayout frameLayout, C4470xc c4470xc) {
        Object withContext = BuildersKt.withContext(Dispatchers.getMain(), new C4532zm(this, frameLayout, null), c4470xc);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    @Override // com.inmobi.media.AbstractC4223o2
    public final void a(MutableStateFlow windowFlow) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(windowFlow, "windowFlow");
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new C4480xm(windowFlow, null, this), 3, null);
        ArrayList activeJobs = this.g;
        Intrinsics.checkNotNullParameter(launch$default, "<this>");
        Intrinsics.checkNotNullParameter(activeJobs, "activeJobs");
        activeJobs.add(launch$default);
    }

    @Override // com.inmobi.media.AbstractC4223o2
    public final void a() {
        C4493y9 c4493y9 = this.e;
        if (c4493y9 != null) {
            c4493y9.a("VideoExperienceManager", "destroy");
        }
        b();
        InterfaceC4311rc interfaceC4311rc = this.h;
        if (interfaceC4311rc != null) {
            ((C4025ge) interfaceC4311rc).a();
        }
        X4.a(this.g);
        S3 s3 = this.i;
        if (s3 != null) {
            s3.a();
        }
    }

    @Override // com.inmobi.media.AbstractC4223o2
    public final void b() {
        X4.a(this.b, new C4506ym(this, null));
        InterfaceC4311rc interfaceC4311rc = this.h;
        if (interfaceC4311rc == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mediaPlayer");
            interfaceC4311rc = null;
        }
        C4025ge c4025ge = (C4025ge) interfaceC4311rc;
        c4025ge.l.c();
        On on = c4025ge.m;
        InterfaceC4057hk interfaceC4057hk = on.h;
        if (interfaceC4057hk != null) {
            interfaceC4057hk.b();
        }
        on.d.set(false);
        Ng ng = (Ng) on.i.d.getValue();
        ng.f.set(true);
        P6.a(ng.e);
        ng.e = null;
        X4.a(on.e);
        X4.a(c4025ge.d);
        X4.a(this.f);
    }
}
