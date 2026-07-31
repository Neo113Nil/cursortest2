package com.pubmatic.sdk.video.player;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.pubmatic.sdk.common.ui.POBHtmlRendererListener;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.common.view.POBWebView;
import com.pubmatic.sdk.video.POBVastError;
import com.pubmatic.sdk.webrendering.ui.POBHTMLRenderer;
import com.pubmatic.sdk.webrendering.ui.POBHTMLViewClient;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.internal.partials.PubMaticNetworkBridge;
import com.safedk.android.utils.h;
import java.nio.charset.StandardCharsets;
import java.util.Formatter;
import java.util.IllegalFormatException;
import java.util.Locale;

@MainThread
/* loaded from: classes14.dex */
public abstract class POBVastHTMLView<T extends POBAdDescriptor> extends FrameLayout implements POBHtmlRendererListener, POBHTMLViewClient.OnRenderProcessGoneListener {
    private POBHTMLRenderer a;
    private POBWebView b;

    class a extends POBHTMLRenderer {
        a(POBWebView pOBWebView, POBHTMLViewClient pOBHTMLViewClient) {
            super(pOBWebView, pOBHTMLViewClient);
        }

        @Override // com.pubmatic.sdk.webrendering.ui.POBHTMLRenderer
        public void loadHTML(String str, String str2, boolean z) {
            if (str == null) {
                PubMaticNetworkBridge.webviewLoadUrl(POBVastHTMLView.this.b, str2);
                return;
            }
            try {
                Formatter formatter = new Formatter(Locale.getDefault());
                formatter.format("<html><head><meta name=\"viewport\" content=\"user-scalable=0, width=device-width, initial-scale=1\"/><style>body{margin:0;padding:0;}div{display:block;width:100%%;height:100%%;}</style></head><body><div align=\"center\">%s</div></body></html>", str);
                String valueOf = String.valueOf(formatter);
                formatter.close();
                PubMaticNetworkBridge.webviewLoadDataWithBaseURL(POBVastHTMLView.this.b, null, valueOf, POBCommonConstants.CONTENT_TYPE_HTML, StandardCharsets.UTF_8.name(), null);
            } catch (IllegalFormatException e) {
                notifyError(new POBError(1009, "Unable to render creative, due to " + e.getMessage()));
            }
        }
    }

    interface b {
        void a(String str);

        void onError(POBVastError pOBVastError);

        void onLoad();
    }

    public POBVastHTMLView(@NonNull Context context) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setBackgroundColor(getResources().getColor(R.color.transparent));
    }

    @Nullable
    @SuppressLint({"SetJavaScriptEnabled"})
    protected POBWebView createWebView(@NonNull Context context) {
        POBWebView createInstance = POBWebView.createInstance(context);
        if (createInstance != null) {
            createInstance.getSettings().setJavaScriptEnabled(true);
            createInstance.getSettings().setCacheMode(2);
            createInstance.setScrollBarStyle(0);
        }
        return createInstance;
    }

    public void destroy() {
        invalidateRenderer();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.F, this, me);
        return super.dispatchTouchEvent(me);
    }

    public void invalidateRenderer() {
        POBHTMLRenderer pOBHTMLRenderer = this.a;
        if (pOBHTMLRenderer != null) {
            pOBHTMLRenderer.destroy();
            this.a = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    protected boolean renderVastHTMLView(@NonNull POBAdDescriptor pOBAdDescriptor) {
        POBWebView createWebView = createWebView(getContext());
        this.b = createWebView;
        if (createWebView == null) {
            return false;
        }
        POBHTMLViewClient pOBHTMLViewClient = new POBHTMLViewClient(this);
        pOBHTMLViewClient.disableMultipleOnPageFinished(true);
        a aVar = new a(this.b, pOBHTMLViewClient);
        this.a = aVar;
        aVar.setRendererViewListener(this);
        String renderableContent = pOBAdDescriptor.getRenderableContent();
        if (POBUtils.isNullOrEmpty(renderableContent)) {
            return false;
        }
        if (renderableContent.toLowerCase().startsWith("http")) {
            this.a.loadHTML(null, renderableContent, pOBAdDescriptor.isCompanion());
        } else {
            this.a.loadHTML(renderableContent, "", pOBAdDescriptor.isCompanion());
        }
        return true;
    }
}
