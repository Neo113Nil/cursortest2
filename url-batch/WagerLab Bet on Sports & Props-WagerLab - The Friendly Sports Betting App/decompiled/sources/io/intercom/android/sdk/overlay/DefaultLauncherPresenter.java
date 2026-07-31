package io.intercom.android.sdk.overlay;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.ConfigModules;
import io.intercom.android.sdk.models.CustomizationColorsModel;
import io.intercom.android.sdk.overlay.DefaultLauncher;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.ThemeUtils;

/* loaded from: classes8.dex */
public class DefaultLauncherPresenter implements DefaultLauncher.Listener {
    private int bottomPadding;
    DefaultLauncher defaultLauncher;
    private final LayoutInflater inflater;
    private final MetricTracker metricTracker;
    private final LauncherOpenBehaviour openBehaviour;
    private int previousUnreadCount = 0;

    public DefaultLauncherPresenter(LayoutInflater layoutInflater, LauncherOpenBehaviour launcherOpenBehaviour, MetricTracker metricTracker) {
        this.bottomPadding = 0;
        this.inflater = layoutInflater;
        this.openBehaviour = launcherOpenBehaviour;
        this.metricTracker = metricTracker;
        this.bottomPadding = getDefaultPadding(layoutInflater.getContext().getResources());
    }

    public void displayLauncherOnAttachedRoot(ViewGroup viewGroup, AppConfig appConfig) {
        DefaultLauncher defaultLauncher = this.defaultLauncher;
        if (defaultLauncher != null && !defaultLauncher.isAttachedToRoot(viewGroup)) {
            this.defaultLauncher.removeView();
            this.defaultLauncher = null;
        }
        if (this.defaultLauncher == null) {
            DefaultLauncher defaultLauncher2 = new DefaultLauncher(viewGroup, this.inflater, this, this.bottomPadding);
            this.defaultLauncher = defaultLauncher2;
            defaultLauncher2.fadeOnScreen();
        }
        setLauncherBackgroundColor(appConfig);
        setLauncherLogo(appConfig);
        setUnreadCount(this.previousUnreadCount);
    }

    DefaultLauncher getAndUnsetLauncher() {
        DefaultLauncher defaultLauncher = this.defaultLauncher;
        this.defaultLauncher = null;
        return defaultLauncher;
    }

    void setLauncherBackgroundColor(int i, int i2) {
        DefaultLauncher defaultLauncher = this.defaultLauncher;
        if (defaultLauncher != null) {
            defaultLauncher.setLauncherColor(i, i2);
        }
    }

    void setLauncherBackgroundColor(AppConfig appConfig) {
        ConfigModules configModules = appConfig.getConfigModules();
        if (configModules != null) {
            CustomizationColorsModel action = configModules.getCustomization().getAction();
            String selectColorForTheme = ThemeUtils.selectColorForTheme(this.inflater.getContext(), action.getBackgroundColor(), action.getBackgroundColorDark());
            String selectColorForTheme2 = ThemeUtils.selectColorForTheme(this.inflater.getContext(), action.getForegroundLowContrastColor(), action.getForegroundLowContrastColorDark());
            setLauncherBackgroundColor(ColorUtils.parseColor(selectColorForTheme2), ColorUtils.parseColor(selectColorForTheme));
        }
    }

    void setLauncherLogo(AppConfig appConfig) {
        boolean z = (TextUtils.isEmpty(appConfig.getLauncherLogoUrl()) && (appConfig.getConfigModules() == null || (TextUtils.isEmpty(appConfig.getConfigModules().getCustomization().getLauncherLogoUrl()) && TextUtils.isEmpty(appConfig.getConfigModules().getCustomization().getLauncherLogoDarkUrl())))) ? false : true;
        DefaultLauncher defaultLauncher = this.defaultLauncher;
        if (defaultLauncher != null && z) {
            defaultLauncher.setLauncherLogo(appConfig);
        } else if (defaultLauncher != null) {
            defaultLauncher.setDefaultLogo();
        }
    }

    void removeLauncher() {
        DefaultLauncher defaultLauncher = this.defaultLauncher;
        if (defaultLauncher != null) {
            defaultLauncher.fadeOffScreen(null);
            this.defaultLauncher = null;
        }
    }

    public boolean isDisplaying() {
        return this.defaultLauncher != null;
    }

    public void setUnreadCount(int i) {
        if (isDisplaying()) {
            String valueOf = String.valueOf(i);
            if (i > this.previousUnreadCount) {
                this.metricTracker.receivedNotificationFromBadgeWhenMessengerClosed(valueOf);
            }
            if (i > 0) {
                this.defaultLauncher.setBadgeCount(valueOf);
            } else {
                this.defaultLauncher.hideBadgeCount();
            }
        }
        this.previousUnreadCount = i;
    }

    @Override // io.intercom.android.sdk.overlay.DefaultLauncher.Listener
    public void onLauncherClicked(Context context) {
        this.openBehaviour.openMessenger(context);
    }

    private int getDefaultPadding(Resources resources) {
        return resources.getDimensionPixelSize(R.dimen.intercom_launcher_padding_bottom) + resources.getDimensionPixelSize(R.dimen.intercom_bottom_padding);
    }

    public void setBottomPadding(int i) {
        this.bottomPadding = getDefaultPadding(this.inflater.getContext().getResources()) + i;
        if (isDisplaying()) {
            this.defaultLauncher.updateBottomPadding(this.bottomPadding);
        }
    }
}
