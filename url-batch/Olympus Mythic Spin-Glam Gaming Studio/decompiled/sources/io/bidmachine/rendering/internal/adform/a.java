package io.bidmachine.rendering.internal.adform;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import io.bidmachine.iab.utils.ClickAreaFactory;
import io.bidmachine.rendering.Repository;
import io.bidmachine.rendering.internal.d;
import io.bidmachine.rendering.internal.k;
import io.bidmachine.rendering.internal.u;
import io.bidmachine.rendering.internal.v;
import io.bidmachine.rendering.internal.w;
import io.bidmachine.rendering.model.AdElementParams;
import io.bidmachine.rendering.model.AdElementType;
import io.bidmachine.rendering.model.AppearanceParams;
import io.bidmachine.rendering.model.Background;
import io.bidmachine.rendering.model.Padding;
import io.bidmachine.rendering.model.PaddingKt;
import io.bidmachine.rendering.utils.VisibilityChanger;
import io.bidmachine.util.ViewUtils;
import io.bidmachine.util.ViewUtilsKt;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public abstract class a extends u implements io.bidmachine.rendering.internal.b, View.OnClickListener, VisibilityChanger {
    public static final C1777a q = new C1777a(null);
    private static final AdElementType[] r = {AdElementType.Image, AdElementType.Label};
    private final Object c;
    private final Repository d;
    private final AdElementParams e;
    private final c f;
    private final io.bidmachine.rendering.internal.detector.brokencreative.a g;
    private final Context h;
    private final AppearanceParams i;
    private final v j;
    private final AtomicBoolean k;
    private ViewGroup l;
    private volatile boolean m;
    private volatile boolean n;
    private volatile boolean o;
    private volatile boolean p;

    /* renamed from: io.bidmachine.rendering.internal.adform.a$a, reason: collision with other inner class name */
    public static final class C1777a {
        public /* synthetic */ C1777a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1777a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, Object assetsHolder, Repository repository, AdElementParams adElementParams, c adFormListener, io.bidmachine.rendering.internal.event.b eventCallback, io.bidmachine.rendering.internal.detector.brokencreative.a aVar) {
        super(eventCallback);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(assetsHolder, "assetsHolder");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(adElementParams, "adElementParams");
        Intrinsics.checkNotNullParameter(adFormListener, "adFormListener");
        Intrinsics.checkNotNullParameter(eventCallback, "eventCallback");
        this.c = assetsHolder;
        this.d = repository;
        this.e = adElementParams;
        this.f = adFormListener;
        this.g = aVar;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.h = applicationContext;
        AppearanceParams appearanceParams = adElementParams.getAppearanceParams();
        this.i = appearanceParams;
        Background background = appearanceParams.getIo.appmetrica.analytics.impl.M2.g java.lang.String();
        this.j = background != null ? w.a(background, applicationContext, repository) : null;
        this.k = new AtomicBoolean(false);
        this.n = true;
        this.p = this.n;
    }

    public final void A() {
        io.bidmachine.rendering.internal.detector.brokencreative.a aVar = this.g;
        if (aVar != null) {
            aVar.i();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean B() {
        View v = v();
        if (v == 0) {
            return false;
        }
        Padding padding = this.i.getIo.bidmachine.iab.vast.tags.VastAttributes.PADDING java.lang.String();
        if (padding != null && !padding.isZero()) {
            FrameLayout frameLayout = new FrameLayout(this.h);
            frameLayout.setId(ViewUtils.generateViewId());
            PaddingKt.setPadding(frameLayout, padding);
            frameLayout.addView(v, new FrameLayout.LayoutParams(-1, -1));
            this.l = frameLayout;
        }
        View i = i();
        if (i == null) {
            return false;
        }
        i.setId(ViewUtils.generateViewId());
        i.setTag(this.e.getName());
        Boolean clickable = this.i.getClickable();
        if (clickable != null && clickable.booleanValue()) {
            i.setOnClickListener(this);
        }
        Boolean bool = this.i.getIo.bidmachine.iab.vast.tags.VastAttributes.VISIBLE java.lang.String();
        if (bool != null) {
            setVisibility(bool.booleanValue());
        }
        if (v instanceof d) {
            ((d) v).a(this.i);
            return true;
        }
        a(v, this.j);
        return true;
    }

    protected void a(View view, v vVar) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (vVar != null) {
            vVar.a(this.c, view, (r16 & 4) != 0 ? null : null, (r16 & 8) != 0 ? null : null, (r16 & 16) != 0, (r16 & 32) != 0 ? null : null);
            return;
        }
        Integer backgroundColor = this.i.getBackgroundColor();
        if (backgroundColor == null || ArraysKt.contains(r, this.e.getAdElementType())) {
            return;
        }
        ViewUtilsKt.setBackgroundColorSafely(view, backgroundColor);
    }

    protected final void b(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        k.a(o(), message, new Object[0]);
    }

    @Override // io.bidmachine.rendering.internal.b
    public void c() {
        z();
    }

    @Override // io.bidmachine.rendering.internal.u, io.bidmachine.rendering.internal.b
    public void destroy() {
        super.destroy();
        v vVar = this.j;
        if (vVar != null) {
            vVar.a();
        }
        io.bidmachine.rendering.internal.detector.brokencreative.a aVar = this.g;
        if (aVar != null) {
            aVar.c();
        }
        x();
    }

    @Override // io.bidmachine.rendering.internal.b
    public void e() {
        y();
    }

    @Override // io.bidmachine.rendering.internal.b
    public final AdElementParams g() {
        return this.e;
    }

    @Override // io.bidmachine.rendering.internal.b
    public boolean h() {
        return this.p;
    }

    @Override // io.bidmachine.rendering.internal.b
    public View i() {
        ViewGroup viewGroup = this.l;
        return viewGroup != null ? viewGroup : v();
    }

    @Override // io.bidmachine.rendering.utils.VisibilityChanger
    public void lockVisibility(boolean z) {
        setVisibility(z);
        this.o = true;
    }

    @Override // io.bidmachine.rendering.internal.u
    public String o() {
        return this.e.getName();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        w();
    }

    public final void p() {
        View v = v();
        if (v == null) {
            return;
        }
        if (this.p && this.m) {
            if (this.k.compareAndSet(false, true)) {
                a(v);
            }
        } else if (this.k.compareAndSet(true, false)) {
            A();
        }
    }

    protected final c q() {
        return this.f;
    }

    public final AppearanceParams r() {
        return this.i;
    }

    public final Context s() {
        return this.h;
    }

    @Override // io.bidmachine.rendering.utils.VisibilityChanger
    public void setVisibility(boolean z) {
        this.n = z;
        if (this.o) {
            return;
        }
        if (z) {
            ViewUtilsKt.showViewSafely(i());
        } else {
            ViewUtilsKt.hideViewSafely(i());
        }
        this.p = z;
        p();
    }

    public final Object t() {
        return this.c;
    }

    public String toString() {
        return "type - " + this.e.getAdElementType() + ", name - " + this.e.getName();
    }

    protected final Repository u() {
        return this.d;
    }

    @Override // io.bidmachine.rendering.utils.VisibilityChanger
    public void unlockVisibility() {
        this.o = false;
        setVisibility(this.n);
    }

    public abstract View v();

    public void w() {
        io.bidmachine.rendering.internal.event.b n = n();
        View v = v();
        n.a(v != null ? v.getId() : -1);
    }

    protected void x() {
    }

    public void y() {
        this.m = false;
        p();
    }

    public void z() {
        this.m = true;
        p();
    }

    @Override // io.bidmachine.rendering.internal.b
    public void a(ClickAreaFactory clickAreaFactory) {
        Intrinsics.checkNotNullParameter(clickAreaFactory, "clickAreaFactory");
        w();
    }

    public final void a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        v vVar = this.j;
        if (vVar != null) {
            vVar.a(this.c, view, (r16 & 4) != 0 ? null : null, (r16 & 8) != 0 ? null : null, (r16 & 16) != 0, (r16 & 32) != 0 ? null : new v.a(0L, null, 3, null));
        }
        io.bidmachine.rendering.internal.detector.brokencreative.a aVar = this.g;
        if (aVar != null) {
            aVar.a(view);
        }
        this.f.a(this);
    }
}
