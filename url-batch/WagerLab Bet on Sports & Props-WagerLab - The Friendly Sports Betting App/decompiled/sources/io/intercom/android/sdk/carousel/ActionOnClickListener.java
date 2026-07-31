package io.intercom.android.sdk.carousel;

import android.view.View;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.carousel.ActionType;
import io.intercom.android.sdk.models.carousel.ScreenAction;

/* loaded from: classes8.dex */
class ActionOnClickListener implements View.OnClickListener {
    private final CarouselListener listener;
    private final ScreenAction screenAction;

    ActionOnClickListener(ScreenAction screenAction, CarouselListener carouselListener) {
        this.screenAction = screenAction;
        this.listener = carouselListener;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        char c;
        if (this.screenAction.isPermissionAction()) {
            this.listener.requestPermissions(this.screenAction);
            return;
        }
        String type = this.screenAction.getType();
        switch (type.hashCode()) {
            case -1573653227:
                if (type.equals(ActionType.START_CHAT)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -567202649:
                if (type.equals(ActionType.CONTINUE)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 3321850:
                if (type.equals("link")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3532159:
                if (type.equals(ActionType.SKIP)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1671672458:
                if (type.equals(ActionType.DISMISS)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            this.listener.trackActionButtonTappedStats();
            this.listener.dismissCarousel(MetricTracker.Context.FROM_CTA);
            return;
        }
        if (c == 1) {
            this.listener.trackActionButtonTappedStats();
            this.listener.openLink(this.screenAction.getUri());
        } else if (c == 2) {
            this.listener.trackActionButtonTappedStats();
            this.listener.startChat();
        } else if (c == 3) {
            this.listener.skipPermissionScreen();
        } else {
            this.listener.selectNextScreen(MetricTracker.Context.FROM_CTA);
        }
    }
}
