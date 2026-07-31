package io.bidmachine.rendering.internal;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import io.bidmachine.rendering.Repository;
import io.bidmachine.rendering.internal.v;
import io.bidmachine.rendering.internal.view.e;
import io.bidmachine.rendering.model.AdPhaseParams;
import io.bidmachine.rendering.model.Background;
import io.bidmachine.rendering.model.ElementLayoutParams;
import io.bidmachine.util.ViewUtils;
import io.bidmachine.util.ViewUtilsKt;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c {
    public static final a g = new a(null);
    private final Object a;
    private final AdPhaseParams b;
    private final HashSet c;
    private final v d;
    private ViewGroup e;
    private int f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public c(Object assetsHolder, Context context, Repository repository, AdPhaseParams adPhaseParams) {
        v vVar;
        Intrinsics.checkNotNullParameter(assetsHolder, "assetsHolder");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(adPhaseParams, "adPhaseParams");
        this.a = assetsHolder;
        this.b = adPhaseParams;
        this.c = new HashSet();
        Background background = adPhaseParams.getBackground();
        if (background != null) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            vVar = w.a(background, applicationContext, repository);
        } else {
            vVar = null;
        }
        this.d = vVar;
        this.f = -1;
    }

    private final void d() {
        v vVar;
        ViewGroup viewGroup = this.e;
        if (viewGroup == null || (vVar = this.d) == null) {
            return;
        }
        vVar.a(this.a, viewGroup, (r16 & 4) != 0 ? null : null, (r16 & 8) != 0 ? null : null, (r16 & 16) != 0, (r16 & 32) != 0 ? null : new v.a(0L, null, 3, null));
    }

    public final boolean a(ViewGroup rootContainer, ViewGroup container, List ads, List controls) {
        Unit unit;
        Intrinsics.checkNotNullParameter(rootContainer, "rootContainer");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(ads, "ads");
        Intrinsics.checkNotNullParameter(controls, "controls");
        Context context = container.getContext();
        a();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(ViewUtils.generateViewId());
        v vVar = this.d;
        if (vVar != null) {
            vVar.a(this.a, frameLayout, (r16 & 4) != 0 ? null : null, (r16 & 8) != 0 ? null : null, (r16 & 16) != 0, (r16 & 32) != 0 ? null : null);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            ViewUtilsKt.setBackgroundColorSafely(frameLayout, this.b.getBackgroundColor());
        }
        this.e = frameLayout;
        io.bidmachine.rendering.internal.view.e eVar = new io.bidmachine.rendering.internal.view.e(context);
        int generateViewId = ViewUtils.generateViewId();
        this.f = generateViewId;
        eVar.setId(generateViewId);
        eVar.setTag("ads");
        Iterator it = ads.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            a(context, rootContainer, eVar, ads, bVar);
        }
        ViewGroup viewGroup = this.e;
        if (viewGroup != null) {
            viewGroup.addView(eVar, ViewUtils.createMatchParentParams());
        }
        io.bidmachine.rendering.internal.view.e eVar2 = new io.bidmachine.rendering.internal.view.e(context);
        eVar2.setTag("controls");
        Iterator it2 = controls.iterator();
        while (it2.hasNext()) {
            b bVar2 = (b) it2.next();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            a(context, rootContainer, eVar2, controls, bVar2);
        }
        ViewGroup viewGroup2 = this.e;
        if (viewGroup2 != null) {
            viewGroup2.addView(eVar2, ViewUtils.createMatchParentParams());
        }
        container.addView(this.e, 0, ViewUtils.createMatchParentParams());
        return true;
    }

    public final AdPhaseParams b() {
        return this.b;
    }

    public final ViewGroup c() {
        return this.e;
    }

    public final void a() {
        v vVar = this.d;
        if (vVar != null) {
            vVar.a();
        }
        this.c.clear();
        this.f = -1;
        ViewGroup viewGroup = this.e;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            ViewUtilsKt.removeFromParent(viewGroup);
        }
        this.e = null;
    }

    public final void a(Context context, ViewGroup rootContainer, io.bidmachine.rendering.internal.view.e elementsContainer, List adElements, b adElement) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rootContainer, "rootContainer");
        Intrinsics.checkNotNullParameter(elementsContainer, "elementsContainer");
        Intrinsics.checkNotNullParameter(adElements, "adElements");
        Intrinsics.checkNotNullParameter(adElement, "adElement");
        View i = adElement.i();
        if (i == null) {
            return;
        }
        ElementLayoutParams elementLayoutParams = adElement.g().getElementLayoutParams();
        int widthPx = elementLayoutParams.getWidthPx(context);
        int heightPx = elementLayoutParams.getHeightPx(context);
        if (widthPx <= 0) {
            widthPx = -1;
        }
        if (heightPx <= 0) {
            heightPx = -1;
        }
        e.a aVar = new e.a(widthPx, heightPx);
        aVar.a(context, elementLayoutParams, adElements);
        elementsContainer.addView(i, aVar);
        try {
            adElement.a(rootContainer);
            if (elementsContainer.getId() == this.f) {
                this.c.add(adElement);
            }
        } catch (Throwable th) {
            k.b(th);
        }
    }

    public final void a(io.bidmachine.rendering.internal.adform.a adForm) {
        Intrinsics.checkNotNullParameter(adForm, "adForm");
        this.c.remove(adForm);
        if (this.c.isEmpty()) {
            d();
        }
    }
}
