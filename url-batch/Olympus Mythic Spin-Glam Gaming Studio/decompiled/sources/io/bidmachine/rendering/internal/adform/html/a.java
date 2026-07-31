package io.bidmachine.rendering.internal.adform.html;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.iab.IabSettings;
import io.bidmachine.iab.mraid.MraidAdView;
import io.bidmachine.iab.mraid.MraidPlacementType;
import io.bidmachine.iab.utils.ClickAreaFactory;
import io.bidmachine.rendering.Repository;
import io.bidmachine.rendering.internal.adform.c;
import io.bidmachine.rendering.internal.j;
import io.bidmachine.rendering.internal.k;
import io.bidmachine.rendering.measurer.HtmlMeasurer;
import io.bidmachine.rendering.model.AdElementParams;
import io.bidmachine.rendering.model.Error;
import io.bidmachine.rendering.model.HtmlResourceSource;
import io.bidmachine.rendering.model.MediaSource;
import io.bidmachine.rendering.model.Resource;
import io.bidmachine.rendering.model.ResourceSource;
import io.bidmachine.rendering.model.UrlResourceSource;
import io.bidmachine.rendering.utils.UiUtils;
import io.bidmachine.util.SystemComponent;
import io.bidmachine.util.Utils;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class a extends io.bidmachine.rendering.internal.adform.a {
    public static final b v = new b(null);
    private final HtmlMeasurer s;
    private final List t;
    private MraidAdView u;

    /* renamed from: io.bidmachine.rendering.internal.adform.html.a$a, reason: collision with other inner class name */
    private final class C1779a implements Repository.ResultCallback {
        public C1779a() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.bidmachine.util.ResultCallback
        public void onError(Error error) {
            Intrinsics.checkNotNullParameter(error, "error");
            a.this.a(error);
        }

        @Override // io.bidmachine.rendering.Repository.ResultCallback, io.bidmachine.util.ResultCallback
        public void onSuccess(String result) {
            Intrinsics.checkNotNullParameter(result, "result");
            a.this.c(result);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, Object assetsHolder, Repository repository, AdElementParams adElementParams, c adFormListener, io.bidmachine.rendering.internal.event.b eventCallback, io.bidmachine.rendering.internal.detector.brokencreative.a aVar, HtmlMeasurer htmlMeasurer, List list) {
        super(context, assetsHolder, repository, adElementParams, adFormListener, eventCallback, aVar);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(assetsHolder, "assetsHolder");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(adElementParams, "adElementParams");
        Intrinsics.checkNotNullParameter(adFormListener, "adFormListener");
        Intrinsics.checkNotNullParameter(eventCallback, "eventCallback");
        this.s = htmlMeasurer;
        this.t = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(a this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        MraidAdView mraidAdView = this$0.u;
        if (mraidAdView != null) {
            mraidAdView.onViewabilityChanged(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(a this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        MraidAdView mraidAdView = this$0.u;
        if (mraidAdView != null) {
            mraidAdView.show();
            mraidAdView.onViewabilityChanged(true);
            super.c();
        }
    }

    public final void C() {
        UiUtils.onUiThread(new j() { // from class: io.bidmachine.rendering.internal.adform.html.a$$ExternalSyntheticLambda2
            @Override // io.bidmachine.util.SafeRunnable
            public final void onRun() {
                a.a(a.this);
            }
        });
    }

    public final List D() {
        try {
            String customParam = g().getCustomParam("features");
            if (customParam != null && customParam.length() > 0) {
                List mutableList = CollectionsKt.toMutableList((Collection) StringsKt.split$default((CharSequence) customParam, new String[]{StringUtils.COMMA}, false, 0, 6, (Object) null));
                int size = mutableList.size();
                for (int i = 0; i < size; i++) {
                    String str = (String) mutableList.get(i);
                    int length = str.length() - 1;
                    int i2 = 0;
                    boolean z = false;
                    while (i2 <= length) {
                        boolean z2 = Intrinsics.compare((int) str.charAt(!z ? i2 : length), 32) <= 0;
                        if (z) {
                            if (!z2) {
                                break;
                            }
                            length--;
                        } else if (z2) {
                            i2++;
                        } else {
                            z = true;
                        }
                    }
                    mutableList.set(i, str.subSequence(i2, length + 1).toString());
                }
                return mutableList;
            }
        } catch (Exception unused) {
        }
        return CollectionsKt.emptyList();
    }

    public final String E() {
        if (!g().getCustomParams().containsKey("base_url")) {
            return IabSettings.DEF_BASE_URL;
        }
        String customParam = g().getCustomParam("base_url");
        if (Utils.isUrlValid(customParam)) {
            return customParam;
        }
        return null;
    }

    public final MraidPlacementType F() {
        String customParam = g().getCustomParam("placement_type");
        if (Intrinsics.areEqual(customParam, "fullscreen")) {
            return MraidPlacementType.INTERSTITIAL;
        }
        if (Intrinsics.areEqual(customParam, "view")) {
            return MraidPlacementType.INLINE;
        }
        return null;
    }

    @Override // io.bidmachine.rendering.internal.b
    public void b() {
        Resource resource = g().getResource();
        ResourceSource source = resource != null ? resource.getSource() : null;
        if (source == null) {
            c(g().getSource());
            return;
        }
        if (source instanceof HtmlResourceSource) {
            c(((HtmlResourceSource) source).getHtml());
            return;
        }
        if (source instanceof UrlResourceSource) {
            d((String) CollectionsKt.firstOrNull((List) ((UrlResourceSource) source).getUrls()));
            return;
        }
        a(new Error("Invalid resource type (" + source.getClass().getSimpleName() + "), it should be HtmlResourceSource or UrlResourceSource"));
    }

    @Override // io.bidmachine.rendering.internal.adform.a, io.bidmachine.rendering.internal.b
    public void c() {
        UiUtils.onUiThread(new j() { // from class: io.bidmachine.rendering.internal.adform.html.a$$ExternalSyntheticLambda5
            @Override // io.bidmachine.util.SafeRunnable
            public final void onRun() {
                a.e(a.this);
            }
        });
    }

    @Override // io.bidmachine.rendering.internal.b
    public void m() {
        UiUtils.onUiThread(new j() { // from class: io.bidmachine.rendering.internal.adform.html.a$$ExternalSyntheticLambda0
            @Override // io.bidmachine.util.SafeRunnable
            public final void onRun() {
                a.b(a.this);
            }
        });
    }

    @Override // io.bidmachine.rendering.internal.adform.a
    public View v() {
        return this.u;
    }

    @Override // io.bidmachine.rendering.internal.adform.a
    protected void x() {
        Unit unit;
        HtmlMeasurer htmlMeasurer = this.s;
        if (htmlMeasurer != null) {
            htmlMeasurer.destroy(new j() { // from class: io.bidmachine.rendering.internal.adform.html.a$$ExternalSyntheticLambda4
                @Override // io.bidmachine.util.SafeRunnable
                public final void onRun() {
                    a.c(a.this);
                }
            });
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            C();
        }
    }

    @Override // io.bidmachine.rendering.internal.adform.a
    public void z() {
        super.z();
        HtmlMeasurer htmlMeasurer = this.s;
        if (htmlMeasurer != null) {
            htmlMeasurer.onShown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(a this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.C();
    }

    private final void d(String str) {
        MediaSource fromUrl = MediaSource.INSTANCE.fromUrl(str);
        if (fromUrl != null) {
            u().getString(fromUrl, t(), new C1779a());
            return;
        }
        a(new Error("Invalid adm url (" + str + ')'));
    }

    @Override // io.bidmachine.rendering.internal.b
    public void a(final ViewGroup rootContainer) {
        Intrinsics.checkNotNullParameter(rootContainer, "rootContainer");
        UiUtils.onUiThread(new j() { // from class: io.bidmachine.rendering.internal.adform.html.a$$ExternalSyntheticLambda6
            @Override // io.bidmachine.util.SafeRunnable
            public final void onRun() {
                a.a(a.this, rootContainer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a this$0, ViewGroup rootContainer) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(rootContainer, "$rootContainer");
        MraidAdView mraidAdView = this$0.u;
        HtmlMeasurer htmlMeasurer = this$0.s;
        if (htmlMeasurer == null || mraidAdView == null) {
            return;
        }
        htmlMeasurer.onViewAddedToContainer(mraidAdView.getWebView(), rootContainer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(final String str) {
        String prepareCreativeForMeasure;
        if (str != null && str.length() != 0) {
            HtmlMeasurer htmlMeasurer = this.s;
            if (htmlMeasurer != null && (prepareCreativeForMeasure = htmlMeasurer.prepareCreativeForMeasure(str)) != null) {
                str = prepareCreativeForMeasure;
            }
            Intrinsics.checkNotNullExpressionValue(str, "htmlMeasurer?.prepareCre…iveForMeasure(adm) ?: adm");
            final MraidPlacementType F = F();
            final String E = E();
            UiUtils.onUiThread(new Runnable() { // from class: io.bidmachine.rendering.internal.adform.html.a$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    a.a(a.this, F, E, str);
                }
            });
            return;
        }
        a(new Error("Adm is null or empty"));
    }

    @Override // io.bidmachine.rendering.internal.adform.a, io.bidmachine.rendering.internal.b
    public void e() {
        super.e();
        UiUtils.onUiThread(new j() { // from class: io.bidmachine.rendering.internal.adform.html.a$$ExternalSyntheticLambda1
            @Override // io.bidmachine.util.SafeRunnable
            public final void onRun() {
                a.d(a.this);
            }
        });
    }

    @Override // io.bidmachine.rendering.internal.adform.a, io.bidmachine.rendering.internal.b
    public void a(ClickAreaFactory clickAreaFactory) {
        Unit unit;
        Intrinsics.checkNotNullParameter(clickAreaFactory, "clickAreaFactory");
        MraidAdView mraidAdView = this.u;
        if (mraidAdView != null) {
            mraidAdView.handleRedirect(clickAreaFactory);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            super.a(clickAreaFactory);
        }
    }

    @Override // io.bidmachine.rendering.internal.u
    public void a(SystemComponent systemComponent) {
        HtmlMeasurer htmlMeasurer = this.s;
        if (htmlMeasurer != null) {
            htmlMeasurer.onClicked();
        }
        super.a(systemComponent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a this$0, MraidPlacementType mraidPlacementType, String str, String preparedSource) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(preparedSource, "$preparedSource");
        try {
            MraidAdView mraidAdView = new MraidAdView(this$0.s(), mraidPlacementType, str, null, this$0.D(), null, 1000L, this$0.t, new io.bidmachine.rendering.internal.adform.html.b(this$0, this$0.q(), this$0.n(), this$0.s));
            mraidAdView.load(preparedSource);
            HtmlMeasurer htmlMeasurer = this$0.s;
            if (htmlMeasurer != null) {
                htmlMeasurer.onViewCreated(mraidAdView.getWebView());
            }
            this$0.u = mraidAdView;
        } catch (Throwable th) {
            k.b(th);
            this$0.a(Error.INSTANCE.create(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(a this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        MraidAdView mraidAdView = this$0.u;
        if (mraidAdView != null) {
            mraidAdView.closeExpanded();
        }
    }

    public final void b(Error error) {
        Intrinsics.checkNotNullParameter(error, "error");
        HtmlMeasurer htmlMeasurer = this.s;
        if (htmlMeasurer != null) {
            htmlMeasurer.onError(error);
        }
        q().a(this, error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        MraidAdView mraidAdView = this$0.u;
        if (mraidAdView != null) {
            mraidAdView.destroy();
        }
        this$0.u = null;
    }

    public final void a(Error error) {
        Intrinsics.checkNotNullParameter(error, "error");
        HtmlMeasurer htmlMeasurer = this.s;
        if (htmlMeasurer != null) {
            htmlMeasurer.onError(error);
        }
        q().c(this, error);
    }
}
