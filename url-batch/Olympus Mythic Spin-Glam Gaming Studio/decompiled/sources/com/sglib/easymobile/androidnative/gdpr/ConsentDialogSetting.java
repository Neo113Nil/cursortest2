package com.sglib.easymobile.androidnative.gdpr;

import android.app.Activity;
import com.sglib.easymobile.androidnative.R;

/* loaded from: classes15.dex */
public class ConsentDialogSetting {

    public static class Button {
        public static int getBottomPad() {
            return 30;
        }

        public static int getLeftPad() {
            return 10;
        }

        public static int getRightPad() {
            return 10;
        }

        public static int getTopPad() {
            return 30;
        }
    }

    public static class CustomTitle {
        public static int getBackgroundColor() {
            return -7829368;
        }

        public static int getGravity() {
            return 17;
        }

        public static int getTextSize() {
            return 36;
        }

        public static int getTextStyle() {
            return 1;
        }
    }

    public static class RootLayout {
        public static int getBottomPad() {
            return 10;
        }

        public static int getHeight() {
            return -2;
        }

        public static int getLeftPad() {
            return 20;
        }

        public static int getOrientation() {
            return 1;
        }

        public static int getRightPad() {
            return 20;
        }

        public static int getTopPad() {
            return 10;
        }

        public static int getWidth() {
            return -1;
        }
    }

    public static class ScrollView {
        public static int getHeight() {
            return -2;
        }

        public static int getWidth() {
            return -1;
        }
    }

    public static class TitleBar {
        public static int getHeight() {
            return -2;
        }

        public static int getWidth() {
            return -1;
        }
    }

    public static int getTheme(Activity activity) {
        return Utilities.isOnTablet(activity) ? R.style.Theme_ConsentDialogTablet : R.style.Theme_ConsentDialogPhone;
    }
}
