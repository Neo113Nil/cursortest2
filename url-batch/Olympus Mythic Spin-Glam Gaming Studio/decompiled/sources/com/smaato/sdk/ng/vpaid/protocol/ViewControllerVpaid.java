package com.smaato.sdk.ng.vpaid.protocol;

import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.smaato.sdk.ng.NextGen;
import com.smaato.sdk.ng.analytics.ReportingEvent;
import com.smaato.sdk.ng.views.endcard.NextGenEndCardView;
import com.smaato.sdk.ng.vpaid.VideoAdController;
import com.smaato.sdk.ng.vpaid.VideoAdView;

/* loaded from: classes5.dex */
public class ViewControllerVpaid {
    private final VideoAdController a;
    private WebView b;
    private NextGenEndCardView c;

    public ViewControllerVpaid(VideoAdController videoAdController) {
        this.a = videoAdController;
    }

    public void buildVideoAdView(VideoAdView videoAdView, WebView webView) {
        videoAdView.getContext();
        this.b = webView;
        videoAdView.removeAllViews();
        if (this.b.getParent() != null) {
            ((ViewGroup) this.b.getParent()).removeAllViews();
        }
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        NextGenEndCardView nextGenEndCardView = new NextGenEndCardView(this.b.getContext());
        this.c = nextGenEndCardView;
        videoAdView.addView(nextGenEndCardView, layoutParams);
        videoAdView.addView(webView, layoutParams);
        webView.setBackgroundColor(0);
        videoAdView.setBackgroundColor(-16777216);
    }

    public void showEndCard(String str) {
        this.c.show(str);
        this.b.setVisibility(8);
        if (NextGen.getReportingController() == null || !NextGen.isReportingEnabled().booleanValue()) {
            return;
        }
        ReportingEvent reportingEvent = new ReportingEvent();
        reportingEvent.setEventType("companion_view");
        reportingEvent.setCreativeType("video");
        reportingEvent.setTimestamp(System.currentTimeMillis());
        NextGen.getReportingController().reportEvent(reportingEvent);
    }
}
