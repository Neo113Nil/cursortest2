package com.smaato.sdk.ng.interstitial;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.smaato.sdk.ng.CustomEndCardListener;
import com.smaato.sdk.ng.VideoListener;
import com.smaato.sdk.ng.interstitial.presenter.InterstitialPresenter;
import com.smaato.sdk.ng.utils.NGSDKLocalBroadcastManager;
import java.util.Random;

/* loaded from: classes11.dex */
public class NextGenInterstitialBroadcastReceiver extends BroadcastReceiver {
    public static final String BROADCAST_ID = "pn_broadcastId";
    public static final String VIDEO_PROGRESS = "pn_video_progress";
    private final long a;
    private final NGSDKLocalBroadcastManager b;
    private final IntentFilter c;
    private boolean d;
    private Listener e;

    public enum Action {
        SHOW("com.smaato.sdk.ng.interstitial.show"),
        CLICK("com.smaato.sdk.ng.interstitial.click"),
        PLAYABLE_SKIP_CLICK("com.smaato.sdk.ng.interstitial.playable.click"),
        DISMISS("com.smaato.sdk.ng.interstitial.dismiss"),
        ERROR("com.smaato.sdk.ng.interstitial.error"),
        VIDEO_ERROR("com.smaato.sdk.ng.interstitial.video_error"),
        VIDEO_START("com.smaato.sdk.ng.interstitial.video_start"),
        VIDEO_SKIP("com.smaato.sdk.ng.interstitial.video_skip"),
        VIDEO_DISMISS("com.smaato.sdk.ng.interstitial.video_dismiss"),
        VIDEO_FINISH("com.smaato.sdk.ng.interstitial.video_finish"),
        CUSTOM_END_CARD_SHOW("com.smaato.sdk.ng.interstitial.custom_end_card_show"),
        CUSTOM_END_CARD_CLICK("com.smaato.sdk.ng.interstitial.custom_end_card_click"),
        DEFAULT_END_CARD_SHOW("com.smaato.sdk.ng.interstitial.default_end_card_show"),
        DEFAULT_END_CARD_CLICK("com.smaato.sdk.ng.interstitial.default_end_card_click"),
        END_CARD_LOAD_SUCCESS("com.smaato.sdk.ng.interstitial.end_card_load_success"),
        END_CARD_LOAD_FAILURE("com.smaato.sdk.ng.interstitial.end_card_load_failure"),
        NONE("none");

        private final String a;

        Action(String str) {
            this.a = str;
        }

        public static Action from(String str) {
            Action action = SHOW;
            if (action.getId().equals(str)) {
                return action;
            }
            Action action2 = CLICK;
            if (action2.getId().equals(str)) {
                return action2;
            }
            Action action3 = DISMISS;
            if (action3.getId().equals(str)) {
                return action3;
            }
            Action action4 = ERROR;
            if (action4.getId().equals(str)) {
                return action4;
            }
            Action action5 = VIDEO_ERROR;
            if (action5.getId().equals(str)) {
                return action5;
            }
            Action action6 = VIDEO_START;
            if (action6.getId().equals(str)) {
                return action6;
            }
            Action action7 = VIDEO_SKIP;
            if (action7.getId().equals(str)) {
                return action7;
            }
            Action action8 = VIDEO_DISMISS;
            if (action8.getId().equals(str)) {
                return action8;
            }
            Action action9 = VIDEO_FINISH;
            if (action9.getId().equals(str)) {
                return action9;
            }
            Action action10 = CUSTOM_END_CARD_SHOW;
            if (action10.getId().equals(str)) {
                return action10;
            }
            Action action11 = CUSTOM_END_CARD_CLICK;
            if (action11.getId().equals(str)) {
                return action11;
            }
            Action action12 = DEFAULT_END_CARD_SHOW;
            if (action12.getId().equals(str)) {
                return action12;
            }
            Action action13 = DEFAULT_END_CARD_CLICK;
            if (action13.getId().equals(str)) {
                return action13;
            }
            Action action14 = END_CARD_LOAD_SUCCESS;
            if (action14.getId().equals(str)) {
                return action14;
            }
            Action action15 = END_CARD_LOAD_FAILURE;
            if (action15.getId().equals(str)) {
                return action15;
            }
            Action action16 = PLAYABLE_SKIP_CLICK;
            return action16.getId().equals(str) ? action16 : NONE;
        }

        public String getId() {
            return this.a;
        }
    }

    public interface Listener {
        void onReceivedAction(Action action, Bundle bundle);
    }

    public NextGenInterstitialBroadcastReceiver(Context context) {
        this(new Random().nextLong(), NGSDKLocalBroadcastManager.getInstance(context), new IntentFilter());
    }

    public void destroy() {
        this.b.unregisterReceiver(this);
        this.d = true;
    }

    public long getBroadcastId() {
        return this.a;
    }

