package com.inmobi.media;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.Lazy;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.inmobi.media.z9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4519z9 {
    public static void a() {
        Context context;
        try {
            Iterator it = B9.a.iterator();
            while (it.hasNext()) {
                Wb wb = (Wb) ((WeakReference) it.next()).get();
                if (wb != null && (context = (Context) wb.f.get()) != null) {
                    CoroutineScope coroutineScope = AbstractC3995fc.a;
                    AbstractC3967ec.a(new Vb(wb, context, null));
                }
            }
        } catch (Exception e) {
            Lazy lazy = AbstractC3861aa.a;
            AbstractC4361t9.a(e);
        }
    }
}
