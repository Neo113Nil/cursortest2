package com.sglib.easymobile.androidnative;

import androidx.annotation.NonNull;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.review.ReviewManagerFactory;
import com.google.android.play.core.tasks.OnCompleteListener;
import com.google.android.play.core.tasks.Task;
import com.sglib.easymobile.androidnative.RatingDialog;
import com.unity3d.player.UnityPlayer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes15.dex */
public final class EMUtility {
    public static void RequestReview(final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, final String str9, final String str10) {
        UnityPlayer.currentActivity.runOnUiThread(new Runnable() { // from class: com.sglib.easymobile.androidnative.EMUtility.1
            @Override // java.lang.Runnable
            public void run() {
                new RatingDialog.Builder(UnityPlayer.currentActivity).setTitle(str).setStartMessage(str2).setLowRatingMessage(str3).setHighRatingMessage(str4).setPostPoneButtonText(str5).setRefuseButtonText(str6).setCancelButtonText(str7).setFeedbackButtonText(str8).setRateButtonText(str9).setMinimumAcceptedStars(Integer.parseInt(str10)).show();
            }
        });
    }

    public static void RequestStoreReview(final String str, final String str2) {
        final Runnable runnable = new Runnable() { // from class: com.sglib.easymobile.androidnative.EMUtility.2
            @Override // java.lang.Runnable
            public void run() {
                UnityPlayer.UnitySendMessage(str, str2, "0");
            }
        };
        final ReviewManager create = ReviewManagerFactory.create(UnityPlayer.currentActivity);
        create.requestReviewFlow().addOnCompleteListener(new OnCompleteListener<ReviewInfo>() { // from class: com.sglib.easymobile.androidnative.EMUtility.3
            public void onComplete(@NonNull Task<ReviewInfo> task) {
                if (task.isComplete()) {
                    Logger.getLogger("store_review").log(Level.INFO, "get review info completed");
                    create.launchReviewFlow(UnityPlayer.currentActivity, (ReviewInfo) task.getResult()).addOnCompleteListener(new OnCompleteListener<Void>() { // from class: com.sglib.easymobile.androidnative.EMUtility.3.1
                        public void onComplete(@NonNull Task<Void> task2) {
                            Logger.getLogger("store_review").log(Level.INFO, "review flow completed");
                            UnityPlayer.currentActivity.runOnUiThread(runnable);
                        }
                    });
                } else {
                    Logger.getLogger("store_review").log(Level.INFO, "get review info failed");
                    UnityPlayer.currentActivity.runOnUiThread(runnable);
                }
            }
        });
    }
}