    public void handleAction(Action action, Bundle bundle, InterstitialPresenter interstitialPresenter, InterstitialPresenter.Listener listener) {
        handleAction(action, bundle, interstitialPresenter, listener, null, null);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.d || this.e == null) {
            return;
        }
        if (this.a != intent.getLongExtra("pn_broadcastId", -1L)) {
            return;
        }
        this.e.onReceivedAction(Action.from(intent.getAction()), intent.getExtras());
    }

    public void register() {
        if (this.d) {
            return;
        }
        this.b.registerReceiver(this, this.c);
    }

    public void setListener(Listener listener) {
        this.e = listener;
    }

    NextGenInterstitialBroadcastReceiver(long j, NGSDKLocalBroadcastManager nGSDKLocalBroadcastManager, IntentFilter intentFilter) {
        this.a = j;
        this.b = nGSDKLocalBroadcastManager;
        this.c = intentFilter;
        intentFilter.addAction(Action.SHOW.getId());
        intentFilter.addAction(Action.CLICK.getId());
        intentFilter.addAction(Action.DISMISS.getId());
        intentFilter.addAction(Action.VIDEO_ERROR.getId());
        intentFilter.addAction(Action.VIDEO_START.getId());
        intentFilter.addAction(Action.VIDEO_SKIP.getId());
        intentFilter.addAction(Action.VIDEO_DISMISS.getId());
        intentFilter.addAction(Action.VIDEO_FINISH.getId());
        intentFilter.addAction(Action.CUSTOM_END_CARD_SHOW.getId());
        intentFilter.addAction(Action.CUSTOM_END_CARD_CLICK.getId());
        intentFilter.addAction(Action.DEFAULT_END_CARD_SHOW.getId());
        intentFilter.addAction(Action.DEFAULT_END_CARD_CLICK.getId());
        intentFilter.addAction(Action.END_CARD_LOAD_SUCCESS.getId());
        intentFilter.addAction(Action.END_CARD_LOAD_FAILURE.getId());
        intentFilter.addAction(Action.ERROR.getId());
        intentFilter.addAction(Action.PLAYABLE_SKIP_CLICK.getId());
    }

    public void handleAction(Action action, Bundle bundle, InterstitialPresenter interstitialPresenter, InterstitialPresenter.Listener listener, VideoListener videoListener, CustomEndCardListener customEndCardListener) {
        if (listener == null) {
            return;
        }
        switch (action) {
            case SHOW:
                listener.onInterstitialShown(interstitialPresenter);
                break;
            case CLICK:
                listener.onInterstitialClicked(interstitialPresenter);
                break;
            case PLAYABLE_SKIP_CLICK:
                if (customEndCardListener != null) {
                    customEndCardListener.onPlayableSkipButtonClicked();
                    break;
                }
                break;
            case DISMISS:
                listener.onInterstitialDismissed(interstitialPresenter);
                break;
            case ERROR:
                listener.onInterstitialError(interstitialPresenter);
                break;
            case VIDEO_ERROR:
                if (videoListener != null) {
                    if (bundle == null) {
                        videoListener.onVideoError(-1);
                        break;
                    } else {
                        videoListener.onVideoError(bundle.getInt("pn_video_progress", -1));
                        break;
                    }
                }
                break;
            case VIDEO_START:
                if (videoListener != null) {
                    videoListener.onVideoStarted();
                    break;
                }
                break;
            case VIDEO_SKIP:
                if (videoListener != null) {
                    videoListener.onVideoSkipped();
                    break;
                }
                break;
            case VIDEO_DISMISS:
                if (videoListener != null) {
                    if (bundle == null) {
                        videoListener.onVideoDismissed(-1);
                        break;
                    } else {
                        videoListener.onVideoDismissed(bundle.getInt("pn_video_progress", -1));
                        break;
                    }
                }
                break;
            case VIDEO_FINISH:
                if (videoListener != null) {
                    videoListener.onVideoFinished();
                    break;
                }
                break;
            case CUSTOM_END_CARD_SHOW:
                if (customEndCardListener != null) {
                    customEndCardListener.onCustomEndCardShow();
                    break;
                }
                break;
            case CUSTOM_END_CARD_CLICK:
                if (customEndCardListener != null) {
                    customEndCardListener.onCustomEndCardClick();
                    break;
                }
                break;
            case DEFAULT_END_CARD_SHOW:
                if (customEndCardListener != null) {
                    customEndCardListener.onDefaultEndCardShow();
                    break;
                }
                break;
            case DEFAULT_END_CARD_CLICK:
                if (customEndCardListener != null) {
                    customEndCardListener.onDefaultEndCardClick();
                    break;
                }
                break;
            case END_CARD_LOAD_SUCCESS:
                if (customEndCardListener != null) {
                    customEndCardListener.onEndCardLoadSuccess(bundle.getBoolean("is_custom_end_card", false));
                    break;
                }
                break;
            case END_CARD_LOAD_FAILURE:
                if (customEndCardListener != null) {
                    customEndCardListener.onEndCardLoadFailure(bundle.getBoolean("is_custom_end_card", false));
                    break;
                }
                break;
        }
    }
}
