package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.my.target.b6;
import com.my.target.common.menu.MenuFactory;
import com.my.target.common.models.ImageData;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes5.dex */
public class g {
    final e a;
    final f b;
    final b6.b c;
    final String d;
    private final View.OnClickListener e;
    WeakReference f;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface a {
        void b();
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface b {
        void a();
    }

    g(e eVar, MenuFactory menuFactory, b6.b bVar) {
        this.a = eVar;
        this.c = bVar;
        if (eVar == null) {
            this.b = null;
            this.e = null;
            this.d = null;
            return;
        }
        List b2 = eVar.b();
        if (b2 == null || b2.isEmpty()) {
            this.b = null;
        } else {
            this.b = f.a(eVar, menuFactory == null ? new r3() : menuFactory);
        }
        this.d = eVar.c();
        this.e = new View.OnClickListener() { // from class: com.my.target.g$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g.this.a(view);
            }
        };
    }

    public static g a(e eVar) {
        return a(eVar, null, null);
    }

    public static g a(e eVar, MenuFactory menuFactory, b6.b bVar) {
        return new g(eVar, menuFactory, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        a(view.getContext());
    }

    public void a(m mVar, a aVar) {
        if (this.a == null) {
            a(mVar);
            return;
        }
        f fVar = this.b;
        if (fVar != null) {
            fVar.a(aVar);
        }
        this.f = new WeakReference(mVar);
        mVar.setVisibility(0);
        mVar.setOnClickListener(this.e);
        if (mVar.hasImage()) {
            return;
        }
        ImageData g = this.a.g();
        Bitmap bitmap = g.getBitmap();
        if (bitmap != null) {
            mVar.setImageBitmap(bitmap);
        } else {
            b6.a(g, mVar, this.c);
        }
    }

    public void a() {
        f fVar = this.b;
        if (fVar != null) {
            fVar.a((a) null);
        }
        WeakReference weakReference = this.f;
        m mVar = weakReference != null ? (m) weakReference.get() : null;
        if (mVar == null) {
            return;
        }
        e eVar = this.a;
        if (eVar != null) {
            b6.a(eVar.g(), mVar);
        }
        a(mVar);
        this.f.clear();
        this.f = null;
    }

    public void a(Context context) {
        f fVar = this.b;
        if (fVar == null) {
            String str = this.d;
            if (str != null) {
                a7.a(str, context);
                return;
            }
            return;
        }
        if (fVar.b()) {
            return;
        }
        this.b.a(context);
    }

    void a(m mVar) {
        mVar.setImageBitmap(null);
        mVar.setImageDrawable(null);
        mVar.setVisibility(8);
        mVar.setOnClickListener(null);
    }
}
