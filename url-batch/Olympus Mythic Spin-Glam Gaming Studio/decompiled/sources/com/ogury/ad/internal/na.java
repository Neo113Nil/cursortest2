package com.ogury.ad.internal;

import android.app.Activity;
import android.content.Context;
import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.Logger;
import com.ogury.core.internal.SourceTag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class na implements ah {
    public final /* synthetic */ oa a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ bb c;

    public na(oa oaVar, Activity activity, bb bbVar) {
        this.a = oaVar;
        this.b = activity;
        this.c = bbVar;
    }

    @Override // com.ogury.ad.internal.ah
    public final void a(Context context, List ads) {
        Object obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ads, "ads");
        Iterator it = ads.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (!((b) obj).v) {
                    break;
                }
            }
        }
        b bVar = (b) obj;
        ja overlayAdResponse = bVar != null ? bVar.m : new ja();
        cb cbVar = this.a.g;
        Activity activity = this.b;
        cbVar.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        fb overlayScreenArea = new fb(activity);
        Intrinsics.checkNotNullParameter(overlayScreenArea, "overlayScreenArea");
        bb overlayPosition = this.c;
        Intrinsics.checkNotNullParameter(overlayPosition, "overlayPosition");
        Intrinsics.checkNotNullParameter(overlayAdResponse, "overlayAdResponse");
        int i = overlayPosition.a;
        int b = (i == 0 || i == 2) ? overlayPosition.b : ib.b((overlayScreenArea.a.getMeasuredWidth() - ib.a(overlayPosition.b)) - overlayAdResponse.b);
        bb overlayPosition2 = this.c;
        Intrinsics.checkNotNullParameter(overlayPosition2, "overlayPosition");
        Intrinsics.checkNotNullParameter(overlayAdResponse, "overlayAdResponse");
        int i2 = overlayPosition2.a;
        int b2 = (i2 == 0 || i2 == 1) ? overlayPosition2.c : ib.b((overlayScreenArea.a.getMeasuredHeight() - ib.a(overlayPosition2.c)) - overlayAdResponse.c);
        ga gaVar = this.a.j;
        if (gaVar != null) {
            Activity activity2 = this.b;
            Intrinsics.checkNotNullParameter(activity2, "activity");
            Intrinsics.checkNotNullParameter(ads, "ads");
            gaVar.j = activity2;
            try {
                b bVar2 = (b) ads.remove(0);
                Intrinsics.checkNotNullParameter(ads, "<this>");
                CollectionsKt.removeAll(ads, (Function1) l8.a);
                gaVar.i.d = ib.a(b);
                gaVar.i.e = ib.a(b2);
                if (!bVar2.v) {
                    gaVar.a(bVar2, ads, activity2, true);
                    return;
                }
                gaVar.c.a(gaVar.a, bVar2, new ArrayList());
                if (ads.isEmpty()) {
                    return;
                }
                gaVar.a((b) ads.remove(0), ads, activity2, false);
            } catch (Throwable th) {
                Logger.INSTANCE.e(LogTag.INTERNAL, SourceTag.ADS, th);
                gaVar.a();
            }
        }
    }
}
