package defpackage;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class x3 implements zm {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x3(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.zm
    public final void a() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((z3) obj);
                return;
            case 1:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((a4) obj);
                return;
            case 2:
                ((y70) obj2).k.b((gm) obj);
                return;
            case 3:
                ((zx) obj2).a.i((xx) obj);
                return;
            case 4:
                Iterator it = ((List) ((bt0) obj2).getValue()).iterator();
                while (it.hasNext()) {
                    ((rg) obj).b().b((y70) it.next());
                }
                return;
            case 5:
                a9 a9Var = (a9) obj2;
                ug ugVar = (ug) obj;
                if (a9Var.a != null) {
                    ugVar.b.e();
                    return;
                }
                if (a9Var.b == null) {
                    g8.s("Unreachable");
                    return;
                }
                z8 z8Var = ugVar.a;
                ArrayList arrayList = z8Var.a;
                CopyOnWriteArrayList copyOnWriteArrayList = z8Var.c;
                Iterator it2 = copyOnWriteArrayList.iterator();
                it2.getClass();
                while (it2.hasNext()) {
                    AutoCloseable autoCloseable = (AutoCloseable) it2.next();
                    if (autoCloseable instanceof AutoCloseable) {
                        autoCloseable.close();
                    } else if (autoCloseable instanceof ExecutorService) {
                        r0.q((ExecutorService) autoCloseable);
                    } else if (autoCloseable instanceof TypedArray) {
                        ((TypedArray) autoCloseable).recycle();
                    } else if (autoCloseable instanceof MediaMetadataRetriever) {
                        ((MediaMetadataRetriever) autoCloseable).release();
                    } else if (autoCloseable instanceof MediaDrm) {
                        ((MediaDrm) autoCloseable).release();
                    } else if (autoCloseable instanceof DrmManagerClient) {
                        ((DrmManagerClient) autoCloseable).release();
                    } else {
                        if (!(autoCloseable instanceof ContentProviderClient)) {
                            throw new IllegalArgumentException();
                        }
                        ((ContentProviderClient) autoCloseable).release();
                    }
                }
                copyOnWriteArrayList.clear();
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj3 = arrayList.get(i2);
                    i2++;
                    ((ya0) obj3).e();
                }
                arrayList.clear();
                return;
            case 6:
                ((cx0) obj2).j.remove((cx0) obj);
                return;
            case 7:
                cx0 cx0Var = (cx0) obj2;
                cx0Var.getClass();
                ww0 ww0Var = (ww0) ((xw0) obj).b.getValue();
                if (ww0Var != null) {
                    cx0Var.i.remove(ww0Var.d);
                    return;
                }
                return;
            default:
                i21 i21Var = (i21) obj2;
                View view = (View) obj;
                int i3 = i21Var.s - 1;
                i21Var.s = i3;
                if (i3 == 0) {
                    int i4 = c01.a;
                    xz0.b(view, null);
                    c01.a(view, null);
                    view.removeOnAttachStateChangeListener(i21Var.t);
                    return;
                }
                return;
        }
    }
}
