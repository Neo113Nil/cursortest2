package com.sglib.easymobile.androidnative;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import com.unity3d.player.UnityPlayer;

/* loaded from: classes9.dex */
public final class RatingDialog {
    private static final String UNITY_CALLBACK = "OnAndroidRatingDialogCallback";
    private static final String UNITY_GAMEOBJECT = "MobileNativeRatingDialog";
    private AlertDialog alertDialog;
    private TextView contentTextView;
    private View dialogView;
    private Button negativeButton;
    private final Params params;
    private Button positiveButton;
    private RatingBar ratingBar;
    private State state;
    private int givenStars = 0;
    private DialogInterface.OnClickListener onButtonClickListener = new DialogInterface.OnClickListener() { // from class: com.sglib.easymobile.androidnative.RatingDialog.1
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = AnonymousClass3.$SwitchMap$com$sglib$easymobile$androidnative$RatingDialog$State[RatingDialog.this.state.ordinal()];
            if (i2 == 1) {
                if (i == -2) {
                    UnityPlayer.UnitySendMessage(RatingDialog.UNITY_GAMEOBJECT, RatingDialog.UNITY_CALLBACK, UserAction.REFUSE.getValue());
                    return;
                } else {
                    if (i == -1) {
                        UnityPlayer.UnitySendMessage(RatingDialog.UNITY_GAMEOBJECT, RatingDialog.UNITY_CALLBACK, UserAction.POSTPONE.getValue());
                        return;
                    }
                    return;
                }
            }
            if (i2 == 2) {
                if (i == -2) {
                    UnityPlayer.UnitySendMessage(RatingDialog.UNITY_GAMEOBJECT, RatingDialog.UNITY_CALLBACK, UserAction.POSTPONE.getValue());
                    return;
                } else {
                    if (i == -1) {
                        UnityPlayer.UnitySendMessage(RatingDialog.UNITY_GAMEOBJECT, RatingDialog.UNITY_CALLBACK, UserAction.FEEDBACK.getValue());
                        return;
                    }
                    return;
                }
            }
            if (i2 != 3) {
                return;
            }
            if (i == -2) {
                UnityPlayer.UnitySendMessage(RatingDialog.UNITY_GAMEOBJECT, RatingDialog.UNITY_CALLBACK, UserAction.POSTPONE.getValue());
            } else if (i == -1) {
                UnityPlayer.UnitySendMessage(RatingDialog.UNITY_GAMEOBJECT, RatingDialog.UNITY_CALLBACK, UserAction.RATE.getValue());
            }
        }
    };
    private RatingBar.OnRatingBarChangeListener onRatingBarChangeListener = new RatingBar.OnRatingBarChangeListener() { // from class: com.sglib.easymobile.androidnative.RatingDialog.2
        @Override // android.widget.RatingBar.OnRatingBarChangeListener
        public void onRatingChanged(RatingBar ratingBar, float f, boolean z) {
            int i = (int) f;
            if (i != RatingDialog.this.givenStars) {
                if (RatingDialog.this.negativeButton == null) {
                    RatingDialog ratingDialog = RatingDialog.this;
                    ratingDialog.negativeButton = ratingDialog.alertDialog.getButton(-2);
                }
                if (RatingDialog.this.positiveButton == null) {
                    RatingDialog ratingDialog2 = RatingDialog.this;
                    ratingDialog2.positiveButton = ratingDialog2.alertDialog.getButton(-1);
                }
                RatingDialog.this.givenStars = i;
                if (RatingDialog.this.givenStars < RatingDialog.this.params.minimumAcceptedStars) {
                    RatingDialog.this.state = State.LOW_RATING;
                    RatingDialog.this.contentTextView.setText(RatingDialog.this.params.lowRatingMessage);
                    RatingDialog.this.negativeButton.setText(RatingDialog.this.params.cancelButtonText);
                    RatingDialog.this.positiveButton.setText(RatingDialog.this.params.feedbackButtonText);
                    RatingDialog.this.contentTextView.invalidate();
                    RatingDialog.this.negativeButton.invalidate();
                    RatingDialog.this.positiveButton.invalidate();
                    return;
                }
                RatingDialog.this.state = State.HIGH_RATING;
                RatingDialog.this.contentTextView.setText(RatingDialog.this.params.highRatingMessage);
                RatingDialog.this.negativeButton.setText(RatingDialog.this.params.cancelButtonText);
                RatingDialog.this.positiveButton.setText(RatingDialog.this.params.rateButtonText);
                RatingDialog.this.contentTextView.invalidate();
                RatingDialog.this.negativeButton.invalidate();
                RatingDialog.this.positiveButton.invalidate();
            }
        }
    };

    private enum State {
        START,
        LOW_RATING,
        HIGH_RATING
    }

    public static class Params {
        public final Context context;
        public final LayoutInflater layoutInflater;
        public CharSequence title = "Rate This App";
        public CharSequence startMessage = "How would you rate this app?";
        public CharSequence lowRatingMessage = "That's bad. Would you like to give us some feedback instead?";
        public CharSequence highRatingMessage = "Awesome! Let's do it!";
        public CharSequence postponeButtonText = "Not Now";
        public CharSequence refuseButtonText = "Don't Ask Again";
        public CharSequence cancelButtonText = "Cancel";
        public CharSequence feedbackButtonText = "Send Feedback";
        public CharSequence rateButtonText = "Rate Now!";
        public int minimumAcceptedStars = 3;

        public Params(Context context) {
            this.context = context;
            this.layoutInflater = LayoutInflater.from(context);
        }
    }

    private enum UserAction {
        REFUSE("0"),
        POSTPONE("1"),
        FEEDBACK("2"),
        RATE("3");

        private final String value;

        UserAction(String str) {
            this.value = str;
        }

        public String getValue() {
            return this.value;
        }
    }

    protected RatingDialog(Params params) {
        this.params = params;
    }

    public static class Builder {
        private final Params P;

        public Builder(Context context) {
            this.P = new Params(context);
        }

        public Context getContext() {
            return this.P.context;
        }

        public Builder setTitle(CharSequence charSequence) {
            this.P.title = charSequence;
            return this;
        }

        public Builder setStartMessage(CharSequence charSequence) {
            this.P.startMessage = charSequence;
            return this;
        }

        public Builder setLowRatingMessage(CharSequence charSequence) {
            this.P.lowRatingMessage = charSequence;
            return this;
        }

        public Builder setHighRatingMessage(CharSequence charSequence) {
            this.P.highRatingMessage = charSequence;
            return this;
        }

        public Builder setPostPoneButtonText(CharSequence charSequence) {
            this.P.postponeButtonText = charSequence;
            return this;
        }

        public Builder setRefuseButtonText(CharSequence charSequence) {
            this.P.refuseButtonText = charSequence;
            return this;
        }

        public Builder setCancelButtonText(CharSequence charSequence) {
            this.P.cancelButtonText = charSequence;
            return this;
        }

        public Builder setFeedbackButtonText(CharSequence charSequence) {
            this.P.feedbackButtonText = charSequence;
            return this;
        }

        public Builder setRateButtonText(CharSequence charSequence) {
            this.P.rateButtonText = charSequence;
            return this;
        }

        public Builder setMinimumAcceptedStars(int i) {
            this.P.minimumAcceptedStars = i;
            return this;
        }

        public RatingDialog create() {
            RatingDialog ratingDialog = new RatingDialog(this.P);
            ratingDialog.build();
            return ratingDialog;
        }

        public RatingDialog show() {
            RatingDialog ratingDialog = new RatingDialog(this.P);
            ratingDialog.show();
            return ratingDialog;
        }
    }

    protected void build() {
        this.state = State.START;
        AlertDialog.Builder builder = new AlertDialog.Builder(this.params.context);
        View inflate = this.params.layoutInflater.inflate(R.layout.rating_dialog, (ViewGroup) null);
        this.dialogView = inflate;
        TextView textView = (TextView) inflate.findViewById(R.id.textView);
        this.contentTextView = textView;
        textView.setText(this.params.startMessage);
        RatingBar ratingBar = (RatingBar) this.dialogView.findViewById(R.id.ratingBar);
        this.ratingBar = ratingBar;
        ratingBar.setOnRatingBarChangeListener(this.onRatingBarChangeListener);
        this.alertDialog = builder.setTitle(this.params.title).setView(this.dialogView).setNegativeButton(this.params.refuseButtonText, this.onButtonClickListener).setPositiveButton(this.params.postponeButtonText, this.onButtonClickListener).setCancelable(false).create();
    }

    protected void show() {
        build();
        this.alertDialog.show();
    }

    /* renamed from: com.sglib.easymobile.androidnative.RatingDialog$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$sglib$easymobile$androidnative$RatingDialog$State;

        static {
            int[] iArr = new int[State.values().length];
            $SwitchMap$com$sglib$easymobile$androidnative$RatingDialog$State = iArr;
            try {
                iArr[State.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$sglib$easymobile$androidnative$RatingDialog$State[State.LOW_RATING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$sglib$easymobile$androidnative$RatingDialog$State[State.HIGH_RATING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }
}
